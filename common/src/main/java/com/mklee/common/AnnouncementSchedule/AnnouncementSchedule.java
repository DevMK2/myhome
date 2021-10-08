package com.mklee.common.AnnouncementSchedule;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import java.io.Serializable;
import java.util.Date;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@IdClass(AnnouncementSchedule.CompositeKey.class)
public class AnnouncementSchedule {
    @Data
    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    public static class CompositeKey implements Serializable {
        private Date announcementDay;
        private String announcementId;
    }

    @Id
    private Date announcementDay;

    @Id
    private String announcementId;

    private String scheduleType;
}
