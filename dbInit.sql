create schema rekapitulacija_eps;
-- seme su logicke celine koje obuhvataju tabele, view-ove, trigere, procedure, ...
-- , slicno kao paketi u javi -> slicno ali ne potpuno isto

-- u postgres-u postoji nesto sto se zove search_path
-- to nam govori na koju semu, ili seme gledaju nasi upiti
set search_path = rekapitulacija_eps; -- gledam samo na semu rekapitulacija_eps


create table mesto(
	id int primary key,
	naziv text
);

create table tarifni_sastav(
	id int primary key,
	nazivTS text,
	constraint nazivTS_check check(nazivTS in ('zeleni', 'plavi', 'crveni'))
);
-- constraint nazivTS_check check(nazivTS in ('zeleni', 'plavi', 'crveni'))
-- mozemo da dodamo ogranicenje iznad kolone -> i da se postaramo da vrednosti koje korisnik zeli da unese
-- pripadaju dozvoljenim vrednostima + baza to proverava za nas

insert into tarifni_sastav values (1, 'zeleni');
insert into tarifni_sastav values (2, 'plavi');
insert into tarifni_sastav values (3, 'crveni');

select * from tarifni_sastav ;

insert into tarifni_sastav values (4, 'crveniiiiii'); -- naruseno ogranicenje za kolonu tarifni_sastav
-- SQL Error [23514]: ERROR: new row for relation "tarifni_sastav" violates check constraint "nazivts_check"
--  Detail: Failing row contains (4, crveniiiiii).


create table cena_tarife(
	id int,				-- zeleni		// zeleni
	datum_tarife date,  -- 22.04.2024.  // 22.05.2024.
	cenaVT numeric not null,		-- 200.45		// 210.00
	cenaMT numeric not null,				-- 175.50		// 180.15
--	tip_tarife text,
--	constraint tip_tarife_check check(tip_tarife in ('visa', 'manja'))
	constraint cena_tarife_pk primary key(id, datum_tarife)
);

-- https://www.postgresqltutorial.com/postgresql-tutorial/postgresql-check-constraint/
-- vise o ogranicenjima na linku iznad

create table pretplatnik (
	id int primary key, -- u zdatku se ovo zoveEDBroj
	imePrezime text,
	adresa text,
	postanski_reon text,
	mesto_id int,
	tarifni_sastav_id int,
	constraint mesto_fk foreign key (mesto_id) references mesto(id),
	constraint tarifni_sastav_fk foreign key (tarifni_sastav_id) references tarifni_sastav(id)
);

create table potrosnja(
	pretplatnik_id int,
	datum_citanja date,
	datum_od date,
	datum_do date,
	novo_stanje_VT numeric,
	novo_stanje_MT numeric,
	fiksni_deo_kw numeric,
	cena_tarife_id int,
	cena_tarife_datum_tarife date,
	constraint potrosnja_pk primary key (pretplatnik_id, datum_od),
	constraint cena_tarife_fk foreign key (cena_tarife_id, cena_tarife_datum_tarife) references cena_tarife(id, datum_tarife)
);


-- opcije za id kao primary key
-- 1. auto increment -> u postgresu postoji poseban tip za ovo cudo -> tip = SERIAL
-- 2. da sam kreiras sequnce i da kazes da je ta sekvenca default vrednost za tvoj id int (ovo se zapravo desi kad kazes da je id auto_increment)
-- 3. da citas max(id) iz tabele i da ga povecas za 1

-- coalesce -> f-ja sa opcionim brojem parametara (kao var args u javi) vraca prvu vrednost od parametara koja nije null
select 	coalesce(max(id), 0) + 1
from 	test

create table test (
	id serial primary key
)

insert into test values(1)