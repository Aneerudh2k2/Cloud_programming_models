package Concurrency;

class Assistant {
      boolean flag = false;

      public synchronized void Question(String msg) {
            if (flag) {
                  try {
                        wait();
                  } catch (InterruptedException e) {
                        e.printStackTrace();
                  }
            }
            System.out.println(msg);
            flag = true;
            notify();
      }

      public synchronized void Answer(String msg) {
            if (!flag) {
                  try {
                        wait();
                  } catch (InterruptedException e) {
                        e.printStackTrace();
                  }
            }
            System.out.println(msg);
            flag = false;
            notify();
      }
}

class Thread1 implements Runnable {
      Assistant m;
      String[] s1 = { "Hi", "How are you ?", "I am also doing fine!" };

      public Thread1(Assistant m1) {
            this.m = m1;
            new Thread(this, "Question").start();
      }

      public void run() {
            for (int i = 0; i < s1.length; i++) {
                  m.Question(s1[i]);
            }
      }
}

class Thread2 implements Runnable {
      Assistant m;
      String[] s2 = { "Hi", "I'm good, what about you?", "Great!" };

      public Thread2(Assistant m2) {
            this.m = m2;
            new Thread(this, "Answer").start();
      }

      public void run() {
            for (int i = 0; i < s2.length; i++) {
                  m.Answer(s2[i]);
            }
      }
}

public class Concurrency {
      public static void main(String[] args) {
            Assistant m = new Assistant();
            new Thread1(m);
            new Thread2(m);
      }
}