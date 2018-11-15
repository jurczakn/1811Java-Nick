insert into employee (employeeid, firstname, lastname) values(10000000, 'David', 'Johnson');
select employeeid, firstname, lastname from employee where lastname = 'Johnson';
update employee set firstname = 'John' where lastname = 'Johnson' and firstname = 'David';
--delete employee; will remove all data from the table
delete from employee where employeeid = 10000000;
select * from artist;
select * from track;
select * from album where albumid = 1;
select * from artist where artistid = 1;
select * from album where artistid = 1;
select * from track where albumid in (1, 4);
select artistid from artist where name = 'AC/DC';

select * from track where albumid in
(select albumid from album where artistid = 
(select artistid from artist where name = 'AC/DC'));

--hi peeps--
select * from track where trackid in
(select distinct trackid from playlisttrack 
where playlistid in 
(select playlistid from playlisttrack where trackid in
(select trackid from track where albumid in
(select albumid from album where artistid = 
(select artistid from artist where name = 'AC/DC'))
) group by playlistid)) and trackid not in 
(select trackid from track where albumid in
(select albumid from album where artistid = 
(select artistid from artist where name = 'AC/DC'))
); 

select playlistid from playlisttrack where trackid in
(select trackid from track where albumid in
(select albumid from album where artistid = 
(select artistid from artist where name = 'AC/DC'))
) group by playlistid;

--acdc!--
select distinct trackid from playlisttrack 
where playlistid in 
(select playlistid from playlisttrack where trackid in
(select trackid from track where albumid in
(select albumid from album where artistid = 
(select artistid from artist where name = 'AC/DC'))
) group by playlistid);

create view acdc_songs as
select * from track where albumid in
(select albumid from album where artistid =
(select artistid from artist where name = 'AC/DC'));

select * from acdc_songs;

create view acdc_playlists as
select * from playlist where playlistid in
(select playlistid from playlisttrack where trackid in
(select trackid from acdc_songs));

create view acdc_playlist_tracks as
select * from track where trackid in
(select trackid from playlisttrack where playlistid in
(select playlistid from acdc_playlists));

select * from track where trackid not in 
(select trackid from acdc_songs) and
trackid in 
(select trackid from acdc_playlist_tracks);
