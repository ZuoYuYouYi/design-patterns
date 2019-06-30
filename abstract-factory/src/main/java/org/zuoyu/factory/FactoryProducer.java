package org.zuoyu.factory;

/**
 * 工厂创造器/生成器.
 *
 *
 * @author zuoyu
 * @program design-patterns
 * @create 2019-06-30 16:32
 **/
public class FactoryProducer {

  public enum FactoryType{
    /**
     * 形状工厂
     */
    SHAPE_FACTORY,
    /**
     * 颜色工厂
     */
    COLOR_FACTORY
  }

  /**
   * 获取工厂
   * @param factoryType - 工厂类型
   * @return - 工厂
   */
  public static AbstractFactory getFactory(FactoryType factoryType){
    if (factoryType == FactoryType.SHAPE_FACTORY){
      return new ShapeFactory();
    }
    if (factoryType == FactoryType.COLOR_FACTORY){
      return new ColorFactory();
    }
    return null;
  }
}
