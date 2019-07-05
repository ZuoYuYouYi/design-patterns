package org.zuoyu.entity;

import lombok.Data;
import lombok.extern.java.Log;

/**
 * 人物信息.
 *
 * @author zuoyu
 * @program design-patterns
 * @create 2019-07-05 15:59
 **/

@Log
@Data
public class Person {

  /**
   * 性别
   */
  public enum Gender{
    /**
     * 男
     */
    MALE,

    /**
     * 女
     */
    FEMALE
  }

  /**
   * 婚姻状态
   */
  public enum MaritalStatus{

    /**
     * 单身
     */
    SINGLE,

    /**
     * 已婚
     */
    MARRIED
  }

  /**
   * 姓名
   */
  private String name;

  /**
   * 性别
   */
  private Gender gender;

  /**
   * 婚姻状态
   */
  private MaritalStatus maritalStatus;

  public Person(String name, Gender gender, MaritalStatus maritalStatus) {
    this.name = name;
    this.gender = gender;
    this.maritalStatus = maritalStatus;
  }

  public Person() {
  }

}
