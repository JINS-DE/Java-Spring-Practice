package com.kernel360.validation.model;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import com.kernel360.validation.annotation.PhoneNumber;
import com.kernel360.validation.annotation.YearMonth;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.Objects;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@JsonNaming(value= PropertyNamingStrategies.SnakeCaseStrategy.class)
public class UserRegisterRequest {
//    @NotNull    // null 허용 x
//    @NotEmpty   // != null && name != ""
    @Size(min = 1, max = 12) // 1 ~ 12 크기
//    @NotBlank   // != null && name != "" && name != "   "
    private String name;

    private String nickName;

    @NotNull
    @Min(1)
    @Max(200)
    private Integer age;

    @Email
    private String email;

//    @Pattern(regexp = "^\\d{2,3}-\\d{3,4}-\\d{4}$", message = "휴대폰 번호 양식이 맞지 않습니다.")
    @PhoneNumber
    private String phoneNumber;

    @FutureOrPresent // 현재 또는 그 이상을 뜻함
    private LocalDateTime registerAt;

    @YearMonth(pattern = "yyyy-MM")
    private  String birthDayYearMonth;

    @AssertTrue(message = "name or nickName은 반드시 한 개가 존재해야합니다.")
    public boolean isNameCheck(){
        if(Objects.nonNull(name) && !name.isBlank()){
            return true;
        }
        if(Objects.nonNull(nickName) && !nickName.isBlank()){
            return true;
        }
        return false;
    }
}
