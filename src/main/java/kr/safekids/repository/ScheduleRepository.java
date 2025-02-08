package kr.safekids.repository;

import kr.safekids.model.entity.ScheduleEntity;
import kr.safekids.repositoryCustom.ScheduleRepositoryCustom;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ScheduleRepository extends JpaRepository<ScheduleEntity, Long>, ScheduleRepositoryCustom {

}
