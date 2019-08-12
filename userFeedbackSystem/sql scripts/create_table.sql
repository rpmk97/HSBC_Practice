create table user_ratings(
user_id int generated always as identity(start with 1,increment by 1) primary key,
name varchar(25) not null,
rating int not null,
comment varchar(100),
rating_date date not null default current_date
);
