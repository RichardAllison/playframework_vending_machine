# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table sale (
  id                            bigserial not null,
  time                          timestamptz,
  item_id                       integer not null,
  item_price                    float not null,
  nickels_paid                  integer not null,
  dimes_paid                    integer not null,
  quarters_paid                 integer not null,
  dollars_paid                  integer not null,
  amount_paid                   float not null,
  constraint pk_sale primary key (id)
);

create table transaction (
  id                            bigserial not null,
  time                          timestamptz,
  item_id                       integer not null,
  item_price                    float not null,
  nickels_paid                  integer not null,
  dimes_paid                    integer not null,
  quarters_paid                 integer not null,
  dollars_paid                  integer not null,
  amount_paid                   float not null,
  constraint pk_transaction primary key (id)
);

create table vending_item (
  id                            bigserial not null,
  name                          varchar(255),
  price                         float not null,
  quantity                      integer not null,
  constraint pk_vending_item primary key (id)
);

create table vending_machine (
  id                            bigserial not null,
  nickels                       integer not null,
  dimes                         integer not null,
  quarters                      integer not null,
  dollars                       integer not null,
  constraint pk_vending_machine primary key (id)
);


# --- !Downs

drop table if exists sale cascade;

drop table if exists transaction cascade;

drop table if exists vending_item cascade;

drop table if exists vending_machine cascade;

