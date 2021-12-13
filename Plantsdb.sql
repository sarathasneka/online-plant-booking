create table plant_details(plant_id varchar2(20) not null,plant_name varchar(30)not null,plant_price number,plant_description varchar(600),plant_price number(10,2),
category_id varchar2(20),constraint pk_plid primary key(plant_id),constraint pk_cateid primary key(category_id));

create table employees(employee_id varchar2(20) not null,first_name varchar2(20),last_name varchar2(20),email varchar2(20),phone number,hire_date date,
job_title varchar2(20),constraint pk_empid primary key(employee_id));

create table customers( customer_id varchar(20)not null,customer_name varchar2(20),address varchar2(50),moblie_no number(10),cust_email varchar2(20),credit_limit number(10),
constraint pk_custid primary key (customer_id)); 

create table orders(order_id varchar2(20),customer_id varchar2(20),order_status varchar(20),salesman_id varchar2(20),order_date date,constraint pk_orid primary key(order_id),
constraint fk_custid foreign key(customer_id)references customers (customer_id));

create table order_items(order_id varchar2(20),item_id varchar2(20) primary key,category_id varchar2(20),plant_id varchar2(20),quantity number,unit_price number,
 constraint fk_orid foreign key(order_id) references orders(order_id),foreign key(plant_id)references plant_details(plant_id),foreign key(category_id) references plant_details(category_id));


create table suppliers(supplier_id varchar2(20) primary key,supplier_name varchar2(30) not null,supplier_address varchar2(100),supplier_mobile_no number(10),supplier_email varchar2(20));

create table login(user_name varchar2(20) not null,password varchar2(20) not null);
