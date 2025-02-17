package kr.safekids.service;

import kr.safekids.model.domain.RiskScanModel;
import kr.safekids.model.entity.RiskScanEntity;

import java.util.List;

public interface RiskScanService {

    List<RiskScanEntity> findAll();

    List<RiskScanEntity> findRiskPlayground(Long playgroundId);

    RiskScanEntity save(RiskScanModel riskScanModel);

    Boolean deleteRisk(Long id);
}
