INSERT INTO t_user(email,password,manager,createdTime) VALUES('root@weghst.com', md5('root'), 1, unix_timestamp() * 1000);