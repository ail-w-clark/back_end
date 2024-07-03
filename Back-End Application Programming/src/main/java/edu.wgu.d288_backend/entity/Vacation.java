package entity;

import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.math.BigDecimal;
import java.util.Date;

public class Vacation {
    @Entity
    @Table(name = "vacations")
    @Data
    public class Vacation {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "vacation_id")
        private Long id;

        @Column(name = "create_date")
        @CreationTimestamp
        private Date create_date;

        @Column(name = "description")
        private String description;

        @Column(name = "image_url")
        private String image_url;

        @Column(name = "last_update")
        @UpdateTimestamp
        private Date last_update;

        @Column(name = "travel_fare_price")
        private BigDecimal travel_fare_price;

        @Column(name = "vacation_title")
        private String vacationTitle;
    }

}
