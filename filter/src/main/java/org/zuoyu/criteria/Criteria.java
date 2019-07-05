package org.zuoyu.criteria;

import java.util.List;
import org.zuoyu.entity.Person;

/**
 * 筛选标准.
 *
 * @author zuoyu
 * @program design-patterns
 * @create 2019-07-05 16:08
 **/
public interface Criteria {

  /**
   * 匹配标准
   * @param persons - 人物信息
   * @return - 符合标准的人物信息
   */
  List<Person> meetCriteria(List<Person> persons);
}
