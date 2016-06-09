package randoop4;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest4 {

  public static boolean debug = false;

  @Test
  public void test001() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test001"); }


    tp2.Server server0 = new tp2.Server();
    tp2.ITime iTime1 = server0.getTime();
    server0.update();
    tp2.ITime iTime3 = server0.getTime();
    tp2.IP iP4 = null;
    boolean b5 = server0.addBan(iP4);
    tp2.IP iP6 = null;
    boolean b7 = server0.removeException(iP6);
    tp2.IP iP8 = null;
    boolean b9 = server0.addBan(iP8);
    tp2.IP iP10 = null;
    boolean b11 = server0.connect(iP10);
    tp2.IP iP12 = null;
    boolean b13 = server0.connect(iP12);
    tp2.IP iP14 = null;
    boolean b15 = server0.connect(iP14);
    tp2.IP iP16 = null;
    boolean b17 = server0.removeBan(iP16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
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
  public void test002() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test002"); }


    tp2.Server server0 = new tp2.Server();
    tp2.ITime iTime1 = server0.getTime();
    tp2.Server server2 = new tp2.Server();
    tp2.ITime iTime3 = server2.getTime();
    server0.setTime(iTime3);
    tp2.ITime iTime5 = server0.getTime();
    tp2.IP iP6 = null;
    boolean b7 = server0.addBan(iP6);
    tp2.IP iP8 = null;
    boolean b9 = server0.addBan(iP8);
    java.lang.String str10 = server0.toString();
    tp2.IP iP11 = null;
    boolean b12 = server0.removeBan(iP11);
    server0.update();
    tp2.IP iP14 = null;
    boolean b15 = server0.removeBan(iP14);
    tp2.IP iP16 = null;
    boolean b17 = server0.removeBan(iP16);
    tp2.IP iP18 = null;
    boolean b19 = server0.connect(iP18);
    tp2.IP iP20 = null;
    boolean b21 = server0.addBan(iP20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Server [lastUpdate=0, exceptions=(), bans={}]"+ "'", str10.equals("Server [lastUpdate=0, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);

  }

  @Test
  public void test003() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test003"); }


    tp2.Server server0 = new tp2.Server();
    tp2.ITime iTime1 = server0.getTime();
    tp2.IP iP2 = null;
    boolean b3 = server0.removeException(iP2);
    tp2.IP iP4 = null;
    boolean b5 = server0.connect(iP4);
    tp2.IP iP6 = null;
    boolean b7 = server0.removeException(iP6);
    tp2.IP iP8 = null;
    boolean b9 = server0.connect(iP8);
    tp2.IP iP10 = null;
    boolean b11 = server0.removeException(iP10);
    tp2.IP iP12 = null;
    boolean b13 = server0.removeBan(iP12);
    tp2.IP iP14 = null;
    boolean b15 = server0.addBan(iP14);
    java.lang.String str16 = server0.toString();
    tp2.IP iP17 = null;
    boolean b18 = server0.connect(iP17);
    tp2.ITime iTime19 = server0.getTime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "Server [lastUpdate=0, exceptions=(), bans={}]"+ "'", str16.equals("Server [lastUpdate=0, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime19);

  }

  @Test
  public void test004() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test004"); }


    tp2.Server server0 = new tp2.Server();
    long long1 = server0.getLastUpdate();
    tp2.ITime iTime2 = server0.getTime();
    tp2.IP iP3 = null;
    boolean b4 = server0.removeException(iP3);
    tp2.IP iP5 = null;
    boolean b6 = server0.removeBan(iP5);
    tp2.IP iP7 = null;
    boolean b8 = server0.removeException(iP7);
    tp2.IP iP9 = null;
    boolean b10 = server0.addBan(iP9);
    server0.update();
    long long12 = server0.getLastUpdate();
    long long13 = server0.getLastUpdate();
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
    org.junit.Assert.assertTrue(long1 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long12 == 1465509740238L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long13 == 1465509740238L);

  }

  @Test
  public void test005() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test005"); }


    tp2.Server server0 = new tp2.Server();
    tp2.ITime iTime1 = server0.getTime();
    server0.update();
    tp2.ITime iTime3 = server0.getTime();
    tp2.IP iP4 = null;
    boolean b5 = server0.connect(iP4);
    tp2.IP iP6 = null;
    boolean b7 = server0.addBan(iP6);
    java.lang.String str8 = server0.toString();
    tp2.IP iP9 = null;
    boolean b10 = server0.connect(iP9);
    server0.update();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Server [lastUpdate=1465509740239, exceptions=(), bans={}]"+ "'", str8.equals("Server [lastUpdate=1465509740239, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);

  }

  @Test
  public void test006() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test006"); }


    tp2.Server server0 = new tp2.Server();
    tp2.ITime iTime1 = server0.getTime();
    tp2.IP iP2 = null;
    boolean b3 = server0.removeException(iP2);
    tp2.IP iP4 = null;
    boolean b5 = server0.connect(iP4);
    tp2.IP iP6 = null;
    boolean b7 = server0.removeException(iP6);
    tp2.IP iP8 = null;
    boolean b9 = server0.connect(iP8);
    tp2.IP iP10 = null;
    boolean b11 = server0.removeException(iP10);
    tp2.IP iP12 = null;
    boolean b13 = server0.removeBan(iP12);
    long long14 = server0.getLastUpdate();
    tp2.IP iP15 = null;
    boolean b16 = server0.removeException(iP15);
    tp2.IP iP17 = null;
    boolean b18 = server0.removeBan(iP17);
    long long19 = server0.getLastUpdate();
    tp2.IP iP20 = null;
    boolean b21 = server0.removeBan(iP20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long14 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long19 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);

  }

  @Test
  public void test007() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test007"); }


    tp2.Server server0 = new tp2.Server();
    tp2.ITime iTime1 = server0.getTime();
    tp2.IP iP2 = null;
    boolean b3 = server0.removeException(iP2);
    tp2.IP iP4 = null;
    boolean b5 = server0.connect(iP4);
    tp2.IP iP6 = null;
    boolean b7 = server0.removeException(iP6);
    tp2.IP iP8 = null;
    boolean b9 = server0.connect(iP8);
    tp2.IP iP10 = null;
    boolean b11 = server0.removeException(iP10);
    tp2.Server server12 = new tp2.Server();
    tp2.ITime iTime13 = server12.getTime();
    server12.update();
    tp2.ITime iTime15 = server12.getTime();
    server0.setTime(iTime15);
    tp2.IP iP17 = null;
    boolean b18 = server0.removeBan(iP17);
    tp2.IP iP19 = null;
    boolean b20 = server0.addBan(iP19);
    long long21 = server0.getLastUpdate();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long21 == 0L);

  }

  @Test
  public void test008() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test008"); }


    tp2.Server server0 = new tp2.Server();
    tp2.ITime iTime1 = server0.getTime();
    tp2.IP iP2 = null;
    boolean b3 = server0.removeException(iP2);
    tp2.IP iP4 = null;
    boolean b5 = server0.connect(iP4);
    tp2.IP iP6 = null;
    boolean b7 = server0.removeException(iP6);
    tp2.IP iP8 = null;
    boolean b9 = server0.connect(iP8);
    tp2.IP iP10 = null;
    boolean b11 = server0.removeException(iP10);
    long long12 = server0.getLastUpdate();
    java.lang.String str13 = server0.toString();
    tp2.Server server14 = new tp2.Server();
    tp2.ITime iTime15 = server14.getTime();
    tp2.Server server16 = new tp2.Server();
    tp2.ITime iTime17 = server16.getTime();
    server14.setTime(iTime17);
    server14.update();
    server14.update();
    tp2.ITime iTime21 = server14.getTime();
    server0.setTime(iTime21);
    server0.update();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long12 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Server [lastUpdate=0, exceptions=(), bans={}]"+ "'", str13.equals("Server [lastUpdate=0, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime21);

  }

  @Test
  public void test009() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test009"); }


    tp2.Server server0 = new tp2.Server();
    tp2.ITime iTime1 = server0.getTime();
    long long2 = server0.getLastUpdate();
    tp2.IP iP3 = null;
    boolean b4 = server0.removeBan(iP3);
    tp2.IP iP5 = null;
    boolean b6 = server0.connect(iP5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long2 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);

  }

  @Test
  public void test010() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test010"); }


    tp2.Server server0 = new tp2.Server();
    tp2.ITime iTime1 = server0.getTime();
    tp2.IP iP2 = null;
    boolean b3 = server0.removeException(iP2);
    tp2.IP iP4 = null;
    boolean b5 = server0.connect(iP4);
    tp2.IP iP6 = null;
    boolean b7 = server0.removeException(iP6);
    tp2.IP iP8 = null;
    boolean b9 = server0.connect(iP8);
    tp2.IP iP10 = null;
    boolean b11 = server0.removeException(iP10);
    tp2.Server server12 = new tp2.Server();
    tp2.ITime iTime13 = server12.getTime();
    server12.update();
    tp2.ITime iTime15 = server12.getTime();
    server0.setTime(iTime15);
    tp2.ITime iTime17 = server0.getTime();
    tp2.Server server18 = new tp2.Server();
    tp2.ITime iTime19 = server18.getTime();
    tp2.IP iP20 = null;
    boolean b21 = server18.removeException(iP20);
    tp2.IP iP22 = null;
    boolean b23 = server18.connect(iP22);
    tp2.IP iP24 = null;
    boolean b25 = server18.removeException(iP24);
    tp2.IP iP26 = null;
    boolean b27 = server18.connect(iP26);
    tp2.IP iP28 = null;
    boolean b29 = server18.removeException(iP28);
    long long30 = server18.getLastUpdate();
    java.lang.String str31 = server18.toString();
    tp2.Server server32 = new tp2.Server();
    tp2.ITime iTime33 = server32.getTime();
    tp2.Server server34 = new tp2.Server();
    tp2.ITime iTime35 = server34.getTime();
    server32.setTime(iTime35);
    server32.update();
    server32.update();
    tp2.ITime iTime39 = server32.getTime();
    server18.setTime(iTime39);
    long long41 = server18.getLastUpdate();
    tp2.ITime iTime42 = server18.getTime();
    server0.setTime(iTime42);
    tp2.IP iP44 = null;
    boolean b45 = server0.addBan(iP44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long30 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str31 + "' != '" + "Server [lastUpdate=0, exceptions=(), bans={}]"+ "'", str31.equals("Server [lastUpdate=0, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long41 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == false);

  }

  @Test
  public void test011() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test011"); }


    tp2.Server server0 = new tp2.Server();
    tp2.ITime iTime1 = server0.getTime();
    server0.update();
    tp2.ITime iTime3 = server0.getTime();
    java.lang.String str4 = server0.toString();
    tp2.IP iP5 = null;
    boolean b6 = server0.addBan(iP5);
    tp2.IP iP7 = null;
    boolean b8 = server0.connect(iP7);
    tp2.IP iP9 = null;
    boolean b10 = server0.connect(iP9);
    java.lang.String str11 = server0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Server [lastUpdate=1465509740261, exceptions=(), bans={}]"+ "'", str4.equals("Server [lastUpdate=1465509740261, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Server [lastUpdate=1465509740261, exceptions=(), bans={}]"+ "'", str11.equals("Server [lastUpdate=1465509740261, exceptions=(), bans={}]"));

  }

  @Test
  public void test012() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test012"); }


    tp2.Server server0 = new tp2.Server();
    tp2.ITime iTime1 = server0.getTime();
    tp2.Server server2 = new tp2.Server();
    tp2.ITime iTime3 = server2.getTime();
    server0.setTime(iTime3);
    server0.update();
    java.lang.String str6 = server0.toString();
    java.lang.String str7 = server0.toString();
    tp2.IP iP8 = null;
    boolean b9 = server0.removeException(iP8);
    java.lang.String str10 = server0.toString();
    tp2.ITime iTime11 = server0.getTime();
    java.lang.String str12 = server0.toString();
    tp2.ITime iTime13 = server0.getTime();
    tp2.IP iP14 = null;
    boolean b15 = server0.connect(iP14);
    tp2.IP iP16 = null;
    boolean b17 = server0.removeBan(iP16);
    tp2.Server server18 = new tp2.Server();
    tp2.ITime iTime19 = server18.getTime();
    server18.update();
    tp2.ITime iTime21 = server18.getTime();
    tp2.IP iP22 = null;
    boolean b23 = server18.addBan(iP22);
    tp2.IP iP24 = null;
    boolean b25 = server18.removeException(iP24);
    tp2.Server server26 = new tp2.Server();
    tp2.ITime iTime27 = server26.getTime();
    server26.update();
    tp2.Server server29 = new tp2.Server();
    long long30 = server29.getLastUpdate();
    tp2.ITime iTime31 = server29.getTime();
    server26.setTime(iTime31);
    server18.setTime(iTime31);
    java.lang.String str34 = server18.toString();
    tp2.ITime iTime35 = server18.getTime();
    server0.setTime(iTime35);
    tp2.ITime iTime37 = server0.getTime();
    server0.update();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Server [lastUpdate=1465509740262, exceptions=(), bans={}]"+ "'", str6.equals("Server [lastUpdate=1465509740262, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Server [lastUpdate=1465509740262, exceptions=(), bans={}]"+ "'", str7.equals("Server [lastUpdate=1465509740262, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Server [lastUpdate=1465509740262, exceptions=(), bans={}]"+ "'", str10.equals("Server [lastUpdate=1465509740262, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Server [lastUpdate=1465509740262, exceptions=(), bans={}]"+ "'", str12.equals("Server [lastUpdate=1465509740262, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long30 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str34 + "' != '" + "Server [lastUpdate=1465509740263, exceptions=(), bans={}]"+ "'", str34.equals("Server [lastUpdate=1465509740263, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime37);

  }

  @Test
  public void test013() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test013"); }


    tp2.Server server0 = new tp2.Server();
    tp2.ITime iTime1 = server0.getTime();
    tp2.Server server2 = new tp2.Server();
    tp2.ITime iTime3 = server2.getTime();
    server0.setTime(iTime3);
    tp2.ITime iTime5 = server0.getTime();
    java.lang.String str6 = server0.toString();
    long long7 = server0.getLastUpdate();
    java.lang.String str8 = server0.toString();
    tp2.IP iP9 = null;
    boolean b10 = server0.removeException(iP9);
    tp2.IP iP11 = null;
    boolean b12 = server0.addBan(iP11);
    tp2.Server server13 = new tp2.Server();
    tp2.ITime iTime14 = server13.getTime();
    long long15 = server13.getLastUpdate();
    long long16 = server13.getLastUpdate();
    java.lang.String str17 = server13.toString();
    server13.update();
    tp2.IP iP19 = null;
    boolean b20 = server13.addBan(iP19);
    tp2.IP iP21 = null;
    boolean b22 = server13.removeBan(iP21);
    tp2.ITime iTime23 = server13.getTime();
    server0.setTime(iTime23);
    server0.update();
    server0.update();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Server [lastUpdate=0, exceptions=(), bans={}]"+ "'", str6.equals("Server [lastUpdate=0, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long7 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Server [lastUpdate=0, exceptions=(), bans={}]"+ "'", str8.equals("Server [lastUpdate=0, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long15 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long16 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "Server [lastUpdate=0, exceptions=(), bans={}]"+ "'", str17.equals("Server [lastUpdate=0, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime23);

  }

  @Test
  public void test014() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test014"); }


    tp2.Server server0 = new tp2.Server();
    tp2.ITime iTime1 = server0.getTime();
    tp2.Server server2 = new tp2.Server();
    tp2.ITime iTime3 = server2.getTime();
    server0.setTime(iTime3);
    tp2.ITime iTime5 = server0.getTime();
    tp2.IP iP6 = null;
    boolean b7 = server0.addBan(iP6);
    tp2.IP iP8 = null;
    boolean b9 = server0.addBan(iP8);
    java.lang.String str10 = server0.toString();
    tp2.IP iP11 = null;
    boolean b12 = server0.removeBan(iP11);
    tp2.ITime iTime13 = server0.getTime();
    tp2.IP iP14 = null;
    boolean b15 = server0.connect(iP14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Server [lastUpdate=0, exceptions=(), bans={}]"+ "'", str10.equals("Server [lastUpdate=0, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);

  }

  @Test
  public void test015() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test015"); }


    tp2.Server server0 = new tp2.Server();
    tp2.ITime iTime1 = server0.getTime();
    server0.update();
    tp2.ITime iTime3 = server0.getTime();
    long long4 = server0.getLastUpdate();
    java.lang.String str5 = server0.toString();
    tp2.IP iP6 = null;
    boolean b7 = server0.removeBan(iP6);
    tp2.IP iP8 = null;
    boolean b9 = server0.removeException(iP8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long4 == 1465509740290L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Server [lastUpdate=1465509740290, exceptions=(), bans={}]"+ "'", str5.equals("Server [lastUpdate=1465509740290, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);

  }

  @Test
  public void test016() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test016"); }


    tp2.Server server0 = new tp2.Server();
    tp2.ITime iTime1 = server0.getTime();
    tp2.Server server2 = new tp2.Server();
    tp2.ITime iTime3 = server2.getTime();
    server0.setTime(iTime3);
    server0.update();
    java.lang.String str6 = server0.toString();
    tp2.IP iP7 = null;
    boolean b8 = server0.removeException(iP7);
    long long9 = server0.getLastUpdate();
    tp2.IP iP10 = null;
    boolean b11 = server0.removeException(iP10);
    tp2.ITime iTime12 = server0.getTime();
    tp2.IP iP13 = null;
    boolean b14 = server0.removeException(iP13);
    server0.update();
    tp2.IP iP16 = null;
    boolean b17 = server0.removeBan(iP16);
    tp2.IP iP18 = null;
    boolean b19 = server0.removeException(iP18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Server [lastUpdate=1465509740292, exceptions=(), bans={}]"+ "'", str6.equals("Server [lastUpdate=1465509740292, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long9 == 1465509740292L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);

  }

  @Test
  public void test017() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test017"); }


    tp2.Server server0 = new tp2.Server();
    long long1 = server0.getLastUpdate();
    server0.update();
    tp2.IP iP3 = null;
    boolean b4 = server0.removeBan(iP3);
    tp2.ITime iTime5 = server0.getTime();
    tp2.IP iP6 = null;
    boolean b7 = server0.connect(iP6);
    tp2.Server server8 = new tp2.Server();
    tp2.ITime iTime9 = server8.getTime();
    long long10 = server8.getLastUpdate();
    tp2.IP iP11 = null;
    boolean b12 = server8.removeBan(iP11);
    tp2.Server server13 = new tp2.Server();
    tp2.ITime iTime14 = server13.getTime();
    tp2.Server server15 = new tp2.Server();
    tp2.ITime iTime16 = server15.getTime();
    server13.setTime(iTime16);
    server8.setTime(iTime16);
    tp2.Server server19 = new tp2.Server();
    tp2.ITime iTime20 = server19.getTime();
    server19.update();
    tp2.ITime iTime22 = server19.getTime();
    long long23 = server19.getLastUpdate();
    long long24 = server19.getLastUpdate();
    tp2.Server server25 = new tp2.Server();
    tp2.ITime iTime26 = server25.getTime();
    tp2.IP iP27 = null;
    boolean b28 = server25.removeException(iP27);
    tp2.IP iP29 = null;
    boolean b30 = server25.connect(iP29);
    tp2.IP iP31 = null;
    boolean b32 = server25.removeException(iP31);
    tp2.IP iP33 = null;
    boolean b34 = server25.connect(iP33);
    tp2.IP iP35 = null;
    boolean b36 = server25.removeException(iP35);
    tp2.Server server37 = new tp2.Server();
    tp2.ITime iTime38 = server37.getTime();
    server37.update();
    tp2.ITime iTime40 = server37.getTime();
    server25.setTime(iTime40);
    server19.setTime(iTime40);
    server8.setTime(iTime40);
    java.lang.String str44 = server8.toString();
    tp2.Server server45 = new tp2.Server();
    tp2.ITime iTime46 = server45.getTime();
    long long47 = server45.getLastUpdate();
    tp2.IP iP48 = null;
    boolean b49 = server45.removeBan(iP48);
    tp2.Server server50 = new tp2.Server();
    tp2.ITime iTime51 = server50.getTime();
    server50.update();
    tp2.ITime iTime53 = server50.getTime();
    tp2.ITime iTime54 = server50.getTime();
    server45.setTime(iTime54);
    server8.setTime(iTime54);
    tp2.IP iP57 = null;
    boolean b58 = server8.connect(iP57);
    tp2.ITime iTime59 = server8.getTime();
    server0.setTime(iTime59);
    tp2.IP iP61 = null;
    boolean b62 = server0.removeBan(iP61);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long10 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long23 == 1465509740294L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long24 == 1465509740294L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str44 + "' != '" + "Server [lastUpdate=0, exceptions=(), bans={}]"+ "'", str44.equals("Server [lastUpdate=0, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long47 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b49 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b58 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime59);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b62 == false);

  }

  @Test
  public void test018() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test018"); }


    tp2.Server server0 = new tp2.Server();
    tp2.ITime iTime1 = server0.getTime();
    server0.update();
    tp2.ITime iTime3 = server0.getTime();
    tp2.IP iP4 = null;
    boolean b5 = server0.connect(iP4);
    tp2.ITime iTime6 = server0.getTime();
    server0.update();
    tp2.ITime iTime8 = server0.getTime();
    server0.update();
    tp2.IP iP10 = null;
    boolean b11 = server0.connect(iP10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);

  }

  @Test
  public void test019() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test019"); }


    tp2.Server server0 = new tp2.Server();
    tp2.ITime iTime1 = server0.getTime();
    long long2 = server0.getLastUpdate();
    tp2.IP iP3 = null;
    boolean b4 = server0.removeBan(iP3);
    tp2.Server server5 = new tp2.Server();
    tp2.ITime iTime6 = server5.getTime();
    tp2.Server server7 = new tp2.Server();
    tp2.ITime iTime8 = server7.getTime();
    server5.setTime(iTime8);
    server0.setTime(iTime8);
    tp2.ITime iTime11 = server0.getTime();
    tp2.IP iP12 = null;
    boolean b13 = server0.removeBan(iP12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long2 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);

  }

  @Test
  public void test020() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test020"); }


    tp2.Server server0 = new tp2.Server();
    tp2.ITime iTime1 = server0.getTime();
    server0.update();
    tp2.Server server3 = new tp2.Server();
    long long4 = server3.getLastUpdate();
    tp2.ITime iTime5 = server3.getTime();
    server0.setTime(iTime5);
    long long7 = server0.getLastUpdate();
    tp2.Server server8 = new tp2.Server();
    tp2.ITime iTime9 = server8.getTime();
    tp2.Server server10 = new tp2.Server();
    tp2.ITime iTime11 = server10.getTime();
    server8.setTime(iTime11);
    tp2.ITime iTime13 = server8.getTime();
    tp2.IP iP14 = null;
    boolean b15 = server8.addBan(iP14);
    tp2.Server server16 = new tp2.Server();
    tp2.ITime iTime17 = server16.getTime();
    tp2.ITime iTime18 = server16.getTime();
    server8.setTime(iTime18);
    server0.setTime(iTime18);
    tp2.IP iP21 = null;
    boolean b22 = server0.addBan(iP21);
    tp2.IP iP23 = null;
    boolean b24 = server0.addBan(iP23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long4 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long7 == 1465509740326L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);

  }

  @Test
  public void test021() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test021"); }


    tp2.Server server0 = new tp2.Server();
    long long1 = server0.getLastUpdate();
    tp2.ITime iTime2 = server0.getTime();
    tp2.IP iP3 = null;
    boolean b4 = server0.removeException(iP3);
    tp2.IP iP5 = null;
    boolean b6 = server0.addBan(iP5);
    server0.update();
    server0.update();
    tp2.IP iP9 = null;
    boolean b10 = server0.removeBan(iP9);
    java.lang.String str11 = server0.toString();
    long long12 = server0.getLastUpdate();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Server [lastUpdate=1465509740335, exceptions=(), bans={}]"+ "'", str11.equals("Server [lastUpdate=1465509740335, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long12 == 1465509740335L);

  }

  @Test
  public void test022() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test022"); }


    tp2.Server server0 = new tp2.Server();
    tp2.ITime iTime1 = server0.getTime();
    tp2.IP iP2 = null;
    boolean b3 = server0.removeException(iP2);
    tp2.IP iP4 = null;
    boolean b5 = server0.connect(iP4);
    tp2.IP iP6 = null;
    boolean b7 = server0.removeException(iP6);
    tp2.IP iP8 = null;
    boolean b9 = server0.connect(iP8);
    tp2.IP iP10 = null;
    boolean b11 = server0.removeException(iP10);
    tp2.Server server12 = new tp2.Server();
    tp2.ITime iTime13 = server12.getTime();
    server12.update();
    tp2.ITime iTime15 = server12.getTime();
    server0.setTime(iTime15);
    tp2.Server server17 = new tp2.Server();
    tp2.ITime iTime18 = server17.getTime();
    server17.update();
    tp2.ITime iTime20 = server17.getTime();
    server0.setTime(iTime20);
    tp2.IP iP22 = null;
    boolean b23 = server0.addBan(iP22);
    tp2.Server server24 = new tp2.Server();
    tp2.ITime iTime25 = server24.getTime();
    server24.update();
    tp2.ITime iTime27 = server24.getTime();
    server0.setTime(iTime27);
    java.lang.String str29 = server0.toString();
    java.lang.String str30 = server0.toString();
    tp2.IP iP31 = null;
    // The following exception was thrown during execution in test generation
    try {
      boolean b32 = server0.addException(iP31);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str29 + "' != '" + "Server [lastUpdate=0, exceptions=(), bans={}]"+ "'", str29.equals("Server [lastUpdate=0, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str30 + "' != '" + "Server [lastUpdate=0, exceptions=(), bans={}]"+ "'", str30.equals("Server [lastUpdate=0, exceptions=(), bans={}]"));

  }

  @Test
  public void test023() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test023"); }


    tp2.Server server0 = new tp2.Server();
    long long1 = server0.getLastUpdate();
    server0.update();
    tp2.IP iP3 = null;
    boolean b4 = server0.removeBan(iP3);
    tp2.ITime iTime5 = server0.getTime();
    tp2.IP iP6 = null;
    boolean b7 = server0.removeException(iP6);
    java.lang.String str8 = server0.toString();
    tp2.IP iP9 = null;
    boolean b10 = server0.connect(iP9);
    java.lang.String str11 = server0.toString();
    tp2.Server server12 = new tp2.Server();
    tp2.ITime iTime13 = server12.getTime();
    tp2.IP iP14 = null;
    boolean b15 = server12.connect(iP14);
    tp2.ITime iTime16 = server12.getTime();
    server0.setTime(iTime16);
    long long18 = server0.getLastUpdate();
    tp2.Server server19 = new tp2.Server();
    long long20 = server19.getLastUpdate();
    tp2.ITime iTime21 = server19.getTime();
    tp2.IP iP22 = null;
    boolean b23 = server19.removeException(iP22);
    tp2.IP iP24 = null;
    boolean b25 = server19.removeBan(iP24);
    tp2.IP iP26 = null;
    boolean b27 = server19.connect(iP26);
    tp2.ITime iTime28 = server19.getTime();
    tp2.IP iP29 = null;
    boolean b30 = server19.addBan(iP29);
    server19.update();
    tp2.ITime iTime32 = server19.getTime();
    server0.setTime(iTime32);
    java.lang.String str34 = server0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Server [lastUpdate=1465509740346, exceptions=(), bans={}]"+ "'", str8.equals("Server [lastUpdate=1465509740346, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Server [lastUpdate=1465509740346, exceptions=(), bans={}]"+ "'", str11.equals("Server [lastUpdate=1465509740346, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long18 == 1465509740346L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long20 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str34 + "' != '" + "Server [lastUpdate=1465509740346, exceptions=(), bans={}]"+ "'", str34.equals("Server [lastUpdate=1465509740346, exceptions=(), bans={}]"));

  }

  @Test
  public void test024() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test024"); }


    tp2.Server server0 = new tp2.Server();
    tp2.ITime iTime1 = server0.getTime();
    tp2.IP iP2 = null;
    boolean b3 = server0.removeException(iP2);
    tp2.IP iP4 = null;
    boolean b5 = server0.connect(iP4);
    tp2.IP iP6 = null;
    boolean b7 = server0.removeException(iP6);
    tp2.IP iP8 = null;
    boolean b9 = server0.connect(iP8);
    tp2.IP iP10 = null;
    boolean b11 = server0.removeException(iP10);
    long long12 = server0.getLastUpdate();
    java.lang.String str13 = server0.toString();
    tp2.Server server14 = new tp2.Server();
    tp2.ITime iTime15 = server14.getTime();
    tp2.Server server16 = new tp2.Server();
    tp2.ITime iTime17 = server16.getTime();
    server14.setTime(iTime17);
    server14.update();
    server14.update();
    tp2.ITime iTime21 = server14.getTime();
    server0.setTime(iTime21);
    java.lang.String str23 = server0.toString();
    server0.update();
    server0.update();
    server0.update();
    java.lang.String str27 = server0.toString();
    tp2.ITime iTime28 = server0.getTime();
    long long29 = server0.getLastUpdate();
    tp2.ITime iTime30 = server0.getTime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long12 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Server [lastUpdate=0, exceptions=(), bans={}]"+ "'", str13.equals("Server [lastUpdate=0, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + "Server [lastUpdate=0, exceptions=(), bans={}]"+ "'", str23.equals("Server [lastUpdate=0, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str27 + "' != '" + "Server [lastUpdate=1465509740355, exceptions=(), bans={}]"+ "'", str27.equals("Server [lastUpdate=1465509740355, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long29 == 1465509740355L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime30);

  }

  @Test
  public void test025() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test025"); }


    tp2.Server server0 = new tp2.Server();
    long long1 = server0.getLastUpdate();
    server0.update();
    tp2.IP iP3 = null;
    boolean b4 = server0.removeException(iP3);
    server0.update();
    java.lang.String str6 = server0.toString();
    tp2.IP iP7 = null;
    boolean b8 = server0.addBan(iP7);
    long long9 = server0.getLastUpdate();
    tp2.IP iP10 = null;
    boolean b11 = server0.removeException(iP10);
    tp2.IP iP12 = null;
    boolean b13 = server0.connect(iP12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Server [lastUpdate=1465509740365, exceptions=(), bans={}]"+ "'", str6.equals("Server [lastUpdate=1465509740365, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long9 == 1465509740365L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);

  }

  @Test
  public void test026() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test026"); }


    tp2.Server server0 = new tp2.Server();
    long long1 = server0.getLastUpdate();
    tp2.ITime iTime2 = server0.getTime();
    tp2.IP iP3 = null;
    boolean b4 = server0.removeException(iP3);
    tp2.IP iP5 = null;
    boolean b6 = server0.removeBan(iP5);
    tp2.IP iP7 = null;
    boolean b8 = server0.removeException(iP7);
    tp2.IP iP9 = null;
    boolean b10 = server0.addBan(iP9);
    tp2.IP iP11 = null;
    boolean b12 = server0.removeException(iP11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
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
  public void test027() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test027"); }


    tp2.Server server0 = new tp2.Server();
    tp2.ITime iTime1 = server0.getTime();
    tp2.Server server2 = new tp2.Server();
    tp2.ITime iTime3 = server2.getTime();
    server0.setTime(iTime3);
    server0.update();
    java.lang.String str6 = server0.toString();
    tp2.IP iP7 = null;
    boolean b8 = server0.removeException(iP7);
    server0.update();
    tp2.IP iP10 = null;
    boolean b11 = server0.removeException(iP10);
    tp2.IP iP12 = null;
    boolean b13 = server0.connect(iP12);
    tp2.IP iP14 = null;
    boolean b15 = server0.removeBan(iP14);
    server0.update();
    tp2.ITime iTime17 = server0.getTime();
    long long18 = server0.getLastUpdate();
    tp2.IP iP19 = null;
    boolean b20 = server0.removeException(iP19);
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
    org.junit.Assert.assertNotNull(iTime1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Server [lastUpdate=1465509740366, exceptions=(), bans={}]"+ "'", str6.equals("Server [lastUpdate=1465509740366, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long18 == 1465509740366L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);

  }

  @Test
  public void test028() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test028"); }


    tp2.Server server0 = new tp2.Server();
    tp2.ITime iTime1 = server0.getTime();
    tp2.Server server2 = new tp2.Server();
    tp2.ITime iTime3 = server2.getTime();
    server0.setTime(iTime3);
    tp2.ITime iTime5 = server0.getTime();
    java.lang.String str6 = server0.toString();
    long long7 = server0.getLastUpdate();
    java.lang.String str8 = server0.toString();
    tp2.IP iP9 = null;
    boolean b10 = server0.removeException(iP9);
    tp2.IP iP11 = null;
    boolean b12 = server0.addBan(iP11);
    tp2.Server server13 = new tp2.Server();
    tp2.ITime iTime14 = server13.getTime();
    long long15 = server13.getLastUpdate();
    long long16 = server13.getLastUpdate();
    java.lang.String str17 = server13.toString();
    server13.update();
    tp2.IP iP19 = null;
    boolean b20 = server13.addBan(iP19);
    tp2.IP iP21 = null;
    boolean b22 = server13.removeBan(iP21);
    tp2.ITime iTime23 = server13.getTime();
    server0.setTime(iTime23);
    server0.update();
    java.lang.String str26 = server0.toString();
    tp2.ITime iTime27 = server0.getTime();
    tp2.IP iP28 = null;
    boolean b29 = server0.removeBan(iP28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Server [lastUpdate=0, exceptions=(), bans={}]"+ "'", str6.equals("Server [lastUpdate=0, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long7 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Server [lastUpdate=0, exceptions=(), bans={}]"+ "'", str8.equals("Server [lastUpdate=0, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long15 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long16 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "Server [lastUpdate=0, exceptions=(), bans={}]"+ "'", str17.equals("Server [lastUpdate=0, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str26 + "' != '" + "Server [lastUpdate=1465509740368, exceptions=(), bans={}]"+ "'", str26.equals("Server [lastUpdate=1465509740368, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == false);

  }

  @Test
  public void test029() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test029"); }


    tp2.Server server0 = new tp2.Server();
    tp2.ITime iTime1 = server0.getTime();
    tp2.IP iP2 = null;
    boolean b3 = server0.removeException(iP2);
    tp2.IP iP4 = null;
    boolean b5 = server0.connect(iP4);
    tp2.IP iP6 = null;
    boolean b7 = server0.removeException(iP6);
    tp2.IP iP8 = null;
    boolean b9 = server0.connect(iP8);
    tp2.IP iP10 = null;
    boolean b11 = server0.removeException(iP10);
    tp2.Server server12 = new tp2.Server();
    tp2.ITime iTime13 = server12.getTime();
    server12.update();
    tp2.ITime iTime15 = server12.getTime();
    server0.setTime(iTime15);
    tp2.Server server17 = new tp2.Server();
    tp2.ITime iTime18 = server17.getTime();
    server17.update();
    tp2.ITime iTime20 = server17.getTime();
    server0.setTime(iTime20);
    tp2.IP iP22 = null;
    boolean b23 = server0.addBan(iP22);
    tp2.Server server24 = new tp2.Server();
    tp2.ITime iTime25 = server24.getTime();
    server24.update();
    tp2.ITime iTime27 = server24.getTime();
    server0.setTime(iTime27);
    java.lang.String str29 = server0.toString();
    long long30 = server0.getLastUpdate();
    java.lang.String str31 = server0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str29 + "' != '" + "Server [lastUpdate=0, exceptions=(), bans={}]"+ "'", str29.equals("Server [lastUpdate=0, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long30 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str31 + "' != '" + "Server [lastUpdate=0, exceptions=(), bans={}]"+ "'", str31.equals("Server [lastUpdate=0, exceptions=(), bans={}]"));

  }

  @Test
  public void test030() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test030"); }


    tp2.Server server0 = new tp2.Server();
    long long1 = server0.getLastUpdate();
    tp2.ITime iTime2 = server0.getTime();
    tp2.IP iP3 = null;
    boolean b4 = server0.removeException(iP3);
    tp2.IP iP5 = null;
    boolean b6 = server0.removeBan(iP5);
    tp2.IP iP7 = null;
    boolean b8 = server0.connect(iP7);
    tp2.ITime iTime9 = server0.getTime();
    tp2.IP iP10 = null;
    boolean b11 = server0.addBan(iP10);
    server0.update();
    tp2.ITime iTime13 = server0.getTime();
    tp2.ITime iTime14 = server0.getTime();
    tp2.IP iP15 = null;
    boolean b16 = server0.removeException(iP15);
    tp2.IP iP17 = null;
    boolean b18 = server0.connect(iP17);
    tp2.IP iP19 = null;
    boolean b20 = server0.removeException(iP19);
    tp2.ITime iTime21 = server0.getTime();
    tp2.IP iP22 = null;
    boolean b23 = server0.addBan(iP22);
    tp2.IP iP24 = null;
    boolean b25 = server0.removeBan(iP24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);

  }

  @Test
  public void test031() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test031"); }


    tp2.Server server0 = new tp2.Server();
    tp2.ITime iTime1 = server0.getTime();
    tp2.IP iP2 = null;
    boolean b3 = server0.removeException(iP2);
    tp2.IP iP4 = null;
    boolean b5 = server0.removeException(iP4);
    tp2.IP iP6 = null;
    boolean b7 = server0.addBan(iP6);
    tp2.IP iP8 = null;
    boolean b9 = server0.connect(iP8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);

  }

  @Test
  public void test032() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test032"); }


    tp2.Server server0 = new tp2.Server();
    tp2.ITime iTime1 = server0.getTime();
    server0.update();
    tp2.ITime iTime3 = server0.getTime();
    tp2.IP iP4 = null;
    boolean b5 = server0.addBan(iP4);
    tp2.IP iP6 = null;
    boolean b7 = server0.removeException(iP6);
    tp2.IP iP8 = null;
    boolean b9 = server0.addBan(iP8);
    tp2.IP iP10 = null;
    boolean b11 = server0.connect(iP10);
    tp2.IP iP12 = null;
    boolean b13 = server0.removeException(iP12);
    tp2.IP iP14 = null;
    boolean b15 = server0.removeException(iP14);
    tp2.IP iP16 = null;
    boolean b17 = server0.addBan(iP16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);

  }

  @Test
  public void test033() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test033"); }


    tp2.Server server0 = new tp2.Server();
    tp2.ITime iTime1 = server0.getTime();
    tp2.IP iP2 = null;
    boolean b3 = server0.removeException(iP2);
    tp2.IP iP4 = null;
    boolean b5 = server0.connect(iP4);
    java.lang.String str6 = server0.toString();
    long long7 = server0.getLastUpdate();
    long long8 = server0.getLastUpdate();
    tp2.Server server9 = new tp2.Server();
    tp2.ITime iTime10 = server9.getTime();
    tp2.IP iP11 = null;
    boolean b12 = server9.connect(iP11);
    tp2.IP iP13 = null;
    boolean b14 = server9.removeBan(iP13);
    java.lang.String str15 = server9.toString();
    tp2.IP iP16 = null;
    boolean b17 = server9.removeException(iP16);
    long long18 = server9.getLastUpdate();
    tp2.IP iP19 = null;
    boolean b20 = server9.removeBan(iP19);
    long long21 = server9.getLastUpdate();
    tp2.ITime iTime22 = server9.getTime();
    server0.setTime(iTime22);
    server0.update();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Server [lastUpdate=0, exceptions=(), bans={}]"+ "'", str6.equals("Server [lastUpdate=0, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long7 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long8 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "Server [lastUpdate=0, exceptions=(), bans={}]"+ "'", str15.equals("Server [lastUpdate=0, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long18 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long21 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime22);

  }

  @Test
  public void test034() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test034"); }


    tp2.Server server0 = new tp2.Server();
    tp2.ITime iTime1 = server0.getTime();
    tp2.Server server2 = new tp2.Server();
    tp2.ITime iTime3 = server2.getTime();
    server0.setTime(iTime3);
    server0.update();
    tp2.IP iP6 = null;
    boolean b7 = server0.removeBan(iP6);
    tp2.IP iP8 = null;
    boolean b9 = server0.removeException(iP8);
    server0.update();
    tp2.Server server11 = new tp2.Server();
    long long12 = server11.getLastUpdate();
    tp2.ITime iTime13 = server11.getTime();
    tp2.IP iP14 = null;
    boolean b15 = server11.removeException(iP14);
    tp2.Server server16 = new tp2.Server();
    long long17 = server16.getLastUpdate();
    tp2.ITime iTime18 = server16.getTime();
    server11.setTime(iTime18);
    server0.setTime(iTime18);
    java.lang.String str21 = server0.toString();
    java.lang.String str22 = server0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long12 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long17 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "Server [lastUpdate=1465509740393, exceptions=(), bans={}]"+ "'", str21.equals("Server [lastUpdate=1465509740393, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + "Server [lastUpdate=1465509740393, exceptions=(), bans={}]"+ "'", str22.equals("Server [lastUpdate=1465509740393, exceptions=(), bans={}]"));

  }

  @Test
  public void test035() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test035"); }


    tp2.Server server0 = new tp2.Server();
    tp2.ITime iTime1 = server0.getTime();
    long long2 = server0.getLastUpdate();
    tp2.IP iP3 = null;
    boolean b4 = server0.removeBan(iP3);
    tp2.Server server5 = new tp2.Server();
    tp2.ITime iTime6 = server5.getTime();
    tp2.Server server7 = new tp2.Server();
    tp2.ITime iTime8 = server7.getTime();
    server5.setTime(iTime8);
    server0.setTime(iTime8);
    tp2.IP iP11 = null;
    boolean b12 = server0.connect(iP11);
    java.lang.String str13 = server0.toString();
    tp2.IP iP14 = null;
    boolean b15 = server0.connect(iP14);
    tp2.IP iP16 = null;
    boolean b17 = server0.connect(iP16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long2 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Server [lastUpdate=0, exceptions=(), bans={}]"+ "'", str13.equals("Server [lastUpdate=0, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);

  }

  @Test
  public void test036() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test036"); }


    tp2.Server server0 = new tp2.Server();
    tp2.ITime iTime1 = server0.getTime();
    tp2.IP iP2 = null;
    boolean b3 = server0.removeException(iP2);
    tp2.IP iP4 = null;
    boolean b5 = server0.connect(iP4);
    tp2.IP iP6 = null;
    boolean b7 = server0.removeException(iP6);
    tp2.IP iP8 = null;
    boolean b9 = server0.connect(iP8);
    tp2.IP iP10 = null;
    boolean b11 = server0.removeException(iP10);
    tp2.Server server12 = new tp2.Server();
    tp2.ITime iTime13 = server12.getTime();
    server12.update();
    tp2.ITime iTime15 = server12.getTime();
    server0.setTime(iTime15);
    tp2.Server server17 = new tp2.Server();
    tp2.ITime iTime18 = server17.getTime();
    server17.update();
    tp2.ITime iTime20 = server17.getTime();
    server0.setTime(iTime20);
    tp2.IP iP22 = null;
    boolean b23 = server0.addBan(iP22);
    tp2.Server server24 = new tp2.Server();
    tp2.ITime iTime25 = server24.getTime();
    server24.update();
    tp2.ITime iTime27 = server24.getTime();
    server0.setTime(iTime27);
    java.lang.String str29 = server0.toString();
    long long30 = server0.getLastUpdate();
    tp2.IP iP31 = null;
    boolean b32 = server0.removeException(iP31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str29 + "' != '" + "Server [lastUpdate=0, exceptions=(), bans={}]"+ "'", str29.equals("Server [lastUpdate=0, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long30 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);

  }

  @Test
  public void test037() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test037"); }


    tp2.Server server0 = new tp2.Server();
    tp2.ITime iTime1 = server0.getTime();
    tp2.IP iP2 = null;
    boolean b3 = server0.removeException(iP2);
    tp2.IP iP4 = null;
    boolean b5 = server0.connect(iP4);
    tp2.IP iP6 = null;
    boolean b7 = server0.removeException(iP6);
    tp2.IP iP8 = null;
    boolean b9 = server0.connect(iP8);
    tp2.IP iP10 = null;
    boolean b11 = server0.removeException(iP10);
    tp2.Server server12 = new tp2.Server();
    tp2.ITime iTime13 = server12.getTime();
    server12.update();
    tp2.ITime iTime15 = server12.getTime();
    server0.setTime(iTime15);
    tp2.Server server17 = new tp2.Server();
    tp2.ITime iTime18 = server17.getTime();
    server17.update();
    tp2.ITime iTime20 = server17.getTime();
    server0.setTime(iTime20);
    tp2.IP iP22 = null;
    boolean b23 = server0.addBan(iP22);
    tp2.IP iP24 = null;
    boolean b25 = server0.connect(iP24);
    tp2.Server server26 = new tp2.Server();
    tp2.ITime iTime27 = server26.getTime();
    tp2.IP iP28 = null;
    boolean b29 = server26.removeException(iP28);
    java.lang.String str30 = server26.toString();
    java.lang.String str31 = server26.toString();
    tp2.Server server32 = new tp2.Server();
    long long33 = server32.getLastUpdate();
    server32.update();
    tp2.IP iP35 = null;
    boolean b36 = server32.removeBan(iP35);
    long long37 = server32.getLastUpdate();
    tp2.Server server38 = new tp2.Server();
    tp2.ITime iTime39 = server38.getTime();
    tp2.IP iP40 = null;
    boolean b41 = server38.removeException(iP40);
    tp2.ITime iTime42 = server38.getTime();
    tp2.ITime iTime43 = server38.getTime();
    server32.setTime(iTime43);
    server26.setTime(iTime43);
    tp2.ITime iTime46 = server26.getTime();
    server0.setTime(iTime46);
    long long48 = server0.getLastUpdate();
    java.lang.String str49 = server0.toString();
    tp2.IP iP50 = null;
    boolean b51 = server0.addBan(iP50);
    tp2.IP iP52 = null;
    boolean b53 = server0.removeException(iP52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str30 + "' != '" + "Server [lastUpdate=0, exceptions=(), bans={}]"+ "'", str30.equals("Server [lastUpdate=0, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str31 + "' != '" + "Server [lastUpdate=0, exceptions=(), bans={}]"+ "'", str31.equals("Server [lastUpdate=0, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long33 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long37 == 1465509740411L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long48 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str49 + "' != '" + "Server [lastUpdate=0, exceptions=(), bans={}]"+ "'", str49.equals("Server [lastUpdate=0, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b51 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b53 == false);

  }

  @Test
  public void test038() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test038"); }


    tp2.Server server0 = new tp2.Server();
    long long1 = server0.getLastUpdate();
    tp2.ITime iTime2 = server0.getTime();
    tp2.IP iP3 = null;
    boolean b4 = server0.removeException(iP3);
    tp2.IP iP5 = null;
    boolean b6 = server0.addBan(iP5);
    java.lang.String str7 = server0.toString();
    tp2.ITime iTime8 = server0.getTime();
    tp2.Server server9 = new tp2.Server();
    tp2.ITime iTime10 = server9.getTime();
    tp2.IP iP11 = null;
    boolean b12 = server9.removeException(iP11);
    tp2.IP iP13 = null;
    boolean b14 = server9.connect(iP13);
    tp2.IP iP15 = null;
    boolean b16 = server9.removeException(iP15);
    tp2.IP iP17 = null;
    boolean b18 = server9.connect(iP17);
    tp2.IP iP19 = null;
    boolean b20 = server9.removeException(iP19);
    long long21 = server9.getLastUpdate();
    java.lang.String str22 = server9.toString();
    tp2.Server server23 = new tp2.Server();
    tp2.ITime iTime24 = server23.getTime();
    tp2.Server server25 = new tp2.Server();
    tp2.ITime iTime26 = server25.getTime();
    server23.setTime(iTime26);
    server23.update();
    server23.update();
    tp2.ITime iTime30 = server23.getTime();
    server9.setTime(iTime30);
    tp2.Server server32 = new tp2.Server();
    long long33 = server32.getLastUpdate();
    server32.update();
    tp2.IP iP35 = null;
    boolean b36 = server32.removeBan(iP35);
    long long37 = server32.getLastUpdate();
    tp2.Server server38 = new tp2.Server();
    tp2.ITime iTime39 = server38.getTime();
    tp2.IP iP40 = null;
    boolean b41 = server38.removeException(iP40);
    tp2.ITime iTime42 = server38.getTime();
    tp2.ITime iTime43 = server38.getTime();
    server32.setTime(iTime43);
    server9.setTime(iTime43);
    server0.setTime(iTime43);
    tp2.Server server47 = new tp2.Server();
    tp2.ITime iTime48 = server47.getTime();
    server47.update();
    tp2.ITime iTime50 = server47.getTime();
    tp2.ITime iTime51 = server47.getTime();
    server0.setTime(iTime51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Server [lastUpdate=0, exceptions=(), bans={}]"+ "'", str7.equals("Server [lastUpdate=0, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long21 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + "Server [lastUpdate=0, exceptions=(), bans={}]"+ "'", str22.equals("Server [lastUpdate=0, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long33 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long37 == 1465509740425L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime51);

  }

  @Test
  public void test039() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test039"); }


    tp2.Server server0 = new tp2.Server();
    tp2.ITime iTime1 = server0.getTime();
    tp2.IP iP2 = null;
    boolean b3 = server0.removeException(iP2);
    tp2.IP iP4 = null;
    boolean b5 = server0.connect(iP4);
    tp2.IP iP6 = null;
    boolean b7 = server0.removeException(iP6);
    tp2.IP iP8 = null;
    boolean b9 = server0.connect(iP8);
    tp2.IP iP10 = null;
    boolean b11 = server0.removeException(iP10);
    tp2.Server server12 = new tp2.Server();
    tp2.ITime iTime13 = server12.getTime();
    server12.update();
    tp2.ITime iTime15 = server12.getTime();
    server0.setTime(iTime15);
    tp2.IP iP17 = null;
    boolean b18 = server0.removeBan(iP17);
    tp2.IP iP19 = null;
    boolean b20 = server0.removeBan(iP19);
    long long21 = server0.getLastUpdate();
    java.lang.String str22 = server0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long21 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + "Server [lastUpdate=0, exceptions=(), bans={}]"+ "'", str22.equals("Server [lastUpdate=0, exceptions=(), bans={}]"));

  }

  @Test
  public void test040() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test040"); }


    tp2.Server server0 = new tp2.Server();
    tp2.ITime iTime1 = server0.getTime();
    tp2.Server server2 = new tp2.Server();
    tp2.ITime iTime3 = server2.getTime();
    server0.setTime(iTime3);
    tp2.ITime iTime5 = server0.getTime();
    java.lang.String str6 = server0.toString();
    long long7 = server0.getLastUpdate();
    java.lang.String str8 = server0.toString();
    tp2.IP iP9 = null;
    boolean b10 = server0.removeException(iP9);
    tp2.IP iP11 = null;
    boolean b12 = server0.addBan(iP11);
    tp2.Server server13 = new tp2.Server();
    tp2.ITime iTime14 = server13.getTime();
    long long15 = server13.getLastUpdate();
    long long16 = server13.getLastUpdate();
    java.lang.String str17 = server13.toString();
    server13.update();
    tp2.IP iP19 = null;
    boolean b20 = server13.addBan(iP19);
    tp2.IP iP21 = null;
    boolean b22 = server13.removeBan(iP21);
    tp2.ITime iTime23 = server13.getTime();
    server0.setTime(iTime23);
    server0.update();
    java.lang.String str26 = server0.toString();
    tp2.Server server27 = new tp2.Server();
    tp2.ITime iTime28 = server27.getTime();
    server27.update();
    tp2.ITime iTime30 = server27.getTime();
    tp2.IP iP31 = null;
    boolean b32 = server27.addBan(iP31);
    tp2.IP iP33 = null;
    boolean b34 = server27.removeException(iP33);
    tp2.Server server35 = new tp2.Server();
    tp2.ITime iTime36 = server35.getTime();
    server35.update();
    tp2.Server server38 = new tp2.Server();
    long long39 = server38.getLastUpdate();
    tp2.ITime iTime40 = server38.getTime();
    server35.setTime(iTime40);
    server27.setTime(iTime40);
    tp2.IP iP43 = null;
    boolean b44 = server27.addBan(iP43);
    tp2.ITime iTime45 = server27.getTime();
    server0.setTime(iTime45);
    tp2.IP iP47 = null;
    boolean b48 = server0.connect(iP47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Server [lastUpdate=0, exceptions=(), bans={}]"+ "'", str6.equals("Server [lastUpdate=0, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long7 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Server [lastUpdate=0, exceptions=(), bans={}]"+ "'", str8.equals("Server [lastUpdate=0, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long15 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long16 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "Server [lastUpdate=0, exceptions=(), bans={}]"+ "'", str17.equals("Server [lastUpdate=0, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str26 + "' != '" + "Server [lastUpdate=1465509740456, exceptions=(), bans={}]"+ "'", str26.equals("Server [lastUpdate=1465509740456, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long39 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b48 == true);

  }

  @Test
  public void test041() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test041"); }


    tp2.Server server0 = new tp2.Server();
    tp2.ITime iTime1 = server0.getTime();
    tp2.ITime iTime2 = server0.getTime();
    tp2.IP iP3 = null;
    boolean b4 = server0.connect(iP3);
    tp2.IP iP5 = null;
    boolean b6 = server0.addBan(iP5);
    tp2.IP iP7 = null;
    boolean b8 = server0.removeException(iP7);
    tp2.IP iP9 = null;
    boolean b10 = server0.removeException(iP9);
    tp2.IP iP11 = null;
    boolean b12 = server0.removeBan(iP11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
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
  public void test042() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test042"); }


    tp2.Server server0 = new tp2.Server();
    tp2.ITime iTime1 = server0.getTime();
    tp2.IP iP2 = null;
    boolean b3 = server0.connect(iP2);
    tp2.IP iP4 = null;
    boolean b5 = server0.removeBan(iP4);
    long long6 = server0.getLastUpdate();
    tp2.ITime iTime7 = server0.getTime();
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
    org.junit.Assert.assertNotNull(iTime1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long6 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime7);

  }

  @Test
  public void test043() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test043"); }


    tp2.Server server0 = new tp2.Server();
    tp2.ITime iTime1 = server0.getTime();
    server0.update();
    tp2.ITime iTime3 = server0.getTime();
    tp2.Server server4 = new tp2.Server();
    long long5 = server4.getLastUpdate();
    tp2.ITime iTime6 = server4.getTime();
    server0.setTime(iTime6);
    long long8 = server0.getLastUpdate();
    tp2.IP iP9 = null;
    boolean b10 = server0.addBan(iP9);
    tp2.IP iP11 = null;
    boolean b12 = server0.connect(iP11);
    server0.update();
    java.lang.String str14 = server0.toString();
    tp2.ITime iTime15 = server0.getTime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long5 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long8 == 1465509740487L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "Server [lastUpdate=1465509740487, exceptions=(), bans={}]"+ "'", str14.equals("Server [lastUpdate=1465509740487, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime15);

  }

  @Test
  public void test044() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test044"); }


    tp2.Server server0 = new tp2.Server();
    tp2.ITime iTime1 = server0.getTime();
    long long2 = server0.getLastUpdate();
    tp2.IP iP3 = null;
    boolean b4 = server0.removeBan(iP3);
    tp2.IP iP5 = null;
    boolean b6 = server0.removeBan(iP5);
    tp2.IP iP7 = null;
    boolean b8 = server0.addBan(iP7);
    tp2.Server server9 = new tp2.Server();
    tp2.ITime iTime10 = server9.getTime();
    tp2.ITime iTime11 = server9.getTime();
    server0.setTime(iTime11);
    tp2.IP iP13 = null;
    boolean b14 = server0.addBan(iP13);
    tp2.IP iP15 = null;
    boolean b16 = server0.addBan(iP15);
    tp2.Server server17 = new tp2.Server();
    tp2.ITime iTime18 = server17.getTime();
    tp2.IP iP19 = null;
    boolean b20 = server17.removeException(iP19);
    tp2.IP iP21 = null;
    boolean b22 = server17.connect(iP21);
    java.lang.String str23 = server17.toString();
    tp2.IP iP24 = null;
    boolean b25 = server17.removeBan(iP24);
    tp2.ITime iTime26 = server17.getTime();
    server0.setTime(iTime26);
    tp2.IP iP28 = null;
    boolean b29 = server0.addBan(iP28);
    long long30 = server0.getLastUpdate();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long2 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + "Server [lastUpdate=0, exceptions=(), bans={}]"+ "'", str23.equals("Server [lastUpdate=0, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long30 == 0L);

  }

  @Test
  public void test045() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test045"); }


    tp2.Server server0 = new tp2.Server();
    tp2.ITime iTime1 = server0.getTime();
    server0.update();
    tp2.ITime iTime3 = server0.getTime();
    tp2.Server server4 = new tp2.Server();
    long long5 = server4.getLastUpdate();
    tp2.ITime iTime6 = server4.getTime();
    server0.setTime(iTime6);
    tp2.ITime iTime8 = server0.getTime();
    tp2.IP iP9 = null;
    boolean b10 = server0.connect(iP9);
    tp2.IP iP11 = null;
    boolean b12 = server0.connect(iP11);
    tp2.ITime iTime13 = server0.getTime();
    tp2.Server server14 = new tp2.Server();
    tp2.ITime iTime15 = server14.getTime();
    long long16 = server14.getLastUpdate();
    java.lang.String str17 = server14.toString();
    tp2.ITime iTime18 = server14.getTime();
    tp2.IP iP19 = null;
    boolean b20 = server14.removeBan(iP19);
    tp2.Server server21 = new tp2.Server();
    tp2.ITime iTime22 = server21.getTime();
    server21.update();
    tp2.ITime iTime24 = server21.getTime();
    long long25 = server21.getLastUpdate();
    long long26 = server21.getLastUpdate();
    long long27 = server21.getLastUpdate();
    tp2.Server server28 = new tp2.Server();
    tp2.ITime iTime29 = server28.getTime();
    server28.update();
    tp2.ITime iTime31 = server28.getTime();
    tp2.IP iP32 = null;
    boolean b33 = server28.addBan(iP32);
    tp2.IP iP34 = null;
    boolean b35 = server28.removeException(iP34);
    tp2.ITime iTime36 = server28.getTime();
    server21.setTime(iTime36);
    tp2.IP iP38 = null;
    boolean b39 = server21.addBan(iP38);
    tp2.ITime iTime40 = server21.getTime();
    server14.setTime(iTime40);
    tp2.Server server42 = new tp2.Server();
    tp2.ITime iTime43 = server42.getTime();
    tp2.IP iP44 = null;
    boolean b45 = server42.removeException(iP44);
    tp2.IP iP46 = null;
    boolean b47 = server42.connect(iP46);
    tp2.IP iP48 = null;
    boolean b49 = server42.removeException(iP48);
    tp2.IP iP50 = null;
    boolean b51 = server42.connect(iP50);
    tp2.IP iP52 = null;
    boolean b53 = server42.removeException(iP52);
    tp2.IP iP54 = null;
    boolean b55 = server42.removeBan(iP54);
    server42.update();
    tp2.ITime iTime57 = server42.getTime();
    server14.setTime(iTime57);
    tp2.Server server59 = new tp2.Server();
    long long60 = server59.getLastUpdate();
    server59.update();
    tp2.IP iP62 = null;
    boolean b63 = server59.removeBan(iP62);
    long long64 = server59.getLastUpdate();
    server59.update();
    tp2.ITime iTime66 = server59.getTime();
    server14.setTime(iTime66);
    server0.setTime(iTime66);
    tp2.IP iP69 = null;
    boolean b70 = server0.removeException(iP69);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long5 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long16 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "Server [lastUpdate=0, exceptions=(), bans={}]"+ "'", str17.equals("Server [lastUpdate=0, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long25 == 1465509740543L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long26 == 1465509740543L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long27 == 1465509740543L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b47 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b49 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b51 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b53 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b55 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long60 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b63 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long64 == 1465509740546L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime66);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b70 == false);

  }

  @Test
  public void test046() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test046"); }


    tp2.Server server0 = new tp2.Server();
    tp2.ITime iTime1 = server0.getTime();
    tp2.IP iP2 = null;
    boolean b3 = server0.removeException(iP2);
    tp2.IP iP4 = null;
    boolean b5 = server0.connect(iP4);
    tp2.IP iP6 = null;
    boolean b7 = server0.removeException(iP6);
    tp2.IP iP8 = null;
    boolean b9 = server0.connect(iP8);
    tp2.IP iP10 = null;
    boolean b11 = server0.removeException(iP10);
    long long12 = server0.getLastUpdate();
    tp2.IP iP13 = null;
    boolean b14 = server0.removeBan(iP13);
    tp2.IP iP15 = null;
    boolean b16 = server0.addBan(iP15);
    tp2.Server server17 = new tp2.Server();
    tp2.ITime iTime18 = server17.getTime();
    tp2.IP iP19 = null;
    boolean b20 = server17.removeException(iP19);
    tp2.IP iP21 = null;
    boolean b22 = server17.connect(iP21);
    tp2.IP iP23 = null;
    boolean b24 = server17.removeException(iP23);
    tp2.IP iP25 = null;
    boolean b26 = server17.connect(iP25);
    tp2.IP iP27 = null;
    boolean b28 = server17.removeException(iP27);
    tp2.IP iP29 = null;
    boolean b30 = server17.removeBan(iP29);
    tp2.ITime iTime31 = server17.getTime();
    tp2.Server server32 = new tp2.Server();
    long long33 = server32.getLastUpdate();
    tp2.ITime iTime34 = server32.getTime();
    tp2.IP iP35 = null;
    boolean b36 = server32.removeException(iP35);
    tp2.IP iP37 = null;
    boolean b38 = server32.removeBan(iP37);
    tp2.IP iP39 = null;
    boolean b40 = server32.connect(iP39);
    tp2.ITime iTime41 = server32.getTime();
    tp2.IP iP42 = null;
    boolean b43 = server32.addBan(iP42);
    server32.update();
    tp2.ITime iTime45 = server32.getTime();
    server17.setTime(iTime45);
    server0.setTime(iTime45);
    tp2.IP iP48 = null;
    boolean b49 = server0.connect(iP48);
    long long50 = server0.getLastUpdate();
    tp2.IP iP51 = null;
    // The following exception was thrown during execution in test generation
    try {
      boolean b52 = server0.addException(iP51);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long12 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long33 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b43 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b49 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long50 == 0L);

  }

  @Test
  public void test047() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test047"); }


    tp2.Server server0 = new tp2.Server();
    tp2.ITime iTime1 = server0.getTime();
    server0.update();
    tp2.ITime iTime3 = server0.getTime();
    tp2.IP iP4 = null;
    boolean b5 = server0.connect(iP4);
    tp2.ITime iTime6 = server0.getTime();
    server0.update();
    tp2.IP iP8 = null;
    boolean b9 = server0.removeBan(iP8);
    tp2.ITime iTime10 = server0.getTime();
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
    org.junit.Assert.assertNotNull(iTime1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);

  }

  @Test
  public void test048() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test048"); }


    tp2.Server server0 = new tp2.Server();
    long long1 = server0.getLastUpdate();
    tp2.ITime iTime2 = server0.getTime();
    tp2.IP iP3 = null;
    boolean b4 = server0.removeException(iP3);
    tp2.Server server5 = new tp2.Server();
    tp2.ITime iTime6 = server5.getTime();
    tp2.IP iP7 = null;
    boolean b8 = server5.removeException(iP7);
    tp2.IP iP9 = null;
    boolean b10 = server5.connect(iP9);
    tp2.IP iP11 = null;
    boolean b12 = server5.removeException(iP11);
    tp2.IP iP13 = null;
    boolean b14 = server5.connect(iP13);
    tp2.IP iP15 = null;
    boolean b16 = server5.removeException(iP15);
    tp2.Server server17 = new tp2.Server();
    tp2.ITime iTime18 = server17.getTime();
    server17.update();
    tp2.ITime iTime20 = server17.getTime();
    server5.setTime(iTime20);
    server0.setTime(iTime20);
    long long23 = server0.getLastUpdate();
    server0.update();
    long long25 = server0.getLastUpdate();
    tp2.IP iP26 = null;
    boolean b27 = server0.removeBan(iP26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long23 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long25 == 1465509740597L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);

  }

  @Test
  public void test049() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test049"); }


    tp2.Server server0 = new tp2.Server();
    long long1 = server0.getLastUpdate();
    tp2.ITime iTime2 = server0.getTime();
    tp2.IP iP3 = null;
    boolean b4 = server0.removeException(iP3);
    tp2.IP iP5 = null;
    boolean b6 = server0.addBan(iP5);
    server0.update();
    server0.update();
    tp2.IP iP9 = null;
    boolean b10 = server0.removeBan(iP9);
    tp2.IP iP11 = null;
    boolean b12 = server0.removeException(iP11);
    tp2.Server server13 = new tp2.Server();
    tp2.ITime iTime14 = server13.getTime();
    tp2.Server server15 = new tp2.Server();
    tp2.ITime iTime16 = server15.getTime();
    server13.setTime(iTime16);
    java.lang.String str18 = server13.toString();
    tp2.ITime iTime19 = server13.getTime();
    tp2.IP iP20 = null;
    boolean b21 = server13.addBan(iP20);
    tp2.ITime iTime22 = server13.getTime();
    server0.setTime(iTime22);
    tp2.ITime iTime24 = server0.getTime();
    long long25 = server0.getLastUpdate();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "Server [lastUpdate=0, exceptions=(), bans={}]"+ "'", str18.equals("Server [lastUpdate=0, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long25 == 1465509740604L);

  }

  @Test
  public void test050() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test050"); }


    tp2.Server server0 = new tp2.Server();
    tp2.ITime iTime1 = server0.getTime();
    server0.update();
    tp2.ITime iTime3 = server0.getTime();
    tp2.IP iP4 = null;
    boolean b5 = server0.addBan(iP4);
    tp2.IP iP6 = null;
    boolean b7 = server0.removeException(iP6);
    tp2.Server server8 = new tp2.Server();
    tp2.ITime iTime9 = server8.getTime();
    server8.update();
    tp2.Server server11 = new tp2.Server();
    long long12 = server11.getLastUpdate();
    tp2.ITime iTime13 = server11.getTime();
    server8.setTime(iTime13);
    server0.setTime(iTime13);
    tp2.IP iP16 = null;
    boolean b17 = server0.addBan(iP16);
    long long18 = server0.getLastUpdate();
    long long19 = server0.getLastUpdate();
    tp2.Server server20 = new tp2.Server();
    tp2.ITime iTime21 = server20.getTime();
    tp2.Server server22 = new tp2.Server();
    tp2.ITime iTime23 = server22.getTime();
    server20.setTime(iTime23);
    tp2.IP iP25 = null;
    boolean b26 = server20.connect(iP25);
    tp2.ITime iTime27 = server20.getTime();
    server0.setTime(iTime27);
    tp2.ITime iTime29 = server0.getTime();
    server0.update();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long12 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long18 == 1465509740618L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long19 == 1465509740618L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime29);

  }

  @Test
  public void test051() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test051"); }


    tp2.Server server0 = new tp2.Server();
    tp2.ITime iTime1 = server0.getTime();
    tp2.Server server2 = new tp2.Server();
    tp2.ITime iTime3 = server2.getTime();
    server0.setTime(iTime3);
    java.lang.String str5 = server0.toString();
    tp2.ITime iTime6 = server0.getTime();
    tp2.IP iP7 = null;
    boolean b8 = server0.removeException(iP7);
    java.lang.String str9 = server0.toString();
    java.lang.String str10 = server0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Server [lastUpdate=0, exceptions=(), bans={}]"+ "'", str5.equals("Server [lastUpdate=0, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Server [lastUpdate=0, exceptions=(), bans={}]"+ "'", str9.equals("Server [lastUpdate=0, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Server [lastUpdate=0, exceptions=(), bans={}]"+ "'", str10.equals("Server [lastUpdate=0, exceptions=(), bans={}]"));

  }

  @Test
  public void test052() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test052"); }


    tp2.Server server0 = new tp2.Server();
    long long1 = server0.getLastUpdate();
    tp2.ITime iTime2 = server0.getTime();
    tp2.IP iP3 = null;
    boolean b4 = server0.removeException(iP3);
    tp2.IP iP5 = null;
    boolean b6 = server0.removeBan(iP5);
    tp2.IP iP7 = null;
    boolean b8 = server0.removeException(iP7);
    tp2.IP iP9 = null;
    boolean b10 = server0.addBan(iP9);
    server0.update();
    tp2.IP iP12 = null;
    boolean b13 = server0.addBan(iP12);
    tp2.ITime iTime14 = server0.getTime();
    server0.update();
    tp2.IP iP16 = null;
    boolean b17 = server0.removeBan(iP16);
    tp2.IP iP18 = null;
    boolean b19 = server0.removeException(iP18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);

  }

  @Test
  public void test053() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test053"); }


    tp2.Server server0 = new tp2.Server();
    tp2.ITime iTime1 = server0.getTime();
    server0.update();
    tp2.ITime iTime3 = server0.getTime();
    long long4 = server0.getLastUpdate();
    long long5 = server0.getLastUpdate();
    server0.update();
    server0.update();
    tp2.IP iP8 = null;
    boolean b9 = server0.connect(iP8);
    server0.update();
    server0.update();
    tp2.IP iP12 = null;
    boolean b13 = server0.removeException(iP12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long4 == 1465509740635L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long5 == 1465509740635L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);

  }

  @Test
  public void test054() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test054"); }


    tp2.Server server0 = new tp2.Server();
    tp2.ITime iTime1 = server0.getTime();
    tp2.IP iP2 = null;
    boolean b3 = server0.removeException(iP2);
    tp2.IP iP4 = null;
    boolean b5 = server0.connect(iP4);
    tp2.IP iP6 = null;
    boolean b7 = server0.removeException(iP6);
    tp2.IP iP8 = null;
    boolean b9 = server0.connect(iP8);
    tp2.IP iP10 = null;
    boolean b11 = server0.removeException(iP10);
    long long12 = server0.getLastUpdate();
    tp2.IP iP13 = null;
    boolean b14 = server0.removeBan(iP13);
    tp2.IP iP15 = null;
    boolean b16 = server0.addBan(iP15);
    tp2.IP iP17 = null;
    boolean b18 = server0.addBan(iP17);
    tp2.IP iP19 = null;
    boolean b20 = server0.connect(iP19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long12 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);

  }

  @Test
  public void test055() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test055"); }


    tp2.Server server0 = new tp2.Server();
    tp2.ITime iTime1 = server0.getTime();
    server0.update();
    tp2.ITime iTime3 = server0.getTime();
    tp2.Server server4 = new tp2.Server();
    long long5 = server4.getLastUpdate();
    tp2.ITime iTime6 = server4.getTime();
    server0.setTime(iTime6);
    tp2.IP iP8 = null;
    boolean b9 = server0.addBan(iP8);
    long long10 = server0.getLastUpdate();
    tp2.ITime iTime11 = server0.getTime();
    tp2.IP iP12 = null;
    boolean b13 = server0.addBan(iP12);
    java.lang.String str14 = server0.toString();
    tp2.IP iP15 = null;
    boolean b16 = server0.connect(iP15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long5 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long10 == 1465509740640L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "Server [lastUpdate=1465509740640, exceptions=(), bans={}]"+ "'", str14.equals("Server [lastUpdate=1465509740640, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);

  }

  @Test
  public void test056() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test056"); }


    tp2.Server server0 = new tp2.Server();
    tp2.ITime iTime1 = server0.getTime();
    server0.update();
    tp2.ITime iTime3 = server0.getTime();
    long long4 = server0.getLastUpdate();
    long long5 = server0.getLastUpdate();
    tp2.IP iP6 = null;
    boolean b7 = server0.addBan(iP6);
    tp2.Server server8 = new tp2.Server();
    tp2.ITime iTime9 = server8.getTime();
    tp2.IP iP10 = null;
    boolean b11 = server8.connect(iP10);
    tp2.ITime iTime12 = server8.getTime();
    tp2.ITime iTime13 = server8.getTime();
    server0.setTime(iTime13);
    java.lang.String str15 = server0.toString();
    server0.update();
    long long17 = server0.getLastUpdate();
    server0.update();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long4 == 1465509740647L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long5 == 1465509740647L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "Server [lastUpdate=1465509740647, exceptions=(), bans={}]"+ "'", str15.equals("Server [lastUpdate=1465509740647, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long17 == 1465509740648L);

  }

  @Test
  public void test057() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test057"); }


    tp2.Server server0 = new tp2.Server();
    tp2.ITime iTime1 = server0.getTime();
    tp2.Server server2 = new tp2.Server();
    tp2.ITime iTime3 = server2.getTime();
    server0.setTime(iTime3);
    tp2.ITime iTime5 = server0.getTime();
    tp2.IP iP6 = null;
    boolean b7 = server0.addBan(iP6);
    tp2.IP iP8 = null;
    boolean b9 = server0.addBan(iP8);
    tp2.Server server10 = new tp2.Server();
    tp2.ITime iTime11 = server10.getTime();
    tp2.IP iP12 = null;
    boolean b13 = server10.removeException(iP12);
    tp2.ITime iTime14 = server10.getTime();
    tp2.ITime iTime15 = server10.getTime();
    server0.setTime(iTime15);
    tp2.IP iP17 = null;
    boolean b18 = server0.connect(iP17);
    tp2.IP iP19 = null;
    boolean b20 = server0.connect(iP19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);

  }

  @Test
  public void test058() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test058"); }


    tp2.Server server0 = new tp2.Server();
    long long1 = server0.getLastUpdate();
    tp2.ITime iTime2 = server0.getTime();
    tp2.ITime iTime3 = server0.getTime();
    tp2.IP iP4 = null;
    boolean b5 = server0.removeException(iP4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);

  }

  @Test
  public void test059() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test059"); }


    tp2.Server server0 = new tp2.Server();
    tp2.ITime iTime1 = server0.getTime();
    tp2.IP iP2 = null;
    boolean b3 = server0.connect(iP2);
    tp2.ITime iTime4 = server0.getTime();
    tp2.Server server5 = new tp2.Server();
    tp2.ITime iTime6 = server5.getTime();
    tp2.IP iP7 = null;
    boolean b8 = server5.connect(iP7);
    tp2.IP iP9 = null;
    boolean b10 = server5.removeBan(iP9);
    java.lang.String str11 = server5.toString();
    tp2.IP iP12 = null;
    boolean b13 = server5.removeException(iP12);
    long long14 = server5.getLastUpdate();
    tp2.Server server15 = new tp2.Server();
    tp2.ITime iTime16 = server15.getTime();
    tp2.Server server17 = new tp2.Server();
    tp2.ITime iTime18 = server17.getTime();
    server15.setTime(iTime18);
    server15.update();
    java.lang.String str21 = server15.toString();
    tp2.Server server22 = new tp2.Server();
    long long23 = server22.getLastUpdate();
    tp2.ITime iTime24 = server22.getTime();
    tp2.IP iP25 = null;
    boolean b26 = server22.removeException(iP25);
    tp2.Server server27 = new tp2.Server();
    tp2.ITime iTime28 = server27.getTime();
    tp2.IP iP29 = null;
    boolean b30 = server27.removeException(iP29);
    tp2.IP iP31 = null;
    boolean b32 = server27.connect(iP31);
    tp2.IP iP33 = null;
    boolean b34 = server27.removeException(iP33);
    tp2.IP iP35 = null;
    boolean b36 = server27.connect(iP35);
    tp2.IP iP37 = null;
    boolean b38 = server27.removeException(iP37);
    tp2.Server server39 = new tp2.Server();
    tp2.ITime iTime40 = server39.getTime();
    server39.update();
    tp2.ITime iTime42 = server39.getTime();
    server27.setTime(iTime42);
    server22.setTime(iTime42);
    server15.setTime(iTime42);
    server5.setTime(iTime42);
    server0.setTime(iTime42);
    tp2.IP iP48 = null;
    boolean b49 = server0.removeException(iP48);
    tp2.ITime iTime50 = null;
    server0.setTime(iTime50);
    tp2.ITime iTime52 = server0.getTime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Server [lastUpdate=0, exceptions=(), bans={}]"+ "'", str11.equals("Server [lastUpdate=0, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long14 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "Server [lastUpdate=1465509740669, exceptions=(), bans={}]"+ "'", str21.equals("Server [lastUpdate=1465509740669, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long23 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b49 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iTime52);

  }

  @Test
  public void test060() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test060"); }


    tp2.Server server0 = new tp2.Server();
    tp2.ITime iTime1 = server0.getTime();
    tp2.Server server2 = new tp2.Server();
    tp2.ITime iTime3 = server2.getTime();
    server0.setTime(iTime3);
    server0.update();
    java.lang.String str6 = server0.toString();
    java.lang.String str7 = server0.toString();
    tp2.IP iP8 = null;
    boolean b9 = server0.removeException(iP8);
    tp2.ITime iTime10 = server0.getTime();
    tp2.IP iP11 = null;
    boolean b12 = server0.addBan(iP11);
    tp2.IP iP13 = null;
    boolean b14 = server0.connect(iP13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Server [lastUpdate=1465509740691, exceptions=(), bans={}]"+ "'", str6.equals("Server [lastUpdate=1465509740691, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Server [lastUpdate=1465509740691, exceptions=(), bans={}]"+ "'", str7.equals("Server [lastUpdate=1465509740691, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);

  }

  @Test
  public void test061() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test061"); }


    tp2.Server server0 = new tp2.Server();
    tp2.ITime iTime1 = server0.getTime();
    tp2.IP iP2 = null;
    boolean b3 = server0.removeException(iP2);
    tp2.IP iP4 = null;
    boolean b5 = server0.connect(iP4);
    tp2.IP iP6 = null;
    boolean b7 = server0.removeException(iP6);
    tp2.IP iP8 = null;
    boolean b9 = server0.connect(iP8);
    tp2.IP iP10 = null;
    boolean b11 = server0.removeBan(iP10);
    tp2.Server server12 = new tp2.Server();
    long long13 = server12.getLastUpdate();
    tp2.ITime iTime14 = server12.getTime();
    tp2.IP iP15 = null;
    boolean b16 = server12.removeException(iP15);
    tp2.IP iP17 = null;
    boolean b18 = server12.addBan(iP17);
    server12.update();
    server12.update();
    tp2.IP iP21 = null;
    boolean b22 = server12.removeBan(iP21);
    java.lang.String str23 = server12.toString();
    tp2.IP iP24 = null;
    boolean b25 = server12.connect(iP24);
    tp2.Server server26 = new tp2.Server();
    tp2.ITime iTime27 = server26.getTime();
    server26.update();
    tp2.ITime iTime29 = server26.getTime();
    long long30 = server26.getLastUpdate();
    long long31 = server26.getLastUpdate();
    server26.update();
    tp2.ITime iTime33 = server26.getTime();
    server12.setTime(iTime33);
    server0.setTime(iTime33);
    tp2.ITime iTime36 = server0.getTime();
    java.lang.String str37 = server0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long13 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + "Server [lastUpdate=1465509740697, exceptions=(), bans={}]"+ "'", str23.equals("Server [lastUpdate=1465509740697, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long30 == 1465509740698L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long31 == 1465509740698L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str37 + "' != '" + "Server [lastUpdate=0, exceptions=(), bans={}]"+ "'", str37.equals("Server [lastUpdate=0, exceptions=(), bans={}]"));

  }

  @Test
  public void test062() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test062"); }


    tp2.Server server0 = new tp2.Server();
    tp2.ITime iTime1 = server0.getTime();
    server0.update();
    tp2.ITime iTime3 = server0.getTime();
    tp2.IP iP4 = null;
    boolean b5 = server0.addBan(iP4);
    tp2.IP iP6 = null;
    boolean b7 = server0.removeException(iP6);
    tp2.Server server8 = new tp2.Server();
    tp2.ITime iTime9 = server8.getTime();
    server8.update();
    tp2.Server server11 = new tp2.Server();
    long long12 = server11.getLastUpdate();
    tp2.ITime iTime13 = server11.getTime();
    server8.setTime(iTime13);
    server0.setTime(iTime13);
    java.lang.String str16 = server0.toString();
    tp2.ITime iTime17 = server0.getTime();
    tp2.IP iP18 = null;
    boolean b19 = server0.removeException(iP18);
    tp2.Server server20 = new tp2.Server();
    tp2.ITime iTime21 = server20.getTime();
    tp2.Server server22 = new tp2.Server();
    tp2.ITime iTime23 = server22.getTime();
    server20.setTime(iTime23);
    server20.update();
    java.lang.String str26 = server20.toString();
    java.lang.String str27 = server20.toString();
    tp2.ITime iTime28 = server20.getTime();
    server0.setTime(iTime28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long12 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "Server [lastUpdate=1465509740705, exceptions=(), bans={}]"+ "'", str16.equals("Server [lastUpdate=1465509740705, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str26 + "' != '" + "Server [lastUpdate=1465509740707, exceptions=(), bans={}]"+ "'", str26.equals("Server [lastUpdate=1465509740707, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str27 + "' != '" + "Server [lastUpdate=1465509740707, exceptions=(), bans={}]"+ "'", str27.equals("Server [lastUpdate=1465509740707, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime28);

  }

  @Test
  public void test063() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test063"); }


    tp2.Server server0 = new tp2.Server();
    tp2.ITime iTime1 = server0.getTime();
    tp2.Server server2 = new tp2.Server();
    tp2.ITime iTime3 = server2.getTime();
    server0.setTime(iTime3);
    server0.update();
    server0.update();
    tp2.ITime iTime7 = server0.getTime();
    java.lang.String str8 = server0.toString();
    long long9 = server0.getLastUpdate();
    tp2.IP iP10 = null;
    boolean b11 = server0.connect(iP10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Server [lastUpdate=1465509740723, exceptions=(), bans={}]"+ "'", str8.equals("Server [lastUpdate=1465509740723, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long9 == 1465509740723L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);

  }

  @Test
  public void test064() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test064"); }


    tp2.Server server0 = new tp2.Server();
    tp2.ITime iTime1 = server0.getTime();
    server0.update();
    tp2.ITime iTime3 = server0.getTime();
    tp2.IP iP4 = null;
    boolean b5 = server0.addBan(iP4);
    tp2.IP iP6 = null;
    boolean b7 = server0.removeException(iP6);
    tp2.ITime iTime8 = server0.getTime();
    tp2.IP iP9 = null;
    boolean b10 = server0.connect(iP9);
    tp2.IP iP11 = null;
    boolean b12 = server0.removeException(iP11);
    long long13 = server0.getLastUpdate();
    tp2.IP iP14 = null;
    boolean b15 = server0.connect(iP14);
    tp2.IP iP16 = null;
    boolean b17 = server0.addBan(iP16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long13 == 1465509740727L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);

  }

  @Test
  public void test065() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test065"); }


    tp2.Server server0 = new tp2.Server();
    tp2.ITime iTime1 = server0.getTime();
    tp2.Server server2 = new tp2.Server();
    tp2.ITime iTime3 = server2.getTime();
    server0.setTime(iTime3);
    java.lang.String str5 = server0.toString();
    long long6 = server0.getLastUpdate();
    tp2.IP iP7 = null;
    boolean b8 = server0.removeBan(iP7);
    tp2.Server server9 = new tp2.Server();
    tp2.ITime iTime10 = server9.getTime();
    tp2.ITime iTime11 = server9.getTime();
    tp2.IP iP12 = null;
    boolean b13 = server9.connect(iP12);
    tp2.ITime iTime14 = server9.getTime();
    server0.setTime(iTime14);
    tp2.IP iP16 = null;
    boolean b17 = server0.removeException(iP16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Server [lastUpdate=0, exceptions=(), bans={}]"+ "'", str5.equals("Server [lastUpdate=0, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long6 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);

  }

  @Test
  public void test066() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test066"); }


    tp2.Server server0 = new tp2.Server();
    tp2.ITime iTime1 = server0.getTime();
    tp2.IP iP2 = null;
    boolean b3 = server0.removeException(iP2);
    java.lang.String str4 = server0.toString();
    java.lang.String str5 = server0.toString();
    long long6 = server0.getLastUpdate();
    tp2.IP iP7 = null;
    boolean b8 = server0.connect(iP7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Server [lastUpdate=0, exceptions=(), bans={}]"+ "'", str4.equals("Server [lastUpdate=0, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Server [lastUpdate=0, exceptions=(), bans={}]"+ "'", str5.equals("Server [lastUpdate=0, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long6 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);

  }

  @Test
  public void test067() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test067"); }


    tp2.Server server0 = new tp2.Server();
    tp2.ITime iTime1 = server0.getTime();
    server0.update();
    tp2.ITime iTime3 = server0.getTime();
    tp2.IP iP4 = null;
    boolean b5 = server0.connect(iP4);
    tp2.ITime iTime6 = server0.getTime();
    server0.update();
    tp2.ITime iTime8 = server0.getTime();
    tp2.IP iP9 = null;
    boolean b10 = server0.connect(iP9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);

  }

  @Test
  public void test068() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test068"); }


    tp2.Server server0 = new tp2.Server();
    long long1 = server0.getLastUpdate();
    server0.update();
    tp2.IP iP3 = null;
    boolean b4 = server0.removeBan(iP3);
    long long5 = server0.getLastUpdate();
    tp2.Server server6 = new tp2.Server();
    tp2.ITime iTime7 = server6.getTime();
    tp2.IP iP8 = null;
    boolean b9 = server6.removeException(iP8);
    tp2.ITime iTime10 = server6.getTime();
    tp2.ITime iTime11 = server6.getTime();
    server0.setTime(iTime11);
    tp2.ITime iTime13 = server0.getTime();
    long long14 = server0.getLastUpdate();
    tp2.IP iP15 = null;
    boolean b16 = server0.connect(iP15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long5 == 1465509740747L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long14 == 1465509740747L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);

  }

  @Test
  public void test069() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test069"); }


    tp2.Server server0 = new tp2.Server();
    long long1 = server0.getLastUpdate();
    server0.update();
    tp2.IP iP3 = null;
    boolean b4 = server0.removeBan(iP3);
    tp2.ITime iTime5 = server0.getTime();
    tp2.IP iP6 = null;
    boolean b7 = server0.connect(iP6);
    long long8 = server0.getLastUpdate();
    tp2.IP iP9 = null;
    boolean b10 = server0.addBan(iP9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long8 == 1465509740754L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);

  }

  @Test
  public void test070() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test070"); }


    tp2.Server server0 = new tp2.Server();
    long long1 = server0.getLastUpdate();
    server0.update();
    tp2.IP iP3 = null;
    boolean b4 = server0.removeException(iP3);
    server0.update();
    java.lang.String str6 = server0.toString();
    tp2.IP iP7 = null;
    boolean b8 = server0.addBan(iP7);
    tp2.IP iP9 = null;
    boolean b10 = server0.removeBan(iP9);
    tp2.Server server11 = new tp2.Server();
    tp2.ITime iTime12 = server11.getTime();
    long long13 = server11.getLastUpdate();
    long long14 = server11.getLastUpdate();
    server11.update();
    tp2.IP iP16 = null;
    boolean b17 = server11.connect(iP16);
    long long18 = server11.getLastUpdate();
    tp2.Server server19 = new tp2.Server();
    tp2.ITime iTime20 = server19.getTime();
    tp2.IP iP21 = null;
    boolean b22 = server19.removeException(iP21);
    tp2.IP iP23 = null;
    boolean b24 = server19.connect(iP23);
    tp2.IP iP25 = null;
    boolean b26 = server19.removeException(iP25);
    tp2.IP iP27 = null;
    boolean b28 = server19.connect(iP27);
    tp2.IP iP29 = null;
    boolean b30 = server19.removeException(iP29);
    tp2.IP iP31 = null;
    boolean b32 = server19.removeBan(iP31);
    server19.update();
    tp2.IP iP34 = null;
    boolean b35 = server19.addBan(iP34);
    long long36 = server19.getLastUpdate();
    tp2.IP iP37 = null;
    boolean b38 = server19.connect(iP37);
    tp2.IP iP39 = null;
    boolean b40 = server19.connect(iP39);
    tp2.ITime iTime41 = server19.getTime();
    server11.setTime(iTime41);
    server0.setTime(iTime41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Server [lastUpdate=1465509740755, exceptions=(), bans={}]"+ "'", str6.equals("Server [lastUpdate=1465509740755, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long13 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long14 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long18 == 1465509740756L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long36 == 1465509740756L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime41);

  }

  @Test
  public void test071() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test071"); }


    tp2.Server server0 = new tp2.Server();
    tp2.ITime iTime1 = server0.getTime();
    tp2.Server server2 = new tp2.Server();
    tp2.ITime iTime3 = server2.getTime();
    server0.setTime(iTime3);
    java.lang.String str5 = server0.toString();
    long long6 = server0.getLastUpdate();
    tp2.IP iP7 = null;
    boolean b8 = server0.removeBan(iP7);
    tp2.IP iP9 = null;
    boolean b10 = server0.removeException(iP9);
    tp2.IP iP11 = null;
    boolean b12 = server0.addBan(iP11);
    server0.update();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Server [lastUpdate=0, exceptions=(), bans={}]"+ "'", str5.equals("Server [lastUpdate=0, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long6 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);

  }

  @Test
  public void test072() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test072"); }


    tp2.Server server0 = new tp2.Server();
    tp2.ITime iTime1 = server0.getTime();
    server0.update();
    tp2.ITime iTime3 = server0.getTime();
    tp2.IP iP4 = null;
    boolean b5 = server0.addBan(iP4);
    tp2.IP iP6 = null;
    boolean b7 = server0.removeException(iP6);
    tp2.IP iP8 = null;
    boolean b9 = server0.addBan(iP8);
    java.lang.String str10 = server0.toString();
    tp2.Server server11 = new tp2.Server();
    tp2.ITime iTime12 = server11.getTime();
    server11.update();
    tp2.ITime iTime14 = server11.getTime();
    tp2.Server server15 = new tp2.Server();
    long long16 = server15.getLastUpdate();
    tp2.ITime iTime17 = server15.getTime();
    server11.setTime(iTime17);
    server0.setTime(iTime17);
    tp2.ITime iTime20 = server0.getTime();
    tp2.IP iP21 = null;
    boolean b22 = server0.connect(iP21);
    tp2.Server server23 = new tp2.Server();
    tp2.ITime iTime24 = server23.getTime();
    long long25 = server23.getLastUpdate();
    tp2.ITime iTime26 = server23.getTime();
    server0.setTime(iTime26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Server [lastUpdate=1465509740764, exceptions=(), bans={}]"+ "'", str10.equals("Server [lastUpdate=1465509740764, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long16 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long25 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime26);

  }

  @Test
  public void test073() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test073"); }


    tp2.Server server0 = new tp2.Server();
    tp2.ITime iTime1 = server0.getTime();
    tp2.Server server2 = new tp2.Server();
    tp2.ITime iTime3 = server2.getTime();
    server0.setTime(iTime3);
    server0.update();
    server0.update();
    tp2.ITime iTime7 = server0.getTime();
    tp2.Server server8 = new tp2.Server();
    tp2.ITime iTime9 = server8.getTime();
    tp2.IP iP10 = null;
    boolean b11 = server8.removeException(iP10);
    tp2.IP iP12 = null;
    boolean b13 = server8.connect(iP12);
    tp2.IP iP14 = null;
    boolean b15 = server8.removeException(iP14);
    tp2.IP iP16 = null;
    boolean b17 = server8.connect(iP16);
    tp2.IP iP18 = null;
    boolean b19 = server8.removeException(iP18);
    tp2.Server server20 = new tp2.Server();
    tp2.ITime iTime21 = server20.getTime();
    server20.update();
    tp2.ITime iTime23 = server20.getTime();
    server8.setTime(iTime23);
    tp2.Server server25 = new tp2.Server();
    tp2.ITime iTime26 = server25.getTime();
    server25.update();
    tp2.ITime iTime28 = server25.getTime();
    server8.setTime(iTime28);
    server0.setTime(iTime28);
    tp2.IP iP31 = null;
    boolean b32 = server0.addBan(iP31);
    tp2.ITime iTime33 = server0.getTime();
    tp2.IP iP34 = null;
    boolean b35 = server0.removeException(iP34);
    server0.update();
    tp2.IP iP37 = null;
    boolean b38 = server0.addBan(iP37);
    tp2.IP iP39 = null;
    boolean b40 = server0.removeBan(iP39);
    server0.update();
    tp2.Server server42 = new tp2.Server();
    tp2.ITime iTime43 = server42.getTime();
    long long44 = server42.getLastUpdate();
    long long45 = server42.getLastUpdate();
    java.lang.String str46 = server42.toString();
    server42.update();
    tp2.IP iP48 = null;
    boolean b49 = server42.addBan(iP48);
    tp2.IP iP50 = null;
    boolean b51 = server42.removeBan(iP50);
    tp2.ITime iTime52 = server42.getTime();
    server0.setTime(iTime52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long44 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long45 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str46 + "' != '" + "Server [lastUpdate=0, exceptions=(), bans={}]"+ "'", str46.equals("Server [lastUpdate=0, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b49 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b51 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime52);

  }

  @Test
  public void test074() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test074"); }


    tp2.Server server0 = new tp2.Server();
    long long1 = server0.getLastUpdate();
    tp2.ITime iTime2 = server0.getTime();
    tp2.IP iP3 = null;
    boolean b4 = server0.removeException(iP3);
    tp2.Server server5 = new tp2.Server();
    tp2.ITime iTime6 = server5.getTime();
    tp2.IP iP7 = null;
    boolean b8 = server5.removeException(iP7);
    tp2.IP iP9 = null;
    boolean b10 = server5.connect(iP9);
    tp2.IP iP11 = null;
    boolean b12 = server5.removeException(iP11);
    tp2.IP iP13 = null;
    boolean b14 = server5.connect(iP13);
    tp2.IP iP15 = null;
    boolean b16 = server5.removeException(iP15);
    tp2.Server server17 = new tp2.Server();
    tp2.ITime iTime18 = server17.getTime();
    server17.update();
    tp2.ITime iTime20 = server17.getTime();
    server5.setTime(iTime20);
    server0.setTime(iTime20);
    long long23 = server0.getLastUpdate();
    server0.update();
    long long25 = server0.getLastUpdate();
    tp2.IP iP26 = null;
    boolean b27 = server0.removeException(iP26);
    long long28 = server0.getLastUpdate();
    tp2.IP iP29 = null;
    boolean b30 = server0.connect(iP29);
    server0.update();
    tp2.ITime iTime32 = server0.getTime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long23 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long25 == 1465509740803L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long28 == 1465509740803L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime32);

  }

  @Test
  public void test075() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test075"); }


    tp2.Server server0 = new tp2.Server();
    tp2.ITime iTime1 = server0.getTime();
    server0.update();
    tp2.ITime iTime3 = server0.getTime();
    tp2.IP iP4 = null;
    boolean b5 = server0.removeBan(iP4);
    tp2.IP iP6 = null;
    boolean b7 = server0.connect(iP6);
    tp2.IP iP8 = null;
    boolean b9 = server0.connect(iP8);
    tp2.IP iP10 = null;
    boolean b11 = server0.removeBan(iP10);
    long long12 = server0.getLastUpdate();
    server0.update();
    tp2.IP iP14 = null;
    boolean b15 = server0.removeException(iP14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long12 == 1465509740809L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);

  }

  @Test
  public void test076() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test076"); }


    tp2.Server server0 = new tp2.Server();
    tp2.ITime iTime1 = server0.getTime();
    server0.update();
    tp2.Server server3 = new tp2.Server();
    long long4 = server3.getLastUpdate();
    tp2.ITime iTime5 = server3.getTime();
    server0.setTime(iTime5);
    long long7 = server0.getLastUpdate();
    tp2.Server server8 = new tp2.Server();
    tp2.ITime iTime9 = server8.getTime();
    tp2.Server server10 = new tp2.Server();
    tp2.ITime iTime11 = server10.getTime();
    server8.setTime(iTime11);
    tp2.ITime iTime13 = server8.getTime();
    tp2.IP iP14 = null;
    boolean b15 = server8.addBan(iP14);
    tp2.Server server16 = new tp2.Server();
    tp2.ITime iTime17 = server16.getTime();
    tp2.ITime iTime18 = server16.getTime();
    server8.setTime(iTime18);
    server0.setTime(iTime18);
    tp2.IP iP21 = null;
    boolean b22 = server0.connect(iP21);
    tp2.Server server23 = new tp2.Server();
    tp2.ITime iTime24 = server23.getTime();
    long long25 = server23.getLastUpdate();
    tp2.IP iP26 = null;
    boolean b27 = server23.removeBan(iP26);
    tp2.Server server28 = new tp2.Server();
    tp2.ITime iTime29 = server28.getTime();
    tp2.Server server30 = new tp2.Server();
    tp2.ITime iTime31 = server30.getTime();
    server28.setTime(iTime31);
    server23.setTime(iTime31);
    tp2.IP iP34 = null;
    boolean b35 = server23.connect(iP34);
    java.lang.String str36 = server23.toString();
    tp2.Server server37 = new tp2.Server();
    tp2.ITime iTime38 = server37.getTime();
    tp2.IP iP39 = null;
    boolean b40 = server37.removeException(iP39);
    java.lang.String str41 = server37.toString();
    java.lang.String str42 = server37.toString();
    tp2.Server server43 = new tp2.Server();
    long long44 = server43.getLastUpdate();
    server43.update();
    tp2.IP iP46 = null;
    boolean b47 = server43.removeBan(iP46);
    long long48 = server43.getLastUpdate();
    tp2.Server server49 = new tp2.Server();
    tp2.ITime iTime50 = server49.getTime();
    tp2.IP iP51 = null;
    boolean b52 = server49.removeException(iP51);
    tp2.ITime iTime53 = server49.getTime();
    tp2.ITime iTime54 = server49.getTime();
    server43.setTime(iTime54);
    server37.setTime(iTime54);
    long long57 = server37.getLastUpdate();
    tp2.Server server58 = new tp2.Server();
    tp2.ITime iTime59 = server58.getTime();
    server58.update();
    tp2.ITime iTime61 = server58.getTime();
    tp2.IP iP62 = null;
    boolean b63 = server58.addBan(iP62);
    tp2.IP iP64 = null;
    boolean b65 = server58.removeException(iP64);
    tp2.IP iP66 = null;
    boolean b67 = server58.addBan(iP66);
    java.lang.String str68 = server58.toString();
    tp2.Server server69 = new tp2.Server();
    tp2.ITime iTime70 = server69.getTime();
    server69.update();
    tp2.ITime iTime72 = server69.getTime();
    tp2.Server server73 = new tp2.Server();
    long long74 = server73.getLastUpdate();
    tp2.ITime iTime75 = server73.getTime();
    server69.setTime(iTime75);
    server58.setTime(iTime75);
    server37.setTime(iTime75);
    tp2.ITime iTime79 = server37.getTime();
    server23.setTime(iTime79);
    server0.setTime(iTime79);
    tp2.IP iP82 = null;
    boolean b83 = server0.connect(iP82);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long4 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long7 == 1465509740811L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long25 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str36 + "' != '" + "Server [lastUpdate=0, exceptions=(), bans={}]"+ "'", str36.equals("Server [lastUpdate=0, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str41 + "' != '" + "Server [lastUpdate=0, exceptions=(), bans={}]"+ "'", str41.equals("Server [lastUpdate=0, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str42 + "' != '" + "Server [lastUpdate=0, exceptions=(), bans={}]"+ "'", str42.equals("Server [lastUpdate=0, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long44 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b47 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long48 == 1465509740815L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b52 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long57 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime59);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime61);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b63 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b65 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b67 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str68 + "' != '" + "Server [lastUpdate=1465509740816, exceptions=(), bans={}]"+ "'", str68.equals("Server [lastUpdate=1465509740816, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime70);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime72);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long74 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime75);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime79);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b83 == true);

  }

  @Test
  public void test077() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test077"); }


    tp2.Server server0 = new tp2.Server();
    tp2.ITime iTime1 = server0.getTime();
    server0.update();
    tp2.ITime iTime3 = server0.getTime();
    tp2.IP iP4 = null;
    boolean b5 = server0.removeBan(iP4);
    tp2.Server server6 = new tp2.Server();
    tp2.ITime iTime7 = server6.getTime();
    tp2.IP iP8 = null;
    boolean b9 = server6.removeException(iP8);
    tp2.IP iP10 = null;
    boolean b11 = server6.connect(iP10);
    tp2.IP iP12 = null;
    boolean b13 = server6.removeException(iP12);
    tp2.IP iP14 = null;
    boolean b15 = server6.connect(iP14);
    tp2.IP iP16 = null;
    boolean b17 = server6.removeException(iP16);
    long long18 = server6.getLastUpdate();
    java.lang.String str19 = server6.toString();
    tp2.Server server20 = new tp2.Server();
    tp2.ITime iTime21 = server20.getTime();
    tp2.Server server22 = new tp2.Server();
    tp2.ITime iTime23 = server22.getTime();
    server20.setTime(iTime23);
    server20.update();
    server20.update();
    tp2.ITime iTime27 = server20.getTime();
    server6.setTime(iTime27);
    server0.setTime(iTime27);
    tp2.Server server30 = new tp2.Server();
    tp2.ITime iTime31 = server30.getTime();
    server30.update();
    tp2.ITime iTime33 = server30.getTime();
    java.lang.String str34 = server30.toString();
    tp2.ITime iTime35 = server30.getTime();
    server0.setTime(iTime35);
    tp2.ITime iTime37 = server0.getTime();
    tp2.IP iP38 = null;
    boolean b39 = server0.addBan(iP38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long18 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "Server [lastUpdate=0, exceptions=(), bans={}]"+ "'", str19.equals("Server [lastUpdate=0, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str34 + "' != '" + "Server [lastUpdate=1465509740899, exceptions=(), bans={}]"+ "'", str34.equals("Server [lastUpdate=1465509740899, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == false);

  }

  @Test
  public void test078() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test078"); }


    tp2.Server server0 = new tp2.Server();
    tp2.ITime iTime1 = server0.getTime();
    server0.update();
    tp2.ITime iTime3 = server0.getTime();
    tp2.IP iP4 = null;
    boolean b5 = server0.addBan(iP4);
    tp2.IP iP6 = null;
    boolean b7 = server0.removeException(iP6);
    tp2.Server server8 = new tp2.Server();
    tp2.ITime iTime9 = server8.getTime();
    server8.update();
    tp2.Server server11 = new tp2.Server();
    long long12 = server11.getLastUpdate();
    tp2.ITime iTime13 = server11.getTime();
    server8.setTime(iTime13);
    server0.setTime(iTime13);
    tp2.IP iP16 = null;
    boolean b17 = server0.addBan(iP16);
    long long18 = server0.getLastUpdate();
    long long19 = server0.getLastUpdate();
    tp2.Server server20 = new tp2.Server();
    tp2.ITime iTime21 = server20.getTime();
    tp2.Server server22 = new tp2.Server();
    tp2.ITime iTime23 = server22.getTime();
    server20.setTime(iTime23);
    tp2.IP iP25 = null;
    boolean b26 = server20.connect(iP25);
    tp2.ITime iTime27 = server20.getTime();
    server0.setTime(iTime27);
    tp2.IP iP29 = null;
    boolean b30 = server0.addBan(iP29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long12 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long18 == 1465509740911L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long19 == 1465509740911L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);

  }

  @Test
  public void test079() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test079"); }


    tp2.Server server0 = new tp2.Server();
    tp2.ITime iTime1 = server0.getTime();
    long long2 = server0.getLastUpdate();
    tp2.IP iP3 = null;
    boolean b4 = server0.removeBan(iP3);
    tp2.IP iP5 = null;
    boolean b6 = server0.removeBan(iP5);
    tp2.IP iP7 = null;
    boolean b8 = server0.removeException(iP7);
    tp2.IP iP9 = null;
    boolean b10 = server0.addBan(iP9);
    tp2.IP iP11 = null;
    boolean b12 = server0.connect(iP11);
    tp2.Server server13 = new tp2.Server();
    tp2.ITime iTime14 = server13.getTime();
    tp2.IP iP15 = null;
    boolean b16 = server13.addBan(iP15);
    tp2.IP iP17 = null;
    boolean b18 = server13.connect(iP17);
    tp2.IP iP19 = null;
    boolean b20 = server13.connect(iP19);
    tp2.Server server21 = new tp2.Server();
    tp2.ITime iTime22 = server21.getTime();
    server21.update();
    tp2.ITime iTime24 = server21.getTime();
    java.lang.String str25 = server21.toString();
    tp2.IP iP26 = null;
    boolean b27 = server21.removeException(iP26);
    tp2.IP iP28 = null;
    boolean b29 = server21.removeException(iP28);
    java.lang.String str30 = server21.toString();
    tp2.ITime iTime31 = server21.getTime();
    tp2.ITime iTime32 = server21.getTime();
    server13.setTime(iTime32);
    server0.setTime(iTime32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long2 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + "Server [lastUpdate=1465509740922, exceptions=(), bans={}]"+ "'", str25.equals("Server [lastUpdate=1465509740922, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str30 + "' != '" + "Server [lastUpdate=1465509740922, exceptions=(), bans={}]"+ "'", str30.equals("Server [lastUpdate=1465509740922, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime32);

  }

  @Test
  public void test080() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test080"); }


    tp2.Server server0 = new tp2.Server();
    tp2.ITime iTime1 = server0.getTime();
    server0.update();
    tp2.ITime iTime3 = server0.getTime();
    tp2.IP iP4 = null;
    boolean b5 = server0.connect(iP4);
    tp2.ITime iTime6 = server0.getTime();
    java.lang.String str7 = server0.toString();
    tp2.IP iP8 = null;
    boolean b9 = server0.removeBan(iP8);
    java.lang.String str10 = server0.toString();
    tp2.IP iP11 = null;
    boolean b12 = server0.connect(iP11);
    tp2.ITime iTime13 = server0.getTime();
    tp2.IP iP14 = null;
    boolean b15 = server0.removeException(iP14);
    tp2.IP iP16 = null;
    boolean b17 = server0.removeBan(iP16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Server [lastUpdate=1465509740928, exceptions=(), bans={}]"+ "'", str7.equals("Server [lastUpdate=1465509740928, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Server [lastUpdate=1465509740928, exceptions=(), bans={}]"+ "'", str10.equals("Server [lastUpdate=1465509740928, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);

  }

  @Test
  public void test081() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test081"); }


    tp2.Server server0 = new tp2.Server();
    tp2.ITime iTime1 = server0.getTime();
    tp2.IP iP2 = null;
    boolean b3 = server0.removeException(iP2);
    tp2.IP iP4 = null;
    boolean b5 = server0.removeException(iP4);
    tp2.IP iP6 = null;
    boolean b7 = server0.addBan(iP6);
    tp2.IP iP8 = null;
    boolean b9 = server0.removeBan(iP8);
    tp2.Server server10 = new tp2.Server();
    tp2.ITime iTime11 = server10.getTime();
    tp2.IP iP12 = null;
    boolean b13 = server10.connect(iP12);
    tp2.IP iP14 = null;
    boolean b15 = server10.removeBan(iP14);
    java.lang.String str16 = server10.toString();
    tp2.IP iP17 = null;
    boolean b18 = server10.removeException(iP17);
    long long19 = server10.getLastUpdate();
    tp2.Server server20 = new tp2.Server();
    tp2.ITime iTime21 = server20.getTime();
    tp2.Server server22 = new tp2.Server();
    tp2.ITime iTime23 = server22.getTime();
    server20.setTime(iTime23);
    server20.update();
    java.lang.String str26 = server20.toString();
    tp2.Server server27 = new tp2.Server();
    long long28 = server27.getLastUpdate();
    tp2.ITime iTime29 = server27.getTime();
    tp2.IP iP30 = null;
    boolean b31 = server27.removeException(iP30);
    tp2.Server server32 = new tp2.Server();
    tp2.ITime iTime33 = server32.getTime();
    tp2.IP iP34 = null;
    boolean b35 = server32.removeException(iP34);
    tp2.IP iP36 = null;
    boolean b37 = server32.connect(iP36);
    tp2.IP iP38 = null;
    boolean b39 = server32.removeException(iP38);
    tp2.IP iP40 = null;
    boolean b41 = server32.connect(iP40);
    tp2.IP iP42 = null;
    boolean b43 = server32.removeException(iP42);
    tp2.Server server44 = new tp2.Server();
    tp2.ITime iTime45 = server44.getTime();
    server44.update();
    tp2.ITime iTime47 = server44.getTime();
    server32.setTime(iTime47);
    server27.setTime(iTime47);
    server20.setTime(iTime47);
    server10.setTime(iTime47);
    server10.update();
    tp2.Server server53 = new tp2.Server();
    tp2.ITime iTime54 = server53.getTime();
    tp2.Server server55 = new tp2.Server();
    tp2.ITime iTime56 = server55.getTime();
    server53.setTime(iTime56);
    java.lang.String str58 = server53.toString();
    long long59 = server53.getLastUpdate();
    tp2.IP iP60 = null;
    boolean b61 = server53.removeBan(iP60);
    tp2.IP iP62 = null;
    boolean b63 = server53.removeException(iP62);
    tp2.IP iP64 = null;
    boolean b65 = server53.connect(iP64);
    tp2.IP iP66 = null;
    boolean b67 = server53.connect(iP66);
    java.lang.String str68 = server53.toString();
    tp2.Server server69 = new tp2.Server();
    tp2.ITime iTime70 = server69.getTime();
    tp2.IP iP71 = null;
    boolean b72 = server69.removeException(iP71);
    java.lang.String str73 = server69.toString();
    tp2.IP iP74 = null;
    boolean b75 = server69.connect(iP74);
    tp2.ITime iTime76 = server69.getTime();
    server53.setTime(iTime76);
    server10.setTime(iTime76);
    server0.setTime(iTime76);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "Server [lastUpdate=0, exceptions=(), bans={}]"+ "'", str16.equals("Server [lastUpdate=0, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long19 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str26 + "' != '" + "Server [lastUpdate=1465509740931, exceptions=(), bans={}]"+ "'", str26.equals("Server [lastUpdate=1465509740931, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long28 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b43 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str58 + "' != '" + "Server [lastUpdate=0, exceptions=(), bans={}]"+ "'", str58.equals("Server [lastUpdate=0, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long59 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b61 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b63 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b65 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b67 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str68 + "' != '" + "Server [lastUpdate=0, exceptions=(), bans={}]"+ "'", str68.equals("Server [lastUpdate=0, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime70);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b72 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str73 + "' != '" + "Server [lastUpdate=0, exceptions=(), bans={}]"+ "'", str73.equals("Server [lastUpdate=0, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b75 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime76);

  }

  @Test
  public void test082() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test082"); }


    tp2.Server server0 = new tp2.Server();
    tp2.ITime iTime1 = server0.getTime();
    tp2.Server server2 = new tp2.Server();
    tp2.ITime iTime3 = server2.getTime();
    server0.setTime(iTime3);
    tp2.ITime iTime5 = server0.getTime();
    server0.update();
    tp2.IP iP7 = null;
    boolean b8 = server0.removeBan(iP7);
    tp2.Server server9 = new tp2.Server();
    tp2.ITime iTime10 = server9.getTime();
    server9.update();
    tp2.Server server12 = new tp2.Server();
    tp2.ITime iTime13 = server12.getTime();
    tp2.IP iP14 = null;
    boolean b15 = server12.removeException(iP14);
    tp2.IP iP16 = null;
    boolean b17 = server12.connect(iP16);
    tp2.IP iP18 = null;
    boolean b19 = server12.removeException(iP18);
    tp2.IP iP20 = null;
    boolean b21 = server12.connect(iP20);
    tp2.IP iP22 = null;
    boolean b23 = server12.removeException(iP22);
    tp2.Server server24 = new tp2.Server();
    tp2.ITime iTime25 = server24.getTime();
    server24.update();
    tp2.ITime iTime27 = server24.getTime();
    server12.setTime(iTime27);
    tp2.Server server29 = new tp2.Server();
    tp2.ITime iTime30 = server29.getTime();
    server29.update();
    tp2.ITime iTime32 = server29.getTime();
    server12.setTime(iTime32);
    server9.setTime(iTime32);
    long long35 = server9.getLastUpdate();
    tp2.IP iP36 = null;
    boolean b37 = server9.connect(iP36);
    tp2.Server server38 = new tp2.Server();
    tp2.ITime iTime39 = server38.getTime();
    tp2.IP iP40 = null;
    boolean b41 = server38.connect(iP40);
    tp2.ITime iTime42 = server38.getTime();
    server9.setTime(iTime42);
    tp2.ITime iTime44 = server9.getTime();
    server0.setTime(iTime44);
    tp2.IP iP46 = null;
    boolean b47 = server0.addBan(iP46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long35 == 1465509740965L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b47 == false);

  }

  @Test
  public void test083() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test083"); }


    tp2.Server server0 = new tp2.Server();
    tp2.ITime iTime1 = server0.getTime();
    tp2.IP iP2 = null;
    boolean b3 = server0.removeException(iP2);
    tp2.IP iP4 = null;
    boolean b5 = server0.connect(iP4);
    tp2.IP iP6 = null;
    boolean b7 = server0.removeException(iP6);
    tp2.IP iP8 = null;
    boolean b9 = server0.connect(iP8);
    tp2.IP iP10 = null;
    boolean b11 = server0.removeException(iP10);
    tp2.Server server12 = new tp2.Server();
    tp2.ITime iTime13 = server12.getTime();
    server12.update();
    tp2.ITime iTime15 = server12.getTime();
    server0.setTime(iTime15);
    tp2.Server server17 = new tp2.Server();
    tp2.ITime iTime18 = server17.getTime();
    server17.update();
    tp2.ITime iTime20 = server17.getTime();
    server0.setTime(iTime20);
    tp2.IP iP22 = null;
    boolean b23 = server0.addBan(iP22);
    long long24 = server0.getLastUpdate();
    tp2.IP iP25 = null;
    boolean b26 = server0.removeException(iP25);
    tp2.IP iP27 = null;
    boolean b28 = server0.removeException(iP27);
    tp2.IP iP29 = null;
    boolean b30 = server0.addBan(iP29);
    tp2.IP iP31 = null;
    boolean b32 = server0.addBan(iP31);
    tp2.ITime iTime33 = server0.getTime();
    server0.update();
    tp2.IP iP35 = null;
    boolean b36 = server0.addBan(iP35);
    tp2.ITime iTime37 = server0.getTime();
    tp2.Server server38 = new tp2.Server();
    tp2.ITime iTime39 = server38.getTime();
    server38.update();
    tp2.ITime iTime41 = server38.getTime();
    tp2.Server server42 = new tp2.Server();
    long long43 = server42.getLastUpdate();
    tp2.ITime iTime44 = server42.getTime();
    server38.setTime(iTime44);
    tp2.ITime iTime46 = server38.getTime();
    tp2.ITime iTime47 = server38.getTime();
    tp2.ITime iTime48 = server38.getTime();
    tp2.ITime iTime49 = server38.getTime();
    server0.setTime(iTime49);
    tp2.IP iP51 = null;
    boolean b52 = server0.removeBan(iP51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long24 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long43 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b52 == false);

  }

  @Test
  public void test084() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test084"); }


    tp2.Server server0 = new tp2.Server();
    tp2.ITime iTime1 = server0.getTime();
    tp2.Server server2 = new tp2.Server();
    tp2.ITime iTime3 = server2.getTime();
    server0.setTime(iTime3);
    server0.update();
    server0.update();
    tp2.ITime iTime7 = server0.getTime();
    server0.update();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime7);

  }

  @Test
  public void test085() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test085"); }


    tp2.Server server0 = new tp2.Server();
    tp2.ITime iTime1 = server0.getTime();
    tp2.Server server2 = new tp2.Server();
    tp2.ITime iTime3 = server2.getTime();
    server0.setTime(iTime3);
    tp2.ITime iTime5 = server0.getTime();
    tp2.IP iP6 = null;
    boolean b7 = server0.addBan(iP6);
    tp2.IP iP8 = null;
    boolean b9 = server0.addBan(iP8);
    tp2.IP iP10 = null;
    boolean b11 = server0.removeBan(iP10);
    server0.update();
    tp2.IP iP13 = null;
    boolean b14 = server0.removeException(iP13);
    tp2.IP iP15 = null;
    boolean b16 = server0.removeBan(iP15);
    tp2.IP iP17 = null;
    boolean b18 = server0.removeBan(iP17);
    server0.update();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);

  }

  @Test
  public void test086() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test086"); }


    tp2.Server server0 = new tp2.Server();
    long long1 = server0.getLastUpdate();
    tp2.ITime iTime2 = server0.getTime();
    tp2.IP iP3 = null;
    boolean b4 = server0.removeException(iP3);
    tp2.IP iP5 = null;
    boolean b6 = server0.addBan(iP5);
    java.lang.String str7 = server0.toString();
    tp2.ITime iTime8 = server0.getTime();
    tp2.IP iP9 = null;
    boolean b10 = server0.removeBan(iP9);
    server0.update();
    server0.update();
    tp2.Server server13 = new tp2.Server();
    long long14 = server13.getLastUpdate();
    tp2.ITime iTime15 = server13.getTime();
    tp2.IP iP16 = null;
    boolean b17 = server13.removeException(iP16);
    tp2.Server server18 = new tp2.Server();
    tp2.ITime iTime19 = server18.getTime();
    tp2.IP iP20 = null;
    boolean b21 = server18.removeException(iP20);
    tp2.IP iP22 = null;
    boolean b23 = server18.connect(iP22);
    tp2.IP iP24 = null;
    boolean b25 = server18.removeException(iP24);
    tp2.IP iP26 = null;
    boolean b27 = server18.connect(iP26);
    tp2.IP iP28 = null;
    boolean b29 = server18.removeException(iP28);
    tp2.Server server30 = new tp2.Server();
    tp2.ITime iTime31 = server30.getTime();
    server30.update();
    tp2.ITime iTime33 = server30.getTime();
    server18.setTime(iTime33);
    server13.setTime(iTime33);
    long long36 = server13.getLastUpdate();
    server13.update();
    tp2.IP iP38 = null;
    boolean b39 = server13.removeException(iP38);
    tp2.ITime iTime40 = server13.getTime();
    server0.setTime(iTime40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Server [lastUpdate=0, exceptions=(), bans={}]"+ "'", str7.equals("Server [lastUpdate=0, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long14 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long36 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime40);

  }

  @Test
  public void test087() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test087"); }


    tp2.Server server0 = new tp2.Server();
    tp2.ITime iTime1 = server0.getTime();
    long long2 = server0.getLastUpdate();
    tp2.IP iP3 = null;
    boolean b4 = server0.removeBan(iP3);
    tp2.Server server5 = new tp2.Server();
    tp2.ITime iTime6 = server5.getTime();
    tp2.Server server7 = new tp2.Server();
    tp2.ITime iTime8 = server7.getTime();
    server5.setTime(iTime8);
    server0.setTime(iTime8);
    tp2.ITime iTime11 = server0.getTime();
    tp2.ITime iTime12 = server0.getTime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long2 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime12);

  }

  @Test
  public void test088() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test088"); }


    tp2.Server server0 = new tp2.Server();
    tp2.ITime iTime1 = server0.getTime();
    tp2.Server server2 = new tp2.Server();
    tp2.ITime iTime3 = server2.getTime();
    server0.setTime(iTime3);
    server0.update();
    java.lang.String str6 = server0.toString();
    java.lang.String str7 = server0.toString();
    tp2.IP iP8 = null;
    boolean b9 = server0.removeException(iP8);
    tp2.IP iP10 = null;
    boolean b11 = server0.removeBan(iP10);
    tp2.IP iP12 = null;
    boolean b13 = server0.addBan(iP12);
    long long14 = server0.getLastUpdate();
    long long15 = server0.getLastUpdate();
    tp2.ITime iTime16 = server0.getTime();
    tp2.IP iP17 = null;
    boolean b18 = server0.removeException(iP17);
    tp2.IP iP19 = null;
    boolean b20 = server0.connect(iP19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Server [lastUpdate=1465509741061, exceptions=(), bans={}]"+ "'", str6.equals("Server [lastUpdate=1465509741061, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Server [lastUpdate=1465509741061, exceptions=(), bans={}]"+ "'", str7.equals("Server [lastUpdate=1465509741061, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long14 == 1465509741061L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long15 == 1465509741061L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);

  }

  @Test
  public void test089() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test089"); }


    tp2.Server server0 = new tp2.Server();
    tp2.ITime iTime1 = server0.getTime();
    tp2.IP iP2 = null;
    boolean b3 = server0.removeException(iP2);
    tp2.IP iP4 = null;
    boolean b5 = server0.connect(iP4);
    tp2.IP iP6 = null;
    boolean b7 = server0.removeException(iP6);
    tp2.IP iP8 = null;
    boolean b9 = server0.connect(iP8);
    tp2.IP iP10 = null;
    boolean b11 = server0.removeException(iP10);
    tp2.IP iP12 = null;
    boolean b13 = server0.connect(iP12);
    long long14 = server0.getLastUpdate();
    long long15 = server0.getLastUpdate();
    tp2.ITime iTime16 = server0.getTime();
    tp2.Server server17 = new tp2.Server();
    tp2.ITime iTime18 = server17.getTime();
    tp2.IP iP19 = null;
    boolean b20 = server17.removeException(iP19);
    tp2.IP iP21 = null;
    boolean b22 = server17.connect(iP21);
    server17.update();
    tp2.ITime iTime24 = server17.getTime();
    server0.setTime(iTime24);
    server0.update();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long14 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long15 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime24);

  }

  @Test
  public void test090() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test090"); }


    tp2.Server server0 = new tp2.Server();
    tp2.ITime iTime1 = server0.getTime();
    long long2 = server0.getLastUpdate();
    tp2.IP iP3 = null;
    boolean b4 = server0.removeBan(iP3);
    tp2.IP iP5 = null;
    boolean b6 = server0.removeBan(iP5);
    long long7 = server0.getLastUpdate();
    tp2.IP iP8 = null;
    boolean b9 = server0.connect(iP8);
    tp2.IP iP10 = null;
    boolean b11 = server0.connect(iP10);
    tp2.IP iP12 = null;
    boolean b13 = server0.removeBan(iP12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long2 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long7 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);

  }

  @Test
  public void test091() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test091"); }


    tp2.Server server0 = new tp2.Server();
    tp2.ITime iTime1 = server0.getTime();
    tp2.Server server2 = new tp2.Server();
    tp2.ITime iTime3 = server2.getTime();
    server0.setTime(iTime3);
    server0.update();
    server0.update();
    tp2.ITime iTime7 = server0.getTime();
    tp2.IP iP8 = null;
    boolean b9 = server0.addBan(iP8);
    tp2.Server server10 = new tp2.Server();
    long long11 = server10.getLastUpdate();
    tp2.ITime iTime12 = server10.getTime();
    tp2.IP iP13 = null;
    boolean b14 = server10.removeException(iP13);
    tp2.IP iP15 = null;
    boolean b16 = server10.removeBan(iP15);
    tp2.IP iP17 = null;
    boolean b18 = server10.removeException(iP17);
    tp2.IP iP19 = null;
    boolean b20 = server10.addBan(iP19);
    server10.update();
    tp2.IP iP22 = null;
    boolean b23 = server10.addBan(iP22);
    tp2.ITime iTime24 = server10.getTime();
    tp2.IP iP25 = null;
    boolean b26 = server10.removeException(iP25);
    tp2.ITime iTime27 = server10.getTime();
    server0.setTime(iTime27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long11 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime27);

  }

  @Test
  public void test092() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test092"); }


    tp2.Server server0 = new tp2.Server();
    tp2.ITime iTime1 = server0.getTime();
    tp2.Server server2 = new tp2.Server();
    tp2.ITime iTime3 = server2.getTime();
    server0.setTime(iTime3);
    server0.update();
    java.lang.String str6 = server0.toString();
    tp2.IP iP7 = null;
    boolean b8 = server0.removeException(iP7);
    server0.update();
    tp2.IP iP10 = null;
    boolean b11 = server0.removeException(iP10);
    tp2.IP iP12 = null;
    boolean b13 = server0.connect(iP12);
    tp2.IP iP14 = null;
    boolean b15 = server0.removeException(iP14);
    tp2.ITime iTime16 = server0.getTime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Server [lastUpdate=1465509741137, exceptions=(), bans={}]"+ "'", str6.equals("Server [lastUpdate=1465509741137, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime16);

  }

  @Test
  public void test093() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test093"); }


    tp2.Server server0 = new tp2.Server();
    tp2.ITime iTime1 = server0.getTime();
    server0.update();
    tp2.IP iP3 = null;
    boolean b4 = server0.removeBan(iP3);
    java.lang.String str5 = server0.toString();
    java.lang.String str6 = server0.toString();
    tp2.Server server7 = new tp2.Server();
    tp2.ITime iTime8 = server7.getTime();
    tp2.IP iP9 = null;
    boolean b10 = server7.removeException(iP9);
    tp2.IP iP11 = null;
    boolean b12 = server7.connect(iP11);
    tp2.IP iP13 = null;
    boolean b14 = server7.removeException(iP13);
    tp2.IP iP15 = null;
    boolean b16 = server7.connect(iP15);
    tp2.IP iP17 = null;
    boolean b18 = server7.removeException(iP17);
    tp2.IP iP19 = null;
    boolean b20 = server7.removeBan(iP19);
    long long21 = server7.getLastUpdate();
    java.lang.String str22 = server7.toString();
    tp2.ITime iTime23 = server7.getTime();
    tp2.ITime iTime24 = server7.getTime();
    server0.setTime(iTime24);
    java.lang.String str26 = server0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Server [lastUpdate=1465509741143, exceptions=(), bans={}]"+ "'", str5.equals("Server [lastUpdate=1465509741143, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Server [lastUpdate=1465509741143, exceptions=(), bans={}]"+ "'", str6.equals("Server [lastUpdate=1465509741143, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long21 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + "Server [lastUpdate=0, exceptions=(), bans={}]"+ "'", str22.equals("Server [lastUpdate=0, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str26 + "' != '" + "Server [lastUpdate=1465509741143, exceptions=(), bans={}]"+ "'", str26.equals("Server [lastUpdate=1465509741143, exceptions=(), bans={}]"));

  }

  @Test
  public void test094() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test094"); }


    tp2.Server server0 = new tp2.Server();
    tp2.ITime iTime1 = server0.getTime();
    tp2.IP iP2 = null;
    boolean b3 = server0.connect(iP2);
    tp2.IP iP4 = null;
    boolean b5 = server0.removeBan(iP4);
    java.lang.String str6 = server0.toString();
    tp2.IP iP7 = null;
    boolean b8 = server0.removeException(iP7);
    long long9 = server0.getLastUpdate();
    tp2.Server server10 = new tp2.Server();
    tp2.ITime iTime11 = server10.getTime();
    tp2.Server server12 = new tp2.Server();
    tp2.ITime iTime13 = server12.getTime();
    server10.setTime(iTime13);
    server10.update();
    java.lang.String str16 = server10.toString();
    tp2.Server server17 = new tp2.Server();
    long long18 = server17.getLastUpdate();
    tp2.ITime iTime19 = server17.getTime();
    tp2.IP iP20 = null;
    boolean b21 = server17.removeException(iP20);
    tp2.Server server22 = new tp2.Server();
    tp2.ITime iTime23 = server22.getTime();
    tp2.IP iP24 = null;
    boolean b25 = server22.removeException(iP24);
    tp2.IP iP26 = null;
    boolean b27 = server22.connect(iP26);
    tp2.IP iP28 = null;
    boolean b29 = server22.removeException(iP28);
    tp2.IP iP30 = null;
    boolean b31 = server22.connect(iP30);
    tp2.IP iP32 = null;
    boolean b33 = server22.removeException(iP32);
    tp2.Server server34 = new tp2.Server();
    tp2.ITime iTime35 = server34.getTime();
    server34.update();
    tp2.ITime iTime37 = server34.getTime();
    server22.setTime(iTime37);
    server17.setTime(iTime37);
    server10.setTime(iTime37);
    server0.setTime(iTime37);
    server0.update();
    tp2.Server server43 = new tp2.Server();
    tp2.ITime iTime44 = server43.getTime();
    server43.update();
    tp2.ITime iTime46 = server43.getTime();
    tp2.ITime iTime47 = server43.getTime();
    tp2.IP iP48 = null;
    boolean b49 = server43.connect(iP48);
    tp2.IP iP50 = null;
    boolean b51 = server43.removeBan(iP50);
    tp2.IP iP52 = null;
    boolean b53 = server43.removeException(iP52);
    tp2.ITime iTime54 = server43.getTime();
    server0.setTime(iTime54);
    long long56 = server0.getLastUpdate();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Server [lastUpdate=0, exceptions=(), bans={}]"+ "'", str6.equals("Server [lastUpdate=0, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long9 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "Server [lastUpdate=1465509741151, exceptions=(), bans={}]"+ "'", str16.equals("Server [lastUpdate=1465509741151, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long18 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b49 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b51 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b53 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long56 == 1465509741152L);

  }

  @Test
  public void test095() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test095"); }


    tp2.Server server0 = new tp2.Server();
    long long1 = server0.getLastUpdate();
    server0.update();
    tp2.IP iP3 = null;
    boolean b4 = server0.removeException(iP3);
    server0.update();
    java.lang.String str6 = server0.toString();
    tp2.IP iP7 = null;
    boolean b8 = server0.addBan(iP7);
    tp2.ITime iTime9 = server0.getTime();
    tp2.Server server10 = new tp2.Server();
    tp2.ITime iTime11 = server10.getTime();
    tp2.IP iP12 = null;
    boolean b13 = server10.removeException(iP12);
    tp2.IP iP14 = null;
    boolean b15 = server10.connect(iP14);
    tp2.IP iP16 = null;
    boolean b17 = server10.removeException(iP16);
    tp2.IP iP18 = null;
    boolean b19 = server10.connect(iP18);
    tp2.IP iP20 = null;
    boolean b21 = server10.removeException(iP20);
    tp2.Server server22 = new tp2.Server();
    tp2.ITime iTime23 = server22.getTime();
    server22.update();
    tp2.ITime iTime25 = server22.getTime();
    server10.setTime(iTime25);
    tp2.Server server27 = new tp2.Server();
    tp2.ITime iTime28 = server27.getTime();
    server27.update();
    tp2.ITime iTime30 = server27.getTime();
    server10.setTime(iTime30);
    tp2.IP iP32 = null;
    boolean b33 = server10.addBan(iP32);
    long long34 = server10.getLastUpdate();
    tp2.IP iP35 = null;
    boolean b36 = server10.removeException(iP35);
    tp2.IP iP37 = null;
    boolean b38 = server10.removeException(iP37);
    tp2.IP iP39 = null;
    boolean b40 = server10.addBan(iP39);
    tp2.IP iP41 = null;
    boolean b42 = server10.removeException(iP41);
    tp2.IP iP43 = null;
    boolean b44 = server10.removeException(iP43);
    long long45 = server10.getLastUpdate();
    tp2.Server server46 = new tp2.Server();
    tp2.ITime iTime47 = server46.getTime();
    tp2.IP iP48 = null;
    boolean b49 = server46.connect(iP48);
    tp2.ITime iTime50 = server46.getTime();
    tp2.ITime iTime51 = server46.getTime();
    server10.setTime(iTime51);
    server0.setTime(iTime51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Server [lastUpdate=1465509741178, exceptions=(), bans={}]"+ "'", str6.equals("Server [lastUpdate=1465509741178, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long34 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long45 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b49 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime51);

  }

  @Test
  public void test096() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test096"); }


    tp2.Server server0 = new tp2.Server();
    tp2.ITime iTime1 = server0.getTime();
    server0.update();
    tp2.ITime iTime3 = server0.getTime();
    long long4 = server0.getLastUpdate();
    long long5 = server0.getLastUpdate();
    tp2.IP iP6 = null;
    boolean b7 = server0.addBan(iP6);
    tp2.Server server8 = new tp2.Server();
    tp2.ITime iTime9 = server8.getTime();
    tp2.IP iP10 = null;
    boolean b11 = server8.connect(iP10);
    tp2.ITime iTime12 = server8.getTime();
    tp2.ITime iTime13 = server8.getTime();
    server0.setTime(iTime13);
    long long15 = server0.getLastUpdate();
    tp2.IP iP16 = null;
    boolean b17 = server0.removeBan(iP16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long4 == 1465509741189L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long5 == 1465509741189L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long15 == 1465509741189L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);

  }

  @Test
  public void test097() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test097"); }


    tp2.Server server0 = new tp2.Server();
    long long1 = server0.getLastUpdate();
    server0.update();
    tp2.IP iP3 = null;
    boolean b4 = server0.removeException(iP3);
    server0.update();
    java.lang.String str6 = server0.toString();
    tp2.IP iP7 = null;
    boolean b8 = server0.removeBan(iP7);
    tp2.IP iP9 = null;
    boolean b10 = server0.removeBan(iP9);
    tp2.IP iP11 = null;
    boolean b12 = server0.removeBan(iP11);
    server0.update();
    tp2.IP iP14 = null;
    boolean b15 = server0.removeBan(iP14);
    long long16 = server0.getLastUpdate();
    tp2.IP iP17 = null;
    boolean b18 = server0.addBan(iP17);
    long long19 = server0.getLastUpdate();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Server [lastUpdate=1465509741194, exceptions=(), bans={}]"+ "'", str6.equals("Server [lastUpdate=1465509741194, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long16 == 1465509741195L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long19 == 1465509741195L);

  }

  @Test
  public void test098() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test098"); }


    tp2.Server server0 = new tp2.Server();
    long long1 = server0.getLastUpdate();
    server0.update();
    tp2.IP iP3 = null;
    boolean b4 = server0.removeException(iP3);
    server0.update();
    java.lang.String str6 = server0.toString();
    tp2.IP iP7 = null;
    boolean b8 = server0.addBan(iP7);
    long long9 = server0.getLastUpdate();
    long long10 = server0.getLastUpdate();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Server [lastUpdate=1465509741195, exceptions=(), bans={}]"+ "'", str6.equals("Server [lastUpdate=1465509741195, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long9 == 1465509741195L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long10 == 1465509741195L);

  }

  @Test
  public void test099() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test099"); }


    tp2.Server server0 = new tp2.Server();
    tp2.ITime iTime1 = server0.getTime();
    tp2.IP iP2 = null;
    boolean b3 = server0.removeException(iP2);
    tp2.IP iP4 = null;
    boolean b5 = server0.connect(iP4);
    tp2.IP iP6 = null;
    boolean b7 = server0.removeException(iP6);
    tp2.IP iP8 = null;
    boolean b9 = server0.connect(iP8);
    tp2.IP iP10 = null;
    boolean b11 = server0.removeException(iP10);
    tp2.IP iP12 = null;
    boolean b13 = server0.removeBan(iP12);
    tp2.IP iP14 = null;
    boolean b15 = server0.addBan(iP14);
    tp2.IP iP16 = null;
    boolean b17 = server0.removeException(iP16);
    tp2.IP iP18 = null;
    boolean b19 = server0.connect(iP18);
    tp2.IP iP20 = null;
    // The following exception was thrown during execution in test generation
    try {
      boolean b21 = server0.addException(iP20);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);

  }

  @Test
  public void test100() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test100"); }


    tp2.Server server0 = new tp2.Server();
    tp2.ITime iTime1 = server0.getTime();
    tp2.Server server2 = new tp2.Server();
    tp2.ITime iTime3 = server2.getTime();
    server0.setTime(iTime3);
    java.lang.String str5 = server0.toString();
    long long6 = server0.getLastUpdate();
    tp2.IP iP7 = null;
    boolean b8 = server0.removeBan(iP7);
    server0.update();
    tp2.IP iP10 = null;
    boolean b11 = server0.removeException(iP10);
    java.lang.String str12 = server0.toString();
    tp2.IP iP13 = null;
    boolean b14 = server0.addBan(iP13);
    tp2.IP iP15 = null;
    boolean b16 = server0.removeException(iP15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Server [lastUpdate=0, exceptions=(), bans={}]"+ "'", str5.equals("Server [lastUpdate=0, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long6 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Server [lastUpdate=1465509741197, exceptions=(), bans={}]"+ "'", str12.equals("Server [lastUpdate=1465509741197, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);

  }

  @Test
  public void test101() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test101"); }


    tp2.Server server0 = new tp2.Server();
    tp2.ITime iTime1 = server0.getTime();
    tp2.IP iP2 = null;
    boolean b3 = server0.removeException(iP2);
    tp2.IP iP4 = null;
    boolean b5 = server0.connect(iP4);
    java.lang.String str6 = server0.toString();
    tp2.IP iP7 = null;
    boolean b8 = server0.addBan(iP7);
    server0.update();
    tp2.IP iP10 = null;
    boolean b11 = server0.removeBan(iP10);
    tp2.IP iP12 = null;
    boolean b13 = server0.removeBan(iP12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Server [lastUpdate=0, exceptions=(), bans={}]"+ "'", str6.equals("Server [lastUpdate=0, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);

  }

  @Test
  public void test102() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test102"); }


    tp2.Server server0 = new tp2.Server();
    tp2.ITime iTime1 = server0.getTime();
    tp2.IP iP2 = null;
    boolean b3 = server0.removeException(iP2);
    tp2.IP iP4 = null;
    boolean b5 = server0.connect(iP4);
    server0.update();
    tp2.ITime iTime7 = server0.getTime();
    tp2.IP iP8 = null;
    boolean b9 = server0.addBan(iP8);
    tp2.IP iP10 = null;
    boolean b11 = server0.removeException(iP10);
    server0.update();
    java.lang.String str13 = server0.toString();
    tp2.ITime iTime14 = server0.getTime();
    tp2.IP iP15 = null;
    boolean b16 = server0.connect(iP15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Server [lastUpdate=1465509741200, exceptions=(), bans={}]"+ "'", str13.equals("Server [lastUpdate=1465509741200, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);

  }

  @Test
  public void test103() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test103"); }


    tp2.Server server0 = new tp2.Server();
    tp2.ITime iTime1 = server0.getTime();
    server0.update();
    tp2.ITime iTime3 = server0.getTime();
    tp2.IP iP4 = null;
    boolean b5 = server0.addBan(iP4);
    tp2.IP iP6 = null;
    boolean b7 = server0.removeException(iP6);
    tp2.Server server8 = new tp2.Server();
    tp2.ITime iTime9 = server8.getTime();
    server8.update();
    tp2.Server server11 = new tp2.Server();
    long long12 = server11.getLastUpdate();
    tp2.ITime iTime13 = server11.getTime();
    server8.setTime(iTime13);
    server0.setTime(iTime13);
    tp2.IP iP16 = null;
    boolean b17 = server0.addBan(iP16);
    tp2.ITime iTime18 = null;
    server0.setTime(iTime18);
    tp2.IP iP20 = null;
    boolean b21 = server0.addBan(iP20);
    tp2.IP iP22 = null;
    boolean b23 = server0.addBan(iP22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long12 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);

  }

  @Test
  public void test104() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test104"); }


    tp2.Server server0 = new tp2.Server();
    tp2.ITime iTime1 = server0.getTime();
    tp2.Server server2 = new tp2.Server();
    tp2.ITime iTime3 = server2.getTime();
    server0.setTime(iTime3);
    java.lang.String str5 = server0.toString();
    long long6 = server0.getLastUpdate();
    tp2.IP iP7 = null;
    boolean b8 = server0.removeBan(iP7);
    tp2.IP iP9 = null;
    boolean b10 = server0.removeException(iP9);
    tp2.IP iP11 = null;
    boolean b12 = server0.connect(iP11);
    tp2.IP iP13 = null;
    boolean b14 = server0.removeBan(iP13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Server [lastUpdate=0, exceptions=(), bans={}]"+ "'", str5.equals("Server [lastUpdate=0, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long6 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);

  }

  @Test
  public void test105() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test105"); }


    tp2.Server server0 = new tp2.Server();
    long long1 = server0.getLastUpdate();
    tp2.ITime iTime2 = server0.getTime();
    tp2.IP iP3 = null;
    boolean b4 = server0.removeException(iP3);
    tp2.IP iP5 = null;
    boolean b6 = server0.removeBan(iP5);
    tp2.IP iP7 = null;
    boolean b8 = server0.removeException(iP7);
    tp2.IP iP9 = null;
    boolean b10 = server0.addBan(iP9);
    server0.update();
    tp2.IP iP12 = null;
    boolean b13 = server0.addBan(iP12);
    tp2.IP iP14 = null;
    boolean b15 = server0.removeBan(iP14);
    server0.update();
    tp2.IP iP17 = null;
    boolean b18 = server0.removeException(iP17);
    tp2.IP iP19 = null;
    boolean b20 = server0.removeException(iP19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);

  }

  @Test
  public void test106() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test106"); }


    tp2.Server server0 = new tp2.Server();
    tp2.ITime iTime1 = server0.getTime();
    server0.update();
    tp2.ITime iTime3 = server0.getTime();
    tp2.IP iP4 = null;
    boolean b5 = server0.removeBan(iP4);
    tp2.IP iP6 = null;
    boolean b7 = server0.connect(iP6);
    tp2.IP iP8 = null;
    boolean b9 = server0.connect(iP8);
    tp2.IP iP10 = null;
    boolean b11 = server0.removeException(iP10);
    tp2.Server server12 = new tp2.Server();
    tp2.ITime iTime13 = server12.getTime();
    tp2.Server server14 = new tp2.Server();
    tp2.ITime iTime15 = server14.getTime();
    server12.setTime(iTime15);
    server12.update();
    java.lang.String str18 = server12.toString();
    java.lang.String str19 = server12.toString();
    tp2.IP iP20 = null;
    boolean b21 = server12.removeException(iP20);
    java.lang.String str22 = server12.toString();
    tp2.Server server23 = new tp2.Server();
    tp2.ITime iTime24 = server23.getTime();
    server23.update();
    tp2.ITime iTime26 = server23.getTime();
    tp2.Server server27 = new tp2.Server();
    long long28 = server27.getLastUpdate();
    tp2.ITime iTime29 = server27.getTime();
    server23.setTime(iTime29);
    tp2.ITime iTime31 = server23.getTime();
    server12.setTime(iTime31);
    server12.update();
    long long34 = server12.getLastUpdate();
    long long35 = server12.getLastUpdate();
    long long36 = server12.getLastUpdate();
    tp2.Server server37 = new tp2.Server();
    long long38 = server37.getLastUpdate();
    server37.update();
    tp2.IP iP40 = null;
    boolean b41 = server37.removeException(iP40);
    server37.update();
    tp2.IP iP43 = null;
    boolean b44 = server37.addBan(iP43);
    java.lang.String str45 = server37.toString();
    tp2.IP iP46 = null;
    boolean b47 = server37.connect(iP46);
    tp2.IP iP48 = null;
    boolean b49 = server37.removeBan(iP48);
    tp2.Server server50 = new tp2.Server();
    tp2.ITime iTime51 = server50.getTime();
    tp2.IP iP52 = null;
    boolean b53 = server50.removeException(iP52);
    tp2.IP iP54 = null;
    boolean b55 = server50.connect(iP54);
    tp2.IP iP56 = null;
    boolean b57 = server50.removeException(iP56);
    tp2.IP iP58 = null;
    boolean b59 = server50.connect(iP58);
    tp2.IP iP60 = null;
    boolean b61 = server50.removeException(iP60);
    tp2.Server server62 = new tp2.Server();
    tp2.ITime iTime63 = server62.getTime();
    server62.update();
    tp2.ITime iTime65 = server62.getTime();
    server50.setTime(iTime65);
    tp2.ITime iTime67 = server50.getTime();
    server37.setTime(iTime67);
    server12.setTime(iTime67);
    server0.setTime(iTime67);
    long long71 = server0.getLastUpdate();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "Server [lastUpdate=1465509741209, exceptions=(), bans={}]"+ "'", str18.equals("Server [lastUpdate=1465509741209, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "Server [lastUpdate=1465509741209, exceptions=(), bans={}]"+ "'", str19.equals("Server [lastUpdate=1465509741209, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + "Server [lastUpdate=1465509741209, exceptions=(), bans={}]"+ "'", str22.equals("Server [lastUpdate=1465509741209, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long28 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long34 == 1465509741210L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long35 == 1465509741210L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long36 == 1465509741210L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long38 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str45 + "' != '" + "Server [lastUpdate=1465509741210, exceptions=(), bans={}]"+ "'", str45.equals("Server [lastUpdate=1465509741210, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b47 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b49 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b53 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b55 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b57 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b59 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b61 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime63);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime65);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime67);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long71 == 1465509741208L);

  }

  @Test
  public void test107() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test107"); }


    tp2.Server server0 = new tp2.Server();
    long long1 = server0.getLastUpdate();
    server0.update();
    tp2.IP iP3 = null;
    boolean b4 = server0.removeException(iP3);
    server0.update();
    java.lang.String str6 = server0.toString();
    tp2.IP iP7 = null;
    boolean b8 = server0.removeBan(iP7);
    tp2.IP iP9 = null;
    boolean b10 = server0.removeBan(iP9);
    server0.update();
    tp2.IP iP12 = null;
    boolean b13 = server0.addBan(iP12);
    tp2.IP iP14 = null;
    boolean b15 = server0.removeBan(iP14);
    tp2.IP iP16 = null;
    boolean b17 = server0.removeException(iP16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Server [lastUpdate=1465509741228, exceptions=(), bans={}]"+ "'", str6.equals("Server [lastUpdate=1465509741228, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);

  }

  @Test
  public void test108() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test108"); }


    tp2.Server server0 = new tp2.Server();
    tp2.ITime iTime1 = server0.getTime();
    tp2.IP iP2 = null;
    boolean b3 = server0.removeException(iP2);
    tp2.IP iP4 = null;
    boolean b5 = server0.connect(iP4);
    server0.update();
    tp2.IP iP7 = null;
    boolean b8 = server0.addBan(iP7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);

  }

  @Test
  public void test109() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test109"); }


    tp2.Server server0 = new tp2.Server();
    tp2.ITime iTime1 = server0.getTime();
    long long2 = server0.getLastUpdate();
    java.lang.String str3 = server0.toString();
    tp2.ITime iTime4 = server0.getTime();
    tp2.ITime iTime5 = server0.getTime();
    tp2.IP iP6 = null;
    boolean b7 = server0.addBan(iP6);
    tp2.ITime iTime8 = server0.getTime();
    java.lang.String str9 = server0.toString();
    long long10 = server0.getLastUpdate();
    java.lang.String str11 = server0.toString();
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
    org.junit.Assert.assertNotNull(iTime1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long2 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Server [lastUpdate=0, exceptions=(), bans={}]"+ "'", str3.equals("Server [lastUpdate=0, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Server [lastUpdate=0, exceptions=(), bans={}]"+ "'", str9.equals("Server [lastUpdate=0, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long10 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Server [lastUpdate=0, exceptions=(), bans={}]"+ "'", str11.equals("Server [lastUpdate=0, exceptions=(), bans={}]"));

  }

  @Test
  public void test110() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test110"); }


    tp2.Server server0 = new tp2.Server();
    tp2.ITime iTime1 = server0.getTime();
    tp2.IP iP2 = null;
    boolean b3 = server0.removeException(iP2);
    tp2.IP iP4 = null;
    boolean b5 = server0.connect(iP4);
    tp2.IP iP6 = null;
    boolean b7 = server0.removeException(iP6);
    tp2.IP iP8 = null;
    boolean b9 = server0.connect(iP8);
    tp2.IP iP10 = null;
    boolean b11 = server0.removeException(iP10);
    tp2.Server server12 = new tp2.Server();
    tp2.ITime iTime13 = server12.getTime();
    server12.update();
    tp2.ITime iTime15 = server12.getTime();
    server0.setTime(iTime15);
    tp2.IP iP17 = null;
    boolean b18 = server0.removeBan(iP17);
    server0.update();
    tp2.IP iP20 = null;
    boolean b21 = server0.removeBan(iP20);
    tp2.IP iP22 = null;
    boolean b23 = server0.connect(iP22);
    tp2.IP iP24 = null;
    // The following exception was thrown during execution in test generation
    try {
      boolean b25 = server0.addException(iP24);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);

  }

  @Test
  public void test111() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test111"); }


    tp2.Server server0 = new tp2.Server();
    long long1 = server0.getLastUpdate();
    tp2.ITime iTime2 = server0.getTime();
    tp2.IP iP3 = null;
    boolean b4 = server0.removeException(iP3);
    tp2.Server server5 = new tp2.Server();
    tp2.ITime iTime6 = server5.getTime();
    tp2.IP iP7 = null;
    boolean b8 = server5.removeException(iP7);
    tp2.IP iP9 = null;
    boolean b10 = server5.connect(iP9);
    tp2.IP iP11 = null;
    boolean b12 = server5.removeException(iP11);
    tp2.IP iP13 = null;
    boolean b14 = server5.connect(iP13);
    tp2.IP iP15 = null;
    boolean b16 = server5.removeException(iP15);
    tp2.Server server17 = new tp2.Server();
    tp2.ITime iTime18 = server17.getTime();
    server17.update();
    tp2.ITime iTime20 = server17.getTime();
    server5.setTime(iTime20);
    server0.setTime(iTime20);
    long long23 = server0.getLastUpdate();
    server0.update();
    tp2.Server server25 = new tp2.Server();
    tp2.ITime iTime26 = server25.getTime();
    server25.update();
    tp2.ITime iTime28 = server25.getTime();
    tp2.IP iP29 = null;
    boolean b30 = server25.addBan(iP29);
    tp2.IP iP31 = null;
    boolean b32 = server25.removeException(iP31);
    tp2.Server server33 = new tp2.Server();
    tp2.ITime iTime34 = server33.getTime();
    server33.update();
    tp2.Server server36 = new tp2.Server();
    long long37 = server36.getLastUpdate();
    tp2.ITime iTime38 = server36.getTime();
    server33.setTime(iTime38);
    server25.setTime(iTime38);
    server0.setTime(iTime38);
    tp2.IP iP42 = null;
    boolean b43 = server0.connect(iP42);
    tp2.Server server44 = new tp2.Server();
    tp2.ITime iTime45 = server44.getTime();
    tp2.IP iP46 = null;
    boolean b47 = server44.removeException(iP46);
    java.lang.String str48 = server44.toString();
    java.lang.String str49 = server44.toString();
    tp2.Server server50 = new tp2.Server();
    long long51 = server50.getLastUpdate();
    server50.update();
    tp2.IP iP53 = null;
    boolean b54 = server50.removeBan(iP53);
    long long55 = server50.getLastUpdate();
    tp2.Server server56 = new tp2.Server();
    tp2.ITime iTime57 = server56.getTime();
    tp2.IP iP58 = null;
    boolean b59 = server56.removeException(iP58);
    tp2.ITime iTime60 = server56.getTime();
    tp2.ITime iTime61 = server56.getTime();
    server50.setTime(iTime61);
    server44.setTime(iTime61);
    tp2.ITime iTime64 = server44.getTime();
    server0.setTime(iTime64);
    tp2.IP iP66 = null;
    boolean b67 = server0.connect(iP66);
    java.lang.String str68 = server0.toString();
    tp2.IP iP69 = null;
    boolean b70 = server0.removeException(iP69);
    server0.update();
    server0.update();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long23 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long37 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b43 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b47 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str48 + "' != '" + "Server [lastUpdate=0, exceptions=(), bans={}]"+ "'", str48.equals("Server [lastUpdate=0, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str49 + "' != '" + "Server [lastUpdate=0, exceptions=(), bans={}]"+ "'", str49.equals("Server [lastUpdate=0, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long51 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b54 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long55 == 1465509741235L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b59 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime60);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime61);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime64);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b67 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str68 + "' != '" + "Server [lastUpdate=1465509741234, exceptions=(), bans={}]"+ "'", str68.equals("Server [lastUpdate=1465509741234, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b70 == false);

  }

  @Test
  public void test112() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test112"); }


    tp2.Server server0 = new tp2.Server();
    tp2.ITime iTime1 = server0.getTime();
    server0.update();
    tp2.ITime iTime3 = server0.getTime();
    tp2.ITime iTime4 = server0.getTime();
    tp2.IP iP5 = null;
    boolean b6 = server0.connect(iP5);
    tp2.IP iP7 = null;
    boolean b8 = server0.connect(iP7);
    server0.update();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);

  }

  @Test
  public void test113() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test113"); }


    tp2.Server server0 = new tp2.Server();
    long long1 = server0.getLastUpdate();
    server0.update();
    tp2.IP iP3 = null;
    boolean b4 = server0.removeException(iP3);
    server0.update();
    java.lang.String str6 = server0.toString();
    tp2.IP iP7 = null;
    boolean b8 = server0.addBan(iP7);
    java.lang.String str9 = server0.toString();
    tp2.ITime iTime10 = server0.getTime();
    java.lang.String str11 = server0.toString();
    long long12 = server0.getLastUpdate();
    tp2.IP iP13 = null;
    boolean b14 = server0.connect(iP13);
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
    org.junit.Assert.assertTrue(long1 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Server [lastUpdate=1465509741271, exceptions=(), bans={}]"+ "'", str6.equals("Server [lastUpdate=1465509741271, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Server [lastUpdate=1465509741271, exceptions=(), bans={}]"+ "'", str9.equals("Server [lastUpdate=1465509741271, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Server [lastUpdate=1465509741271, exceptions=(), bans={}]"+ "'", str11.equals("Server [lastUpdate=1465509741271, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long12 == 1465509741271L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);

  }

  @Test
  public void test114() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test114"); }


    tp2.Server server0 = new tp2.Server();
    tp2.ITime iTime1 = server0.getTime();
    server0.update();
    tp2.ITime iTime3 = server0.getTime();
    long long4 = server0.getLastUpdate();
    long long5 = server0.getLastUpdate();
    long long6 = server0.getLastUpdate();
    java.lang.String str7 = server0.toString();
    tp2.IP iP8 = null;
    boolean b9 = server0.connect(iP8);
    long long10 = server0.getLastUpdate();
    long long11 = server0.getLastUpdate();
    tp2.IP iP12 = null;
    boolean b13 = server0.addBan(iP12);
    tp2.IP iP14 = null;
    boolean b15 = server0.removeException(iP14);
    tp2.IP iP16 = null;
    boolean b17 = server0.addBan(iP16);
    server0.update();
    java.lang.String str19 = server0.toString();
    tp2.IP iP20 = null;
    boolean b21 = server0.addBan(iP20);
    server0.update();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long4 == 1465509741273L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long5 == 1465509741273L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long6 == 1465509741273L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Server [lastUpdate=1465509741273, exceptions=(), bans={}]"+ "'", str7.equals("Server [lastUpdate=1465509741273, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long10 == 1465509741273L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long11 == 1465509741273L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "Server [lastUpdate=1465509741274, exceptions=(), bans={}]"+ "'", str19.equals("Server [lastUpdate=1465509741274, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);

  }

  @Test
  public void test115() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test115"); }


    tp2.Server server0 = new tp2.Server();
    tp2.ITime iTime1 = server0.getTime();
    tp2.IP iP2 = null;
    boolean b3 = server0.connect(iP2);
    tp2.ITime iTime4 = server0.getTime();
    tp2.Server server5 = new tp2.Server();
    tp2.ITime iTime6 = server5.getTime();
    tp2.IP iP7 = null;
    boolean b8 = server5.connect(iP7);
    tp2.IP iP9 = null;
    boolean b10 = server5.removeBan(iP9);
    java.lang.String str11 = server5.toString();
    tp2.IP iP12 = null;
    boolean b13 = server5.removeException(iP12);
    long long14 = server5.getLastUpdate();
    tp2.Server server15 = new tp2.Server();
    tp2.ITime iTime16 = server15.getTime();
    tp2.Server server17 = new tp2.Server();
    tp2.ITime iTime18 = server17.getTime();
    server15.setTime(iTime18);
    server15.update();
    java.lang.String str21 = server15.toString();
    tp2.Server server22 = new tp2.Server();
    long long23 = server22.getLastUpdate();
    tp2.ITime iTime24 = server22.getTime();
    tp2.IP iP25 = null;
    boolean b26 = server22.removeException(iP25);
    tp2.Server server27 = new tp2.Server();
    tp2.ITime iTime28 = server27.getTime();
    tp2.IP iP29 = null;
    boolean b30 = server27.removeException(iP29);
    tp2.IP iP31 = null;
    boolean b32 = server27.connect(iP31);
    tp2.IP iP33 = null;
    boolean b34 = server27.removeException(iP33);
    tp2.IP iP35 = null;
    boolean b36 = server27.connect(iP35);
    tp2.IP iP37 = null;
    boolean b38 = server27.removeException(iP37);
    tp2.Server server39 = new tp2.Server();
    tp2.ITime iTime40 = server39.getTime();
    server39.update();
    tp2.ITime iTime42 = server39.getTime();
    server27.setTime(iTime42);
    server22.setTime(iTime42);
    server15.setTime(iTime42);
    server5.setTime(iTime42);
    server0.setTime(iTime42);
    tp2.Server server48 = new tp2.Server();
    tp2.ITime iTime49 = server48.getTime();
    server48.update();
    tp2.ITime iTime51 = server48.getTime();
    tp2.Server server52 = new tp2.Server();
    long long53 = server52.getLastUpdate();
    tp2.ITime iTime54 = server52.getTime();
    server48.setTime(iTime54);
    long long56 = server48.getLastUpdate();
    tp2.IP iP57 = null;
    boolean b58 = server48.addBan(iP57);
    tp2.IP iP59 = null;
    boolean b60 = server48.addBan(iP59);
    tp2.Server server61 = new tp2.Server();
    tp2.ITime iTime62 = server61.getTime();
    server61.update();
    tp2.ITime iTime64 = server61.getTime();
    tp2.Server server65 = new tp2.Server();
    long long66 = server65.getLastUpdate();
    tp2.ITime iTime67 = server65.getTime();
    server61.setTime(iTime67);
    tp2.IP iP69 = null;
    boolean b70 = server61.addBan(iP69);
    long long71 = server61.getLastUpdate();
    tp2.ITime iTime72 = server61.getTime();
    server48.setTime(iTime72);
    server0.setTime(iTime72);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Server [lastUpdate=0, exceptions=(), bans={}]"+ "'", str11.equals("Server [lastUpdate=0, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long14 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "Server [lastUpdate=1465509741277, exceptions=(), bans={}]"+ "'", str21.equals("Server [lastUpdate=1465509741277, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long23 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long53 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long56 == 1465509741279L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b58 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b60 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime62);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime64);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long66 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime67);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b70 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long71 == 1465509741280L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime72);

  }

  @Test
  public void test116() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test116"); }


    tp2.Server server0 = new tp2.Server();
    tp2.IP iP1 = null;
    boolean b2 = server0.addBan(iP1);
    tp2.IP iP3 = null;
    boolean b4 = server0.removeException(iP3);
    tp2.IP iP5 = null;
    boolean b6 = server0.removeException(iP5);
    tp2.IP iP7 = null;
    boolean b8 = server0.addBan(iP7);
    server0.update();
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
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);

  }

  @Test
  public void test117() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test117"); }


    tp2.Server server0 = new tp2.Server();
    tp2.ITime iTime1 = server0.getTime();
    server0.update();
    tp2.ITime iTime3 = server0.getTime();
    tp2.Server server4 = new tp2.Server();
    long long5 = server4.getLastUpdate();
    tp2.ITime iTime6 = server4.getTime();
    server0.setTime(iTime6);
    tp2.ITime iTime8 = server0.getTime();
    tp2.IP iP9 = null;
    boolean b10 = server0.connect(iP9);
    tp2.IP iP11 = null;
    boolean b12 = server0.removeBan(iP11);
    tp2.IP iP13 = null;
    boolean b14 = server0.connect(iP13);
    tp2.IP iP15 = null;
    boolean b16 = server0.removeException(iP15);
    tp2.IP iP17 = null;
    boolean b18 = server0.addBan(iP17);
    server0.update();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long5 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);

  }

  @Test
  public void test118() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test118"); }


    tp2.Server server0 = new tp2.Server();
    tp2.ITime iTime1 = server0.getTime();
    server0.update();
    tp2.Server server3 = new tp2.Server();
    tp2.ITime iTime4 = server3.getTime();
    tp2.IP iP5 = null;
    boolean b6 = server3.removeException(iP5);
    tp2.IP iP7 = null;
    boolean b8 = server3.connect(iP7);
    tp2.IP iP9 = null;
    boolean b10 = server3.removeException(iP9);
    tp2.IP iP11 = null;
    boolean b12 = server3.connect(iP11);
    tp2.IP iP13 = null;
    boolean b14 = server3.removeException(iP13);
    tp2.Server server15 = new tp2.Server();
    tp2.ITime iTime16 = server15.getTime();
    server15.update();
    tp2.ITime iTime18 = server15.getTime();
    server3.setTime(iTime18);
    tp2.Server server20 = new tp2.Server();
    tp2.ITime iTime21 = server20.getTime();
    server20.update();
    tp2.ITime iTime23 = server20.getTime();
    server3.setTime(iTime23);
    server0.setTime(iTime23);
    long long26 = server0.getLastUpdate();
    tp2.ITime iTime27 = server0.getTime();
    tp2.IP iP28 = null;
    boolean b29 = server0.removeException(iP28);
    server0.update();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long26 == 1465509741331L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == false);

  }

  @Test
  public void test119() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test119"); }


    tp2.Server server0 = new tp2.Server();
    tp2.ITime iTime1 = server0.getTime();
    tp2.IP iP2 = null;
    boolean b3 = server0.connect(iP2);
    java.lang.String str4 = server0.toString();
    tp2.ITime iTime5 = server0.getTime();
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
    org.junit.Assert.assertNotNull(iTime1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Server [lastUpdate=0, exceptions=(), bans={}]"+ "'", str4.equals("Server [lastUpdate=0, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime5);

  }

  @Test
  public void test120() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test120"); }


    tp2.Server server0 = new tp2.Server();
    tp2.ITime iTime1 = server0.getTime();
    long long2 = server0.getLastUpdate();
    server0.update();
    tp2.IP iP4 = null;
    boolean b5 = server0.removeBan(iP4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long2 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);

  }

  @Test
  public void test121() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test121"); }


    tp2.Server server0 = new tp2.Server();
    tp2.ITime iTime1 = server0.getTime();
    tp2.Server server2 = new tp2.Server();
    tp2.ITime iTime3 = server2.getTime();
    server0.setTime(iTime3);
    tp2.ITime iTime5 = server0.getTime();
    tp2.IP iP6 = null;
    boolean b7 = server0.addBan(iP6);
    tp2.IP iP8 = null;
    boolean b9 = server0.addBan(iP8);
    tp2.ITime iTime10 = server0.getTime();
    tp2.ITime iTime11 = server0.getTime();
    tp2.Server server12 = new tp2.Server();
    tp2.ITime iTime13 = server12.getTime();
    tp2.Server server14 = new tp2.Server();
    tp2.ITime iTime15 = server14.getTime();
    server12.setTime(iTime15);
    java.lang.String str17 = server12.toString();
    tp2.ITime iTime18 = server12.getTime();
    tp2.IP iP19 = null;
    boolean b20 = server12.addBan(iP19);
    tp2.ITime iTime21 = server12.getTime();
    server0.setTime(iTime21);
    tp2.ITime iTime23 = server0.getTime();
    server0.update();
    tp2.IP iP25 = null;
    boolean b26 = server0.connect(iP25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "Server [lastUpdate=0, exceptions=(), bans={}]"+ "'", str17.equals("Server [lastUpdate=0, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == true);

  }

  @Test
  public void test122() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test122"); }


    tp2.Server server0 = new tp2.Server();
    tp2.ITime iTime1 = server0.getTime();
    tp2.Server server2 = new tp2.Server();
    tp2.ITime iTime3 = server2.getTime();
    server0.setTime(iTime3);
    tp2.ITime iTime5 = server0.getTime();
    java.lang.String str6 = server0.toString();
    java.lang.String str7 = server0.toString();
    long long8 = server0.getLastUpdate();
    server0.update();
    tp2.IP iP10 = null;
    boolean b11 = server0.removeException(iP10);
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
    org.junit.Assert.assertNotNull(iTime1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Server [lastUpdate=0, exceptions=(), bans={}]"+ "'", str6.equals("Server [lastUpdate=0, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Server [lastUpdate=0, exceptions=(), bans={}]"+ "'", str7.equals("Server [lastUpdate=0, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long8 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);

  }

  @Test
  public void test123() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test123"); }


    tp2.Server server0 = new tp2.Server();
    long long1 = server0.getLastUpdate();
    tp2.ITime iTime2 = server0.getTime();
    tp2.IP iP3 = null;
    boolean b4 = server0.removeException(iP3);
    tp2.Server server5 = new tp2.Server();
    tp2.ITime iTime6 = server5.getTime();
    tp2.IP iP7 = null;
    boolean b8 = server5.removeException(iP7);
    tp2.IP iP9 = null;
    boolean b10 = server5.connect(iP9);
    tp2.IP iP11 = null;
    boolean b12 = server5.removeException(iP11);
    tp2.IP iP13 = null;
    boolean b14 = server5.connect(iP13);
    tp2.IP iP15 = null;
    boolean b16 = server5.removeException(iP15);
    tp2.Server server17 = new tp2.Server();
    tp2.ITime iTime18 = server17.getTime();
    server17.update();
    tp2.ITime iTime20 = server17.getTime();
    server5.setTime(iTime20);
    server0.setTime(iTime20);
    long long23 = server0.getLastUpdate();
    server0.update();
    long long25 = server0.getLastUpdate();
    tp2.IP iP26 = null;
    boolean b27 = server0.removeException(iP26);
    long long28 = server0.getLastUpdate();
    server0.update();
    tp2.IP iP30 = null;
    boolean b31 = server0.connect(iP30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long23 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long25 == 1465509741373L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long28 == 1465509741373L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == true);

  }

  @Test
  public void test124() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test124"); }


    tp2.Server server0 = new tp2.Server();
    tp2.ITime iTime1 = server0.getTime();
    tp2.IP iP2 = null;
    boolean b3 = server0.removeException(iP2);
    tp2.IP iP4 = null;
    boolean b5 = server0.connect(iP4);
    tp2.IP iP6 = null;
    boolean b7 = server0.removeException(iP6);
    tp2.IP iP8 = null;
    boolean b9 = server0.connect(iP8);
    tp2.IP iP10 = null;
    boolean b11 = server0.removeException(iP10);
    tp2.IP iP12 = null;
    boolean b13 = server0.removeBan(iP12);
    tp2.ITime iTime14 = server0.getTime();
    tp2.IP iP15 = null;
    boolean b16 = server0.removeBan(iP15);
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
    org.junit.Assert.assertNotNull(iTime1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);

  }

  @Test
  public void test125() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test125"); }


    tp2.Server server0 = new tp2.Server();
    tp2.ITime iTime1 = server0.getTime();
    tp2.Server server2 = new tp2.Server();
    tp2.ITime iTime3 = server2.getTime();
    server0.setTime(iTime3);
    server0.update();
    server0.update();
    tp2.Server server7 = new tp2.Server();
    tp2.ITime iTime8 = server7.getTime();
    tp2.Server server9 = new tp2.Server();
    tp2.ITime iTime10 = server9.getTime();
    server7.setTime(iTime10);
    tp2.ITime iTime12 = server7.getTime();
    tp2.IP iP13 = null;
    boolean b14 = server7.addBan(iP13);
    tp2.Server server15 = new tp2.Server();
    tp2.ITime iTime16 = server15.getTime();
    tp2.ITime iTime17 = server15.getTime();
    server7.setTime(iTime17);
    server0.setTime(iTime17);
    long long20 = server0.getLastUpdate();
    tp2.Server server21 = new tp2.Server();
    tp2.ITime iTime22 = server21.getTime();
    server21.update();
    tp2.ITime iTime24 = server21.getTime();
    tp2.IP iP25 = null;
    boolean b26 = server21.removeBan(iP25);
    long long27 = server21.getLastUpdate();
    tp2.IP iP28 = null;
    boolean b29 = server21.addBan(iP28);
    tp2.IP iP30 = null;
    boolean b31 = server21.removeException(iP30);
    tp2.Server server32 = new tp2.Server();
    tp2.ITime iTime33 = server32.getTime();
    tp2.Server server34 = new tp2.Server();
    tp2.ITime iTime35 = server34.getTime();
    server32.setTime(iTime35);
    tp2.ITime iTime37 = server32.getTime();
    tp2.IP iP38 = null;
    boolean b39 = server32.addBan(iP38);
    tp2.IP iP40 = null;
    boolean b41 = server32.addBan(iP40);
    tp2.Server server42 = new tp2.Server();
    tp2.ITime iTime43 = server42.getTime();
    tp2.IP iP44 = null;
    boolean b45 = server42.removeException(iP44);
    tp2.ITime iTime46 = server42.getTime();
    tp2.ITime iTime47 = server42.getTime();
    server32.setTime(iTime47);
    tp2.Server server49 = new tp2.Server();
    long long50 = server49.getLastUpdate();
    server49.update();
    tp2.IP iP52 = null;
    boolean b53 = server49.removeException(iP52);
    server49.update();
    java.lang.String str55 = server49.toString();
    tp2.IP iP56 = null;
    boolean b57 = server49.removeBan(iP56);
    tp2.IP iP58 = null;
    boolean b59 = server49.connect(iP58);
    tp2.ITime iTime60 = server49.getTime();
    server32.setTime(iTime60);
    server21.setTime(iTime60);
    server0.setTime(iTime60);
    server0.update();
    tp2.IP iP65 = null;
    boolean b66 = server0.connect(iP65);
    tp2.IP iP67 = null;
    boolean b68 = server0.removeBan(iP67);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long20 == 1465509741378L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long27 == 1465509741379L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long50 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b53 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str55 + "' != '" + "Server [lastUpdate=1465509741380, exceptions=(), bans={}]"+ "'", str55.equals("Server [lastUpdate=1465509741380, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b57 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b59 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime60);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b66 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b68 == false);

  }

  @Test
  public void test126() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test126"); }


    tp2.Server server0 = new tp2.Server();
    tp2.ITime iTime1 = server0.getTime();
    tp2.ITime iTime2 = server0.getTime();
    tp2.IP iP3 = null;
    boolean b4 = server0.connect(iP3);
    tp2.IP iP5 = null;
    boolean b6 = server0.addBan(iP5);
    server0.update();
    server0.update();
    tp2.IP iP9 = null;
    boolean b10 = server0.removeException(iP9);
    tp2.IP iP11 = null;
    boolean b12 = server0.removeException(iP11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);

  }

  @Test
  public void test127() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test127"); }


    tp2.Server server0 = new tp2.Server();
    long long1 = server0.getLastUpdate();
    server0.update();
    tp2.IP iP3 = null;
    boolean b4 = server0.removeBan(iP3);
    long long5 = server0.getLastUpdate();
    server0.update();
    tp2.ITime iTime7 = server0.getTime();
    tp2.IP iP8 = null;
    boolean b9 = server0.connect(iP8);
    tp2.IP iP10 = null;
    boolean b11 = server0.removeException(iP10);
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
    org.junit.Assert.assertTrue(long1 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long5 == 1465509741419L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);

  }

  @Test
  public void test128() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test128"); }


    tp2.Server server0 = new tp2.Server();
    tp2.ITime iTime1 = server0.getTime();
    long long2 = server0.getLastUpdate();
    long long3 = server0.getLastUpdate();
    server0.update();
    tp2.IP iP5 = null;
    boolean b6 = server0.removeBan(iP5);
    tp2.IP iP7 = null;
    boolean b8 = server0.connect(iP7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long2 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long3 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);

  }

  @Test
  public void test129() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test129"); }


    tp2.Server server0 = new tp2.Server();
    tp2.ITime iTime1 = server0.getTime();
    tp2.Server server2 = new tp2.Server();
    tp2.ITime iTime3 = server2.getTime();
    server0.setTime(iTime3);
    server0.update();
    java.lang.String str6 = server0.toString();
    java.lang.String str7 = server0.toString();
    tp2.IP iP8 = null;
    boolean b9 = server0.removeException(iP8);
    java.lang.String str10 = server0.toString();
    tp2.Server server11 = new tp2.Server();
    tp2.ITime iTime12 = server11.getTime();
    server11.update();
    tp2.ITime iTime14 = server11.getTime();
    tp2.Server server15 = new tp2.Server();
    long long16 = server15.getLastUpdate();
    tp2.ITime iTime17 = server15.getTime();
    server11.setTime(iTime17);
    tp2.ITime iTime19 = server11.getTime();
    server0.setTime(iTime19);
    server0.update();
    long long22 = server0.getLastUpdate();
    tp2.Server server23 = new tp2.Server();
    tp2.ITime iTime24 = server23.getTime();
    server23.update();
    tp2.ITime iTime26 = server23.getTime();
    tp2.IP iP27 = null;
    boolean b28 = server23.connect(iP27);
    tp2.Server server29 = new tp2.Server();
    tp2.ITime iTime30 = server29.getTime();
    server29.update();
    tp2.ITime iTime32 = server29.getTime();
    tp2.IP iP33 = null;
    boolean b34 = server29.connect(iP33);
    tp2.ITime iTime35 = server29.getTime();
    server23.setTime(iTime35);
    server0.setTime(iTime35);
    server0.update();
    tp2.Server server39 = new tp2.Server();
    tp2.ITime iTime40 = server39.getTime();
    long long41 = server39.getLastUpdate();
    java.lang.String str42 = server39.toString();
    tp2.ITime iTime43 = server39.getTime();
    server0.setTime(iTime43);
    tp2.IP iP45 = null;
    boolean b46 = server0.removeBan(iP45);
    tp2.Server server47 = new tp2.Server();
    tp2.ITime iTime48 = server47.getTime();
    tp2.Server server49 = new tp2.Server();
    tp2.ITime iTime50 = server49.getTime();
    server47.setTime(iTime50);
    server47.update();
    tp2.IP iP53 = null;
    boolean b54 = server47.removeBan(iP53);
    tp2.IP iP55 = null;
    boolean b56 = server47.removeException(iP55);
    tp2.IP iP57 = null;
    boolean b58 = server47.connect(iP57);
    tp2.IP iP59 = null;
    boolean b60 = server47.removeBan(iP59);
    server47.update();
    tp2.IP iP62 = null;
    boolean b63 = server47.connect(iP62);
    tp2.Server server64 = new tp2.Server();
    tp2.ITime iTime65 = server64.getTime();
    server64.update();
    tp2.Server server67 = new tp2.Server();
    long long68 = server67.getLastUpdate();
    tp2.ITime iTime69 = server67.getTime();
    server64.setTime(iTime69);
    long long71 = server64.getLastUpdate();
    tp2.Server server72 = new tp2.Server();
    tp2.ITime iTime73 = server72.getTime();
    tp2.Server server74 = new tp2.Server();
    tp2.ITime iTime75 = server74.getTime();
    server72.setTime(iTime75);
    tp2.ITime iTime77 = server72.getTime();
    tp2.IP iP78 = null;
    boolean b79 = server72.addBan(iP78);
    tp2.Server server80 = new tp2.Server();
    tp2.ITime iTime81 = server80.getTime();
    tp2.ITime iTime82 = server80.getTime();
    server72.setTime(iTime82);
    server64.setTime(iTime82);
    server47.setTime(iTime82);
    server0.setTime(iTime82);
    tp2.IP iP87 = null;
    boolean b88 = server0.connect(iP87);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Server [lastUpdate=1465509741422, exceptions=(), bans={}]"+ "'", str6.equals("Server [lastUpdate=1465509741422, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Server [lastUpdate=1465509741422, exceptions=(), bans={}]"+ "'", str7.equals("Server [lastUpdate=1465509741422, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Server [lastUpdate=1465509741422, exceptions=(), bans={}]"+ "'", str10.equals("Server [lastUpdate=1465509741422, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long16 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long22 == 1465509741423L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long41 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str42 + "' != '" + "Server [lastUpdate=0, exceptions=(), bans={}]"+ "'", str42.equals("Server [lastUpdate=0, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b46 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b54 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b56 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b58 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b60 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b63 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime65);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long68 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime69);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long71 == 1465509741428L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime73);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime75);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime77);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b79 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime81);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime82);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b88 == true);

  }

  @Test
  public void test130() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test130"); }


    tp2.Server server0 = new tp2.Server();
    tp2.ITime iTime1 = server0.getTime();
    long long2 = server0.getLastUpdate();
    tp2.IP iP3 = null;
    boolean b4 = server0.addBan(iP3);
    server0.update();
    server0.update();
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
    org.junit.Assert.assertNotNull(iTime1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long2 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);

  }

  @Test
  public void test131() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test131"); }


    tp2.Server server0 = new tp2.Server();
    tp2.IP iP1 = null;
    boolean b2 = server0.addBan(iP1);
    tp2.IP iP3 = null;
    boolean b4 = server0.removeException(iP3);
    tp2.IP iP5 = null;
    boolean b6 = server0.removeBan(iP5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);

  }

  @Test
  public void test132() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test132"); }


    tp2.Server server0 = new tp2.Server();
    tp2.ITime iTime1 = server0.getTime();
    server0.update();
    tp2.ITime iTime3 = server0.getTime();
    tp2.IP iP4 = null;
    boolean b5 = server0.connect(iP4);
    tp2.ITime iTime6 = server0.getTime();
    java.lang.String str7 = server0.toString();
    java.lang.String str8 = server0.toString();
    tp2.IP iP9 = null;
    boolean b10 = server0.removeException(iP9);
    server0.update();
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
    org.junit.Assert.assertNotNull(iTime1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Server [lastUpdate=1465509741522, exceptions=(), bans={}]"+ "'", str7.equals("Server [lastUpdate=1465509741522, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Server [lastUpdate=1465509741522, exceptions=(), bans={}]"+ "'", str8.equals("Server [lastUpdate=1465509741522, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);

  }

  @Test
  public void test133() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test133"); }


    tp2.Server server0 = new tp2.Server();
    tp2.ITime iTime1 = server0.getTime();
    long long2 = server0.getLastUpdate();
    java.lang.String str3 = server0.toString();
    tp2.ITime iTime4 = server0.getTime();
    tp2.IP iP5 = null;
    boolean b6 = server0.removeBan(iP5);
    tp2.IP iP7 = null;
    boolean b8 = server0.removeBan(iP7);
    java.lang.String str9 = server0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long2 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Server [lastUpdate=0, exceptions=(), bans={}]"+ "'", str3.equals("Server [lastUpdate=0, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Server [lastUpdate=0, exceptions=(), bans={}]"+ "'", str9.equals("Server [lastUpdate=0, exceptions=(), bans={}]"));

  }

  @Test
  public void test134() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test134"); }


    tp2.Server server0 = new tp2.Server();
    tp2.ITime iTime1 = server0.getTime();
    tp2.Server server2 = new tp2.Server();
    tp2.ITime iTime3 = server2.getTime();
    server0.setTime(iTime3);
    server0.update();
    server0.update();
    tp2.Server server7 = new tp2.Server();
    tp2.ITime iTime8 = server7.getTime();
    tp2.Server server9 = new tp2.Server();
    tp2.ITime iTime10 = server9.getTime();
    server7.setTime(iTime10);
    tp2.ITime iTime12 = server7.getTime();
    tp2.IP iP13 = null;
    boolean b14 = server7.addBan(iP13);
    tp2.Server server15 = new tp2.Server();
    tp2.ITime iTime16 = server15.getTime();
    tp2.ITime iTime17 = server15.getTime();
    server7.setTime(iTime17);
    server0.setTime(iTime17);
    long long20 = server0.getLastUpdate();
    tp2.IP iP21 = null;
    boolean b22 = server0.connect(iP21);
    java.lang.String str23 = server0.toString();
    long long24 = server0.getLastUpdate();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long20 == 1465509741525L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + "Server [lastUpdate=1465509741525, exceptions=(), bans={}]"+ "'", str23.equals("Server [lastUpdate=1465509741525, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long24 == 1465509741525L);

  }

  @Test
  public void test135() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test135"); }


    tp2.Server server0 = new tp2.Server();
    long long1 = server0.getLastUpdate();
    server0.update();
    tp2.IP iP3 = null;
    boolean b4 = server0.removeBan(iP3);
    long long5 = server0.getLastUpdate();
    server0.update();
    server0.update();
    tp2.Server server8 = new tp2.Server();
    tp2.ITime iTime9 = server8.getTime();
    server8.update();
    tp2.ITime iTime11 = server8.getTime();
    long long12 = server8.getLastUpdate();
    long long13 = server8.getLastUpdate();
    tp2.Server server14 = new tp2.Server();
    tp2.ITime iTime15 = server14.getTime();
    tp2.IP iP16 = null;
    boolean b17 = server14.removeException(iP16);
    tp2.IP iP18 = null;
    boolean b19 = server14.connect(iP18);
    tp2.IP iP20 = null;
    boolean b21 = server14.removeException(iP20);
    tp2.IP iP22 = null;
    boolean b23 = server14.connect(iP22);
    tp2.IP iP24 = null;
    boolean b25 = server14.removeException(iP24);
    tp2.Server server26 = new tp2.Server();
    tp2.ITime iTime27 = server26.getTime();
    server26.update();
    tp2.ITime iTime29 = server26.getTime();
    server14.setTime(iTime29);
    server8.setTime(iTime29);
    server0.setTime(iTime29);
    tp2.Server server33 = new tp2.Server();
    tp2.ITime iTime34 = server33.getTime();
    tp2.IP iP35 = null;
    boolean b36 = server33.removeException(iP35);
    tp2.IP iP37 = null;
    boolean b38 = server33.connect(iP37);
    tp2.IP iP39 = null;
    boolean b40 = server33.removeException(iP39);
    tp2.IP iP41 = null;
    boolean b42 = server33.connect(iP41);
    tp2.IP iP43 = null;
    boolean b44 = server33.removeException(iP43);
    long long45 = server33.getLastUpdate();
    tp2.ITime iTime46 = server33.getTime();
    tp2.IP iP47 = null;
    boolean b48 = server33.connect(iP47);
    tp2.IP iP49 = null;
    boolean b50 = server33.removeBan(iP49);
    tp2.ITime iTime51 = server33.getTime();
    tp2.ITime iTime52 = server33.getTime();
    server0.setTime(iTime52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long5 == 1465509741538L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long12 == 1465509741538L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long13 == 1465509741538L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long45 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b48 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b50 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime52);

  }

  @Test
  public void test136() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test136"); }


    tp2.Server server0 = new tp2.Server();
    tp2.ITime iTime1 = server0.getTime();
    server0.update();
    tp2.Server server3 = new tp2.Server();
    tp2.ITime iTime4 = server3.getTime();
    tp2.IP iP5 = null;
    boolean b6 = server3.removeException(iP5);
    tp2.IP iP7 = null;
    boolean b8 = server3.connect(iP7);
    tp2.IP iP9 = null;
    boolean b10 = server3.removeException(iP9);
    tp2.IP iP11 = null;
    boolean b12 = server3.connect(iP11);
    tp2.IP iP13 = null;
    boolean b14 = server3.removeException(iP13);
    tp2.Server server15 = new tp2.Server();
    tp2.ITime iTime16 = server15.getTime();
    server15.update();
    tp2.ITime iTime18 = server15.getTime();
    server3.setTime(iTime18);
    tp2.Server server20 = new tp2.Server();
    tp2.ITime iTime21 = server20.getTime();
    server20.update();
    tp2.ITime iTime23 = server20.getTime();
    server3.setTime(iTime23);
    server0.setTime(iTime23);
    long long26 = server0.getLastUpdate();
    tp2.IP iP27 = null;
    boolean b28 = server0.connect(iP27);
    tp2.Server server29 = new tp2.Server();
    tp2.ITime iTime30 = server29.getTime();
    server29.update();
    tp2.Server server32 = new tp2.Server();
    long long33 = server32.getLastUpdate();
    tp2.ITime iTime34 = server32.getTime();
    server29.setTime(iTime34);
    long long36 = server29.getLastUpdate();
    tp2.Server server37 = new tp2.Server();
    tp2.ITime iTime38 = server37.getTime();
    tp2.Server server39 = new tp2.Server();
    tp2.ITime iTime40 = server39.getTime();
    server37.setTime(iTime40);
    tp2.ITime iTime42 = server37.getTime();
    tp2.IP iP43 = null;
    boolean b44 = server37.addBan(iP43);
    tp2.Server server45 = new tp2.Server();
    tp2.ITime iTime46 = server45.getTime();
    tp2.ITime iTime47 = server45.getTime();
    server37.setTime(iTime47);
    server29.setTime(iTime47);
    server0.setTime(iTime47);
    tp2.IP iP51 = null;
    boolean b52 = server0.connect(iP51);
    java.lang.String str53 = server0.toString();
    tp2.IP iP54 = null;
    boolean b55 = server0.removeException(iP54);
    tp2.IP iP56 = null;
    boolean b57 = server0.removeBan(iP56);
    tp2.IP iP58 = null;
    // The following exception was thrown during execution in test generation
    try {
      boolean b59 = server0.addException(iP58);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long26 == 1465509741557L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long33 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long36 == 1465509741558L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b52 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str53 + "' != '" + "Server [lastUpdate=1465509741557, exceptions=(), bans={}]"+ "'", str53.equals("Server [lastUpdate=1465509741557, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b55 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b57 == false);

  }

  @Test
  public void test137() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test137"); }


    tp2.Server server0 = new tp2.Server();
    tp2.ITime iTime1 = server0.getTime();
    tp2.IP iP2 = null;
    boolean b3 = server0.removeException(iP2);
    tp2.IP iP4 = null;
    boolean b5 = server0.connect(iP4);
    tp2.IP iP6 = null;
    boolean b7 = server0.removeException(iP6);
    tp2.IP iP8 = null;
    boolean b9 = server0.connect(iP8);
    tp2.IP iP10 = null;
    boolean b11 = server0.removeException(iP10);
    tp2.IP iP12 = null;
    boolean b13 = server0.removeBan(iP12);
    tp2.ITime iTime14 = server0.getTime();
    tp2.IP iP15 = null;
    boolean b16 = server0.removeBan(iP15);
    java.lang.String str17 = server0.toString();
    server0.update();
    tp2.IP iP19 = null;
    boolean b20 = server0.removeException(iP19);
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
    org.junit.Assert.assertNotNull(iTime1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "Server [lastUpdate=0, exceptions=(), bans={}]"+ "'", str17.equals("Server [lastUpdate=0, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);

  }

  @Test
  public void test138() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test138"); }


    tp2.Server server0 = new tp2.Server();
    tp2.ITime iTime1 = server0.getTime();
    tp2.Server server2 = new tp2.Server();
    tp2.ITime iTime3 = server2.getTime();
    server0.setTime(iTime3);
    server0.update();
    java.lang.String str6 = server0.toString();
    tp2.IP iP7 = null;
    boolean b8 = server0.removeException(iP7);
    server0.update();
    tp2.IP iP10 = null;
    boolean b11 = server0.removeException(iP10);
    long long12 = server0.getLastUpdate();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Server [lastUpdate=1465509741583, exceptions=(), bans={}]"+ "'", str6.equals("Server [lastUpdate=1465509741583, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long12 == 1465509741583L);

  }

  @Test
  public void test139() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test139"); }


    tp2.Server server0 = new tp2.Server();
    long long1 = server0.getLastUpdate();
    tp2.ITime iTime2 = server0.getTime();
    tp2.ITime iTime3 = server0.getTime();
    tp2.IP iP4 = null;
    boolean b5 = server0.removeBan(iP4);
    tp2.IP iP6 = null;
    boolean b7 = server0.removeException(iP6);
    long long8 = server0.getLastUpdate();
    server0.update();
    server0.update();
    tp2.IP iP11 = null;
    boolean b12 = server0.removeException(iP11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long8 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);

  }

  @Test
  public void test140() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test140"); }


    tp2.Server server0 = new tp2.Server();
    tp2.ITime iTime1 = server0.getTime();
    long long2 = server0.getLastUpdate();
    long long3 = server0.getLastUpdate();
    server0.update();
    server0.update();
    server0.update();
    tp2.ITime iTime7 = server0.getTime();
    tp2.ITime iTime8 = server0.getTime();
    tp2.IP iP9 = null;
    boolean b10 = server0.connect(iP9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long2 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long3 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);

  }

  @Test
  public void test141() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test141"); }


    tp2.Server server0 = new tp2.Server();
    tp2.ITime iTime1 = server0.getTime();
    tp2.IP iP2 = null;
    boolean b3 = server0.removeException(iP2);
    tp2.IP iP4 = null;
    boolean b5 = server0.connect(iP4);
    tp2.IP iP6 = null;
    boolean b7 = server0.removeException(iP6);
    tp2.IP iP8 = null;
    boolean b9 = server0.connect(iP8);
    tp2.IP iP10 = null;
    boolean b11 = server0.removeException(iP10);
    tp2.Server server12 = new tp2.Server();
    tp2.ITime iTime13 = server12.getTime();
    server12.update();
    tp2.ITime iTime15 = server12.getTime();
    server0.setTime(iTime15);
    tp2.Server server17 = new tp2.Server();
    tp2.ITime iTime18 = server17.getTime();
    server17.update();
    tp2.ITime iTime20 = server17.getTime();
    server0.setTime(iTime20);
    tp2.IP iP22 = null;
    boolean b23 = server0.addBan(iP22);
    long long24 = server0.getLastUpdate();
    tp2.IP iP25 = null;
    boolean b26 = server0.removeException(iP25);
    tp2.IP iP27 = null;
    boolean b28 = server0.removeException(iP27);
    java.lang.String str29 = server0.toString();
    tp2.ITime iTime30 = server0.getTime();
    tp2.Server server31 = new tp2.Server();
    long long32 = server31.getLastUpdate();
    server31.update();
    tp2.IP iP34 = null;
    boolean b35 = server31.removeBan(iP34);
    long long36 = server31.getLastUpdate();
    tp2.Server server37 = new tp2.Server();
    tp2.ITime iTime38 = server37.getTime();
    tp2.IP iP39 = null;
    boolean b40 = server37.removeException(iP39);
    tp2.ITime iTime41 = server37.getTime();
    tp2.ITime iTime42 = server37.getTime();
    server31.setTime(iTime42);
    java.lang.String str44 = server31.toString();
    long long45 = server31.getLastUpdate();
    tp2.IP iP46 = null;
    boolean b47 = server31.removeBan(iP46);
    tp2.Server server48 = new tp2.Server();
    tp2.ITime iTime49 = server48.getTime();
    tp2.Server server50 = new tp2.Server();
    tp2.ITime iTime51 = server50.getTime();
    server48.setTime(iTime51);
    server48.update();
    java.lang.String str54 = server48.toString();
    java.lang.String str55 = server48.toString();
    tp2.IP iP56 = null;
    boolean b57 = server48.removeException(iP56);
    java.lang.String str58 = server48.toString();
    tp2.Server server59 = new tp2.Server();
    tp2.ITime iTime60 = server59.getTime();
    server59.update();
    tp2.ITime iTime62 = server59.getTime();
    tp2.Server server63 = new tp2.Server();
    long long64 = server63.getLastUpdate();
    tp2.ITime iTime65 = server63.getTime();
    server59.setTime(iTime65);
    tp2.ITime iTime67 = server59.getTime();
    server48.setTime(iTime67);
    server48.update();
    long long70 = server48.getLastUpdate();
    tp2.Server server71 = new tp2.Server();
    tp2.ITime iTime72 = server71.getTime();
    server71.update();
    tp2.ITime iTime74 = server71.getTime();
    tp2.IP iP75 = null;
    boolean b76 = server71.connect(iP75);
    tp2.Server server77 = new tp2.Server();
    tp2.ITime iTime78 = server77.getTime();
    server77.update();
    tp2.ITime iTime80 = server77.getTime();
    tp2.IP iP81 = null;
    boolean b82 = server77.connect(iP81);
    tp2.ITime iTime83 = server77.getTime();
    server71.setTime(iTime83);
    server48.setTime(iTime83);
    server48.update();
    tp2.Server server87 = new tp2.Server();
    tp2.ITime iTime88 = server87.getTime();
    long long89 = server87.getLastUpdate();
    java.lang.String str90 = server87.toString();
    tp2.ITime iTime91 = server87.getTime();
    server48.setTime(iTime91);
    server31.setTime(iTime91);
    server0.setTime(iTime91);
    java.lang.String str95 = server0.toString();
    server0.update();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long24 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str29 + "' != '" + "Server [lastUpdate=0, exceptions=(), bans={}]"+ "'", str29.equals("Server [lastUpdate=0, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long32 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long36 == 1465509741592L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str44 + "' != '" + "Server [lastUpdate=1465509741592, exceptions=(), bans={}]"+ "'", str44.equals("Server [lastUpdate=1465509741592, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long45 == 1465509741592L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b47 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str54 + "' != '" + "Server [lastUpdate=1465509741593, exceptions=(), bans={}]"+ "'", str54.equals("Server [lastUpdate=1465509741593, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str55 + "' != '" + "Server [lastUpdate=1465509741593, exceptions=(), bans={}]"+ "'", str55.equals("Server [lastUpdate=1465509741593, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b57 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str58 + "' != '" + "Server [lastUpdate=1465509741593, exceptions=(), bans={}]"+ "'", str58.equals("Server [lastUpdate=1465509741593, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime60);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime62);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long64 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime65);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime67);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long70 == 1465509741595L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime72);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime74);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b76 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime78);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime80);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b82 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime83);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime88);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long89 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str90 + "' != '" + "Server [lastUpdate=0, exceptions=(), bans={}]"+ "'", str90.equals("Server [lastUpdate=0, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime91);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str95 + "' != '" + "Server [lastUpdate=0, exceptions=(), bans={}]"+ "'", str95.equals("Server [lastUpdate=0, exceptions=(), bans={}]"));

  }

  @Test
  public void test142() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test142"); }


    tp2.Server server0 = new tp2.Server();
    tp2.ITime iTime1 = server0.getTime();
    tp2.Server server2 = new tp2.Server();
    tp2.ITime iTime3 = server2.getTime();
    server0.setTime(iTime3);
    server0.update();
    tp2.IP iP6 = null;
    boolean b7 = server0.removeBan(iP6);
    tp2.IP iP8 = null;
    boolean b9 = server0.removeException(iP8);
    tp2.IP iP10 = null;
    boolean b11 = server0.connect(iP10);
    tp2.IP iP12 = null;
    boolean b13 = server0.removeBan(iP12);
    tp2.IP iP14 = null;
    boolean b15 = server0.removeBan(iP14);
    java.lang.String str16 = server0.toString();
    tp2.IP iP17 = null;
    boolean b18 = server0.addBan(iP17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "Server [lastUpdate=1465509741682, exceptions=(), bans={}]"+ "'", str16.equals("Server [lastUpdate=1465509741682, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);

  }

  @Test
  public void test143() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test143"); }


    tp2.Server server0 = new tp2.Server();
    tp2.ITime iTime1 = server0.getTime();
    long long2 = server0.getLastUpdate();
    tp2.IP iP3 = null;
    boolean b4 = server0.removeBan(iP3);
    tp2.Server server5 = new tp2.Server();
    tp2.ITime iTime6 = server5.getTime();
    server5.update();
    tp2.ITime iTime8 = server5.getTime();
    tp2.ITime iTime9 = server5.getTime();
    server0.setTime(iTime9);
    long long11 = server0.getLastUpdate();
    server0.update();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long2 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long11 == 0L);

  }

  @Test
  public void test144() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test144"); }


    tp2.Server server0 = new tp2.Server();
    tp2.ITime iTime1 = server0.getTime();
    tp2.Server server2 = new tp2.Server();
    tp2.ITime iTime3 = server2.getTime();
    server0.setTime(iTime3);
    tp2.ITime iTime5 = server0.getTime();
    tp2.IP iP6 = null;
    boolean b7 = server0.addBan(iP6);
    tp2.IP iP8 = null;
    boolean b9 = server0.addBan(iP8);
    tp2.ITime iTime10 = server0.getTime();
    tp2.ITime iTime11 = server0.getTime();
    server0.update();
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
    org.junit.Assert.assertNotNull(iTime1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime11);

  }

  @Test
  public void test145() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test145"); }


    tp2.Server server0 = new tp2.Server();
    tp2.ITime iTime1 = server0.getTime();
    tp2.Server server2 = new tp2.Server();
    tp2.ITime iTime3 = server2.getTime();
    server0.setTime(iTime3);
    java.lang.String str5 = server0.toString();
    long long6 = server0.getLastUpdate();
    tp2.IP iP7 = null;
    boolean b8 = server0.addBan(iP7);
    tp2.IP iP9 = null;
    boolean b10 = server0.addBan(iP9);
    tp2.IP iP11 = null;
    boolean b12 = server0.connect(iP11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Server [lastUpdate=0, exceptions=(), bans={}]"+ "'", str5.equals("Server [lastUpdate=0, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long6 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);

  }

  @Test
  public void test146() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test146"); }


    tp2.Server server0 = new tp2.Server();
    tp2.ITime iTime1 = server0.getTime();
    tp2.IP iP2 = null;
    boolean b3 = server0.removeException(iP2);
    tp2.IP iP4 = null;
    boolean b5 = server0.connect(iP4);
    tp2.IP iP6 = null;
    boolean b7 = server0.removeException(iP6);
    tp2.IP iP8 = null;
    boolean b9 = server0.connect(iP8);
    tp2.IP iP10 = null;
    boolean b11 = server0.removeException(iP10);
    tp2.IP iP12 = null;
    boolean b13 = server0.removeBan(iP12);
    server0.update();
    tp2.IP iP15 = null;
    boolean b16 = server0.connect(iP15);
    tp2.IP iP17 = null;
    boolean b18 = server0.removeException(iP17);
    java.lang.String str19 = server0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "Server [lastUpdate=1465509741694, exceptions=(), bans={}]"+ "'", str19.equals("Server [lastUpdate=1465509741694, exceptions=(), bans={}]"));

  }

  @Test
  public void test147() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test147"); }


    tp2.Server server0 = new tp2.Server();
    tp2.ITime iTime1 = server0.getTime();
    server0.update();
    tp2.ITime iTime3 = server0.getTime();
    long long4 = server0.getLastUpdate();
    long long5 = server0.getLastUpdate();
    long long6 = server0.getLastUpdate();
    java.lang.String str7 = server0.toString();
    tp2.IP iP8 = null;
    boolean b9 = server0.connect(iP8);
    long long10 = server0.getLastUpdate();
    long long11 = server0.getLastUpdate();
    tp2.IP iP12 = null;
    boolean b13 = server0.addBan(iP12);
    long long14 = server0.getLastUpdate();
    tp2.Server server15 = new tp2.Server();
    tp2.ITime iTime16 = server15.getTime();
    server15.update();
    tp2.ITime iTime18 = server15.getTime();
    tp2.Server server19 = new tp2.Server();
    long long20 = server19.getLastUpdate();
    tp2.ITime iTime21 = server19.getTime();
    server15.setTime(iTime21);
    tp2.ITime iTime23 = server15.getTime();
    server0.setTime(iTime23);
    server0.update();
    tp2.IP iP26 = null;
    boolean b27 = server0.removeException(iP26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long4 == 1465509741696L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long5 == 1465509741696L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long6 == 1465509741696L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Server [lastUpdate=1465509741696, exceptions=(), bans={}]"+ "'", str7.equals("Server [lastUpdate=1465509741696, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long10 == 1465509741696L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long11 == 1465509741696L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long14 == 1465509741696L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long20 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);

  }

  @Test
  public void test148() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test148"); }


    tp2.Server server0 = new tp2.Server();
    tp2.ITime iTime1 = server0.getTime();
    tp2.IP iP2 = null;
    boolean b3 = server0.removeException(iP2);
    java.lang.String str4 = server0.toString();
    java.lang.String str5 = server0.toString();
    long long6 = server0.getLastUpdate();
    tp2.IP iP7 = null;
    boolean b8 = server0.addBan(iP7);
    tp2.IP iP9 = null;
    boolean b10 = server0.removeBan(iP9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Server [lastUpdate=0, exceptions=(), bans={}]"+ "'", str4.equals("Server [lastUpdate=0, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Server [lastUpdate=0, exceptions=(), bans={}]"+ "'", str5.equals("Server [lastUpdate=0, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long6 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);

  }

  @Test
  public void test149() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test149"); }


    tp2.Server server0 = new tp2.Server();
    tp2.ITime iTime1 = server0.getTime();
    server0.update();
    tp2.IP iP3 = null;
    boolean b4 = server0.connect(iP3);
    tp2.IP iP5 = null;
    boolean b6 = server0.addBan(iP5);
    java.lang.String str7 = server0.toString();
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
    org.junit.Assert.assertNotNull(iTime1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Server [lastUpdate=1465509741710, exceptions=(), bans={}]"+ "'", str7.equals("Server [lastUpdate=1465509741710, exceptions=(), bans={}]"));

  }

  @Test
  public void test150() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test150"); }


    tp2.Server server0 = new tp2.Server();
    tp2.ITime iTime1 = server0.getTime();
    tp2.Server server2 = new tp2.Server();
    tp2.ITime iTime3 = server2.getTime();
    server0.setTime(iTime3);
    server0.update();
    server0.update();
    tp2.ITime iTime7 = server0.getTime();
    tp2.Server server8 = new tp2.Server();
    tp2.ITime iTime9 = server8.getTime();
    tp2.IP iP10 = null;
    boolean b11 = server8.removeException(iP10);
    tp2.IP iP12 = null;
    boolean b13 = server8.connect(iP12);
    tp2.IP iP14 = null;
    boolean b15 = server8.removeException(iP14);
    tp2.IP iP16 = null;
    boolean b17 = server8.connect(iP16);
    tp2.IP iP18 = null;
    boolean b19 = server8.removeException(iP18);
    tp2.Server server20 = new tp2.Server();
    tp2.ITime iTime21 = server20.getTime();
    server20.update();
    tp2.ITime iTime23 = server20.getTime();
    server8.setTime(iTime23);
    tp2.Server server25 = new tp2.Server();
    tp2.ITime iTime26 = server25.getTime();
    server25.update();
    tp2.ITime iTime28 = server25.getTime();
    server8.setTime(iTime28);
    server0.setTime(iTime28);
    tp2.IP iP31 = null;
    boolean b32 = server0.addBan(iP31);
    tp2.ITime iTime33 = server0.getTime();
    tp2.IP iP34 = null;
    boolean b35 = server0.removeException(iP34);
    java.lang.String str36 = server0.toString();
    long long37 = server0.getLastUpdate();
    java.lang.String str38 = server0.toString();
    tp2.IP iP39 = null;
    boolean b40 = server0.removeBan(iP39);
    tp2.IP iP41 = null;
    boolean b42 = server0.removeException(iP41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str36 + "' != '" + "Server [lastUpdate=1465509741711, exceptions=(), bans={}]"+ "'", str36.equals("Server [lastUpdate=1465509741711, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long37 == 1465509741711L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str38 + "' != '" + "Server [lastUpdate=1465509741711, exceptions=(), bans={}]"+ "'", str38.equals("Server [lastUpdate=1465509741711, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == false);

  }

  @Test
  public void test151() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test151"); }


    tp2.Server server0 = new tp2.Server();
    long long1 = server0.getLastUpdate();
    server0.update();
    tp2.IP iP3 = null;
    boolean b4 = server0.removeBan(iP3);
    long long5 = server0.getLastUpdate();
    tp2.Server server6 = new tp2.Server();
    tp2.ITime iTime7 = server6.getTime();
    tp2.IP iP8 = null;
    boolean b9 = server6.removeException(iP8);
    tp2.ITime iTime10 = server6.getTime();
    tp2.ITime iTime11 = server6.getTime();
    server0.setTime(iTime11);
    java.lang.String str13 = server0.toString();
    tp2.IP iP14 = null;
    boolean b15 = server0.addBan(iP14);
    tp2.Server server16 = new tp2.Server();
    long long17 = server16.getLastUpdate();
    tp2.ITime iTime18 = server16.getTime();
    tp2.IP iP19 = null;
    boolean b20 = server16.removeException(iP19);
    tp2.Server server21 = new tp2.Server();
    tp2.ITime iTime22 = server21.getTime();
    tp2.IP iP23 = null;
    boolean b24 = server21.removeException(iP23);
    tp2.IP iP25 = null;
    boolean b26 = server21.connect(iP25);
    tp2.IP iP27 = null;
    boolean b28 = server21.removeException(iP27);
    tp2.IP iP29 = null;
    boolean b30 = server21.connect(iP29);
    tp2.IP iP31 = null;
    boolean b32 = server21.removeException(iP31);
    tp2.Server server33 = new tp2.Server();
    tp2.ITime iTime34 = server33.getTime();
    server33.update();
    tp2.ITime iTime36 = server33.getTime();
    server21.setTime(iTime36);
    server16.setTime(iTime36);
    long long39 = server16.getLastUpdate();
    server16.update();
    long long41 = server16.getLastUpdate();
    tp2.IP iP42 = null;
    boolean b43 = server16.connect(iP42);
    tp2.ITime iTime44 = server16.getTime();
    server0.setTime(iTime44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long5 == 1465509741731L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Server [lastUpdate=1465509741731, exceptions=(), bans={}]"+ "'", str13.equals("Server [lastUpdate=1465509741731, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long17 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long39 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long41 == 1465509741733L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b43 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime44);

  }

  @Test
  public void test152() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test152"); }


    tp2.Server server0 = new tp2.Server();
    tp2.ITime iTime1 = server0.getTime();
    tp2.IP iP2 = null;
    boolean b3 = server0.removeException(iP2);
    tp2.IP iP4 = null;
    boolean b5 = server0.connect(iP4);
    tp2.IP iP6 = null;
    boolean b7 = server0.removeException(iP6);
    tp2.IP iP8 = null;
    boolean b9 = server0.connect(iP8);
    tp2.IP iP10 = null;
    boolean b11 = server0.removeException(iP10);
    long long12 = server0.getLastUpdate();
    java.lang.String str13 = server0.toString();
    tp2.Server server14 = new tp2.Server();
    tp2.ITime iTime15 = server14.getTime();
    tp2.Server server16 = new tp2.Server();
    tp2.ITime iTime17 = server16.getTime();
    server14.setTime(iTime17);
    server14.update();
    server14.update();
    tp2.ITime iTime21 = server14.getTime();
    server0.setTime(iTime21);
    java.lang.String str23 = server0.toString();
    tp2.IP iP24 = null;
    boolean b25 = server0.removeBan(iP24);
    server0.update();
    tp2.IP iP27 = null;
    boolean b28 = server0.addBan(iP27);
    tp2.Server server29 = new tp2.Server();
    long long30 = server29.getLastUpdate();
    tp2.ITime iTime31 = server29.getTime();
    tp2.ITime iTime32 = server29.getTime();
    server0.setTime(iTime32);
    tp2.IP iP34 = null;
    boolean b35 = server0.removeException(iP34);
    java.lang.String str36 = server0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long12 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Server [lastUpdate=0, exceptions=(), bans={}]"+ "'", str13.equals("Server [lastUpdate=0, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + "Server [lastUpdate=0, exceptions=(), bans={}]"+ "'", str23.equals("Server [lastUpdate=0, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long30 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str36 + "' != '" + "Server [lastUpdate=1465509741750, exceptions=(), bans={}]"+ "'", str36.equals("Server [lastUpdate=1465509741750, exceptions=(), bans={}]"));

  }

  @Test
  public void test153() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test153"); }


    tp2.Server server0 = new tp2.Server();
    tp2.ITime iTime1 = server0.getTime();
    tp2.Server server2 = new tp2.Server();
    tp2.ITime iTime3 = server2.getTime();
    server0.setTime(iTime3);
    server0.update();
    java.lang.String str6 = server0.toString();
    tp2.Server server7 = new tp2.Server();
    long long8 = server7.getLastUpdate();
    tp2.ITime iTime9 = server7.getTime();
    tp2.IP iP10 = null;
    boolean b11 = server7.removeException(iP10);
    tp2.Server server12 = new tp2.Server();
    tp2.ITime iTime13 = server12.getTime();
    tp2.IP iP14 = null;
    boolean b15 = server12.removeException(iP14);
    tp2.IP iP16 = null;
    boolean b17 = server12.connect(iP16);
    tp2.IP iP18 = null;
    boolean b19 = server12.removeException(iP18);
    tp2.IP iP20 = null;
    boolean b21 = server12.connect(iP20);
    tp2.IP iP22 = null;
    boolean b23 = server12.removeException(iP22);
    tp2.Server server24 = new tp2.Server();
    tp2.ITime iTime25 = server24.getTime();
    server24.update();
    tp2.ITime iTime27 = server24.getTime();
    server12.setTime(iTime27);
    server7.setTime(iTime27);
    server0.setTime(iTime27);
    tp2.IP iP31 = null;
    boolean b32 = server0.connect(iP31);
    long long33 = server0.getLastUpdate();
    server0.update();
    tp2.Server server35 = new tp2.Server();
    long long36 = server35.getLastUpdate();
    server35.update();
    tp2.IP iP38 = null;
    boolean b39 = server35.removeException(iP38);
    server35.update();
    java.lang.String str41 = server35.toString();
    tp2.IP iP42 = null;
    boolean b43 = server35.addBan(iP42);
    tp2.ITime iTime44 = server35.getTime();
    server0.setTime(iTime44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Server [lastUpdate=1465509741760, exceptions=(), bans={}]"+ "'", str6.equals("Server [lastUpdate=1465509741760, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long8 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long33 == 1465509741760L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long36 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str41 + "' != '" + "Server [lastUpdate=1465509741762, exceptions=(), bans={}]"+ "'", str41.equals("Server [lastUpdate=1465509741762, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b43 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime44);

  }

  @Test
  public void test154() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test154"); }


    tp2.Server server0 = new tp2.Server();
    tp2.ITime iTime1 = server0.getTime();
    server0.update();
    tp2.ITime iTime3 = server0.getTime();
    long long4 = server0.getLastUpdate();
    long long5 = server0.getLastUpdate();
    long long6 = server0.getLastUpdate();
    tp2.IP iP7 = null;
    boolean b8 = server0.removeException(iP7);
    long long9 = server0.getLastUpdate();
    tp2.ITime iTime10 = server0.getTime();
    long long11 = server0.getLastUpdate();
    tp2.ITime iTime12 = server0.getTime();
    tp2.IP iP13 = null;
    boolean b14 = server0.addBan(iP13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long4 == 1465509741785L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long5 == 1465509741785L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long6 == 1465509741785L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long9 == 1465509741785L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long11 == 1465509741785L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);

  }

  @Test
  public void test155() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test155"); }


    tp2.Server server0 = new tp2.Server();
    tp2.ITime iTime1 = server0.getTime();
    tp2.IP iP2 = null;
    boolean b3 = server0.removeException(iP2);
    tp2.IP iP4 = null;
    boolean b5 = server0.connect(iP4);
    tp2.IP iP6 = null;
    boolean b7 = server0.removeException(iP6);
    tp2.IP iP8 = null;
    boolean b9 = server0.connect(iP8);
    tp2.IP iP10 = null;
    boolean b11 = server0.removeException(iP10);
    tp2.Server server12 = new tp2.Server();
    tp2.ITime iTime13 = server12.getTime();
    server12.update();
    tp2.ITime iTime15 = server12.getTime();
    server0.setTime(iTime15);
    tp2.ITime iTime17 = server0.getTime();
    tp2.Server server18 = new tp2.Server();
    tp2.ITime iTime19 = server18.getTime();
    tp2.IP iP20 = null;
    boolean b21 = server18.removeException(iP20);
    tp2.IP iP22 = null;
    boolean b23 = server18.connect(iP22);
    tp2.IP iP24 = null;
    boolean b25 = server18.removeException(iP24);
    tp2.IP iP26 = null;
    boolean b27 = server18.connect(iP26);
    tp2.IP iP28 = null;
    boolean b29 = server18.removeException(iP28);
    long long30 = server18.getLastUpdate();
    java.lang.String str31 = server18.toString();
    tp2.Server server32 = new tp2.Server();
    tp2.ITime iTime33 = server32.getTime();
    tp2.Server server34 = new tp2.Server();
    tp2.ITime iTime35 = server34.getTime();
    server32.setTime(iTime35);
    server32.update();
    server32.update();
    tp2.ITime iTime39 = server32.getTime();
    server18.setTime(iTime39);
    long long41 = server18.getLastUpdate();
    tp2.ITime iTime42 = server18.getTime();
    server0.setTime(iTime42);
    tp2.Server server44 = new tp2.Server();
    tp2.ITime iTime45 = server44.getTime();
    tp2.IP iP46 = null;
    boolean b47 = server44.removeException(iP46);
    tp2.IP iP48 = null;
    boolean b49 = server44.connect(iP48);
    tp2.IP iP50 = null;
    boolean b51 = server44.removeException(iP50);
    tp2.IP iP52 = null;
    boolean b53 = server44.connect(iP52);
    tp2.IP iP54 = null;
    boolean b55 = server44.removeException(iP54);
    tp2.Server server56 = new tp2.Server();
    tp2.ITime iTime57 = server56.getTime();
    server56.update();
    tp2.ITime iTime59 = server56.getTime();
    server44.setTime(iTime59);
    tp2.IP iP61 = null;
    boolean b62 = server44.removeBan(iP61);
    java.lang.String str63 = server44.toString();
    long long64 = server44.getLastUpdate();
    tp2.ITime iTime65 = server44.getTime();
    server0.setTime(iTime65);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long30 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str31 + "' != '" + "Server [lastUpdate=0, exceptions=(), bans={}]"+ "'", str31.equals("Server [lastUpdate=0, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long41 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b47 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b49 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b51 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b53 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b55 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime59);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b62 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str63 + "' != '" + "Server [lastUpdate=0, exceptions=(), bans={}]"+ "'", str63.equals("Server [lastUpdate=0, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long64 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime65);

  }

  @Test
  public void test156() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test156"); }


    tp2.Server server0 = new tp2.Server();
    tp2.ITime iTime1 = server0.getTime();
    tp2.Server server2 = new tp2.Server();
    tp2.ITime iTime3 = server2.getTime();
    server0.setTime(iTime3);
    server0.update();
    tp2.IP iP6 = null;
    boolean b7 = server0.removeBan(iP6);
    tp2.IP iP8 = null;
    boolean b9 = server0.removeException(iP8);
    tp2.IP iP10 = null;
    boolean b11 = server0.connect(iP10);
    tp2.IP iP12 = null;
    boolean b13 = server0.removeBan(iP12);
    server0.update();
    tp2.IP iP15 = null;
    boolean b16 = server0.removeException(iP15);
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
    org.junit.Assert.assertNotNull(iTime1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);

  }

  @Test
  public void test157() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test157"); }


    tp2.Server server0 = new tp2.Server();
    tp2.ITime iTime1 = server0.getTime();
    tp2.Server server2 = new tp2.Server();
    tp2.ITime iTime3 = server2.getTime();
    server0.setTime(iTime3);
    java.lang.String str5 = server0.toString();
    tp2.IP iP6 = null;
    boolean b7 = server0.connect(iP6);
    tp2.IP iP8 = null;
    boolean b9 = server0.addBan(iP8);
    server0.update();
    tp2.IP iP11 = null;
    boolean b12 = server0.addBan(iP11);
    tp2.Server server13 = new tp2.Server();
    long long14 = server13.getLastUpdate();
    tp2.ITime iTime15 = server13.getTime();
    tp2.IP iP16 = null;
    boolean b17 = server13.removeException(iP16);
    tp2.Server server18 = new tp2.Server();
    tp2.ITime iTime19 = server18.getTime();
    tp2.IP iP20 = null;
    boolean b21 = server18.removeException(iP20);
    tp2.IP iP22 = null;
    boolean b23 = server18.connect(iP22);
    tp2.IP iP24 = null;
    boolean b25 = server18.removeException(iP24);
    tp2.IP iP26 = null;
    boolean b27 = server18.connect(iP26);
    tp2.IP iP28 = null;
    boolean b29 = server18.removeException(iP28);
    tp2.Server server30 = new tp2.Server();
    tp2.ITime iTime31 = server30.getTime();
    server30.update();
    tp2.ITime iTime33 = server30.getTime();
    server18.setTime(iTime33);
    server13.setTime(iTime33);
    long long36 = server13.getLastUpdate();
    server13.update();
    tp2.IP iP38 = null;
    boolean b39 = server13.removeException(iP38);
    tp2.ITime iTime40 = server13.getTime();
    server0.setTime(iTime40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Server [lastUpdate=0, exceptions=(), bans={}]"+ "'", str5.equals("Server [lastUpdate=0, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long14 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long36 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime40);

  }

  @Test
  public void test158() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test158"); }


    tp2.Server server0 = new tp2.Server();
    tp2.ITime iTime1 = server0.getTime();
    server0.update();
    tp2.ITime iTime3 = server0.getTime();
    tp2.IP iP4 = null;
    boolean b5 = server0.removeBan(iP4);
    long long6 = server0.getLastUpdate();
    tp2.IP iP7 = null;
    boolean b8 = server0.addBan(iP7);
    tp2.ITime iTime9 = server0.getTime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long6 == 1465509741822L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime9);

  }

  @Test
  public void test159() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test159"); }


    tp2.Server server0 = new tp2.Server();
    tp2.ITime iTime1 = server0.getTime();
    tp2.ITime iTime2 = server0.getTime();
    tp2.IP iP3 = null;
    boolean b4 = server0.connect(iP3);
    tp2.IP iP5 = null;
    boolean b6 = server0.addBan(iP5);
    tp2.IP iP7 = null;
    boolean b8 = server0.addBan(iP7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);

  }

  @Test
  public void test160() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test160"); }


    tp2.Server server0 = new tp2.Server();
    long long1 = server0.getLastUpdate();
    tp2.ITime iTime2 = server0.getTime();
    tp2.IP iP3 = null;
    boolean b4 = server0.removeException(iP3);
    tp2.IP iP5 = null;
    boolean b6 = server0.removeBan(iP5);
    tp2.IP iP7 = null;
    boolean b8 = server0.removeException(iP7);
    tp2.IP iP9 = null;
    boolean b10 = server0.addBan(iP9);
    server0.update();
    tp2.IP iP12 = null;
    boolean b13 = server0.addBan(iP12);
    tp2.ITime iTime14 = server0.getTime();
    tp2.IP iP15 = null;
    boolean b16 = server0.removeException(iP15);
    tp2.IP iP17 = null;
    boolean b18 = server0.removeBan(iP17);
    tp2.IP iP19 = null;
    boolean b20 = server0.removeException(iP19);
    tp2.Server server21 = new tp2.Server();
    tp2.ITime iTime22 = server21.getTime();
    server21.update();
    tp2.ITime iTime24 = server21.getTime();
    long long25 = server21.getLastUpdate();
    long long26 = server21.getLastUpdate();
    server21.update();
    tp2.ITime iTime28 = server21.getTime();
    server0.setTime(iTime28);
    long long30 = server0.getLastUpdate();
    java.lang.String str31 = server0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long25 == 1465509741826L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long26 == 1465509741826L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long30 == 1465509741825L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str31 + "' != '" + "Server [lastUpdate=1465509741825, exceptions=(), bans={}]"+ "'", str31.equals("Server [lastUpdate=1465509741825, exceptions=(), bans={}]"));

  }

  @Test
  public void test161() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test161"); }


    tp2.Server server0 = new tp2.Server();
    long long1 = server0.getLastUpdate();
    server0.update();
    tp2.IP iP3 = null;
    boolean b4 = server0.removeBan(iP3);
    tp2.ITime iTime5 = server0.getTime();
    tp2.IP iP6 = null;
    boolean b7 = server0.connect(iP6);
    tp2.Server server8 = new tp2.Server();
    tp2.ITime iTime9 = server8.getTime();
    server8.update();
    tp2.Server server11 = new tp2.Server();
    tp2.ITime iTime12 = server11.getTime();
    tp2.IP iP13 = null;
    boolean b14 = server11.removeException(iP13);
    tp2.IP iP15 = null;
    boolean b16 = server11.connect(iP15);
    tp2.IP iP17 = null;
    boolean b18 = server11.removeException(iP17);
    tp2.IP iP19 = null;
    boolean b20 = server11.connect(iP19);
    tp2.IP iP21 = null;
    boolean b22 = server11.removeException(iP21);
    tp2.Server server23 = new tp2.Server();
    tp2.ITime iTime24 = server23.getTime();
    server23.update();
    tp2.ITime iTime26 = server23.getTime();
    server11.setTime(iTime26);
    tp2.Server server28 = new tp2.Server();
    tp2.ITime iTime29 = server28.getTime();
    server28.update();
    tp2.ITime iTime31 = server28.getTime();
    server11.setTime(iTime31);
    server8.setTime(iTime31);
    long long34 = server8.getLastUpdate();
    tp2.IP iP35 = null;
    boolean b36 = server8.connect(iP35);
    tp2.Server server37 = new tp2.Server();
    tp2.ITime iTime38 = server37.getTime();
    tp2.IP iP39 = null;
    boolean b40 = server37.connect(iP39);
    tp2.ITime iTime41 = server37.getTime();
    server8.setTime(iTime41);
    server0.setTime(iTime41);
    long long44 = server0.getLastUpdate();
    tp2.IP iP45 = null;
    boolean b46 = server0.removeException(iP45);
    tp2.IP iP47 = null;
    boolean b48 = server0.removeException(iP47);
    tp2.IP iP49 = null;
    // The following exception was thrown during execution in test generation
    try {
      boolean b50 = server0.addException(iP49);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long34 == 1465509741832L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long44 == 1465509741831L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b46 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b48 == false);

  }

  @Test
  public void test162() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test162"); }


    tp2.Server server0 = new tp2.Server();
    tp2.ITime iTime1 = server0.getTime();
    tp2.IP iP2 = null;
    boolean b3 = server0.removeException(iP2);
    tp2.IP iP4 = null;
    boolean b5 = server0.connect(iP4);
    tp2.IP iP6 = null;
    boolean b7 = server0.removeException(iP6);
    tp2.IP iP8 = null;
    boolean b9 = server0.connect(iP8);
    tp2.IP iP10 = null;
    boolean b11 = server0.removeException(iP10);
    tp2.Server server12 = new tp2.Server();
    tp2.ITime iTime13 = server12.getTime();
    server12.update();
    tp2.ITime iTime15 = server12.getTime();
    server0.setTime(iTime15);
    tp2.IP iP17 = null;
    boolean b18 = server0.connect(iP17);
    tp2.IP iP19 = null;
    boolean b20 = server0.connect(iP19);
    tp2.IP iP21 = null;
    boolean b22 = server0.removeBan(iP21);
    server0.update();
    tp2.ITime iTime24 = server0.getTime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime24);

  }

  @Test
  public void test163() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test163"); }


    tp2.Server server0 = new tp2.Server();
    long long1 = server0.getLastUpdate();
    tp2.IP iP2 = null;
    boolean b3 = server0.addBan(iP2);
    tp2.IP iP4 = null;
    boolean b5 = server0.removeBan(iP4);
    tp2.IP iP6 = null;
    boolean b7 = server0.removeBan(iP6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);

  }

  @Test
  public void test164() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test164"); }


    tp2.Server server0 = new tp2.Server();
    tp2.ITime iTime1 = server0.getTime();
    tp2.IP iP2 = null;
    boolean b3 = server0.removeException(iP2);
    tp2.IP iP4 = null;
    boolean b5 = server0.connect(iP4);
    tp2.IP iP6 = null;
    boolean b7 = server0.removeException(iP6);
    tp2.IP iP8 = null;
    boolean b9 = server0.connect(iP8);
    tp2.IP iP10 = null;
    boolean b11 = server0.removeException(iP10);
    tp2.Server server12 = new tp2.Server();
    tp2.ITime iTime13 = server12.getTime();
    server12.update();
    tp2.ITime iTime15 = server12.getTime();
    server0.setTime(iTime15);
    tp2.Server server17 = new tp2.Server();
    tp2.ITime iTime18 = server17.getTime();
    server17.update();
    tp2.ITime iTime20 = server17.getTime();
    server0.setTime(iTime20);
    tp2.IP iP22 = null;
    boolean b23 = server0.addBan(iP22);
    tp2.Server server24 = new tp2.Server();
    tp2.ITime iTime25 = server24.getTime();
    server24.update();
    tp2.ITime iTime27 = server24.getTime();
    server0.setTime(iTime27);
    java.lang.String str29 = server0.toString();
    long long30 = server0.getLastUpdate();
    tp2.IP iP31 = null;
    boolean b32 = server0.connect(iP31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str29 + "' != '" + "Server [lastUpdate=0, exceptions=(), bans={}]"+ "'", str29.equals("Server [lastUpdate=0, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long30 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == true);

  }

  @Test
  public void test165() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test165"); }


    tp2.Server server0 = new tp2.Server();
    tp2.ITime iTime1 = server0.getTime();
    server0.update();
    tp2.ITime iTime3 = server0.getTime();
    tp2.Server server4 = new tp2.Server();
    long long5 = server4.getLastUpdate();
    tp2.ITime iTime6 = server4.getTime();
    server0.setTime(iTime6);
    tp2.ITime iTime8 = server0.getTime();
    tp2.IP iP9 = null;
    boolean b10 = server0.removeException(iP9);
    java.lang.String str11 = server0.toString();
    tp2.IP iP12 = null;
    boolean b13 = server0.addBan(iP12);
    tp2.IP iP14 = null;
    boolean b15 = server0.connect(iP14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long5 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Server [lastUpdate=1465509741845, exceptions=(), bans={}]"+ "'", str11.equals("Server [lastUpdate=1465509741845, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);

  }

  @Test
  public void test166() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test166"); }


    tp2.Server server0 = new tp2.Server();
    tp2.ITime iTime1 = server0.getTime();
    tp2.IP iP2 = null;
    boolean b3 = server0.removeException(iP2);
    tp2.IP iP4 = null;
    boolean b5 = server0.connect(iP4);
    tp2.IP iP6 = null;
    boolean b7 = server0.removeException(iP6);
    tp2.IP iP8 = null;
    boolean b9 = server0.connect(iP8);
    java.lang.String str10 = server0.toString();
    long long11 = server0.getLastUpdate();
    tp2.IP iP12 = null;
    boolean b13 = server0.removeException(iP12);
    tp2.Server server14 = new tp2.Server();
    long long15 = server14.getLastUpdate();
    server14.update();
    tp2.ITime iTime17 = server14.getTime();
    server0.setTime(iTime17);
    tp2.IP iP19 = null;
    boolean b20 = server0.addBan(iP19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Server [lastUpdate=0, exceptions=(), bans={}]"+ "'", str10.equals("Server [lastUpdate=0, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long11 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long15 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);

  }

  @Test
  public void test167() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test167"); }


    tp2.Server server0 = new tp2.Server();
    tp2.ITime iTime1 = server0.getTime();
    tp2.IP iP2 = null;
    boolean b3 = server0.removeException(iP2);
    tp2.IP iP4 = null;
    boolean b5 = server0.connect(iP4);
    tp2.IP iP6 = null;
    boolean b7 = server0.removeException(iP6);
    tp2.IP iP8 = null;
    boolean b9 = server0.connect(iP8);
    tp2.IP iP10 = null;
    boolean b11 = server0.removeException(iP10);
    tp2.Server server12 = new tp2.Server();
    tp2.ITime iTime13 = server12.getTime();
    server12.update();
    tp2.ITime iTime15 = server12.getTime();
    server0.setTime(iTime15);
    tp2.IP iP17 = null;
    boolean b18 = server0.removeBan(iP17);
    tp2.ITime iTime19 = server0.getTime();
    tp2.Server server20 = new tp2.Server();
    tp2.ITime iTime21 = server20.getTime();
    tp2.IP iP22 = null;
    boolean b23 = server20.connect(iP22);
    tp2.ITime iTime24 = server20.getTime();
    server0.setTime(iTime24);
    long long26 = server0.getLastUpdate();
    tp2.IP iP27 = null;
    boolean b28 = server0.removeException(iP27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long26 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);

  }

  @Test
  public void test168() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test168"); }


    tp2.Server server0 = new tp2.Server();
    long long1 = server0.getLastUpdate();
    tp2.ITime iTime2 = server0.getTime();
    tp2.IP iP3 = null;
    boolean b4 = server0.removeException(iP3);
    tp2.Server server5 = new tp2.Server();
    tp2.ITime iTime6 = server5.getTime();
    tp2.IP iP7 = null;
    boolean b8 = server5.removeException(iP7);
    tp2.IP iP9 = null;
    boolean b10 = server5.connect(iP9);
    tp2.IP iP11 = null;
    boolean b12 = server5.removeException(iP11);
    tp2.IP iP13 = null;
    boolean b14 = server5.connect(iP13);
    tp2.IP iP15 = null;
    boolean b16 = server5.removeException(iP15);
    tp2.Server server17 = new tp2.Server();
    tp2.ITime iTime18 = server17.getTime();
    server17.update();
    tp2.ITime iTime20 = server17.getTime();
    server5.setTime(iTime20);
    server0.setTime(iTime20);
    long long23 = server0.getLastUpdate();
    server0.update();
    tp2.Server server25 = new tp2.Server();
    tp2.ITime iTime26 = server25.getTime();
    server25.update();
    tp2.ITime iTime28 = server25.getTime();
    tp2.IP iP29 = null;
    boolean b30 = server25.addBan(iP29);
    tp2.IP iP31 = null;
    boolean b32 = server25.removeException(iP31);
    tp2.Server server33 = new tp2.Server();
    tp2.ITime iTime34 = server33.getTime();
    server33.update();
    tp2.Server server36 = new tp2.Server();
    long long37 = server36.getLastUpdate();
    tp2.ITime iTime38 = server36.getTime();
    server33.setTime(iTime38);
    server25.setTime(iTime38);
    server0.setTime(iTime38);
    tp2.IP iP42 = null;
    boolean b43 = server0.connect(iP42);
    tp2.Server server44 = new tp2.Server();
    tp2.ITime iTime45 = server44.getTime();
    tp2.IP iP46 = null;
    boolean b47 = server44.removeException(iP46);
    java.lang.String str48 = server44.toString();
    java.lang.String str49 = server44.toString();
    tp2.Server server50 = new tp2.Server();
    long long51 = server50.getLastUpdate();
    server50.update();
    tp2.IP iP53 = null;
    boolean b54 = server50.removeBan(iP53);
    long long55 = server50.getLastUpdate();
    tp2.Server server56 = new tp2.Server();
    tp2.ITime iTime57 = server56.getTime();
    tp2.IP iP58 = null;
    boolean b59 = server56.removeException(iP58);
    tp2.ITime iTime60 = server56.getTime();
    tp2.ITime iTime61 = server56.getTime();
    server50.setTime(iTime61);
    server44.setTime(iTime61);
    tp2.ITime iTime64 = server44.getTime();
    server0.setTime(iTime64);
    long long66 = server0.getLastUpdate();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long23 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long37 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b43 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b47 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str48 + "' != '" + "Server [lastUpdate=0, exceptions=(), bans={}]"+ "'", str48.equals("Server [lastUpdate=0, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str49 + "' != '" + "Server [lastUpdate=0, exceptions=(), bans={}]"+ "'", str49.equals("Server [lastUpdate=0, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long51 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b54 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long55 == 1465509741866L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b59 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime60);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime61);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime64);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long66 == 1465509741864L);

  }

  @Test
  public void test169() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test169"); }


    tp2.Server server0 = new tp2.Server();
    tp2.ITime iTime1 = server0.getTime();
    tp2.Server server2 = new tp2.Server();
    tp2.ITime iTime3 = server2.getTime();
    server0.setTime(iTime3);
    server0.update();
    java.lang.String str6 = server0.toString();
    tp2.IP iP7 = null;
    boolean b8 = server0.removeException(iP7);
    server0.update();
    tp2.IP iP10 = null;
    boolean b11 = server0.removeException(iP10);
    tp2.IP iP12 = null;
    boolean b13 = server0.connect(iP12);
    tp2.IP iP14 = null;
    boolean b15 = server0.addBan(iP14);
    tp2.IP iP16 = null;
    boolean b17 = server0.connect(iP16);
    tp2.Server server18 = new tp2.Server();
    tp2.ITime iTime19 = server18.getTime();
    tp2.Server server20 = new tp2.Server();
    tp2.ITime iTime21 = server20.getTime();
    server18.setTime(iTime21);
    server18.update();
    java.lang.String str24 = server18.toString();
    java.lang.String str25 = server18.toString();
    tp2.IP iP26 = null;
    boolean b27 = server18.removeException(iP26);
    java.lang.String str28 = server18.toString();
    tp2.ITime iTime29 = server18.getTime();
    long long30 = server18.getLastUpdate();
    tp2.IP iP31 = null;
    boolean b32 = server18.addBan(iP31);
    long long33 = server18.getLastUpdate();
    tp2.Server server34 = new tp2.Server();
    tp2.ITime iTime35 = server34.getTime();
    tp2.Server server36 = new tp2.Server();
    tp2.ITime iTime37 = server36.getTime();
    server34.setTime(iTime37);
    java.lang.String str39 = server34.toString();
    tp2.ITime iTime40 = server34.getTime();
    tp2.IP iP41 = null;
    boolean b42 = server34.addBan(iP41);
    tp2.Server server43 = new tp2.Server();
    tp2.ITime iTime44 = server43.getTime();
    tp2.Server server45 = new tp2.Server();
    tp2.ITime iTime46 = server45.getTime();
    server43.setTime(iTime46);
    java.lang.String str48 = server43.toString();
    long long49 = server43.getLastUpdate();
    tp2.IP iP50 = null;
    boolean b51 = server43.removeBan(iP50);
    tp2.Server server52 = new tp2.Server();
    tp2.ITime iTime53 = server52.getTime();
    tp2.ITime iTime54 = server52.getTime();
    tp2.IP iP55 = null;
    boolean b56 = server52.connect(iP55);
    tp2.ITime iTime57 = server52.getTime();
    server43.setTime(iTime57);
    server34.setTime(iTime57);
    server18.setTime(iTime57);
    server0.setTime(iTime57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Server [lastUpdate=1465509741895, exceptions=(), bans={}]"+ "'", str6.equals("Server [lastUpdate=1465509741895, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + "Server [lastUpdate=1465509741897, exceptions=(), bans={}]"+ "'", str24.equals("Server [lastUpdate=1465509741897, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + "Server [lastUpdate=1465509741897, exceptions=(), bans={}]"+ "'", str25.equals("Server [lastUpdate=1465509741897, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str28 + "' != '" + "Server [lastUpdate=1465509741897, exceptions=(), bans={}]"+ "'", str28.equals("Server [lastUpdate=1465509741897, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long30 == 1465509741897L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long33 == 1465509741897L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str39 + "' != '" + "Server [lastUpdate=0, exceptions=(), bans={}]"+ "'", str39.equals("Server [lastUpdate=0, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str48 + "' != '" + "Server [lastUpdate=0, exceptions=(), bans={}]"+ "'", str48.equals("Server [lastUpdate=0, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long49 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b51 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b56 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime57);

  }

  @Test
  public void test170() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test170"); }


    tp2.Server server0 = new tp2.Server();
    tp2.ITime iTime1 = server0.getTime();
    server0.update();
    tp2.ITime iTime3 = server0.getTime();
    long long4 = server0.getLastUpdate();
    long long5 = server0.getLastUpdate();
    long long6 = server0.getLastUpdate();
    java.lang.String str7 = server0.toString();
    tp2.IP iP8 = null;
    boolean b9 = server0.removeBan(iP8);
    java.lang.String str10 = server0.toString();
    tp2.IP iP11 = null;
    boolean b12 = server0.addBan(iP11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long4 == 1465509741921L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long5 == 1465509741921L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long6 == 1465509741921L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Server [lastUpdate=1465509741921, exceptions=(), bans={}]"+ "'", str7.equals("Server [lastUpdate=1465509741921, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Server [lastUpdate=1465509741921, exceptions=(), bans={}]"+ "'", str10.equals("Server [lastUpdate=1465509741921, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);

  }

  @Test
  public void test171() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test171"); }


    tp2.Server server0 = new tp2.Server();
    long long1 = server0.getLastUpdate();
    tp2.ITime iTime2 = server0.getTime();
    tp2.ITime iTime3 = server0.getTime();
    tp2.IP iP4 = null;
    boolean b5 = server0.removeBan(iP4);
    java.lang.String str6 = server0.toString();
    tp2.IP iP7 = null;
    boolean b8 = server0.removeException(iP7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Server [lastUpdate=0, exceptions=(), bans={}]"+ "'", str6.equals("Server [lastUpdate=0, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);

  }

  @Test
  public void test172() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test172"); }


    tp2.Server server0 = new tp2.Server();
    long long1 = server0.getLastUpdate();
    tp2.ITime iTime2 = server0.getTime();
    tp2.IP iP3 = null;
    boolean b4 = server0.removeException(iP3);
    tp2.IP iP5 = null;
    boolean b6 = server0.addBan(iP5);
    java.lang.String str7 = server0.toString();
    java.lang.String str8 = server0.toString();
    java.lang.String str9 = server0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Server [lastUpdate=0, exceptions=(), bans={}]"+ "'", str7.equals("Server [lastUpdate=0, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Server [lastUpdate=0, exceptions=(), bans={}]"+ "'", str8.equals("Server [lastUpdate=0, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Server [lastUpdate=0, exceptions=(), bans={}]"+ "'", str9.equals("Server [lastUpdate=0, exceptions=(), bans={}]"));

  }

  @Test
  public void test173() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test173"); }


    tp2.Server server0 = new tp2.Server();
    tp2.ITime iTime1 = server0.getTime();
    server0.update();
    tp2.ITime iTime3 = server0.getTime();
    java.lang.String str4 = server0.toString();
    tp2.ITime iTime5 = server0.getTime();
    tp2.ITime iTime6 = server0.getTime();
    tp2.IP iP7 = null;
    boolean b8 = server0.connect(iP7);
    tp2.Server server9 = new tp2.Server();
    tp2.IP iP10 = null;
    boolean b11 = server9.addBan(iP10);
    tp2.IP iP12 = null;
    boolean b13 = server9.removeException(iP12);
    tp2.IP iP14 = null;
    boolean b15 = server9.removeException(iP14);
    tp2.IP iP16 = null;
    boolean b17 = server9.addBan(iP16);
    server9.update();
    tp2.IP iP19 = null;
    boolean b20 = server9.addBan(iP19);
    tp2.Server server21 = new tp2.Server();
    tp2.ITime iTime22 = server21.getTime();
    tp2.Server server23 = new tp2.Server();
    tp2.ITime iTime24 = server23.getTime();
    server21.setTime(iTime24);
    tp2.ITime iTime26 = server21.getTime();
    java.lang.String str27 = server21.toString();
    tp2.IP iP28 = null;
    boolean b29 = server21.addBan(iP28);
    tp2.IP iP30 = null;
    boolean b31 = server21.removeException(iP30);
    server21.update();
    tp2.ITime iTime33 = server21.getTime();
    server9.setTime(iTime33);
    server0.setTime(iTime33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Server [lastUpdate=1465509741925, exceptions=(), bans={}]"+ "'", str4.equals("Server [lastUpdate=1465509741925, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str27 + "' != '" + "Server [lastUpdate=0, exceptions=(), bans={}]"+ "'", str27.equals("Server [lastUpdate=0, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime33);

  }

  @Test
  public void test174() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test174"); }


    tp2.Server server0 = new tp2.Server();
    tp2.ITime iTime1 = server0.getTime();
    tp2.Server server2 = new tp2.Server();
    tp2.ITime iTime3 = server2.getTime();
    server0.setTime(iTime3);
    tp2.ITime iTime5 = server0.getTime();
    tp2.IP iP6 = null;
    boolean b7 = server0.addBan(iP6);
    tp2.IP iP8 = null;
    boolean b9 = server0.addBan(iP8);
    tp2.IP iP10 = null;
    boolean b11 = server0.removeException(iP10);
    tp2.IP iP12 = null;
    boolean b13 = server0.removeException(iP12);
    tp2.IP iP14 = null;
    boolean b15 = server0.removeBan(iP14);
    long long16 = server0.getLastUpdate();
    tp2.IP iP17 = null;
    boolean b18 = server0.connect(iP17);
    long long19 = server0.getLastUpdate();
    server0.update();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long16 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long19 == 0L);

  }

  @Test
  public void test175() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test175"); }


    tp2.Server server0 = new tp2.Server();
    long long1 = server0.getLastUpdate();
    server0.update();
    tp2.IP iP3 = null;
    boolean b4 = server0.removeException(iP3);
    server0.update();
    java.lang.String str6 = server0.toString();
    tp2.IP iP7 = null;
    boolean b8 = server0.removeBan(iP7);
    tp2.IP iP9 = null;
    boolean b10 = server0.removeBan(iP9);
    tp2.IP iP11 = null;
    boolean b12 = server0.removeBan(iP11);
    java.lang.String str13 = server0.toString();
    server0.update();
    tp2.ITime iTime15 = server0.getTime();
    long long16 = server0.getLastUpdate();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Server [lastUpdate=1465509741934, exceptions=(), bans={}]"+ "'", str6.equals("Server [lastUpdate=1465509741934, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Server [lastUpdate=1465509741934, exceptions=(), bans={}]"+ "'", str13.equals("Server [lastUpdate=1465509741934, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long16 == 1465509741935L);

  }

  @Test
  public void test176() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test176"); }


    tp2.Server server0 = new tp2.Server();
    tp2.ITime iTime1 = server0.getTime();
    server0.update();
    tp2.ITime iTime3 = server0.getTime();
    tp2.IP iP4 = null;
    boolean b5 = server0.connect(iP4);
    tp2.ITime iTime6 = server0.getTime();
    java.lang.String str7 = server0.toString();
    tp2.IP iP8 = null;
    boolean b9 = server0.removeException(iP8);
    server0.update();
    server0.update();
    long long12 = server0.getLastUpdate();
    long long13 = server0.getLastUpdate();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Server [lastUpdate=1465509741936, exceptions=(), bans={}]"+ "'", str7.equals("Server [lastUpdate=1465509741936, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long12 == 1465509741937L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long13 == 1465509741937L);

  }

  @Test
  public void test177() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test177"); }


    tp2.Server server0 = new tp2.Server();
    tp2.ITime iTime1 = server0.getTime();
    server0.update();
    tp2.ITime iTime3 = server0.getTime();
    tp2.IP iP4 = null;
    boolean b5 = server0.removeBan(iP4);
    long long6 = server0.getLastUpdate();
    tp2.IP iP7 = null;
    boolean b8 = server0.addBan(iP7);
    tp2.IP iP9 = null;
    boolean b10 = server0.connect(iP9);
    tp2.IP iP11 = null;
    boolean b12 = server0.addBan(iP11);
    java.lang.String str13 = server0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long6 == 1465509741938L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Server [lastUpdate=1465509741938, exceptions=(), bans={}]"+ "'", str13.equals("Server [lastUpdate=1465509741938, exceptions=(), bans={}]"));

  }

  @Test
  public void test178() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test178"); }


    tp2.Server server0 = new tp2.Server();
    tp2.ITime iTime1 = server0.getTime();
    tp2.Server server2 = new tp2.Server();
    tp2.ITime iTime3 = server2.getTime();
    server0.setTime(iTime3);
    server0.update();
    java.lang.String str6 = server0.toString();
    java.lang.String str7 = server0.toString();
    tp2.IP iP8 = null;
    boolean b9 = server0.removeException(iP8);
    java.lang.String str10 = server0.toString();
    tp2.Server server11 = new tp2.Server();
    tp2.ITime iTime12 = server11.getTime();
    server11.update();
    tp2.ITime iTime14 = server11.getTime();
    tp2.Server server15 = new tp2.Server();
    long long16 = server15.getLastUpdate();
    tp2.ITime iTime17 = server15.getTime();
    server11.setTime(iTime17);
    tp2.ITime iTime19 = server11.getTime();
    server0.setTime(iTime19);
    server0.update();
    tp2.Server server22 = new tp2.Server();
    tp2.ITime iTime23 = server22.getTime();
    tp2.IP iP24 = null;
    boolean b25 = server22.removeException(iP24);
    tp2.IP iP26 = null;
    boolean b27 = server22.connect(iP26);
    tp2.IP iP28 = null;
    boolean b29 = server22.removeException(iP28);
    tp2.IP iP30 = null;
    boolean b31 = server22.connect(iP30);
    java.lang.String str32 = server22.toString();
    tp2.Server server33 = new tp2.Server();
    tp2.ITime iTime34 = server33.getTime();
    server33.update();
    tp2.ITime iTime36 = server33.getTime();
    tp2.IP iP37 = null;
    boolean b38 = server33.removeBan(iP37);
    long long39 = server33.getLastUpdate();
    tp2.IP iP40 = null;
    boolean b41 = server33.addBan(iP40);
    tp2.IP iP42 = null;
    boolean b43 = server33.removeException(iP42);
    tp2.ITime iTime44 = server33.getTime();
    server22.setTime(iTime44);
    server0.setTime(iTime44);
    tp2.IP iP47 = null;
    boolean b48 = server0.removeBan(iP47);
    tp2.IP iP49 = null;
    boolean b50 = server0.removeException(iP49);
    long long51 = server0.getLastUpdate();
    tp2.IP iP52 = null;
    boolean b53 = server0.removeBan(iP52);
    server0.update();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Server [lastUpdate=1465509741939, exceptions=(), bans={}]"+ "'", str6.equals("Server [lastUpdate=1465509741939, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Server [lastUpdate=1465509741939, exceptions=(), bans={}]"+ "'", str7.equals("Server [lastUpdate=1465509741939, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Server [lastUpdate=1465509741939, exceptions=(), bans={}]"+ "'", str10.equals("Server [lastUpdate=1465509741939, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long16 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str32 + "' != '" + "Server [lastUpdate=0, exceptions=(), bans={}]"+ "'", str32.equals("Server [lastUpdate=0, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long39 == 1465509741941L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b43 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b48 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b50 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long51 == 1465509741940L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b53 == false);

  }

  @Test
  public void test179() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test179"); }


    tp2.Server server0 = new tp2.Server();
    tp2.ITime iTime1 = server0.getTime();
    long long2 = server0.getLastUpdate();
    tp2.IP iP3 = null;
    boolean b4 = server0.removeBan(iP3);
    tp2.IP iP5 = null;
    boolean b6 = server0.removeBan(iP5);
    tp2.IP iP7 = null;
    boolean b8 = server0.addBan(iP7);
    tp2.Server server9 = new tp2.Server();
    tp2.ITime iTime10 = server9.getTime();
    tp2.ITime iTime11 = server9.getTime();
    server0.setTime(iTime11);
    tp2.IP iP13 = null;
    boolean b14 = server0.addBan(iP13);
    long long15 = server0.getLastUpdate();
    java.lang.String str16 = server0.toString();
    tp2.IP iP17 = null;
    boolean b18 = server0.removeBan(iP17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long2 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long15 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "Server [lastUpdate=0, exceptions=(), bans={}]"+ "'", str16.equals("Server [lastUpdate=0, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);

  }

  @Test
  public void test180() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test180"); }


    tp2.Server server0 = new tp2.Server();
    tp2.ITime iTime1 = server0.getTime();
    server0.update();
    tp2.IP iP3 = null;
    boolean b4 = server0.connect(iP3);
    tp2.IP iP5 = null;
    boolean b6 = server0.removeBan(iP5);
    tp2.IP iP7 = null;
    boolean b8 = server0.addBan(iP7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);

  }

  @Test
  public void test181() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test181"); }


    tp2.Server server0 = new tp2.Server();
    long long1 = server0.getLastUpdate();
    tp2.ITime iTime2 = server0.getTime();
    tp2.IP iP3 = null;
    boolean b4 = server0.removeException(iP3);
    tp2.IP iP5 = null;
    boolean b6 = server0.removeBan(iP5);
    tp2.IP iP7 = null;
    boolean b8 = server0.removeException(iP7);
    java.lang.String str9 = server0.toString();
    long long10 = server0.getLastUpdate();
    tp2.IP iP11 = null;
    boolean b12 = server0.addBan(iP11);
    tp2.IP iP13 = null;
    boolean b14 = server0.connect(iP13);
    java.lang.String str15 = server0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Server [lastUpdate=0, exceptions=(), bans={}]"+ "'", str9.equals("Server [lastUpdate=0, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long10 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "Server [lastUpdate=0, exceptions=(), bans={}]"+ "'", str15.equals("Server [lastUpdate=0, exceptions=(), bans={}]"));

  }

  @Test
  public void test182() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test182"); }


    tp2.Server server0 = new tp2.Server();
    tp2.ITime iTime1 = server0.getTime();
    server0.update();
    tp2.Server server3 = new tp2.Server();
    long long4 = server3.getLastUpdate();
    tp2.ITime iTime5 = server3.getTime();
    server0.setTime(iTime5);
    long long7 = server0.getLastUpdate();
    tp2.Server server8 = new tp2.Server();
    tp2.ITime iTime9 = server8.getTime();
    tp2.Server server10 = new tp2.Server();
    tp2.ITime iTime11 = server10.getTime();
    server8.setTime(iTime11);
    tp2.ITime iTime13 = server8.getTime();
    tp2.IP iP14 = null;
    boolean b15 = server8.addBan(iP14);
    tp2.Server server16 = new tp2.Server();
    tp2.ITime iTime17 = server16.getTime();
    tp2.ITime iTime18 = server16.getTime();
    server8.setTime(iTime18);
    server0.setTime(iTime18);
    tp2.IP iP21 = null;
    boolean b22 = server0.connect(iP21);
    tp2.IP iP23 = null;
    boolean b24 = server0.addBan(iP23);
    java.lang.String str25 = server0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long4 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long7 == 1465509741963L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + "Server [lastUpdate=1465509741963, exceptions=(), bans={}]"+ "'", str25.equals("Server [lastUpdate=1465509741963, exceptions=(), bans={}]"));

  }

  @Test
  public void test183() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test183"); }


    tp2.Server server0 = new tp2.Server();
    tp2.ITime iTime1 = server0.getTime();
    server0.update();
    tp2.ITime iTime3 = server0.getTime();
    java.lang.String str4 = server0.toString();
    tp2.ITime iTime5 = server0.getTime();
    tp2.IP iP6 = null;
    boolean b7 = server0.addBan(iP6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Server [lastUpdate=1465509741979, exceptions=(), bans={}]"+ "'", str4.equals("Server [lastUpdate=1465509741979, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);

  }

  @Test
  public void test184() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test184"); }


    tp2.Server server0 = new tp2.Server();
    long long1 = server0.getLastUpdate();
    server0.update();
    tp2.IP iP3 = null;
    boolean b4 = server0.removeBan(iP3);
    tp2.ITime iTime5 = server0.getTime();
    tp2.IP iP6 = null;
    boolean b7 = server0.removeException(iP6);
    java.lang.String str8 = server0.toString();
    tp2.IP iP9 = null;
    boolean b10 = server0.addBan(iP9);
    tp2.IP iP11 = null;
    boolean b12 = server0.addBan(iP11);
    tp2.IP iP13 = null;
    boolean b14 = server0.addBan(iP13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Server [lastUpdate=1465509741982, exceptions=(), bans={}]"+ "'", str8.equals("Server [lastUpdate=1465509741982, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);

  }

  @Test
  public void test185() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test185"); }


    tp2.Server server0 = new tp2.Server();
    tp2.ITime iTime1 = server0.getTime();
    tp2.IP iP2 = null;
    boolean b3 = server0.removeException(iP2);
    tp2.IP iP4 = null;
    boolean b5 = server0.connect(iP4);
    tp2.IP iP6 = null;
    boolean b7 = server0.removeException(iP6);
    tp2.IP iP8 = null;
    boolean b9 = server0.connect(iP8);
    tp2.IP iP10 = null;
    boolean b11 = server0.removeException(iP10);
    long long12 = server0.getLastUpdate();
    java.lang.String str13 = server0.toString();
    tp2.Server server14 = new tp2.Server();
    tp2.ITime iTime15 = server14.getTime();
    tp2.Server server16 = new tp2.Server();
    tp2.ITime iTime17 = server16.getTime();
    server14.setTime(iTime17);
    server14.update();
    server14.update();
    tp2.ITime iTime21 = server14.getTime();
    server0.setTime(iTime21);
    java.lang.String str23 = server0.toString();
    server0.update();
    server0.update();
    server0.update();
    java.lang.String str27 = server0.toString();
    tp2.ITime iTime28 = server0.getTime();
    long long29 = server0.getLastUpdate();
    server0.update();
    java.lang.String str31 = server0.toString();
    tp2.IP iP32 = null;
    boolean b33 = server0.connect(iP32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long12 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Server [lastUpdate=0, exceptions=(), bans={}]"+ "'", str13.equals("Server [lastUpdate=0, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + "Server [lastUpdate=0, exceptions=(), bans={}]"+ "'", str23.equals("Server [lastUpdate=0, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str27 + "' != '" + "Server [lastUpdate=1465509741984, exceptions=(), bans={}]"+ "'", str27.equals("Server [lastUpdate=1465509741984, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long29 == 1465509741984L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str31 + "' != '" + "Server [lastUpdate=1465509741985, exceptions=(), bans={}]"+ "'", str31.equals("Server [lastUpdate=1465509741985, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == true);

  }

  @Test
  public void test186() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test186"); }


    tp2.Server server0 = new tp2.Server();
    tp2.ITime iTime1 = server0.getTime();
    server0.update();
    tp2.ITime iTime3 = server0.getTime();
    tp2.Server server4 = new tp2.Server();
    long long5 = server4.getLastUpdate();
    tp2.ITime iTime6 = server4.getTime();
    server0.setTime(iTime6);
    long long8 = server0.getLastUpdate();
    tp2.IP iP9 = null;
    boolean b10 = server0.addBan(iP9);
    tp2.IP iP11 = null;
    boolean b12 = server0.connect(iP11);
    server0.update();
    server0.update();
    java.lang.String str15 = server0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long5 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long8 == 1465509741991L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "Server [lastUpdate=1465509741994, exceptions=(), bans={}]"+ "'", str15.equals("Server [lastUpdate=1465509741994, exceptions=(), bans={}]"));

  }

  @Test
  public void test187() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test187"); }


    tp2.Server server0 = new tp2.Server();
    tp2.ITime iTime1 = server0.getTime();
    long long2 = server0.getLastUpdate();
    tp2.IP iP3 = null;
    boolean b4 = server0.removeBan(iP3);
    tp2.IP iP5 = null;
    boolean b6 = server0.removeBan(iP5);
    tp2.IP iP7 = null;
    boolean b8 = server0.addBan(iP7);
    tp2.IP iP9 = null;
    boolean b10 = server0.connect(iP9);
    tp2.IP iP11 = null;
    boolean b12 = server0.removeBan(iP11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long2 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);

  }

  @Test
  public void test188() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test188"); }


    tp2.Server server0 = new tp2.Server();
    long long1 = server0.getLastUpdate();
    tp2.ITime iTime2 = server0.getTime();
    tp2.IP iP3 = null;
    boolean b4 = server0.removeException(iP3);
    tp2.IP iP5 = null;
    boolean b6 = server0.removeBan(iP5);
    tp2.IP iP7 = null;
    boolean b8 = server0.removeException(iP7);
    java.lang.String str9 = server0.toString();
    long long10 = server0.getLastUpdate();
    tp2.IP iP11 = null;
    boolean b12 = server0.addBan(iP11);
    tp2.Server server13 = new tp2.Server();
    long long14 = server13.getLastUpdate();
    tp2.ITime iTime15 = server13.getTime();
    tp2.IP iP16 = null;
    boolean b17 = server13.removeException(iP16);
    tp2.IP iP18 = null;
    boolean b19 = server13.removeBan(iP18);
    tp2.IP iP20 = null;
    boolean b21 = server13.removeException(iP20);
    java.lang.String str22 = server13.toString();
    tp2.IP iP23 = null;
    boolean b24 = server13.addBan(iP23);
    tp2.Server server25 = new tp2.Server();
    tp2.ITime iTime26 = server25.getTime();
    server25.update();
    tp2.ITime iTime28 = server25.getTime();
    tp2.ITime iTime29 = server25.getTime();
    tp2.IP iP30 = null;
    boolean b31 = server25.connect(iP30);
    tp2.IP iP32 = null;
    boolean b33 = server25.removeBan(iP32);
    tp2.IP iP34 = null;
    boolean b35 = server25.removeException(iP34);
    tp2.ITime iTime36 = server25.getTime();
    server13.setTime(iTime36);
    server0.setTime(iTime36);
    java.lang.String str39 = server0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Server [lastUpdate=0, exceptions=(), bans={}]"+ "'", str9.equals("Server [lastUpdate=0, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long10 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long14 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + "Server [lastUpdate=0, exceptions=(), bans={}]"+ "'", str22.equals("Server [lastUpdate=0, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str39 + "' != '" + "Server [lastUpdate=0, exceptions=(), bans={}]"+ "'", str39.equals("Server [lastUpdate=0, exceptions=(), bans={}]"));

  }

  @Test
  public void test189() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test189"); }


    tp2.Server server0 = new tp2.Server();
    tp2.ITime iTime1 = server0.getTime();
    tp2.IP iP2 = null;
    boolean b3 = server0.removeException(iP2);
    tp2.IP iP4 = null;
    boolean b5 = server0.connect(iP4);
    tp2.IP iP6 = null;
    boolean b7 = server0.removeException(iP6);
    tp2.IP iP8 = null;
    boolean b9 = server0.connect(iP8);
    tp2.IP iP10 = null;
    boolean b11 = server0.removeException(iP10);
    long long12 = server0.getLastUpdate();
    java.lang.String str13 = server0.toString();
    tp2.Server server14 = new tp2.Server();
    tp2.ITime iTime15 = server14.getTime();
    tp2.Server server16 = new tp2.Server();
    tp2.ITime iTime17 = server16.getTime();
    server14.setTime(iTime17);
    server14.update();
    server14.update();
    tp2.ITime iTime21 = server14.getTime();
    server0.setTime(iTime21);
    java.lang.String str23 = server0.toString();
    tp2.IP iP24 = null;
    boolean b25 = server0.connect(iP24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long12 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Server [lastUpdate=0, exceptions=(), bans={}]"+ "'", str13.equals("Server [lastUpdate=0, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + "Server [lastUpdate=0, exceptions=(), bans={}]"+ "'", str23.equals("Server [lastUpdate=0, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);

  }

  @Test
  public void test190() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test190"); }


    tp2.Server server0 = new tp2.Server();
    tp2.ITime iTime1 = server0.getTime();
    server0.update();
    tp2.ITime iTime3 = server0.getTime();
    tp2.Server server4 = new tp2.Server();
    long long5 = server4.getLastUpdate();
    tp2.ITime iTime6 = server4.getTime();
    server0.setTime(iTime6);
    tp2.ITime iTime8 = server0.getTime();
    tp2.IP iP9 = null;
    boolean b10 = server0.removeException(iP9);
    tp2.IP iP11 = null;
    boolean b12 = server0.connect(iP11);
    server0.update();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long5 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);

  }

  @Test
  public void test191() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test191"); }


    tp2.Server server0 = new tp2.Server();
    tp2.ITime iTime1 = server0.getTime();
    tp2.Server server2 = new tp2.Server();
    tp2.ITime iTime3 = server2.getTime();
    server0.setTime(iTime3);
    tp2.IP iP5 = null;
    boolean b6 = server0.connect(iP5);
    tp2.IP iP7 = null;
    boolean b8 = server0.connect(iP7);
    tp2.Server server9 = new tp2.Server();
    tp2.ITime iTime10 = server9.getTime();
    server9.update();
    tp2.ITime iTime12 = server9.getTime();
    tp2.IP iP13 = null;
    boolean b14 = server9.addBan(iP13);
    tp2.IP iP15 = null;
    boolean b16 = server9.removeException(iP15);
    tp2.Server server17 = new tp2.Server();
    tp2.ITime iTime18 = server17.getTime();
    server17.update();
    tp2.Server server20 = new tp2.Server();
    long long21 = server20.getLastUpdate();
    tp2.ITime iTime22 = server20.getTime();
    server17.setTime(iTime22);
    server9.setTime(iTime22);
    server0.setTime(iTime22);
    java.lang.String str26 = server0.toString();
    tp2.IP iP27 = null;
    boolean b28 = server0.connect(iP27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long21 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str26 + "' != '" + "Server [lastUpdate=0, exceptions=(), bans={}]"+ "'", str26.equals("Server [lastUpdate=0, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == true);

  }

  @Test
  public void test192() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test192"); }


    tp2.Server server0 = new tp2.Server();
    long long1 = server0.getLastUpdate();
    server0.update();
    tp2.IP iP3 = null;
    boolean b4 = server0.removeBan(iP3);
    tp2.ITime iTime5 = server0.getTime();
    tp2.IP iP6 = null;
    boolean b7 = server0.removeException(iP6);
    java.lang.String str8 = server0.toString();
    tp2.IP iP9 = null;
    boolean b10 = server0.connect(iP9);
    java.lang.String str11 = server0.toString();
    tp2.Server server12 = new tp2.Server();
    tp2.ITime iTime13 = server12.getTime();
    tp2.IP iP14 = null;
    boolean b15 = server12.connect(iP14);
    tp2.ITime iTime16 = server12.getTime();
    server0.setTime(iTime16);
    server0.update();
    java.lang.String str19 = server0.toString();
    server0.update();
    tp2.ITime iTime21 = server0.getTime();
    server0.update();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Server [lastUpdate=1465509742036, exceptions=(), bans={}]"+ "'", str8.equals("Server [lastUpdate=1465509742036, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Server [lastUpdate=1465509742036, exceptions=(), bans={}]"+ "'", str11.equals("Server [lastUpdate=1465509742036, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "Server [lastUpdate=1465509742037, exceptions=(), bans={}]"+ "'", str19.equals("Server [lastUpdate=1465509742037, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime21);

  }

  @Test
  public void test193() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test193"); }


    tp2.Server server0 = new tp2.Server();
    tp2.ITime iTime1 = server0.getTime();
    tp2.Server server2 = new tp2.Server();
    tp2.ITime iTime3 = server2.getTime();
    server0.setTime(iTime3);
    tp2.ITime iTime5 = server0.getTime();
    java.lang.String str6 = server0.toString();
    long long7 = server0.getLastUpdate();
    tp2.IP iP8 = null;
    boolean b9 = server0.removeException(iP8);
    tp2.Server server10 = new tp2.Server();
    tp2.ITime iTime11 = server10.getTime();
    long long12 = server10.getLastUpdate();
    tp2.IP iP13 = null;
    boolean b14 = server10.removeBan(iP13);
    tp2.Server server15 = new tp2.Server();
    tp2.ITime iTime16 = server15.getTime();
    tp2.Server server17 = new tp2.Server();
    tp2.ITime iTime18 = server17.getTime();
    server15.setTime(iTime18);
    server10.setTime(iTime18);
    tp2.Server server21 = new tp2.Server();
    tp2.ITime iTime22 = server21.getTime();
    server21.update();
    tp2.ITime iTime24 = server21.getTime();
    long long25 = server21.getLastUpdate();
    long long26 = server21.getLastUpdate();
    tp2.Server server27 = new tp2.Server();
    tp2.ITime iTime28 = server27.getTime();
    tp2.IP iP29 = null;
    boolean b30 = server27.removeException(iP29);
    tp2.IP iP31 = null;
    boolean b32 = server27.connect(iP31);
    tp2.IP iP33 = null;
    boolean b34 = server27.removeException(iP33);
    tp2.IP iP35 = null;
    boolean b36 = server27.connect(iP35);
    tp2.IP iP37 = null;
    boolean b38 = server27.removeException(iP37);
    tp2.Server server39 = new tp2.Server();
    tp2.ITime iTime40 = server39.getTime();
    server39.update();
    tp2.ITime iTime42 = server39.getTime();
    server27.setTime(iTime42);
    server21.setTime(iTime42);
    server10.setTime(iTime42);
    java.lang.String str46 = server10.toString();
    tp2.Server server47 = new tp2.Server();
    tp2.ITime iTime48 = server47.getTime();
    long long49 = server47.getLastUpdate();
    tp2.IP iP50 = null;
    boolean b51 = server47.removeBan(iP50);
    tp2.Server server52 = new tp2.Server();
    tp2.ITime iTime53 = server52.getTime();
    server52.update();
    tp2.ITime iTime55 = server52.getTime();
    tp2.ITime iTime56 = server52.getTime();
    server47.setTime(iTime56);
    server10.setTime(iTime56);
    tp2.IP iP59 = null;
    boolean b60 = server10.connect(iP59);
    tp2.ITime iTime61 = server10.getTime();
    server0.setTime(iTime61);
    server0.update();
    long long64 = server0.getLastUpdate();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Server [lastUpdate=0, exceptions=(), bans={}]"+ "'", str6.equals("Server [lastUpdate=0, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long7 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long12 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long25 == 1465509742044L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long26 == 1465509742044L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str46 + "' != '" + "Server [lastUpdate=0, exceptions=(), bans={}]"+ "'", str46.equals("Server [lastUpdate=0, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long49 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b51 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime55);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b60 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime61);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long64 == 1465509742046L);

  }

  @Test
  public void test194() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test194"); }


    tp2.Server server0 = new tp2.Server();
    tp2.ITime iTime1 = server0.getTime();
    tp2.IP iP2 = null;
    boolean b3 = server0.removeException(iP2);
    java.lang.String str4 = server0.toString();
    java.lang.String str5 = server0.toString();
    tp2.Server server6 = new tp2.Server();
    long long7 = server6.getLastUpdate();
    server6.update();
    tp2.IP iP9 = null;
    boolean b10 = server6.removeBan(iP9);
    long long11 = server6.getLastUpdate();
    tp2.Server server12 = new tp2.Server();
    tp2.ITime iTime13 = server12.getTime();
    tp2.IP iP14 = null;
    boolean b15 = server12.removeException(iP14);
    tp2.ITime iTime16 = server12.getTime();
    tp2.ITime iTime17 = server12.getTime();
    server6.setTime(iTime17);
    server0.setTime(iTime17);
    long long20 = server0.getLastUpdate();
    tp2.Server server21 = new tp2.Server();
    tp2.ITime iTime22 = server21.getTime();
    server21.update();
    tp2.ITime iTime24 = server21.getTime();
    tp2.IP iP25 = null;
    boolean b26 = server21.addBan(iP25);
    tp2.IP iP27 = null;
    boolean b28 = server21.removeException(iP27);
    tp2.IP iP29 = null;
    boolean b30 = server21.addBan(iP29);
    java.lang.String str31 = server21.toString();
    tp2.Server server32 = new tp2.Server();
    tp2.ITime iTime33 = server32.getTime();
    server32.update();
    tp2.ITime iTime35 = server32.getTime();
    tp2.Server server36 = new tp2.Server();
    long long37 = server36.getLastUpdate();
    tp2.ITime iTime38 = server36.getTime();
    server32.setTime(iTime38);
    server21.setTime(iTime38);
    server0.setTime(iTime38);
    tp2.ITime iTime42 = server0.getTime();
    tp2.IP iP43 = null;
    boolean b44 = server0.removeBan(iP43);
    long long45 = server0.getLastUpdate();
    server0.update();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Server [lastUpdate=0, exceptions=(), bans={}]"+ "'", str4.equals("Server [lastUpdate=0, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Server [lastUpdate=0, exceptions=(), bans={}]"+ "'", str5.equals("Server [lastUpdate=0, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long7 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long11 == 1465509742095L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long20 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str31 + "' != '" + "Server [lastUpdate=1465509742097, exceptions=(), bans={}]"+ "'", str31.equals("Server [lastUpdate=1465509742097, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long37 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long45 == 0L);

  }

  @Test
  public void test195() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test195"); }


    tp2.Server server0 = new tp2.Server();
    tp2.ITime iTime1 = server0.getTime();
    tp2.IP iP2 = null;
    boolean b3 = server0.removeException(iP2);
    tp2.IP iP4 = null;
    boolean b5 = server0.connect(iP4);
    server0.update();
    tp2.ITime iTime7 = server0.getTime();
    tp2.IP iP8 = null;
    boolean b9 = server0.addBan(iP8);
    tp2.IP iP10 = null;
    boolean b11 = server0.addBan(iP10);
    tp2.IP iP12 = null;
    boolean b13 = server0.addBan(iP12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);

  }

  @Test
  public void test196() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test196"); }


    tp2.Server server0 = new tp2.Server();
    tp2.ITime iTime1 = server0.getTime();
    long long2 = server0.getLastUpdate();
    tp2.IP iP3 = null;
    boolean b4 = server0.removeBan(iP3);
    tp2.IP iP5 = null;
    boolean b6 = server0.removeBan(iP5);
    tp2.IP iP7 = null;
    boolean b8 = server0.addBan(iP7);
    tp2.Server server9 = new tp2.Server();
    tp2.ITime iTime10 = server9.getTime();
    tp2.ITime iTime11 = server9.getTime();
    server0.setTime(iTime11);
    tp2.IP iP13 = null;
    boolean b14 = server0.addBan(iP13);
    tp2.IP iP15 = null;
    boolean b16 = server0.addBan(iP15);
    tp2.IP iP17 = null;
    boolean b18 = server0.removeException(iP17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long2 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);

  }

  @Test
  public void test197() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test197"); }


    tp2.Server server0 = new tp2.Server();
    long long1 = server0.getLastUpdate();
    tp2.ITime iTime2 = server0.getTime();
    tp2.IP iP3 = null;
    boolean b4 = server0.removeException(iP3);
    tp2.IP iP5 = null;
    boolean b6 = server0.addBan(iP5);
    server0.update();
    server0.update();
    tp2.IP iP9 = null;
    boolean b10 = server0.removeBan(iP9);
    java.lang.String str11 = server0.toString();
    tp2.ITime iTime12 = server0.getTime();
    tp2.IP iP13 = null;
    boolean b14 = server0.removeException(iP13);
    server0.update();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Server [lastUpdate=1465509742123, exceptions=(), bans={}]"+ "'", str11.equals("Server [lastUpdate=1465509742123, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);

  }

  @Test
  public void test198() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test198"); }


    tp2.Server server0 = new tp2.Server();
    tp2.ITime iTime1 = server0.getTime();
    tp2.Server server2 = new tp2.Server();
    tp2.ITime iTime3 = server2.getTime();
    server0.setTime(iTime3);
    server0.update();
    java.lang.String str6 = server0.toString();
    tp2.IP iP7 = null;
    boolean b8 = server0.removeException(iP7);
    server0.update();
    tp2.IP iP10 = null;
    boolean b11 = server0.removeException(iP10);
    tp2.IP iP12 = null;
    boolean b13 = server0.connect(iP12);
    tp2.IP iP14 = null;
    boolean b15 = server0.connect(iP14);
    tp2.IP iP16 = null;
    boolean b17 = server0.addBan(iP16);
    long long18 = server0.getLastUpdate();
    tp2.IP iP19 = null;
    boolean b20 = server0.removeBan(iP19);
    long long21 = server0.getLastUpdate();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Server [lastUpdate=1465509742126, exceptions=(), bans={}]"+ "'", str6.equals("Server [lastUpdate=1465509742126, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long18 == 1465509742126L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long21 == 1465509742126L);

  }

  @Test
  public void test199() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test199"); }


    tp2.Server server0 = new tp2.Server();
    long long1 = server0.getLastUpdate();
    server0.update();
    tp2.IP iP3 = null;
    boolean b4 = server0.removeException(iP3);
    server0.update();
    java.lang.String str6 = server0.toString();
    tp2.IP iP7 = null;
    boolean b8 = server0.removeBan(iP7);
    server0.update();
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
    org.junit.Assert.assertTrue(long1 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Server [lastUpdate=1465509742132, exceptions=(), bans={}]"+ "'", str6.equals("Server [lastUpdate=1465509742132, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);

  }

  @Test
  public void test200() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test200"); }


    tp2.Server server0 = new tp2.Server();
    tp2.ITime iTime1 = server0.getTime();
    tp2.IP iP2 = null;
    boolean b3 = server0.removeException(iP2);
    tp2.IP iP4 = null;
    boolean b5 = server0.connect(iP4);
    tp2.IP iP6 = null;
    boolean b7 = server0.removeException(iP6);
    tp2.IP iP8 = null;
    boolean b9 = server0.connect(iP8);
    tp2.IP iP10 = null;
    boolean b11 = server0.removeException(iP10);
    long long12 = server0.getLastUpdate();
    tp2.IP iP13 = null;
    boolean b14 = server0.removeBan(iP13);
    tp2.IP iP15 = null;
    boolean b16 = server0.addBan(iP15);
    tp2.IP iP17 = null;
    boolean b18 = server0.addBan(iP17);
    tp2.IP iP19 = null;
    boolean b20 = server0.addBan(iP19);
    tp2.ITime iTime21 = server0.getTime();
    java.lang.String str22 = server0.toString();
    tp2.IP iP23 = null;
    boolean b24 = server0.removeBan(iP23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long12 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + "Server [lastUpdate=0, exceptions=(), bans={}]"+ "'", str22.equals("Server [lastUpdate=0, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);

  }

  @Test
  public void test201() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test201"); }


    tp2.Server server0 = new tp2.Server();
    long long1 = server0.getLastUpdate();
    server0.update();
    tp2.IP iP3 = null;
    boolean b4 = server0.removeException(iP3);
    server0.update();
    java.lang.String str6 = server0.toString();
    tp2.IP iP7 = null;
    boolean b8 = server0.addBan(iP7);
    java.lang.String str9 = server0.toString();
    tp2.IP iP10 = null;
    boolean b11 = server0.addBan(iP10);
    tp2.IP iP12 = null;
    boolean b13 = server0.connect(iP12);
    tp2.IP iP14 = null;
    boolean b15 = server0.removeException(iP14);
    tp2.IP iP16 = null;
    boolean b17 = server0.addBan(iP16);
    tp2.ITime iTime18 = server0.getTime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Server [lastUpdate=1465509742137, exceptions=(), bans={}]"+ "'", str6.equals("Server [lastUpdate=1465509742137, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Server [lastUpdate=1465509742137, exceptions=(), bans={}]"+ "'", str9.equals("Server [lastUpdate=1465509742137, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime18);

  }

  @Test
  public void test202() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test202"); }


    tp2.Server server0 = new tp2.Server();
    tp2.ITime iTime1 = server0.getTime();
    server0.update();
    tp2.ITime iTime3 = server0.getTime();
    long long4 = server0.getLastUpdate();
    long long5 = server0.getLastUpdate();
    long long6 = server0.getLastUpdate();
    java.lang.String str7 = server0.toString();
    tp2.IP iP8 = null;
    boolean b9 = server0.connect(iP8);
    long long10 = server0.getLastUpdate();
    long long11 = server0.getLastUpdate();
    tp2.IP iP12 = null;
    boolean b13 = server0.addBan(iP12);
    java.lang.String str14 = server0.toString();
    tp2.IP iP15 = null;
    boolean b16 = server0.removeException(iP15);
    tp2.IP iP17 = null;
    boolean b18 = server0.removeBan(iP17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long4 == 1465509742138L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long5 == 1465509742138L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long6 == 1465509742138L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Server [lastUpdate=1465509742138, exceptions=(), bans={}]"+ "'", str7.equals("Server [lastUpdate=1465509742138, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long10 == 1465509742138L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long11 == 1465509742138L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "Server [lastUpdate=1465509742138, exceptions=(), bans={}]"+ "'", str14.equals("Server [lastUpdate=1465509742138, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);

  }

  @Test
  public void test203() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test203"); }


    tp2.Server server0 = new tp2.Server();
    tp2.ITime iTime1 = server0.getTime();
    server0.update();
    tp2.ITime iTime3 = server0.getTime();
    tp2.IP iP4 = null;
    boolean b5 = server0.connect(iP4);
    tp2.IP iP6 = null;
    boolean b7 = server0.removeBan(iP6);
    tp2.IP iP8 = null;
    boolean b9 = server0.connect(iP8);
    tp2.IP iP10 = null;
    boolean b11 = server0.connect(iP10);
    tp2.IP iP12 = null;
    boolean b13 = server0.removeException(iP12);
    tp2.ITime iTime14 = server0.getTime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime14);

  }

  @Test
  public void test204() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test204"); }


    tp2.Server server0 = new tp2.Server();
    tp2.ITime iTime1 = server0.getTime();
    long long2 = server0.getLastUpdate();
    java.lang.String str3 = server0.toString();
    tp2.ITime iTime4 = server0.getTime();
    tp2.ITime iTime5 = server0.getTime();
    tp2.IP iP6 = null;
    boolean b7 = server0.addBan(iP6);
    tp2.ITime iTime8 = server0.getTime();
    tp2.Server server9 = new tp2.Server();
    tp2.ITime iTime10 = server9.getTime();
    long long11 = server9.getLastUpdate();
    tp2.IP iP12 = null;
    boolean b13 = server9.removeBan(iP12);
    tp2.IP iP14 = null;
    boolean b15 = server9.removeBan(iP14);
    long long16 = server9.getLastUpdate();
    tp2.IP iP17 = null;
    boolean b18 = server9.connect(iP17);
    tp2.IP iP19 = null;
    boolean b20 = server9.removeBan(iP19);
    tp2.Server server21 = new tp2.Server();
    tp2.IP iP22 = null;
    boolean b23 = server21.removeBan(iP22);
    tp2.IP iP24 = null;
    boolean b25 = server21.connect(iP24);
    long long26 = server21.getLastUpdate();
    tp2.ITime iTime27 = server21.getTime();
    server9.setTime(iTime27);
    server0.setTime(iTime27);
    tp2.IP iP30 = null;
    boolean b31 = server0.removeException(iP30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long2 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Server [lastUpdate=0, exceptions=(), bans={}]"+ "'", str3.equals("Server [lastUpdate=0, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long11 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long16 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long26 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == false);

  }

  @Test
  public void test205() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test205"); }


    tp2.Server server0 = new tp2.Server();
    tp2.ITime iTime1 = server0.getTime();
    tp2.IP iP2 = null;
    boolean b3 = server0.removeException(iP2);
    tp2.IP iP4 = null;
    boolean b5 = server0.connect(iP4);
    tp2.IP iP6 = null;
    boolean b7 = server0.removeException(iP6);
    tp2.IP iP8 = null;
    boolean b9 = server0.connect(iP8);
    tp2.IP iP10 = null;
    boolean b11 = server0.removeException(iP10);
    tp2.Server server12 = new tp2.Server();
    tp2.ITime iTime13 = server12.getTime();
    server12.update();
    tp2.ITime iTime15 = server12.getTime();
    server0.setTime(iTime15);
    tp2.Server server17 = new tp2.Server();
    tp2.ITime iTime18 = server17.getTime();
    server17.update();
    tp2.ITime iTime20 = server17.getTime();
    server0.setTime(iTime20);
    tp2.IP iP22 = null;
    boolean b23 = server0.addBan(iP22);
    tp2.IP iP24 = null;
    boolean b25 = server0.connect(iP24);
    long long26 = server0.getLastUpdate();
    long long27 = server0.getLastUpdate();
    tp2.IP iP28 = null;
    boolean b29 = server0.removeException(iP28);
    tp2.IP iP30 = null;
    // The following exception was thrown during execution in test generation
    try {
      boolean b31 = server0.addException(iP30);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long26 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long27 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == false);

  }

  @Test
  public void test206() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test206"); }


    tp2.Server server0 = new tp2.Server();
    tp2.ITime iTime1 = server0.getTime();
    tp2.IP iP2 = null;
    boolean b3 = server0.removeException(iP2);
    tp2.IP iP4 = null;
    boolean b5 = server0.connect(iP4);
    server0.update();
    long long7 = server0.getLastUpdate();
    tp2.IP iP8 = null;
    boolean b9 = server0.addBan(iP8);
    tp2.ITime iTime10 = server0.getTime();
    tp2.IP iP11 = null;
    boolean b12 = server0.addBan(iP11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long7 == 1465509742158L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);

  }

  @Test
  public void test207() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test207"); }


    tp2.Server server0 = new tp2.Server();
    tp2.ITime iTime1 = server0.getTime();
    server0.update();
    tp2.ITime iTime3 = server0.getTime();
    long long4 = server0.getLastUpdate();
    long long5 = server0.getLastUpdate();
    tp2.IP iP6 = null;
    boolean b7 = server0.addBan(iP6);
    tp2.IP iP8 = null;
    boolean b9 = server0.removeBan(iP8);
    tp2.ITime iTime10 = null;
    server0.setTime(iTime10);
    tp2.IP iP12 = null;
    boolean b13 = server0.connect(iP12);
    tp2.Server server14 = new tp2.Server();
    long long15 = server14.getLastUpdate();
    server14.update();
    tp2.IP iP17 = null;
    boolean b18 = server14.removeException(iP17);
    server14.update();
    tp2.Server server20 = new tp2.Server();
    long long21 = server20.getLastUpdate();
    server20.update();
    tp2.IP iP23 = null;
    boolean b24 = server20.removeBan(iP23);
    long long25 = server20.getLastUpdate();
    server20.update();
    tp2.ITime iTime27 = server20.getTime();
    server14.setTime(iTime27);
    tp2.Server server29 = new tp2.Server();
    tp2.ITime iTime30 = server29.getTime();
    tp2.Server server31 = new tp2.Server();
    tp2.ITime iTime32 = server31.getTime();
    server29.setTime(iTime32);
    server29.update();
    java.lang.String str35 = server29.toString();
    java.lang.String str36 = server29.toString();
    tp2.IP iP37 = null;
    boolean b38 = server29.removeException(iP37);
    java.lang.String str39 = server29.toString();
    tp2.Server server40 = new tp2.Server();
    tp2.ITime iTime41 = server40.getTime();
    server40.update();
    tp2.ITime iTime43 = server40.getTime();
    tp2.Server server44 = new tp2.Server();
    long long45 = server44.getLastUpdate();
    tp2.ITime iTime46 = server44.getTime();
    server40.setTime(iTime46);
    tp2.ITime iTime48 = server40.getTime();
    server29.setTime(iTime48);
    server29.update();
    tp2.ITime iTime51 = server29.getTime();
    server14.setTime(iTime51);
    server0.setTime(iTime51);
    tp2.IP iP54 = null;
    boolean b55 = server0.connect(iP54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long4 == 1465509742160L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long5 == 1465509742160L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long15 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long21 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long25 == 1465509742161L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str35 + "' != '" + "Server [lastUpdate=1465509742162, exceptions=(), bans={}]"+ "'", str35.equals("Server [lastUpdate=1465509742162, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str36 + "' != '" + "Server [lastUpdate=1465509742162, exceptions=(), bans={}]"+ "'", str36.equals("Server [lastUpdate=1465509742162, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str39 + "' != '" + "Server [lastUpdate=1465509742162, exceptions=(), bans={}]"+ "'", str39.equals("Server [lastUpdate=1465509742162, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long45 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b55 == true);

  }

  @Test
  public void test208() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test208"); }


    tp2.Server server0 = new tp2.Server();
    long long1 = server0.getLastUpdate();
    server0.update();
    tp2.IP iP3 = null;
    boolean b4 = server0.removeBan(iP3);
    long long5 = server0.getLastUpdate();
    java.lang.String str6 = server0.toString();
    tp2.IP iP7 = null;
    boolean b8 = server0.connect(iP7);
    tp2.ITime iTime9 = server0.getTime();
    tp2.IP iP10 = null;
    boolean b11 = server0.addBan(iP10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long5 == 1465509742191L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Server [lastUpdate=1465509742191, exceptions=(), bans={}]"+ "'", str6.equals("Server [lastUpdate=1465509742191, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);

  }

  @Test
  public void test209() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test209"); }


    tp2.Server server0 = new tp2.Server();
    tp2.ITime iTime1 = server0.getTime();
    tp2.IP iP2 = null;
    boolean b3 = server0.addBan(iP2);
    java.lang.String str4 = server0.toString();
    java.lang.String str5 = server0.toString();
    long long6 = server0.getLastUpdate();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Server [lastUpdate=0, exceptions=(), bans={}]"+ "'", str4.equals("Server [lastUpdate=0, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Server [lastUpdate=0, exceptions=(), bans={}]"+ "'", str5.equals("Server [lastUpdate=0, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long6 == 0L);

  }

  @Test
  public void test210() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test210"); }


    tp2.Server server0 = new tp2.Server();
    tp2.ITime iTime1 = server0.getTime();
    tp2.IP iP2 = null;
    boolean b3 = server0.removeException(iP2);
    tp2.IP iP4 = null;
    boolean b5 = server0.connect(iP4);
    tp2.IP iP6 = null;
    boolean b7 = server0.removeException(iP6);
    tp2.IP iP8 = null;
    boolean b9 = server0.connect(iP8);
    tp2.IP iP10 = null;
    boolean b11 = server0.removeException(iP10);
    tp2.IP iP12 = null;
    boolean b13 = server0.removeBan(iP12);
    server0.update();
    tp2.IP iP15 = null;
    boolean b16 = server0.connect(iP15);
    tp2.IP iP17 = null;
    boolean b18 = server0.removeException(iP17);
    server0.update();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);

  }

  @Test
  public void test211() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test211"); }


    tp2.Server server0 = new tp2.Server();
    tp2.ITime iTime1 = server0.getTime();
    tp2.IP iP2 = null;
    boolean b3 = server0.connect(iP2);
    tp2.IP iP4 = null;
    boolean b5 = server0.removeBan(iP4);
    java.lang.String str6 = server0.toString();
    tp2.IP iP7 = null;
    boolean b8 = server0.removeException(iP7);
    tp2.Server server9 = new tp2.Server();
    tp2.ITime iTime10 = server9.getTime();
    long long11 = server9.getLastUpdate();
    tp2.IP iP12 = null;
    boolean b13 = server9.removeBan(iP12);
    tp2.Server server14 = new tp2.Server();
    tp2.ITime iTime15 = server14.getTime();
    server14.update();
    tp2.ITime iTime17 = server14.getTime();
    tp2.ITime iTime18 = server14.getTime();
    server9.setTime(iTime18);
    server0.setTime(iTime18);
    long long21 = server0.getLastUpdate();
    java.lang.String str22 = server0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Server [lastUpdate=0, exceptions=(), bans={}]"+ "'", str6.equals("Server [lastUpdate=0, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long11 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long21 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + "Server [lastUpdate=0, exceptions=(), bans={}]"+ "'", str22.equals("Server [lastUpdate=0, exceptions=(), bans={}]"));

  }

  @Test
  public void test212() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test212"); }


    tp2.Server server0 = new tp2.Server();
    tp2.ITime iTime1 = server0.getTime();
    server0.update();
    tp2.ITime iTime3 = server0.getTime();
    long long4 = server0.getLastUpdate();
    long long5 = server0.getLastUpdate();
    tp2.IP iP6 = null;
    boolean b7 = server0.addBan(iP6);
    tp2.Server server8 = new tp2.Server();
    tp2.ITime iTime9 = server8.getTime();
    tp2.IP iP10 = null;
    boolean b11 = server8.connect(iP10);
    tp2.ITime iTime12 = server8.getTime();
    tp2.ITime iTime13 = server8.getTime();
    server0.setTime(iTime13);
    tp2.IP iP15 = null;
    boolean b16 = server0.removeBan(iP15);
    long long17 = server0.getLastUpdate();
    tp2.IP iP18 = null;
    boolean b19 = server0.removeBan(iP18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long4 == 1465509742206L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long5 == 1465509742206L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long17 == 1465509742206L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);

  }

  @Test
  public void test213() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test213"); }


    tp2.Server server0 = new tp2.Server();
    tp2.ITime iTime1 = server0.getTime();
    tp2.IP iP2 = null;
    boolean b3 = server0.removeException(iP2);
    tp2.IP iP4 = null;
    boolean b5 = server0.connect(iP4);
    java.lang.String str6 = server0.toString();
    long long7 = server0.getLastUpdate();
    long long8 = server0.getLastUpdate();
    tp2.IP iP9 = null;
    boolean b10 = server0.addBan(iP9);
    server0.update();
    tp2.IP iP12 = null;
    boolean b13 = server0.connect(iP12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Server [lastUpdate=0, exceptions=(), bans={}]"+ "'", str6.equals("Server [lastUpdate=0, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long7 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long8 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);

  }

  @Test
  public void test214() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test214"); }


    tp2.Server server0 = new tp2.Server();
    long long1 = server0.getLastUpdate();
    tp2.ITime iTime2 = server0.getTime();
    tp2.IP iP3 = null;
    boolean b4 = server0.removeException(iP3);
    tp2.Server server5 = new tp2.Server();
    tp2.ITime iTime6 = server5.getTime();
    tp2.IP iP7 = null;
    boolean b8 = server5.removeException(iP7);
    tp2.IP iP9 = null;
    boolean b10 = server5.connect(iP9);
    tp2.IP iP11 = null;
    boolean b12 = server5.removeException(iP11);
    tp2.IP iP13 = null;
    boolean b14 = server5.connect(iP13);
    tp2.IP iP15 = null;
    boolean b16 = server5.removeException(iP15);
    tp2.Server server17 = new tp2.Server();
    tp2.ITime iTime18 = server17.getTime();
    server17.update();
    tp2.ITime iTime20 = server17.getTime();
    server5.setTime(iTime20);
    server0.setTime(iTime20);
    long long23 = server0.getLastUpdate();
    server0.update();
    long long25 = server0.getLastUpdate();
    tp2.IP iP26 = null;
    boolean b27 = server0.removeException(iP26);
    long long28 = server0.getLastUpdate();
    tp2.IP iP29 = null;
    boolean b30 = server0.connect(iP29);
    tp2.ITime iTime31 = server0.getTime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long23 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long25 == 1465509742217L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long28 == 1465509742217L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime31);

  }

  @Test
  public void test215() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test215"); }


    tp2.Server server0 = new tp2.Server();
    tp2.ITime iTime1 = server0.getTime();
    tp2.IP iP2 = null;
    boolean b3 = server0.removeException(iP2);
    tp2.IP iP4 = null;
    boolean b5 = server0.connect(iP4);
    tp2.IP iP6 = null;
    boolean b7 = server0.removeException(iP6);
    tp2.IP iP8 = null;
    boolean b9 = server0.connect(iP8);
    tp2.IP iP10 = null;
    boolean b11 = server0.removeException(iP10);
    tp2.Server server12 = new tp2.Server();
    tp2.ITime iTime13 = server12.getTime();
    server12.update();
    tp2.ITime iTime15 = server12.getTime();
    server0.setTime(iTime15);
    tp2.Server server17 = new tp2.Server();
    tp2.ITime iTime18 = server17.getTime();
    server17.update();
    tp2.ITime iTime20 = server17.getTime();
    server0.setTime(iTime20);
    tp2.IP iP22 = null;
    boolean b23 = server0.addBan(iP22);
    long long24 = server0.getLastUpdate();
    tp2.IP iP25 = null;
    boolean b26 = server0.removeException(iP25);
    tp2.IP iP27 = null;
    boolean b28 = server0.removeException(iP27);
    tp2.IP iP29 = null;
    boolean b30 = server0.addBan(iP29);
    tp2.IP iP31 = null;
    boolean b32 = server0.addBan(iP31);
    tp2.ITime iTime33 = server0.getTime();
    server0.update();
    tp2.IP iP35 = null;
    // The following exception was thrown during execution in test generation
    try {
      boolean b36 = server0.addException(iP35);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long24 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime33);

  }

  @Test
  public void test216() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test216"); }


    tp2.Server server0 = new tp2.Server();
    tp2.ITime iTime1 = server0.getTime();
    server0.update();
    tp2.Server server3 = new tp2.Server();
    long long4 = server3.getLastUpdate();
    tp2.ITime iTime5 = server3.getTime();
    server0.setTime(iTime5);
    long long7 = server0.getLastUpdate();
    tp2.Server server8 = new tp2.Server();
    tp2.ITime iTime9 = server8.getTime();
    tp2.Server server10 = new tp2.Server();
    tp2.ITime iTime11 = server10.getTime();
    server8.setTime(iTime11);
    tp2.ITime iTime13 = server8.getTime();
    tp2.IP iP14 = null;
    boolean b15 = server8.addBan(iP14);
    tp2.Server server16 = new tp2.Server();
    tp2.ITime iTime17 = server16.getTime();
    tp2.ITime iTime18 = server16.getTime();
    server8.setTime(iTime18);
    server0.setTime(iTime18);
    long long21 = server0.getLastUpdate();
    tp2.IP iP22 = null;
    boolean b23 = server0.removeException(iP22);
    long long24 = server0.getLastUpdate();
    tp2.IP iP25 = null;
    // The following exception was thrown during execution in test generation
    try {
      boolean b26 = server0.addException(iP25);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long4 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long7 == 1465509742229L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long21 == 1465509742229L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long24 == 1465509742229L);

  }

  @Test
  public void test217() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test217"); }


    tp2.Server server0 = new tp2.Server();
    long long1 = server0.getLastUpdate();
    server0.update();
    tp2.IP iP3 = null;
    boolean b4 = server0.removeBan(iP3);
    java.lang.String str5 = server0.toString();
    server0.update();
    tp2.IP iP7 = null;
    boolean b8 = server0.addBan(iP7);
    long long9 = server0.getLastUpdate();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Server [lastUpdate=1465509742231, exceptions=(), bans={}]"+ "'", str5.equals("Server [lastUpdate=1465509742231, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long9 == 1465509742231L);

  }

  @Test
  public void test218() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test218"); }


    tp2.Server server0 = new tp2.Server();
    tp2.ITime iTime1 = server0.getTime();
    tp2.IP iP2 = null;
    boolean b3 = server0.connect(iP2);
    tp2.ITime iTime4 = server0.getTime();
    tp2.Server server5 = new tp2.Server();
    tp2.ITime iTime6 = server5.getTime();
    tp2.IP iP7 = null;
    boolean b8 = server5.connect(iP7);
    tp2.IP iP9 = null;
    boolean b10 = server5.removeBan(iP9);
    java.lang.String str11 = server5.toString();
    tp2.IP iP12 = null;
    boolean b13 = server5.removeException(iP12);
    long long14 = server5.getLastUpdate();
    tp2.Server server15 = new tp2.Server();
    tp2.ITime iTime16 = server15.getTime();
    tp2.Server server17 = new tp2.Server();
    tp2.ITime iTime18 = server17.getTime();
    server15.setTime(iTime18);
    server15.update();
    java.lang.String str21 = server15.toString();
    tp2.Server server22 = new tp2.Server();
    long long23 = server22.getLastUpdate();
    tp2.ITime iTime24 = server22.getTime();
    tp2.IP iP25 = null;
    boolean b26 = server22.removeException(iP25);
    tp2.Server server27 = new tp2.Server();
    tp2.ITime iTime28 = server27.getTime();
    tp2.IP iP29 = null;
    boolean b30 = server27.removeException(iP29);
    tp2.IP iP31 = null;
    boolean b32 = server27.connect(iP31);
    tp2.IP iP33 = null;
    boolean b34 = server27.removeException(iP33);
    tp2.IP iP35 = null;
    boolean b36 = server27.connect(iP35);
    tp2.IP iP37 = null;
    boolean b38 = server27.removeException(iP37);
    tp2.Server server39 = new tp2.Server();
    tp2.ITime iTime40 = server39.getTime();
    server39.update();
    tp2.ITime iTime42 = server39.getTime();
    server27.setTime(iTime42);
    server22.setTime(iTime42);
    server15.setTime(iTime42);
    server5.setTime(iTime42);
    server0.setTime(iTime42);
    tp2.IP iP48 = null;
    boolean b49 = server0.removeException(iP48);
    tp2.IP iP50 = null;
    boolean b51 = server0.removeBan(iP50);
    tp2.IP iP52 = null;
    boolean b53 = server0.removeException(iP52);
    tp2.IP iP54 = null;
    boolean b55 = server0.connect(iP54);
    server0.update();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Server [lastUpdate=0, exceptions=(), bans={}]"+ "'", str11.equals("Server [lastUpdate=0, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long14 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "Server [lastUpdate=1465509742233, exceptions=(), bans={}]"+ "'", str21.equals("Server [lastUpdate=1465509742233, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long23 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b49 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b51 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b53 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b55 == true);

  }

  @Test
  public void test219() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test219"); }


    tp2.Server server0 = new tp2.Server();
    tp2.ITime iTime1 = server0.getTime();
    tp2.Server server2 = new tp2.Server();
    tp2.ITime iTime3 = server2.getTime();
    server0.setTime(iTime3);
    tp2.IP iP5 = null;
    boolean b6 = server0.connect(iP5);
    tp2.IP iP7 = null;
    boolean b8 = server0.connect(iP7);
    tp2.Server server9 = new tp2.Server();
    tp2.ITime iTime10 = server9.getTime();
    server9.update();
    tp2.ITime iTime12 = server9.getTime();
    tp2.IP iP13 = null;
    boolean b14 = server9.addBan(iP13);
    tp2.IP iP15 = null;
    boolean b16 = server9.removeException(iP15);
    tp2.Server server17 = new tp2.Server();
    tp2.ITime iTime18 = server17.getTime();
    server17.update();
    tp2.Server server20 = new tp2.Server();
    long long21 = server20.getLastUpdate();
    tp2.ITime iTime22 = server20.getTime();
    server17.setTime(iTime22);
    server9.setTime(iTime22);
    server0.setTime(iTime22);
    java.lang.String str26 = server0.toString();
    tp2.Server server27 = new tp2.Server();
    tp2.ITime iTime28 = server27.getTime();
    server27.update();
    tp2.ITime iTime30 = server27.getTime();
    tp2.IP iP31 = null;
    boolean b32 = server27.removeBan(iP31);
    tp2.Server server33 = new tp2.Server();
    tp2.ITime iTime34 = server33.getTime();
    tp2.IP iP35 = null;
    boolean b36 = server33.removeException(iP35);
    tp2.IP iP37 = null;
    boolean b38 = server33.connect(iP37);
    tp2.IP iP39 = null;
    boolean b40 = server33.removeException(iP39);
    tp2.IP iP41 = null;
    boolean b42 = server33.connect(iP41);
    tp2.IP iP43 = null;
    boolean b44 = server33.removeException(iP43);
    long long45 = server33.getLastUpdate();
    java.lang.String str46 = server33.toString();
    tp2.Server server47 = new tp2.Server();
    tp2.ITime iTime48 = server47.getTime();
    tp2.Server server49 = new tp2.Server();
    tp2.ITime iTime50 = server49.getTime();
    server47.setTime(iTime50);
    server47.update();
    server47.update();
    tp2.ITime iTime54 = server47.getTime();
    server33.setTime(iTime54);
    server27.setTime(iTime54);
    server0.setTime(iTime54);
    tp2.IP iP58 = null;
    boolean b59 = server0.connect(iP58);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long21 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str26 + "' != '" + "Server [lastUpdate=0, exceptions=(), bans={}]"+ "'", str26.equals("Server [lastUpdate=0, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long45 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str46 + "' != '" + "Server [lastUpdate=0, exceptions=(), bans={}]"+ "'", str46.equals("Server [lastUpdate=0, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b59 == true);

  }

  @Test
  public void test220() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test220"); }


    tp2.Server server0 = new tp2.Server();
    tp2.ITime iTime1 = server0.getTime();
    long long2 = server0.getLastUpdate();
    tp2.IP iP3 = null;
    boolean b4 = server0.addBan(iP3);
    tp2.IP iP5 = null;
    boolean b6 = server0.addBan(iP5);
    tp2.IP iP7 = null;
    boolean b8 = server0.removeException(iP7);
    long long9 = server0.getLastUpdate();
    long long10 = server0.getLastUpdate();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long2 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long9 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long10 == 0L);

  }

  @Test
  public void test221() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test221"); }


    tp2.Server server0 = new tp2.Server();
    long long1 = server0.getLastUpdate();
    server0.update();
    tp2.IP iP3 = null;
    boolean b4 = server0.removeBan(iP3);
    java.lang.String str5 = server0.toString();
    server0.update();
    tp2.ITime iTime7 = server0.getTime();
    tp2.IP iP8 = null;
    boolean b9 = server0.removeException(iP8);
    tp2.IP iP10 = null;
    boolean b11 = server0.removeBan(iP10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Server [lastUpdate=1465509742304, exceptions=(), bans={}]"+ "'", str5.equals("Server [lastUpdate=1465509742304, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);

  }

  @Test
  public void test222() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test222"); }


    tp2.Server server0 = new tp2.Server();
    tp2.ITime iTime1 = server0.getTime();
    server0.update();
    tp2.ITime iTime3 = server0.getTime();
    tp2.IP iP4 = null;
    boolean b5 = server0.addBan(iP4);
    tp2.IP iP6 = null;
    boolean b7 = server0.removeException(iP6);
    tp2.Server server8 = new tp2.Server();
    tp2.ITime iTime9 = server8.getTime();
    server8.update();
    tp2.Server server11 = new tp2.Server();
    long long12 = server11.getLastUpdate();
    tp2.ITime iTime13 = server11.getTime();
    server8.setTime(iTime13);
    server0.setTime(iTime13);
    tp2.IP iP16 = null;
    boolean b17 = server0.addBan(iP16);
    tp2.ITime iTime18 = server0.getTime();
    tp2.Server server19 = new tp2.Server();
    long long20 = server19.getLastUpdate();
    server19.update();
    tp2.IP iP22 = null;
    boolean b23 = server19.removeException(iP22);
    server19.update();
    java.lang.String str25 = server19.toString();
    tp2.IP iP26 = null;
    boolean b27 = server19.removeBan(iP26);
    tp2.IP iP28 = null;
    boolean b29 = server19.connect(iP28);
    tp2.ITime iTime30 = server19.getTime();
    server0.setTime(iTime30);
    tp2.IP iP32 = null;
    boolean b33 = server0.addBan(iP32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long12 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long20 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + "Server [lastUpdate=1465509742306, exceptions=(), bans={}]"+ "'", str25.equals("Server [lastUpdate=1465509742306, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == false);

  }

  @Test
  public void test223() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test223"); }


    tp2.Server server0 = new tp2.Server();
    tp2.ITime iTime1 = server0.getTime();
    server0.update();
    tp2.ITime iTime3 = server0.getTime();
    tp2.Server server4 = new tp2.Server();
    long long5 = server4.getLastUpdate();
    tp2.ITime iTime6 = server4.getTime();
    server0.setTime(iTime6);
    tp2.IP iP8 = null;
    boolean b9 = server0.removeException(iP8);
    tp2.IP iP10 = null;
    boolean b11 = server0.removeException(iP10);
    long long12 = server0.getLastUpdate();
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
    org.junit.Assert.assertNotNull(iTime1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long5 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long12 == 1465509742317L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);

  }

  @Test
  public void test224() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test224"); }


    tp2.Server server0 = new tp2.Server();
    tp2.ITime iTime1 = server0.getTime();
    long long2 = server0.getLastUpdate();
    tp2.IP iP3 = null;
    boolean b4 = server0.removeBan(iP3);
    tp2.IP iP5 = null;
    boolean b6 = server0.removeBan(iP5);
    tp2.IP iP7 = null;
    boolean b8 = server0.addBan(iP7);
    tp2.Server server9 = new tp2.Server();
    tp2.ITime iTime10 = server9.getTime();
    tp2.ITime iTime11 = server9.getTime();
    server0.setTime(iTime11);
    tp2.IP iP13 = null;
    boolean b14 = server0.addBan(iP13);
    long long15 = server0.getLastUpdate();
    long long16 = server0.getLastUpdate();
    tp2.ITime iTime17 = server0.getTime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long2 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long15 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long16 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime17);

  }

  @Test
  public void test225() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test225"); }


    tp2.Server server0 = new tp2.Server();
    tp2.ITime iTime1 = server0.getTime();
    server0.update();
    tp2.ITime iTime3 = server0.getTime();
    long long4 = server0.getLastUpdate();
    long long5 = server0.getLastUpdate();
    tp2.IP iP6 = null;
    boolean b7 = server0.addBan(iP6);
    tp2.Server server8 = new tp2.Server();
    tp2.ITime iTime9 = server8.getTime();
    tp2.IP iP10 = null;
    boolean b11 = server8.connect(iP10);
    tp2.ITime iTime12 = server8.getTime();
    tp2.ITime iTime13 = server8.getTime();
    server0.setTime(iTime13);
    long long15 = server0.getLastUpdate();
    tp2.IP iP16 = null;
    boolean b17 = server0.connect(iP16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long4 == 1465509742324L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long5 == 1465509742324L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long15 == 1465509742324L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);

  }

  @Test
  public void test226() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test226"); }


    tp2.Server server0 = new tp2.Server();
    tp2.ITime iTime1 = server0.getTime();
    server0.update();
    tp2.ITime iTime3 = server0.getTime();
    long long4 = server0.getLastUpdate();
    long long5 = server0.getLastUpdate();
    server0.update();
    server0.update();
    tp2.IP iP8 = null;
    boolean b9 = server0.connect(iP8);
    server0.update();
    tp2.IP iP11 = null;
    boolean b12 = server0.removeException(iP11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long4 == 1465509742331L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long5 == 1465509742331L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);

  }

  @Test
  public void test227() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test227"); }


    tp2.Server server0 = new tp2.Server();
    tp2.ITime iTime1 = server0.getTime();
    server0.update();
    tp2.IP iP3 = null;
    boolean b4 = server0.connect(iP3);
    tp2.IP iP5 = null;
    boolean b6 = server0.removeBan(iP5);
    server0.update();
    tp2.ITime iTime8 = server0.getTime();
    server0.update();
    tp2.IP iP10 = null;
    boolean b11 = server0.connect(iP10);
    tp2.Server server12 = new tp2.Server();
    long long13 = server12.getLastUpdate();
    server12.update();
    tp2.IP iP15 = null;
    boolean b16 = server12.removeBan(iP15);
    long long17 = server12.getLastUpdate();
    tp2.Server server18 = new tp2.Server();
    tp2.ITime iTime19 = server18.getTime();
    tp2.IP iP20 = null;
    boolean b21 = server18.removeException(iP20);
    tp2.ITime iTime22 = server18.getTime();
    tp2.ITime iTime23 = server18.getTime();
    server12.setTime(iTime23);
    java.lang.String str25 = server12.toString();
    tp2.ITime iTime26 = server12.getTime();
    server0.setTime(iTime26);
    tp2.IP iP28 = null;
    boolean b29 = server0.removeBan(iP28);
    java.lang.String str30 = server0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long13 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long17 == 1465509742334L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + "Server [lastUpdate=1465509742334, exceptions=(), bans={}]"+ "'", str25.equals("Server [lastUpdate=1465509742334, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str30 + "' != '" + "Server [lastUpdate=1465509742333, exceptions=(), bans={}]"+ "'", str30.equals("Server [lastUpdate=1465509742333, exceptions=(), bans={}]"));

  }

  @Test
  public void test228() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test228"); }


    tp2.Server server0 = new tp2.Server();
    tp2.ITime iTime1 = server0.getTime();
    tp2.Server server2 = new tp2.Server();
    tp2.ITime iTime3 = server2.getTime();
    server0.setTime(iTime3);
    server0.update();
    java.lang.String str6 = server0.toString();
    java.lang.String str7 = server0.toString();
    tp2.IP iP8 = null;
    boolean b9 = server0.removeException(iP8);
    java.lang.String str10 = server0.toString();
    tp2.Server server11 = new tp2.Server();
    tp2.ITime iTime12 = server11.getTime();
    server11.update();
    tp2.ITime iTime14 = server11.getTime();
    tp2.Server server15 = new tp2.Server();
    long long16 = server15.getLastUpdate();
    tp2.ITime iTime17 = server15.getTime();
    server11.setTime(iTime17);
    tp2.ITime iTime19 = server11.getTime();
    server0.setTime(iTime19);
    tp2.Server server21 = new tp2.Server();
    tp2.ITime iTime22 = server21.getTime();
    tp2.IP iP23 = null;
    boolean b24 = server21.removeException(iP23);
    tp2.IP iP25 = null;
    boolean b26 = server21.connect(iP25);
    tp2.IP iP27 = null;
    boolean b28 = server21.removeException(iP27);
    tp2.IP iP29 = null;
    boolean b30 = server21.connect(iP29);
    tp2.IP iP31 = null;
    boolean b32 = server21.removeException(iP31);
    long long33 = server21.getLastUpdate();
    java.lang.String str34 = server21.toString();
    tp2.Server server35 = new tp2.Server();
    tp2.ITime iTime36 = server35.getTime();
    tp2.Server server37 = new tp2.Server();
    tp2.ITime iTime38 = server37.getTime();
    server35.setTime(iTime38);
    server35.update();
    server35.update();
    tp2.ITime iTime42 = server35.getTime();
    server21.setTime(iTime42);
    long long44 = server21.getLastUpdate();
    tp2.Server server45 = new tp2.Server();
    tp2.ITime iTime46 = server45.getTime();
    server45.update();
    tp2.ITime iTime48 = server45.getTime();
    long long49 = server45.getLastUpdate();
    long long50 = server45.getLastUpdate();
    long long51 = server45.getLastUpdate();
    tp2.Server server52 = new tp2.Server();
    tp2.ITime iTime53 = server52.getTime();
    server52.update();
    tp2.ITime iTime55 = server52.getTime();
    tp2.IP iP56 = null;
    boolean b57 = server52.addBan(iP56);
    tp2.IP iP58 = null;
    boolean b59 = server52.removeException(iP58);
    tp2.ITime iTime60 = server52.getTime();
    server45.setTime(iTime60);
    server21.setTime(iTime60);
    server0.setTime(iTime60);
    server0.update();
    long long65 = server0.getLastUpdate();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Server [lastUpdate=1465509742346, exceptions=(), bans={}]"+ "'", str6.equals("Server [lastUpdate=1465509742346, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Server [lastUpdate=1465509742346, exceptions=(), bans={}]"+ "'", str7.equals("Server [lastUpdate=1465509742346, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Server [lastUpdate=1465509742346, exceptions=(), bans={}]"+ "'", str10.equals("Server [lastUpdate=1465509742346, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long16 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long33 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str34 + "' != '" + "Server [lastUpdate=0, exceptions=(), bans={}]"+ "'", str34.equals("Server [lastUpdate=0, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long44 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long49 == 1465509742349L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long50 == 1465509742349L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long51 == 1465509742349L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime55);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b57 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b59 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime60);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long65 == 1465509742350L);

  }

  @Test
  public void test229() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test229"); }


    tp2.Server server0 = new tp2.Server();
    tp2.ITime iTime1 = server0.getTime();
    tp2.IP iP2 = null;
    boolean b3 = server0.removeException(iP2);
    tp2.IP iP4 = null;
    boolean b5 = server0.connect(iP4);
    tp2.IP iP6 = null;
    boolean b7 = server0.removeException(iP6);
    tp2.IP iP8 = null;
    boolean b9 = server0.connect(iP8);
    tp2.IP iP10 = null;
    boolean b11 = server0.removeException(iP10);
    long long12 = server0.getLastUpdate();
    tp2.ITime iTime13 = server0.getTime();
    tp2.IP iP14 = null;
    boolean b15 = server0.connect(iP14);
    tp2.IP iP16 = null;
    boolean b17 = server0.removeBan(iP16);
    tp2.ITime iTime18 = server0.getTime();
    long long19 = server0.getLastUpdate();
    tp2.IP iP20 = null;
    // The following exception was thrown during execution in test generation
    try {
      boolean b21 = server0.addException(iP20);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long12 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long19 == 0L);

  }

  @Test
  public void test230() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test230"); }


    tp2.Server server0 = new tp2.Server();
    tp2.ITime iTime1 = server0.getTime();
    server0.update();
    tp2.ITime iTime3 = server0.getTime();
    tp2.IP iP4 = null;
    boolean b5 = server0.addBan(iP4);
    tp2.IP iP6 = null;
    boolean b7 = server0.removeException(iP6);
    tp2.IP iP8 = null;
    boolean b9 = server0.addBan(iP8);
    java.lang.String str10 = server0.toString();
    tp2.IP iP11 = null;
    boolean b12 = server0.removeException(iP11);
    long long13 = server0.getLastUpdate();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Server [lastUpdate=1465509742404, exceptions=(), bans={}]"+ "'", str10.equals("Server [lastUpdate=1465509742404, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long13 == 1465509742404L);

  }

  @Test
  public void test231() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test231"); }


    tp2.Server server0 = new tp2.Server();
    tp2.ITime iTime1 = server0.getTime();
    server0.update();
    tp2.IP iP3 = null;
    boolean b4 = server0.removeException(iP3);
    java.lang.String str5 = server0.toString();
    long long6 = server0.getLastUpdate();
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
    org.junit.Assert.assertNotNull(iTime1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Server [lastUpdate=1465509742406, exceptions=(), bans={}]"+ "'", str5.equals("Server [lastUpdate=1465509742406, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long6 == 1465509742406L);

  }

  @Test
  public void test232() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test232"); }


    tp2.Server server0 = new tp2.Server();
    tp2.ITime iTime1 = server0.getTime();
    long long2 = server0.getLastUpdate();
    long long3 = server0.getLastUpdate();
    java.lang.String str4 = server0.toString();
    server0.update();
    tp2.IP iP6 = null;
    boolean b7 = server0.addBan(iP6);
    tp2.IP iP8 = null;
    boolean b9 = server0.removeException(iP8);
    tp2.ITime iTime10 = server0.getTime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long2 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long3 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Server [lastUpdate=0, exceptions=(), bans={}]"+ "'", str4.equals("Server [lastUpdate=0, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime10);

  }

  @Test
  public void test233() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test233"); }


    tp2.Server server0 = new tp2.Server();
    tp2.ITime iTime1 = server0.getTime();
    tp2.IP iP2 = null;
    boolean b3 = server0.removeException(iP2);
    tp2.IP iP4 = null;
    boolean b5 = server0.connect(iP4);
    tp2.IP iP6 = null;
    boolean b7 = server0.removeException(iP6);
    tp2.IP iP8 = null;
    boolean b9 = server0.connect(iP8);
    tp2.IP iP10 = null;
    boolean b11 = server0.removeException(iP10);
    tp2.IP iP12 = null;
    boolean b13 = server0.addBan(iP12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);

  }

  @Test
  public void test234() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test234"); }


    tp2.Server server0 = new tp2.Server();
    tp2.ITime iTime1 = server0.getTime();
    server0.update();
    tp2.ITime iTime3 = server0.getTime();
    java.lang.String str4 = server0.toString();
    tp2.IP iP5 = null;
    boolean b6 = server0.removeException(iP5);
    tp2.IP iP7 = null;
    boolean b8 = server0.removeException(iP7);
    tp2.IP iP9 = null;
    boolean b10 = server0.removeException(iP9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Server [lastUpdate=1465509742411, exceptions=(), bans={}]"+ "'", str4.equals("Server [lastUpdate=1465509742411, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);

  }

  @Test
  public void test235() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test235"); }


    tp2.Server server0 = new tp2.Server();
    tp2.ITime iTime1 = server0.getTime();
    tp2.Server server2 = new tp2.Server();
    tp2.ITime iTime3 = server2.getTime();
    server0.setTime(iTime3);
    server0.update();
    java.lang.String str6 = server0.toString();
    tp2.IP iP7 = null;
    boolean b8 = server0.removeException(iP7);
    server0.update();
    tp2.IP iP10 = null;
    boolean b11 = server0.removeException(iP10);
    tp2.IP iP12 = null;
    boolean b13 = server0.removeBan(iP12);
    tp2.IP iP14 = null;
    boolean b15 = server0.removeBan(iP14);
    long long16 = server0.getLastUpdate();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Server [lastUpdate=1465509742416, exceptions=(), bans={}]"+ "'", str6.equals("Server [lastUpdate=1465509742416, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long16 == 1465509742416L);

  }

  @Test
  public void test236() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test236"); }


    tp2.Server server0 = new tp2.Server();
    tp2.ITime iTime1 = server0.getTime();
    server0.update();
    tp2.ITime iTime3 = server0.getTime();
    tp2.IP iP4 = null;
    boolean b5 = server0.addBan(iP4);
    tp2.IP iP6 = null;
    boolean b7 = server0.removeException(iP6);
    tp2.IP iP8 = null;
    boolean b9 = server0.addBan(iP8);
    tp2.IP iP10 = null;
    boolean b11 = server0.connect(iP10);
    tp2.IP iP12 = null;
    boolean b13 = server0.removeException(iP12);
    tp2.IP iP14 = null;
    boolean b15 = server0.connect(iP14);
    tp2.IP iP16 = null;
    boolean b17 = server0.removeException(iP16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);

  }

  @Test
  public void test237() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test237"); }


    tp2.Server server0 = new tp2.Server();
    tp2.ITime iTime1 = server0.getTime();
    server0.update();
    tp2.ITime iTime3 = server0.getTime();
    tp2.IP iP4 = null;
    boolean b5 = server0.removeBan(iP4);
    tp2.Server server6 = new tp2.Server();
    tp2.ITime iTime7 = server6.getTime();
    tp2.IP iP8 = null;
    boolean b9 = server6.removeException(iP8);
    tp2.IP iP10 = null;
    boolean b11 = server6.connect(iP10);
    tp2.IP iP12 = null;
    boolean b13 = server6.removeException(iP12);
    tp2.IP iP14 = null;
    boolean b15 = server6.connect(iP14);
    tp2.IP iP16 = null;
    boolean b17 = server6.removeException(iP16);
    long long18 = server6.getLastUpdate();
    java.lang.String str19 = server6.toString();
    tp2.Server server20 = new tp2.Server();
    tp2.ITime iTime21 = server20.getTime();
    tp2.Server server22 = new tp2.Server();
    tp2.ITime iTime23 = server22.getTime();
    server20.setTime(iTime23);
    server20.update();
    server20.update();
    tp2.ITime iTime27 = server20.getTime();
    server6.setTime(iTime27);
    server0.setTime(iTime27);
    tp2.IP iP30 = null;
    boolean b31 = server0.removeException(iP30);
    server0.update();
    long long33 = server0.getLastUpdate();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long18 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "Server [lastUpdate=0, exceptions=(), bans={}]"+ "'", str19.equals("Server [lastUpdate=0, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long33 == 1465509742426L);

  }

  @Test
  public void test238() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test238"); }


    tp2.Server server0 = new tp2.Server();
    tp2.ITime iTime1 = server0.getTime();
    tp2.IP iP2 = null;
    boolean b3 = server0.removeException(iP2);
    tp2.IP iP4 = null;
    boolean b5 = server0.connect(iP4);
    tp2.IP iP6 = null;
    boolean b7 = server0.removeException(iP6);
    server0.update();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);

  }

  @Test
  public void test239() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test239"); }


    tp2.Server server0 = new tp2.Server();
    tp2.ITime iTime1 = server0.getTime();
    server0.update();
    tp2.ITime iTime3 = server0.getTime();
    tp2.IP iP4 = null;
    boolean b5 = server0.addBan(iP4);
    tp2.IP iP6 = null;
    boolean b7 = server0.removeException(iP6);
    tp2.Server server8 = new tp2.Server();
    tp2.ITime iTime9 = server8.getTime();
    server8.update();
    tp2.Server server11 = new tp2.Server();
    long long12 = server11.getLastUpdate();
    tp2.ITime iTime13 = server11.getTime();
    server8.setTime(iTime13);
    server0.setTime(iTime13);
    tp2.IP iP16 = null;
    boolean b17 = server0.removeException(iP16);
    tp2.ITime iTime18 = server0.getTime();
    long long19 = server0.getLastUpdate();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long12 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long19 == 1465509742439L);

  }

  @Test
  public void test240() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test240"); }


    tp2.Server server0 = new tp2.Server();
    tp2.ITime iTime1 = server0.getTime();
    tp2.IP iP2 = null;
    boolean b3 = server0.removeException(iP2);
    tp2.IP iP4 = null;
    boolean b5 = server0.connect(iP4);
    tp2.IP iP6 = null;
    boolean b7 = server0.removeException(iP6);
    tp2.IP iP8 = null;
    boolean b9 = server0.connect(iP8);
    tp2.IP iP10 = null;
    boolean b11 = server0.removeException(iP10);
    long long12 = server0.getLastUpdate();
    java.lang.String str13 = server0.toString();
    tp2.Server server14 = new tp2.Server();
    tp2.ITime iTime15 = server14.getTime();
    tp2.Server server16 = new tp2.Server();
    tp2.ITime iTime17 = server16.getTime();
    server14.setTime(iTime17);
    server14.update();
    server14.update();
    tp2.ITime iTime21 = server14.getTime();
    server0.setTime(iTime21);
    tp2.Server server23 = new tp2.Server();
    tp2.IP iP24 = null;
    boolean b25 = server23.removeException(iP24);
    java.lang.String str26 = server23.toString();
    tp2.ITime iTime27 = server23.getTime();
    server0.setTime(iTime27);
    tp2.IP iP29 = null;
    boolean b30 = server0.addBan(iP29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long12 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Server [lastUpdate=0, exceptions=(), bans={}]"+ "'", str13.equals("Server [lastUpdate=0, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str26 + "' != '" + "Server [lastUpdate=0, exceptions=(), bans={}]"+ "'", str26.equals("Server [lastUpdate=0, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);

  }

  @Test
  public void test241() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test241"); }


    tp2.Server server0 = new tp2.Server();
    tp2.ITime iTime1 = server0.getTime();
    tp2.IP iP2 = null;
    boolean b3 = server0.removeException(iP2);
    java.lang.String str4 = server0.toString();
    java.lang.String str5 = server0.toString();
    tp2.Server server6 = new tp2.Server();
    long long7 = server6.getLastUpdate();
    server6.update();
    tp2.IP iP9 = null;
    boolean b10 = server6.removeBan(iP9);
    long long11 = server6.getLastUpdate();
    tp2.Server server12 = new tp2.Server();
    tp2.ITime iTime13 = server12.getTime();
    tp2.IP iP14 = null;
    boolean b15 = server12.removeException(iP14);
    tp2.ITime iTime16 = server12.getTime();
    tp2.ITime iTime17 = server12.getTime();
    server6.setTime(iTime17);
    server0.setTime(iTime17);
    long long20 = server0.getLastUpdate();
    long long21 = server0.getLastUpdate();
    tp2.ITime iTime22 = server0.getTime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Server [lastUpdate=0, exceptions=(), bans={}]"+ "'", str4.equals("Server [lastUpdate=0, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Server [lastUpdate=0, exceptions=(), bans={}]"+ "'", str5.equals("Server [lastUpdate=0, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long7 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long11 == 1465509742460L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long20 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long21 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime22);

  }

  @Test
  public void test242() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test242"); }


    tp2.Server server0 = new tp2.Server();
    tp2.ITime iTime1 = server0.getTime();
    tp2.IP iP2 = null;
    boolean b3 = server0.connect(iP2);
    tp2.ITime iTime4 = server0.getTime();
    tp2.IP iP5 = null;
    boolean b6 = server0.addBan(iP5);
    server0.update();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);

  }

  @Test
  public void test243() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test243"); }


    tp2.Server server0 = new tp2.Server();
    tp2.ITime iTime1 = server0.getTime();
    long long2 = server0.getLastUpdate();
    tp2.IP iP3 = null;
    boolean b4 = server0.addBan(iP3);
    server0.update();
    tp2.IP iP6 = null;
    boolean b7 = server0.addBan(iP6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long2 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);

  }

  @Test
  public void test244() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test244"); }


    tp2.Server server0 = new tp2.Server();
    tp2.ITime iTime1 = server0.getTime();
    tp2.Server server2 = new tp2.Server();
    tp2.ITime iTime3 = server2.getTime();
    server0.setTime(iTime3);
    server0.update();
    java.lang.String str6 = server0.toString();
    tp2.IP iP7 = null;
    boolean b8 = server0.removeException(iP7);
    server0.update();
    tp2.IP iP10 = null;
    boolean b11 = server0.removeException(iP10);
    tp2.IP iP12 = null;
    boolean b13 = server0.removeException(iP12);
    tp2.IP iP14 = null;
    boolean b15 = server0.connect(iP14);
    tp2.IP iP16 = null;
    boolean b17 = server0.removeBan(iP16);
    tp2.IP iP18 = null;
    boolean b19 = server0.addBan(iP18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Server [lastUpdate=1465509742478, exceptions=(), bans={}]"+ "'", str6.equals("Server [lastUpdate=1465509742478, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);

  }

  @Test
  public void test245() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test245"); }


    tp2.Server server0 = new tp2.Server();
    tp2.ITime iTime1 = server0.getTime();
    tp2.Server server2 = new tp2.Server();
    tp2.ITime iTime3 = server2.getTime();
    server0.setTime(iTime3);
    tp2.IP iP5 = null;
    boolean b6 = server0.connect(iP5);
    tp2.IP iP7 = null;
    boolean b8 = server0.removeBan(iP7);
    tp2.ITime iTime9 = server0.getTime();
    java.lang.String str10 = server0.toString();
    tp2.IP iP11 = null;
    boolean b12 = server0.addBan(iP11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Server [lastUpdate=0, exceptions=(), bans={}]"+ "'", str10.equals("Server [lastUpdate=0, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);

  }

  @Test
  public void test246() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test246"); }


    tp2.Server server0 = new tp2.Server();
    tp2.ITime iTime1 = server0.getTime();
    tp2.Server server2 = new tp2.Server();
    tp2.ITime iTime3 = server2.getTime();
    server0.setTime(iTime3);
    server0.update();
    tp2.IP iP6 = null;
    boolean b7 = server0.removeBan(iP6);
    tp2.IP iP8 = null;
    boolean b9 = server0.removeException(iP8);
    tp2.IP iP10 = null;
    boolean b11 = server0.connect(iP10);
    tp2.IP iP12 = null;
    boolean b13 = server0.removeBan(iP12);
    tp2.ITime iTime14 = server0.getTime();
    tp2.Server server15 = new tp2.Server();
    tp2.ITime iTime16 = server15.getTime();
    server15.update();
    tp2.IP iP18 = null;
    boolean b19 = server15.connect(iP18);
    tp2.IP iP20 = null;
    boolean b21 = server15.connect(iP20);
    tp2.Server server22 = new tp2.Server();
    long long23 = server22.getLastUpdate();
    tp2.ITime iTime24 = server22.getTime();
    tp2.ITime iTime25 = server22.getTime();
    tp2.ITime iTime26 = server22.getTime();
    server15.setTime(iTime26);
    tp2.Server server28 = new tp2.Server();
    tp2.ITime iTime29 = server28.getTime();
    server28.update();
    tp2.ITime iTime31 = server28.getTime();
    tp2.IP iP32 = null;
    boolean b33 = server28.connect(iP32);
    tp2.ITime iTime34 = server28.getTime();
    server28.update();
    tp2.IP iP36 = null;
    boolean b37 = server28.removeBan(iP36);
    tp2.ITime iTime38 = server28.getTime();
    server15.setTime(iTime38);
    server0.setTime(iTime38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long23 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime38);

  }

  @Test
  public void test247() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test247"); }


    tp2.Server server0 = new tp2.Server();
    long long1 = server0.getLastUpdate();
    server0.update();
    tp2.IP iP3 = null;
    boolean b4 = server0.removeBan(iP3);
    long long5 = server0.getLastUpdate();
    tp2.Server server6 = new tp2.Server();
    tp2.ITime iTime7 = server6.getTime();
    tp2.IP iP8 = null;
    boolean b9 = server6.removeException(iP8);
    tp2.ITime iTime10 = server6.getTime();
    tp2.ITime iTime11 = server6.getTime();
    server0.setTime(iTime11);
    java.lang.String str13 = server0.toString();
    long long14 = server0.getLastUpdate();
    tp2.IP iP15 = null;
    boolean b16 = server0.removeBan(iP15);
    tp2.Server server17 = new tp2.Server();
    tp2.ITime iTime18 = server17.getTime();
    tp2.Server server19 = new tp2.Server();
    tp2.ITime iTime20 = server19.getTime();
    server17.setTime(iTime20);
    server17.update();
    java.lang.String str23 = server17.toString();
    java.lang.String str24 = server17.toString();
    tp2.IP iP25 = null;
    boolean b26 = server17.removeException(iP25);
    java.lang.String str27 = server17.toString();
    tp2.Server server28 = new tp2.Server();
    tp2.ITime iTime29 = server28.getTime();
    server28.update();
    tp2.ITime iTime31 = server28.getTime();
    tp2.Server server32 = new tp2.Server();
    long long33 = server32.getLastUpdate();
    tp2.ITime iTime34 = server32.getTime();
    server28.setTime(iTime34);
    tp2.ITime iTime36 = server28.getTime();
    server17.setTime(iTime36);
    server17.update();
    long long39 = server17.getLastUpdate();
    tp2.Server server40 = new tp2.Server();
    tp2.ITime iTime41 = server40.getTime();
    server40.update();
    tp2.ITime iTime43 = server40.getTime();
    tp2.IP iP44 = null;
    boolean b45 = server40.connect(iP44);
    tp2.Server server46 = new tp2.Server();
    tp2.ITime iTime47 = server46.getTime();
    server46.update();
    tp2.ITime iTime49 = server46.getTime();
    tp2.IP iP50 = null;
    boolean b51 = server46.connect(iP50);
    tp2.ITime iTime52 = server46.getTime();
    server40.setTime(iTime52);
    server17.setTime(iTime52);
    server17.update();
    tp2.Server server56 = new tp2.Server();
    tp2.ITime iTime57 = server56.getTime();
    long long58 = server56.getLastUpdate();
    java.lang.String str59 = server56.toString();
    tp2.ITime iTime60 = server56.getTime();
    server17.setTime(iTime60);
    server0.setTime(iTime60);
    tp2.IP iP63 = null;
    boolean b64 = server0.addBan(iP63);
    tp2.IP iP65 = null;
    boolean b66 = server0.removeBan(iP65);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long5 == 1465509742520L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Server [lastUpdate=1465509742520, exceptions=(), bans={}]"+ "'", str13.equals("Server [lastUpdate=1465509742520, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long14 == 1465509742520L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + "Server [lastUpdate=1465509742522, exceptions=(), bans={}]"+ "'", str23.equals("Server [lastUpdate=1465509742522, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + "Server [lastUpdate=1465509742522, exceptions=(), bans={}]"+ "'", str24.equals("Server [lastUpdate=1465509742522, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str27 + "' != '" + "Server [lastUpdate=1465509742522, exceptions=(), bans={}]"+ "'", str27.equals("Server [lastUpdate=1465509742522, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long33 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long39 == 1465509742523L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b51 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long58 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str59 + "' != '" + "Server [lastUpdate=0, exceptions=(), bans={}]"+ "'", str59.equals("Server [lastUpdate=0, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime60);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b64 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b66 == false);

  }

  @Test
  public void test248() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test248"); }


    tp2.Server server0 = new tp2.Server();
    tp2.ITime iTime1 = server0.getTime();
    tp2.IP iP2 = null;
    boolean b3 = server0.connect(iP2);
    tp2.IP iP4 = null;
    boolean b5 = server0.removeBan(iP4);
    java.lang.String str6 = server0.toString();
    tp2.IP iP7 = null;
    boolean b8 = server0.removeException(iP7);
    long long9 = server0.getLastUpdate();
    tp2.IP iP10 = null;
    boolean b11 = server0.removeBan(iP10);
    tp2.IP iP12 = null;
    boolean b13 = server0.connect(iP12);
    tp2.Server server14 = new tp2.Server();
    tp2.ITime iTime15 = server14.getTime();
    server14.update();
    tp2.ITime iTime17 = server14.getTime();
    tp2.Server server18 = new tp2.Server();
    long long19 = server18.getLastUpdate();
    tp2.ITime iTime20 = server18.getTime();
    server14.setTime(iTime20);
    tp2.ITime iTime22 = server14.getTime();
    tp2.IP iP23 = null;
    boolean b24 = server14.connect(iP23);
    tp2.IP iP25 = null;
    boolean b26 = server14.connect(iP25);
    tp2.ITime iTime27 = server14.getTime();
    server0.setTime(iTime27);
    java.lang.String str29 = server0.toString();
    tp2.IP iP30 = null;
    boolean b31 = server0.removeException(iP30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Server [lastUpdate=0, exceptions=(), bans={}]"+ "'", str6.equals("Server [lastUpdate=0, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long9 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long19 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str29 + "' != '" + "Server [lastUpdate=0, exceptions=(), bans={}]"+ "'", str29.equals("Server [lastUpdate=0, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == false);

  }

  @Test
  public void test249() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test249"); }


    tp2.Server server0 = new tp2.Server();
    tp2.ITime iTime1 = server0.getTime();
    long long2 = server0.getLastUpdate();
    java.lang.String str3 = server0.toString();
    tp2.Server server4 = new tp2.Server();
    tp2.ITime iTime5 = server4.getTime();
    tp2.IP iP6 = null;
    boolean b7 = server4.removeException(iP6);
    tp2.IP iP8 = null;
    boolean b9 = server4.connect(iP8);
    tp2.IP iP10 = null;
    boolean b11 = server4.removeException(iP10);
    tp2.IP iP12 = null;
    boolean b13 = server4.connect(iP12);
    tp2.IP iP14 = null;
    boolean b15 = server4.removeException(iP14);
    tp2.Server server16 = new tp2.Server();
    tp2.ITime iTime17 = server16.getTime();
    server16.update();
    tp2.ITime iTime19 = server16.getTime();
    server4.setTime(iTime19);
    server0.setTime(iTime19);
    tp2.IP iP22 = null;
    boolean b23 = server0.removeBan(iP22);
    tp2.IP iP24 = null;
    boolean b25 = server0.addBan(iP24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long2 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Server [lastUpdate=0, exceptions=(), bans={}]"+ "'", str3.equals("Server [lastUpdate=0, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);

  }

  @Test
  public void test250() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test250"); }


    tp2.Server server0 = new tp2.Server();
    tp2.ITime iTime1 = server0.getTime();
    server0.update();
    tp2.ITime iTime3 = server0.getTime();
    tp2.Server server4 = new tp2.Server();
    long long5 = server4.getLastUpdate();
    tp2.ITime iTime6 = server4.getTime();
    server0.setTime(iTime6);
    long long8 = server0.getLastUpdate();
    tp2.IP iP9 = null;
    boolean b10 = server0.addBan(iP9);
    tp2.IP iP11 = null;
    boolean b12 = server0.addBan(iP11);
    tp2.IP iP13 = null;
    boolean b14 = server0.removeException(iP13);
    server0.update();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long5 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long8 == 1465509742598L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);

  }

  @Test
  public void test251() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test251"); }


    tp2.Server server0 = new tp2.Server();
    tp2.ITime iTime1 = server0.getTime();
    long long2 = server0.getLastUpdate();
    tp2.IP iP3 = null;
    boolean b4 = server0.removeBan(iP3);
    tp2.IP iP5 = null;
    boolean b6 = server0.removeBan(iP5);
    tp2.IP iP7 = null;
    boolean b8 = server0.addBan(iP7);
    long long9 = server0.getLastUpdate();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long2 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long9 == 0L);

  }

  @Test
  public void test252() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test252"); }


    tp2.Server server0 = new tp2.Server();
    tp2.ITime iTime1 = server0.getTime();
    long long2 = server0.getLastUpdate();
    java.lang.String str3 = server0.toString();
    tp2.Server server4 = new tp2.Server();
    tp2.ITime iTime5 = server4.getTime();
    tp2.IP iP6 = null;
    boolean b7 = server4.removeException(iP6);
    tp2.IP iP8 = null;
    boolean b9 = server4.connect(iP8);
    tp2.IP iP10 = null;
    boolean b11 = server4.removeException(iP10);
    tp2.IP iP12 = null;
    boolean b13 = server4.connect(iP12);
    tp2.IP iP14 = null;
    boolean b15 = server4.removeException(iP14);
    tp2.Server server16 = new tp2.Server();
    tp2.ITime iTime17 = server16.getTime();
    server16.update();
    tp2.ITime iTime19 = server16.getTime();
    server4.setTime(iTime19);
    server0.setTime(iTime19);
    tp2.Server server22 = new tp2.Server();
    long long23 = server22.getLastUpdate();
    server22.update();
    tp2.IP iP25 = null;
    boolean b26 = server22.removeException(iP25);
    server22.update();
    java.lang.String str28 = server22.toString();
    tp2.IP iP29 = null;
    boolean b30 = server22.removeBan(iP29);
    server22.update();
    tp2.Server server32 = new tp2.Server();
    tp2.ITime iTime33 = server32.getTime();
    long long34 = server32.getLastUpdate();
    long long35 = server32.getLastUpdate();
    server32.update();
    tp2.IP iP37 = null;
    boolean b38 = server32.connect(iP37);
    tp2.ITime iTime39 = server32.getTime();
    server22.setTime(iTime39);
    server0.setTime(iTime39);
    tp2.IP iP42 = null;
    boolean b43 = server0.removeBan(iP42);
    tp2.IP iP44 = null;
    boolean b45 = server0.addBan(iP44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long2 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Server [lastUpdate=0, exceptions=(), bans={}]"+ "'", str3.equals("Server [lastUpdate=0, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long23 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str28 + "' != '" + "Server [lastUpdate=1465509742612, exceptions=(), bans={}]"+ "'", str28.equals("Server [lastUpdate=1465509742612, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long34 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long35 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b43 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == false);

  }

  @Test
  public void test253() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test253"); }


    tp2.Server server0 = new tp2.Server();
    tp2.ITime iTime1 = server0.getTime();
    tp2.IP iP2 = null;
    boolean b3 = server0.removeException(iP2);
    tp2.IP iP4 = null;
    boolean b5 = server0.connect(iP4);
    tp2.IP iP6 = null;
    boolean b7 = server0.removeException(iP6);
    tp2.IP iP8 = null;
    boolean b9 = server0.connect(iP8);
    tp2.IP iP10 = null;
    boolean b11 = server0.removeException(iP10);
    tp2.Server server12 = new tp2.Server();
    tp2.ITime iTime13 = server12.getTime();
    server12.update();
    tp2.ITime iTime15 = server12.getTime();
    server0.setTime(iTime15);
    tp2.IP iP17 = null;
    boolean b18 = server0.removeBan(iP17);
    tp2.ITime iTime19 = server0.getTime();
    tp2.Server server20 = new tp2.Server();
    tp2.ITime iTime21 = server20.getTime();
    tp2.IP iP22 = null;
    boolean b23 = server20.connect(iP22);
    tp2.ITime iTime24 = server20.getTime();
    server0.setTime(iTime24);
    tp2.IP iP26 = null;
    boolean b27 = server0.removeBan(iP26);
    tp2.Server server28 = new tp2.Server();
    tp2.ITime iTime29 = server28.getTime();
    server28.update();
    tp2.Server server31 = new tp2.Server();
    tp2.ITime iTime32 = server31.getTime();
    tp2.IP iP33 = null;
    boolean b34 = server31.removeException(iP33);
    tp2.IP iP35 = null;
    boolean b36 = server31.connect(iP35);
    tp2.IP iP37 = null;
    boolean b38 = server31.removeException(iP37);
    tp2.IP iP39 = null;
    boolean b40 = server31.connect(iP39);
    tp2.IP iP41 = null;
    boolean b42 = server31.removeException(iP41);
    tp2.Server server43 = new tp2.Server();
    tp2.ITime iTime44 = server43.getTime();
    server43.update();
    tp2.ITime iTime46 = server43.getTime();
    server31.setTime(iTime46);
    tp2.Server server48 = new tp2.Server();
    tp2.ITime iTime49 = server48.getTime();
    server48.update();
    tp2.ITime iTime51 = server48.getTime();
    server31.setTime(iTime51);
    server28.setTime(iTime51);
    long long54 = server28.getLastUpdate();
    tp2.IP iP55 = null;
    boolean b56 = server28.connect(iP55);
    long long57 = server28.getLastUpdate();
    tp2.Server server58 = new tp2.Server();
    tp2.ITime iTime59 = server58.getTime();
    tp2.IP iP60 = null;
    boolean b61 = server58.connect(iP60);
    tp2.ITime iTime62 = server58.getTime();
    tp2.ITime iTime63 = server58.getTime();
    tp2.Server server64 = new tp2.Server();
    long long65 = server64.getLastUpdate();
    tp2.ITime iTime66 = server64.getTime();
    tp2.IP iP67 = null;
    boolean b68 = server64.removeException(iP67);
    tp2.Server server69 = new tp2.Server();
    long long70 = server69.getLastUpdate();
    tp2.ITime iTime71 = server69.getTime();
    server64.setTime(iTime71);
    server58.setTime(iTime71);
    server28.setTime(iTime71);
    server0.setTime(iTime71);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long54 == 1465509742622L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b56 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long57 == 1465509742622L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime59);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b61 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime62);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime63);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long65 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime66);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b68 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long70 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime71);

  }

  @Test
  public void test254() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test254"); }


    tp2.Server server0 = new tp2.Server();
    tp2.ITime iTime1 = server0.getTime();
    tp2.IP iP2 = null;
    boolean b3 = server0.removeException(iP2);
    tp2.IP iP4 = null;
    boolean b5 = server0.connect(iP4);
    tp2.IP iP6 = null;
    boolean b7 = server0.removeException(iP6);
    tp2.IP iP8 = null;
    boolean b9 = server0.connect(iP8);
    tp2.IP iP10 = null;
    boolean b11 = server0.removeException(iP10);
    tp2.IP iP12 = null;
    boolean b13 = server0.removeBan(iP12);
    server0.update();
    tp2.IP iP15 = null;
    boolean b16 = server0.addBan(iP15);
    long long17 = server0.getLastUpdate();
    tp2.IP iP18 = null;
    boolean b19 = server0.removeBan(iP18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long17 == 1465509742658L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);

  }

  @Test
  public void test255() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test255"); }


    tp2.Server server0 = new tp2.Server();
    tp2.ITime iTime1 = server0.getTime();
    tp2.IP iP2 = null;
    boolean b3 = server0.connect(iP2);
    tp2.IP iP4 = null;
    boolean b5 = server0.removeBan(iP4);
    java.lang.String str6 = server0.toString();
    tp2.IP iP7 = null;
    boolean b8 = server0.removeException(iP7);
    long long9 = server0.getLastUpdate();
    tp2.Server server10 = new tp2.Server();
    tp2.ITime iTime11 = server10.getTime();
    tp2.Server server12 = new tp2.Server();
    tp2.ITime iTime13 = server12.getTime();
    server10.setTime(iTime13);
    server10.update();
    java.lang.String str16 = server10.toString();
    tp2.Server server17 = new tp2.Server();
    long long18 = server17.getLastUpdate();
    tp2.ITime iTime19 = server17.getTime();
    tp2.IP iP20 = null;
    boolean b21 = server17.removeException(iP20);
    tp2.Server server22 = new tp2.Server();
    tp2.ITime iTime23 = server22.getTime();
    tp2.IP iP24 = null;
    boolean b25 = server22.removeException(iP24);
    tp2.IP iP26 = null;
    boolean b27 = server22.connect(iP26);
    tp2.IP iP28 = null;
    boolean b29 = server22.removeException(iP28);
    tp2.IP iP30 = null;
    boolean b31 = server22.connect(iP30);
    tp2.IP iP32 = null;
    boolean b33 = server22.removeException(iP32);
    tp2.Server server34 = new tp2.Server();
    tp2.ITime iTime35 = server34.getTime();
    server34.update();
    tp2.ITime iTime37 = server34.getTime();
    server22.setTime(iTime37);
    server17.setTime(iTime37);
    server10.setTime(iTime37);
    server0.setTime(iTime37);
    server0.update();
    long long43 = server0.getLastUpdate();
    tp2.IP iP44 = null;
    boolean b45 = server0.removeBan(iP44);
    tp2.IP iP46 = null;
    boolean b47 = server0.removeException(iP46);
    java.lang.String str48 = server0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Server [lastUpdate=0, exceptions=(), bans={}]"+ "'", str6.equals("Server [lastUpdate=0, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long9 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "Server [lastUpdate=1465509742659, exceptions=(), bans={}]"+ "'", str16.equals("Server [lastUpdate=1465509742659, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long18 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long43 == 1465509742661L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b47 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str48 + "' != '" + "Server [lastUpdate=1465509742661, exceptions=(), bans={}]"+ "'", str48.equals("Server [lastUpdate=1465509742661, exceptions=(), bans={}]"));

  }

  @Test
  public void test256() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test256"); }


    tp2.Server server0 = new tp2.Server();
    tp2.ITime iTime1 = server0.getTime();
    server0.update();
    tp2.ITime iTime3 = server0.getTime();
    tp2.IP iP4 = null;
    boolean b5 = server0.addBan(iP4);
    tp2.IP iP6 = null;
    boolean b7 = server0.removeException(iP6);
    tp2.Server server8 = new tp2.Server();
    tp2.ITime iTime9 = server8.getTime();
    server8.update();
    tp2.Server server11 = new tp2.Server();
    long long12 = server11.getLastUpdate();
    tp2.ITime iTime13 = server11.getTime();
    server8.setTime(iTime13);
    server0.setTime(iTime13);
    tp2.IP iP16 = null;
    boolean b17 = server0.addBan(iP16);
    long long18 = server0.getLastUpdate();
    tp2.IP iP19 = null;
    boolean b20 = server0.removeBan(iP19);
    tp2.IP iP21 = null;
    boolean b22 = server0.removeException(iP21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long12 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long18 == 1465509742676L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);

  }

  @Test
  public void test257() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test257"); }


    tp2.Server server0 = new tp2.Server();
    tp2.ITime iTime1 = server0.getTime();
    tp2.Server server2 = new tp2.Server();
    tp2.ITime iTime3 = server2.getTime();
    server0.setTime(iTime3);
    server0.update();
    java.lang.String str6 = server0.toString();
    java.lang.String str7 = server0.toString();
    tp2.IP iP8 = null;
    boolean b9 = server0.removeException(iP8);
    java.lang.String str10 = server0.toString();
    tp2.Server server11 = new tp2.Server();
    tp2.ITime iTime12 = server11.getTime();
    server11.update();
    tp2.ITime iTime14 = server11.getTime();
    tp2.Server server15 = new tp2.Server();
    long long16 = server15.getLastUpdate();
    tp2.ITime iTime17 = server15.getTime();
    server11.setTime(iTime17);
    tp2.ITime iTime19 = server11.getTime();
    server0.setTime(iTime19);
    server0.update();
    long long22 = server0.getLastUpdate();
    long long23 = server0.getLastUpdate();
    long long24 = server0.getLastUpdate();
    java.lang.String str25 = server0.toString();
    java.lang.String str26 = server0.toString();
    server0.update();
    tp2.IP iP28 = null;
    boolean b29 = server0.addBan(iP28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Server [lastUpdate=1465509742683, exceptions=(), bans={}]"+ "'", str6.equals("Server [lastUpdate=1465509742683, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Server [lastUpdate=1465509742683, exceptions=(), bans={}]"+ "'", str7.equals("Server [lastUpdate=1465509742683, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Server [lastUpdate=1465509742683, exceptions=(), bans={}]"+ "'", str10.equals("Server [lastUpdate=1465509742683, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long16 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long22 == 1465509742684L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long23 == 1465509742684L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long24 == 1465509742684L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + "Server [lastUpdate=1465509742684, exceptions=(), bans={}]"+ "'", str25.equals("Server [lastUpdate=1465509742684, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str26 + "' != '" + "Server [lastUpdate=1465509742684, exceptions=(), bans={}]"+ "'", str26.equals("Server [lastUpdate=1465509742684, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == false);

  }

}
