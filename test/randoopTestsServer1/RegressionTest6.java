package randoopTestsServer1;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest6 {

  public static boolean debug = false;

  @Test
  public void test001() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test001"); }


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
    iP21.setSecond((java.lang.Integer)503);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP21);

  }

  @Test
  public void test002() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test002"); }


    int i1 = java.lang.Integer.lowestOneBit(3997696);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 65536);

  }

  @Test
  public void test003() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test003"); }


    int i2 = java.lang.Integer.remainderUnsigned(10010000, 23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 9);

  }

  @Test
  public void test004() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test004"); }


    tp2.IP iP0 = null;
    tp2.IPBan iPBan2 = new tp2.IPBan(iP0, (java.lang.Long)10L);
    tp2.IP iP3 = iPBan2.getIp();
    iPBan2.expires = 0L;
    tp2.IP iP6 = iPBan2.ip;
    tp2.IP iP7 = iPBan2.getIp();
    iPBan2.setExpires((java.lang.Long)35320L);
    java.lang.Long long10 = iPBan2.getExpires();
    tp2.IP iP11 = iPBan2.getIp();
    tp2.Server server12 = new tp2.Server();
    tp2.IP iP13 = null;
    boolean b14 = server12.addBan(iP13);
    tp2.Server server15 = new tp2.Server();
    tp2.IP iP20 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b21 = server15.removeException(iP20);
    boolean b23 = iP20.equals((java.lang.Object)(-1L));
    boolean b24 = server12.removeBan(iP20);
    tp2.IP iP29 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    iP29.setFirst((java.lang.Integer)161);
    iP29.setThird((java.lang.Integer)3);
    iP29.setFirst((java.lang.Integer)26);
    boolean b36 = server12.connect(iP29);
    tp2.IP iP37 = null;
    tp2.IPBan iPBan39 = new tp2.IPBan(iP37, (java.lang.Long)10L);
    java.lang.Long long40 = iPBan39.getExpires();
    tp2.IP iP45 = new tp2.IP((java.lang.Integer)31, (java.lang.Integer)31, (java.lang.Integer)31, (java.lang.Integer)0);
    iPBan39.ip = iP45;
    iP45.setFirst((java.lang.Integer)2);
    boolean b49 = server12.connect(iP45);
    iPBan2.setIp(iP45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long10 + "' != '" + 35320L+ "'", long10.equals(35320L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long40 + "' != '" + 10L+ "'", long40.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b49 == true);

  }

  @Test
  public void test005() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test005"); }


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
    tp2.IPBan iPBan44 = new tp2.IPBan(iP42, (java.lang.Long)10L);
    tp2.IP iP45 = iPBan44.getIp();
    java.lang.Long long46 = iPBan44.expires;
    tp2.IP iP47 = null;
    iPBan44.ip = iP47;
    tp2.Server server49 = new tp2.Server();
    tp2.IP iP54 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b55 = server49.removeException(iP54);
    java.lang.Integer i56 = iP54.getFirst();
    iPBan44.setIp(iP54);
    iP54.setFourth((java.lang.Integer)(-2147483620));
    tp2.IPBan iPBan61 = new tp2.IPBan(iP54, (java.lang.Long)(-1L));
    boolean b62 = server0.removeBan(iP54);
    tp2.ITime iTime63 = null;
    server0.setTime(iTime63);
    
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
    org.junit.Assert.assertNull(iP45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long46 + "' != '" + 10L+ "'", long46.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b55 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i56 + "' != '" + 161+ "'", i56.equals(161));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b62 == false);

  }

  @Test
  public void test006() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test006"); }


    java.lang.Integer i1 = java.lang.Integer.getInteger("3d");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);

  }

  @Test
  public void test007() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test007"); }


    tp2.Server server0 = new tp2.Server();
    tp2.IP iP1 = null;
    boolean b2 = server0.connect(iP1);
    tp2.Server server3 = new tp2.Server();
    tp2.IP iP4 = null;
    boolean b5 = server3.addBan(iP4);
    tp2.ITime iTime6 = null;
    server3.setTime(iTime6);
    tp2.Server server8 = new tp2.Server();
    tp2.IP iP9 = null;
    boolean b10 = server8.addBan(iP9);
    server8.update();
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
    java.lang.Integer i28 = iP24.getFirst();
    java.lang.Integer i29 = iP24.getFirst();
    boolean b30 = server8.addBan(iP24);
    boolean b31 = server3.addException(iP24);
    boolean b32 = server0.connect(iP24);
    iP24.setFirst((java.lang.Integer)66664134);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long16 + "' != '" + 10L+ "'", long16.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i26 + "' != '" + 161+ "'", i26.equals(161));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i28 + "' != '" + 161+ "'", i28.equals(161));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i29 + "' != '" + 161+ "'", i29.equals(161));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == true);

  }

  @Test
  public void test008() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test008"); }


    // The following exception was thrown during execution in test generation
    try {
      korat.finitization.IFinitization iFinitization1 = tp2.Server.finServer(291939);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test009() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test009"); }


    int i2 = java.lang.Integer.divideUnsigned(6034688, 176);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 34288);

  }

  @Test
  public void test010() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test010"); }


    int i2 = java.lang.Integer.rotateRight(128, 6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 2);

  }

  @Test
  public void test011() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test011"); }


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
    iP19.setSecond((java.lang.Integer)0);
    java.lang.Integer i28 = iP19.getSecond();
    
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
    org.junit.Assert.assertTrue("'" + i28 + "' != '" + 0+ "'", i28.equals(0));

  }

  @Test
  public void test012() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test012"); }


    int i2 = java.lang.Integer.compareUnsigned(0, 79);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == (-1));

  }

  @Test
  public void test013() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test013"); }


    int i2 = java.lang.Integer.rotateRight(0, 22528);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);

  }

  @Test
  public void test014() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test014"); }


    int i2 = java.lang.Integer.remainderUnsigned((-1557978496), 1048576);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 205440);

  }

  @Test
  public void test015() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test015"); }


    // The following exception was thrown during execution in test generation
    try {
      korat.finitization.IFinitization iFinitization1 = tp2.Server.finServer(256);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test016() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test016"); }


    java.lang.Integer i1 = java.lang.Integer.getInteger("229376");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);

  }

  @Test
  public void test017() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test017"); }


    int i1 = java.lang.Integer.parseUnsignedInt("1170000000");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 1170000000);

  }

  @Test
  public void test018() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test018"); }


    int i1 = java.lang.Integer.reverseBytes(83);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 1392508928);

  }

  @Test
  public void test019() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test019"); }


    java.lang.Integer i2 = java.lang.Integer.getInteger("229376", 8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i2 + "' != '" + 8+ "'", i2.equals(8));

  }

  @Test
  public void test020() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test020"); }


    tp2.IP iP4 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-2147483648), (java.lang.Integer)6, (java.lang.Integer)28);
    iP4.setThird((java.lang.Integer)4000000);

  }

  @Test
  public void test021() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test021"); }


    tp2.Server server0 = new tp2.Server();
    tp2.IP iP5 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b6 = server0.removeException(iP5);
    server0.update();
    tp2.IP iP8 = null;
    tp2.IPBan iPBan10 = new tp2.IPBan(iP8, (java.lang.Long)10L);
    tp2.IP iP11 = iPBan10.ip;
    tp2.Server server12 = new tp2.Server();
    tp2.IP iP13 = null;
    boolean b14 = server12.addBan(iP13);
    tp2.Server server15 = new tp2.Server();
    tp2.IP iP20 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b21 = server15.removeException(iP20);
    boolean b23 = iP20.equals((java.lang.Object)(-1L));
    boolean b24 = server12.removeBan(iP20);
    iPBan10.ip = iP20;
    boolean b26 = server0.removeException(iP20);
    tp2.Server server27 = new tp2.Server();
    tp2.IP iP28 = null;
    boolean b29 = server27.addBan(iP28);
    tp2.IP iP34 = new tp2.IP((java.lang.Integer)31, (java.lang.Integer)31, (java.lang.Integer)31, (java.lang.Integer)0);
    iP34.setSecond((java.lang.Integer)2147483647);
    boolean b37 = server27.addBan(iP34);
    tp2.Server server38 = new tp2.Server();
    tp2.IP iP39 = null;
    boolean b40 = server38.addBan(iP39);
    tp2.ITime iTime41 = null;
    server38.setTime(iTime41);
    tp2.IP iP43 = null;
    tp2.IPBan iPBan45 = new tp2.IPBan(iP43, (java.lang.Long)10L);
    tp2.IP iP46 = iPBan45.getIp();
    java.lang.Long long47 = iPBan45.expires;
    tp2.IP iP48 = null;
    iPBan45.ip = iP48;
    tp2.Server server50 = new tp2.Server();
    tp2.IP iP55 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b56 = server50.removeException(iP55);
    java.lang.Integer i57 = iP55.getFirst();
    iPBan45.setIp(iP55);
    boolean b59 = server38.connect(iP55);
    boolean b60 = server27.removeBan(iP55);
    tp2.Server server61 = new tp2.Server();
    tp2.IP iP66 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b67 = server61.removeException(iP66);
    server61.update();
    tp2.Server server69 = new tp2.Server();
    tp2.IP iP74 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b75 = server69.removeException(iP74);
    java.lang.Integer i76 = iP74.getFirst();
    boolean b77 = server61.addBan(iP74);
    tp2.IPBan iPBan79 = new tp2.IPBan(iP74, (java.lang.Long)(-1L));
    boolean b80 = server27.removeBan(iP74);
    boolean b81 = server0.addBan(iP74);
    tp2.ITime iTime82 = null;
    server0.setTime(iTime82);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long47 + "' != '" + 10L+ "'", long47.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b56 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i57 + "' != '" + 161+ "'", i57.equals(161));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b59 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b60 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b67 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b75 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i76 + "' != '" + 161+ "'", i76.equals(161));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b77 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b80 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b81 == true);

  }

  @Test
  public void test022() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test022"); }


    int i1 = java.lang.Integer.bitCount(1677723044);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 8);

  }

  @Test
  public void test023() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test023"); }


    int i2 = java.lang.Integer.rotateLeft(15, 1100101);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 480);

  }

  @Test
  public void test024() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test024"); }


    java.lang.Integer i1 = java.lang.Integer.valueOf(1643520640);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 1643520640+ "'", i1.equals(1643520640));

  }

  @Test
  public void test025() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test025"); }


    java.lang.String str1 = java.lang.Integer.toUnsignedString(90);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "90"+ "'", str1.equals("90"));

  }

  @Test
  public void test026() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test026"); }


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
    java.lang.Integer i35 = iP30.getFourth();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i35 + "' != '" + 5+ "'", i35.equals(5));

  }

  @Test
  public void test027() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test027"); }


    int i1 = java.lang.Integer.reverseBytes(631);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 1996619776);

  }

  @Test
  public void test028() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test028"); }


    int i2 = java.lang.Integer.rotateLeft((-905969664), 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == (-1610612724));

  }

  @Test
  public void test029() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test029"); }


    java.lang.String str1 = java.lang.Integer.toOctalString((-2013265918));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "21000000002"+ "'", str1.equals("21000000002"));

  }

  @Test
  public void test030() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test030"); }


    int i2 = java.lang.Integer.remainderUnsigned(734718005, 1325400064);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 734718005);

  }

  @Test
  public void test031() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test031"); }


    long long1 = java.lang.Integer.toUnsignedLong(176);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == 176L);

  }

  @Test
  public void test032() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test032"); }


    tp2.IP iP0 = null;
    tp2.IPBan iPBan2 = new tp2.IPBan(iP0, (java.lang.Long)10L);
    java.lang.Long long3 = iPBan2.getExpires();
    tp2.IP iP8 = new tp2.IP((java.lang.Integer)31, (java.lang.Integer)31, (java.lang.Integer)31, (java.lang.Integer)0);
    iPBan2.ip = iP8;
    boolean b11 = iP8.equals((java.lang.Object)"20000000000");
    java.lang.Integer i12 = iP8.getFourth();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L+ "'", long3.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i12 + "' != '" + 0+ "'", i12.equals(0));

  }

  @Test
  public void test033() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test033"); }


    java.lang.String str1 = java.lang.Integer.toHexString(1000000012);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "3b9aca0c"+ "'", str1.equals("3b9aca0c"));

  }

  @Test
  public void test034() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test034"); }


    java.lang.String str2 = java.lang.Integer.toUnsignedString(15, 36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "f"+ "'", str2.equals("f"));

  }

  @Test
  public void test035() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test035"); }


    // The following exception was thrown during execution in test generation
    try {
      int i2 = java.lang.Integer.parseInt("", (-1207959532));
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

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test036"); }


    int i1 = java.lang.Integer.numberOfTrailingZeros(19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);

  }

  @Test
  public void test037() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test037"); }


    int i1 = java.lang.Integer.numberOfTrailingZeros(291939);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);

  }

  @Test
  public void test038() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test038"); }


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
    iP29.setFirst((java.lang.Integer)1677721600);
    java.lang.Integer i33 = iP29.getSecond();
    tp2.IPBan iPBan35 = new tp2.IPBan(iP29, (java.lang.Long)24L);
    
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
    org.junit.Assert.assertTrue("'" + i33 + "' != '" + (-1)+ "'", i33.equals((-1)));

  }

  @Test
  public void test039() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test039"); }


    java.lang.Integer i1 = java.lang.Integer.getInteger("1493172264");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);

  }

  @Test
  public void test040() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test040"); }


    // The following exception was thrown during execution in test generation
    try {
      korat.finitization.IFinitization iFinitization1 = tp2.Server.finServer(1326);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test041() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test041"); }


    int i1 = java.lang.Integer.reverseBytes(4000);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == (-1609629696));

  }

  @Test
  public void test042() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test042"); }


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
    tp2.IP iP30 = null;
    iPBan2.setIp(iP30);
    tp2.IP iP32 = iPBan2.getIp();
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
    tp2.IP iP49 = iPBan35.getIp();
    java.lang.Integer i50 = iP49.getSecond();
    iP49.setSecond((java.lang.Integer)1073741825);
    iPBan2.ip = iP49;
    iPBan2.setExpires((java.lang.Long)100L);
    
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
    org.junit.Assert.assertNull(iP32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long37 + "' != '" + 10L+ "'", long37.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b46 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i47 + "' != '" + 161+ "'", i47.equals(161));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i50 + "' != '" + (-2147483648)+ "'", i50.equals((-2147483648)));

  }

  @Test
  public void test043() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test043"); }


    java.lang.Integer i1 = new java.lang.Integer(19884108);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 19884108+ "'", i1.equals(19884108));

  }

  @Test
  public void test044() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test044"); }


    tp2.IP iP0 = null;
    tp2.IPBan iPBan2 = new tp2.IPBan(iP0, (java.lang.Long)10L);
    java.lang.Long long3 = iPBan2.getExpires();
    java.lang.Long long4 = iPBan2.expires;
    iPBan2.expires = 4160749568L;
    iPBan2.expires = 3L;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L+ "'", long3.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L+ "'", long4.equals(10L));

  }

  @Test
  public void test045() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test045"); }


    int i1 = java.lang.Integer.lowestOneBit((-2147483620));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 4);

  }

  @Test
  public void test046() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test046"); }


    int i1 = java.lang.Integer.highestOneBit(10010842);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 8388608);

  }

  @Test
  public void test047() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test047"); }


    tp2.IP iP4 = new tp2.IP((java.lang.Integer)7, (java.lang.Integer)90, (java.lang.Integer)186646533, (java.lang.Integer)51380224);

  }

  @Test
  public void test048() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test048"); }


    int i1 = java.lang.Integer.bitCount(80000085);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 12);

  }

  @Test
  public void test049() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test049"); }


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
    iP32.setFirst((java.lang.Integer)(-268435820));
    
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

  }

  @Test
  public void test050() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test050"); }


    int i1 = java.lang.Integer.parseInt("1010");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 1010);

  }

  @Test
  public void test051() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test051"); }


    int i2 = java.lang.Integer.max(144, (-1587281920));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 144);

  }

  @Test
  public void test052() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test052"); }


    int i2 = java.lang.Integer.compare(101011, 134217738);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == (-1));

  }

  @Test
  public void test053() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test053"); }


    long long1 = java.lang.Integer.toUnsignedLong(44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == 44L);

  }

  @Test
  public void test054() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test054"); }


    int i2 = java.lang.Integer.rotateLeft(1342177280, (-2147483515));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 10);

  }

  @Test
  public void test055() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test055"); }


    int i1 = java.lang.Integer.lowestOneBit(66664134);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 2);

  }

  @Test
  public void test056() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test056"); }


    tp2.Server server0 = new tp2.Server();
    tp2.IP iP1 = null;
    boolean b2 = server0.connect(iP1);
    tp2.Server server3 = new tp2.Server();
    tp2.IP iP4 = null;
    boolean b5 = server3.addBan(iP4);
    tp2.ITime iTime6 = null;
    server3.setTime(iTime6);
    tp2.Server server8 = new tp2.Server();
    tp2.IP iP9 = null;
    boolean b10 = server8.addBan(iP9);
    server8.update();
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
    java.lang.Integer i28 = iP24.getFirst();
    java.lang.Integer i29 = iP24.getFirst();
    boolean b30 = server8.addBan(iP24);
    boolean b31 = server3.addException(iP24);
    boolean b32 = server0.connect(iP24);
    tp2.IP iP33 = null;
    tp2.IPBan iPBan35 = new tp2.IPBan(iP33, (java.lang.Long)10L);
    tp2.IP iP36 = iPBan35.getIp();
    java.lang.Long long37 = iPBan35.expires;
    tp2.Server server38 = new tp2.Server();
    tp2.IP iP43 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b44 = server38.removeException(iP43);
    java.lang.Integer i45 = iP43.getFirst();
    iPBan35.setIp(iP43);
    tp2.IP iP47 = iPBan35.ip;
    tp2.IP iP48 = null;
    tp2.IPBan iPBan50 = new tp2.IPBan(iP48, (java.lang.Long)10L);
    java.lang.Long long51 = iPBan50.getExpires();
    tp2.IP iP56 = new tp2.IP((java.lang.Integer)31, (java.lang.Integer)31, (java.lang.Integer)31, (java.lang.Integer)0);
    iPBan50.ip = iP56;
    iP56.setFirst((java.lang.Integer)2);
    iPBan35.setIp(iP56);
    tp2.Server server61 = new tp2.Server();
    tp2.IP iP62 = null;
    boolean b63 = server61.addBan(iP62);
    tp2.Server server64 = new tp2.Server();
    tp2.IP iP69 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b70 = server64.removeException(iP69);
    boolean b72 = iP69.equals((java.lang.Object)(-1L));
    boolean b73 = server61.removeBan(iP69);
    iPBan35.ip = iP69;
    iP69.setSecond((java.lang.Integer)38000035);
    boolean b77 = server0.connect(iP69);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long16 + "' != '" + 10L+ "'", long16.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i26 + "' != '" + 161+ "'", i26.equals(161));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i28 + "' != '" + 161+ "'", i28.equals(161));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i29 + "' != '" + 161+ "'", i29.equals(161));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long37 + "' != '" + 10L+ "'", long37.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i45 + "' != '" + 161+ "'", i45.equals(161));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long51 + "' != '" + 10L+ "'", long51.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b63 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b70 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b72 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b73 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b77 == true);

  }

  @Test
  public void test057() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test057"); }


    int i2 = java.lang.Integer.divideUnsigned(2031686, 1207959552);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);

  }

  @Test
  public void test058() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test058"); }


    int i2 = java.lang.Integer.min(3997696, (-1879048192));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == (-1879048192));

  }

  @Test
  public void test059() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test059"); }


    int i1 = java.lang.Integer.highestOneBit(21916899);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 16777216);

  }

  @Test
  public void test060() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test060"); }


    // The following exception was thrown during execution in test generation
    try {
      korat.finitization.IFinitization iFinitization1 = tp2.Server.finServer(21262214);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test061() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test061"); }


    java.lang.Integer i1 = new java.lang.Integer("1000");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 1000+ "'", i1.equals(1000));

  }

  @Test
  public void test062() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test062"); }


    tp2.Server server0 = new tp2.Server();
    tp2.IP iP1 = null;
    boolean b2 = server0.addBan(iP1);
    tp2.Server server3 = new tp2.Server();
    tp2.IP iP8 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b9 = server3.removeException(iP8);
    boolean b11 = iP8.equals((java.lang.Object)(-1L));
    boolean b12 = server0.removeBan(iP8);
    tp2.Server server13 = new tp2.Server();
    tp2.IP iP18 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b19 = server13.removeException(iP18);
    server13.update();
    tp2.Server server21 = new tp2.Server();
    tp2.IP iP22 = null;
    boolean b23 = server21.addBan(iP22);
    tp2.Server server24 = new tp2.Server();
    tp2.IP iP29 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b30 = server24.removeException(iP29);
    boolean b32 = iP29.equals((java.lang.Object)(-1L));
    boolean b33 = server21.removeBan(iP29);
    tp2.IP iP38 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    iP38.setFirst((java.lang.Integer)161);
    iP38.setThird((java.lang.Integer)3);
    iP38.setFirst((java.lang.Integer)26);
    boolean b45 = server21.connect(iP38);
    iP38.setSecond((java.lang.Integer)1677721761);
    boolean b48 = server13.removeBan(iP38);
    tp2.Server server49 = new tp2.Server();
    tp2.IP iP50 = null;
    boolean b51 = server49.addBan(iP50);
    tp2.ITime iTime52 = null;
    server49.setTime(iTime52);
    tp2.IP iP54 = null;
    tp2.IPBan iPBan56 = new tp2.IPBan(iP54, (java.lang.Long)10L);
    tp2.IP iP57 = iPBan56.getIp();
    java.lang.Long long58 = iPBan56.expires;
    tp2.IP iP59 = null;
    iPBan56.ip = iP59;
    tp2.Server server61 = new tp2.Server();
    tp2.IP iP66 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b67 = server61.removeException(iP66);
    java.lang.Integer i68 = iP66.getFirst();
    iPBan56.setIp(iP66);
    boolean b70 = server49.connect(iP66);
    iP66.setFourth((java.lang.Integer)(-1));
    boolean b73 = server13.removeException(iP66);
    java.lang.Integer i74 = iP66.getFirst();
    boolean b75 = server0.addException(iP66);
    tp2.ITime iTime76 = null;
    server0.setTime(iTime76);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b48 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b51 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long58 + "' != '" + 10L+ "'", long58.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b67 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i68 + "' != '" + 161+ "'", i68.equals(161));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b70 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b73 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i74 + "' != '" + 161+ "'", i74.equals(161));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b75 == true);

  }

  @Test
  public void test063() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test063"); }


    korat.finitization.IFinitization iFinitization1 = tp2.Server.finServer((-951058434));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iFinitization1);

  }

  @Test
  public void test064() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test064"); }


    java.lang.Integer i1 = new java.lang.Integer(1141932196);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 1141932196+ "'", i1.equals(1141932196));

  }

  @Test
  public void test065() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test065"); }


    java.lang.Integer i3 = null;
    // The following exception was thrown during execution in test generation
    try {
      tp2.IP iP4 = new tp2.IP((java.lang.Integer)841, (java.lang.Integer)71554675, (java.lang.Integer)83886080, i3);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test066() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test066"); }


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
    iP16.setFirst((java.lang.Integer)6);
    boolean b20 = iP16.equals((java.lang.Object)469761943);
    tp2.IPBan iPBan22 = new tp2.IPBan(iP16, (java.lang.Long)832L);
    
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
    org.junit.Assert.assertTrue(b20 == false);

  }

  @Test
  public void test067() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test067"); }


    // The following exception was thrown during execution in test generation
    try {
      int i2 = java.lang.Integer.parseInt("503", (-150994944));
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

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test068"); }


    java.lang.Integer i1 = java.lang.Integer.getInteger("b0000c80");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);

  }

  @Test
  public void test069() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test069"); }


    tp2.Server server0 = new tp2.Server();
    tp2.IP iP1 = null;
    boolean b2 = server0.addBan(iP1);
    server0.update();
    tp2.IP iP8 = new tp2.IP((java.lang.Integer)31, (java.lang.Integer)31, (java.lang.Integer)31, (java.lang.Integer)0);
    boolean b9 = server0.removeBan(iP8);
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
    tp2.IP iP31 = iPBan17.getIp();
    java.lang.Integer i32 = iP31.getSecond();
    iP31.setSecond((java.lang.Integer)161);
    boolean b35 = server10.connect(iP31);
    iP31.setSecond((java.lang.Integer)5211392);
    boolean b38 = server0.connect(iP31);
    iP31.setSecond((java.lang.Integer)(-1609629696));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
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
    org.junit.Assert.assertNotNull(iP31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i32 + "' != '" + (-2147483648)+ "'", i32.equals((-2147483648)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == true);

  }

  @Test
  public void test070() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test070"); }


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
    java.lang.Long long35 = iPBan11.expires;
    java.lang.Long long36 = iPBan11.getExpires();
    iPBan11.setExpires((java.lang.Long)2362614L);
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
    iPBan11.setIp(iP55);
    iP55.setThird((java.lang.Integer)9079);
    
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
    org.junit.Assert.assertTrue("'" + long35 + "' != '" + 10L+ "'", long35.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long36 + "' != '" + 10L+ "'", long36.equals(10L));
    
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

  }

  @Test
  public void test071() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test071"); }


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
    tp2.IPBan iPBan63 = new tp2.IPBan(iP60, (java.lang.Long)2147483647L);
    tp2.IP iP64 = iPBan63.ip;
    
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
    org.junit.Assert.assertNotNull(iP64);

  }

  @Test
  public void test072() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test072"); }


    int i2 = java.lang.Integer.max(38000, 20416);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 38000);

  }

  @Test
  public void test073() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test073"); }


    // The following exception was thrown during execution in test generation
    try {
      int i2 = java.lang.Integer.parseInt("a1000000", 220);
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test074() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test074"); }


    int i2 = java.lang.Integer.sum(38, 24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 62);

  }

  @Test
  public void test075() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test075"); }


    java.lang.String str2 = java.lang.Integer.toUnsignedString(7489, 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "7489"+ "'", str2.equals("7489"));

  }

  @Test
  public void test076() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test076"); }


    java.lang.String str1 = java.lang.Integer.toBinaryString(268503106);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "10000000000010000100001000010"+ "'", str1.equals("10000000000010000100001000010"));

  }

  @Test
  public void test077() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test077"); }


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
    iP79.setFourth((java.lang.Integer)(-2147483620));
    boolean b85 = server62.removeBan(iP79);
    iP79.setFourth((java.lang.Integer)32768);
    java.lang.Integer i88 = iP79.getFourth();
    boolean b89 = server0.addException(iP79);
    iP79.setFirst((java.lang.Integer)2456);
    
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
    org.junit.Assert.assertTrue(b85 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i88 + "' != '" + 32768+ "'", i88.equals(32768));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b89 == true);

  }

  @Test
  public void test078() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test078"); }


    int i2 = java.lang.Integer.max(0, 1010);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1010);

  }

  @Test
  public void test079() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test079"); }


    java.lang.String str1 = java.lang.Integer.toUnsignedString(10010000);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "10010000"+ "'", str1.equals("10010000"));

  }

  @Test
  public void test080() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test080"); }


    int i1 = java.lang.Integer.numberOfLeadingZeros((-1609629696));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);

  }

  @Test
  public void test081() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test081"); }


    int i1 = java.lang.Integer.highestOneBit(321);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 256);

  }

  @Test
  public void test082() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test082"); }


    // The following exception was thrown during execution in test generation
    try {
      int i2 = java.lang.Integer.parseInt("", 18);
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test083() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test083"); }


    tp2.Server server0 = new tp2.Server();
    tp2.IP iP5 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b6 = server0.removeException(iP5);
    server0.update();
    tp2.Server server8 = new tp2.Server();
    tp2.IP iP13 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b14 = server8.removeException(iP13);
    java.lang.Integer i15 = iP13.getFirst();
    boolean b16 = server0.addBan(iP13);
    tp2.IPBan iPBan18 = new tp2.IPBan(iP13, (java.lang.Long)(-1L));
    tp2.IP iP19 = iPBan18.getIp();
    java.lang.Integer i20 = iP19.getFirst();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i15 + "' != '" + 161+ "'", i15.equals(161));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i20 + "' != '" + 161+ "'", i20.equals(161));

  }

  @Test
  public void test084() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test084"); }


    // The following exception was thrown during execution in test generation
    try {
      int i2 = java.lang.Integer.parseUnsignedInt("38", 38);
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test085() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test085"); }


    int i2 = java.lang.Integer.min(321, 1677721761);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 321);

  }

  @Test
  public void test086() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test086"); }


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
    java.lang.Long long16 = iPBan14.getExpires();
    tp2.Server server17 = new tp2.Server();
    tp2.IP iP22 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b23 = server17.removeException(iP22);
    server17.update();
    tp2.Server server25 = new tp2.Server();
    tp2.IP iP30 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b31 = server25.removeException(iP30);
    java.lang.Integer i32 = iP30.getFirst();
    boolean b33 = server17.addBan(iP30);
    iP30.setSecond((java.lang.Integer)83);
    iPBan14.setIp(iP30);
    iP30.setFourth((java.lang.Integer)16777216);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-1L)+ "'", long16.equals((-1L)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i32 + "' != '" + 161+ "'", i32.equals(161));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == true);

  }

  @Test
  public void test087() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test087"); }


    java.lang.String str1 = java.lang.Integer.toBinaryString(5832);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "1011011001000"+ "'", str1.equals("1011011001000"));

  }

  @Test
  public void test088() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test088"); }


    // The following exception was thrown during execution in test generation
    try {
      int i2 = java.lang.Integer.parseInt("11000000010000000000000000", 257691648);
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test089() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test089"); }


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
    tp2.IP iP45 = iPBan2.getIp();
    iPBan2.setExpires((java.lang.Long)(-1L));
    
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
    org.junit.Assert.assertNotNull(iP45);

  }

  @Test
  public void test090() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test090"); }


    tp2.IP iP4 = new tp2.IP((java.lang.Integer)448, (java.lang.Integer)841, (java.lang.Integer)1392508928, (java.lang.Integer)289406976);

  }

  @Test
  public void test091() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test091"); }


    // The following exception was thrown during execution in test generation
    try {
      int i2 = java.lang.Integer.parseUnsignedInt("458752", 7);
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

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test092"); }


    int i1 = java.lang.Integer.reverse((-439943169));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == (-40025));

  }

  @Test
  public void test093() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test093"); }


    long long1 = java.lang.Integer.toUnsignedLong((-1207959532));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == 3087007764L);

  }

  @Test
  public void test094() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test094"); }


    korat.finitization.IFinitization iFinitization1 = tp2.Server.finServer(15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iFinitization1);

  }

  @Test
  public void test095() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test095"); }


    // The following exception was thrown during execution in test generation
    try {
      java.lang.Integer i2 = java.lang.Integer.valueOf("b", 83);
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test096() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test096"); }


    int i2 = java.lang.Integer.rotateLeft(2362614, 186646533);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 75603648);

  }

  @Test
  public void test097() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test097"); }


    int i2 = java.lang.Integer.max(524432, 161);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 524432);

  }

  @Test
  public void test098() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test098"); }


    // The following exception was thrown during execution in test generation
    try {
      java.lang.Integer i1 = java.lang.Integer.decode("1100100000000000000000010100001");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test099() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test099"); }


    java.lang.Integer i3 = null;
    // The following exception was thrown during execution in test generation
    try {
      tp2.IP iP4 = new tp2.IP((java.lang.Integer)1072143, (java.lang.Integer)16777360, (java.lang.Integer)1, i3);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test100() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test100"); }


    int i2 = java.lang.Integer.rotateRight(3, 9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 25165824);

  }

  @Test
  public void test101() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test101"); }


    java.lang.String str1 = java.lang.Integer.toUnsignedString(32768);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "32768"+ "'", str1.equals("32768"));

  }

  @Test
  public void test102() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test102"); }


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
    tp2.IP iP35 = iPBan11.getIp();
    
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
    org.junit.Assert.assertNotNull(iP35);

  }

  @Test
  public void test103() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test103"); }


    tp2.IP iP0 = null;
    tp2.IPBan iPBan2 = new tp2.IPBan(iP0, (java.lang.Long)10L);
    tp2.IP iP3 = iPBan2.getIp();
    tp2.IP iP8 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    iP8.setFirst((java.lang.Integer)161);
    iP8.setThird((java.lang.Integer)3);
    iP8.setFirst((java.lang.Integer)26);
    iPBan2.ip = iP8;
    tp2.IP iP16 = iPBan2.getIp();
    java.lang.Long long17 = null;
    tp2.IPBan iPBan18 = new tp2.IPBan(iP16, long17);
    java.lang.Integer i19 = iP16.getFirst();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i19 + "' != '" + 26+ "'", i19.equals(26));

  }

  @Test
  public void test104() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test104"); }


    tp2.Server server0 = new tp2.Server();
    tp2.IP iP5 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b6 = server0.removeException(iP5);
    iP5.setThird((java.lang.Integer)56);
    tp2.IPBan iPBan10 = new tp2.IPBan(iP5, (java.lang.Long)2147483676L);
    java.lang.Long long11 = null;
    tp2.IPBan iPBan12 = new tp2.IPBan(iP5, long11);
    tp2.IP iP13 = iPBan12.ip;
    iPBan12.setExpires((java.lang.Long)2147483704L);
    java.lang.Long long16 = null;
    iPBan12.expires = long16;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP13);

  }

  @Test
  public void test105() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test105"); }


    tp2.IP iP4 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)32768, (java.lang.Integer)161, (java.lang.Integer)(-2147483646));
    iP4.setThird((java.lang.Integer)38000);

  }

  @Test
  public void test106() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test106"); }


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
    iP28.setThird((java.lang.Integer)26);
    
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
  public void test107() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test107"); }


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
    iP50.setSecond((java.lang.Integer)6);
    iP50.setSecond((java.lang.Integer)23);
    java.lang.Integer i59 = iP50.getFourth();
    
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
    org.junit.Assert.assertTrue("'" + i59 + "' != '" + 0+ "'", i59.equals(0));

  }

  @Test
  public void test108() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test108"); }


    java.lang.String str1 = java.lang.Integer.toUnsignedString(101);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "101"+ "'", str1.equals("101"));

  }

  @Test
  public void test109() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test109"); }


    tp2.IP iP0 = null;
    tp2.IPBan iPBan2 = new tp2.IPBan(iP0, (java.lang.Long)10L);
    java.lang.Long long3 = iPBan2.getExpires();
    tp2.IP iP4 = iPBan2.getIp();
    iPBan2.setExpires((java.lang.Long)100L);
    java.lang.Long long7 = iPBan2.expires;
    iPBan2.setExpires((java.lang.Long)2147483704L);
    tp2.IP iP14 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    java.lang.Integer i15 = iP14.getFirst();
    java.lang.Integer i16 = iP14.getFirst();
    java.lang.Integer i17 = iP14.getSecond();
    iPBan2.ip = iP14;
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
    java.lang.Integer i35 = iP31.getFirst();
    boolean b37 = iP31.equals((java.lang.Object)(short)(-1));
    tp2.IPBan iPBan39 = new tp2.IPBan(iP31, (java.lang.Long)2147483676L);
    tp2.IP iP44 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    iP44.setFirst((java.lang.Integer)161);
    iP44.setThird((java.lang.Integer)3);
    iP44.setFirst((java.lang.Integer)26);
    iP44.setFirst((java.lang.Integer)(-2147483592));
    java.lang.Long long53 = null;
    tp2.IPBan iPBan54 = new tp2.IPBan(iP44, long53);
    tp2.IP iP55 = iPBan54.getIp();
    tp2.IP iP56 = iPBan54.getIp();
    iPBan39.setIp(iP56);
    iP56.setFirst((java.lang.Integer)2000204102);
    iPBan2.ip = iP56;
    java.lang.Long long61 = iPBan2.expires;
    iPBan2.expires = 3L;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L+ "'", long3.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L+ "'", long7.equals(100L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i15 + "' != '" + 161+ "'", i15.equals(161));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i16 + "' != '" + 161+ "'", i16.equals(161));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i17 + "' != '" + (-2147483648)+ "'", i17.equals((-2147483648)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long23 + "' != '" + 10L+ "'", long23.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i33 + "' != '" + 161+ "'", i33.equals(161));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i35 + "' != '" + 161+ "'", i35.equals(161));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP55);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long61 + "' != '" + 2147483704L+ "'", long61.equals(2147483704L));

  }

  @Test
  public void test110() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test110"); }


    java.lang.String str1 = java.lang.Integer.toBinaryString(21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "10101"+ "'", str1.equals("10101"));

  }

  @Test
  public void test111() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test111"); }


    int i2 = java.lang.Integer.compare(31, 8388608);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == (-1));

  }

  @Test
  public void test112() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test112"); }


    int i2 = java.lang.Integer.remainderUnsigned(1073741824, (-2063597489));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1073741824);

  }

  @Test
  public void test113() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test113"); }


    tp2.IP iP0 = null;
    tp2.IPBan iPBan2 = new tp2.IPBan(iP0, (java.lang.Long)10L);
    tp2.IP iP3 = iPBan2.getIp();
    tp2.IP iP8 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    iP8.setFirst((java.lang.Integer)161);
    iP8.setThird((java.lang.Integer)3);
    iP8.setFirst((java.lang.Integer)26);
    iPBan2.ip = iP8;
    tp2.IP iP16 = iPBan2.getIp();
    tp2.IPBan iPBan18 = new tp2.IPBan(iP16, (java.lang.Long)291939L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP16);

  }

  @Test
  public void test114() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test114"); }


    int i2 = java.lang.Integer.compare(268503106, 277);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);

  }

  @Test
  public void test115() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test115"); }


    tp2.Server server0 = new tp2.Server();
    tp2.IP iP1 = null;
    boolean b2 = server0.connect(iP1);
    tp2.IP iP7 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)83, (java.lang.Integer)26, (java.lang.Integer)100);
    boolean b8 = server0.addBan(iP7);
    tp2.ITime iTime9 = null;
    server0.setTime(iTime9);
    tp2.Server server11 = new tp2.Server();
    tp2.IP iP16 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b17 = server11.removeException(iP16);
    iP16.setThird((java.lang.Integer)56);
    java.lang.Integer i20 = iP16.getFourth();
    tp2.IPBan iPBan22 = new tp2.IPBan(iP16, (java.lang.Long)10L);
    boolean b23 = server0.removeBan(iP16);
    server0.update();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i20 + "' != '" + 5+ "'", i20.equals(5));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);

  }

  @Test
  public void test116() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test116"); }


    int i2 = java.lang.Integer.remainderUnsigned(524288, 57344);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 8192);

  }

  @Test
  public void test117() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test117"); }


    int i2 = java.lang.Integer.compare(1170000000, 101011);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);

  }

  @Test
  public void test118() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test118"); }


    int i2 = java.lang.Integer.divideUnsigned(28672, 640);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 44);

  }

  @Test
  public void test119() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test119"); }


    int i2 = java.lang.Integer.min(1000110, 268503106);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1000110);

  }

  @Test
  public void test120() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test120"); }


    int i2 = java.lang.Integer.min(0, (-1560132651));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == (-1560132651));

  }

  @Test
  public void test121() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test121"); }


    int i2 = java.lang.Integer.min(532, 134217728);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 532);

  }

  @Test
  public void test122() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test122"); }


    int i1 = java.lang.Integer.parseUnsignedInt("100");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 100);

  }

  @Test
  public void test123() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test123"); }


    java.lang.Integer i1 = new java.lang.Integer(8388608);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 8388608+ "'", i1.equals(8388608));

  }

  @Test
  public void test124() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test124"); }


    int i2 = java.lang.Integer.compare(18, 80);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == (-1));

  }

  @Test
  public void test125() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test125"); }


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
    java.lang.Integer i49 = iP38.getFirst();
    
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
    org.junit.Assert.assertTrue("'" + i49 + "' != '" + 26+ "'", i49.equals(26));

  }

  @Test
  public void test126() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test126"); }


    // The following exception was thrown during execution in test generation
    try {
      int i2 = java.lang.Integer.parseUnsignedInt("502000053", 64);
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

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test127"); }


    java.lang.Integer i2 = java.lang.Integer.getInteger("30707074200", 41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i2 + "' != '" + 41+ "'", i2.equals(41));

  }

  @Test
  public void test128() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test128"); }


    int i2 = java.lang.Integer.remainderUnsigned(163387648, 461132125);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 163387648);

  }

  @Test
  public void test129() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test129"); }


    int i1 = java.lang.Integer.signum(1010000000);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 1);

  }

  @Test
  public void test130() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test130"); }


    java.lang.String str1 = java.lang.Integer.toBinaryString((-2063597456));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "10000101000000000000000001110000"+ "'", str1.equals("10000101000000000000000001110000"));

  }

  @Test
  public void test131() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test131"); }


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
    java.lang.Integer i42 = iP36.getFourth();
    iP36.setThird((java.lang.Integer)205440);
    
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
    org.junit.Assert.assertTrue("'" + i42 + "' != '" + 5+ "'", i42.equals(5));

  }

  @Test
  public void test132() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test132"); }


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
    org.junit.Assert.assertTrue("'" + long29 + "' != '" + 10L+ "'", long29.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long36 + "' != '" + 10L+ "'", long36.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b48 == true);

  }

  @Test
  public void test133() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test133"); }


    tp2.IP iP0 = null;
    tp2.IPBan iPBan2 = new tp2.IPBan(iP0, (java.lang.Long)10L);
    java.lang.Long long3 = iPBan2.getExpires();
    tp2.IP iP4 = iPBan2.getIp();
    iPBan2.setExpires((java.lang.Long)100L);
    java.lang.Long long7 = iPBan2.expires;
    iPBan2.setExpires((java.lang.Long)2147483704L);
    tp2.IP iP14 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    java.lang.Integer i15 = iP14.getFirst();
    java.lang.Integer i16 = iP14.getFirst();
    java.lang.Integer i17 = iP14.getSecond();
    iPBan2.ip = iP14;
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
    java.lang.Integer i35 = iP31.getFirst();
    boolean b37 = iP31.equals((java.lang.Object)(short)(-1));
    tp2.IPBan iPBan39 = new tp2.IPBan(iP31, (java.lang.Long)2147483676L);
    tp2.IP iP44 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    iP44.setFirst((java.lang.Integer)161);
    iP44.setThird((java.lang.Integer)3);
    iP44.setFirst((java.lang.Integer)26);
    iP44.setFirst((java.lang.Integer)(-2147483592));
    java.lang.Long long53 = null;
    tp2.IPBan iPBan54 = new tp2.IPBan(iP44, long53);
    tp2.IP iP55 = iPBan54.getIp();
    tp2.IP iP56 = iPBan54.getIp();
    iPBan39.setIp(iP56);
    iP56.setFirst((java.lang.Integer)2000204102);
    iPBan2.ip = iP56;
    tp2.IP iP61 = iPBan2.ip;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L+ "'", long3.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L+ "'", long7.equals(100L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i15 + "' != '" + 161+ "'", i15.equals(161));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i16 + "' != '" + 161+ "'", i16.equals(161));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i17 + "' != '" + (-2147483648)+ "'", i17.equals((-2147483648)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long23 + "' != '" + 10L+ "'", long23.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i33 + "' != '" + 161+ "'", i33.equals(161));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i35 + "' != '" + 161+ "'", i35.equals(161));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP55);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP61);

  }

  @Test
  public void test134() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test134"); }


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
    tp2.IP iP30 = iPBan29.getIp();
    java.lang.Long long31 = iPBan29.expires;
    tp2.Server server32 = new tp2.Server();
    tp2.IP iP37 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b38 = server32.removeException(iP37);
    java.lang.Integer i39 = iP37.getFirst();
    iPBan29.setIp(iP37);
    boolean b41 = server0.removeBan(iP37);
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
    tp2.IP iP71 = new tp2.IP((java.lang.Integer)2147483647, (java.lang.Integer)(-1), (java.lang.Integer)56, (java.lang.Integer)458752);
    boolean b72 = server42.addException(iP71);
    iP71.setFirst((java.lang.Integer)14);
    java.lang.Integer i75 = iP71.getThird();
    iP71.setThird((java.lang.Integer)100);
    boolean b78 = server0.addBan(iP71);
    tp2.IPBan iPBan80 = new tp2.IPBan(iP71, (java.lang.Long)64L);
    
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
    org.junit.Assert.assertNull(iP30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long31 + "' != '" + 10L+ "'", long31.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i39 + "' != '" + 161+ "'", i39.equals(161));
    
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
    org.junit.Assert.assertTrue(b72 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i75 + "' != '" + 56+ "'", i75.equals(56));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b78 == true);

  }

  @Test
  public void test135() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test135"); }


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
    tp2.IP iP48 = iPBan45.getIp();
    java.lang.Long long49 = iPBan45.getExpires();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long49 + "' != '" + 2013262563L+ "'", long49.equals(2013262563L));

  }

  @Test
  public void test136() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test136"); }


    tp2.IP iP0 = null;
    tp2.IPBan iPBan2 = new tp2.IPBan(iP0, (java.lang.Long)10L);
    java.lang.Long long3 = iPBan2.getExpires();
    tp2.IP iP4 = iPBan2.getIp();
    tp2.IP iP5 = iPBan2.ip;
    java.lang.Long long6 = iPBan2.expires;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L+ "'", long3.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L+ "'", long6.equals(10L));

  }

  @Test
  public void test137() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test137"); }


    tp2.Server server0 = new tp2.Server();
    tp2.IP iP1 = null;
    boolean b2 = server0.addBan(iP1);
    tp2.IP iP7 = new tp2.IP((java.lang.Integer)31, (java.lang.Integer)31, (java.lang.Integer)31, (java.lang.Integer)0);
    iP7.setSecond((java.lang.Integer)2147483647);
    boolean b10 = server0.addBan(iP7);
    tp2.IP iP15 = new tp2.IP((java.lang.Integer)133, (java.lang.Integer)(-2147483515), (java.lang.Integer)79, (java.lang.Integer)(-2147483620));
    boolean b16 = server0.removeBan(iP15);
    iP15.setFourth((java.lang.Integer)59000028);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);

  }

  @Test
  public void test138() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test138"); }


    java.lang.Integer i2 = java.lang.Integer.getInteger("1107820544", 180224);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i2 + "' != '" + 180224+ "'", i2.equals(180224));

  }

  @Test
  public void test139() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test139"); }


    int i1 = java.lang.Integer.highestOneBit(20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 16);

  }

  @Test
  public void test140() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test140"); }


    java.lang.Integer i1 = null;
    // The following exception was thrown during execution in test generation
    try {
      tp2.IP iP4 = new tp2.IP((java.lang.Integer)1170000000, i1, (java.lang.Integer)2048, (java.lang.Integer)180224);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test141() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test141"); }


    long long1 = java.lang.Integer.toUnsignedLong((-536281088));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == 3758686208L);

  }

  @Test
  public void test142() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test142"); }


    // The following exception was thrown during execution in test generation
    try {
      int i2 = java.lang.Integer.parseUnsignedInt("10100001011001000000000000000000", (-1));
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test143() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test143"); }


    java.lang.String str1 = java.lang.Integer.toUnsignedString(536870931);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "536870931"+ "'", str1.equals("536870931"));

  }

  @Test
  public void test144() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test144"); }


    // The following exception was thrown during execution in test generation
    try {
      int i2 = java.lang.Integer.parseUnsignedInt("hi!", 260);
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test145() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test145"); }


    int i1 = java.lang.Integer.lowestOneBit(1493172585);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 1);

  }

  @Test
  public void test146() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test146"); }


    java.lang.String str1 = java.lang.Integer.toOctalString(38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "46"+ "'", str1.equals("46"));

  }

  @Test
  public void test147() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test147"); }


    int i2 = java.lang.Integer.sum((-2147436052), 2621440);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == (-2144814612));

  }

  @Test
  public void test148() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test148"); }


    java.lang.String str2 = java.lang.Integer.toUnsignedString((-2080374703), 630);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "2214592593"+ "'", str2.equals("2214592593"));

  }

  @Test
  public void test149() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test149"); }


    java.lang.String str1 = java.lang.Integer.toOctalString(60408026);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "346340332"+ "'", str1.equals("346340332"));

  }

  @Test
  public void test150() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test150"); }


    korat.finitization.IFinitization iFinitization1 = tp2.Server.finServer((-1916010497));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iFinitization1);

  }

  @Test
  public void test151() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test151"); }


    // The following exception was thrown during execution in test generation
    try {
      int i2 = java.lang.Integer.parseInt("4000000", 1023410176);
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

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test152"); }


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
    tp2.IP iP40 = new tp2.IP((java.lang.Integer)2147483647, (java.lang.Integer)(-1), (java.lang.Integer)56, (java.lang.Integer)458752);
    tp2.IPBan iPBan42 = new tp2.IPBan(iP40, (java.lang.Long)2147483676L);
    java.lang.Long long43 = iPBan42.expires;
    java.lang.Long long44 = iPBan42.expires;
    tp2.IP iP45 = iPBan42.getIp();
    tp2.IPBan iPBan47 = new tp2.IPBan(iP45, (java.lang.Long)2147483704L);
    java.lang.Integer i48 = iP45.getFourth();
    boolean b49 = server0.removeException(iP45);
    tp2.Server server50 = new tp2.Server();
    tp2.IP iP51 = null;
    boolean b52 = server50.connect(iP51);
    tp2.IP iP53 = null;
    tp2.IPBan iPBan55 = new tp2.IPBan(iP53, (java.lang.Long)10L);
    java.lang.Long long56 = iPBan55.getExpires();
    tp2.IP iP61 = new tp2.IP((java.lang.Integer)31, (java.lang.Integer)31, (java.lang.Integer)31, (java.lang.Integer)0);
    iPBan55.ip = iP61;
    tp2.Server server63 = new tp2.Server();
    tp2.IP iP68 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b69 = server63.removeException(iP68);
    server63.update();
    tp2.Server server71 = new tp2.Server();
    tp2.IP iP76 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b77 = server71.removeException(iP76);
    java.lang.Integer i78 = iP76.getFirst();
    boolean b79 = server63.addBan(iP76);
    iPBan55.setIp(iP76);
    boolean b81 = server50.removeException(iP76);
    iP76.setFirst((java.lang.Integer)67108864);
    boolean b84 = server0.connect(iP76);
    
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
    org.junit.Assert.assertTrue("'" + long43 + "' != '" + 2147483676L+ "'", long43.equals(2147483676L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long44 + "' != '" + 2147483676L+ "'", long44.equals(2147483676L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i48 + "' != '" + 458752+ "'", i48.equals(458752));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b49 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b52 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long56 + "' != '" + 10L+ "'", long56.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b69 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b77 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i78 + "' != '" + 161+ "'", i78.equals(161));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b79 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b81 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b84 == true);

  }

  @Test
  public void test153() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test153"); }


    java.lang.Integer i2 = java.lang.Integer.getInteger("1001100000000000000000000000001", (java.lang.Integer)75827200);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i2 + "' != '" + 75827200+ "'", i2.equals(75827200));

  }

  @Test
  public void test154() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test154"); }


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
    boolean b51 = iP46.equals((java.lang.Object)"112160");
    iP46.setFourth((java.lang.Integer)79);
    
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
    org.junit.Assert.assertTrue(b51 == false);

  }

  @Test
  public void test155() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test155"); }


    java.lang.String str1 = java.lang.Integer.toHexString(700000);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "aae60"+ "'", str1.equals("aae60"));

  }

  @Test
  public void test156() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test156"); }


    int i2 = java.lang.Integer.rotateLeft((-1557978496), 163387648);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == (-1557978496));

  }

  @Test
  public void test157() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test157"); }


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
    tp2.IP iP20 = iPBan2.ip;
    iPBan2.setExpires((java.lang.Long)1493172585L);
    
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
    org.junit.Assert.assertNotNull(iP20);

  }

  @Test
  public void test158() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test158"); }


    java.lang.Integer i1 = java.lang.Integer.getInteger("320");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);

  }

  @Test
  public void test159() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test159"); }


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
    server0.update();
    tp2.IP iP25 = null;
    tp2.IPBan iPBan27 = new tp2.IPBan(iP25, (java.lang.Long)10L);
    tp2.IP iP28 = iPBan27.getIp();
    tp2.IP iP33 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    iP33.setFirst((java.lang.Integer)161);
    iP33.setThird((java.lang.Integer)3);
    iP33.setFirst((java.lang.Integer)26);
    iPBan27.ip = iP33;
    tp2.IP iP41 = iPBan27.getIp();
    tp2.Server server42 = new tp2.Server();
    tp2.IP iP43 = null;
    boolean b44 = server42.addBan(iP43);
    server42.update();
    tp2.IP iP50 = new tp2.IP((java.lang.Integer)31, (java.lang.Integer)31, (java.lang.Integer)31, (java.lang.Integer)0);
    boolean b51 = server42.removeBan(iP50);
    server42.update();
    tp2.IP iP57 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    iP57.setFirst((java.lang.Integer)161);
    iP57.setThird((java.lang.Integer)3);
    iP57.setFirst((java.lang.Integer)26);
    iP57.setFirst((java.lang.Integer)(-2147483592));
    boolean b66 = server42.removeBan(iP57);
    iPBan27.ip = iP57;
    tp2.IP iP68 = iPBan27.ip;
    java.lang.Integer i69 = iP68.getFirst();
    java.lang.Integer i70 = iP68.getFourth();
    boolean b71 = server0.connect(iP68);
    
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
    org.junit.Assert.assertNull(iP28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b51 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b66 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP68);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i69 + "' != '" + (-2147483592)+ "'", i69.equals((-2147483592)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i70 + "' != '" + 5+ "'", i70.equals(5));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b71 == true);

  }

  @Test
  public void test160() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test160"); }


    int i1 = java.lang.Integer.lowestOneBit(1677721600);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 67108864);

  }

  @Test
  public void test161() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test161"); }


    int i2 = java.lang.Integer.rotateLeft(34288, 1112);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == (-268435323));

  }

  @Test
  public void test162() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test162"); }


    int i2 = java.lang.Integer.compareUnsigned(160, 20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);

  }

  @Test
  public void test163() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test163"); }


    java.lang.Integer i1 = new java.lang.Integer(4096);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 4096+ "'", i1.equals(4096));

  }

  @Test
  public void test164() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test164"); }


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
    iPBan20.setExpires((java.lang.Long)4074995711L);
    iPBan20.expires = 4160749568L;
    
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
  public void test165() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test165"); }


    int i1 = java.lang.Integer.lowestOneBit(1400000);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 64);

  }

  @Test
  public void test166() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test166"); }


    // The following exception was thrown during execution in test generation
    try {
      int i2 = java.lang.Integer.parseUnsignedInt("13344223332131", 32768);
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

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test167"); }


    int i2 = java.lang.Integer.remainderUnsigned(56, 1689255936);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 56);

  }

  @Test
  public void test168() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test168"); }


    int i1 = java.lang.Integer.bitCount(4897831);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 12);

  }

  @Test
  public void test169() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test169"); }


    int i2 = java.lang.Integer.rotateLeft(1600000, (-40025));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 204800000);

  }

  @Test
  public void test170() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test170"); }


    int i2 = java.lang.Integer.compareUnsigned(1000000012, 6024346);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);

  }

  @Test
  public void test171() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test171"); }


    java.lang.String str2 = java.lang.Integer.toUnsignedString(28, 64);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "28"+ "'", str2.equals("28"));

  }

  @Test
  public void test172() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test172"); }


    java.lang.Integer i2 = java.lang.Integer.getInteger("600000000", (java.lang.Integer)160);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i2 + "' != '" + 160+ "'", i2.equals(160));

  }

  @Test
  public void test173() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test173"); }


    tp2.IP iP0 = null;
    tp2.IPBan iPBan2 = new tp2.IPBan(iP0, (java.lang.Long)10L);
    java.lang.Long long3 = iPBan2.getExpires();
    tp2.IP iP4 = iPBan2.getIp();
    iPBan2.setExpires((java.lang.Long)100L);
    java.lang.Long long7 = iPBan2.expires;
    iPBan2.setExpires((java.lang.Long)35320L);
    tp2.IP iP10 = iPBan2.ip;
    tp2.IP iP11 = iPBan2.ip;
    java.lang.Long long12 = iPBan2.expires;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L+ "'", long3.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L+ "'", long7.equals(100L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long12 + "' != '" + 35320L+ "'", long12.equals(35320L));

  }

  @Test
  public void test174() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test174"); }


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
    tp2.IP iP33 = new tp2.IP((java.lang.Integer)229376, (java.lang.Integer)2147480291, (java.lang.Integer)144, (java.lang.Integer)939524096);
    boolean b34 = server0.removeBan(iP33);
    iP33.setSecond((java.lang.Integer)80000085);
    java.lang.Integer i37 = iP33.getFourth();
    java.lang.Object obj38 = null;
    boolean b39 = iP33.equals(obj38);
    java.lang.Integer i40 = iP33.getThird();
    
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
    org.junit.Assert.assertTrue(b34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i37 + "' != '" + 939524096+ "'", i37.equals(939524096));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i40 + "' != '" + 144+ "'", i40.equals(144));

  }

  @Test
  public void test175() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test175"); }


    tp2.IP iP0 = null;
    tp2.IPBan iPBan2 = new tp2.IPBan(iP0, (java.lang.Long)10L);
    tp2.IP iP3 = iPBan2.getIp();
    tp2.IP iP8 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    iP8.setFirst((java.lang.Integer)161);
    iP8.setThird((java.lang.Integer)3);
    iP8.setFirst((java.lang.Integer)26);
    iPBan2.ip = iP8;
    boolean b17 = iP8.equals((java.lang.Object)28L);
    java.lang.Integer i18 = iP8.getFourth();
    java.lang.Integer i19 = iP8.getThird();
    iP8.setSecond((java.lang.Integer)9861);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i18 + "' != '" + 5+ "'", i18.equals(5));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i19 + "' != '" + 3+ "'", i19.equals(3));

  }

  @Test
  public void test176() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test176"); }


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
    tp2.Server server39 = new tp2.Server();
    tp2.IP iP40 = null;
    boolean b41 = server39.addBan(iP40);
    server39.update();
    tp2.IP iP47 = new tp2.IP((java.lang.Integer)31, (java.lang.Integer)31, (java.lang.Integer)31, (java.lang.Integer)0);
    boolean b48 = server39.removeBan(iP47);
    server39.update();
    tp2.IP iP54 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    iP54.setFirst((java.lang.Integer)161);
    iP54.setThird((java.lang.Integer)3);
    iP54.setFirst((java.lang.Integer)26);
    iP54.setFirst((java.lang.Integer)(-2147483592));
    boolean b63 = server39.removeBan(iP54);
    boolean b64 = server0.removeException(iP54);
    iP54.setFourth((java.lang.Integer)10);
    
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
    org.junit.Assert.assertTrue(b41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b48 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b63 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b64 == false);

  }

  @Test
  public void test177() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test177"); }


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
    tp2.ITime iTime29 = null;
    server0.setTime(iTime29);
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
    iP48.setFourth((java.lang.Integer)(-2147483620));
    boolean b54 = server31.removeBan(iP48);
    java.lang.Integer i55 = iP48.getSecond();
    boolean b56 = server0.removeBan(iP48);
    iP48.setSecond((java.lang.Integer)524288);
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
    iP71.setFourth((java.lang.Integer)(-2147483620));
    tp2.IPBan iPBan78 = new tp2.IPBan(iP71, (java.lang.Long)(-1L));
    boolean b79 = iP48.equals((java.lang.Object)(-1L));
    iP48.setSecond((java.lang.Integer)1073741825);
    iP48.setSecond((java.lang.Integer)(-1593835520));
    iP48.setThird((java.lang.Integer)218103808);
    
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
    org.junit.Assert.assertTrue(b54 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i55 + "' != '" + (-2147483648)+ "'", i55.equals((-2147483648)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b56 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP62);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long63 + "' != '" + 10L+ "'", long63.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b72 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i73 + "' != '" + 161+ "'", i73.equals(161));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b79 == false);

  }

  @Test
  public void test178() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test178"); }


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
    tp2.IP iP83 = iPBan69.getIp();
    iPBan69.setExpires((java.lang.Long)2701131776L);
    tp2.IP iP86 = iPBan69.getIp();
    boolean b87 = server0.addException(iP86);
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP70);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long71 + "' != '" + 10L+ "'", long71.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b80 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i81 + "' != '" + 161+ "'", i81.equals(161));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP83);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP86);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b87 == true);

  }

  @Test
  public void test179() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test179"); }


    // The following exception was thrown during execution in test generation
    try {
      int i1 = java.lang.Integer.parseUnsignedInt("1110111001110001011000101000110");
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

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test180"); }


    java.lang.String str1 = java.lang.Integer.toHexString((-1744830464));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "98000000"+ "'", str1.equals("98000000"));

  }

  @Test
  public void test181() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test181"); }


    java.lang.Integer i1 = new java.lang.Integer(1643520640);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 1643520640+ "'", i1.equals(1643520640));

  }

  @Test
  public void test182() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test182"); }


    tp2.Server server0 = new tp2.Server();
    tp2.IP iP5 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b6 = server0.removeException(iP5);
    server0.update();
    tp2.Server server8 = new tp2.Server();
    tp2.IP iP13 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b14 = server8.removeException(iP13);
    java.lang.Integer i15 = iP13.getFirst();
    boolean b16 = server0.addBan(iP13);
    tp2.IPBan iPBan18 = new tp2.IPBan(iP13, (java.lang.Long)(-1L));
    tp2.IP iP19 = iPBan18.getIp();
    java.lang.Long long20 = iPBan18.expires;
    iPBan18.setExpires((java.lang.Long)458752L);
    tp2.IP iP27 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    iP27.setFirst((java.lang.Integer)161);
    boolean b31 = iP27.equals((java.lang.Object)56);
    java.lang.Integer i32 = iP27.getFirst();
    iPBan18.ip = iP27;
    java.lang.Integer i34 = iP27.getSecond();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i15 + "' != '" + 161+ "'", i15.equals(161));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-1L)+ "'", long20.equals((-1L)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i32 + "' != '" + 161+ "'", i32.equals(161));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i34 + "' != '" + (-2147483648)+ "'", i34.equals((-2147483648)));

  }

  @Test
  public void test183() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test183"); }


    long long1 = java.lang.Integer.toUnsignedLong((-2147483515));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == 2147483781L);

  }

  @Test
  public void test184() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test184"); }


    int i2 = java.lang.Integer.min(35, 64000000);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 35);

  }

  @Test
  public void test185() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test185"); }


    int i1 = java.lang.Integer.lowestOneBit(3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 1);

  }

  @Test
  public void test186() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test186"); }


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
    tp2.Server server36 = new tp2.Server();
    tp2.IP iP37 = null;
    boolean b38 = server36.addBan(iP37);
    tp2.IP iP43 = new tp2.IP((java.lang.Integer)31, (java.lang.Integer)31, (java.lang.Integer)31, (java.lang.Integer)0);
    iP43.setSecond((java.lang.Integer)2147483647);
    boolean b46 = server36.addBan(iP43);
    iP43.setFirst((java.lang.Integer)939524096);
    java.lang.Integer i49 = iP43.getSecond();
    iP43.setFirst((java.lang.Integer)18000000);
    boolean b52 = server0.addBan(iP43);
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
    tp2.IP iP69 = iPBan55.getIp();
    iP69.setFirst((java.lang.Integer)6);
    boolean b73 = iP69.equals((java.lang.Object)469761943);
    boolean b74 = server0.removeBan(iP69);
    
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
    org.junit.Assert.assertTrue(b38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b46 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i49 + "' != '" + 2147483647+ "'", i49.equals(2147483647));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b52 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long57 + "' != '" + 10L+ "'", long57.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b66 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i67 + "' != '" + 161+ "'", i67.equals(161));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP69);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b73 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b74 == false);

  }

  @Test
  public void test187() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test187"); }


    int i2 = java.lang.Integer.min(61, 2031690);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 61);

  }

  @Test
  public void test188() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test188"); }


    java.lang.Integer i1 = java.lang.Integer.valueOf(1879048192);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 1879048192+ "'", i1.equals(1879048192));

  }

  @Test
  public void test189() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test189"); }


    int i2 = java.lang.Integer.remainderUnsigned(120180, 536870926);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 120180);

  }

  @Test
  public void test190() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test190"); }


    int i1 = java.lang.Integer.signum((-2063597456));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == (-1));

  }

  @Test
  public void test191() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test191"); }


    int i1 = java.lang.Integer.reverseBytes(458752);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 1792);

  }

  @Test
  public void test192() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test192"); }


    int i2 = java.lang.Integer.divideUnsigned(1879048192, 352321536);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 5);

  }

  @Test
  public void test193() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test193"); }


    java.lang.Integer i1 = new java.lang.Integer("1108377608");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 1108377608+ "'", i1.equals(1108377608));

  }

  @Test
  public void test194() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test194"); }


    // The following exception was thrown during execution in test generation
    try {
      int i2 = java.lang.Integer.parseInt("508002b", 1437910020);
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test195() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test195"); }


    // The following exception was thrown during execution in test generation
    try {
      int i2 = java.lang.Integer.parseUnsignedInt("2031616", 11024899);
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test196() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test196"); }


    java.lang.String str2 = java.lang.Integer.toUnsignedString((-671088629), 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "3623878667"+ "'", str2.equals("3623878667"));

  }

  @Test
  public void test197() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test197"); }


    // The following exception was thrown during execution in test generation
    try {
      int i1 = java.lang.Integer.parseUnsignedInt("aae60");
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

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test198"); }


    tp2.IP iP0 = null;
    tp2.IPBan iPBan2 = new tp2.IPBan(iP0, (java.lang.Long)10L);
    java.lang.Long long3 = iPBan2.getExpires();
    java.lang.Long long4 = iPBan2.expires;
    iPBan2.expires = 4160749568L;
    tp2.IP iP7 = iPBan2.getIp();
    tp2.IP iP8 = iPBan2.getIp();
    java.lang.Long long9 = iPBan2.expires;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L+ "'", long3.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L+ "'", long4.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long9 + "' != '" + 4160749568L+ "'", long9.equals(4160749568L));

  }

  @Test
  public void test199() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test199"); }


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
    tp2.IP iP44 = iPBan30.getIp();
    tp2.Server server45 = new tp2.Server();
    tp2.IP iP46 = null;
    boolean b47 = server45.addBan(iP46);
    tp2.IP iP52 = new tp2.IP((java.lang.Integer)31, (java.lang.Integer)31, (java.lang.Integer)31, (java.lang.Integer)0);
    iP52.setSecond((java.lang.Integer)2147483647);
    boolean b55 = server45.addBan(iP52);
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
    boolean b78 = server45.removeBan(iP73);
    tp2.IP iP83 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    iP83.setFirst((java.lang.Integer)161);
    boolean b87 = iP83.equals((java.lang.Object)56);
    boolean b88 = server45.removeException(iP83);
    boolean b89 = iP44.equals((java.lang.Object)b88);
    boolean b90 = server0.removeException(iP44);
    iP44.setThird((java.lang.Integer)100000);
    
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
    org.junit.Assert.assertNull(iP31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long32 + "' != '" + 10L+ "'", long32.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i42 + "' != '" + 161+ "'", i42.equals(161));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b47 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b55 == true);
    
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
    org.junit.Assert.assertTrue(b78 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b87 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b88 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b89 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b90 == false);

  }

  @Test
  public void test200() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test200"); }


    int i1 = java.lang.Integer.reverse((-2147335211));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == (-1413332991));

  }

  @Test
  public void test201() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test201"); }


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
    boolean b54 = server0.addException(iP46);
    tp2.Server server55 = new tp2.Server();
    tp2.IP iP60 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b61 = server55.removeException(iP60);
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
    iP79.setFourth((java.lang.Integer)(-2147483620));
    boolean b85 = server62.removeBan(iP79);
    java.lang.Integer i86 = iP79.getSecond();
    iP79.setSecond((java.lang.Integer)(-1879048192));
    boolean b89 = server55.addBan(iP79);
    boolean b90 = server0.removeBan(iP79);
    server0.update();
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
    org.junit.Assert.assertTrue(b54 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b61 == false);
    
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
    org.junit.Assert.assertTrue(b85 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i86 + "' != '" + (-2147483648)+ "'", i86.equals((-2147483648)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b89 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b90 == false);

  }

  @Test
  public void test202() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test202"); }


    java.lang.Integer i1 = java.lang.Integer.valueOf(133);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 133+ "'", i1.equals(133));

  }

  @Test
  public void test203() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test203"); }


    java.lang.Integer i2 = java.lang.Integer.getInteger("3623878667", 101);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i2 + "' != '" + 101+ "'", i2.equals(101));

  }

  @Test
  public void test204() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test204"); }


    int i1 = java.lang.Integer.highestOneBit((-1744830464));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == (-2147483648));

  }

  @Test
  public void test205() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test205"); }


    int i1 = java.lang.Integer.numberOfTrailingZeros(14379100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 2);

  }

  @Test
  public void test206() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test206"); }


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
    iPBan2.setExpires((java.lang.Long)2147483676L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L+ "'", long4.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L)+ "'", long9.equals((-1L)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP10);

  }

  @Test
  public void test207() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test207"); }


    int i2 = java.lang.Integer.divideUnsigned(1245184, 1677721600);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);

  }

  @Test
  public void test208() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test208"); }


    java.lang.Integer i1 = java.lang.Integer.valueOf(402653184);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 402653184+ "'", i1.equals(402653184));

  }

  @Test
  public void test209() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test209"); }


    long long1 = java.lang.Integer.toUnsignedLong(469761943);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == 469761943L);

  }

  @Test
  public void test210() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test210"); }


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
    tp2.ITime iTime75 = null;
    server0.setTime(iTime75);
    server0.update();
    
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
  public void test211() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test211"); }


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
    iP19.setSecond((java.lang.Integer)0);
    java.lang.Integer i28 = iP19.getThird();
    
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
    org.junit.Assert.assertTrue("'" + i28 + "' != '" + 939524096+ "'", i28.equals(939524096));

  }

  @Test
  public void test212() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test212"); }


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
    tp2.ITime iTime23 = null;
    server0.setTime(iTime23);
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
    tp2.IP iP41 = iPBan27.getIp();
    iPBan27.setExpires((java.lang.Long)2701131776L);
    tp2.IP iP44 = iPBan27.getIp();
    java.lang.Integer i45 = iP44.getFirst();
    java.lang.Integer i46 = iP44.getFirst();
    boolean b47 = server0.addException(iP44);
    
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
    org.junit.Assert.assertNull(iP28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long29 + "' != '" + 10L+ "'", long29.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i39 + "' != '" + 161+ "'", i39.equals(161));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i45 + "' != '" + 161+ "'", i45.equals(161));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i46 + "' != '" + 161+ "'", i46.equals(161));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b47 == true);

  }

  @Test
  public void test213() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test213"); }


    // The following exception was thrown during execution in test generation
    try {
      java.lang.Integer i2 = java.lang.Integer.valueOf("31200000000", 2082996226);
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test214() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test214"); }


    // The following exception was thrown during execution in test generation
    try {
      java.lang.Integer i1 = java.lang.Integer.decode("24131000000");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test215() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test215"); }


    // The following exception was thrown during execution in test generation
    try {
      int i2 = java.lang.Integer.parseUnsignedInt("1108377608", 71554675);
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

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test216"); }


    tp2.IP iP0 = null;
    tp2.IPBan iPBan2 = new tp2.IPBan(iP0, (java.lang.Long)10L);
    tp2.IP iP3 = iPBan2.getIp();
    java.lang.Long long4 = iPBan2.expires;
    tp2.IP iP5 = null;
    iPBan2.ip = iP5;
    tp2.IP iP7 = null;
    tp2.IPBan iPBan9 = new tp2.IPBan(iP7, (java.lang.Long)10L);
    tp2.IP iP10 = iPBan9.getIp();
    java.lang.Long long11 = iPBan9.expires;
    tp2.Server server12 = new tp2.Server();
    tp2.IP iP17 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b18 = server12.removeException(iP17);
    java.lang.Integer i19 = iP17.getFirst();
    iPBan9.setIp(iP17);
    tp2.IP iP21 = iPBan9.ip;
    tp2.IP iP22 = iPBan9.getIp();
    iPBan2.setIp(iP22);
    tp2.IP iP28 = new tp2.IP((java.lang.Integer)31, (java.lang.Integer)(-2147483592), (java.lang.Integer)133, (java.lang.Integer)(-2147483646));
    iPBan2.setIp(iP28);
    iP28.setFirst((java.lang.Integer)(-717028736));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L+ "'", long4.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long11 + "' != '" + 10L+ "'", long11.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i19 + "' != '" + 161+ "'", i19.equals(161));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP22);

  }

  @Test
  public void test217() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test217"); }


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
    tp2.IP iP43 = iPBan2.getIp();
    iPBan2.expires = 28L;
    iPBan2.setExpires((java.lang.Long)61L);
    tp2.IP iP48 = iPBan2.ip;
    
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
    org.junit.Assert.assertNotNull(iP43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP48);

  }

  @Test
  public void test218() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test218"); }


    tp2.Server server0 = new tp2.Server();
    tp2.IP iP1 = null;
    boolean b2 = server0.addBan(iP1);
    tp2.IP iP7 = new tp2.IP((java.lang.Integer)31, (java.lang.Integer)31, (java.lang.Integer)31, (java.lang.Integer)0);
    iP7.setSecond((java.lang.Integer)2147483647);
    boolean b10 = server0.addBan(iP7);
    tp2.Server server11 = new tp2.Server();
    tp2.IP iP16 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b17 = server11.removeException(iP16);
    iP16.setThird((java.lang.Integer)56);
    java.lang.Integer i20 = iP16.getFourth();
    tp2.IPBan iPBan22 = new tp2.IPBan(iP16, (java.lang.Long)10L);
    java.lang.Long long23 = iPBan22.expires;
    tp2.Server server24 = new tp2.Server();
    tp2.IP iP25 = null;
    boolean b26 = server24.addBan(iP25);
    tp2.IP iP31 = new tp2.IP((java.lang.Integer)31, (java.lang.Integer)31, (java.lang.Integer)31, (java.lang.Integer)0);
    iP31.setSecond((java.lang.Integer)2147483647);
    boolean b34 = server24.addBan(iP31);
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
    boolean b57 = server24.removeBan(iP52);
    tp2.IP iP62 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    iP62.setFirst((java.lang.Integer)161);
    iP62.setThird((java.lang.Integer)3);
    iP62.setFirst((java.lang.Integer)26);
    iP62.setThird((java.lang.Integer)5);
    boolean b71 = server24.removeBan(iP62);
    java.lang.Object obj72 = null;
    boolean b73 = iP62.equals(obj72);
    iPBan22.setIp(iP62);
    tp2.IP iP75 = iPBan22.getIp();
    boolean b76 = server0.addBan(iP75);
    tp2.IP iP81 = new tp2.IP((java.lang.Integer)26, (java.lang.Integer)51200, (java.lang.Integer)13, (java.lang.Integer)1342177288);
    boolean b82 = server0.addException(iP81);
    iP81.setFirst((java.lang.Integer)100000);
    java.lang.Integer i85 = null;
    iP81.setFourth(i85);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i20 + "' != '" + 5+ "'", i20.equals(5));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long23 + "' != '" + 10L+ "'", long23.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
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
    org.junit.Assert.assertTrue(b56 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b57 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b71 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b73 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP75);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b76 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b82 == true);

  }

  @Test
  public void test219() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test219"); }


    java.lang.Integer i1 = java.lang.Integer.decode("11001");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 11001+ "'", i1.equals(11001));

  }

  @Test
  public void test220() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test220"); }


    tp2.IP iP4 = new tp2.IP((java.lang.Integer)448, (java.lang.Integer)16, (java.lang.Integer)640, (java.lang.Integer)163387718);

  }

  @Test
  public void test221() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test221"); }


    java.lang.Integer i1 = java.lang.Integer.getInteger("111101");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);

  }

  @Test
  public void test222() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test222"); }


    java.lang.Integer i1 = new java.lang.Integer(1344);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 1344+ "'", i1.equals(1344));

  }

  @Test
  public void test223() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test223"); }


    long long1 = java.lang.Integer.toUnsignedLong(1325400064);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == 1325400064L);

  }

  @Test
  public void test224() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test224"); }


    int i2 = java.lang.Integer.max(100004, 1493172264);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1493172264);

  }

  @Test
  public void test225() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test225"); }


    // The following exception was thrown during execution in test generation
    try {
      java.lang.Integer i2 = java.lang.Integer.valueOf("3400000000", 234881056);
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test226() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test226"); }


    java.lang.String str2 = java.lang.Integer.toUnsignedString((-1342174080), 101);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "2952793216"+ "'", str2.equals("2952793216"));

  }

  @Test
  public void test227() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test227"); }


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
    iP28.setFourth((java.lang.Integer)(-2147483620));
    boolean b34 = server11.removeBan(iP28);
    java.lang.Integer i35 = iP28.getFirst();
    java.lang.Integer i36 = iP28.getSecond();
    tp2.IPBan iPBan38 = new tp2.IPBan(iP28, (java.lang.Long)0L);
    boolean b39 = server0.addException(iP28);
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
    tp2.ITime iTime65 = null;
    server40.setTime(iTime65);
    tp2.IP iP67 = null;
    tp2.IPBan iPBan69 = new tp2.IPBan(iP67, (java.lang.Long)10L);
    tp2.IP iP70 = iPBan69.getIp();
    java.lang.Long long71 = iPBan69.expires;
    tp2.Server server72 = new tp2.Server();
    tp2.IP iP77 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b78 = server72.removeException(iP77);
    java.lang.Integer i79 = iP77.getFirst();
    iPBan69.setIp(iP77);
    boolean b81 = server40.removeBan(iP77);
    iP77.setFirst((java.lang.Integer)186646533);
    boolean b85 = iP77.equals((java.lang.Object)469762049);
    iP77.setFourth((java.lang.Integer)7);
    boolean b88 = server0.removeBan(iP77);
    
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
    org.junit.Assert.assertTrue(b34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i35 + "' != '" + 161+ "'", i35.equals(161));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i36 + "' != '" + (-2147483648)+ "'", i36.equals((-2147483648)));
    
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
    org.junit.Assert.assertTrue(b64 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP70);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long71 + "' != '" + 10L+ "'", long71.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b78 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i79 + "' != '" + 161+ "'", i79.equals(161));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b81 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b85 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b88 == false);

  }

  @Test
  public void test228() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test228"); }


    java.lang.Integer i1 = java.lang.Integer.valueOf((-1879048031));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + (-1879048031)+ "'", i1.equals((-1879048031)));

  }

  @Test
  public void test229() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test229"); }


    java.lang.Integer i1 = new java.lang.Integer(24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 24+ "'", i1.equals(24));

  }

  @Test
  public void test230() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test230"); }


    tp2.IP iP0 = null;
    tp2.IPBan iPBan2 = new tp2.IPBan(iP0, (java.lang.Long)10L);
    tp2.IP iP3 = iPBan2.getIp();
    java.lang.Long long4 = iPBan2.expires;
    tp2.IP iP5 = null;
    iPBan2.ip = iP5;
    iPBan2.setExpires((java.lang.Long)(-1L));
    java.lang.Long long9 = iPBan2.getExpires();
    tp2.IP iP10 = iPBan2.getIp();
    tp2.Server server11 = new tp2.Server();
    tp2.IP iP12 = null;
    boolean b13 = server11.connect(iP12);
    tp2.IP iP14 = null;
    tp2.IPBan iPBan16 = new tp2.IPBan(iP14, (java.lang.Long)10L);
    java.lang.Long long17 = iPBan16.getExpires();
    tp2.IP iP22 = new tp2.IP((java.lang.Integer)31, (java.lang.Integer)31, (java.lang.Integer)31, (java.lang.Integer)0);
    iPBan16.ip = iP22;
    tp2.Server server24 = new tp2.Server();
    tp2.IP iP29 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b30 = server24.removeException(iP29);
    server24.update();
    tp2.Server server32 = new tp2.Server();
    tp2.IP iP37 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b38 = server32.removeException(iP37);
    java.lang.Integer i39 = iP37.getFirst();
    boolean b40 = server24.addBan(iP37);
    iPBan16.setIp(iP37);
    boolean b42 = server11.removeException(iP37);
    java.lang.Integer i43 = iP37.getFourth();
    iPBan2.ip = iP37;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L+ "'", long4.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L)+ "'", long9.equals((-1L)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long17 + "' != '" + 10L+ "'", long17.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i39 + "' != '" + 161+ "'", i39.equals(161));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i43 + "' != '" + 5+ "'", i43.equals(5));

  }

  @Test
  public void test231() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test231"); }


    tp2.IP iP4 = new tp2.IP((java.lang.Integer)1326, (java.lang.Integer)1073741825, (java.lang.Integer)86131982, (java.lang.Integer)352321536);

  }

  @Test
  public void test232() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test232"); }


    // The following exception was thrown during execution in test generation
    try {
      int i1 = java.lang.Integer.parseUnsignedInt("14053405000");
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

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test233"); }


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
    tp2.ITime iTime29 = null;
    server0.setTime(iTime29);
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
    iP48.setFourth((java.lang.Integer)(-2147483620));
    boolean b54 = server31.removeBan(iP48);
    java.lang.Integer i55 = iP48.getSecond();
    boolean b56 = server0.removeBan(iP48);
    tp2.IP iP57 = null;
    tp2.IPBan iPBan59 = new tp2.IPBan(iP57, (java.lang.Long)10L);
    java.lang.Long long60 = iPBan59.getExpires();
    tp2.IP iP61 = iPBan59.getIp();
    iPBan59.setExpires((java.lang.Long)100L);
    java.lang.Long long64 = iPBan59.expires;
    iPBan59.setExpires((java.lang.Long)2147483704L);
    tp2.IP iP71 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    java.lang.Integer i72 = iP71.getFirst();
    java.lang.Integer i73 = iP71.getFirst();
    java.lang.Integer i74 = iP71.getSecond();
    iPBan59.ip = iP71;
    boolean b76 = server0.addException(iP71);
    tp2.IP iP81 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    iP81.setFirst((java.lang.Integer)161);
    iP81.setFourth((java.lang.Integer)14379100);
    java.lang.Integer i86 = iP81.getFirst();
    boolean b87 = server0.addException(iP81);
    
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
    org.junit.Assert.assertTrue(b54 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i55 + "' != '" + (-2147483648)+ "'", i55.equals((-2147483648)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b56 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long60 + "' != '" + 10L+ "'", long60.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP61);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long64 + "' != '" + 100L+ "'", long64.equals(100L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i72 + "' != '" + 161+ "'", i72.equals(161));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i73 + "' != '" + 161+ "'", i73.equals(161));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i74 + "' != '" + (-2147483648)+ "'", i74.equals((-2147483648)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b76 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i86 + "' != '" + 161+ "'", i86.equals(161));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b87 == true);

  }

  @Test
  public void test234() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test234"); }


    tp2.IP iP0 = null;
    tp2.IPBan iPBan2 = new tp2.IPBan(iP0, (java.lang.Long)10L);
    tp2.IP iP3 = iPBan2.getIp();
    java.lang.Long long4 = iPBan2.expires;
    tp2.IP iP5 = null;
    iPBan2.ip = iP5;
    java.lang.Long long7 = iPBan2.expires;
    tp2.IP iP8 = iPBan2.getIp();
    iPBan2.expires = 24L;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L+ "'", long4.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long7 + "' != '" + 10L+ "'", long7.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP8);

  }

  @Test
  public void test235() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test235"); }


    tp2.IP iP0 = null;
    tp2.IPBan iPBan2 = new tp2.IPBan(iP0, (java.lang.Long)10L);
    java.lang.Long long3 = iPBan2.getExpires();
    tp2.IP iP4 = iPBan2.getIp();
    tp2.IP iP5 = iPBan2.ip;
    java.lang.Long long6 = iPBan2.getExpires();
    iPBan2.setExpires((java.lang.Long)28L);
    tp2.IP iP9 = iPBan2.getIp();
    java.lang.Long long10 = iPBan2.getExpires();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L+ "'", long3.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L+ "'", long6.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long10 + "' != '" + 28L+ "'", long10.equals(28L));

  }

  @Test
  public void test236() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test236"); }


    int i1 = java.lang.Integer.reverseBytes(2000);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == (-804847616));

  }

  @Test
  public void test237() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test237"); }


    // The following exception was thrown during execution in test generation
    try {
      korat.finitization.IFinitization iFinitization1 = tp2.Server.finServer(16777216);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test238() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test238"); }


    int i1 = java.lang.Integer.parseInt("80000000");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 80000000);

  }

  @Test
  public void test239() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test239"); }


    int i1 = java.lang.Integer.highestOneBit(70);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 64);

  }

  @Test
  public void test240() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test240"); }


    int i2 = java.lang.Integer.min(2048, 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 11);

  }

  @Test
  public void test241() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test241"); }


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
    tp2.Server server60 = new tp2.Server();
    tp2.IP iP61 = null;
    boolean b62 = server60.addBan(iP61);
    tp2.ITime iTime63 = null;
    server60.setTime(iTime63);
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
    boolean b81 = server60.connect(iP77);
    iP77.setFourth((java.lang.Integer)(-1));
    boolean b84 = server0.connect(iP77);
    server0.update();
    tp2.IP iP86 = null;
    boolean b87 = server0.removeBan(iP86);
    tp2.ITime iTime88 = null;
    server0.setTime(iTime88);
    
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
    org.junit.Assert.assertTrue(b62 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP68);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long69 + "' != '" + 10L+ "'", long69.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b78 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i79 + "' != '" + 161+ "'", i79.equals(161));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b81 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b84 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b87 == false);

  }

  @Test
  public void test242() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test242"); }


    int i2 = java.lang.Integer.max(469761943, 1400000);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 469761943);

  }

  @Test
  public void test243() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test243"); }


    int i1 = java.lang.Integer.reverseBytes(218103808);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 13);

  }

  @Test
  public void test244() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test244"); }


    java.lang.String str2 = java.lang.Integer.toUnsignedString(469762048, 5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1430224341143"+ "'", str2.equals("1430224341143"));

  }

  @Test
  public void test245() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test245"); }


    int i2 = java.lang.Integer.min(2147480291, 1107820544);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1107820544);

  }

  @Test
  public void test246() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test246"); }


    int i2 = java.lang.Integer.sum(469762049, 2000204102);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == (-1825001145));

  }

  @Test
  public void test247() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test247"); }


    tp2.IP iP4 = new tp2.IP((java.lang.Integer)60408026, (java.lang.Integer)(-2147483648), (java.lang.Integer)841, (java.lang.Integer)6);

  }

  @Test
  public void test248() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test248"); }


    tp2.IP iP0 = null;
    tp2.IPBan iPBan2 = new tp2.IPBan(iP0, (java.lang.Long)10L);
    tp2.IP iP3 = iPBan2.getIp();
    iPBan2.expires = 0L;
    tp2.IP iP6 = iPBan2.ip;
    tp2.IP iP7 = iPBan2.getIp();
    tp2.IP iP8 = iPBan2.ip;
    iPBan2.setExpires((java.lang.Long)(-1L));
    java.lang.Long long11 = iPBan2.getExpires();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L)+ "'", long11.equals((-1L)));

  }

  @Test
  public void test249() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test249"); }


    int i2 = java.lang.Integer.remainderUnsigned(501988245, 220);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 165);

  }

  @Test
  public void test250() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test250"); }


    int i1 = java.lang.Integer.reverseBytes(69273664);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 1074274564);

  }

  @Test
  public void test251() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test251"); }


    int i1 = java.lang.Integer.highestOneBit((-1073741818));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == (-2147483648));

  }

  @Test
  public void test252() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test252"); }


    java.lang.String str1 = java.lang.Integer.toOctalString(1073741825);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "10000000001"+ "'", str1.equals("10000000001"));

  }

  @Test
  public void test253() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test253"); }


    int i1 = java.lang.Integer.reverseBytes(84410368);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 2053);

  }

  @Test
  public void test254() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test254"); }


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
    java.lang.Long long77 = iPBan50.expires;
    iPBan50.setExpires((java.lang.Long)3997696L);
    
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
    org.junit.Assert.assertTrue("'" + long77 + "' != '" + 10L+ "'", long77.equals(10L));

  }

  @Test
  public void test255() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test255"); }


    java.lang.String str1 = java.lang.Integer.toHexString(1073747006);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "4000143e"+ "'", str1.equals("4000143e"));

  }

  @Test
  public void test256() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test256"); }


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
    tp2.Server server28 = new tp2.Server();
    tp2.IP iP29 = null;
    boolean b30 = server28.addBan(iP29);
    tp2.Server server31 = new tp2.Server();
    tp2.IP iP36 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b37 = server31.removeException(iP36);
    boolean b39 = iP36.equals((java.lang.Object)(-1L));
    boolean b40 = server28.removeBan(iP36);
    tp2.Server server41 = new tp2.Server();
    tp2.IP iP42 = null;
    boolean b43 = server41.addBan(iP42);
    tp2.IP iP48 = new tp2.IP((java.lang.Integer)31, (java.lang.Integer)31, (java.lang.Integer)31, (java.lang.Integer)0);
    iP48.setSecond((java.lang.Integer)2147483647);
    boolean b51 = server41.addBan(iP48);
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
    boolean b74 = server41.removeBan(iP69);
    tp2.IP iP79 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    iP79.setFirst((java.lang.Integer)161);
    iP79.setThird((java.lang.Integer)3);
    iP79.setFirst((java.lang.Integer)26);
    iP79.setThird((java.lang.Integer)5);
    boolean b88 = server41.removeBan(iP79);
    boolean b89 = server28.connect(iP79);
    iP79.setFirst((java.lang.Integer)14379100);
    iP79.setThird((java.lang.Integer)(-2080374703));
    boolean b94 = server0.removeBan(iP79);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b43 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b51 == true);
    
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
    org.junit.Assert.assertTrue(b74 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b88 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b89 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b94 == false);

  }

  @Test
  public void test257() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test257"); }


    java.lang.Integer i1 = java.lang.Integer.valueOf((-150929408));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + (-150929408)+ "'", i1.equals((-150929408)));

  }

  @Test
  public void test258() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test258"); }


    // The following exception was thrown during execution in test generation
    try {
      int i1 = java.lang.Integer.parseInt("13344223332131");
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

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test259"); }


    // The following exception was thrown during execution in test generation
    try {
      java.lang.Integer i1 = new java.lang.Integer("30707074200");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test260() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test260"); }


    tp2.IP iP4 = new tp2.IP((java.lang.Integer)64000000, (java.lang.Integer)84410411, (java.lang.Integer)469762048, (java.lang.Integer)1622018560);

  }

  @Test
  public void test261() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test261"); }


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
    java.lang.Integer i66 = iP53.getFourth();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i66 + "' != '" + 5+ "'", i66.equals(5));

  }

  @Test
  public void test262() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test262"); }


    int i1 = java.lang.Integer.highestOneBit((-2147483592));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == (-2147483648));

  }

  @Test
  public void test263() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test263"); }


    int i1 = java.lang.Integer.parseInt("1000110");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 1000110);

  }

  @Test
  public void test264() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test264"); }


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
    tp2.IP iP29 = null;
    tp2.IPBan iPBan31 = new tp2.IPBan(iP29, (java.lang.Long)10L);
    tp2.IP iP32 = iPBan31.getIp();
    java.lang.Long long33 = iPBan31.expires;
    tp2.IP iP34 = null;
    iPBan31.ip = iP34;
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
    iPBan31.setIp(iP53);
    boolean b59 = server0.removeBan(iP53);
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
    tp2.IP iP76 = iPBan62.getIp();
    java.lang.Integer i77 = iP76.getSecond();
    boolean b78 = server0.connect(iP76);
    tp2.ITime iTime79 = null;
    server0.setTime(iTime79);
    tp2.IP iP81 = null;
    tp2.IPBan iPBan83 = new tp2.IPBan(iP81, (java.lang.Long)10L);
    java.lang.Long long84 = iPBan83.getExpires();
    tp2.IP iP89 = new tp2.IP((java.lang.Integer)31, (java.lang.Integer)31, (java.lang.Integer)31, (java.lang.Integer)0);
    iPBan83.ip = iP89;
    boolean b92 = iP89.equals((java.lang.Object)"20000000000");
    java.lang.Integer i93 = iP89.getThird();
    boolean b94 = server0.addBan(iP89);
    
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
    org.junit.Assert.assertNull(iP32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long33 + "' != '" + 10L+ "'", long33.equals(10L));
    
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
    org.junit.Assert.assertTrue(b59 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP63);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long64 + "' != '" + 10L+ "'", long64.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b73 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i74 + "' != '" + 161+ "'", i74.equals(161));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP76);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i77 + "' != '" + (-2147483648)+ "'", i77.equals((-2147483648)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b78 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long84 + "' != '" + 10L+ "'", long84.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b92 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i93 + "' != '" + 31+ "'", i93.equals(31));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b94 == true);

  }

  @Test
  public void test265() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test265"); }


    // The following exception was thrown during execution in test generation
    try {
      int i2 = java.lang.Integer.parseInt("38000000", 0);
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test266() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test266"); }


    int i2 = java.lang.Integer.rotateRight(289406976, 1677721779);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 552);

  }

  @Test
  public void test267() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test267"); }


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
    java.lang.Integer i68 = iP66.getSecond();
    
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
    org.junit.Assert.assertTrue("'" + i68 + "' != '" + 229376+ "'", i68.equals(229376));

  }

  @Test
  public void test268() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test268"); }


    // The following exception was thrown during execution in test generation
    try {
      java.lang.Integer i1 = new java.lang.Integer("1111010001100011");
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

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test269"); }


    int i2 = java.lang.Integer.max(268435456, 531);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 268435456);

  }

  @Test
  public void test270() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test270"); }


    java.lang.Integer i1 = java.lang.Integer.valueOf(2958112);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 2958112+ "'", i1.equals(2958112));

  }

  @Test
  public void test271() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test271"); }


    tp2.IP iP0 = null;
    tp2.IPBan iPBan2 = new tp2.IPBan(iP0, (java.lang.Long)10L);
    tp2.IP iP3 = iPBan2.getIp();
    iPBan2.expires = 0L;
    tp2.IP iP6 = iPBan2.ip;
    java.lang.Long long7 = iPBan2.getExpires();
    java.lang.Long long8 = iPBan2.getExpires();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L+ "'", long7.equals(0L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L+ "'", long8.equals(0L));

  }

  @Test
  public void test272() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test272"); }


    java.lang.Integer i2 = java.lang.Integer.getInteger("1100100000000000000000010100001", (java.lang.Integer)75827200);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i2 + "' != '" + 75827200+ "'", i2.equals(75827200));

  }

  @Test
  public void test273() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test273"); }


    int i1 = java.lang.Integer.parseUnsignedInt("38000");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 38000);

  }

  @Test
  public void test274() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test274"); }


    int i2 = java.lang.Integer.sum((-1825001145), (-2147335211));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 322630940);

  }

  @Test
  public void test275() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test275"); }


    // The following exception was thrown during execution in test generation
    try {
      korat.finitization.IFinitization iFinitization1 = tp2.Server.finServer(6034688);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test276() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test276"); }


    int i2 = java.lang.Integer.compare(480, (-80049));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);

  }

  @Test
  public void test277() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test277"); }


    int i2 = java.lang.Integer.rotateRight(1879047772, 1689255936);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1879047772);

  }

  @Test
  public void test278() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test278"); }


    java.lang.String str1 = java.lang.Integer.toBinaryString((-2080374783));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "10000100000000000000000000000001"+ "'", str1.equals("10000100000000000000000000000001"));

  }

  @Test
  public void test279() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test279"); }


    tp2.IP iP4 = new tp2.IP((java.lang.Integer)133, (java.lang.Integer)(-2147483515), (java.lang.Integer)79, (java.lang.Integer)(-2147483620));
    java.lang.Integer i5 = iP4.getSecond();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i5 + "' != '" + (-2147483515)+ "'", i5.equals((-2147483515)));

  }

  @Test
  public void test280() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test280"); }


    int i1 = java.lang.Integer.signum(22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 1);

  }

  @Test
  public void test281() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test281"); }


    int i1 = java.lang.Integer.highestOneBit((-1067699647));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == (-2147483648));

  }

  @Test
  public void test282() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test282"); }


    java.lang.Integer i2 = java.lang.Integer.getInteger("b", (java.lang.Integer)25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i2 + "' != '" + 25+ "'", i2.equals(25));

  }

  @Test
  public void test283() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test283"); }


    java.lang.String str1 = java.lang.Integer.toHexString(1112);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "458"+ "'", str1.equals("458"));

  }

  @Test
  public void test284() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test284"); }


    // The following exception was thrown during execution in test generation
    try {
      korat.finitization.IFinitization iFinitization1 = tp2.Server.finServer(260);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test285() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test285"); }


    int i1 = java.lang.Integer.lowestOneBit(256);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 256);

  }

  @Test
  public void test286() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test286"); }


    int i2 = java.lang.Integer.sum((-1879048192), 638386176);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == (-1240662016));

  }

  @Test
  public void test287() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test287"); }


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
    iP21.setSecond((java.lang.Integer)5211392);
    iP21.setThird((java.lang.Integer)402653184);
    tp2.IPBan iPBan31 = new tp2.IPBan(iP21, (java.lang.Long)5211392L);
    java.lang.Long long32 = iPBan31.expires;
    
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
    org.junit.Assert.assertTrue("'" + long32 + "' != '" + 5211392L+ "'", long32.equals(5211392L));

  }

  @Test
  public void test288() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test288"); }


    tp2.IP iP4 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    java.lang.Integer i5 = iP4.getFirst();
    iP4.setSecond((java.lang.Integer)(-2147483515));
    iP4.setFirst((java.lang.Integer)(-1593835376));
    tp2.IPBan iPBan11 = new tp2.IPBan(iP4, (java.lang.Long)3855024127L);
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
    tp2.IP iP28 = iPBan14.getIp();
    iPBan14.setExpires((java.lang.Long)2701131776L);
    tp2.IP iP31 = iPBan14.getIp();
    java.lang.Integer i32 = iP31.getFirst();
    iPBan11.ip = iP31;
    tp2.Server server34 = new tp2.Server();
    tp2.IP iP39 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b40 = server34.removeException(iP39);
    server34.update();
    tp2.Server server42 = new tp2.Server();
    tp2.IP iP47 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b48 = server42.removeException(iP47);
    java.lang.Integer i49 = iP47.getFirst();
    boolean b50 = server34.addBan(iP47);
    boolean b52 = iP47.equals((java.lang.Object)(short)10);
    iP47.setSecond((java.lang.Integer)(-134217728));
    java.lang.Integer i55 = iP47.getFourth();
    java.lang.Integer i56 = iP47.getSecond();
    boolean b57 = iP31.equals((java.lang.Object)iP47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i5 + "' != '" + 161+ "'", i5.equals(161));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long16 + "' != '" + 10L+ "'", long16.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i26 + "' != '" + 161+ "'", i26.equals(161));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i32 + "' != '" + 161+ "'", i32.equals(161));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b48 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i49 + "' != '" + 161+ "'", i49.equals(161));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b50 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b52 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i55 + "' != '" + 5+ "'", i55.equals(5));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i56 + "' != '" + (-134217728)+ "'", i56.equals((-134217728)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b57 == false);

  }

  @Test
  public void test289() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test289"); }


    int i1 = java.lang.Integer.lowestOneBit(8192);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 8192);

  }

  @Test
  public void test290() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test290"); }


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
    iPBan2.expires = 1L;
    java.lang.Long long30 = iPBan2.getExpires();
    iPBan2.expires = 2707685376L;
    
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
    org.junit.Assert.assertTrue("'" + long30 + "' != '" + 1L+ "'", long30.equals(1L));

  }

  @Test
  public void test291() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test291"); }


    java.lang.String str1 = java.lang.Integer.toOctalString(2053);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "4005"+ "'", str1.equals("4005"));

  }

  @Test
  public void test292() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test292"); }


    // The following exception was thrown during execution in test generation
    try {
      int i2 = java.lang.Integer.parseInt("1100100000000000000000010100001", 1010);
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test293() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test293"); }


    int i2 = java.lang.Integer.rotateRight(7274496, 1100101);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 227328);

  }

  @Test
  public void test294() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test294"); }


    java.lang.String str1 = java.lang.Integer.toUnsignedString(80);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "80"+ "'", str1.equals("80"));

  }

  @Test
  public void test295() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test295"); }


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
    server0.update();
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

  }

  @Test
  public void test296() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test296"); }


    // The following exception was thrown during execution in test generation
    try {
      int i2 = java.lang.Integer.parseUnsignedInt("69273664", 469762049);
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test297() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test297"); }


    int i1 = java.lang.Integer.numberOfLeadingZeros(321);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 23);

  }

  @Test
  public void test298() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test298"); }


    java.lang.Integer i1 = java.lang.Integer.getInteger("4000000");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);

  }

  @Test
  public void test299() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test299"); }


    int i2 = java.lang.Integer.min(100663296, (-2080374783));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == (-2080374783));

  }

  @Test
  public void test300() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test300"); }


    int i1 = java.lang.Integer.highestOneBit(63740400);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 33554432);

  }

  @Test
  public void test301() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test301"); }


    int i2 = java.lang.Integer.sum(1107820544, 1073741841);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == (-2113404911));

  }

  @Test
  public void test302() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test302"); }


    int i2 = java.lang.Integer.rotateRight(2456, (-1557978496));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 2456);

  }

  @Test
  public void test303() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test303"); }


    tp2.Server server0 = new tp2.Server();
    tp2.IP iP5 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b6 = server0.removeException(iP5);
    iP5.setThird((java.lang.Integer)56);
    java.lang.Integer i9 = iP5.getFourth();
    java.lang.Integer i10 = iP5.getThird();
    tp2.IPBan iPBan12 = new tp2.IPBan(iP5, (java.lang.Long)536870912L);
    iP5.setSecond((java.lang.Integer)32768);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 5+ "'", i9.equals(5));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i10 + "' != '" + 56+ "'", i10.equals(56));

  }

  @Test
  public void test304() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test304"); }


    int i1 = java.lang.Integer.reverse(101011);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == (-917405696));

  }

  @Test
  public void test305() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test305"); }


    java.lang.Integer i1 = new java.lang.Integer("4000");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 4000+ "'", i1.equals(4000));

  }

  @Test
  public void test306() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test306"); }


    // The following exception was thrown during execution in test generation
    try {
      java.lang.Integer i1 = java.lang.Integer.valueOf("n");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test307() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test307"); }


    // The following exception was thrown during execution in test generation
    try {
      int i2 = java.lang.Integer.parseUnsignedInt("111110000000001001010", 480);
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test308() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test308"); }


    int i2 = java.lang.Integer.max(536870912, 1622018560);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1622018560);

  }

  @Test
  public void test309() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test309"); }


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
    tp2.IP iP30 = iPBan29.getIp();
    java.lang.Long long31 = iPBan29.expires;
    tp2.Server server32 = new tp2.Server();
    tp2.IP iP37 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b38 = server32.removeException(iP37);
    java.lang.Integer i39 = iP37.getFirst();
    iPBan29.setIp(iP37);
    boolean b41 = server0.removeBan(iP37);
    tp2.IP iP42 = null;
    tp2.IPBan iPBan44 = new tp2.IPBan(iP42, (java.lang.Long)10L);
    java.lang.Long long45 = iPBan44.getExpires();
    tp2.IP iP50 = new tp2.IP((java.lang.Integer)31, (java.lang.Integer)31, (java.lang.Integer)31, (java.lang.Integer)0);
    iPBan44.ip = iP50;
    tp2.Server server52 = new tp2.Server();
    tp2.IP iP57 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b58 = server52.removeException(iP57);
    server52.update();
    tp2.Server server60 = new tp2.Server();
    tp2.IP iP65 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b66 = server60.removeException(iP65);
    java.lang.Integer i67 = iP65.getFirst();
    boolean b68 = server52.addBan(iP65);
    iPBan44.setIp(iP65);
    tp2.IP iP70 = iPBan44.ip;
    iP70.setThird((java.lang.Integer)1073741825);
    boolean b73 = server0.removeBan(iP70);
    
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
    org.junit.Assert.assertNull(iP30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long31 + "' != '" + 10L+ "'", long31.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i39 + "' != '" + 161+ "'", i39.equals(161));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long45 + "' != '" + 10L+ "'", long45.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b58 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b66 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i67 + "' != '" + 161+ "'", i67.equals(161));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b68 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP70);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b73 == false);

  }

  @Test
  public void test310() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test310"); }


    java.lang.String str1 = java.lang.Integer.toHexString(461132125);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "1b7c515d"+ "'", str1.equals("1b7c515d"));

  }

  @Test
  public void test311() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test311"); }


    // The following exception was thrown during execution in test generation
    try {
      korat.finitization.IFinitization iFinitization1 = tp2.Server.finServer(1270);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test312() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test312"); }


    int i1 = java.lang.Integer.numberOfTrailingZeros(21262214);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 1);

  }

  @Test
  public void test313() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test313"); }


    tp2.IP iP0 = null;
    tp2.IPBan iPBan2 = new tp2.IPBan(iP0, (java.lang.Long)10L);
    java.lang.Long long3 = iPBan2.getExpires();
    tp2.IP iP4 = iPBan2.getIp();
    tp2.IP iP5 = iPBan2.ip;
    tp2.IP iP6 = null;
    tp2.IPBan iPBan8 = new tp2.IPBan(iP6, (java.lang.Long)10L);
    tp2.IP iP9 = iPBan8.getIp();
    java.lang.Long long10 = iPBan8.expires;
    tp2.Server server11 = new tp2.Server();
    tp2.IP iP16 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b17 = server11.removeException(iP16);
    java.lang.Integer i18 = iP16.getFirst();
    iPBan8.setIp(iP16);
    tp2.IP iP20 = iPBan8.ip;
    java.lang.Long long21 = iPBan8.getExpires();
    tp2.Server server22 = new tp2.Server();
    tp2.IP iP23 = null;
    boolean b24 = server22.connect(iP23);
    tp2.IP iP29 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)83, (java.lang.Integer)26, (java.lang.Integer)100);
    boolean b30 = server22.addBan(iP29);
    iP29.setFirst((java.lang.Integer)133);
    iPBan8.ip = iP29;
    tp2.Server server34 = new tp2.Server();
    tp2.IP iP39 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b40 = server34.removeException(iP39);
    server34.update();
    tp2.Server server42 = new tp2.Server();
    tp2.IP iP47 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b48 = server42.removeException(iP47);
    java.lang.Integer i49 = iP47.getFirst();
    boolean b50 = server34.addBan(iP47);
    iP47.setSecond((java.lang.Integer)83);
    iPBan8.setIp(iP47);
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
    boolean b82 = iP47.equals((java.lang.Object)iPBan56);
    iPBan2.setIp(iP47);
    java.lang.Long long84 = iPBan2.getExpires();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L+ "'", long3.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long10 + "' != '" + 10L+ "'", long10.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i18 + "' != '" + 161+ "'", i18.equals(161));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long21 + "' != '" + 10L+ "'", long21.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b48 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i49 + "' != '" + 161+ "'", i49.equals(161));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b50 == true);
    
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
    org.junit.Assert.assertTrue(b82 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long84 + "' != '" + 10L+ "'", long84.equals(10L));

  }

  @Test
  public void test314() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test314"); }


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
    tp2.Server server36 = new tp2.Server();
    tp2.IP iP37 = null;
    boolean b38 = server36.addBan(iP37);
    tp2.IP iP43 = new tp2.IP((java.lang.Integer)31, (java.lang.Integer)31, (java.lang.Integer)31, (java.lang.Integer)0);
    iP43.setSecond((java.lang.Integer)2147483647);
    boolean b46 = server36.addBan(iP43);
    iP43.setFirst((java.lang.Integer)939524096);
    java.lang.Integer i49 = iP43.getSecond();
    iP43.setFirst((java.lang.Integer)18000000);
    boolean b52 = server0.addBan(iP43);
    java.lang.Integer i53 = iP43.getFourth();
    
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
    org.junit.Assert.assertTrue(b38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b46 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i49 + "' != '" + 2147483647+ "'", i49.equals(2147483647));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b52 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i53 + "' != '" + 0+ "'", i53.equals(0));

  }

  @Test
  public void test315() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test315"); }


    java.lang.String str2 = java.lang.Integer.toUnsignedString(1392508928, 44410945);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1392508928"+ "'", str2.equals("1392508928"));

  }

  @Test
  public void test316() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test316"); }


    int i1 = java.lang.Integer.reverse((-268435323));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == (-1593835505));

  }

  @Test
  public void test317() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test317"); }


    int i2 = java.lang.Integer.divideUnsigned(8, (-439943169));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);

  }

  @Test
  public void test318() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test318"); }


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
    java.lang.Long long35 = null;
    iPBan34.expires = long35;
    tp2.IP iP37 = iPBan34.getIp();
    
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
    org.junit.Assert.assertNotNull(iP37);

  }

  @Test
  public void test319() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test319"); }


    java.lang.Integer i1 = new java.lang.Integer(73728);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 73728+ "'", i1.equals(73728));

  }

  @Test
  public void test320() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test320"); }


    // The following exception was thrown during execution in test generation
    try {
      java.lang.Integer i1 = java.lang.Integer.decode("3b9aca0c");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test321() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test321"); }


    // The following exception was thrown during execution in test generation
    try {
      korat.finitization.IFinitization iFinitization1 = tp2.Server.finServer(25);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test322() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test322"); }


    tp2.IP iP0 = null;
    tp2.IPBan iPBan2 = new tp2.IPBan(iP0, (java.lang.Long)10L);
    java.lang.Long long3 = iPBan2.expires;
    java.lang.Long long4 = iPBan2.getExpires();
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
    java.lang.Long long21 = iPBan7.expires;
    tp2.IP iP22 = iPBan7.getIp();
    iPBan2.setIp(iP22);
    java.lang.Integer i24 = iP22.getSecond();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L+ "'", long3.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L+ "'", long4.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long9 + "' != '" + 10L+ "'", long9.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i19 + "' != '" + 161+ "'", i19.equals(161));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long21 + "' != '" + 10L+ "'", long21.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i24 + "' != '" + (-2147483648)+ "'", i24.equals((-2147483648)));

  }

  @Test
  public void test323() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test323"); }


    int i2 = java.lang.Integer.divideUnsigned(90, (-2113404911));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);

  }

  @Test
  public void test324() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test324"); }


    // The following exception was thrown during execution in test generation
    try {
      java.lang.Integer i2 = java.lang.Integer.valueOf("2082996226", 2362614);
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

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test325"); }


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
    iPBan2.expires = 1L;
    
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

  }

  @Test
  public void test326() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test326"); }


    int i2 = java.lang.Integer.divideUnsigned((-80049), 277);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 15505008);

  }

  @Test
  public void test327() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test327"); }


    int i2 = java.lang.Integer.compare((-439943169), 740);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == (-1));

  }

  @Test
  public void test328() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test328"); }


    tp2.Server server0 = new tp2.Server();
    tp2.IP iP1 = null;
    boolean b2 = server0.addBan(iP1);
    tp2.IP iP7 = new tp2.IP((java.lang.Integer)31, (java.lang.Integer)31, (java.lang.Integer)31, (java.lang.Integer)0);
    iP7.setSecond((java.lang.Integer)2147483647);
    boolean b10 = server0.addBan(iP7);
    tp2.IP iP15 = new tp2.IP((java.lang.Integer)133, (java.lang.Integer)(-2147483515), (java.lang.Integer)79, (java.lang.Integer)(-2147483620));
    boolean b16 = server0.removeBan(iP15);
    tp2.ITime iTime17 = null;
    server0.setTime(iTime17);
    tp2.IP iP19 = null;
    tp2.IPBan iPBan21 = new tp2.IPBan(iP19, (java.lang.Long)10L);
    tp2.IP iP22 = iPBan21.getIp();
    java.lang.Long long23 = iPBan21.expires;
    tp2.IP iP24 = null;
    iPBan21.ip = iP24;
    tp2.Server server26 = new tp2.Server();
    tp2.IP iP27 = null;
    boolean b28 = server26.addBan(iP27);
    tp2.ITime iTime29 = null;
    server26.setTime(iTime29);
    tp2.IP iP31 = null;
    tp2.IPBan iPBan33 = new tp2.IPBan(iP31, (java.lang.Long)10L);
    tp2.IP iP34 = iPBan33.getIp();
    java.lang.Long long35 = iPBan33.expires;
    tp2.IP iP36 = null;
    iPBan33.ip = iP36;
    tp2.Server server38 = new tp2.Server();
    tp2.IP iP43 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b44 = server38.removeException(iP43);
    java.lang.Integer i45 = iP43.getFirst();
    iPBan33.setIp(iP43);
    boolean b47 = server26.connect(iP43);
    iPBan21.setIp(iP43);
    iP43.setSecond((java.lang.Integer)100);
    iP43.setSecond((java.lang.Integer)70);
    boolean b53 = server0.removeException(iP43);
    server0.update();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long23 + "' != '" + 10L+ "'", long23.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long35 + "' != '" + 10L+ "'", long35.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i45 + "' != '" + 161+ "'", i45.equals(161));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b47 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b53 == false);

  }

  @Test
  public void test329() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test329"); }


    // The following exception was thrown during execution in test generation
    try {
      java.lang.Integer i2 = java.lang.Integer.valueOf("10010000111101010110000000", 134217738);
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test330() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test330"); }


    tp2.Server server0 = new tp2.Server();
    tp2.IP iP1 = null;
    boolean b2 = server0.addBan(iP1);
    tp2.Server server3 = new tp2.Server();
    tp2.IP iP8 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b9 = server3.removeException(iP8);
    boolean b11 = iP8.equals((java.lang.Object)(-1L));
    boolean b12 = server0.removeBan(iP8);
    tp2.IPBan iPBan14 = new tp2.IPBan(iP8, (java.lang.Long)(-1L));
    iP8.setSecond((java.lang.Integer)(-439943169));
    java.lang.Integer i17 = iP8.getThird();
    iP8.setFirst((java.lang.Integer)11024899);
    iP8.setThird((java.lang.Integer)220);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i17 + "' != '" + 939524096+ "'", i17.equals(939524096));

  }

  @Test
  public void test331() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test331"); }


    int i2 = java.lang.Integer.min(1073741825, 9861);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 9861);

  }

  @Test
  public void test332() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test332"); }


    tp2.IP iP4 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-2147483648), (java.lang.Integer)6, (java.lang.Integer)28);
    iP4.setSecond((java.lang.Integer)100004);

  }

  @Test
  public void test333() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test333"); }


    long long1 = java.lang.Integer.toUnsignedLong(2528);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == 2528L);

  }

  @Test
  public void test334() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test334"); }


    int i1 = java.lang.Integer.numberOfLeadingZeros(111);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 25);

  }

  @Test
  public void test335() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test335"); }


    int i2 = java.lang.Integer.rotateLeft(1010, 51200);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1010);

  }

  @Test
  public void test336() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test336"); }


    tp2.IP iP0 = null;
    tp2.IPBan iPBan2 = new tp2.IPBan(iP0, (java.lang.Long)10L);
    tp2.IP iP3 = iPBan2.getIp();
    iPBan2.expires = 0L;
    tp2.IP iP6 = iPBan2.ip;
    tp2.IP iP7 = iPBan2.getIp();
    java.lang.Long long8 = iPBan2.expires;
    java.lang.Long long9 = iPBan2.expires;
    java.lang.Long long10 = iPBan2.expires;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L+ "'", long8.equals(0L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L+ "'", long9.equals(0L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L+ "'", long10.equals(0L));

  }

  @Test
  public void test337() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test337"); }


    tp2.Server server0 = new tp2.Server();
    tp2.IP iP1 = null;
    boolean b2 = server0.addBan(iP1);
    tp2.IP iP7 = new tp2.IP((java.lang.Integer)31, (java.lang.Integer)31, (java.lang.Integer)31, (java.lang.Integer)0);
    iP7.setSecond((java.lang.Integer)2147483647);
    boolean b10 = server0.addBan(iP7);
    tp2.Server server11 = new tp2.Server();
    tp2.IP iP12 = null;
    boolean b13 = server11.addBan(iP12);
    server11.update();
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
    java.lang.Integer i31 = iP27.getFirst();
    java.lang.Integer i32 = iP27.getFirst();
    boolean b33 = server11.addBan(iP27);
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
    boolean b55 = server34.connect(iP51);
    boolean b56 = server11.connect(iP51);
    boolean b57 = server0.removeBan(iP51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long19 + "' != '" + 10L+ "'", long19.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i29 + "' != '" + 161+ "'", i29.equals(161));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i31 + "' != '" + 161+ "'", i31.equals(161));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i32 + "' != '" + 161+ "'", i32.equals(161));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == true);
    
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
    org.junit.Assert.assertTrue(b55 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b56 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b57 == false);

  }

  @Test
  public void test338() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test338"); }


    java.lang.Integer i1 = new java.lang.Integer(100663296);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 100663296+ "'", i1.equals(100663296));

  }

  @Test
  public void test339() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test339"); }


    int i2 = java.lang.Integer.compareUnsigned(0, 638386176);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == (-1));

  }

  @Test
  public void test340() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test340"); }


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
    server0.update();
    
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

  }

  @Test
  public void test341() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test341"); }


    int i2 = java.lang.Integer.sum(0, 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 35);

  }

  @Test
  public void test342() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test342"); }


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
    tp2.IPBan iPBan25 = new tp2.IPBan(iP22, (java.lang.Long)2147483676L);
    
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

  }

  @Test
  public void test343() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test343"); }


    java.lang.String str1 = java.lang.Integer.toOctalString(86131982);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "510442416"+ "'", str1.equals("510442416"));

  }

  @Test
  public void test344() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test344"); }


    // The following exception was thrown during execution in test generation
    try {
      java.lang.Integer i2 = java.lang.Integer.valueOf("777777770", 1400000);
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test345() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test345"); }


    tp2.IP iP0 = null;
    tp2.IPBan iPBan2 = new tp2.IPBan(iP0, (java.lang.Long)10L);
    java.lang.Long long3 = iPBan2.getExpires();
    tp2.IP iP4 = iPBan2.getIp();
    tp2.IP iP5 = iPBan2.ip;
    java.lang.Long long6 = iPBan2.getExpires();
    iPBan2.setExpires((java.lang.Long)28L);
    java.lang.Long long9 = iPBan2.getExpires();
    java.lang.Long long10 = iPBan2.expires;
    iPBan2.setExpires((java.lang.Long)51200L);
    
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

  }

  @Test
  public void test346() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test346"); }


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
    java.lang.Long long26 = iPBan19.expires;
    java.lang.Long long27 = iPBan19.getExpires();
    tp2.IP iP28 = iPBan19.getIp();
    java.lang.Integer i29 = iP28.getFourth();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L+ "'", long4.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i14 + "' != '" + 161+ "'", i14.equals(161));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long26 + "' != '" + 10L+ "'", long26.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long27 + "' != '" + 10L+ "'", long27.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i29 + "' != '" + 939524096+ "'", i29.equals(939524096));

  }

  @Test
  public void test347() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test347"); }


    int i2 = java.lang.Integer.min((-2080374783), 50000010);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == (-2080374783));

  }

  @Test
  public void test348() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test348"); }


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
    boolean b51 = iP46.equals((java.lang.Object)(-1593835376));
    tp2.IP iP56 = new tp2.IP((java.lang.Integer)(-2143289345), (java.lang.Integer)(-2013265918), (java.lang.Integer)1583334, (java.lang.Integer)1024);
    java.lang.Integer i57 = iP56.getFirst();
    boolean b58 = iP46.equals((java.lang.Object)i57);
    
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
    org.junit.Assert.assertTrue(b51 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i57 + "' != '" + (-2143289345)+ "'", i57.equals((-2143289345)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b58 == false);

  }

  @Test
  public void test349() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test349"); }


    java.lang.String str1 = java.lang.Integer.toBinaryString(421084);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "1100110110011011100"+ "'", str1.equals("1100110110011011100"));

  }

  @Test
  public void test350() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test350"); }


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
    iP59.setSecond((java.lang.Integer)352321956);
    
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

  }

  @Test
  public void test351() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test351"); }


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
    boolean b54 = server0.addException(iP46);
    tp2.Server server55 = new tp2.Server();
    tp2.IP iP60 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b61 = server55.removeException(iP60);
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
    iP79.setFourth((java.lang.Integer)(-2147483620));
    boolean b85 = server62.removeBan(iP79);
    java.lang.Integer i86 = iP79.getSecond();
    iP79.setSecond((java.lang.Integer)(-1879048192));
    boolean b89 = server55.addBan(iP79);
    boolean b90 = server0.removeBan(iP79);
    iP79.setFourth((java.lang.Integer)(-1207959532));
    
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
    org.junit.Assert.assertTrue(b54 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b61 == false);
    
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
    org.junit.Assert.assertTrue(b85 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i86 + "' != '" + (-2147483648)+ "'", i86.equals((-2147483648)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b89 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b90 == false);

  }

  @Test
  public void test352() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test352"); }


    // The following exception was thrown during execution in test generation
    try {
      java.lang.Integer i1 = new java.lang.Integer("10000101000000000000000001110000");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test353() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test353"); }


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
    iP28.setFourth((java.lang.Integer)(-2147483620));
    boolean b34 = server11.removeBan(iP28);
    java.lang.Integer i35 = iP28.getFirst();
    java.lang.Integer i36 = iP28.getSecond();
    tp2.IPBan iPBan38 = new tp2.IPBan(iP28, (java.lang.Long)0L);
    boolean b39 = server0.addException(iP28);
    java.lang.Integer i40 = iP28.getFirst();
    
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
    org.junit.Assert.assertTrue(b34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i35 + "' != '" + 161+ "'", i35.equals(161));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i36 + "' != '" + (-2147483648)+ "'", i36.equals((-2147483648)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i40 + "' != '" + 161+ "'", i40.equals(161));

  }

  @Test
  public void test354() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test354"); }


    java.lang.Integer i2 = java.lang.Integer.getInteger("46", 176);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i2 + "' != '" + 176+ "'", i2.equals(176));

  }

  @Test
  public void test355() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test355"); }


    // The following exception was thrown during execution in test generation
    try {
      int i2 = java.lang.Integer.parseInt("8000001c", (-14619));
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

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test356"); }


    int i1 = java.lang.Integer.reverseBytes(186646533);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 83894283);

  }

  @Test
  public void test357() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test357"); }


    java.lang.String str1 = java.lang.Integer.toBinaryString(11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "1011"+ "'", str1.equals("1011"));

  }

  @Test
  public void test358() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test358"); }


    int i2 = java.lang.Integer.sum(9, 1879047772);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1879047781);

  }

  @Test
  public void test359() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test359"); }


    int i1 = java.lang.Integer.highestOneBit((-2143289345));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == (-2147483648));

  }

  @Test
  public void test360() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test360"); }


    int i1 = java.lang.Integer.reverseBytes(469762048);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 28);

  }

  @Test
  public void test361() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test361"); }


    java.lang.String str1 = java.lang.Integer.toOctalString(7274496);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "33600000"+ "'", str1.equals("33600000"));

  }

  @Test
  public void test362() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test362"); }


    tp2.IP iP4 = new tp2.IP((java.lang.Integer)133, (java.lang.Integer)(-2147483515), (java.lang.Integer)79, (java.lang.Integer)(-2147483620));
    tp2.Server server5 = new tp2.Server();
    tp2.IP iP6 = null;
    boolean b7 = server5.addBan(iP6);
    tp2.Server server8 = new tp2.Server();
    tp2.IP iP13 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b14 = server8.removeException(iP13);
    boolean b16 = iP13.equals((java.lang.Object)(-1L));
    boolean b17 = server5.removeBan(iP13);
    server5.update();
    tp2.IP iP23 = new tp2.IP((java.lang.Integer)740, (java.lang.Integer)2, (java.lang.Integer)268435456, (java.lang.Integer)229376);
    boolean b24 = server5.addException(iP23);
    server5.update();
    tp2.IP iP26 = null;
    tp2.IPBan iPBan28 = new tp2.IPBan(iP26, (java.lang.Long)10L);
    tp2.IP iP29 = iPBan28.getIp();
    tp2.IP iP34 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    iP34.setFirst((java.lang.Integer)161);
    iP34.setThird((java.lang.Integer)3);
    iP34.setFirst((java.lang.Integer)26);
    iPBan28.ip = iP34;
    iP34.setSecond((java.lang.Integer)15);
    java.lang.Integer i44 = iP34.getSecond();
    iP34.setFirst((java.lang.Integer)60408026);
    boolean b47 = server5.removeException(iP34);
    tp2.IP iP52 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    iP52.setFirst((java.lang.Integer)161);
    iP52.setThird((java.lang.Integer)3);
    iP52.setFirst((java.lang.Integer)26);
    iP52.setFirst((java.lang.Integer)(-2147483592));
    java.lang.Long long61 = null;
    tp2.IPBan iPBan62 = new tp2.IPBan(iP52, long61);
    boolean b63 = server5.addException(iP52);
    tp2.ITime iTime64 = null;
    server5.setTime(iTime64);
    server5.update();
    boolean b67 = iP4.equals((java.lang.Object)server5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i44 + "' != '" + 15+ "'", i44.equals(15));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b47 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b63 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b67 == false);

  }

  @Test
  public void test363() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test363"); }


    long long1 = java.lang.Integer.toUnsignedLong(50000010);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == 50000010L);

  }

  @Test
  public void test364() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test364"); }


    java.lang.Integer i1 = new java.lang.Integer(1400000);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 1400000+ "'", i1.equals(1400000));

  }

  @Test
  public void test365() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test365"); }


    int i2 = java.lang.Integer.divideUnsigned(16, (-1291845532));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);

  }

  @Test
  public void test366() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test366"); }


    int i2 = java.lang.Integer.divideUnsigned(4329604, (-14619));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);

  }

  @Test
  public void test367() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test367"); }


    int i2 = java.lang.Integer.divideUnsigned(1048576, 84410411);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);

  }

  @Test
  public void test368() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test368"); }


    int i1 = java.lang.Integer.signum(548339750);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 1);

  }

  @Test
  public void test369() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test369"); }


    int i2 = java.lang.Integer.rotateLeft(20, 8388608);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 20);

  }

  @Test
  public void test370() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test370"); }


    java.lang.Integer i1 = new java.lang.Integer("26");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 26+ "'", i1.equals(26));

  }

  @Test
  public void test371() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test371"); }


    int i2 = java.lang.Integer.remainderUnsigned(1108377636, 638386176);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 469991460);

  }

  @Test
  public void test372() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test372"); }


    tp2.IP iP0 = null;
    tp2.IPBan iPBan2 = new tp2.IPBan(iP0, (java.lang.Long)10L);
    java.lang.Long long3 = iPBan2.getExpires();
    tp2.IP iP4 = iPBan2.getIp();
    iPBan2.setExpires((java.lang.Long)100L);
    java.lang.Long long7 = iPBan2.expires;
    iPBan2.setExpires((java.lang.Long)35320L);
    tp2.IP iP10 = iPBan2.ip;
    tp2.IP iP11 = iPBan2.ip;
    tp2.IP iP12 = iPBan2.getIp();
    java.lang.Long long13 = iPBan2.expires;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L+ "'", long3.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L+ "'", long7.equals(100L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long13 + "' != '" + 35320L+ "'", long13.equals(35320L));

  }

  @Test
  public void test373() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test373"); }


    java.lang.Integer i1 = new java.lang.Integer(38000000);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 38000000+ "'", i1.equals(38000000));

  }

  @Test
  public void test374() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test374"); }


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
    tp2.ITime iTime29 = null;
    server0.setTime(iTime29);
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
    iP48.setFourth((java.lang.Integer)(-2147483620));
    boolean b54 = server31.removeBan(iP48);
    java.lang.Integer i55 = iP48.getSecond();
    boolean b56 = server0.removeBan(iP48);
    iP48.setSecond((java.lang.Integer)524288);
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
    iP71.setFourth((java.lang.Integer)(-2147483620));
    tp2.IPBan iPBan78 = new tp2.IPBan(iP71, (java.lang.Long)(-1L));
    boolean b79 = iP48.equals((java.lang.Object)(-1L));
    iP48.setFirst((java.lang.Integer)32);
    iP48.setThird((java.lang.Integer)28);
    
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
    org.junit.Assert.assertTrue(b54 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i55 + "' != '" + (-2147483648)+ "'", i55.equals((-2147483648)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b56 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP62);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long63 + "' != '" + 10L+ "'", long63.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b72 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i73 + "' != '" + 161+ "'", i73.equals(161));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b79 == false);

  }

  @Test
  public void test375() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test375"); }


    int i2 = java.lang.Integer.max(480, 161);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 480);

  }

  @Test
  public void test376() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test376"); }


    java.lang.String str1 = java.lang.Integer.toOctalString(62);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "76"+ "'", str1.equals("76"));

  }

  @Test
  public void test377() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test377"); }


    int i1 = java.lang.Integer.numberOfLeadingZeros(8000000);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 9);

  }

  @Test
  public void test378() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test378"); }


    java.lang.Integer i1 = new java.lang.Integer((-2144814612));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + (-2144814612)+ "'", i1.equals((-2144814612)));

  }

  @Test
  public void test379() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test379"); }


    // The following exception was thrown during execution in test generation
    try {
      java.lang.Integer i1 = java.lang.Integer.valueOf("21000000002");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test380() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test380"); }


    java.lang.String str1 = java.lang.Integer.toBinaryString((-2080374703));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "10000100000000000000000001010001"+ "'", str1.equals("10000100000000000000000001010001"));

  }

  @Test
  public void test381() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test381"); }


    java.lang.Integer i1 = java.lang.Integer.getInteger("10000000000000000000000000000010");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);

  }

  @Test
  public void test382() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test382"); }


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
    tp2.IP iP82 = new tp2.IP((java.lang.Integer)3997696, (java.lang.Integer)12, (java.lang.Integer)21, (java.lang.Integer)79);
    boolean b83 = server0.addException(iP82);
    tp2.IP iP84 = null;
    boolean b85 = server0.addException(iP84);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b83 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b85 == false);

  }

  @Test
  public void test383() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test383"); }


    // The following exception was thrown during execution in test generation
    try {
      java.lang.Integer i1 = java.lang.Integer.valueOf("1b7c515d");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test384() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test384"); }


    java.lang.String str1 = java.lang.Integer.toUnsignedString(64000000);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "64000000"+ "'", str1.equals("64000000"));

  }

  @Test
  public void test385() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test385"); }


    java.lang.String str2 = java.lang.Integer.toUnsignedString(1638400, 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1638400"+ "'", str2.equals("1638400"));

  }

  @Test
  public void test386() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test386"); }


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
    java.lang.Integer i27 = iP21.getThird();
    
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
    org.junit.Assert.assertTrue("'" + i27 + "' != '" + 939524096+ "'", i27.equals(939524096));

  }

  @Test
  public void test387() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test387"); }


    int i1 = java.lang.Integer.parseInt("6446");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 6446);

  }

  @Test
  public void test388() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test388"); }


    // The following exception was thrown during execution in test generation
    try {
      int i1 = java.lang.Integer.parseUnsignedInt("1011011001000");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test389() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test389"); }


    int i2 = java.lang.Integer.remainderUnsigned((-804847616), (-905969531));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 101121915);

  }

  @Test
  public void test390() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test390"); }


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
    tp2.ITime iTime31 = null;
    server0.setTime(iTime31);
    tp2.Server server33 = new tp2.Server();
    tp2.IP iP34 = null;
    boolean b35 = server33.addBan(iP34);
    server33.update();
    tp2.IP iP37 = null;
    tp2.IPBan iPBan39 = new tp2.IPBan(iP37, (java.lang.Long)10L);
    tp2.IP iP40 = iPBan39.getIp();
    java.lang.Long long41 = iPBan39.expires;
    tp2.IP iP42 = null;
    iPBan39.ip = iP42;
    tp2.Server server44 = new tp2.Server();
    tp2.IP iP49 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b50 = server44.removeException(iP49);
    java.lang.Integer i51 = iP49.getFirst();
    iPBan39.setIp(iP49);
    java.lang.Integer i53 = iP49.getFirst();
    java.lang.Integer i54 = iP49.getFirst();
    boolean b55 = server33.addBan(iP49);
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
    boolean b78 = server33.connect(iP73);
    java.lang.Integer i79 = iP73.getThird();
    boolean b80 = server0.connect(iP73);
    java.lang.Integer i81 = iP73.getFourth();
    
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
    org.junit.Assert.assertTrue(b35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long41 + "' != '" + 10L+ "'", long41.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b50 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i51 + "' != '" + 161+ "'", i51.equals(161));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i53 + "' != '" + 161+ "'", i53.equals(161));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i54 + "' != '" + 161+ "'", i54.equals(161));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b55 == true);
    
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
    org.junit.Assert.assertTrue(b78 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i79 + "' != '" + 939524096+ "'", i79.equals(939524096));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b80 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i81 + "' != '" + 5+ "'", i81.equals(5));

  }

  @Test
  public void test391() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test391"); }


    int i1 = java.lang.Integer.numberOfTrailingZeros(554172354);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 1);

  }

  @Test
  public void test392() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test392"); }


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
    tp2.Server server63 = new tp2.Server();
    tp2.IP iP68 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b69 = server63.removeException(iP68);
    server63.update();
    tp2.Server server71 = new tp2.Server();
    tp2.IP iP76 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b77 = server71.removeException(iP76);
    java.lang.Integer i78 = iP76.getFirst();
    boolean b79 = server63.addBan(iP76);
    tp2.IP iP84 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    iP84.setFirst((java.lang.Integer)161);
    boolean b88 = iP84.equals((java.lang.Object)56);
    boolean b89 = server63.connect(iP84);
    iP84.setFourth((java.lang.Integer)419432893);
    boolean b92 = server0.addException(iP84);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b69 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b77 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i78 + "' != '" + 161+ "'", i78.equals(161));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b79 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b88 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b89 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b92 == true);

  }

  @Test
  public void test393() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test393"); }


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
    iP66.setFourth((java.lang.Integer)1141932196);
    
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

  }

  @Test
  public void test394() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test394"); }


    int i2 = java.lang.Integer.sum(1170000000, 2082996226);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == (-1041971070));

  }

  @Test
  public void test395() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test395"); }


    int i1 = java.lang.Integer.reverse(2362614);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 1865425920);

  }

  @Test
  public void test396() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test396"); }


    int i1 = java.lang.Integer.signum(433906373);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 1);

  }

  @Test
  public void test397() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test397"); }


    int i2 = java.lang.Integer.min(73728, 62);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 62);

  }

  @Test
  public void test398() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test398"); }


    java.lang.Integer i1 = java.lang.Integer.getInteger("146661001366");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);

  }

  @Test
  public void test399() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test399"); }


    int i2 = java.lang.Integer.compare(5211392, 2456);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);

  }

  @Test
  public void test400() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test400"); }


    int i2 = java.lang.Integer.rotateRight(32, 38000035);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 4);

  }

  @Test
  public void test401() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test401"); }


    int i2 = java.lang.Integer.compareUnsigned(2114, 100663296);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == (-1));

  }

  @Test
  public void test402() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test402"); }


    java.lang.String str1 = java.lang.Integer.toUnsignedString((-1021043707));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "3273923589"+ "'", str1.equals("3273923589"));

  }

  @Test
  public void test403() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test403"); }


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
    java.lang.Long long78 = iPBan2.expires;
    iPBan2.setExpires((java.lang.Long)5211392L);
    
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
    org.junit.Assert.assertTrue("'" + long78 + "' != '" + 10L+ "'", long78.equals(10L));

  }

  @Test
  public void test404() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test404"); }


    // The following exception was thrown during execution in test generation
    try {
      java.lang.Integer i1 = java.lang.Integer.valueOf("2147483648");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test405() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test405"); }


    int i1 = java.lang.Integer.parseUnsignedInt("100000100");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 100000100);

  }

  @Test
  public void test406() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test406"); }


    tp2.IP iP0 = null;
    tp2.IPBan iPBan2 = new tp2.IPBan(iP0, (java.lang.Long)10L);
    tp2.IP iP3 = iPBan2.getIp();
    java.lang.Long long4 = iPBan2.expires;
    tp2.IP iP5 = null;
    iPBan2.ip = iP5;
    iPBan2.setExpires((java.lang.Long)(-1L));
    java.lang.Long long9 = iPBan2.getExpires();
    tp2.IP iP10 = iPBan2.getIp();
    tp2.IP iP11 = iPBan2.ip;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L+ "'", long4.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L)+ "'", long9.equals((-1L)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP11);

  }

  @Test
  public void test407() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test407"); }


    int i1 = java.lang.Integer.bitCount(1108377636);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 6);

  }

  @Test
  public void test408() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test408"); }


    int i2 = java.lang.Integer.sum(8388608, 1583334);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 9971942);

  }

  @Test
  public void test409() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test409"); }


    // The following exception was thrown during execution in test generation
    try {
      korat.finitization.IFinitization iFinitization1 = tp2.Server.finServer(165);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test410() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test410"); }


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
    tp2.IP iP53 = new tp2.IP((java.lang.Integer)38, (java.lang.Integer)1010000000, (java.lang.Integer)44410945, (java.lang.Integer)112160);
    boolean b54 = server0.removeBan(iP53);
    
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
    org.junit.Assert.assertTrue(b54 == false);

  }

  @Test
  public void test411() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test411"); }


    long long1 = java.lang.Integer.toUnsignedLong(130027904);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == 130027904L);

  }

  @Test
  public void test412() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test412"); }


    int i2 = java.lang.Integer.remainderUnsigned(100, 60408026);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 100);

  }

  @Test
  public void test413() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test413"); }


    int i2 = java.lang.Integer.divideUnsigned(28672, 1342177280);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);

  }

  @Test
  public void test414() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test414"); }


    int i2 = java.lang.Integer.compareUnsigned(1072143, 1010);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);

  }

  @Test
  public void test415() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test415"); }


    int i1 = java.lang.Integer.numberOfTrailingZeros((-40025));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);

  }

  @Test
  public void test416() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test416"); }


    java.lang.Integer i1 = java.lang.Integer.getInteger("469761943");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);

  }

  @Test
  public void test417() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test417"); }


    int i2 = java.lang.Integer.sum(1638400, 1344);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1639744);

  }

  @Test
  public void test418() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test418"); }


    int i1 = java.lang.Integer.numberOfTrailingZeros(80000000);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 10);

  }

  @Test
  public void test419() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test419"); }


    // The following exception was thrown during execution in test generation
    try {
      int i2 = java.lang.Integer.parseUnsignedInt("1430224341143", 800);
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

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test420"); }


    // The following exception was thrown during execution in test generation
    try {
      int i1 = java.lang.Integer.parseInt("146661001366");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test421() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test421"); }


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
    tp2.IP iP37 = null;
    boolean b38 = server36.addBan(iP37);
    tp2.Server server39 = new tp2.Server();
    tp2.IP iP44 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b45 = server39.removeException(iP44);
    boolean b47 = iP44.equals((java.lang.Object)(-1L));
    boolean b48 = server36.removeBan(iP44);
    tp2.IP iP53 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    iP53.setFirst((java.lang.Integer)161);
    iP53.setThird((java.lang.Integer)3);
    iP53.setFirst((java.lang.Integer)26);
    boolean b60 = server36.connect(iP53);
    iP53.setSecond((java.lang.Integer)1677721761);
    boolean b63 = server28.removeBan(iP53);
    tp2.Server server64 = new tp2.Server();
    tp2.IP iP65 = null;
    boolean b66 = server64.addBan(iP65);
    server64.update();
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
    iP85.setFourth((java.lang.Integer)(-2147483620));
    boolean b91 = server68.removeBan(iP85);
    boolean b92 = server64.addException(iP85);
    boolean b93 = server28.removeBan(iP85);
    iPBan2.setIp(iP85);
    iPBan2.expires = 3L;
    tp2.IP iP97 = null;
    iPBan2.setIp(iP97);
    
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
    org.junit.Assert.assertTrue(b38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b47 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b48 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b60 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b63 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b66 == false);
    
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
    org.junit.Assert.assertTrue(b91 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b92 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b93 == false);

  }

  @Test
  public void test422() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test422"); }


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
    tp2.IP iP29 = null;
    tp2.IPBan iPBan31 = new tp2.IPBan(iP29, (java.lang.Long)10L);
    tp2.IP iP32 = iPBan31.getIp();
    java.lang.Long long33 = iPBan31.expires;
    tp2.Server server34 = new tp2.Server();
    tp2.IP iP39 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b40 = server34.removeException(iP39);
    java.lang.Integer i41 = iP39.getFirst();
    iPBan31.setIp(iP39);
    java.lang.Integer i43 = iP39.getThird();
    iP39.setFirst((java.lang.Integer)800);
    boolean b46 = server0.addBan(iP39);
    tp2.IP iP47 = null;
    tp2.IPBan iPBan49 = new tp2.IPBan(iP47, (java.lang.Long)10L);
    tp2.IP iP50 = iPBan49.getIp();
    tp2.IP iP55 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    iP55.setFirst((java.lang.Integer)161);
    iP55.setThird((java.lang.Integer)3);
    iP55.setFirst((java.lang.Integer)26);
    iPBan49.ip = iP55;
    tp2.IP iP63 = iPBan49.getIp();
    tp2.Server server64 = new tp2.Server();
    tp2.IP iP65 = null;
    boolean b66 = server64.addBan(iP65);
    server64.update();
    tp2.IP iP72 = new tp2.IP((java.lang.Integer)31, (java.lang.Integer)31, (java.lang.Integer)31, (java.lang.Integer)0);
    boolean b73 = server64.removeBan(iP72);
    server64.update();
    tp2.IP iP79 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    iP79.setFirst((java.lang.Integer)161);
    iP79.setThird((java.lang.Integer)3);
    iP79.setFirst((java.lang.Integer)26);
    iP79.setFirst((java.lang.Integer)(-2147483592));
    boolean b88 = server64.removeBan(iP79);
    iPBan49.ip = iP79;
    tp2.IP iP90 = iPBan49.ip;
    java.lang.Integer i91 = iP90.getFirst();
    java.lang.Integer i92 = iP90.getFourth();
    boolean b93 = server0.removeBan(iP90);
    
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
    org.junit.Assert.assertNull(iP32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long33 + "' != '" + 10L+ "'", long33.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i41 + "' != '" + 161+ "'", i41.equals(161));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i43 + "' != '" + 939524096+ "'", i43.equals(939524096));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b46 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP63);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b66 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b73 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b88 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP90);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i91 + "' != '" + (-2147483592)+ "'", i91.equals((-2147483592)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i92 + "' != '" + 5+ "'", i92.equals(5));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b93 == false);

  }

  @Test
  public void test423() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test423"); }


    int i1 = java.lang.Integer.lowestOneBit(4000);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 32);

  }

  @Test
  public void test424() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test424"); }


    java.lang.String str1 = java.lang.Integer.toOctalString((-951058434));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "30723777776"+ "'", str1.equals("30723777776"));

  }

  @Test
  public void test425() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test425"); }


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
    tp2.ITime iTime36 = null;
    server0.setTime(iTime36);
    tp2.IP iP38 = null;
    boolean b39 = server0.removeBan(iP38);
    
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
    org.junit.Assert.assertTrue(b39 == false);

  }

  @Test
  public void test426() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test426"); }


    java.lang.String str2 = java.lang.Integer.toUnsignedString(66664134, 2621440);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "66664134"+ "'", str2.equals("66664134"));

  }

  @Test
  public void test427() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test427"); }


    int i2 = java.lang.Integer.min(501988245, 1638400);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1638400);

  }

  @Test
  public void test428() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test428"); }


    java.lang.String str1 = java.lang.Integer.toUnsignedString(1245184);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "1245184"+ "'", str1.equals("1245184"));

  }

  @Test
  public void test429() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test429"); }


    java.lang.String str1 = java.lang.Integer.toHexString(5211392);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "4f8500"+ "'", str1.equals("4f8500"));

  }

  @Test
  public void test430() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test430"); }


    int i2 = java.lang.Integer.remainderUnsigned((-2147483620), 1170000000);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 977483676);

  }

  @Test
  public void test431() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test431"); }


    tp2.Server server0 = new tp2.Server();
    tp2.IP iP1 = null;
    boolean b2 = server0.addBan(iP1);
    tp2.IP iP7 = new tp2.IP((java.lang.Integer)31, (java.lang.Integer)31, (java.lang.Integer)31, (java.lang.Integer)0);
    iP7.setSecond((java.lang.Integer)2147483647);
    boolean b10 = server0.addBan(iP7);
    tp2.Server server11 = new tp2.Server();
    tp2.IP iP16 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b17 = server11.removeException(iP16);
    iP16.setThird((java.lang.Integer)56);
    java.lang.Integer i20 = iP16.getFourth();
    tp2.IPBan iPBan22 = new tp2.IPBan(iP16, (java.lang.Long)10L);
    java.lang.Long long23 = iPBan22.expires;
    tp2.Server server24 = new tp2.Server();
    tp2.IP iP25 = null;
    boolean b26 = server24.addBan(iP25);
    tp2.IP iP31 = new tp2.IP((java.lang.Integer)31, (java.lang.Integer)31, (java.lang.Integer)31, (java.lang.Integer)0);
    iP31.setSecond((java.lang.Integer)2147483647);
    boolean b34 = server24.addBan(iP31);
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
    boolean b57 = server24.removeBan(iP52);
    tp2.IP iP62 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    iP62.setFirst((java.lang.Integer)161);
    iP62.setThird((java.lang.Integer)3);
    iP62.setFirst((java.lang.Integer)26);
    iP62.setThird((java.lang.Integer)5);
    boolean b71 = server24.removeBan(iP62);
    java.lang.Object obj72 = null;
    boolean b73 = iP62.equals(obj72);
    iPBan22.setIp(iP62);
    tp2.IP iP75 = iPBan22.getIp();
    boolean b76 = server0.addBan(iP75);
    server0.update();
    tp2.Server server78 = new tp2.Server();
    tp2.IP iP83 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b84 = server78.removeException(iP83);
    boolean b86 = iP83.equals((java.lang.Object)(-1L));
    iP83.setFourth((java.lang.Integer)28);
    iP83.setThird((java.lang.Integer)100004);
    boolean b91 = server0.addBan(iP83);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i20 + "' != '" + 5+ "'", i20.equals(5));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long23 + "' != '" + 10L+ "'", long23.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
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
    org.junit.Assert.assertTrue(b56 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b57 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b71 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b73 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP75);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b76 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b84 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b86 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b91 == true);

  }

  @Test
  public void test432() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test432"); }


    int i2 = java.lang.Integer.min(503, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == (-1));

  }

  @Test
  public void test433() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test433"); }


    java.lang.Integer i1 = java.lang.Integer.valueOf("205");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 205+ "'", i1.equals(205));

  }

  @Test
  public void test434() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test434"); }


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
    tp2.IP iP81 = iPBan33.ip;
    tp2.IPBan iPBan83 = new tp2.IPBan(iP81, (java.lang.Long)1779048192L);
    tp2.IPBan iPBan85 = new tp2.IPBan(iP81, (java.lang.Long)50000010L);
    
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
    org.junit.Assert.assertNotNull(iP81);

  }

  @Test
  public void test435() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test435"); }


    java.lang.String str2 = java.lang.Integer.toUnsignedString(1677721600, 638386176);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1677721600"+ "'", str2.equals("1677721600"));

  }

  @Test
  public void test436() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test436"); }


    java.lang.String str1 = java.lang.Integer.toUnsignedString((-671088640));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "3623878656"+ "'", str1.equals("3623878656"));

  }

  @Test
  public void test437() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test437"); }


    // The following exception was thrown during execution in test generation
    try {
      java.lang.Integer i2 = java.lang.Integer.valueOf("1170000000", 4096);
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

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test438"); }


    int i1 = java.lang.Integer.reverse(101121915);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == (-553688992));

  }

  @Test
  public void test439() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test439"); }


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
    tp2.IP iP69 = null;
    tp2.IPBan iPBan71 = new tp2.IPBan(iP69, (java.lang.Long)10L);
    tp2.IP iP72 = iPBan71.getIp();
    tp2.IP iP77 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    iP77.setFirst((java.lang.Integer)161);
    iP77.setThird((java.lang.Integer)3);
    iP77.setFirst((java.lang.Integer)26);
    iPBan71.ip = iP77;
    iP77.setThird((java.lang.Integer)1476395008);
    tp2.IPBan iPBan88 = new tp2.IPBan(iP77, (java.lang.Long)2707685376L);
    tp2.IP iP89 = iPBan88.ip;
    iP89.setSecond((java.lang.Integer)70);
    boolean b92 = server0.connect(iP89);
    java.lang.Integer i93 = iP89.getThird();
    iP89.setSecond((java.lang.Integer)1888747520);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP72);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP89);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b92 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i93 + "' != '" + 1476395008+ "'", i93.equals(1476395008));

  }

  @Test
  public void test440() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test440"); }


    int i2 = java.lang.Integer.remainderUnsigned(0, 163387718);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);

  }

  @Test
  public void test441() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test441"); }


    tp2.IP iP4 = new tp2.IP((java.lang.Integer)1437910020, (java.lang.Integer)229376, (java.lang.Integer)469761943, (java.lang.Integer)1677721600);
    tp2.IPBan iPBan6 = new tp2.IPBan(iP4, (java.lang.Long)2707685376L);
    tp2.IP iP7 = null;
    tp2.IPBan iPBan9 = new tp2.IPBan(iP7, (java.lang.Long)10L);
    tp2.IP iP10 = iPBan9.getIp();
    java.lang.Long long11 = iPBan9.expires;
    tp2.IP iP12 = null;
    iPBan9.ip = iP12;
    tp2.Server server14 = new tp2.Server();
    tp2.IP iP19 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b20 = server14.removeException(iP19);
    java.lang.Integer i21 = iP19.getFirst();
    iPBan9.setIp(iP19);
    tp2.IP iP23 = iPBan9.getIp();
    iPBan9.expires = 2147483676L;
    boolean b26 = iP4.equals((java.lang.Object)iPBan9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long11 + "' != '" + 10L+ "'", long11.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i21 + "' != '" + 161+ "'", i21.equals(161));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);

  }

  @Test
  public void test442() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test442"); }


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
    iPBan2.setExpires((java.lang.Long)3855024127L);
    
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

  }

  @Test
  public void test443() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test443"); }


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
    tp2.IP iP33 = iPBan32.getIp();
    java.lang.Long long34 = iPBan32.expires;
    tp2.IP iP35 = null;
    iPBan32.ip = iP35;
    tp2.IP iP37 = null;
    tp2.IPBan iPBan39 = new tp2.IPBan(iP37, (java.lang.Long)10L);
    tp2.IP iP40 = iPBan39.getIp();
    java.lang.Long long41 = iPBan39.expires;
    tp2.Server server42 = new tp2.Server();
    tp2.IP iP47 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b48 = server42.removeException(iP47);
    java.lang.Integer i49 = iP47.getFirst();
    iPBan39.setIp(iP47);
    tp2.IP iP51 = iPBan39.ip;
    tp2.IP iP52 = iPBan39.getIp();
    iPBan32.setIp(iP52);
    tp2.IP iP58 = new tp2.IP((java.lang.Integer)31, (java.lang.Integer)(-2147483592), (java.lang.Integer)133, (java.lang.Integer)(-2147483646));
    iPBan32.setIp(iP58);
    iP58.setFourth((java.lang.Integer)84410411);
    iP58.setFourth((java.lang.Integer)130027904);
    boolean b64 = server0.connect(iP58);
    
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
    org.junit.Assert.assertNull(iP40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long41 + "' != '" + 10L+ "'", long41.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b48 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i49 + "' != '" + 161+ "'", i49.equals(161));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b64 == true);

  }

  @Test
  public void test444() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test444"); }


    java.lang.Integer i2 = java.lang.Integer.getInteger("64000000", 101121915);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i2 + "' != '" + 101121915+ "'", i2.equals(101121915));

  }

  @Test
  public void test445() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test445"); }


    java.lang.Integer i1 = new java.lang.Integer("6024346");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 6024346+ "'", i1.equals(6024346));

  }

  @Test
  public void test446() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test446"); }


    tp2.IP iP4 = new tp2.IP((java.lang.Integer)21916899, (java.lang.Integer)1000, (java.lang.Integer)(-2144814612), (java.lang.Integer)134217720);

  }

  @Test
  public void test447() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test447"); }


    int i2 = java.lang.Integer.sum(321, 554172354);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 554172675);

  }

  @Test
  public void test448() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test448"); }


    int i1 = java.lang.Integer.numberOfLeadingZeros(38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 26);

  }

  @Test
  public void test449() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test449"); }


    // The following exception was thrown during execution in test generation
    try {
      java.lang.Integer i1 = java.lang.Integer.decode("8500004f");
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

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test450"); }


    long long1 = java.lang.Integer.toUnsignedLong(70);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == 70L);

  }

  @Test
  public void test451() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test451"); }


    // The following exception was thrown during execution in test generation
    try {
      int i2 = java.lang.Integer.parseInt("1010", 63740400);
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

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test452"); }


    int i2 = java.lang.Integer.rotateLeft(83, 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 83);

  }

  @Test
  public void test453() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test453"); }


    int i2 = java.lang.Integer.rotateRight(448, 1583334);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 7);

  }

  @Test
  public void test454() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test454"); }


    // The following exception was thrown during execution in test generation
    try {
      java.lang.Integer i2 = java.lang.Integer.valueOf("1b7c515d", 700000);
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test455() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test455"); }


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
    tp2.ITime iTime21 = null;
    server0.setTime(iTime21);
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
    org.junit.Assert.assertTrue(b19 == true);

  }

  @Test
  public void test456() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test456"); }


    int i2 = java.lang.Integer.compare(740, 83);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);

  }

  @Test
  public void test457() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test457"); }


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
    iPBan19.expires = 5L;
    
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

  }

  @Test
  public void test458() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test458"); }


    java.lang.String str1 = java.lang.Integer.toOctalString((-2080374783));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "20400000001"+ "'", str1.equals("20400000001"));

  }

  @Test
  public void test459() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test459"); }


    // The following exception was thrown during execution in test generation
    try {
      java.lang.Integer i2 = java.lang.Integer.valueOf("1108377608", 33554432);
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

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test460"); }


    int i1 = java.lang.Integer.reverseBytes(1270);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == (-167510016));

  }

  @Test
  public void test461() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test461"); }


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
    tp2.IP iP61 = null;
    tp2.IPBan iPBan63 = new tp2.IPBan(iP61, (java.lang.Long)10L);
    tp2.IP iP64 = iPBan63.getIp();
    java.lang.Long long65 = iPBan63.expires;
    tp2.IP iP66 = null;
    iPBan63.ip = iP66;
    java.lang.Long long68 = iPBan63.expires;
    tp2.Server server69 = new tp2.Server();
    tp2.IP iP74 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b75 = server69.removeException(iP74);
    iP74.setThird((java.lang.Integer)56);
    java.lang.Integer i78 = iP74.getFourth();
    tp2.IPBan iPBan80 = new tp2.IPBan(iP74, (java.lang.Long)10L);
    iPBan63.setIp(iP74);
    tp2.IP iP82 = iPBan63.getIp();
    iPBan2.ip = iP82;
    
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
    org.junit.Assert.assertNull(iP64);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long65 + "' != '" + 10L+ "'", long65.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long68 + "' != '" + 10L+ "'", long68.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b75 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i78 + "' != '" + 5+ "'", i78.equals(5));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP82);

  }

  @Test
  public void test462() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test462"); }


    java.lang.Integer i2 = java.lang.Integer.getInteger("146661001366", 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i2 + "' != '" + 0+ "'", i2.equals(0));

  }

  @Test
  public void test463() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test463"); }


    int i2 = java.lang.Integer.sum(1073741825, 62);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1073741887);

  }

  @Test
  public void test464() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test464"); }


    korat.finitization.IFinitization iFinitization1 = tp2.Server.finServer(13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iFinitization1);

  }

  @Test
  public void test465() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test465"); }


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
    java.lang.Long long35 = iPBan11.getExpires();
    java.lang.Long long36 = iPBan11.getExpires();
    iPBan11.setExpires((java.lang.Long)134217728L);
    
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
    org.junit.Assert.assertTrue("'" + long35 + "' != '" + 10L+ "'", long35.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long36 + "' != '" + 10L+ "'", long36.equals(10L));

  }

  @Test
  public void test466() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test466"); }


    int i1 = java.lang.Integer.reverse(14379100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 974576384);

  }

  @Test
  public void test467() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test467"); }


    int i1 = java.lang.Integer.signum(469762049);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 1);

  }

  @Test
  public void test468() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test468"); }


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
    java.lang.Object obj59 = null;
    boolean b60 = iP56.equals(obj59);
    iP56.setThird((java.lang.Integer)501988245);
    
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
    org.junit.Assert.assertTrue(b60 == false);

  }

  @Test
  public void test469() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test469"); }


    // The following exception was thrown during execution in test generation
    try {
      int i2 = java.lang.Integer.parseInt("2362614", 186646533);
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test470() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test470"); }


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
    java.lang.Integer i63 = iP57.getSecond();
    java.lang.Integer i64 = iP57.getSecond();
    
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
    org.junit.Assert.assertTrue("'" + i63 + "' != '" + (-2147483648)+ "'", i63.equals((-2147483648)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i64 + "' != '" + (-2147483648)+ "'", i64.equals((-2147483648)));

  }

  @Test
  public void test471() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test471"); }


    int i1 = java.lang.Integer.highestOneBit(4897831);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 4194304);

  }

  @Test
  public void test472() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test472"); }


    java.lang.String str2 = java.lang.Integer.toUnsignedString(939524096, 165);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "939524096"+ "'", str2.equals("939524096"));

  }

  @Test
  public void test473() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test473"); }


    tp2.Server server0 = new tp2.Server();
    tp2.IP iP5 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b6 = server0.removeException(iP5);
    server0.update();
    tp2.Server server8 = new tp2.Server();
    tp2.IP iP13 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b14 = server8.removeException(iP13);
    java.lang.Integer i15 = iP13.getFirst();
    boolean b16 = server0.addBan(iP13);
    tp2.IPBan iPBan18 = new tp2.IPBan(iP13, (java.lang.Long)(-1L));
    tp2.IP iP19 = iPBan18.getIp();
    java.lang.Long long20 = iPBan18.getExpires();
    iPBan18.expires = 4329604L;
    tp2.IP iP23 = iPBan18.getIp();
    java.lang.Integer i24 = iP23.getSecond();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i15 + "' != '" + 161+ "'", i15.equals(161));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-1L)+ "'", long20.equals((-1L)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i24 + "' != '" + (-2147483648)+ "'", i24.equals((-2147483648)));

  }

  @Test
  public void test474() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test474"); }


    java.lang.String str1 = java.lang.Integer.toOctalString((-1067707136));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "30027012400"+ "'", str1.equals("30027012400"));

  }

  @Test
  public void test475() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test475"); }


    int i2 = java.lang.Integer.rotateRight(1073747006, 1010000000);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1073747006);

  }

  @Test
  public void test476() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test476"); }


    java.lang.Integer i1 = java.lang.Integer.valueOf("4329604");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 4329604+ "'", i1.equals(4329604));

  }

  @Test
  public void test477() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test477"); }


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
    java.lang.Integer i28 = iP23.getThird();
    
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
    org.junit.Assert.assertTrue("'" + i28 + "' != '" + 26+ "'", i28.equals(26));

  }

  @Test
  public void test478() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test478"); }


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
    java.lang.Integer i21 = iP19.getFirst();
    iP19.setThird((java.lang.Integer)(-14619));
    
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i21 + "' != '" + 161+ "'", i21.equals(161));

  }

  @Test
  public void test479() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test479"); }


    java.lang.String str1 = java.lang.Integer.toBinaryString(630);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "1001110110"+ "'", str1.equals("1001110110"));

  }

  @Test
  public void test480() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test480"); }


    java.lang.String str2 = java.lang.Integer.toUnsignedString(1622018560, 268503106);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1622018560"+ "'", str2.equals("1622018560"));

  }

  @Test
  public void test481() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test481"); }


    java.lang.String str2 = java.lang.Integer.toUnsignedString(0, (-2147483592));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "0"+ "'", str2.equals("0"));

  }

  @Test
  public void test482() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test482"); }


    tp2.IP iP4 = new tp2.IP((java.lang.Integer)27, (java.lang.Integer)100000, (java.lang.Integer)(-1879048031), (java.lang.Integer)69273664);

  }

  @Test
  public void test483() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test483"); }


    // The following exception was thrown during execution in test generation
    try {
      int i2 = java.lang.Integer.parseUnsignedInt("2120000000", 1337982976);
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test484() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test484"); }


    int i1 = java.lang.Integer.numberOfLeadingZeros((-2147483592));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);

  }

  @Test
  public void test485() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test485"); }


    // The following exception was thrown during execution in test generation
    try {
      java.lang.Integer i1 = new java.lang.Integer("3855024127");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test486() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test486"); }


    int i1 = java.lang.Integer.reverse(63740400);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 261698496);

  }

  @Test
  public void test487() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test487"); }


    tp2.IP iP0 = null;
    tp2.IPBan iPBan2 = new tp2.IPBan(iP0, (java.lang.Long)10L);
    java.lang.Long long3 = iPBan2.getExpires();
    java.lang.Long long4 = iPBan2.expires;
    iPBan2.expires = 4160749568L;
    java.lang.Long long7 = iPBan2.getExpires();
    java.lang.Long long8 = iPBan2.expires;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L+ "'", long3.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L+ "'", long4.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long7 + "' != '" + 4160749568L+ "'", long7.equals(4160749568L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long8 + "' != '" + 4160749568L+ "'", long8.equals(4160749568L));

  }

  @Test
  public void test488() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test488"); }


    int i1 = java.lang.Integer.bitCount(1141932196);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 7);

  }

  @Test
  public void test489() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test489"); }


    int i1 = java.lang.Integer.numberOfTrailingZeros(277);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);

  }

  @Test
  public void test490() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test490"); }


    int i1 = java.lang.Integer.numberOfTrailingZeros(501988245);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);

  }

  @Test
  public void test491() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test491"); }


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
    java.lang.Integer i97 = iP85.getSecond();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i97 + "' != '" + (-2147483648)+ "'", i97.equals((-2147483648)));

  }

  @Test
  public void test492() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test492"); }


    int i2 = java.lang.Integer.compare(33554640, 9079);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);

  }

  @Test
  public void test493() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test493"); }


    int i1 = java.lang.Integer.numberOfTrailingZeros(1107820544);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 19);

  }

  @Test
  public void test494() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test494"); }


    // The following exception was thrown during execution in test generation
    try {
      int i2 = java.lang.Integer.parseInt("30707074200", 20);
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test495() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test495"); }


    tp2.IP iP0 = null;
    tp2.IPBan iPBan2 = new tp2.IPBan(iP0, (java.lang.Long)10L);
    java.lang.Long long3 = iPBan2.getExpires();
    tp2.IP iP4 = iPBan2.getIp();
    java.lang.Long long5 = iPBan2.getExpires();
    iPBan2.expires = 3221225478L;
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
    tp2.IP iP33 = null;
    tp2.IPBan iPBan35 = new tp2.IPBan(iP33, (java.lang.Long)10L);
    java.lang.Long long36 = iPBan35.getExpires();
    tp2.IP iP41 = new tp2.IP((java.lang.Integer)31, (java.lang.Integer)31, (java.lang.Integer)31, (java.lang.Integer)0);
    iPBan35.ip = iP41;
    iP41.setFirst((java.lang.Integer)2);
    boolean b45 = server8.connect(iP41);
    tp2.Server server46 = new tp2.Server();
    tp2.IP iP51 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b52 = server46.removeException(iP51);
    boolean b53 = server8.addException(iP51);
    iPBan2.setIp(iP51);
    java.lang.Integer i55 = iP51.getSecond();
    iP51.setFourth((java.lang.Integer)1437910020);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L+ "'", long3.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L+ "'", long5.equals(10L));
    
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
    org.junit.Assert.assertTrue("'" + long36 + "' != '" + 10L+ "'", long36.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b52 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b53 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i55 + "' != '" + (-2147483648)+ "'", i55.equals((-2147483648)));

  }

  @Test
  public void test496() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test496"); }


    int i1 = java.lang.Integer.signum(469761943);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 1);

  }

  @Test
  public void test497() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test497"); }


    int i1 = java.lang.Integer.lowestOneBit(100000);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 32);

  }

  @Test
  public void test498() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test498"); }


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
    java.lang.Integer i36 = iP25.getFourth();
    java.lang.Integer i37 = iP25.getSecond();
    iP25.setSecond((java.lang.Integer)1879047781);
    
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
    org.junit.Assert.assertTrue("'" + i36 + "' != '" + 5+ "'", i36.equals(5));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i37 + "' != '" + (-2147483648)+ "'", i37.equals((-2147483648)));

  }

  @Test
  public void test499() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test499"); }


    int i2 = java.lang.Integer.max(0, 469761943);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 469761943);

  }

  @Test
  public void test500() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test500"); }


    // The following exception was thrown during execution in test generation
    try {
      int i2 = java.lang.Integer.parseInt("277", 17104896);
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

}
