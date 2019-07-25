package org.zuoyu;

import lombok.extern.java.Log;
import org.zuoyu.expression.AndExpression;
import org.zuoyu.expression.OrExpression;
import org.zuoyu.expression.TerminalExpression;
import org.zuoyu.faucet.Expression;

/**
 * 使用 Expression 类来创建规则，并解析它们
 *
 * @author zuoyu
 */
@Log
public class App {

  public static void main(String[] args) {

    Expression manExpression = getManExpression();
    log.info("Tom is man?\t" + manExpression.interpret("Tom is man"));

    Expression amyExpression = getAmyExpression();
    log.info("Amy is married?\t" + amyExpression.interpret("Amy is married"));

    log.info("Amy is a married、affluence and beautiful woman?\t" + amyExpression
        .interpret("Amy is a married、affluence and beautiful woman"));
  }


  /**
   * 规则：Tom、Jack、John、Sam、Jim是男性
   */
  private static Expression getManExpression() {
    return new OrExpression()
        .addExpression(new TerminalExpression("Tom"))
        .addExpression(new TerminalExpression("Jack"))
        .addExpression(new TerminalExpression("John"))
        .addExpression(new TerminalExpression("Sam"))
        .addExpression(new TerminalExpression("Jim"));
  }

  private static Expression getAmyExpression() {
    return new AndExpression()
        .addExpression(new TerminalExpression("Amy"))
        .addExpression(new TerminalExpression("woman"))
        .addExpression(new TerminalExpression("married"))
        .addExpression(new TerminalExpression("affluence"))
        .addExpression(new TerminalExpression("beautiful"));
  }
}
