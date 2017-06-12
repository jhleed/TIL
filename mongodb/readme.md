# Query

## update

__다중 업데이트__

조건문이 여러 문서와 일치한다 하더라도 일반적인 쿼리로는 일치하는 문서들 중 제일 첫번째 문서만 업데이트 되게 된다. 

이를 해결하기 위해서는 다중 문서 갱신 옵션을 변경해야 한다. 파라미터의 4번째 자리에 위치한다. 

db.collection.update({조건문},{업데이트},false, __true__)

- https://docs.mongodb.com/v2.6/reference/method/db.collection.update/ (2.6)
