package org.zuoyu.tool;

import java.time.LocalDateTime;
import lombok.extern.java.Log;
import org.zuoyu.entity.User;

/**
 * 聊天室.
 *
 * @author zuoyu
 * @program design-patterns
 * @create 2019-08-04 18:47
 **/
@Log
public class ChatRoom {

  public static void showMessage(User user, String message) {
    log.info(LocalDateTime.now() + "[" + user.getName() + "]：" + message);
  }
}
