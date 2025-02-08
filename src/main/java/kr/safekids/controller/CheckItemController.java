package kr.safekids.controller;


import kr.safekids.model.entity.CheckItemEntity;
import kr.safekids.service.CheckItemService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/checkItem/")
@RequiredArgsConstructor
@CrossOrigin
public class CheckItemController {

    private final CheckItemService checkItemService;

    @GetMapping("checkItemAll")
    public ResponseEntity<List<?>> findAll() {
        return ResponseEntity.ok(checkItemService.findAll());
    }

    @GetMapping("MCheckItem")
    public ResponseEntity<List<?>> monthlyItem() {
        return ResponseEntity.ok(checkItemService.findMonthlyItem("M"));
    }

    @GetMapping("WCheckItem")
    public ResponseEntity<List<?>> weeklyItem() {
        return ResponseEntity.ok(checkItemService.findWeeklyItem("M"));
    }





}
