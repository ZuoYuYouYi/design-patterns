package org.zuoyu.criteria;

import java.util.List;
import java.util.stream.Collectors;
import org.zuoyu.entity.Person;
import org.zuoyu.entity.Person.Gender;

/**
 * 性别为男性的过滤标准.
 *
 * @author zuoyu
 * @program design-patterns
 * @create 2019-07-05 16:18
 **/
public class CriteriaMale implements Criteria {

  @Override
  public List<Person> meetCriteria(List<Person> persons) {
    return persons.stream().filter(person ->
        person.getGender() == Gender.MALE).collect(Collectors.toList());
  }
}
