package org.zuoyu;

import org.zuoyu.entity.BuyStock;
import org.zuoyu.entity.SellStock;
import org.zuoyu.util.Broker;
import org.zuoyu.util.Stock;

/**
 * 使用 Broker 类来接受并执行命令
 *
 * @author zuoyu
 */
public class App 
{
    public static void main( String[] args )
    {
//        要进行操作的股票
        Stock stock = new Stock("ALiBaBa", 12);
//        经纪人
        Broker broker = new Broker();
//        告诉经纪人我要买股票
        broker.setOrders(new BuyStock(stock));
//        告诉经纪人我要卖股票
        broker.setOrders(new SellStock(stock));
//        执行这些命令
        broker.executeOrders();
    }
}
