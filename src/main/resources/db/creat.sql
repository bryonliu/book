/* ����user ��*/
CREATE TABLE `bd_user` (
  `USER_ID` int(11) NOT NULL AUTO_INCREMENT COMMENT '�û�ID����',
  `USER_EMAIL` varchar(100) NOT NULL COMMENT '�û��ʼ�',
  `USER_NAME` varchar(20) DEFAULT NULL COMMENT '�û�����',
  `USER_LEVEL` int(11) DEFAULT NULL COMMENT '�û��ȼ�',
  `USER_PASSWORD` char(6) NOT NULL COMMENT '�û�����',
  `CREATE_TIME` datetime DEFAULT NULL COMMENT '����ʱ��',
  `LAST_UPDATE_TIME` datetime DEFAULT NULL COMMENT '������ʱ��',
  PRIMARY KEY (`USER_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;
commit;
/* ����book��*/
CREATE TABLE `bd_book` (
  `BOOK_ID` int(11) NOT NULL AUTO_INCREMENT COMMENT '���ID,����������',
  `BOOK_NAME` varchar(100) NOT NULL COMMENT '����',
  `AUTHOR` varchar(100) DEFAULT NULL COMMENT '���������',
  `BOOK_PRICE` int(11) DEFAULT NULL COMMENT '����ļ۸�',
  `BOOK_PRESS` varchar(100) DEFAULT NULL COMMENT '����ĳ�����',
  `PUBLISH_DATE` datetime DEFAULT NULL COMMENT '����ĳ���ʱ��',
  `BOOK_VERSION` int(11) DEFAULT NULL COMMENT '����İ汾',
  `CREAT_DATE` datetime DEFAULT NULL COMMENT '������ʱ��',
  `LAST_UPDATE_DATE` datetime DEFAULT NULL COMMENT '�����µ�ʱ��',
  PRIMARY KEY (`BOOK_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;
COMMIT;
/* user_book ��Ĵ���*/
CREATE TABLE `bd_user_book_ass` (
  `USER_BOOK_ID` int(11) NOT NULL AUTO_INCREMENT COMMENT 'USER_BOOK ������',
  `BOOK_ID` int(11) NOT NULL COMMENT 'BOOK ��Id',
  `USER_ID` int(11) NOT NULL COMMENT 'book ӵ���ߵ�ID',
  `IS_ONHAND` tinyint(1) DEFAULT NULL COMMENT '�����Ƿ���ӵ���ߵ�����',
  `IS_ANY_PERSON_WANTED` tinyint(1) DEFAULT NULL COMMENT '�����Ƿ�������Ҫ��',
  `CREATE_DATE` datetime DEFAULT NULL COMMENT '�ü�¼�Ĵ���ʱ��',
  `LAST_UPDATE_DATE` datetime DEFAULT NULL COMMENT '�ü�¼�����¸���ʱ��',
  PRIMARY KEY (`USER_BOOK_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
commit;