package com.mklee.myhomebatch.applyhome.api

import com.mklee.myhomebatch.applyhome.dto.AptDto
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.TestPropertySource
import spock.lang.Specification

@SpringBootTest
@TestPropertySource("classpath:application-test.properties")
class ApplyhomeApiClientTest extends Specification {
    @Autowired
    ApplyhomeApiClient applyhomeClient

    def "APT 분양정보 조회 예제 테스트"() {
        when:
        def result = applyhomeClient.getAptList(
                AptDto.RequestSimple.builder()
                        .startmonth("202101")
                        .endmonth("202103")
                        .houseSecd("01")
                        .sido("강원")
                        .houseName("횡성 벨라시티")
                        .rentSecd("0")
                        .build())

        then:
        def body = result.getBody()
        System.err.println(body)
        body.numOfRows == 10
        body.pageNo == 1
        body.totalCount == 1

        def item0 = body.getItems().get(0)
        item0.houseManageNo == "2021000200"
        item0.publicAnnounceNo == "2021000200"
        item0.houseType == "민영"
        item0.rentType == "분양주택"
        item0.houseNm == "횡성 벨라시티"
        item0.companyNm == "아시아신탁주식회사"
        item0.recruitDay == "20210331"
        item0.receiptBeginDay == "2021-04-12"
        item0.receiptEndDay == "2021-04-14"
        item0.prizewinnerDay == "2021-04-20"

        def item1 = body.getItems().get(1)
        item1.houseType == "공공"
    }
}
