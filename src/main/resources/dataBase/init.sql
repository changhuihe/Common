INSERT INTO `sys_resource` VALUES ('4b8eacab-3ebf-11e8-bc4c-00ff09529178', '管控中心', 'menu', '/management', 'management:*', 1, '0000', NULL, 1, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, 0, 1);
INSERT INTO `sys_resource` VALUES ('67825114-3ebf-11e8-bc4c-00ff09529178', '资源管理', 'menu', '/resource', 'resource:*', 1, '1000', '0000', 1, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, 0, 1);
INSERT INTO `sys_resource` VALUES ('6782a725-3ebf-11e8-bc4c-00ff09529178', '新增', 'button', NULL, 'resource:add', 1, '2000', '0000/1000', 1, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, 0, 1);
INSERT INTO `sys_resource` VALUES ('6782a841-3ebf-11e8-bc4c-00ff09529178', '删除', 'button', NULL, 'resource:delete', 2, '3000', '0000/1000', 1, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, 0, 1);
INSERT INTO `sys_resource` VALUES ('6782a8af-3ebf-11e8-bc4c-00ff09529178', '修改', 'button', NULL, 'resource:update', 3, '4000', '0000/1000', 1, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, 0, 1);
INSERT INTO `sys_resource` VALUES ('6782a90e-3ebf-11e8-bc4c-00ff09529178', '查看', 'button', NULL, 'resource:view', 4, '5000', '0000/1000', 1, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, 0, 1);


INSERT INTO `sys_role` VALUES ('a4339923-3ebf-11e8-bc4c-00ff09529178', 'superAdmin', '超级管理员', 1, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, 0, 1);
INSERT INTO `sys_role` VALUES ('a43ba53e-3ebf-11e8-bc4c-00ff09529178', 'admin', '管理员', 1, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, 0, 1);
INSERT INTO `sys_role` VALUES ('a43be5e7-3ebf-11e8-bc4c-00ff09529178', 'ordinaryUser', '普通用户', 1, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, 0, 1);
INSERT INTO `sys_role` VALUES ('a43be6ed-3ebf-11e8-bc4c-00ff09529178', 'visitor', '游客', 1, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, 0, 1);


INSERT INTO `sys_user` VALUES ('c425e596-3ebf-11e8-bc4c-00ff09529178', 'admin', '6fdc3104f9652957df0eec51ab23cd2b', NULL, NULL, NULL, NULL, 1, 0, '658f4a13e4f9643121e9555d54198993', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, 0, 0);


INSERT INTO `sys_roleresource` VALUES ('091dbf74-3ec0-11e8-bc4c-00ff09529178', 'a4339923-3ebf-11e8-bc4c-00ff09529178', '4b8eacab-3ebf-11e8-bc4c-00ff09529178');
INSERT INTO `sys_roleresource` VALUES ('091dc16c-3ec0-11e8-bc4c-00ff09529178', 'a4339923-3ebf-11e8-bc4c-00ff09529178', '67825114-3ebf-11e8-bc4c-00ff09529178');
INSERT INTO `sys_roleresource` VALUES ('091dc209-3ec0-11e8-bc4c-00ff09529178', 'a4339923-3ebf-11e8-bc4c-00ff09529178', '6782a725-3ebf-11e8-bc4c-00ff09529178');
INSERT INTO `sys_roleresource` VALUES ('091dc24e-3ec0-11e8-bc4c-00ff09529178', 'a4339923-3ebf-11e8-bc4c-00ff09529178', '6782a841-3ebf-11e8-bc4c-00ff09529178');
INSERT INTO `sys_roleresource` VALUES ('091dc28c-3ec0-11e8-bc4c-00ff09529178', 'a4339923-3ebf-11e8-bc4c-00ff09529178', '6782a8af-3ebf-11e8-bc4c-00ff09529178');
INSERT INTO `sys_roleresource` VALUES ('091dc375-3ec0-11e8-bc4c-00ff09529178', 'a4339923-3ebf-11e8-bc4c-00ff09529178', '6782a90e-3ebf-11e8-bc4c-00ff09529178');


INSERT INTO `sys_userrole` VALUES ('e627f8a1-3ebf-11e8-bc4c-00ff09529178', 'c425e596-3ebf-11e8-bc4c-00ff09529178', 'a4339923-3ebf-11e8-bc4c-00ff09529178');
INSERT INTO `sys_userrole` VALUES ('e6280035-3ebf-11e8-bc4c-00ff09529178', 'c425e596-3ebf-11e8-bc4c-00ff09529178', 'a43ba53e-3ebf-11e8-bc4c-00ff09529178');
