
# 用户表
CREATE TABLE `users`(
	uid INT(20) PRIMARY KEY AUTO_INCREMENT,   #用户id
	username VARCHAR(20) ,
	upassword  CHAR(50),
	ustatus	INT(5) DEFAULT 1    # 默认1是普通用户，设置0是管理员
)
SELECT	* FROM users
#insert into `users`(uid,username,upassword,ustatus) values (1001,'abthen','abthen@180',0)

# 主题表
CREATE TABLE `subject`(
	sid INT(20) PRIMARY KEY AUTO_INCREMENT,
	title VARCHAR(100),
	`type` INT(2) DEFAULT 1
)
SELECT * FROM SUBJECT

#insert into subject(sid,title,type) values(null,'abthen',default)
#INSERT INTO SUBJECT(sid,title,TYPE) VALUES(NULL,'abthen',DEFAULT)

# 选项表options：oid  content     o_sid
CREATE TABLE voptions(
	oid INT(10) PRIMARY KEY AUTO_INCREMENT,
	content VARCHAR(50),
	v_sid INT(20),
	FOREIGN KEY(v_sid) REFERENCES SUBJECT(sid)		
)

# 投票表vote：vid  v_sid(sid)  v_oid(oid)  v_uid(uid) (用户和选项的中间表)
CREATE TABLE vote(
	vid INT(10) PRIMARY KEY AUTO_INCREMENT,
	v_sid INT(20),
	v_oid INT(10),
	v_uid INT(20),
	FOREIGN KEY(v_sid) REFERENCES SUBJECT(sid),
	FOREIGN KEY(v_oid) REFERENCES voptions(oid),
	FOREIGN KEY(v_uid) REFERENCES users(uid)
)

SELECT * FROM vote






