create database Lamborghini;
use lamborghini

create table cars(S_No int,Name_Of_Car varchar (35), Top_Speed varchar (20),0_100kph Varchar (12),Power varchar (30), bhp_weight varchar (32),Displacement varchar (25),Weight varchar (25));

alter table cars add Price varchar (20);

insert into cars values (1,'Murcielago LP750 Edo','365 kph/ 227 mph','3.1 seconds','750 bhp / 551 kW','462 bhp per tonne','6.5 litre / 6496 cc','1625 kg / 3582 lbs','900 000 $');

insert into cars values(2,'Veneno Roadster','355 kph / 220 mph','2.9 seconds','750 bhp / 551 kW','503 bhp per tonne','6.5 litre / 6498 cc','1490 kg / 3285 lbs','5 000 000 $');

insert into cars values(3,'Centenario Coupe','350 kph / 217 mph','2.8 seconds','770 bhp / 566 kW','507 bhp per tonne','6.5 litre / 6498 cc','1520 kg / 3351 lbs','1 900 000 $');

insert into cars values(4,'Gallardo Dallas','376 kph / 233 mph','2.8 seconds','1220 bhp / 897 kW','797 bhp per tonne','5.2 litre / 5204 cc','1530 kg / 3373 lbs','680 000 $');

insert into cars values(5,'Huracan Mansory Torofeo','340 kph / 211 mph','2.7 seconds','1250 bhp / 919 kW','912 bhp per tonne','5.2 litre / 5204 cc','1370 kg / 3020 lbs','600 000 $');

insert into cars values(6,'Aventador LP700-4 Roadster ','350 kph / 217 mph','2.9 seconds','792 bhp / 582 kW','494 bhp per tonne','6.5 litre / 6498 cc','1605 kg / 3538 lbs','860 000 $');

insert into cars values(7,'Sesto Elemento','350 kph / 217 mph','2.5 seconds','570 bhp / 419 kW','571 bhp per tonne','5.2 litre / 5204 cc','999 kg / 2202 lbs','2 950 000 $');

insert into cars values(8,'Reventon Roadster','350 kph / 217 mph','3.4 seconds','670 bhp / 493 kW','396 bhp per tonne','6.5 litre / 6496 cc','1690 kg / 3726 lbs','1 600 000 $');

insert into cars values(9,'5-95 Zagato','325 kph / 202 mph','3.4 seconds','570 bhp / 419 kW','425 bhp per tonne','5.2 litre / 5204 cc','1340 kg / 2954 lbs','3 000 000 $');

insert into cars values(10,'Asterion LPI910-4','320 kph / 199 mph','3.0 seconds','910 bhp / 669 kW','650 bhp per tonne','5.2 litre / 5204 cc','1400 kg / 3086 lbs','3 000 000 $');

create table customer(Cust_Id varchar (20) primary key,Name varchar (50),Address varchar (50),Phone_No long ,Date_of_Purchase date,Car_Name varchar (65));

Alter table customer add city varchar (30);
Alter table customer add State varchar (30);
Alter table customer add gender char (1);
Alter Table Customer Add E_mail varchar (50);

create table login(User_ID varchar (8) primary key,Password varchar (10),User_Name varchar (30),Gender char (1),D_O_B date,Address varchar (40),Contact long );

insert into login values ('Thakur','1234','Pushpendra Thakur','M','1999-11-08','Dhar, Madhya Pradesh',9575443296);

