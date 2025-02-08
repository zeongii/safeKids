package kr.safekids.repository;

import kr.safekids.model.entity.CheckItemEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CheckItemRepository extends JpaRepository<CheckItemEntity,Long> {

    List<CheckItemEntity> findByPeriod(String period);


}
