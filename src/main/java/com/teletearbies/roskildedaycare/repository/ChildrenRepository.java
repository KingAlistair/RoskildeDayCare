package com.teletearbies.roskildedaycare.repository;

import com.teletearbies.roskildedaycare.entity.Children;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChildrenRepository extends CrudRepository<Children, Integer> {


}
