package randoopTestsWithoutServer1;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest37 {

  public static boolean debug = false;

  @Test
  public void test001() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test001"); }


    java.lang.String str1 = java.lang.Integer.toBinaryString(928);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "1110100000"+ "'", str1.equals("1110100000"));

  }

  @Test
  public void test002() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test002"); }


    tp2.SinglyLinkedList singlyLinkedList0 = new tp2.SinglyLinkedList();
    boolean b1 = singlyLinkedList0.repOK();
    tp2.IP iP3 = singlyLinkedList0.get(200);
    boolean b4 = singlyLinkedList0.isEmpty();
    boolean b5 = singlyLinkedList0.repOK();
    boolean b6 = singlyLinkedList0.repOK();
    int i7 = singlyLinkedList0.getSize();
    boolean b8 = singlyLinkedList0.isEmpty();
    int i9 = singlyLinkedList0.getSize();
    boolean b10 = singlyLinkedList0.repOK();
    int i11 = singlyLinkedList0.getSize();
    boolean b12 = singlyLinkedList0.repOK();
    
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
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);

  }

  @Test
  public void test003() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test003"); }


    // The following exception was thrown during execution in test generation
    try {
      java.lang.Integer i1 = java.lang.Integer.valueOf("6b981");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test004() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test004"); }


    java.lang.Integer i1 = java.lang.Integer.valueOf(330106500);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 330106500+ "'", i1.equals(330106500));

  }

  @Test
  public void test005() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test005"); }


    int i1 = java.lang.Integer.numberOfTrailingZeros(8298);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 1);

  }

  @Test
  public void test006() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test006"); }


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
    java.lang.Long long37 = iPBan21.getExpires();
    tp2.IP iP38 = iPBan21.getIp();
    java.lang.Long long39 = iPBan21.expires;
    tp2.IP iP40 = iPBan21.ip;
    java.lang.Integer i41 = iP40.getFirst();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long37 + "' != '" + (-1L)+ "'", long37.equals((-1L)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long39 + "' != '" + (-1L)+ "'", long39.equals((-1L)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i41 + "' != '" + 200+ "'", i41.equals(200));

  }

  @Test
  public void test007() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test007"); }


    int i1 = java.lang.Integer.reverseBytes(11066535);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == (-1478711296));

  }

  @Test
  public void test008() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test008"); }


    int i1 = java.lang.Integer.highestOneBit(56594139);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 33554432);

  }

  @Test
  public void test009() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test009"); }


    int i2 = java.lang.Integer.sum(329, 2013265920);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 2013266249);

  }

  @Test
  public void test010() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test010"); }


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
    tp2.IP iP34 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP34.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan38 = new tp2.IPBan(iP34, (java.lang.Long)100L);
    tp2.IP iP43 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iPBan38.setIp(iP43);
    iP43.setSecond((java.lang.Integer)8);
    iP43.setFourth((java.lang.Integer)24);
    singlyLinkedList0.add(iP43);
    boolean b50 = singlyLinkedList0.isEmpty();
    boolean b51 = singlyLinkedList0.isEmpty();
    tp2.SinglyLinkedList singlyLinkedList52 = new tp2.SinglyLinkedList();
    int i53 = singlyLinkedList52.getSize();
    tp2.IP iP58 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i59 = iP58.getSecond();
    java.lang.Integer i60 = iP58.getFourth();
    singlyLinkedList52.add(iP58);
    tp2.IPBan iPBan63 = new tp2.IPBan(iP58, (java.lang.Long)1L);
    java.lang.Integer i64 = iP58.getThird();
    java.lang.Integer i65 = iP58.getFourth();
    java.lang.Integer i66 = iP58.getSecond();
    java.lang.Integer i67 = iP58.getFourth();
    singlyLinkedList0.add(iP58);
    
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
    org.junit.Assert.assertTrue(b50 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b51 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i53 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i59 + "' != '" + (-1)+ "'", i59.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i60 + "' != '" + 100+ "'", i60.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i64 + "' != '" + (-1)+ "'", i64.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i65 + "' != '" + 100+ "'", i65.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i66 + "' != '" + (-1)+ "'", i66.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i67 + "' != '" + 100+ "'", i67.equals(100));

  }

  @Test
  public void test011() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test011"); }


    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList0 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b1 = strictlySortedSinglyLinkedList0.repOK();
    tp2.IP iP6 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    boolean b7 = strictlySortedSinglyLinkedList0.containsIP(iP6);
    tp2.IPBan iPBan9 = strictlySortedSinglyLinkedList0.get(176016000);
    int i10 = strictlySortedSinglyLinkedList0.getSize();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList11 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b12 = strictlySortedSinglyLinkedList11.repOK();
    strictlySortedSinglyLinkedList11.size = 1;
    strictlySortedSinglyLinkedList11.size = 0;
    tp2.IP iP21 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP21.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan25 = new tp2.IPBan(iP21, (java.lang.Long)100L);
    tp2.IP iP26 = iPBan25.ip;
    boolean b27 = strictlySortedSinglyLinkedList11.contains(iPBan25);
    boolean b28 = strictlySortedSinglyLinkedList11.repOK();
    tp2.SinglyLinkedList singlyLinkedList29 = new tp2.SinglyLinkedList();
    int i30 = singlyLinkedList29.getSize();
    tp2.IP iP35 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i36 = iP35.getSecond();
    java.lang.Integer i37 = iP35.getFourth();
    singlyLinkedList29.add(iP35);
    boolean b40 = iP35.equals((java.lang.Object)2147483647);
    tp2.IPBan iPBan42 = new tp2.IPBan(iP35, (java.lang.Long)(-1L));
    boolean b43 = strictlySortedSinglyLinkedList11.add(iPBan42);
    boolean b44 = strictlySortedSinglyLinkedList0.contains(iPBan42);
    tp2.SinglyLinkedList singlyLinkedList45 = new tp2.SinglyLinkedList();
    boolean b46 = singlyLinkedList45.repOK();
    tp2.IP iP51 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP51.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan55 = new tp2.IPBan(iP51, (java.lang.Long)100L);
    iP51.setFourth((java.lang.Integer)32);
    singlyLinkedList45.add(iP51);
    boolean b59 = singlyLinkedList45.isEmpty();
    tp2.SinglyLinkedList singlyLinkedList60 = new tp2.SinglyLinkedList();
    int i61 = singlyLinkedList60.getSize();
    tp2.IP iP66 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP66.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan70 = new tp2.IPBan(iP66, (java.lang.Long)100L);
    tp2.IP iP71 = iPBan70.ip;
    tp2.SinglyLinkedList singlyLinkedList72 = new tp2.SinglyLinkedList();
    int i73 = singlyLinkedList72.getSize();
    tp2.IP iP78 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i79 = iP78.getSecond();
    java.lang.Integer i80 = iP78.getFourth();
    singlyLinkedList72.add(iP78);
    boolean b82 = iP71.equals((java.lang.Object)iP78);
    boolean b83 = singlyLinkedList60.remove(iP71);
    boolean b84 = singlyLinkedList45.remove(iP71);
    iPBan42.ip = iP71;
    iPBan42.expires = 7L;
    iPBan42.expires = 1330343L;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iPBan9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i36 + "' != '" + (-1)+ "'", i36.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i37 + "' != '" + 100+ "'", i37.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b43 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b46 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b59 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i61 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP71);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i73 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i79 + "' != '" + (-1)+ "'", i79.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i80 + "' != '" + 100+ "'", i80.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b82 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b83 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b84 == false);

  }

  @Test
  public void test012() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test012"); }


    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList0 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b1 = strictlySortedSinglyLinkedList0.repOK();
    strictlySortedSinglyLinkedList0.size = 1;
    strictlySortedSinglyLinkedList0.size = 0;
    tp2.IPBan iPBan6 = null;
    boolean b7 = strictlySortedSinglyLinkedList0.add(iPBan6);
    strictlySortedSinglyLinkedList0.size = (-2147483648);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList10 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b11 = strictlySortedSinglyLinkedList10.repOK();
    tp2.IP iP16 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    boolean b17 = strictlySortedSinglyLinkedList10.containsIP(iP16);
    tp2.Node node18 = strictlySortedSinglyLinkedList10.header;
    boolean b19 = strictlySortedSinglyLinkedList10.isEmpty();
    int i20 = strictlySortedSinglyLinkedList10.getSize();
    int i21 = strictlySortedSinglyLinkedList10.size;
    strictlySortedSinglyLinkedList10.size = (-2);
    boolean b24 = strictlySortedSinglyLinkedList10.repOK();
    int i25 = strictlySortedSinglyLinkedList10.size;
    tp2.Node node26 = strictlySortedSinglyLinkedList10.header;
    strictlySortedSinglyLinkedList0.header = node26;
    boolean b28 = strictlySortedSinglyLinkedList0.isEmpty();
    tp2.IP iP29 = null;
    boolean b30 = strictlySortedSinglyLinkedList0.containsIP(iP29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == (-2));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);

  }

  @Test
  public void test013() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test013"); }


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
    java.lang.Integer i46 = iP39.getFourth();
    
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
    org.junit.Assert.assertTrue("'" + i46 + "' != '" + 100+ "'", i46.equals(100));

  }

  @Test
  public void test014() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test014"); }


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
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList61 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b62 = strictlySortedSinglyLinkedList61.repOK();
    tp2.IP iP67 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i68 = iP67.getSecond();
    iP67.setFirst((java.lang.Integer)11001000);
    iP67.setFirst((java.lang.Integer)(-2147483648));
    boolean b73 = strictlySortedSinglyLinkedList61.removeFromIP(iP67);
    tp2.IPBan iPBan75 = new tp2.IPBan(iP67, (java.lang.Long)0L);
    tp2.IP iP76 = iPBan75.getIp();
    java.lang.Long long77 = iPBan75.getExpires();
    java.lang.Long long78 = iPBan75.expires;
    boolean b79 = strictlySortedSinglyLinkedList0.contains(iPBan75);
    boolean b80 = strictlySortedSinglyLinkedList0.repOK();
    int i81 = strictlySortedSinglyLinkedList0.size;
    
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
    org.junit.Assert.assertTrue(b62 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i68 + "' != '" + (-1)+ "'", i68.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b73 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP76);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long77 + "' != '" + 0L+ "'", long77.equals(0L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long78 + "' != '" + 0L+ "'", long78.equals(0L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b79 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b80 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i81 == 2147483646);

  }

  @Test
  public void test015() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test015"); }


    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList0 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b1 = strictlySortedSinglyLinkedList0.repOK();
    strictlySortedSinglyLinkedList0.size = 1;
    strictlySortedSinglyLinkedList0.size = 0;
    tp2.IP iP10 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i11 = iP10.getFourth();
    java.lang.Integer i12 = iP10.getFourth();
    iP10.setThird((java.lang.Integer)200);
    iP10.setThird((java.lang.Integer)356246787);
    boolean b17 = strictlySortedSinglyLinkedList0.containsIP(iP10);
    boolean b18 = strictlySortedSinglyLinkedList0.repOK();
    tp2.Node node19 = strictlySortedSinglyLinkedList0.header;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i11 + "' != '" + 100+ "'", i11.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i12 + "' != '" + 100+ "'", i12.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node19);

  }

  @Test
  public void test016() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test016"); }


    java.lang.String str1 = java.lang.Integer.toOctalString(5244416);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "24003000"+ "'", str1.equals("24003000"));

  }

  @Test
  public void test017() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test017"); }


    int i2 = java.lang.Integer.compare(483050781, 167772160);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);

  }

  @Test
  public void test018() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test018"); }


    int i1 = java.lang.Integer.highestOneBit((-2119381594));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == (-2147483648));

  }

  @Test
  public void test019() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test019"); }


    java.lang.Integer i1 = java.lang.Integer.valueOf(295365732);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 295365732+ "'", i1.equals(295365732));

  }

  @Test
  public void test020() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test020"); }


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
    int i28 = singlyLinkedList0.getSize();
    tp2.IP iP33 = new tp2.IP((java.lang.Integer)22265424, (java.lang.Integer)94, (java.lang.Integer)55681743, (java.lang.Integer)(-671088640));
    java.lang.Integer i34 = iP33.getFirst();
    boolean b35 = singlyLinkedList0.contains(iP33);
    boolean b36 = singlyLinkedList0.repOK();
    int i37 = singlyLinkedList0.getSize();
    boolean b38 = singlyLinkedList0.repOK();
    
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
    org.junit.Assert.assertTrue(i28 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i34 + "' != '" + 22265424+ "'", i34.equals(22265424));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i37 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == true);

  }

  @Test
  public void test021() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test021"); }


    int i1 = java.lang.Integer.parseInt("44000000");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 44000000);

  }

  @Test
  public void test022() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test022"); }


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
    java.lang.Long long56 = iPBan53.getExpires();
    tp2.IP iP57 = iPBan53.ip;
    tp2.IP iP58 = iPBan53.ip;
    iPBan53.setExpires((java.lang.Long)1386990416L);
    
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
    org.junit.Assert.assertTrue("'" + long56 + "' != '" + 100L+ "'", long56.equals(100L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP58);

  }

  @Test
  public void test023() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test023"); }


    long long1 = java.lang.Integer.toUnsignedLong(514056);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == 514056L);

  }

  @Test
  public void test024() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test024"); }


    java.lang.Integer i2 = java.lang.Integer.getInteger("103ec84", 956498237);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i2 + "' != '" + 956498237+ "'", i2.equals(956498237));

  }

  @Test
  public void test025() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test025"); }


    int i2 = java.lang.Integer.divideUnsigned(7669584, 1431655808);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);

  }

  @Test
  public void test026() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test026"); }


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
    int i28 = strictlySortedSinglyLinkedList0.size;
    int i29 = strictlySortedSinglyLinkedList0.size;
    tp2.Node node30 = strictlySortedSinglyLinkedList0.header;
    int i31 = strictlySortedSinglyLinkedList0.getSize();
    
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
    org.junit.Assert.assertTrue(i28 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i29 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i31 == 0);

  }

  @Test
  public void test027() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test027"); }


    int i2 = java.lang.Integer.max(1885180690, 404);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1885180690);

  }

  @Test
  public void test028() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test028"); }


    int i1 = java.lang.Integer.parseInt("216");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 216);

  }

  @Test
  public void test029() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test029"); }


    tp2.SinglyLinkedList singlyLinkedList0 = new tp2.SinglyLinkedList();
    boolean b1 = singlyLinkedList0.repOK();
    tp2.IP iP3 = singlyLinkedList0.get(200);
    boolean b4 = singlyLinkedList0.isEmpty();
    boolean b5 = singlyLinkedList0.repOK();
    boolean b6 = singlyLinkedList0.repOK();
    tp2.IP iP11 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i12 = iP11.getThird();
    singlyLinkedList0.add(iP11);
    boolean b14 = singlyLinkedList0.isEmpty();
    boolean b15 = singlyLinkedList0.repOK();
    tp2.SinglyLinkedList singlyLinkedList16 = new tp2.SinglyLinkedList();
    int i17 = singlyLinkedList16.getSize();
    boolean b18 = singlyLinkedList16.isEmpty();
    tp2.IP iP23 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP23.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan27 = new tp2.IPBan(iP23, (java.lang.Long)100L);
    tp2.IP iP28 = iPBan27.ip;
    tp2.IP iP29 = iPBan27.getIp();
    tp2.IP iP34 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP34.setFirst((java.lang.Integer)200);
    iPBan27.ip = iP34;
    iP34.setFourth((java.lang.Integer)242);
    singlyLinkedList16.add(iP34);
    boolean b41 = singlyLinkedList0.contains(iP34);
    java.lang.Integer i42 = iP34.getFirst();
    tp2.IPBan iPBan44 = new tp2.IPBan(iP34, (java.lang.Long)13L);
    tp2.IP iP45 = iPBan44.getIp();
    iPBan44.setExpires((java.lang.Long)3232226472L);
    
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
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i42 + "' != '" + 200+ "'", i42.equals(200));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP45);

  }

  @Test
  public void test030() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test030"); }


    // The following exception was thrown during execution in test generation
    try {
      int i2 = java.lang.Integer.parseUnsignedInt("506241", 2582468);
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test031() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test031"); }


    java.lang.String str1 = java.lang.Integer.toBinaryString(2302);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "100011111110"+ "'", str1.equals("100011111110"));

  }

  @Test
  public void test032() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test032"); }


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
    tp2.IP iP31 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP31.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan35 = new tp2.IPBan(iP31, (java.lang.Long)100L);
    tp2.IP iP36 = iPBan35.ip;
    tp2.IP iP37 = iPBan35.getIp();
    java.lang.Integer i38 = null;
    iP37.setFirst(i38);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList40 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b41 = strictlySortedSinglyLinkedList40.repOK();
    tp2.IP iP46 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i47 = iP46.getSecond();
    iP46.setFirst((java.lang.Integer)11001000);
    iP46.setFirst((java.lang.Integer)(-2147483648));
    boolean b52 = strictlySortedSinglyLinkedList40.removeFromIP(iP46);
    boolean b53 = iP37.equals((java.lang.Object)strictlySortedSinglyLinkedList40);
    tp2.IP iP58 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP58.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan62 = new tp2.IPBan(iP58, (java.lang.Long)100L);
    boolean b63 = strictlySortedSinglyLinkedList40.removeFromIP(iP58);
    java.lang.Integer i64 = iP58.getFirst();
    iPBan11.ip = iP58;
    tp2.IPBan iPBan67 = new tp2.IPBan(iP58, (java.lang.Long)4L);
    java.lang.Integer i68 = iP58.getFirst();
    iP58.setSecond((java.lang.Integer)59392);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i47 + "' != '" + (-1)+ "'", i47.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b52 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b53 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b63 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i64 + "' != '" + 200+ "'", i64.equals(200));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i68 + "' != '" + 200+ "'", i68.equals(200));

  }

  @Test
  public void test033() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test033"); }


    int i2 = java.lang.Integer.divideUnsigned((-1770491153), (-741089280));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);

  }

  @Test
  public void test034() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test034"); }


    java.lang.String str1 = java.lang.Integer.toBinaryString(411648);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "1100100100000000000"+ "'", str1.equals("1100100100000000000"));

  }

  @Test
  public void test035() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test035"); }


    tp2.SinglyLinkedList singlyLinkedList0 = new tp2.SinglyLinkedList();
    boolean b1 = singlyLinkedList0.repOK();
    tp2.IP iP6 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP6.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan10 = new tp2.IPBan(iP6, (java.lang.Long)100L);
    iP6.setFourth((java.lang.Integer)32);
    singlyLinkedList0.add(iP6);
    boolean b14 = singlyLinkedList0.repOK();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList15 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b16 = strictlySortedSinglyLinkedList15.repOK();
    tp2.IP iP21 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    boolean b22 = strictlySortedSinglyLinkedList15.containsIP(iP21);
    tp2.Node node23 = strictlySortedSinglyLinkedList15.header;
    boolean b24 = strictlySortedSinglyLinkedList15.isEmpty();
    tp2.IPBan iPBan26 = strictlySortedSinglyLinkedList15.get(3);
    strictlySortedSinglyLinkedList15.size = 200;
    tp2.IPBan iPBan30 = strictlySortedSinglyLinkedList15.get(1610612736);
    tp2.SinglyLinkedList singlyLinkedList31 = new tp2.SinglyLinkedList();
    int i32 = singlyLinkedList31.getSize();
    tp2.IP iP37 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i38 = iP37.getSecond();
    java.lang.Integer i39 = iP37.getFourth();
    singlyLinkedList31.add(iP37);
    tp2.IP iP42 = singlyLinkedList31.get(5);
    boolean b43 = singlyLinkedList31.repOK();
    tp2.IP iP45 = singlyLinkedList31.get(2013265920);
    tp2.IP iP47 = singlyLinkedList31.get((-1));
    java.lang.Integer i48 = iP47.getThird();
    boolean b49 = strictlySortedSinglyLinkedList15.removeFromIP(iP47);
    boolean b50 = strictlySortedSinglyLinkedList15.isEmpty();
    tp2.SinglyLinkedList singlyLinkedList51 = new tp2.SinglyLinkedList();
    int i52 = singlyLinkedList51.getSize();
    tp2.IP iP57 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i58 = iP57.getSecond();
    java.lang.Integer i59 = iP57.getFourth();
    singlyLinkedList51.add(iP57);
    java.lang.Integer i61 = iP57.getSecond();
    boolean b62 = strictlySortedSinglyLinkedList15.containsIP(iP57);
    boolean b63 = singlyLinkedList0.remove(iP57);
    int i64 = singlyLinkedList0.getSize();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
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
    org.junit.Assert.assertNull(iPBan26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iPBan30);
    
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
    org.junit.Assert.assertNotNull(iP47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i48 + "' != '" + (-1)+ "'", i48.equals((-1)));
    
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
    org.junit.Assert.assertTrue("'" + i61 + "' != '" + (-1)+ "'", i61.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b62 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b63 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i64 == 1);

  }

  @Test
  public void test036() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test036"); }


    int i2 = java.lang.Integer.sum((-2118580736), 1885180690);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == (-233400046));

  }

  @Test
  public void test037() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test037"); }


    tp2.IP iP4 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i5 = iP4.getSecond();
    iP4.setFirst((java.lang.Integer)11001000);
    java.lang.Long long8 = null;
    tp2.IPBan iPBan9 = new tp2.IPBan(iP4, long8);
    java.lang.Long long10 = iPBan9.getExpires();
    iPBan9.expires = 1L;
    tp2.IP iP13 = iPBan9.ip;
    java.lang.Integer i14 = iP13.getSecond();
    java.lang.Integer i15 = iP13.getFirst();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i5 + "' != '" + (-1)+ "'", i5.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(long10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i14 + "' != '" + (-1)+ "'", i14.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i15 + "' != '" + 11001000+ "'", i15.equals(11001000));

  }

  @Test
  public void test038() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test038"); }


    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList0 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b1 = strictlySortedSinglyLinkedList0.repOK();
    tp2.IP iP6 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    boolean b7 = strictlySortedSinglyLinkedList0.containsIP(iP6);
    tp2.Node node8 = strictlySortedSinglyLinkedList0.header;
    boolean b9 = strictlySortedSinglyLinkedList0.isEmpty();
    int i10 = strictlySortedSinglyLinkedList0.getSize();
    int i11 = strictlySortedSinglyLinkedList0.size;
    boolean b12 = strictlySortedSinglyLinkedList0.isEmpty();
    tp2.IP iP17 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i18 = iP17.getSecond();
    java.lang.Integer i19 = iP17.getFourth();
    iP17.setFirst((java.lang.Integer)5);
    tp2.IPBan iPBan23 = new tp2.IPBan(iP17, (java.lang.Long)0L);
    iPBan23.expires = 167772160L;
    boolean b26 = strictlySortedSinglyLinkedList0.add(iPBan23);
    java.lang.Long long27 = iPBan23.expires;
    tp2.IP iP28 = iPBan23.getIp();
    iP28.setSecond((java.lang.Integer)73553877);
    iP28.setFourth((java.lang.Integer)56659264);
    
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
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i18 + "' != '" + (-1)+ "'", i18.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i19 + "' != '" + 100+ "'", i19.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long27 + "' != '" + 167772160L+ "'", long27.equals(167772160L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP28);

  }

  @Test
  public void test039() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test039"); }


    int i2 = java.lang.Integer.remainderUnsigned(49676544, 111201102);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 49676544);

  }

  @Test
  public void test040() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test040"); }


    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList0 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b1 = strictlySortedSinglyLinkedList0.repOK();
    tp2.IP iP6 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    boolean b7 = strictlySortedSinglyLinkedList0.containsIP(iP6);
    java.lang.Integer i8 = iP6.getFirst();
    iP6.setFourth((java.lang.Integer)211631616);
    java.lang.Integer i11 = iP6.getFourth();
    tp2.IPBan iPBan13 = new tp2.IPBan(iP6, (java.lang.Long)4195041L);
    iP6.setFirst((java.lang.Integer)(-671088639));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i8 + "' != '" + (-1)+ "'", i8.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i11 + "' != '" + 211631616+ "'", i11.equals(211631616));

  }

  @Test
  public void test041() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test041"); }


    tp2.IP iP0 = null;
    tp2.IPBan iPBan2 = new tp2.IPBan(iP0, (java.lang.Long)117440667L);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList3 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b4 = strictlySortedSinglyLinkedList3.repOK();
    boolean b5 = strictlySortedSinglyLinkedList3.repOK();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList6 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b7 = strictlySortedSinglyLinkedList6.isEmpty();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList8 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b9 = strictlySortedSinglyLinkedList8.repOK();
    tp2.IP iP14 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    boolean b15 = strictlySortedSinglyLinkedList8.containsIP(iP14);
    tp2.Node node16 = strictlySortedSinglyLinkedList8.header;
    strictlySortedSinglyLinkedList6.header = node16;
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList18 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b19 = strictlySortedSinglyLinkedList18.repOK();
    strictlySortedSinglyLinkedList18.size = 1;
    strictlySortedSinglyLinkedList18.size = 0;
    tp2.IP iP28 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP28.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan32 = new tp2.IPBan(iP28, (java.lang.Long)100L);
    tp2.IP iP37 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP37.setFirst((java.lang.Integer)200);
    java.lang.Integer i40 = iP37.getFourth();
    iPBan32.setIp(iP37);
    boolean b42 = strictlySortedSinglyLinkedList18.contains(iPBan32);
    boolean b43 = strictlySortedSinglyLinkedList6.contains(iPBan32);
    boolean b44 = strictlySortedSinglyLinkedList3.add(iPBan32);
    tp2.SinglyLinkedList singlyLinkedList45 = new tp2.SinglyLinkedList();
    boolean b46 = singlyLinkedList45.repOK();
    tp2.IP iP48 = singlyLinkedList45.get(200);
    boolean b49 = singlyLinkedList45.isEmpty();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList50 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b51 = strictlySortedSinglyLinkedList50.repOK();
    tp2.IP iP56 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i57 = iP56.getSecond();
    iP56.setFirst((java.lang.Integer)11001000);
    iP56.setFirst((java.lang.Integer)(-2147483648));
    boolean b62 = strictlySortedSinglyLinkedList50.removeFromIP(iP56);
    boolean b63 = singlyLinkedList45.remove(iP56);
    iPBan32.ip = iP56;
    iPBan2.setIp(iP56);
    tp2.IP iP66 = iPBan2.getIp();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i40 + "' != '" + 100+ "'", i40.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b43 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b46 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b49 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b51 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i57 + "' != '" + (-1)+ "'", i57.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b62 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b63 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP66);

  }

  @Test
  public void test042() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test042"); }


    tp2.SinglyLinkedList singlyLinkedList0 = new tp2.SinglyLinkedList();
    boolean b1 = singlyLinkedList0.repOK();
    tp2.IP iP3 = singlyLinkedList0.get(200);
    boolean b4 = singlyLinkedList0.isEmpty();
    boolean b5 = singlyLinkedList0.repOK();
    boolean b6 = singlyLinkedList0.repOK();
    tp2.IP iP11 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i12 = iP11.getThird();
    singlyLinkedList0.add(iP11);
    boolean b14 = singlyLinkedList0.isEmpty();
    boolean b15 = singlyLinkedList0.repOK();
    tp2.SinglyLinkedList singlyLinkedList16 = new tp2.SinglyLinkedList();
    int i17 = singlyLinkedList16.getSize();
    boolean b18 = singlyLinkedList16.isEmpty();
    tp2.IP iP23 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP23.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan27 = new tp2.IPBan(iP23, (java.lang.Long)100L);
    tp2.IP iP28 = iPBan27.ip;
    tp2.IP iP29 = iPBan27.getIp();
    tp2.IP iP34 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP34.setFirst((java.lang.Integer)200);
    iPBan27.ip = iP34;
    iP34.setFourth((java.lang.Integer)242);
    singlyLinkedList16.add(iP34);
    boolean b41 = singlyLinkedList0.contains(iP34);
    java.lang.Integer i42 = iP34.getFirst();
    tp2.IPBan iPBan44 = new tp2.IPBan(iP34, (java.lang.Long)13L);
    tp2.IP iP45 = iPBan44.getIp();
    java.lang.Integer i46 = iP45.getThird();
    
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
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i42 + "' != '" + 200+ "'", i42.equals(200));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i46 + "' != '" + (-1)+ "'", i46.equals((-1)));

  }

  @Test
  public void test043() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test043"); }


    java.lang.Integer i1 = java.lang.Integer.getInteger("2113402");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);

  }

  @Test
  public void test044() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test044"); }


    java.lang.Integer i2 = java.lang.Integer.getInteger("452984933", (java.lang.Integer)5406720);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i2 + "' != '" + 5406720+ "'", i2.equals(5406720));

  }

  @Test
  public void test045() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test045"); }


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
    tp2.IP iP45 = null;
    boolean b46 = singlyLinkedList0.contains(iP45);
    boolean b47 = singlyLinkedList0.repOK();
    boolean b48 = singlyLinkedList0.isEmpty();
    tp2.SinglyLinkedList singlyLinkedList49 = new tp2.SinglyLinkedList();
    boolean b50 = singlyLinkedList49.repOK();
    int i51 = singlyLinkedList49.getSize();
    boolean b52 = singlyLinkedList49.isEmpty();
    tp2.SinglyLinkedList singlyLinkedList53 = new tp2.SinglyLinkedList();
    int i54 = singlyLinkedList53.getSize();
    tp2.IP iP59 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i60 = iP59.getSecond();
    java.lang.Integer i61 = iP59.getFourth();
    singlyLinkedList53.add(iP59);
    tp2.IP iP64 = singlyLinkedList53.get(5);
    boolean b65 = singlyLinkedList53.repOK();
    tp2.IP iP67 = singlyLinkedList53.get(2013265920);
    tp2.IP iP69 = singlyLinkedList53.get((-1));
    singlyLinkedList49.add(iP69);
    tp2.IPBan iPBan72 = new tp2.IPBan(iP69, (java.lang.Long)96L);
    boolean b73 = singlyLinkedList0.contains(iP69);
    boolean b74 = singlyLinkedList0.isEmpty();
    boolean b75 = singlyLinkedList0.isEmpty();
    
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
    org.junit.Assert.assertTrue(b46 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b47 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b48 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b50 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i51 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b52 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i54 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i60 + "' != '" + (-1)+ "'", i60.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i61 + "' != '" + 100+ "'", i61.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP64);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b65 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP67);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP69);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b73 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b74 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b75 == false);

  }

  @Test
  public void test046() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test046"); }


    int i1 = java.lang.Integer.parseUnsignedInt("67108864");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 67108864);

  }

  @Test
  public void test047() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test047"); }


    java.lang.Integer i2 = java.lang.Integer.getInteger("117085440", (-1062673536));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i2 + "' != '" + (-1062673536)+ "'", i2.equals((-1062673536)));

  }

  @Test
  public void test048() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test048"); }


    java.lang.String str1 = java.lang.Integer.toBinaryString(21102592);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "1010000100000000000000000"+ "'", str1.equals("1010000100000000000000000"));

  }

  @Test
  public void test049() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test049"); }


    java.lang.Integer i1 = java.lang.Integer.decode("120");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 120+ "'", i1.equals(120));

  }

  @Test
  public void test050() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test050"); }


    int i2 = java.lang.Integer.compare((-209547841), 9209415);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == (-1));

  }

  @Test
  public void test051() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test051"); }


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
    tp2.Node node18 = strictlySortedSinglyLinkedList0.header;
    boolean b19 = strictlySortedSinglyLinkedList0.repOK();
    tp2.SinglyLinkedList singlyLinkedList20 = new tp2.SinglyLinkedList();
    boolean b21 = singlyLinkedList20.repOK();
    int i22 = singlyLinkedList20.getSize();
    boolean b23 = singlyLinkedList20.isEmpty();
    tp2.IP iP28 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP28.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan32 = new tp2.IPBan(iP28, (java.lang.Long)100L);
    tp2.IP iP33 = iPBan32.ip;
    tp2.IP iP38 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i39 = iP38.getFourth();
    java.lang.Integer i40 = iP38.getFourth();
    iP38.setThird((java.lang.Integer)200);
    iPBan32.ip = iP38;
    iP38.setFirst((java.lang.Integer)16777216);
    boolean b46 = singlyLinkedList20.contains(iP38);
    tp2.SinglyLinkedList singlyLinkedList47 = new tp2.SinglyLinkedList();
    boolean b48 = singlyLinkedList47.repOK();
    tp2.IP iP50 = singlyLinkedList47.get(200);
    boolean b51 = singlyLinkedList47.isEmpty();
    boolean b52 = singlyLinkedList47.repOK();
    boolean b53 = singlyLinkedList47.repOK();
    tp2.IP iP58 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i59 = iP58.getThird();
    singlyLinkedList47.add(iP58);
    java.lang.Integer i61 = iP58.getFourth();
    boolean b62 = singlyLinkedList20.contains(iP58);
    boolean b63 = singlyLinkedList20.repOK();
    boolean b64 = singlyLinkedList20.repOK();
    boolean b65 = singlyLinkedList20.repOK();
    tp2.IP iP70 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i71 = iP70.getSecond();
    iP70.setFirst((java.lang.Integer)11001000);
    java.lang.Long long74 = null;
    tp2.IPBan iPBan75 = new tp2.IPBan(iP70, long74);
    iP70.setThird((java.lang.Integer)356246784);
    java.lang.Integer i78 = iP70.getFirst();
    boolean b79 = singlyLinkedList20.contains(iP70);
    // The following exception was thrown during execution in test generation
    try {
      boolean b80 = strictlySortedSinglyLinkedList0.containsIP(iP70);
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
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i39 + "' != '" + 100+ "'", i39.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i40 + "' != '" + 100+ "'", i40.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b46 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b48 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b51 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b52 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b53 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i59 + "' != '" + (-1)+ "'", i59.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i61 + "' != '" + 100+ "'", i61.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b62 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b63 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b64 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b65 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i71 + "' != '" + (-1)+ "'", i71.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i78 + "' != '" + 11001000+ "'", i78.equals(11001000));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b79 == false);

  }

  @Test
  public void test052() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test052"); }


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
    tp2.IP iP40 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i41 = iP40.getFourth();
    java.lang.Integer i42 = iP40.getThird();
    boolean b43 = singlyLinkedList0.contains(iP40);
    boolean b44 = singlyLinkedList0.repOK();
    
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
    org.junit.Assert.assertTrue("'" + i41 + "' != '" + 100+ "'", i41.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i42 + "' != '" + (-1)+ "'", i42.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b43 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == true);

  }

  @Test
  public void test053() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test053"); }


    int i1 = java.lang.Integer.highestOneBit((-1067707129));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == (-2147483648));

  }

  @Test
  public void test054() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test054"); }


    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList0 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b1 = strictlySortedSinglyLinkedList0.repOK();
    strictlySortedSinglyLinkedList0.size = 1;
    strictlySortedSinglyLinkedList0.size = 0;
    tp2.IP iP10 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP10.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan14 = new tp2.IPBan(iP10, (java.lang.Long)100L);
    tp2.IP iP15 = iPBan14.ip;
    boolean b16 = strictlySortedSinglyLinkedList0.contains(iPBan14);
    boolean b17 = strictlySortedSinglyLinkedList0.isEmpty();
    tp2.Node node18 = strictlySortedSinglyLinkedList0.header;
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList19 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList20 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b21 = strictlySortedSinglyLinkedList20.repOK();
    strictlySortedSinglyLinkedList20.size = 1;
    strictlySortedSinglyLinkedList20.size = 0;
    tp2.IP iP30 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP30.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan34 = new tp2.IPBan(iP30, (java.lang.Long)100L);
    tp2.IP iP35 = iPBan34.ip;
    boolean b36 = strictlySortedSinglyLinkedList20.contains(iPBan34);
    boolean b37 = strictlySortedSinglyLinkedList20.repOK();
    tp2.SinglyLinkedList singlyLinkedList38 = new tp2.SinglyLinkedList();
    int i39 = singlyLinkedList38.getSize();
    tp2.IP iP44 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i45 = iP44.getSecond();
    java.lang.Integer i46 = iP44.getFourth();
    singlyLinkedList38.add(iP44);
    boolean b49 = iP44.equals((java.lang.Object)2147483647);
    tp2.IPBan iPBan51 = new tp2.IPBan(iP44, (java.lang.Long)(-1L));
    boolean b52 = strictlySortedSinglyLinkedList20.add(iPBan51);
    boolean b53 = strictlySortedSinglyLinkedList19.add(iPBan51);
    tp2.IP iP54 = iPBan51.getIp();
    tp2.IP iP55 = iPBan51.getIp();
    java.lang.Integer i56 = iP55.getFirst();
    boolean b57 = strictlySortedSinglyLinkedList0.containsIP(iP55);
    tp2.IPBan iPBan59 = strictlySortedSinglyLinkedList0.get(212827842);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList60 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b61 = strictlySortedSinglyLinkedList60.repOK();
    strictlySortedSinglyLinkedList60.size = 1;
    strictlySortedSinglyLinkedList60.size = 0;
    tp2.Node node66 = strictlySortedSinglyLinkedList60.header;
    strictlySortedSinglyLinkedList60.size = 51756250;
    strictlySortedSinglyLinkedList60.size = 167755776;
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList71 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b72 = strictlySortedSinglyLinkedList71.repOK();
    tp2.IP iP77 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    boolean b78 = strictlySortedSinglyLinkedList71.containsIP(iP77);
    tp2.Node node79 = strictlySortedSinglyLinkedList71.header;
    boolean b80 = strictlySortedSinglyLinkedList71.isEmpty();
    int i81 = strictlySortedSinglyLinkedList71.getSize();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList82 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b83 = strictlySortedSinglyLinkedList82.repOK();
    tp2.IP iP88 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i89 = iP88.getSecond();
    iP88.setFirst((java.lang.Integer)11001000);
    iP88.setFirst((java.lang.Integer)(-2147483648));
    boolean b94 = strictlySortedSinglyLinkedList82.removeFromIP(iP88);
    tp2.Node node95 = strictlySortedSinglyLinkedList82.header;
    strictlySortedSinglyLinkedList71.header = node95;
    strictlySortedSinglyLinkedList60.header = node95;
    strictlySortedSinglyLinkedList0.header = node95;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i39 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i45 + "' != '" + (-1)+ "'", i45.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i46 + "' != '" + 100+ "'", i46.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b49 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b52 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b53 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP55);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i56 + "' != '" + (-1)+ "'", i56.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b57 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iPBan59);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b61 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node66);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b72 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b78 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node79);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b80 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i81 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b83 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i89 + "' != '" + (-1)+ "'", i89.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b94 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node95);

  }

  @Test
  public void test055() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test055"); }


    java.lang.Integer i1 = new java.lang.Integer(1476395046);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 1476395046+ "'", i1.equals(1476395046));

  }

  @Test
  public void test056() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test056"); }


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
    tp2.IPBan iPBan22 = new tp2.IPBan(iP9, (java.lang.Long)67108864L);
    iP9.setSecond((java.lang.Integer)3014656);
    java.lang.Integer i25 = iP9.getFirst();
    java.lang.Integer i26 = iP9.getThird();
    
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
    org.junit.Assert.assertTrue("'" + i25 + "' != '" + 200+ "'", i25.equals(200));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i26 + "' != '" + (-1)+ "'", i26.equals((-1)));

  }

  @Test
  public void test057() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test057"); }


    // The following exception was thrown during execution in test generation
    try {
      int i2 = java.lang.Integer.parseUnsignedInt("372963", (-225185633));
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test058() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test058"); }


    java.lang.Integer i1 = java.lang.Integer.decode("41224041");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 41224041+ "'", i1.equals(41224041));

  }

  @Test
  public void test059() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test059"); }


    tp2.IP iP4 = new tp2.IP((java.lang.Integer)356246787, (java.lang.Integer)8, (java.lang.Integer)175, (java.lang.Integer)13);
    iP4.setSecond((java.lang.Integer)335561509);
    java.lang.Integer i7 = iP4.getFourth();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i7 + "' != '" + 13+ "'", i7.equals(13));

  }

  @Test
  public void test060() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test060"); }


    int i1 = java.lang.Integer.numberOfTrailingZeros(33400304);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 4);

  }

  @Test
  public void test061() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test061"); }


    int i1 = java.lang.Integer.bitCount(249);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 6);

  }

  @Test
  public void test062() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test062"); }


    tp2.IP iP4 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP4.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan8 = new tp2.IPBan(iP4, (java.lang.Long)100L);
    tp2.IP iP9 = iPBan8.ip;
    tp2.IP iP14 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP14.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan18 = new tp2.IPBan(iP14, (java.lang.Long)100L);
    iPBan8.setIp(iP14);
    tp2.IPBan iPBan21 = new tp2.IPBan(iP14, (java.lang.Long)(-1L));
    iP14.setFirst((java.lang.Integer)242);
    java.lang.Integer i24 = iP14.getSecond();
    java.lang.Integer i25 = iP14.getFourth();
    java.lang.Integer i26 = iP14.getThird();
    iP14.setSecond((java.lang.Integer)266);
    java.lang.Integer i29 = iP14.getSecond();
    iP14.setSecond((java.lang.Integer)3107);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i24 + "' != '" + (-1)+ "'", i24.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i25 + "' != '" + 100+ "'", i25.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i26 + "' != '" + (-1)+ "'", i26.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i29 + "' != '" + 266+ "'", i29.equals(266));

  }

  @Test
  public void test063() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test063"); }


    // The following exception was thrown during execution in test generation
    try {
      int i2 = java.lang.Integer.parseInt("941080", 576);
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

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test064"); }


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
    tp2.IP iP22 = iPBan8.ip;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i14 + "' != '" + (-1)+ "'", i14.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i15 + "' != '" + 100+ "'", i15.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long19 + "' != '" + 100L+ "'", long19.equals(100L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP22);

  }

  @Test
  public void test065() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test065"); }


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
    java.lang.Integer i44 = iP38.getFirst();
    
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
    org.junit.Assert.assertTrue("'" + i44 + "' != '" + 200+ "'", i44.equals(200));

  }

  @Test
  public void test066() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test066"); }


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
    iP13.setFourth((java.lang.Integer)29413279);
    boolean b18 = iP13.equals((java.lang.Object)"35411400645");
    
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
    org.junit.Assert.assertTrue(b18 == false);

  }

  @Test
  public void test067() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test067"); }


    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList0 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b1 = strictlySortedSinglyLinkedList0.repOK();
    strictlySortedSinglyLinkedList0.size = 1;
    boolean b4 = strictlySortedSinglyLinkedList0.isEmpty();
    int i5 = strictlySortedSinglyLinkedList0.getSize();
    boolean b6 = strictlySortedSinglyLinkedList0.isEmpty();
    int i7 = strictlySortedSinglyLinkedList0.getSize();
    int i8 = strictlySortedSinglyLinkedList0.getSize();
    tp2.IPBan iPBan10 = strictlySortedSinglyLinkedList0.get(1594950735);
    int i11 = strictlySortedSinglyLinkedList0.size;
    tp2.IPBan iPBan13 = strictlySortedSinglyLinkedList0.get((-1030088192));
    
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
    org.junit.Assert.assertTrue(i8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iPBan10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iPBan13);

  }

  @Test
  public void test068() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test068"); }


    tp2.SinglyLinkedList singlyLinkedList0 = new tp2.SinglyLinkedList();
    int i1 = singlyLinkedList0.getSize();
    boolean b2 = singlyLinkedList0.isEmpty();
    tp2.IP iP7 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP7.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan11 = new tp2.IPBan(iP7, (java.lang.Long)100L);
    tp2.IP iP12 = iPBan11.ip;
    iP12.setThird((java.lang.Integer)356246784);
    boolean b15 = singlyLinkedList0.remove(iP12);
    boolean b16 = singlyLinkedList0.repOK();
    int i17 = singlyLinkedList0.getSize();
    tp2.SinglyLinkedList singlyLinkedList18 = new tp2.SinglyLinkedList();
    boolean b19 = singlyLinkedList18.repOK();
    tp2.IP iP21 = singlyLinkedList18.get(200);
    boolean b22 = singlyLinkedList18.isEmpty();
    boolean b23 = singlyLinkedList18.repOK();
    tp2.SinglyLinkedList singlyLinkedList24 = new tp2.SinglyLinkedList();
    int i25 = singlyLinkedList24.getSize();
    tp2.IP iP30 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i31 = iP30.getSecond();
    java.lang.Integer i32 = iP30.getFourth();
    singlyLinkedList24.add(iP30);
    iP30.setFourth((java.lang.Integer)167772160);
    boolean b36 = singlyLinkedList18.contains(iP30);
    boolean b37 = singlyLinkedList0.contains(iP30);
    tp2.IP iP39 = singlyLinkedList0.get(1251865216);
    tp2.SinglyLinkedList singlyLinkedList40 = new tp2.SinglyLinkedList();
    int i41 = singlyLinkedList40.getSize();
    tp2.IP iP46 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i47 = iP46.getSecond();
    java.lang.Integer i48 = iP46.getFourth();
    singlyLinkedList40.add(iP46);
    boolean b51 = iP46.equals((java.lang.Object)2147483647);
    tp2.IPBan iPBan53 = new tp2.IPBan(iP46, (java.lang.Long)(-1L));
    iP46.setSecond((java.lang.Integer)100);
    tp2.IPBan iPBan57 = new tp2.IPBan(iP46, (java.lang.Long)7L);
    java.lang.Long long58 = iPBan57.getExpires();
    tp2.IP iP59 = iPBan57.ip;
    java.lang.Long long60 = null;
    tp2.IPBan iPBan61 = new tp2.IPBan(iP59, long60);
    java.lang.Integer i62 = iP59.getSecond();
    boolean b63 = singlyLinkedList0.remove(iP59);
    int i64 = singlyLinkedList0.getSize();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i31 + "' != '" + (-1)+ "'", i31.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i32 + "' != '" + 100+ "'", i32.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i41 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i47 + "' != '" + (-1)+ "'", i47.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i48 + "' != '" + 100+ "'", i48.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b51 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long58 + "' != '" + 7L+ "'", long58.equals(7L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP59);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i62 + "' != '" + 100+ "'", i62.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b63 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i64 == 0);

  }

  @Test
  public void test069() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test069"); }


    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList0 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b1 = strictlySortedSinglyLinkedList0.isEmpty();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList2 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b3 = strictlySortedSinglyLinkedList2.repOK();
    tp2.IP iP8 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    boolean b9 = strictlySortedSinglyLinkedList2.containsIP(iP8);
    tp2.Node node10 = strictlySortedSinglyLinkedList2.header;
    strictlySortedSinglyLinkedList0.header = node10;
    boolean b12 = strictlySortedSinglyLinkedList0.repOK();
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
    tp2.IP iP44 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP44.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan48 = new tp2.IPBan(iP44, (java.lang.Long)100L);
    boolean b49 = strictlySortedSinglyLinkedList26.removeFromIP(iP44);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList50 = new tp2.StrictlySortedSinglyLinkedList();
    int i51 = strictlySortedSinglyLinkedList50.size;
    tp2.IP iP56 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP56.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan60 = new tp2.IPBan(iP56, (java.lang.Long)100L);
    tp2.IP iP61 = iPBan60.ip;
    tp2.IP iP66 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i67 = iP66.getFourth();
    java.lang.Integer i68 = iP66.getFourth();
    iP66.setThird((java.lang.Integer)200);
    iPBan60.ip = iP66;
    boolean b72 = strictlySortedSinglyLinkedList50.add(iPBan60);
    boolean b73 = strictlySortedSinglyLinkedList26.contains(iPBan60);
    tp2.SinglyLinkedList singlyLinkedList74 = new tp2.SinglyLinkedList();
    int i75 = singlyLinkedList74.getSize();
    boolean b76 = singlyLinkedList74.isEmpty();
    tp2.IP iP81 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP81.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan85 = new tp2.IPBan(iP81, (java.lang.Long)100L);
    tp2.IP iP86 = iPBan85.ip;
    iP86.setThird((java.lang.Integer)356246784);
    boolean b89 = singlyLinkedList74.remove(iP86);
    iPBan60.setIp(iP86);
    java.lang.Long long91 = null;
    iPBan60.expires = long91;
    boolean b93 = strictlySortedSinglyLinkedList0.contains(iPBan60);
    tp2.IP iP94 = iPBan60.getIp();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
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
    org.junit.Assert.assertTrue(b49 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i51 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP61);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i67 + "' != '" + 100+ "'", i67.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i68 + "' != '" + 100+ "'", i68.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b72 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b73 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i75 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b76 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP86);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b89 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b93 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP94);

  }

  @Test
  public void test070() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test070"); }


    java.lang.Integer i2 = java.lang.Integer.getInteger("11343", (java.lang.Integer)(-134217728));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i2 + "' != '" + (-134217728)+ "'", i2.equals((-134217728)));

  }

  @Test
  public void test071() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test071"); }


    int i1 = java.lang.Integer.bitCount(135910912);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 9);

  }

  @Test
  public void test072() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test072"); }


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
    tp2.IP iP48 = singlyLinkedList0.get((-2003860978));
    boolean b49 = singlyLinkedList0.repOK();
    boolean b50 = singlyLinkedList0.isEmpty();
    
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
    org.junit.Assert.assertNull(iP48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b49 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b50 == true);

  }

  @Test
  public void test073() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test073"); }


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
    tp2.IP iP27 = iPBan11.ip;
    tp2.IPBan iPBan29 = new tp2.IPBan(iP27, (java.lang.Long)2147486599L);
    java.lang.Integer i30 = iP27.getFirst();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i30 + "' != '" + (-1)+ "'", i30.equals((-1)));

  }

  @Test
  public void test074() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test074"); }


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
    tp2.IP iP45 = null;
    boolean b46 = singlyLinkedList0.contains(iP45);
    boolean b47 = singlyLinkedList0.repOK();
    int i48 = singlyLinkedList0.getSize();
    int i49 = singlyLinkedList0.getSize();
    
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
    org.junit.Assert.assertTrue(b46 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b47 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i48 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i49 == 1);

  }

  @Test
  public void test075() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test075"); }


    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList0 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b1 = strictlySortedSinglyLinkedList0.repOK();
    tp2.IP iP6 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i7 = iP6.getSecond();
    iP6.setFirst((java.lang.Integer)11001000);
    iP6.setFirst((java.lang.Integer)(-2147483648));
    boolean b12 = strictlySortedSinglyLinkedList0.removeFromIP(iP6);
    tp2.IPBan iPBan13 = null;
    boolean b14 = strictlySortedSinglyLinkedList0.add(iPBan13);
    boolean b15 = strictlySortedSinglyLinkedList0.isEmpty();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList16 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b17 = strictlySortedSinglyLinkedList16.repOK();
    tp2.IP iP22 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    boolean b23 = strictlySortedSinglyLinkedList16.containsIP(iP22);
    tp2.Node node24 = strictlySortedSinglyLinkedList16.header;
    strictlySortedSinglyLinkedList16.size = 11001000;
    boolean b27 = strictlySortedSinglyLinkedList16.repOK();
    boolean b28 = strictlySortedSinglyLinkedList16.repOK();
    boolean b29 = strictlySortedSinglyLinkedList16.repOK();
    tp2.IPBan iPBan31 = strictlySortedSinglyLinkedList16.get(51920186);
    tp2.Node node32 = strictlySortedSinglyLinkedList16.header;
    strictlySortedSinglyLinkedList0.header = node32;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i7 + "' != '" + (-1)+ "'", i7.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iPBan31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node32);

  }

  @Test
  public void test076() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test076"); }


    // The following exception was thrown during execution in test generation
    try {
      int i1 = java.lang.Integer.parseInt("110101011111101000001110");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test077() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test077"); }


    // The following exception was thrown during execution in test generation
    try {
      java.lang.Integer i1 = java.lang.Integer.valueOf("1111000000000000000000000000000");
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

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test078"); }


    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList0 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b1 = strictlySortedSinglyLinkedList0.repOK();
    boolean b2 = strictlySortedSinglyLinkedList0.repOK();
    tp2.IPBan iPBan3 = null;
    boolean b4 = strictlySortedSinglyLinkedList0.add(iPBan3);
    boolean b5 = strictlySortedSinglyLinkedList0.repOK();
    tp2.IPBan iPBan7 = strictlySortedSinglyLinkedList0.get(2157841);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList8 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b9 = strictlySortedSinglyLinkedList8.repOK();
    boolean b10 = strictlySortedSinglyLinkedList8.repOK();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList11 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b12 = strictlySortedSinglyLinkedList11.isEmpty();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList13 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b14 = strictlySortedSinglyLinkedList13.repOK();
    tp2.IP iP19 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    boolean b20 = strictlySortedSinglyLinkedList13.containsIP(iP19);
    tp2.Node node21 = strictlySortedSinglyLinkedList13.header;
    strictlySortedSinglyLinkedList11.header = node21;
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList23 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b24 = strictlySortedSinglyLinkedList23.repOK();
    strictlySortedSinglyLinkedList23.size = 1;
    strictlySortedSinglyLinkedList23.size = 0;
    tp2.IP iP33 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP33.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan37 = new tp2.IPBan(iP33, (java.lang.Long)100L);
    tp2.IP iP42 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP42.setFirst((java.lang.Integer)200);
    java.lang.Integer i45 = iP42.getFourth();
    iPBan37.setIp(iP42);
    boolean b47 = strictlySortedSinglyLinkedList23.contains(iPBan37);
    boolean b48 = strictlySortedSinglyLinkedList11.contains(iPBan37);
    boolean b49 = strictlySortedSinglyLinkedList8.add(iPBan37);
    tp2.SinglyLinkedList singlyLinkedList50 = new tp2.SinglyLinkedList();
    int i51 = singlyLinkedList50.getSize();
    tp2.IP iP56 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i57 = iP56.getSecond();
    java.lang.Integer i58 = iP56.getFourth();
    singlyLinkedList50.add(iP56);
    tp2.IPBan iPBan61 = new tp2.IPBan(iP56, (java.lang.Long)100L);
    tp2.IPBan iPBan63 = new tp2.IPBan(iP56, (java.lang.Long)(-1L));
    boolean b64 = strictlySortedSinglyLinkedList8.containsIP(iP56);
    tp2.Node node65 = strictlySortedSinglyLinkedList8.header;
    strictlySortedSinglyLinkedList0.header = node65;
    boolean b67 = strictlySortedSinglyLinkedList0.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iPBan7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i45 + "' != '" + 100+ "'", i45.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b47 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b48 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b49 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i51 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i57 + "' != '" + (-1)+ "'", i57.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i58 + "' != '" + 100+ "'", i58.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b64 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node65);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b67 == false);

  }

  @Test
  public void test079() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test079"); }


    int i2 = java.lang.Integer.rotateRight(3615292, (-2063597568));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 3615292);

  }

  @Test
  public void test080() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test080"); }


    int i1 = java.lang.Integer.lowestOneBit(1080133107);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 1);

  }

  @Test
  public void test081() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test081"); }


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
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList33 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b34 = strictlySortedSinglyLinkedList33.repOK();
    tp2.IP iP39 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i40 = iP39.getSecond();
    iP39.setFirst((java.lang.Integer)11001000);
    iP39.setFirst((java.lang.Integer)(-2147483648));
    boolean b45 = strictlySortedSinglyLinkedList33.removeFromIP(iP39);
    tp2.IPBan iPBan46 = null;
    boolean b47 = strictlySortedSinglyLinkedList33.add(iPBan46);
    tp2.Node node48 = strictlySortedSinglyLinkedList33.header;
    tp2.Node node49 = strictlySortedSinglyLinkedList33.header;
    boolean b50 = iP32.equals((java.lang.Object)strictlySortedSinglyLinkedList33);
    int i51 = strictlySortedSinglyLinkedList33.size;
    tp2.Node node52 = strictlySortedSinglyLinkedList33.header;
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList53 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b54 = strictlySortedSinglyLinkedList53.repOK();
    tp2.IP iP59 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    boolean b60 = strictlySortedSinglyLinkedList53.containsIP(iP59);
    tp2.SinglyLinkedList singlyLinkedList61 = new tp2.SinglyLinkedList();
    int i62 = singlyLinkedList61.getSize();
    tp2.IP iP67 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i68 = iP67.getSecond();
    java.lang.Integer i69 = iP67.getFourth();
    singlyLinkedList61.add(iP67);
    boolean b72 = iP67.equals((java.lang.Object)2147483647);
    tp2.IPBan iPBan74 = new tp2.IPBan(iP67, (java.lang.Long)(-1L));
    java.lang.Long long75 = iPBan74.expires;
    tp2.IP iP80 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP80.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan84 = new tp2.IPBan(iP80, (java.lang.Long)100L);
    tp2.IP iP85 = iPBan84.ip;
    iP85.setThird((java.lang.Integer)356246784);
    iPBan74.ip = iP85;
    boolean b89 = strictlySortedSinglyLinkedList53.add(iPBan74);
    java.lang.Long long90 = iPBan74.getExpires();
    tp2.IP iP91 = iPBan74.ip;
    // The following exception was thrown during execution in test generation
    try {
      boolean b92 = strictlySortedSinglyLinkedList33.contains(iPBan74);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i29 + "' != '" + 200+ "'", i29.equals(200));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i30 + "' != '" + 100+ "'", i30.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i40 + "' != '" + (-1)+ "'", i40.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b47 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b50 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i51 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b54 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b60 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i62 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i68 + "' != '" + (-1)+ "'", i68.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i69 + "' != '" + 100+ "'", i69.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b72 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long75 + "' != '" + (-1L)+ "'", long75.equals((-1L)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP85);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b89 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long90 + "' != '" + (-1L)+ "'", long90.equals((-1L)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP91);

  }

  @Test
  public void test082() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test082"); }


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
    tp2.SinglyLinkedList singlyLinkedList28 = new tp2.SinglyLinkedList();
    int i29 = singlyLinkedList28.getSize();
    int i30 = singlyLinkedList28.getSize();
    tp2.IP iP31 = null;
    boolean b32 = singlyLinkedList28.contains(iP31);
    boolean b33 = singlyLinkedList28.repOK();
    boolean b34 = singlyLinkedList28.isEmpty();
    tp2.IP iP39 = new tp2.IP((java.lang.Integer)5, (java.lang.Integer)10, (java.lang.Integer)31, (java.lang.Integer)32);
    java.lang.Object obj40 = null;
    boolean b41 = iP39.equals(obj40);
    iP39.setFirst((java.lang.Integer)100);
    boolean b44 = singlyLinkedList28.contains(iP39);
    iPBan23.setIp(iP39);
    java.lang.Long long46 = iPBan23.expires;
    iPBan23.setExpires((java.lang.Long)9L);
    
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
    org.junit.Assert.assertTrue(i29 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long46 + "' != '" + 1L+ "'", long46.equals(1L));

  }

  @Test
  public void test083() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test083"); }


    int i2 = java.lang.Integer.rotateRight(1750000, 24762592);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1750000);

  }

  @Test
  public void test084() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test084"); }


    java.lang.Integer i1 = java.lang.Integer.valueOf(250996265);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 250996265+ "'", i1.equals(250996265));

  }

  @Test
  public void test085() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test085"); }


    java.lang.String str1 = java.lang.Integer.toUnsignedString((-1570502470));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "2724464826"+ "'", str1.equals("2724464826"));

  }

  @Test
  public void test086() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test086"); }


    int i2 = java.lang.Integer.divideUnsigned(120, 75779);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);

  }

  @Test
  public void test087() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test087"); }


    int i1 = java.lang.Integer.parseInt("115252525");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 115252525);

  }

  @Test
  public void test088() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test088"); }


    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList0 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b1 = strictlySortedSinglyLinkedList0.repOK();
    tp2.IP iP6 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    boolean b7 = strictlySortedSinglyLinkedList0.containsIP(iP6);
    tp2.Node node8 = strictlySortedSinglyLinkedList0.header;
    boolean b9 = strictlySortedSinglyLinkedList0.isEmpty();
    int i10 = strictlySortedSinglyLinkedList0.getSize();
    int i11 = strictlySortedSinglyLinkedList0.size;
    strictlySortedSinglyLinkedList0.size = (-2);
    boolean b14 = strictlySortedSinglyLinkedList0.isEmpty();
    
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
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);

  }

  @Test
  public void test089() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test089"); }


    java.lang.Integer i1 = java.lang.Integer.valueOf((-1441486166));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + (-1441486166)+ "'", i1.equals((-1441486166)));

  }

  @Test
  public void test090() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test090"); }


    java.lang.String str1 = java.lang.Integer.toBinaryString((-1073479168));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "11000000000001000000001000000000"+ "'", str1.equals("11000000000001000000001000000000"));

  }

  @Test
  public void test091() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test091"); }


    int i2 = java.lang.Integer.min((-2146397184), (-1276116966));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == (-2146397184));

  }

  @Test
  public void test092() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test092"); }


    // The following exception was thrown during execution in test generation
    try {
      int i2 = java.lang.Integer.parseInt("11110010", (-788266756));
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

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test093"); }


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
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList30 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b31 = strictlySortedSinglyLinkedList30.repOK();
    strictlySortedSinglyLinkedList30.size = 1;
    strictlySortedSinglyLinkedList30.size = 0;
    tp2.IP iP40 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i41 = iP40.getSecond();
    java.lang.Integer i42 = iP40.getFourth();
    boolean b43 = strictlySortedSinglyLinkedList30.containsIP(iP40);
    tp2.SinglyLinkedList singlyLinkedList44 = new tp2.SinglyLinkedList();
    int i45 = singlyLinkedList44.getSize();
    tp2.IP iP50 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i51 = iP50.getSecond();
    java.lang.Integer i52 = iP50.getFourth();
    singlyLinkedList44.add(iP50);
    tp2.IP iP55 = singlyLinkedList44.get(5);
    boolean b56 = singlyLinkedList44.repOK();
    tp2.IP iP58 = singlyLinkedList44.get(2013265920);
    tp2.SinglyLinkedList singlyLinkedList59 = new tp2.SinglyLinkedList();
    int i60 = singlyLinkedList59.getSize();
    tp2.IP iP65 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i66 = iP65.getSecond();
    java.lang.Integer i67 = iP65.getFourth();
    singlyLinkedList59.add(iP65);
    iP65.setFourth((java.lang.Integer)167772160);
    singlyLinkedList44.add(iP65);
    boolean b72 = strictlySortedSinglyLinkedList30.removeFromIP(iP65);
    iPBan8.setIp(iP65);
    iPBan8.expires = 20L;
    java.lang.Long long76 = iPBan8.getExpires();
    java.lang.Long long77 = iPBan8.getExpires();
    java.lang.Long long78 = iPBan8.expires;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i16 + "' != '" + 100+ "'", i16.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long18 + "' != '" + 100L+ "'", long18.equals(100L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i24 + "' != '" + (-1)+ "'", i24.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i41 + "' != '" + (-1)+ "'", i41.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i42 + "' != '" + 100+ "'", i42.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b43 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i45 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i51 + "' != '" + (-1)+ "'", i51.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i52 + "' != '" + 100+ "'", i52.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP55);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b56 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP58);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i60 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i66 + "' != '" + (-1)+ "'", i66.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i67 + "' != '" + 100+ "'", i67.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b72 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long76 + "' != '" + 20L+ "'", long76.equals(20L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long77 + "' != '" + 20L+ "'", long77.equals(20L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long78 + "' != '" + 20L+ "'", long78.equals(20L));

  }

  @Test
  public void test094() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test094"); }


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
    tp2.IP iP23 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP23.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan27 = new tp2.IPBan(iP23, (java.lang.Long)100L);
    tp2.IP iP32 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP32.setFirst((java.lang.Integer)200);
    java.lang.Integer i35 = iP32.getFourth();
    iPBan27.setIp(iP32);
    java.lang.Long long37 = iPBan27.expires;
    iPBan27.expires = (-1L);
    java.lang.Long long40 = iPBan27.expires;
    tp2.IP iP41 = iPBan27.getIp();
    tp2.IP iP42 = iPBan27.ip;
    tp2.IP iP43 = iPBan27.ip;
    java.lang.Integer i44 = iP43.getFourth();
    boolean b45 = strictlySortedSinglyLinkedList0.removeFromIP(iP43);
    int i46 = strictlySortedSinglyLinkedList0.getSize();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList47 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList48 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b49 = strictlySortedSinglyLinkedList48.repOK();
    strictlySortedSinglyLinkedList48.size = 1;
    strictlySortedSinglyLinkedList48.size = 0;
    tp2.IP iP58 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP58.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan62 = new tp2.IPBan(iP58, (java.lang.Long)100L);
    tp2.IP iP63 = iPBan62.ip;
    boolean b64 = strictlySortedSinglyLinkedList48.contains(iPBan62);
    boolean b65 = strictlySortedSinglyLinkedList48.repOK();
    tp2.SinglyLinkedList singlyLinkedList66 = new tp2.SinglyLinkedList();
    int i67 = singlyLinkedList66.getSize();
    tp2.IP iP72 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i73 = iP72.getSecond();
    java.lang.Integer i74 = iP72.getFourth();
    singlyLinkedList66.add(iP72);
    boolean b77 = iP72.equals((java.lang.Object)2147483647);
    tp2.IPBan iPBan79 = new tp2.IPBan(iP72, (java.lang.Long)(-1L));
    boolean b80 = strictlySortedSinglyLinkedList48.add(iPBan79);
    boolean b81 = strictlySortedSinglyLinkedList47.add(iPBan79);
    tp2.IPBan iPBan83 = strictlySortedSinglyLinkedList47.get(15);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList84 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b85 = strictlySortedSinglyLinkedList84.repOK();
    strictlySortedSinglyLinkedList84.size = 1;
    strictlySortedSinglyLinkedList84.size = 0;
    tp2.IPBan iPBan90 = null;
    boolean b91 = strictlySortedSinglyLinkedList84.add(iPBan90);
    tp2.Node node92 = strictlySortedSinglyLinkedList84.header;
    tp2.Node node93 = strictlySortedSinglyLinkedList84.header;
    strictlySortedSinglyLinkedList47.header = node93;
    strictlySortedSinglyLinkedList0.header = node93;
    tp2.Node node96 = strictlySortedSinglyLinkedList0.header;
    
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
    org.junit.Assert.assertTrue("'" + i35 + "' != '" + 100+ "'", i35.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long37 + "' != '" + 100L+ "'", long37.equals(100L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long40 + "' != '" + (-1L)+ "'", long40.equals((-1L)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i44 + "' != '" + 100+ "'", i44.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i46 == (-1062740992));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b49 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP63);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b64 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b65 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i67 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i73 + "' != '" + (-1)+ "'", i73.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i74 + "' != '" + 100+ "'", i74.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b77 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b80 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b81 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iPBan83);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b85 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b91 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node92);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node93);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node96);

  }

  @Test
  public void test095() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test095"); }


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
    tp2.IP iP24 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i25 = iP24.getSecond();
    iP24.setFirst((java.lang.Integer)11001000);
    java.lang.Long long28 = null;
    tp2.IPBan iPBan29 = new tp2.IPBan(iP24, long28);
    java.lang.Long long30 = iPBan29.getExpires();
    boolean b31 = strictlySortedSinglyLinkedList3.contains(iPBan29);
    boolean b32 = strictlySortedSinglyLinkedList0.add(iPBan29);
    tp2.IPBan iPBan34 = strictlySortedSinglyLinkedList0.get(20);
    tp2.SinglyLinkedList singlyLinkedList35 = new tp2.SinglyLinkedList();
    int i36 = singlyLinkedList35.getSize();
    tp2.IP iP41 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i42 = iP41.getSecond();
    java.lang.Integer i43 = iP41.getFourth();
    singlyLinkedList35.add(iP41);
    boolean b46 = iP41.equals((java.lang.Object)2147483647);
    tp2.IPBan iPBan48 = new tp2.IPBan(iP41, (java.lang.Long)(-1L));
    boolean b49 = strictlySortedSinglyLinkedList0.contains(iPBan48);
    iPBan48.expires = 29L;
    tp2.IP iP52 = iPBan48.ip;
    java.lang.Long long53 = null;
    iPBan48.setExpires(long53);
    java.lang.Long long55 = iPBan48.expires;
    
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
    org.junit.Assert.assertTrue("'" + i25 + "' != '" + (-1)+ "'", i25.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(long30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iPBan34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i42 + "' != '" + (-1)+ "'", i42.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i43 + "' != '" + 100+ "'", i43.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b46 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b49 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(long55);

  }

  @Test
  public void test096() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test096"); }


    int i1 = java.lang.Integer.parseUnsignedInt("3758097180");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == (-536870116));

  }

  @Test
  public void test097() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test097"); }


    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList0 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IPBan iPBan1 = null;
    boolean b2 = strictlySortedSinglyLinkedList0.add(iPBan1);
    int i3 = strictlySortedSinglyLinkedList0.getSize();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList4 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b5 = strictlySortedSinglyLinkedList4.repOK();
    boolean b6 = strictlySortedSinglyLinkedList4.repOK();
    int i7 = strictlySortedSinglyLinkedList4.getSize();
    tp2.Node node8 = strictlySortedSinglyLinkedList4.header;
    strictlySortedSinglyLinkedList0.header = node8;
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList10 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b11 = strictlySortedSinglyLinkedList10.repOK();
    tp2.IP iP16 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i17 = iP16.getSecond();
    iP16.setFirst((java.lang.Integer)11001000);
    iP16.setFirst((java.lang.Integer)(-2147483648));
    boolean b22 = strictlySortedSinglyLinkedList10.removeFromIP(iP16);
    tp2.Node node23 = strictlySortedSinglyLinkedList10.header;
    boolean b24 = strictlySortedSinglyLinkedList10.isEmpty();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList25 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b26 = strictlySortedSinglyLinkedList25.repOK();
    tp2.IP iP31 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    boolean b32 = strictlySortedSinglyLinkedList25.containsIP(iP31);
    tp2.Node node33 = strictlySortedSinglyLinkedList25.header;
    boolean b34 = strictlySortedSinglyLinkedList25.isEmpty();
    int i35 = strictlySortedSinglyLinkedList25.getSize();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList36 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b37 = strictlySortedSinglyLinkedList36.repOK();
    tp2.IP iP42 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i43 = iP42.getSecond();
    iP42.setFirst((java.lang.Integer)11001000);
    iP42.setFirst((java.lang.Integer)(-2147483648));
    boolean b48 = strictlySortedSinglyLinkedList36.removeFromIP(iP42);
    tp2.Node node49 = strictlySortedSinglyLinkedList36.header;
    strictlySortedSinglyLinkedList25.header = node49;
    strictlySortedSinglyLinkedList10.header = node49;
    strictlySortedSinglyLinkedList0.header = node49;
    strictlySortedSinglyLinkedList0.size = 11110010;
    tp2.IPBan iPBan56 = strictlySortedSinglyLinkedList0.get(6760448);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList57 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b58 = strictlySortedSinglyLinkedList57.repOK();
    strictlySortedSinglyLinkedList57.size = 1;
    strictlySortedSinglyLinkedList57.size = 0;
    tp2.IP iP67 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i68 = iP67.getFourth();
    java.lang.Integer i69 = iP67.getFourth();
    iP67.setThird((java.lang.Integer)200);
    iP67.setThird((java.lang.Integer)356246787);
    boolean b74 = strictlySortedSinglyLinkedList57.containsIP(iP67);
    int i75 = strictlySortedSinglyLinkedList57.size;
    tp2.Node node76 = strictlySortedSinglyLinkedList57.header;
    strictlySortedSinglyLinkedList0.header = node76;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i17 + "' != '" + (-1)+ "'", i17.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i35 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i43 + "' != '" + (-1)+ "'", i43.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b48 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iPBan56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b58 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i68 + "' != '" + 100+ "'", i68.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i69 + "' != '" + 100+ "'", i69.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b74 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i75 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node76);

  }

  @Test
  public void test098() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test098"); }


    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList0 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b1 = strictlySortedSinglyLinkedList0.repOK();
    boolean b2 = strictlySortedSinglyLinkedList0.repOK();
    strictlySortedSinglyLinkedList0.size = 75778;
    int i5 = strictlySortedSinglyLinkedList0.size;
    boolean b6 = strictlySortedSinglyLinkedList0.repOK();
    boolean b7 = strictlySortedSinglyLinkedList0.repOK();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList8 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b9 = strictlySortedSinglyLinkedList8.repOK();
    tp2.IP iP14 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    boolean b15 = strictlySortedSinglyLinkedList8.containsIP(iP14);
    tp2.Node node16 = strictlySortedSinglyLinkedList8.header;
    boolean b17 = strictlySortedSinglyLinkedList8.isEmpty();
    int i18 = strictlySortedSinglyLinkedList8.getSize();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList19 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b20 = strictlySortedSinglyLinkedList19.repOK();
    tp2.IP iP25 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i26 = iP25.getSecond();
    iP25.setFirst((java.lang.Integer)11001000);
    iP25.setFirst((java.lang.Integer)(-2147483648));
    boolean b31 = strictlySortedSinglyLinkedList19.removeFromIP(iP25);
    tp2.Node node32 = strictlySortedSinglyLinkedList19.header;
    strictlySortedSinglyLinkedList8.header = node32;
    tp2.Node node34 = strictlySortedSinglyLinkedList8.header;
    strictlySortedSinglyLinkedList0.header = node34;
    tp2.IPBan iPBan37 = strictlySortedSinglyLinkedList0.get(2013266104);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList38 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b39 = strictlySortedSinglyLinkedList38.repOK();
    strictlySortedSinglyLinkedList38.size = 1;
    strictlySortedSinglyLinkedList38.size = 0;
    tp2.IP iP48 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP48.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan52 = new tp2.IPBan(iP48, (java.lang.Long)100L);
    tp2.IP iP53 = iPBan52.ip;
    boolean b54 = strictlySortedSinglyLinkedList38.contains(iPBan52);
    boolean b55 = strictlySortedSinglyLinkedList38.repOK();
    tp2.SinglyLinkedList singlyLinkedList56 = new tp2.SinglyLinkedList();
    int i57 = singlyLinkedList56.getSize();
    tp2.IP iP62 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i63 = iP62.getSecond();
    java.lang.Integer i64 = iP62.getFourth();
    singlyLinkedList56.add(iP62);
    boolean b67 = iP62.equals((java.lang.Object)2147483647);
    tp2.IPBan iPBan69 = new tp2.IPBan(iP62, (java.lang.Long)(-1L));
    boolean b70 = strictlySortedSinglyLinkedList38.add(iPBan69);
    iPBan69.setExpires((java.lang.Long)0L);
    tp2.IP iP73 = iPBan69.ip;
    java.lang.Long long74 = iPBan69.getExpires();
    java.lang.Long long75 = iPBan69.getExpires();
    java.lang.Long long76 = iPBan69.getExpires();
    tp2.IP iP77 = iPBan69.getIp();
    boolean b78 = strictlySortedSinglyLinkedList0.add(iPBan69);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 75778);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i26 + "' != '" + (-1)+ "'", i26.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iPBan37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b54 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b55 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i57 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i63 + "' != '" + (-1)+ "'", i63.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i64 + "' != '" + 100+ "'", i64.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b67 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b70 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP73);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long74 + "' != '" + 0L+ "'", long74.equals(0L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long75 + "' != '" + 0L+ "'", long75.equals(0L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long76 + "' != '" + 0L+ "'", long76.equals(0L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP77);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b78 == true);

  }

  @Test
  public void test099() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test099"); }


    int i2 = java.lang.Integer.divideUnsigned(4835, 22265424);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);

  }

  @Test
  public void test100() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test100"); }


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
    strictlySortedSinglyLinkedList30.size = 1;
    strictlySortedSinglyLinkedList30.size = 0;
    tp2.IP iP40 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i41 = iP40.getSecond();
    java.lang.Integer i42 = iP40.getFourth();
    boolean b43 = strictlySortedSinglyLinkedList30.containsIP(iP40);
    java.lang.Integer i44 = iP40.getThird();
    tp2.IPBan iPBan46 = new tp2.IPBan(iP40, (java.lang.Long)469762048L);
    iP40.setFourth((java.lang.Integer)1048576);
    java.lang.Integer i49 = iP40.getThird();
    singlyLinkedList0.add(iP40);
    iP40.setFirst((java.lang.Integer)1023475712);
    
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
    org.junit.Assert.assertTrue("'" + i41 + "' != '" + (-1)+ "'", i41.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i42 + "' != '" + 100+ "'", i42.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b43 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i44 + "' != '" + (-1)+ "'", i44.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i49 + "' != '" + (-1)+ "'", i49.equals((-1)));

  }

  @Test
  public void test101() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test101"); }


    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList0 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b1 = strictlySortedSinglyLinkedList0.repOK();
    tp2.IP iP6 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i7 = iP6.getSecond();
    iP6.setFirst((java.lang.Integer)11001000);
    iP6.setFirst((java.lang.Integer)(-2147483648));
    boolean b12 = strictlySortedSinglyLinkedList0.removeFromIP(iP6);
    tp2.IPBan iPBan14 = strictlySortedSinglyLinkedList0.get((-1));
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList15 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b16 = strictlySortedSinglyLinkedList15.repOK();
    tp2.IP iP21 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i22 = iP21.getSecond();
    iP21.setFirst((java.lang.Integer)11001000);
    iP21.setFirst((java.lang.Integer)(-2147483648));
    boolean b27 = strictlySortedSinglyLinkedList15.removeFromIP(iP21);
    boolean b28 = strictlySortedSinglyLinkedList0.removeFromIP(iP21);
    boolean b29 = strictlySortedSinglyLinkedList0.isEmpty();
    tp2.IP iP34 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP34.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan38 = new tp2.IPBan(iP34, (java.lang.Long)100L);
    tp2.IP iP39 = iPBan38.ip;
    tp2.IP iP44 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP44.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan48 = new tp2.IPBan(iP44, (java.lang.Long)100L);
    iPBan38.setIp(iP44);
    tp2.IPBan iPBan51 = new tp2.IPBan(iP44, (java.lang.Long)(-1L));
    tp2.IP iP52 = iPBan51.ip;
    java.lang.Long long53 = iPBan51.getExpires();
    boolean b54 = strictlySortedSinglyLinkedList0.contains(iPBan51);
    java.lang.Long long55 = null;
    iPBan51.setExpires(long55);
    iPBan51.expires = 2157841L;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i7 + "' != '" + (-1)+ "'", i7.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iPBan14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i22 + "' != '" + (-1)+ "'", i22.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long53 + "' != '" + (-1L)+ "'", long53.equals((-1L)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b54 == false);

  }

  @Test
  public void test102() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test102"); }


    java.lang.String str1 = java.lang.Integer.toBinaryString(1599078400);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "1011111010100000000000000000000"+ "'", str1.equals("1011111010100000000000000000000"));

  }

  @Test
  public void test103() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test103"); }


    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList0 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b1 = strictlySortedSinglyLinkedList0.repOK();
    tp2.IP iP6 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    boolean b7 = strictlySortedSinglyLinkedList0.containsIP(iP6);
    tp2.Node node8 = strictlySortedSinglyLinkedList0.header;
    strictlySortedSinglyLinkedList0.size = 11001000;
    boolean b11 = strictlySortedSinglyLinkedList0.repOK();
    tp2.IPBan iPBan13 = strictlySortedSinglyLinkedList0.get(40);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList14 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b15 = strictlySortedSinglyLinkedList14.isEmpty();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList16 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b17 = strictlySortedSinglyLinkedList16.repOK();
    tp2.IP iP22 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    boolean b23 = strictlySortedSinglyLinkedList16.containsIP(iP22);
    tp2.Node node24 = strictlySortedSinglyLinkedList16.header;
    strictlySortedSinglyLinkedList14.header = node24;
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList26 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b27 = strictlySortedSinglyLinkedList26.repOK();
    strictlySortedSinglyLinkedList26.size = 1;
    strictlySortedSinglyLinkedList26.size = 0;
    tp2.IP iP36 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP36.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan40 = new tp2.IPBan(iP36, (java.lang.Long)100L);
    tp2.IP iP45 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP45.setFirst((java.lang.Integer)200);
    java.lang.Integer i48 = iP45.getFourth();
    iPBan40.setIp(iP45);
    boolean b50 = strictlySortedSinglyLinkedList26.contains(iPBan40);
    boolean b51 = strictlySortedSinglyLinkedList14.contains(iPBan40);
    tp2.SinglyLinkedList singlyLinkedList52 = new tp2.SinglyLinkedList();
    int i53 = singlyLinkedList52.getSize();
    int i54 = singlyLinkedList52.getSize();
    tp2.IP iP55 = null;
    boolean b56 = singlyLinkedList52.contains(iP55);
    tp2.IP iP58 = singlyLinkedList52.get(27);
    tp2.IP iP63 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP63.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan67 = new tp2.IPBan(iP63, (java.lang.Long)100L);
    tp2.IP iP68 = iPBan67.ip;
    tp2.IP iP73 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP73.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan77 = new tp2.IPBan(iP73, (java.lang.Long)100L);
    iPBan67.setIp(iP73);
    boolean b79 = singlyLinkedList52.remove(iP73);
    iPBan40.ip = iP73;
    java.lang.Integer i81 = iP73.getFourth();
    iP73.setSecond((java.lang.Integer)5);
    tp2.IPBan iPBan85 = new tp2.IPBan(iP73, (java.lang.Long)51756492L);
    boolean b86 = strictlySortedSinglyLinkedList0.add(iPBan85);
    boolean b87 = strictlySortedSinglyLinkedList0.isEmpty();
    boolean b88 = strictlySortedSinglyLinkedList0.repOK();
    tp2.Node node89 = strictlySortedSinglyLinkedList0.header;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iPBan13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i48 + "' != '" + 100+ "'", i48.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b50 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b51 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i53 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i54 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b56 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP58);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP68);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b79 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i81 + "' != '" + 100+ "'", i81.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b86 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b87 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b88 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node89);

  }

  @Test
  public void test104() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test104"); }


    java.lang.String str2 = java.lang.Integer.toUnsignedString(13349429, 1009399552);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "13349429"+ "'", str2.equals("13349429"));

  }

  @Test
  public void test105() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test105"); }


    java.lang.Integer i1 = java.lang.Integer.valueOf(2060546218);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 2060546218+ "'", i1.equals(2060546218));

  }

  @Test
  public void test106() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test106"); }


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
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList29 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b30 = strictlySortedSinglyLinkedList29.repOK();
    boolean b31 = strictlySortedSinglyLinkedList29.repOK();
    tp2.IPBan iPBan32 = null;
    boolean b33 = strictlySortedSinglyLinkedList29.contains(iPBan32);
    tp2.IP iP38 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP38.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan42 = new tp2.IPBan(iP38, (java.lang.Long)100L);
    tp2.IP iP43 = iPBan42.ip;
    tp2.IP iP48 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP48.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan52 = new tp2.IPBan(iP48, (java.lang.Long)100L);
    iPBan42.setIp(iP48);
    java.lang.Long long54 = iPBan42.getExpires();
    tp2.IP iP55 = iPBan42.ip;
    iP55.setSecond((java.lang.Integer)11001000);
    boolean b58 = strictlySortedSinglyLinkedList29.containsIP(iP55);
    tp2.SinglyLinkedList singlyLinkedList59 = new tp2.SinglyLinkedList();
    int i60 = singlyLinkedList59.getSize();
    tp2.IP iP65 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i66 = iP65.getSecond();
    java.lang.Integer i67 = iP65.getFourth();
    singlyLinkedList59.add(iP65);
    boolean b70 = iP65.equals((java.lang.Object)2147483647);
    tp2.IPBan iPBan72 = new tp2.IPBan(iP65, (java.lang.Long)(-1L));
    java.lang.Long long73 = iPBan72.expires;
    tp2.IP iP78 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP78.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan82 = new tp2.IPBan(iP78, (java.lang.Long)100L);
    tp2.IP iP83 = iPBan82.ip;
    iP83.setThird((java.lang.Integer)356246784);
    iPBan72.ip = iP83;
    java.lang.Integer i87 = iP83.getFirst();
    boolean b88 = strictlySortedSinglyLinkedList29.removeFromIP(iP83);
    java.lang.Integer i89 = iP83.getSecond();
    boolean b90 = strictlySortedSinglyLinkedList0.containsIP(iP83);
    boolean b91 = strictlySortedSinglyLinkedList0.repOK();
    boolean b92 = strictlySortedSinglyLinkedList0.isEmpty();
    
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
    org.junit.Assert.assertTrue(b30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long54 + "' != '" + 100L+ "'", long54.equals(100L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP55);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b58 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i60 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i66 + "' != '" + (-1)+ "'", i66.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i67 + "' != '" + 100+ "'", i67.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b70 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long73 + "' != '" + (-1L)+ "'", long73.equals((-1L)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP83);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i87 + "' != '" + 200+ "'", i87.equals(200));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b88 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i89 + "' != '" + (-1)+ "'", i89.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b90 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b91 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b92 == true);

  }

  @Test
  public void test107() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test107"); }


    tp2.SinglyLinkedList singlyLinkedList0 = new tp2.SinglyLinkedList();
    boolean b1 = singlyLinkedList0.repOK();
    tp2.SinglyLinkedList singlyLinkedList2 = new tp2.SinglyLinkedList();
    boolean b3 = singlyLinkedList2.repOK();
    int i4 = singlyLinkedList2.getSize();
    boolean b5 = singlyLinkedList2.isEmpty();
    tp2.IP iP10 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i11 = iP10.getSecond();
    iP10.setFirst((java.lang.Integer)11001000);
    iP10.setFirst((java.lang.Integer)32);
    java.lang.Integer i16 = iP10.getFourth();
    boolean b17 = singlyLinkedList2.contains(iP10);
    tp2.IP iP22 = new tp2.IP((java.lang.Integer)0, (java.lang.Integer)30, (java.lang.Integer)162, (java.lang.Integer)20);
    boolean b23 = singlyLinkedList2.remove(iP22);
    tp2.IPBan iPBan25 = new tp2.IPBan(iP22, (java.lang.Long)27L);
    tp2.IP iP26 = iPBan25.ip;
    tp2.SinglyLinkedList singlyLinkedList27 = new tp2.SinglyLinkedList();
    int i28 = singlyLinkedList27.getSize();
    tp2.IP iP33 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i34 = iP33.getSecond();
    java.lang.Integer i35 = iP33.getFourth();
    singlyLinkedList27.add(iP33);
    tp2.IP iP38 = singlyLinkedList27.get(5);
    boolean b39 = singlyLinkedList27.repOK();
    tp2.IP iP41 = singlyLinkedList27.get(2013265920);
    tp2.SinglyLinkedList singlyLinkedList42 = new tp2.SinglyLinkedList();
    int i43 = singlyLinkedList42.getSize();
    tp2.IP iP48 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i49 = iP48.getSecond();
    java.lang.Integer i50 = iP48.getFourth();
    singlyLinkedList42.add(iP48);
    iP48.setFourth((java.lang.Integer)167772160);
    singlyLinkedList27.add(iP48);
    java.lang.Object obj55 = null;
    boolean b56 = iP48.equals(obj55);
    iPBan25.ip = iP48;
    singlyLinkedList0.add(iP48);
    iP48.setThird((java.lang.Integer)3405);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i11 + "' != '" + (-1)+ "'", i11.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i16 + "' != '" + 100+ "'", i16.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP26);
    
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
    org.junit.Assert.assertTrue(i43 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i49 + "' != '" + (-1)+ "'", i49.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i50 + "' != '" + 100+ "'", i50.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b56 == false);

  }

  @Test
  public void test108() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test108"); }


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
    int i43 = singlyLinkedList0.getSize();
    tp2.SinglyLinkedList singlyLinkedList44 = new tp2.SinglyLinkedList();
    boolean b45 = singlyLinkedList44.repOK();
    tp2.IP iP50 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP50.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan54 = new tp2.IPBan(iP50, (java.lang.Long)100L);
    tp2.IP iP59 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP59.setFirst((java.lang.Integer)200);
    java.lang.Integer i62 = iP59.getFourth();
    iPBan54.setIp(iP59);
    singlyLinkedList44.add(iP59);
    iP59.setSecond((java.lang.Integer)5);
    java.lang.Integer i67 = iP59.getSecond();
    singlyLinkedList0.add(iP59);
    tp2.IP iP70 = singlyLinkedList0.get(29824259);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList71 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b72 = strictlySortedSinglyLinkedList71.repOK();
    tp2.IP iP77 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i78 = iP77.getSecond();
    iP77.setFirst((java.lang.Integer)11001000);
    iP77.setFirst((java.lang.Integer)(-2147483648));
    boolean b83 = strictlySortedSinglyLinkedList71.removeFromIP(iP77);
    java.lang.Integer i84 = iP77.getSecond();
    boolean b85 = singlyLinkedList0.contains(iP77);
    tp2.IPBan iPBan87 = new tp2.IPBan(iP77, (java.lang.Long)335561509L);
    java.lang.Integer i88 = iP77.getSecond();
    boolean b90 = iP77.equals((java.lang.Object)"1110111001101011001010000000000");
    iP77.setFirst((java.lang.Integer)86682288);
    
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
    org.junit.Assert.assertTrue(i43 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i62 + "' != '" + 100+ "'", i62.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i67 + "' != '" + 5+ "'", i67.equals(5));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP70);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b72 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i78 + "' != '" + (-1)+ "'", i78.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b83 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i84 + "' != '" + (-1)+ "'", i84.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b85 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i88 + "' != '" + (-1)+ "'", i88.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b90 == false);

  }

  @Test
  public void test109() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test109"); }


    int i1 = java.lang.Integer.bitCount(112643045);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 17);

  }

  @Test
  public void test110() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test110"); }


    // The following exception was thrown during execution in test generation
    try {
      int i2 = java.lang.Integer.parseUnsignedInt("20512", 115300261);
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

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test111"); }


    tp2.IP iP4 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP4.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan8 = new tp2.IPBan(iP4, (java.lang.Long)100L);
    tp2.IP iP13 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iPBan8.setIp(iP13);
    java.lang.Long long15 = iPBan8.expires;
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList16 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b17 = strictlySortedSinglyLinkedList16.isEmpty();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList18 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b19 = strictlySortedSinglyLinkedList18.repOK();
    tp2.IP iP24 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    boolean b25 = strictlySortedSinglyLinkedList18.containsIP(iP24);
    tp2.Node node26 = strictlySortedSinglyLinkedList18.header;
    strictlySortedSinglyLinkedList16.header = node26;
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList28 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b29 = strictlySortedSinglyLinkedList28.repOK();
    strictlySortedSinglyLinkedList28.size = 1;
    strictlySortedSinglyLinkedList28.size = 0;
    tp2.IP iP38 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP38.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan42 = new tp2.IPBan(iP38, (java.lang.Long)100L);
    tp2.IP iP47 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP47.setFirst((java.lang.Integer)200);
    java.lang.Integer i50 = iP47.getFourth();
    iPBan42.setIp(iP47);
    boolean b52 = strictlySortedSinglyLinkedList28.contains(iPBan42);
    boolean b53 = strictlySortedSinglyLinkedList16.contains(iPBan42);
    tp2.IP iP54 = iPBan42.ip;
    tp2.IP iP55 = iPBan42.ip;
    iPBan8.setIp(iP55);
    tp2.IP iP57 = iPBan8.getIp();
    java.lang.Object obj58 = null;
    boolean b59 = iP57.equals(obj58);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long15 + "' != '" + 100L+ "'", long15.equals(100L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i50 + "' != '" + 100+ "'", i50.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b52 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b53 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP55);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b59 == false);

  }

  @Test
  public void test112() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test112"); }


    java.lang.String str1 = java.lang.Integer.toOctalString((-122));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "37777777606"+ "'", str1.equals("37777777606"));

  }

  @Test
  public void test113() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test113"); }


    int i2 = java.lang.Integer.min(174231553, 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 11);

  }

  @Test
  public void test114() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test114"); }


    int i2 = java.lang.Integer.compare((-113243922), (-536870116));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);

  }

  @Test
  public void test115() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test115"); }


    int i1 = java.lang.Integer.numberOfLeadingZeros(27325491);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 7);

  }

  @Test
  public void test116() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test116"); }


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
    tp2.IP iP71 = iPBan41.ip;
    tp2.IP iP72 = iPBan41.getIp();
    
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
    org.junit.Assert.assertNotNull(iP71);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP72);

  }

  @Test
  public void test117() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test117"); }


    java.lang.Integer i2 = java.lang.Integer.getInteger("167772160", 1214008220);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i2 + "' != '" + 1214008220+ "'", i2.equals(1214008220));

  }

  @Test
  public void test118() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test118"); }


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
    strictlySortedSinglyLinkedList0.size = 649907;
    
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

  }

  @Test
  public void test119() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test119"); }


    int i1 = java.lang.Integer.highestOneBit(1614970883);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 1073741824);

  }

  @Test
  public void test120() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test120"); }


    int i2 = java.lang.Integer.min(18874368, (-383271559));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == (-383271559));

  }

  @Test
  public void test121() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test121"); }


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
    tp2.IP iP35 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i36 = iP35.getSecond();
    java.lang.Integer i37 = iP35.getFourth();
    iP35.setFirst((java.lang.Integer)5);
    iP35.setSecond((java.lang.Integer)11001000);
    tp2.IPBan iPBan43 = new tp2.IPBan(iP35, (java.lang.Long)100L);
    java.lang.Integer i44 = iP35.getFirst();
    singlyLinkedList0.add(iP35);
    tp2.IP iP50 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP50.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan54 = new tp2.IPBan(iP50, (java.lang.Long)100L);
    tp2.IP iP59 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i60 = iP59.getSecond();
    java.lang.Integer i61 = iP59.getFourth();
    iP59.setFirst((java.lang.Integer)5);
    iPBan54.ip = iP59;
    java.lang.Long long65 = iPBan54.getExpires();
    iPBan54.setExpires((java.lang.Long)(-1L));
    iPBan54.expires = 100L;
    tp2.IP iP74 = new tp2.IP((java.lang.Integer)242, (java.lang.Integer)242, (java.lang.Integer)30, (java.lang.Integer)(-1));
    iP74.setSecond((java.lang.Integer)33554432);
    iPBan54.setIp(iP74);
    tp2.IP iP78 = iPBan54.ip;
    iP78.setFourth((java.lang.Integer)242);
    java.lang.Integer i81 = iP78.getSecond();
    java.lang.Integer i82 = iP78.getFourth();
    boolean b83 = iP35.equals((java.lang.Object)i82);
    java.lang.Integer i84 = iP35.getFirst();
    iP35.setThird((java.lang.Integer)371235425);
    java.lang.Integer i87 = iP35.getFourth();
    
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
    org.junit.Assert.assertTrue("'" + i36 + "' != '" + (-1)+ "'", i36.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i37 + "' != '" + 100+ "'", i37.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i44 + "' != '" + 5+ "'", i44.equals(5));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i60 + "' != '" + (-1)+ "'", i60.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i61 + "' != '" + 100+ "'", i61.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long65 + "' != '" + 100L+ "'", long65.equals(100L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP78);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i81 + "' != '" + 33554432+ "'", i81.equals(33554432));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i82 + "' != '" + 242+ "'", i82.equals(242));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b83 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i84 + "' != '" + 5+ "'", i84.equals(5));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i87 + "' != '" + 100+ "'", i87.equals(100));

  }

  @Test
  public void test122() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test122"); }


    int i2 = java.lang.Integer.min(1459056708, 1476395008);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1459056708);

  }

  @Test
  public void test123() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test123"); }


    java.lang.Integer i2 = java.lang.Integer.getInteger("11111", 30000001);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i2 + "' != '" + 30000001+ "'", i2.equals(30000001));

  }

  @Test
  public void test124() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test124"); }


    int i1 = java.lang.Integer.reverseBytes(1530767552);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == (-1062716069));

  }

  @Test
  public void test125() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test125"); }


    int i1 = java.lang.Integer.highestOneBit(11634);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 8192);

  }

  @Test
  public void test126() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test126"); }


    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList0 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b1 = strictlySortedSinglyLinkedList0.repOK();
    strictlySortedSinglyLinkedList0.size = 1;
    strictlySortedSinglyLinkedList0.size = 0;
    tp2.IP iP10 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i11 = iP10.getSecond();
    java.lang.Integer i12 = iP10.getFourth();
    boolean b13 = strictlySortedSinglyLinkedList0.containsIP(iP10);
    tp2.SinglyLinkedList singlyLinkedList14 = new tp2.SinglyLinkedList();
    int i15 = singlyLinkedList14.getSize();
    tp2.IP iP20 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i21 = iP20.getSecond();
    java.lang.Integer i22 = iP20.getFourth();
    singlyLinkedList14.add(iP20);
    tp2.IP iP25 = singlyLinkedList14.get(5);
    boolean b26 = singlyLinkedList14.repOK();
    tp2.IP iP28 = singlyLinkedList14.get(2013265920);
    tp2.SinglyLinkedList singlyLinkedList29 = new tp2.SinglyLinkedList();
    int i30 = singlyLinkedList29.getSize();
    tp2.IP iP35 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i36 = iP35.getSecond();
    java.lang.Integer i37 = iP35.getFourth();
    singlyLinkedList29.add(iP35);
    iP35.setFourth((java.lang.Integer)167772160);
    singlyLinkedList14.add(iP35);
    boolean b42 = strictlySortedSinglyLinkedList0.removeFromIP(iP35);
    int i43 = strictlySortedSinglyLinkedList0.getSize();
    strictlySortedSinglyLinkedList0.size = 2025849072;
    strictlySortedSinglyLinkedList0.size = 0;
    boolean b48 = strictlySortedSinglyLinkedList0.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i11 + "' != '" + (-1)+ "'", i11.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i12 + "' != '" + 100+ "'", i12.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i21 + "' != '" + (-1)+ "'", i21.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i22 + "' != '" + 100+ "'", i22.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i36 + "' != '" + (-1)+ "'", i36.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i37 + "' != '" + 100+ "'", i37.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i43 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b48 == true);

  }

  @Test
  public void test127() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test127"); }


    int i1 = java.lang.Integer.parseInt("744");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 744);

  }

  @Test
  public void test128() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test128"); }


    tp2.IP iP4 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP4.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan8 = new tp2.IPBan(iP4, (java.lang.Long)100L);
    tp2.IP iP13 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iPBan8.setIp(iP13);
    iP13.setSecond((java.lang.Integer)8);
    iP13.setFirst((java.lang.Integer)3);
    java.lang.Integer i19 = iP13.getThird();
    java.lang.Integer i20 = iP13.getFirst();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i19 + "' != '" + (-1)+ "'", i19.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i20 + "' != '" + 3+ "'", i20.equals(3));

  }

  @Test
  public void test129() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test129"); }


    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList0 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b1 = strictlySortedSinglyLinkedList0.repOK();
    tp2.IP iP6 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i7 = iP6.getSecond();
    iP6.setFirst((java.lang.Integer)11001000);
    iP6.setFirst((java.lang.Integer)(-2147483648));
    boolean b12 = strictlySortedSinglyLinkedList0.removeFromIP(iP6);
    tp2.Node node13 = strictlySortedSinglyLinkedList0.header;
    strictlySortedSinglyLinkedList0.size = (-1);
    tp2.Node node16 = strictlySortedSinglyLinkedList0.header;
    boolean b17 = strictlySortedSinglyLinkedList0.isEmpty();
    int i18 = strictlySortedSinglyLinkedList0.size;
    boolean b19 = strictlySortedSinglyLinkedList0.repOK();
    tp2.IPBan iPBan21 = strictlySortedSinglyLinkedList0.get(56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i7 + "' != '" + (-1)+ "'", i7.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iPBan21);

  }

  @Test
  public void test130() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test130"); }


    int i2 = java.lang.Integer.compareUnsigned(90133041, 57406);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);

  }

  @Test
  public void test131() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test131"); }


    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList0 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b1 = strictlySortedSinglyLinkedList0.repOK();
    tp2.IP iP6 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    boolean b7 = strictlySortedSinglyLinkedList0.containsIP(iP6);
    tp2.Node node8 = strictlySortedSinglyLinkedList0.header;
    strictlySortedSinglyLinkedList0.size = 11001000;
    boolean b11 = strictlySortedSinglyLinkedList0.repOK();
    tp2.IPBan iPBan13 = strictlySortedSinglyLinkedList0.get(40);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList14 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b15 = strictlySortedSinglyLinkedList14.isEmpty();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList16 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b17 = strictlySortedSinglyLinkedList16.repOK();
    tp2.IP iP22 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    boolean b23 = strictlySortedSinglyLinkedList16.containsIP(iP22);
    tp2.Node node24 = strictlySortedSinglyLinkedList16.header;
    strictlySortedSinglyLinkedList14.header = node24;
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList26 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b27 = strictlySortedSinglyLinkedList26.repOK();
    strictlySortedSinglyLinkedList26.size = 1;
    strictlySortedSinglyLinkedList26.size = 0;
    tp2.IP iP36 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP36.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan40 = new tp2.IPBan(iP36, (java.lang.Long)100L);
    tp2.IP iP45 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP45.setFirst((java.lang.Integer)200);
    java.lang.Integer i48 = iP45.getFourth();
    iPBan40.setIp(iP45);
    boolean b50 = strictlySortedSinglyLinkedList26.contains(iPBan40);
    boolean b51 = strictlySortedSinglyLinkedList14.contains(iPBan40);
    tp2.SinglyLinkedList singlyLinkedList52 = new tp2.SinglyLinkedList();
    int i53 = singlyLinkedList52.getSize();
    int i54 = singlyLinkedList52.getSize();
    tp2.IP iP55 = null;
    boolean b56 = singlyLinkedList52.contains(iP55);
    tp2.IP iP58 = singlyLinkedList52.get(27);
    tp2.IP iP63 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP63.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan67 = new tp2.IPBan(iP63, (java.lang.Long)100L);
    tp2.IP iP68 = iPBan67.ip;
    tp2.IP iP73 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP73.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan77 = new tp2.IPBan(iP73, (java.lang.Long)100L);
    iPBan67.setIp(iP73);
    boolean b79 = singlyLinkedList52.remove(iP73);
    iPBan40.ip = iP73;
    java.lang.Integer i81 = iP73.getFourth();
    iP73.setSecond((java.lang.Integer)5);
    tp2.IPBan iPBan85 = new tp2.IPBan(iP73, (java.lang.Long)51756492L);
    boolean b86 = strictlySortedSinglyLinkedList0.add(iPBan85);
    boolean b87 = strictlySortedSinglyLinkedList0.isEmpty();
    boolean b88 = strictlySortedSinglyLinkedList0.repOK();
    boolean b89 = strictlySortedSinglyLinkedList0.isEmpty();
    tp2.IPBan iPBan91 = strictlySortedSinglyLinkedList0.get((-2134213366));
    tp2.IPBan iPBan92 = null;
    // The following exception was thrown during execution in test generation
    try {
      boolean b93 = strictlySortedSinglyLinkedList0.add(iPBan92);
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
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iPBan13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i48 + "' != '" + 100+ "'", i48.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b50 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b51 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i53 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i54 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b56 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP58);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP68);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b79 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i81 + "' != '" + 100+ "'", i81.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b86 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b87 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b88 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b89 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iPBan91);

  }

  @Test
  public void test132() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test132"); }


    // The following exception was thrown during execution in test generation
    try {
      java.lang.Integer i1 = java.lang.Integer.decode("5529fac");
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

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test133"); }


    int i1 = java.lang.Integer.signum(3005020);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 1);

  }

  @Test
  public void test134() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test134"); }


    java.lang.String str1 = java.lang.Integer.toHexString(1079641375);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "405a051f"+ "'", str1.equals("405a051f"));

  }

  @Test
  public void test135() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test135"); }


    java.lang.Integer i1 = java.lang.Integer.decode("719343798");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 719343798+ "'", i1.equals(719343798));

  }

  @Test
  public void test136() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test136"); }


    int i2 = java.lang.Integer.rotateRight(473, (-129));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 946);

  }

  @Test
  public void test137() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test137"); }


    int i1 = java.lang.Integer.lowestOneBit(1377086084);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 4);

  }

  @Test
  public void test138() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test138"); }


    // The following exception was thrown during execution in test generation
    try {
      int i1 = java.lang.Integer.parseInt("1001101011000000010110001");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test139() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test139"); }


    java.lang.Integer i1 = java.lang.Integer.valueOf((-2119346906));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + (-2119346906)+ "'", i1.equals((-2119346906)));

  }

  @Test
  public void test140() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test140"); }


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
    java.lang.Long long33 = null;
    iPBan8.expires = long33;
    tp2.IP iP35 = null;
    iPBan8.setIp(iP35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i14 + "' != '" + (-1)+ "'", i14.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i15 + "' != '" + 100+ "'", i15.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long19 + "' != '" + 100L+ "'", long19.equals(100L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP32);

  }

  @Test
  public void test141() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test141"); }


    java.lang.String str2 = java.lang.Integer.toUnsignedString(1476395046, 1405382);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1476395046"+ "'", str2.equals("1476395046"));

  }

  @Test
  public void test142() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test142"); }


    int i2 = java.lang.Integer.min(200064, 469762048);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 200064);

  }

  @Test
  public void test143() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test143"); }


    int i1 = java.lang.Integer.numberOfLeadingZeros(346030080);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 3);

  }

  @Test
  public void test144() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test144"); }


    java.lang.Integer i2 = java.lang.Integer.getInteger("4600000000", 75809);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i2 + "' != '" + 75809+ "'", i2.equals(75809));

  }

  @Test
  public void test145() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test145"); }


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
    tp2.IPBan iPBan55 = new tp2.IPBan(iP48, (java.lang.Long)(-1L));
    boolean b56 = strictlySortedSinglyLinkedList0.containsIP(iP48);
    java.lang.Integer i57 = iP48.getSecond();
    iP48.setSecond((java.lang.Integer)176016000);
    
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
    org.junit.Assert.assertTrue(b56 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i57 + "' != '" + (-1)+ "'", i57.equals((-1)));

  }

  @Test
  public void test146() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test146"); }


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
    tp2.IP iP19 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i20 = iP19.getSecond();
    iP19.setFirst((java.lang.Integer)11001000);
    java.lang.Long long23 = null;
    tp2.IPBan iPBan24 = new tp2.IPBan(iP19, long23);
    java.lang.Long long25 = iPBan24.getExpires();
    iPBan24.expires = 1L;
    tp2.IP iP32 = new tp2.IP((java.lang.Integer)67108864, (java.lang.Integer)(-2147483648), (java.lang.Integer)356246784, (java.lang.Integer)176016000);
    iPBan24.ip = iP32;
    boolean b34 = singlyLinkedList0.contains(iP32);
    tp2.SinglyLinkedList singlyLinkedList35 = new tp2.SinglyLinkedList();
    boolean b36 = singlyLinkedList35.repOK();
    tp2.IP iP41 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i42 = iP41.getFourth();
    java.lang.Integer i43 = iP41.getFourth();
    iP41.setThird((java.lang.Integer)200);
    boolean b46 = singlyLinkedList35.remove(iP41);
    boolean b47 = singlyLinkedList0.remove(iP41);
    tp2.IP iP52 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP52.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan56 = new tp2.IPBan(iP52, (java.lang.Long)100L);
    tp2.IP iP57 = iPBan56.ip;
    tp2.IP iP62 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP62.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan66 = new tp2.IPBan(iP62, (java.lang.Long)100L);
    iPBan56.setIp(iP62);
    tp2.IPBan iPBan69 = new tp2.IPBan(iP62, (java.lang.Long)(-1L));
    tp2.IP iP70 = iPBan69.ip;
    boolean b71 = singlyLinkedList0.contains(iP70);
    boolean b72 = singlyLinkedList0.isEmpty();
    boolean b73 = singlyLinkedList0.isEmpty();
    tp2.IP iP78 = new tp2.IP((java.lang.Integer)2072649970, (java.lang.Integer)562946, (java.lang.Integer)43253808, (java.lang.Integer)1487397032);
    boolean b79 = singlyLinkedList0.remove(iP78);
    tp2.IPBan iPBan81 = new tp2.IPBan(iP78, (java.lang.Long)45156032L);
    
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
    org.junit.Assert.assertTrue("'" + i20 + "' != '" + (-1)+ "'", i20.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(long25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i42 + "' != '" + 100+ "'", i42.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i43 + "' != '" + 100+ "'", i43.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b46 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b47 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP70);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b71 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b72 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b73 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b79 == false);

  }

  @Test
  public void test147() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test147"); }


    java.lang.String str1 = java.lang.Integer.toHexString(40000467);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "2625bd3"+ "'", str1.equals("2625bd3"));

  }

  @Test
  public void test148() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test148"); }


    tp2.IP iP4 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    tp2.IPBan iPBan6 = new tp2.IPBan(iP4, (java.lang.Long)469762048L);
    tp2.SinglyLinkedList singlyLinkedList7 = new tp2.SinglyLinkedList();
    boolean b8 = singlyLinkedList7.repOK();
    tp2.IP iP10 = singlyLinkedList7.get(200);
    boolean b11 = singlyLinkedList7.isEmpty();
    boolean b12 = singlyLinkedList7.repOK();
    boolean b13 = singlyLinkedList7.repOK();
    tp2.IP iP18 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i19 = iP18.getThird();
    singlyLinkedList7.add(iP18);
    tp2.IP iP22 = singlyLinkedList7.get(5);
    tp2.SinglyLinkedList singlyLinkedList23 = new tp2.SinglyLinkedList();
    int i24 = singlyLinkedList23.getSize();
    tp2.IP iP29 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i30 = iP29.getSecond();
    java.lang.Integer i31 = iP29.getFourth();
    singlyLinkedList23.add(iP29);
    tp2.IPBan iPBan34 = new tp2.IPBan(iP29, (java.lang.Long)100L);
    iP29.setThird((java.lang.Integer)(-2147483641));
    boolean b37 = singlyLinkedList7.remove(iP29);
    tp2.IP iP42 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP42.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan46 = new tp2.IPBan(iP42, (java.lang.Long)100L);
    tp2.IP iP47 = iPBan46.ip;
    tp2.IP iP52 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i53 = iP52.getFourth();
    java.lang.Integer i54 = iP52.getFourth();
    iP52.setThird((java.lang.Integer)200);
    iPBan46.ip = iP52;
    iP52.setFirst((java.lang.Integer)16777216);
    iP52.setThird((java.lang.Integer)(-2));
    boolean b62 = singlyLinkedList7.remove(iP52);
    iPBan6.ip = iP52;
    tp2.IP iP64 = iPBan6.ip;
    tp2.IP iP65 = iPBan6.ip;
    java.lang.Long long66 = iPBan6.expires;
    tp2.IP iP67 = null;
    iPBan6.setIp(iP67);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i19 + "' != '" + (-1)+ "'", i19.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i30 + "' != '" + (-1)+ "'", i30.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i31 + "' != '" + 100+ "'", i31.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i53 + "' != '" + 100+ "'", i53.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i54 + "' != '" + 100+ "'", i54.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b62 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP64);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP65);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long66 + "' != '" + 469762048L+ "'", long66.equals(469762048L));

  }

  @Test
  public void test149() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test149"); }


    tp2.SinglyLinkedList singlyLinkedList0 = new tp2.SinglyLinkedList();
    int i1 = singlyLinkedList0.getSize();
    int i2 = singlyLinkedList0.getSize();
    tp2.IP iP3 = null;
    boolean b4 = singlyLinkedList0.contains(iP3);
    boolean b5 = singlyLinkedList0.isEmpty();
    boolean b6 = singlyLinkedList0.isEmpty();
    int i7 = singlyLinkedList0.getSize();
    int i8 = singlyLinkedList0.getSize();
    boolean b9 = singlyLinkedList0.repOK();
    
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
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);

  }

  @Test
  public void test150() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test150"); }


    int i1 = java.lang.Integer.numberOfLeadingZeros(112001);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 15);

  }

  @Test
  public void test151() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test151"); }


    // The following exception was thrown during execution in test generation
    try {
      java.lang.Integer i2 = java.lang.Integer.valueOf("9dd6da6", 31457280);
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

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test152"); }


    // The following exception was thrown during execution in test generation
    try {
      int i1 = java.lang.Integer.parseInt("36b02");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test153() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test153"); }


    java.lang.String str2 = java.lang.Integer.toUnsignedString(1098933715, 164734689);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1098933715"+ "'", str2.equals("1098933715"));

  }

  @Test
  public void test154() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test154"); }


    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList0 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b1 = strictlySortedSinglyLinkedList0.repOK();
    strictlySortedSinglyLinkedList0.size = 1;
    boolean b4 = strictlySortedSinglyLinkedList0.isEmpty();
    int i5 = strictlySortedSinglyLinkedList0.size;
    int i6 = strictlySortedSinglyLinkedList0.size;
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
    boolean b43 = strictlySortedSinglyLinkedList0.add(iPBan15);
    strictlySortedSinglyLinkedList0.size = 204;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
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
    org.junit.Assert.assertTrue(b43 == true);

  }

  @Test
  public void test155() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test155"); }


    java.lang.Integer i1 = java.lang.Integer.getInteger("2537340867");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);

  }

  @Test
  public void test156() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test156"); }


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
    boolean b42 = strictlySortedSinglyLinkedList0.repOK();
    tp2.Node node43 = strictlySortedSinglyLinkedList0.header;
    tp2.Node node44 = strictlySortedSinglyLinkedList0.header;
    int i45 = strictlySortedSinglyLinkedList0.size;
    
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
    org.junit.Assert.assertTrue(b42 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i45 == 0);

  }

  @Test
  public void test157() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test157"); }


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
    strictlySortedSinglyLinkedList0.size = 1431647489;
    tp2.IPBan iPBan19 = strictlySortedSinglyLinkedList0.get(32987);
    tp2.Node node20 = strictlySortedSinglyLinkedList0.header;
    
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iPBan19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node20);

  }

  @Test
  public void test158() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test158"); }


    // The following exception was thrown during execution in test generation
    try {
      int i1 = java.lang.Integer.parseUnsignedInt("103ec84");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test159() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test159"); }


    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList0 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IPBan iPBan1 = null;
    boolean b2 = strictlySortedSinglyLinkedList0.add(iPBan1);
    int i3 = strictlySortedSinglyLinkedList0.getSize();
    int i4 = strictlySortedSinglyLinkedList0.size;
    tp2.IPBan iPBan6 = strictlySortedSinglyLinkedList0.get(16762403);
    boolean b7 = strictlySortedSinglyLinkedList0.repOK();
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
    tp2.IPBan iPBan37 = new tp2.IPBan(iP32, (java.lang.Long)1L);
    tp2.IP iP42 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP42.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan46 = new tp2.IPBan(iP42, (java.lang.Long)100L);
    tp2.IP iP47 = iPBan46.ip;
    tp2.IP iP52 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP52.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan56 = new tp2.IPBan(iP52, (java.lang.Long)100L);
    iPBan46.setIp(iP52);
    tp2.IPBan iPBan59 = new tp2.IPBan(iP52, (java.lang.Long)(-1L));
    iP52.setFirst((java.lang.Integer)242);
    java.lang.Integer i62 = iP52.getSecond();
    tp2.IPBan iPBan64 = new tp2.IPBan(iP52, (java.lang.Long)100L);
    tp2.IP iP65 = iPBan64.ip;
    boolean b66 = iP32.equals((java.lang.Object)iPBan64);
    // The following exception was thrown during execution in test generation
    try {
      boolean b67 = strictlySortedSinglyLinkedList0.add(iPBan64);
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
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iPBan6);
    
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
    org.junit.Assert.assertNotNull(iP47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i62 + "' != '" + (-1)+ "'", i62.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP65);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b66 == false);

  }

  @Test
  public void test160() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test160"); }


    int i1 = java.lang.Integer.reverse((-939497264));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 185991187);

  }

  @Test
  public void test161() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test161"); }


    int i2 = java.lang.Integer.rotateLeft(597679277, 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 597679277);

  }

  @Test
  public void test162() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test162"); }


    int i2 = java.lang.Integer.max(356302787, 1280000000);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1280000000);

  }

  @Test
  public void test163() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test163"); }


    int i1 = java.lang.Integer.reverseBytes(805306369);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 16777264);

  }

  @Test
  public void test164() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test164"); }


    // The following exception was thrown during execution in test generation
    try {
      int i2 = java.lang.Integer.divideUnsigned((-1646393811), 0);
      org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException");
    } catch (java.lang.ArithmeticException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArithmeticException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test165() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test165"); }


    java.lang.Integer i2 = java.lang.Integer.getInteger("1110111110010100000011", (java.lang.Integer)(-844495192));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i2 + "' != '" + (-844495192)+ "'", i2.equals((-844495192)));

  }

  @Test
  public void test166() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test166"); }


    int i1 = java.lang.Integer.lowestOneBit((-999872768));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 256);

  }

  @Test
  public void test167() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test167"); }


    int i1 = java.lang.Integer.highestOneBit(1419);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 1024);

  }

  @Test
  public void test168() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test168"); }


    java.lang.String str1 = java.lang.Integer.toHexString(230400);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "38400"+ "'", str1.equals("38400"));

  }

  @Test
  public void test169() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test169"); }


    java.lang.Integer i1 = java.lang.Integer.valueOf(21102592);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 21102592+ "'", i1.equals(21102592));

  }

  @Test
  public void test170() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test170"); }


    java.lang.Integer i1 = new java.lang.Integer(120);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 120+ "'", i1.equals(120));

  }

  @Test
  public void test171() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test171"); }


    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList0 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b1 = strictlySortedSinglyLinkedList0.repOK();
    strictlySortedSinglyLinkedList0.size = 1;
    strictlySortedSinglyLinkedList0.size = 0;
    tp2.IP iP10 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP10.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan14 = new tp2.IPBan(iP10, (java.lang.Long)100L);
    tp2.IP iP15 = iPBan14.ip;
    boolean b16 = strictlySortedSinglyLinkedList0.contains(iPBan14);
    boolean b17 = strictlySortedSinglyLinkedList0.isEmpty();
    tp2.Node node18 = strictlySortedSinglyLinkedList0.header;
    int i19 = strictlySortedSinglyLinkedList0.size;
    int i20 = strictlySortedSinglyLinkedList0.size;
    boolean b21 = strictlySortedSinglyLinkedList0.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);

  }

  @Test
  public void test172() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test172"); }


    int i2 = java.lang.Integer.compareUnsigned(117440640, 486539264);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == (-1));

  }

  @Test
  public void test173() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test173"); }


    java.lang.String str2 = java.lang.Integer.toUnsignedString(3276800, 1384448);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "3276800"+ "'", str2.equals("3276800"));

  }

  @Test
  public void test174() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test174"); }


    int i2 = java.lang.Integer.remainderUnsigned(1476460544, (-1967485951));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1476460544);

  }

  @Test
  public void test175() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test175"); }


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
    tp2.Node node34 = strictlySortedSinglyLinkedList0.header;
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList35 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b36 = strictlySortedSinglyLinkedList35.repOK();
    strictlySortedSinglyLinkedList35.size = 1;
    strictlySortedSinglyLinkedList35.size = 0;
    tp2.IP iP45 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i46 = iP45.getFourth();
    java.lang.Integer i47 = iP45.getFourth();
    iP45.setThird((java.lang.Integer)200);
    iP45.setThird((java.lang.Integer)356246787);
    boolean b52 = strictlySortedSinglyLinkedList35.containsIP(iP45);
    int i53 = strictlySortedSinglyLinkedList35.size;
    tp2.IP iP58 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP58.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan62 = new tp2.IPBan(iP58, (java.lang.Long)100L);
    tp2.IP iP67 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i68 = iP67.getSecond();
    java.lang.Integer i69 = iP67.getFourth();
    iP67.setFirst((java.lang.Integer)5);
    iPBan62.ip = iP67;
    java.lang.Long long73 = iPBan62.getExpires();
    iPBan62.setExpires((java.lang.Long)(-1L));
    iPBan62.expires = 100L;
    tp2.IP iP82 = new tp2.IP((java.lang.Integer)242, (java.lang.Integer)242, (java.lang.Integer)30, (java.lang.Integer)(-1));
    iP82.setSecond((java.lang.Integer)33554432);
    iPBan62.setIp(iP82);
    tp2.IP iP86 = iPBan62.ip;
    iPBan62.setExpires((java.lang.Long)2147483655L);
    boolean b89 = strictlySortedSinglyLinkedList35.contains(iPBan62);
    boolean b90 = strictlySortedSinglyLinkedList0.add(iPBan62);
    
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
    org.junit.Assert.assertNotNull(node34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i46 + "' != '" + 100+ "'", i46.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i47 + "' != '" + 100+ "'", i47.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b52 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i53 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i68 + "' != '" + (-1)+ "'", i68.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i69 + "' != '" + 100+ "'", i69.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long73 + "' != '" + 100L+ "'", long73.equals(100L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP86);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b89 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b90 == true);

  }

  @Test
  public void test176() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test176"); }


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
    boolean b78 = singlyLinkedList0.repOK();
    
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
    org.junit.Assert.assertTrue(b78 == true);

  }

  @Test
  public void test177() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test177"); }


    int i2 = java.lang.Integer.divideUnsigned((-2064248320), 69357568);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 32);

  }

  @Test
  public void test178() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test178"); }


    tp2.SinglyLinkedList singlyLinkedList0 = new tp2.SinglyLinkedList();
    boolean b1 = singlyLinkedList0.repOK();
    tp2.IP iP3 = singlyLinkedList0.get(200);
    boolean b4 = singlyLinkedList0.repOK();
    int i5 = singlyLinkedList0.getSize();
    tp2.IP iP7 = singlyLinkedList0.get(2);
    tp2.IP iP12 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP12.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan16 = new tp2.IPBan(iP12, (java.lang.Long)100L);
    tp2.IP iP17 = iPBan16.ip;
    iP17.setThird((java.lang.Integer)356246784);
    singlyLinkedList0.add(iP17);
    int i21 = singlyLinkedList0.getSize();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 1);

  }

  @Test
  public void test179() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test179"); }


    java.lang.String str1 = java.lang.Integer.toBinaryString(22002002);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "1010011111011100101010010"+ "'", str1.equals("1010011111011100101010010"));

  }

  @Test
  public void test180() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test180"); }


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
    tp2.IP iP40 = new tp2.IP((java.lang.Integer)67108864, (java.lang.Integer)(-2147483648), (java.lang.Integer)356246784, (java.lang.Integer)176016000);
    java.lang.Integer i41 = iP40.getThird();
    java.lang.Integer i42 = iP40.getFourth();
    boolean b43 = singlyLinkedList0.remove(iP40);
    tp2.IPBan iPBan45 = new tp2.IPBan(iP40, (java.lang.Long)624004L);
    tp2.IP iP46 = iPBan45.getIp();
    iP46.setFirst((java.lang.Integer)1214008220);
    
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
    org.junit.Assert.assertTrue("'" + i41 + "' != '" + 356246784+ "'", i41.equals(356246784));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i42 + "' != '" + 176016000+ "'", i42.equals(176016000));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b43 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP46);

  }

  @Test
  public void test181() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test181"); }


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
    tp2.IP iP16 = singlyLinkedList0.get(100);
    tp2.SinglyLinkedList singlyLinkedList17 = new tp2.SinglyLinkedList();
    boolean b18 = singlyLinkedList17.repOK();
    tp2.IP iP23 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP23.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan27 = new tp2.IPBan(iP23, (java.lang.Long)100L);
    iP23.setFourth((java.lang.Integer)32);
    singlyLinkedList17.add(iP23);
    singlyLinkedList0.add(iP23);
    tp2.IP iP33 = singlyLinkedList0.get((-1000079616));
    tp2.IP iP38 = new tp2.IP((java.lang.Integer)1879051264, (java.lang.Integer)32, (java.lang.Integer)28, (java.lang.Integer)5);
    iP38.setFirst((java.lang.Integer)1694498816);
    boolean b41 = singlyLinkedList0.remove(iP38);
    tp2.IP iP43 = singlyLinkedList0.get(1325666655);
    
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
    org.junit.Assert.assertNull(iP16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP43);

  }

  @Test
  public void test182() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test182"); }


    tp2.SinglyLinkedList singlyLinkedList0 = new tp2.SinglyLinkedList();
    int i1 = singlyLinkedList0.getSize();
    tp2.IP iP6 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i7 = iP6.getSecond();
    java.lang.Integer i8 = iP6.getFourth();
    singlyLinkedList0.add(iP6);
    tp2.IP iP11 = singlyLinkedList0.get(5);
    boolean b12 = singlyLinkedList0.repOK();
    tp2.IP iP14 = singlyLinkedList0.get(2013265920);
    tp2.IP iP16 = singlyLinkedList0.get((-1));
    tp2.SinglyLinkedList singlyLinkedList17 = new tp2.SinglyLinkedList();
    int i18 = singlyLinkedList17.getSize();
    tp2.IP iP23 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i24 = iP23.getSecond();
    java.lang.Integer i25 = iP23.getFourth();
    singlyLinkedList17.add(iP23);
    tp2.IPBan iPBan28 = new tp2.IPBan(iP23, (java.lang.Long)1L);
    tp2.SinglyLinkedList singlyLinkedList29 = new tp2.SinglyLinkedList();
    int i30 = singlyLinkedList29.getSize();
    tp2.IP iP35 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i36 = iP35.getSecond();
    java.lang.Integer i37 = iP35.getFourth();
    singlyLinkedList29.add(iP35);
    iP35.setFourth((java.lang.Integer)167772160);
    iP35.setSecond((java.lang.Integer)0);
    iPBan28.setIp(iP35);
    boolean b44 = singlyLinkedList0.remove(iP35);
    boolean b45 = singlyLinkedList0.repOK();
    int i46 = singlyLinkedList0.getSize();
    int i47 = singlyLinkedList0.getSize();
    tp2.IP iP49 = singlyLinkedList0.get(335561547);
    boolean b50 = singlyLinkedList0.isEmpty();
    boolean b51 = singlyLinkedList0.repOK();
    
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
    org.junit.Assert.assertNotNull(iP16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i24 + "' != '" + (-1)+ "'", i24.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i25 + "' != '" + 100+ "'", i25.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i36 + "' != '" + (-1)+ "'", i36.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i37 + "' != '" + 100+ "'", i37.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i46 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i47 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b50 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b51 == true);

  }

  @Test
  public void test183() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test183"); }


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
    tp2.Node node21 = strictlySortedSinglyLinkedList0.header;
    tp2.IP iP26 = new tp2.IP((java.lang.Integer)15204352, (java.lang.Integer)1, (java.lang.Integer)15204352, (java.lang.Integer)356246787);
    tp2.SinglyLinkedList singlyLinkedList27 = new tp2.SinglyLinkedList();
    int i28 = singlyLinkedList27.getSize();
    int i29 = singlyLinkedList27.getSize();
    boolean b30 = iP26.equals((java.lang.Object)singlyLinkedList27);
    boolean b31 = singlyLinkedList27.repOK();
    boolean b32 = singlyLinkedList27.isEmpty();
    tp2.IP iP37 = new tp2.IP((java.lang.Integer)67108864, (java.lang.Integer)(-2147483648), (java.lang.Integer)356246784, (java.lang.Integer)176016000);
    java.lang.Integer i38 = iP37.getThird();
    java.lang.Integer i39 = iP37.getFourth();
    tp2.IPBan iPBan41 = new tp2.IPBan(iP37, (java.lang.Long)167772160L);
    iP37.setThird((java.lang.Integer)162);
    singlyLinkedList27.add(iP37);
    boolean b45 = strictlySortedSinglyLinkedList0.containsIP(iP37);
    boolean b46 = strictlySortedSinglyLinkedList0.isEmpty();
    
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
    org.junit.Assert.assertNotNull(node21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i29 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i38 + "' != '" + 356246784+ "'", i38.equals(356246784));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i39 + "' != '" + 176016000+ "'", i39.equals(176016000));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b46 == true);

  }

  @Test
  public void test184() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test184"); }


    int i1 = java.lang.Integer.numberOfTrailingZeros(982843392);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 16);

  }

  @Test
  public void test185() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test185"); }


    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList0 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b1 = strictlySortedSinglyLinkedList0.repOK();
    strictlySortedSinglyLinkedList0.size = 1;
    strictlySortedSinglyLinkedList0.size = 0;
    tp2.IP iP10 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i11 = iP10.getSecond();
    java.lang.Integer i12 = iP10.getFourth();
    boolean b13 = strictlySortedSinglyLinkedList0.containsIP(iP10);
    tp2.SinglyLinkedList singlyLinkedList14 = new tp2.SinglyLinkedList();
    int i15 = singlyLinkedList14.getSize();
    tp2.IP iP20 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i21 = iP20.getSecond();
    java.lang.Integer i22 = iP20.getFourth();
    singlyLinkedList14.add(iP20);
    tp2.IP iP25 = singlyLinkedList14.get(5);
    boolean b26 = singlyLinkedList14.repOK();
    tp2.IP iP28 = singlyLinkedList14.get(2013265920);
    tp2.SinglyLinkedList singlyLinkedList29 = new tp2.SinglyLinkedList();
    int i30 = singlyLinkedList29.getSize();
    tp2.IP iP35 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i36 = iP35.getSecond();
    java.lang.Integer i37 = iP35.getFourth();
    singlyLinkedList29.add(iP35);
    iP35.setFourth((java.lang.Integer)167772160);
    singlyLinkedList14.add(iP35);
    boolean b42 = strictlySortedSinglyLinkedList0.removeFromIP(iP35);
    tp2.IP iP47 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i48 = iP47.getSecond();
    iP47.setFirst((java.lang.Integer)11001000);
    java.lang.Long long51 = null;
    tp2.IPBan iPBan52 = new tp2.IPBan(iP47, long51);
    tp2.IP iP53 = iPBan52.ip;
    boolean b54 = strictlySortedSinglyLinkedList0.containsIP(iP53);
    int i55 = strictlySortedSinglyLinkedList0.size;
    strictlySortedSinglyLinkedList0.size = 5220000;
    tp2.IPBan iPBan59 = strictlySortedSinglyLinkedList0.get((-2147483598));
    tp2.IPBan iPBan61 = strictlySortedSinglyLinkedList0.get(1342177280);
    tp2.IPBan iPBan63 = strictlySortedSinglyLinkedList0.get(667772160);
    strictlySortedSinglyLinkedList0.size = 2048672;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i11 + "' != '" + (-1)+ "'", i11.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i12 + "' != '" + 100+ "'", i12.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i21 + "' != '" + (-1)+ "'", i21.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i22 + "' != '" + 100+ "'", i22.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i36 + "' != '" + (-1)+ "'", i36.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i37 + "' != '" + 100+ "'", i37.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i48 + "' != '" + (-1)+ "'", i48.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b54 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i55 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iPBan59);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iPBan61);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iPBan63);

  }

  @Test
  public void test186() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test186"); }


    java.lang.Integer i1 = new java.lang.Integer((-1707182400));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + (-1707182400)+ "'", i1.equals((-1707182400)));

  }

  @Test
  public void test187() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test187"); }


    int i2 = java.lang.Integer.min(453696, 1048576);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 453696);

  }

  @Test
  public void test188() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test188"); }


    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList0 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IPBan iPBan1 = null;
    boolean b2 = strictlySortedSinglyLinkedList0.add(iPBan1);
    int i3 = strictlySortedSinglyLinkedList0.getSize();
    tp2.Node node4 = strictlySortedSinglyLinkedList0.header;
    strictlySortedSinglyLinkedList0.size = (-2147483648);
    boolean b7 = strictlySortedSinglyLinkedList0.repOK();
    int i8 = strictlySortedSinglyLinkedList0.getSize();
    boolean b9 = strictlySortedSinglyLinkedList0.repOK();
    boolean b10 = strictlySortedSinglyLinkedList0.isEmpty();
    int i11 = strictlySortedSinglyLinkedList0.getSize();
    
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
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == (-2147483648));

  }

  @Test
  public void test189() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test189"); }


    java.lang.String str1 = java.lang.Integer.toUnsignedString(33042);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "33042"+ "'", str1.equals("33042"));

  }

  @Test
  public void test190() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test190"); }


    int i1 = java.lang.Integer.signum(17850);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 1);

  }

  @Test
  public void test191() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test191"); }


    int i1 = java.lang.Integer.numberOfLeadingZeros((-1494926444));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);

  }

  @Test
  public void test192() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test192"); }


    // The following exception was thrown during execution in test generation
    try {
      int i2 = java.lang.Integer.parseInt("dcbd15db", 0);
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

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test193"); }


    java.lang.String str1 = java.lang.Integer.toHexString(132);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "84"+ "'", str1.equals("84"));

  }

  @Test
  public void test194() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test194"); }


    java.lang.Integer i1 = java.lang.Integer.getInteger("184549395");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);

  }

  @Test
  public void test195() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test195"); }


    tp2.IP iP4 = new tp2.IP((java.lang.Integer)3, (java.lang.Integer)486539264, (java.lang.Integer)242, (java.lang.Integer)11001000);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList5 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b6 = strictlySortedSinglyLinkedList5.repOK();
    strictlySortedSinglyLinkedList5.size = 1;
    strictlySortedSinglyLinkedList5.size = 0;
    tp2.IP iP15 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP15.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan19 = new tp2.IPBan(iP15, (java.lang.Long)100L);
    tp2.IP iP20 = iPBan19.ip;
    boolean b21 = strictlySortedSinglyLinkedList5.contains(iPBan19);
    tp2.IP iP26 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i27 = iP26.getSecond();
    iP26.setFirst((java.lang.Integer)11001000);
    java.lang.Long long30 = null;
    tp2.IPBan iPBan31 = new tp2.IPBan(iP26, long30);
    java.lang.Long long32 = iPBan31.getExpires();
    boolean b33 = strictlySortedSinglyLinkedList5.contains(iPBan31);
    boolean b34 = strictlySortedSinglyLinkedList5.repOK();
    boolean b35 = iP4.equals((java.lang.Object)b34);
    iP4.setFirst((java.lang.Integer)44);
    java.lang.Integer i38 = iP4.getThird();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i27 + "' != '" + (-1)+ "'", i27.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(long32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i38 + "' != '" + 242+ "'", i38.equals(242));

  }

  @Test
  public void test196() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test196"); }


    tp2.SinglyLinkedList singlyLinkedList0 = new tp2.SinglyLinkedList();
    boolean b1 = singlyLinkedList0.repOK();
    tp2.IP iP3 = singlyLinkedList0.get(200);
    boolean b4 = singlyLinkedList0.isEmpty();
    boolean b5 = singlyLinkedList0.repOK();
    boolean b6 = singlyLinkedList0.repOK();
    int i7 = singlyLinkedList0.getSize();
    boolean b8 = singlyLinkedList0.isEmpty();
    boolean b9 = singlyLinkedList0.repOK();
    tp2.IP iP11 = singlyLinkedList0.get((-1576765570));
    boolean b12 = singlyLinkedList0.isEmpty();
    
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
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);

  }

  @Test
  public void test197() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test197"); }


    int i1 = java.lang.Integer.highestOneBit(200000200);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 134217728);

  }

  @Test
  public void test198() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test198"); }


    long long1 = java.lang.Integer.toUnsignedLong((-2147483631));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == 2147483665L);

  }

  @Test
  public void test199() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test199"); }


    int i2 = java.lang.Integer.rotateLeft(312966304, 167755776);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 312966304);

  }

  @Test
  public void test200() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test200"); }


    tp2.IP iP4 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP4.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan8 = new tp2.IPBan(iP4, (java.lang.Long)100L);
    tp2.IP iP13 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP13.setFirst((java.lang.Integer)200);
    java.lang.Integer i16 = iP13.getFourth();
    iPBan8.setIp(iP13);
    iPBan8.setExpires((java.lang.Long)2147483648L);
    tp2.IP iP24 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i25 = iP24.getSecond();
    iPBan8.setIp(iP24);
    java.lang.Integer i27 = iP24.getFourth();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i16 + "' != '" + 100+ "'", i16.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i25 + "' != '" + (-1)+ "'", i25.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i27 + "' != '" + 100+ "'", i27.equals(100));

  }

  @Test
  public void test201() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test201"); }


    int i2 = java.lang.Integer.sum((-473825240), 1275622393);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 801797153);

  }

  @Test
  public void test202() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test202"); }


    tp2.IP iP4 = new tp2.IP((java.lang.Integer)(-33553948), (java.lang.Integer)(-1879048124), (java.lang.Integer)1647316988, (java.lang.Integer)328);

  }

  @Test
  public void test203() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test203"); }


    int i2 = java.lang.Integer.divideUnsigned(524433445, (-805306299));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);

  }

  @Test
  public void test204() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test204"); }


    int i1 = java.lang.Integer.reverseBytes(556269824);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 75809);

  }

  @Test
  public void test205() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test205"); }


    int i2 = java.lang.Integer.rotateRight(28673, (-1062673536));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 28673);

  }

  @Test
  public void test206() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test206"); }


    int i1 = java.lang.Integer.highestOneBit(1931431099);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 1073741824);

  }

  @Test
  public void test207() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test207"); }


    tp2.SinglyLinkedList singlyLinkedList0 = new tp2.SinglyLinkedList();
    boolean b1 = singlyLinkedList0.repOK();
    tp2.IP iP3 = singlyLinkedList0.get(200);
    boolean b4 = singlyLinkedList0.isEmpty();
    tp2.IP iP9 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i10 = iP9.getThird();
    boolean b11 = singlyLinkedList0.remove(iP9);
    iP9.setThird((java.lang.Integer)8388919);
    java.lang.Integer i14 = iP9.getSecond();
    iP9.setFirst((java.lang.Integer)(-788267008));
    java.lang.Integer i17 = iP9.getSecond();
    
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
    org.junit.Assert.assertTrue("'" + i14 + "' != '" + (-1)+ "'", i14.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i17 + "' != '" + (-1)+ "'", i17.equals((-1)));

  }

  @Test
  public void test208() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test208"); }


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
    tp2.Node node45 = strictlySortedSinglyLinkedList0.header;
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList46 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList47 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b48 = strictlySortedSinglyLinkedList47.repOK();
    strictlySortedSinglyLinkedList47.size = 1;
    strictlySortedSinglyLinkedList47.size = 0;
    tp2.IP iP57 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP57.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan61 = new tp2.IPBan(iP57, (java.lang.Long)100L);
    tp2.IP iP62 = iPBan61.ip;
    boolean b63 = strictlySortedSinglyLinkedList47.contains(iPBan61);
    boolean b64 = strictlySortedSinglyLinkedList47.repOK();
    tp2.SinglyLinkedList singlyLinkedList65 = new tp2.SinglyLinkedList();
    int i66 = singlyLinkedList65.getSize();
    tp2.IP iP71 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i72 = iP71.getSecond();
    java.lang.Integer i73 = iP71.getFourth();
    singlyLinkedList65.add(iP71);
    boolean b76 = iP71.equals((java.lang.Object)2147483647);
    tp2.IPBan iPBan78 = new tp2.IPBan(iP71, (java.lang.Long)(-1L));
    boolean b79 = strictlySortedSinglyLinkedList47.add(iPBan78);
    boolean b80 = strictlySortedSinglyLinkedList46.add(iPBan78);
    tp2.IPBan iPBan82 = strictlySortedSinglyLinkedList46.get(15);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList83 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b84 = strictlySortedSinglyLinkedList83.repOK();
    strictlySortedSinglyLinkedList83.size = 1;
    strictlySortedSinglyLinkedList83.size = 0;
    tp2.IPBan iPBan89 = null;
    boolean b90 = strictlySortedSinglyLinkedList83.add(iPBan89);
    tp2.Node node91 = strictlySortedSinglyLinkedList83.header;
    tp2.Node node92 = strictlySortedSinglyLinkedList83.header;
    strictlySortedSinglyLinkedList46.header = node92;
    strictlySortedSinglyLinkedList0.header = node92;
    
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
    org.junit.Assert.assertNotNull(node45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b48 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP62);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b63 == false);
    
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
    org.junit.Assert.assertTrue(b79 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b80 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iPBan82);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b84 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b90 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node91);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node92);

  }

  @Test
  public void test209() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test209"); }


    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList0 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b1 = strictlySortedSinglyLinkedList0.repOK();
    strictlySortedSinglyLinkedList0.size = 1;
    strictlySortedSinglyLinkedList0.size = 0;
    tp2.IP iP10 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP10.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan14 = new tp2.IPBan(iP10, (java.lang.Long)100L);
    tp2.IP iP15 = iPBan14.ip;
    boolean b16 = strictlySortedSinglyLinkedList0.contains(iPBan14);
    tp2.Node node17 = strictlySortedSinglyLinkedList0.header;
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList18 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b19 = strictlySortedSinglyLinkedList18.repOK();
    tp2.IP iP24 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    boolean b25 = strictlySortedSinglyLinkedList18.containsIP(iP24);
    int i26 = strictlySortedSinglyLinkedList18.getSize();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList27 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b28 = strictlySortedSinglyLinkedList27.repOK();
    strictlySortedSinglyLinkedList27.size = 1;
    strictlySortedSinglyLinkedList27.size = 0;
    tp2.IP iP37 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i38 = iP37.getSecond();
    java.lang.Integer i39 = iP37.getFourth();
    boolean b40 = strictlySortedSinglyLinkedList27.containsIP(iP37);
    tp2.Node node41 = strictlySortedSinglyLinkedList27.header;
    tp2.IP iP46 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i47 = iP46.getSecond();
    iP46.setFirst((java.lang.Integer)11001000);
    java.lang.Long long50 = null;
    tp2.IPBan iPBan51 = new tp2.IPBan(iP46, long50);
    boolean b52 = strictlySortedSinglyLinkedList27.containsIP(iP46);
    int i53 = strictlySortedSinglyLinkedList27.getSize();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList54 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList55 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b56 = strictlySortedSinglyLinkedList55.repOK();
    strictlySortedSinglyLinkedList55.size = 1;
    strictlySortedSinglyLinkedList55.size = 0;
    tp2.IP iP65 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP65.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan69 = new tp2.IPBan(iP65, (java.lang.Long)100L);
    tp2.IP iP70 = iPBan69.ip;
    boolean b71 = strictlySortedSinglyLinkedList55.contains(iPBan69);
    boolean b72 = strictlySortedSinglyLinkedList55.repOK();
    tp2.SinglyLinkedList singlyLinkedList73 = new tp2.SinglyLinkedList();
    int i74 = singlyLinkedList73.getSize();
    tp2.IP iP79 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i80 = iP79.getSecond();
    java.lang.Integer i81 = iP79.getFourth();
    singlyLinkedList73.add(iP79);
    boolean b84 = iP79.equals((java.lang.Object)2147483647);
    tp2.IPBan iPBan86 = new tp2.IPBan(iP79, (java.lang.Long)(-1L));
    boolean b87 = strictlySortedSinglyLinkedList55.add(iPBan86);
    boolean b88 = strictlySortedSinglyLinkedList54.add(iPBan86);
    tp2.IP iP89 = iPBan86.getIp();
    boolean b90 = strictlySortedSinglyLinkedList27.add(iPBan86);
    boolean b91 = strictlySortedSinglyLinkedList18.add(iPBan86);
    tp2.Node node92 = strictlySortedSinglyLinkedList18.header;
    tp2.Node node93 = strictlySortedSinglyLinkedList18.header;
    strictlySortedSinglyLinkedList0.header = node93;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i38 + "' != '" + (-1)+ "'", i38.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i39 + "' != '" + 100+ "'", i39.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i47 + "' != '" + (-1)+ "'", i47.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b52 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i53 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b56 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP70);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b71 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b72 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i74 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i80 + "' != '" + (-1)+ "'", i80.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i81 + "' != '" + 100+ "'", i81.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b84 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b87 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b88 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP89);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b90 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b91 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node92);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node93);

  }

  @Test
  public void test210() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test210"); }


    java.lang.Integer i1 = java.lang.Integer.valueOf(7929984);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 7929984+ "'", i1.equals(7929984));

  }

  @Test
  public void test211() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test211"); }


    tp2.IP iP0 = null;
    tp2.IPBan iPBan2 = new tp2.IPBan(iP0, (java.lang.Long)2046820352L);
    tp2.SinglyLinkedList singlyLinkedList3 = new tp2.SinglyLinkedList();
    boolean b4 = singlyLinkedList3.repOK();
    tp2.IP iP6 = singlyLinkedList3.get(200);
    boolean b7 = singlyLinkedList3.isEmpty();
    boolean b8 = singlyLinkedList3.repOK();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList9 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b10 = strictlySortedSinglyLinkedList9.repOK();
    tp2.IP iP15 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i16 = iP15.getSecond();
    iP15.setFirst((java.lang.Integer)11001000);
    iP15.setFirst((java.lang.Integer)(-2147483648));
    boolean b21 = strictlySortedSinglyLinkedList9.removeFromIP(iP15);
    tp2.IPBan iPBan23 = new tp2.IPBan(iP15, (java.lang.Long)0L);
    tp2.IP iP28 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP28.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan32 = new tp2.IPBan(iP28, (java.lang.Long)100L);
    tp2.IP iP33 = iPBan32.ip;
    tp2.IP iP34 = iPBan32.getIp();
    java.lang.Integer i35 = null;
    iP34.setFirst(i35);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList37 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b38 = strictlySortedSinglyLinkedList37.repOK();
    tp2.IP iP43 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i44 = iP43.getSecond();
    iP43.setFirst((java.lang.Integer)11001000);
    iP43.setFirst((java.lang.Integer)(-2147483648));
    boolean b49 = strictlySortedSinglyLinkedList37.removeFromIP(iP43);
    boolean b50 = iP34.equals((java.lang.Object)strictlySortedSinglyLinkedList37);
    tp2.IP iP55 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP55.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan59 = new tp2.IPBan(iP55, (java.lang.Long)100L);
    boolean b60 = strictlySortedSinglyLinkedList37.removeFromIP(iP55);
    java.lang.Integer i61 = iP55.getFirst();
    iPBan23.setIp(iP55);
    singlyLinkedList3.add(iP55);
    tp2.IP iP68 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP68.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan72 = new tp2.IPBan(iP68, (java.lang.Long)100L);
    tp2.IP iP73 = iPBan72.ip;
    tp2.IP iP74 = iPBan72.getIp();
    tp2.IP iP79 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP79.setFirst((java.lang.Integer)200);
    iPBan72.ip = iP79;
    singlyLinkedList3.add(iP79);
    iP79.setFirst((java.lang.Integer)(-1817903104));
    iPBan2.ip = iP79;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
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
    org.junit.Assert.assertNotNull(iP33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i44 + "' != '" + (-1)+ "'", i44.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b49 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b50 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b60 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i61 + "' != '" + 200+ "'", i61.equals(200));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP73);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP74);

  }

  @Test
  public void test212() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test212"); }


    int i1 = java.lang.Integer.parseInt("89");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 89);

  }

  @Test
  public void test213() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test213"); }


    java.lang.Integer i1 = java.lang.Integer.valueOf((-620691451));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + (-620691451)+ "'", i1.equals((-620691451)));

  }

  @Test
  public void test214() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test214"); }


    java.lang.Integer i2 = java.lang.Integer.getInteger("", (-805306299));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i2 + "' != '" + (-805306299)+ "'", i2.equals((-805306299)));

  }

  @Test
  public void test215() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test215"); }


    int i1 = java.lang.Integer.reverse((-1679818741));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == (-805304359));

  }

  @Test
  public void test216() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test216"); }


    int i1 = java.lang.Integer.reverseBytes(887839803);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 995945268);

  }

  @Test
  public void test217() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test217"); }


    int i1 = java.lang.Integer.highestOneBit(514056);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 262144);

  }

  @Test
  public void test218() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test218"); }


    int i1 = java.lang.Integer.reverseBytes(1113064448);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 284738);

  }

  @Test
  public void test219() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test219"); }


    int i1 = java.lang.Integer.numberOfTrailingZeros(840000);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 6);

  }

  @Test
  public void test220() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test220"); }


    tp2.IP iP4 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i5 = iP4.getSecond();
    java.lang.Integer i6 = iP4.getFourth();
    iP4.setFirst((java.lang.Integer)5);
    tp2.IPBan iPBan10 = new tp2.IPBan(iP4, (java.lang.Long)0L);
    iP4.setFirst((java.lang.Integer)(-1610602971));
    java.lang.Integer i13 = iP4.getFourth();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i5 + "' != '" + (-1)+ "'", i5.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i6 + "' != '" + 100+ "'", i6.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i13 + "' != '" + 100+ "'", i13.equals(100));

  }

  @Test
  public void test221() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test221"); }


    java.lang.Integer i1 = java.lang.Integer.getInteger("101010100100010000110100101");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);

  }

  @Test
  public void test222() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test222"); }


    int i1 = java.lang.Integer.lowestOneBit(11634);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 2);

  }

  @Test
  public void test223() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test223"); }


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
    tp2.SinglyLinkedList singlyLinkedList33 = new tp2.SinglyLinkedList();
    int i34 = singlyLinkedList33.getSize();
    tp2.IP iP39 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i40 = iP39.getSecond();
    java.lang.Integer i41 = iP39.getFourth();
    singlyLinkedList33.add(iP39);
    tp2.IP iP44 = singlyLinkedList33.get(5);
    boolean b45 = singlyLinkedList33.repOK();
    tp2.IP iP47 = singlyLinkedList33.get(2013265920);
    tp2.SinglyLinkedList singlyLinkedList48 = new tp2.SinglyLinkedList();
    int i49 = singlyLinkedList48.getSize();
    tp2.IP iP54 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i55 = iP54.getSecond();
    java.lang.Integer i56 = iP54.getFourth();
    singlyLinkedList48.add(iP54);
    iP54.setFourth((java.lang.Integer)167772160);
    singlyLinkedList33.add(iP54);
    java.lang.Object obj61 = null;
    boolean b62 = iP54.equals(obj61);
    iP54.setSecond((java.lang.Integer)20);
    tp2.IPBan iPBan66 = new tp2.IPBan(iP54, (java.lang.Long)20L);
    java.lang.Integer i67 = iP54.getThird();
    iP54.setFirst((java.lang.Integer)201326592);
    boolean b70 = singlyLinkedList0.contains(iP54);
    int i71 = singlyLinkedList0.getSize();
    int i72 = singlyLinkedList0.getSize();
    int i73 = singlyLinkedList0.getSize();
    int i74 = singlyLinkedList0.getSize();
    
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
    org.junit.Assert.assertTrue(i34 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i40 + "' != '" + (-1)+ "'", i40.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i41 + "' != '" + 100+ "'", i41.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i49 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i55 + "' != '" + (-1)+ "'", i55.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i56 + "' != '" + 100+ "'", i56.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b62 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i67 + "' != '" + (-1)+ "'", i67.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b70 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i71 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i72 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i73 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i74 == 0);

  }

  @Test
  public void test224() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test224"); }


    java.lang.String str1 = java.lang.Integer.toBinaryString(667772166);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "100111110011010110010100000110"+ "'", str1.equals("100111110011010110010100000110"));

  }

  @Test
  public void test225() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test225"); }


    int i2 = java.lang.Integer.max((-671088640), 326091);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 326091);

  }

  @Test
  public void test226() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test226"); }


    // The following exception was thrown during execution in test generation
    try {
      int i2 = java.lang.Integer.parseInt("242", 100110111);
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

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test227"); }


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
    tp2.IPBan iPBan53 = new tp2.IPBan(iP48, (java.lang.Long)1L);
    tp2.IPBan iPBan55 = new tp2.IPBan(iP48, (java.lang.Long)100L);
    java.lang.Long long56 = iPBan55.getExpires();
    boolean b57 = strictlySortedSinglyLinkedList0.add(iPBan55);
    java.lang.Long long58 = iPBan55.getExpires();
    java.lang.Long long59 = iPBan55.expires;
    java.lang.Long long60 = iPBan55.expires;
    
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
    org.junit.Assert.assertTrue("'" + long56 + "' != '" + 100L+ "'", long56.equals(100L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b57 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long58 + "' != '" + 100L+ "'", long58.equals(100L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long59 + "' != '" + 100L+ "'", long59.equals(100L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long60 + "' != '" + 100L+ "'", long60.equals(100L));

  }

  @Test
  public void test228() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test228"); }


    int i1 = java.lang.Integer.highestOneBit(17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 16);

  }

  @Test
  public void test229() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test229"); }


    java.lang.String str2 = java.lang.Integer.toUnsignedString(623247520, 164495360);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "623247520"+ "'", str2.equals("623247520"));

  }

  @Test
  public void test230() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test230"); }


    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList0 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b1 = strictlySortedSinglyLinkedList0.repOK();
    tp2.IP iP6 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i7 = iP6.getSecond();
    iP6.setFirst((java.lang.Integer)11001000);
    iP6.setFirst((java.lang.Integer)(-2147483648));
    boolean b12 = strictlySortedSinglyLinkedList0.removeFromIP(iP6);
    tp2.Node node13 = strictlySortedSinglyLinkedList0.header;
    tp2.IP iP18 = new tp2.IP((java.lang.Integer)3925251, (java.lang.Integer)31, (java.lang.Integer)29, (java.lang.Integer)163840);
    java.lang.Integer i19 = iP18.getThird();
    iP18.setFourth((java.lang.Integer)10485760);
    boolean b22 = strictlySortedSinglyLinkedList0.removeFromIP(iP18);
    strictlySortedSinglyLinkedList0.size = (-470782758);
    tp2.SinglyLinkedList singlyLinkedList25 = new tp2.SinglyLinkedList();
    int i26 = singlyLinkedList25.getSize();
    tp2.IP iP31 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i32 = iP31.getSecond();
    java.lang.Integer i33 = iP31.getFourth();
    singlyLinkedList25.add(iP31);
    tp2.IP iP36 = singlyLinkedList25.get(5);
    boolean b37 = singlyLinkedList25.repOK();
    tp2.IP iP39 = singlyLinkedList25.get(2013265920);
    boolean b40 = singlyLinkedList25.isEmpty();
    boolean b41 = singlyLinkedList25.isEmpty();
    int i42 = singlyLinkedList25.getSize();
    int i43 = singlyLinkedList25.getSize();
    boolean b44 = singlyLinkedList25.repOK();
    int i45 = singlyLinkedList25.getSize();
    tp2.IP iP47 = singlyLinkedList25.get(0);
    iP47.setThird((java.lang.Integer)(-2));
    java.lang.Integer i50 = iP47.getSecond();
    java.lang.Integer i51 = iP47.getFourth();
    boolean b52 = strictlySortedSinglyLinkedList0.containsIP(iP47);
    iP47.setFirst((java.lang.Integer)134217828);
    iP47.setSecond((java.lang.Integer)136);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i7 + "' != '" + (-1)+ "'", i7.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i19 + "' != '" + 29+ "'", i19.equals(29));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
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
    org.junit.Assert.assertTrue(b40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i42 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i43 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i45 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i50 + "' != '" + (-1)+ "'", i50.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i51 + "' != '" + 100+ "'", i51.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b52 == false);

  }

  @Test
  public void test231() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test231"); }


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
    tp2.SinglyLinkedList singlyLinkedList32 = new tp2.SinglyLinkedList();
    int i33 = singlyLinkedList32.getSize();
    tp2.IP iP38 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i39 = iP38.getSecond();
    java.lang.Integer i40 = iP38.getFourth();
    singlyLinkedList32.add(iP38);
    boolean b42 = iP31.equals((java.lang.Object)iP38);
    iPBan8.ip = iP38;
    java.lang.Long long44 = iPBan8.expires;
    tp2.IP iP45 = iPBan8.ip;
    java.lang.Long long46 = iPBan8.getExpires();
    iPBan8.setExpires((java.lang.Long)3355443200L);
    tp2.IP iP49 = iPBan8.getIp();
    tp2.IP iP50 = iPBan8.getIp();
    tp2.IP iP55 = new tp2.IP((java.lang.Integer)67108864, (java.lang.Integer)(-2147483648), (java.lang.Integer)356246784, (java.lang.Integer)176016000);
    iPBan8.ip = iP55;
    tp2.IP iP57 = null;
    iPBan8.setIp(iP57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i14 + "' != '" + (-1)+ "'", i14.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i15 + "' != '" + 100+ "'", i15.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long19 + "' != '" + 100L+ "'", long19.equals(100L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i39 + "' != '" + (-1)+ "'", i39.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i40 + "' != '" + 100+ "'", i40.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long44 + "' != '" + 2147483648L+ "'", long44.equals(2147483648L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long46 + "' != '" + 2147483648L+ "'", long46.equals(2147483648L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP50);

  }

  @Test
  public void test232() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test232"); }


    // The following exception was thrown during execution in test generation
    try {
      int i1 = java.lang.Integer.parseInt("11000000000000000000000000");
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

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test233"); }


    java.lang.String str2 = java.lang.Integer.toUnsignedString(523164664, (-44394719));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "523164664"+ "'", str2.equals("523164664"));

  }

  @Test
  public void test234() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test234"); }


    int i1 = java.lang.Integer.bitCount(1343111682);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 8);

  }

  @Test
  public void test235() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test235"); }


    tp2.SinglyLinkedList singlyLinkedList0 = new tp2.SinglyLinkedList();
    int i1 = singlyLinkedList0.getSize();
    tp2.IP iP6 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i7 = iP6.getSecond();
    java.lang.Integer i8 = iP6.getFourth();
    singlyLinkedList0.add(iP6);
    tp2.IP iP11 = singlyLinkedList0.get(5);
    boolean b12 = singlyLinkedList0.repOK();
    tp2.IP iP14 = singlyLinkedList0.get(2013265920);
    tp2.IP iP16 = singlyLinkedList0.get((-1));
    boolean b17 = singlyLinkedList0.isEmpty();
    boolean b18 = singlyLinkedList0.repOK();
    boolean b19 = singlyLinkedList0.repOK();
    boolean b20 = singlyLinkedList0.isEmpty();
    tp2.IP iP25 = new tp2.IP((java.lang.Integer)20480, (java.lang.Integer)785, (java.lang.Integer)1104, (java.lang.Integer)5888);
    boolean b26 = singlyLinkedList0.contains(iP25);
    tp2.IPBan iPBan28 = new tp2.IPBan(iP25, (java.lang.Long)6294016L);
    java.lang.Integer i29 = iP25.getFourth();
    
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
    org.junit.Assert.assertNotNull(iP16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i29 + "' != '" + 5888+ "'", i29.equals(5888));

  }

  @Test
  public void test236() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test236"); }


    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList0 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b1 = strictlySortedSinglyLinkedList0.repOK();
    strictlySortedSinglyLinkedList0.size = 1;
    boolean b4 = strictlySortedSinglyLinkedList0.isEmpty();
    int i5 = strictlySortedSinglyLinkedList0.getSize();
    int i6 = strictlySortedSinglyLinkedList0.size;
    int i7 = strictlySortedSinglyLinkedList0.size;
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList8 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b9 = strictlySortedSinglyLinkedList8.repOK();
    tp2.IP iP14 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i15 = iP14.getSecond();
    iP14.setFirst((java.lang.Integer)11001000);
    iP14.setFirst((java.lang.Integer)(-2147483648));
    boolean b20 = strictlySortedSinglyLinkedList8.removeFromIP(iP14);
    tp2.IPBan iPBan22 = new tp2.IPBan(iP14, (java.lang.Long)0L);
    tp2.IP iP23 = iPBan22.getIp();
    java.lang.Long long24 = iPBan22.getExpires();
    tp2.IP iP25 = iPBan22.getIp();
    tp2.IPBan iPBan27 = new tp2.IPBan(iP25, (java.lang.Long)2157841L);
    tp2.IP iP28 = iPBan27.getIp();
    boolean b29 = strictlySortedSinglyLinkedList0.removeFromIP(iP28);
    tp2.IPBan iPBan31 = strictlySortedSinglyLinkedList0.get(24576);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i15 + "' != '" + (-1)+ "'", i15.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L+ "'", long24.equals(0L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iPBan31);

  }

  @Test
  public void test237() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test237"); }


    java.lang.Integer i1 = new java.lang.Integer("10530000");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 10530000+ "'", i1.equals(10530000));

  }

  @Test
  public void test238() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test238"); }


    java.lang.Integer i1 = new java.lang.Integer(1335351);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 1335351+ "'", i1.equals(1335351));

  }

  @Test
  public void test239() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test239"); }


    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList0 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b1 = strictlySortedSinglyLinkedList0.repOK();
    tp2.IP iP6 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i7 = iP6.getSecond();
    iP6.setFirst((java.lang.Integer)11001000);
    iP6.setFirst((java.lang.Integer)(-2147483648));
    boolean b12 = strictlySortedSinglyLinkedList0.removeFromIP(iP6);
    tp2.IPBan iPBan14 = strictlySortedSinglyLinkedList0.get((-1));
    int i15 = strictlySortedSinglyLinkedList0.size;
    strictlySortedSinglyLinkedList0.size = 738198016;
    strictlySortedSinglyLinkedList0.size = 6080;
    boolean b20 = strictlySortedSinglyLinkedList0.repOK();
    int i21 = strictlySortedSinglyLinkedList0.size;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i7 + "' != '" + (-1)+ "'", i7.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iPBan14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 6080);

  }

  @Test
  public void test240() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test240"); }


    java.lang.Integer i1 = java.lang.Integer.valueOf("100001");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 100001+ "'", i1.equals(100001));

  }

  @Test
  public void test241() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test241"); }


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
    iPBan8.expires = 20971520L;
    iPBan8.expires = 3355443200L;
    tp2.IP iP41 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i42 = iP41.getSecond();
    iP41.setFirst((java.lang.Integer)11001000);
    java.lang.Long long45 = null;
    tp2.IPBan iPBan46 = new tp2.IPBan(iP41, long45);
    tp2.IP iP47 = iPBan46.ip;
    tp2.IP iP48 = iPBan46.ip;
    java.lang.Integer i49 = iP48.getFourth();
    java.lang.Integer i50 = iP48.getThird();
    iPBan8.setIp(iP48);
    java.lang.Integer i52 = iP48.getFourth();
    java.lang.Integer i53 = null;
    iP48.setSecond(i53);
    iP48.setFourth((java.lang.Integer)21484);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i29 + "' != '" + 200+ "'", i29.equals(200));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i30 + "' != '" + 100+ "'", i30.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i42 + "' != '" + (-1)+ "'", i42.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i49 + "' != '" + 100+ "'", i49.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i50 + "' != '" + (-1)+ "'", i50.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i52 + "' != '" + 100+ "'", i52.equals(100));

  }

  @Test
  public void test242() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test242"); }


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
    iPBan26.setExpires((java.lang.Long)175L);
    iPBan26.expires = 49308L;
    
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

  }

  @Test
  public void test243() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test243"); }


    int i2 = java.lang.Integer.compareUnsigned(1338374248, 196608);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);

  }

  @Test
  public void test244() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test244"); }


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
    tp2.IP iP18 = null;
    // The following exception was thrown during execution in test generation
    try {
      boolean b19 = strictlySortedSinglyLinkedList0.removeFromIP(iP18);
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
    org.junit.Assert.assertTrue(b17 == false);

  }

  @Test
  public void test245() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test245"); }


    java.lang.String str2 = java.lang.Integer.toUnsignedString(16777440, 270);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "16777440"+ "'", str2.equals("16777440"));

  }

  @Test
  public void test246() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test246"); }


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
    int i28 = strictlySortedSinglyLinkedList0.getSize();
    tp2.IP iP33 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i34 = iP33.getSecond();
    java.lang.Integer i35 = iP33.getFourth();
    iP33.setFirst((java.lang.Integer)5);
    tp2.IPBan iPBan39 = new tp2.IPBan(iP33, (java.lang.Long)0L);
    iPBan39.expires = 2147483648L;
    iPBan39.expires = 2013265920L;
    boolean b44 = strictlySortedSinglyLinkedList0.contains(iPBan39);
    tp2.IP iP45 = iPBan39.getIp();
    java.lang.Integer i46 = iP45.getFourth();
    java.lang.Integer i47 = iP45.getSecond();
    
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
    org.junit.Assert.assertTrue(i28 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i34 + "' != '" + (-1)+ "'", i34.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i35 + "' != '" + 100+ "'", i35.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i46 + "' != '" + 100+ "'", i46.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i47 + "' != '" + (-1)+ "'", i47.equals((-1)));

  }

  @Test
  public void test247() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test247"); }


    int i1 = java.lang.Integer.numberOfTrailingZeros(27744);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 5);

  }

  @Test
  public void test248() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test248"); }


    tp2.SinglyLinkedList singlyLinkedList0 = new tp2.SinglyLinkedList();
    boolean b1 = singlyLinkedList0.repOK();
    tp2.IP iP3 = singlyLinkedList0.get(200);
    boolean b4 = singlyLinkedList0.isEmpty();
    boolean b5 = singlyLinkedList0.repOK();
    boolean b6 = singlyLinkedList0.repOK();
    int i7 = singlyLinkedList0.getSize();
    boolean b8 = singlyLinkedList0.isEmpty();
    int i9 = singlyLinkedList0.getSize();
    tp2.IP iP11 = singlyLinkedList0.get(2157841);
    tp2.IP iP13 = singlyLinkedList0.get(0);
    boolean b14 = singlyLinkedList0.isEmpty();
    tp2.IP iP19 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP19.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan23 = new tp2.IPBan(iP19, (java.lang.Long)100L);
    tp2.IP iP24 = iPBan23.ip;
    tp2.IP iP25 = iPBan23.getIp();
    java.lang.Integer i26 = null;
    iP25.setFirst(i26);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList28 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b29 = strictlySortedSinglyLinkedList28.repOK();
    tp2.IP iP34 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i35 = iP34.getSecond();
    iP34.setFirst((java.lang.Integer)11001000);
    iP34.setFirst((java.lang.Integer)(-2147483648));
    boolean b40 = strictlySortedSinglyLinkedList28.removeFromIP(iP34);
    boolean b41 = iP25.equals((java.lang.Object)strictlySortedSinglyLinkedList28);
    tp2.IP iP46 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP46.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan50 = new tp2.IPBan(iP46, (java.lang.Long)100L);
    boolean b51 = strictlySortedSinglyLinkedList28.removeFromIP(iP46);
    java.lang.Integer i52 = iP46.getFirst();
    iP46.setFirst((java.lang.Integer)0);
    tp2.IPBan iPBan56 = new tp2.IPBan(iP46, (java.lang.Long)1L);
    java.lang.Integer i57 = iP46.getThird();
    singlyLinkedList0.add(iP46);
    boolean b59 = singlyLinkedList0.repOK();
    
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
    org.junit.Assert.assertNull(iP11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i35 + "' != '" + (-1)+ "'", i35.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b51 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i52 + "' != '" + 200+ "'", i52.equals(200));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i57 + "' != '" + (-1)+ "'", i57.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b59 == true);

  }

  @Test
  public void test249() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test249"); }


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
    tp2.SinglyLinkedList singlyLinkedList48 = new tp2.SinglyLinkedList();
    int i49 = singlyLinkedList48.getSize();
    tp2.IP iP54 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i55 = iP54.getSecond();
    iP54.setFirst((java.lang.Integer)11001000);
    iP54.setFirst((java.lang.Integer)32);
    boolean b60 = singlyLinkedList48.remove(iP54);
    int i61 = singlyLinkedList48.getSize();
    tp2.SinglyLinkedList singlyLinkedList62 = new tp2.SinglyLinkedList();
    int i63 = singlyLinkedList62.getSize();
    tp2.IP iP68 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i69 = iP68.getSecond();
    java.lang.Integer i70 = iP68.getFourth();
    singlyLinkedList62.add(iP68);
    boolean b73 = iP68.equals((java.lang.Object)2147483647);
    tp2.IPBan iPBan75 = new tp2.IPBan(iP68, (java.lang.Long)(-1L));
    java.lang.Long long76 = iPBan75.expires;
    tp2.IP iP81 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP81.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan85 = new tp2.IPBan(iP81, (java.lang.Long)100L);
    tp2.IP iP86 = iPBan85.ip;
    iP86.setThird((java.lang.Integer)356246784);
    iPBan75.ip = iP86;
    iP86.setFourth((java.lang.Integer)0);
    boolean b92 = singlyLinkedList48.contains(iP86);
    boolean b93 = strictlySortedSinglyLinkedList0.containsIP(iP86);
    tp2.IPBan iPBan95 = new tp2.IPBan(iP86, (java.lang.Long)28673L);
    java.lang.Integer i96 = iP86.getThird();
    
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
    org.junit.Assert.assertTrue(i49 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i55 + "' != '" + (-1)+ "'", i55.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b60 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i61 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i63 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i69 + "' != '" + (-1)+ "'", i69.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i70 + "' != '" + 100+ "'", i70.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b73 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long76 + "' != '" + (-1L)+ "'", long76.equals((-1L)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP86);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b92 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b93 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i96 + "' != '" + 356246784+ "'", i96.equals(356246784));

  }

  @Test
  public void test250() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test250"); }


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
    tp2.SinglyLinkedList singlyLinkedList28 = new tp2.SinglyLinkedList();
    boolean b29 = singlyLinkedList28.repOK();
    int i30 = singlyLinkedList28.getSize();
    boolean b31 = singlyLinkedList28.isEmpty();
    tp2.IP iP36 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP36.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan40 = new tp2.IPBan(iP36, (java.lang.Long)100L);
    tp2.IP iP41 = iPBan40.ip;
    tp2.IP iP46 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i47 = iP46.getFourth();
    java.lang.Integer i48 = iP46.getFourth();
    iP46.setThird((java.lang.Integer)200);
    iPBan40.ip = iP46;
    iP46.setFirst((java.lang.Integer)16777216);
    boolean b54 = singlyLinkedList28.contains(iP46);
    java.lang.Integer i55 = iP46.getThird();
    boolean b56 = strictlySortedSinglyLinkedList0.removeFromIP(iP46);
    tp2.IP iP61 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i62 = iP61.getSecond();
    java.lang.Integer i63 = iP61.getFourth();
    iP61.setFirst((java.lang.Integer)5);
    iP61.setSecond((java.lang.Integer)11001000);
    tp2.IPBan iPBan69 = new tp2.IPBan(iP61, (java.lang.Long)100L);
    java.lang.Integer i70 = iP61.getFirst();
    tp2.IPBan iPBan72 = new tp2.IPBan(iP61, (java.lang.Long)1242756L);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList73 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b74 = strictlySortedSinglyLinkedList73.repOK();
    tp2.IP iP79 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    boolean b80 = strictlySortedSinglyLinkedList73.containsIP(iP79);
    java.lang.Integer i81 = iP79.getFirst();
    iP79.setFourth((java.lang.Integer)211631616);
    iP79.setFirst((java.lang.Integer)29824259);
    java.lang.Integer i86 = iP79.getThird();
    iPBan72.ip = iP79;
    boolean b88 = strictlySortedSinglyLinkedList0.removeFromIP(iP79);
    tp2.IPBan iPBan89 = null;
    // The following exception was thrown during execution in test generation
    try {
      boolean b90 = strictlySortedSinglyLinkedList0.contains(iPBan89);
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
    org.junit.Assert.assertTrue(b29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i47 + "' != '" + 100+ "'", i47.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i48 + "' != '" + 100+ "'", i48.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b54 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i55 + "' != '" + 200+ "'", i55.equals(200));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b56 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i62 + "' != '" + (-1)+ "'", i62.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i63 + "' != '" + 100+ "'", i63.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i70 + "' != '" + 5+ "'", i70.equals(5));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b74 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b80 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i81 + "' != '" + (-1)+ "'", i81.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i86 + "' != '" + (-1)+ "'", i86.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b88 == true);

  }

  @Test
  public void test251() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test251"); }


    int i2 = java.lang.Integer.remainderUnsigned(0, 10668);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);

  }

  @Test
  public void test252() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test252"); }


    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList0 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b1 = strictlySortedSinglyLinkedList0.repOK();
    boolean b2 = strictlySortedSinglyLinkedList0.repOK();
    tp2.IPBan iPBan3 = null;
    boolean b4 = strictlySortedSinglyLinkedList0.contains(iPBan3);
    tp2.IP iP9 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP9.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan13 = new tp2.IPBan(iP9, (java.lang.Long)100L);
    tp2.IP iP14 = iPBan13.ip;
    tp2.IP iP19 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP19.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan23 = new tp2.IPBan(iP19, (java.lang.Long)100L);
    iPBan13.setIp(iP19);
    java.lang.Long long25 = iPBan13.getExpires();
    tp2.IP iP26 = iPBan13.ip;
    iP26.setSecond((java.lang.Integer)11001000);
    boolean b29 = strictlySortedSinglyLinkedList0.containsIP(iP26);
    int i30 = strictlySortedSinglyLinkedList0.getSize();
    tp2.SinglyLinkedList singlyLinkedList31 = new tp2.SinglyLinkedList();
    int i32 = singlyLinkedList31.getSize();
    tp2.IP iP37 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i38 = iP37.getSecond();
    java.lang.Integer i39 = iP37.getFourth();
    singlyLinkedList31.add(iP37);
    tp2.IPBan iPBan42 = new tp2.IPBan(iP37, (java.lang.Long)100L);
    tp2.IP iP43 = iPBan42.getIp();
    boolean b44 = strictlySortedSinglyLinkedList0.contains(iPBan42);
    tp2.IP iP45 = iPBan42.getIp();
    java.lang.Integer i46 = iP45.getFirst();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long25 + "' != '" + 100L+ "'", long25.equals(100L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i32 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i38 + "' != '" + (-1)+ "'", i38.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i39 + "' != '" + 100+ "'", i39.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i46 + "' != '" + (-1)+ "'", i46.equals((-1)));

  }

  @Test
  public void test253() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test253"); }


    tp2.IP iP4 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    tp2.IPBan iPBan6 = new tp2.IPBan(iP4, (java.lang.Long)469762048L);
    tp2.SinglyLinkedList singlyLinkedList7 = new tp2.SinglyLinkedList();
    boolean b8 = singlyLinkedList7.repOK();
    tp2.IP iP10 = singlyLinkedList7.get(200);
    boolean b11 = singlyLinkedList7.isEmpty();
    boolean b12 = singlyLinkedList7.repOK();
    boolean b13 = singlyLinkedList7.repOK();
    tp2.IP iP18 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i19 = iP18.getThird();
    singlyLinkedList7.add(iP18);
    tp2.IP iP22 = singlyLinkedList7.get(5);
    tp2.SinglyLinkedList singlyLinkedList23 = new tp2.SinglyLinkedList();
    int i24 = singlyLinkedList23.getSize();
    tp2.IP iP29 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i30 = iP29.getSecond();
    java.lang.Integer i31 = iP29.getFourth();
    singlyLinkedList23.add(iP29);
    tp2.IPBan iPBan34 = new tp2.IPBan(iP29, (java.lang.Long)100L);
    iP29.setThird((java.lang.Integer)(-2147483641));
    boolean b37 = singlyLinkedList7.remove(iP29);
    tp2.IP iP42 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP42.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan46 = new tp2.IPBan(iP42, (java.lang.Long)100L);
    tp2.IP iP47 = iPBan46.ip;
    tp2.IP iP52 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i53 = iP52.getFourth();
    java.lang.Integer i54 = iP52.getFourth();
    iP52.setThird((java.lang.Integer)200);
    iPBan46.ip = iP52;
    iP52.setFirst((java.lang.Integer)16777216);
    iP52.setThird((java.lang.Integer)(-2));
    boolean b62 = singlyLinkedList7.remove(iP52);
    iPBan6.ip = iP52;
    iPBan6.expires = 101101010L;
    iPBan6.setExpires((java.lang.Long)2147483655L);
    java.lang.Long long68 = iPBan6.expires;
    iPBan6.expires = 100663494L;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i19 + "' != '" + (-1)+ "'", i19.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i30 + "' != '" + (-1)+ "'", i30.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i31 + "' != '" + 100+ "'", i31.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i53 + "' != '" + 100+ "'", i53.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i54 + "' != '" + 100+ "'", i54.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b62 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long68 + "' != '" + 2147483655L+ "'", long68.equals(2147483655L));

  }

  @Test
  public void test254() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test254"); }


    java.lang.String str1 = java.lang.Integer.toOctalString((-226637295));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "36237345021"+ "'", str1.equals("36237345021"));

  }

  @Test
  public void test255() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test255"); }


    java.lang.Integer i2 = java.lang.Integer.getInteger("2200000041", (java.lang.Integer)31130880);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i2 + "' != '" + 31130880+ "'", i2.equals(31130880));

  }

  @Test
  public void test256() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test256"); }


    int i1 = java.lang.Integer.bitCount(230400);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 4);

  }

  @Test
  public void test257() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test257"); }


    int i2 = java.lang.Integer.compare((-2125856709), (-2141448953));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);

  }

  @Test
  public void test258() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test258"); }


    // The following exception was thrown during execution in test generation
    try {
      int i2 = java.lang.Integer.parseInt("719343798", 86016029);
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

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test259"); }


    int i2 = java.lang.Integer.rotateLeft((-1638982400), 514056);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1327300766);

  }

  @Test
  public void test260() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test260"); }


    // The following exception was thrown during execution in test generation
    try {
      java.lang.Integer i2 = java.lang.Integer.valueOf("20000504634", 1287564354);
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test261() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test261"); }


    int i2 = java.lang.Integer.compare(27962026, 3107);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);

  }

  @Test
  public void test262() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test262"); }


    int i1 = java.lang.Integer.signum(14848);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 1);

  }

  @Test
  public void test263() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test263"); }


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
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList21 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b22 = strictlySortedSinglyLinkedList21.repOK();
    tp2.IP iP27 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    boolean b28 = strictlySortedSinglyLinkedList21.containsIP(iP27);
    tp2.IPBan iPBan30 = strictlySortedSinglyLinkedList21.get(160);
    tp2.IPBan iPBan31 = null;
    boolean b32 = strictlySortedSinglyLinkedList21.contains(iPBan31);
    boolean b33 = iP15.equals((java.lang.Object)strictlySortedSinglyLinkedList21);
    tp2.SinglyLinkedList singlyLinkedList34 = new tp2.SinglyLinkedList();
    int i35 = singlyLinkedList34.getSize();
    tp2.IP iP40 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i41 = iP40.getSecond();
    java.lang.Integer i42 = iP40.getFourth();
    singlyLinkedList34.add(iP40);
    tp2.IPBan iPBan45 = new tp2.IPBan(iP40, (java.lang.Long)100L);
    java.lang.Long long46 = null;
    tp2.IPBan iPBan47 = new tp2.IPBan(iP40, long46);
    tp2.IP iP52 = new tp2.IP((java.lang.Integer)(-939524096), (java.lang.Integer)2147483647, (java.lang.Integer)1451229184, (java.lang.Integer)5);
    iPBan47.ip = iP52;
    tp2.IP iP54 = iPBan47.ip;
    iP54.setFourth((java.lang.Integer)1024);
    java.lang.Integer i57 = iP54.getFirst();
    boolean b58 = strictlySortedSinglyLinkedList21.removeFromIP(iP54);
    tp2.Node node59 = strictlySortedSinglyLinkedList21.header;
    int i60 = strictlySortedSinglyLinkedList21.getSize();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i18 + "' != '" + 100+ "'", i18.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iPBan30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i35 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i41 + "' != '" + (-1)+ "'", i41.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i42 + "' != '" + 100+ "'", i42.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i57 + "' != '" + (-939524096)+ "'", i57.equals((-939524096)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b58 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node59);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i60 == 0);

  }

  @Test
  public void test264() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test264"); }


    tp2.IP iP4 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP4.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan8 = new tp2.IPBan(iP4, (java.lang.Long)100L);
    tp2.IP iP13 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP13.setFirst((java.lang.Integer)200);
    java.lang.Integer i16 = iP13.getFourth();
    iPBan8.setIp(iP13);
    iPBan8.setExpires((java.lang.Long)2147483648L);
    tp2.IP iP20 = null;
    iPBan8.setIp(iP20);
    iPBan8.setExpires((java.lang.Long)243269647L);
    java.lang.Long long24 = null;
    iPBan8.expires = long24;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i16 + "' != '" + 100+ "'", i16.equals(100));

  }

  @Test
  public void test265() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test265"); }


    int i2 = java.lang.Integer.rotateLeft((-520173875), 72310545);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == (-1919172099));

  }

  @Test
  public void test266() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test266"); }


    tp2.SinglyLinkedList singlyLinkedList0 = new tp2.SinglyLinkedList();
    boolean b1 = singlyLinkedList0.repOK();
    tp2.IP iP6 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP6.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan10 = new tp2.IPBan(iP6, (java.lang.Long)100L);
    iP6.setFourth((java.lang.Integer)32);
    singlyLinkedList0.add(iP6);
    boolean b14 = singlyLinkedList0.repOK();
    boolean b15 = singlyLinkedList0.repOK();
    int i16 = singlyLinkedList0.getSize();
    tp2.IP iP18 = singlyLinkedList0.get((-473812921));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP18);

  }

  @Test
  public void test267() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test267"); }


    java.lang.Integer i1 = java.lang.Integer.getInteger("2684354560");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);

  }

  @Test
  public void test268() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test268"); }


    java.lang.String str1 = java.lang.Integer.toHexString(1006797530);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "3c0282da"+ "'", str1.equals("3c0282da"));

  }

  @Test
  public void test269() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test269"); }


    int i2 = java.lang.Integer.divideUnsigned(950272, (-5210112));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);

  }

  @Test
  public void test270() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test270"); }


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
    iPBan8.expires = 175L;
    java.lang.Long long26 = iPBan8.getExpires();
    tp2.IP iP31 = new tp2.IP((java.lang.Integer)211631616, (java.lang.Integer)10485760, (java.lang.Integer)112130, (java.lang.Integer)51756346);
    java.lang.Integer i32 = null;
    iP31.setSecond(i32);
    java.lang.Integer i34 = iP31.getFirst();
    iP31.setFourth((java.lang.Integer)65536);
    iPBan8.ip = iP31;
    iP31.setFirst((java.lang.Integer)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i14 + "' != '" + (-1)+ "'", i14.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i15 + "' != '" + 100+ "'", i15.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long19 + "' != '" + 100L+ "'", long19.equals(100L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long26 + "' != '" + 175L+ "'", long26.equals(175L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i34 + "' != '" + 211631616+ "'", i34.equals(211631616));

  }

  @Test
  public void test271() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test271"); }


    java.lang.Integer i1 = new java.lang.Integer("1764881024");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 1764881024+ "'", i1.equals(1764881024));

  }

  @Test
  public void test272() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test272"); }


    int i1 = java.lang.Integer.reverse(41984);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 2424832);

  }

  @Test
  public void test273() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test273"); }


    int i2 = java.lang.Integer.rotateLeft(174231553, (-1698241190));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 69831232);

  }

  @Test
  public void test274() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test274"); }


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
    int i28 = strictlySortedSinglyLinkedList0.size;
    int i29 = strictlySortedSinglyLinkedList0.getSize();
    boolean b30 = strictlySortedSinglyLinkedList0.isEmpty();
    
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
    org.junit.Assert.assertTrue(i28 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i29 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == true);

  }

  @Test
  public void test275() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test275"); }


    tp2.IP iP4 = new tp2.IP((java.lang.Integer)759218515, (java.lang.Integer)(-649967296), (java.lang.Integer)(-2063597568), (java.lang.Integer)8670211);

  }

  @Test
  public void test276() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test276"); }


    java.lang.Integer i1 = java.lang.Integer.valueOf(9759617);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 9759617+ "'", i1.equals(9759617));

  }

  @Test
  public void test277() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test277"); }


    int i1 = java.lang.Integer.lowestOneBit(11537672);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 8);

  }

  @Test
  public void test278() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test278"); }


    int i1 = java.lang.Integer.bitCount(3320);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 7);

  }

  @Test
  public void test279() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test279"); }


    int i2 = java.lang.Integer.divideUnsigned(73, 89268645);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);

  }

  @Test
  public void test280() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test280"); }


    int i1 = java.lang.Integer.highestOneBit(4246571);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 4194304);

  }

  @Test
  public void test281() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test281"); }


    int i2 = java.lang.Integer.divideUnsigned(498, 11066535);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);

  }

  @Test
  public void test282() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test282"); }


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
    tp2.IP iP61 = singlyLinkedList19.get(25154432);
    tp2.IP iP63 = singlyLinkedList19.get(40);
    boolean b64 = singlyLinkedList19.isEmpty();
    int i65 = singlyLinkedList19.getSize();
    
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
    org.junit.Assert.assertNull(iP61);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP63);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b64 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i65 == 0);

  }

  @Test
  public void test283() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test283"); }


    // The following exception was thrown during execution in test generation
    try {
      int i2 = java.lang.Integer.parseUnsignedInt("db0100", 128578);
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

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test284"); }


    int i1 = java.lang.Integer.signum((-788267008));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == (-1));

  }

  @Test
  public void test285() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test285"); }


    java.lang.String str1 = java.lang.Integer.toOctalString(773831);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "2747307"+ "'", str1.equals("2747307"));

  }

  @Test
  public void test286() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test286"); }


    // The following exception was thrown during execution in test generation
    try {
      int i2 = java.lang.Integer.parseInt("1071236360", (-2030043137));
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test287() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test287"); }


    // The following exception was thrown during execution in test generation
    try {
      java.lang.Integer i1 = java.lang.Integer.valueOf("153be5");
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

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test288"); }


    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList0 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b1 = strictlySortedSinglyLinkedList0.repOK();
    strictlySortedSinglyLinkedList0.size = 1;
    boolean b4 = strictlySortedSinglyLinkedList0.isEmpty();
    int i5 = strictlySortedSinglyLinkedList0.getSize();
    int i6 = strictlySortedSinglyLinkedList0.getSize();
    tp2.IP iP11 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP11.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan15 = new tp2.IPBan(iP11, (java.lang.Long)100L);
    tp2.IP iP20 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP20.setFirst((java.lang.Integer)200);
    java.lang.Integer i23 = iP20.getFourth();
    iPBan15.setIp(iP20);
    java.lang.Long long25 = iPBan15.expires;
    tp2.IP iP30 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i31 = iP30.getSecond();
    iP30.setFirst((java.lang.Integer)11001000);
    iP30.setFirst((java.lang.Integer)32);
    iPBan15.setIp(iP30);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList37 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b38 = strictlySortedSinglyLinkedList37.repOK();
    tp2.IP iP43 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i44 = iP43.getSecond();
    iP43.setFirst((java.lang.Integer)11001000);
    iP43.setFirst((java.lang.Integer)(-2147483648));
    boolean b49 = strictlySortedSinglyLinkedList37.removeFromIP(iP43);
    tp2.IPBan iPBan51 = new tp2.IPBan(iP43, (java.lang.Long)0L);
    tp2.IP iP52 = iPBan51.getIp();
    iPBan15.ip = iP52;
    boolean b54 = strictlySortedSinglyLinkedList0.add(iPBan15);
    tp2.SinglyLinkedList singlyLinkedList55 = new tp2.SinglyLinkedList();
    boolean b56 = singlyLinkedList55.repOK();
    tp2.IP iP58 = singlyLinkedList55.get(200);
    boolean b59 = singlyLinkedList55.isEmpty();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList60 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b61 = strictlySortedSinglyLinkedList60.repOK();
    tp2.IP iP66 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i67 = iP66.getSecond();
    iP66.setFirst((java.lang.Integer)11001000);
    iP66.setFirst((java.lang.Integer)(-2147483648));
    boolean b72 = strictlySortedSinglyLinkedList60.removeFromIP(iP66);
    boolean b73 = singlyLinkedList55.remove(iP66);
    iP66.setFourth((java.lang.Integer)30);
    java.lang.Integer i76 = iP66.getThird();
    iP66.setFirst((java.lang.Integer)201326592);
    java.lang.Integer i79 = iP66.getThird();
    boolean b80 = strictlySortedSinglyLinkedList0.removeFromIP(iP66);
    int i81 = strictlySortedSinglyLinkedList0.size;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i23 + "' != '" + 100+ "'", i23.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long25 + "' != '" + 100L+ "'", long25.equals(100L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i31 + "' != '" + (-1)+ "'", i31.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i44 + "' != '" + (-1)+ "'", i44.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b49 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b54 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b56 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP58);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b59 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b61 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i67 + "' != '" + (-1)+ "'", i67.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b72 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b73 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i76 + "' != '" + (-1)+ "'", i76.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i79 + "' != '" + (-1)+ "'", i79.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b80 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i81 == 2);

  }

  @Test
  public void test289() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test289"); }


    tp2.IP iP4 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP4.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan8 = new tp2.IPBan(iP4, (java.lang.Long)100L);
    tp2.IP iP13 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iPBan8.setIp(iP13);
    iPBan8.expires = 2046820352L;
    java.lang.Long long17 = iPBan8.expires;
    tp2.IP iP22 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i23 = iP22.getSecond();
    tp2.SinglyLinkedList singlyLinkedList24 = new tp2.SinglyLinkedList();
    boolean b25 = singlyLinkedList24.repOK();
    boolean b26 = iP22.equals((java.lang.Object)b25);
    tp2.IPBan iPBan28 = new tp2.IPBan(iP22, (java.lang.Long)100L);
    tp2.IP iP29 = iPBan28.getIp();
    tp2.IPBan iPBan31 = new tp2.IPBan(iP29, (java.lang.Long)13L);
    tp2.IP iP32 = iPBan31.ip;
    iPBan8.ip = iP32;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long17 + "' != '" + 2046820352L+ "'", long17.equals(2046820352L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i23 + "' != '" + (-1)+ "'", i23.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP32);

  }

  @Test
  public void test290() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test290"); }


    int i2 = java.lang.Integer.rotateRight((-1657785382), 6331777);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1318590957);

  }

  @Test
  public void test291() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test291"); }


    int i2 = java.lang.Integer.max((-1441486166), 37469776);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 37469776);

  }

  @Test
  public void test292() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test292"); }


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
    iPBan14.setExpires((java.lang.Long)65000000L);
    
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

  }

  @Test
  public void test293() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test293"); }


    int i1 = java.lang.Integer.parseInt("525598720");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 525598720);

  }

  @Test
  public void test294() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test294"); }


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
    tp2.IP iP29 = singlyLinkedList0.get((-1));
    boolean b30 = singlyLinkedList0.isEmpty();
    tp2.IP iP32 = singlyLinkedList0.get(294890);
    
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
    org.junit.Assert.assertNotNull(iP29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP32);

  }

  @Test
  public void test295() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test295"); }


    int i2 = java.lang.Integer.rotateLeft((-1610602971), 111111);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1250000);

  }

  @Test
  public void test296() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test296"); }


    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList0 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b1 = strictlySortedSinglyLinkedList0.repOK();
    strictlySortedSinglyLinkedList0.size = 1;
    boolean b4 = strictlySortedSinglyLinkedList0.isEmpty();
    int i5 = strictlySortedSinglyLinkedList0.getSize();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList6 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b7 = strictlySortedSinglyLinkedList6.repOK();
    tp2.IP iP12 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    boolean b13 = strictlySortedSinglyLinkedList6.containsIP(iP12);
    tp2.Node node14 = strictlySortedSinglyLinkedList6.header;
    boolean b15 = strictlySortedSinglyLinkedList6.isEmpty();
    int i16 = strictlySortedSinglyLinkedList6.getSize();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList17 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b18 = strictlySortedSinglyLinkedList17.repOK();
    tp2.IP iP23 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i24 = iP23.getSecond();
    iP23.setFirst((java.lang.Integer)11001000);
    iP23.setFirst((java.lang.Integer)(-2147483648));
    boolean b29 = strictlySortedSinglyLinkedList17.removeFromIP(iP23);
    tp2.Node node30 = strictlySortedSinglyLinkedList17.header;
    strictlySortedSinglyLinkedList6.header = node30;
    tp2.IPBan iPBan33 = strictlySortedSinglyLinkedList6.get(51756250);
    tp2.SinglyLinkedList singlyLinkedList34 = new tp2.SinglyLinkedList();
    int i35 = singlyLinkedList34.getSize();
    tp2.IP iP40 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i41 = iP40.getSecond();
    java.lang.Integer i42 = iP40.getFourth();
    singlyLinkedList34.add(iP40);
    tp2.IPBan iPBan45 = new tp2.IPBan(iP40, (java.lang.Long)100L);
    java.lang.Long long46 = null;
    tp2.IPBan iPBan47 = new tp2.IPBan(iP40, long46);
    java.lang.Long long48 = iPBan47.getExpires();
    boolean b49 = strictlySortedSinglyLinkedList6.contains(iPBan47);
    tp2.IP iP50 = iPBan47.ip;
    tp2.IP iP51 = iPBan47.ip;
    boolean b52 = strictlySortedSinglyLinkedList0.contains(iPBan47);
    iPBan47.expires = 1700L;
    tp2.IP iP55 = iPBan47.ip;
    java.lang.Integer i56 = iP55.getFourth();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i24 + "' != '" + (-1)+ "'", i24.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iPBan33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i35 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i41 + "' != '" + (-1)+ "'", i41.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i42 + "' != '" + 100+ "'", i42.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(long48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b49 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b52 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP55);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i56 + "' != '" + 100+ "'", i56.equals(100));

  }

  @Test
  public void test297() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test297"); }


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
    int i31 = singlyLinkedList0.getSize();
    tp2.SinglyLinkedList singlyLinkedList32 = new tp2.SinglyLinkedList();
    int i33 = singlyLinkedList32.getSize();
    boolean b34 = singlyLinkedList32.isEmpty();
    tp2.IP iP39 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP39.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan43 = new tp2.IPBan(iP39, (java.lang.Long)100L);
    tp2.IP iP44 = iPBan43.ip;
    tp2.IP iP45 = iPBan43.getIp();
    tp2.IP iP50 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP50.setFirst((java.lang.Integer)200);
    iPBan43.ip = iP50;
    iP50.setFourth((java.lang.Integer)242);
    singlyLinkedList32.add(iP50);
    iP50.setSecond((java.lang.Integer)31);
    java.lang.Integer i59 = iP50.getSecond();
    java.lang.Integer i60 = iP50.getSecond();
    iP50.setFourth((java.lang.Integer)900683009);
    boolean b63 = singlyLinkedList0.remove(iP50);
    java.lang.Integer i64 = iP50.getSecond();
    
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
    org.junit.Assert.assertTrue(i31 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i59 + "' != '" + 31+ "'", i59.equals(31));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i60 + "' != '" + 31+ "'", i60.equals(31));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b63 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i64 + "' != '" + 31+ "'", i64.equals(31));

  }

  @Test
  public void test298() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test298"); }


    java.lang.Integer i1 = new java.lang.Integer("1040225960");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 1040225960+ "'", i1.equals(1040225960));

  }

  @Test
  public void test299() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test299"); }


    // The following exception was thrown during execution in test generation
    try {
      java.lang.Integer i1 = new java.lang.Integer("10110001000111111101");
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

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test300"); }


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
    tp2.IPBan iPBan22 = new tp2.IPBan(iP9, (java.lang.Long)67108864L);
    tp2.SinglyLinkedList singlyLinkedList23 = new tp2.SinglyLinkedList();
    int i24 = singlyLinkedList23.getSize();
    tp2.IP iP29 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i30 = iP29.getSecond();
    java.lang.Integer i31 = iP29.getFourth();
    singlyLinkedList23.add(iP29);
    tp2.IPBan iPBan34 = new tp2.IPBan(iP29, (java.lang.Long)100L);
    iPBan34.expires = 10L;
    tp2.IP iP37 = iPBan34.getIp();
    iPBan34.expires = 0L;
    tp2.SinglyLinkedList singlyLinkedList40 = new tp2.SinglyLinkedList();
    int i41 = singlyLinkedList40.getSize();
    tp2.IP iP46 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i47 = iP46.getSecond();
    java.lang.Integer i48 = iP46.getFourth();
    singlyLinkedList40.add(iP46);
    tp2.IP iP51 = singlyLinkedList40.get(5);
    boolean b52 = singlyLinkedList40.repOK();
    tp2.IP iP54 = singlyLinkedList40.get(2013265920);
    tp2.SinglyLinkedList singlyLinkedList55 = new tp2.SinglyLinkedList();
    int i56 = singlyLinkedList55.getSize();
    tp2.IP iP61 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i62 = iP61.getSecond();
    java.lang.Integer i63 = iP61.getFourth();
    singlyLinkedList55.add(iP61);
    iP61.setFourth((java.lang.Integer)167772160);
    singlyLinkedList40.add(iP61);
    java.lang.Object obj68 = null;
    boolean b69 = iP61.equals(obj68);
    iP61.setSecond((java.lang.Integer)20);
    iPBan34.ip = iP61;
    java.lang.Long long73 = iPBan34.getExpires();
    iPBan34.expires = 6047546L;
    java.lang.Long long76 = iPBan34.getExpires();
    boolean b77 = iP9.equals((java.lang.Object)long76);
    
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
    org.junit.Assert.assertTrue(i24 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i30 + "' != '" + (-1)+ "'", i30.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i31 + "' != '" + 100+ "'", i31.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i41 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i47 + "' != '" + (-1)+ "'", i47.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i48 + "' != '" + 100+ "'", i48.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b52 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i56 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i62 + "' != '" + (-1)+ "'", i62.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i63 + "' != '" + 100+ "'", i63.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b69 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long73 + "' != '" + 0L+ "'", long73.equals(0L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long76 + "' != '" + 6047546L+ "'", long76.equals(6047546L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b77 == false);

  }

  @Test
  public void test301() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test301"); }


    int i2 = java.lang.Integer.rotateRight((-1073741790), 14680064);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == (-1073741790));

  }

  @Test
  public void test302() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test302"); }


    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList0 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b1 = strictlySortedSinglyLinkedList0.repOK();
    tp2.IP iP6 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i7 = iP6.getSecond();
    iP6.setFirst((java.lang.Integer)11001000);
    iP6.setFirst((java.lang.Integer)(-2147483648));
    boolean b12 = strictlySortedSinglyLinkedList0.removeFromIP(iP6);
    java.lang.Integer i13 = iP6.getThird();
    java.lang.Integer i14 = iP6.getThird();
    java.lang.Integer i15 = iP6.getThird();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i7 + "' != '" + (-1)+ "'", i7.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i13 + "' != '" + (-1)+ "'", i13.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i14 + "' != '" + (-1)+ "'", i14.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i15 + "' != '" + (-1)+ "'", i15.equals((-1)));

  }

  @Test
  public void test303() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test303"); }


    int i1 = java.lang.Integer.signum(88);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 1);

  }

  @Test
  public void test304() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test304"); }


    int i2 = java.lang.Integer.divideUnsigned(0, 544);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);

  }

  @Test
  public void test305() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test305"); }


    java.lang.Integer i2 = java.lang.Integer.getInteger("1100111110101", (java.lang.Integer)(-1324797190));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i2 + "' != '" + (-1324797190)+ "'", i2.equals((-1324797190)));

  }

  @Test
  public void test306() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test306"); }


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
    tp2.IP iP80 = iPBan41.ip;
    
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
    org.junit.Assert.assertNotNull(iP80);

  }

  @Test
  public void test307() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test307"); }


    // The following exception was thrown during execution in test generation
    try {
      int i2 = java.lang.Integer.parseUnsignedInt("c8000000", 1908126);
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

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test308"); }


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
    tp2.IP iP30 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP30.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan34 = new tp2.IPBan(iP30, (java.lang.Long)100L);
    java.lang.Integer i35 = iP30.getFirst();
    java.lang.Integer i36 = iP30.getFourth();
    singlyLinkedList0.add(iP30);
    tp2.IP iP38 = null;
    boolean b39 = singlyLinkedList0.contains(iP38);
    tp2.IP iP41 = singlyLinkedList0.get(13400000);
    
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
    org.junit.Assert.assertTrue("'" + i35 + "' != '" + 200+ "'", i35.equals(200));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i36 + "' != '" + 100+ "'", i36.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP41);

  }

  @Test
  public void test309() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test309"); }


    int i1 = java.lang.Integer.signum(131764);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 1);

  }

  @Test
  public void test310() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test310"); }


    int i1 = java.lang.Integer.lowestOneBit(672800);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 32);

  }

  @Test
  public void test311() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test311"); }


    int i2 = java.lang.Integer.min((-129235965), 92);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == (-129235965));

  }

  @Test
  public void test312() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test312"); }


    int i1 = java.lang.Integer.numberOfTrailingZeros(40000007);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);

  }

  @Test
  public void test313() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test313"); }


    int i2 = java.lang.Integer.rotateLeft((-470781760), (-1746625132));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 202260231);

  }

  @Test
  public void test314() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test314"); }


    // The following exception was thrown during execution in test generation
    try {
      java.lang.Integer i1 = java.lang.Integer.decode("2306410020");
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

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test315"); }


    java.lang.Integer i1 = new java.lang.Integer(524311045);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 524311045+ "'", i1.equals(524311045));

  }

  @Test
  public void test316() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test316"); }


    java.lang.String str1 = java.lang.Integer.toOctalString(60704);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "166440"+ "'", str1.equals("166440"));

  }

  @Test
  public void test317() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test317"); }


    int i1 = java.lang.Integer.parseInt("111010010");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 111010010);

  }

  @Test
  public void test318() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test318"); }


    java.lang.String str2 = java.lang.Integer.toUnsignedString(742913024, (-5210112));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "742913024"+ "'", str2.equals("742913024"));

  }

  @Test
  public void test319() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test319"); }


    int i2 = java.lang.Integer.remainderUnsigned((-1507262448), 1325683166);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 136338516);

  }

  @Test
  public void test320() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test320"); }


    java.lang.Integer i2 = java.lang.Integer.getInteger("11100011110000100000000000101000", (-669283115));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i2 + "' != '" + (-669283115)+ "'", i2.equals((-669283115)));

  }

  @Test
  public void test321() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test321"); }


    // The following exception was thrown during execution in test generation
    try {
      java.lang.Integer i1 = java.lang.Integer.valueOf("1010101010101010011010100000001");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test322() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test322"); }


    // The following exception was thrown during execution in test generation
    try {
      int i1 = java.lang.Integer.parseUnsignedInt("11100101001110110001010100000000");
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

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test323"); }


    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList0 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b1 = strictlySortedSinglyLinkedList0.repOK();
    strictlySortedSinglyLinkedList0.size = 1;
    boolean b4 = strictlySortedSinglyLinkedList0.isEmpty();
    int i5 = strictlySortedSinglyLinkedList0.getSize();
    boolean b6 = strictlySortedSinglyLinkedList0.isEmpty();
    int i7 = strictlySortedSinglyLinkedList0.getSize();
    strictlySortedSinglyLinkedList0.size = 4;
    boolean b10 = strictlySortedSinglyLinkedList0.repOK();
    tp2.SinglyLinkedList singlyLinkedList11 = new tp2.SinglyLinkedList();
    int i12 = singlyLinkedList11.getSize();
    tp2.IP iP17 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i18 = iP17.getSecond();
    iP17.setFirst((java.lang.Integer)11001000);
    iP17.setFirst((java.lang.Integer)32);
    boolean b23 = singlyLinkedList11.remove(iP17);
    tp2.IP iP25 = singlyLinkedList11.get((-671088640));
    tp2.IP iP30 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i31 = iP30.getSecond();
    iP30.setFirst((java.lang.Integer)11001000);
    java.lang.Long long34 = null;
    tp2.IPBan iPBan35 = new tp2.IPBan(iP30, long34);
    tp2.IP iP36 = iPBan35.ip;
    tp2.IP iP37 = iPBan35.ip;
    java.lang.Integer i38 = iP37.getSecond();
    boolean b39 = singlyLinkedList11.contains(iP37);
    java.lang.Integer i40 = iP37.getFirst();
    boolean b41 = strictlySortedSinglyLinkedList0.containsIP(iP37);
    tp2.IPBan iPBan43 = strictlySortedSinglyLinkedList0.get(111111);
    
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
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i18 + "' != '" + (-1)+ "'", i18.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i31 + "' != '" + (-1)+ "'", i31.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i38 + "' != '" + (-1)+ "'", i38.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i40 + "' != '" + 11001000+ "'", i40.equals(11001000));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iPBan43);

  }

  @Test
  public void test324() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test324"); }


    java.lang.Integer i1 = new java.lang.Integer(1157824512);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 1157824512+ "'", i1.equals(1157824512));

  }

  @Test
  public void test325() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test325"); }


    tp2.IP iP4 = new tp2.IP((java.lang.Integer)5, (java.lang.Integer)362, (java.lang.Integer)51756492, (java.lang.Integer)167755776);
    tp2.IP iP9 = new tp2.IP((java.lang.Integer)242, (java.lang.Integer)242, (java.lang.Integer)30, (java.lang.Integer)(-1));
    java.lang.Integer i10 = iP9.getFirst();
    iP9.setThird((java.lang.Integer)362);
    java.lang.Integer i13 = iP9.getFourth();
    java.lang.Integer i14 = iP9.getThird();
    iP9.setFirst((java.lang.Integer)(-2120392704));
    iP9.setSecond((java.lang.Integer)68);
    boolean b19 = iP4.equals((java.lang.Object)68);
    java.lang.Integer i20 = iP4.getFourth();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i10 + "' != '" + 242+ "'", i10.equals(242));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i13 + "' != '" + (-1)+ "'", i13.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i14 + "' != '" + 362+ "'", i14.equals(362));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i20 + "' != '" + 167755776+ "'", i20.equals(167755776));

  }

  @Test
  public void test326() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test326"); }


    int i1 = java.lang.Integer.highestOneBit(371235425);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 268435456);

  }

  @Test
  public void test327() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test327"); }


    // The following exception was thrown during execution in test generation
    try {
      java.lang.Integer i1 = java.lang.Integer.valueOf("20h4db7f");
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

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test328"); }


    int i2 = java.lang.Integer.rotateLeft(250996265, 1780482048);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 250996265);

  }

  @Test
  public void test329() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test329"); }


    int i2 = java.lang.Integer.rotateRight(804, 5244665);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 102912);

  }

  @Test
  public void test330() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test330"); }


    tp2.IP iP4 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP4.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan8 = new tp2.IPBan(iP4, (java.lang.Long)100L);
    tp2.IP iP9 = iPBan8.ip;
    tp2.IP iP14 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP14.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan18 = new tp2.IPBan(iP14, (java.lang.Long)100L);
    iPBan8.setIp(iP14);
    iPBan8.expires = 2013265920L;
    tp2.SinglyLinkedList singlyLinkedList22 = new tp2.SinglyLinkedList();
    int i23 = singlyLinkedList22.getSize();
    tp2.IP iP28 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i29 = iP28.getSecond();
    java.lang.Integer i30 = iP28.getFourth();
    singlyLinkedList22.add(iP28);
    tp2.IPBan iPBan33 = new tp2.IPBan(iP28, (java.lang.Long)100L);
    iPBan8.setIp(iP28);
    tp2.IPBan iPBan36 = new tp2.IPBan(iP28, (java.lang.Long)2147483648L);
    iPBan36.expires = 20480L;
    tp2.IP iP39 = null;
    iPBan36.setIp(iP39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i29 + "' != '" + (-1)+ "'", i29.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i30 + "' != '" + 100+ "'", i30.equals(100));

  }

  @Test
  public void test331() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test331"); }


    java.lang.String str2 = java.lang.Integer.toUnsignedString(956498237, 346729152);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "956498237"+ "'", str2.equals("956498237"));

  }

  @Test
  public void test332() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test332"); }


    int i2 = java.lang.Integer.compareUnsigned(2066374410, (-600808160));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == (-1));

  }

  @Test
  public void test333() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test333"); }


    tp2.SinglyLinkedList singlyLinkedList0 = new tp2.SinglyLinkedList();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList1 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b2 = strictlySortedSinglyLinkedList1.repOK();
    tp2.IP iP7 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i8 = iP7.getSecond();
    iP7.setFirst((java.lang.Integer)11001000);
    iP7.setFirst((java.lang.Integer)(-2147483648));
    boolean b13 = strictlySortedSinglyLinkedList1.removeFromIP(iP7);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList14 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b15 = strictlySortedSinglyLinkedList14.isEmpty();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList16 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b17 = strictlySortedSinglyLinkedList16.repOK();
    tp2.IP iP22 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    boolean b23 = strictlySortedSinglyLinkedList16.containsIP(iP22);
    tp2.Node node24 = strictlySortedSinglyLinkedList16.header;
    strictlySortedSinglyLinkedList14.header = node24;
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList26 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b27 = strictlySortedSinglyLinkedList26.repOK();
    strictlySortedSinglyLinkedList26.size = 1;
    strictlySortedSinglyLinkedList26.size = 0;
    tp2.IP iP36 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP36.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan40 = new tp2.IPBan(iP36, (java.lang.Long)100L);
    tp2.IP iP45 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP45.setFirst((java.lang.Integer)200);
    java.lang.Integer i48 = iP45.getFourth();
    iPBan40.setIp(iP45);
    boolean b50 = strictlySortedSinglyLinkedList26.contains(iPBan40);
    boolean b51 = strictlySortedSinglyLinkedList14.contains(iPBan40);
    tp2.SinglyLinkedList singlyLinkedList52 = new tp2.SinglyLinkedList();
    int i53 = singlyLinkedList52.getSize();
    int i54 = singlyLinkedList52.getSize();
    tp2.IP iP55 = null;
    boolean b56 = singlyLinkedList52.contains(iP55);
    tp2.IP iP58 = singlyLinkedList52.get(27);
    tp2.IP iP63 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP63.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan67 = new tp2.IPBan(iP63, (java.lang.Long)100L);
    tp2.IP iP68 = iPBan67.ip;
    tp2.IP iP73 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP73.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan77 = new tp2.IPBan(iP73, (java.lang.Long)100L);
    iPBan67.setIp(iP73);
    boolean b79 = singlyLinkedList52.remove(iP73);
    iPBan40.ip = iP73;
    boolean b81 = strictlySortedSinglyLinkedList1.containsIP(iP73);
    singlyLinkedList0.add(iP73);
    tp2.IP iP84 = singlyLinkedList0.get(51756250);
    tp2.IP iP86 = singlyLinkedList0.get((-1393660887));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i8 + "' != '" + (-1)+ "'", i8.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i48 + "' != '" + 100+ "'", i48.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b50 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b51 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i53 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i54 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b56 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP58);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP68);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b79 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b81 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP84);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP86);

  }

  @Test
  public void test334() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test334"); }


    java.lang.Integer i1 = java.lang.Integer.valueOf("640002022");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 640002022+ "'", i1.equals(640002022));

  }

  @Test
  public void test335() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test335"); }


    int i1 = java.lang.Integer.reverse(1258291200);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 210);

  }

  @Test
  public void test336() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test336"); }


    int i2 = java.lang.Integer.remainderUnsigned((-2030043137), 35000);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 4159);

  }

  @Test
  public void test337() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test337"); }


    // The following exception was thrown during execution in test generation
    try {
      java.lang.Integer i2 = java.lang.Integer.valueOf("167772160", (-1866746267));
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

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test338"); }


    int i2 = java.lang.Integer.rotateLeft((-811446013), (-233400046));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1141849737);

  }

  @Test
  public void test339() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test339"); }


    java.lang.Integer i1 = java.lang.Integer.valueOf((-669283115));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + (-669283115)+ "'", i1.equals((-669283115)));

  }

  @Test
  public void test340() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test340"); }


    int i2 = java.lang.Integer.compare(66, (-1896873956));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);

  }

  @Test
  public void test341() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test341"); }


    int i1 = java.lang.Integer.bitCount(1080133107);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 13);

  }

  @Test
  public void test342() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test342"); }


    java.lang.Integer i1 = null;
    java.lang.Integer i2 = java.lang.Integer.getInteger("1ab9e44", i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i2);

  }

  @Test
  public void test343() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test343"); }


    int i2 = java.lang.Integer.divideUnsigned(115686912, (-1240255356));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);

  }

  @Test
  public void test344() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test344"); }


    tp2.IP iP4 = new tp2.IP((java.lang.Integer)117440667, (java.lang.Integer)94, (java.lang.Integer)44004000, (java.lang.Integer)1694498816);
    java.lang.Integer i5 = iP4.getThird();
    iP4.setThird((java.lang.Integer)23421);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i5 + "' != '" + 44004000+ "'", i5.equals(44004000));

  }

  @Test
  public void test345() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test345"); }


    // The following exception was thrown during execution in test generation
    try {
      java.lang.Integer i2 = java.lang.Integer.valueOf("1015192864", 524288);
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test346() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test346"); }


    int i1 = java.lang.Integer.numberOfTrailingZeros(1358954496);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 24);

  }

  @Test
  public void test347() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test347"); }


    int i1 = java.lang.Integer.reverse(1694498816);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 166);

  }

  @Test
  public void test348() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test348"); }


    int i2 = java.lang.Integer.min(93754428, 13400000);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 13400000);

  }

  @Test
  public void test349() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test349"); }


    java.lang.String str2 = java.lang.Integer.toUnsignedString((-2113929216), 11100000);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "2181038080"+ "'", str2.equals("2181038080"));

  }

  @Test
  public void test350() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test350"); }


    java.lang.Integer i1 = new java.lang.Integer(637534296);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 637534296+ "'", i1.equals(637534296));

  }

  @Test
  public void test351() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test351"); }


    tp2.IP iP4 = new tp2.IP((java.lang.Integer)1020788736, (java.lang.Integer)6800412, (java.lang.Integer)11710, (java.lang.Integer)623247520);

  }

  @Test
  public void test352() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test352"); }


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
    java.lang.Long long23 = iPBan22.getExpires();
    tp2.IP iP24 = iPBan22.ip;
    iP24.setThird((java.lang.Integer)1155792896);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i18 + "' != '" + 100+ "'", i18.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long23 + "' != '" + 5L+ "'", long23.equals(5L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP24);

  }

  @Test
  public void test353() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test353"); }


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
    tp2.IPBan iPBan88 = strictlySortedSinglyLinkedList0.get((-671088640));
    int i89 = strictlySortedSinglyLinkedList0.getSize();
    tp2.IPBan iPBan91 = strictlySortedSinglyLinkedList0.get(3276800);
    tp2.IPBan iPBan93 = strictlySortedSinglyLinkedList0.get(601526722);
    boolean b94 = strictlySortedSinglyLinkedList0.repOK();
    tp2.Node node95 = strictlySortedSinglyLinkedList0.header;
    
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
    org.junit.Assert.assertNotNull(iPBan88);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i89 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iPBan91);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iPBan93);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b94 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node95);

  }

  @Test
  public void test354() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test354"); }


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
    iPBan61.expires = 4195041L;
    tp2.IP iP64 = iPBan61.ip;
    iPBan61.expires = 224L;
    
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
    org.junit.Assert.assertNotNull(iP64);

  }

  @Test
  public void test355() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test355"); }


    int i2 = java.lang.Integer.sum(500001065, 28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 500001093);

  }

  @Test
  public void test356() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test356"); }


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
    tp2.IP iP49 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i50 = iP49.getSecond();
    iP49.setFirst((java.lang.Integer)11001000);
    java.lang.Long long53 = null;
    tp2.IPBan iPBan54 = new tp2.IPBan(iP49, long53);
    tp2.IP iP55 = iPBan54.ip;
    tp2.IP iP56 = iPBan54.ip;
    tp2.IPBan iPBan58 = new tp2.IPBan(iP56, (java.lang.Long)10L);
    tp2.IP iP59 = iPBan58.ip;
    boolean b60 = strictlySortedSinglyLinkedList0.contains(iPBan58);
    iPBan58.expires = 4195041L;
    java.lang.Long long63 = iPBan58.getExpires();
    
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
    org.junit.Assert.assertTrue("'" + i50 + "' != '" + (-1)+ "'", i50.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP55);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP59);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b60 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long63 + "' != '" + 4195041L+ "'", long63.equals(4195041L));

  }

  @Test
  public void test357() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test357"); }


    // The following exception was thrown during execution in test generation
    try {
      int i2 = java.lang.Integer.parseUnsignedInt("1010000000000000000000000", 640950304);
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test358() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test358"); }


    long long1 = java.lang.Integer.toUnsignedLong(1694498816);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == 1694498816L);

  }

  @Test
  public void test359() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test359"); }


    tp2.SinglyLinkedList singlyLinkedList0 = new tp2.SinglyLinkedList();
    boolean b1 = singlyLinkedList0.repOK();
    tp2.IP iP3 = singlyLinkedList0.get(200);
    boolean b4 = singlyLinkedList0.isEmpty();
    boolean b5 = singlyLinkedList0.repOK();
    boolean b6 = singlyLinkedList0.repOK();
    tp2.IP iP11 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i12 = iP11.getThird();
    singlyLinkedList0.add(iP11);
    boolean b14 = singlyLinkedList0.repOK();
    boolean b15 = singlyLinkedList0.isEmpty();
    int i16 = singlyLinkedList0.getSize();
    
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
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 1);

  }

  @Test
  public void test360() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test360"); }


    int i2 = java.lang.Integer.min((-805306168), (-224923493));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == (-805306168));

  }

  @Test
  public void test361() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test361"); }


    int i2 = java.lang.Integer.compare(1101, 372963);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == (-1));

  }

  @Test
  public void test362() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test362"); }


    java.lang.String str1 = java.lang.Integer.toUnsignedString(524288);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "524288"+ "'", str1.equals("524288"));

  }

  @Test
  public void test363() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test363"); }


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
    tp2.SinglyLinkedList singlyLinkedList64 = new tp2.SinglyLinkedList();
    boolean b65 = singlyLinkedList64.repOK();
    tp2.IP iP70 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP70.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan74 = new tp2.IPBan(iP70, (java.lang.Long)100L);
    tp2.IP iP79 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP79.setFirst((java.lang.Integer)200);
    java.lang.Integer i82 = iP79.getFourth();
    iPBan74.setIp(iP79);
    singlyLinkedList64.add(iP79);
    tp2.IPBan iPBan86 = new tp2.IPBan(iP79, (java.lang.Long)5L);
    boolean b87 = singlyLinkedList0.contains(iP79);
    java.lang.Integer i88 = iP79.getFirst();
    java.lang.Integer i89 = iP79.getThird();
    tp2.IPBan iPBan91 = new tp2.IPBan(iP79, (java.lang.Long)2127069032L);
    
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
    org.junit.Assert.assertTrue(b65 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i82 + "' != '" + 100+ "'", i82.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b87 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i88 + "' != '" + 200+ "'", i88.equals(200));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i89 + "' != '" + (-1)+ "'", i89.equals((-1)));

  }

  @Test
  public void test364() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test364"); }


    int i1 = java.lang.Integer.reverseBytes((-1135833976));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == (-2004071236));

  }

  @Test
  public void test365() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test365"); }


    java.lang.String str1 = java.lang.Integer.toBinaryString(12648201);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "110000001111111100001001"+ "'", str1.equals("110000001111111100001001"));

  }

  @Test
  public void test366() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test366"); }


    tp2.SinglyLinkedList singlyLinkedList0 = new tp2.SinglyLinkedList();
    int i1 = singlyLinkedList0.getSize();
    int i2 = singlyLinkedList0.getSize();
    tp2.IP iP3 = null;
    boolean b4 = singlyLinkedList0.contains(iP3);
    tp2.IP iP6 = singlyLinkedList0.get(92);
    tp2.SinglyLinkedList singlyLinkedList7 = new tp2.SinglyLinkedList();
    boolean b8 = singlyLinkedList7.repOK();
    tp2.IP iP13 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP13.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan17 = new tp2.IPBan(iP13, (java.lang.Long)100L);
    tp2.IP iP22 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP22.setFirst((java.lang.Integer)200);
    java.lang.Integer i25 = iP22.getFourth();
    iPBan17.setIp(iP22);
    singlyLinkedList7.add(iP22);
    tp2.IP iP32 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP32.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan36 = new tp2.IPBan(iP32, (java.lang.Long)100L);
    tp2.IP iP41 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iPBan36.setIp(iP41);
    singlyLinkedList7.add(iP41);
    singlyLinkedList0.add(iP41);
    iP41.setFirst((java.lang.Integer)356246784);
    iP41.setFourth((java.lang.Integer)3145730);
    
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
    org.junit.Assert.assertTrue("'" + i25 + "' != '" + 100+ "'", i25.equals(100));

  }

  @Test
  public void test367() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test367"); }


    java.lang.Integer i2 = java.lang.Integer.getInteger("110000001", (java.lang.Integer)755424925);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i2 + "' != '" + 755424925+ "'", i2.equals(755424925));

  }

  @Test
  public void test368() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test368"); }


    java.lang.String str2 = java.lang.Integer.toUnsignedString(187783298, 10634);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "187783298"+ "'", str2.equals("187783298"));

  }

  @Test
  public void test369() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test369"); }


    tp2.IP iP4 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP4.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan8 = new tp2.IPBan(iP4, (java.lang.Long)100L);
    tp2.IP iP13 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP13.setFirst((java.lang.Integer)200);
    java.lang.Integer i16 = iP13.getFourth();
    iPBan8.setIp(iP13);
    java.lang.Long long18 = iPBan8.expires;
    tp2.IP iP19 = iPBan8.getIp();
    tp2.IP iP20 = iPBan8.ip;
    java.lang.Integer i21 = iP20.getThird();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i16 + "' != '" + 100+ "'", i16.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long18 + "' != '" + 100L+ "'", long18.equals(100L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i21 + "' != '" + (-1)+ "'", i21.equals((-1)));

  }

  @Test
  public void test370() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test370"); }


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
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList37 = new tp2.StrictlySortedSinglyLinkedList();
    int i38 = strictlySortedSinglyLinkedList37.size;
    tp2.IP iP43 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP43.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan47 = new tp2.IPBan(iP43, (java.lang.Long)100L);
    tp2.IP iP48 = iPBan47.ip;
    tp2.IP iP53 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i54 = iP53.getFourth();
    java.lang.Integer i55 = iP53.getFourth();
    iP53.setThird((java.lang.Integer)200);
    iPBan47.ip = iP53;
    boolean b59 = strictlySortedSinglyLinkedList37.add(iPBan47);
    boolean b60 = strictlySortedSinglyLinkedList13.contains(iPBan47);
    tp2.SinglyLinkedList singlyLinkedList61 = new tp2.SinglyLinkedList();
    int i62 = singlyLinkedList61.getSize();
    boolean b63 = singlyLinkedList61.isEmpty();
    tp2.IP iP68 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP68.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan72 = new tp2.IPBan(iP68, (java.lang.Long)100L);
    tp2.IP iP73 = iPBan72.ip;
    iP73.setThird((java.lang.Integer)356246784);
    boolean b76 = singlyLinkedList61.remove(iP73);
    iPBan47.setIp(iP73);
    java.lang.Integer i78 = iP73.getSecond();
    java.lang.Integer i79 = iP73.getFourth();
    tp2.IPBan iPBan81 = new tp2.IPBan(iP73, (java.lang.Long)2150170718L);
    tp2.IPBan iPBan83 = new tp2.IPBan(iP73, (java.lang.Long)24300001L);
    
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
    org.junit.Assert.assertTrue(i38 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i54 + "' != '" + 100+ "'", i54.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i55 + "' != '" + 100+ "'", i55.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b59 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b60 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i62 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b63 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP73);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b76 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i78 + "' != '" + (-1)+ "'", i78.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i79 + "' != '" + 100+ "'", i79.equals(100));

  }

  @Test
  public void test371() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test371"); }


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
    tp2.IP iP36 = iPBan33.ip;
    tp2.IP iP41 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP41.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan45 = new tp2.IPBan(iP41, (java.lang.Long)100L);
    tp2.IP iP46 = iPBan45.ip;
    tp2.IP iP51 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP51.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan55 = new tp2.IPBan(iP51, (java.lang.Long)100L);
    iPBan45.setIp(iP51);
    tp2.IP iP61 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP61.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan65 = new tp2.IPBan(iP61, (java.lang.Long)100L);
    java.lang.Integer i66 = iP61.getFirst();
    java.lang.Integer i67 = iP61.getFourth();
    iPBan45.setIp(iP61);
    tp2.IP iP73 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP73.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan77 = new tp2.IPBan(iP73, (java.lang.Long)100L);
    tp2.IP iP82 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP82.setFirst((java.lang.Integer)200);
    java.lang.Integer i85 = iP82.getFourth();
    iPBan77.setIp(iP82);
    java.lang.Long long87 = iPBan77.expires;
    iPBan77.expires = (-1L);
    java.lang.Long long90 = iPBan77.expires;
    boolean b91 = iP61.equals((java.lang.Object)iPBan77);
    java.lang.Integer i92 = iP61.getFourth();
    iPBan33.ip = iP61;
    java.lang.Long long94 = null;
    tp2.IPBan iPBan95 = new tp2.IPBan(iP61, long94);
    
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
    org.junit.Assert.assertNotNull(iP36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i66 + "' != '" + 200+ "'", i66.equals(200));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i67 + "' != '" + 100+ "'", i67.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i85 + "' != '" + 100+ "'", i85.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long87 + "' != '" + 100L+ "'", long87.equals(100L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long90 + "' != '" + (-1L)+ "'", long90.equals((-1L)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b91 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i92 + "' != '" + 100+ "'", i92.equals(100));

  }

  @Test
  public void test372() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test372"); }


    int i1 = java.lang.Integer.highestOneBit(805307104);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 536870912);

  }

  @Test
  public void test373() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test373"); }


    int i1 = java.lang.Integer.signum((-2146859648));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == (-1));

  }

  @Test
  public void test374() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test374"); }


    java.lang.Integer i2 = java.lang.Integer.getInteger("2b106c0", (java.lang.Integer)234200);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i2 + "' != '" + 234200+ "'", i2.equals(234200));

  }

  @Test
  public void test375() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test375"); }


    int i2 = java.lang.Integer.divideUnsigned(103258851, 2101349411);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);

  }

  @Test
  public void test376() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test376"); }


    java.lang.Integer i2 = java.lang.Integer.getInteger("40004017", 476208083);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i2 + "' != '" + 476208083+ "'", i2.equals(476208083));

  }

  @Test
  public void test377() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test377"); }


    int i1 = java.lang.Integer.signum((-1348993024));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == (-1));

  }

  @Test
  public void test378() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test378"); }


    int i1 = java.lang.Integer.reverseBytes(16692873);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == (-1984496128));

  }

  @Test
  public void test379() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test379"); }


    java.lang.Integer i1 = java.lang.Integer.getInteger("2383023160");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);

  }

  @Test
  public void test380() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test380"); }


    // The following exception was thrown during execution in test generation
    try {
      java.lang.Integer i1 = java.lang.Integer.decode("11011010101111000001010100000011");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test381() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test381"); }


    int i1 = java.lang.Integer.lowestOneBit(4246571);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 1);

  }

  @Test
  public void test382() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test382"); }


    int i2 = java.lang.Integer.rotateRight((-1073741790), 805306369);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1610612753);

  }

  @Test
  public void test383() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test383"); }


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
    int i47 = strictlySortedSinglyLinkedList0.getSize();
    int i48 = strictlySortedSinglyLinkedList0.getSize();
    tp2.IPBan iPBan50 = strictlySortedSinglyLinkedList0.get(32768);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList51 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b52 = strictlySortedSinglyLinkedList51.repOK();
    tp2.IP iP57 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    boolean b58 = strictlySortedSinglyLinkedList51.containsIP(iP57);
    tp2.Node node59 = strictlySortedSinglyLinkedList51.header;
    boolean b60 = strictlySortedSinglyLinkedList51.isEmpty();
    int i61 = strictlySortedSinglyLinkedList51.getSize();
    int i62 = strictlySortedSinglyLinkedList51.size;
    boolean b63 = strictlySortedSinglyLinkedList51.isEmpty();
    tp2.IP iP68 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i69 = iP68.getSecond();
    java.lang.Integer i70 = iP68.getFourth();
    iP68.setFirst((java.lang.Integer)5);
    tp2.IPBan iPBan74 = new tp2.IPBan(iP68, (java.lang.Long)0L);
    iPBan74.expires = 167772160L;
    boolean b77 = strictlySortedSinglyLinkedList51.add(iPBan74);
    tp2.IP iP78 = iPBan74.getIp();
    boolean b79 = strictlySortedSinglyLinkedList0.add(iPBan74);
    java.lang.Long long80 = iPBan74.expires;
    
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
    org.junit.Assert.assertTrue(i47 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i48 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iPBan50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b52 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b58 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node59);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b60 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i61 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i62 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b63 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i69 + "' != '" + (-1)+ "'", i69.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i70 + "' != '" + 100+ "'", i70.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b77 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP78);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b79 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long80 + "' != '" + 167772160L+ "'", long80.equals(167772160L));

  }

  @Test
  public void test384() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test384"); }


    tp2.IP iP4 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    tp2.IPBan iPBan6 = new tp2.IPBan(iP4, (java.lang.Long)469762048L);
    iPBan6.expires = 32987L;
    tp2.IP iP9 = iPBan6.getIp();
    java.lang.Long long10 = iPBan6.getExpires();
    tp2.IP iP11 = iPBan6.ip;
    tp2.SinglyLinkedList singlyLinkedList12 = new tp2.SinglyLinkedList();
    int i13 = singlyLinkedList12.getSize();
    tp2.IP iP18 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i19 = iP18.getSecond();
    java.lang.Integer i20 = iP18.getFourth();
    singlyLinkedList12.add(iP18);
    boolean b23 = iP18.equals((java.lang.Object)2147483647);
    tp2.IPBan iPBan25 = new tp2.IPBan(iP18, (java.lang.Long)(-1L));
    java.lang.Long long26 = iPBan25.expires;
    tp2.IP iP31 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP31.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan35 = new tp2.IPBan(iP31, (java.lang.Long)100L);
    tp2.IP iP36 = iPBan35.ip;
    iP36.setThird((java.lang.Integer)356246784);
    iPBan25.ip = iP36;
    java.lang.Integer i40 = iP36.getFirst();
    iP36.setFirst((java.lang.Integer)24);
    iPBan6.setIp(iP36);
    java.lang.Long long44 = null;
    tp2.IPBan iPBan45 = new tp2.IPBan(iP36, long44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long10 + "' != '" + 32987L+ "'", long10.equals(32987L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i19 + "' != '" + (-1)+ "'", i19.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i20 + "' != '" + 100+ "'", i20.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long26 + "' != '" + (-1L)+ "'", long26.equals((-1L)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i40 + "' != '" + 200+ "'", i40.equals(200));

  }

  @Test
  public void test385() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test385"); }


    java.lang.String str2 = java.lang.Integer.toUnsignedString(6645, (-637534016));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "6645"+ "'", str2.equals("6645"));

  }

  @Test
  public void test386() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test386"); }


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
    tp2.IP iP48 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP48.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan52 = new tp2.IPBan(iP48, (java.lang.Long)100L);
    tp2.IP iP57 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i58 = iP57.getSecond();
    java.lang.Integer i59 = iP57.getFourth();
    iP57.setFirst((java.lang.Integer)5);
    iPBan52.ip = iP57;
    java.lang.Long long63 = iPBan52.getExpires();
    iPBan52.expires = 2147483648L;
    tp2.IP iP70 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP70.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan74 = new tp2.IPBan(iP70, (java.lang.Long)100L);
    tp2.IP iP75 = iPBan74.ip;
    tp2.SinglyLinkedList singlyLinkedList76 = new tp2.SinglyLinkedList();
    int i77 = singlyLinkedList76.getSize();
    tp2.IP iP82 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i83 = iP82.getSecond();
    java.lang.Integer i84 = iP82.getFourth();
    singlyLinkedList76.add(iP82);
    boolean b86 = iP75.equals((java.lang.Object)iP82);
    iPBan52.ip = iP82;
    java.lang.Long long88 = iPBan52.expires;
    tp2.IP iP89 = iPBan52.ip;
    boolean b90 = strictlySortedSinglyLinkedList0.contains(iPBan52);
    boolean b91 = strictlySortedSinglyLinkedList0.isEmpty();
    tp2.IPBan iPBan93 = strictlySortedSinglyLinkedList0.get(0);
    tp2.Node node94 = strictlySortedSinglyLinkedList0.header;
    int i95 = strictlySortedSinglyLinkedList0.size;
    tp2.IPBan iPBan96 = null;
    boolean b97 = strictlySortedSinglyLinkedList0.contains(iPBan96);
    
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
    org.junit.Assert.assertTrue("'" + i58 + "' != '" + (-1)+ "'", i58.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i59 + "' != '" + 100+ "'", i59.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long63 + "' != '" + 100L+ "'", long63.equals(100L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP75);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i77 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i83 + "' != '" + (-1)+ "'", i83.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i84 + "' != '" + 100+ "'", i84.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b86 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long88 + "' != '" + 2147483648L+ "'", long88.equals(2147483648L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP89);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b90 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b91 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iPBan93);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node94);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i95 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b97 == false);

  }

  @Test
  public void test387() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test387"); }


    java.lang.String str2 = java.lang.Integer.toUnsignedString(1758773427, 1078352608);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1758773427"+ "'", str2.equals("1758773427"));

  }

  @Test
  public void test388() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test388"); }


    int i2 = java.lang.Integer.max(327680000, 48812571);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 327680000);

  }

  @Test
  public void test389() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test389"); }


    java.lang.String str1 = java.lang.Integer.toUnsignedString(2710);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "2710"+ "'", str1.equals("2710"));

  }

  @Test
  public void test390() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test390"); }


    int i1 = java.lang.Integer.numberOfTrailingZeros(240904);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 3);

  }

  @Test
  public void test391() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test391"); }


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
    tp2.IP iP24 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i25 = iP24.getSecond();
    iP24.setFirst((java.lang.Integer)11001000);
    java.lang.Long long28 = null;
    tp2.IPBan iPBan29 = new tp2.IPBan(iP24, long28);
    java.lang.Long long30 = iPBan29.getExpires();
    boolean b31 = strictlySortedSinglyLinkedList3.contains(iPBan29);
    boolean b32 = strictlySortedSinglyLinkedList0.add(iPBan29);
    boolean b33 = strictlySortedSinglyLinkedList0.repOK();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList34 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b35 = strictlySortedSinglyLinkedList34.repOK();
    tp2.IP iP40 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i41 = iP40.getSecond();
    iP40.setFirst((java.lang.Integer)11001000);
    iP40.setFirst((java.lang.Integer)(-2147483648));
    boolean b46 = strictlySortedSinglyLinkedList34.removeFromIP(iP40);
    tp2.IP iP51 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP51.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan55 = new tp2.IPBan(iP51, (java.lang.Long)100L);
    tp2.IP iP56 = iPBan55.ip;
    tp2.IP iP61 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP61.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan65 = new tp2.IPBan(iP61, (java.lang.Long)100L);
    iPBan55.setIp(iP61);
    tp2.IP iP71 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP71.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan75 = new tp2.IPBan(iP71, (java.lang.Long)100L);
    java.lang.Integer i76 = iP71.getFirst();
    java.lang.Integer i77 = iP71.getFourth();
    iPBan55.setIp(iP71);
    boolean b79 = strictlySortedSinglyLinkedList34.add(iPBan55);
    tp2.IP iP80 = iPBan55.getIp();
    iP80.setThird((java.lang.Integer)175);
    iP80.setFirst((java.lang.Integer)33554432);
    java.lang.Long long85 = null;
    tp2.IPBan iPBan86 = new tp2.IPBan(iP80, long85);
    java.lang.Integer i87 = iP80.getSecond();
    boolean b88 = strictlySortedSinglyLinkedList0.containsIP(iP80);
    int i89 = strictlySortedSinglyLinkedList0.size;
    
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
    org.junit.Assert.assertTrue("'" + i25 + "' != '" + (-1)+ "'", i25.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(long30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i41 + "' != '" + (-1)+ "'", i41.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b46 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i76 + "' != '" + 200+ "'", i76.equals(200));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i77 + "' != '" + 100+ "'", i77.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b79 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP80);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i87 + "' != '" + (-1)+ "'", i87.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b88 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i89 == 1);

  }

  @Test
  public void test392() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test392"); }


    int i2 = java.lang.Integer.rotateRight(529528581, 1073741849);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == (-939818353));

  }

  @Test
  public void test393() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test393"); }


    java.lang.String str1 = java.lang.Integer.toHexString(3145742);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "30000e"+ "'", str1.equals("30000e"));

  }

  @Test
  public void test394() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test394"); }


    // The following exception was thrown during execution in test generation
    try {
      int i2 = java.lang.Integer.parseInt("4020000003", 1073769824);
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

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test395"); }


    // The following exception was thrown during execution in test generation
    try {
      java.lang.Integer i2 = java.lang.Integer.valueOf("36b02", 30009402);
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test396() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test396"); }


    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList0 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b1 = strictlySortedSinglyLinkedList0.repOK();
    tp2.IP iP6 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i7 = iP6.getSecond();
    iP6.setFirst((java.lang.Integer)11001000);
    iP6.setFirst((java.lang.Integer)(-2147483648));
    boolean b12 = strictlySortedSinglyLinkedList0.removeFromIP(iP6);
    tp2.IPBan iPBan14 = strictlySortedSinglyLinkedList0.get((-1));
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList15 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b16 = strictlySortedSinglyLinkedList15.repOK();
    tp2.IP iP21 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i22 = iP21.getSecond();
    iP21.setFirst((java.lang.Integer)11001000);
    iP21.setFirst((java.lang.Integer)(-2147483648));
    boolean b27 = strictlySortedSinglyLinkedList15.removeFromIP(iP21);
    boolean b28 = strictlySortedSinglyLinkedList0.removeFromIP(iP21);
    tp2.SinglyLinkedList singlyLinkedList29 = new tp2.SinglyLinkedList();
    int i30 = singlyLinkedList29.getSize();
    tp2.IP iP35 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i36 = iP35.getSecond();
    java.lang.Integer i37 = iP35.getFourth();
    singlyLinkedList29.add(iP35);
    tp2.IP iP40 = singlyLinkedList29.get(5);
    boolean b41 = singlyLinkedList29.repOK();
    tp2.IP iP43 = singlyLinkedList29.get(2013265920);
    tp2.SinglyLinkedList singlyLinkedList44 = new tp2.SinglyLinkedList();
    int i45 = singlyLinkedList44.getSize();
    tp2.IP iP50 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i51 = iP50.getSecond();
    java.lang.Integer i52 = iP50.getFourth();
    singlyLinkedList44.add(iP50);
    iP50.setFourth((java.lang.Integer)167772160);
    singlyLinkedList29.add(iP50);
    java.lang.Object obj57 = null;
    boolean b58 = iP50.equals(obj57);
    iP50.setSecond((java.lang.Integer)20);
    tp2.IPBan iPBan62 = new tp2.IPBan(iP50, (java.lang.Long)20L);
    java.lang.Integer i63 = iP50.getFirst();
    iP50.setSecond((java.lang.Integer)1325400064);
    boolean b66 = strictlySortedSinglyLinkedList0.removeFromIP(iP50);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList67 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IPBan iPBan68 = null;
    boolean b69 = strictlySortedSinglyLinkedList67.add(iPBan68);
    int i70 = strictlySortedSinglyLinkedList67.getSize();
    tp2.Node node71 = strictlySortedSinglyLinkedList67.header;
    int i72 = strictlySortedSinglyLinkedList67.getSize();
    tp2.Node node73 = strictlySortedSinglyLinkedList67.header;
    strictlySortedSinglyLinkedList0.header = node73;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i7 + "' != '" + (-1)+ "'", i7.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iPBan14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i22 + "' != '" + (-1)+ "'", i22.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i36 + "' != '" + (-1)+ "'", i36.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i37 + "' != '" + 100+ "'", i37.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i45 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i51 + "' != '" + (-1)+ "'", i51.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i52 + "' != '" + 100+ "'", i52.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b58 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i63 + "' != '" + (-1)+ "'", i63.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b66 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b69 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i70 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node71);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i72 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node73);

  }

  @Test
  public void test397() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test397"); }


    int i1 = java.lang.Integer.numberOfLeadingZeros((-157598786));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);

  }

  @Test
  public void test398() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test398"); }


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
    java.lang.Integer i39 = null;
    iP38.setFourth(i39);
    iP38.setThird((java.lang.Integer)52);
    iP38.setSecond((java.lang.Integer)298397696);
    
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

  }

  @Test
  public void test399() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test399"); }


    tp2.SinglyLinkedList singlyLinkedList0 = new tp2.SinglyLinkedList();
    int i1 = singlyLinkedList0.getSize();
    tp2.IP iP6 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i7 = iP6.getSecond();
    java.lang.Integer i8 = iP6.getFourth();
    singlyLinkedList0.add(iP6);
    tp2.IPBan iPBan11 = new tp2.IPBan(iP6, (java.lang.Long)100L);
    iPBan11.expires = 10L;
    tp2.IP iP14 = iPBan11.getIp();
    java.lang.Long long15 = iPBan11.expires;
    java.lang.Long long16 = iPBan11.expires;
    tp2.IP iP17 = iPBan11.ip;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i7 + "' != '" + (-1)+ "'", i7.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i8 + "' != '" + 100+ "'", i8.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long15 + "' != '" + 10L+ "'", long15.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long16 + "' != '" + 10L+ "'", long16.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP17);

  }

  @Test
  public void test400() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test400"); }


    int i2 = java.lang.Integer.rotateRight(570425344, 640);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 570425344);

  }

  @Test
  public void test401() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test401"); }


    int i1 = java.lang.Integer.parseUnsignedInt("130");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 130);

  }

  @Test
  public void test402() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test402"); }


    java.lang.String str1 = java.lang.Integer.toOctalString(436207616);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "3200000000"+ "'", str1.equals("3200000000"));

  }

  @Test
  public void test403() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test403"); }


    // The following exception was thrown during execution in test generation
    try {
      int i1 = java.lang.Integer.parseInt("14000000000");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test404() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test404"); }


    int i2 = java.lang.Integer.remainderUnsigned(514846515, (-1197255880));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 514846515);

  }

  @Test
  public void test405() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test405"); }


    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList0 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b1 = strictlySortedSinglyLinkedList0.repOK();
    strictlySortedSinglyLinkedList0.size = 1;
    boolean b4 = strictlySortedSinglyLinkedList0.isEmpty();
    int i5 = strictlySortedSinglyLinkedList0.getSize();
    boolean b6 = strictlySortedSinglyLinkedList0.isEmpty();
    int i7 = strictlySortedSinglyLinkedList0.getSize();
    int i8 = strictlySortedSinglyLinkedList0.getSize();
    tp2.IP iP13 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i14 = iP13.getSecond();
    iP13.setFirst((java.lang.Integer)11001000);
    java.lang.Long long17 = null;
    tp2.IPBan iPBan18 = new tp2.IPBan(iP13, long17);
    java.lang.Long long19 = iPBan18.getExpires();
    iPBan18.expires = 1L;
    tp2.IP iP26 = new tp2.IP((java.lang.Integer)67108864, (java.lang.Integer)(-2147483648), (java.lang.Integer)356246784, (java.lang.Integer)176016000);
    iPBan18.ip = iP26;
    iPBan18.setExpires((java.lang.Long)2147483648L);
    boolean b30 = strictlySortedSinglyLinkedList0.add(iPBan18);
    tp2.IP iP35 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i36 = iP35.getSecond();
    iP35.setFirst((java.lang.Integer)11001000);
    java.lang.Long long39 = null;
    tp2.IPBan iPBan40 = new tp2.IPBan(iP35, long39);
    java.lang.Long long41 = iPBan40.getExpires();
    tp2.SinglyLinkedList singlyLinkedList42 = new tp2.SinglyLinkedList();
    boolean b43 = singlyLinkedList42.repOK();
    tp2.IP iP48 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP48.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan52 = new tp2.IPBan(iP48, (java.lang.Long)100L);
    tp2.IP iP57 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP57.setFirst((java.lang.Integer)200);
    java.lang.Integer i60 = iP57.getFourth();
    iPBan52.setIp(iP57);
    singlyLinkedList42.add(iP57);
    iPBan40.setIp(iP57);
    iPBan40.setExpires((java.lang.Long)243269647L);
    tp2.IP iP66 = iPBan40.getIp();
    boolean b67 = strictlySortedSinglyLinkedList0.add(iPBan40);
    java.lang.Long long68 = iPBan40.getExpires();
    
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
    org.junit.Assert.assertTrue(i8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i14 + "' != '" + (-1)+ "'", i14.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(long19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i36 + "' != '" + (-1)+ "'", i36.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(long41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b43 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i60 + "' != '" + 100+ "'", i60.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP66);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b67 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long68 + "' != '" + 243269647L+ "'", long68.equals(243269647L));

  }

  @Test
  public void test406() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test406"); }


    java.lang.String str2 = java.lang.Integer.toUnsignedString(3601, (-226637295));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "3601"+ "'", str2.equals("3601"));

  }

  @Test
  public void test407() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test407"); }


    java.lang.Integer i2 = java.lang.Integer.getInteger("11000000000000000000000000000111", (java.lang.Integer)54378824);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i2 + "' != '" + 54378824+ "'", i2.equals(54378824));

  }

  @Test
  public void test408() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test408"); }


    tp2.IP iP4 = new tp2.IP((java.lang.Integer)27962026, (java.lang.Integer)207025415, (java.lang.Integer)1073741869, (java.lang.Integer)65560);
    java.lang.Integer i5 = iP4.getThird();
    iP4.setFourth((java.lang.Integer)5244665);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i5 + "' != '" + 1073741869+ "'", i5.equals(1073741869));

  }

  @Test
  public void test409() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test409"); }


    int i2 = java.lang.Integer.divideUnsigned(298951390, (-2147480697));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);

  }

  @Test
  public void test410() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test410"); }


    int i1 = java.lang.Integer.highestOneBit(257);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 256);

  }

  @Test
  public void test411() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test411"); }


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
    boolean b40 = strictlySortedSinglyLinkedList0.isEmpty();
    int i41 = strictlySortedSinglyLinkedList0.size;
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList42 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b43 = strictlySortedSinglyLinkedList42.repOK();
    tp2.IP iP48 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    boolean b49 = strictlySortedSinglyLinkedList42.containsIP(iP48);
    int i50 = strictlySortedSinglyLinkedList42.getSize();
    tp2.SinglyLinkedList singlyLinkedList51 = new tp2.SinglyLinkedList();
    int i52 = singlyLinkedList51.getSize();
    tp2.IP iP57 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i58 = iP57.getSecond();
    java.lang.Integer i59 = iP57.getFourth();
    singlyLinkedList51.add(iP57);
    tp2.IPBan iPBan62 = new tp2.IPBan(iP57, (java.lang.Long)100L);
    iPBan62.expires = 10L;
    tp2.IP iP65 = iPBan62.getIp();
    iPBan62.expires = 0L;
    java.lang.Long long68 = iPBan62.expires;
    boolean b69 = strictlySortedSinglyLinkedList42.add(iPBan62);
    boolean b70 = strictlySortedSinglyLinkedList42.isEmpty();
    tp2.IPBan iPBan72 = strictlySortedSinglyLinkedList42.get((-2120392704));
    tp2.Node node73 = strictlySortedSinglyLinkedList42.header;
    strictlySortedSinglyLinkedList0.header = node73;
    
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
    org.junit.Assert.assertTrue(b40 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i41 == (-671088640));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b43 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b49 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i50 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i52 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i58 + "' != '" + (-1)+ "'", i58.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i59 + "' != '" + 100+ "'", i59.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP65);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long68 + "' != '" + 0L+ "'", long68.equals(0L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b69 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b70 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iPBan72);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node73);

  }

  @Test
  public void test412() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test412"); }


    java.lang.String str2 = java.lang.Integer.toUnsignedString(113, 786382848);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "113"+ "'", str2.equals("113"));

  }

  @Test
  public void test413() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test413"); }


    long long1 = java.lang.Integer.toUnsignedLong((-2147471761));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == 2147495535L);

  }

  @Test
  public void test414() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test414"); }


    int i2 = java.lang.Integer.compare(5888, 270);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);

  }

  @Test
  public void test415() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test415"); }


    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList0 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b1 = strictlySortedSinglyLinkedList0.repOK();
    tp2.IP iP6 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    boolean b7 = strictlySortedSinglyLinkedList0.containsIP(iP6);
    tp2.Node node8 = strictlySortedSinglyLinkedList0.header;
    boolean b9 = strictlySortedSinglyLinkedList0.isEmpty();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList10 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b11 = strictlySortedSinglyLinkedList10.repOK();
    strictlySortedSinglyLinkedList10.size = 1;
    strictlySortedSinglyLinkedList10.size = 0;
    tp2.IP iP20 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i21 = iP20.getSecond();
    java.lang.Integer i22 = iP20.getFourth();
    boolean b23 = strictlySortedSinglyLinkedList10.containsIP(iP20);
    tp2.Node node24 = strictlySortedSinglyLinkedList10.header;
    strictlySortedSinglyLinkedList0.header = node24;
    int i26 = strictlySortedSinglyLinkedList0.getSize();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList27 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b28 = strictlySortedSinglyLinkedList27.repOK();
    strictlySortedSinglyLinkedList27.size = 1;
    strictlySortedSinglyLinkedList27.size = 0;
    tp2.IP iP37 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP37.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan41 = new tp2.IPBan(iP37, (java.lang.Long)100L);
    tp2.IP iP42 = iPBan41.ip;
    boolean b43 = strictlySortedSinglyLinkedList27.contains(iPBan41);
    boolean b44 = strictlySortedSinglyLinkedList27.repOK();
    tp2.SinglyLinkedList singlyLinkedList45 = new tp2.SinglyLinkedList();
    int i46 = singlyLinkedList45.getSize();
    tp2.IP iP51 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i52 = iP51.getSecond();
    java.lang.Integer i53 = iP51.getFourth();
    singlyLinkedList45.add(iP51);
    boolean b56 = iP51.equals((java.lang.Object)2147483647);
    tp2.IPBan iPBan58 = new tp2.IPBan(iP51, (java.lang.Long)(-1L));
    boolean b59 = strictlySortedSinglyLinkedList27.add(iPBan58);
    tp2.Node node60 = strictlySortedSinglyLinkedList27.header;
    tp2.IP iP65 = new tp2.IP((java.lang.Integer)356246787, (java.lang.Integer)8, (java.lang.Integer)175, (java.lang.Integer)13);
    boolean b66 = strictlySortedSinglyLinkedList27.containsIP(iP65);
    tp2.Node node67 = strictlySortedSinglyLinkedList27.header;
    strictlySortedSinglyLinkedList0.header = node67;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i21 + "' != '" + (-1)+ "'", i21.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i22 + "' != '" + 100+ "'", i22.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b43 == false);
    
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
    org.junit.Assert.assertTrue(b59 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node60);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b66 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node67);

  }

  @Test
  public void test416() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test416"); }


    tp2.IP iP4 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP4.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan8 = new tp2.IPBan(iP4, (java.lang.Long)100L);
    tp2.IP iP13 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP13.setFirst((java.lang.Integer)200);
    java.lang.Integer i16 = iP13.getFourth();
    iPBan8.setIp(iP13);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList18 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b19 = strictlySortedSinglyLinkedList18.repOK();
    strictlySortedSinglyLinkedList18.size = 1;
    boolean b22 = strictlySortedSinglyLinkedList18.isEmpty();
    tp2.SinglyLinkedList singlyLinkedList23 = new tp2.SinglyLinkedList();
    int i24 = singlyLinkedList23.getSize();
    tp2.IP iP29 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i30 = iP29.getSecond();
    java.lang.Integer i31 = iP29.getFourth();
    singlyLinkedList23.add(iP29);
    boolean b34 = iP29.equals((java.lang.Object)2147483647);
    tp2.IPBan iPBan36 = new tp2.IPBan(iP29, (java.lang.Long)(-1L));
    java.lang.Long long37 = iPBan36.expires;
    boolean b38 = strictlySortedSinglyLinkedList18.contains(iPBan36);
    tp2.IP iP39 = iPBan36.ip;
    java.lang.Integer i40 = iP39.getSecond();
    iPBan8.setIp(iP39);
    java.lang.Long long42 = iPBan8.expires;
    iPBan8.expires = 3276800L;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i16 + "' != '" + 100+ "'", i16.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i30 + "' != '" + (-1)+ "'", i30.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i31 + "' != '" + 100+ "'", i31.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long37 + "' != '" + (-1L)+ "'", long37.equals((-1L)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i40 + "' != '" + (-1)+ "'", i40.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long42 + "' != '" + 100L+ "'", long42.equals(100L));

  }

  @Test
  public void test417() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test417"); }


    int i2 = java.lang.Integer.compare(1610612753, (-469696512));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);

  }

  @Test
  public void test418() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test418"); }


    int i2 = java.lang.Integer.rotateLeft(162, 1577058304);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 162);

  }

  @Test
  public void test419() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test419"); }


    int i2 = java.lang.Integer.sum(500000000, (-213546269));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 286453731);

  }

  @Test
  public void test420() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test420"); }


    int i1 = java.lang.Integer.numberOfLeadingZeros(8396502);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 8);

  }

  @Test
  public void test421() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test421"); }


    tp2.IP iP4 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i5 = iP4.getSecond();
    iP4.setFirst((java.lang.Integer)11001000);
    iP4.setFirst((java.lang.Integer)32);
    java.lang.Integer i10 = iP4.getFirst();
    iP4.setSecond((java.lang.Integer)40);
    tp2.IPBan iPBan14 = new tp2.IPBan(iP4, (java.lang.Long)6047546L);
    java.lang.Integer i15 = iP4.getFirst();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i5 + "' != '" + (-1)+ "'", i5.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i10 + "' != '" + 32+ "'", i10.equals(32));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i15 + "' != '" + 32+ "'", i15.equals(32));

  }

  @Test
  public void test422() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test422"); }


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
    tp2.IP iP36 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i37 = iP36.getSecond();
    java.lang.Integer i38 = iP36.getFourth();
    singlyLinkedList30.add(iP36);
    tp2.IP iP41 = singlyLinkedList30.get(5);
    boolean b42 = singlyLinkedList30.repOK();
    tp2.IP iP44 = singlyLinkedList30.get(2013265920);
    tp2.SinglyLinkedList singlyLinkedList45 = new tp2.SinglyLinkedList();
    int i46 = singlyLinkedList45.getSize();
    tp2.IP iP51 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i52 = iP51.getSecond();
    java.lang.Integer i53 = iP51.getFourth();
    singlyLinkedList45.add(iP51);
    iP51.setFourth((java.lang.Integer)167772160);
    singlyLinkedList30.add(iP51);
    java.lang.Object obj58 = null;
    boolean b59 = iP51.equals(obj58);
    iP51.setSecond((java.lang.Integer)20);
    tp2.IPBan iPBan63 = new tp2.IPBan(iP51, (java.lang.Long)20L);
    java.lang.Integer i64 = iP51.getFirst();
    java.lang.Integer i65 = iP51.getSecond();
    iP51.setFourth((java.lang.Integer)2);
    tp2.IPBan iPBan69 = new tp2.IPBan(iP51, (java.lang.Long)2147483648L);
    tp2.IP iP70 = iPBan69.getIp();
    singlyLinkedList0.add(iP70);
    
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
    org.junit.Assert.assertTrue("'" + i37 + "' != '" + (-1)+ "'", i37.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i38 + "' != '" + 100+ "'", i38.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i46 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i52 + "' != '" + (-1)+ "'", i52.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i53 + "' != '" + 100+ "'", i53.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b59 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i64 + "' != '" + (-1)+ "'", i64.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i65 + "' != '" + 20+ "'", i65.equals(20));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP70);

  }

  @Test
  public void test423() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test423"); }


    // The following exception was thrown during execution in test generation
    try {
      java.lang.Integer i1 = java.lang.Integer.decode("e0000003");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test424() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test424"); }


    java.lang.Integer i1 = java.lang.Integer.getInteger("556872282");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);

  }

  @Test
  public void test425() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test425"); }


    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList0 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b1 = strictlySortedSinglyLinkedList0.repOK();
    boolean b2 = strictlySortedSinglyLinkedList0.repOK();
    int i3 = strictlySortedSinglyLinkedList0.getSize();
    tp2.Node node4 = strictlySortedSinglyLinkedList0.header;
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList5 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b6 = strictlySortedSinglyLinkedList5.isEmpty();
    tp2.IP iP11 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP11.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan15 = new tp2.IPBan(iP11, (java.lang.Long)100L);
    tp2.IP iP16 = iPBan15.ip;
    tp2.IP iP21 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP21.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan25 = new tp2.IPBan(iP21, (java.lang.Long)100L);
    iPBan15.setIp(iP21);
    tp2.IP iP31 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP31.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan35 = new tp2.IPBan(iP31, (java.lang.Long)100L);
    java.lang.Integer i36 = iP31.getFirst();
    java.lang.Integer i37 = iP31.getFourth();
    iPBan15.setIp(iP31);
    tp2.IP iP39 = iPBan15.getIp();
    tp2.IP iP40 = iPBan15.getIp();
    iPBan15.setExpires((java.lang.Long)1L);
    boolean b43 = strictlySortedSinglyLinkedList5.contains(iPBan15);
    boolean b44 = strictlySortedSinglyLinkedList0.contains(iPBan15);
    tp2.IP iP45 = iPBan15.getIp();
    tp2.IP iP46 = iPBan15.ip;
    tp2.IP iP47 = iPBan15.getIp();
    tp2.SinglyLinkedList singlyLinkedList48 = new tp2.SinglyLinkedList();
    boolean b49 = singlyLinkedList48.repOK();
    tp2.IP iP51 = singlyLinkedList48.get(200);
    boolean b52 = singlyLinkedList48.isEmpty();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList53 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b54 = strictlySortedSinglyLinkedList53.repOK();
    tp2.IP iP59 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i60 = iP59.getSecond();
    iP59.setFirst((java.lang.Integer)11001000);
    iP59.setFirst((java.lang.Integer)(-2147483648));
    boolean b65 = strictlySortedSinglyLinkedList53.removeFromIP(iP59);
    boolean b66 = singlyLinkedList48.remove(iP59);
    iP59.setSecond((java.lang.Integer)2146566144);
    iPBan15.setIp(iP59);
    iP59.setFourth((java.lang.Integer)53156);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i36 + "' != '" + 200+ "'", i36.equals(200));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i37 + "' != '" + 100+ "'", i37.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b43 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b49 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b52 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b54 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i60 + "' != '" + (-1)+ "'", i60.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b65 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b66 == false);

  }

  @Test
  public void test426() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test426"); }


    java.lang.Integer i2 = java.lang.Integer.getInteger("10101100010000011011000000", (java.lang.Integer)734806016);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i2 + "' != '" + 734806016+ "'", i2.equals(734806016));

  }

  @Test
  public void test427() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test427"); }


    int i2 = java.lang.Integer.min((-1734319108), 759218515);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == (-1734319108));

  }

  @Test
  public void test428() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test428"); }


    int i2 = java.lang.Integer.sum((-725895579), 660);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == (-725894919));

  }

  @Test
  public void test429() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test429"); }


    int i2 = java.lang.Integer.sum(718060453, 5087874);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 723148327);

  }

  @Test
  public void test430() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test430"); }


    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList0 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b1 = strictlySortedSinglyLinkedList0.repOK();
    strictlySortedSinglyLinkedList0.size = 1;
    strictlySortedSinglyLinkedList0.size = 0;
    tp2.IP iP10 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP10.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan14 = new tp2.IPBan(iP10, (java.lang.Long)100L);
    tp2.IP iP15 = iPBan14.ip;
    boolean b16 = strictlySortedSinglyLinkedList0.contains(iPBan14);
    iPBan14.setExpires((java.lang.Long)6047546L);
    tp2.IP iP19 = iPBan14.getIp();
    java.lang.Long long20 = iPBan14.getExpires();
    java.lang.Long long21 = iPBan14.expires;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long20 + "' != '" + 6047546L+ "'", long20.equals(6047546L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long21 + "' != '" + 6047546L+ "'", long21.equals(6047546L));

  }

  @Test
  public void test431() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test431"); }


    tp2.IP iP4 = new tp2.IP((java.lang.Integer)1000110000, (java.lang.Integer)396859008, (java.lang.Integer)3104, (java.lang.Integer)10880);

  }

  @Test
  public void test432() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test432"); }


    int i1 = java.lang.Integer.bitCount((-268391162));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 11);

  }

  @Test
  public void test433() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test433"); }


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
    iPBan8.expires = 20971520L;
    iPBan8.expires = 3355443200L;
    tp2.IP iP41 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i42 = iP41.getSecond();
    iP41.setFirst((java.lang.Integer)11001000);
    java.lang.Long long45 = null;
    tp2.IPBan iPBan46 = new tp2.IPBan(iP41, long45);
    tp2.IP iP47 = iPBan46.ip;
    tp2.IP iP48 = iPBan46.ip;
    java.lang.Integer i49 = iP48.getFourth();
    java.lang.Integer i50 = iP48.getThird();
    iPBan8.setIp(iP48);
    java.lang.Long long52 = iPBan8.getExpires();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i29 + "' != '" + 200+ "'", i29.equals(200));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i30 + "' != '" + 100+ "'", i30.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i42 + "' != '" + (-1)+ "'", i42.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i49 + "' != '" + 100+ "'", i49.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i50 + "' != '" + (-1)+ "'", i50.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long52 + "' != '" + 3355443200L+ "'", long52.equals(3355443200L));

  }

  @Test
  public void test434() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test434"); }


    int i1 = java.lang.Integer.numberOfTrailingZeros(42226651);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);

  }

  @Test
  public void test435() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test435"); }


    int i2 = java.lang.Integer.rotateLeft(10000, 84935131);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == (-2147483336));

  }

  @Test
  public void test436() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test436"); }


    int i2 = java.lang.Integer.min(1335907456, 640950304);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 640950304);

  }

  @Test
  public void test437() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test437"); }


    java.lang.String str1 = java.lang.Integer.toOctalString(630625361);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "4545512121"+ "'", str1.equals("4545512121"));

  }

  @Test
  public void test438() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test438"); }


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
    tp2.IP iP36 = iPBan33.ip;
    java.lang.Integer i37 = iP36.getFirst();
    iP36.setFourth((java.lang.Integer)(-1062740824));
    iP36.setSecond((java.lang.Integer)(-268391162));
    
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
    org.junit.Assert.assertNotNull(iP36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i37 + "' != '" + (-1)+ "'", i37.equals((-1)));

  }

  @Test
  public void test439() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test439"); }


    java.lang.Integer i1 = java.lang.Integer.getInteger("2663762403");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);

  }

  @Test
  public void test440() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test440"); }


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
    int i61 = strictlySortedSinglyLinkedList0.size;
    int i62 = strictlySortedSinglyLinkedList0.size;
    tp2.IP iP67 = new tp2.IP((java.lang.Integer)(-619332132), (java.lang.Integer)96, (java.lang.Integer)268435500, (java.lang.Integer)2147483647);
    boolean b68 = strictlySortedSinglyLinkedList0.containsIP(iP67);
    java.lang.Integer i69 = iP67.getSecond();
    
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
    org.junit.Assert.assertTrue(i61 == 2147483646);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i62 == 2147483646);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b68 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i69 + "' != '" + 96+ "'", i69.equals(96));

  }

  @Test
  public void test441() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test441"); }


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
    tp2.SinglyLinkedList singlyLinkedList49 = new tp2.SinglyLinkedList();
    int i50 = singlyLinkedList49.getSize();
    tp2.IP iP55 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i56 = iP55.getSecond();
    java.lang.Integer i57 = iP55.getFourth();
    singlyLinkedList49.add(iP55);
    boolean b59 = singlyLinkedList49.repOK();
    boolean b60 = singlyLinkedList49.repOK();
    int i61 = singlyLinkedList49.getSize();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList62 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b63 = strictlySortedSinglyLinkedList62.repOK();
    strictlySortedSinglyLinkedList62.size = 1;
    strictlySortedSinglyLinkedList62.size = 0;
    tp2.IP iP72 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i73 = iP72.getSecond();
    java.lang.Integer i74 = iP72.getFourth();
    boolean b75 = strictlySortedSinglyLinkedList62.containsIP(iP72);
    iP72.setFourth((java.lang.Integer)206848);
    java.lang.Integer i78 = iP72.getSecond();
    singlyLinkedList49.add(iP72);
    // The following exception was thrown during execution in test generation
    try {
      boolean b80 = strictlySortedSinglyLinkedList0.containsIP(iP72);
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
    org.junit.Assert.assertTrue(i50 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i56 + "' != '" + (-1)+ "'", i56.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i57 + "' != '" + 100+ "'", i57.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b59 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b60 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i61 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b63 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i73 + "' != '" + (-1)+ "'", i73.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i74 + "' != '" + 100+ "'", i74.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b75 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i78 + "' != '" + (-1)+ "'", i78.equals((-1)));

  }

  @Test
  public void test442() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test442"); }


    int i1 = java.lang.Integer.signum(1078432608);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 1);

  }

  @Test
  public void test443() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test443"); }


    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList0 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b1 = strictlySortedSinglyLinkedList0.repOK();
    strictlySortedSinglyLinkedList0.size = 1;
    strictlySortedSinglyLinkedList0.size = 0;
    tp2.IP iP10 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i11 = iP10.getSecond();
    java.lang.Integer i12 = iP10.getFourth();
    boolean b13 = strictlySortedSinglyLinkedList0.containsIP(iP10);
    tp2.Node node14 = strictlySortedSinglyLinkedList0.header;
    tp2.IP iP19 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i20 = iP19.getSecond();
    iP19.setFirst((java.lang.Integer)11001000);
    java.lang.Long long23 = null;
    tp2.IPBan iPBan24 = new tp2.IPBan(iP19, long23);
    boolean b25 = strictlySortedSinglyLinkedList0.containsIP(iP19);
    int i26 = strictlySortedSinglyLinkedList0.getSize();
    boolean b27 = strictlySortedSinglyLinkedList0.repOK();
    strictlySortedSinglyLinkedList0.size = 83886555;
    tp2.IP iP34 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP34.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan38 = new tp2.IPBan(iP34, (java.lang.Long)100L);
    tp2.IP iP43 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP43.setFirst((java.lang.Integer)200);
    java.lang.Integer i46 = iP43.getFourth();
    iPBan38.setIp(iP43);
    java.lang.Long long48 = iPBan38.expires;
    tp2.IP iP53 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i54 = iP53.getSecond();
    iP53.setFirst((java.lang.Integer)11001000);
    iP53.setFirst((java.lang.Integer)32);
    iPBan38.setIp(iP53);
    java.lang.Long long60 = iPBan38.getExpires();
    boolean b61 = strictlySortedSinglyLinkedList0.add(iPBan38);
    tp2.IP iP62 = null;
    boolean b63 = strictlySortedSinglyLinkedList0.removeFromIP(iP62);
    tp2.Node node64 = strictlySortedSinglyLinkedList0.header;
    tp2.Node node65 = strictlySortedSinglyLinkedList0.header;
    
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
    org.junit.Assert.assertTrue("'" + i20 + "' != '" + (-1)+ "'", i20.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i46 + "' != '" + 100+ "'", i46.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long48 + "' != '" + 100L+ "'", long48.equals(100L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i54 + "' != '" + (-1)+ "'", i54.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long60 + "' != '" + 100L+ "'", long60.equals(100L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b61 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b63 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node64);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node65);

  }

  @Test
  public void test444() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test444"); }


    // The following exception was thrown during execution in test generation
    try {
      int i2 = java.lang.Integer.parseUnsignedInt("24312063000", 37918);
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

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test445"); }


    // The following exception was thrown during execution in test generation
    try {
      int i2 = java.lang.Integer.parseInt("1001110011100000000000000000", 2041);
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test446() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test446"); }


    int i1 = java.lang.Integer.numberOfLeadingZeros(749199016);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 2);

  }

  @Test
  public void test447() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test447"); }


    tp2.IP iP4 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i5 = iP4.getSecond();
    iP4.setFirst((java.lang.Integer)11001000);
    java.lang.Long long8 = null;
    tp2.IPBan iPBan9 = new tp2.IPBan(iP4, long8);
    java.lang.Long long10 = iPBan9.getExpires();
    iPBan9.expires = 1L;
    tp2.IP iP13 = iPBan9.ip;
    tp2.IP iP18 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP18.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan22 = new tp2.IPBan(iP18, (java.lang.Long)100L);
    tp2.IP iP27 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i28 = iP27.getSecond();
    java.lang.Integer i29 = iP27.getFourth();
    iP27.setFirst((java.lang.Integer)5);
    iPBan22.ip = iP27;
    java.lang.Long long33 = iPBan22.getExpires();
    iPBan22.setExpires((java.lang.Long)(-1L));
    iPBan22.expires = 100L;
    tp2.IP iP38 = iPBan22.getIp();
    java.lang.Integer i39 = iP38.getFirst();
    java.lang.Integer i40 = iP38.getFourth();
    iPBan9.setIp(iP38);
    tp2.IP iP42 = iPBan9.ip;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i5 + "' != '" + (-1)+ "'", i5.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(long10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i28 + "' != '" + (-1)+ "'", i28.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i29 + "' != '" + 100+ "'", i29.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long33 + "' != '" + 100L+ "'", long33.equals(100L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i39 + "' != '" + 5+ "'", i39.equals(5));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i40 + "' != '" + 100+ "'", i40.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP42);

  }

  @Test
  public void test448() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test448"); }


    int i2 = java.lang.Integer.max((-2147483635), 65395583);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 65395583);

  }

  @Test
  public void test449() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test449"); }


    int i1 = java.lang.Integer.reverseBytes(19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 318767104);

  }

  @Test
  public void test450() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test450"); }


    long long1 = java.lang.Integer.toUnsignedLong((-1734966848));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == 2560000448L);

  }

  @Test
  public void test451() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test451"); }


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
    tp2.IP iP37 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i38 = iP37.getThird();
    boolean b40 = iP37.equals((java.lang.Object)' ');
    java.lang.Integer i41 = null;
    iP37.setFirst(i41);
    boolean b43 = strictlySortedSinglyLinkedList0.removeFromIP(iP37);
    iP37.setThird((java.lang.Integer)89061696);
    iP37.setSecond((java.lang.Integer)75809);
    iP37.setSecond((java.lang.Integer)312966304);
    
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
    org.junit.Assert.assertTrue("'" + i38 + "' != '" + (-1)+ "'", i38.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b43 == true);

  }

  @Test
  public void test452() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test452"); }


    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList0 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b1 = strictlySortedSinglyLinkedList0.repOK();
    strictlySortedSinglyLinkedList0.size = 1;
    boolean b4 = strictlySortedSinglyLinkedList0.isEmpty();
    tp2.IP iP9 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP9.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan13 = new tp2.IPBan(iP9, (java.lang.Long)100L);
    tp2.IP iP14 = iPBan13.ip;
    tp2.IP iP19 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP19.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan23 = new tp2.IPBan(iP19, (java.lang.Long)100L);
    iPBan13.setIp(iP19);
    tp2.IPBan iPBan26 = new tp2.IPBan(iP19, (java.lang.Long)(-1L));
    tp2.IP iP27 = iPBan26.ip;
    boolean b28 = strictlySortedSinglyLinkedList0.contains(iPBan26);
    tp2.IP iP29 = iPBan26.getIp();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP29);

  }

  @Test
  public void test453() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test453"); }


    // The following exception was thrown during execution in test generation
    try {
      int i2 = java.lang.Integer.parseInt("23540200140", 484);
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

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test454"); }


    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList0 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b1 = strictlySortedSinglyLinkedList0.repOK();
    strictlySortedSinglyLinkedList0.size = 1;
    strictlySortedSinglyLinkedList0.size = 0;
    tp2.IP iP10 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP10.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan14 = new tp2.IPBan(iP10, (java.lang.Long)100L);
    tp2.IP iP19 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP19.setFirst((java.lang.Integer)200);
    java.lang.Integer i22 = iP19.getFourth();
    iPBan14.setIp(iP19);
    boolean b24 = strictlySortedSinglyLinkedList0.contains(iPBan14);
    int i25 = strictlySortedSinglyLinkedList0.size;
    tp2.IP iP30 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP30.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan34 = new tp2.IPBan(iP30, (java.lang.Long)100L);
    tp2.IP iP35 = iPBan34.ip;
    tp2.IP iP36 = iPBan34.getIp();
    java.lang.Integer i37 = null;
    iP36.setFirst(i37);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList39 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b40 = strictlySortedSinglyLinkedList39.repOK();
    tp2.IP iP45 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i46 = iP45.getSecond();
    iP45.setFirst((java.lang.Integer)11001000);
    iP45.setFirst((java.lang.Integer)(-2147483648));
    boolean b51 = strictlySortedSinglyLinkedList39.removeFromIP(iP45);
    boolean b52 = iP36.equals((java.lang.Object)strictlySortedSinglyLinkedList39);
    tp2.IP iP57 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP57.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan61 = new tp2.IPBan(iP57, (java.lang.Long)100L);
    boolean b62 = strictlySortedSinglyLinkedList39.removeFromIP(iP57);
    strictlySortedSinglyLinkedList39.size = 5;
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList65 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b66 = strictlySortedSinglyLinkedList65.repOK();
    tp2.IP iP71 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i72 = iP71.getSecond();
    iP71.setFirst((java.lang.Integer)11001000);
    iP71.setFirst((java.lang.Integer)(-2147483648));
    boolean b77 = strictlySortedSinglyLinkedList65.removeFromIP(iP71);
    tp2.Node node78 = strictlySortedSinglyLinkedList65.header;
    strictlySortedSinglyLinkedList39.header = node78;
    tp2.IP iP84 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i85 = iP84.getSecond();
    java.lang.Integer i86 = iP84.getFourth();
    iP84.setFirst((java.lang.Integer)5);
    iP84.setSecond((java.lang.Integer)11001000);
    tp2.IPBan iPBan92 = new tp2.IPBan(iP84, (java.lang.Long)100L);
    tp2.IP iP93 = iPBan92.getIp();
    boolean b94 = strictlySortedSinglyLinkedList39.add(iPBan92);
    java.lang.Long long95 = iPBan92.getExpires();
    tp2.IP iP96 = iPBan92.getIp();
    java.lang.Long long97 = iPBan92.expires;
    boolean b98 = strictlySortedSinglyLinkedList0.add(iPBan92);
    int i99 = strictlySortedSinglyLinkedList0.getSize();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i22 + "' != '" + 100+ "'", i22.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i46 + "' != '" + (-1)+ "'", i46.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b51 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b52 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b62 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b66 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i72 + "' != '" + (-1)+ "'", i72.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b77 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node78);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i85 + "' != '" + (-1)+ "'", i85.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i86 + "' != '" + 100+ "'", i86.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP93);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b94 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long95 + "' != '" + 100L+ "'", long95.equals(100L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP96);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long97 + "' != '" + 100L+ "'", long97.equals(100L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b98 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i99 == 1);

  }

  @Test
  public void test455() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test455"); }


    int i2 = java.lang.Integer.remainderUnsigned(0, 546080348);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);

  }

  @Test
  public void test456() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test456"); }


    java.lang.Integer i1 = java.lang.Integer.getInteger("2364866560");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);

  }

  @Test
  public void test457() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test457"); }


    java.lang.Integer i1 = java.lang.Integer.getInteger("62079");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);

  }

  @Test
  public void test458() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test458"); }


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
    tp2.IP iP52 = iPBan45.getIp();
    iPBan45.setExpires((java.lang.Long)4194304L);
    java.lang.Long long55 = iPBan45.getExpires();
    tp2.IP iP60 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP60.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan64 = new tp2.IPBan(iP60, (java.lang.Long)100L);
    tp2.IP iP65 = iPBan64.ip;
    tp2.IP iP70 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i71 = iP70.getFourth();
    java.lang.Integer i72 = iP70.getFourth();
    iP70.setThird((java.lang.Integer)200);
    iPBan64.ip = iP70;
    iP70.setFirst((java.lang.Integer)16777216);
    iP70.setThird((java.lang.Integer)(-2));
    iP70.setFourth((java.lang.Integer)637534208);
    boolean b83 = iP70.equals((java.lang.Object)101101102);
    iPBan45.setIp(iP70);
    iP70.setFourth((java.lang.Integer)190022658);
    
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
    org.junit.Assert.assertNotNull(iP52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long55 + "' != '" + 4194304L+ "'", long55.equals(4194304L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP65);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i71 + "' != '" + 100+ "'", i71.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i72 + "' != '" + 100+ "'", i72.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b83 == false);

  }

  @Test
  public void test459() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test459"); }


    int i2 = java.lang.Integer.rotateRight((-536036956), 169091127);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 426985920);

  }

  @Test
  public void test460() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test460"); }


    tp2.SinglyLinkedList singlyLinkedList0 = new tp2.SinglyLinkedList();
    int i1 = singlyLinkedList0.getSize();
    int i2 = singlyLinkedList0.getSize();
    tp2.IP iP3 = null;
    boolean b4 = singlyLinkedList0.contains(iP3);
    tp2.IP iP6 = singlyLinkedList0.get(27);
    boolean b7 = singlyLinkedList0.isEmpty();
    int i8 = singlyLinkedList0.getSize();
    tp2.SinglyLinkedList singlyLinkedList9 = new tp2.SinglyLinkedList();
    int i10 = singlyLinkedList9.getSize();
    int i11 = singlyLinkedList9.getSize();
    tp2.IP iP12 = null;
    boolean b13 = singlyLinkedList9.contains(iP12);
    tp2.IP iP15 = singlyLinkedList9.get(27);
    tp2.IP iP20 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP20.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan24 = new tp2.IPBan(iP20, (java.lang.Long)100L);
    tp2.IP iP25 = iPBan24.ip;
    tp2.IP iP30 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP30.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan34 = new tp2.IPBan(iP30, (java.lang.Long)100L);
    iPBan24.setIp(iP30);
    boolean b36 = singlyLinkedList9.remove(iP30);
    tp2.IP iP38 = singlyLinkedList9.get(4);
    boolean b39 = singlyLinkedList9.repOK();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList40 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b41 = strictlySortedSinglyLinkedList40.repOK();
    tp2.IP iP46 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i47 = iP46.getSecond();
    iP46.setFirst((java.lang.Integer)11001000);
    iP46.setFirst((java.lang.Integer)(-2147483648));
    boolean b52 = strictlySortedSinglyLinkedList40.removeFromIP(iP46);
    tp2.IPBan iPBan54 = strictlySortedSinglyLinkedList40.get((-1));
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList55 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b56 = strictlySortedSinglyLinkedList55.repOK();
    tp2.IP iP61 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i62 = iP61.getSecond();
    iP61.setFirst((java.lang.Integer)11001000);
    iP61.setFirst((java.lang.Integer)(-2147483648));
    boolean b67 = strictlySortedSinglyLinkedList55.removeFromIP(iP61);
    boolean b68 = strictlySortedSinglyLinkedList40.removeFromIP(iP61);
    boolean b69 = singlyLinkedList9.remove(iP61);
    boolean b70 = singlyLinkedList0.remove(iP61);
    java.lang.Integer i71 = iP61.getFirst();
    
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
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i47 + "' != '" + (-1)+ "'", i47.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b52 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iPBan54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b56 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i62 + "' != '" + (-1)+ "'", i62.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b67 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b68 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b69 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b70 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i71 + "' != '" + (-2147483648)+ "'", i71.equals((-2147483648)));

  }

  @Test
  public void test461() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test461"); }


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
    java.lang.Integer i32 = iP31.getSecond();
    java.lang.Integer i33 = iP31.getFourth();
    iP31.setFirst((java.lang.Integer)5);
    tp2.IPBan iPBan37 = new tp2.IPBan(iP31, (java.lang.Long)0L);
    tp2.IP iP38 = iPBan37.getIp();
    boolean b39 = strictlySortedSinglyLinkedList13.contains(iPBan37);
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
    iP51.setFourth((java.lang.Integer)30);
    java.lang.Integer i61 = iP51.getThird();
    iP51.setFirst((java.lang.Integer)201326592);
    boolean b64 = strictlySortedSinglyLinkedList13.removeFromIP(iP51);
    iP51.setSecond((java.lang.Integer)(-788267008));
    
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
    org.junit.Assert.assertTrue("'" + i32 + "' != '" + (-1)+ "'", i32.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i33 + "' != '" + 100+ "'", i33.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == false);
    
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
    org.junit.Assert.assertTrue("'" + i61 + "' != '" + (-1)+ "'", i61.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b64 == false);

  }

  @Test
  public void test462() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test462"); }


    int i2 = java.lang.Integer.compare((-1018167296), 20272469);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == (-1));

  }

  @Test
  public void test463() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test463"); }


    int i2 = java.lang.Integer.divideUnsigned((-234815488), 771957);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 5259);

  }

  @Test
  public void test464() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test464"); }


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
    boolean b37 = singlyLinkedList0.repOK();
    tp2.IP iP42 = new tp2.IP((java.lang.Integer)0, (java.lang.Integer)30, (java.lang.Integer)162, (java.lang.Integer)20);
    iP42.setFourth((java.lang.Integer)1048576);
    boolean b45 = singlyLinkedList0.contains(iP42);
    
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
    org.junit.Assert.assertTrue(b37 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == false);

  }

  @Test
  public void test465() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test465"); }


    tp2.IP iP4 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i5 = iP4.getSecond();
    iP4.setFirst((java.lang.Integer)11001000);
    java.lang.Integer i8 = iP4.getSecond();
    iP4.setSecond((java.lang.Integer)1506);
    java.lang.Integer i11 = iP4.getFirst();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i5 + "' != '" + (-1)+ "'", i5.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i8 + "' != '" + (-1)+ "'", i8.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i11 + "' != '" + 11001000+ "'", i11.equals(11001000));

  }

  @Test
  public void test466() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test466"); }


    int i2 = java.lang.Integer.rotateLeft((-395799301), 7000);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == (-68654956));

  }

  @Test
  public void test467() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test467"); }


    tp2.IP iP4 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i5 = iP4.getSecond();
    iP4.setFirst((java.lang.Integer)11001000);
    iP4.setFirst((java.lang.Integer)32);
    java.lang.Integer i10 = iP4.getFirst();
    iP4.setSecond((java.lang.Integer)40);
    tp2.IPBan iPBan14 = new tp2.IPBan(iP4, (java.lang.Long)356246787L);
    java.lang.Long long15 = iPBan14.getExpires();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i5 + "' != '" + (-1)+ "'", i5.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i10 + "' != '" + 32+ "'", i10.equals(32));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long15 + "' != '" + 356246787L+ "'", long15.equals(356246787L));

  }

  @Test
  public void test468() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test468"); }


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
    int i21 = singlyLinkedList0.getSize();
    
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
    org.junit.Assert.assertTrue(i21 == 0);

  }

  @Test
  public void test469() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test469"); }


    java.lang.Integer i2 = java.lang.Integer.getInteger("989680", (-942798080));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i2 + "' != '" + (-942798080)+ "'", i2.equals((-942798080)));

  }

  @Test
  public void test470() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test470"); }


    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList0 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b1 = strictlySortedSinglyLinkedList0.repOK();
    strictlySortedSinglyLinkedList0.size = 1;
    strictlySortedSinglyLinkedList0.size = 0;
    tp2.IP iP10 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i11 = iP10.getSecond();
    java.lang.Integer i12 = iP10.getFourth();
    boolean b13 = strictlySortedSinglyLinkedList0.containsIP(iP10);
    tp2.Node node14 = strictlySortedSinglyLinkedList0.header;
    int i15 = strictlySortedSinglyLinkedList0.getSize();
    int i16 = strictlySortedSinglyLinkedList0.getSize();
    int i17 = strictlySortedSinglyLinkedList0.size;
    int i18 = strictlySortedSinglyLinkedList0.size;
    tp2.SinglyLinkedList singlyLinkedList19 = new tp2.SinglyLinkedList();
    boolean b20 = singlyLinkedList19.repOK();
    tp2.IP iP22 = singlyLinkedList19.get(200);
    boolean b23 = singlyLinkedList19.isEmpty();
    tp2.IP iP28 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i29 = iP28.getThird();
    boolean b30 = singlyLinkedList19.remove(iP28);
    tp2.IP iP35 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP35.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan39 = new tp2.IPBan(iP35, (java.lang.Long)100L);
    tp2.IP iP40 = iPBan39.ip;
    tp2.IP iP41 = iPBan39.getIp();
    java.lang.Integer i42 = null;
    iP41.setFirst(i42);
    boolean b44 = singlyLinkedList19.contains(iP41);
    tp2.IP iP49 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP49.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan53 = new tp2.IPBan(iP49, (java.lang.Long)100L);
    java.lang.Integer i54 = iP49.getFirst();
    java.lang.Integer i55 = iP49.getFourth();
    singlyLinkedList19.add(iP49);
    boolean b58 = iP49.equals((java.lang.Object)30);
    boolean b59 = strictlySortedSinglyLinkedList0.removeFromIP(iP49);
    boolean b60 = strictlySortedSinglyLinkedList0.isEmpty();
    boolean b61 = strictlySortedSinglyLinkedList0.isEmpty();
    boolean b62 = strictlySortedSinglyLinkedList0.isEmpty();
    strictlySortedSinglyLinkedList0.size = (-233400046);
    
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
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i29 + "' != '" + (-1)+ "'", i29.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i54 + "' != '" + 200+ "'", i54.equals(200));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i55 + "' != '" + 100+ "'", i55.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b58 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b59 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b60 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b61 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b62 == true);

  }

  @Test
  public void test471() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test471"); }


    // The following exception was thrown during execution in test generation
    try {
      java.lang.Integer i1 = java.lang.Integer.valueOf("23400003670");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test472() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test472"); }


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
    tp2.IP iP70 = iPBan66.getIp();
    java.lang.Long long71 = iPBan66.expires;
    java.lang.Long long72 = iPBan66.getExpires();
    java.lang.Long long73 = iPBan66.expires;
    
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
    org.junit.Assert.assertNotNull(iP70);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long71 + "' != '" + 100L+ "'", long71.equals(100L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long72 + "' != '" + 100L+ "'", long72.equals(100L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long73 + "' != '" + 100L+ "'", long73.equals(100L));

  }

  @Test
  public void test473() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test473"); }


    tp2.IP iP4 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    tp2.IPBan iPBan6 = new tp2.IPBan(iP4, (java.lang.Long)469762048L);
    tp2.IP iP11 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP11.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan15 = new tp2.IPBan(iP11, (java.lang.Long)100L);
    tp2.IP iP16 = iPBan15.ip;
    tp2.IP iP17 = iPBan15.getIp();
    java.lang.Integer i18 = null;
    iP17.setFirst(i18);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList20 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b21 = strictlySortedSinglyLinkedList20.repOK();
    tp2.IP iP26 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i27 = iP26.getSecond();
    iP26.setFirst((java.lang.Integer)11001000);
    iP26.setFirst((java.lang.Integer)(-2147483648));
    boolean b32 = strictlySortedSinglyLinkedList20.removeFromIP(iP26);
    boolean b33 = iP17.equals((java.lang.Object)strictlySortedSinglyLinkedList20);
    tp2.IP iP38 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP38.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan42 = new tp2.IPBan(iP38, (java.lang.Long)100L);
    boolean b43 = strictlySortedSinglyLinkedList20.removeFromIP(iP38);
    java.lang.Integer i44 = iP38.getFirst();
    iP38.setFirst((java.lang.Integer)0);
    iPBan6.setIp(iP38);
    tp2.IP iP48 = iPBan6.getIp();
    java.lang.Integer i49 = iP48.getFourth();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i27 + "' != '" + (-1)+ "'", i27.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b43 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i44 + "' != '" + 200+ "'", i44.equals(200));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i49 + "' != '" + 100+ "'", i49.equals(100));

  }

  @Test
  public void test474() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test474"); }


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
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList33 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b34 = strictlySortedSinglyLinkedList33.repOK();
    tp2.IP iP39 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i40 = iP39.getSecond();
    iP39.setFirst((java.lang.Integer)11001000);
    iP39.setFirst((java.lang.Integer)(-2147483648));
    boolean b45 = strictlySortedSinglyLinkedList33.removeFromIP(iP39);
    tp2.IPBan iPBan46 = null;
    boolean b47 = strictlySortedSinglyLinkedList33.add(iPBan46);
    tp2.Node node48 = strictlySortedSinglyLinkedList33.header;
    tp2.Node node49 = strictlySortedSinglyLinkedList33.header;
    boolean b50 = iP32.equals((java.lang.Object)strictlySortedSinglyLinkedList33);
    boolean b51 = strictlySortedSinglyLinkedList33.repOK();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i29 + "' != '" + 200+ "'", i29.equals(200));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i30 + "' != '" + 100+ "'", i30.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i40 + "' != '" + (-1)+ "'", i40.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b47 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b50 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b51 == false);

  }

  @Test
  public void test475() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test475"); }


    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList0 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b1 = strictlySortedSinglyLinkedList0.repOK();
    tp2.IP iP6 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    boolean b7 = strictlySortedSinglyLinkedList0.containsIP(iP6);
    java.lang.Integer i8 = iP6.getFirst();
    java.lang.Integer i9 = iP6.getFirst();
    java.lang.Integer i10 = iP6.getFourth();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i8 + "' != '" + (-1)+ "'", i8.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + (-1)+ "'", i9.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i10 + "' != '" + 100+ "'", i10.equals(100));

  }

  @Test
  public void test476() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test476"); }


    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList0 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b1 = strictlySortedSinglyLinkedList0.repOK();
    tp2.IP iP6 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    boolean b7 = strictlySortedSinglyLinkedList0.containsIP(iP6);
    tp2.Node node8 = strictlySortedSinglyLinkedList0.header;
    strictlySortedSinglyLinkedList0.size = 37469776;
    int i11 = strictlySortedSinglyLinkedList0.size;
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList12 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b13 = strictlySortedSinglyLinkedList12.repOK();
    boolean b14 = strictlySortedSinglyLinkedList12.repOK();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList15 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b16 = strictlySortedSinglyLinkedList15.repOK();
    tp2.IP iP21 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    boolean b22 = strictlySortedSinglyLinkedList15.containsIP(iP21);
    tp2.Node node23 = strictlySortedSinglyLinkedList15.header;
    strictlySortedSinglyLinkedList12.header = node23;
    strictlySortedSinglyLinkedList12.size = 0;
    tp2.IPBan iPBan28 = strictlySortedSinglyLinkedList12.get(0);
    strictlySortedSinglyLinkedList12.size = (-1062740992);
    tp2.IP iP35 = new tp2.IP((java.lang.Integer)356246784, (java.lang.Integer)162, (java.lang.Integer)3, (java.lang.Integer)200);
    boolean b36 = strictlySortedSinglyLinkedList12.removeFromIP(iP35);
    tp2.Node node37 = strictlySortedSinglyLinkedList12.header;
    strictlySortedSinglyLinkedList0.header = node37;
    strictlySortedSinglyLinkedList0.size = 12800000;
    strictlySortedSinglyLinkedList0.size = 16737220;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 37469776);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iPBan28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node37);

  }

  @Test
  public void test477() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test477"); }


    int i2 = java.lang.Integer.remainderUnsigned(295365732, 27947);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 21836);

  }

  @Test
  public void test478() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test478"); }


    long long1 = java.lang.Integer.toUnsignedLong(804);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == 804L);

  }

  @Test
  public void test479() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test479"); }


    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList0 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b1 = strictlySortedSinglyLinkedList0.repOK();
    strictlySortedSinglyLinkedList0.size = 1;
    strictlySortedSinglyLinkedList0.size = 0;
    tp2.IPBan iPBan6 = null;
    boolean b7 = strictlySortedSinglyLinkedList0.add(iPBan6);
    tp2.Node node8 = strictlySortedSinglyLinkedList0.header;
    int i9 = strictlySortedSinglyLinkedList0.size;
    boolean b10 = strictlySortedSinglyLinkedList0.isEmpty();
    strictlySortedSinglyLinkedList0.size = 106896;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);

  }

  @Test
  public void test480() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test480"); }


    int i2 = java.lang.Integer.rotateLeft(75809, 1431578965);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 69206053);

  }

  @Test
  public void test481() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test481"); }


    // The following exception was thrown during execution in test generation
    try {
      java.lang.Integer i1 = java.lang.Integer.decode("941b230");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test482() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test482"); }


    // The following exception was thrown during execution in test generation
    try {
      java.lang.Integer i1 = java.lang.Integer.valueOf("11110010000000010000000");
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

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test483"); }


    java.lang.Integer i2 = java.lang.Integer.getInteger("10101000001111110010100011010", (java.lang.Integer)1622038457);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i2 + "' != '" + 1622038457+ "'", i2.equals(1622038457));

  }

  @Test
  public void test484() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test484"); }


    int i1 = java.lang.Integer.numberOfTrailingZeros((-1830458331));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);

  }

  @Test
  public void test485() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test485"); }


    int i1 = java.lang.Integer.numberOfTrailingZeros(196608);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 16);

  }

  @Test
  public void test486() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test486"); }


    java.lang.Integer i1 = java.lang.Integer.valueOf(831941);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 831941+ "'", i1.equals(831941));

  }

  @Test
  public void test487() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test487"); }


    // The following exception was thrown during execution in test generation
    try {
      java.lang.Integer i2 = java.lang.Integer.valueOf("100000000000000000", (-233400046));
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

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test488"); }


    // The following exception was thrown during execution in test generation
    try {
      int i1 = java.lang.Integer.parseInt("5b3da8c0");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test489() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test489"); }


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
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList25 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b26 = strictlySortedSinglyLinkedList25.repOK();
    strictlySortedSinglyLinkedList25.size = 1;
    strictlySortedSinglyLinkedList25.size = 0;
    tp2.IP iP35 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP35.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan39 = new tp2.IPBan(iP35, (java.lang.Long)100L);
    tp2.IP iP40 = iPBan39.ip;
    boolean b41 = strictlySortedSinglyLinkedList25.contains(iPBan39);
    boolean b42 = strictlySortedSinglyLinkedList25.repOK();
    tp2.SinglyLinkedList singlyLinkedList43 = new tp2.SinglyLinkedList();
    int i44 = singlyLinkedList43.getSize();
    tp2.IP iP49 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i50 = iP49.getSecond();
    java.lang.Integer i51 = iP49.getFourth();
    singlyLinkedList43.add(iP49);
    boolean b54 = iP49.equals((java.lang.Object)2147483647);
    tp2.IPBan iPBan56 = new tp2.IPBan(iP49, (java.lang.Long)(-1L));
    boolean b57 = strictlySortedSinglyLinkedList25.add(iPBan56);
    tp2.Node node58 = strictlySortedSinglyLinkedList25.header;
    strictlySortedSinglyLinkedList0.header = node58;
    tp2.IPBan iPBan61 = strictlySortedSinglyLinkedList0.get((-2147483641));
    int i62 = strictlySortedSinglyLinkedList0.getSize();
    boolean b63 = strictlySortedSinglyLinkedList0.repOK();
    strictlySortedSinglyLinkedList0.size = 234881024;
    tp2.IPBan iPBan67 = strictlySortedSinglyLinkedList0.get(2046820352);
    tp2.IP iP72 = new tp2.IP((java.lang.Integer)160, (java.lang.Integer)1, (java.lang.Integer)27, (java.lang.Integer)(-2));
    java.lang.Integer i73 = iP72.getFourth();
    boolean b74 = strictlySortedSinglyLinkedList0.removeFromIP(iP72);
    tp2.Node node75 = strictlySortedSinglyLinkedList0.header;
    
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
    org.junit.Assert.assertTrue(b26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i44 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i50 + "' != '" + (-1)+ "'", i50.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i51 + "' != '" + 100+ "'", i51.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b54 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b57 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node58);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iPBan61);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i62 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b63 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iPBan67);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i73 + "' != '" + (-2)+ "'", i73.equals((-2)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b74 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node75);

  }

  @Test
  public void test490() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test490"); }


    java.lang.Integer i1 = java.lang.Integer.valueOf((-1567422464));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + (-1567422464)+ "'", i1.equals((-1567422464)));

  }

  @Test
  public void test491() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test491"); }


    int i1 = java.lang.Integer.highestOneBit(8389120);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 8388608);

  }

  @Test
  public void test492() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test492"); }


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
    boolean b87 = strictlySortedSinglyLinkedList0.isEmpty();
    tp2.IP iP88 = null;
    boolean b89 = strictlySortedSinglyLinkedList0.containsIP(iP88);
    int i90 = strictlySortedSinglyLinkedList0.size;
    strictlySortedSinglyLinkedList0.size = 920903680;
    
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
    org.junit.Assert.assertTrue(b87 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b89 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i90 == 11001001);

  }

  @Test
  public void test493() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test493"); }


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
    tp2.IP iP38 = iPBan11.getIp();
    tp2.IP iP43 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP43.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan47 = new tp2.IPBan(iP43, (java.lang.Long)100L);
    tp2.IP iP48 = iPBan47.ip;
    tp2.IP iP49 = iPBan47.getIp();
    tp2.IP iP54 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP54.setFirst((java.lang.Integer)200);
    iPBan47.ip = iP54;
    iP54.setFourth((java.lang.Integer)242);
    java.lang.Integer i60 = iP54.getSecond();
    iPBan11.setIp(iP54);
    iPBan11.expires = 2477064192L;
    java.lang.Long long64 = iPBan11.getExpires();
    tp2.IP iP65 = iPBan11.getIp();
    boolean b67 = iP65.equals((java.lang.Object)"1314254202");
    
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
    org.junit.Assert.assertNotNull(iP38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i60 + "' != '" + (-1)+ "'", i60.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long64 + "' != '" + 2477064192L+ "'", long64.equals(2477064192L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP65);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b67 == false);

  }

  @Test
  public void test494() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test494"); }


    int i1 = java.lang.Integer.reverseBytes((-432078359));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == (-385794074));

  }

  @Test
  public void test495() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test495"); }


    int i2 = java.lang.Integer.sum((-1068183552), 5061573);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == (-1063121979));

  }

  @Test
  public void test496() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test496"); }


    int i1 = java.lang.Integer.bitCount(6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 2);

  }

  @Test
  public void test497() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test497"); }


    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList0 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IPBan iPBan1 = null;
    boolean b2 = strictlySortedSinglyLinkedList0.add(iPBan1);
    int i3 = strictlySortedSinglyLinkedList0.getSize();
    tp2.Node node4 = strictlySortedSinglyLinkedList0.header;
    int i5 = strictlySortedSinglyLinkedList0.getSize();
    boolean b6 = strictlySortedSinglyLinkedList0.repOK();
    tp2.IP iP11 = new tp2.IP((java.lang.Integer)1610612738, (java.lang.Integer)(-1570502528), (java.lang.Integer)118840512, (java.lang.Integer)725501);
    // The following exception was thrown during execution in test generation
    try {
      boolean b12 = strictlySortedSinglyLinkedList0.removeFromIP(iP11);
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
    org.junit.Assert.assertTrue(b6 == false);

  }

  @Test
  public void test498() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test498"); }


    int i1 = java.lang.Integer.lowestOneBit((-1572356096));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 16384);

  }

  @Test
  public void test499() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test499"); }


    long long1 = java.lang.Integer.toUnsignedLong((-2146762752));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == 2148204544L);

  }

  @Test
  public void test500() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest37.test500"); }


    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList0 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b1 = strictlySortedSinglyLinkedList0.repOK();
    boolean b2 = strictlySortedSinglyLinkedList0.repOK();
    int i3 = strictlySortedSinglyLinkedList0.getSize();
    tp2.Node node4 = strictlySortedSinglyLinkedList0.header;
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList5 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b6 = strictlySortedSinglyLinkedList5.isEmpty();
    tp2.IP iP11 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP11.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan15 = new tp2.IPBan(iP11, (java.lang.Long)100L);
    tp2.IP iP16 = iPBan15.ip;
    tp2.IP iP21 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP21.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan25 = new tp2.IPBan(iP21, (java.lang.Long)100L);
    iPBan15.setIp(iP21);
    tp2.IP iP31 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP31.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan35 = new tp2.IPBan(iP31, (java.lang.Long)100L);
    java.lang.Integer i36 = iP31.getFirst();
    java.lang.Integer i37 = iP31.getFourth();
    iPBan15.setIp(iP31);
    tp2.IP iP39 = iPBan15.getIp();
    tp2.IP iP40 = iPBan15.getIp();
    iPBan15.setExpires((java.lang.Long)1L);
    boolean b43 = strictlySortedSinglyLinkedList5.contains(iPBan15);
    boolean b44 = strictlySortedSinglyLinkedList0.contains(iPBan15);
    iPBan15.expires = 3664572643L;
    iPBan15.expires = 318767115L;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i36 + "' != '" + 200+ "'", i36.equals(200));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i37 + "' != '" + 100+ "'", i37.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b43 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == false);

  }

}
