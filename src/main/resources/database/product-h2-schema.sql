create table account (
    username varchar(25) not null,
    password varchar(25)  not null,
    email varchar(80) not null,
    constraint pk_username primary key (username)
);

