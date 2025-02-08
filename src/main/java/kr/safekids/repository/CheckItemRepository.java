package kr.safekids.repository;

import kr.safekids.model.entity.CheckItemEntity;
import kr.safekids.repositoryCustom.CheckRepositoryCustom;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CheckItemRepository extends JpaRepository<CheckItemEntity,Long>, CheckRepositoryCustom {

    List<CheckItemEntity> findByPeriod(String period);


}
