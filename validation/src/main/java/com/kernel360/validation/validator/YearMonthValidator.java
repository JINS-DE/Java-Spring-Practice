package com.kernel360.validation.validator;

import com.kernel360.validation.annotation.PhoneNumber;
import com.kernel360.validation.annotation.YearMonth;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import org.springframework.cglib.core.Local;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.regex.Pattern;

public class YearMonthValidator implements ConstraintValidator<YearMonth, String> {

    private String pattern;

    @Override
    public void initialize(YearMonth constraintAnnotation) {
        this.pattern = constraintAnnotation.pattern();
    }

    @Override
    public boolean isValid(String value, ConstraintValidatorContext constraintValidatorContext) {
        // "2023-01-01T13:00:00" yyyy-MM-ddTHH:mm:ss 검증
        // "20230101"
        // size = 8

        var reValue = value+"01";
        var rePattern = pattern + "dd";

        try{
            LocalDate date = LocalDate.parse(reValue, DateTimeFormatter.ofPattern(rePattern));
            System.out.println(date);
            return true;
        }catch (Exception e){
            return false;
        }

    }
}
