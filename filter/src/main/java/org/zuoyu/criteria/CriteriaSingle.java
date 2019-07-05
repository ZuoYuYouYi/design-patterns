package org.zuoyu.criteria;

import java.util.List;
import java.util.stream.Collectors;
import org.zuoyu.entity.Person;
import org.zuoyu.entity.Person.MaritalStatus;

/**
 * 婚姻状态为单身的过滤标准.
 *
 * @author zuoyu
 * @program design-patterns
 * @create 2019-07-05 16:25
 **/
public class CriteriaSingle implements Criteria {

  @Override
  public List<Person> meetCriteria(List<Person> persons) {
    return persons.stream().filter(person ->
        person.getMaritalStatus() == MaritalStatus.SINGLE).collect(Collectors.toList());
  }
}
