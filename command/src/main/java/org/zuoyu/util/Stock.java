package org.zuoyu.util;

import lombok.AllArgsConstructor;
import lombok.ToString;
import lombok.extern.java.Log;

/**
 * 股票请求行为.
 *
 * @author zuoyu
 * @program design-patterns
 * @create 2019-07-24 17:58
 **/
@Log
@AllArgsConstructor
@ToString
public class Stock {

  private String name;
  private int quantity;

  public void buy(){
    log.info("buy stock:\t" + this.toString());
  }

  public void sell(){
    log.info("sell stock:\t" + this.toString());
  }
}
