# 패키지 이름을 지을때 
## com.callor : 여기까지는 보통 회사의 고유 이름입니다
### com.callor.student : 세번째 패키지는 프로젝트의 id 와 같으며 이 3단계 패키지를 base-package 라고 합니다

### 각 패키지들의 특성
* 이 특성들은 문법적인 규칙은 아니며 보편적으로 사용하는 이름짓기 이며   
회사마다 고유의 이름짓기가 있을 수 있습니다

#### 주요 패키지들 
1. com.callor.student.exec : student 프로젝트의 exec(실행, main) 클래스들의 모음   
java console 프로젝트에서 main() method가 있는 클래스들의 모음

2. com.callor.student.service : student 프로젝트의 Service 인터페이스, 클래스들의 모음
주로 MVC 프로젝트에서 Controller 와 DB 연동의 중간 계층 클래스들 모음이며 비즈니스 로직이라고도 함.

3. com.callor.student.controller : student 프로젝트의 주요 비즈니스로직(Service) 클래스들의 모음  
주로 MVC 프로젝트에서 사용자의 request를 제일먼저 수신하는 클래스들(Front Controller 라고도 함) 모음

* VO(Value Object), DTO(Data Transfer Object) 클래스들의 모음
4. com.callor.student.domain : student 프로젝트에서 사용하는 VO(DTO) 인터페이스, 클래스들의 모음
DB와 연동되는 부분에서 주로 사용되는 VO 클래스들

5. com.callor.student.command : student 프로젝트에서 사용하는 VO(DTO) 인터페이스, 클래스들의 모음
JSP의 Spring Form tag와 ModelAndAttribute 연동에 사용되는 클래스들

6. com.callor.student.model : student 프로젝트에서 사용하는 VO(DTO) 인터페이스, 클래스들의 모음

* Dao(Data Access Object) Data 를 저장, 읽기, 변경, 삭제 와 관련된 클래스들의 모음
7. com.callor.student.dao : student 프로젝트에서 사용하는 DB 연동(주로 JDBC) 인터페이스, 클래스의 모음
8. com.callor.student.mapper : student 프로젝트에서 사용하는 DB 연동(주로 MyBatis) 인터페이스의 모음
9. com.callor.student.persistence : student 프로젝트에서 사용하는 DB 연동(주로 JPA, Hibernate) 인터페이스, 클래스의 모음


