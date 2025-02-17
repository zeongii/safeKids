package kr.safekids.service.serviceImpl;

import kr.safekids.model.domain.RiskScanModel;
import kr.safekids.model.entity.RiskScanEntity;
import kr.safekids.repository.RiskScanRepository;
import kr.safekids.service.RiskScanService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class RiskScanServiceImpl implements RiskScanService {

    private final RiskScanRepository riskScanRepository;

    @Override
    public List<RiskScanEntity> findAll() {
        return riskScanRepository.findAll();
    }

    @Override
    public List<RiskScanEntity> findRiskPlayground(Long playgroundId) {
        return riskScanRepository.findByPlaygroundId(playgroundId);
    }

    @Override
    public RiskScanEntity save(RiskScanModel riskScanModel) {
        RiskScanEntity riskScanEntity = RiskScanEntity.toRiskScanEntity(riskScanModel);
        return riskScanRepository.save(riskScanEntity);

    }

    @Override
    public Boolean deleteRisk(Long id) {
        riskScanRepository.deleteById(id);
        return true;
    }
}
