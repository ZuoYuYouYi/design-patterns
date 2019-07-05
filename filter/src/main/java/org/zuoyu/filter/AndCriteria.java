package org.zuoyu.filter;

import java.util.List;
import org.zuoyu.criteria.Criteria;
import org.zuoyu.entity.Person;

/**
 * 条件都符合的过滤方式.
 *
 * @author zuoyu
 * @program design-patterns
 * @create 2019-07-05 16:34
 **/
public class AndCriteria implements Criteria{

  private Criteria firstCriteria;

  private Criteria secondCriteria;

  public AndCriteria(Criteria firstCriteria, Criteria secondCriteria) {
    this.firstCriteria = firstCriteria;
    this.secondCriteria = secondCriteria;
  }


  @Override
  public List<Person> meetCriteria(List<Person> persons) {
    return secondCriteria.meetCriteria(firstCriteria.meetCriteria(persons));
  }
}
