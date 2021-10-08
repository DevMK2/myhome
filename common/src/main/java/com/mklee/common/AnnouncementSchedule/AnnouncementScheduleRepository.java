package com.mklee.common.AnnouncementSchedule;

import org.springframework.data.jpa.repository.JpaRepository;

public interface AnnouncementScheduleRepository extends JpaRepository<AnnouncementSchedule, AnnouncementSchedule.CompositeKey> {
}
