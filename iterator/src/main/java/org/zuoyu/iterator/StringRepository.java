package org.zuoyu.iterator;

import org.zuoyu.faucet.AbstractRepository;
import org.zuoyu.faucet.Iterator;

/**
 * 字符串仓库.
 *
 * @author zuoyu
 * @program design-patterns
 * @create 2019-07-26 19:34
 **/
public class StringRepository extends AbstractRepository<String> {

  public StringRepository() {
  }

  public StringRepository(int i) {
    super(i);
  }
}
