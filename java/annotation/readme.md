# Java Annotation 정리

@(Java)

### 어노테이션이란 무엇인가?

**위키백과**
> 자바 애너테이션(Java Annotation)은 자바 소스 코드에 추가하여 사용할 수 있는 메타데이터의 일종이다.

### 왜 사용하는 것인가?

소스 코드에 메타데이터를 표현할 수 있음

예를 들어, `reflection`을 이용한다면 어노테이션 지정만으로도 원하는 클래스를 주입 (DI) 하는 것이 가능함

**이 부분을 조금 더 공부해야겠는데..?**

### 어떻게 사용하는가?

기본적인 선언 방법

필드에 선언하고, refelction 을 통하여 어노테이션 체크 후 어노테이션에 맞는 처리 (DI 등)

```
public @interface MyAnnonation {}
```

메타 어노테이션 추가 선언

```
import java.lang.annotation.*;

@Inherited
@Documented
@Retention(RetentionPolicy.RUNTIME) // 컴파일 이후에도 JVM에 의해서 참조가 가능합니다.
//@Retention(RetentionPolicy.CLASS) // 컴파일러가 클래스를 참조할 때까지 유효합니다.
//@Retention(RetentionPolicy.SOURCE) // 어노테이션 정보는 컴파일 이후 없어집니다.
@Target({
        ElementType.PACKAGE, // 패키지 선언시
        ElementType.TYPE, // 타입 선언시
        ElementType.CONSTRUCTOR, // 생성자 선언시
        ElementType.FIELD, // 멤버 변수 선언시
        ElementType.METHOD, // 메소드 선언시
        ElementType.ANNOTATION_TYPE, // 어노테이션 타입 선언시
        ElementType.LOCAL_VARIABLE, // 지역 변수 선언시
        ElementType.PARAMETER, // 매개 변수 선언시
        ElementType.TYPE_PARAMETER, // 매개 변수 타입 선언시
        ElementType.TYPE_USE // 타입 사용시
})
public @interface MyAnnotation {
    /* enum 타입을 선언할 수 있습니다. */
    public enum Quality {BAD, GOOD, VERYGOOD}
    /* String은 기본 자료형은 아니지만 사용 가능합니다. */
    String value();
    /* 배열 형태로도 사용할 수 있습니다. */
    int[] values();
    /* enum 형태를 사용하는 방법입니다. */
    Quality quality() default Quality.GOOD;
}
```
출처 : [JDM's Blog](http://jdm.kr/blog/216)

### Reference
- [자바 애너테이션, 위키백과](https://ko.wikipedia.org/wiki/%EC%9E%90%EB%B0%94_%EC%95%A0%EB%84%88%ED%85%8C%EC%9D%B4%EC%85%98)
- [자바 어노테이션(Java Annotations), JDM's Blog](http://jdm.kr/blog/216)