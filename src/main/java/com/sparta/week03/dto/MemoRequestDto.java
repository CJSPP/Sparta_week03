package com.sparta.week03.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@RequiredArgsConstructor
@Getter
@Setter
public class MemoRequestDto {
    private String username;
    private String contents;
}
