package kr.safekids.model.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "playground")
public class PlaygroundEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String address;

    private Date InstallationDate;

    private Boolean isActive;

    private String District;

    private String City;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    @JsonBackReference
    private UserEntity user;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "team_id")
    @JsonBackReference
    private TeamEntity team;

    @OneToMany(mappedBy = "playground", cascade = CascadeType.ALL)
    @JsonManagedReference
    private List<FacilityListEntity> facilityListEntities = new ArrayList<>();

    @OneToMany(mappedBy = "playground", cascade = CascadeType.ALL)
    @JsonManagedReference
    private List<ScheduleEntity> scheduleEntities = new ArrayList<>();





}
