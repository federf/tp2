package randoop;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest0 {

  public static boolean debug = false;

  @Test
  public void test1() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test1"); }


    tp2.Server server0 = new tp2.Server();
    java.lang.String str1 = server0.toString();
    tp2.ITime iTime2 = server0.getTime();
    tp2.ITime iTime3 = server0.getTime();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    long long4 = server0.getLastUpdate();

  }

  @Test
  public void test2() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test2"); }


    tp2.Server server0 = new tp2.Server();
    java.lang.String str1 = server0.toString();
    tp2.ITime iTime2 = server0.getTime();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    long long3 = server0.getLastUpdate();

  }

  @Test
  public void test3() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test3"); }


    tp2.Server server0 = new tp2.Server();
    tp2.ITime iTime1 = server0.getTime();
    java.lang.String str2 = server0.toString();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    long long3 = server0.getLastUpdate();

  }

  @Test
  public void test4() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test4"); }


    tp2.Server server0 = new tp2.Server();
    tp2.ITime iTime1 = server0.getTime();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    long long2 = server0.getLastUpdate();

  }

}
