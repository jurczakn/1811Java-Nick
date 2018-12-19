/* User creation script for bookapp database */

/* I like to separate my scripts by use case
 * the following, therefore, is the dcl script for the
 * bookapp user in my database. This script would be run
 * on the SYSTEM or SYS user (or any user with the ability
 * to create new users) of your database, and will result in
 * the creation of a new user.
 */

-- Drop the user if it exists
drop user bookapp cascade;
/* drop can remove the "user" object from the system.
 * We are currently connected to the SYSTEM user,
 * so we have all of the permissions. This is dangerous,
 * so we should create a new user to grant only specific
 * permissions to.
*/

-- Create the user in the database
create user bookapp
-- With a password
identified by p4ssw0rd
-- in the users tablespace
default tablespace users
-- and some temporary space
temporary tablespace temp
-- with this size
quota 10m on users;

-- We want to connect to our db
grant connect to bookapp;
-- The ability to create types
grant resource to bookapp;
-- The ability to alter and destroy types
-- grant dba to bookapp;
-- We need to be able to create a session in order to do transactions
grant create session to bookapp;
-- Pretty self explanatory
grant create table to bookapp;
grant create view to bookapp;

-- Older versions of eclipse required you to explicitly grant the following
-- grant select, insert, update, delete to bookapp;
