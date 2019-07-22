package org.zuoyu.entity;

import lombok.Data;
import lombok.extern.java.Log;
import org.zuoyu.faucet.Image;

/**
 * 图片文件.
 *
 * @author zuoyu
 * @program design-patterns
 * @create 2019-07-22 19:25
 **/
@Log
@Data
public class RealImage implements Image {

  private String fileName;

  public RealImage(String fileName) {
    this.fileName = fileName;
    loadFromDisk(this.fileName);
  }

  @Override
  public void display() {
    log.info("Displaying\t" + fileName);
  }

  private void loadFromDisk(String fileName) {
    log.info("loading\t" + fileName);
  }
}
