package randoopTestsServer1;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest9 {

  public static boolean debug = false;

  @Test
  public void test001() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test001"); }


    java.lang.Integer i1 = new java.lang.Integer(536870926);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 536870926+ "'", i1.equals(536870926));

  }

  @Test
  public void test002() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test002"); }


    int i2 = java.lang.Integer.sum(1073741825, 1041498176);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 2115240001);

  }

  @Test
  public void test003() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test003"); }


    tp2.IP iP0 = null;
    tp2.IPBan iPBan2 = new tp2.IPBan(iP0, (java.lang.Long)10L);
    java.lang.Long long3 = iPBan2.getExpires();
    tp2.IP iP8 = new tp2.IP((java.lang.Integer)31, (java.lang.Integer)31, (java.lang.Integer)31, (java.lang.Integer)0);
    iPBan2.ip = iP8;
    java.lang.Long long10 = iPBan2.getExpires();
    tp2.Server server11 = new tp2.Server();
    tp2.IP iP12 = null;
    boolean b13 = server11.connect(iP12);
    tp2.IP iP18 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)83, (java.lang.Integer)26, (java.lang.Integer)100);
    boolean b19 = server11.addBan(iP18);
    iPBan2.ip = iP18;
    iPBan2.expires = 2031686L;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L+ "'", long3.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long10 + "' != '" + 10L+ "'", long10.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);

  }

  @Test
  public void test004() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test004"); }


    tp2.IP iP0 = null;
    tp2.IPBan iPBan2 = new tp2.IPBan(iP0, (java.lang.Long)10L);
    tp2.IP iP3 = iPBan2.getIp();
    iPBan2.expires = 0L;
    tp2.IP iP6 = iPBan2.ip;
    tp2.IP iP7 = iPBan2.getIp();
    java.lang.Long long8 = iPBan2.expires;
    tp2.IP iP9 = iPBan2.getIp();
    java.lang.Long long10 = iPBan2.expires;
    tp2.IP iP11 = iPBan2.ip;
    java.lang.Long long12 = iPBan2.expires;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L+ "'", long8.equals(0L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L+ "'", long10.equals(0L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L+ "'", long12.equals(0L));

  }

  @Test
  public void test005() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test005"); }


    java.lang.String str1 = java.lang.Integer.toHexString(603980416);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "24000280"+ "'", str1.equals("24000280"));

  }

  @Test
  public void test006() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test006"); }


    int i1 = java.lang.Integer.bitCount(1073741825);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 2);

  }

  @Test
  public void test007() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test007"); }


    int i2 = java.lang.Integer.rotateRight(26, 67109120);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 26);

  }

  @Test
  public void test008() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test008"); }


    int i2 = java.lang.Integer.compareUnsigned(1550375680, 822083745);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);

  }

  @Test
  public void test009() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test009"); }


    int i2 = java.lang.Integer.compareUnsigned((-134217728), 1325400064);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);

  }

  @Test
  public void test010() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test010"); }


    int i2 = java.lang.Integer.min((-1878982656), 4096);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == (-1878982656));

  }

  @Test
  public void test011() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test011"); }


    java.lang.String str1 = java.lang.Integer.toBinaryString(33600000);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "10000000001011001000000000"+ "'", str1.equals("10000000001011001000000000"));

  }

  @Test
  public void test012() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test012"); }


    int i1 = java.lang.Integer.lowestOneBit(1366875125);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 1);

  }

  @Test
  public void test013() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test013"); }


    tp2.IP iP4 = new tp2.IP((java.lang.Integer)(-717028736), (java.lang.Integer)2147480291, (java.lang.Integer)11001, (java.lang.Integer)1677721600);

  }

  @Test
  public void test014() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test014"); }


    tp2.IP iP0 = null;
    tp2.IPBan iPBan2 = new tp2.IPBan(iP0, (java.lang.Long)10L);
    java.lang.Long long3 = iPBan2.getExpires();
    tp2.IP iP8 = new tp2.IP((java.lang.Integer)31, (java.lang.Integer)31, (java.lang.Integer)31, (java.lang.Integer)0);
    iPBan2.ip = iP8;
    java.lang.Long long10 = iPBan2.getExpires();
    tp2.Server server11 = new tp2.Server();
    tp2.IP iP12 = null;
    boolean b13 = server11.connect(iP12);
    tp2.IP iP18 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)83, (java.lang.Integer)26, (java.lang.Integer)100);
    boolean b19 = server11.addBan(iP18);
    iPBan2.ip = iP18;
    iP18.setThird((java.lang.Integer)60408026);
    java.lang.Integer i23 = iP18.getFourth();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L+ "'", long3.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long10 + "' != '" + 10L+ "'", long10.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i23 + "' != '" + 100+ "'", i23.equals(100));

  }

  @Test
  public void test015() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test015"); }


    int i2 = java.lang.Integer.compareUnsigned(10010000, 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);

  }

  @Test
  public void test016() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test016"); }


    int i2 = java.lang.Integer.rotateRight(10, 2013262563);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1073741825);

  }

  @Test
  public void test017() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test017"); }


    tp2.IP iP0 = null;
    tp2.IPBan iPBan2 = new tp2.IPBan(iP0, (java.lang.Long)10L);
    tp2.IP iP3 = iPBan2.ip;
    iPBan2.setExpires((java.lang.Long)28L);
    tp2.IP iP6 = iPBan2.getIp();
    java.lang.Long long7 = iPBan2.expires;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long7 + "' != '" + 28L+ "'", long7.equals(28L));

  }

  @Test
  public void test018() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test018"); }


    tp2.Server server0 = new tp2.Server();
    tp2.IP iP1 = null;
    boolean b2 = server0.addBan(iP1);
    tp2.IP iP7 = new tp2.IP((java.lang.Integer)31, (java.lang.Integer)31, (java.lang.Integer)31, (java.lang.Integer)0);
    iP7.setSecond((java.lang.Integer)2147483647);
    boolean b10 = server0.addBan(iP7);
    tp2.IP iP15 = new tp2.IP((java.lang.Integer)133, (java.lang.Integer)(-2147483515), (java.lang.Integer)79, (java.lang.Integer)(-2147483620));
    boolean b16 = server0.removeBan(iP15);
    tp2.Server server17 = new tp2.Server();
    tp2.IP iP18 = null;
    boolean b19 = server17.addBan(iP18);
    tp2.ITime iTime20 = null;
    server17.setTime(iTime20);
    tp2.Server server22 = new tp2.Server();
    tp2.IP iP23 = null;
    boolean b24 = server22.addBan(iP23);
    server22.update();
    tp2.IP iP26 = null;
    tp2.IPBan iPBan28 = new tp2.IPBan(iP26, (java.lang.Long)10L);
    tp2.IP iP29 = iPBan28.getIp();
    java.lang.Long long30 = iPBan28.expires;
    tp2.IP iP31 = null;
    iPBan28.ip = iP31;
    tp2.Server server33 = new tp2.Server();
    tp2.IP iP38 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b39 = server33.removeException(iP38);
    java.lang.Integer i40 = iP38.getFirst();
    iPBan28.setIp(iP38);
    java.lang.Integer i42 = iP38.getFirst();
    java.lang.Integer i43 = iP38.getFirst();
    boolean b44 = server22.addBan(iP38);
    boolean b45 = server17.addException(iP38);
    tp2.ITime iTime46 = null;
    server17.setTime(iTime46);
    tp2.Server server48 = new tp2.Server();
    tp2.IP iP49 = null;
    boolean b50 = server48.addBan(iP49);
    tp2.ITime iTime51 = null;
    server48.setTime(iTime51);
    tp2.IP iP53 = null;
    tp2.IPBan iPBan55 = new tp2.IPBan(iP53, (java.lang.Long)10L);
    tp2.IP iP56 = iPBan55.getIp();
    java.lang.Long long57 = iPBan55.expires;
    tp2.IP iP58 = null;
    iPBan55.ip = iP58;
    tp2.Server server60 = new tp2.Server();
    tp2.IP iP65 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b66 = server60.removeException(iP65);
    java.lang.Integer i67 = iP65.getFirst();
    iPBan55.setIp(iP65);
    iP65.setFourth((java.lang.Integer)(-2147483620));
    boolean b71 = server48.removeBan(iP65);
    java.lang.Integer i72 = iP65.getSecond();
    boolean b73 = server17.removeBan(iP65);
    iP65.setSecond((java.lang.Integer)524288);
    tp2.IP iP76 = null;
    tp2.IPBan iPBan78 = new tp2.IPBan(iP76, (java.lang.Long)10L);
    tp2.IP iP79 = iPBan78.getIp();
    java.lang.Long long80 = iPBan78.expires;
    tp2.IP iP81 = null;
    iPBan78.ip = iP81;
    tp2.Server server83 = new tp2.Server();
    tp2.IP iP88 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b89 = server83.removeException(iP88);
    java.lang.Integer i90 = iP88.getFirst();
    iPBan78.setIp(iP88);
    iP88.setFourth((java.lang.Integer)(-2147483620));
    tp2.IPBan iPBan95 = new tp2.IPBan(iP88, (java.lang.Long)(-1L));
    boolean b96 = iP65.equals((java.lang.Object)(-1L));
    iP65.setFirst((java.lang.Integer)1677721600);
    boolean b99 = server0.removeException(iP65);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long30 + "' != '" + 10L+ "'", long30.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i40 + "' != '" + 161+ "'", i40.equals(161));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i42 + "' != '" + 161+ "'", i42.equals(161));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i43 + "' != '" + 161+ "'", i43.equals(161));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b50 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long57 + "' != '" + 10L+ "'", long57.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b66 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i67 + "' != '" + 161+ "'", i67.equals(161));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b71 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i72 + "' != '" + (-2147483648)+ "'", i72.equals((-2147483648)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b73 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP79);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long80 + "' != '" + 10L+ "'", long80.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b89 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i90 + "' != '" + 161+ "'", i90.equals(161));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b96 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b99 == false);

  }

  @Test
  public void test019() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test019"); }


    tp2.IP iP4 = new tp2.IP((java.lang.Integer)2000204102, (java.lang.Integer)160, (java.lang.Integer)44, (java.lang.Integer)1639744);

  }

  @Test
  public void test020() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test020"); }


    tp2.Server server0 = new tp2.Server();
    tp2.IP iP1 = null;
    boolean b2 = server0.addBan(iP1);
    server0.update();
    tp2.IP iP8 = new tp2.IP((java.lang.Integer)31, (java.lang.Integer)31, (java.lang.Integer)31, (java.lang.Integer)0);
    boolean b9 = server0.removeBan(iP8);
    iP8.setSecond((java.lang.Integer)2114);
    tp2.IPBan iPBan13 = new tp2.IPBan(iP8, (java.lang.Long)3L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);

  }

  @Test
  public void test021() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test021"); }


    java.lang.String str2 = java.lang.Integer.toUnsignedString(44, (-536281088));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "44"+ "'", str2.equals("44"));

  }

  @Test
  public void test022() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test022"); }


    java.lang.String str1 = java.lang.Integer.toOctalString((-2063597568));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "20500000000"+ "'", str1.equals("20500000000"));

  }

  @Test
  public void test023() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test023"); }


    int i1 = java.lang.Integer.lowestOneBit(62563);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 1);

  }

  @Test
  public void test024() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test024"); }


    tp2.IP iP4 = new tp2.IP((java.lang.Integer)66664134, (java.lang.Integer)(-268435323), (java.lang.Integer)1600000, (java.lang.Integer)503);

  }

  @Test
  public void test025() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test025"); }


    tp2.Server server0 = new tp2.Server();
    tp2.IP iP1 = null;
    boolean b2 = server0.connect(iP1);
    tp2.Server server3 = new tp2.Server();
    tp2.Server server4 = new tp2.Server();
    tp2.IP iP5 = null;
    boolean b6 = server4.addBan(iP5);
    tp2.IP iP11 = new tp2.IP((java.lang.Integer)31, (java.lang.Integer)31, (java.lang.Integer)31, (java.lang.Integer)0);
    iP11.setSecond((java.lang.Integer)2147483647);
    boolean b14 = server4.addBan(iP11);
    tp2.Server server15 = new tp2.Server();
    tp2.IP iP16 = null;
    boolean b17 = server15.addBan(iP16);
    tp2.ITime iTime18 = null;
    server15.setTime(iTime18);
    tp2.IP iP20 = null;
    tp2.IPBan iPBan22 = new tp2.IPBan(iP20, (java.lang.Long)10L);
    tp2.IP iP23 = iPBan22.getIp();
    java.lang.Long long24 = iPBan22.expires;
    tp2.IP iP25 = null;
    iPBan22.ip = iP25;
    tp2.Server server27 = new tp2.Server();
    tp2.IP iP32 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b33 = server27.removeException(iP32);
    java.lang.Integer i34 = iP32.getFirst();
    iPBan22.setIp(iP32);
    boolean b36 = server15.connect(iP32);
    boolean b37 = server4.removeBan(iP32);
    boolean b38 = server3.addBan(iP32);
    iP32.setFourth((java.lang.Integer)1476395008);
    boolean b41 = server0.removeBan(iP32);
    tp2.Server server42 = new tp2.Server();
    tp2.IP iP43 = null;
    boolean b44 = server42.addBan(iP43);
    tp2.ITime iTime45 = null;
    server42.setTime(iTime45);
    tp2.IP iP47 = null;
    tp2.IPBan iPBan49 = new tp2.IPBan(iP47, (java.lang.Long)10L);
    tp2.IP iP50 = iPBan49.getIp();
    java.lang.Long long51 = iPBan49.expires;
    tp2.IP iP52 = null;
    iPBan49.ip = iP52;
    tp2.Server server54 = new tp2.Server();
    tp2.IP iP59 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b60 = server54.removeException(iP59);
    java.lang.Integer i61 = iP59.getFirst();
    iPBan49.setIp(iP59);
    iP59.setFourth((java.lang.Integer)(-2147483620));
    boolean b65 = server42.removeBan(iP59);
    iP59.setFirst((java.lang.Integer)83);
    java.lang.Integer i68 = iP59.getFourth();
    java.lang.Integer i69 = null;
    iP59.setSecond(i69);
    // The following exception was thrown during execution in test generation
    try {
      boolean b71 = server0.addException(iP59);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long24 + "' != '" + 10L+ "'", long24.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i34 + "' != '" + 161+ "'", i34.equals(161));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long51 + "' != '" + 10L+ "'", long51.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b60 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i61 + "' != '" + 161+ "'", i61.equals(161));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b65 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i68 + "' != '" + (-2147483620)+ "'", i68.equals((-2147483620)));

  }

  @Test
  public void test026() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test026"); }


    int i2 = java.lang.Integer.min(74285056, 638386176);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 74285056);

  }

  @Test
  public void test027() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test027"); }


    tp2.IP iP4 = new tp2.IP((java.lang.Integer)2147483647, (java.lang.Integer)(-1), (java.lang.Integer)56, (java.lang.Integer)458752);
    tp2.IPBan iPBan6 = new tp2.IPBan(iP4, (java.lang.Long)2147483676L);
    java.lang.Long long7 = iPBan6.getExpires();
    tp2.IP iP12 = new tp2.IP((java.lang.Integer)2048, (java.lang.Integer)(-1593835520), (java.lang.Integer)3, (java.lang.Integer)26);
    iPBan6.setIp(iP12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long7 + "' != '" + 2147483676L+ "'", long7.equals(2147483676L));

  }

  @Test
  public void test028() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test028"); }


    tp2.Server server0 = new tp2.Server();
    tp2.IP iP5 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b6 = server0.removeException(iP5);
    server0.update();
    tp2.Server server8 = new tp2.Server();
    tp2.IP iP9 = null;
    boolean b10 = server8.addBan(iP9);
    tp2.Server server11 = new tp2.Server();
    tp2.IP iP16 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b17 = server11.removeException(iP16);
    boolean b19 = iP16.equals((java.lang.Object)(-1L));
    boolean b20 = server8.removeBan(iP16);
    tp2.IP iP25 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    iP25.setFirst((java.lang.Integer)161);
    iP25.setThird((java.lang.Integer)3);
    iP25.setFirst((java.lang.Integer)26);
    boolean b32 = server8.connect(iP25);
    iP25.setSecond((java.lang.Integer)1677721761);
    boolean b35 = server0.removeBan(iP25);
    tp2.Server server36 = new tp2.Server();
    tp2.IP iP37 = null;
    boolean b38 = server36.addBan(iP37);
    tp2.ITime iTime39 = null;
    server36.setTime(iTime39);
    tp2.IP iP41 = null;
    tp2.IPBan iPBan43 = new tp2.IPBan(iP41, (java.lang.Long)10L);
    tp2.IP iP44 = iPBan43.getIp();
    java.lang.Long long45 = iPBan43.expires;
    tp2.IP iP46 = null;
    iPBan43.ip = iP46;
    tp2.Server server48 = new tp2.Server();
    tp2.IP iP53 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b54 = server48.removeException(iP53);
    java.lang.Integer i55 = iP53.getFirst();
    iPBan43.setIp(iP53);
    boolean b57 = server36.connect(iP53);
    iP53.setFourth((java.lang.Integer)(-1));
    iP53.setFourth((java.lang.Integer)(-1));
    boolean b62 = iP25.equals((java.lang.Object)iP53);
    iP25.setFourth((java.lang.Integer)64);
    tp2.IPBan iPBan66 = new tp2.IPBan(iP25, (java.lang.Long)2527140L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long45 + "' != '" + 10L+ "'", long45.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b54 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i55 + "' != '" + 161+ "'", i55.equals(161));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b57 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b62 == false);

  }

  @Test
  public void test029() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test029"); }


    tp2.Server server0 = new tp2.Server();
    tp2.IP iP1 = null;
    boolean b2 = server0.addBan(iP1);
    tp2.ITime iTime3 = null;
    server0.setTime(iTime3);
    tp2.IP iP5 = null;
    tp2.IPBan iPBan7 = new tp2.IPBan(iP5, (java.lang.Long)10L);
    tp2.IP iP8 = iPBan7.getIp();
    java.lang.Long long9 = iPBan7.expires;
    tp2.IP iP10 = null;
    iPBan7.ip = iP10;
    tp2.Server server12 = new tp2.Server();
    tp2.IP iP17 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b18 = server12.removeException(iP17);
    java.lang.Integer i19 = iP17.getFirst();
    iPBan7.setIp(iP17);
    boolean b21 = server0.connect(iP17);
    tp2.Server server22 = new tp2.Server();
    tp2.IP iP27 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b28 = server22.removeException(iP27);
    boolean b30 = iP27.equals((java.lang.Object)(-1L));
    iP27.setFourth((java.lang.Integer)28);
    boolean b33 = server0.addException(iP27);
    tp2.IP iP34 = null;
    tp2.IPBan iPBan36 = new tp2.IPBan(iP34, (java.lang.Long)10L);
    tp2.IP iP37 = iPBan36.getIp();
    tp2.IP iP42 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    iP42.setFirst((java.lang.Integer)161);
    iP42.setThird((java.lang.Integer)3);
    iP42.setFirst((java.lang.Integer)26);
    iPBan36.ip = iP42;
    iP42.setSecond((java.lang.Integer)15);
    boolean b52 = server0.removeBan(iP42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long9 + "' != '" + 10L+ "'", long9.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i19 + "' != '" + 161+ "'", i19.equals(161));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b52 == false);

  }

  @Test
  public void test030() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test030"); }


    java.lang.String str1 = java.lang.Integer.toUnsignedString(165675008);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "165675008"+ "'", str1.equals("165675008"));

  }

  @Test
  public void test031() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test031"); }


    int i2 = java.lang.Integer.sum(18, 395165525);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 395165543);

  }

  @Test
  public void test032() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test032"); }


    tp2.IP iP0 = null;
    tp2.IPBan iPBan2 = new tp2.IPBan(iP0, (java.lang.Long)10L);
    tp2.Server server3 = new tp2.Server();
    tp2.IP iP8 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b9 = server3.removeException(iP8);
    server3.update();
    tp2.Server server11 = new tp2.Server();
    tp2.IP iP12 = null;
    boolean b13 = server11.addBan(iP12);
    tp2.Server server14 = new tp2.Server();
    tp2.IP iP19 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b20 = server14.removeException(iP19);
    boolean b22 = iP19.equals((java.lang.Object)(-1L));
    boolean b23 = server11.removeBan(iP19);
    tp2.IP iP28 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    iP28.setFirst((java.lang.Integer)161);
    iP28.setThird((java.lang.Integer)3);
    iP28.setFirst((java.lang.Integer)26);
    boolean b35 = server11.connect(iP28);
    iP28.setSecond((java.lang.Integer)1677721761);
    boolean b38 = server3.removeBan(iP28);
    tp2.Server server39 = new tp2.Server();
    tp2.IP iP40 = null;
    boolean b41 = server39.addBan(iP40);
    tp2.ITime iTime42 = null;
    server39.setTime(iTime42);
    tp2.IP iP44 = null;
    tp2.IPBan iPBan46 = new tp2.IPBan(iP44, (java.lang.Long)10L);
    tp2.IP iP47 = iPBan46.getIp();
    java.lang.Long long48 = iPBan46.expires;
    tp2.IP iP49 = null;
    iPBan46.ip = iP49;
    tp2.Server server51 = new tp2.Server();
    tp2.IP iP56 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b57 = server51.removeException(iP56);
    java.lang.Integer i58 = iP56.getFirst();
    iPBan46.setIp(iP56);
    boolean b60 = server39.connect(iP56);
    iP56.setFourth((java.lang.Integer)(-1));
    boolean b63 = server3.removeException(iP56);
    iPBan2.ip = iP56;
    java.lang.Long long65 = iPBan2.expires;
    tp2.IP iP66 = iPBan2.getIp();
    iPBan2.setExpires((java.lang.Long)4160749568L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long48 + "' != '" + 10L+ "'", long48.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b57 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i58 + "' != '" + 161+ "'", i58.equals(161));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b60 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b63 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long65 + "' != '" + 10L+ "'", long65.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP66);

  }

  @Test
  public void test033() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test033"); }


    int i2 = java.lang.Integer.rotateRight(120180, 1677721779);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 984514560);

  }

  @Test
  public void test034() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test034"); }


    tp2.Server server0 = new tp2.Server();
    tp2.IP iP1 = null;
    boolean b2 = server0.addBan(iP1);
    tp2.Server server3 = new tp2.Server();
    tp2.IP iP8 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b9 = server3.removeException(iP8);
    boolean b11 = iP8.equals((java.lang.Object)(-1L));
    boolean b12 = server0.removeBan(iP8);
    tp2.IP iP17 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    iP17.setFirst((java.lang.Integer)161);
    iP17.setThird((java.lang.Integer)3);
    iP17.setFirst((java.lang.Integer)26);
    boolean b24 = server0.connect(iP17);
    tp2.IP iP25 = null;
    tp2.IPBan iPBan27 = new tp2.IPBan(iP25, (java.lang.Long)10L);
    java.lang.Long long28 = iPBan27.getExpires();
    tp2.IP iP33 = new tp2.IP((java.lang.Integer)31, (java.lang.Integer)31, (java.lang.Integer)31, (java.lang.Integer)0);
    iPBan27.ip = iP33;
    iP33.setFirst((java.lang.Integer)2);
    boolean b37 = server0.connect(iP33);
    tp2.IP iP38 = null;
    tp2.IPBan iPBan40 = new tp2.IPBan(iP38, (java.lang.Long)10L);
    tp2.IP iP41 = iPBan40.getIp();
    java.lang.Long long42 = iPBan40.expires;
    tp2.IP iP43 = null;
    iPBan40.ip = iP43;
    tp2.Server server45 = new tp2.Server();
    tp2.IP iP50 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b51 = server45.removeException(iP50);
    java.lang.Integer i52 = iP50.getFirst();
    iPBan40.setIp(iP50);
    iP50.setSecond((java.lang.Integer)1476395008);
    tp2.IPBan iPBan57 = new tp2.IPBan(iP50, (java.lang.Long)10L);
    boolean b58 = server0.removeBan(iP50);
    server0.update();
    tp2.IP iP60 = null;
    boolean b61 = server0.addException(iP60);
    tp2.Server server62 = new tp2.Server();
    tp2.IP iP67 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b68 = server62.removeException(iP67);
    iP67.setThird((java.lang.Integer)56);
    java.lang.Integer i71 = iP67.getFourth();
    tp2.IPBan iPBan73 = new tp2.IPBan(iP67, (java.lang.Long)10L);
    iPBan73.expires = 2147483647L;
    tp2.IP iP76 = iPBan73.ip;
    tp2.IP iP77 = iPBan73.getIp();
    boolean b78 = server0.addException(iP77);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long28 + "' != '" + 10L+ "'", long28.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long42 + "' != '" + 10L+ "'", long42.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b51 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i52 + "' != '" + 161+ "'", i52.equals(161));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b58 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b61 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b68 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i71 + "' != '" + 5+ "'", i71.equals(5));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP76);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP77);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b78 == true);

  }

  @Test
  public void test035() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test035"); }


    // The following exception was thrown during execution in test generation
    try {
      java.lang.Integer i2 = java.lang.Integer.valueOf("10011010000101", (-805306368));
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test036() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test036"); }


    tp2.IP iP0 = null;
    tp2.IPBan iPBan2 = new tp2.IPBan(iP0, (java.lang.Long)10L);
    java.lang.Long long3 = iPBan2.getExpires();
    tp2.IP iP4 = iPBan2.getIp();
    tp2.IP iP5 = iPBan2.ip;
    java.lang.Long long6 = iPBan2.getExpires();
    iPBan2.setExpires((java.lang.Long)28L);
    java.lang.Long long9 = iPBan2.getExpires();
    java.lang.Long long10 = iPBan2.expires;
    tp2.Server server11 = new tp2.Server();
    tp2.IP iP16 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b17 = server11.removeException(iP16);
    server11.update();
    tp2.Server server19 = new tp2.Server();
    tp2.IP iP20 = null;
    boolean b21 = server19.addBan(iP20);
    tp2.Server server22 = new tp2.Server();
    tp2.IP iP27 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b28 = server22.removeException(iP27);
    boolean b30 = iP27.equals((java.lang.Object)(-1L));
    boolean b31 = server19.removeBan(iP27);
    tp2.IP iP36 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    iP36.setFirst((java.lang.Integer)161);
    iP36.setThird((java.lang.Integer)3);
    iP36.setFirst((java.lang.Integer)26);
    boolean b43 = server19.connect(iP36);
    iP36.setSecond((java.lang.Integer)1677721761);
    boolean b46 = server11.removeBan(iP36);
    tp2.Server server47 = new tp2.Server();
    tp2.IP iP52 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b53 = server47.removeException(iP52);
    server47.update();
    tp2.IP iP55 = null;
    tp2.IPBan iPBan57 = new tp2.IPBan(iP55, (java.lang.Long)10L);
    tp2.IP iP58 = iPBan57.ip;
    tp2.Server server59 = new tp2.Server();
    tp2.IP iP60 = null;
    boolean b61 = server59.addBan(iP60);
    tp2.Server server62 = new tp2.Server();
    tp2.IP iP67 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b68 = server62.removeException(iP67);
    boolean b70 = iP67.equals((java.lang.Object)(-1L));
    boolean b71 = server59.removeBan(iP67);
    iPBan57.ip = iP67;
    boolean b73 = server47.removeException(iP67);
    boolean b74 = server11.removeException(iP67);
    iP67.setFourth((java.lang.Integer)268435456);
    boolean b78 = iP67.equals((java.lang.Object)229376);
    iPBan2.ip = iP67;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L+ "'", long3.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L+ "'", long6.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long9 + "' != '" + 28L+ "'", long9.equals(28L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long10 + "' != '" + 28L+ "'", long10.equals(28L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b43 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b46 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b53 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP58);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b61 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b68 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b70 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b71 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b73 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b74 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b78 == false);

  }

  @Test
  public void test037() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test037"); }


    java.lang.Integer i2 = java.lang.Integer.getInteger("502000053", (java.lang.Integer)1743650821);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i2 + "' != '" + 1743650821+ "'", i2.equals(1743650821));

  }

  @Test
  public void test038() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test038"); }


    tp2.Server server0 = new tp2.Server();
    tp2.IP iP5 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b6 = server0.removeException(iP5);
    iP5.setThird((java.lang.Integer)56);
    java.lang.Integer i9 = iP5.getFourth();
    tp2.IPBan iPBan11 = new tp2.IPBan(iP5, (java.lang.Long)10L);
    java.lang.Long long12 = iPBan11.expires;
    tp2.Server server13 = new tp2.Server();
    tp2.IP iP14 = null;
    boolean b15 = server13.addBan(iP14);
    tp2.IP iP20 = new tp2.IP((java.lang.Integer)31, (java.lang.Integer)31, (java.lang.Integer)31, (java.lang.Integer)0);
    iP20.setSecond((java.lang.Integer)2147483647);
    boolean b23 = server13.addBan(iP20);
    tp2.Server server24 = new tp2.Server();
    tp2.IP iP25 = null;
    boolean b26 = server24.addBan(iP25);
    tp2.ITime iTime27 = null;
    server24.setTime(iTime27);
    tp2.IP iP29 = null;
    tp2.IPBan iPBan31 = new tp2.IPBan(iP29, (java.lang.Long)10L);
    tp2.IP iP32 = iPBan31.getIp();
    java.lang.Long long33 = iPBan31.expires;
    tp2.IP iP34 = null;
    iPBan31.ip = iP34;
    tp2.Server server36 = new tp2.Server();
    tp2.IP iP41 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b42 = server36.removeException(iP41);
    java.lang.Integer i43 = iP41.getFirst();
    iPBan31.setIp(iP41);
    boolean b45 = server24.connect(iP41);
    boolean b46 = server13.removeBan(iP41);
    tp2.IP iP51 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    iP51.setFirst((java.lang.Integer)161);
    iP51.setThird((java.lang.Integer)3);
    iP51.setFirst((java.lang.Integer)26);
    iP51.setThird((java.lang.Integer)5);
    boolean b60 = server13.removeBan(iP51);
    java.lang.Object obj61 = null;
    boolean b62 = iP51.equals(obj61);
    iPBan11.setIp(iP51);
    tp2.IP iP68 = new tp2.IP((java.lang.Integer)31, (java.lang.Integer)31, (java.lang.Integer)31, (java.lang.Integer)0);
    iP68.setSecond((java.lang.Integer)2147483647);
    iP68.setSecond((java.lang.Integer)134217728);
    java.lang.Integer i73 = iP68.getSecond();
    iPBan11.setIp(iP68);
    java.lang.Integer i75 = iP68.getFourth();
    tp2.IPBan iPBan77 = new tp2.IPBan(iP68, (java.lang.Long)(-1L));
    iPBan77.expires = 7489L;
    iPBan77.setExpires((java.lang.Long)80000085L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 5+ "'", i9.equals(5));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long12 + "' != '" + 10L+ "'", long12.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long33 + "' != '" + 10L+ "'", long33.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i43 + "' != '" + 161+ "'", i43.equals(161));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b46 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b60 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b62 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i73 + "' != '" + 134217728+ "'", i73.equals(134217728));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i75 + "' != '" + 0+ "'", i75.equals(0));

  }

  @Test
  public void test039() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test039"); }


    tp2.IP iP0 = null;
    tp2.IPBan iPBan2 = new tp2.IPBan(iP0, (java.lang.Long)10L);
    tp2.IP iP3 = iPBan2.getIp();
    java.lang.Long long4 = iPBan2.expires;
    tp2.IP iP5 = null;
    iPBan2.ip = iP5;
    iPBan2.setExpires((java.lang.Long)(-1L));
    tp2.IP iP9 = iPBan2.getIp();
    java.lang.Long long10 = iPBan2.expires;
    java.lang.Long long11 = iPBan2.expires;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L+ "'", long4.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L)+ "'", long10.equals((-1L)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L)+ "'", long11.equals((-1L)));

  }

  @Test
  public void test040() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test040"); }


    tp2.IP iP4 = new tp2.IP((java.lang.Integer)229376, (java.lang.Integer)1100101, (java.lang.Integer)(-553688992), (java.lang.Integer)495049);

  }

  @Test
  public void test041() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test041"); }


    tp2.Server server0 = new tp2.Server();
    tp2.IP iP1 = null;
    boolean b2 = server0.addBan(iP1);
    tp2.ITime iTime3 = null;
    server0.setTime(iTime3);
    tp2.IP iP5 = null;
    tp2.IPBan iPBan7 = new tp2.IPBan(iP5, (java.lang.Long)10L);
    tp2.IP iP8 = iPBan7.getIp();
    java.lang.Long long9 = iPBan7.expires;
    tp2.IP iP10 = null;
    iPBan7.ip = iP10;
    tp2.Server server12 = new tp2.Server();
    tp2.IP iP17 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b18 = server12.removeException(iP17);
    java.lang.Integer i19 = iP17.getFirst();
    iPBan7.setIp(iP17);
    tp2.IP iP21 = iPBan7.getIp();
    java.lang.Integer i22 = iP21.getSecond();
    iP21.setSecond((java.lang.Integer)161);
    boolean b25 = server0.connect(iP21);
    server0.update();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long9 + "' != '" + 10L+ "'", long9.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i19 + "' != '" + 161+ "'", i19.equals(161));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i22 + "' != '" + (-2147483648)+ "'", i22.equals((-2147483648)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);

  }

  @Test
  public void test042() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test042"); }


    tp2.IP iP0 = null;
    tp2.IPBan iPBan2 = new tp2.IPBan(iP0, (java.lang.Long)10L);
    java.lang.Long long3 = iPBan2.getExpires();
    tp2.IP iP8 = new tp2.IP((java.lang.Integer)31, (java.lang.Integer)31, (java.lang.Integer)31, (java.lang.Integer)0);
    iPBan2.ip = iP8;
    tp2.Server server10 = new tp2.Server();
    tp2.IP iP15 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b16 = server10.removeException(iP15);
    server10.update();
    tp2.Server server18 = new tp2.Server();
    tp2.IP iP23 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b24 = server18.removeException(iP23);
    java.lang.Integer i25 = iP23.getFirst();
    boolean b26 = server10.addBan(iP23);
    iPBan2.setIp(iP23);
    tp2.IP iP28 = iPBan2.ip;
    tp2.IP iP29 = iPBan2.ip;
    tp2.IP iP30 = iPBan2.ip;
    iPBan2.setExpires((java.lang.Long)4329604L);
    iPBan2.setExpires((java.lang.Long)38L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L+ "'", long3.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i25 + "' != '" + 161+ "'", i25.equals(161));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP30);

  }

  @Test
  public void test043() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test043"); }


    int i1 = java.lang.Integer.reverseBytes((-1067699647));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 1093819584);

  }

  @Test
  public void test044() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test044"); }


    tp2.Server server0 = new tp2.Server();
    tp2.IP iP5 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b6 = server0.removeException(iP5);
    server0.update();
    tp2.Server server8 = new tp2.Server();
    tp2.IP iP13 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b14 = server8.removeException(iP13);
    java.lang.Integer i15 = iP13.getFirst();
    boolean b16 = server0.addBan(iP13);
    boolean b18 = iP13.equals((java.lang.Object)(short)10);
    iP13.setSecond((java.lang.Integer)(-134217728));
    java.lang.Integer i21 = iP13.getThird();
    tp2.IP iP22 = null;
    tp2.IPBan iPBan24 = new tp2.IPBan(iP22, (java.lang.Long)10L);
    java.lang.Long long25 = iPBan24.getExpires();
    tp2.IP iP30 = new tp2.IP((java.lang.Integer)31, (java.lang.Integer)31, (java.lang.Integer)31, (java.lang.Integer)0);
    iPBan24.ip = iP30;
    tp2.Server server32 = new tp2.Server();
    tp2.IP iP37 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b38 = server32.removeException(iP37);
    server32.update();
    tp2.Server server40 = new tp2.Server();
    tp2.IP iP45 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b46 = server40.removeException(iP45);
    java.lang.Integer i47 = iP45.getFirst();
    boolean b48 = server32.addBan(iP45);
    iPBan24.setIp(iP45);
    tp2.IP iP50 = iPBan24.ip;
    tp2.IP iP51 = iPBan24.ip;
    java.lang.Long long52 = iPBan24.getExpires();
    boolean b53 = iP13.equals((java.lang.Object)iPBan24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i15 + "' != '" + 161+ "'", i15.equals(161));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i21 + "' != '" + 939524096+ "'", i21.equals(939524096));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long25 + "' != '" + 10L+ "'", long25.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b46 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i47 + "' != '" + 161+ "'", i47.equals(161));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b48 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long52 + "' != '" + 10L+ "'", long52.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b53 == false);

  }

  @Test
  public void test045() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test045"); }


    tp2.IP iP0 = null;
    tp2.IPBan iPBan2 = new tp2.IPBan(iP0, (java.lang.Long)10L);
    java.lang.Long long3 = iPBan2.getExpires();
    iPBan2.expires = 31L;
    tp2.Server server6 = new tp2.Server();
    tp2.IP iP7 = null;
    boolean b8 = server6.addBan(iP7);
    tp2.Server server9 = new tp2.Server();
    tp2.IP iP14 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b15 = server9.removeException(iP14);
    boolean b17 = iP14.equals((java.lang.Object)(-1L));
    boolean b18 = server6.removeBan(iP14);
    server6.update();
    tp2.IP iP24 = new tp2.IP((java.lang.Integer)740, (java.lang.Integer)2, (java.lang.Integer)268435456, (java.lang.Integer)229376);
    boolean b25 = server6.addException(iP24);
    tp2.IP iP30 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    iP30.setFirst((java.lang.Integer)161);
    boolean b33 = server6.connect(iP30);
    iPBan2.setIp(iP30);
    tp2.IPBan iPBan36 = new tp2.IPBan(iP30, (java.lang.Long)31L);
    iPBan36.setExpires((java.lang.Long)2147483647L);
    iPBan36.expires = 1493172264L;
    iPBan36.expires = 291939L;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L+ "'", long3.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == true);

  }

  @Test
  public void test046() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test046"); }


    int i2 = java.lang.Integer.min(1594880, 1815367701);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1594880);

  }

  @Test
  public void test047() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test047"); }


    int i2 = java.lang.Integer.divideUnsigned(1478164480, 1639744);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 901);

  }

  @Test
  public void test048() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test048"); }


    int i2 = java.lang.Integer.max(1366875125, 205);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1366875125);

  }

  @Test
  public void test049() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test049"); }


    int i2 = java.lang.Integer.max(977483676, 49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 977483676);

  }

  @Test
  public void test050() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test050"); }


    tp2.Server server0 = new tp2.Server();
    tp2.IP iP1 = null;
    boolean b2 = server0.addBan(iP1);
    server0.update();
    tp2.IP iP8 = new tp2.IP((java.lang.Integer)31, (java.lang.Integer)31, (java.lang.Integer)31, (java.lang.Integer)0);
    boolean b9 = server0.removeBan(iP8);
    tp2.Server server10 = new tp2.Server();
    tp2.IP iP11 = null;
    boolean b12 = server10.addBan(iP11);
    server10.update();
    tp2.Server server14 = new tp2.Server();
    tp2.IP iP15 = null;
    boolean b16 = server14.addBan(iP15);
    tp2.ITime iTime17 = null;
    server14.setTime(iTime17);
    tp2.IP iP19 = null;
    tp2.IPBan iPBan21 = new tp2.IPBan(iP19, (java.lang.Long)10L);
    tp2.IP iP22 = iPBan21.getIp();
    java.lang.Long long23 = iPBan21.expires;
    tp2.IP iP24 = null;
    iPBan21.ip = iP24;
    tp2.Server server26 = new tp2.Server();
    tp2.IP iP31 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b32 = server26.removeException(iP31);
    java.lang.Integer i33 = iP31.getFirst();
    iPBan21.setIp(iP31);
    iP31.setFourth((java.lang.Integer)(-2147483620));
    boolean b37 = server14.removeBan(iP31);
    boolean b38 = server10.addException(iP31);
    boolean b39 = server0.connect(iP31);
    server0.update();
    tp2.ITime iTime41 = null;
    server0.setTime(iTime41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long23 + "' != '" + 10L+ "'", long23.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i33 + "' != '" + 161+ "'", i33.equals(161));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == true);

  }

  @Test
  public void test051() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test051"); }


    int i1 = java.lang.Integer.reverseBytes(1344);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 1074069504);

  }

  @Test
  public void test052() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test052"); }


    int i1 = java.lang.Integer.bitCount(10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 2);

  }

  @Test
  public void test053() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test053"); }


    int i2 = java.lang.Integer.divideUnsigned(18, (-1291845532));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);

  }

  @Test
  public void test054() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test054"); }


    tp2.IP iP4 = new tp2.IP((java.lang.Integer)(-530836224), (java.lang.Integer)145752064, (java.lang.Integer)71554675, (java.lang.Integer)4194304);
    java.lang.Integer i5 = iP4.getFirst();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i5 + "' != '" + (-530836224)+ "'", i5.equals((-530836224)));

  }

  @Test
  public void test055() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test055"); }


    int i1 = java.lang.Integer.reverse((-1593835520));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 133);

  }

  @Test
  public void test056() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test056"); }


    tp2.IP iP4 = new tp2.IP((java.lang.Integer)80000085, (java.lang.Integer)2082996226, (java.lang.Integer)11585, (java.lang.Integer)12);
    iP4.setFourth((java.lang.Integer)800);

  }

  @Test
  public void test057() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test057"); }


    tp2.Server server0 = new tp2.Server();
    tp2.IP iP1 = null;
    boolean b2 = server0.addBan(iP1);
    tp2.Server server3 = new tp2.Server();
    tp2.IP iP8 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b9 = server3.removeException(iP8);
    boolean b11 = iP8.equals((java.lang.Object)(-1L));
    boolean b12 = server0.removeBan(iP8);
    tp2.IPBan iPBan14 = new tp2.IPBan(iP8, (java.lang.Long)(-1L));
    java.lang.Long long15 = iPBan14.getExpires();
    iPBan14.expires = 4329604L;
    iPBan14.setExpires((java.lang.Long)2147483704L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-1L)+ "'", long15.equals((-1L)));

  }

  @Test
  public void test058() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test058"); }


    tp2.Server server0 = new tp2.Server();
    tp2.IP iP1 = null;
    boolean b2 = server0.addBan(iP1);
    tp2.IP iP7 = new tp2.IP((java.lang.Integer)31, (java.lang.Integer)31, (java.lang.Integer)31, (java.lang.Integer)0);
    iP7.setSecond((java.lang.Integer)2147483647);
    boolean b10 = server0.addBan(iP7);
    tp2.Server server11 = new tp2.Server();
    tp2.IP iP12 = null;
    boolean b13 = server11.addBan(iP12);
    tp2.Server server14 = new tp2.Server();
    tp2.IP iP19 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b20 = server14.removeException(iP19);
    boolean b22 = iP19.equals((java.lang.Object)(-1L));
    boolean b23 = server11.removeBan(iP19);
    java.lang.Integer i24 = iP19.getFourth();
    boolean b25 = server0.removeBan(iP19);
    tp2.ITime iTime26 = null;
    server0.setTime(iTime26);
    server0.update();
    server0.update();
    tp2.IP iP30 = null;
    tp2.IPBan iPBan32 = new tp2.IPBan(iP30, (java.lang.Long)10L);
    tp2.IP iP33 = iPBan32.getIp();
    java.lang.Long long34 = iPBan32.expires;
    tp2.IP iP35 = null;
    iPBan32.ip = iP35;
    tp2.Server server37 = new tp2.Server();
    tp2.IP iP42 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b43 = server37.removeException(iP42);
    java.lang.Integer i44 = iP42.getFirst();
    iPBan32.setIp(iP42);
    tp2.IP iP46 = iPBan32.getIp();
    iP46.setFirst((java.lang.Integer)6);
    boolean b49 = server0.removeException(iP46);
    tp2.IP iP54 = new tp2.IP((java.lang.Integer)31, (java.lang.Integer)31, (java.lang.Integer)31, (java.lang.Integer)0);
    java.lang.Integer i55 = null;
    iP54.setFirst(i55);
    boolean b57 = server0.removeException(iP54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i24 + "' != '" + 5+ "'", i24.equals(5));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long34 + "' != '" + 10L+ "'", long34.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b43 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i44 + "' != '" + 161+ "'", i44.equals(161));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b49 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b57 == false);

  }

  @Test
  public void test059() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test059"); }


    tp2.Server server0 = new tp2.Server();
    tp2.IP iP5 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b6 = server0.removeException(iP5);
    iP5.setThird((java.lang.Integer)56);
    tp2.IPBan iPBan10 = new tp2.IPBan(iP5, (java.lang.Long)2147483676L);
    java.lang.Long long11 = null;
    tp2.IPBan iPBan12 = new tp2.IPBan(iP5, long11);
    tp2.IP iP13 = iPBan12.ip;
    tp2.IP iP14 = iPBan12.getIp();
    iP14.setFirst((java.lang.Integer)10010000);
    java.lang.Integer i17 = iP14.getSecond();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i17 + "' != '" + (-2147483648)+ "'", i17.equals((-2147483648)));

  }

  @Test
  public void test060() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test060"); }


    int i1 = java.lang.Integer.parseUnsignedInt("469991460");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 469991460);

  }

  @Test
  public void test061() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test061"); }


    tp2.Server server0 = new tp2.Server();
    tp2.IP iP1 = null;
    boolean b2 = server0.addBan(iP1);
    tp2.IP iP7 = new tp2.IP((java.lang.Integer)31, (java.lang.Integer)31, (java.lang.Integer)31, (java.lang.Integer)0);
    iP7.setSecond((java.lang.Integer)2147483647);
    boolean b10 = server0.addBan(iP7);
    tp2.Server server11 = new tp2.Server();
    tp2.IP iP12 = null;
    boolean b13 = server11.addBan(iP12);
    tp2.ITime iTime14 = null;
    server11.setTime(iTime14);
    tp2.IP iP16 = null;
    tp2.IPBan iPBan18 = new tp2.IPBan(iP16, (java.lang.Long)10L);
    tp2.IP iP19 = iPBan18.getIp();
    java.lang.Long long20 = iPBan18.expires;
    tp2.IP iP21 = null;
    iPBan18.ip = iP21;
    tp2.Server server23 = new tp2.Server();
    tp2.IP iP28 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b29 = server23.removeException(iP28);
    java.lang.Integer i30 = iP28.getFirst();
    iPBan18.setIp(iP28);
    boolean b32 = server11.connect(iP28);
    boolean b33 = server0.removeBan(iP28);
    tp2.IP iP38 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    iP38.setFirst((java.lang.Integer)161);
    boolean b42 = iP38.equals((java.lang.Object)56);
    boolean b43 = server0.removeException(iP38);
    tp2.IP iP44 = null;
    tp2.IPBan iPBan46 = new tp2.IPBan(iP44, (java.lang.Long)10L);
    tp2.IP iP47 = iPBan46.getIp();
    java.lang.Long long48 = iPBan46.expires;
    tp2.IP iP49 = null;
    iPBan46.ip = iP49;
    tp2.Server server51 = new tp2.Server();
    tp2.IP iP56 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b57 = server51.removeException(iP56);
    java.lang.Integer i58 = iP56.getFirst();
    iPBan46.setIp(iP56);
    tp2.IP iP60 = iPBan46.getIp();
    java.lang.Integer i61 = iP60.getSecond();
    boolean b62 = server0.removeBan(iP60);
    tp2.Server server63 = new tp2.Server();
    tp2.IP iP64 = null;
    boolean b65 = server63.addBan(iP64);
    tp2.Server server66 = new tp2.Server();
    tp2.IP iP71 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b72 = server66.removeException(iP71);
    boolean b74 = iP71.equals((java.lang.Object)(-1L));
    boolean b75 = server63.removeBan(iP71);
    tp2.IP iP80 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    iP80.setFirst((java.lang.Integer)161);
    iP80.setThird((java.lang.Integer)3);
    iP80.setFirst((java.lang.Integer)26);
    boolean b87 = server63.connect(iP80);
    tp2.IP iP92 = new tp2.IP((java.lang.Integer)2147483647, (java.lang.Integer)(-1), (java.lang.Integer)56, (java.lang.Integer)458752);
    boolean b93 = server63.addException(iP92);
    iP92.setFirst((java.lang.Integer)14);
    java.lang.Integer i96 = iP92.getThird();
    boolean b97 = server0.removeException(iP92);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long20 + "' != '" + 10L+ "'", long20.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i30 + "' != '" + 161+ "'", i30.equals(161));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b43 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long48 + "' != '" + 10L+ "'", long48.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b57 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i58 + "' != '" + 161+ "'", i58.equals(161));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP60);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i61 + "' != '" + (-2147483648)+ "'", i61.equals((-2147483648)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b62 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b65 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b72 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b74 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b75 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b87 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b93 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i96 + "' != '" + 56+ "'", i96.equals(56));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b97 == false);

  }

  @Test
  public void test062() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test062"); }


    java.lang.String str1 = java.lang.Integer.toBinaryString(436207616);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "11010000000000000000000000000"+ "'", str1.equals("11010000000000000000000000000"));

  }

  @Test
  public void test063() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test063"); }


    // The following exception was thrown during execution in test generation
    try {
      java.lang.Integer i1 = java.lang.Integer.valueOf("1010000000000000000000000");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test064() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test064"); }


    // The following exception was thrown during execution in test generation
    try {
      korat.finitization.IFinitization iFinitization1 = tp2.Server.finServer(9861);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test065() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test065"); }


    int i1 = java.lang.Integer.reverseBytes(83894283);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 186646533);

  }

  @Test
  public void test066() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test066"); }


    tp2.IP iP0 = null;
    tp2.IPBan iPBan2 = new tp2.IPBan(iP0, (java.lang.Long)10L);
    java.lang.Long long3 = iPBan2.expires;
    iPBan2.expires = 2013262563L;
    iPBan2.expires = 3758686208L;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L+ "'", long3.equals(10L));

  }

  @Test
  public void test067() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test067"); }


    // The following exception was thrown during execution in test generation
    try {
      int i2 = java.lang.Integer.parseUnsignedInt("100001000010", 74285056);
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test068() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test068"); }


    // The following exception was thrown during execution in test generation
    try {
      int i1 = java.lang.Integer.parseUnsignedInt("10001011000");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test069() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test069"); }


    tp2.IP iP0 = null;
    tp2.IPBan iPBan2 = new tp2.IPBan(iP0, (java.lang.Long)10L);
    tp2.Server server3 = new tp2.Server();
    tp2.IP iP8 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b9 = server3.removeException(iP8);
    server3.update();
    tp2.Server server11 = new tp2.Server();
    tp2.IP iP12 = null;
    boolean b13 = server11.addBan(iP12);
    tp2.Server server14 = new tp2.Server();
    tp2.IP iP19 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b20 = server14.removeException(iP19);
    boolean b22 = iP19.equals((java.lang.Object)(-1L));
    boolean b23 = server11.removeBan(iP19);
    tp2.IP iP28 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    iP28.setFirst((java.lang.Integer)161);
    iP28.setThird((java.lang.Integer)3);
    iP28.setFirst((java.lang.Integer)26);
    boolean b35 = server11.connect(iP28);
    iP28.setSecond((java.lang.Integer)1677721761);
    boolean b38 = server3.removeBan(iP28);
    tp2.Server server39 = new tp2.Server();
    tp2.IP iP40 = null;
    boolean b41 = server39.addBan(iP40);
    tp2.ITime iTime42 = null;
    server39.setTime(iTime42);
    tp2.IP iP44 = null;
    tp2.IPBan iPBan46 = new tp2.IPBan(iP44, (java.lang.Long)10L);
    tp2.IP iP47 = iPBan46.getIp();
    java.lang.Long long48 = iPBan46.expires;
    tp2.IP iP49 = null;
    iPBan46.ip = iP49;
    tp2.Server server51 = new tp2.Server();
    tp2.IP iP56 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b57 = server51.removeException(iP56);
    java.lang.Integer i58 = iP56.getFirst();
    iPBan46.setIp(iP56);
    boolean b60 = server39.connect(iP56);
    iP56.setFourth((java.lang.Integer)(-1));
    boolean b63 = server3.removeException(iP56);
    iPBan2.ip = iP56;
    tp2.IPBan iPBan66 = new tp2.IPBan(iP56, (java.lang.Long)100L);
    java.lang.Long long67 = iPBan66.expires;
    tp2.IP iP68 = null;
    iPBan66.ip = iP68;
    java.lang.Long long70 = iPBan66.getExpires();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long48 + "' != '" + 10L+ "'", long48.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b57 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i58 + "' != '" + 161+ "'", i58.equals(161));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b60 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b63 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long67 + "' != '" + 100L+ "'", long67.equals(100L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long70 + "' != '" + 100L+ "'", long70.equals(100L));

  }

  @Test
  public void test070() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test070"); }


    tp2.IP iP0 = null;
    tp2.IPBan iPBan2 = new tp2.IPBan(iP0, (java.lang.Long)10L);
    tp2.IP iP3 = iPBan2.getIp();
    java.lang.Long long4 = iPBan2.expires;
    tp2.Server server5 = new tp2.Server();
    tp2.IP iP10 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b11 = server5.removeException(iP10);
    java.lang.Integer i12 = iP10.getFirst();
    iPBan2.setIp(iP10);
    tp2.IP iP14 = iPBan2.ip;
    tp2.IP iP15 = null;
    tp2.IPBan iPBan17 = new tp2.IPBan(iP15, (java.lang.Long)10L);
    java.lang.Long long18 = iPBan17.getExpires();
    tp2.IP iP23 = new tp2.IP((java.lang.Integer)31, (java.lang.Integer)31, (java.lang.Integer)31, (java.lang.Integer)0);
    iPBan17.ip = iP23;
    iP23.setFirst((java.lang.Integer)2);
    iPBan2.setIp(iP23);
    tp2.Server server28 = new tp2.Server();
    tp2.IP iP29 = null;
    boolean b30 = server28.addBan(iP29);
    tp2.Server server31 = new tp2.Server();
    tp2.IP iP36 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b37 = server31.removeException(iP36);
    boolean b39 = iP36.equals((java.lang.Object)(-1L));
    boolean b40 = server28.removeBan(iP36);
    iPBan2.ip = iP36;
    java.lang.Long long42 = iPBan2.expires;
    iPBan2.expires = 10L;
    iPBan2.expires = 2231369807L;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L+ "'", long4.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i12 + "' != '" + 161+ "'", i12.equals(161));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long18 + "' != '" + 10L+ "'", long18.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long42 + "' != '" + 10L+ "'", long42.equals(10L));

  }

  @Test
  public void test071() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test071"); }


    java.lang.String str1 = java.lang.Integer.toHexString(1073741887);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "4000003f"+ "'", str1.equals("4000003f"));

  }

  @Test
  public void test072() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test072"); }


    int i2 = java.lang.Integer.rotateRight(1638400, (-1879048031));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 819200);

  }

  @Test
  public void test073() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test073"); }


    int i1 = java.lang.Integer.parseInt("205");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 205);

  }

  @Test
  public void test074() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test074"); }


    int i1 = java.lang.Integer.bitCount(90);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 4);

  }

  @Test
  public void test075() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test075"); }


    int i1 = java.lang.Integer.reverse(176);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 218103808);

  }

  @Test
  public void test076() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test076"); }


    tp2.Server server0 = new tp2.Server();
    tp2.IP iP1 = null;
    boolean b2 = server0.connect(iP1);
    tp2.IP iP7 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    iP7.setFirst((java.lang.Integer)161);
    boolean b11 = iP7.equals((java.lang.Object)56);
    java.lang.Integer i12 = iP7.getFourth();
    boolean b13 = server0.removeBan(iP7);
    tp2.Server server14 = new tp2.Server();
    tp2.IP iP19 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b20 = server14.removeException(iP19);
    server14.update();
    tp2.Server server22 = new tp2.Server();
    tp2.IP iP23 = null;
    boolean b24 = server22.addBan(iP23);
    tp2.Server server25 = new tp2.Server();
    tp2.IP iP30 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b31 = server25.removeException(iP30);
    boolean b33 = iP30.equals((java.lang.Object)(-1L));
    boolean b34 = server22.removeBan(iP30);
    tp2.IP iP39 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    iP39.setFirst((java.lang.Integer)161);
    iP39.setThird((java.lang.Integer)3);
    iP39.setFirst((java.lang.Integer)26);
    boolean b46 = server22.connect(iP39);
    iP39.setSecond((java.lang.Integer)1677721761);
    boolean b49 = server14.removeBan(iP39);
    tp2.Server server50 = new tp2.Server();
    tp2.IP iP51 = null;
    boolean b52 = server50.addBan(iP51);
    tp2.ITime iTime53 = null;
    server50.setTime(iTime53);
    tp2.IP iP55 = null;
    tp2.IPBan iPBan57 = new tp2.IPBan(iP55, (java.lang.Long)10L);
    tp2.IP iP58 = iPBan57.getIp();
    java.lang.Long long59 = iPBan57.expires;
    tp2.IP iP60 = null;
    iPBan57.ip = iP60;
    tp2.Server server62 = new tp2.Server();
    tp2.IP iP67 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b68 = server62.removeException(iP67);
    java.lang.Integer i69 = iP67.getFirst();
    iPBan57.setIp(iP67);
    boolean b71 = server50.connect(iP67);
    iP67.setFourth((java.lang.Integer)(-1));
    boolean b74 = server14.removeException(iP67);
    boolean b75 = server0.connect(iP67);
    java.lang.Integer i76 = iP67.getSecond();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i12 + "' != '" + 5+ "'", i12.equals(5));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b46 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b49 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b52 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP58);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long59 + "' != '" + 10L+ "'", long59.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b68 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i69 + "' != '" + 161+ "'", i69.equals(161));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b71 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b74 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b75 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i76 + "' != '" + (-2147483648)+ "'", i76.equals((-2147483648)));

  }

  @Test
  public void test077() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test077"); }


    tp2.Server server0 = new tp2.Server();
    tp2.IP iP1 = null;
    boolean b2 = server0.addBan(iP1);
    tp2.IP iP7 = new tp2.IP((java.lang.Integer)31, (java.lang.Integer)31, (java.lang.Integer)31, (java.lang.Integer)0);
    iP7.setSecond((java.lang.Integer)2147483647);
    boolean b10 = server0.addBan(iP7);
    tp2.Server server11 = new tp2.Server();
    tp2.IP iP12 = null;
    boolean b13 = server11.addBan(iP12);
    tp2.Server server14 = new tp2.Server();
    tp2.IP iP19 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b20 = server14.removeException(iP19);
    boolean b22 = iP19.equals((java.lang.Object)(-1L));
    boolean b23 = server11.removeBan(iP19);
    java.lang.Integer i24 = iP19.getFourth();
    boolean b25 = server0.removeBan(iP19);
    tp2.IP iP26 = null;
    tp2.IPBan iPBan28 = new tp2.IPBan(iP26, (java.lang.Long)10L);
    java.lang.Long long29 = iPBan28.getExpires();
    tp2.IP iP30 = iPBan28.getIp();
    iPBan28.setExpires((java.lang.Long)100L);
    tp2.IP iP33 = null;
    tp2.IPBan iPBan35 = new tp2.IPBan(iP33, (java.lang.Long)10L);
    java.lang.Long long36 = iPBan35.getExpires();
    tp2.IP iP41 = new tp2.IP((java.lang.Integer)31, (java.lang.Integer)31, (java.lang.Integer)31, (java.lang.Integer)0);
    iPBan35.ip = iP41;
    boolean b44 = iP41.equals((java.lang.Object)"20000000000");
    iPBan28.ip = iP41;
    iP41.setFirst((java.lang.Integer)458752);
    boolean b48 = server0.addException(iP41);
    tp2.IP iP49 = null;
    boolean b50 = server0.addBan(iP49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i24 + "' != '" + 5+ "'", i24.equals(5));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long29 + "' != '" + 10L+ "'", long29.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long36 + "' != '" + 10L+ "'", long36.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b48 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b50 == false);

  }

  @Test
  public void test078() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test078"); }


    // The following exception was thrown during execution in test generation
    try {
      java.lang.Integer i2 = java.lang.Integer.valueOf("1001010001110000", 4329604);
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test079() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test079"); }


    int i1 = java.lang.Integer.numberOfLeadingZeros(1560215407);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 1);

  }

  @Test
  public void test080() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test080"); }


    int i1 = java.lang.Integer.reverseBytes(469991460);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 612369180);

  }

  @Test
  public void test081() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test081"); }


    tp2.Server server0 = new tp2.Server();
    tp2.Server server1 = new tp2.Server();
    tp2.IP iP6 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b7 = server1.removeException(iP6);
    iP6.setThird((java.lang.Integer)56);
    tp2.IPBan iPBan11 = new tp2.IPBan(iP6, (java.lang.Long)2147483676L);
    iP6.setFirst((java.lang.Integer)16);
    boolean b14 = server0.removeBan(iP6);
    java.lang.Long long15 = null;
    tp2.IPBan iPBan16 = new tp2.IPBan(iP6, long15);
    tp2.IP iP17 = null;
    iPBan16.ip = iP17;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);

  }

  @Test
  public void test082() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test082"); }


    java.lang.String str1 = java.lang.Integer.toUnsignedString((-1342177272));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "2952790024"+ "'", str1.equals("2952790024"));

  }

  @Test
  public void test083() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test083"); }


    int i1 = java.lang.Integer.bitCount(18757859);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 13);

  }

  @Test
  public void test084() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test084"); }


    int i2 = java.lang.Integer.rotateLeft(61, 2048);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 61);

  }

  @Test
  public void test085() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test085"); }


    tp2.Server server0 = new tp2.Server();
    tp2.IP iP1 = null;
    boolean b2 = server0.addBan(iP1);
    tp2.ITime iTime3 = null;
    server0.setTime(iTime3);
    tp2.IP iP5 = null;
    tp2.IPBan iPBan7 = new tp2.IPBan(iP5, (java.lang.Long)10L);
    tp2.IP iP8 = iPBan7.getIp();
    java.lang.Long long9 = iPBan7.expires;
    tp2.IP iP10 = null;
    iPBan7.ip = iP10;
    tp2.Server server12 = new tp2.Server();
    tp2.IP iP17 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b18 = server12.removeException(iP17);
    java.lang.Integer i19 = iP17.getFirst();
    iPBan7.setIp(iP17);
    boolean b21 = server0.connect(iP17);
    tp2.Server server22 = new tp2.Server();
    tp2.IP iP27 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b28 = server22.removeException(iP27);
    server22.update();
    tp2.Server server30 = new tp2.Server();
    tp2.IP iP35 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b36 = server30.removeException(iP35);
    java.lang.Integer i37 = iP35.getFirst();
    boolean b38 = server22.addBan(iP35);
    boolean b40 = iP35.equals((java.lang.Object)(short)10);
    iP35.setSecond((java.lang.Integer)(-134217728));
    iP35.setFirst((java.lang.Integer)(-2147483592));
    boolean b45 = server0.addException(iP35);
    tp2.IPBan iPBan47 = new tp2.IPBan(iP35, (java.lang.Long)2013262563L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long9 + "' != '" + 10L+ "'", long9.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i19 + "' != '" + 161+ "'", i19.equals(161));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i37 + "' != '" + 161+ "'", i37.equals(161));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == true);

  }

  @Test
  public void test086() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test086"); }


    int i2 = java.lang.Integer.rotateLeft(630, 101011);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 330301440);

  }

  @Test
  public void test087() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test087"); }


    java.lang.Integer i1 = new java.lang.Integer("1170000000");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 1170000000+ "'", i1.equals(1170000000));

  }

  @Test
  public void test088() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test088"); }


    tp2.Server server0 = new tp2.Server();
    tp2.IP iP1 = null;
    boolean b2 = server0.addBan(iP1);
    tp2.IP iP7 = new tp2.IP((java.lang.Integer)31, (java.lang.Integer)31, (java.lang.Integer)31, (java.lang.Integer)0);
    iP7.setSecond((java.lang.Integer)2147483647);
    boolean b10 = server0.addBan(iP7);
    tp2.Server server11 = new tp2.Server();
    tp2.IP iP12 = null;
    boolean b13 = server11.addBan(iP12);
    tp2.Server server14 = new tp2.Server();
    tp2.IP iP19 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b20 = server14.removeException(iP19);
    boolean b22 = iP19.equals((java.lang.Object)(-1L));
    boolean b23 = server11.removeBan(iP19);
    java.lang.Integer i24 = iP19.getFourth();
    boolean b25 = server0.removeBan(iP19);
    server0.update();
    tp2.Server server27 = new tp2.Server();
    tp2.IP iP32 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b33 = server27.removeException(iP32);
    server27.update();
    tp2.Server server35 = new tp2.Server();
    tp2.IP iP36 = null;
    boolean b37 = server35.addBan(iP36);
    tp2.Server server38 = new tp2.Server();
    tp2.IP iP43 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b44 = server38.removeException(iP43);
    boolean b46 = iP43.equals((java.lang.Object)(-1L));
    boolean b47 = server35.removeBan(iP43);
    tp2.IP iP52 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    iP52.setFirst((java.lang.Integer)161);
    iP52.setThird((java.lang.Integer)3);
    iP52.setFirst((java.lang.Integer)26);
    boolean b59 = server35.connect(iP52);
    iP52.setSecond((java.lang.Integer)1677721761);
    boolean b62 = server27.removeBan(iP52);
    tp2.Server server63 = new tp2.Server();
    tp2.IP iP64 = null;
    boolean b65 = server63.addBan(iP64);
    tp2.ITime iTime66 = null;
    server63.setTime(iTime66);
    tp2.IP iP68 = null;
    tp2.IPBan iPBan70 = new tp2.IPBan(iP68, (java.lang.Long)10L);
    tp2.IP iP71 = iPBan70.getIp();
    java.lang.Long long72 = iPBan70.expires;
    tp2.IP iP73 = null;
    iPBan70.ip = iP73;
    tp2.Server server75 = new tp2.Server();
    tp2.IP iP80 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b81 = server75.removeException(iP80);
    java.lang.Integer i82 = iP80.getFirst();
    iPBan70.setIp(iP80);
    boolean b84 = server63.connect(iP80);
    iP80.setFourth((java.lang.Integer)(-1));
    iP80.setFourth((java.lang.Integer)(-1));
    boolean b89 = iP52.equals((java.lang.Object)iP80);
    boolean b90 = server0.removeBan(iP80);
    tp2.ITime iTime91 = null;
    server0.setTime(iTime91);
    tp2.ITime iTime93 = null;
    server0.setTime(iTime93);
    server0.update();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i24 + "' != '" + 5+ "'", i24.equals(5));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b46 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b47 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b59 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b62 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b65 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP71);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long72 + "' != '" + 10L+ "'", long72.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b81 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i82 + "' != '" + 161+ "'", i82.equals(161));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b84 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b89 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b90 == false);

  }

  @Test
  public void test089() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test089"); }


    tp2.IP iP0 = null;
    tp2.IPBan iPBan2 = new tp2.IPBan(iP0, (java.lang.Long)10L);
    tp2.IP iP3 = iPBan2.getIp();
    java.lang.Long long4 = iPBan2.expires;
    tp2.IP iP5 = null;
    iPBan2.ip = iP5;
    tp2.Server server7 = new tp2.Server();
    tp2.IP iP12 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b13 = server7.removeException(iP12);
    java.lang.Integer i14 = iP12.getFirst();
    iPBan2.setIp(iP12);
    java.lang.Integer i16 = iP12.getFirst();
    boolean b18 = iP12.equals((java.lang.Object)(short)(-1));
    tp2.IPBan iPBan20 = new tp2.IPBan(iP12, (java.lang.Long)2147483676L);
    java.lang.Integer i21 = null;
    iP12.setSecond(i21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L+ "'", long4.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i14 + "' != '" + 161+ "'", i14.equals(161));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i16 + "' != '" + 161+ "'", i16.equals(161));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);

  }

  @Test
  public void test090() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test090"); }


    // The following exception was thrown during execution in test generation
    try {
      java.lang.Integer i2 = java.lang.Integer.valueOf("1000000000000000000000000111111", 21916899);
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test091() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test091"); }


    // The following exception was thrown during execution in test generation
    try {
      int i1 = java.lang.Integer.parseUnsignedInt("11101111111111111111111010010100");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test092() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test092"); }


    // The following exception was thrown during execution in test generation
    try {
      int i1 = java.lang.Integer.parseUnsignedInt("1010000000000000000000000");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test093() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test093"); }


    korat.finitization.IFinitization iFinitization1 = tp2.Server.finServer((-1031798745));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iFinitization1);

  }

  @Test
  public void test094() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test094"); }


    // The following exception was thrown during execution in test generation
    try {
      java.lang.Integer i2 = java.lang.Integer.valueOf("", 204800000);
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test095() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test095"); }


    int i2 = java.lang.Integer.compare(7000, (-1916010497));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);

  }

  @Test
  public void test096() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test096"); }


    int i2 = java.lang.Integer.compareUnsigned(1478164480, 1879047772);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == (-1));

  }

  @Test
  public void test097() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test097"); }


    tp2.IP iP0 = null;
    tp2.IPBan iPBan2 = new tp2.IPBan(iP0, (java.lang.Long)10L);
    java.lang.Long long3 = iPBan2.getExpires();
    java.lang.Long long4 = iPBan2.expires;
    iPBan2.expires = 4160749568L;
    tp2.IP iP7 = iPBan2.getIp();
    tp2.IP iP8 = iPBan2.getIp();
    tp2.Server server9 = new tp2.Server();
    tp2.IP iP10 = null;
    boolean b11 = server9.addBan(iP10);
    tp2.IP iP16 = new tp2.IP((java.lang.Integer)31, (java.lang.Integer)31, (java.lang.Integer)31, (java.lang.Integer)0);
    iP16.setSecond((java.lang.Integer)2147483647);
    boolean b19 = server9.addBan(iP16);
    tp2.IP iP24 = new tp2.IP((java.lang.Integer)2147483647, (java.lang.Integer)(-1), (java.lang.Integer)56, (java.lang.Integer)458752);
    tp2.IPBan iPBan26 = new tp2.IPBan(iP24, (java.lang.Long)2147483676L);
    iP24.setFirst((java.lang.Integer)83);
    java.lang.Integer i29 = iP24.getFirst();
    tp2.Server server30 = new tp2.Server();
    tp2.IP iP31 = null;
    boolean b32 = server30.addBan(iP31);
    tp2.ITime iTime33 = null;
    server30.setTime(iTime33);
    tp2.IP iP35 = null;
    tp2.IPBan iPBan37 = new tp2.IPBan(iP35, (java.lang.Long)10L);
    tp2.IP iP38 = iPBan37.getIp();
    java.lang.Long long39 = iPBan37.expires;
    tp2.IP iP40 = null;
    iPBan37.ip = iP40;
    tp2.Server server42 = new tp2.Server();
    tp2.IP iP47 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b48 = server42.removeException(iP47);
    java.lang.Integer i49 = iP47.getFirst();
    iPBan37.setIp(iP47);
    iP47.setFourth((java.lang.Integer)(-2147483620));
    boolean b53 = server30.removeBan(iP47);
    server30.update();
    boolean b55 = iP24.equals((java.lang.Object)server30);
    tp2.IP iP56 = null;
    tp2.IPBan iPBan58 = new tp2.IPBan(iP56, (java.lang.Long)10L);
    tp2.IP iP59 = iPBan58.getIp();
    java.lang.Long long60 = iPBan58.expires;
    tp2.IP iP61 = null;
    iPBan58.ip = iP61;
    tp2.Server server63 = new tp2.Server();
    tp2.IP iP68 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b69 = server63.removeException(iP68);
    java.lang.Integer i70 = iP68.getFirst();
    iPBan58.setIp(iP68);
    java.lang.Integer i72 = iP68.getFirst();
    boolean b74 = iP68.equals((java.lang.Object)(short)(-1));
    boolean b75 = server30.connect(iP68);
    tp2.IP iP80 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    iP80.setFirst((java.lang.Integer)161);
    iP80.setThird((java.lang.Integer)3);
    iP80.setFirst((java.lang.Integer)26);
    iP80.setThird((java.lang.Integer)5);
    boolean b89 = server30.removeException(iP80);
    boolean b90 = server9.removeException(iP80);
    iPBan2.setIp(iP80);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L+ "'", long3.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L+ "'", long4.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i29 + "' != '" + 83+ "'", i29.equals(83));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long39 + "' != '" + 10L+ "'", long39.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b48 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i49 + "' != '" + 161+ "'", i49.equals(161));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b53 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b55 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP59);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long60 + "' != '" + 10L+ "'", long60.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b69 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i70 + "' != '" + 161+ "'", i70.equals(161));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i72 + "' != '" + 161+ "'", i72.equals(161));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b74 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b75 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b89 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b90 == false);

  }

  @Test
  public void test098() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test098"); }


    int i2 = java.lang.Integer.compareUnsigned(1100101, 8388608);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == (-1));

  }

  @Test
  public void test099() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test099"); }


    tp2.Server server0 = new tp2.Server();
    tp2.Server server1 = new tp2.Server();
    tp2.IP iP6 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b7 = server1.removeException(iP6);
    iP6.setThird((java.lang.Integer)56);
    tp2.IPBan iPBan11 = new tp2.IPBan(iP6, (java.lang.Long)2147483676L);
    iP6.setFirst((java.lang.Integer)16);
    boolean b14 = server0.removeBan(iP6);
    java.lang.Long long15 = null;
    tp2.IPBan iPBan16 = new tp2.IPBan(iP6, long15);
    tp2.IP iP17 = iPBan16.getIp();
    java.lang.Integer i18 = iP17.getThird();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i18 + "' != '" + 56+ "'", i18.equals(56));

  }

  @Test
  public void test100() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test100"); }


    java.lang.String str1 = java.lang.Integer.toHexString((-671088629));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "d800000b"+ "'", str1.equals("d800000b"));

  }

  @Test
  public void test101() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test101"); }


    // The following exception was thrown during execution in test generation
    try {
      java.lang.Integer i2 = java.lang.Integer.valueOf("777777770", 1016777372);
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test102() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test102"); }


    java.lang.String str1 = java.lang.Integer.toOctalString((-14619));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "37777743345"+ "'", str1.equals("37777743345"));

  }

  @Test
  public void test103() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test103"); }


    tp2.Server server0 = new tp2.Server();
    tp2.IP iP1 = null;
    boolean b2 = server0.addBan(iP1);
    tp2.IP iP7 = new tp2.IP((java.lang.Integer)31, (java.lang.Integer)31, (java.lang.Integer)31, (java.lang.Integer)0);
    iP7.setSecond((java.lang.Integer)2147483647);
    boolean b10 = server0.addBan(iP7);
    tp2.Server server11 = new tp2.Server();
    tp2.IP iP12 = null;
    boolean b13 = server11.addBan(iP12);
    tp2.ITime iTime14 = null;
    server11.setTime(iTime14);
    tp2.IP iP16 = null;
    tp2.IPBan iPBan18 = new tp2.IPBan(iP16, (java.lang.Long)10L);
    tp2.IP iP19 = iPBan18.getIp();
    java.lang.Long long20 = iPBan18.expires;
    tp2.IP iP21 = null;
    iPBan18.ip = iP21;
    tp2.Server server23 = new tp2.Server();
    tp2.IP iP28 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b29 = server23.removeException(iP28);
    java.lang.Integer i30 = iP28.getFirst();
    iPBan18.setIp(iP28);
    boolean b32 = server11.connect(iP28);
    boolean b33 = server0.removeBan(iP28);
    tp2.IP iP34 = null;
    tp2.IPBan iPBan36 = new tp2.IPBan(iP34, (java.lang.Long)10L);
    java.lang.Long long37 = iPBan36.getExpires();
    tp2.IP iP42 = new tp2.IP((java.lang.Integer)31, (java.lang.Integer)31, (java.lang.Integer)31, (java.lang.Integer)0);
    iPBan36.ip = iP42;
    tp2.Server server44 = new tp2.Server();
    tp2.IP iP49 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b50 = server44.removeException(iP49);
    server44.update();
    tp2.Server server52 = new tp2.Server();
    tp2.IP iP57 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b58 = server52.removeException(iP57);
    java.lang.Integer i59 = iP57.getFirst();
    boolean b60 = server44.addBan(iP57);
    iPBan36.setIp(iP57);
    boolean b62 = server0.addBan(iP57);
    tp2.IP iP63 = null;
    tp2.IPBan iPBan65 = new tp2.IPBan(iP63, (java.lang.Long)10L);
    java.lang.Long long66 = iPBan65.expires;
    java.lang.Long long67 = iPBan65.getExpires();
    tp2.IP iP68 = null;
    tp2.IPBan iPBan70 = new tp2.IPBan(iP68, (java.lang.Long)10L);
    tp2.IP iP71 = iPBan70.getIp();
    java.lang.Long long72 = iPBan70.expires;
    tp2.IP iP73 = null;
    iPBan70.ip = iP73;
    tp2.Server server75 = new tp2.Server();
    tp2.IP iP80 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b81 = server75.removeException(iP80);
    java.lang.Integer i82 = iP80.getFirst();
    iPBan70.setIp(iP80);
    java.lang.Long long84 = iPBan70.expires;
    tp2.IP iP85 = iPBan70.getIp();
    iPBan65.setIp(iP85);
    boolean b87 = server0.addException(iP85);
    iP85.setSecond((java.lang.Integer)(-2147483502));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long20 + "' != '" + 10L+ "'", long20.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i30 + "' != '" + 161+ "'", i30.equals(161));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long37 + "' != '" + 10L+ "'", long37.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b50 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b58 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i59 + "' != '" + 161+ "'", i59.equals(161));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b60 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b62 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long66 + "' != '" + 10L+ "'", long66.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long67 + "' != '" + 10L+ "'", long67.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP71);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long72 + "' != '" + 10L+ "'", long72.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b81 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i82 + "' != '" + 161+ "'", i82.equals(161));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long84 + "' != '" + 10L+ "'", long84.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP85);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b87 == true);

  }

  @Test
  public void test104() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test104"); }


    // The following exception was thrown during execution in test generation
    try {
      int i2 = java.lang.Integer.parseUnsignedInt("939524096", 1000);
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test105() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test105"); }


    tp2.IP iP4 = new tp2.IP((java.lang.Integer)1560215407, (java.lang.Integer)525611, (java.lang.Integer)510442416, (java.lang.Integer)35);

  }

  @Test
  public void test106() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test106"); }


    int i2 = java.lang.Integer.sum((-2136468991), 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == (-2136468991));

  }

  @Test
  public void test107() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test107"); }


    // The following exception was thrown during execution in test generation
    try {
      int i1 = java.lang.Integer.parseInt("1111010001100011");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test108() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test108"); }


    java.lang.Integer i2 = java.lang.Integer.getInteger("58", (java.lang.Integer)176);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i2 + "' != '" + 176+ "'", i2.equals(176));

  }

  @Test
  public void test109() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test109"); }


    tp2.Server server0 = new tp2.Server();
    tp2.IP iP1 = null;
    boolean b2 = server0.addBan(iP1);
    tp2.ITime iTime3 = null;
    server0.setTime(iTime3);
    tp2.IP iP5 = null;
    tp2.IPBan iPBan7 = new tp2.IPBan(iP5, (java.lang.Long)10L);
    tp2.IP iP8 = iPBan7.getIp();
    java.lang.Long long9 = iPBan7.expires;
    tp2.IP iP10 = null;
    iPBan7.ip = iP10;
    tp2.Server server12 = new tp2.Server();
    tp2.IP iP17 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b18 = server12.removeException(iP17);
    java.lang.Integer i19 = iP17.getFirst();
    iPBan7.setIp(iP17);
    boolean b21 = server0.connect(iP17);
    tp2.Server server22 = new tp2.Server();
    tp2.IP iP27 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b28 = server22.removeException(iP27);
    boolean b30 = iP27.equals((java.lang.Object)(-1L));
    iP27.setFourth((java.lang.Integer)28);
    boolean b33 = server0.addException(iP27);
    tp2.Server server34 = new tp2.Server();
    tp2.IP iP35 = null;
    boolean b36 = server34.addBan(iP35);
    tp2.IP iP41 = new tp2.IP((java.lang.Integer)31, (java.lang.Integer)31, (java.lang.Integer)31, (java.lang.Integer)0);
    iP41.setSecond((java.lang.Integer)2147483647);
    boolean b44 = server34.addBan(iP41);
    boolean b45 = server0.addBan(iP41);
    tp2.IP iP46 = null;
    tp2.IPBan iPBan48 = new tp2.IPBan(iP46, (java.lang.Long)10L);
    java.lang.Long long49 = iPBan48.getExpires();
    tp2.IP iP54 = new tp2.IP((java.lang.Integer)31, (java.lang.Integer)31, (java.lang.Integer)31, (java.lang.Integer)0);
    iPBan48.ip = iP54;
    java.lang.Object obj56 = null;
    boolean b57 = iP54.equals(obj56);
    boolean b58 = server0.removeBan(iP54);
    java.lang.Integer i59 = iP54.getFourth();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long9 + "' != '" + 10L+ "'", long9.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i19 + "' != '" + 161+ "'", i19.equals(161));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long49 + "' != '" + 10L+ "'", long49.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b57 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b58 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i59 + "' != '" + 0+ "'", i59.equals(0));

  }

  @Test
  public void test110() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test110"); }


    tp2.IP iP0 = null;
    tp2.IPBan iPBan2 = new tp2.IPBan(iP0, (java.lang.Long)10L);
    tp2.IP iP3 = iPBan2.getIp();
    iPBan2.expires = 0L;
    tp2.IP iP6 = iPBan2.ip;
    tp2.IP iP7 = iPBan2.getIp();
    iPBan2.setExpires((java.lang.Long)2701131776L);
    tp2.Server server10 = new tp2.Server();
    tp2.IP iP11 = null;
    boolean b12 = server10.addBan(iP11);
    tp2.Server server13 = new tp2.Server();
    tp2.IP iP18 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b19 = server13.removeException(iP18);
    boolean b21 = iP18.equals((java.lang.Object)(-1L));
    boolean b22 = server10.removeBan(iP18);
    tp2.IPBan iPBan24 = new tp2.IPBan(iP18, (java.lang.Long)(-1L));
    iPBan2.setIp(iP18);
    java.lang.Long long26 = iPBan2.expires;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long26 + "' != '" + 2701131776L+ "'", long26.equals(2701131776L));

  }

  @Test
  public void test111() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test111"); }


    // The following exception was thrown during execution in test generation
    try {
      int i2 = java.lang.Integer.parseUnsignedInt("161", (-1240662016));
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test112() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test112"); }


    java.lang.Integer i2 = null;
    // The following exception was thrown during execution in test generation
    try {
      tp2.IP iP4 = new tp2.IP((java.lang.Integer)291939, (java.lang.Integer)984514560, i2, (java.lang.Integer)2359360);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test113() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test113"); }


    int i2 = java.lang.Integer.max(10240, 352322596);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 352322596);

  }

  @Test
  public void test114() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test114"); }


    long long1 = java.lang.Integer.toUnsignedLong(352321536);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == 352321536L);

  }

  @Test
  public void test115() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test115"); }


    int i1 = java.lang.Integer.numberOfLeadingZeros((-167510016));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);

  }

  @Test
  public void test116() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test116"); }


    tp2.IP iP4 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    iP4.setFirst((java.lang.Integer)161);
    boolean b8 = iP4.equals((java.lang.Object)56);
    java.lang.Integer i9 = iP4.getFourth();
    tp2.Server server10 = new tp2.Server();
    tp2.IP iP11 = null;
    boolean b12 = server10.addBan(iP11);
    tp2.ITime iTime13 = null;
    server10.setTime(iTime13);
    tp2.IP iP15 = null;
    tp2.IPBan iPBan17 = new tp2.IPBan(iP15, (java.lang.Long)10L);
    tp2.IP iP18 = iPBan17.getIp();
    java.lang.Long long19 = iPBan17.expires;
    tp2.IP iP20 = null;
    iPBan17.ip = iP20;
    tp2.Server server22 = new tp2.Server();
    tp2.IP iP27 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b28 = server22.removeException(iP27);
    java.lang.Integer i29 = iP27.getFirst();
    iPBan17.setIp(iP27);
    boolean b31 = server10.connect(iP27);
    tp2.Server server32 = new tp2.Server();
    tp2.IP iP37 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b38 = server32.removeException(iP37);
    server32.update();
    tp2.Server server40 = new tp2.Server();
    tp2.IP iP45 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b46 = server40.removeException(iP45);
    java.lang.Integer i47 = iP45.getFirst();
    boolean b48 = server32.addBan(iP45);
    boolean b50 = iP45.equals((java.lang.Object)(short)10);
    iP45.setSecond((java.lang.Integer)(-134217728));
    iP45.setFirst((java.lang.Integer)(-2147483592));
    boolean b55 = server10.addException(iP45);
    boolean b56 = iP4.equals((java.lang.Object)iP45);
    boolean b58 = iP4.equals((java.lang.Object)"111000000000000000000000000000");
    iP4.setFirst((java.lang.Integer)11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 5+ "'", i9.equals(5));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long19 + "' != '" + 10L+ "'", long19.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i29 + "' != '" + 161+ "'", i29.equals(161));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b46 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i47 + "' != '" + 161+ "'", i47.equals(161));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b48 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b50 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b55 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b56 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b58 == false);

  }

  @Test
  public void test117() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test117"); }


    tp2.IP iP0 = null;
    tp2.IPBan iPBan2 = new tp2.IPBan(iP0, (java.lang.Long)10L);
    tp2.Server server3 = new tp2.Server();
    tp2.IP iP8 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b9 = server3.removeException(iP8);
    server3.update();
    tp2.Server server11 = new tp2.Server();
    tp2.IP iP12 = null;
    boolean b13 = server11.addBan(iP12);
    tp2.Server server14 = new tp2.Server();
    tp2.IP iP19 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b20 = server14.removeException(iP19);
    boolean b22 = iP19.equals((java.lang.Object)(-1L));
    boolean b23 = server11.removeBan(iP19);
    tp2.IP iP28 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    iP28.setFirst((java.lang.Integer)161);
    iP28.setThird((java.lang.Integer)3);
    iP28.setFirst((java.lang.Integer)26);
    boolean b35 = server11.connect(iP28);
    iP28.setSecond((java.lang.Integer)1677721761);
    boolean b38 = server3.removeBan(iP28);
    tp2.Server server39 = new tp2.Server();
    tp2.IP iP40 = null;
    boolean b41 = server39.addBan(iP40);
    tp2.ITime iTime42 = null;
    server39.setTime(iTime42);
    tp2.IP iP44 = null;
    tp2.IPBan iPBan46 = new tp2.IPBan(iP44, (java.lang.Long)10L);
    tp2.IP iP47 = iPBan46.getIp();
    java.lang.Long long48 = iPBan46.expires;
    tp2.IP iP49 = null;
    iPBan46.ip = iP49;
    tp2.Server server51 = new tp2.Server();
    tp2.IP iP56 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b57 = server51.removeException(iP56);
    java.lang.Integer i58 = iP56.getFirst();
    iPBan46.setIp(iP56);
    boolean b60 = server39.connect(iP56);
    iP56.setFourth((java.lang.Integer)(-1));
    boolean b63 = server3.removeException(iP56);
    iPBan2.ip = iP56;
    java.lang.Long long65 = iPBan2.expires;
    tp2.IP iP66 = iPBan2.getIp();
    tp2.IPBan iPBan68 = new tp2.IPBan(iP66, (java.lang.Long)51200L);
    java.lang.Integer i69 = iP66.getSecond();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long48 + "' != '" + 10L+ "'", long48.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b57 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i58 + "' != '" + 161+ "'", i58.equals(161));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b60 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b63 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long65 + "' != '" + 10L+ "'", long65.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP66);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i69 + "' != '" + (-2147483648)+ "'", i69.equals((-2147483648)));

  }

  @Test
  public void test118() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test118"); }


    tp2.IP iP0 = null;
    tp2.IPBan iPBan2 = new tp2.IPBan(iP0, (java.lang.Long)10L);
    tp2.IP iP3 = iPBan2.getIp();
    java.lang.Long long4 = iPBan2.expires;
    tp2.IP iP5 = null;
    iPBan2.ip = iP5;
    tp2.Server server7 = new tp2.Server();
    tp2.IP iP12 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b13 = server7.removeException(iP12);
    java.lang.Integer i14 = iP12.getFirst();
    iPBan2.setIp(iP12);
    iP12.setSecond((java.lang.Integer)1476395008);
    tp2.IPBan iPBan19 = new tp2.IPBan(iP12, (java.lang.Long)10L);
    tp2.Server server20 = new tp2.Server();
    tp2.IP iP25 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b26 = server20.removeException(iP25);
    iP25.setThird((java.lang.Integer)56);
    java.lang.Integer i29 = iP25.getFourth();
    java.lang.Integer i30 = null;
    iP25.setFirst(i30);
    iPBan19.ip = iP25;
    iP25.setFirst((java.lang.Integer)35320);
    boolean b36 = iP25.equals((java.lang.Object)27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L+ "'", long4.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i14 + "' != '" + 161+ "'", i14.equals(161));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i29 + "' != '" + 5+ "'", i29.equals(5));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == false);

  }

  @Test
  public void test119() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test119"); }


    tp2.IP iP4 = new tp2.IP((java.lang.Integer)69273664, (java.lang.Integer)(-855637916), (java.lang.Integer)50000010, (java.lang.Integer)1108377636);

  }

  @Test
  public void test120() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test120"); }


    // The following exception was thrown during execution in test generation
    try {
      korat.finitization.IFinitization iFinitization1 = tp2.Server.finServer(3997696);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test121() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test121"); }


    tp2.IP iP0 = null;
    tp2.IPBan iPBan2 = new tp2.IPBan(iP0, (java.lang.Long)10L);
    tp2.IP iP3 = iPBan2.getIp();
    java.lang.Long long4 = iPBan2.expires;
    tp2.Server server5 = new tp2.Server();
    tp2.IP iP10 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b11 = server5.removeException(iP10);
    java.lang.Integer i12 = iP10.getFirst();
    iPBan2.setIp(iP10);
    java.lang.Integer i14 = iP10.getThird();
    iP10.setThird((java.lang.Integer)28);
    java.lang.Integer i17 = iP10.getFourth();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L+ "'", long4.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i12 + "' != '" + 161+ "'", i12.equals(161));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i14 + "' != '" + 939524096+ "'", i14.equals(939524096));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i17 + "' != '" + 5+ "'", i17.equals(5));

  }

  @Test
  public void test122() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test122"); }


    int i2 = java.lang.Integer.sum(2114, 51380224);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 51382338);

  }

  @Test
  public void test123() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test123"); }


    long long1 = java.lang.Integer.toUnsignedLong(1072143);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == 1072143L);

  }

  @Test
  public void test124() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test124"); }


    tp2.IP iP0 = null;
    tp2.IPBan iPBan2 = new tp2.IPBan(iP0, (java.lang.Long)10L);
    tp2.IP iP3 = iPBan2.getIp();
    java.lang.Long long4 = iPBan2.expires;
    tp2.IP iP5 = null;
    iPBan2.ip = iP5;
    iPBan2.setExpires((java.lang.Long)(-1L));
    java.lang.Long long9 = iPBan2.getExpires();
    tp2.IP iP10 = iPBan2.getIp();
    iPBan2.setExpires((java.lang.Long)3855024127L);
    java.lang.Long long13 = iPBan2.getExpires();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L+ "'", long4.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L)+ "'", long9.equals((-1L)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long13 + "' != '" + 3855024127L+ "'", long13.equals(3855024127L));

  }

  @Test
  public void test125() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test125"); }


    int i2 = java.lang.Integer.rotateLeft(35320, 90697216);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 35320);

  }

  @Test
  public void test126() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test126"); }


    // The following exception was thrown during execution in test generation
    try {
      int i2 = java.lang.Integer.parseUnsignedInt("35320", 20320);
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test127() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test127"); }


    tp2.Server server0 = new tp2.Server();
    tp2.IP iP5 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b6 = server0.removeException(iP5);
    server0.update();
    tp2.Server server8 = new tp2.Server();
    tp2.IP iP9 = null;
    boolean b10 = server8.addBan(iP9);
    tp2.Server server11 = new tp2.Server();
    tp2.IP iP16 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b17 = server11.removeException(iP16);
    boolean b19 = iP16.equals((java.lang.Object)(-1L));
    boolean b20 = server8.removeBan(iP16);
    tp2.IP iP25 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    iP25.setFirst((java.lang.Integer)161);
    iP25.setThird((java.lang.Integer)3);
    iP25.setFirst((java.lang.Integer)26);
    boolean b32 = server8.connect(iP25);
    iP25.setSecond((java.lang.Integer)1677721761);
    boolean b35 = server0.removeBan(iP25);
    tp2.Server server36 = new tp2.Server();
    tp2.IP iP37 = null;
    boolean b38 = server36.addBan(iP37);
    server36.update();
    tp2.Server server40 = new tp2.Server();
    tp2.IP iP41 = null;
    boolean b42 = server40.addBan(iP41);
    tp2.ITime iTime43 = null;
    server40.setTime(iTime43);
    tp2.IP iP45 = null;
    tp2.IPBan iPBan47 = new tp2.IPBan(iP45, (java.lang.Long)10L);
    tp2.IP iP48 = iPBan47.getIp();
    java.lang.Long long49 = iPBan47.expires;
    tp2.IP iP50 = null;
    iPBan47.ip = iP50;
    tp2.Server server52 = new tp2.Server();
    tp2.IP iP57 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b58 = server52.removeException(iP57);
    java.lang.Integer i59 = iP57.getFirst();
    iPBan47.setIp(iP57);
    iP57.setFourth((java.lang.Integer)(-2147483620));
    boolean b63 = server40.removeBan(iP57);
    boolean b64 = server36.addException(iP57);
    boolean b65 = server0.removeBan(iP57);
    java.lang.Integer i66 = iP57.getSecond();
    java.lang.Object obj67 = null;
    boolean b68 = iP57.equals(obj67);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long49 + "' != '" + 10L+ "'", long49.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b58 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i59 + "' != '" + 161+ "'", i59.equals(161));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b63 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b64 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b65 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i66 + "' != '" + (-2147483648)+ "'", i66.equals((-2147483648)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b68 == false);

  }

  @Test
  public void test128() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test128"); }


    java.lang.String str1 = java.lang.Integer.toOctalString(1587430);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "6034346"+ "'", str1.equals("6034346"));

  }

  @Test
  public void test129() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test129"); }


    tp2.Server server0 = new tp2.Server();
    tp2.IP iP1 = null;
    boolean b2 = server0.connect(iP1);
    tp2.IP iP7 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)83, (java.lang.Integer)26, (java.lang.Integer)100);
    boolean b8 = server0.addBan(iP7);
    iP7.setFirst((java.lang.Integer)133);
    java.lang.Integer i11 = iP7.getFirst();
    iP7.setFourth((java.lang.Integer)(-2063597456));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i11 + "' != '" + 133+ "'", i11.equals(133));

  }

  @Test
  public void test130() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test130"); }


    tp2.Server server0 = new tp2.Server();
    tp2.IP iP1 = null;
    boolean b2 = server0.addBan(iP1);
    tp2.IP iP7 = new tp2.IP((java.lang.Integer)31, (java.lang.Integer)31, (java.lang.Integer)31, (java.lang.Integer)0);
    iP7.setSecond((java.lang.Integer)2147483647);
    boolean b10 = server0.addBan(iP7);
    tp2.IP iP11 = null;
    tp2.IPBan iPBan13 = new tp2.IPBan(iP11, (java.lang.Long)10L);
    tp2.Server server14 = new tp2.Server();
    tp2.IP iP19 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b20 = server14.removeException(iP19);
    server14.update();
    tp2.Server server22 = new tp2.Server();
    tp2.IP iP23 = null;
    boolean b24 = server22.addBan(iP23);
    tp2.Server server25 = new tp2.Server();
    tp2.IP iP30 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b31 = server25.removeException(iP30);
    boolean b33 = iP30.equals((java.lang.Object)(-1L));
    boolean b34 = server22.removeBan(iP30);
    tp2.IP iP39 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    iP39.setFirst((java.lang.Integer)161);
    iP39.setThird((java.lang.Integer)3);
    iP39.setFirst((java.lang.Integer)26);
    boolean b46 = server22.connect(iP39);
    iP39.setSecond((java.lang.Integer)1677721761);
    boolean b49 = server14.removeBan(iP39);
    tp2.Server server50 = new tp2.Server();
    tp2.IP iP51 = null;
    boolean b52 = server50.addBan(iP51);
    tp2.ITime iTime53 = null;
    server50.setTime(iTime53);
    tp2.IP iP55 = null;
    tp2.IPBan iPBan57 = new tp2.IPBan(iP55, (java.lang.Long)10L);
    tp2.IP iP58 = iPBan57.getIp();
    java.lang.Long long59 = iPBan57.expires;
    tp2.IP iP60 = null;
    iPBan57.ip = iP60;
    tp2.Server server62 = new tp2.Server();
    tp2.IP iP67 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b68 = server62.removeException(iP67);
    java.lang.Integer i69 = iP67.getFirst();
    iPBan57.setIp(iP67);
    boolean b71 = server50.connect(iP67);
    iP67.setFourth((java.lang.Integer)(-1));
    boolean b74 = server14.removeException(iP67);
    iPBan13.ip = iP67;
    boolean b76 = server0.removeBan(iP67);
    iP67.setFirst((java.lang.Integer)28672);
    iP67.setThird((java.lang.Integer)35320);
    iP67.setFourth((java.lang.Integer)469762049);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b46 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b49 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b52 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP58);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long59 + "' != '" + 10L+ "'", long59.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b68 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i69 + "' != '" + 161+ "'", i69.equals(161));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b71 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b74 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b76 == false);

  }

  @Test
  public void test131() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test131"); }


    tp2.Server server0 = new tp2.Server();
    tp2.IP iP1 = null;
    boolean b2 = server0.addBan(iP1);
    tp2.Server server3 = new tp2.Server();
    tp2.IP iP8 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b9 = server3.removeException(iP8);
    boolean b11 = iP8.equals((java.lang.Object)(-1L));
    boolean b12 = server0.removeBan(iP8);
    server0.update();
    tp2.IP iP18 = new tp2.IP((java.lang.Integer)740, (java.lang.Integer)2, (java.lang.Integer)268435456, (java.lang.Integer)229376);
    boolean b19 = server0.addException(iP18);
    server0.update();
    tp2.IP iP21 = null;
    tp2.IPBan iPBan23 = new tp2.IPBan(iP21, (java.lang.Long)10L);
    tp2.IP iP24 = iPBan23.getIp();
    tp2.IP iP29 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    iP29.setFirst((java.lang.Integer)161);
    iP29.setThird((java.lang.Integer)3);
    iP29.setFirst((java.lang.Integer)26);
    iPBan23.ip = iP29;
    iP29.setSecond((java.lang.Integer)15);
    java.lang.Integer i39 = iP29.getSecond();
    iP29.setFirst((java.lang.Integer)60408026);
    boolean b42 = server0.removeException(iP29);
    tp2.IP iP47 = new tp2.IP((java.lang.Integer)1023410176, (java.lang.Integer)1073741825, (java.lang.Integer)458752, (java.lang.Integer)26);
    iP47.setFirst((java.lang.Integer)5832);
    boolean b50 = server0.removeBan(iP47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i39 + "' != '" + 15+ "'", i39.equals(15));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b50 == false);

  }

  @Test
  public void test132() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test132"); }


    int i1 = java.lang.Integer.bitCount(1074069504);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 3);

  }

  @Test
  public void test133() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test133"); }


    java.lang.String str1 = java.lang.Integer.toBinaryString(512);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "1000000000"+ "'", str1.equals("1000000000"));

  }

  @Test
  public void test134() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test134"); }


    tp2.Server server0 = new tp2.Server();
    tp2.IP iP5 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b6 = server0.removeException(iP5);
    server0.update();
    tp2.Server server8 = new tp2.Server();
    tp2.IP iP9 = null;
    boolean b10 = server8.addBan(iP9);
    tp2.Server server11 = new tp2.Server();
    tp2.IP iP16 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b17 = server11.removeException(iP16);
    boolean b19 = iP16.equals((java.lang.Object)(-1L));
    boolean b20 = server8.removeBan(iP16);
    tp2.IP iP25 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    iP25.setFirst((java.lang.Integer)161);
    iP25.setThird((java.lang.Integer)3);
    iP25.setFirst((java.lang.Integer)26);
    boolean b32 = server8.connect(iP25);
    iP25.setSecond((java.lang.Integer)1677721761);
    boolean b35 = server0.removeBan(iP25);
    tp2.Server server36 = new tp2.Server();
    tp2.Server server37 = new tp2.Server();
    tp2.IP iP38 = null;
    boolean b39 = server37.addBan(iP38);
    tp2.IP iP44 = new tp2.IP((java.lang.Integer)31, (java.lang.Integer)31, (java.lang.Integer)31, (java.lang.Integer)0);
    iP44.setSecond((java.lang.Integer)2147483647);
    boolean b47 = server37.addBan(iP44);
    tp2.Server server48 = new tp2.Server();
    tp2.IP iP49 = null;
    boolean b50 = server48.addBan(iP49);
    tp2.ITime iTime51 = null;
    server48.setTime(iTime51);
    tp2.IP iP53 = null;
    tp2.IPBan iPBan55 = new tp2.IPBan(iP53, (java.lang.Long)10L);
    tp2.IP iP56 = iPBan55.getIp();
    java.lang.Long long57 = iPBan55.expires;
    tp2.IP iP58 = null;
    iPBan55.ip = iP58;
    tp2.Server server60 = new tp2.Server();
    tp2.IP iP65 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b66 = server60.removeException(iP65);
    java.lang.Integer i67 = iP65.getFirst();
    iPBan55.setIp(iP65);
    boolean b69 = server48.connect(iP65);
    boolean b70 = server37.removeBan(iP65);
    boolean b71 = server36.addBan(iP65);
    iP65.setFourth((java.lang.Integer)1476395008);
    boolean b74 = server0.addException(iP65);
    tp2.IP iP79 = new tp2.IP((java.lang.Integer)31, (java.lang.Integer)(-2147483592), (java.lang.Integer)133, (java.lang.Integer)(-2147483646));
    iP79.setFourth((java.lang.Integer)79);
    boolean b82 = server0.addException(iP79);
    tp2.ITime iTime83 = null;
    server0.setTime(iTime83);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b47 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b50 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long57 + "' != '" + 10L+ "'", long57.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b66 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i67 + "' != '" + 161+ "'", i67.equals(161));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b69 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b70 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b71 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b74 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b82 == true);

  }

  @Test
  public void test135() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test135"); }


    int i1 = java.lang.Integer.highestOneBit(73728);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 65536);

  }

  @Test
  public void test136() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test136"); }


    tp2.IP iP0 = null;
    tp2.IPBan iPBan2 = new tp2.IPBan(iP0, (java.lang.Long)10L);
    tp2.IP iP3 = iPBan2.getIp();
    java.lang.Long long4 = iPBan2.expires;
    tp2.Server server5 = new tp2.Server();
    tp2.IP iP10 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b11 = server5.removeException(iP10);
    java.lang.Integer i12 = iP10.getFirst();
    iPBan2.setIp(iP10);
    tp2.IP iP14 = iPBan2.ip;
    tp2.IP iP15 = null;
    tp2.IPBan iPBan17 = new tp2.IPBan(iP15, (java.lang.Long)10L);
    java.lang.Long long18 = iPBan17.getExpires();
    tp2.IP iP23 = new tp2.IP((java.lang.Integer)31, (java.lang.Integer)31, (java.lang.Integer)31, (java.lang.Integer)0);
    iPBan17.ip = iP23;
    iP23.setFirst((java.lang.Integer)2);
    iPBan2.setIp(iP23);
    tp2.Server server28 = new tp2.Server();
    tp2.IP iP29 = null;
    boolean b30 = server28.addBan(iP29);
    tp2.Server server31 = new tp2.Server();
    tp2.IP iP36 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b37 = server31.removeException(iP36);
    boolean b39 = iP36.equals((java.lang.Object)(-1L));
    boolean b40 = server28.removeBan(iP36);
    iPBan2.ip = iP36;
    java.lang.Long long42 = iPBan2.getExpires();
    java.lang.Long long43 = iPBan2.getExpires();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L+ "'", long4.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i12 + "' != '" + 161+ "'", i12.equals(161));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long18 + "' != '" + 10L+ "'", long18.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long42 + "' != '" + 10L+ "'", long42.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long43 + "' != '" + 10L+ "'", long43.equals(10L));

  }

  @Test
  public void test137() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test137"); }


    tp2.Server server0 = new tp2.Server();
    tp2.IP iP5 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b6 = server0.removeException(iP5);
    server0.update();
    tp2.Server server8 = new tp2.Server();
    tp2.IP iP13 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b14 = server8.removeException(iP13);
    java.lang.Integer i15 = iP13.getFirst();
    boolean b16 = server0.addBan(iP13);
    tp2.IP iP21 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    iP21.setFirst((java.lang.Integer)161);
    boolean b25 = iP21.equals((java.lang.Object)56);
    boolean b26 = server0.connect(iP21);
    java.lang.Integer i27 = iP21.getSecond();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i15 + "' != '" + 161+ "'", i15.equals(161));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i27 + "' != '" + (-2147483648)+ "'", i27.equals((-2147483648)));

  }

  @Test
  public void test138() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test138"); }


    java.lang.Integer i2 = java.lang.Integer.getInteger("3000000000", 974576384);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i2 + "' != '" + 974576384+ "'", i2.equals(974576384));

  }

  @Test
  public void test139() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test139"); }


    java.lang.String str2 = java.lang.Integer.toUnsignedString(67109120, (-855637916));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "67109120"+ "'", str2.equals("67109120"));

  }

  @Test
  public void test140() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test140"); }


    tp2.IP iP0 = null;
    tp2.IPBan iPBan2 = new tp2.IPBan(iP0, (java.lang.Long)10L);
    tp2.IP iP3 = iPBan2.getIp();
    tp2.IP iP8 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    iP8.setFirst((java.lang.Integer)161);
    iP8.setThird((java.lang.Integer)3);
    iP8.setFirst((java.lang.Integer)26);
    iPBan2.ip = iP8;
    iP8.setSecond((java.lang.Integer)15);
    java.lang.Integer i18 = iP8.getSecond();
    iP8.setFirst((java.lang.Integer)1107820544);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i18 + "' != '" + 15+ "'", i18.equals(15));

  }

  @Test
  public void test141() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test141"); }


    // The following exception was thrown during execution in test generation
    try {
      int i1 = java.lang.Integer.parseInt("11000000010000000000000000");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test142() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test142"); }


    tp2.Server server0 = new tp2.Server();
    tp2.IP iP5 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b6 = server0.removeException(iP5);
    iP5.setThird((java.lang.Integer)56);
    java.lang.Integer i9 = iP5.getFourth();
    iP5.setThird((java.lang.Integer)(-1593835520));
    iP5.setFirst((java.lang.Integer)1100101);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 5+ "'", i9.equals(5));

  }

  @Test
  public void test143() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test143"); }


    tp2.Server server0 = new tp2.Server();
    tp2.IP iP1 = null;
    boolean b2 = server0.addBan(iP1);
    tp2.IP iP7 = new tp2.IP((java.lang.Integer)31, (java.lang.Integer)31, (java.lang.Integer)31, (java.lang.Integer)0);
    iP7.setSecond((java.lang.Integer)2147483647);
    boolean b10 = server0.addBan(iP7);
    tp2.Server server11 = new tp2.Server();
    tp2.IP iP12 = null;
    boolean b13 = server11.addBan(iP12);
    tp2.ITime iTime14 = null;
    server11.setTime(iTime14);
    tp2.IP iP16 = null;
    tp2.IPBan iPBan18 = new tp2.IPBan(iP16, (java.lang.Long)10L);
    tp2.IP iP19 = iPBan18.getIp();
    java.lang.Long long20 = iPBan18.expires;
    tp2.IP iP21 = null;
    iPBan18.ip = iP21;
    tp2.Server server23 = new tp2.Server();
    tp2.IP iP28 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b29 = server23.removeException(iP28);
    java.lang.Integer i30 = iP28.getFirst();
    iPBan18.setIp(iP28);
    boolean b32 = server11.connect(iP28);
    boolean b33 = server0.removeBan(iP28);
    tp2.ITime iTime34 = null;
    server0.setTime(iTime34);
    server0.update();
    tp2.IP iP37 = null;
    tp2.IPBan iPBan39 = new tp2.IPBan(iP37, (java.lang.Long)10L);
    tp2.IP iP40 = iPBan39.getIp();
    java.lang.Long long41 = iPBan39.expires;
    tp2.IP iP42 = null;
    iPBan39.ip = iP42;
    tp2.IP iP44 = null;
    tp2.IPBan iPBan46 = new tp2.IPBan(iP44, (java.lang.Long)10L);
    tp2.IP iP47 = iPBan46.getIp();
    java.lang.Long long48 = iPBan46.expires;
    tp2.Server server49 = new tp2.Server();
    tp2.IP iP54 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b55 = server49.removeException(iP54);
    java.lang.Integer i56 = iP54.getFirst();
    iPBan46.setIp(iP54);
    tp2.IP iP58 = iPBan46.ip;
    tp2.IP iP59 = iPBan46.getIp();
    iPBan39.setIp(iP59);
    tp2.IP iP65 = new tp2.IP((java.lang.Integer)31, (java.lang.Integer)(-2147483592), (java.lang.Integer)133, (java.lang.Integer)(-2147483646));
    iPBan39.setIp(iP65);
    boolean b67 = server0.removeBan(iP65);
    server0.update();
    tp2.IP iP73 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)2, (java.lang.Integer)38000, (java.lang.Integer)32);
    java.lang.Integer i74 = iP73.getFirst();
    boolean b75 = server0.removeBan(iP73);
    tp2.ITime iTime76 = null;
    server0.setTime(iTime76);
    tp2.ITime iTime78 = null;
    server0.setTime(iTime78);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long20 + "' != '" + 10L+ "'", long20.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i30 + "' != '" + 161+ "'", i30.equals(161));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long41 + "' != '" + 10L+ "'", long41.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long48 + "' != '" + 10L+ "'", long48.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b55 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i56 + "' != '" + 161+ "'", i56.equals(161));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP58);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP59);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b67 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i74 + "' != '" + (-1)+ "'", i74.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b75 == false);

  }

  @Test
  public void test144() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test144"); }


    int i1 = java.lang.Integer.parseUnsignedInt("234881056");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 234881056);

  }

  @Test
  public void test145() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test145"); }


    tp2.IP iP0 = null;
    tp2.IPBan iPBan2 = new tp2.IPBan(iP0, (java.lang.Long)10L);
    tp2.IP iP3 = iPBan2.getIp();
    java.lang.Long long4 = iPBan2.expires;
    tp2.Server server5 = new tp2.Server();
    tp2.IP iP10 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b11 = server5.removeException(iP10);
    java.lang.Integer i12 = iP10.getFirst();
    iPBan2.setIp(iP10);
    tp2.IP iP14 = iPBan2.ip;
    java.lang.Long long15 = iPBan2.expires;
    tp2.IP iP16 = iPBan2.getIp();
    tp2.Server server17 = new tp2.Server();
    tp2.IP iP18 = null;
    boolean b19 = server17.addBan(iP18);
    tp2.IP iP24 = new tp2.IP((java.lang.Integer)31, (java.lang.Integer)31, (java.lang.Integer)31, (java.lang.Integer)0);
    iP24.setSecond((java.lang.Integer)2147483647);
    boolean b27 = server17.addBan(iP24);
    iP24.setFirst((java.lang.Integer)939524096);
    java.lang.Integer i30 = iP24.getSecond();
    iP24.setFourth((java.lang.Integer)(-1067699647));
    iPBan2.setIp(iP24);
    boolean b35 = iP24.equals((java.lang.Object)23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L+ "'", long4.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i12 + "' != '" + 161+ "'", i12.equals(161));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long15 + "' != '" + 10L+ "'", long15.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i30 + "' != '" + 2147483647+ "'", i30.equals(2147483647));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == false);

  }

  @Test
  public void test146() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test146"); }


    tp2.IP iP4 = new tp2.IP((java.lang.Integer)100004, (java.lang.Integer)2, (java.lang.Integer)1400000, (java.lang.Integer)841);
    tp2.IPBan iPBan6 = new tp2.IPBan(iP4, (java.lang.Long)1677721600L);
    java.lang.Long long7 = iPBan6.expires;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1677721600L+ "'", long7.equals(1677721600L));

  }

  @Test
  public void test147() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test147"); }


    tp2.Server server0 = new tp2.Server();
    tp2.IP iP1 = null;
    boolean b2 = server0.addBan(iP1);
    tp2.ITime iTime3 = null;
    server0.setTime(iTime3);
    tp2.IP iP5 = null;
    tp2.IPBan iPBan7 = new tp2.IPBan(iP5, (java.lang.Long)10L);
    tp2.IP iP8 = iPBan7.getIp();
    java.lang.Long long9 = iPBan7.expires;
    tp2.IP iP10 = null;
    iPBan7.ip = iP10;
    tp2.Server server12 = new tp2.Server();
    tp2.IP iP17 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b18 = server12.removeException(iP17);
    java.lang.Integer i19 = iP17.getFirst();
    iPBan7.setIp(iP17);
    boolean b21 = server0.connect(iP17);
    server0.update();
    tp2.Server server23 = new tp2.Server();
    tp2.IP iP24 = null;
    boolean b25 = server23.addBan(iP24);
    tp2.ITime iTime26 = null;
    server23.setTime(iTime26);
    tp2.IP iP28 = null;
    tp2.IPBan iPBan30 = new tp2.IPBan(iP28, (java.lang.Long)10L);
    tp2.IP iP31 = iPBan30.getIp();
    java.lang.Long long32 = iPBan30.expires;
    tp2.IP iP33 = null;
    iPBan30.ip = iP33;
    tp2.Server server35 = new tp2.Server();
    tp2.IP iP40 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b41 = server35.removeException(iP40);
    java.lang.Integer i42 = iP40.getFirst();
    iPBan30.setIp(iP40);
    iP40.setFourth((java.lang.Integer)(-2147483620));
    boolean b46 = server23.removeBan(iP40);
    java.lang.Integer i47 = iP40.getFirst();
    java.lang.Integer i48 = iP40.getSecond();
    boolean b49 = server0.removeBan(iP40);
    server0.update();
    tp2.Server server51 = new tp2.Server();
    tp2.IP iP56 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b57 = server51.removeException(iP56);
    java.lang.Integer i58 = iP56.getThird();
    boolean b59 = server0.connect(iP56);
    tp2.IP iP60 = null;
    tp2.IPBan iPBan62 = new tp2.IPBan(iP60, (java.lang.Long)10L);
    java.lang.Long long63 = iPBan62.getExpires();
    tp2.Server server64 = new tp2.Server();
    tp2.IP iP65 = null;
    boolean b66 = server64.addBan(iP65);
    tp2.Server server67 = new tp2.Server();
    tp2.IP iP72 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b73 = server67.removeException(iP72);
    boolean b75 = iP72.equals((java.lang.Object)(-1L));
    boolean b76 = server64.removeBan(iP72);
    tp2.IPBan iPBan78 = new tp2.IPBan(iP72, (java.lang.Long)(-1L));
    iP72.setSecond((java.lang.Integer)(-439943169));
    iP72.setFourth((java.lang.Integer)69273664);
    iPBan62.setIp(iP72);
    iP72.setFourth((java.lang.Integer)51211);
    boolean b86 = server0.removeException(iP72);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long9 + "' != '" + 10L+ "'", long9.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i19 + "' != '" + 161+ "'", i19.equals(161));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long32 + "' != '" + 10L+ "'", long32.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i42 + "' != '" + 161+ "'", i42.equals(161));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b46 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i47 + "' != '" + 161+ "'", i47.equals(161));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i48 + "' != '" + (-2147483648)+ "'", i48.equals((-2147483648)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b49 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b57 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i58 + "' != '" + 939524096+ "'", i58.equals(939524096));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b59 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long63 + "' != '" + 10L+ "'", long63.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b66 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b73 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b75 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b76 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b86 == false);

  }

  @Test
  public void test148() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test148"); }


    tp2.IP iP0 = null;
    tp2.IPBan iPBan2 = new tp2.IPBan(iP0, (java.lang.Long)10L);
    tp2.IP iP3 = iPBan2.getIp();
    java.lang.Long long4 = iPBan2.expires;
    tp2.IP iP5 = null;
    iPBan2.ip = iP5;
    tp2.Server server7 = new tp2.Server();
    tp2.IP iP8 = null;
    boolean b9 = server7.addBan(iP8);
    tp2.ITime iTime10 = null;
    server7.setTime(iTime10);
    tp2.IP iP12 = null;
    tp2.IPBan iPBan14 = new tp2.IPBan(iP12, (java.lang.Long)10L);
    tp2.IP iP15 = iPBan14.getIp();
    java.lang.Long long16 = iPBan14.expires;
    tp2.IP iP17 = null;
    iPBan14.ip = iP17;
    tp2.Server server19 = new tp2.Server();
    tp2.IP iP24 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b25 = server19.removeException(iP24);
    java.lang.Integer i26 = iP24.getFirst();
    iPBan14.setIp(iP24);
    boolean b28 = server7.connect(iP24);
    iPBan2.setIp(iP24);
    iP24.setThird((java.lang.Integer)1023410176);
    tp2.IPBan iPBan33 = new tp2.IPBan(iP24, (java.lang.Long)2147483647L);
    java.lang.Integer i34 = iP24.getFirst();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L+ "'", long4.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long16 + "' != '" + 10L+ "'", long16.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i26 + "' != '" + 161+ "'", i26.equals(161));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i34 + "' != '" + 161+ "'", i34.equals(161));

  }

  @Test
  public void test149() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test149"); }


    int i1 = java.lang.Integer.reverse(1677721761);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == (-2063597530));

  }

  @Test
  public void test150() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test150"); }


    int i1 = java.lang.Integer.parseUnsignedInt("6446");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 6446);

  }

  @Test
  public void test151() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test151"); }


    java.lang.Integer i1 = java.lang.Integer.getInteger("2362614");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);

  }

  @Test
  public void test152() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test152"); }


    tp2.Server server0 = new tp2.Server();
    tp2.IP iP1 = null;
    boolean b2 = server0.addBan(iP1);
    tp2.IP iP7 = new tp2.IP((java.lang.Integer)31, (java.lang.Integer)31, (java.lang.Integer)31, (java.lang.Integer)0);
    iP7.setSecond((java.lang.Integer)2147483647);
    boolean b10 = server0.addBan(iP7);
    tp2.IP iP15 = new tp2.IP((java.lang.Integer)133, (java.lang.Integer)(-2147483515), (java.lang.Integer)79, (java.lang.Integer)(-2147483620));
    boolean b16 = server0.removeBan(iP15);
    tp2.IP iP17 = null;
    tp2.IPBan iPBan19 = new tp2.IPBan(iP17, (java.lang.Long)10L);
    java.lang.Long long20 = iPBan19.getExpires();
    tp2.IP iP25 = new tp2.IP((java.lang.Integer)31, (java.lang.Integer)31, (java.lang.Integer)31, (java.lang.Integer)0);
    iPBan19.ip = iP25;
    tp2.Server server27 = new tp2.Server();
    tp2.IP iP32 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b33 = server27.removeException(iP32);
    server27.update();
    tp2.Server server35 = new tp2.Server();
    tp2.IP iP40 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b41 = server35.removeException(iP40);
    java.lang.Integer i42 = iP40.getFirst();
    boolean b43 = server27.addBan(iP40);
    iPBan19.setIp(iP40);
    tp2.IP iP45 = iPBan19.ip;
    tp2.IP iP46 = iPBan19.ip;
    boolean b47 = server0.removeException(iP46);
    tp2.IP iP48 = null;
    tp2.IPBan iPBan50 = new tp2.IPBan(iP48, (java.lang.Long)10L);
    tp2.IP iP51 = iPBan50.getIp();
    java.lang.Long long52 = iPBan50.expires;
    tp2.IP iP53 = null;
    iPBan50.ip = iP53;
    tp2.Server server55 = new tp2.Server();
    tp2.IP iP56 = null;
    boolean b57 = server55.addBan(iP56);
    tp2.ITime iTime58 = null;
    server55.setTime(iTime58);
    tp2.IP iP60 = null;
    tp2.IPBan iPBan62 = new tp2.IPBan(iP60, (java.lang.Long)10L);
    tp2.IP iP63 = iPBan62.getIp();
    java.lang.Long long64 = iPBan62.expires;
    tp2.IP iP65 = null;
    iPBan62.ip = iP65;
    tp2.Server server67 = new tp2.Server();
    tp2.IP iP72 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b73 = server67.removeException(iP72);
    java.lang.Integer i74 = iP72.getFirst();
    iPBan62.setIp(iP72);
    boolean b76 = server55.connect(iP72);
    iPBan50.setIp(iP72);
    boolean b78 = server0.removeBan(iP72);
    tp2.IP iP83 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    iP83.setFirst((java.lang.Integer)161);
    iP83.setThird((java.lang.Integer)3);
    boolean b89 = iP83.equals((java.lang.Object)469761943);
    boolean b90 = server0.connect(iP83);
    iP83.setFourth((java.lang.Integer)395165525);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long20 + "' != '" + 10L+ "'", long20.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i42 + "' != '" + 161+ "'", i42.equals(161));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b43 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b47 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long52 + "' != '" + 10L+ "'", long52.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b57 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP63);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long64 + "' != '" + 10L+ "'", long64.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b73 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i74 + "' != '" + 161+ "'", i74.equals(161));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b76 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b78 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b89 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b90 == true);

  }

  @Test
  public void test153() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test153"); }


    int i2 = java.lang.Integer.rotateRight(1245184, 638386176);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1245184);

  }

  @Test
  public void test154() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test154"); }


    int i1 = java.lang.Integer.bitCount(5211392);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 8);

  }

  @Test
  public void test155() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test155"); }


    int i2 = java.lang.Integer.max(1638400, 15505008);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 15505008);

  }

  @Test
  public void test156() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test156"); }


    tp2.IP iP4 = new tp2.IP((java.lang.Integer)11585, (java.lang.Integer)(-1342174080), (java.lang.Integer)67108864, (java.lang.Integer)1073741905);

  }

  @Test
  public void test157() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test157"); }


    tp2.Server server0 = new tp2.Server();
    tp2.IP iP1 = null;
    boolean b2 = server0.addBan(iP1);
    tp2.Server server3 = new tp2.Server();
    tp2.IP iP8 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b9 = server3.removeException(iP8);
    boolean b11 = iP8.equals((java.lang.Object)(-1L));
    boolean b12 = server0.removeBan(iP8);
    tp2.IP iP17 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    iP17.setFirst((java.lang.Integer)161);
    iP17.setThird((java.lang.Integer)3);
    iP17.setFirst((java.lang.Integer)26);
    boolean b24 = server0.connect(iP17);
    tp2.ITime iTime25 = null;
    server0.setTime(iTime25);
    tp2.IP iP27 = null;
    tp2.IPBan iPBan29 = new tp2.IPBan(iP27, (java.lang.Long)10L);
    java.lang.Long long30 = iPBan29.getExpires();
    tp2.IP iP31 = iPBan29.getIp();
    iPBan29.setExpires((java.lang.Long)100L);
    tp2.IP iP34 = null;
    tp2.IPBan iPBan36 = new tp2.IPBan(iP34, (java.lang.Long)10L);
    java.lang.Long long37 = iPBan36.getExpires();
    tp2.IP iP42 = new tp2.IP((java.lang.Integer)31, (java.lang.Integer)31, (java.lang.Integer)31, (java.lang.Integer)0);
    iPBan36.ip = iP42;
    boolean b45 = iP42.equals((java.lang.Object)"20000000000");
    iPBan29.ip = iP42;
    iPBan29.expires = 2147483676L;
    tp2.IP iP49 = iPBan29.ip;
    boolean b50 = server0.addException(iP49);
    tp2.ITime iTime51 = null;
    server0.setTime(iTime51);
    server0.update();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long30 + "' != '" + 10L+ "'", long30.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long37 + "' != '" + 10L+ "'", long37.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b50 == true);

  }

  @Test
  public void test158() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test158"); }


    tp2.Server server0 = new tp2.Server();
    tp2.IP iP5 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b6 = server0.removeException(iP5);
    server0.update();
    tp2.Server server8 = new tp2.Server();
    tp2.IP iP9 = null;
    boolean b10 = server8.addBan(iP9);
    tp2.Server server11 = new tp2.Server();
    tp2.IP iP16 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b17 = server11.removeException(iP16);
    boolean b19 = iP16.equals((java.lang.Object)(-1L));
    boolean b20 = server8.removeBan(iP16);
    tp2.IP iP25 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    iP25.setFirst((java.lang.Integer)161);
    iP25.setThird((java.lang.Integer)3);
    iP25.setFirst((java.lang.Integer)26);
    boolean b32 = server8.connect(iP25);
    iP25.setSecond((java.lang.Integer)1677721761);
    boolean b35 = server0.removeBan(iP25);
    tp2.Server server36 = new tp2.Server();
    tp2.IP iP41 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b42 = server36.removeException(iP41);
    server36.update();
    tp2.IP iP44 = null;
    tp2.IPBan iPBan46 = new tp2.IPBan(iP44, (java.lang.Long)10L);
    tp2.IP iP47 = iPBan46.ip;
    tp2.Server server48 = new tp2.Server();
    tp2.IP iP49 = null;
    boolean b50 = server48.addBan(iP49);
    tp2.Server server51 = new tp2.Server();
    tp2.IP iP56 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b57 = server51.removeException(iP56);
    boolean b59 = iP56.equals((java.lang.Object)(-1L));
    boolean b60 = server48.removeBan(iP56);
    iPBan46.ip = iP56;
    boolean b62 = server36.removeException(iP56);
    boolean b63 = server0.removeException(iP56);
    java.lang.Integer i64 = null;
    iP56.setThird(i64);
    tp2.IPBan iPBan67 = new tp2.IPBan(iP56, (java.lang.Long)50397184L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b50 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b57 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b59 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b60 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b62 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b63 == false);

  }

  @Test
  public void test159() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test159"); }


    tp2.IP iP0 = null;
    tp2.IPBan iPBan2 = new tp2.IPBan(iP0, (java.lang.Long)10L);
    tp2.IP iP3 = iPBan2.ip;
    tp2.Server server4 = new tp2.Server();
    tp2.IP iP5 = null;
    boolean b6 = server4.addBan(iP5);
    tp2.Server server7 = new tp2.Server();
    tp2.IP iP12 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b13 = server7.removeException(iP12);
    boolean b15 = iP12.equals((java.lang.Object)(-1L));
    boolean b16 = server4.removeBan(iP12);
    iPBan2.ip = iP12;
    iP12.setSecond((java.lang.Integer)977483676);
    tp2.IP iP24 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    iP24.setFirst((java.lang.Integer)161);
    iP24.setThird((java.lang.Integer)3);
    iP24.setFirst((java.lang.Integer)1478164480);
    boolean b31 = iP12.equals((java.lang.Object)1478164480);
    java.lang.Integer i32 = iP12.getFourth();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i32 + "' != '" + 5+ "'", i32.equals(5));

  }

  @Test
  public void test160() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test160"); }


    // The following exception was thrown during execution in test generation
    try {
      java.lang.Integer i1 = java.lang.Integer.decode("2231369807");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test161() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test161"); }


    // The following exception was thrown during execution in test generation
    try {
      java.lang.Integer i1 = new java.lang.Integer("37777743345");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test162() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test162"); }


    java.lang.String str2 = java.lang.Integer.toUnsignedString(62, 2000204102);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "62"+ "'", str2.equals("62"));

  }

  @Test
  public void test163() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test163"); }


    int i1 = java.lang.Integer.bitCount(1023410176);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 5);

  }

  @Test
  public void test164() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test164"); }


    tp2.IP iP0 = null;
    tp2.IPBan iPBan2 = new tp2.IPBan(iP0, (java.lang.Long)10L);
    tp2.IP iP3 = iPBan2.getIp();
    java.lang.Long long4 = iPBan2.expires;
    tp2.IP iP5 = null;
    iPBan2.ip = iP5;
    java.lang.Long long7 = iPBan2.getExpires();
    iPBan2.expires = 14L;
    java.lang.Long long10 = iPBan2.getExpires();
    tp2.IP iP11 = iPBan2.ip;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L+ "'", long4.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long7 + "' != '" + 10L+ "'", long7.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long10 + "' != '" + 14L+ "'", long10.equals(14L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP11);

  }

  @Test
  public void test165() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test165"); }


    int i1 = java.lang.Integer.signum(134217728);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 1);

  }

  @Test
  public void test166() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test166"); }


    // The following exception was thrown during execution in test generation
    try {
      java.lang.Integer i1 = new java.lang.Integer("2231369807");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test167() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test167"); }


    int i2 = java.lang.Integer.remainderUnsigned((-2147483515), 43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 12);

  }

  @Test
  public void test168() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test168"); }


    int i2 = java.lang.Integer.remainderUnsigned(1093819584, 256);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 192);

  }

  @Test
  public void test169() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test169"); }


    long long1 = java.lang.Integer.toUnsignedLong((-671088629));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == 3623878667L);

  }

  @Test
  public void test170() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test170"); }


    tp2.IP iP0 = null;
    tp2.IPBan iPBan2 = new tp2.IPBan(iP0, (java.lang.Long)10L);
    tp2.Server server3 = new tp2.Server();
    tp2.IP iP8 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b9 = server3.removeException(iP8);
    server3.update();
    tp2.Server server11 = new tp2.Server();
    tp2.IP iP12 = null;
    boolean b13 = server11.addBan(iP12);
    tp2.Server server14 = new tp2.Server();
    tp2.IP iP19 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b20 = server14.removeException(iP19);
    boolean b22 = iP19.equals((java.lang.Object)(-1L));
    boolean b23 = server11.removeBan(iP19);
    tp2.IP iP28 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    iP28.setFirst((java.lang.Integer)161);
    iP28.setThird((java.lang.Integer)3);
    iP28.setFirst((java.lang.Integer)26);
    boolean b35 = server11.connect(iP28);
    iP28.setSecond((java.lang.Integer)1677721761);
    boolean b38 = server3.removeBan(iP28);
    tp2.Server server39 = new tp2.Server();
    tp2.IP iP40 = null;
    boolean b41 = server39.addBan(iP40);
    tp2.ITime iTime42 = null;
    server39.setTime(iTime42);
    tp2.IP iP44 = null;
    tp2.IPBan iPBan46 = new tp2.IPBan(iP44, (java.lang.Long)10L);
    tp2.IP iP47 = iPBan46.getIp();
    java.lang.Long long48 = iPBan46.expires;
    tp2.IP iP49 = null;
    iPBan46.ip = iP49;
    tp2.Server server51 = new tp2.Server();
    tp2.IP iP56 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b57 = server51.removeException(iP56);
    java.lang.Integer i58 = iP56.getFirst();
    iPBan46.setIp(iP56);
    boolean b60 = server39.connect(iP56);
    iP56.setFourth((java.lang.Integer)(-1));
    boolean b63 = server3.removeException(iP56);
    iPBan2.ip = iP56;
    java.lang.Long long65 = iPBan2.expires;
    tp2.IP iP66 = iPBan2.getIp();
    tp2.IP iP71 = new tp2.IP((java.lang.Integer)31, (java.lang.Integer)31, (java.lang.Integer)31, (java.lang.Integer)0);
    iP71.setSecond((java.lang.Integer)2147483647);
    java.lang.Integer i74 = iP71.getThird();
    iP71.setSecond((java.lang.Integer)10);
    iPBan2.setIp(iP71);
    tp2.IP iP78 = iPBan2.getIp();
    tp2.IP iP79 = iPBan2.ip;
    java.lang.Integer i80 = iP79.getThird();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long48 + "' != '" + 10L+ "'", long48.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b57 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i58 + "' != '" + 161+ "'", i58.equals(161));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b60 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b63 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long65 + "' != '" + 10L+ "'", long65.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP66);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i74 + "' != '" + 31+ "'", i74.equals(31));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP78);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP79);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i80 + "' != '" + 31+ "'", i80.equals(31));

  }

  @Test
  public void test171() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test171"); }


    int i2 = java.lang.Integer.min(59000028, (-2147483646));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == (-2147483646));

  }

  @Test
  public void test172() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test172"); }


    tp2.IP iP0 = null;
    tp2.IPBan iPBan2 = new tp2.IPBan(iP0, (java.lang.Long)10L);
    java.lang.Long long3 = iPBan2.getExpires();
    tp2.IP iP8 = new tp2.IP((java.lang.Integer)31, (java.lang.Integer)31, (java.lang.Integer)31, (java.lang.Integer)0);
    iPBan2.ip = iP8;
    tp2.Server server10 = new tp2.Server();
    tp2.IP iP15 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b16 = server10.removeException(iP15);
    server10.update();
    tp2.Server server18 = new tp2.Server();
    tp2.IP iP23 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b24 = server18.removeException(iP23);
    java.lang.Integer i25 = iP23.getFirst();
    boolean b26 = server10.addBan(iP23);
    iPBan2.setIp(iP23);
    tp2.IP iP28 = iPBan2.ip;
    tp2.IP iP29 = iPBan2.ip;
    iP29.setFirst((java.lang.Integer)145752064);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L+ "'", long3.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i25 + "' != '" + 161+ "'", i25.equals(161));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP29);

  }

  @Test
  public void test173() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test173"); }


    tp2.IP iP0 = null;
    tp2.IPBan iPBan2 = new tp2.IPBan(iP0, (java.lang.Long)10L);
    tp2.IP iP3 = iPBan2.getIp();
    java.lang.Long long4 = iPBan2.expires;
    tp2.IP iP5 = null;
    iPBan2.ip = iP5;
    tp2.Server server7 = new tp2.Server();
    tp2.IP iP12 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b13 = server7.removeException(iP12);
    java.lang.Integer i14 = iP12.getFirst();
    iPBan2.setIp(iP12);
    iP12.setSecond((java.lang.Integer)1476395008);
    tp2.IPBan iPBan19 = new tp2.IPBan(iP12, (java.lang.Long)10L);
    java.lang.Long long20 = iPBan19.getExpires();
    tp2.IP iP21 = iPBan19.getIp();
    iP21.setThird((java.lang.Integer)(-1845493632));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L+ "'", long4.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i14 + "' != '" + 161+ "'", i14.equals(161));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long20 + "' != '" + 10L+ "'", long20.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP21);

  }

  @Test
  public void test174() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test174"); }


    java.lang.Integer i1 = new java.lang.Integer("9");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 9+ "'", i1.equals(9));

  }

  @Test
  public void test175() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test175"); }


    int i2 = java.lang.Integer.compareUnsigned(1048576, 23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);

  }

  @Test
  public void test176() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test176"); }


    int i2 = java.lang.Integer.compare(525611, 65536);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);

  }

  @Test
  public void test177() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test177"); }


    int i2 = java.lang.Integer.divideUnsigned(4000000, 100000);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 40);

  }

  @Test
  public void test178() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test178"); }


    tp2.IP iP0 = null;
    tp2.IPBan iPBan2 = new tp2.IPBan(iP0, (java.lang.Long)10L);
    java.lang.Long long3 = iPBan2.getExpires();
    tp2.IP iP4 = iPBan2.getIp();
    tp2.IP iP5 = iPBan2.ip;
    tp2.Server server6 = new tp2.Server();
    tp2.IP iP7 = null;
    boolean b8 = server6.addBan(iP7);
    tp2.IP iP13 = new tp2.IP((java.lang.Integer)31, (java.lang.Integer)31, (java.lang.Integer)31, (java.lang.Integer)0);
    iP13.setSecond((java.lang.Integer)2147483647);
    boolean b16 = server6.addBan(iP13);
    tp2.IP iP17 = null;
    tp2.IPBan iPBan19 = new tp2.IPBan(iP17, (java.lang.Long)10L);
    tp2.Server server20 = new tp2.Server();
    tp2.IP iP25 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b26 = server20.removeException(iP25);
    server20.update();
    tp2.Server server28 = new tp2.Server();
    tp2.IP iP29 = null;
    boolean b30 = server28.addBan(iP29);
    tp2.Server server31 = new tp2.Server();
    tp2.IP iP36 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b37 = server31.removeException(iP36);
    boolean b39 = iP36.equals((java.lang.Object)(-1L));
    boolean b40 = server28.removeBan(iP36);
    tp2.IP iP45 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    iP45.setFirst((java.lang.Integer)161);
    iP45.setThird((java.lang.Integer)3);
    iP45.setFirst((java.lang.Integer)26);
    boolean b52 = server28.connect(iP45);
    iP45.setSecond((java.lang.Integer)1677721761);
    boolean b55 = server20.removeBan(iP45);
    tp2.Server server56 = new tp2.Server();
    tp2.IP iP57 = null;
    boolean b58 = server56.addBan(iP57);
    tp2.ITime iTime59 = null;
    server56.setTime(iTime59);
    tp2.IP iP61 = null;
    tp2.IPBan iPBan63 = new tp2.IPBan(iP61, (java.lang.Long)10L);
    tp2.IP iP64 = iPBan63.getIp();
    java.lang.Long long65 = iPBan63.expires;
    tp2.IP iP66 = null;
    iPBan63.ip = iP66;
    tp2.Server server68 = new tp2.Server();
    tp2.IP iP73 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b74 = server68.removeException(iP73);
    java.lang.Integer i75 = iP73.getFirst();
    iPBan63.setIp(iP73);
    boolean b77 = server56.connect(iP73);
    iP73.setFourth((java.lang.Integer)(-1));
    boolean b80 = server20.removeException(iP73);
    iPBan19.ip = iP73;
    boolean b82 = server6.removeBan(iP73);
    java.lang.Integer i83 = iP73.getFirst();
    iPBan2.setIp(iP73);
    java.lang.Integer i85 = iP73.getFirst();
    java.lang.Integer i86 = iP73.getFirst();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L+ "'", long3.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b52 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b55 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b58 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP64);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long65 + "' != '" + 10L+ "'", long65.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b74 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i75 + "' != '" + 161+ "'", i75.equals(161));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b77 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b80 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b82 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i83 + "' != '" + 161+ "'", i83.equals(161));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i85 + "' != '" + 161+ "'", i85.equals(161));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i86 + "' != '" + 161+ "'", i86.equals(161));

  }

  @Test
  public void test179() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test179"); }


    // The following exception was thrown during execution in test generation
    try {
      int i2 = java.lang.Integer.parseInt("1a", 3);
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test180() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test180"); }


    tp2.IP iP0 = null;
    tp2.IPBan iPBan2 = new tp2.IPBan(iP0, (java.lang.Long)10L);
    tp2.IP iP3 = iPBan2.getIp();
    tp2.IP iP8 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    iP8.setFirst((java.lang.Integer)161);
    iP8.setThird((java.lang.Integer)3);
    iP8.setFirst((java.lang.Integer)26);
    iPBan2.ip = iP8;
    iP8.setSecond((java.lang.Integer)16777216);
    boolean b19 = iP8.equals((java.lang.Object)80000085);
    java.lang.Integer i20 = iP8.getThird();
    tp2.IPBan iPBan22 = new tp2.IPBan(iP8, (java.lang.Long)2013262563L);
    java.lang.Long long23 = iPBan22.expires;
    tp2.IP iP24 = null;
    iPBan22.ip = iP24;
    tp2.IP iP26 = null;
    tp2.IPBan iPBan28 = new tp2.IPBan(iP26, (java.lang.Long)10L);
    tp2.IP iP29 = iPBan28.getIp();
    tp2.IP iP34 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    iP34.setFirst((java.lang.Integer)161);
    iP34.setThird((java.lang.Integer)3);
    iP34.setFirst((java.lang.Integer)26);
    iPBan28.ip = iP34;
    iP34.setThird((java.lang.Integer)1476395008);
    iPBan22.setIp(iP34);
    tp2.IP iP45 = iPBan22.ip;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i20 + "' != '" + 3+ "'", i20.equals(3));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long23 + "' != '" + 2013262563L+ "'", long23.equals(2013262563L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP45);

  }

  @Test
  public void test181() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test181"); }


    java.lang.String str2 = java.lang.Integer.toUnsignedString((-1609629696), 14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1b68d7808"+ "'", str2.equals("1b68d7808"));

  }

  @Test
  public void test182() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test182"); }


    tp2.Server server0 = new tp2.Server();
    tp2.IP iP1 = null;
    boolean b2 = server0.addBan(iP1);
    tp2.IP iP7 = new tp2.IP((java.lang.Integer)31, (java.lang.Integer)31, (java.lang.Integer)31, (java.lang.Integer)0);
    iP7.setSecond((java.lang.Integer)2147483647);
    boolean b10 = server0.addBan(iP7);
    tp2.Server server11 = new tp2.Server();
    tp2.IP iP12 = null;
    boolean b13 = server11.addBan(iP12);
    tp2.ITime iTime14 = null;
    server11.setTime(iTime14);
    tp2.IP iP16 = null;
    tp2.IPBan iPBan18 = new tp2.IPBan(iP16, (java.lang.Long)10L);
    tp2.IP iP19 = iPBan18.getIp();
    java.lang.Long long20 = iPBan18.expires;
    tp2.IP iP21 = null;
    iPBan18.ip = iP21;
    tp2.Server server23 = new tp2.Server();
    tp2.IP iP28 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b29 = server23.removeException(iP28);
    java.lang.Integer i30 = iP28.getFirst();
    iPBan18.setIp(iP28);
    boolean b32 = server11.connect(iP28);
    boolean b33 = server0.removeBan(iP28);
    tp2.IP iP34 = null;
    tp2.IPBan iPBan36 = new tp2.IPBan(iP34, (java.lang.Long)10L);
    java.lang.Long long37 = iPBan36.getExpires();
    tp2.IP iP42 = new tp2.IP((java.lang.Integer)31, (java.lang.Integer)31, (java.lang.Integer)31, (java.lang.Integer)0);
    iPBan36.ip = iP42;
    tp2.Server server44 = new tp2.Server();
    tp2.IP iP49 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b50 = server44.removeException(iP49);
    server44.update();
    tp2.Server server52 = new tp2.Server();
    tp2.IP iP57 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b58 = server52.removeException(iP57);
    java.lang.Integer i59 = iP57.getFirst();
    boolean b60 = server44.addBan(iP57);
    iPBan36.setIp(iP57);
    boolean b62 = server0.addBan(iP57);
    iP57.setThird((java.lang.Integer)133);
    java.lang.Integer i65 = iP57.getSecond();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long20 + "' != '" + 10L+ "'", long20.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i30 + "' != '" + 161+ "'", i30.equals(161));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long37 + "' != '" + 10L+ "'", long37.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b50 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b58 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i59 + "' != '" + 161+ "'", i59.equals(161));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b60 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b62 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i65 + "' != '" + (-2147483648)+ "'", i65.equals((-2147483648)));

  }

  @Test
  public void test183() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test183"); }


    int i2 = java.lang.Integer.remainderUnsigned(261698496, 9216);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 960);

  }

  @Test
  public void test184() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test184"); }


    tp2.IP iP0 = null;
    tp2.IPBan iPBan2 = new tp2.IPBan(iP0, (java.lang.Long)10L);
    java.lang.Long long3 = iPBan2.getExpires();
    tp2.IP iP8 = new tp2.IP((java.lang.Integer)31, (java.lang.Integer)31, (java.lang.Integer)31, (java.lang.Integer)0);
    iPBan2.ip = iP8;
    tp2.Server server10 = new tp2.Server();
    tp2.IP iP15 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b16 = server10.removeException(iP15);
    server10.update();
    tp2.Server server18 = new tp2.Server();
    tp2.IP iP23 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b24 = server18.removeException(iP23);
    java.lang.Integer i25 = iP23.getFirst();
    boolean b26 = server10.addBan(iP23);
    iPBan2.setIp(iP23);
    tp2.IP iP28 = iPBan2.ip;
    tp2.IP iP29 = iPBan2.ip;
    java.lang.Integer i30 = iP29.getSecond();
    tp2.IPBan iPBan32 = new tp2.IPBan(iP29, (java.lang.Long)4074995711L);
    iP29.setSecond((java.lang.Integer)448);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L+ "'", long3.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i25 + "' != '" + 161+ "'", i25.equals(161));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i30 + "' != '" + (-2147483648)+ "'", i30.equals((-2147483648)));

  }

  @Test
  public void test185() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test185"); }


    tp2.IP iP4 = new tp2.IP((java.lang.Integer)4421084, (java.lang.Integer)5211392, (java.lang.Integer)977483676, (java.lang.Integer)(-1610610192));

  }

  @Test
  public void test186() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test186"); }


    int i1 = java.lang.Integer.lowestOneBit(2082996226);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 2);

  }

  @Test
  public void test187() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test187"); }


    java.lang.String str1 = java.lang.Integer.toBinaryString(277);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "100010101"+ "'", str1.equals("100010101"));

  }

  @Test
  public void test188() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test188"); }


    int i1 = java.lang.Integer.parseUnsignedInt("536870912");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 536870912);

  }

  @Test
  public void test189() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test189"); }


    tp2.Server server0 = new tp2.Server();
    tp2.IP iP1 = null;
    boolean b2 = server0.addBan(iP1);
    tp2.Server server3 = new tp2.Server();
    tp2.IP iP8 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b9 = server3.removeException(iP8);
    iP8.setThird((java.lang.Integer)56);
    java.lang.Integer i12 = iP8.getFourth();
    tp2.IPBan iPBan14 = new tp2.IPBan(iP8, (java.lang.Long)10L);
    iPBan14.expires = 2147483647L;
    tp2.IP iP17 = iPBan14.ip;
    boolean b19 = iP17.equals((java.lang.Object)13);
    boolean b20 = server0.addBan(iP17);
    tp2.IP iP21 = null;
    boolean b22 = server0.addBan(iP21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i12 + "' != '" + 5+ "'", i12.equals(5));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);

  }

  @Test
  public void test190() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test190"); }


    java.lang.String str1 = java.lang.Integer.toOctalString(4421084);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "20672734"+ "'", str1.equals("20672734"));

  }

  @Test
  public void test191() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test191"); }


    java.lang.Integer i2 = java.lang.Integer.getInteger("26300000144", 285214850);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i2 + "' != '" + 285214850+ "'", i2.equals(285214850));

  }

  @Test
  public void test192() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test192"); }


    tp2.IP iP0 = null;
    tp2.IPBan iPBan2 = new tp2.IPBan(iP0, (java.lang.Long)10L);
    tp2.IP iP3 = iPBan2.getIp();
    tp2.IP iP8 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    iP8.setFirst((java.lang.Integer)161);
    iP8.setThird((java.lang.Integer)3);
    iP8.setFirst((java.lang.Integer)26);
    iPBan2.ip = iP8;
    tp2.IP iP16 = iPBan2.getIp();
    tp2.Server server17 = new tp2.Server();
    tp2.IP iP18 = null;
    boolean b19 = server17.addBan(iP18);
    server17.update();
    tp2.IP iP25 = new tp2.IP((java.lang.Integer)31, (java.lang.Integer)31, (java.lang.Integer)31, (java.lang.Integer)0);
    boolean b26 = server17.removeBan(iP25);
    server17.update();
    tp2.IP iP32 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    iP32.setFirst((java.lang.Integer)161);
    iP32.setThird((java.lang.Integer)3);
    iP32.setFirst((java.lang.Integer)26);
    iP32.setFirst((java.lang.Integer)(-2147483592));
    boolean b41 = server17.removeBan(iP32);
    iPBan2.ip = iP32;
    tp2.IP iP43 = iPBan2.ip;
    iPBan2.expires = 1093468160L;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP43);

  }

  @Test
  public void test193() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test193"); }


    int i1 = java.lang.Integer.lowestOneBit(1023410176);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 16777216);

  }

  @Test
  public void test194() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test194"); }


    java.lang.Integer i2 = java.lang.Integer.getInteger("1000000000000000000000000111111", (java.lang.Integer)(-134217728));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i2 + "' != '" + (-134217728)+ "'", i2.equals((-134217728)));

  }

  @Test
  public void test195() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test195"); }


    tp2.IP iP4 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    iP4.setFirst((java.lang.Integer)161);
    boolean b8 = iP4.equals((java.lang.Object)56);
    java.lang.Integer i9 = iP4.getFourth();
    tp2.IPBan iPBan11 = new tp2.IPBan(iP4, (java.lang.Long)4074995711L);
    java.lang.Integer i12 = iP4.getFirst();
    java.lang.Long long13 = null;
    tp2.IPBan iPBan14 = new tp2.IPBan(iP4, long13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 5+ "'", i9.equals(5));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i12 + "' != '" + 161+ "'", i12.equals(161));

  }

  @Test
  public void test196() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test196"); }


    int i1 = java.lang.Integer.numberOfTrailingZeros(19933292);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 2);

  }

  @Test
  public void test197() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test197"); }


    int i2 = java.lang.Integer.min(8, 20320);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 8);

  }

  @Test
  public void test198() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test198"); }


    java.lang.Integer i1 = new java.lang.Integer(1639744);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 1639744+ "'", i1.equals(1639744));

  }

  @Test
  public void test199() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test199"); }


    java.lang.String str1 = java.lang.Integer.toHexString(101121915);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "606ff7b"+ "'", str1.equals("606ff7b"));

  }

  @Test
  public void test200() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test200"); }


    int i2 = java.lang.Integer.rotateRight(7, 8000);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 7);

  }

  @Test
  public void test201() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test201"); }


    int i2 = java.lang.Integer.rotateRight(469761943, 25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == (-13427));

  }

  @Test
  public void test202() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test202"); }


    tp2.IP iP4 = new tp2.IP((java.lang.Integer)61, (java.lang.Integer)22528, (java.lang.Integer)4000, (java.lang.Integer)1073747006);

  }

  @Test
  public void test203() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test203"); }


    int i1 = java.lang.Integer.reverse((-2147435994));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 1683816449);

  }

  @Test
  public void test204() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test204"); }


    tp2.IP iP0 = null;
    tp2.IPBan iPBan2 = new tp2.IPBan(iP0, (java.lang.Long)10L);
    tp2.IP iP3 = iPBan2.getIp();
    java.lang.Long long4 = iPBan2.expires;
    tp2.IP iP5 = null;
    iPBan2.ip = iP5;
    tp2.Server server7 = new tp2.Server();
    tp2.IP iP8 = null;
    boolean b9 = server7.addBan(iP8);
    tp2.ITime iTime10 = null;
    server7.setTime(iTime10);
    tp2.IP iP12 = null;
    tp2.IPBan iPBan14 = new tp2.IPBan(iP12, (java.lang.Long)10L);
    tp2.IP iP15 = iPBan14.getIp();
    java.lang.Long long16 = iPBan14.expires;
    tp2.IP iP17 = null;
    iPBan14.ip = iP17;
    tp2.Server server19 = new tp2.Server();
    tp2.IP iP24 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b25 = server19.removeException(iP24);
    java.lang.Integer i26 = iP24.getFirst();
    iPBan14.setIp(iP24);
    boolean b28 = server7.connect(iP24);
    iPBan2.setIp(iP24);
    tp2.IP iP30 = null;
    tp2.IPBan iPBan32 = new tp2.IPBan(iP30, (java.lang.Long)10L);
    tp2.IP iP33 = iPBan32.getIp();
    iPBan32.expires = 0L;
    tp2.IP iP36 = iPBan32.ip;
    tp2.Server server37 = new tp2.Server();
    tp2.IP iP38 = null;
    boolean b39 = server37.addBan(iP38);
    tp2.IP iP44 = new tp2.IP((java.lang.Integer)31, (java.lang.Integer)31, (java.lang.Integer)31, (java.lang.Integer)0);
    iP44.setSecond((java.lang.Integer)2147483647);
    boolean b47 = server37.addBan(iP44);
    tp2.Server server48 = new tp2.Server();
    tp2.IP iP49 = null;
    boolean b50 = server48.addBan(iP49);
    tp2.ITime iTime51 = null;
    server48.setTime(iTime51);
    tp2.IP iP53 = null;
    tp2.IPBan iPBan55 = new tp2.IPBan(iP53, (java.lang.Long)10L);
    tp2.IP iP56 = iPBan55.getIp();
    java.lang.Long long57 = iPBan55.expires;
    tp2.IP iP58 = null;
    iPBan55.ip = iP58;
    tp2.Server server60 = new tp2.Server();
    tp2.IP iP65 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b66 = server60.removeException(iP65);
    java.lang.Integer i67 = iP65.getFirst();
    iPBan55.setIp(iP65);
    boolean b69 = server48.connect(iP65);
    boolean b70 = server37.removeBan(iP65);
    iPBan32.ip = iP65;
    boolean b72 = iP24.equals((java.lang.Object)iP65);
    boolean b74 = iP65.equals((java.lang.Object)"10000000001");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L+ "'", long4.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long16 + "' != '" + 10L+ "'", long16.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i26 + "' != '" + 161+ "'", i26.equals(161));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b47 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b50 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long57 + "' != '" + 10L+ "'", long57.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b66 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i67 + "' != '" + 161+ "'", i67.equals(161));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b69 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b70 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b72 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b74 == false);

  }

  @Test
  public void test205() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test205"); }


    tp2.IP iP0 = null;
    tp2.IPBan iPBan2 = new tp2.IPBan(iP0, (java.lang.Long)10L);
    tp2.IP iP3 = iPBan2.getIp();
    java.lang.Long long4 = iPBan2.expires;
    tp2.IP iP5 = null;
    iPBan2.ip = iP5;
    tp2.Server server7 = new tp2.Server();
    tp2.IP iP12 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b13 = server7.removeException(iP12);
    java.lang.Integer i14 = iP12.getFirst();
    iPBan2.setIp(iP12);
    java.lang.Long long16 = iPBan2.expires;
    tp2.IP iP17 = iPBan2.getIp();
    tp2.Server server18 = new tp2.Server();
    tp2.IP iP19 = null;
    boolean b20 = server18.addBan(iP19);
    server18.update();
    tp2.IP iP22 = null;
    tp2.IPBan iPBan24 = new tp2.IPBan(iP22, (java.lang.Long)10L);
    tp2.IP iP25 = iPBan24.getIp();
    java.lang.Long long26 = iPBan24.expires;
    tp2.IP iP27 = null;
    iPBan24.ip = iP27;
    tp2.Server server29 = new tp2.Server();
    tp2.IP iP34 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b35 = server29.removeException(iP34);
    java.lang.Integer i36 = iP34.getFirst();
    iPBan24.setIp(iP34);
    java.lang.Integer i38 = iP34.getFirst();
    java.lang.Integer i39 = iP34.getFirst();
    boolean b40 = server18.addBan(iP34);
    tp2.Server server41 = new tp2.Server();
    tp2.IP iP46 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b47 = server41.removeException(iP46);
    iP46.setThird((java.lang.Integer)56);
    tp2.IPBan iPBan51 = new tp2.IPBan(iP46, (java.lang.Long)2147483676L);
    java.lang.Long long52 = null;
    tp2.IPBan iPBan53 = new tp2.IPBan(iP46, long52);
    tp2.IP iP54 = iPBan53.ip;
    boolean b55 = server18.connect(iP54);
    server18.update();
    boolean b57 = iP17.equals((java.lang.Object)server18);
    iP17.setFourth((java.lang.Integer)(-855637916));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L+ "'", long4.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i14 + "' != '" + 161+ "'", i14.equals(161));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long16 + "' != '" + 10L+ "'", long16.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long26 + "' != '" + 10L+ "'", long26.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i36 + "' != '" + 161+ "'", i36.equals(161));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i38 + "' != '" + 161+ "'", i38.equals(161));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i39 + "' != '" + 161+ "'", i39.equals(161));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b47 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b55 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b57 == false);

  }

  @Test
  public void test206() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test206"); }


    java.lang.String str2 = java.lang.Integer.toUnsignedString(0, 38000);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "0"+ "'", str2.equals("0"));

  }

  @Test
  public void test207() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test207"); }


    int i1 = java.lang.Integer.reverseBytes((-1031798745));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 654344386);

  }

  @Test
  public void test208() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test208"); }


    // The following exception was thrown during execution in test generation
    try {
      int i2 = java.lang.Integer.parseInt("1024", 134217738);
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test209() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test209"); }


    int i2 = java.lang.Integer.min(61532160, (-167510016));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == (-167510016));

  }

  @Test
  public void test210() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test210"); }


    tp2.Server server0 = new tp2.Server();
    tp2.IP iP1 = null;
    boolean b2 = server0.addBan(iP1);
    tp2.IP iP7 = new tp2.IP((java.lang.Integer)31, (java.lang.Integer)31, (java.lang.Integer)31, (java.lang.Integer)0);
    iP7.setSecond((java.lang.Integer)2147483647);
    boolean b10 = server0.addBan(iP7);
    tp2.Server server11 = new tp2.Server();
    tp2.IP iP12 = null;
    boolean b13 = server11.addBan(iP12);
    tp2.ITime iTime14 = null;
    server11.setTime(iTime14);
    tp2.IP iP16 = null;
    tp2.IPBan iPBan18 = new tp2.IPBan(iP16, (java.lang.Long)10L);
    tp2.IP iP19 = iPBan18.getIp();
    java.lang.Long long20 = iPBan18.expires;
    tp2.IP iP21 = null;
    iPBan18.ip = iP21;
    tp2.Server server23 = new tp2.Server();
    tp2.IP iP28 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b29 = server23.removeException(iP28);
    java.lang.Integer i30 = iP28.getFirst();
    iPBan18.setIp(iP28);
    boolean b32 = server11.connect(iP28);
    boolean b33 = server0.removeBan(iP28);
    tp2.ITime iTime34 = null;
    server0.setTime(iTime34);
    server0.update();
    tp2.IP iP37 = null;
    tp2.IPBan iPBan39 = new tp2.IPBan(iP37, (java.lang.Long)10L);
    tp2.IP iP40 = iPBan39.getIp();
    java.lang.Long long41 = iPBan39.expires;
    tp2.IP iP42 = null;
    iPBan39.ip = iP42;
    tp2.IP iP44 = null;
    tp2.IPBan iPBan46 = new tp2.IPBan(iP44, (java.lang.Long)10L);
    tp2.IP iP47 = iPBan46.getIp();
    java.lang.Long long48 = iPBan46.expires;
    tp2.Server server49 = new tp2.Server();
    tp2.IP iP54 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b55 = server49.removeException(iP54);
    java.lang.Integer i56 = iP54.getFirst();
    iPBan46.setIp(iP54);
    tp2.IP iP58 = iPBan46.ip;
    tp2.IP iP59 = iPBan46.getIp();
    iPBan39.setIp(iP59);
    tp2.IP iP65 = new tp2.IP((java.lang.Integer)31, (java.lang.Integer)(-2147483592), (java.lang.Integer)133, (java.lang.Integer)(-2147483646));
    iPBan39.setIp(iP65);
    boolean b67 = server0.removeBan(iP65);
    tp2.ITime iTime68 = null;
    server0.setTime(iTime68);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long20 + "' != '" + 10L+ "'", long20.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i30 + "' != '" + 161+ "'", i30.equals(161));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long41 + "' != '" + 10L+ "'", long41.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long48 + "' != '" + 10L+ "'", long48.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b55 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i56 + "' != '" + 161+ "'", i56.equals(161));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP58);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP59);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b67 == false);

  }

  @Test
  public void test211() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test211"); }


    java.lang.Integer i2 = java.lang.Integer.getInteger("2500000644", (java.lang.Integer)1400000);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i2 + "' != '" + 1400000+ "'", i2.equals(1400000));

  }

  @Test
  public void test212() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test212"); }


    tp2.Server server0 = new tp2.Server();
    tp2.IP iP1 = null;
    boolean b2 = server0.addBan(iP1);
    tp2.IP iP7 = new tp2.IP((java.lang.Integer)31, (java.lang.Integer)31, (java.lang.Integer)31, (java.lang.Integer)0);
    iP7.setSecond((java.lang.Integer)2147483647);
    boolean b10 = server0.addBan(iP7);
    tp2.Server server11 = new tp2.Server();
    tp2.IP iP12 = null;
    boolean b13 = server11.addBan(iP12);
    tp2.ITime iTime14 = null;
    server11.setTime(iTime14);
    tp2.IP iP16 = null;
    tp2.IPBan iPBan18 = new tp2.IPBan(iP16, (java.lang.Long)10L);
    tp2.IP iP19 = iPBan18.getIp();
    java.lang.Long long20 = iPBan18.expires;
    tp2.IP iP21 = null;
    iPBan18.ip = iP21;
    tp2.Server server23 = new tp2.Server();
    tp2.IP iP28 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b29 = server23.removeException(iP28);
    java.lang.Integer i30 = iP28.getFirst();
    iPBan18.setIp(iP28);
    boolean b32 = server11.connect(iP28);
    boolean b33 = server0.removeBan(iP28);
    tp2.IP iP38 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    iP38.setFirst((java.lang.Integer)161);
    boolean b42 = iP38.equals((java.lang.Object)56);
    boolean b43 = server0.removeException(iP38);
    tp2.Server server44 = new tp2.Server();
    tp2.IP iP45 = null;
    boolean b46 = server44.connect(iP45);
    tp2.IP iP51 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    iP51.setFirst((java.lang.Integer)161);
    boolean b55 = iP51.equals((java.lang.Object)56);
    java.lang.Integer i56 = iP51.getFourth();
    boolean b57 = server44.removeBan(iP51);
    boolean b58 = server0.addException(iP51);
    java.lang.Integer i59 = iP51.getSecond();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long20 + "' != '" + 10L+ "'", long20.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i30 + "' != '" + 161+ "'", i30.equals(161));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b43 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b46 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b55 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i56 + "' != '" + 5+ "'", i56.equals(5));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b57 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b58 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i59 + "' != '" + (-2147483648)+ "'", i59.equals((-2147483648)));

  }

  @Test
  public void test213() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test213"); }


    int i1 = java.lang.Integer.reverseBytes(901);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == (-2063400960));

  }

  @Test
  public void test214() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test214"); }


    int i2 = java.lang.Integer.rotateRight(503, 630);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 515072);

  }

  @Test
  public void test215() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test215"); }


    tp2.Server server0 = new tp2.Server();
    tp2.IP iP1 = null;
    boolean b2 = server0.addBan(iP1);
    tp2.IP iP7 = new tp2.IP((java.lang.Integer)31, (java.lang.Integer)31, (java.lang.Integer)31, (java.lang.Integer)0);
    iP7.setSecond((java.lang.Integer)2147483647);
    boolean b10 = server0.addBan(iP7);
    tp2.Server server11 = new tp2.Server();
    tp2.IP iP12 = null;
    boolean b13 = server11.addBan(iP12);
    tp2.Server server14 = new tp2.Server();
    tp2.IP iP19 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b20 = server14.removeException(iP19);
    boolean b22 = iP19.equals((java.lang.Object)(-1L));
    boolean b23 = server11.removeBan(iP19);
    java.lang.Integer i24 = iP19.getFourth();
    boolean b25 = server0.removeBan(iP19);
    tp2.IP iP26 = null;
    boolean b27 = server0.addBan(iP26);
    server0.update();
    tp2.Server server29 = new tp2.Server();
    tp2.IP iP30 = null;
    boolean b31 = server29.addBan(iP30);
    tp2.IP iP36 = new tp2.IP((java.lang.Integer)31, (java.lang.Integer)31, (java.lang.Integer)31, (java.lang.Integer)0);
    iP36.setSecond((java.lang.Integer)2147483647);
    boolean b39 = server29.addBan(iP36);
    tp2.IP iP40 = null;
    tp2.IPBan iPBan42 = new tp2.IPBan(iP40, (java.lang.Long)10L);
    tp2.IP iP43 = iPBan42.getIp();
    tp2.IP iP48 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    iP48.setFirst((java.lang.Integer)161);
    iP48.setThird((java.lang.Integer)3);
    iP48.setFirst((java.lang.Integer)26);
    iPBan42.ip = iP48;
    tp2.IP iP56 = iPBan42.getIp();
    tp2.Server server57 = new tp2.Server();
    tp2.IP iP58 = null;
    boolean b59 = server57.addBan(iP58);
    server57.update();
    tp2.IP iP65 = new tp2.IP((java.lang.Integer)31, (java.lang.Integer)31, (java.lang.Integer)31, (java.lang.Integer)0);
    boolean b66 = server57.removeBan(iP65);
    server57.update();
    tp2.IP iP72 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    iP72.setFirst((java.lang.Integer)161);
    iP72.setThird((java.lang.Integer)3);
    iP72.setFirst((java.lang.Integer)26);
    iP72.setFirst((java.lang.Integer)(-2147483592));
    boolean b81 = server57.removeBan(iP72);
    iPBan42.ip = iP72;
    tp2.IP iP83 = iPBan42.ip;
    tp2.IPBan iPBan85 = new tp2.IPBan(iP83, (java.lang.Long)133L);
    boolean b86 = server29.connect(iP83);
    java.lang.Integer i87 = iP83.getFourth();
    boolean b88 = server0.addBan(iP83);
    tp2.ITime iTime89 = null;
    server0.setTime(iTime89);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i24 + "' != '" + 5+ "'", i24.equals(5));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b59 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b66 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b81 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP83);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b86 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i87 + "' != '" + 5+ "'", i87.equals(5));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b88 == true);

  }

  @Test
  public void test216() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test216"); }


    int i1 = java.lang.Integer.numberOfLeadingZeros(822083584);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 2);

  }

  @Test
  public void test217() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test217"); }


    int i2 = java.lang.Integer.compareUnsigned((-2147436052), 33554432);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);

  }

  @Test
  public void test218() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test218"); }


    tp2.Server server0 = new tp2.Server();
    tp2.IP iP1 = null;
    boolean b2 = server0.addBan(iP1);
    tp2.IP iP7 = new tp2.IP((java.lang.Integer)31, (java.lang.Integer)31, (java.lang.Integer)31, (java.lang.Integer)0);
    iP7.setSecond((java.lang.Integer)2147483647);
    boolean b10 = server0.addBan(iP7);
    tp2.Server server11 = new tp2.Server();
    tp2.IP iP12 = null;
    boolean b13 = server11.addBan(iP12);
    tp2.Server server14 = new tp2.Server();
    tp2.IP iP19 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b20 = server14.removeException(iP19);
    boolean b22 = iP19.equals((java.lang.Object)(-1L));
    boolean b23 = server11.removeBan(iP19);
    java.lang.Integer i24 = iP19.getFourth();
    boolean b25 = server0.removeBan(iP19);
    tp2.IP iP26 = null;
    tp2.IPBan iPBan28 = new tp2.IPBan(iP26, (java.lang.Long)10L);
    tp2.IP iP29 = iPBan28.getIp();
    java.lang.Long long30 = iPBan28.expires;
    tp2.IP iP31 = null;
    iPBan28.ip = iP31;
    tp2.Server server33 = new tp2.Server();
    tp2.IP iP38 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b39 = server33.removeException(iP38);
    java.lang.Integer i40 = iP38.getFirst();
    iPBan28.setIp(iP38);
    java.lang.Long long42 = iPBan28.expires;
    tp2.IP iP43 = iPBan28.getIp();
    boolean b45 = iP43.equals((java.lang.Object)false);
    boolean b46 = server0.removeBan(iP43);
    iP43.setSecond((java.lang.Integer)1879047772);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i24 + "' != '" + 5+ "'", i24.equals(5));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long30 + "' != '" + 10L+ "'", long30.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i40 + "' != '" + 161+ "'", i40.equals(161));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long42 + "' != '" + 10L+ "'", long42.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b46 == false);

  }

  @Test
  public void test219() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test219"); }


    int i2 = java.lang.Integer.compareUnsigned(128, 1638400);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == (-1));

  }

  @Test
  public void test220() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test220"); }


    tp2.IP iP0 = null;
    tp2.IPBan iPBan2 = new tp2.IPBan(iP0, (java.lang.Long)10L);
    java.lang.Long long3 = iPBan2.getExpires();
    java.lang.Long long4 = iPBan2.expires;
    iPBan2.expires = 4160749568L;
    tp2.IP iP7 = iPBan2.getIp();
    java.lang.Long long8 = iPBan2.getExpires();
    tp2.IP iP9 = null;
    tp2.IPBan iPBan11 = new tp2.IPBan(iP9, (java.lang.Long)10L);
    tp2.IP iP12 = iPBan11.getIp();
    tp2.IP iP17 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    iP17.setFirst((java.lang.Integer)161);
    iP17.setThird((java.lang.Integer)3);
    iP17.setFirst((java.lang.Integer)26);
    iPBan11.ip = iP17;
    iP17.setSecond((java.lang.Integer)16777216);
    boolean b28 = iP17.equals((java.lang.Object)80000085);
    java.lang.Integer i29 = iP17.getThird();
    tp2.IPBan iPBan31 = new tp2.IPBan(iP17, (java.lang.Long)2013262563L);
    iPBan2.setIp(iP17);
    java.lang.Long long33 = iPBan2.getExpires();
    iPBan2.expires = 176L;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L+ "'", long3.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L+ "'", long4.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long8 + "' != '" + 4160749568L+ "'", long8.equals(4160749568L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i29 + "' != '" + 3+ "'", i29.equals(3));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long33 + "' != '" + 4160749568L+ "'", long33.equals(4160749568L));

  }

  @Test
  public void test221() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test221"); }


    tp2.Server server0 = new tp2.Server();
    tp2.IP iP5 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b6 = server0.removeException(iP5);
    server0.update();
    tp2.Server server8 = new tp2.Server();
    tp2.IP iP13 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b14 = server8.removeException(iP13);
    java.lang.Integer i15 = iP13.getFirst();
    boolean b16 = server0.addBan(iP13);
    tp2.IP iP21 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    iP21.setFirst((java.lang.Integer)161);
    boolean b25 = iP21.equals((java.lang.Object)56);
    boolean b26 = server0.connect(iP21);
    tp2.ITime iTime27 = null;
    server0.setTime(iTime27);
    tp2.Server server29 = new tp2.Server();
    tp2.IP iP34 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b35 = server29.removeException(iP34);
    iP34.setThird((java.lang.Integer)56);
    java.lang.Integer i38 = iP34.getFourth();
    tp2.IPBan iPBan40 = new tp2.IPBan(iP34, (java.lang.Long)10L);
    java.lang.Long long41 = iPBan40.expires;
    tp2.Server server42 = new tp2.Server();
    tp2.IP iP43 = null;
    boolean b44 = server42.addBan(iP43);
    tp2.IP iP49 = new tp2.IP((java.lang.Integer)31, (java.lang.Integer)31, (java.lang.Integer)31, (java.lang.Integer)0);
    iP49.setSecond((java.lang.Integer)2147483647);
    boolean b52 = server42.addBan(iP49);
    tp2.Server server53 = new tp2.Server();
    tp2.IP iP54 = null;
    boolean b55 = server53.addBan(iP54);
    tp2.ITime iTime56 = null;
    server53.setTime(iTime56);
    tp2.IP iP58 = null;
    tp2.IPBan iPBan60 = new tp2.IPBan(iP58, (java.lang.Long)10L);
    tp2.IP iP61 = iPBan60.getIp();
    java.lang.Long long62 = iPBan60.expires;
    tp2.IP iP63 = null;
    iPBan60.ip = iP63;
    tp2.Server server65 = new tp2.Server();
    tp2.IP iP70 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b71 = server65.removeException(iP70);
    java.lang.Integer i72 = iP70.getFirst();
    iPBan60.setIp(iP70);
    boolean b74 = server53.connect(iP70);
    boolean b75 = server42.removeBan(iP70);
    tp2.IP iP80 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    iP80.setFirst((java.lang.Integer)161);
    iP80.setThird((java.lang.Integer)3);
    iP80.setFirst((java.lang.Integer)26);
    iP80.setThird((java.lang.Integer)5);
    boolean b89 = server42.removeBan(iP80);
    java.lang.Object obj90 = null;
    boolean b91 = iP80.equals(obj90);
    iPBan40.setIp(iP80);
    boolean b93 = server0.addException(iP80);
    tp2.IP iP94 = null;
    boolean b95 = server0.connect(iP94);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i15 + "' != '" + 161+ "'", i15.equals(161));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i38 + "' != '" + 5+ "'", i38.equals(5));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long41 + "' != '" + 10L+ "'", long41.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b52 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b55 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP61);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long62 + "' != '" + 10L+ "'", long62.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b71 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i72 + "' != '" + 161+ "'", i72.equals(161));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b74 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b75 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b89 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b91 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b93 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b95 == true);

  }

  @Test
  public void test222() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test222"); }


    tp2.IP iP0 = null;
    tp2.IPBan iPBan2 = new tp2.IPBan(iP0, (java.lang.Long)10L);
    tp2.IP iP3 = iPBan2.getIp();
    iPBan2.expires = 0L;
    tp2.IP iP6 = iPBan2.ip;
    tp2.Server server7 = new tp2.Server();
    tp2.IP iP8 = null;
    boolean b9 = server7.addBan(iP8);
    tp2.IP iP14 = new tp2.IP((java.lang.Integer)31, (java.lang.Integer)31, (java.lang.Integer)31, (java.lang.Integer)0);
    iP14.setSecond((java.lang.Integer)2147483647);
    boolean b17 = server7.addBan(iP14);
    tp2.Server server18 = new tp2.Server();
    tp2.IP iP19 = null;
    boolean b20 = server18.addBan(iP19);
    tp2.ITime iTime21 = null;
    server18.setTime(iTime21);
    tp2.IP iP23 = null;
    tp2.IPBan iPBan25 = new tp2.IPBan(iP23, (java.lang.Long)10L);
    tp2.IP iP26 = iPBan25.getIp();
    java.lang.Long long27 = iPBan25.expires;
    tp2.IP iP28 = null;
    iPBan25.ip = iP28;
    tp2.Server server30 = new tp2.Server();
    tp2.IP iP35 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b36 = server30.removeException(iP35);
    java.lang.Integer i37 = iP35.getFirst();
    iPBan25.setIp(iP35);
    boolean b39 = server18.connect(iP35);
    boolean b40 = server7.removeBan(iP35);
    iPBan2.ip = iP35;
    java.lang.Integer i42 = iP35.getFirst();
    tp2.IP iP43 = null;
    tp2.IPBan iPBan45 = new tp2.IPBan(iP43, (java.lang.Long)10L);
    tp2.IP iP46 = iPBan45.getIp();
    java.lang.Long long47 = iPBan45.expires;
    tp2.IP iP48 = null;
    iPBan45.ip = iP48;
    java.lang.Long long50 = iPBan45.expires;
    tp2.Server server51 = new tp2.Server();
    tp2.IP iP56 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b57 = server51.removeException(iP56);
    iP56.setThird((java.lang.Integer)56);
    java.lang.Integer i60 = iP56.getFourth();
    tp2.IPBan iPBan62 = new tp2.IPBan(iP56, (java.lang.Long)10L);
    iPBan45.setIp(iP56);
    tp2.IP iP64 = iPBan45.ip;
    tp2.IP iP65 = iPBan45.getIp();
    java.lang.Long long66 = iPBan45.getExpires();
    java.lang.Long long67 = iPBan45.expires;
    boolean b68 = iP35.equals((java.lang.Object)long67);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long27 + "' != '" + 10L+ "'", long27.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i37 + "' != '" + 161+ "'", i37.equals(161));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i42 + "' != '" + 161+ "'", i42.equals(161));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long47 + "' != '" + 10L+ "'", long47.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long50 + "' != '" + 10L+ "'", long50.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b57 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i60 + "' != '" + 5+ "'", i60.equals(5));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP64);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP65);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long66 + "' != '" + 10L+ "'", long66.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long67 + "' != '" + 10L+ "'", long67.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b68 == false);

  }

  @Test
  public void test223() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test223"); }


    java.lang.String str1 = java.lang.Integer.toUnsignedString(4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "4"+ "'", str1.equals("4"));

  }

  @Test
  public void test224() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test224"); }


    // The following exception was thrown during execution in test generation
    try {
      java.lang.Integer i2 = java.lang.Integer.valueOf("10000101000000000000000001110000", 229376);
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test225() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test225"); }


    int i2 = java.lang.Integer.max(1, (-2063597456));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);

  }

  @Test
  public void test226() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test226"); }


    int i1 = java.lang.Integer.lowestOneBit((-2063597440));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 128);

  }

  @Test
  public void test227() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test227"); }


    int i2 = java.lang.Integer.compareUnsigned(33554624, 1493172585);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == (-1));

  }

  @Test
  public void test228() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test228"); }


    // The following exception was thrown during execution in test generation
    try {
      java.lang.Integer i2 = java.lang.Integer.valueOf("1762", 289406976);
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test229() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test229"); }


    int i2 = java.lang.Integer.compareUnsigned((-2147483502), 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);

  }

  @Test
  public void test230() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test230"); }


    int i1 = java.lang.Integer.numberOfLeadingZeros(29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 27);

  }

  @Test
  public void test231() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test231"); }


    java.lang.Integer i1 = java.lang.Integer.getInteger("10204100010");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);

  }

  @Test
  public void test232() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test232"); }


    // The following exception was thrown during execution in test generation
    try {
      int i2 = java.lang.Integer.parseUnsignedInt("18", 5);
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test233() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test233"); }


    java.lang.String str2 = java.lang.Integer.toUnsignedString(247, 56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "247"+ "'", str2.equals("247"));

  }

  @Test
  public void test234() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test234"); }


    // The following exception was thrown during execution in test generation
    try {
      korat.finitization.IFinitization iFinitization1 = tp2.Server.finServer(631);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test235() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test235"); }


    int i1 = java.lang.Integer.highestOneBit(352322596);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 268435456);

  }

  @Test
  public void test236() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test236"); }


    int i2 = java.lang.Integer.compareUnsigned((-1593835520), 51211);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);

  }

  @Test
  public void test237() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test237"); }


    java.lang.String str1 = java.lang.Integer.toBinaryString((-2013265918));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "10001000000000000000000000000010"+ "'", str1.equals("10001000000000000000000000000010"));

  }

  @Test
  public void test238() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test238"); }


    int i2 = java.lang.Integer.compare((-2144814612), 1879047772);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == (-1));

  }

  @Test
  public void test239() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test239"); }


    int i2 = java.lang.Integer.remainderUnsigned(33600000, 65536);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 45568);

  }

  @Test
  public void test240() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test240"); }


    tp2.Server server0 = new tp2.Server();
    tp2.IP iP1 = null;
    boolean b2 = server0.addBan(iP1);
    tp2.Server server3 = new tp2.Server();
    tp2.IP iP8 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b9 = server3.removeException(iP8);
    boolean b11 = iP8.equals((java.lang.Object)(-1L));
    boolean b12 = server0.removeBan(iP8);
    tp2.IP iP17 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    iP17.setFirst((java.lang.Integer)161);
    iP17.setThird((java.lang.Integer)3);
    iP17.setFirst((java.lang.Integer)26);
    boolean b24 = server0.connect(iP17);
    tp2.ITime iTime25 = null;
    server0.setTime(iTime25);
    tp2.Server server27 = new tp2.Server();
    tp2.IP iP32 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b33 = server27.removeException(iP32);
    server27.update();
    tp2.Server server35 = new tp2.Server();
    tp2.IP iP40 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b41 = server35.removeException(iP40);
    java.lang.Integer i42 = iP40.getFirst();
    boolean b43 = server27.addBan(iP40);
    boolean b45 = iP40.equals((java.lang.Object)(short)10);
    iP40.setSecond((java.lang.Integer)(-134217728));
    java.lang.Integer i48 = iP40.getFourth();
    boolean b49 = server0.removeException(iP40);
    tp2.Server server50 = new tp2.Server();
    tp2.IP iP55 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b56 = server50.removeException(iP55);
    iP55.setThird((java.lang.Integer)56);
    boolean b59 = server0.removeException(iP55);
    iP55.setFirst((java.lang.Integer)(-1593835520));
    iP55.setFourth((java.lang.Integer)(-1291845532));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i42 + "' != '" + 161+ "'", i42.equals(161));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b43 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i48 + "' != '" + 5+ "'", i48.equals(5));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b49 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b56 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b59 == false);

  }

  @Test
  public void test241() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test241"); }


    // The following exception was thrown during execution in test generation
    try {
      int i2 = java.lang.Integer.parseInt("8000000", 20320);
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test242() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test242"); }


    tp2.Server server0 = new tp2.Server();
    tp2.IP iP5 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b6 = server0.removeException(iP5);
    iP5.setThird((java.lang.Integer)56);
    java.lang.Integer i9 = iP5.getFourth();
    tp2.IPBan iPBan11 = new tp2.IPBan(iP5, (java.lang.Long)10L);
    iPBan11.expires = 2147483647L;
    tp2.Server server14 = new tp2.Server();
    tp2.IP iP15 = null;
    boolean b16 = server14.addBan(iP15);
    tp2.Server server17 = new tp2.Server();
    tp2.IP iP22 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b23 = server17.removeException(iP22);
    boolean b25 = iP22.equals((java.lang.Object)(-1L));
    boolean b26 = server14.removeBan(iP22);
    tp2.IP iP31 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    iP31.setFirst((java.lang.Integer)161);
    iP31.setThird((java.lang.Integer)3);
    iP31.setFirst((java.lang.Integer)26);
    boolean b38 = server14.connect(iP31);
    tp2.IP iP43 = new tp2.IP((java.lang.Integer)2147483647, (java.lang.Integer)(-1), (java.lang.Integer)56, (java.lang.Integer)458752);
    boolean b44 = server14.addException(iP43);
    iP43.setFirst((java.lang.Integer)1677721600);
    iPBan11.ip = iP43;
    iPBan11.setExpires((java.lang.Long)84410368L);
    tp2.Server server50 = new tp2.Server();
    tp2.IP iP51 = null;
    boolean b52 = server50.connect(iP51);
    tp2.IP iP57 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    iP57.setFirst((java.lang.Integer)161);
    boolean b61 = iP57.equals((java.lang.Object)56);
    java.lang.Integer i62 = iP57.getFourth();
    boolean b63 = server50.removeBan(iP57);
    iPBan11.setIp(iP57);
    iP57.setThird((java.lang.Integer)47463);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 5+ "'", i9.equals(5));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b52 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b61 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i62 + "' != '" + 5+ "'", i62.equals(5));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b63 == false);

  }

  @Test
  public void test243() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test243"); }


    java.lang.String str1 = java.lang.Integer.toOctalString((-1240662016));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "26603200000"+ "'", str1.equals("26603200000"));

  }

  @Test
  public void test244() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test244"); }


    tp2.Server server0 = new tp2.Server();
    tp2.IP iP1 = null;
    boolean b2 = server0.addBan(iP1);
    tp2.IP iP7 = new tp2.IP((java.lang.Integer)31, (java.lang.Integer)31, (java.lang.Integer)31, (java.lang.Integer)0);
    iP7.setSecond((java.lang.Integer)2147483647);
    boolean b10 = server0.addBan(iP7);
    tp2.IP iP15 = new tp2.IP((java.lang.Integer)133, (java.lang.Integer)(-2147483515), (java.lang.Integer)79, (java.lang.Integer)(-2147483620));
    boolean b16 = server0.removeBan(iP15);
    tp2.IP iP17 = null;
    tp2.IPBan iPBan19 = new tp2.IPBan(iP17, (java.lang.Long)10L);
    java.lang.Long long20 = iPBan19.getExpires();
    tp2.IP iP25 = new tp2.IP((java.lang.Integer)31, (java.lang.Integer)31, (java.lang.Integer)31, (java.lang.Integer)0);
    iPBan19.ip = iP25;
    tp2.Server server27 = new tp2.Server();
    tp2.IP iP32 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b33 = server27.removeException(iP32);
    server27.update();
    tp2.Server server35 = new tp2.Server();
    tp2.IP iP40 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b41 = server35.removeException(iP40);
    java.lang.Integer i42 = iP40.getFirst();
    boolean b43 = server27.addBan(iP40);
    iPBan19.setIp(iP40);
    tp2.IP iP45 = iPBan19.ip;
    tp2.IP iP46 = iPBan19.ip;
    boolean b47 = server0.removeException(iP46);
    tp2.Server server48 = new tp2.Server();
    tp2.IP iP53 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b54 = server48.removeException(iP53);
    iP53.setThird((java.lang.Integer)56);
    tp2.IPBan iPBan58 = new tp2.IPBan(iP53, (java.lang.Long)2147483676L);
    java.lang.Long long59 = null;
    tp2.IPBan iPBan60 = new tp2.IPBan(iP53, long59);
    java.lang.Integer i61 = iP53.getFourth();
    boolean b62 = server0.removeException(iP53);
    iP53.setFirst((java.lang.Integer)165675008);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long20 + "' != '" + 10L+ "'", long20.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i42 + "' != '" + 161+ "'", i42.equals(161));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b43 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b47 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b54 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i61 + "' != '" + 5+ "'", i61.equals(5));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b62 == false);

  }

  @Test
  public void test245() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test245"); }


    tp2.IP iP0 = null;
    tp2.IPBan iPBan2 = new tp2.IPBan(iP0, (java.lang.Long)10L);
    java.lang.Long long3 = iPBan2.getExpires();
    tp2.IP iP8 = new tp2.IP((java.lang.Integer)31, (java.lang.Integer)31, (java.lang.Integer)31, (java.lang.Integer)0);
    iPBan2.ip = iP8;
    iPBan2.setExpires((java.lang.Long)(-1L));
    iPBan2.expires = 2013262563L;
    java.lang.Long long14 = iPBan2.getExpires();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L+ "'", long3.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long14 + "' != '" + 2013262563L+ "'", long14.equals(2013262563L));

  }

  @Test
  public void test246() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test246"); }


    tp2.IP iP0 = null;
    tp2.IPBan iPBan2 = new tp2.IPBan(iP0, (java.lang.Long)10L);
    tp2.IP iP3 = iPBan2.getIp();
    java.lang.Long long4 = iPBan2.expires;
    tp2.IP iP5 = null;
    iPBan2.ip = iP5;
    tp2.Server server7 = new tp2.Server();
    tp2.IP iP8 = null;
    boolean b9 = server7.addBan(iP8);
    tp2.ITime iTime10 = null;
    server7.setTime(iTime10);
    tp2.IP iP12 = null;
    tp2.IPBan iPBan14 = new tp2.IPBan(iP12, (java.lang.Long)10L);
    tp2.IP iP15 = iPBan14.getIp();
    java.lang.Long long16 = iPBan14.expires;
    tp2.IP iP17 = null;
    iPBan14.ip = iP17;
    tp2.Server server19 = new tp2.Server();
    tp2.IP iP24 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b25 = server19.removeException(iP24);
    java.lang.Integer i26 = iP24.getFirst();
    iPBan14.setIp(iP24);
    boolean b28 = server7.connect(iP24);
    iPBan2.setIp(iP24);
    iP24.setThird((java.lang.Integer)1023410176);
    tp2.IPBan iPBan33 = new tp2.IPBan(iP24, (java.lang.Long)2147483647L);
    java.lang.Long long34 = iPBan33.getExpires();
    tp2.IP iP35 = null;
    tp2.IPBan iPBan37 = new tp2.IPBan(iP35, (java.lang.Long)10L);
    tp2.IP iP38 = iPBan37.getIp();
    tp2.IP iP43 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    iP43.setFirst((java.lang.Integer)161);
    iP43.setThird((java.lang.Integer)3);
    iP43.setFirst((java.lang.Integer)26);
    iPBan37.ip = iP43;
    tp2.IP iP51 = iPBan37.getIp();
    tp2.Server server52 = new tp2.Server();
    tp2.IP iP53 = null;
    boolean b54 = server52.addBan(iP53);
    server52.update();
    tp2.IP iP60 = new tp2.IP((java.lang.Integer)31, (java.lang.Integer)31, (java.lang.Integer)31, (java.lang.Integer)0);
    boolean b61 = server52.removeBan(iP60);
    server52.update();
    tp2.IP iP67 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    iP67.setFirst((java.lang.Integer)161);
    iP67.setThird((java.lang.Integer)3);
    iP67.setFirst((java.lang.Integer)26);
    iP67.setFirst((java.lang.Integer)(-2147483592));
    boolean b76 = server52.removeBan(iP67);
    iPBan37.ip = iP67;
    iP67.setThird((java.lang.Integer)524288);
    iPBan33.ip = iP67;
    java.lang.Integer i81 = iP67.getFourth();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L+ "'", long4.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long16 + "' != '" + 10L+ "'", long16.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i26 + "' != '" + 161+ "'", i26.equals(161));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long34 + "' != '" + 2147483647L+ "'", long34.equals(2147483647L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b54 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b61 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b76 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i81 + "' != '" + 5+ "'", i81.equals(5));

  }

  @Test
  public void test247() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test247"); }


    tp2.IP iP4 = new tp2.IP((java.lang.Integer)56, (java.lang.Integer)161, (java.lang.Integer)32, (java.lang.Integer)0);
    java.lang.Integer i5 = null;
    iP4.setFourth(i5);
    iP4.setFirst((java.lang.Integer)61);

  }

  @Test
  public void test248() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test248"); }


    tp2.IP iP0 = null;
    tp2.IPBan iPBan2 = new tp2.IPBan(iP0, (java.lang.Long)10L);
    java.lang.Long long3 = iPBan2.getExpires();
    tp2.IP iP8 = new tp2.IP((java.lang.Integer)31, (java.lang.Integer)31, (java.lang.Integer)31, (java.lang.Integer)0);
    iPBan2.ip = iP8;
    iPBan2.setExpires((java.lang.Long)(-1L));
    java.lang.Long long12 = iPBan2.expires;
    iPBan2.setExpires((java.lang.Long)1L);
    java.lang.Long long15 = iPBan2.expires;
    tp2.Server server16 = new tp2.Server();
    tp2.IP iP21 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b22 = server16.removeException(iP21);
    server16.update();
    tp2.Server server24 = new tp2.Server();
    tp2.IP iP25 = null;
    boolean b26 = server24.addBan(iP25);
    tp2.Server server27 = new tp2.Server();
    tp2.IP iP32 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b33 = server27.removeException(iP32);
    boolean b35 = iP32.equals((java.lang.Object)(-1L));
    boolean b36 = server24.removeBan(iP32);
    tp2.IP iP41 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    iP41.setFirst((java.lang.Integer)161);
    iP41.setThird((java.lang.Integer)3);
    iP41.setFirst((java.lang.Integer)26);
    boolean b48 = server24.connect(iP41);
    iP41.setSecond((java.lang.Integer)1677721761);
    boolean b51 = server16.removeBan(iP41);
    tp2.Server server52 = new tp2.Server();
    tp2.IP iP53 = null;
    boolean b54 = server52.addBan(iP53);
    tp2.ITime iTime55 = null;
    server52.setTime(iTime55);
    tp2.IP iP57 = null;
    tp2.IPBan iPBan59 = new tp2.IPBan(iP57, (java.lang.Long)10L);
    tp2.IP iP60 = iPBan59.getIp();
    java.lang.Long long61 = iPBan59.expires;
    tp2.IP iP62 = null;
    iPBan59.ip = iP62;
    tp2.Server server64 = new tp2.Server();
    tp2.IP iP69 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b70 = server64.removeException(iP69);
    java.lang.Integer i71 = iP69.getFirst();
    iPBan59.setIp(iP69);
    boolean b73 = server52.connect(iP69);
    iP69.setFourth((java.lang.Integer)(-1));
    boolean b76 = server16.removeException(iP69);
    iPBan2.setIp(iP69);
    iP69.setThird((java.lang.Integer)448);
    tp2.IPBan iPBan81 = new tp2.IPBan(iP69, (java.lang.Long)35320L);
    java.lang.Integer i82 = iP69.getSecond();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L+ "'", long3.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1L)+ "'", long12.equals((-1L)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long15 + "' != '" + 1L+ "'", long15.equals(1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b48 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b51 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b54 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP60);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long61 + "' != '" + 10L+ "'", long61.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b70 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i71 + "' != '" + 161+ "'", i71.equals(161));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b73 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b76 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i82 + "' != '" + (-2147483648)+ "'", i82.equals((-2147483648)));

  }

  @Test
  public void test249() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test249"); }


    java.lang.String str2 = java.lang.Integer.toUnsignedString(524288, 5256300);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "524288"+ "'", str2.equals("524288"));

  }

  @Test
  public void test250() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test250"); }


    int i2 = java.lang.Integer.min(20320, 1668547584);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 20320);

  }

  @Test
  public void test251() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test251"); }


    int i1 = java.lang.Integer.reverse(186646533);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == (-1610611504));

  }

  @Test
  public void test252() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test252"); }


    int i1 = java.lang.Integer.reverseBytes(27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 452984832);

  }

  @Test
  public void test253() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test253"); }


    int i2 = java.lang.Integer.remainderUnsigned((-917405696), 36871);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 30516);

  }

  @Test
  public void test254() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test254"); }


    int i1 = java.lang.Integer.lowestOneBit(1779048192);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 256);

  }

  @Test
  public void test255() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test255"); }


    int i1 = java.lang.Integer.reverseBytes(38000035);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == (-1546304766));

  }

  @Test
  public void test256() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test256"); }


    int i2 = java.lang.Integer.rotateRight(1074274564, 8388608);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1074274564);

  }

  @Test
  public void test257() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test257"); }


    tp2.Server server0 = new tp2.Server();
    tp2.IP iP1 = null;
    boolean b2 = server0.addBan(iP1);
    tp2.ITime iTime3 = null;
    server0.setTime(iTime3);
    server0.update();
    tp2.Server server6 = new tp2.Server();
    tp2.IP iP11 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b12 = server6.removeException(iP11);
    boolean b13 = server0.addException(iP11);
    java.lang.Integer i14 = iP11.getSecond();
    java.lang.Integer i15 = iP11.getFirst();
    java.lang.Integer i16 = iP11.getThird();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i14 + "' != '" + (-2147483648)+ "'", i14.equals((-2147483648)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i15 + "' != '" + 161+ "'", i15.equals(161));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i16 + "' != '" + 939524096+ "'", i16.equals(939524096));

  }

  @Test
  public void test258() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test258"); }


    // The following exception was thrown during execution in test generation
    try {
      int i1 = java.lang.Integer.parseInt("a17342da");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test259() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test259"); }


    int i1 = java.lang.Integer.reverseBytes(2362614);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == (-166976512));

  }

  @Test
  public void test260() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test260"); }


    java.lang.Integer i1 = java.lang.Integer.getInteger("4160749568");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);

  }

  @Test
  public void test261() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test261"); }


    tp2.Server server0 = new tp2.Server();
    tp2.IP iP1 = null;
    boolean b2 = server0.addBan(iP1);
    server0.update();
    tp2.IP iP4 = null;
    tp2.IPBan iPBan6 = new tp2.IPBan(iP4, (java.lang.Long)10L);
    tp2.IP iP7 = iPBan6.getIp();
    java.lang.Long long8 = iPBan6.expires;
    tp2.IP iP9 = null;
    iPBan6.ip = iP9;
    tp2.IP iP11 = null;
    tp2.IPBan iPBan13 = new tp2.IPBan(iP11, (java.lang.Long)10L);
    tp2.IP iP14 = iPBan13.getIp();
    java.lang.Long long15 = iPBan13.expires;
    tp2.Server server16 = new tp2.Server();
    tp2.IP iP21 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b22 = server16.removeException(iP21);
    java.lang.Integer i23 = iP21.getFirst();
    iPBan13.setIp(iP21);
    tp2.IP iP25 = iPBan13.ip;
    tp2.IP iP26 = iPBan13.getIp();
    iPBan6.setIp(iP26);
    boolean b28 = server0.addException(iP26);
    tp2.IPBan iPBan30 = new tp2.IPBan(iP26, (java.lang.Long)62L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long8 + "' != '" + 10L+ "'", long8.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long15 + "' != '" + 10L+ "'", long15.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i23 + "' != '" + 161+ "'", i23.equals(161));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == true);

  }

  @Test
  public void test262() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test262"); }


    java.lang.String str1 = java.lang.Integer.toHexString(3640);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "e38"+ "'", str1.equals("e38"));

  }

  @Test
  public void test263() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test263"); }


    int i1 = java.lang.Integer.bitCount(1073741887);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 7);

  }

  @Test
  public void test264() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test264"); }


    tp2.IP iP0 = null;
    tp2.IPBan iPBan2 = new tp2.IPBan(iP0, (java.lang.Long)10L);
    java.lang.Long long3 = iPBan2.getExpires();
    tp2.IP iP8 = new tp2.IP((java.lang.Integer)31, (java.lang.Integer)31, (java.lang.Integer)31, (java.lang.Integer)0);
    iPBan2.ip = iP8;
    tp2.Server server10 = new tp2.Server();
    tp2.IP iP11 = null;
    boolean b12 = server10.addBan(iP11);
    tp2.IP iP17 = new tp2.IP((java.lang.Integer)31, (java.lang.Integer)31, (java.lang.Integer)31, (java.lang.Integer)0);
    iP17.setSecond((java.lang.Integer)2147483647);
    boolean b20 = server10.addBan(iP17);
    tp2.IP iP25 = new tp2.IP((java.lang.Integer)133, (java.lang.Integer)(-2147483515), (java.lang.Integer)79, (java.lang.Integer)(-2147483620));
    boolean b26 = server10.removeBan(iP25);
    tp2.IP iP27 = null;
    tp2.IPBan iPBan29 = new tp2.IPBan(iP27, (java.lang.Long)10L);
    java.lang.Long long30 = iPBan29.getExpires();
    tp2.IP iP35 = new tp2.IP((java.lang.Integer)31, (java.lang.Integer)31, (java.lang.Integer)31, (java.lang.Integer)0);
    iPBan29.ip = iP35;
    tp2.Server server37 = new tp2.Server();
    tp2.IP iP42 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b43 = server37.removeException(iP42);
    server37.update();
    tp2.Server server45 = new tp2.Server();
    tp2.IP iP50 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b51 = server45.removeException(iP50);
    java.lang.Integer i52 = iP50.getFirst();
    boolean b53 = server37.addBan(iP50);
    iPBan29.setIp(iP50);
    tp2.IP iP55 = iPBan29.ip;
    tp2.IP iP56 = iPBan29.ip;
    boolean b57 = server10.removeException(iP56);
    iPBan2.ip = iP56;
    iPBan2.setExpires((java.lang.Long)2147483676L);
    java.lang.Long long61 = iPBan2.expires;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L+ "'", long3.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long30 + "' != '" + 10L+ "'", long30.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b43 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b51 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i52 + "' != '" + 161+ "'", i52.equals(161));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b53 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP55);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b57 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long61 + "' != '" + 2147483676L+ "'", long61.equals(2147483676L));

  }

  @Test
  public void test265() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test265"); }


    tp2.IP iP0 = null;
    tp2.IPBan iPBan2 = new tp2.IPBan(iP0, (java.lang.Long)10L);
    tp2.IP iP3 = iPBan2.getIp();
    iPBan2.expires = 0L;
    tp2.IP iP6 = iPBan2.ip;
    tp2.Server server7 = new tp2.Server();
    tp2.IP iP8 = null;
    boolean b9 = server7.addBan(iP8);
    tp2.IP iP14 = new tp2.IP((java.lang.Integer)31, (java.lang.Integer)31, (java.lang.Integer)31, (java.lang.Integer)0);
    iP14.setSecond((java.lang.Integer)2147483647);
    boolean b17 = server7.addBan(iP14);
    tp2.Server server18 = new tp2.Server();
    tp2.IP iP19 = null;
    boolean b20 = server18.addBan(iP19);
    tp2.ITime iTime21 = null;
    server18.setTime(iTime21);
    tp2.IP iP23 = null;
    tp2.IPBan iPBan25 = new tp2.IPBan(iP23, (java.lang.Long)10L);
    tp2.IP iP26 = iPBan25.getIp();
    java.lang.Long long27 = iPBan25.expires;
    tp2.IP iP28 = null;
    iPBan25.ip = iP28;
    tp2.Server server30 = new tp2.Server();
    tp2.IP iP35 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b36 = server30.removeException(iP35);
    java.lang.Integer i37 = iP35.getFirst();
    iPBan25.setIp(iP35);
    boolean b39 = server18.connect(iP35);
    boolean b40 = server7.removeBan(iP35);
    iPBan2.ip = iP35;
    iPBan2.setExpires((java.lang.Long)2013262563L);
    iPBan2.expires = 458752L;
    tp2.IP iP46 = iPBan2.ip;
    tp2.IP iP51 = new tp2.IP((java.lang.Integer)(-1207959532), (java.lang.Integer)1073741841, (java.lang.Integer)2031690, (java.lang.Integer)32768);
    iPBan2.setIp(iP51);
    tp2.IP iP53 = iPBan2.ip;
    tp2.IP iP54 = iPBan2.getIp();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long27 + "' != '" + 10L+ "'", long27.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i37 + "' != '" + 161+ "'", i37.equals(161));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP54);

  }

  @Test
  public void test266() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test266"); }


    tp2.IP iP0 = null;
    tp2.IPBan iPBan2 = new tp2.IPBan(iP0, (java.lang.Long)10L);
    tp2.IP iP3 = iPBan2.getIp();
    iPBan2.expires = 0L;
    tp2.IP iP6 = iPBan2.ip;
    tp2.Server server7 = new tp2.Server();
    tp2.IP iP8 = null;
    boolean b9 = server7.addBan(iP8);
    tp2.IP iP14 = new tp2.IP((java.lang.Integer)31, (java.lang.Integer)31, (java.lang.Integer)31, (java.lang.Integer)0);
    iP14.setSecond((java.lang.Integer)2147483647);
    boolean b17 = server7.addBan(iP14);
    tp2.Server server18 = new tp2.Server();
    tp2.IP iP19 = null;
    boolean b20 = server18.addBan(iP19);
    tp2.ITime iTime21 = null;
    server18.setTime(iTime21);
    tp2.IP iP23 = null;
    tp2.IPBan iPBan25 = new tp2.IPBan(iP23, (java.lang.Long)10L);
    tp2.IP iP26 = iPBan25.getIp();
    java.lang.Long long27 = iPBan25.expires;
    tp2.IP iP28 = null;
    iPBan25.ip = iP28;
    tp2.Server server30 = new tp2.Server();
    tp2.IP iP35 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b36 = server30.removeException(iP35);
    java.lang.Integer i37 = iP35.getFirst();
    iPBan25.setIp(iP35);
    boolean b39 = server18.connect(iP35);
    boolean b40 = server7.removeBan(iP35);
    iPBan2.ip = iP35;
    iPBan2.setExpires((java.lang.Long)2013262563L);
    iPBan2.expires = 458752L;
    tp2.IP iP46 = iPBan2.ip;
    tp2.IP iP51 = new tp2.IP((java.lang.Integer)(-1207959532), (java.lang.Integer)1073741841, (java.lang.Integer)2031690, (java.lang.Integer)32768);
    iPBan2.setIp(iP51);
    tp2.IP iP53 = iPBan2.ip;
    java.lang.Integer i54 = iP53.getSecond();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long27 + "' != '" + 10L+ "'", long27.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i37 + "' != '" + 161+ "'", i37.equals(161));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i54 + "' != '" + 1073741841+ "'", i54.equals(1073741841));

  }

  @Test
  public void test267() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test267"); }


    int i1 = java.lang.Integer.numberOfLeadingZeros(1677721600);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 1);

  }

  @Test
  public void test268() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test268"); }


    // The following exception was thrown during execution in test generation
    try {
      int i2 = java.lang.Integer.parseInt("4400000000", 1493172264);
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test269() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test269"); }


    int i2 = java.lang.Integer.remainderUnsigned(11024896, (-2013265918));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 11024896);

  }

  @Test
  public void test270() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test270"); }


    int i1 = java.lang.Integer.bitCount((-2136468991));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 7);

  }

  @Test
  public void test271() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test271"); }


    java.lang.Integer i2 = java.lang.Integer.getInteger("20000000000", 2000);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i2 + "' != '" + 2000+ "'", i2.equals(2000));

  }

  @Test
  public void test272() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test272"); }


    tp2.Server server0 = new tp2.Server();
    tp2.IP iP1 = null;
    boolean b2 = server0.addBan(iP1);
    server0.update();
    tp2.IP iP8 = new tp2.IP((java.lang.Integer)31, (java.lang.Integer)31, (java.lang.Integer)31, (java.lang.Integer)0);
    boolean b9 = server0.removeBan(iP8);
    tp2.Server server10 = new tp2.Server();
    tp2.IP iP11 = null;
    boolean b12 = server10.addBan(iP11);
    server10.update();
    tp2.IP iP18 = new tp2.IP((java.lang.Integer)31, (java.lang.Integer)31, (java.lang.Integer)31, (java.lang.Integer)0);
    boolean b19 = server10.removeBan(iP18);
    server10.update();
    tp2.IP iP25 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    iP25.setFirst((java.lang.Integer)161);
    iP25.setThird((java.lang.Integer)3);
    iP25.setFirst((java.lang.Integer)26);
    iP25.setFirst((java.lang.Integer)(-2147483592));
    boolean b34 = server10.removeBan(iP25);
    boolean b35 = server0.connect(iP25);
    tp2.IP iP36 = null;
    tp2.IPBan iPBan38 = new tp2.IPBan(iP36, (java.lang.Long)10L);
    tp2.IP iP39 = iPBan38.getIp();
    java.lang.Long long40 = iPBan38.expires;
    tp2.IP iP41 = null;
    iPBan38.ip = iP41;
    tp2.Server server43 = new tp2.Server();
    tp2.IP iP48 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b49 = server43.removeException(iP48);
    java.lang.Integer i50 = iP48.getFirst();
    iPBan38.setIp(iP48);
    java.lang.Integer i52 = iP48.getFirst();
    boolean b54 = iP48.equals((java.lang.Object)(short)(-1));
    tp2.IPBan iPBan56 = new tp2.IPBan(iP48, (java.lang.Long)2147483676L);
    iP48.setThird((java.lang.Integer)100004);
    boolean b59 = server0.addBan(iP48);
    iP48.setFourth((java.lang.Integer)17104896);
    iP48.setFourth((java.lang.Integer)448);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long40 + "' != '" + 10L+ "'", long40.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b49 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i50 + "' != '" + 161+ "'", i50.equals(161));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i52 + "' != '" + 161+ "'", i52.equals(161));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b54 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b59 == true);

  }

  @Test
  public void test273() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test273"); }


    int i2 = java.lang.Integer.sum((-2147435994), 277211392);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == (-1870224602));

  }

  @Test
  public void test274() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test274"); }


    tp2.IP iP0 = null;
    tp2.IPBan iPBan2 = new tp2.IPBan(iP0, (java.lang.Long)10L);
    tp2.IP iP3 = iPBan2.getIp();
    java.lang.Long long4 = iPBan2.expires;
    tp2.IP iP5 = null;
    iPBan2.ip = iP5;
    tp2.Server server7 = new tp2.Server();
    tp2.IP iP12 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b13 = server7.removeException(iP12);
    java.lang.Integer i14 = iP12.getFirst();
    iPBan2.setIp(iP12);
    tp2.IP iP16 = iPBan2.getIp();
    tp2.Server server17 = new tp2.Server();
    tp2.IP iP18 = null;
    boolean b19 = server17.addBan(iP18);
    tp2.IP iP24 = new tp2.IP((java.lang.Integer)31, (java.lang.Integer)31, (java.lang.Integer)31, (java.lang.Integer)0);
    iP24.setSecond((java.lang.Integer)2147483647);
    boolean b27 = server17.addBan(iP24);
    tp2.Server server28 = new tp2.Server();
    tp2.IP iP29 = null;
    boolean b30 = server28.addBan(iP29);
    tp2.ITime iTime31 = null;
    server28.setTime(iTime31);
    tp2.IP iP33 = null;
    tp2.IPBan iPBan35 = new tp2.IPBan(iP33, (java.lang.Long)10L);
    tp2.IP iP36 = iPBan35.getIp();
    java.lang.Long long37 = iPBan35.expires;
    tp2.IP iP38 = null;
    iPBan35.ip = iP38;
    tp2.Server server40 = new tp2.Server();
    tp2.IP iP45 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b46 = server40.removeException(iP45);
    java.lang.Integer i47 = iP45.getFirst();
    iPBan35.setIp(iP45);
    boolean b49 = server28.connect(iP45);
    boolean b50 = server17.removeBan(iP45);
    tp2.IP iP55 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    iP55.setFirst((java.lang.Integer)161);
    boolean b59 = iP55.equals((java.lang.Object)56);
    boolean b60 = server17.removeException(iP55);
    boolean b61 = iP16.equals((java.lang.Object)b60);
    iP16.setFirst((java.lang.Integer)289406976);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L+ "'", long4.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i14 + "' != '" + 161+ "'", i14.equals(161));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long37 + "' != '" + 10L+ "'", long37.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b46 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i47 + "' != '" + 161+ "'", i47.equals(161));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b49 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b50 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b59 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b60 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b61 == false);

  }

  @Test
  public void test275() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test275"); }


    java.lang.String str1 = java.lang.Integer.toOctalString((-1586281810));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "24134641256"+ "'", str1.equals("24134641256"));

  }

  @Test
  public void test276() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test276"); }


    java.lang.String str2 = java.lang.Integer.toUnsignedString((-1878980514), 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "2415986782"+ "'", str2.equals("2415986782"));

  }

  @Test
  public void test277() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test277"); }


    int i1 = java.lang.Integer.numberOfLeadingZeros(62);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 26);

  }

  @Test
  public void test278() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test278"); }


    int i1 = java.lang.Integer.highestOneBit((-954435456));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == (-2147483648));

  }

  @Test
  public void test279() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test279"); }


    tp2.Server server0 = new tp2.Server();
    tp2.IP iP1 = null;
    boolean b2 = server0.connect(iP1);
    tp2.IP iP7 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)83, (java.lang.Integer)26, (java.lang.Integer)100);
    boolean b8 = server0.addBan(iP7);
    tp2.ITime iTime9 = null;
    server0.setTime(iTime9);
    tp2.IP iP11 = null;
    tp2.IPBan iPBan13 = new tp2.IPBan(iP11, (java.lang.Long)10L);
    tp2.IP iP14 = iPBan13.getIp();
    java.lang.Long long15 = iPBan13.expires;
    tp2.IP iP16 = null;
    iPBan13.ip = iP16;
    tp2.Server server18 = new tp2.Server();
    tp2.IP iP23 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b24 = server18.removeException(iP23);
    java.lang.Integer i25 = iP23.getFirst();
    iPBan13.setIp(iP23);
    java.lang.Integer i27 = iP23.getFirst();
    boolean b29 = iP23.equals((java.lang.Object)(short)(-1));
    java.lang.Integer i30 = iP23.getSecond();
    boolean b31 = server0.addException(iP23);
    tp2.Server server32 = new tp2.Server();
    tp2.IP iP33 = null;
    boolean b34 = server32.addBan(iP33);
    tp2.IP iP39 = new tp2.IP((java.lang.Integer)31, (java.lang.Integer)31, (java.lang.Integer)31, (java.lang.Integer)0);
    iP39.setSecond((java.lang.Integer)2147483647);
    boolean b42 = server32.addBan(iP39);
    tp2.Server server43 = new tp2.Server();
    tp2.IP iP44 = null;
    boolean b45 = server43.addBan(iP44);
    tp2.ITime iTime46 = null;
    server43.setTime(iTime46);
    tp2.IP iP48 = null;
    tp2.IPBan iPBan50 = new tp2.IPBan(iP48, (java.lang.Long)10L);
    tp2.IP iP51 = iPBan50.getIp();
    java.lang.Long long52 = iPBan50.expires;
    tp2.IP iP53 = null;
    iPBan50.ip = iP53;
    tp2.Server server55 = new tp2.Server();
    tp2.IP iP60 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b61 = server55.removeException(iP60);
    java.lang.Integer i62 = iP60.getFirst();
    iPBan50.setIp(iP60);
    boolean b64 = server43.connect(iP60);
    boolean b65 = server32.removeBan(iP60);
    tp2.ITime iTime66 = null;
    server32.setTime(iTime66);
    tp2.IP iP72 = new tp2.IP((java.lang.Integer)4, (java.lang.Integer)1342177288, (java.lang.Integer)13, (java.lang.Integer)536870926);
    boolean b73 = server32.removeException(iP72);
    boolean b74 = server0.addBan(iP72);
    iP72.setFirst((java.lang.Integer)(-134217728));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long15 + "' != '" + 10L+ "'", long15.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i25 + "' != '" + 161+ "'", i25.equals(161));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i27 + "' != '" + 161+ "'", i27.equals(161));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i30 + "' != '" + (-2147483648)+ "'", i30.equals((-2147483648)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long52 + "' != '" + 10L+ "'", long52.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b61 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i62 + "' != '" + 161+ "'", i62.equals(161));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b64 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b65 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b73 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b74 == true);

  }

  @Test
  public void test280() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test280"); }


    // The following exception was thrown during execution in test generation
    try {
      int i2 = java.lang.Integer.parseInt("3", 1270);
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test281() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test281"); }


    int i1 = java.lang.Integer.reverseBytes(145752064);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 45064);

  }

  @Test
  public void test282() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test282"); }


    int i2 = java.lang.Integer.max(469761943, (-150929408));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 469761943);

  }

  @Test
  public void test283() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test283"); }


    tp2.Server server0 = new tp2.Server();
    tp2.IP iP5 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b6 = server0.removeException(iP5);
    server0.update();
    tp2.Server server8 = new tp2.Server();
    tp2.IP iP13 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b14 = server8.removeException(iP13);
    java.lang.Integer i15 = iP13.getFirst();
    boolean b16 = server0.addBan(iP13);
    tp2.IP iP21 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    iP21.setFirst((java.lang.Integer)161);
    boolean b25 = iP21.equals((java.lang.Object)56);
    boolean b26 = server0.connect(iP21);
    tp2.IP iP27 = null;
    boolean b28 = server0.connect(iP27);
    tp2.Server server29 = new tp2.Server();
    tp2.IP iP30 = null;
    boolean b31 = server29.addBan(iP30);
    server29.update();
    tp2.IP iP33 = null;
    tp2.IPBan iPBan35 = new tp2.IPBan(iP33, (java.lang.Long)10L);
    tp2.IP iP36 = iPBan35.getIp();
    java.lang.Long long37 = iPBan35.expires;
    tp2.IP iP38 = null;
    iPBan35.ip = iP38;
    tp2.Server server40 = new tp2.Server();
    tp2.IP iP45 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b46 = server40.removeException(iP45);
    java.lang.Integer i47 = iP45.getFirst();
    iPBan35.setIp(iP45);
    java.lang.Integer i49 = iP45.getFirst();
    java.lang.Integer i50 = iP45.getFirst();
    boolean b51 = server29.addBan(iP45);
    boolean b52 = server0.removeBan(iP45);
    tp2.Server server53 = new tp2.Server();
    tp2.IP iP54 = null;
    boolean b55 = server53.addBan(iP54);
    tp2.Server server56 = new tp2.Server();
    tp2.IP iP61 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b62 = server56.removeException(iP61);
    boolean b64 = iP61.equals((java.lang.Object)(-1L));
    boolean b65 = server53.removeBan(iP61);
    tp2.IPBan iPBan67 = new tp2.IPBan(iP61, (java.lang.Long)(-1L));
    boolean b68 = server0.connect(iP61);
    tp2.ITime iTime69 = null;
    server0.setTime(iTime69);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i15 + "' != '" + 161+ "'", i15.equals(161));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long37 + "' != '" + 10L+ "'", long37.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b46 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i47 + "' != '" + 161+ "'", i47.equals(161));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i49 + "' != '" + 161+ "'", i49.equals(161));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i50 + "' != '" + 161+ "'", i50.equals(161));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b51 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b52 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b55 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b62 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b64 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b65 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b68 == true);

  }

  @Test
  public void test284() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test284"); }


    java.lang.String str1 = java.lang.Integer.toBinaryString((-1291845532));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "10110011000000000000000001100100"+ "'", str1.equals("10110011000000000000000001100100"));

  }

  @Test
  public void test285() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test285"); }


    tp2.Server server0 = new tp2.Server();
    tp2.IP iP5 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b6 = server0.removeException(iP5);
    server0.update();
    tp2.Server server8 = new tp2.Server();
    tp2.IP iP13 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b14 = server8.removeException(iP13);
    java.lang.Integer i15 = iP13.getFirst();
    boolean b16 = server0.addBan(iP13);
    tp2.IP iP21 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    iP21.setFirst((java.lang.Integer)161);
    boolean b25 = iP21.equals((java.lang.Object)56);
    boolean b26 = server0.connect(iP21);
    tp2.IP iP27 = null;
    boolean b28 = server0.connect(iP27);
    tp2.IP iP29 = null;
    tp2.IPBan iPBan31 = new tp2.IPBan(iP29, (java.lang.Long)10L);
    tp2.IP iP32 = iPBan31.getIp();
    java.lang.Long long33 = iPBan31.expires;
    tp2.Server server34 = new tp2.Server();
    tp2.IP iP39 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b40 = server34.removeException(iP39);
    java.lang.Integer i41 = iP39.getFirst();
    iPBan31.setIp(iP39);
    tp2.IP iP43 = iPBan31.ip;
    tp2.IP iP44 = null;
    tp2.IPBan iPBan46 = new tp2.IPBan(iP44, (java.lang.Long)10L);
    java.lang.Long long47 = iPBan46.getExpires();
    tp2.IP iP52 = new tp2.IP((java.lang.Integer)31, (java.lang.Integer)31, (java.lang.Integer)31, (java.lang.Integer)0);
    iPBan46.ip = iP52;
    iP52.setFirst((java.lang.Integer)2);
    iPBan31.setIp(iP52);
    tp2.Server server57 = new tp2.Server();
    tp2.IP iP58 = null;
    boolean b59 = server57.addBan(iP58);
    tp2.Server server60 = new tp2.Server();
    tp2.IP iP65 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b66 = server60.removeException(iP65);
    boolean b68 = iP65.equals((java.lang.Object)(-1L));
    boolean b69 = server57.removeBan(iP65);
    iPBan31.ip = iP65;
    iP65.setSecond((java.lang.Integer)28);
    java.lang.Integer i73 = iP65.getThird();
    boolean b75 = iP65.equals((java.lang.Object)531);
    boolean b76 = server0.addBan(iP65);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i15 + "' != '" + 161+ "'", i15.equals(161));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long33 + "' != '" + 10L+ "'", long33.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i41 + "' != '" + 161+ "'", i41.equals(161));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long47 + "' != '" + 10L+ "'", long47.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b59 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b66 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b68 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b69 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i73 + "' != '" + 939524096+ "'", i73.equals(939524096));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b75 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b76 == true);

  }

  @Test
  public void test286() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test286"); }


    // The following exception was thrown during execution in test generation
    try {
      int i2 = java.lang.Integer.divideUnsigned(1638400, 0);
      org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException");
    } catch (java.lang.ArithmeticException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArithmeticException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test287() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test287"); }


    // The following exception was thrown during execution in test generation
    try {
      int i2 = java.lang.Integer.parseUnsignedInt("260", 22528);
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test288() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test288"); }


    tp2.IP iP0 = null;
    tp2.IPBan iPBan2 = new tp2.IPBan(iP0, (java.lang.Long)10L);
    java.lang.Long long3 = iPBan2.getExpires();
    tp2.IP iP4 = iPBan2.getIp();
    tp2.IP iP5 = iPBan2.ip;
    java.lang.Long long6 = iPBan2.getExpires();
    java.lang.Long long7 = iPBan2.expires;
    java.lang.Long long8 = iPBan2.expires;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L+ "'", long3.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L+ "'", long6.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long7 + "' != '" + 10L+ "'", long7.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long8 + "' != '" + 10L+ "'", long8.equals(10L));

  }

  @Test
  public void test289() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test289"); }


    tp2.Server server0 = new tp2.Server();
    tp2.IP iP1 = null;
    boolean b2 = server0.addBan(iP1);
    tp2.Server server3 = new tp2.Server();
    tp2.IP iP8 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b9 = server3.removeException(iP8);
    boolean b11 = iP8.equals((java.lang.Object)(-1L));
    boolean b12 = server0.removeBan(iP8);
    server0.update();
    server0.update();
    tp2.Server server15 = new tp2.Server();
    tp2.IP iP20 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b21 = server15.removeException(iP20);
    server15.update();
    tp2.Server server23 = new tp2.Server();
    tp2.IP iP24 = null;
    boolean b25 = server23.addBan(iP24);
    tp2.Server server26 = new tp2.Server();
    tp2.IP iP31 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b32 = server26.removeException(iP31);
    boolean b34 = iP31.equals((java.lang.Object)(-1L));
    boolean b35 = server23.removeBan(iP31);
    tp2.IP iP40 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    iP40.setFirst((java.lang.Integer)161);
    iP40.setThird((java.lang.Integer)3);
    iP40.setFirst((java.lang.Integer)26);
    boolean b47 = server23.connect(iP40);
    iP40.setSecond((java.lang.Integer)1677721761);
    boolean b50 = server15.removeBan(iP40);
    tp2.Server server51 = new tp2.Server();
    tp2.IP iP56 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b57 = server51.removeException(iP56);
    server51.update();
    tp2.IP iP59 = null;
    tp2.IPBan iPBan61 = new tp2.IPBan(iP59, (java.lang.Long)10L);
    tp2.IP iP62 = iPBan61.ip;
    tp2.Server server63 = new tp2.Server();
    tp2.IP iP64 = null;
    boolean b65 = server63.addBan(iP64);
    tp2.Server server66 = new tp2.Server();
    tp2.IP iP71 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b72 = server66.removeException(iP71);
    boolean b74 = iP71.equals((java.lang.Object)(-1L));
    boolean b75 = server63.removeBan(iP71);
    iPBan61.ip = iP71;
    boolean b77 = server51.removeException(iP71);
    boolean b78 = server15.removeException(iP71);
    iP71.setFourth((java.lang.Integer)268435456);
    java.lang.Integer i81 = iP71.getThird();
    boolean b82 = server0.removeException(iP71);
    tp2.IPBan iPBan84 = new tp2.IPBan(iP71, (java.lang.Long)15505008L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b47 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b50 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b57 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP62);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b65 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b72 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b74 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b75 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b77 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b78 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i81 + "' != '" + 939524096+ "'", i81.equals(939524096));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b82 == false);

  }

  @Test
  public void test290() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test290"); }


    java.lang.Integer i1 = java.lang.Integer.getInteger("20000000205");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);

  }

  @Test
  public void test291() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test291"); }


    java.lang.Integer i1 = java.lang.Integer.getInteger("2707685376");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);

  }

  @Test
  public void test292() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test292"); }


    tp2.Server server0 = new tp2.Server();
    tp2.IP iP5 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b6 = server0.removeException(iP5);
    java.lang.Integer i7 = iP5.getFirst();
    tp2.IPBan iPBan9 = new tp2.IPBan(iP5, (java.lang.Long)2147483676L);
    tp2.IP iP14 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    iP14.setFirst((java.lang.Integer)161);
    boolean b18 = iP14.equals((java.lang.Object)56);
    java.lang.Integer i19 = iP14.getFirst();
    iPBan9.setIp(iP14);
    tp2.IP iP21 = iPBan9.getIp();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i7 + "' != '" + 161+ "'", i7.equals(161));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i19 + "' != '" + 161+ "'", i19.equals(161));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP21);

  }

  @Test
  public void test293() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test293"); }


    // The following exception was thrown during execution in test generation
    try {
      int i2 = java.lang.Integer.parseUnsignedInt("606ff7b", 66664134);
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test294() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test294"); }


    // The following exception was thrown during execution in test generation
    try {
      java.lang.Integer i2 = java.lang.Integer.valueOf("11700000000", 1677721600);
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test295() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test295"); }


    int i2 = java.lang.Integer.max(72, 24000000);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 24000000);

  }

  @Test
  public void test296() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test296"); }


    tp2.Server server0 = new tp2.Server();
    tp2.IP iP5 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b6 = server0.removeException(iP5);
    iP5.setThird((java.lang.Integer)56);
    java.lang.Integer i9 = iP5.getFourth();
    tp2.IPBan iPBan11 = new tp2.IPBan(iP5, (java.lang.Long)10L);
    iPBan11.expires = 2147483647L;
    tp2.IP iP14 = iPBan11.ip;
    tp2.IP iP15 = iPBan11.getIp();
    tp2.IP iP16 = iPBan11.ip;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 5+ "'", i9.equals(5));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP16);

  }

  @Test
  public void test297() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test297"); }


    java.lang.String str2 = java.lang.Integer.toUnsignedString(3997696, (-1879048031));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "3997696"+ "'", str2.equals("3997696"));

  }

  @Test
  public void test298() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test298"); }


    int i2 = java.lang.Integer.remainderUnsigned(0, 21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);

  }

  @Test
  public void test299() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test299"); }


    tp2.IP iP0 = null;
    tp2.IPBan iPBan2 = new tp2.IPBan(iP0, (java.lang.Long)10L);
    java.lang.Long long3 = iPBan2.getExpires();
    tp2.IP iP4 = iPBan2.getIp();
    iPBan2.setExpires((java.lang.Long)100L);
    tp2.IP iP7 = null;
    tp2.IPBan iPBan9 = new tp2.IPBan(iP7, (java.lang.Long)10L);
    java.lang.Long long10 = iPBan9.getExpires();
    tp2.IP iP15 = new tp2.IP((java.lang.Integer)31, (java.lang.Integer)31, (java.lang.Integer)31, (java.lang.Integer)0);
    iPBan9.ip = iP15;
    boolean b18 = iP15.equals((java.lang.Object)"20000000000");
    iPBan2.ip = iP15;
    iPBan2.expires = 2147483676L;
    tp2.Server server22 = new tp2.Server();
    tp2.IP iP27 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b28 = server22.removeException(iP27);
    boolean b30 = iP27.equals((java.lang.Object)(-1L));
    iP27.setFourth((java.lang.Integer)28);
    iP27.setThird((java.lang.Integer)100004);
    iPBan2.ip = iP27;
    tp2.IP iP36 = null;
    tp2.IPBan iPBan38 = new tp2.IPBan(iP36, (java.lang.Long)10L);
    tp2.IP iP39 = iPBan38.getIp();
    java.lang.Long long40 = iPBan38.expires;
    tp2.IP iP41 = null;
    iPBan38.ip = iP41;
    tp2.Server server43 = new tp2.Server();
    tp2.IP iP48 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b49 = server43.removeException(iP48);
    java.lang.Integer i50 = iP48.getFirst();
    iPBan38.setIp(iP48);
    java.lang.Long long52 = iPBan38.expires;
    tp2.IP iP53 = iPBan38.getIp();
    iP53.setFirst((java.lang.Integer)1677721761);
    iPBan2.ip = iP53;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L+ "'", long3.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long10 + "' != '" + 10L+ "'", long10.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long40 + "' != '" + 10L+ "'", long40.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b49 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i50 + "' != '" + 161+ "'", i50.equals(161));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long52 + "' != '" + 10L+ "'", long52.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP53);

  }

  @Test
  public void test300() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test300"); }


    tp2.Server server0 = new tp2.Server();
    tp2.IP iP1 = null;
    boolean b2 = server0.addBan(iP1);
    tp2.ITime iTime3 = null;
    server0.setTime(iTime3);
    tp2.IP iP5 = null;
    tp2.IPBan iPBan7 = new tp2.IPBan(iP5, (java.lang.Long)10L);
    tp2.IP iP8 = iPBan7.getIp();
    java.lang.Long long9 = iPBan7.expires;
    tp2.IP iP10 = null;
    iPBan7.ip = iP10;
    tp2.Server server12 = new tp2.Server();
    tp2.IP iP17 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b18 = server12.removeException(iP17);
    java.lang.Integer i19 = iP17.getFirst();
    iPBan7.setIp(iP17);
    iP17.setFourth((java.lang.Integer)(-2147483620));
    boolean b23 = server0.removeBan(iP17);
    java.lang.Integer i24 = iP17.getFirst();
    iP17.setThird((java.lang.Integer)62563);
    java.lang.Integer i27 = iP17.getFourth();
    iP17.setFirst((java.lang.Integer)5832);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long9 + "' != '" + 10L+ "'", long9.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i19 + "' != '" + 161+ "'", i19.equals(161));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i24 + "' != '" + 161+ "'", i24.equals(161));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i27 + "' != '" + (-2147483620)+ "'", i27.equals((-2147483620)));

  }

  @Test
  public void test301() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test301"); }


    tp2.IP iP0 = null;
    tp2.IPBan iPBan2 = new tp2.IPBan(iP0, (java.lang.Long)10L);
    tp2.IP iP3 = iPBan2.getIp();
    java.lang.Long long4 = iPBan2.expires;
    tp2.IP iP5 = null;
    iPBan2.ip = iP5;
    tp2.Server server7 = new tp2.Server();
    tp2.IP iP12 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b13 = server7.removeException(iP12);
    java.lang.Integer i14 = iP12.getFirst();
    iPBan2.setIp(iP12);
    tp2.IP iP16 = iPBan2.getIp();
    iPBan2.setExpires((java.lang.Long)2701131776L);
    tp2.IP iP19 = iPBan2.getIp();
    java.lang.Integer i20 = iP19.getFirst();
    iP19.setThird((java.lang.Integer)(-2147483502));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L+ "'", long4.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i14 + "' != '" + 161+ "'", i14.equals(161));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i20 + "' != '" + 161+ "'", i20.equals(161));

  }

  @Test
  public void test302() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test302"); }


    tp2.IP iP0 = null;
    tp2.IPBan iPBan2 = new tp2.IPBan(iP0, (java.lang.Long)10L);
    java.lang.Long long3 = iPBan2.getExpires();
    tp2.IP iP8 = new tp2.IP((java.lang.Integer)31, (java.lang.Integer)31, (java.lang.Integer)31, (java.lang.Integer)0);
    iPBan2.ip = iP8;
    tp2.Server server10 = new tp2.Server();
    tp2.IP iP11 = null;
    boolean b12 = server10.addBan(iP11);
    tp2.IP iP17 = new tp2.IP((java.lang.Integer)31, (java.lang.Integer)31, (java.lang.Integer)31, (java.lang.Integer)0);
    iP17.setSecond((java.lang.Integer)2147483647);
    boolean b20 = server10.addBan(iP17);
    tp2.IP iP25 = new tp2.IP((java.lang.Integer)133, (java.lang.Integer)(-2147483515), (java.lang.Integer)79, (java.lang.Integer)(-2147483620));
    boolean b26 = server10.removeBan(iP25);
    tp2.IP iP27 = null;
    tp2.IPBan iPBan29 = new tp2.IPBan(iP27, (java.lang.Long)10L);
    java.lang.Long long30 = iPBan29.getExpires();
    tp2.IP iP35 = new tp2.IP((java.lang.Integer)31, (java.lang.Integer)31, (java.lang.Integer)31, (java.lang.Integer)0);
    iPBan29.ip = iP35;
    tp2.Server server37 = new tp2.Server();
    tp2.IP iP42 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b43 = server37.removeException(iP42);
    server37.update();
    tp2.Server server45 = new tp2.Server();
    tp2.IP iP50 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b51 = server45.removeException(iP50);
    java.lang.Integer i52 = iP50.getFirst();
    boolean b53 = server37.addBan(iP50);
    iPBan29.setIp(iP50);
    tp2.IP iP55 = iPBan29.ip;
    tp2.IP iP56 = iPBan29.ip;
    boolean b57 = server10.removeException(iP56);
    iPBan2.ip = iP56;
    tp2.IP iP59 = iPBan2.getIp();
    iPBan2.expires = 31L;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L+ "'", long3.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long30 + "' != '" + 10L+ "'", long30.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b43 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b51 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i52 + "' != '" + 161+ "'", i52.equals(161));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b53 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP55);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b57 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP59);

  }

  @Test
  public void test303() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test303"); }


    java.lang.String str2 = java.lang.Integer.toUnsignedString(73728, 1041498176);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "73728"+ "'", str2.equals("73728"));

  }

  @Test
  public void test304() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test304"); }


    int i2 = java.lang.Integer.rotateRight((-939524092), 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == (-939524092));

  }

  @Test
  public void test305() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test305"); }


    int i2 = java.lang.Integer.rotateLeft(1344, (-2147435994));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 86016);

  }

  @Test
  public void test306() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test306"); }


    tp2.Server server0 = new tp2.Server();
    tp2.IP iP1 = null;
    boolean b2 = server0.addBan(iP1);
    tp2.IP iP7 = new tp2.IP((java.lang.Integer)31, (java.lang.Integer)31, (java.lang.Integer)31, (java.lang.Integer)0);
    iP7.setSecond((java.lang.Integer)2147483647);
    boolean b10 = server0.addBan(iP7);
    tp2.IP iP11 = null;
    tp2.IPBan iPBan13 = new tp2.IPBan(iP11, (java.lang.Long)10L);
    tp2.Server server14 = new tp2.Server();
    tp2.IP iP19 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b20 = server14.removeException(iP19);
    server14.update();
    tp2.Server server22 = new tp2.Server();
    tp2.IP iP23 = null;
    boolean b24 = server22.addBan(iP23);
    tp2.Server server25 = new tp2.Server();
    tp2.IP iP30 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b31 = server25.removeException(iP30);
    boolean b33 = iP30.equals((java.lang.Object)(-1L));
    boolean b34 = server22.removeBan(iP30);
    tp2.IP iP39 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    iP39.setFirst((java.lang.Integer)161);
    iP39.setThird((java.lang.Integer)3);
    iP39.setFirst((java.lang.Integer)26);
    boolean b46 = server22.connect(iP39);
    iP39.setSecond((java.lang.Integer)1677721761);
    boolean b49 = server14.removeBan(iP39);
    tp2.Server server50 = new tp2.Server();
    tp2.IP iP51 = null;
    boolean b52 = server50.addBan(iP51);
    tp2.ITime iTime53 = null;
    server50.setTime(iTime53);
    tp2.IP iP55 = null;
    tp2.IPBan iPBan57 = new tp2.IPBan(iP55, (java.lang.Long)10L);
    tp2.IP iP58 = iPBan57.getIp();
    java.lang.Long long59 = iPBan57.expires;
    tp2.IP iP60 = null;
    iPBan57.ip = iP60;
    tp2.Server server62 = new tp2.Server();
    tp2.IP iP67 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b68 = server62.removeException(iP67);
    java.lang.Integer i69 = iP67.getFirst();
    iPBan57.setIp(iP67);
    boolean b71 = server50.connect(iP67);
    iP67.setFourth((java.lang.Integer)(-1));
    boolean b74 = server14.removeException(iP67);
    iPBan13.ip = iP67;
    boolean b76 = server0.removeBan(iP67);
    tp2.ITime iTime77 = null;
    server0.setTime(iTime77);
    server0.update();
    server0.update();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b46 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b49 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b52 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP58);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long59 + "' != '" + 10L+ "'", long59.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b68 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i69 + "' != '" + 161+ "'", i69.equals(161));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b71 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b74 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b76 == false);

  }

  @Test
  public void test307() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test307"); }


    tp2.Server server0 = new tp2.Server();
    tp2.IP iP1 = null;
    boolean b2 = server0.addBan(iP1);
    tp2.ITime iTime3 = null;
    server0.setTime(iTime3);
    tp2.IP iP5 = null;
    tp2.IPBan iPBan7 = new tp2.IPBan(iP5, (java.lang.Long)10L);
    tp2.IP iP8 = iPBan7.getIp();
    java.lang.Long long9 = iPBan7.expires;
    tp2.IP iP10 = null;
    iPBan7.ip = iP10;
    tp2.Server server12 = new tp2.Server();
    tp2.IP iP17 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b18 = server12.removeException(iP17);
    java.lang.Integer i19 = iP17.getFirst();
    iPBan7.setIp(iP17);
    tp2.IP iP21 = iPBan7.getIp();
    java.lang.Integer i22 = iP21.getSecond();
    iP21.setSecond((java.lang.Integer)161);
    boolean b25 = server0.connect(iP21);
    tp2.Server server26 = new tp2.Server();
    tp2.IP iP27 = null;
    boolean b28 = server26.connect(iP27);
    tp2.IP iP33 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)83, (java.lang.Integer)26, (java.lang.Integer)100);
    boolean b34 = server26.addBan(iP33);
    boolean b35 = server0.addException(iP33);
    tp2.ITime iTime36 = null;
    server0.setTime(iTime36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long9 + "' != '" + 10L+ "'", long9.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i19 + "' != '" + 161+ "'", i19.equals(161));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i22 + "' != '" + (-2147483648)+ "'", i22.equals((-2147483648)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == true);

  }

  @Test
  public void test308() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test308"); }


    int i1 = java.lang.Integer.reverseBytes(822083745);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == (-1593835471));

  }

  @Test
  public void test309() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test309"); }


    // The following exception was thrown during execution in test generation
    try {
      int i2 = java.lang.Integer.parseInt("1879048192", (-167510016));
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test310() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test310"); }


    int i2 = java.lang.Integer.sum(5242880, 436207616);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 441450496);

  }

  @Test
  public void test311() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test311"); }


    int i1 = java.lang.Integer.parseInt("10000000");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 10000000);

  }

  @Test
  public void test312() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test312"); }


    tp2.IP iP0 = null;
    tp2.IPBan iPBan2 = new tp2.IPBan(iP0, (java.lang.Long)10L);
    tp2.IP iP3 = iPBan2.getIp();
    java.lang.Long long4 = iPBan2.expires;
    tp2.IP iP5 = null;
    iPBan2.ip = iP5;
    tp2.Server server7 = new tp2.Server();
    tp2.IP iP12 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b13 = server7.removeException(iP12);
    java.lang.Integer i14 = iP12.getFirst();
    iPBan2.setIp(iP12);
    iP12.setSecond((java.lang.Integer)1476395008);
    tp2.IPBan iPBan19 = new tp2.IPBan(iP12, (java.lang.Long)10L);
    tp2.Server server20 = new tp2.Server();
    tp2.IP iP25 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b26 = server20.removeException(iP25);
    iP25.setThird((java.lang.Integer)56);
    java.lang.Integer i29 = iP25.getFourth();
    java.lang.Integer i30 = null;
    iP25.setFirst(i30);
    iPBan19.ip = iP25;
    tp2.IPBan iPBan34 = new tp2.IPBan(iP25, (java.lang.Long)1677721600L);
    tp2.Server server35 = new tp2.Server();
    tp2.IP iP36 = null;
    boolean b37 = server35.addBan(iP36);
    tp2.ITime iTime38 = null;
    server35.setTime(iTime38);
    tp2.IP iP40 = null;
    tp2.IPBan iPBan42 = new tp2.IPBan(iP40, (java.lang.Long)10L);
    tp2.IP iP43 = iPBan42.getIp();
    java.lang.Long long44 = iPBan42.expires;
    tp2.IP iP45 = null;
    iPBan42.ip = iP45;
    tp2.Server server47 = new tp2.Server();
    tp2.IP iP52 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b53 = server47.removeException(iP52);
    java.lang.Integer i54 = iP52.getFirst();
    iPBan42.setIp(iP52);
    boolean b56 = server35.connect(iP52);
    server35.update();
    tp2.Server server58 = new tp2.Server();
    tp2.IP iP59 = null;
    boolean b60 = server58.addBan(iP59);
    tp2.ITime iTime61 = null;
    server58.setTime(iTime61);
    tp2.IP iP63 = null;
    tp2.IPBan iPBan65 = new tp2.IPBan(iP63, (java.lang.Long)10L);
    tp2.IP iP66 = iPBan65.getIp();
    java.lang.Long long67 = iPBan65.expires;
    tp2.IP iP68 = null;
    iPBan65.ip = iP68;
    tp2.Server server70 = new tp2.Server();
    tp2.IP iP75 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b76 = server70.removeException(iP75);
    java.lang.Integer i77 = iP75.getFirst();
    iPBan65.setIp(iP75);
    iP75.setFourth((java.lang.Integer)(-2147483620));
    boolean b81 = server58.removeBan(iP75);
    java.lang.Integer i82 = iP75.getFirst();
    java.lang.Integer i83 = iP75.getSecond();
    boolean b84 = server35.removeBan(iP75);
    tp2.IP iP89 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    iP89.setFirst((java.lang.Integer)161);
    iP89.setThird((java.lang.Integer)3);
    boolean b94 = server35.addException(iP89);
    java.lang.Integer i95 = iP89.getFourth();
    iPBan34.setIp(iP89);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L+ "'", long4.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i14 + "' != '" + 161+ "'", i14.equals(161));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i29 + "' != '" + 5+ "'", i29.equals(5));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long44 + "' != '" + 10L+ "'", long44.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b53 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i54 + "' != '" + 161+ "'", i54.equals(161));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b56 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b60 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP66);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long67 + "' != '" + 10L+ "'", long67.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b76 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i77 + "' != '" + 161+ "'", i77.equals(161));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b81 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i82 + "' != '" + 161+ "'", i82.equals(161));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i83 + "' != '" + (-2147483648)+ "'", i83.equals((-2147483648)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b84 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b94 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i95 + "' != '" + 5+ "'", i95.equals(5));

  }

  @Test
  public void test313() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test313"); }


    int i1 = java.lang.Integer.reverseBytes(960);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == (-1073545216));

  }

  @Test
  public void test314() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test314"); }


    // The following exception was thrown during execution in test generation
    try {
      int i2 = java.lang.Integer.parseUnsignedInt("70000", 80000000);
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test315() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test315"); }


    int i2 = java.lang.Integer.compareUnsigned((-2063597568), (-1610611504));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == (-1));

  }

  @Test
  public void test316() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test316"); }


    java.lang.String str1 = java.lang.Integer.toUnsignedString(15516);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "15516"+ "'", str1.equals("15516"));

  }

  @Test
  public void test317() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test317"); }


    java.lang.String str1 = java.lang.Integer.toBinaryString(531);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "1000010011"+ "'", str1.equals("1000010011"));

  }

  @Test
  public void test318() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test318"); }


    java.lang.Integer i2 = java.lang.Integer.getInteger("205", (java.lang.Integer)80000085);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i2 + "' != '" + 80000085+ "'", i2.equals(80000085));

  }

  @Test
  public void test319() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test319"); }


    int i1 = java.lang.Integer.bitCount(631);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 7);

  }

  @Test
  public void test320() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test320"); }


    int i1 = java.lang.Integer.numberOfLeadingZeros(40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 26);

  }

  @Test
  public void test321() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test321"); }


    java.lang.String str1 = java.lang.Integer.toHexString(1342177280);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "50000000"+ "'", str1.equals("50000000"));

  }

  @Test
  public void test322() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test322"); }


    // The following exception was thrown during execution in test generation
    try {
      korat.finitization.IFinitization iFinitization1 = tp2.Server.finServer(86016);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test323() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test323"); }


    java.lang.String str2 = java.lang.Integer.toUnsignedString(144, 1677721805);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "144"+ "'", str2.equals("144"));

  }

  @Test
  public void test324() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test324"); }


    // The following exception was thrown during execution in test generation
    try {
      int i2 = java.lang.Integer.parseInt("10", 631);
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test325() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test325"); }


    java.lang.Integer i1 = java.lang.Integer.valueOf("11001");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 11001+ "'", i1.equals(11001));

  }

  @Test
  public void test326() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test326"); }


    tp2.Server server0 = new tp2.Server();
    tp2.IP iP1 = null;
    boolean b2 = server0.addBan(iP1);
    server0.update();
    tp2.Server server4 = new tp2.Server();
    tp2.IP iP5 = null;
    boolean b6 = server4.addBan(iP5);
    tp2.ITime iTime7 = null;
    server4.setTime(iTime7);
    tp2.IP iP9 = null;
    tp2.IPBan iPBan11 = new tp2.IPBan(iP9, (java.lang.Long)10L);
    tp2.IP iP12 = iPBan11.getIp();
    java.lang.Long long13 = iPBan11.expires;
    tp2.IP iP14 = null;
    iPBan11.ip = iP14;
    tp2.Server server16 = new tp2.Server();
    tp2.IP iP21 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b22 = server16.removeException(iP21);
    java.lang.Integer i23 = iP21.getFirst();
    iPBan11.setIp(iP21);
    iP21.setFourth((java.lang.Integer)(-2147483620));
    boolean b27 = server4.removeBan(iP21);
    boolean b28 = server0.addException(iP21);
    tp2.IP iP29 = null;
    tp2.IPBan iPBan31 = new tp2.IPBan(iP29, (java.lang.Long)10L);
    tp2.IP iP32 = iPBan31.getIp();
    java.lang.Long long33 = iPBan31.expires;
    tp2.IP iP34 = null;
    iPBan31.ip = iP34;
    java.lang.Long long36 = iPBan31.expires;
    tp2.Server server37 = new tp2.Server();
    tp2.IP iP42 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b43 = server37.removeException(iP42);
    iP42.setThird((java.lang.Integer)56);
    java.lang.Integer i46 = iP42.getFourth();
    tp2.IPBan iPBan48 = new tp2.IPBan(iP42, (java.lang.Long)10L);
    iPBan31.setIp(iP42);
    tp2.IP iP50 = iPBan31.ip;
    tp2.IP iP51 = iPBan31.getIp();
    boolean b52 = server0.removeException(iP51);
    server0.update();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long13 + "' != '" + 10L+ "'", long13.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i23 + "' != '" + 161+ "'", i23.equals(161));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long33 + "' != '" + 10L+ "'", long33.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long36 + "' != '" + 10L+ "'", long36.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b43 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i46 + "' != '" + 5+ "'", i46.equals(5));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b52 == false);

  }

  @Test
  public void test327() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test327"); }


    // The following exception was thrown during execution in test generation
    try {
      korat.finitization.IFinitization iFinitization1 = tp2.Server.finServer(960);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test328() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test328"); }


    int i1 = java.lang.Integer.signum(83894283);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 1);

  }

  @Test
  public void test329() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test329"); }


    tp2.Server server0 = new tp2.Server();
    tp2.IP iP1 = null;
    boolean b2 = server0.addBan(iP1);
    tp2.Server server3 = new tp2.Server();
    tp2.IP iP8 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b9 = server3.removeException(iP8);
    boolean b11 = iP8.equals((java.lang.Object)(-1L));
    boolean b12 = server0.removeBan(iP8);
    server0.update();
    tp2.IP iP18 = new tp2.IP((java.lang.Integer)740, (java.lang.Integer)2, (java.lang.Integer)268435456, (java.lang.Integer)229376);
    boolean b19 = server0.addException(iP18);
    tp2.IP iP24 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    iP24.setFirst((java.lang.Integer)161);
    boolean b27 = server0.connect(iP24);
    iP24.setSecond((java.lang.Integer)69273664);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);

  }

  @Test
  public void test330() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test330"); }


    tp2.IP iP0 = null;
    tp2.IPBan iPBan2 = new tp2.IPBan(iP0, (java.lang.Long)10L);
    java.lang.Long long3 = iPBan2.getExpires();
    tp2.IP iP8 = new tp2.IP((java.lang.Integer)31, (java.lang.Integer)31, (java.lang.Integer)31, (java.lang.Integer)0);
    iPBan2.ip = iP8;
    tp2.Server server10 = new tp2.Server();
    tp2.IP iP15 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b16 = server10.removeException(iP15);
    server10.update();
    tp2.Server server18 = new tp2.Server();
    tp2.IP iP23 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b24 = server18.removeException(iP23);
    java.lang.Integer i25 = iP23.getFirst();
    boolean b26 = server10.addBan(iP23);
    iPBan2.setIp(iP23);
    tp2.IP iP28 = iPBan2.ip;
    tp2.IP iP29 = iPBan2.ip;
    tp2.IPBan iPBan31 = new tp2.IPBan(iP29, (java.lang.Long)100L);
    java.lang.Integer i32 = iP29.getFirst();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L+ "'", long3.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i25 + "' != '" + 161+ "'", i25.equals(161));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i32 + "' != '" + 161+ "'", i32.equals(161));

  }

  @Test
  public void test331() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test331"); }


    java.lang.Integer i2 = java.lang.Integer.getInteger("89f8", (java.lang.Integer)19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i2 + "' != '" + 19+ "'", i2.equals(19));

  }

  @Test
  public void test332() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test332"); }


    int i2 = java.lang.Integer.remainderUnsigned(10000000, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 10000000);

  }

  @Test
  public void test333() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test333"); }


    tp2.Server server0 = new tp2.Server();
    tp2.IP iP1 = null;
    boolean b2 = server0.addBan(iP1);
    tp2.IP iP7 = new tp2.IP((java.lang.Integer)31, (java.lang.Integer)31, (java.lang.Integer)31, (java.lang.Integer)0);
    iP7.setSecond((java.lang.Integer)2147483647);
    boolean b10 = server0.addBan(iP7);
    tp2.Server server11 = new tp2.Server();
    tp2.IP iP12 = null;
    boolean b13 = server11.addBan(iP12);
    tp2.Server server14 = new tp2.Server();
    tp2.IP iP19 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b20 = server14.removeException(iP19);
    boolean b22 = iP19.equals((java.lang.Object)(-1L));
    boolean b23 = server11.removeBan(iP19);
    java.lang.Integer i24 = iP19.getFourth();
    boolean b25 = server0.removeBan(iP19);
    server0.update();
    server0.update();
    tp2.ITime iTime28 = null;
    server0.setTime(iTime28);
    tp2.IP iP30 = null;
    tp2.IPBan iPBan32 = new tp2.IPBan(iP30, (java.lang.Long)10L);
    java.lang.Long long33 = iPBan32.getExpires();
    tp2.IP iP38 = new tp2.IP((java.lang.Integer)31, (java.lang.Integer)31, (java.lang.Integer)31, (java.lang.Integer)0);
    iPBan32.ip = iP38;
    iP38.setFirst((java.lang.Integer)2);
    java.lang.Integer i42 = iP38.getFirst();
    boolean b43 = server0.removeException(iP38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i24 + "' != '" + 5+ "'", i24.equals(5));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long33 + "' != '" + 10L+ "'", long33.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i42 + "' != '" + 2+ "'", i42.equals(2));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b43 == false);

  }

  @Test
  public void test334() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test334"); }


    java.lang.Integer i2 = java.lang.Integer.getInteger("4000003f", (java.lang.Integer)(-1342177272));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i2 + "' != '" + (-1342177272)+ "'", i2.equals((-1342177272)));

  }

  @Test
  public void test335() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test335"); }


    tp2.IP iP4 = new tp2.IP((java.lang.Integer)133, (java.lang.Integer)(-2147483515), (java.lang.Integer)79, (java.lang.Integer)(-2147483620));
    tp2.IPBan iPBan6 = new tp2.IPBan(iP4, (java.lang.Long)14L);
    tp2.Server server7 = new tp2.Server();
    tp2.IP iP12 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b13 = server7.removeException(iP12);
    iP12.setThird((java.lang.Integer)56);
    tp2.IPBan iPBan17 = new tp2.IPBan(iP12, (java.lang.Long)2147483676L);
    iP12.setFirst((java.lang.Integer)16);
    iPBan6.setIp(iP12);
    tp2.IP iP21 = iPBan6.ip;
    iPBan6.expires = 268435466L;
    tp2.IP iP28 = new tp2.IP((java.lang.Integer)31, (java.lang.Integer)(-2147483592), (java.lang.Integer)133, (java.lang.Integer)(-2147483646));
    java.lang.Integer i29 = iP28.getSecond();
    iP28.setFourth((java.lang.Integer)101);
    iPBan6.setIp(iP28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i29 + "' != '" + (-2147483592)+ "'", i29.equals((-2147483592)));

  }

  @Test
  public void test336() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test336"); }


    java.lang.String str2 = java.lang.Integer.toUnsignedString((-1825001145), 2031686);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "2469966151"+ "'", str2.equals("2469966151"));

  }

  @Test
  public void test337() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test337"); }


    java.lang.Integer i1 = new java.lang.Integer((-1546304766));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + (-1546304766)+ "'", i1.equals((-1546304766)));

  }

  @Test
  public void test338() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test338"); }


    tp2.IP iP0 = null;
    tp2.IPBan iPBan2 = new tp2.IPBan(iP0, (java.lang.Long)10L);
    tp2.IP iP3 = iPBan2.getIp();
    tp2.IP iP8 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    iP8.setFirst((java.lang.Integer)161);
    iP8.setThird((java.lang.Integer)3);
    iP8.setFirst((java.lang.Integer)26);
    iPBan2.ip = iP8;
    tp2.IP iP16 = iPBan2.getIp();
    iP16.setFourth((java.lang.Integer)100663296);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP16);

  }

  @Test
  public void test339() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test339"); }


    tp2.IP iP0 = null;
    tp2.IPBan iPBan2 = new tp2.IPBan(iP0, (java.lang.Long)10L);
    tp2.IP iP3 = iPBan2.getIp();
    java.lang.Long long4 = iPBan2.expires;
    tp2.IP iP5 = null;
    iPBan2.ip = iP5;
    tp2.Server server7 = new tp2.Server();
    tp2.IP iP12 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b13 = server7.removeException(iP12);
    java.lang.Integer i14 = iP12.getFirst();
    iPBan2.setIp(iP12);
    iP12.setSecond((java.lang.Integer)1476395008);
    tp2.IPBan iPBan19 = new tp2.IPBan(iP12, (java.lang.Long)10L);
    java.lang.Long long20 = iPBan19.getExpires();
    java.lang.Long long21 = iPBan19.expires;
    iPBan19.setExpires((java.lang.Long)1638400L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L+ "'", long4.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i14 + "' != '" + 161+ "'", i14.equals(161));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long20 + "' != '" + 10L+ "'", long20.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long21 + "' != '" + 10L+ "'", long21.equals(10L));

  }

  @Test
  public void test340() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test340"); }


    java.lang.Integer i1 = java.lang.Integer.getInteger("100000000000");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);

  }

  @Test
  public void test341() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test341"); }


    int i2 = java.lang.Integer.divideUnsigned(0, 83);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);

  }

  @Test
  public void test342() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test342"); }


    tp2.Server server0 = new tp2.Server();
    tp2.IP iP1 = null;
    boolean b2 = server0.addBan(iP1);
    tp2.ITime iTime3 = null;
    server0.setTime(iTime3);
    tp2.IP iP5 = null;
    tp2.IPBan iPBan7 = new tp2.IPBan(iP5, (java.lang.Long)10L);
    tp2.IP iP8 = iPBan7.getIp();
    java.lang.Long long9 = iPBan7.expires;
    tp2.IP iP10 = null;
    iPBan7.ip = iP10;
    tp2.Server server12 = new tp2.Server();
    tp2.IP iP17 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b18 = server12.removeException(iP17);
    java.lang.Integer i19 = iP17.getFirst();
    iPBan7.setIp(iP17);
    boolean b21 = server0.connect(iP17);
    iP17.setFourth((java.lang.Integer)(-1));
    iP17.setFourth((java.lang.Integer)(-1));
    iP17.setFourth((java.lang.Integer)7434688);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long9 + "' != '" + 10L+ "'", long9.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i19 + "' != '" + 161+ "'", i19.equals(161));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);

  }

  @Test
  public void test343() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test343"); }


    java.lang.String str1 = java.lang.Integer.toHexString(49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "31"+ "'", str1.equals("31"));

  }

  @Test
  public void test344() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test344"); }


    tp2.Server server0 = new tp2.Server();
    tp2.IP iP5 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b6 = server0.removeException(iP5);
    server0.update();
    tp2.Server server8 = new tp2.Server();
    tp2.IP iP9 = null;
    boolean b10 = server8.addBan(iP9);
    tp2.Server server11 = new tp2.Server();
    tp2.IP iP16 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b17 = server11.removeException(iP16);
    boolean b19 = iP16.equals((java.lang.Object)(-1L));
    boolean b20 = server8.removeBan(iP16);
    tp2.IP iP25 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    iP25.setFirst((java.lang.Integer)161);
    iP25.setThird((java.lang.Integer)3);
    iP25.setFirst((java.lang.Integer)26);
    boolean b32 = server8.connect(iP25);
    iP25.setSecond((java.lang.Integer)1677721761);
    boolean b35 = server0.removeBan(iP25);
    tp2.Server server36 = new tp2.Server();
    tp2.IP iP37 = null;
    boolean b38 = server36.addBan(iP37);
    server36.update();
    tp2.Server server40 = new tp2.Server();
    tp2.IP iP41 = null;
    boolean b42 = server40.addBan(iP41);
    tp2.ITime iTime43 = null;
    server40.setTime(iTime43);
    tp2.IP iP45 = null;
    tp2.IPBan iPBan47 = new tp2.IPBan(iP45, (java.lang.Long)10L);
    tp2.IP iP48 = iPBan47.getIp();
    java.lang.Long long49 = iPBan47.expires;
    tp2.IP iP50 = null;
    iPBan47.ip = iP50;
    tp2.Server server52 = new tp2.Server();
    tp2.IP iP57 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b58 = server52.removeException(iP57);
    java.lang.Integer i59 = iP57.getFirst();
    iPBan47.setIp(iP57);
    iP57.setFourth((java.lang.Integer)(-2147483620));
    boolean b63 = server40.removeBan(iP57);
    boolean b64 = server36.addException(iP57);
    boolean b65 = server0.removeBan(iP57);
    java.lang.Integer i66 = iP57.getSecond();
    iP57.setFourth((java.lang.Integer)1326);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long49 + "' != '" + 10L+ "'", long49.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b58 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i59 + "' != '" + 161+ "'", i59.equals(161));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b63 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b64 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b65 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i66 + "' != '" + (-2147483648)+ "'", i66.equals((-2147483648)));

  }

  @Test
  public void test345() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test345"); }


    int i2 = java.lang.Integer.sum(33554624, 38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 33554662);

  }

  @Test
  public void test346() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test346"); }


    tp2.IP iP0 = null;
    tp2.IPBan iPBan2 = new tp2.IPBan(iP0, (java.lang.Long)10L);
    tp2.IP iP3 = iPBan2.getIp();
    java.lang.Long long4 = iPBan2.expires;
    tp2.IP iP5 = null;
    iPBan2.ip = iP5;
    iPBan2.setExpires((java.lang.Long)(-1L));
    java.lang.Long long9 = iPBan2.getExpires();
    java.lang.Long long10 = iPBan2.getExpires();
    tp2.Server server11 = new tp2.Server();
    tp2.IP iP12 = null;
    boolean b13 = server11.addBan(iP12);
    tp2.ITime iTime14 = null;
    server11.setTime(iTime14);
    tp2.IP iP16 = null;
    tp2.IPBan iPBan18 = new tp2.IPBan(iP16, (java.lang.Long)10L);
    tp2.IP iP19 = iPBan18.getIp();
    java.lang.Long long20 = iPBan18.expires;
    tp2.IP iP21 = null;
    iPBan18.ip = iP21;
    tp2.Server server23 = new tp2.Server();
    tp2.IP iP28 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b29 = server23.removeException(iP28);
    java.lang.Integer i30 = iP28.getFirst();
    iPBan18.setIp(iP28);
    boolean b32 = server11.connect(iP28);
    server11.update();
    tp2.Server server34 = new tp2.Server();
    tp2.IP iP35 = null;
    boolean b36 = server34.addBan(iP35);
    tp2.ITime iTime37 = null;
    server34.setTime(iTime37);
    tp2.IP iP39 = null;
    tp2.IPBan iPBan41 = new tp2.IPBan(iP39, (java.lang.Long)10L);
    tp2.IP iP42 = iPBan41.getIp();
    java.lang.Long long43 = iPBan41.expires;
    tp2.IP iP44 = null;
    iPBan41.ip = iP44;
    tp2.Server server46 = new tp2.Server();
    tp2.IP iP51 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b52 = server46.removeException(iP51);
    java.lang.Integer i53 = iP51.getFirst();
    iPBan41.setIp(iP51);
    iP51.setFourth((java.lang.Integer)(-2147483620));
    boolean b57 = server34.removeBan(iP51);
    java.lang.Integer i58 = iP51.getFirst();
    java.lang.Integer i59 = iP51.getSecond();
    boolean b60 = server11.removeBan(iP51);
    iPBan2.setIp(iP51);
    iP51.setSecond((java.lang.Integer)1550375680);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L+ "'", long4.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L)+ "'", long9.equals((-1L)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L)+ "'", long10.equals((-1L)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long20 + "' != '" + 10L+ "'", long20.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i30 + "' != '" + 161+ "'", i30.equals(161));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long43 + "' != '" + 10L+ "'", long43.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b52 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i53 + "' != '" + 161+ "'", i53.equals(161));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b57 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i58 + "' != '" + 161+ "'", i58.equals(161));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i59 + "' != '" + (-2147483648)+ "'", i59.equals((-2147483648)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b60 == false);

  }

  @Test
  public void test347() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test347"); }


    int i2 = java.lang.Integer.compare(620822528, 1270);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);

  }

  @Test
  public void test348() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test348"); }


    int i1 = java.lang.Integer.reverseBytes(5242880);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 20480);

  }

  @Test
  public void test349() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test349"); }


    tp2.IP iP0 = null;
    tp2.IPBan iPBan2 = new tp2.IPBan(iP0, (java.lang.Long)10L);
    tp2.IP iP3 = iPBan2.getIp();
    java.lang.Long long4 = iPBan2.expires;
    tp2.Server server5 = new tp2.Server();
    tp2.IP iP10 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b11 = server5.removeException(iP10);
    java.lang.Integer i12 = iP10.getFirst();
    iPBan2.setIp(iP10);
    tp2.IP iP14 = iPBan2.ip;
    tp2.IP iP15 = null;
    tp2.IPBan iPBan17 = new tp2.IPBan(iP15, (java.lang.Long)10L);
    java.lang.Long long18 = iPBan17.getExpires();
    tp2.IP iP23 = new tp2.IP((java.lang.Integer)31, (java.lang.Integer)31, (java.lang.Integer)31, (java.lang.Integer)0);
    iPBan17.ip = iP23;
    iP23.setFirst((java.lang.Integer)2);
    iPBan2.setIp(iP23);
    tp2.Server server28 = new tp2.Server();
    tp2.IP iP29 = null;
    boolean b30 = server28.addBan(iP29);
    tp2.Server server31 = new tp2.Server();
    tp2.IP iP36 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b37 = server31.removeException(iP36);
    boolean b39 = iP36.equals((java.lang.Object)(-1L));
    boolean b40 = server28.removeBan(iP36);
    iPBan2.ip = iP36;
    java.lang.Long long42 = iPBan2.getExpires();
    tp2.Server server43 = new tp2.Server();
    tp2.IP iP44 = null;
    boolean b45 = server43.addBan(iP44);
    tp2.Server server46 = new tp2.Server();
    tp2.IP iP51 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b52 = server46.removeException(iP51);
    boolean b54 = iP51.equals((java.lang.Object)(-1L));
    boolean b55 = server43.removeBan(iP51);
    tp2.IPBan iPBan57 = new tp2.IPBan(iP51, (java.lang.Long)(-1L));
    java.lang.Long long58 = iPBan57.getExpires();
    java.lang.Long long59 = iPBan57.getExpires();
    tp2.Server server60 = new tp2.Server();
    tp2.IP iP65 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b66 = server60.removeException(iP65);
    server60.update();
    tp2.Server server68 = new tp2.Server();
    tp2.IP iP73 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b74 = server68.removeException(iP73);
    java.lang.Integer i75 = iP73.getFirst();
    boolean b76 = server60.addBan(iP73);
    iP73.setSecond((java.lang.Integer)83);
    iPBan57.setIp(iP73);
    java.lang.Integer i80 = iP73.getThird();
    iP73.setFirst((java.lang.Integer)112);
    iPBan2.ip = iP73;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L+ "'", long4.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i12 + "' != '" + 161+ "'", i12.equals(161));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long18 + "' != '" + 10L+ "'", long18.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long42 + "' != '" + 10L+ "'", long42.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b52 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b54 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b55 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long58 + "' != '" + (-1L)+ "'", long58.equals((-1L)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long59 + "' != '" + (-1L)+ "'", long59.equals((-1L)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b66 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b74 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i75 + "' != '" + 161+ "'", i75.equals(161));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b76 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i80 + "' != '" + 939524096+ "'", i80.equals(939524096));

  }

  @Test
  public void test350() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test350"); }


    tp2.IP iP0 = null;
    tp2.IPBan iPBan2 = new tp2.IPBan(iP0, (java.lang.Long)10L);
    java.lang.Long long3 = iPBan2.getExpires();
    tp2.IP iP8 = new tp2.IP((java.lang.Integer)31, (java.lang.Integer)31, (java.lang.Integer)31, (java.lang.Integer)0);
    iPBan2.ip = iP8;
    tp2.Server server10 = new tp2.Server();
    tp2.IP iP15 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b16 = server10.removeException(iP15);
    server10.update();
    tp2.Server server18 = new tp2.Server();
    tp2.IP iP23 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b24 = server18.removeException(iP23);
    java.lang.Integer i25 = iP23.getFirst();
    boolean b26 = server10.addBan(iP23);
    iPBan2.setIp(iP23);
    tp2.IP iP28 = iPBan2.ip;
    iPBan2.expires = 268435466L;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L+ "'", long3.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i25 + "' != '" + 161+ "'", i25.equals(161));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP28);

  }

  @Test
  public void test351() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test351"); }


    int i2 = java.lang.Integer.compareUnsigned((-1870224602), 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);

  }

  @Test
  public void test352() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test352"); }


    int i2 = java.lang.Integer.min(1138065410, (-134217728));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == (-134217728));

  }

  @Test
  public void test353() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test353"); }


    // The following exception was thrown during execution in test generation
    try {
      java.lang.Integer i2 = java.lang.Integer.valueOf("26603200000", (-1546304766));
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test354() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test354"); }


    tp2.Server server0 = new tp2.Server();
    tp2.IP iP1 = null;
    boolean b2 = server0.addBan(iP1);
    tp2.Server server3 = new tp2.Server();
    tp2.IP iP8 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b9 = server3.removeException(iP8);
    boolean b11 = iP8.equals((java.lang.Object)(-1L));
    boolean b12 = server0.removeBan(iP8);
    tp2.Server server13 = new tp2.Server();
    tp2.IP iP14 = null;
    boolean b15 = server13.addBan(iP14);
    tp2.IP iP20 = new tp2.IP((java.lang.Integer)31, (java.lang.Integer)31, (java.lang.Integer)31, (java.lang.Integer)0);
    iP20.setSecond((java.lang.Integer)2147483647);
    boolean b23 = server13.addBan(iP20);
    tp2.Server server24 = new tp2.Server();
    tp2.IP iP25 = null;
    boolean b26 = server24.addBan(iP25);
    tp2.ITime iTime27 = null;
    server24.setTime(iTime27);
    tp2.IP iP29 = null;
    tp2.IPBan iPBan31 = new tp2.IPBan(iP29, (java.lang.Long)10L);
    tp2.IP iP32 = iPBan31.getIp();
    java.lang.Long long33 = iPBan31.expires;
    tp2.IP iP34 = null;
    iPBan31.ip = iP34;
    tp2.Server server36 = new tp2.Server();
    tp2.IP iP41 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b42 = server36.removeException(iP41);
    java.lang.Integer i43 = iP41.getFirst();
    iPBan31.setIp(iP41);
    boolean b45 = server24.connect(iP41);
    boolean b46 = server13.removeBan(iP41);
    tp2.IP iP51 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    iP51.setFirst((java.lang.Integer)161);
    iP51.setThird((java.lang.Integer)3);
    iP51.setFirst((java.lang.Integer)26);
    iP51.setThird((java.lang.Integer)5);
    boolean b60 = server13.removeBan(iP51);
    boolean b61 = server0.connect(iP51);
    tp2.ITime iTime62 = null;
    server0.setTime(iTime62);
    tp2.IP iP68 = new tp2.IP((java.lang.Integer)56, (java.lang.Integer)(-2147483515), (java.lang.Integer)10, (java.lang.Integer)32);
    tp2.IPBan iPBan70 = new tp2.IPBan(iP68, (java.lang.Long)2147483676L);
    boolean b71 = server0.removeException(iP68);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long33 + "' != '" + 10L+ "'", long33.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i43 + "' != '" + 161+ "'", i43.equals(161));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b46 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b60 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b61 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b71 == false);

  }

  @Test
  public void test355() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test355"); }


    // The following exception was thrown during execution in test generation
    try {
      java.lang.Integer i1 = java.lang.Integer.decode("10000000000000000000000000000");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test356() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test356"); }


    int i1 = java.lang.Integer.highestOneBit(150995072);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 134217728);

  }

  @Test
  public void test357() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test357"); }


    java.lang.Integer i1 = new java.lang.Integer((-1240662016));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + (-1240662016)+ "'", i1.equals((-1240662016)));

  }

  @Test
  public void test358() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test358"); }


    tp2.IP iP4 = new tp2.IP((java.lang.Integer)2147483647, (java.lang.Integer)(-1), (java.lang.Integer)56, (java.lang.Integer)458752);
    tp2.IPBan iPBan6 = new tp2.IPBan(iP4, (java.lang.Long)2147483676L);
    tp2.IP iP7 = iPBan6.ip;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP7);

  }

  @Test
  public void test359() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test359"); }


    java.lang.Integer i2 = java.lang.Integer.getInteger("20000135046", 112);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i2 + "' != '" + 112+ "'", i2.equals(112));

  }

  @Test
  public void test360() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test360"); }


    int i2 = java.lang.Integer.sum((-2113404911), 24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == (-2113404887));

  }

  @Test
  public void test361() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test361"); }


    tp2.IP iP4 = new tp2.IP((java.lang.Integer)1677721779, (java.lang.Integer)(-1879048192), (java.lang.Integer)402653184, (java.lang.Integer)458885);
    java.lang.Integer i5 = iP4.getFourth();
    java.lang.Integer i6 = iP4.getFourth();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i5 + "' != '" + 458885+ "'", i5.equals(458885));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i6 + "' != '" + 458885+ "'", i6.equals(458885));

  }

  @Test
  public void test362() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test362"); }


    tp2.Server server0 = new tp2.Server();
    tp2.IP iP1 = null;
    boolean b2 = server0.addBan(iP1);
    tp2.Server server3 = new tp2.Server();
    tp2.IP iP8 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b9 = server3.removeException(iP8);
    boolean b11 = iP8.equals((java.lang.Object)(-1L));
    boolean b12 = server0.removeBan(iP8);
    tp2.IP iP17 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    iP17.setFirst((java.lang.Integer)161);
    iP17.setThird((java.lang.Integer)3);
    iP17.setFirst((java.lang.Integer)26);
    boolean b24 = server0.connect(iP17);
    tp2.IP iP29 = new tp2.IP((java.lang.Integer)2147483647, (java.lang.Integer)(-1), (java.lang.Integer)56, (java.lang.Integer)458752);
    boolean b30 = server0.addException(iP29);
    iP29.setFourth((java.lang.Integer)15);
    iP29.setThird((java.lang.Integer)80000000);
    tp2.IPBan iPBan36 = new tp2.IPBan(iP29, (java.lang.Long)4144037888L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == true);

  }

  @Test
  public void test363() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test363"); }


    int i2 = java.lang.Integer.sum(20000000, (-1593835505));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == (-1573835505));

  }

  @Test
  public void test364() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test364"); }


    tp2.Server server0 = new tp2.Server();
    tp2.IP iP1 = null;
    boolean b2 = server0.addBan(iP1);
    tp2.IP iP7 = new tp2.IP((java.lang.Integer)31, (java.lang.Integer)31, (java.lang.Integer)31, (java.lang.Integer)0);
    iP7.setSecond((java.lang.Integer)2147483647);
    boolean b10 = server0.addBan(iP7);
    tp2.Server server11 = new tp2.Server();
    tp2.IP iP12 = null;
    boolean b13 = server11.addBan(iP12);
    tp2.ITime iTime14 = null;
    server11.setTime(iTime14);
    tp2.IP iP16 = null;
    tp2.IPBan iPBan18 = new tp2.IPBan(iP16, (java.lang.Long)10L);
    tp2.IP iP19 = iPBan18.getIp();
    java.lang.Long long20 = iPBan18.expires;
    tp2.IP iP21 = null;
    iPBan18.ip = iP21;
    tp2.Server server23 = new tp2.Server();
    tp2.IP iP28 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b29 = server23.removeException(iP28);
    java.lang.Integer i30 = iP28.getFirst();
    iPBan18.setIp(iP28);
    boolean b32 = server11.connect(iP28);
    boolean b33 = server0.removeBan(iP28);
    tp2.ITime iTime34 = null;
    server0.setTime(iTime34);
    tp2.IP iP40 = new tp2.IP((java.lang.Integer)4, (java.lang.Integer)1342177288, (java.lang.Integer)13, (java.lang.Integer)536870926);
    boolean b41 = server0.removeException(iP40);
    tp2.Server server42 = new tp2.Server();
    tp2.IP iP47 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b48 = server42.removeException(iP47);
    server42.update();
    tp2.Server server50 = new tp2.Server();
    tp2.IP iP55 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b56 = server50.removeException(iP55);
    java.lang.Integer i57 = iP55.getFirst();
    boolean b58 = server42.addBan(iP55);
    boolean b60 = iP55.equals((java.lang.Object)(short)10);
    iP55.setSecond((java.lang.Integer)(-134217728));
    iP55.setFirst((java.lang.Integer)(-2147483592));
    boolean b65 = server0.connect(iP55);
    tp2.IPBan iPBan67 = new tp2.IPBan(iP55, (java.lang.Long)2147483676L);
    java.lang.Long long68 = iPBan67.getExpires();
    tp2.IP iP69 = iPBan67.getIp();
    tp2.IP iP70 = iPBan67.getIp();
    tp2.IP iP71 = iPBan67.getIp();
    java.lang.Integer i72 = iP71.getSecond();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long20 + "' != '" + 10L+ "'", long20.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i30 + "' != '" + 161+ "'", i30.equals(161));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b48 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b56 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i57 + "' != '" + 161+ "'", i57.equals(161));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b58 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b60 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b65 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long68 + "' != '" + 2147483676L+ "'", long68.equals(2147483676L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP69);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP70);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP71);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i72 + "' != '" + (-134217728)+ "'", i72.equals((-134217728)));

  }

  @Test
  public void test365() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test365"); }


    tp2.IP iP4 = new tp2.IP((java.lang.Integer)2147483647, (java.lang.Integer)(-1), (java.lang.Integer)56, (java.lang.Integer)458752);
    tp2.IPBan iPBan6 = new tp2.IPBan(iP4, (java.lang.Long)2147483676L);
    iP4.setFirst((java.lang.Integer)83);
    java.lang.Integer i9 = iP4.getFirst();
    tp2.Server server10 = new tp2.Server();
    tp2.IP iP11 = null;
    boolean b12 = server10.addBan(iP11);
    tp2.ITime iTime13 = null;
    server10.setTime(iTime13);
    tp2.IP iP15 = null;
    tp2.IPBan iPBan17 = new tp2.IPBan(iP15, (java.lang.Long)10L);
    tp2.IP iP18 = iPBan17.getIp();
    java.lang.Long long19 = iPBan17.expires;
    tp2.IP iP20 = null;
    iPBan17.ip = iP20;
    tp2.Server server22 = new tp2.Server();
    tp2.IP iP27 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b28 = server22.removeException(iP27);
    java.lang.Integer i29 = iP27.getFirst();
    iPBan17.setIp(iP27);
    iP27.setFourth((java.lang.Integer)(-2147483620));
    boolean b33 = server10.removeBan(iP27);
    server10.update();
    boolean b35 = iP4.equals((java.lang.Object)server10);
    tp2.Server server36 = new tp2.Server();
    tp2.Server server37 = new tp2.Server();
    tp2.IP iP38 = null;
    boolean b39 = server37.addBan(iP38);
    tp2.IP iP44 = new tp2.IP((java.lang.Integer)31, (java.lang.Integer)31, (java.lang.Integer)31, (java.lang.Integer)0);
    iP44.setSecond((java.lang.Integer)2147483647);
    boolean b47 = server37.addBan(iP44);
    tp2.Server server48 = new tp2.Server();
    tp2.IP iP49 = null;
    boolean b50 = server48.addBan(iP49);
    tp2.ITime iTime51 = null;
    server48.setTime(iTime51);
    tp2.IP iP53 = null;
    tp2.IPBan iPBan55 = new tp2.IPBan(iP53, (java.lang.Long)10L);
    tp2.IP iP56 = iPBan55.getIp();
    java.lang.Long long57 = iPBan55.expires;
    tp2.IP iP58 = null;
    iPBan55.ip = iP58;
    tp2.Server server60 = new tp2.Server();
    tp2.IP iP65 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b66 = server60.removeException(iP65);
    java.lang.Integer i67 = iP65.getFirst();
    iPBan55.setIp(iP65);
    boolean b69 = server48.connect(iP65);
    boolean b70 = server37.removeBan(iP65);
    boolean b71 = server36.addBan(iP65);
    boolean b72 = server10.removeException(iP65);
    server10.update();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 83+ "'", i9.equals(83));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long19 + "' != '" + 10L+ "'", long19.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i29 + "' != '" + 161+ "'", i29.equals(161));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b47 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b50 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long57 + "' != '" + 10L+ "'", long57.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b66 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i67 + "' != '" + 161+ "'", i67.equals(161));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b69 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b70 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b71 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b72 == false);

  }

  @Test
  public void test366() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test366"); }


    java.lang.Integer i1 = java.lang.Integer.decode("3997696");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 3997696+ "'", i1.equals(3997696));

  }

  @Test
  public void test367() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test367"); }


    java.lang.String str2 = java.lang.Integer.toUnsignedString(1493172264, (-1916010497));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1493172264"+ "'", str2.equals("1493172264"));

  }

  @Test
  public void test368() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test368"); }


    tp2.Server server0 = new tp2.Server();
    tp2.IP iP1 = null;
    boolean b2 = server0.addBan(iP1);
    tp2.IP iP7 = new tp2.IP((java.lang.Integer)31, (java.lang.Integer)31, (java.lang.Integer)31, (java.lang.Integer)0);
    iP7.setSecond((java.lang.Integer)2147483647);
    boolean b10 = server0.addBan(iP7);
    tp2.Server server11 = new tp2.Server();
    tp2.IP iP12 = null;
    boolean b13 = server11.addBan(iP12);
    tp2.ITime iTime14 = null;
    server11.setTime(iTime14);
    tp2.IP iP16 = null;
    tp2.IPBan iPBan18 = new tp2.IPBan(iP16, (java.lang.Long)10L);
    tp2.IP iP19 = iPBan18.getIp();
    java.lang.Long long20 = iPBan18.expires;
    tp2.IP iP21 = null;
    iPBan18.ip = iP21;
    tp2.Server server23 = new tp2.Server();
    tp2.IP iP28 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b29 = server23.removeException(iP28);
    java.lang.Integer i30 = iP28.getFirst();
    iPBan18.setIp(iP28);
    boolean b32 = server11.connect(iP28);
    boolean b33 = server0.removeBan(iP28);
    tp2.IP iP38 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    iP38.setFirst((java.lang.Integer)161);
    iP38.setThird((java.lang.Integer)3);
    iP38.setFirst((java.lang.Integer)26);
    iP38.setThird((java.lang.Integer)5);
    boolean b47 = server0.removeBan(iP38);
    java.lang.Integer i48 = iP38.getThird();
    java.lang.Integer i49 = iP38.getThird();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long20 + "' != '" + 10L+ "'", long20.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i30 + "' != '" + 161+ "'", i30.equals(161));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b47 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i48 + "' != '" + 5+ "'", i48.equals(5));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i49 + "' != '" + 5+ "'", i49.equals(5));

  }

  @Test
  public void test369() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test369"); }


    java.lang.Integer i2 = java.lang.Integer.getInteger("a17342da", 47463);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i2 + "' != '" + 47463+ "'", i2.equals(47463));

  }

  @Test
  public void test370() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test370"); }


    tp2.Server server0 = new tp2.Server();
    tp2.IP iP5 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b6 = server0.removeException(iP5);
    iP5.setThird((java.lang.Integer)56);
    tp2.IPBan iPBan10 = new tp2.IPBan(iP5, (java.lang.Long)2147483676L);
    java.lang.Long long11 = null;
    tp2.IPBan iPBan12 = new tp2.IPBan(iP5, long11);
    tp2.IP iP13 = iPBan12.ip;
    iPBan12.setExpires((java.lang.Long)2147483704L);
    iPBan12.setExpires((java.lang.Long)24L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP13);

  }

  @Test
  public void test371() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test371"); }


    int i2 = java.lang.Integer.max(469762049, 1677784324);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1677784324);

  }

  @Test
  public void test372() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test372"); }


    java.lang.String str2 = java.lang.Integer.toUnsignedString(36871, 1600000);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "36871"+ "'", str2.equals("36871"));

  }

  @Test
  public void test373() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test373"); }


    tp2.IP iP0 = null;
    tp2.IPBan iPBan2 = new tp2.IPBan(iP0, (java.lang.Long)10L);
    java.lang.Long long3 = iPBan2.getExpires();
    tp2.IP iP8 = new tp2.IP((java.lang.Integer)31, (java.lang.Integer)31, (java.lang.Integer)31, (java.lang.Integer)0);
    iPBan2.ip = iP8;
    tp2.Server server10 = new tp2.Server();
    tp2.IP iP15 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b16 = server10.removeException(iP15);
    server10.update();
    tp2.Server server18 = new tp2.Server();
    tp2.IP iP23 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b24 = server18.removeException(iP23);
    java.lang.Integer i25 = iP23.getFirst();
    boolean b26 = server10.addBan(iP23);
    iPBan2.setIp(iP23);
    tp2.IP iP28 = iPBan2.ip;
    tp2.IP iP29 = iPBan2.ip;
    tp2.Server server30 = new tp2.Server();
    tp2.IP iP35 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b36 = server30.removeException(iP35);
    server30.update();
    tp2.Server server38 = new tp2.Server();
    tp2.IP iP43 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b44 = server38.removeException(iP43);
    java.lang.Integer i45 = iP43.getFirst();
    boolean b46 = server30.addBan(iP43);
    boolean b48 = iP43.equals((java.lang.Object)(short)10);
    iPBan2.ip = iP43;
    iPBan2.expires = 8L;
    java.lang.Long long52 = iPBan2.expires;
    iPBan2.setExpires((java.lang.Long)176L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L+ "'", long3.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i25 + "' != '" + 161+ "'", i25.equals(161));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i45 + "' != '" + 161+ "'", i45.equals(161));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b46 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b48 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long52 + "' != '" + 8L+ "'", long52.equals(8L));

  }

  @Test
  public void test374() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test374"); }


    int i2 = java.lang.Integer.compareUnsigned(32769, 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);

  }

  @Test
  public void test375() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test375"); }


    tp2.IP iP0 = null;
    tp2.IPBan iPBan2 = new tp2.IPBan(iP0, (java.lang.Long)10L);
    tp2.IP iP3 = iPBan2.ip;
    tp2.Server server4 = new tp2.Server();
    tp2.IP iP5 = null;
    boolean b6 = server4.addBan(iP5);
    tp2.Server server7 = new tp2.Server();
    tp2.IP iP12 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b13 = server7.removeException(iP12);
    boolean b15 = iP12.equals((java.lang.Object)(-1L));
    boolean b16 = server4.removeBan(iP12);
    iPBan2.ip = iP12;
    iP12.setSecond((java.lang.Integer)1073741825);
    iP12.setFourth((java.lang.Integer)2147483647);
    iP12.setThird((java.lang.Integer)1342177280);
    iP12.setThird((java.lang.Integer)21);
    tp2.Server server26 = new tp2.Server();
    tp2.IP iP31 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b32 = server26.removeException(iP31);
    iP31.setThird((java.lang.Integer)56);
    tp2.IPBan iPBan36 = new tp2.IPBan(iP31, (java.lang.Long)2147483676L);
    java.lang.Long long37 = null;
    tp2.IPBan iPBan38 = new tp2.IPBan(iP31, long37);
    tp2.IP iP39 = iPBan38.ip;
    iPBan38.setExpires((java.lang.Long)2147483704L);
    boolean b42 = iP12.equals((java.lang.Object)2147483704L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == false);

  }

  @Test
  public void test376() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test376"); }


    int i2 = java.lang.Integer.compare(1622018560, (-905969531));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);

  }

  @Test
  public void test377() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test377"); }


    tp2.IP iP4 = new tp2.IP((java.lang.Integer)977483676, (java.lang.Integer)461132125, (java.lang.Integer)436207616, (java.lang.Integer)8192);

  }

  @Test
  public void test378() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test378"); }


    tp2.Server server0 = new tp2.Server();
    tp2.IP iP1 = null;
    boolean b2 = server0.connect(iP1);
    tp2.Server server3 = new tp2.Server();
    tp2.Server server4 = new tp2.Server();
    tp2.IP iP5 = null;
    boolean b6 = server4.addBan(iP5);
    tp2.IP iP11 = new tp2.IP((java.lang.Integer)31, (java.lang.Integer)31, (java.lang.Integer)31, (java.lang.Integer)0);
    iP11.setSecond((java.lang.Integer)2147483647);
    boolean b14 = server4.addBan(iP11);
    tp2.Server server15 = new tp2.Server();
    tp2.IP iP16 = null;
    boolean b17 = server15.addBan(iP16);
    tp2.ITime iTime18 = null;
    server15.setTime(iTime18);
    tp2.IP iP20 = null;
    tp2.IPBan iPBan22 = new tp2.IPBan(iP20, (java.lang.Long)10L);
    tp2.IP iP23 = iPBan22.getIp();
    java.lang.Long long24 = iPBan22.expires;
    tp2.IP iP25 = null;
    iPBan22.ip = iP25;
    tp2.Server server27 = new tp2.Server();
    tp2.IP iP32 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b33 = server27.removeException(iP32);
    java.lang.Integer i34 = iP32.getFirst();
    iPBan22.setIp(iP32);
    boolean b36 = server15.connect(iP32);
    boolean b37 = server4.removeBan(iP32);
    boolean b38 = server3.addBan(iP32);
    iP32.setFourth((java.lang.Integer)1476395008);
    boolean b41 = server0.removeBan(iP32);
    server0.update();
    tp2.IP iP47 = new tp2.IP((java.lang.Integer)2147483647, (java.lang.Integer)(-1), (java.lang.Integer)56, (java.lang.Integer)458752);
    boolean b48 = server0.addException(iP47);
    tp2.Server server49 = new tp2.Server();
    tp2.IP iP54 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b55 = server49.removeException(iP54);
    iP54.setThird((java.lang.Integer)56);
    tp2.IPBan iPBan59 = new tp2.IPBan(iP54, (java.lang.Long)2147483676L);
    java.lang.Long long60 = iPBan59.getExpires();
    tp2.IP iP61 = iPBan59.getIp();
    boolean b62 = server0.connect(iP61);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long24 + "' != '" + 10L+ "'", long24.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i34 + "' != '" + 161+ "'", i34.equals(161));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b48 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b55 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long60 + "' != '" + 2147483676L+ "'", long60.equals(2147483676L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP61);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b62 == true);

  }

  @Test
  public void test379() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test379"); }


    tp2.IP iP0 = null;
    tp2.IPBan iPBan2 = new tp2.IPBan(iP0, (java.lang.Long)10L);
    tp2.IP iP3 = iPBan2.getIp();
    java.lang.Long long4 = iPBan2.expires;
    tp2.IP iP5 = null;
    iPBan2.ip = iP5;
    tp2.Server server7 = new tp2.Server();
    tp2.IP iP12 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b13 = server7.removeException(iP12);
    java.lang.Integer i14 = iP12.getFirst();
    iPBan2.setIp(iP12);
    java.lang.Integer i16 = iP12.getFirst();
    java.lang.Integer i17 = iP12.getFirst();
    tp2.IP iP18 = null;
    tp2.IPBan iPBan20 = new tp2.IPBan(iP18, (java.lang.Long)10L);
    java.lang.Long long21 = iPBan20.getExpires();
    tp2.IP iP26 = new tp2.IP((java.lang.Integer)31, (java.lang.Integer)31, (java.lang.Integer)31, (java.lang.Integer)0);
    iPBan20.ip = iP26;
    tp2.Server server28 = new tp2.Server();
    tp2.IP iP33 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b34 = server28.removeException(iP33);
    server28.update();
    tp2.Server server36 = new tp2.Server();
    tp2.IP iP41 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b42 = server36.removeException(iP41);
    java.lang.Integer i43 = iP41.getFirst();
    boolean b44 = server28.addBan(iP41);
    iPBan20.setIp(iP41);
    iPBan20.expires = 1L;
    boolean b48 = iP12.equals((java.lang.Object)1L);
    java.lang.Integer i49 = iP12.getSecond();
    tp2.IPBan iPBan51 = new tp2.IPBan(iP12, (java.lang.Long)2114L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L+ "'", long4.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i14 + "' != '" + 161+ "'", i14.equals(161));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i16 + "' != '" + 161+ "'", i16.equals(161));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i17 + "' != '" + 161+ "'", i17.equals(161));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long21 + "' != '" + 10L+ "'", long21.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i43 + "' != '" + 161+ "'", i43.equals(161));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b48 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i49 + "' != '" + (-2147483648)+ "'", i49.equals((-2147483648)));

  }

  @Test
  public void test380() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test380"); }


    tp2.IP iP0 = null;
    tp2.IPBan iPBan2 = new tp2.IPBan(iP0, (java.lang.Long)10L);
    tp2.IP iP3 = iPBan2.getIp();
    tp2.Server server4 = new tp2.Server();
    tp2.IP iP5 = null;
    boolean b6 = server4.connect(iP5);
    tp2.IP iP7 = null;
    tp2.IPBan iPBan9 = new tp2.IPBan(iP7, (java.lang.Long)10L);
    java.lang.Long long10 = iPBan9.getExpires();
    tp2.IP iP15 = new tp2.IP((java.lang.Integer)31, (java.lang.Integer)31, (java.lang.Integer)31, (java.lang.Integer)0);
    iPBan9.ip = iP15;
    tp2.Server server17 = new tp2.Server();
    tp2.IP iP22 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b23 = server17.removeException(iP22);
    server17.update();
    tp2.Server server25 = new tp2.Server();
    tp2.IP iP30 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b31 = server25.removeException(iP30);
    java.lang.Integer i32 = iP30.getFirst();
    boolean b33 = server17.addBan(iP30);
    iPBan9.setIp(iP30);
    boolean b35 = server4.removeException(iP30);
    iPBan2.setIp(iP30);
    java.lang.Integer i37 = iP30.getFourth();
    java.lang.Integer i38 = iP30.getSecond();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long10 + "' != '" + 10L+ "'", long10.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i32 + "' != '" + 161+ "'", i32.equals(161));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i37 + "' != '" + 5+ "'", i37.equals(5));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i38 + "' != '" + (-2147483648)+ "'", i38.equals((-2147483648)));

  }

  @Test
  public void test381() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test381"); }


    int i1 = java.lang.Integer.reverse(1879047781);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == (-1501560842));

  }

  @Test
  public void test382() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test382"); }


    java.lang.Integer i1 = new java.lang.Integer(130027904);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 130027904+ "'", i1.equals(130027904));

  }

  @Test
  public void test383() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test383"); }


    tp2.Server server0 = new tp2.Server();
    tp2.IP iP1 = null;
    boolean b2 = server0.addBan(iP1);
    tp2.IP iP7 = new tp2.IP((java.lang.Integer)31, (java.lang.Integer)31, (java.lang.Integer)31, (java.lang.Integer)0);
    iP7.setSecond((java.lang.Integer)2147483647);
    boolean b10 = server0.addBan(iP7);
    tp2.IP iP11 = null;
    tp2.IPBan iPBan13 = new tp2.IPBan(iP11, (java.lang.Long)10L);
    tp2.Server server14 = new tp2.Server();
    tp2.IP iP19 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b20 = server14.removeException(iP19);
    server14.update();
    tp2.Server server22 = new tp2.Server();
    tp2.IP iP23 = null;
    boolean b24 = server22.addBan(iP23);
    tp2.Server server25 = new tp2.Server();
    tp2.IP iP30 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b31 = server25.removeException(iP30);
    boolean b33 = iP30.equals((java.lang.Object)(-1L));
    boolean b34 = server22.removeBan(iP30);
    tp2.IP iP39 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    iP39.setFirst((java.lang.Integer)161);
    iP39.setThird((java.lang.Integer)3);
    iP39.setFirst((java.lang.Integer)26);
    boolean b46 = server22.connect(iP39);
    iP39.setSecond((java.lang.Integer)1677721761);
    boolean b49 = server14.removeBan(iP39);
    tp2.Server server50 = new tp2.Server();
    tp2.IP iP51 = null;
    boolean b52 = server50.addBan(iP51);
    tp2.ITime iTime53 = null;
    server50.setTime(iTime53);
    tp2.IP iP55 = null;
    tp2.IPBan iPBan57 = new tp2.IPBan(iP55, (java.lang.Long)10L);
    tp2.IP iP58 = iPBan57.getIp();
    java.lang.Long long59 = iPBan57.expires;
    tp2.IP iP60 = null;
    iPBan57.ip = iP60;
    tp2.Server server62 = new tp2.Server();
    tp2.IP iP67 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b68 = server62.removeException(iP67);
    java.lang.Integer i69 = iP67.getFirst();
    iPBan57.setIp(iP67);
    boolean b71 = server50.connect(iP67);
    iP67.setFourth((java.lang.Integer)(-1));
    boolean b74 = server14.removeException(iP67);
    iPBan13.ip = iP67;
    boolean b76 = server0.removeBan(iP67);
    iP67.setFirst((java.lang.Integer)28672);
    java.lang.Integer i79 = iP67.getFirst();
    java.lang.Integer i80 = iP67.getThird();
    java.lang.Integer i81 = iP67.getFirst();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b46 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b49 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b52 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP58);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long59 + "' != '" + 10L+ "'", long59.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b68 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i69 + "' != '" + 161+ "'", i69.equals(161));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b71 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b74 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b76 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i79 + "' != '" + 28672+ "'", i79.equals(28672));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i80 + "' != '" + 939524096+ "'", i80.equals(939524096));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i81 + "' != '" + 28672+ "'", i81.equals(28672));

  }

  @Test
  public void test384() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test384"); }


    tp2.IP iP4 = new tp2.IP((java.lang.Integer)31, (java.lang.Integer)31, (java.lang.Integer)31, (java.lang.Integer)0);
    tp2.Server server5 = new tp2.Server();
    tp2.IP iP6 = null;
    boolean b7 = server5.addBan(iP6);
    tp2.ITime iTime8 = null;
    server5.setTime(iTime8);
    tp2.Server server10 = new tp2.Server();
    tp2.IP iP11 = null;
    boolean b12 = server10.addBan(iP11);
    server10.update();
    tp2.IP iP14 = null;
    tp2.IPBan iPBan16 = new tp2.IPBan(iP14, (java.lang.Long)10L);
    tp2.IP iP17 = iPBan16.getIp();
    java.lang.Long long18 = iPBan16.expires;
    tp2.IP iP19 = null;
    iPBan16.ip = iP19;
    tp2.Server server21 = new tp2.Server();
    tp2.IP iP26 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b27 = server21.removeException(iP26);
    java.lang.Integer i28 = iP26.getFirst();
    iPBan16.setIp(iP26);
    java.lang.Integer i30 = iP26.getFirst();
    java.lang.Integer i31 = iP26.getFirst();
    boolean b32 = server10.addBan(iP26);
    boolean b33 = server5.addException(iP26);
    tp2.IP iP34 = null;
    tp2.IPBan iPBan36 = new tp2.IPBan(iP34, (java.lang.Long)10L);
    tp2.IP iP37 = iPBan36.getIp();
    java.lang.Long long38 = iPBan36.expires;
    tp2.IP iP39 = null;
    iPBan36.ip = iP39;
    tp2.Server server41 = new tp2.Server();
    tp2.IP iP42 = null;
    boolean b43 = server41.addBan(iP42);
    tp2.ITime iTime44 = null;
    server41.setTime(iTime44);
    tp2.IP iP46 = null;
    tp2.IPBan iPBan48 = new tp2.IPBan(iP46, (java.lang.Long)10L);
    tp2.IP iP49 = iPBan48.getIp();
    java.lang.Long long50 = iPBan48.expires;
    tp2.IP iP51 = null;
    iPBan48.ip = iP51;
    tp2.Server server53 = new tp2.Server();
    tp2.IP iP58 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b59 = server53.removeException(iP58);
    java.lang.Integer i60 = iP58.getFirst();
    iPBan48.setIp(iP58);
    boolean b62 = server41.connect(iP58);
    iPBan36.setIp(iP58);
    boolean b64 = server5.removeBan(iP58);
    tp2.IP iP65 = null;
    tp2.IPBan iPBan67 = new tp2.IPBan(iP65, (java.lang.Long)10L);
    tp2.IP iP68 = iPBan67.getIp();
    java.lang.Long long69 = iPBan67.expires;
    tp2.IP iP70 = null;
    iPBan67.ip = iP70;
    tp2.Server server72 = new tp2.Server();
    tp2.IP iP77 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b78 = server72.removeException(iP77);
    java.lang.Integer i79 = iP77.getFirst();
    iPBan67.setIp(iP77);
    tp2.IP iP81 = iPBan67.getIp();
    java.lang.Integer i82 = iP81.getSecond();
    boolean b83 = server5.connect(iP81);
    boolean b84 = iP4.equals((java.lang.Object)iP81);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long18 + "' != '" + 10L+ "'", long18.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i28 + "' != '" + 161+ "'", i28.equals(161));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i30 + "' != '" + 161+ "'", i30.equals(161));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i31 + "' != '" + 161+ "'", i31.equals(161));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long38 + "' != '" + 10L+ "'", long38.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b43 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long50 + "' != '" + 10L+ "'", long50.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b59 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i60 + "' != '" + 161+ "'", i60.equals(161));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b62 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b64 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP68);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long69 + "' != '" + 10L+ "'", long69.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b78 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i79 + "' != '" + 161+ "'", i79.equals(161));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP81);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i82 + "' != '" + (-2147483648)+ "'", i82.equals((-2147483648)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b83 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b84 == false);

  }

  @Test
  public void test385() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test385"); }


    java.lang.Integer i2 = java.lang.Integer.getInteger("88", 800);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i2 + "' != '" + 800+ "'", i2.equals(800));

  }

  @Test
  public void test386() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test386"); }


    tp2.IP iP0 = null;
    tp2.IPBan iPBan2 = new tp2.IPBan(iP0, (java.lang.Long)10L);
    tp2.IP iP3 = iPBan2.getIp();
    java.lang.Long long4 = iPBan2.expires;
    tp2.IP iP5 = null;
    iPBan2.ip = iP5;
    java.lang.Long long7 = iPBan2.expires;
    tp2.Server server8 = new tp2.Server();
    tp2.IP iP13 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b14 = server8.removeException(iP13);
    iP13.setThird((java.lang.Integer)56);
    java.lang.Integer i17 = iP13.getFourth();
    tp2.IPBan iPBan19 = new tp2.IPBan(iP13, (java.lang.Long)10L);
    iPBan2.setIp(iP13);
    tp2.IP iP21 = iPBan2.getIp();
    iPBan2.setExpires((java.lang.Long)5211392L);
    tp2.IP iP28 = new tp2.IP((java.lang.Integer)133, (java.lang.Integer)(-2147483515), (java.lang.Integer)79, (java.lang.Integer)(-2147483620));
    iPBan2.ip = iP28;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L+ "'", long4.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long7 + "' != '" + 10L+ "'", long7.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i17 + "' != '" + 5+ "'", i17.equals(5));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP21);

  }

  @Test
  public void test387() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test387"); }


    java.lang.Integer i2 = java.lang.Integer.getInteger("1f004a", 16777360);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i2 + "' != '" + 16777360+ "'", i2.equals(16777360));

  }

  @Test
  public void test388() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test388"); }


    java.lang.String str2 = java.lang.Integer.toUnsignedString(5832, 277);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "5832"+ "'", str2.equals("5832"));

  }

  @Test
  public void test389() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test389"); }


    java.lang.String str1 = java.lang.Integer.toUnsignedString((-16822329));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "4278144967"+ "'", str1.equals("4278144967"));

  }

  @Test
  public void test390() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test390"); }


    tp2.IP iP0 = null;
    tp2.IPBan iPBan2 = new tp2.IPBan(iP0, (java.lang.Long)10L);
    tp2.IP iP3 = iPBan2.getIp();
    java.lang.Long long4 = iPBan2.expires;
    tp2.IP iP5 = null;
    iPBan2.ip = iP5;
    tp2.Server server7 = new tp2.Server();
    tp2.IP iP12 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b13 = server7.removeException(iP12);
    java.lang.Integer i14 = iP12.getFirst();
    iPBan2.setIp(iP12);
    java.lang.Integer i16 = iP12.getFirst();
    boolean b18 = iP12.equals((java.lang.Object)(short)(-1));
    tp2.IPBan iPBan20 = new tp2.IPBan(iP12, (java.lang.Long)2147483676L);
    iP12.setThird((java.lang.Integer)100004);
    java.lang.Integer i23 = iP12.getFourth();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L+ "'", long4.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i14 + "' != '" + 161+ "'", i14.equals(161));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i16 + "' != '" + 161+ "'", i16.equals(161));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i23 + "' != '" + 5+ "'", i23.equals(5));

  }

  @Test
  public void test391() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test391"); }


    tp2.IP iP0 = null;
    tp2.IPBan iPBan2 = new tp2.IPBan(iP0, (java.lang.Long)10L);
    tp2.IP iP3 = iPBan2.getIp();
    java.lang.Long long4 = iPBan2.expires;
    tp2.Server server5 = new tp2.Server();
    tp2.IP iP10 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b11 = server5.removeException(iP10);
    java.lang.Integer i12 = iP10.getFirst();
    iPBan2.setIp(iP10);
    tp2.IP iP14 = iPBan2.ip;
    tp2.IP iP15 = null;
    tp2.IPBan iPBan17 = new tp2.IPBan(iP15, (java.lang.Long)10L);
    java.lang.Long long18 = iPBan17.getExpires();
    tp2.IP iP23 = new tp2.IP((java.lang.Integer)31, (java.lang.Integer)31, (java.lang.Integer)31, (java.lang.Integer)0);
    iPBan17.ip = iP23;
    iP23.setFirst((java.lang.Integer)2);
    iPBan2.setIp(iP23);
    tp2.Server server28 = new tp2.Server();
    tp2.IP iP29 = null;
    boolean b30 = server28.addBan(iP29);
    tp2.Server server31 = new tp2.Server();
    tp2.IP iP36 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b37 = server31.removeException(iP36);
    boolean b39 = iP36.equals((java.lang.Object)(-1L));
    boolean b40 = server28.removeBan(iP36);
    iPBan2.ip = iP36;
    iP36.setFourth((java.lang.Integer)61);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L+ "'", long4.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i12 + "' != '" + 161+ "'", i12.equals(161));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long18 + "' != '" + 10L+ "'", long18.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == false);

  }

  @Test
  public void test392() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test392"); }


    int i2 = java.lang.Integer.compareUnsigned(1108377636, 322630940);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);

  }

  @Test
  public void test393() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test393"); }


    java.lang.Integer i2 = java.lang.Integer.getInteger("16700400000", 128);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i2 + "' != '" + 128+ "'", i2.equals(128));

  }

  @Test
  public void test394() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test394"); }


    long long1 = java.lang.Integer.toUnsignedLong(939524096);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == 939524096L);

  }

  @Test
  public void test395() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test395"); }


    int i2 = java.lang.Integer.max(33562752, 1344);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 33562752);

  }

  @Test
  public void test396() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test396"); }


    tp2.Server server0 = new tp2.Server();
    tp2.IP iP1 = null;
    boolean b2 = server0.connect(iP1);
    tp2.Server server3 = new tp2.Server();
    tp2.Server server4 = new tp2.Server();
    tp2.IP iP5 = null;
    boolean b6 = server4.addBan(iP5);
    tp2.IP iP11 = new tp2.IP((java.lang.Integer)31, (java.lang.Integer)31, (java.lang.Integer)31, (java.lang.Integer)0);
    iP11.setSecond((java.lang.Integer)2147483647);
    boolean b14 = server4.addBan(iP11);
    tp2.Server server15 = new tp2.Server();
    tp2.IP iP16 = null;
    boolean b17 = server15.addBan(iP16);
    tp2.ITime iTime18 = null;
    server15.setTime(iTime18);
    tp2.IP iP20 = null;
    tp2.IPBan iPBan22 = new tp2.IPBan(iP20, (java.lang.Long)10L);
    tp2.IP iP23 = iPBan22.getIp();
    java.lang.Long long24 = iPBan22.expires;
    tp2.IP iP25 = null;
    iPBan22.ip = iP25;
    tp2.Server server27 = new tp2.Server();
    tp2.IP iP32 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b33 = server27.removeException(iP32);
    java.lang.Integer i34 = iP32.getFirst();
    iPBan22.setIp(iP32);
    boolean b36 = server15.connect(iP32);
    boolean b37 = server4.removeBan(iP32);
    boolean b38 = server3.addBan(iP32);
    iP32.setFourth((java.lang.Integer)1476395008);
    boolean b41 = server0.removeBan(iP32);
    server0.update();
    tp2.IP iP47 = new tp2.IP((java.lang.Integer)2147483647, (java.lang.Integer)(-1), (java.lang.Integer)56, (java.lang.Integer)458752);
    boolean b48 = server0.addException(iP47);
    tp2.IP iP49 = null;
    tp2.IPBan iPBan51 = new tp2.IPBan(iP49, (java.lang.Long)10L);
    tp2.IP iP52 = iPBan51.getIp();
    java.lang.Long long53 = iPBan51.expires;
    tp2.Server server54 = new tp2.Server();
    tp2.IP iP59 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b60 = server54.removeException(iP59);
    java.lang.Integer i61 = iP59.getFirst();
    iPBan51.setIp(iP59);
    java.lang.Integer i63 = iP59.getThird();
    boolean b64 = server0.addException(iP59);
    iP59.setSecond((java.lang.Integer)1587430);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long24 + "' != '" + 10L+ "'", long24.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i34 + "' != '" + 161+ "'", i34.equals(161));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b48 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long53 + "' != '" + 10L+ "'", long53.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b60 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i61 + "' != '" + 161+ "'", i61.equals(161));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i63 + "' != '" + 939524096+ "'", i63.equals(939524096));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b64 == true);

  }

  @Test
  public void test397() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test397"); }


    tp2.Server server0 = new tp2.Server();
    tp2.IP iP1 = null;
    boolean b2 = server0.addBan(iP1);
    tp2.IP iP7 = new tp2.IP((java.lang.Integer)31, (java.lang.Integer)31, (java.lang.Integer)31, (java.lang.Integer)0);
    iP7.setSecond((java.lang.Integer)2147483647);
    boolean b10 = server0.addBan(iP7);
    tp2.Server server11 = new tp2.Server();
    tp2.IP iP12 = null;
    boolean b13 = server11.addBan(iP12);
    tp2.Server server14 = new tp2.Server();
    tp2.IP iP19 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b20 = server14.removeException(iP19);
    boolean b22 = iP19.equals((java.lang.Object)(-1L));
    boolean b23 = server11.removeBan(iP19);
    java.lang.Integer i24 = iP19.getFourth();
    boolean b25 = server0.removeBan(iP19);
    tp2.ITime iTime26 = null;
    server0.setTime(iTime26);
    server0.update();
    tp2.ITime iTime29 = null;
    server0.setTime(iTime29);
    server0.update();
    tp2.IP iP32 = null;
    tp2.IPBan iPBan34 = new tp2.IPBan(iP32, (java.lang.Long)10L);
    java.lang.Long long35 = iPBan34.getExpires();
    tp2.IP iP40 = new tp2.IP((java.lang.Integer)31, (java.lang.Integer)31, (java.lang.Integer)31, (java.lang.Integer)0);
    iPBan34.ip = iP40;
    tp2.Server server42 = new tp2.Server();
    tp2.IP iP47 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b48 = server42.removeException(iP47);
    server42.update();
    tp2.Server server50 = new tp2.Server();
    tp2.IP iP55 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b56 = server50.removeException(iP55);
    java.lang.Integer i57 = iP55.getFirst();
    boolean b58 = server42.addBan(iP55);
    iPBan34.setIp(iP55);
    tp2.IP iP60 = iPBan34.ip;
    tp2.IP iP61 = iPBan34.ip;
    tp2.IPBan iPBan63 = new tp2.IPBan(iP61, (java.lang.Long)100L);
    tp2.IP iP64 = iPBan63.getIp();
    boolean b65 = server0.addBan(iP64);
    java.lang.Integer i66 = iP64.getFourth();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i24 + "' != '" + 5+ "'", i24.equals(5));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long35 + "' != '" + 10L+ "'", long35.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b48 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b56 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i57 + "' != '" + 161+ "'", i57.equals(161));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b58 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP60);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP61);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP64);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b65 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i66 + "' != '" + 5+ "'", i66.equals(5));

  }

  @Test
  public void test398() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test398"); }


    // The following exception was thrown during execution in test generation
    try {
      int i2 = java.lang.Integer.parseInt("1622018560", 44);
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test399() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test399"); }


    tp2.IP iP0 = null;
    tp2.IPBan iPBan2 = new tp2.IPBan(iP0, (java.lang.Long)10L);
    tp2.IP iP3 = iPBan2.getIp();
    iPBan2.setExpires((java.lang.Long)2147483676L);
    java.lang.Long long6 = iPBan2.getExpires();
    tp2.IP iP7 = iPBan2.getIp();
    java.lang.Long long8 = iPBan2.getExpires();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long6 + "' != '" + 2147483676L+ "'", long6.equals(2147483676L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long8 + "' != '" + 2147483676L+ "'", long8.equals(2147483676L));

  }

  @Test
  public void test400() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test400"); }


    tp2.Server server0 = new tp2.Server();
    tp2.IP iP1 = null;
    boolean b2 = server0.addBan(iP1);
    tp2.ITime iTime3 = null;
    server0.setTime(iTime3);
    server0.update();
    tp2.Server server6 = new tp2.Server();
    tp2.IP iP11 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b12 = server6.removeException(iP11);
    boolean b13 = server0.addException(iP11);
    tp2.IP iP14 = null;
    tp2.IPBan iPBan16 = new tp2.IPBan(iP14, (java.lang.Long)10L);
    tp2.IP iP17 = iPBan16.getIp();
    java.lang.Long long18 = iPBan16.expires;
    tp2.IP iP19 = null;
    iPBan16.ip = iP19;
    tp2.Server server21 = new tp2.Server();
    tp2.IP iP26 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b27 = server21.removeException(iP26);
    java.lang.Integer i28 = iP26.getFirst();
    iPBan16.setIp(iP26);
    java.lang.Long long30 = iPBan16.expires;
    tp2.IP iP31 = iPBan16.getIp();
    boolean b33 = iP31.equals((java.lang.Object)1326);
    iP31.setFirst((java.lang.Integer)20);
    boolean b36 = server0.removeException(iP31);
    tp2.Server server37 = new tp2.Server();
    tp2.IP iP38 = null;
    boolean b39 = server37.addBan(iP38);
    tp2.Server server40 = new tp2.Server();
    tp2.IP iP45 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b46 = server40.removeException(iP45);
    boolean b48 = iP45.equals((java.lang.Object)(-1L));
    boolean b49 = server37.removeBan(iP45);
    tp2.IP iP54 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    iP54.setFirst((java.lang.Integer)161);
    iP54.setThird((java.lang.Integer)3);
    iP54.setFirst((java.lang.Integer)26);
    boolean b61 = server37.connect(iP54);
    tp2.IP iP66 = new tp2.IP((java.lang.Integer)2147483647, (java.lang.Integer)(-1), (java.lang.Integer)56, (java.lang.Integer)458752);
    boolean b67 = server37.addException(iP66);
    iP66.setFirst((java.lang.Integer)14);
    boolean b70 = server0.removeException(iP66);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long18 + "' != '" + 10L+ "'", long18.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i28 + "' != '" + 161+ "'", i28.equals(161));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long30 + "' != '" + 10L+ "'", long30.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b46 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b48 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b49 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b61 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b67 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b70 == false);

  }

  @Test
  public void test401() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test401"); }


    int i2 = java.lang.Integer.min(0, 58);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);

  }

  @Test
  public void test402() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test402"); }


    int i2 = java.lang.Integer.rotateRight(176, 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 88);

  }

  @Test
  public void test403() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test403"); }


    int i1 = java.lang.Integer.signum((-1878982656));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == (-1));

  }

  @Test
  public void test404() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test404"); }


    tp2.Server server0 = new tp2.Server();
    tp2.IP iP1 = null;
    boolean b2 = server0.connect(iP1);
    tp2.IP iP7 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)83, (java.lang.Integer)26, (java.lang.Integer)100);
    boolean b8 = server0.addBan(iP7);
    tp2.Server server9 = new tp2.Server();
    tp2.IP iP10 = null;
    boolean b11 = server9.addBan(iP10);
    tp2.Server server12 = new tp2.Server();
    tp2.IP iP17 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b18 = server12.removeException(iP17);
    boolean b20 = iP17.equals((java.lang.Object)(-1L));
    boolean b21 = server9.removeBan(iP17);
    server9.update();
    server9.update();
    tp2.IP iP24 = null;
    tp2.IPBan iPBan26 = new tp2.IPBan(iP24, (java.lang.Long)10L);
    tp2.IP iP27 = iPBan26.getIp();
    java.lang.Long long28 = iPBan26.expires;
    tp2.IP iP29 = null;
    iPBan26.ip = iP29;
    java.lang.Long long31 = iPBan26.getExpires();
    iPBan26.expires = 14L;
    tp2.IP iP34 = null;
    tp2.IPBan iPBan36 = new tp2.IPBan(iP34, (java.lang.Long)10L);
    tp2.IP iP37 = iPBan36.getIp();
    java.lang.Long long38 = iPBan36.expires;
    tp2.IP iP39 = null;
    iPBan36.ip = iP39;
    tp2.Server server41 = new tp2.Server();
    tp2.IP iP46 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b47 = server41.removeException(iP46);
    java.lang.Integer i48 = iP46.getFirst();
    iPBan36.setIp(iP46);
    tp2.IP iP50 = iPBan36.getIp();
    iPBan36.setExpires((java.lang.Long)2701131776L);
    tp2.IP iP53 = iPBan36.getIp();
    iPBan26.setIp(iP53);
    boolean b55 = server9.connect(iP53);
    boolean b56 = server0.removeException(iP53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long28 + "' != '" + 10L+ "'", long28.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long31 + "' != '" + 10L+ "'", long31.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long38 + "' != '" + 10L+ "'", long38.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b47 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i48 + "' != '" + 161+ "'", i48.equals(161));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b55 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b56 == false);

  }

  @Test
  public void test405() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test405"); }


    java.lang.Integer i1 = java.lang.Integer.getInteger("2147483648");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);

  }

  @Test
  public void test406() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test406"); }


    tp2.Server server0 = new tp2.Server();
    tp2.IP iP1 = null;
    boolean b2 = server0.connect(iP1);
    tp2.Server server3 = new tp2.Server();
    tp2.Server server4 = new tp2.Server();
    tp2.IP iP5 = null;
    boolean b6 = server4.addBan(iP5);
    tp2.IP iP11 = new tp2.IP((java.lang.Integer)31, (java.lang.Integer)31, (java.lang.Integer)31, (java.lang.Integer)0);
    iP11.setSecond((java.lang.Integer)2147483647);
    boolean b14 = server4.addBan(iP11);
    tp2.Server server15 = new tp2.Server();
    tp2.IP iP16 = null;
    boolean b17 = server15.addBan(iP16);
    tp2.ITime iTime18 = null;
    server15.setTime(iTime18);
    tp2.IP iP20 = null;
    tp2.IPBan iPBan22 = new tp2.IPBan(iP20, (java.lang.Long)10L);
    tp2.IP iP23 = iPBan22.getIp();
    java.lang.Long long24 = iPBan22.expires;
    tp2.IP iP25 = null;
    iPBan22.ip = iP25;
    tp2.Server server27 = new tp2.Server();
    tp2.IP iP32 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b33 = server27.removeException(iP32);
    java.lang.Integer i34 = iP32.getFirst();
    iPBan22.setIp(iP32);
    boolean b36 = server15.connect(iP32);
    boolean b37 = server4.removeBan(iP32);
    boolean b38 = server3.addBan(iP32);
    iP32.setFourth((java.lang.Integer)1476395008);
    boolean b41 = server0.removeBan(iP32);
    tp2.IP iP42 = null;
    boolean b43 = server0.addBan(iP42);
    tp2.ITime iTime44 = null;
    server0.setTime(iTime44);
    tp2.Server server46 = new tp2.Server();
    tp2.IP iP47 = null;
    boolean b48 = server46.addBan(iP47);
    tp2.ITime iTime49 = null;
    server46.setTime(iTime49);
    tp2.IP iP51 = null;
    tp2.IPBan iPBan53 = new tp2.IPBan(iP51, (java.lang.Long)10L);
    tp2.IP iP54 = iPBan53.getIp();
    java.lang.Long long55 = iPBan53.expires;
    tp2.IP iP56 = null;
    iPBan53.ip = iP56;
    tp2.Server server58 = new tp2.Server();
    tp2.IP iP63 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b64 = server58.removeException(iP63);
    java.lang.Integer i65 = iP63.getFirst();
    iPBan53.setIp(iP63);
    boolean b67 = server46.connect(iP63);
    tp2.Server server68 = new tp2.Server();
    tp2.IP iP73 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b74 = server68.removeException(iP73);
    server68.update();
    tp2.Server server76 = new tp2.Server();
    tp2.IP iP81 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b82 = server76.removeException(iP81);
    java.lang.Integer i83 = iP81.getFirst();
    boolean b84 = server68.addBan(iP81);
    boolean b86 = iP81.equals((java.lang.Object)(short)10);
    iP81.setSecond((java.lang.Integer)(-134217728));
    iP81.setFirst((java.lang.Integer)(-2147483592));
    boolean b91 = server46.addException(iP81);
    boolean b92 = server0.connect(iP81);
    iP81.setFirst((java.lang.Integer)11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long24 + "' != '" + 10L+ "'", long24.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i34 + "' != '" + 161+ "'", i34.equals(161));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b43 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b48 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long55 + "' != '" + 10L+ "'", long55.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b64 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i65 + "' != '" + 161+ "'", i65.equals(161));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b67 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b74 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b82 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i83 + "' != '" + 161+ "'", i83.equals(161));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b84 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b86 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b91 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b92 == true);

  }

  @Test
  public void test407() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test407"); }


    int i1 = java.lang.Integer.reverseBytes((-1593835437));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 1392509089);

  }

  @Test
  public void test408() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test408"); }


    java.lang.String str1 = java.lang.Integer.toBinaryString((-855637916));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "11001101000000000000000001100100"+ "'", str1.equals("11001101000000000000000001100100"));

  }

  @Test
  public void test409() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test409"); }


    java.lang.String str2 = java.lang.Integer.toUnsignedString(20396259, 205440);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "20396259"+ "'", str2.equals("20396259"));

  }

  @Test
  public void test410() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test410"); }


    java.lang.String str1 = java.lang.Integer.toBinaryString(4897831);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "10010101011110000100111"+ "'", str1.equals("10010101011110000100111"));

  }

  @Test
  public void test411() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test411"); }


    java.lang.String str1 = java.lang.Integer.toUnsignedString(525611);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "525611"+ "'", str1.equals("525611"));

  }

  @Test
  public void test412() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test412"); }


    // The following exception was thrown during execution in test generation
    try {
      int i1 = java.lang.Integer.parseUnsignedInt("c");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test413() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test413"); }


    tp2.IP iP0 = null;
    tp2.IPBan iPBan2 = new tp2.IPBan(iP0, (java.lang.Long)10L);
    tp2.IP iP3 = iPBan2.getIp();
    java.lang.Long long4 = iPBan2.expires;
    tp2.IP iP5 = null;
    iPBan2.ip = iP5;
    tp2.Server server7 = new tp2.Server();
    tp2.IP iP12 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b13 = server7.removeException(iP12);
    java.lang.Integer i14 = iP12.getFirst();
    iPBan2.setIp(iP12);
    java.lang.Long long16 = iPBan2.expires;
    tp2.IP iP17 = iPBan2.getIp();
    iPBan2.setExpires((java.lang.Long)4160749568L);
    tp2.Server server20 = new tp2.Server();
    tp2.IP iP25 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b26 = server20.removeException(iP25);
    server20.update();
    tp2.Server server28 = new tp2.Server();
    tp2.IP iP29 = null;
    boolean b30 = server28.addBan(iP29);
    tp2.Server server31 = new tp2.Server();
    tp2.IP iP36 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b37 = server31.removeException(iP36);
    boolean b39 = iP36.equals((java.lang.Object)(-1L));
    boolean b40 = server28.removeBan(iP36);
    tp2.IP iP45 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    iP45.setFirst((java.lang.Integer)161);
    iP45.setThird((java.lang.Integer)3);
    iP45.setFirst((java.lang.Integer)26);
    boolean b52 = server28.connect(iP45);
    iP45.setSecond((java.lang.Integer)1677721761);
    boolean b55 = server20.removeBan(iP45);
    iPBan2.setIp(iP45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L+ "'", long4.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i14 + "' != '" + 161+ "'", i14.equals(161));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long16 + "' != '" + 10L+ "'", long16.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b52 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b55 == false);

  }

  @Test
  public void test414() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test414"); }


    int i2 = java.lang.Integer.compare(1270, 62);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);

  }

  @Test
  public void test415() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test415"); }


    int i1 = java.lang.Integer.reverse(512);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 4194304);

  }

  @Test
  public void test416() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test416"); }


    int i2 = java.lang.Integer.compare(44410945, 75827200);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == (-1));

  }

  @Test
  public void test417() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test417"); }


    int i2 = java.lang.Integer.min(1437910020, (-1073545216));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == (-1073545216));

  }

  @Test
  public void test418() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test418"); }


    int i2 = java.lang.Integer.compareUnsigned(1743650821, 218103808);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);

  }

  @Test
  public void test419() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test419"); }


    // The following exception was thrown during execution in test generation
    try {
      java.lang.Integer i1 = new java.lang.Integer("aae60");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test420() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test420"); }


    int i1 = java.lang.Integer.signum(1677721805);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 1);

  }

  @Test
  public void test421() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test421"); }


    // The following exception was thrown during execution in test generation
    try {
      java.lang.Integer i2 = java.lang.Integer.valueOf("1996619776", 1815367680);
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test422() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test422"); }


    tp2.Server server0 = new tp2.Server();
    tp2.IP iP1 = null;
    boolean b2 = server0.addBan(iP1);
    tp2.Server server3 = new tp2.Server();
    tp2.IP iP8 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b9 = server3.removeException(iP8);
    boolean b11 = iP8.equals((java.lang.Object)(-1L));
    boolean b12 = server0.removeBan(iP8);
    tp2.IP iP17 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    iP17.setFirst((java.lang.Integer)161);
    iP17.setThird((java.lang.Integer)3);
    iP17.setFirst((java.lang.Integer)26);
    boolean b24 = server0.connect(iP17);
    tp2.IP iP25 = null;
    tp2.IPBan iPBan27 = new tp2.IPBan(iP25, (java.lang.Long)10L);
    java.lang.Long long28 = iPBan27.getExpires();
    tp2.IP iP33 = new tp2.IP((java.lang.Integer)31, (java.lang.Integer)31, (java.lang.Integer)31, (java.lang.Integer)0);
    iPBan27.ip = iP33;
    iP33.setFirst((java.lang.Integer)2);
    boolean b37 = server0.connect(iP33);
    tp2.IP iP38 = null;
    tp2.IPBan iPBan40 = new tp2.IPBan(iP38, (java.lang.Long)10L);
    tp2.IP iP41 = iPBan40.getIp();
    java.lang.Long long42 = iPBan40.expires;
    tp2.IP iP43 = null;
    iPBan40.ip = iP43;
    tp2.Server server45 = new tp2.Server();
    tp2.IP iP50 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b51 = server45.removeException(iP50);
    java.lang.Integer i52 = iP50.getFirst();
    iPBan40.setIp(iP50);
    iP50.setSecond((java.lang.Integer)1476395008);
    tp2.IPBan iPBan57 = new tp2.IPBan(iP50, (java.lang.Long)10L);
    boolean b58 = server0.removeBan(iP50);
    java.lang.Integer i59 = iP50.getFirst();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long28 + "' != '" + 10L+ "'", long28.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long42 + "' != '" + 10L+ "'", long42.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b51 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i52 + "' != '" + 161+ "'", i52.equals(161));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b58 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i59 + "' != '" + 161+ "'", i59.equals(161));

  }

  @Test
  public void test423() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test423"); }


    java.lang.Integer i1 = java.lang.Integer.valueOf(1879047781);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 1879047781+ "'", i1.equals(1879047781));

  }

  @Test
  public void test424() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test424"); }


    int i1 = java.lang.Integer.bitCount(532);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 3);

  }

  @Test
  public void test425() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test425"); }


    int i1 = java.lang.Integer.parseInt("352321536");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 352321536);

  }

  @Test
  public void test426() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test426"); }


    tp2.Server server0 = new tp2.Server();
    tp2.IP iP5 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b6 = server0.removeException(iP5);
    iP5.setThird((java.lang.Integer)56);
    java.lang.Integer i9 = iP5.getFourth();
    tp2.IPBan iPBan11 = new tp2.IPBan(iP5, (java.lang.Long)10L);
    iPBan11.expires = 2147483647L;
    java.lang.Long long14 = iPBan11.getExpires();
    tp2.IP iP15 = iPBan11.ip;
    tp2.IP iP16 = iPBan11.getIp();
    java.lang.Integer i17 = iP16.getThird();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 5+ "'", i9.equals(5));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long14 + "' != '" + 2147483647L+ "'", long14.equals(2147483647L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i17 + "' != '" + 56+ "'", i17.equals(56));

  }

  @Test
  public void test427() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test427"); }


    int i2 = java.lang.Integer.rotateLeft(1, 11001);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 33554432);

  }

  @Test
  public void test428() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test428"); }


    int i2 = java.lang.Integer.compare(112, 721422341);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == (-1));

  }

  @Test
  public void test429() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test429"); }


    java.lang.Integer i2 = java.lang.Integer.getInteger("2147483648", 88);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i2 + "' != '" + 88+ "'", i2.equals(88));

  }

  @Test
  public void test430() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test430"); }


    tp2.Server server0 = new tp2.Server();
    tp2.IP iP1 = null;
    boolean b2 = server0.addBan(iP1);
    server0.update();
    tp2.IP iP8 = new tp2.IP((java.lang.Integer)31, (java.lang.Integer)31, (java.lang.Integer)31, (java.lang.Integer)0);
    boolean b9 = server0.removeBan(iP8);
    tp2.Server server10 = new tp2.Server();
    tp2.IP iP11 = null;
    boolean b12 = server10.addBan(iP11);
    server10.update();
    tp2.Server server14 = new tp2.Server();
    tp2.IP iP15 = null;
    boolean b16 = server14.addBan(iP15);
    tp2.ITime iTime17 = null;
    server14.setTime(iTime17);
    tp2.IP iP19 = null;
    tp2.IPBan iPBan21 = new tp2.IPBan(iP19, (java.lang.Long)10L);
    tp2.IP iP22 = iPBan21.getIp();
    java.lang.Long long23 = iPBan21.expires;
    tp2.IP iP24 = null;
    iPBan21.ip = iP24;
    tp2.Server server26 = new tp2.Server();
    tp2.IP iP31 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b32 = server26.removeException(iP31);
    java.lang.Integer i33 = iP31.getFirst();
    iPBan21.setIp(iP31);
    iP31.setFourth((java.lang.Integer)(-2147483620));
    boolean b37 = server14.removeBan(iP31);
    boolean b38 = server10.addException(iP31);
    boolean b39 = server0.connect(iP31);
    iP31.setThird((java.lang.Integer)84410368);
    iP31.setSecond((java.lang.Integer)7000);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long23 + "' != '" + 10L+ "'", long23.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i33 + "' != '" + 161+ "'", i33.equals(161));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == true);

  }

  @Test
  public void test431() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test431"); }


    int i1 = java.lang.Integer.reverseBytes(111101);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == (-38731520));

  }

  @Test
  public void test432() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test432"); }


    // The following exception was thrown during execution in test generation
    try {
      int i2 = java.lang.Integer.parseUnsignedInt("16700400000", 23);
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test433() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test433"); }


    java.lang.String str1 = java.lang.Integer.toHexString(285214850);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "11000882"+ "'", str1.equals("11000882"));

  }

  @Test
  public void test434() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test434"); }


    tp2.Server server0 = new tp2.Server();
    tp2.IP iP1 = null;
    boolean b2 = server0.addBan(iP1);
    tp2.IP iP7 = new tp2.IP((java.lang.Integer)31, (java.lang.Integer)31, (java.lang.Integer)31, (java.lang.Integer)0);
    iP7.setSecond((java.lang.Integer)2147483647);
    boolean b10 = server0.addBan(iP7);
    tp2.Server server11 = new tp2.Server();
    tp2.IP iP12 = null;
    boolean b13 = server11.addBan(iP12);
    tp2.ITime iTime14 = null;
    server11.setTime(iTime14);
    tp2.IP iP16 = null;
    tp2.IPBan iPBan18 = new tp2.IPBan(iP16, (java.lang.Long)10L);
    tp2.IP iP19 = iPBan18.getIp();
    java.lang.Long long20 = iPBan18.expires;
    tp2.IP iP21 = null;
    iPBan18.ip = iP21;
    tp2.Server server23 = new tp2.Server();
    tp2.IP iP28 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b29 = server23.removeException(iP28);
    java.lang.Integer i30 = iP28.getFirst();
    iPBan18.setIp(iP28);
    boolean b32 = server11.connect(iP28);
    boolean b33 = server0.removeBan(iP28);
    tp2.ITime iTime34 = null;
    server0.setTime(iTime34);
    server0.update();
    server0.update();
    tp2.IP iP38 = null;
    tp2.IPBan iPBan40 = new tp2.IPBan(iP38, (java.lang.Long)10L);
    tp2.IP iP41 = iPBan40.getIp();
    java.lang.Long long42 = iPBan40.expires;
    tp2.IP iP43 = null;
    iPBan40.ip = iP43;
    tp2.Server server45 = new tp2.Server();
    tp2.IP iP46 = null;
    boolean b47 = server45.addBan(iP46);
    tp2.ITime iTime48 = null;
    server45.setTime(iTime48);
    tp2.IP iP50 = null;
    tp2.IPBan iPBan52 = new tp2.IPBan(iP50, (java.lang.Long)10L);
    tp2.IP iP53 = iPBan52.getIp();
    java.lang.Long long54 = iPBan52.expires;
    tp2.IP iP55 = null;
    iPBan52.ip = iP55;
    tp2.Server server57 = new tp2.Server();
    tp2.IP iP62 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b63 = server57.removeException(iP62);
    java.lang.Integer i64 = iP62.getFirst();
    iPBan52.setIp(iP62);
    boolean b66 = server45.connect(iP62);
    iPBan40.setIp(iP62);
    iPBan40.expires = 2147483647L;
    tp2.IP iP70 = iPBan40.ip;
    java.lang.Long long71 = iPBan40.getExpires();
    tp2.IP iP72 = iPBan40.getIp();
    boolean b73 = server0.removeException(iP72);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long20 + "' != '" + 10L+ "'", long20.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i30 + "' != '" + 161+ "'", i30.equals(161));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long42 + "' != '" + 10L+ "'", long42.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b47 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long54 + "' != '" + 10L+ "'", long54.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b63 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i64 + "' != '" + 161+ "'", i64.equals(161));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b66 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP70);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long71 + "' != '" + 2147483647L+ "'", long71.equals(2147483647L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP72);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b73 == false);

  }

  @Test
  public void test435() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test435"); }


    tp2.IP iP0 = null;
    tp2.IPBan iPBan2 = new tp2.IPBan(iP0, (java.lang.Long)10L);
    tp2.IP iP3 = iPBan2.getIp();
    tp2.IP iP8 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    iP8.setFirst((java.lang.Integer)161);
    iP8.setThird((java.lang.Integer)3);
    iP8.setFirst((java.lang.Integer)26);
    iPBan2.ip = iP8;
    iP8.setSecond((java.lang.Integer)16777216);
    boolean b19 = iP8.equals((java.lang.Object)80000085);
    java.lang.Integer i20 = iP8.getThird();
    tp2.IPBan iPBan22 = new tp2.IPBan(iP8, (java.lang.Long)2013262563L);
    java.lang.Long long23 = iPBan22.expires;
    tp2.IP iP24 = iPBan22.getIp();
    tp2.IP iP25 = iPBan22.ip;
    tp2.IPBan iPBan27 = new tp2.IPBan(iP25, (java.lang.Long)10010842L);
    java.lang.Long long28 = iPBan27.expires;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i20 + "' != '" + 3+ "'", i20.equals(3));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long23 + "' != '" + 2013262563L+ "'", long23.equals(2013262563L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long28 + "' != '" + 10010842L+ "'", long28.equals(10010842L));

  }

  @Test
  public void test436() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test436"); }


    int i2 = java.lang.Integer.divideUnsigned(4096, 700000);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);

  }

  @Test
  public void test437() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test437"); }


    // The following exception was thrown during execution in test generation
    try {
      java.lang.Integer i1 = new java.lang.Integer("4278144967");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test438() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test438"); }


    java.lang.Integer i1 = java.lang.Integer.valueOf(83894283);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 83894283+ "'", i1.equals(83894283));

  }

  @Test
  public void test439() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test439"); }


    java.lang.Integer i1 = java.lang.Integer.decode("1762");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 1762+ "'", i1.equals(1762));

  }

  @Test
  public void test440() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test440"); }


    java.lang.Integer i1 = new java.lang.Integer(62);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 62+ "'", i1.equals(62));

  }

  @Test
  public void test441() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test441"); }


    tp2.Server server0 = new tp2.Server();
    tp2.IP iP1 = null;
    boolean b2 = server0.addBan(iP1);
    tp2.Server server3 = new tp2.Server();
    tp2.IP iP8 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b9 = server3.removeException(iP8);
    boolean b11 = iP8.equals((java.lang.Object)(-1L));
    boolean b12 = server0.removeBan(iP8);
    tp2.IP iP17 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    iP17.setFirst((java.lang.Integer)161);
    iP17.setThird((java.lang.Integer)3);
    iP17.setFirst((java.lang.Integer)26);
    boolean b24 = server0.connect(iP17);
    tp2.IP iP29 = new tp2.IP((java.lang.Integer)2147483647, (java.lang.Integer)(-1), (java.lang.Integer)56, (java.lang.Integer)458752);
    boolean b30 = server0.addException(iP29);
    iP29.setFirst((java.lang.Integer)14);
    java.lang.Integer i33 = iP29.getThird();
    iP29.setThird((java.lang.Integer)100);
    java.lang.Integer i36 = iP29.getSecond();
    java.lang.Integer i37 = iP29.getFourth();
    iP29.setFirst((java.lang.Integer)(-2144814612));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i33 + "' != '" + 56+ "'", i33.equals(56));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i36 + "' != '" + (-1)+ "'", i36.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i37 + "' != '" + 458752+ "'", i37.equals(458752));

  }

  @Test
  public void test442() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test442"); }


    java.lang.Integer i2 = java.lang.Integer.getInteger("2000204102", 16384);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i2 + "' != '" + 16384+ "'", i2.equals(16384));

  }

  @Test
  public void test443() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test443"); }


    int i1 = java.lang.Integer.numberOfLeadingZeros(2097408);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 10);

  }

  @Test
  public void test444() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test444"); }


    tp2.IP iP0 = null;
    tp2.IPBan iPBan2 = new tp2.IPBan(iP0, (java.lang.Long)10L);
    java.lang.Long long3 = iPBan2.getExpires();
    tp2.IP iP8 = new tp2.IP((java.lang.Integer)31, (java.lang.Integer)31, (java.lang.Integer)31, (java.lang.Integer)0);
    iPBan2.ip = iP8;
    tp2.Server server10 = new tp2.Server();
    tp2.IP iP15 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b16 = server10.removeException(iP15);
    server10.update();
    tp2.Server server18 = new tp2.Server();
    tp2.IP iP23 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b24 = server18.removeException(iP23);
    java.lang.Integer i25 = iP23.getFirst();
    boolean b26 = server10.addBan(iP23);
    iPBan2.setIp(iP23);
    tp2.IP iP28 = iPBan2.ip;
    iPBan2.setExpires((java.lang.Long)4160749568L);
    tp2.IP iP31 = iPBan2.getIp();
    java.lang.Integer i32 = iP31.getSecond();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L+ "'", long3.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i25 + "' != '" + 161+ "'", i25.equals(161));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i32 + "' != '" + (-2147483648)+ "'", i32.equals((-2147483648)));

  }

  @Test
  public void test445() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test445"); }


    tp2.Server server0 = new tp2.Server();
    tp2.IP iP5 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b6 = server0.removeException(iP5);
    iP5.setThird((java.lang.Integer)56);
    java.lang.Integer i9 = iP5.getFourth();
    tp2.IPBan iPBan11 = new tp2.IPBan(iP5, (java.lang.Long)10L);
    iPBan11.expires = 2147483647L;
    java.lang.Long long14 = null;
    iPBan11.expires = long14;
    iPBan11.setExpires((java.lang.Long)4160749568L);
    iPBan11.expires = 35320L;
    java.lang.Long long20 = iPBan11.expires;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 5+ "'", i9.equals(5));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long20 + "' != '" + 35320L+ "'", long20.equals(35320L));

  }

  @Test
  public void test446() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test446"); }


    int i2 = java.lang.Integer.max(176, 1100101);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1100101);

  }

  @Test
  public void test447() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test447"); }


    tp2.Server server0 = new tp2.Server();
    tp2.IP iP1 = null;
    boolean b2 = server0.addBan(iP1);
    tp2.Server server3 = new tp2.Server();
    tp2.IP iP8 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b9 = server3.removeException(iP8);
    boolean b11 = iP8.equals((java.lang.Object)(-1L));
    boolean b12 = server0.removeBan(iP8);
    tp2.IP iP17 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    iP17.setFirst((java.lang.Integer)161);
    iP17.setThird((java.lang.Integer)3);
    iP17.setFirst((java.lang.Integer)26);
    boolean b24 = server0.connect(iP17);
    iP17.setSecond((java.lang.Integer)469761943);
    iP17.setSecond((java.lang.Integer)939524096);
    iP17.setFourth((java.lang.Integer)2031686);
    tp2.IP iP31 = null;
    tp2.IPBan iPBan33 = new tp2.IPBan(iP31, (java.lang.Long)10L);
    tp2.IP iP34 = iPBan33.getIp();
    java.lang.Long long35 = iPBan33.expires;
    tp2.IP iP36 = null;
    iPBan33.ip = iP36;
    java.lang.Long long38 = iPBan33.expires;
    tp2.Server server39 = new tp2.Server();
    tp2.IP iP44 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b45 = server39.removeException(iP44);
    iP44.setThird((java.lang.Integer)56);
    java.lang.Integer i48 = iP44.getFourth();
    tp2.IPBan iPBan50 = new tp2.IPBan(iP44, (java.lang.Long)10L);
    iPBan33.setIp(iP44);
    iP44.setFirst((java.lang.Integer)56);
    boolean b54 = iP17.equals((java.lang.Object)iP44);
    iP44.setFourth((java.lang.Integer)(-2063597568));
    iP44.setThird((java.lang.Integer)(-954435456));
    java.lang.Integer i59 = iP44.getFirst();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long35 + "' != '" + 10L+ "'", long35.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long38 + "' != '" + 10L+ "'", long38.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i48 + "' != '" + 5+ "'", i48.equals(5));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b54 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i59 + "' != '" + 56+ "'", i59.equals(56));

  }

  @Test
  public void test448() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test448"); }


    tp2.Server server0 = new tp2.Server();
    tp2.IP iP1 = null;
    boolean b2 = server0.addBan(iP1);
    tp2.IP iP7 = new tp2.IP((java.lang.Integer)31, (java.lang.Integer)31, (java.lang.Integer)31, (java.lang.Integer)0);
    iP7.setSecond((java.lang.Integer)2147483647);
    boolean b10 = server0.addBan(iP7);
    tp2.Server server11 = new tp2.Server();
    tp2.IP iP12 = null;
    boolean b13 = server11.addBan(iP12);
    tp2.Server server14 = new tp2.Server();
    tp2.IP iP19 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b20 = server14.removeException(iP19);
    boolean b22 = iP19.equals((java.lang.Object)(-1L));
    boolean b23 = server11.removeBan(iP19);
    java.lang.Integer i24 = iP19.getFourth();
    boolean b25 = server0.removeBan(iP19);
    tp2.ITime iTime26 = null;
    server0.setTime(iTime26);
    tp2.Server server28 = new tp2.Server();
    tp2.IP iP29 = null;
    boolean b30 = server28.addBan(iP29);
    tp2.Server server31 = new tp2.Server();
    tp2.IP iP36 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b37 = server31.removeException(iP36);
    boolean b39 = iP36.equals((java.lang.Object)(-1L));
    boolean b40 = server28.removeBan(iP36);
    boolean b41 = server0.connect(iP36);
    iP36.setSecond((java.lang.Integer)4);
    java.lang.Integer i44 = iP36.getFourth();
    tp2.IP iP45 = null;
    tp2.IPBan iPBan47 = new tp2.IPBan(iP45, (java.lang.Long)10L);
    tp2.IP iP48 = iPBan47.getIp();
    java.lang.Long long49 = iPBan47.expires;
    tp2.IP iP50 = null;
    iPBan47.ip = iP50;
    tp2.Server server52 = new tp2.Server();
    tp2.IP iP57 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b58 = server52.removeException(iP57);
    java.lang.Integer i59 = iP57.getFirst();
    iPBan47.setIp(iP57);
    java.lang.Integer i61 = iP57.getFirst();
    boolean b63 = iP57.equals((java.lang.Object)(short)(-1));
    java.lang.Integer i64 = iP57.getSecond();
    korat.finitization.IFinitization iFinitization66 = tp2.Server.finServer(1);
    boolean b67 = iP57.equals((java.lang.Object)1);
    iP57.setFirst((java.lang.Integer)64);
    iP57.setThird((java.lang.Integer)1437910020);
    iP57.setFourth((java.lang.Integer)60408026);
    boolean b74 = iP36.equals((java.lang.Object)iP57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i24 + "' != '" + 5+ "'", i24.equals(5));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i44 + "' != '" + 5+ "'", i44.equals(5));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long49 + "' != '" + 10L+ "'", long49.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b58 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i59 + "' != '" + 161+ "'", i59.equals(161));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i61 + "' != '" + 161+ "'", i61.equals(161));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b63 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i64 + "' != '" + (-2147483648)+ "'", i64.equals((-2147483648)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iFinitization66);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b67 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b74 == false);

  }

  @Test
  public void test449() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test449"); }


    // The following exception was thrown during execution in test generation
    try {
      int i1 = java.lang.Integer.parseInt("10204100010");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test450() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test450"); }


    tp2.IP iP4 = new tp2.IP((java.lang.Integer)822083745, (java.lang.Integer)1815367680, (java.lang.Integer)6034688, (java.lang.Integer)(-268435820));
    iP4.setSecond((java.lang.Integer)(-1593835520));

  }

  @Test
  public void test451() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test451"); }


    int i1 = java.lang.Integer.highestOneBit(262144);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 262144);

  }

  @Test
  public void test452() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test452"); }


    java.lang.String str1 = java.lang.Integer.toOctalString(268435456);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "2000000000"+ "'", str1.equals("2000000000"));

  }

  @Test
  public void test453() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test453"); }


    tp2.Server server0 = new tp2.Server();
    tp2.IP iP1 = null;
    boolean b2 = server0.addBan(iP1);
    tp2.IP iP7 = new tp2.IP((java.lang.Integer)31, (java.lang.Integer)31, (java.lang.Integer)31, (java.lang.Integer)0);
    iP7.setSecond((java.lang.Integer)2147483647);
    boolean b10 = server0.addBan(iP7);
    tp2.Server server11 = new tp2.Server();
    tp2.IP iP12 = null;
    boolean b13 = server11.addBan(iP12);
    tp2.Server server14 = new tp2.Server();
    tp2.IP iP19 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b20 = server14.removeException(iP19);
    boolean b22 = iP19.equals((java.lang.Object)(-1L));
    boolean b23 = server11.removeBan(iP19);
    java.lang.Integer i24 = iP19.getFourth();
    boolean b25 = server0.removeBan(iP19);
    tp2.IP iP30 = new tp2.IP((java.lang.Integer)6, (java.lang.Integer)631, (java.lang.Integer)1638400, (java.lang.Integer)220);
    boolean b31 = server0.addBan(iP30);
    java.lang.Integer i32 = iP30.getSecond();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i24 + "' != '" + 5+ "'", i24.equals(5));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i32 + "' != '" + 631+ "'", i32.equals(631));

  }

  @Test
  public void test454() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test454"); }


    tp2.IP iP0 = null;
    tp2.IPBan iPBan2 = new tp2.IPBan(iP0, (java.lang.Long)10L);
    tp2.IP iP3 = iPBan2.getIp();
    java.lang.Long long4 = iPBan2.expires;
    tp2.Server server5 = new tp2.Server();
    tp2.IP iP10 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b11 = server5.removeException(iP10);
    java.lang.Integer i12 = iP10.getFirst();
    iPBan2.setIp(iP10);
    tp2.IP iP14 = iPBan2.ip;
    tp2.Server server15 = new tp2.Server();
    tp2.IP iP20 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b21 = server15.removeException(iP20);
    iP20.setThird((java.lang.Integer)56);
    java.lang.Integer i24 = iP20.getFourth();
    tp2.IPBan iPBan26 = new tp2.IPBan(iP20, (java.lang.Long)10L);
    java.lang.Long long27 = iPBan26.expires;
    tp2.Server server28 = new tp2.Server();
    tp2.IP iP29 = null;
    boolean b30 = server28.addBan(iP29);
    tp2.IP iP35 = new tp2.IP((java.lang.Integer)31, (java.lang.Integer)31, (java.lang.Integer)31, (java.lang.Integer)0);
    iP35.setSecond((java.lang.Integer)2147483647);
    boolean b38 = server28.addBan(iP35);
    tp2.Server server39 = new tp2.Server();
    tp2.IP iP40 = null;
    boolean b41 = server39.addBan(iP40);
    tp2.ITime iTime42 = null;
    server39.setTime(iTime42);
    tp2.IP iP44 = null;
    tp2.IPBan iPBan46 = new tp2.IPBan(iP44, (java.lang.Long)10L);
    tp2.IP iP47 = iPBan46.getIp();
    java.lang.Long long48 = iPBan46.expires;
    tp2.IP iP49 = null;
    iPBan46.ip = iP49;
    tp2.Server server51 = new tp2.Server();
    tp2.IP iP56 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b57 = server51.removeException(iP56);
    java.lang.Integer i58 = iP56.getFirst();
    iPBan46.setIp(iP56);
    boolean b60 = server39.connect(iP56);
    boolean b61 = server28.removeBan(iP56);
    tp2.IP iP66 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    iP66.setFirst((java.lang.Integer)161);
    iP66.setThird((java.lang.Integer)3);
    iP66.setFirst((java.lang.Integer)26);
    iP66.setThird((java.lang.Integer)5);
    boolean b75 = server28.removeBan(iP66);
    java.lang.Object obj76 = null;
    boolean b77 = iP66.equals(obj76);
    iPBan26.setIp(iP66);
    tp2.IP iP83 = new tp2.IP((java.lang.Integer)31, (java.lang.Integer)31, (java.lang.Integer)31, (java.lang.Integer)0);
    iP83.setSecond((java.lang.Integer)2147483647);
    iP83.setSecond((java.lang.Integer)134217728);
    java.lang.Integer i88 = iP83.getSecond();
    iPBan26.setIp(iP83);
    iPBan2.ip = iP83;
    tp2.IP iP95 = new tp2.IP((java.lang.Integer)4, (java.lang.Integer)1342177288, (java.lang.Integer)13, (java.lang.Integer)536870926);
    iPBan2.setIp(iP95);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L+ "'", long4.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i12 + "' != '" + 161+ "'", i12.equals(161));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i24 + "' != '" + 5+ "'", i24.equals(5));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long27 + "' != '" + 10L+ "'", long27.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long48 + "' != '" + 10L+ "'", long48.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b57 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i58 + "' != '" + 161+ "'", i58.equals(161));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b60 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b61 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b75 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b77 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i88 + "' != '" + 134217728+ "'", i88.equals(134217728));

  }

  @Test
  public void test455() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test455"); }


    java.lang.String str2 = java.lang.Integer.toUnsignedString(8000000, 1010000000);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "8000000"+ "'", str2.equals("8000000"));

  }

  @Test
  public void test456() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test456"); }


    java.lang.Integer i2 = java.lang.Integer.getInteger("26", (java.lang.Integer)524288);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i2 + "' != '" + 524288+ "'", i2.equals(524288));

  }

  @Test
  public void test457() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test457"); }


    int i2 = java.lang.Integer.compareUnsigned(24000000, 1400000);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);

  }

  @Test
  public void test458() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test458"); }


    int i1 = java.lang.Integer.reverseBytes(51200);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 13107200);

  }

  @Test
  public void test459() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test459"); }


    // The following exception was thrown during execution in test generation
    try {
      int i2 = java.lang.Integer.parseInt("458", 524432);
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test460() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test460"); }


    int i2 = java.lang.Integer.sum(20, 832);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 852);

  }

  @Test
  public void test461() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test461"); }


    int i2 = java.lang.Integer.rotateRight(433906373, 67109120);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 433906373);

  }

  @Test
  public void test462() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test462"); }


    tp2.Server server0 = new tp2.Server();
    tp2.IP iP1 = null;
    boolean b2 = server0.addBan(iP1);
    tp2.IP iP7 = new tp2.IP((java.lang.Integer)31, (java.lang.Integer)31, (java.lang.Integer)31, (java.lang.Integer)0);
    iP7.setSecond((java.lang.Integer)2147483647);
    boolean b10 = server0.addBan(iP7);
    tp2.Server server11 = new tp2.Server();
    tp2.IP iP12 = null;
    boolean b13 = server11.addBan(iP12);
    tp2.ITime iTime14 = null;
    server11.setTime(iTime14);
    tp2.IP iP16 = null;
    tp2.IPBan iPBan18 = new tp2.IPBan(iP16, (java.lang.Long)10L);
    tp2.IP iP19 = iPBan18.getIp();
    java.lang.Long long20 = iPBan18.expires;
    tp2.IP iP21 = null;
    iPBan18.ip = iP21;
    tp2.Server server23 = new tp2.Server();
    tp2.IP iP28 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b29 = server23.removeException(iP28);
    java.lang.Integer i30 = iP28.getFirst();
    iPBan18.setIp(iP28);
    boolean b32 = server11.connect(iP28);
    boolean b33 = server0.removeBan(iP28);
    tp2.IP iP38 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    iP38.setFirst((java.lang.Integer)161);
    iP38.setThird((java.lang.Integer)3);
    iP38.setFirst((java.lang.Integer)26);
    iP38.setThird((java.lang.Integer)5);
    boolean b47 = server0.removeBan(iP38);
    tp2.IP iP52 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    iP52.setFirst((java.lang.Integer)161);
    iP52.setThird((java.lang.Integer)3);
    iP52.setFirst((java.lang.Integer)26);
    boolean b59 = server0.removeException(iP52);
    tp2.ITime iTime60 = null;
    server0.setTime(iTime60);
    tp2.IP iP66 = new tp2.IP((java.lang.Integer)1437910020, (java.lang.Integer)229376, (java.lang.Integer)469761943, (java.lang.Integer)1677721600);
    boolean b67 = server0.addBan(iP66);
    tp2.IP iP68 = null;
    tp2.IPBan iPBan70 = new tp2.IPBan(iP68, (java.lang.Long)10L);
    tp2.IP iP71 = iPBan70.getIp();
    tp2.IP iP76 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    iP76.setFirst((java.lang.Integer)161);
    iP76.setThird((java.lang.Integer)3);
    iP76.setFirst((java.lang.Integer)26);
    iPBan70.ip = iP76;
    iP76.setSecond((java.lang.Integer)16777216);
    boolean b87 = iP76.equals((java.lang.Object)80000085);
    java.lang.Integer i88 = iP76.getThird();
    tp2.IPBan iPBan90 = new tp2.IPBan(iP76, (java.lang.Long)2013262563L);
    java.lang.Long long91 = iPBan90.expires;
    tp2.IP iP92 = iPBan90.getIp();
    iP92.setSecond((java.lang.Integer)1879047772);
    boolean b95 = server0.connect(iP92);
    server0.update();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long20 + "' != '" + 10L+ "'", long20.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i30 + "' != '" + 161+ "'", i30.equals(161));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b47 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b59 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b67 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP71);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b87 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i88 + "' != '" + 3+ "'", i88.equals(3));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long91 + "' != '" + 2013262563L+ "'", long91.equals(2013262563L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP92);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b95 == true);

  }

  @Test
  public void test463() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test463"); }


    tp2.Server server0 = new tp2.Server();
    tp2.IP iP1 = null;
    boolean b2 = server0.addBan(iP1);
    tp2.ITime iTime3 = null;
    server0.setTime(iTime3);
    tp2.IP iP5 = null;
    tp2.IPBan iPBan7 = new tp2.IPBan(iP5, (java.lang.Long)10L);
    tp2.IP iP8 = iPBan7.getIp();
    java.lang.Long long9 = iPBan7.expires;
    tp2.IP iP10 = null;
    iPBan7.ip = iP10;
    tp2.Server server12 = new tp2.Server();
    tp2.IP iP17 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b18 = server12.removeException(iP17);
    java.lang.Integer i19 = iP17.getFirst();
    iPBan7.setIp(iP17);
    iP17.setFourth((java.lang.Integer)(-2147483620));
    boolean b23 = server0.removeBan(iP17);
    iP17.setFourth((java.lang.Integer)32768);
    iP17.setFirst((java.lang.Integer)21);
    java.lang.Integer i28 = iP17.getSecond();
    tp2.Server server29 = new tp2.Server();
    tp2.IP iP34 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b35 = server29.removeException(iP34);
    iP34.setThird((java.lang.Integer)56);
    java.lang.Integer i38 = iP34.getFourth();
    tp2.IPBan iPBan40 = new tp2.IPBan(iP34, (java.lang.Long)10L);
    iPBan40.expires = 2147483647L;
    tp2.Server server43 = new tp2.Server();
    tp2.IP iP44 = null;
    boolean b45 = server43.addBan(iP44);
    tp2.Server server46 = new tp2.Server();
    tp2.IP iP51 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b52 = server46.removeException(iP51);
    boolean b54 = iP51.equals((java.lang.Object)(-1L));
    boolean b55 = server43.removeBan(iP51);
    tp2.IP iP60 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    iP60.setFirst((java.lang.Integer)161);
    iP60.setThird((java.lang.Integer)3);
    iP60.setFirst((java.lang.Integer)26);
    boolean b67 = server43.connect(iP60);
    tp2.IP iP72 = new tp2.IP((java.lang.Integer)2147483647, (java.lang.Integer)(-1), (java.lang.Integer)56, (java.lang.Integer)458752);
    boolean b73 = server43.addException(iP72);
    iP72.setFirst((java.lang.Integer)1677721600);
    iPBan40.ip = iP72;
    tp2.IPBan iPBan78 = new tp2.IPBan(iP72, (java.lang.Long)1L);
    tp2.IP iP79 = iPBan78.getIp();
    java.lang.Long long80 = iPBan78.getExpires();
    tp2.IP iP81 = iPBan78.getIp();
    boolean b82 = iP17.equals((java.lang.Object)iPBan78);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long9 + "' != '" + 10L+ "'", long9.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i19 + "' != '" + 161+ "'", i19.equals(161));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i28 + "' != '" + (-2147483648)+ "'", i28.equals((-2147483648)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i38 + "' != '" + 5+ "'", i38.equals(5));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b52 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b54 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b55 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b67 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b73 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP79);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long80 + "' != '" + 1L+ "'", long80.equals(1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP81);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b82 == false);

  }

  @Test
  public void test464() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test464"); }


    tp2.IP iP0 = null;
    tp2.IPBan iPBan2 = new tp2.IPBan(iP0, (java.lang.Long)10L);
    tp2.IP iP3 = iPBan2.getIp();
    iPBan2.expires = 0L;
    tp2.IP iP6 = iPBan2.ip;
    tp2.Server server7 = new tp2.Server();
    tp2.IP iP8 = null;
    boolean b9 = server7.addBan(iP8);
    tp2.IP iP14 = new tp2.IP((java.lang.Integer)31, (java.lang.Integer)31, (java.lang.Integer)31, (java.lang.Integer)0);
    iP14.setSecond((java.lang.Integer)2147483647);
    boolean b17 = server7.addBan(iP14);
    tp2.Server server18 = new tp2.Server();
    tp2.IP iP19 = null;
    boolean b20 = server18.addBan(iP19);
    tp2.ITime iTime21 = null;
    server18.setTime(iTime21);
    tp2.IP iP23 = null;
    tp2.IPBan iPBan25 = new tp2.IPBan(iP23, (java.lang.Long)10L);
    tp2.IP iP26 = iPBan25.getIp();
    java.lang.Long long27 = iPBan25.expires;
    tp2.IP iP28 = null;
    iPBan25.ip = iP28;
    tp2.Server server30 = new tp2.Server();
    tp2.IP iP35 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b36 = server30.removeException(iP35);
    java.lang.Integer i37 = iP35.getFirst();
    iPBan25.setIp(iP35);
    boolean b39 = server18.connect(iP35);
    boolean b40 = server7.removeBan(iP35);
    iPBan2.ip = iP35;
    iPBan2.setExpires((java.lang.Long)2013262563L);
    iPBan2.expires = 3L;
    tp2.Server server46 = new tp2.Server();
    tp2.IP iP47 = null;
    boolean b48 = server46.addBan(iP47);
    tp2.Server server49 = new tp2.Server();
    tp2.IP iP54 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b55 = server49.removeException(iP54);
    boolean b57 = iP54.equals((java.lang.Object)(-1L));
    boolean b58 = server46.removeBan(iP54);
    tp2.IP iP63 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    iP63.setFirst((java.lang.Integer)161);
    iP63.setThird((java.lang.Integer)3);
    iP63.setFirst((java.lang.Integer)26);
    boolean b70 = server46.connect(iP63);
    tp2.ITime iTime71 = null;
    server46.setTime(iTime71);
    tp2.IP iP73 = null;
    tp2.IPBan iPBan75 = new tp2.IPBan(iP73, (java.lang.Long)10L);
    tp2.IP iP76 = iPBan75.getIp();
    java.lang.Long long77 = iPBan75.expires;
    tp2.Server server78 = new tp2.Server();
    tp2.IP iP83 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b84 = server78.removeException(iP83);
    java.lang.Integer i85 = iP83.getFirst();
    iPBan75.setIp(iP83);
    boolean b87 = server46.removeBan(iP83);
    iP83.setFirst((java.lang.Integer)186646533);
    iP83.setFourth((java.lang.Integer)419432893);
    iPBan2.ip = iP83;
    tp2.IP iP93 = iPBan2.ip;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long27 + "' != '" + 10L+ "'", long27.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i37 + "' != '" + 161+ "'", i37.equals(161));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b48 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b55 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b57 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b58 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b70 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP76);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long77 + "' != '" + 10L+ "'", long77.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b84 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i85 + "' != '" + 161+ "'", i85.equals(161));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b87 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP93);

  }

  @Test
  public void test465() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test465"); }


    tp2.IP iP0 = null;
    tp2.IPBan iPBan2 = new tp2.IPBan(iP0, (java.lang.Long)10L);
    java.lang.Long long3 = iPBan2.getExpires();
    tp2.IP iP8 = new tp2.IP((java.lang.Integer)31, (java.lang.Integer)31, (java.lang.Integer)31, (java.lang.Integer)0);
    iPBan2.ip = iP8;
    tp2.Server server10 = new tp2.Server();
    tp2.IP iP15 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b16 = server10.removeException(iP15);
    server10.update();
    tp2.Server server18 = new tp2.Server();
    tp2.IP iP23 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b24 = server18.removeException(iP23);
    java.lang.Integer i25 = iP23.getFirst();
    boolean b26 = server10.addBan(iP23);
    iPBan2.setIp(iP23);
    tp2.IP iP28 = iPBan2.ip;
    tp2.IP iP29 = iPBan2.ip;
    tp2.IP iP30 = iPBan2.ip;
    iPBan2.setExpires((java.lang.Long)4329604L);
    iPBan2.expires = 2147483781L;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L+ "'", long3.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i25 + "' != '" + 161+ "'", i25.equals(161));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP30);

  }

  @Test
  public void test466() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test466"); }


    int i2 = java.lang.Integer.min(1677784324, 515072);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 515072);

  }

  @Test
  public void test467() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test467"); }


    tp2.IP iP0 = null;
    tp2.IPBan iPBan2 = new tp2.IPBan(iP0, (java.lang.Long)10L);
    tp2.IP iP3 = iPBan2.getIp();
    java.lang.Long long4 = iPBan2.expires;
    tp2.IP iP5 = null;
    iPBan2.ip = iP5;
    tp2.Server server7 = new tp2.Server();
    tp2.IP iP12 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b13 = server7.removeException(iP12);
    java.lang.Integer i14 = iP12.getFirst();
    iPBan2.setIp(iP12);
    iP12.setSecond((java.lang.Integer)1476395008);
    tp2.IPBan iPBan19 = new tp2.IPBan(iP12, (java.lang.Long)10L);
    tp2.IP iP24 = new tp2.IP((java.lang.Integer)229376, (java.lang.Integer)2147480291, (java.lang.Integer)144, (java.lang.Integer)939524096);
    iPBan19.setIp(iP24);
    tp2.IP iP26 = null;
    tp2.IPBan iPBan28 = new tp2.IPBan(iP26, (java.lang.Long)10L);
    tp2.IP iP29 = iPBan28.ip;
    tp2.Server server30 = new tp2.Server();
    tp2.IP iP31 = null;
    boolean b32 = server30.addBan(iP31);
    tp2.Server server33 = new tp2.Server();
    tp2.IP iP38 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b39 = server33.removeException(iP38);
    boolean b41 = iP38.equals((java.lang.Object)(-1L));
    boolean b42 = server30.removeBan(iP38);
    iPBan28.ip = iP38;
    tp2.IP iP44 = null;
    tp2.IPBan iPBan46 = new tp2.IPBan(iP44, (java.lang.Long)10L);
    tp2.IP iP47 = iPBan46.getIp();
    iPBan46.expires = 0L;
    tp2.IP iP50 = iPBan46.ip;
    tp2.Server server51 = new tp2.Server();
    tp2.IP iP52 = null;
    boolean b53 = server51.addBan(iP52);
    tp2.IP iP58 = new tp2.IP((java.lang.Integer)31, (java.lang.Integer)31, (java.lang.Integer)31, (java.lang.Integer)0);
    iP58.setSecond((java.lang.Integer)2147483647);
    boolean b61 = server51.addBan(iP58);
    tp2.Server server62 = new tp2.Server();
    tp2.IP iP63 = null;
    boolean b64 = server62.addBan(iP63);
    tp2.ITime iTime65 = null;
    server62.setTime(iTime65);
    tp2.IP iP67 = null;
    tp2.IPBan iPBan69 = new tp2.IPBan(iP67, (java.lang.Long)10L);
    tp2.IP iP70 = iPBan69.getIp();
    java.lang.Long long71 = iPBan69.expires;
    tp2.IP iP72 = null;
    iPBan69.ip = iP72;
    tp2.Server server74 = new tp2.Server();
    tp2.IP iP79 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b80 = server74.removeException(iP79);
    java.lang.Integer i81 = iP79.getFirst();
    iPBan69.setIp(iP79);
    boolean b83 = server62.connect(iP79);
    boolean b84 = server51.removeBan(iP79);
    iPBan46.ip = iP79;
    iPBan28.ip = iP79;
    java.lang.Integer i87 = iP79.getThird();
    iP79.setFourth((java.lang.Integer)631);
    iPBan19.setIp(iP79);
    iPBan19.setExpires((java.lang.Long)1093468160L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L+ "'", long4.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i14 + "' != '" + 161+ "'", i14.equals(161));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b53 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b61 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b64 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP70);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long71 + "' != '" + 10L+ "'", long71.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b80 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i81 + "' != '" + 161+ "'", i81.equals(161));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b83 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b84 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i87 + "' != '" + 939524096+ "'", i87.equals(939524096));

  }

  @Test
  public void test468() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test468"); }


    int i2 = java.lang.Integer.min((-1593835505), 65536);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == (-1593835505));

  }

  @Test
  public void test469() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test469"); }


    int i1 = java.lang.Integer.numberOfLeadingZeros((-2147483515));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);

  }

  @Test
  public void test470() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test470"); }


    int i2 = java.lang.Integer.min(5256300, 180224);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 180224);

  }

  @Test
  public void test471() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test471"); }


    tp2.Server server0 = new tp2.Server();
    tp2.IP iP5 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b6 = server0.removeException(iP5);
    tp2.Server server7 = new tp2.Server();
    tp2.IP iP12 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b13 = server7.removeException(iP12);
    java.lang.Integer i14 = iP12.getFirst();
    tp2.IPBan iPBan16 = new tp2.IPBan(iP12, (java.lang.Long)2147483676L);
    boolean b17 = server0.addBan(iP12);
    tp2.Server server18 = new tp2.Server();
    tp2.IP iP19 = null;
    boolean b20 = server18.connect(iP19);
    tp2.IP iP21 = null;
    tp2.IPBan iPBan23 = new tp2.IPBan(iP21, (java.lang.Long)10L);
    java.lang.Long long24 = iPBan23.getExpires();
    tp2.IP iP29 = new tp2.IP((java.lang.Integer)31, (java.lang.Integer)31, (java.lang.Integer)31, (java.lang.Integer)0);
    iPBan23.ip = iP29;
    tp2.Server server31 = new tp2.Server();
    tp2.IP iP36 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b37 = server31.removeException(iP36);
    server31.update();
    tp2.Server server39 = new tp2.Server();
    tp2.IP iP44 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b45 = server39.removeException(iP44);
    java.lang.Integer i46 = iP44.getFirst();
    boolean b47 = server31.addBan(iP44);
    iPBan23.setIp(iP44);
    boolean b49 = server18.removeException(iP44);
    boolean b50 = server0.removeException(iP44);
    tp2.IPBan iPBan52 = new tp2.IPBan(iP44, (java.lang.Long)2147483647L);
    iP44.setFirst((java.lang.Integer)(-525860862));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i14 + "' != '" + 161+ "'", i14.equals(161));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long24 + "' != '" + 10L+ "'", long24.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i46 + "' != '" + 161+ "'", i46.equals(161));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b47 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b49 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b50 == false);

  }

  @Test
  public void test472() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test472"); }


    int i2 = java.lang.Integer.rotateRight(6034688, 83886080);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 6034688);

  }

  @Test
  public void test473() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test473"); }


    tp2.IP iP4 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    iP4.setFirst((java.lang.Integer)161);
    iP4.setFourth((java.lang.Integer)31);
    java.lang.Integer i9 = iP4.getFourth();
    tp2.Server server10 = new tp2.Server();
    tp2.IP iP11 = null;
    boolean b12 = server10.addBan(iP11);
    tp2.ITime iTime13 = null;
    server10.setTime(iTime13);
    tp2.IP iP15 = null;
    tp2.IPBan iPBan17 = new tp2.IPBan(iP15, (java.lang.Long)10L);
    tp2.IP iP18 = iPBan17.getIp();
    java.lang.Long long19 = iPBan17.expires;
    tp2.IP iP20 = null;
    iPBan17.ip = iP20;
    tp2.Server server22 = new tp2.Server();
    tp2.IP iP27 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b28 = server22.removeException(iP27);
    java.lang.Integer i29 = iP27.getFirst();
    iPBan17.setIp(iP27);
    boolean b31 = server10.connect(iP27);
    tp2.Server server32 = new tp2.Server();
    tp2.IP iP37 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b38 = server32.removeException(iP37);
    boolean b40 = iP37.equals((java.lang.Object)(-1L));
    iP37.setFourth((java.lang.Integer)28);
    boolean b43 = server10.addException(iP37);
    boolean b44 = iP4.equals((java.lang.Object)iP37);
    iP37.setFirst((java.lang.Integer)2000);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 31+ "'", i9.equals(31));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long19 + "' != '" + 10L+ "'", long19.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i29 + "' != '" + 161+ "'", i29.equals(161));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b43 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == false);

  }

  @Test
  public void test474() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test474"); }


    int i1 = java.lang.Integer.parseInt("37");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 37);

  }

  @Test
  public void test475() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test475"); }


    int i2 = java.lang.Integer.remainderUnsigned(822083745, (-13427));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 822083745);

  }

  @Test
  public void test476() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test476"); }


    int i1 = java.lang.Integer.reverseBytes((-2080374783));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 16777348);

  }

  @Test
  public void test477() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test477"); }


    tp2.Server server0 = new tp2.Server();
    tp2.IP iP1 = null;
    boolean b2 = server0.addBan(iP1);
    tp2.IP iP7 = new tp2.IP((java.lang.Integer)31, (java.lang.Integer)31, (java.lang.Integer)31, (java.lang.Integer)0);
    iP7.setSecond((java.lang.Integer)2147483647);
    boolean b10 = server0.addBan(iP7);
    tp2.Server server11 = new tp2.Server();
    tp2.IP iP12 = null;
    boolean b13 = server11.addBan(iP12);
    tp2.Server server14 = new tp2.Server();
    tp2.IP iP19 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b20 = server14.removeException(iP19);
    boolean b22 = iP19.equals((java.lang.Object)(-1L));
    boolean b23 = server11.removeBan(iP19);
    java.lang.Integer i24 = iP19.getFourth();
    boolean b25 = server0.removeBan(iP19);
    server0.update();
    server0.update();
    server0.update();
    tp2.ITime iTime29 = null;
    server0.setTime(iTime29);
    tp2.IP iP31 = null;
    tp2.IPBan iPBan33 = new tp2.IPBan(iP31, (java.lang.Long)10L);
    java.lang.Long long34 = iPBan33.getExpires();
    tp2.IP iP39 = new tp2.IP((java.lang.Integer)31, (java.lang.Integer)31, (java.lang.Integer)31, (java.lang.Integer)0);
    iPBan33.ip = iP39;
    boolean b42 = iP39.equals((java.lang.Object)"20000000000");
    java.lang.Integer i43 = iP39.getThird();
    boolean b44 = server0.removeException(iP39);
    tp2.IP iP49 = new tp2.IP((java.lang.Integer)31, (java.lang.Integer)31, (java.lang.Integer)31, (java.lang.Integer)0);
    iP49.setSecond((java.lang.Integer)2147483647);
    tp2.IPBan iPBan53 = new tp2.IPBan(iP49, (java.lang.Long)4329604L);
    boolean b54 = server0.addException(iP49);
    tp2.Server server55 = new tp2.Server();
    tp2.IP iP56 = null;
    boolean b57 = server55.addBan(iP56);
    server55.update();
    tp2.IP iP59 = null;
    tp2.IPBan iPBan61 = new tp2.IPBan(iP59, (java.lang.Long)10L);
    tp2.IP iP62 = iPBan61.getIp();
    java.lang.Long long63 = iPBan61.expires;
    tp2.IP iP64 = null;
    iPBan61.ip = iP64;
    tp2.Server server66 = new tp2.Server();
    tp2.IP iP71 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b72 = server66.removeException(iP71);
    java.lang.Integer i73 = iP71.getFirst();
    iPBan61.setIp(iP71);
    java.lang.Integer i75 = iP71.getFirst();
    java.lang.Integer i76 = iP71.getFirst();
    boolean b77 = server55.addBan(iP71);
    tp2.Server server78 = new tp2.Server();
    tp2.IP iP83 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b84 = server78.removeException(iP83);
    iP83.setThird((java.lang.Integer)56);
    tp2.IPBan iPBan88 = new tp2.IPBan(iP83, (java.lang.Long)2147483676L);
    java.lang.Long long89 = null;
    tp2.IPBan iPBan90 = new tp2.IPBan(iP83, long89);
    tp2.IP iP91 = iPBan90.ip;
    boolean b92 = server55.connect(iP91);
    boolean b93 = server0.connect(iP91);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i24 + "' != '" + 5+ "'", i24.equals(5));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long34 + "' != '" + 10L+ "'", long34.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i43 + "' != '" + 31+ "'", i43.equals(31));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b54 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b57 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP62);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long63 + "' != '" + 10L+ "'", long63.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b72 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i73 + "' != '" + 161+ "'", i73.equals(161));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i75 + "' != '" + 161+ "'", i75.equals(161));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i76 + "' != '" + 161+ "'", i76.equals(161));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b77 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b84 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP91);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b92 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b93 == true);

  }

  @Test
  public void test478() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test478"); }


    tp2.Server server0 = new tp2.Server();
    tp2.IP iP5 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b6 = server0.removeException(iP5);
    iP5.setThird((java.lang.Integer)56);
    java.lang.Integer i9 = iP5.getFourth();
    tp2.IPBan iPBan11 = new tp2.IPBan(iP5, (java.lang.Long)10L);
    java.lang.Long long12 = iPBan11.expires;
    iPBan11.expires = 51200L;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 5+ "'", i9.equals(5));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long12 + "' != '" + 10L+ "'", long12.equals(10L));

  }

  @Test
  public void test479() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test479"); }


    tp2.IP iP0 = null;
    tp2.IPBan iPBan2 = new tp2.IPBan(iP0, (java.lang.Long)10L);
    tp2.IP iP3 = iPBan2.getIp();
    java.lang.Long long4 = iPBan2.expires;
    tp2.IP iP5 = null;
    iPBan2.ip = iP5;
    tp2.Server server7 = new tp2.Server();
    tp2.IP iP12 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b13 = server7.removeException(iP12);
    java.lang.Integer i14 = iP12.getFirst();
    iPBan2.setIp(iP12);
    java.lang.Long long16 = iPBan2.getExpires();
    tp2.IP iP17 = iPBan2.getIp();
    iP17.setFourth((java.lang.Integer)1326);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L+ "'", long4.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i14 + "' != '" + 161+ "'", i14.equals(161));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long16 + "' != '" + 10L+ "'", long16.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP17);

  }

  @Test
  public void test480() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test480"); }


    java.lang.Integer i1 = java.lang.Integer.valueOf("1762");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 1762+ "'", i1.equals(1762));

  }

  @Test
  public void test481() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test481"); }


    java.lang.String str1 = java.lang.Integer.toOctalString((-1916010497));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "21562777777"+ "'", str1.equals("21562777777"));

  }

  @Test
  public void test482() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test482"); }


    int i1 = java.lang.Integer.signum(1643520640);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 1);

  }

  @Test
  public void test483() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test483"); }


    tp2.IP iP0 = null;
    tp2.IPBan iPBan2 = new tp2.IPBan(iP0, (java.lang.Long)10L);
    tp2.IP iP3 = iPBan2.getIp();
    java.lang.Long long4 = iPBan2.expires;
    tp2.IP iP5 = null;
    iPBan2.ip = iP5;
    tp2.Server server7 = new tp2.Server();
    tp2.IP iP8 = null;
    boolean b9 = server7.addBan(iP8);
    tp2.ITime iTime10 = null;
    server7.setTime(iTime10);
    tp2.IP iP12 = null;
    tp2.IPBan iPBan14 = new tp2.IPBan(iP12, (java.lang.Long)10L);
    tp2.IP iP15 = iPBan14.getIp();
    java.lang.Long long16 = iPBan14.expires;
    tp2.IP iP17 = null;
    iPBan14.ip = iP17;
    tp2.Server server19 = new tp2.Server();
    tp2.IP iP24 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b25 = server19.removeException(iP24);
    java.lang.Integer i26 = iP24.getFirst();
    iPBan14.setIp(iP24);
    boolean b28 = server7.connect(iP24);
    iPBan2.setIp(iP24);
    tp2.IP iP30 = null;
    tp2.IPBan iPBan32 = new tp2.IPBan(iP30, (java.lang.Long)10L);
    tp2.IP iP33 = iPBan32.getIp();
    iPBan32.expires = 0L;
    tp2.IP iP36 = iPBan32.ip;
    tp2.Server server37 = new tp2.Server();
    tp2.IP iP38 = null;
    boolean b39 = server37.addBan(iP38);
    tp2.IP iP44 = new tp2.IP((java.lang.Integer)31, (java.lang.Integer)31, (java.lang.Integer)31, (java.lang.Integer)0);
    iP44.setSecond((java.lang.Integer)2147483647);
    boolean b47 = server37.addBan(iP44);
    tp2.Server server48 = new tp2.Server();
    tp2.IP iP49 = null;
    boolean b50 = server48.addBan(iP49);
    tp2.ITime iTime51 = null;
    server48.setTime(iTime51);
    tp2.IP iP53 = null;
    tp2.IPBan iPBan55 = new tp2.IPBan(iP53, (java.lang.Long)10L);
    tp2.IP iP56 = iPBan55.getIp();
    java.lang.Long long57 = iPBan55.expires;
    tp2.IP iP58 = null;
    iPBan55.ip = iP58;
    tp2.Server server60 = new tp2.Server();
    tp2.IP iP65 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b66 = server60.removeException(iP65);
    java.lang.Integer i67 = iP65.getFirst();
    iPBan55.setIp(iP65);
    boolean b69 = server48.connect(iP65);
    boolean b70 = server37.removeBan(iP65);
    iPBan32.ip = iP65;
    boolean b72 = iP24.equals((java.lang.Object)iP65);
    iP65.setThird((java.lang.Integer)5);
    java.lang.Integer i75 = iP65.getFirst();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L+ "'", long4.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long16 + "' != '" + 10L+ "'", long16.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i26 + "' != '" + 161+ "'", i26.equals(161));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b47 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b50 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long57 + "' != '" + 10L+ "'", long57.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b66 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i67 + "' != '" + 161+ "'", i67.equals(161));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b69 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b70 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b72 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i75 + "' != '" + 161+ "'", i75.equals(161));

  }

  @Test
  public void test484() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test484"); }


    int i2 = java.lang.Integer.sum(44, 1342177286);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1342177330);

  }

  @Test
  public void test485() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test485"); }


    tp2.Server server0 = new tp2.Server();
    tp2.IP iP1 = null;
    boolean b2 = server0.addBan(iP1);
    tp2.ITime iTime3 = null;
    server0.setTime(iTime3);
    server0.update();
    tp2.Server server6 = new tp2.Server();
    tp2.IP iP11 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b12 = server6.removeException(iP11);
    boolean b13 = server0.addException(iP11);
    tp2.IPBan iPBan15 = new tp2.IPBan(iP11, (java.lang.Long)4074995711L);
    iPBan15.expires = 160L;
    tp2.IP iP18 = iPBan15.ip;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP18);

  }

  @Test
  public void test486() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test486"); }


    java.lang.Integer i1 = java.lang.Integer.decode("19");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 19+ "'", i1.equals(19));

  }

  @Test
  public void test487() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test487"); }


    int i1 = java.lang.Integer.lowestOneBit(79);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 1);

  }

  @Test
  public void test488() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test488"); }


    int i2 = java.lang.Integer.rotateLeft(985334, 63740400);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 150339599);

  }

  @Test
  public void test489() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test489"); }


    int i1 = java.lang.Integer.parseUnsignedInt("33554624");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 33554624);

  }

  @Test
  public void test490() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test490"); }


    int i2 = java.lang.Integer.max((-917405696), 13107200);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 13107200);

  }

  @Test
  public void test491() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test491"); }


    int i1 = java.lang.Integer.numberOfTrailingZeros(5256300);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 2);

  }

  @Test
  public void test492() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test492"); }


    tp2.IP iP0 = null;
    tp2.IPBan iPBan2 = new tp2.IPBan(iP0, (java.lang.Long)10L);
    tp2.IP iP3 = iPBan2.getIp();
    java.lang.Long long4 = iPBan2.expires;
    tp2.Server server5 = new tp2.Server();
    tp2.IP iP10 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b11 = server5.removeException(iP10);
    java.lang.Integer i12 = iP10.getFirst();
    iPBan2.setIp(iP10);
    tp2.IP iP14 = iPBan2.ip;
    java.lang.Long long15 = iPBan2.getExpires();
    tp2.Server server16 = new tp2.Server();
    tp2.IP iP17 = null;
    boolean b18 = server16.connect(iP17);
    tp2.IP iP23 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)83, (java.lang.Integer)26, (java.lang.Integer)100);
    boolean b24 = server16.addBan(iP23);
    iP23.setFirst((java.lang.Integer)133);
    iPBan2.ip = iP23;
    tp2.Server server28 = new tp2.Server();
    tp2.IP iP33 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b34 = server28.removeException(iP33);
    server28.update();
    tp2.Server server36 = new tp2.Server();
    tp2.IP iP41 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b42 = server36.removeException(iP41);
    java.lang.Integer i43 = iP41.getFirst();
    boolean b44 = server28.addBan(iP41);
    iP41.setSecond((java.lang.Integer)83);
    iPBan2.setIp(iP41);
    tp2.IP iP48 = null;
    tp2.IPBan iPBan50 = new tp2.IPBan(iP48, (java.lang.Long)10L);
    java.lang.Long long51 = iPBan50.getExpires();
    tp2.IP iP56 = new tp2.IP((java.lang.Integer)31, (java.lang.Integer)31, (java.lang.Integer)31, (java.lang.Integer)0);
    iPBan50.ip = iP56;
    tp2.Server server58 = new tp2.Server();
    tp2.IP iP63 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b64 = server58.removeException(iP63);
    server58.update();
    tp2.Server server66 = new tp2.Server();
    tp2.IP iP71 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b72 = server66.removeException(iP71);
    java.lang.Integer i73 = iP71.getFirst();
    boolean b74 = server58.addBan(iP71);
    iPBan50.setIp(iP71);
    boolean b76 = iP41.equals((java.lang.Object)iPBan50);
    tp2.IP iP77 = iPBan50.getIp();
    tp2.IP iP78 = iPBan50.ip;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L+ "'", long4.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i12 + "' != '" + 161+ "'", i12.equals(161));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long15 + "' != '" + 10L+ "'", long15.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i43 + "' != '" + 161+ "'", i43.equals(161));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long51 + "' != '" + 10L+ "'", long51.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b64 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b72 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i73 + "' != '" + 161+ "'", i73.equals(161));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b74 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b76 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP77);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP78);

  }

  @Test
  public void test493() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test493"); }


    int i1 = java.lang.Integer.signum((-2063597530));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == (-1));

  }

  @Test
  public void test494() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test494"); }


    tp2.Server server0 = new tp2.Server();
    tp2.IP iP1 = null;
    boolean b2 = server0.addBan(iP1);
    server0.update();
    tp2.IP iP4 = null;
    tp2.IPBan iPBan6 = new tp2.IPBan(iP4, (java.lang.Long)10L);
    tp2.IP iP7 = iPBan6.getIp();
    java.lang.Long long8 = iPBan6.expires;
    tp2.IP iP9 = null;
    iPBan6.ip = iP9;
    tp2.Server server11 = new tp2.Server();
    tp2.IP iP16 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b17 = server11.removeException(iP16);
    java.lang.Integer i18 = iP16.getFirst();
    iPBan6.setIp(iP16);
    java.lang.Integer i20 = iP16.getFirst();
    java.lang.Integer i21 = iP16.getFirst();
    boolean b22 = server0.addBan(iP16);
    tp2.Server server23 = new tp2.Server();
    tp2.IP iP24 = null;
    boolean b25 = server23.addBan(iP24);
    tp2.ITime iTime26 = null;
    server23.setTime(iTime26);
    tp2.IP iP28 = null;
    tp2.IPBan iPBan30 = new tp2.IPBan(iP28, (java.lang.Long)10L);
    tp2.IP iP31 = iPBan30.getIp();
    java.lang.Long long32 = iPBan30.expires;
    tp2.IP iP33 = null;
    iPBan30.ip = iP33;
    tp2.Server server35 = new tp2.Server();
    tp2.IP iP40 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b41 = server35.removeException(iP40);
    java.lang.Integer i42 = iP40.getFirst();
    iPBan30.setIp(iP40);
    boolean b44 = server23.connect(iP40);
    boolean b45 = server0.connect(iP40);
    tp2.IP iP50 = new tp2.IP((java.lang.Integer)31, (java.lang.Integer)31, (java.lang.Integer)31, (java.lang.Integer)0);
    iP50.setSecond((java.lang.Integer)2147483647);
    java.lang.Integer i53 = iP50.getThird();
    boolean b54 = server0.addException(iP50);
    server0.update();
    tp2.Server server56 = new tp2.Server();
    tp2.IP iP61 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b62 = server56.removeException(iP61);
    iP61.setThird((java.lang.Integer)56);
    java.lang.Integer i65 = iP61.getFourth();
    tp2.IPBan iPBan67 = new tp2.IPBan(iP61, (java.lang.Long)10L);
    iPBan67.expires = 2147483647L;
    java.lang.Long long70 = iPBan67.getExpires();
    tp2.IP iP71 = iPBan67.ip;
    boolean b72 = server0.addException(iP71);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long8 + "' != '" + 10L+ "'", long8.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i18 + "' != '" + 161+ "'", i18.equals(161));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i20 + "' != '" + 161+ "'", i20.equals(161));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i21 + "' != '" + 161+ "'", i21.equals(161));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long32 + "' != '" + 10L+ "'", long32.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i42 + "' != '" + 161+ "'", i42.equals(161));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i53 + "' != '" + 31+ "'", i53.equals(31));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b54 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b62 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i65 + "' != '" + 5+ "'", i65.equals(5));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long70 + "' != '" + 2147483647L+ "'", long70.equals(2147483647L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP71);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b72 == true);

  }

  @Test
  public void test495() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test495"); }


    int i2 = java.lang.Integer.min(0, 20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);

  }

  @Test
  public void test496() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test496"); }


    tp2.IP iP4 = new tp2.IP((java.lang.Integer)27, (java.lang.Integer)11024896, (java.lang.Integer)119127, (java.lang.Integer)261698496);
    java.lang.Integer i5 = iP4.getSecond();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i5 + "' != '" + 11024896+ "'", i5.equals(11024896));

  }

  @Test
  public void test497() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test497"); }


    int i2 = java.lang.Integer.sum(1998782464, (-2136468991));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == (-137686527));

  }

  @Test
  public void test498() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test498"); }


    int i1 = java.lang.Integer.highestOneBit(1108377636);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 1073741824);

  }

  @Test
  public void test499() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test499"); }


    tp2.IP iP4 = new tp2.IP((java.lang.Integer)1743650821, (java.lang.Integer)293, (java.lang.Integer)16, (java.lang.Integer)2031616);

  }

  @Test
  public void test500() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test500"); }


    // The following exception was thrown during execution in test generation
    try {
      java.lang.Integer i1 = new java.lang.Integer("10000000001011001000000000");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

}
