package org.zuoyu.entity;

import org.zuoyu.faucet.DrawApi;

/**
 * 图形.
 *
 * @author zuoyu
 * @program design-patterns
 * @create 2019-07-04 22:27
 **/
public abstract class BaseShape {

  protected DrawApi drawApi;

  protected BaseShape(DrawApi drawApi) {
    this.drawApi = drawApi;
  }

  /**
   * 绘画
   */
  public abstract void draw();
}
