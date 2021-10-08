package com.mklee.common.AnnouncementSchedule

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import spock.lang.Specification

import javax.transaction.Transactional

@SpringBootTest
class AnnouncementScheduleRepositoryTest extends Specification {
    @Autowired
    private AnnouncementScheduleRepository announcementScheduleRepository;

    @Transactional
    def "생성 테스트"() {
        given:
        def announcementSchedule = new AnnouncementSchedule()
        announcementSchedule.setAnnouncementDay(date)
        announcementSchedule.setAnnouncementId(id)
        announcementSchedule.setScheduleType(scheduleType)
        announcementScheduleRepository.save(announcementSchedule)

        expect:
        def find = announcementScheduleRepository.findById(
                AnnouncementSchedule.CompositeKey.builder()
                        .announcementDay(date)
                        .announcementId(id).build())
        find.isPresent()
        def found = find.get()
        found.getAnnouncementDay() == date
        found.getAnnouncementId() == id
        found.getScheduleType() == scheduleType

        where:
        id  | date          | scheduleType
        "1" | new Date()    | "1차접수"
        "2" | new Date()    | "2차접수"
        "3" | new Date()    | "특별공급접수"
        "4" | new Date()    | "계약"
    }
}
