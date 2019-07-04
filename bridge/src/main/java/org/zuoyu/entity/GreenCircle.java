package org.zuoyu.entity;

import lombok.extern.java.Log;
import org.zuoyu.faucet.DrawApi;

/**
 * 画绿色的圆.
 *
 * @author zuoyu
 * @program design-patterns
 * @create 2019-07-04 22:24
 **/
@Log
public class GreenCircle implements DrawApi {

  @Override
  public void drawCircle(int radius, int x, int y) {
    log.info(this.toString() + "\nradius：" + radius + "\tx：" + x + "\ty：" + y);
  }
}
