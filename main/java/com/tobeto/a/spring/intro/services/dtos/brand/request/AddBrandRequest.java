package com.tobeto.a.spring.intro.services.dtos.brand.request;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class AddBrandRequest {
    @NotBlank(message = "Bu alan boş bırakılamaz! Lütfen geçerli bir model ismi giriniz.")
    private String name;
}
