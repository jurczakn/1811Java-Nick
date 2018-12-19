insert into author (FIRSTNAME, LASTNAME, ABOUTBLURB)
  values ('J.K.', 'Rowling', 'One of the richest people in the world');
insert into author (id, firstname, lastname) values(56, 'Robert', 'Jordan');
insert into author (firstname, lastname) values('George', 'Martin');
insert into author (firstname, lastname) values('Steven', 'Brust');

insert into book(title, isbn10, isbn13, price, stock) 
  values('A Game of Thrones'
        ,'0553593714'
        ,'978-0553593716'
        ,8.79
        ,60);
insert into book (id, title,isbn10, isbn13, price, stock)
  values(1,'The Eye of the World','0812511816', '978-0812511819',8.69,500);
insert into book (id, isbn10, isbn13, title, price, stock)
  values(1,'0590353403','978-0590353403','Harry Potter and the Sorcerer''s Stone',19.82,50);
insert into book (isbn10, isbn13, title, price, stock)
  values('0439064872', '978-0439064873', 'Harry Potter and the Chamber of Secrets', 8.33, 30);
select id from author where firstname='J.K.' and lastname ='Rowling';
insert into book_author (AUTHOR_ID, Book_id) 
  values ((select id from author where firstname='J.K.' and lastname ='Rowling'),
  (select id from book where title='Harry Potter and the Sorcerer''s Stone'));
insert into book_author (AUTHOR_ID, Book_id) 
  values ((select id from author where firstname='J.K.' and lastname ='Rowling'),
  (select id from book where title='Harry Potter and the Chamber of Secrets'));
insert into book_author (AUTHOR_ID, Book_id) 
  values ((select id from author where firstname='George' and lastname ='Martin'),
  (select id from book where title='A Game of Thrones'));
insert into book_author (AUTHOR_ID, Book_id) 
  values ((select id from author where firstname='Robert' and lastname ='Jordan'),
  (select id from book where title='The Eye of the World'));
  
update book set stock=499 where id = 2;

update book set id = 6 where id = 3;

insert into genre (genre) values('Fantasy');
insert into genre (genre) values('Non-Fiction');
insert into genre (genre) values('Fiction');
insert into genre (genre) values('Sci-Fi');
insert into genre (genre) values('Historical Romance');

insert into book_genre (book_id, genre_id)
  values((select id from book where book.TITLE='A Game of Thrones'), (select id from genre where genre='Fantasy'));
insert into book_genre (book_id, genre_id)
  values((select id from book where book.TITLE='The Eye of the World'), (select id from genre where genre='Fantasy'));
insert into book_genre (book_id, genre_id)
  values((select id from book where book.TITLE='Harry Potter and the Sorcerer''s Stone'), (select id from genre where genre='Fantasy'));
insert into book_genre (book_id, genre_id)
  values((select id from book where book.TITLE='Harry Potter and the Chamber of Secrets'), (select id from genre where genre='Fantasy'));

insert into reading_list (book_id, cust_id)
  values((select id from book where book.TITLE='A Game of Thrones'), (select id from login where username='paulm'));
insert into reading_list (book_id, cust_id)
  values((select id from book where book.TITLE='Harry Potter and the Chamber of Secrets'), (select id from login where username='paulm'));
insert into taxrate(state,rate) values('AL',.04);
insert into taxrate(state,rate) values('AK',.00);
insert into taxrate(state,rate) values('AZ',.056);
insert into taxrate(state,rate) values('AR',.065);
insert into taxrate(state,rate) values('CA',.0725);
insert into taxrate(state,rate) values('CO',.029);
insert into taxrate(state,rate) values('CT',.0635);
insert into taxrate(state,rate) values('DE',.00);
insert into taxrate(state,rate) values('FL',.06);
insert into taxrate(state,rate) values('GA',.04);

insert into taxrate(state,rate) values('HI',.04);
insert into taxrate(state,rate) values('ID',.06);
insert into taxrate(state,rate) values('IL',.0625);
insert into taxrate(state,rate) values('IN',.07);
insert into taxrate(state,rate) values('IA',.06);
insert into taxrate(state,rate) values('KS',.065);
insert into taxrate(state,rate) values('KY',.06);
insert into taxrate(state,rate) values('LA',.05);
insert into taxrate(state,rate) values('ME',.055);
insert into taxrate(state,rate) values('MD',.06);

insert into taxrate(state,rate) values('MA',.0625);
insert into taxrate(state,rate) values('MI',.06);
insert into taxrate(state,rate) values('MN',.06875);
insert into taxrate(state,rate) values('MS',.07);
insert into taxrate(state,rate) values('MO',.04225);
insert into taxrate(state,rate) values('MT',.00);
insert into taxrate(state,rate) values('NE',.055);
insert into taxrate(state,rate) values('NV',.0685);
insert into taxrate(state,rate) values('NH',.00);
insert into taxrate(state,rate) values('NJ',.06875);

