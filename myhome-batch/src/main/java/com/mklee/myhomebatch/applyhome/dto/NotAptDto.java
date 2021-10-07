package com.mklee.myhomebatch.applyhome.dto;

import com.fasterxml.jackson.annotation.JsonAlias;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 오피스텔/도시형/(공공지원)민간임대 분양정보 [조회 / 상세 조회 / 주택형별 상세 조회]
 */
public class NotAptDto {
    @Builder
    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    static public class RequestSimple {
        @ApiModelProperty(required=true, value="월 단위 모집공고일 (검색시작월) (ex: 202101)")
        String startmonth;

        @ApiModelProperty(required=true, value="월 단위 모집공고일 (검색종료월, 최대 12개월까지 조회가능) (ex: 202103)")
        String endmonth;

        @ApiModelProperty(required=false, value="주택구분코드 (ex: 0202)")
        String searchHouseSecd;
    }

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    static public class ResponseSimple {
        @JsonAlias("houseManageNo")
        @ApiModelProperty(required=true, value="주택관리번호 (ex: 2021950013)")
        String houseManageNo;

        @JsonAlias("pblancNo")
        @ApiModelProperty(required=true, value="공고번호 (ex: 2021950013)")
        String pblancNo;

        @JsonAlias("houseDetailSecdNm")
        @ApiModelProperty(required=true, value="주택구분(도시형생활주택/오피스텔/민간임대/공공지원민간임대) (ex: 오피스텔)")
        String houseDetailSecdNm;

        @JsonAlias("houseNm")
        @ApiModelProperty(required=true, value="주택명 (ex: 의정부 고산지구 라피네트)")
        String houseNm;

        @JsonAlias("bsnsMbyNm")
        @ApiModelProperty(required=false, value="건설업체 정보 (ex: 주식회사 한강주택산업)")
        String bsnsMbyNm;

        @JsonAlias("rcritPblancDe")
        @ApiModelProperty(required=true, value="모집공고일(yyyymmdd) (ex: 20210329)")
        String rcritPblancDe;

        @JsonAlias("rceptBgnde")
        @ApiModelProperty(required=true, value="청약접수 시작일 (yyyy-mm-dd) (ex: 2021-04-05)")
        String rceptBgnde;

        @JsonAlias("rceptEndde")
        @ApiModelProperty(required=true, value="청약접수 종료일(yyyy-mm-dd) (ex: 2021-04-05)")
        String rceptEndde;

        @JsonAlias("przwnerPresnatnDe")
        @ApiModelProperty(required=true, value="당첨자 발표일(yyyy-mm-dd) (ex: 2021-04-08)")
        String przwnerPresnatnDe;
    }

    @Builder
    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    static public class RequestDetail {
        @ApiModelProperty(required=true, value="주택관리번호 (ex: 2020950003)")
        String houseManageNo;

        @ApiModelProperty(required=true, value="공고번호 (ex: 2020950003)")
        String pblancNo;
    }

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    static public class ResponseDetail {
        @JsonAlias("houseManageNo")
        @ApiModelProperty(required=true, value="주택관리번호 (ex: 2020950003)")
        String houseManageNo;

        @JsonAlias("pblancNo")
        @ApiModelProperty(required=true, value="공고번호 (ex: 2020950003)")
        String pblancNo;

        @JsonAlias("houseNm")
        @ApiModelProperty(required=true, value="주택명 (ex: 전주 덕진동 파크리움)")
        String houseNm;

        @JsonAlias("hssplyAdres")
        @ApiModelProperty(required=false, value="공급위치 (ex: 전라북도 전주시 덕진구 덕진동1가 1358-22번지 외)")
        String hssplyAdres;

        @JsonAlias("totSuplyHshldco")
        @ApiModelProperty(required=true, value="공급규모 (ex: 392)")
        String totSuplyHshldco;

        @JsonAlias("rcritPblancDe")
        @ApiModelProperty(required=true, value="모집공고일(yyyy-mm-dd) (ex: 2020-02-07)")
        String rcritPblancDe;

        @JsonAlias("subscrptRceptPd")
        @ApiModelProperty(required=false, value="청약접수기간(yyyy-mm-dd~yyyy-mm-dd) (ex: 2020-02-12 ~ 2020-02-12)")
        String subscrptRceptPd;

        @JsonAlias("przwnerPresnatnDe")
        @ApiModelProperty(required=false, value="당첨자발표일(yyyy-mm-dd) (ex: 2020-02-18)")
        String przwnerPresnatnDe;

        @JsonAlias("cntrctCnclsBgnde")
        @ApiModelProperty(required=false, value="계약시작일(yyyy-mm-dd) (ex: 2020-02-19)")
        String cntrctCnclsBgnde;

        @JsonAlias("cntrctCnclsEndde")
        @ApiModelProperty(required=false, value="계약종료일(yyyy-mm-dd) (ex: 2020-02-19)")
        String cntrctCnclsEndde;

        @JsonAlias("hmpgAdres")
        @ApiModelProperty(required=false, value="홈페이지 주소 (ex: http://parkrium.com)")
        String hmpgAdres;
    }

    @Builder
    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    static public class RequestHouseDetail {
        @ApiModelProperty(required=true, value="주택관리번호 (ex: 2020950007)")
        String houseManageNo;

        @ApiModelProperty(required=true, value="공고번호 (ex: 2020950007)")
        String pblancNo;
    }

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    static public class ResponseHouseDetail {
        @JsonAlias("houseManageNo")
        @ApiModelProperty(required=true, value="주택관리번호 (ex: 2020950007)")
        String houseManageNo;

        @JsonAlias("pblancNo")
        @ApiModelProperty(required=true, value="공고번호 (ex: 2020950007)")
        String pblancNo;

        @JsonAlias("modelNo")
        @ApiModelProperty(required=true, value="모델번호 (ex: 01)")
        String modelNo;

        @JsonAlias("gp")
        @ApiModelProperty(required=true, value="군 (ex: 1)")
        String gp;

        @JsonAlias("tp")
        @ApiModelProperty(required=false, value="타입 (ex: 17TA)")
        String tp;

        @JsonAlias("suplyAr")
        @ApiModelProperty(required=false, value="전용면적 (ex: 27.339)")
        String suplyAr;

        @JsonAlias("suplyHshldco")
        @ApiModelProperty(required=false, value="공급세대수 (ex: 281)")
        String suplyHshldco;

        @JsonAlias("suplyAmount")
        @ApiModelProperty(required=false, value="공급금액(분양최고금액)(단위:만원) (ex: 30,088)")
        String suplyAmount;

        @JsonAlias("subscrptReqstAmount")
        @ApiModelProperty(required=false, value="청약신청금(단위:만원) (ex: 300)")
        String subscrptReqstAmount;
    }
}
