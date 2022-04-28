select USERNAME, CREATED, DEFAULT_TABLESPACE as DEF, TEMPORARY_TABLESPACE as TEMP
from dba_users
order by USERNAME asc;

alter session set "_ORACLE_SCRIPT"=true;

DROP user AULA;

create user aula identified by aula
default tablespace users
temporary tablespace TEMP;

grant connect to aula;

grant resource to aula;