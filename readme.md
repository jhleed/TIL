# Today I Learned (TIL)

이전까지는 기술을 카테고리별로  정리하였으나 앞으로 이는 [블로그](http://jhleed.tistory.com/)에 남기기로 하고 [초보몽키님의 6개월간의 TIL 회고](https://wayhome25.github.io/til/2017/08/14/TIL-for-6-months/)를 참고하여 개발과 관련하여 학습한 내역을 일기 형식으로 적기로 하였습니다.  

---

### 17.08.25 (월)

#### MongoDB 

**Replication Set**
- 참고
	- https://unagi44.wordpress.com/2015/09/10/mongodb-replica-set%EC%9D%98-%ED%95%84%EC%9A%94%EC%84%B1-3/
- 왜 필요한지?

#### Spring Boot
Spring Boot와 JRebel 연동이 제대로 안되는 현상을 [해결](http://jhleed.tistory.com/96)하였다.

[IntelliJ에서 SpringBoot 웹 프로젝트 생성하기](http://blog.saltfactory.net/creating-springboot-project-in-intellij/). 
IntelliJ는 생성부터 기본적으로 필요한 플러그인 (롬복 등..)을 한번에 가져와준다. (갓텔리제이..)

Spring Boot의 생산성에 대해서 체험했다. 
기본적인 Bean 설정등을 전부 잡아주게 된다. 그리고 어느정도 설정을 해줘야 하는 속성들은 `application.property`에서 값만 넣어주면 자동으로 완성이 되다니 이 얼마나 쩌는 생산성인가!
게다가 `IntelliJ`와 같은 Idea를 쓰면 자동완성까지 지원해준다.

토이 프로젝트라던지, 외주를 처리할때는 스프링 부트를 쓰면 구현에 드는 시간이 확 줄어들 것 같다.
