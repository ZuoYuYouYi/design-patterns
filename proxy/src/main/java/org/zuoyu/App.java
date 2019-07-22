package org.zuoyu;

import lombok.extern.java.Log;
import org.zuoyu.faucet.Image;
import org.zuoyu.proxy.ProxyImage;

/**
 * 当被请求时，使用 ProxyImage 来获取 RealImage 类的对象
 *
 * @author zuoyu
 */
@Log
public class App 
{
    public static void main( String[] args )
    {
        Image image = new ProxyImage("screen_fetch.png");
        image.display();
        log.info("\n");
        image.display();
    }
}
