package com.teletearbies.roskildedaycare.service;

import com.teletearbies.roskildedaycare.repository.ChildrenRepository;
import com.teletearbies.roskildedaycare.entity.Children;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChildrenService {
   @Autowired private ChildrenRepository childrenRepository;

    public void saveChildren(Children children) {
        childrenRepository.save(children);
    }


    public List<Children> getAllChildren() {
        return (List<Children>) childrenRepository.findAll();
    }

}
