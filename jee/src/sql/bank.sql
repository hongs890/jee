create table account(
	id varchar2(20),
	pw varchar2(20),
	account_no number,
	money number
	constraint bank_member_fk foreign key (id)
	references member(id) on delete cascade
);
select * from account;
drop table account;
