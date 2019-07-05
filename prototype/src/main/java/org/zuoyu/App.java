package org.zuoyu;

import lombok.extern.java.Log;
import org.zuoyu.entity.BaseShape;
import org.zuoyu.entity.BaseShape.ShapeId;
import org.zuoyu.entity.Circle;
import org.zuoyu.util.ShapeCache;

/**
 * 使用 ShapeCache 类来获取存储在 Hashtable 中的形状的克隆.
 *
 * @author zuoyu
 */
@Log
public class App 
{
    public static void main( String[] args ) throws CloneNotSupportedException {
        ShapeCache.loadCache();
        BaseShape shapeCircle = ShapeCache.getShape(ShapeId.CIRCLE);
        shapeCircle.draw();
        log.info(shapeCircle.getShapeType());
        log.info("------------------------------");
        BaseShape shapeRectangle = ShapeCache.getShape(ShapeId.RECTANGLE);
        shapeRectangle.draw();
        log.info(shapeRectangle.getShapeType());
        log.info("------------------------------");
        BaseShape shapeSquare = ShapeCache.getShape(ShapeId.SQUARE);
        shapeSquare.draw();
        log.info(shapeSquare.getShapeType());
    }
}
