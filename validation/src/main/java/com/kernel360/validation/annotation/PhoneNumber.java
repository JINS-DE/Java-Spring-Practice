package com.kernel360.validation.annotation;

import com.kernel360.validation.validator.PhoneNumberValidator;
import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Constraint(validatedBy = {PhoneNumberValidator.class})
@Target({ ElementType.FIELD }) // 변수에다만 붙일거임 FIELD에
@Retention(RetentionPolicy.RUNTIME) // 언제 실행시킬건지 : runtime 때실행중일때만
public @interface PhoneNumber {
    String message() default "핸드폰 번호 양식에 맞지 않습니다. ex)000-0000-0000";
    String regexp() default "^\\d{2,3}-\\d{3,4}-\\d{4}$";
    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
