create table plant_details
(
plant_id varchar2(20) not null,plant_name varchar(30)not null,plant_description varchar(600),plant_price number(10),
category_id varchar2(20),constraint pk_plid primary key(plant_id),constraint pk_cateid primary key(category_id)
);

create table employees_details
(
employee_id varchar2(20) not null,first_name varchar2(20),last_name varchar2(20),email varchar2(20),phone number,hire_date date,
job_title varchar2(20),constraint pk_empid primary key(employee_id)
);

create table customers
(
customer_id varchar(20)not null,customer_name varchar2(20),address varchar2(50),moblie_no number(10),cust_email varchar2(20),credit_limit number(10),
constraint pk_custid primary key (customer_id)
); 

create table invoice
(
cart_id varchar2(20),customer_id varchar2(20),order_status varchar(20),salesman_id varchar2(20),order_date date,constraint pk_orid primary key(order_id),
constraint fk_custid foreign key(customer_id)references customers (customer_id)
);

create table cart
(
cart_id varchar2(20),plant_id varchar2(20),category_id varchar2(20),quantity number(10),plant_price number(10),
constraint fk_plantid foreign key(plant_id) references plant_details(plant_id), constraint fk_plantprice foreign key(plant_price)references plant_details(plant_price),
constraint fk_cateid foreign key(category_id) references plant_details(category_id)
);


create table supplier_details
(
supplier_id varchar2(20) primary key,supplier_name varchar2(30) not null,supplier_address varchar2(100),supplier_mobile_no number(10),supplier_email varchar2(20)
);



create table user_details(
name varchar2(30)not null,email_id varchar2(30),password varchar2(20),constraint pk_cusmail primary key(email_id)
);

rename customer_register to user_details;


select *from user_details;

alter table customer_register modify email_id not null;
alter table customer_register modify password not null;
--alter table customer_register modify email_id unique;
desc customer_register;
