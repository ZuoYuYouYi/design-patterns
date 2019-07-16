package org.zuoyu;

import org.zuoyu.entity.Employee;

/**
 * 使用 Employee 类来创建和打印员工的层次结构。.
 *
 * @author zuoyu
 * @program design-patterns
 * @create 2019-07-16 11:47
 **/
public class App {

  public static void main(String[] args) {
    Employee CEO = new Employee("John", "CEO", 30000D);
    Employee headSales = new Employee("Robert", "Head Sales", 10000D);
    Employee headMarketing = new Employee("Michel", "Head Marketing", 10000D);
    Employee salesOne = new Employee("Laura", "Sales", 5000D);
    Employee salesTwo = new Employee("Bob", "sales", 5000D);
    Employee marketTwo = new Employee("Richard", "marketing", 5000D);
    Employee marketOne = new Employee("Rob", "marketing", 5000D);

    CEO.add(headMarketing).add(headSales);
    headMarketing.add(marketOne).add(marketTwo);
    headSales.add(salesOne).add(salesTwo);

    System.out.println(CEO);
    CEO.getSubordinates().forEach(head -> {
      System.out.println(head);
      head.getSubordinates().forEach(System.out::println);
    });
  }
}
