package kr.safekids.controller;

import kr.safekids.model.domain.RiskScanModel;
import kr.safekids.service.RiskScanService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/riskScan/")
@RequiredArgsConstructor
@CrossOrigin
public class RiskScanController {

    private final RiskScanService riskScanService;

    @GetMapping("findAll")
    public ResponseEntity<List<?>> RiskAll() {
        return ResponseEntity.ok(riskScanService.findAll());

    }

    @GetMapping("findRiskByPlayground/{id}")
    public ResponseEntity<List<?>> findRiskByPlayground(@RequestParam Long playgroundId) {
        return ResponseEntity.ok(riskScanService.findRiskPlayground(playgroundId));

    }

    @PostMapping("")
    public ResponseEntity<?> saveRisk(@RequestBody RiskScanModel riskScanModel) {
        return ResponseEntity.ok(riskScanService.save(riskScanModel));
    }

    @DeleteMapping("{id}")
    public ResponseEntity<?> deleteRisk(@RequestParam Long id) {
        return ResponseEntity.ok(riskScanService.deleteRisk(id));
    }



}
