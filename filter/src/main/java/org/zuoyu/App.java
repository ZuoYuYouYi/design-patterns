package org.zuoyu;

import java.util.Arrays;
import java.util.List;
import org.zuoyu.criteria.Criteria;
import org.zuoyu.criteria.CriteriaFemale;
import org.zuoyu.criteria.CriteriaMale;
import org.zuoyu.criteria.CriteriaMarried;
import org.zuoyu.criteria.CriteriaSingle;
import org.zuoyu.entity.Person;
import org.zuoyu.entity.Person.Gender;
import org.zuoyu.entity.Person.MaritalStatus;
import org.zuoyu.filter.AndCriteria;
import org.zuoyu.filter.OrCriteria;

/**
 * 使用不同的标准（Criteria）和它们的结合来过滤 Person 对象的列表
 * @author zuoyu
 */
public class App 
{
    public static void main( String[] args )
    {
        List<Person> personList = Arrays.asList(
            new Person("Sam", Gender.MALE, MaritalStatus.SINGLE),
            new Person("Robert", Gender.MALE, MaritalStatus.MARRIED),
            new Person("John", Gender.MALE, MaritalStatus.SINGLE),
            new Person("Amy", Gender.FEMALE, MaritalStatus.SINGLE),
            new Person("Laura", Gender.FEMALE, MaritalStatus.MARRIED),
            new Person("Diana", Gender.FEMALE, MaritalStatus.MARRIED),
            new Person("Mike", Gender.MALE, MaritalStatus.SINGLE),
            new Person("Bobby", Gender.MALE, MaritalStatus.SINGLE)
        );

        Criteria criteriaFemale = new CriteriaFemale();
        Criteria criteriaMale = new CriteriaMale();
        Criteria criteriaMarried = new CriteriaMarried();
        Criteria criteriaSingle = new CriteriaSingle();

        System.out.println("criteriaFemale:");
        criteriaFemale.meetCriteria(personList).forEach(System.out::println);

        System.out.println("\n");

        System.out.println("criteriaMale:");
        criteriaMale.meetCriteria(personList).forEach(System.out::println);

        System.out.println("\n");

        System.out.println("criteriaMarried:");
        criteriaMarried.meetCriteria(personList).forEach(System.out::println);

        System.out.println("\n");

        System.out.println("criteriaSingle:");
        criteriaSingle.meetCriteria(personList).forEach(System.out::println);

        System.out.println("\n");

        System.out.println("andCriteria:");
        new AndCriteria(criteriaMale, criteriaMarried).meetCriteria(personList).forEach(System.out::println);

        System.out.println("\n");

        System.out.println("orCriteria:");
        new OrCriteria(criteriaMale, criteriaMarried).meetCriteria(personList).forEach(System.out::println);
    }
}
