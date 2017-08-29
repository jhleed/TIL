# Today I Learned (TIL)

이전까지는 기술을 카테고리별로  정리하였으나 앞으로 이는 [블로그](http://jhleed.tistory.com/)에 남기기로 하고 [초보몽키님의 6개월간의 TIL 회고](https://wayhome25.github.io/til/2017/08/14/TIL-for-6-months/)를 참고하여 개발과 관련하여 학습한 내역을 일기 형식으로 적기로 하였습니다.  

---
### 17.08.29 (화)
- 크리스티나 초도로우의 `MongoDB 완벽 가이드`라는 책을 참고하여 MongoDB Replication Set 을 공부하고 있습니다. 간단한 Example을 만드는것까지는 간단했는데 실제로 구상하려니까 고려사항이 많은 것 같습니다.
- 개발자커리어 Young Community 연합세미나 이력서 피드백을 정리하여 [블로그에 포스팅](http://jhleed.tistory.com/97)하고 페이스북에 공유했는데 생각했던 것보다 많은 분들(1000분)이 블로그를 방문해주셨습니다.  

---
### 17.08.28 (월)

[Polymer의 style 부분을 학습하고 정리하였습니다.](https://github.com/jhleed/study-polymer/tree/master/style)

개인적으로 사용하는 REST API 서버의 프레임워크를 spring에서 spring boot로 변경하였습니다.
별다른 충돌 없이 매끄럽게 변경되었습니다. git에서 ignoring하는 JRebel의 rebel.xml 부분만 조금 신경썼으면 완벽했을 것 같습니다.

대학을 졸업하고 첫 직장에서 개발을 처음 알려주신 [넷스루의 오재훈 개발이사님](https://www.facebook.com/jaehoon.oh.503)과 저녁을 먹었습니다.
테스트와 소프트웨어의 품질, 개발 문화에 대한 이야기를 나누었고 아주 재밌었습니다.

---
### 17.08.27 (일)

어제 개발자커리어 세미나를 다녀오고 나서 github, blog를 재정비해야 되겠다고 생각했습니다.

여기에는 선배 개발자 세션에서 오마이트립 CTO로 계신  [이규원](https://justhackem.wordpress.com/) 님의 영향이 컸습니다.

> 잘 관리된 깃허브와 블로그가 아니라면 이력서에 쓰지 마세요. 

스스로 블로그가 잘 정리되어있었는지 생각을 해보는 계기가 되었습니다. 

지금까지 딱히 남에게 보여주기 위한 글이라기보다는 제 생각을 정리하는 글이 많았기에 이력서를 검토하시는 분의 기준으로는 정성이 부족한 포스팅이 감점 요소일 것이라는 생각도 조금 들긴 합니다. 우려도 조금 되고요.

그러나 **결국 블로그는 이대로 내버려 두려고 합니다. 잘못된 정보가 아닌 한 누군가에게는 도움이 될 것이라는 생각**에서입니다.

---

### 17.08.26 (토)
[개발자커리어 Young Community 연합세미나](https://onoffmix.com/event/108861)에 참여하였습니다. 

- 초반 강의 대부분은 주로 대학생들, 혹은 1~2년 차를 대상으로 해서 크게 와닿는 부분은 없었습니다.
- 그렇지만 선배 개발자분들의 이력서 피드백이라든지 사회를 보시는 분의 피드백은 큰 도움이 되었다. 이력서를 수정하고 블로그를 재정비해야겠다는 생각이 들었습니다.

강의를 마치고 친구와 강남에서 열리는 IT인들의 치맥 파티에 갔습니다. 원래는 정보라든지 이런 것을 얻으려고 갔는데 그냥 치맥만 실컷 먹고 돌아왔습니다 (..)

---

### 17.08.25 (금)

#### MongoDB 
Replica set에 대한 개념을 알아보았습니다. [이곳](https://unagi44.wordpress.com/2015/09/10/mongodb-replica-set%EC%9D%98-%ED%95%84%EC%9A%94%EC%84%B1-3/)에 설명이 참 잘 되어 있었습니다.

#### Spring Boot
Spring Boot와 JRebel 연동이 제대로 안되는 현상을 [해결](http://jhleed.tistory.com/96)하였습니다.

[IntelliJ에서 Spring Boot를 생성하는 기능](http://blog.saltfactory.net/creating-springboot-project-in-intellij/)이 참 잘 되어 있다고 생각했습니다. 
생성부터 기본적으로 필요한 플러그인 (롬복 등..)을 한번에 가져와줍니다.

Spring Boot의 생산성을 직접 체험했습니다. 
게다가 `IntelliJ`와 같은 Idea를 쓰면 `application.property`에 자동완성까지 지원해줍니다.
토이 프로젝트라던지, 외주를 처리할때는 스프링 부트를 쓰면 **구현에 드는 시간이 확 줄어들 것 같습니다.**
