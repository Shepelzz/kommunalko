create table USERS
(
	ID bigint not null
		primary key,
	LAST_NAME varchar(50),
	FIRST_NAME varchar(50)
)
go

create table HOME
(
	ID bigint identity
		primary key,
	USER_ID bigint,
	ADDRESS varchar(150)
)
go

create table BILL
(
	ID bigint identity
		primary key,
	HOME_ID bigint,
	DATE int
)
go

create table SERVICE
(
	ID bigint identity
		primary key,
	NAME varchar(50)
)
go

create table INVOICE
(
	ID bigint identity
		primary key,
	HOME_ID bigint,
	NUMBER varchar(20)
)
go

create table SERVICE_BY_INVOICE
(
	ID bigint identity
		primary key,
	SERVICE_ID bigint,
	INVOICE_ID bigint,
	BILL_ID bigint
)
go

create table PAYMENT
(
	ID bigint identity
		primary key,
	SERVICE_BY_INVOICE_ID bigint,
	VALUE float,
	TARIFF float,
	PAID bit default 0
)
go

create table COUNTER
(
	ID bigint identity
		primary key,
	NAME varchar(50),
	SERIAL_NUMBER varchar(20)
)
go

