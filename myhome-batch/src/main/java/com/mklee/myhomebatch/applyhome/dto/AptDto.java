package com.mklee.myhomebatch.applyhome.dto;

import com.fasterxml.jackson.annotation.JsonAlias;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * APT 분양정보 [조회 / 상세 조회 / 주택형별 상세 조회]
 */
public class AptDto {
    @Builder
    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    static public class RequestSimple {
        @ApiModelProperty(required=true, value="월 단위 모집공고일 (검색시작월) (ex: 202101)")
        String startmonth;

        @ApiModelProperty(required=true, value="월 단위 모집공고일 (검색종료월, 최대 12개월) (ex: 202103)")
        String endmonth;

        @ApiModelProperty(required=false, value="주택구분 (ex: 01)")
        String houseSecd;

        @ApiModelProperty(required=false, value="공급지역 (ex: 강원)")
        String sido;

        @ApiModelProperty(required=false, value="주택명 (ex: 횡성 벨라시티)")
        String houseName;

        @ApiModelProperty(required=false, value="분양/임대 구분값 (ex: 0)")
        String rentSecd;
    }

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    static public class ResponseSimple {
        @ApiModelProperty("주택관리번호")
        String houseManageNo;

        @JsonAlias("pblancNo")
        @ApiModelProperty("공고번호")
        String publicAnnounceNo;

        @JsonAlias("houseDtlSecdNm")
        @ApiModelProperty("민영주택구분(민영/국민)")
        String houseType;

        @JsonAlias("rentSecdNm")
        @ApiModelProperty("분양/임대 구분값")
        String rentType;

        @ApiModelProperty("주택명")
        String houseNm;

        @JsonAlias("bsnsMbyNm")
        @ApiModelProperty("건설업체 정보")
        String companyNm;

        @JsonAlias("rcritPblancDe")
        @ApiModelProperty("모집공고일(yyyymmdd)")
        String recruitDay;

        @JsonAlias("rceptBgnde")
        @ApiModelProperty("청약접수 시작일 (yyyy-mm-dd)")
        String receiptBeginDay;

        @JsonAlias("rceptEndde")
        @ApiModelProperty("청약접수 종료일(yyyy-mm-dd)")
        String receiptEndDay;

        @JsonAlias("przwnerPresnatnDe")
        @ApiModelProperty("당첨자 발표일(yyyy-mm-dd)")
        String prizewinnerDay;
    }

    @Builder
    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    static public class RequestDetail {
        @ApiModelProperty(required=true, value="주택관리번호 (ex: 2020000010)")
        String houseManageNo;

        @ApiModelProperty(required=true, value="공고번호 (ex: 2020000010)")
        String pblancNo;
    }

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    static public class ResponseDetail {
        @JsonAlias("houseManageNo")
        @ApiModelProperty(required=true, value="주택관리번호 (ex: 2020000010)")
        String houseManageNo;

        @JsonAlias("houseNm")
        @ApiModelProperty(required=true, value="주택명 (ex: 양주옥정유림노르웨이숲)")
        String houseNm;

        @JsonAlias("hssplyAdres")
        @ApiModelProperty(required=false, value="공급위치 (ex: 경기도 양주시 옥정동 1097 (옥정택지개발지구 A-20(1)블록))")
        String hssplyAdres;

        @JsonAlias("totSuplyHshldco")
        @ApiModelProperty(required=true, value="공급규모 (ex: 1140)")
        String totSuplyHshldco;

        @JsonAlias("rcritPblancDe")
        @ApiModelProperty(required=true, value="모집공고일(yyyy-mm-dd) (ex: 2020-02-07)")
        String rcritPblancDe;

        @JsonAlias("spsplyRceptBgnde")
        @ApiModelProperty(required=false, value="특별공급 접수시작일(yyyy-mm-dd) (ex: 2020-02-18)")
        String spsplyRceptBgnde;

        @JsonAlias("spsplyRceptEndde")
        @ApiModelProperty(required=false, value="특별공급 접수종료일(yyyy-mm-dd) (ex: 2020-02-18)")
        String spsplyRceptEndde;

        @JsonAlias("gnrlRnk1CrspareaRceptPd")
        @ApiModelProperty(required=false, value="1순위 접수일 해당지역(yyyy-mm-dd) (ex: 2020-02-19)")
        String gnrlRnk1CrspareaRceptPd;

        @JsonAlias("gnrlRnk1EtcGGRcptdePd")
        @ApiModelProperty(required=false, value="1순위 접수일 경기지역(yyyy-mm-dd) (ex: 2020-02-19)")
        String gnrlRnk1EtcGGRcptdePd;

        @JsonAlias("gnrlRnk1EtcAreaRcptdePd")
        @ApiModelProperty(required=false, value="1순위 접수일 기타지역(yyyy-mm-dd) (ex: 2020-02-19)")
        String gnrlRnk1EtcAreaRcptdePd;

        @JsonAlias("gnrlRnk2CrspareaRceptPd")
        @ApiModelProperty(required=false, value="2순위 접수일 해당지역(yyyy-mm-dd) (ex: 2020-02-20)")
        String gnrlRnk2CrspareaRceptPd;

        @JsonAlias("gnrlRnk2EtcGGRcptdePd")
        @ApiModelProperty(required=false, value="2순위 접수일 경기지역(yyyy-mm-dd) (ex: 2020-02-20)")
        String gnrlRnk2EtcGGRcptdePd;

        @JsonAlias("gnrlRnk2EtcAreaRcptdePd")
        @ApiModelProperty(required=false, value="2순위 접수일 기타지역(yyyy-mm-dd) (ex: 2020-02-20)")
        String gnrlRnk2EtcAreaRcptdePd;

        @JsonAlias("przwnerPresnatnDe")
        @ApiModelProperty(required=false, value="당첨자발표일 (yyyy-mm-dd) (ex: 2020-02-27)")
        String przwnerPresnatnDe;

        @JsonAlias("cntrctCnclsBgnde")
        @ApiModelProperty(required=false, value="계약시작일 (yyyy-mm-dd) (ex: 2020-03-10)")
        String cntrctCnclsBgnde;

        @JsonAlias("cntrctCnclsEndde")
        @ApiModelProperty(required=false, value="계약종료일 (yyyy-mm-dd) (ex: 2020-03-12)")
        String cntrctCnclsEndde;

        @JsonAlias("hmpgAdres")
        @ApiModelProperty(required=false, value="홈페이지 주소 (ex: http://okjung-yulim.com)")
        String hmpgAdres;

        @JsonAlias("pblancNo")
        @ApiModelProperty(required=true, value="공고번호 (ex: 2020000010)")
        String pblancNo;
    }

