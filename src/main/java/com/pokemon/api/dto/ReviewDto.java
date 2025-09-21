package com.pokemon.api.dto;

import lombok.Data;

@Data
public class ReviewDto {
    private int id;
    private String content;
    private String title;
    private int stars;
}
