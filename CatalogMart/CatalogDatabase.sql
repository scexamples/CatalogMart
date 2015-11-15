
create database Catalog;

use Catalog;

create table Category 
(CatId varchar(5),
 CatName varchar(10),
 Primary Key (CatId)
 );
 
 Insert into Category (CatId, CatName)
 values ('BKS','Books');
 
 Insert into Category (CatId, CatName)
 values ('MUS','Music');
 
 Insert into Category (CatId, CatName)
 values ('MOV','Movies');
 
 select * from Category;
 
 create table Product 
 (PId int,
  ProdName varchar(20),
  ProdDesc varchar(20),
  CatId varchar(5),
  primary key (PId),
  foreign key (CatId) references Category(CatId)
 );
 
 Insert into Product 
 values(1, 'Java', 'java book', 'BKS');
 
  Insert into Product 
 values(2, 'SQL', 'sql book', 'BKS');
 
  Insert into Product 
 values(3, 'Bhajans', 'bhajan CD', 'MUS');
 
  Insert into Product 
 values(4, 'Grammy', 'grammy sc', 'MUS');
 
  Insert into Product 
 values(5, 'Force Awakens', 'star wars movie', 'MOV');
 
  Insert into Product 
 values(6, 'Spectre', 'james bond', 'MOV');
 
 select * from product;

update product
set ProdDesc = 'grammy cd' where PId = 4;