# Ödev 8

### test veritabanınızda employee isimli sütun bilgileri id(INTEGER), name VARCHAR(50), birthday DATE, email VARCHAR(100) olan bir tablo oluşturalım.

```
CREATE TABLE employee(
id INTEGER,
name VARCHAR(50),
birthday DATE,
email VARCHAR(100));
```

### Oluşturduğumuz employee tablosuna 'Mockaroo' servisini kullanarak 50 adet veri ekleyelim.

```
insert into employee (id, name, birthday, email) values (1, 'Avril', '1957-12-09', 'aricardet0@odnoklassniki.ru');
insert into employee (id, name, birthday, email) values (2, 'Christiana', '1966-06-12', 'csaylor1@indiatimes.com');
insert into employee (id, name, birthday, email) values (3, 'Vania', '1967-08-02', 'vbalnave2@pinterest.com');
insert into employee (id, name, birthday, email) values (4, 'Katusha', '1965-10-29', 'kperch3@independent.co.uk');
insert into employee (id, name, birthday, email) values (5, 'Tye', '1967-10-24', 'tbroszkiewicz4@wiley.com');
insert into employee (id, name, birthday, email) values (6, 'Gene', '1963-01-21', 'gcorradi5@sciencedaily.com');
insert into employee (id, name, birthday, email) values (7, 'Van', '1989-09-20', 'vrozea6@free.fr');
insert into employee (id, name, birthday, email) values (8, 'Ashlan', '1963-01-20', 'asneyd7@prlog.org');
insert into employee (id, name, birthday, email) values (9, 'Vivienne', '1966-03-28', 'vreiners8@vkontakte.ru');
insert into employee (id, name, birthday, email) values (10, 'Augustin', '1951-12-27', 'amcilhagga9@bravesites.com');
insert into employee (id, name, birthday, email) values (11, 'Gardie', '1965-07-25', 'gcolbruna@csmonitor.com');
insert into employee (id, name, birthday, email) values (12, 'Wainwright', '1980-11-06', 'wteazb@walmart.com');
insert into employee (id, name, birthday, email) values (13, 'Kristel', '1958-03-10', 'kchamleyc@ucsd.edu');
insert into employee (id, name, birthday, email) values (14, 'Aubine', '1978-02-02', 'amacgeffend@fc2.com');
insert into employee (id, name, birthday, email) values (15, 'Marleen', '1962-03-24', 'mhutchisone@boston.com');
insert into employee (id, name, birthday, email) values (16, 'Lorilee', '1956-09-05', 'lswordf@unblog.fr');
insert into employee (id, name, birthday, email) values (17, 'Patin', '1988-10-22', 'puphamg@epa.gov');
insert into employee (id, name, birthday, email) values (18, 'Kathrine', '1973-03-28', 'kolivellah@imageshack.us');
insert into employee (id, name, birthday, email) values (19, 'Logan', '1962-07-09', 'landreollii@cafepress.com');
insert into employee (id, name, birthday, email) values (20, 'Sharyl', '1985-04-12', 'snorburyj@geocities.jp');
insert into employee (id, name, birthday, email) values (21, 'Gabriel', '1995-03-14', 'galdrittk@addtoany.com');
insert into employee (id, name, birthday, email) values (22, 'Allistir', '1987-12-20', 'amcdarmidl@go.com');
insert into employee (id, name, birthday, email) values (23, 'Jacquenette', '1976-06-29', 'jkidstonem@google.it');
insert into employee (id, name, birthday, email) values (24, 'Jacklyn', '1981-07-05', 'jmcgilvran@google.co.jp');
insert into employee (id, name, birthday, email) values (25, 'Claudelle', '1983-08-11', 'cmatevushevo@amazonaws.com');
insert into employee (id, name, birthday, email) values (26, 'Haslett', '1954-04-20', 'hfleethamp@umn.edu');
insert into employee (id, name, birthday, email) values (27, 'Noreen', '1975-05-29', 'ngascarq@edublogs.org');
insert into employee (id, name, birthday, email) values (28, 'Martica', '1995-08-27', 'melbournr@fotki.com');
insert into employee (id, name, birthday, email) values (29, 'Devon', '1952-05-19', 'dhappss@hhs.gov');
insert into employee (id, name, birthday, email) values (30, 'Rubi', '1966-11-12', 'rvonderemptent@yahoo.com');
insert into employee (id, name, birthday, email) values (31, 'Cherish', '1967-08-12', 'cvasilievu@china.com.cn');
insert into employee (id, name, birthday, email) values (32, 'Yanaton', '1989-03-11', 'yschachv@npr.org');
insert into employee (id, name, birthday, email) values (33, 'Christabella', '1982-08-23', 'cbrahmw@hubpages.com');
insert into employee (id, name, birthday, email) values (34, 'Ruthann', '1996-08-24', 'rwantlingx@admin.ch');
insert into employee (id, name, birthday, email) values (35, 'Ema', '1988-05-06', 'ehuberty@bandcamp.com');
insert into employee (id, name, birthday, email) values (36, 'Tobe', '1955-09-10', 'tgrewerz@topsy.com');
insert into employee (id, name, birthday, email) values (37, 'Torrin', '1964-02-11', 'tlantaph10@accuweather.com');
insert into employee (id, name, birthday, email) values (38, 'Fiona', '1966-11-07', 'fbert11@cnet.com');
insert into employee (id, name, birthday, email) values (39, 'Aurlie', '1956-11-21', 'ascutchings12@e-recht24.de');
insert into employee (id, name, birthday, email) values (40, 'Garvey', '1971-04-24', 'ganstee13@reuters.com');
insert into employee (id, name, birthday, email) values (41, 'Karna', '1959-12-04', 'kscamp14@eventbrite.com');
insert into employee (id, name, birthday, email) values (42, 'Nikkie', '1950-06-24', 'ngiacobilio15@xrea.com');
insert into employee (id, name, birthday, email) values (43, 'Godwin', '1992-02-26', 'gburkinshaw16@state.gov');
insert into employee (id, name, birthday, email) values (44, 'Ursula', '1954-05-24', 'uyankin17@squarespace.com');
insert into employee (id, name, birthday, email) values (45, 'Elissa', '1974-01-01', 'eerasmus18@vimeo.com');
insert into employee (id, name, birthday, email) values (46, 'Reinwald', '1956-04-07', 'reddowes19@house.gov');
insert into employee (id, name, birthday, email) values (47, 'Sheppard', '1995-01-01', 'sgiovanni1a@cornell.edu');
insert into employee (id, name, birthday, email) values (48, 'Isaak', '1956-02-29', 'ishakelady1b@senate.gov');
insert into employee (id, name, birthday, email) values (49, 'Bertie', '1973-01-15', 'bbrandhardy1c@google.com.hk');
insert into employee (id, name, birthday, email) values (50, 'Jacqui', '1983-10-26', 'jthulborn1d@yandex.ru');
insert into employee (id, name, birthday, email) values (51, 'Debi', '1953-05-28', 'dingarfill1e@eventbrite.com');
insert into employee (id, name, birthday, email) values (52, 'Royal', '1992-01-27', 'rcossey1f@mysql.com');
insert into employee (id, name, birthday, email) values (53, 'Wayland', '1978-01-22', 'wskeates1g@squarespace.com');
insert into employee (id, name, birthday, email) values (54, 'Goraud', '1953-05-11', 'gatger1h@g.co');
insert into employee (id, name, birthday, email) values (55, 'Pippa', '1988-09-11', 'pcorrett1i@intel.com');
insert into employee (id, name, birthday, email) values (56, 'Opal', '1966-07-20', 'otebboth1j@ycombinator.com');
insert into employee (id, name, birthday, email) values (57, 'Cordelia', '1975-03-22', 'cellershaw1k@ow.ly');
insert into employee (id, name, birthday, email) values (58, 'Halsy', '1999-10-31', 'hkingscott1l@vinaora.com');
insert into employee (id, name, birthday, email) values (59, 'Rozina', '1968-06-27', 'rrothon1m@hibu.com');
insert into employee (id, name, birthday, email) values (60, 'Keary', '1986-09-24', 'kgulberg1n@fda.gov');
insert into employee (id, name, birthday, email) values (61, 'Val', '1983-09-27', 'vprettejohns1o@etsy.com');
insert into employee (id, name, birthday, email) values (62, 'Sonya', '1967-07-19', 'srobun1p@uiuc.edu');
insert into employee (id, name, birthday, email) values (63, 'Bobbette', '1969-06-24', 'bsealey1q@bbc.co.uk');
insert into employee (id, name, birthday, email) values (64, 'Catharina', '1957-01-22', 'chamlett1r@mail.ru');
insert into employee (id, name, birthday, email) values (65, 'Lilias', '1980-06-20', 'lwimlett1s@ehow.com');
insert into employee (id, name, birthday, email) values (66, 'Abbie', '1986-07-16', 'aeverleigh1t@patch.com');
insert into employee (id, name, birthday, email) values (67, 'Hazel', '1958-05-06', 'hgrimme1u@51.la');
insert into employee (id, name, birthday, email) values (68, 'Florian', '1993-11-15', 'fwisniewski1v@indiegogo.com');
insert into employee (id, name, birthday, email) values (69, 'Jo', '1996-03-18', 'jteligin1w@mayoclinic.com');
insert into employee (id, name, birthday, email) values (70, 'Curtice', '1997-08-22', 'cdinnies1x@facebook.com');
insert into employee (id, name, birthday, email) values (71, 'Gustie', '1966-01-21', 'gruberry1y@columbia.edu');
insert into employee (id, name, birthday, email) values (72, 'Cleveland', '1993-11-01', 'cbrugden1z@constantcontact.com');
insert into employee (id, name, birthday, email) values (73, 'Elton', '1991-05-02', 'eofearguise20@about.me');
insert into employee (id, name, birthday, email) values (74, 'John', '1991-01-21', 'jhodgets21@bbc.co.uk');
insert into employee (id, name, birthday, email) values (75, 'Winifred', '1991-03-09', 'weirwin22@scientificamerican.com');
insert into employee (id, name, birthday, email) values (76, 'Sheeree', '1971-12-29', 'santonsson23@msu.edu');
insert into employee (id, name, birthday, email) values (77, 'Devin', '1985-12-09', 'dmityukov24@weibo.com');
insert into employee (id, name, birthday, email) values (78, 'Mendie', '1995-07-06', 'mohederscoll25@yale.edu');
insert into employee (id, name, birthday, email) values (79, 'Caitrin', '1959-08-15', 'ccleaton26@blog.com');
insert into employee (id, name, birthday, email) values (80, 'Jorgan', '1975-01-20', 'jhalshaw27@diigo.com');
insert into employee (id, name, birthday, email) values (81, 'Brittney', '1991-06-24', 'blucey28@cdc.gov');
insert into employee (id, name, birthday, email) values (82, 'Taryn', '1987-06-25', 'tmichelle29@parallels.com');
insert into employee (id, name, birthday, email) values (83, 'Ruth', '1989-08-01', 'rsindell2a@army.mil');
insert into employee (id, name, birthday, email) values (84, 'Mariann', '1959-11-09', 'mjaye2b@vkontakte.ru');
insert into employee (id, name, birthday, email) values (85, 'Dwayne', '1951-05-04', 'dpeppin2c@friendfeed.com');
insert into employee (id, name, birthday, email) values (86, 'Aindrea', '1964-09-02', 'ahulk2d@bloglines.com');
insert into employee (id, name, birthday, email) values (87, 'Linell', '1964-10-30', 'lgiraldon2e@blogger.com');
insert into employee (id, name, birthday, email) values (88, 'Nichole', '1969-06-25', 'nmayne2f@apache.org');
insert into employee (id, name, birthday, email) values (89, 'Jacintha', '1986-03-13', 'jhawgood2g@upenn.edu');
insert into employee (id, name, birthday, email) values (90, 'Emmye', '1980-06-26', 'egillott2h@ning.com');
insert into employee (id, name, birthday, email) values (91, 'Dom', '1986-12-18', 'dbrumfield2i@earthlink.net');
insert into employee (id, name, birthday, email) values (92, 'Artie', '1995-11-05', 'aeirwin2j@samsung.com');
insert into employee (id, name, birthday, email) values (93, 'Heinrik', '1998-06-20', 'hveronique2k@google.com.hk');
insert into employee (id, name, birthday, email) values (94, 'Wolfy', '1958-01-07', 'wrooze2l@dropbox.com');
insert into employee (id, name, birthday, email) values (95, 'Collete', '1988-11-16', 'cdrexel2m@trellian.com');
insert into employee (id, name, birthday, email) values (96, 'Zarah', '1961-07-31', 'zcallery2n@typepad.com');
insert into employee (id, name, birthday, email) values (97, 'Sascha', '1994-10-27', 'ssiebart2o@ihg.com');
insert into employee (id, name, birthday, email) values (98, 'Danila', '1996-10-17', 'dfellon2p@blogs.com');
insert into employee (id, name, birthday, email) values (99, 'Horacio', '1989-04-27', 'hdod2q@npr.org');
insert into employee (id, name, birthday, email) values (100, 'Maitilde', '1973-08-08', 'msands2r@yolasite.com');
```

### Sütunların her birine göre diğer sütunları güncelleyecek 5 adet UPDATE işlemi yapalım.

```
UPDATE employee
SET name = 'Updated'
WHERE  name LIKE 'A%';
```

### Sütunların her birine göre ilgili satırı silecek 5 adet DELETE işlemi yapalım.

```
DELETE FROM employee
WHERE id BETWEEN 15 AND 25;
```
