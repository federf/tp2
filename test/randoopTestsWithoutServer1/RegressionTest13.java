package randoopTestsWithoutServer1;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest13 {

  public static boolean debug = false;

  @Test
  public void test001() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test001"); }


    java.lang.Integer i1 = java.lang.Integer.valueOf((-1158594560));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + (-1158594560)+ "'", i1.equals((-1158594560)));

  }

  @Test
  public void test002() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test002"); }


    int i1 = java.lang.Integer.highestOneBit(93754428);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 67108864);

  }

  @Test
  public void test003() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test003"); }


    int i1 = java.lang.Integer.reverseBytes((-232748421));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 2072649970);

  }

  @Test
  public void test004() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test004"); }


    int i1 = java.lang.Integer.numberOfLeadingZeros(31130880);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 7);

  }

  @Test
  public void test005() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test005"); }


    long long1 = java.lang.Integer.toUnsignedLong(2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == 2L);

  }

  @Test
  public void test006() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test006"); }


    int i1 = java.lang.Integer.reverseBytes(121600);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 14352640);

  }

  @Test
  public void test007() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test007"); }


    int i1 = java.lang.Integer.lowestOneBit((-2120392660));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 4);

  }

  @Test
  public void test008() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test008"); }


    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList0 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b1 = strictlySortedSinglyLinkedList0.repOK();
    boolean b2 = strictlySortedSinglyLinkedList0.repOK();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList3 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b4 = strictlySortedSinglyLinkedList3.repOK();
    tp2.IP iP9 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    boolean b10 = strictlySortedSinglyLinkedList3.containsIP(iP9);
    tp2.Node node11 = strictlySortedSinglyLinkedList3.header;
    strictlySortedSinglyLinkedList0.header = node11;
    strictlySortedSinglyLinkedList0.size = 0;
    tp2.IP iP19 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP19.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan23 = new tp2.IPBan(iP19, (java.lang.Long)100L);
    tp2.IP iP24 = iPBan23.ip;
    tp2.IP iP29 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i30 = iP29.getFourth();
    java.lang.Integer i31 = iP29.getFourth();
    iP29.setThird((java.lang.Integer)200);
    iPBan23.ip = iP29;
    iP29.setFirst((java.lang.Integer)16777216);
    iP29.setThird((java.lang.Integer)(-2));
    java.lang.Integer i39 = iP29.getFourth();
    java.lang.Integer i40 = iP29.getFourth();
    boolean b41 = strictlySortedSinglyLinkedList0.containsIP(iP29);
    tp2.IP iP42 = null;
    boolean b43 = strictlySortedSinglyLinkedList0.removeFromIP(iP42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i30 + "' != '" + 100+ "'", i30.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i31 + "' != '" + 100+ "'", i31.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i39 + "' != '" + 100+ "'", i39.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i40 + "' != '" + 100+ "'", i40.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b43 == false);

  }

  @Test
  public void test009() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test009"); }


    int i1 = java.lang.Integer.parseUnsignedInt("2013265928");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 2013265928);

  }

  @Test
  public void test010() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test010"); }


    // The following exception was thrown during execution in test generation
    try {
      int i2 = java.lang.Integer.parseInt("34fe0", (-1570502528));
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

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test011"); }


    int i1 = java.lang.Integer.numberOfTrailingZeros(5591);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);

  }

  @Test
  public void test012() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test012"); }


    int i1 = java.lang.Integer.parseUnsignedInt("506241");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 506241);

  }

  @Test
  public void test013() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test013"); }


    java.lang.String str1 = java.lang.Integer.toHexString((-1063633290));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "c09a3e76"+ "'", str1.equals("c09a3e76"));

  }

  @Test
  public void test014() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test014"); }


    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList0 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b1 = strictlySortedSinglyLinkedList0.repOK();
    tp2.IP iP6 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i7 = iP6.getSecond();
    iP6.setFirst((java.lang.Integer)11001000);
    iP6.setFirst((java.lang.Integer)(-2147483648));
    boolean b12 = strictlySortedSinglyLinkedList0.removeFromIP(iP6);
    tp2.IPBan iPBan14 = new tp2.IPBan(iP6, (java.lang.Long)0L);
    tp2.IP iP15 = iPBan14.getIp();
    java.lang.Long long16 = iPBan14.getExpires();
    java.lang.Long long17 = iPBan14.expires;
    tp2.IP iP18 = iPBan14.ip;
    java.lang.Long long19 = iPBan14.getExpires();
    tp2.SinglyLinkedList singlyLinkedList20 = new tp2.SinglyLinkedList();
    boolean b21 = singlyLinkedList20.repOK();
    tp2.IP iP23 = singlyLinkedList20.get(200);
    boolean b24 = singlyLinkedList20.isEmpty();
    boolean b25 = singlyLinkedList20.repOK();
    boolean b26 = singlyLinkedList20.repOK();
    tp2.IP iP31 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i32 = iP31.getThird();
    singlyLinkedList20.add(iP31);
    boolean b34 = singlyLinkedList20.isEmpty();
    boolean b35 = singlyLinkedList20.repOK();
    tp2.SinglyLinkedList singlyLinkedList36 = new tp2.SinglyLinkedList();
    int i37 = singlyLinkedList36.getSize();
    boolean b38 = singlyLinkedList36.isEmpty();
    tp2.IP iP43 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP43.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan47 = new tp2.IPBan(iP43, (java.lang.Long)100L);
    tp2.IP iP48 = iPBan47.ip;
    tp2.IP iP49 = iPBan47.getIp();
    tp2.IP iP54 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP54.setFirst((java.lang.Integer)200);
    iPBan47.ip = iP54;
    iP54.setFourth((java.lang.Integer)242);
    singlyLinkedList36.add(iP54);
    boolean b61 = singlyLinkedList20.contains(iP54);
    iPBan14.setIp(iP54);
    java.lang.Long long63 = iPBan14.expires;
    iPBan14.setExpires((java.lang.Long)3483521283L);
    tp2.IP iP70 = new tp2.IP((java.lang.Integer)67108864, (java.lang.Integer)(-2147483648), (java.lang.Integer)356246784, (java.lang.Integer)176016000);
    java.lang.Integer i71 = iP70.getFourth();
    iP70.setFourth((java.lang.Integer)920903680);
    iPBan14.setIp(iP70);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i7 + "' != '" + (-1)+ "'", i7.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L+ "'", long16.equals(0L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L+ "'", long17.equals(0L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L+ "'", long19.equals(0L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i32 + "' != '" + (-1)+ "'", i32.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i37 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b61 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long63 + "' != '" + 0L+ "'", long63.equals(0L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i71 + "' != '" + 176016000+ "'", i71.equals(176016000));

  }

  @Test
  public void test015() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test015"); }


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
    strictlySortedSinglyLinkedList0.size = 6;
    tp2.Node node52 = strictlySortedSinglyLinkedList0.header;
    tp2.IP iP57 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP57.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan61 = new tp2.IPBan(iP57, (java.lang.Long)100L);
    tp2.IP iP66 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP66.setFirst((java.lang.Integer)200);
    java.lang.Integer i69 = iP66.getFourth();
    iPBan61.setIp(iP66);
    java.lang.Long long71 = iPBan61.expires;
    tp2.IP iP76 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i77 = iP76.getSecond();
    iP76.setFirst((java.lang.Integer)11001000);
    iP76.setFirst((java.lang.Integer)32);
    iPBan61.setIp(iP76);
    iPBan61.expires = 100L;
    tp2.IP iP85 = iPBan61.getIp();
    boolean b86 = strictlySortedSinglyLinkedList0.removeFromIP(iP85);
    
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
    org.junit.Assert.assertNotNull(node52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i69 + "' != '" + 100+ "'", i69.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long71 + "' != '" + 100L+ "'", long71.equals(100L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i77 + "' != '" + (-1)+ "'", i77.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP85);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b86 == true);

  }

  @Test
  public void test016() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test016"); }


    // The following exception was thrown during execution in test generation
    try {
      java.lang.Integer i2 = java.lang.Integer.valueOf("", 1216413696);
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

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test017"); }


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
    int i42 = strictlySortedSinglyLinkedList0.getSize();
    int i43 = strictlySortedSinglyLinkedList0.size;
    
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
    org.junit.Assert.assertTrue(i42 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i43 == 1);

  }

  @Test
  public void test018() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test018"); }


    int i2 = java.lang.Integer.remainderUnsigned(162, 8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 2);

  }

  @Test
  public void test019() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test019"); }


    int i2 = java.lang.Integer.compare(25, 224);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == (-1));

  }

  @Test
  public void test020() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test020"); }


    // The following exception was thrown during execution in test generation
    try {
      int i1 = java.lang.Integer.parseUnsignedInt("10000110111111111111111111111111");
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

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test021"); }


    int i2 = java.lang.Integer.divideUnsigned(7, 1010);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);

  }

  @Test
  public void test022() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test022"); }


    int i2 = java.lang.Integer.remainderUnsigned(19531250, 1419649186);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 19531250);

  }

  @Test
  public void test023() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test023"); }


    java.lang.Integer i1 = java.lang.Integer.decode("1300000000");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 1300000000+ "'", i1.equals(1300000000));

  }

  @Test
  public void test024() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test024"); }


    java.lang.Integer i1 = java.lang.Integer.valueOf(115686912);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 115686912+ "'", i1.equals(115686912));

  }

  @Test
  public void test025() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test025"); }


    java.lang.String str1 = java.lang.Integer.toUnsignedString(133);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "133"+ "'", str1.equals("133"));

  }

  @Test
  public void test026() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test026"); }


    tp2.IP iP4 = new tp2.IP((java.lang.Integer)6391283, (java.lang.Integer)211631616, (java.lang.Integer)513015808, (java.lang.Integer)310);
    java.lang.Integer i5 = iP4.getFourth();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i5 + "' != '" + 310+ "'", i5.equals(310));

  }

  @Test
  public void test027() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test027"); }


    int i2 = java.lang.Integer.rotateRight(0, 13416038);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);

  }

  @Test
  public void test028() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test028"); }


    java.lang.String str1 = java.lang.Integer.toUnsignedString(640);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "640"+ "'", str1.equals("640"));

  }

  @Test
  public void test029() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test029"); }


    // The following exception was thrown during execution in test generation
    try {
      java.lang.Integer i2 = java.lang.Integer.valueOf("2088174752", 872431616);
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

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test030"); }


    int i2 = java.lang.Integer.compare(452984832, 372963);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);

  }

  @Test
  public void test031() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test031"); }


    int i1 = java.lang.Integer.signum(1610612738);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 1);

  }

  @Test
  public void test032() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test032"); }


    int i2 = java.lang.Integer.compareUnsigned(840957952, 77359400);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);

  }

  @Test
  public void test033() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test033"); }


    int i1 = java.lang.Integer.reverse(513015808);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 10616);

  }

  @Test
  public void test034() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test034"); }


    int i1 = java.lang.Integer.bitCount(286637532);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 16);

  }

  @Test
  public void test035() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test035"); }


    java.lang.String str2 = java.lang.Integer.toUnsignedString(0, 117440667);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "0"+ "'", str2.equals("0"));

  }

  @Test
  public void test036() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test036"); }


    java.lang.Integer i2 = java.lang.Integer.getInteger("311", 4000);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i2 + "' != '" + 4000+ "'", i2.equals(4000));

  }

  @Test
  public void test037() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test037"); }


    java.lang.Integer i2 = java.lang.Integer.getInteger("3758096385", (java.lang.Integer)48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i2 + "' != '" + 48+ "'", i2.equals(48));

  }

  @Test
  public void test038() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test038"); }


    java.lang.Integer i2 = java.lang.Integer.getInteger("11100000", (java.lang.Integer)785);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i2 + "' != '" + 785+ "'", i2.equals(785));

  }

  @Test
  public void test039() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test039"); }


    int i2 = java.lang.Integer.sum((-699399716), (-2030043137));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1565524443);

  }

  @Test
  public void test040() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test040"); }


    int i1 = java.lang.Integer.bitCount(2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 1);

  }

  @Test
  public void test041() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test041"); }


    tp2.IP iP4 = new tp2.IP((java.lang.Integer)65354496, (java.lang.Integer)1100101, (java.lang.Integer)21, (java.lang.Integer)10175748);

  }

  @Test
  public void test042() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test042"); }


    java.lang.Integer i2 = java.lang.Integer.getInteger("80290000", (-2064248320));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i2 + "' != '" + (-2064248320)+ "'", i2.equals((-2064248320)));

  }

  @Test
  public void test043() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test043"); }


    java.lang.String str1 = java.lang.Integer.toUnsignedString(2939328);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "2939328"+ "'", str1.equals("2939328"));

  }

  @Test
  public void test044() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test044"); }


    int i2 = java.lang.Integer.min(630625361, (-1241513727));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == (-1241513727));

  }

  @Test
  public void test045() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test045"); }


    int i2 = java.lang.Integer.min(16777440, 28360704);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 16777440);

  }

  @Test
  public void test046() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test046"); }


    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList0 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b1 = strictlySortedSinglyLinkedList0.repOK();
    strictlySortedSinglyLinkedList0.size = 1;
    strictlySortedSinglyLinkedList0.size = 0;
    boolean b6 = strictlySortedSinglyLinkedList0.repOK();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList7 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b8 = strictlySortedSinglyLinkedList7.repOK();
    tp2.IP iP13 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i14 = iP13.getSecond();
    iP13.setFirst((java.lang.Integer)11001000);
    iP13.setFirst((java.lang.Integer)(-2147483648));
    boolean b19 = strictlySortedSinglyLinkedList7.removeFromIP(iP13);
    tp2.IPBan iPBan20 = null;
    boolean b21 = strictlySortedSinglyLinkedList7.add(iPBan20);
    tp2.Node node22 = strictlySortedSinglyLinkedList7.header;
    strictlySortedSinglyLinkedList0.header = node22;
    tp2.Node node24 = strictlySortedSinglyLinkedList0.header;
    tp2.IPBan iPBan25 = null;
    // The following exception was thrown during execution in test generation
    try {
      boolean b26 = strictlySortedSinglyLinkedList0.contains(iPBan25);
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
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i14 + "' != '" + (-1)+ "'", i14.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node24);

  }

  @Test
  public void test047() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test047"); }


    // The following exception was thrown during execution in test generation
    try {
      int i2 = java.lang.Integer.parseInt("200064", 10000);
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

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test048"); }


    int i2 = java.lang.Integer.compareUnsigned(340, 630625361);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == (-1));

  }

  @Test
  public void test049() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test049"); }


    int i2 = java.lang.Integer.compare(1908126, 1677721600);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == (-1));

  }

  @Test
  public void test050() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test050"); }


    java.lang.Integer i1 = new java.lang.Integer(117596762);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 117596762+ "'", i1.equals(117596762));

  }

  @Test
  public void test051() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test051"); }


    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList0 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b1 = strictlySortedSinglyLinkedList0.repOK();
    strictlySortedSinglyLinkedList0.size = 1;
    tp2.IPBan iPBan5 = strictlySortedSinglyLinkedList0.get(4);
    int i6 = strictlySortedSinglyLinkedList0.size;
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList7 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IPBan iPBan8 = null;
    boolean b9 = strictlySortedSinglyLinkedList7.add(iPBan8);
    int i10 = strictlySortedSinglyLinkedList7.getSize();
    tp2.Node node11 = strictlySortedSinglyLinkedList7.header;
    int i12 = strictlySortedSinglyLinkedList7.getSize();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList13 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b14 = strictlySortedSinglyLinkedList13.repOK();
    tp2.IP iP19 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    boolean b20 = strictlySortedSinglyLinkedList13.containsIP(iP19);
    int i21 = strictlySortedSinglyLinkedList13.getSize();
    tp2.SinglyLinkedList singlyLinkedList22 = new tp2.SinglyLinkedList();
    int i23 = singlyLinkedList22.getSize();
    tp2.IP iP28 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i29 = iP28.getSecond();
    java.lang.Integer i30 = iP28.getFourth();
    singlyLinkedList22.add(iP28);
    tp2.IPBan iPBan33 = new tp2.IPBan(iP28, (java.lang.Long)100L);
    iPBan33.expires = 10L;
    tp2.IP iP36 = iPBan33.getIp();
    iPBan33.expires = 0L;
    java.lang.Long long39 = iPBan33.expires;
    boolean b40 = strictlySortedSinglyLinkedList13.add(iPBan33);
    int i41 = strictlySortedSinglyLinkedList13.getSize();
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
    strictlySortedSinglyLinkedList13.header = node58;
    strictlySortedSinglyLinkedList7.header = node58;
    int i61 = strictlySortedSinglyLinkedList7.getSize();
    tp2.Node node62 = strictlySortedSinglyLinkedList7.header;
    strictlySortedSinglyLinkedList0.header = node62;
    tp2.IP iP64 = null;
    // The following exception was thrown during execution in test generation
    try {
      boolean b65 = strictlySortedSinglyLinkedList0.containsIP(iP64);
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
    org.junit.Assert.assertNull(iPBan5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i29 + "' != '" + (-1)+ "'", i29.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i30 + "' != '" + 100+ "'", i30.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long39 + "' != '" + 0L+ "'", long39.equals(0L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i41 == 1);
    
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
    org.junit.Assert.assertTrue(i61 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node62);

  }

  @Test
  public void test052() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test052"); }


    java.lang.Integer i2 = java.lang.Integer.getInteger("247671240", (java.lang.Integer)(-1808013914));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i2 + "' != '" + (-1808013914)+ "'", i2.equals((-1808013914)));

  }

  @Test
  public void test053() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test053"); }


    int i1 = java.lang.Integer.lowestOneBit(1797783790);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 2);

  }

  @Test
  public void test054() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test054"); }


    int i2 = java.lang.Integer.max(56659264, (-2144796672));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 56659264);

  }

  @Test
  public void test055() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test055"); }


    java.lang.Integer i1 = new java.lang.Integer(32547700);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 32547700+ "'", i1.equals(32547700));

  }

  @Test
  public void test056() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test056"); }


    int i2 = java.lang.Integer.compareUnsigned(513015808, 112001);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);

  }

  @Test
  public void test057() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test057"); }


    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList0 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b1 = strictlySortedSinglyLinkedList0.repOK();
    strictlySortedSinglyLinkedList0.size = 1;
    strictlySortedSinglyLinkedList0.size = 0;
    tp2.IPBan iPBan6 = null;
    boolean b7 = strictlySortedSinglyLinkedList0.add(iPBan6);
    int i8 = strictlySortedSinglyLinkedList0.getSize();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList9 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b10 = strictlySortedSinglyLinkedList9.repOK();
    tp2.IP iP15 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    boolean b16 = strictlySortedSinglyLinkedList9.containsIP(iP15);
    tp2.Node node17 = strictlySortedSinglyLinkedList9.header;
    boolean b18 = strictlySortedSinglyLinkedList9.isEmpty();
    int i19 = strictlySortedSinglyLinkedList9.getSize();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList20 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b21 = strictlySortedSinglyLinkedList20.repOK();
    tp2.IP iP26 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i27 = iP26.getSecond();
    iP26.setFirst((java.lang.Integer)11001000);
    iP26.setFirst((java.lang.Integer)(-2147483648));
    boolean b32 = strictlySortedSinglyLinkedList20.removeFromIP(iP26);
    tp2.Node node33 = strictlySortedSinglyLinkedList20.header;
    strictlySortedSinglyLinkedList9.header = node33;
    strictlySortedSinglyLinkedList0.header = node33;
    tp2.IP iP40 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP40.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan44 = new tp2.IPBan(iP40, (java.lang.Long)100L);
    tp2.IP iP45 = iPBan44.ip;
    tp2.IP iP50 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP50.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan54 = new tp2.IPBan(iP50, (java.lang.Long)100L);
    iPBan44.setIp(iP50);
    iP50.setSecond((java.lang.Integer)(-1));
    java.lang.Integer i58 = iP50.getThird();
    java.lang.Integer i59 = iP50.getThird();
    boolean b60 = strictlySortedSinglyLinkedList0.removeFromIP(iP50);
    boolean b61 = strictlySortedSinglyLinkedList0.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i27 + "' != '" + (-1)+ "'", i27.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i58 + "' != '" + (-1)+ "'", i58.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i59 + "' != '" + (-1)+ "'", i59.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b60 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b61 == true);

  }

  @Test
  public void test058() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test058"); }


    long long1 = java.lang.Integer.toUnsignedLong((-257396566));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == 4037570730L);

  }

  @Test
  public void test059() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test059"); }


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
    iPBan78.setExpires((java.lang.Long)(-1L));
    java.lang.Long long84 = null;
    iPBan78.expires = long84;
    // The following exception was thrown during execution in test generation
    try {
      boolean b86 = strictlySortedSinglyLinkedList0.contains(iPBan78);
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

  }

  @Test
  public void test060() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test060"); }


    // The following exception was thrown during execution in test generation
    try {
      java.lang.Integer i2 = java.lang.Integer.valueOf("8a", 0);
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

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test061"); }


    int i1 = java.lang.Integer.reverseBytes(358400000);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 12606485);

  }

  @Test
  public void test062() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test062"); }


    int i1 = java.lang.Integer.reverseBytes((-1073741606));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == (-637534016));

  }

  @Test
  public void test063() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test063"); }


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
    tp2.IP iP20 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP20.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan24 = new tp2.IPBan(iP20, (java.lang.Long)100L);
    tp2.IP iP29 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i30 = iP29.getSecond();
    java.lang.Integer i31 = iP29.getFourth();
    iP29.setFirst((java.lang.Integer)5);
    iPBan24.ip = iP29;
    java.lang.Long long35 = iPBan24.getExpires();
    iPBan24.setExpires((java.lang.Long)(-1L));
    iPBan24.expires = 100L;
    tp2.IP iP44 = new tp2.IP((java.lang.Integer)242, (java.lang.Integer)242, (java.lang.Integer)30, (java.lang.Integer)(-1));
    iP44.setSecond((java.lang.Integer)33554432);
    iPBan24.setIp(iP44);
    tp2.IP iP48 = iPBan24.ip;
    iP48.setFourth((java.lang.Integer)242);
    boolean b51 = strictlySortedSinglyLinkedList0.containsIP(iP48);
    tp2.IPBan iPBan53 = strictlySortedSinglyLinkedList0.get(222117376);
    
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
    org.junit.Assert.assertTrue("'" + i30 + "' != '" + (-1)+ "'", i30.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i31 + "' != '" + 100+ "'", i31.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long35 + "' != '" + 100L+ "'", long35.equals(100L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b51 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iPBan53);

  }

  @Test
  public void test064() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test064"); }


    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList0 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b1 = strictlySortedSinglyLinkedList0.repOK();
    boolean b2 = strictlySortedSinglyLinkedList0.repOK();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList3 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b4 = strictlySortedSinglyLinkedList3.repOK();
    tp2.IP iP9 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    boolean b10 = strictlySortedSinglyLinkedList3.containsIP(iP9);
    tp2.Node node11 = strictlySortedSinglyLinkedList3.header;
    strictlySortedSinglyLinkedList0.header = node11;
    strictlySortedSinglyLinkedList0.size = 0;
    tp2.IPBan iPBan16 = strictlySortedSinglyLinkedList0.get(0);
    strictlySortedSinglyLinkedList0.size = (-1062740992);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList19 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b20 = strictlySortedSinglyLinkedList19.repOK();
    strictlySortedSinglyLinkedList19.size = 1;
    strictlySortedSinglyLinkedList19.size = 0;
    tp2.IP iP29 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP29.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan33 = new tp2.IPBan(iP29, (java.lang.Long)100L);
    tp2.IP iP34 = iPBan33.ip;
    boolean b35 = strictlySortedSinglyLinkedList19.contains(iPBan33);
    tp2.IP iP40 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i41 = iP40.getSecond();
    iP40.setFirst((java.lang.Integer)11001000);
    java.lang.Long long44 = null;
    tp2.IPBan iPBan45 = new tp2.IPBan(iP40, long44);
    java.lang.Long long46 = iPBan45.getExpires();
    boolean b47 = strictlySortedSinglyLinkedList19.contains(iPBan45);
    tp2.IP iP48 = iPBan45.getIp();
    boolean b49 = strictlySortedSinglyLinkedList0.add(iPBan45);
    strictlySortedSinglyLinkedList0.size = 436207616;
    tp2.IP iP56 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP56.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan60 = new tp2.IPBan(iP56, (java.lang.Long)100L);
    tp2.IP iP65 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i66 = iP65.getSecond();
    java.lang.Integer i67 = iP65.getFourth();
    iP65.setFirst((java.lang.Integer)5);
    iPBan60.ip = iP65;
    java.lang.Long long71 = iPBan60.getExpires();
    iPBan60.expires = 2147483648L;
    tp2.IP iP74 = iPBan60.getIp();
    // The following exception was thrown during execution in test generation
    try {
      boolean b75 = strictlySortedSinglyLinkedList0.add(iPBan60);
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
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iPBan16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i41 + "' != '" + (-1)+ "'", i41.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(long46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b47 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b49 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i66 + "' != '" + (-1)+ "'", i66.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i67 + "' != '" + 100+ "'", i67.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long71 + "' != '" + 100L+ "'", long71.equals(100L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP74);

  }

  @Test
  public void test065() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test065"); }


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
    tp2.IP iP22 = singlyLinkedList0.get(0);
    tp2.IP iP27 = new tp2.IP((java.lang.Integer)15204352, (java.lang.Integer)1, (java.lang.Integer)15204352, (java.lang.Integer)356246787);
    tp2.SinglyLinkedList singlyLinkedList28 = new tp2.SinglyLinkedList();
    int i29 = singlyLinkedList28.getSize();
    int i30 = singlyLinkedList28.getSize();
    boolean b31 = iP27.equals((java.lang.Object)singlyLinkedList28);
    boolean b32 = singlyLinkedList0.remove(iP27);
    iP27.setFourth((java.lang.Integer)(-671088640));
    tp2.IPBan iPBan36 = new tp2.IPBan(iP27, (java.lang.Long)1L);
    tp2.IP iP37 = iPBan36.getIp();
    tp2.IP iP42 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP42.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan46 = new tp2.IPBan(iP42, (java.lang.Long)100L);
    tp2.IP iP51 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP51.setFirst((java.lang.Integer)200);
    java.lang.Integer i54 = iP51.getFourth();
    iPBan46.setIp(iP51);
    java.lang.Long long56 = iPBan46.expires;
    iPBan46.expires = (-1L);
    iPBan46.setExpires((java.lang.Long)100L);
    iPBan46.expires = 10L;
    tp2.IP iP63 = iPBan46.getIp();
    iPBan46.expires = 1L;
    java.lang.Long long66 = iPBan46.expires;
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList67 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b68 = strictlySortedSinglyLinkedList67.repOK();
    tp2.IP iP73 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    boolean b74 = strictlySortedSinglyLinkedList67.containsIP(iP73);
    tp2.Node node75 = strictlySortedSinglyLinkedList67.header;
    boolean b76 = strictlySortedSinglyLinkedList67.isEmpty();
    int i77 = strictlySortedSinglyLinkedList67.getSize();
    int i78 = strictlySortedSinglyLinkedList67.size;
    boolean b79 = strictlySortedSinglyLinkedList67.isEmpty();
    tp2.IP iP84 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i85 = iP84.getSecond();
    java.lang.Integer i86 = iP84.getFourth();
    iP84.setFirst((java.lang.Integer)5);
    tp2.IPBan iPBan90 = new tp2.IPBan(iP84, (java.lang.Long)0L);
    iPBan90.expires = 167772160L;
    boolean b93 = strictlySortedSinglyLinkedList67.add(iPBan90);
    tp2.IP iP94 = iPBan90.getIp();
    iPBan46.setIp(iP94);
    iPBan36.ip = iP94;
    iPBan36.setExpires((java.lang.Long)12L);
    
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
    org.junit.Assert.assertNull(iP22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i29 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i54 + "' != '" + 100+ "'", i54.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long56 + "' != '" + 100L+ "'", long56.equals(100L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP63);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long66 + "' != '" + 1L+ "'", long66.equals(1L));
    
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
    org.junit.Assert.assertTrue(i78 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b79 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i85 + "' != '" + (-1)+ "'", i85.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i86 + "' != '" + 100+ "'", i86.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b93 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP94);

  }

  @Test
  public void test066() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test066"); }


    tp2.IP iP4 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP4.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan8 = new tp2.IPBan(iP4, (java.lang.Long)100L);
    tp2.IP iP9 = iPBan8.ip;
    tp2.IP iP10 = iPBan8.ip;
    tp2.IP iP11 = iPBan8.getIp();
    iP11.setFourth((java.lang.Integer)51756250);
    tp2.IP iP18 = new tp2.IP((java.lang.Integer)15204352, (java.lang.Integer)1, (java.lang.Integer)15204352, (java.lang.Integer)356246787);
    tp2.SinglyLinkedList singlyLinkedList19 = new tp2.SinglyLinkedList();
    int i20 = singlyLinkedList19.getSize();
    int i21 = singlyLinkedList19.getSize();
    boolean b22 = iP18.equals((java.lang.Object)singlyLinkedList19);
    int i23 = singlyLinkedList19.getSize();
    boolean b24 = iP11.equals((java.lang.Object)singlyLinkedList19);
    boolean b25 = singlyLinkedList19.isEmpty();
    boolean b26 = singlyLinkedList19.isEmpty();
    tp2.IP iP31 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP31.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan35 = new tp2.IPBan(iP31, (java.lang.Long)100L);
    tp2.IP iP36 = iPBan35.ip;
    tp2.IP iP37 = iPBan35.ip;
    tp2.IP iP38 = iPBan35.getIp();
    iP38.setFourth((java.lang.Integer)51756250);
    tp2.IP iP45 = new tp2.IP((java.lang.Integer)15204352, (java.lang.Integer)1, (java.lang.Integer)15204352, (java.lang.Integer)356246787);
    tp2.SinglyLinkedList singlyLinkedList46 = new tp2.SinglyLinkedList();
    int i47 = singlyLinkedList46.getSize();
    int i48 = singlyLinkedList46.getSize();
    boolean b49 = iP45.equals((java.lang.Object)singlyLinkedList46);
    int i50 = singlyLinkedList46.getSize();
    boolean b51 = iP38.equals((java.lang.Object)singlyLinkedList46);
    iP38.setSecond((java.lang.Integer)138);
    iP38.setSecond((java.lang.Integer)(-1979711488));
    boolean b56 = singlyLinkedList19.remove(iP38);
    tp2.IP iP58 = singlyLinkedList19.get(1110);
    boolean b59 = singlyLinkedList19.repOK();
    boolean b60 = singlyLinkedList19.repOK();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i47 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i48 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b49 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i50 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b51 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b56 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP58);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b59 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b60 == true);

  }

  @Test
  public void test067() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test067"); }


    int i2 = java.lang.Integer.sum(500000000, 8388608);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 508388608);

  }

  @Test
  public void test068() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test068"); }


    int i2 = java.lang.Integer.rotateRight(0, 20272469);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);

  }

  @Test
  public void test069() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test069"); }


    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList0 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b1 = strictlySortedSinglyLinkedList0.repOK();
    tp2.IP iP6 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    boolean b7 = strictlySortedSinglyLinkedList0.containsIP(iP6);
    tp2.IPBan iPBan9 = strictlySortedSinglyLinkedList0.get(176016000);
    int i10 = strictlySortedSinglyLinkedList0.getSize();
    tp2.IP iP15 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i16 = iP15.getSecond();
    iP15.setFirst((java.lang.Integer)11001000);
    java.lang.Long long19 = null;
    tp2.IPBan iPBan20 = new tp2.IPBan(iP15, long19);
    java.lang.Long long21 = iPBan20.getExpires();
    tp2.SinglyLinkedList singlyLinkedList22 = new tp2.SinglyLinkedList();
    boolean b23 = singlyLinkedList22.repOK();
    tp2.IP iP28 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP28.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan32 = new tp2.IPBan(iP28, (java.lang.Long)100L);
    tp2.IP iP37 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP37.setFirst((java.lang.Integer)200);
    java.lang.Integer i40 = iP37.getFourth();
    iPBan32.setIp(iP37);
    singlyLinkedList22.add(iP37);
    iPBan20.setIp(iP37);
    java.lang.Long long44 = iPBan20.getExpires();
    iPBan20.setExpires((java.lang.Long)51756492L);
    tp2.IP iP51 = new tp2.IP((java.lang.Integer)160, (java.lang.Integer)1, (java.lang.Integer)27, (java.lang.Integer)(-2));
    java.lang.Integer i52 = iP51.getFourth();
    java.lang.Integer i53 = iP51.getFourth();
    iPBan20.setIp(iP51);
    boolean b55 = strictlySortedSinglyLinkedList0.removeFromIP(iP51);
    strictlySortedSinglyLinkedList0.size = 24576;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iPBan9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i16 + "' != '" + (-1)+ "'", i16.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(long21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i40 + "' != '" + 100+ "'", i40.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(long44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i52 + "' != '" + (-2)+ "'", i52.equals((-2)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i53 + "' != '" + (-2)+ "'", i53.equals((-2)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b55 == false);

  }

  @Test
  public void test070() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test070"); }


    int i1 = java.lang.Integer.parseUnsignedInt("3758096384");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == (-536870912));

  }

  @Test
  public void test071() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test071"); }


    int i2 = java.lang.Integer.min(184549376, 508388608);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 184549376);

  }

  @Test
  public void test072() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test072"); }


    java.lang.String str1 = java.lang.Integer.toHexString(284738);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "45842"+ "'", str1.equals("45842"));

  }

  @Test
  public void test073() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test073"); }


    java.lang.Integer i2 = java.lang.Integer.getInteger("734003200", (java.lang.Integer)(-1442840576));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i2 + "' != '" + (-1442840576)+ "'", i2.equals((-1442840576)));

  }

  @Test
  public void test074() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test074"); }


    java.lang.Integer i1 = java.lang.Integer.valueOf((-391652184));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + (-391652184)+ "'", i1.equals((-391652184)));

  }

  @Test
  public void test075() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test075"); }


    java.lang.Integer i1 = new java.lang.Integer(90);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 90+ "'", i1.equals(90));

  }

  @Test
  public void test076() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test076"); }


    tp2.IP iP4 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP4.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan8 = new tp2.IPBan(iP4, (java.lang.Long)100L);
    tp2.IP iP13 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i14 = iP13.getSecond();
    java.lang.Integer i15 = iP13.getFourth();
    iP13.setFirst((java.lang.Integer)5);
    iPBan8.ip = iP13;
    java.lang.Long long19 = iPBan8.getExpires();
    iPBan8.setExpires((java.lang.Long)(-1L));
    iPBan8.expires = 100L;
    tp2.IP iP28 = new tp2.IP((java.lang.Integer)242, (java.lang.Integer)242, (java.lang.Integer)30, (java.lang.Integer)(-1));
    iP28.setSecond((java.lang.Integer)33554432);
    iPBan8.setIp(iP28);
    tp2.IP iP32 = iPBan8.ip;
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList33 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b34 = strictlySortedSinglyLinkedList33.repOK();
    strictlySortedSinglyLinkedList33.size = 1;
    strictlySortedSinglyLinkedList33.size = 0;
    tp2.IP iP43 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP43.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan47 = new tp2.IPBan(iP43, (java.lang.Long)100L);
    tp2.IP iP48 = iPBan47.ip;
    boolean b49 = strictlySortedSinglyLinkedList33.contains(iPBan47);
    boolean b50 = strictlySortedSinglyLinkedList33.repOK();
    tp2.SinglyLinkedList singlyLinkedList51 = new tp2.SinglyLinkedList();
    int i52 = singlyLinkedList51.getSize();
    tp2.IP iP57 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i58 = iP57.getSecond();
    java.lang.Integer i59 = iP57.getFourth();
    singlyLinkedList51.add(iP57);
    boolean b62 = iP57.equals((java.lang.Object)2147483647);
    tp2.IPBan iPBan64 = new tp2.IPBan(iP57, (java.lang.Long)(-1L));
    boolean b65 = strictlySortedSinglyLinkedList33.add(iPBan64);
    tp2.Node node66 = strictlySortedSinglyLinkedList33.header;
    strictlySortedSinglyLinkedList33.size = 2147483647;
    tp2.IP iP73 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP73.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan77 = new tp2.IPBan(iP73, (java.lang.Long)100L);
    tp2.IP iP78 = iPBan77.ip;
    tp2.IP iP83 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP83.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan87 = new tp2.IPBan(iP83, (java.lang.Long)100L);
    iPBan77.setIp(iP83);
    java.lang.Long long89 = iPBan77.getExpires();
    tp2.IP iP90 = iPBan77.ip;
    boolean b91 = strictlySortedSinglyLinkedList33.containsIP(iP90);
    tp2.Node node92 = strictlySortedSinglyLinkedList33.header;
    boolean b93 = iP32.equals((java.lang.Object)strictlySortedSinglyLinkedList33);
    strictlySortedSinglyLinkedList33.size = 469910471;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i14 + "' != '" + (-1)+ "'", i14.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i15 + "' != '" + 100+ "'", i15.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long19 + "' != '" + 100L+ "'", long19.equals(100L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b49 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b50 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i52 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i58 + "' != '" + (-1)+ "'", i58.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i59 + "' != '" + 100+ "'", i59.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b62 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b65 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node66);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP78);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long89 + "' != '" + 100L+ "'", long89.equals(100L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP90);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b91 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node92);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b93 == false);

  }

  @Test
  public void test077() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test077"); }


    java.lang.Integer i2 = java.lang.Integer.getInteger("1111010110100010111000010101010", (java.lang.Integer)1048576);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i2 + "' != '" + 1048576+ "'", i2.equals(1048576));

  }

  @Test
  public void test078() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test078"); }


    tp2.SinglyLinkedList singlyLinkedList0 = new tp2.SinglyLinkedList();
    int i1 = singlyLinkedList0.getSize();
    tp2.IP iP6 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i7 = iP6.getSecond();
    java.lang.Integer i8 = iP6.getFourth();
    singlyLinkedList0.add(iP6);
    tp2.IPBan iPBan11 = new tp2.IPBan(iP6, (java.lang.Long)1L);
    java.lang.Integer i12 = iP6.getThird();
    iP6.setFourth((java.lang.Integer)160);
    java.lang.Integer i15 = iP6.getSecond();
    iP6.setSecond((java.lang.Integer)(-122));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i7 + "' != '" + (-1)+ "'", i7.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i8 + "' != '" + 100+ "'", i8.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i12 + "' != '" + (-1)+ "'", i12.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i15 + "' != '" + (-1)+ "'", i15.equals((-1)));

  }

  @Test
  public void test079() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test079"); }


    int i1 = java.lang.Integer.parseInt("167801");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 167801);

  }

  @Test
  public void test080() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test080"); }


    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList0 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b1 = strictlySortedSinglyLinkedList0.repOK();
    tp2.IP iP6 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    boolean b7 = strictlySortedSinglyLinkedList0.containsIP(iP6);
    tp2.Node node8 = strictlySortedSinglyLinkedList0.header;
    boolean b9 = strictlySortedSinglyLinkedList0.isEmpty();
    int i10 = strictlySortedSinglyLinkedList0.getSize();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList11 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b12 = strictlySortedSinglyLinkedList11.repOK();
    tp2.IP iP17 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i18 = iP17.getSecond();
    iP17.setFirst((java.lang.Integer)11001000);
    iP17.setFirst((java.lang.Integer)(-2147483648));
    boolean b23 = strictlySortedSinglyLinkedList11.removeFromIP(iP17);
    tp2.Node node24 = strictlySortedSinglyLinkedList11.header;
    strictlySortedSinglyLinkedList0.header = node24;
    tp2.IPBan iPBan27 = strictlySortedSinglyLinkedList0.get(51756250);
    strictlySortedSinglyLinkedList0.size = 475;
    tp2.IPBan iPBan31 = strictlySortedSinglyLinkedList0.get(10);
    boolean b32 = strictlySortedSinglyLinkedList0.repOK();
    tp2.Node node33 = strictlySortedSinglyLinkedList0.header;
    int i34 = strictlySortedSinglyLinkedList0.size;
    int i35 = strictlySortedSinglyLinkedList0.size;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i18 + "' != '" + (-1)+ "'", i18.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iPBan27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iPBan31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i34 == 475);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i35 == 475);

  }

  @Test
  public void test081() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test081"); }


    // The following exception was thrown during execution in test generation
    try {
      java.lang.Integer i1 = java.lang.Integer.decode("1fd29fb2");
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

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test082"); }


    int i2 = java.lang.Integer.max(14460864, 310);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 14460864);

  }

  @Test
  public void test083() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test083"); }


    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList0 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b1 = strictlySortedSinglyLinkedList0.repOK();
    tp2.IP iP6 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    boolean b7 = strictlySortedSinglyLinkedList0.containsIP(iP6);
    tp2.Node node8 = strictlySortedSinglyLinkedList0.header;
    boolean b9 = strictlySortedSinglyLinkedList0.isEmpty();
    tp2.IPBan iPBan11 = strictlySortedSinglyLinkedList0.get(3);
    strictlySortedSinglyLinkedList0.size = 200;
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
    boolean b43 = strictlySortedSinglyLinkedList0.containsIP(iP38);
    tp2.IPBan iPBan44 = null;
    boolean b45 = strictlySortedSinglyLinkedList0.add(iPBan44);
    
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
    org.junit.Assert.assertTrue(b43 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == true);

  }

  @Test
  public void test084() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test084"); }


    int i1 = java.lang.Integer.lowestOneBit((-1073741606));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 2);

  }

  @Test
  public void test085() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test085"); }


    // The following exception was thrown during execution in test generation
    try {
      int i2 = java.lang.Integer.parseUnsignedInt("10011000100101101000000000", 229376000);
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

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test086"); }


    // The following exception was thrown during execution in test generation
    try {
      int i2 = java.lang.Integer.parseUnsignedInt("11111011001110100", 311647600);
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test087() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test087"); }


    // The following exception was thrown during execution in test generation
    try {
      int i2 = java.lang.Integer.parseUnsignedInt("3183d3a", (-1757626429));
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test088() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test088"); }


    int i2 = java.lang.Integer.compareUnsigned(0, 10000000);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == (-1));

  }

  @Test
  public void test089() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test089"); }


    long long1 = java.lang.Integer.toUnsignedLong(200000200);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == 200000200L);

  }

  @Test
  public void test090() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test090"); }


    java.lang.Integer i1 = new java.lang.Integer(92);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 92+ "'", i1.equals(92));

  }

  @Test
  public void test091() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test091"); }


    java.lang.String str1 = java.lang.Integer.toBinaryString((-620691456));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "11011011000000010000000000000000"+ "'", str1.equals("11011011000000010000000000000000"));

  }

  @Test
  public void test092() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test092"); }


    int i1 = java.lang.Integer.bitCount(529528581);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 19);

  }

  @Test
  public void test093() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test093"); }


    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList0 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b1 = strictlySortedSinglyLinkedList0.repOK();
    tp2.IP iP6 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i7 = iP6.getSecond();
    iP6.setFirst((java.lang.Integer)11001000);
    iP6.setFirst((java.lang.Integer)(-2147483648));
    boolean b12 = strictlySortedSinglyLinkedList0.removeFromIP(iP6);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList13 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b14 = strictlySortedSinglyLinkedList13.isEmpty();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList15 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b16 = strictlySortedSinglyLinkedList15.repOK();
    tp2.IP iP21 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    boolean b22 = strictlySortedSinglyLinkedList15.containsIP(iP21);
    tp2.Node node23 = strictlySortedSinglyLinkedList15.header;
    strictlySortedSinglyLinkedList13.header = node23;
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList25 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b26 = strictlySortedSinglyLinkedList25.repOK();
    strictlySortedSinglyLinkedList25.size = 1;
    strictlySortedSinglyLinkedList25.size = 0;
    tp2.IP iP35 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP35.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan39 = new tp2.IPBan(iP35, (java.lang.Long)100L);
    tp2.IP iP44 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP44.setFirst((java.lang.Integer)200);
    java.lang.Integer i47 = iP44.getFourth();
    iPBan39.setIp(iP44);
    boolean b49 = strictlySortedSinglyLinkedList25.contains(iPBan39);
    boolean b50 = strictlySortedSinglyLinkedList13.contains(iPBan39);
    tp2.SinglyLinkedList singlyLinkedList51 = new tp2.SinglyLinkedList();
    int i52 = singlyLinkedList51.getSize();
    int i53 = singlyLinkedList51.getSize();
    tp2.IP iP54 = null;
    boolean b55 = singlyLinkedList51.contains(iP54);
    tp2.IP iP57 = singlyLinkedList51.get(27);
    tp2.IP iP62 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP62.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan66 = new tp2.IPBan(iP62, (java.lang.Long)100L);
    tp2.IP iP67 = iPBan66.ip;
    tp2.IP iP72 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP72.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan76 = new tp2.IPBan(iP72, (java.lang.Long)100L);
    iPBan66.setIp(iP72);
    boolean b78 = singlyLinkedList51.remove(iP72);
    iPBan39.ip = iP72;
    boolean b80 = strictlySortedSinglyLinkedList0.containsIP(iP72);
    tp2.Node node81 = strictlySortedSinglyLinkedList0.header;
    int i82 = strictlySortedSinglyLinkedList0.getSize();
    tp2.IPBan iPBan84 = strictlySortedSinglyLinkedList0.get(4);
    tp2.IP iP89 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i90 = iP89.getSecond();
    iP89.setFirst((java.lang.Integer)11001000);
    java.lang.Integer i93 = iP89.getSecond();
    iP89.setSecond((java.lang.Integer)200);
    boolean b96 = strictlySortedSinglyLinkedList0.containsIP(iP89);
    tp2.IPBan iPBan98 = strictlySortedSinglyLinkedList0.get(2097152);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i7 + "' != '" + (-1)+ "'", i7.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i47 + "' != '" + 100+ "'", i47.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b49 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b50 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i52 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i53 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b55 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP67);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b78 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b80 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node81);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i82 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iPBan84);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i90 + "' != '" + (-1)+ "'", i90.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i93 + "' != '" + (-1)+ "'", i93.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b96 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iPBan98);

  }

  @Test
  public void test094() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test094"); }


    tp2.SinglyLinkedList singlyLinkedList0 = new tp2.SinglyLinkedList();
    int i1 = singlyLinkedList0.getSize();
    tp2.IP iP6 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i7 = iP6.getSecond();
    java.lang.Integer i8 = iP6.getFourth();
    singlyLinkedList0.add(iP6);
    tp2.IPBan iPBan11 = new tp2.IPBan(iP6, (java.lang.Long)100L);
    iPBan11.expires = 10L;
    tp2.IP iP14 = iPBan11.getIp();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList15 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b16 = strictlySortedSinglyLinkedList15.repOK();
    strictlySortedSinglyLinkedList15.size = 1;
    strictlySortedSinglyLinkedList15.size = 0;
    tp2.IP iP25 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP25.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan29 = new tp2.IPBan(iP25, (java.lang.Long)100L);
    tp2.IP iP30 = iPBan29.ip;
    boolean b31 = strictlySortedSinglyLinkedList15.contains(iPBan29);
    boolean b32 = strictlySortedSinglyLinkedList15.repOK();
    tp2.SinglyLinkedList singlyLinkedList33 = new tp2.SinglyLinkedList();
    int i34 = singlyLinkedList33.getSize();
    tp2.IP iP39 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i40 = iP39.getSecond();
    java.lang.Integer i41 = iP39.getFourth();
    singlyLinkedList33.add(iP39);
    boolean b44 = iP39.equals((java.lang.Object)2147483647);
    tp2.IPBan iPBan46 = new tp2.IPBan(iP39, (java.lang.Long)(-1L));
    boolean b47 = strictlySortedSinglyLinkedList15.add(iPBan46);
    tp2.Node node48 = strictlySortedSinglyLinkedList15.header;
    strictlySortedSinglyLinkedList15.size = 2147483647;
    tp2.IP iP55 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP55.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan59 = new tp2.IPBan(iP55, (java.lang.Long)100L);
    tp2.IP iP60 = iPBan59.ip;
    tp2.IP iP65 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP65.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan69 = new tp2.IPBan(iP65, (java.lang.Long)100L);
    iPBan59.setIp(iP65);
    java.lang.Long long71 = iPBan59.getExpires();
    tp2.IP iP72 = iPBan59.ip;
    boolean b73 = strictlySortedSinglyLinkedList15.containsIP(iP72);
    boolean b74 = iP14.equals((java.lang.Object)iP72);
    iP14.setThird((java.lang.Integer)8);
    java.lang.Integer i77 = iP14.getSecond();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i7 + "' != '" + (-1)+ "'", i7.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i8 + "' != '" + 100+ "'", i8.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i34 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i40 + "' != '" + (-1)+ "'", i40.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i41 + "' != '" + 100+ "'", i41.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b47 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP60);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long71 + "' != '" + 100L+ "'", long71.equals(100L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP72);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b73 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b74 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i77 + "' != '" + (-1)+ "'", i77.equals((-1)));

  }

  @Test
  public void test095() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test095"); }


    int i2 = java.lang.Integer.remainderUnsigned(649456288, 92);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 44);

  }

  @Test
  public void test096() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test096"); }


    int i1 = java.lang.Integer.numberOfTrailingZeros(32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 5);

  }

  @Test
  public void test097() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test097"); }


    java.lang.Integer i2 = java.lang.Integer.getInteger("100111100000000000000000000000", (java.lang.Integer)(-402653184));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i2 + "' != '" + (-402653184)+ "'", i2.equals((-402653184)));

  }

  @Test
  public void test098() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test098"); }


    java.lang.String str2 = java.lang.Integer.toUnsignedString(31130880, 3054);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "31130880"+ "'", str2.equals("31130880"));

  }

  @Test
  public void test099() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test099"); }


    java.lang.Integer i1 = java.lang.Integer.getInteger("3674275840");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);

  }

  @Test
  public void test100() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test100"); }


    int i1 = java.lang.Integer.highestOneBit(1431647489);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 1073741824);

  }

  @Test
  public void test101() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test101"); }


    tp2.SinglyLinkedList singlyLinkedList0 = new tp2.SinglyLinkedList();
    int i1 = singlyLinkedList0.getSize();
    tp2.IP iP6 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i7 = iP6.getSecond();
    java.lang.Integer i8 = iP6.getFourth();
    singlyLinkedList0.add(iP6);
    boolean b10 = singlyLinkedList0.repOK();
    boolean b11 = singlyLinkedList0.repOK();
    boolean b12 = singlyLinkedList0.repOK();
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
    iPBan27.setExpires((java.lang.Long)2013265920L);
    tp2.IP iP44 = iPBan27.getIp();
    iP44.setFourth((java.lang.Integer)65536);
    boolean b47 = singlyLinkedList0.contains(iP44);
    java.lang.Integer i48 = iP44.getThird();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i7 + "' != '" + (-1)+ "'", i7.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i8 + "' != '" + 100+ "'", i8.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
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
    org.junit.Assert.assertNotNull(iP44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b47 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i48 + "' != '" + 356246784+ "'", i48.equals(356246784));

  }

  @Test
  public void test102() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test102"); }


    java.lang.Integer i2 = java.lang.Integer.getInteger("35", (java.lang.Integer)19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i2 + "' != '" + 19+ "'", i2.equals(19));

  }

  @Test
  public void test103() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test103"); }


    tp2.IP iP4 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP4.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan8 = new tp2.IPBan(iP4, (java.lang.Long)100L);
    tp2.IP iP9 = iPBan8.ip;
    tp2.IP iP10 = iPBan8.ip;
    tp2.IP iP11 = iPBan8.getIp();
    tp2.IP iP12 = iPBan8.ip;
    java.lang.Long long13 = null;
    iPBan8.expires = long13;
    java.lang.Long long15 = iPBan8.expires;
    java.lang.Long long16 = iPBan8.expires;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(long15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(long16);

  }

  @Test
  public void test104() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test104"); }


    int i2 = java.lang.Integer.rotateRight(5, 42387);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 40960);

  }

  @Test
  public void test105() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test105"); }


    int i2 = java.lang.Integer.max(10485760, 247671240);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 247671240);

  }

  @Test
  public void test106() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test106"); }


    tp2.SinglyLinkedList singlyLinkedList0 = new tp2.SinglyLinkedList();
    int i1 = singlyLinkedList0.getSize();
    tp2.IP iP6 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i7 = iP6.getSecond();
    java.lang.Integer i8 = iP6.getFourth();
    singlyLinkedList0.add(iP6);
    tp2.IPBan iPBan11 = new tp2.IPBan(iP6, (java.lang.Long)100L);
    tp2.IP iP12 = iPBan11.getIp();
    tp2.IP iP17 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP17.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan21 = new tp2.IPBan(iP17, (java.lang.Long)100L);
    tp2.IP iP22 = iPBan21.ip;
    tp2.IP iP23 = iPBan21.getIp();
    java.lang.Integer i24 = null;
    iP23.setFirst(i24);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList26 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b27 = strictlySortedSinglyLinkedList26.repOK();
    tp2.IP iP32 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i33 = iP32.getSecond();
    iP32.setFirst((java.lang.Integer)11001000);
    iP32.setFirst((java.lang.Integer)(-2147483648));
    boolean b38 = strictlySortedSinglyLinkedList26.removeFromIP(iP32);
    boolean b39 = iP23.equals((java.lang.Object)strictlySortedSinglyLinkedList26);
    java.lang.Integer i40 = iP23.getFirst();
    iPBan11.setIp(iP23);
    java.lang.Integer i42 = iP23.getSecond();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i7 + "' != '" + (-1)+ "'", i7.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i8 + "' != '" + 100+ "'", i8.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i33 + "' != '" + (-1)+ "'", i33.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i42 + "' != '" + (-1)+ "'", i42.equals((-1)));

  }

  @Test
  public void test107() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test107"); }


    int i2 = java.lang.Integer.compare(662700032, 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);

  }

  @Test
  public void test108() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test108"); }


    java.lang.Integer i1 = new java.lang.Integer(101101102);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 101101102+ "'", i1.equals(101101102));

  }

  @Test
  public void test109() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test109"); }


    int i1 = java.lang.Integer.highestOneBit(311);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 256);

  }

  @Test
  public void test110() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test110"); }


    java.lang.String str1 = java.lang.Integer.toHexString(10000);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "2710"+ "'", str1.equals("2710"));

  }

  @Test
  public void test111() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test111"); }


    int i2 = java.lang.Integer.rotateRight((-1442840576), 498);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 10880);

  }

  @Test
  public void test112() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test112"); }


    // The following exception was thrown during execution in test generation
    try {
      int i2 = java.lang.Integer.parseInt("744529281", (-285212216));
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test113() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test113"); }


    java.lang.Integer i1 = java.lang.Integer.decode("1700");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 1700+ "'", i1.equals(1700));

  }

  @Test
  public void test114() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test114"); }


    long long1 = java.lang.Integer.toUnsignedLong(80000007);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == 80000007L);

  }

  @Test
  public void test115() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test115"); }


    int i2 = java.lang.Integer.min(50694, 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);

  }

  @Test
  public void test116() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test116"); }


    tp2.IP iP4 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP4.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan8 = new tp2.IPBan(iP4, (java.lang.Long)100L);
    tp2.IP iP9 = iPBan8.ip;
    tp2.IP iP10 = iPBan8.ip;
    tp2.IP iP11 = iPBan8.getIp();
    iP11.setFourth((java.lang.Integer)51756250);
    tp2.IP iP18 = new tp2.IP((java.lang.Integer)15204352, (java.lang.Integer)1, (java.lang.Integer)15204352, (java.lang.Integer)356246787);
    tp2.SinglyLinkedList singlyLinkedList19 = new tp2.SinglyLinkedList();
    int i20 = singlyLinkedList19.getSize();
    int i21 = singlyLinkedList19.getSize();
    boolean b22 = iP18.equals((java.lang.Object)singlyLinkedList19);
    int i23 = singlyLinkedList19.getSize();
    boolean b24 = iP11.equals((java.lang.Object)singlyLinkedList19);
    boolean b25 = singlyLinkedList19.isEmpty();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList26 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b27 = strictlySortedSinglyLinkedList26.repOK();
    boolean b28 = strictlySortedSinglyLinkedList26.repOK();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList29 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b30 = strictlySortedSinglyLinkedList29.repOK();
    strictlySortedSinglyLinkedList29.size = 1;
    strictlySortedSinglyLinkedList29.size = 0;
    tp2.IP iP39 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP39.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan43 = new tp2.IPBan(iP39, (java.lang.Long)100L);
    tp2.IP iP44 = iPBan43.ip;
    boolean b45 = strictlySortedSinglyLinkedList29.contains(iPBan43);
    boolean b46 = strictlySortedSinglyLinkedList29.repOK();
    tp2.SinglyLinkedList singlyLinkedList47 = new tp2.SinglyLinkedList();
    int i48 = singlyLinkedList47.getSize();
    tp2.IP iP53 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i54 = iP53.getSecond();
    java.lang.Integer i55 = iP53.getFourth();
    singlyLinkedList47.add(iP53);
    boolean b58 = iP53.equals((java.lang.Object)2147483647);
    tp2.IPBan iPBan60 = new tp2.IPBan(iP53, (java.lang.Long)(-1L));
    boolean b61 = strictlySortedSinglyLinkedList29.add(iPBan60);
    tp2.Node node62 = strictlySortedSinglyLinkedList29.header;
    strictlySortedSinglyLinkedList26.header = node62;
    tp2.SinglyLinkedList singlyLinkedList64 = new tp2.SinglyLinkedList();
    int i65 = singlyLinkedList64.getSize();
    tp2.IP iP70 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i71 = iP70.getSecond();
    java.lang.Integer i72 = iP70.getFourth();
    singlyLinkedList64.add(iP70);
    tp2.IPBan iPBan75 = new tp2.IPBan(iP70, (java.lang.Long)100L);
    java.lang.Long long76 = null;
    tp2.IPBan iPBan77 = new tp2.IPBan(iP70, long76);
    boolean b78 = strictlySortedSinglyLinkedList26.containsIP(iP70);
    boolean b79 = singlyLinkedList19.remove(iP70);
    iP70.setSecond((java.lang.Integer)466);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b46 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i48 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i54 + "' != '" + (-1)+ "'", i54.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i55 + "' != '" + 100+ "'", i55.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b58 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b61 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node62);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i65 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i71 + "' != '" + (-1)+ "'", i71.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i72 + "' != '" + 100+ "'", i72.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b78 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b79 == false);

  }

  @Test
  public void test117() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test117"); }


    java.lang.Integer i2 = java.lang.Integer.getInteger("1110001110100000001011111", 100663296);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i2 + "' != '" + 100663296+ "'", i2.equals(100663296));

  }

  @Test
  public void test118() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test118"); }


    // The following exception was thrown during execution in test generation
    try {
      int i2 = java.lang.Integer.parseUnsignedInt("1111000000000000000000000001000", 1476395008);
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

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test119"); }


    tp2.SinglyLinkedList singlyLinkedList0 = new tp2.SinglyLinkedList();
    int i1 = singlyLinkedList0.getSize();
    int i2 = singlyLinkedList0.getSize();
    tp2.IP iP3 = null;
    boolean b4 = singlyLinkedList0.contains(iP3);
    boolean b5 = singlyLinkedList0.repOK();
    boolean b6 = singlyLinkedList0.isEmpty();
    tp2.IP iP11 = new tp2.IP((java.lang.Integer)5, (java.lang.Integer)10, (java.lang.Integer)31, (java.lang.Integer)32);
    java.lang.Object obj12 = null;
    boolean b13 = iP11.equals(obj12);
    iP11.setFirst((java.lang.Integer)100);
    boolean b16 = singlyLinkedList0.contains(iP11);
    boolean b17 = singlyLinkedList0.repOK();
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
    tp2.IPBan iPBan85 = new tp2.IPBan(iP76, (java.lang.Long)4L);
    singlyLinkedList0.add(iP76);
    
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
    org.junit.Assert.assertTrue(b13 == false);
    
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

  }

  @Test
  public void test120() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test120"); }


    java.lang.String str1 = java.lang.Integer.toHexString(498);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "1f2"+ "'", str1.equals("1f2"));

  }

  @Test
  public void test121() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test121"); }


    int i1 = java.lang.Integer.numberOfLeadingZeros(15204352);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 8);

  }

  @Test
  public void test122() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test122"); }


    int i2 = java.lang.Integer.compare(100, 133349376);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == (-1));

  }

  @Test
  public void test123() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test123"); }


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
    iP76.setFirst((java.lang.Integer)162);
    java.lang.Integer i85 = iP76.getFourth();
    iP76.setFourth((java.lang.Integer)176016000);
    java.lang.Integer i88 = iP76.getSecond();
    
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
    org.junit.Assert.assertTrue("'" + i85 + "' != '" + 100+ "'", i85.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i88 + "' != '" + (-1)+ "'", i88.equals((-1)));

  }

  @Test
  public void test124() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test124"); }


    int i2 = java.lang.Integer.sum(466, 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 466);

  }

  @Test
  public void test125() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test125"); }


    int i2 = java.lang.Integer.min(6, 42382);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 6);

  }

  @Test
  public void test126() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test126"); }


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
    tp2.IP iP27 = singlyLinkedList0.get((-2147483641));
    int i28 = singlyLinkedList0.getSize();
    boolean b29 = singlyLinkedList0.repOK();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList30 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b31 = strictlySortedSinglyLinkedList30.repOK();
    tp2.IP iP36 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i37 = iP36.getSecond();
    iP36.setFirst((java.lang.Integer)11001000);
    iP36.setFirst((java.lang.Integer)(-2147483648));
    boolean b42 = strictlySortedSinglyLinkedList30.removeFromIP(iP36);
    java.lang.Integer i43 = iP36.getThird();
    singlyLinkedList0.add(iP36);
    tp2.IP iP49 = new tp2.IP((java.lang.Integer)356246784, (java.lang.Integer)(-939524096), (java.lang.Integer)2013265928, (java.lang.Integer)(-2147483648));
    java.lang.Integer i50 = iP49.getThird();
    iP49.setSecond((java.lang.Integer)2013265928);
    singlyLinkedList0.add(iP49);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList54 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b55 = strictlySortedSinglyLinkedList54.repOK();
    strictlySortedSinglyLinkedList54.size = 1;
    strictlySortedSinglyLinkedList54.size = 0;
    tp2.IP iP64 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i65 = iP64.getSecond();
    java.lang.Integer i66 = iP64.getFourth();
    boolean b67 = strictlySortedSinglyLinkedList54.containsIP(iP64);
    tp2.SinglyLinkedList singlyLinkedList68 = new tp2.SinglyLinkedList();
    int i69 = singlyLinkedList68.getSize();
    tp2.IP iP74 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i75 = iP74.getSecond();
    java.lang.Integer i76 = iP74.getFourth();
    singlyLinkedList68.add(iP74);
    tp2.IP iP79 = singlyLinkedList68.get(5);
    boolean b80 = singlyLinkedList68.repOK();
    tp2.IP iP82 = singlyLinkedList68.get(2013265920);
    tp2.SinglyLinkedList singlyLinkedList83 = new tp2.SinglyLinkedList();
    int i84 = singlyLinkedList83.getSize();
    tp2.IP iP89 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i90 = iP89.getSecond();
    java.lang.Integer i91 = iP89.getFourth();
    singlyLinkedList83.add(iP89);
    iP89.setFourth((java.lang.Integer)167772160);
    singlyLinkedList68.add(iP89);
    boolean b96 = strictlySortedSinglyLinkedList54.removeFromIP(iP89);
    boolean b97 = singlyLinkedList0.contains(iP89);
    iP89.setSecond((java.lang.Integer)(-19159104));
    
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
    org.junit.Assert.assertNull(iP27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i37 + "' != '" + (-1)+ "'", i37.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i43 + "' != '" + (-1)+ "'", i43.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i50 + "' != '" + 2013265928+ "'", i50.equals(2013265928));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b55 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i65 + "' != '" + (-1)+ "'", i65.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i66 + "' != '" + 100+ "'", i66.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b67 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i69 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i75 + "' != '" + (-1)+ "'", i75.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i76 + "' != '" + 100+ "'", i76.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP79);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b80 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP82);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i84 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i90 + "' != '" + (-1)+ "'", i90.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i91 + "' != '" + 100+ "'", i91.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b96 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b97 == false);

  }

  @Test
  public void test127() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test127"); }


    java.lang.Integer i1 = java.lang.Integer.getInteger("2742");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);

  }

  @Test
  public void test128() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test128"); }


    java.lang.Integer i1 = java.lang.Integer.valueOf(51756279);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 51756279+ "'", i1.equals(51756279));

  }

  @Test
  public void test129() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test129"); }


    int i2 = java.lang.Integer.rotateRight(6047546, 71040);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 6047546);

  }

  @Test
  public void test130() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test130"); }


    java.lang.Integer i1 = java.lang.Integer.valueOf("23442");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 23442+ "'", i1.equals(23442));

  }

  @Test
  public void test131() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test131"); }


    // The following exception was thrown during execution in test generation
    try {
      java.lang.Integer i1 = java.lang.Integer.valueOf("11111001010011101100000000");
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

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test132"); }


    java.lang.Integer i1 = java.lang.Integer.valueOf("2610775");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 2610775+ "'", i1.equals(2610775));

  }

  @Test
  public void test133() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test133"); }


    int i1 = java.lang.Integer.signum((-1817903104));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == (-1));

  }

  @Test
  public void test134() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test134"); }


    java.lang.Integer i2 = java.lang.Integer.getInteger("2e0000", 400);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i2 + "' != '" + 400+ "'", i2.equals(400));

  }

  @Test
  public void test135() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test135"); }


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
    tp2.IPBan iPBan38 = strictlySortedSinglyLinkedList0.get(35);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList39 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b40 = strictlySortedSinglyLinkedList39.repOK();
    boolean b41 = strictlySortedSinglyLinkedList39.repOK();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList42 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b43 = strictlySortedSinglyLinkedList42.isEmpty();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList44 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b45 = strictlySortedSinglyLinkedList44.repOK();
    tp2.IP iP50 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    boolean b51 = strictlySortedSinglyLinkedList44.containsIP(iP50);
    tp2.Node node52 = strictlySortedSinglyLinkedList44.header;
    strictlySortedSinglyLinkedList42.header = node52;
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList54 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b55 = strictlySortedSinglyLinkedList54.repOK();
    strictlySortedSinglyLinkedList54.size = 1;
    strictlySortedSinglyLinkedList54.size = 0;
    tp2.IP iP64 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP64.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan68 = new tp2.IPBan(iP64, (java.lang.Long)100L);
    tp2.IP iP73 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP73.setFirst((java.lang.Integer)200);
    java.lang.Integer i76 = iP73.getFourth();
    iPBan68.setIp(iP73);
    boolean b78 = strictlySortedSinglyLinkedList54.contains(iPBan68);
    boolean b79 = strictlySortedSinglyLinkedList42.contains(iPBan68);
    boolean b80 = strictlySortedSinglyLinkedList39.add(iPBan68);
    boolean b81 = strictlySortedSinglyLinkedList0.add(iPBan68);
    boolean b82 = strictlySortedSinglyLinkedList0.isEmpty();
    tp2.IPBan iPBan84 = strictlySortedSinglyLinkedList0.get(28673);
    boolean b85 = strictlySortedSinglyLinkedList0.isEmpty();
    
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
    org.junit.Assert.assertNull(iPBan38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b43 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b51 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b55 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i76 + "' != '" + 100+ "'", i76.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b78 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b79 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b80 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b81 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b82 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iPBan84);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b85 == false);

  }

  @Test
  public void test136() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test136"); }


    java.lang.Integer i2 = java.lang.Integer.getInteger("100001100100101000101", 37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i2 + "' != '" + 37+ "'", i2.equals(37));

  }

  @Test
  public void test137() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test137"); }


    java.lang.String str2 = java.lang.Integer.toUnsignedString(52129309, (-2064515072));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "52129309"+ "'", str2.equals("52129309"));

  }

  @Test
  public void test138() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test138"); }


    tp2.IP iP4 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP4.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan8 = new tp2.IPBan(iP4, (java.lang.Long)100L);
    iP4.setFourth((java.lang.Integer)32);
    java.lang.Integer i11 = iP4.getFirst();
    iP4.setSecond((java.lang.Integer)(-1275068414));
    iP4.setSecond((java.lang.Integer)452984933);
    java.lang.Integer i16 = iP4.getThird();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i11 + "' != '" + 200+ "'", i11.equals(200));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i16 + "' != '" + (-1)+ "'", i16.equals((-1)));

  }

  @Test
  public void test139() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test139"); }


    java.lang.String str1 = java.lang.Integer.toHexString(571893);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "8b9f5"+ "'", str1.equals("8b9f5"));

  }

  @Test
  public void test140() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test140"); }


    java.lang.Integer i2 = java.lang.Integer.getInteger("373002", (java.lang.Integer)1140850688);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i2 + "' != '" + 1140850688+ "'", i2.equals(1140850688));

  }

  @Test
  public void test141() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test141"); }


    int i2 = java.lang.Integer.rotateRight(117596762, 466);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == (-1734966848));

  }

  @Test
  public void test142() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test142"); }


    java.lang.Integer i2 = java.lang.Integer.getInteger("47868c00", 27962026);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i2 + "' != '" + 27962026+ "'", i2.equals(27962026));

  }

  @Test
  public void test143() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test143"); }


    int i1 = java.lang.Integer.signum(1100101);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 1);

  }

  @Test
  public void test144() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test144"); }


    int i1 = java.lang.Integer.numberOfTrailingZeros(536870941);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);

  }

  @Test
  public void test145() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test145"); }


    java.lang.Integer i1 = java.lang.Integer.valueOf(723357666);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 723357666+ "'", i1.equals(723357666));

  }

  @Test
  public void test146() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test146"); }


    int i1 = java.lang.Integer.lowestOneBit(19531250);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 2);

  }

  @Test
  public void test147() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test147"); }


    long long1 = java.lang.Integer.toUnsignedLong((-2064515072));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == 2230452224L);

  }

  @Test
  public void test148() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test148"); }


    int i2 = java.lang.Integer.compareUnsigned(2423432, 700000233);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == (-1));

  }

  @Test
  public void test149() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test149"); }


    long long1 = java.lang.Integer.toUnsignedLong(128);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == 128L);

  }

  @Test
  public void test150() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test150"); }


    int i2 = java.lang.Integer.remainderUnsigned(38, 44004000);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 38);

  }

  @Test
  public void test151() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test151"); }


    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList0 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b1 = strictlySortedSinglyLinkedList0.repOK();
    tp2.IP iP6 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i7 = iP6.getSecond();
    iP6.setFirst((java.lang.Integer)11001000);
    iP6.setFirst((java.lang.Integer)(-2147483648));
    boolean b12 = strictlySortedSinglyLinkedList0.removeFromIP(iP6);
    tp2.Node node13 = strictlySortedSinglyLinkedList0.header;
    tp2.IP iP18 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP18.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan22 = new tp2.IPBan(iP18, (java.lang.Long)100L);
    tp2.IP iP27 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP27.setFirst((java.lang.Integer)200);
    java.lang.Integer i30 = iP27.getFourth();
    iPBan22.setIp(iP27);
    java.lang.Long long32 = iPBan22.expires;
    iPBan22.expires = (-1L);
    iPBan22.setExpires((java.lang.Long)100L);
    iPBan22.expires = 10L;
    boolean b39 = strictlySortedSinglyLinkedList0.add(iPBan22);
    tp2.IP iP44 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP44.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan48 = new tp2.IPBan(iP44, (java.lang.Long)100L);
    tp2.IP iP53 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iPBan48.setIp(iP53);
    iP53.setSecond((java.lang.Integer)8);
    iP53.setFourth((java.lang.Integer)24);
    java.lang.Integer i59 = iP53.getFirst();
    boolean b60 = strictlySortedSinglyLinkedList0.removeFromIP(iP53);
    iP53.setFourth((java.lang.Integer)23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i7 + "' != '" + (-1)+ "'", i7.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i30 + "' != '" + 100+ "'", i30.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long32 + "' != '" + 100L+ "'", long32.equals(100L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i59 + "' != '" + (-1)+ "'", i59.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b60 == true);

  }

  @Test
  public void test152() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test152"); }


    int i2 = java.lang.Integer.min(473687454, 2772752);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 2772752);

  }

  @Test
  public void test153() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test153"); }


    // The following exception was thrown during execution in test generation
    try {
      java.lang.Integer i2 = java.lang.Integer.valueOf("1111000000000000000000000001000", 21484);
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

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test154"); }


    tp2.SinglyLinkedList singlyLinkedList0 = new tp2.SinglyLinkedList();
    boolean b1 = singlyLinkedList0.repOK();
    tp2.IP iP3 = singlyLinkedList0.get(256);
    boolean b4 = singlyLinkedList0.repOK();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);

  }

  @Test
  public void test155() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test155"); }


    java.lang.String str1 = java.lang.Integer.toUnsignedString(80290000);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "80290000"+ "'", str1.equals("80290000"));

  }

  @Test
  public void test156() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test156"); }


    int i1 = java.lang.Integer.parseInt("47776");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 47776);

  }

  @Test
  public void test157() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test157"); }


    // The following exception was thrown during execution in test generation
    try {
      int i2 = java.lang.Integer.parseUnsignedInt("r", 28672);
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

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test158"); }


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
    tp2.IP iP27 = singlyLinkedList0.get((-2147483641));
    int i28 = singlyLinkedList0.getSize();
    tp2.IP iP30 = singlyLinkedList0.get(81);
    boolean b31 = singlyLinkedList0.isEmpty();
    tp2.SinglyLinkedList singlyLinkedList32 = new tp2.SinglyLinkedList();
    int i33 = singlyLinkedList32.getSize();
    int i34 = singlyLinkedList32.getSize();
    tp2.IP iP35 = null;
    boolean b36 = singlyLinkedList32.contains(iP35);
    tp2.IP iP38 = singlyLinkedList32.get(27);
    tp2.IP iP43 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i44 = iP43.getSecond();
    iP43.setFirst((java.lang.Integer)11001000);
    java.lang.Long long47 = null;
    tp2.IPBan iPBan48 = new tp2.IPBan(iP43, long47);
    tp2.IP iP49 = iPBan48.ip;
    tp2.IP iP50 = iPBan48.ip;
    java.lang.Integer i51 = iP50.getFourth();
    boolean b52 = singlyLinkedList32.remove(iP50);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList53 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b54 = strictlySortedSinglyLinkedList53.repOK();
    tp2.IP iP59 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i60 = iP59.getSecond();
    iP59.setFirst((java.lang.Integer)11001000);
    iP59.setFirst((java.lang.Integer)(-2147483648));
    boolean b65 = strictlySortedSinglyLinkedList53.removeFromIP(iP59);
    java.lang.Integer i66 = iP59.getSecond();
    boolean b67 = singlyLinkedList32.contains(iP59);
    iP59.setSecond((java.lang.Integer)3925251);
    java.lang.Integer i70 = iP59.getThird();
    boolean b71 = singlyLinkedList0.remove(iP59);
    boolean b72 = singlyLinkedList0.isEmpty();
    
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
    org.junit.Assert.assertNull(iP27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i34 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i44 + "' != '" + (-1)+ "'", i44.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i51 + "' != '" + 100+ "'", i51.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b52 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b54 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i60 + "' != '" + (-1)+ "'", i60.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b65 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i66 + "' != '" + (-1)+ "'", i66.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b67 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i70 + "' != '" + (-1)+ "'", i70.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b71 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b72 == true);

  }

  @Test
  public void test159() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test159"); }


    java.lang.Integer i1 = java.lang.Integer.valueOf(371235425);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 371235425+ "'", i1.equals(371235425));

  }

  @Test
  public void test160() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test160"); }


    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList0 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IPBan iPBan1 = null;
    boolean b2 = strictlySortedSinglyLinkedList0.add(iPBan1);
    int i3 = strictlySortedSinglyLinkedList0.getSize();
    tp2.Node node4 = strictlySortedSinglyLinkedList0.header;
    strictlySortedSinglyLinkedList0.size = (-2147483648);
    boolean b7 = strictlySortedSinglyLinkedList0.repOK();
    int i8 = strictlySortedSinglyLinkedList0.getSize();
    boolean b9 = strictlySortedSinglyLinkedList0.repOK();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList10 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b11 = strictlySortedSinglyLinkedList10.repOK();
    strictlySortedSinglyLinkedList10.size = 1;
    strictlySortedSinglyLinkedList10.size = 0;
    tp2.IP iP20 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i21 = iP20.getSecond();
    java.lang.Integer i22 = iP20.getFourth();
    boolean b23 = strictlySortedSinglyLinkedList10.containsIP(iP20);
    tp2.SinglyLinkedList singlyLinkedList24 = new tp2.SinglyLinkedList();
    int i25 = singlyLinkedList24.getSize();
    tp2.IP iP30 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i31 = iP30.getSecond();
    java.lang.Integer i32 = iP30.getFourth();
    singlyLinkedList24.add(iP30);
    tp2.IP iP35 = singlyLinkedList24.get(5);
    boolean b36 = singlyLinkedList24.repOK();
    tp2.IP iP38 = singlyLinkedList24.get(2013265920);
    tp2.SinglyLinkedList singlyLinkedList39 = new tp2.SinglyLinkedList();
    int i40 = singlyLinkedList39.getSize();
    tp2.IP iP45 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i46 = iP45.getSecond();
    java.lang.Integer i47 = iP45.getFourth();
    singlyLinkedList39.add(iP45);
    iP45.setFourth((java.lang.Integer)167772160);
    singlyLinkedList24.add(iP45);
    boolean b52 = strictlySortedSinglyLinkedList10.removeFromIP(iP45);
    int i53 = strictlySortedSinglyLinkedList10.getSize();
    tp2.IP iP58 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP58.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan62 = new tp2.IPBan(iP58, (java.lang.Long)100L);
    tp2.IP iP67 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP67.setFirst((java.lang.Integer)200);
    java.lang.Integer i70 = iP67.getFourth();
    iPBan62.setIp(iP67);
    java.lang.Long long72 = iPBan62.expires;
    iPBan62.expires = (-1L);
    java.lang.Long long75 = iPBan62.expires;
    tp2.IP iP76 = iPBan62.getIp();
    boolean b77 = strictlySortedSinglyLinkedList10.add(iPBan62);
    tp2.IP iP78 = iPBan62.ip;
    // The following exception was thrown during execution in test generation
    try {
      boolean b79 = strictlySortedSinglyLinkedList0.removeFromIP(iP78);
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
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == (-2147483648));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i21 + "' != '" + (-1)+ "'", i21.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i22 + "' != '" + 100+ "'", i22.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i31 + "' != '" + (-1)+ "'", i31.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i32 + "' != '" + 100+ "'", i32.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i40 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i46 + "' != '" + (-1)+ "'", i46.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i47 + "' != '" + 100+ "'", i47.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b52 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i53 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i70 + "' != '" + 100+ "'", i70.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long72 + "' != '" + 100L+ "'", long72.equals(100L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long75 + "' != '" + (-1L)+ "'", long75.equals((-1L)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP76);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b77 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP78);

  }

  @Test
  public void test161() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test161"); }


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
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList42 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b43 = strictlySortedSinglyLinkedList42.repOK();
    tp2.IP iP48 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    boolean b49 = strictlySortedSinglyLinkedList42.containsIP(iP48);
    tp2.Node node50 = strictlySortedSinglyLinkedList42.header;
    boolean b51 = strictlySortedSinglyLinkedList42.isEmpty();
    tp2.IPBan iPBan53 = strictlySortedSinglyLinkedList42.get(3);
    strictlySortedSinglyLinkedList42.size = 200;
    tp2.SinglyLinkedList singlyLinkedList56 = new tp2.SinglyLinkedList();
    int i57 = singlyLinkedList56.getSize();
    tp2.IP iP62 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i63 = iP62.getSecond();
    java.lang.Integer i64 = iP62.getFourth();
    singlyLinkedList56.add(iP62);
    boolean b67 = iP62.equals((java.lang.Object)2147483647);
    tp2.IPBan iPBan69 = new tp2.IPBan(iP62, (java.lang.Long)(-1L));
    java.lang.Long long70 = iPBan69.expires;
    tp2.IP iP75 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP75.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan79 = new tp2.IPBan(iP75, (java.lang.Long)100L);
    tp2.IP iP80 = iPBan79.ip;
    iP80.setThird((java.lang.Integer)356246784);
    iPBan69.ip = iP80;
    java.lang.Integer i84 = iP80.getFirst();
    boolean b85 = strictlySortedSinglyLinkedList42.containsIP(iP80);
    boolean b86 = strictlySortedSinglyLinkedList0.removeFromIP(iP80);
    strictlySortedSinglyLinkedList0.size = 8388919;
    int i89 = strictlySortedSinglyLinkedList0.size;
    boolean b90 = strictlySortedSinglyLinkedList0.repOK();
    
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
    org.junit.Assert.assertTrue(b43 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b49 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b51 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iPBan53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i57 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i63 + "' != '" + (-1)+ "'", i63.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i64 + "' != '" + 100+ "'", i64.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b67 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long70 + "' != '" + (-1L)+ "'", long70.equals((-1L)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP80);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i84 + "' != '" + 200+ "'", i84.equals(200));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b85 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b86 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i89 == 8388919);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b90 == false);

  }

  @Test
  public void test162() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test162"); }


    tp2.IP iP4 = new tp2.IP((java.lang.Integer)24300001, (java.lang.Integer)(-671088640), (java.lang.Integer)(-699399716), (java.lang.Integer)872431616);
    java.lang.Integer i5 = iP4.getThird();
    iP4.setSecond((java.lang.Integer)1358954496);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i5 + "' != '" + (-699399716)+ "'", i5.equals((-699399716)));

  }

  @Test
  public void test163() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test163"); }


    java.lang.String str2 = java.lang.Integer.toUnsignedString(8726561, (-2139094931));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "8726561"+ "'", str2.equals("8726561"));

  }

  @Test
  public void test164() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test164"); }


    int i2 = java.lang.Integer.compareUnsigned(0, (-1067707136));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == (-1));

  }

  @Test
  public void test165() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test165"); }


    java.lang.Integer i1 = java.lang.Integer.valueOf(969408512);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 969408512+ "'", i1.equals(969408512));

  }

  @Test
  public void test166() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test166"); }


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
    int i23 = strictlySortedSinglyLinkedList0.getSize();
    tp2.Node node24 = strictlySortedSinglyLinkedList0.header;
    
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
    org.junit.Assert.assertNotNull(node24);

  }

  @Test
  public void test167() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test167"); }


    int i2 = java.lang.Integer.divideUnsigned((-1342177279), 1335907456);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 2);

  }

  @Test
  public void test168() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test168"); }


    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList0 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b1 = strictlySortedSinglyLinkedList0.repOK();
    boolean b2 = strictlySortedSinglyLinkedList0.repOK();
    tp2.IPBan iPBan3 = null;
    boolean b4 = strictlySortedSinglyLinkedList0.add(iPBan3);
    tp2.Node node5 = strictlySortedSinglyLinkedList0.header;
    tp2.IP iP10 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP10.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan14 = new tp2.IPBan(iP10, (java.lang.Long)100L);
    tp2.IP iP15 = iPBan14.ip;
    java.lang.Integer i16 = iP15.getFirst();
    // The following exception was thrown during execution in test generation
    try {
      boolean b17 = strictlySortedSinglyLinkedList0.containsIP(iP15);
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
    org.junit.Assert.assertNotNull(node5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i16 + "' != '" + 200+ "'", i16.equals(200));

  }

  @Test
  public void test169() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test169"); }


    int i2 = java.lang.Integer.divideUnsigned((-1342177280), 5220000);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 565);

  }

  @Test
  public void test170() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test170"); }


    // The following exception was thrown during execution in test generation
    try {
      int i2 = java.lang.Integer.parseUnsignedInt("35", 0);
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test171() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test171"); }


    java.lang.Integer i1 = java.lang.Integer.getInteger("148");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);

  }

  @Test
  public void test172() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test172"); }


    java.lang.Integer i2 = java.lang.Integer.getInteger("2000000", (java.lang.Integer)49656);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i2 + "' != '" + 49656+ "'", i2.equals(49656));

  }

  @Test
  public void test173() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test173"); }


    java.lang.String str1 = java.lang.Integer.toOctalString(144340);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "431724"+ "'", str1.equals("431724"));

  }

  @Test
  public void test174() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test174"); }


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
    int i24 = strictlySortedSinglyLinkedList0.getSize();
    int i25 = strictlySortedSinglyLinkedList0.size;
    boolean b26 = strictlySortedSinglyLinkedList0.repOK();
    
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
    org.junit.Assert.assertTrue(i24 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == true);

  }

  @Test
  public void test175() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test175"); }


    java.lang.Integer i1 = new java.lang.Integer((-2144796578));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + (-2144796578)+ "'", i1.equals((-2144796578)));

  }

  @Test
  public void test176() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test176"); }


    int i1 = java.lang.Integer.numberOfLeadingZeros(38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 26);

  }

  @Test
  public void test177() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test177"); }


    tp2.IP iP4 = new tp2.IP((java.lang.Integer)5020, (java.lang.Integer)73, (java.lang.Integer)26000010, (java.lang.Integer)335561509);
    iP4.setSecond((java.lang.Integer)5);

  }

  @Test
  public void test178() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test178"); }


    int i2 = java.lang.Integer.max(1572869, 138);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1572869);

  }

  @Test
  public void test179() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test179"); }


    // The following exception was thrown during execution in test generation
    try {
      java.lang.Integer i2 = java.lang.Integer.valueOf("278528", 805306496);
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

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test180"); }


    java.lang.Integer i1 = java.lang.Integer.getInteger("22265424");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);

  }

  @Test
  public void test181() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test181"); }


    tp2.IP iP4 = new tp2.IP((java.lang.Integer)3925251, (java.lang.Integer)31, (java.lang.Integer)29, (java.lang.Integer)163840);
    iP4.setSecond((java.lang.Integer)353632304);

  }

  @Test
  public void test182() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test182"); }


    tp2.IP iP4 = new tp2.IP((java.lang.Integer)356246784, (java.lang.Integer)(-939524096), (java.lang.Integer)2013265928, (java.lang.Integer)(-2147483648));
    java.lang.Integer i5 = iP4.getThird();
    iP4.setSecond((java.lang.Integer)2013265928);
    java.lang.Long long8 = null;
    tp2.IPBan iPBan9 = new tp2.IPBan(iP4, long8);
    tp2.IP iP10 = iPBan9.getIp();
    tp2.SinglyLinkedList singlyLinkedList11 = new tp2.SinglyLinkedList();
    boolean b12 = singlyLinkedList11.repOK();
    tp2.IP iP14 = singlyLinkedList11.get(200);
    boolean b15 = singlyLinkedList11.isEmpty();
    boolean b16 = singlyLinkedList11.repOK();
    boolean b17 = singlyLinkedList11.repOK();
    tp2.IP iP22 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP22.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan26 = new tp2.IPBan(iP22, (java.lang.Long)100L);
    tp2.IP iP31 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i32 = iP31.getSecond();
    java.lang.Integer i33 = iP31.getFourth();
    iP31.setFirst((java.lang.Integer)5);
    iPBan26.ip = iP31;
    java.lang.Long long37 = iPBan26.getExpires();
    iPBan26.setExpires((java.lang.Long)(-1L));
    iPBan26.expires = 100L;
    tp2.IP iP46 = new tp2.IP((java.lang.Integer)242, (java.lang.Integer)242, (java.lang.Integer)30, (java.lang.Integer)(-1));
    iP46.setSecond((java.lang.Integer)33554432);
    iPBan26.setIp(iP46);
    tp2.IP iP50 = iPBan26.ip;
    java.lang.Long long51 = null;
    iPBan26.expires = long51;
    tp2.IP iP53 = iPBan26.getIp();
    java.lang.Integer i54 = iP53.getSecond();
    singlyLinkedList11.add(iP53);
    iPBan9.ip = iP53;
    iP53.setFirst((java.lang.Integer)40960);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i5 + "' != '" + 2013265928+ "'", i5.equals(2013265928));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i32 + "' != '" + (-1)+ "'", i32.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i33 + "' != '" + 100+ "'", i33.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long37 + "' != '" + 100L+ "'", long37.equals(100L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i54 + "' != '" + 33554432+ "'", i54.equals(33554432));

  }

  @Test
  public void test183() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test183"); }


    tp2.IP iP4 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i5 = iP4.getSecond();
    iP4.setFirst((java.lang.Integer)11001000);
    iP4.setFirst((java.lang.Integer)32);
    java.lang.Integer i10 = iP4.getFirst();
    iP4.setSecond((java.lang.Integer)40);
    iP4.setFirst((java.lang.Integer)242);
    java.lang.Integer i15 = iP4.getThird();
    iP4.setFourth((java.lang.Integer)32547700);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i5 + "' != '" + (-1)+ "'", i5.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i10 + "' != '" + 32+ "'", i10.equals(32));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i15 + "' != '" + (-1)+ "'", i15.equals((-1)));

  }

  @Test
  public void test184() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test184"); }


    int i2 = java.lang.Integer.min(1233, 36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 36);

  }

  @Test
  public void test185() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test185"); }


    java.lang.String str1 = java.lang.Integer.toBinaryString((-939512996));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "11001000000000000010101101011100"+ "'", str1.equals("11001000000000000010101101011100"));

  }

  @Test
  public void test186() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test186"); }


    java.lang.Integer i2 = java.lang.Integer.getInteger("20000000000", 555);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i2 + "' != '" + 555+ "'", i2.equals(555));

  }

  @Test
  public void test187() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test187"); }


    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList0 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b1 = strictlySortedSinglyLinkedList0.repOK();
    boolean b2 = strictlySortedSinglyLinkedList0.repOK();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList3 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b4 = strictlySortedSinglyLinkedList3.repOK();
    tp2.IP iP9 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    boolean b10 = strictlySortedSinglyLinkedList3.containsIP(iP9);
    tp2.Node node11 = strictlySortedSinglyLinkedList3.header;
    strictlySortedSinglyLinkedList0.header = node11;
    strictlySortedSinglyLinkedList0.size = 0;
    tp2.IPBan iPBan16 = strictlySortedSinglyLinkedList0.get(0);
    strictlySortedSinglyLinkedList0.size = (-1062740992);
    tp2.IP iP23 = new tp2.IP((java.lang.Integer)356246784, (java.lang.Integer)162, (java.lang.Integer)3, (java.lang.Integer)200);
    boolean b24 = strictlySortedSinglyLinkedList0.removeFromIP(iP23);
    tp2.Node node25 = strictlySortedSinglyLinkedList0.header;
    int i26 = strictlySortedSinglyLinkedList0.size;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iPBan16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == (-1062740992));

  }

  @Test
  public void test188() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test188"); }


    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList0 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b1 = strictlySortedSinglyLinkedList0.repOK();
    tp2.IP iP6 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    boolean b7 = strictlySortedSinglyLinkedList0.containsIP(iP6);
    int i8 = strictlySortedSinglyLinkedList0.getSize();
    tp2.SinglyLinkedList singlyLinkedList9 = new tp2.SinglyLinkedList();
    int i10 = singlyLinkedList9.getSize();
    tp2.IP iP15 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i16 = iP15.getSecond();
    java.lang.Integer i17 = iP15.getFourth();
    singlyLinkedList9.add(iP15);
    tp2.IPBan iPBan20 = new tp2.IPBan(iP15, (java.lang.Long)100L);
    iPBan20.expires = 10L;
    tp2.IP iP23 = iPBan20.getIp();
    iPBan20.expires = 0L;
    java.lang.Long long26 = iPBan20.expires;
    boolean b27 = strictlySortedSinglyLinkedList0.add(iPBan20);
    boolean b28 = strictlySortedSinglyLinkedList0.isEmpty();
    int i29 = strictlySortedSinglyLinkedList0.size;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i16 + "' != '" + (-1)+ "'", i16.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i17 + "' != '" + 100+ "'", i17.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L+ "'", long26.equals(0L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i29 == 1);

  }

  @Test
  public void test189() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test189"); }


    int i1 = java.lang.Integer.lowestOneBit(372963);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 1);

  }

  @Test
  public void test190() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test190"); }


    int i1 = java.lang.Integer.reverse(10616);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 513015808);

  }

  @Test
  public void test191() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test191"); }


    tp2.SinglyLinkedList singlyLinkedList0 = new tp2.SinglyLinkedList();
    int i1 = singlyLinkedList0.getSize();
    int i2 = singlyLinkedList0.getSize();
    tp2.IP iP3 = null;
    boolean b4 = singlyLinkedList0.contains(iP3);
    tp2.IP iP6 = singlyLinkedList0.get(27);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList7 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b8 = strictlySortedSinglyLinkedList7.repOK();
    boolean b9 = strictlySortedSinglyLinkedList7.repOK();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList10 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b11 = strictlySortedSinglyLinkedList10.isEmpty();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList12 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b13 = strictlySortedSinglyLinkedList12.repOK();
    tp2.IP iP18 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    boolean b19 = strictlySortedSinglyLinkedList12.containsIP(iP18);
    tp2.Node node20 = strictlySortedSinglyLinkedList12.header;
    strictlySortedSinglyLinkedList10.header = node20;
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList22 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b23 = strictlySortedSinglyLinkedList22.repOK();
    strictlySortedSinglyLinkedList22.size = 1;
    strictlySortedSinglyLinkedList22.size = 0;
    tp2.IP iP32 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP32.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan36 = new tp2.IPBan(iP32, (java.lang.Long)100L);
    tp2.IP iP41 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP41.setFirst((java.lang.Integer)200);
    java.lang.Integer i44 = iP41.getFourth();
    iPBan36.setIp(iP41);
    boolean b46 = strictlySortedSinglyLinkedList22.contains(iPBan36);
    boolean b47 = strictlySortedSinglyLinkedList10.contains(iPBan36);
    boolean b48 = strictlySortedSinglyLinkedList7.add(iPBan36);
    tp2.SinglyLinkedList singlyLinkedList49 = new tp2.SinglyLinkedList();
    int i50 = singlyLinkedList49.getSize();
    tp2.IP iP55 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i56 = iP55.getSecond();
    java.lang.Integer i57 = iP55.getFourth();
    singlyLinkedList49.add(iP55);
    tp2.IPBan iPBan60 = new tp2.IPBan(iP55, (java.lang.Long)100L);
    tp2.IPBan iPBan62 = new tp2.IPBan(iP55, (java.lang.Long)(-1L));
    boolean b63 = strictlySortedSinglyLinkedList7.containsIP(iP55);
    singlyLinkedList0.add(iP55);
    iP55.setThird((java.lang.Integer)1572869);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i44 + "' != '" + 100+ "'", i44.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b46 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b47 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b48 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i50 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i56 + "' != '" + (-1)+ "'", i56.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i57 + "' != '" + 100+ "'", i57.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b63 == false);

  }

  @Test
  public void test192() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test192"); }


    java.lang.String str2 = java.lang.Integer.toUnsignedString(969408512, 117440512);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "969408512"+ "'", str2.equals("969408512"));

  }

  @Test
  public void test193() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test193"); }


    java.lang.String str2 = java.lang.Integer.toUnsignedString(295365732, 135114752);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "295365732"+ "'", str2.equals("295365732"));

  }

  @Test
  public void test194() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test194"); }


    int i1 = java.lang.Integer.reverse(71040);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 27820032);

  }

  @Test
  public void test195() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test195"); }


    int i2 = java.lang.Integer.divideUnsigned(624004, (-1590516990));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);

  }

  @Test
  public void test196() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test196"); }


    int i2 = java.lang.Integer.rotateRight(8, (-2023746560));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 8);

  }

  @Test
  public void test197() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test197"); }


    int i1 = java.lang.Integer.lowestOneBit(67108864);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 67108864);

  }

  @Test
  public void test198() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test198"); }


    int i2 = java.lang.Integer.compareUnsigned((-327155712), (-625208061));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);

  }

  @Test
  public void test199() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test199"); }


    java.lang.Integer i1 = new java.lang.Integer(2146566144);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 2146566144+ "'", i1.equals(2146566144));

  }

  @Test
  public void test200() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test200"); }


    int i2 = java.lang.Integer.max((-1342177279), 1614970883);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1614970883);

  }

  @Test
  public void test201() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test201"); }


    int i2 = java.lang.Integer.min((-2120392660), 9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == (-2120392660));

  }

  @Test
  public void test202() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test202"); }


    java.lang.Integer i1 = java.lang.Integer.valueOf("4096");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 4096+ "'", i1.equals(4096));

  }

  @Test
  public void test203() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test203"); }


    int i2 = java.lang.Integer.divideUnsigned(824200, (-999872768));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);

  }

  @Test
  public void test204() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test204"); }


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
    java.lang.Integer i46 = iP45.getSecond();
    tp2.SinglyLinkedList singlyLinkedList47 = new tp2.SinglyLinkedList();
    boolean b48 = singlyLinkedList47.repOK();
    boolean b49 = iP45.equals((java.lang.Object)b48);
    tp2.IPBan iPBan51 = new tp2.IPBan(iP45, (java.lang.Long)100L);
    tp2.IP iP56 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i57 = iP56.getSecond();
    iP56.setFirst((java.lang.Integer)11001000);
    iP56.setFirst((java.lang.Integer)(-2147483648));
    iPBan51.ip = iP56;
    boolean b63 = strictlySortedSinglyLinkedList0.add(iPBan51);
    strictlySortedSinglyLinkedList0.size = 67108864;
    tp2.IP iP70 = new tp2.IP((java.lang.Integer)5, (java.lang.Integer)10, (java.lang.Integer)31, (java.lang.Integer)32);
    java.lang.Object obj71 = null;
    boolean b72 = iP70.equals(obj71);
    tp2.IP iP77 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP77.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan81 = new tp2.IPBan(iP77, (java.lang.Long)100L);
    tp2.IP iP82 = iPBan81.ip;
    tp2.SinglyLinkedList singlyLinkedList83 = new tp2.SinglyLinkedList();
    int i84 = singlyLinkedList83.getSize();
    tp2.IP iP89 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i90 = iP89.getSecond();
    java.lang.Integer i91 = iP89.getFourth();
    singlyLinkedList83.add(iP89);
    boolean b93 = iP82.equals((java.lang.Object)iP89);
    boolean b94 = iP70.equals((java.lang.Object)iP89);
    java.lang.Integer i95 = iP89.getSecond();
    boolean b96 = strictlySortedSinglyLinkedList0.removeFromIP(iP89);
    
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
    org.junit.Assert.assertTrue("'" + i46 + "' != '" + (-1)+ "'", i46.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b48 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b49 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i57 + "' != '" + (-1)+ "'", i57.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b63 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b72 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP82);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i84 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i90 + "' != '" + (-1)+ "'", i90.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i91 + "' != '" + 100+ "'", i91.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b93 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b94 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i95 + "' != '" + (-1)+ "'", i95.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b96 == true);

  }

  @Test
  public void test205() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test205"); }


    int i2 = java.lang.Integer.rotateRight(2115239506, 216);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 335434366);

  }

  @Test
  public void test206() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test206"); }


    int i1 = java.lang.Integer.numberOfLeadingZeros(601526722);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 2);

  }

  @Test
  public void test207() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test207"); }


    int i2 = java.lang.Integer.rotateRight(332601, 805306369);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == (-2147317348));

  }

  @Test
  public void test208() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test208"); }


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
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList25 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b26 = strictlySortedSinglyLinkedList25.repOK();
    tp2.IP iP31 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    boolean b32 = strictlySortedSinglyLinkedList25.containsIP(iP31);
    tp2.Node node33 = strictlySortedSinglyLinkedList25.header;
    tp2.IP iP38 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP38.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan42 = new tp2.IPBan(iP38, (java.lang.Long)100L);
    tp2.IP iP43 = iPBan42.ip;
    tp2.IP iP48 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP48.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan52 = new tp2.IPBan(iP48, (java.lang.Long)100L);
    iPBan42.setIp(iP48);
    tp2.IPBan iPBan55 = new tp2.IPBan(iP48, (java.lang.Long)(-1L));
    boolean b56 = strictlySortedSinglyLinkedList25.contains(iPBan55);
    tp2.IP iP61 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i62 = iP61.getSecond();
    iP61.setFirst((java.lang.Integer)11001000);
    java.lang.Long long65 = null;
    tp2.IPBan iPBan66 = new tp2.IPBan(iP61, long65);
    java.lang.Long long67 = iPBan66.getExpires();
    tp2.IP iP68 = null;
    iPBan66.setIp(iP68);
    tp2.SinglyLinkedList singlyLinkedList70 = new tp2.SinglyLinkedList();
    boolean b71 = singlyLinkedList70.repOK();
    tp2.IP iP73 = singlyLinkedList70.get(200);
    boolean b74 = singlyLinkedList70.isEmpty();
    boolean b75 = singlyLinkedList70.repOK();
    boolean b76 = singlyLinkedList70.repOK();
    tp2.SinglyLinkedList singlyLinkedList77 = new tp2.SinglyLinkedList();
    int i78 = singlyLinkedList77.getSize();
    tp2.IP iP83 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i84 = iP83.getSecond();
    iP83.setFirst((java.lang.Integer)11001000);
    iP83.setFirst((java.lang.Integer)32);
    boolean b89 = singlyLinkedList77.remove(iP83);
    boolean b90 = singlyLinkedList70.remove(iP83);
    iP83.setFourth((java.lang.Integer)92);
    java.lang.Integer i93 = iP83.getFirst();
    iPBan66.ip = iP83;
    boolean b95 = strictlySortedSinglyLinkedList25.contains(iPBan66);
    boolean b96 = iP24.equals((java.lang.Object)iPBan66);
    iP24.setFirst((java.lang.Integer)(-473825240));
    
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b56 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i62 + "' != '" + (-1)+ "'", i62.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(long67);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b71 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP73);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b74 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b75 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b76 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i78 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i84 + "' != '" + (-1)+ "'", i84.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b89 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b90 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i93 + "' != '" + 32+ "'", i93.equals(32));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b95 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b96 == false);

  }

  @Test
  public void test209() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test209"); }


    int i1 = java.lang.Integer.reverseBytes(10000);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 270991360);

  }

  @Test
  public void test210() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test210"); }


    int i2 = java.lang.Integer.divideUnsigned(46, 80);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);

  }

  @Test
  public void test211() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test211"); }


    // The following exception was thrown during execution in test generation
    try {
      int i2 = java.lang.Integer.parseInt("33000000242", 0);
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

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test212"); }


    // The following exception was thrown during execution in test generation
    try {
      int i1 = java.lang.Integer.parseUnsignedInt("11401000000");
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

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test213"); }


    java.lang.String str2 = java.lang.Integer.toUnsignedString((-1), 33096);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4294967295"+ "'", str2.equals("4294967295"));

  }

  @Test
  public void test214() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test214"); }


    int i2 = java.lang.Integer.remainderUnsigned(44004000, 5244416);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 2048672);

  }

  @Test
  public void test215() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test215"); }


    int i1 = java.lang.Integer.signum((-536870910));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == (-1));

  }

  @Test
  public void test216() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test216"); }


    int i2 = java.lang.Integer.divideUnsigned(340, (-2147483648));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);

  }

  @Test
  public void test217() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test217"); }


    tp2.IP iP4 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP4.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan8 = new tp2.IPBan(iP4, (java.lang.Long)100L);
    tp2.IP iP13 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP13.setFirst((java.lang.Integer)200);
    java.lang.Integer i16 = iP13.getFourth();
    iPBan8.setIp(iP13);
    java.lang.Long long18 = iPBan8.expires;
    iPBan8.expires = (-1L);
    iPBan8.setExpires((java.lang.Long)100L);
    iPBan8.expires = 10L;
    tp2.IP iP25 = iPBan8.getIp();
    tp2.IP iP26 = iPBan8.getIp();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList27 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b28 = strictlySortedSinglyLinkedList27.repOK();
    tp2.IP iP33 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    boolean b34 = strictlySortedSinglyLinkedList27.containsIP(iP33);
    java.lang.Integer i35 = iP33.getFirst();
    iP33.setFourth((java.lang.Integer)211631616);
    iP33.setFirst((java.lang.Integer)29824259);
    java.lang.Integer i40 = iP33.getThird();
    iP33.setThird((java.lang.Integer)1358954496);
    iP33.setSecond((java.lang.Integer)1408648186);
    iPBan8.ip = iP33;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i16 + "' != '" + 100+ "'", i16.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long18 + "' != '" + 100L+ "'", long18.equals(100L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i35 + "' != '" + (-1)+ "'", i35.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i40 + "' != '" + (-1)+ "'", i40.equals((-1)));

  }

  @Test
  public void test218() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test218"); }


    int i1 = java.lang.Integer.highestOneBit(328);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 256);

  }

  @Test
  public void test219() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test219"); }


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
    tp2.IP iP25 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i26 = iP25.getSecond();
    iP25.setFirst((java.lang.Integer)11001000);
    java.lang.Long long29 = null;
    tp2.IPBan iPBan30 = new tp2.IPBan(iP25, long29);
    java.lang.Long long31 = iPBan30.getExpires();
    tp2.IP iP32 = null;
    iPBan30.setIp(iP32);
    tp2.SinglyLinkedList singlyLinkedList34 = new tp2.SinglyLinkedList();
    boolean b35 = singlyLinkedList34.repOK();
    tp2.IP iP37 = singlyLinkedList34.get(200);
    boolean b38 = singlyLinkedList34.isEmpty();
    boolean b39 = singlyLinkedList34.repOK();
    boolean b40 = singlyLinkedList34.repOK();
    tp2.SinglyLinkedList singlyLinkedList41 = new tp2.SinglyLinkedList();
    int i42 = singlyLinkedList41.getSize();
    tp2.IP iP47 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i48 = iP47.getSecond();
    iP47.setFirst((java.lang.Integer)11001000);
    iP47.setFirst((java.lang.Integer)32);
    boolean b53 = singlyLinkedList41.remove(iP47);
    boolean b54 = singlyLinkedList34.remove(iP47);
    iP47.setFourth((java.lang.Integer)92);
    java.lang.Integer i57 = iP47.getFirst();
    iPBan30.ip = iP47;
    boolean b59 = iP15.equals((java.lang.Object)iPBan30);
    
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
    org.junit.Assert.assertTrue("'" + i26 + "' != '" + (-1)+ "'", i26.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(long31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i42 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i48 + "' != '" + (-1)+ "'", i48.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b53 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b54 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i57 + "' != '" + 32+ "'", i57.equals(32));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b59 == false);

  }

  @Test
  public void test220() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test220"); }


    int i2 = java.lang.Integer.compare(206848, 167801);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);

  }

  @Test
  public void test221() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test221"); }


    // The following exception was thrown during execution in test generation
    try {
      int i2 = java.lang.Integer.parseUnsignedInt("2174574592", 70187596);
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test222() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test222"); }


    // The following exception was thrown during execution in test generation
    try {
      int i2 = java.lang.Integer.parseInt("2150170624", 10000000);
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

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test223"); }


    java.lang.Integer i2 = java.lang.Integer.getInteger("301989888", (java.lang.Integer)167755776);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i2 + "' != '" + 167755776+ "'", i2.equals(167755776));

  }

  @Test
  public void test224() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test224"); }


    int i1 = java.lang.Integer.bitCount(117440968);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 7);

  }

  @Test
  public void test225() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test225"); }


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
    tp2.IP iP32 = singlyLinkedList0.get(81);
    int i33 = singlyLinkedList0.getSize();
    int i34 = singlyLinkedList0.getSize();
    tp2.IP iP39 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i40 = iP39.getSecond();
    tp2.SinglyLinkedList singlyLinkedList41 = new tp2.SinglyLinkedList();
    boolean b42 = singlyLinkedList41.repOK();
    boolean b43 = iP39.equals((java.lang.Object)b42);
    iP39.setFirst((java.lang.Integer)(-671088640));
    boolean b46 = singlyLinkedList0.remove(iP39);
    boolean b48 = iP39.equals((java.lang.Object)(-383272663));
    
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
    org.junit.Assert.assertNull(iP32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i34 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i40 + "' != '" + (-1)+ "'", i40.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b43 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b46 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b48 == false);

  }

  @Test
  public void test226() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test226"); }


    java.lang.String str1 = java.lang.Integer.toHexString((-118362208));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "f8f1efa0"+ "'", str1.equals("f8f1efa0"));

  }

  @Test
  public void test227() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test227"); }


    // The following exception was thrown during execution in test generation
    try {
      int i2 = java.lang.Integer.parseUnsignedInt("1111010110100010111000010101010", 945005268);
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test228() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test228"); }


    int i1 = java.lang.Integer.signum(524420645);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 1);

  }

  @Test
  public void test229() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test229"); }


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
    java.lang.Long long64 = iPBan49.expires;
    tp2.IP iP65 = iPBan49.getIp();
    iPBan49.expires = 67108864L;
    
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
    org.junit.Assert.assertTrue("'" + long64 + "' != '" + (-1L)+ "'", long64.equals((-1L)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP65);

  }

  @Test
  public void test230() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test230"); }


    java.lang.String str2 = java.lang.Integer.toUnsignedString(149241072, 1275330560);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "149241072"+ "'", str2.equals("149241072"));

  }

  @Test
  public void test231() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test231"); }


    int i1 = java.lang.Integer.numberOfLeadingZeros(44004000);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 6);

  }

  @Test
  public void test232() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test232"); }


    // The following exception was thrown during execution in test generation
    try {
      java.lang.Integer i2 = java.lang.Integer.valueOf("3682598912", 452984933);
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

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test233"); }


    int i1 = java.lang.Integer.highestOneBit(13416038);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 8388608);

  }

  @Test
  public void test234() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test234"); }


    java.lang.Integer i1 = java.lang.Integer.valueOf("56");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 56+ "'", i1.equals(56));

  }

  @Test
  public void test235() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test235"); }


    java.lang.Integer i2 = java.lang.Integer.getInteger("10100000000000100001100100101", 22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i2 + "' != '" + 22+ "'", i2.equals(22));

  }

  @Test
  public void test236() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test236"); }


    int i2 = java.lang.Integer.max(40001242, 242);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 40001242);

  }

  @Test
  public void test237() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test237"); }


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
    java.lang.Long long69 = iPBan66.expires;
    
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

  }

  @Test
  public void test238() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test238"); }


    int i2 = java.lang.Integer.sum(1048576, 452984832);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 454033408);

  }

  @Test
  public void test239() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test239"); }


    // The following exception was thrown during execution in test generation
    try {
      int i2 = java.lang.Integer.parseUnsignedInt("10001010110000000", 24117248);
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

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test240"); }


    int i2 = java.lang.Integer.max(33096, 362);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 33096);

  }

  @Test
  public void test241() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test241"); }


    int i1 = java.lang.Integer.lowestOneBit(133);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 1);

  }

  @Test
  public void test242() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test242"); }


    java.lang.Integer i2 = java.lang.Integer.getInteger("", (java.lang.Integer)54086648);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i2 + "' != '" + 54086648+ "'", i2.equals(54086648));

  }

  @Test
  public void test243() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test243"); }


    java.lang.Integer i2 = java.lang.Integer.getInteger("1111111111111111111111111111111", (java.lang.Integer)19531250);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i2 + "' != '" + 19531250+ "'", i2.equals(19531250));

  }

  @Test
  public void test244() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test244"); }


    java.lang.String str1 = java.lang.Integer.toOctalString(8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "10"+ "'", str1.equals("10"));

  }

  @Test
  public void test245() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test245"); }


    // The following exception was thrown during execution in test generation
    try {
      int i2 = java.lang.Integer.parseInt("9dd6da6", 1408648186);
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

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test246"); }


    int i1 = java.lang.Integer.reverseBytes(1300000000);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 7175245);

  }

  @Test
  public void test247() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test247"); }


    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList0 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b1 = strictlySortedSinglyLinkedList0.repOK();
    boolean b2 = strictlySortedSinglyLinkedList0.repOK();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList3 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b4 = strictlySortedSinglyLinkedList3.repOK();
    tp2.IP iP9 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    boolean b10 = strictlySortedSinglyLinkedList3.containsIP(iP9);
    tp2.Node node11 = strictlySortedSinglyLinkedList3.header;
    strictlySortedSinglyLinkedList0.header = node11;
    strictlySortedSinglyLinkedList0.size = 0;
    tp2.IPBan iPBan16 = strictlySortedSinglyLinkedList0.get(0);
    strictlySortedSinglyLinkedList0.size = (-1062740992);
    tp2.IP iP23 = new tp2.IP((java.lang.Integer)356246784, (java.lang.Integer)162, (java.lang.Integer)3, (java.lang.Integer)200);
    boolean b24 = strictlySortedSinglyLinkedList0.removeFromIP(iP23);
    java.lang.Integer i25 = iP23.getFirst();
    tp2.SinglyLinkedList singlyLinkedList26 = new tp2.SinglyLinkedList();
    boolean b27 = singlyLinkedList26.repOK();
    tp2.IP iP32 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP32.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan36 = new tp2.IPBan(iP32, (java.lang.Long)100L);
    tp2.IP iP41 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP41.setFirst((java.lang.Integer)200);
    java.lang.Integer i44 = iP41.getFourth();
    iPBan36.setIp(iP41);
    singlyLinkedList26.add(iP41);
    boolean b47 = singlyLinkedList26.isEmpty();
    tp2.IP iP49 = singlyLinkedList26.get(33554432);
    tp2.SinglyLinkedList singlyLinkedList50 = new tp2.SinglyLinkedList();
    int i51 = singlyLinkedList50.getSize();
    int i52 = singlyLinkedList50.getSize();
    tp2.IP iP53 = null;
    boolean b54 = singlyLinkedList50.contains(iP53);
    tp2.IP iP56 = singlyLinkedList50.get(27);
    tp2.IP iP61 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i62 = iP61.getSecond();
    iP61.setFirst((java.lang.Integer)11001000);
    java.lang.Long long65 = null;
    tp2.IPBan iPBan66 = new tp2.IPBan(iP61, long65);
    tp2.IP iP67 = iPBan66.ip;
    tp2.IP iP68 = iPBan66.ip;
    java.lang.Integer i69 = iP68.getFourth();
    boolean b70 = singlyLinkedList50.remove(iP68);
    tp2.IP iP75 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i76 = iP75.getSecond();
    iP75.setFirst((java.lang.Integer)11001000);
    java.lang.Long long79 = null;
    tp2.IPBan iPBan80 = new tp2.IPBan(iP75, long79);
    tp2.IP iP81 = iPBan80.ip;
    tp2.IP iP82 = iPBan80.ip;
    tp2.IPBan iPBan84 = new tp2.IPBan(iP82, (java.lang.Long)10L);
    singlyLinkedList50.add(iP82);
    tp2.IP iP90 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i91 = iP90.getFourth();
    java.lang.Integer i92 = iP90.getThird();
    boolean b93 = singlyLinkedList50.contains(iP90);
    java.lang.Integer i94 = iP90.getThird();
    boolean b95 = singlyLinkedList26.remove(iP90);
    boolean b96 = iP23.equals((java.lang.Object)iP90);
    iP90.setFirst((java.lang.Integer)176016000);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iPBan16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i25 + "' != '" + 356246784+ "'", i25.equals(356246784));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i44 + "' != '" + 100+ "'", i44.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b47 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i51 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i52 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b54 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i62 + "' != '" + (-1)+ "'", i62.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP67);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP68);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i69 + "' != '" + 100+ "'", i69.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b70 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i76 + "' != '" + (-1)+ "'", i76.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP81);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP82);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i91 + "' != '" + 100+ "'", i91.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i92 + "' != '" + (-1)+ "'", i92.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b93 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i94 + "' != '" + (-1)+ "'", i94.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b95 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b96 == false);

  }

  @Test
  public void test248() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test248"); }


    int i2 = java.lang.Integer.rotateRight(103258851, 759185408);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 103258851);

  }

  @Test
  public void test249() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test249"); }


    java.lang.Integer i2 = java.lang.Integer.getInteger("32101000000", (java.lang.Integer)59);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i2 + "' != '" + 59+ "'", i2.equals(59));

  }

  @Test
  public void test250() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test250"); }


    int i1 = java.lang.Integer.numberOfLeadingZeros(150995348);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 4);

  }

  @Test
  public void test251() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test251"); }


    java.lang.Integer i1 = java.lang.Integer.valueOf(90);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 90+ "'", i1.equals(90));

  }

  @Test
  public void test252() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test252"); }


    java.lang.String str2 = java.lang.Integer.toUnsignedString(0, 89);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "0"+ "'", str2.equals("0"));

  }

  @Test
  public void test253() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test253"); }


    int i1 = java.lang.Integer.numberOfLeadingZeros(1778450432);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 1);

  }

  @Test
  public void test254() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test254"); }


    java.lang.Integer i1 = new java.lang.Integer((-620691456));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + (-620691456)+ "'", i1.equals((-620691456)));

  }

  @Test
  public void test255() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test255"); }


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
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList21 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b22 = strictlySortedSinglyLinkedList21.repOK();
    strictlySortedSinglyLinkedList21.size = 1;
    boolean b25 = strictlySortedSinglyLinkedList21.isEmpty();
    tp2.SinglyLinkedList singlyLinkedList26 = new tp2.SinglyLinkedList();
    int i27 = singlyLinkedList26.getSize();
    tp2.IP iP32 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i33 = iP32.getSecond();
    java.lang.Integer i34 = iP32.getFourth();
    singlyLinkedList26.add(iP32);
    boolean b37 = iP32.equals((java.lang.Object)2147483647);
    tp2.IPBan iPBan39 = new tp2.IPBan(iP32, (java.lang.Long)(-1L));
    java.lang.Long long40 = iPBan39.expires;
    boolean b41 = strictlySortedSinglyLinkedList21.contains(iPBan39);
    tp2.IP iP42 = iPBan39.ip;
    java.lang.Integer i43 = iP42.getSecond();
    java.lang.Integer i44 = iP42.getSecond();
    boolean b45 = singlyLinkedList0.remove(iP42);
    tp2.IP iP50 = new tp2.IP((java.lang.Integer)242, (java.lang.Integer)30, (java.lang.Integer)2, (java.lang.Integer)30);
    iP50.setFourth((java.lang.Integer)162);
    java.lang.Integer i53 = iP50.getSecond();
    singlyLinkedList0.add(iP50);
    tp2.SinglyLinkedList singlyLinkedList55 = new tp2.SinglyLinkedList();
    int i56 = singlyLinkedList55.getSize();
    tp2.IP iP61 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i62 = iP61.getSecond();
    java.lang.Integer i63 = iP61.getFourth();
    singlyLinkedList55.add(iP61);
    tp2.IPBan iPBan66 = new tp2.IPBan(iP61, (java.lang.Long)1L);
    java.lang.Integer i67 = iP61.getThird();
    iP61.setFourth((java.lang.Integer)160);
    java.lang.Integer i70 = iP61.getSecond();
    boolean b71 = singlyLinkedList0.contains(iP61);
    java.lang.Integer i72 = iP61.getFirst();
    
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
    org.junit.Assert.assertTrue(b22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i33 + "' != '" + (-1)+ "'", i33.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i34 + "' != '" + 100+ "'", i34.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long40 + "' != '" + (-1L)+ "'", long40.equals((-1L)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i43 + "' != '" + (-1)+ "'", i43.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i44 + "' != '" + (-1)+ "'", i44.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i53 + "' != '" + 30+ "'", i53.equals(30));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i56 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i62 + "' != '" + (-1)+ "'", i62.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i63 + "' != '" + 100+ "'", i63.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i67 + "' != '" + (-1)+ "'", i67.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i70 + "' != '" + (-1)+ "'", i70.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b71 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i72 + "' != '" + (-1)+ "'", i72.equals((-1)));

  }

  @Test
  public void test256() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test256"); }


    // The following exception was thrown during execution in test generation
    try {
      java.lang.Integer i1 = java.lang.Integer.valueOf("2ei");
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

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test257"); }


    tp2.SinglyLinkedList singlyLinkedList0 = new tp2.SinglyLinkedList();
    boolean b1 = singlyLinkedList0.repOK();
    tp2.IP iP3 = singlyLinkedList0.get(200);
    boolean b4 = singlyLinkedList0.isEmpty();
    boolean b5 = singlyLinkedList0.repOK();
    boolean b6 = singlyLinkedList0.repOK();
    tp2.IP iP11 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i12 = iP11.getThird();
    singlyLinkedList0.add(iP11);
    tp2.IP iP15 = singlyLinkedList0.get(5);
    tp2.SinglyLinkedList singlyLinkedList16 = new tp2.SinglyLinkedList();
    int i17 = singlyLinkedList16.getSize();
    tp2.IP iP22 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i23 = iP22.getSecond();
    java.lang.Integer i24 = iP22.getFourth();
    singlyLinkedList16.add(iP22);
    tp2.IPBan iPBan27 = new tp2.IPBan(iP22, (java.lang.Long)100L);
    iP22.setThird((java.lang.Integer)(-2147483641));
    boolean b30 = singlyLinkedList0.remove(iP22);
    tp2.SinglyLinkedList singlyLinkedList31 = new tp2.SinglyLinkedList();
    int i32 = singlyLinkedList31.getSize();
    int i33 = singlyLinkedList31.getSize();
    tp2.IP iP34 = null;
    boolean b35 = singlyLinkedList31.contains(iP34);
    tp2.IP iP37 = singlyLinkedList31.get(27);
    tp2.IP iP42 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i43 = iP42.getSecond();
    iP42.setFirst((java.lang.Integer)11001000);
    java.lang.Long long46 = null;
    tp2.IPBan iPBan47 = new tp2.IPBan(iP42, long46);
    tp2.IP iP48 = iPBan47.ip;
    tp2.IP iP49 = iPBan47.ip;
    java.lang.Integer i50 = iP49.getFourth();
    boolean b51 = singlyLinkedList31.remove(iP49);
    tp2.IP iP56 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i57 = iP56.getSecond();
    iP56.setFirst((java.lang.Integer)11001000);
    java.lang.Long long60 = null;
    tp2.IPBan iPBan61 = new tp2.IPBan(iP56, long60);
    tp2.IP iP62 = iPBan61.ip;
    tp2.IP iP63 = iPBan61.ip;
    tp2.IPBan iPBan65 = new tp2.IPBan(iP63, (java.lang.Long)10L);
    singlyLinkedList31.add(iP63);
    boolean b67 = singlyLinkedList0.remove(iP63);
    boolean b68 = singlyLinkedList0.isEmpty();
    tp2.IP iP70 = singlyLinkedList0.get(512);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList71 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b72 = strictlySortedSinglyLinkedList71.repOK();
    strictlySortedSinglyLinkedList71.size = 1;
    strictlySortedSinglyLinkedList71.size = 0;
    tp2.IP iP81 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i82 = iP81.getFourth();
    java.lang.Integer i83 = iP81.getFourth();
    iP81.setThird((java.lang.Integer)200);
    iP81.setThird((java.lang.Integer)356246787);
    boolean b88 = strictlySortedSinglyLinkedList71.containsIP(iP81);
    boolean b89 = singlyLinkedList0.remove(iP81);
    int i90 = singlyLinkedList0.getSize();
    boolean b91 = singlyLinkedList0.repOK();
    tp2.IP iP93 = singlyLinkedList0.get((-1062740994));
    tp2.IP iP95 = singlyLinkedList0.get(601526722);
    
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
    org.junit.Assert.assertTrue("'" + i12 + "' != '" + (-1)+ "'", i12.equals((-1)));
    
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
    org.junit.Assert.assertTrue(i32 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i43 + "' != '" + (-1)+ "'", i43.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i50 + "' != '" + 100+ "'", i50.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b51 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i57 + "' != '" + (-1)+ "'", i57.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP62);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP63);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b67 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b68 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP70);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b72 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i82 + "' != '" + 100+ "'", i82.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i83 + "' != '" + 100+ "'", i83.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b88 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b89 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i90 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b91 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP93);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP95);

  }

  @Test
  public void test258() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test258"); }


    int i1 = java.lang.Integer.signum((-1734966848));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == (-1));

  }

  @Test
  public void test259() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test259"); }


    int i2 = java.lang.Integer.max(0, 536870941);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 536870941);

  }

  @Test
  public void test260() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test260"); }


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
    boolean b30 = singlyLinkedList0.repOK();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList31 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b32 = strictlySortedSinglyLinkedList31.repOK();
    tp2.IP iP37 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i38 = iP37.getSecond();
    iP37.setFirst((java.lang.Integer)11001000);
    iP37.setFirst((java.lang.Integer)(-2147483648));
    boolean b43 = strictlySortedSinglyLinkedList31.removeFromIP(iP37);
    tp2.IPBan iPBan45 = strictlySortedSinglyLinkedList31.get((-1));
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList46 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b47 = strictlySortedSinglyLinkedList46.repOK();
    tp2.IP iP52 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i53 = iP52.getSecond();
    iP52.setFirst((java.lang.Integer)11001000);
    iP52.setFirst((java.lang.Integer)(-2147483648));
    boolean b58 = strictlySortedSinglyLinkedList46.removeFromIP(iP52);
    boolean b59 = strictlySortedSinglyLinkedList31.removeFromIP(iP52);
    boolean b60 = singlyLinkedList0.remove(iP52);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList61 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b62 = strictlySortedSinglyLinkedList61.repOK();
    tp2.IP iP67 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i68 = iP67.getSecond();
    iP67.setFirst((java.lang.Integer)11001000);
    iP67.setFirst((java.lang.Integer)(-2147483648));
    boolean b73 = strictlySortedSinglyLinkedList61.removeFromIP(iP67);
    java.lang.Integer i74 = iP67.getThird();
    tp2.IPBan iPBan76 = new tp2.IPBan(iP67, (java.lang.Long)96L);
    boolean b77 = singlyLinkedList0.contains(iP67);
    java.lang.Integer i78 = iP67.getFourth();
    
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
    org.junit.Assert.assertTrue(b30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i38 + "' != '" + (-1)+ "'", i38.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b43 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iPBan45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b47 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i53 + "' != '" + (-1)+ "'", i53.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b58 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b59 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b60 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b62 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i68 + "' != '" + (-1)+ "'", i68.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b73 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i74 + "' != '" + (-1)+ "'", i74.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b77 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i78 + "' != '" + 100+ "'", i78.equals(100));

  }

  @Test
  public void test261() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test261"); }


    int i2 = java.lang.Integer.max(11001001, 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 11001001);

  }

  @Test
  public void test262() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test262"); }


    int i2 = java.lang.Integer.rotateLeft(44, 469779399);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 5632);

  }

  @Test
  public void test263() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test263"); }


    int i2 = java.lang.Integer.remainderUnsigned(939524135, 20478);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 13973);

  }

  @Test
  public void test264() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test264"); }


    int i2 = java.lang.Integer.rotateLeft(1200000000, 130);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 505032705);

  }

  @Test
  public void test265() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test265"); }


    // The following exception was thrown during execution in test generation
    try {
      int i2 = java.lang.Integer.parseUnsignedInt("120000000", (-1073741606));
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

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test266"); }


    int i1 = java.lang.Integer.bitCount((-2020389248));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 13);

  }

  @Test
  public void test267() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test267"); }


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
    strictlySortedSinglyLinkedList0.size = 2013265928;
    int i40 = strictlySortedSinglyLinkedList0.getSize();
    tp2.IP iP45 = new tp2.IP((java.lang.Integer)5, (java.lang.Integer)10, (java.lang.Integer)31, (java.lang.Integer)32);
    java.lang.Object obj46 = null;
    boolean b47 = iP45.equals(obj46);
    tp2.IP iP52 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP52.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan56 = new tp2.IPBan(iP52, (java.lang.Long)100L);
    tp2.IP iP57 = iPBan56.ip;
    tp2.SinglyLinkedList singlyLinkedList58 = new tp2.SinglyLinkedList();
    int i59 = singlyLinkedList58.getSize();
    tp2.IP iP64 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i65 = iP64.getSecond();
    java.lang.Integer i66 = iP64.getFourth();
    singlyLinkedList58.add(iP64);
    boolean b68 = iP57.equals((java.lang.Object)iP64);
    boolean b69 = iP45.equals((java.lang.Object)iP64);
    boolean b70 = strictlySortedSinglyLinkedList0.removeFromIP(iP45);
    java.lang.Integer i71 = iP45.getSecond();
    
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
    org.junit.Assert.assertTrue(i40 == 2013265928);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b47 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i59 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i65 + "' != '" + (-1)+ "'", i65.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i66 + "' != '" + 100+ "'", i66.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b68 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b69 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b70 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i71 + "' != '" + 10+ "'", i71.equals(10));

  }

  @Test
  public void test268() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test268"); }


    // The following exception was thrown during execution in test generation
    try {
      int i2 = java.lang.Integer.parseUnsignedInt("300000340", 356246787);
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

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test269"); }


    int i1 = java.lang.Integer.numberOfLeadingZeros(11634);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 18);

  }

  @Test
  public void test270() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test270"); }


    int i2 = java.lang.Integer.compare(11001001, 1431647489);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == (-1));

  }

  @Test
  public void test271() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test271"); }


    // The following exception was thrown during execution in test generation
    try {
      int i2 = java.lang.Integer.parseInt("f8f1efa0", 1074135041);
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

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test272"); }


    int i2 = java.lang.Integer.compareUnsigned(666446313, (-16777405));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == (-1));

  }

  @Test
  public void test273() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test273"); }


    java.lang.String str1 = java.lang.Integer.toUnsignedString(12319);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "12319"+ "'", str1.equals("12319"));

  }

  @Test
  public void test274() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test274"); }


    int i2 = java.lang.Integer.compare(11001001, 1073741849);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == (-1));

  }

  @Test
  public void test275() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test275"); }


    java.lang.Integer i2 = java.lang.Integer.getInteger("1700", (java.lang.Integer)(-2013265920));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i2 + "' != '" + (-2013265920)+ "'", i2.equals((-2013265920)));

  }

  @Test
  public void test276() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test276"); }


    java.lang.Integer i1 = java.lang.Integer.valueOf(6936034);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 6936034+ "'", i1.equals(6936034));

  }

  @Test
  public void test277() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test277"); }


    tp2.SinglyLinkedList singlyLinkedList0 = new tp2.SinglyLinkedList();
    int i1 = singlyLinkedList0.getSize();
    int i2 = singlyLinkedList0.getSize();
    tp2.IP iP3 = null;
    boolean b4 = singlyLinkedList0.contains(iP3);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList5 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b6 = strictlySortedSinglyLinkedList5.repOK();
    tp2.IP iP11 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    boolean b12 = strictlySortedSinglyLinkedList5.containsIP(iP11);
    int i13 = strictlySortedSinglyLinkedList5.getSize();
    tp2.SinglyLinkedList singlyLinkedList14 = new tp2.SinglyLinkedList();
    int i15 = singlyLinkedList14.getSize();
    tp2.IP iP20 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i21 = iP20.getSecond();
    java.lang.Integer i22 = iP20.getFourth();
    singlyLinkedList14.add(iP20);
    tp2.IPBan iPBan25 = new tp2.IPBan(iP20, (java.lang.Long)100L);
    iPBan25.expires = 10L;
    tp2.IP iP28 = iPBan25.getIp();
    iPBan25.expires = 0L;
    java.lang.Long long31 = iPBan25.expires;
    boolean b32 = strictlySortedSinglyLinkedList5.add(iPBan25);
    int i33 = strictlySortedSinglyLinkedList5.getSize();
    tp2.Node node34 = strictlySortedSinglyLinkedList5.header;
    tp2.SinglyLinkedList singlyLinkedList35 = new tp2.SinglyLinkedList();
    boolean b36 = singlyLinkedList35.repOK();
    tp2.IP iP38 = singlyLinkedList35.get(200);
    boolean b39 = singlyLinkedList35.isEmpty();
    boolean b40 = singlyLinkedList35.repOK();
    boolean b41 = singlyLinkedList35.repOK();
    tp2.IP iP46 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i47 = iP46.getThird();
    singlyLinkedList35.add(iP46);
    tp2.IP iP50 = singlyLinkedList35.get(5);
    tp2.SinglyLinkedList singlyLinkedList51 = new tp2.SinglyLinkedList();
    int i52 = singlyLinkedList51.getSize();
    tp2.IP iP57 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i58 = iP57.getSecond();
    java.lang.Integer i59 = iP57.getFourth();
    singlyLinkedList51.add(iP57);
    tp2.IPBan iPBan62 = new tp2.IPBan(iP57, (java.lang.Long)100L);
    iP57.setThird((java.lang.Integer)(-2147483641));
    boolean b65 = singlyLinkedList35.remove(iP57);
    tp2.IP iP70 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP70.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan74 = new tp2.IPBan(iP70, (java.lang.Long)100L);
    tp2.IP iP75 = iPBan74.ip;
    tp2.IP iP80 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i81 = iP80.getFourth();
    java.lang.Integer i82 = iP80.getFourth();
    iP80.setThird((java.lang.Integer)200);
    iPBan74.ip = iP80;
    iP80.setFirst((java.lang.Integer)16777216);
    iP80.setThird((java.lang.Integer)(-2));
    boolean b90 = singlyLinkedList35.remove(iP80);
    boolean b91 = strictlySortedSinglyLinkedList5.containsIP(iP80);
    java.lang.Integer i92 = iP80.getThird();
    boolean b93 = singlyLinkedList0.remove(iP80);
    iP80.setThird((java.lang.Integer)96);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i21 + "' != '" + (-1)+ "'", i21.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i22 + "' != '" + 100+ "'", i22.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long31 + "' != '" + 0L+ "'", long31.equals(0L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i47 + "' != '" + (-1)+ "'", i47.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i52 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i58 + "' != '" + (-1)+ "'", i58.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i59 + "' != '" + 100+ "'", i59.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b65 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP75);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i81 + "' != '" + 100+ "'", i81.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i82 + "' != '" + 100+ "'", i82.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b90 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b91 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i92 + "' != '" + (-2)+ "'", i92.equals((-2)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b93 == false);

  }

  @Test
  public void test278() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test278"); }


    tp2.IP iP4 = new tp2.IP((java.lang.Integer)15204352, (java.lang.Integer)1, (java.lang.Integer)15204352, (java.lang.Integer)356246787);
    tp2.SinglyLinkedList singlyLinkedList5 = new tp2.SinglyLinkedList();
    int i6 = singlyLinkedList5.getSize();
    int i7 = singlyLinkedList5.getSize();
    boolean b8 = iP4.equals((java.lang.Object)singlyLinkedList5);
    tp2.IP iP13 = new tp2.IP((java.lang.Integer)(-619332132), (java.lang.Integer)96, (java.lang.Integer)268435500, (java.lang.Integer)2147483647);
    boolean b14 = singlyLinkedList5.remove(iP13);
    boolean b15 = singlyLinkedList5.repOK();
    boolean b16 = singlyLinkedList5.repOK();
    tp2.IP iP18 = singlyLinkedList5.get(805306369);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP18);

  }

  @Test
  public void test279() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test279"); }


    java.lang.String str2 = java.lang.Integer.toUnsignedString((-1441486166), 30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "3rcoehk"+ "'", str2.equals("3rcoehk"));

  }

  @Test
  public void test280() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test280"); }


    int i1 = java.lang.Integer.reverse(734806016);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 144340);

  }

  @Test
  public void test281() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test281"); }


    java.lang.String str2 = java.lang.Integer.toUnsignedString(52129309, (-257396566));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "52129309"+ "'", str2.equals("52129309"));

  }

  @Test
  public void test282() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test282"); }


    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList0 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b1 = strictlySortedSinglyLinkedList0.repOK();
    tp2.IP iP6 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i7 = iP6.getSecond();
    iP6.setFirst((java.lang.Integer)11001000);
    iP6.setFirst((java.lang.Integer)(-2147483648));
    boolean b12 = strictlySortedSinglyLinkedList0.removeFromIP(iP6);
    tp2.IPBan iPBan14 = new tp2.IPBan(iP6, (java.lang.Long)0L);
    boolean b16 = iP6.equals((java.lang.Object)'#');
    java.lang.Integer i17 = iP6.getFourth();
    java.lang.Integer i18 = iP6.getThird();
    java.lang.Integer i19 = iP6.getSecond();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i7 + "' != '" + (-1)+ "'", i7.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i17 + "' != '" + 100+ "'", i17.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i18 + "' != '" + (-1)+ "'", i18.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i19 + "' != '" + (-1)+ "'", i19.equals((-1)));

  }

  @Test
  public void test283() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test283"); }


    int i2 = java.lang.Integer.compare(524420645, 5888);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);

  }

  @Test
  public void test284() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test284"); }


    java.lang.Integer i2 = java.lang.Integer.getInteger("93754428", (-327155712));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i2 + "' != '" + (-327155712)+ "'", i2.equals((-327155712)));

  }

  @Test
  public void test285() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test285"); }


    // The following exception was thrown during execution in test generation
    try {
      int i2 = java.lang.Integer.parseUnsignedInt("b000000", 373002);
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test286() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test286"); }


    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList0 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b1 = strictlySortedSinglyLinkedList0.repOK();
    tp2.IP iP6 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    boolean b7 = strictlySortedSinglyLinkedList0.containsIP(iP6);
    int i8 = strictlySortedSinglyLinkedList0.getSize();
    tp2.SinglyLinkedList singlyLinkedList9 = new tp2.SinglyLinkedList();
    int i10 = singlyLinkedList9.getSize();
    tp2.IP iP15 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i16 = iP15.getSecond();
    java.lang.Integer i17 = iP15.getFourth();
    singlyLinkedList9.add(iP15);
    tp2.IPBan iPBan20 = new tp2.IPBan(iP15, (java.lang.Long)100L);
    iPBan20.expires = 10L;
    tp2.IP iP23 = iPBan20.getIp();
    iPBan20.expires = 0L;
    java.lang.Long long26 = iPBan20.expires;
    boolean b27 = strictlySortedSinglyLinkedList0.add(iPBan20);
    tp2.IP iP32 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP32.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan36 = new tp2.IPBan(iP32, (java.lang.Long)100L);
    tp2.IP iP37 = iPBan36.ip;
    tp2.IP iP42 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP42.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan46 = new tp2.IPBan(iP42, (java.lang.Long)100L);
    iPBan36.setIp(iP42);
    tp2.IPBan iPBan49 = new tp2.IPBan(iP42, (java.lang.Long)(-1L));
    iPBan20.ip = iP42;
    tp2.IP iP51 = iPBan20.getIp();
    tp2.IP iP52 = iPBan20.getIp();
    tp2.IP iP53 = iPBan20.getIp();
    tp2.IP iP54 = iPBan20.ip;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i16 + "' != '" + (-1)+ "'", i16.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i17 + "' != '" + 100+ "'", i17.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L+ "'", long26.equals(0L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP54);

  }

  @Test
  public void test287() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test287"); }


    long long1 = java.lang.Integer.toUnsignedLong(624000);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == 624000L);

  }

  @Test
  public void test288() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test288"); }


    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList0 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IPBan iPBan1 = null;
    boolean b2 = strictlySortedSinglyLinkedList0.add(iPBan1);
    int i3 = strictlySortedSinglyLinkedList0.getSize();
    tp2.Node node4 = strictlySortedSinglyLinkedList0.header;
    int i5 = strictlySortedSinglyLinkedList0.getSize();
    tp2.Node node6 = strictlySortedSinglyLinkedList0.header;
    tp2.SinglyLinkedList singlyLinkedList7 = new tp2.SinglyLinkedList();
    int i8 = singlyLinkedList7.getSize();
    tp2.IP iP13 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i14 = iP13.getSecond();
    java.lang.Integer i15 = iP13.getFourth();
    singlyLinkedList7.add(iP13);
    tp2.IP iP18 = singlyLinkedList7.get(5);
    boolean b19 = singlyLinkedList7.repOK();
    tp2.IP iP21 = singlyLinkedList7.get(2013265920);
    tp2.IP iP23 = singlyLinkedList7.get((-1));
    java.lang.Integer i24 = iP23.getThird();
    java.lang.Integer i25 = iP23.getFourth();
    // The following exception was thrown during execution in test generation
    try {
      boolean b26 = strictlySortedSinglyLinkedList0.removeFromIP(iP23);
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
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i14 + "' != '" + (-1)+ "'", i14.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i15 + "' != '" + 100+ "'", i15.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i24 + "' != '" + (-1)+ "'", i24.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i25 + "' != '" + 100+ "'", i25.equals(100));

  }

  @Test
  public void test289() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test289"); }


    // The following exception was thrown during execution in test generation
    try {
      java.lang.Integer i1 = java.lang.Integer.decode("1000000000000000000000000101101");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test290() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test290"); }


    // The following exception was thrown during execution in test generation
    try {
      java.lang.Integer i1 = java.lang.Integer.valueOf("1000111001010011110011110000");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test291() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test291"); }


    int i1 = java.lang.Integer.lowestOneBit(50331872);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 32);

  }

  @Test
  public void test292() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test292"); }


    java.lang.String str1 = java.lang.Integer.toBinaryString(12319);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "11000000011111"+ "'", str1.equals("11000000011111"));

  }

  @Test
  public void test293() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test293"); }


    int i2 = java.lang.Integer.compare(744529281, 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);

  }

  @Test
  public void test294() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test294"); }


    long long1 = java.lang.Integer.toUnsignedLong((-1073741822));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == 3221225474L);

  }

  @Test
  public void test295() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test295"); }


    int i2 = java.lang.Integer.compare(346729220, 1200000000);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == (-1));

  }

  @Test
  public void test296() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test296"); }


    java.lang.String str1 = java.lang.Integer.toHexString(601526722);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "23da91c2"+ "'", str1.equals("23da91c2"));

  }

  @Test
  public void test297() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test297"); }


    int i1 = java.lang.Integer.signum(310);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 1);

  }

  @Test
  public void test298() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test298"); }


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
    tp2.IP iP28 = new tp2.IP((java.lang.Integer)128514, (java.lang.Integer)(-2147483648), (java.lang.Integer)2157841, (java.lang.Integer)32);
    iPBan22.ip = iP28;
    tp2.IP iP30 = iPBan22.getIp();
    java.lang.Integer i31 = iP30.getFirst();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i18 + "' != '" + 100+ "'", i18.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long23 + "' != '" + 5L+ "'", long23.equals(5L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i31 + "' != '" + 128514+ "'", i31.equals(128514));

  }

  @Test
  public void test299() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test299"); }


    java.lang.String str1 = java.lang.Integer.toBinaryString(324321317);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "10011010101001100000000100101"+ "'", str1.equals("10011010101001100000000100101"));

  }

  @Test
  public void test300() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test300"); }


    // The following exception was thrown during execution in test generation
    try {
      java.lang.Integer i1 = new java.lang.Integer("1011100000000000000000");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test301() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test301"); }


    int i2 = java.lang.Integer.remainderUnsigned(2127069002, (-1062740994));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 2127069002);

  }

  @Test
  public void test302() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test302"); }


    int i2 = java.lang.Integer.sum(89, 11100000);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 11100089);

  }

  @Test
  public void test303() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test303"); }


    int i1 = java.lang.Integer.numberOfTrailingZeros(1275330560);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 18);

  }

  @Test
  public void test304() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test304"); }


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
    tp2.IP iP50 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP50.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan54 = new tp2.IPBan(iP50, (java.lang.Long)100L);
    iPBan44.setIp(iP50);
    java.lang.Long long56 = iPBan44.getExpires();
    tp2.IP iP57 = iPBan44.ip;
    boolean b58 = strictlySortedSinglyLinkedList0.containsIP(iP57);
    tp2.IPBan iPBan60 = new tp2.IPBan(iP57, (java.lang.Long)20L);
    java.lang.Long long61 = iPBan60.getExpires();
    tp2.IP iP62 = iPBan60.ip;
    
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
    org.junit.Assert.assertTrue("'" + long56 + "' != '" + 100L+ "'", long56.equals(100L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b58 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long61 + "' != '" + 20L+ "'", long61.equals(20L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP62);

  }

  @Test
  public void test305() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test305"); }


    java.lang.Integer i2 = java.lang.Integer.getInteger("83886080", (java.lang.Integer)2088174752);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i2 + "' != '" + 2088174752+ "'", i2.equals(2088174752));

  }

  @Test
  public void test306() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test306"); }


    java.lang.Integer i2 = java.lang.Integer.getInteger("2a8bjhh", 2013265920);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i2 + "' != '" + 2013265920+ "'", i2.equals(2013265920));

  }

  @Test
  public void test307() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test307"); }


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
    tp2.IP iP38 = iPBan26.ip;
    tp2.IP iP39 = iPBan26.ip;
    tp2.IP iP44 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i45 = iP44.getSecond();
    java.lang.Integer i46 = iP44.getFourth();
    iP44.setFirst((java.lang.Integer)5);
    tp2.IPBan iPBan50 = new tp2.IPBan(iP44, (java.lang.Long)0L);
    iPBan50.expires = 2147483648L;
    iPBan50.expires = 2013265920L;
    boolean b55 = iP39.equals((java.lang.Object)iPBan50);
    tp2.IP iP60 = new tp2.IP((java.lang.Integer)50331872, (java.lang.Integer)30, (java.lang.Integer)51920186, (java.lang.Integer)23);
    iPBan50.setIp(iP60);
    iPBan50.setExpires((java.lang.Long)32L);
    iPBan50.setExpires((java.lang.Long)16762403L);
    
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
    org.junit.Assert.assertNotNull(iP38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i45 + "' != '" + (-1)+ "'", i45.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i46 + "' != '" + 100+ "'", i46.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b55 == false);

  }

  @Test
  public void test308() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test308"); }


    int i1 = java.lang.Integer.reverseBytes((-715693564));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 73553877);

  }

  @Test
  public void test309() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test309"); }


    tp2.SinglyLinkedList singlyLinkedList0 = new tp2.SinglyLinkedList();
    int i1 = singlyLinkedList0.getSize();
    tp2.IP iP6 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i7 = iP6.getSecond();
    java.lang.Integer i8 = iP6.getFourth();
    singlyLinkedList0.add(iP6);
    tp2.IPBan iPBan11 = new tp2.IPBan(iP6, (java.lang.Long)1L);
    java.lang.Integer i12 = iP6.getThird();
    java.lang.Integer i13 = iP6.getFourth();
    java.lang.Integer i14 = iP6.getSecond();
    iP6.setThird((java.lang.Integer)(-1062740824));
    java.lang.Integer i17 = iP6.getFourth();
    java.lang.Integer i18 = iP6.getFirst();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i7 + "' != '" + (-1)+ "'", i7.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i8 + "' != '" + 100+ "'", i8.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i12 + "' != '" + (-1)+ "'", i12.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i13 + "' != '" + 100+ "'", i13.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i14 + "' != '" + (-1)+ "'", i14.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i17 + "' != '" + 100+ "'", i17.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i18 + "' != '" + (-1)+ "'", i18.equals((-1)));

  }

  @Test
  public void test310() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test310"); }


    java.lang.String str2 = java.lang.Integer.toUnsignedString(46032486, 33554794);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "46032486"+ "'", str2.equals("46032486"));

  }

  @Test
  public void test311() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test311"); }


    int i2 = java.lang.Integer.rotateLeft(655296, 51756250);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 10239);

  }

  @Test
  public void test312() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test312"); }


    int i1 = java.lang.Integer.highestOneBit((-1021985471));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == (-2147483648));

  }

  @Test
  public void test313() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test313"); }


    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList0 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b1 = strictlySortedSinglyLinkedList0.repOK();
    tp2.IP iP6 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    boolean b7 = strictlySortedSinglyLinkedList0.containsIP(iP6);
    tp2.Node node8 = strictlySortedSinglyLinkedList0.header;
    boolean b9 = strictlySortedSinglyLinkedList0.isEmpty();
    int i10 = strictlySortedSinglyLinkedList0.getSize();
    tp2.IPBan iPBan12 = strictlySortedSinglyLinkedList0.get(1308183544);
    boolean b13 = strictlySortedSinglyLinkedList0.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iPBan12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);

  }

  @Test
  public void test314() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test314"); }


    int i2 = java.lang.Integer.divideUnsigned(11110010, 23442);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 473);

  }

  @Test
  public void test315() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test315"); }


    java.lang.Integer i2 = java.lang.Integer.getInteger("", (java.lang.Integer)285409280);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i2 + "' != '" + 285409280+ "'", i2.equals(285409280));

  }

  @Test
  public void test316() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test316"); }


    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList0 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b1 = strictlySortedSinglyLinkedList0.repOK();
    strictlySortedSinglyLinkedList0.size = 1;
    strictlySortedSinglyLinkedList0.size = 0;
    tp2.IPBan iPBan6 = null;
    boolean b7 = strictlySortedSinglyLinkedList0.add(iPBan6);
    int i8 = strictlySortedSinglyLinkedList0.getSize();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList9 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b10 = strictlySortedSinglyLinkedList9.repOK();
    tp2.IP iP15 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    boolean b16 = strictlySortedSinglyLinkedList9.containsIP(iP15);
    tp2.Node node17 = strictlySortedSinglyLinkedList9.header;
    boolean b18 = strictlySortedSinglyLinkedList9.isEmpty();
    int i19 = strictlySortedSinglyLinkedList9.getSize();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList20 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b21 = strictlySortedSinglyLinkedList20.repOK();
    tp2.IP iP26 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i27 = iP26.getSecond();
    iP26.setFirst((java.lang.Integer)11001000);
    iP26.setFirst((java.lang.Integer)(-2147483648));
    boolean b32 = strictlySortedSinglyLinkedList20.removeFromIP(iP26);
    tp2.Node node33 = strictlySortedSinglyLinkedList20.header;
    strictlySortedSinglyLinkedList9.header = node33;
    strictlySortedSinglyLinkedList0.header = node33;
    tp2.IP iP40 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i41 = iP40.getSecond();
    iP40.setFirst((java.lang.Integer)11001000);
    java.lang.Long long44 = null;
    tp2.IPBan iPBan45 = new tp2.IPBan(iP40, long44);
    tp2.IP iP46 = iPBan45.ip;
    tp2.IP iP47 = iPBan45.ip;
    tp2.IP iP48 = iPBan45.getIp();
    iPBan45.setExpires((java.lang.Long)29L);
    boolean b51 = strictlySortedSinglyLinkedList0.add(iPBan45);
    iPBan45.setExpires((java.lang.Long)75809L);
    tp2.SinglyLinkedList singlyLinkedList54 = new tp2.SinglyLinkedList();
    int i55 = singlyLinkedList54.getSize();
    tp2.IP iP60 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i61 = iP60.getSecond();
    java.lang.Integer i62 = iP60.getFourth();
    singlyLinkedList54.add(iP60);
    tp2.IPBan iPBan65 = new tp2.IPBan(iP60, (java.lang.Long)100L);
    iPBan65.expires = 10L;
    tp2.IP iP68 = iPBan65.getIp();
    iPBan45.setIp(iP68);
    iPBan45.setExpires((java.lang.Long)100110111L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i27 + "' != '" + (-1)+ "'", i27.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i41 + "' != '" + (-1)+ "'", i41.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b51 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i55 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i61 + "' != '" + (-1)+ "'", i61.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i62 + "' != '" + 100+ "'", i62.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP68);

  }

  @Test
  public void test317() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test317"); }


    java.lang.Integer i2 = java.lang.Integer.getInteger("22", (-1060148736));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i2 + "' != '" + (-1060148736)+ "'", i2.equals((-1060148736)));

  }

  @Test
  public void test318() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test318"); }


    java.lang.Integer i1 = java.lang.Integer.valueOf(200064);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 200064+ "'", i1.equals(200064));

  }

  @Test
  public void test319() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test319"); }


    int i1 = java.lang.Integer.reverse((-1694498809));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == (-536870695));

  }

  @Test
  public void test320() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test320"); }


    java.lang.Integer i1 = new java.lang.Integer("385");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 385+ "'", i1.equals(385));

  }

  @Test
  public void test321() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test321"); }


    java.lang.Integer i1 = new java.lang.Integer((-1073741824));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + (-1073741824)+ "'", i1.equals((-1073741824)));

  }

  @Test
  public void test322() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test322"); }


    // The following exception was thrown during execution in test generation
    try {
      java.lang.Integer i1 = new java.lang.Integer("fffffffe");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test323() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test323"); }


    // The following exception was thrown during execution in test generation
    try {
      java.lang.Integer i1 = new java.lang.Integer("3227260160");
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

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test324"); }


    int i2 = java.lang.Integer.sum(37, (-1530789848));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == (-1530789811));

  }

  @Test
  public void test325() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test325"); }


    long long1 = java.lang.Integer.toUnsignedLong(28673);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == 28673L);

  }

  @Test
  public void test326() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test326"); }


    int i2 = java.lang.Integer.rotateLeft(156001, 128);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 156001);

  }

  @Test
  public void test327() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test327"); }


    java.lang.Integer i2 = java.lang.Integer.getInteger("32768", (java.lang.Integer)37469777);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i2 + "' != '" + 37469777+ "'", i2.equals(37469777));

  }

  @Test
  public void test328() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test328"); }


    java.lang.String str1 = java.lang.Integer.toHexString(134217728);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "8000000"+ "'", str1.equals("8000000"));

  }

  @Test
  public void test329() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test329"); }


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
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList40 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b41 = strictlySortedSinglyLinkedList40.repOK();
    strictlySortedSinglyLinkedList40.size = 1;
    boolean b44 = strictlySortedSinglyLinkedList40.isEmpty();
    tp2.SinglyLinkedList singlyLinkedList45 = new tp2.SinglyLinkedList();
    int i46 = singlyLinkedList45.getSize();
    tp2.IP iP51 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i52 = iP51.getSecond();
    java.lang.Integer i53 = iP51.getFourth();
    singlyLinkedList45.add(iP51);
    boolean b56 = iP51.equals((java.lang.Object)2147483647);
    tp2.IPBan iPBan58 = new tp2.IPBan(iP51, (java.lang.Long)(-1L));
    java.lang.Long long59 = iPBan58.expires;
    boolean b60 = strictlySortedSinglyLinkedList40.contains(iPBan58);
    tp2.IP iP61 = iPBan58.ip;
    iPBan58.setExpires((java.lang.Long)(-1L));
    boolean b64 = strictlySortedSinglyLinkedList0.contains(iPBan58);
    iPBan58.setExpires((java.lang.Long)167772160L);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList67 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b68 = strictlySortedSinglyLinkedList67.repOK();
    strictlySortedSinglyLinkedList67.size = 1;
    strictlySortedSinglyLinkedList67.size = 0;
    tp2.IP iP77 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i78 = iP77.getSecond();
    java.lang.Integer i79 = iP77.getFourth();
    boolean b80 = strictlySortedSinglyLinkedList67.containsIP(iP77);
    iP77.setSecond((java.lang.Integer)16777216);
    iPBan58.ip = iP77;
    iP77.setFourth((java.lang.Integer)(-811446013));
    
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
    org.junit.Assert.assertTrue(b44 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i46 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i52 + "' != '" + (-1)+ "'", i52.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i53 + "' != '" + 100+ "'", i53.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b56 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long59 + "' != '" + (-1L)+ "'", long59.equals((-1L)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b60 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP61);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b64 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b68 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i78 + "' != '" + (-1)+ "'", i78.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i79 + "' != '" + 100+ "'", i79.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b80 == false);

  }

  @Test
  public void test330() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test330"); }


    int i1 = java.lang.Integer.parseInt("1011110");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 1011110);

  }

  @Test
  public void test331() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test331"); }


    int i2 = java.lang.Integer.min((-669283115), 469910471);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == (-669283115));

  }

  @Test
  public void test332() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test332"); }


    tp2.SinglyLinkedList singlyLinkedList0 = new tp2.SinglyLinkedList();
    boolean b1 = singlyLinkedList0.repOK();
    tp2.IP iP3 = singlyLinkedList0.get(200);
    boolean b4 = singlyLinkedList0.isEmpty();
    boolean b5 = singlyLinkedList0.repOK();
    boolean b6 = singlyLinkedList0.repOK();
    tp2.IP iP11 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i12 = iP11.getThird();
    singlyLinkedList0.add(iP11);
    int i14 = singlyLinkedList0.getSize();
    tp2.SinglyLinkedList singlyLinkedList15 = new tp2.SinglyLinkedList();
    int i16 = singlyLinkedList15.getSize();
    tp2.IP iP21 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i22 = iP21.getSecond();
    java.lang.Integer i23 = iP21.getFourth();
    singlyLinkedList15.add(iP21);
    java.lang.Integer i25 = iP21.getFourth();
    boolean b26 = singlyLinkedList0.contains(iP21);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList27 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b28 = strictlySortedSinglyLinkedList27.repOK();
    tp2.IP iP33 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i34 = iP33.getSecond();
    iP33.setFirst((java.lang.Integer)11001000);
    iP33.setFirst((java.lang.Integer)(-2147483648));
    boolean b39 = strictlySortedSinglyLinkedList27.removeFromIP(iP33);
    tp2.Node node40 = strictlySortedSinglyLinkedList27.header;
    tp2.IP iP41 = null;
    boolean b42 = strictlySortedSinglyLinkedList27.containsIP(iP41);
    tp2.IP iP47 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP47.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan51 = new tp2.IPBan(iP47, (java.lang.Long)100L);
    tp2.IP iP52 = iPBan51.ip;
    tp2.IP iP57 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP57.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan61 = new tp2.IPBan(iP57, (java.lang.Long)100L);
    iPBan51.setIp(iP57);
    iPBan51.expires = 2013265920L;
    tp2.IP iP65 = iPBan51.ip;
    boolean b66 = strictlySortedSinglyLinkedList27.containsIP(iP65);
    singlyLinkedList0.add(iP65);
    iP65.setThird((java.lang.Integer)969408512);
    
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
    org.junit.Assert.assertTrue("'" + i12 + "' != '" + (-1)+ "'", i12.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i22 + "' != '" + (-1)+ "'", i22.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i23 + "' != '" + 100+ "'", i23.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i25 + "' != '" + 100+ "'", i25.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i34 + "' != '" + (-1)+ "'", i34.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP65);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b66 == false);

  }

  @Test
  public void test333() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test333"); }


    java.lang.Integer i2 = java.lang.Integer.getInteger("1c71503", (java.lang.Integer)553648146);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i2 + "' != '" + 553648146+ "'", i2.equals(553648146));

  }

  @Test
  public void test334() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test334"); }


    int i2 = java.lang.Integer.sum(356246787, 26476544);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 382723331);

  }

  @Test
  public void test335() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test335"); }


    // The following exception was thrown during execution in test generation
    try {
      int i2 = java.lang.Integer.parseInt("2146566144", 8389120);
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test336() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test336"); }


    java.lang.String str1 = java.lang.Integer.toBinaryString(58);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "111010"+ "'", str1.equals("111010"));

  }

  @Test
  public void test337() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test337"); }


    tp2.SinglyLinkedList singlyLinkedList0 = new tp2.SinglyLinkedList();
    int i1 = singlyLinkedList0.getSize();
    int i2 = singlyLinkedList0.getSize();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList3 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b4 = strictlySortedSinglyLinkedList3.repOK();
    strictlySortedSinglyLinkedList3.size = 1;
    strictlySortedSinglyLinkedList3.size = 0;
    tp2.IP iP13 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP13.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan17 = new tp2.IPBan(iP13, (java.lang.Long)100L);
    tp2.IP iP22 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP22.setFirst((java.lang.Integer)200);
    java.lang.Integer i25 = iP22.getFourth();
    iPBan17.setIp(iP22);
    boolean b27 = strictlySortedSinglyLinkedList3.contains(iPBan17);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList28 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList29 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b30 = strictlySortedSinglyLinkedList29.repOK();
    strictlySortedSinglyLinkedList29.size = 1;
    strictlySortedSinglyLinkedList29.size = 0;
    tp2.IP iP39 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP39.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan43 = new tp2.IPBan(iP39, (java.lang.Long)100L);
    tp2.IP iP44 = iPBan43.ip;
    boolean b45 = strictlySortedSinglyLinkedList29.contains(iPBan43);
    boolean b46 = strictlySortedSinglyLinkedList29.repOK();
    tp2.SinglyLinkedList singlyLinkedList47 = new tp2.SinglyLinkedList();
    int i48 = singlyLinkedList47.getSize();
    tp2.IP iP53 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i54 = iP53.getSecond();
    java.lang.Integer i55 = iP53.getFourth();
    singlyLinkedList47.add(iP53);
    boolean b58 = iP53.equals((java.lang.Object)2147483647);
    tp2.IPBan iPBan60 = new tp2.IPBan(iP53, (java.lang.Long)(-1L));
    boolean b61 = strictlySortedSinglyLinkedList29.add(iPBan60);
    boolean b62 = strictlySortedSinglyLinkedList28.add(iPBan60);
    tp2.IP iP63 = iPBan60.getIp();
    boolean b64 = strictlySortedSinglyLinkedList3.contains(iPBan60);
    tp2.IP iP69 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP69.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan73 = new tp2.IPBan(iP69, (java.lang.Long)100L);
    tp2.IP iP74 = iPBan73.ip;
    tp2.IP iP79 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP79.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan83 = new tp2.IPBan(iP79, (java.lang.Long)100L);
    iPBan73.setIp(iP79);
    tp2.IPBan iPBan86 = new tp2.IPBan(iP79, (java.lang.Long)(-1L));
    iP79.setFirst((java.lang.Integer)242);
    java.lang.Integer i89 = iP79.getSecond();
    java.lang.Integer i90 = iP79.getFourth();
    java.lang.Integer i91 = iP79.getFourth();
    iPBan60.setIp(iP79);
    boolean b93 = singlyLinkedList0.remove(iP79);
    boolean b94 = singlyLinkedList0.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i25 + "' != '" + 100+ "'", i25.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b46 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i48 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i54 + "' != '" + (-1)+ "'", i54.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i55 + "' != '" + 100+ "'", i55.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b58 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b61 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b62 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP63);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b64 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP74);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i89 + "' != '" + (-1)+ "'", i89.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i90 + "' != '" + 100+ "'", i90.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i91 + "' != '" + 100+ "'", i91.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b93 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b94 == true);

  }

  @Test
  public void test338() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test338"); }


    java.lang.Integer i1 = java.lang.Integer.getInteger("10011010101001100000000100101");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);

  }

  @Test
  public void test339() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test339"); }


    java.lang.Integer i1 = java.lang.Integer.getInteger("13400000");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);

  }

  @Test
  public void test340() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test340"); }


    int i2 = java.lang.Integer.max(920903680, 372963);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 920903680);

  }

  @Test
  public void test341() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test341"); }


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
    boolean b17 = strictlySortedSinglyLinkedList0.isEmpty();
    int i18 = strictlySortedSinglyLinkedList0.getSize();
    int i19 = strictlySortedSinglyLinkedList0.size;
    tp2.IPBan iPBan21 = strictlySortedSinglyLinkedList0.get(1694498816);
    
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
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iPBan21);

  }

  @Test
  public void test342() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test342"); }


    // The following exception was thrown during execution in test generation
    try {
      int i2 = java.lang.Integer.parseUnsignedInt("1027604515", 52907904);
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test343() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test343"); }


    java.lang.String str2 = java.lang.Integer.toUnsignedString((-1), 13349429);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4294967295"+ "'", str2.equals("4294967295"));

  }

  @Test
  public void test344() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test344"); }


    java.lang.String str2 = java.lang.Integer.toUnsignedString(1908126, 8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "7216636"+ "'", str2.equals("7216636"));

  }

  @Test
  public void test345() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test345"); }


    int i2 = java.lang.Integer.sum(1706474384, (-2130634389));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == (-424160005));

  }

  @Test
  public void test346() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test346"); }


    int i2 = java.lang.Integer.min((-530954688), 133349376);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == (-530954688));

  }

  @Test
  public void test347() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test347"); }


    int i1 = java.lang.Integer.bitCount((-1516277088));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 16);

  }

  @Test
  public void test348() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test348"); }


    tp2.IP iP4 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i5 = iP4.getSecond();
    iP4.setFirst((java.lang.Integer)11001000);
    java.lang.Long long8 = null;
    tp2.IPBan iPBan9 = new tp2.IPBan(iP4, long8);
    java.lang.Long long10 = iPBan9.getExpires();
    tp2.SinglyLinkedList singlyLinkedList11 = new tp2.SinglyLinkedList();
    boolean b12 = singlyLinkedList11.repOK();
    tp2.IP iP17 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP17.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan21 = new tp2.IPBan(iP17, (java.lang.Long)100L);
    tp2.IP iP26 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP26.setFirst((java.lang.Integer)200);
    java.lang.Integer i29 = iP26.getFourth();
    iPBan21.setIp(iP26);
    singlyLinkedList11.add(iP26);
    iPBan9.setIp(iP26);
    java.lang.Long long33 = iPBan9.getExpires();
    iPBan9.setExpires((java.lang.Long)51756492L);
    tp2.IP iP40 = new tp2.IP((java.lang.Integer)160, (java.lang.Integer)1, (java.lang.Integer)27, (java.lang.Integer)(-2));
    java.lang.Integer i41 = iP40.getFourth();
    java.lang.Integer i42 = iP40.getFourth();
    iPBan9.setIp(iP40);
    tp2.IP iP44 = iPBan9.getIp();
    tp2.IP iP45 = iPBan9.getIp();
    java.lang.Integer i46 = iP45.getThird();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i5 + "' != '" + (-1)+ "'", i5.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(long10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i29 + "' != '" + 100+ "'", i29.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(long33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i41 + "' != '" + (-2)+ "'", i41.equals((-2)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i42 + "' != '" + (-2)+ "'", i42.equals((-2)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i46 + "' != '" + 27+ "'", i46.equals(27));

  }

  @Test
  public void test349() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test349"); }


    int i1 = java.lang.Integer.lowestOneBit(268435500);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 4);

  }

  @Test
  public void test350() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test350"); }


    tp2.IP iP4 = new tp2.IP((java.lang.Integer)356246784, (java.lang.Integer)13, (java.lang.Integer)0, (java.lang.Integer)37469776);
    java.lang.Integer i5 = iP4.getSecond();
    iP4.setFirst((java.lang.Integer)4194304);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i5 + "' != '" + 13+ "'", i5.equals(13));

  }

  @Test
  public void test351() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test351"); }


    java.lang.String str2 = java.lang.Integer.toUnsignedString(1200000000, (-1060148736));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1200000000"+ "'", str2.equals("1200000000"));

  }

  @Test
  public void test352() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test352"); }


    // The following exception was thrown during execution in test generation
    try {
      java.lang.Integer i2 = java.lang.Integer.valueOf("110000000000000", 47776);
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

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test353"); }


    java.lang.Integer i1 = java.lang.Integer.valueOf(144);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 144+ "'", i1.equals(144));

  }

  @Test
  public void test354() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test354"); }


    int i2 = java.lang.Integer.divideUnsigned(1027604483, 436207616);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 2);

  }

  @Test
  public void test355() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test355"); }


    java.lang.Integer i1 = java.lang.Integer.decode("83886645");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 83886645+ "'", i1.equals(83886645));

  }

  @Test
  public void test356() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test356"); }


    int i2 = java.lang.Integer.rotateLeft(32768, 920903680);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 32768);

  }

  @Test
  public void test357() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test357"); }


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
    boolean b36 = singlyLinkedList0.repOK();
    int i37 = singlyLinkedList0.getSize();
    tp2.IP iP42 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP42.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan46 = new tp2.IPBan(iP42, (java.lang.Long)100L);
    tp2.IP iP47 = iPBan46.ip;
    tp2.IP iP48 = iPBan46.getIp();
    java.lang.Integer i49 = iP48.getSecond();
    tp2.IPBan iPBan51 = new tp2.IPBan(iP48, (java.lang.Long)20971520L);
    boolean b52 = singlyLinkedList0.contains(iP48);
    boolean b53 = singlyLinkedList0.isEmpty();
    int i54 = singlyLinkedList0.getSize();
    boolean b55 = singlyLinkedList0.repOK();
    
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
    org.junit.Assert.assertTrue(b36 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i37 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i49 + "' != '" + (-1)+ "'", i49.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b52 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b53 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i54 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b55 == true);

  }

  @Test
  public void test358() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test358"); }


    java.lang.String str1 = java.lang.Integer.toBinaryString(3801088);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "1110100000000000000000"+ "'", str1.equals("1110100000000000000000"));

  }

  @Test
  public void test359() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test359"); }


    java.lang.String str1 = java.lang.Integer.toBinaryString(89268645);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "101010100100010000110100101"+ "'", str1.equals("101010100100010000110100101"));

  }

  @Test
  public void test360() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test360"); }


    int i2 = java.lang.Integer.rotateLeft(128628, 268435760);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == (-160169983));

  }

  @Test
  public void test361() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test361"); }


    java.lang.Integer i1 = java.lang.Integer.valueOf(1431647489);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 1431647489+ "'", i1.equals(1431647489));

  }

  @Test
  public void test362() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test362"); }


    int i1 = java.lang.Integer.signum(20512);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 1);

  }

  @Test
  public void test363() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test363"); }


    int i2 = java.lang.Integer.max(89, 1325400064);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1325400064);

  }

  @Test
  public void test364() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test364"); }


    int i1 = java.lang.Integer.bitCount(54636748);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 11);

  }

  @Test
  public void test365() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test365"); }


    int i2 = java.lang.Integer.rotateRight(637534224, 340);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 66144);

  }

  @Test
  public void test366() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test366"); }


    tp2.SinglyLinkedList singlyLinkedList0 = new tp2.SinglyLinkedList();
    int i1 = singlyLinkedList0.getSize();
    tp2.IP iP6 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i7 = iP6.getSecond();
    java.lang.Integer i8 = iP6.getFourth();
    singlyLinkedList0.add(iP6);
    tp2.IPBan iPBan11 = new tp2.IPBan(iP6, (java.lang.Long)1L);
    tp2.IPBan iPBan13 = new tp2.IPBan(iP6, (java.lang.Long)100L);
    java.lang.Integer i14 = iP6.getFourth();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i7 + "' != '" + (-1)+ "'", i7.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i8 + "' != '" + 100+ "'", i8.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i14 + "' != '" + 100+ "'", i14.equals(100));

  }

  @Test
  public void test367() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test367"); }


    // The following exception was thrown during execution in test generation
    try {
      java.lang.Integer i2 = java.lang.Integer.valueOf("80000b87", 700000233);
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

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test368"); }


    int i2 = java.lang.Integer.divideUnsigned((-2013265920), 23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 99204407);

  }

  @Test
  public void test369() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test369"); }


    // The following exception was thrown during execution in test generation
    try {
      int i2 = java.lang.Integer.parseInt("2264924159", (-536870911));
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test370() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test370"); }


    // The following exception was thrown during execution in test generation
    try {
      int i1 = java.lang.Integer.parseInt("4176605088");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test371() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test371"); }


    java.lang.Integer i1 = new java.lang.Integer(805306496);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 805306496+ "'", i1.equals(805306496));

  }

  @Test
  public void test372() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test372"); }


    int i2 = java.lang.Integer.rotateRight(655360, 165506470);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 10240);

  }

  @Test
  public void test373() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test373"); }


    java.lang.Integer i2 = java.lang.Integer.getInteger("372963", (java.lang.Integer)1010);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i2 + "' != '" + 1010+ "'", i2.equals(1010));

  }

  @Test
  public void test374() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test374"); }


    java.lang.Integer i1 = new java.lang.Integer(101);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 101+ "'", i1.equals(101));

  }

  @Test
  public void test375() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test375"); }


    int i2 = java.lang.Integer.min(163840, 759185408);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 163840);

  }

  @Test
  public void test376() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test376"); }


    java.lang.Integer i1 = new java.lang.Integer((-122));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + (-122)+ "'", i1.equals((-122)));

  }

  @Test
  public void test377() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test377"); }


    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList0 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b1 = strictlySortedSinglyLinkedList0.repOK();
    strictlySortedSinglyLinkedList0.size = 1;
    boolean b4 = strictlySortedSinglyLinkedList0.isEmpty();
    int i5 = strictlySortedSinglyLinkedList0.getSize();
    boolean b6 = strictlySortedSinglyLinkedList0.isEmpty();
    int i7 = strictlySortedSinglyLinkedList0.getSize();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList8 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b9 = strictlySortedSinglyLinkedList8.repOK();
    strictlySortedSinglyLinkedList8.size = 1;
    strictlySortedSinglyLinkedList8.size = 0;
    tp2.IP iP18 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP18.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan22 = new tp2.IPBan(iP18, (java.lang.Long)100L);
    tp2.IP iP23 = iPBan22.ip;
    boolean b24 = strictlySortedSinglyLinkedList8.contains(iPBan22);
    boolean b25 = strictlySortedSinglyLinkedList8.repOK();
    tp2.SinglyLinkedList singlyLinkedList26 = new tp2.SinglyLinkedList();
    int i27 = singlyLinkedList26.getSize();
    tp2.IP iP32 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i33 = iP32.getSecond();
    java.lang.Integer i34 = iP32.getFourth();
    singlyLinkedList26.add(iP32);
    boolean b37 = iP32.equals((java.lang.Object)2147483647);
    tp2.IPBan iPBan39 = new tp2.IPBan(iP32, (java.lang.Long)(-1L));
    boolean b40 = strictlySortedSinglyLinkedList8.add(iPBan39);
    iPBan39.setExpires((java.lang.Long)0L);
    tp2.IP iP43 = iPBan39.ip;
    boolean b44 = strictlySortedSinglyLinkedList0.containsIP(iP43);
    iP43.setFourth((java.lang.Integer)8389120);
    java.lang.Integer i47 = iP43.getFourth();
    
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
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i33 + "' != '" + (-1)+ "'", i33.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i34 + "' != '" + 100+ "'", i34.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i47 + "' != '" + 8389120+ "'", i47.equals(8389120));

  }

  @Test
  public void test378() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test378"); }


    int i1 = java.lang.Integer.numberOfLeadingZeros(553648146);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 2);

  }

  @Test
  public void test379() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test379"); }


    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList0 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b1 = strictlySortedSinglyLinkedList0.repOK();
    tp2.IP iP6 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    boolean b7 = strictlySortedSinglyLinkedList0.containsIP(iP6);
    int i8 = strictlySortedSinglyLinkedList0.getSize();
    tp2.SinglyLinkedList singlyLinkedList9 = new tp2.SinglyLinkedList();
    int i10 = singlyLinkedList9.getSize();
    tp2.IP iP15 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i16 = iP15.getSecond();
    java.lang.Integer i17 = iP15.getFourth();
    singlyLinkedList9.add(iP15);
    tp2.IPBan iPBan20 = new tp2.IPBan(iP15, (java.lang.Long)100L);
    iPBan20.expires = 10L;
    tp2.IP iP23 = iPBan20.getIp();
    iPBan20.expires = 0L;
    java.lang.Long long26 = iPBan20.expires;
    boolean b27 = strictlySortedSinglyLinkedList0.add(iPBan20);
    tp2.IP iP32 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP32.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan36 = new tp2.IPBan(iP32, (java.lang.Long)100L);
    tp2.IP iP37 = iPBan36.ip;
    tp2.IP iP42 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP42.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan46 = new tp2.IPBan(iP42, (java.lang.Long)100L);
    iPBan36.setIp(iP42);
    tp2.IPBan iPBan49 = new tp2.IPBan(iP42, (java.lang.Long)(-1L));
    iPBan20.ip = iP42;
    tp2.IP iP51 = iPBan20.getIp();
    iPBan20.setExpires((java.lang.Long)13L);
    iPBan20.expires = 1048576L;
    tp2.SinglyLinkedList singlyLinkedList56 = new tp2.SinglyLinkedList();
    int i57 = singlyLinkedList56.getSize();
    tp2.IP iP62 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i63 = iP62.getSecond();
    java.lang.Integer i64 = iP62.getFourth();
    singlyLinkedList56.add(iP62);
    tp2.IPBan iPBan67 = new tp2.IPBan(iP62, (java.lang.Long)1L);
    tp2.IPBan iPBan69 = new tp2.IPBan(iP62, (java.lang.Long)100L);
    java.lang.Long long70 = iPBan69.expires;
    tp2.SinglyLinkedList singlyLinkedList71 = new tp2.SinglyLinkedList();
    int i72 = singlyLinkedList71.getSize();
    int i73 = singlyLinkedList71.getSize();
    tp2.IP iP74 = null;
    boolean b75 = singlyLinkedList71.contains(iP74);
    boolean b76 = singlyLinkedList71.repOK();
    boolean b77 = singlyLinkedList71.isEmpty();
    tp2.IP iP82 = new tp2.IP((java.lang.Integer)5, (java.lang.Integer)10, (java.lang.Integer)31, (java.lang.Integer)32);
    java.lang.Object obj83 = null;
    boolean b84 = iP82.equals(obj83);
    iP82.setFirst((java.lang.Integer)100);
    boolean b87 = singlyLinkedList71.contains(iP82);
    iP82.setFirst((java.lang.Integer)32768);
    iPBan69.setIp(iP82);
    iPBan20.setIp(iP82);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i16 + "' != '" + (-1)+ "'", i16.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i17 + "' != '" + 100+ "'", i17.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L+ "'", long26.equals(0L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i57 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i63 + "' != '" + (-1)+ "'", i63.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i64 + "' != '" + 100+ "'", i64.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long70 + "' != '" + 100L+ "'", long70.equals(100L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i72 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i73 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b75 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b76 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b77 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b84 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b87 == false);

  }

  @Test
  public void test380() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test380"); }


    int i2 = java.lang.Integer.divideUnsigned(1140850686, 637534208);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);

  }

  @Test
  public void test381() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test381"); }


    // The following exception was thrown during execution in test generation
    try {
      int i2 = java.lang.Integer.parseInt("8029005e", 5);
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

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test382"); }


    int i2 = java.lang.Integer.compareUnsigned(73553877, 734003200);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == (-1));

  }

  @Test
  public void test383() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test383"); }


    int i2 = java.lang.Integer.divideUnsigned(58, 1677721600);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);

  }

  @Test
  public void test384() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test384"); }


    java.lang.Integer i1 = java.lang.Integer.decode("30000001");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 30000001+ "'", i1.equals(30000001));

  }

  @Test
  public void test385() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test385"); }


    // The following exception was thrown during execution in test generation
    try {
      int i2 = java.lang.Integer.parseInt("4176605088", 33554870);
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test386() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test386"); }


    int i2 = java.lang.Integer.remainderUnsigned(311647600, 1006632960);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 311647600);

  }

  @Test
  public void test387() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test387"); }


    // The following exception was thrown during execution in test generation
    try {
      java.lang.Integer i2 = java.lang.Integer.valueOf("50001db", 346729152);
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

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test388"); }


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
    boolean b28 = singlyLinkedList0.isEmpty();
    tp2.SinglyLinkedList singlyLinkedList29 = new tp2.SinglyLinkedList();
    int i30 = singlyLinkedList29.getSize();
    int i31 = singlyLinkedList29.getSize();
    tp2.IP iP32 = null;
    boolean b33 = singlyLinkedList29.contains(iP32);
    int i34 = singlyLinkedList29.getSize();
    tp2.IP iP39 = new tp2.IP((java.lang.Integer)242, (java.lang.Integer)242, (java.lang.Integer)30, (java.lang.Integer)(-1));
    iP39.setSecond((java.lang.Integer)16);
    boolean b42 = singlyLinkedList29.contains(iP39);
    singlyLinkedList0.add(iP39);
    java.lang.Integer i44 = iP39.getSecond();
    
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
    org.junit.Assert.assertTrue(i30 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i31 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i34 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i44 + "' != '" + 16+ "'", i44.equals(16));

  }

  @Test
  public void test389() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test389"); }


    int i2 = java.lang.Integer.compare(4096, 805306496);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == (-1));

  }

  @Test
  public void test390() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test390"); }


    int i2 = java.lang.Integer.min(0, 289448);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);

  }

  @Test
  public void test391() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test391"); }


    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList0 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b1 = strictlySortedSinglyLinkedList0.repOK();
    boolean b2 = strictlySortedSinglyLinkedList0.repOK();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList3 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b4 = strictlySortedSinglyLinkedList3.repOK();
    strictlySortedSinglyLinkedList3.size = 1;
    strictlySortedSinglyLinkedList3.size = 0;
    tp2.IP iP13 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP13.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan17 = new tp2.IPBan(iP13, (java.lang.Long)100L);
    tp2.IP iP18 = iPBan17.ip;
    boolean b19 = strictlySortedSinglyLinkedList3.contains(iPBan17);
    boolean b20 = strictlySortedSinglyLinkedList3.repOK();
    tp2.SinglyLinkedList singlyLinkedList21 = new tp2.SinglyLinkedList();
    int i22 = singlyLinkedList21.getSize();
    tp2.IP iP27 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i28 = iP27.getSecond();
    java.lang.Integer i29 = iP27.getFourth();
    singlyLinkedList21.add(iP27);
    boolean b32 = iP27.equals((java.lang.Object)2147483647);
    tp2.IPBan iPBan34 = new tp2.IPBan(iP27, (java.lang.Long)(-1L));
    boolean b35 = strictlySortedSinglyLinkedList3.add(iPBan34);
    tp2.Node node36 = strictlySortedSinglyLinkedList3.header;
    strictlySortedSinglyLinkedList0.header = node36;
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList38 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b39 = strictlySortedSinglyLinkedList38.repOK();
    tp2.IP iP44 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i45 = iP44.getSecond();
    iP44.setFirst((java.lang.Integer)11001000);
    iP44.setFirst((java.lang.Integer)(-2147483648));
    boolean b50 = strictlySortedSinglyLinkedList38.removeFromIP(iP44);
    tp2.IP iP55 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP55.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan59 = new tp2.IPBan(iP55, (java.lang.Long)100L);
    tp2.IP iP60 = iPBan59.ip;
    tp2.IP iP65 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP65.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan69 = new tp2.IPBan(iP65, (java.lang.Long)100L);
    iPBan59.setIp(iP65);
    tp2.IP iP75 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP75.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan79 = new tp2.IPBan(iP75, (java.lang.Long)100L);
    java.lang.Integer i80 = iP75.getFirst();
    java.lang.Integer i81 = iP75.getFourth();
    iPBan59.setIp(iP75);
    boolean b83 = strictlySortedSinglyLinkedList38.add(iPBan59);
    java.lang.Long long84 = iPBan59.expires;
    boolean b85 = strictlySortedSinglyLinkedList0.add(iPBan59);
    tp2.IP iP86 = iPBan59.getIp();
    iPBan59.setExpires((java.lang.Long)1100L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i28 + "' != '" + (-1)+ "'", i28.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i29 + "' != '" + 100+ "'", i29.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i45 + "' != '" + (-1)+ "'", i45.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b50 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP60);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i80 + "' != '" + 200+ "'", i80.equals(200));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i81 + "' != '" + 100+ "'", i81.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b83 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long84 + "' != '" + 100L+ "'", long84.equals(100L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b85 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP86);

  }

  @Test
  public void test392() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test392"); }


    // The following exception was thrown during execution in test generation
    try {
      int i2 = java.lang.Integer.parseUnsignedInt("486539294", (-19159104));
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

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test393"); }


    // The following exception was thrown during execution in test generation
    try {
      int i2 = java.lang.Integer.parseInt("4020000003", 1308370);
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

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test394"); }


    java.lang.Integer i1 = java.lang.Integer.valueOf(2273280);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 2273280+ "'", i1.equals(2273280));

  }

  @Test
  public void test395() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test395"); }


    int i1 = java.lang.Integer.reverse((-671088639));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == (-2147483621));

  }

  @Test
  public void test396() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test396"); }


    int i1 = java.lang.Integer.parseInt("335561509");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 335561509);

  }

  @Test
  public void test397() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test397"); }


    int i2 = java.lang.Integer.max(10612598, 50331872);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 50331872);

  }

  @Test
  public void test398() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test398"); }


    java.lang.Integer i2 = java.lang.Integer.getInteger("3232226304", 29824259);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i2 + "' != '" + 29824259+ "'", i2.equals(29824259));

  }

  @Test
  public void test399() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test399"); }


    tp2.IP iP4 = new tp2.IP((java.lang.Integer)160, (java.lang.Integer)1, (java.lang.Integer)27, (java.lang.Integer)(-2));
    java.lang.Integer i5 = iP4.getFourth();
    iP4.setSecond((java.lang.Integer)1431578965);
    iP4.setSecond((java.lang.Integer)2423432);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i5 + "' != '" + (-2)+ "'", i5.equals((-2)));

  }

  @Test
  public void test400() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test400"); }


    // The following exception was thrown during execution in test generation
    try {
      int i2 = java.lang.Integer.parseInt("1010101010101010011010100000001", 366457);
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

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test401"); }


    // The following exception was thrown during execution in test generation
    try {
      int i2 = java.lang.Integer.parseInt("44f5f11", (-1063633290));
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test402() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test402"); }


    tp2.SinglyLinkedList singlyLinkedList0 = new tp2.SinglyLinkedList();
    boolean b1 = singlyLinkedList0.repOK();
    tp2.IP iP3 = singlyLinkedList0.get(200);
    boolean b4 = singlyLinkedList0.isEmpty();
    boolean b5 = singlyLinkedList0.repOK();
    boolean b6 = singlyLinkedList0.repOK();
    int i7 = singlyLinkedList0.getSize();
    boolean b8 = singlyLinkedList0.isEmpty();
    int i9 = singlyLinkedList0.getSize();
    tp2.IP iP14 = new tp2.IP((java.lang.Integer)12, (java.lang.Integer)167772160, (java.lang.Integer)(-1610320004), (java.lang.Integer)16);
    boolean b15 = singlyLinkedList0.remove(iP14);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList16 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b17 = strictlySortedSinglyLinkedList16.repOK();
    strictlySortedSinglyLinkedList16.size = 1;
    strictlySortedSinglyLinkedList16.size = 0;
    tp2.IP iP26 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i27 = iP26.getSecond();
    java.lang.Integer i28 = iP26.getFourth();
    boolean b29 = strictlySortedSinglyLinkedList16.containsIP(iP26);
    tp2.IP iP34 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP34.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan38 = new tp2.IPBan(iP34, (java.lang.Long)100L);
    tp2.IP iP43 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP43.setFirst((java.lang.Integer)200);
    java.lang.Integer i46 = iP43.getFourth();
    iPBan38.setIp(iP43);
    iPBan38.setExpires((java.lang.Long)2147483648L);
    tp2.IP iP50 = iPBan38.getIp();
    boolean b51 = iP26.equals((java.lang.Object)iP50);
    boolean b52 = singlyLinkedList0.contains(iP50);
    int i53 = singlyLinkedList0.getSize();
    boolean b54 = singlyLinkedList0.repOK();
    
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
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i27 + "' != '" + (-1)+ "'", i27.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i28 + "' != '" + 100+ "'", i28.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i46 + "' != '" + 100+ "'", i46.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b51 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b52 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i53 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b54 == true);

  }

  @Test
  public void test403() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test403"); }


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
    tp2.IP iP46 = iPBan21.getIp();
    java.lang.Integer i47 = iP46.getSecond();
    tp2.IP iP52 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    tp2.IPBan iPBan54 = new tp2.IPBan(iP52, (java.lang.Long)469762048L);
    iPBan54.expires = 32987L;
    tp2.IP iP57 = iPBan54.getIp();
    java.lang.Long long58 = iPBan54.getExpires();
    tp2.IP iP59 = iPBan54.ip;
    tp2.SinglyLinkedList singlyLinkedList60 = new tp2.SinglyLinkedList();
    int i61 = singlyLinkedList60.getSize();
    tp2.IP iP66 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i67 = iP66.getSecond();
    java.lang.Integer i68 = iP66.getFourth();
    singlyLinkedList60.add(iP66);
    boolean b71 = iP66.equals((java.lang.Object)2147483647);
    tp2.IPBan iPBan73 = new tp2.IPBan(iP66, (java.lang.Long)(-1L));
    java.lang.Long long74 = iPBan73.expires;
    tp2.IP iP79 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP79.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan83 = new tp2.IPBan(iP79, (java.lang.Long)100L);
    tp2.IP iP84 = iPBan83.ip;
    iP84.setThird((java.lang.Integer)356246784);
    iPBan73.ip = iP84;
    java.lang.Integer i88 = iP84.getFirst();
    iP84.setFirst((java.lang.Integer)24);
    iPBan54.setIp(iP84);
    boolean b92 = iP46.equals((java.lang.Object)iPBan54);
    
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
    org.junit.Assert.assertNotNull(iP46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i47 + "' != '" + (-1)+ "'", i47.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long58 + "' != '" + 32987L+ "'", long58.equals(32987L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP59);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i61 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i67 + "' != '" + (-1)+ "'", i67.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i68 + "' != '" + 100+ "'", i68.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b71 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long74 + "' != '" + (-1L)+ "'", long74.equals((-1L)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP84);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i88 + "' != '" + 200+ "'", i88.equals(200));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b92 == false);

  }

  @Test
  public void test404() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test404"); }


    int i2 = java.lang.Integer.rotateRight(16384, 101101102);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);

  }

  @Test
  public void test405() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test405"); }


    java.lang.String str1 = java.lang.Integer.toBinaryString(1814670574);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "1101100001010011010110011101110"+ "'", str1.equals("1101100001010011010110011101110"));

  }

  @Test
  public void test406() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test406"); }


    int i2 = java.lang.Integer.rotateLeft(581851175, 48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1478959790);

  }

  @Test
  public void test407() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test407"); }


    java.lang.Integer i0 = null;
    // The following exception was thrown during execution in test generation
    try {
      tp2.IP iP4 = new tp2.IP(i0, (java.lang.Integer)5977, (java.lang.Integer)(-1879048124), (java.lang.Integer)1342181290);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test408() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test408"); }


    int i2 = java.lang.Integer.rotateLeft((-709860096), 2772752);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1694553520);

  }

  @Test
  public void test409() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test409"); }


    tp2.SinglyLinkedList singlyLinkedList0 = new tp2.SinglyLinkedList();
    boolean b1 = singlyLinkedList0.repOK();
    int i2 = singlyLinkedList0.getSize();
    boolean b3 = singlyLinkedList0.isEmpty();
    tp2.IP iP8 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i9 = iP8.getSecond();
    iP8.setFirst((java.lang.Integer)11001000);
    iP8.setFirst((java.lang.Integer)32);
    java.lang.Integer i14 = iP8.getFourth();
    boolean b15 = singlyLinkedList0.contains(iP8);
    tp2.IP iP20 = new tp2.IP((java.lang.Integer)0, (java.lang.Integer)30, (java.lang.Integer)162, (java.lang.Integer)20);
    boolean b21 = singlyLinkedList0.remove(iP20);
    tp2.IPBan iPBan23 = new tp2.IPBan(iP20, (java.lang.Long)27L);
    tp2.IP iP24 = iPBan23.ip;
    tp2.SinglyLinkedList singlyLinkedList25 = new tp2.SinglyLinkedList();
    int i26 = singlyLinkedList25.getSize();
    tp2.IP iP31 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i32 = iP31.getSecond();
    java.lang.Integer i33 = iP31.getFourth();
    singlyLinkedList25.add(iP31);
    tp2.IP iP36 = singlyLinkedList25.get(5);
    boolean b37 = singlyLinkedList25.repOK();
    tp2.IP iP39 = singlyLinkedList25.get(2013265920);
    tp2.SinglyLinkedList singlyLinkedList40 = new tp2.SinglyLinkedList();
    int i41 = singlyLinkedList40.getSize();
    tp2.IP iP46 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i47 = iP46.getSecond();
    java.lang.Integer i48 = iP46.getFourth();
    singlyLinkedList40.add(iP46);
    iP46.setFourth((java.lang.Integer)167772160);
    singlyLinkedList25.add(iP46);
    java.lang.Object obj53 = null;
    boolean b54 = iP46.equals(obj53);
    iPBan23.ip = iP46;
    iP46.setSecond((java.lang.Integer)1354650369);
    tp2.IPBan iPBan59 = new tp2.IPBan(iP46, (java.lang.Long)2477064192L);
    java.lang.Integer i60 = iP46.getFourth();
    java.lang.Integer i61 = iP46.getSecond();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + (-1)+ "'", i9.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i14 + "' != '" + 100+ "'", i14.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i32 + "' != '" + (-1)+ "'", i32.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i33 + "' != '" + 100+ "'", i33.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i41 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i47 + "' != '" + (-1)+ "'", i47.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i48 + "' != '" + 100+ "'", i48.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b54 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i60 + "' != '" + 167772160+ "'", i60.equals(167772160));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i61 + "' != '" + 1354650369+ "'", i61.equals(1354650369));

  }

  @Test
  public void test410() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test410"); }


    int i2 = java.lang.Integer.rotateLeft(27962026, 64314);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == (-1475958102));

  }

  @Test
  public void test411() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test411"); }


    java.lang.Integer i2 = java.lang.Integer.getInteger("340", 301989888);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i2 + "' != '" + 301989888+ "'", i2.equals(301989888));

  }

  @Test
  public void test412() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test412"); }


    tp2.IP iP4 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i5 = iP4.getSecond();
    iP4.setFirst((java.lang.Integer)11001000);
    java.lang.Integer i8 = iP4.getSecond();
    tp2.IPBan iPBan10 = new tp2.IPBan(iP4, (java.lang.Long)51756492L);
    java.lang.Integer i11 = iP4.getFourth();
    iP4.setThird((java.lang.Integer)1027604515);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i5 + "' != '" + (-1)+ "'", i5.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i8 + "' != '" + (-1)+ "'", i8.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i11 + "' != '" + 100+ "'", i11.equals(100));

  }

  @Test
  public void test413() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test413"); }


    int i2 = java.lang.Integer.divideUnsigned(1123418368, 922812416);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);

  }

  @Test
  public void test414() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test414"); }


    int i2 = java.lang.Integer.remainderUnsigned((-118362208), 128514);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 28602);

  }

  @Test
  public void test415() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test415"); }


    tp2.SinglyLinkedList singlyLinkedList0 = new tp2.SinglyLinkedList();
    boolean b1 = singlyLinkedList0.repOK();
    tp2.IP iP6 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP6.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan10 = new tp2.IPBan(iP6, (java.lang.Long)100L);
    iP6.setFourth((java.lang.Integer)32);
    singlyLinkedList0.add(iP6);
    tp2.IP iP15 = singlyLinkedList0.get(65536);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList16 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b17 = strictlySortedSinglyLinkedList16.repOK();
    strictlySortedSinglyLinkedList16.size = 1;
    boolean b20 = strictlySortedSinglyLinkedList16.isEmpty();
    int i21 = strictlySortedSinglyLinkedList16.getSize();
    boolean b22 = strictlySortedSinglyLinkedList16.isEmpty();
    int i23 = strictlySortedSinglyLinkedList16.getSize();
    strictlySortedSinglyLinkedList16.size = 94;
    tp2.SinglyLinkedList singlyLinkedList26 = new tp2.SinglyLinkedList();
    boolean b27 = singlyLinkedList26.repOK();
    tp2.IP iP32 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP32.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan36 = new tp2.IPBan(iP32, (java.lang.Long)100L);
    tp2.IP iP41 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP41.setFirst((java.lang.Integer)200);
    java.lang.Integer i44 = iP41.getFourth();
    iPBan36.setIp(iP41);
    singlyLinkedList26.add(iP41);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList47 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b48 = strictlySortedSinglyLinkedList47.repOK();
    tp2.IP iP53 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    boolean b54 = strictlySortedSinglyLinkedList47.containsIP(iP53);
    tp2.IPBan iPBan56 = strictlySortedSinglyLinkedList47.get(160);
    tp2.IPBan iPBan57 = null;
    boolean b58 = strictlySortedSinglyLinkedList47.contains(iPBan57);
    boolean b59 = iP41.equals((java.lang.Object)strictlySortedSinglyLinkedList47);
    boolean b60 = strictlySortedSinglyLinkedList16.containsIP(iP41);
    singlyLinkedList0.add(iP41);
    boolean b62 = singlyLinkedList0.repOK();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i44 + "' != '" + 100+ "'", i44.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b48 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b54 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iPBan56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b58 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b59 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b60 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b62 == true);

  }

  @Test
  public void test416() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test416"); }


    int i1 = java.lang.Integer.numberOfTrailingZeros(464922);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 1);

  }

  @Test
  public void test417() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test417"); }


    int i2 = java.lang.Integer.min(55681743, 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);

  }

  @Test
  public void test418() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test418"); }


    java.lang.Integer i1 = new java.lang.Integer(2004194356);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 2004194356+ "'", i1.equals(2004194356));

  }

  @Test
  public void test419() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test419"); }


    java.lang.String str1 = java.lang.Integer.toOctalString(52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "64"+ "'", str1.equals("64"));

  }

  @Test
  public void test420() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test420"); }


    int i1 = java.lang.Integer.bitCount((-2139094931));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 7);

  }

  @Test
  public void test421() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test421"); }


    java.lang.String str1 = java.lang.Integer.toBinaryString((-2144796672));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "10000000001010010000000000000000"+ "'", str1.equals("10000000001010010000000000000000"));

  }

  @Test
  public void test422() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test422"); }


    int i2 = java.lang.Integer.min(99204407, 162364072);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 99204407);

  }

  @Test
  public void test423() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test423"); }


    java.lang.Integer i1 = new java.lang.Integer(7220);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 7220+ "'", i1.equals(7220));

  }

  @Test
  public void test424() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test424"); }


    int i1 = java.lang.Integer.bitCount(170);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 4);

  }

  @Test
  public void test425() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test425"); }


    int i2 = java.lang.Integer.max(824200, 262144);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 824200);

  }

  @Test
  public void test426() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test426"); }


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
    boolean b16 = strictlySortedSinglyLinkedList0.isEmpty();
    
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
    org.junit.Assert.assertTrue(b16 == false);

  }

  @Test
  public void test427() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test427"); }


    int i1 = java.lang.Integer.reverse(20001341);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == (-1135833984));

  }

  @Test
  public void test428() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test428"); }


    int i2 = java.lang.Integer.sum(55681743, 243269647);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 298951390);

  }

  @Test
  public void test429() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test429"); }


    java.lang.Integer i1 = java.lang.Integer.getInteger("4062218875");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);

  }

  @Test
  public void test430() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test430"); }


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
    strictlySortedSinglyLinkedList0.size = 28;
    int i42 = strictlySortedSinglyLinkedList0.size;
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList43 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b44 = strictlySortedSinglyLinkedList43.repOK();
    boolean b45 = strictlySortedSinglyLinkedList43.repOK();
    tp2.IPBan iPBan46 = null;
    boolean b47 = strictlySortedSinglyLinkedList43.add(iPBan46);
    tp2.Node node48 = strictlySortedSinglyLinkedList43.header;
    tp2.IPBan iPBan50 = strictlySortedSinglyLinkedList43.get(13);
    tp2.Node node51 = strictlySortedSinglyLinkedList43.header;
    strictlySortedSinglyLinkedList0.header = node51;
    boolean b53 = strictlySortedSinglyLinkedList0.repOK();
    boolean b54 = strictlySortedSinglyLinkedList0.isEmpty();
    
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
    org.junit.Assert.assertTrue(i42 == 28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b47 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iPBan50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b53 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b54 == false);

  }

  @Test
  public void test431() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test431"); }


    // The following exception was thrown during execution in test generation
    try {
      java.lang.Integer i1 = java.lang.Integer.decode("11010110010100000000000111011100");
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

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test432"); }


    // The following exception was thrown during execution in test generation
    try {
      java.lang.Integer i2 = java.lang.Integer.valueOf("637170", 30009402);
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

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test433"); }


    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList0 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b1 = strictlySortedSinglyLinkedList0.repOK();
    strictlySortedSinglyLinkedList0.size = 1;
    strictlySortedSinglyLinkedList0.size = 0;
    tp2.IP iP10 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i11 = iP10.getSecond();
    java.lang.Integer i12 = iP10.getFourth();
    boolean b13 = strictlySortedSinglyLinkedList0.containsIP(iP10);
    tp2.Node node14 = strictlySortedSinglyLinkedList0.header;
    boolean b15 = strictlySortedSinglyLinkedList0.isEmpty();
    strictlySortedSinglyLinkedList0.size = 0;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i11 + "' != '" + (-1)+ "'", i11.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i12 + "' != '" + 100+ "'", i12.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);

  }

  @Test
  public void test434() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test434"); }


    java.lang.String str1 = java.lang.Integer.toBinaryString(234893312);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "1110000000000011000000000000"+ "'", str1.equals("1110000000000011000000000000"));

  }

  @Test
  public void test435() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test435"); }


    int i2 = java.lang.Integer.sum(541229059, 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 541229059);

  }

  @Test
  public void test436() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test436"); }


    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList0 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IPBan iPBan1 = null;
    boolean b2 = strictlySortedSinglyLinkedList0.add(iPBan1);
    int i3 = strictlySortedSinglyLinkedList0.getSize();
    tp2.Node node4 = strictlySortedSinglyLinkedList0.header;
    int i5 = strictlySortedSinglyLinkedList0.getSize();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList6 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b7 = strictlySortedSinglyLinkedList6.repOK();
    tp2.IP iP12 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    boolean b13 = strictlySortedSinglyLinkedList6.containsIP(iP12);
    int i14 = strictlySortedSinglyLinkedList6.getSize();
    tp2.SinglyLinkedList singlyLinkedList15 = new tp2.SinglyLinkedList();
    int i16 = singlyLinkedList15.getSize();
    tp2.IP iP21 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i22 = iP21.getSecond();
    java.lang.Integer i23 = iP21.getFourth();
    singlyLinkedList15.add(iP21);
    tp2.IPBan iPBan26 = new tp2.IPBan(iP21, (java.lang.Long)100L);
    iPBan26.expires = 10L;
    tp2.IP iP29 = iPBan26.getIp();
    iPBan26.expires = 0L;
    java.lang.Long long32 = iPBan26.expires;
    boolean b33 = strictlySortedSinglyLinkedList6.add(iPBan26);
    int i34 = strictlySortedSinglyLinkedList6.getSize();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList35 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b36 = strictlySortedSinglyLinkedList35.repOK();
    tp2.IP iP41 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i42 = iP41.getSecond();
    iP41.setFirst((java.lang.Integer)11001000);
    iP41.setFirst((java.lang.Integer)(-2147483648));
    boolean b47 = strictlySortedSinglyLinkedList35.removeFromIP(iP41);
    tp2.IPBan iPBan48 = null;
    boolean b49 = strictlySortedSinglyLinkedList35.add(iPBan48);
    tp2.Node node50 = strictlySortedSinglyLinkedList35.header;
    tp2.Node node51 = strictlySortedSinglyLinkedList35.header;
    strictlySortedSinglyLinkedList6.header = node51;
    strictlySortedSinglyLinkedList0.header = node51;
    tp2.IPBan iPBan55 = strictlySortedSinglyLinkedList0.get(65354496);
    boolean b56 = strictlySortedSinglyLinkedList0.isEmpty();
    int i57 = strictlySortedSinglyLinkedList0.size;
    tp2.Node node58 = strictlySortedSinglyLinkedList0.header;
    tp2.Node node59 = strictlySortedSinglyLinkedList0.header;
    tp2.IP iP64 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP64.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan68 = new tp2.IPBan(iP64, (java.lang.Long)100L);
    tp2.IP iP73 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i74 = iP73.getSecond();
    java.lang.Integer i75 = iP73.getFourth();
    iP73.setFirst((java.lang.Integer)5);
    iPBan68.ip = iP73;
    java.lang.Long long79 = iPBan68.getExpires();
    iPBan68.expires = 2147483648L;
    java.lang.Long long82 = iPBan68.getExpires();
    tp2.IP iP83 = iPBan68.ip;
    // The following exception was thrown during execution in test generation
    try {
      boolean b84 = strictlySortedSinglyLinkedList0.add(iPBan68);
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
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i22 + "' != '" + (-1)+ "'", i22.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i23 + "' != '" + 100+ "'", i23.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L+ "'", long32.equals(0L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i34 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i42 + "' != '" + (-1)+ "'", i42.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b47 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b49 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iPBan55);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b56 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i57 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node58);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node59);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i74 + "' != '" + (-1)+ "'", i74.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i75 + "' != '" + 100+ "'", i75.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long79 + "' != '" + 100L+ "'", long79.equals(100L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long82 + "' != '" + 2147483648L+ "'", long82.equals(2147483648L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP83);

  }

  @Test
  public void test437() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test437"); }


    // The following exception was thrown during execution in test generation
    try {
      int i1 = java.lang.Integer.parseInt("3294887680");
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

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test438"); }


    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList0 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b1 = strictlySortedSinglyLinkedList0.repOK();
    tp2.IP iP6 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    boolean b7 = strictlySortedSinglyLinkedList0.containsIP(iP6);
    tp2.Node node8 = strictlySortedSinglyLinkedList0.header;
    boolean b9 = strictlySortedSinglyLinkedList0.isEmpty();
    int i10 = strictlySortedSinglyLinkedList0.getSize();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList11 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b12 = strictlySortedSinglyLinkedList11.repOK();
    tp2.IP iP17 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i18 = iP17.getSecond();
    iP17.setFirst((java.lang.Integer)11001000);
    iP17.setFirst((java.lang.Integer)(-2147483648));
    boolean b23 = strictlySortedSinglyLinkedList11.removeFromIP(iP17);
    tp2.Node node24 = strictlySortedSinglyLinkedList11.header;
    strictlySortedSinglyLinkedList0.header = node24;
    tp2.IPBan iPBan27 = strictlySortedSinglyLinkedList0.get(51756250);
    tp2.SinglyLinkedList singlyLinkedList28 = new tp2.SinglyLinkedList();
    int i29 = singlyLinkedList28.getSize();
    tp2.IP iP34 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i35 = iP34.getSecond();
    java.lang.Integer i36 = iP34.getFourth();
    singlyLinkedList28.add(iP34);
    tp2.IPBan iPBan39 = new tp2.IPBan(iP34, (java.lang.Long)100L);
    java.lang.Long long40 = null;
    tp2.IPBan iPBan41 = new tp2.IPBan(iP34, long40);
    java.lang.Long long42 = iPBan41.getExpires();
    boolean b43 = strictlySortedSinglyLinkedList0.contains(iPBan41);
    int i44 = strictlySortedSinglyLinkedList0.getSize();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList45 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b46 = strictlySortedSinglyLinkedList45.repOK();
    boolean b47 = strictlySortedSinglyLinkedList45.repOK();
    int i48 = strictlySortedSinglyLinkedList45.getSize();
    tp2.Node node49 = strictlySortedSinglyLinkedList45.header;
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList50 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b51 = strictlySortedSinglyLinkedList50.isEmpty();
    tp2.IP iP56 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP56.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan60 = new tp2.IPBan(iP56, (java.lang.Long)100L);
    tp2.IP iP61 = iPBan60.ip;
    tp2.IP iP66 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP66.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan70 = new tp2.IPBan(iP66, (java.lang.Long)100L);
    iPBan60.setIp(iP66);
    tp2.IP iP76 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP76.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan80 = new tp2.IPBan(iP76, (java.lang.Long)100L);
    java.lang.Integer i81 = iP76.getFirst();
    java.lang.Integer i82 = iP76.getFourth();
    iPBan60.setIp(iP76);
    tp2.IP iP84 = iPBan60.getIp();
    tp2.IP iP85 = iPBan60.getIp();
    iPBan60.setExpires((java.lang.Long)1L);
    boolean b88 = strictlySortedSinglyLinkedList50.contains(iPBan60);
    boolean b89 = strictlySortedSinglyLinkedList45.contains(iPBan60);
    iPBan60.setExpires((java.lang.Long)117440667L);
    tp2.IP iP92 = iPBan60.ip;
    boolean b93 = strictlySortedSinglyLinkedList0.contains(iPBan60);
    int i94 = strictlySortedSinglyLinkedList0.size;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i18 + "' != '" + (-1)+ "'", i18.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iPBan27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i29 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i35 + "' != '" + (-1)+ "'", i35.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i36 + "' != '" + 100+ "'", i36.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(long42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b43 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i44 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b46 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b47 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i48 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b51 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP61);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i81 + "' != '" + 200+ "'", i81.equals(200));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i82 + "' != '" + 100+ "'", i82.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP84);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP85);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b88 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b89 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP92);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b93 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i94 == 0);

  }

  @Test
  public void test439() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test439"); }


    java.lang.String str1 = java.lang.Integer.toOctalString(132);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "204"+ "'", str1.equals("204"));

  }

  @Test
  public void test440() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test440"); }


    int i2 = java.lang.Integer.remainderUnsigned(51920186, 184828115);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 51920186);

  }

  @Test
  public void test441() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test441"); }


    int i2 = java.lang.Integer.max(1392382846, 1174749797);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1392382846);

  }

  @Test
  public void test442() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test442"); }


    int i2 = java.lang.Integer.sum(20480, 640);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 21120);

  }

  @Test
  public void test443() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test443"); }


    int i2 = java.lang.Integer.compare(20481, 123363842);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == (-1));

  }

  @Test
  public void test444() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test444"); }


    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList0 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b1 = strictlySortedSinglyLinkedList0.repOK();
    strictlySortedSinglyLinkedList0.size = 1;
    strictlySortedSinglyLinkedList0.size = 0;
    tp2.IPBan iPBan6 = null;
    boolean b7 = strictlySortedSinglyLinkedList0.add(iPBan6);
    boolean b8 = strictlySortedSinglyLinkedList0.isEmpty();
    boolean b9 = strictlySortedSinglyLinkedList0.isEmpty();
    tp2.SinglyLinkedList singlyLinkedList10 = new tp2.SinglyLinkedList();
    int i11 = singlyLinkedList10.getSize();
    tp2.IP iP16 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i17 = iP16.getSecond();
    java.lang.Integer i18 = iP16.getFourth();
    singlyLinkedList10.add(iP16);
    boolean b21 = iP16.equals((java.lang.Object)2147483647);
    tp2.IPBan iPBan23 = new tp2.IPBan(iP16, (java.lang.Long)(-1L));
    java.lang.Long long24 = iPBan23.expires;
    java.lang.Long long25 = iPBan23.expires;
    // The following exception was thrown during execution in test generation
    try {
      boolean b26 = strictlySortedSinglyLinkedList0.contains(iPBan23);
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
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i17 + "' != '" + (-1)+ "'", i17.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i18 + "' != '" + 100+ "'", i18.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long24 + "' != '" + (-1L)+ "'", long24.equals((-1L)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long25 + "' != '" + (-1L)+ "'", long25.equals((-1L)));

  }

  @Test
  public void test445() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test445"); }


    java.lang.Integer i2 = java.lang.Integer.getInteger("2174574592", (java.lang.Integer)(-1530789811));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i2 + "' != '" + (-1530789811)+ "'", i2.equals((-1530789811)));

  }

  @Test
  public void test446() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test446"); }


    // The following exception was thrown during execution in test generation
    try {
      java.lang.Integer i1 = java.lang.Integer.decode("2516762400");
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

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test447"); }


    int i2 = java.lang.Integer.rotateLeft(382723331, 56065);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 765446662);

  }

  @Test
  public void test448() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test448"); }


    java.lang.Integer i1 = null;
    java.lang.Integer i2 = java.lang.Integer.getInteger("3183d3a", i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i2);

  }

  @Test
  public void test449() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test449"); }


    // The following exception was thrown during execution in test generation
    try {
      int i2 = java.lang.Integer.parseInt("385", 54636748);
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

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test450"); }


    java.lang.Integer i2 = java.lang.Integer.getInteger("", 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i2 + "' != '" + 0+ "'", i2.equals(0));

  }

  @Test
  public void test451() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test451"); }


    java.lang.Integer i1 = new java.lang.Integer(10240);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 10240+ "'", i1.equals(10240));

  }

  @Test
  public void test452() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test452"); }


    int i2 = java.lang.Integer.sum(20485, 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 20485);

  }

  @Test
  public void test453() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test453"); }


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
    int i28 = singlyLinkedList27.getSize();
    tp2.IP iP33 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i34 = iP33.getSecond();
    java.lang.Integer i35 = iP33.getFourth();
    singlyLinkedList27.add(iP33);
    tp2.IP iP38 = singlyLinkedList27.get(5);
    boolean b39 = singlyLinkedList27.repOK();
    tp2.IP iP41 = singlyLinkedList27.get(2013265920);
    tp2.IP iP43 = singlyLinkedList27.get((-1));
    tp2.SinglyLinkedList singlyLinkedList44 = new tp2.SinglyLinkedList();
    int i45 = singlyLinkedList44.getSize();
    tp2.IP iP50 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i51 = iP50.getSecond();
    java.lang.Integer i52 = iP50.getFourth();
    singlyLinkedList44.add(iP50);
    tp2.IPBan iPBan55 = new tp2.IPBan(iP50, (java.lang.Long)1L);
    tp2.SinglyLinkedList singlyLinkedList56 = new tp2.SinglyLinkedList();
    int i57 = singlyLinkedList56.getSize();
    tp2.IP iP62 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i63 = iP62.getSecond();
    java.lang.Integer i64 = iP62.getFourth();
    singlyLinkedList56.add(iP62);
    iP62.setFourth((java.lang.Integer)167772160);
    iP62.setSecond((java.lang.Integer)0);
    iPBan55.setIp(iP62);
    boolean b71 = singlyLinkedList27.remove(iP62);
    boolean b72 = singlyLinkedList0.remove(iP62);
    tp2.IP iP73 = null;
    boolean b74 = singlyLinkedList0.remove(iP73);
    
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
    org.junit.Assert.assertTrue(i28 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i34 + "' != '" + (-1)+ "'", i34.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i35 + "' != '" + 100+ "'", i35.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i45 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i51 + "' != '" + (-1)+ "'", i51.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i52 + "' != '" + 100+ "'", i52.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i57 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i63 + "' != '" + (-1)+ "'", i63.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i64 + "' != '" + 100+ "'", i64.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b71 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b72 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b74 == false);

  }

  @Test
  public void test454() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test454"); }


    java.lang.String str1 = java.lang.Integer.toBinaryString(1233);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "10011010001"+ "'", str1.equals("10011010001"));

  }

  @Test
  public void test455() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test455"); }


    tp2.IP iP4 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP4.setFirst((java.lang.Integer)200);
    java.lang.Integer i7 = iP4.getFourth();
    iP4.setFirst((java.lang.Integer)372963);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i7 + "' != '" + 100+ "'", i7.equals(100));

  }

  @Test
  public void test456() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test456"); }


    int i2 = java.lang.Integer.rotateRight(1694498816, 44004000);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1694498816);

  }

  @Test
  public void test457() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test457"); }


    int i2 = java.lang.Integer.rotateLeft(10018, 176016000);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 10018);

  }

  @Test
  public void test458() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test458"); }


    // The following exception was thrown during execution in test generation
    try {
      int i2 = java.lang.Integer.parseUnsignedInt("2952790016", 311647600);
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

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test459"); }


    int i2 = java.lang.Integer.min(131072, 162);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 162);

  }

  @Test
  public void test460() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test460"); }


    java.lang.Integer i2 = java.lang.Integer.getInteger("1354650369", 24300001);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i2 + "' != '" + 24300001+ "'", i2.equals(24300001));

  }

  @Test
  public void test461() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test461"); }


    java.lang.String str2 = java.lang.Integer.toUnsignedString((-1073741824), 1255);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "3221225472"+ "'", str2.equals("3221225472"));

  }

  @Test
  public void test462() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test462"); }


    int i2 = java.lang.Integer.min(831941, 51756250);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 831941);

  }

  @Test
  public void test463() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test463"); }


    int i2 = java.lang.Integer.remainderUnsigned(1565524443, 222117376);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 10702811);

  }

  @Test
  public void test464() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test464"); }


    java.lang.Integer i2 = java.lang.Integer.getInteger("2852126720", (java.lang.Integer)268435456);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i2 + "' != '" + 268435456+ "'", i2.equals(268435456));

  }

  @Test
  public void test465() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test465"); }


    // The following exception was thrown during execution in test generation
    try {
      int i2 = java.lang.Integer.parseUnsignedInt("1100100000000000000000", 25154432);
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test466() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test466"); }


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
    tp2.IP iP33 = iPBan8.getIp();
    iPBan8.setExpires((java.lang.Long)1L);
    tp2.SinglyLinkedList singlyLinkedList36 = new tp2.SinglyLinkedList();
    boolean b37 = singlyLinkedList36.repOK();
    tp2.IP iP39 = singlyLinkedList36.get(200);
    boolean b40 = singlyLinkedList36.isEmpty();
    tp2.IP iP45 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i46 = iP45.getThird();
    boolean b47 = singlyLinkedList36.remove(iP45);
    tp2.IP iP52 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP52.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan56 = new tp2.IPBan(iP52, (java.lang.Long)100L);
    tp2.IP iP57 = iPBan56.ip;
    tp2.IP iP58 = iPBan56.getIp();
    java.lang.Integer i59 = null;
    iP58.setFirst(i59);
    boolean b61 = singlyLinkedList36.contains(iP58);
    int i62 = singlyLinkedList36.getSize();
    boolean b63 = singlyLinkedList36.isEmpty();
    tp2.IP iP68 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP68.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan72 = new tp2.IPBan(iP68, (java.lang.Long)100L);
    tp2.IP iP77 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP77.setFirst((java.lang.Integer)200);
    java.lang.Integer i80 = iP77.getFourth();
    iPBan72.setIp(iP77);
    iPBan72.setExpires((java.lang.Long)2147483648L);
    tp2.IP iP84 = iPBan72.getIp();
    boolean b85 = singlyLinkedList36.contains(iP84);
    iPBan8.setIp(iP84);
    tp2.IP iP91 = new tp2.IP((java.lang.Integer)624000, (java.lang.Integer)12800, (java.lang.Integer)24300001, (java.lang.Integer)52);
    boolean b92 = iP84.equals((java.lang.Object)624000);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i29 + "' != '" + 200+ "'", i29.equals(200));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i30 + "' != '" + 100+ "'", i30.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i46 + "' != '" + (-1)+ "'", i46.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b47 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP58);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b61 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i62 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b63 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i80 + "' != '" + 100+ "'", i80.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP84);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b85 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b92 == false);

  }

  @Test
  public void test467() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test467"); }


    int i1 = java.lang.Integer.numberOfTrailingZeros(286637532);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 2);

  }

  @Test
  public void test468() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test468"); }


    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList0 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b1 = strictlySortedSinglyLinkedList0.repOK();
    tp2.IP iP6 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    boolean b7 = strictlySortedSinglyLinkedList0.containsIP(iP6);
    tp2.SinglyLinkedList singlyLinkedList8 = new tp2.SinglyLinkedList();
    int i9 = singlyLinkedList8.getSize();
    tp2.IP iP14 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i15 = iP14.getSecond();
    java.lang.Integer i16 = iP14.getFourth();
    singlyLinkedList8.add(iP14);
    boolean b19 = iP14.equals((java.lang.Object)2147483647);
    tp2.IPBan iPBan21 = new tp2.IPBan(iP14, (java.lang.Long)(-1L));
    java.lang.Long long22 = iPBan21.expires;
    tp2.IP iP27 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP27.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan31 = new tp2.IPBan(iP27, (java.lang.Long)100L);
    tp2.IP iP32 = iPBan31.ip;
    iP32.setThird((java.lang.Integer)356246784);
    iPBan21.ip = iP32;
    boolean b36 = strictlySortedSinglyLinkedList0.add(iPBan21);
    tp2.Node node37 = null;
    strictlySortedSinglyLinkedList0.header = node37;
    strictlySortedSinglyLinkedList0.size = 57347;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i15 + "' != '" + (-1)+ "'", i15.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i16 + "' != '" + 100+ "'", i16.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-1L)+ "'", long22.equals((-1L)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == true);

  }

  @Test
  public void test469() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test469"); }


    // The following exception was thrown during execution in test generation
    try {
      int i2 = java.lang.Integer.parseUnsignedInt("110100011100111011110000001", 8389952);
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

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test470"); }


    java.lang.String str1 = java.lang.Integer.toHexString((-1135833984));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "bc4c8c80"+ "'", str1.equals("bc4c8c80"));

  }

  @Test
  public void test471() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test471"); }


    int i2 = java.lang.Integer.divideUnsigned((-1060148736), 1270177888);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 2);

  }

  @Test
  public void test472() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test472"); }


    int i2 = java.lang.Integer.divideUnsigned(200000200, (-232748806));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);

  }

  @Test
  public void test473() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test473"); }


    int i2 = java.lang.Integer.remainderUnsigned(655296, 4835);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 2571);

  }

  @Test
  public void test474() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test474"); }


    // The following exception was thrown during execution in test generation
    try {
      int i2 = java.lang.Integer.parseInt("10001", (-1073741817));
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test475() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test475"); }


    // The following exception was thrown during execution in test generation
    try {
      int i2 = java.lang.Integer.parseInt("9dd6da6", 1140850691);
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

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test476"); }


    int i1 = java.lang.Integer.highestOneBit(131116);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 131072);

  }

  @Test
  public void test477() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test477"); }


    int i2 = java.lang.Integer.rotateRight(17856, 72310545);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 585105408);

  }

  @Test
  public void test478() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test478"); }


    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList0 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b1 = strictlySortedSinglyLinkedList0.repOK();
    tp2.IP iP6 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i7 = iP6.getSecond();
    iP6.setFirst((java.lang.Integer)11001000);
    iP6.setFirst((java.lang.Integer)(-2147483648));
    boolean b12 = strictlySortedSinglyLinkedList0.removeFromIP(iP6);
    boolean b13 = strictlySortedSinglyLinkedList0.repOK();
    int i14 = strictlySortedSinglyLinkedList0.size;
    int i15 = strictlySortedSinglyLinkedList0.getSize();
    int i16 = strictlySortedSinglyLinkedList0.size;
    tp2.IP iP21 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i22 = iP21.getSecond();
    iP21.setFirst((java.lang.Integer)11001000);
    java.lang.Long long25 = null;
    tp2.IPBan iPBan26 = new tp2.IPBan(iP21, long25);
    java.lang.Long long27 = iPBan26.getExpires();
    iPBan26.expires = 1L;
    java.lang.Long long30 = iPBan26.getExpires();
    java.lang.Long long31 = iPBan26.getExpires();
    tp2.SinglyLinkedList singlyLinkedList32 = new tp2.SinglyLinkedList();
    int i33 = singlyLinkedList32.getSize();
    tp2.IP iP38 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i39 = iP38.getSecond();
    java.lang.Integer i40 = iP38.getFourth();
    singlyLinkedList32.add(iP38);
    iP38.setFourth((java.lang.Integer)167772160);
    iP38.setSecond((java.lang.Integer)0);
    iP38.setThird((java.lang.Integer)30);
    iP38.setThird((java.lang.Integer)16762403);
    iPBan26.ip = iP38;
    boolean b51 = strictlySortedSinglyLinkedList0.removeFromIP(iP38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i7 + "' != '" + (-1)+ "'", i7.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i22 + "' != '" + (-1)+ "'", i22.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(long27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long30 + "' != '" + 1L+ "'", long30.equals(1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long31 + "' != '" + 1L+ "'", long31.equals(1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i39 + "' != '" + (-1)+ "'", i39.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i40 + "' != '" + 100+ "'", i40.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b51 == false);

  }

  @Test
  public void test479() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test479"); }


    java.lang.String str2 = java.lang.Integer.toUnsignedString(9, 649456288);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "9"+ "'", str2.equals("9"));

  }

  @Test
  public void test480() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test480"); }


    int i2 = java.lang.Integer.min((-1977024512), 335561509);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == (-1977024512));

  }

  @Test
  public void test481() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test481"); }


    java.lang.String str2 = java.lang.Integer.toUnsignedString(160, (-669283115));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "160"+ "'", str2.equals("160"));

  }

  @Test
  public void test482() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test482"); }


    java.lang.String str2 = java.lang.Integer.toUnsignedString(109158832, 24117248);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "109158832"+ "'", str2.equals("109158832"));

  }

  @Test
  public void test483() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test483"); }


    java.lang.Integer i1 = java.lang.Integer.decode("11");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 11+ "'", i1.equals(11));

  }

  @Test
  public void test484() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test484"); }


    java.lang.String str2 = java.lang.Integer.toUnsignedString(5632, 64314);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "5632"+ "'", str2.equals("5632"));

  }

  @Test
  public void test485() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test485"); }


    int i2 = java.lang.Integer.compareUnsigned(46032486, (-1254359808));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == (-1));

  }

  @Test
  public void test486() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test486"); }


    long long1 = java.lang.Integer.toUnsignedLong(33566720);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == 33566720L);

  }

  @Test
  public void test487() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test487"); }


    java.lang.Integer i1 = java.lang.Integer.valueOf((-1073741443));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + (-1073741443)+ "'", i1.equals((-1073741443)));

  }

  @Test
  public void test488() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test488"); }


    int i1 = java.lang.Integer.lowestOneBit(340);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 4);

  }

  @Test
  public void test489() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test489"); }


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
    java.lang.Long long42 = iPBan29.getExpires();
    tp2.SinglyLinkedList singlyLinkedList43 = new tp2.SinglyLinkedList();
    int i44 = singlyLinkedList43.getSize();
    int i45 = singlyLinkedList43.getSize();
    tp2.IP iP46 = null;
    boolean b47 = singlyLinkedList43.contains(iP46);
    tp2.IP iP49 = singlyLinkedList43.get(27);
    tp2.IP iP54 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP54.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan58 = new tp2.IPBan(iP54, (java.lang.Long)100L);
    tp2.IP iP59 = iPBan58.ip;
    tp2.IP iP64 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP64.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan68 = new tp2.IPBan(iP64, (java.lang.Long)100L);
    iPBan58.setIp(iP64);
    boolean b70 = singlyLinkedList43.remove(iP64);
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
    tp2.IPBan iPBan93 = new tp2.IPBan(iP87, (java.lang.Long)10L);
    boolean b94 = singlyLinkedList43.contains(iP87);
    iPBan29.setIp(iP87);
    java.lang.Integer i96 = iP87.getFourth();
    
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
    org.junit.Assert.assertTrue("'" + long42 + "' != '" + 100L+ "'", long42.equals(100L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i44 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i45 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b47 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP59);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b70 == false);
    
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
    org.junit.Assert.assertTrue(b94 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i96 + "' != '" + 100+ "'", i96.equals(100));

  }

  @Test
  public void test490() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test490"); }


    java.lang.String str1 = java.lang.Integer.toUnsignedString(469779399);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "469779399"+ "'", str1.equals("469779399"));

  }

  @Test
  public void test491() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test491"); }


    tp2.IP iP4 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP4.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan8 = new tp2.IPBan(iP4, (java.lang.Long)100L);
    iP4.setFourth((java.lang.Integer)32);
    java.lang.Integer i11 = iP4.getFirst();
    iP4.setSecond((java.lang.Integer)(-1275068414));
    tp2.IPBan iPBan15 = new tp2.IPBan(iP4, (java.lang.Long)2684647292L);
    iP4.setFirst((java.lang.Integer)6391283);
    java.lang.Integer i18 = iP4.getSecond();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i11 + "' != '" + 200+ "'", i11.equals(200));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i18 + "' != '" + (-1275068414)+ "'", i18.equals((-1275068414)));

  }

  @Test
  public void test492() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test492"); }


    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList0 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b1 = strictlySortedSinglyLinkedList0.repOK();
    tp2.IP iP6 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    boolean b7 = strictlySortedSinglyLinkedList0.containsIP(iP6);
    tp2.IPBan iPBan9 = strictlySortedSinglyLinkedList0.get(176016000);
    int i10 = strictlySortedSinglyLinkedList0.getSize();
    tp2.IP iP15 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i16 = iP15.getSecond();
    iP15.setFirst((java.lang.Integer)11001000);
    java.lang.Long long19 = null;
    tp2.IPBan iPBan20 = new tp2.IPBan(iP15, long19);
    java.lang.Long long21 = iPBan20.getExpires();
    tp2.SinglyLinkedList singlyLinkedList22 = new tp2.SinglyLinkedList();
    boolean b23 = singlyLinkedList22.repOK();
    tp2.IP iP28 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP28.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan32 = new tp2.IPBan(iP28, (java.lang.Long)100L);
    tp2.IP iP37 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP37.setFirst((java.lang.Integer)200);
    java.lang.Integer i40 = iP37.getFourth();
    iPBan32.setIp(iP37);
    singlyLinkedList22.add(iP37);
    iPBan20.setIp(iP37);
    java.lang.Long long44 = iPBan20.getExpires();
    iPBan20.setExpires((java.lang.Long)51756492L);
    tp2.IP iP51 = new tp2.IP((java.lang.Integer)160, (java.lang.Integer)1, (java.lang.Integer)27, (java.lang.Integer)(-2));
    java.lang.Integer i52 = iP51.getFourth();
    java.lang.Integer i53 = iP51.getFourth();
    iPBan20.setIp(iP51);
    boolean b55 = strictlySortedSinglyLinkedList0.removeFromIP(iP51);
    tp2.IPBan iPBan57 = strictlySortedSinglyLinkedList0.get(1594950735);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iPBan9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i16 + "' != '" + (-1)+ "'", i16.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(long21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i40 + "' != '" + 100+ "'", i40.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(long44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i52 + "' != '" + (-2)+ "'", i52.equals((-2)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i53 + "' != '" + (-2)+ "'", i53.equals((-2)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b55 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iPBan57);

  }

  @Test
  public void test493() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test493"); }


    int i1 = java.lang.Integer.lowestOneBit(486539264);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 16777216);

  }

  @Test
  public void test494() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test494"); }


    int i2 = java.lang.Integer.remainderUnsigned((-1442840576), 93754428);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 39493880);

  }

  @Test
  public void test495() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test495"); }


    tp2.SinglyLinkedList singlyLinkedList0 = new tp2.SinglyLinkedList();
    int i1 = singlyLinkedList0.getSize();
    tp2.IP iP6 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i7 = iP6.getSecond();
    java.lang.Integer i8 = iP6.getFourth();
    singlyLinkedList0.add(iP6);
    tp2.IP iP11 = singlyLinkedList0.get(5);
    boolean b12 = singlyLinkedList0.isEmpty();
    int i13 = singlyLinkedList0.getSize();
    boolean b14 = singlyLinkedList0.repOK();
    tp2.IP iP16 = singlyLinkedList0.get((-1808013914));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i7 + "' != '" + (-1)+ "'", i7.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i8 + "' != '" + 100+ "'", i8.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP16);

  }

  @Test
  public void test496() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test496"); }


    long long1 = java.lang.Integer.toUnsignedLong(1476395008);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == 1476395008L);

  }

  @Test
  public void test497() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test497"); }


    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList0 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b1 = strictlySortedSinglyLinkedList0.repOK();
    tp2.IP iP6 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    boolean b7 = strictlySortedSinglyLinkedList0.containsIP(iP6);
    tp2.Node node8 = strictlySortedSinglyLinkedList0.header;
    boolean b9 = strictlySortedSinglyLinkedList0.isEmpty();
    int i10 = strictlySortedSinglyLinkedList0.getSize();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList11 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b12 = strictlySortedSinglyLinkedList11.repOK();
    tp2.IP iP17 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i18 = iP17.getSecond();
    iP17.setFirst((java.lang.Integer)11001000);
    iP17.setFirst((java.lang.Integer)(-2147483648));
    boolean b23 = strictlySortedSinglyLinkedList11.removeFromIP(iP17);
    tp2.Node node24 = strictlySortedSinglyLinkedList11.header;
    strictlySortedSinglyLinkedList0.header = node24;
    tp2.SinglyLinkedList singlyLinkedList26 = new tp2.SinglyLinkedList();
    int i27 = singlyLinkedList26.getSize();
    tp2.IP iP32 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i33 = iP32.getSecond();
    java.lang.Integer i34 = iP32.getFourth();
    singlyLinkedList26.add(iP32);
    tp2.IPBan iPBan37 = new tp2.IPBan(iP32, (java.lang.Long)1L);
    tp2.SinglyLinkedList singlyLinkedList38 = new tp2.SinglyLinkedList();
    int i39 = singlyLinkedList38.getSize();
    tp2.IP iP44 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i45 = iP44.getSecond();
    java.lang.Integer i46 = iP44.getFourth();
    singlyLinkedList38.add(iP44);
    iP44.setFourth((java.lang.Integer)167772160);
    iP44.setSecond((java.lang.Integer)0);
    iPBan37.setIp(iP44);
    tp2.IP iP57 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP57.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan61 = new tp2.IPBan(iP57, (java.lang.Long)100L);
    tp2.IP iP62 = iPBan61.ip;
    tp2.IP iP63 = iPBan61.getIp();
    java.lang.Integer i64 = null;
    iP63.setFirst(i64);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList66 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b67 = strictlySortedSinglyLinkedList66.repOK();
    tp2.IP iP72 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i73 = iP72.getSecond();
    iP72.setFirst((java.lang.Integer)11001000);
    iP72.setFirst((java.lang.Integer)(-2147483648));
    boolean b78 = strictlySortedSinglyLinkedList66.removeFromIP(iP72);
    boolean b79 = iP63.equals((java.lang.Object)strictlySortedSinglyLinkedList66);
    tp2.IP iP84 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP84.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan88 = new tp2.IPBan(iP84, (java.lang.Long)100L);
    boolean b89 = strictlySortedSinglyLinkedList66.removeFromIP(iP84);
    java.lang.Integer i90 = iP84.getFirst();
    iPBan37.ip = iP84;
    boolean b92 = strictlySortedSinglyLinkedList0.contains(iPBan37);
    boolean b93 = strictlySortedSinglyLinkedList0.repOK();
    boolean b94 = strictlySortedSinglyLinkedList0.repOK();
    int i95 = strictlySortedSinglyLinkedList0.getSize();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList96 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b97 = strictlySortedSinglyLinkedList96.isEmpty();
    tp2.Node node98 = strictlySortedSinglyLinkedList96.header;
    strictlySortedSinglyLinkedList0.header = node98;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i18 + "' != '" + (-1)+ "'", i18.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i33 + "' != '" + (-1)+ "'", i33.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i34 + "' != '" + 100+ "'", i34.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i39 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i45 + "' != '" + (-1)+ "'", i45.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i46 + "' != '" + 100+ "'", i46.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP62);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP63);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b67 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i73 + "' != '" + (-1)+ "'", i73.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b78 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b79 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b89 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i90 + "' != '" + 200+ "'", i90.equals(200));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b92 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b93 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b94 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i95 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b97 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node98);

  }

  @Test
  public void test498() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test498"); }


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
    iP80.setSecond(i83);
    
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

  }

  @Test
  public void test499() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test499"); }


    java.lang.String str2 = java.lang.Integer.toUnsignedString(52, (-536870909));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "52"+ "'", str2.equals("52"));

  }

  @Test
  public void test500() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test500"); }


    int i1 = java.lang.Integer.signum((-1478580180));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == (-1));

  }

}
