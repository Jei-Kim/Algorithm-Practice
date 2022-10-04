# chap08. SQL 응용

## SQL - DDL

- Data Define Language, 데이터 정의어
- DB를 구축하거나 수정할 목적으로 사용하는 언어이다.
- 번역한 결과가 데이터 사전이라는 특별한 파일에 여러 개의 테이블로 저장된다

* 종류
    - CREATE: SCHEMA, DOMAIN, TABLE, VIEW, INDEX를 정의함
    - ALTER: TABLE에 대한 정의를 변경하는 데 사용함
    - DROP: SCHEMA, DOMAIN, TABLE, VIEW, INDEX를 삭제함

* CREATE SCHEMA
    - CREATE SCHEMA 스키마명 AUTHORIZATION 사용자_id;
    - ex. 소유권자의 사용자 id가 '홍길동'인 스키마 '대학교'를 정의하는 SQL문
        => CREATE SCHEMA 대학교 AUTHORIZATION 홍길동;

* CREATE DOMAIN
    - CREATE DOMAIN 도메인명 [AS] 데이터_타입
            [DEFAULT 기본값]
            [CONSTRAINT 제약조건명 CHECK (범위값)];

    - 데이터 타입: SQL에서 지원하는 데이터 타입
    - 기본값: 데이터를 입력하지 않았을 때 자동으로 입력되는 값

    - ex. CREATE DOMAIN SEX CHAR(1)
            DEFAULT '여'
            CONSTRAINT VALID-SEX CHECK IN('남','여');

* CREATE TABLE
    - CREATE TABLE 테이블명
                    속성명 데이터_타입 [DEFAULT 기본값][NOT NULL], ...
                    [, PRIMARY KEY(기본키_속성명, ...)]
                    [, UNIQUE KEY(대체키_속성명, ...)]
                    [, FOREIGN KEY(외래키_속성명, ...)]
                            [REFERENCES 참조테이블(기본키_속성명, ...)] 
                            [ON DELETE 옵션] => 참조 테이블의 튜플이 삭제되었을 때 기본 테이블에 취해야 할 사항을 지정
                            [ON UPDATE 옵션] => 참조 테이블의 속성값이 변경되었을 때 기본 테이블에 취해야 할 사항을 지정
                    [, CONSTRAINT 제약조건명][CHECK (조건식)]; => 제약조건명 이름 지정, 제약 조건 지정

* CREATE VIEW
    - CREATE VIEW 뷰이름 (속성명, 속성명 ...)
        AS SELECT문

* CREATE INDEX
    - CREATE [UNIQUE] INDEX 인덱스명 => UNIQUE: 사용 시 중복 값이 없는 속성으로 인덱스 생성(없으면 허용)
        ON 테이블명(속성명 ASC/DESC) => 정렬여부 지정, 기본은 오름차순
        CLUSTER => 사용하면 클러스터드 인덱스로 설정됨

* ALTER TABLE
    - 테이블에 대한 정의 변경
    - ALTER TABLE 테이블명 ADD 속성명 데이터_타입 [DEFAULT '기본값'];
    - ALTER TABLE 테이블명 ALTER 속성명 [SET DEFAULT '기본값']; => 특정 속성의 기본값 변경 시에 사용
    - ALTER TABLE 테이블명 DROP COLUMN 속성명 [CASCADE]; => 특정 속성 삭제 시 사용
    
* DROP
    - 스키마, 도메인, 기본 테이블, 뷰 테이블, 인덱스, 제약 조건 등을 제거하는 명령문이다.
    - DROP (SCHEMA / DOMAIN / TABLE / VIEW / INDEX) 이름
    - DROP CONSTRAINT 제약조건명;
        - CASCADE: 제거할 요소를 참조하는 다른 모든 개체를 함께 제거한다.
        - RESTRICT: 다른 개체가 제거할 요소를 참조중일 때는 제거를 취소한다.

## SQL - DCL

- Data Control Language, 데이터 제어어
- DCL은 데이터의 보안, 무결성, 회복, 병행 제어 등을 정의하는 데 사용하는 언어이다.
- DBA가 데이터 관리를 목적으로 사용한다.

