package org.zuoyu.entity;

import lombok.extern.java.Log;
import org.zuoyu.faucet.Color;

/**
 * 蓝色.
 *
 * @author zuoyu
 * @program design-patterns
 * @create 2019-06-30 16:21
 **/
@Log
public class Blue implements Color {

  @Override
  public void fill() {
    log.info("Filling color is blue");
  }
}
