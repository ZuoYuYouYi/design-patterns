package org.zuoyu.util;

import java.util.ArrayList;
import java.util.List;
import org.zuoyu.faucet.Item;

/**
 * 晚餐单.
 *
 * @author zuoyu
 * @program design-patterns
 * @create 2019-06-28 19:28
 **/
public class Meal {

  private List<Item> items = new ArrayList<>();

  /**
   * 向菜单内添加食物
   *
   * @param item - 食物
   */
  public void addItem(Item item) {
    items.add(item);
  }

  /**
   * 获取食物的总价格
   *
   * @return - 总价
   */
  public double getTotalPrice() {
    return items.stream().mapToDouble(Item::price).sum();
  }

  /**
   * 查看餐单详情
   */
  public void showItem() {
    items.forEach(item -> {
      System.out.print("name：" + item.name() + "\t");
      System.out.print("packing：" + item.packing() + "\t");
      System.out.println("price：" + item.price());
    });
  }
}
