drop database if exists doan_dbms;
create database doan_dbms character set='utf8';
use doan_dbms;
/*Tao bang bang nhaptinhluongnhanvientinhluongnhanvien
	Ten dang nhap: admin
	mat khau: admin
*/
create table dangnhap(
	tendangnhap varchar(100) not null,
	matkhau varchar(100) not null
);
/*
	Tao bang Chuc vu
*/  
create table chucvu(
	ma_cv char(10) primary key,
	ten_cv varchar(100) not null,
	hesoluong int not null
);

/*Tao bang nhan vien*/

create table nhanvien(
	ma_nv char(10) primary key,
	ma_cv char(10),
	foreign key (ma_cv) references chucvu(ma_cv),
	ten_nv varchar(100) not null,
	ngaysinh date not null,
	sodt char (20) not null,
	diachi varchar(200)  
);

/*Tao table ca lam*/

create table calam(
	ma_calam INT NOT NULL AUTO_INCREMENT,
	ma_nv char(10),
	foreign key (ma_nv) references nhanvien(ma_nv),
	ngaylam date not null,
	buoi char(10) not null,
	ghichu varchar(200),
	primary key (ma_calam)
);

/*Them ten dang nhap va mat khau*/
insert into dangnhap value ('admin', 'admin');

/*Them chuc vu + he so luong*/
insert into chucvu  value('TN',  'Thu Ngân', 100000);
insert into chucvu  value('LC',  'Lao Công', 80000);
insert into chucvu  value('PV', 'Phục Vụ', 90000);
insert into chucvu  value('PC', 'Pha Chế', 110000);

insert into nhanvien value ('01', 'TN', 'Sơn Thươl', '2000-01-24', '0377087266', 'Sóc Trăng');
insert into nhanvien value ('02', 'PC', 'Nguyễn Ngọc Hoàng', '2020-02-12', '0377087266', 'Trà Vinh');
insert into nhanvien value ('03', 'PV', 'Đào Ngọc Mỹ', '2001-05-04', '0377087266', 'Hậu Giang');
insert into nhanvien value ('04', 'TN', 'Thạch Thị Kiều Oanh', '2000-02-25', '0377087266', 'Kiên Giang');
insert into nhanvien value ('05', 'TN', 'Kiêm Lâm Huyền Trân', '2000-07-22', '0377087266', 'Bạc Liêu');
insert into nhanvien value ('06', 'PC', 'Danh Thị Cẩm Tú', '2000-09-02', '0377087266', 'TP. Hồ Chí Minh');
insert into nhanvien value ('07', 'PV', 'Lý Chiến', '2000-11-22', '0377087266', 'Bình Dương');
insert into nhanvien value ('08', 'LC', 'Thạch Minh Pháp', '2000-09-25', '0377087266', 'Sóc Trăng');
insert into nhanvien value ('09', 'TN', 'Lý Hoàng Tuấn', '2000-09-25', '0377087266', 'Cà Mau');
insert into nhanvien value ('10', 'PC', 'Danh Thị Tú Trâm', '2000-09-25', '0377087266', 'Sóc Trăng');
insert into nhanvien value ('11', 'PV', 'Lê Trung Hiếu', '2000-09-25', '0377087266', 'Hậu Giang');
insert into nhanvien value ('12', 'LC', 'Nguyễn Thị Anh Thư', '2000-09-25', '0377087266', 'Bạc Liêu');
insert into nhanvien value ('13', 'TN', 'Trần Thúy Vy', '2000-09-25', '0377087266', 'Bạc Liêu');
insert into nhanvien value ('14', 'PC', 'Diệp Xuân Quang', '2000-09-25', '0377087266', 'Sóc Trăng');
insert into nhanvien value ('15', 'PV', 'Châu Thị Ta Na', '2000-09-25', '0377087266', 'Trà Vinh');
insert into nhanvien value ('16', 'LC', 'Thạch Thị Ngọc Dung', '2000-09-25', '0377087266', 'An Giang');

