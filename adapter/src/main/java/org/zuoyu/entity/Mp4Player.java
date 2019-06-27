package org.zuoyu.entity;

import lombok.extern.java.Log;
import org.zuoyu.faucet.AdvancedMediaPlayer;

/**
 * MP4播放器.
 *
 * @author zuoyu
 * @program design-patterns
 * @create 2019-06-20 10:03
 **/
@Log
public class Mp4Player implements AdvancedMediaPlayer {

  @Override
  public void playVlc(String fileName) {

  }

  @Override
  public void playMp4(String fileName) {
    log.info("MP4player is run：\t" + fileName);
  }
}
