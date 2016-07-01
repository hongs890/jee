select * from member;
create table member(
	
	id varchar2(20) primary key,
	pw varchar2(20),
	name varchar2(20),
	reg_date varchar2(20),
	ssn varchar2(10)	
);

insert into member(id,pw,name,reg_date,ssn)
values('lee','1','이순신','2016-07-01','800101-1');

select * from member;
drop table member;