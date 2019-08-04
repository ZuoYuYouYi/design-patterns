package org.zuoyu;

import org.zuoyu.entity.User;

/**
 * 使用 User 对象来显示他们之间的通信
 *
 * @author zuoyu
 */
public class App 
{
    public static void main( String[] args )
    {
        User sam = new User("Sam");
        User jim = new User("Jim");

        sam.sendMessage("Hello everyone");
        jim.sendMessage("Hello, sam");
    }
}
