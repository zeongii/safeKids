package kr.safekids.repository;

import kr.safekids.model.entity.RiskScanEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RiskScanRepository extends JpaRepository<RiskScanEntity, Long> {

    List<RiskScanEntity> findByPlaygroundId(Long playgroundId);
}
