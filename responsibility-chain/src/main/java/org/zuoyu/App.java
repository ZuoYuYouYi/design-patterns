package org.zuoyu;

import org.zuoyu.entity.AbstractLogger;
import org.zuoyu.entity.Level;
import org.zuoyu.logger.ConsoleLogger;
import org.zuoyu.logger.CustomLogger;
import org.zuoyu.logger.FileLogger;

/**
 * 每个记录器中的下一个记录器代表的是链的一部分。
 *
 * @author zuoyu
 */
public class App 
{
    public static void main( String[] args )
    {
//        查看ConsoleLogger的记录器链
        new ConsoleLogger().logMessage("test ConsoleLogger");

//        自定义记录器链
        AbstractLogger debugLogger = new CustomLogger(Level.DEBUG);
        AbstractLogger firstLogger = new CustomLogger(Level.WARNING);
        AbstractLogger secondLogger = new CustomLogger(Level.ERROR);
        firstLogger.setNextLogger(secondLogger);
        debugLogger.setNextLogger(firstLogger);
        debugLogger.logMessage("this is test for debugLogger");
    }
}
