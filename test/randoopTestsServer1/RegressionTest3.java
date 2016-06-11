package randoopTestsServer1;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest3 {

  public static boolean debug = false;

  @Test
  public void test001() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test001"); }


    // The following exception was thrown during execution in test generation
    try {
      java.lang.Integer i2 = java.lang.Integer.valueOf("100000000000", 10);
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test002() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test002"); }


    // The following exception was thrown during execution in test generation
    try {
      java.lang.Integer i2 = java.lang.Integer.valueOf("4329604", 4096);
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test003() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test003"); }


    int i2 = java.lang.Integer.rotateLeft(1, 62563);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 8);

  }

  @Test
  public void test004() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test004"); }


    int i2 = java.lang.Integer.min(20971520, 10010842);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 10010842);

  }

  @Test
  public void test005() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test005"); }


    java.lang.Integer i1 = java.lang.Integer.valueOf(841);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 841+ "'", i1.equals(841));

  }

  @Test
  public void test006() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test006"); }


    // The following exception was thrown during execution in test generation
    try {
      java.lang.Integer i2 = java.lang.Integer.valueOf("111", 67108864);
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test007() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test007"); }


    // The following exception was thrown during execution in test generation
    try {
      java.lang.Integer i1 = java.lang.Integer.valueOf("10000000000000000000000000111000");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test008() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test008"); }


    int i1 = java.lang.Integer.parseInt("1010000000");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 1010000000);

  }

  @Test
  public void test009() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test009"); }


    java.lang.Integer i2 = java.lang.Integer.getInteger("1000", (java.lang.Integer)630);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i2 + "' != '" + 630+ "'", i2.equals(630));

  }

  @Test
  public void test010() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test010"); }


    // The following exception was thrown during execution in test generation
    try {
      int i2 = java.lang.Integer.parseInt("61", 69273664);
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test011() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test011"); }


    int i1 = java.lang.Integer.lowestOneBit(4897831);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 1);

  }

  @Test
  public void test012() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test012"); }


    int i2 = java.lang.Integer.max((-2063597440), 1073741825);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1073741825);

  }

  @Test
  public void test013() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test013"); }


    int i2 = java.lang.Integer.max(1108377608, 33554560);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1108377608);

  }

  @Test
  public void test014() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test014"); }


    java.lang.Integer i2 = java.lang.Integer.getInteger("90", 268503106);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i2 + "' != '" + 268503106+ "'", i2.equals(268503106));

  }

  @Test
  public void test015() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test015"); }


    int i1 = java.lang.Integer.parseUnsignedInt("38000000");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 38000000);

  }

  @Test
  public void test016() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test016"); }


    tp2.IP iP0 = null;
    tp2.IPBan iPBan2 = new tp2.IPBan(iP0, (java.lang.Long)10L);
    tp2.IP iP3 = iPBan2.getIp();
    java.lang.Long long4 = iPBan2.expires;
    tp2.IP iP5 = null;
    iPBan2.ip = iP5;
    java.lang.Long long7 = iPBan2.getExpires();
    iPBan2.expires = 14L;
    tp2.IP iP10 = iPBan2.getIp();
    iPBan2.expires = 458752L;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L+ "'", long4.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long7 + "' != '" + 10L+ "'", long7.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP10);

  }

  @Test
  public void test017() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test017"); }


    int i1 = java.lang.Integer.numberOfTrailingZeros(111);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);

  }

  @Test
  public void test018() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test018"); }


    int i2 = java.lang.Integer.rotateLeft((-671088629), 38000000);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == (-671088629));

  }

  @Test
  public void test019() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test019"); }


    java.lang.String str2 = java.lang.Integer.toUnsignedString(3366, 21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "7d6"+ "'", str2.equals("7d6"));

  }

  @Test
  public void test020() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test020"); }


    int i1 = java.lang.Integer.signum(4096);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 1);

  }

  @Test
  public void test021() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test021"); }


    java.lang.String str1 = java.lang.Integer.toBinaryString(61);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "111101"+ "'", str1.equals("111101"));

  }

  @Test
  public void test022() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test022"); }


    java.lang.String str2 = java.lang.Integer.toUnsignedString(2528, 2031616);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "2528"+ "'", str2.equals("2528"));

  }

  @Test
  public void test023() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test023"); }


    int i1 = java.lang.Integer.numberOfTrailingZeros((-2080374783));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);

  }

  @Test
  public void test024() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test024"); }


    int i1 = java.lang.Integer.parseUnsignedInt("111101");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 111101);

  }

  @Test
  public void test025() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test025"); }


    tp2.IP iP0 = null;
    tp2.IPBan iPBan2 = new tp2.IPBan(iP0, (java.lang.Long)10L);
    tp2.IP iP3 = iPBan2.getIp();
    java.lang.Long long4 = iPBan2.expires;
    iPBan2.expires = 2362614L;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L+ "'", long4.equals(10L));

  }

  @Test
  public void test026() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test026"); }


    int i1 = java.lang.Integer.reverseBytes(291939);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 1668547584);

  }

  @Test
  public void test027() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test027"); }


    int i2 = java.lang.Integer.remainderUnsigned(14, 352321536);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 14);

  }

  @Test
  public void test028() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test028"); }


    int i1 = java.lang.Integer.parseInt("352321956");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 352321956);

  }

  @Test
  public void test029() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test029"); }


    int i1 = java.lang.Integer.reverse(10010000);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 163387648);

  }

  @Test
  public void test030() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test030"); }


    java.lang.Integer i1 = java.lang.Integer.valueOf(111101);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 111101+ "'", i1.equals(111101));

  }

  @Test
  public void test031() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test031"); }


    java.lang.Integer i1 = java.lang.Integer.getInteger("503");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);

  }

  @Test
  public void test032() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test032"); }


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
    tp2.Server server24 = new tp2.Server();
    tp2.IP iP25 = null;
    boolean b26 = server24.addBan(iP25);
    tp2.IP iP31 = new tp2.IP((java.lang.Integer)31, (java.lang.Integer)31, (java.lang.Integer)31, (java.lang.Integer)0);
    iP31.setSecond((java.lang.Integer)2147483647);
    boolean b34 = server24.addBan(iP31);
    tp2.Server server35 = new tp2.Server();
    tp2.IP iP36 = null;
    boolean b37 = server35.addBan(iP36);
    tp2.Server server38 = new tp2.Server();
    tp2.IP iP43 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b44 = server38.removeException(iP43);
    boolean b46 = iP43.equals((java.lang.Object)(-1L));
    boolean b47 = server35.removeBan(iP43);
    java.lang.Integer i48 = iP43.getFourth();
    boolean b49 = server24.removeBan(iP43);
    tp2.ITime iTime50 = null;
    server24.setTime(iTime50);
    server24.update();
    tp2.Server server53 = new tp2.Server();
    tp2.IP iP54 = null;
    boolean b55 = server53.addBan(iP54);
    tp2.Server server56 = new tp2.Server();
    tp2.IP iP61 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b62 = server56.removeException(iP61);
    boolean b64 = iP61.equals((java.lang.Object)(-1L));
    boolean b65 = server53.removeBan(iP61);
    tp2.IP iP70 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    iP70.setFirst((java.lang.Integer)161);
    iP70.setThird((java.lang.Integer)3);
    iP70.setFirst((java.lang.Integer)26);
    boolean b77 = server53.connect(iP70);
    boolean b78 = server24.addException(iP70);
    boolean b79 = server0.removeException(iP70);
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
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b46 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b47 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i48 + "' != '" + 5+ "'", i48.equals(5));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b49 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b55 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b62 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b64 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b65 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b77 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b78 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b79 == false);

  }

  @Test
  public void test033() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test033"); }


    java.lang.String str1 = java.lang.Integer.toHexString(536870926);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "2000000e"+ "'", str1.equals("2000000e"));

  }

  @Test
  public void test034() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test034"); }


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
    server0.update();
    tp2.IP iP47 = null;
    tp2.IPBan iPBan49 = new tp2.IPBan(iP47, (java.lang.Long)10L);
    tp2.IP iP50 = iPBan49.getIp();
    tp2.IP iP55 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    iP55.setFirst((java.lang.Integer)161);
    iP55.setThird((java.lang.Integer)3);
    iP55.setFirst((java.lang.Integer)26);
    iPBan49.ip = iP55;
    boolean b64 = iP55.equals((java.lang.Object)28L);
    java.lang.Integer i65 = iP55.getFourth();
    boolean b66 = server0.addException(iP55);
    tp2.IPBan iPBan68 = new tp2.IPBan(iP55, (java.lang.Long)2147483676L);
    
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
    org.junit.Assert.assertNull(iP50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b64 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i65 + "' != '" + 5+ "'", i65.equals(5));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b66 == true);

  }

  @Test
  public void test035() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test035"); }


    java.lang.String str1 = java.lang.Integer.toUnsignedString(2147480291);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "2147480291"+ "'", str1.equals("2147480291"));

  }

  @Test
  public void test036() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test036"); }


    // The following exception was thrown during execution in test generation
    try {
      java.lang.Integer i2 = java.lang.Integer.valueOf("3d", 35320);
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test037() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test037"); }


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
    tp2.Server server37 = new tp2.Server();
    tp2.IP iP42 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b43 = server37.removeException(iP42);
    java.lang.Integer i44 = iP42.getFirst();
    tp2.IPBan iPBan46 = new tp2.IPBan(iP42, (java.lang.Long)2147483676L);
    iP42.setFourth((java.lang.Integer)24);
    boolean b49 = server0.addBan(iP42);
    
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
    org.junit.Assert.assertTrue(b43 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i44 + "' != '" + 161+ "'", i44.equals(161));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b49 == true);

  }

  @Test
  public void test038() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test038"); }


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
    java.lang.Integer i20 = iP19.getFourth();
    
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
    org.junit.Assert.assertTrue("'" + i20 + "' != '" + 5+ "'", i20.equals(5));

  }

  @Test
  public void test039() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test039"); }


    int i1 = java.lang.Integer.reverse(2147480291);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == (-951058434));

  }

  @Test
  public void test040() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test040"); }


    java.lang.Integer i1 = new java.lang.Integer(32768);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 32768+ "'", i1.equals(32768));

  }

  @Test
  public void test041() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test041"); }


    java.lang.Integer i1 = new java.lang.Integer(10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 10+ "'", i1.equals(10));

  }

  @Test
  public void test042() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test042"); }


    java.lang.Integer i1 = java.lang.Integer.valueOf(1275068417);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 1275068417+ "'", i1.equals(1275068417));

  }

  @Test
  public void test043() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test043"); }


    int i1 = java.lang.Integer.reverse(25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == (-1744830464));

  }

  @Test
  public void test044() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test044"); }


    tp2.IP iP4 = new tp2.IP((java.lang.Integer)1342177288, (java.lang.Integer)21, (java.lang.Integer)402653184, (java.lang.Integer)268503106);

  }

  @Test
  public void test045() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test045"); }


    int i1 = java.lang.Integer.numberOfLeadingZeros(268435466);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 3);

  }

  @Test
  public void test046() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test046"); }


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
    tp2.IP iP64 = iPBan11.ip;
    tp2.IPBan iPBan66 = new tp2.IPBan(iP64, (java.lang.Long)268435466L);
    
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
    org.junit.Assert.assertNotNull(iP64);

  }

  @Test
  public void test047() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test047"); }


    int i2 = java.lang.Integer.compareUnsigned(352321956, 268435456);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);

  }

  @Test
  public void test048() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test048"); }


    int i1 = java.lang.Integer.lowestOneBit(24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 8);

  }

  @Test
  public void test049() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test049"); }


    java.lang.Integer i1 = new java.lang.Integer(1879047772);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 1879047772+ "'", i1.equals(1879047772));

  }

  @Test
  public void test050() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test050"); }


    java.lang.Integer i1 = java.lang.Integer.valueOf("10010842");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 10010842+ "'", i1.equals(10010842));

  }

  @Test
  public void test051() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test051"); }


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
    tp2.IP iP32 = iPBan31.getIp();
    java.lang.Integer i33 = null;
    iP32.setFirst(i33);
    
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
    org.junit.Assert.assertNotNull(iP32);

  }

  @Test
  public void test052() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test052"); }


    java.lang.String str1 = java.lang.Integer.toBinaryString(1677721761);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "1100100000000000000000010100001"+ "'", str1.equals("1100100000000000000000010100001"));

  }

  @Test
  public void test053() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test053"); }


    int i1 = java.lang.Integer.lowestOneBit(10240);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 2048);

  }

  @Test
  public void test054() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test054"); }


    int i1 = java.lang.Integer.reverseBytes(1073741824);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 64);

  }

  @Test
  public void test055() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test055"); }


    // The following exception was thrown during execution in test generation
    try {
      int i2 = java.lang.Integer.parseUnsignedInt("4897831", 1073741824);
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test056() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test056"); }


    java.lang.Integer i1 = new java.lang.Integer("38");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 38+ "'", i1.equals(38));

  }

  @Test
  public void test057() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test057"); }


    java.lang.String str1 = java.lang.Integer.toUnsignedString(33554560);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "33554560"+ "'", str1.equals("33554560"));

  }

  @Test
  public void test058() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test058"); }


    java.lang.String str2 = java.lang.Integer.toUnsignedString(2082996226, 268435456);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "2082996226"+ "'", str2.equals("2082996226"));

  }

  @Test
  public void test059() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test059"); }


    java.lang.String str1 = java.lang.Integer.toHexString(7489);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "1d41"+ "'", str1.equals("1d41"));

  }

  @Test
  public void test060() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test060"); }


    int i2 = java.lang.Integer.compareUnsigned(35, (-2147483592));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == (-1));

  }

  @Test
  public void test061() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test061"); }


    tp2.Server server0 = new tp2.Server();
    tp2.IP iP1 = null;
    boolean b2 = server0.connect(iP1);
    tp2.IP iP7 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    iP7.setFirst((java.lang.Integer)161);
    boolean b11 = iP7.equals((java.lang.Object)56);
    java.lang.Integer i12 = iP7.getFourth();
    boolean b13 = server0.removeBan(iP7);
    tp2.IP iP14 = null;
    tp2.IPBan iPBan16 = new tp2.IPBan(iP14, (java.lang.Long)10L);
    tp2.IP iP17 = iPBan16.getIp();
    java.lang.Long long18 = iPBan16.expires;
    tp2.IP iP19 = null;
    iPBan16.ip = iP19;
    tp2.Server server21 = new tp2.Server();
    tp2.IP iP22 = null;
    boolean b23 = server21.addBan(iP22);
    tp2.ITime iTime24 = null;
    server21.setTime(iTime24);
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
    boolean b42 = server21.connect(iP38);
    iPBan16.setIp(iP38);
    iPBan16.expires = 2147483647L;
    tp2.IP iP46 = iPBan16.ip;
    boolean b47 = server0.addException(iP46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i12 + "' != '" + 5+ "'", i12.equals(5));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long18 + "' != '" + 10L+ "'", long18.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long30 + "' != '" + 10L+ "'", long30.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i40 + "' != '" + 161+ "'", i40.equals(161));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b47 == true);

  }

  @Test
  public void test062() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test062"); }


    tp2.Server server0 = new tp2.Server();
    tp2.IP iP5 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b6 = server0.removeException(iP5);
    boolean b8 = iP5.equals((java.lang.Object)(-1L));
    iP5.setFourth((java.lang.Integer)28);
    iP5.setThird((java.lang.Integer)100004);
    iP5.setSecond((java.lang.Integer)10010842);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);

  }

  @Test
  public void test063() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test063"); }


    int i2 = java.lang.Integer.sum(11, 51200);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 51211);

  }

  @Test
  public void test064() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test064"); }


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
    java.lang.Long long78 = null;
    iPBan2.setExpires(long78);
    
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

  }

  @Test
  public void test065() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test065"); }


    int i1 = java.lang.Integer.parseUnsignedInt("80000000");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 80000000);

  }

  @Test
  public void test066() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test066"); }


    int i2 = java.lang.Integer.rotateLeft((-671088640), 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == (-1073741818));

  }

  @Test
  public void test067() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test067"); }


    // The following exception was thrown during execution in test generation
    try {
      java.lang.Integer i2 = java.lang.Integer.valueOf("70", 800);
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

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test068"); }


    // The following exception was thrown during execution in test generation
    try {
      korat.finitization.IFinitization iFinitization1 = tp2.Server.finServer(33554560);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test069() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test069"); }


    int i1 = java.lang.Integer.reverse(10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 1342177280);

  }

  @Test
  public void test070() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test070"); }


    java.lang.String str2 = java.lang.Integer.toUnsignedString(2147480291, (-2147483620));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "2147480291"+ "'", str2.equals("2147480291"));

  }

  @Test
  public void test071() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test071"); }


    tp2.IP iP0 = null;
    tp2.IPBan iPBan2 = new tp2.IPBan(iP0, (java.lang.Long)10L);
    tp2.IP iP3 = iPBan2.ip;
    java.lang.Long long4 = iPBan2.expires;
    tp2.IP iP9 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    iP9.setFirst((java.lang.Integer)161);
    iP9.setThird((java.lang.Integer)3);
    iP9.setFirst((java.lang.Integer)26);
    iP9.setFirst((java.lang.Integer)(-2147483592));
    java.lang.Long long18 = null;
    tp2.IPBan iPBan19 = new tp2.IPBan(iP9, long18);
    tp2.Server server20 = new tp2.Server();
    tp2.IP iP21 = null;
    boolean b22 = server20.addBan(iP21);
    tp2.IP iP27 = new tp2.IP((java.lang.Integer)31, (java.lang.Integer)31, (java.lang.Integer)31, (java.lang.Integer)0);
    iP27.setSecond((java.lang.Integer)2147483647);
    boolean b30 = server20.addBan(iP27);
    tp2.Server server31 = new tp2.Server();
    tp2.IP iP32 = null;
    boolean b33 = server31.addBan(iP32);
    tp2.ITime iTime34 = null;
    server31.setTime(iTime34);
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
    boolean b52 = server31.connect(iP48);
    boolean b53 = server20.removeBan(iP48);
    tp2.IP iP54 = null;
    tp2.IPBan iPBan56 = new tp2.IPBan(iP54, (java.lang.Long)10L);
    java.lang.Long long57 = iPBan56.getExpires();
    tp2.IP iP62 = new tp2.IP((java.lang.Integer)31, (java.lang.Integer)31, (java.lang.Integer)31, (java.lang.Integer)0);
    iPBan56.ip = iP62;
    tp2.Server server64 = new tp2.Server();
    tp2.IP iP69 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b70 = server64.removeException(iP69);
    server64.update();
    tp2.Server server72 = new tp2.Server();
    tp2.IP iP77 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b78 = server72.removeException(iP77);
    java.lang.Integer i79 = iP77.getFirst();
    boolean b80 = server64.addBan(iP77);
    iPBan56.setIp(iP77);
    boolean b82 = server20.addBan(iP77);
    java.lang.Integer i83 = iP77.getSecond();
    iPBan19.setIp(iP77);
    java.lang.Integer i85 = iP77.getThird();
    iPBan2.ip = iP77;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L+ "'", long4.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long40 + "' != '" + 10L+ "'", long40.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b49 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i50 + "' != '" + 161+ "'", i50.equals(161));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b52 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b53 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long57 + "' != '" + 10L+ "'", long57.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b70 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b78 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i79 + "' != '" + 161+ "'", i79.equals(161));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b80 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b82 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i83 + "' != '" + (-2147483648)+ "'", i83.equals((-2147483648)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i85 + "' != '" + 939524096+ "'", i85.equals(939524096));

  }

  @Test
  public void test072() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test072"); }


    int i2 = java.lang.Integer.remainderUnsigned(4194304, 43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 41);

  }

  @Test
  public void test073() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test073"); }


    java.lang.String str1 = java.lang.Integer.toBinaryString((-1067707136));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "11000000010111000001010100000000"+ "'", str1.equals("11000000010111000001010100000000"));

  }

  @Test
  public void test074() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test074"); }


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
    java.lang.Long long21 = iPBan2.getExpires();
    tp2.Server server22 = new tp2.Server();
    tp2.IP iP23 = null;
    boolean b24 = server22.addBan(iP23);
    tp2.ITime iTime25 = null;
    server22.setTime(iTime25);
    tp2.IP iP27 = null;
    tp2.IPBan iPBan29 = new tp2.IPBan(iP27, (java.lang.Long)10L);
    tp2.IP iP30 = iPBan29.getIp();
    java.lang.Long long31 = iPBan29.expires;
    tp2.IP iP32 = null;
    iPBan29.ip = iP32;
    tp2.Server server34 = new tp2.Server();
    tp2.IP iP39 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b40 = server34.removeException(iP39);
    java.lang.Integer i41 = iP39.getFirst();
    iPBan29.setIp(iP39);
    boolean b43 = server22.connect(iP39);
    tp2.Server server44 = new tp2.Server();
    tp2.IP iP49 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b50 = server44.removeException(iP49);
    server44.update();
    tp2.Server server52 = new tp2.Server();
    tp2.IP iP57 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b58 = server52.removeException(iP57);
    java.lang.Integer i59 = iP57.getFirst();
    boolean b60 = server44.addBan(iP57);
    boolean b62 = iP57.equals((java.lang.Object)(short)10);
    iP57.setSecond((java.lang.Integer)(-134217728));
    iP57.setFirst((java.lang.Integer)(-2147483592));
    boolean b67 = server22.addException(iP57);
    iPBan2.setIp(iP57);
    iP57.setThird((java.lang.Integer)(-14619));
    
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
    org.junit.Assert.assertTrue("'" + long21 + "' != '" + 10L+ "'", long21.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long31 + "' != '" + 10L+ "'", long31.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i41 + "' != '" + 161+ "'", i41.equals(161));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b43 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b50 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b58 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i59 + "' != '" + 161+ "'", i59.equals(161));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b60 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b62 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b67 == true);

  }

  @Test
  public void test075() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test075"); }


    int i1 = java.lang.Integer.numberOfTrailingZeros(62563);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);

  }

  @Test
  public void test076() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test076"); }


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
    java.lang.Integer i26 = iP24.getFirst();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L+ "'", long4.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i14 + "' != '" + 161+ "'", i14.equals(161));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i26 + "' != '" + 229376+ "'", i26.equals(229376));

  }

  @Test
  public void test077() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test077"); }


    // The following exception was thrown during execution in test generation
    try {
      int i1 = java.lang.Integer.parseUnsignedInt("1f0046");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test078() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test078"); }


    int i1 = java.lang.Integer.lowestOneBit(84410411);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 1);

  }

  @Test
  public void test079() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test079"); }


    java.lang.Integer i1 = java.lang.Integer.valueOf("7000");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 7000+ "'", i1.equals(7000));

  }

  @Test
  public void test080() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test080"); }


    int i2 = java.lang.Integer.divideUnsigned(134217728, 289406976);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);

  }

  @Test
  public void test081() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test081"); }


    // The following exception was thrown during execution in test generation
    try {
      int i2 = java.lang.Integer.parseUnsignedInt("100000", 2000204102);
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test082() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test082"); }


    java.lang.Integer i2 = java.lang.Integer.getInteger("35320", 2082996226);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i2 + "' != '" + 2082996226+ "'", i2.equals(2082996226));

  }

  @Test
  public void test083() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test083"); }


    int i2 = java.lang.Integer.remainderUnsigned(268503106, 41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 10);

  }

  @Test
  public void test084() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test084"); }


    int i1 = java.lang.Integer.parseInt("90");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 90);

  }

  @Test
  public void test085() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test085"); }


    // The following exception was thrown during execution in test generation
    try {
      int i1 = java.lang.Integer.parseInt("10000000000000000000000000111000");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test086() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test086"); }


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
    tp2.Server server52 = new tp2.Server();
    tp2.IP iP53 = null;
    boolean b54 = server52.addBan(iP53);
    server52.update();
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
    java.lang.Integer i73 = iP68.getFirst();
    boolean b74 = server52.addBan(iP68);
    tp2.IP iP75 = null;
    tp2.IPBan iPBan77 = new tp2.IPBan(iP75, (java.lang.Long)10L);
    java.lang.Long long78 = iPBan77.getExpires();
    tp2.IP iP79 = iPBan77.getIp();
    iPBan77.setExpires((java.lang.Long)100L);
    tp2.IP iP82 = null;
    tp2.IPBan iPBan84 = new tp2.IPBan(iP82, (java.lang.Long)10L);
    java.lang.Long long85 = iPBan84.getExpires();
    tp2.IP iP90 = new tp2.IP((java.lang.Integer)31, (java.lang.Integer)31, (java.lang.Integer)31, (java.lang.Integer)0);
    iPBan84.ip = iP90;
    boolean b93 = iP90.equals((java.lang.Object)"20000000000");
    iPBan77.ip = iP90;
    boolean b95 = iP68.equals((java.lang.Object)iP90);
    iPBan2.setIp(iP68);
    
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
    org.junit.Assert.assertTrue(b54 == false);
    
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
    org.junit.Assert.assertTrue("'" + i73 + "' != '" + 161+ "'", i73.equals(161));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b74 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long78 + "' != '" + 10L+ "'", long78.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP79);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long85 + "' != '" + 10L+ "'", long85.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b93 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b95 == false);

  }

  @Test
  public void test087() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test087"); }


    int i1 = java.lang.Integer.numberOfLeadingZeros((-671088640));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);

  }

  @Test
  public void test088() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test088"); }


    java.lang.String str1 = java.lang.Integer.toHexString(10010000);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "98bd90"+ "'", str1.equals("98bd90"));

  }

  @Test
  public void test089() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test089"); }


    java.lang.Integer i1 = java.lang.Integer.valueOf("2031616");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 2031616+ "'", i1.equals(2031616));

  }

  @Test
  public void test090() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test090"); }


    int i1 = java.lang.Integer.bitCount(14379100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 13);

  }

  @Test
  public void test091() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test091"); }


    java.lang.String str1 = java.lang.Integer.toOctalString((-1291845532));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "26300000144"+ "'", str1.equals("26300000144"));

  }

  @Test
  public void test092() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test092"); }


    int i2 = java.lang.Integer.compare(0, 800);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == (-1));

  }

  @Test
  public void test093() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test093"); }


    int i1 = java.lang.Integer.reverse(128);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 16777216);

  }

  @Test
  public void test094() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test094"); }


    int i2 = java.lang.Integer.compare(1493172264, (-1291845532));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);

  }

  @Test
  public void test095() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test095"); }


    int i2 = java.lang.Integer.compare(2528, 24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);

  }

  @Test
  public void test096() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test096"); }


    int i1 = java.lang.Integer.parseUnsignedInt("4000000");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 4000000);

  }

  @Test
  public void test097() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test097"); }


    long long1 = java.lang.Integer.toUnsignedLong(5211392);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == 5211392L);

  }

  @Test
  public void test098() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test098"); }


    java.lang.Integer i1 = java.lang.Integer.valueOf(33554560);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 33554560+ "'", i1.equals(33554560));

  }

  @Test
  public void test099() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test099"); }


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
    iP46.setSecond((java.lang.Integer)(-2147483592));
    java.lang.Integer i50 = iP46.getFourth();
    java.lang.Integer i51 = iP46.getFirst();
    
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
    org.junit.Assert.assertTrue("'" + i50 + "' != '" + 5+ "'", i50.equals(5));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i51 + "' != '" + 161+ "'", i51.equals(161));

  }

  @Test
  public void test100() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test100"); }


    java.lang.Integer i0 = null;
    // The following exception was thrown during execution in test generation
    try {
      tp2.IP iP4 = new tp2.IP(i0, (java.lang.Integer)4897831, (java.lang.Integer)100, (java.lang.Integer)1275068417);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test101() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test101"); }


    // The following exception was thrown during execution in test generation
    try {
      int i2 = java.lang.Integer.parseInt("7d6", 469762049);
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

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test102"); }


    int i1 = java.lang.Integer.highestOneBit(3366);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 2048);

  }

  @Test
  public void test103() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test103"); }


    // The following exception was thrown during execution in test generation
    try {
      int i2 = java.lang.Integer.parseUnsignedInt("70", 33554560);
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test104() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test104"); }


    java.lang.String str2 = java.lang.Integer.toUnsignedString((-905969664), 7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "146661001366"+ "'", str2.equals("146661001366"));

  }

  @Test
  public void test105() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test105"); }


    java.lang.Integer i1 = new java.lang.Integer((-1879048192));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + (-1879048192)+ "'", i1.equals((-1879048192)));

  }

  @Test
  public void test106() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test106"); }


    int i2 = java.lang.Integer.sum(144, 524288);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 524432);

  }

  @Test
  public void test107() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test107"); }


    java.lang.Integer i1 = java.lang.Integer.decode("3");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 3+ "'", i1.equals(3));

  }

  @Test
  public void test108() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test108"); }


    int i1 = java.lang.Integer.signum(1325400064);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 1);

  }

  @Test
  public void test109() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test109"); }


    int i2 = java.lang.Integer.divideUnsigned(38000035, 24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1583334);

  }

  @Test
  public void test110() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test110"); }


    java.lang.Integer i1 = java.lang.Integer.getInteger("v");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);

  }

  @Test
  public void test111() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test111"); }


    int i2 = java.lang.Integer.divideUnsigned((-1593835376), (-2063597440));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);

  }

  @Test
  public void test112() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test112"); }


    java.lang.Integer i1 = java.lang.Integer.valueOf(832);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 832+ "'", i1.equals(832));

  }

  @Test
  public void test113() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test113"); }


    int i1 = java.lang.Integer.parseInt("2147480291");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 2147480291);

  }

  @Test
  public void test114() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test114"); }


    java.lang.Integer i2 = java.lang.Integer.getInteger("229376", (-530836224));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i2 + "' != '" + (-530836224)+ "'", i2.equals((-530836224)));

  }

  @Test
  public void test115() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test115"); }


    // The following exception was thrown during execution in test generation
    try {
      java.lang.Integer i1 = new java.lang.Integer("2147483781");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test116() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test116"); }


    int i2 = java.lang.Integer.remainderUnsigned(10010842, 268435456);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 10010842);

  }

  @Test
  public void test117() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test117"); }


    java.lang.String str1 = java.lang.Integer.toUnsignedString(2362614);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "2362614"+ "'", str1.equals("2362614"));

  }

  @Test
  public void test118() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test118"); }


    int i1 = java.lang.Integer.parseInt("31");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 31);

  }

  @Test
  public void test119() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test119"); }


    int i2 = java.lang.Integer.rotateLeft((-1067707136), 84410368);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == (-1067707136));

  }

  @Test
  public void test120() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test120"); }


    tp2.IP iP0 = null;
    tp2.IPBan iPBan2 = new tp2.IPBan(iP0, (java.lang.Long)10L);
    tp2.IP iP3 = iPBan2.getIp();
    java.lang.Long long4 = iPBan2.expires;
    tp2.IP iP5 = iPBan2.getIp();
    tp2.Server server6 = new tp2.Server();
    tp2.IP iP7 = null;
    boolean b8 = server6.addBan(iP7);
    tp2.ITime iTime9 = null;
    server6.setTime(iTime9);
    server6.update();
    tp2.Server server12 = new tp2.Server();
    tp2.IP iP17 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b18 = server12.removeException(iP17);
    boolean b19 = server6.addException(iP17);
    iPBan2.setIp(iP17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L+ "'", long4.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);

  }

  @Test
  public void test121() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test121"); }


    int i1 = java.lang.Integer.reverseBytes(1879048192);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 112);

  }

  @Test
  public void test122() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test122"); }


    // The following exception was thrown during execution in test generation
    try {
      java.lang.Integer i2 = java.lang.Integer.valueOf("11111111111111111100011011100101", (-1593835376));
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test123() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test123"); }


    java.lang.String str1 = java.lang.Integer.toHexString(2031690);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "1f004a"+ "'", str1.equals("1f004a"));

  }

  @Test
  public void test124() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test124"); }


    int i2 = java.lang.Integer.remainderUnsigned(4194304, 5211392);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 4194304);

  }

  @Test
  public void test125() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test125"); }


    java.lang.String str2 = java.lang.Integer.toUnsignedString(1107820544, 734718005);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1107820544"+ "'", str2.equals("1107820544"));

  }

  @Test
  public void test126() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test126"); }


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
    boolean b55 = server10.connect(iP48);
    tp2.ITime iTime56 = null;
    server10.setTime(iTime56);
    
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
    org.junit.Assert.assertTrue(b55 == true);

  }

  @Test
  public void test127() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test127"); }


    int i1 = java.lang.Integer.highestOneBit((-1587281920));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == (-2147483648));

  }

  @Test
  public void test128() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test128"); }


    tp2.IP iP0 = null;
    tp2.IPBan iPBan2 = new tp2.IPBan(iP0, (java.lang.Long)10L);
    java.lang.Long long3 = iPBan2.getExpires();
    tp2.IP iP4 = iPBan2.getIp();
    java.lang.Long long5 = iPBan2.getExpires();
    java.lang.Long long6 = iPBan2.expires;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L+ "'", long3.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L+ "'", long5.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L+ "'", long6.equals(10L));

  }

  @Test
  public void test129() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test129"); }


    tp2.IP iP4 = new tp2.IP((java.lang.Integer)134217720, (java.lang.Integer)469762049, (java.lang.Integer)458885, (java.lang.Integer)630);

  }

  @Test
  public void test130() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test130"); }


    int i1 = java.lang.Integer.parseUnsignedInt("1600000");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 1600000);

  }

  @Test
  public void test131() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test131"); }


    int i1 = java.lang.Integer.signum(23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 1);

  }

  @Test
  public void test132() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test132"); }


    // The following exception was thrown during execution in test generation
    try {
      int i2 = java.lang.Integer.parseUnsignedInt("ne7", 536870926);
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test133() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test133"); }


    tp2.Server server0 = new tp2.Server();
    tp2.Server server1 = new tp2.Server();
    tp2.IP iP6 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b7 = server1.removeException(iP6);
    iP6.setThird((java.lang.Integer)56);
    tp2.IPBan iPBan11 = new tp2.IPBan(iP6, (java.lang.Long)2147483676L);
    iP6.setFirst((java.lang.Integer)16);
    boolean b14 = server0.removeBan(iP6);
    iP6.setFirst((java.lang.Integer)32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);

  }

  @Test
  public void test134() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test134"); }


    // The following exception was thrown during execution in test generation
    try {
      java.lang.Integer i1 = new java.lang.Integer("10000000000000000000000000000010");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test135() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test135"); }


    int i1 = java.lang.Integer.reverse(1073741841);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == (-2013265918));

  }

  @Test
  public void test136() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test136"); }


    int i1 = java.lang.Integer.reverseBytes(4194304);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 16384);

  }

  @Test
  public void test137() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test137"); }


    // The following exception was thrown during execution in test generation
    try {
      java.lang.Integer i2 = java.lang.Integer.valueOf("352322596", 524432);
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test138() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test138"); }


    java.lang.String str1 = java.lang.Integer.toUnsignedString(28672);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "28672"+ "'", str1.equals("28672"));

  }

  @Test
  public void test139() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test139"); }


    // The following exception was thrown during execution in test generation
    try {
      java.lang.Integer i2 = java.lang.Integer.valueOf("320", 128);
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test140() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test140"); }


    java.lang.Integer i1 = java.lang.Integer.valueOf(229376);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 229376+ "'", i1.equals(229376));

  }

  @Test
  public void test141() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test141"); }


    java.lang.String str1 = java.lang.Integer.toUnsignedString((-1587281920));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "2707685376"+ "'", str1.equals("2707685376"));

  }

  @Test
  public void test142() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test142"); }


    long long1 = java.lang.Integer.toUnsignedLong(1879047772);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == 1879047772L);

  }

  @Test
  public void test143() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test143"); }


    int i2 = java.lang.Integer.compareUnsigned(80000085, (-2143289345));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == (-1));

  }

  @Test
  public void test144() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test144"); }


    int i2 = java.lang.Integer.divideUnsigned(161, 56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 2);

  }

  @Test
  public void test145() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test145"); }


    // The following exception was thrown during execution in test generation
    try {
      int i2 = java.lang.Integer.parseUnsignedInt("50397184", 1010);
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test146() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test146"); }


    // The following exception was thrown during execution in test generation
    try {
      int i1 = java.lang.Integer.parseUnsignedInt("89f8");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test147() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test147"); }


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
    java.lang.Integer i29 = iP21.getFirst();
    java.lang.Integer i30 = iP21.getSecond();
    
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
    org.junit.Assert.assertTrue("'" + i29 + "' != '" + 161+ "'", i29.equals(161));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i30 + "' != '" + (-2147483648)+ "'", i30.equals((-2147483648)));

  }

  @Test
  public void test148() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test148"); }


    java.lang.String str2 = java.lang.Integer.toUnsignedString(2362614, 2147483647);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "2362614"+ "'", str2.equals("2362614"));

  }

  @Test
  public void test149() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test149"); }


    int i2 = java.lang.Integer.divideUnsigned(111, 1550375680);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);

  }

  @Test
  public void test150() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test150"); }


    int i1 = java.lang.Integer.lowestOneBit(1668547584);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 1024);

  }

  @Test
  public void test151() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test151"); }


    // The following exception was thrown during execution in test generation
    try {
      java.lang.Integer i2 = java.lang.Integer.valueOf("27", (-2143289345));
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test152() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test152"); }


    int i1 = java.lang.Integer.bitCount(501988245);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 20);

  }

  @Test
  public void test153() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test153"); }


    // The following exception was thrown during execution in test generation
    try {
      int i1 = java.lang.Integer.parseInt("7d6");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test154() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test154"); }


    java.lang.String str1 = java.lang.Integer.toBinaryString(2114);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "100001000010"+ "'", str1.equals("100001000010"));

  }

  @Test
  public void test155() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test155"); }


    java.lang.Integer i1 = new java.lang.Integer(458885);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 458885+ "'", i1.equals(458885));

  }

  @Test
  public void test156() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test156"); }


    int i1 = java.lang.Integer.bitCount(11585);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 6);

  }

  @Test
  public void test157() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test157"); }


    int i1 = java.lang.Integer.numberOfTrailingZeros(352321956);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 2);

  }

  @Test
  public void test158() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test158"); }


    int i1 = java.lang.Integer.numberOfTrailingZeros((-530836224));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 8);

  }

  @Test
  public void test159() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test159"); }


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
    java.lang.Integer i27 = iP21.getFourth();
    java.lang.Integer i28 = iP21.getFirst();
    
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
    org.junit.Assert.assertTrue("'" + i27 + "' != '" + 5+ "'", i27.equals(5));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i28 + "' != '" + 161+ "'", i28.equals(161));

  }

  @Test
  public void test160() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test160"); }


    int i2 = java.lang.Integer.compareUnsigned(503, 9079);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == (-1));

  }

  @Test
  public void test161() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test161"); }


    int i2 = java.lang.Integer.compare(1550375680, 28672);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);

  }

  @Test
  public void test162() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test162"); }


    java.lang.Integer i2 = java.lang.Integer.getInteger("", (java.lang.Integer)(-14619));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i2 + "' != '" + (-14619)+ "'", i2.equals((-14619)));

  }

  @Test
  public void test163() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test163"); }


    // The following exception was thrown during execution in test generation
    try {
      int i2 = java.lang.Integer.parseInt("352322596", 822083745);
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test164() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test164"); }


    int i1 = java.lang.Integer.lowestOneBit(531);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 1);

  }

  @Test
  public void test165() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test165"); }


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
    tp2.IP iP21 = iPBan2.ip;
    tp2.IP iP22 = iPBan2.getIp();
    java.lang.Integer i23 = iP22.getFourth();
    java.lang.Integer i24 = iP22.getThird();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i23 + "' != '" + 5+ "'", i23.equals(5));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i24 + "' != '" + 56+ "'", i24.equals(56));

  }

  @Test
  public void test166() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test166"); }


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
    tp2.IP iP28 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b29 = server23.removeException(iP28);
    iP28.setThird((java.lang.Integer)56);
    tp2.IPBan iPBan33 = new tp2.IPBan(iP28, (java.lang.Long)2147483676L);
    java.lang.Long long34 = null;
    tp2.IPBan iPBan35 = new tp2.IPBan(iP28, long34);
    tp2.IP iP36 = iPBan35.ip;
    boolean b37 = server0.connect(iP36);
    server0.update();
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
    tp2.IP iP55 = iPBan41.getIp();
    java.lang.Integer i56 = iP55.getSecond();
    iP55.setSecond((java.lang.Integer)1073741825);
    boolean b59 = server0.removeException(iP55);
    
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
    org.junit.Assert.assertTrue(b29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long43 + "' != '" + 10L+ "'", long43.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b52 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i53 + "' != '" + 161+ "'", i53.equals(161));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP55);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i56 + "' != '" + (-2147483648)+ "'", i56.equals((-2147483648)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b59 == false);

  }

  @Test
  public void test167() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test167"); }


    java.lang.Integer i1 = new java.lang.Integer("1010000000");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 1010000000+ "'", i1.equals(1010000000));

  }

  @Test
  public void test168() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test168"); }


    long long1 = java.lang.Integer.toUnsignedLong(15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == 15L);

  }

  @Test
  public void test169() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test169"); }


    int i2 = java.lang.Integer.max(631, (-905969664));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 631);

  }

  @Test
  public void test170() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test170"); }


    tp2.IP iP0 = null;
    tp2.IPBan iPBan2 = new tp2.IPBan(iP0, (java.lang.Long)10L);
    java.lang.Long long3 = iPBan2.getExpires();
    tp2.IP iP8 = new tp2.IP((java.lang.Integer)31, (java.lang.Integer)31, (java.lang.Integer)31, (java.lang.Integer)0);
    iPBan2.ip = iP8;
    iPBan2.setExpires((java.lang.Long)(-1L));
    java.lang.Long long12 = iPBan2.expires;
    tp2.IP iP13 = iPBan2.getIp();
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
    iPBan2.ip = iP31;
    iPBan2.setExpires((java.lang.Long)5L);
    tp2.IP iP35 = iPBan2.getIp();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L+ "'", long3.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1L)+ "'", long12.equals((-1L)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP13);
    
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
    org.junit.Assert.assertNotNull(iP35);

  }

  @Test
  public void test171() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test171"); }


    java.lang.String str1 = java.lang.Integer.toUnsignedString((-1067707136));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "3227260160"+ "'", str1.equals("3227260160"));

  }

  @Test
  public void test172() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test172"); }


    tp2.Server server0 = new tp2.Server();
    tp2.IP iP1 = null;
    boolean b2 = server0.addBan(iP1);
    server0.update();
    tp2.IP iP8 = new tp2.IP((java.lang.Integer)31, (java.lang.Integer)31, (java.lang.Integer)31, (java.lang.Integer)0);
    boolean b9 = server0.removeBan(iP8);
    server0.update();
    tp2.IP iP15 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    iP15.setFirst((java.lang.Integer)161);
    iP15.setThird((java.lang.Integer)3);
    iP15.setFirst((java.lang.Integer)26);
    iP15.setFirst((java.lang.Integer)(-2147483592));
    boolean b24 = server0.removeBan(iP15);
    tp2.IP iP25 = null;
    tp2.IPBan iPBan27 = new tp2.IPBan(iP25, (java.lang.Long)10L);
    tp2.IP iP28 = iPBan27.getIp();
    java.lang.Long long29 = iPBan27.expires;
    tp2.IP iP30 = null;
    iPBan27.ip = iP30;
    tp2.Server server32 = new tp2.Server();
    tp2.IP iP37 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b38 = server32.removeException(iP37);
    java.lang.Integer i39 = iP37.getFirst();
    iPBan27.setIp(iP37);
    iP37.setSecond((java.lang.Integer)(-2147483648));
    java.lang.Integer i43 = iP37.getThird();
    boolean b44 = server0.removeBan(iP37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long29 + "' != '" + 10L+ "'", long29.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i39 + "' != '" + 161+ "'", i39.equals(161));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i43 + "' != '" + 939524096+ "'", i43.equals(939524096));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == false);

  }

  @Test
  public void test173() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test173"); }


    int i2 = java.lang.Integer.min(28672, 111);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 111);

  }

  @Test
  public void test174() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test174"); }


    int i1 = java.lang.Integer.signum(20971520);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 1);

  }

  @Test
  public void test175() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test175"); }


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
    iP58.setSecond((java.lang.Integer)(-2147483648));
    boolean b64 = server0.connect(iP58);
    tp2.Server server65 = new tp2.Server();
    tp2.IP iP66 = null;
    boolean b67 = server65.addBan(iP66);
    tp2.Server server68 = new tp2.Server();
    tp2.IP iP73 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b74 = server68.removeException(iP73);
    boolean b76 = iP73.equals((java.lang.Object)(-1L));
    boolean b77 = server65.removeBan(iP73);
    tp2.IP iP82 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    iP82.setFirst((java.lang.Integer)161);
    iP82.setThird((java.lang.Integer)3);
    iP82.setFirst((java.lang.Integer)26);
    boolean b89 = server65.connect(iP82);
    boolean b90 = server0.removeBan(iP82);
    
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
    org.junit.Assert.assertNull(iP49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long50 + "' != '" + 10L+ "'", long50.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b59 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i60 + "' != '" + 161+ "'", i60.equals(161));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b64 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b67 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b74 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b76 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b77 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b89 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b90 == false);

  }

  @Test
  public void test176() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test176"); }


    java.lang.String str1 = java.lang.Integer.toHexString(1493172264);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "59000028"+ "'", str1.equals("59000028"));

  }

  @Test
  public void test177() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test177"); }


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
    iP36.setSecond((java.lang.Integer)36);
    
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

  }

  @Test
  public void test178() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test178"); }


    java.lang.Integer i1 = new java.lang.Integer(111);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 111+ "'", i1.equals(111));

  }

  @Test
  public void test179() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test179"); }


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
    iP46.setSecond((java.lang.Integer)(-2147483592));
    iP46.setFirst((java.lang.Integer)512);
    
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

  }

  @Test
  public void test180() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test180"); }


    // The following exception was thrown during execution in test generation
    try {
      java.lang.Integer i1 = new java.lang.Integer("1f");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test181() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test181"); }


    java.lang.Integer i3 = null;
    // The following exception was thrown during execution in test generation
    try {
      tp2.IP iP4 = new tp2.IP((java.lang.Integer)26, (java.lang.Integer)(-2147483620), (java.lang.Integer)469761943, i3);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test182() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test182"); }


    java.lang.String str2 = java.lang.Integer.toUnsignedString(352321536, 1583334);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "352321536"+ "'", str2.equals("352321536"));

  }

  @Test
  public void test183() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test183"); }


    int i2 = java.lang.Integer.max(1, 1493172264);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1493172264);

  }

  @Test
  public void test184() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test184"); }


    // The following exception was thrown during execution in test generation
    try {
      int i2 = java.lang.Integer.parseInt("", 4897831);
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test185() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test185"); }


    tp2.IP iP0 = null;
    tp2.IPBan iPBan2 = new tp2.IPBan(iP0, (java.lang.Long)10L);
    java.lang.Long long3 = iPBan2.getExpires();
    tp2.IP iP4 = iPBan2.getIp();
    java.lang.Long long5 = iPBan2.getExpires();
    tp2.IP iP6 = iPBan2.getIp();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L+ "'", long3.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L+ "'", long5.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP6);

  }

  @Test
  public void test186() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test186"); }


    int i2 = java.lang.Integer.compare(2031616, 10240);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);

  }

  @Test
  public void test187() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test187"); }


    int i1 = java.lang.Integer.signum(1073741824);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 1);

  }

  @Test
  public void test188() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test188"); }


    int i1 = java.lang.Integer.reverseBytes(7000);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 1478164480);

  }

  @Test
  public void test189() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test189"); }


    int i2 = java.lang.Integer.max((-1587281920), 1073741824);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1073741824);

  }

  @Test
  public void test190() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test190"); }


    long long1 = java.lang.Integer.toUnsignedLong(64);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == 64L);

  }

  @Test
  public void test191() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test191"); }


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
    tp2.IP iP68 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b69 = server63.removeException(iP68);
    server63.update();
    tp2.IP iP71 = null;
    tp2.IPBan iPBan73 = new tp2.IPBan(iP71, (java.lang.Long)10L);
    tp2.IP iP74 = iPBan73.ip;
    tp2.Server server75 = new tp2.Server();
    tp2.IP iP76 = null;
    boolean b77 = server75.addBan(iP76);
    tp2.Server server78 = new tp2.Server();
    tp2.IP iP83 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b84 = server78.removeException(iP83);
    boolean b86 = iP83.equals((java.lang.Object)(-1L));
    boolean b87 = server75.removeBan(iP83);
    iPBan73.ip = iP83;
    boolean b89 = server63.removeException(iP83);
    boolean b90 = server27.removeException(iP83);
    java.lang.Integer i91 = null;
    iP83.setThird(i91);
    boolean b93 = server0.removeException(iP83);
    java.lang.Integer i94 = iP83.getSecond();
    java.lang.Integer i95 = iP83.getSecond();
    java.lang.Integer i96 = iP83.getFourth();
    
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
    org.junit.Assert.assertTrue(b69 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP74);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b77 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b84 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b86 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b87 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b89 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b90 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b93 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i94 + "' != '" + (-2147483648)+ "'", i94.equals((-2147483648)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i95 + "' != '" + (-2147483648)+ "'", i95.equals((-2147483648)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i96 + "' != '" + 5+ "'", i96.equals(5));

  }

  @Test
  public void test192() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test192"); }


    int i1 = java.lang.Integer.highestOneBit(2013262563);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 1073741824);

  }

  @Test
  public void test193() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test193"); }


    int i2 = java.lang.Integer.compareUnsigned(2114, 41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);

  }

  @Test
  public void test194() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test194"); }


    int i1 = java.lang.Integer.lowestOneBit(469762049);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 1);

  }

  @Test
  public void test195() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test195"); }


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
    java.lang.Integer i25 = iP17.getSecond();
    tp2.IPBan iPBan27 = new tp2.IPBan(iP17, (java.lang.Long)100L);
    tp2.Server server28 = new tp2.Server();
    tp2.IP iP33 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b34 = server28.removeException(iP33);
    iP33.setThird((java.lang.Integer)56);
    tp2.IPBan iPBan38 = new tp2.IPBan(iP33, (java.lang.Long)2147483676L);
    iPBan27.setIp(iP33);
    iPBan27.expires = 35320L;
    
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
    org.junit.Assert.assertTrue("'" + i25 + "' != '" + (-2147483648)+ "'", i25.equals((-2147483648)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);

  }

  @Test
  public void test196() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test196"); }


    java.lang.String str2 = java.lang.Integer.toUnsignedString((-671088629), 62563);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "3623878667"+ "'", str2.equals("3623878667"));

  }

  @Test
  public void test197() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test197"); }


    // The following exception was thrown during execution in test generation
    try {
      int i2 = java.lang.Integer.parseUnsignedInt("1400000", 0);
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test198() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test198"); }


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
    tp2.IP iP44 = iPBan31.getIp();
    boolean b45 = server0.removeBan(iP44);
    java.lang.Integer i46 = null;
    iP44.setThird(i46);
    
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
    org.junit.Assert.assertNotNull(iP44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == true);

  }

  @Test
  public void test199() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test199"); }


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
    tp2.IPBan iPBan45 = new tp2.IPBan(iP43, (java.lang.Long)133L);
    iPBan45.setExpires((java.lang.Long)2013262563L);
    iPBan45.expires = 31L;
    
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
  public void test200() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test200"); }


    int i2 = java.lang.Integer.rotateLeft(501988245, 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 501988245);

  }

  @Test
  public void test201() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test201"); }


    java.lang.Integer i1 = java.lang.Integer.valueOf("1100101");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 1100101+ "'", i1.equals(1100101));

  }

  @Test
  public void test202() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test202"); }


    java.lang.Integer i1 = new java.lang.Integer(19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 19+ "'", i1.equals(19));

  }

  @Test
  public void test203() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test203"); }


    java.lang.String str1 = java.lang.Integer.toOctalString(176);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "260"+ "'", str1.equals("260"));

  }

  @Test
  public void test204() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test204"); }


    // The following exception was thrown during execution in test generation
    try {
      java.lang.Integer i2 = java.lang.Integer.valueOf("1f0046", 38000035);
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test205() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test205"); }


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
    iP36.setThird((java.lang.Integer)268435466);
    
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

  }

  @Test
  public void test206() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test206"); }


    int i2 = java.lang.Integer.rotateLeft((-2147483648), 3997696);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == (-2147483648));

  }

  @Test
  public void test207() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test207"); }


    tp2.IP iP0 = null;
    tp2.IPBan iPBan2 = new tp2.IPBan(iP0, (java.lang.Long)10L);
    tp2.IP iP3 = iPBan2.getIp();
    iPBan2.expires = 0L;
    tp2.IP iP6 = iPBan2.ip;
    tp2.IP iP7 = iPBan2.getIp();
    iPBan2.setExpires((java.lang.Long)35320L);
    tp2.IP iP10 = iPBan2.getIp();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP10);

  }

  @Test
  public void test208() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test208"); }


    java.lang.Integer i2 = java.lang.Integer.getInteger("26", 83886080);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i2 + "' != '" + 83886080+ "'", i2.equals(83886080));

  }

  @Test
  public void test209() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test209"); }


    java.lang.String str1 = java.lang.Integer.toBinaryString(1073741824);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "1000000000000000000000000000000"+ "'", str1.equals("1000000000000000000000000000000"));

  }

  @Test
  public void test210() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test210"); }


    // The following exception was thrown during execution in test generation
    try {
      java.lang.Integer i2 = java.lang.Integer.valueOf("2147483704", (-2147483592));
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test211() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test211"); }


    java.lang.Integer i1 = java.lang.Integer.decode("2013262563");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 2013262563+ "'", i1.equals(2013262563));

  }

  @Test
  public void test212() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test212"); }


    java.lang.Integer i2 = java.lang.Integer.getInteger("229376", 13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i2 + "' != '" + 13+ "'", i2.equals(13));

  }

  @Test
  public void test213() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test213"); }


    java.lang.Integer i1 = new java.lang.Integer("2000204102");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 2000204102+ "'", i1.equals(2000204102));

  }

  @Test
  public void test214() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test214"); }


    int i2 = java.lang.Integer.max(740, 268435456);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 268435456);

  }

  @Test
  public void test215() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test215"); }


    // The following exception was thrown during execution in test generation
    try {
      int i2 = java.lang.Integer.parseInt("59000028", (-1879048031));
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test216() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test216"); }


    int i1 = java.lang.Integer.parseInt("2527140");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 2527140);

  }

  @Test
  public void test217() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test217"); }


    int i2 = java.lang.Integer.divideUnsigned(20971520, (-268435820));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);

  }

  @Test
  public void test218() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test218"); }


    // The following exception was thrown during execution in test generation
    try {
      java.lang.Integer i2 = java.lang.Integer.valueOf("2147483704", 112);
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test219() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test219"); }


    java.lang.Integer i1 = new java.lang.Integer("700000");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 700000+ "'", i1.equals(700000));

  }

  @Test
  public void test220() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test220"); }


    java.lang.String str1 = java.lang.Integer.toUnsignedString(2031616);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "2031616"+ "'", str1.equals("2031616"));

  }

  @Test
  public void test221() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test221"); }


    tp2.Server server0 = new tp2.Server();
    tp2.IP iP1 = null;
    boolean b2 = server0.addBan(iP1);
    server0.update();
    tp2.IP iP8 = new tp2.IP((java.lang.Integer)31, (java.lang.Integer)31, (java.lang.Integer)31, (java.lang.Integer)0);
    boolean b9 = server0.removeBan(iP8);
    server0.update();
    tp2.IP iP15 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    iP15.setFirst((java.lang.Integer)161);
    iP15.setThird((java.lang.Integer)3);
    iP15.setFirst((java.lang.Integer)26);
    iP15.setFirst((java.lang.Integer)(-2147483592));
    boolean b24 = server0.removeBan(iP15);
    iP15.setFourth((java.lang.Integer)(-1073741818));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);

  }

  @Test
  public void test222() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test222"); }


    // The following exception was thrown during execution in test generation
    try {
      int i2 = java.lang.Integer.parseInt("352321536", 144);
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test223() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test223"); }


    java.lang.Integer i1 = java.lang.Integer.getInteger("3928g3h1");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);

  }

  @Test
  public void test224() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test224"); }


    // The following exception was thrown during execution in test generation
    try {
      java.lang.Integer i2 = java.lang.Integer.valueOf("260", (-1291845532));
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

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test225"); }


    int i1 = java.lang.Integer.bitCount(16384);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 1);

  }

  @Test
  public void test226() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test226"); }


    int i2 = java.lang.Integer.min(2031690, 49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 49);

  }

  @Test
  public void test227() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test227"); }


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
    iP24.setSecond((java.lang.Integer)1476395008);
    java.lang.Integer i36 = iP24.getFourth();
    
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
    org.junit.Assert.assertTrue("'" + i36 + "' != '" + 5+ "'", i36.equals(5));

  }

  @Test
  public void test228() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test228"); }


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
    tp2.ITime iTime32 = null;
    server0.setTime(iTime32);
    
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

  }

  @Test
  public void test229() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test229"); }


    int i2 = java.lang.Integer.max(16384, 740);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 16384);

  }

  @Test
  public void test230() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test230"); }


    tp2.IP iP0 = null;
    tp2.IPBan iPBan2 = new tp2.IPBan(iP0, (java.lang.Long)10L);
    java.lang.Long long3 = iPBan2.getExpires();
    tp2.IP iP4 = iPBan2.getIp();
    java.lang.Long long5 = iPBan2.expires;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L+ "'", long3.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L+ "'", long5.equals(10L));

  }

  @Test
  public void test231() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test231"); }


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
    java.lang.Long long21 = iPBan2.getExpires();
    tp2.Server server22 = new tp2.Server();
    tp2.IP iP23 = null;
    boolean b24 = server22.addBan(iP23);
    tp2.ITime iTime25 = null;
    server22.setTime(iTime25);
    tp2.IP iP27 = null;
    tp2.IPBan iPBan29 = new tp2.IPBan(iP27, (java.lang.Long)10L);
    tp2.IP iP30 = iPBan29.getIp();
    java.lang.Long long31 = iPBan29.expires;
    tp2.IP iP32 = null;
    iPBan29.ip = iP32;
    tp2.Server server34 = new tp2.Server();
    tp2.IP iP39 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b40 = server34.removeException(iP39);
    java.lang.Integer i41 = iP39.getFirst();
    iPBan29.setIp(iP39);
    boolean b43 = server22.connect(iP39);
    tp2.Server server44 = new tp2.Server();
    tp2.IP iP49 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b50 = server44.removeException(iP49);
    server44.update();
    tp2.Server server52 = new tp2.Server();
    tp2.IP iP57 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b58 = server52.removeException(iP57);
    java.lang.Integer i59 = iP57.getFirst();
    boolean b60 = server44.addBan(iP57);
    boolean b62 = iP57.equals((java.lang.Object)(short)10);
    iP57.setSecond((java.lang.Integer)(-134217728));
    iP57.setFirst((java.lang.Integer)(-2147483592));
    boolean b67 = server22.addException(iP57);
    iPBan2.setIp(iP57);
    tp2.IP iP69 = iPBan2.getIp();
    tp2.Server server70 = new tp2.Server();
    tp2.IP iP71 = null;
    boolean b72 = server70.addBan(iP71);
    tp2.Server server73 = new tp2.Server();
    tp2.IP iP78 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b79 = server73.removeException(iP78);
    boolean b81 = iP78.equals((java.lang.Object)(-1L));
    boolean b82 = server70.removeBan(iP78);
    java.lang.Integer i83 = iP78.getFourth();
    java.lang.Integer i84 = iP78.getFirst();
    iP78.setThird((java.lang.Integer)33554640);
    iPBan2.setIp(iP78);
    java.lang.Integer i88 = iP78.getFourth();
    
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
    org.junit.Assert.assertTrue("'" + long21 + "' != '" + 10L+ "'", long21.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long31 + "' != '" + 10L+ "'", long31.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i41 + "' != '" + 161+ "'", i41.equals(161));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b43 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b50 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b58 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i59 + "' != '" + 161+ "'", i59.equals(161));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b60 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b62 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b67 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP69);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b72 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b79 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b81 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b82 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i83 + "' != '" + 5+ "'", i83.equals(5));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i84 + "' != '" + 161+ "'", i84.equals(161));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i88 + "' != '" + 5+ "'", i88.equals(5));

  }

  @Test
  public void test232() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test232"); }


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
    tp2.Server server29 = new tp2.Server();
    tp2.IP iP30 = null;
    boolean b31 = server29.addBan(iP30);
    tp2.Server server32 = new tp2.Server();
    tp2.IP iP37 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b38 = server32.removeException(iP37);
    boolean b40 = iP37.equals((java.lang.Object)(-1L));
    boolean b41 = server29.removeBan(iP37);
    tp2.IP iP46 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    iP46.setFirst((java.lang.Integer)161);
    iP46.setThird((java.lang.Integer)3);
    iP46.setFirst((java.lang.Integer)26);
    boolean b53 = server29.connect(iP46);
    iP46.setSecond((java.lang.Integer)469761943);
    iP46.setSecond((java.lang.Integer)939524096);
    iP46.setFourth((java.lang.Integer)2031686);
    tp2.IPBan iPBan61 = new tp2.IPBan(iP46, (java.lang.Long)100L);
    boolean b62 = server0.addBan(iP46);
    
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
    org.junit.Assert.assertTrue(b31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b53 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b62 == true);

  }

  @Test
  public void test233() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test233"); }


    tp2.IP iP0 = null;
    tp2.IPBan iPBan2 = new tp2.IPBan(iP0, (java.lang.Long)10L);
    java.lang.Long long3 = iPBan2.getExpires();
    tp2.IP iP8 = new tp2.IP((java.lang.Integer)31, (java.lang.Integer)31, (java.lang.Integer)31, (java.lang.Integer)0);
    iPBan2.ip = iP8;
    java.lang.Integer i10 = iP8.getFirst();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L+ "'", long3.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i10 + "' != '" + 31+ "'", i10.equals(31));

  }

  @Test
  public void test234() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test234"); }


    java.lang.String str1 = java.lang.Integer.toOctalString(740);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "1344"+ "'", str1.equals("1344"));

  }

  @Test
  public void test235() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test235"); }


    int i2 = java.lang.Integer.sum(0, 16777216);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 16777216);

  }

  @Test
  public void test236() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test236"); }


    int i2 = java.lang.Integer.max(186646533, 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 186646533);

  }

  @Test
  public void test237() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test237"); }


    int i2 = java.lang.Integer.parseInt("12", 21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 23);

  }

  @Test
  public void test238() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test238"); }


    java.lang.Integer i1 = java.lang.Integer.valueOf(83886080);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 83886080+ "'", i1.equals(83886080));

  }

  @Test
  public void test239() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test239"); }


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
    iP65.setFirst((java.lang.Integer)(-2080374783));
    java.lang.Integer i77 = null;
    iP65.setThird(i77);
    
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

  }

  @Test
  public void test240() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test240"); }


    // The following exception was thrown during execution in test generation
    try {
      int i2 = java.lang.Integer.parseInt("2", 176);
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test241() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test241"); }


    java.lang.Integer i1 = new java.lang.Integer(36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 36+ "'", i1.equals(36));

  }

  @Test
  public void test242() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test242"); }


    long long1 = java.lang.Integer.toUnsignedLong(2031686);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == 2031686L);

  }

  @Test
  public void test243() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test243"); }


    // The following exception was thrown during execution in test generation
    try {
      int i2 = java.lang.Integer.parseUnsignedInt("5256300", 0);
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test244() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test244"); }


    // The following exception was thrown during execution in test generation
    try {
      int i2 = java.lang.Integer.parseUnsignedInt("1326", 5);
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test245() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test245"); }


    int i2 = java.lang.Integer.compare(6, (-671088629));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);

  }

  @Test
  public void test246() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test246"); }


    java.lang.Integer i2 = java.lang.Integer.getInteger("1100101", 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i2 + "' != '" + 2+ "'", i2.equals(2));

  }

  @Test
  public void test247() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test247"); }


    tp2.IP iP0 = null;
    tp2.IPBan iPBan2 = new tp2.IPBan(iP0, (java.lang.Long)10L);
    java.lang.Long long3 = iPBan2.getExpires();
    tp2.IP iP4 = iPBan2.getIp();
    iPBan2.setExpires((java.lang.Long)100L);
    java.lang.Long long7 = iPBan2.expires;
    java.lang.Long long8 = iPBan2.getExpires();
    java.lang.Long long9 = iPBan2.expires;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L+ "'", long3.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L+ "'", long7.equals(100L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100L+ "'", long8.equals(100L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long9 + "' != '" + 100L+ "'", long9.equals(100L));

  }

  @Test
  public void test248() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test248"); }


    java.lang.Integer i1 = java.lang.Integer.valueOf(11024899);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 11024899+ "'", i1.equals(11024899));

  }

  @Test
  public void test249() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test249"); }


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
    iPBan2.setExpires((java.lang.Long)80000085L);
    
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

  }

  @Test
  public void test250() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test250"); }


    java.lang.String str2 = java.lang.Integer.toUnsignedString(88, 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "88"+ "'", str2.equals("88"));

  }

  @Test
  public void test251() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test251"); }


    int i1 = java.lang.Integer.signum(7489);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 1);

  }

  @Test
  public void test252() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test252"); }


    int i2 = java.lang.Integer.max(1342177288, 67108864);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1342177288);

  }

  @Test
  public void test253() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test253"); }


    // The following exception was thrown during execution in test generation
    try {
      int i2 = java.lang.Integer.parseInt("", 161);
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test254() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test254"); }


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
    tp2.IP iP64 = iPBan11.getIp();
    iPBan11.expires = 64L;
    
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
    org.junit.Assert.assertNotNull(iP64);

  }

  @Test
  public void test255() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test255"); }


    int i2 = java.lang.Integer.divideUnsigned(2013262563, 101);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 19933292);

  }

  @Test
  public void test256() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test256"); }


    java.lang.Integer i2 = java.lang.Integer.getInteger("146661001366", (java.lang.Integer)38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i2 + "' != '" + 38+ "'", i2.equals(38));

  }

  @Test
  public void test257() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test257"); }


    int i1 = java.lang.Integer.bitCount((-268435820));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 25);

  }

  @Test
  public void test258() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test258"); }


    java.lang.String str1 = java.lang.Integer.toUnsignedString(7000);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "7000"+ "'", str1.equals("7000"));

  }

  @Test
  public void test259() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test259"); }


    java.lang.Integer i1 = new java.lang.Integer(4897831);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 4897831+ "'", i1.equals(4897831));

  }

  @Test
  public void test260() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test260"); }


    int i1 = java.lang.Integer.lowestOneBit(268435456);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 268435456);

  }

  @Test
  public void test261() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test261"); }


    int i2 = java.lang.Integer.max(2082996226, 4096);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 2082996226);

  }

  @Test
  public void test262() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test262"); }


    // The following exception was thrown during execution in test generation
    try {
      java.lang.Integer i2 = java.lang.Integer.valueOf("37000000000", 503);
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test263() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test263"); }


    java.lang.Integer i1 = java.lang.Integer.getInteger("2147483781");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);

  }

  @Test
  public void test264() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test264"); }


    tp2.IP iP4 = new tp2.IP((java.lang.Integer)2147483647, (java.lang.Integer)(-1), (java.lang.Integer)56, (java.lang.Integer)458752);
    tp2.IPBan iPBan6 = new tp2.IPBan(iP4, (java.lang.Long)2147483676L);
    java.lang.Long long7 = iPBan6.expires;
    java.lang.Long long8 = iPBan6.expires;
    tp2.IP iP9 = iPBan6.getIp();
    tp2.IP iP10 = null;
    tp2.IPBan iPBan12 = new tp2.IPBan(iP10, (java.lang.Long)10L);
    tp2.IP iP13 = iPBan12.getIp();
    tp2.IP iP18 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    iP18.setFirst((java.lang.Integer)161);
    iP18.setThird((java.lang.Integer)3);
    iP18.setFirst((java.lang.Integer)26);
    iPBan12.ip = iP18;
    boolean b27 = iP18.equals((java.lang.Object)28L);
    iPBan6.ip = iP18;
    iP18.setThird((java.lang.Integer)2048);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long7 + "' != '" + 2147483676L+ "'", long7.equals(2147483676L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long8 + "' != '" + 2147483676L+ "'", long8.equals(2147483676L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);

  }

  @Test
  public void test265() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test265"); }


    java.lang.Integer i1 = java.lang.Integer.getInteger("27");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);

  }

  @Test
  public void test266() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test266"); }


    int i1 = java.lang.Integer.numberOfLeadingZeros(51200);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 16);

  }

  @Test
  public void test267() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test267"); }


    int i1 = java.lang.Integer.parseUnsignedInt("2031616");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 2031616);

  }

  @Test
  public void test268() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test268"); }


    int i2 = java.lang.Integer.sum(458885, 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 458885);

  }

  @Test
  public void test269() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test269"); }


    java.lang.Integer i1 = new java.lang.Integer(1100101);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 1100101+ "'", i1.equals(1100101));

  }

  @Test
  public void test270() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test270"); }


    // The following exception was thrown during execution in test generation
    try {
      java.lang.Integer i1 = java.lang.Integer.decode("11700000000");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test271() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test271"); }


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
    iPBan2.expires = 27L;
    
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
  public void test272() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test272"); }


    java.lang.Integer i2 = java.lang.Integer.getInteger("640000a1", 531);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i2 + "' != '" + 531+ "'", i2.equals(531));

  }

  @Test
  public void test273() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test273"); }


    java.lang.String str1 = java.lang.Integer.toBinaryString(1668547584);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "1100011011101000000010000000000"+ "'", str1.equals("1100011011101000000010000000000"));

  }

  @Test
  public void test274() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test274"); }


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
    boolean b19 = iP17.equals((java.lang.Object)false);
    java.lang.Integer i20 = iP17.getFourth();
    
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
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i20 + "' != '" + 5+ "'", i20.equals(5));

  }

  @Test
  public void test275() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test275"); }


    int i2 = java.lang.Integer.remainderUnsigned(26, 80000085);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 26);

  }

  @Test
  public void test276() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test276"); }


    java.lang.Integer i1 = new java.lang.Integer("111101");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 111101+ "'", i1.equals(111101));

  }

  @Test
  public void test277() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test277"); }


    java.lang.Integer i1 = new java.lang.Integer("260");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 260+ "'", i1.equals(260));

  }

  @Test
  public void test278() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test278"); }


    java.lang.Integer i1 = java.lang.Integer.decode("112160");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 112160+ "'", i1.equals(112160));

  }

  @Test
  public void test279() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test279"); }


    tp2.IP iP4 = new tp2.IP((java.lang.Integer)21262214, (java.lang.Integer)36, (java.lang.Integer)51211, (java.lang.Integer)4897831);

  }

  @Test
  public void test280() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test280"); }


    int i1 = java.lang.Integer.reverseBytes(1600000);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 6952960);

  }

  @Test
  public void test281() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test281"); }


    java.lang.Integer i1 = new java.lang.Integer("47463");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 47463+ "'", i1.equals(47463));

  }

  @Test
  public void test282() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test282"); }


    int i1 = java.lang.Integer.signum(2362614);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 1);

  }

  @Test
  public void test283() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test283"); }


    // The following exception was thrown during execution in test generation
    try {
      java.lang.Integer i2 = java.lang.Integer.valueOf("2147480291", (-530836224));
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test284() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test284"); }


    java.lang.String str1 = java.lang.Integer.toOctalString(3366);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "6446"+ "'", str1.equals("6446"));

  }

  @Test
  public void test285() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test285"); }


    int i1 = java.lang.Integer.parseInt("2456");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 2456);

  }

  @Test
  public void test286() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test286"); }


    int i2 = java.lang.Integer.compare(0, 186646533);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == (-1));

  }

  @Test
  public void test287() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test287"); }


    java.lang.Integer i1 = new java.lang.Integer(1108377608);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 1108377608+ "'", i1.equals(1108377608));

  }

  @Test
  public void test288() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test288"); }


    int i1 = java.lang.Integer.signum((-2143289345));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == (-1));

  }

  @Test
  public void test289() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test289"); }


    tp2.IP iP0 = null;
    tp2.IPBan iPBan2 = new tp2.IPBan(iP0, (java.lang.Long)10L);
    java.lang.Long long3 = iPBan2.getExpires();
    java.lang.Long long4 = iPBan2.expires;
    iPBan2.expires = 4160749568L;
    tp2.IP iP7 = iPBan2.getIp();
    tp2.IP iP8 = iPBan2.getIp();
    iPBan2.setExpires((java.lang.Long)4160749568L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L+ "'", long3.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L+ "'", long4.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP8);

  }

  @Test
  public void test290() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test290"); }


    int i1 = java.lang.Integer.lowestOneBit(13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 1);

  }

  @Test
  public void test291() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test291"); }


    java.lang.Integer i2 = java.lang.Integer.getInteger("61", (java.lang.Integer)1437910020);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i2 + "' != '" + 1437910020+ "'", i2.equals(1437910020));

  }

  @Test
  public void test292() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test292"); }


    int i1 = java.lang.Integer.lowestOneBit(70);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 2);

  }

  @Test
  public void test293() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test293"); }


    java.lang.Integer i1 = java.lang.Integer.decode("100");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 100+ "'", i1.equals(100));

  }

  @Test
  public void test294() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test294"); }


    int i2 = java.lang.Integer.compare(0, 1677721779);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == (-1));

  }

  @Test
  public void test295() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test295"); }


    int i1 = java.lang.Integer.parseUnsignedInt("58");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 58);

  }

  @Test
  public void test296() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test296"); }


    int i1 = java.lang.Integer.reverseBytes(700000);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 1622018560);

  }

  @Test
  public void test297() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test297"); }


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
    iP40.setSecond((java.lang.Integer)1476395008);
    tp2.IPBan iPBan47 = new tp2.IPBan(iP40, (java.lang.Long)10L);
    tp2.Server server48 = new tp2.Server();
    tp2.IP iP53 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b54 = server48.removeException(iP53);
    iP53.setThird((java.lang.Integer)56);
    java.lang.Integer i57 = iP53.getFourth();
    java.lang.Integer i58 = null;
    iP53.setFirst(i58);
    iPBan47.ip = iP53;
    tp2.IPBan iPBan62 = new tp2.IPBan(iP53, (java.lang.Long)1677721600L);
    iP53.setFirst((java.lang.Integer)1476395008);
    boolean b65 = server0.addBan(iP53);
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
    org.junit.Assert.assertNull(iP31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long32 + "' != '" + 10L+ "'", long32.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i42 + "' != '" + 161+ "'", i42.equals(161));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b54 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i57 + "' != '" + 5+ "'", i57.equals(5));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b65 == true);

  }

  @Test
  public void test298() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test298"); }


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
    iP35.setFourth((java.lang.Integer)(-1067707136));
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
    java.lang.Long long61 = iPBan46.expires;
    java.lang.Long long62 = iPBan46.getExpires();
    tp2.IP iP63 = iPBan46.getIp();
    boolean b64 = iP35.equals((java.lang.Object)iPBan46);
    iPBan46.expires = 133L;
    
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
    org.junit.Assert.assertTrue("'" + long61 + "' != '" + 10L+ "'", long61.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long62 + "' != '" + 10L+ "'", long62.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP63);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b64 == false);

  }

  @Test
  public void test299() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test299"); }


    // The following exception was thrown during execution in test generation
    try {
      java.lang.Integer i1 = java.lang.Integer.valueOf("11700000000");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test300() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test300"); }


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
    tp2.Server server26 = new tp2.Server();
    tp2.IP iP27 = null;
    boolean b28 = server26.connect(iP27);
    tp2.Server server29 = new tp2.Server();
    tp2.Server server30 = new tp2.Server();
    tp2.IP iP31 = null;
    boolean b32 = server30.addBan(iP31);
    tp2.IP iP37 = new tp2.IP((java.lang.Integer)31, (java.lang.Integer)31, (java.lang.Integer)31, (java.lang.Integer)0);
    iP37.setSecond((java.lang.Integer)2147483647);
    boolean b40 = server30.addBan(iP37);
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
    boolean b63 = server30.removeBan(iP58);
    boolean b64 = server29.addBan(iP58);
    iP58.setFourth((java.lang.Integer)1476395008);
    boolean b67 = server26.removeBan(iP58);
    tp2.IP iP68 = null;
    boolean b69 = server26.addBan(iP68);
    tp2.ITime iTime70 = null;
    server26.setTime(iTime70);
    tp2.IP iP72 = null;
    tp2.IPBan iPBan74 = new tp2.IPBan(iP72, (java.lang.Long)10L);
    tp2.IP iP75 = iPBan74.getIp();
    java.lang.Long long76 = iPBan74.expires;
    tp2.IP iP77 = null;
    iPBan74.ip = iP77;
    tp2.Server server79 = new tp2.Server();
    tp2.IP iP84 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b85 = server79.removeException(iP84);
    java.lang.Integer i86 = iP84.getFirst();
    iPBan74.setIp(iP84);
    iP84.setSecond((java.lang.Integer)(-2147483648));
    boolean b90 = server26.connect(iP84);
    iPBan19.ip = iP84;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L+ "'", long4.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i14 + "' != '" + 161+ "'", i14.equals(161));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == true);
    
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
    org.junit.Assert.assertTrue(b63 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b64 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b67 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b69 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP75);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long76 + "' != '" + 10L+ "'", long76.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b85 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i86 + "' != '" + 161+ "'", i86.equals(161));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b90 == true);

  }

  @Test
  public void test301() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test301"); }


    int i1 = java.lang.Integer.signum((-1291845532));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == (-1));

  }

  @Test
  public void test302() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test302"); }


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
    iP24.setFourth((java.lang.Integer)1677721761);
    java.lang.Integer i34 = iP24.getThird();
    
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
    org.junit.Assert.assertTrue("'" + i34 + "' != '" + 1023410176+ "'", i34.equals(1023410176));

  }

  @Test
  public void test303() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test303"); }


    tp2.IP iP0 = null;
    tp2.IPBan iPBan2 = new tp2.IPBan(iP0, (java.lang.Long)10L);
    tp2.IP iP3 = iPBan2.getIp();
    java.lang.Long long4 = iPBan2.expires;
    tp2.IP iP5 = iPBan2.getIp();
    java.lang.Long long6 = null;
    iPBan2.expires = long6;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L+ "'", long4.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP5);

  }

  @Test
  public void test304() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test304"); }


    tp2.IP iP0 = null;
    tp2.IPBan iPBan2 = new tp2.IPBan(iP0, (java.lang.Long)10L);
    java.lang.Long long3 = iPBan2.getExpires();
    java.lang.Long long4 = iPBan2.expires;
    iPBan2.expires = 4160749568L;
    tp2.IP iP7 = iPBan2.getIp();
    iPBan2.setExpires((java.lang.Long)24L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L+ "'", long3.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L+ "'", long4.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP7);

  }

  @Test
  public void test305() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test305"); }


    java.lang.Integer i2 = java.lang.Integer.getInteger("1100101", (java.lang.Integer)32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i2 + "' != '" + 32+ "'", i2.equals(32));

  }

  @Test
  public void test306() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test306"); }


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
    tp2.IP iP52 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    java.lang.Integer i53 = iP52.getFirst();
    iP52.setSecond((java.lang.Integer)(-2147483515));
    iPBan2.ip = iP52;
    iP52.setThird((java.lang.Integer)321);
    
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
    org.junit.Assert.assertTrue("'" + i53 + "' != '" + 161+ "'", i53.equals(161));

  }

  @Test
  public void test307() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test307"); }


    int i1 = java.lang.Integer.signum(6952960);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 1);

  }

  @Test
  public void test308() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test308"); }


    int i1 = java.lang.Integer.highestOneBit(1073741825);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 1073741824);

  }

  @Test
  public void test309() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test309"); }


    int i2 = java.lang.Integer.remainderUnsigned((-1067707136), 268435456);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 6034688);

  }

  @Test
  public void test310() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test310"); }


    java.lang.Integer i2 = java.lang.Integer.getInteger("4329604", (-1879048031));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i2 + "' != '" + (-1879048031)+ "'", i2.equals((-1879048031)));

  }

  @Test
  public void test311() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test311"); }


    tp2.Server server0 = new tp2.Server();
    tp2.IP iP1 = null;
    boolean b2 = server0.addBan(iP1);
    tp2.IP iP7 = new tp2.IP((java.lang.Integer)31, (java.lang.Integer)31, (java.lang.Integer)31, (java.lang.Integer)0);
    iP7.setSecond((java.lang.Integer)2147483647);
    boolean b10 = server0.addBan(iP7);
    tp2.IP iP11 = null;
    tp2.IPBan iPBan13 = new tp2.IPBan(iP11, (java.lang.Long)10L);
    tp2.IP iP14 = iPBan13.getIp();
    iPBan13.expires = 0L;
    tp2.IP iP17 = iPBan13.ip;
    tp2.Server server18 = new tp2.Server();
    tp2.IP iP19 = null;
    boolean b20 = server18.addBan(iP19);
    tp2.IP iP25 = new tp2.IP((java.lang.Integer)31, (java.lang.Integer)31, (java.lang.Integer)31, (java.lang.Integer)0);
    iP25.setSecond((java.lang.Integer)2147483647);
    boolean b28 = server18.addBan(iP25);
    tp2.Server server29 = new tp2.Server();
    tp2.IP iP30 = null;
    boolean b31 = server29.addBan(iP30);
    tp2.ITime iTime32 = null;
    server29.setTime(iTime32);
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
    boolean b50 = server29.connect(iP46);
    boolean b51 = server18.removeBan(iP46);
    iPBan13.ip = iP46;
    iP46.setFourth((java.lang.Integer)(-1067707136));
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
    tp2.IP iP71 = iPBan57.getIp();
    java.lang.Long long72 = iPBan57.expires;
    java.lang.Long long73 = iPBan57.getExpires();
    tp2.IP iP74 = iPBan57.getIp();
    boolean b75 = iP46.equals((java.lang.Object)iPBan57);
    boolean b76 = server0.addBan(iP46);
    server0.update();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long38 + "' != '" + 10L+ "'", long38.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b47 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i48 + "' != '" + 161+ "'", i48.equals(161));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b50 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b51 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP58);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long59 + "' != '" + 10L+ "'", long59.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b68 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i69 + "' != '" + 161+ "'", i69.equals(161));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP71);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long72 + "' != '" + 10L+ "'", long72.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long73 + "' != '" + 10L+ "'", long73.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP74);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b75 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b76 == true);

  }

  @Test
  public void test312() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test312"); }


    tp2.IP iP0 = null;
    tp2.IPBan iPBan2 = new tp2.IPBan(iP0, (java.lang.Long)10L);
    java.lang.Long long3 = iPBan2.getExpires();
    tp2.IP iP8 = new tp2.IP((java.lang.Integer)31, (java.lang.Integer)31, (java.lang.Integer)31, (java.lang.Integer)0);
    iPBan2.ip = iP8;
    java.lang.Long long10 = iPBan2.expires;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L+ "'", long3.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long10 + "' != '" + 10L+ "'", long10.equals(10L));

  }

  @Test
  public void test313() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test313"); }


    // The following exception was thrown during execution in test generation
    try {
      int i1 = java.lang.Integer.parseInt("1110111001110001011000101000110");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test314() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test314"); }


    tp2.Server server0 = new tp2.Server();
    tp2.IP iP1 = null;
    boolean b2 = server0.addBan(iP1);
    tp2.IP iP7 = new tp2.IP((java.lang.Integer)31, (java.lang.Integer)31, (java.lang.Integer)31, (java.lang.Integer)0);
    iP7.setSecond((java.lang.Integer)2147483647);
    boolean b10 = server0.addBan(iP7);
    tp2.IP iP15 = new tp2.IP((java.lang.Integer)133, (java.lang.Integer)(-2147483515), (java.lang.Integer)79, (java.lang.Integer)(-2147483620));
    boolean b16 = server0.removeBan(iP15);
    iP15.setSecond((java.lang.Integer)70);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);

  }

  @Test
  public void test315() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test315"); }


    java.lang.String str1 = java.lang.Integer.toUnsignedString(1677721779);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "1677721779"+ "'", str1.equals("1677721779"));

  }

  @Test
  public void test316() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test316"); }


    int i2 = java.lang.Integer.compareUnsigned(0, 2000204102);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == (-1));

  }

  @Test
  public void test317() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test317"); }


    // The following exception was thrown during execution in test generation
    try {
      int i2 = java.lang.Integer.parseUnsignedInt("133", 100000);
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test318() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test318"); }


    int i2 = java.lang.Integer.remainderUnsigned(49, 23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 3);

  }

  @Test
  public void test319() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test319"); }


    tp2.IP iP4 = new tp2.IP((java.lang.Integer)2147483647, (java.lang.Integer)(-1), (java.lang.Integer)56, (java.lang.Integer)458752);
    tp2.IPBan iPBan6 = new tp2.IPBan(iP4, (java.lang.Long)2147483676L);
    iP4.setThird((java.lang.Integer)61);

  }

  @Test
  public void test320() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test320"); }


    java.lang.String str1 = java.lang.Integer.toBinaryString((-268435820));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "11101111111111111111111010010100"+ "'", str1.equals("11101111111111111111111010010100"));

  }

  @Test
  public void test321() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test321"); }


    java.lang.String str1 = java.lang.Integer.toBinaryString(134217728);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "1000000000000000000000000000"+ "'", str1.equals("1000000000000000000000000000"));

  }

  @Test
  public void test322() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test322"); }


    java.lang.Integer i1 = java.lang.Integer.valueOf(458752);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 458752+ "'", i1.equals(458752));

  }

  @Test
  public void test323() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test323"); }


    int i2 = java.lang.Integer.divideUnsigned(2031616, 469762048);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);

  }

  @Test
  public void test324() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test324"); }


    java.lang.String str1 = java.lang.Integer.toHexString(28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "1c"+ "'", str1.equals("1c"));

  }

  @Test
  public void test325() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test325"); }


    tp2.Server server0 = new tp2.Server();
    tp2.IP iP1 = null;
    boolean b2 = server0.addBan(iP1);
    tp2.ITime iTime3 = null;
    server0.setTime(iTime3);
    tp2.Server server5 = new tp2.Server();
    tp2.IP iP6 = null;
    boolean b7 = server5.addBan(iP6);
    server5.update();
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
    java.lang.Integer i25 = iP21.getFirst();
    java.lang.Integer i26 = iP21.getFirst();
    boolean b27 = server5.addBan(iP21);
    boolean b28 = server0.addException(iP21);
    iP21.setThird((java.lang.Integer)79);
    java.lang.Integer i31 = iP21.getFirst();
    java.lang.Integer i32 = iP21.getSecond();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long13 + "' != '" + 10L+ "'", long13.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i23 + "' != '" + 161+ "'", i23.equals(161));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i25 + "' != '" + 161+ "'", i25.equals(161));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i26 + "' != '" + 161+ "'", i26.equals(161));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i31 + "' != '" + 161+ "'", i31.equals(161));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i32 + "' != '" + (-2147483648)+ "'", i32.equals((-2147483648)));

  }

  @Test
  public void test326() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test326"); }


    int i2 = java.lang.Integer.min(24, 4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 4);

  }

  @Test
  public void test327() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test327"); }


    // The following exception was thrown during execution in test generation
    try {
      java.lang.Integer i2 = java.lang.Integer.valueOf("4160749568", 1478164480);
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test328() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test328"); }


    java.lang.Integer i1 = java.lang.Integer.valueOf(38000);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 38000+ "'", i1.equals(38000));

  }

  @Test
  public void test329() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test329"); }


    java.lang.Integer i1 = java.lang.Integer.valueOf(36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 36+ "'", i1.equals(36));

  }

  @Test
  public void test330() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test330"); }


    java.lang.Integer i1 = java.lang.Integer.valueOf("4000000");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 4000000+ "'", i1.equals(4000000));

  }

  @Test
  public void test331() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test331"); }


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
    iPBan2.expires = 2362614L;
    
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

  }

  @Test
  public void test332() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test332"); }


    java.lang.String str2 = java.lang.Integer.toUnsignedString(23, 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "n"+ "'", str2.equals("n"));

  }

  @Test
  public void test333() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test333"); }


    int i1 = java.lang.Integer.numberOfTrailingZeros(1677721600);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 26);

  }

  @Test
  public void test334() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test334"); }


    tp2.Server server0 = new tp2.Server();
    tp2.IP iP1 = null;
    boolean b2 = server0.connect(iP1);
    tp2.IP iP3 = null;
    tp2.IPBan iPBan5 = new tp2.IPBan(iP3, (java.lang.Long)10L);
    java.lang.Long long6 = iPBan5.getExpires();
    tp2.IP iP11 = new tp2.IP((java.lang.Integer)31, (java.lang.Integer)31, (java.lang.Integer)31, (java.lang.Integer)0);
    iPBan5.ip = iP11;
    tp2.Server server13 = new tp2.Server();
    tp2.IP iP18 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b19 = server13.removeException(iP18);
    server13.update();
    tp2.Server server21 = new tp2.Server();
    tp2.IP iP26 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b27 = server21.removeException(iP26);
    java.lang.Integer i28 = iP26.getFirst();
    boolean b29 = server13.addBan(iP26);
    iPBan5.setIp(iP26);
    boolean b31 = server0.removeException(iP26);
    iP26.setFourth((java.lang.Integer)2048);
    java.lang.Integer i34 = iP26.getFirst();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L+ "'", long6.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i28 + "' != '" + 161+ "'", i28.equals(161));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i34 + "' != '" + 161+ "'", i34.equals(161));

  }

  @Test
  public void test335() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test335"); }


    int i2 = java.lang.Integer.compareUnsigned((-1587281920), 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);

  }

  @Test
  public void test336() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test336"); }


    tp2.IP iP0 = null;
    tp2.IPBan iPBan2 = new tp2.IPBan(iP0, (java.lang.Long)10L);
    java.lang.Long long3 = iPBan2.getExpires();
    tp2.IP iP8 = new tp2.IP((java.lang.Integer)31, (java.lang.Integer)31, (java.lang.Integer)31, (java.lang.Integer)0);
    iPBan2.ip = iP8;
    boolean b11 = iP8.equals((java.lang.Object)"20000000000");
    java.lang.Integer i12 = iP8.getThird();
    iP8.setSecond((java.lang.Integer)(-1207959532));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L+ "'", long3.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i12 + "' != '" + 31+ "'", i12.equals(31));

  }

  @Test
  public void test337() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test337"); }


    java.lang.Integer i2 = java.lang.Integer.getInteger("1000000000000000000000000000", 28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i2 + "' != '" + 28+ "'", i2.equals(28));

  }

  @Test
  public void test338() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test338"); }


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
    iP4.setFirst((java.lang.Integer)637534208);
    
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
  public void test339() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test339"); }


    java.lang.String str1 = java.lang.Integer.toBinaryString(186646533);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "1011001000000000000000000101"+ "'", str1.equals("1011001000000000000000000101"));

  }

  @Test
  public void test340() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test340"); }


    int i2 = java.lang.Integer.remainderUnsigned((-1879048192), 38000035);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 21916899);

  }

  @Test
  public void test341() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test341"); }


    java.lang.String str1 = java.lang.Integer.toBinaryString(38000000);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "10010000111101010110000000"+ "'", str1.equals("10010000111101010110000000"));

  }

  @Test
  public void test342() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test342"); }


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
    tp2.IP iP36 = new tp2.IP((java.lang.Integer)31, (java.lang.Integer)31, (java.lang.Integer)31, (java.lang.Integer)0);
    iP36.setSecond((java.lang.Integer)2147483647);
    boolean b39 = server29.addBan(iP36);
    tp2.Server server40 = new tp2.Server();
    tp2.IP iP41 = null;
    boolean b42 = server40.addBan(iP41);
    tp2.Server server43 = new tp2.Server();
    tp2.IP iP48 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b49 = server43.removeException(iP48);
    boolean b51 = iP48.equals((java.lang.Object)(-1L));
    boolean b52 = server40.removeBan(iP48);
    java.lang.Integer i53 = iP48.getFourth();
    boolean b54 = server29.removeBan(iP48);
    tp2.ITime iTime55 = null;
    server29.setTime(iTime55);
    server29.update();
    tp2.ITime iTime58 = null;
    server29.setTime(iTime58);
    tp2.IP iP60 = null;
    tp2.IPBan iPBan62 = new tp2.IPBan(iP60, (java.lang.Long)10L);
    tp2.IP iP63 = iPBan62.getIp();
    java.lang.Long long64 = iPBan62.expires;
    tp2.IP iP65 = null;
    iPBan62.ip = iP65;
    tp2.IP iP67 = null;
    tp2.IPBan iPBan69 = new tp2.IPBan(iP67, (java.lang.Long)10L);
    tp2.IP iP70 = iPBan69.getIp();
    java.lang.Long long71 = iPBan69.expires;
    tp2.Server server72 = new tp2.Server();
    tp2.IP iP77 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b78 = server72.removeException(iP77);
    java.lang.Integer i79 = iP77.getFirst();
    iPBan69.setIp(iP77);
    tp2.IP iP81 = iPBan69.ip;
    tp2.IP iP82 = iPBan69.getIp();
    iPBan62.setIp(iP82);
    tp2.IP iP88 = new tp2.IP((java.lang.Integer)31, (java.lang.Integer)(-2147483592), (java.lang.Integer)133, (java.lang.Integer)(-2147483646));
    iPBan62.setIp(iP88);
    java.lang.Integer i90 = iP88.getThird();
    boolean b91 = server29.removeBan(iP88);
    boolean b92 = server0.addException(iP88);
    tp2.ITime iTime93 = null;
    server0.setTime(iTime93);
    
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
    org.junit.Assert.assertTrue(b39 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b49 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b51 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b52 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i53 + "' != '" + 5+ "'", i53.equals(5));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b54 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP63);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long64 + "' != '" + 10L+ "'", long64.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP70);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long71 + "' != '" + 10L+ "'", long71.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b78 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i79 + "' != '" + 161+ "'", i79.equals(161));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP81);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP82);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i90 + "' != '" + 133+ "'", i90.equals(133));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b91 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b92 == true);

  }

  @Test
  public void test343() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test343"); }


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
    java.lang.Integer i27 = iP17.getThird();
    
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
    org.junit.Assert.assertTrue("'" + i27 + "' != '" + 62563+ "'", i27.equals(62563));

  }

  @Test
  public void test344() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test344"); }


    int i1 = java.lang.Integer.numberOfLeadingZeros((-1744830464));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);

  }

  @Test
  public void test345() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test345"); }


    int i2 = java.lang.Integer.max(44, 80);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 80);

  }

  @Test
  public void test346() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test346"); }


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
    tp2.Server server45 = new tp2.Server();
    tp2.IP iP50 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b51 = server45.removeException(iP50);
    boolean b53 = iP50.equals((java.lang.Object)(-1L));
    boolean b54 = server42.removeBan(iP50);
    tp2.IP iP59 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    iP59.setFirst((java.lang.Integer)161);
    iP59.setThird((java.lang.Integer)3);
    iP59.setFirst((java.lang.Integer)26);
    boolean b66 = server42.connect(iP59);
    tp2.IP iP67 = null;
    tp2.IPBan iPBan69 = new tp2.IPBan(iP67, (java.lang.Long)10L);
    java.lang.Long long70 = iPBan69.getExpires();
    tp2.IP iP75 = new tp2.IP((java.lang.Integer)31, (java.lang.Integer)31, (java.lang.Integer)31, (java.lang.Integer)0);
    iPBan69.ip = iP75;
    iP75.setFirst((java.lang.Integer)2);
    boolean b79 = server42.connect(iP75);
    boolean b80 = server0.addException(iP75);
    
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
    org.junit.Assert.assertTrue(b51 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b53 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b54 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b66 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long70 + "' != '" + 10L+ "'", long70.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b79 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b80 == true);

  }

  @Test
  public void test347() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test347"); }


    // The following exception was thrown during execution in test generation
    try {
      java.lang.Integer i2 = java.lang.Integer.valueOf("47463", (-1879048031));
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test348() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test348"); }


    java.lang.Integer i2 = java.lang.Integer.getInteger("hi!", (java.lang.Integer)2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i2 + "' != '" + 2+ "'", i2.equals(2));

  }

  @Test
  public void test349() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test349"); }


    int i2 = java.lang.Integer.compareUnsigned(186646533, 19884108);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);

  }

  @Test
  public void test350() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test350"); }


    // The following exception was thrown during execution in test generation
    try {
      korat.finitization.IFinitization iFinitization1 = tp2.Server.finServer(80);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test351() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test351"); }


    java.lang.Integer i1 = java.lang.Integer.valueOf(9079);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 9079+ "'", i1.equals(9079));

  }

  @Test
  public void test352() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test352"); }


    int i1 = java.lang.Integer.signum(84410411);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 1);

  }

  @Test
  public void test353() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test353"); }


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
    tp2.IP iP46 = null;
    tp2.IPBan iPBan48 = new tp2.IPBan(iP46, (java.lang.Long)10L);
    tp2.IP iP49 = iPBan48.getIp();
    java.lang.Long long50 = iPBan48.expires;
    tp2.Server server51 = new tp2.Server();
    tp2.IP iP56 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b57 = server51.removeException(iP56);
    java.lang.Integer i58 = iP56.getFirst();
    iPBan48.setIp(iP56);
    tp2.IP iP60 = iPBan48.ip;
    boolean b61 = server0.addException(iP60);
    java.lang.Integer i62 = iP60.getThird();
    
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
    org.junit.Assert.assertNull(iP49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long50 + "' != '" + 10L+ "'", long50.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b57 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i58 + "' != '" + 161+ "'", i58.equals(161));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP60);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b61 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i62 + "' != '" + 939524096+ "'", i62.equals(939524096));

  }

  @Test
  public void test354() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test354"); }


    // The following exception was thrown during execution in test generation
    try {
      java.lang.Integer i1 = java.lang.Integer.decode("26300000144");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test355() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test355"); }


    int i2 = java.lang.Integer.rotateLeft(133, 700000);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 133);

  }

  @Test
  public void test356() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test356"); }


    int i2 = java.lang.Integer.sum(134217720, 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 134217720);

  }

  @Test
  public void test357() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test357"); }


    tp2.IP iP4 = new tp2.IP((java.lang.Integer)1108377608, (java.lang.Integer)83886080, (java.lang.Integer)10240, (java.lang.Integer)80000000);

  }

  @Test
  public void test358() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test358"); }


    java.lang.Integer i2 = java.lang.Integer.getInteger("1110111001110001011000101000110", 740);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i2 + "' != '" + 740+ "'", i2.equals(740));

  }

  @Test
  public void test359() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test359"); }


    java.lang.Integer i1 = null;
    // The following exception was thrown during execution in test generation
    try {
      tp2.IP iP4 = new tp2.IP((java.lang.Integer)1668547584, i1, (java.lang.Integer)800, (java.lang.Integer)134217720);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test360() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test360"); }


    int i2 = java.lang.Integer.remainderUnsigned(24, 721422341);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 24);

  }

  @Test
  public void test361() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test361"); }


    java.lang.Integer i1 = java.lang.Integer.valueOf(19933292);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 19933292+ "'", i1.equals(19933292));

  }

  @Test
  public void test362() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test362"); }


    int i1 = java.lang.Integer.lowestOneBit(44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 4);

  }

  @Test
  public void test363() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test363"); }


    int i2 = java.lang.Integer.remainderUnsigned(0, (-1067707136));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);

  }

  @Test
  public void test364() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test364"); }


    // The following exception was thrown during execution in test generation
    try {
      int i2 = java.lang.Integer.parseUnsignedInt("", 67108864);
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test365() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test365"); }


    int i1 = java.lang.Integer.lowestOneBit((-905969664));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 33554432);

  }

  @Test
  public void test366() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test366"); }


    java.lang.Integer i2 = java.lang.Integer.getInteger("3623878667", (java.lang.Integer)111101);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i2 + "' != '" + 111101+ "'", i2.equals(111101));

  }

  @Test
  public void test367() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test367"); }


    int i2 = java.lang.Integer.compareUnsigned(83, 1342177280);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == (-1));

  }

  @Test
  public void test368() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test368"); }


    int i1 = java.lang.Integer.parseUnsignedInt("1000110");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 1000110);

  }

  @Test
  public void test369() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test369"); }


    int i1 = java.lang.Integer.parseUnsignedInt("3623878667");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == (-671088629));

  }

  @Test
  public void test370() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test370"); }


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
    iP56.setSecond((java.lang.Integer)1073741825);
    iPBan2.ip = iP56;
    iPBan2.expires = 268435466L;
    
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
    org.junit.Assert.assertNull(iP47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b50 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b57 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b59 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b60 == false);

  }

  @Test
  public void test371() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test371"); }


    int i2 = java.lang.Integer.remainderUnsigned(1550375680, 501988245);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 44410945);

  }

  @Test
  public void test372() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test372"); }


    tp2.IP iP0 = null;
    tp2.IPBan iPBan2 = new tp2.IPBan(iP0, (java.lang.Long)10L);
    tp2.IP iP3 = iPBan2.getIp();
    iPBan2.expires = 0L;
    tp2.IP iP6 = iPBan2.ip;
    tp2.IP iP7 = iPBan2.getIp();
    iPBan2.setExpires((java.lang.Long)35320L);
    iPBan2.expires = 10010842L;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP7);

  }

  @Test
  public void test373() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test373"); }


    java.lang.Integer i2 = java.lang.Integer.getInteger("1c000000", 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i2 + "' != '" + 100+ "'", i2.equals(100));

  }

  @Test
  public void test374() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test374"); }


    int i1 = java.lang.Integer.reverse(21262214);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 1643520640);

  }

  @Test
  public void test375() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test375"); }


    tp2.Server server0 = new tp2.Server();
    tp2.IP iP5 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b6 = server0.removeException(iP5);
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
    iP24.setFourth((java.lang.Integer)(-2147483620));
    boolean b30 = server7.removeBan(iP24);
    java.lang.Integer i31 = iP24.getSecond();
    iP24.setSecond((java.lang.Integer)(-1879048192));
    boolean b34 = server0.addBan(iP24);
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
    iP52.setFourth((java.lang.Integer)(-2147483620));
    boolean b58 = server35.removeBan(iP52);
    iP52.setFirst((java.lang.Integer)83);
    java.lang.Integer i61 = iP52.getFourth();
    boolean b62 = server0.addException(iP52);
    server0.update();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
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
    org.junit.Assert.assertTrue(b30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i31 + "' != '" + (-2147483648)+ "'", i31.equals((-2147483648)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == true);
    
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
    org.junit.Assert.assertTrue(b58 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i61 + "' != '" + (-2147483620)+ "'", i61.equals((-2147483620)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b62 == true);

  }

  @Test
  public void test376() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test376"); }


    java.lang.Integer i1 = java.lang.Integer.valueOf(35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 35+ "'", i1.equals(35));

  }

  @Test
  public void test377() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test377"); }


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
    tp2.IP iP64 = iPBan11.ip;
    java.lang.Long long65 = iPBan11.getExpires();
    tp2.IP iP66 = null;
    iPBan11.ip = iP66;
    
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
    org.junit.Assert.assertNotNull(iP64);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long65 + "' != '" + 10L+ "'", long65.equals(10L));

  }

  @Test
  public void test378() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test378"); }


    tp2.IP iP0 = null;
    tp2.IPBan iPBan2 = new tp2.IPBan(iP0, (java.lang.Long)10L);
    tp2.IP iP3 = iPBan2.getIp();
    java.lang.Long long4 = iPBan2.expires;
    tp2.IP iP5 = null;
    iPBan2.ip = iP5;
    java.lang.Long long7 = iPBan2.expires;
    tp2.IP iP8 = iPBan2.getIp();
    iPBan2.setExpires((java.lang.Long)14L);
    iPBan2.setExpires((java.lang.Long)14L);
    tp2.IP iP13 = null;
    tp2.IPBan iPBan15 = new tp2.IPBan(iP13, (java.lang.Long)10L);
    tp2.IP iP16 = iPBan15.getIp();
    java.lang.Long long17 = iPBan15.expires;
    tp2.Server server18 = new tp2.Server();
    tp2.IP iP23 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b24 = server18.removeException(iP23);
    java.lang.Integer i25 = iP23.getFirst();
    iPBan15.setIp(iP23);
    tp2.IP iP27 = iPBan15.ip;
    tp2.IP iP28 = null;
    tp2.IPBan iPBan30 = new tp2.IPBan(iP28, (java.lang.Long)10L);
    java.lang.Long long31 = iPBan30.getExpires();
    tp2.IP iP36 = new tp2.IP((java.lang.Integer)31, (java.lang.Integer)31, (java.lang.Integer)31, (java.lang.Integer)0);
    iPBan30.ip = iP36;
    iP36.setFirst((java.lang.Integer)2);
    iPBan15.setIp(iP36);
    tp2.Server server41 = new tp2.Server();
    tp2.IP iP42 = null;
    boolean b43 = server41.addBan(iP42);
    tp2.Server server44 = new tp2.Server();
    tp2.IP iP49 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b50 = server44.removeException(iP49);
    boolean b52 = iP49.equals((java.lang.Object)(-1L));
    boolean b53 = server41.removeBan(iP49);
    iPBan15.ip = iP49;
    tp2.IP iP55 = iPBan15.ip;
    iPBan2.ip = iP55;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L+ "'", long4.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long7 + "' != '" + 10L+ "'", long7.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long17 + "' != '" + 10L+ "'", long17.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i25 + "' != '" + 161+ "'", i25.equals(161));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long31 + "' != '" + 10L+ "'", long31.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b43 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b50 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b52 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b53 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP55);

  }

  @Test
  public void test379() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test379"); }


    java.lang.Integer i1 = java.lang.Integer.valueOf(2000204102);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 2000204102+ "'", i1.equals(2000204102));

  }

  @Test
  public void test380() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test380"); }


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
    tp2.Server server20 = new tp2.Server();
    tp2.IP iP21 = null;
    boolean b22 = server20.addBan(iP21);
    tp2.Server server23 = new tp2.Server();
    tp2.IP iP28 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b29 = server23.removeException(iP28);
    boolean b31 = iP28.equals((java.lang.Object)(-1L));
    boolean b32 = server20.removeBan(iP28);
    tp2.IP iP37 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    iP37.setFirst((java.lang.Integer)161);
    iP37.setThird((java.lang.Integer)3);
    iP37.setFirst((java.lang.Integer)26);
    boolean b44 = server20.connect(iP37);
    tp2.IP iP49 = new tp2.IP((java.lang.Integer)2147483647, (java.lang.Integer)(-1), (java.lang.Integer)56, (java.lang.Integer)458752);
    boolean b50 = server20.addException(iP49);
    iP49.setFirst((java.lang.Integer)1677721600);
    java.lang.Integer i53 = iP49.getFourth();
    iPBan2.ip = iP49;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L+ "'", long3.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long10 + "' != '" + 10L+ "'", long10.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b50 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i53 + "' != '" + 458752+ "'", i53.equals(458752));

  }

  @Test
  public void test381() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test381"); }


    // The following exception was thrown during execution in test generation
    try {
      int i1 = java.lang.Integer.parseInt("b");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test382() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test382"); }


    int i2 = java.lang.Integer.rotateLeft((-671088629), 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == (-671088629));

  }

  @Test
  public void test383() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test383"); }


    int i1 = java.lang.Integer.parseUnsignedInt("50397184");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 50397184);

  }

  @Test
  public void test384() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test384"); }


    tp2.IP iP4 = new tp2.IP((java.lang.Integer)28, (java.lang.Integer)28672, (java.lang.Integer)352322596, (java.lang.Integer)0);

  }

  @Test
  public void test385() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test385"); }


    int i2 = java.lang.Integer.compareUnsigned((-150929408), 5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);

  }

  @Test
  public void test386() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test386"); }


    int i2 = java.lang.Integer.sum((-2147483620), 268503106);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == (-1878980514));

  }

  @Test
  public void test387() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test387"); }


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
    java.lang.Integer i80 = iP69.getSecond();
    
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
    org.junit.Assert.assertTrue("'" + i80 + "' != '" + (-2147483648)+ "'", i80.equals((-2147483648)));

  }

  @Test
  public void test388() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test388"); }


    korat.finitization.IFinitization iFinitization1 = tp2.Server.finServer((-2080374783));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iFinitization1);

  }

  @Test
  public void test389() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test389"); }


    // The following exception was thrown during execution in test generation
    try {
      java.lang.Integer i2 = java.lang.Integer.valueOf("38", 458885);
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test390() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test390"); }


    int i2 = java.lang.Integer.compare(352321956, 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);

  }

  @Test
  public void test391() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test391"); }


    tp2.IP iP0 = null;
    tp2.IPBan iPBan2 = new tp2.IPBan(iP0, (java.lang.Long)10L);
    tp2.IP iP3 = iPBan2.getIp();
    iPBan2.setExpires((java.lang.Long)2147483676L);
    iPBan2.setExpires((java.lang.Long)1L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP3);

  }

  @Test
  public void test392() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test392"); }


    int i1 = java.lang.Integer.numberOfLeadingZeros(2456);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 20);

  }

  @Test
  public void test393() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test393"); }


    java.lang.String str1 = java.lang.Integer.toOctalString(1108377608);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "10204100010"+ "'", str1.equals("10204100010"));

  }

  @Test
  public void test394() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test394"); }


    int i1 = java.lang.Integer.highestOneBit(88);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 64);

  }

  @Test
  public void test395() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test395"); }


    int i2 = java.lang.Integer.remainderUnsigned((-219971585), (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == (-219971585));

  }

  @Test
  public void test396() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test396"); }


    java.lang.String str2 = java.lang.Integer.toUnsignedString(69273664, 1622018560);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "69273664"+ "'", str2.equals("69273664"));

  }

  @Test
  public void test397() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test397"); }


    // The following exception was thrown during execution in test generation
    try {
      int i2 = java.lang.Integer.parseUnsignedInt("1a", 1583334);
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test398() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test398"); }


    int i1 = java.lang.Integer.reverseBytes(13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 218103808);

  }

  @Test
  public void test399() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test399"); }


    int i2 = java.lang.Integer.remainderUnsigned(83886080, 531);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 293);

  }

  @Test
  public void test400() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test400"); }


    // The following exception was thrown during execution in test generation
    try {
      int i2 = java.lang.Integer.parseUnsignedInt("47463", 7);
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test401() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test401"); }


    int i1 = java.lang.Integer.highestOneBit(2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 2);

  }

  @Test
  public void test402() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test402"); }


    // The following exception was thrown during execution in test generation
    try {
      java.lang.Integer i2 = java.lang.Integer.valueOf("", 11024899);
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test403() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test403"); }


    int i2 = java.lang.Integer.min(1000110, 1342177280);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1000110);

  }

  @Test
  public void test404() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test404"); }


    int i2 = java.lang.Integer.rotateRight((-1593835520), 1207959552);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == (-1593835520));

  }

  @Test
  public void test405() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test405"); }


    java.lang.String str1 = java.lang.Integer.toOctalString(2048);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "4000"+ "'", str1.equals("4000"));

  }

  @Test
  public void test406() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test406"); }


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
    java.lang.Integer i55 = iP44.getSecond();
    
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
    org.junit.Assert.assertTrue("'" + i55 + "' != '" + (-2147483648)+ "'", i55.equals((-2147483648)));

  }

  @Test
  public void test407() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test407"); }


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
    java.lang.Long long17 = iPBan2.expires;
    java.lang.Long long18 = iPBan2.getExpires();
    tp2.IP iP19 = iPBan2.getIp();
    java.lang.Integer i20 = iP19.getThird();
    
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
    org.junit.Assert.assertTrue("'" + long17 + "' != '" + 10L+ "'", long17.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long18 + "' != '" + 10L+ "'", long18.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i20 + "' != '" + 939524096+ "'", i20.equals(939524096));

  }

  @Test
  public void test408() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test408"); }


    int i2 = java.lang.Integer.compareUnsigned(10010000, (-671088640));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == (-1));

  }

  @Test
  public void test409() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test409"); }


    java.lang.String str1 = java.lang.Integer.toHexString(2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "2"+ "'", str1.equals("2"));

  }

  @Test
  public void test410() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test410"); }


    java.lang.String str1 = java.lang.Integer.toUnsignedString(3997696);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "3997696"+ "'", str1.equals("3997696"));

  }

  @Test
  public void test411() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test411"); }


    java.lang.Integer i2 = java.lang.Integer.getInteger("27", 38000035);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i2 + "' != '" + 38000035+ "'", i2.equals(38000035));

  }

  @Test
  public void test412() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test412"); }


    int i2 = java.lang.Integer.sum(33554560, 1108377636);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1141932196);

  }

  @Test
  public void test413() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test413"); }


    int i2 = java.lang.Integer.min(3366, 2082996226);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 3366);

  }

  @Test
  public void test414() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test414"); }


    int i1 = java.lang.Integer.parseUnsignedInt("469761943");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 469761943);

  }

  @Test
  public void test415() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test415"); }


    int i1 = java.lang.Integer.numberOfTrailingZeros(10240);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 11);

  }

  @Test
  public void test416() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test416"); }


    // The following exception was thrown during execution in test generation
    try {
      korat.finitization.IFinitization iFinitization1 = tp2.Server.finServer(111101);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test417() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test417"); }


    int i2 = java.lang.Integer.compare(61, 7000);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == (-1));

  }

  @Test
  public void test418() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test418"); }


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
    tp2.Server server32 = new tp2.Server();
    tp2.IP iP37 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b38 = server32.removeException(iP37);
    server32.update();
    tp2.Server server40 = new tp2.Server();
    tp2.IP iP41 = null;
    boolean b42 = server40.addBan(iP41);
    tp2.Server server43 = new tp2.Server();
    tp2.IP iP48 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b49 = server43.removeException(iP48);
    boolean b51 = iP48.equals((java.lang.Object)(-1L));
    boolean b52 = server40.removeBan(iP48);
    tp2.IP iP57 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    iP57.setFirst((java.lang.Integer)161);
    iP57.setThird((java.lang.Integer)3);
    iP57.setFirst((java.lang.Integer)26);
    boolean b64 = server40.connect(iP57);
    iP57.setSecond((java.lang.Integer)1677721761);
    boolean b67 = server32.removeBan(iP57);
    tp2.Server server68 = new tp2.Server();
    tp2.IP iP69 = null;
    boolean b70 = server68.addBan(iP69);
    tp2.ITime iTime71 = null;
    server68.setTime(iTime71);
    tp2.IP iP73 = null;
    tp2.IPBan iPBan75 = new tp2.IPBan(iP73, (java.lang.Long)10L);
    tp2.IP iP76 = iPBan75.getIp();
    java.lang.Long long77 = iPBan75.expires;
    tp2.IP iP78 = null;
    iPBan75.ip = iP78;
    tp2.Server server80 = new tp2.Server();
    tp2.IP iP85 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b86 = server80.removeException(iP85);
    java.lang.Integer i87 = iP85.getFirst();
    iPBan75.setIp(iP85);
    boolean b89 = server68.connect(iP85);
    iP85.setFourth((java.lang.Integer)(-1));
    boolean b92 = server32.removeException(iP85);
    iPBan31.ip = iP85;
    tp2.IPBan iPBan95 = new tp2.IPBan(iP85, (java.lang.Long)100L);
    boolean b96 = server0.removeBan(iP85);
    server0.update();
    
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
    org.junit.Assert.assertTrue(b38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b49 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b51 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b52 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b64 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b67 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b70 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP76);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long77 + "' != '" + 10L+ "'", long77.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b86 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i87 + "' != '" + 161+ "'", i87.equals(161));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b89 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b92 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b96 == false);

  }

  @Test
  public void test419() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test419"); }


    long long1 = java.lang.Integer.toUnsignedLong(2527140);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == 2527140L);

  }

  @Test
  public void test420() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test420"); }


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
    java.lang.Integer i65 = iP25.getFourth();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i65 + "' != '" + 64+ "'", i65.equals(64));

  }

  @Test
  public void test421() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test421"); }


    int i1 = java.lang.Integer.highestOneBit(43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 32);

  }

  @Test
  public void test422() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test422"); }


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
    iP58.setSecond((java.lang.Integer)(-2147483648));
    boolean b64 = server0.connect(iP58);
    java.lang.Integer i65 = iP58.getThird();
    iP58.setThird((java.lang.Integer)1342177288);
    iP58.setSecond((java.lang.Integer)448);
    java.lang.Integer i70 = iP58.getThird();
    boolean b72 = iP58.equals((java.lang.Object)524288);
    java.lang.Integer i73 = iP58.getFourth();
    
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
    org.junit.Assert.assertNull(iP49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long50 + "' != '" + 10L+ "'", long50.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b59 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i60 + "' != '" + 161+ "'", i60.equals(161));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b64 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i65 + "' != '" + 939524096+ "'", i65.equals(939524096));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i70 + "' != '" + 1342177288+ "'", i70.equals(1342177288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b72 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i73 + "' != '" + 5+ "'", i73.equals(5));

  }

  @Test
  public void test423() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test423"); }


    tp2.Server server0 = new tp2.Server();
    tp2.IP iP5 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b6 = server0.removeException(iP5);
    iP5.setThird((java.lang.Integer)56);
    java.lang.Integer i9 = iP5.getFourth();
    tp2.IPBan iPBan11 = new tp2.IPBan(iP5, (java.lang.Long)10L);
    java.lang.Long long12 = iPBan11.expires;
    tp2.IP iP13 = null;
    tp2.IPBan iPBan15 = new tp2.IPBan(iP13, (java.lang.Long)10L);
    tp2.IP iP16 = iPBan15.getIp();
    java.lang.Long long17 = iPBan15.expires;
    tp2.IP iP18 = null;
    iPBan15.ip = iP18;
    java.lang.Long long20 = iPBan15.expires;
    tp2.Server server21 = new tp2.Server();
    tp2.IP iP26 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b27 = server21.removeException(iP26);
    iP26.setThird((java.lang.Integer)56);
    java.lang.Integer i30 = iP26.getFourth();
    tp2.IPBan iPBan32 = new tp2.IPBan(iP26, (java.lang.Long)10L);
    iPBan15.setIp(iP26);
    iPBan11.ip = iP26;
    java.lang.Integer i35 = iP26.getFirst();
    tp2.IPBan iPBan37 = new tp2.IPBan(iP26, (java.lang.Long)2031686L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 5+ "'", i9.equals(5));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long12 + "' != '" + 10L+ "'", long12.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long17 + "' != '" + 10L+ "'", long17.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long20 + "' != '" + 10L+ "'", long20.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i30 + "' != '" + 5+ "'", i30.equals(5));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i35 + "' != '" + 161+ "'", i35.equals(161));

  }

  @Test
  public void test424() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test424"); }


    java.lang.Integer i1 = new java.lang.Integer((-1593835376));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + (-1593835376)+ "'", i1.equals((-1593835376)));

  }

  @Test
  public void test425() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test425"); }


    tp2.Server server0 = new tp2.Server();
    tp2.IP iP5 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b6 = server0.removeException(iP5);
    iP5.setThird((java.lang.Integer)56);
    java.lang.Integer i9 = iP5.getFourth();
    tp2.IPBan iPBan11 = new tp2.IPBan(iP5, (java.lang.Long)10L);
    tp2.IP iP16 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)32768, (java.lang.Integer)161, (java.lang.Integer)(-2147483646));
    iPBan11.setIp(iP16);
    tp2.IP iP18 = null;
    tp2.IPBan iPBan20 = new tp2.IPBan(iP18, (java.lang.Long)10L);
    tp2.IP iP21 = iPBan20.getIp();
    java.lang.Long long22 = iPBan20.expires;
    tp2.IP iP23 = null;
    iPBan20.ip = iP23;
    tp2.Server server25 = new tp2.Server();
    tp2.IP iP26 = null;
    boolean b27 = server25.addBan(iP26);
    tp2.ITime iTime28 = null;
    server25.setTime(iTime28);
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
    boolean b46 = server25.connect(iP42);
    iPBan20.setIp(iP42);
    tp2.IP iP48 = null;
    tp2.IPBan iPBan50 = new tp2.IPBan(iP48, (java.lang.Long)10L);
    tp2.IP iP51 = iPBan50.getIp();
    iPBan50.expires = 0L;
    tp2.IP iP54 = iPBan50.ip;
    tp2.Server server55 = new tp2.Server();
    tp2.IP iP56 = null;
    boolean b57 = server55.addBan(iP56);
    tp2.IP iP62 = new tp2.IP((java.lang.Integer)31, (java.lang.Integer)31, (java.lang.Integer)31, (java.lang.Integer)0);
    iP62.setSecond((java.lang.Integer)2147483647);
    boolean b65 = server55.addBan(iP62);
    tp2.Server server66 = new tp2.Server();
    tp2.IP iP67 = null;
    boolean b68 = server66.addBan(iP67);
    tp2.ITime iTime69 = null;
    server66.setTime(iTime69);
    tp2.IP iP71 = null;
    tp2.IPBan iPBan73 = new tp2.IPBan(iP71, (java.lang.Long)10L);
    tp2.IP iP74 = iPBan73.getIp();
    java.lang.Long long75 = iPBan73.expires;
    tp2.IP iP76 = null;
    iPBan73.ip = iP76;
    tp2.Server server78 = new tp2.Server();
    tp2.IP iP83 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b84 = server78.removeException(iP83);
    java.lang.Integer i85 = iP83.getFirst();
    iPBan73.setIp(iP83);
    boolean b87 = server66.connect(iP83);
    boolean b88 = server55.removeBan(iP83);
    iPBan50.ip = iP83;
    boolean b90 = iP42.equals((java.lang.Object)iP83);
    iPBan11.ip = iP83;
    java.lang.Long long92 = iPBan11.expires;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 5+ "'", i9.equals(5));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long22 + "' != '" + 10L+ "'", long22.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long34 + "' != '" + 10L+ "'", long34.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b43 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i44 + "' != '" + 161+ "'", i44.equals(161));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b46 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b57 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b65 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b68 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP74);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long75 + "' != '" + 10L+ "'", long75.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b84 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i85 + "' != '" + 161+ "'", i85.equals(161));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b87 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b88 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b90 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long92 + "' != '" + 10L+ "'", long92.equals(10L));

  }

  @Test
  public void test426() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test426"); }


    int i2 = java.lang.Integer.min(83, 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 3);

  }

  @Test
  public void test427() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test427"); }


    int i1 = java.lang.Integer.lowestOneBit(6952960);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 2048);

  }

  @Test
  public void test428() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test428"); }


    int i2 = java.lang.Integer.rotateRight(51211, 1108377636);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == (-1342174080));

  }

  @Test
  public void test429() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test429"); }


    java.lang.Integer i1 = java.lang.Integer.decode("4");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 4+ "'", i1.equals(4));

  }

  @Test
  public void test430() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test430"); }


    int i1 = java.lang.Integer.parseInt("1072143");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 1072143);

  }

  @Test
  public void test431() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test431"); }


    long long1 = java.lang.Integer.toUnsignedLong(2031616);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == 2031616L);

  }

  @Test
  public void test432() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test432"); }


    int i2 = java.lang.Integer.divideUnsigned(32, 163387648);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);

  }

  @Test
  public void test433() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test433"); }


    // The following exception was thrown during execution in test generation
    try {
      int i2 = java.lang.Integer.parseUnsignedInt("v", 19933292);
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test434() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test434"); }


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
    iP25.setFirst((java.lang.Integer)1476395008);
    java.lang.Integer i37 = iP25.getThird();
    
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
    org.junit.Assert.assertTrue("'" + i37 + "' != '" + 56+ "'", i37.equals(56));

  }

  @Test
  public void test435() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test435"); }


    java.lang.Integer i1 = java.lang.Integer.valueOf(7000);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 7000+ "'", i1.equals(7000));

  }

  @Test
  public void test436() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test436"); }


    int i1 = java.lang.Integer.numberOfTrailingZeros(1108377608);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 3);

  }

  @Test
  public void test437() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test437"); }


    int i1 = java.lang.Integer.parseUnsignedInt("18000000");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 18000000);

  }

  @Test
  public void test438() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test438"); }


    java.lang.String str2 = java.lang.Integer.toUnsignedString(6952960, 83886080);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "6952960"+ "'", str2.equals("6952960"));

  }

  @Test
  public void test439() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test439"); }


    // The following exception was thrown during execution in test generation
    try {
      korat.finitization.IFinitization iFinitization1 = tp2.Server.finServer(321);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test440() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test440"); }


    int i1 = java.lang.Integer.numberOfTrailingZeros((-268435820));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 2);

  }

  @Test
  public void test441() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test441"); }


    java.lang.String str1 = java.lang.Integer.toOctalString(84410411);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "502000053"+ "'", str1.equals("502000053"));

  }

  @Test
  public void test442() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test442"); }


    int i2 = java.lang.Integer.rotateRight((-1878980514), (-268435820));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 277211392);

  }

  @Test
  public void test443() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test443"); }


    int i2 = java.lang.Integer.rotateRight((-14619), 79);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == (-1916010497));

  }

  @Test
  public void test444() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test444"); }


    tp2.IP iP0 = null;
    tp2.IPBan iPBan2 = new tp2.IPBan(iP0, (java.lang.Long)10L);
    tp2.IP iP3 = iPBan2.getIp();
    java.lang.Long long4 = iPBan2.expires;
    tp2.IP iP5 = null;
    iPBan2.ip = iP5;
    iPBan2.setExpires((java.lang.Long)(-1L));
    java.lang.Long long9 = iPBan2.getExpires();
    java.lang.Long long10 = iPBan2.getExpires();
    iPBan2.expires = 0L;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L+ "'", long4.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L)+ "'", long9.equals((-1L)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L)+ "'", long10.equals((-1L)));

  }

  @Test
  public void test445() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test445"); }


    long long1 = java.lang.Integer.toUnsignedLong(1493172264);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == 1493172264L);

  }

  @Test
  public void test446() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test446"); }


    java.lang.Integer i1 = new java.lang.Integer("1010");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 1010+ "'", i1.equals(1010));

  }

  @Test
  public void test447() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test447"); }


    java.lang.Integer i2 = java.lang.Integer.getInteger("1400000", 469762049);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i2 + "' != '" + 469762049+ "'", i2.equals(469762049));

  }

  @Test
  public void test448() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test448"); }


    int i2 = java.lang.Integer.rotateLeft(0, 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);

  }

  @Test
  public void test449() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test449"); }


    int i2 = java.lang.Integer.max(1677721600, (-2147483515));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1677721600);

  }

  @Test
  public void test450() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test450"); }


    java.lang.Integer i1 = java.lang.Integer.getInteger("23");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);

  }

  @Test
  public void test451() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test451"); }


    // The following exception was thrown during execution in test generation
    try {
      int i2 = java.lang.Integer.parseInt("98bd90", 186646533);
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test452() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test452"); }


    // The following exception was thrown during execution in test generation
    try {
      int i1 = java.lang.Integer.parseUnsignedInt("ne7");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test453() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test453"); }


    int i2 = java.lang.Integer.sum(134217728, 218103808);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 352321536);

  }

  @Test
  public void test454() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test454"); }


    java.lang.Integer i2 = java.lang.Integer.getInteger("2362614", 18757859);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i2 + "' != '" + 18757859+ "'", i2.equals(18757859));

  }

  @Test
  public void test455() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test455"); }


    tp2.IP iP4 = new tp2.IP((java.lang.Integer)1000110, (java.lang.Integer)56, (java.lang.Integer)(-2063597440), (java.lang.Integer)1);

  }

  @Test
  public void test456() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test456"); }


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
    iPBan2.expires = 2147483647L;
    tp2.IP iP32 = iPBan2.ip;
    java.lang.Long long33 = iPBan2.getExpires();
    java.lang.Long long34 = iPBan2.expires;
    tp2.IP iP35 = null;
    iPBan2.ip = iP35;
    
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
    org.junit.Assert.assertNotNull(iP32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long33 + "' != '" + 2147483647L+ "'", long33.equals(2147483647L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long34 + "' != '" + 2147483647L+ "'", long34.equals(2147483647L));

  }

  @Test
  public void test457() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test457"); }


    int i1 = java.lang.Integer.numberOfTrailingZeros((-1207959532));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 2);

  }

  @Test
  public void test458() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test458"); }


    // The following exception was thrown during execution in test generation
    try {
      int i1 = java.lang.Integer.parseUnsignedInt("a1000000");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test459() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test459"); }


    int i2 = java.lang.Integer.rotateRight(536870912, 32768);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 536870912);

  }

  @Test
  public void test460() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test460"); }


    int i1 = java.lang.Integer.numberOfTrailingZeros(31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);

  }

  @Test
  public void test461() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test461"); }


    int i2 = java.lang.Integer.rotateLeft(20971520, 111101);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 2621440);

  }

  @Test
  public void test462() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test462"); }


    // The following exception was thrown during execution in test generation
    try {
      int i1 = java.lang.Integer.parseUnsignedInt("1d41");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test463() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test463"); }


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
    tp2.IP iP68 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b69 = server63.removeException(iP68);
    server63.update();
    tp2.IP iP71 = null;
    tp2.IPBan iPBan73 = new tp2.IPBan(iP71, (java.lang.Long)10L);
    tp2.IP iP74 = iPBan73.ip;
    tp2.Server server75 = new tp2.Server();
    tp2.IP iP76 = null;
    boolean b77 = server75.addBan(iP76);
    tp2.Server server78 = new tp2.Server();
    tp2.IP iP83 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b84 = server78.removeException(iP83);
    boolean b86 = iP83.equals((java.lang.Object)(-1L));
    boolean b87 = server75.removeBan(iP83);
    iPBan73.ip = iP83;
    boolean b89 = server63.removeException(iP83);
    boolean b90 = server27.removeException(iP83);
    java.lang.Integer i91 = null;
    iP83.setThird(i91);
    boolean b93 = server0.removeException(iP83);
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
    org.junit.Assert.assertTrue(b69 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP74);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b77 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b84 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b86 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b87 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b89 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b90 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b93 == false);

  }

  @Test
  public void test464() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test464"); }


    java.lang.Integer i2 = java.lang.Integer.getInteger("8500004f", (java.lang.Integer)(-1744830464));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i2 + "' != '" + (-1744830464)+ "'", i2.equals((-1744830464)));

  }

  @Test
  public void test465() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test465"); }


    java.lang.String str2 = java.lang.Integer.toUnsignedString(12, 31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "c"+ "'", str2.equals("c"));

  }

  @Test
  public void test466() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test466"); }


    java.lang.String str2 = java.lang.Integer.toUnsignedString(20, 51211);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "20"+ "'", str2.equals("20"));

  }

  @Test
  public void test467() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test467"); }


    tp2.IP iP0 = null;
    tp2.IPBan iPBan2 = new tp2.IPBan(iP0, (java.lang.Long)10L);
    tp2.IP iP3 = iPBan2.getIp();
    java.lang.Long long4 = iPBan2.expires;
    tp2.IP iP5 = null;
    iPBan2.ip = iP5;
    java.lang.Long long7 = iPBan2.expires;
    tp2.IP iP8 = iPBan2.getIp();
    tp2.Server server9 = new tp2.Server();
    tp2.IP iP14 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b15 = server9.removeException(iP14);
    server9.update();
    tp2.Server server17 = new tp2.Server();
    tp2.IP iP18 = null;
    boolean b19 = server17.addBan(iP18);
    tp2.Server server20 = new tp2.Server();
    tp2.IP iP25 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b26 = server20.removeException(iP25);
    boolean b28 = iP25.equals((java.lang.Object)(-1L));
    boolean b29 = server17.removeBan(iP25);
    tp2.IP iP34 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    iP34.setFirst((java.lang.Integer)161);
    iP34.setThird((java.lang.Integer)3);
    iP34.setFirst((java.lang.Integer)26);
    boolean b41 = server17.connect(iP34);
    iP34.setSecond((java.lang.Integer)1677721761);
    boolean b44 = server9.removeBan(iP34);
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
    iP62.setFourth((java.lang.Integer)(-1));
    iP62.setFourth((java.lang.Integer)(-1));
    boolean b71 = iP34.equals((java.lang.Object)iP62);
    iP34.setFourth((java.lang.Integer)62563);
    iPBan2.setIp(iP34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L+ "'", long4.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long7 + "' != '" + 10L+ "'", long7.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == false);
    
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
    org.junit.Assert.assertTrue(b71 == false);

  }

  @Test
  public void test468() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test468"); }


    java.lang.Integer i1 = java.lang.Integer.getInteger("4000");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);

  }

  @Test
  public void test469() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test469"); }


    int i2 = java.lang.Integer.compareUnsigned(1325400064, 21262214);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);

  }

  @Test
  public void test470() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test470"); }


    long long1 = java.lang.Integer.toUnsignedLong((-2063597440));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == 2231369856L);

  }

  @Test
  public void test471() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test471"); }


    java.lang.String str1 = java.lang.Integer.toOctalString(1108377636);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "10204100044"+ "'", str1.equals("10204100044"));

  }

  @Test
  public void test472() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test472"); }


    int i2 = java.lang.Integer.sum((-1073741818), (-2063597440));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1157628038);

  }

  @Test
  public void test473() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test473"); }


    int i2 = java.lang.Integer.compareUnsigned(631, 352321536);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == (-1));

  }

  @Test
  public void test474() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test474"); }


    int i2 = java.lang.Integer.min(531, 3366);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 531);

  }

  @Test
  public void test475() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test475"); }


    java.lang.Integer i1 = java.lang.Integer.getInteger("11101111111111111111111010010100");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);

  }

  @Test
  public void test476() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test476"); }


    java.lang.String str1 = java.lang.Integer.toBinaryString(1157628038);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "1000101000000000000000010000110"+ "'", str1.equals("1000101000000000000000010000110"));

  }

  @Test
  public void test477() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test477"); }


    int i2 = java.lang.Integer.sum(7489, (-1067707136));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == (-1067699647));

  }

  @Test
  public void test478() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test478"); }


    int i2 = java.lang.Integer.compare(2147483647, 62563);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);

  }

  @Test
  public void test479() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test479"); }


    java.lang.Integer i1 = new java.lang.Integer(2000204102);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 2000204102+ "'", i1.equals(2000204102));

  }

  @Test
  public void test480() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test480"); }


    java.lang.String str1 = java.lang.Integer.toOctalString(1622018560);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "14053405000"+ "'", str1.equals("14053405000"));

  }

  @Test
  public void test481() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test481"); }


    tp2.Server server0 = new tp2.Server();
    tp2.IP iP5 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b6 = server0.removeException(iP5);
    boolean b8 = iP5.equals((java.lang.Object)(-1L));
    iP5.setFourth((java.lang.Integer)28);
    iP5.setThird((java.lang.Integer)100004);
    java.lang.Integer i13 = iP5.getFourth();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i13 + "' != '" + 28+ "'", i13.equals(28));

  }

  @Test
  public void test482() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test482"); }


    // The following exception was thrown during execution in test generation
    try {
      int i2 = java.lang.Integer.parseUnsignedInt("13344223332131", 3);
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test483() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test483"); }


    int i1 = java.lang.Integer.reverseBytes(38000);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 1888747520);

  }

  @Test
  public void test484() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test484"); }


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
    tp2.IP iP68 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)2, (java.lang.Integer)38000, (java.lang.Integer)32);
    java.lang.Integer i69 = iP68.getSecond();
    boolean b70 = server0.addBan(iP68);
    
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
    org.junit.Assert.assertTrue("'" + i69 + "' != '" + 2+ "'", i69.equals(2));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b70 == true);

  }

  @Test
  public void test485() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test485"); }


    java.lang.String str1 = java.lang.Integer.toBinaryString(25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "11001"+ "'", str1.equals("11001"));

  }

  @Test
  public void test486() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test486"); }


    tp2.IP iP0 = null;
    tp2.IPBan iPBan2 = new tp2.IPBan(iP0, (java.lang.Long)10L);
    tp2.IP iP3 = iPBan2.getIp();
    java.lang.Long long4 = iPBan2.expires;
    tp2.IP iP5 = null;
    iPBan2.ip = iP5;
    java.lang.Long long7 = iPBan2.getExpires();
    iPBan2.expires = 14L;
    tp2.Server server10 = new tp2.Server();
    tp2.IP iP11 = null;
    boolean b12 = server10.addBan(iP11);
    tp2.Server server13 = new tp2.Server();
    tp2.IP iP18 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b19 = server13.removeException(iP18);
    boolean b21 = iP18.equals((java.lang.Object)(-1L));
    boolean b22 = server10.removeBan(iP18);
    tp2.IP iP27 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    iP27.setFirst((java.lang.Integer)161);
    iP27.setThird((java.lang.Integer)3);
    iP27.setFirst((java.lang.Integer)26);
    boolean b34 = server10.connect(iP27);
    iP27.setSecond((java.lang.Integer)469761943);
    iP27.setSecond((java.lang.Integer)939524096);
    iP27.setFourth((java.lang.Integer)2031686);
    tp2.IPBan iPBan42 = new tp2.IPBan(iP27, (java.lang.Long)100L);
    iPBan2.setIp(iP27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L+ "'", long4.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long7 + "' != '" + 10L+ "'", long7.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == true);

  }

  @Test
  public void test487() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test487"); }


    int i2 = java.lang.Integer.max(0, 31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 31);

  }

  @Test
  public void test488() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test488"); }


    java.lang.String str1 = java.lang.Integer.toUnsignedString(700000);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "700000"+ "'", str1.equals("700000"));

  }

  @Test
  public void test489() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test489"); }


    java.lang.String str1 = java.lang.Integer.toOctalString(7000);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "15530"+ "'", str1.equals("15530"));

  }

  @Test
  public void test490() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test490"); }


    java.lang.Integer i1 = new java.lang.Integer(5211392);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 5211392+ "'", i1.equals(5211392));

  }

  @Test
  public void test491() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test491"); }


    // The following exception was thrown during execution in test generation
    try {
      int i2 = java.lang.Integer.parseInt("n", 38000035);
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test492() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test492"); }


    tp2.IP iP0 = null;
    tp2.IPBan iPBan2 = new tp2.IPBan(iP0, (java.lang.Long)10L);
    java.lang.Long long3 = iPBan2.getExpires();
    tp2.IP iP4 = iPBan2.getIp();
    iPBan2.setExpires((java.lang.Long)100L);
    tp2.Server server7 = new tp2.Server();
    tp2.IP iP8 = null;
    boolean b9 = server7.addBan(iP8);
    tp2.Server server10 = new tp2.Server();
    tp2.IP iP15 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b16 = server10.removeException(iP15);
    boolean b18 = iP15.equals((java.lang.Object)(-1L));
    boolean b19 = server7.removeBan(iP15);
    tp2.IP iP24 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    iP24.setFirst((java.lang.Integer)161);
    iP24.setThird((java.lang.Integer)3);
    iP24.setFirst((java.lang.Integer)26);
    boolean b31 = server7.connect(iP24);
    tp2.ITime iTime32 = null;
    server7.setTime(iTime32);
    tp2.IP iP34 = null;
    tp2.IPBan iPBan36 = new tp2.IPBan(iP34, (java.lang.Long)10L);
    tp2.IP iP37 = iPBan36.getIp();
    java.lang.Long long38 = iPBan36.expires;
    tp2.Server server39 = new tp2.Server();
    tp2.IP iP44 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b45 = server39.removeException(iP44);
    java.lang.Integer i46 = iP44.getFirst();
    iPBan36.setIp(iP44);
    boolean b48 = server7.removeBan(iP44);
    iP44.setFirst((java.lang.Integer)186646533);
    boolean b52 = iP44.equals((java.lang.Object)469762049);
    iP44.setFourth((java.lang.Integer)7);
    iPBan2.setIp(iP44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L+ "'", long3.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long38 + "' != '" + 10L+ "'", long38.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i46 + "' != '" + 161+ "'", i46.equals(161));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b48 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b52 == false);

  }

  @Test
  public void test493() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test493"); }


    tp2.Server server0 = new tp2.Server();
    tp2.IP iP5 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b6 = server0.removeException(iP5);
    java.lang.Integer i7 = iP5.getFirst();
    tp2.IPBan iPBan9 = new tp2.IPBan(iP5, (java.lang.Long)2147483676L);
    tp2.IP iP10 = null;
    tp2.IPBan iPBan12 = new tp2.IPBan(iP10, (java.lang.Long)10L);
    tp2.IP iP13 = iPBan12.getIp();
    java.lang.Long long14 = iPBan12.expires;
    tp2.IP iP15 = null;
    iPBan12.ip = iP15;
    tp2.Server server17 = new tp2.Server();
    tp2.IP iP22 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b23 = server17.removeException(iP22);
    java.lang.Integer i24 = iP22.getFirst();
    iPBan12.setIp(iP22);
    tp2.IP iP26 = iPBan12.getIp();
    java.lang.Long long27 = iPBan12.expires;
    java.lang.Long long28 = iPBan12.getExpires();
    tp2.IP iP29 = iPBan12.getIp();
    tp2.Server server30 = new tp2.Server();
    tp2.Server server31 = new tp2.Server();
    tp2.IP iP32 = null;
    boolean b33 = server31.addBan(iP32);
    tp2.IP iP38 = new tp2.IP((java.lang.Integer)31, (java.lang.Integer)31, (java.lang.Integer)31, (java.lang.Integer)0);
    iP38.setSecond((java.lang.Integer)2147483647);
    boolean b41 = server31.addBan(iP38);
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
    boolean b63 = server42.connect(iP59);
    boolean b64 = server31.removeBan(iP59);
    boolean b65 = server30.addBan(iP59);
    iP59.setFourth((java.lang.Integer)1476395008);
    iPBan12.setIp(iP59);
    iPBan9.ip = iP59;
    java.lang.Integer i70 = iP59.getFirst();
    iP59.setSecond((java.lang.Integer)(-1067699647));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i7 + "' != '" + 161+ "'", i7.equals(161));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long14 + "' != '" + 10L+ "'", long14.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i24 + "' != '" + 161+ "'", i24.equals(161));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long27 + "' != '" + 10L+ "'", long27.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long28 + "' != '" + 10L+ "'", long28.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == true);
    
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
    org.junit.Assert.assertTrue(b63 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b64 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b65 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i70 + "' != '" + 161+ "'", i70.equals(161));

  }

  @Test
  public void test494() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test494"); }


    tp2.IP iP4 = new tp2.IP((java.lang.Integer)31, (java.lang.Integer)31, (java.lang.Integer)31, (java.lang.Integer)0);
    iP4.setSecond((java.lang.Integer)2147483647);
    java.lang.Integer i7 = iP4.getThird();
    java.lang.Integer i8 = iP4.getThird();
    iP4.setSecond((java.lang.Integer)1326);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i7 + "' != '" + 31+ "'", i7.equals(31));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i8 + "' != '" + 31+ "'", i8.equals(31));

  }

  @Test
  public void test495() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test495"); }


    int i1 = java.lang.Integer.numberOfTrailingZeros((-1291845532));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 2);

  }

  @Test
  public void test496() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test496"); }


    tp2.Server server0 = new tp2.Server();
    tp2.IP iP1 = null;
    boolean b2 = server0.addBan(iP1);
    tp2.IP iP7 = new tp2.IP((java.lang.Integer)31, (java.lang.Integer)31, (java.lang.Integer)31, (java.lang.Integer)0);
    iP7.setSecond((java.lang.Integer)2147483647);
    boolean b10 = server0.addBan(iP7);
    tp2.IP iP11 = null;
    tp2.IPBan iPBan13 = new tp2.IPBan(iP11, (java.lang.Long)10L);
    tp2.IP iP14 = iPBan13.getIp();
    iPBan13.expires = 0L;
    tp2.IP iP17 = iPBan13.ip;
    tp2.Server server18 = new tp2.Server();
    tp2.IP iP19 = null;
    boolean b20 = server18.addBan(iP19);
    tp2.IP iP25 = new tp2.IP((java.lang.Integer)31, (java.lang.Integer)31, (java.lang.Integer)31, (java.lang.Integer)0);
    iP25.setSecond((java.lang.Integer)2147483647);
    boolean b28 = server18.addBan(iP25);
    tp2.Server server29 = new tp2.Server();
    tp2.IP iP30 = null;
    boolean b31 = server29.addBan(iP30);
    tp2.ITime iTime32 = null;
    server29.setTime(iTime32);
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
    boolean b50 = server29.connect(iP46);
    boolean b51 = server18.removeBan(iP46);
    iPBan13.ip = iP46;
    iP46.setFourth((java.lang.Integer)(-1067707136));
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
    tp2.IP iP71 = iPBan57.getIp();
    java.lang.Long long72 = iPBan57.expires;
    java.lang.Long long73 = iPBan57.getExpires();
    tp2.IP iP74 = iPBan57.getIp();
    boolean b75 = iP46.equals((java.lang.Object)iPBan57);
    boolean b76 = server0.addBan(iP46);
    tp2.IP iP81 = new tp2.IP((java.lang.Integer)229376, (java.lang.Integer)18757859, (java.lang.Integer)61, (java.lang.Integer)70);
    boolean b82 = server0.removeBan(iP81);
    iP81.setSecond((java.lang.Integer)469762048);
    iP81.setThird((java.lang.Integer)(-951058434));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long38 + "' != '" + 10L+ "'", long38.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b47 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i48 + "' != '" + 161+ "'", i48.equals(161));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b50 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b51 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP58);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long59 + "' != '" + 10L+ "'", long59.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b68 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i69 + "' != '" + 161+ "'", i69.equals(161));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP71);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long72 + "' != '" + 10L+ "'", long72.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long73 + "' != '" + 10L+ "'", long73.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP74);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b75 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b76 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b82 == false);

  }

  @Test
  public void test497() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test497"); }


    int i1 = java.lang.Integer.lowestOneBit(1643520640);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 128);

  }

  @Test
  public void test498() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test498"); }


    long long1 = java.lang.Integer.toUnsignedLong(321);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == 321L);

  }

  @Test
  public void test499() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test499"); }


    java.lang.String str1 = java.lang.Integer.toUnsignedString(2082996226);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "2082996226"+ "'", str1.equals("2082996226"));

  }

  @Test
  public void test500() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test500"); }


    java.lang.Integer i2 = java.lang.Integer.getInteger("111", 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i2 + "' != '" + 0+ "'", i2.equals(0));

  }

}
