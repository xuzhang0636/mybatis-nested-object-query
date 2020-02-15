-- Postgresql table
create table users(
  id serial primary key ,
  name varchar(50),
  email varchar(50)
);

create table accounts(
  id serial primary key ,
  accountName varchar(50),
  user_id int
);

create table role(
    id serial primary key ,
    role_name varchar(50)
);

create table user_role(
    id serial primary key ,
    user_id int,
    role_id int
);