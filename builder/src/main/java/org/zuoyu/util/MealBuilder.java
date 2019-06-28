package org.zuoyu.util;

import org.zuoyu.entity.ChickenBurger;
import org.zuoyu.entity.Coke;
import org.zuoyu.entity.Pepsi;
import org.zuoyu.entity.VegBurger;

/**
 * 对套餐的建造.
 *
 * 创建不同类型的 Meal 对象的MealBuilder
 *
 * @author zuoyu
 * @program design-patterns
 * @create 2019-06-28 19:55
 **/
public class MealBuilder {

  /**
   * 素套餐
   */
  public Meal comboVegMeal(){
    Meal meal = new Meal();
    meal.addItem(new VegBurger());
    meal.addItem(new Coke());
    return meal;
  }

  /**
   * 鸡肉套餐
   */
  public Meal comboChickMeal(){
    Meal meal = new Meal();
    meal.addItem(new ChickenBurger());
    meal.addItem(new Pepsi());
    return meal;
  }
}
