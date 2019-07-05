package org.zuoyu.entity;

import java.util.ArrayList;
import java.util.List;
import lombok.Data;

/**
 * 员工.
 *
 * 该类带有 Employee 对象的列表
 *
 * @author zuoyu
 * @program design-patterns
 * @create 2019-07-05 20:13
 **/
@Data
public class Employee {

  /**
   * 姓名
   */
  private String name;

  /**
   * 所属部门
   */
  private String department;

  /**
   * 薪水
   */
  private Double salary;

  /**
   * 下属
   */
  private List<Employee> subordinates;

  public Employee(String name, String department, Double salary) {
    this.name = name;
    this.department = department;
    this.salary = salary;
    this.subordinates = new ArrayList<>();
  }

  public Employee add(Employee employee) {
    this.subordinates.add(employee);
    return this;
  }

  public Employee remove(Employee employee) {
    this.subordinates.remove(employee);
    return this;
  }

  @Override
  public String toString() {
    return super.toString();
  }
}
