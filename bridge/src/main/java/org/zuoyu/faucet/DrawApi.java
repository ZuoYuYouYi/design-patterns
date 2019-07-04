package org.zuoyu.faucet;

/**
 * 绘画API.
 *
 * @author zuoyu
 * @program design-patterns
 * @create 2019-07-04 22:14
 **/
public interface DrawApi {

  /**
   * 画圆
   * @param radius - 半径
   * @param x - 横坐标
   * @param y - 竖坐标
   */
  void drawCircle(int radius, int x, int y);
}
