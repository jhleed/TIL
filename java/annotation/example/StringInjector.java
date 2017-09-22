package example;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * String 문자열을 주입하기 위해 선언하는 어노테이션입니다.
 */
@Target({ElementType.FIELD}) //어노테이션 적용 가능한 위치
@Retention(RetentionPolicy.RUNTIME) //어노테이션이 적용되는 시점 (런타임 (컴파일 이후) 까지 적용 됨)
public @interface StringInjector {
    String value() default "This is StringInjector.";
}
