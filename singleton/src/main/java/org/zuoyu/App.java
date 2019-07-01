package org.zuoyu;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import lombok.extern.java.Log;
import org.zuoyu.util.DoubleCheckL;
import org.zuoyu.util.Lazybones;
import org.zuoyu.util.LazybonesThread;

/**
 * 1、单例类只能有一个实例。
 *
 * 2、单例类必须自己创建自己的唯一实例。
 *
 * 3、单例类必须给所有其他对象提供这一实例。
 *
 * @author zuoyu
 */
@Log
public class App {

  private static class SingletonThread implements Runnable {

    @Override
    public void run() {
      //    CheckIn.getInstance().showClassMessage();
    DoubleCheckL.getInstance().showClassMessage();
//    Enumerate.INTERFACE.showClassMessage();
//      HungryBones.getInstance().showClassMessage();
//      Lazybones.getInstance().showClassMessage();
//    LazybonesThread.getInstance().showClassMessage();
    }
  }

  public static void main(String[] args) {

    SingletonThread singletonThread = new SingletonThread();
    ExecutorService executorService = Executors.newFixedThreadPool( 4);
    for (int i = 0; i < 10; i++) {
      executorService.submit(singletonThread);
    }
    executorService.shutdown();
  }
}
