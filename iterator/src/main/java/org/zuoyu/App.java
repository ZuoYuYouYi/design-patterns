package org.zuoyu;

import lombok.extern.java.Log;
import org.zuoyu.faucet.AbstractRepository;
import org.zuoyu.faucet.Iterator;
import org.zuoyu.iterator.IntegerRepository;
import org.zuoyu.iterator.StringRepository;

/**
 * 使用 StringRepository 来获取迭代器
 * @author zuoyu
 */
@Log
public class App {

  public static void main(String[] args) {
    StringRepository stringRepository = new StringRepository(2);
    stringRepository.add("Hello\t1");
    stringRepository.add("Hello\t2");
    stringRepository.add("Hello\t3");
    stringRepository.add("Hello\t4");
    stringRepository.add("Hello\t5");
    stringRepository.add("Hello\t6");
    Iterator<String> stringIterator= stringRepository.getIterator();
    while (stringIterator.hasNext()){
      log.info(stringIterator.next());
    }

//    IntegerRepository integerRepository = new IntegerRepository();
//    int num = 100;
//    for (int i = 0; i < num; i++) {
//      integerRepository.add(i);
//    }
//    Iterator<Integer> integerIterator = integerRepository.getIterator();
//    while (integerIterator.hasNext()){
//      log.info(integerIterator.next().toString());
//    }

    AbstractRepository<Double> doubleRepository = new AbstractRepository<Double>(){};
    int doubleNum = 50;
    for (int i = 0; i < doubleNum; i++) {
      doubleRepository.add(Math.random());
    }
    Iterator<Double> doubleIterator = doubleRepository.getIterator();
    while (doubleIterator.hasNext()){
      log.info(doubleIterator.next().toString());
    }
  }
}
