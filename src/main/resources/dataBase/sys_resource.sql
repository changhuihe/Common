DROP TABLE
IF EXISTS sys_resource;

CREATE TABLE
IF NOT EXISTS sys_resource (
	id VARCHAR (40) NOT NULL PRIMARY KEY COMMENT 'id',
	NAME VARCHAR (20) COMMENT '资源名称',
	type VARCHAR (20) COMMENT '资源类型',
	url VARCHAR (100) COMMENT '资源路径',
	permission VARCHAR (32) COMMENT '权限字符串',
	priority INT COMMENT '显示顺序',
	CODE VARCHAR (4) COMMENT '编号',
	parent_code VARCHAR (50) COMMENT '父编号',
	available TINYINT (1) NOT NULL DEFAULT 1 COMMENT '是否可用 1：可以，0：不可以',
	create_date date COMMENT '创建日期',
	creator_id VARCHAR (40) COMMENT '创建人Id',
	editor_date date COMMENT '修改日期',
	editor_id VARCHAR (40) COMMENT '修改人Id',
	delete_date date COMMENT '删除日期',
	delete_userId VARCHAR (40) COMMENT '删除人Id',
	check_date date COMMENT '审核日期',
	checker_id VARCHAR (40) COMMENT '审核人Id',
	deleted_flag INT NOT NULL DEFAULT 0 COMMENT '删除标志，0：未删除，1：删除，2：彻底删除',
	checked_flag TINYINT (1) NOT NULL DEFAULT 0 COMMENT '审核标志，1：审核，0：未审核'
) COMMENT '资源表' ENGINE = INNODB DEFAULT CHARSET = utf8 COLLATE = utf8_bin;