# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table vending_item (
  id                            bigserial not null,
  name                          varchar(255),
  price                         float not null,
  quantity                      integer not null,
  constraint pk_vending_item primary key (id)
);


# --- !Downs

drop table if exists vending_item cascade;

