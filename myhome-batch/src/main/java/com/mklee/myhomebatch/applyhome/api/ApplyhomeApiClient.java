package com.mklee.myhomebatch.applyhome.api;

import com.mklee.myhomebatch.applyhome.config.ApplyhomeApiConfiguration;
import com.mklee.myhomebatch.applyhome.dto.AptDto;
import com.mklee.myhomebatch.applyhome.dto.NotAptDto;
import com.mklee.myhomebatch.applyhome.dto.AptRemainderDto;
import com.mklee.myhomebatch.dto.PublicXmlResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.cloud.openfeign.SpringQueryMap;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "apply-home-api", url = "${myhome.api.host}", configuration = ApplyhomeApiConfiguration.class)
public interface ApplyhomeApiClient {
    /**
     * APT 분양정보 [조회 / 상세 조회 / 주택형별 상세 조회]
     */
    @GetMapping(value = "/getLttotPblancList", consumes = MediaType.TEXT_XML_VALUE)
    PublicXmlResponse<AptDto.ResponseSimple> getAptList(@SpringQueryMap AptDto.RequestSimple params);

    @GetMapping("getAPTLttotPblancDetail")
    PublicXmlResponse<AptDto.ResponseDetail> getAptDetail(@SpringQueryMap AptDto.RequestDetail params);

    @GetMapping("getAPTLttotPblancMdl")
    PublicXmlResponse<AptDto.ResponseHouseDetail> getAptHouseDetail(@SpringQueryMap AptDto.RequestHouseDetail params);


    /**
     * APT 무순위/취소후재공급 분양정보 [조회 / 상세 조회 / 주택형별 상세 조회]
     */
    @GetMapping("getRemndrLttotPblancList")
    PublicXmlResponse<AptRemainderDto.ResponseSimple> getRemndrAptList(@SpringQueryMap AptRemainderDto.RequestSimple params);

    @GetMapping("getRemndrLttotPblancDetail")
    PublicXmlResponse<AptRemainderDto.ResponseDetail> getRemndrAptDetail(@SpringQueryMap AptRemainderDto.RequestDetail params);

    @GetMapping("getRemndrLttotPblancMdl")
    PublicXmlResponse<AptRemainderDto.ResponseHouseDetail> getRemndrAptHouseDetail(@SpringQueryMap AptRemainderDto.RequestHouseDetail params);


    /**
     * 오피스텔/도시형/(공공지원)민간임대 분양정보 [조회 / 상세 조회 / 주택형별 상세 조회]
     */
    @GetMapping("getNotAPTLttotPblancList")
    PublicXmlResponse<NotAptDto.ResponseSimple> getNotAptList(@SpringQueryMap NotAptDto.RequestSimple params);

    @GetMapping("getUrbtyOfctlLttotPblancDetail")
    PublicXmlResponse<NotAptDto.ResponseDetail> getNotAptDetail(@SpringQueryMap NotAptDto.RequestDetail params);

    @GetMapping("getUrbtyOfctlLttotPblancMdl")
    PublicXmlResponse<NotAptDto.ResponseHouseDetail> getNotAptHouseDetail(@SpringQueryMap NotAptDto.RequestHouseDetail params);
}