    @Builder
    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    static public class RequestHouseDetail {
        @ApiModelProperty(required=true, value="주택관리번호 (ex: 2020000632)")
        String houseManageNo;

        @ApiModelProperty(required=true, value="공고번호 (ex: 2020000632)")
        String pblancNo;
    }

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    static public class ResponseHouseDetail {
        @JsonAlias("houseManageNo")
        @ApiModelProperty(required=true, value="주택관리번호 (ex: 2020000632)")
        String houseManageNo;

        @JsonAlias("pblancNo")
        @ApiModelProperty(required=true, value="공고번호 (ex: 2020000632)")
        String pblancNo;

        @JsonAlias("modelNo")
        @ApiModelProperty(required=true, value="모델번호 (ex: 01)")
        String modelNo;

        @JsonAlias("houseTy")
        @ApiModelProperty(required=true, value="주택형 (ex: 084.9850A)")
        String houseTy;

        @JsonAlias("suplyAr")
        @ApiModelProperty(required=false, value="주택공급면적 (ex: 107.255)")
        String suplyAr;

        @JsonAlias("suplyHshldco")
        @ApiModelProperty(required=false, value="일반공급세대수 (ex: 12)")
        String suplyHshldco;

        @JsonAlias("spsplyHshldco")
        @ApiModelProperty(required=false, value="특별공급세대수 (ex: 0)")
        String spsplyHshldco;

        @JsonAlias("mnychHshldco")
        @ApiModelProperty(required=false, value="특별공급 세대수-다자녀가구 (ex: 0)")
        String mnychHshldco;

        @JsonAlias("nwwdsHshldco")
        @ApiModelProperty(required=false, value="특별공급 세대수-신혼부부 (ex: 0)")
        String nwwdsHshldco;

        @JsonAlias("lfeFrstHshldco")
        @ApiModelProperty(required=false, value="특별공급 세대수-생애최초 (ex: 0)")
        String lfeFrstHshldco;

        @JsonAlias("oldParentsSuportHshldco")
        @ApiModelProperty(required=false, value="특별공급 세대수-노부모부양 (ex: 0)")
        String oldParentsSuportHshldco;

        @JsonAlias("insttRecomendHshldco")
        @ApiModelProperty(required=false, value="특별공급 세대수-기관추천 (ex: 0)")
        String insttRecomendHshldco;

        @JsonAlias("etcHshldco")
        @ApiModelProperty(required=false, value="특별공급 세대수-기관추천기타 (ex: 0)")
        String etcHshldco;

        @JsonAlias("transrInsttEnfsnHshldco")
        @ApiModelProperty(required=false, value="특별공급 세대수-이전기관 (ex: 0)")
        String transrInsttEnfsnHshldco;

        @JsonAlias("lttotTopAmount")
        @ApiModelProperty(required=false, value="공급금액(분양최고금액)(단위:만원) (ex: 55,016)")
        String lttotTopAmount;
    }
}
