-- Create database and users

create database student;
create user 'db-student'@'%' identified by 'admin';
grant usage on student.* to 'db-student'@'%' identified by 'admin';
grant all privileges on student.* to 'db-student'@'%';
flush privileges;

-- Clear database and users (undoes the above actions)
drop database student;
drop user 'db-student'@'%';
