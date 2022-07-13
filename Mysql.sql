SELECT COUNT(*) FROM employees WHERE PHONE_NUMBER LIKE "515%";

SELECT COUNT(*) FROM employees;

-- 각 직원들의 이름과 연봉, 평균연봉과의 차(평균연봉 - 연봉)를 조회 해 보세요
-- 최고 연봉자와 최저 연봉직원들의 이름은 조회해보세요.
-- 부서명이 IT 로 시작하는 직원들의 수 조회
-- Douglas Grant의 이메일을  dog@naver.com 으로 변경하기

SELECT * FROM departments;

SELECT * FROM employees;

SELECT FIRST_NAME, LAST_NAME, SALARY, SALARY-avg(SALARY) FROM employees;

SELECT * FROM employees WHERE SALARY = (SELECT MAX(SALARY) FROM employees);

SELECT * FROM employees WHERE SALARY = (SELECT MIN(SALARY) FROM employees);

SELECT COUNT(*) FROM employees WHERE DEPARTMENT_ID IN (60, 21, 230);

SELECT * FROM employees WHERE FIRST_NAME = "Douglas";

UPDATE employees SET EMAIL = "dog@naver.com" WHERE EMPLOYEE_ID = 199;

SELECT * FROM employees WHERE DEPARTMENT_ID = ( SELECT DEPARTMENT_ID FROM employees WHERE FIRST_NAME = "Ellen") ORDER BY SALARY DESC;

SELECT * FROM employees WHERE SALARY >= (SELECT MAX(SALARY) FROM employees WHERE DEPARTMENT_ID IN (60, 21, 230)) ORDER BY SALARY DESC;

