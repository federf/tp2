package randoopTestsServer1;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest1 {

  public static boolean debug = false;

  @Test
  public void test001() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test001"); }


    java.lang.String str1 = java.lang.Integer.toUnsignedString(167772260);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "167772260"+ "'", str1.equals("167772260"));

  }

  @Test
  public void test002() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test002"); }


    // The following exception was thrown during execution in test generation
    try {
      java.lang.Integer i2 = java.lang.Integer.valueOf("13", (-129));
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

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test003"); }


    int i1 = java.lang.Integer.highestOneBit(201326592);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 134217728);

  }

  @Test
  public void test004() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test004"); }


    tp2.SinglyLinkedList singlyLinkedList0 = new tp2.SinglyLinkedList();
    tp2.IP iP5 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i6 = iP5.getThird();
    boolean b7 = singlyLinkedList0.remove(iP5);
    tp2.IP iP12 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i13 = iP12.getFourth();
    singlyLinkedList0.add(iP12);
    int i15 = singlyLinkedList0.getSize();
    int i16 = singlyLinkedList0.getSize();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i6 + "' != '" + (-1)+ "'", i6.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i13 + "' != '" + 100+ "'", i13.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 1);

  }

  @Test
  public void test005() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test005"); }


    java.lang.Integer i1 = java.lang.Integer.valueOf(201326784);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 201326784+ "'", i1.equals(201326784));

  }

  @Test
  public void test006() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test006"); }


    java.lang.String str1 = java.lang.Integer.toOctalString(33554432);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "200000000"+ "'", str1.equals("200000000"));

  }

  @Test
  public void test007() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test007"); }


    int i2 = java.lang.Integer.compare(33554432, 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);

  }

  @Test
  public void test008() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test008"); }


    int i1 = java.lang.Integer.highestOneBit(11884);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 8192);

  }

  @Test
  public void test009() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test009"); }


    java.lang.Integer i1 = new java.lang.Integer(5120);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 5120+ "'", i1.equals(5120));

  }

  @Test
  public void test010() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test010"); }


    // The following exception was thrown during execution in test generation
    try {
      java.lang.Integer i2 = java.lang.Integer.valueOf("4", 100);
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

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test011"); }


    int i1 = java.lang.Integer.lowestOneBit((-2147483648));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == (-2147483648));

  }

  @Test
  public void test012() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test012"); }


    int i1 = java.lang.Integer.reverse(16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 134217728);

  }

  @Test
  public void test013() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test013"); }


    int i1 = java.lang.Integer.signum(1476395008);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 1);

  }

  @Test
  public void test014() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test014"); }


    tp2.SinglyLinkedList singlyLinkedList0 = new tp2.SinglyLinkedList();
    tp2.IP iP5 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i6 = iP5.getThird();
    boolean b7 = singlyLinkedList0.remove(iP5);
    boolean b8 = singlyLinkedList0.isEmpty();
    int i9 = singlyLinkedList0.getSize();
    tp2.IP iP14 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i15 = iP14.getThird();
    iP14.setFourth((java.lang.Integer)0);
    boolean b18 = singlyLinkedList0.contains(iP14);
    boolean b19 = singlyLinkedList0.isEmpty();
    tp2.IP iP24 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i25 = iP24.getFirst();
    java.lang.Integer i26 = iP24.getFirst();
    singlyLinkedList0.add(iP24);
    tp2.Server server28 = new tp2.Server();
    boolean b29 = server28.exceptionsNotRepeated();
    boolean b30 = server28.bansSorted();
    boolean b31 = server28.notSharedElements();
    tp2.SinglyLinkedList singlyLinkedList32 = new tp2.SinglyLinkedList();
    tp2.IP iP37 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i38 = iP37.getFourth();
    singlyLinkedList32.add(iP37);
    boolean b40 = server28.addException(iP37);
    java.lang.Integer i41 = iP37.getFourth();
    boolean b42 = singlyLinkedList0.contains(iP37);
    iP37.setSecond((java.lang.Integer)134217728);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i6 + "' != '" + (-1)+ "'", i6.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i15 + "' != '" + (-1)+ "'", i15.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i25 + "' != '" + (-1)+ "'", i25.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i26 + "' != '" + (-1)+ "'", i26.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i38 + "' != '" + 100+ "'", i38.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i41 + "' != '" + 100+ "'", i41.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == true);

  }

  @Test
  public void test015() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test015"); }


    java.lang.Integer i2 = java.lang.Integer.getInteger("c", 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i2 + "' != '" + 0+ "'", i2.equals(0));

  }

  @Test
  public void test016() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test016"); }


    java.lang.String str1 = java.lang.Integer.toHexString(1476395008);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "58000000"+ "'", str1.equals("58000000"));

  }

  @Test
  public void test017() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test017"); }


    int i1 = java.lang.Integer.bitCount(784);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 3);

  }

  @Test
  public void test018() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test018"); }


    int i1 = java.lang.Integer.bitCount(1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 1);

  }

  @Test
  public void test019() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test019"); }


    int i1 = java.lang.Integer.reverse(32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 67108864);

  }

  @Test
  public void test020() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test020"); }


    int i2 = java.lang.Integer.compareUnsigned(16384, 201326592);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == (-1));

  }

  @Test
  public void test021() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test021"); }


    int i1 = java.lang.Integer.reverse(67108864);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 32);

  }

  @Test
  public void test022() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test022"); }


    java.lang.Integer i1 = null;
    // The following exception was thrown during execution in test generation
    try {
      tp2.IP iP4 = new tp2.IP((java.lang.Integer)(-2), i1, (java.lang.Integer)8, (java.lang.Integer)1073741824);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test023() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test023"); }


    tp2.IP iP4 = new tp2.IP((java.lang.Integer)1073741824, (java.lang.Integer)(-1), (java.lang.Integer)16, (java.lang.Integer)1);
    iP4.setThird((java.lang.Integer)(-1073741824));

  }

  @Test
  public void test024() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test024"); }


    korat.finitization.IFinitization iFinitization1 = tp2.Server.finServer(16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iFinitization1);

  }

  @Test
  public void test025() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test025"); }


    tp2.Server server0 = new tp2.Server();
    boolean b1 = server0.exceptionsNotRepeated();
    boolean b2 = server0.bansSorted();
    boolean b3 = server0.notSharedElements();
    boolean b4 = server0.bansSorted();
    server0.update();
    tp2.IP iP10 = new tp2.IP((java.lang.Integer)11100, (java.lang.Integer)40, (java.lang.Integer)28, (java.lang.Integer)727449600);
    boolean b11 = server0.addException(iP10);
    server0.update();
    tp2.Server server13 = new tp2.Server();
    tp2.IP iP18 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    boolean b19 = server13.removeBan(iP18);
    tp2.IP iP24 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i25 = iP24.getThird();
    iP24.setFourth((java.lang.Integer)0);
    iP24.setSecond((java.lang.Integer)3);
    iP24.setFourth((java.lang.Integer)12);
    boolean b32 = server13.addBan(iP24);
    boolean b33 = server0.addException(iP24);
    boolean b34 = server0.bansNotRepeatedExpirationOrIP();
    boolean b35 = server0.exceptionsNotRepeated();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i25 + "' != '" + (-1)+ "'", i25.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == true);

  }

  @Test
  public void test026() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test026"); }


    int i2 = java.lang.Integer.sum(671088640, 4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 671088644);

  }

  @Test
  public void test027() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test027"); }


    tp2.IP iP4 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i5 = iP4.getFirst();
    java.lang.Integer i6 = iP4.getSecond();
    iP4.setFirst((java.lang.Integer)201326592);
    tp2.IPBan iPBan10 = new tp2.IPBan(iP4, (java.lang.Long)727449600L);
    tp2.IP iP11 = iPBan10.getIp();
    tp2.Server server12 = new tp2.Server();
    boolean b13 = server12.exceptionsNotRepeated();
    boolean b14 = server12.bansSorted();
    boolean b15 = server12.notSharedElements();
    tp2.Server server16 = new tp2.Server();
    boolean b17 = server16.notSharedElements();
    tp2.SinglyLinkedList singlyLinkedList18 = new tp2.SinglyLinkedList();
    tp2.IP iP23 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i24 = iP23.getThird();
    boolean b25 = singlyLinkedList18.remove(iP23);
    boolean b26 = server16.addException(iP23);
    tp2.SinglyLinkedList singlyLinkedList27 = new tp2.SinglyLinkedList();
    tp2.IP iP32 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i33 = iP32.getFourth();
    singlyLinkedList27.add(iP32);
    java.lang.Integer i35 = iP32.getFirst();
    boolean b36 = server16.removeBan(iP32);
    tp2.ITime iTime37 = null;
    server16.setTime(iTime37);
    boolean b39 = server16.notSharedElements();
    tp2.IP iP44 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i45 = iP44.getThird();
    iP44.setFourth((java.lang.Integer)0);
    iP44.setSecond((java.lang.Integer)3);
    boolean b50 = server16.addBan(iP44);
    tp2.SinglyLinkedList singlyLinkedList51 = new tp2.SinglyLinkedList();
    tp2.IP iP56 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i57 = iP56.getThird();
    boolean b58 = singlyLinkedList51.remove(iP56);
    java.lang.Integer i59 = iP56.getThird();
    iP56.setFirst((java.lang.Integer)11100);
    boolean b62 = server16.addBan(iP56);
    boolean b63 = server12.removeException(iP56);
    boolean b64 = iP11.equals((java.lang.Object)server12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i5 + "' != '" + (-1)+ "'", i5.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i6 + "' != '" + (-1)+ "'", i6.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i24 + "' != '" + (-1)+ "'", i24.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i33 + "' != '" + 100+ "'", i33.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i35 + "' != '" + (-1)+ "'", i35.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i45 + "' != '" + (-1)+ "'", i45.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b50 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i57 + "' != '" + (-1)+ "'", i57.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b58 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i59 + "' != '" + (-1)+ "'", i59.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b62 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b63 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b64 == false);

  }

  @Test
  public void test028() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test028"); }


    int i1 = java.lang.Integer.parseUnsignedInt("4");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 4);

  }

  @Test
  public void test029() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test029"); }


    tp2.SinglyLinkedList singlyLinkedList0 = new tp2.SinglyLinkedList();
    tp2.IP iP5 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i6 = iP5.getThird();
    boolean b7 = singlyLinkedList0.remove(iP5);
    boolean b8 = singlyLinkedList0.isEmpty();
    int i9 = singlyLinkedList0.getSize();
    tp2.IP iP14 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i15 = iP14.getThird();
    iP14.setFourth((java.lang.Integer)0);
    boolean b18 = singlyLinkedList0.contains(iP14);
    boolean b19 = singlyLinkedList0.isEmpty();
    tp2.SinglyLinkedList singlyLinkedList20 = new tp2.SinglyLinkedList();
    tp2.Server server21 = new tp2.Server();
    boolean b22 = server21.exceptionsNotRepeated();
    tp2.IP iP27 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i28 = iP27.getThird();
    iP27.setSecond((java.lang.Integer)10);
    boolean b31 = server21.removeBan(iP27);
    boolean b32 = singlyLinkedList20.remove(iP27);
    tp2.IP iP33 = null;
    singlyLinkedList20.add(iP33);
    tp2.IP iP36 = singlyLinkedList20.get(469762048);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList37 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP42 = new tp2.IP((java.lang.Integer)150994944, (java.lang.Integer)11100, (java.lang.Integer)784, (java.lang.Integer)0);
    boolean b43 = strictlySortedSinglyLinkedList37.removeFromIP(iP42);
    boolean b44 = singlyLinkedList20.contains(iP42);
    boolean b45 = singlyLinkedList0.remove(iP42);
    java.lang.Integer i46 = iP42.getFirst();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i6 + "' != '" + (-1)+ "'", i6.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i15 + "' != '" + (-1)+ "'", i15.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i28 + "' != '" + (-1)+ "'", i28.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b43 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i46 + "' != '" + 150994944+ "'", i46.equals(150994944));

  }

  @Test
  public void test030() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test030"); }


    int i1 = java.lang.Integer.lowestOneBit(26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 2);

  }

  @Test
  public void test031() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test031"); }


    tp2.Server server0 = new tp2.Server();
    tp2.IP iP5 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    boolean b6 = server0.removeBan(iP5);
    boolean b7 = server0.bansSorted();
    boolean b8 = server0.exceptionsNotRepeated();
    tp2.Server server9 = new tp2.Server();
    boolean b10 = server9.exceptionsNotRepeated();
    tp2.IP iP15 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i16 = iP15.getThird();
    iP15.setSecond((java.lang.Integer)10);
    boolean b19 = server9.removeBan(iP15);
    boolean b20 = server0.connect(iP15);
    tp2.SinglyLinkedList singlyLinkedList21 = new tp2.SinglyLinkedList();
    tp2.IP iP26 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i27 = iP26.getThird();
    boolean b28 = singlyLinkedList21.remove(iP26);
    java.lang.Integer i29 = iP26.getThird();
    java.lang.Integer i30 = iP26.getFourth();
    boolean b31 = server0.addException(iP26);
    tp2.Server server32 = new tp2.Server();
    tp2.IP iP37 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    boolean b38 = server32.removeBan(iP37);
    java.lang.Integer i39 = iP37.getFirst();
    iP37.setThird((java.lang.Integer)134217599);
    boolean b42 = server0.addBan(iP37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i16 + "' != '" + (-1)+ "'", i16.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i27 + "' != '" + (-1)+ "'", i27.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i29 + "' != '" + (-1)+ "'", i29.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i30 + "' != '" + 100+ "'", i30.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i39 + "' != '" + (-1)+ "'", i39.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == true);

  }

  @Test
  public void test032() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test032"); }


    java.lang.Integer i1 = new java.lang.Integer("200000000");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 200000000+ "'", i1.equals(200000000));

  }

  @Test
  public void test033() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test033"); }


    int i2 = java.lang.Integer.remainderUnsigned(11884, 88770);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 11884);

  }

  @Test
  public void test034() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test034"); }


    int i2 = java.lang.Integer.max((-129), 48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 48);

  }

  @Test
  public void test035() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test035"); }


    // The following exception was thrown during execution in test generation
    try {
      int i1 = java.lang.Integer.parseUnsignedInt("1001000000000000000000000000");
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

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test036"); }


    java.lang.Integer i1 = java.lang.Integer.getInteger("20");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);

  }

  @Test
  public void test037() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test037"); }


    tp2.SinglyLinkedList singlyLinkedList0 = new tp2.SinglyLinkedList();
    tp2.IP iP5 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i6 = iP5.getThird();
    boolean b7 = singlyLinkedList0.remove(iP5);
    tp2.IPBan iPBan9 = new tp2.IPBan(iP5, (java.lang.Long)10L);
    tp2.IP iP14 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i15 = iP14.getFourth();
    iPBan9.setIp(iP14);
    tp2.IPBan iPBan18 = new tp2.IPBan(iP14, (java.lang.Long)10L);
    java.lang.Long long19 = iPBan18.getExpires();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i6 + "' != '" + (-1)+ "'", i6.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i15 + "' != '" + 100+ "'", i15.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long19 + "' != '" + 10L+ "'", long19.equals(10L));

  }

  @Test
  public void test038() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test038"); }


    java.lang.String str2 = java.lang.Integer.toUnsignedString(469762048, 1476395008);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "469762048"+ "'", str2.equals("469762048"));

  }

  @Test
  public void test039() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test039"); }


    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList0 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP5 = new tp2.IP((java.lang.Integer)150994944, (java.lang.Integer)11100, (java.lang.Integer)784, (java.lang.Integer)0);
    boolean b6 = strictlySortedSinglyLinkedList0.removeFromIP(iP5);
    tp2.SinglyLinkedList singlyLinkedList7 = new tp2.SinglyLinkedList();
    tp2.IP iP12 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i13 = iP12.getThird();
    boolean b14 = singlyLinkedList7.remove(iP12);
    tp2.IPBan iPBan16 = new tp2.IPBan(iP12, (java.lang.Long)10L);
    tp2.IP iP21 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i22 = iP21.getFourth();
    iPBan16.setIp(iP21);
    java.lang.Long long24 = iPBan16.getExpires();
    java.lang.Long long25 = iPBan16.getExpires();
    tp2.IP iP30 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i31 = iP30.getFirst();
    java.lang.Integer i32 = iP30.getSecond();
    iP30.setFirst((java.lang.Integer)201326592);
    iPBan16.setIp(iP30);
    tp2.SinglyLinkedList singlyLinkedList36 = new tp2.SinglyLinkedList();
    tp2.IP iP41 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i42 = iP41.getThird();
    boolean b43 = singlyLinkedList36.remove(iP41);
    boolean b44 = singlyLinkedList36.isEmpty();
    int i45 = singlyLinkedList36.getSize();
    tp2.IP iP50 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i51 = iP50.getThird();
    iP50.setFourth((java.lang.Integer)0);
    boolean b54 = singlyLinkedList36.contains(iP50);
    boolean b55 = singlyLinkedList36.isEmpty();
    tp2.IP iP60 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i61 = iP60.getFirst();
    java.lang.Integer i62 = iP60.getFirst();
    singlyLinkedList36.add(iP60);
    tp2.SinglyLinkedList singlyLinkedList64 = new tp2.SinglyLinkedList();
    tp2.IP iP69 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i70 = iP69.getThird();
    boolean b71 = singlyLinkedList64.remove(iP69);
    tp2.Server server72 = new tp2.Server();
    tp2.IP iP77 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    boolean b78 = server72.removeBan(iP77);
    boolean b79 = singlyLinkedList64.contains(iP77);
    singlyLinkedList36.add(iP77);
    iPBan16.setIp(iP77);
    boolean b82 = strictlySortedSinglyLinkedList0.add(iPBan16);
    tp2.IP iP87 = new tp2.IP((java.lang.Integer)5, (java.lang.Integer)1, (java.lang.Integer)0, (java.lang.Integer)12);
    tp2.IPBan iPBan89 = new tp2.IPBan(iP87, (java.lang.Long)100L);
    boolean b90 = strictlySortedSinglyLinkedList0.contains(iPBan89);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i13 + "' != '" + (-1)+ "'", i13.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i22 + "' != '" + 100+ "'", i22.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long24 + "' != '" + 10L+ "'", long24.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long25 + "' != '" + 10L+ "'", long25.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i31 + "' != '" + (-1)+ "'", i31.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i32 + "' != '" + (-1)+ "'", i32.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i42 + "' != '" + (-1)+ "'", i42.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b43 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i45 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i51 + "' != '" + (-1)+ "'", i51.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b54 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b55 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i61 + "' != '" + (-1)+ "'", i61.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i62 + "' != '" + (-1)+ "'", i62.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i70 + "' != '" + (-1)+ "'", i70.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b71 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b78 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b79 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b82 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b90 == false);

  }

  @Test
  public void test040() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test040"); }


    int i2 = java.lang.Integer.rotateRight(5120, 8192);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 5120);

  }

  @Test
  public void test041() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test041"); }


    int i1 = java.lang.Integer.bitCount(13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 3);

  }

  @Test
  public void test042() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test042"); }


    int i2 = java.lang.Integer.compareUnsigned(12, 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);

  }

  @Test
  public void test043() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test043"); }


    tp2.Server server0 = new tp2.Server();
    boolean b1 = server0.notSharedElements();
    tp2.Server server2 = new tp2.Server();
    boolean b3 = server2.exceptionsNotRepeated();
    tp2.ITime iTime4 = null;
    server2.setTime(iTime4);
    tp2.SinglyLinkedList singlyLinkedList6 = new tp2.SinglyLinkedList();
    tp2.Server server7 = new tp2.Server();
    boolean b8 = server7.exceptionsNotRepeated();
    tp2.IP iP13 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i14 = iP13.getThird();
    iP13.setSecond((java.lang.Integer)10);
    boolean b17 = server7.removeBan(iP13);
    boolean b18 = singlyLinkedList6.remove(iP13);
    tp2.SinglyLinkedList singlyLinkedList19 = new tp2.SinglyLinkedList();
    tp2.IP iP24 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i25 = iP24.getThird();
    boolean b26 = singlyLinkedList19.remove(iP24);
    tp2.Server server27 = new tp2.Server();
    tp2.IP iP32 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    boolean b33 = server27.removeBan(iP32);
    boolean b34 = singlyLinkedList19.contains(iP32);
    singlyLinkedList6.add(iP32);
    boolean b36 = server2.addBan(iP32);
    boolean b37 = server0.addException(iP32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i14 + "' != '" + (-1)+ "'", i14.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i25 + "' != '" + (-1)+ "'", i25.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == true);

  }

  @Test
  public void test044() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test044"); }


    int i1 = java.lang.Integer.lowestOneBit(1610612786);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 2);

  }

  @Test
  public void test045() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test045"); }


    java.lang.String str1 = java.lang.Integer.toBinaryString(67108864);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "100000000000000000000000000"+ "'", str1.equals("100000000000000000000000000"));

  }

  @Test
  public void test046() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test046"); }


    tp2.Server server0 = new tp2.Server();
    boolean b1 = server0.bansSorted();
    tp2.IP iP6 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i7 = iP6.getFourth();
    boolean b8 = server0.removeException(iP6);
    tp2.ITime iTime9 = null;
    server0.setTime(iTime9);
    boolean b11 = server0.notSharedElements();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList12 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP17 = new tp2.IP((java.lang.Integer)150994944, (java.lang.Integer)784, (java.lang.Integer)784, (java.lang.Integer)2);
    java.lang.Integer i18 = iP17.getFourth();
    boolean b19 = strictlySortedSinglyLinkedList12.removeFromIP(iP17);
    tp2.SinglyLinkedList singlyLinkedList20 = new tp2.SinglyLinkedList();
    tp2.IP iP25 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i26 = iP25.getThird();
    boolean b27 = singlyLinkedList20.remove(iP25);
    java.lang.Integer i28 = iP25.getThird();
    boolean b29 = strictlySortedSinglyLinkedList12.removeFromIP(iP25);
    tp2.IPBan iPBan31 = strictlySortedSinglyLinkedList12.get(469762048);
    tp2.SinglyLinkedList singlyLinkedList32 = new tp2.SinglyLinkedList();
    tp2.IP iP37 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i38 = iP37.getThird();
    boolean b39 = singlyLinkedList32.remove(iP37);
    tp2.IP iP44 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i45 = iP44.getFirst();
    boolean b46 = singlyLinkedList32.remove(iP44);
    iP44.setFirst((java.lang.Integer)(-2147483648));
    boolean b49 = strictlySortedSinglyLinkedList12.removeFromIP(iP44);
    boolean b50 = server0.removeException(iP44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i7 + "' != '" + 100+ "'", i7.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i18 + "' != '" + 2+ "'", i18.equals(2));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i26 + "' != '" + (-1)+ "'", i26.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i28 + "' != '" + (-1)+ "'", i28.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iPBan31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i38 + "' != '" + (-1)+ "'", i38.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i45 + "' != '" + (-1)+ "'", i45.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b46 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b49 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b50 == false);

  }

  @Test
  public void test047() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test047"); }


    int i1 = java.lang.Integer.numberOfLeadingZeros(33554432);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 6);

  }

  @Test
  public void test048() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test048"); }


    java.lang.Integer i1 = new java.lang.Integer("144");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 144+ "'", i1.equals(144));

  }

  @Test
  public void test049() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test049"); }


    // The following exception was thrown during execution in test generation
    try {
      int i1 = java.lang.Integer.parseInt("10000000000000000000000000000000");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test050() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test050"); }


    tp2.SinglyLinkedList singlyLinkedList0 = new tp2.SinglyLinkedList();
    tp2.IP iP5 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i6 = iP5.getThird();
    boolean b7 = singlyLinkedList0.remove(iP5);
    tp2.IPBan iPBan9 = new tp2.IPBan(iP5, (java.lang.Long)10L);
    java.lang.Long long10 = iPBan9.getExpires();
    iPBan9.setExpires((java.lang.Long)(-1L));
    java.lang.Long long13 = iPBan9.getExpires();
    java.lang.Long long14 = iPBan9.getExpires();
    java.lang.Long long15 = iPBan9.getExpires();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i6 + "' != '" + (-1)+ "'", i6.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long10 + "' != '" + 10L+ "'", long10.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1L)+ "'", long13.equals((-1L)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-1L)+ "'", long14.equals((-1L)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-1L)+ "'", long15.equals((-1L)));

  }

  @Test
  public void test051() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test051"); }


    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList0 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP5 = new tp2.IP((java.lang.Integer)150994944, (java.lang.Integer)784, (java.lang.Integer)784, (java.lang.Integer)2);
    java.lang.Integer i6 = iP5.getFourth();
    boolean b7 = strictlySortedSinglyLinkedList0.removeFromIP(iP5);
    tp2.SinglyLinkedList singlyLinkedList8 = new tp2.SinglyLinkedList();
    tp2.IP iP13 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i14 = iP13.getThird();
    boolean b15 = singlyLinkedList8.remove(iP13);
    java.lang.Integer i16 = iP13.getThird();
    boolean b17 = strictlySortedSinglyLinkedList0.removeFromIP(iP13);
    tp2.IPBan iPBan19 = strictlySortedSinglyLinkedList0.get(167772160);
    int i20 = strictlySortedSinglyLinkedList0.getSize();
    boolean b21 = strictlySortedSinglyLinkedList0.isEmpty();
    int i22 = strictlySortedSinglyLinkedList0.getSize();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i6 + "' != '" + 2+ "'", i6.equals(2));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i14 + "' != '" + (-1)+ "'", i14.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i16 + "' != '" + (-1)+ "'", i16.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iPBan19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 0);

  }

  @Test
  public void test052() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test052"); }


    java.lang.String str1 = java.lang.Integer.toBinaryString(5120);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "1010000000000"+ "'", str1.equals("1010000000000"));

  }

  @Test
  public void test053() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test053"); }


    int i2 = java.lang.Integer.rotateLeft(28, 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 448);

  }

  @Test
  public void test054() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test054"); }


    int i1 = java.lang.Integer.reverseBytes(33554432);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 2);

  }

  @Test
  public void test055() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test055"); }


    tp2.Server server0 = new tp2.Server();
    tp2.IP iP5 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    boolean b6 = server0.removeBan(iP5);
    tp2.ITime iTime7 = null;
    server0.setTime(iTime7);
    server0.update();
    tp2.Server server10 = new tp2.Server();
    boolean b11 = server10.notSharedElements();
    tp2.SinglyLinkedList singlyLinkedList12 = new tp2.SinglyLinkedList();
    tp2.IP iP17 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i18 = iP17.getThird();
    boolean b19 = singlyLinkedList12.remove(iP17);
    boolean b20 = server10.addException(iP17);
    java.lang.Integer i21 = iP17.getFourth();
    boolean b22 = server0.removeException(iP17);
    boolean b23 = server0.bansOkTime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i18 + "' != '" + (-1)+ "'", i18.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i21 + "' != '" + 100+ "'", i21.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);

  }

  @Test
  public void test056() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test056"); }


    int i2 = java.lang.Integer.remainderUnsigned(0, 146800640);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);

  }

  @Test
  public void test057() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test057"); }


    long long1 = java.lang.Integer.toUnsignedLong(536870912);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == 536870912L);

  }

  @Test
  public void test058() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test058"); }


    tp2.SinglyLinkedList singlyLinkedList0 = new tp2.SinglyLinkedList();
    tp2.IP iP5 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i6 = iP5.getThird();
    boolean b7 = singlyLinkedList0.remove(iP5);
    tp2.IPBan iPBan9 = new tp2.IPBan(iP5, (java.lang.Long)10L);
    java.lang.Long long10 = iPBan9.getExpires();
    java.lang.Long long11 = iPBan9.getExpires();
    tp2.SinglyLinkedList singlyLinkedList12 = new tp2.SinglyLinkedList();
    tp2.IP iP17 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i18 = iP17.getThird();
    boolean b19 = singlyLinkedList12.remove(iP17);
    tp2.IPBan iPBan21 = new tp2.IPBan(iP17, (java.lang.Long)10L);
    tp2.IP iP26 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i27 = iP26.getFourth();
    iPBan21.setIp(iP26);
    iPBan9.setIp(iP26);
    iP26.setThird((java.lang.Integer)13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i6 + "' != '" + (-1)+ "'", i6.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long10 + "' != '" + 10L+ "'", long10.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long11 + "' != '" + 10L+ "'", long11.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i18 + "' != '" + (-1)+ "'", i18.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i27 + "' != '" + 100+ "'", i27.equals(100));

  }

  @Test
  public void test059() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test059"); }


    int i2 = java.lang.Integer.max(3, 19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 19);

  }

  @Test
  public void test060() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test060"); }


    int i2 = java.lang.Integer.compare(48, 536870912);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == (-1));

  }

  @Test
  public void test061() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test061"); }


    java.lang.Integer i1 = java.lang.Integer.valueOf("58000000");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 58000000+ "'", i1.equals(58000000));

  }

  @Test
  public void test062() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test062"); }


    java.lang.Integer i1 = new java.lang.Integer(146800640);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 146800640+ "'", i1.equals(146800640));

  }

  @Test
  public void test063() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test063"); }


    tp2.SinglyLinkedList singlyLinkedList0 = new tp2.SinglyLinkedList();
    tp2.IP iP5 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i6 = iP5.getThird();
    boolean b7 = singlyLinkedList0.remove(iP5);
    boolean b8 = singlyLinkedList0.isEmpty();
    int i9 = singlyLinkedList0.getSize();
    tp2.IP iP14 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i15 = iP14.getThird();
    iP14.setFourth((java.lang.Integer)0);
    boolean b18 = singlyLinkedList0.contains(iP14);
    boolean b19 = singlyLinkedList0.isEmpty();
    tp2.SinglyLinkedList singlyLinkedList20 = new tp2.SinglyLinkedList();
    tp2.Server server21 = new tp2.Server();
    boolean b22 = server21.exceptionsNotRepeated();
    tp2.IP iP27 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i28 = iP27.getThird();
    iP27.setSecond((java.lang.Integer)10);
    boolean b31 = server21.removeBan(iP27);
    boolean b32 = singlyLinkedList20.remove(iP27);
    tp2.IP iP33 = null;
    singlyLinkedList20.add(iP33);
    tp2.IP iP36 = singlyLinkedList20.get(469762048);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList37 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP42 = new tp2.IP((java.lang.Integer)150994944, (java.lang.Integer)11100, (java.lang.Integer)784, (java.lang.Integer)0);
    boolean b43 = strictlySortedSinglyLinkedList37.removeFromIP(iP42);
    boolean b44 = singlyLinkedList20.contains(iP42);
    boolean b45 = singlyLinkedList0.remove(iP42);
    tp2.SinglyLinkedList singlyLinkedList46 = new tp2.SinglyLinkedList();
    tp2.IP iP51 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i52 = iP51.getThird();
    boolean b53 = singlyLinkedList46.remove(iP51);
    java.lang.Integer i54 = iP51.getThird();
    java.lang.Integer i55 = iP51.getThird();
    singlyLinkedList0.add(iP51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i6 + "' != '" + (-1)+ "'", i6.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i15 + "' != '" + (-1)+ "'", i15.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i28 + "' != '" + (-1)+ "'", i28.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b43 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i52 + "' != '" + (-1)+ "'", i52.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b53 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i54 + "' != '" + (-1)+ "'", i54.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i55 + "' != '" + (-1)+ "'", i55.equals((-1)));

  }

  @Test
  public void test064() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test064"); }


    int i2 = java.lang.Integer.rotateLeft(805306368, 200000000);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 805306368);

  }

  @Test
  public void test065() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test065"); }


    java.lang.Integer i1 = java.lang.Integer.decode("5");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 5+ "'", i1.equals(5));

  }

  @Test
  public void test066() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test066"); }


    int i2 = java.lang.Integer.compare(671088644, 64);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);

  }

  @Test
  public void test067() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test067"); }


    java.lang.Integer i2 = java.lang.Integer.getInteger("", 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i2 + "' != '" + 2+ "'", i2.equals(2));

  }

  @Test
  public void test068() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test068"); }


    int i2 = java.lang.Integer.min(146800640, 20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 20);

  }

  @Test
  public void test069() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test069"); }


    tp2.Server server0 = new tp2.Server();
    boolean b1 = server0.notSharedElements();
    tp2.SinglyLinkedList singlyLinkedList2 = new tp2.SinglyLinkedList();
    tp2.IP iP7 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i8 = iP7.getThird();
    boolean b9 = singlyLinkedList2.remove(iP7);
    boolean b10 = server0.addException(iP7);
    tp2.SinglyLinkedList singlyLinkedList11 = new tp2.SinglyLinkedList();
    tp2.IP iP16 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i17 = iP16.getFourth();
    singlyLinkedList11.add(iP16);
    java.lang.Integer i19 = iP16.getFirst();
    boolean b20 = server0.removeBan(iP16);
    tp2.ITime iTime21 = null;
    server0.setTime(iTime21);
    boolean b23 = server0.notSharedElements();
    boolean b24 = server0.bansOkTime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i8 + "' != '" + (-1)+ "'", i8.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i17 + "' != '" + 100+ "'", i17.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i19 + "' != '" + (-1)+ "'", i19.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == true);

  }

  @Test
  public void test070() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test070"); }


    int i2 = java.lang.Integer.sum(20, 1073741824);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1073741844);

  }

  @Test
  public void test071() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test071"); }


    java.lang.Integer i1 = new java.lang.Integer("11100");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 11100+ "'", i1.equals(11100));

  }

  @Test
  public void test072() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test072"); }


    tp2.Server server0 = new tp2.Server();
    boolean b1 = server0.exceptionsNotRepeated();
    boolean b2 = server0.bansSorted();
    boolean b3 = server0.notSharedElements();
    boolean b4 = server0.bansSorted();
    server0.update();
    tp2.IP iP10 = new tp2.IP((java.lang.Integer)11100, (java.lang.Integer)40, (java.lang.Integer)28, (java.lang.Integer)727449600);
    boolean b11 = server0.addException(iP10);
    server0.update();
    boolean b13 = server0.bansOkTime();
    server0.update();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);

  }

  @Test
  public void test073() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test073"); }


    // The following exception was thrown during execution in test generation
    try {
      java.lang.Integer i2 = java.lang.Integer.valueOf("1100000000000000000000000000", 0);
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

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test074"); }


    tp2.Server server0 = new tp2.Server();
    boolean b1 = server0.exceptionsNotRepeated();
    boolean b2 = server0.bansSorted();
    boolean b3 = server0.notSharedElements();
    tp2.SinglyLinkedList singlyLinkedList4 = new tp2.SinglyLinkedList();
    tp2.IP iP9 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i10 = iP9.getFourth();
    singlyLinkedList4.add(iP9);
    boolean b12 = server0.addException(iP9);
    tp2.Server server13 = new tp2.Server();
    boolean b14 = server13.notSharedElements();
    tp2.SinglyLinkedList singlyLinkedList15 = new tp2.SinglyLinkedList();
    tp2.IP iP20 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i21 = iP20.getThird();
    boolean b22 = singlyLinkedList15.remove(iP20);
    boolean b23 = server13.addException(iP20);
    tp2.SinglyLinkedList singlyLinkedList24 = new tp2.SinglyLinkedList();
    tp2.IP iP29 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i30 = iP29.getFourth();
    singlyLinkedList24.add(iP29);
    java.lang.Integer i32 = iP29.getFirst();
    boolean b33 = server13.removeBan(iP29);
    tp2.ITime iTime34 = null;
    server13.setTime(iTime34);
    boolean b36 = server13.notSharedElements();
    tp2.IP iP41 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i42 = iP41.getThird();
    iP41.setFourth((java.lang.Integer)0);
    iP41.setSecond((java.lang.Integer)3);
    boolean b47 = server13.addBan(iP41);
    tp2.SinglyLinkedList singlyLinkedList48 = new tp2.SinglyLinkedList();
    tp2.IP iP53 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i54 = iP53.getThird();
    boolean b55 = singlyLinkedList48.remove(iP53);
    java.lang.Integer i56 = iP53.getThird();
    iP53.setFirst((java.lang.Integer)11100);
    boolean b59 = server13.addBan(iP53);
    boolean b60 = server0.removeBan(iP53);
    tp2.ITime iTime61 = null;
    server0.setTime(iTime61);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i10 + "' != '" + 100+ "'", i10.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i21 + "' != '" + (-1)+ "'", i21.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i30 + "' != '" + 100+ "'", i30.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i32 + "' != '" + (-1)+ "'", i32.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i42 + "' != '" + (-1)+ "'", i42.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b47 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i54 + "' != '" + (-1)+ "'", i54.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b55 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i56 + "' != '" + (-1)+ "'", i56.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b59 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b60 == false);

  }

  @Test
  public void test075() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test075"); }


    tp2.SinglyLinkedList singlyLinkedList0 = new tp2.SinglyLinkedList();
    tp2.IP iP5 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i6 = iP5.getThird();
    boolean b7 = singlyLinkedList0.remove(iP5);
    tp2.IPBan iPBan9 = new tp2.IPBan(iP5, (java.lang.Long)10L);
    tp2.IP iP14 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i15 = iP14.getFourth();
    iPBan9.setIp(iP14);
    iP14.setThird((java.lang.Integer)1476395008);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i6 + "' != '" + (-1)+ "'", i6.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i15 + "' != '" + 100+ "'", i15.equals(100));

  }

  @Test
  public void test076() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test076"); }


    java.lang.Integer i1 = java.lang.Integer.getInteger("2621440");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);

  }

  @Test
  public void test077() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test077"); }


    int i1 = java.lang.Integer.lowestOneBit(1476395008);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 134217728);

  }

  @Test
  public void test078() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test078"); }


    int i1 = java.lang.Integer.highestOneBit(18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 16);

  }

  @Test
  public void test079() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test079"); }


    // The following exception was thrown during execution in test generation
    try {
      int i2 = java.lang.Integer.parseInt("a", 0);
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test080() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test080"); }


    int i1 = java.lang.Integer.numberOfTrailingZeros(200000000);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 9);

  }

  @Test
  public void test081() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test081"); }


    int i1 = java.lang.Integer.reverse(536870912);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 4);

  }

  @Test
  public void test082() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test082"); }


    java.lang.Integer i2 = java.lang.Integer.getInteger("58000000", 88770);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i2 + "' != '" + 88770+ "'", i2.equals(88770));

  }

  @Test
  public void test083() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test083"); }


    tp2.Server server0 = new tp2.Server();
    tp2.ITime iTime1 = null;
    server0.setTime(iTime1);
    tp2.ITime iTime3 = null;
    server0.setTime(iTime3);
    tp2.Server server5 = new tp2.Server();
    tp2.IP iP10 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    boolean b11 = server5.removeBan(iP10);
    java.lang.Integer i12 = iP10.getFirst();
    boolean b13 = server0.addException(iP10);
    server0.update();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i12 + "' != '" + (-1)+ "'", i12.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);

  }

  @Test
  public void test084() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test084"); }


    tp2.IP iP4 = new tp2.IP((java.lang.Integer)150994944, (java.lang.Integer)784, (java.lang.Integer)784, (java.lang.Integer)2);
    tp2.SinglyLinkedList singlyLinkedList5 = new tp2.SinglyLinkedList();
    tp2.IP iP10 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i11 = iP10.getThird();
    boolean b12 = singlyLinkedList5.remove(iP10);
    boolean b13 = singlyLinkedList5.isEmpty();
    int i14 = singlyLinkedList5.getSize();
    tp2.IP iP16 = singlyLinkedList5.get(1);
    boolean b17 = iP4.equals((java.lang.Object)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i11 + "' != '" + (-1)+ "'", i11.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);

  }

  @Test
  public void test085() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test085"); }


    tp2.SinglyLinkedList singlyLinkedList0 = new tp2.SinglyLinkedList();
    tp2.SinglyLinkedList singlyLinkedList1 = new tp2.SinglyLinkedList();
    tp2.IP iP6 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i7 = iP6.getThird();
    boolean b8 = singlyLinkedList1.remove(iP6);
    tp2.IPBan iPBan10 = new tp2.IPBan(iP6, (java.lang.Long)10L);
    tp2.IP iP15 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i16 = iP15.getFourth();
    iPBan10.setIp(iP15);
    java.lang.Long long18 = iPBan10.getExpires();
    java.lang.Long long19 = iPBan10.getExpires();
    tp2.IP iP24 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i25 = iP24.getFirst();
    java.lang.Integer i26 = iP24.getSecond();
    iP24.setFirst((java.lang.Integer)201326592);
    iPBan10.setIp(iP24);
    tp2.SinglyLinkedList singlyLinkedList30 = new tp2.SinglyLinkedList();
    tp2.Server server31 = new tp2.Server();
    boolean b32 = server31.exceptionsNotRepeated();
    tp2.IP iP37 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i38 = iP37.getThird();
    iP37.setSecond((java.lang.Integer)10);
    boolean b41 = server31.removeBan(iP37);
    boolean b42 = singlyLinkedList30.remove(iP37);
    tp2.SinglyLinkedList singlyLinkedList43 = new tp2.SinglyLinkedList();
    tp2.IP iP48 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i49 = iP48.getThird();
    boolean b50 = singlyLinkedList43.remove(iP48);
    tp2.Server server51 = new tp2.Server();
    tp2.IP iP56 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    boolean b57 = server51.removeBan(iP56);
    boolean b58 = singlyLinkedList43.contains(iP56);
    singlyLinkedList30.add(iP56);
    iPBan10.setIp(iP56);
    boolean b61 = singlyLinkedList0.remove(iP56);
    tp2.IP iP63 = singlyLinkedList0.get(201326784);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i7 + "' != '" + (-1)+ "'", i7.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i16 + "' != '" + 100+ "'", i16.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long18 + "' != '" + 10L+ "'", long18.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long19 + "' != '" + 10L+ "'", long19.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i25 + "' != '" + (-1)+ "'", i25.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i26 + "' != '" + (-1)+ "'", i26.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i38 + "' != '" + (-1)+ "'", i38.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i49 + "' != '" + (-1)+ "'", i49.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b50 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b57 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b58 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b61 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP63);

  }

  @Test
  public void test086() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test086"); }


    int i1 = java.lang.Integer.bitCount(805306368);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 2);

  }

  @Test
  public void test087() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test087"); }


    tp2.Server server0 = new tp2.Server();
    tp2.IP iP5 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    boolean b6 = server0.removeBan(iP5);
    boolean b7 = server0.bansSorted();
    boolean b8 = server0.exceptionsNotRepeated();
    boolean b9 = server0.bansNotRepeatedExpirationOrIP();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);

  }

  @Test
  public void test088() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test088"); }


    tp2.SinglyLinkedList singlyLinkedList0 = new tp2.SinglyLinkedList();
    tp2.IP iP5 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i6 = iP5.getThird();
    boolean b7 = singlyLinkedList0.remove(iP5);
    tp2.IPBan iPBan9 = new tp2.IPBan(iP5, (java.lang.Long)10L);
    tp2.IP iP14 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i15 = iP14.getFourth();
    iPBan9.setIp(iP14);
    java.lang.Long long17 = iPBan9.getExpires();
    java.lang.Long long18 = iPBan9.getExpires();
    tp2.IP iP23 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i24 = iP23.getFirst();
    java.lang.Integer i25 = iP23.getSecond();
    iP23.setFirst((java.lang.Integer)201326592);
    iPBan9.setIp(iP23);
    tp2.SinglyLinkedList singlyLinkedList29 = new tp2.SinglyLinkedList();
    tp2.Server server30 = new tp2.Server();
    boolean b31 = server30.exceptionsNotRepeated();
    tp2.IP iP36 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i37 = iP36.getThird();
    iP36.setSecond((java.lang.Integer)10);
    boolean b40 = server30.removeBan(iP36);
    boolean b41 = singlyLinkedList29.remove(iP36);
    tp2.SinglyLinkedList singlyLinkedList42 = new tp2.SinglyLinkedList();
    tp2.IP iP47 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i48 = iP47.getThird();
    boolean b49 = singlyLinkedList42.remove(iP47);
    tp2.Server server50 = new tp2.Server();
    tp2.IP iP55 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    boolean b56 = server50.removeBan(iP55);
    boolean b57 = singlyLinkedList42.contains(iP55);
    singlyLinkedList29.add(iP55);
    iPBan9.setIp(iP55);
    java.lang.Long long60 = iPBan9.getExpires();
    tp2.SinglyLinkedList singlyLinkedList61 = new tp2.SinglyLinkedList();
    tp2.IP iP62 = null;
    boolean b63 = singlyLinkedList61.remove(iP62);
    boolean b64 = singlyLinkedList61.isEmpty();
    tp2.IP iP69 = new tp2.IP((java.lang.Integer)5, (java.lang.Integer)1, (java.lang.Integer)0, (java.lang.Integer)12);
    boolean b70 = singlyLinkedList61.contains(iP69);
    tp2.SinglyLinkedList singlyLinkedList71 = new tp2.SinglyLinkedList();
    tp2.IP iP72 = null;
    boolean b73 = singlyLinkedList71.remove(iP72);
    boolean b74 = singlyLinkedList71.isEmpty();
    tp2.IP iP79 = new tp2.IP((java.lang.Integer)5, (java.lang.Integer)1, (java.lang.Integer)0, (java.lang.Integer)12);
    boolean b80 = singlyLinkedList71.contains(iP79);
    boolean b81 = singlyLinkedList61.contains(iP79);
    tp2.IP iP86 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i87 = iP86.getSecond();
    boolean b88 = singlyLinkedList61.contains(iP86);
    iPBan9.setIp(iP86);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i6 + "' != '" + (-1)+ "'", i6.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i15 + "' != '" + 100+ "'", i15.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long17 + "' != '" + 10L+ "'", long17.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long18 + "' != '" + 10L+ "'", long18.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i24 + "' != '" + (-1)+ "'", i24.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i25 + "' != '" + (-1)+ "'", i25.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i37 + "' != '" + (-1)+ "'", i37.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i48 + "' != '" + (-1)+ "'", i48.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b49 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b56 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b57 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long60 + "' != '" + 10L+ "'", long60.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b63 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b64 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b70 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b73 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b74 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b80 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b81 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i87 + "' != '" + (-1)+ "'", i87.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b88 == false);

  }

  @Test
  public void test089() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test089"); }


    tp2.Server server0 = new tp2.Server();
    boolean b1 = server0.notSharedElements();
    tp2.SinglyLinkedList singlyLinkedList2 = new tp2.SinglyLinkedList();
    tp2.IP iP7 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i8 = iP7.getThird();
    boolean b9 = singlyLinkedList2.remove(iP7);
    boolean b10 = server0.addException(iP7);
    tp2.SinglyLinkedList singlyLinkedList11 = new tp2.SinglyLinkedList();
    tp2.IP iP16 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i17 = iP16.getFourth();
    singlyLinkedList11.add(iP16);
    java.lang.Integer i19 = iP16.getFirst();
    boolean b20 = server0.removeBan(iP16);
    tp2.ITime iTime21 = null;
    server0.setTime(iTime21);
    boolean b23 = server0.bansSorted();
    boolean b24 = server0.bansNotRepeatedExpirationOrIP();
    boolean b25 = server0.bansSorted();
    tp2.IP iP30 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i31 = iP30.getThird();
    iP30.setFourth((java.lang.Integer)0);
    boolean b34 = server0.addException(iP30);
    tp2.SinglyLinkedList singlyLinkedList35 = new tp2.SinglyLinkedList();
    tp2.IP iP40 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i41 = iP40.getThird();
    boolean b42 = singlyLinkedList35.remove(iP40);
    iP40.setSecond((java.lang.Integer)150994944);
    java.lang.Integer i45 = iP40.getFourth();
    java.lang.Integer i46 = iP40.getThird();
    boolean b47 = server0.removeBan(iP40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i8 + "' != '" + (-1)+ "'", i8.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i17 + "' != '" + 100+ "'", i17.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i19 + "' != '" + (-1)+ "'", i19.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i31 + "' != '" + (-1)+ "'", i31.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i41 + "' != '" + (-1)+ "'", i41.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i45 + "' != '" + 100+ "'", i45.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i46 + "' != '" + (-1)+ "'", i46.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b47 == false);

  }

  @Test
  public void test090() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test090"); }


    int i2 = java.lang.Integer.divideUnsigned(11100, 729888);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);

  }

  @Test
  public void test091() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test091"); }


    tp2.Server server0 = new tp2.Server();
    tp2.ITime iTime1 = null;
    server0.setTime(iTime1);
    boolean b3 = server0.bansNotRepeatedExpirationOrIP();
    tp2.SinglyLinkedList singlyLinkedList4 = new tp2.SinglyLinkedList();
    tp2.IP iP9 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i10 = iP9.getThird();
    boolean b11 = singlyLinkedList4.remove(iP9);
    iP9.setSecond((java.lang.Integer)150994944);
    java.lang.Integer i14 = iP9.getFourth();
    java.lang.Integer i15 = iP9.getThird();
    java.lang.Integer i16 = iP9.getFirst();
    boolean b17 = server0.addException(iP9);
    server0.update();
    boolean b19 = server0.notSharedElements();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i10 + "' != '" + (-1)+ "'", i10.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i14 + "' != '" + 100+ "'", i14.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i15 + "' != '" + (-1)+ "'", i15.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i16 + "' != '" + (-1)+ "'", i16.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);

  }

  @Test
  public void test092() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test092"); }


    tp2.SinglyLinkedList singlyLinkedList0 = new tp2.SinglyLinkedList();
    tp2.IP iP5 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i6 = iP5.getThird();
    boolean b7 = singlyLinkedList0.remove(iP5);
    boolean b8 = singlyLinkedList0.isEmpty();
    int i9 = singlyLinkedList0.getSize();
    tp2.IP iP14 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i15 = iP14.getThird();
    iP14.setFourth((java.lang.Integer)0);
    boolean b18 = singlyLinkedList0.contains(iP14);
    boolean b19 = singlyLinkedList0.isEmpty();
    tp2.SinglyLinkedList singlyLinkedList20 = new tp2.SinglyLinkedList();
    tp2.IP iP25 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i26 = iP25.getThird();
    boolean b27 = singlyLinkedList20.remove(iP25);
    tp2.IPBan iPBan29 = new tp2.IPBan(iP25, (java.lang.Long)10L);
    singlyLinkedList0.add(iP25);
    java.lang.Integer i31 = iP25.getThird();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i6 + "' != '" + (-1)+ "'", i6.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i15 + "' != '" + (-1)+ "'", i15.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i26 + "' != '" + (-1)+ "'", i26.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i31 + "' != '" + (-1)+ "'", i31.equals((-1)));

  }

  @Test
  public void test093() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test093"); }


    int i2 = java.lang.Integer.max(100000, 48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 100000);

  }

  @Test
  public void test094() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test094"); }


    tp2.SinglyLinkedList singlyLinkedList0 = new tp2.SinglyLinkedList();
    tp2.IP iP5 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i6 = iP5.getThird();
    boolean b7 = singlyLinkedList0.remove(iP5);
    tp2.IPBan iPBan9 = new tp2.IPBan(iP5, (java.lang.Long)10L);
    tp2.IP iP14 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i15 = iP14.getFourth();
    iPBan9.setIp(iP14);
    java.lang.Long long17 = iPBan9.getExpires();
    java.lang.Long long18 = iPBan9.getExpires();
    tp2.SinglyLinkedList singlyLinkedList19 = new tp2.SinglyLinkedList();
    tp2.IP iP24 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i25 = iP24.getThird();
    boolean b26 = singlyLinkedList19.remove(iP24);
    tp2.IPBan iPBan28 = new tp2.IPBan(iP24, (java.lang.Long)10L);
    tp2.IP iP33 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i34 = iP33.getFourth();
    iPBan28.setIp(iP33);
    iP33.setSecond((java.lang.Integer)469762048);
    iPBan9.setIp(iP33);
    tp2.Server server39 = new tp2.Server();
    boolean b40 = server39.exceptionsNotRepeated();
    boolean b41 = server39.bansNotRepeatedExpirationOrIP();
    tp2.Server server42 = new tp2.Server();
    tp2.IP iP47 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    boolean b48 = server42.removeBan(iP47);
    java.lang.Integer i49 = iP47.getFirst();
    boolean b50 = server39.addException(iP47);
    tp2.IPBan iPBan52 = new tp2.IPBan(iP47, (java.lang.Long)(-1L));
    iPBan9.setIp(iP47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i6 + "' != '" + (-1)+ "'", i6.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i15 + "' != '" + 100+ "'", i15.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long17 + "' != '" + 10L+ "'", long17.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long18 + "' != '" + 10L+ "'", long18.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i25 + "' != '" + (-1)+ "'", i25.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i34 + "' != '" + 100+ "'", i34.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b48 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i49 + "' != '" + (-1)+ "'", i49.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b50 == true);

  }

  @Test
  public void test095() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test095"); }


    tp2.SinglyLinkedList singlyLinkedList0 = new tp2.SinglyLinkedList();
    tp2.IP iP5 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i6 = iP5.getThird();
    boolean b7 = singlyLinkedList0.remove(iP5);
    tp2.Server server8 = new tp2.Server();
    tp2.IP iP13 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    boolean b14 = server8.removeBan(iP13);
    boolean b15 = singlyLinkedList0.contains(iP13);
    tp2.Server server16 = new tp2.Server();
    tp2.IP iP21 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    boolean b22 = server16.removeBan(iP21);
    tp2.IP iP27 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i28 = iP27.getThird();
    iP27.setFourth((java.lang.Integer)0);
    iP27.setSecond((java.lang.Integer)3);
    iP27.setFourth((java.lang.Integer)12);
    boolean b35 = server16.addBan(iP27);
    server16.update();
    boolean b37 = server16.bansOkTime();
    boolean b38 = server16.notSharedElements();
    tp2.SinglyLinkedList singlyLinkedList39 = new tp2.SinglyLinkedList();
    tp2.IP iP40 = null;
    boolean b41 = singlyLinkedList39.remove(iP40);
    boolean b42 = singlyLinkedList39.isEmpty();
    tp2.IP iP47 = new tp2.IP((java.lang.Integer)5, (java.lang.Integer)1, (java.lang.Integer)0, (java.lang.Integer)12);
    boolean b48 = singlyLinkedList39.contains(iP47);
    tp2.SinglyLinkedList singlyLinkedList49 = new tp2.SinglyLinkedList();
    tp2.IP iP54 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i55 = iP54.getThird();
    boolean b56 = singlyLinkedList49.remove(iP54);
    iP54.setSecond((java.lang.Integer)150994944);
    java.lang.Integer i59 = iP54.getFourth();
    java.lang.Integer i60 = iP54.getThird();
    java.lang.Integer i61 = iP54.getFirst();
    boolean b62 = singlyLinkedList39.contains(iP54);
    tp2.SinglyLinkedList singlyLinkedList63 = new tp2.SinglyLinkedList();
    tp2.IP iP68 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i69 = iP68.getThird();
    boolean b70 = singlyLinkedList63.remove(iP68);
    java.lang.Integer i71 = iP68.getThird();
    java.lang.Integer i72 = iP68.getSecond();
    boolean b73 = singlyLinkedList39.contains(iP68);
    boolean b74 = server16.addBan(iP68);
    singlyLinkedList0.add(iP68);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i6 + "' != '" + (-1)+ "'", i6.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i28 + "' != '" + (-1)+ "'", i28.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b48 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i55 + "' != '" + (-1)+ "'", i55.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b56 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i59 + "' != '" + 100+ "'", i59.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i60 + "' != '" + (-1)+ "'", i60.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i61 + "' != '" + (-1)+ "'", i61.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b62 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i69 + "' != '" + (-1)+ "'", i69.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b70 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i71 + "' != '" + (-1)+ "'", i71.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i72 + "' != '" + (-1)+ "'", i72.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b73 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b74 == true);

  }

  @Test
  public void test096() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test096"); }


    java.lang.String str2 = java.lang.Integer.toUnsignedString(536870912, 40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "536870912"+ "'", str2.equals("536870912"));

  }

  @Test
  public void test097() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test097"); }


    tp2.SinglyLinkedList singlyLinkedList0 = new tp2.SinglyLinkedList();
    tp2.IP iP5 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i6 = iP5.getThird();
    boolean b7 = singlyLinkedList0.remove(iP5);
    boolean b8 = singlyLinkedList0.isEmpty();
    int i9 = singlyLinkedList0.getSize();
    tp2.IP iP14 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i15 = iP14.getThird();
    iP14.setFourth((java.lang.Integer)0);
    boolean b18 = singlyLinkedList0.contains(iP14);
    boolean b19 = singlyLinkedList0.isEmpty();
    tp2.IP iP24 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i25 = iP24.getFirst();
    java.lang.Integer i26 = iP24.getFirst();
    singlyLinkedList0.add(iP24);
    tp2.SinglyLinkedList singlyLinkedList28 = new tp2.SinglyLinkedList();
    tp2.IP iP33 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i34 = iP33.getThird();
    boolean b35 = singlyLinkedList28.remove(iP33);
    tp2.Server server36 = new tp2.Server();
    tp2.IP iP41 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    boolean b42 = server36.removeBan(iP41);
    boolean b43 = singlyLinkedList28.contains(iP41);
    singlyLinkedList0.add(iP41);
    tp2.SinglyLinkedList singlyLinkedList45 = new tp2.SinglyLinkedList();
    tp2.IP iP50 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i51 = iP50.getThird();
    boolean b52 = singlyLinkedList45.remove(iP50);
    tp2.Server server53 = new tp2.Server();
    tp2.IP iP58 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    boolean b59 = server53.removeBan(iP58);
    boolean b60 = singlyLinkedList45.contains(iP58);
    singlyLinkedList0.add(iP58);
    tp2.IP iP66 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i67 = iP66.getFirst();
    singlyLinkedList0.add(iP66);
    tp2.IP iP70 = singlyLinkedList0.get(8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i6 + "' != '" + (-1)+ "'", i6.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i15 + "' != '" + (-1)+ "'", i15.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i25 + "' != '" + (-1)+ "'", i25.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i26 + "' != '" + (-1)+ "'", i26.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i34 + "' != '" + (-1)+ "'", i34.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b43 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i51 + "' != '" + (-1)+ "'", i51.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b52 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b59 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b60 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i67 + "' != '" + (-1)+ "'", i67.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP70);

  }

  @Test
  public void test098() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test098"); }


    tp2.Server server0 = new tp2.Server();
    boolean b1 = server0.notSharedElements();
    tp2.SinglyLinkedList singlyLinkedList2 = new tp2.SinglyLinkedList();
    tp2.IP iP7 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i8 = iP7.getThird();
    boolean b9 = singlyLinkedList2.remove(iP7);
    boolean b10 = server0.addException(iP7);
    tp2.SinglyLinkedList singlyLinkedList11 = new tp2.SinglyLinkedList();
    tp2.IP iP16 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i17 = iP16.getFourth();
    singlyLinkedList11.add(iP16);
    java.lang.Integer i19 = iP16.getFirst();
    boolean b20 = server0.removeBan(iP16);
    tp2.ITime iTime21 = null;
    server0.setTime(iTime21);
    boolean b23 = server0.bansSorted();
    tp2.IP iP28 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i29 = iP28.getFourth();
    iP28.setFirst((java.lang.Integer)16);
    boolean b32 = server0.addBan(iP28);
    server0.update();
    boolean b34 = server0.exceptionsNotRepeated();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i8 + "' != '" + (-1)+ "'", i8.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i17 + "' != '" + 100+ "'", i17.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i19 + "' != '" + (-1)+ "'", i19.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i29 + "' != '" + 100+ "'", i29.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == true);

  }

  @Test
  public void test099() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test099"); }


    java.lang.Integer i1 = new java.lang.Integer("469762048");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 469762048+ "'", i1.equals(469762048));

  }

  @Test
  public void test100() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test100"); }


    java.lang.Integer i2 = java.lang.Integer.getInteger("1010000000000000000000000000", 58000000);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i2 + "' != '" + 58000000+ "'", i2.equals(58000000));

  }

  @Test
  public void test101() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test101"); }


    int i2 = java.lang.Integer.min(201326784, 784);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 784);

  }

  @Test
  public void test102() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test102"); }


    java.lang.Integer i2 = java.lang.Integer.getInteger("11111111111111111111111111111111", 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i2 + "' != '" + 0+ "'", i2.equals(0));

  }

  @Test
  public void test103() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test103"); }


    java.lang.Integer i1 = new java.lang.Integer(40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 40+ "'", i1.equals(40));

  }

  @Test
  public void test104() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test104"); }


    int i1 = java.lang.Integer.signum(44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 1);

  }

  @Test
  public void test105() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test105"); }


    java.lang.Integer i2 = java.lang.Integer.getInteger("28", (java.lang.Integer)48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i2 + "' != '" + 48+ "'", i2.equals(48));

  }

  @Test
  public void test106() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test106"); }


    // The following exception was thrown during execution in test generation
    try {
      int i1 = java.lang.Integer.parseUnsignedInt("");
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

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test107"); }


    int i1 = java.lang.Integer.numberOfLeadingZeros(134217728);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 4);

  }

  @Test
  public void test108() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test108"); }


    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList0 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP5 = new tp2.IP((java.lang.Integer)150994944, (java.lang.Integer)11100, (java.lang.Integer)784, (java.lang.Integer)0);
    boolean b6 = strictlySortedSinglyLinkedList0.removeFromIP(iP5);
    int i7 = strictlySortedSinglyLinkedList0.getSize();
    tp2.Server server8 = new tp2.Server();
    boolean b9 = server8.notSharedElements();
    tp2.SinglyLinkedList singlyLinkedList10 = new tp2.SinglyLinkedList();
    tp2.IP iP15 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i16 = iP15.getThird();
    boolean b17 = singlyLinkedList10.remove(iP15);
    boolean b18 = server8.addException(iP15);
    java.lang.Integer i19 = iP15.getFourth();
    boolean b20 = strictlySortedSinglyLinkedList0.containsIP(iP15);
    boolean b21 = strictlySortedSinglyLinkedList0.isEmpty();
    tp2.SinglyLinkedList singlyLinkedList22 = new tp2.SinglyLinkedList();
    tp2.IP iP27 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i28 = iP27.getThird();
    boolean b29 = singlyLinkedList22.remove(iP27);
    boolean b30 = singlyLinkedList22.isEmpty();
    int i31 = singlyLinkedList22.getSize();
    tp2.IP iP36 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i37 = iP36.getThird();
    iP36.setFourth((java.lang.Integer)0);
    boolean b40 = singlyLinkedList22.contains(iP36);
    boolean b41 = singlyLinkedList22.isEmpty();
    tp2.SinglyLinkedList singlyLinkedList42 = new tp2.SinglyLinkedList();
    tp2.IP iP47 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i48 = iP47.getThird();
    boolean b49 = singlyLinkedList42.remove(iP47);
    tp2.IPBan iPBan51 = new tp2.IPBan(iP47, (java.lang.Long)10L);
    singlyLinkedList22.add(iP47);
    boolean b53 = strictlySortedSinglyLinkedList0.removeFromIP(iP47);
    boolean b54 = strictlySortedSinglyLinkedList0.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i16 + "' != '" + (-1)+ "'", i16.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i19 + "' != '" + 100+ "'", i19.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i28 + "' != '" + (-1)+ "'", i28.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i31 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i37 + "' != '" + (-1)+ "'", i37.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i48 + "' != '" + (-1)+ "'", i48.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b49 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b53 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b54 == true);

  }

  @Test
  public void test109() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test109"); }


    tp2.SinglyLinkedList singlyLinkedList0 = new tp2.SinglyLinkedList();
    tp2.IP iP5 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i6 = iP5.getThird();
    boolean b7 = singlyLinkedList0.remove(iP5);
    tp2.IPBan iPBan9 = new tp2.IPBan(iP5, (java.lang.Long)10L);
    tp2.IP iP14 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i15 = iP14.getFourth();
    iPBan9.setIp(iP14);
    java.lang.Long long17 = iPBan9.getExpires();
    java.lang.Long long18 = iPBan9.getExpires();
    tp2.Server server19 = new tp2.Server();
    boolean b20 = server19.exceptionsNotRepeated();
    tp2.IP iP25 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i26 = iP25.getThird();
    iP25.setSecond((java.lang.Integer)10);
    boolean b29 = server19.removeBan(iP25);
    java.lang.Integer i30 = iP25.getFirst();
    iPBan9.setIp(iP25);
    iP25.setSecond((java.lang.Integer)150994944);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i6 + "' != '" + (-1)+ "'", i6.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i15 + "' != '" + 100+ "'", i15.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long17 + "' != '" + 10L+ "'", long17.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long18 + "' != '" + 10L+ "'", long18.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i26 + "' != '" + (-1)+ "'", i26.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i30 + "' != '" + (-1)+ "'", i30.equals((-1)));

  }

  @Test
  public void test110() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test110"); }


    tp2.Server server0 = new tp2.Server();
    boolean b1 = server0.exceptionsNotRepeated();
    boolean b2 = server0.bansSorted();
    boolean b3 = server0.notSharedElements();
    tp2.SinglyLinkedList singlyLinkedList4 = new tp2.SinglyLinkedList();
    tp2.IP iP9 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i10 = iP9.getFourth();
    singlyLinkedList4.add(iP9);
    boolean b12 = server0.addException(iP9);
    java.lang.Integer i13 = iP9.getSecond();
    java.lang.Integer i14 = iP9.getSecond();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i10 + "' != '" + 100+ "'", i10.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i13 + "' != '" + (-1)+ "'", i13.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i14 + "' != '" + (-1)+ "'", i14.equals((-1)));

  }

  @Test
  public void test111() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test111"); }


    tp2.Server server0 = new tp2.Server();
    boolean b1 = server0.notSharedElements();
    tp2.SinglyLinkedList singlyLinkedList2 = new tp2.SinglyLinkedList();
    tp2.IP iP7 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i8 = iP7.getThird();
    boolean b9 = singlyLinkedList2.remove(iP7);
    boolean b10 = server0.addException(iP7);
    tp2.SinglyLinkedList singlyLinkedList11 = new tp2.SinglyLinkedList();
    tp2.IP iP16 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i17 = iP16.getFourth();
    singlyLinkedList11.add(iP16);
    java.lang.Integer i19 = iP16.getFirst();
    boolean b20 = server0.removeBan(iP16);
    tp2.ITime iTime21 = null;
    server0.setTime(iTime21);
    boolean b23 = server0.bansSorted();
    boolean b24 = server0.bansNotRepeatedExpirationOrIP();
    tp2.SinglyLinkedList singlyLinkedList25 = new tp2.SinglyLinkedList();
    tp2.IP iP30 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i31 = iP30.getThird();
    boolean b32 = singlyLinkedList25.remove(iP30);
    tp2.IPBan iPBan34 = new tp2.IPBan(iP30, (java.lang.Long)10L);
    java.lang.Long long35 = iPBan34.getExpires();
    java.lang.Long long36 = iPBan34.getExpires();
    tp2.SinglyLinkedList singlyLinkedList37 = new tp2.SinglyLinkedList();
    tp2.IP iP42 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i43 = iP42.getThird();
    boolean b44 = singlyLinkedList37.remove(iP42);
    tp2.IPBan iPBan46 = new tp2.IPBan(iP42, (java.lang.Long)10L);
    tp2.IP iP51 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i52 = iP51.getFourth();
    iPBan46.setIp(iP51);
    iPBan34.setIp(iP51);
    boolean b55 = server0.addException(iP51);
    tp2.IP iP60 = new tp2.IP((java.lang.Integer)150994944, (java.lang.Integer)784, (java.lang.Integer)784, (java.lang.Integer)2);
    java.lang.Integer i61 = iP60.getFourth();
    boolean b62 = server0.addException(iP60);
    boolean b63 = server0.notSharedElements();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i8 + "' != '" + (-1)+ "'", i8.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i17 + "' != '" + 100+ "'", i17.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i19 + "' != '" + (-1)+ "'", i19.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i31 + "' != '" + (-1)+ "'", i31.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long35 + "' != '" + 10L+ "'", long35.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long36 + "' != '" + 10L+ "'", long36.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i43 + "' != '" + (-1)+ "'", i43.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i52 + "' != '" + 100+ "'", i52.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b55 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i61 + "' != '" + 2+ "'", i61.equals(2));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b62 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b63 == true);

  }

  @Test
  public void test112() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test112"); }


    int i1 = java.lang.Integer.signum(16384);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 1);

  }

  @Test
  public void test113() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test113"); }


    // The following exception was thrown during execution in test generation
    try {
      int i2 = java.lang.Integer.parseUnsignedInt("0", 201326597);
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test114() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test114"); }


    java.lang.String str1 = java.lang.Integer.toUnsignedString(8192);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "8192"+ "'", str1.equals("8192"));

  }

  @Test
  public void test115() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test115"); }


    int i2 = java.lang.Integer.rotateRight(0, 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);

  }

  @Test
  public void test116() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test116"); }


    tp2.Server server0 = new tp2.Server();
    boolean b1 = server0.exceptionsNotRepeated();
    boolean b2 = server0.bansSorted();
    boolean b3 = server0.notSharedElements();
    tp2.SinglyLinkedList singlyLinkedList4 = new tp2.SinglyLinkedList();
    tp2.IP iP9 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i10 = iP9.getFourth();
    singlyLinkedList4.add(iP9);
    boolean b12 = server0.addException(iP9);
    java.lang.Integer i13 = iP9.getSecond();
    iP9.setThird((java.lang.Integer)218103808);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i10 + "' != '" + 100+ "'", i10.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i13 + "' != '" + (-1)+ "'", i13.equals((-1)));

  }

  @Test
  public void test117() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test117"); }


    java.lang.Integer i1 = new java.lang.Integer("11001");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 11001+ "'", i1.equals(11001));

  }

  @Test
  public void test118() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test118"); }


    tp2.SinglyLinkedList singlyLinkedList0 = new tp2.SinglyLinkedList();
    tp2.IP iP5 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i6 = iP5.getThird();
    boolean b7 = singlyLinkedList0.remove(iP5);
    boolean b8 = singlyLinkedList0.isEmpty();
    int i9 = singlyLinkedList0.getSize();
    tp2.IP iP14 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i15 = iP14.getThird();
    iP14.setFourth((java.lang.Integer)0);
    boolean b18 = singlyLinkedList0.contains(iP14);
    boolean b19 = singlyLinkedList0.isEmpty();
    tp2.IP iP24 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i25 = iP24.getFirst();
    java.lang.Integer i26 = iP24.getFirst();
    singlyLinkedList0.add(iP24);
    tp2.SinglyLinkedList singlyLinkedList28 = new tp2.SinglyLinkedList();
    tp2.IP iP33 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i34 = iP33.getThird();
    boolean b35 = singlyLinkedList28.remove(iP33);
    tp2.Server server36 = new tp2.Server();
    tp2.IP iP41 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    boolean b42 = server36.removeBan(iP41);
    boolean b43 = singlyLinkedList28.contains(iP41);
    singlyLinkedList0.add(iP41);
    tp2.SinglyLinkedList singlyLinkedList45 = new tp2.SinglyLinkedList();
    tp2.IP iP50 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i51 = iP50.getThird();
    boolean b52 = singlyLinkedList45.remove(iP50);
    tp2.Server server53 = new tp2.Server();
    tp2.IP iP58 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    boolean b59 = server53.removeBan(iP58);
    boolean b60 = singlyLinkedList45.contains(iP58);
    singlyLinkedList0.add(iP58);
    java.lang.Integer i62 = iP58.getFirst();
    boolean b64 = iP58.equals((java.lang.Object)"100000000000000000000000000");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i6 + "' != '" + (-1)+ "'", i6.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i15 + "' != '" + (-1)+ "'", i15.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i25 + "' != '" + (-1)+ "'", i25.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i26 + "' != '" + (-1)+ "'", i26.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i34 + "' != '" + (-1)+ "'", i34.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b43 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i51 + "' != '" + (-1)+ "'", i51.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b52 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b59 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b60 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i62 + "' != '" + (-1)+ "'", i62.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b64 == false);

  }

  @Test
  public void test119() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test119"); }


    int i2 = java.lang.Integer.min(5120, 4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 4);

  }

  @Test
  public void test120() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test120"); }


    java.lang.Integer i1 = java.lang.Integer.valueOf(44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 44+ "'", i1.equals(44));

  }

  @Test
  public void test121() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test121"); }


    tp2.Server server0 = new tp2.Server();
    boolean b1 = server0.exceptionsNotRepeated();
    boolean b2 = server0.bansSorted();
    boolean b3 = server0.notSharedElements();
    boolean b4 = server0.bansSorted();
    boolean b5 = server0.bansNotRepeatedExpirationOrIP();
    tp2.SinglyLinkedList singlyLinkedList6 = new tp2.SinglyLinkedList();
    tp2.IP iP11 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i12 = iP11.getThird();
    boolean b13 = singlyLinkedList6.remove(iP11);
    boolean b14 = singlyLinkedList6.isEmpty();
    int i15 = singlyLinkedList6.getSize();
    tp2.IP iP20 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i21 = iP20.getThird();
    iP20.setFourth((java.lang.Integer)0);
    boolean b24 = singlyLinkedList6.contains(iP20);
    boolean b25 = singlyLinkedList6.isEmpty();
    tp2.IP iP30 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i31 = iP30.getFirst();
    java.lang.Integer i32 = iP30.getFirst();
    singlyLinkedList6.add(iP30);
    tp2.SinglyLinkedList singlyLinkedList34 = new tp2.SinglyLinkedList();
    tp2.IP iP39 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i40 = iP39.getThird();
    boolean b41 = singlyLinkedList34.remove(iP39);
    tp2.Server server42 = new tp2.Server();
    tp2.IP iP47 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    boolean b48 = server42.removeBan(iP47);
    boolean b49 = singlyLinkedList34.contains(iP47);
    singlyLinkedList6.add(iP47);
    tp2.SinglyLinkedList singlyLinkedList51 = new tp2.SinglyLinkedList();
    tp2.IP iP56 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i57 = iP56.getThird();
    boolean b58 = singlyLinkedList51.remove(iP56);
    tp2.Server server59 = new tp2.Server();
    tp2.IP iP64 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    boolean b65 = server59.removeBan(iP64);
    boolean b66 = singlyLinkedList51.contains(iP64);
    singlyLinkedList6.add(iP64);
    boolean b68 = server0.removeBan(iP64);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i12 + "' != '" + (-1)+ "'", i12.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i21 + "' != '" + (-1)+ "'", i21.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i31 + "' != '" + (-1)+ "'", i31.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i32 + "' != '" + (-1)+ "'", i32.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i40 + "' != '" + (-1)+ "'", i40.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b48 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b49 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i57 + "' != '" + (-1)+ "'", i57.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b58 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b65 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b66 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b68 == false);

  }

  @Test
  public void test122() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test122"); }


    int i2 = java.lang.Integer.compareUnsigned(1546321920, 150994944);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);

  }

  @Test
  public void test123() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test123"); }


    tp2.Server server0 = new tp2.Server();
    tp2.IP iP5 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    boolean b6 = server0.removeBan(iP5);
    boolean b7 = server0.bansNotRepeatedExpirationOrIP();
    boolean b8 = server0.bansSorted();
    boolean b9 = server0.bansOkTime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);

  }

  @Test
  public void test124() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test124"); }


    int i2 = java.lang.Integer.rotateLeft(16384, 26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 256);

  }

  @Test
  public void test125() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test125"); }


    tp2.SinglyLinkedList singlyLinkedList0 = new tp2.SinglyLinkedList();
    tp2.Server server1 = new tp2.Server();
    boolean b2 = server1.exceptionsNotRepeated();
    tp2.IP iP7 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i8 = iP7.getThird();
    iP7.setSecond((java.lang.Integer)10);
    boolean b11 = server1.removeBan(iP7);
    boolean b12 = singlyLinkedList0.remove(iP7);
    int i13 = singlyLinkedList0.getSize();
    int i14 = singlyLinkedList0.getSize();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i8 + "' != '" + (-1)+ "'", i8.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);

  }

  @Test
  public void test126() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test126"); }


    int i2 = java.lang.Integer.sum(1073741844, 33554432);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1107296276);

  }

  @Test
  public void test127() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test127"); }


    java.lang.Integer i1 = java.lang.Integer.decode("469762048");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 469762048+ "'", i1.equals(469762048));

  }

  @Test
  public void test128() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test128"); }


    int i1 = java.lang.Integer.bitCount(16384);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 1);

  }

  @Test
  public void test129() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test129"); }


    tp2.Server server0 = new tp2.Server();
    tp2.IP iP5 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    boolean b6 = server0.removeBan(iP5);
    tp2.ITime iTime7 = null;
    server0.setTime(iTime7);
    tp2.IP iP9 = null;
    boolean b10 = server0.connect(iP9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);

  }

  @Test
  public void test130() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test130"); }


    int i2 = java.lang.Integer.rotateRight(1476395008, 58000000);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1476395008);

  }

  @Test
  public void test131() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test131"); }


    tp2.Server server0 = new tp2.Server();
    tp2.IP iP5 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    boolean b6 = server0.removeBan(iP5);
    tp2.ITime iTime7 = null;
    server0.setTime(iTime7);
    server0.update();
    tp2.Server server10 = new tp2.Server();
    boolean b11 = server10.notSharedElements();
    tp2.SinglyLinkedList singlyLinkedList12 = new tp2.SinglyLinkedList();
    tp2.IP iP17 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i18 = iP17.getThird();
    boolean b19 = singlyLinkedList12.remove(iP17);
    boolean b20 = server10.addException(iP17);
    java.lang.Integer i21 = iP17.getFourth();
    boolean b22 = server0.removeException(iP17);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList23 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP28 = new tp2.IP((java.lang.Integer)150994944, (java.lang.Integer)784, (java.lang.Integer)784, (java.lang.Integer)2);
    java.lang.Integer i29 = iP28.getFourth();
    boolean b30 = strictlySortedSinglyLinkedList23.removeFromIP(iP28);
    tp2.SinglyLinkedList singlyLinkedList31 = new tp2.SinglyLinkedList();
    tp2.IP iP36 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i37 = iP36.getThird();
    boolean b38 = singlyLinkedList31.remove(iP36);
    java.lang.Integer i39 = iP36.getThird();
    boolean b40 = strictlySortedSinglyLinkedList23.removeFromIP(iP36);
    tp2.Server server41 = new tp2.Server();
    boolean b42 = server41.exceptionsNotRepeated();
    boolean b43 = server41.bansSorted();
    boolean b44 = server41.notSharedElements();
    tp2.Server server45 = new tp2.Server();
    boolean b46 = server45.notSharedElements();
    tp2.SinglyLinkedList singlyLinkedList47 = new tp2.SinglyLinkedList();
    tp2.IP iP52 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i53 = iP52.getThird();
    boolean b54 = singlyLinkedList47.remove(iP52);
    boolean b55 = server45.addException(iP52);
    tp2.SinglyLinkedList singlyLinkedList56 = new tp2.SinglyLinkedList();
    tp2.IP iP61 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i62 = iP61.getFourth();
    singlyLinkedList56.add(iP61);
    java.lang.Integer i64 = iP61.getFirst();
    boolean b65 = server45.removeBan(iP61);
    tp2.ITime iTime66 = null;
    server45.setTime(iTime66);
    boolean b68 = server45.notSharedElements();
    tp2.IP iP73 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i74 = iP73.getThird();
    iP73.setFourth((java.lang.Integer)0);
    iP73.setSecond((java.lang.Integer)3);
    boolean b79 = server45.addBan(iP73);
    tp2.SinglyLinkedList singlyLinkedList80 = new tp2.SinglyLinkedList();
    tp2.IP iP85 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i86 = iP85.getThird();
    boolean b87 = singlyLinkedList80.remove(iP85);
    java.lang.Integer i88 = iP85.getThird();
    iP85.setFirst((java.lang.Integer)11100);
    boolean b91 = server45.addBan(iP85);
    boolean b92 = server41.removeException(iP85);
    boolean b93 = strictlySortedSinglyLinkedList23.removeFromIP(iP85);
    boolean b94 = server0.addBan(iP85);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i18 + "' != '" + (-1)+ "'", i18.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i21 + "' != '" + 100+ "'", i21.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i29 + "' != '" + 2+ "'", i29.equals(2));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i37 + "' != '" + (-1)+ "'", i37.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i39 + "' != '" + (-1)+ "'", i39.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b43 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b46 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i53 + "' != '" + (-1)+ "'", i53.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b54 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b55 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i62 + "' != '" + 100+ "'", i62.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i64 + "' != '" + (-1)+ "'", i64.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b65 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b68 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i74 + "' != '" + (-1)+ "'", i74.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b79 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i86 + "' != '" + (-1)+ "'", i86.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b87 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i88 + "' != '" + (-1)+ "'", i88.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b91 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b92 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b93 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b94 == true);

  }

  @Test
  public void test132() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test132"); }


    tp2.IP iP4 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i5 = iP4.getFirst();
    java.lang.Integer i6 = iP4.getSecond();
    iP4.setThird((java.lang.Integer)28);
    tp2.IPBan iPBan10 = new tp2.IPBan(iP4, (java.lang.Long)5L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i5 + "' != '" + (-1)+ "'", i5.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i6 + "' != '" + (-1)+ "'", i6.equals((-1)));

  }

  @Test
  public void test133() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test133"); }


    tp2.Server server0 = new tp2.Server();
    boolean b1 = server0.exceptionsNotRepeated();
    tp2.IP iP6 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i7 = iP6.getThird();
    iP6.setSecond((java.lang.Integer)10);
    boolean b10 = server0.removeBan(iP6);
    tp2.SinglyLinkedList singlyLinkedList11 = new tp2.SinglyLinkedList();
    tp2.IP iP16 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i17 = iP16.getThird();
    boolean b18 = singlyLinkedList11.remove(iP16);
    java.lang.Integer i19 = iP16.getThird();
    java.lang.Integer i20 = iP16.getThird();
    boolean b21 = server0.removeBan(iP16);
    boolean b22 = server0.exceptionsNotRepeated();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i7 + "' != '" + (-1)+ "'", i7.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i17 + "' != '" + (-1)+ "'", i17.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i19 + "' != '" + (-1)+ "'", i19.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i20 + "' != '" + (-1)+ "'", i20.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);

  }

  @Test
  public void test134() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test134"); }


    int i1 = java.lang.Integer.signum(15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 1);

  }

  @Test
  public void test135() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test135"); }


    tp2.SinglyLinkedList singlyLinkedList0 = new tp2.SinglyLinkedList();
    tp2.IP iP5 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i6 = iP5.getThird();
    boolean b7 = singlyLinkedList0.remove(iP5);
    boolean b8 = singlyLinkedList0.isEmpty();
    int i9 = singlyLinkedList0.getSize();
    tp2.IP iP14 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i15 = iP14.getThird();
    iP14.setFourth((java.lang.Integer)0);
    boolean b18 = singlyLinkedList0.contains(iP14);
    boolean b19 = singlyLinkedList0.isEmpty();
    tp2.SinglyLinkedList singlyLinkedList20 = new tp2.SinglyLinkedList();
    tp2.IP iP25 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i26 = iP25.getThird();
    boolean b27 = singlyLinkedList20.remove(iP25);
    tp2.IPBan iPBan29 = new tp2.IPBan(iP25, (java.lang.Long)10L);
    singlyLinkedList0.add(iP25);
    iP25.setSecond((java.lang.Integer)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i6 + "' != '" + (-1)+ "'", i6.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i15 + "' != '" + (-1)+ "'", i15.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i26 + "' != '" + (-1)+ "'", i26.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);

  }

  @Test
  public void test136() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test136"); }


    java.lang.Integer i2 = java.lang.Integer.getInteger("", (java.lang.Integer)201326597);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i2 + "' != '" + 201326597+ "'", i2.equals(201326597));

  }

  @Test
  public void test137() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test137"); }


    int i2 = java.lang.Integer.compareUnsigned(20, 218103808);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == (-1));

  }

  @Test
  public void test138() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test138"); }


    int i2 = java.lang.Integer.max(1610612786, 11884);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1610612786);

  }

  @Test
  public void test139() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test139"); }


    // The following exception was thrown during execution in test generation
    try {
      int i2 = java.lang.Integer.parseInt("33", 56);
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

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test140"); }


    int i1 = java.lang.Integer.parseUnsignedInt("10");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 10);

  }

  @Test
  public void test141() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test141"); }


    tp2.SinglyLinkedList singlyLinkedList0 = new tp2.SinglyLinkedList();
    tp2.IP iP5 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i6 = iP5.getThird();
    boolean b7 = singlyLinkedList0.remove(iP5);
    tp2.IP iP9 = singlyLinkedList0.get(16384);
    tp2.Server server10 = new tp2.Server();
    tp2.IP iP15 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    boolean b16 = server10.removeBan(iP15);
    boolean b17 = server10.bansSorted();
    tp2.Server server18 = new tp2.Server();
    boolean b19 = server18.exceptionsNotRepeated();
    tp2.IP iP24 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i25 = iP24.getThird();
    iP24.setSecond((java.lang.Integer)10);
    boolean b28 = server18.removeBan(iP24);
    java.lang.Integer i29 = iP24.getSecond();
    boolean b30 = server10.addException(iP24);
    tp2.Server server31 = new tp2.Server();
    boolean b32 = server31.exceptionsNotRepeated();
    boolean b33 = server31.bansSorted();
    boolean b34 = server31.notSharedElements();
    tp2.SinglyLinkedList singlyLinkedList35 = new tp2.SinglyLinkedList();
    tp2.IP iP40 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i41 = iP40.getFourth();
    singlyLinkedList35.add(iP40);
    boolean b43 = server31.addException(iP40);
    boolean b44 = server10.addBan(iP40);
    boolean b45 = singlyLinkedList0.contains(iP40);
    iP40.setThird((java.lang.Integer)51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i6 + "' != '" + (-1)+ "'", i6.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i25 + "' != '" + (-1)+ "'", i25.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i29 + "' != '" + 10+ "'", i29.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i41 + "' != '" + 100+ "'", i41.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b43 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == false);

  }

  @Test
  public void test142() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test142"); }


    int i1 = java.lang.Integer.reverse(100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 637534208);

  }

  @Test
  public void test143() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test143"); }


    tp2.Server server0 = new tp2.Server();
    boolean b1 = server0.notSharedElements();
    tp2.SinglyLinkedList singlyLinkedList2 = new tp2.SinglyLinkedList();
    tp2.IP iP7 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i8 = iP7.getThird();
    boolean b9 = singlyLinkedList2.remove(iP7);
    boolean b10 = server0.addException(iP7);
    iP7.setSecond((java.lang.Integer)150994944);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i8 + "' != '" + (-1)+ "'", i8.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);

  }

  @Test
  public void test144() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test144"); }


    // The following exception was thrown during execution in test generation
    try {
      java.lang.Integer i2 = java.lang.Integer.valueOf("4", 16384);
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

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test145"); }


    int i2 = java.lang.Integer.sum(26, 436207616);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 436207642);

  }

  @Test
  public void test146() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test146"); }


    java.lang.Integer i1 = new java.lang.Integer("33");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 33+ "'", i1.equals(33));

  }

  @Test
  public void test147() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test147"); }


    java.lang.String str1 = java.lang.Integer.toUnsignedString(51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "51"+ "'", str1.equals("51"));

  }

  @Test
  public void test148() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test148"); }


    int i2 = java.lang.Integer.max(201326597, 727449600);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 727449600);

  }

  @Test
  public void test149() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test149"); }


    tp2.Server server0 = new tp2.Server();
    tp2.IP iP5 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    boolean b6 = server0.removeBan(iP5);
    tp2.Server server7 = new tp2.Server();
    tp2.IP iP12 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    boolean b13 = server7.removeBan(iP12);
    tp2.ITime iTime14 = null;
    server7.setTime(iTime14);
    server7.update();
    tp2.Server server17 = new tp2.Server();
    boolean b18 = server17.notSharedElements();
    tp2.SinglyLinkedList singlyLinkedList19 = new tp2.SinglyLinkedList();
    tp2.IP iP24 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i25 = iP24.getThird();
    boolean b26 = singlyLinkedList19.remove(iP24);
    boolean b27 = server17.addException(iP24);
    java.lang.Integer i28 = iP24.getFourth();
    boolean b29 = server7.removeException(iP24);
    boolean b30 = server0.removeBan(iP24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i25 + "' != '" + (-1)+ "'", i25.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i28 + "' != '" + 100+ "'", i28.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);

  }

  @Test
  public void test150() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test150"); }


    java.lang.Integer i1 = java.lang.Integer.valueOf("201326597");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 201326597+ "'", i1.equals(201326597));

  }

  @Test
  public void test151() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test151"); }


    int i2 = java.lang.Integer.rotateLeft(56, 671088640);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 56);

  }

  @Test
  public void test152() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test152"); }


    java.lang.String str1 = java.lang.Integer.toOctalString(18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "22"+ "'", str1.equals("22"));

  }

  @Test
  public void test153() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test153"); }


    int i2 = java.lang.Integer.compare(3, 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);

  }

  @Test
  public void test154() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test154"); }


    int i1 = java.lang.Integer.reverse(51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == (-872415232));

  }

  @Test
  public void test155() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test155"); }


    java.lang.String str2 = java.lang.Integer.toUnsignedString((-1073741824), 40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "3221225472"+ "'", str2.equals("3221225472"));

  }

  @Test
  public void test156() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test156"); }


    tp2.SinglyLinkedList singlyLinkedList0 = new tp2.SinglyLinkedList();
    tp2.IP iP5 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i6 = iP5.getThird();
    boolean b7 = singlyLinkedList0.remove(iP5);
    tp2.IPBan iPBan9 = new tp2.IPBan(iP5, (java.lang.Long)10L);
    java.lang.Long long10 = iPBan9.getExpires();
    java.lang.Long long11 = iPBan9.getExpires();
    tp2.SinglyLinkedList singlyLinkedList12 = new tp2.SinglyLinkedList();
    tp2.IP iP17 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i18 = iP17.getThird();
    boolean b19 = singlyLinkedList12.remove(iP17);
    tp2.IPBan iPBan21 = new tp2.IPBan(iP17, (java.lang.Long)10L);
    tp2.IP iP26 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i27 = iP26.getFourth();
    iPBan21.setIp(iP26);
    iPBan9.setIp(iP26);
    iPBan9.setExpires((java.lang.Long)5L);
    tp2.Server server32 = new tp2.Server();
    boolean b33 = server32.notSharedElements();
    tp2.SinglyLinkedList singlyLinkedList34 = new tp2.SinglyLinkedList();
    tp2.IP iP39 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i40 = iP39.getThird();
    boolean b41 = singlyLinkedList34.remove(iP39);
    boolean b42 = server32.addException(iP39);
    tp2.SinglyLinkedList singlyLinkedList43 = new tp2.SinglyLinkedList();
    tp2.IP iP48 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i49 = iP48.getFourth();
    singlyLinkedList43.add(iP48);
    java.lang.Integer i51 = iP48.getFirst();
    boolean b52 = server32.removeBan(iP48);
    tp2.ITime iTime53 = null;
    server32.setTime(iTime53);
    boolean b55 = server32.notSharedElements();
    tp2.IP iP60 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i61 = iP60.getThird();
    iP60.setFourth((java.lang.Integer)0);
    iP60.setSecond((java.lang.Integer)3);
    boolean b66 = server32.addBan(iP60);
    tp2.SinglyLinkedList singlyLinkedList67 = new tp2.SinglyLinkedList();
    tp2.IP iP72 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i73 = iP72.getThird();
    boolean b74 = singlyLinkedList67.remove(iP72);
    java.lang.Integer i75 = iP72.getThird();
    iP72.setFirst((java.lang.Integer)11100);
    boolean b78 = server32.addBan(iP72);
    iPBan9.setIp(iP72);
    tp2.IP iP80 = iPBan9.getIp();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i6 + "' != '" + (-1)+ "'", i6.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long10 + "' != '" + 10L+ "'", long10.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long11 + "' != '" + 10L+ "'", long11.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i18 + "' != '" + (-1)+ "'", i18.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i27 + "' != '" + 100+ "'", i27.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i40 + "' != '" + (-1)+ "'", i40.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i49 + "' != '" + 100+ "'", i49.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i51 + "' != '" + (-1)+ "'", i51.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b52 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b55 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i61 + "' != '" + (-1)+ "'", i61.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b66 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i73 + "' != '" + (-1)+ "'", i73.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b74 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i75 + "' != '" + (-1)+ "'", i75.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b78 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP80);

  }

  @Test
  public void test157() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test157"); }


    java.lang.String str1 = java.lang.Integer.toOctalString((-2));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "37777777776"+ "'", str1.equals("37777777776"));

  }

  @Test
  public void test158() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test158"); }


    int i1 = java.lang.Integer.reverse(167772260);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 637534288);

  }

  @Test
  public void test159() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test159"); }


    java.lang.Integer i1 = java.lang.Integer.getInteger("12");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);

  }

  @Test
  public void test160() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test160"); }


    int i2 = java.lang.Integer.divideUnsigned(167772260, 67108864);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 2);

  }

  @Test
  public void test161() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test161"); }


    int i2 = java.lang.Integer.parseUnsignedInt("b", 16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 11);

  }

  @Test
  public void test162() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test162"); }


    tp2.Server server0 = new tp2.Server();
    boolean b1 = server0.bansSorted();
    tp2.IP iP2 = null;
    boolean b3 = server0.addException(iP2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);

  }

  @Test
  public void test163() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test163"); }


    java.lang.Integer i1 = java.lang.Integer.valueOf(16384);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 16384+ "'", i1.equals(16384));

  }

  @Test
  public void test164() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test164"); }


    java.lang.String str1 = java.lang.Integer.toHexString(16384);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "4000"+ "'", str1.equals("4000"));

  }

  @Test
  public void test165() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test165"); }


    int i2 = java.lang.Integer.max(671088644, 134217728);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 671088644);

  }

  @Test
  public void test166() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test166"); }


    int i2 = java.lang.Integer.sum(18, 167772160);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 167772178);

  }

  @Test
  public void test167() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test167"); }


    java.lang.Integer i2 = java.lang.Integer.getInteger("20", 16384);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i2 + "' != '" + 16384+ "'", i2.equals(16384));

  }

  @Test
  public void test168() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test168"); }


    int i2 = java.lang.Integer.sum(28, 1546321920);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1546321948);

  }

  @Test
  public void test169() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test169"); }


    int i1 = java.lang.Integer.parseUnsignedInt("100000");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 100000);

  }

  @Test
  public void test170() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test170"); }


    int i2 = java.lang.Integer.divideUnsigned(16, (-129));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);

  }

  @Test
  public void test171() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test171"); }


    tp2.SinglyLinkedList singlyLinkedList0 = new tp2.SinglyLinkedList();
    tp2.Server server1 = new tp2.Server();
    boolean b2 = server1.exceptionsNotRepeated();
    tp2.IP iP7 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i8 = iP7.getThird();
    iP7.setSecond((java.lang.Integer)10);
    boolean b11 = server1.removeBan(iP7);
    boolean b12 = singlyLinkedList0.remove(iP7);
    int i13 = singlyLinkedList0.getSize();
    tp2.Server server14 = new tp2.Server();
    boolean b15 = server14.notSharedElements();
    tp2.SinglyLinkedList singlyLinkedList16 = new tp2.SinglyLinkedList();
    tp2.IP iP21 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i22 = iP21.getThird();
    boolean b23 = singlyLinkedList16.remove(iP21);
    boolean b24 = server14.addException(iP21);
    tp2.SinglyLinkedList singlyLinkedList25 = new tp2.SinglyLinkedList();
    tp2.IP iP30 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i31 = iP30.getFourth();
    singlyLinkedList25.add(iP30);
    java.lang.Integer i33 = iP30.getFirst();
    boolean b34 = server14.removeBan(iP30);
    tp2.ITime iTime35 = null;
    server14.setTime(iTime35);
    boolean b37 = server14.bansSorted();
    boolean b38 = server14.bansNotRepeatedExpirationOrIP();
    tp2.SinglyLinkedList singlyLinkedList39 = new tp2.SinglyLinkedList();
    tp2.IP iP44 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i45 = iP44.getThird();
    boolean b46 = singlyLinkedList39.remove(iP44);
    tp2.IPBan iPBan48 = new tp2.IPBan(iP44, (java.lang.Long)10L);
    java.lang.Long long49 = iPBan48.getExpires();
    java.lang.Long long50 = iPBan48.getExpires();
    tp2.SinglyLinkedList singlyLinkedList51 = new tp2.SinglyLinkedList();
    tp2.IP iP56 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i57 = iP56.getThird();
    boolean b58 = singlyLinkedList51.remove(iP56);
    tp2.IPBan iPBan60 = new tp2.IPBan(iP56, (java.lang.Long)10L);
    tp2.IP iP65 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i66 = iP65.getFourth();
    iPBan60.setIp(iP65);
    iPBan48.setIp(iP65);
    boolean b69 = server14.addException(iP65);
    singlyLinkedList0.add(iP65);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i8 + "' != '" + (-1)+ "'", i8.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i22 + "' != '" + (-1)+ "'", i22.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i31 + "' != '" + 100+ "'", i31.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i33 + "' != '" + (-1)+ "'", i33.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i45 + "' != '" + (-1)+ "'", i45.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b46 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long49 + "' != '" + 10L+ "'", long49.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long50 + "' != '" + 10L+ "'", long50.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i57 + "' != '" + (-1)+ "'", i57.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b58 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i66 + "' != '" + 100+ "'", i66.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b69 == false);

  }

  @Test
  public void test172() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test172"); }


    // The following exception was thrown during execution in test generation
    try {
      java.lang.Integer i2 = java.lang.Integer.valueOf("51", (-2));
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test173() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test173"); }


    java.lang.String str2 = java.lang.Integer.toUnsignedString(16384, 784);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "16384"+ "'", str2.equals("16384"));

  }

  @Test
  public void test174() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test174"); }


    int i2 = java.lang.Integer.rotateRight(2, 20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 8192);

  }

  @Test
  public void test175() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test175"); }


    int i2 = java.lang.Integer.divideUnsigned(0, 201326784);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);

  }

  @Test
  public void test176() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test176"); }


    int i1 = java.lang.Integer.numberOfLeadingZeros(100000);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 15);

  }

  @Test
  public void test177() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test177"); }


    java.lang.String str1 = java.lang.Integer.toBinaryString(51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "110011"+ "'", str1.equals("110011"));

  }

  @Test
  public void test178() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test178"); }


    int i1 = java.lang.Integer.numberOfTrailingZeros(1107296276);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 2);

  }

  @Test
  public void test179() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test179"); }


    // The following exception was thrown during execution in test generation
    try {
      int i2 = java.lang.Integer.parseUnsignedInt("4000", 0);
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

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test180"); }


    int i1 = java.lang.Integer.bitCount(2147483647);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 31);

  }

  @Test
  public void test181() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test181"); }


    int i2 = java.lang.Integer.rotateLeft(15, 201326784);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 15);

  }

  @Test
  public void test182() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test182"); }


    int i1 = java.lang.Integer.numberOfTrailingZeros(100000);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 5);

  }

  @Test
  public void test183() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test183"); }


    java.lang.String str1 = java.lang.Integer.toOctalString(2147483647);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "17777777777"+ "'", str1.equals("17777777777"));

  }

  @Test
  public void test184() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test184"); }


    int i1 = java.lang.Integer.bitCount(201326597);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 4);

  }

  @Test
  public void test185() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test185"); }


    int i1 = java.lang.Integer.reverseBytes(100000);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == (-1601830656));

  }

  @Test
  public void test186() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test186"); }


    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList0 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b1 = strictlySortedSinglyLinkedList0.isEmpty();
    int i2 = strictlySortedSinglyLinkedList0.getSize();
    tp2.SinglyLinkedList singlyLinkedList3 = new tp2.SinglyLinkedList();
    tp2.IP iP8 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i9 = iP8.getThird();
    boolean b10 = singlyLinkedList3.remove(iP8);
    tp2.IPBan iPBan12 = new tp2.IPBan(iP8, (java.lang.Long)10L);
    tp2.IP iP17 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i18 = iP17.getFourth();
    iPBan12.setIp(iP17);
    java.lang.Long long20 = iPBan12.getExpires();
    java.lang.Long long21 = iPBan12.getExpires();
    tp2.IP iP26 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i27 = iP26.getFirst();
    java.lang.Integer i28 = iP26.getSecond();
    iP26.setFirst((java.lang.Integer)201326592);
    iPBan12.setIp(iP26);
    tp2.SinglyLinkedList singlyLinkedList32 = new tp2.SinglyLinkedList();
    tp2.Server server33 = new tp2.Server();
    boolean b34 = server33.exceptionsNotRepeated();
    tp2.IP iP39 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i40 = iP39.getThird();
    iP39.setSecond((java.lang.Integer)10);
    boolean b43 = server33.removeBan(iP39);
    boolean b44 = singlyLinkedList32.remove(iP39);
    tp2.SinglyLinkedList singlyLinkedList45 = new tp2.SinglyLinkedList();
    tp2.IP iP50 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i51 = iP50.getThird();
    boolean b52 = singlyLinkedList45.remove(iP50);
    tp2.Server server53 = new tp2.Server();
    tp2.IP iP58 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    boolean b59 = server53.removeBan(iP58);
    boolean b60 = singlyLinkedList45.contains(iP58);
    singlyLinkedList32.add(iP58);
    iPBan12.setIp(iP58);
    java.lang.Long long63 = iPBan12.getExpires();
    boolean b64 = strictlySortedSinglyLinkedList0.contains(iPBan12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + (-1)+ "'", i9.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i18 + "' != '" + 100+ "'", i18.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long20 + "' != '" + 10L+ "'", long20.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long21 + "' != '" + 10L+ "'", long21.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i27 + "' != '" + (-1)+ "'", i27.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i28 + "' != '" + (-1)+ "'", i28.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i40 + "' != '" + (-1)+ "'", i40.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b43 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i51 + "' != '" + (-1)+ "'", i51.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b52 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b59 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b60 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long63 + "' != '" + 10L+ "'", long63.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b64 == false);

  }

  @Test
  public void test187() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test187"); }


    // The following exception was thrown during execution in test generation
    try {
      int i2 = java.lang.Integer.parseInt("11000000000000000000000000001100", 0);
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

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test188"); }


    int i2 = java.lang.Integer.compareUnsigned(11001, 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);

  }

  @Test
  public void test189() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test189"); }


    java.lang.String str1 = java.lang.Integer.toBinaryString(448);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "111000000"+ "'", str1.equals("111000000"));

  }

  @Test
  public void test190() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test190"); }


    int i2 = java.lang.Integer.min(134217728, 1610612742);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 134217728);

  }

  @Test
  public void test191() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test191"); }


    int i2 = java.lang.Integer.rotateLeft(11884, 18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == (-1179648000));

  }

  @Test
  public void test192() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test192"); }


    // The following exception was thrown during execution in test generation
    try {
      int i1 = java.lang.Integer.parseInt("17777777777");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test193() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test193"); }


    int i1 = java.lang.Integer.lowestOneBit(6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 2);

  }

  @Test
  public void test194() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test194"); }


    // The following exception was thrown during execution in test generation
    try {
      int i2 = java.lang.Integer.parseInt("1001000000000000000000000000", 200000000);
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

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test195"); }


    int i1 = java.lang.Integer.reverse(524288);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 4096);

  }

  @Test
  public void test196() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test196"); }


    int i1 = java.lang.Integer.numberOfTrailingZeros(5120);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 10);

  }

  @Test
  public void test197() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test197"); }


    // The following exception was thrown during execution in test generation
    try {
      java.lang.Integer i2 = java.lang.Integer.valueOf("11000000000000000000000000001100", 150994944);
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

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test198"); }


    tp2.SinglyLinkedList singlyLinkedList0 = new tp2.SinglyLinkedList();
    tp2.IP iP5 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i6 = iP5.getThird();
    boolean b7 = singlyLinkedList0.remove(iP5);
    boolean b8 = singlyLinkedList0.isEmpty();
    tp2.SinglyLinkedList singlyLinkedList9 = new tp2.SinglyLinkedList();
    tp2.IP iP14 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i15 = iP14.getThird();
    boolean b16 = singlyLinkedList9.remove(iP14);
    boolean b17 = singlyLinkedList9.isEmpty();
    int i18 = singlyLinkedList9.getSize();
    tp2.IP iP23 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i24 = iP23.getThird();
    iP23.setFourth((java.lang.Integer)0);
    boolean b27 = singlyLinkedList9.contains(iP23);
    boolean b28 = singlyLinkedList9.isEmpty();
    tp2.SinglyLinkedList singlyLinkedList29 = new tp2.SinglyLinkedList();
    tp2.Server server30 = new tp2.Server();
    boolean b31 = server30.exceptionsNotRepeated();
    tp2.IP iP36 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i37 = iP36.getThird();
    iP36.setSecond((java.lang.Integer)10);
    boolean b40 = server30.removeBan(iP36);
    boolean b41 = singlyLinkedList29.remove(iP36);
    tp2.IP iP42 = null;
    singlyLinkedList29.add(iP42);
    tp2.IP iP45 = singlyLinkedList29.get(469762048);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList46 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP51 = new tp2.IP((java.lang.Integer)150994944, (java.lang.Integer)11100, (java.lang.Integer)784, (java.lang.Integer)0);
    boolean b52 = strictlySortedSinglyLinkedList46.removeFromIP(iP51);
    boolean b53 = singlyLinkedList29.contains(iP51);
    boolean b54 = singlyLinkedList9.remove(iP51);
    tp2.SinglyLinkedList singlyLinkedList55 = new tp2.SinglyLinkedList();
    tp2.IP iP60 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i61 = iP60.getThird();
    boolean b62 = singlyLinkedList55.remove(iP60);
    boolean b63 = singlyLinkedList55.isEmpty();
    int i64 = singlyLinkedList55.getSize();
    tp2.IP iP69 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i70 = iP69.getThird();
    iP69.setFourth((java.lang.Integer)0);
    boolean b73 = singlyLinkedList55.contains(iP69);
    boolean b74 = singlyLinkedList55.isEmpty();
    tp2.SinglyLinkedList singlyLinkedList75 = new tp2.SinglyLinkedList();
    tp2.IP iP80 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i81 = iP80.getThird();
    boolean b82 = singlyLinkedList75.remove(iP80);
    tp2.IPBan iPBan84 = new tp2.IPBan(iP80, (java.lang.Long)10L);
    singlyLinkedList55.add(iP80);
    boolean b86 = singlyLinkedList9.contains(iP80);
    boolean b87 = singlyLinkedList0.contains(iP80);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i6 + "' != '" + (-1)+ "'", i6.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i15 + "' != '" + (-1)+ "'", i15.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i24 + "' != '" + (-1)+ "'", i24.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i37 + "' != '" + (-1)+ "'", i37.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b52 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b53 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b54 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i61 + "' != '" + (-1)+ "'", i61.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b62 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b63 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i64 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i70 + "' != '" + (-1)+ "'", i70.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b73 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b74 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i81 + "' != '" + (-1)+ "'", i81.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b82 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b86 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b87 == false);

  }

  @Test
  public void test199() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test199"); }


    int i1 = java.lang.Integer.numberOfTrailingZeros(56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 3);

  }

  @Test
  public void test200() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test200"); }


    java.lang.String str1 = java.lang.Integer.toBinaryString(33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "100001"+ "'", str1.equals("100001"));

  }

  @Test
  public void test201() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test201"); }


    int i2 = java.lang.Integer.rotateLeft(40, 167772260);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 640);

  }

  @Test
  public void test202() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test202"); }


    int i1 = java.lang.Integer.numberOfLeadingZeros(56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 26);

  }

  @Test
  public void test203() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test203"); }


    java.lang.String str1 = java.lang.Integer.toBinaryString(218103808);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "1101000000000000000000000000"+ "'", str1.equals("1101000000000000000000000000"));

  }

  @Test
  public void test204() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test204"); }


    java.lang.Integer i1 = new java.lang.Integer(671088640);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 671088640+ "'", i1.equals(671088640));

  }

  @Test
  public void test205() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test205"); }


    tp2.SinglyLinkedList singlyLinkedList0 = new tp2.SinglyLinkedList();
    tp2.IP iP5 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i6 = iP5.getThird();
    boolean b7 = singlyLinkedList0.remove(iP5);
    tp2.IPBan iPBan9 = new tp2.IPBan(iP5, (java.lang.Long)10L);
    iP5.setFourth((java.lang.Integer)201326597);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i6 + "' != '" + (-1)+ "'", i6.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);

  }

  @Test
  public void test206() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test206"); }


    // The following exception was thrown during execution in test generation
    try {
      java.lang.Integer i2 = java.lang.Integer.valueOf("1100100", 48);
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test207() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test207"); }


    java.lang.String str1 = java.lang.Integer.toUnsignedString((-1601830656));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "2693136640"+ "'", str1.equals("2693136640"));

  }

  @Test
  public void test208() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test208"); }


    java.lang.Integer i2 = java.lang.Integer.getInteger("3221225472", 1073741844);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i2 + "' != '" + 1073741844+ "'", i2.equals(1073741844));

  }

  @Test
  public void test209() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test209"); }


    tp2.SinglyLinkedList singlyLinkedList0 = new tp2.SinglyLinkedList();
    tp2.IP iP5 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i6 = iP5.getThird();
    boolean b7 = singlyLinkedList0.remove(iP5);
    java.lang.Integer i8 = iP5.getThird();
    java.lang.Integer i9 = iP5.getSecond();
    tp2.IPBan iPBan11 = new tp2.IPBan(iP5, (java.lang.Long)727449600L);
    iP5.setSecond((java.lang.Integer)1610612786);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i6 + "' != '" + (-1)+ "'", i6.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i8 + "' != '" + (-1)+ "'", i8.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + (-1)+ "'", i9.equals((-1)));

  }

  @Test
  public void test210() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test210"); }


    java.lang.Integer i2 = java.lang.Integer.getInteger("201326597", (java.lang.Integer)727449600);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i2 + "' != '" + 727449600+ "'", i2.equals(727449600));

  }

  @Test
  public void test211() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test211"); }


    // The following exception was thrown during execution in test generation
    try {
      int i2 = java.lang.Integer.parseUnsignedInt("100", 0);
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test212() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test212"); }


    int i2 = java.lang.Integer.sum(436207642, 11884);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 436219526);

  }

  @Test
  public void test213() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test213"); }


    java.lang.Integer i1 = java.lang.Integer.valueOf(436219526);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 436219526+ "'", i1.equals(436219526));

  }

  @Test
  public void test214() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test214"); }


    long long1 = java.lang.Integer.toUnsignedLong(33554432);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == 33554432L);

  }

  @Test
  public void test215() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test215"); }


    tp2.IP iP4 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i5 = iP4.getFirst();
    java.lang.Integer i6 = iP4.getSecond();
    iP4.setFirst((java.lang.Integer)201326592);
    tp2.IPBan iPBan10 = new tp2.IPBan(iP4, (java.lang.Long)727449600L);
    tp2.IP iP11 = iPBan10.getIp();
    java.lang.Long long12 = iPBan10.getExpires();
    tp2.IP iP13 = iPBan10.getIp();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i5 + "' != '" + (-1)+ "'", i5.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i6 + "' != '" + (-1)+ "'", i6.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long12 + "' != '" + 727449600L+ "'", long12.equals(727449600L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP13);

  }

  @Test
  public void test216() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test216"); }


    int i1 = java.lang.Integer.parseInt("20");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 20);

  }

  @Test
  public void test217() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test217"); }


    int i2 = java.lang.Integer.divideUnsigned(5, 1107296276);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);

  }

  @Test
  public void test218() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test218"); }


    tp2.SinglyLinkedList singlyLinkedList0 = new tp2.SinglyLinkedList();
    tp2.Server server1 = new tp2.Server();
    boolean b2 = server1.exceptionsNotRepeated();
    tp2.IP iP7 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i8 = iP7.getThird();
    iP7.setSecond((java.lang.Integer)10);
    boolean b11 = server1.removeBan(iP7);
    boolean b12 = singlyLinkedList0.remove(iP7);
    int i13 = singlyLinkedList0.getSize();
    tp2.IP iP15 = singlyLinkedList0.get(1610612742);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i8 + "' != '" + (-1)+ "'", i8.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP15);

  }

  @Test
  public void test219() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test219"); }


    tp2.Server server0 = new tp2.Server();
    tp2.IP iP5 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    boolean b6 = server0.removeBan(iP5);
    tp2.ITime iTime7 = null;
    server0.setTime(iTime7);
    server0.update();
    tp2.SinglyLinkedList singlyLinkedList10 = new tp2.SinglyLinkedList();
    tp2.IP iP15 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i16 = iP15.getThird();
    boolean b17 = singlyLinkedList10.remove(iP15);
    java.lang.Integer i18 = iP15.getThird();
    iP15.setFirst((java.lang.Integer)11100);
    boolean b21 = server0.addException(iP15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i16 + "' != '" + (-1)+ "'", i16.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i18 + "' != '" + (-1)+ "'", i18.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);

  }

  @Test
  public void test220() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test220"); }


    int i2 = java.lang.Integer.rotateLeft(805306368, 11001);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 6291456);

  }

  @Test
  public void test221() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test221"); }


    int i1 = java.lang.Integer.numberOfTrailingZeros(134217728);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 27);

  }

  @Test
  public void test222() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test222"); }


    tp2.Server server0 = new tp2.Server();
    boolean b1 = server0.notSharedElements();
    boolean b2 = server0.bansOkTime();
    tp2.SinglyLinkedList singlyLinkedList3 = new tp2.SinglyLinkedList();
    tp2.IP iP8 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i9 = iP8.getFourth();
    singlyLinkedList3.add(iP8);
    boolean b11 = server0.connect(iP8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 100+ "'", i9.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);

  }

  @Test
  public void test223() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test223"); }


    int i1 = java.lang.Integer.parseInt("23");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 23);

  }

  @Test
  public void test224() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test224"); }


    int i2 = java.lang.Integer.sum(4096, (-2147483648));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == (-2147479552));

  }

  @Test
  public void test225() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test225"); }


    int i2 = java.lang.Integer.sum(805306368, 2621440);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 807927808);

  }

  @Test
  public void test226() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test226"); }


    tp2.Server server0 = new tp2.Server();
    boolean b1 = server0.bansSorted();
    tp2.IP iP6 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i7 = iP6.getFourth();
    boolean b8 = server0.removeException(iP6);
    tp2.ITime iTime9 = null;
    server0.setTime(iTime9);
    tp2.Server server11 = new tp2.Server();
    tp2.ITime iTime12 = null;
    server11.setTime(iTime12);
    tp2.ITime iTime14 = null;
    server11.setTime(iTime14);
    tp2.Server server16 = new tp2.Server();
    tp2.IP iP21 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    boolean b22 = server16.removeBan(iP21);
    java.lang.Integer i23 = iP21.getFirst();
    boolean b24 = server11.addException(iP21);
    iP21.setThird((java.lang.Integer)(-1073741824));
    boolean b27 = server0.addBan(iP21);
    tp2.Server server28 = new tp2.Server();
    tp2.SinglyLinkedList singlyLinkedList29 = new tp2.SinglyLinkedList();
    tp2.Server server30 = new tp2.Server();
    boolean b31 = server30.exceptionsNotRepeated();
    tp2.IP iP36 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i37 = iP36.getThird();
    iP36.setSecond((java.lang.Integer)10);
    boolean b40 = server30.removeBan(iP36);
    boolean b41 = singlyLinkedList29.remove(iP36);
    tp2.SinglyLinkedList singlyLinkedList42 = new tp2.SinglyLinkedList();
    tp2.IP iP47 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i48 = iP47.getThird();
    boolean b49 = singlyLinkedList42.remove(iP47);
    tp2.Server server50 = new tp2.Server();
    tp2.IP iP55 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    boolean b56 = server50.removeBan(iP55);
    boolean b57 = singlyLinkedList42.contains(iP55);
    singlyLinkedList29.add(iP55);
    boolean b59 = server28.addBan(iP55);
    boolean b60 = server0.addBan(iP55);
    boolean b61 = server0.notSharedElements();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i7 + "' != '" + 100+ "'", i7.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i23 + "' != '" + (-1)+ "'", i23.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i37 + "' != '" + (-1)+ "'", i37.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i48 + "' != '" + (-1)+ "'", i48.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b49 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b56 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b57 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b59 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b60 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b61 == true);

  }

  @Test
  public void test227() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test227"); }


    tp2.SinglyLinkedList singlyLinkedList0 = new tp2.SinglyLinkedList();
    tp2.IP iP5 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i6 = iP5.getThird();
    boolean b7 = singlyLinkedList0.remove(iP5);
    boolean b8 = singlyLinkedList0.isEmpty();
    int i9 = singlyLinkedList0.getSize();
    boolean b10 = singlyLinkedList0.isEmpty();
    tp2.SinglyLinkedList singlyLinkedList11 = new tp2.SinglyLinkedList();
    tp2.IP iP12 = null;
    boolean b13 = singlyLinkedList11.remove(iP12);
    boolean b14 = singlyLinkedList11.isEmpty();
    tp2.SinglyLinkedList singlyLinkedList15 = new tp2.SinglyLinkedList();
    tp2.IP iP20 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i21 = iP20.getThird();
    boolean b22 = singlyLinkedList15.remove(iP20);
    tp2.IPBan iPBan24 = new tp2.IPBan(iP20, (java.lang.Long)10L);
    java.lang.Long long25 = iPBan24.getExpires();
    java.lang.Long long26 = iPBan24.getExpires();
    tp2.SinglyLinkedList singlyLinkedList27 = new tp2.SinglyLinkedList();
    tp2.IP iP32 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i33 = iP32.getThird();
    boolean b34 = singlyLinkedList27.remove(iP32);
    tp2.IPBan iPBan36 = new tp2.IPBan(iP32, (java.lang.Long)10L);
    tp2.IP iP41 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i42 = iP41.getFourth();
    iPBan36.setIp(iP41);
    iPBan24.setIp(iP41);
    boolean b45 = singlyLinkedList11.contains(iP41);
    boolean b46 = singlyLinkedList0.contains(iP41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i6 + "' != '" + (-1)+ "'", i6.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i21 + "' != '" + (-1)+ "'", i21.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long25 + "' != '" + 10L+ "'", long25.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long26 + "' != '" + 10L+ "'", long26.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i33 + "' != '" + (-1)+ "'", i33.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i42 + "' != '" + 100+ "'", i42.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b46 == false);

  }

  @Test
  public void test228() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test228"); }


    tp2.Server server0 = new tp2.Server();
    boolean b1 = server0.exceptionsNotRepeated();
    boolean b2 = server0.bansSorted();
    boolean b3 = server0.notSharedElements();
    boolean b4 = server0.bansSorted();
    server0.update();
    tp2.IP iP10 = new tp2.IP((java.lang.Integer)11100, (java.lang.Integer)40, (java.lang.Integer)28, (java.lang.Integer)727449600);
    boolean b11 = server0.addException(iP10);
    server0.update();
    boolean b13 = server0.bansOkTime();
    boolean b14 = server0.notSharedElements();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);

  }

  @Test
  public void test229() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test229"); }


    tp2.Server server0 = new tp2.Server();
    boolean b1 = server0.exceptionsNotRepeated();
    boolean b2 = server0.bansSorted();
    boolean b3 = server0.notSharedElements();
    tp2.SinglyLinkedList singlyLinkedList4 = new tp2.SinglyLinkedList();
    tp2.IP iP9 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i10 = iP9.getFourth();
    singlyLinkedList4.add(iP9);
    boolean b12 = server0.addException(iP9);
    tp2.Server server13 = new tp2.Server();
    boolean b14 = server13.notSharedElements();
    tp2.SinglyLinkedList singlyLinkedList15 = new tp2.SinglyLinkedList();
    tp2.IP iP20 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i21 = iP20.getThird();
    boolean b22 = singlyLinkedList15.remove(iP20);
    boolean b23 = server13.addException(iP20);
    tp2.SinglyLinkedList singlyLinkedList24 = new tp2.SinglyLinkedList();
    tp2.IP iP29 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i30 = iP29.getFourth();
    singlyLinkedList24.add(iP29);
    java.lang.Integer i32 = iP29.getFirst();
    boolean b33 = server13.removeBan(iP29);
    tp2.ITime iTime34 = null;
    server13.setTime(iTime34);
    boolean b36 = server13.notSharedElements();
    tp2.IP iP41 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i42 = iP41.getThird();
    iP41.setFourth((java.lang.Integer)0);
    iP41.setSecond((java.lang.Integer)3);
    boolean b47 = server13.addBan(iP41);
    tp2.SinglyLinkedList singlyLinkedList48 = new tp2.SinglyLinkedList();
    tp2.IP iP53 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i54 = iP53.getThird();
    boolean b55 = singlyLinkedList48.remove(iP53);
    java.lang.Integer i56 = iP53.getThird();
    iP53.setFirst((java.lang.Integer)11100);
    boolean b59 = server13.addBan(iP53);
    boolean b60 = server0.removeBan(iP53);
    java.lang.Integer i61 = iP53.getSecond();
    tp2.IPBan iPBan63 = new tp2.IPBan(iP53, (java.lang.Long)10L);
    iPBan63.setExpires((java.lang.Long)5L);
    tp2.SinglyLinkedList singlyLinkedList66 = new tp2.SinglyLinkedList();
    tp2.IP iP71 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i72 = iP71.getThird();
    boolean b73 = singlyLinkedList66.remove(iP71);
    tp2.IP iP78 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i79 = iP78.getFirst();
    boolean b80 = singlyLinkedList66.remove(iP78);
    iP78.setSecond((java.lang.Integer)40);
    iPBan63.setIp(iP78);
    iP78.setFourth((java.lang.Integer)26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i10 + "' != '" + 100+ "'", i10.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i21 + "' != '" + (-1)+ "'", i21.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i30 + "' != '" + 100+ "'", i30.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i32 + "' != '" + (-1)+ "'", i32.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i42 + "' != '" + (-1)+ "'", i42.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b47 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i54 + "' != '" + (-1)+ "'", i54.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b55 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i56 + "' != '" + (-1)+ "'", i56.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b59 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b60 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i61 + "' != '" + (-1)+ "'", i61.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i72 + "' != '" + (-1)+ "'", i72.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b73 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i79 + "' != '" + (-1)+ "'", i79.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b80 == false);

  }

  @Test
  public void test230() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test230"); }


    int i2 = java.lang.Integer.rotateRight(729888, 1107296276);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == (-1305346048));

  }

  @Test
  public void test231() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test231"); }


    java.lang.String str1 = java.lang.Integer.toOctalString(56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "70"+ "'", str1.equals("70"));

  }

  @Test
  public void test232() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test232"); }


    tp2.IP iP4 = new tp2.IP((java.lang.Integer)671088644, (java.lang.Integer)512, (java.lang.Integer)1610612786, (java.lang.Integer)256);
    iP4.setSecond((java.lang.Integer)25);

  }

  @Test
  public void test233() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test233"); }


    java.lang.String str1 = java.lang.Integer.toOctalString(436207616);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "3200000000"+ "'", str1.equals("3200000000"));

  }

  @Test
  public void test234() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test234"); }


    int i2 = java.lang.Integer.min(3, 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 3);

  }

  @Test
  public void test235() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test235"); }


    // The following exception was thrown during execution in test generation
    try {
      java.lang.Integer i2 = java.lang.Integer.valueOf("111000000", 1546321920);
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

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test236"); }


    java.lang.Integer i1 = java.lang.Integer.getInteger("70");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);

  }

  @Test
  public void test237() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test237"); }


    int i2 = java.lang.Integer.min((-1073741824), 671088640);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == (-1073741824));

  }

  @Test
  public void test238() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test238"); }


    int i1 = java.lang.Integer.highestOneBit(23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 16);

  }

  @Test
  public void test239() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test239"); }


    int i2 = java.lang.Integer.rotateLeft(3, 727449600);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 3);

  }

  @Test
  public void test240() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test240"); }


    long long1 = java.lang.Integer.toUnsignedLong(11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == 11L);

  }

  @Test
  public void test241() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test241"); }


    int i2 = java.lang.Integer.remainderUnsigned(11001, 8192);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 2809);

  }

  @Test
  public void test242() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test242"); }


    java.lang.Integer i1 = java.lang.Integer.getInteger("469762048");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);

  }

  @Test
  public void test243() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test243"); }


    tp2.Server server0 = new tp2.Server();
    tp2.ITime iTime1 = null;
    server0.setTime(iTime1);
    tp2.ITime iTime3 = null;
    server0.setTime(iTime3);
    tp2.Server server5 = new tp2.Server();
    tp2.IP iP10 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    boolean b11 = server5.removeBan(iP10);
    java.lang.Integer i12 = iP10.getFirst();
    boolean b13 = server0.addException(iP10);
    boolean b14 = server0.bansOkTime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i12 + "' != '" + (-1)+ "'", i12.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);

  }

  @Test
  public void test244() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test244"); }


    tp2.Server server0 = new tp2.Server();
    boolean b1 = server0.notSharedElements();
    tp2.SinglyLinkedList singlyLinkedList2 = new tp2.SinglyLinkedList();
    tp2.IP iP7 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i8 = iP7.getThird();
    boolean b9 = singlyLinkedList2.remove(iP7);
    boolean b10 = server0.addException(iP7);
    tp2.SinglyLinkedList singlyLinkedList11 = new tp2.SinglyLinkedList();
    tp2.IP iP16 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i17 = iP16.getFourth();
    singlyLinkedList11.add(iP16);
    java.lang.Integer i19 = iP16.getFirst();
    boolean b20 = server0.removeBan(iP16);
    tp2.ITime iTime21 = null;
    server0.setTime(iTime21);
    server0.update();
    boolean b24 = server0.bansOkTime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i8 + "' != '" + (-1)+ "'", i8.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i17 + "' != '" + 100+ "'", i17.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i19 + "' != '" + (-1)+ "'", i19.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == true);

  }

  @Test
  public void test245() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test245"); }


    tp2.Server server0 = new tp2.Server();
    boolean b1 = server0.notSharedElements();
    tp2.SinglyLinkedList singlyLinkedList2 = new tp2.SinglyLinkedList();
    tp2.IP iP7 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i8 = iP7.getThird();
    boolean b9 = singlyLinkedList2.remove(iP7);
    boolean b10 = server0.addException(iP7);
    tp2.SinglyLinkedList singlyLinkedList11 = new tp2.SinglyLinkedList();
    tp2.IP iP16 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i17 = iP16.getFourth();
    singlyLinkedList11.add(iP16);
    java.lang.Integer i19 = iP16.getFirst();
    boolean b20 = server0.removeBan(iP16);
    iP16.setFourth((java.lang.Integer)1546321948);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i8 + "' != '" + (-1)+ "'", i8.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i17 + "' != '" + 100+ "'", i17.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i19 + "' != '" + (-1)+ "'", i19.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);

  }

  @Test
  public void test246() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test246"); }


    java.lang.Integer i2 = null;
    // The following exception was thrown during execution in test generation
    try {
      tp2.IP iP4 = new tp2.IP((java.lang.Integer)729888, (java.lang.Integer)0, i2, (java.lang.Integer)23);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test247() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test247"); }


    int i2 = java.lang.Integer.max(33, 1107296276);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1107296276);

  }

  @Test
  public void test248() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test248"); }


    int i2 = java.lang.Integer.rotateRight(536870912, 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 134217728);

  }

  @Test
  public void test249() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test249"); }


    tp2.SinglyLinkedList singlyLinkedList0 = new tp2.SinglyLinkedList();
    tp2.Server server1 = new tp2.Server();
    boolean b2 = server1.exceptionsNotRepeated();
    tp2.IP iP7 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i8 = iP7.getThird();
    iP7.setSecond((java.lang.Integer)10);
    boolean b11 = server1.removeBan(iP7);
    boolean b12 = singlyLinkedList0.remove(iP7);
    int i13 = singlyLinkedList0.getSize();
    boolean b14 = singlyLinkedList0.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i8 + "' != '" + (-1)+ "'", i8.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);

  }

  @Test
  public void test250() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test250"); }


    java.lang.Integer i2 = java.lang.Integer.getInteger("17777777777", (java.lang.Integer)(-1073741812));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i2 + "' != '" + (-1073741812)+ "'", i2.equals((-1073741812)));

  }

  @Test
  public void test251() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test251"); }


    java.lang.String str2 = java.lang.Integer.toUnsignedString((-129), 637534208);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4294967167"+ "'", str2.equals("4294967167"));

  }

  @Test
  public void test252() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test252"); }


    java.lang.String str2 = java.lang.Integer.toUnsignedString(13, 44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "13"+ "'", str2.equals("13"));

  }

  @Test
  public void test253() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test253"); }


    tp2.SinglyLinkedList singlyLinkedList0 = new tp2.SinglyLinkedList();
    tp2.IP iP5 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i6 = iP5.getThird();
    boolean b7 = singlyLinkedList0.remove(iP5);
    tp2.Server server8 = new tp2.Server();
    tp2.IP iP13 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    boolean b14 = server8.removeBan(iP13);
    boolean b15 = singlyLinkedList0.contains(iP13);
    boolean b16 = singlyLinkedList0.isEmpty();
    boolean b17 = singlyLinkedList0.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i6 + "' != '" + (-1)+ "'", i6.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);

  }

  @Test
  public void test254() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test254"); }


    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList0 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP5 = new tp2.IP((java.lang.Integer)150994944, (java.lang.Integer)11100, (java.lang.Integer)784, (java.lang.Integer)0);
    boolean b6 = strictlySortedSinglyLinkedList0.removeFromIP(iP5);
    int i7 = strictlySortedSinglyLinkedList0.getSize();
    tp2.Server server8 = new tp2.Server();
    boolean b9 = server8.notSharedElements();
    tp2.SinglyLinkedList singlyLinkedList10 = new tp2.SinglyLinkedList();
    tp2.IP iP15 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i16 = iP15.getThird();
    boolean b17 = singlyLinkedList10.remove(iP15);
    boolean b18 = server8.addException(iP15);
    java.lang.Integer i19 = iP15.getFourth();
    boolean b20 = strictlySortedSinglyLinkedList0.containsIP(iP15);
    int i21 = strictlySortedSinglyLinkedList0.getSize();
    tp2.IPBan iPBan23 = strictlySortedSinglyLinkedList0.get((-1073741812));
    tp2.IP iP24 = null;
    boolean b25 = strictlySortedSinglyLinkedList0.containsIP(iP24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i16 + "' != '" + (-1)+ "'", i16.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i19 + "' != '" + 100+ "'", i19.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iPBan23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);

  }

  @Test
  public void test255() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test255"); }


    java.lang.Integer i1 = new java.lang.Integer(167772178);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 167772178+ "'", i1.equals(167772178));

  }

  @Test
  public void test256() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test256"); }


    java.lang.String str1 = java.lang.Integer.toUnsignedString(88770);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "88770"+ "'", str1.equals("88770"));

  }

  @Test
  public void test257() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test257"); }


    java.lang.Integer i1 = java.lang.Integer.valueOf("70");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 70+ "'", i1.equals(70));

  }

  @Test
  public void test258() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test258"); }


    int i1 = java.lang.Integer.lowestOneBit(146800640);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 4194304);

  }

  @Test
  public void test259() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test259"); }


    tp2.SinglyLinkedList singlyLinkedList0 = new tp2.SinglyLinkedList();
    tp2.IP iP5 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i6 = iP5.getThird();
    boolean b7 = singlyLinkedList0.remove(iP5);
    tp2.IPBan iPBan9 = new tp2.IPBan(iP5, (java.lang.Long)10L);
    java.lang.Long long10 = iPBan9.getExpires();
    iPBan9.setExpires((java.lang.Long)(-1L));
    java.lang.Long long13 = iPBan9.getExpires();
    java.lang.Long long14 = iPBan9.getExpires();
    iPBan9.setExpires((java.lang.Long)33554432L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i6 + "' != '" + (-1)+ "'", i6.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long10 + "' != '" + 10L+ "'", long10.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1L)+ "'", long13.equals((-1L)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-1L)+ "'", long14.equals((-1L)));

  }

  @Test
  public void test260() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test260"); }


    java.lang.Integer i1 = java.lang.Integer.getInteger("4");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);

  }

  @Test
  public void test261() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test261"); }


    int i1 = java.lang.Integer.highestOneBit(512);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 512);

  }

  @Test
  public void test262() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test262"); }


    int i2 = java.lang.Integer.compareUnsigned(2147483647, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == (-1));

  }

  @Test
  public void test263() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test263"); }


    tp2.Server server0 = new tp2.Server();
    boolean b1 = server0.bansSorted();
    tp2.IP iP6 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i7 = iP6.getFourth();
    boolean b8 = server0.removeException(iP6);
    tp2.ITime iTime9 = null;
    server0.setTime(iTime9);
    tp2.Server server11 = new tp2.Server();
    tp2.ITime iTime12 = null;
    server11.setTime(iTime12);
    tp2.ITime iTime14 = null;
    server11.setTime(iTime14);
    tp2.Server server16 = new tp2.Server();
    tp2.IP iP21 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    boolean b22 = server16.removeBan(iP21);
    java.lang.Integer i23 = iP21.getFirst();
    boolean b24 = server11.addException(iP21);
    iP21.setThird((java.lang.Integer)(-1073741824));
    boolean b27 = server0.addBan(iP21);
    boolean b28 = server0.bansNotRepeatedExpirationOrIP();
    server0.update();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i7 + "' != '" + 100+ "'", i7.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i23 + "' != '" + (-1)+ "'", i23.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == true);

  }

  @Test
  public void test264() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test264"); }


    tp2.Server server0 = new tp2.Server();
    boolean b1 = server0.notSharedElements();
    tp2.SinglyLinkedList singlyLinkedList2 = new tp2.SinglyLinkedList();
    tp2.IP iP7 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i8 = iP7.getThird();
    boolean b9 = singlyLinkedList2.remove(iP7);
    boolean b10 = server0.addException(iP7);
    tp2.SinglyLinkedList singlyLinkedList11 = new tp2.SinglyLinkedList();
    tp2.IP iP16 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i17 = iP16.getFourth();
    singlyLinkedList11.add(iP16);
    java.lang.Integer i19 = iP16.getFirst();
    boolean b20 = server0.removeBan(iP16);
    tp2.ITime iTime21 = null;
    server0.setTime(iTime21);
    boolean b23 = server0.bansNotRepeatedExpirationOrIP();
    tp2.SinglyLinkedList singlyLinkedList24 = new tp2.SinglyLinkedList();
    tp2.IP iP29 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i30 = iP29.getThird();
    boolean b31 = singlyLinkedList24.remove(iP29);
    iP29.setSecond((java.lang.Integer)44);
    boolean b34 = server0.addException(iP29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i8 + "' != '" + (-1)+ "'", i8.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i17 + "' != '" + 100+ "'", i17.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i19 + "' != '" + (-1)+ "'", i19.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i30 + "' != '" + (-1)+ "'", i30.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == true);

  }

  @Test
  public void test265() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test265"); }


    java.lang.String str1 = java.lang.Integer.toHexString(2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "2"+ "'", str1.equals("2"));

  }

  @Test
  public void test266() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test266"); }


    int i1 = java.lang.Integer.bitCount(436219526);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 10);

  }

  @Test
  public void test267() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test267"); }


    // The following exception was thrown during execution in test generation
    try {
      korat.finitization.IFinitization iFinitization1 = tp2.Server.finServer(11100);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test268() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test268"); }


    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList0 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP5 = new tp2.IP((java.lang.Integer)150994944, (java.lang.Integer)784, (java.lang.Integer)784, (java.lang.Integer)2);
    java.lang.Integer i6 = iP5.getFourth();
    boolean b7 = strictlySortedSinglyLinkedList0.removeFromIP(iP5);
    tp2.SinglyLinkedList singlyLinkedList8 = new tp2.SinglyLinkedList();
    tp2.IP iP13 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i14 = iP13.getThird();
    boolean b15 = singlyLinkedList8.remove(iP13);
    java.lang.Integer i16 = iP13.getThird();
    boolean b17 = strictlySortedSinglyLinkedList0.removeFromIP(iP13);
    tp2.Server server18 = new tp2.Server();
    boolean b19 = server18.exceptionsNotRepeated();
    boolean b20 = server18.bansSorted();
    boolean b21 = server18.notSharedElements();
    tp2.Server server22 = new tp2.Server();
    boolean b23 = server22.notSharedElements();
    tp2.SinglyLinkedList singlyLinkedList24 = new tp2.SinglyLinkedList();
    tp2.IP iP29 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i30 = iP29.getThird();
    boolean b31 = singlyLinkedList24.remove(iP29);
    boolean b32 = server22.addException(iP29);
    tp2.SinglyLinkedList singlyLinkedList33 = new tp2.SinglyLinkedList();
    tp2.IP iP38 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i39 = iP38.getFourth();
    singlyLinkedList33.add(iP38);
    java.lang.Integer i41 = iP38.getFirst();
    boolean b42 = server22.removeBan(iP38);
    tp2.ITime iTime43 = null;
    server22.setTime(iTime43);
    boolean b45 = server22.notSharedElements();
    tp2.IP iP50 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i51 = iP50.getThird();
    iP50.setFourth((java.lang.Integer)0);
    iP50.setSecond((java.lang.Integer)3);
    boolean b56 = server22.addBan(iP50);
    tp2.SinglyLinkedList singlyLinkedList57 = new tp2.SinglyLinkedList();
    tp2.IP iP62 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i63 = iP62.getThird();
    boolean b64 = singlyLinkedList57.remove(iP62);
    java.lang.Integer i65 = iP62.getThird();
    iP62.setFirst((java.lang.Integer)11100);
    boolean b68 = server22.addBan(iP62);
    boolean b69 = server18.removeException(iP62);
    boolean b70 = strictlySortedSinglyLinkedList0.removeFromIP(iP62);
    iP62.setFourth((java.lang.Integer)16384);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i6 + "' != '" + 2+ "'", i6.equals(2));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i14 + "' != '" + (-1)+ "'", i14.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i16 + "' != '" + (-1)+ "'", i16.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i30 + "' != '" + (-1)+ "'", i30.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i39 + "' != '" + 100+ "'", i39.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i41 + "' != '" + (-1)+ "'", i41.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i51 + "' != '" + (-1)+ "'", i51.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b56 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i63 + "' != '" + (-1)+ "'", i63.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b64 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i65 + "' != '" + (-1)+ "'", i65.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b68 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b69 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b70 == false);

  }

  @Test
  public void test269() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test269"); }


    tp2.Server server0 = new tp2.Server();
    boolean b1 = server0.exceptionsNotRepeated();
    boolean b2 = server0.bansSorted();
    boolean b3 = server0.notSharedElements();
    tp2.SinglyLinkedList singlyLinkedList4 = new tp2.SinglyLinkedList();
    tp2.IP iP9 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i10 = iP9.getFourth();
    singlyLinkedList4.add(iP9);
    boolean b12 = server0.addException(iP9);
    java.lang.Integer i13 = iP9.getSecond();
    iP9.setSecond((java.lang.Integer)(-1));
    java.lang.Integer i16 = iP9.getFourth();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i10 + "' != '" + 100+ "'", i10.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i13 + "' != '" + (-1)+ "'", i13.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i16 + "' != '" + 100+ "'", i16.equals(100));

  }

  @Test
  public void test270() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test270"); }


    // The following exception was thrown during execution in test generation
    try {
      int i2 = java.lang.Integer.parseUnsignedInt("5", 100);
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

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test271"); }


    tp2.Server server0 = new tp2.Server();
    boolean b1 = server0.exceptionsNotRepeated();
    boolean b2 = server0.bansSorted();
    tp2.Server server3 = new tp2.Server();
    tp2.IP iP8 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    boolean b9 = server3.removeBan(iP8);
    java.lang.Integer i10 = iP8.getFirst();
    boolean b11 = server0.addBan(iP8);
    server0.update();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i10 + "' != '" + (-1)+ "'", i10.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);

  }

  @Test
  public void test272() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test272"); }


    long long1 = java.lang.Integer.toUnsignedLong(23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == 23L);

  }

  @Test
  public void test273() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test273"); }


    tp2.Server server0 = new tp2.Server();
    boolean b1 = server0.notSharedElements();
    tp2.SinglyLinkedList singlyLinkedList2 = new tp2.SinglyLinkedList();
    tp2.IP iP7 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i8 = iP7.getThird();
    boolean b9 = singlyLinkedList2.remove(iP7);
    boolean b10 = server0.addException(iP7);
    tp2.SinglyLinkedList singlyLinkedList11 = new tp2.SinglyLinkedList();
    tp2.IP iP16 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i17 = iP16.getFourth();
    singlyLinkedList11.add(iP16);
    java.lang.Integer i19 = iP16.getFirst();
    boolean b20 = server0.removeBan(iP16);
    tp2.Server server21 = new tp2.Server();
    tp2.IP iP26 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    boolean b27 = server21.removeBan(iP26);
    tp2.IP iP32 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i33 = iP32.getThird();
    iP32.setFourth((java.lang.Integer)0);
    iP32.setSecond((java.lang.Integer)3);
    iP32.setFourth((java.lang.Integer)12);
    boolean b40 = server21.addBan(iP32);
    boolean b41 = server0.removeException(iP32);
    tp2.ITime iTime42 = null;
    server0.setTime(iTime42);
    tp2.SinglyLinkedList singlyLinkedList44 = new tp2.SinglyLinkedList();
    tp2.IP iP49 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i50 = iP49.getThird();
    boolean b51 = singlyLinkedList44.remove(iP49);
    java.lang.Integer i52 = iP49.getThird();
    java.lang.Integer i53 = iP49.getSecond();
    boolean b54 = server0.addException(iP49);
    java.lang.Integer i55 = iP49.getSecond();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i8 + "' != '" + (-1)+ "'", i8.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i17 + "' != '" + 100+ "'", i17.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i19 + "' != '" + (-1)+ "'", i19.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i33 + "' != '" + (-1)+ "'", i33.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i50 + "' != '" + (-1)+ "'", i50.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b51 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i52 + "' != '" + (-1)+ "'", i52.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i53 + "' != '" + (-1)+ "'", i53.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b54 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i55 + "' != '" + (-1)+ "'", i55.equals((-1)));

  }

  @Test
  public void test274() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test274"); }


    tp2.Server server0 = new tp2.Server();
    boolean b1 = server0.notSharedElements();
    tp2.SinglyLinkedList singlyLinkedList2 = new tp2.SinglyLinkedList();
    tp2.IP iP7 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i8 = iP7.getThird();
    boolean b9 = singlyLinkedList2.remove(iP7);
    boolean b10 = server0.addException(iP7);
    tp2.SinglyLinkedList singlyLinkedList11 = new tp2.SinglyLinkedList();
    tp2.IP iP16 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i17 = iP16.getFourth();
    singlyLinkedList11.add(iP16);
    java.lang.Integer i19 = iP16.getFirst();
    boolean b20 = server0.removeBan(iP16);
    tp2.ITime iTime21 = null;
    server0.setTime(iTime21);
    boolean b23 = server0.bansSorted();
    boolean b24 = server0.bansNotRepeatedExpirationOrIP();
    boolean b25 = server0.bansOkTime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i8 + "' != '" + (-1)+ "'", i8.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i17 + "' != '" + 100+ "'", i17.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i19 + "' != '" + (-1)+ "'", i19.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);

  }

  @Test
  public void test275() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test275"); }


    int i2 = java.lang.Integer.compare(31, (-1601830656));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);

  }

  @Test
  public void test276() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test276"); }


    int i1 = java.lang.Integer.reverseBytes(16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 268435456);

  }

  @Test
  public void test277() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test277"); }


    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList0 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP5 = new tp2.IP((java.lang.Integer)150994944, (java.lang.Integer)11100, (java.lang.Integer)784, (java.lang.Integer)0);
    boolean b6 = strictlySortedSinglyLinkedList0.removeFromIP(iP5);
    int i7 = strictlySortedSinglyLinkedList0.getSize();
    tp2.SinglyLinkedList singlyLinkedList8 = new tp2.SinglyLinkedList();
    tp2.IP iP13 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i14 = iP13.getThird();
    boolean b15 = singlyLinkedList8.remove(iP13);
    tp2.IPBan iPBan17 = new tp2.IPBan(iP13, (java.lang.Long)10L);
    java.lang.Long long18 = iPBan17.getExpires();
    java.lang.Long long19 = iPBan17.getExpires();
    tp2.IP iP20 = iPBan17.getIp();
    boolean b21 = strictlySortedSinglyLinkedList0.add(iPBan17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i14 + "' != '" + (-1)+ "'", i14.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long18 + "' != '" + 10L+ "'", long18.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long19 + "' != '" + 10L+ "'", long19.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);

  }

  @Test
  public void test278() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test278"); }


    java.lang.String str1 = java.lang.Integer.toOctalString(805306368);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "6000000000"+ "'", str1.equals("6000000000"));

  }

  @Test
  public void test279() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test279"); }


    tp2.SinglyLinkedList singlyLinkedList0 = new tp2.SinglyLinkedList();
    tp2.IP iP5 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i6 = iP5.getThird();
    boolean b7 = singlyLinkedList0.remove(iP5);
    iP5.setSecond((java.lang.Integer)150994944);
    java.lang.Integer i10 = iP5.getFourth();
    java.lang.Integer i11 = iP5.getThird();
    java.lang.Integer i12 = iP5.getFirst();
    tp2.SinglyLinkedList singlyLinkedList13 = new tp2.SinglyLinkedList();
    tp2.IP iP18 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i19 = iP18.getThird();
    boolean b20 = singlyLinkedList13.remove(iP18);
    tp2.IPBan iPBan22 = new tp2.IPBan(iP18, (java.lang.Long)10L);
    java.lang.Long long23 = iPBan22.getExpires();
    java.lang.Long long24 = iPBan22.getExpires();
    tp2.SinglyLinkedList singlyLinkedList25 = new tp2.SinglyLinkedList();
    tp2.IP iP30 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i31 = iP30.getThird();
    boolean b32 = singlyLinkedList25.remove(iP30);
    tp2.IPBan iPBan34 = new tp2.IPBan(iP30, (java.lang.Long)10L);
    tp2.IP iP39 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i40 = iP39.getFourth();
    iPBan34.setIp(iP39);
    iPBan22.setIp(iP39);
    boolean b43 = iP5.equals((java.lang.Object)iP39);
    tp2.IPBan iPBan45 = new tp2.IPBan(iP5, (java.lang.Long)1L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i6 + "' != '" + (-1)+ "'", i6.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i10 + "' != '" + 100+ "'", i10.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i11 + "' != '" + (-1)+ "'", i11.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i12 + "' != '" + (-1)+ "'", i12.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i19 + "' != '" + (-1)+ "'", i19.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long23 + "' != '" + 10L+ "'", long23.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long24 + "' != '" + 10L+ "'", long24.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i31 + "' != '" + (-1)+ "'", i31.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i40 + "' != '" + 100+ "'", i40.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b43 == false);

  }

  @Test
  public void test280() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test280"); }


    int i1 = java.lang.Integer.reverse(201326597);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == (-1610612688));

  }

  @Test
  public void test281() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test281"); }


    long long1 = java.lang.Integer.toUnsignedLong(25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == 25L);

  }

  @Test
  public void test282() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test282"); }


    tp2.SinglyLinkedList singlyLinkedList0 = new tp2.SinglyLinkedList();
    tp2.IP iP1 = null;
    boolean b2 = singlyLinkedList0.remove(iP1);
    boolean b3 = singlyLinkedList0.isEmpty();
    tp2.IP iP8 = new tp2.IP((java.lang.Integer)5, (java.lang.Integer)1, (java.lang.Integer)0, (java.lang.Integer)12);
    boolean b9 = singlyLinkedList0.contains(iP8);
    tp2.SinglyLinkedList singlyLinkedList10 = new tp2.SinglyLinkedList();
    tp2.IP iP15 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i16 = iP15.getThird();
    boolean b17 = singlyLinkedList10.remove(iP15);
    iP15.setSecond((java.lang.Integer)150994944);
    java.lang.Integer i20 = iP15.getFourth();
    java.lang.Integer i21 = iP15.getThird();
    java.lang.Integer i22 = iP15.getFirst();
    boolean b23 = singlyLinkedList0.contains(iP15);
    tp2.SinglyLinkedList singlyLinkedList24 = new tp2.SinglyLinkedList();
    tp2.IP iP29 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i30 = iP29.getFourth();
    singlyLinkedList24.add(iP29);
    java.lang.Integer i32 = iP29.getFirst();
    boolean b33 = singlyLinkedList0.contains(iP29);
    java.lang.Integer i34 = iP29.getThird();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i16 + "' != '" + (-1)+ "'", i16.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i20 + "' != '" + 100+ "'", i20.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i21 + "' != '" + (-1)+ "'", i21.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i22 + "' != '" + (-1)+ "'", i22.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i30 + "' != '" + 100+ "'", i30.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i32 + "' != '" + (-1)+ "'", i32.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i34 + "' != '" + (-1)+ "'", i34.equals((-1)));

  }

  @Test
  public void test283() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test283"); }


    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList0 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP5 = new tp2.IP((java.lang.Integer)150994944, (java.lang.Integer)784, (java.lang.Integer)784, (java.lang.Integer)2);
    java.lang.Integer i6 = iP5.getFourth();
    boolean b7 = strictlySortedSinglyLinkedList0.removeFromIP(iP5);
    tp2.SinglyLinkedList singlyLinkedList8 = new tp2.SinglyLinkedList();
    tp2.IP iP13 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i14 = iP13.getThird();
    boolean b15 = singlyLinkedList8.remove(iP13);
    java.lang.Integer i16 = iP13.getThird();
    boolean b17 = strictlySortedSinglyLinkedList0.removeFromIP(iP13);
    tp2.IPBan iPBan19 = strictlySortedSinglyLinkedList0.get(167772160);
    int i20 = strictlySortedSinglyLinkedList0.getSize();
    tp2.SinglyLinkedList singlyLinkedList21 = new tp2.SinglyLinkedList();
    tp2.IP iP26 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i27 = iP26.getThird();
    boolean b28 = singlyLinkedList21.remove(iP26);
    tp2.IPBan iPBan30 = new tp2.IPBan(iP26, (java.lang.Long)10L);
    java.lang.Long long31 = iPBan30.getExpires();
    java.lang.Long long32 = iPBan30.getExpires();
    iPBan30.setExpires((java.lang.Long)10L);
    boolean b35 = strictlySortedSinglyLinkedList0.add(iPBan30);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList36 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP41 = new tp2.IP((java.lang.Integer)150994944, (java.lang.Integer)11100, (java.lang.Integer)784, (java.lang.Integer)0);
    boolean b42 = strictlySortedSinglyLinkedList36.removeFromIP(iP41);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList43 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP48 = new tp2.IP((java.lang.Integer)150994944, (java.lang.Integer)784, (java.lang.Integer)784, (java.lang.Integer)2);
    java.lang.Integer i49 = iP48.getFourth();
    boolean b50 = strictlySortedSinglyLinkedList43.removeFromIP(iP48);
    tp2.SinglyLinkedList singlyLinkedList51 = new tp2.SinglyLinkedList();
    tp2.IP iP56 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i57 = iP56.getThird();
    boolean b58 = singlyLinkedList51.remove(iP56);
    java.lang.Integer i59 = iP56.getThird();
    boolean b60 = strictlySortedSinglyLinkedList43.removeFromIP(iP56);
    tp2.IPBan iPBan62 = strictlySortedSinglyLinkedList43.get(167772160);
    int i63 = strictlySortedSinglyLinkedList43.getSize();
    tp2.SinglyLinkedList singlyLinkedList64 = new tp2.SinglyLinkedList();
    tp2.IP iP69 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i70 = iP69.getThird();
    boolean b71 = singlyLinkedList64.remove(iP69);
    tp2.IPBan iPBan73 = new tp2.IPBan(iP69, (java.lang.Long)10L);
    java.lang.Long long74 = iPBan73.getExpires();
    java.lang.Long long75 = iPBan73.getExpires();
    iPBan73.setExpires((java.lang.Long)10L);
    boolean b78 = strictlySortedSinglyLinkedList43.add(iPBan73);
    boolean b79 = strictlySortedSinglyLinkedList36.contains(iPBan73);
    boolean b80 = strictlySortedSinglyLinkedList0.add(iPBan73);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i6 + "' != '" + 2+ "'", i6.equals(2));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i14 + "' != '" + (-1)+ "'", i14.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i16 + "' != '" + (-1)+ "'", i16.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iPBan19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i27 + "' != '" + (-1)+ "'", i27.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long31 + "' != '" + 10L+ "'", long31.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long32 + "' != '" + 10L+ "'", long32.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i49 + "' != '" + 2+ "'", i49.equals(2));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b50 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i57 + "' != '" + (-1)+ "'", i57.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b58 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i59 + "' != '" + (-1)+ "'", i59.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b60 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iPBan62);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i63 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i70 + "' != '" + (-1)+ "'", i70.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b71 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long74 + "' != '" + 10L+ "'", long74.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long75 + "' != '" + 10L+ "'", long75.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b78 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b79 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b80 == false);

  }

  @Test
  public void test284() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test284"); }


    tp2.Server server0 = new tp2.Server();
    boolean b1 = server0.bansSorted();
    tp2.IP iP6 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i7 = iP6.getFourth();
    boolean b8 = server0.removeException(iP6);
    boolean b9 = server0.bansOkTime();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList10 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP15 = new tp2.IP((java.lang.Integer)150994944, (java.lang.Integer)784, (java.lang.Integer)784, (java.lang.Integer)2);
    java.lang.Integer i16 = iP15.getFourth();
    boolean b17 = strictlySortedSinglyLinkedList10.removeFromIP(iP15);
    tp2.SinglyLinkedList singlyLinkedList18 = new tp2.SinglyLinkedList();
    tp2.IP iP23 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i24 = iP23.getThird();
    boolean b25 = singlyLinkedList18.remove(iP23);
    java.lang.Integer i26 = iP23.getThird();
    boolean b27 = strictlySortedSinglyLinkedList10.removeFromIP(iP23);
    tp2.IPBan iPBan29 = strictlySortedSinglyLinkedList10.get(469762048);
    tp2.IPBan iPBan31 = strictlySortedSinglyLinkedList10.get(1100100);
    tp2.Server server32 = new tp2.Server();
    tp2.ITime iTime33 = null;
    server32.setTime(iTime33);
    tp2.Server server35 = new tp2.Server();
    boolean b36 = server35.notSharedElements();
    tp2.SinglyLinkedList singlyLinkedList37 = new tp2.SinglyLinkedList();
    tp2.IP iP42 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i43 = iP42.getThird();
    boolean b44 = singlyLinkedList37.remove(iP42);
    boolean b45 = server35.addException(iP42);
    java.lang.Integer i46 = iP42.getFirst();
    tp2.IPBan iPBan48 = new tp2.IPBan(iP42, (java.lang.Long)5L);
    boolean b49 = server32.connect(iP42);
    boolean b50 = strictlySortedSinglyLinkedList10.containsIP(iP42);
    boolean b51 = server0.removeException(iP42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i7 + "' != '" + 100+ "'", i7.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i16 + "' != '" + 2+ "'", i16.equals(2));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i24 + "' != '" + (-1)+ "'", i24.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i26 + "' != '" + (-1)+ "'", i26.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iPBan29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iPBan31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i43 + "' != '" + (-1)+ "'", i43.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i46 + "' != '" + (-1)+ "'", i46.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b49 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b50 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b51 == false);

  }

  @Test
  public void test285() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test285"); }


    tp2.Server server0 = new tp2.Server();
    boolean b1 = server0.exceptionsNotRepeated();
    boolean b2 = server0.bansSorted();
    boolean b3 = server0.notSharedElements();
    boolean b4 = server0.bansSorted();
    server0.update();
    boolean b6 = server0.exceptionsNotRepeated();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);

  }

  @Test
  public void test286() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test286"); }


    int i1 = java.lang.Integer.bitCount(51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 4);

  }

  @Test
  public void test287() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test287"); }


    int i2 = java.lang.Integer.max(524288, (-872415232));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 524288);

  }

  @Test
  public void test288() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test288"); }


    int i2 = java.lang.Integer.max(201326624, 201326592);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 201326624);

  }

  @Test
  public void test289() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test289"); }


    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList0 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP5 = new tp2.IP((java.lang.Integer)150994944, (java.lang.Integer)784, (java.lang.Integer)784, (java.lang.Integer)2);
    java.lang.Integer i6 = iP5.getFourth();
    boolean b7 = strictlySortedSinglyLinkedList0.removeFromIP(iP5);
    tp2.SinglyLinkedList singlyLinkedList8 = new tp2.SinglyLinkedList();
    tp2.IP iP13 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i14 = iP13.getThird();
    boolean b15 = singlyLinkedList8.remove(iP13);
    java.lang.Integer i16 = iP13.getThird();
    boolean b17 = strictlySortedSinglyLinkedList0.removeFromIP(iP13);
    tp2.Server server18 = new tp2.Server();
    boolean b19 = server18.exceptionsNotRepeated();
    boolean b20 = server18.bansSorted();
    boolean b21 = server18.notSharedElements();
    tp2.Server server22 = new tp2.Server();
    boolean b23 = server22.notSharedElements();
    tp2.SinglyLinkedList singlyLinkedList24 = new tp2.SinglyLinkedList();
    tp2.IP iP29 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i30 = iP29.getThird();
    boolean b31 = singlyLinkedList24.remove(iP29);
    boolean b32 = server22.addException(iP29);
    tp2.SinglyLinkedList singlyLinkedList33 = new tp2.SinglyLinkedList();
    tp2.IP iP38 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i39 = iP38.getFourth();
    singlyLinkedList33.add(iP38);
    java.lang.Integer i41 = iP38.getFirst();
    boolean b42 = server22.removeBan(iP38);
    tp2.ITime iTime43 = null;
    server22.setTime(iTime43);
    boolean b45 = server22.notSharedElements();
    tp2.IP iP50 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i51 = iP50.getThird();
    iP50.setFourth((java.lang.Integer)0);
    iP50.setSecond((java.lang.Integer)3);
    boolean b56 = server22.addBan(iP50);
    tp2.SinglyLinkedList singlyLinkedList57 = new tp2.SinglyLinkedList();
    tp2.IP iP62 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i63 = iP62.getThird();
    boolean b64 = singlyLinkedList57.remove(iP62);
    java.lang.Integer i65 = iP62.getThird();
    iP62.setFirst((java.lang.Integer)11100);
    boolean b68 = server22.addBan(iP62);
    boolean b69 = server18.removeException(iP62);
    boolean b70 = strictlySortedSinglyLinkedList0.removeFromIP(iP62);
    tp2.Server server71 = new tp2.Server();
    boolean b72 = server71.exceptionsNotRepeated();
    tp2.IP iP77 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i78 = iP77.getThird();
    iP77.setSecond((java.lang.Integer)10);
    boolean b81 = server71.removeBan(iP77);
    iP77.setFourth((java.lang.Integer)9);
    boolean b84 = strictlySortedSinglyLinkedList0.removeFromIP(iP77);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i6 + "' != '" + 2+ "'", i6.equals(2));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i14 + "' != '" + (-1)+ "'", i14.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i16 + "' != '" + (-1)+ "'", i16.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i30 + "' != '" + (-1)+ "'", i30.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i39 + "' != '" + 100+ "'", i39.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i41 + "' != '" + (-1)+ "'", i41.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i51 + "' != '" + (-1)+ "'", i51.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b56 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i63 + "' != '" + (-1)+ "'", i63.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b64 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i65 + "' != '" + (-1)+ "'", i65.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b68 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b69 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b70 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b72 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i78 + "' != '" + (-1)+ "'", i78.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b81 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b84 == false);

  }

  @Test
  public void test290() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test290"); }


    java.lang.Integer i2 = java.lang.Integer.getInteger("12", 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i2 + "' != '" + 1+ "'", i2.equals(1));

  }

  @Test
  public void test291() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test291"); }


    int i1 = java.lang.Integer.highestOneBit(16384);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 16384);

  }

  @Test
  public void test292() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test292"); }


    int i2 = java.lang.Integer.compare(1073741824, 512);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);

  }

  @Test
  public void test293() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test293"); }


    int i2 = java.lang.Integer.sum((-1), 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == (-1));

  }

  @Test
  public void test294() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test294"); }


    // The following exception was thrown during execution in test generation
    try {
      int i2 = java.lang.Integer.parseInt("167772260", 4);
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

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test295"); }


    int i1 = java.lang.Integer.reverse((-1073741812));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 805306371);

  }

  @Test
  public void test296() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test296"); }


    int i2 = java.lang.Integer.divideUnsigned(100000, 40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 2500);

  }

  @Test
  public void test297() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test297"); }


    java.lang.Integer i1 = java.lang.Integer.getInteger("16384");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);

  }

  @Test
  public void test298() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test298"); }


    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList0 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP5 = new tp2.IP((java.lang.Integer)150994944, (java.lang.Integer)784, (java.lang.Integer)784, (java.lang.Integer)2);
    java.lang.Integer i6 = iP5.getFourth();
    boolean b7 = strictlySortedSinglyLinkedList0.removeFromIP(iP5);
    tp2.SinglyLinkedList singlyLinkedList8 = new tp2.SinglyLinkedList();
    tp2.IP iP13 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i14 = iP13.getThird();
    boolean b15 = singlyLinkedList8.remove(iP13);
    java.lang.Integer i16 = iP13.getThird();
    boolean b17 = strictlySortedSinglyLinkedList0.removeFromIP(iP13);
    tp2.IPBan iPBan19 = strictlySortedSinglyLinkedList0.get(469762048);
    tp2.SinglyLinkedList singlyLinkedList20 = new tp2.SinglyLinkedList();
    tp2.IP iP25 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i26 = iP25.getThird();
    boolean b27 = singlyLinkedList20.remove(iP25);
    tp2.IP iP32 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i33 = iP32.getFirst();
    boolean b34 = singlyLinkedList20.remove(iP32);
    iP32.setFirst((java.lang.Integer)(-2147483648));
    boolean b37 = strictlySortedSinglyLinkedList0.removeFromIP(iP32);
    tp2.IPBan iPBan39 = strictlySortedSinglyLinkedList0.get(100000);
    tp2.SinglyLinkedList singlyLinkedList40 = new tp2.SinglyLinkedList();
    tp2.IP iP45 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i46 = iP45.getThird();
    boolean b47 = singlyLinkedList40.remove(iP45);
    tp2.IPBan iPBan49 = new tp2.IPBan(iP45, (java.lang.Long)10L);
    tp2.IP iP54 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i55 = iP54.getFourth();
    iPBan49.setIp(iP54);
    boolean b57 = strictlySortedSinglyLinkedList0.add(iPBan49);
    int i58 = strictlySortedSinglyLinkedList0.getSize();
    tp2.Server server59 = new tp2.Server();
    boolean b60 = server59.exceptionsNotRepeated();
    boolean b61 = server59.bansNotRepeatedExpirationOrIP();
    tp2.Server server62 = new tp2.Server();
    tp2.IP iP67 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    boolean b68 = server62.removeBan(iP67);
    java.lang.Integer i69 = iP67.getFirst();
    boolean b70 = server59.addException(iP67);
    tp2.IPBan iPBan72 = new tp2.IPBan(iP67, (java.lang.Long)(-1L));
    boolean b73 = strictlySortedSinglyLinkedList0.contains(iPBan72);
    tp2.IPBan iPBan75 = strictlySortedSinglyLinkedList0.get(20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i6 + "' != '" + 2+ "'", i6.equals(2));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i14 + "' != '" + (-1)+ "'", i14.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i16 + "' != '" + (-1)+ "'", i16.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iPBan19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i26 + "' != '" + (-1)+ "'", i26.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i33 + "' != '" + (-1)+ "'", i33.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iPBan39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i46 + "' != '" + (-1)+ "'", i46.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b47 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i55 + "' != '" + 100+ "'", i55.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b57 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i58 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b60 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b61 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b68 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i69 + "' != '" + (-1)+ "'", i69.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b70 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b73 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iPBan75);

  }

  @Test
  public void test299() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test299"); }


    int i1 = java.lang.Integer.reverseBytes(436207616);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 26);

  }

  @Test
  public void test300() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test300"); }


    java.lang.String str1 = java.lang.Integer.toHexString(201326624);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "c000020"+ "'", str1.equals("c000020"));

  }

  @Test
  public void test301() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test301"); }


    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList0 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP5 = new tp2.IP((java.lang.Integer)150994944, (java.lang.Integer)11100, (java.lang.Integer)784, (java.lang.Integer)0);
    boolean b6 = strictlySortedSinglyLinkedList0.removeFromIP(iP5);
    int i7 = strictlySortedSinglyLinkedList0.getSize();
    tp2.Server server8 = new tp2.Server();
    boolean b9 = server8.notSharedElements();
    tp2.SinglyLinkedList singlyLinkedList10 = new tp2.SinglyLinkedList();
    tp2.IP iP15 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i16 = iP15.getThird();
    boolean b17 = singlyLinkedList10.remove(iP15);
    boolean b18 = server8.addException(iP15);
    java.lang.Integer i19 = iP15.getFourth();
    boolean b20 = strictlySortedSinglyLinkedList0.containsIP(iP15);
    int i21 = strictlySortedSinglyLinkedList0.getSize();
    tp2.IPBan iPBan23 = strictlySortedSinglyLinkedList0.get((-1073741812));
    tp2.IPBan iPBan25 = strictlySortedSinglyLinkedList0.get(27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i16 + "' != '" + (-1)+ "'", i16.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i19 + "' != '" + 100+ "'", i19.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iPBan23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iPBan25);

  }

  @Test
  public void test302() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test302"); }


    tp2.Server server0 = new tp2.Server();
    boolean b1 = server0.notSharedElements();
    tp2.SinglyLinkedList singlyLinkedList2 = new tp2.SinglyLinkedList();
    tp2.IP iP7 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i8 = iP7.getThird();
    boolean b9 = singlyLinkedList2.remove(iP7);
    boolean b10 = server0.addException(iP7);
    tp2.SinglyLinkedList singlyLinkedList11 = new tp2.SinglyLinkedList();
    tp2.IP iP16 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i17 = iP16.getFourth();
    singlyLinkedList11.add(iP16);
    java.lang.Integer i19 = iP16.getFirst();
    boolean b20 = server0.removeBan(iP16);
    tp2.ITime iTime21 = null;
    server0.setTime(iTime21);
    boolean b23 = server0.bansSorted();
    boolean b24 = server0.bansNotRepeatedExpirationOrIP();
    tp2.SinglyLinkedList singlyLinkedList25 = new tp2.SinglyLinkedList();
    tp2.IP iP30 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i31 = iP30.getThird();
    boolean b32 = singlyLinkedList25.remove(iP30);
    tp2.IPBan iPBan34 = new tp2.IPBan(iP30, (java.lang.Long)10L);
    java.lang.Long long35 = iPBan34.getExpires();
    java.lang.Long long36 = iPBan34.getExpires();
    tp2.SinglyLinkedList singlyLinkedList37 = new tp2.SinglyLinkedList();
    tp2.IP iP42 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i43 = iP42.getThird();
    boolean b44 = singlyLinkedList37.remove(iP42);
    tp2.IPBan iPBan46 = new tp2.IPBan(iP42, (java.lang.Long)10L);
    tp2.IP iP51 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i52 = iP51.getFourth();
    iPBan46.setIp(iP51);
    iPBan34.setIp(iP51);
    boolean b55 = server0.addException(iP51);
    tp2.IP iP56 = null;
    boolean b57 = server0.addBan(iP56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i8 + "' != '" + (-1)+ "'", i8.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i17 + "' != '" + 100+ "'", i17.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i19 + "' != '" + (-1)+ "'", i19.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i31 + "' != '" + (-1)+ "'", i31.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long35 + "' != '" + 10L+ "'", long35.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long36 + "' != '" + 10L+ "'", long36.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i43 + "' != '" + (-1)+ "'", i43.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i52 + "' != '" + 100+ "'", i52.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b55 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b57 == false);

  }

  @Test
  public void test303() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test303"); }


    tp2.IP iP4 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i5 = iP4.getFirst();
    java.lang.Integer i6 = iP4.getSecond();
    tp2.IPBan iPBan8 = new tp2.IPBan(iP4, (java.lang.Long)1L);
    tp2.IP iP9 = iPBan8.getIp();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i5 + "' != '" + (-1)+ "'", i5.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i6 + "' != '" + (-1)+ "'", i6.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP9);

  }

  @Test
  public void test304() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test304"); }


    tp2.Server server0 = new tp2.Server();
    boolean b1 = server0.exceptionsNotRepeated();
    boolean b2 = server0.bansSorted();
    boolean b3 = server0.notSharedElements();
    boolean b4 = server0.bansSorted();
    server0.update();
    tp2.IP iP10 = new tp2.IP((java.lang.Integer)11100, (java.lang.Integer)40, (java.lang.Integer)28, (java.lang.Integer)727449600);
    boolean b11 = server0.addException(iP10);
    server0.update();
    tp2.Server server13 = new tp2.Server();
    tp2.IP iP18 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    boolean b19 = server13.removeBan(iP18);
    tp2.IP iP24 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i25 = iP24.getThird();
    iP24.setFourth((java.lang.Integer)0);
    iP24.setSecond((java.lang.Integer)3);
    iP24.setFourth((java.lang.Integer)12);
    boolean b32 = server13.addBan(iP24);
    boolean b33 = server0.addException(iP24);
    boolean b34 = server0.bansNotRepeatedExpirationOrIP();
    tp2.ITime iTime35 = null;
    server0.setTime(iTime35);
    tp2.ITime iTime37 = null;
    server0.setTime(iTime37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i25 + "' != '" + (-1)+ "'", i25.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == true);

  }

  @Test
  public void test305() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test305"); }


    int i2 = java.lang.Integer.min(19, 640);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 19);

  }

  @Test
  public void test306() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test306"); }


    java.lang.Integer i1 = java.lang.Integer.getInteger("17777777777");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);

  }

  @Test
  public void test307() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test307"); }


    int i2 = java.lang.Integer.max(5, 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 5);

  }

  @Test
  public void test308() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test308"); }


    tp2.SinglyLinkedList singlyLinkedList0 = new tp2.SinglyLinkedList();
    tp2.IP iP5 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i6 = iP5.getThird();
    boolean b7 = singlyLinkedList0.remove(iP5);
    tp2.IPBan iPBan9 = new tp2.IPBan(iP5, (java.lang.Long)10L);
    tp2.IP iP14 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i15 = iP14.getFourth();
    iPBan9.setIp(iP14);
    java.lang.Long long17 = iPBan9.getExpires();
    java.lang.Long long18 = iPBan9.getExpires();
    tp2.IP iP23 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i24 = iP23.getFirst();
    java.lang.Integer i25 = iP23.getSecond();
    iP23.setFirst((java.lang.Integer)201326592);
    iPBan9.setIp(iP23);
    java.lang.Long long29 = iPBan9.getExpires();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i6 + "' != '" + (-1)+ "'", i6.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i15 + "' != '" + 100+ "'", i15.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long17 + "' != '" + 10L+ "'", long17.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long18 + "' != '" + 10L+ "'", long18.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i24 + "' != '" + (-1)+ "'", i24.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i25 + "' != '" + (-1)+ "'", i25.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long29 + "' != '" + 10L+ "'", long29.equals(10L));

  }

  @Test
  public void test309() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test309"); }


    int i2 = java.lang.Integer.parseUnsignedInt("a000000", 27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == (-420762406));

  }

  @Test
  public void test310() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test310"); }


    tp2.Server server0 = new tp2.Server();
    boolean b1 = server0.exceptionsNotRepeated();
    boolean b2 = server0.bansSorted();
    boolean b3 = server0.notSharedElements();
    tp2.ITime iTime4 = null;
    server0.setTime(iTime4);
    boolean b6 = server0.bansNotRepeatedExpirationOrIP();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);

  }

  @Test
  public void test311() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test311"); }


    java.lang.Integer i2 = java.lang.Integer.getInteger("1400000000", (java.lang.Integer)637534288);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i2 + "' != '" + 637534288+ "'", i2.equals(637534288));

  }

  @Test
  public void test312() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test312"); }


    int i2 = java.lang.Integer.sum(268435456, 16384);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 268451840);

  }

  @Test
  public void test313() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test313"); }


    int i1 = java.lang.Integer.bitCount(201326624);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 3);

  }

  @Test
  public void test314() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test314"); }


    int i1 = java.lang.Integer.highestOneBit(33554432);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 33554432);

  }

  @Test
  public void test315() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test315"); }


    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList0 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP5 = new tp2.IP((java.lang.Integer)150994944, (java.lang.Integer)784, (java.lang.Integer)784, (java.lang.Integer)2);
    java.lang.Integer i6 = iP5.getFourth();
    boolean b7 = strictlySortedSinglyLinkedList0.removeFromIP(iP5);
    tp2.SinglyLinkedList singlyLinkedList8 = new tp2.SinglyLinkedList();
    tp2.IP iP13 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i14 = iP13.getThird();
    boolean b15 = singlyLinkedList8.remove(iP13);
    java.lang.Integer i16 = iP13.getThird();
    boolean b17 = strictlySortedSinglyLinkedList0.removeFromIP(iP13);
    tp2.IPBan iPBan19 = strictlySortedSinglyLinkedList0.get(469762048);
    tp2.SinglyLinkedList singlyLinkedList20 = new tp2.SinglyLinkedList();
    tp2.IP iP25 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i26 = iP25.getThird();
    boolean b27 = singlyLinkedList20.remove(iP25);
    tp2.IP iP32 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i33 = iP32.getFirst();
    boolean b34 = singlyLinkedList20.remove(iP32);
    iP32.setFirst((java.lang.Integer)(-2147483648));
    boolean b37 = strictlySortedSinglyLinkedList0.removeFromIP(iP32);
    tp2.Server server38 = new tp2.Server();
    boolean b39 = server38.exceptionsNotRepeated();
    boolean b40 = server38.bansSorted();
    boolean b41 = server38.notSharedElements();
    tp2.Server server42 = new tp2.Server();
    boolean b43 = server42.notSharedElements();
    tp2.SinglyLinkedList singlyLinkedList44 = new tp2.SinglyLinkedList();
    tp2.IP iP49 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i50 = iP49.getThird();
    boolean b51 = singlyLinkedList44.remove(iP49);
    boolean b52 = server42.addException(iP49);
    tp2.SinglyLinkedList singlyLinkedList53 = new tp2.SinglyLinkedList();
    tp2.IP iP58 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i59 = iP58.getFourth();
    singlyLinkedList53.add(iP58);
    java.lang.Integer i61 = iP58.getFirst();
    boolean b62 = server42.removeBan(iP58);
    tp2.ITime iTime63 = null;
    server42.setTime(iTime63);
    boolean b65 = server42.notSharedElements();
    tp2.IP iP70 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i71 = iP70.getThird();
    iP70.setFourth((java.lang.Integer)0);
    iP70.setSecond((java.lang.Integer)3);
    boolean b76 = server42.addBan(iP70);
    tp2.SinglyLinkedList singlyLinkedList77 = new tp2.SinglyLinkedList();
    tp2.IP iP82 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i83 = iP82.getThird();
    boolean b84 = singlyLinkedList77.remove(iP82);
    java.lang.Integer i85 = iP82.getThird();
    iP82.setFirst((java.lang.Integer)11100);
    boolean b88 = server42.addBan(iP82);
    boolean b89 = server38.removeException(iP82);
    boolean b90 = strictlySortedSinglyLinkedList0.removeFromIP(iP82);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i6 + "' != '" + 2+ "'", i6.equals(2));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i14 + "' != '" + (-1)+ "'", i14.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i16 + "' != '" + (-1)+ "'", i16.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iPBan19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i26 + "' != '" + (-1)+ "'", i26.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i33 + "' != '" + (-1)+ "'", i33.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b43 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i50 + "' != '" + (-1)+ "'", i50.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b51 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b52 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i59 + "' != '" + 100+ "'", i59.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i61 + "' != '" + (-1)+ "'", i61.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b62 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b65 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i71 + "' != '" + (-1)+ "'", i71.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b76 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i83 + "' != '" + (-1)+ "'", i83.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b84 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i85 + "' != '" + (-1)+ "'", i85.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b88 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b89 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b90 == false);

  }

  @Test
  public void test316() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test316"); }


    int i1 = java.lang.Integer.lowestOneBit(1100100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 4);

  }

  @Test
  public void test317() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test317"); }


    java.lang.String str1 = java.lang.Integer.toHexString(4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "4"+ "'", str1.equals("4"));

  }

  @Test
  public void test318() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test318"); }


    int i1 = java.lang.Integer.numberOfLeadingZeros(11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 28);

  }

  @Test
  public void test319() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test319"); }


    int i2 = java.lang.Integer.min(729888, 436219526);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 729888);

  }

  @Test
  public void test320() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test320"); }


    java.lang.String str1 = java.lang.Integer.toUnsignedString(23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "23"+ "'", str1.equals("23"));

  }

  @Test
  public void test321() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test321"); }


    java.lang.String str1 = java.lang.Integer.toBinaryString(2809);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "101011111001"+ "'", str1.equals("101011111001"));

  }

  @Test
  public void test322() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test322"); }


    tp2.SinglyLinkedList singlyLinkedList0 = new tp2.SinglyLinkedList();
    tp2.IP iP5 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i6 = iP5.getFourth();
    singlyLinkedList0.add(iP5);
    java.lang.Integer i8 = null;
    iP5.setFourth(i8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i6 + "' != '" + 100+ "'", i6.equals(100));

  }

  @Test
  public void test323() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test323"); }


    int i2 = java.lang.Integer.rotateRight(436207642, 436207642);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == (-2147481978));

  }

  @Test
  public void test324() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test324"); }


    int i1 = java.lang.Integer.reverse(1610612786);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 1275068422);

  }

  @Test
  public void test325() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test325"); }


    tp2.SinglyLinkedList singlyLinkedList0 = new tp2.SinglyLinkedList();
    tp2.IP iP5 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i6 = iP5.getThird();
    boolean b7 = singlyLinkedList0.remove(iP5);
    boolean b8 = singlyLinkedList0.isEmpty();
    int i9 = singlyLinkedList0.getSize();
    tp2.IP iP14 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i15 = iP14.getThird();
    iP14.setFourth((java.lang.Integer)0);
    boolean b18 = singlyLinkedList0.contains(iP14);
    boolean b19 = singlyLinkedList0.isEmpty();
    tp2.IP iP24 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i25 = iP24.getFirst();
    java.lang.Integer i26 = iP24.getFirst();
    singlyLinkedList0.add(iP24);
    tp2.SinglyLinkedList singlyLinkedList28 = new tp2.SinglyLinkedList();
    tp2.IP iP33 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i34 = iP33.getThird();
    boolean b35 = singlyLinkedList28.remove(iP33);
    tp2.Server server36 = new tp2.Server();
    tp2.IP iP41 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    boolean b42 = server36.removeBan(iP41);
    boolean b43 = singlyLinkedList28.contains(iP41);
    singlyLinkedList0.add(iP41);
    tp2.IP iP49 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i50 = iP49.getThird();
    iP49.setFourth((java.lang.Integer)0);
    iP49.setSecond((java.lang.Integer)3);
    iP49.setFourth((java.lang.Integer)12);
    singlyLinkedList0.add(iP49);
    tp2.SinglyLinkedList singlyLinkedList58 = new tp2.SinglyLinkedList();
    tp2.IP iP63 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i64 = iP63.getThird();
    boolean b65 = singlyLinkedList58.remove(iP63);
    tp2.IPBan iPBan67 = new tp2.IPBan(iP63, (java.lang.Long)10L);
    tp2.IP iP72 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i73 = iP72.getFourth();
    iPBan67.setIp(iP72);
    tp2.IPBan iPBan76 = new tp2.IPBan(iP72, (java.lang.Long)10L);
    iP72.setThird((java.lang.Integer)(-129));
    iP72.setFourth((java.lang.Integer)5120);
    singlyLinkedList0.add(iP72);
    boolean b82 = singlyLinkedList0.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i6 + "' != '" + (-1)+ "'", i6.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i15 + "' != '" + (-1)+ "'", i15.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i25 + "' != '" + (-1)+ "'", i25.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i26 + "' != '" + (-1)+ "'", i26.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i34 + "' != '" + (-1)+ "'", i34.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b43 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i50 + "' != '" + (-1)+ "'", i50.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i64 + "' != '" + (-1)+ "'", i64.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b65 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i73 + "' != '" + 100+ "'", i73.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b82 == false);

  }

  @Test
  public void test326() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test326"); }


    int i1 = java.lang.Integer.parseUnsignedInt("469762048");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 469762048);

  }

  @Test
  public void test327() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test327"); }


    int i1 = java.lang.Integer.numberOfTrailingZeros(16384);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 14);

  }

  @Test
  public void test328() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test328"); }


    tp2.Server server0 = new tp2.Server();
    boolean b1 = server0.notSharedElements();
    tp2.SinglyLinkedList singlyLinkedList2 = new tp2.SinglyLinkedList();
    tp2.IP iP7 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i8 = iP7.getThird();
    boolean b9 = singlyLinkedList2.remove(iP7);
    boolean b10 = server0.addException(iP7);
    tp2.IP iP15 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i16 = iP15.getFirst();
    java.lang.Integer i17 = iP15.getFourth();
    tp2.IPBan iPBan19 = new tp2.IPBan(iP15, (java.lang.Long)100L);
    boolean b20 = server0.addException(iP15);
    tp2.SinglyLinkedList singlyLinkedList21 = new tp2.SinglyLinkedList();
    tp2.IP iP26 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i27 = iP26.getThird();
    boolean b28 = singlyLinkedList21.remove(iP26);
    tp2.IPBan iPBan30 = new tp2.IPBan(iP26, (java.lang.Long)10L);
    tp2.IP iP35 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i36 = iP35.getFourth();
    iPBan30.setIp(iP35);
    java.lang.Long long38 = iPBan30.getExpires();
    java.lang.Long long39 = iPBan30.getExpires();
    tp2.IP iP44 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i45 = iP44.getFirst();
    java.lang.Integer i46 = iP44.getSecond();
    iP44.setFirst((java.lang.Integer)201326592);
    iPBan30.setIp(iP44);
    tp2.SinglyLinkedList singlyLinkedList50 = new tp2.SinglyLinkedList();
    tp2.Server server51 = new tp2.Server();
    boolean b52 = server51.exceptionsNotRepeated();
    tp2.IP iP57 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i58 = iP57.getThird();
    iP57.setSecond((java.lang.Integer)10);
    boolean b61 = server51.removeBan(iP57);
    boolean b62 = singlyLinkedList50.remove(iP57);
    tp2.SinglyLinkedList singlyLinkedList63 = new tp2.SinglyLinkedList();
    tp2.IP iP68 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i69 = iP68.getThird();
    boolean b70 = singlyLinkedList63.remove(iP68);
    tp2.Server server71 = new tp2.Server();
    tp2.IP iP76 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    boolean b77 = server71.removeBan(iP76);
    boolean b78 = singlyLinkedList63.contains(iP76);
    singlyLinkedList50.add(iP76);
    iPBan30.setIp(iP76);
    iP76.setSecond((java.lang.Integer)11100);
    boolean b83 = server0.removeBan(iP76);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i8 + "' != '" + (-1)+ "'", i8.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i16 + "' != '" + (-1)+ "'", i16.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i17 + "' != '" + 100+ "'", i17.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i27 + "' != '" + (-1)+ "'", i27.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i36 + "' != '" + 100+ "'", i36.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long38 + "' != '" + 10L+ "'", long38.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long39 + "' != '" + 10L+ "'", long39.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i45 + "' != '" + (-1)+ "'", i45.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i46 + "' != '" + (-1)+ "'", i46.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b52 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i58 + "' != '" + (-1)+ "'", i58.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b61 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b62 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i69 + "' != '" + (-1)+ "'", i69.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b70 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b77 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b78 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b83 == false);

  }

  @Test
  public void test329() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test329"); }


    tp2.SinglyLinkedList singlyLinkedList0 = new tp2.SinglyLinkedList();
    boolean b1 = singlyLinkedList0.isEmpty();
    tp2.SinglyLinkedList singlyLinkedList2 = new tp2.SinglyLinkedList();
    tp2.IP iP3 = null;
    boolean b4 = singlyLinkedList2.remove(iP3);
    boolean b5 = singlyLinkedList2.isEmpty();
    tp2.IP iP10 = new tp2.IP((java.lang.Integer)5, (java.lang.Integer)1, (java.lang.Integer)0, (java.lang.Integer)12);
    boolean b11 = singlyLinkedList2.contains(iP10);
    tp2.SinglyLinkedList singlyLinkedList12 = new tp2.SinglyLinkedList();
    tp2.IP iP17 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i18 = iP17.getThird();
    boolean b19 = singlyLinkedList12.remove(iP17);
    iP17.setSecond((java.lang.Integer)150994944);
    java.lang.Integer i22 = iP17.getFourth();
    java.lang.Integer i23 = iP17.getThird();
    java.lang.Integer i24 = iP17.getFirst();
    boolean b25 = singlyLinkedList2.contains(iP17);
    singlyLinkedList0.add(iP17);
    tp2.Server server27 = new tp2.Server();
    boolean b28 = server27.notSharedElements();
    tp2.SinglyLinkedList singlyLinkedList29 = new tp2.SinglyLinkedList();
    tp2.IP iP34 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i35 = iP34.getThird();
    boolean b36 = singlyLinkedList29.remove(iP34);
    boolean b37 = server27.addException(iP34);
    java.lang.Integer i38 = iP34.getFirst();
    tp2.IPBan iPBan40 = new tp2.IPBan(iP34, (java.lang.Long)5L);
    tp2.IP iP41 = iPBan40.getIp();
    tp2.IP iP42 = iPBan40.getIp();
    java.lang.Integer i43 = null;
    iP42.setFourth(i43);
    boolean b45 = singlyLinkedList0.remove(iP42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i18 + "' != '" + (-1)+ "'", i18.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i22 + "' != '" + 100+ "'", i22.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i23 + "' != '" + (-1)+ "'", i23.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i24 + "' != '" + (-1)+ "'", i24.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i35 + "' != '" + (-1)+ "'", i35.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i38 + "' != '" + (-1)+ "'", i38.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == false);

  }

  @Test
  public void test330() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test330"); }


    tp2.SinglyLinkedList singlyLinkedList0 = new tp2.SinglyLinkedList();
    tp2.IP iP1 = null;
    boolean b2 = singlyLinkedList0.remove(iP1);
    boolean b3 = singlyLinkedList0.isEmpty();
    tp2.IP iP8 = new tp2.IP((java.lang.Integer)5, (java.lang.Integer)1, (java.lang.Integer)0, (java.lang.Integer)12);
    boolean b9 = singlyLinkedList0.contains(iP8);
    tp2.IP iP11 = singlyLinkedList0.get(2621440);
    int i12 = singlyLinkedList0.getSize();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);

  }

  @Test
  public void test331() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test331"); }


    java.lang.String str1 = java.lang.Integer.toOctalString(12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "14"+ "'", str1.equals("14"));

  }

  @Test
  public void test332() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test332"); }


    int i1 = java.lang.Integer.bitCount(200000000);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 12);

  }

  @Test
  public void test333() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test333"); }


    int i1 = java.lang.Integer.signum(201326624);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 1);

  }

  @Test
  public void test334() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test334"); }


    int i2 = java.lang.Integer.compareUnsigned(28, 23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);

  }

  @Test
  public void test335() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test335"); }


    java.lang.Integer i1 = new java.lang.Integer(1073741824);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 1073741824+ "'", i1.equals(1073741824));

  }

  @Test
  public void test336() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test336"); }


    tp2.Server server0 = new tp2.Server();
    boolean b1 = server0.notSharedElements();
    tp2.SinglyLinkedList singlyLinkedList2 = new tp2.SinglyLinkedList();
    tp2.IP iP7 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i8 = iP7.getThird();
    boolean b9 = singlyLinkedList2.remove(iP7);
    boolean b10 = server0.addException(iP7);
    tp2.IP iP15 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i16 = iP15.getFirst();
    java.lang.Integer i17 = iP15.getFourth();
    tp2.IPBan iPBan19 = new tp2.IPBan(iP15, (java.lang.Long)100L);
    boolean b20 = server0.addException(iP15);
    java.lang.Integer i21 = iP15.getThird();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i8 + "' != '" + (-1)+ "'", i8.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i16 + "' != '" + (-1)+ "'", i16.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i17 + "' != '" + 100+ "'", i17.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i21 + "' != '" + (-1)+ "'", i21.equals((-1)));

  }

  @Test
  public void test337() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test337"); }


    tp2.SinglyLinkedList singlyLinkedList0 = new tp2.SinglyLinkedList();
    tp2.IP iP5 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i6 = iP5.getThird();
    boolean b7 = singlyLinkedList0.remove(iP5);
    tp2.IPBan iPBan9 = new tp2.IPBan(iP5, (java.lang.Long)10L);
    java.lang.Long long10 = iPBan9.getExpires();
    java.lang.Long long11 = iPBan9.getExpires();
    tp2.SinglyLinkedList singlyLinkedList12 = new tp2.SinglyLinkedList();
    tp2.IP iP17 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i18 = iP17.getThird();
    boolean b19 = singlyLinkedList12.remove(iP17);
    tp2.IPBan iPBan21 = new tp2.IPBan(iP17, (java.lang.Long)10L);
    tp2.IP iP26 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i27 = iP26.getFourth();
    iPBan21.setIp(iP26);
    iPBan9.setIp(iP26);
    iPBan9.setExpires((java.lang.Long)5L);
    tp2.Server server32 = new tp2.Server();
    boolean b33 = server32.notSharedElements();
    tp2.SinglyLinkedList singlyLinkedList34 = new tp2.SinglyLinkedList();
    tp2.IP iP39 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i40 = iP39.getThird();
    boolean b41 = singlyLinkedList34.remove(iP39);
    boolean b42 = server32.addException(iP39);
    tp2.SinglyLinkedList singlyLinkedList43 = new tp2.SinglyLinkedList();
    tp2.IP iP48 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i49 = iP48.getFourth();
    singlyLinkedList43.add(iP48);
    java.lang.Integer i51 = iP48.getFirst();
    boolean b52 = server32.removeBan(iP48);
    tp2.ITime iTime53 = null;
    server32.setTime(iTime53);
    boolean b55 = server32.notSharedElements();
    tp2.IP iP60 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i61 = iP60.getThird();
    iP60.setFourth((java.lang.Integer)0);
    iP60.setSecond((java.lang.Integer)3);
    boolean b66 = server32.addBan(iP60);
    tp2.SinglyLinkedList singlyLinkedList67 = new tp2.SinglyLinkedList();
    tp2.IP iP72 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i73 = iP72.getThird();
    boolean b74 = singlyLinkedList67.remove(iP72);
    java.lang.Integer i75 = iP72.getThird();
    iP72.setFirst((java.lang.Integer)11100);
    boolean b78 = server32.addBan(iP72);
    iPBan9.setIp(iP72);
    iPBan9.setExpires((java.lang.Long)144L);
    iPBan9.setExpires((java.lang.Long)25L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i6 + "' != '" + (-1)+ "'", i6.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long10 + "' != '" + 10L+ "'", long10.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long11 + "' != '" + 10L+ "'", long11.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i18 + "' != '" + (-1)+ "'", i18.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i27 + "' != '" + 100+ "'", i27.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i40 + "' != '" + (-1)+ "'", i40.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i49 + "' != '" + 100+ "'", i49.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i51 + "' != '" + (-1)+ "'", i51.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b52 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b55 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i61 + "' != '" + (-1)+ "'", i61.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b66 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i73 + "' != '" + (-1)+ "'", i73.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b74 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i75 + "' != '" + (-1)+ "'", i75.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b78 == true);

  }

  @Test
  public void test338() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test338"); }


    int i1 = java.lang.Integer.parseUnsignedInt("167772260");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 167772260);

  }

  @Test
  public void test339() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test339"); }


    tp2.SinglyLinkedList singlyLinkedList0 = new tp2.SinglyLinkedList();
    tp2.IP iP5 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i6 = iP5.getThird();
    boolean b7 = singlyLinkedList0.remove(iP5);
    tp2.IPBan iPBan9 = new tp2.IPBan(iP5, (java.lang.Long)10L);
    iPBan9.setExpires((java.lang.Long)4L);
    tp2.Server server12 = new tp2.Server();
    boolean b13 = server12.notSharedElements();
    tp2.SinglyLinkedList singlyLinkedList14 = new tp2.SinglyLinkedList();
    tp2.IP iP19 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i20 = iP19.getThird();
    boolean b21 = singlyLinkedList14.remove(iP19);
    boolean b22 = server12.addException(iP19);
    tp2.SinglyLinkedList singlyLinkedList23 = new tp2.SinglyLinkedList();
    tp2.IP iP28 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i29 = iP28.getFourth();
    singlyLinkedList23.add(iP28);
    java.lang.Integer i31 = iP28.getFirst();
    boolean b32 = server12.removeBan(iP28);
    iPBan9.setIp(iP28);
    iP28.setThird((java.lang.Integer)146800640);
    tp2.IPBan iPBan37 = new tp2.IPBan(iP28, (java.lang.Long)100L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i6 + "' != '" + (-1)+ "'", i6.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i20 + "' != '" + (-1)+ "'", i20.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i29 + "' != '" + 100+ "'", i29.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i31 + "' != '" + (-1)+ "'", i31.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);

  }

  @Test
  public void test340() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test340"); }


    java.lang.String str1 = java.lang.Integer.toBinaryString(640);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "1010000000"+ "'", str1.equals("1010000000"));

  }

  @Test
  public void test341() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test341"); }


    // The following exception was thrown during execution in test generation
    try {
      int i2 = java.lang.Integer.parseInt("hi!", 26);
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test342() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test342"); }


    java.lang.String str2 = java.lang.Integer.toUnsignedString((-2), 201326624);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4294967294"+ "'", str2.equals("4294967294"));

  }

  @Test
  public void test343() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test343"); }


    int i1 = java.lang.Integer.bitCount((-1601830656));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 6);

  }

  @Test
  public void test344() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test344"); }


    int i2 = java.lang.Integer.sum((-2147479552), 88770);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == (-2147390782));

  }

  @Test
  public void test345() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test345"); }


    tp2.SinglyLinkedList singlyLinkedList0 = new tp2.SinglyLinkedList();
    tp2.IP iP1 = null;
    boolean b2 = singlyLinkedList0.remove(iP1);
    boolean b3 = singlyLinkedList0.isEmpty();
    tp2.IP iP8 = new tp2.IP((java.lang.Integer)5, (java.lang.Integer)1, (java.lang.Integer)0, (java.lang.Integer)12);
    boolean b9 = singlyLinkedList0.contains(iP8);
    tp2.SinglyLinkedList singlyLinkedList10 = new tp2.SinglyLinkedList();
    tp2.IP iP15 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i16 = iP15.getThird();
    boolean b17 = singlyLinkedList10.remove(iP15);
    iP15.setSecond((java.lang.Integer)150994944);
    java.lang.Integer i20 = iP15.getFourth();
    java.lang.Integer i21 = iP15.getThird();
    java.lang.Integer i22 = iP15.getFirst();
    boolean b23 = singlyLinkedList0.contains(iP15);
    tp2.SinglyLinkedList singlyLinkedList24 = new tp2.SinglyLinkedList();
    tp2.IP iP29 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i30 = iP29.getFourth();
    singlyLinkedList24.add(iP29);
    java.lang.Integer i32 = iP29.getFirst();
    boolean b33 = singlyLinkedList0.remove(iP29);
    tp2.SinglyLinkedList singlyLinkedList34 = new tp2.SinglyLinkedList();
    tp2.IP iP39 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i40 = iP39.getThird();
    boolean b41 = singlyLinkedList34.remove(iP39);
    tp2.IPBan iPBan43 = new tp2.IPBan(iP39, (java.lang.Long)10L);
    tp2.IP iP48 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i49 = iP48.getFourth();
    iPBan43.setIp(iP48);
    java.lang.Long long51 = iPBan43.getExpires();
    java.lang.Long long52 = iPBan43.getExpires();
    tp2.Server server53 = new tp2.Server();
    boolean b54 = server53.exceptionsNotRepeated();
    tp2.IP iP59 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i60 = iP59.getThird();
    iP59.setSecond((java.lang.Integer)10);
    boolean b63 = server53.removeBan(iP59);
    java.lang.Integer i64 = iP59.getFirst();
    iPBan43.setIp(iP59);
    iP59.setFourth((java.lang.Integer)11884);
    singlyLinkedList0.add(iP59);
    iP59.setFirst((java.lang.Integer)1073741844);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i16 + "' != '" + (-1)+ "'", i16.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i20 + "' != '" + 100+ "'", i20.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i21 + "' != '" + (-1)+ "'", i21.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i22 + "' != '" + (-1)+ "'", i22.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i30 + "' != '" + 100+ "'", i30.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i32 + "' != '" + (-1)+ "'", i32.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i40 + "' != '" + (-1)+ "'", i40.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i49 + "' != '" + 100+ "'", i49.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long51 + "' != '" + 10L+ "'", long51.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long52 + "' != '" + 10L+ "'", long52.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b54 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i60 + "' != '" + (-1)+ "'", i60.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b63 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i64 + "' != '" + (-1)+ "'", i64.equals((-1)));

  }

  @Test
  public void test346() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test346"); }


    java.lang.String str2 = java.lang.Integer.toUnsignedString(807927808, 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "807927808"+ "'", str2.equals("807927808"));

  }

  @Test
  public void test347() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test347"); }


    java.lang.String str1 = java.lang.Integer.toHexString(201326784);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "c0000c0"+ "'", str1.equals("c0000c0"));

  }

  @Test
  public void test348() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test348"); }


    tp2.Server server0 = new tp2.Server();
    tp2.IP iP5 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    boolean b6 = server0.removeBan(iP5);
    tp2.IP iP11 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i12 = iP11.getThird();
    iP11.setFourth((java.lang.Integer)0);
    iP11.setSecond((java.lang.Integer)3);
    iP11.setFourth((java.lang.Integer)12);
    boolean b19 = server0.addBan(iP11);
    server0.update();
    boolean b21 = server0.bansOkTime();
    boolean b22 = server0.notSharedElements();
    tp2.SinglyLinkedList singlyLinkedList23 = new tp2.SinglyLinkedList();
    tp2.IP iP24 = null;
    boolean b25 = singlyLinkedList23.remove(iP24);
    boolean b26 = singlyLinkedList23.isEmpty();
    tp2.IP iP31 = new tp2.IP((java.lang.Integer)5, (java.lang.Integer)1, (java.lang.Integer)0, (java.lang.Integer)12);
    boolean b32 = singlyLinkedList23.contains(iP31);
    tp2.SinglyLinkedList singlyLinkedList33 = new tp2.SinglyLinkedList();
    tp2.IP iP38 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i39 = iP38.getThird();
    boolean b40 = singlyLinkedList33.remove(iP38);
    iP38.setSecond((java.lang.Integer)150994944);
    java.lang.Integer i43 = iP38.getFourth();
    java.lang.Integer i44 = iP38.getThird();
    java.lang.Integer i45 = iP38.getFirst();
    boolean b46 = singlyLinkedList23.contains(iP38);
    tp2.SinglyLinkedList singlyLinkedList47 = new tp2.SinglyLinkedList();
    tp2.IP iP52 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i53 = iP52.getThird();
    boolean b54 = singlyLinkedList47.remove(iP52);
    java.lang.Integer i55 = iP52.getThird();
    java.lang.Integer i56 = iP52.getSecond();
    boolean b57 = singlyLinkedList23.contains(iP52);
    boolean b58 = server0.addBan(iP52);
    java.lang.Integer i59 = iP52.getThird();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i12 + "' != '" + (-1)+ "'", i12.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i39 + "' != '" + (-1)+ "'", i39.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i43 + "' != '" + 100+ "'", i43.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i44 + "' != '" + (-1)+ "'", i44.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i45 + "' != '" + (-1)+ "'", i45.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b46 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i53 + "' != '" + (-1)+ "'", i53.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b54 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i55 + "' != '" + (-1)+ "'", i55.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i56 + "' != '" + (-1)+ "'", i56.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b57 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b58 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i59 + "' != '" + (-1)+ "'", i59.equals((-1)));

  }

  @Test
  public void test349() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test349"); }


    tp2.IP iP0 = null;
    tp2.IPBan iPBan2 = new tp2.IPBan(iP0, (java.lang.Long)10L);

  }

  @Test
  public void test350() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test350"); }


    int i2 = java.lang.Integer.remainderUnsigned(200000000, 5120);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 2560);

  }

  @Test
  public void test351() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test351"); }


    int i2 = java.lang.Integer.min(8192, (-1073741824));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == (-1073741824));

  }

  @Test
  public void test352() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test352"); }


    int i1 = java.lang.Integer.numberOfLeadingZeros(805306371);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 2);

  }

  @Test
  public void test353() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test353"); }


    int i1 = java.lang.Integer.numberOfLeadingZeros(11884);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 18);

  }

  @Test
  public void test354() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test354"); }


    // The following exception was thrown during execution in test generation
    try {
      int i2 = java.lang.Integer.parseUnsignedInt("88770", 100);
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

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test355"); }


    tp2.IP iP4 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i5 = iP4.getThird();
    iP4.setFourth((java.lang.Integer)0);
    iP4.setSecond((java.lang.Integer)167772160);
    iP4.setFourth((java.lang.Integer)(-2147483648));
    java.lang.Integer i12 = iP4.getFourth();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i5 + "' != '" + (-1)+ "'", i5.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i12 + "' != '" + (-2147483648)+ "'", i12.equals((-2147483648)));

  }

  @Test
  public void test356() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test356"); }


    int i1 = java.lang.Integer.numberOfTrailingZeros(144);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 4);

  }

  @Test
  public void test357() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test357"); }


    tp2.Server server0 = new tp2.Server();
    boolean b1 = server0.exceptionsNotRepeated();
    boolean b2 = server0.bansSorted();
    boolean b3 = server0.notSharedElements();
    boolean b4 = server0.bansSorted();
    server0.update();
    tp2.IP iP10 = new tp2.IP((java.lang.Integer)11100, (java.lang.Integer)40, (java.lang.Integer)28, (java.lang.Integer)727449600);
    boolean b11 = server0.addException(iP10);
    server0.update();
    tp2.Server server13 = new tp2.Server();
    tp2.IP iP18 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    boolean b19 = server13.removeBan(iP18);
    tp2.IP iP24 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i25 = iP24.getThird();
    iP24.setFourth((java.lang.Integer)0);
    iP24.setSecond((java.lang.Integer)3);
    iP24.setFourth((java.lang.Integer)12);
    boolean b32 = server13.addBan(iP24);
    boolean b33 = server0.addException(iP24);
    boolean b34 = server0.bansNotRepeatedExpirationOrIP();
    tp2.ITime iTime35 = null;
    server0.setTime(iTime35);
    boolean b37 = server0.notSharedElements();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i25 + "' != '" + (-1)+ "'", i25.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == true);

  }

  @Test
  public void test358() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test358"); }


    int i2 = java.lang.Integer.rotateLeft(40, 201326624);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 40);

  }

  @Test
  public void test359() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test359"); }


    tp2.Server server0 = new tp2.Server();
    boolean b1 = server0.bansSorted();
    tp2.IP iP6 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i7 = iP6.getFourth();
    boolean b8 = server0.removeException(iP6);
    tp2.ITime iTime9 = null;
    server0.setTime(iTime9);
    boolean b11 = server0.notSharedElements();
    tp2.SinglyLinkedList singlyLinkedList12 = new tp2.SinglyLinkedList();
    tp2.IP iP17 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i18 = iP17.getThird();
    boolean b19 = singlyLinkedList12.remove(iP17);
    java.lang.Integer i20 = iP17.getThird();
    iP17.setFirst((java.lang.Integer)11100);
    boolean b23 = server0.connect(iP17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i7 + "' != '" + 100+ "'", i7.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i18 + "' != '" + (-1)+ "'", i18.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i20 + "' != '" + (-1)+ "'", i20.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);

  }

  @Test
  public void test360() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test360"); }


    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList0 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP5 = new tp2.IP((java.lang.Integer)150994944, (java.lang.Integer)784, (java.lang.Integer)784, (java.lang.Integer)2);
    java.lang.Integer i6 = iP5.getFourth();
    boolean b7 = strictlySortedSinglyLinkedList0.removeFromIP(iP5);
    tp2.SinglyLinkedList singlyLinkedList8 = new tp2.SinglyLinkedList();
    tp2.IP iP13 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i14 = iP13.getThird();
    boolean b15 = singlyLinkedList8.remove(iP13);
    java.lang.Integer i16 = iP13.getThird();
    boolean b17 = strictlySortedSinglyLinkedList0.removeFromIP(iP13);
    tp2.IPBan iPBan19 = strictlySortedSinglyLinkedList0.get(469762048);
    tp2.SinglyLinkedList singlyLinkedList20 = new tp2.SinglyLinkedList();
    tp2.IP iP25 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i26 = iP25.getThird();
    boolean b27 = singlyLinkedList20.remove(iP25);
    tp2.IP iP32 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i33 = iP32.getFirst();
    boolean b34 = singlyLinkedList20.remove(iP32);
    boolean b35 = strictlySortedSinglyLinkedList0.containsIP(iP32);
    tp2.IP iP40 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i41 = iP40.getSecond();
    boolean b42 = strictlySortedSinglyLinkedList0.containsIP(iP40);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList43 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP48 = new tp2.IP((java.lang.Integer)150994944, (java.lang.Integer)11100, (java.lang.Integer)784, (java.lang.Integer)0);
    boolean b49 = strictlySortedSinglyLinkedList43.removeFromIP(iP48);
    int i50 = strictlySortedSinglyLinkedList43.getSize();
    tp2.Server server51 = new tp2.Server();
    boolean b52 = server51.notSharedElements();
    tp2.SinglyLinkedList singlyLinkedList53 = new tp2.SinglyLinkedList();
    tp2.IP iP58 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i59 = iP58.getThird();
    boolean b60 = singlyLinkedList53.remove(iP58);
    boolean b61 = server51.addException(iP58);
    java.lang.Integer i62 = iP58.getFourth();
    boolean b63 = strictlySortedSinglyLinkedList43.containsIP(iP58);
    boolean b64 = strictlySortedSinglyLinkedList0.removeFromIP(iP58);
    tp2.IPBan iPBan66 = strictlySortedSinglyLinkedList0.get(0);
    boolean b67 = strictlySortedSinglyLinkedList0.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i6 + "' != '" + 2+ "'", i6.equals(2));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i14 + "' != '" + (-1)+ "'", i14.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i16 + "' != '" + (-1)+ "'", i16.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iPBan19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i26 + "' != '" + (-1)+ "'", i26.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i33 + "' != '" + (-1)+ "'", i33.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i41 + "' != '" + (-1)+ "'", i41.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b49 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i50 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b52 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i59 + "' != '" + (-1)+ "'", i59.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b60 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b61 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i62 + "' != '" + 100+ "'", i62.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b63 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b64 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iPBan66);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b67 == true);

  }

  @Test
  public void test361() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test361"); }


    tp2.SinglyLinkedList singlyLinkedList0 = new tp2.SinglyLinkedList();
    tp2.IP iP5 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i6 = iP5.getThird();
    boolean b7 = singlyLinkedList0.remove(iP5);
    java.lang.Integer i8 = iP5.getThird();
    java.lang.Integer i9 = iP5.getThird();
    java.lang.Integer i10 = iP5.getThird();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i6 + "' != '" + (-1)+ "'", i6.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i8 + "' != '" + (-1)+ "'", i8.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + (-1)+ "'", i9.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i10 + "' != '" + (-1)+ "'", i10.equals((-1)));

  }

  @Test
  public void test362() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test362"); }


    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList0 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP5 = new tp2.IP((java.lang.Integer)150994944, (java.lang.Integer)784, (java.lang.Integer)784, (java.lang.Integer)2);
    java.lang.Integer i6 = iP5.getFourth();
    boolean b7 = strictlySortedSinglyLinkedList0.removeFromIP(iP5);
    tp2.SinglyLinkedList singlyLinkedList8 = new tp2.SinglyLinkedList();
    tp2.IP iP13 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i14 = iP13.getThird();
    boolean b15 = singlyLinkedList8.remove(iP13);
    java.lang.Integer i16 = iP13.getThird();
    boolean b17 = strictlySortedSinglyLinkedList0.removeFromIP(iP13);
    tp2.IPBan iPBan19 = strictlySortedSinglyLinkedList0.get(469762048);
    int i20 = strictlySortedSinglyLinkedList0.getSize();
    boolean b21 = strictlySortedSinglyLinkedList0.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i6 + "' != '" + 2+ "'", i6.equals(2));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i14 + "' != '" + (-1)+ "'", i14.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i16 + "' != '" + (-1)+ "'", i16.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iPBan19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);

  }

  @Test
  public void test363() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test363"); }


    tp2.Server server0 = new tp2.Server();
    boolean b1 = server0.bansSorted();
    tp2.IP iP6 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i7 = iP6.getFourth();
    boolean b8 = server0.removeException(iP6);
    boolean b9 = server0.bansSorted();
    tp2.ITime iTime10 = null;
    server0.setTime(iTime10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i7 + "' != '" + 100+ "'", i7.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);

  }

  @Test
  public void test364() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test364"); }


    tp2.SinglyLinkedList singlyLinkedList0 = new tp2.SinglyLinkedList();
    tp2.IP iP5 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i6 = iP5.getFourth();
    singlyLinkedList0.add(iP5);
    korat.finitization.IFinitization iFinitization9 = tp2.Server.finServer((-1073741824));
    boolean b10 = iP5.equals((java.lang.Object)iFinitization9);
    iP5.setFirst((java.lang.Integer)64);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i6 + "' != '" + 100+ "'", i6.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iFinitization9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);

  }

  @Test
  public void test365() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test365"); }


    tp2.Server server0 = new tp2.Server();
    boolean b1 = server0.exceptionsNotRepeated();
    boolean b2 = server0.bansNotRepeatedExpirationOrIP();
    tp2.Server server3 = new tp2.Server();
    tp2.IP iP8 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    boolean b9 = server3.removeBan(iP8);
    java.lang.Integer i10 = iP8.getFirst();
    boolean b11 = server0.addException(iP8);
    boolean b12 = server0.exceptionsNotRepeated();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i10 + "' != '" + (-1)+ "'", i10.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);

  }

  @Test
  public void test366() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test366"); }


    int i2 = java.lang.Integer.max(167772260, 8192);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 167772260);

  }

  @Test
  public void test367() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test367"); }


    korat.finitization.IFinitization iFinitization1 = tp2.Server.finServer(3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iFinitization1);

  }

  @Test
  public void test368() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test368"); }


    int i2 = java.lang.Integer.remainderUnsigned(146800640, 1275068422);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 146800640);

  }

  @Test
  public void test369() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test369"); }


    java.lang.String str1 = java.lang.Integer.toOctalString(8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "10"+ "'", str1.equals("10"));

  }

  @Test
  public void test370() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test370"); }


    tp2.Server server0 = new tp2.Server();
    tp2.ITime iTime1 = null;
    server0.setTime(iTime1);
    boolean b3 = server0.bansNotRepeatedExpirationOrIP();
    boolean b4 = server0.exceptionsNotRepeated();
    boolean b5 = server0.bansSorted();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);

  }

  @Test
  public void test371() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test371"); }


    tp2.Server server0 = new tp2.Server();
    tp2.ITime iTime1 = null;
    server0.setTime(iTime1);
    tp2.ITime iTime3 = null;
    server0.setTime(iTime3);
    tp2.Server server5 = new tp2.Server();
    tp2.IP iP10 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    boolean b11 = server5.removeBan(iP10);
    java.lang.Integer i12 = iP10.getFirst();
    boolean b13 = server0.addException(iP10);
    boolean b14 = server0.bansSorted();
    boolean b15 = server0.bansSorted();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i12 + "' != '" + (-1)+ "'", i12.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);

  }

  @Test
  public void test372() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test372"); }


    // The following exception was thrown during execution in test generation
    try {
      int i1 = java.lang.Integer.parseInt("4294967294");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test373() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test373"); }


    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList0 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP5 = new tp2.IP((java.lang.Integer)150994944, (java.lang.Integer)11100, (java.lang.Integer)784, (java.lang.Integer)0);
    boolean b6 = strictlySortedSinglyLinkedList0.removeFromIP(iP5);
    tp2.SinglyLinkedList singlyLinkedList7 = new tp2.SinglyLinkedList();
    tp2.IP iP12 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i13 = iP12.getThird();
    boolean b14 = singlyLinkedList7.remove(iP12);
    tp2.IPBan iPBan16 = new tp2.IPBan(iP12, (java.lang.Long)10L);
    tp2.IP iP21 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i22 = iP21.getFourth();
    iPBan16.setIp(iP21);
    java.lang.Long long24 = iPBan16.getExpires();
    java.lang.Long long25 = iPBan16.getExpires();
    tp2.IP iP30 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i31 = iP30.getFirst();
    java.lang.Integer i32 = iP30.getSecond();
    iP30.setFirst((java.lang.Integer)201326592);
    iPBan16.setIp(iP30);
    tp2.SinglyLinkedList singlyLinkedList36 = new tp2.SinglyLinkedList();
    tp2.IP iP41 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i42 = iP41.getThird();
    boolean b43 = singlyLinkedList36.remove(iP41);
    boolean b44 = singlyLinkedList36.isEmpty();
    int i45 = singlyLinkedList36.getSize();
    tp2.IP iP50 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i51 = iP50.getThird();
    iP50.setFourth((java.lang.Integer)0);
    boolean b54 = singlyLinkedList36.contains(iP50);
    boolean b55 = singlyLinkedList36.isEmpty();
    tp2.IP iP60 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i61 = iP60.getFirst();
    java.lang.Integer i62 = iP60.getFirst();
    singlyLinkedList36.add(iP60);
    tp2.SinglyLinkedList singlyLinkedList64 = new tp2.SinglyLinkedList();
    tp2.IP iP69 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i70 = iP69.getThird();
    boolean b71 = singlyLinkedList64.remove(iP69);
    tp2.Server server72 = new tp2.Server();
    tp2.IP iP77 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    boolean b78 = server72.removeBan(iP77);
    boolean b79 = singlyLinkedList64.contains(iP77);
    singlyLinkedList36.add(iP77);
    iPBan16.setIp(iP77);
    boolean b82 = strictlySortedSinglyLinkedList0.add(iPBan16);
    boolean b83 = strictlySortedSinglyLinkedList0.isEmpty();
    tp2.IPBan iPBan85 = strictlySortedSinglyLinkedList0.get(16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i13 + "' != '" + (-1)+ "'", i13.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i22 + "' != '" + 100+ "'", i22.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long24 + "' != '" + 10L+ "'", long24.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long25 + "' != '" + 10L+ "'", long25.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i31 + "' != '" + (-1)+ "'", i31.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i32 + "' != '" + (-1)+ "'", i32.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i42 + "' != '" + (-1)+ "'", i42.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b43 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i45 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i51 + "' != '" + (-1)+ "'", i51.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b54 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b55 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i61 + "' != '" + (-1)+ "'", i61.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i62 + "' != '" + (-1)+ "'", i62.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i70 + "' != '" + (-1)+ "'", i70.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b71 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b78 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b79 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b82 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b83 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iPBan85);

  }

  @Test
  public void test374() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test374"); }


    tp2.Server server0 = new tp2.Server();
    boolean b1 = server0.notSharedElements();
    tp2.SinglyLinkedList singlyLinkedList2 = new tp2.SinglyLinkedList();
    tp2.IP iP7 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i8 = iP7.getThird();
    boolean b9 = singlyLinkedList2.remove(iP7);
    boolean b10 = server0.addException(iP7);
    tp2.SinglyLinkedList singlyLinkedList11 = new tp2.SinglyLinkedList();
    tp2.IP iP16 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i17 = iP16.getFourth();
    singlyLinkedList11.add(iP16);
    java.lang.Integer i19 = iP16.getFirst();
    boolean b20 = server0.removeBan(iP16);
    tp2.ITime iTime21 = null;
    server0.setTime(iTime21);
    boolean b23 = server0.bansSorted();
    boolean b24 = server0.bansNotRepeatedExpirationOrIP();
    boolean b25 = server0.bansSorted();
    tp2.ITime iTime26 = null;
    server0.setTime(iTime26);
    tp2.ITime iTime28 = null;
    server0.setTime(iTime28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i8 + "' != '" + (-1)+ "'", i8.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i17 + "' != '" + 100+ "'", i17.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i19 + "' != '" + (-1)+ "'", i19.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);

  }

  @Test
  public void test375() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test375"); }


    int i1 = java.lang.Integer.lowestOneBit(100000);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 32);

  }

  @Test
  public void test376() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test376"); }


    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList0 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP5 = new tp2.IP((java.lang.Integer)150994944, (java.lang.Integer)784, (java.lang.Integer)784, (java.lang.Integer)2);
    java.lang.Integer i6 = iP5.getFourth();
    boolean b7 = strictlySortedSinglyLinkedList0.removeFromIP(iP5);
    tp2.SinglyLinkedList singlyLinkedList8 = new tp2.SinglyLinkedList();
    tp2.IP iP13 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i14 = iP13.getThird();
    boolean b15 = singlyLinkedList8.remove(iP13);
    java.lang.Integer i16 = iP13.getThird();
    boolean b17 = strictlySortedSinglyLinkedList0.removeFromIP(iP13);
    tp2.IPBan iPBan19 = strictlySortedSinglyLinkedList0.get(469762048);
    tp2.IPBan iPBan21 = strictlySortedSinglyLinkedList0.get(1100100);
    tp2.SinglyLinkedList singlyLinkedList22 = new tp2.SinglyLinkedList();
    tp2.IP iP27 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i28 = iP27.getThird();
    boolean b29 = singlyLinkedList22.remove(iP27);
    tp2.IPBan iPBan31 = new tp2.IPBan(iP27, (java.lang.Long)10L);
    java.lang.Long long32 = iPBan31.getExpires();
    iPBan31.setExpires((java.lang.Long)(-1L));
    java.lang.Long long35 = iPBan31.getExpires();
    java.lang.Long long36 = iPBan31.getExpires();
    boolean b37 = strictlySortedSinglyLinkedList0.contains(iPBan31);
    tp2.IP iP38 = iPBan31.getIp();
    tp2.IP iP39 = iPBan31.getIp();
    java.lang.Long long40 = iPBan31.getExpires();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i6 + "' != '" + 2+ "'", i6.equals(2));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i14 + "' != '" + (-1)+ "'", i14.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i16 + "' != '" + (-1)+ "'", i16.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iPBan19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iPBan21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i28 + "' != '" + (-1)+ "'", i28.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long32 + "' != '" + 10L+ "'", long32.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long35 + "' != '" + (-1L)+ "'", long35.equals((-1L)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long36 + "' != '" + (-1L)+ "'", long36.equals((-1L)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long40 + "' != '" + (-1L)+ "'", long40.equals((-1L)));

  }

  @Test
  public void test377() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test377"); }


    int i2 = java.lang.Integer.parseInt("110011", 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 34603041);

  }

  @Test
  public void test378() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test378"); }


    tp2.IP iP4 = new tp2.IP((java.lang.Integer)150994944, (java.lang.Integer)784, (java.lang.Integer)784, (java.lang.Integer)2);
    java.lang.Integer i5 = null;
    iP4.setThird(i5);

  }

  @Test
  public void test379() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test379"); }


    java.lang.Integer i2 = java.lang.Integer.getInteger("1100000000000000000000000000", 201326784);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i2 + "' != '" + 201326784+ "'", i2.equals(201326784));

  }

  @Test
  public void test380() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test380"); }


    tp2.Server server0 = new tp2.Server();
    tp2.IP iP5 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    boolean b6 = server0.removeBan(iP5);
    tp2.IP iP11 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i12 = iP11.getThird();
    iP11.setFourth((java.lang.Integer)0);
    iP11.setSecond((java.lang.Integer)3);
    iP11.setFourth((java.lang.Integer)12);
    boolean b19 = server0.addBan(iP11);
    server0.update();
    boolean b21 = server0.bansSorted();
    tp2.Server server22 = new tp2.Server();
    boolean b23 = server22.notSharedElements();
    tp2.SinglyLinkedList singlyLinkedList24 = new tp2.SinglyLinkedList();
    tp2.IP iP29 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i30 = iP29.getThird();
    boolean b31 = singlyLinkedList24.remove(iP29);
    boolean b32 = server22.addException(iP29);
    tp2.SinglyLinkedList singlyLinkedList33 = new tp2.SinglyLinkedList();
    tp2.IP iP38 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i39 = iP38.getFourth();
    singlyLinkedList33.add(iP38);
    java.lang.Integer i41 = iP38.getFirst();
    boolean b42 = server22.removeBan(iP38);
    tp2.Server server43 = new tp2.Server();
    tp2.IP iP48 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    boolean b49 = server43.removeBan(iP48);
    tp2.IP iP54 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i55 = iP54.getThird();
    iP54.setFourth((java.lang.Integer)0);
    iP54.setSecond((java.lang.Integer)3);
    iP54.setFourth((java.lang.Integer)12);
    boolean b62 = server43.addBan(iP54);
    boolean b63 = server22.removeException(iP54);
    java.lang.Integer i64 = iP54.getThird();
    java.lang.Integer i65 = iP54.getFirst();
    boolean b66 = server0.removeBan(iP54);
    boolean b67 = server0.notSharedElements();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i12 + "' != '" + (-1)+ "'", i12.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i30 + "' != '" + (-1)+ "'", i30.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i39 + "' != '" + 100+ "'", i39.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i41 + "' != '" + (-1)+ "'", i41.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b49 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i55 + "' != '" + (-1)+ "'", i55.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b62 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b63 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i64 + "' != '" + (-1)+ "'", i64.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i65 + "' != '" + (-1)+ "'", i65.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b66 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b67 == true);

  }

  @Test
  public void test381() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test381"); }


    int i2 = java.lang.Integer.max(201326624, 58000000);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 201326624);

  }

  @Test
  public void test382() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test382"); }


    int i2 = java.lang.Integer.max(0, 436219526);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 436219526);

  }

  @Test
  public void test383() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test383"); }


    java.lang.Integer i3 = null;
    // The following exception was thrown during execution in test generation
    try {
      tp2.IP iP4 = new tp2.IP((java.lang.Integer)12, (java.lang.Integer)201326592, (java.lang.Integer)1610612786, i3);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test384() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test384"); }


    // The following exception was thrown during execution in test generation
    try {
      int i1 = java.lang.Integer.parseInt("100000000000000000000000000");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test385() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test385"); }


    tp2.IP iP4 = new tp2.IP((java.lang.Integer)1073741824, (java.lang.Integer)(-1), (java.lang.Integer)16, (java.lang.Integer)1);
    iP4.setFourth((java.lang.Integer)2);

  }

  @Test
  public void test386() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test386"); }


    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList0 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b1 = strictlySortedSinglyLinkedList0.isEmpty();
    int i2 = strictlySortedSinglyLinkedList0.getSize();
    boolean b3 = strictlySortedSinglyLinkedList0.isEmpty();
    boolean b4 = strictlySortedSinglyLinkedList0.isEmpty();
    tp2.SinglyLinkedList singlyLinkedList5 = new tp2.SinglyLinkedList();
    tp2.IP iP10 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i11 = iP10.getThird();
    boolean b12 = singlyLinkedList5.remove(iP10);
    tp2.IPBan iPBan14 = new tp2.IPBan(iP10, (java.lang.Long)10L);
    java.lang.Long long15 = iPBan14.getExpires();
    java.lang.Long long16 = iPBan14.getExpires();
    tp2.SinglyLinkedList singlyLinkedList17 = new tp2.SinglyLinkedList();
    tp2.IP iP22 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i23 = iP22.getThird();
    boolean b24 = singlyLinkedList17.remove(iP22);
    tp2.IPBan iPBan26 = new tp2.IPBan(iP22, (java.lang.Long)10L);
    tp2.IP iP31 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i32 = iP31.getFourth();
    iPBan26.setIp(iP31);
    iPBan14.setIp(iP31);
    boolean b35 = strictlySortedSinglyLinkedList0.contains(iPBan14);
    java.lang.Long long36 = iPBan14.getExpires();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i11 + "' != '" + (-1)+ "'", i11.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long15 + "' != '" + 10L+ "'", long15.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long16 + "' != '" + 10L+ "'", long16.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i23 + "' != '" + (-1)+ "'", i23.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i32 + "' != '" + 100+ "'", i32.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long36 + "' != '" + 10L+ "'", long36.equals(10L));

  }

  @Test
  public void test387() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test387"); }


    java.lang.String str1 = java.lang.Integer.toUnsignedString(805306368);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "805306368"+ "'", str1.equals("805306368"));

  }

  @Test
  public void test388() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test388"); }


    int i2 = java.lang.Integer.rotateRight(11001, 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1441923072);

  }

  @Test
  public void test389() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test389"); }


    int i2 = java.lang.Integer.compare((-1610612688), 25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == (-1));

  }

  @Test
  public void test390() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test390"); }


    tp2.SinglyLinkedList singlyLinkedList0 = new tp2.SinglyLinkedList();
    tp2.IP iP1 = null;
    boolean b2 = singlyLinkedList0.remove(iP1);
    boolean b3 = singlyLinkedList0.isEmpty();
    tp2.IP iP8 = new tp2.IP((java.lang.Integer)5, (java.lang.Integer)1, (java.lang.Integer)0, (java.lang.Integer)12);
    boolean b9 = singlyLinkedList0.contains(iP8);
    tp2.SinglyLinkedList singlyLinkedList10 = new tp2.SinglyLinkedList();
    tp2.IP iP15 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i16 = iP15.getThird();
    boolean b17 = singlyLinkedList10.remove(iP15);
    iP15.setSecond((java.lang.Integer)150994944);
    java.lang.Integer i20 = iP15.getFourth();
    java.lang.Integer i21 = iP15.getThird();
    java.lang.Integer i22 = iP15.getFirst();
    boolean b23 = singlyLinkedList0.contains(iP15);
    tp2.SinglyLinkedList singlyLinkedList24 = new tp2.SinglyLinkedList();
    tp2.IP iP29 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i30 = iP29.getFourth();
    singlyLinkedList24.add(iP29);
    java.lang.Integer i32 = iP29.getFirst();
    boolean b33 = singlyLinkedList0.remove(iP29);
    tp2.SinglyLinkedList singlyLinkedList34 = new tp2.SinglyLinkedList();
    tp2.IP iP39 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i40 = iP39.getThird();
    boolean b41 = singlyLinkedList34.remove(iP39);
    tp2.IPBan iPBan43 = new tp2.IPBan(iP39, (java.lang.Long)10L);
    tp2.IP iP48 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i49 = iP48.getFourth();
    iPBan43.setIp(iP48);
    java.lang.Long long51 = iPBan43.getExpires();
    java.lang.Long long52 = iPBan43.getExpires();
    tp2.Server server53 = new tp2.Server();
    boolean b54 = server53.exceptionsNotRepeated();
    tp2.IP iP59 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i60 = iP59.getThird();
    iP59.setSecond((java.lang.Integer)10);
    boolean b63 = server53.removeBan(iP59);
    java.lang.Integer i64 = iP59.getFirst();
    iPBan43.setIp(iP59);
    iP59.setFourth((java.lang.Integer)11884);
    singlyLinkedList0.add(iP59);
    boolean b69 = singlyLinkedList0.isEmpty();
    tp2.IP iP71 = singlyLinkedList0.get(33554432);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i16 + "' != '" + (-1)+ "'", i16.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i20 + "' != '" + 100+ "'", i20.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i21 + "' != '" + (-1)+ "'", i21.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i22 + "' != '" + (-1)+ "'", i22.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i30 + "' != '" + 100+ "'", i30.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i32 + "' != '" + (-1)+ "'", i32.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i40 + "' != '" + (-1)+ "'", i40.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i49 + "' != '" + 100+ "'", i49.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long51 + "' != '" + 10L+ "'", long51.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long52 + "' != '" + 10L+ "'", long52.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b54 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i60 + "' != '" + (-1)+ "'", i60.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b63 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i64 + "' != '" + (-1)+ "'", i64.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b69 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP71);

  }

  @Test
  public void test391() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test391"); }


    java.lang.Integer i1 = java.lang.Integer.valueOf("200000000");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 200000000+ "'", i1.equals(200000000));

  }

  @Test
  public void test392() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test392"); }


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
  public void test393() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test393"); }


    int i2 = java.lang.Integer.max((-1601830656), 218103808);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 218103808);

  }

  @Test
  public void test394() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test394"); }


    // The following exception was thrown during execution in test generation
    try {
      int i2 = java.lang.Integer.divideUnsigned(671088640, 0);
      org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException");
    } catch (java.lang.ArithmeticException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArithmeticException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test395() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test395"); }


    tp2.Server server0 = new tp2.Server();
    boolean b1 = server0.exceptionsNotRepeated();
    boolean b2 = server0.bansSorted();
    boolean b3 = server0.notSharedElements();
    tp2.SinglyLinkedList singlyLinkedList4 = new tp2.SinglyLinkedList();
    tp2.IP iP9 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i10 = iP9.getFourth();
    singlyLinkedList4.add(iP9);
    boolean b12 = server0.addException(iP9);
    tp2.IPBan iPBan14 = new tp2.IPBan(iP9, (java.lang.Long)727449600L);
    java.lang.Long long15 = iPBan14.getExpires();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i10 + "' != '" + 100+ "'", i10.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long15 + "' != '" + 727449600L+ "'", long15.equals(727449600L));

  }

  @Test
  public void test396() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test396"); }


    int i2 = java.lang.Integer.remainderUnsigned(3, 64);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 3);

  }

  @Test
  public void test397() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test397"); }


    // The following exception was thrown during execution in test generation
    try {
      java.lang.Integer i2 = java.lang.Integer.valueOf("11100", 56);
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

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test398"); }


    java.lang.String str1 = java.lang.Integer.toOctalString(0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "0"+ "'", str1.equals("0"));

  }

  @Test
  public void test399() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test399"); }


    tp2.Server server0 = new tp2.Server();
    boolean b1 = server0.notSharedElements();
    tp2.SinglyLinkedList singlyLinkedList2 = new tp2.SinglyLinkedList();
    tp2.IP iP7 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i8 = iP7.getThird();
    boolean b9 = singlyLinkedList2.remove(iP7);
    boolean b10 = server0.addException(iP7);
    tp2.SinglyLinkedList singlyLinkedList11 = new tp2.SinglyLinkedList();
    tp2.IP iP16 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i17 = iP16.getFourth();
    singlyLinkedList11.add(iP16);
    java.lang.Integer i19 = iP16.getFirst();
    boolean b20 = server0.removeBan(iP16);
    tp2.ITime iTime21 = null;
    server0.setTime(iTime21);
    boolean b23 = server0.bansSorted();
    tp2.IP iP28 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i29 = iP28.getFourth();
    boolean b30 = server0.removeBan(iP28);
    tp2.Server server31 = new tp2.Server();
    boolean b32 = server31.notSharedElements();
    tp2.SinglyLinkedList singlyLinkedList33 = new tp2.SinglyLinkedList();
    tp2.IP iP38 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i39 = iP38.getThird();
    boolean b40 = singlyLinkedList33.remove(iP38);
    boolean b41 = server31.addException(iP38);
    tp2.SinglyLinkedList singlyLinkedList42 = new tp2.SinglyLinkedList();
    tp2.IP iP47 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i48 = iP47.getFourth();
    singlyLinkedList42.add(iP47);
    java.lang.Integer i50 = iP47.getFirst();
    boolean b51 = server31.removeBan(iP47);
    tp2.ITime iTime52 = null;
    server31.setTime(iTime52);
    boolean b54 = server31.notSharedElements();
    tp2.IP iP59 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i60 = iP59.getThird();
    iP59.setFourth((java.lang.Integer)0);
    iP59.setSecond((java.lang.Integer)3);
    boolean b65 = server31.addBan(iP59);
    java.lang.Integer i66 = iP59.getFirst();
    boolean b67 = server0.addBan(iP59);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i8 + "' != '" + (-1)+ "'", i8.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i17 + "' != '" + 100+ "'", i17.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i19 + "' != '" + (-1)+ "'", i19.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i29 + "' != '" + 100+ "'", i29.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i39 + "' != '" + (-1)+ "'", i39.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i48 + "' != '" + 100+ "'", i48.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i50 + "' != '" + (-1)+ "'", i50.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b51 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b54 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i60 + "' != '" + (-1)+ "'", i60.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b65 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i66 + "' != '" + (-1)+ "'", i66.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b67 == true);

  }

  @Test
  public void test400() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test400"); }


    java.lang.Integer i1 = java.lang.Integer.valueOf(167772260);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 167772260+ "'", i1.equals(167772260));

  }

  @Test
  public void test401() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test401"); }


    java.lang.Integer i2 = java.lang.Integer.getInteger("", (java.lang.Integer)727449600);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i2 + "' != '" + 727449600+ "'", i2.equals(727449600));

  }

  @Test
  public void test402() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test402"); }


    tp2.SinglyLinkedList singlyLinkedList0 = new tp2.SinglyLinkedList();
    tp2.IP iP5 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i6 = iP5.getThird();
    boolean b7 = singlyLinkedList0.remove(iP5);
    tp2.IPBan iPBan9 = new tp2.IPBan(iP5, (java.lang.Long)10L);
    tp2.IP iP14 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i15 = iP14.getFourth();
    iPBan9.setIp(iP14);
    java.lang.Long long17 = iPBan9.getExpires();
    tp2.IP iP18 = iPBan9.getIp();
    iPBan9.setExpires((java.lang.Long)536870912L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i6 + "' != '" + (-1)+ "'", i6.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i15 + "' != '" + 100+ "'", i15.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long17 + "' != '" + 10L+ "'", long17.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP18);

  }

  @Test
  public void test403() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test403"); }


    int i2 = java.lang.Integer.compare(637534288, 1100100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);

  }

  @Test
  public void test404() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test404"); }


    int i1 = java.lang.Integer.numberOfTrailingZeros(9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);

  }

  @Test
  public void test405() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test405"); }


    // The following exception was thrown during execution in test generation
    try {
      int i1 = java.lang.Integer.parseInt("hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test406() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test406"); }


    java.lang.String str1 = java.lang.Integer.toUnsignedString(33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "33"+ "'", str1.equals("33"));

  }

  @Test
  public void test407() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test407"); }


    // The following exception was thrown during execution in test generation
    try {
      java.lang.Integer i2 = java.lang.Integer.valueOf("2693136640", 5);
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test408() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test408"); }


    java.lang.String str1 = java.lang.Integer.toBinaryString(0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "0"+ "'", str1.equals("0"));

  }

  @Test
  public void test409() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test409"); }


    tp2.Server server0 = new tp2.Server();
    boolean b1 = server0.notSharedElements();
    tp2.SinglyLinkedList singlyLinkedList2 = new tp2.SinglyLinkedList();
    tp2.IP iP7 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i8 = iP7.getThird();
    boolean b9 = singlyLinkedList2.remove(iP7);
    boolean b10 = server0.addException(iP7);
    java.lang.Integer i11 = iP7.getFourth();
    java.lang.Integer i12 = iP7.getFirst();
    iP7.setFourth((java.lang.Integer)146800640);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i8 + "' != '" + (-1)+ "'", i8.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i11 + "' != '" + 100+ "'", i11.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i12 + "' != '" + (-1)+ "'", i12.equals((-1)));

  }

  @Test
  public void test410() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test410"); }


    tp2.Server server0 = new tp2.Server();
    boolean b1 = server0.exceptionsNotRepeated();
    boolean b2 = server0.bansSorted();
    boolean b3 = server0.notSharedElements();
    tp2.SinglyLinkedList singlyLinkedList4 = new tp2.SinglyLinkedList();
    tp2.IP iP9 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i10 = iP9.getFourth();
    singlyLinkedList4.add(iP9);
    boolean b12 = server0.addException(iP9);
    tp2.Server server13 = new tp2.Server();
    boolean b14 = server13.notSharedElements();
    tp2.SinglyLinkedList singlyLinkedList15 = new tp2.SinglyLinkedList();
    tp2.IP iP20 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i21 = iP20.getThird();
    boolean b22 = singlyLinkedList15.remove(iP20);
    boolean b23 = server13.addException(iP20);
    tp2.SinglyLinkedList singlyLinkedList24 = new tp2.SinglyLinkedList();
    tp2.IP iP29 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i30 = iP29.getFourth();
    singlyLinkedList24.add(iP29);
    java.lang.Integer i32 = iP29.getFirst();
    boolean b33 = server13.removeBan(iP29);
    tp2.ITime iTime34 = null;
    server13.setTime(iTime34);
    boolean b36 = server13.notSharedElements();
    tp2.IP iP41 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i42 = iP41.getThird();
    iP41.setFourth((java.lang.Integer)0);
    iP41.setSecond((java.lang.Integer)3);
    boolean b47 = server13.addBan(iP41);
    tp2.SinglyLinkedList singlyLinkedList48 = new tp2.SinglyLinkedList();
    tp2.IP iP53 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i54 = iP53.getThird();
    boolean b55 = singlyLinkedList48.remove(iP53);
    java.lang.Integer i56 = iP53.getThird();
    iP53.setFirst((java.lang.Integer)11100);
    boolean b59 = server13.addBan(iP53);
    boolean b60 = server0.removeBan(iP53);
    java.lang.Integer i61 = iP53.getSecond();
    tp2.IPBan iPBan63 = new tp2.IPBan(iP53, (java.lang.Long)10L);
    iPBan63.setExpires((java.lang.Long)5L);
    java.lang.Long long66 = iPBan63.getExpires();
    tp2.IP iP67 = iPBan63.getIp();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i10 + "' != '" + 100+ "'", i10.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i21 + "' != '" + (-1)+ "'", i21.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i30 + "' != '" + 100+ "'", i30.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i32 + "' != '" + (-1)+ "'", i32.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i42 + "' != '" + (-1)+ "'", i42.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b47 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i54 + "' != '" + (-1)+ "'", i54.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b55 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i56 + "' != '" + (-1)+ "'", i56.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b59 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b60 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i61 + "' != '" + (-1)+ "'", i61.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long66 + "' != '" + 5L+ "'", long66.equals(5L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP67);

  }

  @Test
  public void test411() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test411"); }


    java.lang.Integer i2 = java.lang.Integer.getInteger("14", 6291456);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i2 + "' != '" + 6291456+ "'", i2.equals(6291456));

  }

  @Test
  public void test412() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test412"); }


    tp2.SinglyLinkedList singlyLinkedList0 = new tp2.SinglyLinkedList();
    tp2.IP iP1 = null;
    boolean b2 = singlyLinkedList0.remove(iP1);
    int i3 = singlyLinkedList0.getSize();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);

  }

  @Test
  public void test413() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test413"); }


    tp2.Server server0 = new tp2.Server();
    boolean b1 = server0.exceptionsNotRepeated();
    boolean b2 = server0.bansSorted();
    tp2.SinglyLinkedList singlyLinkedList3 = new tp2.SinglyLinkedList();
    tp2.IP iP8 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i9 = iP8.getThird();
    boolean b10 = singlyLinkedList3.remove(iP8);
    iP8.setSecond((java.lang.Integer)150994944);
    java.lang.Integer i13 = iP8.getFourth();
    java.lang.Integer i14 = iP8.getThird();
    java.lang.Integer i15 = iP8.getFirst();
    boolean b16 = server0.connect(iP8);
    tp2.Server server17 = new tp2.Server();
    tp2.ITime iTime18 = null;
    server17.setTime(iTime18);
    tp2.Server server20 = new tp2.Server();
    boolean b21 = server20.notSharedElements();
    tp2.SinglyLinkedList singlyLinkedList22 = new tp2.SinglyLinkedList();
    tp2.IP iP27 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i28 = iP27.getThird();
    boolean b29 = singlyLinkedList22.remove(iP27);
    boolean b30 = server20.addException(iP27);
    java.lang.Integer i31 = iP27.getFirst();
    tp2.IPBan iPBan33 = new tp2.IPBan(iP27, (java.lang.Long)5L);
    boolean b34 = server17.connect(iP27);
    tp2.IP iP39 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i40 = iP39.getFourth();
    iP39.setFirst((java.lang.Integer)16);
    boolean b43 = server17.addBan(iP39);
    boolean b44 = server0.removeBan(iP39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + (-1)+ "'", i9.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i13 + "' != '" + 100+ "'", i13.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i14 + "' != '" + (-1)+ "'", i14.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i15 + "' != '" + (-1)+ "'", i15.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i28 + "' != '" + (-1)+ "'", i28.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i31 + "' != '" + (-1)+ "'", i31.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i40 + "' != '" + 100+ "'", i40.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b43 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == false);

  }

  @Test
  public void test414() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test414"); }


    int i1 = java.lang.Integer.numberOfLeadingZeros(28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 27);

  }

  @Test
  public void test415() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test415"); }


    tp2.SinglyLinkedList singlyLinkedList0 = new tp2.SinglyLinkedList();
    tp2.SinglyLinkedList singlyLinkedList1 = new tp2.SinglyLinkedList();
    tp2.IP iP6 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i7 = iP6.getThird();
    boolean b8 = singlyLinkedList1.remove(iP6);
    java.lang.Integer i9 = iP6.getThird();
    singlyLinkedList0.add(iP6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i7 + "' != '" + (-1)+ "'", i7.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + (-1)+ "'", i9.equals((-1)));

  }

  @Test
  public void test416() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test416"); }


    java.lang.String str1 = java.lang.Integer.toOctalString((-420762406));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "34672726332"+ "'", str1.equals("34672726332"));

  }

  @Test
  public void test417() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test417"); }


    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList0 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP5 = new tp2.IP((java.lang.Integer)150994944, (java.lang.Integer)11100, (java.lang.Integer)784, (java.lang.Integer)0);
    boolean b6 = strictlySortedSinglyLinkedList0.removeFromIP(iP5);
    tp2.IP iP11 = new tp2.IP((java.lang.Integer)150994944, (java.lang.Integer)11100, (java.lang.Integer)784, (java.lang.Integer)0);
    boolean b12 = strictlySortedSinglyLinkedList0.removeFromIP(iP11);
    tp2.SinglyLinkedList singlyLinkedList13 = new tp2.SinglyLinkedList();
    tp2.IP iP18 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i19 = iP18.getThird();
    boolean b20 = singlyLinkedList13.remove(iP18);
    boolean b21 = singlyLinkedList13.isEmpty();
    int i22 = singlyLinkedList13.getSize();
    tp2.IP iP27 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i28 = iP27.getThird();
    iP27.setFourth((java.lang.Integer)0);
    boolean b31 = singlyLinkedList13.contains(iP27);
    boolean b32 = singlyLinkedList13.isEmpty();
    tp2.IP iP37 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i38 = iP37.getFirst();
    java.lang.Integer i39 = iP37.getFirst();
    singlyLinkedList13.add(iP37);
    tp2.IP iP42 = singlyLinkedList13.get(727449600);
    tp2.IP iP44 = singlyLinkedList13.get((-1073741812));
    boolean b45 = strictlySortedSinglyLinkedList0.removeFromIP(iP44);
    boolean b46 = strictlySortedSinglyLinkedList0.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i19 + "' != '" + (-1)+ "'", i19.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i28 + "' != '" + (-1)+ "'", i28.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i38 + "' != '" + (-1)+ "'", i38.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i39 + "' != '" + (-1)+ "'", i39.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b46 == true);

  }

  @Test
  public void test418() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test418"); }


    tp2.Server server0 = new tp2.Server();
    boolean b1 = server0.notSharedElements();
    tp2.SinglyLinkedList singlyLinkedList2 = new tp2.SinglyLinkedList();
    tp2.IP iP7 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i8 = iP7.getThird();
    boolean b9 = singlyLinkedList2.remove(iP7);
    boolean b10 = server0.addException(iP7);
    tp2.SinglyLinkedList singlyLinkedList11 = new tp2.SinglyLinkedList();
    tp2.IP iP16 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i17 = iP16.getFourth();
    singlyLinkedList11.add(iP16);
    java.lang.Integer i19 = iP16.getFirst();
    boolean b20 = server0.removeBan(iP16);
    tp2.ITime iTime21 = null;
    server0.setTime(iTime21);
    boolean b23 = server0.bansSorted();
    tp2.IP iP28 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i29 = iP28.getFourth();
    iP28.setFirst((java.lang.Integer)16);
    boolean b32 = server0.addBan(iP28);
    java.lang.Integer i33 = iP28.getFirst();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i8 + "' != '" + (-1)+ "'", i8.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i17 + "' != '" + 100+ "'", i17.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i19 + "' != '" + (-1)+ "'", i19.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i29 + "' != '" + 100+ "'", i29.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i33 + "' != '" + 16+ "'", i33.equals(16));

  }

  @Test
  public void test419() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test419"); }


    tp2.Server server0 = new tp2.Server();
    boolean b1 = server0.exceptionsNotRepeated();
    boolean b2 = server0.bansSorted();
    tp2.Server server3 = new tp2.Server();
    tp2.IP iP8 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    boolean b9 = server3.removeBan(iP8);
    java.lang.Integer i10 = iP8.getFirst();
    boolean b11 = server0.addBan(iP8);
    boolean b12 = server0.exceptionsNotRepeated();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i10 + "' != '" + (-1)+ "'", i10.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);

  }

  @Test
  public void test420() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test420"); }


    int i1 = java.lang.Integer.signum(2809);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 1);

  }

  @Test
  public void test421() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test421"); }


    tp2.Server server0 = new tp2.Server();
    tp2.ITime iTime1 = null;
    server0.setTime(iTime1);
    tp2.ITime iTime3 = null;
    server0.setTime(iTime3);
    tp2.Server server5 = new tp2.Server();
    tp2.IP iP10 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    boolean b11 = server5.removeBan(iP10);
    java.lang.Integer i12 = iP10.getFirst();
    boolean b13 = server0.addException(iP10);
    iP10.setThird((java.lang.Integer)(-1073741824));
    iP10.setFourth((java.lang.Integer)807927808);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i12 + "' != '" + (-1)+ "'", i12.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);

  }

  @Test
  public void test422() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test422"); }


    java.lang.Integer i1 = new java.lang.Integer(134217599);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 134217599+ "'", i1.equals(134217599));

  }

  @Test
  public void test423() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test423"); }


    java.lang.String str1 = java.lang.Integer.toUnsignedString(637534208);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "637534208"+ "'", str1.equals("637534208"));

  }

  @Test
  public void test424() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test424"); }


    java.lang.Integer i1 = new java.lang.Integer("110011");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 110011+ "'", i1.equals(110011));

  }

  @Test
  public void test425() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test425"); }


    tp2.Server server0 = new tp2.Server();
    boolean b1 = server0.exceptionsNotRepeated();
    tp2.IP iP6 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i7 = iP6.getThird();
    iP6.setSecond((java.lang.Integer)10);
    boolean b10 = server0.removeBan(iP6);
    iP6.setFourth((java.lang.Integer)9);
    tp2.IPBan iPBan14 = new tp2.IPBan(iP6, (java.lang.Long)5L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i7 + "' != '" + (-1)+ "'", i7.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);

  }

  @Test
  public void test426() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test426"); }


    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList0 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP5 = new tp2.IP((java.lang.Integer)150994944, (java.lang.Integer)784, (java.lang.Integer)784, (java.lang.Integer)2);
    java.lang.Integer i6 = iP5.getFourth();
    boolean b7 = strictlySortedSinglyLinkedList0.removeFromIP(iP5);
    tp2.SinglyLinkedList singlyLinkedList8 = new tp2.SinglyLinkedList();
    tp2.IP iP13 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i14 = iP13.getThird();
    boolean b15 = singlyLinkedList8.remove(iP13);
    java.lang.Integer i16 = iP13.getThird();
    boolean b17 = strictlySortedSinglyLinkedList0.removeFromIP(iP13);
    tp2.IPBan iPBan19 = strictlySortedSinglyLinkedList0.get(469762048);
    tp2.SinglyLinkedList singlyLinkedList20 = new tp2.SinglyLinkedList();
    tp2.IP iP25 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i26 = iP25.getThird();
    boolean b27 = singlyLinkedList20.remove(iP25);
    tp2.IP iP32 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i33 = iP32.getFirst();
    boolean b34 = singlyLinkedList20.remove(iP32);
    boolean b35 = strictlySortedSinglyLinkedList0.containsIP(iP32);
    tp2.IP iP40 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i41 = iP40.getSecond();
    boolean b42 = strictlySortedSinglyLinkedList0.containsIP(iP40);
    tp2.Server server43 = new tp2.Server();
    boolean b44 = server43.notSharedElements();
    tp2.SinglyLinkedList singlyLinkedList45 = new tp2.SinglyLinkedList();
    tp2.IP iP50 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i51 = iP50.getThird();
    boolean b52 = singlyLinkedList45.remove(iP50);
    boolean b53 = server43.addException(iP50);
    java.lang.Integer i54 = iP50.getFirst();
    tp2.IPBan iPBan56 = new tp2.IPBan(iP50, (java.lang.Long)5L);
    tp2.IP iP57 = iPBan56.getIp();
    tp2.IP iP58 = iPBan56.getIp();
    boolean b59 = strictlySortedSinglyLinkedList0.contains(iPBan56);
    iPBan56.setExpires((java.lang.Long)32L);
    iPBan56.setExpires((java.lang.Long)144L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i6 + "' != '" + 2+ "'", i6.equals(2));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i14 + "' != '" + (-1)+ "'", i14.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i16 + "' != '" + (-1)+ "'", i16.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iPBan19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i26 + "' != '" + (-1)+ "'", i26.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i33 + "' != '" + (-1)+ "'", i33.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i41 + "' != '" + (-1)+ "'", i41.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i51 + "' != '" + (-1)+ "'", i51.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b52 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b53 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i54 + "' != '" + (-1)+ "'", i54.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP58);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b59 == false);

  }

  @Test
  public void test427() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test427"); }


    int i1 = java.lang.Integer.numberOfTrailingZeros((-2147479552));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 12);

  }

  @Test
  public void test428() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test428"); }


    int i2 = java.lang.Integer.compareUnsigned(671088644, 56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);

  }

  @Test
  public void test429() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test429"); }


    int i1 = java.lang.Integer.highestOneBit(64);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 64);

  }

  @Test
  public void test430() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test430"); }


    int i2 = java.lang.Integer.compare((-2147481978), 2147483647);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == (-1));

  }

  @Test
  public void test431() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test431"); }


    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList0 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP5 = new tp2.IP((java.lang.Integer)150994944, (java.lang.Integer)11100, (java.lang.Integer)784, (java.lang.Integer)0);
    boolean b6 = strictlySortedSinglyLinkedList0.removeFromIP(iP5);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList7 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP12 = new tp2.IP((java.lang.Integer)150994944, (java.lang.Integer)784, (java.lang.Integer)784, (java.lang.Integer)2);
    java.lang.Integer i13 = iP12.getFourth();
    boolean b14 = strictlySortedSinglyLinkedList7.removeFromIP(iP12);
    tp2.SinglyLinkedList singlyLinkedList15 = new tp2.SinglyLinkedList();
    tp2.IP iP20 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i21 = iP20.getThird();
    boolean b22 = singlyLinkedList15.remove(iP20);
    java.lang.Integer i23 = iP20.getThird();
    boolean b24 = strictlySortedSinglyLinkedList7.removeFromIP(iP20);
    tp2.IPBan iPBan26 = strictlySortedSinglyLinkedList7.get(167772160);
    int i27 = strictlySortedSinglyLinkedList7.getSize();
    tp2.SinglyLinkedList singlyLinkedList28 = new tp2.SinglyLinkedList();
    tp2.IP iP33 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i34 = iP33.getThird();
    boolean b35 = singlyLinkedList28.remove(iP33);
    tp2.IPBan iPBan37 = new tp2.IPBan(iP33, (java.lang.Long)10L);
    java.lang.Long long38 = iPBan37.getExpires();
    java.lang.Long long39 = iPBan37.getExpires();
    iPBan37.setExpires((java.lang.Long)10L);
    boolean b42 = strictlySortedSinglyLinkedList7.add(iPBan37);
    boolean b43 = strictlySortedSinglyLinkedList0.contains(iPBan37);
    java.lang.Long long44 = iPBan37.getExpires();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i13 + "' != '" + 2+ "'", i13.equals(2));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i21 + "' != '" + (-1)+ "'", i21.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i23 + "' != '" + (-1)+ "'", i23.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iPBan26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i34 + "' != '" + (-1)+ "'", i34.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long38 + "' != '" + 10L+ "'", long38.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long39 + "' != '" + 10L+ "'", long39.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b43 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long44 + "' != '" + 10L+ "'", long44.equals(10L));

  }

  @Test
  public void test432() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test432"); }


    // The following exception was thrown during execution in test generation
    try {
      int i2 = java.lang.Integer.parseUnsignedInt("200000000", (-420762406));
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

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test433"); }


    java.lang.String str1 = java.lang.Integer.toUnsignedString(640);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "640"+ "'", str1.equals("640"));

  }

  @Test
  public void test434() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test434"); }


    java.lang.Integer i2 = java.lang.Integer.getInteger("7fffffff", (java.lang.Integer)19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i2 + "' != '" + 19+ "'", i2.equals(19));

  }

  @Test
  public void test435() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test435"); }


    // The following exception was thrown during execution in test generation
    try {
      java.lang.Integer i1 = new java.lang.Integer("6000000000");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test436() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test436"); }


    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList0 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b1 = strictlySortedSinglyLinkedList0.isEmpty();
    int i2 = strictlySortedSinglyLinkedList0.getSize();
    boolean b3 = strictlySortedSinglyLinkedList0.isEmpty();
    boolean b4 = strictlySortedSinglyLinkedList0.isEmpty();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList5 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP10 = new tp2.IP((java.lang.Integer)150994944, (java.lang.Integer)784, (java.lang.Integer)784, (java.lang.Integer)2);
    java.lang.Integer i11 = iP10.getFourth();
    boolean b12 = strictlySortedSinglyLinkedList5.removeFromIP(iP10);
    tp2.SinglyLinkedList singlyLinkedList13 = new tp2.SinglyLinkedList();
    tp2.IP iP18 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i19 = iP18.getThird();
    boolean b20 = singlyLinkedList13.remove(iP18);
    java.lang.Integer i21 = iP18.getThird();
    boolean b22 = strictlySortedSinglyLinkedList5.removeFromIP(iP18);
    tp2.IPBan iPBan24 = strictlySortedSinglyLinkedList5.get(469762048);
    tp2.SinglyLinkedList singlyLinkedList25 = new tp2.SinglyLinkedList();
    tp2.IP iP30 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i31 = iP30.getThird();
    boolean b32 = singlyLinkedList25.remove(iP30);
    tp2.IP iP37 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i38 = iP37.getFirst();
    boolean b39 = singlyLinkedList25.remove(iP37);
    iP37.setFirst((java.lang.Integer)(-2147483648));
    boolean b42 = strictlySortedSinglyLinkedList5.removeFromIP(iP37);
    tp2.IPBan iPBan44 = strictlySortedSinglyLinkedList5.get(100000);
    tp2.SinglyLinkedList singlyLinkedList45 = new tp2.SinglyLinkedList();
    tp2.IP iP50 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i51 = iP50.getThird();
    boolean b52 = singlyLinkedList45.remove(iP50);
    tp2.IPBan iPBan54 = new tp2.IPBan(iP50, (java.lang.Long)10L);
    tp2.IP iP59 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i60 = iP59.getFourth();
    iPBan54.setIp(iP59);
    boolean b62 = strictlySortedSinglyLinkedList5.add(iPBan54);
    tp2.SinglyLinkedList singlyLinkedList63 = new tp2.SinglyLinkedList();
    tp2.IP iP68 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i69 = iP68.getThird();
    boolean b70 = singlyLinkedList63.remove(iP68);
    tp2.IPBan iPBan72 = new tp2.IPBan(iP68, (java.lang.Long)10L);
    java.lang.Long long73 = iPBan72.getExpires();
    iPBan72.setExpires((java.lang.Long)(-1L));
    java.lang.Long long76 = iPBan72.getExpires();
    java.lang.Long long77 = iPBan72.getExpires();
    boolean b78 = strictlySortedSinglyLinkedList5.contains(iPBan72);
    boolean b79 = strictlySortedSinglyLinkedList0.add(iPBan72);
    int i80 = strictlySortedSinglyLinkedList0.getSize();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i11 + "' != '" + 2+ "'", i11.equals(2));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i19 + "' != '" + (-1)+ "'", i19.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i21 + "' != '" + (-1)+ "'", i21.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iPBan24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i31 + "' != '" + (-1)+ "'", i31.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i38 + "' != '" + (-1)+ "'", i38.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iPBan44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i51 + "' != '" + (-1)+ "'", i51.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b52 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i60 + "' != '" + 100+ "'", i60.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b62 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i69 + "' != '" + (-1)+ "'", i69.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b70 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long73 + "' != '" + 10L+ "'", long73.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long76 + "' != '" + (-1L)+ "'", long76.equals((-1L)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long77 + "' != '" + (-1L)+ "'", long77.equals((-1L)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b78 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b79 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i80 == 1);

  }

  @Test
  public void test437() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test437"); }


    tp2.Server server0 = new tp2.Server();
    boolean b1 = server0.notSharedElements();
    tp2.SinglyLinkedList singlyLinkedList2 = new tp2.SinglyLinkedList();
    tp2.IP iP7 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i8 = iP7.getThird();
    boolean b9 = singlyLinkedList2.remove(iP7);
    boolean b10 = server0.addException(iP7);
    tp2.SinglyLinkedList singlyLinkedList11 = new tp2.SinglyLinkedList();
    tp2.IP iP16 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i17 = iP16.getFourth();
    singlyLinkedList11.add(iP16);
    java.lang.Integer i19 = iP16.getFirst();
    boolean b20 = server0.removeBan(iP16);
    tp2.ITime iTime21 = null;
    server0.setTime(iTime21);
    boolean b23 = server0.bansSorted();
    boolean b24 = server0.bansNotRepeatedExpirationOrIP();
    boolean b25 = server0.exceptionsNotRepeated();
    tp2.SinglyLinkedList singlyLinkedList26 = new tp2.SinglyLinkedList();
    tp2.IP iP31 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i32 = iP31.getThird();
    boolean b33 = singlyLinkedList26.remove(iP31);
    iP31.setSecond((java.lang.Integer)44);
    boolean b36 = server0.addBan(iP31);
    tp2.SinglyLinkedList singlyLinkedList37 = new tp2.SinglyLinkedList();
    tp2.IP iP42 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i43 = iP42.getThird();
    boolean b44 = singlyLinkedList37.remove(iP42);
    tp2.IP iP49 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i50 = iP49.getFirst();
    boolean b51 = singlyLinkedList37.remove(iP49);
    iP49.setSecond((java.lang.Integer)40);
    java.lang.Integer i54 = iP49.getSecond();
    boolean b55 = server0.removeException(iP49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i8 + "' != '" + (-1)+ "'", i8.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i17 + "' != '" + 100+ "'", i17.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i19 + "' != '" + (-1)+ "'", i19.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i32 + "' != '" + (-1)+ "'", i32.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i43 + "' != '" + (-1)+ "'", i43.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i50 + "' != '" + (-1)+ "'", i50.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b51 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i54 + "' != '" + 40+ "'", i54.equals(40));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b55 == false);

  }

  @Test
  public void test438() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test438"); }


    java.lang.Integer i1 = java.lang.Integer.getInteger("58000000");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);

  }

  @Test
  public void test439() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test439"); }


    tp2.IP iP4 = new tp2.IP((java.lang.Integer)11100, (java.lang.Integer)40, (java.lang.Integer)28, (java.lang.Integer)727449600);
    java.lang.Integer i5 = iP4.getFourth();
    tp2.IPBan iPBan7 = new tp2.IPBan(iP4, (java.lang.Long)784L);
    tp2.IP iP8 = iPBan7.getIp();
    tp2.IP iP9 = iPBan7.getIp();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i5 + "' != '" + 727449600+ "'", i5.equals(727449600));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP9);

  }

  @Test
  public void test440() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test440"); }


    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList0 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP5 = new tp2.IP((java.lang.Integer)150994944, (java.lang.Integer)784, (java.lang.Integer)784, (java.lang.Integer)2);
    java.lang.Integer i6 = iP5.getFourth();
    boolean b7 = strictlySortedSinglyLinkedList0.removeFromIP(iP5);
    tp2.SinglyLinkedList singlyLinkedList8 = new tp2.SinglyLinkedList();
    tp2.IP iP13 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i14 = iP13.getThird();
    boolean b15 = singlyLinkedList8.remove(iP13);
    java.lang.Integer i16 = iP13.getThird();
    boolean b17 = strictlySortedSinglyLinkedList0.removeFromIP(iP13);
    tp2.IPBan iPBan19 = strictlySortedSinglyLinkedList0.get(469762048);
    tp2.IPBan iPBan21 = strictlySortedSinglyLinkedList0.get(1100100);
    tp2.SinglyLinkedList singlyLinkedList22 = new tp2.SinglyLinkedList();
    tp2.IP iP27 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i28 = iP27.getThird();
    boolean b29 = singlyLinkedList22.remove(iP27);
    tp2.IPBan iPBan31 = new tp2.IPBan(iP27, (java.lang.Long)10L);
    java.lang.Long long32 = iPBan31.getExpires();
    iPBan31.setExpires((java.lang.Long)(-1L));
    java.lang.Long long35 = iPBan31.getExpires();
    java.lang.Long long36 = iPBan31.getExpires();
    boolean b37 = strictlySortedSinglyLinkedList0.contains(iPBan31);
    tp2.IP iP38 = iPBan31.getIp();
    tp2.IP iP39 = iPBan31.getIp();
    iPBan31.setExpires((java.lang.Long)1L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i6 + "' != '" + 2+ "'", i6.equals(2));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i14 + "' != '" + (-1)+ "'", i14.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i16 + "' != '" + (-1)+ "'", i16.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iPBan19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iPBan21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i28 + "' != '" + (-1)+ "'", i28.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long32 + "' != '" + 10L+ "'", long32.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long35 + "' != '" + (-1L)+ "'", long35.equals((-1L)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long36 + "' != '" + (-1L)+ "'", long36.equals((-1L)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP39);

  }

  @Test
  public void test441() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test441"); }


    int i1 = java.lang.Integer.reverseBytes(2560);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 655360);

  }

  @Test
  public void test442() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test442"); }


    java.lang.Integer i1 = new java.lang.Integer(2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 2+ "'", i1.equals(2));

  }

  @Test
  public void test443() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test443"); }


    int i2 = java.lang.Integer.compareUnsigned(58000000, 150994944);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == (-1));

  }

  @Test
  public void test444() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test444"); }


    // The following exception was thrown during execution in test generation
    try {
      java.lang.Integer i1 = new java.lang.Integer("34672726332");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test445() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test445"); }


    int i2 = java.lang.Integer.compareUnsigned(469762048, 1107296276);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == (-1));

  }

  @Test
  public void test446() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test446"); }


    tp2.Server server0 = new tp2.Server();
    boolean b1 = server0.notSharedElements();
    tp2.SinglyLinkedList singlyLinkedList2 = new tp2.SinglyLinkedList();
    tp2.IP iP7 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i8 = iP7.getThird();
    boolean b9 = singlyLinkedList2.remove(iP7);
    boolean b10 = server0.addException(iP7);
    tp2.SinglyLinkedList singlyLinkedList11 = new tp2.SinglyLinkedList();
    tp2.IP iP16 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i17 = iP16.getFourth();
    singlyLinkedList11.add(iP16);
    java.lang.Integer i19 = iP16.getFirst();
    boolean b20 = server0.removeBan(iP16);
    tp2.ITime iTime21 = null;
    server0.setTime(iTime21);
    boolean b23 = server0.bansSorted();
    boolean b24 = server0.bansNotRepeatedExpirationOrIP();
    tp2.ITime iTime25 = null;
    server0.setTime(iTime25);
    boolean b27 = server0.bansOkTime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i8 + "' != '" + (-1)+ "'", i8.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i17 + "' != '" + 100+ "'", i17.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i19 + "' != '" + (-1)+ "'", i19.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);

  }

  @Test
  public void test447() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test447"); }


    int i2 = java.lang.Integer.compareUnsigned(110011, 1073741844);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == (-1));

  }

  @Test
  public void test448() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test448"); }


    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList0 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP5 = new tp2.IP((java.lang.Integer)150994944, (java.lang.Integer)11100, (java.lang.Integer)784, (java.lang.Integer)0);
    boolean b6 = strictlySortedSinglyLinkedList0.removeFromIP(iP5);
    tp2.SinglyLinkedList singlyLinkedList7 = new tp2.SinglyLinkedList();
    tp2.IP iP12 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i13 = iP12.getThird();
    boolean b14 = singlyLinkedList7.remove(iP12);
    boolean b15 = singlyLinkedList7.isEmpty();
    int i16 = singlyLinkedList7.getSize();
    tp2.IP iP21 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i22 = iP21.getThird();
    iP21.setFourth((java.lang.Integer)0);
    boolean b25 = singlyLinkedList7.contains(iP21);
    boolean b26 = singlyLinkedList7.isEmpty();
    tp2.IP iP31 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i32 = iP31.getFirst();
    java.lang.Integer i33 = iP31.getFirst();
    singlyLinkedList7.add(iP31);
    tp2.SinglyLinkedList singlyLinkedList35 = new tp2.SinglyLinkedList();
    tp2.IP iP40 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i41 = iP40.getThird();
    boolean b42 = singlyLinkedList35.remove(iP40);
    tp2.Server server43 = new tp2.Server();
    tp2.IP iP48 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    boolean b49 = server43.removeBan(iP48);
    boolean b50 = singlyLinkedList35.contains(iP48);
    singlyLinkedList7.add(iP48);
    tp2.SinglyLinkedList singlyLinkedList52 = new tp2.SinglyLinkedList();
    tp2.IP iP57 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i58 = iP57.getThird();
    boolean b59 = singlyLinkedList52.remove(iP57);
    tp2.Server server60 = new tp2.Server();
    tp2.IP iP65 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    boolean b66 = server60.removeBan(iP65);
    boolean b67 = singlyLinkedList52.contains(iP65);
    singlyLinkedList7.add(iP65);
    boolean b69 = strictlySortedSinglyLinkedList0.removeFromIP(iP65);
    tp2.IPBan iPBan71 = strictlySortedSinglyLinkedList0.get(524288);
    int i72 = strictlySortedSinglyLinkedList0.getSize();
    tp2.SinglyLinkedList singlyLinkedList73 = new tp2.SinglyLinkedList();
    tp2.IP iP78 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i79 = iP78.getFourth();
    singlyLinkedList73.add(iP78);
    java.lang.Integer i81 = iP78.getFirst();
    tp2.IPBan iPBan83 = new tp2.IPBan(iP78, (java.lang.Long)4L);
    boolean b84 = strictlySortedSinglyLinkedList0.add(iPBan83);
    int i85 = strictlySortedSinglyLinkedList0.getSize();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i13 + "' != '" + (-1)+ "'", i13.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i22 + "' != '" + (-1)+ "'", i22.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i32 + "' != '" + (-1)+ "'", i32.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i33 + "' != '" + (-1)+ "'", i33.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i41 + "' != '" + (-1)+ "'", i41.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b49 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b50 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i58 + "' != '" + (-1)+ "'", i58.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b59 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b66 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b67 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b69 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iPBan71);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i72 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i79 + "' != '" + 100+ "'", i79.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i81 + "' != '" + (-1)+ "'", i81.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b84 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i85 == 1);

  }

  @Test
  public void test449() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test449"); }


    int i2 = java.lang.Integer.compareUnsigned(1, 56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == (-1));

  }

  @Test
  public void test450() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test450"); }


    java.lang.Integer i1 = new java.lang.Integer(8192);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 8192+ "'", i1.equals(8192));

  }

  @Test
  public void test451() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test451"); }


    int i1 = java.lang.Integer.reverse(729888);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 80007168);

  }

  @Test
  public void test452() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test452"); }


    tp2.Server server0 = new tp2.Server();
    boolean b1 = server0.exceptionsNotRepeated();
    boolean b2 = server0.bansSorted();
    boolean b3 = server0.notSharedElements();
    boolean b4 = server0.bansSorted();
    server0.update();
    tp2.IP iP10 = new tp2.IP((java.lang.Integer)11100, (java.lang.Integer)40, (java.lang.Integer)28, (java.lang.Integer)727449600);
    boolean b11 = server0.addException(iP10);
    server0.update();
    tp2.Server server13 = new tp2.Server();
    tp2.IP iP18 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    boolean b19 = server13.removeBan(iP18);
    tp2.IP iP24 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i25 = iP24.getThird();
    iP24.setFourth((java.lang.Integer)0);
    iP24.setSecond((java.lang.Integer)3);
    iP24.setFourth((java.lang.Integer)12);
    boolean b32 = server13.addBan(iP24);
    boolean b33 = server0.addException(iP24);
    tp2.ITime iTime34 = null;
    server0.setTime(iTime34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i25 + "' != '" + (-1)+ "'", i25.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == true);

  }

  @Test
  public void test453() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test453"); }


    int i2 = java.lang.Integer.compareUnsigned(6291456, 11001);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);

  }

  @Test
  public void test454() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test454"); }


    int i2 = java.lang.Integer.divideUnsigned(268451840, (-1305346048));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);

  }

  @Test
  public void test455() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test455"); }


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
  public void test456() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test456"); }


    tp2.SinglyLinkedList singlyLinkedList0 = new tp2.SinglyLinkedList();
    tp2.Server server1 = new tp2.Server();
    boolean b2 = server1.exceptionsNotRepeated();
    tp2.IP iP7 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i8 = iP7.getThird();
    iP7.setSecond((java.lang.Integer)10);
    boolean b11 = server1.removeBan(iP7);
    boolean b12 = singlyLinkedList0.remove(iP7);
    tp2.IP iP13 = null;
    singlyLinkedList0.add(iP13);
    tp2.IP iP16 = singlyLinkedList0.get(469762048);
    tp2.IP iP21 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i22 = iP21.getFirst();
    java.lang.Integer i23 = iP21.getSecond();
    iP21.setFirst((java.lang.Integer)201326592);
    tp2.IPBan iPBan27 = new tp2.IPBan(iP21, (java.lang.Long)727449600L);
    boolean b28 = singlyLinkedList0.remove(iP21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i8 + "' != '" + (-1)+ "'", i8.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i22 + "' != '" + (-1)+ "'", i22.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i23 + "' != '" + (-1)+ "'", i23.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);

  }

  @Test
  public void test457() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test457"); }


    java.lang.String str2 = java.lang.Integer.toUnsignedString(805306368, 14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "78d4add6"+ "'", str2.equals("78d4add6"));

  }

  @Test
  public void test458() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test458"); }


    int i1 = java.lang.Integer.parseUnsignedInt("88770");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 88770);

  }

  @Test
  public void test459() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test459"); }


    tp2.Server server0 = new tp2.Server();
    tp2.IP iP5 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    boolean b6 = server0.removeBan(iP5);
    tp2.IP iP11 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i12 = iP11.getThird();
    iP11.setFourth((java.lang.Integer)0);
    iP11.setSecond((java.lang.Integer)3);
    iP11.setFourth((java.lang.Integer)12);
    boolean b19 = server0.addBan(iP11);
    server0.update();
    boolean b21 = server0.bansOkTime();
    boolean b22 = server0.notSharedElements();
    boolean b23 = server0.bansSorted();
    boolean b24 = server0.exceptionsNotRepeated();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i12 + "' != '" + (-1)+ "'", i12.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == true);

  }

  @Test
  public void test460() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test460"); }


    tp2.SinglyLinkedList singlyLinkedList0 = new tp2.SinglyLinkedList();
    tp2.IP iP1 = null;
    boolean b2 = singlyLinkedList0.remove(iP1);
    boolean b3 = singlyLinkedList0.isEmpty();
    tp2.IP iP8 = new tp2.IP((java.lang.Integer)5, (java.lang.Integer)1, (java.lang.Integer)0, (java.lang.Integer)12);
    boolean b9 = singlyLinkedList0.contains(iP8);
    tp2.SinglyLinkedList singlyLinkedList10 = new tp2.SinglyLinkedList();
    tp2.IP iP15 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i16 = iP15.getThird();
    boolean b17 = singlyLinkedList10.remove(iP15);
    iP15.setSecond((java.lang.Integer)150994944);
    java.lang.Integer i20 = iP15.getFourth();
    java.lang.Integer i21 = iP15.getThird();
    java.lang.Integer i22 = iP15.getFirst();
    boolean b23 = singlyLinkedList0.contains(iP15);
    tp2.SinglyLinkedList singlyLinkedList24 = new tp2.SinglyLinkedList();
    tp2.IP iP29 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i30 = iP29.getThird();
    boolean b31 = singlyLinkedList24.remove(iP29);
    java.lang.Integer i32 = iP29.getThird();
    java.lang.Integer i33 = iP29.getSecond();
    boolean b34 = singlyLinkedList0.contains(iP29);
    int i35 = singlyLinkedList0.getSize();
    tp2.IP iP40 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i41 = iP40.getFirst();
    java.lang.Integer i42 = iP40.getSecond();
    iP40.setThird((java.lang.Integer)28);
    boolean b45 = singlyLinkedList0.contains(iP40);
    tp2.Server server46 = new tp2.Server();
    boolean b47 = server46.exceptionsNotRepeated();
    tp2.IP iP52 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i53 = iP52.getThird();
    iP52.setSecond((java.lang.Integer)10);
    boolean b56 = server46.removeBan(iP52);
    iP52.setFourth((java.lang.Integer)9);
    boolean b59 = singlyLinkedList0.contains(iP52);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList60 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP65 = new tp2.IP((java.lang.Integer)150994944, (java.lang.Integer)784, (java.lang.Integer)784, (java.lang.Integer)2);
    java.lang.Integer i66 = iP65.getFourth();
    boolean b67 = strictlySortedSinglyLinkedList60.removeFromIP(iP65);
    tp2.SinglyLinkedList singlyLinkedList68 = new tp2.SinglyLinkedList();
    tp2.IP iP73 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i74 = iP73.getThird();
    boolean b75 = singlyLinkedList68.remove(iP73);
    java.lang.Integer i76 = iP73.getThird();
    boolean b77 = strictlySortedSinglyLinkedList60.removeFromIP(iP73);
    tp2.IPBan iPBan79 = strictlySortedSinglyLinkedList60.get(167772160);
    int i80 = strictlySortedSinglyLinkedList60.getSize();
    boolean b81 = strictlySortedSinglyLinkedList60.isEmpty();
    tp2.SinglyLinkedList singlyLinkedList82 = new tp2.SinglyLinkedList();
    tp2.IP iP87 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i88 = iP87.getThird();
    boolean b89 = singlyLinkedList82.remove(iP87);
    iP87.setSecond((java.lang.Integer)44);
    boolean b92 = strictlySortedSinglyLinkedList60.removeFromIP(iP87);
    java.lang.Integer i93 = iP87.getThird();
    boolean b94 = singlyLinkedList0.remove(iP87);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i16 + "' != '" + (-1)+ "'", i16.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i20 + "' != '" + 100+ "'", i20.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i21 + "' != '" + (-1)+ "'", i21.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i22 + "' != '" + (-1)+ "'", i22.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i30 + "' != '" + (-1)+ "'", i30.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i32 + "' != '" + (-1)+ "'", i32.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i33 + "' != '" + (-1)+ "'", i33.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i35 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i41 + "' != '" + (-1)+ "'", i41.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i42 + "' != '" + (-1)+ "'", i42.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b47 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i53 + "' != '" + (-1)+ "'", i53.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b56 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b59 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i66 + "' != '" + 2+ "'", i66.equals(2));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b67 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i74 + "' != '" + (-1)+ "'", i74.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b75 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i76 + "' != '" + (-1)+ "'", i76.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b77 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iPBan79);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i80 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b81 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i88 + "' != '" + (-1)+ "'", i88.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b89 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b92 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i93 + "' != '" + (-1)+ "'", i93.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b94 == false);

  }

  @Test
  public void test461() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test461"); }


    int i1 = java.lang.Integer.highestOneBit(448);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 256);

  }

  @Test
  public void test462() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test462"); }


    java.lang.String str2 = java.lang.Integer.toUnsignedString(13, 56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "13"+ "'", str2.equals("13"));

  }

  @Test
  public void test463() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test463"); }


    int i2 = java.lang.Integer.rotateLeft(144, 436207642);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1073741826);

  }

  @Test
  public void test464() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test464"); }


    tp2.Server server0 = new tp2.Server();
    boolean b1 = server0.notSharedElements();
    tp2.SinglyLinkedList singlyLinkedList2 = new tp2.SinglyLinkedList();
    tp2.IP iP7 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i8 = iP7.getThird();
    boolean b9 = singlyLinkedList2.remove(iP7);
    boolean b10 = server0.addException(iP7);
    java.lang.Integer i11 = iP7.getFirst();
    tp2.IPBan iPBan13 = new tp2.IPBan(iP7, (java.lang.Long)5L);
    tp2.SinglyLinkedList singlyLinkedList14 = new tp2.SinglyLinkedList();
    tp2.IP iP15 = null;
    boolean b16 = singlyLinkedList14.remove(iP15);
    boolean b17 = singlyLinkedList14.isEmpty();
    tp2.IP iP22 = new tp2.IP((java.lang.Integer)5, (java.lang.Integer)1, (java.lang.Integer)0, (java.lang.Integer)12);
    boolean b23 = singlyLinkedList14.contains(iP22);
    tp2.SinglyLinkedList singlyLinkedList24 = new tp2.SinglyLinkedList();
    tp2.IP iP29 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i30 = iP29.getThird();
    boolean b31 = singlyLinkedList24.remove(iP29);
    iP29.setSecond((java.lang.Integer)150994944);
    java.lang.Integer i34 = iP29.getFourth();
    java.lang.Integer i35 = iP29.getThird();
    java.lang.Integer i36 = iP29.getFirst();
    boolean b37 = singlyLinkedList14.contains(iP29);
    tp2.SinglyLinkedList singlyLinkedList38 = new tp2.SinglyLinkedList();
    tp2.IP iP43 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i44 = iP43.getFourth();
    singlyLinkedList38.add(iP43);
    java.lang.Integer i46 = iP43.getFirst();
    boolean b47 = singlyLinkedList14.contains(iP43);
    boolean b48 = iP7.equals((java.lang.Object)iP43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i8 + "' != '" + (-1)+ "'", i8.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i11 + "' != '" + (-1)+ "'", i11.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i30 + "' != '" + (-1)+ "'", i30.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i34 + "' != '" + 100+ "'", i34.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i35 + "' != '" + (-1)+ "'", i35.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i36 + "' != '" + (-1)+ "'", i36.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i44 + "' != '" + 100+ "'", i44.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i46 + "' != '" + (-1)+ "'", i46.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b47 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b48 == true);

  }

  @Test
  public void test465() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test465"); }


    tp2.Server server0 = new tp2.Server();
    boolean b1 = server0.notSharedElements();
    tp2.SinglyLinkedList singlyLinkedList2 = new tp2.SinglyLinkedList();
    tp2.IP iP7 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i8 = iP7.getThird();
    boolean b9 = singlyLinkedList2.remove(iP7);
    boolean b10 = server0.addException(iP7);
    tp2.SinglyLinkedList singlyLinkedList11 = new tp2.SinglyLinkedList();
    tp2.IP iP16 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i17 = iP16.getFourth();
    singlyLinkedList11.add(iP16);
    java.lang.Integer i19 = iP16.getFirst();
    boolean b20 = server0.removeBan(iP16);
    tp2.ITime iTime21 = null;
    server0.setTime(iTime21);
    boolean b23 = server0.notSharedElements();
    tp2.IP iP28 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i29 = iP28.getThird();
    iP28.setFourth((java.lang.Integer)0);
    iP28.setSecond((java.lang.Integer)3);
    boolean b34 = server0.addBan(iP28);
    boolean b35 = server0.bansSorted();
    tp2.SinglyLinkedList singlyLinkedList36 = new tp2.SinglyLinkedList();
    tp2.IP iP41 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i42 = iP41.getThird();
    boolean b43 = singlyLinkedList36.remove(iP41);
    tp2.IP iP48 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i49 = iP48.getFourth();
    singlyLinkedList36.add(iP48);
    tp2.SinglyLinkedList singlyLinkedList51 = new tp2.SinglyLinkedList();
    boolean b52 = singlyLinkedList51.isEmpty();
    int i53 = singlyLinkedList51.getSize();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList54 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP59 = new tp2.IP((java.lang.Integer)150994944, (java.lang.Integer)784, (java.lang.Integer)784, (java.lang.Integer)2);
    java.lang.Integer i60 = iP59.getFourth();
    boolean b61 = strictlySortedSinglyLinkedList54.removeFromIP(iP59);
    tp2.SinglyLinkedList singlyLinkedList62 = new tp2.SinglyLinkedList();
    tp2.IP iP67 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i68 = iP67.getThird();
    boolean b69 = singlyLinkedList62.remove(iP67);
    java.lang.Integer i70 = iP67.getThird();
    boolean b71 = strictlySortedSinglyLinkedList54.removeFromIP(iP67);
    tp2.IPBan iPBan73 = strictlySortedSinglyLinkedList54.get(469762048);
    tp2.SinglyLinkedList singlyLinkedList74 = new tp2.SinglyLinkedList();
    tp2.IP iP79 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i80 = iP79.getThird();
    boolean b81 = singlyLinkedList74.remove(iP79);
    tp2.IP iP86 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i87 = iP86.getFirst();
    boolean b88 = singlyLinkedList74.remove(iP86);
    iP86.setFirst((java.lang.Integer)(-2147483648));
    boolean b91 = strictlySortedSinglyLinkedList54.removeFromIP(iP86);
    boolean b92 = singlyLinkedList51.contains(iP86);
    singlyLinkedList36.add(iP86);
    boolean b94 = server0.addBan(iP86);
    boolean b95 = server0.bansOkTime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i8 + "' != '" + (-1)+ "'", i8.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i17 + "' != '" + 100+ "'", i17.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i19 + "' != '" + (-1)+ "'", i19.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i29 + "' != '" + (-1)+ "'", i29.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i42 + "' != '" + (-1)+ "'", i42.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b43 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i49 + "' != '" + 100+ "'", i49.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b52 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i53 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i60 + "' != '" + 2+ "'", i60.equals(2));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b61 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i68 + "' != '" + (-1)+ "'", i68.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b69 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i70 + "' != '" + (-1)+ "'", i70.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b71 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iPBan73);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i80 + "' != '" + (-1)+ "'", i80.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b81 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i87 + "' != '" + (-1)+ "'", i87.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b88 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b91 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b92 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b94 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b95 == true);

  }

  @Test
  public void test466() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test466"); }


    // The following exception was thrown during execution in test generation
    try {
      int i1 = java.lang.Integer.parseInt("34672726332");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test467() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test467"); }


    long long1 = java.lang.Integer.toUnsignedLong(67108864);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == 67108864L);

  }

  @Test
  public void test468() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test468"); }


    java.lang.Integer i1 = new java.lang.Integer(67108864);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 67108864+ "'", i1.equals(67108864));

  }

  @Test
  public void test469() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test469"); }


    tp2.Server server0 = new tp2.Server();
    boolean b1 = server0.bansSorted();
    tp2.IP iP6 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i7 = iP6.getFourth();
    boolean b8 = server0.removeException(iP6);
    iP6.setSecond((java.lang.Integer)11001);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i7 + "' != '" + 100+ "'", i7.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);

  }

  @Test
  public void test470() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test470"); }


    tp2.SinglyLinkedList singlyLinkedList0 = new tp2.SinglyLinkedList();
    tp2.IP iP1 = null;
    boolean b2 = singlyLinkedList0.remove(iP1);
    boolean b3 = singlyLinkedList0.isEmpty();
    tp2.IP iP8 = new tp2.IP((java.lang.Integer)5, (java.lang.Integer)1, (java.lang.Integer)0, (java.lang.Integer)12);
    boolean b9 = singlyLinkedList0.contains(iP8);
    tp2.SinglyLinkedList singlyLinkedList10 = new tp2.SinglyLinkedList();
    tp2.IP iP15 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i16 = iP15.getThird();
    boolean b17 = singlyLinkedList10.remove(iP15);
    iP15.setSecond((java.lang.Integer)150994944);
    java.lang.Integer i20 = iP15.getFourth();
    java.lang.Integer i21 = iP15.getThird();
    java.lang.Integer i22 = iP15.getFirst();
    boolean b23 = singlyLinkedList0.contains(iP15);
    tp2.SinglyLinkedList singlyLinkedList24 = new tp2.SinglyLinkedList();
    tp2.IP iP29 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i30 = iP29.getFourth();
    singlyLinkedList24.add(iP29);
    java.lang.Integer i32 = iP29.getFirst();
    boolean b33 = singlyLinkedList0.remove(iP29);
    tp2.SinglyLinkedList singlyLinkedList34 = new tp2.SinglyLinkedList();
    tp2.IP iP39 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i40 = iP39.getThird();
    boolean b41 = singlyLinkedList34.remove(iP39);
    tp2.IPBan iPBan43 = new tp2.IPBan(iP39, (java.lang.Long)10L);
    tp2.IP iP48 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i49 = iP48.getFourth();
    iPBan43.setIp(iP48);
    java.lang.Long long51 = iPBan43.getExpires();
    java.lang.Long long52 = iPBan43.getExpires();
    tp2.Server server53 = new tp2.Server();
    boolean b54 = server53.exceptionsNotRepeated();
    tp2.IP iP59 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i60 = iP59.getThird();
    iP59.setSecond((java.lang.Integer)10);
    boolean b63 = server53.removeBan(iP59);
    java.lang.Integer i64 = iP59.getFirst();
    iPBan43.setIp(iP59);
    iP59.setFourth((java.lang.Integer)11884);
    singlyLinkedList0.add(iP59);
    int i69 = singlyLinkedList0.getSize();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i16 + "' != '" + (-1)+ "'", i16.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i20 + "' != '" + 100+ "'", i20.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i21 + "' != '" + (-1)+ "'", i21.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i22 + "' != '" + (-1)+ "'", i22.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i30 + "' != '" + 100+ "'", i30.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i32 + "' != '" + (-1)+ "'", i32.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i40 + "' != '" + (-1)+ "'", i40.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i49 + "' != '" + 100+ "'", i49.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long51 + "' != '" + 10L+ "'", long51.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long52 + "' != '" + 10L+ "'", long52.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b54 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i60 + "' != '" + (-1)+ "'", i60.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b63 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i64 + "' != '" + (-1)+ "'", i64.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i69 == 1);

  }

  @Test
  public void test471() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test471"); }


    tp2.Server server0 = new tp2.Server();
    tp2.IP iP5 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    boolean b6 = server0.removeBan(iP5);
    tp2.IP iP11 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i12 = iP11.getThird();
    iP11.setFourth((java.lang.Integer)0);
    iP11.setSecond((java.lang.Integer)3);
    iP11.setFourth((java.lang.Integer)12);
    boolean b19 = server0.addBan(iP11);
    boolean b20 = server0.bansNotRepeatedExpirationOrIP();
    boolean b21 = server0.exceptionsNotRepeated();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i12 + "' != '" + (-1)+ "'", i12.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);

  }

  @Test
  public void test472() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test472"); }


    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList0 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP5 = new tp2.IP((java.lang.Integer)150994944, (java.lang.Integer)784, (java.lang.Integer)784, (java.lang.Integer)2);
    java.lang.Integer i6 = iP5.getFourth();
    boolean b7 = strictlySortedSinglyLinkedList0.removeFromIP(iP5);
    tp2.SinglyLinkedList singlyLinkedList8 = new tp2.SinglyLinkedList();
    tp2.IP iP13 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i14 = iP13.getThird();
    boolean b15 = singlyLinkedList8.remove(iP13);
    java.lang.Integer i16 = iP13.getThird();
    boolean b17 = strictlySortedSinglyLinkedList0.removeFromIP(iP13);
    tp2.IPBan iPBan19 = strictlySortedSinglyLinkedList0.get(469762048);
    tp2.SinglyLinkedList singlyLinkedList20 = new tp2.SinglyLinkedList();
    tp2.IP iP25 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i26 = iP25.getThird();
    boolean b27 = singlyLinkedList20.remove(iP25);
    tp2.IP iP32 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i33 = iP32.getFirst();
    boolean b34 = singlyLinkedList20.remove(iP32);
    boolean b35 = strictlySortedSinglyLinkedList0.containsIP(iP32);
    tp2.IPBan iPBan37 = strictlySortedSinglyLinkedList0.get(640);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList38 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP43 = new tp2.IP((java.lang.Integer)150994944, (java.lang.Integer)784, (java.lang.Integer)784, (java.lang.Integer)2);
    java.lang.Integer i44 = iP43.getFourth();
    boolean b45 = strictlySortedSinglyLinkedList38.removeFromIP(iP43);
    tp2.SinglyLinkedList singlyLinkedList46 = new tp2.SinglyLinkedList();
    tp2.IP iP51 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i52 = iP51.getThird();
    boolean b53 = singlyLinkedList46.remove(iP51);
    java.lang.Integer i54 = iP51.getThird();
    boolean b55 = strictlySortedSinglyLinkedList38.removeFromIP(iP51);
    tp2.IPBan iPBan57 = strictlySortedSinglyLinkedList38.get(469762048);
    tp2.SinglyLinkedList singlyLinkedList58 = new tp2.SinglyLinkedList();
    tp2.IP iP63 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i64 = iP63.getThird();
    boolean b65 = singlyLinkedList58.remove(iP63);
    tp2.IP iP70 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i71 = iP70.getFirst();
    boolean b72 = singlyLinkedList58.remove(iP70);
    iP70.setFirst((java.lang.Integer)(-2147483648));
    boolean b75 = strictlySortedSinglyLinkedList38.removeFromIP(iP70);
    iP70.setSecond((java.lang.Integer)5);
    boolean b78 = strictlySortedSinglyLinkedList0.removeFromIP(iP70);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i6 + "' != '" + 2+ "'", i6.equals(2));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i14 + "' != '" + (-1)+ "'", i14.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i16 + "' != '" + (-1)+ "'", i16.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iPBan19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i26 + "' != '" + (-1)+ "'", i26.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i33 + "' != '" + (-1)+ "'", i33.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iPBan37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i44 + "' != '" + 2+ "'", i44.equals(2));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i52 + "' != '" + (-1)+ "'", i52.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b53 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i54 + "' != '" + (-1)+ "'", i54.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b55 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iPBan57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i64 + "' != '" + (-1)+ "'", i64.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b65 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i71 + "' != '" + (-1)+ "'", i71.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b72 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b75 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b78 == false);

  }

  @Test
  public void test473() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test473"); }


    java.lang.Integer i1 = new java.lang.Integer("2");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 2+ "'", i1.equals(2));

  }

  @Test
  public void test474() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test474"); }


    java.lang.Integer i0 = null;
    // The following exception was thrown during execution in test generation
    try {
      tp2.IP iP4 = new tp2.IP(i0, (java.lang.Integer)(-2147390782), (java.lang.Integer)436207642, (java.lang.Integer)4194304);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test475() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test475"); }


    int i2 = java.lang.Integer.rotateLeft(14, 436207642);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 939524096);

  }

  @Test
  public void test476() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test476"); }


    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList0 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP5 = new tp2.IP((java.lang.Integer)150994944, (java.lang.Integer)784, (java.lang.Integer)784, (java.lang.Integer)2);
    java.lang.Integer i6 = iP5.getFourth();
    boolean b7 = strictlySortedSinglyLinkedList0.removeFromIP(iP5);
    tp2.SinglyLinkedList singlyLinkedList8 = new tp2.SinglyLinkedList();
    tp2.IP iP13 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i14 = iP13.getThird();
    boolean b15 = singlyLinkedList8.remove(iP13);
    java.lang.Integer i16 = iP13.getThird();
    boolean b17 = strictlySortedSinglyLinkedList0.removeFromIP(iP13);
    tp2.IPBan iPBan19 = strictlySortedSinglyLinkedList0.get(469762048);
    tp2.IPBan iPBan21 = strictlySortedSinglyLinkedList0.get(1100100);
    tp2.SinglyLinkedList singlyLinkedList22 = new tp2.SinglyLinkedList();
    tp2.IP iP27 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i28 = iP27.getThird();
    boolean b29 = singlyLinkedList22.remove(iP27);
    tp2.IPBan iPBan31 = new tp2.IPBan(iP27, (java.lang.Long)10L);
    java.lang.Long long32 = iPBan31.getExpires();
    iPBan31.setExpires((java.lang.Long)(-1L));
    java.lang.Long long35 = iPBan31.getExpires();
    java.lang.Long long36 = iPBan31.getExpires();
    boolean b37 = strictlySortedSinglyLinkedList0.contains(iPBan31);
    tp2.IP iP38 = iPBan31.getIp();
    tp2.IP iP39 = iPBan31.getIp();
    tp2.IP iP40 = iPBan31.getIp();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i6 + "' != '" + 2+ "'", i6.equals(2));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i14 + "' != '" + (-1)+ "'", i14.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i16 + "' != '" + (-1)+ "'", i16.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iPBan19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iPBan21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i28 + "' != '" + (-1)+ "'", i28.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long32 + "' != '" + 10L+ "'", long32.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long35 + "' != '" + (-1L)+ "'", long35.equals((-1L)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long36 + "' != '" + (-1L)+ "'", long36.equals((-1L)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP40);

  }

  @Test
  public void test477() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test477"); }


    tp2.SinglyLinkedList singlyLinkedList0 = new tp2.SinglyLinkedList();
    tp2.IP iP5 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i6 = iP5.getThird();
    boolean b7 = singlyLinkedList0.remove(iP5);
    tp2.IPBan iPBan9 = new tp2.IPBan(iP5, (java.lang.Long)10L);
    tp2.IP iP14 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i15 = iP14.getFourth();
    iPBan9.setIp(iP14);
    java.lang.Long long17 = iPBan9.getExpires();
    java.lang.Long long18 = iPBan9.getExpires();
    tp2.IP iP23 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i24 = iP23.getFirst();
    java.lang.Integer i25 = iP23.getSecond();
    iP23.setFirst((java.lang.Integer)201326592);
    iPBan9.setIp(iP23);
    tp2.SinglyLinkedList singlyLinkedList29 = new tp2.SinglyLinkedList();
    tp2.IP iP34 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i35 = iP34.getThird();
    boolean b36 = singlyLinkedList29.remove(iP34);
    boolean b37 = singlyLinkedList29.isEmpty();
    int i38 = singlyLinkedList29.getSize();
    tp2.IP iP43 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i44 = iP43.getThird();
    iP43.setFourth((java.lang.Integer)0);
    boolean b47 = singlyLinkedList29.contains(iP43);
    boolean b48 = singlyLinkedList29.isEmpty();
    tp2.IP iP53 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i54 = iP53.getFirst();
    java.lang.Integer i55 = iP53.getFirst();
    singlyLinkedList29.add(iP53);
    tp2.SinglyLinkedList singlyLinkedList57 = new tp2.SinglyLinkedList();
    tp2.IP iP62 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i63 = iP62.getThird();
    boolean b64 = singlyLinkedList57.remove(iP62);
    tp2.Server server65 = new tp2.Server();
    tp2.IP iP70 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    boolean b71 = server65.removeBan(iP70);
    boolean b72 = singlyLinkedList57.contains(iP70);
    singlyLinkedList29.add(iP70);
    iPBan9.setIp(iP70);
    java.lang.Integer i75 = iP70.getFourth();
    iP70.setFourth((java.lang.Integer)(-2147479552));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i6 + "' != '" + (-1)+ "'", i6.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i15 + "' != '" + 100+ "'", i15.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long17 + "' != '" + 10L+ "'", long17.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long18 + "' != '" + 10L+ "'", long18.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i24 + "' != '" + (-1)+ "'", i24.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i25 + "' != '" + (-1)+ "'", i25.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i35 + "' != '" + (-1)+ "'", i35.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i38 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i44 + "' != '" + (-1)+ "'", i44.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b47 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b48 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i54 + "' != '" + (-1)+ "'", i54.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i55 + "' != '" + (-1)+ "'", i55.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i63 + "' != '" + (-1)+ "'", i63.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b64 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b71 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b72 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i75 + "' != '" + 100+ "'", i75.equals(100));

  }

  @Test
  public void test478() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test478"); }


    tp2.Server server0 = new tp2.Server();
    boolean b1 = server0.notSharedElements();
    tp2.SinglyLinkedList singlyLinkedList2 = new tp2.SinglyLinkedList();
    tp2.IP iP7 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i8 = iP7.getThird();
    boolean b9 = singlyLinkedList2.remove(iP7);
    boolean b10 = server0.addException(iP7);
    tp2.SinglyLinkedList singlyLinkedList11 = new tp2.SinglyLinkedList();
    tp2.IP iP16 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i17 = iP16.getFourth();
    singlyLinkedList11.add(iP16);
    java.lang.Integer i19 = iP16.getFirst();
    boolean b20 = server0.removeBan(iP16);
    tp2.ITime iTime21 = null;
    server0.setTime(iTime21);
    boolean b23 = server0.bansSorted();
    tp2.IP iP28 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i29 = iP28.getFourth();
    iP28.setFirst((java.lang.Integer)16);
    boolean b32 = server0.addBan(iP28);
    boolean b33 = server0.exceptionsNotRepeated();
    boolean b34 = server0.bansOkTime();
    tp2.SinglyLinkedList singlyLinkedList35 = new tp2.SinglyLinkedList();
    tp2.IP iP40 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i41 = iP40.getThird();
    boolean b42 = singlyLinkedList35.remove(iP40);
    java.lang.Integer i43 = iP40.getThird();
    iP40.setFourth((java.lang.Integer)469762048);
    iP40.setSecond((java.lang.Integer)64);
    boolean b48 = server0.removeException(iP40);
    tp2.IP iP49 = null;
    boolean b50 = server0.addException(iP49);
    boolean b51 = server0.bansNotRepeatedExpirationOrIP();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i8 + "' != '" + (-1)+ "'", i8.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i17 + "' != '" + 100+ "'", i17.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i19 + "' != '" + (-1)+ "'", i19.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i29 + "' != '" + 100+ "'", i29.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i41 + "' != '" + (-1)+ "'", i41.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i43 + "' != '" + (-1)+ "'", i43.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b48 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b50 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b51 == true);

  }

  @Test
  public void test479() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test479"); }


    int i1 = java.lang.Integer.numberOfLeadingZeros(64);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 25);

  }

  @Test
  public void test480() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test480"); }


    long long1 = java.lang.Integer.toUnsignedLong(1073741824);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == 1073741824L);

  }

  @Test
  public void test481() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test481"); }


    int i2 = java.lang.Integer.rotateLeft((-1073741812), 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == (-1073741812));

  }

  @Test
  public void test482() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test482"); }


    tp2.Server server0 = new tp2.Server();
    boolean b1 = server0.notSharedElements();
    tp2.SinglyLinkedList singlyLinkedList2 = new tp2.SinglyLinkedList();
    tp2.IP iP7 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i8 = iP7.getThird();
    boolean b9 = singlyLinkedList2.remove(iP7);
    boolean b10 = server0.addException(iP7);
    tp2.SinglyLinkedList singlyLinkedList11 = new tp2.SinglyLinkedList();
    tp2.IP iP16 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i17 = iP16.getFourth();
    singlyLinkedList11.add(iP16);
    java.lang.Integer i19 = iP16.getFirst();
    boolean b20 = server0.removeBan(iP16);
    tp2.ITime iTime21 = null;
    server0.setTime(iTime21);
    boolean b23 = server0.bansSorted();
    tp2.IP iP28 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i29 = iP28.getFourth();
    iP28.setFirst((java.lang.Integer)16);
    boolean b32 = server0.addBan(iP28);
    boolean b33 = server0.bansOkTime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i8 + "' != '" + (-1)+ "'", i8.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i17 + "' != '" + 100+ "'", i17.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i19 + "' != '" + (-1)+ "'", i19.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i29 + "' != '" + 100+ "'", i29.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == true);

  }

  @Test
  public void test483() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test483"); }


    int i2 = java.lang.Integer.min(28, 26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 26);

  }

  @Test
  public void test484() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test484"); }


    int i2 = java.lang.Integer.rotateLeft(0, 44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);

  }

  @Test
  public void test485() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test485"); }


    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList0 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP5 = new tp2.IP((java.lang.Integer)150994944, (java.lang.Integer)784, (java.lang.Integer)784, (java.lang.Integer)2);
    java.lang.Integer i6 = iP5.getFourth();
    boolean b7 = strictlySortedSinglyLinkedList0.removeFromIP(iP5);
    boolean b8 = strictlySortedSinglyLinkedList0.isEmpty();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList9 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP14 = new tp2.IP((java.lang.Integer)150994944, (java.lang.Integer)784, (java.lang.Integer)784, (java.lang.Integer)2);
    java.lang.Integer i15 = iP14.getFourth();
    boolean b16 = strictlySortedSinglyLinkedList9.removeFromIP(iP14);
    tp2.SinglyLinkedList singlyLinkedList17 = new tp2.SinglyLinkedList();
    tp2.IP iP22 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i23 = iP22.getThird();
    boolean b24 = singlyLinkedList17.remove(iP22);
    java.lang.Integer i25 = iP22.getThird();
    boolean b26 = strictlySortedSinglyLinkedList9.removeFromIP(iP22);
    tp2.IPBan iPBan28 = strictlySortedSinglyLinkedList9.get(469762048);
    tp2.IPBan iPBan30 = strictlySortedSinglyLinkedList9.get(1100100);
    tp2.SinglyLinkedList singlyLinkedList31 = new tp2.SinglyLinkedList();
    tp2.IP iP36 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i37 = iP36.getThird();
    boolean b38 = singlyLinkedList31.remove(iP36);
    tp2.IPBan iPBan40 = new tp2.IPBan(iP36, (java.lang.Long)10L);
    java.lang.Long long41 = iPBan40.getExpires();
    iPBan40.setExpires((java.lang.Long)(-1L));
    java.lang.Long long44 = iPBan40.getExpires();
    java.lang.Long long45 = iPBan40.getExpires();
    boolean b46 = strictlySortedSinglyLinkedList9.contains(iPBan40);
    boolean b47 = strictlySortedSinglyLinkedList0.contains(iPBan40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i6 + "' != '" + 2+ "'", i6.equals(2));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i15 + "' != '" + 2+ "'", i15.equals(2));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i23 + "' != '" + (-1)+ "'", i23.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i25 + "' != '" + (-1)+ "'", i25.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iPBan28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iPBan30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i37 + "' != '" + (-1)+ "'", i37.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long41 + "' != '" + 10L+ "'", long41.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long44 + "' != '" + (-1L)+ "'", long44.equals((-1L)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long45 + "' != '" + (-1L)+ "'", long45.equals((-1L)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b46 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b47 == false);

  }

  @Test
  public void test486() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test486"); }


    int i1 = java.lang.Integer.reverseBytes(32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 536870912);

  }

  @Test
  public void test487() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test487"); }


    tp2.Server server0 = new tp2.Server();
    tp2.ITime iTime1 = null;
    server0.setTime(iTime1);
    tp2.ITime iTime3 = null;
    server0.setTime(iTime3);
    tp2.Server server5 = new tp2.Server();
    tp2.IP iP10 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    boolean b11 = server5.removeBan(iP10);
    java.lang.Integer i12 = iP10.getFirst();
    boolean b13 = server0.addException(iP10);
    iP10.setThird((java.lang.Integer)(-1073741824));
    java.lang.Integer i16 = iP10.getSecond();
    java.lang.Integer i17 = iP10.getFirst();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i12 + "' != '" + (-1)+ "'", i12.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i16 + "' != '" + (-1)+ "'", i16.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i17 + "' != '" + (-1)+ "'", i17.equals((-1)));

  }

  @Test
  public void test488() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test488"); }


    int i1 = java.lang.Integer.bitCount(536870912);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 1);

  }

  @Test
  public void test489() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test489"); }


    tp2.IP iP4 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i5 = iP4.getFirst();
    java.lang.Integer i6 = iP4.getSecond();
    iP4.setFirst((java.lang.Integer)201326592);
    tp2.IPBan iPBan10 = new tp2.IPBan(iP4, (java.lang.Long)727449600L);
    tp2.Server server11 = new tp2.Server();
    boolean b12 = server11.exceptionsNotRepeated();
    boolean b13 = server11.bansSorted();
    boolean b14 = server11.notSharedElements();
    boolean b15 = server11.bansSorted();
    server11.update();
    tp2.IP iP21 = new tp2.IP((java.lang.Integer)11100, (java.lang.Integer)40, (java.lang.Integer)28, (java.lang.Integer)727449600);
    boolean b22 = server11.addException(iP21);
    iPBan10.setIp(iP21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i5 + "' != '" + (-1)+ "'", i5.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i6 + "' != '" + (-1)+ "'", i6.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);

  }

  @Test
  public void test490() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test490"); }


    int i1 = java.lang.Integer.parseUnsignedInt("1400000000");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 1400000000);

  }

  @Test
  public void test491() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test491"); }


    tp2.Server server0 = new tp2.Server();
    tp2.ITime iTime1 = null;
    server0.setTime(iTime1);
    boolean b3 = server0.bansNotRepeatedExpirationOrIP();
    tp2.SinglyLinkedList singlyLinkedList4 = new tp2.SinglyLinkedList();
    tp2.IP iP9 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i10 = iP9.getThird();
    boolean b11 = singlyLinkedList4.remove(iP9);
    iP9.setSecond((java.lang.Integer)150994944);
    java.lang.Integer i14 = iP9.getFourth();
    java.lang.Integer i15 = iP9.getThird();
    java.lang.Integer i16 = iP9.getFirst();
    boolean b17 = server0.addException(iP9);
    boolean b18 = server0.bansOkTime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i10 + "' != '" + (-1)+ "'", i10.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i14 + "' != '" + 100+ "'", i14.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i15 + "' != '" + (-1)+ "'", i15.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i16 + "' != '" + (-1)+ "'", i16.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);

  }

  @Test
  public void test492() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test492"); }


    tp2.Server server0 = new tp2.Server();
    tp2.ITime iTime1 = null;
    server0.setTime(iTime1);
    tp2.Server server3 = new tp2.Server();
    boolean b4 = server3.notSharedElements();
    tp2.SinglyLinkedList singlyLinkedList5 = new tp2.SinglyLinkedList();
    tp2.IP iP10 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i11 = iP10.getThird();
    boolean b12 = singlyLinkedList5.remove(iP10);
    boolean b13 = server3.addException(iP10);
    java.lang.Integer i14 = iP10.getFirst();
    tp2.IPBan iPBan16 = new tp2.IPBan(iP10, (java.lang.Long)5L);
    boolean b17 = server0.connect(iP10);
    tp2.IP iP22 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i23 = iP22.getFourth();
    iP22.setFirst((java.lang.Integer)16);
    boolean b26 = server0.addBan(iP22);
    iP22.setFirst((java.lang.Integer)939524096);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i11 + "' != '" + (-1)+ "'", i11.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i14 + "' != '" + (-1)+ "'", i14.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i23 + "' != '" + 100+ "'", i23.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == true);

  }

  @Test
  public void test493() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test493"); }


    int i2 = java.lang.Integer.max(4194304, 11884);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 4194304);

  }

  @Test
  public void test494() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test494"); }


    java.lang.String str1 = java.lang.Integer.toUnsignedString(11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "11"+ "'", str1.equals("11"));

  }

  @Test
  public void test495() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test495"); }


    tp2.Server server0 = new tp2.Server();
    tp2.IP iP5 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    boolean b6 = server0.removeBan(iP5);
    tp2.IP iP11 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i12 = iP11.getThird();
    iP11.setFourth((java.lang.Integer)0);
    iP11.setSecond((java.lang.Integer)3);
    iP11.setFourth((java.lang.Integer)12);
    boolean b19 = server0.addBan(iP11);
    server0.update();
    boolean b21 = server0.bansOkTime();
    boolean b22 = server0.notSharedElements();
    tp2.SinglyLinkedList singlyLinkedList23 = new tp2.SinglyLinkedList();
    tp2.IP iP24 = null;
    boolean b25 = singlyLinkedList23.remove(iP24);
    boolean b26 = singlyLinkedList23.isEmpty();
    tp2.IP iP31 = new tp2.IP((java.lang.Integer)5, (java.lang.Integer)1, (java.lang.Integer)0, (java.lang.Integer)12);
    boolean b32 = singlyLinkedList23.contains(iP31);
    tp2.SinglyLinkedList singlyLinkedList33 = new tp2.SinglyLinkedList();
    tp2.IP iP38 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i39 = iP38.getThird();
    boolean b40 = singlyLinkedList33.remove(iP38);
    iP38.setSecond((java.lang.Integer)150994944);
    java.lang.Integer i43 = iP38.getFourth();
    java.lang.Integer i44 = iP38.getThird();
    java.lang.Integer i45 = iP38.getFirst();
    boolean b46 = singlyLinkedList23.contains(iP38);
    tp2.SinglyLinkedList singlyLinkedList47 = new tp2.SinglyLinkedList();
    tp2.IP iP52 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i53 = iP52.getThird();
    boolean b54 = singlyLinkedList47.remove(iP52);
    java.lang.Integer i55 = iP52.getThird();
    java.lang.Integer i56 = iP52.getSecond();
    boolean b57 = singlyLinkedList23.contains(iP52);
    boolean b58 = server0.addBan(iP52);
    iP52.setThird((java.lang.Integer)2809);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i12 + "' != '" + (-1)+ "'", i12.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i39 + "' != '" + (-1)+ "'", i39.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i43 + "' != '" + 100+ "'", i43.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i44 + "' != '" + (-1)+ "'", i44.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i45 + "' != '" + (-1)+ "'", i45.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b46 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i53 + "' != '" + (-1)+ "'", i53.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b54 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i55 + "' != '" + (-1)+ "'", i55.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i56 + "' != '" + (-1)+ "'", i56.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b57 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b58 == true);

  }

  @Test
  public void test496() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test496"); }


    java.lang.String str2 = java.lang.Integer.toUnsignedString(10, 1610612742);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "10"+ "'", str2.equals("10"));

  }

  @Test
  public void test497() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test497"); }


    int i2 = java.lang.Integer.min(4, 134217599);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 4);

  }

  @Test
  public void test498() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test498"); }


    int i2 = java.lang.Integer.divideUnsigned(167772260, 201326592);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);

  }

  @Test
  public void test499() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test499"); }


    int i1 = java.lang.Integer.numberOfLeadingZeros(4194304);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 9);

  }

  @Test
  public void test500() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test500"); }


    int i2 = java.lang.Integer.min(110011, 201326592);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 110011);

  }

}
