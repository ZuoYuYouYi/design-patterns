package org.zuoyu.faucet;

/**
 * 高级播放器.
 *
 * @author zuoyu
 * @program design-patterns
 * @create 2019-06-20 09:38
 **/
public interface AdvancedMediaPlayer {

  /**
   * 播放VLC
   * @param fileName - 文件名
   */
  public void playVlc(String fileName);

  /**
   * 播放MP4
   * @param fileName - 文件名
   */
  public void playMp4(String fileName);
}
