package com.hch.sys.controller;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.hch.sys.entity.Resource;
import com.hch.sys.service.ResourceService;

/*
 * 资源控制层
 */
@Controller
@RequestMapping("/resource")
public class ResourceController {

	@Autowired
	private ResourceService resourceService;

	@ModelAttribute("types")
	public Resource.ResourceType[] resourceTypes() {
		return Resource.ResourceType.values();
	}

	@RequiresPermissions("resource:view")
	@RequestMapping(method = RequestMethod.GET)
	public String list(Model model) {
		model.addAttribute("resourceList", resourceService.findAll());
		return "resource/list";
	}

	@RequiresPermissions("resource:create")
	@RequestMapping(value = "/{parentId}/appendChild", method = RequestMethod.GET)
	public String showAppendChildForm(@PathVariable("parentId") String parentId, Model model) {
		Resource parent = resourceService.get(parentId);
		model.addAttribute("parent", parent);
		Resource child = new Resource();
		//child.setParentId(parentId);
		model.addAttribute("resource", child);
		model.addAttribute("op", "新增子节点");
		return "resource/edit";
	}

	@RequiresPermissions("resource:create")
	@RequestMapping(value = "/{parentId}/appendChild", method = RequestMethod.POST)
	public String create(Resource resource, RedirectAttributes redirectAttributes) {
		resourceService.insert(resource);
		redirectAttributes.addFlashAttribute("msg", "新增子节点成功");
		return "redirect:/resource";
	}

	@RequiresPermissions("resource:update")
	@RequestMapping(value = "/{id}/update", method = RequestMethod.GET)
	public String showUpdateForm(@PathVariable("id") String id, Model model) {
		model.addAttribute("resource", resourceService.get(id));
		model.addAttribute("op", "修改");
		return "resource/edit";
	}

	/*
	 * 修改
	 */
	@RequiresPermissions("resource:update")
	@RequestMapping(value = "/{id}/update", method = RequestMethod.POST)
	public String update(Resource resource, RedirectAttributes redirectAttributes) {
		resourceService.update(resource);
		redirectAttributes.addFlashAttribute("msg", "修改成功");
		return "redirect:/resource";
	}

	/*
	 * 删除
	 */
	@RequiresPermissions("resource:delete")
	@RequestMapping(value = "/{id}/delete", method = RequestMethod.GET)
	public String delete(@PathVariable("id") String id, RedirectAttributes redirectAttributes) {
		resourceService.deleteById(id);
		redirectAttributes.addFlashAttribute("msg", "删除成功");
		return "redirect:/resource";
	}

}