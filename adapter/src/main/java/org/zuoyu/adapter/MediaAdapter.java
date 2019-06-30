package org.zuoyu.adapter;

import org.zuoyu.entity.Mp4Player;
import org.zuoyu.entity.VclPlayer;
import org.zuoyu.faucet.AdvancedMediaPlayer;
import org.zuoyu.faucet.MediaPlayer;

/**
 * 实现了 MediaPlayer 接口的适配器类.
 *
 * @author zuoyu
 * @program design-patterns
 * @create 2019-06-20 10:07
 **/
public class MediaAdapter implements MediaPlayer {

  /**
   * 使用 AdvancedMediaPlayer 对象来播放所需的格式
   */
  private AdvancedMediaPlayer advancedMediaPlayer;

  public MediaAdapter(AudioType audioType) {
    if (audioType.equals(AudioType.VCL)) {
      advancedMediaPlayer = new VclPlayer();
    }
    if (audioType.equals(AudioType.MP4)) {
      advancedMediaPlayer = new Mp4Player();
    }
  }

  @Override
  public void play(AudioType audioType, String fileName) {
    if (audioType.equals(AudioType.VCL)) {
      advancedMediaPlayer.playVlc(fileName);
    }
    if (audioType.equals(AudioType.MP4)) {
      advancedMediaPlayer.playMp4(fileName);
    }
  }
}