insert into calam value (null, '01', '2020-11-23','S','');
insert into calam value (null, '01', '2020-11-23','C','');
insert into calam value (null, '02', '2020-11-24','S','');
insert into calam value (null, '03', '2020-11-25','S','');
insert into calam value (null, '04', '2020-11-26','S','');
insert into calam value (null, '13', '2020-11-27','S','');
insert into calam value (null, '14', '2020-11-28','S','');
insert into calam value (null, '15', '2020-11-29','S','');
insert into calam value (null, '05', '2020-11-23','C','');
insert into calam value (null, '06', '2020-11-24','C','');
insert into calam value (null, '07', '2020-11-25','C','');
insert into calam value (null, '08', '2020-11-26','C','');
insert into calam value (null, '09', '2020-11-27','T','');
insert into calam value (null, '10', '2020-11-28','T','');
insert into calam value (null, '01', '2020-11-29','T','');
insert into calam value (null, '02', '2020-11-20','T','');
insert into calam value (null, '11', '2020-11-23','T','');
insert into calam value (null, '12', '2020-11-19','T','');
insert into calam value (null, '16', '2020-11-23','S','');
insert into calam value (null, '01', '2020-11-25','C','');
insert into calam value (null, '02', '2020-11-22','C','');
insert into calam value (null, '03', '2020-11-28','C','');
insert into calam value (null, '04', '2020-11-21','C','');
insert into calam value (null, '03', '2020-11-20','T','');
insert into calam value (null, '04', '2020-11-19','T','');
insert into calam value (null, '04', '2020-11-19','S','');
insert into calam value (null, '04', '2021-01-08','T','');
insert into calam value (null, '04', '2021-01-08','S','');
insert into calam value (null, '04', '2021-01-09','T','');
insert into calam value (null, '04', '2021-01-09','S','');


#.---------------------------->Hien thi thong tin ten dang nhap
DELIMITER $$

DROP PROCEDURE IF EXISTS `doan_dbms`.`hienthitendangnhap` $$
CREATE PROCEDURE `doan_dbms`.`hienthitendangnhap` 
   (IN user varchar(10), IN pass varchar(10))
BEGIN
	SELECT * FROM dangnhap
	WHERE tendangnhap = user AND matkhau = pass;
END $$

DELIMITER ;
#------------------>hien thi thong tin nhan vien
delimiter $$
drop procedure if exists `doan_dbms`.`hienthithongtinnhanvien` $$
create procedure `doan_dbms`.`hienthithongtinnhanvien`()
begin
	select  * from nhanvien;
end$$
delimiter ;

#call hienthithongtinnhanvien();
#-------------------------------------------------------------------Tìm thông tin sinh viên
delimiter $$
drop procedure if exists `doan_dbms`.`timthongtinnhanvien` $$
create procedure `doan_dbms`.`timthongtinnhanvien`(in dulieu varchar(20))
begin
	select * from nhanvien
	where (ma_nv like  concat('%',dulieu,'%')) or (ten_nv like  concat('%',dulieu,'%'));
end$$
delimiter ;

#call timthongtinnhanvien('S');

#-------------------->Thêm thông tn nhân vien
delimiter $$
drop procedure if exists `doan_dbms`.`themthongtinnhanvien` $$
create procedure `doan_dbms`.`themthongtinnhanvien`
(in manv varchar(20), in macv varchar(20), in tennv varchar(100), 
in ngaysinh date, in sodt varchar(20), in diachi text)
begin
	INSERT INTO nhanvien (ma_nv, ma_cv, ten_nv, ngaysinh, sodt, diachi)
	value (manv, macv,  tennv, ngaysinh, sodt, diachi);
end$$
delimiter ;

