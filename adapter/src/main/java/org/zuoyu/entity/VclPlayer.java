package org.zuoyu.entity;

import lombok.extern.java.Log;
import org.zuoyu.faucet.AdvancedMediaPlayer;

/**
 * VCL播放器.
 *
 * @author zuoyu
 * @program design-patterns
 * @create 2019-06-20 09:43
 **/
@Log
public class VclPlayer implements AdvancedMediaPlayer {

  @Override
  public void playVlc(String fileName) {
    log.info("VCLPlay is run：\t" + fileName);
  }

  @Override
  public void playMp4(String fileName) {

  }
}
