-- table role data
insert into role(role_name) values ('admin');
insert into role(role_name) values ('user');
insert into role(role_name) values ('anonymous');

-- table user_role data
insert into user_role(user_id, role_id) values (1,1);
insert into user_role(user_id, role_id) values (1,2);
insert into user_role(user_id, role_id) values (1,3);

-- table users data
insert into users(name,email) values ('xuzhang','12342@qq.com');

-- table accounts data
insert into accounts(accountName, user_id) values('account1',1);