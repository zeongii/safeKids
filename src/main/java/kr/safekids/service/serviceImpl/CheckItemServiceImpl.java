package kr.safekids.service.serviceImpl;

import kr.safekids.model.entity.CheckItemEntity;
import kr.safekids.repository.CheckItemRepository;
import kr.safekids.service.CheckItemService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CheckItemServiceImpl implements CheckItemService {

    private CheckItemRepository checkItemRepository;

    @Override
    public List<CheckItemEntity> findAll() {
        return checkItemRepository.findAll();
    }

    @Override
    public List<CheckItemEntity> findMonthlyItem(String period) {
        List<CheckItemEntity> monthlyItems = checkItemRepository.findByPeriod(period);
        return monthlyItems;

    }

    @Override
    public List<CheckItemEntity> findWeeklyItem(String period) {
        List<CheckItemEntity> weeklyItems = checkItemRepository.findByPeriod(period);
        return weeklyItems;
    }
}
