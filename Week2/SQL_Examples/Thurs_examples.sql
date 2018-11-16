select * from employee;

insert into employee (employeeid, firstname, lastname)
values(2, 'Matt', 'K');

create sequence employee_id_seq start 10;

create or replace function insert_into_employee()
returns trigger as $$
begin
	if(TG_OP = 'INSERT') then
		new.employeeid = (select nextval('employee_id_seq'));
	end if;
	return new;
end;
$$ language plpgsql;

create trigger employee_insert
	before insert on employee
	for each row
	execute procedure insert_into_employee();
	
create or replace function my_sum(val_a bigint, val_b bigint)
returns integer as $$
begin
	return val_a + val_b;
end;
$$ language plpgsql;

select my_sum(5, 6);

create or replace function employeeCount()
returns integer as $$
declare
	total integer;
begin
	select count(employeeid) into total from employee;
	return total;
end;
$$ language plpgsql;

select employeeCount();