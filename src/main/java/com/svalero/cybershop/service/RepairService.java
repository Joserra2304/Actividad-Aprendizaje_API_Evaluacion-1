package com.svalero.cybershop.service;

import com.svalero.cybershop.domain.Repair;
import com.svalero.cybershop.repository.RepairRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public interface RepairService {

  List<Repair> findAll();

  Repair findByProduct(String product);

  Repair addRepair(Repair repair);



}
