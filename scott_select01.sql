SELECT * FROM emp;
-- emp 조회
SELECT empno, ename, DEPTNO -- SELECT projcetion
FROM emp;	-- TABLE 이름으로 조회

SELECT DISTINCT deptno
FROM emp;

SELECT Ename, SAL, SAL*12+comm, COMM
FROM EMP;

SELECT ENAME, SAL, SAL*12+comm AS annsal, comm
FROM EMP;

SELECT  * FROM Emp
ORDER BY SAL; -- 월급에 따라 정렬

SELECT  * FROM Emp
ORDER BY SAL DESC; -- 월급에 따라 내림차순으로 정렬

SELECT * FROM EMP
ORDER BY DEPTNO ASC, sal DESC; -- 1차 기준 deptno, 2차기준 sal 내림차순

SELECT  * FROM EMP
ORDER BY HIREDATE DESC; -- 입사기준 내림차순

SELECT * FROM EMP
WHERE DEPTNO = 30; -- 부서번호가 30인 사람들


SELECT * FROM DEPT
WHERE DEPTNO = 30; -- 부서번호가 30인 부서명

SELECT * FROM EMP
WHERE DEPTNO = 30
	AND JOB = 'SALESMAN'; -- 부서번호가 30인 부서에 'salesman'직급인 사원들 -- 문자열 작은 따옴표 사용

SELECT * FROM emp
WHERE deptno = 30
	OR job = 'SALESMAN'; -- 부서번호가 30인 부서 사람들과 직급이 'salesman'인 사람들
	
SELECT * FROM emp
WHERE deptno = 30
	OR job = 'CLERK'
ORDER BY DEPTNO ,ENAME;

SELECT  * FROM EMP
WHERE ENAME >= 'F';

SELECT * FROM EMP
WHERE JOB = 'MANAGER'
	OR JOB = 'SALESMAN'
	OR JOB = 'CLERK';

SELECT  * FROM EMP
WHERE JOB IN ('MANAGER','SALESMAN','CLERK');

SELECT * FROM EMP
WHERE SAL BETWEEN 2000 AND 3000;

SELECT * FROM EMP
WHERE COMM IS NULL;
