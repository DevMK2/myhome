package com.mklee.myhomebatch.applyhome.dto;

import com.fasterxml.jackson.annotation.JsonAlias;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * APT 무순위/취소후재공급 분양정보 [조회 / 상세 조회 / 주택형별 상세 조회]
 */
public class AptRemainderDto {
    @Builder
    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    static public class RequestSimple {
        @ApiModelProperty(required=true, value="월 단위 모집공고일 (검색시작월) (ex: 202101)")
        String startmonth;

        @ApiModelProperty(required=true, value="월 단위 모집공고일 (검색종료월, 최대 12개월까지 조회가능 (ex: 202103)")
        String endmonth;

        @ApiModelProperty(required=false, value="주택명 or 건설업체명 조회 (ex: 금호어울림)")
        String searchName;
    }

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    static public class ResponseSimple {
        @JsonAlias("houseManageNo")
        @ApiModelProperty(required=false, value="주택관리번호 (ex: 2021920001)")
        String houseManageNo;

        @JsonAlias("pblancNo")
        @ApiModelProperty(required=true, value="공고번호 (ex: 2021920001)")
        String pblancNo;

        @JsonAlias("houseNm")
        @ApiModelProperty(required=true, value="주택명 (ex: 홍천 금호어울림 더퍼스트)")
        String houseNm;

        @JsonAlias("bsnsmbynm")
        @ApiModelProperty(required=true, value="시행사 정보 (ex: 한국자산신탁(주))")
        String bsnsmbynm;

        @JsonAlias("rcritPblancDe")
        @ApiModelProperty(required=true, value="모집공고일(yyyymmdd) (ex: 20210303)")
        String rcritPblancDe;

        @JsonAlias("rceptBgnde")
        @ApiModelProperty(required=true, value="청약접수시작일(yyyy-mm-dd) (ex: 2021-03-08)")
        String rceptBgnde;

        @JsonAlias("rceptEndde")
        @ApiModelProperty(required=true, value="정약접수종료일(yyyy-mm-dd) (ex: 2021-03-09)")
        String rceptEndde;

        @JsonAlias("przwnerPresnatnDe")
        @ApiModelProperty(required=true, value="당첨자발표일(yyyy-mm-dd) (ex: 2021-04-12)")
        String przwnerPresnatnDe;
    }

    @Builder
    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    static public class RequestDetail {
        @ApiModelProperty(required=true, value="주택관리번호 (ex: 2020910026)")
        String houseManageNo;

        @ApiModelProperty(required=true, value="공고번호 (ex: 2020910026)")
        String pblancNo;
    }

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    static public class ResponseDetail {
        @JsonAlias("houseManageNo")
        @ApiModelProperty(required=true, value="주텍관리번호 (ex: 2020910026)")
        String houseManageNo;

        @JsonAlias("pblancNo")
        @ApiModelProperty(required=true, value="공고번호 (ex: 2020910026)")
        String pblancNo;

        @JsonAlias("houseNm")
        @ApiModelProperty(required=true, value="주택명 (ex: 브라운스톤 부평)")
        String houseNm;

        @JsonAlias("hssplyAdres")
        @ApiModelProperty(required=false, value="공급위치 (ex: 인천광역시 부평구 후정로 6-1 (삼산동))")
        String hssplyAdres;

        @JsonAlias("totSuplyHshldco")
        @ApiModelProperty(required=true, value="공급규모 (ex: 30)")
        String totSuplyHshldco;

        @JsonAlias("rcritPblancDe")
        @ApiModelProperty(required=true, value="모집공고일(yyyy-mm-dd) (ex: 2020-08-27)")
        String rcritPblancDe;

        @JsonAlias("spsplyRceptBgnde")
        @ApiModelProperty(required=false, value="특별공급접수시작일(yyyy-mm-dd) (ex: )")
        String spsplyRceptBgnde;

        @JsonAlias("spsplyRceptEndde")
        @ApiModelProperty(required=false, value="특별공급접수종료일(yyyy-mm-dd) (ex: )")
        String spsplyRceptEndde;

        @JsonAlias("gnrlRceptBgnde")
        @ApiModelProperty(required=false, value="일반공급접수시작일(yyyy-mm-dd) (ex: 2020-09-01)")
        String gnrlRceptBgnde;

        @JsonAlias("gnrlRceptEndde")
        @ApiModelProperty(required=false, value="일반공급접수종료일(yyyy-mm-dd) (ex: 2020-09-01)")
        String gnrlRceptEndde;

        @JsonAlias("przwnerPresnatnDe")
        @ApiModelProperty(required=false, value="당첨자발표일(yyyy-mm-dd) (ex: 2020-09-07)")
        String przwnerPresnatnDe;

        @JsonAlias("cntrctCnclsBgnde")
        @ApiModelProperty(required=false, value="계약시작일(yyyy-mm-dd) (ex: 2020-09-08)")
        String cntrctCnclsBgnde;

        @JsonAlias("cntrctCnclsEndde")
        @ApiModelProperty(required=false, value="계약종료일(yyyy-mm-dd) (ex: 2020-09-08)")
        String cntrctCnclsEndde;

        @JsonAlias("hmpgAdres")
        @ApiModelProperty(required=false, value="홈페이지 주소 (ex: http://brownstone-bp.co.kr/)")
        String hmpgAdres;
    }

    @Builder
    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    static public class RequestHouseDetail {
        @ApiModelProperty(required=true, value="주텍관리번호 (ex: 2021930001)")
        String houseManageNo;

        @ApiModelProperty(required=true, value="공고번호 (ex: 2021930001)")
        String pblancNo;
    }

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    static public class ResponseHouseDetail {
        @JsonAlias("houseManageNo")
        @ApiModelProperty(required=true, value="주텍관리번호 (ex: 2021930001)")
        String houseManageNo;

        @JsonAlias("pblancNo")
        @ApiModelProperty(required=true, value="공고번호 (ex: 2021930001)")
        String pblancNo;

        @JsonAlias("modelNo")
        @ApiModelProperty(required=true, value="모델번호 (ex: 01)")
        String modelNo;

        @JsonAlias("houseTy")
        @ApiModelProperty(required=true, value="모델타입 (ex: 39.26)")
        String houseTy;

        @JsonAlias("suplyAr")
        @ApiModelProperty(required=false, value="전용면적 (ex: 57,644)")
        String suplyAr;

        @JsonAlias("suplyHshldco")
        @ApiModelProperty(required=false, value="일반공급세대수 (ex: 8)")
        String suplyHshldco;

        @JsonAlias("spsplyHshldco")
        @ApiModelProperty(required=false, value="특별공급세대수 (ex: 4)")
        String spsplyHshldco;

        @JsonAlias("lttotTopAmount")
        @ApiModelProperty(required=false, value="공급금액(분양최고금액)(단위:만원) (ex: 31,312)")
        String lttotTopAmount;
    }
}