* 종류
    - COMMIT: 명령에 의해 수행된 결과를 실제 물리적 디스크로 저장하고, 데이터베이스 조작 작업이 정상적으로 완료되었음을 관리자에게 알려줌
    - ROLLBACK: 데이터베이스 조작 작업이 비정상적으로 종료되었을 때 원래의 상태로 복구함
    - GRANT: 데이터베이스 사용자에세 사용 권한을 부여함
    - REVOKE: 데이터베이스 사용자의 사용 권한을 축소함

* GRANT / REVOKE

    * 사용자등급 지정 및 해제
        - GRANT 사용자등급 TO 사용자_ID_리스트 [IDENTIFIED BY 암호]
            - ex. GRANT RESOURCE TO NABI;
            - ex. GRANT CONNECT TO STAR;

    * 테이블 및 속성에 대한 권한 부여 및 취소

        - GRANT 권한_리스트 ON 개체 TO 사용자 [WITH GRANT OPTION];
        - REVOKE [GRANT OPTION FOR] 권한_리스트 ON 개체 FROM 사용자 [CASCADE];
        
        - 권한 종류: ALL, SELECT, INSERT, DELETE, UPDATE, ALTER 등
        
        - WITH GRANT OPTION: 부여받은 권한을 다른 사용자에게 다시 부여할 수 있는 권한을 부여함
        - GRANT OPTION FOR: 다른 사용자에게 권한을 부여할 수 있는 권한을 취소함
        - CASCADE: 권한 취소 시 권한을 부여받았던 사용자가 다른 사용자에게 부여한 권한도 연쇄적으로 취소함

        * COMMIT
            - 트랜잭션이 수행한 내용을 데이터베이스에 반영하는 명령이다.
            - 커밋 명령을 실행하지 않아도 DML문이 성공적으로 완료되면 자동으로 커밋되고, 실패하면 롤백되도록 Auto Commit 기능을 설정할 수 있따.

        * ROLLBACK
            - 변경되었으나 아직 COMMIT되지 않은 모든 내용들을 취소하고 데이터베이스를 이전 상태로 되돌리는 명령이다.
        
        * SAVEPOINT
            - 트랜잭션 내에 ROLLBACK할 위치인 저장점을 지정하는 명령어이다.
            - 저장점을 지정할 때는 이름을 부여함
            - 롤백 시 지정된 저장점까지의 트랜잭션 처리 내용이 모두 취소됨


## SQL - DML

- Data Manipulation Language, 데이터 조작어
    - SELECT: 테이블에서 튜플을 검색함
    - INSERT: 테이블에 새로운 튜플을 삽입함
    - DELETE: 테이블에서 튜플을 삭제함
    - UPDATE: 테이블에서 튜플의 내용을 갱신함

* 삽입문(INSERT INTO~)

    - 일반 형식
        - INSERT INTO 테이블명([속성명1, 속성명2, ...])
            VALUES(데이터1, 데이터2)

* 삭제문(DELETE FROM~)

    - 일반 형식
        - DELETE FROM 테이블명 [WHERE 조건];

* 갱신문(UPDATE SET ~)

    - 일반 형식
            - UPDATE 테 이블명 SET 속성명 = 데이터[, 속성명=데이터, ...] [WHERE 조건];


## DML - SELECT1

* 일반 형식
    - SELECT PREDICATE: 검색할 튜플 수를 제한하는 명령어를 기술함

* 조건 연산자
    - 비교 연산자: =   <>   >   <   >=    <=
    - 논리 연산자: NOT, AND, OR
    - LIKE 연산자: %(모든 문자)    _(문자 하나)    #(숫자 하나)

* 기본 검색
    - SELECT 절에 원하는 속성을 지정하여 검색한다.(DISTINCT, AS)

* 조건 지정 검색
    - WHERE 절에 조건을 지정하여 조건에 만족하는 튜플만 검색한다.

* 정렬 검색
    - ORDER BY 

