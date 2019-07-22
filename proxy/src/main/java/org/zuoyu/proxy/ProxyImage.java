package org.zuoyu.proxy;

import org.zuoyu.entity.RealImage;
import org.zuoyu.faucet.Image;

/**
 * 图片类的代理.
 *
 * @author zuoyu
 * @program design-patterns
 * @create 2019-07-22 19:29
 **/
public class ProxyImage implements Image {

  private RealImage realImage;
  private String fileName;

  public ProxyImage(String fileName) {
    this.fileName = fileName;
  }

  @Override
  public void display() {
    if (realImage == null){
      realImage = new RealImage(fileName);
    }
    realImage.display();
  }
}
