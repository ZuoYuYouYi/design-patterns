package org.zuoyu.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.zuoyu.tool.ChatRoom;

/**
 * 用户.
 *
 * @author zuoyu
 * @program design-patterns
 * @create 2019-08-04 18:40
 **/
@Data
@AllArgsConstructor
public class User {

  private String name;

  public void sendMessage(String message) {
    ChatRoom.showMessage(this, message);
  }
}
