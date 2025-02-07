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
@Table(name = "facility")
public class FacilityEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String FacilityName;

    @OneToMany(mappedBy = "facility", cascade = CascadeType.ALL)
    @JsonManagedReference
    private List<FacilityListEntity> facilityEntities;

    @OneToMany(mappedBy = "facility", cascade = CascadeType.ALL)
    @JsonManagedReference
    private List<CheckItemEntity> checkItemEntities;



}
