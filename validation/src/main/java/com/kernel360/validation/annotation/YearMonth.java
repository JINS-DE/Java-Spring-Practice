package com.kernel360.validation.annotation;

import com.kernel360.validation.validator.PhoneNumberValidator;
import com.kernel360.validation.validator.YearMonthValidator;
import jakarta.validation.Constraint;
import jakarta.validation.Payload;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Constraint(validatedBy = {YearMonthValidator.class})
@Target({ ElementType.FIELD }) // 변수에다만 붙일거임 FIELD에
@Retention(RetentionPolicy.RUNTIME) // 언제 실행시킬건지 : runtime 때실행중일때만
@NotBlank
public @interface YearMonth {
    String message() default "Year Month 양식에 맞지 않습니다 ex) 20230101";
    String pattern() default "yyyyMMdd";
    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
