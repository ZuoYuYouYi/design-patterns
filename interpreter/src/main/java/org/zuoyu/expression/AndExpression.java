package org.zuoyu.expression;

import java.util.HashSet;
import java.util.Set;
import lombok.extern.java.Log;
import org.zuoyu.faucet.Expression;

/**
 * “并且”表达式.
 *
 * @author zuoyu
 * @program design-patterns
 * @create 2019-07-25 19:05
 **/
@Log
public class AndExpression implements Expression {

  private Set<Expression> expressions = new HashSet<>();

  private Boolean bool;

  @Override
  public boolean interpret(String context) {
    this.expressions.forEach(expression -> {
      if (bool == null) {
        bool = expression.interpret(context);
      }
      bool = bool && expression.interpret(context);
    });
    boolean flag = bool;
    bool = null;
    return flag;
  }

  /**
   * 添加表达式
   *
   * @param expression - 表达式
   * @return -
   */
  public AndExpression addExpression(Expression expression) {
    this.expressions.add(expression);
    return this;
  }

}
