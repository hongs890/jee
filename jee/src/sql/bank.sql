create table bank(
	id varchar2(20) constraint bank_pk primary key,
	account_no number,
	money number,
	constraint bank_member_fk foreign key (id)
	references member(id) on delete cascade
);

select * from bank;
drop table bank;


-----------------------//
create view bank_member as
select
	b.account_no as account,
	b.money as money,
	m.id as id,
	m.pw as pw,
	m.name as name,
	m.reg_date as reg_date,
	m.ssn as ssn
from member m,bank b
where m.id = b.id;

select * from bank_member;