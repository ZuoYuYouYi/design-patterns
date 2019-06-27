package org.zuoyu.entity;

import lombok.extern.java.Log;
import org.zuoyu.faucet.MediaPlayer;
import org.zuoyu.serviceimpl.MediaAdapter;

/**
 * 媒体播放器.
 *
 * @author zuoyu
 * @program design-patterns
 * @create 2019-06-20 10:17
 **/
@Log
public class AudioPlayer implements MediaPlayer {

  @Override
  public void play(AudioType audioType, String fileName) {
    if (audioType.equals(AudioType.MP3)) {
      log.info("MP3player is run：" + fileName);
      return;
    }
    if (audioType.equals(AudioType.VCL) || audioType.equals(AudioType.MP4)) {
      MediaAdapter mediaAdapter = new MediaAdapter(audioType);
      mediaAdapter.play(audioType, fileName);
      return;
    }
    log.info("is error");
  }
}
