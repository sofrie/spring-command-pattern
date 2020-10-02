package com.idspring.commandpattern.entity;

import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Builder
@Document
public class Wishlist {
    @Id
    private String productId;
    
    private String productName;

    private String username;   
    
}
