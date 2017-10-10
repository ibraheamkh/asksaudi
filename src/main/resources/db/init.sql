
--DROP TABLE users IF EXISTS;
CREATE TABLE users (
  id         INTEGER PRIMARY KEY,
  username VARCHAR(30),
  email  VARCHAR(50),
  first_name VARCHAR(50),
  last_name VARCHAR(50),
  password VARCHAR(50)
);

--DROP TABLE authorities IF EXISTS;
CREATE TABLE authorories (
	id INTEGER PRIMARY KEY,
	name VARCHAR(50)

);

--DROP TABLE user_authority
CREATE TABLE user_authority (
	id         INTEGER PRIMARY KEY,
	user_id INTEGER,
	authority_id INTEGER

);



--noinspection SqlNoDataSourceInspectionForFile
INSERT INTO users (id, username, password, first_name, last_name, email) VALUES (1, 'admin', '$2a$06$VxdQXGrQVypeeMzfIQuhZeE5McIno8dI31skIh8NITpA6o2KKWZ9u', 'admin', 'admin', 'admin@admin.com');
INSERT INTO users (id, username, password, first_name, last_name, email) VALUES (2, 'user', '$2a$06$MwKKqcC42czaGZ0X8IK3lOqST1s2Rbqb/rt6oUFdwGs4A6JOGq/mG', 'user', 'user', 'enabled@user.com');

INSERT INTO authority (id, name) VALUES (1, 'ROLE_USER');
INSERT INTO authority (id, name) VALUES (2, 'ROLE_ADMIN');

INSERT INTO user_authority (user_id, authority_id) VALUES (1, 1);
INSERT INTO user_authority (user_id, authority_id) VALUES (1, 2);
INSERT INTO user_authority (user_id, authority_id) VALUES (2, 1);

