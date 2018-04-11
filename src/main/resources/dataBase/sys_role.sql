DROP TABLE
IF EXISTS sys_role;

CREATE TABLE
IF NOT EXISTS sys_role (
	id VARCHAR (40) NOT NULL PRIMARY KEY COMMENT 'id',
	role VARCHAR (20) COMMENT '��ɫ',
	description VARCHAR (20) COMMENT '��ɫ����',
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
) COMMENT '��ɫ��' ENGINE = INNODB DEFAULT CHARSET = utf8 COLLATE = utf8_bin;