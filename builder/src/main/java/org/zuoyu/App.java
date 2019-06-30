package org.zuoyu;

import lombok.extern.java.Log;
import org.zuoyu.util.Meal;
import org.zuoyu.builder.MealBuilder;

/**
 * 使用 MealBuilder 来创建一个 Meal
 *
 * @author zuoyu
 */
@Log
public class App 
{
    public static void main( String[] args )
    {
        MealBuilder mealBuilder = new MealBuilder();
        Meal vegMeal = mealBuilder.comboVegMeal();
        log.info("This is vegMeal：");
        vegMeal.showItem();
        log.info("Total price：" + vegMeal.getTotalPrice());

        log.info("------------------------------------------------");

        Meal chickMeal = mealBuilder.comboChickMeal();
        log.info("This is chickMeal：");
        chickMeal.showItem();
        log.info("Total price：" + chickMeal.getTotalPrice());
    }
}
