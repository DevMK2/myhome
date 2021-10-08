package com.mklee.myhomebatch.dto;

import com.fasterxml.jackson.annotation.JsonAlias;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PublicXmlResponse<T> {
    @JsonAlias("header")
    Header header;

    @JsonAlias("body")
    Body<T> body;

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    static public class Header {
        @JsonAlias("resultCode")
        Long resultCode;

        @JsonAlias("resultMsg")
        String resultMsg;
    }

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    static public class Body<T> {
        @JsonAlias("numOfRows")
        @ApiModelProperty(required=true, value="한 페이지 결과 수 (ex: 10)")
        int numOfRows;

        @JsonAlias("pageNo")
        @ApiModelProperty(required=true, value="페이지번호 (ex: 1)")
        int pageNo;

        @JsonAlias("totalCount")
        @ApiModelProperty(required=true, value="전체 결과 수 (ex: 4)")
        int totalCount;

        @JsonAlias("items")
        List<T> items;
    }
}