#call themthongtinnhanvien('19', 'TN', 'Trần Trung Ngọc', '2000-01-24', '0377087266', 'Sóc Trăng');
#------->chinh sua thong tin nhan vien <------------------------------
delimiter $$
drop procedure if exists `doan_dbms`.`sua_thongtinnhanvien` $$
create procedure `doan_dbms`.`sua_thongtinnhanvien`
(in manv varchar(20), in macv varchar(20), in tennv varchar(100), 
in ns date, in sdt varchar(20), in dc text)
begin
	update  nhanvien set  ma_cv = macv, ten_nv = tennv, ngaysinh = ns, sodt = sdt, diachi = dc
	where ma_nv = manv;
end$$
delimiter ;
#call sua_thongtinnhanvien('19', 'TN', 'Trần Trung Ngọc', '2000-01-24', '0377087266', 'Cần Thơ')
#-------------        xóa nhân viên -------------------------------

delimiter $$
drop procedure if exists `doan_dbms`.`xoa_nhanvien`$$
create procedure `doan_dbms`.`xoa_nhanvien`(in manv varchar(10))
begin
	delete from calam where ma_nv = manv;
	delete from nhanvien where ma_nv = manv;
end$$
delimiter ;

alter table MyOtherTable nocheck constraint all
delete from MyTable
alter table MyOtherTable check constraint all

#call xoa_nhanvien('21');
#--------------------------------------------->Sắp xếp Theo Tên------------------->
delimiter $$
drop procedure if exists `doan_dbms`.`tennv_sapxep` $$
create procedure `doan_dbms`.`tennv_sapxep`()
begin
	select *, substring_index(ten_nv, ' ',  -1) as lname 
	from nhanvien order by lname;
end$$
delimiter ;

#call tennv_sapxep();


#--------------------------------------------->Sắp xếp Theo Mã nhân viên------------------->
delimiter $$
drop procedure if exists `doan_dbms`.`manv_sapxep` $$
create procedure `doan_dbms`.`manv_sapxep`()
begin
	select * from nhanvien order by ma_nv;
end$$
delimiter ;

#call manv_sapxep();

#--------------------------------------------->Sắp xếp Theo Tên chuc vu nhan vien ------------------>
delimiter $$
drop procedure if exists `doan_dbms`.`chucvunv_sapxep` $$
create procedure `doan_dbms`.`chucvunv_sapxep`()
begin
	select * from nhanvien order by ma_cv;
end$$
delimiter ;

delimiter $$
drop procedure if exists `doan_dbms`.`kiemtratontainhanvien`$$
create procedure `doan_dbms`.`kiemtratontainhanvien`(in manv varchar(20))
begin
	select * from nhanvien where ma_nv = manv;
end$$
delimiter ;

#call kiemtratontainhanvien('01');
#call chucvunv_sapxep();
#------------------------------------------------ > Lọc thông tin nhân viên theo chức vụ
delimiter $$
drop procedure if exists `doan_dbms`.`loc_chucvu`$$
create procedure `doan_dbms`.`loc_chucvu`(in loc_cv varchar(20))
begin
	select * from nhanvien where ma_cv = loc_cv;
end$$
delimiter ;

#call loc_chucvu('TN');

#------------------------------ Thêm Ca Lam nhân viên ------------------------------
delimiter $$
drop procedure if exists `doan_dbms`.`themca_nv`$$
create procedure `doan_dbms`.`themca_nv`(in manv varchar(20), in nl date, in buoilam varchar(10), in gc text)
begin
		insert  into calam (ma_calam, ma_nv, ngaylam, buoi, ghichu)
		value (null, manv, nl, buoilam, gc);
end$$
delimiter ;

#call themca_nv('11', '2020-11-23','S','');

#-----------------------kiem tra nhan vien co trung hay khong -------------------------------
delimiter $$
drop procedure  if exists `doan_dbms`.`kt_nv_trung`$$
create procedure `doan_dbms`.`kt_nv_trung`(in manv varchar(10), in nl date,  in buoilam varchar(10))
begin
	select * from calam where ma_nv = manv and ngaylam = nl and buoi = buoilam;
end$$
delimiter ;

