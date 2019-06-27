package org.zuoyu;

import org.zuoyu.entity.AudioPlayer;
import org.zuoyu.faucet.MediaPlayer.AudioType;

/**
 * 适配器模式（Adapter Pattern）是作为两个不兼容的接口之间的桥梁。这种类型的设计模式属于结构型模式，它结合了两个独立接口的功能。
 *
 * @author zuoyu
 */
public class App {

  /**
   * 其中，音频播放器设备只能播放 mp3 文件，通过使用一个更高级的音频播放器来播放 vlc 和 mp4 文件。
   */
  public static void main(String[] args) {
    AudioPlayer audioPlayer = new AudioPlayer();

    audioPlayer.play(AudioType.MP3, "beyond the horizon.mp3");
    audioPlayer.play(AudioType.MP4, "alone.mp4");
    audioPlayer.play(AudioType.VCL, "far far away.vlc");
//        audioPlayer.play(AudioType.valueOf("avi"), "mind me.avi");
  }
}
