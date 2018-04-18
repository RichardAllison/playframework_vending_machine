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
  complete                      boolean default false not null,
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

create table vending_machine_vending_item (
  vending_machine_id            bigint not null,
  vending_item_id               bigint not null,
  constraint pk_vending_machine_vending_item primary key (vending_machine_id,vending_item_id)
);

alter table vending_machine_vending_item add constraint fk_vending_machine_vending_item_vending_machine foreign key (vending_machine_id) references vending_machine (id) on delete restrict on update restrict;
create index ix_vending_machine_vending_item_vending_machine on vending_machine_vending_item (vending_machine_id);

alter table vending_machine_vending_item add constraint fk_vending_machine_vending_item_vending_item foreign key (vending_item_id) references vending_item (id) on delete restrict on update restrict;
create index ix_vending_machine_vending_item_vending_item on vending_machine_vending_item (vending_item_id);


# --- !Downs

alter table if exists vending_machine_vending_item drop constraint if exists fk_vending_machine_vending_item_vending_machine;
drop index if exists ix_vending_machine_vending_item_vending_machine;

alter table if exists vending_machine_vending_item drop constraint if exists fk_vending_machine_vending_item_vending_item;
drop index if exists ix_vending_machine_vending_item_vending_item;

drop table if exists sale cascade;

drop table if exists transaction cascade;

drop table if exists vending_item cascade;

drop table if exists vending_machine cascade;

drop table if exists vending_machine_vending_item cascade;

