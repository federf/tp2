package randoopTests;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest2 {

  public static boolean debug = false;

  @Test
  public void test001() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test001"); }


    tp2.Server server1 = new tp2.Server(1);
    tp2.IP iP2 = null;
    boolean b3 = server1.removeBan(iP2);
    server1.update();
    long long5 = server1.getLastUpdate();
    tp2.IP iP6 = null;
    boolean b7 = server1.connect(iP6);
    tp2.IP iP8 = null;
    boolean b9 = server1.removeBan(iP8);
    tp2.IP iP10 = null;
    boolean b11 = server1.addBan(iP10);
    long long12 = server1.getLastUpdate();
    tp2.IP iP13 = null;
    boolean b14 = server1.removeException(iP13);
    tp2.IP iP15 = null;
    // The following exception was thrown during execution in test generation
    try {
      boolean b16 = server1.connect(iP15);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long5 == 250000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long12 == 250000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);

  }

  @Test
  public void test002() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test002"); }


    tp2.Server server1 = new tp2.Server(1);
    tp2.IP iP2 = null;
    boolean b3 = server1.removeBan(iP2);
    tp2.ITime iTime4 = null;
    server1.setTime(iTime4);
    tp2.IP iP6 = null;
    boolean b7 = server1.removeBan(iP6);
    java.lang.String str8 = server1.toString();
    tp2.ITime iTime9 = null;
    server1.setTime(iTime9);
    tp2.IP iP11 = null;
    boolean b12 = server1.removeBan(iP11);
    java.lang.String str13 = server1.toString();
    java.lang.String str14 = server1.toString();
    tp2.ITime iTime15 = null;
    server1.setTime(iTime15);
    tp2.IP iP17 = null;
    boolean b18 = server1.connect(iP17);
    tp2.IP iP19 = null;
    // The following exception was thrown during execution in test generation
    try {
      boolean b20 = server1.addBan(iP19);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Server [lastUpdate=null, exceptions=(), bans={}]"+ "'", str8.equals("Server [lastUpdate=null, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Server [lastUpdate=null, exceptions=(), bans={}]"+ "'", str13.equals("Server [lastUpdate=null, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "Server [lastUpdate=null, exceptions=(), bans={}]"+ "'", str14.equals("Server [lastUpdate=null, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);

  }

  @Test
  public void test003() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test003"); }


    tp2.Server server1 = new tp2.Server(1);
    tp2.IP iP2 = null;
    boolean b3 = server1.connect(iP2);
    tp2.IP iP4 = null;
    boolean b5 = server1.addBan(iP4);
    tp2.IP iP6 = null;
    boolean b7 = server1.removeException(iP6);
    java.lang.String str8 = server1.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Server [lastUpdate=null, exceptions=(), bans={[IPBan [ip=null, expires=310000]]}]"+ "'", str8.equals("Server [lastUpdate=null, exceptions=(), bans={[IPBan [ip=null, expires=310000]]}]"));

  }

  @Test
  public void test004() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test004"); }


    tp2.Server server1 = new tp2.Server(1);
    tp2.IP iP2 = null;
    boolean b3 = server1.removeBan(iP2);
    server1.update();
    tp2.IP iP5 = null;
    boolean b6 = server1.removeBan(iP5);
    tp2.IP iP7 = null;
    boolean b8 = server1.removeBan(iP7);
    java.lang.String str9 = server1.toString();
    boolean b10 = server1.repOK();
    tp2.IP iP11 = null;
    boolean b12 = server1.connect(iP11);
    tp2.IP iP13 = null;
    boolean b14 = server1.removeException(iP13);
    tp2.IP iP15 = null;
    boolean b16 = server1.removeException(iP15);
    long long17 = server1.getLastUpdate();
    tp2.IP iP18 = null;
    // The following exception was thrown during execution in test generation
    try {
      boolean b19 = server1.addException(iP18);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Server [lastUpdate=250000, exceptions=(), bans={}]"+ "'", str9.equals("Server [lastUpdate=250000, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long17 == 250000L);

  }

  @Test
  public void test005() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test005"); }


    tp2.Server server0 = new tp2.Server();
    server0.update();
    tp2.IP iP2 = null;
    boolean b3 = server0.removeBan(iP2);
    server0.update();
    tp2.IP iP5 = null;
    boolean b6 = server0.addBan(iP5);
    long long7 = server0.getLastUpdate();
    tp2.IP iP8 = null;
    boolean b9 = server0.removeException(iP8);
    tp2.ITime iTime10 = null;
    server0.setTime(iTime10);
    tp2.IP iP12 = null;
    // The following exception was thrown during execution in test generation
    try {
      boolean b13 = server0.removeBan(iP12);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long7 == 1465347897733L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);

  }

  @Test
  public void test006() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test006"); }


    tp2.Server server1 = new tp2.Server(1);
    tp2.IP iP2 = null;
    boolean b3 = server1.removeBan(iP2);
    tp2.ITime iTime4 = null;
    server1.setTime(iTime4);
    tp2.IP iP6 = null;
    boolean b7 = server1.removeBan(iP6);
    java.lang.String str8 = server1.toString();
    tp2.ITime iTime9 = null;
    server1.setTime(iTime9);
    tp2.IP iP11 = null;
    boolean b12 = server1.removeBan(iP11);
    tp2.IP iP13 = null;
    boolean b14 = server1.removeException(iP13);
    tp2.IP iP15 = null;
    boolean b16 = server1.connect(iP15);
    tp2.ITime iTime17 = null;
    server1.setTime(iTime17);
    tp2.IP iP19 = null;
    // The following exception was thrown during execution in test generation
    try {
      boolean b20 = server1.addException(iP19);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Server [lastUpdate=null, exceptions=(), bans={}]"+ "'", str8.equals("Server [lastUpdate=null, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);

  }

  @Test
  public void test007() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test007"); }


    tp2.Server server0 = new tp2.Server();
    server0.update();
    server0.update();
    tp2.IP iP3 = null;
    boolean b4 = server0.addBan(iP3);
    long long5 = server0.getLastUpdate();
    tp2.IP iP6 = null;
    // The following exception was thrown during execution in test generation
    try {
      boolean b7 = server0.addBan(iP6);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long5 == 1465347897738L);

  }

  @Test
  public void test008() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test008"); }


    tp2.Server server1 = new tp2.Server(1);
    tp2.IP iP2 = null;
    boolean b3 = server1.removeBan(iP2);
    tp2.ITime iTime4 = null;
    server1.setTime(iTime4);
    tp2.IP iP6 = null;
    boolean b7 = server1.removeBan(iP6);
    tp2.ITime iTime8 = null;
    server1.setTime(iTime8);
    java.lang.String str10 = server1.toString();
    boolean b11 = server1.repOK();
    tp2.IP iP12 = null;
    boolean b13 = server1.removeBan(iP12);
    tp2.IP iP14 = null;
    boolean b15 = server1.connect(iP14);
    tp2.ITime iTime16 = null;
    server1.setTime(iTime16);
    tp2.ITime iTime18 = null;
    server1.setTime(iTime18);
    tp2.IP iP20 = null;
    // The following exception was thrown during execution in test generation
    try {
      boolean b21 = server1.addException(iP20);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Server [lastUpdate=null, exceptions=(), bans={}]"+ "'", str10.equals("Server [lastUpdate=null, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);

  }

  @Test
  public void test009() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test009"); }


    tp2.Server server0 = new tp2.Server();
    server0.update();
    boolean b2 = server0.repOK();
    tp2.IP iP3 = null;
    boolean b4 = server0.connect(iP3);
    server0.update();
    java.lang.String str6 = server0.toString();
    tp2.IP iP7 = null;
    boolean b8 = server0.removeException(iP7);
    tp2.ITime iTime9 = null;
    server0.setTime(iTime9);
    tp2.IP iP11 = null;
    // The following exception was thrown during execution in test generation
    try {
      boolean b12 = server0.addException(iP11);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Server [lastUpdate=1465347897743, exceptions=(), bans={}]"+ "'", str6.equals("Server [lastUpdate=1465347897743, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);

  }

  @Test
  public void test010() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test010"); }


    tp2.Server server1 = new tp2.Server(1);
    tp2.IP iP2 = null;
    boolean b3 = server1.removeBan(iP2);
    tp2.ITime iTime4 = null;
    server1.setTime(iTime4);
    tp2.IP iP6 = null;
    boolean b7 = server1.removeBan(iP6);
    tp2.ITime iTime8 = null;
    server1.setTime(iTime8);
    tp2.ITime iTime10 = null;
    server1.setTime(iTime10);
    tp2.ITime iTime12 = null;
    server1.setTime(iTime12);
    tp2.ITime iTime14 = null;
    server1.setTime(iTime14);
    // The following exception was thrown during execution in test generation
    try {
      long long16 = server1.getLastUpdate();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);

  }

  @Test
  public void test011() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test011"); }


    tp2.Server server1 = new tp2.Server(0);
    tp2.IP iP2 = null;
    boolean b3 = server1.removeException(iP2);
    tp2.ITime iTime4 = null;
    server1.setTime(iTime4);
    tp2.ITime iTime6 = null;
    server1.setTime(iTime6);
    // The following exception was thrown during execution in test generation
    try {
      long long8 = server1.getLastUpdate();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);

  }

  @Test
  public void test012() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test012"); }


    tp2.Server server1 = new tp2.Server(1);
    tp2.IP iP2 = null;
    boolean b3 = server1.removeBan(iP2);
    tp2.ITime iTime4 = null;
    server1.setTime(iTime4);
    tp2.IP iP6 = null;
    boolean b7 = server1.removeBan(iP6);
    tp2.ITime iTime8 = null;
    server1.setTime(iTime8);
    tp2.ITime iTime10 = null;
    server1.setTime(iTime10);
    boolean b12 = server1.repOK();
    tp2.IP iP13 = null;
    boolean b14 = server1.connect(iP13);
    tp2.IP iP15 = null;
    boolean b16 = server1.connect(iP15);
    tp2.IP iP17 = null;
    // The following exception was thrown during execution in test generation
    try {
      boolean b18 = server1.addBan(iP17);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);

  }

  @Test
  public void test013() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test013"); }


    tp2.Server server0 = new tp2.Server();
    boolean b1 = server0.repOK();
    tp2.ITime iTime2 = null;
    server0.setTime(iTime2);
    java.lang.String str4 = server0.toString();
    tp2.IP iP5 = null;
    boolean b6 = server0.removeBan(iP5);
    tp2.ITime iTime7 = null;
    server0.setTime(iTime7);
    tp2.ITime iTime9 = null;
    server0.setTime(iTime9);
    // The following exception was thrown during execution in test generation
    try {
      long long11 = server0.getLastUpdate();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Server [lastUpdate=null, exceptions=(), bans={}]"+ "'", str4.equals("Server [lastUpdate=null, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);

  }

  @Test
  public void test014() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test014"); }


    tp2.Server server0 = new tp2.Server();
    boolean b1 = server0.repOK();
    server0.update();
    server0.update();
    boolean b4 = server0.repOK();
    long long5 = server0.getLastUpdate();
    server0.update();
    tp2.IP iP7 = null;
    boolean b8 = server0.removeBan(iP7);
    tp2.ITime iTime9 = null;
    server0.setTime(iTime9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long5 == 1465347897771L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);

  }

  @Test
  public void test015() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test015"); }


    tp2.Server server1 = new tp2.Server((-1));
    server1.update();
    tp2.IP iP3 = null;
    boolean b4 = server1.removeException(iP3);
    long long5 = server1.getLastUpdate();
    tp2.ITime iTime6 = null;
    server1.setTime(iTime6);
    tp2.IP iP8 = null;
    boolean b9 = server1.connect(iP8);
    long long10 = server1.getLastUpdate();
    tp2.ITime iTime11 = null;
    server1.setTime(iTime11);
    java.lang.String str13 = server1.toString();
    tp2.IP iP14 = null;
    boolean b15 = server1.connect(iP14);
    // The following exception was thrown during execution in test generation
    try {
      server1.update();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long5 == 250000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long10 == 250000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Server [lastUpdate=250000, exceptions=(), bans={}]"+ "'", str13.equals("Server [lastUpdate=250000, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);

  }

  @Test
  public void test016() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test016"); }


    tp2.Server server1 = new tp2.Server((-1));
    server1.update();
    server1.update();
    tp2.IP iP4 = null;
    boolean b5 = server1.removeBan(iP4);
    long long6 = server1.getLastUpdate();
    tp2.IP iP7 = null;
    boolean b8 = server1.removeBan(iP7);
    tp2.IP iP9 = null;
    boolean b10 = server1.connect(iP9);
    tp2.IP iP11 = null;
    boolean b12 = server1.removeBan(iP11);
    tp2.IP iP13 = null;
    boolean b14 = server1.addBan(iP13);
    tp2.IP iP15 = null;
    // The following exception was thrown during execution in test generation
    try {
      boolean b16 = server1.removeBan(iP15);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long6 == 250000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);

  }

  @Test
  public void test017() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test017"); }


    tp2.Server server1 = new tp2.Server((-1));
    server1.update();
    boolean b3 = server1.repOK();
    tp2.IP iP4 = null;
    boolean b5 = server1.connect(iP4);
    tp2.ITime iTime6 = null;
    server1.setTime(iTime6);
    tp2.ITime iTime8 = null;
    server1.setTime(iTime8);
    tp2.IP iP10 = null;
    // The following exception was thrown during execution in test generation
    try {
      boolean b11 = server1.addBan(iP10);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);

  }

  @Test
  public void test018() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test018"); }


    tp2.Server server1 = new tp2.Server(1);
    tp2.IP iP2 = null;
    boolean b3 = server1.removeBan(iP2);
    server1.update();
    tp2.IP iP5 = null;
    boolean b6 = server1.removeBan(iP5);
    long long7 = server1.getLastUpdate();
    server1.update();
    tp2.IP iP9 = null;
    boolean b10 = server1.removeBan(iP9);
    tp2.ITime iTime11 = null;
    server1.setTime(iTime11);
    tp2.IP iP13 = null;
    boolean b14 = server1.removeBan(iP13);
    // The following exception was thrown during execution in test generation
    try {
      server1.update();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long7 == 250000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);

  }

  @Test
  public void test019() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test019"); }


    tp2.Server server1 = new tp2.Server((-1));
    server1.update();
    server1.update();
    tp2.IP iP4 = null;
    boolean b5 = server1.removeBan(iP4);
    long long6 = server1.getLastUpdate();
    tp2.IP iP7 = null;
    boolean b8 = server1.removeBan(iP7);
    tp2.IP iP9 = null;
    boolean b10 = server1.connect(iP9);
    tp2.IP iP11 = null;
    // The following exception was thrown during execution in test generation
    try {
      boolean b12 = server1.addException(iP11);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long6 == 250000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);

  }

  @Test
  public void test020() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test020"); }


    tp2.Server server1 = new tp2.Server(1);
    tp2.IP iP2 = null;
    boolean b3 = server1.removeBan(iP2);
    server1.update();
    long long5 = server1.getLastUpdate();
    tp2.IP iP6 = null;
    boolean b7 = server1.connect(iP6);
    tp2.IP iP8 = null;
    boolean b9 = server1.removeBan(iP8);
    tp2.IP iP10 = null;
    boolean b11 = server1.connect(iP10);
    boolean b12 = server1.repOK();
    tp2.IP iP13 = null;
    boolean b14 = server1.removeException(iP13);
    tp2.IP iP15 = null;
    // The following exception was thrown during execution in test generation
    try {
      boolean b16 = server1.addException(iP15);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long5 == 250000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);

  }

  @Test
  public void test021() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test021"); }


    tp2.Server server0 = new tp2.Server();
    java.lang.String str1 = server0.toString();
    boolean b2 = server0.repOK();
    tp2.ITime iTime3 = null;
    server0.setTime(iTime3);
    tp2.IP iP5 = null;
    // The following exception was thrown during execution in test generation
    try {
      boolean b6 = server0.addBan(iP5);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Server [lastUpdate=null, exceptions=(), bans={}]"+ "'", str1.equals("Server [lastUpdate=null, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);

  }

  @Test
  public void test022() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test022"); }


    tp2.Server server0 = new tp2.Server();
    server0.update();
    tp2.IP iP2 = null;
    boolean b3 = server0.removeBan(iP2);
    server0.update();
    tp2.ITime iTime5 = null;
    server0.setTime(iTime5);
    tp2.IP iP7 = null;
    boolean b8 = server0.connect(iP7);
    tp2.ITime iTime9 = null;
    server0.setTime(iTime9);
    tp2.IP iP11 = null;
    boolean b12 = server0.removeBan(iP11);
    tp2.IP iP13 = null;
    boolean b14 = server0.removeBan(iP13);
    // The following exception was thrown during execution in test generation
    try {
      server0.update();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);

  }

  @Test
  public void test023() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test023"); }


    tp2.Server server1 = new tp2.Server(1);
    tp2.IP iP2 = null;
    boolean b3 = server1.removeBan(iP2);
    server1.update();
    tp2.IP iP5 = null;
    boolean b6 = server1.removeBan(iP5);
    long long7 = server1.getLastUpdate();
    java.lang.String str8 = server1.toString();
    tp2.ITime iTime9 = null;
    server1.setTime(iTime9);
    java.lang.String str11 = server1.toString();
    tp2.IP iP12 = null;
    boolean b13 = server1.connect(iP12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long7 == 250000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Server [lastUpdate=250000, exceptions=(), bans={}]"+ "'", str8.equals("Server [lastUpdate=250000, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Server [lastUpdate=250000, exceptions=(), bans={}]"+ "'", str11.equals("Server [lastUpdate=250000, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);

  }

  @Test
  public void test024() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test024"); }


    tp2.Server server1 = new tp2.Server(100);
    tp2.ITime iTime2 = null;
    server1.setTime(iTime2);
    tp2.IP iP4 = null;
    boolean b5 = server1.connect(iP4);
    tp2.IP iP6 = null;
    boolean b7 = server1.removeBan(iP6);
    // The following exception was thrown during execution in test generation
    try {
      long long8 = server1.getLastUpdate();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);

  }

  @Test
  public void test025() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test025"); }


    tp2.Server server1 = new tp2.Server(1);
    tp2.IP iP2 = null;
    boolean b3 = server1.removeBan(iP2);
    tp2.ITime iTime4 = null;
    server1.setTime(iTime4);
    tp2.IP iP6 = null;
    boolean b7 = server1.removeBan(iP6);
    tp2.ITime iTime8 = null;
    server1.setTime(iTime8);
    tp2.ITime iTime10 = null;
    server1.setTime(iTime10);
    tp2.IP iP12 = null;
    boolean b13 = server1.connect(iP12);
    tp2.IP iP14 = null;
    boolean b15 = server1.connect(iP14);
    tp2.IP iP16 = null;
    boolean b17 = server1.connect(iP16);
    tp2.IP iP18 = null;
    // The following exception was thrown during execution in test generation
    try {
      boolean b19 = server1.addException(iP18);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);

  }

  @Test
  public void test026() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test026"); }


    tp2.Server server0 = new tp2.Server();
    server0.update();
    tp2.IP iP2 = null;
    boolean b3 = server0.removeBan(iP2);
    server0.update();
    java.lang.String str5 = server0.toString();
    tp2.IP iP6 = null;
    boolean b7 = server0.removeException(iP6);
    boolean b8 = server0.repOK();
    tp2.IP iP9 = null;
    boolean b10 = server0.addBan(iP9);
    boolean b11 = server0.repOK();
    tp2.IP iP12 = null;
    boolean b13 = server0.removeException(iP12);
    java.lang.String str14 = server0.toString();
    boolean b15 = server0.repOK();
    tp2.ITime iTime16 = null;
    server0.setTime(iTime16);
    tp2.IP iP18 = null;
    // The following exception was thrown during execution in test generation
    try {
      boolean b19 = server0.connect(iP18);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Server [lastUpdate=1465347897820, exceptions=(), bans={}]"+ "'", str5.equals("Server [lastUpdate=1465347897820, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "Server [lastUpdate=1465347897820, exceptions=(), bans={[IPBan [ip=null, expires=1465347957820]]}]"+ "'", str14.equals("Server [lastUpdate=1465347897820, exceptions=(), bans={[IPBan [ip=null, expires=1465347957820]]}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);

  }

  @Test
  public void test027() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test027"); }


    tp2.Server server0 = new tp2.Server();
    boolean b1 = server0.repOK();
    tp2.IP iP2 = null;
    boolean b3 = server0.addBan(iP2);
    tp2.IP iP4 = null;
    boolean b5 = server0.removeException(iP4);
    java.lang.String str6 = server0.toString();
    tp2.IP iP7 = null;
    // The following exception was thrown during execution in test generation
    try {
      boolean b8 = server0.addException(iP7);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Server [lastUpdate=null, exceptions=(), bans={[IPBan [ip=null, expires=1465347957823]]}]"+ "'", str6.equals("Server [lastUpdate=null, exceptions=(), bans={[IPBan [ip=null, expires=1465347957823]]}]"));

  }

  @Test
  public void test028() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test028"); }


    tp2.Server server1 = new tp2.Server(1);
    tp2.IP iP2 = null;
    boolean b3 = server1.removeBan(iP2);
    server1.update();
    tp2.IP iP5 = null;
    boolean b6 = server1.removeBan(iP5);
    java.lang.String str7 = server1.toString();
    long long8 = server1.getLastUpdate();
    server1.update();
    long long10 = server1.getLastUpdate();
    server1.update();
    tp2.IP iP12 = null;
    boolean b13 = server1.removeException(iP12);
    tp2.ITime iTime14 = null;
    server1.setTime(iTime14);
    tp2.IP iP16 = null;
    boolean b17 = server1.removeException(iP16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Server [lastUpdate=250000, exceptions=(), bans={}]"+ "'", str7.equals("Server [lastUpdate=250000, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long8 == 250000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long10 == 250000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);

  }

  @Test
  public void test029() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test029"); }


    tp2.Server server0 = new tp2.Server();
    server0.update();
    tp2.IP iP2 = null;
    boolean b3 = server0.removeBan(iP2);
    server0.update();
    tp2.ITime iTime5 = null;
    server0.setTime(iTime5);
    tp2.ITime iTime7 = null;
    server0.setTime(iTime7);
    boolean b9 = server0.repOK();
    tp2.IP iP10 = null;
    boolean b11 = server0.connect(iP10);
    tp2.ITime iTime12 = null;
    server0.setTime(iTime12);
    tp2.IP iP14 = null;
    // The following exception was thrown during execution in test generation
    try {
      boolean b15 = server0.addException(iP14);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);

  }

  @Test
  public void test030() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test030"); }


    tp2.Server server1 = new tp2.Server(1);
    tp2.IP iP2 = null;
    boolean b3 = server1.removeBan(iP2);
    tp2.ITime iTime4 = null;
    server1.setTime(iTime4);
    tp2.IP iP6 = null;
    boolean b7 = server1.removeBan(iP6);
    tp2.ITime iTime8 = null;
    server1.setTime(iTime8);
    java.lang.String str10 = server1.toString();
    boolean b11 = server1.repOK();
    tp2.IP iP12 = null;
    boolean b13 = server1.connect(iP12);
    tp2.IP iP14 = null;
    boolean b15 = server1.removeBan(iP14);
    java.lang.String str16 = server1.toString();
    java.lang.String str17 = server1.toString();
    boolean b18 = server1.repOK();
    boolean b19 = server1.repOK();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Server [lastUpdate=null, exceptions=(), bans={}]"+ "'", str10.equals("Server [lastUpdate=null, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "Server [lastUpdate=null, exceptions=(), bans={}]"+ "'", str16.equals("Server [lastUpdate=null, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "Server [lastUpdate=null, exceptions=(), bans={}]"+ "'", str17.equals("Server [lastUpdate=null, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);

  }

  @Test
  public void test031() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test031"); }


    tp2.Server server1 = new tp2.Server(1);
    tp2.IP iP2 = null;
    boolean b3 = server1.removeBan(iP2);
    server1.update();
    tp2.IP iP5 = null;
    boolean b6 = server1.removeBan(iP5);
    java.lang.String str7 = server1.toString();
    long long8 = server1.getLastUpdate();
    server1.update();
    long long10 = server1.getLastUpdate();
    server1.update();
    tp2.IP iP12 = null;
    boolean b13 = server1.removeException(iP12);
    long long14 = server1.getLastUpdate();
    long long15 = server1.getLastUpdate();
    tp2.IP iP16 = null;
    boolean b17 = server1.addBan(iP16);
    tp2.IP iP18 = null;
    // The following exception was thrown during execution in test generation
    try {
      boolean b19 = server1.connect(iP18);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Server [lastUpdate=250000, exceptions=(), bans={}]"+ "'", str7.equals("Server [lastUpdate=250000, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long8 == 250000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long10 == 250000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long14 == 250000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long15 == 250000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);

  }

  @Test
  public void test032() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test032"); }


    tp2.Server server0 = new tp2.Server();
    server0.update();
    boolean b2 = server0.repOK();
    long long3 = server0.getLastUpdate();
    server0.update();
    tp2.IP iP5 = null;
    boolean b6 = server0.connect(iP5);
    java.lang.String str7 = server0.toString();
    java.lang.String str8 = server0.toString();
    tp2.IP iP9 = null;
    // The following exception was thrown during execution in test generation
    try {
      boolean b10 = server0.addException(iP9);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long3 == 1465347897834L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Server [lastUpdate=1465347897834, exceptions=(), bans={}]"+ "'", str7.equals("Server [lastUpdate=1465347897834, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Server [lastUpdate=1465347897834, exceptions=(), bans={}]"+ "'", str8.equals("Server [lastUpdate=1465347897834, exceptions=(), bans={}]"));

  }

  @Test
  public void test033() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test033"); }


    tp2.Server server1 = new tp2.Server(1);
    tp2.IP iP2 = null;
    boolean b3 = server1.removeBan(iP2);
    server1.update();
    tp2.IP iP5 = null;
    boolean b6 = server1.addBan(iP5);
    long long7 = server1.getLastUpdate();
    long long8 = server1.getLastUpdate();
    boolean b9 = server1.repOK();
    tp2.IP iP10 = null;
    // The following exception was thrown during execution in test generation
    try {
      boolean b11 = server1.connect(iP10);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long7 == 250000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long8 == 250000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);

  }

  @Test
  public void test034() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test034"); }


    tp2.Server server1 = new tp2.Server(1);
    tp2.IP iP2 = null;
    boolean b3 = server1.removeBan(iP2);
    server1.update();
    tp2.IP iP5 = null;
    boolean b6 = server1.removeBan(iP5);
    tp2.IP iP7 = null;
    boolean b8 = server1.removeException(iP7);
    boolean b9 = server1.repOK();
    server1.update();
    tp2.ITime iTime11 = null;
    server1.setTime(iTime11);
    tp2.IP iP13 = null;
    boolean b14 = server1.removeException(iP13);
    tp2.ITime iTime15 = null;
    server1.setTime(iTime15);
    boolean b17 = server1.repOK();
    tp2.IP iP18 = null;
    // The following exception was thrown during execution in test generation
    try {
      boolean b19 = server1.addBan(iP18);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);

  }

  @Test
  public void test035() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test035"); }


    tp2.Server server1 = new tp2.Server(1);
    tp2.IP iP2 = null;
    boolean b3 = server1.removeBan(iP2);
    tp2.ITime iTime4 = null;
    server1.setTime(iTime4);
    tp2.IP iP6 = null;
    boolean b7 = server1.removeBan(iP6);
    tp2.ITime iTime8 = null;
    server1.setTime(iTime8);
    java.lang.String str10 = server1.toString();
    boolean b11 = server1.repOK();
    tp2.IP iP12 = null;
    boolean b13 = server1.connect(iP12);
    java.lang.String str14 = server1.toString();
    tp2.ITime iTime15 = null;
    server1.setTime(iTime15);
    boolean b17 = server1.repOK();
    tp2.IP iP18 = null;
    // The following exception was thrown during execution in test generation
    try {
      boolean b19 = server1.addException(iP18);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Server [lastUpdate=null, exceptions=(), bans={}]"+ "'", str10.equals("Server [lastUpdate=null, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "Server [lastUpdate=null, exceptions=(), bans={}]"+ "'", str14.equals("Server [lastUpdate=null, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);

  }

  @Test
  public void test036() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test036"); }


    tp2.Server server1 = new tp2.Server(1);
    tp2.IP iP2 = null;
    boolean b3 = server1.removeBan(iP2);
    tp2.ITime iTime4 = null;
    server1.setTime(iTime4);
    tp2.IP iP6 = null;
    boolean b7 = server1.removeBan(iP6);
    tp2.ITime iTime8 = null;
    server1.setTime(iTime8);
    tp2.ITime iTime10 = null;
    server1.setTime(iTime10);
    tp2.ITime iTime12 = null;
    server1.setTime(iTime12);
    tp2.ITime iTime14 = null;
    server1.setTime(iTime14);
    tp2.IP iP16 = null;
    boolean b17 = server1.removeBan(iP16);
    // The following exception was thrown during execution in test generation
    try {
      long long18 = server1.getLastUpdate();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);

  }

  @Test
  public void test037() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test037"); }


    tp2.Server server0 = new tp2.Server();
    tp2.IP iP1 = null;
    boolean b2 = server0.removeException(iP1);
    server0.update();
    tp2.IP iP4 = null;
    boolean b5 = server0.connect(iP4);
    boolean b6 = server0.repOK();
    tp2.IP iP7 = null;
    boolean b8 = server0.removeBan(iP7);
    tp2.ITime iTime9 = null;
    server0.setTime(iTime9);
    tp2.ITime iTime11 = null;
    server0.setTime(iTime11);
    tp2.IP iP13 = null;
    // The following exception was thrown during execution in test generation
    try {
      boolean b14 = server0.addException(iP13);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);

  }

  @Test
  public void test038() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test038"); }


    tp2.Server server1 = new tp2.Server(1);
    tp2.IP iP2 = null;
    boolean b3 = server1.removeException(iP2);
    java.lang.String str4 = server1.toString();
    tp2.IP iP5 = null;
    boolean b6 = server1.connect(iP5);
    java.lang.String str7 = server1.toString();
    server1.update();
    long long9 = server1.getLastUpdate();
    tp2.IP iP10 = null;
    // The following exception was thrown during execution in test generation
    try {
      boolean b11 = server1.addException(iP10);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Server [lastUpdate=null, exceptions=(), bans={}]"+ "'", str4.equals("Server [lastUpdate=null, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Server [lastUpdate=null, exceptions=(), bans={}]"+ "'", str7.equals("Server [lastUpdate=null, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long9 == 250000L);

  }

  @Test
  public void test039() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test039"); }


    tp2.Server server1 = new tp2.Server(1);
    tp2.IP iP2 = null;
    boolean b3 = server1.removeBan(iP2);
    server1.update();
    tp2.IP iP5 = null;
    boolean b6 = server1.removeBan(iP5);
    tp2.IP iP7 = null;
    boolean b8 = server1.addBan(iP7);
    server1.update();
    boolean b10 = server1.repOK();
    tp2.IP iP11 = null;
    // The following exception was thrown during execution in test generation
    try {
      boolean b12 = server1.removeBan(iP11);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);

  }

  @Test
  public void test040() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test040"); }


    tp2.Server server1 = new tp2.Server(1);
    tp2.IP iP2 = null;
    boolean b3 = server1.removeBan(iP2);
    server1.update();
    tp2.IP iP5 = null;
    boolean b6 = server1.removeBan(iP5);
    tp2.IP iP7 = null;
    boolean b8 = server1.removeBan(iP7);
    java.lang.String str9 = server1.toString();
    boolean b10 = server1.repOK();
    tp2.IP iP11 = null;
    boolean b12 = server1.connect(iP11);
    tp2.IP iP13 = null;
    boolean b14 = server1.removeException(iP13);
    long long15 = server1.getLastUpdate();
    tp2.IP iP16 = null;
    boolean b17 = server1.removeException(iP16);
    long long18 = server1.getLastUpdate();
    tp2.IP iP19 = null;
    boolean b20 = server1.removeBan(iP19);
    tp2.IP iP21 = null;
    // The following exception was thrown during execution in test generation
    try {
      boolean b22 = server1.addException(iP21);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Server [lastUpdate=250000, exceptions=(), bans={}]"+ "'", str9.equals("Server [lastUpdate=250000, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long15 == 250000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long18 == 250000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);

  }

  @Test
  public void test041() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test041"); }


    tp2.Server server1 = new tp2.Server(1);
    tp2.IP iP2 = null;
    boolean b3 = server1.removeBan(iP2);
    server1.update();
    long long5 = server1.getLastUpdate();
    tp2.IP iP6 = null;
    boolean b7 = server1.connect(iP6);
    tp2.IP iP8 = null;
    boolean b9 = server1.removeBan(iP8);
    boolean b10 = server1.repOK();
    tp2.IP iP11 = null;
    boolean b12 = server1.addBan(iP11);
    tp2.IP iP13 = null;
    // The following exception was thrown during execution in test generation
    try {
      boolean b14 = server1.addBan(iP13);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long5 == 250000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);

  }

  @Test
  public void test042() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test042"); }


    tp2.Server server1 = new tp2.Server(1);
    tp2.IP iP2 = null;
    boolean b3 = server1.removeBan(iP2);
    server1.update();
    tp2.IP iP5 = null;
    boolean b6 = server1.removeBan(iP5);
    tp2.IP iP7 = null;
    boolean b8 = server1.removeBan(iP7);
    tp2.IP iP9 = null;
    boolean b10 = server1.removeException(iP9);
    tp2.IP iP11 = null;
    boolean b12 = server1.removeException(iP11);
    tp2.IP iP13 = null;
    boolean b14 = server1.addBan(iP13);
    long long15 = server1.getLastUpdate();
    tp2.IP iP16 = null;
    // The following exception was thrown during execution in test generation
    try {
      boolean b17 = server1.connect(iP16);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long15 == 250000L);

  }

  @Test
  public void test043() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test043"); }


    tp2.Server server1 = new tp2.Server(1);
    tp2.IP iP2 = null;
    boolean b3 = server1.removeBan(iP2);
    tp2.ITime iTime4 = null;
    server1.setTime(iTime4);
    tp2.IP iP6 = null;
    boolean b7 = server1.removeBan(iP6);
    tp2.ITime iTime8 = null;
    server1.setTime(iTime8);
    tp2.ITime iTime10 = null;
    server1.setTime(iTime10);
    tp2.ITime iTime12 = null;
    server1.setTime(iTime12);
    tp2.ITime iTime14 = null;
    server1.setTime(iTime14);
    tp2.ITime iTime16 = null;
    server1.setTime(iTime16);
    // The following exception was thrown during execution in test generation
    try {
      server1.update();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);

  }

  @Test
  public void test044() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test044"); }


    tp2.Server server1 = new tp2.Server(1);
    tp2.IP iP2 = null;
    boolean b3 = server1.removeBan(iP2);
    tp2.ITime iTime4 = null;
    server1.setTime(iTime4);
    tp2.IP iP6 = null;
    boolean b7 = server1.removeBan(iP6);
    tp2.ITime iTime8 = null;
    server1.setTime(iTime8);
    java.lang.String str10 = server1.toString();
    boolean b11 = server1.repOK();
    tp2.IP iP12 = null;
    boolean b13 = server1.connect(iP12);
    java.lang.String str14 = server1.toString();
    tp2.IP iP15 = null;
    boolean b16 = server1.removeException(iP15);
    // The following exception was thrown during execution in test generation
    try {
      long long17 = server1.getLastUpdate();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Server [lastUpdate=null, exceptions=(), bans={}]"+ "'", str10.equals("Server [lastUpdate=null, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "Server [lastUpdate=null, exceptions=(), bans={}]"+ "'", str14.equals("Server [lastUpdate=null, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);

  }

  @Test
  public void test045() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test045"); }


    tp2.Server server1 = new tp2.Server((-1));
    server1.update();
    server1.update();
    boolean b4 = server1.repOK();
    tp2.IP iP5 = null;
    // The following exception was thrown during execution in test generation
    try {
      boolean b6 = server1.addException(iP5);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);

  }

  @Test
  public void test046() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test046"); }


    tp2.Server server1 = new tp2.Server(1);
    tp2.IP iP2 = null;
    boolean b3 = server1.removeBan(iP2);
    tp2.ITime iTime4 = null;
    server1.setTime(iTime4);
    tp2.IP iP6 = null;
    boolean b7 = server1.removeBan(iP6);
    tp2.ITime iTime8 = null;
    server1.setTime(iTime8);
    tp2.ITime iTime10 = null;
    server1.setTime(iTime10);
    tp2.IP iP12 = null;
    boolean b13 = server1.removeException(iP12);
    tp2.ITime iTime14 = null;
    server1.setTime(iTime14);
    java.lang.String str16 = server1.toString();
    boolean b17 = server1.repOK();
    boolean b18 = server1.repOK();
    // The following exception was thrown during execution in test generation
    try {
      server1.update();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "Server [lastUpdate=null, exceptions=(), bans={}]"+ "'", str16.equals("Server [lastUpdate=null, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);

  }

  @Test
  public void test047() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test047"); }


    tp2.Server server1 = new tp2.Server(1);
    tp2.IP iP2 = null;
    boolean b3 = server1.removeBan(iP2);
    server1.update();
    long long5 = server1.getLastUpdate();
    tp2.IP iP6 = null;
    boolean b7 = server1.connect(iP6);
    tp2.IP iP8 = null;
    boolean b9 = server1.removeBan(iP8);
    boolean b10 = server1.repOK();
    tp2.IP iP11 = null;
    boolean b12 = server1.removeBan(iP11);
    java.lang.String str13 = server1.toString();
    server1.update();
    tp2.IP iP15 = null;
    // The following exception was thrown during execution in test generation
    try {
      boolean b16 = server1.addException(iP15);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long5 == 250000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Server [lastUpdate=250000, exceptions=(), bans={}]"+ "'", str13.equals("Server [lastUpdate=250000, exceptions=(), bans={}]"));

  }

  @Test
  public void test048() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test048"); }


    tp2.Server server1 = new tp2.Server(100);
    tp2.IP iP2 = null;
    boolean b3 = server1.connect(iP2);
    tp2.ITime iTime4 = null;
    server1.setTime(iTime4);
    tp2.IP iP6 = null;
    // The following exception was thrown during execution in test generation
    try {
      boolean b7 = server1.addException(iP6);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);

  }

  @Test
  public void test049() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test049"); }


    tp2.Server server0 = new tp2.Server();
    server0.update();
    tp2.IP iP2 = null;
    boolean b3 = server0.removeBan(iP2);
    server0.update();
    java.lang.String str5 = server0.toString();
    tp2.IP iP6 = null;
    boolean b7 = server0.removeException(iP6);
    boolean b8 = server0.repOK();
    tp2.IP iP9 = null;
    boolean b10 = server0.addBan(iP9);
    boolean b11 = server0.repOK();
    java.lang.String str12 = server0.toString();
    server0.update();
    tp2.IP iP14 = null;
    // The following exception was thrown during execution in test generation
    try {
      boolean b15 = server0.connect(iP14);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Server [lastUpdate=1465347897885, exceptions=(), bans={}]"+ "'", str5.equals("Server [lastUpdate=1465347897885, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Server [lastUpdate=1465347897885, exceptions=(), bans={[IPBan [ip=null, expires=1465347957885]]}]"+ "'", str12.equals("Server [lastUpdate=1465347897885, exceptions=(), bans={[IPBan [ip=null, expires=1465347957885]]}]"));

  }

  @Test
  public void test050() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test050"); }


    tp2.Server server0 = new tp2.Server();
    server0.update();
    tp2.IP iP2 = null;
    boolean b3 = server0.removeBan(iP2);
    server0.update();
    java.lang.String str5 = server0.toString();
    tp2.IP iP6 = null;
    boolean b7 = server0.removeException(iP6);
    boolean b8 = server0.repOK();
    tp2.IP iP9 = null;
    boolean b10 = server0.addBan(iP9);
    boolean b11 = server0.repOK();
    tp2.IP iP12 = null;
    boolean b13 = server0.removeException(iP12);
    long long14 = server0.getLastUpdate();
    tp2.IP iP15 = null;
    // The following exception was thrown during execution in test generation
    try {
      boolean b16 = server0.removeBan(iP15);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Server [lastUpdate=1465347897890, exceptions=(), bans={}]"+ "'", str5.equals("Server [lastUpdate=1465347897890, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long14 == 1465347897890L);

  }

  @Test
  public void test051() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test051"); }


    tp2.Server server1 = new tp2.Server(1);
    tp2.IP iP2 = null;
    boolean b3 = server1.removeBan(iP2);
    server1.update();
    tp2.IP iP5 = null;
    boolean b6 = server1.removeBan(iP5);
    long long7 = server1.getLastUpdate();
    java.lang.String str8 = server1.toString();
    tp2.IP iP9 = null;
    boolean b10 = server1.removeException(iP9);
    long long11 = server1.getLastUpdate();
    tp2.IP iP12 = null;
    boolean b13 = server1.connect(iP12);
    tp2.IP iP14 = null;
    boolean b15 = server1.removeBan(iP14);
    server1.update();
    boolean b17 = server1.repOK();
    boolean b18 = server1.repOK();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long7 == 250000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Server [lastUpdate=250000, exceptions=(), bans={}]"+ "'", str8.equals("Server [lastUpdate=250000, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long11 == 250000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);

  }

  @Test
  public void test052() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test052"); }


    tp2.Server server1 = new tp2.Server(1);
    tp2.IP iP2 = null;
    boolean b3 = server1.removeBan(iP2);
    tp2.ITime iTime4 = null;
    server1.setTime(iTime4);
    tp2.IP iP6 = null;
    boolean b7 = server1.removeBan(iP6);
    java.lang.String str8 = server1.toString();
    tp2.ITime iTime9 = null;
    server1.setTime(iTime9);
    tp2.ITime iTime11 = null;
    server1.setTime(iTime11);
    tp2.IP iP13 = null;
    boolean b14 = server1.connect(iP13);
    tp2.IP iP15 = null;
    boolean b16 = server1.removeException(iP15);
    tp2.IP iP17 = null;
    // The following exception was thrown during execution in test generation
    try {
      boolean b18 = server1.addException(iP17);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Server [lastUpdate=null, exceptions=(), bans={}]"+ "'", str8.equals("Server [lastUpdate=null, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);

  }

  @Test
  public void test053() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test053"); }


    tp2.Server server1 = new tp2.Server(1);
    tp2.IP iP2 = null;
    boolean b3 = server1.removeException(iP2);
    java.lang.String str4 = server1.toString();
    tp2.IP iP5 = null;
    boolean b6 = server1.connect(iP5);
    java.lang.String str7 = server1.toString();
    java.lang.String str8 = server1.toString();
    boolean b9 = server1.repOK();
    tp2.ITime iTime10 = null;
    server1.setTime(iTime10);
    java.lang.String str12 = server1.toString();
    tp2.IP iP13 = null;
    boolean b14 = server1.removeBan(iP13);
    tp2.IP iP15 = null;
    // The following exception was thrown during execution in test generation
    try {
      boolean b16 = server1.addException(iP15);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Server [lastUpdate=null, exceptions=(), bans={}]"+ "'", str4.equals("Server [lastUpdate=null, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Server [lastUpdate=null, exceptions=(), bans={}]"+ "'", str7.equals("Server [lastUpdate=null, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Server [lastUpdate=null, exceptions=(), bans={}]"+ "'", str8.equals("Server [lastUpdate=null, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Server [lastUpdate=null, exceptions=(), bans={}]"+ "'", str12.equals("Server [lastUpdate=null, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);

  }

  @Test
  public void test054() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test054"); }


    tp2.Server server0 = new tp2.Server();
    server0.update();
    tp2.IP iP2 = null;
    boolean b3 = server0.removeBan(iP2);
    tp2.ITime iTime4 = null;
    server0.setTime(iTime4);
    tp2.IP iP6 = null;
    boolean b7 = server0.connect(iP6);
    tp2.IP iP8 = null;
    boolean b9 = server0.connect(iP8);
    boolean b10 = server0.repOK();
    boolean b11 = server0.repOK();
    tp2.IP iP12 = null;
    boolean b13 = server0.removeException(iP12);
    java.lang.String str14 = server0.toString();
    // The following exception was thrown during execution in test generation
    try {
      server0.update();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "Server [lastUpdate=1465347897897, exceptions=(), bans={}]"+ "'", str14.equals("Server [lastUpdate=1465347897897, exceptions=(), bans={}]"));

  }

  @Test
  public void test055() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test055"); }


    tp2.Server server1 = new tp2.Server(1);
    tp2.IP iP2 = null;
    boolean b3 = server1.removeBan(iP2);
    server1.update();
    tp2.IP iP5 = null;
    boolean b6 = server1.removeBan(iP5);
    tp2.IP iP7 = null;
    boolean b8 = server1.removeBan(iP7);
    java.lang.String str9 = server1.toString();
    boolean b10 = server1.repOK();
    tp2.IP iP11 = null;
    boolean b12 = server1.connect(iP11);
    tp2.IP iP13 = null;
    boolean b14 = server1.addBan(iP13);
    boolean b15 = server1.repOK();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Server [lastUpdate=250000, exceptions=(), bans={}]"+ "'", str9.equals("Server [lastUpdate=250000, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);

  }

  @Test
  public void test056() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test056"); }


    tp2.Server server1 = new tp2.Server(1);
    tp2.IP iP2 = null;
    boolean b3 = server1.removeBan(iP2);
    server1.update();
    tp2.IP iP5 = null;
    boolean b6 = server1.removeBan(iP5);
    tp2.IP iP7 = null;
    boolean b8 = server1.removeBan(iP7);
    java.lang.String str9 = server1.toString();
    tp2.ITime iTime10 = null;
    server1.setTime(iTime10);
    tp2.IP iP12 = null;
    // The following exception was thrown during execution in test generation
    try {
      boolean b13 = server1.addException(iP12);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Server [lastUpdate=250000, exceptions=(), bans={}]"+ "'", str9.equals("Server [lastUpdate=250000, exceptions=(), bans={}]"));

  }

  @Test
  public void test057() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test057"); }


    tp2.Server server0 = new tp2.Server();
    tp2.IP iP1 = null;
    boolean b2 = server0.removeBan(iP1);
    java.lang.String str3 = server0.toString();
    tp2.IP iP4 = null;
    boolean b5 = server0.removeException(iP4);
    tp2.IP iP6 = null;
    boolean b7 = server0.addBan(iP6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Server [lastUpdate=null, exceptions=(), bans={}]"+ "'", str3.equals("Server [lastUpdate=null, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);

  }

  @Test
  public void test058() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test058"); }


    tp2.Server server0 = new tp2.Server();
    server0.update();
    tp2.IP iP2 = null;
    boolean b3 = server0.removeBan(iP2);
    tp2.ITime iTime4 = null;
    server0.setTime(iTime4);
    tp2.IP iP6 = null;
    boolean b7 = server0.connect(iP6);
    tp2.IP iP8 = null;
    boolean b9 = server0.connect(iP8);
    tp2.ITime iTime10 = null;
    server0.setTime(iTime10);
    // The following exception was thrown during execution in test generation
    try {
      server0.update();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);

  }

  @Test
  public void test059() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test059"); }


    tp2.Server server1 = new tp2.Server(1);
    tp2.IP iP2 = null;
    boolean b3 = server1.removeBan(iP2);
    tp2.ITime iTime4 = null;
    server1.setTime(iTime4);
    tp2.IP iP6 = null;
    boolean b7 = server1.removeBan(iP6);
    tp2.ITime iTime8 = null;
    server1.setTime(iTime8);
    java.lang.String str10 = server1.toString();
    tp2.IP iP11 = null;
    boolean b12 = server1.removeBan(iP11);
    java.lang.String str13 = server1.toString();
    tp2.IP iP14 = null;
    boolean b15 = server1.removeException(iP14);
    boolean b16 = server1.repOK();
    // The following exception was thrown during execution in test generation
    try {
      long long17 = server1.getLastUpdate();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Server [lastUpdate=null, exceptions=(), bans={}]"+ "'", str10.equals("Server [lastUpdate=null, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Server [lastUpdate=null, exceptions=(), bans={}]"+ "'", str13.equals("Server [lastUpdate=null, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);

  }

  @Test
  public void test060() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test060"); }


    tp2.Server server0 = new tp2.Server();
    boolean b1 = server0.repOK();
    tp2.IP iP2 = null;
    boolean b3 = server0.addBan(iP2);
    tp2.ITime iTime4 = null;
    server0.setTime(iTime4);
    tp2.IP iP6 = null;
    // The following exception was thrown during execution in test generation
    try {
      boolean b7 = server0.addBan(iP6);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);

  }

  @Test
  public void test061() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test061"); }


    tp2.Server server0 = new tp2.Server();
    server0.update();
    boolean b2 = server0.repOK();
    tp2.IP iP3 = null;
    boolean b4 = server0.addBan(iP3);
    tp2.IP iP5 = null;
    // The following exception was thrown during execution in test generation
    try {
      boolean b6 = server0.addBan(iP5);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);

  }

  @Test
  public void test062() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test062"); }


    tp2.Server server1 = new tp2.Server(1);
    tp2.IP iP2 = null;
    boolean b3 = server1.removeBan(iP2);
    tp2.ITime iTime4 = null;
    server1.setTime(iTime4);
    tp2.IP iP6 = null;
    boolean b7 = server1.removeBan(iP6);
    java.lang.String str8 = server1.toString();
    java.lang.String str9 = server1.toString();
    tp2.IP iP10 = null;
    boolean b11 = server1.removeException(iP10);
    tp2.IP iP12 = null;
    boolean b13 = server1.removeException(iP12);
    java.lang.String str14 = server1.toString();
    java.lang.String str15 = server1.toString();
    // The following exception was thrown during execution in test generation
    try {
      server1.update();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Server [lastUpdate=null, exceptions=(), bans={}]"+ "'", str8.equals("Server [lastUpdate=null, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Server [lastUpdate=null, exceptions=(), bans={}]"+ "'", str9.equals("Server [lastUpdate=null, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "Server [lastUpdate=null, exceptions=(), bans={}]"+ "'", str14.equals("Server [lastUpdate=null, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "Server [lastUpdate=null, exceptions=(), bans={}]"+ "'", str15.equals("Server [lastUpdate=null, exceptions=(), bans={}]"));

  }

  @Test
  public void test063() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test063"); }


    tp2.Server server1 = new tp2.Server(1);
    tp2.IP iP2 = null;
    boolean b3 = server1.removeBan(iP2);
    server1.update();
    tp2.IP iP5 = null;
    boolean b6 = server1.removeBan(iP5);
    tp2.IP iP7 = null;
    boolean b8 = server1.removeException(iP7);
    java.lang.String str9 = server1.toString();
    java.lang.String str10 = server1.toString();
    tp2.ITime iTime11 = null;
    server1.setTime(iTime11);
    boolean b13 = server1.repOK();
    // The following exception was thrown during execution in test generation
    try {
      server1.update();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Server [lastUpdate=250000, exceptions=(), bans={}]"+ "'", str9.equals("Server [lastUpdate=250000, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Server [lastUpdate=250000, exceptions=(), bans={}]"+ "'", str10.equals("Server [lastUpdate=250000, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);

  }

  @Test
  public void test064() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test064"); }


    tp2.Server server1 = new tp2.Server(1);
    tp2.IP iP2 = null;
    boolean b3 = server1.removeException(iP2);
    java.lang.String str4 = server1.toString();
    tp2.IP iP5 = null;
    boolean b6 = server1.connect(iP5);
    tp2.IP iP7 = null;
    boolean b8 = server1.removeBan(iP7);
    tp2.IP iP9 = null;
    boolean b10 = server1.addBan(iP9);
    java.lang.String str11 = server1.toString();
    tp2.IP iP12 = null;
    // The following exception was thrown during execution in test generation
    try {
      boolean b13 = server1.addException(iP12);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Server [lastUpdate=null, exceptions=(), bans={}]"+ "'", str4.equals("Server [lastUpdate=null, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Server [lastUpdate=null, exceptions=(), bans={[IPBan [ip=null, expires=310000]]}]"+ "'", str11.equals("Server [lastUpdate=null, exceptions=(), bans={[IPBan [ip=null, expires=310000]]}]"));

  }

  @Test
  public void test065() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test065"); }


    tp2.Server server0 = new tp2.Server();
    server0.update();
    tp2.IP iP2 = null;
    boolean b3 = server0.removeBan(iP2);
    long long4 = server0.getLastUpdate();
    server0.update();
    tp2.IP iP6 = null;
    boolean b7 = server0.connect(iP6);
    tp2.ITime iTime8 = null;
    server0.setTime(iTime8);
    tp2.IP iP10 = null;
    boolean b11 = server0.connect(iP10);
    tp2.IP iP12 = null;
    boolean b13 = server0.connect(iP12);
    long long14 = server0.getLastUpdate();
    java.lang.String str15 = server0.toString();
    tp2.IP iP16 = null;
    // The following exception was thrown during execution in test generation
    try {
      boolean b17 = server0.addException(iP16);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long4 == 1465347897926L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long14 == 1465347897926L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "Server [lastUpdate=1465347897926, exceptions=(), bans={}]"+ "'", str15.equals("Server [lastUpdate=1465347897926, exceptions=(), bans={}]"));

  }

  @Test
  public void test066() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test066"); }


    tp2.Server server1 = new tp2.Server(1);
    tp2.IP iP2 = null;
    boolean b3 = server1.removeBan(iP2);
    server1.update();
    tp2.IP iP5 = null;
    boolean b6 = server1.removeBan(iP5);
    long long7 = server1.getLastUpdate();
    java.lang.String str8 = server1.toString();
    server1.update();
    long long10 = server1.getLastUpdate();
    boolean b11 = server1.repOK();
    tp2.IP iP12 = null;
    // The following exception was thrown during execution in test generation
    try {
      boolean b13 = server1.addException(iP12);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long7 == 250000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Server [lastUpdate=250000, exceptions=(), bans={}]"+ "'", str8.equals("Server [lastUpdate=250000, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long10 == 250000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);

  }

  @Test
  public void test067() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test067"); }


    tp2.Server server1 = new tp2.Server(1);
    tp2.IP iP2 = null;
    boolean b3 = server1.removeBan(iP2);
    server1.update();
    java.lang.String str5 = server1.toString();
    long long6 = server1.getLastUpdate();
    java.lang.String str7 = server1.toString();
    java.lang.String str8 = server1.toString();
    java.lang.String str9 = server1.toString();
    tp2.IP iP10 = null;
    boolean b11 = server1.connect(iP10);
    tp2.IP iP12 = null;
    // The following exception was thrown during execution in test generation
    try {
      boolean b13 = server1.addException(iP12);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Server [lastUpdate=250000, exceptions=(), bans={}]"+ "'", str5.equals("Server [lastUpdate=250000, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long6 == 250000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Server [lastUpdate=250000, exceptions=(), bans={}]"+ "'", str7.equals("Server [lastUpdate=250000, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Server [lastUpdate=250000, exceptions=(), bans={}]"+ "'", str8.equals("Server [lastUpdate=250000, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Server [lastUpdate=250000, exceptions=(), bans={}]"+ "'", str9.equals("Server [lastUpdate=250000, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);

  }

  @Test
  public void test068() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test068"); }


    tp2.Server server1 = new tp2.Server((-1));
    server1.update();
    boolean b3 = server1.repOK();
    boolean b4 = server1.repOK();
    boolean b5 = server1.repOK();
    server1.update();
    tp2.IP iP7 = null;
    boolean b8 = server1.addBan(iP7);
    boolean b9 = server1.repOK();
    tp2.IP iP10 = null;
    boolean b11 = server1.removeException(iP10);
    tp2.IP iP12 = null;
    // The following exception was thrown during execution in test generation
    try {
      boolean b13 = server1.removeBan(iP12);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);

  }

  @Test
  public void test069() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test069"); }


    tp2.Server server1 = new tp2.Server(1);
    tp2.IP iP2 = null;
    boolean b3 = server1.removeBan(iP2);
    server1.update();
    java.lang.String str5 = server1.toString();
    tp2.IP iP6 = null;
    boolean b7 = server1.removeBan(iP6);
    tp2.IP iP8 = null;
    boolean b9 = server1.removeBan(iP8);
    tp2.ITime iTime10 = null;
    server1.setTime(iTime10);
    tp2.IP iP12 = null;
    boolean b13 = server1.removeBan(iP12);
    java.lang.String str14 = server1.toString();
    boolean b15 = server1.repOK();
    // The following exception was thrown during execution in test generation
    try {
      server1.update();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Server [lastUpdate=250000, exceptions=(), bans={}]"+ "'", str5.equals("Server [lastUpdate=250000, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "Server [lastUpdate=250000, exceptions=(), bans={}]"+ "'", str14.equals("Server [lastUpdate=250000, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);

  }

  @Test
  public void test070() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test070"); }


    tp2.Server server1 = new tp2.Server(1);
    tp2.IP iP2 = null;
    boolean b3 = server1.removeBan(iP2);
    server1.update();
    tp2.IP iP5 = null;
    boolean b6 = server1.removeBan(iP5);
    tp2.IP iP7 = null;
    boolean b8 = server1.removeBan(iP7);
    tp2.IP iP9 = null;
    boolean b10 = server1.removeException(iP9);
    boolean b11 = server1.repOK();
    boolean b12 = server1.repOK();
    tp2.IP iP13 = null;
    boolean b14 = server1.connect(iP13);
    tp2.IP iP15 = null;
    // The following exception was thrown during execution in test generation
    try {
      boolean b16 = server1.addException(iP15);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);

  }

  @Test
  public void test071() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test071"); }


    tp2.Server server0 = new tp2.Server();
    server0.update();
    server0.update();
    tp2.ITime iTime3 = null;
    server0.setTime(iTime3);
    boolean b5 = server0.repOK();
    tp2.IP iP6 = null;
    boolean b7 = server0.removeBan(iP6);
    boolean b8 = server0.repOK();
    tp2.IP iP9 = null;
    // The following exception was thrown during execution in test generation
    try {
      boolean b10 = server0.addException(iP9);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);

  }

  @Test
  public void test072() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test072"); }


    tp2.Server server0 = new tp2.Server();
    server0.update();
    tp2.IP iP2 = null;
    boolean b3 = server0.removeBan(iP2);
    tp2.IP iP4 = null;
    boolean b5 = server0.removeBan(iP4);
    java.lang.String str6 = server0.toString();
    long long7 = server0.getLastUpdate();
    boolean b8 = server0.repOK();
    tp2.ITime iTime9 = null;
    server0.setTime(iTime9);
    boolean b11 = server0.repOK();
    tp2.ITime iTime12 = null;
    server0.setTime(iTime12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Server [lastUpdate=1465347897964, exceptions=(), bans={}]"+ "'", str6.equals("Server [lastUpdate=1465347897964, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long7 == 1465347897964L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);

  }

  @Test
  public void test073() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test073"); }


    tp2.Server server1 = new tp2.Server(1);
    tp2.IP iP2 = null;
    boolean b3 = server1.removeBan(iP2);
    tp2.ITime iTime4 = null;
    server1.setTime(iTime4);
    tp2.ITime iTime6 = null;
    server1.setTime(iTime6);
    tp2.IP iP8 = null;
    boolean b9 = server1.connect(iP8);
    boolean b10 = server1.repOK();
    java.lang.String str11 = server1.toString();
    tp2.IP iP12 = null;
    // The following exception was thrown during execution in test generation
    try {
      boolean b13 = server1.addException(iP12);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Server [lastUpdate=null, exceptions=(), bans={}]"+ "'", str11.equals("Server [lastUpdate=null, exceptions=(), bans={}]"));

  }

  @Test
  public void test074() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test074"); }


    tp2.Server server1 = new tp2.Server((-1));
    server1.update();
    boolean b3 = server1.repOK();
    boolean b4 = server1.repOK();
    boolean b5 = server1.repOK();
    server1.update();
    tp2.IP iP7 = null;
    boolean b8 = server1.addBan(iP7);
    boolean b9 = server1.repOK();
    tp2.IP iP10 = null;
    boolean b11 = server1.removeException(iP10);
    tp2.IP iP12 = null;
    // The following exception was thrown during execution in test generation
    try {
      boolean b13 = server1.addException(iP12);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);

  }

  @Test
  public void test075() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test075"); }


    tp2.Server server0 = new tp2.Server();
    server0.update();
    tp2.IP iP2 = null;
    boolean b3 = server0.removeException(iP2);
    boolean b4 = server0.repOK();
    boolean b5 = server0.repOK();
    boolean b6 = server0.repOK();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);

  }

  @Test
  public void test076() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test076"); }


    tp2.Server server1 = new tp2.Server(1);
    tp2.IP iP2 = null;
    boolean b3 = server1.removeBan(iP2);
    server1.update();
    long long5 = server1.getLastUpdate();
    tp2.IP iP6 = null;
    boolean b7 = server1.connect(iP6);
    tp2.IP iP8 = null;
    boolean b9 = server1.removeBan(iP8);
    tp2.IP iP10 = null;
    boolean b11 = server1.addBan(iP10);
    boolean b12 = server1.repOK();
    tp2.IP iP13 = null;
    boolean b14 = server1.removeException(iP13);
    tp2.IP iP15 = null;
    // The following exception was thrown during execution in test generation
    try {
      boolean b16 = server1.addBan(iP15);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long5 == 250000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);

  }

  @Test
  public void test077() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test077"); }


    tp2.Server server0 = new tp2.Server();
    server0.update();
    tp2.IP iP2 = null;
    boolean b3 = server0.removeBan(iP2);
    server0.update();
    java.lang.String str5 = server0.toString();
    long long6 = server0.getLastUpdate();
    boolean b7 = server0.repOK();
    long long8 = server0.getLastUpdate();
    boolean b9 = server0.repOK();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Server [lastUpdate=1465347897975, exceptions=(), bans={}]"+ "'", str5.equals("Server [lastUpdate=1465347897975, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long6 == 1465347897975L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long8 == 1465347897975L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);

  }

  @Test
  public void test078() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test078"); }


    tp2.Server server1 = new tp2.Server(1);
    tp2.IP iP2 = null;
    boolean b3 = server1.removeBan(iP2);
    server1.update();
    long long5 = server1.getLastUpdate();
    tp2.IP iP6 = null;
    boolean b7 = server1.connect(iP6);
    java.lang.String str8 = server1.toString();
    server1.update();
    tp2.IP iP10 = null;
    boolean b11 = server1.removeBan(iP10);
    java.lang.String str12 = server1.toString();
    boolean b13 = server1.repOK();
    tp2.IP iP14 = null;
    boolean b15 = server1.removeException(iP14);
    long long16 = server1.getLastUpdate();
    tp2.IP iP17 = null;
    // The following exception was thrown during execution in test generation
    try {
      boolean b18 = server1.addException(iP17);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long5 == 250000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Server [lastUpdate=250000, exceptions=(), bans={}]"+ "'", str8.equals("Server [lastUpdate=250000, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Server [lastUpdate=250000, exceptions=(), bans={}]"+ "'", str12.equals("Server [lastUpdate=250000, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long16 == 250000L);

  }

  @Test
  public void test079() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test079"); }


    tp2.Server server0 = new tp2.Server();
    server0.update();
    tp2.IP iP2 = null;
    boolean b3 = server0.removeBan(iP2);
    tp2.ITime iTime4 = null;
    server0.setTime(iTime4);
    tp2.IP iP6 = null;
    boolean b7 = server0.connect(iP6);
    long long8 = server0.getLastUpdate();
    tp2.IP iP9 = null;
    boolean b10 = server0.removeBan(iP9);
    tp2.IP iP11 = null;
    // The following exception was thrown during execution in test generation
    try {
      boolean b12 = server0.addBan(iP11);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long8 == 1465347897984L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);

  }

  @Test
  public void test080() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test080"); }


    tp2.Server server1 = new tp2.Server(1);
    tp2.IP iP2 = null;
    boolean b3 = server1.removeBan(iP2);
    server1.update();
    tp2.IP iP5 = null;
    boolean b6 = server1.removeBan(iP5);
    tp2.IP iP7 = null;
    boolean b8 = server1.removeBan(iP7);
    java.lang.String str9 = server1.toString();
    boolean b10 = server1.repOK();
    tp2.IP iP11 = null;
    boolean b12 = server1.connect(iP11);
    tp2.IP iP13 = null;
    boolean b14 = server1.removeException(iP13);
    tp2.IP iP15 = null;
    boolean b16 = server1.removeException(iP15);
    tp2.IP iP17 = null;
    boolean b18 = server1.addBan(iP17);
    long long19 = server1.getLastUpdate();
    server1.update();
    long long21 = server1.getLastUpdate();
    tp2.IP iP22 = null;
    // The following exception was thrown during execution in test generation
    try {
      boolean b23 = server1.addBan(iP22);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Server [lastUpdate=250000, exceptions=(), bans={}]"+ "'", str9.equals("Server [lastUpdate=250000, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long19 == 250000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long21 == 250000L);

  }

  @Test
  public void test081() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test081"); }


    tp2.Server server1 = new tp2.Server(1);
    tp2.IP iP2 = null;
    boolean b3 = server1.removeBan(iP2);
    server1.update();
    tp2.IP iP5 = null;
    boolean b6 = server1.removeBan(iP5);
    java.lang.String str7 = server1.toString();
    long long8 = server1.getLastUpdate();
    server1.update();
    long long10 = server1.getLastUpdate();
    tp2.IP iP11 = null;
    boolean b12 = server1.addBan(iP11);
    long long13 = server1.getLastUpdate();
    tp2.IP iP14 = null;
    // The following exception was thrown during execution in test generation
    try {
      boolean b15 = server1.removeBan(iP14);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Server [lastUpdate=250000, exceptions=(), bans={}]"+ "'", str7.equals("Server [lastUpdate=250000, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long8 == 250000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long10 == 250000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long13 == 250000L);

  }

  @Test
  public void test082() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test082"); }


    tp2.Server server0 = new tp2.Server();
    tp2.IP iP1 = null;
    boolean b2 = server0.removeException(iP1);
    tp2.ITime iTime3 = null;
    server0.setTime(iTime3);
    tp2.IP iP5 = null;
    boolean b6 = server0.connect(iP5);
    tp2.IP iP7 = null;
    boolean b8 = server0.connect(iP7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);

  }

  @Test
  public void test083() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test083"); }


    tp2.Server server0 = new tp2.Server();
    server0.update();
    tp2.IP iP2 = null;
    boolean b3 = server0.removeBan(iP2);
    server0.update();
    java.lang.String str5 = server0.toString();
    long long6 = server0.getLastUpdate();
    long long7 = server0.getLastUpdate();
    long long8 = server0.getLastUpdate();
    tp2.IP iP9 = null;
    boolean b10 = server0.addBan(iP9);
    tp2.IP iP11 = null;
    // The following exception was thrown during execution in test generation
    try {
      boolean b12 = server0.removeBan(iP11);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Server [lastUpdate=1465347897994, exceptions=(), bans={}]"+ "'", str5.equals("Server [lastUpdate=1465347897994, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long6 == 1465347897994L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long7 == 1465347897994L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long8 == 1465347897994L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);

  }

  @Test
  public void test084() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test084"); }


    tp2.Server server0 = new tp2.Server();
    server0.update();
    tp2.IP iP2 = null;
    boolean b3 = server0.removeBan(iP2);
    tp2.ITime iTime4 = null;
    server0.setTime(iTime4);
    tp2.IP iP6 = null;
    boolean b7 = server0.connect(iP6);
    tp2.IP iP8 = null;
    boolean b9 = server0.connect(iP8);
    boolean b10 = server0.repOK();
    boolean b11 = server0.repOK();
    java.lang.String str12 = server0.toString();
    tp2.IP iP13 = null;
    // The following exception was thrown during execution in test generation
    try {
      boolean b14 = server0.addBan(iP13);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Server [lastUpdate=1465347897994, exceptions=(), bans={}]"+ "'", str12.equals("Server [lastUpdate=1465347897994, exceptions=(), bans={}]"));

  }

  @Test
  public void test085() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test085"); }


    tp2.Server server0 = new tp2.Server();
    tp2.IP iP1 = null;
    boolean b2 = server0.removeException(iP1);
    server0.update();
    tp2.IP iP4 = null;
    boolean b5 = server0.connect(iP4);
    boolean b6 = server0.repOK();
    tp2.IP iP7 = null;
    boolean b8 = server0.removeBan(iP7);
    tp2.ITime iTime9 = null;
    server0.setTime(iTime9);
    tp2.ITime iTime11 = null;
    server0.setTime(iTime11);
    // The following exception was thrown during execution in test generation
    try {
      server0.update();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);

  }

  @Test
  public void test086() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test086"); }


    tp2.Server server1 = new tp2.Server(1);
    tp2.IP iP2 = null;
    boolean b3 = server1.removeBan(iP2);
    server1.update();
    long long5 = server1.getLastUpdate();
    tp2.IP iP6 = null;
    boolean b7 = server1.connect(iP6);
    tp2.IP iP8 = null;
    boolean b9 = server1.removeBan(iP8);
    boolean b10 = server1.repOK();
    tp2.IP iP11 = null;
    boolean b12 = server1.addBan(iP11);
    tp2.ITime iTime13 = null;
    server1.setTime(iTime13);
    tp2.IP iP15 = null;
    // The following exception was thrown during execution in test generation
    try {
      boolean b16 = server1.connect(iP15);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long5 == 250000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);

  }

  @Test
  public void test087() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test087"); }


    tp2.Server server1 = new tp2.Server((-1));
    server1.update();
    server1.update();
    tp2.IP iP4 = null;
    boolean b5 = server1.removeBan(iP4);
    long long6 = server1.getLastUpdate();
    tp2.ITime iTime7 = null;
    server1.setTime(iTime7);
    boolean b9 = server1.repOK();
    tp2.IP iP10 = null;
    boolean b11 = server1.removeException(iP10);
    tp2.IP iP12 = null;
    // The following exception was thrown during execution in test generation
    try {
      boolean b13 = server1.addException(iP12);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long6 == 250000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);

  }

  @Test
  public void test088() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test088"); }


    tp2.Server server1 = new tp2.Server((-1));
    server1.update();
    tp2.IP iP3 = null;
    boolean b4 = server1.removeException(iP3);
    long long5 = server1.getLastUpdate();
    tp2.ITime iTime6 = null;
    server1.setTime(iTime6);
    tp2.IP iP8 = null;
    boolean b9 = server1.connect(iP8);
    java.lang.String str10 = server1.toString();
    tp2.IP iP11 = null;
    // The following exception was thrown during execution in test generation
    try {
      boolean b12 = server1.addException(iP11);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long5 == 250000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Server [lastUpdate=250000, exceptions=(), bans={}]"+ "'", str10.equals("Server [lastUpdate=250000, exceptions=(), bans={}]"));

  }

  @Test
  public void test089() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test089"); }


    tp2.Server server0 = new tp2.Server();
    server0.update();
    boolean b2 = server0.repOK();
    tp2.IP iP3 = null;
    boolean b4 = server0.connect(iP3);
    tp2.IP iP5 = null;
    boolean b6 = server0.removeBan(iP5);
    tp2.ITime iTime7 = null;
    server0.setTime(iTime7);
    tp2.IP iP9 = null;
    boolean b10 = server0.removeBan(iP9);
    tp2.IP iP11 = null;
    // The following exception was thrown during execution in test generation
    try {
      boolean b12 = server0.addException(iP11);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);

  }

  @Test
  public void test090() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test090"); }


    tp2.Server server1 = new tp2.Server(1);
    tp2.IP iP2 = null;
    boolean b3 = server1.removeBan(iP2);
    server1.update();
    tp2.IP iP5 = null;
    boolean b6 = server1.removeBan(iP5);
    tp2.IP iP7 = null;
    boolean b8 = server1.connect(iP7);
    server1.update();
    server1.update();
    java.lang.String str11 = server1.toString();
    server1.update();
    tp2.IP iP13 = null;
    boolean b14 = server1.connect(iP13);
    tp2.IP iP15 = null;
    // The following exception was thrown during execution in test generation
    try {
      boolean b16 = server1.addException(iP15);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Server [lastUpdate=250000, exceptions=(), bans={}]"+ "'", str11.equals("Server [lastUpdate=250000, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);

  }

  @Test
  public void test091() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test091"); }


    tp2.Server server0 = new tp2.Server();
    server0.update();
    tp2.IP iP2 = null;
    boolean b3 = server0.removeBan(iP2);
    tp2.ITime iTime4 = null;
    server0.setTime(iTime4);
    tp2.IP iP6 = null;
    boolean b7 = server0.connect(iP6);
    boolean b8 = server0.repOK();
    tp2.IP iP9 = null;
    boolean b10 = server0.removeBan(iP9);
    tp2.IP iP11 = null;
    boolean b12 = server0.removeBan(iP11);
    tp2.IP iP13 = null;
    // The following exception was thrown during execution in test generation
    try {
      boolean b14 = server0.addBan(iP13);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);

  }

  @Test
  public void test092() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test092"); }


    tp2.Server server1 = new tp2.Server(1);
    tp2.IP iP2 = null;
    boolean b3 = server1.removeBan(iP2);
    server1.update();
    long long5 = server1.getLastUpdate();
    tp2.IP iP6 = null;
    boolean b7 = server1.connect(iP6);
    tp2.IP iP8 = null;
    boolean b9 = server1.removeBan(iP8);
    tp2.IP iP10 = null;
    boolean b11 = server1.addBan(iP10);
    long long12 = server1.getLastUpdate();
    tp2.IP iP13 = null;
    // The following exception was thrown during execution in test generation
    try {
      boolean b14 = server1.addException(iP13);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long5 == 250000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long12 == 250000L);

  }

  @Test
  public void test093() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test093"); }


    tp2.Server server0 = new tp2.Server();
    server0.update();
    tp2.IP iP2 = null;
    boolean b3 = server0.removeBan(iP2);
    tp2.ITime iTime4 = null;
    server0.setTime(iTime4);
    tp2.IP iP6 = null;
    boolean b7 = server0.connect(iP6);
    tp2.IP iP8 = null;
    boolean b9 = server0.connect(iP8);
    // The following exception was thrown during execution in test generation
    try {
      server0.update();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);

  }

  @Test
  public void test094() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test094"); }


    tp2.Server server0 = new tp2.Server();
    server0.update();
    tp2.IP iP2 = null;
    boolean b3 = server0.removeBan(iP2);
    server0.update();
    java.lang.String str5 = server0.toString();
    tp2.IP iP6 = null;
    boolean b7 = server0.removeException(iP6);
    boolean b8 = server0.repOK();
    tp2.IP iP9 = null;
    boolean b10 = server0.addBan(iP9);
    tp2.IP iP11 = null;
    boolean b12 = server0.removeException(iP11);
    tp2.IP iP13 = null;
    // The following exception was thrown during execution in test generation
    try {
      boolean b14 = server0.addException(iP13);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Server [lastUpdate=1465347898035, exceptions=(), bans={}]"+ "'", str5.equals("Server [lastUpdate=1465347898035, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);

  }

  @Test
  public void test095() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test095"); }


    tp2.Server server1 = new tp2.Server(1);
    tp2.IP iP2 = null;
    boolean b3 = server1.removeBan(iP2);
    server1.update();
    long long5 = server1.getLastUpdate();
    tp2.IP iP6 = null;
    boolean b7 = server1.connect(iP6);
    tp2.IP iP8 = null;
    boolean b9 = server1.removeBan(iP8);
    boolean b10 = server1.repOK();
    tp2.IP iP11 = null;
    boolean b12 = server1.addBan(iP11);
    tp2.ITime iTime13 = null;
    server1.setTime(iTime13);
    tp2.IP iP15 = null;
    // The following exception was thrown during execution in test generation
    try {
      boolean b16 = server1.addBan(iP15);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long5 == 250000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);

  }

  @Test
  public void test096() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test096"); }


    tp2.Server server1 = new tp2.Server(1);
    tp2.IP iP2 = null;
    boolean b3 = server1.removeBan(iP2);
    tp2.ITime iTime4 = null;
    server1.setTime(iTime4);
    tp2.IP iP6 = null;
    boolean b7 = server1.removeBan(iP6);
    tp2.ITime iTime8 = null;
    server1.setTime(iTime8);
    java.lang.String str10 = server1.toString();
    boolean b11 = server1.repOK();
    tp2.IP iP12 = null;
    boolean b13 = server1.connect(iP12);
    tp2.IP iP14 = null;
    boolean b15 = server1.removeBan(iP14);
    java.lang.String str16 = server1.toString();
    java.lang.String str17 = server1.toString();
    tp2.ITime iTime18 = null;
    server1.setTime(iTime18);
    tp2.IP iP20 = null;
    boolean b21 = server1.removeException(iP20);
    // The following exception was thrown during execution in test generation
    try {
      long long22 = server1.getLastUpdate();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Server [lastUpdate=null, exceptions=(), bans={}]"+ "'", str10.equals("Server [lastUpdate=null, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "Server [lastUpdate=null, exceptions=(), bans={}]"+ "'", str16.equals("Server [lastUpdate=null, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "Server [lastUpdate=null, exceptions=(), bans={}]"+ "'", str17.equals("Server [lastUpdate=null, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);

  }

  @Test
  public void test097() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test097"); }


    tp2.Server server0 = new tp2.Server();
    server0.update();
    tp2.IP iP2 = null;
    boolean b3 = server0.removeBan(iP2);
    tp2.IP iP4 = null;
    boolean b5 = server0.connect(iP4);
    server0.update();
    tp2.IP iP7 = null;
    boolean b8 = server0.removeBan(iP7);
    java.lang.String str9 = server0.toString();
    long long10 = server0.getLastUpdate();
    long long11 = server0.getLastUpdate();
    tp2.ITime iTime12 = null;
    server0.setTime(iTime12);
    // The following exception was thrown during execution in test generation
    try {
      server0.update();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Server [lastUpdate=1465347898047, exceptions=(), bans={}]"+ "'", str9.equals("Server [lastUpdate=1465347898047, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long10 == 1465347898047L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long11 == 1465347898047L);

  }

  @Test
  public void test098() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test098"); }


    tp2.Server server1 = new tp2.Server((-1));
    server1.update();
    tp2.IP iP3 = null;
    boolean b4 = server1.addBan(iP3);
    java.lang.String str5 = server1.toString();
    server1.update();
    tp2.IP iP7 = null;
    // The following exception was thrown during execution in test generation
    try {
      boolean b8 = server1.connect(iP7);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Server [lastUpdate=250000, exceptions=(), bans={[IPBan [ip=null, expires=310000]]}]"+ "'", str5.equals("Server [lastUpdate=250000, exceptions=(), bans={[IPBan [ip=null, expires=310000]]}]"));

  }

  @Test
  public void test099() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test099"); }


    tp2.Server server1 = new tp2.Server(1);
    tp2.IP iP2 = null;
    boolean b3 = server1.removeBan(iP2);
    boolean b4 = server1.repOK();
    tp2.IP iP5 = null;
    boolean b6 = server1.removeException(iP5);
    tp2.IP iP7 = null;
    boolean b8 = server1.connect(iP7);
    tp2.IP iP9 = null;
    boolean b10 = server1.connect(iP9);
    // The following exception was thrown during execution in test generation
    try {
      long long11 = server1.getLastUpdate();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);

  }

  @Test
  public void test100() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test100"); }


    tp2.Server server0 = new tp2.Server();
    server0.update();
    boolean b2 = server0.repOK();
    tp2.ITime iTime3 = null;
    server0.setTime(iTime3);
    tp2.IP iP5 = null;
    // The following exception was thrown during execution in test generation
    try {
      boolean b6 = server0.addBan(iP5);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);

  }

  @Test
  public void test101() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test101"); }


    tp2.Server server1 = new tp2.Server(1);
    tp2.IP iP2 = null;
    boolean b3 = server1.removeBan(iP2);
    server1.update();
    tp2.IP iP5 = null;
    boolean b6 = server1.removeBan(iP5);
    java.lang.String str7 = server1.toString();
    long long8 = server1.getLastUpdate();
    server1.update();
    long long10 = server1.getLastUpdate();
    tp2.ITime iTime11 = null;
    server1.setTime(iTime11);
    tp2.IP iP13 = null;
    boolean b14 = server1.connect(iP13);
    tp2.IP iP15 = null;
    boolean b16 = server1.removeException(iP15);
    tp2.IP iP17 = null;
    // The following exception was thrown during execution in test generation
    try {
      boolean b18 = server1.addBan(iP17);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Server [lastUpdate=250000, exceptions=(), bans={}]"+ "'", str7.equals("Server [lastUpdate=250000, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long8 == 250000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long10 == 250000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);

  }

  @Test
  public void test102() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test102"); }


    tp2.Server server1 = new tp2.Server(1);
    tp2.IP iP2 = null;
    boolean b3 = server1.removeBan(iP2);
    server1.update();
    tp2.IP iP5 = null;
    boolean b6 = server1.removeBan(iP5);
    tp2.IP iP7 = null;
    boolean b8 = server1.removeBan(iP7);
    tp2.IP iP9 = null;
    boolean b10 = server1.removeException(iP9);
    tp2.IP iP11 = null;
    boolean b12 = server1.removeException(iP11);
    tp2.IP iP13 = null;
    boolean b14 = server1.addBan(iP13);
    long long15 = server1.getLastUpdate();
    tp2.IP iP16 = null;
    // The following exception was thrown during execution in test generation
    try {
      boolean b17 = server1.removeBan(iP16);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long15 == 250000L);

  }

  @Test
  public void test103() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test103"); }


    tp2.Server server1 = new tp2.Server(1);
    tp2.IP iP2 = null;
    boolean b3 = server1.removeBan(iP2);
    server1.update();
    java.lang.String str5 = server1.toString();
    tp2.IP iP6 = null;
    boolean b7 = server1.addBan(iP6);
    long long8 = server1.getLastUpdate();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Server [lastUpdate=250000, exceptions=(), bans={}]"+ "'", str5.equals("Server [lastUpdate=250000, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long8 == 250000L);

  }

  @Test
  public void test104() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test104"); }


    tp2.Server server1 = new tp2.Server((-1));
    server1.update();
    tp2.IP iP3 = null;
    boolean b4 = server1.addBan(iP3);
    java.lang.String str5 = server1.toString();
    server1.update();
    tp2.IP iP7 = null;
    boolean b8 = server1.removeException(iP7);
    tp2.IP iP9 = null;
    // The following exception was thrown during execution in test generation
    try {
      boolean b10 = server1.removeBan(iP9);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Server [lastUpdate=250000, exceptions=(), bans={[IPBan [ip=null, expires=310000]]}]"+ "'", str5.equals("Server [lastUpdate=250000, exceptions=(), bans={[IPBan [ip=null, expires=310000]]}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);

  }

  @Test
  public void test105() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test105"); }


    tp2.Server server1 = new tp2.Server(1);
    tp2.IP iP2 = null;
    boolean b3 = server1.removeBan(iP2);
    tp2.ITime iTime4 = null;
    server1.setTime(iTime4);
    tp2.ITime iTime6 = null;
    server1.setTime(iTime6);
    tp2.IP iP8 = null;
    boolean b9 = server1.removeBan(iP8);
    boolean b10 = server1.repOK();
    tp2.IP iP11 = null;
    // The following exception was thrown during execution in test generation
    try {
      boolean b12 = server1.addException(iP11);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);

  }

  @Test
  public void test106() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test106"); }


    tp2.Server server1 = new tp2.Server(1);
    tp2.IP iP2 = null;
    boolean b3 = server1.removeBan(iP2);
    tp2.ITime iTime4 = null;
    server1.setTime(iTime4);
    tp2.IP iP6 = null;
    boolean b7 = server1.removeBan(iP6);
    java.lang.String str8 = server1.toString();
    tp2.ITime iTime9 = null;
    server1.setTime(iTime9);
    tp2.IP iP11 = null;
    boolean b12 = server1.removeBan(iP11);
    tp2.IP iP13 = null;
    boolean b14 = server1.removeException(iP13);
    tp2.IP iP15 = null;
    boolean b16 = server1.connect(iP15);
    tp2.IP iP17 = null;
    boolean b18 = server1.connect(iP17);
    tp2.IP iP19 = null;
    // The following exception was thrown during execution in test generation
    try {
      boolean b20 = server1.addBan(iP19);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Server [lastUpdate=null, exceptions=(), bans={}]"+ "'", str8.equals("Server [lastUpdate=null, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);

  }

  @Test
  public void test107() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test107"); }


    tp2.Server server1 = new tp2.Server(1);
    tp2.IP iP2 = null;
    boolean b3 = server1.removeException(iP2);
    java.lang.String str4 = server1.toString();
    tp2.IP iP5 = null;
    boolean b6 = server1.connect(iP5);
    tp2.IP iP7 = null;
    boolean b8 = server1.removeBan(iP7);
    tp2.IP iP9 = null;
    boolean b10 = server1.addBan(iP9);
    tp2.IP iP11 = null;
    // The following exception was thrown during execution in test generation
    try {
      boolean b12 = server1.addException(iP11);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Server [lastUpdate=null, exceptions=(), bans={}]"+ "'", str4.equals("Server [lastUpdate=null, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);

  }

  @Test
  public void test108() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test108"); }


    tp2.Server server0 = new tp2.Server();
    server0.update();
    boolean b2 = server0.repOK();
    tp2.IP iP3 = null;
    boolean b4 = server0.connect(iP3);
    server0.update();
    tp2.IP iP6 = null;
    boolean b7 = server0.connect(iP6);
    java.lang.String str8 = server0.toString();
    tp2.IP iP9 = null;
    // The following exception was thrown during execution in test generation
    try {
      boolean b10 = server0.addException(iP9);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Server [lastUpdate=1465347898072, exceptions=(), bans={}]"+ "'", str8.equals("Server [lastUpdate=1465347898072, exceptions=(), bans={}]"));

  }

  @Test
  public void test109() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test109"); }


    tp2.Server server1 = new tp2.Server(1);
    tp2.IP iP2 = null;
    boolean b3 = server1.removeBan(iP2);
    server1.update();
    tp2.IP iP5 = null;
    boolean b6 = server1.removeBan(iP5);
    tp2.IP iP7 = null;
    boolean b8 = server1.removeBan(iP7);
    tp2.IP iP9 = null;
    boolean b10 = server1.addBan(iP9);
    tp2.ITime iTime11 = null;
    server1.setTime(iTime11);
    tp2.ITime iTime13 = null;
    server1.setTime(iTime13);
    java.lang.String str15 = server1.toString();
    tp2.IP iP16 = null;
    // The following exception was thrown during execution in test generation
    try {
      boolean b17 = server1.removeBan(iP16);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "Server [lastUpdate=250000, exceptions=(), bans={[IPBan [ip=null, expires=310000]]}]"+ "'", str15.equals("Server [lastUpdate=250000, exceptions=(), bans={[IPBan [ip=null, expires=310000]]}]"));

  }

  @Test
  public void test110() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test110"); }


    tp2.Server server1 = new tp2.Server(1);
    tp2.IP iP2 = null;
    boolean b3 = server1.removeBan(iP2);
    tp2.ITime iTime4 = null;
    server1.setTime(iTime4);
    tp2.IP iP6 = null;
    boolean b7 = server1.removeBan(iP6);
    tp2.ITime iTime8 = null;
    server1.setTime(iTime8);
    java.lang.String str10 = server1.toString();
    tp2.IP iP11 = null;
    boolean b12 = server1.removeBan(iP11);
    java.lang.String str13 = server1.toString();
    boolean b14 = server1.repOK();
    tp2.ITime iTime15 = null;
    server1.setTime(iTime15);
    tp2.IP iP17 = null;
    // The following exception was thrown during execution in test generation
    try {
      boolean b18 = server1.addException(iP17);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Server [lastUpdate=null, exceptions=(), bans={}]"+ "'", str10.equals("Server [lastUpdate=null, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Server [lastUpdate=null, exceptions=(), bans={}]"+ "'", str13.equals("Server [lastUpdate=null, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);

  }

  @Test
  public void test111() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test111"); }


    tp2.Server server1 = new tp2.Server((-1));
    server1.update();
    tp2.IP iP3 = null;
    boolean b4 = server1.addBan(iP3);
    java.lang.String str5 = server1.toString();
    server1.update();
    tp2.IP iP7 = null;
    boolean b8 = server1.removeException(iP7);
    tp2.ITime iTime9 = null;
    server1.setTime(iTime9);
    tp2.IP iP11 = null;
    // The following exception was thrown during execution in test generation
    try {
      boolean b12 = server1.connect(iP11);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Server [lastUpdate=250000, exceptions=(), bans={[IPBan [ip=null, expires=310000]]}]"+ "'", str5.equals("Server [lastUpdate=250000, exceptions=(), bans={[IPBan [ip=null, expires=310000]]}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);

  }

  @Test
  public void test112() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test112"); }


    tp2.Server server1 = new tp2.Server(1);
    tp2.IP iP2 = null;
    boolean b3 = server1.removeBan(iP2);
    server1.update();
    java.lang.String str5 = server1.toString();
    tp2.IP iP6 = null;
    boolean b7 = server1.connect(iP6);
    boolean b8 = server1.repOK();
    boolean b9 = server1.repOK();
    tp2.IP iP10 = null;
    boolean b11 = server1.removeException(iP10);
    tp2.IP iP12 = null;
    // The following exception was thrown during execution in test generation
    try {
      boolean b13 = server1.addException(iP12);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Server [lastUpdate=250000, exceptions=(), bans={}]"+ "'", str5.equals("Server [lastUpdate=250000, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);

  }

  @Test
  public void test113() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test113"); }


    tp2.Server server1 = new tp2.Server(1);
    tp2.IP iP2 = null;
    boolean b3 = server1.removeBan(iP2);
    server1.update();
    long long5 = server1.getLastUpdate();
    tp2.IP iP6 = null;
    boolean b7 = server1.connect(iP6);
    tp2.IP iP8 = null;
    boolean b9 = server1.removeBan(iP8);
    boolean b10 = server1.repOK();
    tp2.ITime iTime11 = null;
    server1.setTime(iTime11);
    tp2.IP iP13 = null;
    boolean b14 = server1.removeException(iP13);
    tp2.IP iP15 = null;
    boolean b16 = server1.removeBan(iP15);
    tp2.IP iP17 = null;
    // The following exception was thrown during execution in test generation
    try {
      boolean b18 = server1.addException(iP17);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long5 == 250000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);

  }

  @Test
  public void test114() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test114"); }


    tp2.Server server1 = new tp2.Server((-1));
    server1.update();
    tp2.IP iP3 = null;
    boolean b4 = server1.removeException(iP3);
    long long5 = server1.getLastUpdate();
    java.lang.String str6 = server1.toString();
    java.lang.String str7 = server1.toString();
    boolean b8 = server1.repOK();
    tp2.ITime iTime9 = null;
    server1.setTime(iTime9);
    tp2.IP iP11 = null;
    // The following exception was thrown during execution in test generation
    try {
      boolean b12 = server1.addBan(iP11);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long5 == 250000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Server [lastUpdate=250000, exceptions=(), bans={}]"+ "'", str6.equals("Server [lastUpdate=250000, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Server [lastUpdate=250000, exceptions=(), bans={}]"+ "'", str7.equals("Server [lastUpdate=250000, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);

  }

  @Test
  public void test115() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test115"); }


    tp2.Server server0 = new tp2.Server();
    server0.update();
    tp2.IP iP2 = null;
    boolean b3 = server0.removeBan(iP2);
    server0.update();
    java.lang.String str5 = server0.toString();
    tp2.IP iP6 = null;
    boolean b7 = server0.removeException(iP6);
    boolean b8 = server0.repOK();
    java.lang.String str9 = server0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Server [lastUpdate=1465347898085, exceptions=(), bans={}]"+ "'", str5.equals("Server [lastUpdate=1465347898085, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Server [lastUpdate=1465347898085, exceptions=(), bans={}]"+ "'", str9.equals("Server [lastUpdate=1465347898085, exceptions=(), bans={}]"));

  }

  @Test
  public void test116() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test116"); }


    tp2.Server server1 = new tp2.Server(1);
    tp2.IP iP2 = null;
    boolean b3 = server1.removeBan(iP2);
    tp2.ITime iTime4 = null;
    server1.setTime(iTime4);
    tp2.IP iP6 = null;
    boolean b7 = server1.removeBan(iP6);
    java.lang.String str8 = server1.toString();
    tp2.IP iP9 = null;
    boolean b10 = server1.connect(iP9);
    tp2.IP iP11 = null;
    boolean b12 = server1.removeException(iP11);
    // The following exception was thrown during execution in test generation
    try {
      server1.update();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Server [lastUpdate=null, exceptions=(), bans={}]"+ "'", str8.equals("Server [lastUpdate=null, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);

  }

  @Test
  public void test117() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test117"); }


    tp2.Server server1 = new tp2.Server(1);
    tp2.IP iP2 = null;
    boolean b3 = server1.removeBan(iP2);
    server1.update();
    java.lang.String str5 = server1.toString();
    tp2.IP iP6 = null;
    boolean b7 = server1.removeBan(iP6);
    tp2.IP iP8 = null;
    boolean b9 = server1.addBan(iP8);
    tp2.IP iP10 = null;
    boolean b11 = server1.removeException(iP10);
    java.lang.String str12 = server1.toString();
    long long13 = server1.getLastUpdate();
    tp2.IP iP14 = null;
    // The following exception was thrown during execution in test generation
    try {
      boolean b15 = server1.addBan(iP14);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Server [lastUpdate=250000, exceptions=(), bans={}]"+ "'", str5.equals("Server [lastUpdate=250000, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Server [lastUpdate=250000, exceptions=(), bans={[IPBan [ip=null, expires=310000]]}]"+ "'", str12.equals("Server [lastUpdate=250000, exceptions=(), bans={[IPBan [ip=null, expires=310000]]}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long13 == 250000L);

  }

  @Test
  public void test118() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test118"); }


    tp2.Server server1 = new tp2.Server(10);
    tp2.ITime iTime2 = null;
    server1.setTime(iTime2);
    tp2.IP iP4 = null;
    boolean b5 = server1.removeBan(iP4);
    // The following exception was thrown during execution in test generation
    try {
      server1.update();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);

  }

  @Test
  public void test119() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test119"); }


    tp2.Server server0 = new tp2.Server();
    server0.update();
    tp2.IP iP2 = null;
    boolean b3 = server0.removeBan(iP2);
    server0.update();
    java.lang.String str5 = server0.toString();
    java.lang.String str6 = server0.toString();
    tp2.IP iP7 = null;
    boolean b8 = server0.addBan(iP7);
    long long9 = server0.getLastUpdate();
    tp2.IP iP10 = null;
    // The following exception was thrown during execution in test generation
    try {
      boolean b11 = server0.addException(iP10);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Server [lastUpdate=1465347898094, exceptions=(), bans={}]"+ "'", str5.equals("Server [lastUpdate=1465347898094, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Server [lastUpdate=1465347898094, exceptions=(), bans={}]"+ "'", str6.equals("Server [lastUpdate=1465347898094, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long9 == 1465347898094L);

  }

  @Test
  public void test120() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test120"); }


    tp2.Server server0 = new tp2.Server();
    server0.update();
    tp2.IP iP2 = null;
    boolean b3 = server0.removeBan(iP2);
    server0.update();
    java.lang.String str5 = server0.toString();
    long long6 = server0.getLastUpdate();
    boolean b7 = server0.repOK();
    server0.update();
    tp2.IP iP9 = null;
    // The following exception was thrown during execution in test generation
    try {
      boolean b10 = server0.addException(iP9);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Server [lastUpdate=1465347898095, exceptions=(), bans={}]"+ "'", str5.equals("Server [lastUpdate=1465347898095, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long6 == 1465347898095L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);

  }

  @Test
  public void test121() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test121"); }


    tp2.Server server1 = new tp2.Server((-1));
    server1.update();
    boolean b3 = server1.repOK();
    tp2.IP iP4 = null;
    boolean b5 = server1.connect(iP4);
    tp2.IP iP6 = null;
    boolean b7 = server1.connect(iP6);
    tp2.IP iP8 = null;
    boolean b9 = server1.removeBan(iP8);
    tp2.IP iP10 = null;
    boolean b11 = server1.addBan(iP10);
    tp2.IP iP12 = null;
    boolean b13 = server1.removeException(iP12);
    long long14 = server1.getLastUpdate();
    tp2.IP iP15 = null;
    // The following exception was thrown during execution in test generation
    try {
      boolean b16 = server1.addException(iP15);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long14 == 250000L);

  }

  @Test
  public void test122() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test122"); }


    tp2.Server server1 = new tp2.Server(1);
    tp2.IP iP2 = null;
    boolean b3 = server1.removeBan(iP2);
    server1.update();
    java.lang.String str5 = server1.toString();
    tp2.IP iP6 = null;
    boolean b7 = server1.removeBan(iP6);
    java.lang.String str8 = server1.toString();
    tp2.IP iP9 = null;
    boolean b10 = server1.removeException(iP9);
    tp2.IP iP11 = null;
    boolean b12 = server1.removeException(iP11);
    boolean b13 = server1.repOK();
    tp2.IP iP14 = null;
    // The following exception was thrown during execution in test generation
    try {
      boolean b15 = server1.addException(iP14);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Server [lastUpdate=250000, exceptions=(), bans={}]"+ "'", str5.equals("Server [lastUpdate=250000, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Server [lastUpdate=250000, exceptions=(), bans={}]"+ "'", str8.equals("Server [lastUpdate=250000, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);

  }

  @Test
  public void test123() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test123"); }


    tp2.Server server1 = new tp2.Server((-1));
    server1.update();
    server1.update();
    tp2.IP iP4 = null;
    boolean b5 = server1.removeBan(iP4);
    long long6 = server1.getLastUpdate();
    boolean b7 = server1.repOK();
    tp2.IP iP8 = null;
    boolean b9 = server1.connect(iP8);
    tp2.IP iP10 = null;
    boolean b11 = server1.removeBan(iP10);
    tp2.IP iP12 = null;
    boolean b13 = server1.connect(iP12);
    server1.update();
    tp2.ITime iTime15 = null;
    server1.setTime(iTime15);
    tp2.IP iP17 = null;
    // The following exception was thrown during execution in test generation
    try {
      boolean b18 = server1.addException(iP17);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long6 == 250000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);

  }

  @Test
  public void test124() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test124"); }


    tp2.Server server0 = new tp2.Server();
    server0.update();
    boolean b2 = server0.repOK();
    tp2.IP iP3 = null;
    boolean b4 = server0.connect(iP3);
    server0.update();
    tp2.IP iP6 = null;
    boolean b7 = server0.removeException(iP6);
    long long8 = server0.getLastUpdate();
    java.lang.String str9 = server0.toString();
    boolean b10 = server0.repOK();
    tp2.IP iP11 = null;
    boolean b12 = server0.addBan(iP11);
    tp2.IP iP13 = null;
    // The following exception was thrown during execution in test generation
    try {
      boolean b14 = server0.addException(iP13);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long8 == 1465347898102L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Server [lastUpdate=1465347898102, exceptions=(), bans={}]"+ "'", str9.equals("Server [lastUpdate=1465347898102, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);

  }

  @Test
  public void test125() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test125"); }


    tp2.Server server1 = new tp2.Server((-1));
    server1.update();
    boolean b3 = server1.repOK();
    tp2.IP iP4 = null;
    boolean b5 = server1.connect(iP4);
    tp2.IP iP6 = null;
    boolean b7 = server1.removeBan(iP6);
    long long8 = server1.getLastUpdate();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long8 == 250000L);

  }

  @Test
  public void test126() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test126"); }


    tp2.Server server1 = new tp2.Server(1);
    tp2.IP iP2 = null;
    boolean b3 = server1.removeBan(iP2);
    tp2.ITime iTime4 = null;
    server1.setTime(iTime4);
    tp2.IP iP6 = null;
    boolean b7 = server1.removeBan(iP6);
    java.lang.String str8 = server1.toString();
    tp2.IP iP9 = null;
    boolean b10 = server1.removeException(iP9);
    tp2.IP iP11 = null;
    boolean b12 = server1.removeBan(iP11);
    tp2.IP iP13 = null;
    boolean b14 = server1.connect(iP13);
    tp2.IP iP15 = null;
    // The following exception was thrown during execution in test generation
    try {
      boolean b16 = server1.addException(iP15);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Server [lastUpdate=null, exceptions=(), bans={}]"+ "'", str8.equals("Server [lastUpdate=null, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);

  }

  @Test
  public void test127() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test127"); }


    tp2.Server server0 = new tp2.Server();
    server0.update();
    tp2.IP iP2 = null;
    boolean b3 = server0.removeBan(iP2);
    server0.update();
    java.lang.String str5 = server0.toString();
    java.lang.String str6 = server0.toString();
    tp2.IP iP7 = null;
    boolean b8 = server0.addBan(iP7);
    server0.update();
    tp2.IP iP10 = null;
    // The following exception was thrown during execution in test generation
    try {
      boolean b11 = server0.removeBan(iP10);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Server [lastUpdate=1465347898106, exceptions=(), bans={}]"+ "'", str5.equals("Server [lastUpdate=1465347898106, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Server [lastUpdate=1465347898106, exceptions=(), bans={}]"+ "'", str6.equals("Server [lastUpdate=1465347898106, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);

  }

  @Test
  public void test128() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test128"); }


    tp2.Server server1 = new tp2.Server(1);
    tp2.IP iP2 = null;
    boolean b3 = server1.removeBan(iP2);
    server1.update();
    tp2.IP iP5 = null;
    boolean b6 = server1.removeBan(iP5);
    tp2.IP iP7 = null;
    boolean b8 = server1.removeBan(iP7);
    tp2.IP iP9 = null;
    boolean b10 = server1.removeException(iP9);
    tp2.IP iP11 = null;
    boolean b12 = server1.removeException(iP11);
    tp2.ITime iTime13 = null;
    server1.setTime(iTime13);
    tp2.IP iP15 = null;
    boolean b16 = server1.removeException(iP15);
    boolean b17 = server1.repOK();
    tp2.IP iP18 = null;
    // The following exception was thrown during execution in test generation
    try {
      boolean b19 = server1.addBan(iP18);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);

  }

  @Test
  public void test129() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test129"); }


    tp2.Server server1 = new tp2.Server(1);
    tp2.IP iP2 = null;
    boolean b3 = server1.removeBan(iP2);
    server1.update();
    tp2.IP iP5 = null;
    boolean b6 = server1.removeBan(iP5);
    long long7 = server1.getLastUpdate();
    server1.update();
    tp2.IP iP9 = null;
    boolean b10 = server1.removeBan(iP9);
    tp2.ITime iTime11 = null;
    server1.setTime(iTime11);
    tp2.IP iP13 = null;
    boolean b14 = server1.connect(iP13);
    tp2.IP iP15 = null;
    // The following exception was thrown during execution in test generation
    try {
      boolean b16 = server1.addException(iP15);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long7 == 250000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);

  }

  @Test
  public void test130() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test130"); }


    tp2.Server server1 = new tp2.Server(1);
    tp2.IP iP2 = null;
    boolean b3 = server1.removeBan(iP2);
    server1.update();
    tp2.IP iP5 = null;
    boolean b6 = server1.removeBan(iP5);
    tp2.IP iP7 = null;
    boolean b8 = server1.connect(iP7);
    tp2.IP iP9 = null;
    boolean b10 = server1.addBan(iP9);
    java.lang.String str11 = server1.toString();
    tp2.IP iP12 = null;
    // The following exception was thrown during execution in test generation
    try {
      boolean b13 = server1.addException(iP12);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Server [lastUpdate=250000, exceptions=(), bans={[IPBan [ip=null, expires=310000]]}]"+ "'", str11.equals("Server [lastUpdate=250000, exceptions=(), bans={[IPBan [ip=null, expires=310000]]}]"));

  }

  @Test
  public void test131() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test131"); }


    tp2.Server server0 = new tp2.Server();
    boolean b1 = server0.repOK();
    tp2.IP iP2 = null;
    boolean b3 = server0.connect(iP2);
    server0.update();
    tp2.IP iP5 = null;
    // The following exception was thrown during execution in test generation
    try {
      boolean b6 = server0.addException(iP5);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);

  }

  @Test
  public void test132() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test132"); }


    tp2.Server server0 = new tp2.Server();
    server0.update();
    tp2.IP iP2 = null;
    boolean b3 = server0.removeBan(iP2);
    tp2.ITime iTime4 = null;
    server0.setTime(iTime4);
    tp2.IP iP6 = null;
    boolean b7 = server0.connect(iP6);
    boolean b8 = server0.repOK();
    tp2.ITime iTime9 = null;
    server0.setTime(iTime9);
    tp2.IP iP11 = null;
    boolean b12 = server0.removeBan(iP11);
    tp2.IP iP13 = null;
    boolean b14 = server0.removeBan(iP13);
    tp2.IP iP15 = null;
    // The following exception was thrown during execution in test generation
    try {
      boolean b16 = server0.addBan(iP15);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);

  }

  @Test
  public void test133() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test133"); }


    tp2.Server server0 = new tp2.Server();
    server0.update();
    tp2.IP iP2 = null;
    boolean b3 = server0.removeBan(iP2);
    tp2.IP iP4 = null;
    boolean b5 = server0.connect(iP4);
    server0.update();
    tp2.IP iP7 = null;
    boolean b8 = server0.removeBan(iP7);
    java.lang.String str9 = server0.toString();
    tp2.IP iP10 = null;
    boolean b11 = server0.addBan(iP10);
    tp2.IP iP12 = null;
    // The following exception was thrown during execution in test generation
    try {
      boolean b13 = server0.addBan(iP12);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Server [lastUpdate=1465347898111, exceptions=(), bans={}]"+ "'", str9.equals("Server [lastUpdate=1465347898111, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);

  }

  @Test
  public void test134() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test134"); }


    tp2.Server server0 = new tp2.Server();
    tp2.IP iP1 = null;
    boolean b2 = server0.removeException(iP1);
    server0.update();
    long long4 = server0.getLastUpdate();
    tp2.IP iP5 = null;
    boolean b6 = server0.removeBan(iP5);
    tp2.IP iP7 = null;
    boolean b8 = server0.connect(iP7);
    java.lang.String str9 = server0.toString();
    tp2.IP iP10 = null;
    // The following exception was thrown during execution in test generation
    try {
      boolean b11 = server0.addException(iP10);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long4 == 1465347898113L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Server [lastUpdate=1465347898113, exceptions=(), bans={}]"+ "'", str9.equals("Server [lastUpdate=1465347898113, exceptions=(), bans={}]"));

  }

  @Test
  public void test135() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test135"); }


    tp2.Server server1 = new tp2.Server((-1));
    server1.update();
    server1.update();
    tp2.ITime iTime4 = null;
    server1.setTime(iTime4);
    tp2.IP iP6 = null;
    boolean b7 = server1.removeException(iP6);
    boolean b8 = server1.repOK();
    tp2.IP iP9 = null;
    boolean b10 = server1.removeException(iP9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);

  }

  @Test
  public void test136() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test136"); }


    tp2.Server server0 = new tp2.Server();
    server0.update();
    boolean b2 = server0.repOK();
    tp2.IP iP3 = null;
    boolean b4 = server0.connect(iP3);
    server0.update();
    java.lang.String str6 = server0.toString();
    boolean b7 = server0.repOK();
    tp2.ITime iTime8 = null;
    server0.setTime(iTime8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Server [lastUpdate=1465347898115, exceptions=(), bans={}]"+ "'", str6.equals("Server [lastUpdate=1465347898115, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);

  }

  @Test
  public void test137() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test137"); }


    tp2.Server server1 = new tp2.Server(1);
    tp2.IP iP2 = null;
    boolean b3 = server1.removeBan(iP2);
    server1.update();
    tp2.IP iP5 = null;
    boolean b6 = server1.removeBan(iP5);
    tp2.IP iP7 = null;
    boolean b8 = server1.removeException(iP7);
    boolean b9 = server1.repOK();
    server1.update();
    boolean b11 = server1.repOK();
    tp2.IP iP12 = null;
    boolean b13 = server1.removeException(iP12);
    boolean b14 = server1.repOK();
    tp2.IP iP15 = null;
    boolean b16 = server1.removeBan(iP15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);

  }

  @Test
  public void test138() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test138"); }


    tp2.Server server1 = new tp2.Server(1);
    tp2.IP iP2 = null;
    boolean b3 = server1.removeBan(iP2);
    tp2.ITime iTime4 = null;
    server1.setTime(iTime4);
    tp2.IP iP6 = null;
    boolean b7 = server1.removeBan(iP6);
    tp2.ITime iTime8 = null;
    server1.setTime(iTime8);
    tp2.ITime iTime10 = null;
    server1.setTime(iTime10);
    boolean b12 = server1.repOK();
    tp2.IP iP13 = null;
    boolean b14 = server1.connect(iP13);
    tp2.ITime iTime15 = null;
    server1.setTime(iTime15);
    tp2.ITime iTime17 = null;
    server1.setTime(iTime17);
    tp2.IP iP19 = null;
    boolean b20 = server1.removeBan(iP19);
    // The following exception was thrown during execution in test generation
    try {
      long long21 = server1.getLastUpdate();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);

  }

  @Test
  public void test139() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test139"); }


    tp2.Server server1 = new tp2.Server(1);
    tp2.IP iP2 = null;
    boolean b3 = server1.removeBan(iP2);
    tp2.ITime iTime4 = null;
    server1.setTime(iTime4);
    tp2.IP iP6 = null;
    boolean b7 = server1.removeBan(iP6);
    java.lang.String str8 = server1.toString();
    tp2.ITime iTime9 = null;
    server1.setTime(iTime9);
    tp2.IP iP11 = null;
    boolean b12 = server1.removeBan(iP11);
    java.lang.String str13 = server1.toString();
    boolean b14 = server1.repOK();
    tp2.IP iP15 = null;
    boolean b16 = server1.removeBan(iP15);
    tp2.IP iP17 = null;
    // The following exception was thrown during execution in test generation
    try {
      boolean b18 = server1.addException(iP17);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Server [lastUpdate=null, exceptions=(), bans={}]"+ "'", str8.equals("Server [lastUpdate=null, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Server [lastUpdate=null, exceptions=(), bans={}]"+ "'", str13.equals("Server [lastUpdate=null, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);

  }

  @Test
  public void test140() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test140"); }


    tp2.Server server1 = new tp2.Server(1);
    tp2.IP iP2 = null;
    boolean b3 = server1.removeBan(iP2);
    server1.update();
    java.lang.String str5 = server1.toString();
    tp2.IP iP6 = null;
    boolean b7 = server1.removeBan(iP6);
    tp2.IP iP8 = null;
    boolean b9 = server1.removeBan(iP8);
    tp2.ITime iTime10 = null;
    server1.setTime(iTime10);
    long long12 = server1.getLastUpdate();
    tp2.IP iP13 = null;
    boolean b14 = server1.connect(iP13);
    tp2.IP iP15 = null;
    boolean b16 = server1.removeBan(iP15);
    tp2.ITime iTime17 = null;
    server1.setTime(iTime17);
    tp2.IP iP19 = null;
    // The following exception was thrown during execution in test generation
    try {
      boolean b20 = server1.addBan(iP19);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Server [lastUpdate=250000, exceptions=(), bans={}]"+ "'", str5.equals("Server [lastUpdate=250000, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long12 == 250000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);

  }

  @Test
  public void test141() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test141"); }


    tp2.Server server0 = new tp2.Server();
    server0.update();
    tp2.IP iP2 = null;
    boolean b3 = server0.removeBan(iP2);
    tp2.IP iP4 = null;
    boolean b5 = server0.connect(iP4);
    server0.update();
    tp2.ITime iTime7 = null;
    server0.setTime(iTime7);
    tp2.IP iP9 = null;
    // The following exception was thrown during execution in test generation
    try {
      boolean b10 = server0.addBan(iP9);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);

  }

  @Test
  public void test142() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test142"); }


    tp2.Server server0 = new tp2.Server();
    server0.update();
    boolean b2 = server0.repOK();
    tp2.IP iP3 = null;
    boolean b4 = server0.connect(iP3);
    tp2.IP iP5 = null;
    boolean b6 = server0.removeBan(iP5);
    tp2.IP iP7 = null;
    boolean b8 = server0.removeException(iP7);
    tp2.IP iP9 = null;
    // The following exception was thrown during execution in test generation
    try {
      boolean b10 = server0.addException(iP9);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);

  }

  @Test
  public void test143() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test143"); }


    tp2.Server server1 = new tp2.Server((-1));
    server1.update();
    tp2.IP iP3 = null;
    boolean b4 = server1.removeException(iP3);
    long long5 = server1.getLastUpdate();
    tp2.ITime iTime6 = null;
    server1.setTime(iTime6);
    long long8 = server1.getLastUpdate();
    tp2.ITime iTime9 = null;
    server1.setTime(iTime9);
    java.lang.String str11 = server1.toString();
    tp2.IP iP12 = null;
    boolean b13 = server1.removeException(iP12);
    // The following exception was thrown during execution in test generation
    try {
      server1.update();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long5 == 250000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long8 == 250000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Server [lastUpdate=250000, exceptions=(), bans={}]"+ "'", str11.equals("Server [lastUpdate=250000, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);

  }

  @Test
  public void test144() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test144"); }


    tp2.Server server0 = new tp2.Server();
    server0.update();
    boolean b2 = server0.repOK();
    tp2.IP iP3 = null;
    boolean b4 = server0.connect(iP3);
    tp2.IP iP5 = null;
    boolean b6 = server0.removeBan(iP5);
    boolean b7 = server0.repOK();
    tp2.IP iP8 = null;
    boolean b9 = server0.removeException(iP8);
    server0.update();
    tp2.IP iP11 = null;
    boolean b12 = server0.addBan(iP11);
    tp2.IP iP13 = null;
    // The following exception was thrown during execution in test generation
    try {
      boolean b14 = server0.addBan(iP13);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);

  }

  @Test
  public void test145() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test145"); }


    tp2.Server server1 = new tp2.Server(1);
    tp2.IP iP2 = null;
    boolean b3 = server1.removeBan(iP2);
    tp2.ITime iTime4 = null;
    server1.setTime(iTime4);
    tp2.IP iP6 = null;
    boolean b7 = server1.removeBan(iP6);
    java.lang.String str8 = server1.toString();
    tp2.ITime iTime9 = null;
    server1.setTime(iTime9);
    tp2.IP iP11 = null;
    boolean b12 = server1.removeBan(iP11);
    java.lang.String str13 = server1.toString();
    java.lang.String str14 = server1.toString();
    tp2.ITime iTime15 = null;
    server1.setTime(iTime15);
    // The following exception was thrown during execution in test generation
    try {
      long long17 = server1.getLastUpdate();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Server [lastUpdate=null, exceptions=(), bans={}]"+ "'", str8.equals("Server [lastUpdate=null, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Server [lastUpdate=null, exceptions=(), bans={}]"+ "'", str13.equals("Server [lastUpdate=null, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "Server [lastUpdate=null, exceptions=(), bans={}]"+ "'", str14.equals("Server [lastUpdate=null, exceptions=(), bans={}]"));

  }

  @Test
  public void test146() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test146"); }


    tp2.Server server1 = new tp2.Server(1);
    tp2.IP iP2 = null;
    boolean b3 = server1.removeBan(iP2);
    server1.update();
    java.lang.String str5 = server1.toString();
    tp2.IP iP6 = null;
    boolean b7 = server1.removeBan(iP6);
    java.lang.String str8 = server1.toString();
    tp2.IP iP9 = null;
    boolean b10 = server1.removeException(iP9);
    boolean b11 = server1.repOK();
    tp2.ITime iTime12 = null;
    server1.setTime(iTime12);
    tp2.IP iP14 = null;
    boolean b15 = server1.connect(iP14);
    tp2.IP iP16 = null;
    boolean b17 = server1.removeException(iP16);
    boolean b18 = server1.repOK();
    tp2.IP iP19 = null;
    boolean b20 = server1.removeBan(iP19);
    tp2.IP iP21 = null;
    // The following exception was thrown during execution in test generation
    try {
      boolean b22 = server1.addBan(iP21);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Server [lastUpdate=250000, exceptions=(), bans={}]"+ "'", str5.equals("Server [lastUpdate=250000, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Server [lastUpdate=250000, exceptions=(), bans={}]"+ "'", str8.equals("Server [lastUpdate=250000, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);

  }

  @Test
  public void test147() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test147"); }


    tp2.Server server1 = new tp2.Server(1);
    tp2.IP iP2 = null;
    boolean b3 = server1.removeBan(iP2);
    tp2.ITime iTime4 = null;
    server1.setTime(iTime4);
    tp2.IP iP6 = null;
    boolean b7 = server1.removeBan(iP6);
    tp2.ITime iTime8 = null;
    server1.setTime(iTime8);
    tp2.ITime iTime10 = null;
    server1.setTime(iTime10);
    tp2.ITime iTime12 = null;
    server1.setTime(iTime12);
    tp2.IP iP14 = null;
    boolean b15 = server1.removeBan(iP14);
    tp2.ITime iTime16 = null;
    server1.setTime(iTime16);
    tp2.IP iP18 = null;
    // The following exception was thrown during execution in test generation
    try {
      boolean b19 = server1.addBan(iP18);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);

  }

  @Test
  public void test148() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test148"); }


    tp2.Server server1 = new tp2.Server((-1));
    server1.update();
    server1.update();
    tp2.IP iP4 = null;
    boolean b5 = server1.removeException(iP4);
    tp2.IP iP6 = null;
    boolean b7 = server1.removeException(iP6);
    tp2.IP iP8 = null;
    boolean b9 = server1.removeBan(iP8);
    tp2.IP iP10 = null;
    boolean b11 = server1.removeException(iP10);
    tp2.ITime iTime12 = null;
    server1.setTime(iTime12);
    tp2.IP iP14 = null;
    // The following exception was thrown during execution in test generation
    try {
      boolean b15 = server1.addBan(iP14);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);

  }

  @Test
  public void test149() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test149"); }


    tp2.Server server1 = new tp2.Server(1);
    tp2.IP iP2 = null;
    boolean b3 = server1.removeBan(iP2);
    server1.update();
    tp2.IP iP5 = null;
    boolean b6 = server1.removeBan(iP5);
    java.lang.String str7 = server1.toString();
    long long8 = server1.getLastUpdate();
    server1.update();
    long long10 = server1.getLastUpdate();
    server1.update();
    tp2.IP iP12 = null;
    boolean b13 = server1.removeException(iP12);
    long long14 = server1.getLastUpdate();
    tp2.IP iP15 = null;
    boolean b16 = server1.removeException(iP15);
    tp2.IP iP17 = null;
    boolean b18 = server1.removeBan(iP17);
    tp2.IP iP19 = null;
    boolean b20 = server1.addBan(iP19);
    tp2.IP iP21 = null;
    // The following exception was thrown during execution in test generation
    try {
      boolean b22 = server1.removeBan(iP21);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Server [lastUpdate=250000, exceptions=(), bans={}]"+ "'", str7.equals("Server [lastUpdate=250000, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long8 == 250000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long10 == 250000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long14 == 250000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);

  }

  @Test
  public void test150() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test150"); }


    tp2.Server server0 = new tp2.Server();
    server0.update();
    tp2.IP iP2 = null;
    boolean b3 = server0.removeBan(iP2);
    server0.update();
    tp2.IP iP5 = null;
    boolean b6 = server0.addBan(iP5);
    long long7 = server0.getLastUpdate();
    tp2.IP iP8 = null;
    boolean b9 = server0.removeException(iP8);
    tp2.ITime iTime10 = null;
    server0.setTime(iTime10);
    tp2.IP iP12 = null;
    // The following exception was thrown during execution in test generation
    try {
      boolean b13 = server0.addBan(iP12);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long7 == 1465347898151L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);

  }

  @Test
  public void test151() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test151"); }


    tp2.Server server0 = new tp2.Server();
    server0.update();
    boolean b2 = server0.repOK();
    long long3 = server0.getLastUpdate();
    tp2.IP iP4 = null;
    boolean b5 = server0.removeBan(iP4);
    tp2.IP iP6 = null;
    boolean b7 = server0.removeException(iP6);
    long long8 = server0.getLastUpdate();
    tp2.IP iP9 = null;
    boolean b10 = server0.removeException(iP9);
    tp2.IP iP11 = null;
    // The following exception was thrown during execution in test generation
    try {
      boolean b12 = server0.addException(iP11);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long3 == 1465347898157L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long8 == 1465347898157L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);

  }

  @Test
  public void test152() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test152"); }


    tp2.Server server1 = new tp2.Server(1);
    tp2.IP iP2 = null;
    boolean b3 = server1.removeBan(iP2);
    server1.update();
    tp2.IP iP5 = null;
    boolean b6 = server1.removeBan(iP5);
    java.lang.String str7 = server1.toString();
    long long8 = server1.getLastUpdate();
    server1.update();
    long long10 = server1.getLastUpdate();
    server1.update();
    tp2.IP iP12 = null;
    boolean b13 = server1.removeException(iP12);
    long long14 = server1.getLastUpdate();
    tp2.ITime iTime15 = null;
    server1.setTime(iTime15);
    tp2.IP iP17 = null;
    boolean b18 = server1.removeException(iP17);
    tp2.IP iP19 = null;
    // The following exception was thrown during execution in test generation
    try {
      boolean b20 = server1.addException(iP19);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Server [lastUpdate=250000, exceptions=(), bans={}]"+ "'", str7.equals("Server [lastUpdate=250000, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long8 == 250000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long10 == 250000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long14 == 250000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);

  }

  @Test
  public void test153() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test153"); }


    tp2.Server server1 = new tp2.Server(1);
    tp2.IP iP2 = null;
    boolean b3 = server1.removeBan(iP2);
    tp2.ITime iTime4 = null;
    server1.setTime(iTime4);
    tp2.IP iP6 = null;
    boolean b7 = server1.removeBan(iP6);
    tp2.ITime iTime8 = null;
    server1.setTime(iTime8);
    java.lang.String str10 = server1.toString();
    java.lang.String str11 = server1.toString();
    // The following exception was thrown during execution in test generation
    try {
      server1.update();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Server [lastUpdate=null, exceptions=(), bans={}]"+ "'", str10.equals("Server [lastUpdate=null, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Server [lastUpdate=null, exceptions=(), bans={}]"+ "'", str11.equals("Server [lastUpdate=null, exceptions=(), bans={}]"));

  }

  @Test
  public void test154() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test154"); }


    tp2.Server server1 = new tp2.Server(1);
    tp2.IP iP2 = null;
    boolean b3 = server1.removeBan(iP2);
    server1.update();
    java.lang.String str5 = server1.toString();
    tp2.ITime iTime6 = null;
    server1.setTime(iTime6);
    java.lang.String str8 = server1.toString();
    long long9 = server1.getLastUpdate();
    tp2.IP iP10 = null;
    // The following exception was thrown during execution in test generation
    try {
      boolean b11 = server1.addException(iP10);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Server [lastUpdate=250000, exceptions=(), bans={}]"+ "'", str5.equals("Server [lastUpdate=250000, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Server [lastUpdate=250000, exceptions=(), bans={}]"+ "'", str8.equals("Server [lastUpdate=250000, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long9 == 250000L);

  }

  @Test
  public void test155() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test155"); }


    tp2.Server server1 = new tp2.Server(1);
    tp2.IP iP2 = null;
    boolean b3 = server1.removeBan(iP2);
    tp2.ITime iTime4 = null;
    server1.setTime(iTime4);
    tp2.IP iP6 = null;
    boolean b7 = server1.removeBan(iP6);
    tp2.ITime iTime8 = null;
    server1.setTime(iTime8);
    java.lang.String str10 = server1.toString();
    boolean b11 = server1.repOK();
    tp2.IP iP12 = null;
    boolean b13 = server1.connect(iP12);
    tp2.ITime iTime14 = null;
    server1.setTime(iTime14);
    tp2.IP iP16 = null;
    boolean b17 = server1.removeBan(iP16);
    tp2.IP iP18 = null;
    // The following exception was thrown during execution in test generation
    try {
      boolean b19 = server1.addException(iP18);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Server [lastUpdate=null, exceptions=(), bans={}]"+ "'", str10.equals("Server [lastUpdate=null, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);

  }

  @Test
  public void test156() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test156"); }


    tp2.Server server0 = new tp2.Server();
    server0.update();
    tp2.IP iP2 = null;
    boolean b3 = server0.removeBan(iP2);
    server0.update();
    tp2.ITime iTime5 = null;
    server0.setTime(iTime5);
    tp2.ITime iTime7 = null;
    server0.setTime(iTime7);
    boolean b9 = server0.repOK();
    tp2.IP iP10 = null;
    boolean b11 = server0.removeException(iP10);
    tp2.IP iP12 = null;
    boolean b13 = server0.removeException(iP12);
    tp2.IP iP14 = null;
    boolean b15 = server0.removeException(iP14);
    tp2.IP iP16 = null;
    // The following exception was thrown during execution in test generation
    try {
      boolean b17 = server0.addBan(iP16);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);

  }

  @Test
  public void test157() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test157"); }


    tp2.Server server1 = new tp2.Server(1);
    tp2.IP iP2 = null;
    boolean b3 = server1.removeBan(iP2);
    server1.update();
    tp2.IP iP5 = null;
    boolean b6 = server1.removeBan(iP5);
    tp2.IP iP7 = null;
    boolean b8 = server1.removeException(iP7);
    java.lang.String str9 = server1.toString();
    java.lang.String str10 = server1.toString();
    tp2.ITime iTime11 = null;
    server1.setTime(iTime11);
    boolean b13 = server1.repOK();
    java.lang.String str14 = server1.toString();
    java.lang.String str15 = server1.toString();
    // The following exception was thrown during execution in test generation
    try {
      server1.update();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Server [lastUpdate=250000, exceptions=(), bans={}]"+ "'", str9.equals("Server [lastUpdate=250000, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Server [lastUpdate=250000, exceptions=(), bans={}]"+ "'", str10.equals("Server [lastUpdate=250000, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "Server [lastUpdate=250000, exceptions=(), bans={}]"+ "'", str14.equals("Server [lastUpdate=250000, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "Server [lastUpdate=250000, exceptions=(), bans={}]"+ "'", str15.equals("Server [lastUpdate=250000, exceptions=(), bans={}]"));

  }

  @Test
  public void test158() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test158"); }


    tp2.Server server1 = new tp2.Server(100);
    tp2.ITime iTime2 = null;
    server1.setTime(iTime2);
    tp2.IP iP4 = null;
    boolean b5 = server1.connect(iP4);
    tp2.IP iP6 = null;
    // The following exception was thrown during execution in test generation
    try {
      boolean b7 = server1.addBan(iP6);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);

  }

  @Test
  public void test159() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test159"); }


    tp2.Server server1 = new tp2.Server(1);
    tp2.IP iP2 = null;
    boolean b3 = server1.removeBan(iP2);
    server1.update();
    tp2.IP iP5 = null;
    boolean b6 = server1.removeBan(iP5);
    java.lang.String str7 = server1.toString();
    long long8 = server1.getLastUpdate();
    server1.update();
    tp2.ITime iTime10 = null;
    server1.setTime(iTime10);
    tp2.IP iP12 = null;
    // The following exception was thrown during execution in test generation
    try {
      boolean b13 = server1.addException(iP12);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Server [lastUpdate=250000, exceptions=(), bans={}]"+ "'", str7.equals("Server [lastUpdate=250000, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long8 == 250000L);

  }

  @Test
  public void test160() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test160"); }


    tp2.Server server1 = new tp2.Server(1);
    tp2.IP iP2 = null;
    boolean b3 = server1.removeBan(iP2);
    server1.update();
    tp2.IP iP5 = null;
    boolean b6 = server1.removeBan(iP5);
    tp2.IP iP7 = null;
    boolean b8 = server1.removeBan(iP7);
    tp2.IP iP9 = null;
    boolean b10 = server1.removeException(iP9);
    tp2.IP iP11 = null;
    boolean b12 = server1.removeException(iP11);
    tp2.ITime iTime13 = null;
    server1.setTime(iTime13);
    tp2.IP iP15 = null;
    boolean b16 = server1.removeBan(iP15);
    java.lang.String str17 = server1.toString();
    java.lang.String str18 = server1.toString();
    tp2.IP iP19 = null;
    // The following exception was thrown during execution in test generation
    try {
      boolean b20 = server1.addBan(iP19);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "Server [lastUpdate=250000, exceptions=(), bans={}]"+ "'", str17.equals("Server [lastUpdate=250000, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "Server [lastUpdate=250000, exceptions=(), bans={}]"+ "'", str18.equals("Server [lastUpdate=250000, exceptions=(), bans={}]"));

  }

  @Test
  public void test161() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test161"); }


    tp2.Server server1 = new tp2.Server(1);
    tp2.IP iP2 = null;
    boolean b3 = server1.removeBan(iP2);
    server1.update();
    tp2.IP iP5 = null;
    boolean b6 = server1.removeBan(iP5);
    java.lang.String str7 = server1.toString();
    long long8 = server1.getLastUpdate();
    tp2.ITime iTime9 = null;
    server1.setTime(iTime9);
    tp2.IP iP11 = null;
    boolean b12 = server1.connect(iP11);
    tp2.IP iP13 = null;
    // The following exception was thrown during execution in test generation
    try {
      boolean b14 = server1.addException(iP13);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Server [lastUpdate=250000, exceptions=(), bans={}]"+ "'", str7.equals("Server [lastUpdate=250000, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long8 == 250000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);

  }

  @Test
  public void test162() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test162"); }


    tp2.Server server1 = new tp2.Server(1);
    tp2.IP iP2 = null;
    boolean b3 = server1.removeException(iP2);
    java.lang.String str4 = server1.toString();
    tp2.IP iP5 = null;
    boolean b6 = server1.connect(iP5);
    java.lang.String str7 = server1.toString();
    java.lang.String str8 = server1.toString();
    server1.update();
    boolean b10 = server1.repOK();
    long long11 = server1.getLastUpdate();
    tp2.ITime iTime12 = null;
    server1.setTime(iTime12);
    long long14 = server1.getLastUpdate();
    tp2.IP iP15 = null;
    // The following exception was thrown during execution in test generation
    try {
      boolean b16 = server1.addException(iP15);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Server [lastUpdate=null, exceptions=(), bans={}]"+ "'", str4.equals("Server [lastUpdate=null, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Server [lastUpdate=null, exceptions=(), bans={}]"+ "'", str7.equals("Server [lastUpdate=null, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Server [lastUpdate=null, exceptions=(), bans={}]"+ "'", str8.equals("Server [lastUpdate=null, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long11 == 250000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long14 == 250000L);

  }

  @Test
  public void test163() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test163"); }


    tp2.Server server0 = new tp2.Server();
    boolean b1 = server0.repOK();
    tp2.ITime iTime2 = null;
    server0.setTime(iTime2);
    java.lang.String str4 = server0.toString();
    // The following exception was thrown during execution in test generation
    try {
      server0.update();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Server [lastUpdate=null, exceptions=(), bans={}]"+ "'", str4.equals("Server [lastUpdate=null, exceptions=(), bans={}]"));

  }

  @Test
  public void test164() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test164"); }


    tp2.Server server1 = new tp2.Server(10);
    tp2.ITime iTime2 = null;
    server1.setTime(iTime2);
    tp2.IP iP4 = null;
    boolean b5 = server1.connect(iP4);
    tp2.IP iP6 = null;
    boolean b7 = server1.removeBan(iP6);
    tp2.ITime iTime8 = null;
    server1.setTime(iTime8);
    tp2.ITime iTime10 = null;
    server1.setTime(iTime10);
    tp2.IP iP12 = null;
    // The following exception was thrown during execution in test generation
    try {
      boolean b13 = server1.addException(iP12);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);

  }

  @Test
  public void test165() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test165"); }


    tp2.Server server1 = new tp2.Server(1);
    tp2.IP iP2 = null;
    boolean b3 = server1.removeException(iP2);
    java.lang.String str4 = server1.toString();
    tp2.IP iP5 = null;
    boolean b6 = server1.connect(iP5);
    java.lang.String str7 = server1.toString();
    java.lang.String str8 = server1.toString();
    boolean b9 = server1.repOK();
    tp2.ITime iTime10 = null;
    server1.setTime(iTime10);
    tp2.IP iP12 = null;
    boolean b13 = server1.removeException(iP12);
    boolean b14 = server1.repOK();
    tp2.IP iP15 = null;
    // The following exception was thrown during execution in test generation
    try {
      boolean b16 = server1.addException(iP15);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Server [lastUpdate=null, exceptions=(), bans={}]"+ "'", str4.equals("Server [lastUpdate=null, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Server [lastUpdate=null, exceptions=(), bans={}]"+ "'", str7.equals("Server [lastUpdate=null, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Server [lastUpdate=null, exceptions=(), bans={}]"+ "'", str8.equals("Server [lastUpdate=null, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);

  }

  @Test
  public void test166() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test166"); }


    tp2.Server server1 = new tp2.Server(1);
    tp2.IP iP2 = null;
    boolean b3 = server1.removeBan(iP2);
    server1.update();
    java.lang.String str5 = server1.toString();
    tp2.IP iP6 = null;
    boolean b7 = server1.connect(iP6);
    boolean b8 = server1.repOK();
    long long9 = server1.getLastUpdate();
    long long10 = server1.getLastUpdate();
    tp2.IP iP11 = null;
    boolean b12 = server1.connect(iP11);
    boolean b13 = server1.repOK();
    tp2.IP iP14 = null;
    boolean b15 = server1.connect(iP14);
    tp2.IP iP16 = null;
    boolean b17 = server1.removeException(iP16);
    long long18 = server1.getLastUpdate();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Server [lastUpdate=250000, exceptions=(), bans={}]"+ "'", str5.equals("Server [lastUpdate=250000, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long9 == 250000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long10 == 250000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long18 == 250000L);

  }

  @Test
  public void test167() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test167"); }


    tp2.Server server1 = new tp2.Server(1);
    tp2.IP iP2 = null;
    boolean b3 = server1.removeBan(iP2);
    server1.update();
    tp2.IP iP5 = null;
    boolean b6 = server1.removeBan(iP5);
    tp2.IP iP7 = null;
    boolean b8 = server1.removeException(iP7);
    java.lang.String str9 = server1.toString();
    java.lang.String str10 = server1.toString();
    tp2.ITime iTime11 = null;
    server1.setTime(iTime11);
    boolean b13 = server1.repOK();
    java.lang.String str14 = server1.toString();
    java.lang.String str15 = server1.toString();
    tp2.IP iP16 = null;
    // The following exception was thrown during execution in test generation
    try {
      boolean b17 = server1.addBan(iP16);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Server [lastUpdate=250000, exceptions=(), bans={}]"+ "'", str9.equals("Server [lastUpdate=250000, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Server [lastUpdate=250000, exceptions=(), bans={}]"+ "'", str10.equals("Server [lastUpdate=250000, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "Server [lastUpdate=250000, exceptions=(), bans={}]"+ "'", str14.equals("Server [lastUpdate=250000, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "Server [lastUpdate=250000, exceptions=(), bans={}]"+ "'", str15.equals("Server [lastUpdate=250000, exceptions=(), bans={}]"));

  }

  @Test
  public void test168() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test168"); }


    tp2.Server server1 = new tp2.Server(1);
    tp2.IP iP2 = null;
    boolean b3 = server1.removeBan(iP2);
    server1.update();
    tp2.IP iP5 = null;
    boolean b6 = server1.removeBan(iP5);
    tp2.IP iP7 = null;
    boolean b8 = server1.removeBan(iP7);
    tp2.IP iP9 = null;
    boolean b10 = server1.removeException(iP9);
    tp2.IP iP11 = null;
    boolean b12 = server1.removeException(iP11);
    tp2.IP iP13 = null;
    boolean b14 = server1.removeBan(iP13);
    server1.update();
    tp2.IP iP16 = null;
    boolean b17 = server1.addBan(iP16);
    tp2.IP iP18 = null;
    // The following exception was thrown during execution in test generation
    try {
      boolean b19 = server1.addException(iP18);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);

  }

  @Test
  public void test169() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test169"); }


    tp2.Server server1 = new tp2.Server(1);
    tp2.IP iP2 = null;
    boolean b3 = server1.removeBan(iP2);
    tp2.ITime iTime4 = null;
    server1.setTime(iTime4);
    tp2.IP iP6 = null;
    boolean b7 = server1.removeBan(iP6);
    tp2.ITime iTime8 = null;
    server1.setTime(iTime8);
    tp2.ITime iTime10 = null;
    server1.setTime(iTime10);
    tp2.ITime iTime12 = null;
    server1.setTime(iTime12);
    java.lang.String str14 = server1.toString();
    tp2.IP iP15 = null;
    // The following exception was thrown during execution in test generation
    try {
      boolean b16 = server1.addBan(iP15);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "Server [lastUpdate=null, exceptions=(), bans={}]"+ "'", str14.equals("Server [lastUpdate=null, exceptions=(), bans={}]"));

  }

  @Test
  public void test170() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test170"); }


    tp2.Server server1 = new tp2.Server(1);
    tp2.IP iP2 = null;
    boolean b3 = server1.removeException(iP2);
    java.lang.String str4 = server1.toString();
    tp2.IP iP5 = null;
    boolean b6 = server1.connect(iP5);
    java.lang.String str7 = server1.toString();
    java.lang.String str8 = server1.toString();
    java.lang.String str9 = server1.toString();
    java.lang.String str10 = server1.toString();
    tp2.IP iP11 = null;
    boolean b12 = server1.removeBan(iP11);
    server1.update();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Server [lastUpdate=null, exceptions=(), bans={}]"+ "'", str4.equals("Server [lastUpdate=null, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Server [lastUpdate=null, exceptions=(), bans={}]"+ "'", str7.equals("Server [lastUpdate=null, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Server [lastUpdate=null, exceptions=(), bans={}]"+ "'", str8.equals("Server [lastUpdate=null, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Server [lastUpdate=null, exceptions=(), bans={}]"+ "'", str9.equals("Server [lastUpdate=null, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Server [lastUpdate=null, exceptions=(), bans={}]"+ "'", str10.equals("Server [lastUpdate=null, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);

  }

  @Test
  public void test171() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test171"); }


    tp2.Server server0 = new tp2.Server();
    server0.update();
    boolean b2 = server0.repOK();
    long long3 = server0.getLastUpdate();
    tp2.IP iP4 = null;
    boolean b5 = server0.removeBan(iP4);
    tp2.IP iP6 = null;
    boolean b7 = server0.addBan(iP6);
    tp2.IP iP8 = null;
    boolean b9 = server0.removeException(iP8);
    java.lang.String str10 = server0.toString();
    tp2.IP iP11 = null;
    // The following exception was thrown during execution in test generation
    try {
      boolean b12 = server0.connect(iP11);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long3 == 1465347898192L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Server [lastUpdate=1465347898192, exceptions=(), bans={[IPBan [ip=null, expires=1465347958193]]}]"+ "'", str10.equals("Server [lastUpdate=1465347898192, exceptions=(), bans={[IPBan [ip=null, expires=1465347958193]]}]"));

  }

  @Test
  public void test172() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test172"); }


    tp2.Server server1 = new tp2.Server(1);
    tp2.IP iP2 = null;
    boolean b3 = server1.removeException(iP2);
    java.lang.String str4 = server1.toString();
    tp2.IP iP5 = null;
    boolean b6 = server1.connect(iP5);
    java.lang.String str7 = server1.toString();
    java.lang.String str8 = server1.toString();
    tp2.IP iP9 = null;
    // The following exception was thrown during execution in test generation
    try {
      boolean b10 = server1.addException(iP9);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Server [lastUpdate=null, exceptions=(), bans={}]"+ "'", str4.equals("Server [lastUpdate=null, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Server [lastUpdate=null, exceptions=(), bans={}]"+ "'", str7.equals("Server [lastUpdate=null, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Server [lastUpdate=null, exceptions=(), bans={}]"+ "'", str8.equals("Server [lastUpdate=null, exceptions=(), bans={}]"));

  }

  @Test
  public void test173() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test173"); }


    tp2.Server server0 = new tp2.Server();
    server0.update();
    tp2.IP iP2 = null;
    boolean b3 = server0.removeBan(iP2);
    server0.update();
    java.lang.String str5 = server0.toString();
    tp2.IP iP6 = null;
    boolean b7 = server0.removeException(iP6);
    boolean b8 = server0.repOK();
    tp2.IP iP9 = null;
    boolean b10 = server0.addBan(iP9);
    server0.update();
    tp2.ITime iTime12 = null;
    server0.setTime(iTime12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Server [lastUpdate=1465347898198, exceptions=(), bans={}]"+ "'", str5.equals("Server [lastUpdate=1465347898198, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);

  }

  @Test
  public void test174() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test174"); }


    tp2.Server server0 = new tp2.Server();
    server0.update();
    server0.update();
    tp2.ITime iTime3 = null;
    server0.setTime(iTime3);
    boolean b5 = server0.repOK();
    tp2.IP iP6 = null;
    boolean b7 = server0.removeBan(iP6);
    tp2.IP iP8 = null;
    // The following exception was thrown during execution in test generation
    try {
      boolean b9 = server0.addException(iP8);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);

  }

  @Test
  public void test175() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test175"); }


    tp2.Server server1 = new tp2.Server(1);
    tp2.IP iP2 = null;
    boolean b3 = server1.removeBan(iP2);
    tp2.ITime iTime4 = null;
    server1.setTime(iTime4);
    tp2.IP iP6 = null;
    boolean b7 = server1.removeBan(iP6);
    tp2.IP iP8 = null;
    boolean b9 = server1.connect(iP8);
    boolean b10 = server1.repOK();
    tp2.IP iP11 = null;
    boolean b12 = server1.removeException(iP11);
    java.lang.String str13 = server1.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Server [lastUpdate=null, exceptions=(), bans={}]"+ "'", str13.equals("Server [lastUpdate=null, exceptions=(), bans={}]"));

  }

  @Test
  public void test176() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test176"); }


    tp2.Server server1 = new tp2.Server(1);
    tp2.IP iP2 = null;
    boolean b3 = server1.removeBan(iP2);
    server1.update();
    long long5 = server1.getLastUpdate();
    tp2.IP iP6 = null;
    boolean b7 = server1.removeException(iP6);
    long long8 = server1.getLastUpdate();
    tp2.IP iP9 = null;
    boolean b10 = server1.removeBan(iP9);
    tp2.IP iP11 = null;
    boolean b12 = server1.addBan(iP11);
    tp2.IP iP13 = null;
    // The following exception was thrown during execution in test generation
    try {
      boolean b14 = server1.connect(iP13);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long5 == 250000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long8 == 250000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);

  }

  @Test
  public void test177() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test177"); }


    tp2.Server server1 = new tp2.Server(1);
    tp2.IP iP2 = null;
    boolean b3 = server1.removeBan(iP2);
    server1.update();
    tp2.IP iP5 = null;
    boolean b6 = server1.removeBan(iP5);
    java.lang.String str7 = server1.toString();
    java.lang.String str8 = server1.toString();
    tp2.IP iP9 = null;
    boolean b10 = server1.removeBan(iP9);
    tp2.IP iP11 = null;
    boolean b12 = server1.removeException(iP11);
    boolean b13 = server1.repOK();
    tp2.IP iP14 = null;
    boolean b15 = server1.addBan(iP14);
    tp2.IP iP16 = null;
    // The following exception was thrown during execution in test generation
    try {
      boolean b17 = server1.connect(iP16);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Server [lastUpdate=250000, exceptions=(), bans={}]"+ "'", str7.equals("Server [lastUpdate=250000, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Server [lastUpdate=250000, exceptions=(), bans={}]"+ "'", str8.equals("Server [lastUpdate=250000, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);

  }

  @Test
  public void test178() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test178"); }


    tp2.Server server0 = new tp2.Server();
    java.lang.String str1 = server0.toString();
    tp2.IP iP2 = null;
    boolean b3 = server0.removeException(iP2);
    tp2.IP iP4 = null;
    boolean b5 = server0.addBan(iP4);
    java.lang.String str6 = server0.toString();
    tp2.IP iP7 = null;
    // The following exception was thrown during execution in test generation
    try {
      boolean b8 = server0.addBan(iP7);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Server [lastUpdate=null, exceptions=(), bans={}]"+ "'", str1.equals("Server [lastUpdate=null, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Server [lastUpdate=null, exceptions=(), bans={[IPBan [ip=null, expires=1465347958207]]}]"+ "'", str6.equals("Server [lastUpdate=null, exceptions=(), bans={[IPBan [ip=null, expires=1465347958207]]}]"));

  }

  @Test
  public void test179() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test179"); }


    tp2.Server server1 = new tp2.Server(1);
    tp2.IP iP2 = null;
    boolean b3 = server1.removeBan(iP2);
    server1.update();
    tp2.IP iP5 = null;
    boolean b6 = server1.removeBan(iP5);
    tp2.IP iP7 = null;
    boolean b8 = server1.addBan(iP7);
    server1.update();
    tp2.ITime iTime10 = null;
    server1.setTime(iTime10);
    tp2.IP iP12 = null;
    // The following exception was thrown during execution in test generation
    try {
      boolean b13 = server1.addBan(iP12);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);

  }

  @Test
  public void test180() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test180"); }


    tp2.Server server1 = new tp2.Server(1);
    tp2.IP iP2 = null;
    boolean b3 = server1.removeException(iP2);
    java.lang.String str4 = server1.toString();
    tp2.IP iP5 = null;
    boolean b6 = server1.connect(iP5);
    java.lang.String str7 = server1.toString();
    java.lang.String str8 = server1.toString();
    java.lang.String str9 = server1.toString();
    java.lang.String str10 = server1.toString();
    tp2.IP iP11 = null;
    boolean b12 = server1.connect(iP11);
    tp2.IP iP13 = null;
    boolean b14 = server1.connect(iP13);
    tp2.IP iP15 = null;
    boolean b16 = server1.removeException(iP15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Server [lastUpdate=null, exceptions=(), bans={}]"+ "'", str4.equals("Server [lastUpdate=null, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Server [lastUpdate=null, exceptions=(), bans={}]"+ "'", str7.equals("Server [lastUpdate=null, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Server [lastUpdate=null, exceptions=(), bans={}]"+ "'", str8.equals("Server [lastUpdate=null, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Server [lastUpdate=null, exceptions=(), bans={}]"+ "'", str9.equals("Server [lastUpdate=null, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Server [lastUpdate=null, exceptions=(), bans={}]"+ "'", str10.equals("Server [lastUpdate=null, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);

  }

  @Test
  public void test181() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test181"); }


    tp2.Server server1 = new tp2.Server(0);
    server1.update();
    tp2.ITime iTime3 = null;
    server1.setTime(iTime3);
    tp2.ITime iTime5 = null;
    server1.setTime(iTime5);
    tp2.IP iP7 = null;
    boolean b8 = server1.removeBan(iP7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);

  }

  @Test
  public void test182() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test182"); }


    tp2.Server server1 = new tp2.Server(1);
    tp2.IP iP2 = null;
    boolean b3 = server1.removeBan(iP2);
    server1.update();
    long long5 = server1.getLastUpdate();
    java.lang.String str6 = server1.toString();
    tp2.IP iP7 = null;
    boolean b8 = server1.addBan(iP7);
    tp2.IP iP9 = null;
    // The following exception was thrown during execution in test generation
    try {
      boolean b10 = server1.connect(iP9);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long5 == 250000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Server [lastUpdate=250000, exceptions=(), bans={}]"+ "'", str6.equals("Server [lastUpdate=250000, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);

  }

  @Test
  public void test183() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test183"); }


    tp2.Server server1 = new tp2.Server(1);
    tp2.IP iP2 = null;
    boolean b3 = server1.removeException(iP2);
    tp2.IP iP4 = null;
    boolean b5 = server1.removeBan(iP4);
    tp2.IP iP6 = null;
    boolean b7 = server1.removeException(iP6);
    tp2.IP iP8 = null;
    boolean b9 = server1.removeBan(iP8);
    java.lang.String str10 = server1.toString();
    // The following exception was thrown during execution in test generation
    try {
      long long11 = server1.getLastUpdate();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Server [lastUpdate=null, exceptions=(), bans={}]"+ "'", str10.equals("Server [lastUpdate=null, exceptions=(), bans={}]"));

  }

  @Test
  public void test184() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test184"); }


    tp2.Server server1 = new tp2.Server(1);
    tp2.IP iP2 = null;
    boolean b3 = server1.removeBan(iP2);
    tp2.ITime iTime4 = null;
    server1.setTime(iTime4);
    tp2.IP iP6 = null;
    boolean b7 = server1.removeBan(iP6);
    tp2.ITime iTime8 = null;
    server1.setTime(iTime8);
    java.lang.String str10 = server1.toString();
    boolean b11 = server1.repOK();
    tp2.IP iP12 = null;
    boolean b13 = server1.connect(iP12);
    boolean b14 = server1.repOK();
    tp2.ITime iTime15 = null;
    server1.setTime(iTime15);
    tp2.ITime iTime17 = null;
    server1.setTime(iTime17);
    java.lang.String str19 = server1.toString();
    tp2.IP iP20 = null;
    boolean b21 = server1.removeBan(iP20);
    tp2.IP iP22 = null;
    boolean b23 = server1.connect(iP22);
    tp2.IP iP24 = null;
    boolean b25 = server1.connect(iP24);
    tp2.ITime iTime26 = null;
    server1.setTime(iTime26);
    boolean b28 = server1.repOK();
    tp2.IP iP29 = null;
    // The following exception was thrown during execution in test generation
    try {
      boolean b30 = server1.addBan(iP29);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Server [lastUpdate=null, exceptions=(), bans={}]"+ "'", str10.equals("Server [lastUpdate=null, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "Server [lastUpdate=null, exceptions=(), bans={}]"+ "'", str19.equals("Server [lastUpdate=null, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == true);

  }

  @Test
  public void test185() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test185"); }


    tp2.Server server1 = new tp2.Server(1);
    tp2.IP iP2 = null;
    boolean b3 = server1.removeBan(iP2);
    server1.update();
    tp2.IP iP5 = null;
    boolean b6 = server1.removeBan(iP5);
    tp2.IP iP7 = null;
    boolean b8 = server1.removeBan(iP7);
    tp2.IP iP9 = null;
    boolean b10 = server1.removeBan(iP9);
    tp2.IP iP11 = null;
    boolean b12 = server1.removeException(iP11);
    tp2.ITime iTime13 = null;
    server1.setTime(iTime13);
    tp2.IP iP15 = null;
    // The following exception was thrown during execution in test generation
    try {
      boolean b16 = server1.addException(iP15);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);

  }

  @Test
  public void test186() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test186"); }


    tp2.Server server1 = new tp2.Server(1);
    tp2.IP iP2 = null;
    boolean b3 = server1.removeBan(iP2);
    server1.update();
    tp2.IP iP5 = null;
    boolean b6 = server1.removeBan(iP5);
    tp2.IP iP7 = null;
    boolean b8 = server1.removeBan(iP7);
    tp2.IP iP9 = null;
    boolean b10 = server1.removeException(iP9);
    boolean b11 = server1.repOK();
    tp2.IP iP12 = null;
    boolean b13 = server1.removeBan(iP12);
    tp2.ITime iTime14 = null;
    server1.setTime(iTime14);
    tp2.IP iP16 = null;
    boolean b17 = server1.removeBan(iP16);
    tp2.ITime iTime18 = null;
    server1.setTime(iTime18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);

  }

  @Test
  public void test187() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test187"); }


    tp2.Server server1 = new tp2.Server(1);
    tp2.IP iP2 = null;
    boolean b3 = server1.removeException(iP2);
    java.lang.String str4 = server1.toString();
    tp2.IP iP5 = null;
    boolean b6 = server1.connect(iP5);
    java.lang.String str7 = server1.toString();
    java.lang.String str8 = server1.toString();
    boolean b9 = server1.repOK();
    tp2.IP iP10 = null;
    boolean b11 = server1.removeException(iP10);
    boolean b12 = server1.repOK();
    java.lang.String str13 = server1.toString();
    // The following exception was thrown during execution in test generation
    try {
      long long14 = server1.getLastUpdate();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Server [lastUpdate=null, exceptions=(), bans={}]"+ "'", str4.equals("Server [lastUpdate=null, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Server [lastUpdate=null, exceptions=(), bans={}]"+ "'", str7.equals("Server [lastUpdate=null, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Server [lastUpdate=null, exceptions=(), bans={}]"+ "'", str8.equals("Server [lastUpdate=null, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Server [lastUpdate=null, exceptions=(), bans={}]"+ "'", str13.equals("Server [lastUpdate=null, exceptions=(), bans={}]"));

  }

  @Test
  public void test188() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test188"); }


    tp2.Server server1 = new tp2.Server(1);
    tp2.IP iP2 = null;
    boolean b3 = server1.removeBan(iP2);
    tp2.ITime iTime4 = null;
    server1.setTime(iTime4);
    tp2.IP iP6 = null;
    boolean b7 = server1.removeBan(iP6);
    tp2.ITime iTime8 = null;
    server1.setTime(iTime8);
    tp2.ITime iTime10 = null;
    server1.setTime(iTime10);
    tp2.ITime iTime12 = null;
    server1.setTime(iTime12);
    tp2.IP iP14 = null;
    boolean b15 = server1.removeBan(iP14);
    tp2.IP iP16 = null;
    boolean b17 = server1.connect(iP16);
    tp2.IP iP18 = null;
    boolean b19 = server1.connect(iP18);
    boolean b20 = server1.repOK();
    tp2.IP iP21 = null;
    boolean b22 = server1.connect(iP21);
    // The following exception was thrown during execution in test generation
    try {
      long long23 = server1.getLastUpdate();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);

  }

  @Test
  public void test189() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test189"); }


    tp2.Server server1 = new tp2.Server(1);
    tp2.IP iP2 = null;
    boolean b3 = server1.removeBan(iP2);
    server1.update();
    java.lang.String str5 = server1.toString();
    long long6 = server1.getLastUpdate();
    java.lang.String str7 = server1.toString();
    tp2.IP iP8 = null;
    boolean b9 = server1.addBan(iP8);
    tp2.IP iP10 = null;
    // The following exception was thrown during execution in test generation
    try {
      boolean b11 = server1.addBan(iP10);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Server [lastUpdate=250000, exceptions=(), bans={}]"+ "'", str5.equals("Server [lastUpdate=250000, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long6 == 250000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Server [lastUpdate=250000, exceptions=(), bans={}]"+ "'", str7.equals("Server [lastUpdate=250000, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);

  }

  @Test
  public void test190() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test190"); }


    tp2.Server server0 = new tp2.Server();
    server0.update();
    tp2.IP iP2 = null;
    boolean b3 = server0.removeBan(iP2);
    server0.update();
    java.lang.String str5 = server0.toString();
    long long6 = server0.getLastUpdate();
    long long7 = server0.getLastUpdate();
    java.lang.String str8 = server0.toString();
    tp2.IP iP9 = null;
    boolean b10 = server0.addBan(iP9);
    tp2.IP iP11 = null;
    boolean b12 = server0.removeException(iP11);
    tp2.IP iP13 = null;
    // The following exception was thrown during execution in test generation
    try {
      boolean b14 = server0.addException(iP13);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Server [lastUpdate=1465347898236, exceptions=(), bans={}]"+ "'", str5.equals("Server [lastUpdate=1465347898236, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long6 == 1465347898236L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long7 == 1465347898236L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Server [lastUpdate=1465347898236, exceptions=(), bans={}]"+ "'", str8.equals("Server [lastUpdate=1465347898236, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);

  }

  @Test
  public void test191() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test191"); }


    tp2.Server server1 = new tp2.Server(1);
    tp2.IP iP2 = null;
    boolean b3 = server1.removeBan(iP2);
    tp2.ITime iTime4 = null;
    server1.setTime(iTime4);
    tp2.IP iP6 = null;
    boolean b7 = server1.removeBan(iP6);
    tp2.IP iP8 = null;
    boolean b9 = server1.connect(iP8);
    boolean b10 = server1.repOK();
    tp2.IP iP11 = null;
    boolean b12 = server1.removeException(iP11);
    tp2.IP iP13 = null;
    // The following exception was thrown during execution in test generation
    try {
      boolean b14 = server1.addException(iP13);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);

  }

  @Test
  public void test192() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test192"); }


    tp2.Server server1 = new tp2.Server(1);
    tp2.IP iP2 = null;
    boolean b3 = server1.addBan(iP2);
    server1.update();
    tp2.ITime iTime5 = null;
    server1.setTime(iTime5);
    tp2.ITime iTime7 = null;
    server1.setTime(iTime7);
    // The following exception was thrown during execution in test generation
    try {
      server1.update();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);

  }

  @Test
  public void test193() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test193"); }


    tp2.Server server0 = new tp2.Server();
    tp2.IP iP1 = null;
    boolean b2 = server0.removeException(iP1);
    server0.update();
    boolean b4 = server0.repOK();
    java.lang.String str5 = server0.toString();
    tp2.IP iP6 = null;
    boolean b7 = server0.addBan(iP6);
    tp2.IP iP8 = null;
    // The following exception was thrown during execution in test generation
    try {
      boolean b9 = server0.addException(iP8);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Server [lastUpdate=1465347898242, exceptions=(), bans={}]"+ "'", str5.equals("Server [lastUpdate=1465347898242, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);

  }

  @Test
  public void test194() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test194"); }


    tp2.Server server1 = new tp2.Server((-1));
    server1.update();
    server1.update();
    tp2.IP iP4 = null;
    boolean b5 = server1.removeBan(iP4);
    long long6 = server1.getLastUpdate();
    tp2.ITime iTime7 = null;
    server1.setTime(iTime7);
    boolean b9 = server1.repOK();
    tp2.IP iP10 = null;
    boolean b11 = server1.removeException(iP10);
    tp2.IP iP12 = null;
    boolean b13 = server1.connect(iP12);
    tp2.IP iP14 = null;
    boolean b15 = server1.removeException(iP14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long6 == 250000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);

  }

  @Test
  public void test195() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test195"); }


    tp2.Server server1 = new tp2.Server(1);
    tp2.IP iP2 = null;
    boolean b3 = server1.removeBan(iP2);
    server1.update();
    java.lang.String str5 = server1.toString();
    tp2.IP iP6 = null;
    boolean b7 = server1.removeBan(iP6);
    java.lang.String str8 = server1.toString();
    tp2.IP iP9 = null;
    boolean b10 = server1.removeException(iP9);
    boolean b11 = server1.repOK();
    tp2.ITime iTime12 = null;
    server1.setTime(iTime12);
    tp2.IP iP14 = null;
    boolean b15 = server1.connect(iP14);
    tp2.IP iP16 = null;
    boolean b17 = server1.removeException(iP16);
    boolean b18 = server1.repOK();
    tp2.IP iP19 = null;
    boolean b20 = server1.connect(iP19);
    tp2.IP iP21 = null;
    boolean b22 = server1.removeException(iP21);
    tp2.IP iP23 = null;
    // The following exception was thrown during execution in test generation
    try {
      boolean b24 = server1.addBan(iP23);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Server [lastUpdate=250000, exceptions=(), bans={}]"+ "'", str5.equals("Server [lastUpdate=250000, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Server [lastUpdate=250000, exceptions=(), bans={}]"+ "'", str8.equals("Server [lastUpdate=250000, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);

  }

  @Test
  public void test196() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test196"); }


    tp2.Server server1 = new tp2.Server(1);
    tp2.IP iP2 = null;
    boolean b3 = server1.removeBan(iP2);
    server1.update();
    java.lang.String str5 = server1.toString();
    tp2.IP iP6 = null;
    boolean b7 = server1.removeBan(iP6);
    tp2.IP iP8 = null;
    boolean b9 = server1.removeBan(iP8);
    tp2.IP iP10 = null;
    boolean b11 = server1.addBan(iP10);
    tp2.ITime iTime12 = null;
    server1.setTime(iTime12);
    long long14 = server1.getLastUpdate();
    long long15 = server1.getLastUpdate();
    // The following exception was thrown during execution in test generation
    try {
      server1.update();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Server [lastUpdate=250000, exceptions=(), bans={}]"+ "'", str5.equals("Server [lastUpdate=250000, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long14 == 250000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long15 == 250000L);

  }

  @Test
  public void test197() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test197"); }


    tp2.Server server1 = new tp2.Server(100);
    tp2.IP iP2 = null;
    boolean b3 = server1.connect(iP2);
    boolean b4 = server1.repOK();
    java.lang.String str5 = server1.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Server [lastUpdate=null, exceptions=(), bans={}]"+ "'", str5.equals("Server [lastUpdate=null, exceptions=(), bans={}]"));

  }

  @Test
  public void test198() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test198"); }


    tp2.Server server1 = new tp2.Server(1);
    tp2.IP iP2 = null;
    boolean b3 = server1.removeBan(iP2);
    server1.update();
    java.lang.String str5 = server1.toString();
    tp2.IP iP6 = null;
    boolean b7 = server1.removeBan(iP6);
    tp2.IP iP8 = null;
    boolean b9 = server1.removeBan(iP8);
    tp2.ITime iTime10 = null;
    server1.setTime(iTime10);
    tp2.IP iP12 = null;
    boolean b13 = server1.removeBan(iP12);
    tp2.IP iP14 = null;
    boolean b15 = server1.removeException(iP14);
    java.lang.String str16 = server1.toString();
    java.lang.String str17 = server1.toString();
    tp2.IP iP18 = null;
    // The following exception was thrown during execution in test generation
    try {
      boolean b19 = server1.addBan(iP18);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Server [lastUpdate=250000, exceptions=(), bans={}]"+ "'", str5.equals("Server [lastUpdate=250000, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "Server [lastUpdate=250000, exceptions=(), bans={}]"+ "'", str16.equals("Server [lastUpdate=250000, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "Server [lastUpdate=250000, exceptions=(), bans={}]"+ "'", str17.equals("Server [lastUpdate=250000, exceptions=(), bans={}]"));

  }

  @Test
  public void test199() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test199"); }


    tp2.Server server1 = new tp2.Server(0);
    tp2.IP iP2 = null;
    boolean b3 = server1.removeException(iP2);
    server1.update();
    server1.update();
    tp2.ITime iTime6 = null;
    server1.setTime(iTime6);
    tp2.IP iP8 = null;
    // The following exception was thrown during execution in test generation
    try {
      boolean b9 = server1.addException(iP8);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);

  }

  @Test
  public void test200() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test200"); }


    tp2.Server server0 = new tp2.Server();
    server0.update();
    tp2.IP iP2 = null;
    boolean b3 = server0.removeBan(iP2);
    tp2.ITime iTime4 = null;
    server0.setTime(iTime4);
    long long6 = server0.getLastUpdate();
    tp2.ITime iTime7 = null;
    server0.setTime(iTime7);
    tp2.IP iP9 = null;
    // The following exception was thrown during execution in test generation
    try {
      boolean b10 = server0.addBan(iP9);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long6 == 1465347898252L);

  }

  @Test
  public void test201() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test201"); }


    tp2.Server server1 = new tp2.Server(1);
    tp2.IP iP2 = null;
    boolean b3 = server1.removeBan(iP2);
    server1.update();
    tp2.IP iP5 = null;
    boolean b6 = server1.removeBan(iP5);
    tp2.IP iP7 = null;
    boolean b8 = server1.connect(iP7);
    server1.update();
    tp2.IP iP10 = null;
    boolean b11 = server1.removeException(iP10);
    tp2.IP iP12 = null;
    // The following exception was thrown during execution in test generation
    try {
      boolean b13 = server1.addException(iP12);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);

  }

  @Test
  public void test202() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test202"); }


    tp2.Server server1 = new tp2.Server(1);
    tp2.IP iP2 = null;
    boolean b3 = server1.removeBan(iP2);
    server1.update();
    tp2.IP iP5 = null;
    boolean b6 = server1.removeBan(iP5);
    tp2.IP iP7 = null;
    boolean b8 = server1.removeException(iP7);
    server1.update();
    tp2.IP iP10 = null;
    boolean b11 = server1.addBan(iP10);
    long long12 = server1.getLastUpdate();
    boolean b13 = server1.repOK();
    long long14 = server1.getLastUpdate();
    tp2.ITime iTime15 = null;
    server1.setTime(iTime15);
    tp2.IP iP17 = null;
    // The following exception was thrown during execution in test generation
    try {
      boolean b18 = server1.connect(iP17);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long12 == 250000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long14 == 250000L);

  }

  @Test
  public void test203() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test203"); }


    tp2.Server server1 = new tp2.Server(1);
    tp2.IP iP2 = null;
    boolean b3 = server1.removeBan(iP2);
    tp2.ITime iTime4 = null;
    server1.setTime(iTime4);
    tp2.IP iP6 = null;
    boolean b7 = server1.removeBan(iP6);
    tp2.ITime iTime8 = null;
    server1.setTime(iTime8);
    tp2.IP iP10 = null;
    boolean b11 = server1.removeBan(iP10);
    // The following exception was thrown during execution in test generation
    try {
      long long12 = server1.getLastUpdate();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);

  }

  @Test
  public void test204() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test204"); }


    tp2.Server server1 = new tp2.Server(1);
    tp2.IP iP2 = null;
    boolean b3 = server1.removeBan(iP2);
    server1.update();
    tp2.IP iP5 = null;
    boolean b6 = server1.removeBan(iP5);
    tp2.IP iP7 = null;
    boolean b8 = server1.removeException(iP7);
    java.lang.String str9 = server1.toString();
    java.lang.String str10 = server1.toString();
    tp2.ITime iTime11 = null;
    server1.setTime(iTime11);
    boolean b13 = server1.repOK();
    java.lang.String str14 = server1.toString();
    java.lang.String str15 = server1.toString();
    tp2.IP iP16 = null;
    // The following exception was thrown during execution in test generation
    try {
      boolean b17 = server1.addException(iP16);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Server [lastUpdate=250000, exceptions=(), bans={}]"+ "'", str9.equals("Server [lastUpdate=250000, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Server [lastUpdate=250000, exceptions=(), bans={}]"+ "'", str10.equals("Server [lastUpdate=250000, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "Server [lastUpdate=250000, exceptions=(), bans={}]"+ "'", str14.equals("Server [lastUpdate=250000, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "Server [lastUpdate=250000, exceptions=(), bans={}]"+ "'", str15.equals("Server [lastUpdate=250000, exceptions=(), bans={}]"));

  }

  @Test
  public void test205() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test205"); }


    tp2.Server server1 = new tp2.Server(1);
    tp2.IP iP2 = null;
    boolean b3 = server1.removeBan(iP2);
    server1.update();
    tp2.IP iP5 = null;
    boolean b6 = server1.removeBan(iP5);
    tp2.IP iP7 = null;
    boolean b8 = server1.removeBan(iP7);
    java.lang.String str9 = server1.toString();
    boolean b10 = server1.repOK();
    tp2.IP iP11 = null;
    boolean b12 = server1.connect(iP11);
    tp2.IP iP13 = null;
    boolean b14 = server1.removeException(iP13);
    long long15 = server1.getLastUpdate();
    tp2.IP iP16 = null;
    boolean b17 = server1.removeException(iP16);
    long long18 = server1.getLastUpdate();
    tp2.IP iP19 = null;
    boolean b20 = server1.addBan(iP19);
    tp2.IP iP21 = null;
    // The following exception was thrown during execution in test generation
    try {
      boolean b22 = server1.addException(iP21);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Server [lastUpdate=250000, exceptions=(), bans={}]"+ "'", str9.equals("Server [lastUpdate=250000, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long15 == 250000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long18 == 250000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);

  }

  @Test
  public void test206() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test206"); }


    tp2.Server server1 = new tp2.Server(1);
    tp2.IP iP2 = null;
    boolean b3 = server1.removeBan(iP2);
    server1.update();
    tp2.IP iP5 = null;
    boolean b6 = server1.removeBan(iP5);
    java.lang.String str7 = server1.toString();
    long long8 = server1.getLastUpdate();
    server1.update();
    long long10 = server1.getLastUpdate();
    server1.update();
    tp2.IP iP12 = null;
    boolean b13 = server1.removeException(iP12);
    tp2.ITime iTime14 = null;
    server1.setTime(iTime14);
    java.lang.String str16 = server1.toString();
    tp2.IP iP17 = null;
    // The following exception was thrown during execution in test generation
    try {
      boolean b18 = server1.addBan(iP17);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Server [lastUpdate=250000, exceptions=(), bans={}]"+ "'", str7.equals("Server [lastUpdate=250000, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long8 == 250000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long10 == 250000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "Server [lastUpdate=250000, exceptions=(), bans={}]"+ "'", str16.equals("Server [lastUpdate=250000, exceptions=(), bans={}]"));

  }

  @Test
  public void test207() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test207"); }


    tp2.Server server0 = new tp2.Server();
    server0.update();
    tp2.IP iP2 = null;
    boolean b3 = server0.removeBan(iP2);
    server0.update();
    java.lang.String str5 = server0.toString();
    tp2.IP iP6 = null;
    boolean b7 = server0.removeException(iP6);
    boolean b8 = server0.repOK();
    tp2.IP iP9 = null;
    boolean b10 = server0.addBan(iP9);
    boolean b11 = server0.repOK();
    tp2.IP iP12 = null;
    boolean b13 = server0.removeException(iP12);
    tp2.IP iP14 = null;
    // The following exception was thrown during execution in test generation
    try {
      boolean b15 = server0.removeBan(iP14);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Server [lastUpdate=1465347898265, exceptions=(), bans={}]"+ "'", str5.equals("Server [lastUpdate=1465347898265, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);

  }

  @Test
  public void test208() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test208"); }


    tp2.Server server0 = new tp2.Server();
    server0.update();
    tp2.IP iP2 = null;
    boolean b3 = server0.removeBan(iP2);
    server0.update();
    tp2.IP iP5 = null;
    boolean b6 = server0.addBan(iP5);
    long long7 = server0.getLastUpdate();
    long long8 = server0.getLastUpdate();
    tp2.IP iP9 = null;
    // The following exception was thrown during execution in test generation
    try {
      boolean b10 = server0.removeBan(iP9);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long7 == 1465347898266L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long8 == 1465347898266L);

  }

  @Test
  public void test209() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test209"); }


    tp2.Server server1 = new tp2.Server(1);
    tp2.IP iP2 = null;
    boolean b3 = server1.removeBan(iP2);
    server1.update();
    tp2.IP iP5 = null;
    boolean b6 = server1.removeBan(iP5);
    long long7 = server1.getLastUpdate();
    java.lang.String str8 = server1.toString();
    tp2.IP iP9 = null;
    boolean b10 = server1.removeException(iP9);
    tp2.ITime iTime11 = null;
    server1.setTime(iTime11);
    tp2.IP iP13 = null;
    boolean b14 = server1.removeBan(iP13);
    tp2.IP iP15 = null;
    // The following exception was thrown during execution in test generation
    try {
      boolean b16 = server1.addException(iP15);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long7 == 250000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Server [lastUpdate=250000, exceptions=(), bans={}]"+ "'", str8.equals("Server [lastUpdate=250000, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);

  }

  @Test
  public void test210() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test210"); }


    tp2.Server server1 = new tp2.Server(1);
    tp2.IP iP2 = null;
    boolean b3 = server1.removeBan(iP2);
    server1.update();
    java.lang.String str5 = server1.toString();
    tp2.IP iP6 = null;
    boolean b7 = server1.removeBan(iP6);
    java.lang.String str8 = server1.toString();
    tp2.IP iP9 = null;
    boolean b10 = server1.removeException(iP9);
    boolean b11 = server1.repOK();
    boolean b12 = server1.repOK();
    tp2.IP iP13 = null;
    boolean b14 = server1.connect(iP13);
    tp2.IP iP15 = null;
    boolean b16 = server1.removeBan(iP15);
    boolean b17 = server1.repOK();
    tp2.IP iP18 = null;
    boolean b19 = server1.addBan(iP18);
    tp2.IP iP20 = null;
    // The following exception was thrown during execution in test generation
    try {
      boolean b21 = server1.addBan(iP20);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Server [lastUpdate=250000, exceptions=(), bans={}]"+ "'", str5.equals("Server [lastUpdate=250000, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Server [lastUpdate=250000, exceptions=(), bans={}]"+ "'", str8.equals("Server [lastUpdate=250000, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);

  }

  @Test
  public void test211() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test211"); }


    tp2.Server server1 = new tp2.Server((-1));
    server1.update();
    boolean b3 = server1.repOK();
    boolean b4 = server1.repOK();
    java.lang.String str5 = server1.toString();
    tp2.IP iP6 = null;
    boolean b7 = server1.removeBan(iP6);
    long long8 = server1.getLastUpdate();
    tp2.IP iP9 = null;
    boolean b10 = server1.addBan(iP9);
    tp2.IP iP11 = null;
    // The following exception was thrown during execution in test generation
    try {
      boolean b12 = server1.connect(iP11);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Server [lastUpdate=250000, exceptions=(), bans={}]"+ "'", str5.equals("Server [lastUpdate=250000, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long8 == 250000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);

  }

  @Test
  public void test212() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test212"); }


    tp2.Server server1 = new tp2.Server(1);
    tp2.IP iP2 = null;
    boolean b3 = server1.removeBan(iP2);
    server1.update();
    tp2.IP iP5 = null;
    boolean b6 = server1.removeBan(iP5);
    long long7 = server1.getLastUpdate();
    server1.update();
    boolean b9 = server1.repOK();
    boolean b10 = server1.repOK();
    java.lang.String str11 = server1.toString();
    long long12 = server1.getLastUpdate();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long7 == 250000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Server [lastUpdate=250000, exceptions=(), bans={}]"+ "'", str11.equals("Server [lastUpdate=250000, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long12 == 250000L);

  }

  @Test
  public void test213() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test213"); }


    tp2.Server server1 = new tp2.Server(1);
    tp2.IP iP2 = null;
    boolean b3 = server1.addBan(iP2);
    server1.update();
    long long5 = server1.getLastUpdate();
    long long6 = server1.getLastUpdate();
    tp2.IP iP7 = null;
    // The following exception was thrown during execution in test generation
    try {
      boolean b8 = server1.connect(iP7);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long5 == 250000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long6 == 250000L);

  }

  @Test
  public void test214() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test214"); }


    tp2.Server server0 = new tp2.Server();
    boolean b1 = server0.repOK();
    tp2.IP iP2 = null;
    boolean b3 = server0.addBan(iP2);
    tp2.IP iP4 = null;
    boolean b5 = server0.removeException(iP4);
    java.lang.String str6 = server0.toString();
    tp2.IP iP7 = null;
    // The following exception was thrown during execution in test generation
    try {
      boolean b8 = server0.addBan(iP7);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Server [lastUpdate=null, exceptions=(), bans={[IPBan [ip=null, expires=1465347958280]]}]"+ "'", str6.equals("Server [lastUpdate=null, exceptions=(), bans={[IPBan [ip=null, expires=1465347958280]]}]"));

  }

  @Test
  public void test215() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test215"); }


    tp2.Server server1 = new tp2.Server(1);
    tp2.IP iP2 = null;
    boolean b3 = server1.removeBan(iP2);
    server1.update();
    tp2.IP iP5 = null;
    boolean b6 = server1.removeBan(iP5);
    tp2.IP iP7 = null;
    boolean b8 = server1.removeException(iP7);
    boolean b9 = server1.repOK();
    server1.update();
    boolean b11 = server1.repOK();
    tp2.IP iP12 = null;
    boolean b13 = server1.removeException(iP12);
    long long14 = server1.getLastUpdate();
    tp2.IP iP15 = null;
    boolean b16 = server1.addBan(iP15);
    long long17 = server1.getLastUpdate();
    tp2.IP iP18 = null;
    // The following exception was thrown during execution in test generation
    try {
      boolean b19 = server1.removeBan(iP18);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long14 == 250000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long17 == 250000L);

  }

  @Test
  public void test216() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test216"); }


    tp2.Server server1 = new tp2.Server(1);
    tp2.IP iP2 = null;
    boolean b3 = server1.removeException(iP2);
    java.lang.String str4 = server1.toString();
    tp2.IP iP5 = null;
    boolean b6 = server1.connect(iP5);
    java.lang.String str7 = server1.toString();
    java.lang.String str8 = server1.toString();
    boolean b9 = server1.repOK();
    tp2.ITime iTime10 = null;
    server1.setTime(iTime10);
    // The following exception was thrown during execution in test generation
    try {
      long long12 = server1.getLastUpdate();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Server [lastUpdate=null, exceptions=(), bans={}]"+ "'", str4.equals("Server [lastUpdate=null, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Server [lastUpdate=null, exceptions=(), bans={}]"+ "'", str7.equals("Server [lastUpdate=null, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Server [lastUpdate=null, exceptions=(), bans={}]"+ "'", str8.equals("Server [lastUpdate=null, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);

  }

  @Test
  public void test217() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test217"); }


    tp2.Server server1 = new tp2.Server(0);
    tp2.IP iP2 = null;
    boolean b3 = server1.removeException(iP2);
    server1.update();
    tp2.IP iP5 = null;
    boolean b6 = server1.connect(iP5);
    java.lang.String str7 = server1.toString();
    tp2.IP iP8 = null;
    boolean b9 = server1.addBan(iP8);
    tp2.IP iP10 = null;
    // The following exception was thrown during execution in test generation
    try {
      boolean b11 = server1.removeBan(iP10);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Server [lastUpdate=250000, exceptions=(), bans={}]"+ "'", str7.equals("Server [lastUpdate=250000, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);

  }

  @Test
  public void test218() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test218"); }


    tp2.Server server1 = new tp2.Server(1);
    tp2.IP iP2 = null;
    boolean b3 = server1.removeBan(iP2);
    server1.update();
    long long5 = server1.getLastUpdate();
    tp2.IP iP6 = null;
    boolean b7 = server1.connect(iP6);
    tp2.IP iP8 = null;
    boolean b9 = server1.removeBan(iP8);
    boolean b10 = server1.repOK();
    tp2.ITime iTime11 = null;
    server1.setTime(iTime11);
    tp2.IP iP13 = null;
    boolean b14 = server1.removeException(iP13);
    tp2.IP iP15 = null;
    // The following exception was thrown during execution in test generation
    try {
      boolean b16 = server1.addBan(iP15);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long5 == 250000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);

  }

  @Test
  public void test219() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test219"); }


    tp2.Server server0 = new tp2.Server();
    boolean b1 = server0.repOK();
    tp2.ITime iTime2 = null;
    server0.setTime(iTime2);
    boolean b4 = server0.repOK();
    tp2.IP iP5 = null;
    boolean b6 = server0.removeBan(iP5);
    tp2.IP iP7 = null;
    // The following exception was thrown during execution in test generation
    try {
      boolean b8 = server0.addBan(iP7);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);

  }

  @Test
  public void test220() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test220"); }


    tp2.Server server0 = new tp2.Server();
    server0.update();
    server0.update();
    tp2.ITime iTime3 = null;
    server0.setTime(iTime3);
    tp2.IP iP5 = null;
    boolean b6 = server0.removeException(iP5);
    boolean b7 = server0.repOK();
    // The following exception was thrown during execution in test generation
    try {
      server0.update();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);

  }

  @Test
  public void test221() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test221"); }


    tp2.Server server1 = new tp2.Server(1);
    tp2.IP iP2 = null;
    boolean b3 = server1.removeBan(iP2);
    server1.update();
    tp2.IP iP5 = null;
    boolean b6 = server1.removeBan(iP5);
    java.lang.String str7 = server1.toString();
    long long8 = server1.getLastUpdate();
    server1.update();
    long long10 = server1.getLastUpdate();
    server1.update();
    tp2.ITime iTime12 = null;
    server1.setTime(iTime12);
    tp2.IP iP14 = null;
    boolean b15 = server1.removeBan(iP14);
    long long16 = server1.getLastUpdate();
    boolean b17 = server1.repOK();
    tp2.ITime iTime18 = null;
    server1.setTime(iTime18);
    tp2.IP iP20 = null;
    boolean b21 = server1.removeException(iP20);
    tp2.IP iP22 = null;
    boolean b23 = server1.removeException(iP22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Server [lastUpdate=250000, exceptions=(), bans={}]"+ "'", str7.equals("Server [lastUpdate=250000, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long8 == 250000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long10 == 250000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long16 == 250000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);

  }

  @Test
  public void test222() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test222"); }


    tp2.Server server1 = new tp2.Server(1);
    tp2.IP iP2 = null;
    boolean b3 = server1.removeBan(iP2);
    server1.update();
    java.lang.String str5 = server1.toString();
    tp2.IP iP6 = null;
    boolean b7 = server1.removeBan(iP6);
    java.lang.String str8 = server1.toString();
    tp2.ITime iTime9 = null;
    server1.setTime(iTime9);
    java.lang.String str11 = server1.toString();
    java.lang.String str12 = server1.toString();
    long long13 = server1.getLastUpdate();
    tp2.ITime iTime14 = null;
    server1.setTime(iTime14);
    tp2.IP iP16 = null;
    boolean b17 = server1.removeException(iP16);
    tp2.IP iP18 = null;
    boolean b19 = server1.removeException(iP18);
    boolean b20 = server1.repOK();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Server [lastUpdate=250000, exceptions=(), bans={}]"+ "'", str5.equals("Server [lastUpdate=250000, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Server [lastUpdate=250000, exceptions=(), bans={}]"+ "'", str8.equals("Server [lastUpdate=250000, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Server [lastUpdate=250000, exceptions=(), bans={}]"+ "'", str11.equals("Server [lastUpdate=250000, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Server [lastUpdate=250000, exceptions=(), bans={}]"+ "'", str12.equals("Server [lastUpdate=250000, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long13 == 250000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);

  }

  @Test
  public void test223() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test223"); }


    tp2.Server server1 = new tp2.Server(1);
    tp2.IP iP2 = null;
    boolean b3 = server1.removeBan(iP2);
    tp2.ITime iTime4 = null;
    server1.setTime(iTime4);
    tp2.IP iP6 = null;
    boolean b7 = server1.removeBan(iP6);
    tp2.ITime iTime8 = null;
    server1.setTime(iTime8);
    java.lang.String str10 = server1.toString();
    boolean b11 = server1.repOK();
    java.lang.String str12 = server1.toString();
    // The following exception was thrown during execution in test generation
    try {
      long long13 = server1.getLastUpdate();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Server [lastUpdate=null, exceptions=(), bans={}]"+ "'", str10.equals("Server [lastUpdate=null, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Server [lastUpdate=null, exceptions=(), bans={}]"+ "'", str12.equals("Server [lastUpdate=null, exceptions=(), bans={}]"));

  }

  @Test
  public void test224() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test224"); }


    tp2.Server server1 = new tp2.Server((-1));
    server1.update();
    boolean b3 = server1.repOK();
    tp2.IP iP4 = null;
    boolean b5 = server1.connect(iP4);
    tp2.ITime iTime6 = null;
    server1.setTime(iTime6);
    tp2.IP iP8 = null;
    boolean b9 = server1.connect(iP8);
    tp2.IP iP10 = null;
    boolean b11 = server1.removeBan(iP10);
    tp2.IP iP12 = null;
    // The following exception was thrown during execution in test generation
    try {
      boolean b13 = server1.addException(iP12);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);

  }

  @Test
  public void test225() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test225"); }


    tp2.Server server1 = new tp2.Server(1);
    tp2.IP iP2 = null;
    boolean b3 = server1.removeBan(iP2);
    server1.update();
    long long5 = server1.getLastUpdate();
    tp2.IP iP6 = null;
    boolean b7 = server1.connect(iP6);
    java.lang.String str8 = server1.toString();
    server1.update();
    tp2.IP iP10 = null;
    boolean b11 = server1.removeBan(iP10);
    java.lang.String str12 = server1.toString();
    boolean b13 = server1.repOK();
    tp2.IP iP14 = null;
    boolean b15 = server1.removeException(iP14);
    long long16 = server1.getLastUpdate();
    tp2.IP iP17 = null;
    boolean b18 = server1.connect(iP17);
    tp2.IP iP19 = null;
    boolean b20 = server1.connect(iP19);
    long long21 = server1.getLastUpdate();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long5 == 250000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Server [lastUpdate=250000, exceptions=(), bans={}]"+ "'", str8.equals("Server [lastUpdate=250000, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Server [lastUpdate=250000, exceptions=(), bans={}]"+ "'", str12.equals("Server [lastUpdate=250000, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long16 == 250000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long21 == 250000L);

  }

  @Test
  public void test226() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test226"); }


    tp2.Server server1 = new tp2.Server(1);
    tp2.IP iP2 = null;
    boolean b3 = server1.removeBan(iP2);
    server1.update();
    tp2.IP iP5 = null;
    boolean b6 = server1.removeBan(iP5);
    tp2.IP iP7 = null;
    boolean b8 = server1.removeException(iP7);
    server1.update();
    tp2.IP iP10 = null;
    boolean b11 = server1.addBan(iP10);
    long long12 = server1.getLastUpdate();
    boolean b13 = server1.repOK();
    tp2.IP iP14 = null;
    // The following exception was thrown during execution in test generation
    try {
      boolean b15 = server1.addException(iP14);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long12 == 250000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);

  }

  @Test
  public void test227() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test227"); }


    tp2.Server server0 = new tp2.Server();
    server0.update();
    tp2.IP iP2 = null;
    boolean b3 = server0.removeBan(iP2);
    server0.update();
    java.lang.String str5 = server0.toString();
    long long6 = server0.getLastUpdate();
    long long7 = server0.getLastUpdate();
    java.lang.String str8 = server0.toString();
    tp2.IP iP9 = null;
    boolean b10 = server0.addBan(iP9);
    tp2.IP iP11 = null;
    boolean b12 = server0.removeException(iP11);
    tp2.IP iP13 = null;
    // The following exception was thrown during execution in test generation
    try {
      boolean b14 = server0.addBan(iP13);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Server [lastUpdate=1465347898303, exceptions=(), bans={}]"+ "'", str5.equals("Server [lastUpdate=1465347898303, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long6 == 1465347898303L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long7 == 1465347898303L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Server [lastUpdate=1465347898303, exceptions=(), bans={}]"+ "'", str8.equals("Server [lastUpdate=1465347898303, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);

  }

  @Test
  public void test228() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test228"); }


    tp2.Server server1 = new tp2.Server(1);
    tp2.IP iP2 = null;
    boolean b3 = server1.removeBan(iP2);
    server1.update();
    tp2.IP iP5 = null;
    boolean b6 = server1.removeBan(iP5);
    java.lang.String str7 = server1.toString();
    long long8 = server1.getLastUpdate();
    tp2.ITime iTime9 = null;
    server1.setTime(iTime9);
    tp2.IP iP11 = null;
    boolean b12 = server1.connect(iP11);
    tp2.IP iP13 = null;
    boolean b14 = server1.removeException(iP13);
    java.lang.String str15 = server1.toString();
    // The following exception was thrown during execution in test generation
    try {
      server1.update();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Server [lastUpdate=250000, exceptions=(), bans={}]"+ "'", str7.equals("Server [lastUpdate=250000, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long8 == 250000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "Server [lastUpdate=250000, exceptions=(), bans={}]"+ "'", str15.equals("Server [lastUpdate=250000, exceptions=(), bans={}]"));

  }

  @Test
  public void test229() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test229"); }


    tp2.Server server1 = new tp2.Server(1);
    tp2.IP iP2 = null;
    boolean b3 = server1.removeBan(iP2);
    tp2.ITime iTime4 = null;
    server1.setTime(iTime4);
    tp2.IP iP6 = null;
    boolean b7 = server1.removeBan(iP6);
    tp2.ITime iTime8 = null;
    server1.setTime(iTime8);
    java.lang.String str10 = server1.toString();
    boolean b11 = server1.repOK();
    tp2.IP iP12 = null;
    // The following exception was thrown during execution in test generation
    try {
      boolean b13 = server1.addBan(iP12);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Server [lastUpdate=null, exceptions=(), bans={}]"+ "'", str10.equals("Server [lastUpdate=null, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);

  }

  @Test
  public void test230() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test230"); }


    tp2.Server server1 = new tp2.Server(1);
    tp2.IP iP2 = null;
    boolean b3 = server1.removeBan(iP2);
    server1.update();
    tp2.IP iP5 = null;
    boolean b6 = server1.removeBan(iP5);
    tp2.IP iP7 = null;
    boolean b8 = server1.removeBan(iP7);
    java.lang.String str9 = server1.toString();
    boolean b10 = server1.repOK();
    tp2.IP iP11 = null;
    boolean b12 = server1.connect(iP11);
    tp2.IP iP13 = null;
    boolean b14 = server1.addBan(iP13);
    tp2.ITime iTime15 = null;
    server1.setTime(iTime15);
    tp2.IP iP17 = null;
    // The following exception was thrown during execution in test generation
    try {
      boolean b18 = server1.connect(iP17);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Server [lastUpdate=250000, exceptions=(), bans={}]"+ "'", str9.equals("Server [lastUpdate=250000, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);

  }

  @Test
  public void test231() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test231"); }


    tp2.Server server0 = new tp2.Server();
    server0.update();
    tp2.IP iP2 = null;
    boolean b3 = server0.removeBan(iP2);
    tp2.ITime iTime4 = null;
    server0.setTime(iTime4);
    long long6 = server0.getLastUpdate();
    tp2.IP iP7 = null;
    boolean b8 = server0.removeException(iP7);
    boolean b9 = server0.repOK();
    long long10 = server0.getLastUpdate();
    long long11 = server0.getLastUpdate();
    tp2.IP iP12 = null;
    boolean b13 = server0.connect(iP12);
    long long14 = server0.getLastUpdate();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long6 == 1465347898324L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long10 == 1465347898324L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long11 == 1465347898324L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long14 == 1465347898324L);

  }

  @Test
  public void test232() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test232"); }


    tp2.Server server1 = new tp2.Server(1);
    tp2.IP iP2 = null;
    boolean b3 = server1.removeBan(iP2);
    server1.update();
    tp2.IP iP5 = null;
    boolean b6 = server1.removeBan(iP5);
    tp2.IP iP7 = null;
    boolean b8 = server1.connect(iP7);
    server1.update();
    server1.update();
    server1.update();
    long long12 = server1.getLastUpdate();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long12 == 250000L);

  }

  @Test
  public void test233() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test233"); }


    tp2.Server server1 = new tp2.Server(1);
    tp2.IP iP2 = null;
    boolean b3 = server1.removeBan(iP2);
    server1.update();
    java.lang.String str5 = server1.toString();
    tp2.IP iP6 = null;
    boolean b7 = server1.connect(iP6);
    boolean b8 = server1.repOK();
    long long9 = server1.getLastUpdate();
    long long10 = server1.getLastUpdate();
    tp2.IP iP11 = null;
    boolean b12 = server1.connect(iP11);
    boolean b13 = server1.repOK();
    server1.update();
    tp2.ITime iTime15 = null;
    server1.setTime(iTime15);
    long long17 = server1.getLastUpdate();
    // The following exception was thrown during execution in test generation
    try {
      server1.update();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Server [lastUpdate=250000, exceptions=(), bans={}]"+ "'", str5.equals("Server [lastUpdate=250000, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long9 == 250000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long10 == 250000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long17 == 250000L);

  }

  @Test
  public void test234() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test234"); }


    tp2.Server server1 = new tp2.Server(1);
    tp2.IP iP2 = null;
    boolean b3 = server1.removeBan(iP2);
    tp2.ITime iTime4 = null;
    server1.setTime(iTime4);
    tp2.IP iP6 = null;
    boolean b7 = server1.removeBan(iP6);
    java.lang.String str8 = server1.toString();
    tp2.ITime iTime9 = null;
    server1.setTime(iTime9);
    tp2.ITime iTime11 = null;
    server1.setTime(iTime11);
    tp2.IP iP13 = null;
    boolean b14 = server1.connect(iP13);
    boolean b15 = server1.repOK();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Server [lastUpdate=null, exceptions=(), bans={}]"+ "'", str8.equals("Server [lastUpdate=null, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);

  }

  @Test
  public void test235() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test235"); }


    tp2.Server server1 = new tp2.Server(1);
    tp2.IP iP2 = null;
    boolean b3 = server1.removeBan(iP2);
    server1.update();
    tp2.IP iP5 = null;
    boolean b6 = server1.removeBan(iP5);
    tp2.IP iP7 = null;
    boolean b8 = server1.removeException(iP7);
    java.lang.String str9 = server1.toString();
    java.lang.String str10 = server1.toString();
    tp2.ITime iTime11 = null;
    server1.setTime(iTime11);
    // The following exception was thrown during execution in test generation
    try {
      server1.update();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Server [lastUpdate=250000, exceptions=(), bans={}]"+ "'", str9.equals("Server [lastUpdate=250000, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Server [lastUpdate=250000, exceptions=(), bans={}]"+ "'", str10.equals("Server [lastUpdate=250000, exceptions=(), bans={}]"));

  }

  @Test
  public void test236() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test236"); }


    tp2.Server server1 = new tp2.Server((-1));
    server1.update();
    boolean b3 = server1.repOK();
    tp2.IP iP4 = null;
    boolean b5 = server1.connect(iP4);
    tp2.IP iP6 = null;
    // The following exception was thrown during execution in test generation
    try {
      boolean b7 = server1.addException(iP6);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);

  }

  @Test
  public void test237() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test237"); }


    tp2.Server server0 = new tp2.Server();
    server0.update();
    tp2.IP iP2 = null;
    boolean b3 = server0.removeBan(iP2);
    server0.update();
    tp2.IP iP5 = null;
    boolean b6 = server0.addBan(iP5);
    boolean b7 = server0.repOK();
    tp2.IP iP8 = null;
    boolean b9 = server0.removeException(iP8);
    boolean b10 = server0.repOK();
    tp2.IP iP11 = null;
    // The following exception was thrown during execution in test generation
    try {
      boolean b12 = server0.addBan(iP11);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);

  }

  @Test
  public void test238() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test238"); }


    tp2.Server server1 = new tp2.Server(1);
    tp2.IP iP2 = null;
    boolean b3 = server1.removeBan(iP2);
    tp2.ITime iTime4 = null;
    server1.setTime(iTime4);
    tp2.IP iP6 = null;
    boolean b7 = server1.removeBan(iP6);
    tp2.ITime iTime8 = null;
    server1.setTime(iTime8);
    tp2.ITime iTime10 = null;
    server1.setTime(iTime10);
    boolean b12 = server1.repOK();
    tp2.IP iP13 = null;
    boolean b14 = server1.connect(iP13);
    tp2.IP iP15 = null;
    boolean b16 = server1.connect(iP15);
    java.lang.String str17 = server1.toString();
    tp2.IP iP18 = null;
    boolean b19 = server1.connect(iP18);
    // The following exception was thrown during execution in test generation
    try {
      server1.update();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "Server [lastUpdate=null, exceptions=(), bans={}]"+ "'", str17.equals("Server [lastUpdate=null, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);

  }

  @Test
  public void test239() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test239"); }


    tp2.Server server1 = new tp2.Server(1);
    tp2.IP iP2 = null;
    boolean b3 = server1.removeException(iP2);
    java.lang.String str4 = server1.toString();
    tp2.IP iP5 = null;
    boolean b6 = server1.connect(iP5);
    java.lang.String str7 = server1.toString();
    java.lang.String str8 = server1.toString();
    java.lang.String str9 = server1.toString();
    java.lang.String str10 = server1.toString();
    tp2.IP iP11 = null;
    boolean b12 = server1.connect(iP11);
    tp2.IP iP13 = null;
    boolean b14 = server1.connect(iP13);
    tp2.IP iP15 = null;
    boolean b16 = server1.addBan(iP15);
    java.lang.String str17 = server1.toString();
    tp2.IP iP18 = null;
    // The following exception was thrown during execution in test generation
    try {
      boolean b19 = server1.removeBan(iP18);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Server [lastUpdate=null, exceptions=(), bans={}]"+ "'", str4.equals("Server [lastUpdate=null, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Server [lastUpdate=null, exceptions=(), bans={}]"+ "'", str7.equals("Server [lastUpdate=null, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Server [lastUpdate=null, exceptions=(), bans={}]"+ "'", str8.equals("Server [lastUpdate=null, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Server [lastUpdate=null, exceptions=(), bans={}]"+ "'", str9.equals("Server [lastUpdate=null, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Server [lastUpdate=null, exceptions=(), bans={}]"+ "'", str10.equals("Server [lastUpdate=null, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "Server [lastUpdate=null, exceptions=(), bans={[IPBan [ip=null, expires=310000]]}]"+ "'", str17.equals("Server [lastUpdate=null, exceptions=(), bans={[IPBan [ip=null, expires=310000]]}]"));

  }

  @Test
  public void test240() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test240"); }


    tp2.Server server1 = new tp2.Server(1);
    tp2.IP iP2 = null;
    boolean b3 = server1.removeBan(iP2);
    server1.update();
    long long5 = server1.getLastUpdate();
    tp2.IP iP6 = null;
    boolean b7 = server1.addBan(iP6);
    server1.update();
    tp2.IP iP9 = null;
    boolean b10 = server1.removeException(iP9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long5 == 250000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);

  }

  @Test
  public void test241() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test241"); }


    tp2.Server server1 = new tp2.Server(1);
    tp2.IP iP2 = null;
    boolean b3 = server1.removeBan(iP2);
    server1.update();
    tp2.IP iP5 = null;
    boolean b6 = server1.removeBan(iP5);
    tp2.IP iP7 = null;
    boolean b8 = server1.removeBan(iP7);
    tp2.IP iP9 = null;
    boolean b10 = server1.removeException(iP9);
    tp2.IP iP11 = null;
    boolean b12 = server1.connect(iP11);
    tp2.ITime iTime13 = null;
    server1.setTime(iTime13);
    long long15 = server1.getLastUpdate();
    boolean b16 = server1.repOK();
    long long17 = server1.getLastUpdate();
    // The following exception was thrown during execution in test generation
    try {
      server1.update();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long15 == 250000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long17 == 250000L);

  }

  @Test
  public void test242() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test242"); }


    tp2.Server server1 = new tp2.Server(1);
    tp2.IP iP2 = null;
    boolean b3 = server1.removeBan(iP2);
    server1.update();
    java.lang.String str5 = server1.toString();
    tp2.IP iP6 = null;
    boolean b7 = server1.removeBan(iP6);
    java.lang.String str8 = server1.toString();
    tp2.ITime iTime9 = null;
    server1.setTime(iTime9);
    java.lang.String str11 = server1.toString();
    java.lang.String str12 = server1.toString();
    long long13 = server1.getLastUpdate();
    tp2.ITime iTime14 = null;
    server1.setTime(iTime14);
    java.lang.String str16 = server1.toString();
    boolean b17 = server1.repOK();
    tp2.IP iP18 = null;
    boolean b19 = server1.removeException(iP18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Server [lastUpdate=250000, exceptions=(), bans={}]"+ "'", str5.equals("Server [lastUpdate=250000, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Server [lastUpdate=250000, exceptions=(), bans={}]"+ "'", str8.equals("Server [lastUpdate=250000, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Server [lastUpdate=250000, exceptions=(), bans={}]"+ "'", str11.equals("Server [lastUpdate=250000, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Server [lastUpdate=250000, exceptions=(), bans={}]"+ "'", str12.equals("Server [lastUpdate=250000, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long13 == 250000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "Server [lastUpdate=250000, exceptions=(), bans={}]"+ "'", str16.equals("Server [lastUpdate=250000, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);

  }

  @Test
  public void test243() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test243"); }


    tp2.Server server1 = new tp2.Server(1);
    tp2.IP iP2 = null;
    boolean b3 = server1.removeBan(iP2);
    tp2.ITime iTime4 = null;
    server1.setTime(iTime4);
    tp2.IP iP6 = null;
    boolean b7 = server1.removeBan(iP6);
    java.lang.String str8 = server1.toString();
    tp2.ITime iTime9 = null;
    server1.setTime(iTime9);
    tp2.IP iP11 = null;
    boolean b12 = server1.removeBan(iP11);
    tp2.IP iP13 = null;
    boolean b14 = server1.removeException(iP13);
    tp2.IP iP15 = null;
    // The following exception was thrown during execution in test generation
    try {
      boolean b16 = server1.addException(iP15);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Server [lastUpdate=null, exceptions=(), bans={}]"+ "'", str8.equals("Server [lastUpdate=null, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);

  }

  @Test
  public void test244() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test244"); }


    tp2.Server server1 = new tp2.Server(1);
    tp2.IP iP2 = null;
    boolean b3 = server1.removeBan(iP2);
    server1.update();
    java.lang.String str5 = server1.toString();
    tp2.IP iP6 = null;
    boolean b7 = server1.removeBan(iP6);
    java.lang.String str8 = server1.toString();
    tp2.IP iP9 = null;
    boolean b10 = server1.removeException(iP9);
    java.lang.String str11 = server1.toString();
    server1.update();
    tp2.IP iP13 = null;
    // The following exception was thrown during execution in test generation
    try {
      boolean b14 = server1.addException(iP13);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Server [lastUpdate=250000, exceptions=(), bans={}]"+ "'", str5.equals("Server [lastUpdate=250000, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Server [lastUpdate=250000, exceptions=(), bans={}]"+ "'", str8.equals("Server [lastUpdate=250000, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Server [lastUpdate=250000, exceptions=(), bans={}]"+ "'", str11.equals("Server [lastUpdate=250000, exceptions=(), bans={}]"));

  }

  @Test
  public void test245() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test245"); }


    tp2.Server server1 = new tp2.Server(1);
    tp2.IP iP2 = null;
    boolean b3 = server1.removeBan(iP2);
    server1.update();
    java.lang.String str5 = server1.toString();
    long long6 = server1.getLastUpdate();
    java.lang.String str7 = server1.toString();
    java.lang.String str8 = server1.toString();
    tp2.IP iP9 = null;
    boolean b10 = server1.addBan(iP9);
    tp2.IP iP11 = null;
    boolean b12 = server1.removeException(iP11);
    tp2.ITime iTime13 = null;
    server1.setTime(iTime13);
    tp2.IP iP15 = null;
    // The following exception was thrown during execution in test generation
    try {
      boolean b16 = server1.addException(iP15);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Server [lastUpdate=250000, exceptions=(), bans={}]"+ "'", str5.equals("Server [lastUpdate=250000, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long6 == 250000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Server [lastUpdate=250000, exceptions=(), bans={}]"+ "'", str7.equals("Server [lastUpdate=250000, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Server [lastUpdate=250000, exceptions=(), bans={}]"+ "'", str8.equals("Server [lastUpdate=250000, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);

  }

  @Test
  public void test246() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test246"); }


    tp2.Server server1 = new tp2.Server(1);
    tp2.IP iP2 = null;
    boolean b3 = server1.removeBan(iP2);
    tp2.ITime iTime4 = null;
    server1.setTime(iTime4);
    tp2.IP iP6 = null;
    boolean b7 = server1.removeBan(iP6);
    java.lang.String str8 = server1.toString();
    tp2.ITime iTime9 = null;
    server1.setTime(iTime9);
    boolean b11 = server1.repOK();
    tp2.IP iP12 = null;
    // The following exception was thrown during execution in test generation
    try {
      boolean b13 = server1.addBan(iP12);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Server [lastUpdate=null, exceptions=(), bans={}]"+ "'", str8.equals("Server [lastUpdate=null, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);

  }

  @Test
  public void test247() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test247"); }


    tp2.Server server0 = new tp2.Server();
    boolean b1 = server0.repOK();
    server0.update();
    server0.update();
    tp2.IP iP4 = null;
    boolean b5 = server0.removeBan(iP4);
    tp2.IP iP6 = null;
    boolean b7 = server0.removeBan(iP6);
    java.lang.String str8 = server0.toString();
    tp2.IP iP9 = null;
    boolean b10 = server0.removeBan(iP9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Server [lastUpdate=1465347898357, exceptions=(), bans={}]"+ "'", str8.equals("Server [lastUpdate=1465347898357, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);

  }

  @Test
  public void test248() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test248"); }


    tp2.Server server1 = new tp2.Server(1);
    tp2.IP iP2 = null;
    boolean b3 = server1.removeBan(iP2);
    server1.update();
    tp2.IP iP5 = null;
    boolean b6 = server1.removeBan(iP5);
    java.lang.String str7 = server1.toString();
    long long8 = server1.getLastUpdate();
    server1.update();
    long long10 = server1.getLastUpdate();
    server1.update();
    tp2.IP iP12 = null;
    boolean b13 = server1.removeBan(iP12);
    tp2.ITime iTime14 = null;
    server1.setTime(iTime14);
    tp2.ITime iTime16 = null;
    server1.setTime(iTime16);
    boolean b18 = server1.repOK();
    long long19 = server1.getLastUpdate();
    // The following exception was thrown during execution in test generation
    try {
      server1.update();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Server [lastUpdate=250000, exceptions=(), bans={}]"+ "'", str7.equals("Server [lastUpdate=250000, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long8 == 250000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long10 == 250000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long19 == 250000L);

  }

  @Test
  public void test249() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test249"); }


    tp2.Server server1 = new tp2.Server(1);
    tp2.IP iP2 = null;
    boolean b3 = server1.removeBan(iP2);
    server1.update();
    tp2.IP iP5 = null;
    boolean b6 = server1.removeBan(iP5);
    tp2.IP iP7 = null;
    boolean b8 = server1.connect(iP7);
    server1.update();
    tp2.IP iP10 = null;
    boolean b11 = server1.removeException(iP10);
    long long12 = server1.getLastUpdate();
    tp2.IP iP13 = null;
    boolean b14 = server1.addBan(iP13);
    tp2.ITime iTime15 = null;
    server1.setTime(iTime15);
    tp2.IP iP17 = null;
    // The following exception was thrown during execution in test generation
    try {
      boolean b18 = server1.addBan(iP17);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long12 == 250000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);

  }

  @Test
  public void test250() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test250"); }


    tp2.Server server0 = new tp2.Server();
    server0.update();
    tp2.IP iP2 = null;
    boolean b3 = server0.removeBan(iP2);
    server0.update();
    java.lang.String str5 = server0.toString();
    java.lang.String str6 = server0.toString();
    java.lang.String str7 = server0.toString();
    tp2.ITime iTime8 = null;
    server0.setTime(iTime8);
    boolean b10 = server0.repOK();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Server [lastUpdate=1465347898363, exceptions=(), bans={}]"+ "'", str5.equals("Server [lastUpdate=1465347898363, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Server [lastUpdate=1465347898363, exceptions=(), bans={}]"+ "'", str6.equals("Server [lastUpdate=1465347898363, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Server [lastUpdate=1465347898363, exceptions=(), bans={}]"+ "'", str7.equals("Server [lastUpdate=1465347898363, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);

  }

  @Test
  public void test251() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test251"); }


    tp2.Server server1 = new tp2.Server(1);
    tp2.IP iP2 = null;
    boolean b3 = server1.removeBan(iP2);
    tp2.ITime iTime4 = null;
    server1.setTime(iTime4);
    tp2.IP iP6 = null;
    boolean b7 = server1.removeBan(iP6);
    tp2.ITime iTime8 = null;
    server1.setTime(iTime8);
    java.lang.String str10 = server1.toString();
    boolean b11 = server1.repOK();
    tp2.IP iP12 = null;
    boolean b13 = server1.connect(iP12);
    boolean b14 = server1.repOK();
    tp2.ITime iTime15 = null;
    server1.setTime(iTime15);
    tp2.ITime iTime17 = null;
    server1.setTime(iTime17);
    boolean b19 = server1.repOK();
    boolean b20 = server1.repOK();
    tp2.IP iP21 = null;
    boolean b22 = server1.removeBan(iP21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Server [lastUpdate=null, exceptions=(), bans={}]"+ "'", str10.equals("Server [lastUpdate=null, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);

  }

  @Test
  public void test252() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test252"); }


    tp2.Server server1 = new tp2.Server(1);
    tp2.IP iP2 = null;
    boolean b3 = server1.removeBan(iP2);
    server1.update();
    tp2.IP iP5 = null;
    boolean b6 = server1.removeBan(iP5);
    tp2.IP iP7 = null;
    boolean b8 = server1.removeBan(iP7);
    tp2.IP iP9 = null;
    boolean b10 = server1.removeException(iP9);
    tp2.IP iP11 = null;
    boolean b12 = server1.removeException(iP11);
    tp2.IP iP13 = null;
    boolean b14 = server1.removeBan(iP13);
    server1.update();
    tp2.IP iP16 = null;
    boolean b17 = server1.addBan(iP16);
    tp2.ITime iTime18 = null;
    server1.setTime(iTime18);
    // The following exception was thrown during execution in test generation
    try {
      server1.update();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);

  }

  @Test
  public void test253() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test253"); }


    tp2.Server server1 = new tp2.Server(100);
    tp2.ITime iTime2 = null;
    server1.setTime(iTime2);
    boolean b4 = server1.repOK();
    tp2.IP iP5 = null;
    boolean b6 = server1.connect(iP5);
    tp2.ITime iTime7 = null;
    server1.setTime(iTime7);
    tp2.IP iP9 = null;
    // The following exception was thrown during execution in test generation
    try {
      boolean b10 = server1.addBan(iP9);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);

  }

  @Test
  public void test254() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test254"); }


    tp2.Server server1 = new tp2.Server(1);
    tp2.IP iP2 = null;
    boolean b3 = server1.removeBan(iP2);
    tp2.ITime iTime4 = null;
    server1.setTime(iTime4);
    tp2.IP iP6 = null;
    boolean b7 = server1.removeBan(iP6);
    java.lang.String str8 = server1.toString();
    tp2.ITime iTime9 = null;
    server1.setTime(iTime9);
    tp2.IP iP11 = null;
    boolean b12 = server1.removeBan(iP11);
    java.lang.String str13 = server1.toString();
    java.lang.String str14 = server1.toString();
    tp2.IP iP15 = null;
    boolean b16 = server1.connect(iP15);
    tp2.ITime iTime17 = null;
    server1.setTime(iTime17);
    tp2.IP iP19 = null;
    // The following exception was thrown during execution in test generation
    try {
      boolean b20 = server1.addException(iP19);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Server [lastUpdate=null, exceptions=(), bans={}]"+ "'", str8.equals("Server [lastUpdate=null, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Server [lastUpdate=null, exceptions=(), bans={}]"+ "'", str13.equals("Server [lastUpdate=null, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "Server [lastUpdate=null, exceptions=(), bans={}]"+ "'", str14.equals("Server [lastUpdate=null, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);

  }

  @Test
  public void test255() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test255"); }


    tp2.Server server1 = new tp2.Server(1);
    tp2.IP iP2 = null;
    boolean b3 = server1.removeBan(iP2);
    tp2.ITime iTime4 = null;
    server1.setTime(iTime4);
    tp2.IP iP6 = null;
    boolean b7 = server1.removeBan(iP6);
    tp2.ITime iTime8 = null;
    server1.setTime(iTime8);
    java.lang.String str10 = server1.toString();
    boolean b11 = server1.repOK();
    tp2.IP iP12 = null;
    boolean b13 = server1.connect(iP12);
    tp2.ITime iTime14 = null;
    server1.setTime(iTime14);
    tp2.IP iP16 = null;
    boolean b17 = server1.removeBan(iP16);
    // The following exception was thrown during execution in test generation
    try {
      server1.update();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Server [lastUpdate=null, exceptions=(), bans={}]"+ "'", str10.equals("Server [lastUpdate=null, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);

  }

  @Test
  public void test256() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test256"); }


    tp2.Server server0 = new tp2.Server();
    boolean b1 = server0.repOK();
    tp2.ITime iTime2 = null;
    server0.setTime(iTime2);
    boolean b4 = server0.repOK();
    java.lang.String str5 = server0.toString();
    java.lang.String str6 = server0.toString();
    // The following exception was thrown during execution in test generation
    try {
      long long7 = server0.getLastUpdate();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Server [lastUpdate=null, exceptions=(), bans={}]"+ "'", str5.equals("Server [lastUpdate=null, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Server [lastUpdate=null, exceptions=(), bans={}]"+ "'", str6.equals("Server [lastUpdate=null, exceptions=(), bans={}]"));

  }

  @Test
  public void test257() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test257"); }


    tp2.Server server0 = new tp2.Server();
    server0.update();
    tp2.IP iP2 = null;
    boolean b3 = server0.removeBan(iP2);
    server0.update();
    java.lang.String str5 = server0.toString();
    long long6 = server0.getLastUpdate();
    boolean b7 = server0.repOK();
    long long8 = server0.getLastUpdate();
    tp2.IP iP9 = null;
    boolean b10 = server0.removeException(iP9);
    tp2.IP iP11 = null;
    boolean b12 = server0.connect(iP11);
    tp2.IP iP13 = null;
    // The following exception was thrown during execution in test generation
    try {
      boolean b14 = server0.addException(iP13);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Server [lastUpdate=1465347898377, exceptions=(), bans={}]"+ "'", str5.equals("Server [lastUpdate=1465347898377, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long6 == 1465347898377L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long8 == 1465347898377L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);

  }

  @Test
  public void test258() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test258"); }


    tp2.Server server1 = new tp2.Server(1);
    tp2.IP iP2 = null;
    boolean b3 = server1.removeBan(iP2);
    boolean b4 = server1.repOK();
    tp2.IP iP5 = null;
    boolean b6 = server1.removeException(iP5);
    tp2.IP iP7 = null;
    boolean b8 = server1.connect(iP7);
    tp2.IP iP9 = null;
    boolean b10 = server1.connect(iP9);
    java.lang.String str11 = server1.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Server [lastUpdate=null, exceptions=(), bans={}]"+ "'", str11.equals("Server [lastUpdate=null, exceptions=(), bans={}]"));

  }

  @Test
  public void test259() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test259"); }


    tp2.Server server1 = new tp2.Server(1);
    tp2.IP iP2 = null;
    boolean b3 = server1.removeBan(iP2);
    server1.update();
    long long5 = server1.getLastUpdate();
    tp2.IP iP6 = null;
    boolean b7 = server1.connect(iP6);
    java.lang.String str8 = server1.toString();
    server1.update();
    tp2.IP iP10 = null;
    boolean b11 = server1.removeBan(iP10);
    java.lang.String str12 = server1.toString();
    boolean b13 = server1.repOK();
    tp2.ITime iTime14 = null;
    server1.setTime(iTime14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long5 == 250000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Server [lastUpdate=250000, exceptions=(), bans={}]"+ "'", str8.equals("Server [lastUpdate=250000, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Server [lastUpdate=250000, exceptions=(), bans={}]"+ "'", str12.equals("Server [lastUpdate=250000, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);

  }

  @Test
  public void test260() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test260"); }


    tp2.Server server0 = new tp2.Server();
    boolean b1 = server0.repOK();
    tp2.ITime iTime2 = null;
    server0.setTime(iTime2);
    boolean b4 = server0.repOK();
    tp2.IP iP5 = null;
    boolean b6 = server0.removeBan(iP5);
    boolean b7 = server0.repOK();
    tp2.IP iP8 = null;
    boolean b9 = server0.removeException(iP8);
    boolean b10 = server0.repOK();
    // The following exception was thrown during execution in test generation
    try {
      long long11 = server0.getLastUpdate();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);

  }

  @Test
  public void test261() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test261"); }


    tp2.Server server1 = new tp2.Server(1);
    tp2.IP iP2 = null;
    boolean b3 = server1.removeBan(iP2);
    server1.update();
    tp2.IP iP5 = null;
    boolean b6 = server1.removeBan(iP5);
    tp2.IP iP7 = null;
    boolean b8 = server1.removeBan(iP7);
    tp2.IP iP9 = null;
    boolean b10 = server1.removeException(iP9);
    tp2.IP iP11 = null;
    boolean b12 = server1.removeException(iP11);
    tp2.ITime iTime13 = null;
    server1.setTime(iTime13);
    tp2.IP iP15 = null;
    boolean b16 = server1.connect(iP15);
    tp2.IP iP17 = null;
    boolean b18 = server1.removeBan(iP17);
    boolean b19 = server1.repOK();
    tp2.IP iP20 = null;
    // The following exception was thrown during execution in test generation
    try {
      boolean b21 = server1.addBan(iP20);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);

  }

  @Test
  public void test262() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test262"); }


    tp2.Server server1 = new tp2.Server(1);
    tp2.IP iP2 = null;
    boolean b3 = server1.removeBan(iP2);
    tp2.ITime iTime4 = null;
    server1.setTime(iTime4);
    tp2.IP iP6 = null;
    boolean b7 = server1.removeBan(iP6);
    tp2.ITime iTime8 = null;
    server1.setTime(iTime8);
    java.lang.String str10 = server1.toString();
    boolean b11 = server1.repOK();
    java.lang.String str12 = server1.toString();
    // The following exception was thrown during execution in test generation
    try {
      server1.update();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Server [lastUpdate=null, exceptions=(), bans={}]"+ "'", str10.equals("Server [lastUpdate=null, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Server [lastUpdate=null, exceptions=(), bans={}]"+ "'", str12.equals("Server [lastUpdate=null, exceptions=(), bans={}]"));

  }

  @Test
  public void test263() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test263"); }


    tp2.Server server0 = new tp2.Server();
    server0.update();
    tp2.IP iP2 = null;
    boolean b3 = server0.removeBan(iP2);
    tp2.IP iP4 = null;
    boolean b5 = server0.connect(iP4);
    server0.update();
    tp2.IP iP7 = null;
    boolean b8 = server0.removeBan(iP7);
    java.lang.String str9 = server0.toString();
    tp2.IP iP10 = null;
    boolean b11 = server0.addBan(iP10);
    tp2.IP iP12 = null;
    // The following exception was thrown during execution in test generation
    try {
      boolean b13 = server0.addException(iP12);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Server [lastUpdate=1465347898390, exceptions=(), bans={}]"+ "'", str9.equals("Server [lastUpdate=1465347898390, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);

  }

  @Test
  public void test264() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test264"); }


    tp2.Server server1 = new tp2.Server(1);
    tp2.IP iP2 = null;
    boolean b3 = server1.removeBan(iP2);
    server1.update();
    java.lang.String str5 = server1.toString();
    tp2.IP iP6 = null;
    boolean b7 = server1.removeBan(iP6);
    java.lang.String str8 = server1.toString();
    tp2.IP iP9 = null;
    // The following exception was thrown during execution in test generation
    try {
      boolean b10 = server1.addException(iP9);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Server [lastUpdate=250000, exceptions=(), bans={}]"+ "'", str5.equals("Server [lastUpdate=250000, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Server [lastUpdate=250000, exceptions=(), bans={}]"+ "'", str8.equals("Server [lastUpdate=250000, exceptions=(), bans={}]"));

  }

  @Test
  public void test265() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test265"); }


    tp2.Server server1 = new tp2.Server(1);
    tp2.IP iP2 = null;
    boolean b3 = server1.removeBan(iP2);
    tp2.ITime iTime4 = null;
    server1.setTime(iTime4);
    tp2.IP iP6 = null;
    boolean b7 = server1.removeBan(iP6);
    java.lang.String str8 = server1.toString();
    tp2.ITime iTime9 = null;
    server1.setTime(iTime9);
    tp2.IP iP11 = null;
    boolean b12 = server1.removeBan(iP11);
    java.lang.String str13 = server1.toString();
    boolean b14 = server1.repOK();
    tp2.IP iP15 = null;
    boolean b16 = server1.connect(iP15);
    tp2.IP iP17 = null;
    boolean b18 = server1.connect(iP17);
    tp2.IP iP19 = null;
    // The following exception was thrown during execution in test generation
    try {
      boolean b20 = server1.addBan(iP19);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Server [lastUpdate=null, exceptions=(), bans={}]"+ "'", str8.equals("Server [lastUpdate=null, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Server [lastUpdate=null, exceptions=(), bans={}]"+ "'", str13.equals("Server [lastUpdate=null, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);

  }

  @Test
  public void test266() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test266"); }


    tp2.Server server1 = new tp2.Server(1);
    tp2.IP iP2 = null;
    boolean b3 = server1.removeBan(iP2);
    server1.update();
    tp2.IP iP5 = null;
    boolean b6 = server1.removeBan(iP5);
    java.lang.String str7 = server1.toString();
    long long8 = server1.getLastUpdate();
    server1.update();
    long long10 = server1.getLastUpdate();
    server1.update();
    tp2.IP iP12 = null;
    boolean b13 = server1.removeException(iP12);
    tp2.ITime iTime14 = null;
    server1.setTime(iTime14);
    tp2.IP iP16 = null;
    boolean b17 = server1.removeBan(iP16);
    // The following exception was thrown during execution in test generation
    try {
      server1.update();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Server [lastUpdate=250000, exceptions=(), bans={}]"+ "'", str7.equals("Server [lastUpdate=250000, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long8 == 250000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long10 == 250000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);

  }

  @Test
  public void test267() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test267"); }


    tp2.Server server1 = new tp2.Server(1);
    tp2.IP iP2 = null;
    boolean b3 = server1.removeException(iP2);
    java.lang.String str4 = server1.toString();
    tp2.IP iP5 = null;
    boolean b6 = server1.connect(iP5);
    java.lang.String str7 = server1.toString();
    server1.update();
    long long9 = server1.getLastUpdate();
    java.lang.String str10 = server1.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Server [lastUpdate=null, exceptions=(), bans={}]"+ "'", str4.equals("Server [lastUpdate=null, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Server [lastUpdate=null, exceptions=(), bans={}]"+ "'", str7.equals("Server [lastUpdate=null, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long9 == 250000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Server [lastUpdate=250000, exceptions=(), bans={}]"+ "'", str10.equals("Server [lastUpdate=250000, exceptions=(), bans={}]"));

  }

  @Test
  public void test268() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test268"); }


    tp2.Server server0 = new tp2.Server();
    server0.update();
    tp2.IP iP2 = null;
    boolean b3 = server0.removeBan(iP2);
    tp2.IP iP4 = null;
    boolean b5 = server0.removeBan(iP4);
    java.lang.String str6 = server0.toString();
    long long7 = server0.getLastUpdate();
    boolean b8 = server0.repOK();
    long long9 = server0.getLastUpdate();
    java.lang.String str10 = server0.toString();
    long long11 = server0.getLastUpdate();
    tp2.IP iP12 = null;
    boolean b13 = server0.removeException(iP12);
    tp2.IP iP14 = null;
    boolean b15 = server0.addBan(iP14);
    long long16 = server0.getLastUpdate();
    tp2.IP iP17 = null;
    // The following exception was thrown during execution in test generation
    try {
      boolean b18 = server0.connect(iP17);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Server [lastUpdate=1465347898396, exceptions=(), bans={}]"+ "'", str6.equals("Server [lastUpdate=1465347898396, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long7 == 1465347898396L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long9 == 1465347898396L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Server [lastUpdate=1465347898396, exceptions=(), bans={}]"+ "'", str10.equals("Server [lastUpdate=1465347898396, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long11 == 1465347898396L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long16 == 1465347898396L);

  }

  @Test
  public void test269() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test269"); }


    tp2.Server server1 = new tp2.Server(1);
    tp2.IP iP2 = null;
    boolean b3 = server1.removeBan(iP2);
    tp2.ITime iTime4 = null;
    server1.setTime(iTime4);
    tp2.IP iP6 = null;
    boolean b7 = server1.removeBan(iP6);
    tp2.ITime iTime8 = null;
    server1.setTime(iTime8);
    tp2.ITime iTime10 = null;
    server1.setTime(iTime10);
    tp2.ITime iTime12 = null;
    server1.setTime(iTime12);
    tp2.ITime iTime14 = null;
    server1.setTime(iTime14);
    tp2.ITime iTime16 = null;
    server1.setTime(iTime16);
    tp2.IP iP18 = null;
    boolean b19 = server1.connect(iP18);
    // The following exception was thrown during execution in test generation
    try {
      long long20 = server1.getLastUpdate();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);

  }

  @Test
  public void test270() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test270"); }


    tp2.Server server1 = new tp2.Server(0);
    tp2.IP iP2 = null;
    boolean b3 = server1.removeException(iP2);
    tp2.ITime iTime4 = null;
    server1.setTime(iTime4);
    tp2.IP iP6 = null;
    boolean b7 = server1.removeBan(iP6);
    java.lang.String str8 = server1.toString();
    tp2.IP iP9 = null;
    boolean b10 = server1.removeBan(iP9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Server [lastUpdate=null, exceptions=(), bans={}]"+ "'", str8.equals("Server [lastUpdate=null, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);

  }

  @Test
  public void test271() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test271"); }


    tp2.Server server1 = new tp2.Server(1);
    tp2.IP iP2 = null;
    boolean b3 = server1.removeBan(iP2);
    server1.update();
    tp2.IP iP5 = null;
    boolean b6 = server1.removeBan(iP5);
    tp2.IP iP7 = null;
    boolean b8 = server1.removeException(iP7);
    java.lang.String str9 = server1.toString();
    java.lang.String str10 = server1.toString();
    tp2.ITime iTime11 = null;
    server1.setTime(iTime11);
    boolean b13 = server1.repOK();
    java.lang.String str14 = server1.toString();
    boolean b15 = server1.repOK();
    // The following exception was thrown during execution in test generation
    try {
      server1.update();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Server [lastUpdate=250000, exceptions=(), bans={}]"+ "'", str9.equals("Server [lastUpdate=250000, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Server [lastUpdate=250000, exceptions=(), bans={}]"+ "'", str10.equals("Server [lastUpdate=250000, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "Server [lastUpdate=250000, exceptions=(), bans={}]"+ "'", str14.equals("Server [lastUpdate=250000, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);

  }

  @Test
  public void test272() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test272"); }


    tp2.Server server1 = new tp2.Server(1);
    tp2.IP iP2 = null;
    boolean b3 = server1.removeBan(iP2);
    server1.update();
    tp2.IP iP5 = null;
    boolean b6 = server1.removeBan(iP5);
    java.lang.String str7 = server1.toString();
    server1.update();
    tp2.IP iP9 = null;
    // The following exception was thrown during execution in test generation
    try {
      boolean b10 = server1.addException(iP9);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Server [lastUpdate=250000, exceptions=(), bans={}]"+ "'", str7.equals("Server [lastUpdate=250000, exceptions=(), bans={}]"));

  }

  @Test
  public void test273() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test273"); }


    tp2.Server server1 = new tp2.Server(1);
    tp2.IP iP2 = null;
    boolean b3 = server1.removeBan(iP2);
    tp2.ITime iTime4 = null;
    server1.setTime(iTime4);
    tp2.IP iP6 = null;
    boolean b7 = server1.removeBan(iP6);
    java.lang.String str8 = server1.toString();
    tp2.IP iP9 = null;
    boolean b10 = server1.removeException(iP9);
    tp2.IP iP11 = null;
    boolean b12 = server1.removeBan(iP11);
    tp2.IP iP13 = null;
    boolean b14 = server1.connect(iP13);
    java.lang.String str15 = server1.toString();
    tp2.IP iP16 = null;
    // The following exception was thrown during execution in test generation
    try {
      boolean b17 = server1.addException(iP16);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Server [lastUpdate=null, exceptions=(), bans={}]"+ "'", str8.equals("Server [lastUpdate=null, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "Server [lastUpdate=null, exceptions=(), bans={}]"+ "'", str15.equals("Server [lastUpdate=null, exceptions=(), bans={}]"));

  }

  @Test
  public void test274() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test274"); }


    tp2.Server server0 = new tp2.Server();
    server0.update();
    tp2.IP iP2 = null;
    boolean b3 = server0.removeBan(iP2);
    server0.update();
    java.lang.String str5 = server0.toString();
    tp2.IP iP6 = null;
    boolean b7 = server0.removeException(iP6);
    boolean b8 = server0.repOK();
    tp2.IP iP9 = null;
    boolean b10 = server0.removeBan(iP9);
    tp2.IP iP11 = null;
    boolean b12 = server0.removeException(iP11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Server [lastUpdate=1465347898412, exceptions=(), bans={}]"+ "'", str5.equals("Server [lastUpdate=1465347898412, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);

  }

  @Test
  public void test275() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test275"); }


    tp2.Server server1 = new tp2.Server(1);
    tp2.IP iP2 = null;
    boolean b3 = server1.removeBan(iP2);
    server1.update();
    java.lang.String str5 = server1.toString();
    tp2.IP iP6 = null;
    boolean b7 = server1.removeBan(iP6);
    tp2.IP iP8 = null;
    boolean b9 = server1.addBan(iP8);
    tp2.IP iP10 = null;
    // The following exception was thrown during execution in test generation
    try {
      boolean b11 = server1.removeBan(iP10);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Server [lastUpdate=250000, exceptions=(), bans={}]"+ "'", str5.equals("Server [lastUpdate=250000, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);

  }

  @Test
  public void test276() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test276"); }


    tp2.Server server1 = new tp2.Server(1);
    tp2.IP iP2 = null;
    boolean b3 = server1.removeException(iP2);
    java.lang.String str4 = server1.toString();
    tp2.IP iP5 = null;
    boolean b6 = server1.connect(iP5);
    java.lang.String str7 = server1.toString();
    java.lang.String str8 = server1.toString();
    java.lang.String str9 = server1.toString();
    server1.update();
    tp2.IP iP11 = null;
    boolean b12 = server1.removeBan(iP11);
    tp2.IP iP13 = null;
    boolean b14 = server1.connect(iP13);
    boolean b15 = server1.repOK();
    java.lang.String str16 = server1.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Server [lastUpdate=null, exceptions=(), bans={}]"+ "'", str4.equals("Server [lastUpdate=null, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Server [lastUpdate=null, exceptions=(), bans={}]"+ "'", str7.equals("Server [lastUpdate=null, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Server [lastUpdate=null, exceptions=(), bans={}]"+ "'", str8.equals("Server [lastUpdate=null, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Server [lastUpdate=null, exceptions=(), bans={}]"+ "'", str9.equals("Server [lastUpdate=null, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "Server [lastUpdate=250000, exceptions=(), bans={}]"+ "'", str16.equals("Server [lastUpdate=250000, exceptions=(), bans={}]"));

  }

  @Test
  public void test277() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test277"); }


    tp2.Server server1 = new tp2.Server(1);
    tp2.IP iP2 = null;
    boolean b3 = server1.removeBan(iP2);
    server1.update();
    tp2.IP iP5 = null;
    boolean b6 = server1.removeBan(iP5);
    long long7 = server1.getLastUpdate();
    server1.update();
    boolean b9 = server1.repOK();
    boolean b10 = server1.repOK();
    java.lang.String str11 = server1.toString();
    boolean b12 = server1.repOK();
    tp2.IP iP13 = null;
    boolean b14 = server1.addBan(iP13);
    server1.update();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long7 == 250000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Server [lastUpdate=250000, exceptions=(), bans={}]"+ "'", str11.equals("Server [lastUpdate=250000, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);

  }

  @Test
  public void test278() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test278"); }


    tp2.Server server1 = new tp2.Server(1);
    tp2.IP iP2 = null;
    boolean b3 = server1.removeBan(iP2);
    server1.update();
    java.lang.String str5 = server1.toString();
    tp2.IP iP6 = null;
    boolean b7 = server1.removeBan(iP6);
    tp2.IP iP8 = null;
    boolean b9 = server1.removeBan(iP8);
    tp2.ITime iTime10 = null;
    server1.setTime(iTime10);
    long long12 = server1.getLastUpdate();
    boolean b13 = server1.repOK();
    tp2.ITime iTime14 = null;
    server1.setTime(iTime14);
    tp2.IP iP16 = null;
    // The following exception was thrown during execution in test generation
    try {
      boolean b17 = server1.addBan(iP16);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Server [lastUpdate=250000, exceptions=(), bans={}]"+ "'", str5.equals("Server [lastUpdate=250000, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long12 == 250000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);

  }

  @Test
  public void test279() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test279"); }


    tp2.Server server1 = new tp2.Server(1);
    tp2.IP iP2 = null;
    boolean b3 = server1.removeBan(iP2);
    server1.update();
    tp2.IP iP5 = null;
    boolean b6 = server1.removeBan(iP5);
    tp2.IP iP7 = null;
    boolean b8 = server1.removeException(iP7);
    java.lang.String str9 = server1.toString();
    tp2.IP iP10 = null;
    boolean b11 = server1.connect(iP10);
    tp2.ITime iTime12 = null;
    server1.setTime(iTime12);
    // The following exception was thrown during execution in test generation
    try {
      server1.update();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Server [lastUpdate=250000, exceptions=(), bans={}]"+ "'", str9.equals("Server [lastUpdate=250000, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);

  }

  @Test
  public void test280() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test280"); }


    tp2.Server server1 = new tp2.Server(1);
    tp2.IP iP2 = null;
    boolean b3 = server1.removeBan(iP2);
    server1.update();
    tp2.IP iP5 = null;
    boolean b6 = server1.removeBan(iP5);
    tp2.IP iP7 = null;
    boolean b8 = server1.removeBan(iP7);
    tp2.IP iP9 = null;
    boolean b10 = server1.removeException(iP9);
    boolean b11 = server1.repOK();
    boolean b12 = server1.repOK();
    tp2.ITime iTime13 = null;
    server1.setTime(iTime13);
    boolean b15 = server1.repOK();
    tp2.IP iP16 = null;
    boolean b17 = server1.removeException(iP16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);

  }

  @Test
  public void test281() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test281"); }


    tp2.Server server0 = new tp2.Server();
    boolean b1 = server0.repOK();
    tp2.ITime iTime2 = null;
    server0.setTime(iTime2);
    boolean b4 = server0.repOK();
    java.lang.String str5 = server0.toString();
    tp2.ITime iTime6 = null;
    server0.setTime(iTime6);
    tp2.IP iP8 = null;
    boolean b9 = server0.connect(iP8);
    tp2.IP iP10 = null;
    boolean b11 = server0.connect(iP10);
    tp2.IP iP12 = null;
    // The following exception was thrown during execution in test generation
    try {
      boolean b13 = server0.addException(iP12);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Server [lastUpdate=null, exceptions=(), bans={}]"+ "'", str5.equals("Server [lastUpdate=null, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);

  }

  @Test
  public void test282() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test282"); }


    tp2.Server server1 = new tp2.Server(1);
    tp2.IP iP2 = null;
    boolean b3 = server1.removeBan(iP2);
    server1.update();
    tp2.IP iP5 = null;
    boolean b6 = server1.removeBan(iP5);
    long long7 = server1.getLastUpdate();
    server1.update();
    long long9 = server1.getLastUpdate();
    tp2.IP iP10 = null;
    // The following exception was thrown during execution in test generation
    try {
      boolean b11 = server1.addException(iP10);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long7 == 250000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long9 == 250000L);

  }

  @Test
  public void test283() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test283"); }


    tp2.Server server1 = new tp2.Server(1);
    tp2.IP iP2 = null;
    boolean b3 = server1.removeBan(iP2);
    server1.update();
    long long5 = server1.getLastUpdate();
    tp2.IP iP6 = null;
    boolean b7 = server1.connect(iP6);
    boolean b8 = server1.repOK();
    tp2.IP iP9 = null;
    boolean b10 = server1.removeBan(iP9);
    long long11 = server1.getLastUpdate();
    tp2.IP iP12 = null;
    boolean b13 = server1.connect(iP12);
    tp2.IP iP14 = null;
    // The following exception was thrown during execution in test generation
    try {
      boolean b15 = server1.addException(iP14);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long5 == 250000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long11 == 250000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);

  }

  @Test
  public void test284() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test284"); }


    tp2.Server server0 = new tp2.Server();
    boolean b1 = server0.repOK();
    tp2.ITime iTime2 = null;
    server0.setTime(iTime2);
    boolean b4 = server0.repOK();
    tp2.IP iP5 = null;
    boolean b6 = server0.removeBan(iP5);
    // The following exception was thrown during execution in test generation
    try {
      long long7 = server0.getLastUpdate();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);

  }

  @Test
  public void test285() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test285"); }


    tp2.Server server1 = new tp2.Server(1);
    tp2.IP iP2 = null;
    boolean b3 = server1.removeBan(iP2);
    server1.update();
    tp2.IP iP5 = null;
    boolean b6 = server1.removeBan(iP5);
    tp2.IP iP7 = null;
    boolean b8 = server1.removeException(iP7);
    server1.update();
    tp2.IP iP10 = null;
    boolean b11 = server1.addBan(iP10);
    tp2.IP iP12 = null;
    // The following exception was thrown during execution in test generation
    try {
      boolean b13 = server1.connect(iP12);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);

  }

  @Test
  public void test286() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test286"); }


    tp2.Server server0 = new tp2.Server();
    server0.update();
    tp2.IP iP2 = null;
    boolean b3 = server0.removeBan(iP2);
    tp2.ITime iTime4 = null;
    server0.setTime(iTime4);
    tp2.IP iP6 = null;
    boolean b7 = server0.connect(iP6);
    tp2.IP iP8 = null;
    boolean b9 = server0.connect(iP8);
    tp2.IP iP10 = null;
    boolean b11 = server0.removeBan(iP10);
    tp2.IP iP12 = null;
    boolean b13 = server0.removeBan(iP12);
    tp2.IP iP14 = null;
    // The following exception was thrown during execution in test generation
    try {
      boolean b15 = server0.addBan(iP14);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);

  }

  @Test
  public void test287() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test287"); }


    tp2.Server server1 = new tp2.Server(1);
    tp2.IP iP2 = null;
    boolean b3 = server1.removeBan(iP2);
    tp2.ITime iTime4 = null;
    server1.setTime(iTime4);
    tp2.IP iP6 = null;
    boolean b7 = server1.removeBan(iP6);
    tp2.ITime iTime8 = null;
    server1.setTime(iTime8);
    java.lang.String str10 = server1.toString();
    boolean b11 = server1.repOK();
    tp2.IP iP12 = null;
    boolean b13 = server1.connect(iP12);
    java.lang.String str14 = server1.toString();
    tp2.ITime iTime15 = null;
    server1.setTime(iTime15);
    boolean b17 = server1.repOK();
    java.lang.String str18 = server1.toString();
    tp2.ITime iTime19 = null;
    server1.setTime(iTime19);
    tp2.IP iP21 = null;
    // The following exception was thrown during execution in test generation
    try {
      boolean b22 = server1.addBan(iP21);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Server [lastUpdate=null, exceptions=(), bans={}]"+ "'", str10.equals("Server [lastUpdate=null, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "Server [lastUpdate=null, exceptions=(), bans={}]"+ "'", str14.equals("Server [lastUpdate=null, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "Server [lastUpdate=null, exceptions=(), bans={}]"+ "'", str18.equals("Server [lastUpdate=null, exceptions=(), bans={}]"));

  }

  @Test
  public void test288() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test288"); }


    tp2.Server server0 = new tp2.Server();
    server0.update();
    tp2.IP iP2 = null;
    boolean b3 = server0.removeBan(iP2);
    server0.update();
    tp2.ITime iTime5 = null;
    server0.setTime(iTime5);
    tp2.IP iP7 = null;
    boolean b8 = server0.connect(iP7);
    tp2.ITime iTime9 = null;
    server0.setTime(iTime9);
    tp2.IP iP11 = null;
    // The following exception was thrown during execution in test generation
    try {
      boolean b12 = server0.addBan(iP11);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);

  }

  @Test
  public void test289() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test289"); }


    tp2.Server server1 = new tp2.Server((-1));
    server1.update();
    boolean b3 = server1.repOK();
    boolean b4 = server1.repOK();
    java.lang.String str5 = server1.toString();
    server1.update();
    boolean b7 = server1.repOK();
    tp2.IP iP8 = null;
    boolean b9 = server1.addBan(iP8);
    tp2.IP iP10 = null;
    boolean b11 = server1.removeException(iP10);
    tp2.IP iP12 = null;
    // The following exception was thrown during execution in test generation
    try {
      boolean b13 = server1.addException(iP12);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Server [lastUpdate=250000, exceptions=(), bans={}]"+ "'", str5.equals("Server [lastUpdate=250000, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);

  }

  @Test
  public void test290() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test290"); }


    tp2.Server server1 = new tp2.Server(1);
    tp2.IP iP2 = null;
    boolean b3 = server1.removeBan(iP2);
    tp2.ITime iTime4 = null;
    server1.setTime(iTime4);
    tp2.IP iP6 = null;
    boolean b7 = server1.removeBan(iP6);
    tp2.ITime iTime8 = null;
    server1.setTime(iTime8);
    java.lang.String str10 = server1.toString();
    boolean b11 = server1.repOK();
    tp2.IP iP12 = null;
    boolean b13 = server1.connect(iP12);
    boolean b14 = server1.repOK();
    tp2.ITime iTime15 = null;
    server1.setTime(iTime15);
    tp2.ITime iTime17 = null;
    server1.setTime(iTime17);
    tp2.IP iP19 = null;
    // The following exception was thrown during execution in test generation
    try {
      boolean b20 = server1.addException(iP19);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Server [lastUpdate=null, exceptions=(), bans={}]"+ "'", str10.equals("Server [lastUpdate=null, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);

  }

  @Test
  public void test291() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test291"); }


    tp2.Server server0 = new tp2.Server();
    server0.update();
    tp2.IP iP2 = null;
    boolean b3 = server0.removeBan(iP2);
    server0.update();
    tp2.IP iP5 = null;
    boolean b6 = server0.addBan(iP5);
    boolean b7 = server0.repOK();
    java.lang.String str8 = server0.toString();
    boolean b9 = server0.repOK();
    boolean b10 = server0.repOK();
    tp2.IP iP11 = null;
    // The following exception was thrown during execution in test generation
    try {
      boolean b12 = server0.connect(iP11);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Server [lastUpdate=1465347898449, exceptions=(), bans={[IPBan [ip=null, expires=1465347958449]]}]"+ "'", str8.equals("Server [lastUpdate=1465347898449, exceptions=(), bans={[IPBan [ip=null, expires=1465347958449]]}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);

  }

  @Test
  public void test292() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test292"); }


    tp2.Server server0 = new tp2.Server();
    server0.update();
    boolean b2 = server0.repOK();
    tp2.IP iP3 = null;
    boolean b4 = server0.connect(iP3);
    java.lang.String str5 = server0.toString();
    tp2.ITime iTime6 = null;
    server0.setTime(iTime6);
    tp2.IP iP8 = null;
    boolean b9 = server0.connect(iP8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Server [lastUpdate=1465347898451, exceptions=(), bans={}]"+ "'", str5.equals("Server [lastUpdate=1465347898451, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);

  }

  @Test
  public void test293() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test293"); }


    tp2.Server server1 = new tp2.Server(1);
    tp2.IP iP2 = null;
    boolean b3 = server1.removeBan(iP2);
    server1.update();
    java.lang.String str5 = server1.toString();
    tp2.IP iP6 = null;
    boolean b7 = server1.removeBan(iP6);
    java.lang.String str8 = server1.toString();
    tp2.ITime iTime9 = null;
    server1.setTime(iTime9);
    java.lang.String str11 = server1.toString();
    java.lang.String str12 = server1.toString();
    long long13 = server1.getLastUpdate();
    long long14 = server1.getLastUpdate();
    tp2.ITime iTime15 = null;
    server1.setTime(iTime15);
    tp2.IP iP17 = null;
    boolean b18 = server1.connect(iP17);
    tp2.ITime iTime19 = null;
    server1.setTime(iTime19);
    long long21 = server1.getLastUpdate();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Server [lastUpdate=250000, exceptions=(), bans={}]"+ "'", str5.equals("Server [lastUpdate=250000, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Server [lastUpdate=250000, exceptions=(), bans={}]"+ "'", str8.equals("Server [lastUpdate=250000, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Server [lastUpdate=250000, exceptions=(), bans={}]"+ "'", str11.equals("Server [lastUpdate=250000, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Server [lastUpdate=250000, exceptions=(), bans={}]"+ "'", str12.equals("Server [lastUpdate=250000, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long13 == 250000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long14 == 250000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long21 == 250000L);

  }

  @Test
  public void test294() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test294"); }


    tp2.Server server1 = new tp2.Server((-1));
    server1.update();
    boolean b3 = server1.repOK();
    java.lang.String str4 = server1.toString();
    boolean b5 = server1.repOK();
    tp2.IP iP6 = null;
    boolean b7 = server1.connect(iP6);
    tp2.IP iP8 = null;
    // The following exception was thrown during execution in test generation
    try {
      boolean b9 = server1.addException(iP8);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Server [lastUpdate=250000, exceptions=(), bans={}]"+ "'", str4.equals("Server [lastUpdate=250000, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);

  }

  @Test
  public void test295() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test295"); }


    tp2.Server server1 = new tp2.Server(1);
    tp2.IP iP2 = null;
    boolean b3 = server1.removeBan(iP2);
    tp2.ITime iTime4 = null;
    server1.setTime(iTime4);
    tp2.IP iP6 = null;
    boolean b7 = server1.removeBan(iP6);
    tp2.ITime iTime8 = null;
    server1.setTime(iTime8);
    java.lang.String str10 = server1.toString();
    boolean b11 = server1.repOK();
    tp2.IP iP12 = null;
    boolean b13 = server1.connect(iP12);
    boolean b14 = server1.repOK();
    tp2.ITime iTime15 = null;
    server1.setTime(iTime15);
    tp2.ITime iTime17 = null;
    server1.setTime(iTime17);
    java.lang.String str19 = server1.toString();
    tp2.IP iP20 = null;
    boolean b21 = server1.removeBan(iP20);
    java.lang.String str22 = server1.toString();
    tp2.IP iP23 = null;
    boolean b24 = server1.removeException(iP23);
    // The following exception was thrown during execution in test generation
    try {
      long long25 = server1.getLastUpdate();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Server [lastUpdate=null, exceptions=(), bans={}]"+ "'", str10.equals("Server [lastUpdate=null, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "Server [lastUpdate=null, exceptions=(), bans={}]"+ "'", str19.equals("Server [lastUpdate=null, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + "Server [lastUpdate=null, exceptions=(), bans={}]"+ "'", str22.equals("Server [lastUpdate=null, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);

  }

  @Test
  public void test296() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test296"); }


    tp2.Server server1 = new tp2.Server(1);
    tp2.IP iP2 = null;
    boolean b3 = server1.removeBan(iP2);
    server1.update();
    long long5 = server1.getLastUpdate();
    tp2.IP iP6 = null;
    boolean b7 = server1.addBan(iP6);
    server1.update();
    boolean b9 = server1.repOK();
    tp2.IP iP10 = null;
    boolean b11 = server1.removeException(iP10);
    tp2.IP iP12 = null;
    // The following exception was thrown during execution in test generation
    try {
      boolean b13 = server1.addBan(iP12);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long5 == 250000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);

  }

  @Test
  public void test297() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test297"); }


    tp2.Server server1 = new tp2.Server(1);
    tp2.IP iP2 = null;
    boolean b3 = server1.removeBan(iP2);
    server1.update();
    long long5 = server1.getLastUpdate();
    tp2.IP iP6 = null;
    boolean b7 = server1.connect(iP6);
    java.lang.String str8 = server1.toString();
    tp2.IP iP9 = null;
    boolean b10 = server1.removeBan(iP9);
    tp2.IP iP11 = null;
    boolean b12 = server1.removeException(iP11);
    tp2.IP iP13 = null;
    boolean b14 = server1.removeException(iP13);
    tp2.IP iP15 = null;
    boolean b16 = server1.removeException(iP15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long5 == 250000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Server [lastUpdate=250000, exceptions=(), bans={}]"+ "'", str8.equals("Server [lastUpdate=250000, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);

  }

  @Test
  public void test298() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test298"); }


    tp2.Server server0 = new tp2.Server();
    server0.update();
    tp2.IP iP2 = null;
    boolean b3 = server0.removeBan(iP2);
    server0.update();
    java.lang.String str5 = server0.toString();
    long long6 = server0.getLastUpdate();
    boolean b7 = server0.repOK();
    long long8 = server0.getLastUpdate();
    tp2.IP iP9 = null;
    boolean b10 = server0.connect(iP9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Server [lastUpdate=1465347898462, exceptions=(), bans={}]"+ "'", str5.equals("Server [lastUpdate=1465347898462, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long6 == 1465347898462L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long8 == 1465347898462L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);

  }

  @Test
  public void test299() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test299"); }


    tp2.Server server1 = new tp2.Server(1);
    tp2.IP iP2 = null;
    boolean b3 = server1.removeException(iP2);
    java.lang.String str4 = server1.toString();
    tp2.IP iP5 = null;
    boolean b6 = server1.connect(iP5);
    java.lang.String str7 = server1.toString();
    java.lang.String str8 = server1.toString();
    java.lang.String str9 = server1.toString();
    java.lang.String str10 = server1.toString();
    tp2.IP iP11 = null;
    boolean b12 = server1.connect(iP11);
    tp2.IP iP13 = null;
    boolean b14 = server1.connect(iP13);
    tp2.IP iP15 = null;
    boolean b16 = server1.addBan(iP15);
    tp2.IP iP17 = null;
    // The following exception was thrown during execution in test generation
    try {
      boolean b18 = server1.removeBan(iP17);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Server [lastUpdate=null, exceptions=(), bans={}]"+ "'", str4.equals("Server [lastUpdate=null, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Server [lastUpdate=null, exceptions=(), bans={}]"+ "'", str7.equals("Server [lastUpdate=null, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Server [lastUpdate=null, exceptions=(), bans={}]"+ "'", str8.equals("Server [lastUpdate=null, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Server [lastUpdate=null, exceptions=(), bans={}]"+ "'", str9.equals("Server [lastUpdate=null, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Server [lastUpdate=null, exceptions=(), bans={}]"+ "'", str10.equals("Server [lastUpdate=null, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);

  }

  @Test
  public void test300() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test300"); }


    tp2.Server server1 = new tp2.Server((-1));
    server1.update();
    tp2.IP iP3 = null;
    boolean b4 = server1.removeException(iP3);
    tp2.ITime iTime5 = null;
    server1.setTime(iTime5);
    tp2.IP iP7 = null;
    boolean b8 = server1.removeBan(iP7);
    long long9 = server1.getLastUpdate();
    long long10 = server1.getLastUpdate();
    tp2.IP iP11 = null;
    // The following exception was thrown during execution in test generation
    try {
      boolean b12 = server1.addException(iP11);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long9 == 250000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long10 == 250000L);

  }

  @Test
  public void test301() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test301"); }


    tp2.Server server1 = new tp2.Server((-1));
    server1.update();
    server1.update();
    tp2.IP iP4 = null;
    boolean b5 = server1.removeException(iP4);
    boolean b6 = server1.repOK();
    server1.update();
    tp2.IP iP8 = null;
    boolean b9 = server1.removeException(iP8);
    tp2.ITime iTime10 = null;
    server1.setTime(iTime10);
    tp2.IP iP12 = null;
    boolean b13 = server1.removeBan(iP12);
    java.lang.String str14 = server1.toString();
    boolean b15 = server1.repOK();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "Server [lastUpdate=250000, exceptions=(), bans={}]"+ "'", str14.equals("Server [lastUpdate=250000, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);

  }

  @Test
  public void test302() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test302"); }


    tp2.Server server1 = new tp2.Server(1);
    tp2.IP iP2 = null;
    boolean b3 = server1.removeBan(iP2);
    server1.update();
    tp2.IP iP5 = null;
    boolean b6 = server1.removeBan(iP5);
    tp2.IP iP7 = null;
    boolean b8 = server1.connect(iP7);
    server1.update();
    tp2.IP iP10 = null;
    boolean b11 = server1.removeException(iP10);
    server1.update();
    tp2.IP iP13 = null;
    boolean b14 = server1.removeException(iP13);
    java.lang.String str15 = server1.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "Server [lastUpdate=250000, exceptions=(), bans={}]"+ "'", str15.equals("Server [lastUpdate=250000, exceptions=(), bans={}]"));

  }

  @Test
  public void test303() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test303"); }


    tp2.Server server0 = new tp2.Server();
    tp2.IP iP1 = null;
    boolean b2 = server0.removeException(iP1);
    server0.update();
    long long4 = server0.getLastUpdate();
    server0.update();
    tp2.IP iP6 = null;
    boolean b7 = server0.removeException(iP6);
    tp2.ITime iTime8 = null;
    server0.setTime(iTime8);
    tp2.IP iP10 = null;
    boolean b11 = server0.removeBan(iP10);
    tp2.IP iP12 = null;
    boolean b13 = server0.connect(iP12);
    tp2.IP iP14 = null;
    // The following exception was thrown during execution in test generation
    try {
      boolean b15 = server0.addException(iP14);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long4 == 1465347898473L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);

  }

  @Test
  public void test304() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test304"); }


    tp2.Server server1 = new tp2.Server(1);
    tp2.IP iP2 = null;
    boolean b3 = server1.removeBan(iP2);
    server1.update();
    java.lang.String str5 = server1.toString();
    tp2.IP iP6 = null;
    boolean b7 = server1.removeBan(iP6);
    java.lang.String str8 = server1.toString();
    tp2.IP iP9 = null;
    boolean b10 = server1.removeException(iP9);
    boolean b11 = server1.repOK();
    boolean b12 = server1.repOK();
    tp2.IP iP13 = null;
    boolean b14 = server1.connect(iP13);
    tp2.ITime iTime15 = null;
    server1.setTime(iTime15);
    long long17 = server1.getLastUpdate();
    tp2.IP iP18 = null;
    boolean b19 = server1.removeBan(iP18);
    // The following exception was thrown during execution in test generation
    try {
      server1.update();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Server [lastUpdate=250000, exceptions=(), bans={}]"+ "'", str5.equals("Server [lastUpdate=250000, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Server [lastUpdate=250000, exceptions=(), bans={}]"+ "'", str8.equals("Server [lastUpdate=250000, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long17 == 250000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);

  }

  @Test
  public void test305() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test305"); }


    tp2.Server server1 = new tp2.Server(1);
    tp2.IP iP2 = null;
    boolean b3 = server1.removeBan(iP2);
    server1.update();
    tp2.IP iP5 = null;
    boolean b6 = server1.removeBan(iP5);
    java.lang.String str7 = server1.toString();
    long long8 = server1.getLastUpdate();
    tp2.ITime iTime9 = null;
    server1.setTime(iTime9);
    tp2.ITime iTime11 = null;
    server1.setTime(iTime11);
    long long13 = server1.getLastUpdate();
    tp2.IP iP14 = null;
    // The following exception was thrown during execution in test generation
    try {
      boolean b15 = server1.addException(iP14);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Server [lastUpdate=250000, exceptions=(), bans={}]"+ "'", str7.equals("Server [lastUpdate=250000, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long8 == 250000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long13 == 250000L);

  }

  @Test
  public void test306() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test306"); }


    tp2.Server server1 = new tp2.Server(1);
    tp2.IP iP2 = null;
    boolean b3 = server1.removeBan(iP2);
    server1.update();
    tp2.IP iP5 = null;
    boolean b6 = server1.removeBan(iP5);
    tp2.IP iP7 = null;
    boolean b8 = server1.addBan(iP7);
    server1.update();
    boolean b10 = server1.repOK();
    tp2.IP iP11 = null;
    // The following exception was thrown during execution in test generation
    try {
      boolean b12 = server1.addBan(iP11);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);

  }

  @Test
  public void test307() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test307"); }


    tp2.Server server0 = new tp2.Server();
    server0.update();
    tp2.IP iP2 = null;
    boolean b3 = server0.removeBan(iP2);
    server0.update();
    tp2.IP iP5 = null;
    boolean b6 = server0.addBan(iP5);
    boolean b7 = server0.repOK();
    server0.update();
    java.lang.String str9 = server0.toString();
    tp2.IP iP10 = null;
    // The following exception was thrown during execution in test generation
    try {
      boolean b11 = server0.addBan(iP10);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Server [lastUpdate=1465347898478, exceptions=(), bans={[IPBan [ip=null, expires=1465347958478]]}]"+ "'", str9.equals("Server [lastUpdate=1465347898478, exceptions=(), bans={[IPBan [ip=null, expires=1465347958478]]}]"));

  }

  @Test
  public void test308() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test308"); }


    tp2.Server server1 = new tp2.Server(1);
    tp2.IP iP2 = null;
    boolean b3 = server1.removeBan(iP2);
    server1.update();
    long long5 = server1.getLastUpdate();
    tp2.IP iP6 = null;
    boolean b7 = server1.addBan(iP6);
    boolean b8 = server1.repOK();
    boolean b9 = server1.repOK();
    tp2.ITime iTime10 = null;
    server1.setTime(iTime10);
    boolean b12 = server1.repOK();
    tp2.IP iP13 = null;
    // The following exception was thrown during execution in test generation
    try {
      boolean b14 = server1.removeBan(iP13);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long5 == 250000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);

  }

  @Test
  public void test309() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test309"); }


    tp2.Server server0 = new tp2.Server();
    server0.update();
    tp2.IP iP2 = null;
    boolean b3 = server0.removeBan(iP2);
    tp2.IP iP4 = null;
    boolean b5 = server0.removeBan(iP4);
    java.lang.String str6 = server0.toString();
    tp2.ITime iTime7 = null;
    server0.setTime(iTime7);
    tp2.IP iP9 = null;
    boolean b10 = server0.connect(iP9);
    tp2.IP iP11 = null;
    boolean b12 = server0.removeException(iP11);
    boolean b13 = server0.repOK();
    tp2.ITime iTime14 = null;
    server0.setTime(iTime14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Server [lastUpdate=1465347898483, exceptions=(), bans={}]"+ "'", str6.equals("Server [lastUpdate=1465347898483, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);

  }

  @Test
  public void test310() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test310"); }


    tp2.Server server0 = new tp2.Server();
    tp2.IP iP1 = null;
    boolean b2 = server0.removeException(iP1);
    server0.update();
    long long4 = server0.getLastUpdate();
    tp2.IP iP5 = null;
    boolean b6 = server0.removeException(iP5);
    tp2.IP iP7 = null;
    boolean b8 = server0.removeBan(iP7);
    boolean b9 = server0.repOK();
    boolean b10 = server0.repOK();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long4 == 1465347898483L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);

  }

  @Test
  public void test311() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test311"); }


    tp2.Server server0 = new tp2.Server();
    server0.update();
    tp2.IP iP2 = null;
    boolean b3 = server0.removeBan(iP2);
    tp2.ITime iTime4 = null;
    server0.setTime(iTime4);
    tp2.IP iP6 = null;
    boolean b7 = server0.connect(iP6);
    boolean b8 = server0.repOK();
    tp2.ITime iTime9 = null;
    server0.setTime(iTime9);
    tp2.ITime iTime11 = null;
    server0.setTime(iTime11);
    tp2.IP iP13 = null;
    // The following exception was thrown during execution in test generation
    try {
      boolean b14 = server0.addException(iP13);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);

  }

  @Test
  public void test312() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test312"); }


    tp2.Server server1 = new tp2.Server(1);
    tp2.IP iP2 = null;
    boolean b3 = server1.removeBan(iP2);
    tp2.ITime iTime4 = null;
    server1.setTime(iTime4);
    tp2.ITime iTime6 = null;
    server1.setTime(iTime6);
    tp2.IP iP8 = null;
    boolean b9 = server1.removeBan(iP8);
    tp2.IP iP10 = null;
    boolean b11 = server1.removeException(iP10);
    tp2.IP iP12 = null;
    boolean b13 = server1.removeException(iP12);
    tp2.IP iP14 = null;
    // The following exception was thrown during execution in test generation
    try {
      boolean b15 = server1.addBan(iP14);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);

  }

  @Test
  public void test313() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test313"); }


    tp2.Server server1 = new tp2.Server(1);
    tp2.IP iP2 = null;
    boolean b3 = server1.removeBan(iP2);
    tp2.ITime iTime4 = null;
    server1.setTime(iTime4);
    tp2.IP iP6 = null;
    boolean b7 = server1.removeBan(iP6);
    tp2.ITime iTime8 = null;
    server1.setTime(iTime8);
    java.lang.String str10 = server1.toString();
    boolean b11 = server1.repOK();
    tp2.IP iP12 = null;
    boolean b13 = server1.connect(iP12);
    tp2.IP iP14 = null;
    boolean b15 = server1.connect(iP14);
    java.lang.String str16 = server1.toString();
    boolean b17 = server1.repOK();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Server [lastUpdate=null, exceptions=(), bans={}]"+ "'", str10.equals("Server [lastUpdate=null, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "Server [lastUpdate=null, exceptions=(), bans={}]"+ "'", str16.equals("Server [lastUpdate=null, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);

  }

  @Test
  public void test314() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test314"); }


    tp2.Server server1 = new tp2.Server((-1));
    server1.update();
    boolean b3 = server1.repOK();
    long long4 = server1.getLastUpdate();
    long long5 = server1.getLastUpdate();
    java.lang.String str6 = server1.toString();
    tp2.IP iP7 = null;
    boolean b8 = server1.connect(iP7);
    tp2.ITime iTime9 = null;
    server1.setTime(iTime9);
    // The following exception was thrown during execution in test generation
    try {
      server1.update();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long4 == 250000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long5 == 250000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Server [lastUpdate=250000, exceptions=(), bans={}]"+ "'", str6.equals("Server [lastUpdate=250000, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);

  }

  @Test
  public void test315() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test315"); }


    tp2.Server server0 = new tp2.Server();
    server0.update();
    tp2.IP iP2 = null;
    boolean b3 = server0.removeBan(iP2);
    server0.update();
    java.lang.String str5 = server0.toString();
    tp2.IP iP6 = null;
    boolean b7 = server0.removeException(iP6);
    boolean b8 = server0.repOK();
    tp2.ITime iTime9 = null;
    server0.setTime(iTime9);
    boolean b11 = server0.repOK();
    tp2.IP iP12 = null;
    // The following exception was thrown during execution in test generation
    try {
      boolean b13 = server0.addException(iP12);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Server [lastUpdate=1465347898490, exceptions=(), bans={}]"+ "'", str5.equals("Server [lastUpdate=1465347898490, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);

  }

  @Test
  public void test316() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test316"); }


    tp2.Server server0 = new tp2.Server();
    server0.update();
    tp2.IP iP2 = null;
    boolean b3 = server0.removeBan(iP2);
    server0.update();
    java.lang.String str5 = server0.toString();
    long long6 = server0.getLastUpdate();
    long long7 = server0.getLastUpdate();
    java.lang.String str8 = server0.toString();
    tp2.IP iP9 = null;
    boolean b10 = server0.addBan(iP9);
    tp2.IP iP11 = null;
    boolean b12 = server0.removeException(iP11);
    tp2.IP iP13 = null;
    boolean b14 = server0.removeException(iP13);
    long long15 = server0.getLastUpdate();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Server [lastUpdate=1465347898502, exceptions=(), bans={}]"+ "'", str5.equals("Server [lastUpdate=1465347898502, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long6 == 1465347898502L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long7 == 1465347898502L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Server [lastUpdate=1465347898502, exceptions=(), bans={}]"+ "'", str8.equals("Server [lastUpdate=1465347898502, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long15 == 1465347898502L);

  }

  @Test
  public void test317() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test317"); }


    tp2.Server server0 = new tp2.Server();
    server0.update();
    server0.update();
    java.lang.String str3 = server0.toString();
    tp2.ITime iTime4 = null;
    server0.setTime(iTime4);
    tp2.IP iP6 = null;
    // The following exception was thrown during execution in test generation
    try {
      boolean b7 = server0.addException(iP6);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Server [lastUpdate=1465347898503, exceptions=(), bans={}]"+ "'", str3.equals("Server [lastUpdate=1465347898503, exceptions=(), bans={}]"));

  }

  @Test
  public void test318() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test318"); }


    tp2.Server server0 = new tp2.Server();
    tp2.IP iP1 = null;
    boolean b2 = server0.removeException(iP1);
    server0.update();
    long long4 = server0.getLastUpdate();
    tp2.IP iP5 = null;
    boolean b6 = server0.removeBan(iP5);
    tp2.ITime iTime7 = null;
    server0.setTime(iTime7);
    boolean b9 = server0.repOK();
    tp2.IP iP10 = null;
    boolean b11 = server0.removeBan(iP10);
    tp2.IP iP12 = null;
    // The following exception was thrown during execution in test generation
    try {
      boolean b13 = server0.addException(iP12);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long4 == 1465347898508L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);

  }

  @Test
  public void test319() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test319"); }


    tp2.Server server1 = new tp2.Server((-1));
    server1.update();
    server1.update();
    tp2.ITime iTime4 = null;
    server1.setTime(iTime4);
    tp2.IP iP6 = null;
    boolean b7 = server1.removeException(iP6);
    tp2.IP iP8 = null;
    // The following exception was thrown during execution in test generation
    try {
      boolean b9 = server1.addBan(iP8);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);

  }

  @Test
  public void test320() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test320"); }


    tp2.Server server1 = new tp2.Server(1);
    tp2.IP iP2 = null;
    boolean b3 = server1.addBan(iP2);
    server1.update();
    tp2.ITime iTime5 = null;
    server1.setTime(iTime5);
    tp2.IP iP7 = null;
    boolean b8 = server1.removeException(iP7);
    tp2.IP iP9 = null;
    boolean b10 = server1.removeException(iP9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);

  }

  @Test
  public void test321() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test321"); }


    tp2.Server server0 = new tp2.Server();
    server0.update();
    server0.update();
    tp2.ITime iTime3 = null;
    server0.setTime(iTime3);
    tp2.IP iP5 = null;
    // The following exception was thrown during execution in test generation
    try {
      boolean b6 = server0.addBan(iP5);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test322() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test322"); }


    tp2.Server server1 = new tp2.Server(1);
    tp2.IP iP2 = null;
    boolean b3 = server1.removeBan(iP2);
    tp2.ITime iTime4 = null;
    server1.setTime(iTime4);
    tp2.IP iP6 = null;
    boolean b7 = server1.removeBan(iP6);
    java.lang.String str8 = server1.toString();
    tp2.ITime iTime9 = null;
    server1.setTime(iTime9);
    tp2.IP iP11 = null;
    boolean b12 = server1.removeBan(iP11);
    java.lang.String str13 = server1.toString();
    tp2.ITime iTime14 = null;
    server1.setTime(iTime14);
    tp2.IP iP16 = null;
    boolean b17 = server1.connect(iP16);
    tp2.IP iP18 = null;
    // The following exception was thrown during execution in test generation
    try {
      boolean b19 = server1.addBan(iP18);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Server [lastUpdate=null, exceptions=(), bans={}]"+ "'", str8.equals("Server [lastUpdate=null, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Server [lastUpdate=null, exceptions=(), bans={}]"+ "'", str13.equals("Server [lastUpdate=null, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);

  }

  @Test
  public void test323() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test323"); }


    tp2.Server server0 = new tp2.Server();
    server0.update();
    tp2.IP iP2 = null;
    boolean b3 = server0.removeException(iP2);
    tp2.IP iP4 = null;
    boolean b5 = server0.addBan(iP4);
    tp2.IP iP6 = null;
    // The following exception was thrown during execution in test generation
    try {
      boolean b7 = server0.removeBan(iP6);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);

  }

  @Test
  public void test324() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test324"); }


    tp2.Server server1 = new tp2.Server(1);
    tp2.IP iP2 = null;
    boolean b3 = server1.removeBan(iP2);
    tp2.ITime iTime4 = null;
    server1.setTime(iTime4);
    tp2.IP iP6 = null;
    boolean b7 = server1.removeBan(iP6);
    tp2.ITime iTime8 = null;
    server1.setTime(iTime8);
    tp2.ITime iTime10 = null;
    server1.setTime(iTime10);
    boolean b12 = server1.repOK();
    tp2.IP iP13 = null;
    boolean b14 = server1.connect(iP13);
    java.lang.String str15 = server1.toString();
    // The following exception was thrown during execution in test generation
    try {
      long long16 = server1.getLastUpdate();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "Server [lastUpdate=null, exceptions=(), bans={}]"+ "'", str15.equals("Server [lastUpdate=null, exceptions=(), bans={}]"));

  }

  @Test
  public void test325() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test325"); }


    tp2.Server server1 = new tp2.Server(1);
    tp2.IP iP2 = null;
    boolean b3 = server1.removeBan(iP2);
    tp2.ITime iTime4 = null;
    server1.setTime(iTime4);
    tp2.IP iP6 = null;
    boolean b7 = server1.removeBan(iP6);
    java.lang.String str8 = server1.toString();
    tp2.IP iP9 = null;
    boolean b10 = server1.removeException(iP9);
    boolean b11 = server1.repOK();
    java.lang.String str12 = server1.toString();
    tp2.IP iP13 = null;
    boolean b14 = server1.connect(iP13);
    tp2.ITime iTime15 = null;
    server1.setTime(iTime15);
    // The following exception was thrown during execution in test generation
    try {
      server1.update();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Server [lastUpdate=null, exceptions=(), bans={}]"+ "'", str8.equals("Server [lastUpdate=null, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Server [lastUpdate=null, exceptions=(), bans={}]"+ "'", str12.equals("Server [lastUpdate=null, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);

  }

  @Test
  public void test326() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test326"); }


    tp2.Server server1 = new tp2.Server(1);
    tp2.IP iP2 = null;
    boolean b3 = server1.removeBan(iP2);
    server1.update();
    tp2.IP iP5 = null;
    boolean b6 = server1.removeBan(iP5);
    tp2.IP iP7 = null;
    boolean b8 = server1.removeBan(iP7);
    tp2.IP iP9 = null;
    boolean b10 = server1.removeException(iP9);
    tp2.IP iP11 = null;
    boolean b12 = server1.removeException(iP11);
    tp2.IP iP13 = null;
    boolean b14 = server1.removeBan(iP13);
    tp2.IP iP15 = null;
    boolean b16 = server1.removeBan(iP15);
    tp2.IP iP17 = null;
    boolean b18 = server1.addBan(iP17);
    tp2.IP iP19 = null;
    // The following exception was thrown during execution in test generation
    try {
      boolean b20 = server1.removeBan(iP19);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);

  }

  @Test
  public void test327() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test327"); }


    tp2.Server server1 = new tp2.Server(1);
    tp2.IP iP2 = null;
    boolean b3 = server1.removeBan(iP2);
    tp2.ITime iTime4 = null;
    server1.setTime(iTime4);
    tp2.IP iP6 = null;
    boolean b7 = server1.removeBan(iP6);
    java.lang.String str8 = server1.toString();
    tp2.ITime iTime9 = null;
    server1.setTime(iTime9);
    tp2.IP iP11 = null;
    boolean b12 = server1.removeBan(iP11);
    tp2.IP iP13 = null;
    boolean b14 = server1.removeException(iP13);
    tp2.IP iP15 = null;
    boolean b16 = server1.connect(iP15);
    tp2.IP iP17 = null;
    boolean b18 = server1.connect(iP17);
    tp2.IP iP19 = null;
    boolean b20 = server1.removeException(iP19);
    tp2.IP iP21 = null;
    // The following exception was thrown during execution in test generation
    try {
      boolean b22 = server1.addException(iP21);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Server [lastUpdate=null, exceptions=(), bans={}]"+ "'", str8.equals("Server [lastUpdate=null, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);

  }

  @Test
  public void test328() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test328"); }


    tp2.Server server1 = new tp2.Server(1);
    tp2.IP iP2 = null;
    boolean b3 = server1.removeBan(iP2);
    server1.update();
    tp2.IP iP5 = null;
    boolean b6 = server1.removeBan(iP5);
    tp2.IP iP7 = null;
    boolean b8 = server1.removeBan(iP7);
    tp2.IP iP9 = null;
    boolean b10 = server1.removeException(iP9);
    boolean b11 = server1.repOK();
    tp2.IP iP12 = null;
    boolean b13 = server1.removeBan(iP12);
    tp2.ITime iTime14 = null;
    server1.setTime(iTime14);
    tp2.IP iP16 = null;
    boolean b17 = server1.removeBan(iP16);
    tp2.IP iP18 = null;
    // The following exception was thrown during execution in test generation
    try {
      boolean b19 = server1.addBan(iP18);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);

  }

  @Test
  public void test329() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test329"); }


    tp2.Server server0 = new tp2.Server();
    server0.update();
    tp2.IP iP2 = null;
    boolean b3 = server0.removeException(iP2);
    boolean b4 = server0.repOK();
    tp2.IP iP5 = null;
    boolean b6 = server0.connect(iP5);
    tp2.IP iP7 = null;
    boolean b8 = server0.removeBan(iP7);
    server0.update();
    server0.update();
    tp2.IP iP11 = null;
    boolean b12 = server0.removeBan(iP11);
    tp2.IP iP13 = null;
    // The following exception was thrown during execution in test generation
    try {
      boolean b14 = server0.addException(iP13);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);

  }

  @Test
  public void test330() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test330"); }


    tp2.Server server0 = new tp2.Server();
    tp2.IP iP1 = null;
    boolean b2 = server0.removeException(iP1);
    tp2.IP iP3 = null;
    boolean b4 = server0.connect(iP3);
    tp2.ITime iTime5 = null;
    server0.setTime(iTime5);
    tp2.IP iP7 = null;
    boolean b8 = server0.removeException(iP7);
    tp2.IP iP9 = null;
    boolean b10 = server0.connect(iP9);
    tp2.IP iP11 = null;
    // The following exception was thrown during execution in test generation
    try {
      boolean b12 = server0.addException(iP11);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);

  }

  @Test
  public void test331() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test331"); }


    tp2.Server server1 = new tp2.Server(1);
    tp2.IP iP2 = null;
    boolean b3 = server1.removeBan(iP2);
    server1.update();
    tp2.IP iP5 = null;
    boolean b6 = server1.removeBan(iP5);
    tp2.IP iP7 = null;
    boolean b8 = server1.removeException(iP7);
    boolean b9 = server1.repOK();
    server1.update();
    boolean b11 = server1.repOK();
    server1.update();
    boolean b13 = server1.repOK();
    tp2.IP iP14 = null;
    boolean b15 = server1.connect(iP14);
    tp2.IP iP16 = null;
    boolean b17 = server1.removeBan(iP16);
    tp2.ITime iTime18 = null;
    server1.setTime(iTime18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);

  }

  @Test
  public void test332() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test332"); }


    tp2.Server server1 = new tp2.Server(100);
    tp2.IP iP2 = null;
    boolean b3 = server1.connect(iP2);
    tp2.IP iP4 = null;
    boolean b5 = server1.removeException(iP4);
    tp2.ITime iTime6 = null;
    server1.setTime(iTime6);
    // The following exception was thrown during execution in test generation
    try {
      server1.update();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);

  }

  @Test
  public void test333() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test333"); }


    tp2.Server server0 = new tp2.Server();
    server0.update();
    tp2.IP iP2 = null;
    boolean b3 = server0.removeBan(iP2);
    server0.update();
    java.lang.String str5 = server0.toString();
    long long6 = server0.getLastUpdate();
    long long7 = server0.getLastUpdate();
    long long8 = server0.getLastUpdate();
    server0.update();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Server [lastUpdate=1465347898558, exceptions=(), bans={}]"+ "'", str5.equals("Server [lastUpdate=1465347898558, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long6 == 1465347898558L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long7 == 1465347898558L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long8 == 1465347898558L);

  }

  @Test
  public void test334() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test334"); }


    tp2.Server server0 = new tp2.Server();
    server0.update();
    tp2.IP iP2 = null;
    boolean b3 = server0.removeBan(iP2);
    tp2.ITime iTime4 = null;
    server0.setTime(iTime4);
    tp2.IP iP6 = null;
    boolean b7 = server0.connect(iP6);
    boolean b8 = server0.repOK();
    tp2.ITime iTime9 = null;
    server0.setTime(iTime9);
    tp2.IP iP11 = null;
    boolean b12 = server0.removeBan(iP11);
    boolean b13 = server0.repOK();
    boolean b14 = server0.repOK();
    tp2.ITime iTime15 = null;
    server0.setTime(iTime15);
    tp2.IP iP17 = null;
    // The following exception was thrown during execution in test generation
    try {
      boolean b18 = server0.addBan(iP17);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);

  }

  @Test
  public void test335() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test335"); }


    tp2.Server server0 = new tp2.Server();
    server0.update();
    boolean b2 = server0.repOK();
    tp2.IP iP3 = null;
    boolean b4 = server0.connect(iP3);
    tp2.IP iP5 = null;
    boolean b6 = server0.removeBan(iP5);
    boolean b7 = server0.repOK();
    tp2.IP iP8 = null;
    boolean b9 = server0.removeException(iP8);
    server0.update();
    long long11 = server0.getLastUpdate();
    java.lang.String str12 = server0.toString();
    java.lang.String str13 = server0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long11 == 1465347898570L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Server [lastUpdate=1465347898570, exceptions=(), bans={}]"+ "'", str12.equals("Server [lastUpdate=1465347898570, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Server [lastUpdate=1465347898570, exceptions=(), bans={}]"+ "'", str13.equals("Server [lastUpdate=1465347898570, exceptions=(), bans={}]"));

  }

  @Test
  public void test336() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test336"); }


    tp2.Server server1 = new tp2.Server(1);
    tp2.IP iP2 = null;
    boolean b3 = server1.removeBan(iP2);
    server1.update();
    tp2.IP iP5 = null;
    boolean b6 = server1.removeBan(iP5);
    tp2.IP iP7 = null;
    boolean b8 = server1.removeException(iP7);
    java.lang.String str9 = server1.toString();
    tp2.IP iP10 = null;
    boolean b11 = server1.addBan(iP10);
    boolean b12 = server1.repOK();
    tp2.IP iP13 = null;
    // The following exception was thrown during execution in test generation
    try {
      boolean b14 = server1.removeBan(iP13);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Server [lastUpdate=250000, exceptions=(), bans={}]"+ "'", str9.equals("Server [lastUpdate=250000, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);

  }

  @Test
  public void test337() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test337"); }


    tp2.Server server1 = new tp2.Server(1);
    tp2.IP iP2 = null;
    boolean b3 = server1.removeBan(iP2);
    server1.update();
    tp2.IP iP5 = null;
    boolean b6 = server1.removeBan(iP5);
    tp2.IP iP7 = null;
    boolean b8 = server1.removeBan(iP7);
    tp2.IP iP9 = null;
    boolean b10 = server1.removeException(iP9);
    tp2.IP iP11 = null;
    boolean b12 = server1.removeException(iP11);
    tp2.ITime iTime13 = null;
    server1.setTime(iTime13);
    tp2.IP iP15 = null;
    boolean b16 = server1.removeBan(iP15);
    java.lang.String str17 = server1.toString();
    java.lang.String str18 = server1.toString();
    // The following exception was thrown during execution in test generation
    try {
      server1.update();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "Server [lastUpdate=250000, exceptions=(), bans={}]"+ "'", str17.equals("Server [lastUpdate=250000, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "Server [lastUpdate=250000, exceptions=(), bans={}]"+ "'", str18.equals("Server [lastUpdate=250000, exceptions=(), bans={}]"));

  }

  @Test
  public void test338() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test338"); }


    tp2.Server server1 = new tp2.Server(1);
    tp2.IP iP2 = null;
    boolean b3 = server1.removeBan(iP2);
    server1.update();
    long long5 = server1.getLastUpdate();
    tp2.IP iP6 = null;
    boolean b7 = server1.connect(iP6);
    java.lang.String str8 = server1.toString();
    server1.update();
    tp2.IP iP10 = null;
    boolean b11 = server1.removeBan(iP10);
    boolean b12 = server1.repOK();
    tp2.IP iP13 = null;
    boolean b14 = server1.removeBan(iP13);
    tp2.IP iP15 = null;
    boolean b16 = server1.removeException(iP15);
    tp2.IP iP17 = null;
    boolean b18 = server1.connect(iP17);
    tp2.IP iP19 = null;
    // The following exception was thrown during execution in test generation
    try {
      boolean b20 = server1.addException(iP19);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long5 == 250000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Server [lastUpdate=250000, exceptions=(), bans={}]"+ "'", str8.equals("Server [lastUpdate=250000, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);

  }

  @Test
  public void test339() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test339"); }


    tp2.Server server0 = new tp2.Server();
    tp2.IP iP1 = null;
    boolean b2 = server0.removeException(iP1);
    tp2.IP iP3 = null;
    boolean b4 = server0.connect(iP3);
    tp2.ITime iTime5 = null;
    server0.setTime(iTime5);
    boolean b7 = server0.repOK();
    // The following exception was thrown during execution in test generation
    try {
      server0.update();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);

  }

  @Test
  public void test340() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test340"); }


    tp2.Server server1 = new tp2.Server(1);
    tp2.IP iP2 = null;
    boolean b3 = server1.removeBan(iP2);
    server1.update();
    tp2.IP iP5 = null;
    boolean b6 = server1.removeBan(iP5);
    java.lang.String str7 = server1.toString();
    long long8 = server1.getLastUpdate();
    server1.update();
    long long10 = server1.getLastUpdate();
    java.lang.String str11 = server1.toString();
    tp2.IP iP12 = null;
    boolean b13 = server1.connect(iP12);
    boolean b14 = server1.repOK();
    tp2.IP iP15 = null;
    // The following exception was thrown during execution in test generation
    try {
      boolean b16 = server1.addException(iP15);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Server [lastUpdate=250000, exceptions=(), bans={}]"+ "'", str7.equals("Server [lastUpdate=250000, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long8 == 250000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long10 == 250000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Server [lastUpdate=250000, exceptions=(), bans={}]"+ "'", str11.equals("Server [lastUpdate=250000, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);

  }

  @Test
  public void test341() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test341"); }


    tp2.Server server0 = new tp2.Server();
    server0.update();
    boolean b2 = server0.repOK();
    tp2.IP iP3 = null;
    boolean b4 = server0.connect(iP3);
    server0.update();
    tp2.IP iP6 = null;
    boolean b7 = server0.removeException(iP6);
    long long8 = server0.getLastUpdate();
    long long9 = server0.getLastUpdate();
    tp2.ITime iTime10 = null;
    server0.setTime(iTime10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long8 == 1465347898579L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long9 == 1465347898579L);

  }

  @Test
  public void test342() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test342"); }


    tp2.Server server1 = new tp2.Server(1);
    tp2.IP iP2 = null;
    boolean b3 = server1.removeBan(iP2);
    server1.update();
    tp2.IP iP5 = null;
    boolean b6 = server1.removeBan(iP5);
    tp2.IP iP7 = null;
    boolean b8 = server1.removeException(iP7);
    boolean b9 = server1.repOK();
    server1.update();
    boolean b11 = server1.repOK();
    server1.update();
    boolean b13 = server1.repOK();
    tp2.IP iP14 = null;
    boolean b15 = server1.addBan(iP14);
    long long16 = server1.getLastUpdate();
    boolean b17 = server1.repOK();
    tp2.IP iP18 = null;
    boolean b19 = server1.removeException(iP18);
    tp2.IP iP20 = null;
    // The following exception was thrown during execution in test generation
    try {
      boolean b21 = server1.addBan(iP20);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long16 == 250000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);

  }

  @Test
  public void test343() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test343"); }


    tp2.Server server1 = new tp2.Server(1);
    tp2.IP iP2 = null;
    boolean b3 = server1.removeException(iP2);
    java.lang.String str4 = server1.toString();
    tp2.IP iP5 = null;
    boolean b6 = server1.connect(iP5);
    java.lang.String str7 = server1.toString();
    java.lang.String str8 = server1.toString();
    server1.update();
    tp2.ITime iTime10 = null;
    server1.setTime(iTime10);
    long long12 = server1.getLastUpdate();
    long long13 = server1.getLastUpdate();
    tp2.IP iP14 = null;
    // The following exception was thrown during execution in test generation
    try {
      boolean b15 = server1.addException(iP14);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Server [lastUpdate=null, exceptions=(), bans={}]"+ "'", str4.equals("Server [lastUpdate=null, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Server [lastUpdate=null, exceptions=(), bans={}]"+ "'", str7.equals("Server [lastUpdate=null, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Server [lastUpdate=null, exceptions=(), bans={}]"+ "'", str8.equals("Server [lastUpdate=null, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long12 == 250000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long13 == 250000L);

  }

  @Test
  public void test344() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test344"); }


    tp2.Server server0 = new tp2.Server();
    server0.update();
    tp2.IP iP2 = null;
    boolean b3 = server0.removeBan(iP2);
    server0.update();
    tp2.ITime iTime5 = null;
    server0.setTime(iTime5);
    tp2.ITime iTime7 = null;
    server0.setTime(iTime7);
    boolean b9 = server0.repOK();
    tp2.IP iP10 = null;
    boolean b11 = server0.removeException(iP10);
    tp2.IP iP12 = null;
    boolean b13 = server0.removeException(iP12);
    tp2.IP iP14 = null;
    boolean b15 = server0.removeException(iP14);
    long long16 = server0.getLastUpdate();
    java.lang.String str17 = server0.toString();
    tp2.IP iP18 = null;
    // The following exception was thrown during execution in test generation
    try {
      boolean b19 = server0.addException(iP18);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long16 == 1465347898583L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "Server [lastUpdate=1465347898583, exceptions=(), bans={}]"+ "'", str17.equals("Server [lastUpdate=1465347898583, exceptions=(), bans={}]"));

  }

  @Test
  public void test345() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test345"); }


    tp2.Server server1 = new tp2.Server(1);
    tp2.IP iP2 = null;
    boolean b3 = server1.removeBan(iP2);
    server1.update();
    tp2.IP iP5 = null;
    boolean b6 = server1.removeBan(iP5);
    tp2.IP iP7 = null;
    boolean b8 = server1.removeBan(iP7);
    tp2.IP iP9 = null;
    boolean b10 = server1.removeException(iP9);
    tp2.IP iP11 = null;
    boolean b12 = server1.removeException(iP11);
    tp2.IP iP13 = null;
    boolean b14 = server1.addBan(iP13);
    java.lang.String str15 = server1.toString();
    java.lang.String str16 = server1.toString();
    tp2.IP iP17 = null;
    // The following exception was thrown during execution in test generation
    try {
      boolean b18 = server1.addException(iP17);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "Server [lastUpdate=250000, exceptions=(), bans={[IPBan [ip=null, expires=310000]]}]"+ "'", str15.equals("Server [lastUpdate=250000, exceptions=(), bans={[IPBan [ip=null, expires=310000]]}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "Server [lastUpdate=250000, exceptions=(), bans={[IPBan [ip=null, expires=310000]]}]"+ "'", str16.equals("Server [lastUpdate=250000, exceptions=(), bans={[IPBan [ip=null, expires=310000]]}]"));

  }

  @Test
  public void test346() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test346"); }


    tp2.Server server1 = new tp2.Server(1);
    tp2.IP iP2 = null;
    boolean b3 = server1.removeBan(iP2);
    server1.update();
    tp2.IP iP5 = null;
    boolean b6 = server1.removeBan(iP5);
    tp2.IP iP7 = null;
    boolean b8 = server1.removeBan(iP7);
    tp2.ITime iTime9 = null;
    server1.setTime(iTime9);
    tp2.IP iP11 = null;
    // The following exception was thrown during execution in test generation
    try {
      boolean b12 = server1.addException(iP11);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);

  }

  @Test
  public void test347() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test347"); }


    tp2.Server server0 = new tp2.Server();
    server0.update();
    tp2.IP iP2 = null;
    boolean b3 = server0.removeBan(iP2);
    tp2.IP iP4 = null;
    boolean b5 = server0.removeBan(iP4);
    java.lang.String str6 = server0.toString();
    long long7 = server0.getLastUpdate();
    tp2.ITime iTime8 = null;
    server0.setTime(iTime8);
    tp2.IP iP10 = null;
    boolean b11 = server0.removeBan(iP10);
    tp2.IP iP12 = null;
    boolean b13 = server0.connect(iP12);
    long long14 = server0.getLastUpdate();
    tp2.IP iP15 = null;
    boolean b16 = server0.connect(iP15);
    tp2.IP iP17 = null;
    // The following exception was thrown during execution in test generation
    try {
      boolean b18 = server0.addBan(iP17);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Server [lastUpdate=1465347898594, exceptions=(), bans={}]"+ "'", str6.equals("Server [lastUpdate=1465347898594, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long7 == 1465347898594L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long14 == 1465347898594L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);

  }

  @Test
  public void test348() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test348"); }


    tp2.Server server1 = new tp2.Server((-1));
    server1.update();
    server1.update();
    tp2.IP iP4 = null;
    boolean b5 = server1.removeException(iP4);
    boolean b6 = server1.repOK();
    tp2.IP iP7 = null;
    boolean b8 = server1.connect(iP7);
    tp2.IP iP9 = null;
    boolean b10 = server1.removeException(iP9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);

  }

  @Test
  public void test349() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test349"); }


    tp2.Server server1 = new tp2.Server(1);
    tp2.IP iP2 = null;
    boolean b3 = server1.removeBan(iP2);
    tp2.ITime iTime4 = null;
    server1.setTime(iTime4);
    tp2.IP iP6 = null;
    boolean b7 = server1.removeBan(iP6);
    tp2.ITime iTime8 = null;
    server1.setTime(iTime8);
    tp2.ITime iTime10 = null;
    server1.setTime(iTime10);
    tp2.ITime iTime12 = null;
    server1.setTime(iTime12);
    tp2.IP iP14 = null;
    boolean b15 = server1.removeBan(iP14);
    tp2.ITime iTime16 = null;
    server1.setTime(iTime16);
    java.lang.String str18 = server1.toString();
    tp2.IP iP19 = null;
    boolean b20 = server1.removeBan(iP19);
    tp2.IP iP21 = null;
    boolean b22 = server1.connect(iP21);
    // The following exception was thrown during execution in test generation
    try {
      long long23 = server1.getLastUpdate();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "Server [lastUpdate=null, exceptions=(), bans={}]"+ "'", str18.equals("Server [lastUpdate=null, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);

  }

  @Test
  public void test350() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test350"); }


    tp2.Server server1 = new tp2.Server(1);
    tp2.IP iP2 = null;
    boolean b3 = server1.removeBan(iP2);
    server1.update();
    long long5 = server1.getLastUpdate();
    tp2.IP iP6 = null;
    boolean b7 = server1.connect(iP6);
    tp2.IP iP8 = null;
    boolean b9 = server1.removeBan(iP8);
    tp2.IP iP10 = null;
    boolean b11 = server1.addBan(iP10);
    boolean b12 = server1.repOK();
    java.lang.String str13 = server1.toString();
    long long14 = server1.getLastUpdate();
    tp2.IP iP15 = null;
    // The following exception was thrown during execution in test generation
    try {
      boolean b16 = server1.addBan(iP15);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long5 == 250000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Server [lastUpdate=250000, exceptions=(), bans={[IPBan [ip=null, expires=310000]]}]"+ "'", str13.equals("Server [lastUpdate=250000, exceptions=(), bans={[IPBan [ip=null, expires=310000]]}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long14 == 250000L);

  }

  @Test
  public void test351() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test351"); }


    tp2.Server server0 = new tp2.Server();
    server0.update();
    tp2.IP iP2 = null;
    boolean b3 = server0.removeBan(iP2);
    tp2.ITime iTime4 = null;
    server0.setTime(iTime4);
    tp2.IP iP6 = null;
    boolean b7 = server0.connect(iP6);
    boolean b8 = server0.repOK();
    tp2.ITime iTime9 = null;
    server0.setTime(iTime9);
    tp2.IP iP11 = null;
    boolean b12 = server0.removeBan(iP11);
    tp2.IP iP13 = null;
    boolean b14 = server0.removeBan(iP13);
    boolean b15 = server0.repOK();
    tp2.IP iP16 = null;
    // The following exception was thrown during execution in test generation
    try {
      boolean b17 = server0.addException(iP16);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);

  }

  @Test
  public void test352() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test352"); }


    tp2.Server server1 = new tp2.Server(1);
    tp2.IP iP2 = null;
    boolean b3 = server1.addBan(iP2);
    server1.update();
    long long5 = server1.getLastUpdate();
    long long6 = server1.getLastUpdate();
    tp2.IP iP7 = null;
    boolean b8 = server1.removeException(iP7);
    tp2.ITime iTime9 = null;
    server1.setTime(iTime9);
    // The following exception was thrown during execution in test generation
    try {
      server1.update();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long5 == 250000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long6 == 250000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);

  }

  @Test
  public void test353() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test353"); }


    tp2.Server server1 = new tp2.Server(1);
    tp2.IP iP2 = null;
    boolean b3 = server1.removeBan(iP2);
    tp2.ITime iTime4 = null;
    server1.setTime(iTime4);
    tp2.IP iP6 = null;
    boolean b7 = server1.removeBan(iP6);
    tp2.ITime iTime8 = null;
    server1.setTime(iTime8);
    tp2.ITime iTime10 = null;
    server1.setTime(iTime10);
    tp2.IP iP12 = null;
    boolean b13 = server1.removeException(iP12);
    tp2.ITime iTime14 = null;
    server1.setTime(iTime14);
    java.lang.String str16 = server1.toString();
    boolean b17 = server1.repOK();
    boolean b18 = server1.repOK();
    tp2.IP iP19 = null;
    boolean b20 = server1.removeBan(iP19);
    // The following exception was thrown during execution in test generation
    try {
      long long21 = server1.getLastUpdate();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "Server [lastUpdate=null, exceptions=(), bans={}]"+ "'", str16.equals("Server [lastUpdate=null, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);

  }

  @Test
  public void test354() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test354"); }


    tp2.Server server1 = new tp2.Server(100);
    tp2.IP iP2 = null;
    boolean b3 = server1.connect(iP2);
    tp2.IP iP4 = null;
    boolean b5 = server1.removeBan(iP4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);

  }

  @Test
  public void test355() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test355"); }


    tp2.Server server1 = new tp2.Server(1);
    tp2.IP iP2 = null;
    boolean b3 = server1.removeBan(iP2);
    server1.update();
    tp2.IP iP5 = null;
    boolean b6 = server1.removeBan(iP5);
    long long7 = server1.getLastUpdate();
    boolean b8 = server1.repOK();
    tp2.IP iP9 = null;
    boolean b10 = server1.removeException(iP9);
    tp2.IP iP11 = null;
    // The following exception was thrown during execution in test generation
    try {
      boolean b12 = server1.addException(iP11);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long7 == 250000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);

  }

  @Test
  public void test356() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test356"); }


    tp2.Server server1 = new tp2.Server(0);
    server1.update();
    tp2.ITime iTime3 = null;
    server1.setTime(iTime3);
    tp2.ITime iTime5 = null;
    server1.setTime(iTime5);
    // The following exception was thrown during execution in test generation
    try {
      server1.update();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test357() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test357"); }


    tp2.Server server1 = new tp2.Server(1);
    tp2.IP iP2 = null;
    boolean b3 = server1.removeBan(iP2);
    server1.update();
    tp2.IP iP5 = null;
    boolean b6 = server1.removeBan(iP5);
    tp2.IP iP7 = null;
    boolean b8 = server1.removeBan(iP7);
    java.lang.String str9 = server1.toString();
    tp2.IP iP10 = null;
    boolean b11 = server1.connect(iP10);
    tp2.IP iP12 = null;
    boolean b13 = server1.removeBan(iP12);
    server1.update();
    boolean b15 = server1.repOK();
    long long16 = server1.getLastUpdate();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Server [lastUpdate=250000, exceptions=(), bans={}]"+ "'", str9.equals("Server [lastUpdate=250000, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long16 == 250000L);

  }

  @Test
  public void test358() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test358"); }


    tp2.Server server0 = new tp2.Server();
    boolean b1 = server0.repOK();
    tp2.IP iP2 = null;
    boolean b3 = server0.removeBan(iP2);
    boolean b4 = server0.repOK();
    tp2.IP iP5 = null;
    boolean b6 = server0.removeBan(iP5);
    server0.update();
    tp2.IP iP8 = null;
    boolean b9 = server0.connect(iP8);
    tp2.ITime iTime10 = null;
    server0.setTime(iTime10);
    tp2.IP iP12 = null;
    boolean b13 = server0.connect(iP12);
    tp2.IP iP14 = null;
    boolean b15 = server0.removeException(iP14);
    boolean b16 = server0.repOK();
    tp2.IP iP17 = null;
    boolean b18 = server0.removeBan(iP17);
    tp2.IP iP19 = null;
    boolean b20 = server0.connect(iP19);
    tp2.IP iP21 = null;
    // The following exception was thrown during execution in test generation
    try {
      boolean b22 = server0.addException(iP21);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);

  }

  @Test
  public void test359() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test359"); }


    tp2.Server server1 = new tp2.Server(1);
    tp2.IP iP2 = null;
    boolean b3 = server1.removeBan(iP2);
    server1.update();
    java.lang.String str5 = server1.toString();
    tp2.IP iP6 = null;
    boolean b7 = server1.removeBan(iP6);
    java.lang.String str8 = server1.toString();
    tp2.IP iP9 = null;
    boolean b10 = server1.removeException(iP9);
    boolean b11 = server1.repOK();
    tp2.ITime iTime12 = null;
    server1.setTime(iTime12);
    tp2.IP iP14 = null;
    boolean b15 = server1.connect(iP14);
    tp2.IP iP16 = null;
    boolean b17 = server1.removeException(iP16);
    boolean b18 = server1.repOK();
    boolean b19 = server1.repOK();
    tp2.IP iP20 = null;
    // The following exception was thrown during execution in test generation
    try {
      boolean b21 = server1.addBan(iP20);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Server [lastUpdate=250000, exceptions=(), bans={}]"+ "'", str5.equals("Server [lastUpdate=250000, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Server [lastUpdate=250000, exceptions=(), bans={}]"+ "'", str8.equals("Server [lastUpdate=250000, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);

  }

  @Test
  public void test360() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test360"); }


    tp2.Server server0 = new tp2.Server();
    server0.update();
    tp2.IP iP2 = null;
    boolean b3 = server0.removeBan(iP2);
    long long4 = server0.getLastUpdate();
    server0.update();
    tp2.IP iP6 = null;
    boolean b7 = server0.removeException(iP6);
    tp2.IP iP8 = null;
    // The following exception was thrown during execution in test generation
    try {
      boolean b9 = server0.addException(iP8);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long4 == 1465347898621L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);

  }

  @Test
  public void test361() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test361"); }


    tp2.Server server1 = new tp2.Server(1);
    tp2.IP iP2 = null;
    boolean b3 = server1.removeBan(iP2);
    server1.update();
    long long5 = server1.getLastUpdate();
    tp2.IP iP6 = null;
    boolean b7 = server1.connect(iP6);
    java.lang.String str8 = server1.toString();
    server1.update();
    server1.update();
    tp2.IP iP11 = null;
    boolean b12 = server1.removeBan(iP11);
    tp2.IP iP13 = null;
    // The following exception was thrown during execution in test generation
    try {
      boolean b14 = server1.addException(iP13);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long5 == 250000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Server [lastUpdate=250000, exceptions=(), bans={}]"+ "'", str8.equals("Server [lastUpdate=250000, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);

  }

  @Test
  public void test362() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test362"); }


    tp2.Server server0 = new tp2.Server();
    boolean b1 = server0.repOK();
    tp2.IP iP2 = null;
    boolean b3 = server0.removeBan(iP2);
    tp2.IP iP4 = null;
    boolean b5 = server0.removeException(iP4);
    tp2.IP iP6 = null;
    boolean b7 = server0.connect(iP6);
    tp2.IP iP8 = null;
    // The following exception was thrown during execution in test generation
    try {
      boolean b9 = server0.addException(iP8);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);

  }

  @Test
  public void test363() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test363"); }


    tp2.Server server0 = new tp2.Server();
    boolean b1 = server0.repOK();
    tp2.IP iP2 = null;
    boolean b3 = server0.removeBan(iP2);
    boolean b4 = server0.repOK();
    tp2.IP iP5 = null;
    boolean b6 = server0.removeBan(iP5);
    server0.update();
    tp2.IP iP8 = null;
    boolean b9 = server0.connect(iP8);
    tp2.ITime iTime10 = null;
    server0.setTime(iTime10);
    tp2.IP iP12 = null;
    boolean b13 = server0.connect(iP12);
    tp2.IP iP14 = null;
    boolean b15 = server0.removeException(iP14);
    boolean b16 = server0.repOK();
    long long17 = server0.getLastUpdate();
    tp2.IP iP18 = null;
    // The following exception was thrown during execution in test generation
    try {
      boolean b19 = server0.addException(iP18);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long17 == 1465347898624L);

  }

  @Test
  public void test364() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test364"); }


    tp2.Server server1 = new tp2.Server(1);
    tp2.IP iP2 = null;
    boolean b3 = server1.removeBan(iP2);
    tp2.ITime iTime4 = null;
    server1.setTime(iTime4);
    tp2.IP iP6 = null;
    boolean b7 = server1.removeBan(iP6);
    tp2.IP iP8 = null;
    boolean b9 = server1.connect(iP8);
    boolean b10 = server1.repOK();
    tp2.IP iP11 = null;
    boolean b12 = server1.removeException(iP11);
    // The following exception was thrown during execution in test generation
    try {
      server1.update();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);

  }

  @Test
  public void test365() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test365"); }


    tp2.Server server1 = new tp2.Server(1);
    tp2.IP iP2 = null;
    boolean b3 = server1.removeBan(iP2);
    server1.update();
    tp2.IP iP5 = null;
    boolean b6 = server1.removeBan(iP5);
    tp2.IP iP7 = null;
    boolean b8 = server1.removeBan(iP7);
    java.lang.String str9 = server1.toString();
    boolean b10 = server1.repOK();
    tp2.IP iP11 = null;
    boolean b12 = server1.connect(iP11);
    tp2.IP iP13 = null;
    boolean b14 = server1.removeException(iP13);
    long long15 = server1.getLastUpdate();
    tp2.IP iP16 = null;
    boolean b17 = server1.removeBan(iP16);
    tp2.IP iP18 = null;
    // The following exception was thrown during execution in test generation
    try {
      boolean b19 = server1.addException(iP18);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Server [lastUpdate=250000, exceptions=(), bans={}]"+ "'", str9.equals("Server [lastUpdate=250000, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long15 == 250000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);

  }

  @Test
  public void test366() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test366"); }


    tp2.Server server0 = new tp2.Server();
    server0.update();
    tp2.IP iP2 = null;
    boolean b3 = server0.removeBan(iP2);
    server0.update();
    tp2.ITime iTime5 = null;
    server0.setTime(iTime5);
    tp2.IP iP7 = null;
    boolean b8 = server0.removeBan(iP7);
    boolean b9 = server0.repOK();
    java.lang.String str10 = server0.toString();
    tp2.IP iP11 = null;
    boolean b12 = server0.removeBan(iP11);
    tp2.IP iP13 = null;
    // The following exception was thrown during execution in test generation
    try {
      boolean b14 = server0.addBan(iP13);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Server [lastUpdate=1465347898627, exceptions=(), bans={}]"+ "'", str10.equals("Server [lastUpdate=1465347898627, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);

  }

  @Test
  public void test367() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test367"); }


    tp2.Server server1 = new tp2.Server(1);
    tp2.IP iP2 = null;
    boolean b3 = server1.removeBan(iP2);
    server1.update();
    java.lang.String str5 = server1.toString();
    tp2.IP iP6 = null;
    boolean b7 = server1.connect(iP6);
    boolean b8 = server1.repOK();
    boolean b9 = server1.repOK();
    java.lang.String str10 = server1.toString();
    boolean b11 = server1.repOK();
    tp2.IP iP12 = null;
    boolean b13 = server1.removeBan(iP12);
    tp2.IP iP14 = null;
    boolean b15 = server1.connect(iP14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Server [lastUpdate=250000, exceptions=(), bans={}]"+ "'", str5.equals("Server [lastUpdate=250000, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Server [lastUpdate=250000, exceptions=(), bans={}]"+ "'", str10.equals("Server [lastUpdate=250000, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);

  }

  @Test
  public void test368() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test368"); }


    tp2.Server server1 = new tp2.Server(1);
    tp2.IP iP2 = null;
    boolean b3 = server1.removeBan(iP2);
    server1.update();
    tp2.IP iP5 = null;
    boolean b6 = server1.removeBan(iP5);
    tp2.IP iP7 = null;
    boolean b8 = server1.removeBan(iP7);
    java.lang.String str9 = server1.toString();
    long long10 = server1.getLastUpdate();
    tp2.IP iP11 = null;
    boolean b12 = server1.removeBan(iP11);
    tp2.IP iP13 = null;
    boolean b14 = server1.connect(iP13);
    tp2.IP iP15 = null;
    boolean b16 = server1.addBan(iP15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Server [lastUpdate=250000, exceptions=(), bans={}]"+ "'", str9.equals("Server [lastUpdate=250000, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long10 == 250000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);

  }

  @Test
  public void test369() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test369"); }


    tp2.Server server1 = new tp2.Server(1);
    tp2.IP iP2 = null;
    boolean b3 = server1.addBan(iP2);
    server1.update();
    tp2.IP iP5 = null;
    // The following exception was thrown during execution in test generation
    try {
      boolean b6 = server1.addBan(iP5);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);

  }

  @Test
  public void test370() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test370"); }


    tp2.Server server0 = new tp2.Server();
    server0.update();
    boolean b2 = server0.repOK();
    tp2.IP iP3 = null;
    boolean b4 = server0.connect(iP3);
    server0.update();
    java.lang.String str6 = server0.toString();
    server0.update();
    tp2.IP iP8 = null;
    // The following exception was thrown during execution in test generation
    try {
      boolean b9 = server0.addException(iP8);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Server [lastUpdate=1465347898631, exceptions=(), bans={}]"+ "'", str6.equals("Server [lastUpdate=1465347898631, exceptions=(), bans={}]"));

  }

  @Test
  public void test371() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test371"); }


    tp2.Server server1 = new tp2.Server((-1));
    server1.update();
    server1.update();
    tp2.ITime iTime4 = null;
    server1.setTime(iTime4);
    java.lang.String str6 = server1.toString();
    long long7 = server1.getLastUpdate();
    tp2.ITime iTime8 = null;
    server1.setTime(iTime8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Server [lastUpdate=250000, exceptions=(), bans={}]"+ "'", str6.equals("Server [lastUpdate=250000, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long7 == 250000L);

  }

  @Test
  public void test372() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test372"); }


    tp2.Server server1 = new tp2.Server(1);
    tp2.IP iP2 = null;
    boolean b3 = server1.removeBan(iP2);
    server1.update();
    tp2.IP iP5 = null;
    boolean b6 = server1.removeBan(iP5);
    long long7 = server1.getLastUpdate();
    server1.update();
    boolean b9 = server1.repOK();
    boolean b10 = server1.repOK();
    tp2.IP iP11 = null;
    boolean b12 = server1.addBan(iP11);
    tp2.IP iP13 = null;
    boolean b14 = server1.removeException(iP13);
    tp2.IP iP15 = null;
    // The following exception was thrown during execution in test generation
    try {
      boolean b16 = server1.addBan(iP15);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long7 == 250000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);

  }

  @Test
  public void test373() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test373"); }


    tp2.Server server1 = new tp2.Server((-1));
    server1.update();
    tp2.IP iP3 = null;
    boolean b4 = server1.removeException(iP3);
    long long5 = server1.getLastUpdate();
    tp2.ITime iTime6 = null;
    server1.setTime(iTime6);
    tp2.IP iP8 = null;
    boolean b9 = server1.connect(iP8);
    long long10 = server1.getLastUpdate();
    boolean b11 = server1.repOK();
    boolean b12 = server1.repOK();
    tp2.IP iP13 = null;
    // The following exception was thrown during execution in test generation
    try {
      boolean b14 = server1.addException(iP13);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long5 == 250000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long10 == 250000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);

  }

  @Test
  public void test374() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test374"); }


    tp2.Server server1 = new tp2.Server(1);
    tp2.IP iP2 = null;
    boolean b3 = server1.removeException(iP2);
    java.lang.String str4 = server1.toString();
    tp2.IP iP5 = null;
    boolean b6 = server1.connect(iP5);
    java.lang.String str7 = server1.toString();
    java.lang.String str8 = server1.toString();
    boolean b9 = server1.repOK();
    tp2.ITime iTime10 = null;
    server1.setTime(iTime10);
    java.lang.String str12 = server1.toString();
    boolean b13 = server1.repOK();
    tp2.IP iP14 = null;
    boolean b15 = server1.removeException(iP14);
    tp2.IP iP16 = null;
    boolean b17 = server1.removeException(iP16);
    tp2.IP iP18 = null;
    // The following exception was thrown during execution in test generation
    try {
      boolean b19 = server1.addBan(iP18);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Server [lastUpdate=null, exceptions=(), bans={}]"+ "'", str4.equals("Server [lastUpdate=null, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Server [lastUpdate=null, exceptions=(), bans={}]"+ "'", str7.equals("Server [lastUpdate=null, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Server [lastUpdate=null, exceptions=(), bans={}]"+ "'", str8.equals("Server [lastUpdate=null, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Server [lastUpdate=null, exceptions=(), bans={}]"+ "'", str12.equals("Server [lastUpdate=null, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);

  }

  @Test
  public void test375() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test375"); }


    tp2.Server server1 = new tp2.Server(1);
    tp2.IP iP2 = null;
    boolean b3 = server1.removeBan(iP2);
    server1.update();
    tp2.IP iP5 = null;
    boolean b6 = server1.removeBan(iP5);
    long long7 = server1.getLastUpdate();
    server1.update();
    tp2.IP iP9 = null;
    boolean b10 = server1.removeBan(iP9);
    tp2.ITime iTime11 = null;
    server1.setTime(iTime11);
    tp2.IP iP13 = null;
    boolean b14 = server1.connect(iP13);
    tp2.ITime iTime15 = null;
    server1.setTime(iTime15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long7 == 250000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);

  }

  @Test
  public void test376() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test376"); }


    tp2.Server server1 = new tp2.Server(0);
    server1.update();
    tp2.ITime iTime3 = null;
    server1.setTime(iTime3);
    tp2.ITime iTime5 = null;
    server1.setTime(iTime5);
    long long7 = server1.getLastUpdate();
    tp2.IP iP8 = null;
    // The following exception was thrown during execution in test generation
    try {
      boolean b9 = server1.addException(iP8);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long7 == 250000L);

  }

  @Test
  public void test377() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test377"); }


    tp2.Server server1 = new tp2.Server(1);
    tp2.IP iP2 = null;
    boolean b3 = server1.removeBan(iP2);
    server1.update();
    tp2.IP iP5 = null;
    boolean b6 = server1.removeBan(iP5);
    tp2.IP iP7 = null;
    boolean b8 = server1.removeBan(iP7);
    tp2.IP iP9 = null;
    boolean b10 = server1.removeException(iP9);
    tp2.IP iP11 = null;
    boolean b12 = server1.removeException(iP11);
    tp2.ITime iTime13 = null;
    server1.setTime(iTime13);
    tp2.IP iP15 = null;
    boolean b16 = server1.removeException(iP15);
    long long17 = server1.getLastUpdate();
    long long18 = server1.getLastUpdate();
    long long19 = server1.getLastUpdate();
    tp2.ITime iTime20 = null;
    server1.setTime(iTime20);
    // The following exception was thrown during execution in test generation
    try {
      server1.update();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long17 == 250000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long18 == 250000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long19 == 250000L);

  }

  @Test
  public void test378() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test378"); }


    tp2.Server server1 = new tp2.Server((-1));
    server1.update();
    tp2.IP iP3 = null;
    boolean b4 = server1.removeException(iP3);
    tp2.ITime iTime5 = null;
    server1.setTime(iTime5);
    tp2.IP iP7 = null;
    boolean b8 = server1.removeBan(iP7);
    long long9 = server1.getLastUpdate();
    long long10 = server1.getLastUpdate();
    boolean b11 = server1.repOK();
    long long12 = server1.getLastUpdate();
    tp2.IP iP13 = null;
    // The following exception was thrown during execution in test generation
    try {
      boolean b14 = server1.addBan(iP13);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long9 == 250000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long10 == 250000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long12 == 250000L);

  }

  @Test
  public void test379() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test379"); }


    tp2.Server server1 = new tp2.Server(1);
    tp2.IP iP2 = null;
    boolean b3 = server1.removeBan(iP2);
    server1.update();
    long long5 = server1.getLastUpdate();
    tp2.IP iP6 = null;
    boolean b7 = server1.connect(iP6);
    tp2.IP iP8 = null;
    boolean b9 = server1.removeBan(iP8);
    tp2.IP iP10 = null;
    boolean b11 = server1.addBan(iP10);
    boolean b12 = server1.repOK();
    java.lang.String str13 = server1.toString();
    boolean b14 = server1.repOK();
    tp2.IP iP15 = null;
    // The following exception was thrown during execution in test generation
    try {
      boolean b16 = server1.connect(iP15);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long5 == 250000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Server [lastUpdate=250000, exceptions=(), bans={[IPBan [ip=null, expires=310000]]}]"+ "'", str13.equals("Server [lastUpdate=250000, exceptions=(), bans={[IPBan [ip=null, expires=310000]]}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);

  }

  @Test
  public void test380() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test380"); }


    tp2.Server server1 = new tp2.Server(1);
    tp2.IP iP2 = null;
    boolean b3 = server1.removeBan(iP2);
    server1.update();
    long long5 = server1.getLastUpdate();
    tp2.IP iP6 = null;
    boolean b7 = server1.removeException(iP6);
    long long8 = server1.getLastUpdate();
    long long9 = server1.getLastUpdate();
    long long10 = server1.getLastUpdate();
    tp2.ITime iTime11 = null;
    server1.setTime(iTime11);
    tp2.IP iP13 = null;
    boolean b14 = server1.removeException(iP13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long5 == 250000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long8 == 250000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long9 == 250000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long10 == 250000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);

  }

  @Test
  public void test381() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test381"); }


    tp2.Server server0 = new tp2.Server();
    boolean b1 = server0.repOK();
    tp2.IP iP2 = null;
    boolean b3 = server0.removeBan(iP2);
    boolean b4 = server0.repOK();
    tp2.IP iP5 = null;
    boolean b6 = server0.connect(iP5);
    server0.update();
    long long8 = server0.getLastUpdate();
    boolean b9 = server0.repOK();
    tp2.ITime iTime10 = null;
    server0.setTime(iTime10);
    tp2.ITime iTime12 = null;
    server0.setTime(iTime12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long8 == 1465347898657L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);

  }

  @Test
  public void test382() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test382"); }


    tp2.Server server0 = new tp2.Server();
    boolean b1 = server0.repOK();
    tp2.ITime iTime2 = null;
    server0.setTime(iTime2);
    java.lang.String str4 = server0.toString();
    boolean b5 = server0.repOK();
    java.lang.String str6 = server0.toString();
    boolean b7 = server0.repOK();
    tp2.IP iP8 = null;
    boolean b9 = server0.connect(iP8);
    java.lang.String str10 = server0.toString();
    tp2.IP iP11 = null;
    boolean b12 = server0.connect(iP11);
    // The following exception was thrown during execution in test generation
    try {
      long long13 = server0.getLastUpdate();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Server [lastUpdate=null, exceptions=(), bans={}]"+ "'", str4.equals("Server [lastUpdate=null, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Server [lastUpdate=null, exceptions=(), bans={}]"+ "'", str6.equals("Server [lastUpdate=null, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Server [lastUpdate=null, exceptions=(), bans={}]"+ "'", str10.equals("Server [lastUpdate=null, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);

  }

  @Test
  public void test383() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test383"); }


    tp2.Server server0 = new tp2.Server();
    boolean b1 = server0.repOK();
    server0.update();
    server0.update();
    tp2.IP iP4 = null;
    // The following exception was thrown during execution in test generation
    try {
      boolean b5 = server0.addException(iP4);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);

  }

  @Test
  public void test384() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test384"); }


    tp2.Server server1 = new tp2.Server(1);
    tp2.IP iP2 = null;
    boolean b3 = server1.removeBan(iP2);
    server1.update();
    long long5 = server1.getLastUpdate();
    java.lang.String str6 = server1.toString();
    tp2.IP iP7 = null;
    // The following exception was thrown during execution in test generation
    try {
      boolean b8 = server1.addException(iP7);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long5 == 250000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Server [lastUpdate=250000, exceptions=(), bans={}]"+ "'", str6.equals("Server [lastUpdate=250000, exceptions=(), bans={}]"));

  }

  @Test
  public void test385() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test385"); }


    tp2.Server server0 = new tp2.Server();
    server0.update();
    server0.update();
    tp2.ITime iTime3 = null;
    server0.setTime(iTime3);
    tp2.IP iP5 = null;
    boolean b6 = server0.removeException(iP5);
    long long7 = server0.getLastUpdate();
    long long8 = server0.getLastUpdate();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long7 == 1465347898666L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long8 == 1465347898666L);

  }

  @Test
  public void test386() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test386"); }


    tp2.Server server1 = new tp2.Server(1);
    tp2.IP iP2 = null;
    boolean b3 = server1.removeBan(iP2);
    server1.update();
    tp2.IP iP5 = null;
    boolean b6 = server1.removeBan(iP5);
    tp2.IP iP7 = null;
    boolean b8 = server1.removeException(iP7);
    server1.update();
    tp2.IP iP10 = null;
    boolean b11 = server1.addBan(iP10);
    long long12 = server1.getLastUpdate();
    boolean b13 = server1.repOK();
    tp2.IP iP14 = null;
    boolean b15 = server1.removeException(iP14);
    server1.update();
    long long17 = server1.getLastUpdate();
    tp2.ITime iTime18 = null;
    server1.setTime(iTime18);
    // The following exception was thrown during execution in test generation
    try {
      server1.update();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long12 == 250000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long17 == 250000L);

  }

  @Test
  public void test387() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test387"); }


    tp2.Server server1 = new tp2.Server(1);
    tp2.IP iP2 = null;
    boolean b3 = server1.removeBan(iP2);
    server1.update();
    tp2.IP iP5 = null;
    boolean b6 = server1.removeBan(iP5);
    java.lang.String str7 = server1.toString();
    long long8 = server1.getLastUpdate();
    tp2.IP iP9 = null;
    boolean b10 = server1.removeBan(iP9);
    long long11 = server1.getLastUpdate();
    tp2.IP iP12 = null;
    boolean b13 = server1.addBan(iP12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Server [lastUpdate=250000, exceptions=(), bans={}]"+ "'", str7.equals("Server [lastUpdate=250000, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long8 == 250000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long11 == 250000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);

  }

  @Test
  public void test388() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test388"); }


    tp2.Server server1 = new tp2.Server(1);
    tp2.IP iP2 = null;
    boolean b3 = server1.removeBan(iP2);
    server1.update();
    java.lang.String str5 = server1.toString();
    tp2.IP iP6 = null;
    boolean b7 = server1.connect(iP6);
    boolean b8 = server1.repOK();
    long long9 = server1.getLastUpdate();
    long long10 = server1.getLastUpdate();
    tp2.IP iP11 = null;
    // The following exception was thrown during execution in test generation
    try {
      boolean b12 = server1.addException(iP11);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Server [lastUpdate=250000, exceptions=(), bans={}]"+ "'", str5.equals("Server [lastUpdate=250000, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long9 == 250000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long10 == 250000L);

  }

  @Test
  public void test389() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test389"); }


    tp2.Server server0 = new tp2.Server();
    java.lang.String str1 = server0.toString();
    server0.update();
    tp2.IP iP3 = null;
    boolean b4 = server0.addBan(iP3);
    server0.update();
    tp2.IP iP6 = null;
    // The following exception was thrown during execution in test generation
    try {
      boolean b7 = server0.addBan(iP6);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Server [lastUpdate=null, exceptions=(), bans={}]"+ "'", str1.equals("Server [lastUpdate=null, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);

  }

  @Test
  public void test390() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test390"); }


    tp2.Server server1 = new tp2.Server(1);
    tp2.IP iP2 = null;
    boolean b3 = server1.removeBan(iP2);
    server1.update();
    tp2.IP iP5 = null;
    boolean b6 = server1.removeBan(iP5);
    java.lang.String str7 = server1.toString();
    long long8 = server1.getLastUpdate();
    server1.update();
    long long10 = server1.getLastUpdate();
    java.lang.String str11 = server1.toString();
    server1.update();
    long long13 = server1.getLastUpdate();
    tp2.ITime iTime14 = null;
    server1.setTime(iTime14);
    tp2.IP iP16 = null;
    // The following exception was thrown during execution in test generation
    try {
      boolean b17 = server1.addBan(iP16);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Server [lastUpdate=250000, exceptions=(), bans={}]"+ "'", str7.equals("Server [lastUpdate=250000, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long8 == 250000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long10 == 250000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Server [lastUpdate=250000, exceptions=(), bans={}]"+ "'", str11.equals("Server [lastUpdate=250000, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long13 == 250000L);

  }

  @Test
  public void test391() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test391"); }


    tp2.Server server1 = new tp2.Server(10);
    tp2.ITime iTime2 = null;
    server1.setTime(iTime2);
    tp2.IP iP4 = null;
    boolean b5 = server1.connect(iP4);
    tp2.IP iP6 = null;
    boolean b7 = server1.removeBan(iP6);
    tp2.IP iP8 = null;
    boolean b9 = server1.connect(iP8);
    // The following exception was thrown during execution in test generation
    try {
      long long10 = server1.getLastUpdate();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);

  }

  @Test
  public void test392() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test392"); }


    tp2.Server server1 = new tp2.Server(1);
    tp2.IP iP2 = null;
    boolean b3 = server1.removeBan(iP2);
    server1.update();
    tp2.IP iP5 = null;
    boolean b6 = server1.removeBan(iP5);
    tp2.IP iP7 = null;
    boolean b8 = server1.addBan(iP7);
    server1.update();
    boolean b10 = server1.repOK();
    tp2.IP iP11 = null;
    // The following exception was thrown during execution in test generation
    try {
      boolean b12 = server1.addException(iP11);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);

  }

  @Test
  public void test393() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test393"); }


    tp2.Server server0 = new tp2.Server();
    server0.update();
    boolean b2 = server0.repOK();
    tp2.IP iP3 = null;
    boolean b4 = server0.connect(iP3);
    tp2.IP iP5 = null;
    boolean b6 = server0.removeBan(iP5);
    boolean b7 = server0.repOK();
    java.lang.String str8 = server0.toString();
    tp2.IP iP9 = null;
    // The following exception was thrown during execution in test generation
    try {
      boolean b10 = server0.addException(iP9);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Server [lastUpdate=1465347898694, exceptions=(), bans={}]"+ "'", str8.equals("Server [lastUpdate=1465347898694, exceptions=(), bans={}]"));

  }

  @Test
  public void test394() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test394"); }


    tp2.Server server1 = new tp2.Server(1);
    tp2.IP iP2 = null;
    boolean b3 = server1.removeBan(iP2);
    tp2.ITime iTime4 = null;
    server1.setTime(iTime4);
    tp2.IP iP6 = null;
    boolean b7 = server1.removeBan(iP6);
    tp2.ITime iTime8 = null;
    server1.setTime(iTime8);
    boolean b10 = server1.repOK();
    tp2.IP iP11 = null;
    boolean b12 = server1.removeBan(iP11);
    java.lang.String str13 = server1.toString();
    // The following exception was thrown during execution in test generation
    try {
      server1.update();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Server [lastUpdate=null, exceptions=(), bans={}]"+ "'", str13.equals("Server [lastUpdate=null, exceptions=(), bans={}]"));

  }

  @Test
  public void test395() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test395"); }


    tp2.Server server1 = new tp2.Server(1);
    tp2.IP iP2 = null;
    boolean b3 = server1.removeBan(iP2);
    tp2.ITime iTime4 = null;
    server1.setTime(iTime4);
    tp2.IP iP6 = null;
    boolean b7 = server1.removeBan(iP6);
    java.lang.String str8 = server1.toString();
    java.lang.String str9 = server1.toString();
    tp2.IP iP10 = null;
    boolean b11 = server1.removeException(iP10);
    java.lang.String str12 = server1.toString();
    java.lang.String str13 = server1.toString();
    java.lang.String str14 = server1.toString();
    // The following exception was thrown during execution in test generation
    try {
      long long15 = server1.getLastUpdate();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Server [lastUpdate=null, exceptions=(), bans={}]"+ "'", str8.equals("Server [lastUpdate=null, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Server [lastUpdate=null, exceptions=(), bans={}]"+ "'", str9.equals("Server [lastUpdate=null, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Server [lastUpdate=null, exceptions=(), bans={}]"+ "'", str12.equals("Server [lastUpdate=null, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Server [lastUpdate=null, exceptions=(), bans={}]"+ "'", str13.equals("Server [lastUpdate=null, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "Server [lastUpdate=null, exceptions=(), bans={}]"+ "'", str14.equals("Server [lastUpdate=null, exceptions=(), bans={}]"));

  }

  @Test
  public void test396() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test396"); }


    tp2.Server server1 = new tp2.Server(1);
    tp2.IP iP2 = null;
    boolean b3 = server1.removeBan(iP2);
    server1.update();
    tp2.IP iP5 = null;
    boolean b6 = server1.removeBan(iP5);
    java.lang.String str7 = server1.toString();
    long long8 = server1.getLastUpdate();
    server1.update();
    long long10 = server1.getLastUpdate();
    server1.update();
    tp2.IP iP12 = null;
    boolean b13 = server1.removeException(iP12);
    tp2.ITime iTime14 = null;
    server1.setTime(iTime14);
    java.lang.String str16 = server1.toString();
    tp2.IP iP17 = null;
    boolean b18 = server1.connect(iP17);
    tp2.IP iP19 = null;
    boolean b20 = server1.removeBan(iP19);
    tp2.ITime iTime21 = null;
    server1.setTime(iTime21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Server [lastUpdate=250000, exceptions=(), bans={}]"+ "'", str7.equals("Server [lastUpdate=250000, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long8 == 250000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long10 == 250000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "Server [lastUpdate=250000, exceptions=(), bans={}]"+ "'", str16.equals("Server [lastUpdate=250000, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);

  }

  @Test
  public void test397() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test397"); }


    tp2.Server server1 = new tp2.Server(1);
    tp2.IP iP2 = null;
    boolean b3 = server1.removeBan(iP2);
    server1.update();
    tp2.IP iP5 = null;
    boolean b6 = server1.removeBan(iP5);
    tp2.IP iP7 = null;
    boolean b8 = server1.removeException(iP7);
    server1.update();
    tp2.IP iP10 = null;
    boolean b11 = server1.addBan(iP10);
    long long12 = server1.getLastUpdate();
    boolean b13 = server1.repOK();
    long long14 = server1.getLastUpdate();
    long long15 = server1.getLastUpdate();
    tp2.IP iP16 = null;
    // The following exception was thrown during execution in test generation
    try {
      boolean b17 = server1.removeBan(iP16);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long12 == 250000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long14 == 250000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long15 == 250000L);

  }

  @Test
  public void test398() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test398"); }


    tp2.Server server1 = new tp2.Server(1);
    tp2.IP iP2 = null;
    boolean b3 = server1.addBan(iP2);
    tp2.IP iP4 = null;
    boolean b5 = server1.removeException(iP4);
    java.lang.String str6 = server1.toString();
    tp2.ITime iTime7 = null;
    server1.setTime(iTime7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Server [lastUpdate=null, exceptions=(), bans={[IPBan [ip=null, expires=310000]]}]"+ "'", str6.equals("Server [lastUpdate=null, exceptions=(), bans={[IPBan [ip=null, expires=310000]]}]"));

  }

  @Test
  public void test399() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test399"); }


    tp2.Server server0 = new tp2.Server();
    server0.update();
    tp2.IP iP2 = null;
    boolean b3 = server0.removeBan(iP2);
    server0.update();
    tp2.ITime iTime5 = null;
    server0.setTime(iTime5);
    tp2.ITime iTime7 = null;
    server0.setTime(iTime7);
    boolean b9 = server0.repOK();
    tp2.IP iP10 = null;
    boolean b11 = server0.removeException(iP10);
    tp2.IP iP12 = null;
    boolean b13 = server0.connect(iP12);
    tp2.IP iP14 = null;
    boolean b15 = server0.removeBan(iP14);
    tp2.IP iP16 = null;
    boolean b17 = server0.connect(iP16);
    tp2.IP iP18 = null;
    // The following exception was thrown during execution in test generation
    try {
      boolean b19 = server0.addException(iP18);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);

  }

  @Test
  public void test400() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test400"); }


    tp2.Server server1 = new tp2.Server(1);
    tp2.IP iP2 = null;
    boolean b3 = server1.removeBan(iP2);
    server1.update();
    tp2.IP iP5 = null;
    boolean b6 = server1.removeBan(iP5);
    java.lang.String str7 = server1.toString();
    server1.update();
    tp2.ITime iTime9 = null;
    server1.setTime(iTime9);
    boolean b11 = server1.repOK();
    boolean b12 = server1.repOK();
    tp2.IP iP13 = null;
    boolean b14 = server1.connect(iP13);
    tp2.IP iP15 = null;
    // The following exception was thrown during execution in test generation
    try {
      boolean b16 = server1.addBan(iP15);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Server [lastUpdate=250000, exceptions=(), bans={}]"+ "'", str7.equals("Server [lastUpdate=250000, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);

  }

  @Test
  public void test401() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test401"); }


    tp2.Server server0 = new tp2.Server();
    server0.update();
    tp2.IP iP2 = null;
    boolean b3 = server0.removeBan(iP2);
    tp2.ITime iTime4 = null;
    server0.setTime(iTime4);
    tp2.IP iP6 = null;
    boolean b7 = server0.connect(iP6);
    boolean b8 = server0.repOK();
    tp2.ITime iTime9 = null;
    server0.setTime(iTime9);
    tp2.IP iP11 = null;
    boolean b12 = server0.removeBan(iP11);
    tp2.IP iP13 = null;
    boolean b14 = server0.removeBan(iP13);
    tp2.IP iP15 = null;
    boolean b16 = server0.connect(iP15);
    boolean b17 = server0.repOK();
    tp2.IP iP18 = null;
    // The following exception was thrown during execution in test generation
    try {
      boolean b19 = server0.addBan(iP18);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);

  }

  @Test
  public void test402() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test402"); }


    tp2.Server server0 = new tp2.Server();
    server0.update();
    tp2.IP iP2 = null;
    boolean b3 = server0.removeBan(iP2);
    tp2.ITime iTime4 = null;
    server0.setTime(iTime4);
    tp2.IP iP6 = null;
    boolean b7 = server0.connect(iP6);
    tp2.IP iP8 = null;
    boolean b9 = server0.connect(iP8);
    boolean b10 = server0.repOK();
    tp2.IP iP11 = null;
    // The following exception was thrown during execution in test generation
    try {
      boolean b12 = server0.addException(iP11);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);

  }

  @Test
  public void test403() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test403"); }


    tp2.Server server0 = new tp2.Server();
    tp2.IP iP1 = null;
    boolean b2 = server0.removeException(iP1);
    server0.update();
    tp2.IP iP4 = null;
    boolean b5 = server0.connect(iP4);
    boolean b6 = server0.repOK();
    tp2.IP iP7 = null;
    boolean b8 = server0.removeBan(iP7);
    tp2.ITime iTime9 = null;
    server0.setTime(iTime9);
    tp2.ITime iTime11 = null;
    server0.setTime(iTime11);
    long long13 = server0.getLastUpdate();
    // The following exception was thrown during execution in test generation
    try {
      server0.update();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long13 == 1465347898723L);

  }

  @Test
  public void test404() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test404"); }


    tp2.Server server1 = new tp2.Server(1);
    tp2.IP iP2 = null;
    boolean b3 = server1.removeBan(iP2);
    server1.update();
    java.lang.String str5 = server1.toString();
    tp2.IP iP6 = null;
    boolean b7 = server1.removeBan(iP6);
    java.lang.String str8 = server1.toString();
    tp2.IP iP9 = null;
    boolean b10 = server1.removeException(iP9);
    server1.update();
    tp2.IP iP12 = null;
    boolean b13 = server1.addBan(iP12);
    boolean b14 = server1.repOK();
    tp2.ITime iTime15 = null;
    server1.setTime(iTime15);
    // The following exception was thrown during execution in test generation
    try {
      server1.update();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Server [lastUpdate=250000, exceptions=(), bans={}]"+ "'", str5.equals("Server [lastUpdate=250000, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Server [lastUpdate=250000, exceptions=(), bans={}]"+ "'", str8.equals("Server [lastUpdate=250000, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);

  }

  @Test
  public void test405() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test405"); }


    tp2.Server server1 = new tp2.Server((-1));
    server1.update();
    server1.update();
    tp2.IP iP4 = null;
    boolean b5 = server1.removeBan(iP4);
    long long6 = server1.getLastUpdate();
    boolean b7 = server1.repOK();
    tp2.IP iP8 = null;
    boolean b9 = server1.connect(iP8);
    tp2.IP iP10 = null;
    boolean b11 = server1.removeBan(iP10);
    tp2.IP iP12 = null;
    boolean b13 = server1.addBan(iP12);
    tp2.IP iP14 = null;
    // The following exception was thrown during execution in test generation
    try {
      boolean b15 = server1.removeBan(iP14);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long6 == 250000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);

  }

  @Test
  public void test406() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test406"); }


    tp2.Server server1 = new tp2.Server(1);
    tp2.IP iP2 = null;
    boolean b3 = server1.removeBan(iP2);
    server1.update();
    tp2.IP iP5 = null;
    boolean b6 = server1.removeBan(iP5);
    tp2.IP iP7 = null;
    boolean b8 = server1.connect(iP7);
    tp2.IP iP9 = null;
    boolean b10 = server1.addBan(iP9);
    long long11 = server1.getLastUpdate();
    tp2.IP iP12 = null;
    // The following exception was thrown during execution in test generation
    try {
      boolean b13 = server1.connect(iP12);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long11 == 250000L);

  }

  @Test
  public void test407() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test407"); }


    tp2.Server server0 = new tp2.Server();
    tp2.IP iP1 = null;
    boolean b2 = server0.removeException(iP1);
    server0.update();
    long long4 = server0.getLastUpdate();
    tp2.IP iP5 = null;
    boolean b6 = server0.removeException(iP5);
    tp2.IP iP7 = null;
    boolean b8 = server0.removeException(iP7);
    tp2.IP iP9 = null;
    boolean b10 = server0.removeBan(iP9);
    server0.update();
    java.lang.String str12 = server0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long4 == 1465347898735L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Server [lastUpdate=1465347898735, exceptions=(), bans={}]"+ "'", str12.equals("Server [lastUpdate=1465347898735, exceptions=(), bans={}]"));

  }

  @Test
  public void test408() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test408"); }


    tp2.Server server1 = new tp2.Server(1);
    tp2.IP iP2 = null;
    boolean b3 = server1.removeException(iP2);
    tp2.IP iP4 = null;
    boolean b5 = server1.removeBan(iP4);
    boolean b6 = server1.repOK();
    tp2.IP iP7 = null;
    boolean b8 = server1.connect(iP7);
    boolean b9 = server1.repOK();
    server1.update();
    tp2.IP iP11 = null;
    boolean b12 = server1.addBan(iP11);
    tp2.IP iP13 = null;
    // The following exception was thrown during execution in test generation
    try {
      boolean b14 = server1.connect(iP13);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);

  }

  @Test
  public void test409() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test409"); }


    tp2.Server server1 = new tp2.Server(1);
    tp2.IP iP2 = null;
    boolean b3 = server1.removeBan(iP2);
    server1.update();
    tp2.IP iP5 = null;
    boolean b6 = server1.removeBan(iP5);
    tp2.IP iP7 = null;
    boolean b8 = server1.removeBan(iP7);
    tp2.IP iP9 = null;
    boolean b10 = server1.removeException(iP9);
    boolean b11 = server1.repOK();
    long long12 = server1.getLastUpdate();
    tp2.IP iP13 = null;
    // The following exception was thrown during execution in test generation
    try {
      boolean b14 = server1.addException(iP13);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long12 == 250000L);

  }

  @Test
  public void test410() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test410"); }


    tp2.Server server1 = new tp2.Server(1);
    tp2.IP iP2 = null;
    boolean b3 = server1.removeBan(iP2);
    server1.update();
    long long5 = server1.getLastUpdate();
    tp2.IP iP6 = null;
    boolean b7 = server1.connect(iP6);
    tp2.IP iP8 = null;
    boolean b9 = server1.removeBan(iP8);
    boolean b10 = server1.repOK();
    tp2.ITime iTime11 = null;
    server1.setTime(iTime11);
    tp2.IP iP13 = null;
    boolean b14 = server1.connect(iP13);
    tp2.IP iP15 = null;
    // The following exception was thrown during execution in test generation
    try {
      boolean b16 = server1.addException(iP15);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long5 == 250000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);

  }

  @Test
  public void test411() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test411"); }


    tp2.Server server0 = new tp2.Server();
    boolean b1 = server0.repOK();
    tp2.IP iP2 = null;
    boolean b3 = server0.removeBan(iP2);
    boolean b4 = server0.repOK();
    tp2.IP iP5 = null;
    boolean b6 = server0.removeBan(iP5);
    server0.update();
    tp2.IP iP8 = null;
    boolean b9 = server0.connect(iP8);
    tp2.ITime iTime10 = null;
    server0.setTime(iTime10);
    tp2.IP iP12 = null;
    boolean b13 = server0.connect(iP12);
    tp2.IP iP14 = null;
    boolean b15 = server0.removeException(iP14);
    boolean b16 = server0.repOK();
    tp2.IP iP17 = null;
    boolean b18 = server0.removeBan(iP17);
    long long19 = server0.getLastUpdate();
    // The following exception was thrown during execution in test generation
    try {
      server0.update();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long19 == 1465347898741L);

  }

  @Test
  public void test412() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test412"); }


    tp2.Server server0 = new tp2.Server();
    boolean b1 = server0.repOK();
    server0.update();
    server0.update();
    tp2.IP iP4 = null;
    boolean b5 = server0.removeBan(iP4);
    tp2.IP iP6 = null;
    boolean b7 = server0.removeBan(iP6);
    java.lang.String str8 = server0.toString();
    tp2.IP iP9 = null;
    boolean b10 = server0.removeException(iP9);
    server0.update();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Server [lastUpdate=1465347898742, exceptions=(), bans={}]"+ "'", str8.equals("Server [lastUpdate=1465347898742, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);

  }

  @Test
  public void test413() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test413"); }


    tp2.Server server1 = new tp2.Server(1);
    tp2.IP iP2 = null;
    boolean b3 = server1.removeBan(iP2);
    server1.update();
    tp2.IP iP5 = null;
    boolean b6 = server1.removeBan(iP5);
    tp2.IP iP7 = null;
    boolean b8 = server1.removeBan(iP7);
    tp2.IP iP9 = null;
    boolean b10 = server1.removeBan(iP9);
    tp2.IP iP11 = null;
    boolean b12 = server1.removeException(iP11);
    tp2.ITime iTime13 = null;
    server1.setTime(iTime13);
    tp2.IP iP15 = null;
    // The following exception was thrown during execution in test generation
    try {
      boolean b16 = server1.addBan(iP15);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);

  }

  @Test
  public void test414() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test414"); }


    tp2.Server server1 = new tp2.Server(1);
    tp2.IP iP2 = null;
    boolean b3 = server1.removeBan(iP2);
    server1.update();
    tp2.IP iP5 = null;
    boolean b6 = server1.removeBan(iP5);
    long long7 = server1.getLastUpdate();
    java.lang.String str8 = server1.toString();
    server1.update();
    long long10 = server1.getLastUpdate();
    long long11 = server1.getLastUpdate();
    tp2.IP iP12 = null;
    // The following exception was thrown during execution in test generation
    try {
      boolean b13 = server1.addException(iP12);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long7 == 250000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Server [lastUpdate=250000, exceptions=(), bans={}]"+ "'", str8.equals("Server [lastUpdate=250000, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long10 == 250000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long11 == 250000L);

  }

  @Test
  public void test415() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test415"); }


    tp2.Server server1 = new tp2.Server((-1));
    server1.update();
    tp2.IP iP3 = null;
    boolean b4 = server1.removeException(iP3);
    long long5 = server1.getLastUpdate();
    tp2.ITime iTime6 = null;
    server1.setTime(iTime6);
    tp2.IP iP8 = null;
    boolean b9 = server1.connect(iP8);
    long long10 = server1.getLastUpdate();
    tp2.ITime iTime11 = null;
    server1.setTime(iTime11);
    java.lang.String str13 = server1.toString();
    tp2.IP iP14 = null;
    // The following exception was thrown during execution in test generation
    try {
      boolean b15 = server1.addException(iP14);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long5 == 250000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long10 == 250000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Server [lastUpdate=250000, exceptions=(), bans={}]"+ "'", str13.equals("Server [lastUpdate=250000, exceptions=(), bans={}]"));

  }

  @Test
  public void test416() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test416"); }


    tp2.Server server1 = new tp2.Server(1);
    tp2.IP iP2 = null;
    boolean b3 = server1.removeBan(iP2);
    tp2.ITime iTime4 = null;
    server1.setTime(iTime4);
    tp2.IP iP6 = null;
    boolean b7 = server1.removeBan(iP6);
    java.lang.String str8 = server1.toString();
    tp2.ITime iTime9 = null;
    server1.setTime(iTime9);
    tp2.IP iP11 = null;
    boolean b12 = server1.removeBan(iP11);
    java.lang.String str13 = server1.toString();
    java.lang.String str14 = server1.toString();
    tp2.ITime iTime15 = null;
    server1.setTime(iTime15);
    tp2.IP iP17 = null;
    boolean b18 = server1.connect(iP17);
    // The following exception was thrown during execution in test generation
    try {
      server1.update();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Server [lastUpdate=null, exceptions=(), bans={}]"+ "'", str8.equals("Server [lastUpdate=null, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Server [lastUpdate=null, exceptions=(), bans={}]"+ "'", str13.equals("Server [lastUpdate=null, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "Server [lastUpdate=null, exceptions=(), bans={}]"+ "'", str14.equals("Server [lastUpdate=null, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);

  }

  @Test
  public void test417() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test417"); }


    tp2.Server server1 = new tp2.Server(1);
    tp2.IP iP2 = null;
    boolean b3 = server1.removeBan(iP2);
    tp2.ITime iTime4 = null;
    server1.setTime(iTime4);
    tp2.IP iP6 = null;
    boolean b7 = server1.removeBan(iP6);
    tp2.ITime iTime8 = null;
    server1.setTime(iTime8);
    tp2.ITime iTime10 = null;
    server1.setTime(iTime10);
    tp2.ITime iTime12 = null;
    server1.setTime(iTime12);
    tp2.ITime iTime14 = null;
    server1.setTime(iTime14);
    tp2.ITime iTime16 = null;
    server1.setTime(iTime16);
    tp2.IP iP18 = null;
    boolean b19 = server1.connect(iP18);
    tp2.IP iP20 = null;
    // The following exception was thrown during execution in test generation
    try {
      boolean b21 = server1.addException(iP20);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);

  }

  @Test
  public void test418() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test418"); }


    tp2.Server server0 = new tp2.Server();
    server0.update();
    tp2.IP iP2 = null;
    boolean b3 = server0.removeBan(iP2);
    tp2.ITime iTime4 = null;
    server0.setTime(iTime4);
    tp2.IP iP6 = null;
    boolean b7 = server0.connect(iP6);
    long long8 = server0.getLastUpdate();
    tp2.IP iP9 = null;
    // The following exception was thrown during execution in test generation
    try {
      boolean b10 = server0.addBan(iP9);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long8 == 1465347898776L);

  }

  @Test
  public void test419() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test419"); }


    tp2.Server server0 = new tp2.Server();
    server0.update();
    tp2.IP iP2 = null;
    boolean b3 = server0.removeBan(iP2);
    long long4 = server0.getLastUpdate();
    boolean b5 = server0.repOK();
    tp2.IP iP6 = null;
    boolean b7 = server0.removeException(iP6);
    tp2.ITime iTime8 = null;
    server0.setTime(iTime8);
    tp2.IP iP10 = null;
    // The following exception was thrown during execution in test generation
    try {
      boolean b11 = server0.addException(iP10);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long4 == 1465347898777L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);

  }

  @Test
  public void test420() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test420"); }


    tp2.Server server1 = new tp2.Server(1);
    tp2.IP iP2 = null;
    boolean b3 = server1.removeBan(iP2);
    tp2.ITime iTime4 = null;
    server1.setTime(iTime4);
    tp2.IP iP6 = null;
    boolean b7 = server1.removeBan(iP6);
    tp2.ITime iTime8 = null;
    server1.setTime(iTime8);
    tp2.ITime iTime10 = null;
    server1.setTime(iTime10);
    boolean b12 = server1.repOK();
    tp2.IP iP13 = null;
    boolean b14 = server1.connect(iP13);
    java.lang.String str15 = server1.toString();
    boolean b16 = server1.repOK();
    tp2.IP iP17 = null;
    boolean b18 = server1.removeBan(iP17);
    // The following exception was thrown during execution in test generation
    try {
      long long19 = server1.getLastUpdate();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "Server [lastUpdate=null, exceptions=(), bans={}]"+ "'", str15.equals("Server [lastUpdate=null, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);

  }

  @Test
  public void test421() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test421"); }


    tp2.Server server1 = new tp2.Server(1);
    tp2.IP iP2 = null;
    boolean b3 = server1.removeBan(iP2);
    tp2.ITime iTime4 = null;
    server1.setTime(iTime4);
    tp2.IP iP6 = null;
    boolean b7 = server1.removeBan(iP6);
    java.lang.String str8 = server1.toString();
    tp2.IP iP9 = null;
    boolean b10 = server1.connect(iP9);
    tp2.IP iP11 = null;
    boolean b12 = server1.removeException(iP11);
    boolean b13 = server1.repOK();
    // The following exception was thrown during execution in test generation
    try {
      server1.update();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Server [lastUpdate=null, exceptions=(), bans={}]"+ "'", str8.equals("Server [lastUpdate=null, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);

  }

  @Test
  public void test422() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test422"); }


    tp2.Server server1 = new tp2.Server(1);
    tp2.IP iP2 = null;
    boolean b3 = server1.removeBan(iP2);
    tp2.ITime iTime4 = null;
    server1.setTime(iTime4);
    tp2.IP iP6 = null;
    boolean b7 = server1.removeBan(iP6);
    tp2.ITime iTime8 = null;
    server1.setTime(iTime8);
    java.lang.String str10 = server1.toString();
    boolean b11 = server1.repOK();
    tp2.IP iP12 = null;
    boolean b13 = server1.connect(iP12);
    tp2.IP iP14 = null;
    boolean b15 = server1.connect(iP14);
    java.lang.String str16 = server1.toString();
    tp2.IP iP17 = null;
    boolean b18 = server1.removeException(iP17);
    tp2.IP iP19 = null;
    // The following exception was thrown during execution in test generation
    try {
      boolean b20 = server1.addBan(iP19);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Server [lastUpdate=null, exceptions=(), bans={}]"+ "'", str10.equals("Server [lastUpdate=null, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "Server [lastUpdate=null, exceptions=(), bans={}]"+ "'", str16.equals("Server [lastUpdate=null, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);

  }

  @Test
  public void test423() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test423"); }


    tp2.Server server0 = new tp2.Server();
    server0.update();
    tp2.IP iP2 = null;
    boolean b3 = server0.removeBan(iP2);
    tp2.ITime iTime4 = null;
    server0.setTime(iTime4);
    tp2.IP iP6 = null;
    boolean b7 = server0.connect(iP6);
    boolean b8 = server0.repOK();
    java.lang.String str9 = server0.toString();
    tp2.IP iP10 = null;
    boolean b11 = server0.removeBan(iP10);
    java.lang.String str12 = server0.toString();
    tp2.IP iP13 = null;
    boolean b14 = server0.removeException(iP13);
    tp2.IP iP15 = null;
    // The following exception was thrown during execution in test generation
    try {
      boolean b16 = server0.addException(iP15);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Server [lastUpdate=1465347898800, exceptions=(), bans={}]"+ "'", str9.equals("Server [lastUpdate=1465347898800, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Server [lastUpdate=1465347898800, exceptions=(), bans={}]"+ "'", str12.equals("Server [lastUpdate=1465347898800, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);

  }

  @Test
  public void test424() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test424"); }


    tp2.Server server1 = new tp2.Server(1);
    tp2.IP iP2 = null;
    boolean b3 = server1.removeBan(iP2);
    server1.update();
    java.lang.String str5 = server1.toString();
    tp2.IP iP6 = null;
    boolean b7 = server1.removeBan(iP6);
    tp2.IP iP8 = null;
    boolean b9 = server1.removeBan(iP8);
    tp2.IP iP10 = null;
    boolean b11 = server1.addBan(iP10);
    tp2.IP iP12 = null;
    // The following exception was thrown during execution in test generation
    try {
      boolean b13 = server1.addException(iP12);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Server [lastUpdate=250000, exceptions=(), bans={}]"+ "'", str5.equals("Server [lastUpdate=250000, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);

  }

  @Test
  public void test425() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test425"); }


    tp2.Server server1 = new tp2.Server(0);
    tp2.IP iP2 = null;
    boolean b3 = server1.removeException(iP2);
    tp2.ITime iTime4 = null;
    server1.setTime(iTime4);
    tp2.IP iP6 = null;
    boolean b7 = server1.connect(iP6);
    tp2.ITime iTime8 = null;
    server1.setTime(iTime8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);

  }

  @Test
  public void test426() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test426"); }


    tp2.Server server1 = new tp2.Server(1);
    tp2.IP iP2 = null;
    boolean b3 = server1.removeBan(iP2);
    server1.update();
    tp2.IP iP5 = null;
    boolean b6 = server1.removeBan(iP5);
    long long7 = server1.getLastUpdate();
    server1.update();
    tp2.ITime iTime9 = null;
    server1.setTime(iTime9);
    tp2.IP iP11 = null;
    // The following exception was thrown during execution in test generation
    try {
      boolean b12 = server1.addBan(iP11);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long7 == 250000L);

  }

  @Test
  public void test427() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test427"); }


    tp2.Server server1 = new tp2.Server((-1));
    server1.update();
    tp2.IP iP3 = null;
    boolean b4 = server1.removeException(iP3);
    long long5 = server1.getLastUpdate();
    java.lang.String str6 = server1.toString();
    java.lang.String str7 = server1.toString();
    boolean b8 = server1.repOK();
    server1.update();
    server1.update();
    tp2.ITime iTime11 = null;
    server1.setTime(iTime11);
    tp2.IP iP13 = null;
    // The following exception was thrown during execution in test generation
    try {
      boolean b14 = server1.addBan(iP13);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long5 == 250000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Server [lastUpdate=250000, exceptions=(), bans={}]"+ "'", str6.equals("Server [lastUpdate=250000, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Server [lastUpdate=250000, exceptions=(), bans={}]"+ "'", str7.equals("Server [lastUpdate=250000, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);

  }

  @Test
  public void test428() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test428"); }


    tp2.Server server0 = new tp2.Server();
    boolean b1 = server0.repOK();
    server0.update();
    server0.update();
    tp2.IP iP4 = null;
    boolean b5 = server0.removeBan(iP4);
    tp2.IP iP6 = null;
    boolean b7 = server0.removeException(iP6);
    tp2.IP iP8 = null;
    boolean b9 = server0.removeException(iP8);
    tp2.IP iP10 = null;
    // The following exception was thrown during execution in test generation
    try {
      boolean b11 = server0.addException(iP10);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);

  }

  @Test
  public void test429() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test429"); }


    tp2.Server server0 = new tp2.Server();
    server0.update();
    tp2.IP iP2 = null;
    boolean b3 = server0.removeBan(iP2);
    server0.update();
    java.lang.String str5 = server0.toString();
    tp2.IP iP6 = null;
    boolean b7 = server0.removeException(iP6);
    boolean b8 = server0.repOK();
    tp2.ITime iTime9 = null;
    server0.setTime(iTime9);
    tp2.ITime iTime11 = null;
    server0.setTime(iTime11);
    tp2.IP iP13 = null;
    boolean b14 = server0.connect(iP13);
    tp2.IP iP15 = null;
    boolean b16 = server0.removeBan(iP15);
    java.lang.String str17 = server0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Server [lastUpdate=1465347898820, exceptions=(), bans={}]"+ "'", str5.equals("Server [lastUpdate=1465347898820, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "Server [lastUpdate=1465347898820, exceptions=(), bans={}]"+ "'", str17.equals("Server [lastUpdate=1465347898820, exceptions=(), bans={}]"));

  }

  @Test
  public void test430() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test430"); }


    tp2.Server server0 = new tp2.Server();
    server0.update();
    tp2.IP iP2 = null;
    boolean b3 = server0.removeBan(iP2);
    tp2.ITime iTime4 = null;
    server0.setTime(iTime4);
    tp2.IP iP6 = null;
    boolean b7 = server0.connect(iP6);
    tp2.IP iP8 = null;
    boolean b9 = server0.connect(iP8);
    tp2.IP iP10 = null;
    boolean b11 = server0.removeBan(iP10);
    tp2.IP iP12 = null;
    boolean b13 = server0.removeException(iP12);
    tp2.IP iP14 = null;
    boolean b15 = server0.removeException(iP14);
    tp2.IP iP16 = null;
    // The following exception was thrown during execution in test generation
    try {
      boolean b17 = server0.addBan(iP16);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);

  }

  @Test
  public void test431() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test431"); }


    tp2.Server server1 = new tp2.Server(1);
    tp2.IP iP2 = null;
    boolean b3 = server1.removeBan(iP2);
    server1.update();
    java.lang.String str5 = server1.toString();
    tp2.IP iP6 = null;
    boolean b7 = server1.connect(iP6);
    boolean b8 = server1.repOK();
    long long9 = server1.getLastUpdate();
    long long10 = server1.getLastUpdate();
    tp2.IP iP11 = null;
    boolean b12 = server1.removeBan(iP11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Server [lastUpdate=250000, exceptions=(), bans={}]"+ "'", str5.equals("Server [lastUpdate=250000, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long9 == 250000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long10 == 250000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);

  }

  @Test
  public void test432() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test432"); }


    tp2.Server server1 = new tp2.Server((-1));
    server1.update();
    server1.update();
    tp2.IP iP4 = null;
    boolean b5 = server1.removeBan(iP4);
    long long6 = server1.getLastUpdate();
    boolean b7 = server1.repOK();
    tp2.IP iP8 = null;
    boolean b9 = server1.connect(iP8);
    tp2.IP iP10 = null;
    boolean b11 = server1.removeBan(iP10);
    tp2.IP iP12 = null;
    boolean b13 = server1.connect(iP12);
    server1.update();
    tp2.IP iP15 = null;
    boolean b16 = server1.addBan(iP15);
    tp2.ITime iTime17 = null;
    server1.setTime(iTime17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long6 == 250000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);

  }

  @Test
  public void test433() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test433"); }


    tp2.Server server0 = new tp2.Server();
    boolean b1 = server0.repOK();
    tp2.ITime iTime2 = null;
    server0.setTime(iTime2);
    // The following exception was thrown during execution in test generation
    try {
      server0.update();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);

  }

  @Test
  public void test434() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test434"); }


    tp2.Server server1 = new tp2.Server(1);
    tp2.IP iP2 = null;
    boolean b3 = server1.removeBan(iP2);
    server1.update();
    tp2.IP iP5 = null;
    boolean b6 = server1.removeBan(iP5);
    java.lang.String str7 = server1.toString();
    long long8 = server1.getLastUpdate();
    server1.update();
    long long10 = server1.getLastUpdate();
    server1.update();
    tp2.IP iP12 = null;
    boolean b13 = server1.removeException(iP12);
    long long14 = server1.getLastUpdate();
    tp2.IP iP15 = null;
    boolean b16 = server1.addBan(iP15);
    tp2.IP iP17 = null;
    // The following exception was thrown during execution in test generation
    try {
      boolean b18 = server1.removeBan(iP17);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Server [lastUpdate=250000, exceptions=(), bans={}]"+ "'", str7.equals("Server [lastUpdate=250000, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long8 == 250000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long10 == 250000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long14 == 250000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);

  }

  @Test
  public void test435() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test435"); }


    tp2.Server server0 = new tp2.Server();
    boolean b1 = server0.repOK();
    tp2.ITime iTime2 = null;
    server0.setTime(iTime2);
    boolean b4 = server0.repOK();
    tp2.IP iP5 = null;
    boolean b6 = server0.removeBan(iP5);
    boolean b7 = server0.repOK();
    tp2.IP iP8 = null;
    boolean b9 = server0.removeException(iP8);
    java.lang.String str10 = server0.toString();
    // The following exception was thrown during execution in test generation
    try {
      long long11 = server0.getLastUpdate();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Server [lastUpdate=null, exceptions=(), bans={}]"+ "'", str10.equals("Server [lastUpdate=null, exceptions=(), bans={}]"));

  }

  @Test
  public void test436() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test436"); }


    tp2.Server server1 = new tp2.Server(1);
    tp2.IP iP2 = null;
    boolean b3 = server1.removeException(iP2);
    java.lang.String str4 = server1.toString();
    tp2.IP iP5 = null;
    boolean b6 = server1.connect(iP5);
    java.lang.String str7 = server1.toString();
    java.lang.String str8 = server1.toString();
    boolean b9 = server1.repOK();
    tp2.IP iP10 = null;
    boolean b11 = server1.connect(iP10);
    tp2.IP iP12 = null;
    boolean b13 = server1.addBan(iP12);
    tp2.IP iP14 = null;
    boolean b15 = server1.removeException(iP14);
    tp2.IP iP16 = null;
    // The following exception was thrown during execution in test generation
    try {
      boolean b17 = server1.addException(iP16);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Server [lastUpdate=null, exceptions=(), bans={}]"+ "'", str4.equals("Server [lastUpdate=null, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Server [lastUpdate=null, exceptions=(), bans={}]"+ "'", str7.equals("Server [lastUpdate=null, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Server [lastUpdate=null, exceptions=(), bans={}]"+ "'", str8.equals("Server [lastUpdate=null, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);

  }

  @Test
  public void test437() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test437"); }


    tp2.Server server1 = new tp2.Server(1);
    tp2.IP iP2 = null;
    boolean b3 = server1.removeBan(iP2);
    tp2.ITime iTime4 = null;
    server1.setTime(iTime4);
    tp2.IP iP6 = null;
    boolean b7 = server1.removeBan(iP6);
    java.lang.String str8 = server1.toString();
    java.lang.String str9 = server1.toString();
    tp2.IP iP10 = null;
    boolean b11 = server1.removeException(iP10);
    java.lang.String str12 = server1.toString();
    tp2.IP iP13 = null;
    boolean b14 = server1.connect(iP13);
    tp2.IP iP15 = null;
    boolean b16 = server1.removeBan(iP15);
    tp2.IP iP17 = null;
    // The following exception was thrown during execution in test generation
    try {
      boolean b18 = server1.addException(iP17);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Server [lastUpdate=null, exceptions=(), bans={}]"+ "'", str8.equals("Server [lastUpdate=null, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Server [lastUpdate=null, exceptions=(), bans={}]"+ "'", str9.equals("Server [lastUpdate=null, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Server [lastUpdate=null, exceptions=(), bans={}]"+ "'", str12.equals("Server [lastUpdate=null, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);

  }

  @Test
  public void test438() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test438"); }


    tp2.Server server1 = new tp2.Server(0);
    tp2.IP iP2 = null;
    boolean b3 = server1.removeException(iP2);
    server1.update();
    tp2.IP iP5 = null;
    boolean b6 = server1.connect(iP5);
    java.lang.String str7 = server1.toString();
    tp2.IP iP8 = null;
    boolean b9 = server1.addBan(iP8);
    tp2.IP iP10 = null;
    // The following exception was thrown during execution in test generation
    try {
      boolean b11 = server1.addBan(iP10);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Server [lastUpdate=250000, exceptions=(), bans={}]"+ "'", str7.equals("Server [lastUpdate=250000, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);

  }

  @Test
  public void test439() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test439"); }


    tp2.Server server0 = new tp2.Server();
    server0.update();
    tp2.IP iP2 = null;
    boolean b3 = server0.removeBan(iP2);
    server0.update();
    java.lang.String str5 = server0.toString();
    java.lang.String str6 = server0.toString();
    tp2.IP iP7 = null;
    boolean b8 = server0.addBan(iP7);
    long long9 = server0.getLastUpdate();
    long long10 = server0.getLastUpdate();
    tp2.IP iP11 = null;
    // The following exception was thrown during execution in test generation
    try {
      boolean b12 = server0.addException(iP11);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Server [lastUpdate=1465347898847, exceptions=(), bans={}]"+ "'", str5.equals("Server [lastUpdate=1465347898847, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Server [lastUpdate=1465347898847, exceptions=(), bans={}]"+ "'", str6.equals("Server [lastUpdate=1465347898847, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long9 == 1465347898847L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long10 == 1465347898847L);

  }

  @Test
  public void test440() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test440"); }


    tp2.Server server0 = new tp2.Server();
    server0.update();
    tp2.IP iP2 = null;
    boolean b3 = server0.removeBan(iP2);
    server0.update();
    java.lang.String str5 = server0.toString();
    tp2.IP iP6 = null;
    boolean b7 = server0.removeException(iP6);
    boolean b8 = server0.repOK();
    tp2.IP iP9 = null;
    boolean b10 = server0.addBan(iP9);
    boolean b11 = server0.repOK();
    tp2.IP iP12 = null;
    boolean b13 = server0.removeException(iP12);
    java.lang.String str14 = server0.toString();
    server0.update();
    tp2.IP iP16 = null;
    // The following exception was thrown during execution in test generation
    try {
      boolean b17 = server0.addBan(iP16);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Server [lastUpdate=1465347898848, exceptions=(), bans={}]"+ "'", str5.equals("Server [lastUpdate=1465347898848, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "Server [lastUpdate=1465347898848, exceptions=(), bans={[IPBan [ip=null, expires=1465347958848]]}]"+ "'", str14.equals("Server [lastUpdate=1465347898848, exceptions=(), bans={[IPBan [ip=null, expires=1465347958848]]}]"));

  }

  @Test
  public void test441() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test441"); }


    tp2.Server server1 = new tp2.Server(1);
    tp2.IP iP2 = null;
    boolean b3 = server1.removeBan(iP2);
    tp2.ITime iTime4 = null;
    server1.setTime(iTime4);
    tp2.IP iP6 = null;
    boolean b7 = server1.removeBan(iP6);
    java.lang.String str8 = server1.toString();
    tp2.ITime iTime9 = null;
    server1.setTime(iTime9);
    tp2.IP iP11 = null;
    boolean b12 = server1.removeBan(iP11);
    java.lang.String str13 = server1.toString();
    tp2.ITime iTime14 = null;
    server1.setTime(iTime14);
    tp2.ITime iTime16 = null;
    server1.setTime(iTime16);
    tp2.IP iP18 = null;
    boolean b19 = server1.connect(iP18);
    tp2.IP iP20 = null;
    boolean b21 = server1.removeBan(iP20);
    tp2.IP iP22 = null;
    boolean b23 = server1.removeException(iP22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Server [lastUpdate=null, exceptions=(), bans={}]"+ "'", str8.equals("Server [lastUpdate=null, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Server [lastUpdate=null, exceptions=(), bans={}]"+ "'", str13.equals("Server [lastUpdate=null, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);

  }

  @Test
  public void test442() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test442"); }


    tp2.Server server1 = new tp2.Server(1);
    tp2.IP iP2 = null;
    boolean b3 = server1.removeBan(iP2);
    server1.update();
    tp2.IP iP5 = null;
    boolean b6 = server1.removeBan(iP5);
    tp2.IP iP7 = null;
    boolean b8 = server1.removeBan(iP7);
    java.lang.String str9 = server1.toString();
    tp2.IP iP10 = null;
    boolean b11 = server1.connect(iP10);
    tp2.IP iP12 = null;
    boolean b13 = server1.removeBan(iP12);
    java.lang.String str14 = server1.toString();
    java.lang.String str15 = server1.toString();
    long long16 = server1.getLastUpdate();
    tp2.IP iP17 = null;
    boolean b18 = server1.addBan(iP17);
    long long19 = server1.getLastUpdate();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Server [lastUpdate=250000, exceptions=(), bans={}]"+ "'", str9.equals("Server [lastUpdate=250000, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "Server [lastUpdate=250000, exceptions=(), bans={}]"+ "'", str14.equals("Server [lastUpdate=250000, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "Server [lastUpdate=250000, exceptions=(), bans={}]"+ "'", str15.equals("Server [lastUpdate=250000, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long16 == 250000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long19 == 250000L);

  }

  @Test
  public void test443() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test443"); }


    tp2.Server server1 = new tp2.Server(1);
    tp2.IP iP2 = null;
    boolean b3 = server1.removeException(iP2);
    java.lang.String str4 = server1.toString();
    tp2.IP iP5 = null;
    boolean b6 = server1.connect(iP5);
    java.lang.String str7 = server1.toString();
    java.lang.String str8 = server1.toString();
    java.lang.String str9 = server1.toString();
    java.lang.String str10 = server1.toString();
    tp2.IP iP11 = null;
    boolean b12 = server1.connect(iP11);
    tp2.IP iP13 = null;
    boolean b14 = server1.connect(iP13);
    tp2.IP iP15 = null;
    boolean b16 = server1.addBan(iP15);
    tp2.IP iP17 = null;
    // The following exception was thrown during execution in test generation
    try {
      boolean b18 = server1.connect(iP17);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Server [lastUpdate=null, exceptions=(), bans={}]"+ "'", str4.equals("Server [lastUpdate=null, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Server [lastUpdate=null, exceptions=(), bans={}]"+ "'", str7.equals("Server [lastUpdate=null, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Server [lastUpdate=null, exceptions=(), bans={}]"+ "'", str8.equals("Server [lastUpdate=null, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Server [lastUpdate=null, exceptions=(), bans={}]"+ "'", str9.equals("Server [lastUpdate=null, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Server [lastUpdate=null, exceptions=(), bans={}]"+ "'", str10.equals("Server [lastUpdate=null, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);

  }

  @Test
  public void test444() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test444"); }


    tp2.Server server1 = new tp2.Server(1);
    tp2.IP iP2 = null;
    boolean b3 = server1.removeBan(iP2);
    server1.update();
    java.lang.String str5 = server1.toString();
    long long6 = server1.getLastUpdate();
    java.lang.String str7 = server1.toString();
    tp2.IP iP8 = null;
    boolean b9 = server1.addBan(iP8);
    tp2.IP iP10 = null;
    // The following exception was thrown during execution in test generation
    try {
      boolean b11 = server1.connect(iP10);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Server [lastUpdate=250000, exceptions=(), bans={}]"+ "'", str5.equals("Server [lastUpdate=250000, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long6 == 250000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Server [lastUpdate=250000, exceptions=(), bans={}]"+ "'", str7.equals("Server [lastUpdate=250000, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);

  }

  @Test
  public void test445() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test445"); }


    tp2.Server server0 = new tp2.Server();
    server0.update();
    tp2.IP iP2 = null;
    boolean b3 = server0.removeBan(iP2);
    tp2.ITime iTime4 = null;
    server0.setTime(iTime4);
    tp2.IP iP6 = null;
    boolean b7 = server0.connect(iP6);
    tp2.IP iP8 = null;
    boolean b9 = server0.connect(iP8);
    boolean b10 = server0.repOK();
    // The following exception was thrown during execution in test generation
    try {
      server0.update();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);

  }

  @Test
  public void test446() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test446"); }


    tp2.Server server1 = new tp2.Server(1);
    tp2.IP iP2 = null;
    boolean b3 = server1.removeBan(iP2);
    server1.update();
    tp2.IP iP5 = null;
    boolean b6 = server1.removeBan(iP5);
    tp2.IP iP7 = null;
    boolean b8 = server1.removeException(iP7);
    boolean b9 = server1.repOK();
    server1.update();
    boolean b11 = server1.repOK();
    server1.update();
    boolean b13 = server1.repOK();
    tp2.IP iP14 = null;
    boolean b15 = server1.connect(iP14);
    tp2.IP iP16 = null;
    boolean b17 = server1.removeBan(iP16);
    tp2.IP iP18 = null;
    boolean b19 = server1.removeException(iP18);
    tp2.IP iP20 = null;
    boolean b21 = server1.connect(iP20);
    server1.update();
    tp2.IP iP23 = null;
    // The following exception was thrown during execution in test generation
    try {
      boolean b24 = server1.addException(iP23);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);

  }

  @Test
  public void test447() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test447"); }


    tp2.Server server0 = new tp2.Server();
    server0.update();
    tp2.IP iP2 = null;
    boolean b3 = server0.removeBan(iP2);
    tp2.IP iP4 = null;
    boolean b5 = server0.removeBan(iP4);
    java.lang.String str6 = server0.toString();
    long long7 = server0.getLastUpdate();
    tp2.ITime iTime8 = null;
    server0.setTime(iTime8);
    tp2.IP iP10 = null;
    boolean b11 = server0.removeBan(iP10);
    tp2.IP iP12 = null;
    // The following exception was thrown during execution in test generation
    try {
      boolean b13 = server0.addBan(iP12);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Server [lastUpdate=1465347898878, exceptions=(), bans={}]"+ "'", str6.equals("Server [lastUpdate=1465347898878, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long7 == 1465347898878L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);

  }

  @Test
  public void test448() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test448"); }


    tp2.Server server1 = new tp2.Server(0);
    tp2.IP iP2 = null;
    boolean b3 = server1.removeException(iP2);
    server1.update();
    long long5 = server1.getLastUpdate();
    tp2.IP iP6 = null;
    boolean b7 = server1.connect(iP6);
    tp2.IP iP8 = null;
    boolean b9 = server1.removeException(iP8);
    tp2.IP iP10 = null;
    // The following exception was thrown during execution in test generation
    try {
      boolean b11 = server1.addException(iP10);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long5 == 250000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);

  }

  @Test
  public void test449() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test449"); }


    tp2.Server server0 = new tp2.Server();
    server0.update();
    tp2.IP iP2 = null;
    boolean b3 = server0.removeBan(iP2);
    server0.update();
    tp2.ITime iTime5 = null;
    server0.setTime(iTime5);
    java.lang.String str7 = server0.toString();
    java.lang.String str8 = server0.toString();
    tp2.IP iP9 = null;
    boolean b10 = server0.removeBan(iP9);
    // The following exception was thrown during execution in test generation
    try {
      server0.update();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Server [lastUpdate=1465347898884, exceptions=(), bans={}]"+ "'", str7.equals("Server [lastUpdate=1465347898884, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Server [lastUpdate=1465347898884, exceptions=(), bans={}]"+ "'", str8.equals("Server [lastUpdate=1465347898884, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);

  }

  @Test
  public void test450() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test450"); }


    tp2.Server server1 = new tp2.Server((-1));
    server1.update();
    server1.update();
    tp2.IP iP4 = null;
    boolean b5 = server1.removeBan(iP4);
    long long6 = server1.getLastUpdate();
    tp2.ITime iTime7 = null;
    server1.setTime(iTime7);
    boolean b9 = server1.repOK();
    tp2.IP iP10 = null;
    // The following exception was thrown during execution in test generation
    try {
      boolean b11 = server1.addException(iP10);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long6 == 250000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);

  }

  @Test
  public void test451() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test451"); }


    tp2.Server server0 = new tp2.Server();
    server0.update();
    tp2.IP iP2 = null;
    boolean b3 = server0.removeException(iP2);
    boolean b4 = server0.repOK();
    tp2.IP iP5 = null;
    boolean b6 = server0.removeBan(iP5);
    tp2.ITime iTime7 = null;
    server0.setTime(iTime7);
    tp2.IP iP9 = null;
    boolean b10 = server0.connect(iP9);
    tp2.IP iP11 = null;
    boolean b12 = server0.connect(iP11);
    tp2.IP iP13 = null;
    // The following exception was thrown during execution in test generation
    try {
      boolean b14 = server0.addBan(iP13);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);

  }

  @Test
  public void test452() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test452"); }


    tp2.Server server1 = new tp2.Server(100);
    tp2.IP iP2 = null;
    boolean b3 = server1.connect(iP2);
    boolean b4 = server1.repOK();
    boolean b5 = server1.repOK();
    boolean b6 = server1.repOK();
    tp2.IP iP7 = null;
    boolean b8 = server1.connect(iP7);
    boolean b9 = server1.repOK();
    tp2.IP iP10 = null;
    boolean b11 = server1.connect(iP10);
    server1.update();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);

  }

  @Test
  public void test453() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test453"); }


    tp2.Server server0 = new tp2.Server();
    server0.update();
    boolean b2 = server0.repOK();
    tp2.IP iP3 = null;
    boolean b4 = server0.connect(iP3);
    server0.update();
    boolean b6 = server0.repOK();
    tp2.ITime iTime7 = null;
    server0.setTime(iTime7);
    tp2.ITime iTime9 = null;
    server0.setTime(iTime9);
    tp2.IP iP11 = null;
    boolean b12 = server0.removeBan(iP11);
    boolean b13 = server0.repOK();
    // The following exception was thrown during execution in test generation
    try {
      server0.update();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);

  }

  @Test
  public void test454() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test454"); }


    tp2.Server server0 = new tp2.Server();
    boolean b1 = server0.repOK();
    tp2.ITime iTime2 = null;
    server0.setTime(iTime2);
    boolean b4 = server0.repOK();
    tp2.IP iP5 = null;
    boolean b6 = server0.removeBan(iP5);
    tp2.ITime iTime7 = null;
    server0.setTime(iTime7);
    boolean b9 = server0.repOK();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);

  }

  @Test
  public void test455() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test455"); }


    tp2.Server server0 = new tp2.Server();
    tp2.IP iP1 = null;
    boolean b2 = server0.removeBan(iP1);
    boolean b3 = server0.repOK();
    java.lang.String str4 = server0.toString();
    tp2.IP iP5 = null;
    boolean b6 = server0.removeException(iP5);
    tp2.IP iP7 = null;
    // The following exception was thrown during execution in test generation
    try {
      boolean b8 = server0.addException(iP7);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Server [lastUpdate=null, exceptions=(), bans={}]"+ "'", str4.equals("Server [lastUpdate=null, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);

  }

  @Test
  public void test456() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test456"); }


    tp2.Server server1 = new tp2.Server(1);
    tp2.IP iP2 = null;
    boolean b3 = server1.removeBan(iP2);
    server1.update();
    tp2.IP iP5 = null;
    boolean b6 = server1.removeBan(iP5);
    tp2.IP iP7 = null;
    boolean b8 = server1.removeBan(iP7);
    tp2.IP iP9 = null;
    boolean b10 = server1.removeException(iP9);
    boolean b11 = server1.repOK();
    boolean b12 = server1.repOK();
    server1.update();
    boolean b14 = server1.repOK();
    java.lang.String str15 = server1.toString();
    tp2.IP iP16 = null;
    boolean b17 = server1.connect(iP16);
    java.lang.String str18 = server1.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "Server [lastUpdate=250000, exceptions=(), bans={}]"+ "'", str15.equals("Server [lastUpdate=250000, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "Server [lastUpdate=250000, exceptions=(), bans={}]"+ "'", str18.equals("Server [lastUpdate=250000, exceptions=(), bans={}]"));

  }

  @Test
  public void test457() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test457"); }


    tp2.Server server1 = new tp2.Server(1);
    tp2.IP iP2 = null;
    boolean b3 = server1.removeBan(iP2);
    server1.update();
    java.lang.String str5 = server1.toString();
    tp2.IP iP6 = null;
    boolean b7 = server1.removeBan(iP6);
    tp2.IP iP8 = null;
    boolean b9 = server1.removeBan(iP8);
    tp2.IP iP10 = null;
    boolean b11 = server1.addBan(iP10);
    long long12 = server1.getLastUpdate();
    tp2.ITime iTime13 = null;
    server1.setTime(iTime13);
    // The following exception was thrown during execution in test generation
    try {
      server1.update();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Server [lastUpdate=250000, exceptions=(), bans={}]"+ "'", str5.equals("Server [lastUpdate=250000, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long12 == 250000L);

  }

  @Test
  public void test458() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test458"); }


    tp2.Server server1 = new tp2.Server((-1));
    server1.update();
    server1.update();
    tp2.ITime iTime4 = null;
    server1.setTime(iTime4);
    java.lang.String str6 = server1.toString();
    long long7 = server1.getLastUpdate();
    tp2.IP iP8 = null;
    boolean b9 = server1.connect(iP8);
    java.lang.String str10 = server1.toString();
    tp2.IP iP11 = null;
    // The following exception was thrown during execution in test generation
    try {
      boolean b12 = server1.addException(iP11);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Server [lastUpdate=250000, exceptions=(), bans={}]"+ "'", str6.equals("Server [lastUpdate=250000, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long7 == 250000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Server [lastUpdate=250000, exceptions=(), bans={}]"+ "'", str10.equals("Server [lastUpdate=250000, exceptions=(), bans={}]"));

  }

  @Test
  public void test459() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test459"); }


    tp2.Server server1 = new tp2.Server(1);
    tp2.IP iP2 = null;
    boolean b3 = server1.removeBan(iP2);
    server1.update();
    tp2.IP iP5 = null;
    boolean b6 = server1.removeBan(iP5);
    tp2.IP iP7 = null;
    boolean b8 = server1.removeBan(iP7);
    tp2.IP iP9 = null;
    boolean b10 = server1.removeException(iP9);
    boolean b11 = server1.repOK();
    tp2.IP iP12 = null;
    boolean b13 = server1.connect(iP12);
    long long14 = server1.getLastUpdate();
    tp2.IP iP15 = null;
    boolean b16 = server1.removeException(iP15);
    java.lang.String str17 = server1.toString();
    long long18 = server1.getLastUpdate();
    tp2.IP iP19 = null;
    // The following exception was thrown during execution in test generation
    try {
      boolean b20 = server1.addException(iP19);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long14 == 250000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "Server [lastUpdate=250000, exceptions=(), bans={}]"+ "'", str17.equals("Server [lastUpdate=250000, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long18 == 250000L);

  }

  @Test
  public void test460() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test460"); }


    tp2.Server server0 = new tp2.Server();
    tp2.IP iP1 = null;
    boolean b2 = server0.removeException(iP1);
    tp2.IP iP3 = null;
    boolean b4 = server0.connect(iP3);
    boolean b5 = server0.repOK();
    tp2.IP iP6 = null;
    boolean b7 = server0.removeBan(iP6);
    tp2.IP iP8 = null;
    boolean b9 = server0.removeException(iP8);
    tp2.IP iP10 = null;
    boolean b11 = server0.removeBan(iP10);
    boolean b12 = server0.repOK();
    tp2.IP iP13 = null;
    boolean b14 = server0.connect(iP13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);

  }

  @Test
  public void test461() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test461"); }


    tp2.Server server0 = new tp2.Server();
    java.lang.String str1 = server0.toString();
    server0.update();
    tp2.IP iP3 = null;
    boolean b4 = server0.addBan(iP3);
    tp2.IP iP5 = null;
    boolean b6 = server0.removeException(iP5);
    tp2.IP iP7 = null;
    // The following exception was thrown during execution in test generation
    try {
      boolean b8 = server0.connect(iP7);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Server [lastUpdate=null, exceptions=(), bans={}]"+ "'", str1.equals("Server [lastUpdate=null, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);

  }

  @Test
  public void test462() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test462"); }


    tp2.Server server1 = new tp2.Server(1);
    tp2.IP iP2 = null;
    boolean b3 = server1.removeBan(iP2);
    server1.update();
    java.lang.String str5 = server1.toString();
    tp2.IP iP6 = null;
    boolean b7 = server1.removeBan(iP6);
    java.lang.String str8 = server1.toString();
    tp2.IP iP9 = null;
    boolean b10 = server1.removeException(iP9);
    boolean b11 = server1.repOK();
    tp2.ITime iTime12 = null;
    server1.setTime(iTime12);
    tp2.IP iP14 = null;
    boolean b15 = server1.connect(iP14);
    tp2.IP iP16 = null;
    boolean b17 = server1.removeException(iP16);
    boolean b18 = server1.repOK();
    tp2.IP iP19 = null;
    boolean b20 = server1.connect(iP19);
    tp2.IP iP21 = null;
    boolean b22 = server1.removeException(iP21);
    java.lang.String str23 = server1.toString();
    // The following exception was thrown during execution in test generation
    try {
      server1.update();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Server [lastUpdate=250000, exceptions=(), bans={}]"+ "'", str5.equals("Server [lastUpdate=250000, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Server [lastUpdate=250000, exceptions=(), bans={}]"+ "'", str8.equals("Server [lastUpdate=250000, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + "Server [lastUpdate=250000, exceptions=(), bans={}]"+ "'", str23.equals("Server [lastUpdate=250000, exceptions=(), bans={}]"));

  }

  @Test
  public void test463() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test463"); }


    tp2.Server server1 = new tp2.Server(1);
    tp2.IP iP2 = null;
    boolean b3 = server1.removeBan(iP2);
    tp2.ITime iTime4 = null;
    server1.setTime(iTime4);
    tp2.IP iP6 = null;
    boolean b7 = server1.removeBan(iP6);
    java.lang.String str8 = server1.toString();
    tp2.IP iP9 = null;
    boolean b10 = server1.removeException(iP9);
    tp2.IP iP11 = null;
    boolean b12 = server1.removeBan(iP11);
    java.lang.String str13 = server1.toString();
    tp2.IP iP14 = null;
    // The following exception was thrown during execution in test generation
    try {
      boolean b15 = server1.addBan(iP14);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Server [lastUpdate=null, exceptions=(), bans={}]"+ "'", str8.equals("Server [lastUpdate=null, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Server [lastUpdate=null, exceptions=(), bans={}]"+ "'", str13.equals("Server [lastUpdate=null, exceptions=(), bans={}]"));

  }

  @Test
  public void test464() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test464"); }


    tp2.Server server1 = new tp2.Server(1);
    tp2.IP iP2 = null;
    boolean b3 = server1.removeBan(iP2);
    server1.update();
    tp2.IP iP5 = null;
    boolean b6 = server1.removeBan(iP5);
    long long7 = server1.getLastUpdate();
    server1.update();
    tp2.IP iP9 = null;
    boolean b10 = server1.addBan(iP9);
    long long11 = server1.getLastUpdate();
    tp2.IP iP12 = null;
    boolean b13 = server1.removeException(iP12);
    tp2.IP iP14 = null;
    // The following exception was thrown during execution in test generation
    try {
      boolean b15 = server1.connect(iP14);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long7 == 250000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long11 == 250000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);

  }

  @Test
  public void test465() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test465"); }


    tp2.Server server0 = new tp2.Server();
    server0.update();
    tp2.IP iP2 = null;
    boolean b3 = server0.removeBan(iP2);
    tp2.IP iP4 = null;
    boolean b5 = server0.connect(iP4);
    tp2.IP iP6 = null;
    boolean b7 = server0.removeBan(iP6);
    tp2.IP iP8 = null;
    boolean b9 = server0.removeException(iP8);
    tp2.IP iP10 = null;
    // The following exception was thrown during execution in test generation
    try {
      boolean b11 = server0.addException(iP10);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);

  }

  @Test
  public void test466() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test466"); }


    tp2.Server server1 = new tp2.Server(1);
    tp2.IP iP2 = null;
    boolean b3 = server1.removeBan(iP2);
    server1.update();
    tp2.IP iP5 = null;
    boolean b6 = server1.removeBan(iP5);
    tp2.IP iP7 = null;
    boolean b8 = server1.removeBan(iP7);
    tp2.IP iP9 = null;
    boolean b10 = server1.removeException(iP9);
    boolean b11 = server1.repOK();
    boolean b12 = server1.repOK();
    tp2.ITime iTime13 = null;
    server1.setTime(iTime13);
    boolean b15 = server1.repOK();
    tp2.IP iP16 = null;
    // The following exception was thrown during execution in test generation
    try {
      boolean b17 = server1.addException(iP16);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);

  }

  @Test
  public void test467() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test467"); }


    tp2.Server server1 = new tp2.Server(1);
    tp2.IP iP2 = null;
    boolean b3 = server1.addBan(iP2);
    server1.update();
    long long5 = server1.getLastUpdate();
    long long6 = server1.getLastUpdate();
    tp2.IP iP7 = null;
    boolean b8 = server1.removeException(iP7);
    java.lang.String str9 = server1.toString();
    tp2.IP iP10 = null;
    // The following exception was thrown during execution in test generation
    try {
      boolean b11 = server1.connect(iP10);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long5 == 250000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long6 == 250000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Server [lastUpdate=250000, exceptions=(), bans={[IPBan [ip=null, expires=310000]]}]"+ "'", str9.equals("Server [lastUpdate=250000, exceptions=(), bans={[IPBan [ip=null, expires=310000]]}]"));

  }

  @Test
  public void test468() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test468"); }


    tp2.Server server1 = new tp2.Server(1);
    tp2.IP iP2 = null;
    boolean b3 = server1.removeBan(iP2);
    server1.update();
    tp2.IP iP5 = null;
    boolean b6 = server1.removeBan(iP5);
    long long7 = server1.getLastUpdate();
    java.lang.String str8 = server1.toString();
    tp2.IP iP9 = null;
    boolean b10 = server1.removeException(iP9);
    long long11 = server1.getLastUpdate();
    tp2.ITime iTime12 = null;
    server1.setTime(iTime12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long7 == 250000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Server [lastUpdate=250000, exceptions=(), bans={}]"+ "'", str8.equals("Server [lastUpdate=250000, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long11 == 250000L);

  }

  @Test
  public void test469() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test469"); }


    tp2.Server server1 = new tp2.Server(1);
    tp2.IP iP2 = null;
    boolean b3 = server1.removeBan(iP2);
    server1.update();
    tp2.IP iP5 = null;
    boolean b6 = server1.removeBan(iP5);
    java.lang.String str7 = server1.toString();
    long long8 = server1.getLastUpdate();
    tp2.IP iP9 = null;
    boolean b10 = server1.removeBan(iP9);
    tp2.IP iP11 = null;
    boolean b12 = server1.addBan(iP11);
    tp2.IP iP13 = null;
    // The following exception was thrown during execution in test generation
    try {
      boolean b14 = server1.connect(iP13);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Server [lastUpdate=250000, exceptions=(), bans={}]"+ "'", str7.equals("Server [lastUpdate=250000, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long8 == 250000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);

  }

  @Test
  public void test470() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test470"); }


    tp2.Server server1 = new tp2.Server(1);
    tp2.IP iP2 = null;
    boolean b3 = server1.removeBan(iP2);
    tp2.ITime iTime4 = null;
    server1.setTime(iTime4);
    tp2.IP iP6 = null;
    boolean b7 = server1.removeBan(iP6);
    java.lang.String str8 = server1.toString();
    tp2.IP iP9 = null;
    boolean b10 = server1.removeException(iP9);
    tp2.IP iP11 = null;
    boolean b12 = server1.removeException(iP11);
    tp2.IP iP13 = null;
    boolean b14 = server1.connect(iP13);
    java.lang.String str15 = server1.toString();
    tp2.IP iP16 = null;
    boolean b17 = server1.removeException(iP16);
    tp2.IP iP18 = null;
    // The following exception was thrown during execution in test generation
    try {
      boolean b19 = server1.addException(iP18);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Server [lastUpdate=null, exceptions=(), bans={}]"+ "'", str8.equals("Server [lastUpdate=null, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "Server [lastUpdate=null, exceptions=(), bans={}]"+ "'", str15.equals("Server [lastUpdate=null, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);

  }

  @Test
  public void test471() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test471"); }


    tp2.Server server0 = new tp2.Server();
    server0.update();
    tp2.IP iP2 = null;
    boolean b3 = server0.removeBan(iP2);
    server0.update();
    tp2.ITime iTime5 = null;
    server0.setTime(iTime5);
    tp2.IP iP7 = null;
    boolean b8 = server0.removeBan(iP7);
    boolean b9 = server0.repOK();
    java.lang.String str10 = server0.toString();
    long long11 = server0.getLastUpdate();
    tp2.IP iP12 = null;
    // The following exception was thrown during execution in test generation
    try {
      boolean b13 = server0.addBan(iP12);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Server [lastUpdate=1465347898959, exceptions=(), bans={}]"+ "'", str10.equals("Server [lastUpdate=1465347898959, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long11 == 1465347898959L);

  }

  @Test
  public void test472() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test472"); }


    tp2.Server server0 = new tp2.Server();
    boolean b1 = server0.repOK();
    tp2.IP iP2 = null;
    boolean b3 = server0.removeBan(iP2);
    boolean b4 = server0.repOK();
    tp2.IP iP5 = null;
    boolean b6 = server0.removeBan(iP5);
    server0.update();
    tp2.IP iP8 = null;
    boolean b9 = server0.connect(iP8);
    tp2.ITime iTime10 = null;
    server0.setTime(iTime10);
    tp2.IP iP12 = null;
    boolean b13 = server0.connect(iP12);
    tp2.IP iP14 = null;
    boolean b15 = server0.removeException(iP14);
    java.lang.String str16 = server0.toString();
    tp2.IP iP17 = null;
    // The following exception was thrown during execution in test generation
    try {
      boolean b18 = server0.addException(iP17);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "Server [lastUpdate=1465347898962, exceptions=(), bans={}]"+ "'", str16.equals("Server [lastUpdate=1465347898962, exceptions=(), bans={}]"));

  }

  @Test
  public void test473() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test473"); }


    tp2.Server server0 = new tp2.Server();
    server0.update();
    tp2.IP iP2 = null;
    boolean b3 = server0.removeBan(iP2);
    server0.update();
    java.lang.String str5 = server0.toString();
    tp2.IP iP6 = null;
    boolean b7 = server0.removeException(iP6);
    tp2.IP iP8 = null;
    boolean b9 = server0.addBan(iP8);
    tp2.IP iP10 = null;
    boolean b11 = server0.removeException(iP10);
    tp2.IP iP12 = null;
    // The following exception was thrown during execution in test generation
    try {
      boolean b13 = server0.addBan(iP12);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Server [lastUpdate=1465347898965, exceptions=(), bans={}]"+ "'", str5.equals("Server [lastUpdate=1465347898965, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);

  }

  @Test
  public void test474() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test474"); }


    tp2.Server server0 = new tp2.Server();
    boolean b1 = server0.repOK();
    server0.update();
    server0.update();
    tp2.IP iP4 = null;
    boolean b5 = server0.removeBan(iP4);
    tp2.IP iP6 = null;
    boolean b7 = server0.removeBan(iP6);
    java.lang.String str8 = server0.toString();
    tp2.IP iP9 = null;
    boolean b10 = server0.removeException(iP9);
    tp2.IP iP11 = null;
    // The following exception was thrown during execution in test generation
    try {
      boolean b12 = server0.addException(iP11);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Server [lastUpdate=1465347898966, exceptions=(), bans={}]"+ "'", str8.equals("Server [lastUpdate=1465347898966, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);

  }

  @Test
  public void test475() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test475"); }


    tp2.Server server1 = new tp2.Server(100);
    tp2.IP iP2 = null;
    boolean b3 = server1.connect(iP2);
    tp2.ITime iTime4 = null;
    server1.setTime(iTime4);
    tp2.ITime iTime6 = null;
    server1.setTime(iTime6);
    // The following exception was thrown during execution in test generation
    try {
      long long8 = server1.getLastUpdate();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);

  }

  @Test
  public void test476() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test476"); }


    tp2.Server server1 = new tp2.Server(1);
    tp2.IP iP2 = null;
    boolean b3 = server1.removeBan(iP2);
    server1.update();
    tp2.IP iP5 = null;
    boolean b6 = server1.removeBan(iP5);
    java.lang.String str7 = server1.toString();
    long long8 = server1.getLastUpdate();
    server1.update();
    long long10 = server1.getLastUpdate();
    java.lang.String str11 = server1.toString();
    tp2.IP iP12 = null;
    // The following exception was thrown during execution in test generation
    try {
      boolean b13 = server1.addException(iP12);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Server [lastUpdate=250000, exceptions=(), bans={}]"+ "'", str7.equals("Server [lastUpdate=250000, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long8 == 250000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long10 == 250000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Server [lastUpdate=250000, exceptions=(), bans={}]"+ "'", str11.equals("Server [lastUpdate=250000, exceptions=(), bans={}]"));

  }

  @Test
  public void test477() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test477"); }


    tp2.Server server0 = new tp2.Server();
    java.lang.String str1 = server0.toString();
    server0.update();
    tp2.IP iP3 = null;
    boolean b4 = server0.addBan(iP3);
    tp2.IP iP5 = null;
    boolean b6 = server0.removeException(iP5);
    server0.update();
    tp2.IP iP8 = null;
    // The following exception was thrown during execution in test generation
    try {
      boolean b9 = server0.addBan(iP8);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Server [lastUpdate=null, exceptions=(), bans={}]"+ "'", str1.equals("Server [lastUpdate=null, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);

  }

  @Test
  public void test478() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test478"); }


    tp2.Server server1 = new tp2.Server(1);
    tp2.IP iP2 = null;
    boolean b3 = server1.removeBan(iP2);
    tp2.ITime iTime4 = null;
    server1.setTime(iTime4);
    tp2.IP iP6 = null;
    boolean b7 = server1.removeBan(iP6);
    tp2.ITime iTime8 = null;
    server1.setTime(iTime8);
    tp2.ITime iTime10 = null;
    server1.setTime(iTime10);
    boolean b12 = server1.repOK();
    tp2.IP iP13 = null;
    boolean b14 = server1.connect(iP13);
    tp2.IP iP15 = null;
    boolean b16 = server1.connect(iP15);
    tp2.IP iP17 = null;
    // The following exception was thrown during execution in test generation
    try {
      boolean b18 = server1.addException(iP17);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);

  }

  @Test
  public void test479() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test479"); }


    tp2.Server server1 = new tp2.Server(1);
    tp2.IP iP2 = null;
    boolean b3 = server1.removeException(iP2);
    java.lang.String str4 = server1.toString();
    tp2.IP iP5 = null;
    boolean b6 = server1.connect(iP5);
    tp2.IP iP7 = null;
    boolean b8 = server1.removeBan(iP7);
    tp2.IP iP9 = null;
    boolean b10 = server1.addBan(iP9);
    java.lang.String str11 = server1.toString();
    tp2.IP iP12 = null;
    // The following exception was thrown during execution in test generation
    try {
      boolean b13 = server1.addBan(iP12);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Server [lastUpdate=null, exceptions=(), bans={}]"+ "'", str4.equals("Server [lastUpdate=null, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Server [lastUpdate=null, exceptions=(), bans={[IPBan [ip=null, expires=310000]]}]"+ "'", str11.equals("Server [lastUpdate=null, exceptions=(), bans={[IPBan [ip=null, expires=310000]]}]"));

  }

  @Test
  public void test480() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test480"); }


    tp2.Server server1 = new tp2.Server((-1));
    server1.update();
    boolean b3 = server1.repOK();
    tp2.IP iP4 = null;
    boolean b5 = server1.connect(iP4);
    long long6 = server1.getLastUpdate();
    tp2.IP iP7 = null;
    boolean b8 = server1.removeBan(iP7);
    tp2.IP iP9 = null;
    // The following exception was thrown during execution in test generation
    try {
      boolean b10 = server1.addException(iP9);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long6 == 250000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);

  }

  @Test
  public void test481() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test481"); }


    tp2.Server server1 = new tp2.Server(1);
    tp2.IP iP2 = null;
    boolean b3 = server1.removeException(iP2);
    java.lang.String str4 = server1.toString();
    tp2.IP iP5 = null;
    boolean b6 = server1.connect(iP5);
    java.lang.String str7 = server1.toString();
    java.lang.String str8 = server1.toString();
    java.lang.String str9 = server1.toString();
    server1.update();
    tp2.IP iP11 = null;
    boolean b12 = server1.removeBan(iP11);
    server1.update();
    tp2.IP iP14 = null;
    boolean b15 = server1.addBan(iP14);
    tp2.IP iP16 = null;
    // The following exception was thrown during execution in test generation
    try {
      boolean b17 = server1.connect(iP16);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Server [lastUpdate=null, exceptions=(), bans={}]"+ "'", str4.equals("Server [lastUpdate=null, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Server [lastUpdate=null, exceptions=(), bans={}]"+ "'", str7.equals("Server [lastUpdate=null, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Server [lastUpdate=null, exceptions=(), bans={}]"+ "'", str8.equals("Server [lastUpdate=null, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Server [lastUpdate=null, exceptions=(), bans={}]"+ "'", str9.equals("Server [lastUpdate=null, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);

  }

  @Test
  public void test482() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test482"); }


    tp2.Server server0 = new tp2.Server();
    server0.update();
    tp2.IP iP2 = null;
    boolean b3 = server0.removeBan(iP2);
    server0.update();
    tp2.IP iP5 = null;
    boolean b6 = server0.removeBan(iP5);
    tp2.IP iP7 = null;
    boolean b8 = server0.addBan(iP7);
    tp2.IP iP9 = null;
    // The following exception was thrown during execution in test generation
    try {
      boolean b10 = server0.addException(iP9);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);

  }

  @Test
  public void test483() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test483"); }


    tp2.Server server1 = new tp2.Server(1);
    tp2.IP iP2 = null;
    boolean b3 = server1.removeException(iP2);
    java.lang.String str4 = server1.toString();
    tp2.IP iP5 = null;
    boolean b6 = server1.connect(iP5);
    java.lang.String str7 = server1.toString();
    java.lang.String str8 = server1.toString();
    server1.update();
    boolean b10 = server1.repOK();
    tp2.IP iP11 = null;
    boolean b12 = server1.addBan(iP11);
    server1.update();
    tp2.IP iP14 = null;
    // The following exception was thrown during execution in test generation
    try {
      boolean b15 = server1.removeBan(iP14);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Server [lastUpdate=null, exceptions=(), bans={}]"+ "'", str4.equals("Server [lastUpdate=null, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Server [lastUpdate=null, exceptions=(), bans={}]"+ "'", str7.equals("Server [lastUpdate=null, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Server [lastUpdate=null, exceptions=(), bans={}]"+ "'", str8.equals("Server [lastUpdate=null, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);

  }

  @Test
  public void test484() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test484"); }


    tp2.Server server1 = new tp2.Server(1);
    tp2.IP iP2 = null;
    boolean b3 = server1.removeBan(iP2);
    server1.update();
    tp2.IP iP5 = null;
    boolean b6 = server1.removeBan(iP5);
    tp2.IP iP7 = null;
    boolean b8 = server1.removeBan(iP7);
    tp2.IP iP9 = null;
    boolean b10 = server1.removeException(iP9);
    boolean b11 = server1.repOK();
    tp2.IP iP12 = null;
    boolean b13 = server1.removeBan(iP12);
    long long14 = server1.getLastUpdate();
    server1.update();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long14 == 250000L);

  }

  @Test
  public void test485() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test485"); }


    tp2.Server server0 = new tp2.Server();
    server0.update();
    tp2.IP iP2 = null;
    boolean b3 = server0.removeBan(iP2);
    server0.update();
    tp2.IP iP5 = null;
    boolean b6 = server0.addBan(iP5);
    boolean b7 = server0.repOK();
    tp2.IP iP8 = null;
    boolean b9 = server0.removeException(iP8);
    tp2.IP iP10 = null;
    // The following exception was thrown during execution in test generation
    try {
      boolean b11 = server0.addBan(iP10);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);

  }

  @Test
  public void test486() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test486"); }


    tp2.Server server0 = new tp2.Server();
    server0.update();
    tp2.IP iP2 = null;
    boolean b3 = server0.removeBan(iP2);
    server0.update();
    java.lang.String str5 = server0.toString();
    tp2.IP iP6 = null;
    boolean b7 = server0.removeException(iP6);
    boolean b8 = server0.repOK();
    tp2.IP iP9 = null;
    boolean b10 = server0.addBan(iP9);
    boolean b11 = server0.repOK();
    tp2.IP iP12 = null;
    boolean b13 = server0.removeException(iP12);
    java.lang.String str14 = server0.toString();
    tp2.IP iP15 = null;
    // The following exception was thrown during execution in test generation
    try {
      boolean b16 = server0.removeBan(iP15);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Server [lastUpdate=1465347899002, exceptions=(), bans={}]"+ "'", str5.equals("Server [lastUpdate=1465347899002, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "Server [lastUpdate=1465347899002, exceptions=(), bans={[IPBan [ip=null, expires=1465347959003]]}]"+ "'", str14.equals("Server [lastUpdate=1465347899002, exceptions=(), bans={[IPBan [ip=null, expires=1465347959003]]}]"));

  }

  @Test
  public void test487() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test487"); }


    tp2.Server server0 = new tp2.Server();
    server0.update();
    boolean b2 = server0.repOK();
    tp2.IP iP3 = null;
    boolean b4 = server0.connect(iP3);
    tp2.IP iP5 = null;
    boolean b6 = server0.removeBan(iP5);
    boolean b7 = server0.repOK();
    tp2.IP iP8 = null;
    boolean b9 = server0.removeException(iP8);
    tp2.ITime iTime10 = null;
    server0.setTime(iTime10);
    // The following exception was thrown during execution in test generation
    try {
      server0.update();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);

  }

  @Test
  public void test488() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test488"); }


    tp2.Server server1 = new tp2.Server(1);
    tp2.IP iP2 = null;
    boolean b3 = server1.removeException(iP2);
    java.lang.String str4 = server1.toString();
    tp2.IP iP5 = null;
    boolean b6 = server1.connect(iP5);
    java.lang.String str7 = server1.toString();
    java.lang.String str8 = server1.toString();
    java.lang.String str9 = server1.toString();
    java.lang.String str10 = server1.toString();
    java.lang.String str11 = server1.toString();
    tp2.IP iP12 = null;
    boolean b13 = server1.removeBan(iP12);
    boolean b14 = server1.repOK();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Server [lastUpdate=null, exceptions=(), bans={}]"+ "'", str4.equals("Server [lastUpdate=null, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Server [lastUpdate=null, exceptions=(), bans={}]"+ "'", str7.equals("Server [lastUpdate=null, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Server [lastUpdate=null, exceptions=(), bans={}]"+ "'", str8.equals("Server [lastUpdate=null, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Server [lastUpdate=null, exceptions=(), bans={}]"+ "'", str9.equals("Server [lastUpdate=null, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Server [lastUpdate=null, exceptions=(), bans={}]"+ "'", str10.equals("Server [lastUpdate=null, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Server [lastUpdate=null, exceptions=(), bans={}]"+ "'", str11.equals("Server [lastUpdate=null, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);

  }

  @Test
  public void test489() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test489"); }


    tp2.Server server1 = new tp2.Server((-1));
    server1.update();
    tp2.IP iP3 = null;
    boolean b4 = server1.removeException(iP3);
    long long5 = server1.getLastUpdate();
    tp2.ITime iTime6 = null;
    server1.setTime(iTime6);
    long long8 = server1.getLastUpdate();
    tp2.IP iP9 = null;
    boolean b10 = server1.removeBan(iP9);
    tp2.IP iP11 = null;
    boolean b12 = server1.removeException(iP11);
    tp2.IP iP13 = null;
    // The following exception was thrown during execution in test generation
    try {
      boolean b14 = server1.addBan(iP13);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long5 == 250000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long8 == 250000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);

  }

  @Test
  public void test490() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test490"); }


    tp2.Server server1 = new tp2.Server((-1));
    server1.update();
    server1.update();
    tp2.IP iP4 = null;
    boolean b5 = server1.removeException(iP4);
    tp2.IP iP6 = null;
    boolean b7 = server1.removeException(iP6);
    tp2.IP iP8 = null;
    boolean b9 = server1.removeBan(iP8);
    server1.update();
    tp2.IP iP11 = null;
    boolean b12 = server1.removeBan(iP11);
    tp2.ITime iTime13 = null;
    server1.setTime(iTime13);
    // The following exception was thrown during execution in test generation
    try {
      server1.update();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);

  }

  @Test
  public void test491() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test491"); }


    tp2.Server server1 = new tp2.Server(1);
    tp2.IP iP2 = null;
    boolean b3 = server1.removeBan(iP2);
    server1.update();
    long long5 = server1.getLastUpdate();
    tp2.IP iP6 = null;
    boolean b7 = server1.addBan(iP6);
    boolean b8 = server1.repOK();
    boolean b9 = server1.repOK();
    tp2.IP iP10 = null;
    // The following exception was thrown during execution in test generation
    try {
      boolean b11 = server1.addException(iP10);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long5 == 250000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);

  }

  @Test
  public void test492() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test492"); }


    tp2.Server server1 = new tp2.Server(1);
    tp2.IP iP2 = null;
    boolean b3 = server1.removeBan(iP2);
    server1.update();
    java.lang.String str5 = server1.toString();
    long long6 = server1.getLastUpdate();
    java.lang.String str7 = server1.toString();
    java.lang.String str8 = server1.toString();
    tp2.IP iP9 = null;
    boolean b10 = server1.addBan(iP9);
    tp2.IP iP11 = null;
    boolean b12 = server1.removeException(iP11);
    tp2.ITime iTime13 = null;
    server1.setTime(iTime13);
    tp2.IP iP15 = null;
    // The following exception was thrown during execution in test generation
    try {
      boolean b16 = server1.connect(iP15);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Server [lastUpdate=250000, exceptions=(), bans={}]"+ "'", str5.equals("Server [lastUpdate=250000, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long6 == 250000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Server [lastUpdate=250000, exceptions=(), bans={}]"+ "'", str7.equals("Server [lastUpdate=250000, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Server [lastUpdate=250000, exceptions=(), bans={}]"+ "'", str8.equals("Server [lastUpdate=250000, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);

  }

  @Test
  public void test493() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test493"); }


    tp2.Server server0 = new tp2.Server();
    server0.update();
    tp2.IP iP2 = null;
    boolean b3 = server0.removeBan(iP2);
    tp2.ITime iTime4 = null;
    server0.setTime(iTime4);
    tp2.IP iP6 = null;
    boolean b7 = server0.connect(iP6);
    tp2.IP iP8 = null;
    boolean b9 = server0.removeException(iP8);
    long long10 = server0.getLastUpdate();
    tp2.IP iP11 = null;
    boolean b12 = server0.removeException(iP11);
    tp2.IP iP13 = null;
    boolean b14 = server0.removeBan(iP13);
    tp2.IP iP15 = null;
    // The following exception was thrown during execution in test generation
    try {
      boolean b16 = server0.addBan(iP15);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long10 == 1465347899024L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);

  }

  @Test
  public void test494() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test494"); }


    tp2.Server server1 = new tp2.Server(1);
    tp2.IP iP2 = null;
    boolean b3 = server1.removeBan(iP2);
    server1.update();
    java.lang.String str5 = server1.toString();
    long long6 = server1.getLastUpdate();
    tp2.IP iP7 = null;
    boolean b8 = server1.connect(iP7);
    long long9 = server1.getLastUpdate();
    tp2.IP iP10 = null;
    boolean b11 = server1.addBan(iP10);
    long long12 = server1.getLastUpdate();
    boolean b13 = server1.repOK();
    tp2.IP iP14 = null;
    // The following exception was thrown during execution in test generation
    try {
      boolean b15 = server1.addException(iP14);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Server [lastUpdate=250000, exceptions=(), bans={}]"+ "'", str5.equals("Server [lastUpdate=250000, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long6 == 250000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long9 == 250000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long12 == 250000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);

  }

  @Test
  public void test495() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test495"); }


    tp2.Server server1 = new tp2.Server((-1));
    server1.update();
    tp2.IP iP3 = null;
    boolean b4 = server1.addBan(iP3);
    java.lang.String str5 = server1.toString();
    server1.update();
    tp2.IP iP7 = null;
    boolean b8 = server1.removeException(iP7);
    tp2.ITime iTime9 = null;
    server1.setTime(iTime9);
    tp2.IP iP11 = null;
    // The following exception was thrown during execution in test generation
    try {
      boolean b12 = server1.removeBan(iP11);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Server [lastUpdate=250000, exceptions=(), bans={[IPBan [ip=null, expires=310000]]}]"+ "'", str5.equals("Server [lastUpdate=250000, exceptions=(), bans={[IPBan [ip=null, expires=310000]]}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);

  }

  @Test
  public void test496() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test496"); }


    tp2.Server server0 = new tp2.Server();
    boolean b1 = server0.repOK();
    tp2.ITime iTime2 = null;
    server0.setTime(iTime2);
    java.lang.String str4 = server0.toString();
    boolean b5 = server0.repOK();
    java.lang.String str6 = server0.toString();
    boolean b7 = server0.repOK();
    tp2.IP iP8 = null;
    boolean b9 = server0.connect(iP8);
    tp2.ITime iTime10 = null;
    server0.setTime(iTime10);
    java.lang.String str12 = server0.toString();
    java.lang.String str13 = server0.toString();
    // The following exception was thrown during execution in test generation
    try {
      long long14 = server0.getLastUpdate();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Server [lastUpdate=null, exceptions=(), bans={}]"+ "'", str4.equals("Server [lastUpdate=null, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Server [lastUpdate=null, exceptions=(), bans={}]"+ "'", str6.equals("Server [lastUpdate=null, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Server [lastUpdate=null, exceptions=(), bans={}]"+ "'", str12.equals("Server [lastUpdate=null, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Server [lastUpdate=null, exceptions=(), bans={}]"+ "'", str13.equals("Server [lastUpdate=null, exceptions=(), bans={}]"));

  }

  @Test
  public void test497() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test497"); }


    tp2.Server server1 = new tp2.Server(1);
    tp2.IP iP2 = null;
    boolean b3 = server1.removeBan(iP2);
    tp2.ITime iTime4 = null;
    server1.setTime(iTime4);
    tp2.IP iP6 = null;
    boolean b7 = server1.removeBan(iP6);
    java.lang.String str8 = server1.toString();
    java.lang.String str9 = server1.toString();
    tp2.IP iP10 = null;
    boolean b11 = server1.connect(iP10);
    boolean b12 = server1.repOK();
    // The following exception was thrown during execution in test generation
    try {
      server1.update();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Server [lastUpdate=null, exceptions=(), bans={}]"+ "'", str8.equals("Server [lastUpdate=null, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Server [lastUpdate=null, exceptions=(), bans={}]"+ "'", str9.equals("Server [lastUpdate=null, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);

  }

  @Test
  public void test498() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test498"); }


    tp2.Server server1 = new tp2.Server(1);
    tp2.IP iP2 = null;
    boolean b3 = server1.removeBan(iP2);
    tp2.ITime iTime4 = null;
    server1.setTime(iTime4);
    tp2.IP iP6 = null;
    boolean b7 = server1.removeBan(iP6);
    java.lang.String str8 = server1.toString();
    tp2.ITime iTime9 = null;
    server1.setTime(iTime9);
    tp2.IP iP11 = null;
    boolean b12 = server1.removeBan(iP11);
    java.lang.String str13 = server1.toString();
    boolean b14 = server1.repOK();
    tp2.IP iP15 = null;
    boolean b16 = server1.connect(iP15);
    tp2.IP iP17 = null;
    // The following exception was thrown during execution in test generation
    try {
      boolean b18 = server1.addBan(iP17);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Server [lastUpdate=null, exceptions=(), bans={}]"+ "'", str8.equals("Server [lastUpdate=null, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Server [lastUpdate=null, exceptions=(), bans={}]"+ "'", str13.equals("Server [lastUpdate=null, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);

  }

  @Test
  public void test499() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test499"); }


    tp2.Server server1 = new tp2.Server(1);
    tp2.IP iP2 = null;
    boolean b3 = server1.removeBan(iP2);
    server1.update();
    tp2.IP iP5 = null;
    boolean b6 = server1.removeBan(iP5);
    long long7 = server1.getLastUpdate();
    java.lang.String str8 = server1.toString();
    tp2.IP iP9 = null;
    boolean b10 = server1.removeException(iP9);
    tp2.ITime iTime11 = null;
    server1.setTime(iTime11);
    java.lang.String str13 = server1.toString();
    boolean b14 = server1.repOK();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long7 == 250000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Server [lastUpdate=250000, exceptions=(), bans={}]"+ "'", str8.equals("Server [lastUpdate=250000, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Server [lastUpdate=250000, exceptions=(), bans={}]"+ "'", str13.equals("Server [lastUpdate=250000, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);

  }

  @Test
  public void test500() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test500"); }


    tp2.Server server1 = new tp2.Server(1);
    tp2.IP iP2 = null;
    boolean b3 = server1.removeBan(iP2);
    server1.update();
    java.lang.String str5 = server1.toString();
    tp2.IP iP6 = null;
    boolean b7 = server1.removeBan(iP6);
    tp2.IP iP8 = null;
    boolean b9 = server1.addBan(iP8);
    tp2.IP iP10 = null;
    boolean b11 = server1.removeException(iP10);
    java.lang.String str12 = server1.toString();
    boolean b13 = server1.repOK();
    boolean b14 = server1.repOK();
    long long15 = server1.getLastUpdate();
    tp2.IP iP16 = null;
    // The following exception was thrown during execution in test generation
    try {
      boolean b17 = server1.addBan(iP16);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Server [lastUpdate=250000, exceptions=(), bans={}]"+ "'", str5.equals("Server [lastUpdate=250000, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Server [lastUpdate=250000, exceptions=(), bans={[IPBan [ip=null, expires=310000]]}]"+ "'", str12.equals("Server [lastUpdate=250000, exceptions=(), bans={[IPBan [ip=null, expires=310000]]}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long15 == 250000L);

  }

}
