package com.hch.sys.controller;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.hch.controller.baseController.BaseController;
import com.hch.sys.entity.Role;
import com.hch.sys.service.ResourceService;
import com.hch.sys.service.RoleService;

/*
 * 角色控制层
 */
@Controller
@RequestMapping("/role")
public class RoleController extends BaseController {

	@Autowired
	private RoleService roleService;

	@Autowired
	private ResourceService resourceService;

	/*
	 * 加载role列表页面，需要有role:view权限 ;页面是通过超链接请求，超链接请求方式为get
	 */
	@RequiresPermissions("role:view")
	@RequestMapping(method = RequestMethod.GET)
	public String list(Model model) {
		model.addAttribute("roleList", roleService.findAll());
		return "role/list";
	}

	@RequiresPermissions("role:create")
	@RequestMapping(value = "/create", method = RequestMethod.GET)
	public String showCreateForm(Model model) {
		setCommonData(model);
		model.addAttribute("role", new Role());
		model.addAttribute("op", "新增");
		return "role/edit";
	}

	@RequiresPermissions("role:create")
	@RequestMapping(value = "/create", method = RequestMethod.POST)
	public String create(Role role, RedirectAttributes redirectAttributes) {
		roleService.insert(role);
		redirectAttributes.addFlashAttribute("msg", "新增成功");
		return "redirect:/role";
	}

	@RequiresPermissions("role:update")
	@RequestMapping(value = "/{id}/update", method = RequestMethod.GET)
	public String showUpdateForm(@PathVariable("id") String id, Model model) {
		setCommonData(model);
		model.addAttribute("role", roleService.get(id));
		model.addAttribute("op", "修改");
		return "role/edit";
	}

	@RequiresPermissions("role:update")
	@RequestMapping(value = "/{id}/update", method = RequestMethod.POST)
	public String update(Role role, RedirectAttributes redirectAttributes) {
		roleService.update(role);
		redirectAttributes.addFlashAttribute("msg", "修改成功");
		return "redirect:/role";
	}

	@RequiresPermissions("role:delete")
	@RequestMapping(value = "/{id}/delete", method = RequestMethod.GET)
	public String showDeleteForm(@PathVariable("id") String id, Model model) {
		setCommonData(model);
		model.addAttribute("role", roleService.get(id));
		model.addAttribute("op", "删除");
		return "role/edit";
	}

	@RequiresPermissions("role:delete")
	@RequestMapping(value = "/{id}/delete", method = RequestMethod.POST)
	public String delete(@PathVariable("id") String id, RedirectAttributes redirectAttributes) {
		roleService.deleteById(id);
		redirectAttributes.addFlashAttribute("msg", "删除成功");
		return "redirect:/role";
	}

	private void setCommonData(Model model) {
		model.addAttribute("resourceList", resourceService.findAll());
	}

}