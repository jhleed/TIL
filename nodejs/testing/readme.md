# NodeJs Testing

@(NodeJs)

`Mocha` 라이브러리를 많이 쓰는 것 같다.

여러가지 기능들이 지원되지만 현재 목적은 코딩 테스트이기 때문에 TDD 하는 방법 정도만 배워보자.

`Mocha`는 자체 assertion 기능을 지원하지 않는다. 
- assertion 하는 라이브러리르 require 하여 사용. 그래서 `chai`를 devDependency로 걸어놓았구나.

오.. `IntelliJ`에서는 mocha가 지원이 된다. 단, `NodeJS` 플러그인이 설치되어 있어야 하고 상용 버전이어야 한다. 

mocha에는 `TDD` style과 `BDD` style이 있는데 개념적인 차이 외에 어떤 기능적인 차이가 있는지 잘 모르겠다.
 
 
### 파일 이름

- 파일 이름을 filename-test.js 형태로 지으면 IDE에서 바로가기 기능이 지원되는 것 같다.
- 정확히 파일 이름을 어떻게 해야 하는지 알아보자.


### 버그

- IntelliJ에서 테스트를 하려고 하면 가끔씩 아래와 같은 버그가 뜬다. 껏다가 키면 제대로 동작할 때도 있고.. 이상하다.
- 역시 javascript라서 IDE에서 지원이 제대로 안 되는 건가..

```$xslt
suite('TDD Style', function() {
^

ReferenceError: suite is not defined
```

### Reference

- [Node.js 로 TDD 를 도전해보자](http://seokjun.kr/node-js-tdd/)
- [mocha : node.js 테스트 프레임워크, Outsider dev story](https://blog.outsider.ne.kr/770)
- [Unit Testing and TDD in Node.js – Part 1](https://www.codementor.io/davidtang/unit-testing-and-tdd-in-node-js-part-1-8t714s877)
- [Testing JavaScript with Mocha, IntelliJ](https://www.jetbrains.com/help/idea/testing-javascript-with-mocha.html)