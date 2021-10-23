package com.pt.jeep.controller;

import java.util.List;
import org.springframework.web.bind.annotation.RestController;
import com.pt.jeep.entity.Jeep;

@RestController
public class DefaultJeepSalesController implements JeepSalesController {

  @Override
  public List<Jeep> fetchJeeps(String model, String trim) {
    return null;
  }

}