insert into taxrate(state,rate) values('NM',.05125);
insert into taxrate(state,rate) values('NY',.04);
insert into taxrate(state,rate) values('NC',.0475);
insert into taxrate(state,rate) values('ND',.05);
insert into taxrate(state,rate) values('OH',.0575);
insert into taxrate(state,rate) values('OK',.045);
insert into taxrate(state,rate) values('OR',.00);
insert into taxrate(state,rate) values('PA',.06);
insert into taxrate(state,rate) values('RI',.07);
insert into taxrate(state,rate) values('SC',.06);
insert into taxrate(state,rate) values('TN',.045);
insert into taxrate(state,rate) values('TX',.07);

insert into taxrate(state,rate) values('UT',.0595);
insert into taxrate(state,rate) values('VT',.06);
insert into taxrate(state,rate) values('VA',.053);
insert into taxrate(state,rate) values('WA',.065);
insert into taxrate(state,rate) values('WV',.076);
insert into taxrate(state,rate) values('WI',.05);
insert into taxrate(state,rate) values('WY',.04);
insert into taxrate(state,rate) values('GU',.04);
insert into taxrate(state,rate) values('PR',.115);
insert into taxrate(state,rate) values('VI',.00);
insert into taxrate(state,rate) values('DC',.0575);

insert into address(id, lineone,linetwo,city,state,zip)
  values(1,'11730 Plaza America Dr','Suite 205','Reston','VA',20170);
insert into address(id, lineone,linetwo,city,state,zip)
  values(1,'1 Fantasy Lane',null,'Detroit','MI',48127);
insert into address(lineone,linetwo,city,state,zip)
  values('42 Cardinal Dr',null,'St Louis','MO',63101);


--insert into customer(address_id) values(1);
insert into login(first_name,last_name,username, pswd)
  values('Paul','Maksimovich','paulm','pass');
insert into login(first_name,last_name,username, pswd)
  values('Richard','Orr','rorr','pass1');
insert into login(first_name,last_name,username, pswd)
  values('Matt','Pierzynski','pski','pwd');
  
insert into customer(id, address_id)
  values((select id from login where username='paulm'), 1);
insert into customer(id, address_id)
  values((select id from login where username='rorr'), 2);

insert into emp(id, sup_id, title)
  values((select id from login where username='pski'), null, 'CEO');
insert into emp(id, sup_id, title)
  values((select id from login where username='rorr'),
  (select id from login where username='pski'), 'Cashier');

select price from book where id = 3;
select * from taxrate where state='SC';
select calculateTax(3,1) from dual;
select calculateTax(3,2) from dual;

--find paul
select id, username, pswd, first_name, last_name from login where login.id =1;
--find his customer details
select username, pswd, first_name, last_name, address_id
  from customer join login on login.ID = customer.ID where login.id = 1;
--bring in his address
select username, pswd, first_name, last_name, lineone, linetwo, city, state, zip
  from 
    (select username, pswd, first_name, last_name, address_id
    from customer join login on login.ID = customer.ID where login.id = 1) u
  join
    address
  on address.ID= u.address_id;
--find Harry Potter's id
select id from book where title = 'Harry Potter and the Sorcerer''s Stone';
select id from book where title like 'Harry Potter%';
--Grab the total price of each book for Paul
select title, calculateTax(
      id,
      (select id from login where username = 'paulm')
    ) as "Total for Paul" from Book;
-- || concatenatess strings
select a.firstname||' '||a.lastname as "Author" from Author a;
--terrible concat method
select concat(concat(a.firstname,' '),a.lastname) as "Author"
  from author a;

--fun with joins
select a.firstname||' '||a.lastname as "Author", ba.book_id
  from Author a join BOOK_Author ba on ba.AUTHOR_ID = a.ID;
select "Author", title, price, stock from (select a.firstname||' '||a.lastname as "Author", ba.book_id
  from Author a join BOOK_Author ba on ba.AUTHOR_ID = a.ID) JOIN BOOK on book.id = book_id;
select "Author", title, calculateTax(BOOK.ID,(select id from login where username = 'paulm')) as "Price for Paul"
  from(select a.firstname||' '||a.lastname as "Author", ba.book_id
    from Author a join BOOK_Author ba on ba.AUTHOR_ID = a.ID)
  JOIN BOOK on book.id = book_id;

insert into purchase(customer_id, status) values((select id from login where username = 'paulm'),'OPEN');
--Enable console output for plsql
set serveroutput on;
--declare variables
declare
  curs sys_refcursor;
  purch number;
  book number;
  total number;
  quantity number;
  --begin the plsql
begin
  --call my procedure with my sysrefcursor
  ADD_BOOK_TO_CART(
    1,
    1,
    total,
    curs
    );
  loop
    FETCH curs into purch, book, quantity;
    exit when curs%NOTFOUND;
    dbms_output.put_line('['||purch||' | '||book||' | '||quantity);
  end loop;
end;
/
--exec empty_cart(1);

select * from purchase;
select * from book;
select * from auditbook;

commit;
