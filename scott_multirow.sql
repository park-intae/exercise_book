SELECT SUM(SAL) FROM EMP;

CREATE TABLE DEPT_TCL
AS SELECT * FROM DEPT;

SELECT * FROM DEPT_TCL;

INSERT INTO DEPT_TCL VALUES(50, 'DATABASE', 'SEOUL');
UPDATE DEPT_TCL SET LOC = 'BUSAN' WHERE DEPTNO = 40;
DELETE FROM DEPT_TCL WHERE DNAME = 'RESEARCH';

ROLLBACK; -- 원래상태로 되돌리기

SELECT * FROM DEPT_TCL;

COMMIT;

DELETE FROM DEPT_TCL;
ROLLBACK;

DROP TABLE DEPT_TCL;
ROLLBACK;

CREATE TABLE EMP_DDL(
EMPNO NUMBER(4),
ENAME VARCHAR2(10),
JOB VARCHAR2(9),
MGR NUMBER(4),
HIREDATE DATE,
SAL NUMBER(7, 2),
COMM NUMBER(7, 2),
DEPTNO NUMBER(2)
);

SELECT * FROM EMP_DDL;

CREATE TABLE EMP_DDL_30
AS SELECT * FROM EMP
WHERE DEPTNO = 30;

SELECT * FROM EMP_DDL_30;

CREATE TABLE EMPDEPT_DDL
AS SELECT E.EMPNO, E.ENAME, E.JOB, E.MGR, E.HIREDATE,
E.SAL, E.COMM, D.DEPTNO, D.DNAME, D.LOC
FROM EMP E, DEPT D
WHERE 1 <> 1;

SELECT * FROM HR.EMPLOYEES;




