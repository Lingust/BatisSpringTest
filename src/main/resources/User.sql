create database springmvc;

use springmvc;

create table tuser(
  userid int primary key auto_increment,
  username varchar(10),
  password varchar(30)
);

insert into tuser values(1000,'admin','admin');