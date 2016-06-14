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


    int i2 = java.lang.Integer.min(524288, 28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 28);

  }

  @Test
  public void test002() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test002"); }


    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList0 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP5 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b6 = strictlySortedSinglyLinkedList0.containsIP(iP5);
    tp2.IP iP11 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList12 = new tp2.SinglyLinkedList();
    boolean b13 = iP11.equals((java.lang.Object)singlyLinkedList12);
    java.lang.Integer i14 = iP11.getThird();
    boolean b15 = strictlySortedSinglyLinkedList0.removeFromIP(iP11);
    tp2.IP iP16 = null;
    tp2.IPBan iPBan18 = new tp2.IPBan(iP16, (java.lang.Long)(-1L));
    boolean b19 = strictlySortedSinglyLinkedList0.contains(iPBan18);
    tp2.IPBan iPBan21 = strictlySortedSinglyLinkedList0.get(1);
    tp2.IP iP22 = null;
    tp2.IPBan iPBan24 = new tp2.IPBan(iP22, (java.lang.Long)0L);
    tp2.IP iP25 = iPBan24.getIp();
    boolean b26 = strictlySortedSinglyLinkedList0.contains(iPBan24);
    tp2.Server server27 = new tp2.Server();
    server27.update();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList29 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP34 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b35 = strictlySortedSinglyLinkedList29.containsIP(iP34);
    tp2.IP iP40 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList41 = new tp2.SinglyLinkedList();
    boolean b42 = iP40.equals((java.lang.Object)singlyLinkedList41);
    java.lang.Integer i43 = iP40.getThird();
    boolean b44 = strictlySortedSinglyLinkedList29.removeFromIP(iP40);
    boolean b46 = iP40.equals((java.lang.Object)0);
    java.lang.Integer i47 = iP40.getThird();
    java.lang.Integer i48 = iP40.getFirst();
    iP40.setFourth((java.lang.Integer)20971536);
    tp2.Server server51 = new tp2.Server();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList52 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP57 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b58 = strictlySortedSinglyLinkedList52.containsIP(iP57);
    java.lang.Integer i59 = iP57.getFourth();
    boolean b60 = server51.addException(iP57);
    boolean b61 = iP40.equals((java.lang.Object)iP57);
    boolean b62 = server27.removeException(iP57);
    boolean b63 = strictlySortedSinglyLinkedList0.removeFromIP(iP57);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList64 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP65 = null;
    tp2.IPBan iPBan67 = new tp2.IPBan(iP65, (java.lang.Long)0L);
    boolean b68 = strictlySortedSinglyLinkedList64.contains(iPBan67);
    tp2.IP iP73 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    java.lang.Integer i74 = iP73.getFourth();
    boolean b75 = strictlySortedSinglyLinkedList64.removeFromIP(iP73);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList76 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP77 = null;
    tp2.IPBan iPBan79 = new tp2.IPBan(iP77, (java.lang.Long)0L);
    boolean b80 = strictlySortedSinglyLinkedList76.contains(iPBan79);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList81 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP82 = null;
    tp2.IPBan iPBan84 = new tp2.IPBan(iP82, (java.lang.Long)0L);
    boolean b85 = strictlySortedSinglyLinkedList81.contains(iPBan84);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList86 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP91 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b92 = strictlySortedSinglyLinkedList86.containsIP(iP91);
    iP91.setFirst((java.lang.Integer)0);
    java.lang.Integer i95 = iP91.getSecond();
    iPBan84.setIp(iP91);
    boolean b97 = strictlySortedSinglyLinkedList76.contains(iPBan84);
    boolean b98 = strictlySortedSinglyLinkedList64.contains(iPBan84);
    boolean b99 = strictlySortedSinglyLinkedList0.contains(iPBan84);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i14 + "' != '" + 167772288+ "'", i14.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iPBan21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i43 + "' != '" + 167772288+ "'", i43.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b46 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i47 + "' != '" + 167772288+ "'", i47.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i48 + "' != '" + (-2147483638)+ "'", i48.equals((-2147483638)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b58 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i59 + "' != '" + 10+ "'", i59.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b60 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b61 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b62 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b63 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b68 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i74 + "' != '" + 10+ "'", i74.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b75 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b80 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b85 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b92 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i95 + "' != '" + 100+ "'", i95.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b97 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b98 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b99 == false);

  }

  @Test
  public void test003() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test003"); }


    java.lang.Integer i0 = null;
    // The following exception was thrown during execution in test generation
    try {
      tp2.IP iP4 = new tp2.IP(i0, (java.lang.Integer)124, (java.lang.Integer)500000102, (java.lang.Integer)13);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test004() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test004"); }


    int i2 = java.lang.Integer.sum(16777297, 2098181);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 18875478);

  }

  @Test
  public void test005() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test005"); }


    int i2 = java.lang.Integer.max(67112960, 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 67112960);

  }

  @Test
  public void test006() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test006"); }


    int i2 = java.lang.Integer.rotateRight((-803208192), (-803208192));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == (-803208192));

  }

  @Test
  public void test007() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test007"); }


    tp2.Server server0 = new tp2.Server();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList1 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP6 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b7 = strictlySortedSinglyLinkedList1.containsIP(iP6);
    tp2.IP iP12 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList13 = new tp2.SinglyLinkedList();
    boolean b14 = iP12.equals((java.lang.Object)singlyLinkedList13);
    java.lang.Integer i15 = iP12.getThird();
    boolean b16 = strictlySortedSinglyLinkedList1.removeFromIP(iP12);
    boolean b17 = server0.removeException(iP12);
    server0.update();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList19 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP24 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b25 = strictlySortedSinglyLinkedList19.containsIP(iP24);
    tp2.IP iP30 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList31 = new tp2.SinglyLinkedList();
    boolean b32 = iP30.equals((java.lang.Object)singlyLinkedList31);
    java.lang.Integer i33 = iP30.getThird();
    boolean b34 = strictlySortedSinglyLinkedList19.removeFromIP(iP30);
    boolean b36 = iP30.equals((java.lang.Object)0);
    tp2.IPBan iPBan38 = new tp2.IPBan(iP30, (java.lang.Long)100L);
    boolean b39 = server0.connect(iP30);
    java.lang.Integer i40 = iP30.getFourth();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i15 + "' != '" + 167772288+ "'", i15.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i33 + "' != '" + 167772288+ "'", i33.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i40 + "' != '" + 10+ "'", i40.equals(10));

  }

  @Test
  public void test008() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test008"); }


    java.lang.Integer i1 = java.lang.Integer.valueOf("81400010");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 81400010+ "'", i1.equals(81400010));

  }

  @Test
  public void test009() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test009"); }


    int i2 = java.lang.Integer.divideUnsigned(8, 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);

  }

  @Test
  public void test010() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test010"); }


    int i1 = java.lang.Integer.highestOneBit((-2147483638));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == (-2147483648));

  }

  @Test
  public void test011() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test011"); }


    // The following exception was thrown during execution in test generation
    try {
      int i2 = java.lang.Integer.parseInt("81400010", 124);
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test012() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test012"); }


    tp2.SinglyLinkedList singlyLinkedList0 = new tp2.SinglyLinkedList();
    boolean b1 = singlyLinkedList0.isEmpty();
    tp2.Server server2 = new tp2.Server();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList3 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP8 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b9 = strictlySortedSinglyLinkedList3.containsIP(iP8);
    tp2.IP iP14 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList15 = new tp2.SinglyLinkedList();
    boolean b16 = iP14.equals((java.lang.Object)singlyLinkedList15);
    java.lang.Integer i17 = iP14.getThird();
    boolean b18 = strictlySortedSinglyLinkedList3.removeFromIP(iP14);
    boolean b19 = server2.removeException(iP14);
    server2.update();
    tp2.ITime iTime21 = null;
    server2.setTime(iTime21);
    tp2.IP iP27 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList28 = new tp2.SinglyLinkedList();
    boolean b29 = iP27.equals((java.lang.Object)singlyLinkedList28);
    iP27.setSecond((java.lang.Integer)2);
    boolean b32 = server2.removeBan(iP27);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList33 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b34 = strictlySortedSinglyLinkedList33.isEmpty();
    tp2.IP iP39 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b40 = strictlySortedSinglyLinkedList33.removeFromIP(iP39);
    iP39.setThird((java.lang.Integer)41943073);
    boolean b43 = server2.removeException(iP39);
    boolean b44 = singlyLinkedList0.remove(iP39);
    int i45 = singlyLinkedList0.getSize();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i17 + "' != '" + 167772288+ "'", i17.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b43 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i45 == 0);

  }

  @Test
  public void test013() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test013"); }


    long long1 = java.lang.Integer.toUnsignedLong((-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == 4294967295L);

  }

  @Test
  public void test014() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test014"); }


    tp2.IP iP4 = new tp2.IP((java.lang.Integer)67109184, (java.lang.Integer)120000020, (java.lang.Integer)67109184, (java.lang.Integer)20971536);
    java.lang.Integer i5 = iP4.getFirst();
    iP4.setFirst((java.lang.Integer)131072);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i5 + "' != '" + 67109184+ "'", i5.equals(67109184));

  }

  @Test
  public void test015() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test015"); }


    int i2 = java.lang.Integer.compare(2098176, 240000041);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == (-1));

  }

  @Test
  public void test016() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test016"); }


    // The following exception was thrown during execution in test generation
    try {
      int i1 = java.lang.Integer.parseUnsignedInt("8000000a");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test017() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test017"); }


    // The following exception was thrown during execution in test generation
    try {
      int i2 = java.lang.Integer.parseUnsignedInt("7270e14", 2147483647);
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test018() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test018"); }


    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList0 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b1 = strictlySortedSinglyLinkedList0.isEmpty();
    tp2.IPBan iPBan3 = strictlySortedSinglyLinkedList0.get((-2147483648));
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList4 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP5 = null;
    tp2.IPBan iPBan7 = new tp2.IPBan(iP5, (java.lang.Long)0L);
    boolean b8 = strictlySortedSinglyLinkedList4.contains(iPBan7);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList9 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP10 = null;
    tp2.IPBan iPBan12 = new tp2.IPBan(iP10, (java.lang.Long)0L);
    boolean b13 = strictlySortedSinglyLinkedList9.contains(iPBan12);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList14 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP19 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b20 = strictlySortedSinglyLinkedList14.containsIP(iP19);
    iP19.setFirst((java.lang.Integer)0);
    java.lang.Integer i23 = iP19.getSecond();
    iPBan12.setIp(iP19);
    boolean b25 = strictlySortedSinglyLinkedList4.contains(iPBan12);
    boolean b26 = strictlySortedSinglyLinkedList0.add(iPBan12);
    boolean b27 = strictlySortedSinglyLinkedList0.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iPBan3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i23 + "' != '" + 100+ "'", i23.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);

  }

  @Test
  public void test019() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test019"); }


    java.lang.Integer i2 = java.lang.Integer.getInteger("12", 67108864);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i2 + "' != '" + 67108864+ "'", i2.equals(67108864));

  }

  @Test
  public void test020() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test020"); }


    // The following exception was thrown during execution in test generation
    try {
      java.lang.Integer i1 = new java.lang.Integer("1000000000000000000000000000000");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test021() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test021"); }


    tp2.IP iP4 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    java.lang.Integer i5 = iP4.getFourth();
    java.lang.Integer i6 = iP4.getThird();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList7 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP12 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b13 = strictlySortedSinglyLinkedList7.containsIP(iP12);
    tp2.IP iP18 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList19 = new tp2.SinglyLinkedList();
    boolean b20 = iP18.equals((java.lang.Object)singlyLinkedList19);
    java.lang.Integer i21 = iP18.getThird();
    boolean b22 = strictlySortedSinglyLinkedList7.removeFromIP(iP18);
    tp2.IP iP23 = null;
    tp2.IPBan iPBan25 = new tp2.IPBan(iP23, (java.lang.Long)(-1L));
    boolean b26 = strictlySortedSinglyLinkedList7.contains(iPBan25);
    tp2.IPBan iPBan28 = strictlySortedSinglyLinkedList7.get((-2147483648));
    boolean b29 = iP4.equals((java.lang.Object)strictlySortedSinglyLinkedList7);
    java.lang.Integer i30 = iP4.getFourth();
    iP4.setFirst((java.lang.Integer)1107296261);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i5 + "' != '" + 10+ "'", i5.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i6 + "' != '" + 167772288+ "'", i6.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i21 + "' != '" + 167772288+ "'", i21.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iPBan28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i30 + "' != '" + 10+ "'", i30.equals(10));

  }

  @Test
  public void test022() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test022"); }


    java.lang.String str2 = java.lang.Integer.toUnsignedString(60000010, 81400010);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "60000010"+ "'", str2.equals("60000010"));

  }

  @Test
  public void test023() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test023"); }


    java.lang.Integer i1 = new java.lang.Integer(12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 12+ "'", i1.equals(12));

  }

  @Test
  public void test024() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test024"); }


    // The following exception was thrown during execution in test generation
    try {
      java.lang.Integer i2 = java.lang.Integer.valueOf("83886146", 271056898);
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test025() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test025"); }


    int i1 = java.lang.Integer.numberOfLeadingZeros(26214);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 17);

  }

  @Test
  public void test026() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test026"); }


    int i1 = java.lang.Integer.numberOfTrailingZeros(8388608);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 23);

  }

  @Test
  public void test027() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test027"); }


    int i1 = java.lang.Integer.numberOfTrailingZeros(1100100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 2);

  }

  @Test
  public void test028() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test028"); }


    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList0 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP5 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b6 = strictlySortedSinglyLinkedList0.containsIP(iP5);
    tp2.IP iP11 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList12 = new tp2.SinglyLinkedList();
    boolean b13 = iP11.equals((java.lang.Object)singlyLinkedList12);
    java.lang.Integer i14 = iP11.getThird();
    boolean b15 = strictlySortedSinglyLinkedList0.removeFromIP(iP11);
    int i16 = strictlySortedSinglyLinkedList0.getSize();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList17 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP22 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b23 = strictlySortedSinglyLinkedList17.containsIP(iP22);
    java.lang.Integer i24 = iP22.getFourth();
    tp2.IPBan iPBan26 = new tp2.IPBan(iP22, (java.lang.Long)0L);
    boolean b27 = strictlySortedSinglyLinkedList0.add(iPBan26);
    java.lang.Long long28 = iPBan26.getExpires();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i14 + "' != '" + 167772288+ "'", i14.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i24 + "' != '" + 10+ "'", i24.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L+ "'", long28.equals(0L));

  }

  @Test
  public void test029() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test029"); }


    int i1 = java.lang.Integer.bitCount(67109184);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 3);

  }

  @Test
  public void test030() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test030"); }


    int i1 = java.lang.Integer.parseUnsignedInt("7");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 7);

  }

  @Test
  public void test031() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test031"); }


    int i1 = java.lang.Integer.lowestOneBit(336471815);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 1);

  }

  @Test
  public void test032() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test032"); }


    tp2.Server server0 = new tp2.Server();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList1 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP6 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b7 = strictlySortedSinglyLinkedList1.containsIP(iP6);
    tp2.IP iP12 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList13 = new tp2.SinglyLinkedList();
    boolean b14 = iP12.equals((java.lang.Object)singlyLinkedList13);
    java.lang.Integer i15 = iP12.getThird();
    boolean b16 = strictlySortedSinglyLinkedList1.removeFromIP(iP12);
    boolean b17 = server0.removeException(iP12);
    server0.update();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList19 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP24 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b25 = strictlySortedSinglyLinkedList19.containsIP(iP24);
    iP24.setSecond((java.lang.Integer)(-2147483638));
    java.lang.Integer i28 = iP24.getFourth();
    java.lang.Integer i29 = iP24.getFirst();
    iP24.setFirst((java.lang.Integer)20971536);
    boolean b32 = server0.addException(iP24);
    java.lang.Integer i33 = null;
    iP24.setThird(i33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i15 + "' != '" + 167772288+ "'", i15.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i28 + "' != '" + 10+ "'", i28.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i29 + "' != '" + (-2147483638)+ "'", i29.equals((-2147483638)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == true);

  }

  @Test
  public void test033() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test033"); }


    int i2 = java.lang.Integer.compareUnsigned(25, 134218369);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == (-1));

  }

  @Test
  public void test034() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test034"); }


    int i1 = java.lang.Integer.numberOfLeadingZeros((-2147483636));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);

  }

  @Test
  public void test035() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test035"); }


    int i2 = java.lang.Integer.sum(953344, 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 953355);

  }

  @Test
  public void test036() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test036"); }


    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList0 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP5 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b6 = strictlySortedSinglyLinkedList0.containsIP(iP5);
    tp2.IP iP11 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList12 = new tp2.SinglyLinkedList();
    boolean b13 = iP11.equals((java.lang.Object)singlyLinkedList12);
    java.lang.Integer i14 = iP11.getThird();
    boolean b15 = strictlySortedSinglyLinkedList0.removeFromIP(iP11);
    tp2.IP iP16 = null;
    tp2.IPBan iPBan18 = new tp2.IPBan(iP16, (java.lang.Long)(-1L));
    boolean b19 = strictlySortedSinglyLinkedList0.contains(iPBan18);
    tp2.IPBan iPBan21 = strictlySortedSinglyLinkedList0.get((-2147483648));
    tp2.IPBan iPBan23 = strictlySortedSinglyLinkedList0.get(0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i14 + "' != '" + 167772288+ "'", i14.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iPBan21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iPBan23);

  }

  @Test
  public void test037() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test037"); }


    int i2 = java.lang.Integer.min(67109184, 16384);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 16384);

  }

  @Test
  public void test038() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test038"); }


    int i2 = java.lang.Integer.rotateLeft(2098192, 3691036);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 131137);

  }

  @Test
  public void test039() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test039"); }


    java.lang.String str1 = java.lang.Integer.toBinaryString(134218369);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "1000000000000000001010000001"+ "'", str1.equals("1000000000000000001010000001"));

  }

  @Test
  public void test040() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test040"); }


    int i2 = java.lang.Integer.max(6, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 6);

  }

  @Test
  public void test041() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test041"); }


    int i2 = java.lang.Integer.rotateLeft(27, (-2147483636));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 110592);

  }

  @Test
  public void test042() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test042"); }


    tp2.IP iP4 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList5 = new tp2.SinglyLinkedList();
    boolean b6 = iP4.equals((java.lang.Object)singlyLinkedList5);
    iP4.setSecond((java.lang.Integer)2);
    iP4.setFourth((java.lang.Integer)10941);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);

  }

  @Test
  public void test043() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test043"); }


    java.lang.Integer i1 = java.lang.Integer.getInteger("10000001010000000000000000010000");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);

  }

  @Test
  public void test044() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test044"); }


    tp2.Server server0 = new tp2.Server();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList1 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP6 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b7 = strictlySortedSinglyLinkedList1.containsIP(iP6);
    tp2.IP iP12 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList13 = new tp2.SinglyLinkedList();
    boolean b14 = iP12.equals((java.lang.Object)singlyLinkedList13);
    java.lang.Integer i15 = iP12.getThird();
    boolean b16 = strictlySortedSinglyLinkedList1.removeFromIP(iP12);
    boolean b17 = server0.removeException(iP12);
    server0.update();
    tp2.ITime iTime19 = null;
    server0.setTime(iTime19);
    tp2.Server server21 = new tp2.Server();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList22 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP27 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b28 = strictlySortedSinglyLinkedList22.containsIP(iP27);
    tp2.IP iP33 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList34 = new tp2.SinglyLinkedList();
    boolean b35 = iP33.equals((java.lang.Object)singlyLinkedList34);
    java.lang.Integer i36 = iP33.getThird();
    boolean b37 = strictlySortedSinglyLinkedList22.removeFromIP(iP33);
    boolean b38 = server21.removeException(iP33);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList39 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP44 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b45 = strictlySortedSinglyLinkedList39.containsIP(iP44);
    tp2.IPBan iPBan47 = strictlySortedSinglyLinkedList39.get((-1));
    tp2.IP iP52 = new tp2.IP((java.lang.Integer)10, (java.lang.Integer)10, (java.lang.Integer)1, (java.lang.Integer)10);
    tp2.IPBan iPBan54 = new tp2.IPBan(iP52, (java.lang.Long)100L);
    boolean b55 = strictlySortedSinglyLinkedList39.removeFromIP(iP52);
    boolean b56 = server21.removeBan(iP52);
    boolean b57 = server0.addException(iP52);
    iP52.setFirst((java.lang.Integer)83886144);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i15 + "' != '" + 167772288+ "'", i15.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i36 + "' != '" + 167772288+ "'", i36.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iPBan47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b55 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b56 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b57 == true);

  }

  @Test
  public void test045() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test045"); }


    int i2 = java.lang.Integer.sum(1, 10941);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 10942);

  }

  @Test
  public void test046() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test046"); }


    int i1 = java.lang.Integer.bitCount(1073745921);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 3);

  }

  @Test
  public void test047() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test047"); }


    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList0 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP1 = null;
    tp2.IPBan iPBan3 = new tp2.IPBan(iP1, (java.lang.Long)0L);
    boolean b4 = strictlySortedSinglyLinkedList0.contains(iPBan3);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList5 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP10 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b11 = strictlySortedSinglyLinkedList5.containsIP(iP10);
    iP10.setFirst((java.lang.Integer)0);
    java.lang.Integer i14 = iP10.getSecond();
    iPBan3.setIp(iP10);
    iPBan3.setExpires((java.lang.Long)100L);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList18 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b19 = strictlySortedSinglyLinkedList18.isEmpty();
    tp2.IP iP24 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b25 = strictlySortedSinglyLinkedList18.removeFromIP(iP24);
    iPBan3.setIp(iP24);
    tp2.IP iP27 = iPBan3.getIp();
    iPBan3.setExpires((java.lang.Long)10L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i14 + "' != '" + 100+ "'", i14.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP27);

  }

  @Test
  public void test048() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test048"); }


    // The following exception was thrown during execution in test generation
    try {
      java.lang.Integer i2 = java.lang.Integer.valueOf("1000000000000000001010000001", 120000020);
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test049() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test049"); }


    java.lang.String str2 = java.lang.Integer.toUnsignedString(17, 40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "17"+ "'", str2.equals("17"));

  }

  @Test
  public void test050() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test050"); }


    int i2 = java.lang.Integer.max(268451841, 2098192);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 268451841);

  }

  @Test
  public void test051() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test051"); }


    int i2 = java.lang.Integer.compare(336471815, (-2147483625));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);

  }

  @Test
  public void test052() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test052"); }


    int i1 = java.lang.Integer.signum(271056898);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 1);

  }

  @Test
  public void test053() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test053"); }


    java.lang.String str1 = java.lang.Integer.toUnsignedString(72);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "72"+ "'", str1.equals("72"));

  }

  @Test
  public void test054() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test054"); }


    // The following exception was thrown during execution in test generation
    try {
      int i2 = java.lang.Integer.parseUnsignedInt("83886146", (-805306368));
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test055() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test055"); }


    int i1 = java.lang.Integer.highestOneBit(7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 4);

  }

  @Test
  public void test056() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test056"); }


    int i2 = java.lang.Integer.max(28, 131137);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 131137);

  }

  @Test
  public void test057() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test057"); }


    java.lang.Integer i1 = java.lang.Integer.valueOf("5");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 5+ "'", i1.equals(5));

  }

  @Test
  public void test058() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test058"); }


    int i1 = java.lang.Integer.parseInt("4");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 4);

  }

  @Test
  public void test059() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test059"); }


    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList0 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b1 = strictlySortedSinglyLinkedList0.isEmpty();
    tp2.IP iP6 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b7 = strictlySortedSinglyLinkedList0.removeFromIP(iP6);
    tp2.IP iP12 = new tp2.IP((java.lang.Integer)10, (java.lang.Integer)10, (java.lang.Integer)1, (java.lang.Integer)10);
    tp2.IPBan iPBan14 = new tp2.IPBan(iP12, (java.lang.Long)100L);
    boolean b15 = strictlySortedSinglyLinkedList0.contains(iPBan14);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList16 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP21 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b22 = strictlySortedSinglyLinkedList16.containsIP(iP21);
    iP21.setSecond((java.lang.Integer)(-2147483638));
    tp2.IPBan iPBan26 = new tp2.IPBan(iP21, (java.lang.Long)0L);
    boolean b27 = strictlySortedSinglyLinkedList0.contains(iPBan26);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList28 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b29 = strictlySortedSinglyLinkedList28.isEmpty();
    tp2.IP iP34 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b35 = strictlySortedSinglyLinkedList28.removeFromIP(iP34);
    tp2.IP iP40 = new tp2.IP((java.lang.Integer)10, (java.lang.Integer)10, (java.lang.Integer)1, (java.lang.Integer)10);
    tp2.IPBan iPBan42 = new tp2.IPBan(iP40, (java.lang.Long)100L);
    boolean b43 = strictlySortedSinglyLinkedList28.contains(iPBan42);
    boolean b44 = strictlySortedSinglyLinkedList0.add(iPBan42);
    tp2.SinglyLinkedList singlyLinkedList45 = new tp2.SinglyLinkedList();
    int i46 = singlyLinkedList45.getSize();
    tp2.IP iP47 = null;
    singlyLinkedList45.add(iP47);
    tp2.IP iP53 = new tp2.IP((java.lang.Integer)10, (java.lang.Integer)10, (java.lang.Integer)1, (java.lang.Integer)10);
    singlyLinkedList45.add(iP53);
    boolean b55 = strictlySortedSinglyLinkedList0.containsIP(iP53);
    tp2.IP iP60 = new tp2.IP((java.lang.Integer)67109184, (java.lang.Integer)120000020, (java.lang.Integer)67109184, (java.lang.Integer)20971536);
    java.lang.Integer i61 = iP60.getFirst();
    java.lang.Integer i62 = iP60.getFourth();
    boolean b63 = strictlySortedSinglyLinkedList0.removeFromIP(iP60);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b43 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i46 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b55 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i61 + "' != '" + 67109184+ "'", i61.equals(67109184));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i62 + "' != '" + 20971536+ "'", i62.equals(20971536));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b63 == true);

  }

  @Test
  public void test060() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test060"); }


    int i2 = java.lang.Integer.rotateLeft(41943073, 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 41943073);

  }

  @Test
  public void test061() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test061"); }


    // The following exception was thrown during execution in test generation
    try {
      int i2 = java.lang.Integer.parseUnsignedInt("17", (-1979711360));
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test062() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test062"); }


    tp2.Server server0 = new tp2.Server();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList1 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP6 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b7 = strictlySortedSinglyLinkedList1.containsIP(iP6);
    iP6.setSecond((java.lang.Integer)(-2147483638));
    java.lang.Integer i10 = iP6.getFourth();
    java.lang.Integer i11 = iP6.getFirst();
    boolean b12 = server0.connect(iP6);
    tp2.ITime iTime13 = null;
    server0.setTime(iTime13);
    tp2.ITime iTime15 = null;
    server0.setTime(iTime15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i10 + "' != '" + 10+ "'", i10.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i11 + "' != '" + (-2147483638)+ "'", i11.equals((-2147483638)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);

  }

  @Test
  public void test063() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test063"); }


    // The following exception was thrown during execution in test generation
    try {
      int i2 = java.lang.Integer.parseUnsignedInt("", 1000);
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

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test064"); }


    int i2 = java.lang.Integer.rotateRight(27, 120000020);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 110592);

  }

  @Test
  public void test065() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test065"); }


    // The following exception was thrown during execution in test generation
    try {
      korat.finitization.IFinitization iFinitization1 = tp2.Server.finServer(124);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test066() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test066"); }


    java.lang.Integer i1 = null;
    java.lang.Integer i2 = java.lang.Integer.getInteger("120000020", i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i2);

  }

  @Test
  public void test067() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test067"); }


    // The following exception was thrown during execution in test generation
    try {
      java.lang.Integer i2 = java.lang.Integer.valueOf("34", 26214);
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

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test068"); }


    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList0 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IPBan iPBan2 = strictlySortedSinglyLinkedList0.get(28);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList3 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP8 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b9 = strictlySortedSinglyLinkedList3.containsIP(iP8);
    tp2.IP iP14 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList15 = new tp2.SinglyLinkedList();
    boolean b16 = iP14.equals((java.lang.Object)singlyLinkedList15);
    java.lang.Integer i17 = iP14.getThird();
    boolean b18 = strictlySortedSinglyLinkedList3.removeFromIP(iP14);
    tp2.IP iP19 = null;
    tp2.IPBan iPBan21 = new tp2.IPBan(iP19, (java.lang.Long)(-1L));
    boolean b22 = strictlySortedSinglyLinkedList3.contains(iPBan21);
    tp2.IPBan iPBan24 = strictlySortedSinglyLinkedList3.get(1);
    tp2.IP iP25 = null;
    tp2.IPBan iPBan27 = new tp2.IPBan(iP25, (java.lang.Long)0L);
    tp2.IP iP28 = iPBan27.getIp();
    boolean b29 = strictlySortedSinglyLinkedList3.contains(iPBan27);
    tp2.Server server30 = new tp2.Server();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList31 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP36 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b37 = strictlySortedSinglyLinkedList31.containsIP(iP36);
    iP36.setSecond((java.lang.Integer)(-2147483638));
    java.lang.Integer i40 = iP36.getFourth();
    java.lang.Integer i41 = iP36.getFirst();
    boolean b42 = server30.connect(iP36);
    boolean b43 = strictlySortedSinglyLinkedList3.containsIP(iP36);
    boolean b44 = strictlySortedSinglyLinkedList0.removeFromIP(iP36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iPBan2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i17 + "' != '" + 167772288+ "'", i17.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iPBan24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i40 + "' != '" + 10+ "'", i40.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i41 + "' != '" + (-2147483638)+ "'", i41.equals((-2147483638)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b43 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == false);

  }

  @Test
  public void test069() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test069"); }


    java.lang.Integer i1 = java.lang.Integer.valueOf("4");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 4+ "'", i1.equals(4));

  }

  @Test
  public void test070() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test070"); }


    int i1 = java.lang.Integer.bitCount(500000102);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 17);

  }

  @Test
  public void test071() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test071"); }


    java.lang.Integer i2 = java.lang.Integer.getInteger("81400010", 124);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i2 + "' != '" + 124+ "'", i2.equals(124));

  }

  @Test
  public void test072() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test072"); }


    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList0 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP1 = null;
    tp2.IPBan iPBan3 = new tp2.IPBan(iP1, (java.lang.Long)0L);
    boolean b4 = strictlySortedSinglyLinkedList0.contains(iPBan3);
    tp2.IP iP9 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    java.lang.Integer i10 = iP9.getFourth();
    boolean b11 = strictlySortedSinglyLinkedList0.removeFromIP(iP9);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList12 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP17 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b18 = strictlySortedSinglyLinkedList12.containsIP(iP17);
    tp2.IP iP23 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList24 = new tp2.SinglyLinkedList();
    boolean b25 = iP23.equals((java.lang.Object)singlyLinkedList24);
    java.lang.Integer i26 = iP23.getThird();
    boolean b27 = strictlySortedSinglyLinkedList12.removeFromIP(iP23);
    boolean b29 = iP23.equals((java.lang.Object)0);
    java.lang.Integer i30 = iP23.getThird();
    java.lang.Integer i31 = iP23.getFirst();
    boolean b32 = strictlySortedSinglyLinkedList0.containsIP(iP23);
    int i33 = strictlySortedSinglyLinkedList0.getSize();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i10 + "' != '" + 10+ "'", i10.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i26 + "' != '" + 167772288+ "'", i26.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i30 + "' != '" + 167772288+ "'", i30.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i31 + "' != '" + (-2147483638)+ "'", i31.equals((-2147483638)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 0);

  }

  @Test
  public void test073() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test073"); }


    int i2 = java.lang.Integer.rotateRight(13, 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 13);

  }

  @Test
  public void test074() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test074"); }


    int i2 = java.lang.Integer.compare(953355, 83886080);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == (-1));

  }

  @Test
  public void test075() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test075"); }


    int i2 = java.lang.Integer.remainderUnsigned(24, 131072);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 24);

  }

  @Test
  public void test076() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test076"); }


    java.lang.Integer i1 = java.lang.Integer.getInteger("4000");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);

  }

  @Test
  public void test077() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test077"); }


    int i2 = java.lang.Integer.divideUnsigned(0, 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);

  }

  @Test
  public void test078() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test078"); }


    // The following exception was thrown during execution in test generation
    try {
      int i2 = java.lang.Integer.parseUnsignedInt("20000000000", 953355);
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

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test079"); }


    java.lang.String str1 = java.lang.Integer.toOctalString(7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "7"+ "'", str1.equals("7"));

  }

  @Test
  public void test080() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test080"); }


    tp2.Server server0 = new tp2.Server();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList1 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP6 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b7 = strictlySortedSinglyLinkedList1.containsIP(iP6);
    tp2.IP iP12 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList13 = new tp2.SinglyLinkedList();
    boolean b14 = iP12.equals((java.lang.Object)singlyLinkedList13);
    java.lang.Integer i15 = iP12.getThird();
    boolean b16 = strictlySortedSinglyLinkedList1.removeFromIP(iP12);
    boolean b17 = server0.removeException(iP12);
    server0.update();
    tp2.ITime iTime19 = null;
    server0.setTime(iTime19);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList21 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP26 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b27 = strictlySortedSinglyLinkedList21.containsIP(iP26);
    tp2.IPBan iPBan29 = strictlySortedSinglyLinkedList21.get((-1));
    tp2.IP iP34 = new tp2.IP((java.lang.Integer)10, (java.lang.Integer)10, (java.lang.Integer)1, (java.lang.Integer)10);
    tp2.IPBan iPBan36 = new tp2.IPBan(iP34, (java.lang.Long)100L);
    boolean b37 = strictlySortedSinglyLinkedList21.removeFromIP(iP34);
    tp2.IP iP42 = new tp2.IP((java.lang.Integer)10, (java.lang.Integer)10, (java.lang.Integer)1, (java.lang.Integer)10);
    tp2.IPBan iPBan44 = new tp2.IPBan(iP42, (java.lang.Long)100L);
    boolean b45 = strictlySortedSinglyLinkedList21.removeFromIP(iP42);
    boolean b46 = server0.addException(iP42);
    boolean b47 = server0.notSharedElements();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i15 + "' != '" + 167772288+ "'", i15.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iPBan29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b46 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b47 == true);

  }

  @Test
  public void test081() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test081"); }


    int i1 = java.lang.Integer.signum(13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 1);

  }

  @Test
  public void test082() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test082"); }


    tp2.Server server0 = new tp2.Server();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList1 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP6 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b7 = strictlySortedSinglyLinkedList1.containsIP(iP6);
    java.lang.Integer i8 = iP6.getFourth();
    boolean b9 = server0.addException(iP6);
    tp2.ITime iTime10 = null;
    server0.setTime(iTime10);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList12 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP17 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b18 = strictlySortedSinglyLinkedList12.containsIP(iP17);
    boolean b19 = server0.removeException(iP17);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList20 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP25 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b26 = strictlySortedSinglyLinkedList20.containsIP(iP25);
    iP25.setFirst((java.lang.Integer)0);
    java.lang.Integer i29 = iP25.getSecond();
    iP25.setFourth((java.lang.Integer)83886146);
    boolean b32 = server0.removeException(iP25);
    tp2.Server server33 = new tp2.Server();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList34 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP39 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b40 = strictlySortedSinglyLinkedList34.containsIP(iP39);
    tp2.IP iP45 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList46 = new tp2.SinglyLinkedList();
    boolean b47 = iP45.equals((java.lang.Object)singlyLinkedList46);
    java.lang.Integer i48 = iP45.getThird();
    boolean b49 = strictlySortedSinglyLinkedList34.removeFromIP(iP45);
    boolean b50 = server33.removeException(iP45);
    server33.update();
    tp2.ITime iTime52 = null;
    server33.setTime(iTime52);
    tp2.IP iP58 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList59 = new tp2.SinglyLinkedList();
    boolean b60 = iP58.equals((java.lang.Object)singlyLinkedList59);
    iP58.setSecond((java.lang.Integer)2);
    boolean b63 = server33.removeBan(iP58);
    boolean b64 = server0.addException(iP58);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList65 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP66 = null;
    tp2.IPBan iPBan68 = new tp2.IPBan(iP66, (java.lang.Long)0L);
    boolean b69 = strictlySortedSinglyLinkedList65.contains(iPBan68);
    tp2.IP iP74 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList75 = new tp2.SinglyLinkedList();
    boolean b76 = iP74.equals((java.lang.Object)singlyLinkedList75);
    java.lang.Integer i77 = iP74.getThird();
    java.lang.Integer i78 = iP74.getSecond();
    java.lang.Integer i79 = null;
    iP74.setFirst(i79);
    iPBan68.setIp(iP74);
    // The following exception was thrown during execution in test generation
    try {
      boolean b82 = server0.addException(iP74);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i8 + "' != '" + 10+ "'", i8.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i29 + "' != '" + 100+ "'", i29.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b47 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i48 + "' != '" + 167772288+ "'", i48.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b49 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b50 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b60 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b63 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b64 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b69 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b76 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i77 + "' != '" + 167772288+ "'", i77.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i78 + "' != '" + 100+ "'", i78.equals(100));

  }

  @Test
  public void test083() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test083"); }


    int i1 = java.lang.Integer.lowestOneBit(11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 1);

  }

  @Test
  public void test084() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test084"); }


    int i2 = java.lang.Integer.rotateLeft(500000102, 16777297);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == (-892585062));

  }

  @Test
  public void test085() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test085"); }


    int i1 = java.lang.Integer.signum((-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == (-1));

  }

  @Test
  public void test086() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test086"); }


    int i2 = java.lang.Integer.sum(336471815, 16384);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 336488199);

  }

  @Test
  public void test087() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test087"); }


    int i1 = java.lang.Integer.signum(23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 1);

  }

  @Test
  public void test088() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test088"); }


    int i2 = java.lang.Integer.rotateRight(262144, 41943073);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 131072);

  }

  @Test
  public void test089() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test089"); }


    java.lang.Integer i2 = java.lang.Integer.getInteger("ffffffff", 262144);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i2 + "' != '" + 262144+ "'", i2.equals(262144));

  }

  @Test
  public void test090() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test090"); }


    java.lang.String str1 = java.lang.Integer.toUnsignedString(10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "10"+ "'", str1.equals("10"));

  }

  @Test
  public void test091() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test091"); }


    java.lang.Integer i1 = java.lang.Integer.valueOf(271056898);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 271056898+ "'", i1.equals(271056898));

  }

  @Test
  public void test092() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test092"); }


    java.lang.Integer i1 = java.lang.Integer.getInteger("50");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);

  }

  @Test
  public void test093() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test093"); }


    // The following exception was thrown during execution in test generation
    try {
      java.lang.Integer i1 = java.lang.Integer.decode("10002000000");
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

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test094"); }


    tp2.Server server0 = new tp2.Server();
    server0.update();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList2 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP7 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b8 = strictlySortedSinglyLinkedList2.containsIP(iP7);
    tp2.IP iP13 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList14 = new tp2.SinglyLinkedList();
    boolean b15 = iP13.equals((java.lang.Object)singlyLinkedList14);
    java.lang.Integer i16 = iP13.getThird();
    boolean b17 = strictlySortedSinglyLinkedList2.removeFromIP(iP13);
    boolean b19 = iP13.equals((java.lang.Object)0);
    java.lang.Integer i20 = iP13.getThird();
    java.lang.Integer i21 = iP13.getFirst();
    iP13.setFourth((java.lang.Integer)20971536);
    tp2.Server server24 = new tp2.Server();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList25 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP30 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b31 = strictlySortedSinglyLinkedList25.containsIP(iP30);
    java.lang.Integer i32 = iP30.getFourth();
    boolean b33 = server24.addException(iP30);
    boolean b34 = iP13.equals((java.lang.Object)iP30);
    boolean b35 = server0.removeException(iP30);
    iP30.setThird((java.lang.Integer)11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i16 + "' != '" + 167772288+ "'", i16.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i20 + "' != '" + 167772288+ "'", i20.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i21 + "' != '" + (-2147483638)+ "'", i21.equals((-2147483638)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i32 + "' != '" + 10+ "'", i32.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == false);

  }

  @Test
  public void test095() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test095"); }


    java.lang.String str1 = java.lang.Integer.toUnsignedString((-1121320960));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "3173646336"+ "'", str1.equals("3173646336"));

  }

  @Test
  public void test096() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test096"); }


    // The following exception was thrown during execution in test generation
    try {
      java.lang.Integer i1 = java.lang.Integer.valueOf("20000000012");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test097() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test097"); }


    // The following exception was thrown during execution in test generation
    try {
      java.lang.Integer i2 = java.lang.Integer.valueOf("11011", 336471815);
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test098() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test098"); }


    tp2.Server server0 = new tp2.Server();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList1 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP6 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b7 = strictlySortedSinglyLinkedList1.containsIP(iP6);
    tp2.IP iP12 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList13 = new tp2.SinglyLinkedList();
    boolean b14 = iP12.equals((java.lang.Object)singlyLinkedList13);
    java.lang.Integer i15 = iP12.getThird();
    boolean b16 = strictlySortedSinglyLinkedList1.removeFromIP(iP12);
    boolean b17 = server0.removeException(iP12);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList18 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP23 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b24 = strictlySortedSinglyLinkedList18.containsIP(iP23);
    tp2.IPBan iPBan26 = strictlySortedSinglyLinkedList18.get((-1));
    tp2.IP iP31 = new tp2.IP((java.lang.Integer)10, (java.lang.Integer)10, (java.lang.Integer)1, (java.lang.Integer)10);
    tp2.IPBan iPBan33 = new tp2.IPBan(iP31, (java.lang.Long)100L);
    boolean b34 = strictlySortedSinglyLinkedList18.removeFromIP(iP31);
    boolean b35 = server0.removeBan(iP31);
    java.lang.Integer i36 = iP31.getFirst();
    iP31.setFourth((java.lang.Integer)2098181);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i15 + "' != '" + 167772288+ "'", i15.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iPBan26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i36 + "' != '" + 10+ "'", i36.equals(10));

  }

  @Test
  public void test099() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test099"); }


    java.lang.Integer i1 = java.lang.Integer.valueOf("1073741824");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 1073741824+ "'", i1.equals(1073741824));

  }

  @Test
  public void test100() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test100"); }


    java.lang.Integer i1 = java.lang.Integer.getInteger("2abd");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);

  }

  @Test
  public void test101() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test101"); }


    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList0 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b1 = strictlySortedSinglyLinkedList0.isEmpty();
    tp2.IP iP6 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b7 = strictlySortedSinglyLinkedList0.removeFromIP(iP6);
    tp2.IP iP12 = new tp2.IP((java.lang.Integer)10, (java.lang.Integer)10, (java.lang.Integer)1, (java.lang.Integer)10);
    tp2.IPBan iPBan14 = new tp2.IPBan(iP12, (java.lang.Long)100L);
    boolean b15 = strictlySortedSinglyLinkedList0.contains(iPBan14);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList16 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP21 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b22 = strictlySortedSinglyLinkedList16.containsIP(iP21);
    tp2.IP iP23 = null;
    tp2.IPBan iPBan25 = new tp2.IPBan(iP23, (java.lang.Long)(-1L));
    boolean b26 = strictlySortedSinglyLinkedList16.contains(iPBan25);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList27 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP32 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b33 = strictlySortedSinglyLinkedList27.containsIP(iP32);
    tp2.IPBan iPBan35 = strictlySortedSinglyLinkedList27.get((-1));
    boolean b36 = strictlySortedSinglyLinkedList27.isEmpty();
    tp2.IP iP37 = null;
    tp2.IPBan iPBan39 = new tp2.IPBan(iP37, (java.lang.Long)(-1L));
    boolean b40 = strictlySortedSinglyLinkedList27.contains(iPBan39);
    boolean b41 = strictlySortedSinglyLinkedList16.add(iPBan39);
    boolean b42 = strictlySortedSinglyLinkedList0.contains(iPBan39);
    tp2.IP iP47 = new tp2.IP((java.lang.Integer)1, (java.lang.Integer)3, (java.lang.Integer)1000, (java.lang.Integer)1074266112);
    boolean b48 = strictlySortedSinglyLinkedList0.containsIP(iP47);
    iP47.setFirst((java.lang.Integer)37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iPBan35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b48 == false);

  }

  @Test
  public void test102() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test102"); }


    int i2 = java.lang.Integer.rotateRight(27, 16777297);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 884736);

  }

  @Test
  public void test103() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test103"); }


    java.lang.String str1 = java.lang.Integer.toBinaryString(20971536);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "1010000000000000000010000"+ "'", str1.equals("1010000000000000000010000"));

  }

  @Test
  public void test104() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test104"); }


    java.lang.String str1 = java.lang.Integer.toBinaryString(10942);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "10101010111110"+ "'", str1.equals("10101010111110"));

  }

  @Test
  public void test105() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test105"); }


    long long1 = java.lang.Integer.toUnsignedLong(27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == 27L);

  }

  @Test
  public void test106() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test106"); }


    long long1 = java.lang.Integer.toUnsignedLong(1074266112);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == 1074266112L);

  }

  @Test
  public void test107() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test107"); }


    int i2 = java.lang.Integer.compare(884736, 67108864);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == (-1));

  }

  @Test
  public void test108() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test108"); }


    tp2.IP iP0 = null;
    tp2.IPBan iPBan2 = new tp2.IPBan(iP0, (java.lang.Long)0L);
    java.lang.Long long3 = iPBan2.getExpires();
    java.lang.Long long4 = iPBan2.getExpires();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L+ "'", long3.equals(0L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L+ "'", long4.equals(0L));

  }

  @Test
  public void test109() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test109"); }


    tp2.SinglyLinkedList singlyLinkedList0 = new tp2.SinglyLinkedList();
    int i1 = singlyLinkedList0.getSize();
    tp2.IP iP2 = null;
    singlyLinkedList0.add(iP2);
    tp2.IP iP8 = new tp2.IP((java.lang.Integer)10, (java.lang.Integer)10, (java.lang.Integer)1, (java.lang.Integer)10);
    singlyLinkedList0.add(iP8);
    tp2.SinglyLinkedList singlyLinkedList10 = new tp2.SinglyLinkedList();
    int i11 = singlyLinkedList10.getSize();
    tp2.IP iP12 = null;
    singlyLinkedList10.add(iP12);
    boolean b14 = iP8.equals((java.lang.Object)singlyLinkedList10);
    boolean b15 = singlyLinkedList10.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);

  }

  @Test
  public void test110() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test110"); }


    // The following exception was thrown during execution in test generation
    try {
      java.lang.Integer i2 = java.lang.Integer.valueOf("1000000000000000001010000001", 1);
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test111() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test111"); }


    // The following exception was thrown during execution in test generation
    try {
      java.lang.Integer i2 = java.lang.Integer.valueOf("1cccef", 26214);
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

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test112"); }


    int i1 = java.lang.Integer.bitCount(240000041);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 13);

  }

  @Test
  public void test113() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test113"); }


    java.lang.String str1 = java.lang.Integer.toUnsignedString(40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "40"+ "'", str1.equals("40"));

  }

  @Test
  public void test114() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test114"); }


    // The following exception was thrown during execution in test generation
    try {
      int i1 = java.lang.Integer.parseInt("20000000012");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test115() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test115"); }


    korat.finitization.IFinitization iFinitization1 = tp2.Server.finServer(18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iFinitization1);

  }

  @Test
  public void test116() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test116"); }


    tp2.Server server0 = new tp2.Server();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList1 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP6 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b7 = strictlySortedSinglyLinkedList1.containsIP(iP6);
    java.lang.Integer i8 = iP6.getFourth();
    boolean b9 = server0.addException(iP6);
    tp2.ITime iTime10 = null;
    server0.setTime(iTime10);
    tp2.Server server12 = new tp2.Server();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList13 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP18 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b19 = strictlySortedSinglyLinkedList13.containsIP(iP18);
    tp2.IP iP24 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList25 = new tp2.SinglyLinkedList();
    boolean b26 = iP24.equals((java.lang.Object)singlyLinkedList25);
    java.lang.Integer i27 = iP24.getThird();
    boolean b28 = strictlySortedSinglyLinkedList13.removeFromIP(iP24);
    boolean b29 = server12.removeException(iP24);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList30 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP35 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b36 = strictlySortedSinglyLinkedList30.containsIP(iP35);
    tp2.IPBan iPBan38 = strictlySortedSinglyLinkedList30.get((-1));
    tp2.IP iP43 = new tp2.IP((java.lang.Integer)10, (java.lang.Integer)10, (java.lang.Integer)1, (java.lang.Integer)10);
    tp2.IPBan iPBan45 = new tp2.IPBan(iP43, (java.lang.Long)100L);
    boolean b46 = strictlySortedSinglyLinkedList30.removeFromIP(iP43);
    boolean b47 = server12.removeBan(iP43);
    tp2.IPBan iPBan49 = new tp2.IPBan(iP43, (java.lang.Long)83886146L);
    java.lang.Integer i50 = iP43.getThird();
    boolean b51 = server0.connect(iP43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i8 + "' != '" + 10+ "'", i8.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i27 + "' != '" + 167772288+ "'", i27.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iPBan38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b46 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b47 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i50 + "' != '" + 1+ "'", i50.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b51 == true);

  }

  @Test
  public void test117() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test117"); }


    int i1 = java.lang.Integer.lowestOneBit(124);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 4);

  }

  @Test
  public void test118() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test118"); }


    java.lang.Integer i2 = java.lang.Integer.getInteger("1000000000000000000000000000000", 5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i2 + "' != '" + 5+ "'", i2.equals(5));

  }

  @Test
  public void test119() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test119"); }


    tp2.Server server0 = new tp2.Server();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList1 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP6 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b7 = strictlySortedSinglyLinkedList1.containsIP(iP6);
    tp2.IP iP12 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList13 = new tp2.SinglyLinkedList();
    boolean b14 = iP12.equals((java.lang.Object)singlyLinkedList13);
    java.lang.Integer i15 = iP12.getThird();
    boolean b16 = strictlySortedSinglyLinkedList1.removeFromIP(iP12);
    boolean b17 = server0.removeException(iP12);
    tp2.ITime iTime18 = null;
    server0.setTime(iTime18);
    tp2.Server server20 = new tp2.Server();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList21 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP26 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b27 = strictlySortedSinglyLinkedList21.containsIP(iP26);
    tp2.IP iP32 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList33 = new tp2.SinglyLinkedList();
    boolean b34 = iP32.equals((java.lang.Object)singlyLinkedList33);
    java.lang.Integer i35 = iP32.getThird();
    boolean b36 = strictlySortedSinglyLinkedList21.removeFromIP(iP32);
    boolean b37 = server20.removeException(iP32);
    server20.update();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList39 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP44 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b45 = strictlySortedSinglyLinkedList39.containsIP(iP44);
    iP44.setSecond((java.lang.Integer)(-2147483638));
    java.lang.Integer i48 = iP44.getFourth();
    java.lang.Integer i49 = iP44.getFirst();
    iP44.setFirst((java.lang.Integer)20971536);
    boolean b52 = server20.addException(iP44);
    tp2.IPBan iPBan54 = new tp2.IPBan(iP44, (java.lang.Long)0L);
    tp2.IPBan iPBan56 = new tp2.IPBan(iP44, (java.lang.Long)83886146L);
    boolean b57 = server0.addException(iP44);
    boolean b58 = server0.notSharedElements();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i15 + "' != '" + 167772288+ "'", i15.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i35 + "' != '" + 167772288+ "'", i35.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i48 + "' != '" + 10+ "'", i48.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i49 + "' != '" + (-2147483638)+ "'", i49.equals((-2147483638)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b52 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b57 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b58 == true);

  }

  @Test
  public void test120() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test120"); }


    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList0 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b1 = strictlySortedSinglyLinkedList0.isEmpty();
    tp2.IPBan iPBan3 = strictlySortedSinglyLinkedList0.get((-2147483648));
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList4 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP5 = null;
    tp2.IPBan iPBan7 = new tp2.IPBan(iP5, (java.lang.Long)0L);
    boolean b8 = strictlySortedSinglyLinkedList4.contains(iPBan7);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList9 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP10 = null;
    tp2.IPBan iPBan12 = new tp2.IPBan(iP10, (java.lang.Long)0L);
    boolean b13 = strictlySortedSinglyLinkedList9.contains(iPBan12);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList14 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP19 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b20 = strictlySortedSinglyLinkedList14.containsIP(iP19);
    iP19.setFirst((java.lang.Integer)0);
    java.lang.Integer i23 = iP19.getSecond();
    iPBan12.setIp(iP19);
    boolean b25 = strictlySortedSinglyLinkedList4.contains(iPBan12);
    boolean b26 = strictlySortedSinglyLinkedList0.add(iPBan12);
    java.lang.Long long27 = iPBan12.getExpires();
    java.lang.Long long28 = iPBan12.getExpires();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iPBan3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i23 + "' != '" + 100+ "'", i23.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L+ "'", long27.equals(0L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L+ "'", long28.equals(0L));

  }

  @Test
  public void test121() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test121"); }


    int i1 = java.lang.Integer.bitCount(37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 3);

  }

  @Test
  public void test122() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test122"); }


    tp2.Server server0 = new tp2.Server();
    tp2.ITime iTime1 = null;
    server0.setTime(iTime1);
    tp2.Server server3 = new tp2.Server();
    tp2.ITime iTime4 = null;
    server3.setTime(iTime4);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList6 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP11 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b12 = strictlySortedSinglyLinkedList6.containsIP(iP11);
    tp2.IP iP17 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList18 = new tp2.SinglyLinkedList();
    boolean b19 = iP17.equals((java.lang.Object)singlyLinkedList18);
    java.lang.Integer i20 = iP17.getThird();
    boolean b21 = strictlySortedSinglyLinkedList6.removeFromIP(iP17);
    boolean b23 = iP17.equals((java.lang.Object)0);
    boolean b24 = server3.addException(iP17);
    tp2.IPBan iPBan26 = new tp2.IPBan(iP17, (java.lang.Long)120000020L);
    boolean b27 = server0.addException(iP17);
    tp2.SinglyLinkedList singlyLinkedList28 = new tp2.SinglyLinkedList();
    int i29 = singlyLinkedList28.getSize();
    tp2.IP iP30 = null;
    singlyLinkedList28.add(iP30);
    tp2.IP iP36 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b37 = singlyLinkedList28.contains(iP36);
    java.lang.Integer i38 = iP36.getFourth();
    boolean b39 = server0.addBan(iP36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i20 + "' != '" + 167772288+ "'", i20.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i29 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i38 + "' != '" + 10+ "'", i38.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == false);

  }

  @Test
  public void test123() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test123"); }


    long long1 = java.lang.Integer.toUnsignedLong(7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == 7L);

  }

  @Test
  public void test124() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test124"); }


    int i2 = java.lang.Integer.divideUnsigned(110592, (-803208192));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);

  }

  @Test
  public void test125() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test125"); }


    java.lang.String str1 = java.lang.Integer.toBinaryString(524288);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "10000000000000000000"+ "'", str1.equals("10000000000000000000"));

  }

  @Test
  public void test126() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test126"); }


    int i2 = java.lang.Integer.rotateRight(134217728, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 268435456);

  }

  @Test
  public void test127() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test127"); }


    int i1 = java.lang.Integer.numberOfTrailingZeros(12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 2);

  }

  @Test
  public void test128() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test128"); }


    tp2.Server server0 = new tp2.Server();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList1 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP6 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b7 = strictlySortedSinglyLinkedList1.containsIP(iP6);
    java.lang.Integer i8 = iP6.getFourth();
    boolean b9 = server0.addException(iP6);
    tp2.ITime iTime10 = null;
    server0.setTime(iTime10);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList12 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP17 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b18 = strictlySortedSinglyLinkedList12.containsIP(iP17);
    boolean b19 = server0.removeException(iP17);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList20 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP25 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b26 = strictlySortedSinglyLinkedList20.containsIP(iP25);
    iP25.setFirst((java.lang.Integer)0);
    java.lang.Integer i29 = iP25.getSecond();
    iP25.setFourth((java.lang.Integer)83886146);
    boolean b32 = server0.removeException(iP25);
    iP25.setSecond((java.lang.Integer)20971536);
    java.lang.Integer i35 = iP25.getFirst();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i8 + "' != '" + 10+ "'", i8.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i29 + "' != '" + 100+ "'", i29.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i35 + "' != '" + 0+ "'", i35.equals(0));

  }

  @Test
  public void test129() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test129"); }


    // The following exception was thrown during execution in test generation
    try {
      int i2 = java.lang.Integer.parseUnsignedInt("72", 500000102);
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test130() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test130"); }


    // The following exception was thrown during execution in test generation
    try {
      java.lang.Integer i2 = java.lang.Integer.valueOf("81400010", 5);
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

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test131"); }


    java.lang.String str1 = java.lang.Integer.toUnsignedString(25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "25"+ "'", str1.equals("25"));

  }

  @Test
  public void test132() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test132"); }


    int i2 = java.lang.Integer.compare(1886470370, 8388608);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);

  }

  @Test
  public void test133() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test133"); }


    int i1 = java.lang.Integer.highestOneBit((-803208192));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == (-2147483648));

  }

  @Test
  public void test134() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test134"); }


    // The following exception was thrown during execution in test generation
    try {
      int i1 = java.lang.Integer.parseInt("1010000000000000000010000");
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

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test135"); }


    tp2.IP iP0 = null;
    tp2.IPBan iPBan2 = new tp2.IPBan(iP0, (java.lang.Long)120000020L);

  }

  @Test
  public void test136() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test136"); }


    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList0 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP5 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b6 = strictlySortedSinglyLinkedList0.containsIP(iP5);
    tp2.IP iP11 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList12 = new tp2.SinglyLinkedList();
    boolean b13 = iP11.equals((java.lang.Object)singlyLinkedList12);
    java.lang.Integer i14 = iP11.getThird();
    boolean b15 = strictlySortedSinglyLinkedList0.removeFromIP(iP11);
    tp2.IP iP16 = null;
    tp2.IPBan iPBan18 = new tp2.IPBan(iP16, (java.lang.Long)(-1L));
    boolean b19 = strictlySortedSinglyLinkedList0.contains(iPBan18);
    tp2.IPBan iPBan21 = strictlySortedSinglyLinkedList0.get((-2147483648));
    tp2.IPBan iPBan23 = strictlySortedSinglyLinkedList0.get(2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i14 + "' != '" + 167772288+ "'", i14.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iPBan21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iPBan23);

  }

  @Test
  public void test137() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test137"); }


    java.lang.Integer i1 = java.lang.Integer.valueOf("18");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 18+ "'", i1.equals(18));

  }

  @Test
  public void test138() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test138"); }


    java.lang.String str2 = java.lang.Integer.toUnsignedString(268451841, 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "268451841"+ "'", str2.equals("268451841"));

  }

  @Test
  public void test139() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test139"); }


    tp2.SinglyLinkedList singlyLinkedList0 = new tp2.SinglyLinkedList();
    int i1 = singlyLinkedList0.getSize();
    tp2.IP iP3 = singlyLinkedList0.get(10);
    tp2.IP iP8 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    singlyLinkedList0.add(iP8);
    iP8.setThird((java.lang.Integer)120000020);
    java.lang.Integer i12 = iP8.getFourth();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i12 + "' != '" + 10+ "'", i12.equals(10));

  }

  @Test
  public void test140() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test140"); }


    tp2.IP iP4 = new tp2.IP((java.lang.Integer)3, (java.lang.Integer)167772288, (java.lang.Integer)41943073, (java.lang.Integer)41943072);

  }

  @Test
  public void test141() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test141"); }


    tp2.Server server0 = new tp2.Server();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList1 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP6 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b7 = strictlySortedSinglyLinkedList1.containsIP(iP6);
    iP6.setSecond((java.lang.Integer)(-2147483638));
    java.lang.Integer i10 = iP6.getFourth();
    java.lang.Integer i11 = iP6.getFirst();
    boolean b12 = server0.connect(iP6);
    tp2.IP iP17 = new tp2.IP((java.lang.Integer)134217728, (java.lang.Integer)7, (java.lang.Integer)3, (java.lang.Integer)262144);
    boolean b18 = iP6.equals((java.lang.Object)3);
    iP6.setThird((java.lang.Integer)6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i10 + "' != '" + 10+ "'", i10.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i11 + "' != '" + (-2147483638)+ "'", i11.equals((-2147483638)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);

  }

  @Test
  public void test142() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test142"); }


    int i2 = java.lang.Integer.rotateLeft(64, 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 64);

  }

  @Test
  public void test143() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test143"); }


    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList0 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP5 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b6 = strictlySortedSinglyLinkedList0.containsIP(iP5);
    tp2.IP iP11 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList12 = new tp2.SinglyLinkedList();
    boolean b13 = iP11.equals((java.lang.Object)singlyLinkedList12);
    java.lang.Integer i14 = iP11.getThird();
    boolean b15 = strictlySortedSinglyLinkedList0.removeFromIP(iP11);
    tp2.IP iP16 = null;
    tp2.IPBan iPBan18 = new tp2.IPBan(iP16, (java.lang.Long)(-1L));
    boolean b19 = strictlySortedSinglyLinkedList0.contains(iPBan18);
    boolean b20 = strictlySortedSinglyLinkedList0.isEmpty();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList21 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP22 = null;
    tp2.IPBan iPBan24 = new tp2.IPBan(iP22, (java.lang.Long)0L);
    boolean b25 = strictlySortedSinglyLinkedList21.contains(iPBan24);
    boolean b26 = strictlySortedSinglyLinkedList0.add(iPBan24);
    tp2.IPBan iPBan27 = null;
    boolean b28 = strictlySortedSinglyLinkedList0.add(iPBan27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i14 + "' != '" + 167772288+ "'", i14.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);

  }

  @Test
  public void test144() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test144"); }


    java.lang.String str1 = java.lang.Integer.toHexString(268451841);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "10004001"+ "'", str1.equals("10004001"));

  }

  @Test
  public void test145() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test145"); }


    int i2 = java.lang.Integer.max(500000102, (-1121320960));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 500000102);

  }

  @Test
  public void test146() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test146"); }


    int i2 = java.lang.Integer.rotateRight(0, 7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);

  }

  @Test
  public void test147() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test147"); }


    int i2 = java.lang.Integer.remainderUnsigned(10942, 16384);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 10942);

  }

  @Test
  public void test148() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test148"); }


    int i2 = java.lang.Integer.rotateRight((-1979711360), 1886470370);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 578813984);

  }

  @Test
  public void test149() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test149"); }


    tp2.Server server0 = new tp2.Server();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList1 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP6 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b7 = strictlySortedSinglyLinkedList1.containsIP(iP6);
    tp2.IP iP12 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList13 = new tp2.SinglyLinkedList();
    boolean b14 = iP12.equals((java.lang.Object)singlyLinkedList13);
    java.lang.Integer i15 = iP12.getThird();
    boolean b16 = strictlySortedSinglyLinkedList1.removeFromIP(iP12);
    boolean b17 = server0.removeException(iP12);
    server0.update();
    tp2.ITime iTime19 = null;
    server0.setTime(iTime19);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList21 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP26 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b27 = strictlySortedSinglyLinkedList21.containsIP(iP26);
    tp2.IPBan iPBan29 = strictlySortedSinglyLinkedList21.get((-1));
    tp2.IP iP34 = new tp2.IP((java.lang.Integer)10, (java.lang.Integer)10, (java.lang.Integer)1, (java.lang.Integer)10);
    tp2.IPBan iPBan36 = new tp2.IPBan(iP34, (java.lang.Long)100L);
    boolean b37 = strictlySortedSinglyLinkedList21.removeFromIP(iP34);
    tp2.IP iP42 = new tp2.IP((java.lang.Integer)10, (java.lang.Integer)10, (java.lang.Integer)1, (java.lang.Integer)10);
    tp2.IPBan iPBan44 = new tp2.IPBan(iP42, (java.lang.Long)100L);
    boolean b45 = strictlySortedSinglyLinkedList21.removeFromIP(iP42);
    boolean b46 = server0.addException(iP42);
    server0.update();
    tp2.Server server48 = new tp2.Server();
    tp2.ITime iTime49 = null;
    server48.setTime(iTime49);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList51 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP56 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b57 = strictlySortedSinglyLinkedList51.containsIP(iP56);
    tp2.IP iP62 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList63 = new tp2.SinglyLinkedList();
    boolean b64 = iP62.equals((java.lang.Object)singlyLinkedList63);
    java.lang.Integer i65 = iP62.getThird();
    boolean b66 = strictlySortedSinglyLinkedList51.removeFromIP(iP62);
    boolean b68 = iP62.equals((java.lang.Object)0);
    boolean b69 = server48.addException(iP62);
    tp2.IPBan iPBan71 = new tp2.IPBan(iP62, (java.lang.Long)120000020L);
    boolean b72 = server0.removeException(iP62);
    boolean b73 = server0.notSharedElements();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i15 + "' != '" + 167772288+ "'", i15.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iPBan29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b46 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b57 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b64 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i65 + "' != '" + 167772288+ "'", i65.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b66 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b68 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b69 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b72 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b73 == true);

  }

  @Test
  public void test150() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test150"); }


    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList0 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP5 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b6 = strictlySortedSinglyLinkedList0.containsIP(iP5);
    tp2.IP iP11 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList12 = new tp2.SinglyLinkedList();
    boolean b13 = iP11.equals((java.lang.Object)singlyLinkedList12);
    java.lang.Integer i14 = iP11.getThird();
    boolean b15 = strictlySortedSinglyLinkedList0.removeFromIP(iP11);
    boolean b17 = iP11.equals((java.lang.Object)0);
    java.lang.Integer i18 = iP11.getSecond();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i14 + "' != '" + 167772288+ "'", i14.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i18 + "' != '" + 100+ "'", i18.equals(100));

  }

  @Test
  public void test151() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test151"); }


    int i2 = java.lang.Integer.min(8, 1100100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 8);

  }

  @Test
  public void test152() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test152"); }


    java.lang.Integer i1 = java.lang.Integer.valueOf(67108864);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 67108864+ "'", i1.equals(67108864));

  }

  @Test
  public void test153() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test153"); }


    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList0 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP1 = null;
    tp2.IPBan iPBan3 = new tp2.IPBan(iP1, (java.lang.Long)0L);
    boolean b4 = strictlySortedSinglyLinkedList0.contains(iPBan3);
    tp2.IP iP9 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    java.lang.Integer i10 = iP9.getFourth();
    boolean b11 = strictlySortedSinglyLinkedList0.removeFromIP(iP9);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList12 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP13 = null;
    tp2.IPBan iPBan15 = new tp2.IPBan(iP13, (java.lang.Long)0L);
    boolean b16 = strictlySortedSinglyLinkedList12.contains(iPBan15);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList17 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP18 = null;
    tp2.IPBan iPBan20 = new tp2.IPBan(iP18, (java.lang.Long)0L);
    boolean b21 = strictlySortedSinglyLinkedList17.contains(iPBan20);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList22 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP27 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b28 = strictlySortedSinglyLinkedList22.containsIP(iP27);
    iP27.setFirst((java.lang.Integer)0);
    java.lang.Integer i31 = iP27.getSecond();
    iPBan20.setIp(iP27);
    boolean b33 = strictlySortedSinglyLinkedList12.contains(iPBan20);
    boolean b34 = strictlySortedSinglyLinkedList0.contains(iPBan20);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList35 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP40 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b41 = strictlySortedSinglyLinkedList35.containsIP(iP40);
    iP40.setSecond((java.lang.Integer)(-2147483638));
    tp2.IPBan iPBan45 = new tp2.IPBan(iP40, (java.lang.Long)0L);
    boolean b46 = strictlySortedSinglyLinkedList0.add(iPBan45);
    tp2.Server server47 = new tp2.Server();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList48 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP53 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b54 = strictlySortedSinglyLinkedList48.containsIP(iP53);
    tp2.IP iP59 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList60 = new tp2.SinglyLinkedList();
    boolean b61 = iP59.equals((java.lang.Object)singlyLinkedList60);
    java.lang.Integer i62 = iP59.getThird();
    boolean b63 = strictlySortedSinglyLinkedList48.removeFromIP(iP59);
    boolean b64 = server47.removeException(iP59);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList65 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP70 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b71 = strictlySortedSinglyLinkedList65.containsIP(iP70);
    tp2.IPBan iPBan73 = strictlySortedSinglyLinkedList65.get((-1));
    tp2.IP iP78 = new tp2.IP((java.lang.Integer)10, (java.lang.Integer)10, (java.lang.Integer)1, (java.lang.Integer)10);
    tp2.IPBan iPBan80 = new tp2.IPBan(iP78, (java.lang.Long)100L);
    boolean b81 = strictlySortedSinglyLinkedList65.removeFromIP(iP78);
    boolean b82 = server47.addBan(iP78);
    iP78.setSecond((java.lang.Integer)41943073);
    iPBan45.setIp(iP78);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i10 + "' != '" + 10+ "'", i10.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i31 + "' != '" + 100+ "'", i31.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b46 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b54 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b61 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i62 + "' != '" + 167772288+ "'", i62.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b63 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b64 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b71 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iPBan73);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b81 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b82 == true);

  }

  @Test
  public void test154() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test154"); }


    int i2 = java.lang.Integer.rotateRight(8388608, 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 8388608);

  }

  @Test
  public void test155() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test155"); }


    int i1 = java.lang.Integer.lowestOneBit((-892585062));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 2);

  }

  @Test
  public void test156() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test156"); }


    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList0 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b1 = strictlySortedSinglyLinkedList0.isEmpty();
    tp2.IP iP6 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b7 = strictlySortedSinglyLinkedList0.removeFromIP(iP6);
    tp2.IP iP12 = new tp2.IP((java.lang.Integer)10, (java.lang.Integer)10, (java.lang.Integer)1, (java.lang.Integer)10);
    tp2.IPBan iPBan14 = new tp2.IPBan(iP12, (java.lang.Long)100L);
    boolean b15 = strictlySortedSinglyLinkedList0.contains(iPBan14);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList16 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP21 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b22 = strictlySortedSinglyLinkedList16.containsIP(iP21);
    iP21.setSecond((java.lang.Integer)(-2147483638));
    tp2.IPBan iPBan26 = new tp2.IPBan(iP21, (java.lang.Long)0L);
    boolean b27 = strictlySortedSinglyLinkedList0.contains(iPBan26);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList28 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b29 = strictlySortedSinglyLinkedList28.isEmpty();
    tp2.IP iP34 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b35 = strictlySortedSinglyLinkedList28.removeFromIP(iP34);
    tp2.IP iP40 = new tp2.IP((java.lang.Integer)10, (java.lang.Integer)10, (java.lang.Integer)1, (java.lang.Integer)10);
    tp2.IPBan iPBan42 = new tp2.IPBan(iP40, (java.lang.Long)100L);
    boolean b43 = strictlySortedSinglyLinkedList28.contains(iPBan42);
    boolean b44 = strictlySortedSinglyLinkedList0.add(iPBan42);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList45 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP50 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b51 = strictlySortedSinglyLinkedList45.containsIP(iP50);
    tp2.IP iP56 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList57 = new tp2.SinglyLinkedList();
    boolean b58 = iP56.equals((java.lang.Object)singlyLinkedList57);
    java.lang.Integer i59 = iP56.getThird();
    boolean b60 = strictlySortedSinglyLinkedList45.removeFromIP(iP56);
    tp2.IP iP61 = null;
    tp2.IPBan iPBan63 = new tp2.IPBan(iP61, (java.lang.Long)(-1L));
    boolean b64 = strictlySortedSinglyLinkedList45.contains(iPBan63);
    tp2.IPBan iPBan66 = strictlySortedSinglyLinkedList45.get((-2147483648));
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList67 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b68 = strictlySortedSinglyLinkedList67.isEmpty();
    tp2.IP iP73 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b74 = strictlySortedSinglyLinkedList67.removeFromIP(iP73);
    tp2.IP iP79 = new tp2.IP((java.lang.Integer)10, (java.lang.Integer)10, (java.lang.Integer)1, (java.lang.Integer)10);
    tp2.IPBan iPBan81 = new tp2.IPBan(iP79, (java.lang.Long)100L);
    boolean b82 = strictlySortedSinglyLinkedList67.contains(iPBan81);
    boolean b83 = strictlySortedSinglyLinkedList45.add(iPBan81);
    boolean b84 = strictlySortedSinglyLinkedList0.add(iPBan81);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList85 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP90 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b91 = strictlySortedSinglyLinkedList85.containsIP(iP90);
    iP90.setFirst((java.lang.Integer)0);
    iP90.setFourth((java.lang.Integer)7);
    iP90.setSecond((java.lang.Integer)18);
    boolean b98 = strictlySortedSinglyLinkedList0.containsIP(iP90);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b43 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b51 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b58 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i59 + "' != '" + 167772288+ "'", i59.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b60 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b64 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iPBan66);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b68 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b74 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b82 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b83 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b84 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b91 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b98 == false);

  }

  @Test
  public void test157() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test157"); }


    int i1 = java.lang.Integer.signum(124);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 1);

  }

  @Test
  public void test158() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test158"); }


    java.lang.Integer i2 = java.lang.Integer.getInteger("1000000000000000000000000000000", (java.lang.Integer)10941);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i2 + "' != '" + 10941+ "'", i2.equals(10941));

  }

  @Test
  public void test159() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test159"); }


    java.lang.Integer i1 = new java.lang.Integer(23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 23+ "'", i1.equals(23));

  }

  @Test
  public void test160() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test160"); }


    java.lang.Integer i1 = new java.lang.Integer(1107296261);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 1107296261+ "'", i1.equals(1107296261));

  }

  @Test
  public void test161() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test161"); }


    int i2 = java.lang.Integer.compareUnsigned(2098176, 8388608);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == (-1));

  }

  @Test
  public void test162() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test162"); }


    int i2 = java.lang.Integer.rotateRight(23, 1073741824);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 23);

  }

  @Test
  public void test163() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test163"); }


    java.lang.Integer i1 = java.lang.Integer.getInteger("4");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);

  }

  @Test
  public void test164() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test164"); }


    int i1 = java.lang.Integer.bitCount(11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 3);

  }

  @Test
  public void test165() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test165"); }


    // The following exception was thrown during execution in test generation
    try {
      int i2 = java.lang.Integer.parseInt("2168455184", 131072);
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test166() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test166"); }


    java.lang.String str1 = java.lang.Integer.toHexString(13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "d"+ "'", str1.equals("d"));

  }

  @Test
  public void test167() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test167"); }


    int i2 = java.lang.Integer.divideUnsigned(268451841, 524288);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 512);

  }

  @Test
  public void test168() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test168"); }


    int i2 = java.lang.Integer.divideUnsigned(72, 41943073);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);

  }

  @Test
  public void test169() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test169"); }


    int i1 = java.lang.Integer.reverseBytes(24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 402653184);

  }

  @Test
  public void test170() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test170"); }


    int i2 = java.lang.Integer.max(67112960, 512);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 67112960);

  }

  @Test
  public void test171() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test171"); }


    java.lang.Integer i2 = java.lang.Integer.getInteger("12", (java.lang.Integer)83886080);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i2 + "' != '" + 83886080+ "'", i2.equals(83886080));

  }

  @Test
  public void test172() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test172"); }


    // The following exception was thrown during execution in test generation
    try {
      int i2 = java.lang.Integer.parseUnsignedInt("hi!", 336471815);
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


    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList0 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP5 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b6 = strictlySortedSinglyLinkedList0.containsIP(iP5);
    tp2.IP iP11 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList12 = new tp2.SinglyLinkedList();
    boolean b13 = iP11.equals((java.lang.Object)singlyLinkedList12);
    java.lang.Integer i14 = iP11.getThird();
    boolean b15 = strictlySortedSinglyLinkedList0.removeFromIP(iP11);
    tp2.IP iP16 = null;
    tp2.IPBan iPBan18 = new tp2.IPBan(iP16, (java.lang.Long)(-1L));
    boolean b19 = strictlySortedSinglyLinkedList0.contains(iPBan18);
    boolean b20 = strictlySortedSinglyLinkedList0.isEmpty();
    tp2.Server server21 = new tp2.Server();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList22 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP27 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b28 = strictlySortedSinglyLinkedList22.containsIP(iP27);
    tp2.IP iP33 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList34 = new tp2.SinglyLinkedList();
    boolean b35 = iP33.equals((java.lang.Object)singlyLinkedList34);
    java.lang.Integer i36 = iP33.getThird();
    boolean b37 = strictlySortedSinglyLinkedList22.removeFromIP(iP33);
    boolean b38 = server21.removeException(iP33);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList39 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP44 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b45 = strictlySortedSinglyLinkedList39.containsIP(iP44);
    tp2.IPBan iPBan47 = strictlySortedSinglyLinkedList39.get((-1));
    tp2.IP iP52 = new tp2.IP((java.lang.Integer)10, (java.lang.Integer)10, (java.lang.Integer)1, (java.lang.Integer)10);
    tp2.IPBan iPBan54 = new tp2.IPBan(iP52, (java.lang.Long)100L);
    boolean b55 = strictlySortedSinglyLinkedList39.removeFromIP(iP52);
    boolean b56 = server21.removeBan(iP52);
    tp2.IPBan iPBan58 = new tp2.IPBan(iP52, (java.lang.Long)83886146L);
    boolean b59 = strictlySortedSinglyLinkedList0.contains(iPBan58);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i14 + "' != '" + 167772288+ "'", i14.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i36 + "' != '" + 167772288+ "'", i36.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iPBan47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b55 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b56 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b59 == false);

  }

  @Test
  public void test174() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test174"); }


    java.lang.Integer i1 = java.lang.Integer.getInteger("32");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);

  }

  @Test
  public void test175() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test175"); }


    tp2.Server server0 = new tp2.Server();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList1 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP6 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b7 = strictlySortedSinglyLinkedList1.containsIP(iP6);
    java.lang.Integer i8 = iP6.getFourth();
    boolean b9 = server0.addException(iP6);
    tp2.ITime iTime10 = null;
    server0.setTime(iTime10);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList12 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP17 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b18 = strictlySortedSinglyLinkedList12.containsIP(iP17);
    tp2.IP iP23 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList24 = new tp2.SinglyLinkedList();
    boolean b25 = iP23.equals((java.lang.Object)singlyLinkedList24);
    java.lang.Integer i26 = iP23.getThird();
    boolean b27 = strictlySortedSinglyLinkedList12.removeFromIP(iP23);
    boolean b29 = iP23.equals((java.lang.Object)0);
    java.lang.Integer i30 = iP23.getThird();
    java.lang.Integer i31 = iP23.getFirst();
    iP23.setFourth((java.lang.Integer)20971536);
    tp2.Server server34 = new tp2.Server();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList35 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP40 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b41 = strictlySortedSinglyLinkedList35.containsIP(iP40);
    java.lang.Integer i42 = iP40.getFourth();
    boolean b43 = server34.addException(iP40);
    boolean b44 = iP23.equals((java.lang.Object)iP40);
    boolean b45 = server0.connect(iP23);
    boolean b46 = server0.notSharedElements();
    tp2.ITime iTime47 = null;
    server0.setTime(iTime47);
    tp2.Server server49 = new tp2.Server();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList50 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP55 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b56 = strictlySortedSinglyLinkedList50.containsIP(iP55);
    tp2.IP iP61 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList62 = new tp2.SinglyLinkedList();
    boolean b63 = iP61.equals((java.lang.Object)singlyLinkedList62);
    java.lang.Integer i64 = iP61.getThird();
    boolean b65 = strictlySortedSinglyLinkedList50.removeFromIP(iP61);
    boolean b66 = server49.removeException(iP61);
    server49.update();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList68 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP73 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b74 = strictlySortedSinglyLinkedList68.containsIP(iP73);
    iP73.setSecond((java.lang.Integer)(-2147483638));
    java.lang.Integer i77 = iP73.getFourth();
    java.lang.Integer i78 = iP73.getFirst();
    iP73.setFirst((java.lang.Integer)20971536);
    boolean b81 = server49.addException(iP73);
    tp2.IPBan iPBan83 = new tp2.IPBan(iP73, (java.lang.Long)0L);
    iP73.setSecond((java.lang.Integer)(-1674030564));
    iP73.setSecond((java.lang.Integer)5);
    boolean b88 = server0.removeException(iP73);
    tp2.ITime iTime89 = null;
    server0.setTime(iTime89);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i8 + "' != '" + 10+ "'", i8.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i26 + "' != '" + 167772288+ "'", i26.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i30 + "' != '" + 167772288+ "'", i30.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i31 + "' != '" + (-2147483638)+ "'", i31.equals((-2147483638)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i42 + "' != '" + 10+ "'", i42.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b43 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b46 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b56 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b63 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i64 + "' != '" + 167772288+ "'", i64.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b65 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b66 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b74 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i77 + "' != '" + 10+ "'", i77.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i78 + "' != '" + (-2147483638)+ "'", i78.equals((-2147483638)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b81 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b88 == false);

  }

  @Test
  public void test176() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test176"); }


    int i2 = java.lang.Integer.compare(271056898, 67109184);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);

  }

  @Test
  public void test177() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test177"); }


    tp2.IP iP4 = new tp2.IP((java.lang.Integer)268435456, (java.lang.Integer)4194304, (java.lang.Integer)2098192, (java.lang.Integer)578813984);

  }

  @Test
  public void test178() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test178"); }


    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList0 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP1 = null;
    tp2.IPBan iPBan3 = new tp2.IPBan(iP1, (java.lang.Long)0L);
    boolean b4 = strictlySortedSinglyLinkedList0.contains(iPBan3);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList5 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP10 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b11 = strictlySortedSinglyLinkedList5.containsIP(iP10);
    iP10.setFirst((java.lang.Integer)0);
    java.lang.Integer i14 = iP10.getSecond();
    iPBan3.setIp(iP10);
    tp2.Server server16 = new tp2.Server();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList17 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP22 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b23 = strictlySortedSinglyLinkedList17.containsIP(iP22);
    tp2.IP iP28 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList29 = new tp2.SinglyLinkedList();
    boolean b30 = iP28.equals((java.lang.Object)singlyLinkedList29);
    java.lang.Integer i31 = iP28.getThird();
    boolean b32 = strictlySortedSinglyLinkedList17.removeFromIP(iP28);
    boolean b33 = server16.removeException(iP28);
    iPBan3.setIp(iP28);
    java.lang.Long long35 = iPBan3.getExpires();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i14 + "' != '" + 100+ "'", i14.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i31 + "' != '" + 167772288+ "'", i31.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long35 + "' != '" + 0L+ "'", long35.equals(0L));

  }

  @Test
  public void test179() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test179"); }


    tp2.SinglyLinkedList singlyLinkedList0 = new tp2.SinglyLinkedList();
    boolean b1 = singlyLinkedList0.isEmpty();
    tp2.IP iP3 = singlyLinkedList0.get(0);
    boolean b4 = singlyLinkedList0.isEmpty();
    int i5 = singlyLinkedList0.getSize();
    tp2.IP iP7 = singlyLinkedList0.get(27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP7);

  }

  @Test
  public void test180() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test180"); }


    int i1 = java.lang.Integer.reverseBytes(301989888);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 18);

  }

  @Test
  public void test181() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test181"); }


    int i1 = java.lang.Integer.signum(2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 1);

  }

  @Test
  public void test182() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test182"); }


    java.lang.String str2 = java.lang.Integer.toUnsignedString(10942, 10942);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "10942"+ "'", str2.equals("10942"));

  }

  @Test
  public void test183() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test183"); }


    tp2.SinglyLinkedList singlyLinkedList0 = new tp2.SinglyLinkedList();
    int i1 = singlyLinkedList0.getSize();
    tp2.IP iP3 = singlyLinkedList0.get(10);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList4 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP9 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b10 = strictlySortedSinglyLinkedList4.containsIP(iP9);
    iP9.setFirst((java.lang.Integer)0);
    boolean b13 = singlyLinkedList0.remove(iP9);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList14 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP19 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b20 = strictlySortedSinglyLinkedList14.containsIP(iP19);
    tp2.IPBan iPBan22 = strictlySortedSinglyLinkedList14.get((-1));
    tp2.IP iP27 = new tp2.IP((java.lang.Integer)10, (java.lang.Integer)10, (java.lang.Integer)1, (java.lang.Integer)10);
    tp2.IPBan iPBan29 = new tp2.IPBan(iP27, (java.lang.Long)100L);
    boolean b30 = strictlySortedSinglyLinkedList14.removeFromIP(iP27);
    tp2.IP iP35 = new tp2.IP((java.lang.Integer)10, (java.lang.Integer)10, (java.lang.Integer)1, (java.lang.Integer)10);
    tp2.IPBan iPBan37 = new tp2.IPBan(iP35, (java.lang.Long)100L);
    boolean b38 = strictlySortedSinglyLinkedList14.removeFromIP(iP35);
    singlyLinkedList0.add(iP35);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList40 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP45 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b46 = strictlySortedSinglyLinkedList40.containsIP(iP45);
    tp2.IP iP51 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList52 = new tp2.SinglyLinkedList();
    boolean b53 = iP51.equals((java.lang.Object)singlyLinkedList52);
    java.lang.Integer i54 = iP51.getThird();
    boolean b55 = strictlySortedSinglyLinkedList40.removeFromIP(iP51);
    java.lang.Integer i56 = iP51.getThird();
    iP51.setFirst((java.lang.Integer)(-1979711360));
    iP51.setFirst((java.lang.Integer)(-2147483648));
    singlyLinkedList0.add(iP51);
    int i62 = singlyLinkedList0.getSize();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iPBan22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b46 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b53 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i54 + "' != '" + 167772288+ "'", i54.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b55 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i56 + "' != '" + 167772288+ "'", i56.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i62 == 2);

  }

  @Test
  public void test184() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test184"); }


    int i2 = java.lang.Integer.compareUnsigned(134218369, 4194304);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);

  }

  @Test
  public void test185() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test185"); }


    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList0 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP5 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b6 = strictlySortedSinglyLinkedList0.containsIP(iP5);
    iP5.setSecond((java.lang.Integer)(-2147483638));
    java.lang.Integer i9 = null;
    iP5.setFirst(i9);
    tp2.Server server11 = new tp2.Server();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList12 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP17 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b18 = strictlySortedSinglyLinkedList12.containsIP(iP17);
    tp2.IP iP23 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList24 = new tp2.SinglyLinkedList();
    boolean b25 = iP23.equals((java.lang.Object)singlyLinkedList24);
    java.lang.Integer i26 = iP23.getThird();
    boolean b27 = strictlySortedSinglyLinkedList12.removeFromIP(iP23);
    boolean b28 = server11.removeException(iP23);
    server11.update();
    tp2.ITime iTime30 = null;
    server11.setTime(iTime30);
    tp2.Server server32 = new tp2.Server();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList33 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP38 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b39 = strictlySortedSinglyLinkedList33.containsIP(iP38);
    tp2.IP iP44 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList45 = new tp2.SinglyLinkedList();
    boolean b46 = iP44.equals((java.lang.Object)singlyLinkedList45);
    java.lang.Integer i47 = iP44.getThird();
    boolean b48 = strictlySortedSinglyLinkedList33.removeFromIP(iP44);
    boolean b49 = server32.removeException(iP44);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList50 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP55 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b56 = strictlySortedSinglyLinkedList50.containsIP(iP55);
    tp2.IPBan iPBan58 = strictlySortedSinglyLinkedList50.get((-1));
    tp2.IP iP63 = new tp2.IP((java.lang.Integer)10, (java.lang.Integer)10, (java.lang.Integer)1, (java.lang.Integer)10);
    tp2.IPBan iPBan65 = new tp2.IPBan(iP63, (java.lang.Long)100L);
    boolean b66 = strictlySortedSinglyLinkedList50.removeFromIP(iP63);
    boolean b67 = server32.removeBan(iP63);
    boolean b68 = server11.addException(iP63);
    boolean b69 = iP5.equals((java.lang.Object)iP63);
    iP5.setThird((java.lang.Integer)6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i26 + "' != '" + 167772288+ "'", i26.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b46 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i47 + "' != '" + 167772288+ "'", i47.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b48 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b49 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b56 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iPBan58);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b66 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b67 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b68 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b69 == false);

  }

  @Test
  public void test186() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test186"); }


    int i2 = java.lang.Integer.compare(12, 500000102);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == (-1));

  }

  @Test
  public void test187() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test187"); }


    java.lang.Integer i1 = java.lang.Integer.decode("83886146");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 83886146+ "'", i1.equals(83886146));

  }

  @Test
  public void test188() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test188"); }


    tp2.Server server0 = new tp2.Server();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList1 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP6 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b7 = strictlySortedSinglyLinkedList1.containsIP(iP6);
    java.lang.Integer i8 = iP6.getFourth();
    boolean b9 = server0.addException(iP6);
    tp2.ITime iTime10 = null;
    server0.setTime(iTime10);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList12 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP17 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b18 = strictlySortedSinglyLinkedList12.containsIP(iP17);
    boolean b19 = server0.removeException(iP17);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList20 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP25 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b26 = strictlySortedSinglyLinkedList20.containsIP(iP25);
    iP25.setFirst((java.lang.Integer)0);
    java.lang.Integer i29 = iP25.getSecond();
    iP25.setFourth((java.lang.Integer)83886146);
    boolean b32 = server0.removeException(iP25);
    iP25.setSecond((java.lang.Integer)20971536);
    java.lang.Integer i35 = iP25.getFourth();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i8 + "' != '" + 10+ "'", i8.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i29 + "' != '" + 100+ "'", i29.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i35 + "' != '" + 83886146+ "'", i35.equals(83886146));

  }

  @Test
  public void test189() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test189"); }


    java.lang.String str2 = java.lang.Integer.toUnsignedString(262144, 18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "28h1a"+ "'", str2.equals("28h1a"));

  }

  @Test
  public void test190() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test190"); }


    java.lang.Integer i1 = new java.lang.Integer("40");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 40+ "'", i1.equals(40));

  }

  @Test
  public void test191() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test191"); }


    int i2 = java.lang.Integer.rotateRight(7, 134218369);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == (-2147483645));

  }

  @Test
  public void test192() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test192"); }


    int i1 = java.lang.Integer.bitCount(131137);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 3);

  }

  @Test
  public void test193() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test193"); }


    int i2 = java.lang.Integer.compareUnsigned(1074266112, 134218369);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);

  }

  @Test
  public void test194() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test194"); }


    tp2.SinglyLinkedList singlyLinkedList0 = new tp2.SinglyLinkedList();
    int i1 = singlyLinkedList0.getSize();
    tp2.IP iP3 = singlyLinkedList0.get(10);
    int i4 = singlyLinkedList0.getSize();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);

  }

  @Test
  public void test195() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test195"); }


    tp2.Server server0 = new tp2.Server();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList1 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP6 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b7 = strictlySortedSinglyLinkedList1.containsIP(iP6);
    tp2.IP iP12 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList13 = new tp2.SinglyLinkedList();
    boolean b14 = iP12.equals((java.lang.Object)singlyLinkedList13);
    java.lang.Integer i15 = iP12.getThird();
    boolean b16 = strictlySortedSinglyLinkedList1.removeFromIP(iP12);
    boolean b17 = server0.removeException(iP12);
    server0.update();
    tp2.ITime iTime19 = null;
    server0.setTime(iTime19);
    tp2.IP iP25 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList26 = new tp2.SinglyLinkedList();
    boolean b27 = iP25.equals((java.lang.Object)singlyLinkedList26);
    iP25.setSecond((java.lang.Integer)2);
    boolean b30 = server0.removeBan(iP25);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList31 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b32 = strictlySortedSinglyLinkedList31.isEmpty();
    tp2.IP iP37 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b38 = strictlySortedSinglyLinkedList31.removeFromIP(iP37);
    iP37.setThird((java.lang.Integer)41943073);
    boolean b41 = server0.removeException(iP37);
    tp2.ITime iTime42 = null;
    server0.setTime(iTime42);
    tp2.ITime iTime44 = null;
    server0.setTime(iTime44);
    tp2.Server server46 = new tp2.Server();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList47 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP52 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b53 = strictlySortedSinglyLinkedList47.containsIP(iP52);
    tp2.IP iP58 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList59 = new tp2.SinglyLinkedList();
    boolean b60 = iP58.equals((java.lang.Object)singlyLinkedList59);
    java.lang.Integer i61 = iP58.getThird();
    boolean b62 = strictlySortedSinglyLinkedList47.removeFromIP(iP58);
    boolean b63 = server46.removeException(iP58);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList64 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP69 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b70 = strictlySortedSinglyLinkedList64.containsIP(iP69);
    iP69.setFirst((java.lang.Integer)0);
    java.lang.Object obj73 = null;
    boolean b74 = iP69.equals(obj73);
    boolean b75 = server46.addBan(iP69);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList76 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP81 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b82 = strictlySortedSinglyLinkedList76.containsIP(iP81);
    iP81.setFirst((java.lang.Integer)0);
    java.lang.Object obj85 = null;
    boolean b86 = iP81.equals(obj85);
    iP81.setThird((java.lang.Integer)953344);
    boolean b89 = server46.removeException(iP81);
    boolean b90 = server0.addException(iP81);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i15 + "' != '" + 167772288+ "'", i15.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b53 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b60 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i61 + "' != '" + 167772288+ "'", i61.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b62 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b63 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b70 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b74 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b75 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b82 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b86 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b89 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b90 == true);

  }

  @Test
  public void test196() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test196"); }


    int i1 = java.lang.Integer.numberOfTrailingZeros(336471815);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);

  }

  @Test
  public void test197() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test197"); }


    int i2 = java.lang.Integer.remainderUnsigned(131072, 8388608);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 131072);

  }

  @Test
  public void test198() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test198"); }


    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList0 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b1 = strictlySortedSinglyLinkedList0.isEmpty();
    tp2.SinglyLinkedList singlyLinkedList2 = new tp2.SinglyLinkedList();
    int i3 = singlyLinkedList2.getSize();
    tp2.IP iP5 = singlyLinkedList2.get(10);
    boolean b6 = singlyLinkedList2.isEmpty();
    tp2.IP iP11 = new tp2.IP((java.lang.Integer)41943073, (java.lang.Integer)(-805306368), (java.lang.Integer)13, (java.lang.Integer)37);
    boolean b12 = singlyLinkedList2.remove(iP11);
    tp2.Server server13 = new tp2.Server();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList14 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP19 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b20 = strictlySortedSinglyLinkedList14.containsIP(iP19);
    tp2.IP iP25 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList26 = new tp2.SinglyLinkedList();
    boolean b27 = iP25.equals((java.lang.Object)singlyLinkedList26);
    java.lang.Integer i28 = iP25.getThird();
    boolean b29 = strictlySortedSinglyLinkedList14.removeFromIP(iP25);
    boolean b30 = server13.removeException(iP25);
    server13.update();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList32 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP37 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b38 = strictlySortedSinglyLinkedList32.containsIP(iP37);
    iP37.setSecond((java.lang.Integer)(-2147483638));
    java.lang.Integer i41 = iP37.getFourth();
    java.lang.Integer i42 = iP37.getFirst();
    iP37.setFirst((java.lang.Integer)20971536);
    boolean b45 = server13.addException(iP37);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList46 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP47 = null;
    tp2.IPBan iPBan49 = new tp2.IPBan(iP47, (java.lang.Long)0L);
    boolean b50 = strictlySortedSinglyLinkedList46.contains(iPBan49);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList51 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP56 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b57 = strictlySortedSinglyLinkedList51.containsIP(iP56);
    iP56.setFirst((java.lang.Integer)0);
    java.lang.Integer i60 = iP56.getSecond();
    iPBan49.setIp(iP56);
    boolean b62 = server13.connect(iP56);
    tp2.SinglyLinkedList singlyLinkedList63 = new tp2.SinglyLinkedList();
    int i64 = singlyLinkedList63.getSize();
    tp2.IP iP65 = null;
    singlyLinkedList63.add(iP65);
    tp2.IP iP71 = new tp2.IP((java.lang.Integer)10, (java.lang.Integer)10, (java.lang.Integer)1, (java.lang.Integer)10);
    singlyLinkedList63.add(iP71);
    tp2.SinglyLinkedList singlyLinkedList73 = new tp2.SinglyLinkedList();
    int i74 = singlyLinkedList73.getSize();
    tp2.IP iP75 = null;
    singlyLinkedList73.add(iP75);
    tp2.IP iP81 = new tp2.IP((java.lang.Integer)10, (java.lang.Integer)10, (java.lang.Integer)1, (java.lang.Integer)10);
    singlyLinkedList73.add(iP81);
    singlyLinkedList63.add(iP81);
    boolean b84 = server13.connect(iP81);
    singlyLinkedList2.add(iP81);
    boolean b86 = strictlySortedSinglyLinkedList0.containsIP(iP81);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i28 + "' != '" + 167772288+ "'", i28.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i41 + "' != '" + 10+ "'", i41.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i42 + "' != '" + (-2147483638)+ "'", i42.equals((-2147483638)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b50 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b57 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i60 + "' != '" + 100+ "'", i60.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b62 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i64 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i74 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b84 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b86 == false);

  }

  @Test
  public void test199() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test199"); }


    long long1 = java.lang.Integer.toUnsignedLong(41943073);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == 41943073L);

  }

  @Test
  public void test200() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test200"); }


    int i1 = java.lang.Integer.signum(110592);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 1);

  }

  @Test
  public void test201() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test201"); }


    // The following exception was thrown during execution in test generation
    try {
      int i1 = java.lang.Integer.parseInt("2147483658");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test202() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test202"); }


    java.lang.Integer i1 = new java.lang.Integer(953355);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 953355+ "'", i1.equals(953355));

  }

  @Test
  public void test203() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test203"); }


    java.lang.Integer i1 = new java.lang.Integer("83886146");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 83886146+ "'", i1.equals(83886146));

  }

  @Test
  public void test204() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test204"); }


    java.lang.Integer i2 = java.lang.Integer.getInteger("7270e14", 26214);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i2 + "' != '" + 26214+ "'", i2.equals(26214));

  }

  @Test
  public void test205() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test205"); }


    // The following exception was thrown during execution in test generation
    try {
      java.lang.Integer i2 = java.lang.Integer.valueOf("262144", 26214);
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test206() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test206"); }


    tp2.SinglyLinkedList singlyLinkedList0 = new tp2.SinglyLinkedList();
    int i1 = singlyLinkedList0.getSize();
    tp2.IP iP3 = singlyLinkedList0.get(10);
    tp2.IP iP8 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    singlyLinkedList0.add(iP8);
    int i10 = singlyLinkedList0.getSize();
    tp2.IP iP15 = new tp2.IP((java.lang.Integer)(-2147483648), (java.lang.Integer)60000010, (java.lang.Integer)64, (java.lang.Integer)1073741824);
    singlyLinkedList0.add(iP15);
    iP15.setSecond((java.lang.Integer)17);
    java.lang.Integer i19 = iP15.getSecond();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i19 + "' != '" + 17+ "'", i19.equals(17));

  }

  @Test
  public void test207() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test207"); }


    java.lang.Integer i1 = java.lang.Integer.decode("34");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 34+ "'", i1.equals(34));

  }

  @Test
  public void test208() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test208"); }


    // The following exception was thrown during execution in test generation
    try {
      int i2 = java.lang.Integer.parseUnsignedInt("", 0);
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

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test209"); }


    int i1 = java.lang.Integer.numberOfTrailingZeros(884736);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 15);

  }

  @Test
  public void test210() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test210"); }


    int i1 = java.lang.Integer.numberOfLeadingZeros(17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 27);

  }

  @Test
  public void test211() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test211"); }


    java.lang.Integer i1 = new java.lang.Integer("50");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 50+ "'", i1.equals(50));

  }

  @Test
  public void test212() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test212"); }


    java.lang.String str1 = java.lang.Integer.toBinaryString(50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "110010"+ "'", str1.equals("110010"));

  }

  @Test
  public void test213() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test213"); }


    int i2 = java.lang.Integer.rotateLeft(953355, 953355);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1952471040);

  }

  @Test
  public void test214() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test214"); }


    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList0 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList1 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP6 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b7 = strictlySortedSinglyLinkedList1.containsIP(iP6);
    tp2.IPBan iPBan9 = strictlySortedSinglyLinkedList1.get((-1));
    int i10 = strictlySortedSinglyLinkedList1.getSize();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList11 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP16 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b17 = strictlySortedSinglyLinkedList11.containsIP(iP16);
    tp2.IP iP22 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList23 = new tp2.SinglyLinkedList();
    boolean b24 = iP22.equals((java.lang.Object)singlyLinkedList23);
    java.lang.Integer i25 = iP22.getThird();
    boolean b26 = strictlySortedSinglyLinkedList11.removeFromIP(iP22);
    tp2.IP iP27 = null;
    tp2.IPBan iPBan29 = new tp2.IPBan(iP27, (java.lang.Long)(-1L));
    boolean b30 = strictlySortedSinglyLinkedList11.contains(iPBan29);
    boolean b31 = strictlySortedSinglyLinkedList11.isEmpty();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList32 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP33 = null;
    tp2.IPBan iPBan35 = new tp2.IPBan(iP33, (java.lang.Long)0L);
    boolean b36 = strictlySortedSinglyLinkedList32.contains(iPBan35);
    boolean b37 = strictlySortedSinglyLinkedList11.add(iPBan35);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList38 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP39 = null;
    tp2.IPBan iPBan41 = new tp2.IPBan(iP39, (java.lang.Long)0L);
    boolean b42 = strictlySortedSinglyLinkedList38.contains(iPBan41);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList43 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP48 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b49 = strictlySortedSinglyLinkedList43.containsIP(iP48);
    iP48.setFirst((java.lang.Integer)0);
    java.lang.Integer i52 = iP48.getSecond();
    iPBan41.setIp(iP48);
    iPBan41.setExpires((java.lang.Long)100L);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList56 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b57 = strictlySortedSinglyLinkedList56.isEmpty();
    tp2.IP iP62 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b63 = strictlySortedSinglyLinkedList56.removeFromIP(iP62);
    iPBan41.setIp(iP62);
    tp2.IP iP65 = iPBan41.getIp();
    boolean b66 = strictlySortedSinglyLinkedList11.contains(iPBan41);
    boolean b67 = strictlySortedSinglyLinkedList1.add(iPBan41);
    boolean b68 = strictlySortedSinglyLinkedList0.add(iPBan41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iPBan9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i25 + "' != '" + 167772288+ "'", i25.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b49 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i52 + "' != '" + 100+ "'", i52.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b57 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b63 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP65);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b66 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b67 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b68 == true);

  }

  @Test
  public void test215() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test215"); }


    int i2 = java.lang.Integer.rotateLeft(524288, 524288);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 524288);

  }

  @Test
  public void test216() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test216"); }


    int i2 = java.lang.Integer.compare(0, 17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == (-1));

  }

  @Test
  public void test217() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test217"); }


    tp2.Server server0 = new tp2.Server();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList1 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP6 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b7 = strictlySortedSinglyLinkedList1.containsIP(iP6);
    tp2.IP iP12 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList13 = new tp2.SinglyLinkedList();
    boolean b14 = iP12.equals((java.lang.Object)singlyLinkedList13);
    java.lang.Integer i15 = iP12.getThird();
    boolean b16 = strictlySortedSinglyLinkedList1.removeFromIP(iP12);
    boolean b17 = server0.removeException(iP12);
    server0.update();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList19 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP24 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b25 = strictlySortedSinglyLinkedList19.containsIP(iP24);
    tp2.IP iP30 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList31 = new tp2.SinglyLinkedList();
    boolean b32 = iP30.equals((java.lang.Object)singlyLinkedList31);
    java.lang.Integer i33 = iP30.getThird();
    boolean b34 = strictlySortedSinglyLinkedList19.removeFromIP(iP30);
    boolean b36 = iP30.equals((java.lang.Object)0);
    tp2.IPBan iPBan38 = new tp2.IPBan(iP30, (java.lang.Long)100L);
    boolean b39 = server0.connect(iP30);
    server0.update();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList41 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP46 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b47 = strictlySortedSinglyLinkedList41.containsIP(iP46);
    iP46.setFirst((java.lang.Integer)0);
    iP46.setFourth((java.lang.Integer)7);
    iP46.setThird((java.lang.Integer)6);
    boolean b54 = server0.addBan(iP46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i15 + "' != '" + 167772288+ "'", i15.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i33 + "' != '" + 167772288+ "'", i33.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b47 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b54 == true);

  }

  @Test
  public void test218() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test218"); }


    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList0 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b1 = strictlySortedSinglyLinkedList0.isEmpty();
    tp2.IP iP6 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b7 = strictlySortedSinglyLinkedList0.removeFromIP(iP6);
    tp2.IP iP12 = new tp2.IP((java.lang.Integer)10, (java.lang.Integer)10, (java.lang.Integer)1, (java.lang.Integer)10);
    tp2.IPBan iPBan14 = new tp2.IPBan(iP12, (java.lang.Long)100L);
    boolean b15 = strictlySortedSinglyLinkedList0.contains(iPBan14);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList16 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP21 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b22 = strictlySortedSinglyLinkedList16.containsIP(iP21);
    tp2.IP iP23 = null;
    tp2.IPBan iPBan25 = new tp2.IPBan(iP23, (java.lang.Long)(-1L));
    boolean b26 = strictlySortedSinglyLinkedList16.contains(iPBan25);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList27 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP32 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b33 = strictlySortedSinglyLinkedList27.containsIP(iP32);
    tp2.IPBan iPBan35 = strictlySortedSinglyLinkedList27.get((-1));
    boolean b36 = strictlySortedSinglyLinkedList27.isEmpty();
    tp2.IP iP37 = null;
    tp2.IPBan iPBan39 = new tp2.IPBan(iP37, (java.lang.Long)(-1L));
    boolean b40 = strictlySortedSinglyLinkedList27.contains(iPBan39);
    boolean b41 = strictlySortedSinglyLinkedList16.add(iPBan39);
    boolean b42 = strictlySortedSinglyLinkedList0.contains(iPBan39);
    tp2.IP iP43 = null;
    boolean b44 = strictlySortedSinglyLinkedList0.removeFromIP(iP43);
    tp2.IPBan iPBan46 = strictlySortedSinglyLinkedList0.get(72);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iPBan35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iPBan46);

  }

  @Test
  public void test219() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test219"); }


    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList0 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b1 = strictlySortedSinglyLinkedList0.isEmpty();
    tp2.IP iP2 = null;
    tp2.IPBan iPBan4 = new tp2.IPBan(iP2, (java.lang.Long)0L);
    boolean b5 = strictlySortedSinglyLinkedList0.contains(iPBan4);
    iPBan4.setExpires((java.lang.Long)83886146L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);

  }

  @Test
  public void test220() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test220"); }


    java.lang.String str1 = java.lang.Integer.toBinaryString(67108864);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "100000000000000000000000000"+ "'", str1.equals("100000000000000000000000000"));

  }

  @Test
  public void test221() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test221"); }


    int i2 = java.lang.Integer.remainderUnsigned(2, 271056898);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 2);

  }

  @Test
  public void test222() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test222"); }


    int i2 = java.lang.Integer.rotateLeft(0, (-1121320960));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);

  }

  @Test
  public void test223() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test223"); }


    int i1 = java.lang.Integer.reverseBytes(40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 671088640);

  }

  @Test
  public void test224() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test224"); }


    int i1 = java.lang.Integer.parseUnsignedInt("34");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 34);

  }

  @Test
  public void test225() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test225"); }


    // The following exception was thrown during execution in test generation
    try {
      java.lang.Integer i1 = new java.lang.Integer("13420111031214");
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

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test226"); }


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
  public void test227() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test227"); }


    java.lang.Integer i1 = java.lang.Integer.valueOf(17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 17+ "'", i1.equals(17));

  }

  @Test
  public void test228() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test228"); }


    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList0 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP1 = null;
    tp2.IPBan iPBan3 = new tp2.IPBan(iP1, (java.lang.Long)0L);
    boolean b4 = strictlySortedSinglyLinkedList0.contains(iPBan3);
    tp2.IP iP9 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    java.lang.Integer i10 = iP9.getFourth();
    boolean b11 = strictlySortedSinglyLinkedList0.removeFromIP(iP9);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList12 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP13 = null;
    tp2.IPBan iPBan15 = new tp2.IPBan(iP13, (java.lang.Long)0L);
    boolean b16 = strictlySortedSinglyLinkedList12.contains(iPBan15);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList17 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP18 = null;
    tp2.IPBan iPBan20 = new tp2.IPBan(iP18, (java.lang.Long)0L);
    boolean b21 = strictlySortedSinglyLinkedList17.contains(iPBan20);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList22 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP27 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b28 = strictlySortedSinglyLinkedList22.containsIP(iP27);
    iP27.setFirst((java.lang.Integer)0);
    java.lang.Integer i31 = iP27.getSecond();
    iPBan20.setIp(iP27);
    boolean b33 = strictlySortedSinglyLinkedList12.contains(iPBan20);
    boolean b34 = strictlySortedSinglyLinkedList0.contains(iPBan20);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList35 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP40 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b41 = strictlySortedSinglyLinkedList35.containsIP(iP40);
    tp2.IP iP46 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList47 = new tp2.SinglyLinkedList();
    boolean b48 = iP46.equals((java.lang.Object)singlyLinkedList47);
    java.lang.Integer i49 = iP46.getThird();
    boolean b50 = strictlySortedSinglyLinkedList35.removeFromIP(iP46);
    tp2.IP iP51 = null;
    tp2.IPBan iPBan53 = new tp2.IPBan(iP51, (java.lang.Long)(-1L));
    boolean b54 = strictlySortedSinglyLinkedList35.contains(iPBan53);
    tp2.IPBan iPBan56 = strictlySortedSinglyLinkedList35.get(1);
    tp2.IP iP61 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    java.lang.Integer i62 = iP61.getFourth();
    boolean b63 = strictlySortedSinglyLinkedList35.containsIP(iP61);
    tp2.SinglyLinkedList singlyLinkedList64 = new tp2.SinglyLinkedList();
    int i65 = singlyLinkedList64.getSize();
    tp2.IP iP66 = null;
    singlyLinkedList64.add(iP66);
    tp2.IP iP72 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b73 = singlyLinkedList64.contains(iP72);
    boolean b74 = strictlySortedSinglyLinkedList35.removeFromIP(iP72);
    boolean b75 = strictlySortedSinglyLinkedList0.removeFromIP(iP72);
    iP72.setThird((java.lang.Integer)6);
    java.lang.Integer i78 = iP72.getThird();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i10 + "' != '" + 10+ "'", i10.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i31 + "' != '" + 100+ "'", i31.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b48 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i49 + "' != '" + 167772288+ "'", i49.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b50 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b54 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iPBan56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i62 + "' != '" + 10+ "'", i62.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b63 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i65 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b73 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b74 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b75 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i78 + "' != '" + 6+ "'", i78.equals(6));

  }

  @Test
  public void test229() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test229"); }


    int i2 = java.lang.Integer.remainderUnsigned((-2147483625), (-2147483636));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 11);

  }

  @Test
  public void test230() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test230"); }


    // The following exception was thrown during execution in test generation
    try {
      int i2 = java.lang.Integer.parseInt("18", 6291456);
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test231() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test231"); }


    int i2 = java.lang.Integer.remainderUnsigned(6, 301989888);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 6);

  }

  @Test
  public void test232() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test232"); }


    int i2 = java.lang.Integer.max(4194304, 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 4194304);

  }

  @Test
  public void test233() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test233"); }


    int i2 = java.lang.Integer.max(10941, (-803208192));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 10941);

  }

  @Test
  public void test234() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test234"); }


    // The following exception was thrown during execution in test generation
    try {
      java.lang.Integer i1 = new java.lang.Integer("10002000000");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test235() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test235"); }


    // The following exception was thrown during execution in test generation
    try {
      java.lang.Integer i2 = java.lang.Integer.valueOf("40", 1107296261);
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


    int i2 = java.lang.Integer.rotateLeft(7, 24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 117440512);

  }

  @Test
  public void test237() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test237"); }


    tp2.Server server0 = new tp2.Server();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList1 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP6 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b7 = strictlySortedSinglyLinkedList1.containsIP(iP6);
    tp2.IP iP12 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList13 = new tp2.SinglyLinkedList();
    boolean b14 = iP12.equals((java.lang.Object)singlyLinkedList13);
    java.lang.Integer i15 = iP12.getThird();
    boolean b16 = strictlySortedSinglyLinkedList1.removeFromIP(iP12);
    boolean b17 = server0.removeException(iP12);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList18 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP23 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b24 = strictlySortedSinglyLinkedList18.containsIP(iP23);
    tp2.IPBan iPBan26 = strictlySortedSinglyLinkedList18.get((-1));
    tp2.IP iP31 = new tp2.IP((java.lang.Integer)10, (java.lang.Integer)10, (java.lang.Integer)1, (java.lang.Integer)10);
    tp2.IPBan iPBan33 = new tp2.IPBan(iP31, (java.lang.Long)100L);
    boolean b34 = strictlySortedSinglyLinkedList18.removeFromIP(iP31);
    boolean b35 = server0.removeBan(iP31);
    tp2.IPBan iPBan37 = new tp2.IPBan(iP31, (java.lang.Long)83886146L);
    tp2.IP iP38 = iPBan37.getIp();
    tp2.IP iP39 = iPBan37.getIp();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i15 + "' != '" + 167772288+ "'", i15.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iPBan26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP39);

  }

  @Test
  public void test238() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test238"); }


    java.lang.Integer i1 = new java.lang.Integer("11");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 11+ "'", i1.equals(11));

  }

  @Test
  public void test239() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test239"); }


    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList0 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP5 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b6 = strictlySortedSinglyLinkedList0.containsIP(iP5);
    tp2.IP iP11 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList12 = new tp2.SinglyLinkedList();
    boolean b13 = iP11.equals((java.lang.Object)singlyLinkedList12);
    java.lang.Integer i14 = iP11.getThird();
    boolean b15 = strictlySortedSinglyLinkedList0.removeFromIP(iP11);
    int i16 = strictlySortedSinglyLinkedList0.getSize();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList17 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP22 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b23 = strictlySortedSinglyLinkedList17.containsIP(iP22);
    tp2.IP iP28 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList29 = new tp2.SinglyLinkedList();
    boolean b30 = iP28.equals((java.lang.Object)singlyLinkedList29);
    java.lang.Integer i31 = iP28.getThird();
    boolean b32 = strictlySortedSinglyLinkedList17.removeFromIP(iP28);
    boolean b34 = iP28.equals((java.lang.Object)0);
    tp2.IPBan iPBan36 = new tp2.IPBan(iP28, (java.lang.Long)100L);
    boolean b37 = strictlySortedSinglyLinkedList0.add(iPBan36);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList38 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP43 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b44 = strictlySortedSinglyLinkedList38.containsIP(iP43);
    tp2.IP iP49 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList50 = new tp2.SinglyLinkedList();
    boolean b51 = iP49.equals((java.lang.Object)singlyLinkedList50);
    java.lang.Integer i52 = iP49.getThird();
    boolean b53 = strictlySortedSinglyLinkedList38.removeFromIP(iP49);
    int i54 = strictlySortedSinglyLinkedList38.getSize();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList55 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP60 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b61 = strictlySortedSinglyLinkedList55.containsIP(iP60);
    java.lang.Integer i62 = iP60.getFourth();
    tp2.IPBan iPBan64 = new tp2.IPBan(iP60, (java.lang.Long)0L);
    boolean b65 = strictlySortedSinglyLinkedList38.add(iPBan64);
    boolean b66 = strictlySortedSinglyLinkedList0.contains(iPBan64);
    iPBan64.setExpires((java.lang.Long)10L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i14 + "' != '" + 167772288+ "'", i14.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i31 + "' != '" + 167772288+ "'", i31.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b51 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i52 + "' != '" + 167772288+ "'", i52.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b53 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i54 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b61 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i62 + "' != '" + 10+ "'", i62.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b65 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b66 == false);

  }

  @Test
  public void test240() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test240"); }


    int i1 = java.lang.Integer.parseInt("10004001");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 10004001);

  }

  @Test
  public void test241() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test241"); }


    int i2 = java.lang.Integer.min(262144, 402653184);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 262144);

  }

  @Test
  public void test242() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test242"); }


    long long1 = java.lang.Integer.toUnsignedLong(0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == 0L);

  }

  @Test
  public void test243() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test243"); }


    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList0 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP1 = null;
    tp2.IPBan iPBan3 = new tp2.IPBan(iP1, (java.lang.Long)0L);
    boolean b4 = strictlySortedSinglyLinkedList0.contains(iPBan3);
    tp2.IP iP9 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    java.lang.Integer i10 = iP9.getFourth();
    boolean b11 = strictlySortedSinglyLinkedList0.removeFromIP(iP9);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList12 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP13 = null;
    tp2.IPBan iPBan15 = new tp2.IPBan(iP13, (java.lang.Long)0L);
    boolean b16 = strictlySortedSinglyLinkedList12.contains(iPBan15);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList17 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP18 = null;
    tp2.IPBan iPBan20 = new tp2.IPBan(iP18, (java.lang.Long)0L);
    boolean b21 = strictlySortedSinglyLinkedList17.contains(iPBan20);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList22 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP27 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b28 = strictlySortedSinglyLinkedList22.containsIP(iP27);
    iP27.setFirst((java.lang.Integer)0);
    java.lang.Integer i31 = iP27.getSecond();
    iPBan20.setIp(iP27);
    boolean b33 = strictlySortedSinglyLinkedList12.contains(iPBan20);
    boolean b34 = strictlySortedSinglyLinkedList0.contains(iPBan20);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList35 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP40 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b41 = strictlySortedSinglyLinkedList35.containsIP(iP40);
    tp2.IP iP46 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList47 = new tp2.SinglyLinkedList();
    boolean b48 = iP46.equals((java.lang.Object)singlyLinkedList47);
    java.lang.Integer i49 = iP46.getThird();
    boolean b50 = strictlySortedSinglyLinkedList35.removeFromIP(iP46);
    tp2.IP iP51 = null;
    tp2.IPBan iPBan53 = new tp2.IPBan(iP51, (java.lang.Long)(-1L));
    boolean b54 = strictlySortedSinglyLinkedList35.contains(iPBan53);
    tp2.IPBan iPBan56 = strictlySortedSinglyLinkedList35.get(1);
    tp2.IP iP61 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    java.lang.Integer i62 = iP61.getFourth();
    boolean b63 = strictlySortedSinglyLinkedList35.containsIP(iP61);
    tp2.SinglyLinkedList singlyLinkedList64 = new tp2.SinglyLinkedList();
    int i65 = singlyLinkedList64.getSize();
    tp2.IP iP66 = null;
    singlyLinkedList64.add(iP66);
    tp2.IP iP72 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b73 = singlyLinkedList64.contains(iP72);
    boolean b74 = strictlySortedSinglyLinkedList35.removeFromIP(iP72);
    boolean b75 = strictlySortedSinglyLinkedList0.removeFromIP(iP72);
    boolean b76 = strictlySortedSinglyLinkedList0.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i10 + "' != '" + 10+ "'", i10.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i31 + "' != '" + 100+ "'", i31.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b48 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i49 + "' != '" + 167772288+ "'", i49.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b50 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b54 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iPBan56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i62 + "' != '" + 10+ "'", i62.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b63 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i65 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b73 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b74 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b75 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b76 == true);

  }

  @Test
  public void test244() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test244"); }


    tp2.SinglyLinkedList singlyLinkedList0 = new tp2.SinglyLinkedList();
    int i1 = singlyLinkedList0.getSize();
    tp2.SinglyLinkedList singlyLinkedList2 = new tp2.SinglyLinkedList();
    int i3 = singlyLinkedList2.getSize();
    tp2.IP iP5 = singlyLinkedList2.get(10);
    tp2.IP iP10 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    singlyLinkedList2.add(iP10);
    iP10.setThird((java.lang.Integer)120000020);
    singlyLinkedList0.add(iP10);
    iP10.setThird((java.lang.Integer)83886080);
    java.lang.Integer i17 = iP10.getFirst();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i17 + "' != '" + (-2147483638)+ "'", i17.equals((-2147483638)));

  }

  @Test
  public void test245() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test245"); }


    int i2 = java.lang.Integer.divideUnsigned(4, 2147483647);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);

  }

  @Test
  public void test246() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test246"); }


    int i1 = java.lang.Integer.numberOfLeadingZeros(1073745921);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 1);

  }

  @Test
  public void test247() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test247"); }


    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList0 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP5 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b6 = strictlySortedSinglyLinkedList0.containsIP(iP5);
    java.lang.Integer i7 = iP5.getFourth();
    tp2.IPBan iPBan9 = new tp2.IPBan(iP5, (java.lang.Long)0L);
    iP5.setFourth((java.lang.Integer)240000041);
    tp2.Server server12 = new tp2.Server();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList13 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP18 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b19 = strictlySortedSinglyLinkedList13.containsIP(iP18);
    tp2.IP iP24 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList25 = new tp2.SinglyLinkedList();
    boolean b26 = iP24.equals((java.lang.Object)singlyLinkedList25);
    java.lang.Integer i27 = iP24.getThird();
    boolean b28 = strictlySortedSinglyLinkedList13.removeFromIP(iP24);
    boolean b29 = server12.removeException(iP24);
    server12.update();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList31 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP36 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b37 = strictlySortedSinglyLinkedList31.containsIP(iP36);
    iP36.setSecond((java.lang.Integer)(-2147483638));
    java.lang.Integer i40 = iP36.getFourth();
    java.lang.Integer i41 = iP36.getFirst();
    iP36.setFirst((java.lang.Integer)20971536);
    boolean b44 = server12.addException(iP36);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList45 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP46 = null;
    tp2.IPBan iPBan48 = new tp2.IPBan(iP46, (java.lang.Long)0L);
    boolean b49 = strictlySortedSinglyLinkedList45.contains(iPBan48);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList50 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP55 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b56 = strictlySortedSinglyLinkedList50.containsIP(iP55);
    iP55.setFirst((java.lang.Integer)0);
    java.lang.Integer i59 = iP55.getSecond();
    iPBan48.setIp(iP55);
    boolean b61 = server12.connect(iP55);
    server12.update();
    tp2.Server server63 = new tp2.Server();
    tp2.ITime iTime64 = null;
    server63.setTime(iTime64);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList66 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP71 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b72 = strictlySortedSinglyLinkedList66.containsIP(iP71);
    tp2.IP iP77 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList78 = new tp2.SinglyLinkedList();
    boolean b79 = iP77.equals((java.lang.Object)singlyLinkedList78);
    java.lang.Integer i80 = iP77.getThird();
    boolean b81 = strictlySortedSinglyLinkedList66.removeFromIP(iP77);
    boolean b83 = iP77.equals((java.lang.Object)0);
    boolean b84 = server63.addException(iP77);
    boolean b85 = server12.removeException(iP77);
    boolean b86 = iP5.equals((java.lang.Object)iP77);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i7 + "' != '" + 10+ "'", i7.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i27 + "' != '" + 167772288+ "'", i27.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i40 + "' != '" + 10+ "'", i40.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i41 + "' != '" + (-2147483638)+ "'", i41.equals((-2147483638)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b49 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b56 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i59 + "' != '" + 100+ "'", i59.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b61 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b72 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b79 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i80 + "' != '" + 167772288+ "'", i80.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b81 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b83 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b84 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b85 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b86 == false);

  }

  @Test
  public void test248() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test248"); }


    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList0 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP5 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b6 = strictlySortedSinglyLinkedList0.containsIP(iP5);
    tp2.IP iP11 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList12 = new tp2.SinglyLinkedList();
    boolean b13 = iP11.equals((java.lang.Object)singlyLinkedList12);
    java.lang.Integer i14 = iP11.getThird();
    boolean b15 = strictlySortedSinglyLinkedList0.removeFromIP(iP11);
    boolean b17 = iP11.equals((java.lang.Object)0);
    tp2.IPBan iPBan19 = new tp2.IPBan(iP11, (java.lang.Long)100L);
    java.lang.Long long20 = null;
    iPBan19.setExpires(long20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i14 + "' != '" + 167772288+ "'", i14.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);

  }

  @Test
  public void test249() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test249"); }


    tp2.SinglyLinkedList singlyLinkedList0 = new tp2.SinglyLinkedList();
    int i1 = singlyLinkedList0.getSize();
    boolean b2 = singlyLinkedList0.isEmpty();
    tp2.IP iP7 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList8 = new tp2.SinglyLinkedList();
    boolean b9 = iP7.equals((java.lang.Object)singlyLinkedList8);
    iP7.setSecond((java.lang.Integer)2);
    boolean b12 = singlyLinkedList0.contains(iP7);
    java.lang.Integer i13 = iP7.getFourth();
    iP7.setSecond((java.lang.Integer)(-2147483625));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i13 + "' != '" + 10+ "'", i13.equals(10));

  }

  @Test
  public void test250() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test250"); }


    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList0 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b1 = strictlySortedSinglyLinkedList0.isEmpty();
    tp2.IPBan iPBan3 = strictlySortedSinglyLinkedList0.get((-2147483648));
    boolean b4 = strictlySortedSinglyLinkedList0.isEmpty();
    int i5 = strictlySortedSinglyLinkedList0.getSize();
    tp2.IP iP6 = null;
    boolean b7 = strictlySortedSinglyLinkedList0.containsIP(iP6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iPBan3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);

  }

  @Test
  public void test251() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test251"); }


    int i1 = java.lang.Integer.highestOneBit((-2147483625));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == (-2147483648));

  }

  @Test
  public void test252() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test252"); }


    int i1 = java.lang.Integer.signum((-1674030564));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == (-1));

  }

  @Test
  public void test253() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test253"); }


    int i1 = java.lang.Integer.bitCount(41943073);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 4);

  }

  @Test
  public void test254() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test254"); }


    java.lang.String str2 = java.lang.Integer.toUnsignedString(60000010, 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "60000010"+ "'", str2.equals("60000010"));

  }

  @Test
  public void test255() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test255"); }


    int i1 = java.lang.Integer.reverse(10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 1342177280);

  }

  @Test
  public void test256() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test256"); }


    // The following exception was thrown during execution in test generation
    try {
      java.lang.Integer i1 = java.lang.Integer.decode("a");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test257() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test257"); }


    int i2 = java.lang.Integer.compareUnsigned(500000102, 512);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);

  }

  @Test
  public void test258() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test258"); }


    // The following exception was thrown during execution in test generation
    try {
      java.lang.Integer i2 = java.lang.Integer.valueOf("110010", 1342177280);
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

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test259"); }


    tp2.SinglyLinkedList singlyLinkedList0 = new tp2.SinglyLinkedList();
    boolean b1 = singlyLinkedList0.isEmpty();
    boolean b2 = singlyLinkedList0.isEmpty();
    int i3 = singlyLinkedList0.getSize();
    tp2.IP iP5 = singlyLinkedList0.get(100);
    tp2.IP iP10 = new tp2.IP((java.lang.Integer)67109184, (java.lang.Integer)120000020, (java.lang.Integer)67109184, (java.lang.Integer)20971536);
    java.lang.Integer i11 = iP10.getFirst();
    singlyLinkedList0.add(iP10);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList13 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP14 = null;
    tp2.IPBan iPBan16 = new tp2.IPBan(iP14, (java.lang.Long)0L);
    boolean b17 = strictlySortedSinglyLinkedList13.contains(iPBan16);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList18 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP23 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b24 = strictlySortedSinglyLinkedList18.containsIP(iP23);
    iP23.setFirst((java.lang.Integer)0);
    java.lang.Integer i27 = iP23.getSecond();
    iPBan16.setIp(iP23);
    tp2.Server server29 = new tp2.Server();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList30 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP35 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b36 = strictlySortedSinglyLinkedList30.containsIP(iP35);
    tp2.IP iP41 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList42 = new tp2.SinglyLinkedList();
    boolean b43 = iP41.equals((java.lang.Object)singlyLinkedList42);
    java.lang.Integer i44 = iP41.getThird();
    boolean b45 = strictlySortedSinglyLinkedList30.removeFromIP(iP41);
    boolean b46 = server29.removeException(iP41);
    iPBan16.setIp(iP41);
    tp2.IP iP48 = iPBan16.getIp();
    java.lang.Integer i49 = iP48.getSecond();
    boolean b50 = singlyLinkedList0.contains(iP48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i11 + "' != '" + 67109184+ "'", i11.equals(67109184));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i27 + "' != '" + 100+ "'", i27.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b43 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i44 + "' != '" + 167772288+ "'", i44.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b46 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i49 + "' != '" + 100+ "'", i49.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b50 == false);

  }

  @Test
  public void test260() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test260"); }


    tp2.Server server0 = new tp2.Server();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList1 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP6 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b7 = strictlySortedSinglyLinkedList1.containsIP(iP6);
    tp2.IP iP12 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList13 = new tp2.SinglyLinkedList();
    boolean b14 = iP12.equals((java.lang.Object)singlyLinkedList13);
    java.lang.Integer i15 = iP12.getThird();
    boolean b16 = strictlySortedSinglyLinkedList1.removeFromIP(iP12);
    boolean b17 = server0.removeException(iP12);
    server0.update();
    tp2.ITime iTime19 = null;
    server0.setTime(iTime19);
    tp2.IP iP25 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList26 = new tp2.SinglyLinkedList();
    boolean b27 = iP25.equals((java.lang.Object)singlyLinkedList26);
    iP25.setSecond((java.lang.Integer)2);
    boolean b30 = server0.removeBan(iP25);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList31 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b32 = strictlySortedSinglyLinkedList31.isEmpty();
    tp2.IP iP37 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b38 = strictlySortedSinglyLinkedList31.removeFromIP(iP37);
    iP37.setThird((java.lang.Integer)41943073);
    boolean b41 = server0.removeException(iP37);
    boolean b42 = server0.notSharedElements();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i15 + "' != '" + 167772288+ "'", i15.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == true);

  }

  @Test
  public void test261() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test261"); }


    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList0 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IPBan iPBan2 = strictlySortedSinglyLinkedList0.get(28);
    tp2.IP iP7 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList8 = new tp2.SinglyLinkedList();
    boolean b9 = iP7.equals((java.lang.Object)singlyLinkedList8);
    java.lang.Integer i10 = iP7.getThird();
    iP7.setFourth((java.lang.Integer)37);
    boolean b13 = strictlySortedSinglyLinkedList0.containsIP(iP7);
    java.lang.Integer i14 = iP7.getFirst();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iPBan2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i10 + "' != '" + 167772288+ "'", i10.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i14 + "' != '" + (-2147483638)+ "'", i14.equals((-2147483638)));

  }

  @Test
  public void test262() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test262"); }


    java.lang.Integer i1 = new java.lang.Integer("34");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 34+ "'", i1.equals(34));

  }

  @Test
  public void test263() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test263"); }


    int i2 = java.lang.Integer.compare(6291456, 268451841);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == (-1));

  }

  @Test
  public void test264() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test264"); }


    tp2.SinglyLinkedList singlyLinkedList0 = new tp2.SinglyLinkedList();
    boolean b1 = singlyLinkedList0.isEmpty();
    tp2.IP iP3 = singlyLinkedList0.get(0);
    int i4 = singlyLinkedList0.getSize();
    int i5 = singlyLinkedList0.getSize();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);

  }

  @Test
  public void test265() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test265"); }


    int i2 = java.lang.Integer.compare((-803208192), 83886144);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == (-1));

  }

  @Test
  public void test266() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test266"); }


    int i1 = java.lang.Integer.numberOfTrailingZeros(31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);

  }

  @Test
  public void test267() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test267"); }


    int i2 = java.lang.Integer.sum(1073745921, 1000);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1073746921);

  }

  @Test
  public void test268() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test268"); }


    int i2 = java.lang.Integer.rotateRight(6291456, 41943073);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 3145728);

  }

  @Test
  public void test269() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test269"); }


    int i2 = java.lang.Integer.sum((-892585062), 10941);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == (-892574121));

  }

  @Test
  public void test270() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test270"); }


    long long1 = java.lang.Integer.toUnsignedLong((-2147483638));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == 2147483658L);

  }

  @Test
  public void test271() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test271"); }


    java.lang.String str1 = java.lang.Integer.toHexString(884736);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "d8000"+ "'", str1.equals("d8000"));

  }

  @Test
  public void test272() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test272"); }


    int i1 = java.lang.Integer.reverse(1952471040);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 1705518);

  }

  @Test
  public void test273() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test273"); }


    int i2 = java.lang.Integer.rotateLeft(20971536, 301989888);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 20971536);

  }

  @Test
  public void test274() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test274"); }


    int i2 = java.lang.Integer.compareUnsigned(67109184, 25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);

  }

  @Test
  public void test275() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test275"); }


    tp2.Server server0 = new tp2.Server();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList1 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP6 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b7 = strictlySortedSinglyLinkedList1.containsIP(iP6);
    tp2.IP iP12 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList13 = new tp2.SinglyLinkedList();
    boolean b14 = iP12.equals((java.lang.Object)singlyLinkedList13);
    java.lang.Integer i15 = iP12.getThird();
    boolean b16 = strictlySortedSinglyLinkedList1.removeFromIP(iP12);
    boolean b17 = server0.removeException(iP12);
    server0.update();
    boolean b19 = server0.bansOkTime();
    tp2.Server server20 = new tp2.Server();
    tp2.ITime iTime21 = null;
    server20.setTime(iTime21);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList23 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP28 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b29 = strictlySortedSinglyLinkedList23.containsIP(iP28);
    tp2.IP iP34 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList35 = new tp2.SinglyLinkedList();
    boolean b36 = iP34.equals((java.lang.Object)singlyLinkedList35);
    java.lang.Integer i37 = iP34.getThird();
    boolean b38 = strictlySortedSinglyLinkedList23.removeFromIP(iP34);
    boolean b40 = iP34.equals((java.lang.Object)0);
    boolean b41 = server20.addException(iP34);
    tp2.IPBan iPBan43 = new tp2.IPBan(iP34, (java.lang.Long)120000020L);
    boolean b44 = server0.addBan(iP34);
    tp2.SinglyLinkedList singlyLinkedList45 = new tp2.SinglyLinkedList();
    boolean b46 = singlyLinkedList45.isEmpty();
    boolean b47 = singlyLinkedList45.isEmpty();
    int i48 = singlyLinkedList45.getSize();
    tp2.IP iP50 = singlyLinkedList45.get(100);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList51 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP52 = null;
    tp2.IPBan iPBan54 = new tp2.IPBan(iP52, (java.lang.Long)0L);
    boolean b55 = strictlySortedSinglyLinkedList51.contains(iPBan54);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList56 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP61 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b62 = strictlySortedSinglyLinkedList56.containsIP(iP61);
    iP61.setFirst((java.lang.Integer)0);
    java.lang.Integer i65 = iP61.getSecond();
    iPBan54.setIp(iP61);
    tp2.Server server67 = new tp2.Server();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList68 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP73 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b74 = strictlySortedSinglyLinkedList68.containsIP(iP73);
    tp2.IP iP79 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList80 = new tp2.SinglyLinkedList();
    boolean b81 = iP79.equals((java.lang.Object)singlyLinkedList80);
    java.lang.Integer i82 = iP79.getThird();
    boolean b83 = strictlySortedSinglyLinkedList68.removeFromIP(iP79);
    boolean b84 = server67.removeException(iP79);
    iPBan54.setIp(iP79);
    tp2.IP iP86 = iPBan54.getIp();
    boolean b87 = singlyLinkedList45.remove(iP86);
    boolean b88 = server0.connect(iP86);
    iP86.setFourth((java.lang.Integer)500000102);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i15 + "' != '" + 167772288+ "'", i15.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i37 + "' != '" + 167772288+ "'", i37.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b46 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b47 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i48 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b55 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b62 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i65 + "' != '" + 100+ "'", i65.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b74 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b81 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i82 + "' != '" + 167772288+ "'", i82.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b83 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b84 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP86);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b87 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b88 == false);

  }

  @Test
  public void test276() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test276"); }


    java.lang.Integer i1 = new java.lang.Integer("25275");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 25275+ "'", i1.equals(25275));

  }

  @Test
  public void test277() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test277"); }


    // The following exception was thrown during execution in test generation
    try {
      int i2 = java.lang.Integer.parseInt("10942", 671088640);
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test278() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test278"); }


    tp2.Server server0 = new tp2.Server();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList1 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP6 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b7 = strictlySortedSinglyLinkedList1.containsIP(iP6);
    tp2.IP iP12 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList13 = new tp2.SinglyLinkedList();
    boolean b14 = iP12.equals((java.lang.Object)singlyLinkedList13);
    java.lang.Integer i15 = iP12.getThird();
    boolean b16 = strictlySortedSinglyLinkedList1.removeFromIP(iP12);
    boolean b17 = server0.removeException(iP12);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList18 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP23 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b24 = strictlySortedSinglyLinkedList18.containsIP(iP23);
    iP23.setFirst((java.lang.Integer)0);
    java.lang.Object obj27 = null;
    boolean b28 = iP23.equals(obj27);
    boolean b29 = server0.addBan(iP23);
    iP23.setThird((java.lang.Integer)2098176);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i15 + "' != '" + 167772288+ "'", i15.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == true);

  }

  @Test
  public void test279() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test279"); }


    int i2 = java.lang.Integer.rotateLeft(240000041, 1952471040);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 240000041);

  }

  @Test
  public void test280() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test280"); }


    tp2.Server server0 = new tp2.Server();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList1 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP6 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b7 = strictlySortedSinglyLinkedList1.containsIP(iP6);
    tp2.IP iP12 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList13 = new tp2.SinglyLinkedList();
    boolean b14 = iP12.equals((java.lang.Object)singlyLinkedList13);
    java.lang.Integer i15 = iP12.getThird();
    boolean b16 = strictlySortedSinglyLinkedList1.removeFromIP(iP12);
    boolean b17 = server0.removeException(iP12);
    server0.update();
    tp2.ITime iTime19 = null;
    server0.setTime(iTime19);
    tp2.IP iP25 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList26 = new tp2.SinglyLinkedList();
    boolean b27 = iP25.equals((java.lang.Object)singlyLinkedList26);
    iP25.setSecond((java.lang.Integer)2);
    boolean b30 = server0.removeBan(iP25);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList31 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b32 = strictlySortedSinglyLinkedList31.isEmpty();
    tp2.IP iP37 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b38 = strictlySortedSinglyLinkedList31.removeFromIP(iP37);
    iP37.setThird((java.lang.Integer)41943073);
    boolean b41 = server0.removeException(iP37);
    java.lang.Integer i42 = iP37.getSecond();
    iP37.setSecond((java.lang.Integer)301989888);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i15 + "' != '" + 167772288+ "'", i15.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i42 + "' != '" + 100+ "'", i42.equals(100));

  }

  @Test
  public void test281() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test281"); }


    int i1 = java.lang.Integer.parseInt("72");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 72);

  }

  @Test
  public void test282() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test282"); }


    int i1 = java.lang.Integer.reverse((-2147483636));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 805306369);

  }

  @Test
  public void test283() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test283"); }


    java.lang.String str1 = java.lang.Integer.toHexString(271056898);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "10280002"+ "'", str1.equals("10280002"));

  }

  @Test
  public void test284() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test284"); }


    java.lang.String str1 = java.lang.Integer.toBinaryString(83886146);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "101000000000000000001000010"+ "'", str1.equals("101000000000000000001000010"));

  }

  @Test
  public void test285() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test285"); }


    int i2 = java.lang.Integer.max((-2147483636), 6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 6);

  }

  @Test
  public void test286() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test286"); }


    java.lang.Integer i2 = java.lang.Integer.getInteger("10000000000000000000", 41943072);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i2 + "' != '" + 41943072+ "'", i2.equals(41943072));

  }

  @Test
  public void test287() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test287"); }


    java.lang.Integer i1 = java.lang.Integer.getInteger("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);

  }

  @Test
  public void test288() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test288"); }


    tp2.IP iP0 = null;
    tp2.IPBan iPBan2 = new tp2.IPBan(iP0, (java.lang.Long)0L);
    tp2.IP iP3 = iPBan2.getIp();
    java.lang.Long long4 = iPBan2.getExpires();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L+ "'", long4.equals(0L));

  }

  @Test
  public void test289() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test289"); }


    tp2.Server server0 = new tp2.Server();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList1 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP6 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b7 = strictlySortedSinglyLinkedList1.containsIP(iP6);
    tp2.IP iP12 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList13 = new tp2.SinglyLinkedList();
    boolean b14 = iP12.equals((java.lang.Object)singlyLinkedList13);
    java.lang.Integer i15 = iP12.getThird();
    boolean b16 = strictlySortedSinglyLinkedList1.removeFromIP(iP12);
    boolean b17 = server0.removeException(iP12);
    server0.update();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList19 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP24 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b25 = strictlySortedSinglyLinkedList19.containsIP(iP24);
    iP24.setSecond((java.lang.Integer)(-2147483638));
    java.lang.Integer i28 = iP24.getFourth();
    java.lang.Integer i29 = iP24.getFirst();
    iP24.setFirst((java.lang.Integer)20971536);
    boolean b32 = server0.addException(iP24);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList33 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP34 = null;
    tp2.IPBan iPBan36 = new tp2.IPBan(iP34, (java.lang.Long)0L);
    boolean b37 = strictlySortedSinglyLinkedList33.contains(iPBan36);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList38 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP43 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b44 = strictlySortedSinglyLinkedList38.containsIP(iP43);
    iP43.setFirst((java.lang.Integer)0);
    java.lang.Integer i47 = iP43.getSecond();
    iPBan36.setIp(iP43);
    boolean b49 = server0.connect(iP43);
    server0.update();
    tp2.Server server51 = new tp2.Server();
    tp2.ITime iTime52 = null;
    server51.setTime(iTime52);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList54 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP59 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b60 = strictlySortedSinglyLinkedList54.containsIP(iP59);
    tp2.IP iP65 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList66 = new tp2.SinglyLinkedList();
    boolean b67 = iP65.equals((java.lang.Object)singlyLinkedList66);
    java.lang.Integer i68 = iP65.getThird();
    boolean b69 = strictlySortedSinglyLinkedList54.removeFromIP(iP65);
    boolean b71 = iP65.equals((java.lang.Object)0);
    boolean b72 = server51.addException(iP65);
    boolean b73 = server0.removeException(iP65);
    tp2.ITime iTime74 = null;
    server0.setTime(iTime74);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i15 + "' != '" + 167772288+ "'", i15.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i28 + "' != '" + 10+ "'", i28.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i29 + "' != '" + (-2147483638)+ "'", i29.equals((-2147483638)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i47 + "' != '" + 100+ "'", i47.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b49 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b60 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b67 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i68 + "' != '" + 167772288+ "'", i68.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b69 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b71 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b72 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b73 == false);

  }

  @Test
  public void test290() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test290"); }


    java.lang.Integer i1 = new java.lang.Integer((-2147483648));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + (-2147483648)+ "'", i1.equals((-2147483648)));

  }

  @Test
  public void test291() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test291"); }


    int i2 = java.lang.Integer.remainderUnsigned(40, 37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 3);

  }

  @Test
  public void test292() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test292"); }


    int i2 = java.lang.Integer.compare(2098192, (-1979711360));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);

  }

  @Test
  public void test293() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test293"); }


    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList0 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b1 = strictlySortedSinglyLinkedList0.isEmpty();
    tp2.IP iP6 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b7 = strictlySortedSinglyLinkedList0.removeFromIP(iP6);
    tp2.IP iP12 = new tp2.IP((java.lang.Integer)10, (java.lang.Integer)10, (java.lang.Integer)1, (java.lang.Integer)10);
    tp2.IPBan iPBan14 = new tp2.IPBan(iP12, (java.lang.Long)100L);
    boolean b15 = strictlySortedSinglyLinkedList0.contains(iPBan14);
    tp2.IP iP20 = new tp2.IP((java.lang.Integer)10, (java.lang.Integer)10, (java.lang.Integer)1, (java.lang.Integer)10);
    tp2.IPBan iPBan22 = new tp2.IPBan(iP20, (java.lang.Long)100L);
    boolean b23 = strictlySortedSinglyLinkedList0.contains(iPBan22);
    tp2.Server server24 = new tp2.Server();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList25 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP30 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b31 = strictlySortedSinglyLinkedList25.containsIP(iP30);
    tp2.IP iP36 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList37 = new tp2.SinglyLinkedList();
    boolean b38 = iP36.equals((java.lang.Object)singlyLinkedList37);
    java.lang.Integer i39 = iP36.getThird();
    boolean b40 = strictlySortedSinglyLinkedList25.removeFromIP(iP36);
    boolean b41 = server24.removeException(iP36);
    server24.update();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList43 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP48 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b49 = strictlySortedSinglyLinkedList43.containsIP(iP48);
    iP48.setSecond((java.lang.Integer)(-2147483638));
    java.lang.Integer i52 = iP48.getFourth();
    java.lang.Integer i53 = iP48.getFirst();
    iP48.setFirst((java.lang.Integer)20971536);
    boolean b56 = server24.addException(iP48);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList57 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP58 = null;
    tp2.IPBan iPBan60 = new tp2.IPBan(iP58, (java.lang.Long)0L);
    boolean b61 = strictlySortedSinglyLinkedList57.contains(iPBan60);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList62 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP67 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b68 = strictlySortedSinglyLinkedList62.containsIP(iP67);
    iP67.setFirst((java.lang.Integer)0);
    java.lang.Integer i71 = iP67.getSecond();
    iPBan60.setIp(iP67);
    boolean b73 = server24.connect(iP67);
    tp2.SinglyLinkedList singlyLinkedList74 = new tp2.SinglyLinkedList();
    int i75 = singlyLinkedList74.getSize();
    tp2.IP iP76 = null;
    singlyLinkedList74.add(iP76);
    tp2.IP iP82 = new tp2.IP((java.lang.Integer)10, (java.lang.Integer)10, (java.lang.Integer)1, (java.lang.Integer)10);
    singlyLinkedList74.add(iP82);
    tp2.SinglyLinkedList singlyLinkedList84 = new tp2.SinglyLinkedList();
    int i85 = singlyLinkedList84.getSize();
    tp2.IP iP86 = null;
    singlyLinkedList84.add(iP86);
    tp2.IP iP92 = new tp2.IP((java.lang.Integer)10, (java.lang.Integer)10, (java.lang.Integer)1, (java.lang.Integer)10);
    singlyLinkedList84.add(iP92);
    singlyLinkedList74.add(iP92);
    boolean b95 = server24.connect(iP92);
    boolean b96 = strictlySortedSinglyLinkedList0.removeFromIP(iP92);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i39 + "' != '" + 167772288+ "'", i39.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b49 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i52 + "' != '" + 10+ "'", i52.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i53 + "' != '" + (-2147483638)+ "'", i53.equals((-2147483638)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b56 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b61 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b68 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i71 + "' != '" + 100+ "'", i71.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b73 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i75 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i85 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b95 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b96 == false);

  }

  @Test
  public void test294() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test294"); }


    java.lang.String str2 = java.lang.Integer.toUnsignedString((-1121320960), 6291456);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "3173646336"+ "'", str2.equals("3173646336"));

  }

  @Test
  public void test295() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test295"); }


    int i2 = java.lang.Integer.rotateLeft(10942, 1073745921);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 21884);

  }

  @Test
  public void test296() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test296"); }


    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList0 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP1 = null;
    tp2.IPBan iPBan3 = new tp2.IPBan(iP1, (java.lang.Long)0L);
    boolean b4 = strictlySortedSinglyLinkedList0.contains(iPBan3);
    tp2.IP iP9 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    java.lang.Integer i10 = iP9.getFourth();
    boolean b11 = strictlySortedSinglyLinkedList0.removeFromIP(iP9);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList12 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP17 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b18 = strictlySortedSinglyLinkedList12.containsIP(iP17);
    tp2.IP iP23 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList24 = new tp2.SinglyLinkedList();
    boolean b25 = iP23.equals((java.lang.Object)singlyLinkedList24);
    java.lang.Integer i26 = iP23.getThird();
    boolean b27 = strictlySortedSinglyLinkedList12.removeFromIP(iP23);
    boolean b29 = iP23.equals((java.lang.Object)0);
    java.lang.Integer i30 = iP23.getThird();
    java.lang.Integer i31 = iP23.getFirst();
    boolean b32 = strictlySortedSinglyLinkedList0.containsIP(iP23);
    tp2.IPBan iPBan34 = strictlySortedSinglyLinkedList0.get(67108864);
    int i35 = strictlySortedSinglyLinkedList0.getSize();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i10 + "' != '" + 10+ "'", i10.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i26 + "' != '" + 167772288+ "'", i26.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i30 + "' != '" + 167772288+ "'", i30.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i31 + "' != '" + (-2147483638)+ "'", i31.equals((-2147483638)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iPBan34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i35 == 0);

  }

  @Test
  public void test297() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test297"); }


    int i2 = java.lang.Integer.rotateRight(10, 64);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 10);

  }

  @Test
  public void test298() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test298"); }


    java.lang.String str1 = java.lang.Integer.toHexString(3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "3"+ "'", str1.equals("3"));

  }

  @Test
  public void test299() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test299"); }


    java.lang.String str2 = java.lang.Integer.toUnsignedString(67108864, 124);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "67108864"+ "'", str2.equals("67108864"));

  }

  @Test
  public void test300() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test300"); }


    tp2.Server server0 = new tp2.Server();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList1 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP6 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b7 = strictlySortedSinglyLinkedList1.containsIP(iP6);
    tp2.IP iP12 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList13 = new tp2.SinglyLinkedList();
    boolean b14 = iP12.equals((java.lang.Object)singlyLinkedList13);
    java.lang.Integer i15 = iP12.getThird();
    boolean b16 = strictlySortedSinglyLinkedList1.removeFromIP(iP12);
    boolean b17 = server0.removeException(iP12);
    server0.update();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList19 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP24 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b25 = strictlySortedSinglyLinkedList19.containsIP(iP24);
    iP24.setSecond((java.lang.Integer)(-2147483638));
    java.lang.Integer i28 = iP24.getFourth();
    java.lang.Integer i29 = iP24.getFirst();
    iP24.setFirst((java.lang.Integer)20971536);
    boolean b32 = server0.addException(iP24);
    tp2.SinglyLinkedList singlyLinkedList33 = new tp2.SinglyLinkedList();
    int i34 = singlyLinkedList33.getSize();
    tp2.IP iP35 = null;
    singlyLinkedList33.add(iP35);
    tp2.IP iP41 = new tp2.IP((java.lang.Integer)10, (java.lang.Integer)10, (java.lang.Integer)1, (java.lang.Integer)10);
    singlyLinkedList33.add(iP41);
    tp2.SinglyLinkedList singlyLinkedList43 = new tp2.SinglyLinkedList();
    int i44 = singlyLinkedList43.getSize();
    tp2.IP iP45 = null;
    singlyLinkedList43.add(iP45);
    tp2.IP iP51 = new tp2.IP((java.lang.Integer)10, (java.lang.Integer)10, (java.lang.Integer)1, (java.lang.Integer)10);
    singlyLinkedList43.add(iP51);
    singlyLinkedList33.add(iP51);
    boolean b54 = server0.removeBan(iP51);
    tp2.Server server55 = new tp2.Server();
    tp2.ITime iTime56 = null;
    server55.setTime(iTime56);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList58 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP63 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b64 = strictlySortedSinglyLinkedList58.containsIP(iP63);
    tp2.IP iP69 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList70 = new tp2.SinglyLinkedList();
    boolean b71 = iP69.equals((java.lang.Object)singlyLinkedList70);
    java.lang.Integer i72 = iP69.getThird();
    boolean b73 = strictlySortedSinglyLinkedList58.removeFromIP(iP69);
    boolean b75 = iP69.equals((java.lang.Object)0);
    boolean b76 = server55.addException(iP69);
    boolean b77 = server0.removeBan(iP69);
    iP69.setSecond((java.lang.Integer)34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i15 + "' != '" + 167772288+ "'", i15.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i28 + "' != '" + 10+ "'", i28.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i29 + "' != '" + (-2147483638)+ "'", i29.equals((-2147483638)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i34 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i44 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b54 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b64 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b71 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i72 + "' != '" + 167772288+ "'", i72.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b73 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b75 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b76 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b77 == false);

  }

  @Test
  public void test301() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test301"); }


    java.lang.String str1 = java.lang.Integer.toUnsignedString((-1674030564));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "2620936732"+ "'", str1.equals("2620936732"));

  }

  @Test
  public void test302() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test302"); }


    int i1 = java.lang.Integer.parseUnsignedInt("60000010");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 60000010);

  }

  @Test
  public void test303() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test303"); }


    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList0 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP5 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b6 = strictlySortedSinglyLinkedList0.containsIP(iP5);
    tp2.IP iP7 = null;
    tp2.IPBan iPBan9 = new tp2.IPBan(iP7, (java.lang.Long)(-1L));
    boolean b10 = strictlySortedSinglyLinkedList0.contains(iPBan9);
    tp2.Server server11 = new tp2.Server();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList12 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP17 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b18 = strictlySortedSinglyLinkedList12.containsIP(iP17);
    tp2.IP iP23 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList24 = new tp2.SinglyLinkedList();
    boolean b25 = iP23.equals((java.lang.Object)singlyLinkedList24);
    java.lang.Integer i26 = iP23.getThird();
    boolean b27 = strictlySortedSinglyLinkedList12.removeFromIP(iP23);
    boolean b28 = server11.removeException(iP23);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList29 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP34 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b35 = strictlySortedSinglyLinkedList29.containsIP(iP34);
    tp2.IPBan iPBan37 = strictlySortedSinglyLinkedList29.get((-1));
    tp2.IP iP42 = new tp2.IP((java.lang.Integer)10, (java.lang.Integer)10, (java.lang.Integer)1, (java.lang.Integer)10);
    tp2.IPBan iPBan44 = new tp2.IPBan(iP42, (java.lang.Long)100L);
    boolean b45 = strictlySortedSinglyLinkedList29.removeFromIP(iP42);
    boolean b46 = server11.removeBan(iP42);
    java.lang.Integer i47 = iP42.getFirst();
    iPBan9.setIp(iP42);
    java.lang.Integer i49 = iP42.getSecond();
    iP42.setFourth((java.lang.Integer)18875478);
    java.lang.Integer i52 = iP42.getFirst();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList53 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP58 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b59 = strictlySortedSinglyLinkedList53.containsIP(iP58);
    tp2.IP iP64 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList65 = new tp2.SinglyLinkedList();
    boolean b66 = iP64.equals((java.lang.Object)singlyLinkedList65);
    java.lang.Integer i67 = iP64.getThird();
    boolean b68 = strictlySortedSinglyLinkedList53.removeFromIP(iP64);
    tp2.IP iP69 = null;
    tp2.IPBan iPBan71 = new tp2.IPBan(iP69, (java.lang.Long)(-1L));
    boolean b72 = strictlySortedSinglyLinkedList53.contains(iPBan71);
    java.lang.Long long73 = iPBan71.getExpires();
    java.lang.Long long74 = iPBan71.getExpires();
    boolean b75 = iP42.equals((java.lang.Object)long74);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i26 + "' != '" + 167772288+ "'", i26.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iPBan37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b46 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i47 + "' != '" + 10+ "'", i47.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i49 + "' != '" + 10+ "'", i49.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i52 + "' != '" + 10+ "'", i52.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b59 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b66 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i67 + "' != '" + 167772288+ "'", i67.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b68 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b72 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long73 + "' != '" + 0L+ "'", long73.equals(0L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long74 + "' != '" + 0L+ "'", long74.equals(0L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b75 == false);

  }

  @Test
  public void test304() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test304"); }


    int i1 = java.lang.Integer.lowestOneBit(4194304);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 4194304);

  }

  @Test
  public void test305() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test305"); }


    int i1 = java.lang.Integer.numberOfLeadingZeros(20971536);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 7);

  }

  @Test
  public void test306() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test306"); }


    int i1 = java.lang.Integer.bitCount(512);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 1);

  }

  @Test
  public void test307() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test307"); }


    int i1 = java.lang.Integer.numberOfLeadingZeros(2098192);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 10);

  }

  @Test
  public void test308() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test308"); }


    // The following exception was thrown during execution in test generation
    try {
      java.lang.Integer i1 = new java.lang.Integer("d");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test309() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test309"); }


    java.lang.String str1 = java.lang.Integer.toHexString(953355);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "e8c0b"+ "'", str1.equals("e8c0b"));

  }

  @Test
  public void test310() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test310"); }


    // The following exception was thrown during execution in test generation
    try {
      java.lang.Integer i1 = new java.lang.Integer("10000000000000000000");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test311() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test311"); }


    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList0 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP5 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b6 = strictlySortedSinglyLinkedList0.containsIP(iP5);
    tp2.IP iP11 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList12 = new tp2.SinglyLinkedList();
    boolean b13 = iP11.equals((java.lang.Object)singlyLinkedList12);
    java.lang.Integer i14 = iP11.getThird();
    boolean b15 = strictlySortedSinglyLinkedList0.removeFromIP(iP11);
    tp2.IP iP16 = null;
    tp2.IPBan iPBan18 = new tp2.IPBan(iP16, (java.lang.Long)(-1L));
    boolean b19 = strictlySortedSinglyLinkedList0.contains(iPBan18);
    boolean b20 = strictlySortedSinglyLinkedList0.isEmpty();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList21 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP22 = null;
    tp2.IPBan iPBan24 = new tp2.IPBan(iP22, (java.lang.Long)0L);
    boolean b25 = strictlySortedSinglyLinkedList21.contains(iPBan24);
    boolean b26 = strictlySortedSinglyLinkedList0.add(iPBan24);
    tp2.IP iP31 = new tp2.IP((java.lang.Integer)10, (java.lang.Integer)10, (java.lang.Integer)1, (java.lang.Integer)10);
    tp2.IPBan iPBan33 = new tp2.IPBan(iP31, (java.lang.Long)100L);
    java.lang.Integer i34 = iP31.getFirst();
    boolean b35 = strictlySortedSinglyLinkedList0.containsIP(iP31);
    int i36 = strictlySortedSinglyLinkedList0.getSize();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i14 + "' != '" + 167772288+ "'", i14.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i34 + "' != '" + 10+ "'", i34.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 1);

  }

  @Test
  public void test312() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test312"); }


    int i2 = java.lang.Integer.max(1073741824, (-1121320960));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1073741824);

  }

  @Test
  public void test313() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test313"); }


    // The following exception was thrown during execution in test generation
    try {
      int i2 = java.lang.Integer.parseInt("268451841", 1952471040);
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

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test314"); }


    int i1 = java.lang.Integer.reverse(28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 939524096);

  }

  @Test
  public void test315() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test315"); }


    tp2.Server server0 = new tp2.Server();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList1 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP6 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b7 = strictlySortedSinglyLinkedList1.containsIP(iP6);
    tp2.IP iP12 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList13 = new tp2.SinglyLinkedList();
    boolean b14 = iP12.equals((java.lang.Object)singlyLinkedList13);
    java.lang.Integer i15 = iP12.getThird();
    boolean b16 = strictlySortedSinglyLinkedList1.removeFromIP(iP12);
    boolean b17 = server0.removeException(iP12);
    server0.update();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList19 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP24 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b25 = strictlySortedSinglyLinkedList19.containsIP(iP24);
    iP24.setSecond((java.lang.Integer)(-2147483638));
    java.lang.Integer i28 = iP24.getFourth();
    java.lang.Integer i29 = iP24.getFirst();
    iP24.setFirst((java.lang.Integer)20971536);
    boolean b32 = server0.addException(iP24);
    tp2.IPBan iPBan34 = new tp2.IPBan(iP24, (java.lang.Long)0L);
    iPBan34.setExpires((java.lang.Long)7L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i15 + "' != '" + 167772288+ "'", i15.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i28 + "' != '" + 10+ "'", i28.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i29 + "' != '" + (-2147483638)+ "'", i29.equals((-2147483638)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == true);

  }

  @Test
  public void test316() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test316"); }


    long long1 = java.lang.Integer.toUnsignedLong(2147483647);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == 2147483647L);

  }

  @Test
  public void test317() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test317"); }


    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList0 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP5 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b6 = strictlySortedSinglyLinkedList0.containsIP(iP5);
    tp2.IP iP11 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList12 = new tp2.SinglyLinkedList();
    boolean b13 = iP11.equals((java.lang.Object)singlyLinkedList12);
    java.lang.Integer i14 = iP11.getThird();
    boolean b15 = strictlySortedSinglyLinkedList0.removeFromIP(iP11);
    tp2.IP iP16 = null;
    tp2.IPBan iPBan18 = new tp2.IPBan(iP16, (java.lang.Long)(-1L));
    boolean b19 = strictlySortedSinglyLinkedList0.contains(iPBan18);
    tp2.Server server20 = new tp2.Server();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList21 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP26 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b27 = strictlySortedSinglyLinkedList21.containsIP(iP26);
    tp2.IP iP32 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList33 = new tp2.SinglyLinkedList();
    boolean b34 = iP32.equals((java.lang.Object)singlyLinkedList33);
    java.lang.Integer i35 = iP32.getThird();
    boolean b36 = strictlySortedSinglyLinkedList21.removeFromIP(iP32);
    boolean b37 = server20.removeException(iP32);
    server20.update();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList39 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP44 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b45 = strictlySortedSinglyLinkedList39.containsIP(iP44);
    tp2.IP iP50 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList51 = new tp2.SinglyLinkedList();
    boolean b52 = iP50.equals((java.lang.Object)singlyLinkedList51);
    java.lang.Integer i53 = iP50.getThird();
    boolean b54 = strictlySortedSinglyLinkedList39.removeFromIP(iP50);
    boolean b56 = iP50.equals((java.lang.Object)0);
    java.lang.Integer i57 = iP50.getThird();
    java.lang.Integer i58 = iP50.getFirst();
    iP50.setFourth((java.lang.Integer)20971536);
    tp2.Server server61 = new tp2.Server();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList62 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP67 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b68 = strictlySortedSinglyLinkedList62.containsIP(iP67);
    java.lang.Integer i69 = iP67.getFourth();
    boolean b70 = server61.addException(iP67);
    boolean b71 = iP50.equals((java.lang.Object)iP67);
    boolean b72 = server20.connect(iP67);
    boolean b73 = strictlySortedSinglyLinkedList0.containsIP(iP67);
    iP67.setFirst((java.lang.Integer)(-2126512112));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i14 + "' != '" + 167772288+ "'", i14.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i35 + "' != '" + 167772288+ "'", i35.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b52 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i53 + "' != '" + 167772288+ "'", i53.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b54 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b56 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i57 + "' != '" + 167772288+ "'", i57.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i58 + "' != '" + (-2147483638)+ "'", i58.equals((-2147483638)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b68 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i69 + "' != '" + 10+ "'", i69.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b70 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b71 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b72 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b73 == false);

  }

  @Test
  public void test318() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test318"); }


    tp2.SinglyLinkedList singlyLinkedList0 = new tp2.SinglyLinkedList();
    int i1 = singlyLinkedList0.getSize();
    tp2.IP iP3 = singlyLinkedList0.get(10);
    tp2.IP iP8 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    singlyLinkedList0.add(iP8);
    iP8.setFirst((java.lang.Integer)17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP3);

  }

  @Test
  public void test319() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test319"); }


    java.lang.String str2 = java.lang.Integer.toUnsignedString(1, 1705518);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1"+ "'", str2.equals("1"));

  }

  @Test
  public void test320() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test320"); }


    tp2.SinglyLinkedList singlyLinkedList0 = new tp2.SinglyLinkedList();
    int i1 = singlyLinkedList0.getSize();
    tp2.IP iP3 = singlyLinkedList0.get(10);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList4 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP9 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b10 = strictlySortedSinglyLinkedList4.containsIP(iP9);
    iP9.setFirst((java.lang.Integer)0);
    boolean b13 = singlyLinkedList0.remove(iP9);
    int i14 = singlyLinkedList0.getSize();
    tp2.Server server15 = new tp2.Server();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList16 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP21 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b22 = strictlySortedSinglyLinkedList16.containsIP(iP21);
    tp2.IP iP27 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList28 = new tp2.SinglyLinkedList();
    boolean b29 = iP27.equals((java.lang.Object)singlyLinkedList28);
    java.lang.Integer i30 = iP27.getThird();
    boolean b31 = strictlySortedSinglyLinkedList16.removeFromIP(iP27);
    boolean b32 = server15.removeException(iP27);
    server15.update();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList34 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP39 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b40 = strictlySortedSinglyLinkedList34.containsIP(iP39);
    iP39.setSecond((java.lang.Integer)(-2147483638));
    java.lang.Integer i43 = iP39.getFourth();
    java.lang.Integer i44 = iP39.getFirst();
    iP39.setFirst((java.lang.Integer)20971536);
    boolean b47 = server15.addException(iP39);
    tp2.SinglyLinkedList singlyLinkedList48 = new tp2.SinglyLinkedList();
    int i49 = singlyLinkedList48.getSize();
    tp2.IP iP50 = null;
    singlyLinkedList48.add(iP50);
    tp2.IP iP56 = new tp2.IP((java.lang.Integer)10, (java.lang.Integer)10, (java.lang.Integer)1, (java.lang.Integer)10);
    singlyLinkedList48.add(iP56);
    tp2.SinglyLinkedList singlyLinkedList58 = new tp2.SinglyLinkedList();
    int i59 = singlyLinkedList58.getSize();
    tp2.IP iP60 = null;
    singlyLinkedList58.add(iP60);
    tp2.IP iP66 = new tp2.IP((java.lang.Integer)10, (java.lang.Integer)10, (java.lang.Integer)1, (java.lang.Integer)10);
    singlyLinkedList58.add(iP66);
    singlyLinkedList48.add(iP66);
    boolean b69 = server15.removeBan(iP66);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList70 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP75 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b76 = strictlySortedSinglyLinkedList70.containsIP(iP75);
    tp2.IPBan iPBan78 = strictlySortedSinglyLinkedList70.get((-1));
    tp2.IP iP83 = new tp2.IP((java.lang.Integer)10, (java.lang.Integer)10, (java.lang.Integer)1, (java.lang.Integer)10);
    tp2.IPBan iPBan85 = new tp2.IPBan(iP83, (java.lang.Long)100L);
    boolean b86 = strictlySortedSinglyLinkedList70.removeFromIP(iP83);
    tp2.IP iP91 = new tp2.IP((java.lang.Integer)10, (java.lang.Integer)10, (java.lang.Integer)1, (java.lang.Integer)10);
    tp2.IPBan iPBan93 = new tp2.IPBan(iP91, (java.lang.Long)100L);
    boolean b94 = strictlySortedSinglyLinkedList70.removeFromIP(iP91);
    boolean b95 = server15.addBan(iP91);
    boolean b96 = singlyLinkedList0.remove(iP91);
    java.lang.Integer i97 = iP91.getThird();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i30 + "' != '" + 167772288+ "'", i30.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i43 + "' != '" + 10+ "'", i43.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i44 + "' != '" + (-2147483638)+ "'", i44.equals((-2147483638)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b47 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i49 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i59 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b69 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b76 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iPBan78);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b86 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b94 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b95 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b96 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i97 + "' != '" + 1+ "'", i97.equals(1));

  }

  @Test
  public void test321() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test321"); }


    tp2.SinglyLinkedList singlyLinkedList0 = new tp2.SinglyLinkedList();
    int i1 = singlyLinkedList0.getSize();
    tp2.IP iP3 = singlyLinkedList0.get(10);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList4 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP9 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b10 = strictlySortedSinglyLinkedList4.containsIP(iP9);
    iP9.setFirst((java.lang.Integer)0);
    boolean b13 = singlyLinkedList0.remove(iP9);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList14 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP19 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b20 = strictlySortedSinglyLinkedList14.containsIP(iP19);
    tp2.IPBan iPBan22 = strictlySortedSinglyLinkedList14.get((-1));
    tp2.IP iP27 = new tp2.IP((java.lang.Integer)10, (java.lang.Integer)10, (java.lang.Integer)1, (java.lang.Integer)10);
    tp2.IPBan iPBan29 = new tp2.IPBan(iP27, (java.lang.Long)100L);
    boolean b30 = strictlySortedSinglyLinkedList14.removeFromIP(iP27);
    tp2.IP iP35 = new tp2.IP((java.lang.Integer)10, (java.lang.Integer)10, (java.lang.Integer)1, (java.lang.Integer)10);
    tp2.IPBan iPBan37 = new tp2.IPBan(iP35, (java.lang.Long)100L);
    boolean b38 = strictlySortedSinglyLinkedList14.removeFromIP(iP35);
    singlyLinkedList0.add(iP35);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList40 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP45 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b46 = strictlySortedSinglyLinkedList40.containsIP(iP45);
    tp2.IP iP51 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList52 = new tp2.SinglyLinkedList();
    boolean b53 = iP51.equals((java.lang.Object)singlyLinkedList52);
    java.lang.Integer i54 = iP51.getThird();
    boolean b55 = strictlySortedSinglyLinkedList40.removeFromIP(iP51);
    java.lang.Integer i56 = iP51.getThird();
    iP51.setFirst((java.lang.Integer)(-1979711360));
    iP51.setFirst((java.lang.Integer)(-2147483648));
    singlyLinkedList0.add(iP51);
    tp2.IP iP66 = new tp2.IP((java.lang.Integer)1, (java.lang.Integer)3, (java.lang.Integer)1000, (java.lang.Integer)1074266112);
    singlyLinkedList0.add(iP66);
    boolean b68 = singlyLinkedList0.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iPBan22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b46 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b53 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i54 + "' != '" + 167772288+ "'", i54.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b55 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i56 + "' != '" + 167772288+ "'", i56.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b68 == false);

  }

  @Test
  public void test322() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test322"); }


    int i2 = java.lang.Integer.sum(262144, 1107296261);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1107558405);

  }

  @Test
  public void test323() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test323"); }


    // The following exception was thrown during execution in test generation
    try {
      int i2 = java.lang.Integer.parseUnsignedInt("20000000000", 41943072);
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test324() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test324"); }


    tp2.Server server0 = new tp2.Server();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList1 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP6 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b7 = strictlySortedSinglyLinkedList1.containsIP(iP6);
    tp2.IP iP12 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList13 = new tp2.SinglyLinkedList();
    boolean b14 = iP12.equals((java.lang.Object)singlyLinkedList13);
    java.lang.Integer i15 = iP12.getThird();
    boolean b16 = strictlySortedSinglyLinkedList1.removeFromIP(iP12);
    boolean b17 = server0.removeException(iP12);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList18 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP23 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b24 = strictlySortedSinglyLinkedList18.containsIP(iP23);
    tp2.IPBan iPBan26 = strictlySortedSinglyLinkedList18.get((-1));
    tp2.IP iP31 = new tp2.IP((java.lang.Integer)10, (java.lang.Integer)10, (java.lang.Integer)1, (java.lang.Integer)10);
    tp2.IPBan iPBan33 = new tp2.IPBan(iP31, (java.lang.Long)100L);
    boolean b34 = strictlySortedSinglyLinkedList18.removeFromIP(iP31);
    boolean b35 = server0.removeBan(iP31);
    tp2.IPBan iPBan37 = new tp2.IPBan(iP31, (java.lang.Long)83886146L);
    java.lang.Integer i38 = iP31.getThird();
    java.lang.Integer i39 = iP31.getSecond();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i15 + "' != '" + 167772288+ "'", i15.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iPBan26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i38 + "' != '" + 1+ "'", i38.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i39 + "' != '" + 10+ "'", i39.equals(10));

  }

  @Test
  public void test325() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test325"); }


    java.lang.Integer i1 = java.lang.Integer.valueOf(953355);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 953355+ "'", i1.equals(953355));

  }

  @Test
  public void test326() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test326"); }


    java.lang.Integer i1 = java.lang.Integer.getInteger("400000000");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);

  }

  @Test
  public void test327() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test327"); }


    java.lang.String str1 = java.lang.Integer.toUnsignedString(3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "3"+ "'", str1.equals("3"));

  }

  @Test
  public void test328() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test328"); }


    // The following exception was thrown during execution in test generation
    try {
      java.lang.Integer i1 = java.lang.Integer.decode("3e8");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test329() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test329"); }


    tp2.Server server0 = new tp2.Server();
    tp2.ITime iTime1 = null;
    server0.setTime(iTime1);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList3 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP8 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b9 = strictlySortedSinglyLinkedList3.containsIP(iP8);
    tp2.IP iP14 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList15 = new tp2.SinglyLinkedList();
    boolean b16 = iP14.equals((java.lang.Object)singlyLinkedList15);
    java.lang.Integer i17 = iP14.getThird();
    boolean b18 = strictlySortedSinglyLinkedList3.removeFromIP(iP14);
    boolean b20 = iP14.equals((java.lang.Object)0);
    boolean b21 = server0.addException(iP14);
    tp2.ITime iTime22 = null;
    server0.setTime(iTime22);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList24 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP29 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b30 = strictlySortedSinglyLinkedList24.containsIP(iP29);
    tp2.IP iP35 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList36 = new tp2.SinglyLinkedList();
    boolean b37 = iP35.equals((java.lang.Object)singlyLinkedList36);
    java.lang.Integer i38 = iP35.getThird();
    boolean b39 = strictlySortedSinglyLinkedList24.removeFromIP(iP35);
    boolean b41 = iP35.equals((java.lang.Object)0);
    java.lang.Integer i42 = iP35.getThird();
    tp2.SinglyLinkedList singlyLinkedList43 = new tp2.SinglyLinkedList();
    int i44 = singlyLinkedList43.getSize();
    tp2.IP iP45 = null;
    singlyLinkedList43.add(iP45);
    tp2.IP iP51 = new tp2.IP((java.lang.Integer)10, (java.lang.Integer)10, (java.lang.Integer)1, (java.lang.Integer)10);
    singlyLinkedList43.add(iP51);
    tp2.SinglyLinkedList singlyLinkedList53 = new tp2.SinglyLinkedList();
    int i54 = singlyLinkedList53.getSize();
    tp2.IP iP55 = null;
    singlyLinkedList53.add(iP55);
    tp2.IP iP61 = new tp2.IP((java.lang.Integer)10, (java.lang.Integer)10, (java.lang.Integer)1, (java.lang.Integer)10);
    singlyLinkedList53.add(iP61);
    singlyLinkedList43.add(iP61);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList64 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP69 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b70 = strictlySortedSinglyLinkedList64.containsIP(iP69);
    iP69.setFirst((java.lang.Integer)0);
    java.lang.Integer i73 = iP69.getSecond();
    singlyLinkedList43.add(iP69);
    java.lang.Integer i75 = iP69.getSecond();
    boolean b76 = iP35.equals((java.lang.Object)i75);
    boolean b77 = server0.removeBan(iP35);
    boolean b78 = server0.bansOkTime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i17 + "' != '" + 167772288+ "'", i17.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i38 + "' != '" + 167772288+ "'", i38.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i42 + "' != '" + 167772288+ "'", i42.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i44 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i54 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b70 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i73 + "' != '" + 100+ "'", i73.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i75 + "' != '" + 100+ "'", i75.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b76 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b77 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b78 == true);

  }

  @Test
  public void test330() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test330"); }


    int i1 = java.lang.Integer.signum(31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 1);

  }

  @Test
  public void test331() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test331"); }


    int i2 = java.lang.Integer.min(34, 37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 34);

  }

  @Test
  public void test332() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test332"); }


    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList0 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b1 = strictlySortedSinglyLinkedList0.isEmpty();
    int i2 = strictlySortedSinglyLinkedList0.getSize();
    tp2.Server server3 = new tp2.Server();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList4 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP9 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b10 = strictlySortedSinglyLinkedList4.containsIP(iP9);
    tp2.IP iP15 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList16 = new tp2.SinglyLinkedList();
    boolean b17 = iP15.equals((java.lang.Object)singlyLinkedList16);
    java.lang.Integer i18 = iP15.getThird();
    boolean b19 = strictlySortedSinglyLinkedList4.removeFromIP(iP15);
    boolean b20 = server3.removeException(iP15);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList21 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP26 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b27 = strictlySortedSinglyLinkedList21.containsIP(iP26);
    tp2.IPBan iPBan29 = strictlySortedSinglyLinkedList21.get((-1));
    tp2.IP iP34 = new tp2.IP((java.lang.Integer)10, (java.lang.Integer)10, (java.lang.Integer)1, (java.lang.Integer)10);
    tp2.IPBan iPBan36 = new tp2.IPBan(iP34, (java.lang.Long)100L);
    boolean b37 = strictlySortedSinglyLinkedList21.removeFromIP(iP34);
    boolean b38 = server3.removeBan(iP34);
    boolean b39 = strictlySortedSinglyLinkedList0.containsIP(iP34);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList40 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b41 = strictlySortedSinglyLinkedList40.isEmpty();
    tp2.IP iP46 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b47 = strictlySortedSinglyLinkedList40.removeFromIP(iP46);
    tp2.IP iP52 = new tp2.IP((java.lang.Integer)10, (java.lang.Integer)10, (java.lang.Integer)1, (java.lang.Integer)10);
    tp2.IPBan iPBan54 = new tp2.IPBan(iP52, (java.lang.Long)100L);
    boolean b55 = strictlySortedSinglyLinkedList40.contains(iPBan54);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList56 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP61 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b62 = strictlySortedSinglyLinkedList56.containsIP(iP61);
    tp2.IP iP63 = null;
    tp2.IPBan iPBan65 = new tp2.IPBan(iP63, (java.lang.Long)(-1L));
    boolean b66 = strictlySortedSinglyLinkedList56.contains(iPBan65);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList67 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP72 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b73 = strictlySortedSinglyLinkedList67.containsIP(iP72);
    tp2.IPBan iPBan75 = strictlySortedSinglyLinkedList67.get((-1));
    boolean b76 = strictlySortedSinglyLinkedList67.isEmpty();
    tp2.IP iP77 = null;
    tp2.IPBan iPBan79 = new tp2.IPBan(iP77, (java.lang.Long)(-1L));
    boolean b80 = strictlySortedSinglyLinkedList67.contains(iPBan79);
    boolean b81 = strictlySortedSinglyLinkedList56.add(iPBan79);
    boolean b82 = strictlySortedSinglyLinkedList40.contains(iPBan79);
    tp2.IP iP87 = new tp2.IP((java.lang.Integer)1, (java.lang.Integer)3, (java.lang.Integer)1000, (java.lang.Integer)1074266112);
    boolean b88 = strictlySortedSinglyLinkedList40.containsIP(iP87);
    boolean b89 = strictlySortedSinglyLinkedList0.containsIP(iP87);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i18 + "' != '" + 167772288+ "'", i18.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iPBan29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b47 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b55 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b62 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b66 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b73 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iPBan75);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b76 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b80 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b81 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b82 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b88 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b89 == false);

  }

  @Test
  public void test333() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test333"); }


    java.lang.Integer i1 = new java.lang.Integer(5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 5+ "'", i1.equals(5));

  }

  @Test
  public void test334() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test334"); }


    int i1 = java.lang.Integer.lowestOneBit(6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 2);

  }

  @Test
  public void test335() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test335"); }


    tp2.SinglyLinkedList singlyLinkedList0 = new tp2.SinglyLinkedList();
    int i1 = singlyLinkedList0.getSize();
    tp2.IP iP3 = singlyLinkedList0.get(10);
    tp2.SinglyLinkedList singlyLinkedList4 = new tp2.SinglyLinkedList();
    int i5 = singlyLinkedList4.getSize();
    tp2.IP iP7 = singlyLinkedList4.get(10);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList8 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP13 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b14 = strictlySortedSinglyLinkedList8.containsIP(iP13);
    iP13.setFirst((java.lang.Integer)0);
    boolean b17 = singlyLinkedList4.remove(iP13);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList18 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP23 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b24 = strictlySortedSinglyLinkedList18.containsIP(iP23);
    tp2.IPBan iPBan26 = strictlySortedSinglyLinkedList18.get((-1));
    tp2.IP iP31 = new tp2.IP((java.lang.Integer)10, (java.lang.Integer)10, (java.lang.Integer)1, (java.lang.Integer)10);
    tp2.IPBan iPBan33 = new tp2.IPBan(iP31, (java.lang.Long)100L);
    boolean b34 = strictlySortedSinglyLinkedList18.removeFromIP(iP31);
    tp2.IP iP39 = new tp2.IP((java.lang.Integer)10, (java.lang.Integer)10, (java.lang.Integer)1, (java.lang.Integer)10);
    tp2.IPBan iPBan41 = new tp2.IPBan(iP39, (java.lang.Long)100L);
    boolean b42 = strictlySortedSinglyLinkedList18.removeFromIP(iP39);
    singlyLinkedList4.add(iP39);
    singlyLinkedList0.add(iP39);
    boolean b45 = singlyLinkedList0.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iPBan26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == false);

  }

  @Test
  public void test336() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test336"); }


    java.lang.Integer i1 = java.lang.Integer.valueOf(81400010);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 81400010+ "'", i1.equals(81400010));

  }

  @Test
  public void test337() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test337"); }


    // The following exception was thrown during execution in test generation
    try {
      java.lang.Integer i2 = java.lang.Integer.valueOf("72", (-1979711360));
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test338() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test338"); }


    int i2 = java.lang.Integer.divideUnsigned(37, 1107558405);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);

  }

  @Test
  public void test339() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test339"); }


    tp2.Server server0 = new tp2.Server();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList1 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP6 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b7 = strictlySortedSinglyLinkedList1.containsIP(iP6);
    tp2.IP iP12 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList13 = new tp2.SinglyLinkedList();
    boolean b14 = iP12.equals((java.lang.Object)singlyLinkedList13);
    java.lang.Integer i15 = iP12.getThird();
    boolean b16 = strictlySortedSinglyLinkedList1.removeFromIP(iP12);
    boolean b17 = server0.removeException(iP12);
    server0.update();
    tp2.ITime iTime19 = null;
    server0.setTime(iTime19);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList21 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP26 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b27 = strictlySortedSinglyLinkedList21.containsIP(iP26);
    tp2.IPBan iPBan29 = strictlySortedSinglyLinkedList21.get((-1));
    tp2.IP iP34 = new tp2.IP((java.lang.Integer)10, (java.lang.Integer)10, (java.lang.Integer)1, (java.lang.Integer)10);
    tp2.IPBan iPBan36 = new tp2.IPBan(iP34, (java.lang.Long)100L);
    boolean b37 = strictlySortedSinglyLinkedList21.removeFromIP(iP34);
    tp2.IP iP42 = new tp2.IP((java.lang.Integer)10, (java.lang.Integer)10, (java.lang.Integer)1, (java.lang.Integer)10);
    tp2.IPBan iPBan44 = new tp2.IPBan(iP42, (java.lang.Long)100L);
    boolean b45 = strictlySortedSinglyLinkedList21.removeFromIP(iP42);
    boolean b46 = server0.addException(iP42);
    server0.update();
    boolean b48 = server0.notSharedElements();
    tp2.Server server49 = new tp2.Server();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList50 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP55 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b56 = strictlySortedSinglyLinkedList50.containsIP(iP55);
    tp2.IP iP61 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList62 = new tp2.SinglyLinkedList();
    boolean b63 = iP61.equals((java.lang.Object)singlyLinkedList62);
    java.lang.Integer i64 = iP61.getThird();
    boolean b65 = strictlySortedSinglyLinkedList50.removeFromIP(iP61);
    boolean b66 = server49.removeException(iP61);
    server49.update();
    tp2.ITime iTime68 = null;
    server49.setTime(iTime68);
    tp2.IP iP74 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList75 = new tp2.SinglyLinkedList();
    boolean b76 = iP74.equals((java.lang.Object)singlyLinkedList75);
    iP74.setSecond((java.lang.Integer)2);
    boolean b79 = server49.removeBan(iP74);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList80 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b81 = strictlySortedSinglyLinkedList80.isEmpty();
    tp2.IP iP86 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b87 = strictlySortedSinglyLinkedList80.removeFromIP(iP86);
    iP86.setThird((java.lang.Integer)41943073);
    boolean b90 = server49.removeException(iP86);
    java.lang.Integer i91 = iP86.getSecond();
    iP86.setThird((java.lang.Integer)28);
    boolean b94 = server0.removeException(iP86);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i15 + "' != '" + 167772288+ "'", i15.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iPBan29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b46 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b48 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b56 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b63 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i64 + "' != '" + 167772288+ "'", i64.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b65 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b66 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b76 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b79 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b81 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b87 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b90 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i91 + "' != '" + 100+ "'", i91.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b94 == false);

  }

  @Test
  public void test340() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test340"); }


    int i2 = java.lang.Integer.compare(15, (-2147483638));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);

  }

  @Test
  public void test341() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test341"); }


    int i1 = java.lang.Integer.highestOneBit(131072);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 131072);

  }

  @Test
  public void test342() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test342"); }


    long long1 = java.lang.Integer.toUnsignedLong(301989888);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == 301989888L);

  }

  @Test
  public void test343() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test343"); }


    int i2 = java.lang.Integer.max(67112960, 8388608);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 67112960);

  }

  @Test
  public void test344() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test344"); }


    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList0 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b1 = strictlySortedSinglyLinkedList0.isEmpty();
    int i2 = strictlySortedSinglyLinkedList0.getSize();
    tp2.Server server3 = new tp2.Server();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList4 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP9 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b10 = strictlySortedSinglyLinkedList4.containsIP(iP9);
    tp2.IP iP15 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList16 = new tp2.SinglyLinkedList();
    boolean b17 = iP15.equals((java.lang.Object)singlyLinkedList16);
    java.lang.Integer i18 = iP15.getThird();
    boolean b19 = strictlySortedSinglyLinkedList4.removeFromIP(iP15);
    boolean b20 = server3.removeException(iP15);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList21 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP26 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b27 = strictlySortedSinglyLinkedList21.containsIP(iP26);
    tp2.IPBan iPBan29 = strictlySortedSinglyLinkedList21.get((-1));
    tp2.IP iP34 = new tp2.IP((java.lang.Integer)10, (java.lang.Integer)10, (java.lang.Integer)1, (java.lang.Integer)10);
    tp2.IPBan iPBan36 = new tp2.IPBan(iP34, (java.lang.Long)100L);
    boolean b37 = strictlySortedSinglyLinkedList21.removeFromIP(iP34);
    boolean b38 = server3.removeBan(iP34);
    boolean b39 = strictlySortedSinglyLinkedList0.containsIP(iP34);
    java.lang.Integer i40 = iP34.getFirst();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i18 + "' != '" + 167772288+ "'", i18.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iPBan29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i40 + "' != '" + 10+ "'", i40.equals(10));

  }

  @Test
  public void test345() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test345"); }


    int i2 = java.lang.Integer.rotateRight(131072, 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 65536);

  }

  @Test
  public void test346() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test346"); }


    java.lang.String str1 = java.lang.Integer.toHexString(34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "22"+ "'", str1.equals("22"));

  }

  @Test
  public void test347() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test347"); }


    int i1 = java.lang.Integer.numberOfTrailingZeros(10004001);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);

  }

  @Test
  public void test348() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test348"); }


    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList0 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b1 = strictlySortedSinglyLinkedList0.isEmpty();
    tp2.IP iP6 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b7 = strictlySortedSinglyLinkedList0.removeFromIP(iP6);
    tp2.IP iP12 = new tp2.IP((java.lang.Integer)10, (java.lang.Integer)10, (java.lang.Integer)1, (java.lang.Integer)10);
    tp2.IPBan iPBan14 = new tp2.IPBan(iP12, (java.lang.Long)100L);
    boolean b15 = strictlySortedSinglyLinkedList0.contains(iPBan14);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList16 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP21 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b22 = strictlySortedSinglyLinkedList16.containsIP(iP21);
    tp2.IP iP23 = null;
    tp2.IPBan iPBan25 = new tp2.IPBan(iP23, (java.lang.Long)(-1L));
    boolean b26 = strictlySortedSinglyLinkedList16.contains(iPBan25);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList27 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP32 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b33 = strictlySortedSinglyLinkedList27.containsIP(iP32);
    tp2.IPBan iPBan35 = strictlySortedSinglyLinkedList27.get((-1));
    boolean b36 = strictlySortedSinglyLinkedList27.isEmpty();
    tp2.IP iP37 = null;
    tp2.IPBan iPBan39 = new tp2.IPBan(iP37, (java.lang.Long)(-1L));
    boolean b40 = strictlySortedSinglyLinkedList27.contains(iPBan39);
    boolean b41 = strictlySortedSinglyLinkedList16.add(iPBan39);
    boolean b42 = strictlySortedSinglyLinkedList0.contains(iPBan39);
    iPBan39.setExpires((java.lang.Long)2168455184L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iPBan35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == false);

  }

  @Test
  public void test349() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test349"); }


    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList0 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP5 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b6 = strictlySortedSinglyLinkedList0.containsIP(iP5);
    iP5.setFirst((java.lang.Integer)0);
    java.lang.Integer i9 = iP5.getSecond();
    iP5.setFourth((java.lang.Integer)83886146);
    java.lang.Integer i12 = iP5.getThird();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 100+ "'", i9.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i12 + "' != '" + 167772288+ "'", i12.equals(167772288));

  }

  @Test
  public void test350() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test350"); }


    int i2 = java.lang.Integer.compareUnsigned(2098176, 336488199);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == (-1));

  }

  @Test
  public void test351() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test351"); }


    java.lang.Integer i1 = java.lang.Integer.getInteger("a");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);

  }

  @Test
  public void test352() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test352"); }


    int i1 = java.lang.Integer.numberOfLeadingZeros(134217728);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 4);

  }

  @Test
  public void test353() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test353"); }


    java.lang.String str1 = java.lang.Integer.toHexString(1886470370);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "707140e2"+ "'", str1.equals("707140e2"));

  }

  @Test
  public void test354() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test354"); }


    long long1 = java.lang.Integer.toUnsignedLong(67108864);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == 67108864L);

  }

  @Test
  public void test355() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test355"); }


    tp2.SinglyLinkedList singlyLinkedList0 = new tp2.SinglyLinkedList();
    int i1 = singlyLinkedList0.getSize();
    tp2.IP iP3 = singlyLinkedList0.get(10);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList4 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP9 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b10 = strictlySortedSinglyLinkedList4.containsIP(iP9);
    iP9.setFirst((java.lang.Integer)0);
    boolean b13 = singlyLinkedList0.remove(iP9);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList14 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP15 = null;
    tp2.IPBan iPBan17 = new tp2.IPBan(iP15, (java.lang.Long)0L);
    boolean b18 = strictlySortedSinglyLinkedList14.contains(iPBan17);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList19 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP24 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b25 = strictlySortedSinglyLinkedList19.containsIP(iP24);
    iP24.setFirst((java.lang.Integer)0);
    java.lang.Integer i28 = iP24.getSecond();
    iPBan17.setIp(iP24);
    tp2.Server server30 = new tp2.Server();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList31 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP36 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b37 = strictlySortedSinglyLinkedList31.containsIP(iP36);
    tp2.IP iP42 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList43 = new tp2.SinglyLinkedList();
    boolean b44 = iP42.equals((java.lang.Object)singlyLinkedList43);
    java.lang.Integer i45 = iP42.getThird();
    boolean b46 = strictlySortedSinglyLinkedList31.removeFromIP(iP42);
    boolean b47 = server30.removeException(iP42);
    iPBan17.setIp(iP42);
    singlyLinkedList0.add(iP42);
    java.lang.Integer i50 = iP42.getFourth();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i28 + "' != '" + 100+ "'", i28.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i45 + "' != '" + 167772288+ "'", i45.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b46 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b47 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i50 + "' != '" + 10+ "'", i50.equals(10));

  }

  @Test
  public void test356() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test356"); }


    int i2 = java.lang.Integer.sum(41943073, 34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 41943107);

  }

  @Test
  public void test357() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test357"); }


    int i1 = java.lang.Integer.reverseBytes((-2147483625));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 385876096);

  }

  @Test
  public void test358() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test358"); }


    tp2.IP iP4 = new tp2.IP((java.lang.Integer)64, (java.lang.Integer)4, (java.lang.Integer)262144, (java.lang.Integer)167772288);
    iP4.setFourth((java.lang.Integer)10942);
    java.lang.Integer i7 = iP4.getThird();
    iP4.setFirst((java.lang.Integer)(-2126512112));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i7 + "' != '" + 262144+ "'", i7.equals(262144));

  }

  @Test
  public void test359() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test359"); }


    tp2.Server server0 = new tp2.Server();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList1 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP6 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b7 = strictlySortedSinglyLinkedList1.containsIP(iP6);
    java.lang.Integer i8 = iP6.getFourth();
    boolean b9 = server0.addException(iP6);
    tp2.ITime iTime10 = null;
    server0.setTime(iTime10);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList12 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP17 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b18 = strictlySortedSinglyLinkedList12.containsIP(iP17);
    boolean b19 = server0.removeException(iP17);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList20 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP25 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b26 = strictlySortedSinglyLinkedList20.containsIP(iP25);
    iP25.setFirst((java.lang.Integer)0);
    java.lang.Integer i29 = iP25.getSecond();
    iP25.setFourth((java.lang.Integer)83886146);
    boolean b32 = server0.removeException(iP25);
    boolean b33 = server0.notSharedElements();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i8 + "' != '" + 10+ "'", i8.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i29 + "' != '" + 100+ "'", i29.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == true);

  }

  @Test
  public void test360() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test360"); }


    java.lang.String str1 = java.lang.Integer.toUnsignedString(301989888);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "301989888"+ "'", str1.equals("301989888"));

  }

  @Test
  public void test361() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test361"); }


    int i2 = java.lang.Integer.divideUnsigned(1073745921, 24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 44739413);

  }

  @Test
  public void test362() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test362"); }


    tp2.IP iP4 = new tp2.IP((java.lang.Integer)10, (java.lang.Integer)83886146, (java.lang.Integer)2, (java.lang.Integer)4);
    iP4.setThird((java.lang.Integer)16384);

  }

  @Test
  public void test363() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test363"); }


    int i1 = java.lang.Integer.parseInt("268451841");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 268451841);

  }

  @Test
  public void test364() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test364"); }


    java.lang.String str1 = java.lang.Integer.toBinaryString(17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "10001"+ "'", str1.equals("10001"));

  }

  @Test
  public void test365() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test365"); }


    int i2 = java.lang.Integer.min(1886470370, 25275);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 25275);

  }

  @Test
  public void test366() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test366"); }


    int i1 = java.lang.Integer.bitCount(402653184);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 2);

  }

  @Test
  public void test367() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test367"); }


    tp2.IP iP4 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    java.lang.Integer i5 = iP4.getThird();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i5 + "' != '" + 167772288+ "'", i5.equals(167772288));

  }

  @Test
  public void test368() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test368"); }


    java.lang.String str1 = java.lang.Integer.toBinaryString(67109184);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "100000000000000000101000000"+ "'", str1.equals("100000000000000000101000000"));

  }

  @Test
  public void test369() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test369"); }


    tp2.Server server0 = new tp2.Server();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList1 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP6 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b7 = strictlySortedSinglyLinkedList1.containsIP(iP6);
    java.lang.Integer i8 = iP6.getFourth();
    boolean b9 = server0.addException(iP6);
    tp2.ITime iTime10 = null;
    server0.setTime(iTime10);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList12 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP17 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b18 = strictlySortedSinglyLinkedList12.containsIP(iP17);
    boolean b19 = server0.removeException(iP17);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList20 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP25 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b26 = strictlySortedSinglyLinkedList20.containsIP(iP25);
    iP25.setFirst((java.lang.Integer)0);
    java.lang.Integer i29 = iP25.getSecond();
    iP25.setFourth((java.lang.Integer)83886146);
    iP25.setFourth((java.lang.Integer)83886146);
    java.lang.Integer i34 = iP25.getFirst();
    boolean b35 = server0.removeBan(iP25);
    java.lang.Integer i36 = iP25.getFourth();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i8 + "' != '" + 10+ "'", i8.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i29 + "' != '" + 100+ "'", i29.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i34 + "' != '" + 0+ "'", i34.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i36 + "' != '" + 83886146+ "'", i36.equals(83886146));

  }

  @Test
  public void test370() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test370"); }


    int i1 = java.lang.Integer.numberOfLeadingZeros(64);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 25);

  }

  @Test
  public void test371() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test371"); }


    int i2 = java.lang.Integer.compareUnsigned(18, 1073746921);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == (-1));

  }

  @Test
  public void test372() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test372"); }


    // The following exception was thrown during execution in test generation
    try {
      java.lang.Integer i1 = java.lang.Integer.decode("10101010111101");
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


    int i1 = java.lang.Integer.numberOfTrailingZeros(25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);

  }

  @Test
  public void test374() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test374"); }


    java.lang.Integer i1 = java.lang.Integer.getInteger("10002000000");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);

  }

  @Test
  public void test375() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test375"); }


    // The following exception was thrown during execution in test generation
    try {
      java.lang.Integer i1 = new java.lang.Integer("1000000000000000001010000001");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test376() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test376"); }


    int i2 = java.lang.Integer.min(805306369, 20971536);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 20971536);

  }

  @Test
  public void test377() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test377"); }


    int i1 = java.lang.Integer.lowestOneBit(32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 32);

  }

  @Test
  public void test378() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test378"); }


    // The following exception was thrown during execution in test generation
    try {
      java.lang.Integer i1 = java.lang.Integer.valueOf("2620936732");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test379() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test379"); }


    // The following exception was thrown during execution in test generation
    try {
      java.lang.Integer i2 = java.lang.Integer.valueOf("0", 167772288);
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

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test380"); }


    tp2.SinglyLinkedList singlyLinkedList0 = new tp2.SinglyLinkedList();
    boolean b1 = singlyLinkedList0.isEmpty();
    tp2.IP iP3 = singlyLinkedList0.get(0);
    int i4 = singlyLinkedList0.getSize();
    tp2.Server server5 = new tp2.Server();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList6 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP11 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b12 = strictlySortedSinglyLinkedList6.containsIP(iP11);
    tp2.IP iP17 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList18 = new tp2.SinglyLinkedList();
    boolean b19 = iP17.equals((java.lang.Object)singlyLinkedList18);
    java.lang.Integer i20 = iP17.getThird();
    boolean b21 = strictlySortedSinglyLinkedList6.removeFromIP(iP17);
    boolean b22 = server5.removeException(iP17);
    server5.update();
    tp2.ITime iTime24 = null;
    server5.setTime(iTime24);
    tp2.Server server26 = new tp2.Server();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList27 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP32 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b33 = strictlySortedSinglyLinkedList27.containsIP(iP32);
    tp2.IP iP38 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList39 = new tp2.SinglyLinkedList();
    boolean b40 = iP38.equals((java.lang.Object)singlyLinkedList39);
    java.lang.Integer i41 = iP38.getThird();
    boolean b42 = strictlySortedSinglyLinkedList27.removeFromIP(iP38);
    boolean b43 = server26.removeException(iP38);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList44 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP49 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b50 = strictlySortedSinglyLinkedList44.containsIP(iP49);
    tp2.IPBan iPBan52 = strictlySortedSinglyLinkedList44.get((-1));
    tp2.IP iP57 = new tp2.IP((java.lang.Integer)10, (java.lang.Integer)10, (java.lang.Integer)1, (java.lang.Integer)10);
    tp2.IPBan iPBan59 = new tp2.IPBan(iP57, (java.lang.Long)100L);
    boolean b60 = strictlySortedSinglyLinkedList44.removeFromIP(iP57);
    boolean b61 = server26.removeBan(iP57);
    boolean b62 = server5.addException(iP57);
    boolean b63 = singlyLinkedList0.remove(iP57);
    tp2.IP iP65 = singlyLinkedList0.get(953344);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i20 + "' != '" + 167772288+ "'", i20.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i41 + "' != '" + 167772288+ "'", i41.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b43 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b50 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iPBan52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b60 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b61 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b62 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b63 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP65);

  }

  @Test
  public void test381() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test381"); }


    int i1 = java.lang.Integer.signum(83886080);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 1);

  }

  @Test
  public void test382() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test382"); }


    // The following exception was thrown during execution in test generation
    try {
      int i2 = java.lang.Integer.parseUnsignedInt("2148007946", 20971536);
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test383() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test383"); }


    int i1 = java.lang.Integer.reverse(6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 1610612736);

  }

  @Test
  public void test384() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test384"); }


    int i2 = java.lang.Integer.divideUnsigned(13, 25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);

  }

  @Test
  public void test385() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test385"); }


    int i1 = java.lang.Integer.reverse(8388608);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 256);

  }

  @Test
  public void test386() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test386"); }


    java.lang.Integer i3 = null;
    // The following exception was thrown during execution in test generation
    try {
      tp2.IP iP4 = new tp2.IP((java.lang.Integer)(-1979711360), (java.lang.Integer)23, (java.lang.Integer)1610612736, i3);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test387() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test387"); }


    // The following exception was thrown during execution in test generation
    try {
      java.lang.Integer i1 = java.lang.Integer.decode("28h1a");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test388() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test388"); }


    int i2 = java.lang.Integer.max((-2147483648), 24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 24);

  }

  @Test
  public void test389() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test389"); }


    java.lang.String str2 = java.lang.Integer.toUnsignedString(0, 336488199);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "0"+ "'", str2.equals("0"));

  }

  @Test
  public void test390() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test390"); }


    // The following exception was thrown during execution in test generation
    try {
      int i2 = java.lang.Integer.parseInt("10101010111101", 100);
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test391() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test391"); }


    java.lang.Integer i2 = java.lang.Integer.getInteger("60000010", (java.lang.Integer)268435456);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i2 + "' != '" + 268435456+ "'", i2.equals(268435456));

  }

  @Test
  public void test392() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test392"); }


    java.lang.String str1 = java.lang.Integer.toBinaryString(1610612736);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "1100000000000000000000000000000"+ "'", str1.equals("1100000000000000000000000000000"));

  }

  @Test
  public void test393() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test393"); }


    // The following exception was thrown during execution in test generation
    try {
      java.lang.Integer i1 = java.lang.Integer.decode("2147483660");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test394() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test394"); }


    int i2 = java.lang.Integer.compare(41943073, 1886470370);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == (-1));

  }

  @Test
  public void test395() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test395"); }


    int i2 = java.lang.Integer.divideUnsigned(953344, 268435456);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);

  }

  @Test
  public void test396() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test396"); }


    int i2 = java.lang.Integer.rotateRight(953355, 1952471040);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 953355);

  }

  @Test
  public void test397() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test397"); }


    int i1 = java.lang.Integer.numberOfTrailingZeros(1073746921);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);

  }

  @Test
  public void test398() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test398"); }


    int i1 = java.lang.Integer.highestOneBit(15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 8);

  }

  @Test
  public void test399() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test399"); }


    java.lang.String str1 = java.lang.Integer.toBinaryString(67112960);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "100000000000001000000000000"+ "'", str1.equals("100000000000001000000000000"));

  }

  @Test
  public void test400() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test400"); }


    java.lang.String str1 = java.lang.Integer.toBinaryString(72);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "1001000"+ "'", str1.equals("1001000"));

  }

  @Test
  public void test401() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test401"); }


    int i1 = java.lang.Integer.highestOneBit(6291456);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 4194304);

  }

  @Test
  public void test402() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test402"); }


    int i1 = java.lang.Integer.parseInt("50");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 50);

  }

  @Test
  public void test403() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test403"); }


    int i1 = java.lang.Integer.parseInt("10001");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 10001);

  }

  @Test
  public void test404() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test404"); }


    java.lang.String str2 = java.lang.Integer.toUnsignedString(124, 524288);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "124"+ "'", str2.equals("124"));

  }

  @Test
  public void test405() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test405"); }


    long long1 = java.lang.Integer.toUnsignedLong(1073746921);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == 1073746921L);

  }

  @Test
  public void test406() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test406"); }


    tp2.SinglyLinkedList singlyLinkedList0 = new tp2.SinglyLinkedList();
    boolean b1 = singlyLinkedList0.isEmpty();
    boolean b2 = singlyLinkedList0.isEmpty();
    int i3 = singlyLinkedList0.getSize();
    tp2.IP iP5 = singlyLinkedList0.get(100);
    tp2.IP iP10 = new tp2.IP((java.lang.Integer)67109184, (java.lang.Integer)120000020, (java.lang.Integer)67109184, (java.lang.Integer)20971536);
    java.lang.Integer i11 = iP10.getFirst();
    singlyLinkedList0.add(iP10);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList13 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b14 = strictlySortedSinglyLinkedList13.isEmpty();
    tp2.IP iP19 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b20 = strictlySortedSinglyLinkedList13.removeFromIP(iP19);
    tp2.IP iP25 = new tp2.IP((java.lang.Integer)10, (java.lang.Integer)10, (java.lang.Integer)1, (java.lang.Integer)10);
    tp2.IPBan iPBan27 = new tp2.IPBan(iP25, (java.lang.Long)100L);
    boolean b28 = strictlySortedSinglyLinkedList13.contains(iPBan27);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList29 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP34 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b35 = strictlySortedSinglyLinkedList29.containsIP(iP34);
    iP34.setSecond((java.lang.Integer)(-2147483638));
    tp2.IPBan iPBan39 = new tp2.IPBan(iP34, (java.lang.Long)0L);
    boolean b40 = strictlySortedSinglyLinkedList13.contains(iPBan39);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList41 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b42 = strictlySortedSinglyLinkedList41.isEmpty();
    tp2.IP iP47 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b48 = strictlySortedSinglyLinkedList41.removeFromIP(iP47);
    tp2.IP iP53 = new tp2.IP((java.lang.Integer)10, (java.lang.Integer)10, (java.lang.Integer)1, (java.lang.Integer)10);
    tp2.IPBan iPBan55 = new tp2.IPBan(iP53, (java.lang.Long)100L);
    boolean b56 = strictlySortedSinglyLinkedList41.contains(iPBan55);
    boolean b57 = strictlySortedSinglyLinkedList13.add(iPBan55);
    tp2.SinglyLinkedList singlyLinkedList58 = new tp2.SinglyLinkedList();
    int i59 = singlyLinkedList58.getSize();
    tp2.IP iP60 = null;
    singlyLinkedList58.add(iP60);
    tp2.IP iP66 = new tp2.IP((java.lang.Integer)10, (java.lang.Integer)10, (java.lang.Integer)1, (java.lang.Integer)10);
    singlyLinkedList58.add(iP66);
    boolean b68 = strictlySortedSinglyLinkedList13.containsIP(iP66);
    boolean b69 = singlyLinkedList0.contains(iP66);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i11 + "' != '" + 67109184+ "'", i11.equals(67109184));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b48 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b56 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b57 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i59 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b68 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b69 == false);

  }

  @Test
  public void test407() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test407"); }


    // The following exception was thrown during execution in test generation
    try {
      java.lang.Integer i2 = java.lang.Integer.valueOf("100000000000000", 1886470370);
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


    tp2.Server server0 = new tp2.Server();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList1 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP6 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b7 = strictlySortedSinglyLinkedList1.containsIP(iP6);
    tp2.IP iP12 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList13 = new tp2.SinglyLinkedList();
    boolean b14 = iP12.equals((java.lang.Object)singlyLinkedList13);
    java.lang.Integer i15 = iP12.getThird();
    boolean b16 = strictlySortedSinglyLinkedList1.removeFromIP(iP12);
    boolean b17 = server0.removeException(iP12);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList18 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP23 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b24 = strictlySortedSinglyLinkedList18.containsIP(iP23);
    tp2.IPBan iPBan26 = strictlySortedSinglyLinkedList18.get((-1));
    tp2.IP iP31 = new tp2.IP((java.lang.Integer)10, (java.lang.Integer)10, (java.lang.Integer)1, (java.lang.Integer)10);
    tp2.IPBan iPBan33 = new tp2.IPBan(iP31, (java.lang.Long)100L);
    boolean b34 = strictlySortedSinglyLinkedList18.removeFromIP(iP31);
    boolean b35 = server0.addBan(iP31);
    iP31.setSecond((java.lang.Integer)41943073);
    iP31.setFirst((java.lang.Integer)27);
    iP31.setSecond((java.lang.Integer)11);
    iP31.setSecond((java.lang.Integer)3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i15 + "' != '" + 167772288+ "'", i15.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iPBan26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == true);

  }

  @Test
  public void test409() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test409"); }


    tp2.IP iP4 = new tp2.IP((java.lang.Integer)1073746921, (java.lang.Integer)(-892574121), (java.lang.Integer)16384, (java.lang.Integer)1073745921);
    java.lang.Integer i5 = iP4.getFirst();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i5 + "' != '" + 1073746921+ "'", i5.equals(1073746921));

  }

  @Test
  public void test410() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test410"); }


    // The following exception was thrown during execution in test generation
    try {
      int i2 = java.lang.Integer.parseInt("", 131072);
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

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test411"); }


    int i2 = java.lang.Integer.rotateRight(134218369, 16384);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 134218369);

  }

  @Test
  public void test412() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test412"); }


    int i2 = java.lang.Integer.rotateLeft((-2147483648), 131137);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);

  }

  @Test
  public void test413() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test413"); }


    int i1 = java.lang.Integer.numberOfTrailingZeros(1107296261);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);

  }

  @Test
  public void test414() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test414"); }


    long long1 = java.lang.Integer.toUnsignedLong(1952471040);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == 1952471040L);

  }

  @Test
  public void test415() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test415"); }


    tp2.SinglyLinkedList singlyLinkedList0 = new tp2.SinglyLinkedList();
    int i1 = singlyLinkedList0.getSize();
    tp2.IP iP2 = null;
    singlyLinkedList0.add(iP2);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList4 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP9 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b10 = strictlySortedSinglyLinkedList4.containsIP(iP9);
    tp2.IP iP15 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList16 = new tp2.SinglyLinkedList();
    boolean b17 = iP15.equals((java.lang.Object)singlyLinkedList16);
    java.lang.Integer i18 = iP15.getThird();
    boolean b19 = strictlySortedSinglyLinkedList4.removeFromIP(iP15);
    boolean b21 = iP15.equals((java.lang.Object)0);
    java.lang.Integer i22 = iP15.getFourth();
    tp2.IPBan iPBan24 = new tp2.IPBan(iP15, (java.lang.Long)0L);
    boolean b25 = singlyLinkedList0.contains(iP15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i18 + "' != '" + 167772288+ "'", i18.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i22 + "' != '" + 10+ "'", i22.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);

  }

  @Test
  public void test416() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test416"); }


    int i2 = java.lang.Integer.divideUnsigned(524288, 41943107);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);

  }

  @Test
  public void test417() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test417"); }


    tp2.SinglyLinkedList singlyLinkedList0 = new tp2.SinglyLinkedList();
    boolean b1 = singlyLinkedList0.isEmpty();
    boolean b2 = singlyLinkedList0.isEmpty();
    int i3 = singlyLinkedList0.getSize();
    tp2.IP iP5 = singlyLinkedList0.get(100);
    tp2.IP iP10 = new tp2.IP((java.lang.Integer)67109184, (java.lang.Integer)120000020, (java.lang.Integer)67109184, (java.lang.Integer)20971536);
    java.lang.Integer i11 = iP10.getFirst();
    singlyLinkedList0.add(iP10);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList13 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IPBan iPBan15 = strictlySortedSinglyLinkedList13.get(28);
    tp2.IP iP20 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList21 = new tp2.SinglyLinkedList();
    boolean b22 = iP20.equals((java.lang.Object)singlyLinkedList21);
    java.lang.Integer i23 = iP20.getThird();
    iP20.setFourth((java.lang.Integer)37);
    boolean b26 = strictlySortedSinglyLinkedList13.containsIP(iP20);
    singlyLinkedList0.add(iP20);
    java.lang.Integer i28 = iP20.getThird();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i11 + "' != '" + 67109184+ "'", i11.equals(67109184));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iPBan15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i23 + "' != '" + 167772288+ "'", i23.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i28 + "' != '" + 167772288+ "'", i28.equals(167772288));

  }

  @Test
  public void test418() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test418"); }


    tp2.Server server0 = new tp2.Server();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList1 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP6 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b7 = strictlySortedSinglyLinkedList1.containsIP(iP6);
    tp2.IP iP12 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList13 = new tp2.SinglyLinkedList();
    boolean b14 = iP12.equals((java.lang.Object)singlyLinkedList13);
    java.lang.Integer i15 = iP12.getThird();
    boolean b16 = strictlySortedSinglyLinkedList1.removeFromIP(iP12);
    boolean b17 = server0.removeException(iP12);
    server0.update();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList19 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP24 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b25 = strictlySortedSinglyLinkedList19.containsIP(iP24);
    tp2.IP iP30 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList31 = new tp2.SinglyLinkedList();
    boolean b32 = iP30.equals((java.lang.Object)singlyLinkedList31);
    java.lang.Integer i33 = iP30.getThird();
    boolean b34 = strictlySortedSinglyLinkedList19.removeFromIP(iP30);
    boolean b36 = iP30.equals((java.lang.Object)0);
    java.lang.Integer i37 = iP30.getThird();
    java.lang.Integer i38 = iP30.getFirst();
    iP30.setFourth((java.lang.Integer)20971536);
    tp2.Server server41 = new tp2.Server();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList42 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP47 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b48 = strictlySortedSinglyLinkedList42.containsIP(iP47);
    java.lang.Integer i49 = iP47.getFourth();
    boolean b50 = server41.addException(iP47);
    boolean b51 = iP30.equals((java.lang.Object)iP47);
    boolean b52 = server0.connect(iP47);
    tp2.IPBan iPBan54 = new tp2.IPBan(iP47, (java.lang.Long)1L);
    java.lang.Integer i55 = iP47.getFourth();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i15 + "' != '" + 167772288+ "'", i15.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i33 + "' != '" + 167772288+ "'", i33.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i37 + "' != '" + 167772288+ "'", i37.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i38 + "' != '" + (-2147483638)+ "'", i38.equals((-2147483638)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b48 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i49 + "' != '" + 10+ "'", i49.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b50 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b51 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b52 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i55 + "' != '" + 10+ "'", i55.equals(10));

  }

  @Test
  public void test419() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test419"); }


    java.lang.Integer i1 = java.lang.Integer.decode("10004001");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 10004001+ "'", i1.equals(10004001));

  }

  @Test
  public void test420() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test420"); }


    tp2.Server server0 = new tp2.Server();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList1 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP6 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b7 = strictlySortedSinglyLinkedList1.containsIP(iP6);
    tp2.IP iP12 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList13 = new tp2.SinglyLinkedList();
    boolean b14 = iP12.equals((java.lang.Object)singlyLinkedList13);
    java.lang.Integer i15 = iP12.getThird();
    boolean b16 = strictlySortedSinglyLinkedList1.removeFromIP(iP12);
    boolean b17 = server0.removeException(iP12);
    server0.update();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList19 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP24 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b25 = strictlySortedSinglyLinkedList19.containsIP(iP24);
    tp2.IP iP30 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList31 = new tp2.SinglyLinkedList();
    boolean b32 = iP30.equals((java.lang.Object)singlyLinkedList31);
    java.lang.Integer i33 = iP30.getThird();
    boolean b34 = strictlySortedSinglyLinkedList19.removeFromIP(iP30);
    boolean b36 = iP30.equals((java.lang.Object)0);
    tp2.IPBan iPBan38 = new tp2.IPBan(iP30, (java.lang.Long)100L);
    boolean b39 = server0.connect(iP30);
    server0.update();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList41 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP46 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b47 = strictlySortedSinglyLinkedList41.containsIP(iP46);
    iP46.setSecond((java.lang.Integer)(-2147483638));
    java.lang.Integer i50 = iP46.getFourth();
    java.lang.Integer i51 = iP46.getFirst();
    iP46.setFirst((java.lang.Integer)20971536);
    boolean b54 = server0.addException(iP46);
    tp2.IP iP55 = null;
    boolean b56 = server0.connect(iP55);
    tp2.Server server57 = new tp2.Server();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList58 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP63 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b64 = strictlySortedSinglyLinkedList58.containsIP(iP63);
    java.lang.Integer i65 = iP63.getFourth();
    boolean b66 = server57.addException(iP63);
    tp2.ITime iTime67 = null;
    server57.setTime(iTime67);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList69 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP74 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b75 = strictlySortedSinglyLinkedList69.containsIP(iP74);
    boolean b76 = server57.removeException(iP74);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList77 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP82 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b83 = strictlySortedSinglyLinkedList77.containsIP(iP82);
    iP82.setFirst((java.lang.Integer)0);
    java.lang.Integer i86 = iP82.getSecond();
    iP82.setFourth((java.lang.Integer)83886146);
    boolean b89 = server57.removeException(iP82);
    iP82.setSecond((java.lang.Integer)20971536);
    boolean b92 = server0.addBan(iP82);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i15 + "' != '" + 167772288+ "'", i15.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i33 + "' != '" + 167772288+ "'", i33.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b47 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i50 + "' != '" + 10+ "'", i50.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i51 + "' != '" + (-2147483638)+ "'", i51.equals((-2147483638)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b54 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b56 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b64 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i65 + "' != '" + 10+ "'", i65.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b66 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b75 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b76 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b83 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i86 + "' != '" + 100+ "'", i86.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b89 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b92 == true);

  }

  @Test
  public void test421() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test421"); }


    int i2 = java.lang.Integer.compareUnsigned(0, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == (-1));

  }

  @Test
  public void test422() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test422"); }


    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList0 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP5 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b6 = strictlySortedSinglyLinkedList0.containsIP(iP5);
    tp2.IP iP11 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList12 = new tp2.SinglyLinkedList();
    boolean b13 = iP11.equals((java.lang.Object)singlyLinkedList12);
    java.lang.Integer i14 = iP11.getThird();
    boolean b15 = strictlySortedSinglyLinkedList0.removeFromIP(iP11);
    int i16 = strictlySortedSinglyLinkedList0.getSize();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList17 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP22 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b23 = strictlySortedSinglyLinkedList17.containsIP(iP22);
    java.lang.Integer i24 = iP22.getFourth();
    tp2.IPBan iPBan26 = new tp2.IPBan(iP22, (java.lang.Long)0L);
    boolean b27 = strictlySortedSinglyLinkedList0.add(iPBan26);
    tp2.IP iP28 = iPBan26.getIp();
    tp2.IP iP29 = iPBan26.getIp();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i14 + "' != '" + 167772288+ "'", i14.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i24 + "' != '" + 10+ "'", i24.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP29);

  }

  @Test
  public void test423() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test423"); }


    java.lang.Integer i1 = java.lang.Integer.valueOf(72);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 72+ "'", i1.equals(72));

  }

  @Test
  public void test424() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test424"); }


    // The following exception was thrown during execution in test generation
    try {
      java.lang.Integer i2 = java.lang.Integer.valueOf("4", 10004001);
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test425() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test425"); }


    int i1 = java.lang.Integer.highestOneBit(939524096);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 536870912);

  }

  @Test
  public void test426() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test426"); }


    int i2 = java.lang.Integer.divideUnsigned(83886080, 1952471040);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);

  }

  @Test
  public void test427() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test427"); }


    tp2.Server server0 = new tp2.Server();
    tp2.ITime iTime1 = null;
    server0.setTime(iTime1);
    tp2.Server server3 = new tp2.Server();
    tp2.ITime iTime4 = null;
    server3.setTime(iTime4);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList6 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP11 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b12 = strictlySortedSinglyLinkedList6.containsIP(iP11);
    tp2.IP iP17 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList18 = new tp2.SinglyLinkedList();
    boolean b19 = iP17.equals((java.lang.Object)singlyLinkedList18);
    java.lang.Integer i20 = iP17.getThird();
    boolean b21 = strictlySortedSinglyLinkedList6.removeFromIP(iP17);
    boolean b23 = iP17.equals((java.lang.Object)0);
    boolean b24 = server3.addException(iP17);
    tp2.IPBan iPBan26 = new tp2.IPBan(iP17, (java.lang.Long)120000020L);
    boolean b27 = server0.addException(iP17);
    java.lang.Integer i28 = iP17.getFourth();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i20 + "' != '" + 167772288+ "'", i20.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i28 + "' != '" + 10+ "'", i28.equals(10));

  }

  @Test
  public void test428() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test428"); }


    int i2 = java.lang.Integer.sum(1107296261, 64);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1107296325);

  }

  @Test
  public void test429() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test429"); }


    int i2 = java.lang.Integer.rotateLeft(1100100, 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1126502400);

  }

  @Test
  public void test430() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test430"); }


    int i2 = java.lang.Integer.sum(256, 25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 281);

  }

  @Test
  public void test431() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test431"); }


    // The following exception was thrown during execution in test generation
    try {
      java.lang.Integer i2 = java.lang.Integer.valueOf("10000000000000000000", 10001);
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test432() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test432"); }


    tp2.Server server0 = new tp2.Server();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList1 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP6 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b7 = strictlySortedSinglyLinkedList1.containsIP(iP6);
    tp2.IP iP12 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList13 = new tp2.SinglyLinkedList();
    boolean b14 = iP12.equals((java.lang.Object)singlyLinkedList13);
    java.lang.Integer i15 = iP12.getThird();
    boolean b16 = strictlySortedSinglyLinkedList1.removeFromIP(iP12);
    boolean b17 = server0.removeException(iP12);
    server0.update();
    boolean b19 = server0.bansOkTime();
    tp2.SinglyLinkedList singlyLinkedList20 = new tp2.SinglyLinkedList();
    int i21 = singlyLinkedList20.getSize();
    tp2.IP iP23 = singlyLinkedList20.get(10);
    tp2.IP iP28 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    singlyLinkedList20.add(iP28);
    boolean b30 = server0.removeException(iP28);
    server0.update();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i15 + "' != '" + 167772288+ "'", i15.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);

  }

  @Test
  public void test433() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test433"); }


    java.lang.String str1 = java.lang.Integer.toBinaryString(83886144);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "101000000000000000001000000"+ "'", str1.equals("101000000000000000001000000"));

  }

  @Test
  public void test434() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test434"); }


    tp2.Server server0 = new tp2.Server();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList1 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP6 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b7 = strictlySortedSinglyLinkedList1.containsIP(iP6);
    tp2.IP iP12 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList13 = new tp2.SinglyLinkedList();
    boolean b14 = iP12.equals((java.lang.Object)singlyLinkedList13);
    java.lang.Integer i15 = iP12.getThird();
    boolean b16 = strictlySortedSinglyLinkedList1.removeFromIP(iP12);
    boolean b17 = server0.removeException(iP12);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList18 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP23 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b24 = strictlySortedSinglyLinkedList18.containsIP(iP23);
    iP23.setFirst((java.lang.Integer)0);
    java.lang.Object obj27 = null;
    boolean b28 = iP23.equals(obj27);
    boolean b29 = server0.addBan(iP23);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList30 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP35 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b36 = strictlySortedSinglyLinkedList30.containsIP(iP35);
    iP35.setSecond((java.lang.Integer)(-2147483638));
    java.lang.Integer i39 = iP35.getFourth();
    java.lang.Integer i40 = iP35.getFirst();
    iP35.setFirst((java.lang.Integer)20971536);
    java.lang.Integer i43 = iP35.getThird();
    boolean b44 = server0.addException(iP35);
    tp2.SinglyLinkedList singlyLinkedList45 = new tp2.SinglyLinkedList();
    int i46 = singlyLinkedList45.getSize();
    boolean b47 = singlyLinkedList45.isEmpty();
    tp2.IP iP52 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList53 = new tp2.SinglyLinkedList();
    boolean b54 = iP52.equals((java.lang.Object)singlyLinkedList53);
    iP52.setSecond((java.lang.Integer)2);
    boolean b57 = singlyLinkedList45.contains(iP52);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList58 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP63 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b64 = strictlySortedSinglyLinkedList58.containsIP(iP63);
    tp2.IP iP69 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList70 = new tp2.SinglyLinkedList();
    boolean b71 = iP69.equals((java.lang.Object)singlyLinkedList70);
    java.lang.Integer i72 = iP69.getThird();
    boolean b73 = strictlySortedSinglyLinkedList58.removeFromIP(iP69);
    boolean b75 = iP69.equals((java.lang.Object)0);
    boolean b76 = singlyLinkedList45.remove(iP69);
    boolean b77 = server0.addException(iP69);
    iP69.setFirst((java.lang.Integer)524288);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i15 + "' != '" + 167772288+ "'", i15.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i39 + "' != '" + 10+ "'", i39.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i40 + "' != '" + (-2147483638)+ "'", i40.equals((-2147483638)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i43 + "' != '" + 167772288+ "'", i43.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i46 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b47 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b54 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b57 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b64 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b71 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i72 + "' != '" + 167772288+ "'", i72.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b73 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b75 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b76 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b77 == true);

  }

  @Test
  public void test435() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test435"); }


    int i2 = java.lang.Integer.rotateRight(3691036, 10941);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 29528288);

  }

  @Test
  public void test436() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test436"); }


    tp2.SinglyLinkedList singlyLinkedList0 = new tp2.SinglyLinkedList();
    int i1 = singlyLinkedList0.getSize();
    tp2.IP iP3 = singlyLinkedList0.get(10);
    tp2.IP iP8 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    singlyLinkedList0.add(iP8);
    int i10 = singlyLinkedList0.getSize();
    tp2.IP iP15 = new tp2.IP((java.lang.Integer)(-2147483648), (java.lang.Integer)60000010, (java.lang.Integer)64, (java.lang.Integer)1073741824);
    singlyLinkedList0.add(iP15);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList17 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP22 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b23 = strictlySortedSinglyLinkedList17.containsIP(iP22);
    iP22.setFirst((java.lang.Integer)0);
    iP22.setFourth((java.lang.Integer)7);
    iP22.setSecond((java.lang.Integer)18);
    singlyLinkedList0.add(iP22);
    iP22.setFourth((java.lang.Integer)11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);

  }

  @Test
  public void test437() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test437"); }


    java.lang.Integer i2 = java.lang.Integer.getInteger("4", 60000010);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i2 + "' != '" + 60000010+ "'", i2.equals(60000010));

  }

  @Test
  public void test438() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test438"); }


    java.lang.String str2 = java.lang.Integer.toUnsignedString(4, 1107296325);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4"+ "'", str2.equals("4"));

  }

  @Test
  public void test439() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test439"); }


    java.lang.Integer i2 = java.lang.Integer.getInteger("ffffffff", (java.lang.Integer)67112960);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i2 + "' != '" + 67112960+ "'", i2.equals(67112960));

  }

  @Test
  public void test440() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test440"); }


    tp2.Server server0 = new tp2.Server();
    server0.update();
    boolean b2 = server0.bansOkTime();
    tp2.Server server3 = new tp2.Server();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList4 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP9 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b10 = strictlySortedSinglyLinkedList4.containsIP(iP9);
    tp2.IP iP15 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList16 = new tp2.SinglyLinkedList();
    boolean b17 = iP15.equals((java.lang.Object)singlyLinkedList16);
    java.lang.Integer i18 = iP15.getThird();
    boolean b19 = strictlySortedSinglyLinkedList4.removeFromIP(iP15);
    boolean b20 = server3.removeException(iP15);
    server3.update();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList22 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP27 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b28 = strictlySortedSinglyLinkedList22.containsIP(iP27);
    iP27.setSecond((java.lang.Integer)(-2147483638));
    java.lang.Integer i31 = iP27.getFourth();
    java.lang.Integer i32 = iP27.getFirst();
    iP27.setFirst((java.lang.Integer)20971536);
    boolean b35 = server3.addException(iP27);
    tp2.IPBan iPBan37 = new tp2.IPBan(iP27, (java.lang.Long)0L);
    java.lang.Integer i38 = iP27.getThird();
    boolean b39 = server0.removeBan(iP27);
    iP27.setThird((java.lang.Integer)41943072);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i18 + "' != '" + 167772288+ "'", i18.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i31 + "' != '" + 10+ "'", i31.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i32 + "' != '" + (-2147483638)+ "'", i32.equals((-2147483638)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i38 + "' != '" + 167772288+ "'", i38.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == false);

  }

  @Test
  public void test441() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test441"); }


    int i2 = java.lang.Integer.divideUnsigned(1342177280, (-892574121));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);

  }

  @Test
  public void test442() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test442"); }


    int i1 = java.lang.Integer.signum(167772288);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 1);

  }

  @Test
  public void test443() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test443"); }


    tp2.Server server0 = new tp2.Server();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList1 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP6 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b7 = strictlySortedSinglyLinkedList1.containsIP(iP6);
    tp2.IP iP12 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList13 = new tp2.SinglyLinkedList();
    boolean b14 = iP12.equals((java.lang.Object)singlyLinkedList13);
    java.lang.Integer i15 = iP12.getThird();
    boolean b16 = strictlySortedSinglyLinkedList1.removeFromIP(iP12);
    boolean b17 = server0.removeException(iP12);
    server0.update();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList19 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP24 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b25 = strictlySortedSinglyLinkedList19.containsIP(iP24);
    iP24.setSecond((java.lang.Integer)(-2147483638));
    java.lang.Integer i28 = iP24.getFourth();
    java.lang.Integer i29 = iP24.getFirst();
    iP24.setFirst((java.lang.Integer)20971536);
    boolean b32 = server0.addException(iP24);
    tp2.IPBan iPBan34 = new tp2.IPBan(iP24, (java.lang.Long)0L);
    iP24.setSecond((java.lang.Integer)(-1674030564));
    iP24.setSecond((java.lang.Integer)5);
    iP24.setThird((java.lang.Integer)256);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i15 + "' != '" + 167772288+ "'", i15.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i28 + "' != '" + 10+ "'", i28.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i29 + "' != '" + (-2147483638)+ "'", i29.equals((-2147483638)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == true);

  }

  @Test
  public void test444() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test444"); }


    int i2 = java.lang.Integer.rotateRight((-2147483645), 110592);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == (-2147483645));

  }

  @Test
  public void test445() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test445"); }


    int i2 = java.lang.Integer.compareUnsigned(256, 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);

  }

  @Test
  public void test446() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test446"); }


    int i1 = java.lang.Integer.numberOfTrailingZeros(28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 2);

  }

  @Test
  public void test447() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test447"); }


    int i1 = java.lang.Integer.highestOneBit(6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 4);

  }

  @Test
  public void test448() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test448"); }


    java.lang.String str1 = java.lang.Integer.toHexString(72);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "48"+ "'", str1.equals("48"));

  }

  @Test
  public void test449() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test449"); }


    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList0 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP5 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b6 = strictlySortedSinglyLinkedList0.containsIP(iP5);
    tp2.IPBan iPBan8 = strictlySortedSinglyLinkedList0.get((-1));
    tp2.IP iP13 = new tp2.IP((java.lang.Integer)10, (java.lang.Integer)10, (java.lang.Integer)1, (java.lang.Integer)10);
    tp2.IPBan iPBan15 = new tp2.IPBan(iP13, (java.lang.Long)100L);
    boolean b16 = strictlySortedSinglyLinkedList0.removeFromIP(iP13);
    tp2.IP iP17 = null;
    boolean b18 = strictlySortedSinglyLinkedList0.removeFromIP(iP17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iPBan8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);

  }

  @Test
  public void test450() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test450"); }


    int i1 = java.lang.Integer.parseInt("10280002");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 10280002);

  }

  @Test
  public void test451() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test451"); }


    java.lang.Integer i1 = java.lang.Integer.valueOf(41943107);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 41943107+ "'", i1.equals(41943107));

  }

  @Test
  public void test452() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test452"); }


    int i2 = java.lang.Integer.rotateRight(6291456, 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 6291456);

  }

  @Test
  public void test453() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test453"); }


    java.lang.Integer i2 = java.lang.Integer.getInteger("7270e14", 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i2 + "' != '" + 10+ "'", i2.equals(10));

  }

  @Test
  public void test454() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test454"); }


    int i1 = java.lang.Integer.signum(0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);

  }

  @Test
  public void test455() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test455"); }


    // The following exception was thrown during execution in test generation
    try {
      java.lang.Integer i2 = java.lang.Integer.valueOf("120000020", 336471815);
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


    // The following exception was thrown during execution in test generation
    try {
      int i2 = java.lang.Integer.parseInt("17", 240000041);
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

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test457"); }


    tp2.Server server0 = new tp2.Server();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList1 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP6 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b7 = strictlySortedSinglyLinkedList1.containsIP(iP6);
    tp2.IP iP12 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList13 = new tp2.SinglyLinkedList();
    boolean b14 = iP12.equals((java.lang.Object)singlyLinkedList13);
    java.lang.Integer i15 = iP12.getThird();
    boolean b16 = strictlySortedSinglyLinkedList1.removeFromIP(iP12);
    boolean b17 = server0.removeException(iP12);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList18 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP23 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b24 = strictlySortedSinglyLinkedList18.containsIP(iP23);
    iP23.setFirst((java.lang.Integer)0);
    java.lang.Object obj27 = null;
    boolean b28 = iP23.equals(obj27);
    boolean b29 = server0.addBan(iP23);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList30 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP35 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b36 = strictlySortedSinglyLinkedList30.containsIP(iP35);
    iP35.setSecond((java.lang.Integer)(-2147483638));
    java.lang.Integer i39 = iP35.getFourth();
    java.lang.Integer i40 = iP35.getFirst();
    iP35.setFirst((java.lang.Integer)20971536);
    java.lang.Integer i43 = iP35.getThird();
    boolean b44 = server0.addException(iP35);
    boolean b45 = server0.notSharedElements();
    tp2.SinglyLinkedList singlyLinkedList46 = new tp2.SinglyLinkedList();
    boolean b47 = singlyLinkedList46.isEmpty();
    tp2.Server server48 = new tp2.Server();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList49 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP54 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b55 = strictlySortedSinglyLinkedList49.containsIP(iP54);
    tp2.IP iP60 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList61 = new tp2.SinglyLinkedList();
    boolean b62 = iP60.equals((java.lang.Object)singlyLinkedList61);
    java.lang.Integer i63 = iP60.getThird();
    boolean b64 = strictlySortedSinglyLinkedList49.removeFromIP(iP60);
    boolean b65 = server48.removeException(iP60);
    server48.update();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList67 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP72 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b73 = strictlySortedSinglyLinkedList67.containsIP(iP72);
    iP72.setSecond((java.lang.Integer)(-2147483638));
    java.lang.Integer i76 = iP72.getFourth();
    java.lang.Integer i77 = iP72.getFirst();
    iP72.setFirst((java.lang.Integer)20971536);
    boolean b80 = server48.addException(iP72);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList81 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP82 = null;
    tp2.IPBan iPBan84 = new tp2.IPBan(iP82, (java.lang.Long)0L);
    boolean b85 = strictlySortedSinglyLinkedList81.contains(iPBan84);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList86 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP91 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b92 = strictlySortedSinglyLinkedList86.containsIP(iP91);
    iP91.setFirst((java.lang.Integer)0);
    java.lang.Integer i95 = iP91.getSecond();
    iPBan84.setIp(iP91);
    boolean b97 = server48.connect(iP91);
    singlyLinkedList46.add(iP91);
    boolean b99 = server0.addBan(iP91);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i15 + "' != '" + 167772288+ "'", i15.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i39 + "' != '" + 10+ "'", i39.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i40 + "' != '" + (-2147483638)+ "'", i40.equals((-2147483638)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i43 + "' != '" + 167772288+ "'", i43.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b47 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b55 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b62 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i63 + "' != '" + 167772288+ "'", i63.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b64 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b65 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b73 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i76 + "' != '" + 10+ "'", i76.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i77 + "' != '" + (-2147483638)+ "'", i77.equals((-2147483638)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b80 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b85 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b92 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i95 + "' != '" + 100+ "'", i95.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b97 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b99 == false);

  }

  @Test
  public void test458() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test458"); }


    tp2.Server server0 = new tp2.Server();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList1 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP6 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b7 = strictlySortedSinglyLinkedList1.containsIP(iP6);
    tp2.IP iP12 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList13 = new tp2.SinglyLinkedList();
    boolean b14 = iP12.equals((java.lang.Object)singlyLinkedList13);
    java.lang.Integer i15 = iP12.getThird();
    boolean b16 = strictlySortedSinglyLinkedList1.removeFromIP(iP12);
    boolean b17 = server0.removeException(iP12);
    server0.update();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList19 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP24 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b25 = strictlySortedSinglyLinkedList19.containsIP(iP24);
    tp2.IP iP30 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList31 = new tp2.SinglyLinkedList();
    boolean b32 = iP30.equals((java.lang.Object)singlyLinkedList31);
    java.lang.Integer i33 = iP30.getThird();
    boolean b34 = strictlySortedSinglyLinkedList19.removeFromIP(iP30);
    boolean b36 = iP30.equals((java.lang.Object)0);
    tp2.IPBan iPBan38 = new tp2.IPBan(iP30, (java.lang.Long)100L);
    boolean b39 = server0.connect(iP30);
    server0.update();
    tp2.IP iP41 = null;
    boolean b42 = server0.addException(iP41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i15 + "' != '" + 167772288+ "'", i15.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i33 + "' != '" + 167772288+ "'", i33.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == false);

  }

  @Test
  public void test459() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test459"); }


    java.lang.Integer i1 = java.lang.Integer.valueOf(25275);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 25275+ "'", i1.equals(25275));

  }

  @Test
  public void test460() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test460"); }


    int i1 = java.lang.Integer.reverse(134218369);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == (-2126512112));

  }

  @Test
  public void test461() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test461"); }


    java.lang.Integer i1 = java.lang.Integer.decode("10280002");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 10280002+ "'", i1.equals(10280002));

  }

  @Test
  public void test462() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test462"); }


    java.lang.String str2 = java.lang.Integer.toUnsignedString(64, 1342177280);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "64"+ "'", str2.equals("64"));

  }

  @Test
  public void test463() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test463"); }


    tp2.SinglyLinkedList singlyLinkedList0 = new tp2.SinglyLinkedList();
    int i1 = singlyLinkedList0.getSize();
    tp2.IP iP3 = singlyLinkedList0.get(10);
    boolean b4 = singlyLinkedList0.isEmpty();
    int i5 = singlyLinkedList0.getSize();
    tp2.Server server6 = new tp2.Server();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList7 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP12 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b13 = strictlySortedSinglyLinkedList7.containsIP(iP12);
    java.lang.Integer i14 = iP12.getFourth();
    boolean b15 = server6.addException(iP12);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList16 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP21 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b22 = strictlySortedSinglyLinkedList16.containsIP(iP21);
    iP21.setFirst((java.lang.Integer)0);
    iP21.setFourth((java.lang.Integer)7);
    boolean b28 = iP21.equals((java.lang.Object)"");
    boolean b29 = server6.removeBan(iP21);
    iP21.setFirst((java.lang.Integer)72);
    java.lang.Integer i32 = iP21.getSecond();
    boolean b33 = singlyLinkedList0.contains(iP21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i14 + "' != '" + 10+ "'", i14.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i32 + "' != '" + 100+ "'", i32.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == false);

  }

  @Test
  public void test464() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test464"); }


    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList0 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP5 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b6 = strictlySortedSinglyLinkedList0.containsIP(iP5);
    tp2.IP iP11 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList12 = new tp2.SinglyLinkedList();
    boolean b13 = iP11.equals((java.lang.Object)singlyLinkedList12);
    java.lang.Integer i14 = iP11.getThird();
    boolean b15 = strictlySortedSinglyLinkedList0.removeFromIP(iP11);
    tp2.IP iP16 = null;
    tp2.IPBan iPBan18 = new tp2.IPBan(iP16, (java.lang.Long)(-1L));
    boolean b19 = strictlySortedSinglyLinkedList0.contains(iPBan18);
    tp2.IPBan iPBan21 = strictlySortedSinglyLinkedList0.get((-2147483648));
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList22 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b23 = strictlySortedSinglyLinkedList22.isEmpty();
    tp2.IP iP28 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b29 = strictlySortedSinglyLinkedList22.removeFromIP(iP28);
    tp2.IP iP34 = new tp2.IP((java.lang.Integer)10, (java.lang.Integer)10, (java.lang.Integer)1, (java.lang.Integer)10);
    tp2.IPBan iPBan36 = new tp2.IPBan(iP34, (java.lang.Long)100L);
    boolean b37 = strictlySortedSinglyLinkedList22.contains(iPBan36);
    boolean b38 = strictlySortedSinglyLinkedList0.add(iPBan36);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList39 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP40 = null;
    tp2.IPBan iPBan42 = new tp2.IPBan(iP40, (java.lang.Long)0L);
    boolean b43 = strictlySortedSinglyLinkedList39.contains(iPBan42);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList44 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP49 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b50 = strictlySortedSinglyLinkedList44.containsIP(iP49);
    iP49.setFirst((java.lang.Integer)0);
    java.lang.Integer i53 = iP49.getSecond();
    iPBan42.setIp(iP49);
    tp2.Server server55 = new tp2.Server();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList56 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP61 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b62 = strictlySortedSinglyLinkedList56.containsIP(iP61);
    tp2.IP iP67 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList68 = new tp2.SinglyLinkedList();
    boolean b69 = iP67.equals((java.lang.Object)singlyLinkedList68);
    java.lang.Integer i70 = iP67.getThird();
    boolean b71 = strictlySortedSinglyLinkedList56.removeFromIP(iP67);
    boolean b72 = server55.removeException(iP67);
    iPBan42.setIp(iP67);
    tp2.IP iP74 = iPBan42.getIp();
    java.lang.Long long75 = iPBan42.getExpires();
    boolean b76 = strictlySortedSinglyLinkedList0.add(iPBan42);
    boolean b77 = strictlySortedSinglyLinkedList0.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i14 + "' != '" + 167772288+ "'", i14.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iPBan21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b43 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b50 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i53 + "' != '" + 100+ "'", i53.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b62 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b69 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i70 + "' != '" + 167772288+ "'", i70.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b71 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b72 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP74);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long75 + "' != '" + 0L+ "'", long75.equals(0L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b76 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b77 == false);

  }

  @Test
  public void test465() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test465"); }


    int i2 = java.lang.Integer.rotateRight(13, 131072);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 13);

  }

  @Test
  public void test466() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test466"); }


    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList0 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP5 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b6 = strictlySortedSinglyLinkedList0.containsIP(iP5);
    tp2.IP iP11 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList12 = new tp2.SinglyLinkedList();
    boolean b13 = iP11.equals((java.lang.Object)singlyLinkedList12);
    java.lang.Integer i14 = iP11.getThird();
    boolean b15 = strictlySortedSinglyLinkedList0.removeFromIP(iP11);
    tp2.IP iP16 = null;
    tp2.IPBan iPBan18 = new tp2.IPBan(iP16, (java.lang.Long)(-1L));
    boolean b19 = strictlySortedSinglyLinkedList0.contains(iPBan18);
    int i20 = strictlySortedSinglyLinkedList0.getSize();
    int i21 = strictlySortedSinglyLinkedList0.getSize();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i14 + "' != '" + 167772288+ "'", i14.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 0);

  }

  @Test
  public void test467() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test467"); }


    tp2.Server server0 = new tp2.Server();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList1 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP6 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b7 = strictlySortedSinglyLinkedList1.containsIP(iP6);
    tp2.IP iP12 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList13 = new tp2.SinglyLinkedList();
    boolean b14 = iP12.equals((java.lang.Object)singlyLinkedList13);
    java.lang.Integer i15 = iP12.getThird();
    boolean b16 = strictlySortedSinglyLinkedList1.removeFromIP(iP12);
    boolean b17 = server0.removeException(iP12);
    server0.update();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList19 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP24 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b25 = strictlySortedSinglyLinkedList19.containsIP(iP24);
    iP24.setSecond((java.lang.Integer)(-2147483638));
    java.lang.Integer i28 = iP24.getFourth();
    java.lang.Integer i29 = iP24.getFirst();
    iP24.setFirst((java.lang.Integer)20971536);
    boolean b32 = server0.addException(iP24);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList33 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP34 = null;
    tp2.IPBan iPBan36 = new tp2.IPBan(iP34, (java.lang.Long)0L);
    boolean b37 = strictlySortedSinglyLinkedList33.contains(iPBan36);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList38 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP43 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b44 = strictlySortedSinglyLinkedList38.containsIP(iP43);
    iP43.setFirst((java.lang.Integer)0);
    java.lang.Integer i47 = iP43.getSecond();
    iPBan36.setIp(iP43);
    boolean b49 = server0.connect(iP43);
    java.lang.Integer i50 = null;
    iP43.setThird(i50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i15 + "' != '" + 167772288+ "'", i15.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i28 + "' != '" + 10+ "'", i28.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i29 + "' != '" + (-2147483638)+ "'", i29.equals((-2147483638)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i47 + "' != '" + 100+ "'", i47.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b49 == true);

  }

  @Test
  public void test468() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test468"); }


    java.lang.String str1 = java.lang.Integer.toBinaryString(1705518);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "110100000011000101110"+ "'", str1.equals("110100000011000101110"));

  }

  @Test
  public void test469() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test469"); }


    int i2 = java.lang.Integer.divideUnsigned(0, 24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);

  }

  @Test
  public void test470() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test470"); }


    int i1 = java.lang.Integer.bitCount(953344);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 6);

  }

  @Test
  public void test471() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test471"); }


    int i2 = java.lang.Integer.rotateRight(0, 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);

  }

  @Test
  public void test472() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test472"); }


    tp2.Server server0 = new tp2.Server();
    server0.update();
    boolean b2 = server0.bansOkTime();
    boolean b3 = server0.bansOkTime();
    tp2.Server server4 = new tp2.Server();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList5 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP10 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b11 = strictlySortedSinglyLinkedList5.containsIP(iP10);
    tp2.IP iP16 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList17 = new tp2.SinglyLinkedList();
    boolean b18 = iP16.equals((java.lang.Object)singlyLinkedList17);
    java.lang.Integer i19 = iP16.getThird();
    boolean b20 = strictlySortedSinglyLinkedList5.removeFromIP(iP16);
    boolean b21 = server4.removeException(iP16);
    server4.update();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList23 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP28 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b29 = strictlySortedSinglyLinkedList23.containsIP(iP28);
    iP28.setSecond((java.lang.Integer)(-2147483638));
    java.lang.Integer i32 = iP28.getFourth();
    java.lang.Integer i33 = iP28.getFirst();
    iP28.setFirst((java.lang.Integer)20971536);
    boolean b36 = server4.addException(iP28);
    boolean b37 = server0.addException(iP28);
    tp2.SinglyLinkedList singlyLinkedList38 = new tp2.SinglyLinkedList();
    int i39 = singlyLinkedList38.getSize();
    tp2.IP iP40 = null;
    singlyLinkedList38.add(iP40);
    tp2.IP iP46 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b47 = singlyLinkedList38.contains(iP46);
    java.lang.Integer i48 = iP46.getFourth();
    boolean b49 = server0.addBan(iP46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i19 + "' != '" + 167772288+ "'", i19.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i32 + "' != '" + 10+ "'", i32.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i33 + "' != '" + (-2147483638)+ "'", i33.equals((-2147483638)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i39 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b47 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i48 + "' != '" + 10+ "'", i48.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b49 == true);

  }

  @Test
  public void test473() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test473"); }


    tp2.Server server0 = new tp2.Server();
    server0.update();
    boolean b2 = server0.bansOkTime();
    boolean b3 = server0.bansOkTime();
    tp2.Server server4 = new tp2.Server();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList5 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP10 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b11 = strictlySortedSinglyLinkedList5.containsIP(iP10);
    tp2.IP iP16 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList17 = new tp2.SinglyLinkedList();
    boolean b18 = iP16.equals((java.lang.Object)singlyLinkedList17);
    java.lang.Integer i19 = iP16.getThird();
    boolean b20 = strictlySortedSinglyLinkedList5.removeFromIP(iP16);
    boolean b21 = server4.removeException(iP16);
    server4.update();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList23 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP28 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b29 = strictlySortedSinglyLinkedList23.containsIP(iP28);
    iP28.setSecond((java.lang.Integer)(-2147483638));
    java.lang.Integer i32 = iP28.getFourth();
    java.lang.Integer i33 = iP28.getFirst();
    iP28.setFirst((java.lang.Integer)20971536);
    boolean b36 = server4.addException(iP28);
    boolean b37 = server0.addException(iP28);
    server0.update();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i19 + "' != '" + 167772288+ "'", i19.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i32 + "' != '" + 10+ "'", i32.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i33 + "' != '" + (-2147483638)+ "'", i33.equals((-2147483638)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == true);

  }

  @Test
  public void test474() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test474"); }


    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList0 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP5 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b6 = strictlySortedSinglyLinkedList0.containsIP(iP5);
    iP5.setFirst((java.lang.Integer)0);
    iP5.setFourth((java.lang.Integer)7);
    iP5.setSecond((java.lang.Integer)18);
    iP5.setFourth((java.lang.Integer)1952471040);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);

  }

  @Test
  public void test475() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test475"); }


    java.lang.Integer i2 = java.lang.Integer.getInteger("", 1610612736);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i2 + "' != '" + 1610612736+ "'", i2.equals(1610612736));

  }

  @Test
  public void test476() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test476"); }


    java.lang.String str1 = java.lang.Integer.toBinaryString(1342177280);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "1010000000000000000000000000000"+ "'", str1.equals("1010000000000000000000000000000"));

  }

  @Test
  public void test477() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test477"); }


    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList0 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP5 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b6 = strictlySortedSinglyLinkedList0.containsIP(iP5);
    iP5.setFirst((java.lang.Integer)0);
    java.lang.Object obj9 = null;
    boolean b10 = iP5.equals(obj9);
    java.lang.Integer i11 = iP5.getSecond();
    java.lang.Integer i12 = iP5.getFourth();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i11 + "' != '" + 100+ "'", i11.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i12 + "' != '" + 10+ "'", i12.equals(10));

  }

  @Test
  public void test478() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test478"); }


    // The following exception was thrown during execution in test generation
    try {
      korat.finitization.IFinitization iFinitization1 = tp2.Server.finServer(2098192);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test479() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test479"); }


    // The following exception was thrown during execution in test generation
    try {
      int i2 = java.lang.Integer.parseUnsignedInt("10001", 1107296325);
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test480() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test480"); }


    java.lang.Integer i2 = java.lang.Integer.getInteger("ffffffff", 31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i2 + "' != '" + 31+ "'", i2.equals(31));

  }

  @Test
  public void test481() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test481"); }


    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList0 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP5 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b6 = strictlySortedSinglyLinkedList0.containsIP(iP5);
    iP5.setFirst((java.lang.Integer)0);
    java.lang.Integer i9 = iP5.getSecond();
    iP5.setFourth((java.lang.Integer)83886146);
    iP5.setFourth((java.lang.Integer)83886146);
    tp2.IPBan iPBan15 = new tp2.IPBan(iP5, (java.lang.Long)1073746921L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 100+ "'", i9.equals(100));

  }

  @Test
  public void test482() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test482"); }


    tp2.Server server0 = new tp2.Server();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList1 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP6 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b7 = strictlySortedSinglyLinkedList1.containsIP(iP6);
    tp2.IP iP12 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList13 = new tp2.SinglyLinkedList();
    boolean b14 = iP12.equals((java.lang.Object)singlyLinkedList13);
    java.lang.Integer i15 = iP12.getThird();
    boolean b16 = strictlySortedSinglyLinkedList1.removeFromIP(iP12);
    boolean b17 = server0.removeException(iP12);
    server0.update();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList19 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP24 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b25 = strictlySortedSinglyLinkedList19.containsIP(iP24);
    tp2.IP iP30 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList31 = new tp2.SinglyLinkedList();
    boolean b32 = iP30.equals((java.lang.Object)singlyLinkedList31);
    java.lang.Integer i33 = iP30.getThird();
    boolean b34 = strictlySortedSinglyLinkedList19.removeFromIP(iP30);
    boolean b36 = iP30.equals((java.lang.Object)0);
    java.lang.Integer i37 = iP30.getThird();
    java.lang.Integer i38 = iP30.getFirst();
    iP30.setFourth((java.lang.Integer)20971536);
    tp2.Server server41 = new tp2.Server();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList42 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP47 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b48 = strictlySortedSinglyLinkedList42.containsIP(iP47);
    java.lang.Integer i49 = iP47.getFourth();
    boolean b50 = server41.addException(iP47);
    boolean b51 = iP30.equals((java.lang.Object)iP47);
    boolean b52 = server0.connect(iP47);
    tp2.IPBan iPBan54 = new tp2.IPBan(iP47, (java.lang.Long)1L);
    iP47.setFirst((java.lang.Integer)27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i15 + "' != '" + 167772288+ "'", i15.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i33 + "' != '" + 167772288+ "'", i33.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i37 + "' != '" + 167772288+ "'", i37.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i38 + "' != '" + (-2147483638)+ "'", i38.equals((-2147483638)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b48 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i49 + "' != '" + 10+ "'", i49.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b50 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b51 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b52 == true);

  }

  @Test
  public void test483() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test483"); }


    java.lang.String str1 = java.lang.Integer.toOctalString(4194304);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "20000000"+ "'", str1.equals("20000000"));

  }

  @Test
  public void test484() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test484"); }


    tp2.SinglyLinkedList singlyLinkedList0 = new tp2.SinglyLinkedList();
    int i1 = singlyLinkedList0.getSize();
    tp2.IP iP2 = null;
    singlyLinkedList0.add(iP2);
    tp2.IP iP8 = new tp2.IP((java.lang.Integer)10, (java.lang.Integer)10, (java.lang.Integer)1, (java.lang.Integer)10);
    singlyLinkedList0.add(iP8);
    boolean b10 = singlyLinkedList0.isEmpty();
    tp2.IP iP12 = singlyLinkedList0.get(26214);
    boolean b13 = singlyLinkedList0.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);

  }

  @Test
  public void test485() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test485"); }


    tp2.IP iP4 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList5 = new tp2.SinglyLinkedList();
    boolean b6 = iP4.equals((java.lang.Object)singlyLinkedList5);
    tp2.IP iP8 = singlyLinkedList5.get(4);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList9 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP14 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b15 = strictlySortedSinglyLinkedList9.containsIP(iP14);
    java.lang.Integer i16 = iP14.getFourth();
    tp2.IPBan iPBan18 = new tp2.IPBan(iP14, (java.lang.Long)0L);
    boolean b19 = singlyLinkedList5.remove(iP14);
    boolean b20 = singlyLinkedList5.isEmpty();
    int i21 = singlyLinkedList5.getSize();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i16 + "' != '" + 10+ "'", i16.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 0);

  }

  @Test
  public void test486() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test486"); }


    java.lang.String str2 = java.lang.Integer.toUnsignedString(67109184, 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "67109184"+ "'", str2.equals("67109184"));

  }

  @Test
  public void test487() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test487"); }


    int i2 = java.lang.Integer.remainderUnsigned(0, 671088640);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);

  }

  @Test
  public void test488() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test488"); }


    int i2 = java.lang.Integer.min(131072, 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 3);

  }

  @Test
  public void test489() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test489"); }


    tp2.SinglyLinkedList singlyLinkedList0 = new tp2.SinglyLinkedList();
    int i1 = singlyLinkedList0.getSize();
    tp2.SinglyLinkedList singlyLinkedList2 = new tp2.SinglyLinkedList();
    int i3 = singlyLinkedList2.getSize();
    tp2.IP iP5 = singlyLinkedList2.get(10);
    tp2.IP iP10 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    singlyLinkedList2.add(iP10);
    iP10.setThird((java.lang.Integer)120000020);
    singlyLinkedList0.add(iP10);
    iP10.setFourth((java.lang.Integer)110592);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP5);

  }

  @Test
  public void test490() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test490"); }


    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList0 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP5 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b6 = strictlySortedSinglyLinkedList0.containsIP(iP5);
    tp2.IP iP11 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList12 = new tp2.SinglyLinkedList();
    boolean b13 = iP11.equals((java.lang.Object)singlyLinkedList12);
    java.lang.Integer i14 = iP11.getThird();
    boolean b15 = strictlySortedSinglyLinkedList0.removeFromIP(iP11);
    tp2.IP iP16 = null;
    tp2.IPBan iPBan18 = new tp2.IPBan(iP16, (java.lang.Long)(-1L));
    boolean b19 = strictlySortedSinglyLinkedList0.contains(iPBan18);
    boolean b20 = strictlySortedSinglyLinkedList0.isEmpty();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList21 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP22 = null;
    tp2.IPBan iPBan24 = new tp2.IPBan(iP22, (java.lang.Long)0L);
    boolean b25 = strictlySortedSinglyLinkedList21.contains(iPBan24);
    boolean b26 = strictlySortedSinglyLinkedList0.add(iPBan24);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList27 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP28 = null;
    tp2.IPBan iPBan30 = new tp2.IPBan(iP28, (java.lang.Long)0L);
    boolean b31 = strictlySortedSinglyLinkedList27.contains(iPBan30);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList32 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP37 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b38 = strictlySortedSinglyLinkedList32.containsIP(iP37);
    iP37.setFirst((java.lang.Integer)0);
    java.lang.Integer i41 = iP37.getSecond();
    iPBan30.setIp(iP37);
    iPBan30.setExpires((java.lang.Long)100L);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList45 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b46 = strictlySortedSinglyLinkedList45.isEmpty();
    tp2.IP iP51 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b52 = strictlySortedSinglyLinkedList45.removeFromIP(iP51);
    iPBan30.setIp(iP51);
    tp2.IP iP54 = iPBan30.getIp();
    boolean b55 = strictlySortedSinglyLinkedList0.contains(iPBan30);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList56 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP61 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b62 = strictlySortedSinglyLinkedList56.containsIP(iP61);
    tp2.IP iP67 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList68 = new tp2.SinglyLinkedList();
    boolean b69 = iP67.equals((java.lang.Object)singlyLinkedList68);
    java.lang.Integer i70 = iP67.getThird();
    boolean b71 = strictlySortedSinglyLinkedList56.removeFromIP(iP67);
    tp2.IP iP72 = null;
    tp2.IPBan iPBan74 = new tp2.IPBan(iP72, (java.lang.Long)(-1L));
    boolean b75 = strictlySortedSinglyLinkedList56.contains(iPBan74);
    iPBan74.setExpires((java.lang.Long)10L);
    java.lang.Long long78 = iPBan74.getExpires();
    boolean b79 = strictlySortedSinglyLinkedList0.contains(iPBan74);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i14 + "' != '" + 167772288+ "'", i14.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i41 + "' != '" + 100+ "'", i41.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b46 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b52 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b55 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b62 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b69 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i70 + "' != '" + 167772288+ "'", i70.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b71 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b75 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long78 + "' != '" + 10L+ "'", long78.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b79 == false);

  }

  @Test
  public void test491() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test491"); }


    tp2.Server server0 = new tp2.Server();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList1 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP6 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b7 = strictlySortedSinglyLinkedList1.containsIP(iP6);
    tp2.IP iP12 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList13 = new tp2.SinglyLinkedList();
    boolean b14 = iP12.equals((java.lang.Object)singlyLinkedList13);
    java.lang.Integer i15 = iP12.getThird();
    boolean b16 = strictlySortedSinglyLinkedList1.removeFromIP(iP12);
    boolean b17 = server0.removeException(iP12);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList18 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP23 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b24 = strictlySortedSinglyLinkedList18.containsIP(iP23);
    iP23.setFirst((java.lang.Integer)0);
    java.lang.Object obj27 = null;
    boolean b28 = iP23.equals(obj27);
    boolean b29 = server0.addBan(iP23);
    tp2.ITime iTime30 = null;
    server0.setTime(iTime30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i15 + "' != '" + 167772288+ "'", i15.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == true);

  }

  @Test
  public void test492() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test492"); }


    java.lang.Integer i1 = java.lang.Integer.getInteger("101000000000000000001000000");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);

  }

  @Test
  public void test493() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test493"); }


    java.lang.String str1 = java.lang.Integer.toOctalString(44739413);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "252525525"+ "'", str1.equals("252525525"));

  }

  @Test
  public void test494() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test494"); }


    tp2.IP iP4 = new tp2.IP((java.lang.Integer)10, (java.lang.Integer)10, (java.lang.Integer)1, (java.lang.Integer)10);
    java.lang.Integer i5 = iP4.getSecond();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i5 + "' != '" + 10+ "'", i5.equals(10));

  }

  @Test
  public void test495() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test495"); }


    int i2 = java.lang.Integer.min(402653184, 21884);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 21884);

  }

  @Test
  public void test496() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test496"); }


    tp2.Server server0 = new tp2.Server();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList1 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP6 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b7 = strictlySortedSinglyLinkedList1.containsIP(iP6);
    tp2.IP iP12 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList13 = new tp2.SinglyLinkedList();
    boolean b14 = iP12.equals((java.lang.Object)singlyLinkedList13);
    java.lang.Integer i15 = iP12.getThird();
    boolean b16 = strictlySortedSinglyLinkedList1.removeFromIP(iP12);
    boolean b17 = server0.removeException(iP12);
    server0.update();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList19 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP24 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b25 = strictlySortedSinglyLinkedList19.containsIP(iP24);
    tp2.IP iP30 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList31 = new tp2.SinglyLinkedList();
    boolean b32 = iP30.equals((java.lang.Object)singlyLinkedList31);
    java.lang.Integer i33 = iP30.getThird();
    boolean b34 = strictlySortedSinglyLinkedList19.removeFromIP(iP30);
    boolean b36 = iP30.equals((java.lang.Object)0);
    tp2.IPBan iPBan38 = new tp2.IPBan(iP30, (java.lang.Long)100L);
    boolean b39 = server0.connect(iP30);
    server0.update();
    tp2.SinglyLinkedList singlyLinkedList41 = new tp2.SinglyLinkedList();
    int i42 = singlyLinkedList41.getSize();
    boolean b43 = singlyLinkedList41.isEmpty();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList44 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP49 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b50 = strictlySortedSinglyLinkedList44.containsIP(iP49);
    iP49.setSecond((java.lang.Integer)(-2147483638));
    tp2.IPBan iPBan54 = new tp2.IPBan(iP49, (java.lang.Long)0L);
    iP49.setFourth((java.lang.Integer)(-2147483638));
    boolean b57 = singlyLinkedList41.remove(iP49);
    boolean b58 = server0.addException(iP49);
    iP49.setFirst((java.lang.Integer)(-2147483645));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i15 + "' != '" + 167772288+ "'", i15.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i33 + "' != '" + 167772288+ "'", i33.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i42 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b43 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b50 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b57 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b58 == true);

  }

  @Test
  public void test497() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test497"); }


    long long1 = java.lang.Integer.toUnsignedLong(3145728);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == 3145728L);

  }

  @Test
  public void test498() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test498"); }


    java.lang.Integer i2 = java.lang.Integer.getInteger("67109184", 10941);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i2 + "' != '" + 10941+ "'", i2.equals(10941));

  }

  @Test
  public void test499() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test499"); }


    int i2 = java.lang.Integer.sum(21884, 25275);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 47159);

  }

  @Test
  public void test500() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test500"); }


    int i2 = java.lang.Integer.divideUnsigned(3691036, (-892585062));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);

  }

}
