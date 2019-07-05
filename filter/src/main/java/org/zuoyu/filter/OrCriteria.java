package org.zuoyu.filter;

import java.util.List;
import java.util.stream.Collectors;
import org.zuoyu.criteria.Criteria;
import org.zuoyu.entity.Person;

/**
 * 条件至少符合一项的过滤方式.
 *
 * @author zuoyu
 * @program design-patterns
 * @create 2019-07-05 16:48
 **/
public class OrCriteria implements Criteria {

  private Criteria firstCriteria;

  private Criteria secondCriteria;

  public OrCriteria(Criteria firstCriteria, Criteria secondCriteria) {
    this.firstCriteria = firstCriteria;
    this.secondCriteria = secondCriteria;
  }


  @Override
  public List<Person> meetCriteria(List<Person> persons) {
    List<Person> personListFirst = firstCriteria.meetCriteria(persons);
    List<Person> personListSecond = secondCriteria.meetCriteria(persons);
    personListFirst.addAll(personListSecond);
    return personListFirst.stream().distinct().collect(Collectors.toList());
  }
}
