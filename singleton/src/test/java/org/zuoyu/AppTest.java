package org.zuoyu;

import java.util.HashSet;
import java.util.Set;
import org.databene.contiperf.PerfTest;
import org.databene.contiperf.junit.ContiPerfRule;
import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.zuoyu.util.CheckIn;
import org.zuoyu.util.DoubleCheckL;
import org.zuoyu.util.Enumerate;
import org.zuoyu.util.HungryBones;
import org.zuoyu.util.LazyBones;
import org.zuoyu.util.LazyBonesThread;

/**
 * 多线程测试
 */
//  invocations表示每秒执行次数
//  threads表示线程数
//  duration表示执行持续的毫秒数
@PerfTest(invocations = 10, threads = 100, duration = 5000)
public class AppTest {

  //  1）PerfTest参数
//  @PerfTest(invocations = 300)：执行300次，和线程数量无关，默认值为1，表示执行1次；
//  @PerfTest(threads=30)：并发执行30个线程，默认值为1个线程；
//  @PerfTest(duration = 20000)：重复地执行测试至少执行20s。
//  2）Required参数
//  @Required(throughput = 20)：要求每秒至少执行20个测试；
//  @Required(average = 50)：要求平均执行时间不超过50ms；
//  @Required(median = 45)：要求所有执行的50%不超过45ms；
//  @Required(max = 2000)：要求没有测试超过2s；
//  @Required(totalTime = 5000)：要求总的执行时间不超过5s；
//  @Required(percentile90 = 3000)：要求90%的测试不超过3s；
//  @Required(percentile95 = 5000)：要求95%的测试不超过5s；
//  @Required(percentile99 = 10000)：要求99%的测试不超过10s;
//  @Required(percentiles = "66:200,96:500")：要求66%的测试不超过200ms，96%的测试不超过500ms。
//
  @Rule
  public ContiPerfRule contiPerfRule = new ContiPerfRule();

  private Set<String> results;

  @Before
  public void beforeTest() {
    results = new HashSet<>();
  }

  @After
  public void afterTest() {
    results.forEach(System.out::println);
  }

  /**
   * 测试登记式/静态内部类
   */
  @Test
  public void testCheckIn() {
    CheckIn checkIn = CheckIn.getInstance();
    checkIn.showClassMessage();
    results.add(checkIn.writeClassMessage());
  }

  /**
   * 测试双检锁/双重校验锁
   */
  @Test
  public void testDoubleCheckL() {
    DoubleCheckL doubleCheckL = DoubleCheckL.getInstance();
    doubleCheckL.showClassMessage();
    results.add(doubleCheckL.writeClassMessage());
  }

  /**
   * 测试枚举式
   */
  @Test
  public void testEnumerate(){
    Enumerate enumerate = Enumerate.INTERFACE;
    enumerate.showClassMessage();
    results.add(enumerate.writeClassMessage());
  }

  /**
   * 测试饿汉式
   */
  @Test
  public void testHungryBones(){
    HungryBones hungryBones = HungryBones.getInstance();
    hungryBones.showClassMessage();
    results.add(hungryBones.writeClassMessage());
  }

  @Test
  public void testLazyBones(){
    LazyBones lazyBones = LazyBones.getInstance();
    lazyBones.showClassMessage();
    results.add(lazyBones.writeClassMessage());
  }

  @Test
  public void testLazyBonesThread(){
    LazyBonesThread lazyBonesThread = LazyBonesThread.getInstance();
    lazyBonesThread.showClassMessage();
    results.add(lazyBonesThread.writeClassMessage());
  }
}
