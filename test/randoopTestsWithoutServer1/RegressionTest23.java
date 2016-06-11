package randoopTestsWithoutServer1;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest23 {

  public static boolean debug = false;

  @Test
  public void test001() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test001"); }


    tp2.IP iP4 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP4.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan8 = new tp2.IPBan(iP4, (java.lang.Long)100L);
    tp2.IP iP9 = iPBan8.ip;
    tp2.IP iP10 = iPBan8.getIp();
    java.lang.Integer i11 = null;
    iP10.setFirst(i11);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList13 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b14 = strictlySortedSinglyLinkedList13.repOK();
    tp2.IP iP19 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i20 = iP19.getSecond();
    iP19.setFirst((java.lang.Integer)11001000);
    iP19.setFirst((java.lang.Integer)(-2147483648));
    boolean b25 = strictlySortedSinglyLinkedList13.removeFromIP(iP19);
    boolean b26 = iP10.equals((java.lang.Object)strictlySortedSinglyLinkedList13);
    tp2.IP iP31 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP31.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan35 = new tp2.IPBan(iP31, (java.lang.Long)100L);
    boolean b36 = strictlySortedSinglyLinkedList13.removeFromIP(iP31);
    java.lang.Integer i37 = iP31.getFirst();
    iP31.setFirst((java.lang.Integer)0);
    tp2.IPBan iPBan41 = new tp2.IPBan(iP31, (java.lang.Long)1L);
    tp2.SinglyLinkedList singlyLinkedList42 = new tp2.SinglyLinkedList();
    boolean b43 = singlyLinkedList42.repOK();
    int i44 = singlyLinkedList42.getSize();
    boolean b45 = singlyLinkedList42.isEmpty();
    tp2.IP iP50 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP50.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan54 = new tp2.IPBan(iP50, (java.lang.Long)100L);
    tp2.IP iP55 = iPBan54.ip;
    tp2.IP iP60 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i61 = iP60.getFourth();
    java.lang.Integer i62 = iP60.getFourth();
    iP60.setThird((java.lang.Integer)200);
    iPBan54.ip = iP60;
    iP60.setFirst((java.lang.Integer)16777216);
    boolean b68 = singlyLinkedList42.contains(iP60);
    java.lang.Integer i69 = iP60.getThird();
    iPBan41.setIp(iP60);
    iPBan41.setExpires((java.lang.Long)7L);
    java.lang.Long long73 = iPBan41.getExpires();
    tp2.IP iP74 = iPBan41.ip;
    java.lang.Integer i75 = iP74.getFirst();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i20 + "' != '" + (-1)+ "'", i20.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i37 + "' != '" + 200+ "'", i37.equals(200));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b43 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i44 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP55);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i61 + "' != '" + 100+ "'", i61.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i62 + "' != '" + 100+ "'", i62.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b68 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i69 + "' != '" + 200+ "'", i69.equals(200));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long73 + "' != '" + 7L+ "'", long73.equals(7L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP74);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i75 + "' != '" + 16777216+ "'", i75.equals(16777216));

  }

  @Test
  public void test002() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test002"); }


    int i1 = java.lang.Integer.highestOneBit((-999872768));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == (-2147483648));

  }

  @Test
  public void test003() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test003"); }


    int i1 = java.lang.Integer.signum(704839691);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 1);

  }

  @Test
  public void test004() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test004"); }


    java.lang.String str1 = java.lang.Integer.toOctalString(128);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "200"+ "'", str1.equals("200"));

  }

  @Test
  public void test005() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test005"); }


    java.lang.Integer i1 = java.lang.Integer.valueOf(327045886);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 327045886+ "'", i1.equals(327045886));

  }

  @Test
  public void test006() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test006"); }


    int i2 = java.lang.Integer.rotateRight(40000007, (-419168256));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 40000007);

  }

  @Test
  public void test007() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test007"); }


    // The following exception was thrown during execution in test generation
    try {
      int i2 = java.lang.Integer.parseUnsignedInt("24114521402", 30116601);
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

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test008"); }


    int i1 = java.lang.Integer.reverseBytes(419409932);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 212926232);

  }

  @Test
  public void test009() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test009"); }


    tp2.IP iP4 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP4.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan8 = new tp2.IPBan(iP4, (java.lang.Long)100L);
    tp2.IP iP9 = iPBan8.ip;
    tp2.IP iP10 = iPBan8.ip;
    tp2.IP iP11 = iPBan8.getIp();
    tp2.IP iP12 = iPBan8.ip;
    java.lang.Long long13 = null;
    iPBan8.expires = long13;
    iPBan8.expires = 184549395L;
    tp2.IP iP21 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP21.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan25 = new tp2.IPBan(iP21, (java.lang.Long)100L);
    java.lang.Integer i26 = iP21.getFirst();
    java.lang.Integer i27 = iP21.getFourth();
    iP21.setFourth((java.lang.Integer)1010000);
    iPBan8.setIp(iP21);
    tp2.IPBan iPBan32 = new tp2.IPBan(iP21, (java.lang.Long)11001000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i26 + "' != '" + 200+ "'", i26.equals(200));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i27 + "' != '" + 100+ "'", i27.equals(100));

  }

  @Test
  public void test010() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test010"); }


    tp2.SinglyLinkedList singlyLinkedList0 = new tp2.SinglyLinkedList();
    int i1 = singlyLinkedList0.getSize();
    tp2.IP iP6 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i7 = iP6.getSecond();
    java.lang.Integer i8 = iP6.getFourth();
    singlyLinkedList0.add(iP6);
    tp2.IPBan iPBan11 = new tp2.IPBan(iP6, (java.lang.Long)100L);
    tp2.IP iP12 = iPBan11.getIp();
    tp2.IP iP13 = iPBan11.ip;
    tp2.SinglyLinkedList singlyLinkedList14 = new tp2.SinglyLinkedList();
    int i15 = singlyLinkedList14.getSize();
    tp2.IP iP20 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i21 = iP20.getSecond();
    java.lang.Integer i22 = iP20.getFourth();
    singlyLinkedList14.add(iP20);
    boolean b25 = iP20.equals((java.lang.Object)2147483647);
    tp2.IPBan iPBan27 = new tp2.IPBan(iP20, (java.lang.Long)(-1L));
    java.lang.Long long28 = iPBan27.expires;
    tp2.IP iP33 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP33.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan37 = new tp2.IPBan(iP33, (java.lang.Long)100L);
    tp2.IP iP38 = iPBan37.ip;
    iP38.setThird((java.lang.Integer)356246784);
    iPBan27.ip = iP38;
    java.lang.Integer i42 = iP38.getFirst();
    iP38.setFirst((java.lang.Integer)24);
    iPBan11.ip = iP38;
    tp2.IPBan iPBan47 = new tp2.IPBan(iP38, (java.lang.Long)3355443200L);
    java.lang.Integer i48 = iP38.getSecond();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i7 + "' != '" + (-1)+ "'", i7.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i8 + "' != '" + 100+ "'", i8.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i21 + "' != '" + (-1)+ "'", i21.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i22 + "' != '" + 100+ "'", i22.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long28 + "' != '" + (-1L)+ "'", long28.equals((-1L)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i42 + "' != '" + 200+ "'", i42.equals(200));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i48 + "' != '" + (-1)+ "'", i48.equals((-1)));

  }

  @Test
  public void test011() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test011"); }


    int i1 = java.lang.Integer.bitCount((-2147483621));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 5);

  }

  @Test
  public void test012() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test012"); }


    tp2.IP iP4 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP4.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan8 = new tp2.IPBan(iP4, (java.lang.Long)100L);
    tp2.IP iP13 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i14 = iP13.getSecond();
    java.lang.Integer i15 = iP13.getFourth();
    iP13.setFirst((java.lang.Integer)5);
    iPBan8.ip = iP13;
    java.lang.Long long19 = iPBan8.getExpires();
    iPBan8.expires = 2147483648L;
    tp2.IP iP26 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP26.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan30 = new tp2.IPBan(iP26, (java.lang.Long)100L);
    tp2.IP iP31 = iPBan30.ip;
    tp2.IP iP32 = iPBan30.getIp();
    java.lang.Integer i33 = null;
    iP32.setFirst(i33);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList35 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b36 = strictlySortedSinglyLinkedList35.repOK();
    tp2.IP iP41 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i42 = iP41.getSecond();
    iP41.setFirst((java.lang.Integer)11001000);
    iP41.setFirst((java.lang.Integer)(-2147483648));
    boolean b47 = strictlySortedSinglyLinkedList35.removeFromIP(iP41);
    boolean b48 = iP32.equals((java.lang.Object)strictlySortedSinglyLinkedList35);
    tp2.IP iP53 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP53.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan57 = new tp2.IPBan(iP53, (java.lang.Long)100L);
    boolean b58 = strictlySortedSinglyLinkedList35.removeFromIP(iP53);
    java.lang.Integer i59 = iP53.getFirst();
    iP53.setFirst((java.lang.Integer)0);
    iPBan8.setIp(iP53);
    tp2.IP iP63 = iPBan8.getIp();
    java.lang.Integer i64 = iP63.getFirst();
    tp2.IPBan iPBan66 = new tp2.IPBan(iP63, (java.lang.Long)3221225472L);
    iPBan66.setExpires((java.lang.Long)2610775L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i14 + "' != '" + (-1)+ "'", i14.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i15 + "' != '" + 100+ "'", i15.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long19 + "' != '" + 100L+ "'", long19.equals(100L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i42 + "' != '" + (-1)+ "'", i42.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b47 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b48 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b58 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i59 + "' != '" + 200+ "'", i59.equals(200));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP63);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i64 + "' != '" + 0+ "'", i64.equals(0));

  }

  @Test
  public void test013() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test013"); }


    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList0 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b1 = strictlySortedSinglyLinkedList0.repOK();
    tp2.IP iP6 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i7 = iP6.getSecond();
    iP6.setFirst((java.lang.Integer)11001000);
    iP6.setFirst((java.lang.Integer)(-2147483648));
    boolean b12 = strictlySortedSinglyLinkedList0.removeFromIP(iP6);
    tp2.IPBan iPBan14 = strictlySortedSinglyLinkedList0.get((-1));
    tp2.IPBan iPBan16 = strictlySortedSinglyLinkedList0.get(16);
    boolean b17 = strictlySortedSinglyLinkedList0.repOK();
    boolean b18 = strictlySortedSinglyLinkedList0.repOK();
    tp2.IP iP23 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i24 = iP23.getSecond();
    iP23.setFirst((java.lang.Integer)11001000);
    java.lang.Long long27 = null;
    tp2.IPBan iPBan28 = new tp2.IPBan(iP23, long27);
    tp2.IP iP29 = iPBan28.ip;
    iP29.setSecond((java.lang.Integer)(-671088639));
    boolean b32 = strictlySortedSinglyLinkedList0.containsIP(iP29);
    int i33 = strictlySortedSinglyLinkedList0.size;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i7 + "' != '" + (-1)+ "'", i7.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iPBan14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iPBan16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i24 + "' != '" + (-1)+ "'", i24.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 0);

  }

  @Test
  public void test014() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test014"); }


    java.lang.Integer i1 = java.lang.Integer.getInteger("10100101000000000000110000");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);

  }

  @Test
  public void test015() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test015"); }


    int i2 = java.lang.Integer.sum((-1860063392), 216);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == (-1860063176));

  }

  @Test
  public void test016() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test016"); }


    java.lang.String str1 = java.lang.Integer.toOctalString(6047546);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "27043472"+ "'", str1.equals("27043472"));

  }

  @Test
  public void test017() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test017"); }


    int i1 = java.lang.Integer.signum(199);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 1);

  }

  @Test
  public void test018() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test018"); }


    int i1 = java.lang.Integer.numberOfTrailingZeros((-28148205));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);

  }

  @Test
  public void test019() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test019"); }


    int i1 = java.lang.Integer.parseInt("156001");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 156001);

  }

  @Test
  public void test020() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test020"); }


    tp2.SinglyLinkedList singlyLinkedList0 = new tp2.SinglyLinkedList();
    boolean b1 = singlyLinkedList0.repOK();
    tp2.IP iP6 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP6.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan10 = new tp2.IPBan(iP6, (java.lang.Long)100L);
    tp2.IP iP15 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP15.setFirst((java.lang.Integer)200);
    java.lang.Integer i18 = iP15.getFourth();
    iPBan10.setIp(iP15);
    singlyLinkedList0.add(iP15);
    boolean b21 = singlyLinkedList0.isEmpty();
    tp2.IP iP23 = singlyLinkedList0.get(33554432);
    boolean b24 = singlyLinkedList0.repOK();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i18 + "' != '" + 100+ "'", i18.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == true);

  }

  @Test
  public void test021() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test021"); }


    long long1 = java.lang.Integer.toUnsignedLong(327155936);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == 327155936L);

  }

  @Test
  public void test022() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test022"); }


    int i2 = java.lang.Integer.remainderUnsigned(469762048, 759185408);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 469762048);

  }

  @Test
  public void test023() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test023"); }


    // The following exception was thrown during execution in test generation
    try {
      int i2 = java.lang.Integer.parseUnsignedInt("101010011101111100101000000", (-740996598));
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test024() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test024"); }


    java.lang.Integer i2 = java.lang.Integer.getInteger("413575145", (java.lang.Integer)837);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i2 + "' != '" + 837+ "'", i2.equals(837));

  }

  @Test
  public void test025() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test025"); }


    int i2 = java.lang.Integer.compare(469779399, (-1860047008));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);

  }

  @Test
  public void test026() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test026"); }


    java.lang.Integer i1 = new java.lang.Integer(54124537);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 54124537+ "'", i1.equals(54124537));

  }

  @Test
  public void test027() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test027"); }


    int i2 = java.lang.Integer.compare(20478, (-2147483621));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);

  }

  @Test
  public void test028() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test028"); }


    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList0 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b1 = strictlySortedSinglyLinkedList0.repOK();
    tp2.IP iP6 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i7 = iP6.getSecond();
    iP6.setFirst((java.lang.Integer)11001000);
    iP6.setFirst((java.lang.Integer)(-2147483648));
    boolean b12 = strictlySortedSinglyLinkedList0.removeFromIP(iP6);
    tp2.Node node13 = strictlySortedSinglyLinkedList0.header;
    tp2.IP iP14 = null;
    boolean b15 = strictlySortedSinglyLinkedList0.containsIP(iP14);
    boolean b16 = strictlySortedSinglyLinkedList0.repOK();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList17 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b18 = strictlySortedSinglyLinkedList17.repOK();
    tp2.IP iP23 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    boolean b24 = strictlySortedSinglyLinkedList17.containsIP(iP23);
    tp2.Node node25 = strictlySortedSinglyLinkedList17.header;
    boolean b26 = strictlySortedSinglyLinkedList17.isEmpty();
    int i27 = strictlySortedSinglyLinkedList17.getSize();
    tp2.SinglyLinkedList singlyLinkedList28 = new tp2.SinglyLinkedList();
    int i29 = singlyLinkedList28.getSize();
    tp2.IP iP34 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i35 = iP34.getSecond();
    java.lang.Integer i36 = iP34.getFourth();
    singlyLinkedList28.add(iP34);
    tp2.IPBan iPBan39 = new tp2.IPBan(iP34, (java.lang.Long)1L);
    boolean b40 = strictlySortedSinglyLinkedList17.contains(iPBan39);
    tp2.IP iP45 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP45.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan49 = new tp2.IPBan(iP45, (java.lang.Long)100L);
    tp2.IP iP50 = iPBan49.ip;
    tp2.SinglyLinkedList singlyLinkedList51 = new tp2.SinglyLinkedList();
    int i52 = singlyLinkedList51.getSize();
    tp2.IP iP57 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i58 = iP57.getSecond();
    java.lang.Integer i59 = iP57.getFourth();
    singlyLinkedList51.add(iP57);
    boolean b61 = iP50.equals((java.lang.Object)iP57);
    tp2.IPBan iPBan63 = new tp2.IPBan(iP50, (java.lang.Long)7L);
    boolean b64 = strictlySortedSinglyLinkedList17.contains(iPBan63);
    tp2.IP iP65 = iPBan63.ip;
    tp2.IP iP66 = iPBan63.getIp();
    tp2.IP iP71 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i72 = iP71.getSecond();
    iP71.setFirst((java.lang.Integer)11001000);
    iP71.setFirst((java.lang.Integer)(-2147483648));
    java.lang.Integer i77 = iP71.getThird();
    java.lang.Integer i78 = iP71.getFourth();
    java.lang.Integer i79 = iP71.getThird();
    iPBan63.setIp(iP71);
    java.lang.Long long81 = iPBan63.getExpires();
    boolean b82 = strictlySortedSinglyLinkedList0.contains(iPBan63);
    strictlySortedSinglyLinkedList0.size = (-268435456);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i7 + "' != '" + (-1)+ "'", i7.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i29 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i35 + "' != '" + (-1)+ "'", i35.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i36 + "' != '" + 100+ "'", i36.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i52 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i58 + "' != '" + (-1)+ "'", i58.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i59 + "' != '" + 100+ "'", i59.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b61 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b64 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP65);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP66);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i72 + "' != '" + (-1)+ "'", i72.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i77 + "' != '" + (-1)+ "'", i77.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i78 + "' != '" + 100+ "'", i78.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i79 + "' != '" + (-1)+ "'", i79.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long81 + "' != '" + 7L+ "'", long81.equals(7L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b82 == false);

  }

  @Test
  public void test029() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test029"); }


    // The following exception was thrown during execution in test generation
    try {
      int i2 = java.lang.Integer.parseUnsignedInt("4062551476", (-1635254016));
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test030() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test030"); }


    tp2.IP iP4 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i5 = iP4.getSecond();
    tp2.SinglyLinkedList singlyLinkedList6 = new tp2.SinglyLinkedList();
    boolean b7 = singlyLinkedList6.repOK();
    boolean b8 = iP4.equals((java.lang.Object)b7);
    tp2.IPBan iPBan10 = new tp2.IPBan(iP4, (java.lang.Long)100L);
    tp2.IP iP15 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i16 = iP15.getSecond();
    iP15.setFirst((java.lang.Integer)11001000);
    iP15.setFirst((java.lang.Integer)(-2147483648));
    iPBan10.ip = iP15;
    java.lang.Integer i22 = iP15.getFirst();
    tp2.SinglyLinkedList singlyLinkedList23 = new tp2.SinglyLinkedList();
    boolean b24 = singlyLinkedList23.repOK();
    int i25 = singlyLinkedList23.getSize();
    boolean b26 = singlyLinkedList23.isEmpty();
    int i27 = singlyLinkedList23.getSize();
    tp2.SinglyLinkedList singlyLinkedList28 = new tp2.SinglyLinkedList();
    boolean b29 = singlyLinkedList28.repOK();
    tp2.IP iP31 = singlyLinkedList28.get(200);
    boolean b32 = singlyLinkedList28.isEmpty();
    tp2.IP iP37 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i38 = iP37.getThird();
    boolean b39 = singlyLinkedList28.remove(iP37);
    tp2.IP iP44 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP44.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan48 = new tp2.IPBan(iP44, (java.lang.Long)100L);
    tp2.IP iP49 = iPBan48.ip;
    tp2.IP iP50 = iPBan48.getIp();
    java.lang.Integer i51 = null;
    iP50.setFirst(i51);
    boolean b53 = singlyLinkedList28.contains(iP50);
    boolean b54 = singlyLinkedList23.remove(iP50);
    boolean b55 = iP15.equals((java.lang.Object)singlyLinkedList23);
    iP15.setFirst((java.lang.Integer)101101102);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i5 + "' != '" + (-1)+ "'", i5.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i16 + "' != '" + (-1)+ "'", i16.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i22 + "' != '" + (-2147483648)+ "'", i22.equals((-2147483648)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i38 + "' != '" + (-1)+ "'", i38.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b53 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b54 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b55 == false);

  }

  @Test
  public void test031() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test031"); }


    java.lang.Integer i2 = java.lang.Integer.getInteger("10110111000111110000000000000001", 58);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i2 + "' != '" + 58+ "'", i2.equals(58));

  }

  @Test
  public void test032() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test032"); }


    int i2 = java.lang.Integer.rotateRight(32547700, 1024);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 32547700);

  }

  @Test
  public void test033() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test033"); }


    java.lang.String str1 = java.lang.Integer.toHexString(17034372);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "103ec84"+ "'", str1.equals("103ec84"));

  }

  @Test
  public void test034() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test034"); }


    int i2 = java.lang.Integer.compare(332601, 473);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);

  }

  @Test
  public void test035() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test035"); }


    // The following exception was thrown during execution in test generation
    try {
      int i1 = java.lang.Integer.parseInt("a1ef76");
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

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test036"); }


    tp2.SinglyLinkedList singlyLinkedList0 = new tp2.SinglyLinkedList();
    int i1 = singlyLinkedList0.getSize();
    tp2.IP iP6 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i7 = iP6.getSecond();
    java.lang.Integer i8 = iP6.getFourth();
    singlyLinkedList0.add(iP6);
    tp2.IP iP11 = singlyLinkedList0.get(5);
    boolean b12 = singlyLinkedList0.repOK();
    tp2.IP iP14 = singlyLinkedList0.get(2013265920);
    boolean b15 = singlyLinkedList0.isEmpty();
    boolean b16 = singlyLinkedList0.isEmpty();
    int i17 = singlyLinkedList0.getSize();
    int i18 = singlyLinkedList0.getSize();
    tp2.SinglyLinkedList singlyLinkedList19 = new tp2.SinglyLinkedList();
    int i20 = singlyLinkedList19.getSize();
    int i21 = singlyLinkedList19.getSize();
    tp2.IP iP22 = null;
    boolean b23 = singlyLinkedList19.contains(iP22);
    tp2.IP iP25 = singlyLinkedList19.get(27);
    tp2.IP iP30 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP30.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan34 = new tp2.IPBan(iP30, (java.lang.Long)100L);
    tp2.IP iP35 = iPBan34.ip;
    tp2.IP iP40 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP40.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan44 = new tp2.IPBan(iP40, (java.lang.Long)100L);
    iPBan34.setIp(iP40);
    boolean b46 = singlyLinkedList19.remove(iP40);
    boolean b47 = singlyLinkedList19.repOK();
    boolean b48 = singlyLinkedList19.repOK();
    boolean b49 = singlyLinkedList19.repOK();
    tp2.IP iP51 = singlyLinkedList19.get(81);
    tp2.SinglyLinkedList singlyLinkedList52 = new tp2.SinglyLinkedList();
    boolean b53 = singlyLinkedList52.repOK();
    tp2.IP iP55 = singlyLinkedList52.get(200);
    boolean b56 = singlyLinkedList52.repOK();
    tp2.IP iP61 = new tp2.IP((java.lang.Integer)20, (java.lang.Integer)2, (java.lang.Integer)31, (java.lang.Integer)5);
    boolean b62 = singlyLinkedList52.contains(iP61);
    java.lang.Integer i63 = iP61.getSecond();
    boolean b64 = singlyLinkedList19.remove(iP61);
    boolean b65 = singlyLinkedList0.remove(iP61);
    boolean b66 = singlyLinkedList0.repOK();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i7 + "' != '" + (-1)+ "'", i7.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i8 + "' != '" + 100+ "'", i8.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b46 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b47 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b48 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b49 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b53 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP55);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b56 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b62 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i63 + "' != '" + 2+ "'", i63.equals(2));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b64 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b65 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b66 == true);

  }

  @Test
  public void test037() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test037"); }


    java.lang.Integer i1 = new java.lang.Integer("2017330930");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 2017330930+ "'", i1.equals(2017330930));

  }

  @Test
  public void test038() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test038"); }


    java.lang.Integer i2 = java.lang.Integer.getInteger("133", (-157598664));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i2 + "' != '" + (-157598664)+ "'", i2.equals((-157598664)));

  }

  @Test
  public void test039() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test039"); }


    java.lang.String str1 = java.lang.Integer.toUnsignedString((-1342177280));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "2952790016"+ "'", str1.equals("2952790016"));

  }

  @Test
  public void test040() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test040"); }


    tp2.SinglyLinkedList singlyLinkedList0 = new tp2.SinglyLinkedList();
    int i1 = singlyLinkedList0.getSize();
    int i2 = singlyLinkedList0.getSize();
    tp2.IP iP3 = null;
    boolean b4 = singlyLinkedList0.contains(iP3);
    tp2.IP iP6 = singlyLinkedList0.get(27);
    tp2.IP iP11 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i12 = iP11.getSecond();
    iP11.setFirst((java.lang.Integer)11001000);
    java.lang.Long long15 = null;
    tp2.IPBan iPBan16 = new tp2.IPBan(iP11, long15);
    tp2.IP iP17 = iPBan16.ip;
    tp2.IP iP18 = iPBan16.ip;
    java.lang.Integer i19 = iP18.getFourth();
    boolean b20 = singlyLinkedList0.remove(iP18);
    boolean b21 = singlyLinkedList0.isEmpty();
    tp2.IP iP26 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP26.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan30 = new tp2.IPBan(iP26, (java.lang.Long)100L);
    tp2.IP iP31 = iPBan30.ip;
    tp2.IP iP32 = iPBan30.getIp();
    java.lang.Integer i33 = null;
    iP32.setFirst(i33);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList35 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b36 = strictlySortedSinglyLinkedList35.repOK();
    tp2.IP iP41 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i42 = iP41.getSecond();
    iP41.setFirst((java.lang.Integer)11001000);
    iP41.setFirst((java.lang.Integer)(-2147483648));
    boolean b47 = strictlySortedSinglyLinkedList35.removeFromIP(iP41);
    boolean b48 = iP32.equals((java.lang.Object)strictlySortedSinglyLinkedList35);
    tp2.IP iP53 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP53.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan57 = new tp2.IPBan(iP53, (java.lang.Long)100L);
    boolean b58 = strictlySortedSinglyLinkedList35.removeFromIP(iP53);
    java.lang.Integer i59 = iP53.getFirst();
    java.lang.Integer i60 = iP53.getFirst();
    iP53.setFourth((java.lang.Integer)10);
    boolean b63 = singlyLinkedList0.contains(iP53);
    java.lang.Integer i64 = iP53.getFirst();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i12 + "' != '" + (-1)+ "'", i12.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i19 + "' != '" + 100+ "'", i19.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i42 + "' != '" + (-1)+ "'", i42.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b47 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b48 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b58 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i59 + "' != '" + 200+ "'", i59.equals(200));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i60 + "' != '" + 200+ "'", i60.equals(200));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b63 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i64 + "' != '" + 200+ "'", i64.equals(200));

  }

  @Test
  public void test041() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test041"); }


    java.lang.String str2 = java.lang.Integer.toUnsignedString(24117248, 176185390);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "24117248"+ "'", str2.equals("24117248"));

  }

  @Test
  public void test042() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test042"); }


    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList0 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.SinglyLinkedList singlyLinkedList1 = new tp2.SinglyLinkedList();
    int i2 = singlyLinkedList1.getSize();
    tp2.IP iP7 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i8 = iP7.getSecond();
    java.lang.Integer i9 = iP7.getFourth();
    singlyLinkedList1.add(iP7);
    tp2.IP iP12 = singlyLinkedList1.get(5);
    boolean b13 = singlyLinkedList1.repOK();
    tp2.IP iP15 = singlyLinkedList1.get(2013265920);
    tp2.SinglyLinkedList singlyLinkedList16 = new tp2.SinglyLinkedList();
    int i17 = singlyLinkedList16.getSize();
    tp2.IP iP22 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i23 = iP22.getSecond();
    java.lang.Integer i24 = iP22.getFourth();
    singlyLinkedList16.add(iP22);
    iP22.setFourth((java.lang.Integer)167772160);
    singlyLinkedList1.add(iP22);
    java.lang.Object obj29 = null;
    boolean b30 = iP22.equals(obj29);
    iP22.setSecond((java.lang.Integer)20);
    tp2.IPBan iPBan34 = new tp2.IPBan(iP22, (java.lang.Long)20L);
    java.lang.Integer i35 = iP22.getFirst();
    boolean b36 = strictlySortedSinglyLinkedList0.removeFromIP(iP22);
    tp2.Node node37 = strictlySortedSinglyLinkedList0.header;
    tp2.IPBan iPBan39 = strictlySortedSinglyLinkedList0.get(163840);
    boolean b40 = strictlySortedSinglyLinkedList0.repOK();
    strictlySortedSinglyLinkedList0.size = 1027604483;
    tp2.SinglyLinkedList singlyLinkedList43 = new tp2.SinglyLinkedList();
    boolean b44 = singlyLinkedList43.repOK();
    tp2.IP iP46 = singlyLinkedList43.get(200);
    boolean b47 = singlyLinkedList43.isEmpty();
    tp2.IP iP52 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i53 = iP52.getThird();
    boolean b54 = singlyLinkedList43.remove(iP52);
    tp2.IP iP59 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP59.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan63 = new tp2.IPBan(iP59, (java.lang.Long)100L);
    tp2.IP iP64 = iPBan63.ip;
    tp2.IP iP65 = iPBan63.getIp();
    java.lang.Integer i66 = null;
    iP65.setFirst(i66);
    boolean b68 = singlyLinkedList43.contains(iP65);
    tp2.IP iP70 = singlyLinkedList43.get((-2147483641));
    int i71 = singlyLinkedList43.getSize();
    tp2.SinglyLinkedList singlyLinkedList72 = new tp2.SinglyLinkedList();
    int i73 = singlyLinkedList72.getSize();
    tp2.IP iP78 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i79 = iP78.getSecond();
    java.lang.Integer i80 = iP78.getFourth();
    singlyLinkedList72.add(iP78);
    tp2.IPBan iPBan83 = new tp2.IPBan(iP78, (java.lang.Long)1L);
    java.lang.Integer i84 = iP78.getThird();
    iP78.setFourth((java.lang.Integer)160);
    java.lang.Integer i87 = iP78.getSecond();
    singlyLinkedList43.add(iP78);
    java.lang.Integer i89 = null;
    iP78.setFourth(i89);
    boolean b91 = strictlySortedSinglyLinkedList0.removeFromIP(iP78);
    java.lang.Integer i92 = iP78.getFourth();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i8 + "' != '" + (-1)+ "'", i8.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 100+ "'", i9.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i23 + "' != '" + (-1)+ "'", i23.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i24 + "' != '" + 100+ "'", i24.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i35 + "' != '" + (-1)+ "'", i35.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iPBan39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b47 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i53 + "' != '" + (-1)+ "'", i53.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b54 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP64);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP65);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b68 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP70);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i71 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i73 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i79 + "' != '" + (-1)+ "'", i79.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i80 + "' != '" + 100+ "'", i80.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i84 + "' != '" + (-1)+ "'", i84.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i87 + "' != '" + (-1)+ "'", i87.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b91 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i92);

  }

  @Test
  public void test043() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test043"); }


    int i2 = java.lang.Integer.remainderUnsigned(1426986255, 928);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 655);

  }

  @Test
  public void test044() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test044"); }


    java.lang.Integer i2 = java.lang.Integer.getInteger("42226651", 544);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i2 + "' != '" + 544+ "'", i2.equals(544));

  }

  @Test
  public void test045() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test045"); }


    int i1 = java.lang.Integer.signum(1453238864);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 1);

  }

  @Test
  public void test046() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test046"); }


    // The following exception was thrown during execution in test generation
    try {
      int i2 = java.lang.Integer.parseInt("db0100", 0);
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test047() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test047"); }


    // The following exception was thrown during execution in test generation
    try {
      java.lang.Integer i2 = java.lang.Integer.valueOf("", 2110423050);
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test048() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test048"); }


    java.lang.Integer i2 = java.lang.Integer.getInteger("967870ef", 205521714);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i2 + "' != '" + 205521714+ "'", i2.equals(205521714));

  }

  @Test
  public void test049() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test049"); }


    tp2.SinglyLinkedList singlyLinkedList0 = new tp2.SinglyLinkedList();
    int i1 = singlyLinkedList0.getSize();
    tp2.IP iP6 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i7 = iP6.getSecond();
    java.lang.Integer i8 = iP6.getFourth();
    singlyLinkedList0.add(iP6);
    tp2.IP iP11 = singlyLinkedList0.get(5);
    boolean b12 = singlyLinkedList0.repOK();
    tp2.IP iP14 = singlyLinkedList0.get(2013265920);
    tp2.SinglyLinkedList singlyLinkedList15 = new tp2.SinglyLinkedList();
    int i16 = singlyLinkedList15.getSize();
    tp2.IP iP21 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i22 = iP21.getSecond();
    java.lang.Integer i23 = iP21.getFourth();
    singlyLinkedList15.add(iP21);
    iP21.setFourth((java.lang.Integer)167772160);
    singlyLinkedList0.add(iP21);
    tp2.SinglyLinkedList singlyLinkedList28 = new tp2.SinglyLinkedList();
    boolean b29 = singlyLinkedList28.repOK();
    tp2.IP iP31 = singlyLinkedList28.get(200);
    boolean b32 = singlyLinkedList28.isEmpty();
    boolean b33 = singlyLinkedList28.repOK();
    tp2.SinglyLinkedList singlyLinkedList34 = new tp2.SinglyLinkedList();
    int i35 = singlyLinkedList34.getSize();
    tp2.IP iP40 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i41 = iP40.getSecond();
    java.lang.Integer i42 = iP40.getFourth();
    singlyLinkedList34.add(iP40);
    iP40.setFourth((java.lang.Integer)167772160);
    boolean b46 = singlyLinkedList28.contains(iP40);
    singlyLinkedList0.add(iP40);
    boolean b48 = singlyLinkedList0.repOK();
    tp2.SinglyLinkedList singlyLinkedList49 = new tp2.SinglyLinkedList();
    int i50 = singlyLinkedList49.getSize();
    tp2.IP iP55 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i56 = iP55.getSecond();
    java.lang.Integer i57 = iP55.getFourth();
    singlyLinkedList49.add(iP55);
    tp2.IP iP60 = singlyLinkedList49.get(5);
    boolean b61 = singlyLinkedList49.repOK();
    tp2.IP iP63 = singlyLinkedList49.get(2013265920);
    tp2.SinglyLinkedList singlyLinkedList64 = new tp2.SinglyLinkedList();
    int i65 = singlyLinkedList64.getSize();
    tp2.IP iP70 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i71 = iP70.getSecond();
    java.lang.Integer i72 = iP70.getFourth();
    singlyLinkedList64.add(iP70);
    iP70.setFourth((java.lang.Integer)167772160);
    singlyLinkedList49.add(iP70);
    java.lang.Object obj77 = null;
    boolean b78 = iP70.equals(obj77);
    iP70.setSecond((java.lang.Integer)20);
    tp2.IPBan iPBan82 = new tp2.IPBan(iP70, (java.lang.Long)20L);
    java.lang.Integer i83 = iP70.getFirst();
    java.lang.Integer i84 = iP70.getSecond();
    iP70.setSecond((java.lang.Integer)1610612736);
    boolean b87 = singlyLinkedList0.contains(iP70);
    boolean b88 = singlyLinkedList0.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i7 + "' != '" + (-1)+ "'", i7.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i8 + "' != '" + 100+ "'", i8.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i22 + "' != '" + (-1)+ "'", i22.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i23 + "' != '" + 100+ "'", i23.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i35 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i41 + "' != '" + (-1)+ "'", i41.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i42 + "' != '" + 100+ "'", i42.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b46 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b48 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i50 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i56 + "' != '" + (-1)+ "'", i56.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i57 + "' != '" + 100+ "'", i57.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP60);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b61 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP63);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i65 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i71 + "' != '" + (-1)+ "'", i71.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i72 + "' != '" + 100+ "'", i72.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b78 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i83 + "' != '" + (-1)+ "'", i83.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i84 + "' != '" + 20+ "'", i84.equals(20));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b87 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b88 == false);

  }

  @Test
  public void test050() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test050"); }


    int i2 = java.lang.Integer.divideUnsigned(805307104, 303104);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 2656);

  }

  @Test
  public void test051() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test051"); }


    java.lang.String str1 = java.lang.Integer.toUnsignedString(64);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "64"+ "'", str1.equals("64"));

  }

  @Test
  public void test052() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test052"); }


    tp2.SinglyLinkedList singlyLinkedList0 = new tp2.SinglyLinkedList();
    boolean b1 = singlyLinkedList0.repOK();
    tp2.IP iP6 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP6.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan10 = new tp2.IPBan(iP6, (java.lang.Long)100L);
    iP6.setFourth((java.lang.Integer)32);
    singlyLinkedList0.add(iP6);
    boolean b14 = singlyLinkedList0.repOK();
    tp2.SinglyLinkedList singlyLinkedList15 = new tp2.SinglyLinkedList();
    int i16 = singlyLinkedList15.getSize();
    int i17 = singlyLinkedList15.getSize();
    tp2.IP iP18 = null;
    boolean b19 = singlyLinkedList15.contains(iP18);
    tp2.IP iP21 = singlyLinkedList15.get(27);
    tp2.IP iP26 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP26.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan30 = new tp2.IPBan(iP26, (java.lang.Long)100L);
    tp2.IP iP31 = iPBan30.ip;
    tp2.IP iP36 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP36.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan40 = new tp2.IPBan(iP36, (java.lang.Long)100L);
    iPBan30.setIp(iP36);
    boolean b42 = singlyLinkedList15.remove(iP36);
    tp2.IP iP44 = singlyLinkedList15.get(4);
    boolean b45 = singlyLinkedList15.repOK();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList46 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b47 = strictlySortedSinglyLinkedList46.repOK();
    tp2.IP iP52 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i53 = iP52.getSecond();
    iP52.setFirst((java.lang.Integer)11001000);
    iP52.setFirst((java.lang.Integer)(-2147483648));
    boolean b58 = strictlySortedSinglyLinkedList46.removeFromIP(iP52);
    tp2.IPBan iPBan60 = strictlySortedSinglyLinkedList46.get((-1));
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList61 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b62 = strictlySortedSinglyLinkedList61.repOK();
    tp2.IP iP67 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i68 = iP67.getSecond();
    iP67.setFirst((java.lang.Integer)11001000);
    iP67.setFirst((java.lang.Integer)(-2147483648));
    boolean b73 = strictlySortedSinglyLinkedList61.removeFromIP(iP67);
    boolean b74 = strictlySortedSinglyLinkedList46.removeFromIP(iP67);
    boolean b75 = singlyLinkedList15.remove(iP67);
    iP67.setThird((java.lang.Integer)(-671088640));
    java.lang.Integer i78 = iP67.getFirst();
    boolean b79 = singlyLinkedList0.remove(iP67);
    int i80 = singlyLinkedList0.getSize();
    int i81 = singlyLinkedList0.getSize();
    boolean b82 = singlyLinkedList0.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b47 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i53 + "' != '" + (-1)+ "'", i53.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b58 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iPBan60);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b62 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i68 + "' != '" + (-1)+ "'", i68.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b73 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b74 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b75 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i78 + "' != '" + (-2147483648)+ "'", i78.equals((-2147483648)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b79 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i80 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i81 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b82 == false);

  }

  @Test
  public void test053() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test053"); }


    long long1 = java.lang.Integer.toUnsignedLong(110000001);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == 110000001L);

  }

  @Test
  public void test054() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test054"); }


    int i1 = java.lang.Integer.numberOfLeadingZeros(109883877);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 5);

  }

  @Test
  public void test055() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test055"); }


    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList0 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b1 = strictlySortedSinglyLinkedList0.repOK();
    tp2.IP iP6 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i7 = iP6.getSecond();
    iP6.setFirst((java.lang.Integer)11001000);
    iP6.setFirst((java.lang.Integer)(-2147483648));
    boolean b12 = strictlySortedSinglyLinkedList0.removeFromIP(iP6);
    tp2.IPBan iPBan13 = null;
    boolean b14 = strictlySortedSinglyLinkedList0.add(iPBan13);
    tp2.IPBan iPBan16 = strictlySortedSinglyLinkedList0.get(16384);
    strictlySortedSinglyLinkedList0.size = 7;
    int i19 = strictlySortedSinglyLinkedList0.getSize();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList20 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b21 = strictlySortedSinglyLinkedList20.repOK();
    boolean b22 = strictlySortedSinglyLinkedList20.repOK();
    tp2.IPBan iPBan23 = null;
    boolean b24 = strictlySortedSinglyLinkedList20.contains(iPBan23);
    tp2.IP iP29 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP29.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan33 = new tp2.IPBan(iP29, (java.lang.Long)100L);
    tp2.IP iP34 = iPBan33.ip;
    tp2.IP iP39 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP39.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan43 = new tp2.IPBan(iP39, (java.lang.Long)100L);
    iPBan33.setIp(iP39);
    java.lang.Long long45 = iPBan33.getExpires();
    tp2.IP iP46 = iPBan33.ip;
    iP46.setSecond((java.lang.Integer)11001000);
    boolean b49 = strictlySortedSinglyLinkedList20.containsIP(iP46);
    tp2.IPBan iPBan50 = null;
    boolean b51 = strictlySortedSinglyLinkedList20.add(iPBan50);
    tp2.Node node52 = strictlySortedSinglyLinkedList20.header;
    strictlySortedSinglyLinkedList0.header = node52;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i7 + "' != '" + (-1)+ "'", i7.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iPBan16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long45 + "' != '" + 100L+ "'", long45.equals(100L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b49 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b51 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node52);

  }

  @Test
  public void test056() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test056"); }


    java.lang.String str2 = java.lang.Integer.toUnsignedString(30, (-1919531456));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "30"+ "'", str2.equals("30"));

  }

  @Test
  public void test057() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test057"); }


    java.lang.Integer i1 = new java.lang.Integer(2097152);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 2097152+ "'", i1.equals(2097152));

  }

  @Test
  public void test058() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test058"); }


    java.lang.Integer i1 = java.lang.Integer.valueOf("45842");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 45842+ "'", i1.equals(45842));

  }

  @Test
  public void test059() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test059"); }


    int i2 = java.lang.Integer.max(16160000, 26000010);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 26000010);

  }

  @Test
  public void test060() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test060"); }


    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList0 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b1 = strictlySortedSinglyLinkedList0.repOK();
    tp2.IP iP6 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    boolean b7 = strictlySortedSinglyLinkedList0.containsIP(iP6);
    tp2.Node node8 = strictlySortedSinglyLinkedList0.header;
    boolean b9 = strictlySortedSinglyLinkedList0.isEmpty();
    tp2.IPBan iPBan11 = strictlySortedSinglyLinkedList0.get(3);
    strictlySortedSinglyLinkedList0.size = 200;
    tp2.IPBan iPBan15 = strictlySortedSinglyLinkedList0.get(1610612736);
    boolean b16 = strictlySortedSinglyLinkedList0.repOK();
    int i17 = strictlySortedSinglyLinkedList0.size;
    boolean b18 = strictlySortedSinglyLinkedList0.repOK();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iPBan11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iPBan15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 200);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);

  }

  @Test
  public void test061() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test061"); }


    // The following exception was thrown during execution in test generation
    try {
      int i2 = java.lang.Integer.parseInt("640", 889323525);
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

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test062"); }


    java.lang.Integer i1 = java.lang.Integer.valueOf(12648201);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 12648201+ "'", i1.equals(12648201));

  }

  @Test
  public void test063() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test063"); }


    int i2 = java.lang.Integer.rotateRight((-469696512), 1048576);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == (-469696512));

  }

  @Test
  public void test064() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test064"); }


    int i1 = java.lang.Integer.reverseBytes(498);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == (-234815488));

  }

  @Test
  public void test065() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test065"); }


    tp2.SinglyLinkedList singlyLinkedList0 = new tp2.SinglyLinkedList();
    boolean b1 = singlyLinkedList0.repOK();
    tp2.IP iP3 = singlyLinkedList0.get(200);
    boolean b4 = singlyLinkedList0.isEmpty();
    tp2.IP iP9 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i10 = iP9.getThird();
    boolean b11 = singlyLinkedList0.remove(iP9);
    tp2.IP iP16 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP16.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan20 = new tp2.IPBan(iP16, (java.lang.Long)100L);
    tp2.IP iP21 = iPBan20.ip;
    tp2.IP iP22 = iPBan20.getIp();
    java.lang.Integer i23 = null;
    iP22.setFirst(i23);
    boolean b25 = singlyLinkedList0.contains(iP22);
    int i26 = singlyLinkedList0.getSize();
    tp2.IP iP28 = singlyLinkedList0.get(128);
    boolean b29 = singlyLinkedList0.repOK();
    boolean b30 = singlyLinkedList0.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i10 + "' != '" + (-1)+ "'", i10.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == true);

  }

  @Test
  public void test066() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test066"); }


    int i1 = java.lang.Integer.lowestOneBit(40004017);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 1);

  }

  @Test
  public void test067() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test067"); }


    tp2.SinglyLinkedList singlyLinkedList0 = new tp2.SinglyLinkedList();
    boolean b1 = singlyLinkedList0.repOK();
    tp2.IP iP6 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP6.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan10 = new tp2.IPBan(iP6, (java.lang.Long)100L);
    tp2.IP iP15 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP15.setFirst((java.lang.Integer)200);
    java.lang.Integer i18 = iP15.getFourth();
    iPBan10.setIp(iP15);
    singlyLinkedList0.add(iP15);
    tp2.IPBan iPBan22 = new tp2.IPBan(iP15, (java.lang.Long)5L);
    java.lang.Long long23 = iPBan22.expires;
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList24 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b25 = strictlySortedSinglyLinkedList24.repOK();
    strictlySortedSinglyLinkedList24.size = 1;
    strictlySortedSinglyLinkedList24.size = 0;
    tp2.IP iP34 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i35 = iP34.getSecond();
    java.lang.Integer i36 = iP34.getFourth();
    boolean b37 = strictlySortedSinglyLinkedList24.containsIP(iP34);
    tp2.Node node38 = strictlySortedSinglyLinkedList24.header;
    tp2.IP iP43 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i44 = iP43.getSecond();
    iP43.setFirst((java.lang.Integer)11001000);
    java.lang.Long long47 = null;
    tp2.IPBan iPBan48 = new tp2.IPBan(iP43, long47);
    boolean b49 = strictlySortedSinglyLinkedList24.containsIP(iP43);
    iPBan22.setIp(iP43);
    tp2.IP iP55 = new tp2.IP((java.lang.Integer)356246784, (java.lang.Integer)162, (java.lang.Integer)3, (java.lang.Integer)200);
    iPBan22.ip = iP55;
    java.lang.Integer i57 = iP55.getThird();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i18 + "' != '" + 100+ "'", i18.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long23 + "' != '" + 5L+ "'", long23.equals(5L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i35 + "' != '" + (-1)+ "'", i35.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i36 + "' != '" + 100+ "'", i36.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i44 + "' != '" + (-1)+ "'", i44.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b49 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i57 + "' != '" + 3+ "'", i57.equals(3));

  }

  @Test
  public void test068() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test068"); }


    int i2 = java.lang.Integer.rotateLeft(402653440, (-449112832));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 402653440);

  }

  @Test
  public void test069() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test069"); }


    int i1 = java.lang.Integer.highestOneBit(94);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 64);

  }

  @Test
  public void test070() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test070"); }


    int i2 = java.lang.Integer.sum(1073742275, (-383272663));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 690469612);

  }

  @Test
  public void test071() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test071"); }


    // The following exception was thrown during execution in test generation
    try {
      int i2 = java.lang.Integer.parseUnsignedInt("", 84935131);
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

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test072"); }


    java.lang.Integer i1 = java.lang.Integer.getInteger("1001101010101010101010101");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);

  }

  @Test
  public void test073() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test073"); }


    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList0 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b1 = strictlySortedSinglyLinkedList0.repOK();
    tp2.IP iP6 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    boolean b7 = strictlySortedSinglyLinkedList0.containsIP(iP6);
    tp2.Node node8 = strictlySortedSinglyLinkedList0.header;
    strictlySortedSinglyLinkedList0.size = 11001000;
    tp2.IPBan iPBan12 = strictlySortedSinglyLinkedList0.get(3);
    int i13 = strictlySortedSinglyLinkedList0.getSize();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList14 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b15 = strictlySortedSinglyLinkedList14.repOK();
    boolean b16 = strictlySortedSinglyLinkedList14.repOK();
    int i17 = strictlySortedSinglyLinkedList14.getSize();
    tp2.Node node18 = strictlySortedSinglyLinkedList14.header;
    strictlySortedSinglyLinkedList0.header = node18;
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList20 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b21 = strictlySortedSinglyLinkedList20.repOK();
    tp2.IP iP26 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i27 = iP26.getSecond();
    iP26.setFirst((java.lang.Integer)11001000);
    iP26.setFirst((java.lang.Integer)(-2147483648));
    boolean b32 = strictlySortedSinglyLinkedList20.removeFromIP(iP26);
    tp2.Node node33 = strictlySortedSinglyLinkedList20.header;
    strictlySortedSinglyLinkedList20.size = (-1);
    tp2.Node node36 = strictlySortedSinglyLinkedList20.header;
    strictlySortedSinglyLinkedList0.header = node36;
    int i38 = strictlySortedSinglyLinkedList0.getSize();
    boolean b39 = strictlySortedSinglyLinkedList0.repOK();
    int i40 = strictlySortedSinglyLinkedList0.size;
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList41 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b42 = strictlySortedSinglyLinkedList41.repOK();
    strictlySortedSinglyLinkedList41.size = 1;
    boolean b45 = strictlySortedSinglyLinkedList41.isEmpty();
    tp2.SinglyLinkedList singlyLinkedList46 = new tp2.SinglyLinkedList();
    int i47 = singlyLinkedList46.getSize();
    tp2.IP iP52 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i53 = iP52.getSecond();
    java.lang.Integer i54 = iP52.getFourth();
    singlyLinkedList46.add(iP52);
    boolean b57 = iP52.equals((java.lang.Object)2147483647);
    tp2.IPBan iPBan59 = new tp2.IPBan(iP52, (java.lang.Long)(-1L));
    java.lang.Long long60 = iPBan59.expires;
    boolean b61 = strictlySortedSinglyLinkedList41.contains(iPBan59);
    tp2.IP iP62 = iPBan59.ip;
    java.lang.Object obj63 = null;
    boolean b64 = iP62.equals(obj63);
    tp2.IPBan iPBan66 = new tp2.IPBan(iP62, (java.lang.Long)32L);
    boolean b67 = strictlySortedSinglyLinkedList0.add(iPBan66);
    tp2.IPBan iPBan69 = strictlySortedSinglyLinkedList0.get(40960);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iPBan12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 11001000);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i27 + "' != '" + (-1)+ "'", i27.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i38 == 11001000);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i40 == 11001000);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i47 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i53 + "' != '" + (-1)+ "'", i53.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i54 + "' != '" + 100+ "'", i54.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b57 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long60 + "' != '" + (-1L)+ "'", long60.equals((-1L)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b61 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP62);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b64 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b67 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iPBan69);

  }

  @Test
  public void test074() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test074"); }


    int i1 = java.lang.Integer.lowestOneBit((-2013265920));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 134217728);

  }

  @Test
  public void test075() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test075"); }


    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList0 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b1 = strictlySortedSinglyLinkedList0.repOK();
    tp2.IP iP6 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i7 = iP6.getSecond();
    iP6.setFirst((java.lang.Integer)11001000);
    iP6.setFirst((java.lang.Integer)(-2147483648));
    boolean b12 = strictlySortedSinglyLinkedList0.removeFromIP(iP6);
    tp2.Node node13 = strictlySortedSinglyLinkedList0.header;
    boolean b14 = strictlySortedSinglyLinkedList0.isEmpty();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList15 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b16 = strictlySortedSinglyLinkedList15.repOK();
    tp2.IP iP21 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    boolean b22 = strictlySortedSinglyLinkedList15.containsIP(iP21);
    tp2.Node node23 = strictlySortedSinglyLinkedList15.header;
    boolean b24 = strictlySortedSinglyLinkedList15.isEmpty();
    int i25 = strictlySortedSinglyLinkedList15.getSize();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList26 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b27 = strictlySortedSinglyLinkedList26.repOK();
    tp2.IP iP32 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i33 = iP32.getSecond();
    iP32.setFirst((java.lang.Integer)11001000);
    iP32.setFirst((java.lang.Integer)(-2147483648));
    boolean b38 = strictlySortedSinglyLinkedList26.removeFromIP(iP32);
    tp2.Node node39 = strictlySortedSinglyLinkedList26.header;
    strictlySortedSinglyLinkedList15.header = node39;
    strictlySortedSinglyLinkedList0.header = node39;
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList42 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b43 = strictlySortedSinglyLinkedList42.repOK();
    tp2.IP iP48 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i49 = iP48.getSecond();
    iP48.setFirst((java.lang.Integer)11001000);
    iP48.setFirst((java.lang.Integer)(-2147483648));
    boolean b54 = strictlySortedSinglyLinkedList42.removeFromIP(iP48);
    tp2.IPBan iPBan55 = null;
    boolean b56 = strictlySortedSinglyLinkedList42.add(iPBan55);
    tp2.Node node57 = strictlySortedSinglyLinkedList42.header;
    tp2.Node node58 = strictlySortedSinglyLinkedList42.header;
    strictlySortedSinglyLinkedList0.header = node58;
    tp2.IPBan iPBan61 = strictlySortedSinglyLinkedList0.get(24);
    boolean b62 = strictlySortedSinglyLinkedList0.repOK();
    int i63 = strictlySortedSinglyLinkedList0.getSize();
    boolean b64 = strictlySortedSinglyLinkedList0.repOK();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i7 + "' != '" + (-1)+ "'", i7.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i33 + "' != '" + (-1)+ "'", i33.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b43 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i49 + "' != '" + (-1)+ "'", i49.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b54 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b56 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node58);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iPBan61);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b62 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i63 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b64 == false);

  }

  @Test
  public void test076() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test076"); }


    java.lang.Integer i1 = new java.lang.Integer(332601);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 332601+ "'", i1.equals(332601));

  }

  @Test
  public void test077() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test077"); }


    int i1 = java.lang.Integer.reverse(672800);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 69357568);

  }

  @Test
  public void test078() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test078"); }


    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList0 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList1 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b2 = strictlySortedSinglyLinkedList1.repOK();
    strictlySortedSinglyLinkedList1.size = 1;
    strictlySortedSinglyLinkedList1.size = 0;
    tp2.IP iP11 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP11.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan15 = new tp2.IPBan(iP11, (java.lang.Long)100L);
    tp2.IP iP16 = iPBan15.ip;
    boolean b17 = strictlySortedSinglyLinkedList1.contains(iPBan15);
    boolean b18 = strictlySortedSinglyLinkedList1.repOK();
    tp2.SinglyLinkedList singlyLinkedList19 = new tp2.SinglyLinkedList();
    int i20 = singlyLinkedList19.getSize();
    tp2.IP iP25 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i26 = iP25.getSecond();
    java.lang.Integer i27 = iP25.getFourth();
    singlyLinkedList19.add(iP25);
    boolean b30 = iP25.equals((java.lang.Object)2147483647);
    tp2.IPBan iPBan32 = new tp2.IPBan(iP25, (java.lang.Long)(-1L));
    boolean b33 = strictlySortedSinglyLinkedList1.add(iPBan32);
    boolean b34 = strictlySortedSinglyLinkedList0.add(iPBan32);
    tp2.IPBan iPBan36 = strictlySortedSinglyLinkedList0.get(15);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList37 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b38 = strictlySortedSinglyLinkedList37.repOK();
    strictlySortedSinglyLinkedList37.size = 1;
    strictlySortedSinglyLinkedList37.size = 0;
    tp2.IPBan iPBan43 = null;
    boolean b44 = strictlySortedSinglyLinkedList37.add(iPBan43);
    tp2.Node node45 = strictlySortedSinglyLinkedList37.header;
    tp2.Node node46 = strictlySortedSinglyLinkedList37.header;
    strictlySortedSinglyLinkedList0.header = node46;
    int i48 = strictlySortedSinglyLinkedList0.getSize();
    boolean b49 = strictlySortedSinglyLinkedList0.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i26 + "' != '" + (-1)+ "'", i26.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i27 + "' != '" + 100+ "'", i27.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iPBan36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i48 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b49 == false);

  }

  @Test
  public void test079() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test079"); }


    long long1 = java.lang.Integer.toUnsignedLong(623247555);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == 623247555L);

  }

  @Test
  public void test080() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test080"); }


    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList0 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b1 = strictlySortedSinglyLinkedList0.isEmpty();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList2 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b3 = strictlySortedSinglyLinkedList2.repOK();
    tp2.IP iP8 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    boolean b9 = strictlySortedSinglyLinkedList2.containsIP(iP8);
    tp2.Node node10 = strictlySortedSinglyLinkedList2.header;
    strictlySortedSinglyLinkedList0.header = node10;
    tp2.IPBan iPBan13 = strictlySortedSinglyLinkedList0.get(4);
    tp2.IPBan iPBan15 = strictlySortedSinglyLinkedList0.get(31);
    tp2.IP iP20 = new tp2.IP((java.lang.Integer)138, (java.lang.Integer)(-2147483648), (java.lang.Integer)160, (java.lang.Integer)15);
    boolean b21 = strictlySortedSinglyLinkedList0.removeFromIP(iP20);
    boolean b22 = strictlySortedSinglyLinkedList0.isEmpty();
    int i23 = strictlySortedSinglyLinkedList0.size;
    int i24 = strictlySortedSinglyLinkedList0.size;
    boolean b25 = strictlySortedSinglyLinkedList0.repOK();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iPBan13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iPBan15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);

  }

  @Test
  public void test081() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test081"); }


    // The following exception was thrown during execution in test generation
    try {
      int i1 = java.lang.Integer.parseInt("28f79");
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

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test082"); }


    int i2 = java.lang.Integer.rotateLeft(0, (-213546269));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);

  }

  @Test
  public void test083() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test083"); }


    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList0 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b1 = strictlySortedSinglyLinkedList0.isEmpty();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList2 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b3 = strictlySortedSinglyLinkedList2.repOK();
    tp2.IP iP8 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    boolean b9 = strictlySortedSinglyLinkedList2.containsIP(iP8);
    tp2.Node node10 = strictlySortedSinglyLinkedList2.header;
    strictlySortedSinglyLinkedList0.header = node10;
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList12 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b13 = strictlySortedSinglyLinkedList12.repOK();
    strictlySortedSinglyLinkedList12.size = 1;
    strictlySortedSinglyLinkedList12.size = 0;
    tp2.IP iP22 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP22.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan26 = new tp2.IPBan(iP22, (java.lang.Long)100L);
    tp2.IP iP31 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP31.setFirst((java.lang.Integer)200);
    java.lang.Integer i34 = iP31.getFourth();
    iPBan26.setIp(iP31);
    boolean b36 = strictlySortedSinglyLinkedList12.contains(iPBan26);
    boolean b37 = strictlySortedSinglyLinkedList0.contains(iPBan26);
    tp2.SinglyLinkedList singlyLinkedList38 = new tp2.SinglyLinkedList();
    int i39 = singlyLinkedList38.getSize();
    int i40 = singlyLinkedList38.getSize();
    tp2.IP iP41 = null;
    boolean b42 = singlyLinkedList38.contains(iP41);
    tp2.IP iP44 = singlyLinkedList38.get(27);
    tp2.IP iP49 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP49.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan53 = new tp2.IPBan(iP49, (java.lang.Long)100L);
    tp2.IP iP54 = iPBan53.ip;
    tp2.IP iP59 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP59.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan63 = new tp2.IPBan(iP59, (java.lang.Long)100L);
    iPBan53.setIp(iP59);
    boolean b65 = singlyLinkedList38.remove(iP59);
    iPBan26.ip = iP59;
    java.lang.Integer i67 = iP59.getFourth();
    iP59.setSecond((java.lang.Integer)5);
    tp2.IPBan iPBan71 = new tp2.IPBan(iP59, (java.lang.Long)51756492L);
    tp2.IP iP72 = iPBan71.getIp();
    tp2.IP iP73 = iPBan71.ip;
    java.lang.Integer i74 = iP73.getFourth();
    java.lang.Integer i75 = iP73.getThird();
    java.lang.Integer i76 = iP73.getFourth();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i34 + "' != '" + 100+ "'", i34.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i39 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i40 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b65 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i67 + "' != '" + 100+ "'", i67.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP72);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP73);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i74 + "' != '" + 100+ "'", i74.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i75 + "' != '" + (-1)+ "'", i75.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i76 + "' != '" + 100+ "'", i76.equals(100));

  }

  @Test
  public void test084() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test084"); }


    tp2.SinglyLinkedList singlyLinkedList0 = new tp2.SinglyLinkedList();
    boolean b1 = singlyLinkedList0.repOK();
    tp2.IP iP3 = singlyLinkedList0.get(200);
    boolean b4 = singlyLinkedList0.isEmpty();
    boolean b5 = singlyLinkedList0.repOK();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList6 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b7 = strictlySortedSinglyLinkedList6.repOK();
    tp2.IP iP12 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i13 = iP12.getSecond();
    iP12.setFirst((java.lang.Integer)11001000);
    iP12.setFirst((java.lang.Integer)(-2147483648));
    boolean b18 = strictlySortedSinglyLinkedList6.removeFromIP(iP12);
    tp2.IPBan iPBan20 = new tp2.IPBan(iP12, (java.lang.Long)0L);
    tp2.IP iP25 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP25.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan29 = new tp2.IPBan(iP25, (java.lang.Long)100L);
    tp2.IP iP30 = iPBan29.ip;
    tp2.IP iP31 = iPBan29.getIp();
    java.lang.Integer i32 = null;
    iP31.setFirst(i32);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList34 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b35 = strictlySortedSinglyLinkedList34.repOK();
    tp2.IP iP40 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i41 = iP40.getSecond();
    iP40.setFirst((java.lang.Integer)11001000);
    iP40.setFirst((java.lang.Integer)(-2147483648));
    boolean b46 = strictlySortedSinglyLinkedList34.removeFromIP(iP40);
    boolean b47 = iP31.equals((java.lang.Object)strictlySortedSinglyLinkedList34);
    tp2.IP iP52 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP52.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan56 = new tp2.IPBan(iP52, (java.lang.Long)100L);
    boolean b57 = strictlySortedSinglyLinkedList34.removeFromIP(iP52);
    java.lang.Integer i58 = iP52.getFirst();
    iPBan20.setIp(iP52);
    singlyLinkedList0.add(iP52);
    tp2.SinglyLinkedList singlyLinkedList61 = new tp2.SinglyLinkedList();
    boolean b62 = singlyLinkedList61.repOK();
    tp2.IP iP67 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP67.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan71 = new tp2.IPBan(iP67, (java.lang.Long)100L);
    tp2.IP iP76 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP76.setFirst((java.lang.Integer)200);
    java.lang.Integer i79 = iP76.getFourth();
    iPBan71.setIp(iP76);
    singlyLinkedList61.add(iP76);
    boolean b82 = singlyLinkedList0.contains(iP76);
    boolean b83 = singlyLinkedList0.isEmpty();
    boolean b84 = singlyLinkedList0.repOK();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i13 + "' != '" + (-1)+ "'", i13.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i41 + "' != '" + (-1)+ "'", i41.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b46 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b47 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b57 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i58 + "' != '" + 200+ "'", i58.equals(200));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b62 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i79 + "' != '" + 100+ "'", i79.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b82 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b83 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b84 == true);

  }

  @Test
  public void test085() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test085"); }


    int i1 = java.lang.Integer.lowestOneBit((-2130634389));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 1);

  }

  @Test
  public void test086() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test086"); }


    int i1 = java.lang.Integer.numberOfLeadingZeros(65588);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 15);

  }

  @Test
  public void test087() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test087"); }


    tp2.IP iP4 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i5 = iP4.getFourth();
    java.lang.Integer i6 = iP4.getThird();
    iP4.setSecond((java.lang.Integer)150995348);
    java.lang.Integer i9 = iP4.getFirst();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i5 + "' != '" + 100+ "'", i5.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i6 + "' != '" + (-1)+ "'", i6.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + (-1)+ "'", i9.equals((-1)));

  }

  @Test
  public void test088() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test088"); }


    int i2 = java.lang.Integer.divideUnsigned((-2013265920), (-842596640));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);

  }

  @Test
  public void test089() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test089"); }


    java.lang.Integer i1 = java.lang.Integer.getInteger("10001100111101010000000000000000");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);

  }

  @Test
  public void test090() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test090"); }


    java.lang.String str1 = java.lang.Integer.toUnsignedString(25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "25"+ "'", str1.equals("25"));

  }

  @Test
  public void test091() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test091"); }


    int i2 = java.lang.Integer.rotateRight(9209415, 373002);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == (-1849679071));

  }

  @Test
  public void test092() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test092"); }


    int i2 = java.lang.Integer.compare((-1073741443), (-1563491503));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);

  }

  @Test
  public void test093() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test093"); }


    tp2.SinglyLinkedList singlyLinkedList0 = new tp2.SinglyLinkedList();
    boolean b1 = singlyLinkedList0.repOK();
    tp2.IP iP3 = singlyLinkedList0.get(200);
    boolean b4 = singlyLinkedList0.isEmpty();
    tp2.IP iP9 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i10 = iP9.getThird();
    boolean b11 = singlyLinkedList0.remove(iP9);
    tp2.IP iP16 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP16.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan20 = new tp2.IPBan(iP16, (java.lang.Long)100L);
    tp2.IP iP21 = iPBan20.ip;
    tp2.IP iP22 = iPBan20.getIp();
    java.lang.Integer i23 = null;
    iP22.setFirst(i23);
    boolean b25 = singlyLinkedList0.contains(iP22);
    int i26 = singlyLinkedList0.getSize();
    int i27 = singlyLinkedList0.getSize();
    int i28 = singlyLinkedList0.getSize();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i10 + "' != '" + (-1)+ "'", i10.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == 0);

  }

  @Test
  public void test094() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test094"); }


    tp2.SinglyLinkedList singlyLinkedList0 = new tp2.SinglyLinkedList();
    int i1 = singlyLinkedList0.getSize();
    tp2.IP iP6 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i7 = iP6.getSecond();
    iP6.setFirst((java.lang.Integer)11001000);
    iP6.setFirst((java.lang.Integer)32);
    boolean b12 = singlyLinkedList0.remove(iP6);
    tp2.IP iP14 = singlyLinkedList0.get((-671088640));
    tp2.IP iP19 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i20 = iP19.getSecond();
    iP19.setFirst((java.lang.Integer)11001000);
    java.lang.Long long23 = null;
    tp2.IPBan iPBan24 = new tp2.IPBan(iP19, long23);
    tp2.IP iP25 = iPBan24.ip;
    tp2.IP iP26 = iPBan24.ip;
    java.lang.Integer i27 = iP26.getSecond();
    boolean b28 = singlyLinkedList0.contains(iP26);
    iP26.setFirst((java.lang.Integer)5888);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i7 + "' != '" + (-1)+ "'", i7.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i20 + "' != '" + (-1)+ "'", i20.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i27 + "' != '" + (-1)+ "'", i27.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);

  }

  @Test
  public void test095() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test095"); }


    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList0 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b1 = strictlySortedSinglyLinkedList0.repOK();
    strictlySortedSinglyLinkedList0.size = 1;
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList4 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b5 = strictlySortedSinglyLinkedList4.repOK();
    strictlySortedSinglyLinkedList4.size = 1;
    strictlySortedSinglyLinkedList4.size = 0;
    tp2.IP iP14 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP14.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan18 = new tp2.IPBan(iP14, (java.lang.Long)100L);
    tp2.IP iP19 = iPBan18.ip;
    boolean b20 = strictlySortedSinglyLinkedList4.contains(iPBan18);
    tp2.IP iP25 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP25.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan29 = new tp2.IPBan(iP25, (java.lang.Long)100L);
    tp2.IP iP34 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP34.setFirst((java.lang.Integer)200);
    java.lang.Integer i37 = iP34.getFourth();
    iPBan29.setIp(iP34);
    java.lang.Long long39 = iPBan29.expires;
    iPBan29.expires = (-1L);
    java.lang.Long long42 = iPBan29.expires;
    tp2.IP iP43 = iPBan29.getIp();
    tp2.IP iP44 = iPBan29.ip;
    tp2.IP iP45 = iPBan29.ip;
    tp2.SinglyLinkedList singlyLinkedList46 = new tp2.SinglyLinkedList();
    int i47 = singlyLinkedList46.getSize();
    tp2.IP iP52 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i53 = iP52.getSecond();
    java.lang.Integer i54 = iP52.getFourth();
    singlyLinkedList46.add(iP52);
    tp2.IP iP57 = singlyLinkedList46.get(5);
    boolean b58 = singlyLinkedList46.repOK();
    tp2.IP iP60 = singlyLinkedList46.get(2013265920);
    tp2.SinglyLinkedList singlyLinkedList61 = new tp2.SinglyLinkedList();
    int i62 = singlyLinkedList61.getSize();
    tp2.IP iP67 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i68 = iP67.getSecond();
    java.lang.Integer i69 = iP67.getFourth();
    singlyLinkedList61.add(iP67);
    iP67.setFourth((java.lang.Integer)167772160);
    singlyLinkedList46.add(iP67);
    java.lang.Object obj74 = null;
    boolean b75 = iP67.equals(obj74);
    iP67.setSecond((java.lang.Integer)20);
    tp2.IPBan iPBan79 = new tp2.IPBan(iP67, (java.lang.Long)20L);
    iPBan29.ip = iP67;
    iPBan18.setIp(iP67);
    boolean b82 = strictlySortedSinglyLinkedList0.contains(iPBan18);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList83 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b84 = strictlySortedSinglyLinkedList83.repOK();
    tp2.IP iP89 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i90 = iP89.getSecond();
    iP89.setFirst((java.lang.Integer)11001000);
    iP89.setFirst((java.lang.Integer)(-2147483648));
    boolean b95 = strictlySortedSinglyLinkedList83.removeFromIP(iP89);
    java.lang.Integer i96 = iP89.getThird();
    iPBan18.ip = iP89;
    java.lang.Long long98 = iPBan18.getExpires();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i37 + "' != '" + 100+ "'", i37.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long39 + "' != '" + 100L+ "'", long39.equals(100L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long42 + "' != '" + (-1L)+ "'", long42.equals((-1L)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i47 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i53 + "' != '" + (-1)+ "'", i53.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i54 + "' != '" + 100+ "'", i54.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b58 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP60);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i62 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i68 + "' != '" + (-1)+ "'", i68.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i69 + "' != '" + 100+ "'", i69.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b75 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b82 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b84 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i90 + "' != '" + (-1)+ "'", i90.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b95 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i96 + "' != '" + (-1)+ "'", i96.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long98 + "' != '" + 100L+ "'", long98.equals(100L));

  }

  @Test
  public void test096() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test096"); }


    // The following exception was thrown during execution in test generation
    try {
      int i2 = java.lang.Integer.parseInt("a593", 0);
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

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test097"); }


    // The following exception was thrown during execution in test generation
    try {
      java.lang.Integer i1 = java.lang.Integer.decode("101000111101011101");
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

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test098"); }


    int i2 = java.lang.Integer.rotateLeft(19531250, (-620670883));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1076183230);

  }

  @Test
  public void test099() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test099"); }


    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList0 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b1 = strictlySortedSinglyLinkedList0.repOK();
    strictlySortedSinglyLinkedList0.size = 1;
    strictlySortedSinglyLinkedList0.size = 0;
    tp2.Node node6 = strictlySortedSinglyLinkedList0.header;
    strictlySortedSinglyLinkedList0.size = 67108864;
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList9 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b10 = strictlySortedSinglyLinkedList9.repOK();
    tp2.IP iP15 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i16 = iP15.getSecond();
    iP15.setFirst((java.lang.Integer)11001000);
    iP15.setFirst((java.lang.Integer)(-2147483648));
    boolean b21 = strictlySortedSinglyLinkedList9.removeFromIP(iP15);
    tp2.Node node22 = strictlySortedSinglyLinkedList9.header;
    tp2.IP iP23 = null;
    boolean b24 = strictlySortedSinglyLinkedList9.containsIP(iP23);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList25 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b26 = strictlySortedSinglyLinkedList25.repOK();
    tp2.IP iP31 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i32 = iP31.getSecond();
    iP31.setFirst((java.lang.Integer)11001000);
    iP31.setFirst((java.lang.Integer)(-2147483648));
    boolean b37 = strictlySortedSinglyLinkedList25.removeFromIP(iP31);
    tp2.IP iP42 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP42.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan46 = new tp2.IPBan(iP42, (java.lang.Long)100L);
    tp2.IP iP47 = iPBan46.ip;
    tp2.IP iP52 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP52.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan56 = new tp2.IPBan(iP52, (java.lang.Long)100L);
    iPBan46.setIp(iP52);
    tp2.IP iP62 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP62.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan66 = new tp2.IPBan(iP62, (java.lang.Long)100L);
    java.lang.Integer i67 = iP62.getFirst();
    java.lang.Integer i68 = iP62.getFourth();
    iPBan46.setIp(iP62);
    boolean b70 = strictlySortedSinglyLinkedList25.add(iPBan46);
    boolean b71 = strictlySortedSinglyLinkedList9.add(iPBan46);
    tp2.Node node72 = strictlySortedSinglyLinkedList9.header;
    strictlySortedSinglyLinkedList0.header = node72;
    boolean b74 = strictlySortedSinglyLinkedList0.repOK();
    tp2.IP iP79 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i80 = iP79.getSecond();
    tp2.SinglyLinkedList singlyLinkedList81 = new tp2.SinglyLinkedList();
    boolean b82 = singlyLinkedList81.repOK();
    boolean b83 = iP79.equals((java.lang.Object)b82);
    tp2.IPBan iPBan85 = new tp2.IPBan(iP79, (java.lang.Long)100L);
    tp2.IP iP86 = iPBan85.getIp();
    boolean b87 = strictlySortedSinglyLinkedList0.contains(iPBan85);
    int i88 = strictlySortedSinglyLinkedList0.size;
    strictlySortedSinglyLinkedList0.size = 237568;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i16 + "' != '" + (-1)+ "'", i16.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i32 + "' != '" + (-1)+ "'", i32.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i67 + "' != '" + 200+ "'", i67.equals(200));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i68 + "' != '" + 100+ "'", i68.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b70 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b71 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node72);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b74 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i80 + "' != '" + (-1)+ "'", i80.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b82 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b83 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP86);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b87 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i88 == 67108864);

  }

  @Test
  public void test100() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test100"); }


    int i2 = java.lang.Integer.compareUnsigned((-2003860978), 1308370);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);

  }

  @Test
  public void test101() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test101"); }


    tp2.SinglyLinkedList singlyLinkedList0 = new tp2.SinglyLinkedList();
    boolean b1 = singlyLinkedList0.repOK();
    int i2 = singlyLinkedList0.getSize();
    boolean b3 = singlyLinkedList0.isEmpty();
    tp2.IP iP8 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP8.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan12 = new tp2.IPBan(iP8, (java.lang.Long)100L);
    tp2.IP iP13 = iPBan12.ip;
    tp2.IP iP18 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i19 = iP18.getFourth();
    java.lang.Integer i20 = iP18.getFourth();
    iP18.setThird((java.lang.Integer)200);
    iPBan12.ip = iP18;
    iP18.setFirst((java.lang.Integer)16777216);
    boolean b26 = singlyLinkedList0.contains(iP18);
    tp2.SinglyLinkedList singlyLinkedList27 = new tp2.SinglyLinkedList();
    boolean b28 = singlyLinkedList27.repOK();
    tp2.IP iP30 = singlyLinkedList27.get(200);
    boolean b31 = singlyLinkedList27.isEmpty();
    boolean b32 = singlyLinkedList27.repOK();
    boolean b33 = singlyLinkedList27.repOK();
    tp2.IP iP38 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i39 = iP38.getThird();
    singlyLinkedList27.add(iP38);
    java.lang.Integer i41 = iP38.getFourth();
    boolean b42 = singlyLinkedList0.contains(iP38);
    iP38.setFirst((java.lang.Integer)64);
    java.lang.Integer i45 = iP38.getFourth();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i19 + "' != '" + 100+ "'", i19.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i20 + "' != '" + 100+ "'", i20.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i39 + "' != '" + (-1)+ "'", i39.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i41 + "' != '" + 100+ "'", i41.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i45 + "' != '" + 100+ "'", i45.equals(100));

  }

  @Test
  public void test102() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test102"); }


    java.lang.Integer i2 = java.lang.Integer.getInteger("88000000", (java.lang.Integer)(-1629144292));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i2 + "' != '" + (-1629144292)+ "'", i2.equals((-1629144292)));

  }

  @Test
  public void test103() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test103"); }


    java.lang.String str1 = java.lang.Integer.toHexString((-1678592000));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "9bf2b800"+ "'", str1.equals("9bf2b800"));

  }

  @Test
  public void test104() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test104"); }


    java.lang.Integer i1 = java.lang.Integer.valueOf(621167135);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 621167135+ "'", i1.equals(621167135));

  }

  @Test
  public void test105() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test105"); }


    tp2.SinglyLinkedList singlyLinkedList0 = new tp2.SinglyLinkedList();
    boolean b1 = singlyLinkedList0.repOK();
    tp2.IP iP6 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i7 = iP6.getSecond();
    iP6.setFirst((java.lang.Integer)11001000);
    java.lang.Long long10 = null;
    tp2.IPBan iPBan11 = new tp2.IPBan(iP6, long10);
    tp2.IP iP12 = iPBan11.ip;
    tp2.IP iP13 = iPBan11.ip;
    boolean b14 = singlyLinkedList0.contains(iP13);
    tp2.IP iP19 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP19.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan23 = new tp2.IPBan(iP19, (java.lang.Long)100L);
    tp2.IP iP28 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP28.setFirst((java.lang.Integer)200);
    java.lang.Integer i31 = iP28.getFourth();
    iPBan23.setIp(iP28);
    iPBan23.setExpires((java.lang.Long)2147483648L);
    tp2.IP iP35 = iPBan23.getIp();
    iP35.setFirst((java.lang.Integer)56);
    boolean b38 = singlyLinkedList0.remove(iP35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i7 + "' != '" + (-1)+ "'", i7.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i31 + "' != '" + 100+ "'", i31.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == false);

  }

  @Test
  public void test106() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test106"); }


    int i2 = java.lang.Integer.divideUnsigned(86682288, 25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 3467291);

  }

  @Test
  public void test107() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test107"); }


    int i1 = java.lang.Integer.numberOfTrailingZeros(939524135);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);

  }

  @Test
  public void test108() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test108"); }


    tp2.SinglyLinkedList singlyLinkedList0 = new tp2.SinglyLinkedList();
    int i1 = singlyLinkedList0.getSize();
    tp2.IP iP6 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i7 = iP6.getSecond();
    java.lang.Integer i8 = iP6.getFourth();
    singlyLinkedList0.add(iP6);
    tp2.IP iP11 = singlyLinkedList0.get(5);
    boolean b12 = singlyLinkedList0.repOK();
    tp2.IP iP14 = singlyLinkedList0.get(2013265920);
    tp2.SinglyLinkedList singlyLinkedList15 = new tp2.SinglyLinkedList();
    int i16 = singlyLinkedList15.getSize();
    tp2.IP iP21 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i22 = iP21.getSecond();
    java.lang.Integer i23 = iP21.getFourth();
    singlyLinkedList15.add(iP21);
    iP21.setFourth((java.lang.Integer)167772160);
    singlyLinkedList0.add(iP21);
    java.lang.Object obj28 = null;
    boolean b29 = iP21.equals(obj28);
    iP21.setSecond((java.lang.Integer)20);
    tp2.IPBan iPBan33 = new tp2.IPBan(iP21, (java.lang.Long)20L);
    iPBan33.expires = 2147483655L;
    tp2.SinglyLinkedList singlyLinkedList36 = new tp2.SinglyLinkedList();
    int i37 = singlyLinkedList36.getSize();
    int i38 = singlyLinkedList36.getSize();
    tp2.IP iP39 = null;
    boolean b40 = singlyLinkedList36.contains(iP39);
    tp2.IP iP42 = singlyLinkedList36.get(27);
    tp2.IP iP47 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i48 = iP47.getSecond();
    iP47.setFirst((java.lang.Integer)11001000);
    java.lang.Long long51 = null;
    tp2.IPBan iPBan52 = new tp2.IPBan(iP47, long51);
    tp2.IP iP53 = iPBan52.ip;
    tp2.IP iP54 = iPBan52.ip;
    java.lang.Integer i55 = iP54.getFourth();
    boolean b56 = singlyLinkedList36.remove(iP54);
    tp2.IP iP61 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i62 = iP61.getSecond();
    iP61.setFirst((java.lang.Integer)11001000);
    java.lang.Long long65 = null;
    tp2.IPBan iPBan66 = new tp2.IPBan(iP61, long65);
    tp2.IP iP67 = iPBan66.ip;
    tp2.IP iP68 = iPBan66.ip;
    tp2.IPBan iPBan70 = new tp2.IPBan(iP68, (java.lang.Long)10L);
    singlyLinkedList36.add(iP68);
    tp2.IP iP76 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i77 = iP76.getFourth();
    java.lang.Integer i78 = iP76.getThird();
    boolean b79 = singlyLinkedList36.contains(iP76);
    iPBan33.setIp(iP76);
    tp2.IP iP81 = iPBan33.getIp();
    tp2.IP iP82 = iPBan33.getIp();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i7 + "' != '" + (-1)+ "'", i7.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i8 + "' != '" + 100+ "'", i8.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i22 + "' != '" + (-1)+ "'", i22.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i23 + "' != '" + 100+ "'", i23.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i37 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i38 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i48 + "' != '" + (-1)+ "'", i48.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i55 + "' != '" + 100+ "'", i55.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b56 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i62 + "' != '" + (-1)+ "'", i62.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP67);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP68);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i77 + "' != '" + 100+ "'", i77.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i78 + "' != '" + (-1)+ "'", i78.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b79 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP81);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP82);

  }

  @Test
  public void test109() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test109"); }


    tp2.IP iP4 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP4.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan8 = new tp2.IPBan(iP4, (java.lang.Long)100L);
    tp2.IP iP9 = iPBan8.ip;
    tp2.IP iP10 = iPBan8.getIp();
    iPBan8.expires = 71040L;
    iPBan8.expires = 2147483648L;
    tp2.IP iP15 = iPBan8.ip;
    java.lang.Integer i16 = iP15.getFourth();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i16 + "' != '" + 100+ "'", i16.equals(100));

  }

  @Test
  public void test110() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test110"); }


    int i2 = java.lang.Integer.remainderUnsigned(24117248, 64);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);

  }

  @Test
  public void test111() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test111"); }


    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList0 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b1 = strictlySortedSinglyLinkedList0.repOK();
    tp2.IP iP6 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    boolean b7 = strictlySortedSinglyLinkedList0.containsIP(iP6);
    tp2.Node node8 = strictlySortedSinglyLinkedList0.header;
    strictlySortedSinglyLinkedList0.size = 11001000;
    tp2.IPBan iPBan12 = strictlySortedSinglyLinkedList0.get(3);
    strictlySortedSinglyLinkedList0.size = 20480;
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList15 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b16 = strictlySortedSinglyLinkedList15.isEmpty();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList17 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b18 = strictlySortedSinglyLinkedList17.repOK();
    tp2.IP iP23 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    boolean b24 = strictlySortedSinglyLinkedList17.containsIP(iP23);
    tp2.Node node25 = strictlySortedSinglyLinkedList17.header;
    strictlySortedSinglyLinkedList15.header = node25;
    tp2.IPBan iPBan28 = strictlySortedSinglyLinkedList15.get(4);
    boolean b29 = strictlySortedSinglyLinkedList15.isEmpty();
    tp2.Node node30 = strictlySortedSinglyLinkedList15.header;
    strictlySortedSinglyLinkedList0.header = node30;
    tp2.SinglyLinkedList singlyLinkedList32 = new tp2.SinglyLinkedList();
    boolean b33 = singlyLinkedList32.repOK();
    int i34 = singlyLinkedList32.getSize();
    boolean b35 = singlyLinkedList32.isEmpty();
    tp2.IP iP40 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP40.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan44 = new tp2.IPBan(iP40, (java.lang.Long)100L);
    tp2.IP iP45 = iPBan44.ip;
    tp2.IP iP50 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i51 = iP50.getFourth();
    java.lang.Integer i52 = iP50.getFourth();
    iP50.setThird((java.lang.Integer)200);
    iPBan44.ip = iP50;
    iP50.setFirst((java.lang.Integer)16777216);
    boolean b58 = singlyLinkedList32.contains(iP50);
    tp2.IP iP63 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP63.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan67 = new tp2.IPBan(iP63, (java.lang.Long)100L);
    tp2.IP iP68 = iPBan67.ip;
    tp2.IP iP73 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP73.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan77 = new tp2.IPBan(iP73, (java.lang.Long)100L);
    iPBan67.setIp(iP73);
    java.lang.Long long79 = iPBan67.getExpires();
    tp2.IP iP80 = iPBan67.ip;
    boolean b81 = singlyLinkedList32.contains(iP80);
    boolean b82 = strictlySortedSinglyLinkedList0.removeFromIP(iP80);
    java.lang.Integer i83 = null;
    iP80.setThird(i83);
    tp2.IPBan iPBan86 = new tp2.IPBan(iP80, (java.lang.Long)1L);
    tp2.IP iP87 = iPBan86.getIp();
    tp2.IP iP88 = iPBan86.getIp();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iPBan12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iPBan28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i34 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i51 + "' != '" + 100+ "'", i51.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i52 + "' != '" + 100+ "'", i52.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b58 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP68);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long79 + "' != '" + 100L+ "'", long79.equals(100L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP80);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b81 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b82 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP87);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP88);

  }

  @Test
  public void test112() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test112"); }


    tp2.SinglyLinkedList singlyLinkedList0 = new tp2.SinglyLinkedList();
    int i1 = singlyLinkedList0.getSize();
    tp2.IP iP6 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i7 = iP6.getSecond();
    java.lang.Integer i8 = iP6.getFourth();
    singlyLinkedList0.add(iP6);
    tp2.IPBan iPBan11 = new tp2.IPBan(iP6, (java.lang.Long)100L);
    iPBan11.expires = 10L;
    java.lang.Long long14 = iPBan11.expires;
    tp2.SinglyLinkedList singlyLinkedList15 = new tp2.SinglyLinkedList();
    boolean b16 = singlyLinkedList15.repOK();
    int i17 = singlyLinkedList15.getSize();
    boolean b18 = singlyLinkedList15.isEmpty();
    tp2.SinglyLinkedList singlyLinkedList19 = new tp2.SinglyLinkedList();
    int i20 = singlyLinkedList19.getSize();
    tp2.IP iP25 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i26 = iP25.getSecond();
    java.lang.Integer i27 = iP25.getFourth();
    singlyLinkedList19.add(iP25);
    tp2.IP iP30 = singlyLinkedList19.get(5);
    boolean b31 = singlyLinkedList19.repOK();
    tp2.IP iP33 = singlyLinkedList19.get(2013265920);
    tp2.IP iP35 = singlyLinkedList19.get((-1));
    singlyLinkedList15.add(iP35);
    iPBan11.setIp(iP35);
    iPBan11.expires = (-1L);
    tp2.IP iP40 = iPBan11.ip;
    tp2.IP iP41 = iPBan11.getIp();
    iPBan11.expires = 4096L;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i7 + "' != '" + (-1)+ "'", i7.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i8 + "' != '" + 100+ "'", i8.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long14 + "' != '" + 10L+ "'", long14.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i26 + "' != '" + (-1)+ "'", i26.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i27 + "' != '" + 100+ "'", i27.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP41);

  }

  @Test
  public void test113() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test113"); }


    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList0 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b1 = strictlySortedSinglyLinkedList0.isEmpty();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList2 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b3 = strictlySortedSinglyLinkedList2.repOK();
    tp2.IP iP8 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    boolean b9 = strictlySortedSinglyLinkedList2.containsIP(iP8);
    tp2.Node node10 = strictlySortedSinglyLinkedList2.header;
    strictlySortedSinglyLinkedList0.header = node10;
    tp2.IPBan iPBan13 = strictlySortedSinglyLinkedList0.get(4);
    tp2.IPBan iPBan15 = strictlySortedSinglyLinkedList0.get(31);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList16 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b17 = strictlySortedSinglyLinkedList16.repOK();
    tp2.IP iP22 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i23 = iP22.getSecond();
    iP22.setFirst((java.lang.Integer)11001000);
    iP22.setFirst((java.lang.Integer)(-2147483648));
    boolean b28 = strictlySortedSinglyLinkedList16.removeFromIP(iP22);
    tp2.IPBan iPBan29 = null;
    boolean b30 = strictlySortedSinglyLinkedList16.add(iPBan29);
    tp2.Node node31 = strictlySortedSinglyLinkedList16.header;
    tp2.Node node32 = strictlySortedSinglyLinkedList16.header;
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList33 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b34 = strictlySortedSinglyLinkedList33.repOK();
    tp2.IP iP39 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i40 = iP39.getSecond();
    iP39.setFirst((java.lang.Integer)11001000);
    iP39.setFirst((java.lang.Integer)(-2147483648));
    boolean b45 = strictlySortedSinglyLinkedList33.removeFromIP(iP39);
    tp2.Node node46 = strictlySortedSinglyLinkedList33.header;
    strictlySortedSinglyLinkedList16.header = node46;
    boolean b48 = strictlySortedSinglyLinkedList16.repOK();
    tp2.IP iP53 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP53.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan57 = new tp2.IPBan(iP53, (java.lang.Long)100L);
    tp2.IP iP62 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i63 = iP62.getSecond();
    java.lang.Integer i64 = iP62.getFourth();
    iP62.setFirst((java.lang.Integer)5);
    iPBan57.ip = iP62;
    java.lang.Long long68 = iPBan57.getExpires();
    iPBan57.expires = 2147483648L;
    tp2.IP iP75 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP75.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan79 = new tp2.IPBan(iP75, (java.lang.Long)100L);
    tp2.IP iP80 = iPBan79.ip;
    tp2.SinglyLinkedList singlyLinkedList81 = new tp2.SinglyLinkedList();
    int i82 = singlyLinkedList81.getSize();
    tp2.IP iP87 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i88 = iP87.getSecond();
    java.lang.Integer i89 = iP87.getFourth();
    singlyLinkedList81.add(iP87);
    boolean b91 = iP80.equals((java.lang.Object)iP87);
    iPBan57.ip = iP87;
    java.lang.Long long93 = iPBan57.expires;
    boolean b94 = strictlySortedSinglyLinkedList16.add(iPBan57);
    boolean b95 = strictlySortedSinglyLinkedList0.add(iPBan57);
    strictlySortedSinglyLinkedList0.size = 32768;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iPBan13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iPBan15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i23 + "' != '" + (-1)+ "'", i23.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i40 + "' != '" + (-1)+ "'", i40.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b48 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i63 + "' != '" + (-1)+ "'", i63.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i64 + "' != '" + 100+ "'", i64.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long68 + "' != '" + 100L+ "'", long68.equals(100L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP80);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i82 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i88 + "' != '" + (-1)+ "'", i88.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i89 + "' != '" + 100+ "'", i89.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b91 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long93 + "' != '" + 2147483648L+ "'", long93.equals(2147483648L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b94 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b95 == true);

  }

  @Test
  public void test114() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test114"); }


    java.lang.String str1 = java.lang.Integer.toHexString(10018);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "2722"+ "'", str1.equals("2722"));

  }

  @Test
  public void test115() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test115"); }


    // The following exception was thrown during execution in test generation
    try {
      java.lang.Integer i1 = java.lang.Integer.decode("24612200020");
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

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test116"); }


    tp2.IP iP4 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i5 = iP4.getSecond();
    java.lang.Integer i6 = iP4.getFourth();
    iP4.setFirst((java.lang.Integer)5);
    iP4.setSecond((java.lang.Integer)11001000);
    tp2.IPBan iPBan12 = new tp2.IPBan(iP4, (java.lang.Long)100L);
    iP4.setFirst((java.lang.Integer)1610612736);
    java.lang.Integer i15 = iP4.getFourth();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i5 + "' != '" + (-1)+ "'", i5.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i6 + "' != '" + 100+ "'", i6.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i15 + "' != '" + 100+ "'", i15.equals(100));

  }

  @Test
  public void test117() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test117"); }


    int i1 = java.lang.Integer.numberOfLeadingZeros(80000007);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 5);

  }

  @Test
  public void test118() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test118"); }


    // The following exception was thrown during execution in test generation
    try {
      java.lang.Integer i1 = java.lang.Integer.valueOf("dcbd15db");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test119() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test119"); }


    tp2.SinglyLinkedList singlyLinkedList0 = new tp2.SinglyLinkedList();
    boolean b1 = singlyLinkedList0.repOK();
    tp2.IP iP3 = singlyLinkedList0.get(200);
    boolean b4 = singlyLinkedList0.repOK();
    tp2.IP iP9 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP9.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan13 = new tp2.IPBan(iP9, (java.lang.Long)100L);
    tp2.IP iP18 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iPBan13.setIp(iP18);
    iP18.setSecond((java.lang.Integer)8);
    iP18.setFirst((java.lang.Integer)3);
    java.lang.Integer i24 = iP18.getThird();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList25 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b26 = strictlySortedSinglyLinkedList25.repOK();
    strictlySortedSinglyLinkedList25.size = 1;
    boolean b29 = strictlySortedSinglyLinkedList25.isEmpty();
    tp2.SinglyLinkedList singlyLinkedList30 = new tp2.SinglyLinkedList();
    int i31 = singlyLinkedList30.getSize();
    tp2.IP iP36 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i37 = iP36.getSecond();
    java.lang.Integer i38 = iP36.getFourth();
    singlyLinkedList30.add(iP36);
    boolean b41 = iP36.equals((java.lang.Object)2147483647);
    tp2.IPBan iPBan43 = new tp2.IPBan(iP36, (java.lang.Long)(-1L));
    java.lang.Long long44 = iPBan43.expires;
    boolean b45 = strictlySortedSinglyLinkedList25.contains(iPBan43);
    tp2.IP iP46 = iPBan43.ip;
    iP46.setFirst((java.lang.Integer)356246787);
    boolean b49 = iP18.equals((java.lang.Object)356246787);
    singlyLinkedList0.add(iP18);
    tp2.IP iP52 = singlyLinkedList0.get((-2147483648));
    tp2.SinglyLinkedList singlyLinkedList53 = new tp2.SinglyLinkedList();
    int i54 = singlyLinkedList53.getSize();
    int i55 = singlyLinkedList53.getSize();
    tp2.IP iP56 = null;
    boolean b57 = singlyLinkedList53.contains(iP56);
    tp2.IP iP59 = singlyLinkedList53.get(27);
    boolean b60 = singlyLinkedList53.isEmpty();
    boolean b61 = iP52.equals((java.lang.Object)b60);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i24 + "' != '" + (-1)+ "'", i24.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i31 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i37 + "' != '" + (-1)+ "'", i37.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i38 + "' != '" + 100+ "'", i38.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long44 + "' != '" + (-1L)+ "'", long44.equals((-1L)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b49 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i54 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i55 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b57 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP59);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b60 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b61 == false);

  }

  @Test
  public void test120() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test120"); }


    tp2.IP iP4 = new tp2.IP((java.lang.Integer)550851880, (java.lang.Integer)1451229248, (java.lang.Integer)20272469, (java.lang.Integer)83886645);

  }

  @Test
  public void test121() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test121"); }


    int i2 = java.lang.Integer.max(117085440, 17034372);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 117085440);

  }

  @Test
  public void test122() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test122"); }


    tp2.IP iP4 = new tp2.IP((java.lang.Integer)12, (java.lang.Integer)167772160, (java.lang.Integer)(-1610320004), (java.lang.Integer)16);
    iP4.setFourth((java.lang.Integer)(-675004141));
    java.lang.Integer i7 = iP4.getSecond();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i7 + "' != '" + 167772160+ "'", i7.equals(167772160));

  }

  @Test
  public void test123() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test123"); }


    // The following exception was thrown during execution in test generation
    try {
      java.lang.Integer i1 = new java.lang.Integer("faae5827");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test124() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test124"); }


    java.lang.Integer i1 = java.lang.Integer.decode("155300400");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 155300400+ "'", i1.equals(155300400));

  }

  @Test
  public void test125() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test125"); }


    java.lang.String str1 = java.lang.Integer.toHexString((-2147483636));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "8000000c"+ "'", str1.equals("8000000c"));

  }

  @Test
  public void test126() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test126"); }


    int i2 = java.lang.Integer.max(3014656, 44000000);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 44000000);

  }

  @Test
  public void test127() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test127"); }


    int i1 = java.lang.Integer.lowestOneBit(1073741899);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 1);

  }

  @Test
  public void test128() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test128"); }


    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList0 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b1 = strictlySortedSinglyLinkedList0.repOK();
    tp2.IP iP6 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i7 = iP6.getSecond();
    iP6.setFirst((java.lang.Integer)11001000);
    iP6.setFirst((java.lang.Integer)(-2147483648));
    boolean b12 = strictlySortedSinglyLinkedList0.removeFromIP(iP6);
    tp2.IP iP17 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP17.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan21 = new tp2.IPBan(iP17, (java.lang.Long)100L);
    tp2.IP iP22 = iPBan21.ip;
    tp2.IP iP27 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP27.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan31 = new tp2.IPBan(iP27, (java.lang.Long)100L);
    iPBan21.setIp(iP27);
    tp2.IP iP37 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP37.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan41 = new tp2.IPBan(iP37, (java.lang.Long)100L);
    java.lang.Integer i42 = iP37.getFirst();
    java.lang.Integer i43 = iP37.getFourth();
    iPBan21.setIp(iP37);
    boolean b45 = strictlySortedSinglyLinkedList0.add(iPBan21);
    strictlySortedSinglyLinkedList0.size = 1451229184;
    int i48 = strictlySortedSinglyLinkedList0.getSize();
    strictlySortedSinglyLinkedList0.size = 1677721600;
    strictlySortedSinglyLinkedList0.size = 11892000;
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList53 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b54 = strictlySortedSinglyLinkedList53.repOK();
    strictlySortedSinglyLinkedList53.size = 1;
    strictlySortedSinglyLinkedList53.size = 0;
    tp2.IP iP63 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP63.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan67 = new tp2.IPBan(iP63, (java.lang.Long)100L);
    tp2.IP iP68 = iPBan67.ip;
    boolean b69 = strictlySortedSinglyLinkedList53.contains(iPBan67);
    boolean b70 = strictlySortedSinglyLinkedList53.isEmpty();
    tp2.Node node71 = strictlySortedSinglyLinkedList53.header;
    strictlySortedSinglyLinkedList0.header = node71;
    boolean b73 = strictlySortedSinglyLinkedList0.repOK();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i7 + "' != '" + (-1)+ "'", i7.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i42 + "' != '" + 200+ "'", i42.equals(200));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i43 + "' != '" + 100+ "'", i43.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i48 == 1451229184);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b54 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP68);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b69 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b70 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node71);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b73 == false);

  }

  @Test
  public void test129() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test129"); }


    int i2 = java.lang.Integer.sum(150995005, 1580);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 150996585);

  }

  @Test
  public void test130() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test130"); }


    // The following exception was thrown during execution in test generation
    try {
      int i1 = java.lang.Integer.parseInt("153be503");
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

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test131"); }


    int i2 = java.lang.Integer.rotateLeft((-1677719624), 1200005000);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 506012);

  }

  @Test
  public void test132() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test132"); }


    int i2 = java.lang.Integer.sum(200, (-531692800));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == (-531692600));

  }

  @Test
  public void test133() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test133"); }


    int i1 = java.lang.Integer.highestOneBit(69357568);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 67108864);

  }

  @Test
  public void test134() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test134"); }


    tp2.IP iP4 = new tp2.IP((java.lang.Integer)3925251, (java.lang.Integer)31, (java.lang.Integer)29, (java.lang.Integer)163840);
    java.lang.Integer i5 = iP4.getThird();
    iP4.setFourth((java.lang.Integer)10485760);
    java.lang.Integer i8 = iP4.getSecond();
    tp2.IPBan iPBan10 = new tp2.IPBan(iP4, (java.lang.Long)160L);
    tp2.IP iP11 = iPBan10.ip;
    tp2.IP iP12 = iPBan10.ip;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i5 + "' != '" + 29+ "'", i5.equals(29));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i8 + "' != '" + 31+ "'", i8.equals(31));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP12);

  }

  @Test
  public void test135() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test135"); }


    int i2 = java.lang.Integer.max(32547700, (-2147483621));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 32547700);

  }

  @Test
  public void test136() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test136"); }


    tp2.SinglyLinkedList singlyLinkedList0 = new tp2.SinglyLinkedList();
    int i1 = singlyLinkedList0.getSize();
    tp2.IP iP6 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP6.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan10 = new tp2.IPBan(iP6, (java.lang.Long)100L);
    tp2.IP iP11 = iPBan10.ip;
    tp2.SinglyLinkedList singlyLinkedList12 = new tp2.SinglyLinkedList();
    int i13 = singlyLinkedList12.getSize();
    tp2.IP iP18 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i19 = iP18.getSecond();
    java.lang.Integer i20 = iP18.getFourth();
    singlyLinkedList12.add(iP18);
    boolean b22 = iP11.equals((java.lang.Object)iP18);
    boolean b23 = singlyLinkedList0.remove(iP11);
    int i24 = singlyLinkedList0.getSize();
    tp2.IP iP29 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i30 = iP29.getSecond();
    iP29.setFirst((java.lang.Integer)11001000);
    iP29.setFirst((java.lang.Integer)(-2147483648));
    java.lang.Integer i35 = iP29.getThird();
    boolean b36 = singlyLinkedList0.contains(iP29);
    tp2.SinglyLinkedList singlyLinkedList37 = new tp2.SinglyLinkedList();
    int i38 = singlyLinkedList37.getSize();
    tp2.IP iP43 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i44 = iP43.getSecond();
    java.lang.Integer i45 = iP43.getFourth();
    singlyLinkedList37.add(iP43);
    tp2.IPBan iPBan48 = new tp2.IPBan(iP43, (java.lang.Long)100L);
    java.lang.Long long49 = null;
    tp2.IPBan iPBan50 = new tp2.IPBan(iP43, long49);
    iP43.setFourth((java.lang.Integer)10);
    boolean b53 = singlyLinkedList0.contains(iP43);
    tp2.IP iP58 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP58.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan62 = new tp2.IPBan(iP58, (java.lang.Long)100L);
    tp2.IP iP63 = iPBan62.ip;
    tp2.SinglyLinkedList singlyLinkedList64 = new tp2.SinglyLinkedList();
    int i65 = singlyLinkedList64.getSize();
    tp2.IP iP70 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i71 = iP70.getSecond();
    java.lang.Integer i72 = iP70.getFourth();
    singlyLinkedList64.add(iP70);
    boolean b74 = iP63.equals((java.lang.Object)iP70);
    java.lang.Integer i75 = iP63.getFirst();
    tp2.IPBan iPBan77 = new tp2.IPBan(iP63, (java.lang.Long)4L);
    boolean b78 = singlyLinkedList0.contains(iP63);
    iP63.setFirst((java.lang.Integer)(-1073741817));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i19 + "' != '" + (-1)+ "'", i19.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i20 + "' != '" + 100+ "'", i20.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i30 + "' != '" + (-1)+ "'", i30.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i35 + "' != '" + (-1)+ "'", i35.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i38 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i44 + "' != '" + (-1)+ "'", i44.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i45 + "' != '" + 100+ "'", i45.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b53 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP63);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i65 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i71 + "' != '" + (-1)+ "'", i71.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i72 + "' != '" + 100+ "'", i72.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b74 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i75 + "' != '" + 200+ "'", i75.equals(200));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b78 == false);

  }

  @Test
  public void test137() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test137"); }


    java.lang.Integer i2 = java.lang.Integer.getInteger("36210104372", (java.lang.Integer)1152);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i2 + "' != '" + 1152+ "'", i2.equals(1152));

  }

  @Test
  public void test138() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test138"); }


    tp2.IP iP4 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP4.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan8 = new tp2.IPBan(iP4, (java.lang.Long)100L);
    tp2.IP iP9 = iPBan8.ip;
    tp2.IP iP14 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP14.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan18 = new tp2.IPBan(iP14, (java.lang.Long)100L);
    iPBan8.setIp(iP14);
    tp2.IP iP24 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP24.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan28 = new tp2.IPBan(iP24, (java.lang.Long)100L);
    java.lang.Integer i29 = iP24.getFirst();
    java.lang.Integer i30 = iP24.getFourth();
    iPBan8.setIp(iP24);
    tp2.IP iP32 = iPBan8.getIp();
    tp2.SinglyLinkedList singlyLinkedList33 = new tp2.SinglyLinkedList();
    int i34 = singlyLinkedList33.getSize();
    tp2.IP iP39 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i40 = iP39.getSecond();
    java.lang.Integer i41 = iP39.getFourth();
    singlyLinkedList33.add(iP39);
    tp2.IPBan iPBan44 = new tp2.IPBan(iP39, (java.lang.Long)100L);
    iP39.setThird((java.lang.Integer)(-2147483641));
    java.lang.Integer i47 = iP39.getSecond();
    iPBan8.ip = iP39;
    tp2.IP iP49 = iPBan8.ip;
    tp2.IP iP50 = iPBan8.getIp();
    tp2.IP iP55 = new tp2.IP((java.lang.Integer)15204352, (java.lang.Integer)1, (java.lang.Integer)15204352, (java.lang.Integer)356246787);
    tp2.SinglyLinkedList singlyLinkedList56 = new tp2.SinglyLinkedList();
    int i57 = singlyLinkedList56.getSize();
    int i58 = singlyLinkedList56.getSize();
    boolean b59 = iP55.equals((java.lang.Object)singlyLinkedList56);
    tp2.IP iP64 = new tp2.IP((java.lang.Integer)(-619332132), (java.lang.Integer)96, (java.lang.Integer)268435500, (java.lang.Integer)2147483647);
    boolean b65 = singlyLinkedList56.remove(iP64);
    boolean b66 = singlyLinkedList56.isEmpty();
    tp2.IP iP71 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP71.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan75 = new tp2.IPBan(iP71, (java.lang.Long)100L);
    tp2.IP iP80 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP80.setFirst((java.lang.Integer)200);
    java.lang.Integer i83 = iP80.getFourth();
    iPBan75.setIp(iP80);
    java.lang.Long long85 = iPBan75.expires;
    iPBan75.expires = (-1L);
    iPBan75.setExpires((java.lang.Long)100L);
    iPBan75.expires = 10L;
    tp2.IP iP92 = iPBan75.getIp();
    iPBan75.expires = 1L;
    tp2.IP iP95 = iPBan75.ip;
    iP95.setThird((java.lang.Integer)72310545);
    boolean b98 = singlyLinkedList56.contains(iP95);
    boolean b99 = iP50.equals((java.lang.Object)iP95);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i29 + "' != '" + 200+ "'", i29.equals(200));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i30 + "' != '" + 100+ "'", i30.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i34 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i40 + "' != '" + (-1)+ "'", i40.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i41 + "' != '" + 100+ "'", i41.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i47 + "' != '" + (-1)+ "'", i47.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i57 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i58 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b59 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b65 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b66 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i83 + "' != '" + 100+ "'", i83.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long85 + "' != '" + 100L+ "'", long85.equals(100L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP92);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP95);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b98 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b99 == false);

  }

  @Test
  public void test139() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test139"); }


    java.lang.Integer i2 = java.lang.Integer.getInteger("17520006043", 40000000);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i2 + "' != '" + 40000000+ "'", i2.equals(40000000));

  }

  @Test
  public void test140() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test140"); }


    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList0 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b1 = strictlySortedSinglyLinkedList0.isEmpty();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList2 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b3 = strictlySortedSinglyLinkedList2.repOK();
    tp2.IP iP8 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    boolean b9 = strictlySortedSinglyLinkedList2.containsIP(iP8);
    tp2.Node node10 = strictlySortedSinglyLinkedList2.header;
    strictlySortedSinglyLinkedList0.header = node10;
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList12 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b13 = strictlySortedSinglyLinkedList12.repOK();
    strictlySortedSinglyLinkedList12.size = 1;
    strictlySortedSinglyLinkedList12.size = 0;
    tp2.IP iP22 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP22.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan26 = new tp2.IPBan(iP22, (java.lang.Long)100L);
    tp2.IP iP31 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP31.setFirst((java.lang.Integer)200);
    java.lang.Integer i34 = iP31.getFourth();
    iPBan26.setIp(iP31);
    boolean b36 = strictlySortedSinglyLinkedList12.contains(iPBan26);
    boolean b37 = strictlySortedSinglyLinkedList0.contains(iPBan26);
    tp2.SinglyLinkedList singlyLinkedList38 = new tp2.SinglyLinkedList();
    int i39 = singlyLinkedList38.getSize();
    int i40 = singlyLinkedList38.getSize();
    tp2.IP iP41 = null;
    boolean b42 = singlyLinkedList38.contains(iP41);
    tp2.IP iP44 = singlyLinkedList38.get(27);
    tp2.IP iP49 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP49.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan53 = new tp2.IPBan(iP49, (java.lang.Long)100L);
    tp2.IP iP54 = iPBan53.ip;
    tp2.IP iP59 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP59.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan63 = new tp2.IPBan(iP59, (java.lang.Long)100L);
    iPBan53.setIp(iP59);
    boolean b65 = singlyLinkedList38.remove(iP59);
    iPBan26.ip = iP59;
    java.lang.Integer i67 = iP59.getFourth();
    iP59.setSecond((java.lang.Integer)5);
    tp2.IPBan iPBan71 = new tp2.IPBan(iP59, (java.lang.Long)51756492L);
    tp2.IP iP72 = iPBan71.getIp();
    tp2.IP iP77 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP77.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan81 = new tp2.IPBan(iP77, (java.lang.Long)100L);
    tp2.IP iP82 = iPBan81.ip;
    java.lang.Long long83 = null;
    tp2.IPBan iPBan84 = new tp2.IPBan(iP82, long83);
    iPBan71.setIp(iP82);
    iPBan71.setExpires((java.lang.Long)2273280L);
    tp2.IP iP88 = iPBan71.ip;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i34 + "' != '" + 100+ "'", i34.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i39 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i40 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b65 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i67 + "' != '" + 100+ "'", i67.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP72);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP82);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP88);

  }

  @Test
  public void test141() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test141"); }


    // The following exception was thrown during execution in test generation
    try {
      java.lang.Integer i1 = java.lang.Integer.decode("11001000000000000010101101011100");
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

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test142"); }


    java.lang.Integer i1 = java.lang.Integer.decode("524420645");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 524420645+ "'", i1.equals(524420645));

  }

  @Test
  public void test143() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test143"); }


    java.lang.Integer i1 = new java.lang.Integer("666446313");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 666446313+ "'", i1.equals(666446313));

  }

  @Test
  public void test144() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test144"); }


    int i2 = java.lang.Integer.rotateRight((-1410709984), 133349376);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == (-1410709984));

  }

  @Test
  public void test145() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test145"); }


    tp2.IP iP4 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP4.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan8 = new tp2.IPBan(iP4, (java.lang.Long)100L);
    tp2.IP iP13 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP13.setFirst((java.lang.Integer)200);
    java.lang.Integer i16 = iP13.getFourth();
    iPBan8.setIp(iP13);
    java.lang.Long long18 = iPBan8.expires;
    tp2.IP iP23 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i24 = iP23.getSecond();
    iP23.setFirst((java.lang.Integer)11001000);
    iP23.setFirst((java.lang.Integer)32);
    iPBan8.setIp(iP23);
    java.lang.Long long30 = iPBan8.expires;
    iPBan8.setExpires((java.lang.Long)311L);
    tp2.IP iP33 = iPBan8.ip;
    java.lang.Long long34 = iPBan8.expires;
    tp2.IP iP35 = iPBan8.getIp();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i16 + "' != '" + 100+ "'", i16.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long18 + "' != '" + 100L+ "'", long18.equals(100L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i24 + "' != '" + (-1)+ "'", i24.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long30 + "' != '" + 100L+ "'", long30.equals(100L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long34 + "' != '" + 311L+ "'", long34.equals(311L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP35);

  }

  @Test
  public void test146() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test146"); }


    int i1 = java.lang.Integer.signum(2017330930);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 1);

  }

  @Test
  public void test147() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test147"); }


    tp2.IP iP4 = new tp2.IP((java.lang.Integer)67108864, (java.lang.Integer)(-2147483648), (java.lang.Integer)356246784, (java.lang.Integer)176016000);
    java.lang.Integer i5 = iP4.getThird();
    java.lang.Integer i6 = iP4.getFourth();
    tp2.IPBan iPBan8 = new tp2.IPBan(iP4, (java.lang.Long)167772160L);
    tp2.IP iP9 = iPBan8.getIp();
    java.lang.Long long10 = iPBan8.getExpires();
    iPBan8.setExpires((java.lang.Long)328L);
    iPBan8.setExpires((java.lang.Long)31457280L);
    iPBan8.setExpires((java.lang.Long)29L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i5 + "' != '" + 356246784+ "'", i5.equals(356246784));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i6 + "' != '" + 176016000+ "'", i6.equals(176016000));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long10 + "' != '" + 167772160L+ "'", long10.equals(167772160L));

  }

  @Test
  public void test148() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test148"); }


    // The following exception was thrown during execution in test generation
    try {
      int i1 = java.lang.Integer.parseUnsignedInt("1011100000000000000000");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test149() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test149"); }


    tp2.SinglyLinkedList singlyLinkedList0 = new tp2.SinglyLinkedList();
    int i1 = singlyLinkedList0.getSize();
    int i2 = singlyLinkedList0.getSize();
    tp2.IP iP3 = null;
    boolean b4 = singlyLinkedList0.contains(iP3);
    tp2.IP iP6 = singlyLinkedList0.get(27);
    boolean b7 = singlyLinkedList0.isEmpty();
    boolean b8 = singlyLinkedList0.isEmpty();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList9 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b10 = strictlySortedSinglyLinkedList9.repOK();
    tp2.IP iP15 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i16 = iP15.getSecond();
    iP15.setFirst((java.lang.Integer)11001000);
    iP15.setFirst((java.lang.Integer)(-2147483648));
    boolean b21 = strictlySortedSinglyLinkedList9.removeFromIP(iP15);
    tp2.IPBan iPBan23 = strictlySortedSinglyLinkedList9.get((-1));
    strictlySortedSinglyLinkedList9.size = 23;
    int i26 = strictlySortedSinglyLinkedList9.getSize();
    tp2.IP iP31 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i32 = iP31.getSecond();
    java.lang.Integer i33 = iP31.getFourth();
    iP31.setFirst((java.lang.Integer)5);
    tp2.IPBan iPBan37 = new tp2.IPBan(iP31, (java.lang.Long)0L);
    tp2.IP iP38 = iPBan37.getIp();
    tp2.IP iP39 = iPBan37.ip;
    tp2.IP iP40 = iPBan37.ip;
    boolean b41 = strictlySortedSinglyLinkedList9.removeFromIP(iP40);
    boolean b42 = singlyLinkedList0.contains(iP40);
    tp2.SinglyLinkedList singlyLinkedList43 = new tp2.SinglyLinkedList();
    int i44 = singlyLinkedList43.getSize();
    tp2.IP iP49 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i50 = iP49.getSecond();
    java.lang.Integer i51 = iP49.getFourth();
    singlyLinkedList43.add(iP49);
    tp2.IPBan iPBan54 = new tp2.IPBan(iP49, (java.lang.Long)1L);
    java.lang.Integer i55 = iP49.getThird();
    java.lang.Integer i56 = iP49.getFourth();
    java.lang.Integer i57 = iP49.getSecond();
    boolean b58 = singlyLinkedList0.remove(iP49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i16 + "' != '" + (-1)+ "'", i16.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iPBan23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i32 + "' != '" + (-1)+ "'", i32.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i33 + "' != '" + 100+ "'", i33.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i44 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i50 + "' != '" + (-1)+ "'", i50.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i51 + "' != '" + 100+ "'", i51.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i55 + "' != '" + (-1)+ "'", i55.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i56 + "' != '" + 100+ "'", i56.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i57 + "' != '" + (-1)+ "'", i57.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b58 == false);

  }

  @Test
  public void test150() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test150"); }


    int i2 = java.lang.Integer.rotateLeft(469910471, 152255728);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1137122306);

  }

  @Test
  public void test151() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test151"); }


    int i1 = java.lang.Integer.numberOfLeadingZeros(2365353);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 10);

  }

  @Test
  public void test152() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test152"); }


    java.lang.String str1 = java.lang.Integer.toUnsignedString(264023258);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "264023258"+ "'", str1.equals("264023258"));

  }

  @Test
  public void test153() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test153"); }


    tp2.IP iP4 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i5 = iP4.getSecond();
    iP4.setFirst((java.lang.Integer)11001000);
    java.lang.Long long8 = null;
    tp2.IPBan iPBan9 = new tp2.IPBan(iP4, long8);
    tp2.IP iP10 = iPBan9.ip;
    tp2.IP iP11 = iPBan9.ip;
    java.lang.Integer i12 = iP11.getSecond();
    iP11.setThird((java.lang.Integer)(-1471371072));
    java.lang.Long long15 = null;
    tp2.IPBan iPBan16 = new tp2.IPBan(iP11, long15);
    iPBan16.setExpires((java.lang.Long)27L);
    tp2.IP iP19 = iPBan16.ip;
    tp2.IP iP24 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i25 = iP24.getSecond();
    iP24.setFirst((java.lang.Integer)11001000);
    java.lang.Long long28 = null;
    tp2.IPBan iPBan29 = new tp2.IPBan(iP24, long28);
    tp2.IP iP30 = iPBan29.ip;
    tp2.IP iP31 = iPBan29.ip;
    tp2.IP iP32 = iPBan29.getIp();
    iP32.setThird((java.lang.Integer)1325400064);
    iPBan16.setIp(iP32);
    iP32.setFirst((java.lang.Integer)734832);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i5 + "' != '" + (-1)+ "'", i5.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i12 + "' != '" + (-1)+ "'", i12.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i25 + "' != '" + (-1)+ "'", i25.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP32);

  }

  @Test
  public void test154() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test154"); }


    int i2 = java.lang.Integer.sum((-1135833984), 8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == (-1135833976));

  }

  @Test
  public void test155() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test155"); }


    long long1 = java.lang.Integer.toUnsignedLong(8650752);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == 8650752L);

  }

  @Test
  public void test156() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test156"); }


    int i2 = java.lang.Integer.compare(1152, (-486538303));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);

  }

  @Test
  public void test157() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test157"); }


    // The following exception was thrown during execution in test generation
    try {
      int i2 = java.lang.Integer.parseUnsignedInt("101111111101110010101101", 1274564089);
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test158() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test158"); }


    int i2 = java.lang.Integer.compare(372963, (-327155712));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);

  }

  @Test
  public void test159() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test159"); }


    int i2 = java.lang.Integer.compareUnsigned((-1849679071), 346729220);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);

  }

  @Test
  public void test160() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test160"); }


    java.lang.Integer i2 = java.lang.Integer.getInteger("11010000011011000011001100", (java.lang.Integer)(-1310062848));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i2 + "' != '" + (-1310062848)+ "'", i2.equals((-1310062848)));

  }

  @Test
  public void test161() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test161"); }


    int i1 = java.lang.Integer.parseInt("31130880");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 31130880);

  }

  @Test
  public void test162() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test162"); }


    int i2 = java.lang.Integer.divideUnsigned(33554560, (-637534016));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);

  }

  @Test
  public void test163() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test163"); }


    int i2 = java.lang.Integer.min(352838938, 13631488);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 13631488);

  }

  @Test
  public void test164() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test164"); }


    int i1 = java.lang.Integer.signum(2046820352);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 1);

  }

  @Test
  public void test165() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test165"); }


    int i2 = java.lang.Integer.divideUnsigned(54086648, 2045949952);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);

  }

  @Test
  public void test166() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test166"); }


    int i2 = java.lang.Integer.sum(11100, 17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 11117);

  }

  @Test
  public void test167() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test167"); }


    int i2 = java.lang.Integer.rotateRight(1242756, 1431647489);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 621378);

  }

  @Test
  public void test168() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test168"); }


    int i1 = java.lang.Integer.reverseBytes(734003200);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 49195);

  }

  @Test
  public void test169() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test169"); }


    // The following exception was thrown during execution in test generation
    try {
      int i2 = java.lang.Integer.parseInt("1010000000000000000000000", (-234815488));
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test170() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test170"); }


    long long1 = java.lang.Integer.toUnsignedLong(75778);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == 75778L);

  }

  @Test
  public void test171() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test171"); }


    int i2 = java.lang.Integer.compareUnsigned((-838860791), 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);

  }

  @Test
  public void test172() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test172"); }


    int i2 = java.lang.Integer.divideUnsigned((-519690240), 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == (-519690240));

  }

  @Test
  public void test173() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test173"); }


    tp2.SinglyLinkedList singlyLinkedList0 = new tp2.SinglyLinkedList();
    int i1 = singlyLinkedList0.getSize();
    int i2 = singlyLinkedList0.getSize();
    tp2.IP iP3 = null;
    boolean b4 = singlyLinkedList0.contains(iP3);
    tp2.IP iP6 = singlyLinkedList0.get(27);
    tp2.IP iP11 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP11.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan15 = new tp2.IPBan(iP11, (java.lang.Long)100L);
    tp2.IP iP16 = iPBan15.ip;
    tp2.IP iP21 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP21.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan25 = new tp2.IPBan(iP21, (java.lang.Long)100L);
    iPBan15.setIp(iP21);
    boolean b27 = singlyLinkedList0.remove(iP21);
    boolean b28 = singlyLinkedList0.repOK();
    boolean b29 = singlyLinkedList0.repOK();
    boolean b30 = singlyLinkedList0.repOK();
    tp2.SinglyLinkedList singlyLinkedList31 = new tp2.SinglyLinkedList();
    boolean b32 = singlyLinkedList31.repOK();
    tp2.IP iP34 = singlyLinkedList31.get(200);
    boolean b35 = singlyLinkedList31.isEmpty();
    tp2.IP iP40 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i41 = iP40.getThird();
    boolean b42 = singlyLinkedList31.remove(iP40);
    tp2.IP iP47 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP47.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan51 = new tp2.IPBan(iP47, (java.lang.Long)100L);
    tp2.IP iP52 = iPBan51.ip;
    tp2.IP iP53 = iPBan51.getIp();
    java.lang.Integer i54 = null;
    iP53.setFirst(i54);
    boolean b56 = singlyLinkedList31.contains(iP53);
    tp2.IP iP61 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP61.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan65 = new tp2.IPBan(iP61, (java.lang.Long)100L);
    java.lang.Integer i66 = iP61.getFirst();
    java.lang.Integer i67 = iP61.getFourth();
    singlyLinkedList31.add(iP61);
    boolean b70 = iP61.equals((java.lang.Object)30);
    boolean b71 = singlyLinkedList0.remove(iP61);
    tp2.IP iP73 = singlyLinkedList0.get(637534296);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i41 + "' != '" + (-1)+ "'", i41.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b56 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i66 + "' != '" + 200+ "'", i66.equals(200));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i67 + "' != '" + 100+ "'", i67.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b70 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b71 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP73);

  }

  @Test
  public void test174() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test174"); }


    int i2 = java.lang.Integer.rotateRight(2088174752, 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 2088174752);

  }

  @Test
  public void test175() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test175"); }


    int i2 = java.lang.Integer.remainderUnsigned(37, 194);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 37);

  }

  @Test
  public void test176() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test176"); }


    long long1 = java.lang.Integer.toUnsignedLong((-1324744699));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == 2970222597L);

  }

  @Test
  public void test177() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test177"); }


    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList0 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b1 = strictlySortedSinglyLinkedList0.repOK();
    tp2.IP iP6 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    boolean b7 = strictlySortedSinglyLinkedList0.containsIP(iP6);
    tp2.Node node8 = strictlySortedSinglyLinkedList0.header;
    strictlySortedSinglyLinkedList0.size = 37469776;
    int i11 = strictlySortedSinglyLinkedList0.size;
    tp2.IPBan iPBan13 = strictlySortedSinglyLinkedList0.get(40000000);
    tp2.IP iP18 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP18.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan22 = new tp2.IPBan(iP18, (java.lang.Long)100L);
    tp2.IP iP23 = iPBan22.ip;
    tp2.IP iP28 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP28.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan32 = new tp2.IPBan(iP28, (java.lang.Long)100L);
    iPBan22.setIp(iP28);
    tp2.IP iP38 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP38.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan42 = new tp2.IPBan(iP38, (java.lang.Long)100L);
    java.lang.Integer i43 = iP38.getFirst();
    java.lang.Integer i44 = iP38.getFourth();
    iPBan22.setIp(iP38);
    tp2.IP iP46 = iPBan22.getIp();
    tp2.IP iP47 = iPBan22.getIp();
    tp2.SinglyLinkedList singlyLinkedList48 = new tp2.SinglyLinkedList();
    int i49 = singlyLinkedList48.getSize();
    tp2.IP iP54 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i55 = iP54.getSecond();
    java.lang.Integer i56 = iP54.getFourth();
    singlyLinkedList48.add(iP54);
    tp2.IP iP59 = singlyLinkedList48.get(5);
    boolean b60 = singlyLinkedList48.repOK();
    tp2.IP iP62 = singlyLinkedList48.get(2013265920);
    tp2.SinglyLinkedList singlyLinkedList63 = new tp2.SinglyLinkedList();
    int i64 = singlyLinkedList63.getSize();
    tp2.IP iP69 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i70 = iP69.getSecond();
    java.lang.Integer i71 = iP69.getFourth();
    singlyLinkedList63.add(iP69);
    iP69.setFourth((java.lang.Integer)167772160);
    singlyLinkedList48.add(iP69);
    iPBan22.ip = iP69;
    boolean b77 = strictlySortedSinglyLinkedList0.add(iPBan22);
    boolean b78 = strictlySortedSinglyLinkedList0.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 37469776);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iPBan13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i43 + "' != '" + 200+ "'", i43.equals(200));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i44 + "' != '" + 100+ "'", i44.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i49 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i55 + "' != '" + (-1)+ "'", i55.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i56 + "' != '" + 100+ "'", i56.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP59);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b60 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP62);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i64 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i70 + "' != '" + (-1)+ "'", i70.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i71 + "' != '" + 100+ "'", i71.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b77 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b78 == false);

  }

  @Test
  public void test178() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test178"); }


    int i1 = java.lang.Integer.signum(27744);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 1);

  }

  @Test
  public void test179() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test179"); }


    // The following exception was thrown during execution in test generation
    try {
      java.lang.Integer i1 = new java.lang.Integer("1001110111110010111100011");
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

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test180"); }


    tp2.IP iP4 = new tp2.IP((java.lang.Integer)356246784, (java.lang.Integer)(-939524096), (java.lang.Integer)2013265928, (java.lang.Integer)(-2147483648));
    java.lang.Integer i5 = iP4.getThird();
    iP4.setSecond((java.lang.Integer)2013265928);
    java.lang.Long long8 = null;
    tp2.IPBan iPBan9 = new tp2.IPBan(iP4, long8);
    tp2.IP iP10 = iPBan9.getIp();
    iPBan9.setExpires((java.lang.Long)20971520L);
    iPBan9.setExpires((java.lang.Long)624000L);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList15 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b16 = strictlySortedSinglyLinkedList15.repOK();
    boolean b17 = strictlySortedSinglyLinkedList15.repOK();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList18 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b19 = strictlySortedSinglyLinkedList18.isEmpty();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList20 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b21 = strictlySortedSinglyLinkedList20.repOK();
    tp2.IP iP26 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    boolean b27 = strictlySortedSinglyLinkedList20.containsIP(iP26);
    tp2.Node node28 = strictlySortedSinglyLinkedList20.header;
    strictlySortedSinglyLinkedList18.header = node28;
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList30 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b31 = strictlySortedSinglyLinkedList30.repOK();
    strictlySortedSinglyLinkedList30.size = 1;
    strictlySortedSinglyLinkedList30.size = 0;
    tp2.IP iP40 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP40.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan44 = new tp2.IPBan(iP40, (java.lang.Long)100L);
    tp2.IP iP49 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP49.setFirst((java.lang.Integer)200);
    java.lang.Integer i52 = iP49.getFourth();
    iPBan44.setIp(iP49);
    boolean b54 = strictlySortedSinglyLinkedList30.contains(iPBan44);
    boolean b55 = strictlySortedSinglyLinkedList18.contains(iPBan44);
    boolean b56 = strictlySortedSinglyLinkedList15.add(iPBan44);
    tp2.SinglyLinkedList singlyLinkedList57 = new tp2.SinglyLinkedList();
    int i58 = singlyLinkedList57.getSize();
    tp2.IP iP63 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i64 = iP63.getSecond();
    java.lang.Integer i65 = iP63.getFourth();
    singlyLinkedList57.add(iP63);
    tp2.IPBan iPBan68 = new tp2.IPBan(iP63, (java.lang.Long)100L);
    tp2.IPBan iPBan70 = new tp2.IPBan(iP63, (java.lang.Long)(-1L));
    boolean b71 = strictlySortedSinglyLinkedList15.containsIP(iP63);
    java.lang.Integer i72 = iP63.getFourth();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList73 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b74 = strictlySortedSinglyLinkedList73.repOK();
    tp2.IP iP79 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    boolean b80 = strictlySortedSinglyLinkedList73.containsIP(iP79);
    java.lang.Integer i81 = iP79.getFirst();
    iP79.setFourth((java.lang.Integer)211631616);
    java.lang.Integer i84 = iP79.getFirst();
    boolean b85 = iP63.equals((java.lang.Object)i84);
    iPBan9.setIp(iP63);
    iPBan9.setExpires((java.lang.Long)20480L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i5 + "' != '" + 2013265928+ "'", i5.equals(2013265928));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i52 + "' != '" + 100+ "'", i52.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b54 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b55 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b56 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i58 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i64 + "' != '" + (-1)+ "'", i64.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i65 + "' != '" + 100+ "'", i65.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b71 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i72 + "' != '" + 100+ "'", i72.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b74 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b80 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i81 + "' != '" + (-1)+ "'", i81.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i84 + "' != '" + (-1)+ "'", i84.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b85 == false);

  }

  @Test
  public void test181() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test181"); }


    // The following exception was thrown during execution in test generation
    try {
      int i2 = java.lang.Integer.parseInt("111010010", 184549395);
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test182() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test182"); }


    int i1 = java.lang.Integer.reverseBytes(513015808);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 37918);

  }

  @Test
  public void test183() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test183"); }


    int i2 = java.lang.Integer.min((-744603250), 11001000);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == (-744603250));

  }

  @Test
  public void test184() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test184"); }


    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList0 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b1 = strictlySortedSinglyLinkedList0.repOK();
    strictlySortedSinglyLinkedList0.size = 1;
    strictlySortedSinglyLinkedList0.size = 0;
    tp2.IP iP10 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP10.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan14 = new tp2.IPBan(iP10, (java.lang.Long)100L);
    tp2.IP iP15 = iPBan14.ip;
    boolean b16 = strictlySortedSinglyLinkedList0.contains(iPBan14);
    tp2.IP iP21 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i22 = iP21.getSecond();
    iP21.setFirst((java.lang.Integer)11001000);
    java.lang.Long long25 = null;
    tp2.IPBan iPBan26 = new tp2.IPBan(iP21, long25);
    java.lang.Long long27 = iPBan26.getExpires();
    boolean b28 = strictlySortedSinglyLinkedList0.contains(iPBan26);
    tp2.IP iP29 = iPBan26.ip;
    java.lang.Long long30 = iPBan26.expires;
    tp2.IP iP31 = iPBan26.ip;
    tp2.IP iP36 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP36.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan40 = new tp2.IPBan(iP36, (java.lang.Long)100L);
    iP36.setFourth((java.lang.Integer)32);
    java.lang.Integer i43 = iP36.getFirst();
    iP36.setSecond((java.lang.Integer)(-1275068414));
    iPBan26.setIp(iP36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i22 + "' != '" + (-1)+ "'", i22.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(long27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(long30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i43 + "' != '" + 200+ "'", i43.equals(200));

  }

  @Test
  public void test185() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test185"); }


    int i2 = java.lang.Integer.sum(34688, (-2119381594));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == (-2119346906));

  }

  @Test
  public void test186() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test186"); }


    int i2 = java.lang.Integer.rotateRight(11117, 637534224);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 728563712);

  }

  @Test
  public void test187() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test187"); }


    // The following exception was thrown during execution in test generation
    try {
      int i2 = java.lang.Integer.parseInt("11000000100110100011111001110110", (-1475958102));
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

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test188"); }


    int i1 = java.lang.Integer.numberOfLeadingZeros(2610775);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 10);

  }

  @Test
  public void test189() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test189"); }


    int i2 = java.lang.Integer.rotateRight((-1679818741), 111);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1521600);

  }

  @Test
  public void test190() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test190"); }


    int i1 = java.lang.Integer.parseInt("11343");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 11343);

  }

  @Test
  public void test191() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test191"); }


    int i2 = java.lang.Integer.remainderUnsigned(3615292, (-756809969));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 3615292);

  }

  @Test
  public void test192() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test192"); }


    int i1 = java.lang.Integer.lowestOneBit(805307104);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 32);

  }

  @Test
  public void test193() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test193"); }


    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList0 = new tp2.StrictlySortedSinglyLinkedList();
    int i1 = strictlySortedSinglyLinkedList0.size;
    tp2.IP iP6 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP6.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan10 = new tp2.IPBan(iP6, (java.lang.Long)100L);
    tp2.IP iP11 = iPBan10.ip;
    tp2.IP iP16 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i17 = iP16.getFourth();
    java.lang.Integer i18 = iP16.getFourth();
    iP16.setThird((java.lang.Integer)200);
    iPBan10.ip = iP16;
    boolean b22 = strictlySortedSinglyLinkedList0.add(iPBan10);
    strictlySortedSinglyLinkedList0.size = 2147483646;
    tp2.IP iP29 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP29.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan33 = new tp2.IPBan(iP29, (java.lang.Long)100L);
    tp2.IP iP34 = iPBan33.ip;
    tp2.IP iP39 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP39.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan43 = new tp2.IPBan(iP39, (java.lang.Long)100L);
    iPBan33.setIp(iP39);
    tp2.IP iP49 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP49.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan53 = new tp2.IPBan(iP49, (java.lang.Long)100L);
    java.lang.Integer i54 = iP49.getFirst();
    java.lang.Integer i55 = iP49.getFourth();
    iPBan33.setIp(iP49);
    tp2.IP iP57 = iPBan33.getIp();
    iPBan33.expires = 20971520L;
    iPBan33.expires = 3355443200L;
    iPBan33.setExpires((java.lang.Long)4L);
    boolean b64 = strictlySortedSinglyLinkedList0.contains(iPBan33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i17 + "' != '" + 100+ "'", i17.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i18 + "' != '" + 100+ "'", i18.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i54 + "' != '" + 200+ "'", i54.equals(200));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i55 + "' != '" + 100+ "'", i55.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b64 == false);

  }

  @Test
  public void test194() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test194"); }


    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList0 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b1 = strictlySortedSinglyLinkedList0.repOK();
    strictlySortedSinglyLinkedList0.size = 1;
    strictlySortedSinglyLinkedList0.size = 0;
    tp2.IPBan iPBan6 = null;
    boolean b7 = strictlySortedSinglyLinkedList0.add(iPBan6);
    boolean b8 = strictlySortedSinglyLinkedList0.isEmpty();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList9 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b10 = strictlySortedSinglyLinkedList9.repOK();
    strictlySortedSinglyLinkedList9.size = 1;
    strictlySortedSinglyLinkedList9.size = 0;
    tp2.IP iP19 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP19.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan23 = new tp2.IPBan(iP19, (java.lang.Long)100L);
    tp2.IP iP24 = iPBan23.ip;
    boolean b25 = strictlySortedSinglyLinkedList9.contains(iPBan23);
    boolean b26 = strictlySortedSinglyLinkedList9.repOK();
    tp2.SinglyLinkedList singlyLinkedList27 = new tp2.SinglyLinkedList();
    int i28 = singlyLinkedList27.getSize();
    tp2.IP iP33 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i34 = iP33.getSecond();
    java.lang.Integer i35 = iP33.getFourth();
    singlyLinkedList27.add(iP33);
    boolean b38 = iP33.equals((java.lang.Object)2147483647);
    tp2.IPBan iPBan40 = new tp2.IPBan(iP33, (java.lang.Long)(-1L));
    boolean b41 = strictlySortedSinglyLinkedList9.add(iPBan40);
    tp2.SinglyLinkedList singlyLinkedList42 = new tp2.SinglyLinkedList();
    int i43 = singlyLinkedList42.getSize();
    tp2.IP iP48 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i49 = iP48.getSecond();
    java.lang.Integer i50 = iP48.getFourth();
    singlyLinkedList42.add(iP48);
    tp2.IPBan iPBan53 = new tp2.IPBan(iP48, (java.lang.Long)1L);
    boolean b54 = strictlySortedSinglyLinkedList9.containsIP(iP48);
    int i55 = strictlySortedSinglyLinkedList9.getSize();
    strictlySortedSinglyLinkedList9.size = 11001000;
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList58 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b59 = strictlySortedSinglyLinkedList58.repOK();
    tp2.IP iP64 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i65 = iP64.getSecond();
    iP64.setFirst((java.lang.Integer)11001000);
    iP64.setFirst((java.lang.Integer)(-2147483648));
    boolean b70 = strictlySortedSinglyLinkedList58.removeFromIP(iP64);
    tp2.Node node71 = strictlySortedSinglyLinkedList58.header;
    strictlySortedSinglyLinkedList58.size = (-1);
    tp2.Node node74 = strictlySortedSinglyLinkedList58.header;
    strictlySortedSinglyLinkedList9.header = node74;
    strictlySortedSinglyLinkedList0.header = node74;
    boolean b77 = strictlySortedSinglyLinkedList0.isEmpty();
    tp2.Node node78 = strictlySortedSinglyLinkedList0.header;
    tp2.IP iP83 = new tp2.IP((java.lang.Integer)20971520, (java.lang.Integer)101, (java.lang.Integer)2013265920, (java.lang.Integer)51756250);
    boolean b84 = strictlySortedSinglyLinkedList0.removeFromIP(iP83);
    iP83.setSecond((java.lang.Integer)88);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i34 + "' != '" + (-1)+ "'", i34.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i35 + "' != '" + 100+ "'", i35.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i43 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i49 + "' != '" + (-1)+ "'", i49.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i50 + "' != '" + 100+ "'", i50.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b54 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i55 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b59 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i65 + "' != '" + (-1)+ "'", i65.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b70 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node71);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node74);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b77 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node78);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b84 == false);

  }

  @Test
  public void test195() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test195"); }


    int i1 = java.lang.Integer.signum(155300400);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 1);

  }

  @Test
  public void test196() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test196"); }


    int i1 = java.lang.Integer.parseUnsignedInt("18970624");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 18970624);

  }

  @Test
  public void test197() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test197"); }


    int i2 = java.lang.Integer.divideUnsigned(614116910, 402653440);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);

  }

  @Test
  public void test198() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test198"); }


    tp2.IP iP4 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i5 = iP4.getSecond();
    java.lang.Integer i6 = iP4.getFourth();
    iP4.setFirst((java.lang.Integer)5);
    tp2.IPBan iPBan10 = new tp2.IPBan(iP4, (java.lang.Long)0L);
    tp2.IP iP11 = iPBan10.getIp();
    tp2.IP iP12 = iPBan10.ip;
    tp2.IP iP13 = iPBan10.ip;
    tp2.IP iP18 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP18.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan22 = new tp2.IPBan(iP18, (java.lang.Long)100L);
    tp2.IP iP23 = iPBan22.ip;
    tp2.IP iP28 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP28.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan32 = new tp2.IPBan(iP28, (java.lang.Long)100L);
    iPBan22.setIp(iP28);
    iPBan22.expires = 2013265920L;
    tp2.SinglyLinkedList singlyLinkedList36 = new tp2.SinglyLinkedList();
    int i37 = singlyLinkedList36.getSize();
    tp2.IP iP42 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i43 = iP42.getSecond();
    java.lang.Integer i44 = iP42.getFourth();
    singlyLinkedList36.add(iP42);
    tp2.IPBan iPBan47 = new tp2.IPBan(iP42, (java.lang.Long)100L);
    iPBan22.setIp(iP42);
    tp2.IPBan iPBan50 = new tp2.IPBan(iP42, (java.lang.Long)2147483648L);
    iPBan10.setIp(iP42);
    tp2.IP iP52 = iPBan10.ip;
    tp2.IP iP53 = iPBan10.getIp();
    tp2.IP iP54 = iPBan10.getIp();
    iP54.setThird((java.lang.Integer)1778450432);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i5 + "' != '" + (-1)+ "'", i5.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i6 + "' != '" + 100+ "'", i6.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i37 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i43 + "' != '" + (-1)+ "'", i43.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i44 + "' != '" + 100+ "'", i44.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP54);

  }

  @Test
  public void test199() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test199"); }


    int i1 = java.lang.Integer.reverseBytes(35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 587202560);

  }

  @Test
  public void test200() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test200"); }


    int i1 = java.lang.Integer.bitCount((-129235965));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 11);

  }

  @Test
  public void test201() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test201"); }


    tp2.SinglyLinkedList singlyLinkedList0 = new tp2.SinglyLinkedList();
    int i1 = singlyLinkedList0.getSize();
    tp2.IP iP6 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP6.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan10 = new tp2.IPBan(iP6, (java.lang.Long)100L);
    tp2.IP iP11 = iPBan10.ip;
    tp2.SinglyLinkedList singlyLinkedList12 = new tp2.SinglyLinkedList();
    int i13 = singlyLinkedList12.getSize();
    tp2.IP iP18 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i19 = iP18.getSecond();
    java.lang.Integer i20 = iP18.getFourth();
    singlyLinkedList12.add(iP18);
    boolean b22 = iP11.equals((java.lang.Object)iP18);
    boolean b23 = singlyLinkedList0.remove(iP11);
    int i24 = singlyLinkedList0.getSize();
    tp2.IP iP29 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i30 = iP29.getSecond();
    iP29.setFirst((java.lang.Integer)11001000);
    iP29.setFirst((java.lang.Integer)(-2147483648));
    java.lang.Integer i35 = iP29.getThird();
    boolean b36 = singlyLinkedList0.contains(iP29);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList37 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b38 = strictlySortedSinglyLinkedList37.repOK();
    tp2.IP iP43 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    boolean b44 = strictlySortedSinglyLinkedList37.containsIP(iP43);
    tp2.Node node45 = strictlySortedSinglyLinkedList37.header;
    boolean b46 = strictlySortedSinglyLinkedList37.isEmpty();
    int i47 = strictlySortedSinglyLinkedList37.getSize();
    int i48 = strictlySortedSinglyLinkedList37.getSize();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList49 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b50 = strictlySortedSinglyLinkedList49.repOK();
    tp2.IP iP55 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    boolean b56 = strictlySortedSinglyLinkedList49.containsIP(iP55);
    tp2.Node node57 = strictlySortedSinglyLinkedList49.header;
    boolean b58 = strictlySortedSinglyLinkedList49.isEmpty();
    int i59 = strictlySortedSinglyLinkedList49.getSize();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList60 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b61 = strictlySortedSinglyLinkedList60.repOK();
    tp2.IP iP66 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i67 = iP66.getSecond();
    iP66.setFirst((java.lang.Integer)11001000);
    iP66.setFirst((java.lang.Integer)(-2147483648));
    boolean b72 = strictlySortedSinglyLinkedList60.removeFromIP(iP66);
    tp2.Node node73 = strictlySortedSinglyLinkedList60.header;
    strictlySortedSinglyLinkedList49.header = node73;
    tp2.IPBan iPBan76 = strictlySortedSinglyLinkedList49.get(51756250);
    tp2.Node node77 = strictlySortedSinglyLinkedList49.header;
    strictlySortedSinglyLinkedList37.header = node77;
    boolean b79 = iP29.equals((java.lang.Object)strictlySortedSinglyLinkedList37);
    boolean b80 = strictlySortedSinglyLinkedList37.repOK();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i19 + "' != '" + (-1)+ "'", i19.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i20 + "' != '" + 100+ "'", i20.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i30 + "' != '" + (-1)+ "'", i30.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i35 + "' != '" + (-1)+ "'", i35.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b46 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i47 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i48 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b50 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b56 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b58 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i59 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b61 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i67 + "' != '" + (-1)+ "'", i67.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b72 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node73);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iPBan76);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node77);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b79 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b80 == true);

  }

  @Test
  public void test202() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test202"); }


    int i1 = java.lang.Integer.bitCount(50331872);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 5);

  }

  @Test
  public void test203() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test203"); }


    long long1 = java.lang.Integer.toUnsignedLong(1308370);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == 1308370L);

  }

  @Test
  public void test204() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test204"); }


    int i2 = java.lang.Integer.max(40960, 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 40960);

  }

  @Test
  public void test205() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test205"); }


    tp2.IP iP4 = new tp2.IP((java.lang.Integer)4194304, (java.lang.Integer)14, (java.lang.Integer)1073741824, (java.lang.Integer)(-2144796578));
    java.lang.Integer i5 = iP4.getFourth();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i5 + "' != '" + (-2144796578)+ "'", i5.equals((-2144796578)));

  }

  @Test
  public void test206() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test206"); }


    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList0 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b1 = strictlySortedSinglyLinkedList0.repOK();
    tp2.IP iP6 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i7 = iP6.getSecond();
    iP6.setFirst((java.lang.Integer)11001000);
    iP6.setFirst((java.lang.Integer)(-2147483648));
    boolean b12 = strictlySortedSinglyLinkedList0.removeFromIP(iP6);
    tp2.IPBan iPBan14 = strictlySortedSinglyLinkedList0.get((-1));
    strictlySortedSinglyLinkedList0.size = 23;
    boolean b17 = strictlySortedSinglyLinkedList0.isEmpty();
    boolean b18 = strictlySortedSinglyLinkedList0.isEmpty();
    tp2.Node node19 = strictlySortedSinglyLinkedList0.header;
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList20 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b21 = strictlySortedSinglyLinkedList20.repOK();
    strictlySortedSinglyLinkedList20.size = 1;
    strictlySortedSinglyLinkedList20.size = 0;
    tp2.IPBan iPBan26 = null;
    boolean b27 = strictlySortedSinglyLinkedList20.add(iPBan26);
    int i28 = strictlySortedSinglyLinkedList20.getSize();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList29 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b30 = strictlySortedSinglyLinkedList29.repOK();
    tp2.IP iP35 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    boolean b36 = strictlySortedSinglyLinkedList29.containsIP(iP35);
    tp2.Node node37 = strictlySortedSinglyLinkedList29.header;
    boolean b38 = strictlySortedSinglyLinkedList29.isEmpty();
    int i39 = strictlySortedSinglyLinkedList29.getSize();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList40 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b41 = strictlySortedSinglyLinkedList40.repOK();
    tp2.IP iP46 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i47 = iP46.getSecond();
    iP46.setFirst((java.lang.Integer)11001000);
    iP46.setFirst((java.lang.Integer)(-2147483648));
    boolean b52 = strictlySortedSinglyLinkedList40.removeFromIP(iP46);
    tp2.Node node53 = strictlySortedSinglyLinkedList40.header;
    strictlySortedSinglyLinkedList29.header = node53;
    strictlySortedSinglyLinkedList20.header = node53;
    tp2.IP iP60 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i61 = iP60.getSecond();
    iP60.setFirst((java.lang.Integer)11001000);
    java.lang.Long long64 = null;
    tp2.IPBan iPBan65 = new tp2.IPBan(iP60, long64);
    tp2.IP iP66 = iPBan65.ip;
    tp2.IP iP67 = iPBan65.ip;
    tp2.IP iP68 = iPBan65.getIp();
    iPBan65.setExpires((java.lang.Long)29L);
    boolean b71 = strictlySortedSinglyLinkedList20.add(iPBan65);
    iPBan65.setExpires((java.lang.Long)75809L);
    boolean b74 = strictlySortedSinglyLinkedList0.contains(iPBan65);
    int i75 = strictlySortedSinglyLinkedList0.getSize();
    strictlySortedSinglyLinkedList0.size = 1274564089;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i7 + "' != '" + (-1)+ "'", i7.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iPBan14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i39 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i47 + "' != '" + (-1)+ "'", i47.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b52 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i61 + "' != '" + (-1)+ "'", i61.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP66);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP67);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP68);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b71 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b74 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i75 == 23);

  }

  @Test
  public void test207() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test207"); }


    int i2 = java.lang.Integer.rotateRight(29696, (-671088478));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 7424);

  }

  @Test
  public void test208() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test208"); }


    int i1 = java.lang.Integer.numberOfLeadingZeros(396859008);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 3);

  }

  @Test
  public void test209() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test209"); }


    // The following exception was thrown during execution in test generation
    try {
      java.lang.Integer i2 = java.lang.Integer.valueOf("3355443200", (-671088478));
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test210() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test210"); }


    // The following exception was thrown during execution in test generation
    try {
      java.lang.Integer i1 = java.lang.Integer.decode("2684354560");
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

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test211"); }


    tp2.SinglyLinkedList singlyLinkedList0 = new tp2.SinglyLinkedList();
    int i1 = singlyLinkedList0.getSize();
    tp2.IP iP6 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i7 = iP6.getSecond();
    java.lang.Integer i8 = iP6.getFourth();
    singlyLinkedList0.add(iP6);
    tp2.IPBan iPBan11 = new tp2.IPBan(iP6, (java.lang.Long)1L);
    tp2.IPBan iPBan13 = new tp2.IPBan(iP6, (java.lang.Long)100L);
    iP6.setFirst((java.lang.Integer)117440667);
    tp2.SinglyLinkedList singlyLinkedList16 = new tp2.SinglyLinkedList();
    boolean b17 = singlyLinkedList16.repOK();
    tp2.IP iP22 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP22.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan26 = new tp2.IPBan(iP22, (java.lang.Long)100L);
    tp2.IP iP31 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP31.setFirst((java.lang.Integer)200);
    java.lang.Integer i34 = iP31.getFourth();
    iPBan26.setIp(iP31);
    singlyLinkedList16.add(iP31);
    int i37 = singlyLinkedList16.getSize();
    boolean b38 = iP6.equals((java.lang.Object)singlyLinkedList16);
    boolean b39 = singlyLinkedList16.repOK();
    boolean b40 = singlyLinkedList16.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i7 + "' != '" + (-1)+ "'", i7.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i8 + "' != '" + 100+ "'", i8.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i34 + "' != '" + 100+ "'", i34.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i37 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == false);

  }

  @Test
  public void test212() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test212"); }


    int i1 = java.lang.Integer.reverse((-1677719624));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 501219385);

  }

  @Test
  public void test213() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test213"); }


    int i1 = java.lang.Integer.numberOfTrailingZeros(303104);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 13);

  }

  @Test
  public void test214() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test214"); }


    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList0 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b1 = strictlySortedSinglyLinkedList0.repOK();
    tp2.IP iP6 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i7 = iP6.getSecond();
    iP6.setFirst((java.lang.Integer)11001000);
    iP6.setFirst((java.lang.Integer)(-2147483648));
    boolean b12 = strictlySortedSinglyLinkedList0.removeFromIP(iP6);
    tp2.IPBan iPBan13 = null;
    boolean b14 = strictlySortedSinglyLinkedList0.add(iPBan13);
    tp2.Node node15 = strictlySortedSinglyLinkedList0.header;
    tp2.Node node16 = strictlySortedSinglyLinkedList0.header;
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList17 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b18 = strictlySortedSinglyLinkedList17.repOK();
    tp2.IP iP23 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i24 = iP23.getSecond();
    iP23.setFirst((java.lang.Integer)11001000);
    iP23.setFirst((java.lang.Integer)(-2147483648));
    boolean b29 = strictlySortedSinglyLinkedList17.removeFromIP(iP23);
    tp2.Node node30 = strictlySortedSinglyLinkedList17.header;
    strictlySortedSinglyLinkedList0.header = node30;
    boolean b32 = strictlySortedSinglyLinkedList0.repOK();
    tp2.IP iP37 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP37.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan41 = new tp2.IPBan(iP37, (java.lang.Long)100L);
    tp2.IP iP46 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i47 = iP46.getSecond();
    java.lang.Integer i48 = iP46.getFourth();
    iP46.setFirst((java.lang.Integer)5);
    iPBan41.ip = iP46;
    java.lang.Long long52 = iPBan41.getExpires();
    iPBan41.expires = 2147483648L;
    tp2.IP iP59 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP59.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan63 = new tp2.IPBan(iP59, (java.lang.Long)100L);
    tp2.IP iP64 = iPBan63.ip;
    tp2.SinglyLinkedList singlyLinkedList65 = new tp2.SinglyLinkedList();
    int i66 = singlyLinkedList65.getSize();
    tp2.IP iP71 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i72 = iP71.getSecond();
    java.lang.Integer i73 = iP71.getFourth();
    singlyLinkedList65.add(iP71);
    boolean b75 = iP64.equals((java.lang.Object)iP71);
    iPBan41.ip = iP71;
    java.lang.Long long77 = iPBan41.expires;
    boolean b78 = strictlySortedSinglyLinkedList0.add(iPBan41);
    java.lang.Long long79 = iPBan41.expires;
    java.lang.Long long80 = iPBan41.getExpires();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i7 + "' != '" + (-1)+ "'", i7.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i24 + "' != '" + (-1)+ "'", i24.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i47 + "' != '" + (-1)+ "'", i47.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i48 + "' != '" + 100+ "'", i48.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long52 + "' != '" + 100L+ "'", long52.equals(100L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP64);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i66 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i72 + "' != '" + (-1)+ "'", i72.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i73 + "' != '" + 100+ "'", i73.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b75 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long77 + "' != '" + 2147483648L+ "'", long77.equals(2147483648L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b78 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long79 + "' != '" + 2147483648L+ "'", long79.equals(2147483648L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long80 + "' != '" + 2147483648L+ "'", long80.equals(2147483648L));

  }

  @Test
  public void test215() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test215"); }


    long long1 = java.lang.Integer.toUnsignedLong(3801088);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == 3801088L);

  }

  @Test
  public void test216() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test216"); }


    // The following exception was thrown during execution in test generation
    try {
      int i2 = java.lang.Integer.parseUnsignedInt("1111110000100111111111001010010", 3601);
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test217() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test217"); }


    java.lang.Integer i1 = java.lang.Integer.getInteger("311647600");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);

  }

  @Test
  public void test218() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test218"); }


    int i1 = java.lang.Integer.reverseBytes(10001);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 287768576);

  }

  @Test
  public void test219() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test219"); }


    java.lang.String str2 = java.lang.Integer.toUnsignedString(20481, 10239);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "20481"+ "'", str2.equals("20481"));

  }

  @Test
  public void test220() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test220"); }


    tp2.IP iP4 = new tp2.IP((java.lang.Integer)356246784, (java.lang.Integer)(-939524096), (java.lang.Integer)2013265928, (java.lang.Integer)(-2147483648));
    java.lang.Integer i5 = iP4.getThird();
    tp2.IPBan iPBan7 = new tp2.IPBan(iP4, (java.lang.Long)38L);
    tp2.IP iP12 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP12.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan16 = new tp2.IPBan(iP12, (java.lang.Long)100L);
    tp2.IP iP21 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iPBan16.setIp(iP21);
    iP21.setSecond((java.lang.Integer)8);
    iP21.setSecond((java.lang.Integer)13);
    tp2.IP iP31 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP31.setFirst((java.lang.Integer)200);
    java.lang.Integer i34 = iP31.getFourth();
    boolean b35 = iP21.equals((java.lang.Object)i34);
    java.lang.Integer i36 = iP21.getFirst();
    iPBan7.ip = iP21;
    java.lang.Long long38 = iPBan7.expires;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i5 + "' != '" + 2013265928+ "'", i5.equals(2013265928));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i34 + "' != '" + 100+ "'", i34.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i36 + "' != '" + (-1)+ "'", i36.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long38 + "' != '" + 38L+ "'", long38.equals(38L));

  }

  @Test
  public void test221() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test221"); }


    tp2.SinglyLinkedList singlyLinkedList0 = new tp2.SinglyLinkedList();
    int i1 = singlyLinkedList0.getSize();
    int i2 = singlyLinkedList0.getSize();
    tp2.IP iP3 = null;
    boolean b4 = singlyLinkedList0.contains(iP3);
    tp2.IP iP6 = singlyLinkedList0.get(27);
    tp2.IP iP11 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i12 = iP11.getSecond();
    iP11.setFirst((java.lang.Integer)11001000);
    java.lang.Long long15 = null;
    tp2.IPBan iPBan16 = new tp2.IPBan(iP11, long15);
    tp2.IP iP17 = iPBan16.ip;
    tp2.IP iP18 = iPBan16.ip;
    java.lang.Integer i19 = iP18.getFourth();
    boolean b20 = singlyLinkedList0.remove(iP18);
    tp2.IP iP25 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i26 = iP25.getSecond();
    iP25.setFirst((java.lang.Integer)11001000);
    java.lang.Long long29 = null;
    tp2.IPBan iPBan30 = new tp2.IPBan(iP25, long29);
    tp2.IP iP31 = iPBan30.ip;
    tp2.IP iP32 = iPBan30.ip;
    tp2.IPBan iPBan34 = new tp2.IPBan(iP32, (java.lang.Long)10L);
    singlyLinkedList0.add(iP32);
    tp2.IP iP37 = singlyLinkedList0.get(0);
    iP37.setFourth((java.lang.Integer)1610612736);
    iP37.setFirst((java.lang.Integer)509804);
    iP37.setFirst((java.lang.Integer)2097152);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i12 + "' != '" + (-1)+ "'", i12.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i19 + "' != '" + 100+ "'", i19.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i26 + "' != '" + (-1)+ "'", i26.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP37);

  }

  @Test
  public void test222() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test222"); }


    tp2.IP iP4 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i5 = iP4.getSecond();
    iP4.setFirst((java.lang.Integer)11001000);
    java.lang.Integer i8 = iP4.getFourth();
    iP4.setFirst((java.lang.Integer)12);
    iP4.setFourth((java.lang.Integer)512);
    iP4.setSecond((java.lang.Integer)134217828);
    tp2.IPBan iPBan16 = new tp2.IPBan(iP4, (java.lang.Long)75809L);
    iP4.setThird((java.lang.Integer)486539294);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i5 + "' != '" + (-1)+ "'", i5.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i8 + "' != '" + 100+ "'", i8.equals(100));

  }

  @Test
  public void test223() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test223"); }


    java.lang.String str2 = java.lang.Integer.toUnsignedString(28360704, 10536);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "28360704"+ "'", str2.equals("28360704"));

  }

  @Test
  public void test224() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test224"); }


    int i2 = java.lang.Integer.rotateRight(33566720, 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 33566720);

  }

  @Test
  public void test225() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test225"); }


    // The following exception was thrown during execution in test generation
    try {
      java.lang.Integer i1 = java.lang.Integer.valueOf("1001110011100");
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

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test226"); }


    int i2 = java.lang.Integer.compareUnsigned(1377086084, 278528);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);

  }

  @Test
  public void test227() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test227"); }


    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList0 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.SinglyLinkedList singlyLinkedList1 = new tp2.SinglyLinkedList();
    int i2 = singlyLinkedList1.getSize();
    tp2.IP iP7 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i8 = iP7.getSecond();
    java.lang.Integer i9 = iP7.getFourth();
    singlyLinkedList1.add(iP7);
    tp2.IP iP12 = singlyLinkedList1.get(5);
    boolean b13 = singlyLinkedList1.repOK();
    tp2.IP iP15 = singlyLinkedList1.get(2013265920);
    tp2.SinglyLinkedList singlyLinkedList16 = new tp2.SinglyLinkedList();
    int i17 = singlyLinkedList16.getSize();
    tp2.IP iP22 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i23 = iP22.getSecond();
    java.lang.Integer i24 = iP22.getFourth();
    singlyLinkedList16.add(iP22);
    iP22.setFourth((java.lang.Integer)167772160);
    singlyLinkedList1.add(iP22);
    java.lang.Object obj29 = null;
    boolean b30 = iP22.equals(obj29);
    iP22.setSecond((java.lang.Integer)20);
    tp2.IPBan iPBan34 = new tp2.IPBan(iP22, (java.lang.Long)20L);
    java.lang.Integer i35 = iP22.getFirst();
    boolean b36 = strictlySortedSinglyLinkedList0.removeFromIP(iP22);
    tp2.IP iP41 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP41.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan45 = new tp2.IPBan(iP41, (java.lang.Long)100L);
    tp2.IP iP50 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP50.setFirst((java.lang.Integer)200);
    java.lang.Integer i53 = iP50.getFourth();
    iPBan45.setIp(iP50);
    iPBan45.setExpires((java.lang.Long)2147483648L);
    tp2.IP iP61 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP61.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan65 = new tp2.IPBan(iP61, (java.lang.Long)100L);
    tp2.IP iP66 = iPBan65.ip;
    tp2.IP iP71 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP71.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan75 = new tp2.IPBan(iP71, (java.lang.Long)100L);
    iPBan65.setIp(iP71);
    java.lang.Long long77 = iPBan65.getExpires();
    tp2.IP iP78 = iPBan65.ip;
    iP78.setThird((java.lang.Integer)0);
    iPBan45.ip = iP78;
    boolean b82 = strictlySortedSinglyLinkedList0.add(iPBan45);
    tp2.IP iP87 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP87.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan91 = new tp2.IPBan(iP87, (java.lang.Long)100L);
    iP87.setThird((java.lang.Integer)5888);
    boolean b94 = strictlySortedSinglyLinkedList0.containsIP(iP87);
    boolean b95 = strictlySortedSinglyLinkedList0.isEmpty();
    tp2.Node node96 = strictlySortedSinglyLinkedList0.header;
    strictlySortedSinglyLinkedList0.size = 0;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i8 + "' != '" + (-1)+ "'", i8.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 100+ "'", i9.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i23 + "' != '" + (-1)+ "'", i23.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i24 + "' != '" + 100+ "'", i24.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i35 + "' != '" + (-1)+ "'", i35.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i53 + "' != '" + 100+ "'", i53.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP66);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long77 + "' != '" + 100L+ "'", long77.equals(100L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP78);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b82 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b94 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b95 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node96);

  }

  @Test
  public void test228() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test228"); }


    // The following exception was thrown during execution in test generation
    try {
      java.lang.Integer i1 = java.lang.Integer.valueOf("3229718168");
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

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test229"); }


    int i2 = java.lang.Integer.compareUnsigned(318767104, 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);

  }

  @Test
  public void test230() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test230"); }


    java.lang.Integer i1 = java.lang.Integer.decode("647740");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 647740+ "'", i1.equals(647740));

  }

  @Test
  public void test231() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test231"); }


    // The following exception was thrown during execution in test generation
    try {
      int i2 = java.lang.Integer.parseUnsignedInt("111000000000000000000000100111", 0);
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test232() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test232"); }


    int i2 = java.lang.Integer.compareUnsigned((-1801591657), (-118362208));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == (-1));

  }

  @Test
  public void test233() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test233"); }


    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList0 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IPBan iPBan1 = null;
    boolean b2 = strictlySortedSinglyLinkedList0.add(iPBan1);
    int i3 = strictlySortedSinglyLinkedList0.getSize();
    int i4 = strictlySortedSinglyLinkedList0.size;
    tp2.IPBan iPBan6 = strictlySortedSinglyLinkedList0.get(16762403);
    boolean b7 = strictlySortedSinglyLinkedList0.repOK();
    int i8 = strictlySortedSinglyLinkedList0.getSize();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iPBan6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);

  }

  @Test
  public void test234() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test234"); }


    // The following exception was thrown during execution in test generation
    try {
      java.lang.Integer i2 = java.lang.Integer.valueOf("8a000000", 278720);
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

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test235"); }


    java.lang.Integer i2 = java.lang.Integer.getInteger("8388919", (java.lang.Integer)(-232415820));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i2 + "' != '" + (-232415820)+ "'", i2.equals((-232415820)));

  }

  @Test
  public void test236() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test236"); }


    int i1 = java.lang.Integer.parseInt("500001065");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 500001065);

  }

  @Test
  public void test237() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test237"); }


    // The following exception was thrown during execution in test generation
    try {
      java.lang.Integer i1 = java.lang.Integer.decode("2174574636");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test238() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test238"); }


    int i2 = java.lang.Integer.rotateLeft(672800, (-1505262448));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1142947850);

  }

  @Test
  public void test239() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test239"); }


    tp2.IP iP4 = new tp2.IP((java.lang.Integer)3014656, (java.lang.Integer)59, (java.lang.Integer)18, (java.lang.Integer)(-619332132));
    tp2.IPBan iPBan6 = new tp2.IPBan(iP4, (java.lang.Long)2273280L);
    java.lang.Integer i7 = iP4.getSecond();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i7 + "' != '" + 59+ "'", i7.equals(59));

  }

  @Test
  public void test240() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test240"); }


    int i1 = java.lang.Integer.lowestOneBit(1764881024);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 128);

  }

  @Test
  public void test241() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test241"); }


    java.lang.Integer i2 = java.lang.Integer.getInteger("14500000000", (java.lang.Integer)969839618);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i2 + "' != '" + 969839618+ "'", i2.equals(969839618));

  }

  @Test
  public void test242() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test242"); }


    java.lang.Integer i1 = new java.lang.Integer((-536870911));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + (-536870911)+ "'", i1.equals((-536870911)));

  }

  @Test
  public void test243() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test243"); }


    int i1 = java.lang.Integer.highestOneBit(154);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 128);

  }

  @Test
  public void test244() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test244"); }


    int i2 = java.lang.Integer.divideUnsigned(62079, 2088174752);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);

  }

  @Test
  public void test245() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test245"); }


    // The following exception was thrown during execution in test generation
    try {
      int i2 = java.lang.Integer.parseInt("40001242", 25437);
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test246() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test246"); }


    // The following exception was thrown during execution in test generation
    try {
      java.lang.Integer i1 = java.lang.Integer.decode("2230718976");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test247() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test247"); }


    tp2.SinglyLinkedList singlyLinkedList0 = new tp2.SinglyLinkedList();
    int i1 = singlyLinkedList0.getSize();
    tp2.IP iP6 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i7 = iP6.getSecond();
    java.lang.Integer i8 = iP6.getFourth();
    singlyLinkedList0.add(iP6);
    tp2.IPBan iPBan11 = new tp2.IPBan(iP6, (java.lang.Long)1L);
    tp2.SinglyLinkedList singlyLinkedList12 = new tp2.SinglyLinkedList();
    int i13 = singlyLinkedList12.getSize();
    tp2.IP iP18 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i19 = iP18.getSecond();
    java.lang.Integer i20 = iP18.getFourth();
    singlyLinkedList12.add(iP18);
    iP18.setFourth((java.lang.Integer)167772160);
    iP18.setSecond((java.lang.Integer)0);
    iPBan11.setIp(iP18);
    iP18.setSecond((java.lang.Integer)101);
    iP18.setFirst((java.lang.Integer)301989921);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i7 + "' != '" + (-1)+ "'", i7.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i8 + "' != '" + 100+ "'", i8.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i19 + "' != '" + (-1)+ "'", i19.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i20 + "' != '" + 100+ "'", i20.equals(100));

  }

  @Test
  public void test248() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test248"); }


    int i2 = java.lang.Integer.compare(783194660, 310);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);

  }

  @Test
  public void test249() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test249"); }


    tp2.SinglyLinkedList singlyLinkedList0 = new tp2.SinglyLinkedList();
    int i1 = singlyLinkedList0.getSize();
    tp2.IP iP6 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i7 = iP6.getSecond();
    java.lang.Integer i8 = iP6.getFourth();
    singlyLinkedList0.add(iP6);
    tp2.IPBan iPBan11 = new tp2.IPBan(iP6, (java.lang.Long)100L);
    iP6.setThird((java.lang.Integer)(-2147483641));
    java.lang.Integer i14 = iP6.getFirst();
    java.lang.Integer i15 = iP6.getFourth();
    iP6.setThird((java.lang.Integer)(-1021985471));
    iP6.setFirst((java.lang.Integer)3801088);
    java.lang.Integer i20 = iP6.getSecond();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i7 + "' != '" + (-1)+ "'", i7.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i8 + "' != '" + 100+ "'", i8.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i14 + "' != '" + (-1)+ "'", i14.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i15 + "' != '" + 100+ "'", i15.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i20 + "' != '" + (-1)+ "'", i20.equals((-1)));

  }

  @Test
  public void test250() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test250"); }


    int i2 = java.lang.Integer.compare(352838938, 2000);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);

  }

  @Test
  public void test251() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test251"); }


    // The following exception was thrown during execution in test generation
    try {
      int i2 = java.lang.Integer.parseInt("20000000000", 8169312);
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test252() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test252"); }


    java.lang.String str1 = java.lang.Integer.toOctalString((-1652490144));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "23540200140"+ "'", str1.equals("23540200140"));

  }

  @Test
  public void test253() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test253"); }


    java.lang.String str1 = java.lang.Integer.toOctalString(81);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "121"+ "'", str1.equals("121"));

  }

  @Test
  public void test254() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test254"); }


    tp2.IP iP4 = new tp2.IP((java.lang.Integer)15204352, (java.lang.Integer)101, (java.lang.Integer)30, (java.lang.Integer)100);
    tp2.IPBan iPBan6 = new tp2.IPBan(iP4, (java.lang.Long)6294016L);
    tp2.IP iP7 = iPBan6.getIp();
    iPBan6.setExpires((java.lang.Long)2150170718L);
    tp2.IP iP10 = null;
    iPBan6.ip = iP10;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP7);

  }

  @Test
  public void test255() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test255"); }


    java.lang.String str1 = java.lang.Integer.toOctalString(42226651);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "241051733"+ "'", str1.equals("241051733"));

  }

  @Test
  public void test256() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test256"); }


    // The following exception was thrown during execution in test generation
    try {
      java.lang.Integer i2 = java.lang.Integer.valueOf("110100000000000010000010010", 1764881024);
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

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test257"); }


    // The following exception was thrown during execution in test generation
    try {
      java.lang.Integer i1 = new java.lang.Integer("10000000111100100011000101101001");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test258() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test258"); }


    java.lang.Integer i1 = java.lang.Integer.valueOf((-2131611287));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + (-2131611287)+ "'", i1.equals((-2131611287)));

  }

  @Test
  public void test259() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test259"); }


    java.lang.String str2 = java.lang.Integer.toUnsignedString(4456448, 846526464);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4456448"+ "'", str2.equals("4456448"));

  }

  @Test
  public void test260() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test260"); }


    java.lang.Integer i1 = java.lang.Integer.valueOf(204);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 204+ "'", i1.equals(204));

  }

  @Test
  public void test261() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test261"); }


    int i1 = java.lang.Integer.bitCount(111);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 6);

  }

  @Test
  public void test262() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test262"); }


    int i2 = java.lang.Integer.max(1091043337, 443906176);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1091043337);

  }

  @Test
  public void test263() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test263"); }


    tp2.SinglyLinkedList singlyLinkedList0 = new tp2.SinglyLinkedList();
    int i1 = singlyLinkedList0.getSize();
    int i2 = singlyLinkedList0.getSize();
    tp2.IP iP3 = null;
    boolean b4 = singlyLinkedList0.contains(iP3);
    tp2.IP iP6 = singlyLinkedList0.get(27);
    tp2.IP iP11 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i12 = iP11.getSecond();
    iP11.setFirst((java.lang.Integer)11001000);
    java.lang.Long long15 = null;
    tp2.IPBan iPBan16 = new tp2.IPBan(iP11, long15);
    tp2.IP iP17 = iPBan16.ip;
    tp2.IP iP18 = iPBan16.ip;
    java.lang.Integer i19 = iP18.getFourth();
    boolean b20 = singlyLinkedList0.remove(iP18);
    tp2.SinglyLinkedList singlyLinkedList21 = new tp2.SinglyLinkedList();
    int i22 = singlyLinkedList21.getSize();
    int i23 = singlyLinkedList21.getSize();
    tp2.IP iP24 = null;
    boolean b25 = singlyLinkedList21.contains(iP24);
    tp2.IP iP27 = singlyLinkedList21.get(27);
    tp2.IP iP32 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP32.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan36 = new tp2.IPBan(iP32, (java.lang.Long)100L);
    tp2.IP iP37 = iPBan36.ip;
    tp2.IP iP42 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP42.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan46 = new tp2.IPBan(iP42, (java.lang.Long)100L);
    iPBan36.setIp(iP42);
    boolean b48 = singlyLinkedList21.remove(iP42);
    tp2.IP iP50 = singlyLinkedList21.get(4);
    boolean b51 = singlyLinkedList21.repOK();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList52 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b53 = strictlySortedSinglyLinkedList52.repOK();
    tp2.IP iP58 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i59 = iP58.getSecond();
    iP58.setFirst((java.lang.Integer)11001000);
    iP58.setFirst((java.lang.Integer)(-2147483648));
    boolean b64 = strictlySortedSinglyLinkedList52.removeFromIP(iP58);
    tp2.IPBan iPBan66 = strictlySortedSinglyLinkedList52.get((-1));
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList67 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b68 = strictlySortedSinglyLinkedList67.repOK();
    tp2.IP iP73 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i74 = iP73.getSecond();
    iP73.setFirst((java.lang.Integer)11001000);
    iP73.setFirst((java.lang.Integer)(-2147483648));
    boolean b79 = strictlySortedSinglyLinkedList67.removeFromIP(iP73);
    boolean b80 = strictlySortedSinglyLinkedList52.removeFromIP(iP73);
    boolean b81 = singlyLinkedList21.remove(iP73);
    iP73.setThird((java.lang.Integer)(-671088640));
    boolean b84 = singlyLinkedList0.remove(iP73);
    boolean b85 = singlyLinkedList0.repOK();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i12 + "' != '" + (-1)+ "'", i12.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i19 + "' != '" + 100+ "'", i19.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b48 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b51 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b53 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i59 + "' != '" + (-1)+ "'", i59.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b64 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iPBan66);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b68 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i74 + "' != '" + (-1)+ "'", i74.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b79 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b80 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b81 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b84 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b85 == true);

  }

  @Test
  public void test264() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test264"); }


    // The following exception was thrown during execution in test generation
    try {
      int i2 = java.lang.Integer.parseInt("16b84b14", 77359400);
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test265() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test265"); }


    java.lang.Integer i2 = java.lang.Integer.getInteger("1010101010101010011010100000001", 922812416);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i2 + "' != '" + 922812416+ "'", i2.equals(922812416));

  }

  @Test
  public void test266() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test266"); }


    int i1 = java.lang.Integer.parseUnsignedInt("120000000");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 120000000);

  }

  @Test
  public void test267() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test267"); }


    tp2.IP iP4 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP4.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan8 = new tp2.IPBan(iP4, (java.lang.Long)100L);
    tp2.IP iP9 = iPBan8.ip;
    tp2.IP iP10 = iPBan8.getIp();
    java.lang.Integer i11 = null;
    iP10.setFirst(i11);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList13 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b14 = strictlySortedSinglyLinkedList13.repOK();
    tp2.IP iP19 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i20 = iP19.getSecond();
    iP19.setFirst((java.lang.Integer)11001000);
    iP19.setFirst((java.lang.Integer)(-2147483648));
    boolean b25 = strictlySortedSinglyLinkedList13.removeFromIP(iP19);
    boolean b26 = iP10.equals((java.lang.Object)strictlySortedSinglyLinkedList13);
    tp2.IP iP31 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP31.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan35 = new tp2.IPBan(iP31, (java.lang.Long)100L);
    boolean b36 = strictlySortedSinglyLinkedList13.removeFromIP(iP31);
    strictlySortedSinglyLinkedList13.size = 5;
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList39 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b40 = strictlySortedSinglyLinkedList39.repOK();
    tp2.IP iP45 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i46 = iP45.getSecond();
    iP45.setFirst((java.lang.Integer)11001000);
    iP45.setFirst((java.lang.Integer)(-2147483648));
    boolean b51 = strictlySortedSinglyLinkedList39.removeFromIP(iP45);
    tp2.Node node52 = strictlySortedSinglyLinkedList39.header;
    strictlySortedSinglyLinkedList13.header = node52;
    tp2.IP iP58 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i59 = iP58.getSecond();
    java.lang.Integer i60 = iP58.getFourth();
    iP58.setFirst((java.lang.Integer)5);
    iP58.setSecond((java.lang.Integer)11001000);
    tp2.IPBan iPBan66 = new tp2.IPBan(iP58, (java.lang.Long)100L);
    tp2.IP iP67 = iPBan66.getIp();
    boolean b68 = strictlySortedSinglyLinkedList13.add(iPBan66);
    java.lang.Long long69 = iPBan66.getExpires();
    java.lang.Long long70 = iPBan66.expires;
    iPBan66.expires = 1123418368L;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i20 + "' != '" + (-1)+ "'", i20.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i46 + "' != '" + (-1)+ "'", i46.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b51 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i59 + "' != '" + (-1)+ "'", i59.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i60 + "' != '" + 100+ "'", i60.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP67);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b68 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long69 + "' != '" + 100L+ "'", long69.equals(100L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long70 + "' != '" + 100L+ "'", long70.equals(100L));

  }

  @Test
  public void test268() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test268"); }


    tp2.IP iP4 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP4.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan8 = new tp2.IPBan(iP4, (java.lang.Long)100L);
    tp2.IP iP9 = iPBan8.ip;
    tp2.IP iP14 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP14.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan18 = new tp2.IPBan(iP14, (java.lang.Long)100L);
    iPBan8.setIp(iP14);
    tp2.IPBan iPBan21 = new tp2.IPBan(iP14, (java.lang.Long)(-1L));
    tp2.IP iP22 = iPBan21.ip;
    java.lang.Long long23 = iPBan21.getExpires();
    tp2.IP iP28 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP28.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan32 = new tp2.IPBan(iP28, (java.lang.Long)100L);
    tp2.IP iP37 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iPBan32.setIp(iP37);
    iPBan32.setExpires((java.lang.Long)1L);
    tp2.IP iP45 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP45.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan49 = new tp2.IPBan(iP45, (java.lang.Long)100L);
    tp2.IP iP54 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i55 = iP54.getSecond();
    java.lang.Integer i56 = iP54.getFourth();
    iP54.setFirst((java.lang.Integer)5);
    iPBan49.ip = iP54;
    java.lang.Long long60 = iPBan49.getExpires();
    iPBan49.setExpires((java.lang.Long)(-1L));
    iPBan49.expires = 100L;
    tp2.IP iP69 = new tp2.IP((java.lang.Integer)242, (java.lang.Integer)242, (java.lang.Integer)30, (java.lang.Integer)(-1));
    iP69.setSecond((java.lang.Integer)33554432);
    iPBan49.setIp(iP69);
    tp2.IP iP73 = iPBan49.ip;
    java.lang.Long long74 = null;
    iPBan49.expires = long74;
    tp2.IP iP76 = iPBan49.getIp();
    java.lang.Integer i77 = iP76.getSecond();
    iPBan32.setIp(iP76);
    java.lang.Integer i79 = iP76.getSecond();
    iPBan21.setIp(iP76);
    tp2.IPBan iPBan82 = new tp2.IPBan(iP76, (java.lang.Long)1797783790L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long23 + "' != '" + (-1L)+ "'", long23.equals((-1L)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i55 + "' != '" + (-1)+ "'", i55.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i56 + "' != '" + 100+ "'", i56.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long60 + "' != '" + 100L+ "'", long60.equals(100L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP73);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP76);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i77 + "' != '" + 33554432+ "'", i77.equals(33554432));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i79 + "' != '" + 33554432+ "'", i79.equals(33554432));

  }

  @Test
  public void test269() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test269"); }


    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList0 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b1 = strictlySortedSinglyLinkedList0.repOK();
    tp2.IP iP6 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    boolean b7 = strictlySortedSinglyLinkedList0.containsIP(iP6);
    tp2.Node node8 = strictlySortedSinglyLinkedList0.header;
    strictlySortedSinglyLinkedList0.size = 37469776;
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList11 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IPBan iPBan12 = null;
    boolean b13 = strictlySortedSinglyLinkedList11.add(iPBan12);
    int i14 = strictlySortedSinglyLinkedList11.getSize();
    tp2.Node node15 = strictlySortedSinglyLinkedList11.header;
    strictlySortedSinglyLinkedList0.header = node15;
    tp2.IPBan iPBan18 = strictlySortedSinglyLinkedList0.get(1342264254);
    tp2.SinglyLinkedList singlyLinkedList19 = new tp2.SinglyLinkedList();
    int i20 = singlyLinkedList19.getSize();
    tp2.IP iP25 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i26 = iP25.getSecond();
    java.lang.Integer i27 = iP25.getFourth();
    singlyLinkedList19.add(iP25);
    tp2.IPBan iPBan30 = new tp2.IPBan(iP25, (java.lang.Long)100L);
    tp2.IP iP31 = iPBan30.getIp();
    tp2.IP iP32 = iPBan30.ip;
    tp2.SinglyLinkedList singlyLinkedList33 = new tp2.SinglyLinkedList();
    int i34 = singlyLinkedList33.getSize();
    tp2.IP iP39 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i40 = iP39.getSecond();
    java.lang.Integer i41 = iP39.getFourth();
    singlyLinkedList33.add(iP39);
    boolean b44 = iP39.equals((java.lang.Object)2147483647);
    tp2.IPBan iPBan46 = new tp2.IPBan(iP39, (java.lang.Long)(-1L));
    java.lang.Long long47 = iPBan46.expires;
    tp2.IP iP52 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP52.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan56 = new tp2.IPBan(iP52, (java.lang.Long)100L);
    tp2.IP iP57 = iPBan56.ip;
    iP57.setThird((java.lang.Integer)356246784);
    iPBan46.ip = iP57;
    java.lang.Integer i61 = iP57.getFirst();
    iP57.setFirst((java.lang.Integer)24);
    iPBan30.ip = iP57;
    tp2.IPBan iPBan66 = new tp2.IPBan(iP57, (java.lang.Long)3355443200L);
    iPBan66.expires = 243269647L;
    // The following exception was thrown during execution in test generation
    try {
      boolean b69 = strictlySortedSinglyLinkedList0.contains(iPBan66);
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
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iPBan18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i26 + "' != '" + (-1)+ "'", i26.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i27 + "' != '" + 100+ "'", i27.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i34 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i40 + "' != '" + (-1)+ "'", i40.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i41 + "' != '" + 100+ "'", i41.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long47 + "' != '" + (-1L)+ "'", long47.equals((-1L)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i61 + "' != '" + 200+ "'", i61.equals(200));

  }

  @Test
  public void test270() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test270"); }


    int i1 = java.lang.Integer.signum(742913024);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 1);

  }

  @Test
  public void test271() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test271"); }


    // The following exception was thrown during execution in test generation
    try {
      int i2 = java.lang.Integer.parseUnsignedInt("7000000", 1342177280);
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test272() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test272"); }


    tp2.IP iP4 = new tp2.IP((java.lang.Integer)624000, (java.lang.Integer)12800, (java.lang.Integer)24300001, (java.lang.Integer)52);
    java.lang.Integer i5 = iP4.getFirst();
    java.lang.Integer i6 = null;
    iP4.setFirst(i6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i5 + "' != '" + 624000+ "'", i5.equals(624000));

  }

  @Test
  public void test273() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test273"); }


    tp2.IP iP4 = new tp2.IP((java.lang.Integer)0, (java.lang.Integer)2157841, (java.lang.Integer)1320, (java.lang.Integer)65588);

  }

  @Test
  public void test274() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test274"); }


    int i1 = java.lang.Integer.numberOfTrailingZeros(41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);

  }

  @Test
  public void test275() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test275"); }


    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList0 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.SinglyLinkedList singlyLinkedList1 = new tp2.SinglyLinkedList();
    int i2 = singlyLinkedList1.getSize();
    tp2.IP iP7 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i8 = iP7.getSecond();
    java.lang.Integer i9 = iP7.getFourth();
    singlyLinkedList1.add(iP7);
    tp2.IP iP12 = singlyLinkedList1.get(5);
    boolean b13 = singlyLinkedList1.repOK();
    tp2.IP iP15 = singlyLinkedList1.get(2013265920);
    tp2.SinglyLinkedList singlyLinkedList16 = new tp2.SinglyLinkedList();
    int i17 = singlyLinkedList16.getSize();
    tp2.IP iP22 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i23 = iP22.getSecond();
    java.lang.Integer i24 = iP22.getFourth();
    singlyLinkedList16.add(iP22);
    iP22.setFourth((java.lang.Integer)167772160);
    singlyLinkedList1.add(iP22);
    java.lang.Object obj29 = null;
    boolean b30 = iP22.equals(obj29);
    iP22.setSecond((java.lang.Integer)20);
    tp2.IPBan iPBan34 = new tp2.IPBan(iP22, (java.lang.Long)20L);
    java.lang.Integer i35 = iP22.getFirst();
    boolean b36 = strictlySortedSinglyLinkedList0.removeFromIP(iP22);
    tp2.Node node37 = strictlySortedSinglyLinkedList0.header;
    tp2.IPBan iPBan39 = strictlySortedSinglyLinkedList0.get(163840);
    boolean b40 = strictlySortedSinglyLinkedList0.repOK();
    tp2.IP iP45 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP45.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan49 = new tp2.IPBan(iP45, (java.lang.Long)100L);
    tp2.IP iP54 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i55 = iP54.getSecond();
    java.lang.Integer i56 = iP54.getFourth();
    iP54.setFirst((java.lang.Integer)5);
    iPBan49.ip = iP54;
    java.lang.Long long60 = iPBan49.getExpires();
    iPBan49.setExpires((java.lang.Long)(-1L));
    boolean b63 = strictlySortedSinglyLinkedList0.add(iPBan49);
    tp2.Node node64 = strictlySortedSinglyLinkedList0.header;
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList65 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b66 = strictlySortedSinglyLinkedList65.repOK();
    tp2.IP iP71 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i72 = iP71.getSecond();
    iP71.setFirst((java.lang.Integer)11001000);
    iP71.setFirst((java.lang.Integer)(-2147483648));
    boolean b77 = strictlySortedSinglyLinkedList65.removeFromIP(iP71);
    java.lang.Integer i78 = iP71.getThird();
    boolean b79 = strictlySortedSinglyLinkedList0.removeFromIP(iP71);
    boolean b80 = strictlySortedSinglyLinkedList0.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i8 + "' != '" + (-1)+ "'", i8.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 100+ "'", i9.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i23 + "' != '" + (-1)+ "'", i23.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i24 + "' != '" + 100+ "'", i24.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i35 + "' != '" + (-1)+ "'", i35.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iPBan39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i55 + "' != '" + (-1)+ "'", i55.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i56 + "' != '" + 100+ "'", i56.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long60 + "' != '" + 100L+ "'", long60.equals(100L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b63 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node64);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b66 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i72 + "' != '" + (-1)+ "'", i72.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b77 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i78 + "' != '" + (-1)+ "'", i78.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b79 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b80 == false);

  }

  @Test
  public void test276() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test276"); }


    tp2.SinglyLinkedList singlyLinkedList0 = new tp2.SinglyLinkedList();
    int i1 = singlyLinkedList0.getSize();
    tp2.IP iP6 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i7 = iP6.getSecond();
    iP6.setFirst((java.lang.Integer)11001000);
    iP6.setFirst((java.lang.Integer)32);
    boolean b12 = singlyLinkedList0.remove(iP6);
    tp2.IP iP14 = singlyLinkedList0.get((-671088640));
    tp2.IP iP19 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i20 = iP19.getSecond();
    iP19.setFirst((java.lang.Integer)11001000);
    java.lang.Long long23 = null;
    tp2.IPBan iPBan24 = new tp2.IPBan(iP19, long23);
    tp2.IP iP25 = iPBan24.ip;
    tp2.IP iP26 = iPBan24.ip;
    java.lang.Integer i27 = iP26.getSecond();
    boolean b28 = singlyLinkedList0.contains(iP26);
    int i29 = singlyLinkedList0.getSize();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList30 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.SinglyLinkedList singlyLinkedList31 = new tp2.SinglyLinkedList();
    int i32 = singlyLinkedList31.getSize();
    tp2.IP iP37 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i38 = iP37.getSecond();
    java.lang.Integer i39 = iP37.getFourth();
    singlyLinkedList31.add(iP37);
    tp2.IP iP42 = singlyLinkedList31.get(5);
    boolean b43 = singlyLinkedList31.repOK();
    tp2.IP iP45 = singlyLinkedList31.get(2013265920);
    tp2.SinglyLinkedList singlyLinkedList46 = new tp2.SinglyLinkedList();
    int i47 = singlyLinkedList46.getSize();
    tp2.IP iP52 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i53 = iP52.getSecond();
    java.lang.Integer i54 = iP52.getFourth();
    singlyLinkedList46.add(iP52);
    iP52.setFourth((java.lang.Integer)167772160);
    singlyLinkedList31.add(iP52);
    java.lang.Object obj59 = null;
    boolean b60 = iP52.equals(obj59);
    iP52.setSecond((java.lang.Integer)20);
    tp2.IPBan iPBan64 = new tp2.IPBan(iP52, (java.lang.Long)20L);
    java.lang.Integer i65 = iP52.getFirst();
    boolean b66 = strictlySortedSinglyLinkedList30.removeFromIP(iP52);
    boolean b67 = singlyLinkedList0.remove(iP52);
    tp2.IP iP72 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i73 = iP72.getSecond();
    iP72.setFirst((java.lang.Integer)11001000);
    java.lang.Long long76 = null;
    tp2.IPBan iPBan77 = new tp2.IPBan(iP72, long76);
    tp2.IP iP78 = iPBan77.ip;
    tp2.IP iP79 = iPBan77.ip;
    tp2.IP iP80 = iPBan77.getIp();
    tp2.IP iP81 = iPBan77.ip;
    boolean b82 = iP52.equals((java.lang.Object)iP81);
    java.lang.Integer i83 = iP81.getThird();
    java.lang.Integer i84 = iP81.getSecond();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i7 + "' != '" + (-1)+ "'", i7.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i20 + "' != '" + (-1)+ "'", i20.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i27 + "' != '" + (-1)+ "'", i27.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i29 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i32 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i38 + "' != '" + (-1)+ "'", i38.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i39 + "' != '" + 100+ "'", i39.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b43 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i47 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i53 + "' != '" + (-1)+ "'", i53.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i54 + "' != '" + 100+ "'", i54.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b60 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i65 + "' != '" + (-1)+ "'", i65.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b66 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b67 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i73 + "' != '" + (-1)+ "'", i73.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP78);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP79);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP80);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP81);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b82 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i83 + "' != '" + (-1)+ "'", i83.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i84 + "' != '" + (-1)+ "'", i84.equals((-1)));

  }

  @Test
  public void test277() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test277"); }


    java.lang.String str1 = java.lang.Integer.toUnsignedString((-1478638592));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "2816328704"+ "'", str1.equals("2816328704"));

  }

  @Test
  public void test278() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test278"); }


    tp2.IP iP4 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP4.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan8 = new tp2.IPBan(iP4, (java.lang.Long)100L);
    tp2.IP iP9 = iPBan8.ip;
    tp2.IP iP14 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP14.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan18 = new tp2.IPBan(iP14, (java.lang.Long)100L);
    iPBan8.setIp(iP14);
    tp2.IPBan iPBan21 = new tp2.IPBan(iP14, (java.lang.Long)(-1L));
    tp2.IP iP22 = iPBan21.ip;
    tp2.IP iP23 = iPBan21.ip;
    iPBan21.setExpires((java.lang.Long)469762048L);
    tp2.IP iP26 = iPBan21.ip;
    tp2.IP iP27 = iPBan21.ip;
    tp2.IP iP28 = iPBan21.ip;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP28);

  }

  @Test
  public void test279() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test279"); }


    java.lang.String str1 = java.lang.Integer.toUnsignedString((-267681120));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "4027286176"+ "'", str1.equals("4027286176"));

  }

  @Test
  public void test280() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test280"); }


    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList0 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.SinglyLinkedList singlyLinkedList1 = new tp2.SinglyLinkedList();
    int i2 = singlyLinkedList1.getSize();
    tp2.IP iP7 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i8 = iP7.getSecond();
    java.lang.Integer i9 = iP7.getFourth();
    singlyLinkedList1.add(iP7);
    tp2.IP iP12 = singlyLinkedList1.get(5);
    boolean b13 = singlyLinkedList1.repOK();
    tp2.IP iP15 = singlyLinkedList1.get(2013265920);
    tp2.SinglyLinkedList singlyLinkedList16 = new tp2.SinglyLinkedList();
    int i17 = singlyLinkedList16.getSize();
    tp2.IP iP22 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i23 = iP22.getSecond();
    java.lang.Integer i24 = iP22.getFourth();
    singlyLinkedList16.add(iP22);
    iP22.setFourth((java.lang.Integer)167772160);
    singlyLinkedList1.add(iP22);
    java.lang.Object obj29 = null;
    boolean b30 = iP22.equals(obj29);
    iP22.setSecond((java.lang.Integer)20);
    tp2.IPBan iPBan34 = new tp2.IPBan(iP22, (java.lang.Long)20L);
    java.lang.Integer i35 = iP22.getFirst();
    boolean b36 = strictlySortedSinglyLinkedList0.removeFromIP(iP22);
    tp2.IP iP41 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP41.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan45 = new tp2.IPBan(iP41, (java.lang.Long)100L);
    tp2.IP iP50 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP50.setFirst((java.lang.Integer)200);
    java.lang.Integer i53 = iP50.getFourth();
    iPBan45.setIp(iP50);
    iPBan45.setExpires((java.lang.Long)2147483648L);
    tp2.IP iP61 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP61.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan65 = new tp2.IPBan(iP61, (java.lang.Long)100L);
    tp2.IP iP66 = iPBan65.ip;
    tp2.IP iP71 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP71.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan75 = new tp2.IPBan(iP71, (java.lang.Long)100L);
    iPBan65.setIp(iP71);
    java.lang.Long long77 = iPBan65.getExpires();
    tp2.IP iP78 = iPBan65.ip;
    iP78.setThird((java.lang.Integer)0);
    iPBan45.ip = iP78;
    boolean b82 = strictlySortedSinglyLinkedList0.add(iPBan45);
    tp2.IP iP87 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP87.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan91 = new tp2.IPBan(iP87, (java.lang.Long)100L);
    iP87.setThird((java.lang.Integer)5888);
    boolean b94 = strictlySortedSinglyLinkedList0.containsIP(iP87);
    strictlySortedSinglyLinkedList0.size = 83886080;
    int i97 = strictlySortedSinglyLinkedList0.size;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i8 + "' != '" + (-1)+ "'", i8.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 100+ "'", i9.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i23 + "' != '" + (-1)+ "'", i23.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i24 + "' != '" + 100+ "'", i24.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i35 + "' != '" + (-1)+ "'", i35.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i53 + "' != '" + 100+ "'", i53.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP66);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long77 + "' != '" + 100L+ "'", long77.equals(100L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP78);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b82 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b94 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i97 == 83886080);

  }

  @Test
  public void test281() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test281"); }


    java.lang.String str1 = java.lang.Integer.toBinaryString((-1475958102));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "10101000000001101010101010101010"+ "'", str1.equals("10101000000001101010101010101010"));

  }

  @Test
  public void test282() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test282"); }


    int i1 = java.lang.Integer.numberOfTrailingZeros(404404408);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 3);

  }

  @Test
  public void test283() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test283"); }


    tp2.SinglyLinkedList singlyLinkedList0 = new tp2.SinglyLinkedList();
    int i1 = singlyLinkedList0.getSize();
    tp2.IP iP6 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i7 = iP6.getSecond();
    java.lang.Integer i8 = iP6.getFourth();
    singlyLinkedList0.add(iP6);
    tp2.IPBan iPBan11 = new tp2.IPBan(iP6, (java.lang.Long)1L);
    tp2.IPBan iPBan13 = new tp2.IPBan(iP6, (java.lang.Long)100L);
    java.lang.Long long14 = iPBan13.expires;
    tp2.IP iP15 = iPBan13.ip;
    java.lang.Integer i16 = iP15.getSecond();
    iP15.setSecond((java.lang.Integer)1308183544);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i7 + "' != '" + (-1)+ "'", i7.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i8 + "' != '" + 100+ "'", i8.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long14 + "' != '" + 100L+ "'", long14.equals(100L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i16 + "' != '" + (-1)+ "'", i16.equals((-1)));

  }

  @Test
  public void test284() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test284"); }


    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList0 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b1 = strictlySortedSinglyLinkedList0.repOK();
    strictlySortedSinglyLinkedList0.size = 1;
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList4 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b5 = strictlySortedSinglyLinkedList4.repOK();
    tp2.IP iP10 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i11 = iP10.getSecond();
    iP10.setFirst((java.lang.Integer)11001000);
    iP10.setFirst((java.lang.Integer)(-2147483648));
    boolean b16 = strictlySortedSinglyLinkedList4.removeFromIP(iP10);
    tp2.IPBan iPBan17 = null;
    boolean b18 = strictlySortedSinglyLinkedList4.add(iPBan17);
    tp2.Node node19 = strictlySortedSinglyLinkedList4.header;
    tp2.Node node20 = strictlySortedSinglyLinkedList4.header;
    boolean b21 = strictlySortedSinglyLinkedList4.isEmpty();
    tp2.Node node22 = strictlySortedSinglyLinkedList4.header;
    strictlySortedSinglyLinkedList0.header = node22;
    strictlySortedSinglyLinkedList0.size = 0;
    tp2.IPBan iPBan27 = strictlySortedSinglyLinkedList0.get(2273280);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList28 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b29 = strictlySortedSinglyLinkedList28.isEmpty();
    tp2.SinglyLinkedList singlyLinkedList30 = new tp2.SinglyLinkedList();
    int i31 = singlyLinkedList30.getSize();
    int i32 = singlyLinkedList30.getSize();
    tp2.IP iP33 = null;
    boolean b34 = singlyLinkedList30.contains(iP33);
    int i35 = singlyLinkedList30.getSize();
    tp2.IP iP40 = new tp2.IP((java.lang.Integer)242, (java.lang.Integer)242, (java.lang.Integer)30, (java.lang.Integer)(-1));
    iP40.setSecond((java.lang.Integer)16);
    boolean b43 = singlyLinkedList30.contains(iP40);
    tp2.IP iP48 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i49 = iP48.getSecond();
    iP48.setFirst((java.lang.Integer)11001000);
    java.lang.Long long52 = null;
    tp2.IPBan iPBan53 = new tp2.IPBan(iP48, long52);
    java.lang.Long long54 = iPBan53.getExpires();
    iPBan53.expires = 1L;
    boolean b57 = iP40.equals((java.lang.Object)iPBan53);
    iPBan53.setExpires((java.lang.Long)167772160L);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList60 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b61 = strictlySortedSinglyLinkedList60.repOK();
    strictlySortedSinglyLinkedList60.size = 1;
    boolean b64 = strictlySortedSinglyLinkedList60.isEmpty();
    tp2.SinglyLinkedList singlyLinkedList65 = new tp2.SinglyLinkedList();
    int i66 = singlyLinkedList65.getSize();
    tp2.IP iP71 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i72 = iP71.getSecond();
    java.lang.Integer i73 = iP71.getFourth();
    singlyLinkedList65.add(iP71);
    boolean b76 = iP71.equals((java.lang.Object)2147483647);
    tp2.IPBan iPBan78 = new tp2.IPBan(iP71, (java.lang.Long)(-1L));
    java.lang.Long long79 = iPBan78.expires;
    boolean b80 = strictlySortedSinglyLinkedList60.contains(iPBan78);
    tp2.IP iP81 = iPBan78.ip;
    java.lang.Object obj82 = null;
    boolean b83 = iP81.equals(obj82);
    tp2.IPBan iPBan85 = new tp2.IPBan(iP81, (java.lang.Long)32L);
    iPBan53.ip = iP81;
    boolean b87 = strictlySortedSinglyLinkedList28.containsIP(iP81);
    tp2.Node node88 = strictlySortedSinglyLinkedList28.header;
    strictlySortedSinglyLinkedList0.header = node88;
    tp2.IPBan iPBan91 = strictlySortedSinglyLinkedList0.get(541518507);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i11 + "' != '" + (-1)+ "'", i11.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iPBan27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i31 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i32 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i35 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b43 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i49 + "' != '" + (-1)+ "'", i49.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(long54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b57 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b61 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b64 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i66 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i72 + "' != '" + (-1)+ "'", i72.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i73 + "' != '" + 100+ "'", i73.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b76 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long79 + "' != '" + (-1L)+ "'", long79.equals((-1L)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b80 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP81);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b83 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b87 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node88);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iPBan91);

  }

  @Test
  public void test285() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test285"); }


    tp2.SinglyLinkedList singlyLinkedList0 = new tp2.SinglyLinkedList();
    boolean b1 = singlyLinkedList0.repOK();
    tp2.IP iP3 = singlyLinkedList0.get(200);
    boolean b4 = singlyLinkedList0.isEmpty();
    tp2.IP iP9 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i10 = iP9.getThird();
    boolean b11 = singlyLinkedList0.remove(iP9);
    tp2.IP iP16 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP16.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan20 = new tp2.IPBan(iP16, (java.lang.Long)100L);
    tp2.IP iP21 = iPBan20.ip;
    tp2.IP iP22 = iPBan20.getIp();
    java.lang.Integer i23 = null;
    iP22.setFirst(i23);
    boolean b25 = singlyLinkedList0.contains(iP22);
    int i26 = singlyLinkedList0.getSize();
    tp2.SinglyLinkedList singlyLinkedList27 = new tp2.SinglyLinkedList();
    int i28 = singlyLinkedList27.getSize();
    tp2.IP iP33 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i34 = iP33.getSecond();
    java.lang.Integer i35 = iP33.getFourth();
    singlyLinkedList27.add(iP33);
    boolean b38 = iP33.equals((java.lang.Object)2147483647);
    tp2.IPBan iPBan40 = new tp2.IPBan(iP33, (java.lang.Long)(-1L));
    iP33.setThird((java.lang.Integer)(-2));
    java.lang.Integer i43 = iP33.getFirst();
    iP33.setFourth((java.lang.Integer)12);
    singlyLinkedList0.add(iP33);
    iP33.setFourth((java.lang.Integer)831941);
    iP33.setThird((java.lang.Integer)2157841);
    iP33.setThird((java.lang.Integer)1419649186);
    iP33.setSecond((java.lang.Integer)(-1629144292));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i10 + "' != '" + (-1)+ "'", i10.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i34 + "' != '" + (-1)+ "'", i34.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i35 + "' != '" + 100+ "'", i35.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i43 + "' != '" + (-1)+ "'", i43.equals((-1)));

  }

  @Test
  public void test286() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test286"); }


    java.lang.String str1 = java.lang.Integer.toBinaryString(11100000);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "101010010101111101100000"+ "'", str1.equals("101010010101111101100000"));

  }

  @Test
  public void test287() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test287"); }


    int i2 = java.lang.Integer.rotateRight(327155936, 49656);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == (-2147426285));

  }

  @Test
  public void test288() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test288"); }


    int i1 = java.lang.Integer.reverseBytes(402653440);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 65560);

  }

  @Test
  public void test289() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test289"); }


    java.lang.String str1 = java.lang.Integer.toUnsignedString((-1862335744));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "2432631552"+ "'", str1.equals("2432631552"));

  }

  @Test
  public void test290() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test290"); }


    int i2 = java.lang.Integer.rotateRight(289448, 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 289448);

  }

  @Test
  public void test291() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test291"); }


    java.lang.Integer i1 = new java.lang.Integer(5632);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 5632+ "'", i1.equals(5632));

  }

  @Test
  public void test292() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test292"); }


    tp2.IP iP4 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP4.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan8 = new tp2.IPBan(iP4, (java.lang.Long)100L);
    tp2.IP iP13 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP13.setFirst((java.lang.Integer)200);
    java.lang.Integer i16 = iP13.getFourth();
    iPBan8.setIp(iP13);
    tp2.SinglyLinkedList singlyLinkedList18 = new tp2.SinglyLinkedList();
    int i19 = singlyLinkedList18.getSize();
    boolean b20 = singlyLinkedList18.isEmpty();
    tp2.IP iP25 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP25.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan29 = new tp2.IPBan(iP25, (java.lang.Long)100L);
    tp2.IP iP30 = iPBan29.ip;
    tp2.IP iP31 = iPBan29.getIp();
    tp2.IP iP36 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP36.setFirst((java.lang.Integer)200);
    iPBan29.ip = iP36;
    iP36.setFourth((java.lang.Integer)242);
    singlyLinkedList18.add(iP36);
    boolean b43 = iP13.equals((java.lang.Object)singlyLinkedList18);
    boolean b44 = singlyLinkedList18.isEmpty();
    int i45 = singlyLinkedList18.getSize();
    boolean b46 = singlyLinkedList18.repOK();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i16 + "' != '" + 100+ "'", i16.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b43 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i45 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b46 == true);

  }

  @Test
  public void test293() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test293"); }


    java.lang.String str1 = java.lang.Integer.toBinaryString(621027328);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "100101000001000010000000000000"+ "'", str1.equals("100101000001000010000000000000"));

  }

  @Test
  public void test294() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test294"); }


    tp2.SinglyLinkedList singlyLinkedList0 = new tp2.SinglyLinkedList();
    boolean b1 = singlyLinkedList0.repOK();
    tp2.IP iP3 = singlyLinkedList0.get(200);
    boolean b4 = singlyLinkedList0.isEmpty();
    boolean b5 = singlyLinkedList0.repOK();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList6 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b7 = strictlySortedSinglyLinkedList6.repOK();
    tp2.IP iP12 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i13 = iP12.getSecond();
    iP12.setFirst((java.lang.Integer)11001000);
    iP12.setFirst((java.lang.Integer)(-2147483648));
    boolean b18 = strictlySortedSinglyLinkedList6.removeFromIP(iP12);
    tp2.IPBan iPBan20 = new tp2.IPBan(iP12, (java.lang.Long)0L);
    tp2.IP iP25 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP25.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan29 = new tp2.IPBan(iP25, (java.lang.Long)100L);
    tp2.IP iP30 = iPBan29.ip;
    tp2.IP iP31 = iPBan29.getIp();
    java.lang.Integer i32 = null;
    iP31.setFirst(i32);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList34 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b35 = strictlySortedSinglyLinkedList34.repOK();
    tp2.IP iP40 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i41 = iP40.getSecond();
    iP40.setFirst((java.lang.Integer)11001000);
    iP40.setFirst((java.lang.Integer)(-2147483648));
    boolean b46 = strictlySortedSinglyLinkedList34.removeFromIP(iP40);
    boolean b47 = iP31.equals((java.lang.Object)strictlySortedSinglyLinkedList34);
    tp2.IP iP52 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP52.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan56 = new tp2.IPBan(iP52, (java.lang.Long)100L);
    boolean b57 = strictlySortedSinglyLinkedList34.removeFromIP(iP52);
    java.lang.Integer i58 = iP52.getFirst();
    iPBan20.setIp(iP52);
    singlyLinkedList0.add(iP52);
    tp2.IP iP65 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP65.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan69 = new tp2.IPBan(iP65, (java.lang.Long)100L);
    tp2.IP iP70 = iPBan69.ip;
    tp2.IP iP71 = iPBan69.getIp();
    tp2.IP iP76 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP76.setFirst((java.lang.Integer)200);
    iPBan69.ip = iP76;
    singlyLinkedList0.add(iP76);
    boolean b81 = singlyLinkedList0.isEmpty();
    tp2.IP iP86 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP86.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan90 = new tp2.IPBan(iP86, (java.lang.Long)100L);
    tp2.IP iP91 = iPBan90.ip;
    tp2.IP iP92 = iPBan90.getIp();
    java.lang.Integer i93 = iP92.getSecond();
    boolean b94 = singlyLinkedList0.contains(iP92);
    boolean b95 = singlyLinkedList0.repOK();
    boolean b96 = singlyLinkedList0.repOK();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i13 + "' != '" + (-1)+ "'", i13.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i41 + "' != '" + (-1)+ "'", i41.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b46 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b47 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b57 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i58 + "' != '" + 200+ "'", i58.equals(200));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP70);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP71);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b81 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP91);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP92);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i93 + "' != '" + (-1)+ "'", i93.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b94 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b95 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b96 == true);

  }

  @Test
  public void test295() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test295"); }


    java.lang.Integer i2 = java.lang.Integer.getInteger("111000000000000", 207738560);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i2 + "' != '" + 207738560+ "'", i2.equals(207738560));

  }

  @Test
  public void test296() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test296"); }


    tp2.SinglyLinkedList singlyLinkedList0 = new tp2.SinglyLinkedList();
    int i1 = singlyLinkedList0.getSize();
    tp2.IP iP6 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i7 = iP6.getSecond();
    java.lang.Integer i8 = iP6.getFourth();
    singlyLinkedList0.add(iP6);
    boolean b11 = iP6.equals((java.lang.Object)2147483647);
    tp2.IPBan iPBan13 = new tp2.IPBan(iP6, (java.lang.Long)(-1L));
    java.lang.Long long14 = iPBan13.expires;
    tp2.IP iP19 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP19.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan23 = new tp2.IPBan(iP19, (java.lang.Long)100L);
    tp2.IP iP24 = iPBan23.ip;
    iP24.setThird((java.lang.Integer)356246784);
    iPBan13.ip = iP24;
    iPBan13.setExpires((java.lang.Long)2013265920L);
    tp2.IP iP30 = iPBan13.getIp();
    tp2.IP iP31 = iPBan13.ip;
    iP31.setFirst((java.lang.Integer)51756492);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i7 + "' != '" + (-1)+ "'", i7.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i8 + "' != '" + 100+ "'", i8.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-1L)+ "'", long14.equals((-1L)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP31);

  }

  @Test
  public void test297() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test297"); }


    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList0 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b1 = strictlySortedSinglyLinkedList0.repOK();
    strictlySortedSinglyLinkedList0.size = 1;
    strictlySortedSinglyLinkedList0.size = 0;
    tp2.IP iP10 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i11 = iP10.getSecond();
    java.lang.Integer i12 = iP10.getFourth();
    boolean b13 = strictlySortedSinglyLinkedList0.containsIP(iP10);
    java.lang.Integer i14 = iP10.getThird();
    tp2.IPBan iPBan16 = new tp2.IPBan(iP10, (java.lang.Long)469762048L);
    java.lang.Long long17 = iPBan16.getExpires();
    tp2.IP iP18 = iPBan16.getIp();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i11 + "' != '" + (-1)+ "'", i11.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i12 + "' != '" + 100+ "'", i12.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i14 + "' != '" + (-1)+ "'", i14.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long17 + "' != '" + 469762048L+ "'", long17.equals(469762048L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP18);

  }

  @Test
  public void test298() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test298"); }


    java.lang.String str1 = java.lang.Integer.toBinaryString(36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "100100"+ "'", str1.equals("100100"));

  }

  @Test
  public void test299() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test299"); }


    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList0 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b1 = strictlySortedSinglyLinkedList0.repOK();
    boolean b2 = strictlySortedSinglyLinkedList0.repOK();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList3 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b4 = strictlySortedSinglyLinkedList3.isEmpty();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList5 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b6 = strictlySortedSinglyLinkedList5.repOK();
    tp2.IP iP11 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    boolean b12 = strictlySortedSinglyLinkedList5.containsIP(iP11);
    tp2.Node node13 = strictlySortedSinglyLinkedList5.header;
    strictlySortedSinglyLinkedList3.header = node13;
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList15 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b16 = strictlySortedSinglyLinkedList15.repOK();
    strictlySortedSinglyLinkedList15.size = 1;
    strictlySortedSinglyLinkedList15.size = 0;
    tp2.IP iP25 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP25.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan29 = new tp2.IPBan(iP25, (java.lang.Long)100L);
    tp2.IP iP34 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP34.setFirst((java.lang.Integer)200);
    java.lang.Integer i37 = iP34.getFourth();
    iPBan29.setIp(iP34);
    boolean b39 = strictlySortedSinglyLinkedList15.contains(iPBan29);
    boolean b40 = strictlySortedSinglyLinkedList3.contains(iPBan29);
    boolean b41 = strictlySortedSinglyLinkedList0.add(iPBan29);
    tp2.SinglyLinkedList singlyLinkedList42 = new tp2.SinglyLinkedList();
    int i43 = singlyLinkedList42.getSize();
    tp2.IP iP48 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i49 = iP48.getSecond();
    java.lang.Integer i50 = iP48.getFourth();
    singlyLinkedList42.add(iP48);
    tp2.IPBan iPBan53 = new tp2.IPBan(iP48, (java.lang.Long)100L);
    tp2.IP iP54 = iPBan53.getIp();
    boolean b55 = strictlySortedSinglyLinkedList0.contains(iPBan53);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList56 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b57 = strictlySortedSinglyLinkedList56.repOK();
    strictlySortedSinglyLinkedList56.size = 1;
    strictlySortedSinglyLinkedList56.size = 0;
    tp2.IPBan iPBan62 = null;
    boolean b63 = strictlySortedSinglyLinkedList56.add(iPBan62);
    tp2.Node node64 = strictlySortedSinglyLinkedList56.header;
    tp2.Node node65 = strictlySortedSinglyLinkedList56.header;
    strictlySortedSinglyLinkedList0.header = node65;
    tp2.IPBan iPBan68 = strictlySortedSinglyLinkedList0.get(920903680);
    tp2.IP iP73 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    tp2.IPBan iPBan75 = new tp2.IPBan(iP73, (java.lang.Long)469762048L);
    iPBan75.expires = 32987L;
    tp2.IP iP82 = new tp2.IP((java.lang.Integer)242, (java.lang.Integer)242, (java.lang.Integer)30, (java.lang.Integer)(-1));
    java.lang.Integer i83 = iP82.getFirst();
    iP82.setThird((java.lang.Integer)362);
    java.lang.Integer i86 = iP82.getFourth();
    java.lang.Integer i87 = iP82.getThird();
    iP82.setFirst((java.lang.Integer)(-2120392704));
    iP82.setSecond((java.lang.Integer)68);
    iPBan75.ip = iP82;
    // The following exception was thrown during execution in test generation
    try {
      boolean b93 = strictlySortedSinglyLinkedList0.removeFromIP(iP82);
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
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i37 + "' != '" + 100+ "'", i37.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i43 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i49 + "' != '" + (-1)+ "'", i49.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i50 + "' != '" + 100+ "'", i50.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b55 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b57 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b63 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node64);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node65);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iPBan68);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i83 + "' != '" + 242+ "'", i83.equals(242));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i86 + "' != '" + (-1)+ "'", i86.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i87 + "' != '" + 362+ "'", i87.equals(362));

  }

  @Test
  public void test300() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test300"); }


    tp2.SinglyLinkedList singlyLinkedList0 = new tp2.SinglyLinkedList();
    int i1 = singlyLinkedList0.getSize();
    tp2.IP iP6 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i7 = iP6.getSecond();
    iP6.setFirst((java.lang.Integer)11001000);
    iP6.setFirst((java.lang.Integer)32);
    boolean b12 = singlyLinkedList0.remove(iP6);
    boolean b13 = singlyLinkedList0.repOK();
    tp2.SinglyLinkedList singlyLinkedList14 = new tp2.SinglyLinkedList();
    int i15 = singlyLinkedList14.getSize();
    tp2.IP iP20 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i21 = iP20.getSecond();
    java.lang.Integer i22 = iP20.getFourth();
    singlyLinkedList14.add(iP20);
    boolean b25 = iP20.equals((java.lang.Object)2147483647);
    tp2.IPBan iPBan27 = new tp2.IPBan(iP20, (java.lang.Long)(-1L));
    java.lang.Long long28 = iPBan27.expires;
    tp2.IP iP33 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP33.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan37 = new tp2.IPBan(iP33, (java.lang.Long)100L);
    tp2.IP iP38 = iPBan37.ip;
    iP38.setThird((java.lang.Integer)356246784);
    iPBan27.ip = iP38;
    iP38.setFourth((java.lang.Integer)0);
    iP38.setSecond((java.lang.Integer)160);
    boolean b46 = singlyLinkedList0.remove(iP38);
    tp2.IP iP47 = null;
    boolean b48 = singlyLinkedList0.contains(iP47);
    boolean b49 = singlyLinkedList0.repOK();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i7 + "' != '" + (-1)+ "'", i7.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i21 + "' != '" + (-1)+ "'", i21.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i22 + "' != '" + 100+ "'", i22.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long28 + "' != '" + (-1L)+ "'", long28.equals((-1L)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b46 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b48 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b49 == true);

  }

  @Test
  public void test301() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test301"); }


    int i2 = java.lang.Integer.min((-619332132), 400000540);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == (-619332132));

  }

  @Test
  public void test302() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test302"); }


    int i2 = java.lang.Integer.rotateRight((-2118844160), 37918);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 114557954);

  }

  @Test
  public void test303() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test303"); }


    tp2.SinglyLinkedList singlyLinkedList0 = new tp2.SinglyLinkedList();
    int i1 = singlyLinkedList0.getSize();
    int i2 = singlyLinkedList0.getSize();
    tp2.IP iP3 = null;
    boolean b4 = singlyLinkedList0.contains(iP3);
    int i5 = singlyLinkedList0.getSize();
    tp2.IP iP10 = new tp2.IP((java.lang.Integer)242, (java.lang.Integer)242, (java.lang.Integer)30, (java.lang.Integer)(-1));
    iP10.setSecond((java.lang.Integer)16);
    boolean b13 = singlyLinkedList0.contains(iP10);
    tp2.IP iP18 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i19 = iP18.getSecond();
    iP18.setFirst((java.lang.Integer)11001000);
    java.lang.Long long22 = null;
    tp2.IPBan iPBan23 = new tp2.IPBan(iP18, long22);
    java.lang.Long long24 = iPBan23.getExpires();
    iPBan23.expires = 1L;
    boolean b27 = iP10.equals((java.lang.Object)iPBan23);
    iPBan23.setExpires((java.lang.Long)167772160L);
    java.lang.Long long30 = iPBan23.getExpires();
    java.lang.Long long31 = iPBan23.expires;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i19 + "' != '" + (-1)+ "'", i19.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(long24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long30 + "' != '" + 167772160L+ "'", long30.equals(167772160L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long31 + "' != '" + 167772160L+ "'", long31.equals(167772160L));

  }

  @Test
  public void test304() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test304"); }


    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList0 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b1 = strictlySortedSinglyLinkedList0.repOK();
    strictlySortedSinglyLinkedList0.size = 1;
    boolean b4 = strictlySortedSinglyLinkedList0.isEmpty();
    tp2.SinglyLinkedList singlyLinkedList5 = new tp2.SinglyLinkedList();
    int i6 = singlyLinkedList5.getSize();
    tp2.IP iP11 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i12 = iP11.getSecond();
    java.lang.Integer i13 = iP11.getFourth();
    singlyLinkedList5.add(iP11);
    boolean b16 = iP11.equals((java.lang.Object)2147483647);
    tp2.IPBan iPBan18 = new tp2.IPBan(iP11, (java.lang.Long)(-1L));
    java.lang.Long long19 = iPBan18.expires;
    boolean b20 = strictlySortedSinglyLinkedList0.contains(iPBan18);
    tp2.IP iP21 = iPBan18.ip;
    java.lang.Object obj22 = null;
    boolean b23 = iP21.equals(obj22);
    java.lang.Integer i24 = iP21.getThird();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i12 + "' != '" + (-1)+ "'", i12.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i13 + "' != '" + 100+ "'", i13.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-1L)+ "'", long19.equals((-1L)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i24 + "' != '" + (-1)+ "'", i24.equals((-1)));

  }

  @Test
  public void test305() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test305"); }


    tp2.SinglyLinkedList singlyLinkedList0 = new tp2.SinglyLinkedList();
    int i1 = singlyLinkedList0.getSize();
    tp2.IP iP6 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i7 = iP6.getSecond();
    java.lang.Integer i8 = iP6.getFourth();
    singlyLinkedList0.add(iP6);
    boolean b11 = iP6.equals((java.lang.Object)2147483647);
    tp2.IPBan iPBan13 = new tp2.IPBan(iP6, (java.lang.Long)(-1L));
    java.lang.Long long14 = iPBan13.expires;
    tp2.IP iP19 = new tp2.IP((java.lang.Integer)67108864, (java.lang.Integer)(-2147483648), (java.lang.Integer)356246784, (java.lang.Integer)176016000);
    java.lang.Integer i20 = iP19.getThird();
    java.lang.Integer i21 = iP19.getFourth();
    tp2.IPBan iPBan23 = new tp2.IPBan(iP19, (java.lang.Long)167772160L);
    iPBan13.ip = iP19;
    java.lang.Long long25 = iPBan13.expires;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i7 + "' != '" + (-1)+ "'", i7.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i8 + "' != '" + 100+ "'", i8.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-1L)+ "'", long14.equals((-1L)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i20 + "' != '" + 356246784+ "'", i20.equals(356246784));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i21 + "' != '" + 176016000+ "'", i21.equals(176016000));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long25 + "' != '" + (-1L)+ "'", long25.equals((-1L)));

  }

  @Test
  public void test306() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test306"); }


    int i1 = java.lang.Integer.signum(1920);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 1);

  }

  @Test
  public void test307() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test307"); }


    int i2 = java.lang.Integer.min(13349429, 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);

  }

  @Test
  public void test308() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test308"); }


    int i1 = java.lang.Integer.signum(278528);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 1);

  }

  @Test
  public void test309() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test309"); }


    // The following exception was thrown during execution in test generation
    try {
      java.lang.Integer i1 = new java.lang.Integer("65cd27");
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

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test310"); }


    int i2 = java.lang.Integer.remainderUnsigned((-1609957376), 45676);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 37612);

  }

  @Test
  public void test311() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test311"); }


    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList0 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b1 = strictlySortedSinglyLinkedList0.repOK();
    strictlySortedSinglyLinkedList0.size = 1;
    strictlySortedSinglyLinkedList0.size = 0;
    tp2.IP iP10 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP10.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan14 = new tp2.IPBan(iP10, (java.lang.Long)100L);
    tp2.IP iP15 = iPBan14.ip;
    boolean b16 = strictlySortedSinglyLinkedList0.contains(iPBan14);
    boolean b17 = strictlySortedSinglyLinkedList0.repOK();
    tp2.SinglyLinkedList singlyLinkedList18 = new tp2.SinglyLinkedList();
    int i19 = singlyLinkedList18.getSize();
    tp2.IP iP24 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i25 = iP24.getSecond();
    java.lang.Integer i26 = iP24.getFourth();
    singlyLinkedList18.add(iP24);
    boolean b29 = iP24.equals((java.lang.Object)2147483647);
    tp2.IPBan iPBan31 = new tp2.IPBan(iP24, (java.lang.Long)(-1L));
    boolean b32 = strictlySortedSinglyLinkedList0.add(iPBan31);
    tp2.Node node33 = strictlySortedSinglyLinkedList0.header;
    strictlySortedSinglyLinkedList0.size = 2147483647;
    tp2.IP iP40 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP40.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan44 = new tp2.IPBan(iP40, (java.lang.Long)100L);
    tp2.IP iP45 = iPBan44.ip;
    tp2.SinglyLinkedList singlyLinkedList46 = new tp2.SinglyLinkedList();
    int i47 = singlyLinkedList46.getSize();
    tp2.IP iP52 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i53 = iP52.getSecond();
    java.lang.Integer i54 = iP52.getFourth();
    singlyLinkedList46.add(iP52);
    boolean b56 = iP45.equals((java.lang.Object)iP52);
    java.lang.Class clazz57 = java.lang.Integer.TYPE;
    boolean b58 = iP52.equals((java.lang.Object)clazz57);
    boolean b59 = strictlySortedSinglyLinkedList0.removeFromIP(iP52);
    boolean b60 = strictlySortedSinglyLinkedList0.isEmpty();
    boolean b61 = strictlySortedSinglyLinkedList0.isEmpty();
    tp2.IP iP66 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP66.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan70 = new tp2.IPBan(iP66, (java.lang.Long)100L);
    tp2.IP iP75 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP75.setFirst((java.lang.Integer)200);
    java.lang.Integer i78 = iP75.getFourth();
    iPBan70.setIp(iP75);
    java.lang.Long long80 = iPBan70.expires;
    tp2.IP iP81 = iPBan70.ip;
    tp2.IP iP82 = null;
    iPBan70.ip = iP82;
    java.lang.Long long84 = iPBan70.getExpires();
    boolean b85 = strictlySortedSinglyLinkedList0.contains(iPBan70);
    boolean b86 = strictlySortedSinglyLinkedList0.repOK();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i25 + "' != '" + (-1)+ "'", i25.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i26 + "' != '" + 100+ "'", i26.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i47 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i53 + "' != '" + (-1)+ "'", i53.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i54 + "' != '" + 100+ "'", i54.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b56 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(clazz57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b58 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b59 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b60 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b61 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i78 + "' != '" + 100+ "'", i78.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long80 + "' != '" + 100L+ "'", long80.equals(100L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP81);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long84 + "' != '" + 100L+ "'", long84.equals(100L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b85 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b86 == false);

  }

  @Test
  public void test312() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test312"); }


    int i1 = java.lang.Integer.reverseBytes((-1635254016));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 100510);

  }

  @Test
  public void test313() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test313"); }


    long long1 = java.lang.Integer.toUnsignedLong((-1429838673));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == 2865128623L);

  }

  @Test
  public void test314() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test314"); }


    int i2 = java.lang.Integer.remainderUnsigned((-1006415204), 723357666);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 395121428);

  }

  @Test
  public void test315() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test315"); }


    int i2 = java.lang.Integer.rotateLeft((-257396566), 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == (-257396566));

  }

  @Test
  public void test316() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test316"); }


    java.lang.Integer i2 = java.lang.Integer.getInteger("2420e50", (java.lang.Integer)5591);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i2 + "' != '" + 5591+ "'", i2.equals(5591));

  }

  @Test
  public void test317() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test317"); }


    java.lang.Integer i1 = java.lang.Integer.getInteger("3232255144");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);

  }

  @Test
  public void test318() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test318"); }


    int i1 = java.lang.Integer.lowestOneBit(270991360);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 65536);

  }

  @Test
  public void test319() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test319"); }


    java.lang.Integer i1 = new java.lang.Integer(1610612738);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 1610612738+ "'", i1.equals(1610612738));

  }

  @Test
  public void test320() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test320"); }


    java.lang.Integer i1 = new java.lang.Integer("110000001");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 110000001+ "'", i1.equals(110000001));

  }

  @Test
  public void test321() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test321"); }


    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList0 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b1 = strictlySortedSinglyLinkedList0.repOK();
    strictlySortedSinglyLinkedList0.size = 1;
    strictlySortedSinglyLinkedList0.size = 0;
    tp2.IP iP10 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP10.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan14 = new tp2.IPBan(iP10, (java.lang.Long)100L);
    tp2.IP iP15 = iPBan14.ip;
    boolean b16 = strictlySortedSinglyLinkedList0.contains(iPBan14);
    boolean b17 = strictlySortedSinglyLinkedList0.repOK();
    tp2.SinglyLinkedList singlyLinkedList18 = new tp2.SinglyLinkedList();
    int i19 = singlyLinkedList18.getSize();
    tp2.IP iP24 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i25 = iP24.getSecond();
    java.lang.Integer i26 = iP24.getFourth();
    singlyLinkedList18.add(iP24);
    boolean b29 = iP24.equals((java.lang.Object)2147483647);
    tp2.IPBan iPBan31 = new tp2.IPBan(iP24, (java.lang.Long)(-1L));
    boolean b32 = strictlySortedSinglyLinkedList0.add(iPBan31);
    tp2.SinglyLinkedList singlyLinkedList33 = new tp2.SinglyLinkedList();
    int i34 = singlyLinkedList33.getSize();
    tp2.IP iP39 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i40 = iP39.getSecond();
    java.lang.Integer i41 = iP39.getFourth();
    singlyLinkedList33.add(iP39);
    tp2.IPBan iPBan44 = new tp2.IPBan(iP39, (java.lang.Long)1L);
    boolean b45 = strictlySortedSinglyLinkedList0.containsIP(iP39);
    int i46 = strictlySortedSinglyLinkedList0.getSize();
    strictlySortedSinglyLinkedList0.size = 11001000;
    tp2.Node node49 = strictlySortedSinglyLinkedList0.header;
    tp2.SinglyLinkedList singlyLinkedList50 = new tp2.SinglyLinkedList();
    int i51 = singlyLinkedList50.getSize();
    tp2.IP iP56 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i57 = iP56.getSecond();
    java.lang.Integer i58 = iP56.getFourth();
    singlyLinkedList50.add(iP56);
    tp2.IP iP61 = singlyLinkedList50.get(5);
    boolean b62 = singlyLinkedList50.repOK();
    tp2.IP iP64 = singlyLinkedList50.get(2013265920);
    tp2.SinglyLinkedList singlyLinkedList65 = new tp2.SinglyLinkedList();
    int i66 = singlyLinkedList65.getSize();
    tp2.IP iP71 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i72 = iP71.getSecond();
    java.lang.Integer i73 = iP71.getFourth();
    singlyLinkedList65.add(iP71);
    iP71.setFourth((java.lang.Integer)167772160);
    singlyLinkedList50.add(iP71);
    java.lang.Object obj78 = null;
    boolean b79 = iP71.equals(obj78);
    iP71.setSecond((java.lang.Integer)20);
    tp2.IPBan iPBan83 = new tp2.IPBan(iP71, (java.lang.Long)20L);
    iPBan83.expires = 2147483655L;
    boolean b86 = strictlySortedSinglyLinkedList0.add(iPBan83);
    java.lang.Long long87 = null;
    iPBan83.setExpires(long87);
    iPBan83.setExpires((java.lang.Long)2046820352L);
    java.lang.Long long91 = iPBan83.getExpires();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i25 + "' != '" + (-1)+ "'", i25.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i26 + "' != '" + 100+ "'", i26.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i34 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i40 + "' != '" + (-1)+ "'", i40.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i41 + "' != '" + 100+ "'", i41.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i46 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i51 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i57 + "' != '" + (-1)+ "'", i57.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i58 + "' != '" + 100+ "'", i58.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP61);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b62 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP64);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i66 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i72 + "' != '" + (-1)+ "'", i72.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i73 + "' != '" + 100+ "'", i73.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b79 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b86 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long91 + "' != '" + 2046820352L+ "'", long91.equals(2046820352L));

  }

  @Test
  public void test322() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test322"); }


    int i1 = java.lang.Integer.signum(8389120);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 1);

  }

  @Test
  public void test323() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test323"); }


    // The following exception was thrown during execution in test generation
    try {
      java.lang.Integer i1 = java.lang.Integer.decode("a7dca8");
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

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test324"); }


    int i2 = java.lang.Integer.sum((-612368384), 33554794);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == (-578813590));

  }

  @Test
  public void test325() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test325"); }


    java.lang.Integer i1 = java.lang.Integer.valueOf(212542096);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 212542096+ "'", i1.equals(212542096));

  }

  @Test
  public void test326() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test326"); }


    int i2 = java.lang.Integer.compareUnsigned(2045949952, 47776);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);

  }

  @Test
  public void test327() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test327"); }


    int i1 = java.lang.Integer.reverse(20000);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 74579968);

  }

  @Test
  public void test328() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test328"); }


    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList0 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b1 = strictlySortedSinglyLinkedList0.repOK();
    tp2.IP iP6 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i7 = iP6.getSecond();
    iP6.setFirst((java.lang.Integer)11001000);
    iP6.setFirst((java.lang.Integer)(-2147483648));
    boolean b12 = strictlySortedSinglyLinkedList0.removeFromIP(iP6);
    tp2.IPBan iPBan13 = null;
    boolean b14 = strictlySortedSinglyLinkedList0.add(iPBan13);
    tp2.Node node15 = strictlySortedSinglyLinkedList0.header;
    tp2.Node node16 = strictlySortedSinglyLinkedList0.header;
    int i17 = strictlySortedSinglyLinkedList0.getSize();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList18 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IPBan iPBan19 = null;
    boolean b20 = strictlySortedSinglyLinkedList18.add(iPBan19);
    int i21 = strictlySortedSinglyLinkedList18.getSize();
    tp2.Node node22 = strictlySortedSinglyLinkedList18.header;
    tp2.Node node23 = strictlySortedSinglyLinkedList18.header;
    strictlySortedSinglyLinkedList0.header = node23;
    tp2.SinglyLinkedList singlyLinkedList25 = new tp2.SinglyLinkedList();
    boolean b26 = singlyLinkedList25.repOK();
    tp2.IP iP31 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP31.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan35 = new tp2.IPBan(iP31, (java.lang.Long)100L);
    tp2.IP iP40 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP40.setFirst((java.lang.Integer)200);
    java.lang.Integer i43 = iP40.getFourth();
    iPBan35.setIp(iP40);
    singlyLinkedList25.add(iP40);
    tp2.IPBan iPBan47 = new tp2.IPBan(iP40, (java.lang.Long)5L);
    java.lang.Long long48 = iPBan47.getExpires();
    // The following exception was thrown during execution in test generation
    try {
      boolean b49 = strictlySortedSinglyLinkedList0.contains(iPBan47);
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
    org.junit.Assert.assertTrue("'" + i7 + "' != '" + (-1)+ "'", i7.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i43 + "' != '" + 100+ "'", i43.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long48 + "' != '" + 5L+ "'", long48.equals(5L));

  }

  @Test
  public void test329() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test329"); }


    int i2 = java.lang.Integer.compare(0, 560);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == (-1));

  }

  @Test
  public void test330() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test330"); }


    java.lang.Integer i2 = java.lang.Integer.getInteger("", 54086648);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i2 + "' != '" + 54086648+ "'", i2.equals(54086648));

  }

  @Test
  public void test331() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test331"); }


    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList0 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b1 = strictlySortedSinglyLinkedList0.isEmpty();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList2 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b3 = strictlySortedSinglyLinkedList2.repOK();
    tp2.IP iP8 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    boolean b9 = strictlySortedSinglyLinkedList2.containsIP(iP8);
    tp2.Node node10 = strictlySortedSinglyLinkedList2.header;
    strictlySortedSinglyLinkedList0.header = node10;
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList12 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b13 = strictlySortedSinglyLinkedList12.repOK();
    strictlySortedSinglyLinkedList12.size = 1;
    strictlySortedSinglyLinkedList12.size = 0;
    tp2.IP iP22 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP22.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan26 = new tp2.IPBan(iP22, (java.lang.Long)100L);
    tp2.IP iP31 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP31.setFirst((java.lang.Integer)200);
    java.lang.Integer i34 = iP31.getFourth();
    iPBan26.setIp(iP31);
    boolean b36 = strictlySortedSinglyLinkedList12.contains(iPBan26);
    boolean b37 = strictlySortedSinglyLinkedList0.contains(iPBan26);
    strictlySortedSinglyLinkedList0.size = (-671088640);
    tp2.SinglyLinkedList singlyLinkedList40 = new tp2.SinglyLinkedList();
    boolean b41 = singlyLinkedList40.repOK();
    tp2.IP iP43 = singlyLinkedList40.get(200);
    boolean b44 = singlyLinkedList40.isEmpty();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList45 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b46 = strictlySortedSinglyLinkedList45.repOK();
    tp2.IP iP51 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i52 = iP51.getSecond();
    iP51.setFirst((java.lang.Integer)11001000);
    iP51.setFirst((java.lang.Integer)(-2147483648));
    boolean b57 = strictlySortedSinglyLinkedList45.removeFromIP(iP51);
    boolean b58 = singlyLinkedList40.remove(iP51);
    boolean b59 = strictlySortedSinglyLinkedList0.removeFromIP(iP51);
    tp2.IPBan iPBan61 = new tp2.IPBan(iP51, (java.lang.Long)92L);
    java.lang.Long long62 = iPBan61.expires;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i34 + "' != '" + 100+ "'", i34.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b46 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i52 + "' != '" + (-1)+ "'", i52.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b57 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b58 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b59 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long62 + "' != '" + 92L+ "'", long62.equals(92L));

  }

  @Test
  public void test332() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test332"); }


    java.lang.Integer i1 = java.lang.Integer.valueOf(1284442401);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 1284442401+ "'", i1.equals(1284442401));

  }

  @Test
  public void test333() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test333"); }


    int i2 = java.lang.Integer.rotateLeft(1320, (-1279208344));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 337920);

  }

  @Test
  public void test334() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test334"); }


    java.lang.Integer i2 = java.lang.Integer.getInteger("1011100111000100011101000000000", 11117);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i2 + "' != '" + 11117+ "'", i2.equals(11117));

  }

  @Test
  public void test335() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test335"); }


    tp2.SinglyLinkedList singlyLinkedList0 = new tp2.SinglyLinkedList();
    boolean b1 = singlyLinkedList0.repOK();
    tp2.IP iP3 = singlyLinkedList0.get(200);
    boolean b4 = singlyLinkedList0.isEmpty();
    tp2.IP iP9 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i10 = iP9.getThird();
    boolean b11 = singlyLinkedList0.remove(iP9);
    tp2.IP iP16 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP16.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan20 = new tp2.IPBan(iP16, (java.lang.Long)100L);
    tp2.IP iP21 = iPBan20.ip;
    tp2.IP iP22 = iPBan20.getIp();
    java.lang.Integer i23 = null;
    iP22.setFirst(i23);
    boolean b25 = singlyLinkedList0.contains(iP22);
    int i26 = singlyLinkedList0.getSize();
    tp2.SinglyLinkedList singlyLinkedList27 = new tp2.SinglyLinkedList();
    int i28 = singlyLinkedList27.getSize();
    tp2.IP iP33 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i34 = iP33.getSecond();
    java.lang.Integer i35 = iP33.getFourth();
    singlyLinkedList27.add(iP33);
    boolean b38 = iP33.equals((java.lang.Object)2147483647);
    tp2.IPBan iPBan40 = new tp2.IPBan(iP33, (java.lang.Long)(-1L));
    iP33.setThird((java.lang.Integer)(-2));
    java.lang.Integer i43 = iP33.getFirst();
    iP33.setFourth((java.lang.Integer)12);
    singlyLinkedList0.add(iP33);
    iP33.setFourth((java.lang.Integer)831941);
    iP33.setThird((java.lang.Integer)2157841);
    java.lang.Integer i51 = null;
    iP33.setFirst(i51);
    iP33.setFirst((java.lang.Integer)49157);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i10 + "' != '" + (-1)+ "'", i10.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i34 + "' != '" + (-1)+ "'", i34.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i35 + "' != '" + 100+ "'", i35.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i43 + "' != '" + (-1)+ "'", i43.equals((-1)));

  }

  @Test
  public void test336() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test336"); }


    java.lang.Integer i2 = java.lang.Integer.getInteger("340", (java.lang.Integer)372963);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i2 + "' != '" + 372963+ "'", i2.equals(372963));

  }

  @Test
  public void test337() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test337"); }


    int i2 = java.lang.Integer.compareUnsigned(0, 786544);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == (-1));

  }

  @Test
  public void test338() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test338"); }


    int i2 = java.lang.Integer.max(33780, 1152);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 33780);

  }

  @Test
  public void test339() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test339"); }


    java.lang.String str2 = java.lang.Integer.toUnsignedString(1213994247, 40434139);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1213994247"+ "'", str2.equals("1213994247"));

  }

  @Test
  public void test340() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test340"); }


    tp2.IP iP4 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i5 = iP4.getSecond();
    iP4.setFirst((java.lang.Integer)11001000);
    iP4.setFirst((java.lang.Integer)32);
    java.lang.Integer i10 = iP4.getFirst();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList11 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b12 = strictlySortedSinglyLinkedList11.repOK();
    tp2.IP iP17 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    boolean b18 = strictlySortedSinglyLinkedList11.containsIP(iP17);
    tp2.Node node19 = strictlySortedSinglyLinkedList11.header;
    boolean b20 = strictlySortedSinglyLinkedList11.isEmpty();
    int i21 = strictlySortedSinglyLinkedList11.getSize();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList22 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b23 = strictlySortedSinglyLinkedList22.repOK();
    tp2.IP iP28 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i29 = iP28.getSecond();
    iP28.setFirst((java.lang.Integer)11001000);
    iP28.setFirst((java.lang.Integer)(-2147483648));
    boolean b34 = strictlySortedSinglyLinkedList22.removeFromIP(iP28);
    tp2.Node node35 = strictlySortedSinglyLinkedList22.header;
    strictlySortedSinglyLinkedList11.header = node35;
    boolean b37 = strictlySortedSinglyLinkedList11.isEmpty();
    tp2.IP iP42 = new tp2.IP((java.lang.Integer)356246784, (java.lang.Integer)13, (java.lang.Integer)0, (java.lang.Integer)37469776);
    java.lang.Integer i43 = iP42.getFirst();
    boolean b44 = strictlySortedSinglyLinkedList11.containsIP(iP42);
    boolean b45 = iP4.equals((java.lang.Object)strictlySortedSinglyLinkedList11);
    tp2.SinglyLinkedList singlyLinkedList46 = new tp2.SinglyLinkedList();
    int i47 = singlyLinkedList46.getSize();
    tp2.IP iP52 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i53 = iP52.getSecond();
    java.lang.Integer i54 = iP52.getFourth();
    singlyLinkedList46.add(iP52);
    tp2.IPBan iPBan57 = new tp2.IPBan(iP52, (java.lang.Long)1L);
    tp2.IPBan iPBan59 = new tp2.IPBan(iP52, (java.lang.Long)100L);
    java.lang.Long long60 = iPBan59.expires;
    tp2.IP iP61 = iPBan59.ip;
    boolean b62 = strictlySortedSinglyLinkedList11.contains(iPBan59);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i5 + "' != '" + (-1)+ "'", i5.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i10 + "' != '" + 32+ "'", i10.equals(32));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i29 + "' != '" + (-1)+ "'", i29.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i43 + "' != '" + 356246784+ "'", i43.equals(356246784));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i47 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i53 + "' != '" + (-1)+ "'", i53.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i54 + "' != '" + 100+ "'", i54.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long60 + "' != '" + 100L+ "'", long60.equals(100L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP61);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b62 == false);

  }

  @Test
  public void test341() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test341"); }


    tp2.SinglyLinkedList singlyLinkedList0 = new tp2.SinglyLinkedList();
    int i1 = singlyLinkedList0.getSize();
    tp2.IP iP6 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i7 = iP6.getSecond();
    java.lang.Integer i8 = iP6.getFourth();
    singlyLinkedList0.add(iP6);
    tp2.IPBan iPBan11 = new tp2.IPBan(iP6, (java.lang.Long)100L);
    java.lang.Long long12 = null;
    tp2.IPBan iPBan13 = new tp2.IPBan(iP6, long12);
    tp2.IP iP18 = new tp2.IP((java.lang.Integer)(-939524096), (java.lang.Integer)2147483647, (java.lang.Integer)1451229184, (java.lang.Integer)5);
    iPBan13.ip = iP18;
    tp2.IP iP20 = iPBan13.ip;
    java.lang.Integer i21 = iP20.getThird();
    tp2.IPBan iPBan23 = new tp2.IPBan(iP20, (java.lang.Long)20480L);
    java.lang.Long long24 = iPBan23.getExpires();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i7 + "' != '" + (-1)+ "'", i7.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i8 + "' != '" + 100+ "'", i8.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i21 + "' != '" + 1451229184+ "'", i21.equals(1451229184));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long24 + "' != '" + 20480L+ "'", long24.equals(20480L));

  }

  @Test
  public void test342() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test342"); }


    java.lang.Integer i2 = java.lang.Integer.getInteger("10001010001010010000000000000000", (java.lang.Integer)508388608);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i2 + "' != '" + 508388608+ "'", i2.equals(508388608));

  }

  @Test
  public void test343() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test343"); }


    // The following exception was thrown during execution in test generation
    try {
      java.lang.Integer i1 = new java.lang.Integer("10110010101000000011");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test344() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test344"); }


    tp2.IP iP4 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i5 = iP4.getSecond();
    iP4.setFirst((java.lang.Integer)11001000);
    iP4.setFirst((java.lang.Integer)32);
    java.lang.Integer i10 = iP4.getFirst();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList11 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b12 = strictlySortedSinglyLinkedList11.repOK();
    tp2.IP iP17 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    boolean b18 = strictlySortedSinglyLinkedList11.containsIP(iP17);
    tp2.Node node19 = strictlySortedSinglyLinkedList11.header;
    boolean b20 = strictlySortedSinglyLinkedList11.isEmpty();
    int i21 = strictlySortedSinglyLinkedList11.getSize();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList22 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b23 = strictlySortedSinglyLinkedList22.repOK();
    tp2.IP iP28 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i29 = iP28.getSecond();
    iP28.setFirst((java.lang.Integer)11001000);
    iP28.setFirst((java.lang.Integer)(-2147483648));
    boolean b34 = strictlySortedSinglyLinkedList22.removeFromIP(iP28);
    tp2.Node node35 = strictlySortedSinglyLinkedList22.header;
    strictlySortedSinglyLinkedList11.header = node35;
    boolean b37 = strictlySortedSinglyLinkedList11.isEmpty();
    tp2.IP iP42 = new tp2.IP((java.lang.Integer)356246784, (java.lang.Integer)13, (java.lang.Integer)0, (java.lang.Integer)37469776);
    java.lang.Integer i43 = iP42.getFirst();
    boolean b44 = strictlySortedSinglyLinkedList11.containsIP(iP42);
    boolean b45 = iP4.equals((java.lang.Object)strictlySortedSinglyLinkedList11);
    int i46 = strictlySortedSinglyLinkedList11.getSize();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList47 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b48 = strictlySortedSinglyLinkedList47.repOK();
    strictlySortedSinglyLinkedList47.size = 1;
    strictlySortedSinglyLinkedList47.size = 0;
    boolean b53 = strictlySortedSinglyLinkedList47.repOK();
    int i54 = strictlySortedSinglyLinkedList47.getSize();
    tp2.IPBan iPBan56 = strictlySortedSinglyLinkedList47.get(469762048);
    int i57 = strictlySortedSinglyLinkedList47.getSize();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList58 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b59 = strictlySortedSinglyLinkedList58.repOK();
    strictlySortedSinglyLinkedList58.size = 1;
    strictlySortedSinglyLinkedList58.size = 0;
    tp2.IPBan iPBan64 = null;
    boolean b65 = strictlySortedSinglyLinkedList58.add(iPBan64);
    int i66 = strictlySortedSinglyLinkedList58.getSize();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList67 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b68 = strictlySortedSinglyLinkedList67.repOK();
    tp2.IP iP73 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    boolean b74 = strictlySortedSinglyLinkedList67.containsIP(iP73);
    tp2.Node node75 = strictlySortedSinglyLinkedList67.header;
    boolean b76 = strictlySortedSinglyLinkedList67.isEmpty();
    int i77 = strictlySortedSinglyLinkedList67.getSize();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList78 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b79 = strictlySortedSinglyLinkedList78.repOK();
    tp2.IP iP84 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i85 = iP84.getSecond();
    iP84.setFirst((java.lang.Integer)11001000);
    iP84.setFirst((java.lang.Integer)(-2147483648));
    boolean b90 = strictlySortedSinglyLinkedList78.removeFromIP(iP84);
    tp2.Node node91 = strictlySortedSinglyLinkedList78.header;
    strictlySortedSinglyLinkedList67.header = node91;
    strictlySortedSinglyLinkedList58.header = node91;
    strictlySortedSinglyLinkedList47.header = node91;
    strictlySortedSinglyLinkedList11.header = node91;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i5 + "' != '" + (-1)+ "'", i5.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i10 + "' != '" + 32+ "'", i10.equals(32));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i29 + "' != '" + (-1)+ "'", i29.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i43 + "' != '" + 356246784+ "'", i43.equals(356246784));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i46 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b48 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b53 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i54 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iPBan56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i57 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b59 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b65 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i66 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b68 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b74 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node75);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b76 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i77 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b79 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i85 + "' != '" + (-1)+ "'", i85.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b90 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node91);

  }

  @Test
  public void test345() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test345"); }


    int i1 = java.lang.Integer.numberOfTrailingZeros((-1059454976));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 17);

  }

  @Test
  public void test346() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test346"); }


    long long1 = java.lang.Integer.toUnsignedLong((-419168256));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == 3875799040L);

  }

  @Test
  public void test347() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test347"); }


    int i2 = java.lang.Integer.rotateRight(1610612738, 846526464);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1610612738);

  }

  @Test
  public void test348() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test348"); }


    int i2 = java.lang.Integer.rotateRight(25437, (-473812921));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == (-1174404922));

  }

  @Test
  public void test349() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test349"); }


    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList0 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b1 = strictlySortedSinglyLinkedList0.repOK();
    tp2.IP iP6 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    boolean b7 = strictlySortedSinglyLinkedList0.containsIP(iP6);
    tp2.Node node8 = strictlySortedSinglyLinkedList0.header;
    boolean b9 = strictlySortedSinglyLinkedList0.isEmpty();
    tp2.IPBan iPBan11 = strictlySortedSinglyLinkedList0.get(3);
    strictlySortedSinglyLinkedList0.size = 200;
    tp2.IPBan iPBan15 = strictlySortedSinglyLinkedList0.get(1610612736);
    tp2.SinglyLinkedList singlyLinkedList16 = new tp2.SinglyLinkedList();
    int i17 = singlyLinkedList16.getSize();
    tp2.IP iP22 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i23 = iP22.getSecond();
    java.lang.Integer i24 = iP22.getFourth();
    singlyLinkedList16.add(iP22);
    tp2.IP iP27 = singlyLinkedList16.get(5);
    boolean b28 = singlyLinkedList16.repOK();
    tp2.IP iP30 = singlyLinkedList16.get(2013265920);
    tp2.IP iP32 = singlyLinkedList16.get((-1));
    java.lang.Integer i33 = iP32.getThird();
    boolean b34 = strictlySortedSinglyLinkedList0.removeFromIP(iP32);
    java.lang.Integer i35 = iP32.getThird();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iPBan11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iPBan15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i23 + "' != '" + (-1)+ "'", i23.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i24 + "' != '" + 100+ "'", i24.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i33 + "' != '" + (-1)+ "'", i33.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i35 + "' != '" + (-1)+ "'", i35.equals((-1)));

  }

  @Test
  public void test350() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test350"); }


    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList0 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IPBan iPBan1 = null;
    boolean b2 = strictlySortedSinglyLinkedList0.add(iPBan1);
    int i3 = strictlySortedSinglyLinkedList0.getSize();
    tp2.Node node4 = strictlySortedSinglyLinkedList0.header;
    int i5 = strictlySortedSinglyLinkedList0.getSize();
    tp2.Node node6 = strictlySortedSinglyLinkedList0.header;
    boolean b7 = strictlySortedSinglyLinkedList0.repOK();
    tp2.IP iP12 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i13 = iP12.getSecond();
    iP12.setFirst((java.lang.Integer)11001000);
    java.lang.Long long16 = null;
    tp2.IPBan iPBan17 = new tp2.IPBan(iP12, long16);
    tp2.IP iP18 = iPBan17.ip;
    tp2.IP iP19 = iPBan17.ip;
    // The following exception was thrown during execution in test generation
    try {
      boolean b20 = strictlySortedSinglyLinkedList0.contains(iPBan17);
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
    org.junit.Assert.assertTrue(i3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i13 + "' != '" + (-1)+ "'", i13.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP19);

  }

  @Test
  public void test351() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test351"); }


    int i2 = java.lang.Integer.min(46, 6574112);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 46);

  }

  @Test
  public void test352() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test352"); }


    int i2 = java.lang.Integer.compareUnsigned(8388608, (-1610612736));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == (-1));

  }

  @Test
  public void test353() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test353"); }


    int i2 = java.lang.Integer.remainderUnsigned(6034312, (-1060879377));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 6034312);

  }

  @Test
  public void test354() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test354"); }


    int i2 = java.lang.Integer.max(27820032, 4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 27820032);

  }

  @Test
  public void test355() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test355"); }


    // The following exception was thrown during execution in test generation
    try {
      int i2 = java.lang.Integer.parseInt("772058", 667772160);
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

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test356"); }


    java.lang.Integer i1 = new java.lang.Integer(130028245);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 130028245+ "'", i1.equals(130028245));

  }

  @Test
  public void test357() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test357"); }


    int i1 = java.lang.Integer.bitCount((-1919531456));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 12);

  }

  @Test
  public void test358() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test358"); }


    int i2 = java.lang.Integer.rotateRight(254203300, 19531250);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == (-1251408951));

  }

  @Test
  public void test359() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test359"); }


    tp2.SinglyLinkedList singlyLinkedList0 = new tp2.SinglyLinkedList();
    boolean b1 = singlyLinkedList0.repOK();
    tp2.IP iP6 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP6.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan10 = new tp2.IPBan(iP6, (java.lang.Long)100L);
    iP6.setFourth((java.lang.Integer)32);
    singlyLinkedList0.add(iP6);
    boolean b14 = singlyLinkedList0.isEmpty();
    boolean b15 = singlyLinkedList0.isEmpty();
    boolean b16 = singlyLinkedList0.isEmpty();
    boolean b17 = singlyLinkedList0.isEmpty();
    int i18 = singlyLinkedList0.getSize();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 1);

  }

  @Test
  public void test360() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test360"); }


    tp2.SinglyLinkedList singlyLinkedList0 = new tp2.SinglyLinkedList();
    int i1 = singlyLinkedList0.getSize();
    tp2.IP iP6 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i7 = iP6.getSecond();
    java.lang.Integer i8 = iP6.getFourth();
    singlyLinkedList0.add(iP6);
    tp2.IP iP11 = singlyLinkedList0.get(5);
    boolean b12 = singlyLinkedList0.repOK();
    tp2.IP iP14 = singlyLinkedList0.get(2013265920);
    int i15 = singlyLinkedList0.getSize();
    boolean b16 = singlyLinkedList0.isEmpty();
    tp2.IP iP21 = new tp2.IP((java.lang.Integer)356246784, (java.lang.Integer)(-939524096), (java.lang.Integer)2013265928, (java.lang.Integer)(-2147483648));
    java.lang.Integer i22 = iP21.getThird();
    tp2.IPBan iPBan24 = new tp2.IPBan(iP21, (java.lang.Long)38L);
    boolean b25 = singlyLinkedList0.remove(iP21);
    iP21.setFourth((java.lang.Integer)(-122));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i7 + "' != '" + (-1)+ "'", i7.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i8 + "' != '" + 100+ "'", i8.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i22 + "' != '" + 2013265928+ "'", i22.equals(2013265928));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);

  }

  @Test
  public void test361() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test361"); }


    long long1 = java.lang.Integer.toUnsignedLong(1483210952);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == 1483210952L);

  }

  @Test
  public void test362() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test362"); }


    int i1 = java.lang.Integer.reverse((-2144796578));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 2046858241);

  }

  @Test
  public void test363() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test363"); }


    tp2.SinglyLinkedList singlyLinkedList0 = new tp2.SinglyLinkedList();
    int i1 = singlyLinkedList0.getSize();
    int i2 = singlyLinkedList0.getSize();
    tp2.IP iP3 = null;
    boolean b4 = singlyLinkedList0.contains(iP3);
    tp2.IP iP6 = singlyLinkedList0.get(27);
    tp2.IP iP11 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP11.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan15 = new tp2.IPBan(iP11, (java.lang.Long)100L);
    tp2.IP iP16 = iPBan15.ip;
    tp2.IP iP21 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP21.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan25 = new tp2.IPBan(iP21, (java.lang.Long)100L);
    iPBan15.setIp(iP21);
    boolean b27 = singlyLinkedList0.remove(iP21);
    int i28 = singlyLinkedList0.getSize();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == 0);

  }

  @Test
  public void test364() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test364"); }


    java.lang.Integer i1 = new java.lang.Integer("35");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 35+ "'", i1.equals(35));

  }

  @Test
  public void test365() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test365"); }


    java.lang.String str1 = java.lang.Integer.toOctalString((-2030043137));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "20677777777"+ "'", str1.equals("20677777777"));

  }

  @Test
  public void test366() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test366"); }


    java.lang.Integer i1 = java.lang.Integer.valueOf("4000");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 4000+ "'", i1.equals(4000));

  }

  @Test
  public void test367() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test367"); }


    // The following exception was thrown during execution in test generation
    try {
      java.lang.Integer i2 = java.lang.Integer.valueOf("4e7", 91);
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test368() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test368"); }


    tp2.IP iP4 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP4.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan8 = new tp2.IPBan(iP4, (java.lang.Long)100L);
    tp2.IP iP9 = iPBan8.ip;
    tp2.SinglyLinkedList singlyLinkedList10 = new tp2.SinglyLinkedList();
    int i11 = singlyLinkedList10.getSize();
    tp2.IP iP16 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i17 = iP16.getSecond();
    java.lang.Integer i18 = iP16.getFourth();
    singlyLinkedList10.add(iP16);
    boolean b20 = iP9.equals((java.lang.Object)iP16);
    tp2.IPBan iPBan22 = new tp2.IPBan(iP9, (java.lang.Long)7L);
    tp2.IP iP23 = iPBan22.ip;
    tp2.IP iP24 = iPBan22.getIp();
    iPBan22.setExpires((java.lang.Long)1157365760L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i17 + "' != '" + (-1)+ "'", i17.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i18 + "' != '" + 100+ "'", i18.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP24);

  }

  @Test
  public void test369() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test369"); }


    java.lang.String str2 = java.lang.Integer.toUnsignedString(2341861, 637534224);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "2341861"+ "'", str2.equals("2341861"));

  }

  @Test
  public void test370() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test370"); }


    java.lang.String str2 = java.lang.Integer.toUnsignedString(7424, 3017156);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "7424"+ "'", str2.equals("7424"));

  }

  @Test
  public void test371() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test371"); }


    int i2 = java.lang.Integer.compare(262144, 945005268);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == (-1));

  }

  @Test
  public void test372() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test372"); }


    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList0 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b1 = strictlySortedSinglyLinkedList0.repOK();
    tp2.IP iP6 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i7 = iP6.getSecond();
    iP6.setFirst((java.lang.Integer)11001000);
    iP6.setFirst((java.lang.Integer)(-2147483648));
    boolean b12 = strictlySortedSinglyLinkedList0.removeFromIP(iP6);
    tp2.Node node13 = strictlySortedSinglyLinkedList0.header;
    boolean b14 = strictlySortedSinglyLinkedList0.isEmpty();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList15 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b16 = strictlySortedSinglyLinkedList15.repOK();
    tp2.IP iP21 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    boolean b22 = strictlySortedSinglyLinkedList15.containsIP(iP21);
    tp2.Node node23 = strictlySortedSinglyLinkedList15.header;
    boolean b24 = strictlySortedSinglyLinkedList15.isEmpty();
    int i25 = strictlySortedSinglyLinkedList15.getSize();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList26 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b27 = strictlySortedSinglyLinkedList26.repOK();
    tp2.IP iP32 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i33 = iP32.getSecond();
    iP32.setFirst((java.lang.Integer)11001000);
    iP32.setFirst((java.lang.Integer)(-2147483648));
    boolean b38 = strictlySortedSinglyLinkedList26.removeFromIP(iP32);
    tp2.Node node39 = strictlySortedSinglyLinkedList26.header;
    strictlySortedSinglyLinkedList15.header = node39;
    strictlySortedSinglyLinkedList0.header = node39;
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList42 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b43 = strictlySortedSinglyLinkedList42.repOK();
    tp2.IP iP48 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i49 = iP48.getSecond();
    iP48.setFirst((java.lang.Integer)11001000);
    iP48.setFirst((java.lang.Integer)(-2147483648));
    boolean b54 = strictlySortedSinglyLinkedList42.removeFromIP(iP48);
    tp2.IPBan iPBan55 = null;
    boolean b56 = strictlySortedSinglyLinkedList42.add(iPBan55);
    tp2.Node node57 = strictlySortedSinglyLinkedList42.header;
    tp2.Node node58 = strictlySortedSinglyLinkedList42.header;
    strictlySortedSinglyLinkedList0.header = node58;
    tp2.IPBan iPBan61 = strictlySortedSinglyLinkedList0.get(24);
    int i62 = strictlySortedSinglyLinkedList0.getSize();
    boolean b63 = strictlySortedSinglyLinkedList0.repOK();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i7 + "' != '" + (-1)+ "'", i7.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i33 + "' != '" + (-1)+ "'", i33.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b43 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i49 + "' != '" + (-1)+ "'", i49.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b54 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b56 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node58);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iPBan61);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i62 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b63 == false);

  }

  @Test
  public void test373() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test373"); }


    java.lang.String str1 = java.lang.Integer.toBinaryString(8388919);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "100000000000000100110111"+ "'", str1.equals("100000000000000100110111"));

  }

  @Test
  public void test374() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test374"); }


    int i2 = java.lang.Integer.sum(65354517, 8431617);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 73786134);

  }

  @Test
  public void test375() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test375"); }


    java.lang.String str1 = java.lang.Integer.toOctalString(278528);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "1040000"+ "'", str1.equals("1040000"));

  }

  @Test
  public void test376() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test376"); }


    tp2.SinglyLinkedList singlyLinkedList0 = new tp2.SinglyLinkedList();
    boolean b1 = singlyLinkedList0.repOK();
    tp2.IP iP3 = singlyLinkedList0.get(200);
    boolean b4 = singlyLinkedList0.isEmpty();
    boolean b5 = singlyLinkedList0.repOK();
    boolean b6 = singlyLinkedList0.repOK();
    boolean b7 = singlyLinkedList0.repOK();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList8 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b9 = strictlySortedSinglyLinkedList8.repOK();
    tp2.IP iP14 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i15 = iP14.getSecond();
    iP14.setFirst((java.lang.Integer)11001000);
    iP14.setFirst((java.lang.Integer)(-2147483648));
    boolean b20 = strictlySortedSinglyLinkedList8.removeFromIP(iP14);
    tp2.IPBan iPBan22 = strictlySortedSinglyLinkedList8.get((-1));
    tp2.IPBan iPBan24 = strictlySortedSinglyLinkedList8.get(16);
    boolean b25 = strictlySortedSinglyLinkedList8.repOK();
    boolean b26 = strictlySortedSinglyLinkedList8.repOK();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList27 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b28 = strictlySortedSinglyLinkedList27.isEmpty();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList29 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b30 = strictlySortedSinglyLinkedList29.repOK();
    tp2.IP iP35 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    boolean b36 = strictlySortedSinglyLinkedList29.containsIP(iP35);
    tp2.Node node37 = strictlySortedSinglyLinkedList29.header;
    strictlySortedSinglyLinkedList27.header = node37;
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList39 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b40 = strictlySortedSinglyLinkedList39.repOK();
    strictlySortedSinglyLinkedList39.size = 1;
    strictlySortedSinglyLinkedList39.size = 0;
    tp2.IP iP49 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP49.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan53 = new tp2.IPBan(iP49, (java.lang.Long)100L);
    tp2.IP iP58 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP58.setFirst((java.lang.Integer)200);
    java.lang.Integer i61 = iP58.getFourth();
    iPBan53.setIp(iP58);
    boolean b63 = strictlySortedSinglyLinkedList39.contains(iPBan53);
    boolean b64 = strictlySortedSinglyLinkedList27.contains(iPBan53);
    tp2.IP iP65 = iPBan53.ip;
    tp2.IP iP66 = iPBan53.getIp();
    boolean b67 = strictlySortedSinglyLinkedList8.add(iPBan53);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList68 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b69 = strictlySortedSinglyLinkedList68.repOK();
    strictlySortedSinglyLinkedList68.size = 1;
    strictlySortedSinglyLinkedList68.size = 0;
    tp2.IP iP78 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i79 = iP78.getSecond();
    java.lang.Integer i80 = iP78.getFourth();
    boolean b81 = strictlySortedSinglyLinkedList68.containsIP(iP78);
    java.lang.Integer i82 = iP78.getThird();
    tp2.IPBan iPBan84 = new tp2.IPBan(iP78, (java.lang.Long)469762048L);
    java.lang.Long long85 = iPBan84.getExpires();
    boolean b86 = strictlySortedSinglyLinkedList8.contains(iPBan84);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList87 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b88 = strictlySortedSinglyLinkedList87.repOK();
    tp2.IP iP93 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    boolean b94 = strictlySortedSinglyLinkedList87.containsIP(iP93);
    java.lang.Integer i95 = iP93.getSecond();
    boolean b96 = strictlySortedSinglyLinkedList8.containsIP(iP93);
    java.lang.Integer i97 = iP93.getFourth();
    singlyLinkedList0.add(iP93);
    java.lang.Integer i99 = iP93.getFourth();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i15 + "' != '" + (-1)+ "'", i15.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iPBan22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iPBan24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i61 + "' != '" + 100+ "'", i61.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b63 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b64 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP65);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP66);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b67 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b69 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i79 + "' != '" + (-1)+ "'", i79.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i80 + "' != '" + 100+ "'", i80.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b81 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i82 + "' != '" + (-1)+ "'", i82.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long85 + "' != '" + 469762048L+ "'", long85.equals(469762048L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b86 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b88 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b94 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i95 + "' != '" + (-1)+ "'", i95.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b96 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i97 + "' != '" + 100+ "'", i97.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i99 + "' != '" + 100+ "'", i99.equals(100));

  }

  @Test
  public void test377() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test377"); }


    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList0 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b1 = strictlySortedSinglyLinkedList0.repOK();
    strictlySortedSinglyLinkedList0.size = 1;
    strictlySortedSinglyLinkedList0.size = 0;
    tp2.IP iP10 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i11 = iP10.getSecond();
    java.lang.Integer i12 = iP10.getFourth();
    boolean b13 = strictlySortedSinglyLinkedList0.containsIP(iP10);
    java.lang.Integer i14 = iP10.getThird();
    iP10.setSecond((java.lang.Integer)637534224);
    iP10.setFirst((java.lang.Integer)(-657371747));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i11 + "' != '" + (-1)+ "'", i11.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i12 + "' != '" + 100+ "'", i12.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i14 + "' != '" + (-1)+ "'", i14.equals((-1)));

  }

  @Test
  public void test378() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test378"); }


    int i2 = java.lang.Integer.compareUnsigned(45842, 6695043);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == (-1));

  }

  @Test
  public void test379() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test379"); }


    int i2 = java.lang.Integer.rotateLeft(43, 2656);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 43);

  }

  @Test
  public void test380() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test380"); }


    int i2 = java.lang.Integer.min(5087874, 65000000);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 5087874);

  }

  @Test
  public void test381() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test381"); }


    java.lang.String str1 = java.lang.Integer.toHexString(50331648);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "3000000"+ "'", str1.equals("3000000"));

  }

  @Test
  public void test382() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test382"); }


    tp2.SinglyLinkedList singlyLinkedList0 = new tp2.SinglyLinkedList();
    boolean b1 = singlyLinkedList0.repOK();
    tp2.IP iP3 = singlyLinkedList0.get(200);
    boolean b4 = singlyLinkedList0.isEmpty();
    tp2.IP iP9 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i10 = iP9.getThird();
    boolean b11 = singlyLinkedList0.remove(iP9);
    tp2.IP iP16 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP16.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan20 = new tp2.IPBan(iP16, (java.lang.Long)100L);
    tp2.IP iP21 = iPBan20.ip;
    tp2.IP iP22 = iPBan20.getIp();
    java.lang.Integer i23 = null;
    iP22.setFirst(i23);
    boolean b25 = singlyLinkedList0.contains(iP22);
    int i26 = singlyLinkedList0.getSize();
    boolean b27 = singlyLinkedList0.isEmpty();
    tp2.SinglyLinkedList singlyLinkedList28 = new tp2.SinglyLinkedList();
    int i29 = singlyLinkedList28.getSize();
    tp2.IP iP34 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i35 = iP34.getSecond();
    java.lang.Integer i36 = iP34.getFourth();
    singlyLinkedList28.add(iP34);
    tp2.IPBan iPBan39 = new tp2.IPBan(iP34, (java.lang.Long)100L);
    iP34.setThird((java.lang.Integer)(-2147483641));
    java.lang.Integer i42 = iP34.getFirst();
    java.lang.Integer i43 = iP34.getFirst();
    singlyLinkedList0.add(iP34);
    iP34.setFourth((java.lang.Integer)1359282176);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i10 + "' != '" + (-1)+ "'", i10.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i29 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i35 + "' != '" + (-1)+ "'", i35.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i36 + "' != '" + 100+ "'", i36.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i42 + "' != '" + (-1)+ "'", i42.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i43 + "' != '" + (-1)+ "'", i43.equals((-1)));

  }

  @Test
  public void test383() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test383"); }


    int i1 = java.lang.Integer.signum((-213546269));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == (-1));

  }

  @Test
  public void test384() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test384"); }


    tp2.IP iP4 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i5 = iP4.getSecond();
    iP4.setFirst((java.lang.Integer)11001000);
    java.lang.Long long8 = null;
    tp2.IPBan iPBan9 = new tp2.IPBan(iP4, long8);
    tp2.IP iP10 = iPBan9.ip;
    tp2.IP iP11 = iPBan9.ip;
    java.lang.Integer i12 = iP11.getSecond();
    iP11.setThird((java.lang.Integer)(-1471371072));
    java.lang.Long long15 = null;
    tp2.IPBan iPBan16 = new tp2.IPBan(iP11, long15);
    java.lang.Long long17 = null;
    iPBan16.setExpires(long17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i5 + "' != '" + (-1)+ "'", i5.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i12 + "' != '" + (-1)+ "'", i12.equals((-1)));

  }

  @Test
  public void test385() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test385"); }


    java.lang.Integer i2 = java.lang.Integer.getInteger("2952790016", (java.lang.Integer)765952);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i2 + "' != '" + 765952+ "'", i2.equals(765952));

  }

  @Test
  public void test386() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test386"); }


    int i2 = java.lang.Integer.rotateRight(5243264, 37470033);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 12582952);

  }

  @Test
  public void test387() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test387"); }


    java.lang.String str1 = java.lang.Integer.toBinaryString(3104);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "110000100000"+ "'", str1.equals("110000100000"));

  }

  @Test
  public void test388() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test388"); }


    java.lang.String str2 = java.lang.Integer.toUnsignedString(825, 536870912);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "825"+ "'", str2.equals("825"));

  }

  @Test
  public void test389() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test389"); }


    int i1 = java.lang.Integer.numberOfLeadingZeros(100510);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 15);

  }

  @Test
  public void test390() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test390"); }


    long long1 = java.lang.Integer.toUnsignedLong(112221);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == 112221L);

  }

  @Test
  public void test391() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test391"); }


    java.lang.Integer i1 = java.lang.Integer.getInteger("0");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);

  }

  @Test
  public void test392() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test392"); }


    int i2 = java.lang.Integer.sum(9703552, 2302604);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 12006156);

  }

  @Test
  public void test393() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test393"); }


    int i1 = java.lang.Integer.signum(1027604483);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 1);

  }

  @Test
  public void test394() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test394"); }


    java.lang.Integer i2 = java.lang.Integer.getInteger("", (java.lang.Integer)969408512);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i2 + "' != '" + 969408512+ "'", i2.equals(969408512));

  }

  @Test
  public void test395() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test395"); }


    java.lang.String str2 = java.lang.Integer.toUnsignedString(11100089, 184549395);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "11100089"+ "'", str2.equals("11100089"));

  }

  @Test
  public void test396() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test396"); }


    java.lang.String str2 = java.lang.Integer.toUnsignedString((-1207959552), 2013265928);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "3087007744"+ "'", str2.equals("3087007744"));

  }

  @Test
  public void test397() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test397"); }


    int i1 = java.lang.Integer.numberOfTrailingZeros(1040225960);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 3);

  }

  @Test
  public void test398() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test398"); }


    tp2.SinglyLinkedList singlyLinkedList0 = new tp2.SinglyLinkedList();
    int i1 = singlyLinkedList0.getSize();
    int i2 = singlyLinkedList0.getSize();
    tp2.IP iP3 = null;
    boolean b4 = singlyLinkedList0.contains(iP3);
    tp2.IP iP6 = singlyLinkedList0.get(27);
    tp2.IP iP11 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP11.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan15 = new tp2.IPBan(iP11, (java.lang.Long)100L);
    tp2.IP iP16 = iPBan15.ip;
    tp2.IP iP21 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP21.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan25 = new tp2.IPBan(iP21, (java.lang.Long)100L);
    iPBan15.setIp(iP21);
    boolean b27 = singlyLinkedList0.remove(iP21);
    tp2.IP iP29 = singlyLinkedList0.get(4);
    tp2.SinglyLinkedList singlyLinkedList30 = new tp2.SinglyLinkedList();
    int i31 = singlyLinkedList30.getSize();
    int i32 = singlyLinkedList30.getSize();
    tp2.IP iP33 = null;
    boolean b34 = singlyLinkedList30.contains(iP33);
    tp2.IP iP36 = singlyLinkedList30.get(27);
    tp2.IP iP41 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i42 = iP41.getSecond();
    iP41.setFirst((java.lang.Integer)11001000);
    java.lang.Long long45 = null;
    tp2.IPBan iPBan46 = new tp2.IPBan(iP41, long45);
    tp2.IP iP47 = iPBan46.ip;
    tp2.IP iP48 = iPBan46.ip;
    java.lang.Integer i49 = iP48.getFourth();
    boolean b50 = singlyLinkedList30.remove(iP48);
    tp2.IP iP55 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i56 = iP55.getSecond();
    iP55.setFirst((java.lang.Integer)11001000);
    java.lang.Long long59 = null;
    tp2.IPBan iPBan60 = new tp2.IPBan(iP55, long59);
    tp2.IP iP61 = iPBan60.ip;
    tp2.IP iP62 = iPBan60.ip;
    tp2.IPBan iPBan64 = new tp2.IPBan(iP62, (java.lang.Long)10L);
    singlyLinkedList30.add(iP62);
    boolean b66 = singlyLinkedList0.remove(iP62);
    boolean b67 = singlyLinkedList0.repOK();
    tp2.IP iP68 = null;
    boolean b69 = singlyLinkedList0.contains(iP68);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i31 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i32 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i42 + "' != '" + (-1)+ "'", i42.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i49 + "' != '" + 100+ "'", i49.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b50 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i56 + "' != '" + (-1)+ "'", i56.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP61);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP62);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b66 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b67 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b69 == false);

  }

  @Test
  public void test399() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test399"); }


    int i2 = java.lang.Integer.divideUnsigned((-1240858624), (-788267008));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);

  }

  @Test
  public void test400() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test400"); }


    int i2 = java.lang.Integer.divideUnsigned((-1849679071), 20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 122264411);

  }

  @Test
  public void test401() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test401"); }


    tp2.SinglyLinkedList singlyLinkedList0 = new tp2.SinglyLinkedList();
    int i1 = singlyLinkedList0.getSize();
    int i2 = singlyLinkedList0.getSize();
    tp2.IP iP3 = null;
    boolean b4 = singlyLinkedList0.contains(iP3);
    boolean b5 = singlyLinkedList0.repOK();
    boolean b6 = singlyLinkedList0.isEmpty();
    tp2.IP iP11 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP11.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan15 = new tp2.IPBan(iP11, (java.lang.Long)100L);
    tp2.IP iP16 = iPBan15.ip;
    tp2.IP iP21 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i22 = iP21.getFourth();
    java.lang.Integer i23 = iP21.getFourth();
    iP21.setThird((java.lang.Integer)200);
    iPBan15.ip = iP21;
    iP21.setFirst((java.lang.Integer)16777216);
    boolean b29 = singlyLinkedList0.remove(iP21);
    iP21.setSecond((java.lang.Integer)184549376);
    tp2.IPBan iPBan33 = new tp2.IPBan(iP21, (java.lang.Long)4195041L);
    tp2.SinglyLinkedList singlyLinkedList34 = new tp2.SinglyLinkedList();
    int i35 = singlyLinkedList34.getSize();
    boolean b36 = singlyLinkedList34.isEmpty();
    tp2.IP iP41 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP41.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan45 = new tp2.IPBan(iP41, (java.lang.Long)100L);
    tp2.IP iP46 = iPBan45.ip;
    iP46.setThird((java.lang.Integer)356246784);
    boolean b49 = singlyLinkedList34.remove(iP46);
    boolean b50 = singlyLinkedList34.repOK();
    int i51 = singlyLinkedList34.getSize();
    tp2.SinglyLinkedList singlyLinkedList52 = new tp2.SinglyLinkedList();
    boolean b53 = singlyLinkedList52.repOK();
    tp2.IP iP55 = singlyLinkedList52.get(200);
    boolean b56 = singlyLinkedList52.isEmpty();
    boolean b57 = singlyLinkedList52.repOK();
    tp2.SinglyLinkedList singlyLinkedList58 = new tp2.SinglyLinkedList();
    int i59 = singlyLinkedList58.getSize();
    tp2.IP iP64 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i65 = iP64.getSecond();
    java.lang.Integer i66 = iP64.getFourth();
    singlyLinkedList58.add(iP64);
    iP64.setFourth((java.lang.Integer)167772160);
    boolean b70 = singlyLinkedList52.contains(iP64);
    boolean b71 = singlyLinkedList34.contains(iP64);
    tp2.IPBan iPBan73 = new tp2.IPBan(iP64, (java.lang.Long)27L);
    boolean b74 = iP21.equals((java.lang.Object)iP64);
    java.lang.Integer i75 = iP21.getSecond();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i22 + "' != '" + 100+ "'", i22.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i23 + "' != '" + 100+ "'", i23.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i35 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b49 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b50 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i51 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b53 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP55);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b56 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b57 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i59 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i65 + "' != '" + (-1)+ "'", i65.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i66 + "' != '" + 100+ "'", i66.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b70 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b71 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b74 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i75 + "' != '" + 184549376+ "'", i75.equals(184549376));

  }

  @Test
  public void test402() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test402"); }


    int i1 = java.lang.Integer.lowestOneBit(75779);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 1);

  }

  @Test
  public void test403() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test403"); }


    tp2.SinglyLinkedList singlyLinkedList0 = new tp2.SinglyLinkedList();
    boolean b1 = singlyLinkedList0.repOK();
    int i2 = singlyLinkedList0.getSize();
    boolean b3 = singlyLinkedList0.isEmpty();
    int i4 = singlyLinkedList0.getSize();
    tp2.IP iP9 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP9.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan13 = new tp2.IPBan(iP9, (java.lang.Long)100L);
    tp2.IP iP14 = iPBan13.ip;
    tp2.IP iP15 = iPBan13.getIp();
    java.lang.Integer i16 = null;
    iP15.setFirst(i16);
    iP15.setFirst((java.lang.Integer)8);
    boolean b20 = singlyLinkedList0.contains(iP15);
    boolean b21 = singlyLinkedList0.repOK();
    tp2.IP iP26 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP26.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan30 = new tp2.IPBan(iP26, (java.lang.Long)100L);
    tp2.IP iP31 = iPBan30.ip;
    tp2.IP iP36 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP36.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan40 = new tp2.IPBan(iP36, (java.lang.Long)100L);
    iPBan30.setIp(iP36);
    tp2.IPBan iPBan43 = new tp2.IPBan(iP36, (java.lang.Long)(-1L));
    iP36.setFirst((java.lang.Integer)242);
    boolean b46 = singlyLinkedList0.contains(iP36);
    java.lang.Integer i47 = iP36.getFirst();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b46 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i47 + "' != '" + 242+ "'", i47.equals(242));

  }

  @Test
  public void test404() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test404"); }


    int i1 = java.lang.Integer.numberOfLeadingZeros(1694498816);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 1);

  }

  @Test
  public void test405() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test405"); }


    int i2 = java.lang.Integer.remainderUnsigned(14352640, 513015808);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 14352640);

  }

  @Test
  public void test406() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test406"); }


    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList0 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b1 = strictlySortedSinglyLinkedList0.repOK();
    tp2.IP iP6 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    boolean b7 = strictlySortedSinglyLinkedList0.containsIP(iP6);
    tp2.IPBan iPBan9 = strictlySortedSinglyLinkedList0.get(160);
    tp2.IPBan iPBan10 = null;
    boolean b11 = strictlySortedSinglyLinkedList0.contains(iPBan10);
    boolean b12 = strictlySortedSinglyLinkedList0.isEmpty();
    tp2.Node node13 = strictlySortedSinglyLinkedList0.header;
    boolean b14 = strictlySortedSinglyLinkedList0.repOK();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iPBan9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);

  }

  @Test
  public void test407() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test407"); }


    java.lang.Integer i1 = java.lang.Integer.valueOf(1325400064);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 1325400064+ "'", i1.equals(1325400064));

  }

  @Test
  public void test408() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test408"); }


    int i2 = java.lang.Integer.compareUnsigned(303104, 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);

  }

  @Test
  public void test409() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test409"); }


    java.lang.Integer i1 = java.lang.Integer.valueOf("207025415");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 207025415+ "'", i1.equals(207025415));

  }

  @Test
  public void test410() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test410"); }


    int i1 = java.lang.Integer.numberOfLeadingZeros(33554838);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 6);

  }

  @Test
  public void test411() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test411"); }


    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList0 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.SinglyLinkedList singlyLinkedList1 = new tp2.SinglyLinkedList();
    int i2 = singlyLinkedList1.getSize();
    tp2.IP iP7 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i8 = iP7.getSecond();
    java.lang.Integer i9 = iP7.getFourth();
    singlyLinkedList1.add(iP7);
    tp2.IP iP12 = singlyLinkedList1.get(5);
    boolean b13 = singlyLinkedList1.repOK();
    tp2.IP iP15 = singlyLinkedList1.get(2013265920);
    tp2.SinglyLinkedList singlyLinkedList16 = new tp2.SinglyLinkedList();
    int i17 = singlyLinkedList16.getSize();
    tp2.IP iP22 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i23 = iP22.getSecond();
    java.lang.Integer i24 = iP22.getFourth();
    singlyLinkedList16.add(iP22);
    iP22.setFourth((java.lang.Integer)167772160);
    singlyLinkedList1.add(iP22);
    java.lang.Object obj29 = null;
    boolean b30 = iP22.equals(obj29);
    iP22.setSecond((java.lang.Integer)20);
    tp2.IPBan iPBan34 = new tp2.IPBan(iP22, (java.lang.Long)20L);
    java.lang.Integer i35 = iP22.getFirst();
    boolean b36 = strictlySortedSinglyLinkedList0.removeFromIP(iP22);
    tp2.IP iP41 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP41.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan45 = new tp2.IPBan(iP41, (java.lang.Long)100L);
    tp2.IP iP50 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP50.setFirst((java.lang.Integer)200);
    java.lang.Integer i53 = iP50.getFourth();
    iPBan45.setIp(iP50);
    iPBan45.setExpires((java.lang.Long)2147483648L);
    tp2.IP iP61 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP61.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan65 = new tp2.IPBan(iP61, (java.lang.Long)100L);
    tp2.IP iP66 = iPBan65.ip;
    tp2.IP iP71 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP71.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan75 = new tp2.IPBan(iP71, (java.lang.Long)100L);
    iPBan65.setIp(iP71);
    java.lang.Long long77 = iPBan65.getExpires();
    tp2.IP iP78 = iPBan65.ip;
    iP78.setThird((java.lang.Integer)0);
    iPBan45.ip = iP78;
    boolean b82 = strictlySortedSinglyLinkedList0.add(iPBan45);
    tp2.IP iP87 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP87.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan91 = new tp2.IPBan(iP87, (java.lang.Long)100L);
    iP87.setThird((java.lang.Integer)5888);
    boolean b94 = strictlySortedSinglyLinkedList0.containsIP(iP87);
    boolean b95 = strictlySortedSinglyLinkedList0.repOK();
    tp2.IPBan iPBan97 = strictlySortedSinglyLinkedList0.get(385);
    boolean b98 = strictlySortedSinglyLinkedList0.repOK();
    boolean b99 = strictlySortedSinglyLinkedList0.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i8 + "' != '" + (-1)+ "'", i8.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 100+ "'", i9.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i23 + "' != '" + (-1)+ "'", i23.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i24 + "' != '" + 100+ "'", i24.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i35 + "' != '" + (-1)+ "'", i35.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i53 + "' != '" + 100+ "'", i53.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP66);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long77 + "' != '" + 100L+ "'", long77.equals(100L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP78);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b82 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b94 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b95 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iPBan97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b98 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b99 == false);

  }

  @Test
  public void test412() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test412"); }


    java.lang.Integer i1 = new java.lang.Integer(1610612979);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 1610612979+ "'", i1.equals(1610612979));

  }

  @Test
  public void test413() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test413"); }


    int i2 = java.lang.Integer.rotateLeft(7000000, (-1158594560));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 7000000);

  }

  @Test
  public void test414() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test414"); }


    int i1 = java.lang.Integer.signum((-1509949440));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == (-1));

  }

  @Test
  public void test415() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test415"); }


    // The following exception was thrown during execution in test generation
    try {
      int i1 = java.lang.Integer.parseInt("4df94bf8");
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

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test416"); }


    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList0 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b1 = strictlySortedSinglyLinkedList0.repOK();
    strictlySortedSinglyLinkedList0.size = 1;
    boolean b4 = strictlySortedSinglyLinkedList0.isEmpty();
    int i5 = strictlySortedSinglyLinkedList0.getSize();
    boolean b6 = strictlySortedSinglyLinkedList0.isEmpty();
    int i7 = strictlySortedSinglyLinkedList0.getSize();
    strictlySortedSinglyLinkedList0.size = 4;
    boolean b10 = strictlySortedSinglyLinkedList0.repOK();
    tp2.Node node11 = strictlySortedSinglyLinkedList0.header;
    strictlySortedSinglyLinkedList0.size = 734003200;
    tp2.Node node14 = strictlySortedSinglyLinkedList0.header;
    tp2.IP iP19 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP19.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan23 = new tp2.IPBan(iP19, (java.lang.Long)100L);
    tp2.IP iP28 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iPBan23.setIp(iP28);
    iPBan23.setExpires((java.lang.Long)1L);
    tp2.IP iP32 = iPBan23.getIp();
    iPBan23.setExpires((java.lang.Long)2147483655L);
    iPBan23.expires = 7L;
    java.lang.Long long37 = iPBan23.getExpires();
    java.lang.Long long38 = iPBan23.expires;
    tp2.IP iP39 = iPBan23.ip;
    boolean b40 = strictlySortedSinglyLinkedList0.removeFromIP(iP39);
    iP39.setFourth((java.lang.Integer)37918);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long37 + "' != '" + 7L+ "'", long37.equals(7L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long38 + "' != '" + 7L+ "'", long38.equals(7L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == false);

  }

  @Test
  public void test417() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test417"); }


    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList0 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b1 = strictlySortedSinglyLinkedList0.repOK();
    tp2.IPBan iPBan3 = strictlySortedSinglyLinkedList0.get(356246784);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList4 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b5 = strictlySortedSinglyLinkedList4.repOK();
    strictlySortedSinglyLinkedList4.size = 1;
    strictlySortedSinglyLinkedList4.size = 0;
    tp2.IP iP14 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP14.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan18 = new tp2.IPBan(iP14, (java.lang.Long)100L);
    tp2.IP iP19 = iPBan18.ip;
    boolean b20 = strictlySortedSinglyLinkedList4.contains(iPBan18);
    boolean b21 = strictlySortedSinglyLinkedList4.isEmpty();
    tp2.Node node22 = strictlySortedSinglyLinkedList4.header;
    strictlySortedSinglyLinkedList0.header = node22;
    tp2.IP iP28 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i29 = iP28.getSecond();
    iP28.setFirst((java.lang.Integer)11001000);
    java.lang.Integer i32 = iP28.getFourth();
    iP28.setFirst((java.lang.Integer)12);
    boolean b35 = strictlySortedSinglyLinkedList0.containsIP(iP28);
    int i36 = strictlySortedSinglyLinkedList0.getSize();
    tp2.Node node37 = strictlySortedSinglyLinkedList0.header;
    tp2.Node node38 = strictlySortedSinglyLinkedList0.header;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iPBan3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i29 + "' != '" + (-1)+ "'", i29.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i32 + "' != '" + 100+ "'", i32.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node38);

  }

  @Test
  public void test418() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test418"); }


    long long1 = java.lang.Integer.toUnsignedLong((-1342177280));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == 2952790016L);

  }

  @Test
  public void test419() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test419"); }


    int i1 = java.lang.Integer.signum(2302);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 1);

  }

  @Test
  public void test420() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test420"); }


    java.lang.String str2 = java.lang.Integer.toUnsignedString(1565524443, (-1811939327));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1565524443"+ "'", str2.equals("1565524443"));

  }

  @Test
  public void test421() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test421"); }


    int i2 = java.lang.Integer.min(2622208, 5087874);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 2622208);

  }

  @Test
  public void test422() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test422"); }


    tp2.IP iP4 = new tp2.IP((java.lang.Integer)37889, (java.lang.Integer)2147483646, (java.lang.Integer)1778450432, (java.lang.Integer)(-2146859648));
    iP4.setThird((java.lang.Integer)12800);

  }

  @Test
  public void test423() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test423"); }


    java.lang.Integer i2 = java.lang.Integer.getInteger("11001111101000100101000100000011", 1908126);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i2 + "' != '" + 1908126+ "'", i2.equals(1908126));

  }

  @Test
  public void test424() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test424"); }


    tp2.SinglyLinkedList singlyLinkedList0 = new tp2.SinglyLinkedList();
    boolean b1 = singlyLinkedList0.repOK();
    boolean b2 = singlyLinkedList0.isEmpty();
    tp2.IP iP7 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP7.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan11 = new tp2.IPBan(iP7, (java.lang.Long)100L);
    tp2.IP iP12 = iPBan11.ip;
    tp2.IP iP13 = iPBan11.getIp();
    java.lang.Integer i14 = null;
    iP13.setFirst(i14);
    iP13.setFirst((java.lang.Integer)8);
    tp2.SinglyLinkedList singlyLinkedList18 = new tp2.SinglyLinkedList();
    int i19 = singlyLinkedList18.getSize();
    tp2.IP iP24 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i25 = iP24.getSecond();
    java.lang.Integer i26 = iP24.getFourth();
    singlyLinkedList18.add(iP24);
    tp2.IPBan iPBan29 = new tp2.IPBan(iP24, (java.lang.Long)1L);
    tp2.SinglyLinkedList singlyLinkedList30 = new tp2.SinglyLinkedList();
    int i31 = singlyLinkedList30.getSize();
    tp2.IP iP36 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i37 = iP36.getSecond();
    java.lang.Integer i38 = iP36.getFourth();
    singlyLinkedList30.add(iP36);
    iP36.setFourth((java.lang.Integer)167772160);
    iP36.setSecond((java.lang.Integer)0);
    iPBan29.setIp(iP36);
    tp2.IP iP49 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP49.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan53 = new tp2.IPBan(iP49, (java.lang.Long)100L);
    tp2.IP iP54 = iPBan53.ip;
    tp2.IP iP55 = iPBan53.getIp();
    java.lang.Integer i56 = null;
    iP55.setFirst(i56);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList58 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b59 = strictlySortedSinglyLinkedList58.repOK();
    tp2.IP iP64 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i65 = iP64.getSecond();
    iP64.setFirst((java.lang.Integer)11001000);
    iP64.setFirst((java.lang.Integer)(-2147483648));
    boolean b70 = strictlySortedSinglyLinkedList58.removeFromIP(iP64);
    boolean b71 = iP55.equals((java.lang.Object)strictlySortedSinglyLinkedList58);
    tp2.IP iP76 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP76.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan80 = new tp2.IPBan(iP76, (java.lang.Long)100L);
    boolean b81 = strictlySortedSinglyLinkedList58.removeFromIP(iP76);
    java.lang.Integer i82 = iP76.getFirst();
    iPBan29.ip = iP76;
    boolean b84 = iP13.equals((java.lang.Object)iPBan29);
    boolean b85 = singlyLinkedList0.remove(iP13);
    int i86 = singlyLinkedList0.getSize();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i25 + "' != '" + (-1)+ "'", i25.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i26 + "' != '" + 100+ "'", i26.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i31 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i37 + "' != '" + (-1)+ "'", i37.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i38 + "' != '" + 100+ "'", i38.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP55);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b59 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i65 + "' != '" + (-1)+ "'", i65.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b70 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b71 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b81 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i82 + "' != '" + 200+ "'", i82.equals(200));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b84 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b85 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i86 == 0);

  }

  @Test
  public void test425() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test425"); }


    int i2 = java.lang.Integer.sum(32, (-160169983));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == (-160169951));

  }

  @Test
  public void test426() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test426"); }


    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList0 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b1 = strictlySortedSinglyLinkedList0.repOK();
    strictlySortedSinglyLinkedList0.size = 1;
    boolean b4 = strictlySortedSinglyLinkedList0.isEmpty();
    strictlySortedSinglyLinkedList0.size = 18;
    tp2.IP iP11 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP11.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan15 = new tp2.IPBan(iP11, (java.lang.Long)100L);
    tp2.IP iP20 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i21 = iP20.getSecond();
    java.lang.Integer i22 = iP20.getFourth();
    iP20.setFirst((java.lang.Integer)5);
    iPBan15.ip = iP20;
    java.lang.Long long26 = iPBan15.getExpires();
    iPBan15.setExpires((java.lang.Long)(-1L));
    iPBan15.expires = 100L;
    tp2.IP iP35 = new tp2.IP((java.lang.Integer)242, (java.lang.Integer)242, (java.lang.Integer)30, (java.lang.Integer)(-1));
    iP35.setSecond((java.lang.Integer)33554432);
    iPBan15.setIp(iP35);
    tp2.IP iP39 = iPBan15.ip;
    java.lang.Long long40 = null;
    iPBan15.expires = long40;
    tp2.IP iP42 = iPBan15.getIp();
    boolean b43 = strictlySortedSinglyLinkedList0.containsIP(iP42);
    tp2.Node node44 = strictlySortedSinglyLinkedList0.header;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i21 + "' != '" + (-1)+ "'", i21.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i22 + "' != '" + 100+ "'", i22.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long26 + "' != '" + 100L+ "'", long26.equals(100L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b43 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node44);

  }

  @Test
  public void test427() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test427"); }


    // The following exception was thrown during execution in test generation
    try {
      java.lang.Integer i2 = java.lang.Integer.valueOf("110100011100111011110000001", (-1348993024));
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test428() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test428"); }


    int i2 = java.lang.Integer.max(10000100, 1610612738);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1610612738);

  }

  @Test
  public void test429() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test429"); }


    int i1 = java.lang.Integer.highestOneBit(601526722);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 536870912);

  }

  @Test
  public void test430() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test430"); }


    int i1 = java.lang.Integer.lowestOneBit((-2134213366));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 2);

  }

  @Test
  public void test431() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test431"); }


    int i2 = java.lang.Integer.divideUnsigned((-973078522), 217056);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 15304);

  }

  @Test
  public void test432() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test432"); }


    int i2 = java.lang.Integer.rotateLeft(0, 8387072);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);

  }

  @Test
  public void test433() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test433"); }


    java.lang.String str1 = java.lang.Integer.toUnsignedString(1073741825);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "1073741825"+ "'", str1.equals("1073741825"));

  }

  @Test
  public void test434() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test434"); }


    int i1 = java.lang.Integer.numberOfLeadingZeros(155811880);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 4);

  }

  @Test
  public void test435() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test435"); }


    int i2 = java.lang.Integer.compare(187771894, 324321317);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == (-1));

  }

  @Test
  public void test436() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test436"); }


    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList0 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b1 = strictlySortedSinglyLinkedList0.repOK();
    tp2.IP iP6 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i7 = iP6.getSecond();
    iP6.setFirst((java.lang.Integer)11001000);
    iP6.setFirst((java.lang.Integer)(-2147483648));
    boolean b12 = strictlySortedSinglyLinkedList0.removeFromIP(iP6);
    tp2.IPBan iPBan14 = strictlySortedSinglyLinkedList0.get((-1));
    boolean b15 = strictlySortedSinglyLinkedList0.repOK();
    tp2.IP iP20 = new tp2.IP((java.lang.Integer)242, (java.lang.Integer)242, (java.lang.Integer)30, (java.lang.Integer)(-1));
    iP20.setSecond((java.lang.Integer)16);
    java.lang.Integer i23 = iP20.getFourth();
    boolean b24 = strictlySortedSinglyLinkedList0.removeFromIP(iP20);
    strictlySortedSinglyLinkedList0.size = 34;
    tp2.Node node27 = strictlySortedSinglyLinkedList0.header;
    strictlySortedSinglyLinkedList0.size = 1956642834;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i7 + "' != '" + (-1)+ "'", i7.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iPBan14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i23 + "' != '" + (-1)+ "'", i23.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node27);

  }

  @Test
  public void test437() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test437"); }


    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList0 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b1 = strictlySortedSinglyLinkedList0.isEmpty();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList2 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b3 = strictlySortedSinglyLinkedList2.repOK();
    tp2.IP iP8 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    boolean b9 = strictlySortedSinglyLinkedList2.containsIP(iP8);
    tp2.Node node10 = strictlySortedSinglyLinkedList2.header;
    strictlySortedSinglyLinkedList0.header = node10;
    tp2.SinglyLinkedList singlyLinkedList12 = new tp2.SinglyLinkedList();
    int i13 = singlyLinkedList12.getSize();
    tp2.IP iP18 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i19 = iP18.getSecond();
    java.lang.Integer i20 = iP18.getFourth();
    singlyLinkedList12.add(iP18);
    tp2.IPBan iPBan23 = new tp2.IPBan(iP18, (java.lang.Long)1L);
    tp2.SinglyLinkedList singlyLinkedList24 = new tp2.SinglyLinkedList();
    int i25 = singlyLinkedList24.getSize();
    tp2.IP iP30 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i31 = iP30.getSecond();
    java.lang.Integer i32 = iP30.getFourth();
    singlyLinkedList24.add(iP30);
    iP30.setFourth((java.lang.Integer)167772160);
    iP30.setSecond((java.lang.Integer)0);
    iPBan23.setIp(iP30);
    tp2.IP iP39 = iPBan23.ip;
    boolean b40 = strictlySortedSinglyLinkedList0.removeFromIP(iP39);
    tp2.IP iP45 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP45.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan49 = new tp2.IPBan(iP45, (java.lang.Long)100L);
    tp2.IP iP50 = iPBan49.ip;
    tp2.IP iP55 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP55.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan59 = new tp2.IPBan(iP55, (java.lang.Long)100L);
    iPBan49.setIp(iP55);
    java.lang.Long long61 = iPBan49.getExpires();
    java.lang.Long long62 = iPBan49.expires;
    boolean b63 = strictlySortedSinglyLinkedList0.contains(iPBan49);
    int i64 = strictlySortedSinglyLinkedList0.getSize();
    boolean b65 = strictlySortedSinglyLinkedList0.isEmpty();
    strictlySortedSinglyLinkedList0.size = 6294016;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i19 + "' != '" + (-1)+ "'", i19.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i20 + "' != '" + 100+ "'", i20.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i31 + "' != '" + (-1)+ "'", i31.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i32 + "' != '" + 100+ "'", i32.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long61 + "' != '" + 100L+ "'", long61.equals(100L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long62 + "' != '" + 100L+ "'", long62.equals(100L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b63 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i64 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b65 == true);

  }

  @Test
  public void test438() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test438"); }


    java.lang.String str2 = java.lang.Integer.toUnsignedString(335561509, 1644167167);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "335561509"+ "'", str2.equals("335561509"));

  }

  @Test
  public void test439() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test439"); }


    int i1 = java.lang.Integer.reverseBytes(14023182);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 251319552);

  }

  @Test
  public void test440() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test440"); }


    int i1 = java.lang.Integer.reverseBytes(539114496);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 3940896);

  }

  @Test
  public void test441() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test441"); }


    // The following exception was thrown during execution in test generation
    try {
      int i2 = java.lang.Integer.parseInt("3500000000", 21443883);
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test442() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test442"); }


    int i1 = java.lang.Integer.highestOneBit((-160169983));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == (-2147483648));

  }

  @Test
  public void test443() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test443"); }


    int i2 = java.lang.Integer.min(469762048, 10616);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 10616);

  }

  @Test
  public void test444() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test444"); }


    int i2 = java.lang.Integer.compareUnsigned(1104, 62079);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == (-1));

  }

  @Test
  public void test445() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test445"); }


    java.lang.Integer i2 = java.lang.Integer.getInteger("1213994247", 2146566144);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i2 + "' != '" + 2146566144+ "'", i2.equals(2146566144));

  }

  @Test
  public void test446() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test446"); }


    java.lang.Integer i2 = java.lang.Integer.getInteger("1073741824", 312765);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i2 + "' != '" + 312765+ "'", i2.equals(312765));

  }

  @Test
  public void test447() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test447"); }


    tp2.IP iP4 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP4.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan8 = new tp2.IPBan(iP4, (java.lang.Long)100L);
    tp2.IP iP9 = iPBan8.ip;
    tp2.IP iP14 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP14.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan18 = new tp2.IPBan(iP14, (java.lang.Long)100L);
    iPBan8.setIp(iP14);
    java.lang.Long long20 = iPBan8.getExpires();
    java.lang.Long long21 = iPBan8.expires;
    tp2.IP iP22 = iPBan8.ip;
    tp2.IP iP23 = iPBan8.ip;
    tp2.IP iP24 = iPBan8.getIp();
    java.lang.Integer i25 = iP24.getFourth();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long20 + "' != '" + 100L+ "'", long20.equals(100L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long21 + "' != '" + 100L+ "'", long21.equals(100L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i25 + "' != '" + 100+ "'", i25.equals(100));

  }

  @Test
  public void test448() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test448"); }


    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList0 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b1 = strictlySortedSinglyLinkedList0.repOK();
    tp2.IP iP6 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i7 = iP6.getSecond();
    iP6.setFirst((java.lang.Integer)11001000);
    iP6.setFirst((java.lang.Integer)(-2147483648));
    boolean b12 = strictlySortedSinglyLinkedList0.removeFromIP(iP6);
    tp2.IPBan iPBan13 = null;
    boolean b14 = strictlySortedSinglyLinkedList0.add(iPBan13);
    tp2.IPBan iPBan16 = strictlySortedSinglyLinkedList0.get(162);
    boolean b17 = strictlySortedSinglyLinkedList0.isEmpty();
    tp2.IP iP22 = new tp2.IP((java.lang.Integer)(-1734966848), (java.lang.Integer)1342177280, (java.lang.Integer)805465858, (java.lang.Integer)128628);
    // The following exception was thrown during execution in test generation
    try {
      boolean b23 = strictlySortedSinglyLinkedList0.removeFromIP(iP22);
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
    org.junit.Assert.assertTrue("'" + i7 + "' != '" + (-1)+ "'", i7.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iPBan16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);

  }

  @Test
  public void test449() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test449"); }


    int i1 = java.lang.Integer.lowestOneBit((-1866746267));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 1);

  }

  @Test
  public void test450() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test450"); }


    // The following exception was thrown during execution in test generation
    try {
      int i2 = java.lang.Integer.parseUnsignedInt("12", (-2120359936));
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test451() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test451"); }


    int i1 = java.lang.Integer.numberOfTrailingZeros(1521600);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 6);

  }

  @Test
  public void test452() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test452"); }


    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList0 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b1 = strictlySortedSinglyLinkedList0.repOK();
    tp2.IP iP6 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    boolean b7 = strictlySortedSinglyLinkedList0.containsIP(iP6);
    int i8 = strictlySortedSinglyLinkedList0.getSize();
    int i9 = strictlySortedSinglyLinkedList0.size;
    tp2.IP iP14 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i15 = iP14.getSecond();
    tp2.SinglyLinkedList singlyLinkedList16 = new tp2.SinglyLinkedList();
    boolean b17 = singlyLinkedList16.repOK();
    boolean b18 = iP14.equals((java.lang.Object)b17);
    boolean b19 = strictlySortedSinglyLinkedList0.removeFromIP(iP14);
    int i20 = strictlySortedSinglyLinkedList0.getSize();
    tp2.IP iP25 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP25.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan29 = new tp2.IPBan(iP25, (java.lang.Long)100L);
    tp2.IP iP30 = iPBan29.ip;
    tp2.IP iP35 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i36 = iP35.getFourth();
    java.lang.Integer i37 = iP35.getFourth();
    iP35.setThird((java.lang.Integer)200);
    iPBan29.ip = iP35;
    iP35.setFirst((java.lang.Integer)16777216);
    iP35.setThird((java.lang.Integer)(-2));
    iP35.setSecond((java.lang.Integer)96);
    boolean b47 = strictlySortedSinglyLinkedList0.removeFromIP(iP35);
    boolean b48 = strictlySortedSinglyLinkedList0.isEmpty();
    tp2.IPBan iPBan50 = strictlySortedSinglyLinkedList0.get(222298115);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i15 + "' != '" + (-1)+ "'", i15.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i36 + "' != '" + 100+ "'", i36.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i37 + "' != '" + 100+ "'", i37.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b47 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b48 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iPBan50);

  }

  @Test
  public void test453() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test453"); }


    // The following exception was thrown during execution in test generation
    try {
      int i2 = java.lang.Integer.parseUnsignedInt("2160753930", 286637532);
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test454() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test454"); }


    java.lang.String str1 = java.lang.Integer.toOctalString((-1158594560));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "27274240000"+ "'", str1.equals("27274240000"));

  }

  @Test
  public void test455() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test455"); }


    tp2.IP iP4 = new tp2.IP((java.lang.Integer)2013266104, (java.lang.Integer)(-536870909), (java.lang.Integer)15, (java.lang.Integer)8389120);
    iP4.setThird((java.lang.Integer)1694498843);
    java.lang.Integer i7 = iP4.getFourth();
    iP4.setThird((java.lang.Integer)1920);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i7 + "' != '" + 8389120+ "'", i7.equals(8389120));

  }

  @Test
  public void test456() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test456"); }


    tp2.SinglyLinkedList singlyLinkedList0 = new tp2.SinglyLinkedList();
    int i1 = singlyLinkedList0.getSize();
    int i2 = singlyLinkedList0.getSize();
    tp2.IP iP3 = null;
    boolean b4 = singlyLinkedList0.contains(iP3);
    tp2.IP iP6 = singlyLinkedList0.get(27);
    tp2.IP iP11 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i12 = iP11.getSecond();
    iP11.setFirst((java.lang.Integer)11001000);
    java.lang.Long long15 = null;
    tp2.IPBan iPBan16 = new tp2.IPBan(iP11, long15);
    tp2.IP iP17 = iPBan16.ip;
    tp2.IP iP18 = iPBan16.ip;
    java.lang.Integer i19 = iP18.getFourth();
    boolean b20 = singlyLinkedList0.remove(iP18);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList21 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b22 = strictlySortedSinglyLinkedList21.repOK();
    tp2.IP iP27 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i28 = iP27.getSecond();
    iP27.setFirst((java.lang.Integer)11001000);
    iP27.setFirst((java.lang.Integer)(-2147483648));
    boolean b33 = strictlySortedSinglyLinkedList21.removeFromIP(iP27);
    java.lang.Integer i34 = iP27.getSecond();
    boolean b35 = singlyLinkedList0.contains(iP27);
    tp2.SinglyLinkedList singlyLinkedList36 = new tp2.SinglyLinkedList();
    boolean b37 = singlyLinkedList36.repOK();
    tp2.IP iP39 = singlyLinkedList36.get(200);
    boolean b40 = singlyLinkedList36.isEmpty();
    boolean b41 = singlyLinkedList36.repOK();
    boolean b42 = singlyLinkedList36.repOK();
    tp2.IP iP47 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i48 = iP47.getThird();
    singlyLinkedList36.add(iP47);
    boolean b50 = singlyLinkedList36.isEmpty();
    boolean b51 = singlyLinkedList36.repOK();
    tp2.SinglyLinkedList singlyLinkedList52 = new tp2.SinglyLinkedList();
    int i53 = singlyLinkedList52.getSize();
    boolean b54 = singlyLinkedList52.isEmpty();
    tp2.IP iP59 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP59.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan63 = new tp2.IPBan(iP59, (java.lang.Long)100L);
    tp2.IP iP64 = iPBan63.ip;
    tp2.IP iP65 = iPBan63.getIp();
    tp2.IP iP70 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP70.setFirst((java.lang.Integer)200);
    iPBan63.ip = iP70;
    iP70.setFourth((java.lang.Integer)242);
    singlyLinkedList52.add(iP70);
    boolean b77 = singlyLinkedList36.contains(iP70);
    boolean b78 = singlyLinkedList0.contains(iP70);
    iP70.setFirst((java.lang.Integer)(-1461934336));
    java.lang.Integer i81 = iP70.getFourth();
    java.lang.Integer i82 = iP70.getThird();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i12 + "' != '" + (-1)+ "'", i12.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i19 + "' != '" + 100+ "'", i19.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i28 + "' != '" + (-1)+ "'", i28.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i34 + "' != '" + (-1)+ "'", i34.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i48 + "' != '" + (-1)+ "'", i48.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b50 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b51 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i53 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b54 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP64);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP65);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b77 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b78 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i81 + "' != '" + 242+ "'", i81.equals(242));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i82 + "' != '" + (-1)+ "'", i82.equals((-1)));

  }

  @Test
  public void test457() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test457"); }


    // The following exception was thrown during execution in test generation
    try {
      int i2 = java.lang.Integer.parseUnsignedInt("", 56721408);
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test458() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test458"); }


    int i1 = java.lang.Integer.bitCount(1157627904);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 3);

  }

  @Test
  public void test459() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test459"); }


    // The following exception was thrown during execution in test generation
    try {
      java.lang.Integer i2 = java.lang.Integer.valueOf("17017403362", 46032486);
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

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test460"); }


    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList0 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b1 = strictlySortedSinglyLinkedList0.isEmpty();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList2 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b3 = strictlySortedSinglyLinkedList2.repOK();
    tp2.IP iP8 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    boolean b9 = strictlySortedSinglyLinkedList2.containsIP(iP8);
    tp2.Node node10 = strictlySortedSinglyLinkedList2.header;
    strictlySortedSinglyLinkedList0.header = node10;
    tp2.SinglyLinkedList singlyLinkedList12 = new tp2.SinglyLinkedList();
    int i13 = singlyLinkedList12.getSize();
    tp2.IP iP18 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i19 = iP18.getSecond();
    java.lang.Integer i20 = iP18.getFourth();
    singlyLinkedList12.add(iP18);
    tp2.IPBan iPBan23 = new tp2.IPBan(iP18, (java.lang.Long)1L);
    tp2.SinglyLinkedList singlyLinkedList24 = new tp2.SinglyLinkedList();
    int i25 = singlyLinkedList24.getSize();
    tp2.IP iP30 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i31 = iP30.getSecond();
    java.lang.Integer i32 = iP30.getFourth();
    singlyLinkedList24.add(iP30);
    iP30.setFourth((java.lang.Integer)167772160);
    iP30.setSecond((java.lang.Integer)0);
    iPBan23.setIp(iP30);
    tp2.IP iP39 = iPBan23.ip;
    boolean b40 = strictlySortedSinglyLinkedList0.removeFromIP(iP39);
    tp2.IP iP45 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP45.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan49 = new tp2.IPBan(iP45, (java.lang.Long)100L);
    tp2.IP iP50 = iPBan49.ip;
    tp2.IP iP55 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP55.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan59 = new tp2.IPBan(iP55, (java.lang.Long)100L);
    iPBan49.setIp(iP55);
    java.lang.Long long61 = iPBan49.getExpires();
    java.lang.Long long62 = iPBan49.expires;
    boolean b63 = strictlySortedSinglyLinkedList0.contains(iPBan49);
    int i64 = strictlySortedSinglyLinkedList0.getSize();
    boolean b65 = strictlySortedSinglyLinkedList0.isEmpty();
    boolean b66 = strictlySortedSinglyLinkedList0.repOK();
    tp2.IP iP71 = new tp2.IP((java.lang.Integer)81, (java.lang.Integer)1700, (java.lang.Integer)28, (java.lang.Integer)52);
    iP71.setSecond((java.lang.Integer)922812416);
    iP71.setFourth((java.lang.Integer)(-536870175));
    boolean b76 = strictlySortedSinglyLinkedList0.containsIP(iP71);
    java.lang.Integer i77 = iP71.getThird();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i19 + "' != '" + (-1)+ "'", i19.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i20 + "' != '" + 100+ "'", i20.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i31 + "' != '" + (-1)+ "'", i31.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i32 + "' != '" + 100+ "'", i32.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long61 + "' != '" + 100L+ "'", long61.equals(100L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long62 + "' != '" + 100L+ "'", long62.equals(100L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b63 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i64 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b65 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b66 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b76 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i77 + "' != '" + 28+ "'", i77.equals(28));

  }

  @Test
  public void test461() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test461"); }


    int i2 = java.lang.Integer.sum(805344258, 5888);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 805350146);

  }

  @Test
  public void test462() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test462"); }


    int i1 = java.lang.Integer.bitCount(284738);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 6);

  }

  @Test
  public void test463() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test463"); }


    int i1 = java.lang.Integer.reverse(888457024);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 48443180);

  }

  @Test
  public void test464() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test464"); }


    java.lang.Integer i1 = new java.lang.Integer("16762403");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 16762403+ "'", i1.equals(16762403));

  }

  @Test
  public void test465() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test465"); }


    int i1 = java.lang.Integer.parseInt("254203300");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 254203300);

  }

  @Test
  public void test466() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test466"); }


    int i2 = java.lang.Integer.divideUnsigned(21484, 1530767552);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);

  }

  @Test
  public void test467() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test467"); }


    java.lang.String str1 = java.lang.Integer.toBinaryString(83886645);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "101000000000000001000110101"+ "'", str1.equals("101000000000000001000110101"));

  }

  @Test
  public void test468() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test468"); }


    int i2 = java.lang.Integer.sum(1879051264, 38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1879051302);

  }

  @Test
  public void test469() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test469"); }


    int i2 = java.lang.Integer.divideUnsigned((-649967296), 402653440);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 9);

  }

  @Test
  public void test470() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test470"); }


    int i2 = java.lang.Integer.compareUnsigned(0, 17856);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == (-1));

  }

  @Test
  public void test471() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test471"); }


    tp2.IP iP4 = new tp2.IP((java.lang.Integer)846526464, (java.lang.Integer)34, (java.lang.Integer)134217828, (java.lang.Integer)130028245);
    iP4.setFirst((java.lang.Integer)6574112);

  }

  @Test
  public void test472() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test472"); }


    java.lang.String str1 = java.lang.Integer.toBinaryString(20283569);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "1001101011000000010110001"+ "'", str1.equals("1001101011000000010110001"));

  }

  @Test
  public void test473() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test473"); }


    java.lang.String str2 = java.lang.Integer.toUnsignedString(3666646, 136913582);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "3666646"+ "'", str2.equals("3666646"));

  }

  @Test
  public void test474() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test474"); }


    java.lang.String str1 = java.lang.Integer.toBinaryString(533897138);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "11111110100101001111110110010"+ "'", str1.equals("11111110100101001111110110010"));

  }

  @Test
  public void test475() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test475"); }


    tp2.IP iP4 = new tp2.IP((java.lang.Integer)(-794967296), (java.lang.Integer)(-1665138688), (java.lang.Integer)47776, (java.lang.Integer)4194304);

  }

  @Test
  public void test476() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test476"); }


    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList0 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.SinglyLinkedList singlyLinkedList1 = new tp2.SinglyLinkedList();
    int i2 = singlyLinkedList1.getSize();
    tp2.IP iP7 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i8 = iP7.getSecond();
    java.lang.Integer i9 = iP7.getFourth();
    singlyLinkedList1.add(iP7);
    tp2.IP iP12 = singlyLinkedList1.get(5);
    boolean b13 = singlyLinkedList1.repOK();
    tp2.IP iP15 = singlyLinkedList1.get(2013265920);
    tp2.SinglyLinkedList singlyLinkedList16 = new tp2.SinglyLinkedList();
    int i17 = singlyLinkedList16.getSize();
    tp2.IP iP22 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i23 = iP22.getSecond();
    java.lang.Integer i24 = iP22.getFourth();
    singlyLinkedList16.add(iP22);
    iP22.setFourth((java.lang.Integer)167772160);
    singlyLinkedList1.add(iP22);
    java.lang.Object obj29 = null;
    boolean b30 = iP22.equals(obj29);
    iP22.setSecond((java.lang.Integer)20);
    tp2.IPBan iPBan34 = new tp2.IPBan(iP22, (java.lang.Long)20L);
    java.lang.Integer i35 = iP22.getFirst();
    boolean b36 = strictlySortedSinglyLinkedList0.removeFromIP(iP22);
    tp2.Node node37 = strictlySortedSinglyLinkedList0.header;
    tp2.IPBan iPBan39 = strictlySortedSinglyLinkedList0.get(163840);
    tp2.Node node40 = strictlySortedSinglyLinkedList0.header;
    int i41 = strictlySortedSinglyLinkedList0.getSize();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList42 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b43 = strictlySortedSinglyLinkedList42.repOK();
    strictlySortedSinglyLinkedList42.size = 1;
    strictlySortedSinglyLinkedList42.size = 0;
    tp2.IP iP52 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i53 = iP52.getSecond();
    java.lang.Integer i54 = iP52.getFourth();
    boolean b55 = strictlySortedSinglyLinkedList42.containsIP(iP52);
    tp2.Node node56 = strictlySortedSinglyLinkedList42.header;
    tp2.IP iP61 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i62 = iP61.getSecond();
    iP61.setFirst((java.lang.Integer)11001000);
    java.lang.Long long65 = null;
    tp2.IPBan iPBan66 = new tp2.IPBan(iP61, long65);
    boolean b67 = strictlySortedSinglyLinkedList42.containsIP(iP61);
    boolean b68 = strictlySortedSinglyLinkedList0.removeFromIP(iP61);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i8 + "' != '" + (-1)+ "'", i8.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 100+ "'", i9.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i23 + "' != '" + (-1)+ "'", i23.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i24 + "' != '" + 100+ "'", i24.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i35 + "' != '" + (-1)+ "'", i35.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iPBan39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i41 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b43 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i53 + "' != '" + (-1)+ "'", i53.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i54 + "' != '" + 100+ "'", i54.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b55 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i62 + "' != '" + (-1)+ "'", i62.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b67 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b68 == false);

  }

  @Test
  public void test477() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test477"); }


    java.lang.Integer i2 = java.lang.Integer.getInteger("a58e", (java.lang.Integer)42382);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i2 + "' != '" + 42382+ "'", i2.equals(42382));

  }

  @Test
  public void test478() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test478"); }


    java.lang.Integer i1 = new java.lang.Integer(920903680);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 920903680+ "'", i1.equals(920903680));

  }

  @Test
  public void test479() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test479"); }


    int i2 = java.lang.Integer.remainderUnsigned(6, (-2147483648));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 6);

  }

  @Test
  public void test480() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test480"); }


    java.lang.Integer i1 = java.lang.Integer.valueOf(66144);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 66144+ "'", i1.equals(66144));

  }

  @Test
  public void test481() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test481"); }


    java.lang.Integer i1 = java.lang.Integer.getInteger("44fc0000");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);

  }

  @Test
  public void test482() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test482"); }


    int i1 = java.lang.Integer.numberOfLeadingZeros((-1516277088));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);

  }

  @Test
  public void test483() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test483"); }


    java.lang.String str2 = java.lang.Integer.toUnsignedString((-1860047008), 18970624);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "2434920288"+ "'", str2.equals("2434920288"));

  }

  @Test
  public void test484() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test484"); }


    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList0 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b1 = strictlySortedSinglyLinkedList0.repOK();
    strictlySortedSinglyLinkedList0.size = 1;
    strictlySortedSinglyLinkedList0.size = 0;
    boolean b6 = strictlySortedSinglyLinkedList0.repOK();
    int i7 = strictlySortedSinglyLinkedList0.getSize();
    tp2.Node node8 = strictlySortedSinglyLinkedList0.header;
    int i9 = strictlySortedSinglyLinkedList0.getSize();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);

  }

  @Test
  public void test485() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test485"); }


    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList0 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IPBan iPBan1 = null;
    boolean b2 = strictlySortedSinglyLinkedList0.add(iPBan1);
    int i3 = strictlySortedSinglyLinkedList0.getSize();
    tp2.Node node4 = strictlySortedSinglyLinkedList0.header;
    strictlySortedSinglyLinkedList0.size = (-2147483648);
    boolean b7 = strictlySortedSinglyLinkedList0.repOK();
    tp2.Node node8 = strictlySortedSinglyLinkedList0.header;
    tp2.IPBan iPBan10 = strictlySortedSinglyLinkedList0.get((-1619877886));
    boolean b11 = strictlySortedSinglyLinkedList0.repOK();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iPBan10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);

  }

  @Test
  public void test486() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test486"); }


    int i2 = java.lang.Integer.rotateLeft(2772752, 2088763737);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 536892574);

  }

  @Test
  public void test487() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test487"); }


    // The following exception was thrown during execution in test generation
    try {
      int i2 = java.lang.Integer.parseUnsignedInt("", 96);
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

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test488"); }


    int i2 = java.lang.Integer.rotateRight((-1937979573), 5000);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1267498183);

  }

  @Test
  public void test489() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test489"); }


    int i2 = java.lang.Integer.sum(3054, 506012);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 509066);

  }

  @Test
  public void test490() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test490"); }


    int i2 = java.lang.Integer.min(1392382846, 3276800);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 3276800);

  }

  @Test
  public void test491() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test491"); }


    int i1 = java.lang.Integer.numberOfTrailingZeros((-936770652));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 2);

  }

  @Test
  public void test492() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test492"); }


    java.lang.Integer i1 = java.lang.Integer.getInteger("4010");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);

  }

  @Test
  public void test493() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test493"); }


    java.lang.Integer i2 = java.lang.Integer.getInteger("9dd6da6", (java.lang.Integer)(-699399716));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i2 + "' != '" + (-699399716)+ "'", i2.equals((-699399716)));

  }

  @Test
  public void test494() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test494"); }


    int i2 = java.lang.Integer.sum(131116, 786432);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 917548);

  }

  @Test
  public void test495() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test495"); }


    int i2 = java.lang.Integer.remainderUnsigned((-28148205), 1325666655);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 289819126);

  }

  @Test
  public void test496() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test496"); }


    // The following exception was thrown during execution in test generation
    try {
      int i2 = java.lang.Integer.parseInt("1cb8af9", 90133041);
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test497() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test497"); }


    int i2 = java.lang.Integer.compare(56000, 150995005);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == (-1));

  }

  @Test
  public void test498() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test498"); }


    java.lang.String str2 = java.lang.Integer.toUnsignedString(303104, 352838938);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "303104"+ "'", str2.equals("303104"));

  }

  @Test
  public void test499() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test499"); }


    java.lang.Integer i1 = java.lang.Integer.valueOf("1734601");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 1734601+ "'", i1.equals(1734601));

  }

  @Test
  public void test500() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test500"); }


    // The following exception was thrown during execution in test generation
    try {
      int i1 = java.lang.Integer.parseUnsignedInt("100000000000101100");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

}
