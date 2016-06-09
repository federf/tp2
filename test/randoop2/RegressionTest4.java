package randoop2;

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
    long long1 = server0.getLastUpdate();
    tp2.ITime iTime2 = server0.getTime();
    server0.update();
    java.lang.String str4 = server0.toString();
    long long5 = server0.getLastUpdate();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Server [lastUpdate=1465509023829, exceptions=(), bans={}]"+ "'", str4.equals("Server [lastUpdate=1465509023829, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long5 == 1465509023829L);

  }

  @Test
  public void test02() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test02"); }


    tp2.Server server0 = new tp2.Server();
    long long1 = server0.getLastUpdate();
    tp2.ITime iTime2 = server0.getTime();
    tp2.IP iP3 = null;
    boolean b4 = server0.removeException(iP3);
    tp2.ITime iTime5 = server0.getTime();
    tp2.IP iP6 = null;
    boolean b7 = server0.connect(iP6);
    java.lang.String str8 = server0.toString();
    tp2.IP iP9 = null;
    boolean b10 = server0.connect(iP9);
    java.lang.String str11 = server0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Server [lastUpdate=0, exceptions=(), bans={}]"+ "'", str8.equals("Server [lastUpdate=0, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Server [lastUpdate=0, exceptions=(), bans={}]"+ "'", str11.equals("Server [lastUpdate=0, exceptions=(), bans={}]"));

  }

  @Test
  public void test03() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test03"); }


    tp2.Server server0 = new tp2.Server();
    long long1 = server0.getLastUpdate();
    server0.update();
    tp2.IP iP3 = null;
    boolean b4 = server0.removeException(iP3);
    server0.update();
    server0.update();
    server0.update();
    tp2.IP iP8 = null;
    boolean b9 = server0.removeBan(iP8);
    tp2.IP iP10 = null;
    boolean b11 = server0.removeBan(iP10);
    tp2.ITime iTime12 = server0.getTime();
    long long13 = server0.getLastUpdate();
    tp2.IP iP14 = null;
    boolean b15 = server0.removeException(iP14);
    server0.update();
    tp2.IP iP17 = null;
    boolean b18 = server0.removeBan(iP17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long13 == 1465509023832L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);

  }

  @Test
  public void test04() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test04"); }


    tp2.Server server0 = new tp2.Server();
    long long1 = server0.getLastUpdate();
    java.lang.String str2 = server0.toString();
    java.lang.String str3 = server0.toString();
    tp2.Server server4 = new tp2.Server();
    long long5 = server4.getLastUpdate();
    server4.update();
    tp2.IP iP7 = null;
    boolean b8 = server4.removeException(iP7);
    server4.update();
    long long10 = server4.getLastUpdate();
    java.lang.String str11 = server4.toString();
    tp2.ITime iTime12 = server4.getTime();
    server4.update();
    tp2.IP iP14 = null;
    boolean b15 = server4.removeBan(iP14);
    tp2.Server server16 = new tp2.Server();
    long long17 = server16.getLastUpdate();
    long long18 = server16.getLastUpdate();
    java.lang.String str19 = server16.toString();
    tp2.ITime iTime20 = server16.getTime();
    server4.setTime(iTime20);
    server0.setTime(iTime20);
    server0.update();
    java.lang.String str24 = server0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Server [lastUpdate=0, exceptions=(), bans={}]"+ "'", str2.equals("Server [lastUpdate=0, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Server [lastUpdate=0, exceptions=(), bans={}]"+ "'", str3.equals("Server [lastUpdate=0, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long5 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long10 == 1465509023844L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Server [lastUpdate=1465509023844, exceptions=(), bans={}]"+ "'", str11.equals("Server [lastUpdate=1465509023844, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long17 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long18 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "Server [lastUpdate=0, exceptions=(), bans={}]"+ "'", str19.equals("Server [lastUpdate=0, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + "Server [lastUpdate=1465509023845, exceptions=(), bans={}]"+ "'", str24.equals("Server [lastUpdate=1465509023845, exceptions=(), bans={}]"));

  }

  @Test
  public void test05() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test05"); }


    tp2.Server server0 = new tp2.Server();
    long long1 = server0.getLastUpdate();
    tp2.ITime iTime2 = server0.getTime();
    tp2.IP iP3 = null;
    boolean b4 = server0.removeException(iP3);
    tp2.ITime iTime5 = server0.getTime();
    long long6 = server0.getLastUpdate();
    long long7 = server0.getLastUpdate();
    tp2.IP iP8 = null;
    boolean b9 = server0.removeBan(iP8);
    java.lang.String str10 = server0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long6 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long7 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Server [lastUpdate=0, exceptions=(), bans={}]"+ "'", str10.equals("Server [lastUpdate=0, exceptions=(), bans={}]"));

  }

  @Test
  public void test06() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test06"); }


    tp2.Server server0 = new tp2.Server();
    long long1 = server0.getLastUpdate();
    tp2.Server server2 = new tp2.Server();
    tp2.ITime iTime3 = server2.getTime();
    server2.update();
    tp2.ITime iTime5 = server2.getTime();
    tp2.Server server6 = new tp2.Server();
    long long7 = server6.getLastUpdate();
    tp2.ITime iTime8 = server6.getTime();
    server2.setTime(iTime8);
    java.lang.String str10 = server2.toString();
    tp2.ITime iTime11 = server2.getTime();
    server0.setTime(iTime11);
    tp2.Server server13 = new tp2.Server();
    long long14 = server13.getLastUpdate();
    tp2.ITime iTime15 = server13.getTime();
    server0.setTime(iTime15);
    server0.update();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long7 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Server [lastUpdate=1465509023849, exceptions=(), bans={}]"+ "'", str10.equals("Server [lastUpdate=1465509023849, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long14 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime15);

  }

  @Test
  public void test07() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test07"); }


    tp2.Server server0 = new tp2.Server();
    tp2.ITime iTime1 = server0.getTime();
    server0.update();
    tp2.IP iP3 = null;
    boolean b4 = server0.connect(iP3);
    long long5 = server0.getLastUpdate();
    tp2.IP iP6 = null;
    boolean b7 = server0.connect(iP6);
    tp2.IP iP8 = null;
    boolean b9 = server0.removeException(iP8);
    java.lang.String str10 = server0.toString();
    tp2.IP iP11 = null;
    boolean b12 = server0.connect(iP11);
    tp2.IP iP13 = null;
    boolean b14 = server0.removeException(iP13);
    tp2.IP iP15 = null;
    boolean b16 = server0.removeBan(iP15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long5 == 1465509023856L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Server [lastUpdate=1465509023856, exceptions=(), bans={}]"+ "'", str10.equals("Server [lastUpdate=1465509023856, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);

  }

  @Test
  public void test08() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test08"); }


    tp2.Server server0 = new tp2.Server();
    tp2.ITime iTime1 = server0.getTime();
    server0.update();
    tp2.ITime iTime3 = server0.getTime();
    tp2.IP iP4 = null;
    boolean b5 = server0.removeBan(iP4);
    java.lang.String str6 = server0.toString();
    java.lang.String str7 = server0.toString();
    tp2.IP iP8 = null;
    boolean b9 = server0.removeBan(iP8);
    tp2.IP iP10 = null;
    boolean b11 = server0.removeException(iP10);
    tp2.IP iP12 = null;
    boolean b13 = server0.removeBan(iP12);
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
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Server [lastUpdate=1465509023858, exceptions=(), bans={}]"+ "'", str6.equals("Server [lastUpdate=1465509023858, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Server [lastUpdate=1465509023858, exceptions=(), bans={}]"+ "'", str7.equals("Server [lastUpdate=1465509023858, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);

  }

  @Test
  public void test09() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test09"); }


    tp2.Server server0 = new tp2.Server();
    long long1 = server0.getLastUpdate();
    java.lang.String str2 = server0.toString();
    server0.update();
    java.lang.String str4 = server0.toString();
    tp2.Server server5 = new tp2.Server();
    long long6 = server5.getLastUpdate();
    server5.update();
    tp2.IP iP8 = null;
    boolean b9 = server5.removeException(iP8);
    server5.update();
    long long11 = server5.getLastUpdate();
    java.lang.String str12 = server5.toString();
    tp2.ITime iTime13 = server5.getTime();
    server0.setTime(iTime13);
    tp2.ITime iTime15 = server0.getTime();
    tp2.IP iP16 = null;
    boolean b17 = server0.removeBan(iP16);
    tp2.IP iP18 = null;
    boolean b19 = server0.connect(iP18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Server [lastUpdate=0, exceptions=(), bans={}]"+ "'", str2.equals("Server [lastUpdate=0, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Server [lastUpdate=1465509023860, exceptions=(), bans={}]"+ "'", str4.equals("Server [lastUpdate=1465509023860, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long6 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long11 == 1465509023860L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Server [lastUpdate=1465509023860, exceptions=(), bans={}]"+ "'", str12.equals("Server [lastUpdate=1465509023860, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);

  }

  @Test
  public void test10() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test10"); }


    tp2.Server server0 = new tp2.Server();
    long long1 = server0.getLastUpdate();
    server0.update();
    tp2.IP iP3 = null;
    boolean b4 = server0.removeBan(iP3);
    tp2.Server server5 = new tp2.Server();
    long long6 = server5.getLastUpdate();
    server5.update();
    tp2.IP iP8 = null;
    boolean b9 = server5.removeException(iP8);
    server5.update();
    tp2.ITime iTime11 = server5.getTime();
    server0.setTime(iTime11);
    server0.update();
    tp2.IP iP14 = null;
    boolean b15 = server0.removeBan(iP14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long6 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);

  }

  @Test
  public void test11() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test11"); }


    tp2.Server server0 = new tp2.Server();
    tp2.ITime iTime1 = server0.getTime();
    tp2.IP iP2 = null;
    boolean b3 = server0.removeException(iP2);
    java.lang.String str4 = server0.toString();
    tp2.ITime iTime5 = server0.getTime();
    tp2.IP iP6 = null;
    boolean b7 = server0.removeException(iP6);
    tp2.Server server8 = new tp2.Server();
    tp2.ITime iTime9 = server8.getTime();
    server8.update();
    tp2.ITime iTime11 = server8.getTime();
    tp2.Server server12 = new tp2.Server();
    tp2.ITime iTime13 = server12.getTime();
    server12.update();
    tp2.IP iP15 = null;
    boolean b16 = server12.connect(iP15);
    long long17 = server12.getLastUpdate();
    java.lang.String str18 = server12.toString();
    tp2.Server server19 = new tp2.Server();
    long long20 = server19.getLastUpdate();
    server19.update();
    tp2.IP iP22 = null;
    boolean b23 = server19.removeBan(iP22);
    tp2.Server server24 = new tp2.Server();
    long long25 = server24.getLastUpdate();
    server24.update();
    tp2.IP iP27 = null;
    boolean b28 = server24.removeException(iP27);
    server24.update();
    tp2.ITime iTime30 = server24.getTime();
    server19.setTime(iTime30);
    server12.setTime(iTime30);
    server8.setTime(iTime30);
    server0.setTime(iTime30);
    java.lang.String str35 = server0.toString();
    tp2.IP iP36 = null;
    boolean b37 = server0.connect(iP36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Server [lastUpdate=0, exceptions=(), bans={}]"+ "'", str4.equals("Server [lastUpdate=0, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long17 == 1465509023865L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "Server [lastUpdate=1465509023865, exceptions=(), bans={}]"+ "'", str18.equals("Server [lastUpdate=1465509023865, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long20 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long25 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str35 + "' != '" + "Server [lastUpdate=0, exceptions=(), bans={}]"+ "'", str35.equals("Server [lastUpdate=0, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == true);

  }

  @Test
  public void test12() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test12"); }


    tp2.Server server0 = new tp2.Server();
    tp2.ITime iTime1 = server0.getTime();
    tp2.IP iP2 = null;
    boolean b3 = server0.connect(iP2);
    tp2.IP iP4 = null;
    boolean b5 = server0.removeException(iP4);
    tp2.IP iP6 = null;
    boolean b7 = server0.removeException(iP6);
    tp2.IP iP8 = null;
    boolean b9 = server0.connect(iP8);
    tp2.Server server10 = new tp2.Server();
    long long11 = server10.getLastUpdate();
    server10.update();
    tp2.ITime iTime13 = server10.getTime();
    server0.setTime(iTime13);
    tp2.Server server15 = new tp2.Server();
    long long16 = server15.getLastUpdate();
    long long17 = server15.getLastUpdate();
    tp2.ITime iTime18 = server15.getTime();
    server0.setTime(iTime18);
    tp2.ITime iTime20 = server0.getTime();
    tp2.IP iP21 = null;
    boolean b22 = server0.removeException(iP21);
    tp2.IP iP23 = null;
    boolean b24 = server0.removeBan(iP23);
    tp2.Server server25 = new tp2.Server();
    long long26 = server25.getLastUpdate();
    server25.update();
    tp2.IP iP28 = null;
    boolean b29 = server25.connect(iP28);
    server25.update();
    tp2.ITime iTime31 = server25.getTime();
    server0.setTime(iTime31);
    java.lang.String str33 = server0.toString();
    tp2.IP iP34 = null;
    boolean b35 = server0.removeBan(iP34);
    tp2.IP iP36 = null;
    boolean b37 = server0.removeBan(iP36);
    tp2.IP iP38 = null;
    boolean b39 = server0.removeException(iP38);
    server0.update();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long11 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long16 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long17 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long26 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str33 + "' != '" + "Server [lastUpdate=0, exceptions=(), bans={}]"+ "'", str33.equals("Server [lastUpdate=0, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == false);

  }

  @Test
  public void test13() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test13"); }


    tp2.Server server0 = new tp2.Server();
    tp2.ITime iTime1 = server0.getTime();
    server0.update();
    tp2.ITime iTime3 = server0.getTime();
    tp2.IP iP4 = null;
    boolean b5 = server0.connect(iP4);
    java.lang.String str6 = server0.toString();
    tp2.IP iP7 = null;
    boolean b8 = server0.removeBan(iP7);
    tp2.ITime iTime9 = server0.getTime();
    tp2.Server server10 = new tp2.Server();
    long long11 = server10.getLastUpdate();
    tp2.ITime iTime12 = server10.getTime();
    tp2.IP iP13 = null;
    boolean b14 = server10.removeBan(iP13);
    tp2.ITime iTime15 = server10.getTime();
    server0.setTime(iTime15);
    java.lang.String str17 = server0.toString();
    tp2.Server server18 = new tp2.Server();
    long long19 = server18.getLastUpdate();
    server18.update();
    tp2.IP iP21 = null;
    boolean b22 = server18.removeException(iP21);
    server18.update();
    tp2.ITime iTime24 = server18.getTime();
    tp2.IP iP25 = null;
    boolean b26 = server18.removeBan(iP25);
    long long27 = server18.getLastUpdate();
    tp2.ITime iTime28 = server18.getTime();
    server0.setTime(iTime28);
    long long30 = server0.getLastUpdate();
    tp2.IP iP31 = null;
    boolean b32 = server0.connect(iP31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Server [lastUpdate=1465509023883, exceptions=(), bans={}]"+ "'", str6.equals("Server [lastUpdate=1465509023883, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long11 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "Server [lastUpdate=1465509023883, exceptions=(), bans={}]"+ "'", str17.equals("Server [lastUpdate=1465509023883, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long19 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long27 == 1465509023884L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long30 == 1465509023883L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == true);

  }

  @Test
  public void test14() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test14"); }


    tp2.Server server0 = new tp2.Server();
    tp2.ITime iTime1 = server0.getTime();
    server0.update();
    tp2.ITime iTime3 = server0.getTime();
    tp2.IP iP4 = null;
    boolean b5 = server0.connect(iP4);
    java.lang.String str6 = server0.toString();
    tp2.IP iP7 = null;
    boolean b8 = server0.removeBan(iP7);
    tp2.ITime iTime9 = server0.getTime();
    java.lang.String str10 = server0.toString();
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
    org.junit.Assert.assertNotNull(iTime3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Server [lastUpdate=1465509023894, exceptions=(), bans={}]"+ "'", str6.equals("Server [lastUpdate=1465509023894, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Server [lastUpdate=1465509023894, exceptions=(), bans={}]"+ "'", str10.equals("Server [lastUpdate=1465509023894, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Server [lastUpdate=1465509023894, exceptions=(), bans={}]"+ "'", str11.equals("Server [lastUpdate=1465509023894, exceptions=(), bans={}]"));

  }

  @Test
  public void test15() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test15"); }


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
    tp2.IP iP10 = null;
    boolean b11 = server9.connect(iP10);
    java.lang.String str12 = server9.toString();
    tp2.ITime iTime13 = server9.getTime();
    server0.setTime(iTime13);
    server0.update();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Server [lastUpdate=0, exceptions=(), bans={}]"+ "'", str12.equals("Server [lastUpdate=0, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime13);

  }

  @Test
  public void test16() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test16"); }


    tp2.Server server0 = new tp2.Server();
    long long1 = server0.getLastUpdate();
    java.lang.String str2 = server0.toString();
    server0.update();
    java.lang.String str4 = server0.toString();
    tp2.IP iP5 = null;
    boolean b6 = server0.connect(iP5);
    java.lang.String str7 = server0.toString();
    tp2.ITime iTime8 = server0.getTime();
    tp2.IP iP9 = null;
    boolean b10 = server0.removeBan(iP9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Server [lastUpdate=0, exceptions=(), bans={}]"+ "'", str2.equals("Server [lastUpdate=0, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Server [lastUpdate=1465509023898, exceptions=(), bans={}]"+ "'", str4.equals("Server [lastUpdate=1465509023898, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Server [lastUpdate=1465509023898, exceptions=(), bans={}]"+ "'", str7.equals("Server [lastUpdate=1465509023898, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);

  }

  @Test
  public void test17() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test17"); }


    tp2.Server server0 = new tp2.Server();
    long long1 = server0.getLastUpdate();
    tp2.ITime iTime2 = server0.getTime();
    tp2.IP iP3 = null;
    boolean b4 = server0.removeException(iP3);
    tp2.ITime iTime5 = server0.getTime();
    long long6 = server0.getLastUpdate();
    tp2.IP iP7 = null;
    boolean b8 = server0.removeException(iP7);
    java.lang.String str9 = server0.toString();
    tp2.ITime iTime10 = server0.getTime();
    tp2.IP iP11 = null;
    boolean b12 = server0.removeException(iP11);
    tp2.ITime iTime13 = server0.getTime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long6 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Server [lastUpdate=0, exceptions=(), bans={}]"+ "'", str9.equals("Server [lastUpdate=0, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime13);

  }

  @Test
  public void test18() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test18"); }


    tp2.Server server0 = new tp2.Server();
    tp2.ITime iTime1 = server0.getTime();
    server0.update();
    tp2.IP iP3 = null;
    boolean b4 = server0.connect(iP3);
    long long5 = server0.getLastUpdate();
    tp2.IP iP6 = null;
    boolean b7 = server0.connect(iP6);
    tp2.IP iP8 = null;
    boolean b9 = server0.removeException(iP8);
    tp2.IP iP10 = null;
    boolean b11 = server0.connect(iP10);
    tp2.IP iP12 = null;
    boolean b13 = server0.removeException(iP12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long5 == 1465509023905L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);

  }

  @Test
  public void test19() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test19"); }


    tp2.Server server0 = new tp2.Server();
    long long1 = server0.getLastUpdate();
    server0.update();
    tp2.IP iP3 = null;
    boolean b4 = server0.removeException(iP3);
    server0.update();
    server0.update();
    java.lang.String str7 = server0.toString();
    tp2.Server server8 = new tp2.Server();
    tp2.ITime iTime9 = server8.getTime();
    server8.update();
    tp2.IP iP11 = null;
    boolean b12 = server8.connect(iP11);
    tp2.Server server13 = new tp2.Server();
    tp2.ITime iTime14 = server13.getTime();
    tp2.IP iP15 = null;
    boolean b16 = server13.removeException(iP15);
    tp2.IP iP17 = null;
    boolean b18 = server13.connect(iP17);
    tp2.IP iP19 = null;
    boolean b20 = server13.removeException(iP19);
    tp2.IP iP21 = null;
    boolean b22 = server13.connect(iP21);
    tp2.IP iP23 = null;
    boolean b24 = server13.connect(iP23);
    tp2.Server server25 = new tp2.Server();
    tp2.ITime iTime26 = server25.getTime();
    server25.update();
    tp2.ITime iTime28 = server25.getTime();
    server13.setTime(iTime28);
    server8.setTime(iTime28);
    tp2.IP iP31 = null;
    boolean b32 = server8.removeException(iP31);
    tp2.ITime iTime33 = server8.getTime();
    server0.setTime(iTime33);
    tp2.ITime iTime35 = server0.getTime();
    server0.update();
    long long37 = server0.getLastUpdate();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Server [lastUpdate=1465509023907, exceptions=(), bans={}]"+ "'", str7.equals("Server [lastUpdate=1465509023907, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long37 == 1465509023908L);

  }

  @Test
  public void test20() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test20"); }


    tp2.Server server0 = new tp2.Server();
    tp2.ITime iTime1 = server0.getTime();
    server0.update();
    tp2.ITime iTime3 = server0.getTime();
    long long4 = server0.getLastUpdate();
    long long5 = server0.getLastUpdate();
    tp2.IP iP6 = null;
    boolean b7 = server0.removeException(iP6);
    java.lang.String str8 = server0.toString();
    tp2.IP iP9 = null;
    boolean b10 = server0.removeException(iP9);
    tp2.ITime iTime11 = server0.getTime();
    tp2.IP iP12 = null;
    boolean b13 = server0.connect(iP12);
    long long14 = server0.getLastUpdate();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long4 == 1465509023915L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long5 == 1465509023915L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Server [lastUpdate=1465509023915, exceptions=(), bans={}]"+ "'", str8.equals("Server [lastUpdate=1465509023915, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long14 == 1465509023915L);

  }

  @Test
  public void test21() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test21"); }


    tp2.Server server0 = new tp2.Server();
    tp2.ITime iTime1 = server0.getTime();
    server0.update();
    tp2.ITime iTime3 = server0.getTime();
    tp2.IP iP4 = null;
    boolean b5 = server0.removeBan(iP4);
    server0.update();
    tp2.ITime iTime7 = server0.getTime();
    long long8 = server0.getLastUpdate();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long8 == 1465509023918L);

  }

  @Test
  public void test22() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test22"); }


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
    boolean b10 = server0.removeException(iP9);
    tp2.IP iP11 = null;
    boolean b12 = server0.removeBan(iP11);
    tp2.IP iP13 = null;
    boolean b14 = server0.removeException(iP13);
    long long15 = server0.getLastUpdate();
    tp2.Server server16 = new tp2.Server();
    tp2.ITime iTime17 = server16.getTime();
    server16.update();
    tp2.ITime iTime19 = server16.getTime();
    tp2.IP iP20 = null;
    boolean b21 = server16.connect(iP20);
    tp2.IP iP22 = null;
    boolean b23 = server16.connect(iP22);
    tp2.ITime iTime24 = server16.getTime();
    server0.setTime(iTime24);
    tp2.Server server26 = new tp2.Server();
    tp2.ITime iTime27 = server26.getTime();
    server26.update();
    tp2.ITime iTime29 = server26.getTime();
    tp2.Server server30 = new tp2.Server();
    long long31 = server30.getLastUpdate();
    tp2.ITime iTime32 = server30.getTime();
    server26.setTime(iTime32);
    tp2.ITime iTime34 = server26.getTime();
    server0.setTime(iTime34);
    server0.update();
    tp2.Server server37 = new tp2.Server();
    long long38 = server37.getLastUpdate();
    java.lang.String str39 = server37.toString();
    java.lang.String str40 = server37.toString();
    tp2.IP iP41 = null;
    boolean b42 = server37.removeException(iP41);
    tp2.ITime iTime43 = server37.getTime();
    server0.setTime(iTime43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long5 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long8 == 1465509023920L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long15 == 1465509023920L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long31 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long38 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str39 + "' != '" + "Server [lastUpdate=0, exceptions=(), bans={}]"+ "'", str39.equals("Server [lastUpdate=0, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str40 + "' != '" + "Server [lastUpdate=0, exceptions=(), bans={}]"+ "'", str40.equals("Server [lastUpdate=0, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime43);

  }

  @Test
  public void test23() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test23"); }


    tp2.Server server0 = new tp2.Server();
    tp2.ITime iTime1 = server0.getTime();
    server0.update();
    tp2.ITime iTime3 = server0.getTime();
    tp2.IP iP4 = null;
    boolean b5 = server0.removeBan(iP4);
    tp2.IP iP6 = null;
    boolean b7 = server0.connect(iP6);
    server0.update();
    java.lang.String str9 = server0.toString();
    tp2.ITime iTime10 = server0.getTime();
    server0.update();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Server [lastUpdate=1465509023940, exceptions=(), bans={}]"+ "'", str9.equals("Server [lastUpdate=1465509023940, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime10);

  }

  @Test
  public void test24() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test24"); }


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
    boolean b11 = server0.connect(iP10);
    tp2.Server server12 = new tp2.Server();
    tp2.ITime iTime13 = server12.getTime();
    server12.update();
    tp2.ITime iTime15 = server12.getTime();
    server0.setTime(iTime15);
    tp2.IP iP17 = null;
    boolean b18 = server0.removeException(iP17);
    long long19 = server0.getLastUpdate();
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
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long19 == 0L);

  }

  @Test
  public void test25() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test25"); }


    tp2.Server server0 = new tp2.Server();
    tp2.ITime iTime1 = server0.getTime();
    tp2.IP iP2 = null;
    boolean b3 = server0.removeException(iP2);
    tp2.IP iP4 = null;
    boolean b5 = server0.connect(iP4);
    tp2.IP iP6 = null;
    boolean b7 = server0.connect(iP6);
    server0.update();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);

  }

  @Test
  public void test26() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test26"); }


    tp2.Server server0 = new tp2.Server();
    tp2.ITime iTime1 = server0.getTime();
    tp2.Server server2 = new tp2.Server();
    tp2.ITime iTime3 = server2.getTime();
    server0.setTime(iTime3);
    server0.update();
    java.lang.String str6 = server0.toString();
    tp2.Server server7 = new tp2.Server();
    tp2.ITime iTime8 = server7.getTime();
    server7.update();
    tp2.ITime iTime10 = server7.getTime();
    tp2.Server server11 = new tp2.Server();
    long long12 = server11.getLastUpdate();
    tp2.ITime iTime13 = server11.getTime();
    server7.setTime(iTime13);
    server0.setTime(iTime13);
    long long16 = server0.getLastUpdate();
    tp2.IP iP17 = null;
    boolean b18 = server0.removeException(iP17);
    tp2.IP iP19 = null;
    boolean b20 = server0.removeException(iP19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Server [lastUpdate=1465509023968, exceptions=(), bans={}]"+ "'", str6.equals("Server [lastUpdate=1465509023968, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long12 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long16 == 1465509023968L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);

  }

  @Test
  public void test27() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test27"); }


    tp2.Server server0 = new tp2.Server();
    tp2.ITime iTime1 = server0.getTime();
    server0.update();
    tp2.IP iP3 = null;
    boolean b4 = server0.connect(iP3);
    long long5 = server0.getLastUpdate();
    tp2.IP iP6 = null;
    boolean b7 = server0.connect(iP6);
    tp2.ITime iTime8 = server0.getTime();
    java.lang.String str9 = server0.toString();
    tp2.Server server10 = new tp2.Server();
    tp2.ITime iTime11 = server10.getTime();
    server10.update();
    tp2.ITime iTime13 = server10.getTime();
    tp2.Server server14 = new tp2.Server();
    long long15 = server14.getLastUpdate();
    tp2.ITime iTime16 = server14.getTime();
    server10.setTime(iTime16);
    tp2.IP iP18 = null;
    boolean b19 = server10.connect(iP18);
    long long20 = server10.getLastUpdate();
    java.lang.String str21 = server10.toString();
    tp2.ITime iTime22 = server10.getTime();
    server10.update();
    java.lang.String str24 = server10.toString();
    tp2.Server server25 = new tp2.Server();
    tp2.ITime iTime26 = server25.getTime();
    tp2.Server server27 = new tp2.Server();
    tp2.ITime iTime28 = server27.getTime();
    server25.setTime(iTime28);
    server25.update();
    java.lang.String str31 = server25.toString();
    tp2.ITime iTime32 = server25.getTime();
    server10.setTime(iTime32);
    server0.setTime(iTime32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long5 == 1465509023979L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Server [lastUpdate=1465509023979, exceptions=(), bans={}]"+ "'", str9.equals("Server [lastUpdate=1465509023979, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long15 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long20 == 1465509023979L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "Server [lastUpdate=1465509023979, exceptions=(), bans={}]"+ "'", str21.equals("Server [lastUpdate=1465509023979, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + "Server [lastUpdate=1465509023980, exceptions=(), bans={}]"+ "'", str24.equals("Server [lastUpdate=1465509023980, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str31 + "' != '" + "Server [lastUpdate=1465509023981, exceptions=(), bans={}]"+ "'", str31.equals("Server [lastUpdate=1465509023981, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime32);

  }

  @Test
  public void test28() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test28"); }


    tp2.Server server0 = new tp2.Server();
    long long1 = server0.getLastUpdate();
    long long2 = server0.getLastUpdate();
    java.lang.String str3 = server0.toString();
    tp2.IP iP4 = null;
    boolean b5 = server0.connect(iP4);
    server0.update();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long2 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Server [lastUpdate=0, exceptions=(), bans={}]"+ "'", str3.equals("Server [lastUpdate=0, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);

  }

  @Test
  public void test29() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test29"); }


    tp2.Server server0 = new tp2.Server();
    tp2.ITime iTime1 = server0.getTime();
    server0.update();
    tp2.IP iP3 = null;
    boolean b4 = server0.connect(iP3);
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
    boolean b16 = server5.connect(iP15);
    tp2.Server server17 = new tp2.Server();
    tp2.ITime iTime18 = server17.getTime();
    server17.update();
    tp2.ITime iTime20 = server17.getTime();
    server5.setTime(iTime20);
    server0.setTime(iTime20);
    tp2.IP iP23 = null;
    boolean b24 = server0.removeException(iP23);
    tp2.ITime iTime25 = server0.getTime();
    tp2.IP iP26 = null;
    boolean b27 = server0.connect(iP26);
    java.lang.String str28 = server0.toString();
    server0.update();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
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
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str28 + "' != '" + "Server [lastUpdate=1465509023996, exceptions=(), bans={}]"+ "'", str28.equals("Server [lastUpdate=1465509023996, exceptions=(), bans={}]"));

  }

  @Test
  public void test30() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test30"); }


    tp2.Server server0 = new tp2.Server();
    long long1 = server0.getLastUpdate();
    tp2.ITime iTime2 = server0.getTime();
    tp2.IP iP3 = null;
    boolean b4 = server0.removeException(iP3);
    tp2.IP iP5 = null;
    boolean b6 = server0.removeBan(iP5);
    long long7 = server0.getLastUpdate();
    tp2.IP iP8 = null;
    boolean b9 = server0.removeException(iP8);
    tp2.IP iP10 = null;
    boolean b11 = server0.removeException(iP10);
    tp2.IP iP12 = null;
    boolean b13 = server0.removeBan(iP12);
    tp2.IP iP14 = null;
    boolean b15 = server0.removeException(iP14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long7 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);

  }

  @Test
  public void test31() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test31"); }


    tp2.Server server0 = new tp2.Server();
    long long1 = server0.getLastUpdate();
    server0.update();
    tp2.IP iP3 = null;
    boolean b4 = server0.removeException(iP3);
    server0.update();
    server0.update();
    server0.update();
    tp2.IP iP8 = null;
    boolean b9 = server0.removeBan(iP8);
    tp2.IP iP10 = null;
    boolean b11 = server0.removeBan(iP10);
    tp2.IP iP12 = null;
    boolean b13 = server0.removeException(iP12);
    server0.update();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);

  }

  @Test
  public void test32() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test32"); }


    tp2.Server server0 = new tp2.Server();
    long long1 = server0.getLastUpdate();
    server0.update();
    tp2.IP iP3 = null;
    boolean b4 = server0.removeException(iP3);
    server0.update();
    long long6 = server0.getLastUpdate();
    java.lang.String str7 = server0.toString();
    tp2.ITime iTime8 = server0.getTime();
    server0.update();
    tp2.IP iP10 = null;
    boolean b11 = server0.removeBan(iP10);
    tp2.IP iP12 = null;
    boolean b13 = server0.removeException(iP12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long6 == 1465509024012L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Server [lastUpdate=1465509024012, exceptions=(), bans={}]"+ "'", str7.equals("Server [lastUpdate=1465509024012, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);

  }

  @Test
  public void test33() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test33"); }


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
    boolean b10 = server0.connect(iP9);
    java.lang.String str11 = server0.toString();
    java.lang.String str12 = server0.toString();
    tp2.Server server13 = new tp2.Server();
    long long14 = server13.getLastUpdate();
    tp2.ITime iTime15 = server13.getTime();
    server0.setTime(iTime15);
    long long17 = server0.getLastUpdate();
    tp2.Server server18 = new tp2.Server();
    long long19 = server18.getLastUpdate();
    server18.update();
    tp2.ITime iTime21 = server18.getTime();
    server0.setTime(iTime21);
    long long23 = server0.getLastUpdate();
    long long24 = server0.getLastUpdate();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long5 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long8 == 1465509024013L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Server [lastUpdate=1465509024013, exceptions=(), bans={}]"+ "'", str11.equals("Server [lastUpdate=1465509024013, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Server [lastUpdate=1465509024013, exceptions=(), bans={}]"+ "'", str12.equals("Server [lastUpdate=1465509024013, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long14 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long17 == 1465509024013L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long19 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long23 == 1465509024013L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long24 == 1465509024013L);

  }

  @Test
  public void test34() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test34"); }


    tp2.Server server0 = new tp2.Server();
    tp2.ITime iTime1 = server0.getTime();
    tp2.IP iP2 = null;
    boolean b3 = server0.removeException(iP2);
    tp2.IP iP4 = null;
    boolean b5 = server0.connect(iP4);
    tp2.IP iP6 = null;
    boolean b7 = server0.removeException(iP6);
    java.lang.String str8 = server0.toString();
    java.lang.String str9 = server0.toString();
    tp2.IP iP10 = null;
    boolean b11 = server0.connect(iP10);
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
    java.lang.String str24 = server12.toString();
    tp2.IP iP25 = null;
    boolean b26 = server12.removeBan(iP25);
    tp2.ITime iTime27 = server12.getTime();
    server0.setTime(iTime27);
    tp2.IP iP29 = null;
    boolean b30 = server0.removeBan(iP29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Server [lastUpdate=0, exceptions=(), bans={}]"+ "'", str8.equals("Server [lastUpdate=0, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Server [lastUpdate=0, exceptions=(), bans={}]"+ "'", str9.equals("Server [lastUpdate=0, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
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
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + "Server [lastUpdate=0, exceptions=(), bans={}]"+ "'", str24.equals("Server [lastUpdate=0, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);

  }

  @Test
  public void test35() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test35"); }


    tp2.Server server0 = new tp2.Server();
    long long1 = server0.getLastUpdate();
    server0.update();
    tp2.IP iP3 = null;
    boolean b4 = server0.removeBan(iP3);
    tp2.Server server5 = new tp2.Server();
    long long6 = server5.getLastUpdate();
    server5.update();
    tp2.IP iP8 = null;
    boolean b9 = server5.removeException(iP8);
    server5.update();
    tp2.ITime iTime11 = server5.getTime();
    server0.setTime(iTime11);
    tp2.IP iP13 = null;
    boolean b14 = server0.removeException(iP13);
    tp2.ITime iTime15 = server0.getTime();
    tp2.Server server16 = new tp2.Server();
    tp2.ITime iTime17 = server16.getTime();
    tp2.IP iP18 = null;
    boolean b19 = server16.connect(iP18);
    tp2.IP iP20 = null;
    boolean b21 = server16.removeException(iP20);
    long long22 = server16.getLastUpdate();
    tp2.IP iP23 = null;
    boolean b24 = server16.removeBan(iP23);
    java.lang.String str25 = server16.toString();
    tp2.Server server26 = new tp2.Server();
    long long27 = server26.getLastUpdate();
    tp2.ITime iTime28 = server26.getTime();
    tp2.IP iP29 = null;
    boolean b30 = server26.removeException(iP29);
    tp2.IP iP31 = null;
    boolean b32 = server26.removeBan(iP31);
    tp2.ITime iTime33 = server26.getTime();
    server16.setTime(iTime33);
    server0.setTime(iTime33);
    java.lang.String str36 = server0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long6 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long22 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + "Server [lastUpdate=0, exceptions=(), bans={}]"+ "'", str25.equals("Server [lastUpdate=0, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long27 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str36 + "' != '" + "Server [lastUpdate=1465509024030, exceptions=(), bans={}]"+ "'", str36.equals("Server [lastUpdate=1465509024030, exceptions=(), bans={}]"));

  }

  @Test
  public void test36() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test36"); }


    tp2.Server server0 = new tp2.Server();
    tp2.ITime iTime1 = server0.getTime();
    server0.update();
    tp2.ITime iTime3 = server0.getTime();
    tp2.IP iP4 = null;
    boolean b5 = server0.connect(iP4);
    java.lang.String str6 = server0.toString();
    tp2.IP iP7 = null;
    boolean b8 = server0.removeBan(iP7);
    tp2.ITime iTime9 = server0.getTime();
    tp2.IP iP10 = null;
    boolean b11 = server0.removeBan(iP10);
    tp2.ITime iTime12 = server0.getTime();
    tp2.Server server13 = new tp2.Server();
    tp2.ITime iTime14 = server13.getTime();
    tp2.IP iP15 = null;
    boolean b16 = server13.removeException(iP15);
    java.lang.String str17 = server13.toString();
    tp2.ITime iTime18 = server13.getTime();
    tp2.IP iP19 = null;
    boolean b20 = server13.removeException(iP19);
    tp2.Server server21 = new tp2.Server();
    tp2.ITime iTime22 = server21.getTime();
    server21.update();
    tp2.ITime iTime24 = server21.getTime();
    tp2.Server server25 = new tp2.Server();
    tp2.ITime iTime26 = server25.getTime();
    server25.update();
    tp2.IP iP28 = null;
    boolean b29 = server25.connect(iP28);
    long long30 = server25.getLastUpdate();
    java.lang.String str31 = server25.toString();
    tp2.Server server32 = new tp2.Server();
    long long33 = server32.getLastUpdate();
    server32.update();
    tp2.IP iP35 = null;
    boolean b36 = server32.removeBan(iP35);
    tp2.Server server37 = new tp2.Server();
    long long38 = server37.getLastUpdate();
    server37.update();
    tp2.IP iP40 = null;
    boolean b41 = server37.removeException(iP40);
    server37.update();
    tp2.ITime iTime43 = server37.getTime();
    server32.setTime(iTime43);
    server25.setTime(iTime43);
    server21.setTime(iTime43);
    server13.setTime(iTime43);
    server0.setTime(iTime43);
    tp2.ITime iTime49 = server0.getTime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Server [lastUpdate=1465509024038, exceptions=(), bans={}]"+ "'", str6.equals("Server [lastUpdate=1465509024038, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
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
    org.junit.Assert.assertNotNull(iTime26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long30 == 1465509024040L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str31 + "' != '" + "Server [lastUpdate=1465509024040, exceptions=(), bans={}]"+ "'", str31.equals("Server [lastUpdate=1465509024040, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long33 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long38 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime49);

  }

  @Test
  public void test37() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test37"); }


    tp2.Server server0 = new tp2.Server();
    tp2.ITime iTime1 = server0.getTime();
    tp2.IP iP2 = null;
    boolean b3 = server0.connect(iP2);
    tp2.IP iP4 = null;
    boolean b5 = server0.removeException(iP4);
    long long6 = server0.getLastUpdate();
    java.lang.String str7 = server0.toString();
    tp2.Server server8 = new tp2.Server();
    tp2.ITime iTime9 = server8.getTime();
    server8.update();
    tp2.ITime iTime11 = server8.getTime();
    tp2.Server server12 = new tp2.Server();
    long long13 = server12.getLastUpdate();
    tp2.ITime iTime14 = server12.getTime();
    server8.setTime(iTime14);
    java.lang.String str16 = server8.toString();
    tp2.Server server17 = new tp2.Server();
    tp2.ITime iTime18 = server17.getTime();
    server17.update();
    tp2.ITime iTime20 = server17.getTime();
    tp2.Server server21 = new tp2.Server();
    long long22 = server21.getLastUpdate();
    tp2.ITime iTime23 = server21.getTime();
    server17.setTime(iTime23);
    server8.setTime(iTime23);
    server0.setTime(iTime23);
    tp2.Server server27 = new tp2.Server();
    tp2.ITime iTime28 = server27.getTime();
    server27.update();
    tp2.IP iP30 = null;
    boolean b31 = server27.connect(iP30);
    long long32 = server27.getLastUpdate();
    tp2.Server server33 = new tp2.Server();
    tp2.ITime iTime34 = server33.getTime();
    server33.update();
    tp2.ITime iTime36 = server33.getTime();
    tp2.IP iP37 = null;
    boolean b38 = server33.removeBan(iP37);
    server33.update();
    tp2.ITime iTime40 = server33.getTime();
    server27.setTime(iTime40);
    server0.setTime(iTime40);
    tp2.IP iP43 = null;
    boolean b44 = server0.removeBan(iP43);
    tp2.ITime iTime45 = server0.getTime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long6 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Server [lastUpdate=0, exceptions=(), bans={}]"+ "'", str7.equals("Server [lastUpdate=0, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long13 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "Server [lastUpdate=1465509024067, exceptions=(), bans={}]"+ "'", str16.equals("Server [lastUpdate=1465509024067, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long22 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long32 == 1465509024068L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime45);

  }

  @Test
  public void test38() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test38"); }


    tp2.Server server0 = new tp2.Server();
    long long1 = server0.getLastUpdate();
    tp2.ITime iTime2 = server0.getTime();
    tp2.IP iP3 = null;
    boolean b4 = server0.removeException(iP3);
    tp2.ITime iTime5 = server0.getTime();
    long long6 = server0.getLastUpdate();
    tp2.IP iP7 = null;
    boolean b8 = server0.removeException(iP7);
    java.lang.String str9 = server0.toString();
    long long10 = server0.getLastUpdate();
    tp2.IP iP11 = null;
    boolean b12 = server0.connect(iP11);
    tp2.IP iP13 = null;
    boolean b14 = server0.removeException(iP13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long6 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Server [lastUpdate=0, exceptions=(), bans={}]"+ "'", str9.equals("Server [lastUpdate=0, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long10 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);

  }

  @Test
  public void test39() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test39"); }


    tp2.Server server0 = new tp2.Server();
    long long1 = server0.getLastUpdate();
    server0.update();
    tp2.IP iP3 = null;
    boolean b4 = server0.removeException(iP3);
    server0.update();
    server0.update();
    server0.update();
    tp2.ITime iTime8 = server0.getTime();
    tp2.IP iP9 = null;
    boolean b10 = server0.removeException(iP9);
    tp2.IP iP11 = null;
    boolean b12 = server0.removeException(iP11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);

  }

  @Test
  public void test40() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test40"); }


    tp2.Server server0 = new tp2.Server();
    tp2.ITime iTime1 = server0.getTime();
    server0.update();
    tp2.ITime iTime3 = server0.getTime();
    tp2.Server server4 = new tp2.Server();
    long long5 = server4.getLastUpdate();
    tp2.ITime iTime6 = server4.getTime();
    server0.setTime(iTime6);
    tp2.IP iP8 = null;
    boolean b9 = server0.connect(iP8);
    long long10 = server0.getLastUpdate();
    tp2.Server server11 = new tp2.Server();
    tp2.ITime iTime12 = server11.getTime();
    server11.update();
    tp2.IP iP14 = null;
    boolean b15 = server11.connect(iP14);
    tp2.Server server16 = new tp2.Server();
    tp2.ITime iTime17 = server16.getTime();
    tp2.IP iP18 = null;
    boolean b19 = server16.removeException(iP18);
    tp2.IP iP20 = null;
    boolean b21 = server16.connect(iP20);
    tp2.IP iP22 = null;
    boolean b23 = server16.removeException(iP22);
    tp2.IP iP24 = null;
    boolean b25 = server16.connect(iP24);
    tp2.IP iP26 = null;
    boolean b27 = server16.connect(iP26);
    tp2.Server server28 = new tp2.Server();
    tp2.ITime iTime29 = server28.getTime();
    server28.update();
    tp2.ITime iTime31 = server28.getTime();
    server16.setTime(iTime31);
    server11.setTime(iTime31);
    tp2.IP iP34 = null;
    boolean b35 = server11.removeException(iP34);
    tp2.ITime iTime36 = server11.getTime();
    server0.setTime(iTime36);
    tp2.IP iP38 = null;
    boolean b39 = server0.removeBan(iP38);
    tp2.IP iP40 = null;
    boolean b41 = server0.removeException(iP40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long5 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long10 == 1465509024127L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == false);

  }

  @Test
  public void test41() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test41"); }


    tp2.Server server0 = new tp2.Server();
    tp2.ITime iTime1 = server0.getTime();
    server0.update();
    tp2.ITime iTime3 = server0.getTime();
    long long4 = server0.getLastUpdate();
    long long5 = server0.getLastUpdate();
    tp2.IP iP6 = null;
    boolean b7 = server0.removeException(iP6);
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
    org.junit.Assert.assertNotNull(iTime1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long4 == 1465509024145L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long5 == 1465509024145L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Server [lastUpdate=1465509024145, exceptions=(), bans={}]"+ "'", str8.equals("Server [lastUpdate=1465509024145, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);

  }

  @Test
  public void test42() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test42"); }


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
    boolean b10 = server0.removeException(iP9);
    tp2.IP iP11 = null;
    boolean b12 = server0.connect(iP11);
    server0.update();
    tp2.ITime iTime14 = server0.getTime();
    tp2.IP iP15 = null;
    boolean b16 = server0.removeBan(iP15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long5 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long8 == 1465509024145L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);

  }

  @Test
  public void test43() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test43"); }


    tp2.Server server0 = new tp2.Server();
    tp2.ITime iTime1 = server0.getTime();
    server0.update();
    tp2.IP iP3 = null;
    boolean b4 = server0.connect(iP3);
    long long5 = server0.getLastUpdate();
    tp2.IP iP6 = null;
    boolean b7 = server0.removeBan(iP6);
    server0.update();
    java.lang.String str9 = server0.toString();
    tp2.Server server10 = new tp2.Server();
    long long11 = server10.getLastUpdate();
    long long12 = server10.getLastUpdate();
    java.lang.String str13 = server10.toString();
    tp2.Server server14 = new tp2.Server();
    tp2.ITime iTime15 = server14.getTime();
    server14.update();
    tp2.ITime iTime17 = server14.getTime();
    tp2.Server server18 = new tp2.Server();
    long long19 = server18.getLastUpdate();
    tp2.ITime iTime20 = server18.getTime();
    server14.setTime(iTime20);
    tp2.IP iP22 = null;
    boolean b23 = server14.connect(iP22);
    long long24 = server14.getLastUpdate();
    tp2.ITime iTime25 = server14.getTime();
    server10.setTime(iTime25);
    server0.setTime(iTime25);
    long long28 = server0.getLastUpdate();
    tp2.IP iP29 = null;
    boolean b30 = server0.removeException(iP29);
    tp2.IP iP31 = null;
    boolean b32 = server0.removeException(iP31);
    long long33 = server0.getLastUpdate();
    java.lang.String str34 = server0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long5 == 1465509024151L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Server [lastUpdate=1465509024151, exceptions=(), bans={}]"+ "'", str9.equals("Server [lastUpdate=1465509024151, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long11 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long12 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Server [lastUpdate=0, exceptions=(), bans={}]"+ "'", str13.equals("Server [lastUpdate=0, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long19 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long24 == 1465509024152L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long28 == 1465509024151L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long33 == 1465509024151L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str34 + "' != '" + "Server [lastUpdate=1465509024151, exceptions=(), bans={}]"+ "'", str34.equals("Server [lastUpdate=1465509024151, exceptions=(), bans={}]"));

  }

  @Test
  public void test44() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test44"); }


    tp2.Server server0 = new tp2.Server();
    tp2.ITime iTime1 = server0.getTime();
    tp2.IP iP2 = null;
    boolean b3 = server0.connect(iP2);
    tp2.IP iP4 = null;
    boolean b5 = server0.removeException(iP4);
    long long6 = server0.getLastUpdate();
    tp2.IP iP7 = null;
    boolean b8 = server0.removeBan(iP7);
    tp2.Server server9 = new tp2.Server();
    long long10 = server9.getLastUpdate();
    tp2.IP iP11 = null;
    boolean b12 = server9.removeException(iP11);
    tp2.Server server13 = new tp2.Server();
    tp2.ITime iTime14 = server13.getTime();
    server13.update();
    tp2.ITime iTime16 = server13.getTime();
    tp2.Server server17 = new tp2.Server();
    long long18 = server17.getLastUpdate();
    tp2.ITime iTime19 = server17.getTime();
    server13.setTime(iTime19);
    tp2.ITime iTime21 = server13.getTime();
    server9.setTime(iTime21);
    server0.setTime(iTime21);
    java.lang.String str24 = server0.toString();
    tp2.Server server25 = new tp2.Server();
    long long26 = server25.getLastUpdate();
    server25.update();
    tp2.IP iP28 = null;
    boolean b29 = server25.removeException(iP28);
    server25.update();
    long long31 = server25.getLastUpdate();
    java.lang.String str32 = server25.toString();
    tp2.ITime iTime33 = server25.getTime();
    server0.setTime(iTime33);
    long long35 = server0.getLastUpdate();
    tp2.IP iP36 = null;
    boolean b37 = server0.removeException(iP36);
    tp2.IP iP38 = null;
    boolean b39 = server0.connect(iP38);
    server0.update();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long6 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long10 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long18 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + "Server [lastUpdate=0, exceptions=(), bans={}]"+ "'", str24.equals("Server [lastUpdate=0, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long26 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long31 == 1465509024164L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str32 + "' != '" + "Server [lastUpdate=1465509024164, exceptions=(), bans={}]"+ "'", str32.equals("Server [lastUpdate=1465509024164, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long35 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == true);

  }

  @Test
  public void test45() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test45"); }


    tp2.Server server0 = new tp2.Server();
    tp2.ITime iTime1 = server0.getTime();
    server0.update();
    tp2.ITime iTime3 = server0.getTime();
    tp2.IP iP4 = null;
    boolean b5 = server0.removeBan(iP4);
    tp2.IP iP6 = null;
    boolean b7 = server0.connect(iP6);
    server0.update();
    tp2.IP iP9 = null;
    boolean b10 = server0.removeBan(iP9);
    long long11 = server0.getLastUpdate();
    tp2.IP iP12 = null;
    boolean b13 = server0.removeBan(iP12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long11 == 1465509024176L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);

  }

  @Test
  public void test46() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test46"); }


    tp2.Server server0 = new tp2.Server();
    tp2.ITime iTime1 = server0.getTime();
    server0.update();
    tp2.IP iP3 = null;
    boolean b4 = server0.connect(iP3);
    long long5 = server0.getLastUpdate();
    java.lang.String str6 = server0.toString();
    java.lang.String str7 = server0.toString();
    java.lang.String str8 = server0.toString();
    tp2.ITime iTime9 = server0.getTime();
    tp2.ITime iTime10 = server0.getTime();
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
    org.junit.Assert.assertNotNull(iTime1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long5 == 1465509024177L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Server [lastUpdate=1465509024177, exceptions=(), bans={}]"+ "'", str6.equals("Server [lastUpdate=1465509024177, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Server [lastUpdate=1465509024177, exceptions=(), bans={}]"+ "'", str7.equals("Server [lastUpdate=1465509024177, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Server [lastUpdate=1465509024177, exceptions=(), bans={}]"+ "'", str8.equals("Server [lastUpdate=1465509024177, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);

  }

  @Test
  public void test47() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test47"); }


    tp2.Server server0 = new tp2.Server();
    tp2.ITime iTime1 = server0.getTime();
    server0.update();
    tp2.IP iP3 = null;
    boolean b4 = server0.connect(iP3);
    long long5 = server0.getLastUpdate();
    tp2.IP iP6 = null;
    boolean b7 = server0.removeBan(iP6);
    server0.update();
    java.lang.String str9 = server0.toString();
    tp2.IP iP10 = null;
    boolean b11 = server0.removeBan(iP10);
    tp2.Server server12 = new tp2.Server();
    long long13 = server12.getLastUpdate();
    server12.update();
    tp2.IP iP15 = null;
    boolean b16 = server12.removeBan(iP15);
    tp2.Server server17 = new tp2.Server();
    long long18 = server17.getLastUpdate();
    server17.update();
    tp2.IP iP20 = null;
    boolean b21 = server17.removeException(iP20);
    server17.update();
    tp2.ITime iTime23 = server17.getTime();
    server12.setTime(iTime23);
    tp2.IP iP25 = null;
    boolean b26 = server12.removeException(iP25);
    tp2.IP iP27 = null;
    boolean b28 = server12.connect(iP27);
    tp2.ITime iTime29 = server12.getTime();
    tp2.ITime iTime30 = server12.getTime();
    server0.setTime(iTime30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long5 == 1465509024178L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Server [lastUpdate=1465509024178, exceptions=(), bans={}]"+ "'", str9.equals("Server [lastUpdate=1465509024178, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long13 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long18 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime30);

  }

  @Test
  public void test48() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test48"); }


    tp2.Server server0 = new tp2.Server();
    tp2.ITime iTime1 = server0.getTime();
    server0.update();
    tp2.IP iP3 = null;
    boolean b4 = server0.connect(iP3);
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
    boolean b16 = server5.connect(iP15);
    tp2.Server server17 = new tp2.Server();
    tp2.ITime iTime18 = server17.getTime();
    server17.update();
    tp2.ITime iTime20 = server17.getTime();
    server5.setTime(iTime20);
    server0.setTime(iTime20);
    tp2.IP iP23 = null;
    boolean b24 = server0.removeException(iP23);
    tp2.ITime iTime25 = server0.getTime();
    tp2.IP iP26 = null;
    boolean b27 = server0.removeException(iP26);
    tp2.Server server28 = new tp2.Server();
    long long29 = server28.getLastUpdate();
    server28.update();
    tp2.IP iP31 = null;
    boolean b32 = server28.removeBan(iP31);
    tp2.Server server33 = new tp2.Server();
    long long34 = server33.getLastUpdate();
    server33.update();
    tp2.IP iP36 = null;
    boolean b37 = server33.removeException(iP36);
    server33.update();
    tp2.ITime iTime39 = server33.getTime();
    server28.setTime(iTime39);
    long long41 = server28.getLastUpdate();
    tp2.ITime iTime42 = server28.getTime();
    server0.setTime(iTime42);
    server0.update();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
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
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long29 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long34 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long41 == 1465509024197L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime42);

  }

  @Test
  public void test49() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test49"); }


    tp2.Server server0 = new tp2.Server();
    long long1 = server0.getLastUpdate();
    server0.update();
    tp2.IP iP3 = null;
    boolean b4 = server0.removeBan(iP3);
    tp2.Server server5 = new tp2.Server();
    tp2.ITime iTime6 = server5.getTime();
    server5.update();
    tp2.ITime iTime8 = server5.getTime();
    server0.setTime(iTime8);
    server0.update();
    tp2.IP iP11 = null;
    boolean b12 = server0.connect(iP11);
    tp2.IP iP13 = null;
    boolean b14 = server0.removeException(iP13);
    tp2.Server server15 = new tp2.Server();
    tp2.ITime iTime16 = server15.getTime();
    tp2.IP iP17 = null;
    boolean b18 = server15.removeException(iP17);
    tp2.IP iP19 = null;
    boolean b20 = server15.connect(iP19);
    tp2.IP iP21 = null;
    boolean b22 = server15.removeException(iP21);
    tp2.IP iP23 = null;
    boolean b24 = server15.connect(iP23);
    tp2.IP iP25 = null;
    boolean b26 = server15.connect(iP25);
    java.lang.String str27 = server15.toString();
    tp2.ITime iTime28 = server15.getTime();
    server0.setTime(iTime28);
    java.lang.String str30 = server0.toString();
    tp2.Server server31 = new tp2.Server();
    tp2.ITime iTime32 = server31.getTime();
    tp2.IP iP33 = null;
    boolean b34 = server31.connect(iP33);
    tp2.IP iP35 = null;
    boolean b36 = server31.removeException(iP35);
    long long37 = server31.getLastUpdate();
    tp2.ITime iTime38 = server31.getTime();
    tp2.ITime iTime39 = server31.getTime();
    server0.setTime(iTime39);
    tp2.IP iP41 = null;
    boolean b42 = server0.removeException(iP41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str27 + "' != '" + "Server [lastUpdate=0, exceptions=(), bans={}]"+ "'", str27.equals("Server [lastUpdate=0, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str30 + "' != '" + "Server [lastUpdate=1465509024212, exceptions=(), bans={}]"+ "'", str30.equals("Server [lastUpdate=1465509024212, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long37 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == false);

  }

  @Test
  public void test50() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test50"); }


    tp2.Server server0 = new tp2.Server();
    tp2.ITime iTime1 = server0.getTime();
    server0.update();
    tp2.ITime iTime3 = server0.getTime();
    tp2.IP iP4 = null;
    boolean b5 = server0.connect(iP4);
    tp2.Server server6 = new tp2.Server();
    tp2.ITime iTime7 = server6.getTime();
    server6.update();
    tp2.IP iP9 = null;
    boolean b10 = server6.connect(iP9);
    long long11 = server6.getLastUpdate();
    tp2.Server server12 = new tp2.Server();
    tp2.ITime iTime13 = server12.getTime();
    server12.update();
    tp2.ITime iTime15 = server12.getTime();
    tp2.IP iP16 = null;
    boolean b17 = server12.connect(iP16);
    tp2.ITime iTime18 = server12.getTime();
    server6.setTime(iTime18);
    server0.setTime(iTime18);
    tp2.ITime iTime21 = null;
    server0.setTime(iTime21);
    java.lang.String str23 = server0.toString();
    tp2.IP iP24 = null;
    boolean b25 = server0.connect(iP24);
    tp2.IP iP26 = null;
    boolean b27 = server0.connect(iP26);
    tp2.Server server28 = new tp2.Server();
    long long29 = server28.getLastUpdate();
    tp2.Server server30 = new tp2.Server();
    tp2.ITime iTime31 = server30.getTime();
    server30.update();
    tp2.ITime iTime33 = server30.getTime();
    tp2.Server server34 = new tp2.Server();
    long long35 = server34.getLastUpdate();
    tp2.ITime iTime36 = server34.getTime();
    server30.setTime(iTime36);
    tp2.ITime iTime38 = server30.getTime();
    server28.setTime(iTime38);
    server0.setTime(iTime38);
    server0.update();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long11 == 1465509024226L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + "Server [lastUpdate=1465509024226, exceptions=(), bans={}]"+ "'", str23.equals("Server [lastUpdate=1465509024226, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long29 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long35 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime38);

  }

  @Test
  public void test51() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test51"); }


    tp2.Server server0 = new tp2.Server();
    long long1 = server0.getLastUpdate();
    tp2.ITime iTime2 = server0.getTime();
    tp2.IP iP3 = null;
    boolean b4 = server0.removeBan(iP3);
    tp2.ITime iTime5 = server0.getTime();
    tp2.IP iP6 = null;
    boolean b7 = server0.removeBan(iP6);
    tp2.IP iP8 = null;
    boolean b9 = server0.connect(iP8);
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
    org.junit.Assert.assertTrue(long1 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);

  }

  @Test
  public void test52() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test52"); }


    tp2.Server server0 = new tp2.Server();
    tp2.ITime iTime1 = server0.getTime();
    tp2.IP iP2 = null;
    boolean b3 = server0.removeException(iP2);
    java.lang.String str4 = server0.toString();
    tp2.IP iP5 = null;
    boolean b6 = server0.removeException(iP5);
    server0.update();
    tp2.IP iP8 = null;
    boolean b9 = server0.removeBan(iP8);
    tp2.ITime iTime10 = server0.getTime();
    java.lang.String str11 = server0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Server [lastUpdate=0, exceptions=(), bans={}]"+ "'", str4.equals("Server [lastUpdate=0, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Server [lastUpdate=1465509024250, exceptions=(), bans={}]"+ "'", str11.equals("Server [lastUpdate=1465509024250, exceptions=(), bans={}]"));

  }

  @Test
  public void test53() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test53"); }


    tp2.Server server0 = new tp2.Server();
    long long1 = server0.getLastUpdate();
    server0.update();
    tp2.IP iP3 = null;
    boolean b4 = server0.removeException(iP3);
    server0.update();
    long long6 = server0.getLastUpdate();
    tp2.IP iP7 = null;
    boolean b8 = server0.connect(iP7);
    tp2.IP iP9 = null;
    boolean b10 = server0.removeBan(iP9);
    tp2.ITime iTime11 = server0.getTime();
    tp2.IP iP12 = null;
    boolean b13 = server0.removeException(iP12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long6 == 1465509024251L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);

  }

  @Test
  public void test54() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test54"); }


    tp2.Server server0 = new tp2.Server();
    long long1 = server0.getLastUpdate();
    java.lang.String str2 = server0.toString();
    tp2.IP iP3 = null;
    boolean b4 = server0.removeBan(iP3);
    tp2.IP iP5 = null;
    boolean b6 = server0.removeBan(iP5);
    long long7 = server0.getLastUpdate();
    tp2.Server server8 = new tp2.Server();
    tp2.ITime iTime9 = server8.getTime();
    tp2.IP iP10 = null;
    boolean b11 = server8.removeException(iP10);
    tp2.IP iP12 = null;
    boolean b13 = server8.connect(iP12);
    tp2.IP iP14 = null;
    boolean b15 = server8.connect(iP14);
    tp2.IP iP16 = null;
    boolean b17 = server8.connect(iP16);
    tp2.ITime iTime18 = server8.getTime();
    server0.setTime(iTime18);
    tp2.IP iP20 = null;
    boolean b21 = server0.removeException(iP20);
    tp2.IP iP22 = null;
    boolean b23 = server0.removeBan(iP22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Server [lastUpdate=0, exceptions=(), bans={}]"+ "'", str2.equals("Server [lastUpdate=0, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long7 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);

  }

  @Test
  public void test55() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test55"); }


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
    boolean b10 = server0.removeException(iP9);
    tp2.IP iP11 = null;
    boolean b12 = server0.removeBan(iP11);
    tp2.ITime iTime13 = null;
    server0.setTime(iTime13);
    tp2.IP iP15 = null;
    boolean b16 = server0.removeException(iP15);
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
    org.junit.Assert.assertNotNull(iTime1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long5 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long8 == 1465509024256L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "Server [lastUpdate=1465509024256, exceptions=(), bans={}]"+ "'", str17.equals("Server [lastUpdate=1465509024256, exceptions=(), bans={}]"));

  }

  @Test
  public void test56() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test56"); }


    tp2.Server server0 = new tp2.Server();
    long long1 = server0.getLastUpdate();
    server0.update();
    tp2.IP iP3 = null;
    boolean b4 = server0.removeException(iP3);
    server0.update();
    long long6 = server0.getLastUpdate();
    tp2.IP iP7 = null;
    boolean b8 = server0.connect(iP7);
    tp2.Server server9 = new tp2.Server();
    tp2.ITime iTime10 = server9.getTime();
    server9.update();
    tp2.ITime iTime12 = server9.getTime();
    server0.setTime(iTime12);
    tp2.IP iP14 = null;
    boolean b15 = server0.removeException(iP14);
    java.lang.String str16 = server0.toString();
    tp2.ITime iTime17 = server0.getTime();
    server0.update();
    tp2.ITime iTime19 = server0.getTime();
    tp2.ITime iTime20 = server0.getTime();
    tp2.Server server21 = new tp2.Server();
    tp2.ITime iTime22 = server21.getTime();
    server21.update();
    tp2.ITime iTime24 = server21.getTime();
    tp2.IP iP25 = null;
    boolean b26 = server21.removeBan(iP25);
    tp2.IP iP27 = null;
    boolean b28 = server21.connect(iP27);
    server21.update();
    tp2.ITime iTime30 = server21.getTime();
    server21.update();
    long long32 = server21.getLastUpdate();
    tp2.ITime iTime33 = server21.getTime();
    server0.setTime(iTime33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long6 == 1465509024262L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "Server [lastUpdate=1465509024262, exceptions=(), bans={}]"+ "'", str16.equals("Server [lastUpdate=1465509024262, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long32 == 1465509024264L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime33);

  }

  @Test
  public void test57() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test57"); }


    tp2.Server server0 = new tp2.Server();
    tp2.ITime iTime1 = server0.getTime();
    server0.update();
    tp2.ITime iTime3 = server0.getTime();
    tp2.IP iP4 = null;
    boolean b5 = server0.removeBan(iP4);
    server0.update();
    tp2.ITime iTime7 = server0.getTime();
    tp2.IP iP8 = null;
    boolean b9 = server0.connect(iP8);
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
    org.junit.Assert.assertNotNull(iTime1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long10 == 1465509024279L);

  }

  @Test
  public void test58() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test58"); }


    tp2.Server server0 = new tp2.Server();
    tp2.ITime iTime1 = server0.getTime();
    server0.update();
    tp2.IP iP3 = null;
    boolean b4 = server0.connect(iP3);
    long long5 = server0.getLastUpdate();
    java.lang.String str6 = server0.toString();
    java.lang.String str7 = server0.toString();
    java.lang.String str8 = server0.toString();
    tp2.ITime iTime9 = server0.getTime();
    tp2.ITime iTime10 = server0.getTime();
    tp2.IP iP11 = null;
    boolean b12 = server0.removeBan(iP11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long5 == 1465509024284L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Server [lastUpdate=1465509024284, exceptions=(), bans={}]"+ "'", str6.equals("Server [lastUpdate=1465509024284, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Server [lastUpdate=1465509024284, exceptions=(), bans={}]"+ "'", str7.equals("Server [lastUpdate=1465509024284, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Server [lastUpdate=1465509024284, exceptions=(), bans={}]"+ "'", str8.equals("Server [lastUpdate=1465509024284, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);

  }

  @Test
  public void test59() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test59"); }


    tp2.Server server0 = new tp2.Server();
    tp2.ITime iTime1 = server0.getTime();
    server0.update();
    tp2.IP iP3 = null;
    boolean b4 = server0.connect(iP3);
    long long5 = server0.getLastUpdate();
    tp2.IP iP6 = null;
    boolean b7 = server0.connect(iP6);
    tp2.IP iP8 = null;
    boolean b9 = server0.removeException(iP8);
    tp2.ITime iTime10 = server0.getTime();
    long long11 = server0.getLastUpdate();
    tp2.Server server12 = new tp2.Server();
    tp2.ITime iTime13 = server12.getTime();
    server12.update();
    tp2.ITime iTime15 = server12.getTime();
    tp2.Server server16 = new tp2.Server();
    long long17 = server16.getLastUpdate();
    tp2.ITime iTime18 = server16.getTime();
    server12.setTime(iTime18);
    tp2.IP iP20 = null;
    boolean b21 = server12.connect(iP20);
    long long22 = server12.getLastUpdate();
    java.lang.String str23 = server12.toString();
    tp2.Server server24 = new tp2.Server();
    long long25 = server24.getLastUpdate();
    java.lang.String str26 = server24.toString();
    tp2.IP iP27 = null;
    boolean b28 = server24.removeBan(iP27);
    tp2.Server server29 = new tp2.Server();
    tp2.ITime iTime30 = server29.getTime();
    server29.update();
    tp2.ITime iTime32 = server29.getTime();
    long long33 = server29.getLastUpdate();
    tp2.IP iP34 = null;
    boolean b35 = server29.removeBan(iP34);
    tp2.Server server36 = new tp2.Server();
    tp2.ITime iTime37 = server36.getTime();
    tp2.IP iP38 = null;
    boolean b39 = server36.removeException(iP38);
    tp2.IP iP40 = null;
    boolean b41 = server36.connect(iP40);
    tp2.Server server42 = new tp2.Server();
    long long43 = server42.getLastUpdate();
    tp2.ITime iTime44 = server42.getTime();
    server36.setTime(iTime44);
    server29.setTime(iTime44);
    server24.setTime(iTime44);
    server12.setTime(iTime44);
    server0.setTime(iTime44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long5 == 1465509024288L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long11 == 1465509024288L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long17 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long22 == 1465509024289L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + "Server [lastUpdate=1465509024289, exceptions=(), bans={}]"+ "'", str23.equals("Server [lastUpdate=1465509024289, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long25 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str26 + "' != '" + "Server [lastUpdate=0, exceptions=(), bans={}]"+ "'", str26.equals("Server [lastUpdate=0, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long33 == 1465509024290L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long43 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime44);

  }

  @Test
  public void test60() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test60"); }


    tp2.Server server0 = new tp2.Server();
    long long1 = server0.getLastUpdate();
    java.lang.String str2 = server0.toString();
    java.lang.String str3 = server0.toString();
    tp2.ITime iTime4 = server0.getTime();
    java.lang.String str5 = server0.toString();
    tp2.IP iP6 = null;
    boolean b7 = server0.removeBan(iP6);
    java.lang.String str8 = server0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Server [lastUpdate=0, exceptions=(), bans={}]"+ "'", str2.equals("Server [lastUpdate=0, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Server [lastUpdate=0, exceptions=(), bans={}]"+ "'", str3.equals("Server [lastUpdate=0, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Server [lastUpdate=0, exceptions=(), bans={}]"+ "'", str5.equals("Server [lastUpdate=0, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Server [lastUpdate=0, exceptions=(), bans={}]"+ "'", str8.equals("Server [lastUpdate=0, exceptions=(), bans={}]"));

  }

  @Test
  public void test61() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test61"); }


    tp2.Server server0 = new tp2.Server();
    long long1 = server0.getLastUpdate();
    server0.update();
    tp2.IP iP3 = null;
    boolean b4 = server0.removeBan(iP3);
    tp2.Server server5 = new tp2.Server();
    long long6 = server5.getLastUpdate();
    server5.update();
    tp2.IP iP8 = null;
    boolean b9 = server5.removeException(iP8);
    server5.update();
    tp2.ITime iTime11 = server5.getTime();
    server0.setTime(iTime11);
    tp2.IP iP13 = null;
    boolean b14 = server0.removeException(iP13);
    server0.update();
    tp2.Server server16 = new tp2.Server();
    tp2.ITime iTime17 = server16.getTime();
    server16.update();
    tp2.IP iP19 = null;
    boolean b20 = server16.connect(iP19);
    long long21 = server16.getLastUpdate();
    tp2.Server server22 = new tp2.Server();
    tp2.ITime iTime23 = server22.getTime();
    server22.update();
    tp2.ITime iTime25 = server22.getTime();
    tp2.IP iP26 = null;
    boolean b27 = server22.removeBan(iP26);
    server22.update();
    tp2.ITime iTime29 = server22.getTime();
    server16.setTime(iTime29);
    server0.setTime(iTime29);
    server0.update();
    tp2.Server server33 = new tp2.Server();
    tp2.ITime iTime34 = server33.getTime();
    server33.update();
    tp2.ITime iTime36 = server33.getTime();
    tp2.IP iP37 = null;
    boolean b38 = server33.removeBan(iP37);
    server33.update();
    tp2.Server server40 = new tp2.Server();
    tp2.ITime iTime41 = server40.getTime();
    tp2.Server server42 = new tp2.Server();
    tp2.ITime iTime43 = server42.getTime();
    server40.setTime(iTime43);
    server40.update();
    java.lang.String str46 = server40.toString();
    tp2.ITime iTime47 = server40.getTime();
    server33.setTime(iTime47);
    tp2.ITime iTime49 = server33.getTime();
    tp2.ITime iTime50 = server33.getTime();
    server0.setTime(iTime50);
    tp2.ITime iTime52 = server0.getTime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long6 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long21 == 1465509024314L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str46 + "' != '" + "Server [lastUpdate=1465509024316, exceptions=(), bans={}]"+ "'", str46.equals("Server [lastUpdate=1465509024316, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime52);

  }

  @Test
  public void test62() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test62"); }


    tp2.Server server0 = new tp2.Server();
    long long1 = server0.getLastUpdate();
    server0.update();
    tp2.IP iP3 = null;
    boolean b4 = server0.removeException(iP3);
    server0.update();
    long long6 = server0.getLastUpdate();
    java.lang.String str7 = server0.toString();
    java.lang.String str8 = server0.toString();
    server0.update();
    long long10 = server0.getLastUpdate();
    tp2.IP iP11 = null;
    boolean b12 = server0.removeException(iP11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long6 == 1465509024346L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Server [lastUpdate=1465509024346, exceptions=(), bans={}]"+ "'", str7.equals("Server [lastUpdate=1465509024346, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Server [lastUpdate=1465509024346, exceptions=(), bans={}]"+ "'", str8.equals("Server [lastUpdate=1465509024346, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long10 == 1465509024346L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);

  }

  @Test
  public void test63() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test63"); }


    tp2.Server server0 = new tp2.Server();
    long long1 = server0.getLastUpdate();
    server0.update();
    tp2.IP iP3 = null;
    boolean b4 = server0.removeBan(iP3);
    tp2.IP iP5 = null;
    boolean b6 = server0.removeBan(iP5);
    tp2.IP iP7 = null;
    boolean b8 = server0.removeException(iP7);
    java.lang.String str9 = server0.toString();
    tp2.IP iP10 = null;
    boolean b11 = server0.removeBan(iP10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Server [lastUpdate=1465509024347, exceptions=(), bans={}]"+ "'", str9.equals("Server [lastUpdate=1465509024347, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);

  }

  @Test
  public void test64() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test64"); }


    tp2.Server server0 = new tp2.Server();
    long long1 = server0.getLastUpdate();
    server0.update();
    tp2.IP iP3 = null;
    boolean b4 = server0.removeException(iP3);
    server0.update();
    long long6 = server0.getLastUpdate();
    tp2.IP iP7 = null;
    boolean b8 = server0.removeBan(iP7);
    tp2.IP iP9 = null;
    boolean b10 = server0.removeBan(iP9);
    server0.update();
    server0.update();
    tp2.IP iP13 = null;
    boolean b14 = server0.removeBan(iP13);
    tp2.IP iP15 = null;
    boolean b16 = server0.removeException(iP15);
    tp2.Server server17 = new tp2.Server();
    long long18 = server17.getLastUpdate();
    server17.update();
    tp2.IP iP20 = null;
    boolean b21 = server17.removeException(iP20);
    server17.update();
    long long23 = server17.getLastUpdate();
    tp2.IP iP24 = null;
    boolean b25 = server17.removeBan(iP24);
    tp2.IP iP26 = null;
    boolean b27 = server17.removeBan(iP26);
    long long28 = server17.getLastUpdate();
    tp2.Server server29 = new tp2.Server();
    tp2.ITime iTime30 = server29.getTime();
    tp2.IP iP31 = null;
    boolean b32 = server29.removeException(iP31);
    tp2.IP iP33 = null;
    boolean b34 = server29.connect(iP33);
    tp2.IP iP35 = null;
    boolean b36 = server29.removeException(iP35);
    tp2.IP iP37 = null;
    boolean b38 = server29.connect(iP37);
    tp2.IP iP39 = null;
    boolean b40 = server29.connect(iP39);
    tp2.Server server41 = new tp2.Server();
    tp2.ITime iTime42 = server41.getTime();
    server41.update();
    tp2.ITime iTime44 = server41.getTime();
    server29.setTime(iTime44);
    server17.setTime(iTime44);
    tp2.IP iP47 = null;
    boolean b48 = server17.removeException(iP47);
    long long49 = server17.getLastUpdate();
    tp2.IP iP50 = null;
    boolean b51 = server17.connect(iP50);
    tp2.IP iP52 = null;
    boolean b53 = server17.removeException(iP52);
    tp2.Server server54 = new tp2.Server();
    tp2.ITime iTime55 = server54.getTime();
    server54.update();
    tp2.IP iP57 = null;
    boolean b58 = server54.connect(iP57);
    long long59 = server54.getLastUpdate();
    long long60 = server54.getLastUpdate();
    tp2.ITime iTime61 = server54.getTime();
    tp2.ITime iTime62 = server54.getTime();
    server17.setTime(iTime62);
    server0.setTime(iTime62);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long6 == 1465509024364L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long18 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long23 == 1465509024365L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long28 == 1465509024365L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b48 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long49 == 1465509024365L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b51 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b53 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime55);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b58 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long59 == 1465509024367L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long60 == 1465509024367L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime61);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime62);

  }

  @Test
  public void test65() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test65"); }


    tp2.Server server0 = new tp2.Server();
    tp2.ITime iTime1 = server0.getTime();
    tp2.IP iP2 = null;
    boolean b3 = server0.connect(iP2);
    tp2.IP iP4 = null;
    boolean b5 = server0.removeException(iP4);
    long long6 = server0.getLastUpdate();
    tp2.ITime iTime7 = server0.getTime();
    tp2.ITime iTime8 = server0.getTime();
    tp2.IP iP9 = null;
    boolean b10 = server0.removeBan(iP9);
    tp2.IP iP11 = null;
    boolean b12 = server0.removeException(iP11);
    java.lang.String str13 = server0.toString();
    tp2.IP iP14 = null;
    boolean b15 = server0.removeBan(iP14);
    long long16 = server0.getLastUpdate();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Server [lastUpdate=0, exceptions=(), bans={}]"+ "'", str13.equals("Server [lastUpdate=0, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long16 == 0L);

  }

  @Test
  public void test66() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test66"); }


    tp2.Server server0 = new tp2.Server();
    tp2.ITime iTime1 = server0.getTime();
    tp2.IP iP2 = null;
    boolean b3 = server0.connect(iP2);
    tp2.IP iP4 = null;
    boolean b5 = server0.removeException(iP4);
    tp2.IP iP6 = null;
    boolean b7 = server0.removeException(iP6);
    tp2.IP iP8 = null;
    boolean b9 = server0.connect(iP8);
    tp2.Server server10 = new tp2.Server();
    long long11 = server10.getLastUpdate();
    server10.update();
    tp2.ITime iTime13 = server10.getTime();
    server0.setTime(iTime13);
    server0.update();
    tp2.Server server16 = new tp2.Server();
    long long17 = server16.getLastUpdate();
    tp2.ITime iTime18 = server16.getTime();
    tp2.IP iP19 = null;
    boolean b20 = server16.removeException(iP19);
    tp2.IP iP21 = null;
    boolean b22 = server16.removeBan(iP21);
    tp2.ITime iTime23 = server16.getTime();
    server0.setTime(iTime23);
    java.lang.String str25 = server0.toString();
    tp2.IP iP26 = null;
    boolean b27 = server0.removeBan(iP26);
    server0.update();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long11 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long17 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + "Server [lastUpdate=1465509024383, exceptions=(), bans={}]"+ "'", str25.equals("Server [lastUpdate=1465509024383, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);

  }

  @Test
  public void test67() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test67"); }


    tp2.Server server0 = new tp2.Server();
    tp2.IP iP1 = null;
    boolean b2 = server0.connect(iP1);
    java.lang.String str3 = server0.toString();
    tp2.Server server4 = new tp2.Server();
    tp2.ITime iTime5 = server4.getTime();
    server4.update();
    tp2.ITime iTime7 = server4.getTime();
    tp2.Server server8 = new tp2.Server();
    long long9 = server8.getLastUpdate();
    tp2.ITime iTime10 = server8.getTime();
    server4.setTime(iTime10);
    java.lang.String str12 = server4.toString();
    tp2.ITime iTime13 = server4.getTime();
    server0.setTime(iTime13);
    tp2.IP iP15 = null;
    boolean b16 = server0.connect(iP15);
    tp2.Server server17 = new tp2.Server();
    long long18 = server17.getLastUpdate();
    server17.update();
    tp2.IP iP20 = null;
    boolean b21 = server17.removeBan(iP20);
    tp2.IP iP22 = null;
    boolean b23 = server17.removeBan(iP22);
    tp2.IP iP24 = null;
    boolean b25 = server17.removeException(iP24);
    tp2.ITime iTime26 = server17.getTime();
    server0.setTime(iTime26);
    java.lang.String str28 = server0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Server [lastUpdate=0, exceptions=(), bans={}]"+ "'", str3.equals("Server [lastUpdate=0, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long9 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Server [lastUpdate=1465509024387, exceptions=(), bans={}]"+ "'", str12.equals("Server [lastUpdate=1465509024387, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long18 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str28 + "' != '" + "Server [lastUpdate=0, exceptions=(), bans={}]"+ "'", str28.equals("Server [lastUpdate=0, exceptions=(), bans={}]"));

  }

  @Test
  public void test68() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test68"); }


    tp2.Server server0 = new tp2.Server();
    java.lang.String str1 = server0.toString();
    tp2.Server server2 = new tp2.Server();
    long long3 = server2.getLastUpdate();
    server2.update();
    tp2.IP iP5 = null;
    boolean b6 = server2.removeException(iP5);
    server2.update();
    long long8 = server2.getLastUpdate();
    tp2.IP iP9 = null;
    boolean b10 = server2.removeBan(iP9);
    tp2.IP iP11 = null;
    boolean b12 = server2.removeBan(iP11);
    server2.update();
    tp2.ITime iTime14 = server2.getTime();
    server0.setTime(iTime14);
    java.lang.String str16 = server0.toString();
    java.lang.String str17 = server0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Server [lastUpdate=0, exceptions=(), bans={}]"+ "'", str1.equals("Server [lastUpdate=0, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long3 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long8 == 1465509024395L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "Server [lastUpdate=0, exceptions=(), bans={}]"+ "'", str16.equals("Server [lastUpdate=0, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "Server [lastUpdate=0, exceptions=(), bans={}]"+ "'", str17.equals("Server [lastUpdate=0, exceptions=(), bans={}]"));

  }

  @Test
  public void test69() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test69"); }


    tp2.Server server0 = new tp2.Server();
    tp2.ITime iTime1 = server0.getTime();
    tp2.IP iP2 = null;
    boolean b3 = server0.connect(iP2);
    tp2.IP iP4 = null;
    boolean b5 = server0.removeException(iP4);
    tp2.IP iP6 = null;
    boolean b7 = server0.removeException(iP6);
    tp2.IP iP8 = null;
    boolean b9 = server0.connect(iP8);
    java.lang.String str10 = server0.toString();
    java.lang.String str11 = server0.toString();
    tp2.Server server12 = new tp2.Server();
    tp2.ITime iTime13 = server12.getTime();
    tp2.IP iP14 = null;
    boolean b15 = server12.connect(iP14);
    tp2.IP iP16 = null;
    boolean b17 = server12.removeException(iP16);
    tp2.IP iP18 = null;
    boolean b19 = server12.removeException(iP18);
    tp2.IP iP20 = null;
    boolean b21 = server12.connect(iP20);
    tp2.Server server22 = new tp2.Server();
    long long23 = server22.getLastUpdate();
    server22.update();
    tp2.ITime iTime25 = server22.getTime();
    server12.setTime(iTime25);
    tp2.IP iP27 = null;
    boolean b28 = server12.removeBan(iP27);
    tp2.IP iP29 = null;
    boolean b30 = server12.removeException(iP29);
    tp2.ITime iTime31 = server12.getTime();
    server0.setTime(iTime31);
    tp2.IP iP33 = null;
    // The following exception was thrown during execution in test generation
    try {
      boolean b34 = server0.addException(iP33);
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
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Server [lastUpdate=0, exceptions=(), bans={}]"+ "'", str10.equals("Server [lastUpdate=0, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Server [lastUpdate=0, exceptions=(), bans={}]"+ "'", str11.equals("Server [lastUpdate=0, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long23 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime31);

  }

  @Test
  public void test70() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test70"); }


    tp2.Server server0 = new tp2.Server();
    long long1 = server0.getLastUpdate();
    long long2 = server0.getLastUpdate();
    java.lang.String str3 = server0.toString();
    tp2.Server server4 = new tp2.Server();
    tp2.ITime iTime5 = server4.getTime();
    server4.update();
    tp2.ITime iTime7 = server4.getTime();
    tp2.Server server8 = new tp2.Server();
    long long9 = server8.getLastUpdate();
    tp2.ITime iTime10 = server8.getTime();
    server4.setTime(iTime10);
    tp2.IP iP12 = null;
    boolean b13 = server4.connect(iP12);
    long long14 = server4.getLastUpdate();
    tp2.ITime iTime15 = server4.getTime();
    server0.setTime(iTime15);
    long long17 = server0.getLastUpdate();
    java.lang.String str18 = server0.toString();
    tp2.IP iP19 = null;
    boolean b20 = server0.removeBan(iP19);
    tp2.IP iP21 = null;
    boolean b22 = server0.removeException(iP21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long2 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Server [lastUpdate=0, exceptions=(), bans={}]"+ "'", str3.equals("Server [lastUpdate=0, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long9 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long14 == 1465509024423L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long17 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "Server [lastUpdate=0, exceptions=(), bans={}]"+ "'", str18.equals("Server [lastUpdate=0, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);

  }

  @Test
  public void test71() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test71"); }


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
    boolean b10 = server0.removeException(iP9);
    tp2.IP iP11 = null;
    boolean b12 = server0.connect(iP11);
    tp2.IP iP13 = null;
    boolean b14 = server0.removeBan(iP13);
    server0.update();
    java.lang.String str16 = server0.toString();
    long long17 = server0.getLastUpdate();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long5 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long8 == 1465509024429L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "Server [lastUpdate=1465509024429, exceptions=(), bans={}]"+ "'", str16.equals("Server [lastUpdate=1465509024429, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long17 == 1465509024429L);

  }

  @Test
  public void test72() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test72"); }


    tp2.Server server0 = new tp2.Server();
    long long1 = server0.getLastUpdate();
    java.lang.String str2 = server0.toString();
    tp2.IP iP3 = null;
    boolean b4 = server0.removeBan(iP3);
    tp2.IP iP5 = null;
    boolean b6 = server0.removeBan(iP5);
    tp2.ITime iTime7 = null;
    server0.setTime(iTime7);
    long long9 = server0.getLastUpdate();
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
    org.junit.Assert.assertTrue(long1 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Server [lastUpdate=0, exceptions=(), bans={}]"+ "'", str2.equals("Server [lastUpdate=0, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long9 == 0L);

  }

  @Test
  public void test73() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test73"); }


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
    boolean b13 = server0.connect(iP12);
    
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
    org.junit.Assert.assertTrue(b13 == true);

  }

  @Test
  public void test74() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test74"); }


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
    java.lang.String str11 = server0.toString();
    tp2.ITime iTime12 = null;
    server0.setTime(iTime12);
    tp2.IP iP14 = null;
    boolean b15 = server0.removeBan(iP14);
    
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
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Server [lastUpdate=0, exceptions=(), bans={}]"+ "'", str11.equals("Server [lastUpdate=0, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);

  }

  @Test
  public void test75() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test75"); }


    tp2.Server server0 = new tp2.Server();
    long long1 = server0.getLastUpdate();
    server0.update();
    tp2.IP iP3 = null;
    boolean b4 = server0.removeException(iP3);
    server0.update();
    server0.update();
    server0.update();
    tp2.Server server8 = new tp2.Server();
    long long9 = server8.getLastUpdate();
    java.lang.String str10 = server8.toString();
    tp2.IP iP11 = null;
    boolean b12 = server8.removeBan(iP11);
    tp2.Server server13 = new tp2.Server();
    tp2.ITime iTime14 = server13.getTime();
    server13.update();
    tp2.ITime iTime16 = server13.getTime();
    long long17 = server13.getLastUpdate();
    tp2.IP iP18 = null;
    boolean b19 = server13.removeBan(iP18);
    tp2.Server server20 = new tp2.Server();
    tp2.ITime iTime21 = server20.getTime();
    tp2.IP iP22 = null;
    boolean b23 = server20.removeException(iP22);
    tp2.IP iP24 = null;
    boolean b25 = server20.connect(iP24);
    tp2.Server server26 = new tp2.Server();
    long long27 = server26.getLastUpdate();
    tp2.ITime iTime28 = server26.getTime();
    server20.setTime(iTime28);
    server13.setTime(iTime28);
    server8.setTime(iTime28);
    server0.setTime(iTime28);
    java.lang.String str33 = server0.toString();
    tp2.IP iP34 = null;
    boolean b35 = server0.removeBan(iP34);
    tp2.IP iP36 = null;
    boolean b37 = server0.removeBan(iP36);
    server0.update();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long9 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Server [lastUpdate=0, exceptions=(), bans={}]"+ "'", str10.equals("Server [lastUpdate=0, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long17 == 1465509024438L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long27 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str33 + "' != '" + "Server [lastUpdate=1465509024437, exceptions=(), bans={}]"+ "'", str33.equals("Server [lastUpdate=1465509024437, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == false);

  }

  @Test
  public void test76() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test76"); }


    tp2.Server server0 = new tp2.Server();
    tp2.ITime iTime1 = server0.getTime();
    server0.update();
    tp2.ITime iTime3 = server0.getTime();
    tp2.IP iP4 = null;
    boolean b5 = server0.removeBan(iP4);
    server0.update();
    long long7 = server0.getLastUpdate();
    tp2.IP iP8 = null;
    boolean b9 = server0.connect(iP8);
    tp2.ITime iTime10 = server0.getTime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long7 == 1465509024447L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime10);

  }

  @Test
  public void test77() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test77"); }


    tp2.Server server0 = new tp2.Server();
    long long1 = server0.getLastUpdate();
    server0.update();
    tp2.IP iP3 = null;
    boolean b4 = server0.removeBan(iP3);
    tp2.Server server5 = new tp2.Server();
    tp2.ITime iTime6 = server5.getTime();
    server5.update();
    tp2.ITime iTime8 = server5.getTime();
    server0.setTime(iTime8);
    server0.update();
    tp2.IP iP11 = null;
    boolean b12 = server0.connect(iP11);
    tp2.ITime iTime13 = server0.getTime();
    tp2.IP iP14 = null;
    boolean b15 = server0.removeException(iP14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);

  }

  @Test
  public void test78() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test78"); }


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
    tp2.IP iP14 = null;
    boolean b15 = server0.connect(iP14);
    tp2.IP iP16 = null;
    boolean b17 = server0.connect(iP16);
    long long18 = server0.getLastUpdate();
    tp2.IP iP19 = null;
    boolean b20 = server0.removeBan(iP19);
    
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
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long18 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);

  }

  @Test
  public void test79() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test79"); }


    tp2.Server server0 = new tp2.Server();
    tp2.ITime iTime1 = server0.getTime();
    tp2.IP iP2 = null;
    boolean b3 = server0.connect(iP2);
    long long4 = server0.getLastUpdate();
    tp2.IP iP5 = null;
    boolean b6 = server0.removeException(iP5);
    java.lang.String str7 = server0.toString();
    long long8 = server0.getLastUpdate();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long4 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Server [lastUpdate=0, exceptions=(), bans={}]"+ "'", str7.equals("Server [lastUpdate=0, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long8 == 0L);

  }

  @Test
  public void test80() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test80"); }


    tp2.Server server0 = new tp2.Server();
    tp2.ITime iTime1 = server0.getTime();
    server0.update();
    tp2.ITime iTime3 = server0.getTime();
    tp2.Server server4 = new tp2.Server();
    long long5 = server4.getLastUpdate();
    tp2.ITime iTime6 = server4.getTime();
    server0.setTime(iTime6);
    tp2.IP iP8 = null;
    boolean b9 = server0.connect(iP8);
    long long10 = server0.getLastUpdate();
    java.lang.String str11 = server0.toString();
    tp2.ITime iTime12 = server0.getTime();
    java.lang.String str13 = server0.toString();
    tp2.IP iP14 = null;
    boolean b15 = server0.removeException(iP14);
    tp2.IP iP16 = null;
    boolean b17 = server0.removeException(iP16);
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
    org.junit.Assert.assertNotNull(iTime1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long5 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long10 == 1465509024471L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Server [lastUpdate=1465509024471, exceptions=(), bans={}]"+ "'", str11.equals("Server [lastUpdate=1465509024471, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Server [lastUpdate=1465509024471, exceptions=(), bans={}]"+ "'", str13.equals("Server [lastUpdate=1465509024471, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);

  }

  @Test
  public void test81() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test81"); }


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
    boolean b10 = server0.removeException(iP9);
    tp2.IP iP11 = null;
    boolean b12 = server0.removeBan(iP11);
    tp2.IP iP13 = null;
    boolean b14 = server0.removeException(iP13);
    long long15 = server0.getLastUpdate();
    tp2.Server server16 = new tp2.Server();
    tp2.ITime iTime17 = server16.getTime();
    server16.update();
    tp2.ITime iTime19 = server16.getTime();
    tp2.IP iP20 = null;
    boolean b21 = server16.connect(iP20);
    java.lang.String str22 = server16.toString();
    tp2.IP iP23 = null;
    boolean b24 = server16.removeException(iP23);
    tp2.Server server25 = new tp2.Server();
    tp2.ITime iTime26 = server25.getTime();
    server25.update();
    tp2.ITime iTime28 = server25.getTime();
    tp2.Server server29 = new tp2.Server();
    long long30 = server29.getLastUpdate();
    tp2.ITime iTime31 = server29.getTime();
    server25.setTime(iTime31);
    tp2.ITime iTime33 = server25.getTime();
    java.lang.String str34 = server25.toString();
    tp2.IP iP35 = null;
    boolean b36 = server25.removeBan(iP35);
    tp2.Server server37 = new tp2.Server();
    tp2.IP iP38 = null;
    boolean b39 = server37.connect(iP38);
    java.lang.String str40 = server37.toString();
    tp2.ITime iTime41 = server37.getTime();
    server25.setTime(iTime41);
    server16.setTime(iTime41);
    server0.setTime(iTime41);
    tp2.IP iP45 = null;
    boolean b46 = server0.removeBan(iP45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long5 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long8 == 1465509024473L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long15 == 1465509024473L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + "Server [lastUpdate=1465509024474, exceptions=(), bans={}]"+ "'", str22.equals("Server [lastUpdate=1465509024474, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long30 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str34 + "' != '" + "Server [lastUpdate=1465509024475, exceptions=(), bans={}]"+ "'", str34.equals("Server [lastUpdate=1465509024475, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str40 + "' != '" + "Server [lastUpdate=0, exceptions=(), bans={}]"+ "'", str40.equals("Server [lastUpdate=0, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b46 == false);

  }

  @Test
  public void test82() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test82"); }


    tp2.Server server0 = new tp2.Server();
    tp2.ITime iTime1 = server0.getTime();
    tp2.IP iP2 = null;
    boolean b3 = server0.removeException(iP2);
    tp2.IP iP4 = null;
    boolean b5 = server0.connect(iP4);
    tp2.IP iP6 = null;
    boolean b7 = server0.removeException(iP6);
    java.lang.String str8 = server0.toString();
    server0.update();
    tp2.IP iP10 = null;
    boolean b11 = server0.removeException(iP10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Server [lastUpdate=0, exceptions=(), bans={}]"+ "'", str8.equals("Server [lastUpdate=0, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);

  }

  @Test
  public void test83() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test83"); }


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
    tp2.ITime iTime10 = server0.getTime();
    tp2.IP iP11 = null;
    boolean b12 = server0.removeBan(iP11);
    tp2.ITime iTime13 = server0.getTime();
    tp2.Server server14 = new tp2.Server();
    tp2.ITime iTime15 = server14.getTime();
    server14.update();
    tp2.ITime iTime17 = server14.getTime();
    tp2.IP iP18 = null;
    boolean b19 = server14.removeBan(iP18);
    server14.update();
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
    boolean b32 = server21.connect(iP31);
    tp2.IP iP33 = null;
    boolean b34 = server21.removeBan(iP33);
    tp2.Server server35 = new tp2.Server();
    long long36 = server35.getLastUpdate();
    long long37 = server35.getLastUpdate();
    tp2.ITime iTime38 = server35.getTime();
    server21.setTime(iTime38);
    server14.setTime(iTime38);
    long long41 = server14.getLastUpdate();
    tp2.ITime iTime42 = server14.getTime();
    server0.setTime(iTime42);
    tp2.IP iP44 = null;
    boolean b45 = server0.removeException(iP44);
    
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
    org.junit.Assert.assertNotNull(iTime10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
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
    org.junit.Assert.assertTrue(b32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long36 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long37 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long41 == 1465509024494L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == false);

  }

  @Test
  public void test84() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test84"); }


    tp2.Server server0 = new tp2.Server();
    tp2.ITime iTime1 = server0.getTime();
    tp2.IP iP2 = null;
    boolean b3 = server0.connect(iP2);
    tp2.IP iP4 = null;
    boolean b5 = server0.removeException(iP4);
    long long6 = server0.getLastUpdate();
    tp2.IP iP7 = null;
    boolean b8 = server0.removeBan(iP7);
    tp2.Server server9 = new tp2.Server();
    long long10 = server9.getLastUpdate();
    tp2.IP iP11 = null;
    boolean b12 = server9.removeException(iP11);
    tp2.Server server13 = new tp2.Server();
    tp2.ITime iTime14 = server13.getTime();
    server13.update();
    tp2.ITime iTime16 = server13.getTime();
    tp2.Server server17 = new tp2.Server();
    long long18 = server17.getLastUpdate();
    tp2.ITime iTime19 = server17.getTime();
    server13.setTime(iTime19);
    tp2.ITime iTime21 = server13.getTime();
    server9.setTime(iTime21);
    server0.setTime(iTime21);
    java.lang.String str24 = server0.toString();
    tp2.Server server25 = new tp2.Server();
    long long26 = server25.getLastUpdate();
    tp2.ITime iTime27 = server25.getTime();
    tp2.IP iP28 = null;
    boolean b29 = server25.removeBan(iP28);
    tp2.ITime iTime30 = server25.getTime();
    server0.setTime(iTime30);
    tp2.Server server32 = new tp2.Server();
    long long33 = server32.getLastUpdate();
    java.lang.String str34 = server32.toString();
    tp2.IP iP35 = null;
    boolean b36 = server32.removeBan(iP35);
    tp2.IP iP37 = null;
    boolean b38 = server32.removeBan(iP37);
    long long39 = server32.getLastUpdate();
    tp2.ITime iTime40 = server32.getTime();
    tp2.IP iP41 = null;
    boolean b42 = server32.removeBan(iP41);
    tp2.IP iP43 = null;
    boolean b44 = server32.removeException(iP43);
    tp2.ITime iTime45 = server32.getTime();
    server0.setTime(iTime45);
    long long47 = server0.getLastUpdate();
    tp2.IP iP48 = null;
    // The following exception was thrown during execution in test generation
    try {
      boolean b49 = server0.addException(iP48);
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
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long10 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long18 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + "Server [lastUpdate=0, exceptions=(), bans={}]"+ "'", str24.equals("Server [lastUpdate=0, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long26 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long33 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str34 + "' != '" + "Server [lastUpdate=0, exceptions=(), bans={}]"+ "'", str34.equals("Server [lastUpdate=0, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long39 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long47 == 0L);

  }

  @Test
  public void test85() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test85"); }


    tp2.Server server0 = new tp2.Server();
    tp2.ITime iTime1 = server0.getTime();
    server0.update();
    tp2.ITime iTime3 = server0.getTime();
    tp2.Server server4 = new tp2.Server();
    long long5 = server4.getLastUpdate();
    tp2.ITime iTime6 = server4.getTime();
    server0.setTime(iTime6);
    tp2.IP iP8 = null;
    boolean b9 = server0.connect(iP8);
    long long10 = server0.getLastUpdate();
    java.lang.String str11 = server0.toString();
    tp2.Server server12 = new tp2.Server();
    long long13 = server12.getLastUpdate();
    java.lang.String str14 = server12.toString();
    tp2.IP iP15 = null;
    boolean b16 = server12.removeBan(iP15);
    tp2.Server server17 = new tp2.Server();
    tp2.ITime iTime18 = server17.getTime();
    server17.update();
    tp2.ITime iTime20 = server17.getTime();
    long long21 = server17.getLastUpdate();
    tp2.IP iP22 = null;
    boolean b23 = server17.removeBan(iP22);
    tp2.Server server24 = new tp2.Server();
    tp2.ITime iTime25 = server24.getTime();
    tp2.IP iP26 = null;
    boolean b27 = server24.removeException(iP26);
    tp2.IP iP28 = null;
    boolean b29 = server24.connect(iP28);
    tp2.Server server30 = new tp2.Server();
    long long31 = server30.getLastUpdate();
    tp2.ITime iTime32 = server30.getTime();
    server24.setTime(iTime32);
    server17.setTime(iTime32);
    server12.setTime(iTime32);
    server0.setTime(iTime32);
    server0.update();
    long long38 = server0.getLastUpdate();
    tp2.ITime iTime39 = server0.getTime();
    long long40 = server0.getLastUpdate();
    tp2.Server server41 = new tp2.Server();
    tp2.ITime iTime42 = server41.getTime();
    server41.update();
    tp2.ITime iTime44 = server41.getTime();
    tp2.IP iP45 = null;
    boolean b46 = server41.removeBan(iP45);
    java.lang.String str47 = server41.toString();
    java.lang.String str48 = server41.toString();
    tp2.ITime iTime49 = server41.getTime();
    tp2.ITime iTime50 = server41.getTime();
    long long51 = server41.getLastUpdate();
    java.lang.String str52 = server41.toString();
    tp2.ITime iTime53 = server41.getTime();
    server0.setTime(iTime53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long5 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long10 == 1465509024510L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Server [lastUpdate=1465509024510, exceptions=(), bans={}]"+ "'", str11.equals("Server [lastUpdate=1465509024510, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long13 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "Server [lastUpdate=0, exceptions=(), bans={}]"+ "'", str14.equals("Server [lastUpdate=0, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long21 == 1465509024511L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long31 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long38 == 1465509024512L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long40 == 1465509024512L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b46 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str47 + "' != '" + "Server [lastUpdate=1465509024512, exceptions=(), bans={}]"+ "'", str47.equals("Server [lastUpdate=1465509024512, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str48 + "' != '" + "Server [lastUpdate=1465509024512, exceptions=(), bans={}]"+ "'", str48.equals("Server [lastUpdate=1465509024512, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long51 == 1465509024512L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str52 + "' != '" + "Server [lastUpdate=1465509024512, exceptions=(), bans={}]"+ "'", str52.equals("Server [lastUpdate=1465509024512, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime53);

  }

  @Test
  public void test86() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test86"); }


    tp2.Server server0 = new tp2.Server();
    tp2.ITime iTime1 = server0.getTime();
    server0.update();
    tp2.ITime iTime3 = server0.getTime();
    long long4 = server0.getLastUpdate();
    long long5 = server0.getLastUpdate();
    tp2.IP iP6 = null;
    boolean b7 = server0.removeException(iP6);
    long long8 = server0.getLastUpdate();
    tp2.Server server9 = new tp2.Server();
    tp2.ITime iTime10 = server9.getTime();
    server9.update();
    tp2.ITime iTime12 = server9.getTime();
    long long13 = server9.getLastUpdate();
    tp2.IP iP14 = null;
    boolean b15 = server9.removeBan(iP14);
    tp2.Server server16 = new tp2.Server();
    tp2.ITime iTime17 = server16.getTime();
    tp2.IP iP18 = null;
    boolean b19 = server16.removeException(iP18);
    tp2.IP iP20 = null;
    boolean b21 = server16.connect(iP20);
    tp2.Server server22 = new tp2.Server();
    long long23 = server22.getLastUpdate();
    tp2.ITime iTime24 = server22.getTime();
    server16.setTime(iTime24);
    server9.setTime(iTime24);
    tp2.IP iP27 = null;
    boolean b28 = server9.removeException(iP27);
    java.lang.String str29 = server9.toString();
    server9.update();
    tp2.IP iP31 = null;
    boolean b32 = server9.removeBan(iP31);
    tp2.ITime iTime33 = server9.getTime();
    server0.setTime(iTime33);
    tp2.IP iP35 = null;
    boolean b36 = server0.connect(iP35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long4 == 1465509024546L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long5 == 1465509024546L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long8 == 1465509024546L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long13 == 1465509024546L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long23 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str29 + "' != '" + "Server [lastUpdate=1465509024546, exceptions=(), bans={}]"+ "'", str29.equals("Server [lastUpdate=1465509024546, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == true);

  }

  @Test
  public void test87() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test87"); }


    tp2.Server server0 = new tp2.Server();
    tp2.ITime iTime1 = server0.getTime();
    server0.update();
    tp2.IP iP3 = null;
    boolean b4 = server0.connect(iP3);
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
    boolean b16 = server5.connect(iP15);
    tp2.Server server17 = new tp2.Server();
    tp2.ITime iTime18 = server17.getTime();
    server17.update();
    tp2.ITime iTime20 = server17.getTime();
    server5.setTime(iTime20);
    server0.setTime(iTime20);
    tp2.IP iP23 = null;
    boolean b24 = server0.removeException(iP23);
    tp2.IP iP25 = null;
    boolean b26 = server0.removeBan(iP25);
    server0.update();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
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
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);

  }

  @Test
  public void test88() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test88"); }


    tp2.Server server0 = new tp2.Server();
    tp2.ITime iTime1 = server0.getTime();
    tp2.IP iP2 = null;
    boolean b3 = server0.connect(iP2);
    tp2.IP iP4 = null;
    boolean b5 = server0.removeException(iP4);
    long long6 = server0.getLastUpdate();
    tp2.IP iP7 = null;
    boolean b8 = server0.removeBan(iP7);
    tp2.Server server9 = new tp2.Server();
    long long10 = server9.getLastUpdate();
    tp2.IP iP11 = null;
    boolean b12 = server9.removeException(iP11);
    tp2.Server server13 = new tp2.Server();
    tp2.ITime iTime14 = server13.getTime();
    server13.update();
    tp2.ITime iTime16 = server13.getTime();
    tp2.Server server17 = new tp2.Server();
    long long18 = server17.getLastUpdate();
    tp2.ITime iTime19 = server17.getTime();
    server13.setTime(iTime19);
    tp2.ITime iTime21 = server13.getTime();
    server9.setTime(iTime21);
    server0.setTime(iTime21);
    java.lang.String str24 = server0.toString();
    tp2.ITime iTime25 = server0.getTime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long6 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long10 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long18 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + "Server [lastUpdate=0, exceptions=(), bans={}]"+ "'", str24.equals("Server [lastUpdate=0, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime25);

  }

  @Test
  public void test89() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test89"); }


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
    boolean b10 = server0.removeException(iP9);
    tp2.IP iP11 = null;
    boolean b12 = server0.connect(iP11);
    tp2.IP iP13 = null;
    boolean b14 = server0.removeBan(iP13);
    tp2.Server server15 = new tp2.Server();
    long long16 = server15.getLastUpdate();
    server15.update();
    tp2.IP iP18 = null;
    boolean b19 = server15.removeException(iP18);
    server15.update();
    long long21 = server15.getLastUpdate();
    server15.update();
    tp2.ITime iTime23 = server15.getTime();
    tp2.ITime iTime24 = server15.getTime();
    server0.setTime(iTime24);
    long long26 = server0.getLastUpdate();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long5 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long8 == 1465509024579L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long16 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long21 == 1465509024580L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long26 == 1465509024579L);

  }

  @Test
  public void test90() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test90"); }


    tp2.Server server0 = new tp2.Server();
    tp2.ITime iTime1 = server0.getTime();
    server0.update();
    tp2.IP iP3 = null;
    boolean b4 = server0.connect(iP3);
    long long5 = server0.getLastUpdate();
    tp2.ITime iTime6 = server0.getTime();
    long long7 = server0.getLastUpdate();
    java.lang.String str8 = server0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long5 == 1465509024589L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long7 == 1465509024589L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Server [lastUpdate=1465509024589, exceptions=(), bans={}]"+ "'", str8.equals("Server [lastUpdate=1465509024589, exceptions=(), bans={}]"));

  }

  @Test
  public void test91() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test91"); }


    tp2.Server server0 = new tp2.Server();
    tp2.ITime iTime1 = server0.getTime();
    server0.update();
    tp2.ITime iTime3 = server0.getTime();
    tp2.Server server4 = new tp2.Server();
    long long5 = server4.getLastUpdate();
    tp2.ITime iTime6 = server4.getTime();
    server0.setTime(iTime6);
    tp2.IP iP8 = null;
    boolean b9 = server0.connect(iP8);
    long long10 = server0.getLastUpdate();
    java.lang.String str11 = server0.toString();
    tp2.Server server12 = new tp2.Server();
    long long13 = server12.getLastUpdate();
    java.lang.String str14 = server12.toString();
    tp2.IP iP15 = null;
    boolean b16 = server12.removeBan(iP15);
    tp2.Server server17 = new tp2.Server();
    tp2.ITime iTime18 = server17.getTime();
    server17.update();
    tp2.ITime iTime20 = server17.getTime();
    long long21 = server17.getLastUpdate();
    tp2.IP iP22 = null;
    boolean b23 = server17.removeBan(iP22);
    tp2.Server server24 = new tp2.Server();
    tp2.ITime iTime25 = server24.getTime();
    tp2.IP iP26 = null;
    boolean b27 = server24.removeException(iP26);
    tp2.IP iP28 = null;
    boolean b29 = server24.connect(iP28);
    tp2.Server server30 = new tp2.Server();
    long long31 = server30.getLastUpdate();
    tp2.ITime iTime32 = server30.getTime();
    server24.setTime(iTime32);
    server17.setTime(iTime32);
    server12.setTime(iTime32);
    server0.setTime(iTime32);
    tp2.ITime iTime37 = server0.getTime();
    server0.update();
    java.lang.String str39 = server0.toString();
    java.lang.String str40 = server0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long5 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long10 == 1465509024590L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Server [lastUpdate=1465509024590, exceptions=(), bans={}]"+ "'", str11.equals("Server [lastUpdate=1465509024590, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long13 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "Server [lastUpdate=0, exceptions=(), bans={}]"+ "'", str14.equals("Server [lastUpdate=0, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long21 == 1465509024592L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long31 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iTime37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str39 + "' != '" + "Server [lastUpdate=1465509024593, exceptions=(), bans={}]"+ "'", str39.equals("Server [lastUpdate=1465509024593, exceptions=(), bans={}]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str40 + "' != '" + "Server [lastUpdate=1465509024593, exceptions=(), bans={}]"+ "'", str40.equals("Server [lastUpdate=1465509024593, exceptions=(), bans={}]"));

  }

}