* 하위 질의
    - 조건절에 질의를 먼저 수행하여 그 검색 결과를 조건절의 피연산자로 사용한다.

* 복수 테이블 검색
    - 여러 테이블을 대상으로 검색을 수행(FROM 테이블1, 테이블2)

## DML - SELECT2

* 일반 형식
    - 그룹함수: GROUP BY절에 지정된 그룹별로 속성의 값을 집계할 함수를 기술함
    - WINDOW 함수: GROUP BY절을 이용하지 않고 속성의 값을 집계할 함수를 기술함
        - PARTITION BY: WINDOW 함수의 적용 범위가 될 속성을 지정함
        - ORDER BY: PARTITION 안에서 정렬 기준으로 사용할 속성을 지정함
    - GROUP BY절: 특정 속성을 기준으로 그룹화하여 검색할 때 사용한다. 일반적으로 GROUP BY절은 그룹 함수와 함께 사용됨
    - HAVING절: GROUP BY와 함께 사용되며, 그룹에 대한 조건을 지정함

* 그룹 함수

    - GROUP BY절에 지정된 그룹별로 속성의 값을 집계할 때 사용된다

    - COUNT(속성명): 그룹별 튜플 수를 구하는 함수
    - SUM(속성명): 그룹별 합계를 구하는 함수
    - AVG(속성명): 그룹별 평균을 구하는 함수
    - MAX(속성명): 그룹별 최대값을 구하는 함수
    - MIN(속성명): 그룹별 최소값을 구하는 함수
    - STDDEV(속성명): 그룹별 표준편차를 구하는 함수
    - VARIANCE(속성명): 그룹별 분산을 구하는 함수
    - ROLLUP(속성명, 속성명..): 인수로 주어진 속성을 대상으로 그룹별 소계를 구하는 함수
                                속성의 개수가 n개이면, n+1 레벨까지, 하위 레벨에서 상위 레벨 순으로 데이터가 집계됨
    - CUBE(속성명, 속성명, ...): rollup과 유사한 형태지만 cube는 인수로 주어진 속성을 대상으로 모든 조합의 그룹별 소계를 구함
                                속성의 개수가 n개이면 2의 n승 레벨까지, 상위 레벨에서 하위 레벨 순으로 데이터가 집계됨

* WINDOW 함수
    - group by절을 이용하지 않고 함수의 인수로 지정한 속성의 값을 집계한다.
    - 함수의 인수로 지정한 속성이 집계할 범위가 되는데, 이를 윈도우라고 부른다.

    - ROW_NUMBER(): 윈도우별로 각 레코드에 대한 일련번호를 반환한다.
    - RANK(): 윈도우별로 순위를 반환하며, 공동 순위를 반영한다.
    - DENSE_RANK(): 윈도우별로 순위를 반환하며, 공동 순위를 무시하고 순위를 부여한다.

* WINDOW 함수 이용 검색
    - ex. 상여금 테이블에서 상여내역별로 상여금에 대한 일련 번호를 구하시오.
            SELECT 상여내역, 상여금, ROW_NUMBER() OVER(PARTITION BY 상여내역 ORDER BY 상여금 DESC)AS NO FROM 상여금;

* 그룹 지정 검색
    - ex. 부서별 상여금의 평균, 부서별 튜플 수 등

* 집합 연산자를 이용한 통합 질의
    - UINION: 합집합, 두 select문의 조회 결과를 통합하여 모두 출력함(중복된 행은 한 번만 출력함)
    - UNION ALL: 합집합, 두 select문의 조회 결과를 통합하여 모두 출력함(중복된 행도 그대로 출력함)
    - INTERSECT: 교집합, 두 select문의 조회 결과 중 공통된 행만 출력함
    - EXCEPT: 차집합, 첫 번째 select문의 조회 결과에서 두 번째 select문의 조회 결과를 제외한 행을 출력함

## 프로시저(Procedure)



## 트리거(Trigger)



## 사용자 정의 함수



## 제어문



## 커서(Cursor)



## DBMS 접속



## SQL 테스트



## ORM(Object-Relational Mapping)




