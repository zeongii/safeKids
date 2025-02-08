package kr.safekids.service;

import kr.safekids.model.entity.CheckItemEntity;

import java.util.List;

public interface CheckItemService {
    List<CheckItemEntity> findAll();

    List<CheckItemEntity> findMonthItem();
}
