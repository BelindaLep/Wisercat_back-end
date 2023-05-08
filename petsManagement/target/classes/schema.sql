create table pet
(
    id      LONG auto_increment,
    name    VARCHAR(255) NOT NULL,
    code    VARCHAR(255) NOT NULL,
    type varchar(255) NOT NULL,
    color   varchar(255) NOT NULL,
    origin  varchar(255) NOT NULL
);


insert into pet (name, code, type, color, origin)
values ('Muki', 1234567890, 'DOG', 'black', 'Estonia');