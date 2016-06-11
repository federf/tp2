package randoopTestsServer1;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest2 {

  public static boolean debug = false;

  @Test
  public void test001() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test001"); }


    java.lang.Integer i2 = java.lang.Integer.getInteger("10101000000000000000110100100", (java.lang.Integer)458752);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i2 + "' != '" + 458752+ "'", i2.equals(458752));

  }

  @Test
  public void test002() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test002"); }


    int i2 = java.lang.Integer.parseInt("111", 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 7);

  }

  @Test
  public void test003() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test003"); }


    java.lang.Integer i2 = java.lang.Integer.getInteger("3400000000", (java.lang.Integer)352322596);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i2 + "' != '" + 352322596+ "'", i2.equals(352322596));

  }

  @Test
  public void test004() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test004"); }


    int i2 = java.lang.Integer.rotateLeft(469762048, 1342177288);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 28);

  }

  @Test
  public void test005() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test005"); }


    java.lang.String str1 = java.lang.Integer.toBinaryString(4329604);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "10000100001000010000100"+ "'", str1.equals("10000100001000010000100"));

  }

  @Test
  public void test006() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test006"); }


    java.lang.String str1 = java.lang.Integer.toOctalString(14379100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "66664134"+ "'", str1.equals("66664134"));

  }

  @Test
  public void test007() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test007"); }


    // The following exception was thrown during execution in test generation
    try {
      java.lang.Integer i1 = java.lang.Integer.decode("89f8");
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

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test008"); }


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
    java.lang.Long long44 = iPBan2.expires;
    
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
    org.junit.Assert.assertTrue("'" + long44 + "' != '" + 10L+ "'", long44.equals(10L));

  }

  @Test
  public void test009() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test009"); }


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
    java.lang.Integer i38 = iP33.getSecond();
    
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
    org.junit.Assert.assertTrue("'" + i38 + "' != '" + 80000085+ "'", i38.equals(80000085));

  }

  @Test
  public void test010() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test010"); }


    java.lang.Integer i1 = java.lang.Integer.valueOf(1073741825);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 1073741825+ "'", i1.equals(1073741825));

  }

  @Test
  public void test011() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test011"); }


    java.lang.String str1 = java.lang.Integer.toUnsignedString((-150929408));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "4144037888"+ "'", str1.equals("4144037888"));

  }

  @Test
  public void test012() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test012"); }


    // The following exception was thrown during execution in test generation
    try {
      korat.finitization.IFinitization iFinitization1 = tp2.Server.finServer(458752);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test013() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test013"); }


    int i1 = java.lang.Integer.lowestOneBit(1073741824);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 1073741824);

  }

  @Test
  public void test014() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test014"); }


    int i2 = java.lang.Integer.divideUnsigned((-219971585), 832);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 4897831);

  }

  @Test
  public void test015() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test015"); }


    int i2 = java.lang.Integer.compareUnsigned(700000, 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);

  }

  @Test
  public void test016() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test016"); }


    java.lang.Integer i1 = java.lang.Integer.valueOf(4329604);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 4329604+ "'", i1.equals(4329604));

  }

  @Test
  public void test017() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test017"); }


    java.lang.String str1 = java.lang.Integer.toHexString(35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "23"+ "'", str1.equals("23"));

  }

  @Test
  public void test018() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test018"); }


    int i1 = java.lang.Integer.numberOfLeadingZeros(25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 27);

  }

  @Test
  public void test019() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test019"); }


    int i2 = java.lang.Integer.sum(84410368, 43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 84410411);

  }

  @Test
  public void test020() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test020"); }


    java.lang.String str1 = java.lang.Integer.toOctalString(111);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "157"+ "'", str1.equals("157"));

  }

  @Test
  public void test021() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test021"); }


    int i2 = java.lang.Integer.remainderUnsigned(7489, 448);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 321);

  }

  @Test
  public void test022() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test022"); }


    tp2.IP iP0 = null;
    tp2.IPBan iPBan2 = new tp2.IPBan(iP0, (java.lang.Long)10L);
    tp2.IP iP3 = iPBan2.getIp();
    java.lang.Long long4 = iPBan2.expires;
    tp2.IP iP5 = null;
    iPBan2.ip = iP5;
    java.lang.Long long7 = iPBan2.expires;
    iPBan2.setExpires((java.lang.Long)2147483647L);
    tp2.IP iP10 = null;
    tp2.IPBan iPBan12 = new tp2.IPBan(iP10, (java.lang.Long)10L);
    tp2.IP iP13 = iPBan12.getIp();
    java.lang.Long long14 = iPBan12.expires;
    tp2.IP iP15 = null;
    iPBan12.ip = iP15;
    java.lang.Long long17 = iPBan12.getExpires();
    tp2.IP iP22 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    iP22.setFirst((java.lang.Integer)161);
    iP22.setThird((java.lang.Integer)3);
    iP22.setFirst((java.lang.Integer)26);
    iP22.setFirst((java.lang.Integer)(-2147483592));
    java.lang.Long long31 = null;
    tp2.IPBan iPBan32 = new tp2.IPBan(iP22, long31);
    tp2.Server server33 = new tp2.Server();
    tp2.IP iP34 = null;
    boolean b35 = server33.addBan(iP34);
    tp2.IP iP40 = new tp2.IP((java.lang.Integer)31, (java.lang.Integer)31, (java.lang.Integer)31, (java.lang.Integer)0);
    iP40.setSecond((java.lang.Integer)2147483647);
    boolean b43 = server33.addBan(iP40);
    tp2.Server server44 = new tp2.Server();
    tp2.IP iP45 = null;
    boolean b46 = server44.addBan(iP45);
    tp2.ITime iTime47 = null;
    server44.setTime(iTime47);
    tp2.IP iP49 = null;
    tp2.IPBan iPBan51 = new tp2.IPBan(iP49, (java.lang.Long)10L);
    tp2.IP iP52 = iPBan51.getIp();
    java.lang.Long long53 = iPBan51.expires;
    tp2.IP iP54 = null;
    iPBan51.ip = iP54;
    tp2.Server server56 = new tp2.Server();
    tp2.IP iP61 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b62 = server56.removeException(iP61);
    java.lang.Integer i63 = iP61.getFirst();
    iPBan51.setIp(iP61);
    boolean b65 = server44.connect(iP61);
    boolean b66 = server33.removeBan(iP61);
    tp2.IP iP67 = null;
    tp2.IPBan iPBan69 = new tp2.IPBan(iP67, (java.lang.Long)10L);
    java.lang.Long long70 = iPBan69.getExpires();
    tp2.IP iP75 = new tp2.IP((java.lang.Integer)31, (java.lang.Integer)31, (java.lang.Integer)31, (java.lang.Integer)0);
    iPBan69.ip = iP75;
    tp2.Server server77 = new tp2.Server();
    tp2.IP iP82 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b83 = server77.removeException(iP82);
    server77.update();
    tp2.Server server85 = new tp2.Server();
    tp2.IP iP90 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b91 = server85.removeException(iP90);
    java.lang.Integer i92 = iP90.getFirst();
    boolean b93 = server77.addBan(iP90);
    iPBan69.setIp(iP90);
    boolean b95 = server33.addBan(iP90);
    java.lang.Integer i96 = iP90.getSecond();
    iPBan32.setIp(iP90);
    iPBan12.setIp(iP90);
    iPBan2.ip = iP90;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L+ "'", long4.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long7 + "' != '" + 10L+ "'", long7.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long14 + "' != '" + 10L+ "'", long14.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long17 + "' != '" + 10L+ "'", long17.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b43 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b46 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long53 + "' != '" + 10L+ "'", long53.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b62 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i63 + "' != '" + 161+ "'", i63.equals(161));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b65 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b66 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long70 + "' != '" + 10L+ "'", long70.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b83 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b91 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i92 + "' != '" + 161+ "'", i92.equals(161));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b93 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b95 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i96 + "' != '" + (-2147483648)+ "'", i96.equals((-2147483648)));

  }

  @Test
  public void test023() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test023"); }


    int i1 = java.lang.Integer.highestOneBit(64);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 64);

  }

  @Test
  public void test024() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test024"); }


    // The following exception was thrown during execution in test generation
    try {
      korat.finitization.IFinitization iFinitization1 = tp2.Server.finServer(740);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test025() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test025"); }


    java.lang.String str1 = java.lang.Integer.toOctalString(12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "14"+ "'", str1.equals("14"));

  }

  @Test
  public void test026() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test026"); }


    int i1 = java.lang.Integer.parseUnsignedInt("1010");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 1010);

  }

  @Test
  public void test027() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test027"); }


    int i2 = java.lang.Integer.min(0, 448);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);

  }

  @Test
  public void test028() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test028"); }


    int i2 = java.lang.Integer.remainderUnsigned(2048, (-134217728));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 2048);

  }

  @Test
  public void test029() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test029"); }


    int i2 = java.lang.Integer.rotateRight((-2063597489), 38000);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 5211392);

  }

  @Test
  public void test030() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test030"); }


    java.lang.Integer i1 = new java.lang.Integer(16777216);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 16777216+ "'", i1.equals(16777216));

  }

  @Test
  public void test031() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test031"); }


    tp2.IP iP0 = null;
    tp2.IPBan iPBan2 = new tp2.IPBan(iP0, (java.lang.Long)10L);
    tp2.IP iP3 = iPBan2.getIp();
    tp2.IP iP8 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    iP8.setFirst((java.lang.Integer)161);
    iP8.setThird((java.lang.Integer)3);
    iP8.setFirst((java.lang.Integer)26);
    iPBan2.ip = iP8;
    tp2.IP iP16 = iPBan2.getIp();
    iPBan2.expires = 31L;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP16);

  }

  @Test
  public void test032() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test032"); }


    int i1 = java.lang.Integer.bitCount(38000000);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 10);

  }

  @Test
  public void test033() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test033"); }


    int i1 = java.lang.Integer.lowestOneBit(352322596);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 4);

  }

  @Test
  public void test034() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test034"); }


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
    tp2.IP iP29 = null;
    iPBan2.ip = iP29;
    
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
  public void test035() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test035"); }


    int i2 = java.lang.Integer.remainderUnsigned(83, 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 83);

  }

  @Test
  public void test036() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test036"); }


    int i2 = java.lang.Integer.max(0, 50397184);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 50397184);

  }

  @Test
  public void test037() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test037"); }


    int i1 = java.lang.Integer.signum(2013262563);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 1);

  }

  @Test
  public void test038() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test038"); }


    int i1 = java.lang.Integer.reverse(268435466);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 1342177288);

  }

  @Test
  public void test039() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test039"); }


    java.lang.Integer i1 = new java.lang.Integer(84410411);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 84410411+ "'", i1.equals(84410411));

  }

  @Test
  public void test040() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test040"); }


    int i2 = java.lang.Integer.divideUnsigned(64, 31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 2);

  }

  @Test
  public void test041() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test041"); }


    java.lang.Integer i1 = new java.lang.Integer("2048");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 2048+ "'", i1.equals(2048));

  }

  @Test
  public void test042() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test042"); }


    int i1 = java.lang.Integer.signum(133);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 1);

  }

  @Test
  public void test043() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test043"); }


    int i1 = java.lang.Integer.numberOfTrailingZeros(2031690);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 1);

  }

  @Test
  public void test044() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test044"); }


    int i1 = java.lang.Integer.numberOfTrailingZeros(25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);

  }

  @Test
  public void test045() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test045"); }


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
    java.lang.Integer i38 = iP33.getFourth();
    
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
    org.junit.Assert.assertTrue("'" + i38 + "' != '" + 939524096+ "'", i38.equals(939524096));

  }

  @Test
  public void test046() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test046"); }


    java.lang.Integer i2 = java.lang.Integer.getInteger("640000a1", 18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i2 + "' != '" + 18+ "'", i2.equals(18));

  }

  @Test
  public void test047() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test047"); }


    java.lang.Integer i1 = null;
    java.lang.Integer i2 = java.lang.Integer.getInteger("1111111111111111111111111111111", i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i2);

  }

  @Test
  public void test048() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test048"); }


    int i2 = java.lang.Integer.remainderUnsigned(229376, 83886080);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 229376);

  }

  @Test
  public void test049() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test049"); }


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
    java.lang.Integer i44 = iP43.getFirst();
    java.lang.Integer i45 = iP43.getSecond();
    
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
    org.junit.Assert.assertTrue("'" + i44 + "' != '" + (-2147483592)+ "'", i44.equals((-2147483592)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i45 + "' != '" + (-2147483648)+ "'", i45.equals((-2147483648)));

  }

  @Test
  public void test050() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test050"); }


    java.lang.String str1 = java.lang.Integer.toBinaryString(1073741825);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "1000000000000000000000000000001"+ "'", str1.equals("1000000000000000000000000000001"));

  }

  @Test
  public void test051() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test051"); }


    int i2 = java.lang.Integer.compare(5, (-268435820));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);

  }

  @Test
  public void test052() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test052"); }


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
    iPBan2.setExpires((java.lang.Long)(-1L));
    java.lang.Long long44 = iPBan2.expires;
    
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
    org.junit.Assert.assertTrue("'" + long44 + "' != '" + (-1L)+ "'", long44.equals((-1L)));

  }

  @Test
  public void test053() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test053"); }


    java.lang.Integer i1 = java.lang.Integer.getInteger("3");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);

  }

  @Test
  public void test054() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test054"); }


    int i1 = java.lang.Integer.bitCount(268503106);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 5);

  }

  @Test
  public void test055() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test055"); }


    int i2 = java.lang.Integer.parseInt("24131000000", 7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 734718005);

  }

  @Test
  public void test056() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test056"); }


    // The following exception was thrown during execution in test generation
    try {
      java.lang.Integer i1 = java.lang.Integer.valueOf("3d000000");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test057() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test057"); }


    tp2.IP iP0 = null;
    tp2.IPBan iPBan2 = new tp2.IPBan(iP0, (java.lang.Long)10L);
    java.lang.Long long3 = iPBan2.getExpires();
    tp2.IP iP4 = iPBan2.getIp();
    iPBan2.setExpires((java.lang.Long)100L);
    java.lang.Long long7 = iPBan2.expires;
    tp2.IP iP8 = null;
    iPBan2.setIp(iP8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L+ "'", long3.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L+ "'", long7.equals(100L));

  }

  @Test
  public void test058() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test058"); }


    // The following exception was thrown during execution in test generation
    try {
      int i1 = java.lang.Integer.parseInt("a1000000");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test059() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test059"); }


    int i2 = java.lang.Integer.compare(56, 1437910020);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == (-1));

  }

  @Test
  public void test060() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test060"); }


    // The following exception was thrown during execution in test generation
    try {
      int i2 = java.lang.Integer.parseUnsignedInt("229376", 49);
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test061() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test061"); }


    java.lang.String str1 = java.lang.Integer.toBinaryString(640);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "1010000000"+ "'", str1.equals("1010000000"));

  }

  @Test
  public void test062() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test062"); }


    java.lang.String str1 = java.lang.Integer.toOctalString(49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "61"+ "'", str1.equals("61"));

  }

  @Test
  public void test063() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test063"); }


    tp2.Server server0 = new tp2.Server();
    tp2.IP iP5 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b6 = server0.removeException(iP5);
    iP5.setThird((java.lang.Integer)56);
    tp2.IPBan iPBan10 = new tp2.IPBan(iP5, (java.lang.Long)2147483676L);
    iP5.setFirst((java.lang.Integer)16);
    boolean b14 = iP5.equals((java.lang.Object)"7000");
    iP5.setFirst((java.lang.Integer)458885);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);

  }

  @Test
  public void test064() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test064"); }


    int i1 = java.lang.Integer.numberOfLeadingZeros(2082996226);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 1);

  }

  @Test
  public void test065() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test065"); }


    int i2 = java.lang.Integer.divideUnsigned((-1879048192), 24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 100663296);

  }

  @Test
  public void test066() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test066"); }


    java.lang.Integer i1 = new java.lang.Integer(4194304);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 4194304+ "'", i1.equals(4194304));

  }

  @Test
  public void test067() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test067"); }


    int i2 = java.lang.Integer.rotateRight(1326, 70);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == (-1207959532));

  }

  @Test
  public void test068() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test068"); }


    int i2 = java.lang.Integer.rotateRight((-1879048192), 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 73728);

  }

  @Test
  public void test069() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test069"); }


    int i1 = java.lang.Integer.numberOfTrailingZeros(1400000);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 6);

  }

  @Test
  public void test070() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test070"); }


    long long1 = java.lang.Integer.toUnsignedLong((-150929408));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == 4144037888L);

  }

  @Test
  public void test071() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test071"); }


    // The following exception was thrown during execution in test generation
    try {
      java.lang.Integer i2 = java.lang.Integer.valueOf("5256300", (-439943169));
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test072() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test072"); }


    // The following exception was thrown during execution in test generation
    try {
      int i2 = java.lang.Integer.parseUnsignedInt("2527140", 101);
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test073() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test073"); }


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
    tp2.IP iP20 = iPBan19.getIp();
    java.lang.Long long21 = iPBan19.expires;
    tp2.IP iP22 = null;
    iPBan19.ip = iP22;
    tp2.Server server24 = new tp2.Server();
    tp2.IP iP29 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b30 = server24.removeException(iP29);
    java.lang.Integer i31 = iP29.getFirst();
    iPBan19.setIp(iP29);
    iP29.setSecond((java.lang.Integer)1476395008);
    tp2.IPBan iPBan36 = new tp2.IPBan(iP29, (java.lang.Long)10L);
    tp2.Server server37 = new tp2.Server();
    tp2.IP iP42 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b43 = server37.removeException(iP42);
    iP42.setThird((java.lang.Integer)56);
    java.lang.Integer i46 = iP42.getFourth();
    java.lang.Integer i47 = null;
    iP42.setFirst(i47);
    iPBan36.ip = iP42;
    iP42.setFirst((java.lang.Integer)35320);
    boolean b52 = server0.addBan(iP42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long21 + "' != '" + 10L+ "'", long21.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i31 + "' != '" + 161+ "'", i31.equals(161));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b43 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i46 + "' != '" + 5+ "'", i46.equals(5));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b52 == true);

  }

  @Test
  public void test074() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test074"); }


    // The following exception was thrown during execution in test generation
    try {
      int i2 = java.lang.Integer.remainderUnsigned(700000, 0);
      org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException");
    } catch (java.lang.ArithmeticException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArithmeticException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test075() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test075"); }


    // The following exception was thrown during execution in test generation
    try {
      java.lang.Integer i1 = java.lang.Integer.valueOf("111000000000000000000000000000");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test076() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test076"); }


    int i1 = java.lang.Integer.highestOneBit(16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 16);

  }

  @Test
  public void test077() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test077"); }


    int i2 = java.lang.Integer.remainderUnsigned(501988245, 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 10);

  }

  @Test
  public void test078() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test078"); }


    java.lang.Integer i1 = new java.lang.Integer("1326");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 1326+ "'", i1.equals(1326));

  }

  @Test
  public void test079() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test079"); }


    int i2 = java.lang.Integer.min(501988245, 268435456);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 268435456);

  }

  @Test
  public void test080() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test080"); }


    java.lang.Integer i1 = java.lang.Integer.decode("32");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 32+ "'", i1.equals(32));

  }

  @Test
  public void test081() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test081"); }


    int i2 = java.lang.Integer.divideUnsigned(0, 832);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);

  }

  @Test
  public void test082() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test082"); }


    int i1 = java.lang.Integer.bitCount((-530836224));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 10);

  }

  @Test
  public void test083() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test083"); }


    // The following exception was thrown during execution in test generation
    try {
      java.lang.Integer i1 = java.lang.Integer.decode("10110112112200002221");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test084() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test084"); }


    int i1 = java.lang.Integer.numberOfLeadingZeros(84410368);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 5);

  }

  @Test
  public void test085() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test085"); }


    // The following exception was thrown during execution in test generation
    try {
      java.lang.Integer i2 = java.lang.Integer.valueOf("10000100001000010000100", 0);
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

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test086"); }


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
    tp2.ITime iTime67 = null;
    server64.setTime(iTime67);
    tp2.IP iP69 = null;
    tp2.IPBan iPBan71 = new tp2.IPBan(iP69, (java.lang.Long)10L);
    tp2.IP iP72 = iPBan71.getIp();
    java.lang.Long long73 = iPBan71.expires;
    tp2.IP iP74 = null;
    iPBan71.ip = iP74;
    tp2.Server server76 = new tp2.Server();
    tp2.IP iP81 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b82 = server76.removeException(iP81);
    java.lang.Integer i83 = iP81.getFirst();
    iPBan71.setIp(iP81);
    boolean b85 = server64.connect(iP81);
    iP81.setFourth((java.lang.Integer)(-1));
    iP81.setFourth((java.lang.Integer)(-1));
    boolean b90 = iP53.equals((java.lang.Object)iP81);
    boolean b91 = server0.removeBan(iP81);
    tp2.IP iP92 = null;
    boolean b93 = server0.connect(iP92);
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
    org.junit.Assert.assertNull(iP72);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long73 + "' != '" + 10L+ "'", long73.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b82 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i83 + "' != '" + 161+ "'", i83.equals(161));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b85 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b90 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b91 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b93 == true);

  }

  @Test
  public void test087() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test087"); }


    int i2 = java.lang.Integer.compare(0, 67108864);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == (-1));

  }

  @Test
  public void test088() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test088"); }


    int i2 = java.lang.Integer.sum(7, 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 7);

  }

  @Test
  public void test089() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test089"); }


    int i1 = java.lang.Integer.parseInt("61");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 61);

  }

  @Test
  public void test090() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test090"); }


    java.lang.Integer i1 = new java.lang.Integer("3");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 3+ "'", i1.equals(3));

  }

  @Test
  public void test091() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test091"); }


    tp2.IP iP0 = null;
    tp2.IPBan iPBan2 = new tp2.IPBan(iP0, (java.lang.Long)10L);
    tp2.IP iP3 = iPBan2.getIp();
    iPBan2.expires = 0L;
    tp2.IP iP6 = iPBan2.ip;
    tp2.IP iP7 = iPBan2.getIp();
    java.lang.Long long8 = iPBan2.expires;
    iPBan2.setExpires((java.lang.Long)3855024127L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L+ "'", long8.equals(0L));

  }

  @Test
  public void test092() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test092"); }


    int i2 = java.lang.Integer.sum((-1879048031), (-1593835520));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 822083745);

  }

  @Test
  public void test093() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test093"); }


    // The following exception was thrown during execution in test generation
    try {
      int i2 = java.lang.Integer.parseInt("b", 640);
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test094() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test094"); }


    int i1 = java.lang.Integer.reverseBytes((-439943169));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == (-14619));

  }

  @Test
  public void test095() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test095"); }


    tp2.IP iP0 = null;
    tp2.IPBan iPBan2 = new tp2.IPBan(iP0, (java.lang.Long)10L);
    tp2.IP iP3 = iPBan2.getIp();
    iPBan2.setExpires((java.lang.Long)458752L);
    java.lang.Long long6 = iPBan2.getExpires();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long6 + "' != '" + 458752L+ "'", long6.equals(458752L));

  }

  @Test
  public void test096() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test096"); }


    int i2 = java.lang.Integer.min(133, 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);

  }

  @Test
  public void test097() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test097"); }


    int i2 = java.lang.Integer.remainderUnsigned(0, 84410411);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);

  }

  @Test
  public void test098() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test098"); }


    int i2 = java.lang.Integer.rotateLeft(4194304, 2031690);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);

  }

  @Test
  public void test099() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test099"); }


    int i2 = java.lang.Integer.compare(640, 18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);

  }

  @Test
  public void test100() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test100"); }


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
    iP61.setFourth((java.lang.Integer)268435466);
    
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
  public void test101() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test101"); }


    int i1 = java.lang.Integer.numberOfTrailingZeros(503);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);

  }

  @Test
  public void test102() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test102"); }


    int i1 = java.lang.Integer.reverseBytes((-2147483646));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 33554560);

  }

  @Test
  public void test103() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test103"); }


    // The following exception was thrown during execution in test generation
    try {
      java.lang.Integer i2 = java.lang.Integer.valueOf("10110112112200002221", 0);
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

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test104"); }


    java.lang.Integer i1 = java.lang.Integer.decode("10010842");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 10010842+ "'", i1.equals(10010842));

  }

  @Test
  public void test105() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test105"); }


    int i1 = java.lang.Integer.reverseBytes(14379100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 1550375680);

  }

  @Test
  public void test106() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test106"); }


    // The following exception was thrown during execution in test generation
    try {
      java.lang.Integer i1 = new java.lang.Integer("10000000000000000000000000000");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test107() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test107"); }


    java.lang.Integer i1 = java.lang.Integer.valueOf(18757859);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 18757859+ "'", i1.equals(18757859));

  }

  @Test
  public void test108() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test108"); }


    int i1 = java.lang.Integer.lowestOneBit(640);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 128);

  }

  @Test
  public void test109() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test109"); }


    java.lang.Integer i1 = java.lang.Integer.valueOf("800");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 800+ "'", i1.equals(800));

  }

  @Test
  public void test110() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test110"); }


    int i2 = java.lang.Integer.min(27, 35320);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 27);

  }

  @Test
  public void test111() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test111"); }


    int i1 = java.lang.Integer.signum(73728);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 1);

  }

  @Test
  public void test112() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test112"); }


    int i2 = java.lang.Integer.sum(1275068417, 939524096);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == (-2080374783));

  }

  @Test
  public void test113() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test113"); }


    java.lang.Integer i1 = java.lang.Integer.decode("4329604");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 4329604+ "'", i1.equals(4329604));

  }

  @Test
  public void test114() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test114"); }


    int i2 = java.lang.Integer.rotateRight(2362614, 84410368);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 2362614);

  }

  @Test
  public void test115() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test115"); }


    int i1 = java.lang.Integer.parseUnsignedInt("90");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 90);

  }

  @Test
  public void test116() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test116"); }


    // The following exception was thrown during execution in test generation
    try {
      java.lang.Integer i1 = java.lang.Integer.decode("37000000000");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test117() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test117"); }


    int i2 = java.lang.Integer.parseUnsignedInt("32", 4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 14);

  }

  @Test
  public void test118() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test118"); }


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
    tp2.IP iP18 = iPBan2.getIp();
    tp2.IP iP19 = iPBan2.getIp();
    
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
    org.junit.Assert.assertNotNull(iP18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP19);

  }

  @Test
  public void test119() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test119"); }


    // The following exception was thrown during execution in test generation
    try {
      java.lang.Integer i2 = java.lang.Integer.valueOf("10", 1073741824);
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test120() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test120"); }


    int i1 = java.lang.Integer.parseUnsignedInt("12");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 12);

  }

  @Test
  public void test121() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test121"); }


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
    iP24.setFourth((java.lang.Integer)4897831);
    
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

  }

  @Test
  public void test122() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test122"); }


    // The following exception was thrown during execution in test generation
    try {
      int i2 = java.lang.Integer.parseUnsignedInt("23", 0);
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

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test123"); }


    int i2 = java.lang.Integer.compare(26, 734718005);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == (-1));

  }

  @Test
  public void test124() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test124"); }


    int i2 = java.lang.Integer.compare(43, 50397184);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == (-1));

  }

  @Test
  public void test125() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test125"); }


    int i1 = java.lang.Integer.signum((-2147483515));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == (-1));

  }

  @Test
  public void test126() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test126"); }


    // The following exception was thrown during execution in test generation
    try {
      java.lang.Integer i2 = java.lang.Integer.valueOf("38000000", 1326);
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

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test127"); }


    int i2 = java.lang.Integer.compare(2, (-2080374783));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);

  }

  @Test
  public void test128() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test128"); }


    java.lang.Integer i2 = java.lang.Integer.getInteger("5256300", (java.lang.Integer)186646533);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i2 + "' != '" + 186646533+ "'", i2.equals(186646533));

  }

  @Test
  public void test129() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test129"); }


    int i1 = java.lang.Integer.bitCount(531);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 4);

  }

  @Test
  public void test130() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test130"); }


    // The following exception was thrown during execution in test generation
    try {
      java.lang.Integer i2 = java.lang.Integer.valueOf("51200", 133);
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test131() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test131"); }


    // The following exception was thrown during execution in test generation
    try {
      int i1 = java.lang.Integer.parseUnsignedInt("1111010001100011");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test132() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test132"); }


    int i1 = java.lang.Integer.highestOneBit(2082996226);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 1073741824);

  }

  @Test
  public void test133() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test133"); }


    // The following exception was thrown during execution in test generation
    try {
      java.lang.Integer i1 = java.lang.Integer.decode("hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test134() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test134"); }


    java.lang.Integer i2 = java.lang.Integer.getInteger("11700000000", 90);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i2 + "' != '" + 90+ "'", i2.equals(90));

  }

  @Test
  public void test135() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test135"); }


    int i2 = java.lang.Integer.divideUnsigned(7489, 503);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 14);

  }

  @Test
  public void test136() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test136"); }


    int i1 = java.lang.Integer.numberOfLeadingZeros(101);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 25);

  }

  @Test
  public void test137() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test137"); }


    int i1 = java.lang.Integer.reverse(524288);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 4096);

  }

  @Test
  public void test138() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test138"); }


    int i1 = java.lang.Integer.numberOfLeadingZeros(13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 28);

  }

  @Test
  public void test139() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test139"); }


    java.lang.String str1 = java.lang.Integer.toUnsignedString(4897831);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "4897831"+ "'", str1.equals("4897831"));

  }

  @Test
  public void test140() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test140"); }


    java.lang.Integer i1 = java.lang.Integer.decode("90");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 90+ "'", i1.equals(90));

  }

  @Test
  public void test141() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test141"); }


    long long1 = java.lang.Integer.toUnsignedLong(7489);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == 7489L);

  }

  @Test
  public void test142() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test142"); }


    // The following exception was thrown during execution in test generation
    try {
      int i1 = java.lang.Integer.parseInt("4294967295");
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

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test143"); }


    int i1 = java.lang.Integer.reverseBytes(64);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 1073741824);

  }

  @Test
  public void test144() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test144"); }


    // The following exception was thrown during execution in test generation
    try {
      java.lang.Integer i2 = java.lang.Integer.valueOf("1000000000000000000000000000001", 268435466);
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

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test145"); }


    int i1 = java.lang.Integer.numberOfTrailingZeros(19884108);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 2);

  }

  @Test
  public void test146() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test146"); }


    tp2.Server server0 = new tp2.Server();
    tp2.IP iP5 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b6 = server0.removeException(iP5);
    iP5.setThird((java.lang.Integer)56);
    java.lang.Integer i9 = iP5.getFourth();
    tp2.IPBan iPBan11 = new tp2.IPBan(iP5, (java.lang.Long)10L);
    iPBan11.expires = 2147483647L;
    java.lang.Long long14 = iPBan11.getExpires();
    tp2.IP iP15 = iPBan11.ip;
    java.lang.Object obj16 = null;
    boolean b17 = iP15.equals(obj16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 5+ "'", i9.equals(5));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long14 + "' != '" + 2147483647L+ "'", long14.equals(2147483647L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);

  }

  @Test
  public void test147() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test147"); }


    // The following exception was thrown during execution in test generation
    try {
      int i1 = java.lang.Integer.parseInt("20000000000");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test148() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test148"); }


    int i2 = java.lang.Integer.divideUnsigned(111, 80000000);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);

  }

  @Test
  public void test149() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test149"); }


    java.lang.Integer i1 = java.lang.Integer.valueOf(3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 3+ "'", i1.equals(3));

  }

  @Test
  public void test150() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test150"); }


    java.lang.Integer i1 = new java.lang.Integer((-2063597489));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + (-2063597489)+ "'", i1.equals((-2063597489)));

  }

  @Test
  public void test151() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test151"); }


    tp2.IP iP0 = null;
    tp2.IPBan iPBan2 = new tp2.IPBan(iP0, (java.lang.Long)10L);
    tp2.IP iP3 = iPBan2.getIp();
    tp2.IP iP8 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    iP8.setFirst((java.lang.Integer)161);
    iP8.setThird((java.lang.Integer)3);
    iP8.setFirst((java.lang.Integer)26);
    iPBan2.ip = iP8;
    iP8.setThird((java.lang.Integer)1476395008);
    iP8.setThird((java.lang.Integer)18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP3);

  }

  @Test
  public void test152() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test152"); }


    int i2 = java.lang.Integer.compare((-2063597568), 18757859);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == (-1));

  }

  @Test
  public void test153() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test153"); }


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
    iP13.setSecond((java.lang.Integer)84410411);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i15 + "' != '" + 161+ "'", i15.equals(161));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);

  }

  @Test
  public void test154() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test154"); }


    int i2 = java.lang.Integer.divideUnsigned((-2147483646), 101);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 21262214);

  }

  @Test
  public void test155() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test155"); }


    long long1 = java.lang.Integer.toUnsignedLong(822083745);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == 822083745L);

  }

  @Test
  public void test156() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test156"); }


    java.lang.Integer i2 = java.lang.Integer.getInteger("3400000000", 50397184);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i2 + "' != '" + 50397184+ "'", i2.equals(50397184));

  }

  @Test
  public void test157() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test157"); }


    int i1 = java.lang.Integer.reverse((-2147483592));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 469762049);

  }

  @Test
  public void test158() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test158"); }


    int i1 = java.lang.Integer.numberOfTrailingZeros(2362614);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 1);

  }

  @Test
  public void test159() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test159"); }


    java.lang.Integer i1 = java.lang.Integer.getInteger("10000000000000000000000000000");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);

  }

  @Test
  public void test160() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test160"); }


    int i1 = java.lang.Integer.reverseBytes(1476395008);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 88);

  }

  @Test
  public void test161() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test161"); }


    int i1 = java.lang.Integer.signum(38000);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 1);

  }

  @Test
  public void test162() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test162"); }


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
    boolean b60 = server0.removeException(iP53);
    tp2.ITime iTime61 = null;
    server0.setTime(iTime61);
    
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
    org.junit.Assert.assertTrue(b60 == false);

  }

  @Test
  public void test163() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test163"); }


    int i1 = java.lang.Integer.lowestOneBit(25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 1);

  }

  @Test
  public void test164() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test164"); }


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
    iPBan11.setExpires((java.lang.Long)3855024127L);
    
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
  public void test165() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test165"); }


    java.lang.String str1 = java.lang.Integer.toBinaryString(144);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "10010000"+ "'", str1.equals("10010000"));

  }

  @Test
  public void test166() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test166"); }


    int i1 = java.lang.Integer.parseUnsignedInt("6");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 6);

  }

  @Test
  public void test167() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test167"); }


    java.lang.Integer i1 = java.lang.Integer.valueOf(1023410176);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 1023410176+ "'", i1.equals(1023410176));

  }

  @Test
  public void test168() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test168"); }


    int i2 = java.lang.Integer.min((-2147483646), 35320);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == (-2147483646));

  }

  @Test
  public void test169() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test169"); }


    long long1 = java.lang.Integer.toUnsignedLong(84410368);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == 84410368L);

  }

  @Test
  public void test170() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test170"); }


    java.lang.Integer i1 = new java.lang.Integer(27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 27+ "'", i1.equals(27));

  }

  @Test
  public void test171() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test171"); }


    int i1 = java.lang.Integer.highestOneBit(4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 4);

  }

  @Test
  public void test172() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test172"); }


    java.lang.String str1 = java.lang.Integer.toHexString(11024899);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "a83a03"+ "'", str1.equals("a83a03"));

  }

  @Test
  public void test173() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test173"); }


    int i1 = java.lang.Integer.highestOneBit(1073741824);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 1073741824);

  }

  @Test
  public void test174() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test174"); }


    // The following exception was thrown during execution in test generation
    try {
      int i2 = java.lang.Integer.parseInt("31", (-1593835520));
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test175() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test175"); }


    int i1 = java.lang.Integer.highestOneBit(939524096);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 536870912);

  }

  @Test
  public void test176() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test176"); }


    java.lang.Integer i1 = java.lang.Integer.valueOf(62563);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 62563+ "'", i1.equals(62563));

  }

  @Test
  public void test177() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test177"); }


    // The following exception was thrown during execution in test generation
    try {
      java.lang.Integer i2 = java.lang.Integer.valueOf("1a", 1023410176);
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test178() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test178"); }


    int i1 = java.lang.Integer.bitCount(84410411);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 7);

  }

  @Test
  public void test179() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test179"); }


    java.lang.Integer i2 = java.lang.Integer.getInteger("14", 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i2 + "' != '" + 0+ "'", i2.equals(0));

  }

  @Test
  public void test180() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test180"); }


    // The following exception was thrown during execution in test generation
    try {
      int i1 = java.lang.Integer.parseInt("1000000000000000000000000000001");
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

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test181"); }


    int i2 = java.lang.Integer.max((-1207959532), 841);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 841);

  }

  @Test
  public void test182() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test182"); }


    int i2 = java.lang.Integer.divideUnsigned(56, 1342177288);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);

  }

  @Test
  public void test183() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test183"); }


    int i2 = java.lang.Integer.max(26, 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 26);

  }

  @Test
  public void test184() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test184"); }


    java.lang.String str1 = java.lang.Integer.toHexString(7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "7"+ "'", str1.equals("7"));

  }

  @Test
  public void test185() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test185"); }


    // The following exception was thrown during execution in test generation
    try {
      java.lang.Integer i1 = java.lang.Integer.decode("24100000220");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test186() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test186"); }


    int i1 = java.lang.Integer.numberOfLeadingZeros(11024899);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 8);

  }

  @Test
  public void test187() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test187"); }


    // The following exception was thrown during execution in test generation
    try {
      int i1 = java.lang.Integer.parseInt("24100000220");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test188() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test188"); }


    int i2 = java.lang.Integer.remainderUnsigned(62563, 101);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 44);

  }

  @Test
  public void test189() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test189"); }


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
    java.lang.Long long32 = iPBan31.getExpires();
    tp2.IP iP37 = new tp2.IP((java.lang.Integer)31, (java.lang.Integer)31, (java.lang.Integer)31, (java.lang.Integer)0);
    iPBan31.ip = iP37;
    tp2.Server server39 = new tp2.Server();
    tp2.IP iP44 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b45 = server39.removeException(iP44);
    server39.update();
    tp2.Server server47 = new tp2.Server();
    tp2.IP iP52 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b53 = server47.removeException(iP52);
    java.lang.Integer i54 = iP52.getFirst();
    boolean b55 = server39.addBan(iP52);
    iPBan31.setIp(iP52);
    iP52.setFourth((java.lang.Integer)536870912);
    iP52.setThird((java.lang.Integer)4);
    boolean b61 = server0.addException(iP52);
    
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
    org.junit.Assert.assertTrue("'" + long32 + "' != '" + 10L+ "'", long32.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b53 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i54 + "' != '" + 161+ "'", i54.equals(161));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b55 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b61 == true);

  }

  @Test
  public void test190() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test190"); }


    java.lang.String str1 = java.lang.Integer.toUnsignedString(1677721761);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "1677721761"+ "'", str1.equals("1677721761"));

  }

  @Test
  public void test191() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test191"); }


    java.lang.Integer i2 = java.lang.Integer.getInteger("20000000000", 700000);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i2 + "' != '" + 700000+ "'", i2.equals(700000));

  }

  @Test
  public void test192() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test192"); }


    int i1 = java.lang.Integer.highestOneBit(67108864);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 67108864);

  }

  @Test
  public void test193() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test193"); }


    int i2 = java.lang.Integer.max(69273664, 402653184);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 402653184);

  }

  @Test
  public void test194() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test194"); }


    int i2 = java.lang.Integer.remainderUnsigned(503, (-1593835520));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 503);

  }

  @Test
  public void test195() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test195"); }


    int i2 = java.lang.Integer.sum(0, 28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 28);

  }

  @Test
  public void test196() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test196"); }


    java.lang.Integer i1 = java.lang.Integer.valueOf(939524096);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 939524096+ "'", i1.equals(939524096));

  }

  @Test
  public void test197() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test197"); }


    tp2.Server server0 = new tp2.Server();
    tp2.Server server1 = new tp2.Server();
    tp2.IP iP2 = null;
    boolean b3 = server1.addBan(iP2);
    tp2.IP iP8 = new tp2.IP((java.lang.Integer)31, (java.lang.Integer)31, (java.lang.Integer)31, (java.lang.Integer)0);
    iP8.setSecond((java.lang.Integer)2147483647);
    boolean b11 = server1.addBan(iP8);
    tp2.Server server12 = new tp2.Server();
    tp2.IP iP13 = null;
    boolean b14 = server12.addBan(iP13);
    tp2.ITime iTime15 = null;
    server12.setTime(iTime15);
    tp2.IP iP17 = null;
    tp2.IPBan iPBan19 = new tp2.IPBan(iP17, (java.lang.Long)10L);
    tp2.IP iP20 = iPBan19.getIp();
    java.lang.Long long21 = iPBan19.expires;
    tp2.IP iP22 = null;
    iPBan19.ip = iP22;
    tp2.Server server24 = new tp2.Server();
    tp2.IP iP29 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b30 = server24.removeException(iP29);
    java.lang.Integer i31 = iP29.getFirst();
    iPBan19.setIp(iP29);
    boolean b33 = server12.connect(iP29);
    boolean b34 = server1.removeBan(iP29);
    boolean b35 = server0.addBan(iP29);
    tp2.IP iP36 = null;
    tp2.IPBan iPBan38 = new tp2.IPBan(iP36, (java.lang.Long)10L);
    java.lang.Long long39 = iPBan38.getExpires();
    tp2.IP iP44 = new tp2.IP((java.lang.Integer)31, (java.lang.Integer)31, (java.lang.Integer)31, (java.lang.Integer)0);
    iPBan38.ip = iP44;
    iP44.setFirst((java.lang.Integer)2);
    boolean b48 = server0.removeBan(iP44);
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
    tp2.Server server71 = new tp2.Server();
    tp2.IP iP76 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b77 = server71.removeException(iP76);
    boolean b79 = iP76.equals((java.lang.Object)(-1L));
    iP76.setFourth((java.lang.Integer)28);
    boolean b82 = server49.addException(iP76);
    java.lang.Integer i83 = iP76.getFourth();
    boolean b84 = server0.addBan(iP76);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long21 + "' != '" + 10L+ "'", long21.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i31 + "' != '" + 161+ "'", i31.equals(161));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long39 + "' != '" + 10L+ "'", long39.equals(10L));
    
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
    org.junit.Assert.assertTrue(b77 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b79 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b82 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i83 + "' != '" + 28+ "'", i83.equals(28));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b84 == true);

  }

  @Test
  public void test198() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test198"); }


    java.lang.String str2 = java.lang.Integer.toUnsignedString(2031616, 2147480291);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "2031616"+ "'", str2.equals("2031616"));

  }

  @Test
  public void test199() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test199"); }


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
    tp2.IP iP97 = iPBan2.getIp();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP97);

  }

  @Test
  public void test200() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test200"); }


    int i1 = java.lang.Integer.lowestOneBit(4329604);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 4);

  }

  @Test
  public void test201() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test201"); }


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
    java.lang.Integer i48 = iP43.getThird();
    
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
    org.junit.Assert.assertTrue("'" + i48 + "' != '" + 56+ "'", i48.equals(56));

  }

  @Test
  public void test202() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test202"); }


    int i2 = java.lang.Integer.max(4897831, 402653184);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 402653184);

  }

  @Test
  public void test203() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test203"); }


    java.lang.String str1 = java.lang.Integer.toHexString(88);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "58"+ "'", str1.equals("58"));

  }

  @Test
  public void test204() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test204"); }


    java.lang.Integer i1 = java.lang.Integer.getInteger("10101000000000000000110100100");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);

  }

  @Test
  public void test205() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test205"); }


    int i1 = java.lang.Integer.lowestOneBit(80000085);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 1);

  }

  @Test
  public void test206() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test206"); }


    int i2 = java.lang.Integer.compare(100004, 4897831);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == (-1));

  }

  @Test
  public void test207() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test207"); }


    // The following exception was thrown during execution in test generation
    try {
      int i2 = java.lang.Integer.parseInt("11000000010000000000000000", 79);
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test208() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test208"); }


    tp2.IP iP4 = new tp2.IP((java.lang.Integer)(-2147483646), (java.lang.Integer)61, (java.lang.Integer)5, (java.lang.Integer)(-150929408));

  }

  @Test
  public void test209() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test209"); }


    java.lang.String str1 = java.lang.Integer.toOctalString(1326);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "2456"+ "'", str1.equals("2456"));

  }

  @Test
  public void test210() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test210"); }


    java.lang.Integer i2 = java.lang.Integer.getInteger("79", (java.lang.Integer)67108864);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i2 + "' != '" + 67108864+ "'", i2.equals(67108864));

  }

  @Test
  public void test211() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test211"); }


    java.lang.Integer i2 = java.lang.Integer.getInteger("3d000000", (java.lang.Integer)19884108);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i2 + "' != '" + 19884108+ "'", i2.equals(19884108));

  }

  @Test
  public void test212() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test212"); }


    // The following exception was thrown during execution in test generation
    try {
      java.lang.Integer i2 = java.lang.Integer.valueOf("2", 4897831);
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test213() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test213"); }


    java.lang.String str1 = java.lang.Integer.toBinaryString((-1879048192));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "10010000000000000000000000000000"+ "'", str1.equals("10010000000000000000000000000000"));

  }

  @Test
  public void test214() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test214"); }


    int i1 = java.lang.Integer.numberOfLeadingZeros(24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 27);

  }

  @Test
  public void test215() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test215"); }


    java.lang.Integer i1 = java.lang.Integer.getInteger("8500004f");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);

  }

  @Test
  public void test216() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test216"); }


    long long1 = java.lang.Integer.toUnsignedLong(268435466);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == 268435466L);

  }

  @Test
  public void test217() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test217"); }


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
    java.lang.Integer i17 = iP16.getSecond();
    iP16.setSecond((java.lang.Integer)1073741825);
    java.lang.Integer i20 = iP16.getSecond();
    
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
    org.junit.Assert.assertTrue("'" + i17 + "' != '" + (-2147483648)+ "'", i17.equals((-2147483648)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i20 + "' != '" + 1073741825+ "'", i20.equals(1073741825));

  }

  @Test
  public void test218() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test218"); }


    // The following exception was thrown during execution in test generation
    try {
      int i2 = java.lang.Integer.parseUnsignedInt("133", 2147480291);
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

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test219"); }


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
    iP12.setFourth((java.lang.Integer)(-2147483620));
    tp2.IPBan iPBan19 = new tp2.IPBan(iP12, (java.lang.Long)(-1L));
    java.lang.Long long20 = iPBan19.expires;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L+ "'", long4.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i14 + "' != '" + 161+ "'", i14.equals(161));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-1L)+ "'", long20.equals((-1L)));

  }

  @Test
  public void test220() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test220"); }


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
    java.lang.Integer i62 = null;
    iP51.setThird(i62);
    iP51.setThird((java.lang.Integer)2031690);
    
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

  }

  @Test
  public void test221() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test221"); }


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
    tp2.Server server17 = new tp2.Server();
    tp2.IP iP22 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b23 = server17.removeException(iP22);
    server17.update();
    tp2.Server server25 = new tp2.Server();
    tp2.IP iP26 = null;
    boolean b27 = server25.addBan(iP26);
    tp2.Server server28 = new tp2.Server();
    tp2.IP iP33 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b34 = server28.removeException(iP33);
    boolean b36 = iP33.equals((java.lang.Object)(-1L));
    boolean b37 = server25.removeBan(iP33);
    tp2.IP iP42 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    iP42.setFirst((java.lang.Integer)161);
    iP42.setThird((java.lang.Integer)3);
    iP42.setFirst((java.lang.Integer)26);
    boolean b49 = server25.connect(iP42);
    iP42.setSecond((java.lang.Integer)1677721761);
    boolean b52 = server17.removeBan(iP42);
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
    iP70.setFourth((java.lang.Integer)(-1));
    boolean b77 = server17.removeException(iP70);
    iPBan2.ip = iP70;
    java.lang.Long long79 = iPBan2.expires;
    
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
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b49 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b52 == false);
    
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
    org.junit.Assert.assertTrue(b77 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long79 + "' != '" + 10L+ "'", long79.equals(10L));

  }

  @Test
  public void test222() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test222"); }


    java.lang.String str1 = java.lang.Integer.toHexString(291939);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "47463"+ "'", str1.equals("47463"));

  }

  @Test
  public void test223() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test223"); }


    // The following exception was thrown during execution in test generation
    try {
      int i2 = java.lang.Integer.parseInt("4144037888", 84410411);
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test224() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test224"); }


    tp2.IP iP4 = new tp2.IP((java.lang.Integer)21262214, (java.lang.Integer)1275068417, (java.lang.Integer)2, (java.lang.Integer)8);

  }

  @Test
  public void test225() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test225"); }


    int i1 = java.lang.Integer.reverse(18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 1207959552);

  }

  @Test
  public void test226() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test226"); }


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
    iP44.setFourth((java.lang.Integer)469762048);
    
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
  public void test227() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test227"); }


    int i2 = java.lang.Integer.remainderUnsigned(38000000, (-2147483648));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 38000000);

  }

  @Test
  public void test228() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test228"); }


    int i1 = java.lang.Integer.highestOneBit(740);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 512);

  }

  @Test
  public void test229() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test229"); }


    int i1 = java.lang.Integer.highestOneBit(20971520);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 16777216);

  }

  @Test
  public void test230() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test230"); }


    java.lang.String str2 = java.lang.Integer.toUnsignedString(2147480291, 5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "13344223332131"+ "'", str2.equals("13344223332131"));

  }

  @Test
  public void test231() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test231"); }


    java.lang.Integer i1 = new java.lang.Integer("2528");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 2528+ "'", i1.equals(2528));

  }

  @Test
  public void test232() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test232"); }


    java.lang.String str2 = java.lang.Integer.toUnsignedString(352322596, 448);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "352322596"+ "'", str2.equals("352322596"));

  }

  @Test
  public void test233() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test233"); }


    java.lang.String str1 = java.lang.Integer.toHexString(2031686);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "1f0046"+ "'", str1.equals("1f0046"));

  }

  @Test
  public void test234() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test234"); }


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
    tp2.IP iP65 = iPBan11.ip;
    
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
    org.junit.Assert.assertNotNull(iP65);

  }

  @Test
  public void test235() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test235"); }


    // The following exception was thrown during execution in test generation
    try {
      int i2 = java.lang.Integer.parseInt("1000", 134217728);
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test236() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test236"); }


    java.lang.String str1 = java.lang.Integer.toOctalString((-2063597489));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "20500000117"+ "'", str1.equals("20500000117"));

  }

  @Test
  public void test237() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test237"); }


    java.lang.Integer i3 = null;
    // The following exception was thrown during execution in test generation
    try {
      tp2.IP iP4 = new tp2.IP((java.lang.Integer)69273664, (java.lang.Integer)(-1207959532), (java.lang.Integer)268435466, i3);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test238() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test238"); }


    int i1 = java.lang.Integer.numberOfLeadingZeros(524288);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 12);

  }

  @Test
  public void test239() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test239"); }


    // The following exception was thrown during execution in test generation
    try {
      java.lang.Integer i2 = java.lang.Integer.valueOf("1010", 32768);
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test240() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test240"); }


    int i1 = java.lang.Integer.lowestOneBit(83886080);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 16777216);

  }

  @Test
  public void test241() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test241"); }


    // The following exception was thrown during execution in test generation
    try {
      int i1 = java.lang.Integer.parseInt("1c000000");
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

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test242"); }


    int i2 = java.lang.Integer.compare(16777216, 448);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);

  }

  @Test
  public void test243() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test243"); }


    java.lang.Integer i1 = java.lang.Integer.getInteger("2013262563");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);

  }

  @Test
  public void test244() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test244"); }


    java.lang.Integer i1 = java.lang.Integer.valueOf("35320");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 35320+ "'", i1.equals(35320));

  }

  @Test
  public void test245() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test245"); }


    long long1 = java.lang.Integer.toUnsignedLong(24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == 24L);

  }

  @Test
  public void test246() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test246"); }


    int i1 = java.lang.Integer.signum((-1587281920));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == (-1));

  }

  @Test
  public void test247() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test247"); }


    int i1 = java.lang.Integer.numberOfTrailingZeros(1326);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 1);

  }

  @Test
  public void test248() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test248"); }


    java.lang.Integer i1 = new java.lang.Integer(291939);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 291939+ "'", i1.equals(291939));

  }

  @Test
  public void test249() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test249"); }


    int i2 = java.lang.Integer.rotateLeft(1325400064, 1325400064);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1325400064);

  }

  @Test
  public void test250() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test250"); }


    int i1 = java.lang.Integer.bitCount(734718005);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 16);

  }

  @Test
  public void test251() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test251"); }


    int i2 = java.lang.Integer.rotateRight(56, 700000);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 56);

  }

  @Test
  public void test252() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test252"); }


    int i2 = java.lang.Integer.max(43, 7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 43);

  }

  @Test
  public void test253() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test253"); }


    java.lang.Integer i1 = java.lang.Integer.decode("26");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 26+ "'", i1.equals(26));

  }

  @Test
  public void test254() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test254"); }


    int i1 = java.lang.Integer.bitCount(800);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 3);

  }

  @Test
  public void test255() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test255"); }


    int i1 = java.lang.Integer.signum(1879047772);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 1);

  }

  @Test
  public void test256() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test256"); }


    java.lang.Integer i2 = java.lang.Integer.getInteger("1000000000000000000000000000001", 469762048);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i2 + "' != '" + 469762048+ "'", i2.equals(469762048));

  }

  @Test
  public void test257() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test257"); }


    int i2 = java.lang.Integer.sum(4096, 7489);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 11585);

  }

  @Test
  public void test258() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test258"); }


    int i2 = java.lang.Integer.remainderUnsigned(79, 43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 36);

  }

  @Test
  public void test259() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test259"); }


    // The following exception was thrown during execution in test generation
    try {
      java.lang.Integer i1 = new java.lang.Integer("100000000000");
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

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test260"); }


    java.lang.String str1 = java.lang.Integer.toOctalString(268503106);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "2000204102"+ "'", str1.equals("2000204102"));

  }

  @Test
  public void test261() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test261"); }


    java.lang.Integer i1 = new java.lang.Integer("800");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 800+ "'", i1.equals(800));

  }

  @Test
  public void test262() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test262"); }


    tp2.IP iP4 = new tp2.IP((java.lang.Integer)12, (java.lang.Integer)(-1067707136), (java.lang.Integer)2048, (java.lang.Integer)4897831);

  }

  @Test
  public void test263() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test263"); }


    int i1 = java.lang.Integer.bitCount(80000000);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 8);

  }

  @Test
  public void test264() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test264"); }


    int i1 = java.lang.Integer.bitCount(469762048);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 3);

  }

  @Test
  public void test265() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test265"); }


    int i2 = java.lang.Integer.min(0, 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);

  }

  @Test
  public void test266() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test266"); }


    int i2 = java.lang.Integer.rotateRight(800, 536870912);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 800);

  }

  @Test
  public void test267() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test267"); }


    // The following exception was thrown during execution in test generation
    try {
      int i1 = java.lang.Integer.parseUnsignedInt("10101000000000000000110100100");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test268() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test268"); }


    java.lang.Integer i1 = java.lang.Integer.valueOf("101");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 101+ "'", i1.equals(101));

  }

  @Test
  public void test269() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test269"); }


    java.lang.Integer i1 = java.lang.Integer.valueOf(3997696);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 3997696+ "'", i1.equals(3997696));

  }

  @Test
  public void test270() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test270"); }


    // The following exception was thrown during execution in test generation
    try {
      java.lang.Integer i2 = java.lang.Integer.valueOf("24100000220", 21262214);
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

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test271"); }


    int i2 = java.lang.Integer.parseInt("1600000", 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1600000);

  }

  @Test
  public void test272() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test272"); }


    int i1 = java.lang.Integer.bitCount(3997696);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 5);

  }

  @Test
  public void test273() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test273"); }


    int i2 = java.lang.Integer.min((-1067707136), 18757859);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == (-1067707136));

  }

  @Test
  public void test274() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test274"); }


    java.lang.String str1 = java.lang.Integer.toOctalString(19884108);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "113664114"+ "'", str1.equals("113664114"));

  }

  @Test
  public void test275() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test275"); }


    // The following exception was thrown during execution in test generation
    try {
      java.lang.Integer i1 = new java.lang.Integer("10101000000000000000110100100");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test276() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test276"); }


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
    tp2.IP iP56 = null;
    boolean b57 = server55.addBan(iP56);
    tp2.IP iP62 = new tp2.IP((java.lang.Integer)31, (java.lang.Integer)31, (java.lang.Integer)31, (java.lang.Integer)0);
    iP62.setSecond((java.lang.Integer)2147483647);
    boolean b65 = server55.addBan(iP62);
    tp2.Server server66 = new tp2.Server();
    tp2.IP iP67 = null;
    boolean b68 = server66.addBan(iP67);
    tp2.Server server69 = new tp2.Server();
    tp2.IP iP74 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b75 = server69.removeException(iP74);
    boolean b77 = iP74.equals((java.lang.Object)(-1L));
    boolean b78 = server66.removeBan(iP74);
    java.lang.Integer i79 = iP74.getFourth();
    boolean b80 = server55.removeBan(iP74);
    boolean b81 = server0.removeException(iP74);
    boolean b83 = iP74.equals((java.lang.Object)84410368L);
    
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
    org.junit.Assert.assertTrue(b57 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b65 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b68 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b75 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b77 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b78 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i79 + "' != '" + 5+ "'", i79.equals(5));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b80 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b81 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b83 == false);

  }

  @Test
  public void test277() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test277"); }


    int i1 = java.lang.Integer.bitCount(469761943);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 25);

  }

  @Test
  public void test278() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test278"); }


    int i2 = java.lang.Integer.divideUnsigned(1, 18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);

  }

  @Test
  public void test279() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test279"); }


    java.lang.Integer i1 = java.lang.Integer.valueOf("229376");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 229376+ "'", i1.equals(229376));

  }

  @Test
  public void test280() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test280"); }


    tp2.IP iP4 = new tp2.IP((java.lang.Integer)2147483647, (java.lang.Integer)(-1), (java.lang.Integer)56, (java.lang.Integer)458752);
    tp2.IPBan iPBan6 = new tp2.IPBan(iP4, (java.lang.Long)2147483676L);
    java.lang.Long long7 = iPBan6.expires;
    java.lang.Long long8 = iPBan6.expires;
    tp2.IP iP9 = iPBan6.getIp();
    iP9.setFirst((java.lang.Integer)734718005);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long7 + "' != '" + 2147483676L+ "'", long7.equals(2147483676L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long8 + "' != '" + 2147483676L+ "'", long8.equals(2147483676L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP9);

  }

  @Test
  public void test281() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test281"); }


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
    iP77.setFourth((java.lang.Integer)(-14619));
    
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

  }

  @Test
  public void test282() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test282"); }


    int i1 = java.lang.Integer.highestOneBit(1325400064);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 1073741824);

  }

  @Test
  public void test283() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test283"); }


    int i2 = java.lang.Integer.min(12, 7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 7);

  }

  @Test
  public void test284() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test284"); }


    int i2 = java.lang.Integer.rotateLeft(268435466, (-2147483620));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == (-1593835520));

  }

  @Test
  public void test285() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test285"); }


    int i1 = java.lang.Integer.bitCount(1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 1);

  }

  @Test
  public void test286() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test286"); }


    java.lang.Integer i1 = java.lang.Integer.getInteger("1010101101101001100010000000100");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);

  }

  @Test
  public void test287() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test287"); }


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
    iPBan6.setExpires((java.lang.Long)84410368L);
    
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
  public void test288() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test288"); }


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
    iP10.setFirst((java.lang.Integer)800);
    java.lang.Integer i17 = iP10.getFirst();
    
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
    org.junit.Assert.assertTrue("'" + i17 + "' != '" + 800+ "'", i17.equals(800));

  }

  @Test
  public void test289() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test289"); }


    java.lang.Integer i2 = java.lang.Integer.getInteger("", 1342177280);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i2 + "' != '" + 1342177280+ "'", i2.equals(1342177280));

  }

  @Test
  public void test290() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test290"); }


    int i1 = java.lang.Integer.bitCount(1342177280);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 2);

  }

  @Test
  public void test291() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test291"); }


    java.lang.Integer i1 = new java.lang.Integer(49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 49+ "'", i1.equals(49));

  }

  @Test
  public void test292() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test292"); }


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

  }

  @Test
  public void test293() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test293"); }


    int i1 = java.lang.Integer.lowestOneBit(7000);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 8);

  }

  @Test
  public void test294() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test294"); }


    int i2 = java.lang.Integer.min(352321956, 1677721761);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 352321956);

  }

  @Test
  public void test295() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test295"); }


    int i1 = java.lang.Integer.signum(640);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 1);

  }

  @Test
  public void test296() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test296"); }


    int i2 = java.lang.Integer.compare(90, 28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);

  }

  @Test
  public void test297() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test297"); }


    java.lang.Integer i1 = null;
    // The following exception was thrown during execution in test generation
    try {
      tp2.IP iP4 = new tp2.IP((java.lang.Integer)(-2063597568), i1, (java.lang.Integer)1108377608, (java.lang.Integer)(-2147483646));
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test298() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test298"); }


    java.lang.Integer i1 = new java.lang.Integer(43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 43+ "'", i1.equals(43));

  }

  @Test
  public void test299() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test299"); }


    int i1 = java.lang.Integer.reverseBytes(1677721779);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == (-1291845532));

  }

  @Test
  public void test300() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test300"); }


    int i1 = java.lang.Integer.reverse(100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 637534208);

  }

  @Test
  public void test301() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test301"); }


    int i2 = java.lang.Integer.rotateLeft(6, 56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 100663296);

  }

  @Test
  public void test302() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test302"); }


    // The following exception was thrown during execution in test generation
    try {
      java.lang.Integer i2 = java.lang.Integer.valueOf("10110112112200002221", 1476395008);
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test303() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test303"); }


    int i2 = java.lang.Integer.max(531, 1476395008);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1476395008);

  }

  @Test
  public void test304() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test304"); }


    int i1 = java.lang.Integer.highestOneBit(62563);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 32768);

  }

  @Test
  public void test305() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test305"); }


    int i2 = java.lang.Integer.sum(15, 161);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 176);

  }

  @Test
  public void test306() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test306"); }


    int i2 = java.lang.Integer.compareUnsigned(36, 11585);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == (-1));

  }

  @Test
  public void test307() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test307"); }


    int i2 = java.lang.Integer.compare(14, 1207959552);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == (-1));

  }

  @Test
  public void test308() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test308"); }


    java.lang.String str1 = java.lang.Integer.toHexString(56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "38"+ "'", str1.equals("38"));

  }

  @Test
  public void test309() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test309"); }


    java.lang.Integer i1 = java.lang.Integer.valueOf(64);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 64+ "'", i1.equals(64));

  }

  @Test
  public void test310() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test310"); }


    java.lang.Integer i2 = java.lang.Integer.getInteger("", 1207959552);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i2 + "' != '" + 1207959552+ "'", i2.equals(1207959552));

  }

  @Test
  public void test311() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test311"); }


    // The following exception was thrown during execution in test generation
    try {
      int i2 = java.lang.Integer.parseUnsignedInt("a1000000", 469761943);
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test312() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test312"); }


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
    tp2.IP iP21 = null;
    tp2.IPBan iPBan23 = new tp2.IPBan(iP21, (java.lang.Long)10L);
    tp2.IP iP24 = iPBan23.getIp();
    java.lang.Long long25 = iPBan23.expires;
    tp2.IP iP26 = null;
    iPBan23.ip = iP26;
    java.lang.Long long28 = iPBan23.expires;
    tp2.Server server29 = new tp2.Server();
    tp2.IP iP34 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b35 = server29.removeException(iP34);
    iP34.setThird((java.lang.Integer)56);
    java.lang.Integer i38 = iP34.getFourth();
    tp2.IPBan iPBan40 = new tp2.IPBan(iP34, (java.lang.Long)10L);
    iPBan23.setIp(iP34);
    tp2.IP iP42 = iPBan23.ip;
    iPBan18.ip = iP42;
    iPBan18.expires = 28L;
    iPBan18.expires = 2013262563L;
    
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
    org.junit.Assert.assertNull(iP24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long25 + "' != '" + 10L+ "'", long25.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long28 + "' != '" + 10L+ "'", long28.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i38 + "' != '" + 5+ "'", i38.equals(5));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP42);

  }

  @Test
  public void test313() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test313"); }


    tp2.IP iP0 = null;
    tp2.IPBan iPBan2 = new tp2.IPBan(iP0, (java.lang.Long)10L);
    java.lang.Long long3 = iPBan2.getExpires();
    tp2.IP iP4 = iPBan2.getIp();
    iPBan2.setExpires((java.lang.Long)100L);
    java.lang.Long long7 = iPBan2.expires;
    iPBan2.setExpires((java.lang.Long)2147483704L);
    java.lang.Long long10 = iPBan2.expires;
    iPBan2.setExpires((java.lang.Long)100L);
    java.lang.Long long13 = iPBan2.expires;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L+ "'", long3.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L+ "'", long7.equals(100L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long10 + "' != '" + 2147483704L+ "'", long10.equals(2147483704L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long13 + "' != '" + 100L+ "'", long13.equals(100L));

  }

  @Test
  public void test314() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test314"); }


    java.lang.Integer i2 = null;
    // The following exception was thrown during execution in test generation
    try {
      tp2.IP iP4 = new tp2.IP((java.lang.Integer)10, (java.lang.Integer)458752, i2, (java.lang.Integer)43);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test315() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test315"); }


    int i2 = java.lang.Integer.min(79, 1677721761);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 79);

  }

  @Test
  public void test316() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test316"); }


    tp2.IP iP0 = null;
    tp2.IPBan iPBan2 = new tp2.IPBan(iP0, (java.lang.Long)10L);
    tp2.IP iP3 = iPBan2.getIp();
    tp2.IP iP8 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    iP8.setFirst((java.lang.Integer)161);
    iP8.setThird((java.lang.Integer)3);
    iP8.setFirst((java.lang.Integer)26);
    iPBan2.ip = iP8;
    boolean b17 = iP8.equals((java.lang.Object)28L);
    iP8.setThird((java.lang.Integer)458752);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);

  }

  @Test
  public void test317() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test317"); }


    long long1 = java.lang.Integer.toUnsignedLong((-1587281920));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == 2707685376L);

  }

  @Test
  public void test318() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test318"); }


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
    java.lang.Integer i50 = iP40.getFirst();
    
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
    org.junit.Assert.assertTrue("'" + i50 + "' != '" + 161+ "'", i50.equals(161));

  }

  @Test
  public void test319() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test319"); }


    java.lang.String str1 = java.lang.Integer.toHexString(800);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "320"+ "'", str1.equals("320"));

  }

  @Test
  public void test320() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test320"); }


    int i2 = java.lang.Integer.remainderUnsigned(1476395008, 1342177288);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 134217720);

  }

  @Test
  public void test321() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test321"); }


    java.lang.Integer i1 = new java.lang.Integer("23");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 23+ "'", i1.equals(23));

  }

  @Test
  public void test322() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test322"); }


    tp2.IP iP4 = new tp2.IP((java.lang.Integer)28, (java.lang.Integer)536870912, (java.lang.Integer)1400000, (java.lang.Integer)38000000);

  }

  @Test
  public void test323() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test323"); }


    int i2 = java.lang.Integer.min(16777216, 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);

  }

  @Test
  public void test324() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test324"); }


    int i2 = java.lang.Integer.sum((-671088640), 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == (-671088629));

  }

  @Test
  public void test325() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test325"); }


    java.lang.String str1 = java.lang.Integer.toUnsignedString(352321956);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "352321956"+ "'", str1.equals("352321956"));

  }

  @Test
  public void test326() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test326"); }


    // The following exception was thrown during execution in test generation
    try {
      int i2 = java.lang.Integer.parseInt("1", 2048);
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test327() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test327"); }


    // The following exception was thrown during execution in test generation
    try {
      int i2 = java.lang.Integer.parseUnsignedInt("10000000000000000000000000000000", 80000000);
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

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test328"); }


    tp2.Server server0 = new tp2.Server();
    tp2.IP iP5 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b6 = server0.removeException(iP5);
    iP5.setThird((java.lang.Integer)56);
    tp2.IPBan iPBan10 = new tp2.IPBan(iP5, (java.lang.Long)2147483676L);
    java.lang.Long long11 = null;
    tp2.IPBan iPBan12 = new tp2.IPBan(iP5, long11);
    tp2.Server server13 = new tp2.Server();
    tp2.IP iP14 = null;
    boolean b15 = server13.addBan(iP14);
    tp2.ITime iTime16 = null;
    server13.setTime(iTime16);
    tp2.IP iP18 = null;
    tp2.IPBan iPBan20 = new tp2.IPBan(iP18, (java.lang.Long)10L);
    tp2.IP iP21 = iPBan20.getIp();
    java.lang.Long long22 = iPBan20.expires;
    tp2.IP iP23 = null;
    iPBan20.ip = iP23;
    tp2.Server server25 = new tp2.Server();
    tp2.IP iP30 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b31 = server25.removeException(iP30);
    java.lang.Integer i32 = iP30.getFirst();
    iPBan20.setIp(iP30);
    iP30.setFourth((java.lang.Integer)(-2147483620));
    boolean b36 = server13.removeBan(iP30);
    iP30.setFirst((java.lang.Integer)83);
    iPBan12.ip = iP30;
    java.lang.Long long40 = iPBan12.expires;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long22 + "' != '" + 10L+ "'", long22.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i32 + "' != '" + 161+ "'", i32.equals(161));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(long40);

  }

  @Test
  public void test329() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test329"); }


    int i2 = java.lang.Integer.rotateRight(321, 186646533);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 134217738);

  }

  @Test
  public void test330() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test330"); }


    // The following exception was thrown during execution in test generation
    try {
      int i1 = java.lang.Integer.parseInt("10110112112200002221");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test331() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test331"); }


    int i1 = java.lang.Integer.numberOfTrailingZeros(6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 1);

  }

  @Test
  public void test332() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test332"); }


    // The following exception was thrown during execution in test generation
    try {
      int i1 = java.lang.Integer.parseInt("11700000000");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test333() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test333"); }


    java.lang.String str1 = java.lang.Integer.toUnsignedString(1108377608);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "1108377608"+ "'", str1.equals("1108377608"));

  }

  @Test
  public void test334() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test334"); }


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
    java.lang.Integer i24 = iP17.getFourth();
    iP17.setFirst((java.lang.Integer)8);
    tp2.IPBan iPBan28 = new tp2.IPBan(iP17, (java.lang.Long)100L);
    
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
    org.junit.Assert.assertTrue("'" + i24 + "' != '" + (-1)+ "'", i24.equals((-1)));

  }

  @Test
  public void test335() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test335"); }


    int i2 = java.lang.Integer.max(0, 1400000);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1400000);

  }

  @Test
  public void test336() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test336"); }


    int i2 = java.lang.Integer.compareUnsigned(2, 73728);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == (-1));

  }

  @Test
  public void test337() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test337"); }


    java.lang.Integer i2 = java.lang.Integer.getInteger("10000000000000000000000000111000", 84410411);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i2 + "' != '" + 84410411+ "'", i2.equals(84410411));

  }

  @Test
  public void test338() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test338"); }


    // The following exception was thrown during execution in test generation
    try {
      java.lang.Integer i1 = java.lang.Integer.decode("a83a03");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test339() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test339"); }


    java.lang.Integer i1 = java.lang.Integer.valueOf(50397184);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 50397184+ "'", i1.equals(50397184));

  }

  @Test
  public void test340() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test340"); }


    java.lang.String str1 = java.lang.Integer.toOctalString(291939);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "1072143"+ "'", str1.equals("1072143"));

  }

  @Test
  public void test341() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test341"); }


    int i2 = java.lang.Integer.max(13, (-1587281920));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 13);

  }

  @Test
  public void test342() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test342"); }


    java.lang.Integer i1 = java.lang.Integer.decode("4897831");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 4897831+ "'", i1.equals(4897831));

  }

  @Test
  public void test343() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test343"); }


    java.lang.Integer i2 = java.lang.Integer.getInteger("", (java.lang.Integer)36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i2 + "' != '" + 36+ "'", i2.equals(36));

  }

  @Test
  public void test344() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test344"); }


    int i1 = java.lang.Integer.lowestOneBit(2013262563);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 1);

  }

  @Test
  public void test345() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test345"); }


    java.lang.Integer i1 = null;
    java.lang.Integer i2 = java.lang.Integer.getInteger("1400000", i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i2);

  }

  @Test
  public void test346() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test346"); }


    int i1 = java.lang.Integer.parseInt("5");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 5);

  }

  @Test
  public void test347() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test347"); }


    int i2 = java.lang.Integer.compare((-2063597489), (-2063597489));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);

  }

  @Test
  public void test348() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test348"); }


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
    java.lang.Integer i91 = iP80.getFourth();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i91 + "' != '" + (-1)+ "'", i91.equals((-1)));

  }

  @Test
  public void test349() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test349"); }


    int i2 = java.lang.Integer.compareUnsigned((-1), 38000000);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);

  }

  @Test
  public void test350() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test350"); }


    // The following exception was thrown during execution in test generation
    try {
      int i2 = java.lang.Integer.parseInt("10000000000000000000000000111000", 38000);
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test351() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test351"); }


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
    java.lang.Integer i47 = iP43.getFourth();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i47 + "' != '" + 5+ "'", i47.equals(5));

  }

  @Test
  public void test352() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test352"); }


    java.lang.Integer i1 = java.lang.Integer.getInteger("352321956");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);

  }

  @Test
  public void test353() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test353"); }


    java.lang.Integer i1 = java.lang.Integer.valueOf(2031690);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 2031690+ "'", i1.equals(2031690));

  }

  @Test
  public void test354() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test354"); }


    long long1 = java.lang.Integer.toUnsignedLong(2362614);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == 2362614L);

  }

  @Test
  public void test355() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test355"); }


    int i2 = java.lang.Integer.rotateLeft(67108864, 841);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 8);

  }

  @Test
  public void test356() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test356"); }


    int i2 = java.lang.Integer.compareUnsigned(469762048, 469762048);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);

  }

  @Test
  public void test357() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test357"); }


    java.lang.String str1 = java.lang.Integer.toBinaryString(43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "101011"+ "'", str1.equals("101011"));

  }

  @Test
  public void test358() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test358"); }


    // The following exception was thrown during execution in test generation
    try {
      java.lang.Integer i2 = java.lang.Integer.valueOf("79", (-1879048192));
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test359() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test359"); }


    java.lang.String str1 = java.lang.Integer.toOctalString(133);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "205"+ "'", str1.equals("205"));

  }

  @Test
  public void test360() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test360"); }


    int i2 = java.lang.Integer.max(32768, 79);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 32768);

  }

  @Test
  public void test361() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test361"); }


    java.lang.String str1 = java.lang.Integer.toBinaryString((-14619));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "11111111111111111100011011100101"+ "'", str1.equals("11111111111111111100011011100101"));

  }

  @Test
  public void test362() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test362"); }


    // The following exception was thrown during execution in test generation
    try {
      java.lang.Integer i1 = java.lang.Integer.valueOf("1f");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test363() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test363"); }


    int i2 = java.lang.Integer.sum(80, 33554560);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 33554640);

  }

  @Test
  public void test364() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test364"); }


    java.lang.String str2 = java.lang.Integer.toUnsignedString((-2147483646), 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "2147483650"+ "'", str2.equals("2147483650"));

  }

  @Test
  public void test365() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test365"); }


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
    java.lang.Long long33 = iPBan2.expires;
    
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

  }

  @Test
  public void test366() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test366"); }


    // The following exception was thrown during execution in test generation
    try {
      int i2 = java.lang.Integer.parseUnsignedInt("89f8", 44);
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test367() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test367"); }


    tp2.Server server0 = new tp2.Server();
    tp2.IP iP5 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b6 = server0.removeException(iP5);
    iP5.setThird((java.lang.Integer)56);
    tp2.IPBan iPBan10 = new tp2.IPBan(iP5, (java.lang.Long)2147483676L);
    java.lang.Long long11 = null;
    tp2.IPBan iPBan12 = new tp2.IPBan(iP5, long11);
    java.lang.Integer i13 = iP5.getFourth();
    java.lang.Integer i14 = iP5.getFirst();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i13 + "' != '" + 5+ "'", i13.equals(5));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i14 + "' != '" + 161+ "'", i14.equals(161));

  }

  @Test
  public void test368() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test368"); }


    long long1 = java.lang.Integer.toUnsignedLong(134217728);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == 134217728L);

  }

  @Test
  public void test369() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test369"); }


    tp2.IP iP4 = new tp2.IP((java.lang.Integer)133, (java.lang.Integer)(-2147483515), (java.lang.Integer)79, (java.lang.Integer)(-2147483620));
    tp2.IPBan iPBan6 = new tp2.IPBan(iP4, (java.lang.Long)14L);
    tp2.Server server7 = new tp2.Server();
    tp2.IP iP12 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b13 = server7.removeException(iP12);
    iP12.setThird((java.lang.Integer)56);
    tp2.IPBan iPBan17 = new tp2.IPBan(iP12, (java.lang.Long)2147483676L);
    iP12.setFirst((java.lang.Integer)16);
    iPBan6.setIp(iP12);
    iP12.setFourth((java.lang.Integer)939524096);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);

  }

  @Test
  public void test370() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test370"); }


    int i1 = java.lang.Integer.numberOfLeadingZeros(7000);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 19);

  }

  @Test
  public void test371() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test371"); }


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
    tp2.Server server25 = new tp2.Server();
    tp2.IP iP26 = null;
    boolean b27 = server25.addBan(iP26);
    tp2.IP iP32 = new tp2.IP((java.lang.Integer)31, (java.lang.Integer)31, (java.lang.Integer)31, (java.lang.Integer)0);
    iP32.setSecond((java.lang.Integer)2147483647);
    boolean b35 = server25.addBan(iP32);
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
    boolean b58 = server25.removeBan(iP53);
    tp2.IP iP63 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    iP63.setFirst((java.lang.Integer)161);
    iP63.setThird((java.lang.Integer)3);
    iP63.setFirst((java.lang.Integer)26);
    iP63.setThird((java.lang.Integer)5);
    boolean b72 = server25.removeBan(iP63);
    tp2.IP iP77 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    iP77.setFirst((java.lang.Integer)161);
    iP77.setThird((java.lang.Integer)3);
    iP77.setFirst((java.lang.Integer)26);
    boolean b84 = server25.removeException(iP77);
    iP77.setFourth((java.lang.Integer)(-1));
    boolean b87 = server0.removeException(iP77);
    tp2.IP iP92 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b93 = server0.removeBan(iP92);
    tp2.ITime iTime94 = null;
    server0.setTime(iTime94);
    
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
    org.junit.Assert.assertTrue(b27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == true);
    
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
    org.junit.Assert.assertTrue(b58 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b72 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b84 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b87 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b93 == false);

  }

  @Test
  public void test372() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test372"); }


    int i1 = java.lang.Integer.lowestOneBit(1342177288);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 8);

  }

  @Test
  public void test373() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test373"); }


    java.lang.String str1 = java.lang.Integer.toOctalString(6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "6"+ "'", str1.equals("6"));

  }

  @Test
  public void test374() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test374"); }


    int i1 = java.lang.Integer.parseInt("10010000");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 10010000);

  }

  @Test
  public void test375() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test375"); }


    java.lang.Integer i2 = java.lang.Integer.getInteger("10010842", (java.lang.Integer)939524096);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i2 + "' != '" + 939524096+ "'", i2.equals(939524096));

  }

  @Test
  public void test376() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test376"); }


    // The following exception was thrown during execution in test generation
    try {
      int i1 = java.lang.Integer.parseUnsignedInt("10010000000000000000000000000000");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test377() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test377"); }


    java.lang.Integer i2 = java.lang.Integer.getInteger("320", 14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i2 + "' != '" + 14+ "'", i2.equals(14));

  }

  @Test
  public void test378() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test378"); }


    java.lang.Integer i1 = java.lang.Integer.valueOf(11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 11+ "'", i1.equals(11));

  }

  @Test
  public void test379() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test379"); }


    java.lang.Integer i2 = java.lang.Integer.getInteger("4160749568", 469762049);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i2 + "' != '" + 469762049+ "'", i2.equals(469762049));

  }

  @Test
  public void test380() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test380"); }


    java.lang.Integer i1 = java.lang.Integer.getInteger("2031616");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);

  }

  @Test
  public void test381() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test381"); }


    java.lang.Integer i1 = java.lang.Integer.getInteger("1a");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);

  }

  @Test
  public void test382() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test382"); }


    int i2 = java.lang.Integer.min(11024899, 31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 31);

  }

  @Test
  public void test383() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test383"); }


    java.lang.String str1 = java.lang.Integer.toBinaryString(2031690);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "111110000000001001010"+ "'", str1.equals("111110000000001001010"));

  }

  @Test
  public void test384() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test384"); }


    int i1 = java.lang.Integer.bitCount((-1879048192));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 2);

  }

  @Test
  public void test385() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test385"); }


    int i2 = java.lang.Integer.divideUnsigned(35320, 84410411);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);

  }

  @Test
  public void test386() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test386"); }


    int i2 = java.lang.Integer.compareUnsigned((-2063597440), 79);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);

  }

  @Test
  public void test387() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test387"); }


    int i1 = java.lang.Integer.reverseBytes(84410411);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 721422341);

  }

  @Test
  public void test388() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test388"); }


    java.lang.Integer i2 = java.lang.Integer.getInteger("11111111111111111100011011100101", 3997696);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i2 + "' != '" + 3997696+ "'", i2.equals(3997696));

  }

  @Test
  public void test389() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test389"); }


    int i2 = java.lang.Integer.rotateRight(4, 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 4);

  }

  @Test
  public void test390() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test390"); }


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
    tp2.ITime iTime67 = null;
    server64.setTime(iTime67);
    tp2.IP iP69 = null;
    tp2.IPBan iPBan71 = new tp2.IPBan(iP69, (java.lang.Long)10L);
    tp2.IP iP72 = iPBan71.getIp();
    java.lang.Long long73 = iPBan71.expires;
    tp2.IP iP74 = null;
    iPBan71.ip = iP74;
    tp2.Server server76 = new tp2.Server();
    tp2.IP iP81 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b82 = server76.removeException(iP81);
    java.lang.Integer i83 = iP81.getFirst();
    iPBan71.setIp(iP81);
    boolean b85 = server64.connect(iP81);
    iP81.setFourth((java.lang.Integer)(-1));
    iP81.setFourth((java.lang.Integer)(-1));
    boolean b90 = iP53.equals((java.lang.Object)iP81);
    boolean b91 = server0.removeBan(iP81);
    server0.update();
    tp2.IP iP97 = new tp2.IP((java.lang.Integer)2147480291, (java.lang.Integer)26, (java.lang.Integer)62563, (java.lang.Integer)(-2147483592));
    boolean b98 = server0.connect(iP97);
    
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
    org.junit.Assert.assertNull(iP72);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long73 + "' != '" + 10L+ "'", long73.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b82 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i83 + "' != '" + 161+ "'", i83.equals(161));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b85 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b90 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b91 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b98 == true);

  }

  @Test
  public void test391() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test391"); }


    java.lang.Integer i2 = java.lang.Integer.getInteger("1100101", 79);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i2 + "' != '" + 79+ "'", i2.equals(79));

  }

  @Test
  public void test392() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test392"); }


    int i2 = java.lang.Integer.compareUnsigned((-671088629), 90);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);

  }

  @Test
  public void test393() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test393"); }


    int i1 = java.lang.Integer.numberOfLeadingZeros(11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 28);

  }

  @Test
  public void test394() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test394"); }


    // The following exception was thrown during execution in test generation
    try {
      java.lang.Integer i2 = java.lang.Integer.valueOf("13344223332131", 4096);
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test395() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test395"); }


    java.lang.String str2 = java.lang.Integer.toUnsignedString(268503106, 11585);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "268503106"+ "'", str2.equals("268503106"));

  }

  @Test
  public void test396() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test396"); }


    int i2 = java.lang.Integer.sum(1, 630);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 631);

  }

  @Test
  public void test397() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test397"); }


    // The following exception was thrown during execution in test generation
    try {
      java.lang.Integer i1 = java.lang.Integer.valueOf("1f0046");
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

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test398"); }


    java.lang.Integer i2 = java.lang.Integer.getInteger("1f0046", 111);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i2 + "' != '" + 111+ "'", i2.equals(111));

  }

  @Test
  public void test399() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test399"); }


    java.lang.Integer i1 = new java.lang.Integer("100");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 100+ "'", i1.equals(100));

  }

  @Test
  public void test400() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test400"); }


    int i2 = java.lang.Integer.parseInt("1326", 14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 3366);

  }

  @Test
  public void test401() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test401"); }


    int i2 = java.lang.Integer.divideUnsigned(268435456, 69273664);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 3);

  }

  @Test
  public void test402() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test402"); }


    int i2 = java.lang.Integer.sum(268435456, 20971520);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 289406976);

  }

  @Test
  public void test403() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test403"); }


    long long1 = java.lang.Integer.toUnsignedLong(10010842);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == 10010842L);

  }

  @Test
  public void test404() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test404"); }


    int i1 = java.lang.Integer.reverse(83);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == (-905969664));

  }

  @Test
  public void test405() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test405"); }


    int i1 = java.lang.Integer.parseUnsignedInt("20971520");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 20971520);

  }

  @Test
  public void test406() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test406"); }


    int i1 = java.lang.Integer.numberOfLeadingZeros(21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 27);

  }

  @Test
  public void test407() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test407"); }


    int i2 = java.lang.Integer.rotateRight(1677721761, 20971520);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1677721761);

  }

  @Test
  public void test408() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test408"); }


    int i1 = java.lang.Integer.numberOfTrailingZeros(1275068417);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);

  }

  @Test
  public void test409() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test409"); }


    java.lang.Integer i2 = java.lang.Integer.getInteger("1", (java.lang.Integer)2147480291);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i2 + "' != '" + 2147480291+ "'", i2.equals(2147480291));

  }

  @Test
  public void test410() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test410"); }


    // The following exception was thrown during execution in test generation
    try {
      java.lang.Integer i1 = java.lang.Integer.decode("4294967295");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test411() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test411"); }


    int i2 = java.lang.Integer.max(7000, 161);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 7000);

  }

  @Test
  public void test412() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test412"); }


    // The following exception was thrown during execution in test generation
    try {
      int i2 = java.lang.Integer.parseInt("352322596", 100004);
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

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test413"); }


    java.lang.Integer i1 = java.lang.Integer.valueOf(28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 28+ "'", i1.equals(28));

  }

  @Test
  public void test414() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test414"); }


    java.lang.String str1 = java.lang.Integer.toHexString(536870912);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "20000000"+ "'", str1.equals("20000000"));

  }

  @Test
  public void test415() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test415"); }


    // The following exception was thrown during execution in test generation
    try {
      int i1 = java.lang.Integer.parseInt("10000100001000010000100");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test416() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test416"); }


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
    java.lang.Long long32 = iPBan31.getExpires();
    tp2.IP iP37 = new tp2.IP((java.lang.Integer)31, (java.lang.Integer)31, (java.lang.Integer)31, (java.lang.Integer)0);
    iPBan31.ip = iP37;
    boolean b39 = server0.addBan(iP37);
    
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
    org.junit.Assert.assertTrue("'" + long32 + "' != '" + 10L+ "'", long32.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == true);

  }

  @Test
  public void test417() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test417"); }


    java.lang.Integer i2 = java.lang.Integer.getInteger("6", (java.lang.Integer)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i2 + "' != '" + 0+ "'", i2.equals(0));

  }

  @Test
  public void test418() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test418"); }


    // The following exception was thrown during execution in test generation
    try {
      int i2 = java.lang.Integer.parseInt("1f", 268435466);
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test419() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test419"); }


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
    org.junit.Assert.assertTrue("'" + long20 + "' != '" + 10L+ "'", long20.equals(10L));

  }

  @Test
  public void test420() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test420"); }


    int i1 = java.lang.Integer.parseUnsignedInt("2000204102");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 2000204102);

  }

  @Test
  public void test421() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test421"); }


    int i1 = java.lang.Integer.bitCount(2147483647);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 31);

  }

  @Test
  public void test422() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test422"); }


    java.lang.String str1 = java.lang.Integer.toUnsignedString(50397184);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "50397184"+ "'", str1.equals("50397184"));

  }

  @Test
  public void test423() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test423"); }


    int i2 = java.lang.Integer.compareUnsigned(51200, 31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);

  }

  @Test
  public void test424() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test424"); }


    java.lang.Integer i1 = java.lang.Integer.valueOf(1207959552);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 1207959552+ "'", i1.equals(1207959552));

  }

  @Test
  public void test425() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test425"); }


    int i2 = java.lang.Integer.divideUnsigned(4329604, 2048);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 2114);

  }

  @Test
  public void test426() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test426"); }


    int i2 = java.lang.Integer.compareUnsigned((-1593835520), 33554640);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);

  }

  @Test
  public void test427() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test427"); }


    tp2.IP iP0 = null;
    tp2.IPBan iPBan2 = new tp2.IPBan(iP0, (java.lang.Long)10L);
    java.lang.Long long3 = iPBan2.getExpires();
    tp2.IP iP4 = iPBan2.getIp();
    iPBan2.setExpires((java.lang.Long)100L);
    java.lang.Long long7 = iPBan2.expires;
    iPBan2.setExpires((java.lang.Long)2147483704L);
    tp2.IP iP10 = iPBan2.getIp();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L+ "'", long3.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L+ "'", long7.equals(100L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP10);

  }

  @Test
  public void test428() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test428"); }


    int i2 = java.lang.Integer.sum(10010842, 50397184);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 60408026);

  }

  @Test
  public void test429() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test429"); }


    int i2 = java.lang.Integer.sum(1108377608, 28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1108377636);

  }

  @Test
  public void test430() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test430"); }


    // The following exception was thrown during execution in test generation
    try {
      int i1 = java.lang.Integer.parseInt("10010000000000000000000000000000");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test431() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test431"); }


    int i2 = java.lang.Integer.compare(832, (-1291845532));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);

  }

  @Test
  public void test432() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test432"); }


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
    tp2.IP iP31 = null;
    tp2.IPBan iPBan33 = new tp2.IPBan(iP31, (java.lang.Long)10L);
    tp2.IP iP34 = iPBan33.getIp();
    java.lang.Long long35 = iPBan33.expires;
    tp2.IP iP36 = null;
    iPBan33.ip = iP36;
    tp2.IP iP38 = null;
    tp2.IPBan iPBan40 = new tp2.IPBan(iP38, (java.lang.Long)10L);
    tp2.IP iP41 = iPBan40.getIp();
    java.lang.Long long42 = iPBan40.expires;
    tp2.Server server43 = new tp2.Server();
    tp2.IP iP48 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b49 = server43.removeException(iP48);
    java.lang.Integer i50 = iP48.getFirst();
    iPBan40.setIp(iP48);
    tp2.IP iP52 = iPBan40.ip;
    tp2.IP iP53 = iPBan40.getIp();
    iPBan33.setIp(iP53);
    tp2.IP iP59 = new tp2.IP((java.lang.Integer)31, (java.lang.Integer)(-2147483592), (java.lang.Integer)133, (java.lang.Integer)(-2147483646));
    iPBan33.setIp(iP59);
    java.lang.Integer i61 = iP59.getThird();
    boolean b62 = server0.removeBan(iP59);
    iP59.setFirst((java.lang.Integer)5);
    
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
    org.junit.Assert.assertNull(iP34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long35 + "' != '" + 10L+ "'", long35.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long42 + "' != '" + 10L+ "'", long42.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b49 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i50 + "' != '" + 161+ "'", i50.equals(161));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i61 + "' != '" + 133+ "'", i61.equals(133));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b62 == false);

  }

  @Test
  public void test433() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test433"); }


    int i2 = java.lang.Integer.sum(2147483647, 4194304);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == (-2143289345));

  }

  @Test
  public void test434() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test434"); }


    java.lang.String str1 = java.lang.Integer.toBinaryString(1476395008);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "1011000000000000000000000000000"+ "'", str1.equals("1011000000000000000000000000000"));

  }

  @Test
  public void test435() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test435"); }


    int i2 = java.lang.Integer.compareUnsigned(51200, 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);

  }

  @Test
  public void test436() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test436"); }


    int i2 = java.lang.Integer.parseInt("35320", 7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 9079);

  }

  @Test
  public void test437() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test437"); }


    int i1 = java.lang.Integer.bitCount(2082996226);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 8);

  }

  @Test
  public void test438() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test438"); }


    java.lang.Integer i1 = java.lang.Integer.getInteger("47463");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);

  }

  @Test
  public void test439() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test439"); }


    int i1 = java.lang.Integer.numberOfTrailingZeros(822083745);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);

  }

  @Test
  public void test440() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test440"); }


    // The following exception was thrown during execution in test generation
    try {
      java.lang.Integer i1 = java.lang.Integer.valueOf("8500004f");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test441() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test441"); }


    int i2 = java.lang.Integer.max(5211392, 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 5211392);

  }

  @Test
  public void test442() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test442"); }


    // The following exception was thrown during execution in test generation
    try {
      int i2 = java.lang.Integer.parseUnsignedInt("38", 51200);
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test443() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test443"); }


    // The following exception was thrown during execution in test generation
    try {
      int i2 = java.lang.Integer.divideUnsigned(83886080, 0);
      org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException");
    } catch (java.lang.ArithmeticException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArithmeticException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test444() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test444"); }


    long long1 = java.lang.Integer.toUnsignedLong(3997696);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == 3997696L);

  }

  @Test
  public void test445() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test445"); }


    int i1 = java.lang.Integer.numberOfTrailingZeros(458885);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);

  }

  @Test
  public void test446() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test446"); }


    // The following exception was thrown during execution in test generation
    try {
      java.lang.Integer i1 = java.lang.Integer.valueOf("1011000000000000000000000000000");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test447() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test447"); }


    java.lang.String str1 = java.lang.Integer.toOctalString(8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "10"+ "'", str1.equals("10"));

  }

  @Test
  public void test448() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test448"); }


    java.lang.Integer i1 = java.lang.Integer.getInteger("640000a1");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);

  }

  @Test
  public void test449() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test449"); }


    int i2 = java.lang.Integer.divideUnsigned(7, 18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);

  }

  @Test
  public void test450() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test450"); }


    int i2 = java.lang.Integer.rotateLeft(640, 1108377636);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 10240);

  }

  @Test
  public void test451() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test451"); }


    tp2.Server server0 = new tp2.Server();
    tp2.IP iP5 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b6 = server0.removeException(iP5);
    server0.update();
    tp2.Server server8 = new tp2.Server();
    tp2.IP iP13 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b14 = server8.removeException(iP13);
    java.lang.Integer i15 = iP13.getFirst();
    boolean b16 = server0.addBan(iP13);
    tp2.Server server17 = new tp2.Server();
    tp2.IP iP18 = null;
    boolean b19 = server17.addBan(iP18);
    tp2.IP iP24 = new tp2.IP((java.lang.Integer)31, (java.lang.Integer)31, (java.lang.Integer)31, (java.lang.Integer)0);
    iP24.setSecond((java.lang.Integer)2147483647);
    boolean b27 = server17.addBan(iP24);
    tp2.Server server28 = new tp2.Server();
    tp2.IP iP29 = null;
    boolean b30 = server28.addBan(iP29);
    tp2.Server server31 = new tp2.Server();
    tp2.IP iP36 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b37 = server31.removeException(iP36);
    boolean b39 = iP36.equals((java.lang.Object)(-1L));
    boolean b40 = server28.removeBan(iP36);
    java.lang.Integer i41 = iP36.getFourth();
    boolean b42 = server17.removeBan(iP36);
    tp2.ITime iTime43 = null;
    server17.setTime(iTime43);
    server17.update();
    tp2.IP iP46 = null;
    tp2.IPBan iPBan48 = new tp2.IPBan(iP46, (java.lang.Long)10L);
    tp2.IP iP49 = iPBan48.getIp();
    java.lang.Long long50 = iPBan48.expires;
    tp2.Server server51 = new tp2.Server();
    tp2.IP iP56 = new tp2.IP((java.lang.Integer)161, (java.lang.Integer)(-2147483648), (java.lang.Integer)939524096, (java.lang.Integer)5);
    boolean b57 = server51.removeException(iP56);
    java.lang.Integer i58 = iP56.getFirst();
    iPBan48.setIp(iP56);
    java.lang.Integer i60 = iP56.getThird();
    iP56.setFirst((java.lang.Integer)800);
    boolean b63 = server17.addBan(iP56);
    java.lang.Integer i64 = iP56.getSecond();
    boolean b65 = server0.connect(iP56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i15 + "' != '" + 161+ "'", i15.equals(161));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
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
    org.junit.Assert.assertTrue("'" + i41 + "' != '" + 5+ "'", i41.equals(5));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long50 + "' != '" + 10L+ "'", long50.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b57 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i58 + "' != '" + 161+ "'", i58.equals(161));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i60 + "' != '" + 939524096+ "'", i60.equals(939524096));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b63 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i64 + "' != '" + (-2147483648)+ "'", i64.equals((-2147483648)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b65 == true);

  }

  @Test
  public void test452() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test452"); }


    int i2 = java.lang.Integer.rotateLeft(3, 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 3);

  }

  @Test
  public void test453() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test453"); }


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
    tp2.IP iP78 = iPBan2.getIp();
    
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
    org.junit.Assert.assertNotNull(iP78);

  }

  @Test
  public void test454() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test454"); }


    java.lang.Integer i1 = new java.lang.Integer(1073741824);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 1073741824+ "'", i1.equals(1073741824));

  }

  @Test
  public void test455() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test455"); }


    int i2 = java.lang.Integer.compare(1073741824, 10010842);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);

  }

  @Test
  public void test456() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test456"); }


    // The following exception was thrown during execution in test generation
    try {
      java.lang.Integer i2 = java.lang.Integer.valueOf("113664114", 176);
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test457() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test457"); }


    int i1 = java.lang.Integer.numberOfTrailingZeros(16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 4);

  }

  @Test
  public void test458() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test458"); }


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

  }

  @Test
  public void test459() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test459"); }


    tp2.IP iP0 = null;
    tp2.IPBan iPBan2 = new tp2.IPBan(iP0, (java.lang.Long)10L);
    tp2.IP iP3 = iPBan2.getIp();
    iPBan2.expires = 0L;
    tp2.IP iP6 = iPBan2.ip;
    java.lang.Long long7 = iPBan2.getExpires();
    java.lang.Long long8 = iPBan2.expires;
    
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
  public void test460() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test460"); }


    int i1 = java.lang.Integer.signum(524288);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 1);

  }

  @Test
  public void test461() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test461"); }


    int i1 = java.lang.Integer.highestOneBit(21262214);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 16777216);

  }

  @Test
  public void test462() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test462"); }


    java.lang.String str1 = java.lang.Integer.toBinaryString(2000204102);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "1110111001110001011000101000110"+ "'", str1.equals("1110111001110001011000101000110"));

  }

  @Test
  public void test463() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test463"); }


    int i2 = java.lang.Integer.sum(84410411, 469761943);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 554172354);

  }

  @Test
  public void test464() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test464"); }


    int i2 = java.lang.Integer.rotateLeft(186646533, 2147480291);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1493172264);

  }

  @Test
  public void test465() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test465"); }


    int i1 = java.lang.Integer.reverse(14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 1879048192);

  }

  @Test
  public void test466() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test466"); }


    tp2.IP iP0 = null;
    tp2.IPBan iPBan2 = new tp2.IPBan(iP0, (java.lang.Long)10L);
    java.lang.Long long3 = iPBan2.getExpires();
    tp2.IP iP8 = new tp2.IP((java.lang.Integer)31, (java.lang.Integer)31, (java.lang.Integer)31, (java.lang.Integer)0);
    iPBan2.ip = iP8;
    iP8.setFirst((java.lang.Integer)2);
    tp2.IPBan iPBan13 = new tp2.IPBan(iP8, (java.lang.Long)3997696L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L+ "'", long3.equals(10L));

  }

  @Test
  public void test467() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test467"); }


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
    iPBan2.setExpires((java.lang.Long)2147483647L);
    
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
  public void test468() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test468"); }


    int i2 = java.lang.Integer.max(88, (-1587281920));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 88);

  }

  @Test
  public void test469() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test469"); }


    java.lang.Integer i2 = java.lang.Integer.getInteger("7000", (java.lang.Integer)524288);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i2 + "' != '" + 524288+ "'", i2.equals(524288));

  }

  @Test
  public void test470() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test470"); }


    java.lang.String str1 = java.lang.Integer.toHexString(61);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "3d"+ "'", str1.equals("3d"));

  }

  @Test
  public void test471() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test471"); }


    int i1 = java.lang.Integer.numberOfTrailingZeros(2114);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 1);

  }

  @Test
  public void test472() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test472"); }


    // The following exception was thrown during execution in test generation
    try {
      korat.finitization.IFinitization iFinitization1 = tp2.Server.finServer(1010);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test473() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test473"); }


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
    iP41.setThird((java.lang.Integer)(-1593835520));
    boolean b44 = server0.removeException(iP41);
    
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
    org.junit.Assert.assertTrue(b44 == false);

  }

  @Test
  public void test474() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test474"); }


    int i1 = java.lang.Integer.reverseBytes(21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 352321536);

  }

  @Test
  public void test475() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test475"); }


    // The following exception was thrown during execution in test generation
    try {
      java.lang.Integer i1 = java.lang.Integer.valueOf("3928g3h1");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test476() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test476"); }


    int i1 = java.lang.Integer.highestOneBit(27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 16);

  }

  @Test
  public void test477() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test477"); }


    java.lang.String str2 = java.lang.Integer.toUnsignedString(31, 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "v"+ "'", str2.equals("v"));

  }

  @Test
  public void test478() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test478"); }


    // The following exception was thrown during execution in test generation
    try {
      int i1 = java.lang.Integer.parseInt("ne7");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test479() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test479"); }


    java.lang.String str1 = java.lang.Integer.toOctalString(38000);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "112160"+ "'", str1.equals("112160"));

  }

  @Test
  public void test480() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test480"); }


    int i1 = java.lang.Integer.parseUnsignedInt("1326");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 1326);

  }

  @Test
  public void test481() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test481"); }


    java.lang.String str1 = java.lang.Integer.toHexString(13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "d"+ "'", str1.equals("d"));

  }

  @Test
  public void test482() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test482"); }


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
    iP24.setSecond((java.lang.Integer)268503106);
    
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

  }

  @Test
  public void test483() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test483"); }


    int i2 = java.lang.Integer.compare(939524096, 70);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);

  }

  @Test
  public void test484() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test484"); }


    int i1 = java.lang.Integer.numberOfTrailingZeros(800);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 5);

  }

  @Test
  public void test485() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test485"); }


    // The following exception was thrown during execution in test generation
    try {
      java.lang.Integer i1 = java.lang.Integer.decode("4160749568");
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

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test486"); }


    int i2 = java.lang.Integer.compareUnsigned(841, 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);

  }

  @Test
  public void test487() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test487"); }


    // The following exception was thrown during execution in test generation
    try {
      int i2 = java.lang.Integer.parseInt("66664134", 32);
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test488() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test488"); }


    int i1 = java.lang.Integer.reverseBytes((-1067707136));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 1400000);

  }

  @Test
  public void test489() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test489"); }


    java.lang.Integer i1 = java.lang.Integer.decode("61");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 61+ "'", i1.equals(61));

  }

  @Test
  public void test490() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test490"); }


    int i1 = java.lang.Integer.reverseBytes(2114);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 1107820544);

  }

  @Test
  public void test491() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test491"); }


    java.lang.String str1 = java.lang.Integer.toOctalString(289406976);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "2120000000"+ "'", str1.equals("2120000000"));

  }

  @Test
  public void test492() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test492"); }


    int i1 = java.lang.Integer.parseUnsignedInt("32768");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 32768);

  }

  @Test
  public void test493() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test493"); }


    int i2 = java.lang.Integer.sum(35, 38000000);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 38000035);

  }

  @Test
  public void test494() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test494"); }


    int i1 = java.lang.Integer.numberOfLeadingZeros(2031616);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 11);

  }

  @Test
  public void test495() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test495"); }


    tp2.IP iP4 = new tp2.IP((java.lang.Integer)24, (java.lang.Integer)(-268435820), (java.lang.Integer)10, (java.lang.Integer)637534208);

  }

  @Test
  public void test496() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test496"); }


    int i2 = java.lang.Integer.compare(469761943, 939524096);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == (-1));

  }

  @Test
  public void test497() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test497"); }


    java.lang.Integer i1 = java.lang.Integer.decode("7000");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 7000+ "'", i1.equals(7000));

  }

  @Test
  public void test498() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test498"); }


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
    iP65.setSecond((java.lang.Integer)469762048);
    iP65.setSecond((java.lang.Integer)14379100);
    
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
  public void test499() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test499"); }


    java.lang.Integer i2 = java.lang.Integer.getInteger("3855024127", 2000204102);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i2 + "' != '" + 2000204102+ "'", i2.equals(2000204102));

  }

  @Test
  public void test500() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test500"); }


    java.lang.Integer i3 = null;
    // The following exception was thrown during execution in test generation
    try {
      tp2.IP iP4 = new tp2.IP((java.lang.Integer)4096, (java.lang.Integer)1207959552, (java.lang.Integer)90, i3);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

}
