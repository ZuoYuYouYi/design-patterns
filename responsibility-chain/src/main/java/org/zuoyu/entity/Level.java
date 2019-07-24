package org.zuoyu.entity;

import lombok.Getter;

/**
 * 级别.
 *
 * @author zuoyu
 * @program design-patterns
 * @create 2019-07-24 15:51
 **/
@Getter
public enum Level {
  /**
   * 信息
   */
  INFO(4),

  /**
   * 调试
   */
  DEBUG(3),

  /**
   * 警告
   */
  WARNING(2),

  /**
   * 错误
   */
  ERROR(1);

  private int index;

  private Level(int index){
    this.index = index;
  }
}
