DROP TABLE
IF EXISTS sys_resource;

CREATE TABLE
IF NOT EXISTS sys_resource (
	id VARCHAR (40) NOT NULL PRIMARY KEY COMMENT 'id',
	NAME VARCHAR (20) COMMENT '��Դ����',
	type VARCHAR (20) COMMENT '��Դ����',
	url VARCHAR (100) COMMENT '��Դ·��',
	permission VARCHAR (32) COMMENT 'Ȩ���ַ���',
	priority INT COMMENT '��ʾ˳��',
	CODE VARCHAR (4) COMMENT '���',
	parent_code VARCHAR (50) COMMENT '�����',
	available TINYINT (1) NOT NULL DEFAULT 1 COMMENT '�Ƿ���� 1�����ԣ�0��������',
	create_date date COMMENT '��������',
	creator_id VARCHAR (40) COMMENT '������Id',
	editor_date date COMMENT '�޸�����',
	editor_id VARCHAR (40) COMMENT '�޸���Id',
	delete_date date COMMENT 'ɾ������',
	delete_userId VARCHAR (40) COMMENT 'ɾ����Id',
	check_date date COMMENT '�������',
	checker_id VARCHAR (40) COMMENT '�����Id',
	deleted_flag INT NOT NULL DEFAULT 0 COMMENT 'ɾ����־��0��δɾ����1��ɾ����2������ɾ��',
	checked_flag TINYINT (1) NOT NULL DEFAULT 0 COMMENT '��˱�־��1����ˣ�0��δ���'
) COMMENT '��Դ��' ENGINE = INNODB DEFAULT CHARSET = utf8 COLLATE = utf8_bin;