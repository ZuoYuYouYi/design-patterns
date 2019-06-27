package org.zuoyu.faucet;

/**
 * 普通播放器(该接口本只能用于播放MP3格式文件）.
 *
 * @author zuoyu
 * @program design-patterns
 * @create 2019-06-20 09:32
 **/
public interface MediaPlayer {

  enum AudioType {
    /**
     * 可视文件
     */
    VCL,
    /**
     * 视频文件
     */
    MP4,
    /**
     * 音频文件
     */
    MP3
  }

  /**
   * 播放
   *
   * @param audioType - 播放类型
   * @param fileName - 文件名称
   */
  void play(AudioType audioType, String fileName);
}
