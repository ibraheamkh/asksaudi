
--DROP TABLE users IF EXISTS;
--DROP TABLE authorities IF EXISTS;
--DROP TABLE user_authority

CREATE TABLE USERS (
  id         INTEGER PRIMARY KEY,
  username VARCHAR(30),
  email  VARCHAR(50),
  first_name VARCHAR(50),
  last_name VARCHAR(50),
  password VARCHAR(255)
);


CREATE TABLE AUTHORITIES (
	id INTEGER PRIMARY KEY,
	name VARCHAR(50)

);


CREATE TABLE USER_AUTHORITY (
	id         INTEGER PRIMARY KEY,
	user_id INTEGER,
	authority_id INTEGER

);




INSERT INTO USERS (id, username, password, first_name, last_name, email) VALUES (1, 'admin', '$2a$04$pnc4sJXTKKy9.FYhU4cJzugeRs0P/r0X8uKH2950ZVjhdr.OCk6KG', 'admin', 'admin', 'admin@admin.com');
INSERT INTO USERS (id, username, password, first_name, last_name, email) VALUES (2, 'user', '$2a$04$SYeqFCPBywqjQ0tMnle6XuMzxCVlyrap3c/IEA.34snhmAqWcaKpW', 'user', 'user', 'enabled@user.com');

INSERT INTO AUTHORITIES (id, name) VALUES (1, 'ROLE_USER');
INSERT INTO AUTHORITIES (id, name) VALUES (2, 'ROLE_ADMIN');

INSERT INTO USER_AUTHORITY (id, user_id, authority_id) VALUES (1,1, 1);
INSERT INTO USER_AUTHORITY (id, user_id, authority_id) VALUES (2,1, 2);
INSERT INTO USER_AUTHORITY (id, user_id, authority_id) VALUES (3,2, 1);

