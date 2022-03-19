package com.teletearbies.roskildedaycare.repository;

import com.teletearbies.roskildedaycare.entity.Schedule;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ScheduleRepository extends CrudRepository<Schedule, Integer> {
}
