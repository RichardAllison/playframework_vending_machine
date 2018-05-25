# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table sale (
  id                            integer not null,
  time                          timestamp,
  item_id                       integer not null,
  item_price                    decimal(38),
  nickels_paid                  integer not null,
  dimes_paid                    integer not null,
  quarters_paid                 integer not null,
  dollars_paid                  integer not null,
  complete                      integer(1) default 0 not null,
  constraint pk_sale primary key (id)
);

create table vending_item (
  id                            integer not null,
  name                          varchar(255),
  price                         decimal(38),
  quantity                      integer not null,
  vending_machine_id            integer,
  constraint pk_vending_item primary key (id),
  foreign key (vending_machine_id) references vending_machine (id) on delete restrict on update restrict
);

create table vending_machine (
  id                            integer not null,
  pennies                       integer not null,
  nickels                       integer not null,
  dimes                         integer not null,
  quarters                      integer not null,
  dollars                       integer not null,
  constraint pk_vending_machine primary key (id)
);


# --- !Downs

drop table if exists sale;

drop table if exists vending_item;

drop table if exists vending_machine;

