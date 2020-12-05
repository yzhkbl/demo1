package com.backstage.Helper;

import lombok.Data;

@Data
public class PageDto {
    private Integer page=1;
    private Integer limit=10;
}
