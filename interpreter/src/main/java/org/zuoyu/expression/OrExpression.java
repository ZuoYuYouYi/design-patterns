package org.zuoyu.expression;

import java.util.HashSet;
import java.util.Set;
import org.zuoyu.faucet.Expression;

/**
 * “或”表达式.
 *
 * @author zuoyu
 * @program design-patterns
 * @create 2019-07-25 18:59
 **/
public class OrExpression implements Expression {


  private Set<Expression> expressions = new HashSet<>();


  @Override
  public boolean interpret(final String context) {
    for (Expression expression : this.expressions) {
      if (expression.interpret(context)) {
        return true;
      }
    }
    return false;
  }

  /**
   * 添加表达式
   *
   * @param expression - 表达式
   * @return -
   */
  public OrExpression addExpression(Expression expression) {
    boolean b = this.expressions.add(expression);
    return this;
  }
}
