package kr.safekids.repository;

import kr.safekids.model.entity.CheckItemEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CheckItemRepository extends JpaRepository<CheckItemEntity,Long> {


}
