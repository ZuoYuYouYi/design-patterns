package org.zuoyu.expression;

import lombok.AllArgsConstructor;
import org.zuoyu.faucet.Expression;

/**
 * 解释器终端.
 *
 * @author zuoyu
 * @program design-patterns
 * @create 2019-07-25 18:36
 **/
@AllArgsConstructor
public class TerminalExpression implements Expression {

  private String data;

  @Override
  public boolean interpret(String context) {
    return context.contains(data);
  }
}
