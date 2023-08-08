package com.productservice.productservice.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.lang.annotation.Documented;

@Document(value = "product")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Product {

    @Id
    private String id;
    private String name;
    private String price;
    private String description;

}
