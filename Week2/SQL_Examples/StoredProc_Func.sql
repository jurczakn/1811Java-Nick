create table test_table(
key text,
val integer
);

create or replace function new_stored_proc(inout ret_val bigint)
as $$
	begin
		select count(*) into ret_val from employee;
	end;
$$ language plpgsql;

do $$
declare
out_val bigint;
begin
	select new_stored_proc(out_val) into out_val;
	insert into test_table values('it worked', out_val);
end; $$
language plpgsql;

select * from test_table;

create or replace function get_emps(e_id int)
returns refcursor as $$
	declare
		curs refcursor;
	begin
		open curs for select lastname, firstname from employee 
		where empolyeeid < e_id;
		return curs;
	end; $$ 
	language plpgsql;
	
create or replace function change_employee(e_id int, fname varchar, lname varchar)
returns void as $$
begin
	update employee set firstname = fname, lastname = lname 
	where employeeid = e_id;
end; $$
language plpgsql;