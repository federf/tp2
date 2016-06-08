package randoop;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest4 {

  public static boolean debug = false;

  @Test
  public void test01() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test01"); }


    tp2.Server server0 = new tp2.Server();
    java.lang.String str1 = server0.toString();
    tp2.ITime iTime2 = server0.getTime();
    server0.update();
    tp2.IP iP4 = null;
    boolean b5 = server0.removeException(iP4);
    long long6 = server0.getLastUpdate();
    tp2.ITime iTime7 = server0.getTime();
    server0.update();
    tp2.IP iP9 = null;
    boolean b10 = server0.removeException(iP9);
    tp2.IP iP11 = null;
    boolean b12 = server0.connect(iP11);
    long long13 = server0.getLastUpdate();
    tp2.IP iP14 = null;
    boolean b15 = server0.connect(iP14);
    java.lang.String str16 = server0.toString();
    boolean b17 = server0.repOK();
    tp2.IP iP18 = null;
    boolean b19 = server0.connect(iP18);
    long long20 = server0.getLastUpdate();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Server [lastUpdate=null, exceptions=(), bans={}]"+ "'", str1.equals("Server [lastUpdate=null, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long6 == 1465423711763L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long13 == 1465423711766L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "Server [lastUpdate=1465423711766, exceptions=(), bans={}]"+ "'", str16.equals("Server [lastUpdate=1465423711766, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long20 == 1465423711766L);

  }

  @Test
  public void test02() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test02"); }


    tp2.Server server0 = new tp2.Server();
    java.lang.String str1 = server0.toString();
    tp2.ITime iTime2 = server0.getTime();
    server0.update();
    boolean b4 = server0.repOK();
    long long5 = server0.getLastUpdate();
    long long6 = server0.getLastUpdate();
    tp2.IP iP7 = null;
    boolean b8 = server0.connect(iP7);
    server0.update();
    tp2.IP iP10 = null;
    boolean b11 = server0.addBan(iP10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Server [lastUpdate=null, exceptions=(), bans={}]"+ "'", str1.equals("Server [lastUpdate=null, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long5 == 1465423711767L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long6 == 1465423711767L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);

  }

  @Test
  public void test03() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test03"); }


    tp2.Server server0 = new tp2.Server();
    tp2.IP iP1 = null;
    boolean b2 = server0.removeException(iP1);
    tp2.Server server3 = new tp2.Server();
    java.lang.String str4 = server3.toString();
    tp2.ITime iTime5 = server3.getTime();
    server3.update();
    java.lang.String str7 = server3.toString();
    long long8 = server3.getLastUpdate();
    tp2.ITime iTime9 = server3.getTime();
    server0.setTime(iTime9);
    java.lang.String str11 = server0.toString();
    java.lang.String str12 = server0.toString();
    tp2.IP iP13 = null;
    boolean b14 = server0.addBan(iP13);
    java.lang.String str15 = server0.toString();
    // The following exception was thrown during execution in test generation
    try {
      long long16 = server0.getLastUpdate();
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
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Server [lastUpdate=null, exceptions=(), bans={}]"+ "'", str4.equals("Server [lastUpdate=null, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Server [lastUpdate=1465423711768, exceptions=(), bans={}]"+ "'", str7.equals("Server [lastUpdate=1465423711768, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long8 == 1465423711768L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Server [lastUpdate=null, exceptions=(), bans={}]"+ "'", str11.equals("Server [lastUpdate=null, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Server [lastUpdate=null, exceptions=(), bans={}]"+ "'", str12.equals("Server [lastUpdate=null, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "Server [lastUpdate=null, exceptions=(), bans={[IPBan [ip=null, expires=1465423771768]]}]"+ "'", str15.equals("Server [lastUpdate=null, exceptions=(), bans={[IPBan [ip=null, expires=1465423771768]]}]"));

  }

  @Test
  public void test04() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test04"); }


    tp2.Server server0 = new tp2.Server();
    java.lang.String str1 = server0.toString();
    tp2.ITime iTime2 = server0.getTime();
    tp2.IP iP3 = null;
    boolean b4 = server0.removeException(iP3);
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
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Server [lastUpdate=null, exceptions=(), bans={}]"+ "'", str1.equals("Server [lastUpdate=null, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);

  }

  @Test
  public void test05() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test05"); }


    tp2.Server server0 = new tp2.Server();
    java.lang.String str1 = server0.toString();
    tp2.ITime iTime2 = server0.getTime();
    server0.update();
    tp2.IP iP4 = null;
    boolean b5 = server0.removeException(iP4);
    tp2.Server server6 = new tp2.Server();
    java.lang.String str7 = server6.toString();
    tp2.ITime iTime8 = server6.getTime();
    server0.setTime(iTime8);
    long long10 = server0.getLastUpdate();
    tp2.ITime iTime11 = server0.getTime();
    tp2.IP iP12 = null;
    boolean b13 = server0.addBan(iP12);
    server0.update();
    tp2.IP iP15 = null;
    boolean b16 = server0.removeException(iP15);
    java.lang.String str17 = server0.toString();
    java.lang.String str18 = server0.toString();
    tp2.IP iP19 = null;
    boolean b20 = server0.removeException(iP19);
    tp2.ITime iTime21 = server0.getTime();
    server0.update();
    boolean b23 = server0.repOK();
    tp2.Server server24 = new tp2.Server();
    java.lang.String str25 = server24.toString();
    tp2.ITime iTime26 = server24.getTime();
    server24.update();
    java.lang.String str28 = server24.toString();
    tp2.IP iP29 = null;
    boolean b30 = server24.removeBan(iP29);
    tp2.ITime iTime31 = server24.getTime();
    tp2.IP iP32 = null;
    boolean b33 = server24.connect(iP32);
    tp2.IP iP34 = null;
    boolean b35 = server24.removeBan(iP34);
    tp2.IP iP36 = null;
    boolean b37 = server24.connect(iP36);
    tp2.Server server38 = new tp2.Server();
    java.lang.String str39 = server38.toString();
    tp2.ITime iTime40 = server38.getTime();
    tp2.IP iP41 = null;
    boolean b42 = server38.removeException(iP41);
    tp2.ITime iTime43 = server38.getTime();
    server24.setTime(iTime43);
    tp2.ITime iTime45 = server24.getTime();
    server0.setTime(iTime45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Server [lastUpdate=null, exceptions=(), bans={}]"+ "'", str1.equals("Server [lastUpdate=null, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Server [lastUpdate=null, exceptions=(), bans={}]"+ "'", str7.equals("Server [lastUpdate=null, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long10 == 1465423711769L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "Server [lastUpdate=1465423711770, exceptions=(), bans={[IPBan [ip=null, expires=1465423771770]]}]"+ "'", str17.equals("Server [lastUpdate=1465423711770, exceptions=(), bans={[IPBan [ip=null, expires=1465423771770]]}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "Server [lastUpdate=1465423711770, exceptions=(), bans={[IPBan [ip=null, expires=1465423771770]]}]"+ "'", str18.equals("Server [lastUpdate=1465423711770, exceptions=(), bans={[IPBan [ip=null, expires=1465423771770]]}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + "Server [lastUpdate=null, exceptions=(), bans={}]"+ "'", str25.equals("Server [lastUpdate=null, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str28 + "' != '" + "Server [lastUpdate=1465423711772, exceptions=(), bans={}]"+ "'", str28.equals("Server [lastUpdate=1465423711772, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str39 + "' != '" + "Server [lastUpdate=null, exceptions=(), bans={}]"+ "'", str39.equals("Server [lastUpdate=null, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime45);

  }

  @Test
  public void test06() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test06"); }


    tp2.Server server0 = new tp2.Server();
    java.lang.String str1 = server0.toString();
    tp2.ITime iTime2 = server0.getTime();
    server0.update();
    boolean b4 = server0.repOK();
    long long5 = server0.getLastUpdate();
    long long6 = server0.getLastUpdate();
    tp2.IP iP7 = null;
    boolean b8 = server0.connect(iP7);
    tp2.IP iP9 = null;
    boolean b10 = server0.removeException(iP9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Server [lastUpdate=null, exceptions=(), bans={}]"+ "'", str1.equals("Server [lastUpdate=null, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long5 == 1465423711786L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long6 == 1465423711786L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);

  }

  @Test
  public void test07() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test07"); }


    tp2.Server server0 = new tp2.Server();
    java.lang.String str1 = server0.toString();
    tp2.ITime iTime2 = server0.getTime();
    server0.update();
    tp2.IP iP4 = null;
    boolean b5 = server0.removeException(iP4);
    long long6 = server0.getLastUpdate();
    tp2.ITime iTime7 = server0.getTime();
    server0.update();
    tp2.IP iP9 = null;
    boolean b10 = server0.removeException(iP9);
    tp2.IP iP11 = null;
    boolean b12 = server0.connect(iP11);
    long long13 = server0.getLastUpdate();
    tp2.IP iP14 = null;
    boolean b15 = server0.connect(iP14);
    boolean b16 = server0.repOK();
    server0.update();
    java.lang.String str18 = server0.toString();
    tp2.IP iP19 = null;
    boolean b20 = server0.removeException(iP19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Server [lastUpdate=null, exceptions=(), bans={}]"+ "'", str1.equals("Server [lastUpdate=null, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long6 == 1465423711787L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long13 == 1465423711787L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "Server [lastUpdate=1465423711787, exceptions=(), bans={}]"+ "'", str18.equals("Server [lastUpdate=1465423711787, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);

  }

  @Test
  public void test08() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test08"); }


    tp2.Server server0 = new tp2.Server();
    java.lang.String str1 = server0.toString();
    tp2.ITime iTime2 = server0.getTime();
    server0.update();
    tp2.IP iP4 = null;
    boolean b5 = server0.removeException(iP4);
    tp2.Server server6 = new tp2.Server();
    java.lang.String str7 = server6.toString();
    tp2.ITime iTime8 = server6.getTime();
    server0.setTime(iTime8);
    tp2.ITime iTime10 = server0.getTime();
    tp2.IP iP11 = null;
    boolean b12 = server0.removeException(iP11);
    tp2.Server server13 = new tp2.Server();
    java.lang.String str14 = server13.toString();
    tp2.ITime iTime15 = server13.getTime();
    server13.update();
    tp2.IP iP17 = null;
    boolean b18 = server13.removeException(iP17);
    tp2.Server server19 = new tp2.Server();
    java.lang.String str20 = server19.toString();
    tp2.ITime iTime21 = server19.getTime();
    server13.setTime(iTime21);
    tp2.ITime iTime23 = server13.getTime();
    server0.setTime(iTime23);
    tp2.IP iP25 = null;
    boolean b26 = server0.addBan(iP25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Server [lastUpdate=null, exceptions=(), bans={}]"+ "'", str1.equals("Server [lastUpdate=null, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Server [lastUpdate=null, exceptions=(), bans={}]"+ "'", str7.equals("Server [lastUpdate=null, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "Server [lastUpdate=null, exceptions=(), bans={}]"+ "'", str14.equals("Server [lastUpdate=null, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "Server [lastUpdate=null, exceptions=(), bans={}]"+ "'", str20.equals("Server [lastUpdate=null, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == true);

  }

  @Test
  public void test09() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test09"); }


    tp2.Server server0 = new tp2.Server();
    java.lang.String str1 = server0.toString();
    tp2.ITime iTime2 = server0.getTime();
    server0.update();
    tp2.IP iP4 = null;
    boolean b5 = server0.removeException(iP4);
    long long6 = server0.getLastUpdate();
    tp2.ITime iTime7 = server0.getTime();
    server0.update();
    tp2.IP iP9 = null;
    boolean b10 = server0.removeException(iP9);
    java.lang.String str11 = server0.toString();
    tp2.IP iP12 = null;
    boolean b13 = server0.addBan(iP12);
    java.lang.String str14 = server0.toString();
    server0.update();
    tp2.Server server16 = new tp2.Server();
    java.lang.String str17 = server16.toString();
    tp2.ITime iTime18 = server16.getTime();
    server16.update();
    java.lang.String str20 = server16.toString();
    long long21 = server16.getLastUpdate();
    tp2.ITime iTime22 = server16.getTime();
    long long23 = server16.getLastUpdate();
    tp2.IP iP24 = null;
    boolean b25 = server16.connect(iP24);
    tp2.IP iP26 = null;
    boolean b27 = server16.connect(iP26);
    tp2.Server server28 = new tp2.Server();
    tp2.ITime iTime29 = null;
    server28.setTime(iTime29);
    tp2.ITime iTime31 = server28.getTime();
    tp2.IP iP32 = null;
    boolean b33 = server28.removeBan(iP32);
    tp2.Server server34 = new tp2.Server();
    java.lang.String str35 = server34.toString();
    tp2.ITime iTime36 = server34.getTime();
    server34.update();
    tp2.IP iP38 = null;
    boolean b39 = server34.removeException(iP38);
    long long40 = server34.getLastUpdate();
    tp2.IP iP41 = null;
    boolean b42 = server34.connect(iP41);
    tp2.Server server43 = new tp2.Server();
    java.lang.String str44 = server43.toString();
    tp2.ITime iTime45 = server43.getTime();
    tp2.IP iP46 = null;
    boolean b47 = server43.addBan(iP46);
    tp2.ITime iTime48 = server43.getTime();
    server34.setTime(iTime48);
    server28.setTime(iTime48);
    server16.setTime(iTime48);
    tp2.Server server52 = new tp2.Server();
    java.lang.String str53 = server52.toString();
    tp2.ITime iTime54 = server52.getTime();
    server52.update();
    tp2.IP iP56 = null;
    boolean b57 = server52.removeException(iP56);
    long long58 = server52.getLastUpdate();
    tp2.ITime iTime59 = server52.getTime();
    server52.update();
    long long61 = server52.getLastUpdate();
    java.lang.String str62 = server52.toString();
    tp2.IP iP63 = null;
    boolean b64 = server52.addBan(iP63);
    tp2.IP iP65 = null;
    boolean b66 = server52.removeException(iP65);
    tp2.Server server67 = new tp2.Server();
    tp2.IP iP68 = null;
    boolean b69 = server67.removeException(iP68);
    tp2.Server server70 = new tp2.Server();
    java.lang.String str71 = server70.toString();
    tp2.ITime iTime72 = server70.getTime();
    server70.update();
    java.lang.String str74 = server70.toString();
    long long75 = server70.getLastUpdate();
    tp2.ITime iTime76 = server70.getTime();
    server67.setTime(iTime76);
    tp2.IP iP78 = null;
    boolean b79 = server67.removeBan(iP78);
    tp2.IP iP80 = null;
    boolean b81 = server67.removeBan(iP80);
    tp2.ITime iTime82 = server67.getTime();
    server52.setTime(iTime82);
    server16.setTime(iTime82);
    server0.setTime(iTime82);
    boolean b86 = server0.repOK();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Server [lastUpdate=null, exceptions=(), bans={}]"+ "'", str1.equals("Server [lastUpdate=null, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long6 == 1465423711797L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Server [lastUpdate=1465423711798, exceptions=(), bans={}]"+ "'", str11.equals("Server [lastUpdate=1465423711798, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "Server [lastUpdate=1465423711798, exceptions=(), bans={[IPBan [ip=null, expires=1465423771798]]}]"+ "'", str14.equals("Server [lastUpdate=1465423711798, exceptions=(), bans={[IPBan [ip=null, expires=1465423771798]]}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "Server [lastUpdate=null, exceptions=(), bans={}]"+ "'", str17.equals("Server [lastUpdate=null, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "Server [lastUpdate=1465423711798, exceptions=(), bans={}]"+ "'", str20.equals("Server [lastUpdate=1465423711798, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long21 == 1465423711798L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long23 == 1465423711798L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iTime31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str35 + "' != '" + "Server [lastUpdate=null, exceptions=(), bans={}]"+ "'", str35.equals("Server [lastUpdate=null, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long40 == 1465423711799L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str44 + "' != '" + "Server [lastUpdate=null, exceptions=(), bans={}]"+ "'", str44.equals("Server [lastUpdate=null, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b47 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str53 + "' != '" + "Server [lastUpdate=null, exceptions=(), bans={}]"+ "'", str53.equals("Server [lastUpdate=null, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b57 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long58 == 1465423711800L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime59);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long61 == 1465423711800L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str62 + "' != '" + "Server [lastUpdate=1465423711800, exceptions=(), bans={}]"+ "'", str62.equals("Server [lastUpdate=1465423711800, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b64 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b66 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b69 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str71 + "' != '" + "Server [lastUpdate=null, exceptions=(), bans={}]"+ "'", str71.equals("Server [lastUpdate=null, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime72);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str74 + "' != '" + "Server [lastUpdate=1465423711801, exceptions=(), bans={}]"+ "'", str74.equals("Server [lastUpdate=1465423711801, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long75 == 1465423711801L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime76);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b79 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b81 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime82);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b86 == false);

  }

  @Test
  public void test10() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test10"); }


    tp2.Server server0 = new tp2.Server();
    java.lang.String str1 = server0.toString();
    tp2.ITime iTime2 = server0.getTime();
    server0.update();
    tp2.IP iP4 = null;
    boolean b5 = server0.removeException(iP4);
    long long6 = server0.getLastUpdate();
    java.lang.String str7 = server0.toString();
    tp2.ITime iTime8 = server0.getTime();
    long long9 = server0.getLastUpdate();
    boolean b10 = server0.repOK();
    tp2.IP iP11 = null;
    boolean b12 = server0.removeException(iP11);
    server0.update();
    server0.update();
    boolean b15 = server0.repOK();
    server0.update();
    boolean b17 = server0.repOK();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Server [lastUpdate=null, exceptions=(), bans={}]"+ "'", str1.equals("Server [lastUpdate=null, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long6 == 1465423711826L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Server [lastUpdate=1465423711826, exceptions=(), bans={}]"+ "'", str7.equals("Server [lastUpdate=1465423711826, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long9 == 1465423711826L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);

  }

  @Test
  public void test11() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test11"); }


    tp2.Server server0 = new tp2.Server();
    java.lang.String str1 = server0.toString();
    tp2.ITime iTime2 = server0.getTime();
    server0.update();
    java.lang.String str4 = server0.toString();
    long long5 = server0.getLastUpdate();
    tp2.ITime iTime6 = server0.getTime();
    long long7 = server0.getLastUpdate();
    tp2.IP iP8 = null;
    boolean b9 = server0.connect(iP8);
    tp2.IP iP10 = null;
    boolean b11 = server0.connect(iP10);
    tp2.IP iP12 = null;
    boolean b13 = server0.removeException(iP12);
    tp2.Server server14 = new tp2.Server();
    java.lang.String str15 = server14.toString();
    tp2.ITime iTime16 = server14.getTime();
    server14.update();
    tp2.Server server18 = new tp2.Server();
    java.lang.String str19 = server18.toString();
    tp2.ITime iTime20 = server18.getTime();
    server18.update();
    tp2.IP iP22 = null;
    boolean b23 = server18.removeException(iP22);
    tp2.Server server24 = new tp2.Server();
    java.lang.String str25 = server24.toString();
    tp2.ITime iTime26 = server24.getTime();
    server18.setTime(iTime26);
    server14.setTime(iTime26);
    tp2.Server server29 = new tp2.Server();
    java.lang.String str30 = server29.toString();
    tp2.ITime iTime31 = server29.getTime();
    server29.update();
    tp2.IP iP33 = null;
    boolean b34 = server29.removeException(iP33);
    tp2.Server server35 = new tp2.Server();
    java.lang.String str36 = server35.toString();
    tp2.ITime iTime37 = server35.getTime();
    server29.setTime(iTime37);
    tp2.ITime iTime39 = server29.getTime();
    server14.setTime(iTime39);
    tp2.IP iP41 = null;
    boolean b42 = server14.connect(iP41);
    long long43 = server14.getLastUpdate();
    tp2.IP iP44 = null;
    boolean b45 = server14.addBan(iP44);
    tp2.Server server46 = new tp2.Server();
    java.lang.String str47 = server46.toString();
    tp2.ITime iTime48 = server46.getTime();
    server46.update();
    tp2.IP iP50 = null;
    boolean b51 = server46.removeException(iP50);
    tp2.Server server52 = new tp2.Server();
    java.lang.String str53 = server52.toString();
    tp2.ITime iTime54 = server52.getTime();
    server46.setTime(iTime54);
    server14.setTime(iTime54);
    server0.setTime(iTime54);
    tp2.IP iP58 = null;
    boolean b59 = server0.removeBan(iP58);
    long long60 = server0.getLastUpdate();
    long long61 = server0.getLastUpdate();
    tp2.IP iP62 = null;
    boolean b63 = server0.removeBan(iP62);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Server [lastUpdate=null, exceptions=(), bans={}]"+ "'", str1.equals("Server [lastUpdate=null, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Server [lastUpdate=1465423711830, exceptions=(), bans={}]"+ "'", str4.equals("Server [lastUpdate=1465423711830, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long5 == 1465423711830L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long7 == 1465423711830L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "Server [lastUpdate=null, exceptions=(), bans={}]"+ "'", str15.equals("Server [lastUpdate=null, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "Server [lastUpdate=null, exceptions=(), bans={}]"+ "'", str19.equals("Server [lastUpdate=null, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + "Server [lastUpdate=null, exceptions=(), bans={}]"+ "'", str25.equals("Server [lastUpdate=null, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str30 + "' != '" + "Server [lastUpdate=null, exceptions=(), bans={}]"+ "'", str30.equals("Server [lastUpdate=null, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str36 + "' != '" + "Server [lastUpdate=null, exceptions=(), bans={}]"+ "'", str36.equals("Server [lastUpdate=null, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long43 == 1465423711831L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str47 + "' != '" + "Server [lastUpdate=null, exceptions=(), bans={}]"+ "'", str47.equals("Server [lastUpdate=null, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b51 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str53 + "' != '" + "Server [lastUpdate=null, exceptions=(), bans={}]"+ "'", str53.equals("Server [lastUpdate=null, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b59 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long60 == 1465423711830L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long61 == 1465423711830L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b63 == false);

  }

  @Test
  public void test12() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test12"); }


    tp2.Server server0 = new tp2.Server();
    java.lang.String str1 = server0.toString();
    tp2.ITime iTime2 = server0.getTime();
    server0.update();
    java.lang.String str4 = server0.toString();
    long long5 = server0.getLastUpdate();
    long long6 = server0.getLastUpdate();
    tp2.IP iP7 = null;
    boolean b8 = server0.removeException(iP7);
    long long9 = server0.getLastUpdate();
    tp2.ITime iTime10 = server0.getTime();
    tp2.IP iP11 = null;
    boolean b12 = server0.connect(iP11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Server [lastUpdate=null, exceptions=(), bans={}]"+ "'", str1.equals("Server [lastUpdate=null, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Server [lastUpdate=1465423711853, exceptions=(), bans={}]"+ "'", str4.equals("Server [lastUpdate=1465423711853, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long5 == 1465423711853L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long6 == 1465423711853L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long9 == 1465423711853L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);

  }

  @Test
  public void test13() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test13"); }


    tp2.Server server0 = new tp2.Server();
    java.lang.String str1 = server0.toString();
    tp2.ITime iTime2 = server0.getTime();
    server0.update();
    java.lang.String str4 = server0.toString();
    tp2.Server server5 = new tp2.Server();
    java.lang.String str6 = server5.toString();
    tp2.ITime iTime7 = server5.getTime();
    server5.update();
    tp2.IP iP9 = null;
    boolean b10 = server5.removeException(iP9);
    tp2.ITime iTime11 = server5.getTime();
    server0.setTime(iTime11);
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
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Server [lastUpdate=null, exceptions=(), bans={}]"+ "'", str1.equals("Server [lastUpdate=null, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Server [lastUpdate=1465423711858, exceptions=(), bans={}]"+ "'", str4.equals("Server [lastUpdate=1465423711858, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Server [lastUpdate=null, exceptions=(), bans={}]"+ "'", str6.equals("Server [lastUpdate=null, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long13 == 1465423711858L);

  }

  @Test
  public void test14() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test14"); }


    tp2.Server server0 = new tp2.Server();
    java.lang.String str1 = server0.toString();
    tp2.ITime iTime2 = server0.getTime();
    server0.update();
    tp2.Server server4 = new tp2.Server();
    java.lang.String str5 = server4.toString();
    tp2.ITime iTime6 = server4.getTime();
    server4.update();
    tp2.IP iP8 = null;
    boolean b9 = server4.removeException(iP8);
    tp2.Server server10 = new tp2.Server();
    java.lang.String str11 = server10.toString();
    tp2.ITime iTime12 = server10.getTime();
    server4.setTime(iTime12);
    server0.setTime(iTime12);
    tp2.Server server15 = new tp2.Server();
    java.lang.String str16 = server15.toString();
    tp2.ITime iTime17 = server15.getTime();
    server15.update();
    tp2.IP iP19 = null;
    boolean b20 = server15.removeException(iP19);
    tp2.Server server21 = new tp2.Server();
    java.lang.String str22 = server21.toString();
    tp2.ITime iTime23 = server21.getTime();
    server15.setTime(iTime23);
    tp2.ITime iTime25 = server15.getTime();
    server0.setTime(iTime25);
    tp2.Server server27 = new tp2.Server();
    java.lang.String str28 = server27.toString();
    tp2.ITime iTime29 = server27.getTime();
    server27.update();
    tp2.IP iP31 = null;
    boolean b32 = server27.removeException(iP31);
    tp2.Server server33 = new tp2.Server();
    java.lang.String str34 = server33.toString();
    tp2.ITime iTime35 = server33.getTime();
    server27.setTime(iTime35);
    tp2.ITime iTime37 = server27.getTime();
    tp2.Server server38 = new tp2.Server();
    java.lang.String str39 = server38.toString();
    tp2.ITime iTime40 = server38.getTime();
    server38.update();
    tp2.IP iP42 = null;
    boolean b43 = server38.removeException(iP42);
    tp2.Server server44 = new tp2.Server();
    java.lang.String str45 = server44.toString();
    tp2.ITime iTime46 = server44.getTime();
    server38.setTime(iTime46);
    server27.setTime(iTime46);
    java.lang.String str49 = server27.toString();
    tp2.ITime iTime50 = server27.getTime();
    server0.setTime(iTime50);
    tp2.ITime iTime52 = server0.getTime();
    tp2.IP iP53 = null;
    boolean b54 = server0.connect(iP53);
    tp2.IP iP55 = null;
    boolean b56 = server0.connect(iP55);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Server [lastUpdate=null, exceptions=(), bans={}]"+ "'", str1.equals("Server [lastUpdate=null, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Server [lastUpdate=null, exceptions=(), bans={}]"+ "'", str5.equals("Server [lastUpdate=null, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Server [lastUpdate=null, exceptions=(), bans={}]"+ "'", str11.equals("Server [lastUpdate=null, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "Server [lastUpdate=null, exceptions=(), bans={}]"+ "'", str16.equals("Server [lastUpdate=null, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + "Server [lastUpdate=null, exceptions=(), bans={}]"+ "'", str22.equals("Server [lastUpdate=null, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str28 + "' != '" + "Server [lastUpdate=null, exceptions=(), bans={}]"+ "'", str28.equals("Server [lastUpdate=null, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str34 + "' != '" + "Server [lastUpdate=null, exceptions=(), bans={}]"+ "'", str34.equals("Server [lastUpdate=null, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str39 + "' != '" + "Server [lastUpdate=null, exceptions=(), bans={}]"+ "'", str39.equals("Server [lastUpdate=null, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b43 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str45 + "' != '" + "Server [lastUpdate=null, exceptions=(), bans={}]"+ "'", str45.equals("Server [lastUpdate=null, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str49 + "' != '" + "Server [lastUpdate=1465423711864, exceptions=(), bans={}]"+ "'", str49.equals("Server [lastUpdate=1465423711864, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b54 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b56 == true);

  }

  @Test
  public void test15() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test15"); }


    tp2.Server server0 = new tp2.Server();
    java.lang.String str1 = server0.toString();
    tp2.ITime iTime2 = server0.getTime();
    server0.update();
    tp2.IP iP4 = null;
    boolean b5 = server0.removeException(iP4);
    tp2.Server server6 = new tp2.Server();
    java.lang.String str7 = server6.toString();
    tp2.ITime iTime8 = server6.getTime();
    server0.setTime(iTime8);
    tp2.ITime iTime10 = server0.getTime();
    tp2.Server server11 = new tp2.Server();
    java.lang.String str12 = server11.toString();
    tp2.ITime iTime13 = server11.getTime();
    server11.update();
    tp2.IP iP15 = null;
    boolean b16 = server11.removeException(iP15);
    tp2.Server server17 = new tp2.Server();
    java.lang.String str18 = server17.toString();
    tp2.ITime iTime19 = server17.getTime();
    server11.setTime(iTime19);
    server0.setTime(iTime19);
    java.lang.String str22 = server0.toString();
    long long23 = server0.getLastUpdate();
    boolean b24 = server0.repOK();
    tp2.IP iP25 = null;
    boolean b26 = server0.removeBan(iP25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Server [lastUpdate=null, exceptions=(), bans={}]"+ "'", str1.equals("Server [lastUpdate=null, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Server [lastUpdate=null, exceptions=(), bans={}]"+ "'", str7.equals("Server [lastUpdate=null, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Server [lastUpdate=null, exceptions=(), bans={}]"+ "'", str12.equals("Server [lastUpdate=null, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "Server [lastUpdate=null, exceptions=(), bans={}]"+ "'", str18.equals("Server [lastUpdate=null, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + "Server [lastUpdate=1465423711897, exceptions=(), bans={}]"+ "'", str22.equals("Server [lastUpdate=1465423711897, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long23 == 1465423711897L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);

  }

  @Test
  public void test16() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test16"); }


    tp2.Server server0 = new tp2.Server();
    java.lang.String str1 = server0.toString();
    tp2.ITime iTime2 = server0.getTime();
    server0.update();
    tp2.Server server4 = new tp2.Server();
    java.lang.String str5 = server4.toString();
    tp2.ITime iTime6 = server4.getTime();
    server4.update();
    tp2.IP iP8 = null;
    boolean b9 = server4.removeException(iP8);
    tp2.Server server10 = new tp2.Server();
    java.lang.String str11 = server10.toString();
    tp2.ITime iTime12 = server10.getTime();
    server4.setTime(iTime12);
    server0.setTime(iTime12);
    tp2.Server server15 = new tp2.Server();
    java.lang.String str16 = server15.toString();
    tp2.ITime iTime17 = server15.getTime();
    server15.update();
    tp2.IP iP19 = null;
    boolean b20 = server15.removeException(iP19);
    tp2.Server server21 = new tp2.Server();
    java.lang.String str22 = server21.toString();
    tp2.ITime iTime23 = server21.getTime();
    server15.setTime(iTime23);
    tp2.ITime iTime25 = server15.getTime();
    server0.setTime(iTime25);
    tp2.IP iP27 = null;
    boolean b28 = server0.connect(iP27);
    long long29 = server0.getLastUpdate();
    boolean b30 = server0.repOK();
    boolean b31 = server0.repOK();
    boolean b32 = server0.repOK();
    tp2.Server server33 = new tp2.Server();
    java.lang.String str34 = server33.toString();
    tp2.ITime iTime35 = server33.getTime();
    tp2.ITime iTime36 = server33.getTime();
    tp2.IP iP37 = null;
    boolean b38 = server33.removeException(iP37);
    tp2.ITime iTime39 = server33.getTime();
    server0.setTime(iTime39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Server [lastUpdate=null, exceptions=(), bans={}]"+ "'", str1.equals("Server [lastUpdate=null, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Server [lastUpdate=null, exceptions=(), bans={}]"+ "'", str5.equals("Server [lastUpdate=null, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Server [lastUpdate=null, exceptions=(), bans={}]"+ "'", str11.equals("Server [lastUpdate=null, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "Server [lastUpdate=null, exceptions=(), bans={}]"+ "'", str16.equals("Server [lastUpdate=null, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + "Server [lastUpdate=null, exceptions=(), bans={}]"+ "'", str22.equals("Server [lastUpdate=null, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long29 == 1465423711905L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str34 + "' != '" + "Server [lastUpdate=null, exceptions=(), bans={}]"+ "'", str34.equals("Server [lastUpdate=null, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime39);

  }

}
