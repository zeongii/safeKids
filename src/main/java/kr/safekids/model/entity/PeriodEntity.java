package kr.safekids.model.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "period")
public class PeriodEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String status;

    @OneToMany(mappedBy = "period", cascade = CascadeType.ALL)
    @JsonManagedReference
    private List<CheckItemEntity> checkItemEntities = new ArrayList<>();

    @OneToMany(mappedBy = "period", cascade = CascadeType.ALL)
    @JsonManagedReference
    private List<ScheduleEntity> scheduleEntities = new ArrayList<>();



}