#call kt_nv_trung('03','2021-01-03','S');
#-----------------------Hien Thi Thong Tin CaLam-----------------------------------
delimiter $$
drop procedure if exists `doan_dbms`.`thongtin_calam`$$
create procedure `doan_dbms`.`thongtin_calam`()
begin
	select nv.ma_cv, nv.ten_nv, cl.ma_nv, cl.ngaylam, cl.buoi, cl.ghichu
	from nhanvien nv, calam cl where  nv.ma_nv = cl.ma_nv order by cl.ngaylam;
end$$
delimiter ;

#call thongtin_calam();

#------------------------------------Sửa ca làm cho nhân viên-------------------------------------
delimiter $$
drop procedure if exists `doan_dbms`.`edit_calam`$$
create procedure `doan_dbms`.`edit_calam`
(in macl varchar(10), in manv varchar(10),  in nl date, in buoilam varchar(10), in gc text)
begin
	update calam set ngaylam = nl , buoi = buoilam, ghichu = gc
	where ma_calam = macl and ma_nv =  manv;
end$$
delimiter ;

#call edit_calam('128','','2021-01-03', 'C', '');

#--------------------------------Kiểm tra ca làm ------------------------
delimiter $$
drop procedure if exists `doan_dbms`.`kiemtracalam` $$
create procedure `doan_dbms`.`kiemtracalam`(in manv varchar(10), in nl date, in buoilam varchar(10))
begin
	select * from calam
	where ma_nv = manv and ngaylam = nl and buoi = buoilam;
end$$
delimiter ;

delimiter $$
drop procedure if exists `doan_dbms`.`xoa_calam`$$
create procedure `doan_dbms`.`xoa_calam`(in macalam varchar(10))
begin
	delete from calam where ma_calam = macalam;
end$$
delimiter ;
#call kiemtracalam('01', '2020-12-16', 'C');
#-------------------------------------> Hien thi luong cua nhan vien sau khi da lam viẹc
delimiter $$
drop procedure if exists `doan_dbms`.`hienthiluong` $$
create procedure `doan_dbms`.`hienthiluong`()
begin 
	select soca.nv as 'manv', soca.ten as 'tennv', cv.ma_cv as 'cv',
				cv.hesoluong as 'dongia', soca.sc as 'soca', soca.sc*cv.hesoluong as 'luong'
	from chucvu cv, (select cl.ma_nv nv , nv.ma_cv cv, count(cl.ma_calam) sc, nv.ten_nv ten 
					from calam cl, nhanvien nv
					where cl.ma_nv = nv.ma_nv and cl.ngaylam < curdate()
					group by cl.ma_nv) soca
	where cv.ma_cv = soca.cv
	order by soca.nv;
end$$
delimiter ;

#call hienthiluong();
#-----------------------------Tinh Luong Nhan Vien ------------------------------------
delimiter $$
drop procedure if exists `doan_dbms`.`tinhluongnhanvien`$$
create procedure `doan_dbms`.`tinhluongnhanvien`(in tungay varchar(20), in denngay varchar(20))
begin
		select soca.nv as 'manv', soca.ten as 'tennv', cv.ma_cv as 'cv',
					cv.hesoluong as 'dongia', soca.sc as 'soca', soca.sc*cv.hesoluong as 'luong'
		from chucvu cv, (select cl.ma_nv nv , nv.ma_cv cv, count(cl.ma_calam) sc, nv.ten_nv ten 
						from calam cl, nhanvien nv
						where cl.ma_nv = nv.ma_nv and (cl.ngaylam between tungay and denngay)
						group by cl.ma_nv) soca
		where cv.ma_cv = soca.cv
		order by soca.nv;
end $$
delimiter ;

