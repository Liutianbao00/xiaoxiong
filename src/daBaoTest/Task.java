package daBaoTest;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class Task {
    static class task1 implements Runnable{
        private int id;
        public task1(int id){
            this.id = id;
        }
        @Override
        public void run() {
            System.out.println("线程的编号" + Thread.currentThread().getName() +"线程id=" + id);
        }

    }

    public static void main(String[] args) {
        ThreadPoolExecutor executor = (ThreadPoolExecutor) Executors.newCachedThreadPool();
        daBao_List dabao = new daBao_List();
        daBao_List.test();
        for (int i = 0; i < 2; i++) {
            //ThreadPoolExecutor的execute方法
            executor.execute(new task1(i));
        }


        //多线程任务执行完毕，关闭线程池
        executor.shutdown();
    }
}
