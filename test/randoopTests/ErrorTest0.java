package randoopTests;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest0 {

  public static boolean debug = false;

  @Test
  public void test1() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test1"); }


    tp2.Server server1 = new tp2.Server(1);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    long long2 = server1.getLastUpdate();

  }

  @Test
  public void test2() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test2"); }


    tp2.Server server1 = new tp2.Server(0);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    long long2 = server1.getLastUpdate();

  }

  @Test
  public void test3() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test3"); }


    tp2.Server server1 = new tp2.Server(10);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    long long2 = server1.getLastUpdate();

  }

  @Test
  public void test4() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test4"); }


    tp2.Server server1 = new tp2.Server((-1));
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    long long2 = server1.getLastUpdate();

  }

  @Test
  public void test5() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test5"); }


    tp2.Server server0 = new tp2.Server();
    boolean b1 = server0.repOK();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    long long2 = server0.getLastUpdate();

  }

  @Test
  public void test6() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test6"); }


    tp2.Server server0 = new tp2.Server();
    java.lang.String str1 = server0.toString();
    boolean b2 = server0.repOK();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    long long3 = server0.getLastUpdate();

  }

  @Test
  public void test7() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test7"); }


    tp2.Server server1 = new tp2.Server(100);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    long long2 = server1.getLastUpdate();

  }

  @Test
  public void test8() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test8"); }


    tp2.Server server0 = new tp2.Server();
    java.lang.String str1 = server0.toString();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    long long2 = server0.getLastUpdate();

  }

  @Test
  public void test9() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test9"); }


    tp2.Server server0 = new tp2.Server();
    boolean b1 = server0.repOK();
    boolean b2 = server0.repOK();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    long long3 = server0.getLastUpdate();

  }

}
