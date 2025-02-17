package kr.safekids.controller;

import kr.safekids.model.domain.ScheduleModel;
import kr.safekids.service.ScheduleService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/schedule/")
@RequiredArgsConstructor
@CrossOrigin
public class ScheduleController {

    private final ScheduleService scheduleService;

    @GetMapping("showWeeklySchedule/{userId}")
    public ResponseEntity<List<?>> weeklySchedule (@PathVariable Long userId) {
        return ResponseEntity.ok(scheduleService.findWeeklySchedule(userId));
    }

    @GetMapping("ShowMonthlySchedule/{userId}")
    public ResponseEntity<List<?>> monthlySchedule (@PathVariable Long userId) {
        return ResponseEntity.ok(scheduleService.findMonthlySchedule(userId));
    }

    @PostMapping("")
    public ResponseEntity<?> save(@RequestBody ScheduleModel scheduleModel) {
        return ResponseEntity.ok(scheduleService.save(scheduleModel));
    }
}