#call tinhluongnhanvien('2020-11-23', '2020-12-18')
delimiter $$
#______________________Tim Nhan Vien Trong Bang Luong___________________
drop procedure if exists `doan_dbms`.`timNVtrongBangLuong` $$
create procedure `doan_dbms`.`timNVtrongBangLuong`(in str varchar(30))
begin 
	select * from (select soca.nv as 'manv', soca.ten as 'tennv', cv.ma_cv as'cv', cv.hesoluong 
							as 'dongia', soca.sc as 'soca', soca.sc*cv.hesoluong as 'luong'
	from chucvu cv, (select cl.ma_nv nv , nv.ma_cv cv, COUNT(cl.ma_calam) sc, nv.ten_nv ten 
					from calam cl, nhanvien nv
					where cl.ma_nv = nv.ma_nv
					group by cl.ma_nv) soca
	where cv.ma_cv = soca.cv
	order by soca.nv ) find where  find.manv like  concat('%',str,'%') or find.tennv like concat('%',str,'%');
end$$
delimiter ;


#______________________Lọc Nhan Vien Trong Bang Luong___________________
delimiter $$
drop procedure if exists `doan_dbms`.`LocNVtrongBangLuong` $$
create procedure `doan_dbms`.`LocNVtrongBangLuong`(in chucvu varchar(30))
begin 
	select * from (select soca.nv as 'manv', soca.ten as 'tennv', cv.ma_cv as 'cv', cv.hesoluong 
							as 'dongia', soca.sc as 'soca', soca.sc*cv.hesoluong as 'luong'
	from chucvu cv, (select cl.ma_nv nv , nv.ma_cv cv, COUNT(cl.ma_calam) sc, nv.ten_nv ten 
					from calam cl, nhanvien nv
					where cl.ma_nv = nv.ma_nv
					group by cl.ma_nv) soca
					where cv.ma_cv = soca.cv
					order by soca.nv ) Loc
	where  Loc.cv = chucvu;
end$$
delimiter ;
#_______________________Sắp xếp lương nhân viên tăng dần________________
delimiter $$
drop procedure if exists `doan_dbms`.`sapxepluongtangdan` $$
create procedure `doan_dbms`.`sapxepluongtangdan`()
begin 
	select * from (select soca.nv as 'manv', soca.ten as 'tennv', cv.ma_cv as 'cv', cv.hesoluong 
							as 'dongia', soca.sc as 'soca', soca.sc*cv.hesoluong as 'luong'
	from chucvu cv, (select cl.ma_nv nv , nv.ma_cv cv, COUNT(cl.ma_calam) sc, nv.ten_nv ten 
					from calam cl, nhanvien nv
					where cl.ma_nv = nv.ma_nv
					group by cl.ma_nv) soca
					where cv.ma_cv = soca.cv
					order by soca.nv ) Loc
	order by luong asc;
end$$
delimiter ;
#call sapxepluongtangdan();
#_______________________Sắp xếp lương nhân viên giảm dần________________
delimiter $$
drop procedure if exists `doan_dbms`.`sapxepluonggiamdan` $$
create procedure `doan_dbms`.`sapxepluonggiamdan`()
begin 
	select * from (select soca.nv as 'manv', soca.ten as 'tennv', cv.ma_cv as 'cv', cv.hesoluong 
							as 'dongia', soca.sc as 'soca', soca.sc*cv.hesoluong as 'luong'
	from chucvu cv, (select cl.ma_nv nv , nv.ma_cv cv, COUNT(cl.ma_calam) sc, nv.ten_nv ten 
					from calam cl, nhanvien nv
					where cl.ma_nv = nv.ma_nv
					group by cl.ma_nv) soca
					where cv.ma_cv = soca.cv
					order by soca.nv ) Loc
	order by luong desc;
end$$
delimiter ;
#call sapxepluonggiamdan();
#____________________Hiển thị thông tin ca làm 
delimiter $$
drop procedure if exists `doan_dbms`.`hienthithongtincalam`$$
create procedure `doan_dbms`.`hienthithongtincalam`()
begin 
	select cl.ma_calam, nv.ma_cv, nv.ten_nv, cl.ma_nv, cl.ngaylam, cl.buoi, cl.ghichu
	from nhanvien nv, calam cl
	where nv.ma_nv = cl.ma_nv order by cl.ngaylam;
end$$
delimiter ;

#call hienthithongtincalam();