# AWS 정리

@(AWS)



## Contents

- AWS 보안 및 접근제어 관리 서비스 - IAM
- AWS의 관리형 서비스 및 데이터베이스 서비스 - RDS ,DynamoDB
- 확장성 있는 아키텍처 구축을 위한 AWS 서비스

### AWS 보안 및 접근제어 관리 서비스 - IAM

#### Ref
- [AWS 공식](http://docs.aws.amazon.com/ko_kr/IAM/latest/UserGuide/introduction.html)
- SlideShare
	- [20150109 - AWS BlackBelt - IAM (Korean)](https://www.slideshare.net/awskorea/20150109-aws-black-belt-iam-younjin?qid=d6b039fb-0dec-48f7-968c-4ccd6ad1c2dc&v=&b=&from_search=1)

Identity and Access Management 
증명 & 접근 관리

AWS를 안전하게 사용하기 위한 인증/허가 시스템

**계정별로 접근 권한을 제공**

사용자를 그룹화 해서 관리
- 100개의 그룹 생성 가능
- 

Healthhub에서 나의 IAM 확인. Root Account 관련 빼고는 다 접근할 수 있음

MFA(Multi Factor Authentication)

password 기반 로그인 / Programmatic 로그인 (API 등) 제공

Login 가능한 콘솔 URL 제공

### AWS RDS & DynamoDB

#### Ref
- [AWS 공식 문서](http://docs.aws.amazon.com/ko_kr/amazondynamodb/latest/developerguide/Introduction.html)
- [Amazon DynamoDB from slideshare](https://www.slideshare.net/awskorea/20131002-aws-meister-re-generate-dynamodb-korean?qid=5720abc0-8bc9-43d1-92c6-6f0d39faaf1f&v=&b=&from_search=1) 

#### DynamoDB

NoSQL as a Service

현재 Instance에 수동 설치해서 쓰는 것과 장, 단점 비교

**장점**
- 확장성
- 관리의 용이함
- 부하의 정도에 따라 요청을 조절하여 처리 (프로비저닝)

**단점**
- 요금
	- [요금표](https://aws.amazon.com/ko/dynamodb/pricing/)
- 학습 비용

### RDS

관리형 클라우드 DB 서비스

- RDB를 서비스로 제공한다는 것 외에  DynamoDB와 큰 차이점은 없는 것 같고, 우리는 MongoDB를 사용하므로 생략

### 확장성 있는 구축을 위한 AWS 서비스

- 오토 스케일링
- 엘라스틱 로드 밸런싱
- CloudWatch
- Trusted Advisor

#### Auto Scailing

[공식 문서](http://docs.aws.amazon.com/ko_kr/autoscaling/latest/userguide/WhatIsAutoScaling.html)


#### CloudWatch

[공식 문서](https://aws.amazon.com/ko/cloudwatch/)

AWS 클라우드 리소스와 AWS에서 실행되는 애플리케이션을 위한 모니터링 서비스

지표를 수집 및 추적
로그 파일을 수집 및 모니터링
경보 설정
AWS 리소스 변경시 자동 대응

효과 : 시스템 전반의 리소스 사용률, 애플리케이션 성능, 운영 상태 등을 파악 가능함


#### Trusted Advisor

[slide share](https://www.slideshare.net/awskorea/20141105-aws-black-belt-costexplorer-trustedadvisor-woosang?qid=7e8a153b-9cb0-4358-a64f-9a42285b85f7&v=&b=&from_search=1)
- 26p 부터

고객의 AWS 환경을 분석해서 권장사항을 제시하는 관리 도구
- 지금까지 다수의 고객에게 AWS 서비스를 제공하며 얻어진 best practice 활용

비용 최적화, 보안, 고가용성, 퍼포먼스 측면을 고려함

기능
- 대시보드
- 알람
- 접속 컨트롤
- AWS Support API 사용한 검사 결과

**현재 헬스허브의 AWS 상태 체크**

![Alt text](./1505897887328.png)

적색 경고 내용
1. 보안 그룹 - 특정 포트 제한 없음
- 보안 그룹에서 특정 포트에 대한 제한없는 액세스 (0.0.0.0/0)를 허용하는 규칙을 확인합니다. 95 개의 보안 그룹 규칙 중 22 개가 특정 포트에 대한 제한없는 액세스를 허용합니다.
	- 개발용으로 몇 개 인스턴스 열어놔서 그런 것임
2. 루트 계정의 MFA
- 루트 계정을 확인하고 다중 요소 인증 (MFA)이 활성화되지 않은 경우 경고합니다. 루트 계정에서 MFA가 활성화되어 있지 않습니다.
	- 계정 관리를 해보지 않아서 모르겠음. 확인해봐야 함
