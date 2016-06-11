package randoopTestsWithoutServer1;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest42 {

  public static boolean debug = false;

  @Test
  public void test001() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test001"); }


    java.lang.Integer i1 = java.lang.Integer.valueOf(9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 9+ "'", i1.equals(9));

  }

  @Test
  public void test002() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test002"); }


    int i1 = java.lang.Integer.highestOneBit(10702811);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 8388608);

  }

  @Test
  public void test003() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test003"); }


    // The following exception was thrown during execution in test generation
    try {
      int i2 = java.lang.Integer.parseInt("1001010100000010111110010", 1706474384);
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

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test004"); }


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
    boolean b34 = strictlySortedSinglyLinkedList21.isEmpty();
    int i35 = strictlySortedSinglyLinkedList21.getSize();
    
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
    org.junit.Assert.assertTrue(b34 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i35 == 0);

  }

  @Test
  public void test005() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test005"); }


    int i2 = java.lang.Integer.remainderUnsigned(169091127, 14400);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 6327);

  }

  @Test
  public void test006() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test006"); }


    int i1 = java.lang.Integer.reverse((-473825240));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 335561671);

  }

  @Test
  public void test007() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test007"); }


    // The following exception was thrown during execution in test generation
    try {
      int i2 = java.lang.Integer.parseUnsignedInt("1100000000000101", 48812571);
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

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test008"); }


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
    tp2.SinglyLinkedList singlyLinkedList64 = new tp2.SinglyLinkedList();
    boolean b65 = singlyLinkedList64.repOK();
    tp2.IP iP67 = singlyLinkedList64.get(200);
    boolean b68 = singlyLinkedList64.isEmpty();
    boolean b69 = singlyLinkedList64.repOK();
    boolean b70 = singlyLinkedList64.repOK();
    tp2.IP iP75 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i76 = iP75.getThird();
    singlyLinkedList64.add(iP75);
    int i78 = singlyLinkedList64.getSize();
    tp2.IP iP80 = singlyLinkedList64.get(100);
    tp2.SinglyLinkedList singlyLinkedList81 = new tp2.SinglyLinkedList();
    boolean b82 = singlyLinkedList81.repOK();
    tp2.IP iP87 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP87.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan91 = new tp2.IPBan(iP87, (java.lang.Long)100L);
    iP87.setFourth((java.lang.Integer)32);
    singlyLinkedList81.add(iP87);
    singlyLinkedList64.add(iP87);
    tp2.IP iP97 = singlyLinkedList64.get((-1000079616));
    singlyLinkedList0.add(iP97);
    
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
    org.junit.Assert.assertTrue(b65 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP67);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b68 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b69 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b70 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i76 + "' != '" + (-1)+ "'", i76.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i78 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP80);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b82 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP97);

  }

  @Test
  public void test009() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test009"); }


    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList0 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b1 = strictlySortedSinglyLinkedList0.repOK();
    strictlySortedSinglyLinkedList0.size = 1;
    strictlySortedSinglyLinkedList0.size = 0;
    tp2.IPBan iPBan6 = null;
    boolean b7 = strictlySortedSinglyLinkedList0.add(iPBan6);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList8 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b9 = strictlySortedSinglyLinkedList8.repOK();
    tp2.IP iP14 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i15 = iP14.getSecond();
    iP14.setFirst((java.lang.Integer)11001000);
    iP14.setFirst((java.lang.Integer)(-2147483648));
    boolean b20 = strictlySortedSinglyLinkedList8.removeFromIP(iP14);
    tp2.IPBan iPBan21 = null;
    boolean b22 = strictlySortedSinglyLinkedList8.add(iPBan21);
    tp2.Node node23 = strictlySortedSinglyLinkedList8.header;
    strictlySortedSinglyLinkedList0.header = node23;
    strictlySortedSinglyLinkedList0.size = 10010;
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
    boolean b44 = singlyLinkedList27.isEmpty();
    boolean b45 = singlyLinkedList27.repOK();
    boolean b46 = singlyLinkedList27.repOK();
    boolean b47 = singlyLinkedList27.isEmpty();
    tp2.IP iP52 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i53 = iP52.getSecond();
    iP52.setFirst((java.lang.Integer)11001000);
    iP52.setFirst((java.lang.Integer)32);
    singlyLinkedList27.add(iP52);
    boolean b59 = singlyLinkedList27.repOK();
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
    iPBan85.expires = 10L;
    java.lang.Long long88 = iPBan85.getExpires();
    tp2.IP iP89 = iPBan85.ip;
    boolean b90 = singlyLinkedList27.contains(iP89);
    // The following exception was thrown during execution in test generation
    try {
      boolean b91 = strictlySortedSinglyLinkedList0.containsIP(iP89);
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
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i15 + "' != '" + (-1)+ "'", i15.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node23);
    
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
    org.junit.Assert.assertTrue(b44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b46 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b47 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i53 + "' != '" + (-1)+ "'", i53.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b59 == true);
    
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
    org.junit.Assert.assertTrue("'" + long88 + "' != '" + 10L+ "'", long88.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP89);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b90 == true);

  }

  @Test
  public void test010() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test010"); }


    int i1 = java.lang.Integer.signum(640002022);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 1);

  }

  @Test
  public void test011() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test011"); }


    int i2 = java.lang.Integer.rotateRight(1900544, 31943);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 14848);

  }

  @Test
  public void test012() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test012"); }


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
    tp2.SinglyLinkedList singlyLinkedList28 = new tp2.SinglyLinkedList();
    int i29 = singlyLinkedList28.getSize();
    tp2.IP iP34 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i35 = iP34.getSecond();
    java.lang.Integer i36 = iP34.getFourth();
    singlyLinkedList28.add(iP34);
    tp2.IPBan iPBan39 = new tp2.IPBan(iP34, (java.lang.Long)100L);
    iP34.setThird((java.lang.Integer)(-2147483641));
    boolean b42 = singlyLinkedList0.remove(iP34);
    int i43 = singlyLinkedList0.getSize();
    tp2.IP iP48 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i49 = iP48.getSecond();
    iP48.setFirst((java.lang.Integer)11001000);
    iP48.setFirst((java.lang.Integer)32);
    java.lang.Integer i54 = iP48.getFirst();
    iP48.setSecond((java.lang.Integer)40);
    iP48.setFirst((java.lang.Integer)242);
    java.lang.Integer i59 = iP48.getThird();
    boolean b60 = singlyLinkedList0.contains(iP48);
    boolean b61 = singlyLinkedList0.isEmpty();
    
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
    org.junit.Assert.assertTrue(i29 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i35 + "' != '" + (-1)+ "'", i35.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i36 + "' != '" + 100+ "'", i36.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i43 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i49 + "' != '" + (-1)+ "'", i49.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i54 + "' != '" + 32+ "'", i54.equals(32));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i59 + "' != '" + (-1)+ "'", i59.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b60 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b61 == true);

  }

  @Test
  public void test013() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test013"); }


    java.lang.Integer i2 = java.lang.Integer.getInteger("10110110000010100000000000000000", (java.lang.Integer)50694);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i2 + "' != '" + 50694+ "'", i2.equals(50694));

  }

  @Test
  public void test014() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test014"); }


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
    iP65.setFirst((java.lang.Integer)11030000);
    
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

  }

  @Test
  public void test015() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test015"); }


    int i2 = java.lang.Integer.remainderUnsigned(134, 90133041);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 134);

  }

  @Test
  public void test016() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test016"); }


    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList0 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IPBan iPBan1 = null;
    boolean b2 = strictlySortedSinglyLinkedList0.add(iPBan1);
    int i3 = strictlySortedSinglyLinkedList0.getSize();
    tp2.Node node4 = strictlySortedSinglyLinkedList0.header;
    strictlySortedSinglyLinkedList0.size = (-2147483648);
    boolean b7 = strictlySortedSinglyLinkedList0.repOK();
    int i8 = strictlySortedSinglyLinkedList0.getSize();
    boolean b9 = strictlySortedSinglyLinkedList0.isEmpty();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList10 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b11 = strictlySortedSinglyLinkedList10.repOK();
    boolean b12 = strictlySortedSinglyLinkedList10.repOK();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList13 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b14 = strictlySortedSinglyLinkedList13.repOK();
    tp2.IP iP19 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    boolean b20 = strictlySortedSinglyLinkedList13.containsIP(iP19);
    tp2.Node node21 = strictlySortedSinglyLinkedList13.header;
    strictlySortedSinglyLinkedList10.header = node21;
    strictlySortedSinglyLinkedList0.header = node21;
    int i24 = strictlySortedSinglyLinkedList0.size;
    
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
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == (-2147483648));

  }

  @Test
  public void test017() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test017"); }


    // The following exception was thrown during execution in test generation
    try {
      int i2 = java.lang.Integer.parseUnsignedInt("206848", 3320);
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

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test018"); }


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
    tp2.IPBan iPBan18 = strictlySortedSinglyLinkedList0.get(268435456);
    strictlySortedSinglyLinkedList0.size = 1308183544;
    tp2.IP iP25 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP25.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan29 = new tp2.IPBan(iP25, (java.lang.Long)100L);
    tp2.IP iP30 = iPBan29.ip;
    tp2.SinglyLinkedList singlyLinkedList31 = new tp2.SinglyLinkedList();
    int i32 = singlyLinkedList31.getSize();
    tp2.IP iP37 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i38 = iP37.getSecond();
    java.lang.Integer i39 = iP37.getFourth();
    singlyLinkedList31.add(iP37);
    boolean b41 = iP30.equals((java.lang.Object)iP37);
    iP30.setFirst((java.lang.Integer)20478);
    boolean b44 = strictlySortedSinglyLinkedList0.removeFromIP(iP30);
    tp2.IPBan iPBan46 = strictlySortedSinglyLinkedList0.get(194531667);
    tp2.IP iP51 = new tp2.IP((java.lang.Integer)15204352, (java.lang.Integer)1, (java.lang.Integer)15204352, (java.lang.Integer)356246787);
    java.lang.Integer i52 = iP51.getSecond();
    java.lang.Integer i53 = iP51.getFourth();
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
    iPBan62.expires = 175L;
    java.lang.Long long80 = iPBan62.getExpires();
    tp2.IP iP85 = new tp2.IP((java.lang.Integer)211631616, (java.lang.Integer)10485760, (java.lang.Integer)112130, (java.lang.Integer)51756346);
    java.lang.Integer i86 = null;
    iP85.setSecond(i86);
    java.lang.Integer i88 = iP85.getFirst();
    iP85.setFourth((java.lang.Integer)65536);
    iPBan62.ip = iP85;
    boolean b92 = iP51.equals((java.lang.Object)iPBan62);
    boolean b93 = strictlySortedSinglyLinkedList0.add(iPBan62);
    tp2.IPBan iPBan95 = strictlySortedSinglyLinkedList0.get(1270177888);
    
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
    org.junit.Assert.assertNull(iPBan18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i32 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i38 + "' != '" + (-1)+ "'", i38.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i39 + "' != '" + 100+ "'", i39.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iPBan46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i52 + "' != '" + 1+ "'", i52.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i53 + "' != '" + 356246787+ "'", i53.equals(356246787));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i68 + "' != '" + (-1)+ "'", i68.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i69 + "' != '" + 100+ "'", i69.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long73 + "' != '" + 100L+ "'", long73.equals(100L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long80 + "' != '" + 175L+ "'", long80.equals(175L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i88 + "' != '" + 211631616+ "'", i88.equals(211631616));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b92 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b93 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iPBan95);

  }

  @Test
  public void test019() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test019"); }


    tp2.SinglyLinkedList singlyLinkedList0 = new tp2.SinglyLinkedList();
    boolean b1 = singlyLinkedList0.repOK();
    tp2.IP iP3 = singlyLinkedList0.get(200);
    int i4 = singlyLinkedList0.getSize();
    tp2.IP iP9 = new tp2.IP((java.lang.Integer)3, (java.lang.Integer)486539264, (java.lang.Integer)242, (java.lang.Integer)11001000);
    singlyLinkedList0.add(iP9);
    tp2.IP iP15 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP15.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan19 = new tp2.IPBan(iP15, (java.lang.Long)100L);
    tp2.IP iP20 = iPBan19.ip;
    iP20.setThird((java.lang.Integer)356246784);
    iP20.setFirst((java.lang.Integer)20);
    tp2.IP iP29 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP29.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan33 = new tp2.IPBan(iP29, (java.lang.Long)100L);
    tp2.IP iP38 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iPBan33.setIp(iP38);
    iP38.setSecond((java.lang.Integer)8);
    iP38.setThird((java.lang.Integer)1694498843);
    boolean b44 = iP20.equals((java.lang.Object)iP38);
    singlyLinkedList0.add(iP20);
    iP20.setFourth((java.lang.Integer)2081418682);
    java.lang.Integer i48 = iP20.getThird();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i48 + "' != '" + 356246784+ "'", i48.equals(356246784));

  }

  @Test
  public void test020() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test020"); }


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
    tp2.IP iP58 = singlyLinkedList19.get(805306369);
    boolean b59 = singlyLinkedList19.isEmpty();
    boolean b60 = singlyLinkedList19.isEmpty();
    
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
  public void test021() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test021"); }


    java.lang.String str1 = java.lang.Integer.toOctalString(507915568);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "3621426460"+ "'", str1.equals("3621426460"));

  }

  @Test
  public void test022() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test022"); }


    java.lang.Integer i1 = java.lang.Integer.getInteger("1001110111110010111100011");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);

  }

  @Test
  public void test023() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test023"); }


    int i2 = java.lang.Integer.compareUnsigned(454033408, 805512031);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == (-1));

  }

  @Test
  public void test024() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test024"); }


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
    int i30 = strictlySortedSinglyLinkedList0.getSize();
    tp2.IPBan iPBan32 = strictlySortedSinglyLinkedList0.get(33042);
    int i33 = strictlySortedSinglyLinkedList0.size;
    strictlySortedSinglyLinkedList0.size = 22005917;
    
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
    org.junit.Assert.assertTrue(i30 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iPBan32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 0);

  }

  @Test
  public void test025() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test025"); }


    // The following exception was thrown during execution in test generation
    try {
      int i2 = java.lang.Integer.parseUnsignedInt("1100000000000000000000000000", (-257396566));
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test026() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test026"); }


    int i1 = java.lang.Integer.numberOfLeadingZeros(951328);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 12);

  }

  @Test
  public void test027() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test027"); }


    java.lang.String str1 = java.lang.Integer.toHexString((-2147426285));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "8000e013"+ "'", str1.equals("8000e013"));

  }

  @Test
  public void test028() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test028"); }


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
    java.lang.Integer i20 = iP19.getSecond();
    java.lang.Integer i21 = iP19.getFourth();
    iP19.setFirst((java.lang.Integer)5);
    iP19.setSecond((java.lang.Integer)11001000);
    singlyLinkedList0.add(iP19);
    boolean b27 = singlyLinkedList0.repOK();
    tp2.SinglyLinkedList singlyLinkedList28 = new tp2.SinglyLinkedList();
    boolean b29 = singlyLinkedList28.repOK();
    tp2.IP iP31 = singlyLinkedList28.get(200);
    boolean b32 = singlyLinkedList28.isEmpty();
    boolean b33 = singlyLinkedList28.repOK();
    boolean b34 = singlyLinkedList28.repOK();
    tp2.IP iP39 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i40 = iP39.getThird();
    singlyLinkedList28.add(iP39);
    int i42 = singlyLinkedList28.getSize();
    tp2.SinglyLinkedList singlyLinkedList43 = new tp2.SinglyLinkedList();
    int i44 = singlyLinkedList43.getSize();
    tp2.IP iP49 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i50 = iP49.getSecond();
    java.lang.Integer i51 = iP49.getFourth();
    singlyLinkedList43.add(iP49);
    java.lang.Integer i53 = iP49.getFourth();
    boolean b54 = singlyLinkedList28.contains(iP49);
    java.lang.Integer i55 = iP49.getThird();
    java.lang.Integer i56 = null;
    iP49.setFirst(i56);
    // The following exception was thrown during execution in test generation
    try {
      singlyLinkedList0.add(iP49);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
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
    org.junit.Assert.assertTrue("'" + i20 + "' != '" + (-1)+ "'", i20.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i21 + "' != '" + 100+ "'", i21.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i40 + "' != '" + (-1)+ "'", i40.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i42 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i44 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i50 + "' != '" + (-1)+ "'", i50.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i51 + "' != '" + 100+ "'", i51.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i53 + "' != '" + 100+ "'", i53.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b54 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i55 + "' != '" + (-1)+ "'", i55.equals((-1)));

  }

  @Test
  public void test029() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test029"); }


    tp2.IP iP4 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i5 = iP4.getSecond();
    iP4.setFirst((java.lang.Integer)11001000);
    java.lang.Long long8 = null;
    tp2.IPBan iPBan9 = new tp2.IPBan(iP4, long8);
    tp2.IP iP10 = iPBan9.ip;
    tp2.IP iP15 = new tp2.IP((java.lang.Integer)160, (java.lang.Integer)1, (java.lang.Integer)27, (java.lang.Integer)(-2));
    java.lang.Integer i16 = iP15.getFourth();
    iPBan9.setIp(iP15);
    java.lang.Integer i18 = iP15.getThird();
    iP15.setFirst((java.lang.Integer)(-1967485951));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i5 + "' != '" + (-1)+ "'", i5.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i16 + "' != '" + (-2)+ "'", i16.equals((-2)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i18 + "' != '" + 27+ "'", i18.equals(27));

  }

  @Test
  public void test030() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test030"); }


    java.lang.Integer i2 = java.lang.Integer.getInteger("723357666", 278720);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i2 + "' != '" + 278720+ "'", i2.equals(278720));

  }

  @Test
  public void test031() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test031"); }


    int i2 = java.lang.Integer.sum((-2063597568), (-649967296));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1581402432);

  }

  @Test
  public void test032() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test032"); }


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
    singlyLinkedList0.add(iP26);
    boolean b53 = singlyLinkedList0.repOK();
    tp2.IP iP58 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i59 = iP58.getSecond();
    iP58.setFirst((java.lang.Integer)11001000);
    iP58.setFirst((java.lang.Integer)32);
    java.lang.Integer i64 = iP58.getFourth();
    boolean b65 = singlyLinkedList0.remove(iP58);
    
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
    org.junit.Assert.assertTrue(b53 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i59 + "' != '" + (-1)+ "'", i59.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i64 + "' != '" + 100+ "'", i64.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b65 == false);

  }

  @Test
  public void test033() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test033"); }


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
    java.lang.Integer i84 = iP77.getFourth();
    iP77.setFourth((java.lang.Integer)(-550955497));
    
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i84 + "' != '" + 100+ "'", i84.equals(100));

  }

  @Test
  public void test034() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test034"); }


    int i2 = java.lang.Integer.rotateRight((-2097135396), (-1410709984));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == (-2097135396));

  }

  @Test
  public void test035() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test035"); }


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
    tp2.IP iP30 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i31 = iP30.getSecond();
    java.lang.Integer i32 = iP30.getFourth();
    iP30.setFirst((java.lang.Integer)5);
    boolean b35 = strictlySortedSinglyLinkedList0.containsIP(iP30);
    iP30.setThird((java.lang.Integer)1159201585);
    iP30.setFirst((java.lang.Integer)1621588992);
    
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
    org.junit.Assert.assertTrue("'" + i31 + "' != '" + (-1)+ "'", i31.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i32 + "' != '" + 100+ "'", i32.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == false);

  }

  @Test
  public void test036() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test036"); }


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
    boolean b37 = strictlySortedSinglyLinkedList0.isEmpty();
    boolean b38 = strictlySortedSinglyLinkedList0.repOK();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList39 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b40 = strictlySortedSinglyLinkedList39.repOK();
    strictlySortedSinglyLinkedList39.size = 1;
    boolean b43 = strictlySortedSinglyLinkedList39.isEmpty();
    tp2.SinglyLinkedList singlyLinkedList44 = new tp2.SinglyLinkedList();
    int i45 = singlyLinkedList44.getSize();
    tp2.IP iP50 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i51 = iP50.getSecond();
    java.lang.Integer i52 = iP50.getFourth();
    singlyLinkedList44.add(iP50);
    boolean b55 = iP50.equals((java.lang.Object)2147483647);
    tp2.IPBan iPBan57 = new tp2.IPBan(iP50, (java.lang.Long)(-1L));
    java.lang.Long long58 = iPBan57.expires;
    boolean b59 = strictlySortedSinglyLinkedList39.contains(iPBan57);
    java.lang.Long long60 = iPBan57.getExpires();
    java.lang.Long long61 = iPBan57.expires;
    boolean b62 = strictlySortedSinglyLinkedList0.add(iPBan57);
    
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
    org.junit.Assert.assertTrue(b37 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b43 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i45 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i51 + "' != '" + (-1)+ "'", i51.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i52 + "' != '" + 100+ "'", i52.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b55 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long58 + "' != '" + (-1L)+ "'", long58.equals((-1L)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b59 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long60 + "' != '" + (-1L)+ "'", long60.equals((-1L)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long61 + "' != '" + (-1L)+ "'", long61.equals((-1L)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b62 == true);

  }

  @Test
  public void test037() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test037"); }


    int i1 = java.lang.Integer.highestOneBit(1011010);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 524288);

  }

  @Test
  public void test038() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test038"); }


    java.lang.Integer i1 = java.lang.Integer.valueOf("64800");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 64800+ "'", i1.equals(64800));

  }

  @Test
  public void test039() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test039"); }


    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList0 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b1 = strictlySortedSinglyLinkedList0.repOK();
    strictlySortedSinglyLinkedList0.size = 1;
    boolean b4 = strictlySortedSinglyLinkedList0.isEmpty();
    int i5 = strictlySortedSinglyLinkedList0.getSize();
    boolean b6 = strictlySortedSinglyLinkedList0.isEmpty();
    int i7 = strictlySortedSinglyLinkedList0.getSize();
    tp2.IP iP12 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i13 = iP12.getSecond();
    iP12.setFirst((java.lang.Integer)11001000);
    iP12.setFirst((java.lang.Integer)32);
    java.lang.Integer i18 = iP12.getFirst();
    boolean b19 = strictlySortedSinglyLinkedList0.removeFromIP(iP12);
    tp2.SinglyLinkedList singlyLinkedList20 = new tp2.SinglyLinkedList();
    int i21 = singlyLinkedList20.getSize();
    tp2.IP iP26 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i27 = iP26.getSecond();
    java.lang.Integer i28 = iP26.getFourth();
    singlyLinkedList20.add(iP26);
    boolean b30 = singlyLinkedList20.repOK();
    int i31 = singlyLinkedList20.getSize();
    tp2.IP iP33 = singlyLinkedList20.get(13);
    tp2.IP iP38 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP38.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan42 = new tp2.IPBan(iP38, (java.lang.Long)100L);
    tp2.IP iP47 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iPBan42.setIp(iP47);
    iP47.setSecond((java.lang.Integer)8);
    iP47.setFourth((java.lang.Integer)24);
    boolean b53 = singlyLinkedList20.remove(iP47);
    java.lang.Integer i54 = iP47.getFourth();
    boolean b55 = strictlySortedSinglyLinkedList0.removeFromIP(iP47);
    iP47.setFourth((java.lang.Integer)3065414);
    
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
    org.junit.Assert.assertTrue("'" + i13 + "' != '" + (-1)+ "'", i13.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i18 + "' != '" + 32+ "'", i18.equals(32));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i27 + "' != '" + (-1)+ "'", i27.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i28 + "' != '" + 100+ "'", i28.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i31 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b53 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i54 + "' != '" + 24+ "'", i54.equals(24));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b55 == false);

  }

  @Test
  public void test040() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test040"); }


    java.lang.String str1 = java.lang.Integer.toBinaryString(1547265877);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "1011100001110010110011101010101"+ "'", str1.equals("1011100001110010110011101010101"));

  }

  @Test
  public void test041() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test041"); }


    java.lang.String str2 = java.lang.Integer.toUnsignedString(308439517, 1431655808);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "308439517"+ "'", str2.equals("308439517"));

  }

  @Test
  public void test042() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test042"); }


    int i2 = java.lang.Integer.remainderUnsigned(3145730, 73);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 14);

  }

  @Test
  public void test043() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test043"); }


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
    int i93 = strictlySortedSinglyLinkedList0.getSize();
    
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
    org.junit.Assert.assertTrue(i93 == 0);

  }

  @Test
  public void test044() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test044"); }


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
    tp2.IP iP51 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP51.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan55 = new tp2.IPBan(iP51, (java.lang.Long)100L);
    tp2.IP iP56 = iPBan55.ip;
    tp2.IP iP57 = iPBan55.getIp();
    java.lang.Integer i58 = null;
    iP57.setFirst(i58);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList60 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b61 = strictlySortedSinglyLinkedList60.repOK();
    tp2.IP iP66 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i67 = iP66.getSecond();
    iP66.setFirst((java.lang.Integer)11001000);
    iP66.setFirst((java.lang.Integer)(-2147483648));
    boolean b72 = strictlySortedSinglyLinkedList60.removeFromIP(iP66);
    boolean b73 = iP57.equals((java.lang.Object)strictlySortedSinglyLinkedList60);
    tp2.IP iP78 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP78.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan82 = new tp2.IPBan(iP78, (java.lang.Long)100L);
    boolean b83 = strictlySortedSinglyLinkedList60.removeFromIP(iP78);
    java.lang.Integer i84 = iP78.getFirst();
    iPBan22.setIp(iP78);
    boolean b86 = singlyLinkedList0.remove(iP78);
    java.lang.Integer i87 = iP78.getThird();
    java.lang.Integer i88 = iP78.getFourth();
    
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
    org.junit.Assert.assertNotNull(iP23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i43 + "' != '" + 200+ "'", i43.equals(200));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i44 + "' != '" + 100+ "'", i44.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b61 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i67 + "' != '" + (-1)+ "'", i67.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b72 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b73 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b83 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i84 + "' != '" + 200+ "'", i84.equals(200));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b86 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i87 + "' != '" + (-1)+ "'", i87.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i88 + "' != '" + 100+ "'", i88.equals(100));

  }

  @Test
  public void test045() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test045"); }


    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList0 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b1 = strictlySortedSinglyLinkedList0.repOK();
    tp2.IP iP6 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i7 = iP6.getSecond();
    iP6.setFirst((java.lang.Integer)11001000);
    iP6.setFirst((java.lang.Integer)(-2147483648));
    boolean b12 = strictlySortedSinglyLinkedList0.removeFromIP(iP6);
    tp2.IPBan iPBan14 = strictlySortedSinglyLinkedList0.get((-1));
    strictlySortedSinglyLinkedList0.size = 23;
    int i17 = strictlySortedSinglyLinkedList0.getSize();
    boolean b18 = strictlySortedSinglyLinkedList0.isEmpty();
    boolean b19 = strictlySortedSinglyLinkedList0.repOK();
    boolean b20 = strictlySortedSinglyLinkedList0.isEmpty();
    int i21 = strictlySortedSinglyLinkedList0.getSize();
    tp2.IP iP26 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i27 = iP26.getSecond();
    iP26.setFirst((java.lang.Integer)11001000);
    java.lang.Integer i30 = iP26.getSecond();
    iP26.setSecond((java.lang.Integer)200);
    java.lang.Integer i33 = iP26.getThird();
    java.lang.Integer i34 = iP26.getSecond();
    java.lang.Integer i35 = iP26.getFourth();
    boolean b36 = strictlySortedSinglyLinkedList0.removeFromIP(iP26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i7 + "' != '" + (-1)+ "'", i7.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iPBan14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i27 + "' != '" + (-1)+ "'", i27.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i30 + "' != '" + (-1)+ "'", i30.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i33 + "' != '" + (-1)+ "'", i33.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i34 + "' != '" + 200+ "'", i34.equals(200));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i35 + "' != '" + 100+ "'", i35.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == false);

  }

  @Test
  public void test046() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test046"); }


    // The following exception was thrown during execution in test generation
    try {
      java.lang.Integer i1 = java.lang.Integer.valueOf("11101000000000000000000000011010");
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

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test047"); }


    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList0 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b1 = strictlySortedSinglyLinkedList0.repOK();
    strictlySortedSinglyLinkedList0.size = 1;
    strictlySortedSinglyLinkedList0.size = 0;
    tp2.IPBan iPBan6 = null;
    boolean b7 = strictlySortedSinglyLinkedList0.add(iPBan6);
    int i8 = strictlySortedSinglyLinkedList0.size;
    boolean b9 = strictlySortedSinglyLinkedList0.repOK();
    int i10 = strictlySortedSinglyLinkedList0.getSize();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 1);

  }

  @Test
  public void test048() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test048"); }


    int i1 = java.lang.Integer.numberOfTrailingZeros(31457280);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 21);

  }

  @Test
  public void test049() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test049"); }


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
    iP11.setSecond((java.lang.Integer)138);
    iP11.setSecond((java.lang.Integer)(-1979711488));
    java.lang.Integer i29 = iP11.getFourth();
    java.lang.Integer i30 = iP11.getFourth();
    java.lang.Integer i31 = iP11.getThird();
    java.lang.Integer i32 = iP11.getFourth();
    
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
    org.junit.Assert.assertTrue("'" + i29 + "' != '" + 51756250+ "'", i29.equals(51756250));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i30 + "' != '" + 51756250+ "'", i30.equals(51756250));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i31 + "' != '" + (-1)+ "'", i31.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i32 + "' != '" + 51756250+ "'", i32.equals(51756250));

  }

  @Test
  public void test050() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test050"); }


    // The following exception was thrown during execution in test generation
    try {
      int i2 = java.lang.Integer.parseUnsignedInt("5220000", 845116448);
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test051() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test051"); }


    // The following exception was thrown during execution in test generation
    try {
      int i2 = java.lang.Integer.parseUnsignedInt("", 136338516);
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test052() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test052"); }


    int i1 = java.lang.Integer.parseUnsignedInt("49");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 49);

  }

  @Test
  public void test053() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test053"); }


    int i2 = java.lang.Integer.divideUnsigned(29835670, 607552512);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);

  }

  @Test
  public void test054() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test054"); }


    int i1 = java.lang.Integer.reverse((-2140143691));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == (-1375734271));

  }

  @Test
  public void test055() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test055"); }


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
    tp2.IPBan iPBan22 = new tp2.IPBan(iP16, (java.lang.Long)10L);
    iPBan22.expires = 212600L;
    tp2.IP iP25 = iPBan22.ip;
    
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
    org.junit.Assert.assertNotNull(iP25);

  }

  @Test
  public void test056() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test056"); }


    // The following exception was thrown during execution in test generation
    try {
      int i2 = java.lang.Integer.parseUnsignedInt("d", 1499168774);
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

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test057"); }


    java.lang.Integer i2 = java.lang.Integer.getInteger("51756492", (java.lang.Integer)24905501);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i2 + "' != '" + 24905501+ "'", i2.equals(24905501));

  }

  @Test
  public void test058() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test058"); }


    // The following exception was thrown during execution in test generation
    try {
      java.lang.Integer i1 = java.lang.Integer.valueOf("1b581");
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

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test059"); }


    int i2 = java.lang.Integer.remainderUnsigned(2365353, 45562500);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 2365353);

  }

  @Test
  public void test060() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test060"); }


    int i1 = java.lang.Integer.parseInt("2147483647");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 2147483647);

  }

  @Test
  public void test061() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test061"); }


    // The following exception was thrown during execution in test generation
    try {
      int i2 = java.lang.Integer.parseUnsignedInt("8000000c", 24762592);
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

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test062"); }


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
    iP33.setFirst((java.lang.Integer)11001000);
    iP33.setFirst((java.lang.Integer)32);
    java.lang.Integer i39 = iP33.getFirst();
    boolean b40 = strictlySortedSinglyLinkedList0.containsIP(iP33);
    strictlySortedSinglyLinkedList0.size = 327045886;
    boolean b43 = strictlySortedSinglyLinkedList0.isEmpty();
    
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
    org.junit.Assert.assertTrue("'" + i39 + "' != '" + 32+ "'", i39.equals(32));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b43 == false);

  }

  @Test
  public void test063() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test063"); }


    // The following exception was thrown during execution in test generation
    try {
      int i2 = java.lang.Integer.parseInt("52a183c3", 2004194356);
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

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test064"); }


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
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList38 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b39 = strictlySortedSinglyLinkedList38.repOK();
    strictlySortedSinglyLinkedList38.size = 1;
    strictlySortedSinglyLinkedList38.size = 0;
    tp2.IP iP48 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP48.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan52 = new tp2.IPBan(iP48, (java.lang.Long)100L);
    tp2.IP iP53 = iPBan52.ip;
    boolean b54 = strictlySortedSinglyLinkedList38.contains(iPBan52);
    boolean b55 = strictlySortedSinglyLinkedList38.isEmpty();
    tp2.Node node56 = strictlySortedSinglyLinkedList38.header;
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList57 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b58 = strictlySortedSinglyLinkedList57.repOK();
    tp2.IP iP63 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i64 = iP63.getSecond();
    iP63.setFirst((java.lang.Integer)11001000);
    iP63.setFirst((java.lang.Integer)(-2147483648));
    boolean b69 = strictlySortedSinglyLinkedList57.removeFromIP(iP63);
    tp2.IPBan iPBan70 = null;
    boolean b71 = strictlySortedSinglyLinkedList57.add(iPBan70);
    tp2.Node node72 = strictlySortedSinglyLinkedList57.header;
    tp2.IPBan iPBan74 = strictlySortedSinglyLinkedList57.get(81);
    tp2.Node node75 = strictlySortedSinglyLinkedList57.header;
    strictlySortedSinglyLinkedList38.header = node75;
    int i77 = strictlySortedSinglyLinkedList38.getSize();
    boolean b78 = iP30.equals((java.lang.Object)strictlySortedSinglyLinkedList38);
    iP30.setFourth((java.lang.Integer)783194660);
    
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
    org.junit.Assert.assertTrue(b39 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b54 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b55 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b58 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i64 + "' != '" + (-1)+ "'", i64.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b69 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b71 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node72);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iPBan74);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node75);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i77 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b78 == false);

  }

  @Test
  public void test065() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test065"); }


    tp2.SinglyLinkedList singlyLinkedList0 = new tp2.SinglyLinkedList();
    int i1 = singlyLinkedList0.getSize();
    tp2.IP iP6 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i7 = iP6.getSecond();
    java.lang.Integer i8 = iP6.getFourth();
    singlyLinkedList0.add(iP6);
    tp2.IPBan iPBan11 = new tp2.IPBan(iP6, (java.lang.Long)100L);
    iPBan11.expires = 10L;
    tp2.IP iP14 = iPBan11.getIp();
    java.lang.Long long15 = iPBan11.getExpires();
    tp2.IP iP16 = iPBan11.getIp();
    
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
    org.junit.Assert.assertNotNull(iP16);

  }

  @Test
  public void test066() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test066"); }


    int i1 = java.lang.Integer.numberOfTrailingZeros(771957);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);

  }

  @Test
  public void test067() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test067"); }


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
    tp2.IP iP17 = null;
    boolean b18 = singlyLinkedList0.remove(iP17);
    boolean b19 = singlyLinkedList0.isEmpty();
    
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
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);

  }

  @Test
  public void test068() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test068"); }


    java.lang.Integer i1 = java.lang.Integer.getInteger("1100101");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);

  }

  @Test
  public void test069() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test069"); }


    tp2.SinglyLinkedList singlyLinkedList0 = new tp2.SinglyLinkedList();
    int i1 = singlyLinkedList0.getSize();
    boolean b2 = singlyLinkedList0.isEmpty();
    tp2.IP iP7 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP7.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan11 = new tp2.IPBan(iP7, (java.lang.Long)100L);
    tp2.IP iP12 = iPBan11.ip;
    iP12.setThird((java.lang.Integer)356246784);
    boolean b15 = singlyLinkedList0.remove(iP12);
    tp2.SinglyLinkedList singlyLinkedList16 = new tp2.SinglyLinkedList();
    boolean b17 = singlyLinkedList16.repOK();
    tp2.IP iP19 = singlyLinkedList16.get(256);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList20 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b21 = strictlySortedSinglyLinkedList20.repOK();
    tp2.IP iP26 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i27 = iP26.getSecond();
    iP26.setFirst((java.lang.Integer)11001000);
    iP26.setFirst((java.lang.Integer)(-2147483648));
    boolean b32 = strictlySortedSinglyLinkedList20.removeFromIP(iP26);
    java.lang.Integer i33 = iP26.getSecond();
    java.lang.Integer i34 = iP26.getFourth();
    iP26.setFourth((java.lang.Integer)64);
    iP26.setFirst((java.lang.Integer)(-671088640));
    tp2.IPBan iPBan40 = new tp2.IPBan(iP26, (java.lang.Long)29L);
    boolean b41 = singlyLinkedList16.contains(iP26);
    tp2.SinglyLinkedList singlyLinkedList42 = new tp2.SinglyLinkedList();
    int i43 = singlyLinkedList42.getSize();
    tp2.IP iP48 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i49 = iP48.getSecond();
    java.lang.Integer i50 = iP48.getFourth();
    singlyLinkedList42.add(iP48);
    tp2.IPBan iPBan53 = new tp2.IPBan(iP48, (java.lang.Long)100L);
    iPBan53.expires = 10L;
    tp2.IP iP56 = iPBan53.getIp();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList57 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b58 = strictlySortedSinglyLinkedList57.repOK();
    strictlySortedSinglyLinkedList57.size = 1;
    boolean b61 = strictlySortedSinglyLinkedList57.isEmpty();
    tp2.SinglyLinkedList singlyLinkedList62 = new tp2.SinglyLinkedList();
    int i63 = singlyLinkedList62.getSize();
    tp2.IP iP68 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i69 = iP68.getSecond();
    java.lang.Integer i70 = iP68.getFourth();
    singlyLinkedList62.add(iP68);
    boolean b73 = iP68.equals((java.lang.Object)2147483647);
    tp2.IPBan iPBan75 = new tp2.IPBan(iP68, (java.lang.Long)(-1L));
    java.lang.Long long76 = iPBan75.expires;
    boolean b77 = strictlySortedSinglyLinkedList57.contains(iPBan75);
    tp2.IP iP78 = iPBan75.ip;
    iP78.setFirst((java.lang.Integer)356246787);
    iPBan53.ip = iP78;
    tp2.IPBan iPBan83 = new tp2.IPBan(iP78, (java.lang.Long)101101010L);
    boolean b84 = singlyLinkedList16.contains(iP78);
    boolean b85 = singlyLinkedList0.contains(iP78);
    iP78.setFourth((java.lang.Integer)67174398);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i27 + "' != '" + (-1)+ "'", i27.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i33 + "' != '" + (-1)+ "'", i33.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i34 + "' != '" + 100+ "'", i34.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i43 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i49 + "' != '" + (-1)+ "'", i49.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i50 + "' != '" + 100+ "'", i50.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b58 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b61 == true);
    
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
    org.junit.Assert.assertTrue(b77 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP78);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b84 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b85 == false);

  }

  @Test
  public void test070() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test070"); }


    int i1 = java.lang.Integer.bitCount(11001001);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 14);

  }

  @Test
  public void test071() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test071"); }


    java.lang.Integer i2 = java.lang.Integer.getInteger("2617247672", (java.lang.Integer)(-2093455273));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i2 + "' != '" + (-2093455273)+ "'", i2.equals((-2093455273)));

  }

  @Test
  public void test072() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test072"); }


    java.lang.String str1 = java.lang.Integer.toUnsignedString(466);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "466"+ "'", str1.equals("466"));

  }

  @Test
  public void test073() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test073"); }


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
    iPBan41.setExpires((java.lang.Long)(-1L));
    java.lang.Long long73 = iPBan41.expires;
    tp2.IP iP74 = iPBan41.getIp();
    java.lang.Long long75 = iPBan41.expires;
    java.lang.Long long76 = iPBan41.expires;
    java.lang.Long long77 = iPBan41.expires;
    
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
    org.junit.Assert.assertTrue("'" + long73 + "' != '" + (-1L)+ "'", long73.equals((-1L)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP74);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long75 + "' != '" + (-1L)+ "'", long75.equals((-1L)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long76 + "' != '" + (-1L)+ "'", long76.equals((-1L)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long77 + "' != '" + (-1L)+ "'", long77.equals((-1L)));

  }

  @Test
  public void test074() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test074"); }


    int i2 = java.lang.Integer.rotateRight(2110423050, 1221394432);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 2110423050);

  }

  @Test
  public void test075() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test075"); }


    int i2 = java.lang.Integer.divideUnsigned(2115239506, 912479);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 2318);

  }

  @Test
  public void test076() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test076"); }


    int i1 = java.lang.Integer.bitCount((-1341508355));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 15);

  }

  @Test
  public void test077() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test077"); }


    java.lang.Integer i2 = java.lang.Integer.getInteger("f6740021", (java.lang.Integer)5373953);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i2 + "' != '" + 5373953+ "'", i2.equals(5373953));

  }

  @Test
  public void test078() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test078"); }


    // The following exception was thrown during execution in test generation
    try {
      int i2 = java.lang.Integer.parseUnsignedInt("1040000", 8298);
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

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test079"); }


    // The following exception was thrown during execution in test generation
    try {
      java.lang.Integer i2 = java.lang.Integer.valueOf("", (-224923493));
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

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test080"); }


    int i1 = java.lang.Integer.signum(533897138);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 1);

  }

  @Test
  public void test081() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test081"); }


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
    int i21 = singlyLinkedList0.getSize();
    int i22 = singlyLinkedList0.getSize();
    tp2.SinglyLinkedList singlyLinkedList23 = new tp2.SinglyLinkedList();
    boolean b24 = singlyLinkedList23.repOK();
    tp2.IP iP26 = singlyLinkedList23.get(200);
    boolean b27 = singlyLinkedList23.isEmpty();
    tp2.IP iP32 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i33 = iP32.getThird();
    boolean b34 = singlyLinkedList23.remove(iP32);
    tp2.IP iP39 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP39.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan43 = new tp2.IPBan(iP39, (java.lang.Long)100L);
    tp2.IP iP44 = iPBan43.ip;
    tp2.IP iP45 = iPBan43.getIp();
    java.lang.Integer i46 = null;
    iP45.setFirst(i46);
    boolean b48 = singlyLinkedList23.contains(iP45);
    int i49 = singlyLinkedList23.getSize();
    boolean b50 = singlyLinkedList23.isEmpty();
    tp2.IP iP55 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP55.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan59 = new tp2.IPBan(iP55, (java.lang.Long)100L);
    tp2.IP iP64 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP64.setFirst((java.lang.Integer)200);
    java.lang.Integer i67 = iP64.getFourth();
    iPBan59.setIp(iP64);
    iPBan59.setExpires((java.lang.Long)2147483648L);
    tp2.IP iP71 = iPBan59.getIp();
    boolean b72 = singlyLinkedList23.contains(iP71);
    boolean b73 = singlyLinkedList0.contains(iP71);
    int i74 = singlyLinkedList0.getSize();
    
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
    org.junit.Assert.assertTrue(i21 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i33 + "' != '" + (-1)+ "'", i33.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b48 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i49 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b50 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i67 + "' != '" + 100+ "'", i67.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP71);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b72 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b73 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i74 == 1);

  }

  @Test
  public void test082() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test082"); }


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
    boolean b51 = singlyLinkedList0.isEmpty();
    boolean b52 = singlyLinkedList0.repOK();
    boolean b53 = singlyLinkedList0.isEmpty();
    
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
    org.junit.Assert.assertTrue(b51 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b52 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b53 == false);

  }

  @Test
  public void test083() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test083"); }


    java.lang.Integer i1 = java.lang.Integer.valueOf("1078352608");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 1078352608+ "'", i1.equals(1078352608));

  }

  @Test
  public void test084() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test084"); }


    // The following exception was thrown during execution in test generation
    try {
      int i1 = java.lang.Integer.parseInt("11c93000");
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

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test085"); }


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
    boolean b80 = strictlySortedSinglyLinkedList0.isEmpty();
    
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
    org.junit.Assert.assertTrue(b80 == false);

  }

  @Test
  public void test086() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test086"); }


    java.lang.String str1 = java.lang.Integer.toUnsignedString(199748017);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "199748017"+ "'", str1.equals("199748017"));

  }

  @Test
  public void test087() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test087"); }


    int i1 = java.lang.Integer.numberOfLeadingZeros(37612);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 16);

  }

  @Test
  public void test088() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test088"); }


    tp2.SinglyLinkedList singlyLinkedList0 = new tp2.SinglyLinkedList();
    int i1 = singlyLinkedList0.getSize();
    tp2.IP iP6 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i7 = iP6.getSecond();
    iP6.setFirst((java.lang.Integer)11001000);
    iP6.setFirst((java.lang.Integer)32);
    boolean b12 = singlyLinkedList0.remove(iP6);
    java.lang.Integer i13 = iP6.getFirst();
    iP6.setSecond((java.lang.Integer)1073741824);
    java.lang.Integer i16 = iP6.getFirst();
    java.lang.Integer i17 = iP6.getSecond();
    java.lang.Integer i18 = iP6.getThird();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i7 + "' != '" + (-1)+ "'", i7.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i13 + "' != '" + 32+ "'", i13.equals(32));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i16 + "' != '" + 32+ "'", i16.equals(32));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i17 + "' != '" + 1073741824+ "'", i17.equals(1073741824));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i18 + "' != '" + (-1)+ "'", i18.equals((-1)));

  }

  @Test
  public void test089() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test089"); }


    int i2 = java.lang.Integer.rotateLeft(11710, 150995005);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == (-1073740361));

  }

  @Test
  public void test090() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test090"); }


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
    boolean b26 = strictlySortedSinglyLinkedList0.isEmpty();
    tp2.IP iP31 = new tp2.IP((java.lang.Integer)356246784, (java.lang.Integer)13, (java.lang.Integer)0, (java.lang.Integer)37469776);
    java.lang.Integer i32 = iP31.getFirst();
    boolean b33 = strictlySortedSinglyLinkedList0.containsIP(iP31);
    strictlySortedSinglyLinkedList0.size = 1024;
    int i36 = strictlySortedSinglyLinkedList0.size;
    boolean b37 = strictlySortedSinglyLinkedList0.repOK();
    tp2.IPBan iPBan39 = strictlySortedSinglyLinkedList0.get(1377086084);
    boolean b40 = strictlySortedSinglyLinkedList0.repOK();
    
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
    org.junit.Assert.assertTrue(b26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i32 + "' != '" + 356246784+ "'", i32.equals(356246784));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 1024);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iPBan39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == false);

  }

  @Test
  public void test091() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test091"); }


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
    boolean b26 = strictlySortedSinglyLinkedList0.isEmpty();
    tp2.IP iP31 = new tp2.IP((java.lang.Integer)356246784, (java.lang.Integer)13, (java.lang.Integer)0, (java.lang.Integer)37469776);
    java.lang.Integer i32 = iP31.getFirst();
    boolean b33 = strictlySortedSinglyLinkedList0.containsIP(iP31);
    int i34 = strictlySortedSinglyLinkedList0.getSize();
    int i35 = strictlySortedSinglyLinkedList0.getSize();
    
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
    org.junit.Assert.assertTrue(b26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i32 + "' != '" + 356246784+ "'", i32.equals(356246784));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i34 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i35 == 0);

  }

  @Test
  public void test092() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test092"); }


    java.lang.Integer i1 = java.lang.Integer.valueOf(73786134);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 73786134+ "'", i1.equals(73786134));

  }

  @Test
  public void test093() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test093"); }


    int i2 = java.lang.Integer.compareUnsigned((-939065343), 1300000000);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);

  }

  @Test
  public void test094() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test094"); }


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
    java.lang.Integer i34 = iP21.getFirst();
    java.lang.Integer i35 = iP21.getSecond();
    java.lang.Integer i36 = iP21.getThird();
    java.lang.Integer i37 = iP21.getFourth();
    
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
    org.junit.Assert.assertTrue("'" + i34 + "' != '" + (-1)+ "'", i34.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i35 + "' != '" + 20+ "'", i35.equals(20));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i36 + "' != '" + (-1)+ "'", i36.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i37 + "' != '" + 167772160+ "'", i37.equals(167772160));

  }

  @Test
  public void test095() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test095"); }


    // The following exception was thrown during execution in test generation
    try {
      java.lang.Integer i1 = java.lang.Integer.decode("153be503");
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

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test096"); }


    tp2.IP iP4 = new tp2.IP((java.lang.Integer)607552512, (java.lang.Integer)(-1151135485), (java.lang.Integer)(-449112832), (java.lang.Integer)(-277841761));

  }

  @Test
  public void test097() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test097"); }


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
    tp2.IPBan iPBan42 = new tp2.IPBan(iP40, (java.lang.Long)32L);
    tp2.IP iP43 = iPBan42.ip;
    iPBan42.expires = 2273280L;
    tp2.IP iP46 = iPBan42.getIp();
    iPBan42.expires = 2939328L;
    java.lang.Long long49 = iPBan42.expires;
    
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
    org.junit.Assert.assertNotNull(iP43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long49 + "' != '" + 2939328L+ "'", long49.equals(2939328L));

  }

  @Test
  public void test098() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test098"); }


    java.lang.Integer i1 = java.lang.Integer.valueOf(46405488);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 46405488+ "'", i1.equals(46405488));

  }

  @Test
  public void test099() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test099"); }


    tp2.IP iP4 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i5 = iP4.getSecond();
    iP4.setFirst((java.lang.Integer)11001000);
    java.lang.Long long8 = null;
    tp2.IPBan iPBan9 = new tp2.IPBan(iP4, long8);
    tp2.IP iP10 = iPBan9.ip;
    tp2.IP iP11 = iPBan9.ip;
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList12 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b13 = strictlySortedSinglyLinkedList12.isEmpty();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList14 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b15 = strictlySortedSinglyLinkedList14.repOK();
    tp2.IP iP20 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    boolean b21 = strictlySortedSinglyLinkedList14.containsIP(iP20);
    tp2.Node node22 = strictlySortedSinglyLinkedList14.header;
    strictlySortedSinglyLinkedList12.header = node22;
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList24 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b25 = strictlySortedSinglyLinkedList24.repOK();
    strictlySortedSinglyLinkedList24.size = 1;
    strictlySortedSinglyLinkedList24.size = 0;
    tp2.IP iP34 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP34.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan38 = new tp2.IPBan(iP34, (java.lang.Long)100L);
    tp2.IP iP43 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP43.setFirst((java.lang.Integer)200);
    java.lang.Integer i46 = iP43.getFourth();
    iPBan38.setIp(iP43);
    boolean b48 = strictlySortedSinglyLinkedList24.contains(iPBan38);
    boolean b49 = strictlySortedSinglyLinkedList12.contains(iPBan38);
    tp2.IP iP50 = iPBan38.ip;
    boolean b52 = iP50.equals((java.lang.Object)117440640);
    iPBan9.setIp(iP50);
    java.lang.Integer i54 = iP50.getThird();
    java.lang.Integer i55 = iP50.getThird();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i5 + "' != '" + (-1)+ "'", i5.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i46 + "' != '" + 100+ "'", i46.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b48 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b49 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b52 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i54 + "' != '" + (-1)+ "'", i54.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i55 + "' != '" + (-1)+ "'", i55.equals((-1)));

  }

  @Test
  public void test100() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test100"); }


    tp2.SinglyLinkedList singlyLinkedList0 = new tp2.SinglyLinkedList();
    int i1 = singlyLinkedList0.getSize();
    boolean b2 = singlyLinkedList0.isEmpty();
    tp2.IP iP7 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP7.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan11 = new tp2.IPBan(iP7, (java.lang.Long)100L);
    tp2.IP iP12 = iPBan11.ip;
    iP12.setThird((java.lang.Integer)356246784);
    boolean b15 = singlyLinkedList0.remove(iP12);
    tp2.SinglyLinkedList singlyLinkedList16 = new tp2.SinglyLinkedList();
    int i17 = singlyLinkedList16.getSize();
    tp2.IP iP22 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i23 = iP22.getSecond();
    java.lang.Integer i24 = iP22.getFourth();
    singlyLinkedList16.add(iP22);
    tp2.IP iP27 = singlyLinkedList16.get(5);
    boolean b28 = singlyLinkedList16.repOK();
    tp2.IP iP30 = singlyLinkedList16.get(2013265920);
    tp2.SinglyLinkedList singlyLinkedList31 = new tp2.SinglyLinkedList();
    int i32 = singlyLinkedList31.getSize();
    tp2.IP iP37 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i38 = iP37.getSecond();
    java.lang.Integer i39 = iP37.getFourth();
    singlyLinkedList31.add(iP37);
    iP37.setFourth((java.lang.Integer)167772160);
    singlyLinkedList16.add(iP37);
    java.lang.Object obj44 = null;
    boolean b45 = iP37.equals(obj44);
    iP37.setSecond((java.lang.Integer)20);
    tp2.IPBan iPBan49 = new tp2.IPBan(iP37, (java.lang.Long)20L);
    singlyLinkedList0.add(iP37);
    boolean b51 = singlyLinkedList0.repOK();
    tp2.IP iP53 = singlyLinkedList0.get(1565524443);
    int i54 = singlyLinkedList0.getSize();
    boolean b55 = singlyLinkedList0.repOK();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
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
    org.junit.Assert.assertTrue(i32 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i38 + "' != '" + (-1)+ "'", i38.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i39 + "' != '" + 100+ "'", i39.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b51 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i54 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b55 == true);

  }

  @Test
  public void test101() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test101"); }


    int i2 = java.lang.Integer.min(2582468, 3601);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 3601);

  }

  @Test
  public void test102() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test102"); }


    int i2 = java.lang.Integer.remainderUnsigned(24576, (-939818353));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 24576);

  }

  @Test
  public void test103() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test103"); }


    tp2.IP iP4 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP4.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan8 = new tp2.IPBan(iP4, (java.lang.Long)100L);
    tp2.IP iP13 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iPBan8.setIp(iP13);
    iPBan8.setExpires((java.lang.Long)1L);
    iPBan8.setExpires((java.lang.Long)2013265920L);
    tp2.IP iP19 = iPBan8.ip;
    tp2.IP iP20 = iPBan8.getIp();
    java.lang.Long long21 = iPBan8.expires;
    tp2.SinglyLinkedList singlyLinkedList22 = new tp2.SinglyLinkedList();
    int i23 = singlyLinkedList22.getSize();
    tp2.IP iP28 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i29 = iP28.getSecond();
    java.lang.Integer i30 = iP28.getFourth();
    singlyLinkedList22.add(iP28);
    tp2.IPBan iPBan33 = new tp2.IPBan(iP28, (java.lang.Long)100L);
    tp2.IP iP34 = iPBan33.getIp();
    tp2.IP iP35 = iPBan33.ip;
    tp2.SinglyLinkedList singlyLinkedList36 = new tp2.SinglyLinkedList();
    int i37 = singlyLinkedList36.getSize();
    tp2.IP iP42 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i43 = iP42.getSecond();
    java.lang.Integer i44 = iP42.getFourth();
    singlyLinkedList36.add(iP42);
    boolean b47 = iP42.equals((java.lang.Object)2147483647);
    tp2.IPBan iPBan49 = new tp2.IPBan(iP42, (java.lang.Long)(-1L));
    java.lang.Long long50 = iPBan49.expires;
    tp2.IP iP55 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP55.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan59 = new tp2.IPBan(iP55, (java.lang.Long)100L);
    tp2.IP iP60 = iPBan59.ip;
    iP60.setThird((java.lang.Integer)356246784);
    iPBan49.ip = iP60;
    java.lang.Integer i64 = iP60.getFirst();
    iP60.setFirst((java.lang.Integer)24);
    iPBan33.ip = iP60;
    tp2.IPBan iPBan69 = new tp2.IPBan(iP60, (java.lang.Long)3355443200L);
    java.lang.Integer i70 = iP60.getFourth();
    iPBan8.setIp(iP60);
    iPBan8.setExpires((java.lang.Long)28673L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long21 + "' != '" + 2013265920L+ "'", long21.equals(2013265920L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i29 + "' != '" + (-1)+ "'", i29.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i30 + "' != '" + 100+ "'", i30.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i37 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i43 + "' != '" + (-1)+ "'", i43.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i44 + "' != '" + 100+ "'", i44.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b47 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long50 + "' != '" + (-1L)+ "'", long50.equals((-1L)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP60);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i64 + "' != '" + 200+ "'", i64.equals(200));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i70 + "' != '" + 100+ "'", i70.equals(100));

  }

  @Test
  public void test104() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test104"); }


    int i2 = java.lang.Integer.compareUnsigned(2928, 464922);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == (-1));

  }

  @Test
  public void test105() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test105"); }


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
    iP40.setSecond((java.lang.Integer)33554560);
    
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

  }

  @Test
  public void test106() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test106"); }


    int i2 = java.lang.Integer.max(1325666655, 155811880);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1325666655);

  }

  @Test
  public void test107() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test107"); }


    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList0 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b1 = strictlySortedSinglyLinkedList0.isEmpty();
    int i2 = strictlySortedSinglyLinkedList0.getSize();
    strictlySortedSinglyLinkedList0.size = 28;
    tp2.IPBan iPBan6 = strictlySortedSinglyLinkedList0.get(256);
    boolean b7 = strictlySortedSinglyLinkedList0.isEmpty();
    tp2.IPBan iPBan9 = strictlySortedSinglyLinkedList0.get(111);
    tp2.IPBan iPBan11 = strictlySortedSinglyLinkedList0.get(0);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList12 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b13 = strictlySortedSinglyLinkedList12.repOK();
    strictlySortedSinglyLinkedList12.size = 1;
    strictlySortedSinglyLinkedList12.size = 0;
    tp2.IP iP22 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP22.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan26 = new tp2.IPBan(iP22, (java.lang.Long)100L);
    tp2.IP iP27 = iPBan26.ip;
    boolean b28 = strictlySortedSinglyLinkedList12.contains(iPBan26);
    boolean b29 = strictlySortedSinglyLinkedList12.repOK();
    tp2.SinglyLinkedList singlyLinkedList30 = new tp2.SinglyLinkedList();
    int i31 = singlyLinkedList30.getSize();
    tp2.IP iP36 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i37 = iP36.getSecond();
    java.lang.Integer i38 = iP36.getFourth();
    singlyLinkedList30.add(iP36);
    boolean b41 = iP36.equals((java.lang.Object)2147483647);
    tp2.IPBan iPBan43 = new tp2.IPBan(iP36, (java.lang.Long)(-1L));
    boolean b44 = strictlySortedSinglyLinkedList12.add(iPBan43);
    tp2.SinglyLinkedList singlyLinkedList45 = new tp2.SinglyLinkedList();
    int i46 = singlyLinkedList45.getSize();
    tp2.IP iP51 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i52 = iP51.getSecond();
    java.lang.Integer i53 = iP51.getFourth();
    singlyLinkedList45.add(iP51);
    tp2.IPBan iPBan56 = new tp2.IPBan(iP51, (java.lang.Long)1L);
    boolean b57 = strictlySortedSinglyLinkedList12.containsIP(iP51);
    int i58 = strictlySortedSinglyLinkedList12.getSize();
    int i59 = strictlySortedSinglyLinkedList12.getSize();
    int i60 = strictlySortedSinglyLinkedList12.getSize();
    tp2.IPBan iPBan62 = strictlySortedSinglyLinkedList12.get(32768);
    tp2.Node node63 = strictlySortedSinglyLinkedList12.header;
    tp2.Node node64 = strictlySortedSinglyLinkedList12.header;
    strictlySortedSinglyLinkedList0.header = node64;
    boolean b66 = strictlySortedSinglyLinkedList0.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iPBan6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iPBan9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iPBan11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);
    
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
    org.junit.Assert.assertTrue(b44 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i46 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i52 + "' != '" + (-1)+ "'", i52.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i53 + "' != '" + 100+ "'", i53.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b57 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i58 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i59 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i60 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iPBan62);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node63);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node64);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b66 == false);

  }

  @Test
  public void test108() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test108"); }


    int i1 = java.lang.Integer.signum(1169);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 1);

  }

  @Test
  public void test109() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test109"); }


    tp2.SinglyLinkedList singlyLinkedList0 = new tp2.SinglyLinkedList();
    int i1 = singlyLinkedList0.getSize();
    tp2.IP iP6 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i7 = iP6.getSecond();
    iP6.setFirst((java.lang.Integer)11001000);
    iP6.setFirst((java.lang.Integer)32);
    boolean b12 = singlyLinkedList0.remove(iP6);
    tp2.IP iP14 = singlyLinkedList0.get((-671088640));
    boolean b15 = singlyLinkedList0.repOK();
    tp2.IP iP17 = singlyLinkedList0.get(187783298);
    tp2.IP iP19 = singlyLinkedList0.get(0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i7 + "' != '" + (-1)+ "'", i7.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP19);

  }

  @Test
  public void test110() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test110"); }


    int i2 = java.lang.Integer.rotateLeft(71942144, 1647316988);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 4496384);

  }

  @Test
  public void test111() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test111"); }


    int i2 = java.lang.Integer.remainderUnsigned(29413279, 37469776);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 29413279);

  }

  @Test
  public void test112() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test112"); }


    int i1 = java.lang.Integer.numberOfTrailingZeros(58837);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);

  }

  @Test
  public void test113() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test113"); }


    java.lang.Integer i1 = java.lang.Integer.decode("224");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 224+ "'", i1.equals(224));

  }

  @Test
  public void test114() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test114"); }


    java.lang.String str1 = java.lang.Integer.toHexString(65395583);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "3e5db7f"+ "'", str1.equals("3e5db7f"));

  }

  @Test
  public void test115() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test115"); }


    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList0 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b1 = strictlySortedSinglyLinkedList0.repOK();
    tp2.IP iP6 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    boolean b7 = strictlySortedSinglyLinkedList0.containsIP(iP6);
    tp2.Node node8 = strictlySortedSinglyLinkedList0.header;
    strictlySortedSinglyLinkedList0.size = 37469776;
    int i11 = strictlySortedSinglyLinkedList0.size;
    tp2.IPBan iPBan13 = strictlySortedSinglyLinkedList0.get(40000000);
    boolean b14 = strictlySortedSinglyLinkedList0.isEmpty();
    boolean b15 = strictlySortedSinglyLinkedList0.repOK();
    tp2.Node node16 = strictlySortedSinglyLinkedList0.header;
    
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
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node16);

  }

  @Test
  public void test116() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test116"); }


    // The following exception was thrown during execution in test generation
    try {
      int i2 = java.lang.Integer.parseUnsignedInt("", 184549376);
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

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test117"); }


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
    boolean b60 = strictlySortedSinglyLinkedList0.repOK();
    tp2.IPBan iPBan62 = strictlySortedSinglyLinkedList0.get(1792016);
    tp2.Node node63 = strictlySortedSinglyLinkedList0.header;
    
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
    org.junit.Assert.assertTrue(b60 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iPBan62);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node63);

  }

  @Test
  public void test118() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test118"); }


    int i1 = java.lang.Integer.signum(4784128);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 1);

  }

  @Test
  public void test119() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test119"); }


    java.lang.String str1 = java.lang.Integer.toHexString((-536856291));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "e000391d"+ "'", str1.equals("e000391d"));

  }

  @Test
  public void test120() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test120"); }


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
    tp2.IP iP21 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP21.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan25 = new tp2.IPBan(iP21, (java.lang.Long)100L);
    tp2.IP iP26 = iPBan25.ip;
    tp2.IP iP31 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP31.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan35 = new tp2.IPBan(iP31, (java.lang.Long)100L);
    iPBan25.setIp(iP31);
    iP31.setFourth((java.lang.Integer)44004000);
    boolean b39 = strictlySortedSinglyLinkedList0.removeFromIP(iP31);
    tp2.IP iP44 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i45 = iP44.getSecond();
    java.lang.Integer i46 = iP44.getFourth();
    iP44.setFirst((java.lang.Integer)5);
    tp2.IPBan iPBan50 = new tp2.IPBan(iP44, (java.lang.Long)0L);
    iPBan50.expires = 2147483648L;
    tp2.IP iP53 = iPBan50.ip;
    boolean b54 = strictlySortedSinglyLinkedList0.contains(iPBan50);
    int i55 = strictlySortedSinglyLinkedList0.getSize();
    boolean b56 = strictlySortedSinglyLinkedList0.isEmpty();
    int i57 = strictlySortedSinglyLinkedList0.getSize();
    
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
    org.junit.Assert.assertNotNull(iP26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i45 + "' != '" + (-1)+ "'", i45.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i46 + "' != '" + 100+ "'", i46.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b54 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i55 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b56 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i57 == 0);

  }

  @Test
  public void test121() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test121"); }


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
    iPBan8.expires = 1L;
    java.lang.Long long28 = iPBan8.expires;
    tp2.SinglyLinkedList singlyLinkedList29 = new tp2.SinglyLinkedList();
    int i30 = singlyLinkedList29.getSize();
    tp2.IP iP35 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i36 = iP35.getSecond();
    java.lang.Integer i37 = iP35.getFourth();
    singlyLinkedList29.add(iP35);
    iP35.setFourth((java.lang.Integer)167772160);
    iP35.setSecond((java.lang.Integer)0);
    iP35.setThird((java.lang.Integer)30);
    iP35.setFourth((java.lang.Integer)637534208);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList47 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b48 = strictlySortedSinglyLinkedList47.repOK();
    tp2.IP iP53 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    boolean b54 = strictlySortedSinglyLinkedList47.containsIP(iP53);
    tp2.IPBan iPBan56 = strictlySortedSinglyLinkedList47.get(160);
    tp2.IPBan iPBan57 = null;
    boolean b58 = strictlySortedSinglyLinkedList47.contains(iPBan57);
    boolean b59 = strictlySortedSinglyLinkedList47.repOK();
    int i60 = strictlySortedSinglyLinkedList47.size;
    boolean b61 = iP35.equals((java.lang.Object)strictlySortedSinglyLinkedList47);
    iPBan8.ip = iP35;
    java.lang.Long long63 = iPBan8.getExpires();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i16 + "' != '" + 100+ "'", i16.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long18 + "' != '" + 100L+ "'", long18.equals(100L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long28 + "' != '" + 1L+ "'", long28.equals(1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i36 + "' != '" + (-1)+ "'", i36.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i37 + "' != '" + 100+ "'", i37.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b48 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b54 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iPBan56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b58 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b59 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i60 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b61 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long63 + "' != '" + 1L+ "'", long63.equals(1L));

  }

  @Test
  public void test122() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test122"); }


    java.lang.String str1 = java.lang.Integer.toHexString(400);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "190"+ "'", str1.equals("190"));

  }

  @Test
  public void test123() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test123"); }


    int i2 = java.lang.Integer.min(4017, 21444067);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 4017);

  }

  @Test
  public void test124() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test124"); }


    int i2 = java.lang.Integer.compareUnsigned(1002502148, 28672);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);

  }

  @Test
  public void test125() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test125"); }


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
    boolean b26 = strictlySortedSinglyLinkedList0.isEmpty();
    tp2.IP iP31 = new tp2.IP((java.lang.Integer)356246784, (java.lang.Integer)13, (java.lang.Integer)0, (java.lang.Integer)37469776);
    java.lang.Integer i32 = iP31.getFirst();
    boolean b33 = strictlySortedSinglyLinkedList0.containsIP(iP31);
    strictlySortedSinglyLinkedList0.size = 1024;
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList36 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b37 = strictlySortedSinglyLinkedList36.repOK();
    boolean b38 = strictlySortedSinglyLinkedList36.repOK();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList39 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b40 = strictlySortedSinglyLinkedList39.repOK();
    strictlySortedSinglyLinkedList39.size = 1;
    strictlySortedSinglyLinkedList39.size = 0;
    tp2.IP iP49 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP49.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan53 = new tp2.IPBan(iP49, (java.lang.Long)100L);
    tp2.IP iP54 = iPBan53.ip;
    boolean b55 = strictlySortedSinglyLinkedList39.contains(iPBan53);
    tp2.IP iP60 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i61 = iP60.getSecond();
    iP60.setFirst((java.lang.Integer)11001000);
    java.lang.Long long64 = null;
    tp2.IPBan iPBan65 = new tp2.IPBan(iP60, long64);
    java.lang.Long long66 = iPBan65.getExpires();
    boolean b67 = strictlySortedSinglyLinkedList39.contains(iPBan65);
    boolean b68 = strictlySortedSinglyLinkedList36.add(iPBan65);
    boolean b69 = strictlySortedSinglyLinkedList0.contains(iPBan65);
    tp2.IPBan iPBan71 = strictlySortedSinglyLinkedList0.get(26676);
    
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
    org.junit.Assert.assertTrue(b26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i32 + "' != '" + 356246784+ "'", i32.equals(356246784));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b55 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i61 + "' != '" + (-1)+ "'", i61.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(long66);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b67 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b68 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b69 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iPBan71);

  }

  @Test
  public void test126() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test126"); }


    // The following exception was thrown during execution in test generation
    try {
      int i2 = java.lang.Integer.remainderUnsigned(562946, 0);
      org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException");
    } catch (java.lang.ArithmeticException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArithmeticException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test127() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test127"); }


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
    tp2.IP iP75 = iPBan41.ip;
    iPBan41.expires = 65000000L;
    
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
    org.junit.Assert.assertNotNull(iP75);

  }

  @Test
  public void test128() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test128"); }


    int i1 = java.lang.Integer.lowestOneBit(1778647040);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 262144);

  }

  @Test
  public void test129() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test129"); }


    tp2.IP iP0 = null;
    tp2.IPBan iPBan2 = new tp2.IPBan(iP0, (java.lang.Long)175L);
    tp2.IP iP7 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP7.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan11 = new tp2.IPBan(iP7, (java.lang.Long)100L);
    tp2.IP iP16 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i17 = iP16.getSecond();
    java.lang.Integer i18 = iP16.getFourth();
    iP16.setFirst((java.lang.Integer)5);
    iPBan11.ip = iP16;
    java.lang.Long long22 = iPBan11.getExpires();
    iPBan11.expires = 2147483648L;
    tp2.IP iP29 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP29.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan33 = new tp2.IPBan(iP29, (java.lang.Long)100L);
    tp2.IP iP34 = iPBan33.ip;
    tp2.SinglyLinkedList singlyLinkedList35 = new tp2.SinglyLinkedList();
    int i36 = singlyLinkedList35.getSize();
    tp2.IP iP41 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i42 = iP41.getSecond();
    java.lang.Integer i43 = iP41.getFourth();
    singlyLinkedList35.add(iP41);
    boolean b45 = iP34.equals((java.lang.Object)iP41);
    iPBan11.ip = iP41;
    iPBan2.setIp(iP41);
    iP41.setFirst((java.lang.Integer)301989921);
    java.lang.Integer i50 = iP41.getFourth();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i17 + "' != '" + (-1)+ "'", i17.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i18 + "' != '" + 100+ "'", i18.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long22 + "' != '" + 100L+ "'", long22.equals(100L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i42 + "' != '" + (-1)+ "'", i42.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i43 + "' != '" + 100+ "'", i43.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i50 + "' != '" + 100+ "'", i50.equals(100));

  }

  @Test
  public void test130() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test130"); }


    int i2 = java.lang.Integer.rotateLeft(60704, 6294016);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 60704);

  }

  @Test
  public void test131() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test131"); }


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
    boolean b46 = strictlySortedSinglyLinkedList0.repOK();
    tp2.SinglyLinkedList singlyLinkedList47 = new tp2.SinglyLinkedList();
    int i48 = singlyLinkedList47.getSize();
    tp2.IP iP53 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i54 = iP53.getSecond();
    java.lang.Integer i55 = iP53.getFourth();
    singlyLinkedList47.add(iP53);
    tp2.IPBan iPBan58 = new tp2.IPBan(iP53, (java.lang.Long)100L);
    java.lang.Long long59 = iPBan58.getExpires();
    java.lang.Long long60 = iPBan58.getExpires();
    boolean b61 = strictlySortedSinglyLinkedList0.add(iPBan58);
    tp2.IP iP66 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP66.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan70 = new tp2.IPBan(iP66, (java.lang.Long)100L);
    tp2.IP iP75 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP75.setFirst((java.lang.Integer)200);
    java.lang.Integer i78 = iP75.getFourth();
    iPBan70.setIp(iP75);
    java.lang.Long long80 = iPBan70.expires;
    iPBan70.expires = (-1L);
    iPBan70.setExpires((java.lang.Long)100L);
    iPBan70.expires = 10L;
    tp2.IP iP87 = iPBan70.getIp();
    iPBan70.expires = 1L;
    iPBan70.expires = 4L;
    boolean b92 = strictlySortedSinglyLinkedList0.add(iPBan70);
    tp2.IP iP93 = iPBan70.getIp();
    
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
    org.junit.Assert.assertTrue(b46 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i48 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i54 + "' != '" + (-1)+ "'", i54.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i55 + "' != '" + 100+ "'", i55.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long59 + "' != '" + 100L+ "'", long59.equals(100L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long60 + "' != '" + 100L+ "'", long60.equals(100L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b61 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i78 + "' != '" + 100+ "'", i78.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long80 + "' != '" + 100L+ "'", long80.equals(100L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP87);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b92 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP93);

  }

  @Test
  public void test132() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test132"); }


    // The following exception was thrown during execution in test generation
    try {
      java.lang.Integer i2 = java.lang.Integer.valueOf("969408512", (-939065343));
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

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test133"); }


    int i2 = java.lang.Integer.max(317, 21836);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 21836);

  }

  @Test
  public void test134() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test134"); }


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
    tp2.Node node16 = strictlySortedSinglyLinkedList0.header;
    
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
    org.junit.Assert.assertNotNull(node16);

  }

  @Test
  public void test135() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test135"); }


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
    boolean b19 = singlyLinkedList0.repOK();
    int i20 = singlyLinkedList0.getSize();
    tp2.IP iP22 = singlyLinkedList0.get(0);
    boolean b23 = singlyLinkedList0.isEmpty();
    int i24 = singlyLinkedList0.getSize();
    tp2.IP iP29 = new tp2.IP((java.lang.Integer)(-715693564), (java.lang.Integer)1335351, (java.lang.Integer)649907, (java.lang.Integer)(-1073741822));
    boolean b30 = singlyLinkedList0.remove(iP29);
    boolean b31 = singlyLinkedList0.isEmpty();
    boolean b32 = singlyLinkedList0.repOK();
    
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
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == true);

  }

  @Test
  public void test136() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test136"); }


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
    int i31 = singlyLinkedList0.getSize();
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
    tp2.IP iP54 = singlyLinkedList32.get(0);
    tp2.IP iP59 = new tp2.IP((java.lang.Integer)15204352, (java.lang.Integer)1, (java.lang.Integer)15204352, (java.lang.Integer)356246787);
    tp2.SinglyLinkedList singlyLinkedList60 = new tp2.SinglyLinkedList();
    int i61 = singlyLinkedList60.getSize();
    int i62 = singlyLinkedList60.getSize();
    boolean b63 = iP59.equals((java.lang.Object)singlyLinkedList60);
    boolean b64 = singlyLinkedList32.remove(iP59);
    java.lang.Integer i65 = iP59.getSecond();
    boolean b66 = singlyLinkedList0.remove(iP59);
    tp2.IP iP68 = singlyLinkedList0.get(1130);
    
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
    org.junit.Assert.assertTrue(i31 == 0);
    
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
    org.junit.Assert.assertNull(iP54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i61 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i62 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b63 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b64 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i65 + "' != '" + 1+ "'", i65.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b66 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP68);

  }

  @Test
  public void test137() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test137"); }


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
    iPBan8.setExpires((java.lang.Long)10000100L);
    iPBan8.expires = 1123418368L;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i14 + "' != '" + (-1)+ "'", i14.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i15 + "' != '" + 100+ "'", i15.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long19 + "' != '" + 100L+ "'", long19.equals(100L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long26 + "' != '" + 175L+ "'", long26.equals(175L));

  }

  @Test
  public void test138() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test138"); }


    tp2.IP iP4 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i5 = iP4.getSecond();
    java.lang.Integer i6 = iP4.getFourth();
    iP4.setFirst((java.lang.Integer)5);
    tp2.IPBan iPBan10 = new tp2.IPBan(iP4, (java.lang.Long)0L);
    iPBan10.expires = 2147483648L;
    tp2.IP iP13 = iPBan10.ip;
    iPBan10.expires = 2147483665L;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i5 + "' != '" + (-1)+ "'", i5.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i6 + "' != '" + 100+ "'", i6.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP13);

  }

  @Test
  public void test139() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test139"); }


    // The following exception was thrown during execution in test generation
    try {
      int i2 = java.lang.Integer.parseUnsignedInt("4e557e66", 60);
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

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test140"); }


    java.lang.Integer i2 = java.lang.Integer.getInteger("28", (java.lang.Integer)(-519690240));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i2 + "' != '" + (-519690240)+ "'", i2.equals((-519690240)));

  }

  @Test
  public void test141() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test141"); }


    int i2 = java.lang.Integer.compare(83886256, 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);

  }

  @Test
  public void test142() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test142"); }


    java.lang.String str2 = java.lang.Integer.toUnsignedString((-1711276032), (-267681120));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "2583691264"+ "'", str2.equals("2583691264"));

  }

  @Test
  public void test143() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test143"); }


    int i1 = java.lang.Integer.parseInt("11634");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 11634);

  }

  @Test
  public void test144() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test144"); }


    int i2 = java.lang.Integer.rotateLeft(0, 2000);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);

  }

  @Test
  public void test145() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test145"); }


    int i2 = java.lang.Integer.min(1547265877, 121600);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 121600);

  }

  @Test
  public void test146() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test146"); }


    java.lang.String str1 = java.lang.Integer.toUnsignedString((-1073741817));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "3221225479"+ "'", str1.equals("3221225479"));

  }

  @Test
  public void test147() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test147"); }


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
    java.lang.Long long25 = iPBan14.expires;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i22 + "' != '" + 100+ "'", i22.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long25 + "' != '" + 100L+ "'", long25.equals(100L));

  }

  @Test
  public void test148() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test148"); }


    int i2 = java.lang.Integer.max(187783298, 5221550);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 187783298);

  }

  @Test
  public void test149() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test149"); }


    int i1 = java.lang.Integer.numberOfTrailingZeros(772058);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 1);

  }

  @Test
  public void test150() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test150"); }


    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList0 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b1 = strictlySortedSinglyLinkedList0.repOK();
    tp2.IP iP6 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    boolean b7 = strictlySortedSinglyLinkedList0.containsIP(iP6);
    tp2.Node node8 = strictlySortedSinglyLinkedList0.header;
    strictlySortedSinglyLinkedList0.size = 11001000;
    boolean b11 = strictlySortedSinglyLinkedList0.repOK();
    tp2.IPBan iPBan13 = strictlySortedSinglyLinkedList0.get(40);
    tp2.IPBan iPBan15 = strictlySortedSinglyLinkedList0.get(505032705);
    int i16 = strictlySortedSinglyLinkedList0.getSize();
    boolean b17 = strictlySortedSinglyLinkedList0.repOK();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList18 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b19 = strictlySortedSinglyLinkedList18.repOK();
    strictlySortedSinglyLinkedList18.size = 1;
    strictlySortedSinglyLinkedList18.size = 0;
    tp2.IP iP28 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP28.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan32 = new tp2.IPBan(iP28, (java.lang.Long)100L);
    tp2.IP iP33 = iPBan32.ip;
    boolean b34 = strictlySortedSinglyLinkedList18.contains(iPBan32);
    boolean b35 = strictlySortedSinglyLinkedList18.repOK();
    tp2.SinglyLinkedList singlyLinkedList36 = new tp2.SinglyLinkedList();
    int i37 = singlyLinkedList36.getSize();
    tp2.IP iP42 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i43 = iP42.getSecond();
    java.lang.Integer i44 = iP42.getFourth();
    singlyLinkedList36.add(iP42);
    boolean b47 = iP42.equals((java.lang.Object)2147483647);
    tp2.IPBan iPBan49 = new tp2.IPBan(iP42, (java.lang.Long)(-1L));
    boolean b50 = strictlySortedSinglyLinkedList18.add(iPBan49);
    tp2.SinglyLinkedList singlyLinkedList51 = new tp2.SinglyLinkedList();
    int i52 = singlyLinkedList51.getSize();
    tp2.IP iP57 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i58 = iP57.getSecond();
    java.lang.Integer i59 = iP57.getFourth();
    singlyLinkedList51.add(iP57);
    tp2.IPBan iPBan62 = new tp2.IPBan(iP57, (java.lang.Long)1L);
    boolean b63 = strictlySortedSinglyLinkedList18.containsIP(iP57);
    int i64 = strictlySortedSinglyLinkedList18.getSize();
    strictlySortedSinglyLinkedList18.size = 11001000;
    boolean b67 = strictlySortedSinglyLinkedList18.repOK();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList68 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b69 = strictlySortedSinglyLinkedList68.repOK();
    strictlySortedSinglyLinkedList68.size = 1;
    strictlySortedSinglyLinkedList68.size = 0;
    tp2.IPBan iPBan74 = null;
    boolean b75 = strictlySortedSinglyLinkedList68.add(iPBan74);
    int i76 = strictlySortedSinglyLinkedList68.size;
    tp2.Node node77 = strictlySortedSinglyLinkedList68.header;
    strictlySortedSinglyLinkedList18.header = node77;
    strictlySortedSinglyLinkedList0.header = node77;
    tp2.IPBan iPBan81 = strictlySortedSinglyLinkedList0.get((-1505262448));
    
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
    org.junit.Assert.assertNull(iPBan15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 11001000);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i37 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i43 + "' != '" + (-1)+ "'", i43.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i44 + "' != '" + 100+ "'", i44.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b47 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b50 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i52 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i58 + "' != '" + (-1)+ "'", i58.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i59 + "' != '" + 100+ "'", i59.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b63 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i64 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b67 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b69 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b75 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i76 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node77);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iPBan81);

  }

  @Test
  public void test151() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test151"); }


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
    boolean b19 = singlyLinkedList0.repOK();
    int i20 = singlyLinkedList0.getSize();
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
    iP35.setFourth((java.lang.Integer)637534208);
    singlyLinkedList0.add(iP35);
    tp2.IP iP48 = null;
    // The following exception was thrown during execution in test generation
    try {
      singlyLinkedList0.add(iP48);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
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
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i36 + "' != '" + 100+ "'", i36.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i37 + "' != '" + 100+ "'", i37.equals(100));

  }

  @Test
  public void test152() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test152"); }


    java.lang.Integer i1 = new java.lang.Integer(541065219);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 541065219+ "'", i1.equals(541065219));

  }

  @Test
  public void test153() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test153"); }


    java.lang.String str1 = java.lang.Integer.toBinaryString((-956374835));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "11000110111111101110000011001101"+ "'", str1.equals("11000110111111101110000011001101"));

  }

  @Test
  public void test154() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test154"); }


    java.lang.Integer i2 = java.lang.Integer.getInteger("294890", (-1791236864));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i2 + "' != '" + (-1791236864)+ "'", i2.equals((-1791236864)));

  }

  @Test
  public void test155() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test155"); }


    int i1 = java.lang.Integer.signum(58);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 1);

  }

  @Test
  public void test156() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test156"); }


    int i2 = java.lang.Integer.sum(786382848, 47776);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 786430624);

  }

  @Test
  public void test157() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test157"); }


    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList0 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b1 = strictlySortedSinglyLinkedList0.repOK();
    tp2.IP iP6 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i7 = iP6.getSecond();
    iP6.setFirst((java.lang.Integer)11001000);
    iP6.setFirst((java.lang.Integer)(-2147483648));
    boolean b12 = strictlySortedSinglyLinkedList0.removeFromIP(iP6);
    java.lang.Integer i13 = iP6.getThird();
    tp2.IPBan iPBan15 = new tp2.IPBan(iP6, (java.lang.Long)71040L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i7 + "' != '" + (-1)+ "'", i7.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i13 + "' != '" + (-1)+ "'", i13.equals((-1)));

  }

  @Test
  public void test158() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test158"); }


    int i2 = java.lang.Integer.rotateRight((-2063597568), 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == (-2063597568));

  }

  @Test
  public void test159() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test159"); }


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
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList49 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b50 = strictlySortedSinglyLinkedList49.repOK();
    tp2.IP iP55 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    boolean b56 = strictlySortedSinglyLinkedList49.containsIP(iP55);
    java.lang.Integer i57 = iP55.getFirst();
    java.lang.Integer i58 = iP55.getFirst();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList59 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b60 = strictlySortedSinglyLinkedList59.repOK();
    tp2.IP iP65 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    boolean b66 = strictlySortedSinglyLinkedList59.containsIP(iP65);
    tp2.Node node67 = strictlySortedSinglyLinkedList59.header;
    boolean b68 = strictlySortedSinglyLinkedList59.isEmpty();
    int i69 = strictlySortedSinglyLinkedList59.getSize();
    int i70 = strictlySortedSinglyLinkedList59.size;
    boolean b71 = iP55.equals((java.lang.Object)i70);
    java.lang.Integer i72 = iP55.getFourth();
    java.lang.Integer i73 = iP55.getFourth();
    iPBan8.ip = iP55;
    java.lang.Long long75 = iPBan8.getExpires();
    iPBan8.expires = 318767104L;
    java.lang.Long long78 = iPBan8.getExpires();
    
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
    org.junit.Assert.assertTrue(b50 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b56 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i57 + "' != '" + (-1)+ "'", i57.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i58 + "' != '" + (-1)+ "'", i58.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b60 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b66 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node67);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b68 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i69 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i70 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b71 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i72 + "' != '" + 100+ "'", i72.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i73 + "' != '" + 100+ "'", i73.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long75 + "' != '" + 3355443200L+ "'", long75.equals(3355443200L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long78 + "' != '" + 318767104L+ "'", long78.equals(318767104L));

  }

  @Test
  public void test160() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test160"); }


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
    tp2.IP iP45 = iPBan42.ip;
    iP45.setSecond((java.lang.Integer)533897138);
    
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

  }

  @Test
  public void test161() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test161"); }


    java.lang.Integer i1 = java.lang.Integer.getInteger("1677721600");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);

  }

  @Test
  public void test162() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test162"); }


    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList0 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b1 = strictlySortedSinglyLinkedList0.repOK();
    strictlySortedSinglyLinkedList0.size = 1;
    strictlySortedSinglyLinkedList0.size = 0;
    tp2.IPBan iPBan6 = null;
    boolean b7 = strictlySortedSinglyLinkedList0.add(iPBan6);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList8 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b9 = strictlySortedSinglyLinkedList8.repOK();
    tp2.IP iP14 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i15 = iP14.getSecond();
    iP14.setFirst((java.lang.Integer)11001000);
    iP14.setFirst((java.lang.Integer)(-2147483648));
    boolean b20 = strictlySortedSinglyLinkedList8.removeFromIP(iP14);
    tp2.IPBan iPBan21 = null;
    boolean b22 = strictlySortedSinglyLinkedList8.add(iPBan21);
    tp2.Node node23 = strictlySortedSinglyLinkedList8.header;
    strictlySortedSinglyLinkedList0.header = node23;
    tp2.IPBan iPBan26 = strictlySortedSinglyLinkedList0.get(0);
    boolean b27 = strictlySortedSinglyLinkedList0.isEmpty();
    tp2.SinglyLinkedList singlyLinkedList28 = new tp2.SinglyLinkedList();
    int i29 = singlyLinkedList28.getSize();
    tp2.IP iP34 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i35 = iP34.getSecond();
    java.lang.Integer i36 = iP34.getFourth();
    singlyLinkedList28.add(iP34);
    tp2.IP iP39 = singlyLinkedList28.get(5);
    boolean b40 = singlyLinkedList28.repOK();
    tp2.IP iP42 = singlyLinkedList28.get(2013265920);
    tp2.IP iP44 = singlyLinkedList28.get((-1));
    tp2.IP iP49 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i50 = iP49.getSecond();
    java.lang.Integer i51 = iP49.getFourth();
    iP49.setFirst((java.lang.Integer)5);
    tp2.IPBan iPBan55 = new tp2.IPBan(iP49, (java.lang.Long)0L);
    iPBan55.expires = 2147483648L;
    iPBan55.expires = 2013265920L;
    tp2.IP iP64 = new tp2.IP((java.lang.Integer)160, (java.lang.Integer)1, (java.lang.Integer)27, (java.lang.Integer)(-2));
    java.lang.Integer i65 = iP64.getFourth();
    java.lang.Integer i66 = iP64.getFourth();
    iPBan55.ip = iP64;
    boolean b68 = singlyLinkedList28.contains(iP64);
    // The following exception was thrown during execution in test generation
    try {
      boolean b69 = strictlySortedSinglyLinkedList0.removeFromIP(iP64);
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
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i15 + "' != '" + (-1)+ "'", i15.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iPBan26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i29 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i35 + "' != '" + (-1)+ "'", i35.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i36 + "' != '" + 100+ "'", i36.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i50 + "' != '" + (-1)+ "'", i50.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i51 + "' != '" + 100+ "'", i51.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i65 + "' != '" + (-2)+ "'", i65.equals((-2)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i66 + "' != '" + (-2)+ "'", i66.equals((-2)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b68 == false);

  }

  @Test
  public void test163() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test163"); }


    int i2 = java.lang.Integer.max(10239, 32768);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 32768);

  }

  @Test
  public void test164() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test164"); }


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
    tp2.IP iP25 = iPBan24.ip;
    tp2.IP iP30 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP30.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan34 = new tp2.IPBan(iP30, (java.lang.Long)100L);
    iPBan24.setIp(iP30);
    iPBan24.expires = 2013265920L;
    tp2.IP iP38 = iPBan24.ip;
    boolean b39 = strictlySortedSinglyLinkedList0.containsIP(iP38);
    java.lang.Integer i40 = iP38.getFirst();
    java.lang.Integer i41 = null;
    iP38.setFirst(i41);
    boolean b44 = iP38.equals((java.lang.Object)671138531);
    
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
    org.junit.Assert.assertNotNull(iP25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i40 + "' != '" + 200+ "'", i40.equals(200));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == false);

  }

  @Test
  public void test165() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test165"); }


    // The following exception was thrown during execution in test generation
    try {
      java.lang.Integer i1 = new java.lang.Integer("11001101010101111001000000000000");
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

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test166"); }


    tp2.SinglyLinkedList singlyLinkedList0 = new tp2.SinglyLinkedList();
    boolean b1 = singlyLinkedList0.repOK();
    tp2.IP iP3 = singlyLinkedList0.get(200);
    boolean b4 = singlyLinkedList0.isEmpty();
    boolean b5 = singlyLinkedList0.repOK();
    int i6 = singlyLinkedList0.getSize();
    tp2.SinglyLinkedList singlyLinkedList7 = new tp2.SinglyLinkedList();
    int i8 = singlyLinkedList7.getSize();
    tp2.IP iP13 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i14 = iP13.getSecond();
    java.lang.Integer i15 = iP13.getFourth();
    singlyLinkedList7.add(iP13);
    tp2.IPBan iPBan18 = new tp2.IPBan(iP13, (java.lang.Long)1L);
    java.lang.Integer i19 = iP13.getThird();
    java.lang.Integer i20 = iP13.getFourth();
    java.lang.Integer i21 = iP13.getSecond();
    iP13.setSecond((java.lang.Integer)6294016);
    java.lang.Integer i24 = iP13.getFourth();
    iP13.setThird((java.lang.Integer)(-671088640));
    boolean b27 = singlyLinkedList0.remove(iP13);
    boolean b28 = singlyLinkedList0.repOK();
    tp2.SinglyLinkedList singlyLinkedList29 = new tp2.SinglyLinkedList();
    int i30 = singlyLinkedList29.getSize();
    tp2.IP iP35 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i36 = iP35.getSecond();
    java.lang.Integer i37 = iP35.getFourth();
    singlyLinkedList29.add(iP35);
    java.lang.Integer i39 = iP35.getFourth();
    boolean b40 = singlyLinkedList0.contains(iP35);
    java.lang.Integer i41 = null;
    iP35.setFourth(i41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i14 + "' != '" + (-1)+ "'", i14.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i15 + "' != '" + 100+ "'", i15.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i19 + "' != '" + (-1)+ "'", i19.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i20 + "' != '" + 100+ "'", i20.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i21 + "' != '" + (-1)+ "'", i21.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i24 + "' != '" + 100+ "'", i24.equals(100));
    
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
    org.junit.Assert.assertTrue("'" + i39 + "' != '" + 100+ "'", i39.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == false);

  }

  @Test
  public void test167() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test167"); }


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
    int i30 = singlyLinkedList0.getSize();
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
    java.lang.Integer i66 = iP52.getSecond();
    java.lang.Integer i67 = iP52.getThird();
    singlyLinkedList0.add(iP52);
    boolean b69 = singlyLinkedList0.repOK();
    
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
    org.junit.Assert.assertTrue(i30 == 0);
    
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
    org.junit.Assert.assertTrue("'" + i66 + "' != '" + 20+ "'", i66.equals(20));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i67 + "' != '" + (-1)+ "'", i67.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b69 == true);

  }

  @Test
  public void test168() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test168"); }


    int i2 = java.lang.Integer.rotateLeft((-1665138688), (-2118580736));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == (-1665138688));

  }

  @Test
  public void test169() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test169"); }


    int i2 = java.lang.Integer.rotateRight(1794051618, 111201102);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 948546492);

  }

  @Test
  public void test170() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test170"); }


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
    int i23 = strictlySortedSinglyLinkedList0.size;
    tp2.SinglyLinkedList singlyLinkedList24 = new tp2.SinglyLinkedList();
    boolean b25 = singlyLinkedList24.repOK();
    int i26 = singlyLinkedList24.getSize();
    boolean b27 = singlyLinkedList24.isEmpty();
    tp2.IP iP32 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP32.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan36 = new tp2.IPBan(iP32, (java.lang.Long)100L);
    tp2.IP iP37 = iPBan36.ip;
    tp2.IP iP42 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i43 = iP42.getFourth();
    java.lang.Integer i44 = iP42.getFourth();
    iP42.setThird((java.lang.Integer)200);
    iPBan36.ip = iP42;
    iP42.setFirst((java.lang.Integer)16777216);
    boolean b50 = singlyLinkedList24.contains(iP42);
    tp2.SinglyLinkedList singlyLinkedList51 = new tp2.SinglyLinkedList();
    boolean b52 = singlyLinkedList51.repOK();
    tp2.IP iP54 = singlyLinkedList51.get(200);
    boolean b55 = singlyLinkedList51.isEmpty();
    boolean b56 = singlyLinkedList51.repOK();
    boolean b57 = singlyLinkedList51.repOK();
    tp2.IP iP62 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i63 = iP62.getThird();
    singlyLinkedList51.add(iP62);
    java.lang.Integer i65 = iP62.getFourth();
    boolean b66 = singlyLinkedList24.contains(iP62);
    int i67 = singlyLinkedList24.getSize();
    tp2.SinglyLinkedList singlyLinkedList68 = new tp2.SinglyLinkedList();
    boolean b69 = singlyLinkedList68.repOK();
    tp2.IP iP74 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP74.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan78 = new tp2.IPBan(iP74, (java.lang.Long)100L);
    tp2.IP iP83 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP83.setFirst((java.lang.Integer)200);
    java.lang.Integer i86 = iP83.getFourth();
    iPBan78.setIp(iP83);
    singlyLinkedList68.add(iP83);
    iP83.setSecond((java.lang.Integer)5);
    java.lang.Integer i91 = iP83.getSecond();
    singlyLinkedList24.add(iP83);
    java.lang.Integer i93 = iP83.getFirst();
    boolean b94 = strictlySortedSinglyLinkedList0.containsIP(iP83);
    tp2.IPBan iPBan96 = strictlySortedSinglyLinkedList0.get((-1936783046));
    java.lang.Long long97 = iPBan96.getExpires();
    
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
    org.junit.Assert.assertTrue(i23 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i43 + "' != '" + 100+ "'", i43.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i44 + "' != '" + 100+ "'", i44.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b50 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b52 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b55 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b56 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b57 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i63 + "' != '" + (-1)+ "'", i63.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i65 + "' != '" + 100+ "'", i65.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b66 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i67 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b69 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i86 + "' != '" + 100+ "'", i86.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i91 + "' != '" + 5+ "'", i91.equals(5));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i93 + "' != '" + 200+ "'", i93.equals(200));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b94 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iPBan96);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long97 + "' != '" + 100L+ "'", long97.equals(100L));

  }

  @Test
  public void test171() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test171"); }


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
    int i36 = strictlySortedSinglyLinkedList0.size;
    tp2.IP iP41 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i42 = iP41.getSecond();
    iP41.setFirst((java.lang.Integer)11001000);
    java.lang.Long long45 = null;
    tp2.IPBan iPBan46 = new tp2.IPBan(iP41, long45);
    java.lang.Long long47 = iPBan46.getExpires();
    iPBan46.expires = 1L;
    tp2.IP iP54 = new tp2.IP((java.lang.Integer)67108864, (java.lang.Integer)(-2147483648), (java.lang.Integer)356246784, (java.lang.Integer)176016000);
    iPBan46.ip = iP54;
    boolean b56 = strictlySortedSinglyLinkedList0.contains(iPBan46);
    java.lang.Long long57 = iPBan46.getExpires();
    iPBan46.setExpires((java.lang.Long)1027604515L);
    tp2.SinglyLinkedList singlyLinkedList60 = new tp2.SinglyLinkedList();
    boolean b61 = singlyLinkedList60.repOK();
    tp2.IP iP66 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP66.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan70 = new tp2.IPBan(iP66, (java.lang.Long)100L);
    tp2.IP iP75 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP75.setFirst((java.lang.Integer)200);
    java.lang.Integer i78 = iP75.getFourth();
    iPBan70.setIp(iP75);
    singlyLinkedList60.add(iP75);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList81 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b82 = strictlySortedSinglyLinkedList81.repOK();
    tp2.IP iP87 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    boolean b88 = strictlySortedSinglyLinkedList81.containsIP(iP87);
    tp2.IPBan iPBan90 = strictlySortedSinglyLinkedList81.get(160);
    tp2.IPBan iPBan91 = null;
    boolean b92 = strictlySortedSinglyLinkedList81.contains(iPBan91);
    boolean b93 = iP75.equals((java.lang.Object)strictlySortedSinglyLinkedList81);
    iP75.setThird((java.lang.Integer)284738);
    java.lang.Integer i96 = iP75.getThird();
    iPBan46.ip = iP75;
    
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
    org.junit.Assert.assertTrue(i36 == 2147483647);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i42 + "' != '" + (-1)+ "'", i42.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(long47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b56 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long57 + "' != '" + 1L+ "'", long57.equals(1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b61 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i78 + "' != '" + 100+ "'", i78.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b82 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b88 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iPBan90);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b92 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b93 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i96 + "' != '" + 284738+ "'", i96.equals(284738));

  }

  @Test
  public void test172() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test172"); }


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
    int i41 = strictlySortedSinglyLinkedList0.getSize();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList42 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b43 = strictlySortedSinglyLinkedList42.repOK();
    tp2.IP iP48 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    boolean b49 = strictlySortedSinglyLinkedList42.containsIP(iP48);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList50 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b51 = strictlySortedSinglyLinkedList50.repOK();
    tp2.IP iP56 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i57 = iP56.getSecond();
    iP56.setFirst((java.lang.Integer)11001000);
    iP56.setFirst((java.lang.Integer)(-2147483648));
    boolean b62 = strictlySortedSinglyLinkedList50.removeFromIP(iP56);
    boolean b63 = iP48.equals((java.lang.Object)iP56);
    boolean b64 = strictlySortedSinglyLinkedList0.containsIP(iP56);
    boolean b65 = strictlySortedSinglyLinkedList0.isEmpty();
    tp2.IPBan iPBan67 = strictlySortedSinglyLinkedList0.get(51756250);
    int i68 = strictlySortedSinglyLinkedList0.getSize();
    int i69 = strictlySortedSinglyLinkedList0.size;
    tp2.IP iP74 = new tp2.IP((java.lang.Integer)110000001, (java.lang.Integer)(-620691456), (java.lang.Integer)30000001, (java.lang.Integer)33566720);
    boolean b75 = strictlySortedSinglyLinkedList0.containsIP(iP74);
    
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
    org.junit.Assert.assertTrue(b51 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i57 + "' != '" + (-1)+ "'", i57.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b62 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b63 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b64 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b65 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iPBan67);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i68 == (-671088640));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i69 == (-671088640));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b75 == false);

  }

  @Test
  public void test173() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test173"); }


    int i2 = java.lang.Integer.max(9759617, 49195);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 9759617);

  }

  @Test
  public void test174() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test174"); }


    java.lang.Integer i2 = java.lang.Integer.getInteger("10000000", 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i2 + "' != '" + 0+ "'", i2.equals(0));

  }

  @Test
  public void test175() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test175"); }


    int i2 = java.lang.Integer.divideUnsigned(1247139072, (-1572356096));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);

  }

  @Test
  public void test176() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test176"); }


    int i2 = java.lang.Integer.remainderUnsigned(1655145359, (-1768527607));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1655145359);

  }

  @Test
  public void test177() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test177"); }


    int i2 = java.lang.Integer.sum(11634, 900683009);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 900694643);

  }

  @Test
  public void test178() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test178"); }


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
    tp2.SinglyLinkedList singlyLinkedList67 = new tp2.SinglyLinkedList();
    boolean b68 = singlyLinkedList67.repOK();
    tp2.IP iP70 = singlyLinkedList67.get(200);
    boolean b71 = singlyLinkedList67.isEmpty();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList72 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b73 = strictlySortedSinglyLinkedList72.repOK();
    tp2.IP iP78 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i79 = iP78.getSecond();
    iP78.setFirst((java.lang.Integer)11001000);
    iP78.setFirst((java.lang.Integer)(-2147483648));
    boolean b84 = strictlySortedSinglyLinkedList72.removeFromIP(iP78);
    boolean b85 = singlyLinkedList67.remove(iP78);
    iP78.setFourth((java.lang.Integer)30);
    java.lang.Integer i88 = iP78.getFourth();
    tp2.IPBan iPBan90 = new tp2.IPBan(iP78, (java.lang.Long)400L);
    boolean b91 = strictlySortedSinglyLinkedList0.removeFromIP(iP78);
    
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
    org.junit.Assert.assertTrue(b68 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP70);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b71 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b73 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i79 + "' != '" + (-1)+ "'", i79.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b84 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b85 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i88 + "' != '" + 30+ "'", i88.equals(30));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b91 == false);

  }

  @Test
  public void test179() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test179"); }


    java.lang.String str1 = java.lang.Integer.toBinaryString(312);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "100111000"+ "'", str1.equals("100111000"));

  }

  @Test
  public void test180() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test180"); }


    int i2 = java.lang.Integer.compareUnsigned(286453731, (-794967296));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == (-1));

  }

  @Test
  public void test181() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test181"); }


    // The following exception was thrown during execution in test generation
    try {
      int i2 = java.lang.Integer.parseUnsignedInt("552efa65", (-620670883));
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

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test182"); }


    // The following exception was thrown during execution in test generation
    try {
      int i2 = java.lang.Integer.parseUnsignedInt("1000100111111000000000000000000", (-1068183552));
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test183() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test183"); }


    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList0 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b1 = strictlySortedSinglyLinkedList0.repOK();
    boolean b2 = strictlySortedSinglyLinkedList0.repOK();
    strictlySortedSinglyLinkedList0.size = 75778;
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList5 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b6 = strictlySortedSinglyLinkedList5.repOK();
    strictlySortedSinglyLinkedList5.size = 1;
    boolean b9 = strictlySortedSinglyLinkedList5.isEmpty();
    int i10 = strictlySortedSinglyLinkedList5.getSize();
    int i11 = strictlySortedSinglyLinkedList5.getSize();
    tp2.IP iP16 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP16.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan20 = new tp2.IPBan(iP16, (java.lang.Long)100L);
    tp2.IP iP25 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP25.setFirst((java.lang.Integer)200);
    java.lang.Integer i28 = iP25.getFourth();
    iPBan20.setIp(iP25);
    java.lang.Long long30 = iPBan20.expires;
    tp2.IP iP35 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i36 = iP35.getSecond();
    iP35.setFirst((java.lang.Integer)11001000);
    iP35.setFirst((java.lang.Integer)32);
    iPBan20.setIp(iP35);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList42 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b43 = strictlySortedSinglyLinkedList42.repOK();
    tp2.IP iP48 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i49 = iP48.getSecond();
    iP48.setFirst((java.lang.Integer)11001000);
    iP48.setFirst((java.lang.Integer)(-2147483648));
    boolean b54 = strictlySortedSinglyLinkedList42.removeFromIP(iP48);
    tp2.IPBan iPBan56 = new tp2.IPBan(iP48, (java.lang.Long)0L);
    tp2.IP iP57 = iPBan56.getIp();
    iPBan20.ip = iP57;
    boolean b59 = strictlySortedSinglyLinkedList5.add(iPBan20);
    boolean b60 = strictlySortedSinglyLinkedList0.add(iPBan20);
    tp2.IP iP61 = iPBan20.ip;
    iP61.setThird((java.lang.Integer)(-962260327));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i28 + "' != '" + 100+ "'", i28.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long30 + "' != '" + 100L+ "'", long30.equals(100L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i36 + "' != '" + (-1)+ "'", i36.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b43 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i49 + "' != '" + (-1)+ "'", i49.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b54 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b59 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b60 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP61);

  }

  @Test
  public void test184() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test184"); }


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
    tp2.IP iP18 = iPBan14.getIp();
    java.lang.Integer i19 = iP18.getFourth();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList20 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b21 = strictlySortedSinglyLinkedList20.repOK();
    tp2.IP iP26 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i27 = iP26.getSecond();
    iP26.setFirst((java.lang.Integer)11001000);
    iP26.setFirst((java.lang.Integer)(-2147483648));
    boolean b32 = strictlySortedSinglyLinkedList20.removeFromIP(iP26);
    tp2.IPBan iPBan34 = strictlySortedSinglyLinkedList20.get((-1));
    strictlySortedSinglyLinkedList20.size = 23;
    boolean b37 = strictlySortedSinglyLinkedList20.isEmpty();
    boolean b38 = strictlySortedSinglyLinkedList20.isEmpty();
    tp2.Node node39 = strictlySortedSinglyLinkedList20.header;
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList40 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b41 = strictlySortedSinglyLinkedList40.repOK();
    strictlySortedSinglyLinkedList40.size = 1;
    strictlySortedSinglyLinkedList40.size = 0;
    tp2.IPBan iPBan46 = null;
    boolean b47 = strictlySortedSinglyLinkedList40.add(iPBan46);
    int i48 = strictlySortedSinglyLinkedList40.getSize();
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
    strictlySortedSinglyLinkedList40.header = node73;
    tp2.IP iP80 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i81 = iP80.getSecond();
    iP80.setFirst((java.lang.Integer)11001000);
    java.lang.Long long84 = null;
    tp2.IPBan iPBan85 = new tp2.IPBan(iP80, long84);
    tp2.IP iP86 = iPBan85.ip;
    tp2.IP iP87 = iPBan85.ip;
    tp2.IP iP88 = iPBan85.getIp();
    iPBan85.setExpires((java.lang.Long)29L);
    boolean b91 = strictlySortedSinglyLinkedList40.add(iPBan85);
    iPBan85.setExpires((java.lang.Long)75809L);
    boolean b94 = strictlySortedSinglyLinkedList20.contains(iPBan85);
    boolean b95 = iP18.equals((java.lang.Object)b94);
    java.lang.Integer i96 = iP18.getFirst();
    
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
    org.junit.Assert.assertTrue("'" + i19 + "' != '" + 100+ "'", i19.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i27 + "' != '" + (-1)+ "'", i27.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iPBan34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b47 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i48 == 1);
    
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
    org.junit.Assert.assertTrue("'" + i81 + "' != '" + (-1)+ "'", i81.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP86);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP87);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP88);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b91 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b94 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b95 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i96 + "' != '" + (-2147483648)+ "'", i96.equals((-2147483648)));

  }

  @Test
  public void test185() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test185"); }


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
    boolean b86 = singlyLinkedList0.repOK();
    
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
    org.junit.Assert.assertTrue(b86 == true);

  }

  @Test
  public void test186() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test186"); }


    java.lang.Integer i1 = new java.lang.Integer("560");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 560+ "'", i1.equals(560));

  }

  @Test
  public void test187() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test187"); }


    java.lang.Integer i2 = java.lang.Integer.getInteger("11030000", (java.lang.Integer)5124);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i2 + "' != '" + 5124+ "'", i2.equals(5124));

  }

  @Test
  public void test188() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test188"); }


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
    tp2.Node node40 = strictlySortedSinglyLinkedList0.header;
    boolean b41 = strictlySortedSinglyLinkedList0.isEmpty();
    strictlySortedSinglyLinkedList0.size = 117440512;
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList44 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b45 = strictlySortedSinglyLinkedList44.repOK();
    tp2.IP iP50 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    boolean b51 = strictlySortedSinglyLinkedList44.containsIP(iP50);
    tp2.Node node52 = strictlySortedSinglyLinkedList44.header;
    boolean b53 = strictlySortedSinglyLinkedList44.isEmpty();
    int i54 = strictlySortedSinglyLinkedList44.getSize();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList55 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b56 = strictlySortedSinglyLinkedList55.repOK();
    tp2.IP iP61 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i62 = iP61.getSecond();
    iP61.setFirst((java.lang.Integer)11001000);
    iP61.setFirst((java.lang.Integer)(-2147483648));
    boolean b67 = strictlySortedSinglyLinkedList55.removeFromIP(iP61);
    tp2.Node node68 = strictlySortedSinglyLinkedList55.header;
    strictlySortedSinglyLinkedList44.header = node68;
    tp2.IPBan iPBan71 = strictlySortedSinglyLinkedList44.get(51756250);
    tp2.SinglyLinkedList singlyLinkedList72 = new tp2.SinglyLinkedList();
    int i73 = singlyLinkedList72.getSize();
    tp2.IP iP78 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i79 = iP78.getSecond();
    java.lang.Integer i80 = iP78.getFourth();
    singlyLinkedList72.add(iP78);
    tp2.IPBan iPBan83 = new tp2.IPBan(iP78, (java.lang.Long)100L);
    java.lang.Long long84 = null;
    tp2.IPBan iPBan85 = new tp2.IPBan(iP78, long84);
    java.lang.Long long86 = iPBan85.getExpires();
    boolean b87 = strictlySortedSinglyLinkedList44.contains(iPBan85);
    java.lang.Long long88 = iPBan85.expires;
    boolean b89 = strictlySortedSinglyLinkedList0.contains(iPBan85);
    
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
    org.junit.Assert.assertNotNull(node40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b51 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b53 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i54 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b56 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i62 + "' != '" + (-1)+ "'", i62.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b67 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node68);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iPBan71);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i73 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i79 + "' != '" + (-1)+ "'", i79.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i80 + "' != '" + 100+ "'", i80.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(long86);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b87 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(long88);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b89 == false);

  }

  @Test
  public void test189() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test189"); }


    // The following exception was thrown during execution in test generation
    try {
      java.lang.Integer i2 = java.lang.Integer.valueOf("", (-1934176858));
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test190() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test190"); }


    tp2.IP iP4 = new tp2.IP((java.lang.Integer)138, (java.lang.Integer)(-2147483648), (java.lang.Integer)160, (java.lang.Integer)15);
    tp2.IPBan iPBan6 = new tp2.IPBan(iP4, (java.lang.Long)111L);
    java.lang.Integer i7 = iP4.getFourth();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i7 + "' != '" + 15+ "'", i7.equals(15));

  }

  @Test
  public void test191() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test191"); }


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
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList27 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList28 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b29 = strictlySortedSinglyLinkedList28.repOK();
    strictlySortedSinglyLinkedList28.size = 1;
    strictlySortedSinglyLinkedList28.size = 0;
    tp2.IP iP38 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP38.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan42 = new tp2.IPBan(iP38, (java.lang.Long)100L);
    tp2.IP iP43 = iPBan42.ip;
    boolean b44 = strictlySortedSinglyLinkedList28.contains(iPBan42);
    boolean b45 = strictlySortedSinglyLinkedList28.repOK();
    tp2.SinglyLinkedList singlyLinkedList46 = new tp2.SinglyLinkedList();
    int i47 = singlyLinkedList46.getSize();
    tp2.IP iP52 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i53 = iP52.getSecond();
    java.lang.Integer i54 = iP52.getFourth();
    singlyLinkedList46.add(iP52);
    boolean b57 = iP52.equals((java.lang.Object)2147483647);
    tp2.IPBan iPBan59 = new tp2.IPBan(iP52, (java.lang.Long)(-1L));
    boolean b60 = strictlySortedSinglyLinkedList28.add(iPBan59);
    boolean b61 = strictlySortedSinglyLinkedList27.add(iPBan59);
    tp2.IP iP62 = iPBan59.getIp();
    boolean b63 = strictlySortedSinglyLinkedList0.add(iPBan59);
    int i64 = strictlySortedSinglyLinkedList0.getSize();
    tp2.IPBan iPBan66 = strictlySortedSinglyLinkedList0.get(0);
    tp2.IP iP67 = iPBan66.ip;
    
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
    org.junit.Assert.assertTrue(b29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == false);
    
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
    org.junit.Assert.assertTrue(b60 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b61 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP62);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b63 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i64 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iPBan66);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP67);

  }

  @Test
  public void test192() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test192"); }


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
    int i36 = strictlySortedSinglyLinkedList0.size;
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList37 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b38 = strictlySortedSinglyLinkedList37.repOK();
    tp2.IP iP43 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    boolean b44 = strictlySortedSinglyLinkedList37.containsIP(iP43);
    java.lang.Integer i45 = iP43.getFirst();
    iP43.setFourth((java.lang.Integer)211631616);
    java.lang.Integer i48 = iP43.getFourth();
    boolean b49 = strictlySortedSinglyLinkedList0.removeFromIP(iP43);
    boolean b50 = strictlySortedSinglyLinkedList0.isEmpty();
    
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
    org.junit.Assert.assertTrue(b38 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i45 + "' != '" + (-1)+ "'", i45.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i48 + "' != '" + 211631616+ "'", i48.equals(211631616));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b49 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b50 == true);

  }

  @Test
  public void test193() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test193"); }


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
    boolean b49 = singlyLinkedList0.isEmpty();
    
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
    org.junit.Assert.assertTrue(b49 == false);

  }

  @Test
  public void test194() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test194"); }


    int i2 = java.lang.Integer.rotateLeft((-939524096), 1610616859);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 104857600);

  }

  @Test
  public void test195() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test195"); }


    int i2 = java.lang.Integer.remainderUnsigned(31130880, 213);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 78);

  }

  @Test
  public void test196() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test196"); }


    java.lang.Integer i1 = java.lang.Integer.decode("1600030000");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 1600030000+ "'", i1.equals(1600030000));

  }

  @Test
  public void test197() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test197"); }


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
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList55 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b56 = strictlySortedSinglyLinkedList55.repOK();
    strictlySortedSinglyLinkedList55.size = 1;
    strictlySortedSinglyLinkedList55.size = 0;
    tp2.IP iP65 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i66 = iP65.getSecond();
    java.lang.Integer i67 = iP65.getFourth();
    boolean b68 = strictlySortedSinglyLinkedList55.containsIP(iP65);
    tp2.IP iP73 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP73.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan77 = new tp2.IPBan(iP73, (java.lang.Long)100L);
    tp2.IP iP82 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP82.setFirst((java.lang.Integer)200);
    java.lang.Integer i85 = iP82.getFourth();
    iPBan77.setIp(iP82);
    iPBan77.setExpires((java.lang.Long)2147483648L);
    tp2.IP iP89 = iPBan77.getIp();
    boolean b90 = iP65.equals((java.lang.Object)iP89);
    boolean b91 = strictlySortedSinglyLinkedList0.removeFromIP(iP89);
    tp2.IPBan iPBan93 = new tp2.IPBan(iP89, (java.lang.Long)16762403L);
    java.lang.Integer i94 = null;
    iP89.setSecond(i94);
    java.lang.Integer i96 = iP89.getSecond();
    iP89.setFourth((java.lang.Integer)(-28148205));
    
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
    org.junit.Assert.assertTrue(b56 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i66 + "' != '" + (-1)+ "'", i66.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i67 + "' != '" + 100+ "'", i67.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b68 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i85 + "' != '" + 100+ "'", i85.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP89);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b90 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b91 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i96);

  }

  @Test
  public void test198() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test198"); }


    tp2.IP iP4 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i5 = iP4.getSecond();
    iP4.setFirst((java.lang.Integer)11001000);
    java.lang.Long long8 = null;
    tp2.IPBan iPBan9 = new tp2.IPBan(iP4, long8);
    java.lang.Long long10 = iPBan9.getExpires();
    iPBan9.expires = 1L;
    iPBan9.setExpires((java.lang.Long)4L);
    tp2.SinglyLinkedList singlyLinkedList15 = new tp2.SinglyLinkedList();
    int i16 = singlyLinkedList15.getSize();
    tp2.IP iP21 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i22 = iP21.getSecond();
    java.lang.Integer i23 = iP21.getFourth();
    singlyLinkedList15.add(iP21);
    tp2.IP iP26 = singlyLinkedList15.get(5);
    boolean b27 = singlyLinkedList15.repOK();
    tp2.IP iP29 = singlyLinkedList15.get(2013265920);
    tp2.IP iP31 = singlyLinkedList15.get((-1));
    boolean b32 = singlyLinkedList15.isEmpty();
    boolean b33 = singlyLinkedList15.repOK();
    boolean b34 = singlyLinkedList15.repOK();
    boolean b35 = singlyLinkedList15.isEmpty();
    tp2.IP iP40 = new tp2.IP((java.lang.Integer)20480, (java.lang.Integer)785, (java.lang.Integer)1104, (java.lang.Integer)5888);
    boolean b41 = singlyLinkedList15.contains(iP40);
    iP40.setThird((java.lang.Integer)0);
    iPBan9.setIp(iP40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i5 + "' != '" + (-1)+ "'", i5.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(long10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i22 + "' != '" + (-1)+ "'", i22.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i23 + "' != '" + 100+ "'", i23.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == false);

  }

  @Test
  public void test199() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test199"); }


    int i2 = java.lang.Integer.remainderUnsigned(33554870, 545512074);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 33554870);

  }

  @Test
  public void test200() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test200"); }


    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList0 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b1 = strictlySortedSinglyLinkedList0.repOK();
    strictlySortedSinglyLinkedList0.size = 1;
    strictlySortedSinglyLinkedList0.size = 0;
    boolean b6 = strictlySortedSinglyLinkedList0.repOK();
    int i7 = strictlySortedSinglyLinkedList0.getSize();
    tp2.IPBan iPBan9 = strictlySortedSinglyLinkedList0.get(469762048);
    int i10 = strictlySortedSinglyLinkedList0.getSize();
    strictlySortedSinglyLinkedList0.size = 31;
    strictlySortedSinglyLinkedList0.size = (-536868341);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iPBan9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);

  }

  @Test
  public void test201() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test201"); }


    tp2.IP iP4 = new tp2.IP((java.lang.Integer)1476395008, (java.lang.Integer)216, (java.lang.Integer)345389344, (java.lang.Integer)264023258);
    iP4.setThird((java.lang.Integer)(-1062712152));

  }

  @Test
  public void test202() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test202"); }


    // The following exception was thrown during execution in test generation
    try {
      int i2 = java.lang.Integer.remainderUnsigned(10880, 0);
      org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException");
    } catch (java.lang.ArithmeticException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArithmeticException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test203() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test203"); }


    java.lang.String str1 = java.lang.Integer.toOctalString(805350146);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "6000125402"+ "'", str1.equals("6000125402"));

  }

  @Test
  public void test204() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test204"); }


    int i1 = java.lang.Integer.signum(4246571);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 1);

  }

  @Test
  public void test205() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test205"); }


    java.lang.Integer i1 = null;
    java.lang.Integer i2 = java.lang.Integer.getInteger("13000000000", i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i2);

  }

  @Test
  public void test206() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test206"); }


    int i1 = java.lang.Integer.bitCount(2656);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 4);

  }

  @Test
  public void test207() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test207"); }


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
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList15 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b16 = strictlySortedSinglyLinkedList15.repOK();
    tp2.IP iP21 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    boolean b22 = strictlySortedSinglyLinkedList15.containsIP(iP21);
    tp2.Node node23 = strictlySortedSinglyLinkedList15.header;
    boolean b24 = strictlySortedSinglyLinkedList15.isEmpty();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList25 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b26 = strictlySortedSinglyLinkedList25.repOK();
    strictlySortedSinglyLinkedList25.size = 1;
    strictlySortedSinglyLinkedList25.size = 0;
    tp2.IP iP35 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i36 = iP35.getSecond();
    java.lang.Integer i37 = iP35.getFourth();
    boolean b38 = strictlySortedSinglyLinkedList25.containsIP(iP35);
    tp2.Node node39 = strictlySortedSinglyLinkedList25.header;
    strictlySortedSinglyLinkedList15.header = node39;
    strictlySortedSinglyLinkedList0.header = node39;
    tp2.Node node42 = strictlySortedSinglyLinkedList0.header;
    strictlySortedSinglyLinkedList0.size = 40434139;
    int i45 = strictlySortedSinglyLinkedList0.getSize();
    int i46 = strictlySortedSinglyLinkedList0.getSize();
    
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
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i36 + "' != '" + (-1)+ "'", i36.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i37 + "' != '" + 100+ "'", i37.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i45 == 40434139);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i46 == 40434139);

  }

  @Test
  public void test208() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test208"); }


    // The following exception was thrown during execution in test generation
    try {
      java.lang.Integer i1 = java.lang.Integer.decode("f6740021");
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

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test209"); }


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
    boolean b49 = singlyLinkedList0.repOK();
    tp2.IP iP51 = singlyLinkedList0.get((-2144406347));
    
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
    org.junit.Assert.assertTrue(b49 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP51);

  }

  @Test
  public void test210() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test210"); }


    int i1 = java.lang.Integer.numberOfLeadingZeros((-2142109696));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);

  }

  @Test
  public void test211() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test211"); }


    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList0 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b1 = strictlySortedSinglyLinkedList0.isEmpty();
    tp2.IP iP6 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i7 = iP6.getSecond();
    tp2.SinglyLinkedList singlyLinkedList8 = new tp2.SinglyLinkedList();
    boolean b9 = singlyLinkedList8.repOK();
    boolean b10 = iP6.equals((java.lang.Object)b9);
    boolean b11 = strictlySortedSinglyLinkedList0.removeFromIP(iP6);
    tp2.Node node12 = strictlySortedSinglyLinkedList0.header;
    int i13 = strictlySortedSinglyLinkedList0.getSize();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList14 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b15 = strictlySortedSinglyLinkedList14.repOK();
    strictlySortedSinglyLinkedList14.size = 1;
    boolean b18 = strictlySortedSinglyLinkedList14.isEmpty();
    tp2.SinglyLinkedList singlyLinkedList19 = new tp2.SinglyLinkedList();
    int i20 = singlyLinkedList19.getSize();
    tp2.IP iP25 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i26 = iP25.getSecond();
    java.lang.Integer i27 = iP25.getFourth();
    singlyLinkedList19.add(iP25);
    boolean b30 = iP25.equals((java.lang.Object)2147483647);
    tp2.IPBan iPBan32 = new tp2.IPBan(iP25, (java.lang.Long)(-1L));
    java.lang.Long long33 = iPBan32.expires;
    boolean b34 = strictlySortedSinglyLinkedList14.contains(iPBan32);
    tp2.IP iP35 = iPBan32.ip;
    java.lang.Integer i36 = iP35.getSecond();
    java.lang.Integer i37 = iP35.getThird();
    iP35.setThird((java.lang.Integer)4195041);
    tp2.IPBan iPBan41 = new tp2.IPBan(iP35, (java.lang.Long)199L);
    java.lang.Long long42 = iPBan41.expires;
    iPBan41.setExpires((java.lang.Long)356246787L);
    boolean b45 = strictlySortedSinglyLinkedList0.add(iPBan41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i7 + "' != '" + (-1)+ "'", i7.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
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
    org.junit.Assert.assertTrue("'" + long33 + "' != '" + (-1L)+ "'", long33.equals((-1L)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i36 + "' != '" + (-1)+ "'", i36.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i37 + "' != '" + (-1)+ "'", i37.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long42 + "' != '" + 199L+ "'", long42.equals(199L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == true);

  }

  @Test
  public void test212() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test212"); }


    int i1 = java.lang.Integer.parseUnsignedInt("1618477568");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 1618477568);

  }

  @Test
  public void test213() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test213"); }


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
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList25 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b26 = strictlySortedSinglyLinkedList25.repOK();
    strictlySortedSinglyLinkedList25.size = 1;
    strictlySortedSinglyLinkedList25.size = 0;
    tp2.IPBan iPBan31 = null;
    boolean b32 = strictlySortedSinglyLinkedList25.add(iPBan31);
    int i33 = strictlySortedSinglyLinkedList25.getSize();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList34 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b35 = strictlySortedSinglyLinkedList34.repOK();
    tp2.IP iP40 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    boolean b41 = strictlySortedSinglyLinkedList34.containsIP(iP40);
    tp2.Node node42 = strictlySortedSinglyLinkedList34.header;
    boolean b43 = strictlySortedSinglyLinkedList34.isEmpty();
    int i44 = strictlySortedSinglyLinkedList34.getSize();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList45 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b46 = strictlySortedSinglyLinkedList45.repOK();
    tp2.IP iP51 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i52 = iP51.getSecond();
    iP51.setFirst((java.lang.Integer)11001000);
    iP51.setFirst((java.lang.Integer)(-2147483648));
    boolean b57 = strictlySortedSinglyLinkedList45.removeFromIP(iP51);
    tp2.Node node58 = strictlySortedSinglyLinkedList45.header;
    strictlySortedSinglyLinkedList34.header = node58;
    strictlySortedSinglyLinkedList25.header = node58;
    tp2.IP iP65 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i66 = iP65.getSecond();
    iP65.setFirst((java.lang.Integer)11001000);
    java.lang.Long long69 = null;
    tp2.IPBan iPBan70 = new tp2.IPBan(iP65, long69);
    tp2.IP iP71 = iPBan70.ip;
    tp2.IP iP72 = iPBan70.ip;
    tp2.IP iP73 = iPBan70.getIp();
    iPBan70.setExpires((java.lang.Long)29L);
    boolean b76 = strictlySortedSinglyLinkedList25.add(iPBan70);
    iPBan70.setExpires((java.lang.Long)75809L);
    tp2.SinglyLinkedList singlyLinkedList79 = new tp2.SinglyLinkedList();
    int i80 = singlyLinkedList79.getSize();
    tp2.IP iP85 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i86 = iP85.getSecond();
    java.lang.Integer i87 = iP85.getFourth();
    singlyLinkedList79.add(iP85);
    tp2.IPBan iPBan90 = new tp2.IPBan(iP85, (java.lang.Long)100L);
    iPBan90.expires = 10L;
    tp2.IP iP93 = iPBan90.getIp();
    iPBan70.setIp(iP93);
    singlyLinkedList19.add(iP93);
    tp2.IP iP96 = null;
    boolean b97 = singlyLinkedList19.contains(iP96);
    
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
    org.junit.Assert.assertTrue(b26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b43 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i44 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b46 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i52 + "' != '" + (-1)+ "'", i52.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b57 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node58);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i66 + "' != '" + (-1)+ "'", i66.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP71);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP72);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP73);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b76 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i80 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i86 + "' != '" + (-1)+ "'", i86.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i87 + "' != '" + 100+ "'", i87.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP93);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b97 == false);

  }

  @Test
  public void test214() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test214"); }


    java.lang.String str1 = java.lang.Integer.toHexString(1513701567);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "5a3940bf"+ "'", str1.equals("5a3940bf"));

  }

  @Test
  public void test215() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test215"); }


    tp2.IP iP4 = new tp2.IP((java.lang.Integer)160, (java.lang.Integer)1, (java.lang.Integer)27, (java.lang.Integer)(-2));
    java.lang.Integer i5 = iP4.getFourth();
    tp2.IPBan iPBan7 = new tp2.IPBan(iP4, (java.lang.Long)0L);
    tp2.SinglyLinkedList singlyLinkedList8 = new tp2.SinglyLinkedList();
    boolean b9 = singlyLinkedList8.repOK();
    tp2.IP iP11 = singlyLinkedList8.get(200);
    boolean b12 = singlyLinkedList8.isEmpty();
    tp2.IP iP17 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i18 = iP17.getThird();
    boolean b19 = singlyLinkedList8.remove(iP17);
    tp2.IP iP24 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP24.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan28 = new tp2.IPBan(iP24, (java.lang.Long)100L);
    tp2.IP iP29 = iPBan28.ip;
    tp2.IP iP30 = iPBan28.getIp();
    java.lang.Integer i31 = null;
    iP30.setFirst(i31);
    boolean b33 = singlyLinkedList8.contains(iP30);
    int i34 = singlyLinkedList8.getSize();
    boolean b35 = singlyLinkedList8.isEmpty();
    tp2.IP iP37 = singlyLinkedList8.get((-2147483598));
    tp2.SinglyLinkedList singlyLinkedList38 = new tp2.SinglyLinkedList();
    int i39 = singlyLinkedList38.getSize();
    int i40 = singlyLinkedList38.getSize();
    tp2.IP iP41 = null;
    boolean b42 = singlyLinkedList38.contains(iP41);
    tp2.IP iP44 = singlyLinkedList38.get(27);
    tp2.IP iP49 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i50 = iP49.getSecond();
    iP49.setFirst((java.lang.Integer)11001000);
    java.lang.Long long53 = null;
    tp2.IPBan iPBan54 = new tp2.IPBan(iP49, long53);
    tp2.IP iP55 = iPBan54.ip;
    tp2.IP iP56 = iPBan54.ip;
    java.lang.Integer i57 = iP56.getFourth();
    boolean b58 = singlyLinkedList38.remove(iP56);
    java.lang.Integer i59 = iP56.getFirst();
    java.lang.Integer i60 = iP56.getThird();
    java.lang.Integer i61 = null;
    iP56.setSecond(i61);
    boolean b63 = singlyLinkedList8.contains(iP56);
    iPBan7.setIp(iP56);
    java.lang.Long long65 = iPBan7.getExpires();
    iPBan7.expires = 89L;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i5 + "' != '" + (-2)+ "'", i5.equals((-2)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i18 + "' != '" + (-1)+ "'", i18.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i34 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i39 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i40 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i50 + "' != '" + (-1)+ "'", i50.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP55);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i57 + "' != '" + 100+ "'", i57.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b58 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i59 + "' != '" + 11001000+ "'", i59.equals(11001000));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i60 + "' != '" + (-1)+ "'", i60.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b63 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long65 + "' != '" + 0L+ "'", long65.equals(0L));

  }

  @Test
  public void test216() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test216"); }


    tp2.IP iP4 = new tp2.IP((java.lang.Integer)15204352, (java.lang.Integer)101, (java.lang.Integer)30, (java.lang.Integer)100);
    tp2.IPBan iPBan6 = new tp2.IPBan(iP4, (java.lang.Long)6294016L);
    tp2.IP iP11 = new tp2.IP((java.lang.Integer)160, (java.lang.Integer)1, (java.lang.Integer)27, (java.lang.Integer)(-2));
    java.lang.Integer i12 = iP11.getFourth();
    tp2.IPBan iPBan14 = new tp2.IPBan(iP11, (java.lang.Long)0L);
    tp2.IP iP15 = iPBan14.getIp();
    tp2.IP iP16 = null;
    iPBan14.ip = iP16;
    tp2.IP iP18 = iPBan14.ip;
    tp2.IP iP19 = iPBan14.getIp();
    tp2.SinglyLinkedList singlyLinkedList20 = new tp2.SinglyLinkedList();
    int i21 = singlyLinkedList20.getSize();
    tp2.IP iP26 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i27 = iP26.getSecond();
    java.lang.Integer i28 = iP26.getFourth();
    singlyLinkedList20.add(iP26);
    tp2.IP iP31 = singlyLinkedList20.get(5);
    boolean b32 = singlyLinkedList20.repOK();
    tp2.IP iP34 = singlyLinkedList20.get(2013265920);
    tp2.SinglyLinkedList singlyLinkedList35 = new tp2.SinglyLinkedList();
    int i36 = singlyLinkedList35.getSize();
    tp2.IP iP41 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i42 = iP41.getSecond();
    java.lang.Integer i43 = iP41.getFourth();
    singlyLinkedList35.add(iP41);
    iP41.setFourth((java.lang.Integer)167772160);
    singlyLinkedList20.add(iP41);
    java.lang.Object obj48 = null;
    boolean b49 = iP41.equals(obj48);
    iP41.setSecond((java.lang.Integer)20);
    tp2.IPBan iPBan53 = new tp2.IPBan(iP41, (java.lang.Long)20L);
    java.lang.Integer i54 = iP41.getThird();
    iP41.setFirst((java.lang.Integer)201326592);
    iPBan14.ip = iP41;
    java.lang.Integer i58 = iP41.getSecond();
    iPBan6.setIp(iP41);
    tp2.IP iP60 = iPBan6.getIp();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i12 + "' != '" + (-2)+ "'", i12.equals((-2)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i27 + "' != '" + (-1)+ "'", i27.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i28 + "' != '" + 100+ "'", i28.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i42 + "' != '" + (-1)+ "'", i42.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i43 + "' != '" + 100+ "'", i43.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b49 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i54 + "' != '" + (-1)+ "'", i54.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i58 + "' != '" + 20+ "'", i58.equals(20));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP60);

  }

  @Test
  public void test217() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test217"); }


    // The following exception was thrown during execution in test generation
    try {
      int i2 = java.lang.Integer.parseUnsignedInt("a", 59);
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test218() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test218"); }


    tp2.SinglyLinkedList singlyLinkedList0 = new tp2.SinglyLinkedList();
    boolean b1 = singlyLinkedList0.repOK();
    tp2.IP iP6 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP6.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan10 = new tp2.IPBan(iP6, (java.lang.Long)100L);
    iP6.setFourth((java.lang.Integer)32);
    singlyLinkedList0.add(iP6);
    iP6.setSecond((java.lang.Integer)212600);
    java.lang.Integer i16 = iP6.getThird();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i16 + "' != '" + (-1)+ "'", i16.equals((-1)));

  }

  @Test
  public void test219() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test219"); }


    java.lang.Integer i2 = java.lang.Integer.getInteger("405a051f", 1805647872);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i2 + "' != '" + 1805647872+ "'", i2.equals(1805647872));

  }

  @Test
  public void test220() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test220"); }


    java.lang.Integer i2 = java.lang.Integer.getInteger("1200000000", 501219385);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i2 + "' != '" + 501219385+ "'", i2.equals(501219385));

  }

  @Test
  public void test221() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test221"); }


    int i1 = java.lang.Integer.reverse(330106500);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 559986120);

  }

  @Test
  public void test222() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test222"); }


    tp2.SinglyLinkedList singlyLinkedList0 = new tp2.SinglyLinkedList();
    int i1 = singlyLinkedList0.getSize();
    tp2.IP iP6 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i7 = iP6.getSecond();
    java.lang.Integer i8 = iP6.getFourth();
    singlyLinkedList0.add(iP6);
    boolean b10 = singlyLinkedList0.repOK();
    boolean b11 = singlyLinkedList0.repOK();
    int i12 = singlyLinkedList0.getSize();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList13 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b14 = strictlySortedSinglyLinkedList13.repOK();
    boolean b15 = strictlySortedSinglyLinkedList13.repOK();
    tp2.IPBan iPBan16 = null;
    boolean b17 = strictlySortedSinglyLinkedList13.contains(iPBan16);
    tp2.IP iP22 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP22.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan26 = new tp2.IPBan(iP22, (java.lang.Long)100L);
    tp2.IP iP27 = iPBan26.ip;
    tp2.IP iP32 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP32.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan36 = new tp2.IPBan(iP32, (java.lang.Long)100L);
    iPBan26.setIp(iP32);
    java.lang.Long long38 = iPBan26.getExpires();
    tp2.IP iP39 = iPBan26.ip;
    iP39.setSecond((java.lang.Integer)11001000);
    boolean b42 = strictlySortedSinglyLinkedList13.containsIP(iP39);
    int i43 = strictlySortedSinglyLinkedList13.getSize();
    tp2.SinglyLinkedList singlyLinkedList44 = new tp2.SinglyLinkedList();
    int i45 = singlyLinkedList44.getSize();
    tp2.IP iP50 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i51 = iP50.getSecond();
    java.lang.Integer i52 = iP50.getFourth();
    singlyLinkedList44.add(iP50);
    tp2.IPBan iPBan55 = new tp2.IPBan(iP50, (java.lang.Long)100L);
    tp2.IP iP56 = iPBan55.getIp();
    boolean b57 = strictlySortedSinglyLinkedList13.contains(iPBan55);
    tp2.IP iP58 = iPBan55.getIp();
    tp2.SinglyLinkedList singlyLinkedList59 = new tp2.SinglyLinkedList();
    boolean b60 = singlyLinkedList59.repOK();
    tp2.IP iP62 = singlyLinkedList59.get(200);
    boolean b63 = singlyLinkedList59.isEmpty();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList64 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b65 = strictlySortedSinglyLinkedList64.repOK();
    tp2.IP iP70 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i71 = iP70.getSecond();
    iP70.setFirst((java.lang.Integer)11001000);
    iP70.setFirst((java.lang.Integer)(-2147483648));
    boolean b76 = strictlySortedSinglyLinkedList64.removeFromIP(iP70);
    boolean b77 = singlyLinkedList59.remove(iP70);
    iP70.setThird((java.lang.Integer)8);
    iPBan55.setIp(iP70);
    tp2.IPBan iPBan82 = new tp2.IPBan(iP70, (java.lang.Long)2013265920L);
    iP70.setFirst((java.lang.Integer)1200000000);
    singlyLinkedList0.add(iP70);
    int i86 = singlyLinkedList0.getSize();
    int i87 = singlyLinkedList0.getSize();
    boolean b88 = singlyLinkedList0.isEmpty();
    int i89 = singlyLinkedList0.getSize();
    
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
    org.junit.Assert.assertTrue(i12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long38 + "' != '" + 100L+ "'", long38.equals(100L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i43 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i45 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i51 + "' != '" + (-1)+ "'", i51.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i52 + "' != '" + 100+ "'", i52.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b57 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP58);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b60 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP62);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b63 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b65 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i71 + "' != '" + (-1)+ "'", i71.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b76 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b77 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i86 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i87 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b88 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i89 == 2);

  }

  @Test
  public void test223() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test223"); }


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
    tp2.SinglyLinkedList singlyLinkedList27 = new tp2.SinglyLinkedList();
    boolean b28 = singlyLinkedList27.repOK();
    int i29 = singlyLinkedList27.getSize();
    boolean b30 = singlyLinkedList27.isEmpty();
    tp2.IP iP35 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP35.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan39 = new tp2.IPBan(iP35, (java.lang.Long)100L);
    tp2.IP iP40 = iPBan39.ip;
    tp2.IP iP45 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i46 = iP45.getFourth();
    java.lang.Integer i47 = iP45.getFourth();
    iP45.setThird((java.lang.Integer)200);
    iPBan39.ip = iP45;
    iP45.setFirst((java.lang.Integer)16777216);
    boolean b53 = singlyLinkedList27.contains(iP45);
    tp2.SinglyLinkedList singlyLinkedList54 = new tp2.SinglyLinkedList();
    boolean b55 = singlyLinkedList54.repOK();
    tp2.IP iP57 = singlyLinkedList54.get(200);
    boolean b58 = singlyLinkedList54.isEmpty();
    boolean b59 = singlyLinkedList54.repOK();
    boolean b60 = singlyLinkedList54.repOK();
    tp2.IP iP65 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i66 = iP65.getThird();
    singlyLinkedList54.add(iP65);
    java.lang.Integer i68 = iP65.getFourth();
    boolean b69 = singlyLinkedList27.contains(iP65);
    boolean b70 = singlyLinkedList0.contains(iP65);
    iP65.setFirst((java.lang.Integer)382723331);
    java.lang.Integer i73 = iP65.getThird();
    tp2.IPBan iPBan75 = new tp2.IPBan(iP65, (java.lang.Long)256L);
    java.lang.Long long76 = iPBan75.getExpires();
    
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
    org.junit.Assert.assertTrue(i29 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i46 + "' != '" + 100+ "'", i46.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i47 + "' != '" + 100+ "'", i47.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b53 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b55 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b58 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b59 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b60 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i66 + "' != '" + (-1)+ "'", i66.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i68 + "' != '" + 100+ "'", i68.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b69 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b70 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i73 + "' != '" + (-1)+ "'", i73.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long76 + "' != '" + 256L+ "'", long76.equals(256L));

  }

  @Test
  public void test224() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test224"); }


    // The following exception was thrown during execution in test generation
    try {
      int i2 = java.lang.Integer.parseInt("100510", (-999872768));
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

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test225"); }


    int i2 = java.lang.Integer.compareUnsigned(572981248, (-1073741790));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == (-1));

  }

  @Test
  public void test226() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test226"); }


    int i2 = java.lang.Integer.sum((-1241513727), 33554838);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == (-1207958889));

  }

  @Test
  public void test227() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test227"); }


    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList0 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b1 = strictlySortedSinglyLinkedList0.repOK();
    tp2.IP iP6 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i7 = iP6.getSecond();
    iP6.setFirst((java.lang.Integer)11001000);
    iP6.setFirst((java.lang.Integer)(-2147483648));
    boolean b12 = strictlySortedSinglyLinkedList0.removeFromIP(iP6);
    tp2.IPBan iPBan14 = strictlySortedSinglyLinkedList0.get((-1));
    tp2.IPBan iPBan16 = strictlySortedSinglyLinkedList0.get(16);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList17 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b18 = strictlySortedSinglyLinkedList17.isEmpty();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList19 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b20 = strictlySortedSinglyLinkedList19.repOK();
    tp2.IP iP25 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    boolean b26 = strictlySortedSinglyLinkedList19.containsIP(iP25);
    tp2.Node node27 = strictlySortedSinglyLinkedList19.header;
    strictlySortedSinglyLinkedList17.header = node27;
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList29 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b30 = strictlySortedSinglyLinkedList29.repOK();
    strictlySortedSinglyLinkedList29.size = 1;
    strictlySortedSinglyLinkedList29.size = 0;
    tp2.IP iP39 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP39.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan43 = new tp2.IPBan(iP39, (java.lang.Long)100L);
    tp2.IP iP48 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP48.setFirst((java.lang.Integer)200);
    java.lang.Integer i51 = iP48.getFourth();
    iPBan43.setIp(iP48);
    boolean b53 = strictlySortedSinglyLinkedList29.contains(iPBan43);
    boolean b54 = strictlySortedSinglyLinkedList17.contains(iPBan43);
    tp2.SinglyLinkedList singlyLinkedList55 = new tp2.SinglyLinkedList();
    int i56 = singlyLinkedList55.getSize();
    int i57 = singlyLinkedList55.getSize();
    tp2.IP iP58 = null;
    boolean b59 = singlyLinkedList55.contains(iP58);
    tp2.IP iP61 = singlyLinkedList55.get(27);
    tp2.IP iP66 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP66.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan70 = new tp2.IPBan(iP66, (java.lang.Long)100L);
    tp2.IP iP71 = iPBan70.ip;
    tp2.IP iP76 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP76.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan80 = new tp2.IPBan(iP76, (java.lang.Long)100L);
    iPBan70.setIp(iP76);
    boolean b82 = singlyLinkedList55.remove(iP76);
    iPBan43.ip = iP76;
    boolean b84 = strictlySortedSinglyLinkedList0.add(iPBan43);
    tp2.IP iP85 = iPBan43.ip;
    tp2.IP iP90 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i91 = iP90.getThird();
    java.lang.Integer i92 = iP90.getFourth();
    java.lang.Integer i93 = iP90.getFirst();
    iPBan43.setIp(iP90);
    tp2.IP iP95 = iPBan43.ip;
    tp2.IP iP96 = iPBan43.ip;
    java.lang.Long long97 = iPBan43.getExpires();
    
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
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i51 + "' != '" + 100+ "'", i51.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b53 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b54 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i56 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i57 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b59 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP61);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP71);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b82 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b84 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP85);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i91 + "' != '" + (-1)+ "'", i91.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i92 + "' != '" + 100+ "'", i92.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i93 + "' != '" + (-1)+ "'", i93.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP95);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP96);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long97 + "' != '" + 100L+ "'", long97.equals(100L));

  }

  @Test
  public void test228() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test228"); }


    int i2 = java.lang.Integer.max(204416, 805465858);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 805465858);

  }

  @Test
  public void test229() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test229"); }


    java.lang.String str2 = java.lang.Integer.toUnsignedString(1002285416, 509066);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1002285416"+ "'", str2.equals("1002285416"));

  }

  @Test
  public void test230() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test230"); }


    tp2.IP iP4 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i5 = iP4.getSecond();
    java.lang.Integer i6 = iP4.getFourth();
    iP4.setFirst((java.lang.Integer)5);
    tp2.IPBan iPBan10 = new tp2.IPBan(iP4, (java.lang.Long)92L);
    tp2.IP iP11 = iPBan10.getIp();
    java.lang.Integer i12 = iP11.getFourth();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i5 + "' != '" + (-1)+ "'", i5.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i6 + "' != '" + 100+ "'", i6.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i12 + "' != '" + 100+ "'", i12.equals(100));

  }

  @Test
  public void test231() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test231"); }


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
    java.lang.Integer i38 = iP30.getFirst();
    iP30.setFourth((java.lang.Integer)1694498843);
    tp2.IPBan iPBan42 = new tp2.IPBan(iP30, (java.lang.Long)40001242L);
    java.lang.Long long43 = iPBan42.expires;
    tp2.IP iP44 = iPBan42.ip;
    
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
    org.junit.Assert.assertTrue("'" + i38 + "' != '" + (-1)+ "'", i38.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long43 + "' != '" + 40001242L+ "'", long43.equals(40001242L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP44);

  }

  @Test
  public void test232() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test232"); }


    int i1 = java.lang.Integer.highestOneBit(1079641375);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 1073741824);

  }

  @Test
  public void test233() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test233"); }


    int i1 = java.lang.Integer.reverseBytes((-2131611287));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 1764881024);

  }

  @Test
  public void test234() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test234"); }


    int i2 = java.lang.Integer.rotateLeft(59936, (-926413884));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 958976);

  }

  @Test
  public void test235() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test235"); }


    tp2.IP iP4 = new tp2.IP((java.lang.Integer)(-383272663), (java.lang.Integer)(-2131611287), (java.lang.Integer)48, (java.lang.Integer)77596672);

  }

  @Test
  public void test236() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test236"); }


    int i2 = java.lang.Integer.remainderUnsigned(26, 37469776);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 26);

  }

  @Test
  public void test237() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test237"); }


    int i2 = java.lang.Integer.remainderUnsigned(718060453, 2625003);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1434634);

  }

  @Test
  public void test238() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test238"); }


    int i1 = java.lang.Integer.numberOfTrailingZeros(1213994247);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);

  }

  @Test
  public void test239() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test239"); }


    java.lang.Integer i1 = java.lang.Integer.valueOf((-520173875));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + (-520173875)+ "'", i1.equals((-520173875)));

  }

  @Test
  public void test240() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test240"); }


    // The following exception was thrown during execution in test generation
    try {
      int i1 = java.lang.Integer.parseUnsignedInt("32101000000");
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

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test241"); }


    tp2.SinglyLinkedList singlyLinkedList0 = new tp2.SinglyLinkedList();
    int i1 = singlyLinkedList0.getSize();
    tp2.IP iP6 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i7 = iP6.getSecond();
    iP6.setFirst((java.lang.Integer)11001000);
    iP6.setFirst((java.lang.Integer)32);
    boolean b12 = singlyLinkedList0.remove(iP6);
    tp2.IP iP14 = singlyLinkedList0.get((-671088640));
    tp2.SinglyLinkedList singlyLinkedList15 = new tp2.SinglyLinkedList();
    boolean b16 = singlyLinkedList15.repOK();
    tp2.IP iP18 = singlyLinkedList15.get(200);
    boolean b19 = singlyLinkedList15.isEmpty();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList20 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b21 = strictlySortedSinglyLinkedList20.repOK();
    tp2.IP iP26 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i27 = iP26.getSecond();
    iP26.setFirst((java.lang.Integer)11001000);
    iP26.setFirst((java.lang.Integer)(-2147483648));
    boolean b32 = strictlySortedSinglyLinkedList20.removeFromIP(iP26);
    boolean b33 = singlyLinkedList15.remove(iP26);
    iP26.setThird((java.lang.Integer)8);
    boolean b36 = singlyLinkedList0.contains(iP26);
    tp2.IP iP38 = singlyLinkedList0.get((-671088640));
    int i39 = singlyLinkedList0.getSize();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList40 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b41 = strictlySortedSinglyLinkedList40.isEmpty();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList42 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b43 = strictlySortedSinglyLinkedList42.repOK();
    tp2.IP iP48 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    boolean b49 = strictlySortedSinglyLinkedList42.containsIP(iP48);
    tp2.Node node50 = strictlySortedSinglyLinkedList42.header;
    strictlySortedSinglyLinkedList40.header = node50;
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList52 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b53 = strictlySortedSinglyLinkedList52.repOK();
    strictlySortedSinglyLinkedList52.size = 1;
    strictlySortedSinglyLinkedList52.size = 0;
    tp2.IP iP62 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP62.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan66 = new tp2.IPBan(iP62, (java.lang.Long)100L);
    tp2.IP iP71 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP71.setFirst((java.lang.Integer)200);
    java.lang.Integer i74 = iP71.getFourth();
    iPBan66.setIp(iP71);
    boolean b76 = strictlySortedSinglyLinkedList52.contains(iPBan66);
    boolean b77 = strictlySortedSinglyLinkedList40.contains(iPBan66);
    tp2.IP iP78 = iPBan66.ip;
    boolean b80 = iP78.equals((java.lang.Object)117440640);
    java.lang.Integer i81 = iP78.getSecond();
    java.lang.Integer i82 = iP78.getFourth();
    boolean b83 = singlyLinkedList0.remove(iP78);
    int i84 = singlyLinkedList0.getSize();
    boolean b85 = singlyLinkedList0.repOK();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i7 + "' != '" + (-1)+ "'", i7.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i27 + "' != '" + (-1)+ "'", i27.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i39 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b43 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b49 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b53 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i74 + "' != '" + 100+ "'", i74.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b76 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b77 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP78);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b80 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i81 + "' != '" + (-1)+ "'", i81.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i82 + "' != '" + 100+ "'", i82.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b83 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i84 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b85 == true);

  }

  @Test
  public void test242() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test242"); }


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
    iP38.setSecond((java.lang.Integer)105353375);
    
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

  }

  @Test
  public void test243() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test243"); }


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
    int i54 = strictlySortedSinglyLinkedList0.getSize();
    tp2.Node node55 = strictlySortedSinglyLinkedList0.header;
    tp2.Node node56 = strictlySortedSinglyLinkedList0.header;
    
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
    org.junit.Assert.assertTrue(i54 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node55);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node56);

  }

  @Test
  public void test244() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test244"); }


    java.lang.String str1 = java.lang.Integer.toOctalString(868364359);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "6360430107"+ "'", str1.equals("6360430107"));

  }

  @Test
  public void test245() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test245"); }


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
    int i80 = strictlySortedSinglyLinkedList0.getSize();
    
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
    org.junit.Assert.assertTrue(i80 == 2);

  }

  @Test
  public void test246() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test246"); }


    int i1 = java.lang.Integer.reverse(51756346);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 1555933376);

  }

  @Test
  public void test247() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test247"); }


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
    int i62 = singlyLinkedList61.getSize();
    tp2.IP iP67 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i68 = iP67.getSecond();
    java.lang.Integer i69 = iP67.getFourth();
    singlyLinkedList61.add(iP67);
    tp2.IP iP72 = singlyLinkedList61.get(5);
    boolean b73 = singlyLinkedList61.repOK();
    tp2.IP iP75 = singlyLinkedList61.get(2013265920);
    tp2.SinglyLinkedList singlyLinkedList76 = new tp2.SinglyLinkedList();
    int i77 = singlyLinkedList76.getSize();
    tp2.IP iP82 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i83 = iP82.getSecond();
    java.lang.Integer i84 = iP82.getFourth();
    singlyLinkedList76.add(iP82);
    iP82.setFourth((java.lang.Integer)167772160);
    singlyLinkedList61.add(iP82);
    java.lang.Object obj89 = null;
    boolean b90 = iP82.equals(obj89);
    boolean b91 = singlyLinkedList0.contains(iP82);
    int i92 = singlyLinkedList0.getSize();
    boolean b93 = singlyLinkedList0.isEmpty();
    
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
    org.junit.Assert.assertTrue(i62 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i68 + "' != '" + (-1)+ "'", i68.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i69 + "' != '" + 100+ "'", i69.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP72);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b73 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP75);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i77 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i83 + "' != '" + (-1)+ "'", i83.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i84 + "' != '" + 100+ "'", i84.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b90 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b91 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i92 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b93 == false);

  }

  @Test
  public void test248() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test248"); }


    int i1 = java.lang.Integer.signum(12606485);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 1);

  }

  @Test
  public void test249() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test249"); }


    int i1 = java.lang.Integer.reverseBytes(637535242);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 168034342);

  }

  @Test
  public void test250() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test250"); }


    int i2 = java.lang.Integer.min((-1919531456), (-1367567033));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == (-1919531456));

  }

  @Test
  public void test251() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test251"); }


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
    tp2.IP iP32 = new tp2.IP((java.lang.Integer)160, (java.lang.Integer)1, (java.lang.Integer)27, (java.lang.Integer)(-2));
    java.lang.Integer i33 = iP32.getFourth();
    tp2.IPBan iPBan35 = new tp2.IPBan(iP32, (java.lang.Long)0L);
    boolean b36 = strictlySortedSinglyLinkedList0.add(iPBan35);
    int i37 = strictlySortedSinglyLinkedList0.getSize();
    tp2.IP iP42 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP42.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan46 = new tp2.IPBan(iP42, (java.lang.Long)100L);
    tp2.IP iP51 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iPBan46.setIp(iP51);
    iP51.setSecond((java.lang.Integer)8);
    iP51.setFourth((java.lang.Integer)24);
    java.lang.Integer i57 = iP51.getThird();
    iP51.setFirst((java.lang.Integer)4103436);
    iP51.setThird((java.lang.Integer)131116);
    boolean b62 = strictlySortedSinglyLinkedList0.containsIP(iP51);
    
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
    org.junit.Assert.assertTrue("'" + i33 + "' != '" + (-2)+ "'", i33.equals((-2)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i37 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i57 + "' != '" + (-1)+ "'", i57.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b62 == false);

  }

  @Test
  public void test252() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test252"); }


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
    tp2.IP iP42 = new tp2.IP((java.lang.Integer)160, (java.lang.Integer)1, (java.lang.Integer)27, (java.lang.Integer)(-2));
    java.lang.Integer i43 = iP42.getFourth();
    tp2.IPBan iPBan45 = new tp2.IPBan(iP42, (java.lang.Long)0L);
    tp2.IP iP46 = iPBan45.ip;
    tp2.IPBan iPBan48 = new tp2.IPBan(iP46, (java.lang.Long)6294016L);
    boolean b49 = strictlySortedSinglyLinkedList0.removeFromIP(iP46);
    iP46.setFourth((java.lang.Integer)6034312);
    
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
    org.junit.Assert.assertTrue("'" + i43 + "' != '" + (-2)+ "'", i43.equals((-2)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b49 == false);

  }

  @Test
  public void test253() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test253"); }


    int i2 = java.lang.Integer.rotateRight(335561671, 255633168);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1137120256);

  }

  @Test
  public void test254() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test254"); }


    int i2 = java.lang.Integer.compare(1451229184, (-669283115));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);

  }

  @Test
  public void test255() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test255"); }


    // The following exception was thrown during execution in test generation
    try {
      int i2 = java.lang.Integer.parseInt("1885180690", 106896);
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test256() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test256"); }


    int i2 = java.lang.Integer.remainderUnsigned(88000000, 111);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 88);

  }

  @Test
  public void test257() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test257"); }


    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList0 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b1 = strictlySortedSinglyLinkedList0.repOK();
    tp2.IP iP6 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    boolean b7 = strictlySortedSinglyLinkedList0.containsIP(iP6);
    tp2.IPBan iPBan9 = strictlySortedSinglyLinkedList0.get(176016000);
    int i10 = strictlySortedSinglyLinkedList0.getSize();
    boolean b11 = strictlySortedSinglyLinkedList0.isEmpty();
    int i12 = strictlySortedSinglyLinkedList0.getSize();
    boolean b13 = strictlySortedSinglyLinkedList0.isEmpty();
    tp2.IPBan iPBan15 = strictlySortedSinglyLinkedList0.get(33566720);
    tp2.Node node16 = strictlySortedSinglyLinkedList0.header;
    strictlySortedSinglyLinkedList0.size = 78;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iPBan9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iPBan15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node16);

  }

  @Test
  public void test258() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test258"); }


    // The following exception was thrown during execution in test generation
    try {
      java.lang.Integer i1 = java.lang.Integer.decode("10010000100000111001010000");
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

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test259"); }


    java.lang.Integer i1 = java.lang.Integer.valueOf((-1734966848));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + (-1734966848)+ "'", i1.equals((-1734966848)));

  }

  @Test
  public void test260() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test260"); }


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
    tp2.IPBan iPBan19 = strictlySortedSinglyLinkedList0.get(1140850688);
    boolean b20 = strictlySortedSinglyLinkedList0.isEmpty();
    boolean b21 = strictlySortedSinglyLinkedList0.isEmpty();
    
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
    org.junit.Assert.assertNull(iPBan19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);

  }

  @Test
  public void test261() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test261"); }


    java.lang.Integer i1 = new java.lang.Integer(819200);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 819200+ "'", i1.equals(819200));

  }

  @Test
  public void test262() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test262"); }


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
    tp2.IP iP47 = singlyLinkedList0.get((-1879048192));
    int i48 = singlyLinkedList0.getSize();
    boolean b49 = singlyLinkedList0.repOK();
    tp2.IP iP51 = singlyLinkedList0.get(369824512);
    
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
    org.junit.Assert.assertNotNull(iP47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i48 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b49 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP51);

  }

  @Test
  public void test263() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test263"); }


    int i1 = java.lang.Integer.numberOfTrailingZeros(327045886);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 1);

  }

  @Test
  public void test264() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test264"); }


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
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList16 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b17 = strictlySortedSinglyLinkedList16.repOK();
    strictlySortedSinglyLinkedList16.size = 1;
    strictlySortedSinglyLinkedList16.size = 0;
    tp2.IP iP26 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP26.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan30 = new tp2.IPBan(iP26, (java.lang.Long)100L);
    tp2.IP iP31 = iPBan30.ip;
    boolean b32 = strictlySortedSinglyLinkedList16.contains(iPBan30);
    boolean b33 = strictlySortedSinglyLinkedList16.repOK();
    tp2.SinglyLinkedList singlyLinkedList34 = new tp2.SinglyLinkedList();
    int i35 = singlyLinkedList34.getSize();
    tp2.IP iP40 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i41 = iP40.getSecond();
    java.lang.Integer i42 = iP40.getFourth();
    singlyLinkedList34.add(iP40);
    boolean b45 = iP40.equals((java.lang.Object)2147483647);
    tp2.IPBan iPBan47 = new tp2.IPBan(iP40, (java.lang.Long)(-1L));
    boolean b48 = strictlySortedSinglyLinkedList16.add(iPBan47);
    iPBan47.setExpires((java.lang.Long)0L);
    java.lang.Long long51 = iPBan47.getExpires();
    boolean b52 = strictlySortedSinglyLinkedList0.contains(iPBan47);
    boolean b53 = strictlySortedSinglyLinkedList0.isEmpty();
    int i54 = strictlySortedSinglyLinkedList0.getSize();
    boolean b55 = strictlySortedSinglyLinkedList0.isEmpty();
    boolean b56 = strictlySortedSinglyLinkedList0.repOK();
    
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
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i35 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i41 + "' != '" + (-1)+ "'", i41.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i42 + "' != '" + 100+ "'", i42.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b48 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long51 + "' != '" + 0L+ "'", long51.equals(0L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b52 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b53 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i54 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b55 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b56 == true);

  }

  @Test
  public void test265() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test265"); }


    int i2 = java.lang.Integer.remainderUnsigned(6409310, (-671088640));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 6409310);

  }

  @Test
  public void test266() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test266"); }


    tp2.SinglyLinkedList singlyLinkedList0 = new tp2.SinglyLinkedList();
    int i1 = singlyLinkedList0.getSize();
    tp2.IP iP6 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i7 = iP6.getSecond();
    java.lang.Integer i8 = iP6.getFourth();
    singlyLinkedList0.add(iP6);
    boolean b10 = singlyLinkedList0.repOK();
    int i11 = singlyLinkedList0.getSize();
    tp2.IP iP13 = singlyLinkedList0.get(13);
    tp2.IP iP18 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP18.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan22 = new tp2.IPBan(iP18, (java.lang.Long)100L);
    tp2.IP iP27 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iPBan22.setIp(iP27);
    iP27.setSecond((java.lang.Integer)8);
    iP27.setFourth((java.lang.Integer)24);
    boolean b33 = singlyLinkedList0.remove(iP27);
    tp2.IP iP35 = singlyLinkedList0.get(637534224);
    boolean b36 = singlyLinkedList0.repOK();
    tp2.IP iP41 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP41.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan45 = new tp2.IPBan(iP41, (java.lang.Long)100L);
    tp2.IP iP46 = iPBan45.ip;
    tp2.IP iP51 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP51.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan55 = new tp2.IPBan(iP51, (java.lang.Long)100L);
    iPBan45.setIp(iP51);
    iP51.setSecond((java.lang.Integer)(-1));
    java.lang.Integer i59 = iP51.getThird();
    java.lang.Integer i60 = iP51.getThird();
    java.lang.Integer i61 = iP51.getSecond();
    iP51.setThird((java.lang.Integer)1308183544);
    boolean b64 = singlyLinkedList0.contains(iP51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i7 + "' != '" + (-1)+ "'", i7.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i8 + "' != '" + 100+ "'", i8.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i59 + "' != '" + (-1)+ "'", i59.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i60 + "' != '" + (-1)+ "'", i60.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i61 + "' != '" + (-1)+ "'", i61.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b64 == false);

  }

  @Test
  public void test267() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test267"); }


    int i1 = java.lang.Integer.reverseBytes((-1610606592));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 1573024);

  }

  @Test
  public void test268() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test268"); }


    java.lang.Integer i1 = new java.lang.Integer("49288");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 49288+ "'", i1.equals(49288));

  }

  @Test
  public void test269() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test269"); }


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
    tp2.IP iP53 = null;
    boolean b54 = singlyLinkedList0.remove(iP53);
    
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
    org.junit.Assert.assertTrue(b54 == false);

  }

  @Test
  public void test270() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test270"); }


    // The following exception was thrown during execution in test generation
    try {
      int i2 = java.lang.Integer.parseInt("10010100000000000000000000000", (-1641726692));
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

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test271"); }


    // The following exception was thrown during execution in test generation
    try {
      java.lang.Integer i2 = java.lang.Integer.valueOf("88000000", (-1638982400));
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

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test272"); }


    int i2 = java.lang.Integer.rotateRight(1378951, 291017708);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == (-1469054640));

  }

  @Test
  public void test273() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test273"); }


    int i2 = java.lang.Integer.divideUnsigned(1805647872, (-1967485951));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);

  }

  @Test
  public void test274() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test274"); }


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
    tp2.IP iP37 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP37.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan41 = new tp2.IPBan(iP37, (java.lang.Long)100L);
    tp2.IP iP42 = iPBan41.ip;
    tp2.IP iP43 = iPBan41.getIp();
    java.lang.Integer i44 = null;
    iP43.setFirst(i44);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList46 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b47 = strictlySortedSinglyLinkedList46.repOK();
    tp2.IP iP52 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i53 = iP52.getSecond();
    iP52.setFirst((java.lang.Integer)11001000);
    iP52.setFirst((java.lang.Integer)(-2147483648));
    boolean b58 = strictlySortedSinglyLinkedList46.removeFromIP(iP52);
    boolean b59 = iP43.equals((java.lang.Object)strictlySortedSinglyLinkedList46);
    tp2.IP iP64 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP64.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan68 = new tp2.IPBan(iP64, (java.lang.Long)100L);
    boolean b69 = strictlySortedSinglyLinkedList46.removeFromIP(iP64);
    java.lang.Integer i70 = iP64.getFirst();
    iPBan8.setIp(iP64);
    java.lang.Integer i72 = iP64.getSecond();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i29 + "' != '" + 200+ "'", i29.equals(200));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i30 + "' != '" + 100+ "'", i30.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b47 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i53 + "' != '" + (-1)+ "'", i53.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b58 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b59 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b69 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i70 + "' != '" + 200+ "'", i70.equals(200));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i72 + "' != '" + (-1)+ "'", i72.equals((-1)));

  }

  @Test
  public void test275() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test275"); }


    int i1 = java.lang.Integer.parseUnsignedInt("134000000");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 134000000);

  }

  @Test
  public void test276() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test276"); }


    java.lang.Integer i2 = java.lang.Integer.getInteger("1071236360", (java.lang.Integer)(-1911944136));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i2 + "' != '" + (-1911944136)+ "'", i2.equals((-1911944136)));

  }

  @Test
  public void test277() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test277"); }


    java.lang.Integer i1 = new java.lang.Integer("1078352608");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 1078352608+ "'", i1.equals(1078352608));

  }

  @Test
  public void test278() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test278"); }


    // The following exception was thrown during execution in test generation
    try {
      java.lang.Integer i2 = java.lang.Integer.valueOf("3538157327", 5060067);
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test279() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test279"); }


    java.lang.String str1 = java.lang.Integer.toBinaryString((-2136167766));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "10000000101011001010101010101010"+ "'", str1.equals("10000000101011001010101010101010"));

  }

  @Test
  public void test280() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test280"); }


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
    iP50.setFourth((java.lang.Integer)(-794967260));
    java.lang.Integer i53 = iP50.getSecond();
    
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
    org.junit.Assert.assertTrue("'" + i53 + "' != '" + (-1)+ "'", i53.equals((-1)));

  }

  @Test
  public void test281() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test281"); }


    // The following exception was thrown during execution in test generation
    try {
      java.lang.Integer i2 = java.lang.Integer.valueOf("6000125402", 1073741849);
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test282() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test282"); }


    int i1 = java.lang.Integer.highestOneBit((-788267008));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == (-2147483648));

  }

  @Test
  public void test283() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test283"); }


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
    iP40.setFourth((java.lang.Integer)1073769824);
    iP40.setThird((java.lang.Integer)335434366);
    
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

  }

  @Test
  public void test284() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test284"); }


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
    tp2.Node node29 = strictlySortedSinglyLinkedList0.header;
    tp2.IP iP34 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP34.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan38 = new tp2.IPBan(iP34, (java.lang.Long)100L);
    tp2.IP iP39 = iPBan38.ip;
    tp2.IP iP40 = iPBan38.ip;
    boolean b41 = strictlySortedSinglyLinkedList0.add(iPBan38);
    tp2.IP iP42 = iPBan38.ip;
    java.lang.Long long43 = iPBan38.getExpires();
    
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
    org.junit.Assert.assertNotNull(node29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long43 + "' != '" + 100L+ "'", long43.equals(100L));

  }

  @Test
  public void test285() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test285"); }


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
    tp2.IPBan iPBan50 = new tp2.IPBan(iP39, (java.lang.Long)38L);
    tp2.IPBan iPBan52 = new tp2.IPBan(iP39, (java.lang.Long)38L);
    tp2.SinglyLinkedList singlyLinkedList53 = new tp2.SinglyLinkedList();
    int i54 = singlyLinkedList53.getSize();
    tp2.IP iP59 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i60 = iP59.getSecond();
    java.lang.Integer i61 = iP59.getFourth();
    singlyLinkedList53.add(iP59);
    tp2.IPBan iPBan64 = new tp2.IPBan(iP59, (java.lang.Long)100L);
    iP59.setThird((java.lang.Integer)(-2147483641));
    java.lang.Integer i67 = iP59.getSecond();
    boolean b68 = iP39.equals((java.lang.Object)iP59);
    iP39.setFourth((java.lang.Integer)1738670112);
    
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
    org.junit.Assert.assertTrue(i54 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i60 + "' != '" + (-1)+ "'", i60.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i61 + "' != '" + 100+ "'", i61.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i67 + "' != '" + (-1)+ "'", i67.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b68 == true);

  }

  @Test
  public void test286() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test286"); }


    int i2 = java.lang.Integer.remainderUnsigned(536870921, 2048);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 9);

  }

  @Test
  public void test287() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test287"); }


    int i2 = java.lang.Integer.divideUnsigned(1335431, 99614720);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);

  }

  @Test
  public void test288() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test288"); }


    int i1 = java.lang.Integer.bitCount(856523456);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 11);

  }

  @Test
  public void test289() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test289"); }


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
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList26 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b27 = strictlySortedSinglyLinkedList26.repOK();
    strictlySortedSinglyLinkedList26.size = 1;
    strictlySortedSinglyLinkedList26.size = 0;
    tp2.IP iP36 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP36.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan40 = new tp2.IPBan(iP36, (java.lang.Long)100L);
    tp2.IP iP41 = iPBan40.ip;
    boolean b42 = strictlySortedSinglyLinkedList26.contains(iPBan40);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList43 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IPBan iPBan44 = null;
    boolean b45 = strictlySortedSinglyLinkedList43.add(iPBan44);
    int i46 = strictlySortedSinglyLinkedList43.getSize();
    tp2.Node node47 = strictlySortedSinglyLinkedList43.header;
    strictlySortedSinglyLinkedList26.header = node47;
    strictlySortedSinglyLinkedList0.header = node47;
    tp2.Node node50 = strictlySortedSinglyLinkedList0.header;
    tp2.SinglyLinkedList singlyLinkedList51 = new tp2.SinglyLinkedList();
    int i52 = singlyLinkedList51.getSize();
    tp2.IP iP57 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i58 = iP57.getSecond();
    java.lang.Integer i59 = iP57.getFourth();
    singlyLinkedList51.add(iP57);
    tp2.IP iP62 = singlyLinkedList51.get(5);
    boolean b63 = singlyLinkedList51.repOK();
    tp2.IP iP65 = singlyLinkedList51.get(2013265920);
    tp2.IP iP67 = singlyLinkedList51.get((-1));
    tp2.SinglyLinkedList singlyLinkedList68 = new tp2.SinglyLinkedList();
    boolean b69 = singlyLinkedList68.repOK();
    int i70 = singlyLinkedList68.getSize();
    boolean b71 = singlyLinkedList68.isEmpty();
    tp2.IP iP76 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i77 = iP76.getSecond();
    iP76.setFirst((java.lang.Integer)11001000);
    iP76.setFirst((java.lang.Integer)32);
    java.lang.Integer i82 = iP76.getFourth();
    boolean b83 = singlyLinkedList68.contains(iP76);
    boolean b84 = singlyLinkedList51.contains(iP76);
    java.lang.Integer i85 = iP76.getSecond();
    iP76.setSecond((java.lang.Integer)744529281);
    iP76.setThird((java.lang.Integer)(-1021985471));
    // The following exception was thrown during execution in test generation
    try {
      boolean b90 = strictlySortedSinglyLinkedList0.containsIP(iP76);
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
    org.junit.Assert.assertTrue(b27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i46 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i52 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i58 + "' != '" + (-1)+ "'", i58.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i59 + "' != '" + 100+ "'", i59.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP62);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b63 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP65);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP67);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b69 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i70 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b71 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i77 + "' != '" + (-1)+ "'", i77.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i82 + "' != '" + 100+ "'", i82.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b83 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b84 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i85 + "' != '" + (-1)+ "'", i85.equals((-1)));

  }

  @Test
  public void test290() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test290"); }


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
    tp2.Node node28 = strictlySortedSinglyLinkedList0.header;
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList29 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b30 = strictlySortedSinglyLinkedList29.repOK();
    tp2.IP iP35 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    boolean b36 = strictlySortedSinglyLinkedList29.containsIP(iP35);
    int i37 = strictlySortedSinglyLinkedList29.getSize();
    tp2.SinglyLinkedList singlyLinkedList38 = new tp2.SinglyLinkedList();
    int i39 = singlyLinkedList38.getSize();
    tp2.IP iP44 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i45 = iP44.getSecond();
    java.lang.Integer i46 = iP44.getFourth();
    singlyLinkedList38.add(iP44);
    tp2.IPBan iPBan49 = new tp2.IPBan(iP44, (java.lang.Long)100L);
    iPBan49.expires = 10L;
    tp2.IP iP52 = iPBan49.getIp();
    iPBan49.expires = 0L;
    java.lang.Long long55 = iPBan49.expires;
    boolean b56 = strictlySortedSinglyLinkedList29.add(iPBan49);
    int i57 = strictlySortedSinglyLinkedList29.getSize();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList58 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b59 = strictlySortedSinglyLinkedList58.repOK();
    tp2.IP iP64 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i65 = iP64.getSecond();
    iP64.setFirst((java.lang.Integer)11001000);
    iP64.setFirst((java.lang.Integer)(-2147483648));
    boolean b70 = strictlySortedSinglyLinkedList58.removeFromIP(iP64);
    tp2.IPBan iPBan71 = null;
    boolean b72 = strictlySortedSinglyLinkedList58.add(iPBan71);
    tp2.Node node73 = strictlySortedSinglyLinkedList58.header;
    tp2.Node node74 = strictlySortedSinglyLinkedList58.header;
    strictlySortedSinglyLinkedList29.header = node74;
    strictlySortedSinglyLinkedList0.header = node74;
    strictlySortedSinglyLinkedList0.size = 37;
    tp2.IPBan iPBan80 = strictlySortedSinglyLinkedList0.get(54345728);
    tp2.IPBan iPBan82 = strictlySortedSinglyLinkedList0.get(327045886);
    
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
    org.junit.Assert.assertNotNull(node28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i37 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i39 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i45 + "' != '" + (-1)+ "'", i45.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i46 + "' != '" + 100+ "'", i46.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long55 + "' != '" + 0L+ "'", long55.equals(0L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b56 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i57 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b59 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i65 + "' != '" + (-1)+ "'", i65.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b70 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b72 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node73);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node74);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iPBan80);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iPBan82);

  }

  @Test
  public void test291() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test291"); }


    tp2.SinglyLinkedList singlyLinkedList0 = new tp2.SinglyLinkedList();
    boolean b1 = singlyLinkedList0.repOK();
    tp2.IP iP6 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP6.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan10 = new tp2.IPBan(iP6, (java.lang.Long)100L);
    iP6.setFourth((java.lang.Integer)32);
    singlyLinkedList0.add(iP6);
    tp2.IP iP18 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP18.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan22 = new tp2.IPBan(iP18, (java.lang.Long)100L);
    tp2.IP iP27 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP27.setFirst((java.lang.Integer)200);
    java.lang.Integer i30 = iP27.getFourth();
    iPBan22.setIp(iP27);
    java.lang.Long long32 = iPBan22.expires;
    iPBan22.expires = (-1L);
    java.lang.Long long35 = iPBan22.expires;
    tp2.IP iP36 = iPBan22.getIp();
    tp2.IP iP37 = iPBan22.ip;
    tp2.IP iP38 = iPBan22.ip;
    tp2.SinglyLinkedList singlyLinkedList39 = new tp2.SinglyLinkedList();
    int i40 = singlyLinkedList39.getSize();
    tp2.IP iP45 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i46 = iP45.getSecond();
    java.lang.Integer i47 = iP45.getFourth();
    singlyLinkedList39.add(iP45);
    tp2.IP iP50 = singlyLinkedList39.get(5);
    boolean b51 = singlyLinkedList39.repOK();
    tp2.IP iP53 = singlyLinkedList39.get(2013265920);
    tp2.SinglyLinkedList singlyLinkedList54 = new tp2.SinglyLinkedList();
    int i55 = singlyLinkedList54.getSize();
    tp2.IP iP60 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i61 = iP60.getSecond();
    java.lang.Integer i62 = iP60.getFourth();
    singlyLinkedList54.add(iP60);
    iP60.setFourth((java.lang.Integer)167772160);
    singlyLinkedList39.add(iP60);
    java.lang.Object obj67 = null;
    boolean b68 = iP60.equals(obj67);
    iP60.setSecond((java.lang.Integer)20);
    tp2.IPBan iPBan72 = new tp2.IPBan(iP60, (java.lang.Long)20L);
    iPBan22.ip = iP60;
    iP60.setFirst((java.lang.Integer)655360);
    boolean b76 = singlyLinkedList0.remove(iP60);
    tp2.IP iP81 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP81.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan85 = new tp2.IPBan(iP81, (java.lang.Long)100L);
    tp2.IP iP90 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iPBan85.setIp(iP90);
    tp2.IP iP92 = iPBan85.ip;
    boolean b93 = singlyLinkedList0.remove(iP92);
    tp2.IP iP95 = singlyLinkedList0.get((-1595230938));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i30 + "' != '" + 100+ "'", i30.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long32 + "' != '" + 100L+ "'", long32.equals(100L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long35 + "' != '" + (-1L)+ "'", long35.equals((-1L)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i40 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i46 + "' != '" + (-1)+ "'", i46.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i47 + "' != '" + 100+ "'", i47.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b51 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i55 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i61 + "' != '" + (-1)+ "'", i61.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i62 + "' != '" + 100+ "'", i62.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b68 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b76 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP92);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b93 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP95);

  }

  @Test
  public void test292() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test292"); }


    tp2.IP iP4 = new tp2.IP((java.lang.Integer)200, (java.lang.Integer)5, (java.lang.Integer)33554432, (java.lang.Integer)24);
    java.lang.Integer i5 = iP4.getFirst();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i5 + "' != '" + 200+ "'", i5.equals(200));

  }

  @Test
  public void test293() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test293"); }


    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList0 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b1 = strictlySortedSinglyLinkedList0.repOK();
    tp2.IP iP6 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i7 = iP6.getSecond();
    iP6.setFirst((java.lang.Integer)11001000);
    iP6.setFirst((java.lang.Integer)(-2147483648));
    boolean b12 = strictlySortedSinglyLinkedList0.removeFromIP(iP6);
    java.lang.Integer i13 = iP6.getThird();
    tp2.IPBan iPBan15 = new tp2.IPBan(iP6, (java.lang.Long)96L);
    java.lang.Long long16 = iPBan15.getExpires();
    iPBan15.expires = 7L;
    iPBan15.setExpires((java.lang.Long)10000000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i7 + "' != '" + (-1)+ "'", i7.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i13 + "' != '" + (-1)+ "'", i13.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long16 + "' != '" + 96L+ "'", long16.equals(96L));

  }

  @Test
  public void test294() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test294"); }


    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList0 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b1 = strictlySortedSinglyLinkedList0.repOK();
    strictlySortedSinglyLinkedList0.size = (-671088640);
    tp2.IP iP8 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP8.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan12 = new tp2.IPBan(iP8, (java.lang.Long)100L);
    tp2.IP iP17 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i18 = iP17.getSecond();
    java.lang.Integer i19 = iP17.getFourth();
    iP17.setFirst((java.lang.Integer)5);
    iPBan12.ip = iP17;
    java.lang.Long long23 = iPBan12.getExpires();
    iPBan12.setExpires((java.lang.Long)(-1L));
    boolean b26 = strictlySortedSinglyLinkedList0.contains(iPBan12);
    tp2.Node node27 = strictlySortedSinglyLinkedList0.header;
    tp2.IPBan iPBan29 = strictlySortedSinglyLinkedList0.get(10067);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i18 + "' != '" + (-1)+ "'", i18.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i19 + "' != '" + 100+ "'", i19.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long23 + "' != '" + 100L+ "'", long23.equals(100L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iPBan29);

  }

  @Test
  public void test295() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test295"); }


    tp2.SinglyLinkedList singlyLinkedList0 = new tp2.SinglyLinkedList();
    int i1 = singlyLinkedList0.getSize();
    tp2.IP iP6 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i7 = iP6.getSecond();
    iP6.setFirst((java.lang.Integer)11001000);
    iP6.setFirst((java.lang.Integer)32);
    boolean b12 = singlyLinkedList0.remove(iP6);
    int i13 = singlyLinkedList0.getSize();
    tp2.IP iP15 = singlyLinkedList0.get(211631616);
    boolean b16 = singlyLinkedList0.repOK();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i7 + "' != '" + (-1)+ "'", i7.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);

  }

  @Test
  public void test296() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test296"); }


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
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList49 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b50 = strictlySortedSinglyLinkedList49.repOK();
    tp2.IP iP55 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i56 = iP55.getSecond();
    iP55.setFirst((java.lang.Integer)11001000);
    iP55.setFirst((java.lang.Integer)(-2147483648));
    boolean b61 = strictlySortedSinglyLinkedList49.removeFromIP(iP55);
    tp2.Node node62 = strictlySortedSinglyLinkedList49.header;
    strictlySortedSinglyLinkedList49.size = (-1);
    tp2.Node node65 = strictlySortedSinglyLinkedList49.header;
    strictlySortedSinglyLinkedList0.header = node65;
    int i67 = strictlySortedSinglyLinkedList0.getSize();
    tp2.IP iP72 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i73 = iP72.getSecond();
    iP72.setFirst((java.lang.Integer)11001000);
    java.lang.Long long76 = null;
    tp2.IPBan iPBan77 = new tp2.IPBan(iP72, long76);
    java.lang.Long long78 = iPBan77.expires;
    boolean b79 = strictlySortedSinglyLinkedList0.contains(iPBan77);
    tp2.IP iP80 = null;
    iPBan77.setIp(iP80);
    
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
    org.junit.Assert.assertTrue(b50 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i56 + "' != '" + (-1)+ "'", i56.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b61 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node62);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node65);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i67 == 11001000);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i73 + "' != '" + (-1)+ "'", i73.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(long78);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b79 == false);

  }

  @Test
  public void test297() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test297"); }


    int i2 = java.lang.Integer.max(1318590957, 353632304);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1318590957);

  }

  @Test
  public void test298() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test298"); }


    int i2 = java.lang.Integer.rotateLeft((-516871704), 174231553);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == (-1033743407));

  }

  @Test
  public void test299() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test299"); }


    tp2.SinglyLinkedList singlyLinkedList0 = new tp2.SinglyLinkedList();
    int i1 = singlyLinkedList0.getSize();
    tp2.IP iP6 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i7 = iP6.getSecond();
    java.lang.Integer i8 = iP6.getFourth();
    singlyLinkedList0.add(iP6);
    tp2.IP iP11 = singlyLinkedList0.get(5);
    boolean b12 = singlyLinkedList0.isEmpty();
    int i13 = singlyLinkedList0.getSize();
    boolean b14 = singlyLinkedList0.isEmpty();
    boolean b15 = singlyLinkedList0.isEmpty();
    tp2.IP iP20 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i21 = iP20.getSecond();
    iP20.setFirst((java.lang.Integer)11001000);
    iP20.setFirst((java.lang.Integer)32);
    java.lang.Integer i26 = iP20.getFourth();
    singlyLinkedList0.add(iP20);
    boolean b28 = singlyLinkedList0.repOK();
    tp2.SinglyLinkedList singlyLinkedList29 = new tp2.SinglyLinkedList();
    int i30 = singlyLinkedList29.getSize();
    tp2.IP iP35 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i36 = iP35.getSecond();
    java.lang.Integer i37 = iP35.getFourth();
    singlyLinkedList29.add(iP35);
    boolean b40 = iP35.equals((java.lang.Object)2147483647);
    tp2.IPBan iPBan42 = new tp2.IPBan(iP35, (java.lang.Long)(-1L));
    iP35.setSecond((java.lang.Integer)100);
    tp2.IPBan iPBan46 = new tp2.IPBan(iP35, (java.lang.Long)7L);
    boolean b47 = singlyLinkedList0.remove(iP35);
    java.lang.Integer i48 = iP35.getFourth();
    
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
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i21 + "' != '" + (-1)+ "'", i21.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i26 + "' != '" + 100+ "'", i26.equals(100));
    
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
    org.junit.Assert.assertTrue(b47 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i48 + "' != '" + 100+ "'", i48.equals(100));

  }

  @Test
  public void test300() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test300"); }


    int i2 = java.lang.Integer.rotateRight(0, 362);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);

  }

  @Test
  public void test301() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test301"); }


    int i2 = java.lang.Integer.max((-725894919), 486539264);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 486539264);

  }

  @Test
  public void test302() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test302"); }


    java.lang.Integer i1 = java.lang.Integer.getInteger("20h4db7f");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);

  }

  @Test
  public void test303() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test303"); }


    tp2.SinglyLinkedList singlyLinkedList0 = new tp2.SinglyLinkedList();
    int i1 = singlyLinkedList0.getSize();
    tp2.IP iP6 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i7 = iP6.getSecond();
    iP6.setFirst((java.lang.Integer)11001000);
    iP6.setFirst((java.lang.Integer)32);
    boolean b12 = singlyLinkedList0.remove(iP6);
    boolean b13 = singlyLinkedList0.repOK();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList14 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b15 = strictlySortedSinglyLinkedList14.repOK();
    tp2.IP iP20 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    boolean b21 = strictlySortedSinglyLinkedList14.containsIP(iP20);
    tp2.Node node22 = strictlySortedSinglyLinkedList14.header;
    boolean b23 = strictlySortedSinglyLinkedList14.isEmpty();
    tp2.IPBan iPBan25 = strictlySortedSinglyLinkedList14.get(3);
    strictlySortedSinglyLinkedList14.size = 200;
    tp2.SinglyLinkedList singlyLinkedList28 = new tp2.SinglyLinkedList();
    int i29 = singlyLinkedList28.getSize();
    tp2.IP iP34 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i35 = iP34.getSecond();
    java.lang.Integer i36 = iP34.getFourth();
    singlyLinkedList28.add(iP34);
    boolean b39 = iP34.equals((java.lang.Object)2147483647);
    tp2.IPBan iPBan41 = new tp2.IPBan(iP34, (java.lang.Long)(-1L));
    java.lang.Long long42 = iPBan41.expires;
    tp2.IP iP47 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP47.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan51 = new tp2.IPBan(iP47, (java.lang.Long)100L);
    tp2.IP iP52 = iPBan51.ip;
    iP52.setThird((java.lang.Integer)356246784);
    iPBan41.ip = iP52;
    java.lang.Integer i56 = iP52.getFirst();
    boolean b57 = strictlySortedSinglyLinkedList14.containsIP(iP52);
    singlyLinkedList0.add(iP52);
    boolean b59 = singlyLinkedList0.repOK();
    boolean b60 = singlyLinkedList0.isEmpty();
    boolean b61 = singlyLinkedList0.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i7 + "' != '" + (-1)+ "'", i7.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iPBan25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i29 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i35 + "' != '" + (-1)+ "'", i35.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i36 + "' != '" + 100+ "'", i36.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long42 + "' != '" + (-1L)+ "'", long42.equals((-1L)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i56 + "' != '" + 200+ "'", i56.equals(200));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b57 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b59 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b60 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b61 == false);

  }

  @Test
  public void test304() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test304"); }


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
    iPBan21.expires = 26476544L;
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList48 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b49 = strictlySortedSinglyLinkedList48.repOK();
    tp2.IP iP54 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    boolean b55 = strictlySortedSinglyLinkedList48.containsIP(iP54);
    int i56 = strictlySortedSinglyLinkedList48.getSize();
    tp2.SinglyLinkedList singlyLinkedList57 = new tp2.SinglyLinkedList();
    int i58 = singlyLinkedList57.getSize();
    tp2.IP iP63 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i64 = iP63.getSecond();
    java.lang.Integer i65 = iP63.getFourth();
    singlyLinkedList57.add(iP63);
    tp2.IPBan iPBan68 = new tp2.IPBan(iP63, (java.lang.Long)100L);
    iPBan68.expires = 10L;
    tp2.IP iP71 = iPBan68.getIp();
    iPBan68.expires = 0L;
    java.lang.Long long74 = iPBan68.expires;
    boolean b75 = strictlySortedSinglyLinkedList48.add(iPBan68);
    tp2.IP iP76 = iPBan68.getIp();
    iP76.setThird((java.lang.Integer)(-1815629824));
    iPBan21.setIp(iP76);
    iP76.setFirst((java.lang.Integer)224);
    
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
    org.junit.Assert.assertTrue(b49 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b55 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i56 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i58 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i64 + "' != '" + (-1)+ "'", i64.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i65 + "' != '" + 100+ "'", i65.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP71);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long74 + "' != '" + 0L+ "'", long74.equals(0L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b75 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP76);

  }

  @Test
  public void test305() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test305"); }


    int i1 = java.lang.Integer.reverse(68);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 570425344);

  }

  @Test
  public void test306() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test306"); }


    int i2 = java.lang.Integer.sum(524420645, 9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 524420654);

  }

  @Test
  public void test307() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test307"); }


    tp2.SinglyLinkedList singlyLinkedList0 = new tp2.SinglyLinkedList();
    int i1 = singlyLinkedList0.getSize();
    tp2.IP iP6 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i7 = iP6.getSecond();
    java.lang.Integer i8 = iP6.getFourth();
    singlyLinkedList0.add(iP6);
    tp2.IP iP11 = singlyLinkedList0.get(5);
    tp2.IP iP12 = null;
    boolean b13 = singlyLinkedList0.remove(iP12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i7 + "' != '" + (-1)+ "'", i7.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i8 + "' != '" + 100+ "'", i8.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);

  }

  @Test
  public void test308() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test308"); }


    java.lang.String str1 = java.lang.Integer.toUnsignedString(278528);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "278528"+ "'", str1.equals("278528"));

  }

  @Test
  public void test309() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test309"); }


    java.lang.String str1 = java.lang.Integer.toOctalString(1216413696);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "11040200000"+ "'", str1.equals("11040200000"));

  }

  @Test
  public void test310() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test310"); }


    int i1 = java.lang.Integer.signum(887838075);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 1);

  }

  @Test
  public void test311() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test311"); }


    tp2.IP iP4 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i5 = iP4.getSecond();
    java.lang.Integer i6 = iP4.getFourth();
    iP4.setFirst((java.lang.Integer)5);
    tp2.IPBan iPBan10 = new tp2.IPBan(iP4, (java.lang.Long)92L);
    java.lang.Long long11 = iPBan10.expires;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i5 + "' != '" + (-1)+ "'", i5.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i6 + "' != '" + 100+ "'", i6.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long11 + "' != '" + 92L+ "'", long11.equals(92L));

  }

  @Test
  public void test312() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test312"); }


    java.lang.String str1 = java.lang.Integer.toOctalString(181687626);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "1265052512"+ "'", str1.equals("1265052512"));

  }

  @Test
  public void test313() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test313"); }


    java.lang.String str2 = java.lang.Integer.toUnsignedString((-2079031296), 11892000);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "2215936000"+ "'", str2.equals("2215936000"));

  }

  @Test
  public void test314() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test314"); }


    java.lang.String str1 = java.lang.Integer.toUnsignedString(57347);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "57347"+ "'", str1.equals("57347"));

  }

  @Test
  public void test315() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test315"); }


    java.lang.String str1 = java.lang.Integer.toOctalString((-1946156683));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "21400000565"+ "'", str1.equals("21400000565"));

  }

  @Test
  public void test316() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test316"); }


    tp2.SinglyLinkedList singlyLinkedList0 = new tp2.SinglyLinkedList();
    int i1 = singlyLinkedList0.getSize();
    tp2.IP iP6 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i7 = iP6.getSecond();
    java.lang.Integer i8 = iP6.getFourth();
    singlyLinkedList0.add(iP6);
    iP6.setFourth((java.lang.Integer)167772160);
    iP6.setSecond((java.lang.Integer)0);
    iP6.setThird((java.lang.Integer)30);
    iP6.setThird((java.lang.Integer)16762403);
    java.lang.Integer i18 = iP6.getFirst();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList19 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b20 = strictlySortedSinglyLinkedList19.repOK();
    strictlySortedSinglyLinkedList19.size = 1;
    strictlySortedSinglyLinkedList19.size = 0;
    tp2.IP iP29 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP29.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan33 = new tp2.IPBan(iP29, (java.lang.Long)100L);
    tp2.IP iP34 = iPBan33.ip;
    boolean b35 = strictlySortedSinglyLinkedList19.contains(iPBan33);
    boolean b36 = strictlySortedSinglyLinkedList19.repOK();
    tp2.SinglyLinkedList singlyLinkedList37 = new tp2.SinglyLinkedList();
    int i38 = singlyLinkedList37.getSize();
    tp2.IP iP43 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i44 = iP43.getSecond();
    java.lang.Integer i45 = iP43.getFourth();
    singlyLinkedList37.add(iP43);
    boolean b48 = iP43.equals((java.lang.Object)2147483647);
    tp2.IPBan iPBan50 = new tp2.IPBan(iP43, (java.lang.Long)(-1L));
    boolean b51 = strictlySortedSinglyLinkedList19.add(iPBan50);
    tp2.Node node52 = strictlySortedSinglyLinkedList19.header;
    strictlySortedSinglyLinkedList19.size = 2147483647;
    int i55 = strictlySortedSinglyLinkedList19.size;
    tp2.Node node56 = strictlySortedSinglyLinkedList19.header;
    tp2.Node node57 = strictlySortedSinglyLinkedList19.header;
    boolean b58 = iP6.equals((java.lang.Object)strictlySortedSinglyLinkedList19);
    tp2.IPBan iPBan60 = new tp2.IPBan(iP6, (java.lang.Long)199L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i7 + "' != '" + (-1)+ "'", i7.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i8 + "' != '" + 100+ "'", i8.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i18 + "' != '" + (-1)+ "'", i18.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i38 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i44 + "' != '" + (-1)+ "'", i44.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i45 + "' != '" + 100+ "'", i45.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b48 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b51 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i55 == 2147483647);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b58 == false);

  }

  @Test
  public void test317() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test317"); }


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
    java.lang.Integer i80 = iP70.getThird();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i80 + "' != '" + (-1)+ "'", i80.equals((-1)));

  }

  @Test
  public void test318() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test318"); }


    java.lang.String str2 = java.lang.Integer.toUnsignedString(44000000, 565615239);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "44000000"+ "'", str2.equals("44000000"));

  }

  @Test
  public void test319() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test319"); }


    tp2.IP iP4 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i5 = iP4.getSecond();
    tp2.SinglyLinkedList singlyLinkedList6 = new tp2.SinglyLinkedList();
    boolean b7 = singlyLinkedList6.repOK();
    boolean b8 = iP4.equals((java.lang.Object)b7);
    tp2.IPBan iPBan10 = new tp2.IPBan(iP4, (java.lang.Long)100L);
    tp2.IP iP11 = iPBan10.getIp();
    java.lang.Integer i12 = iP11.getThird();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i5 + "' != '" + (-1)+ "'", i5.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i12 + "' != '" + (-1)+ "'", i12.equals((-1)));

  }

  @Test
  public void test320() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test320"); }


    int i2 = java.lang.Integer.sum((-1799120105), 266);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == (-1799119839));

  }

  @Test
  public void test321() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test321"); }


    int i2 = java.lang.Integer.max(5888, 2610775);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 2610775);

  }

  @Test
  public void test322() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test322"); }


    tp2.SinglyLinkedList singlyLinkedList0 = new tp2.SinglyLinkedList();
    int i1 = singlyLinkedList0.getSize();
    tp2.IP iP6 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i7 = iP6.getSecond();
    java.lang.Integer i8 = iP6.getFourth();
    singlyLinkedList0.add(iP6);
    boolean b11 = iP6.equals((java.lang.Object)2147483647);
    tp2.IPBan iPBan13 = new tp2.IPBan(iP6, (java.lang.Long)(-1L));
    iP6.setSecond((java.lang.Integer)100);
    tp2.IPBan iPBan17 = new tp2.IPBan(iP6, (java.lang.Long)7L);
    iP6.setThird((java.lang.Integer)1073744896);
    java.lang.Integer i20 = iP6.getFirst();
    java.lang.Integer i21 = iP6.getFirst();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i7 + "' != '" + (-1)+ "'", i7.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i8 + "' != '" + 100+ "'", i8.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i20 + "' != '" + (-1)+ "'", i20.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i21 + "' != '" + (-1)+ "'", i21.equals((-1)));

  }

  @Test
  public void test323() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test323"); }


    // The following exception was thrown during execution in test generation
    try {
      java.lang.Integer i2 = java.lang.Integer.valueOf("", 719343798);
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

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test324"); }


    // The following exception was thrown during execution in test generation
    try {
      java.lang.Integer i2 = java.lang.Integer.valueOf("153236453", 6760448);
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

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test325"); }


    int i2 = java.lang.Integer.divideUnsigned((-1762163462), 1002502148);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 2);

  }

  @Test
  public void test326() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test326"); }


    // The following exception was thrown during execution in test generation
    try {
      int i1 = java.lang.Integer.parseUnsignedInt("10011110100010000000000100000000");
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

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test327"); }


    java.lang.String str1 = java.lang.Integer.toBinaryString(3418368);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "1101000010100100000000"+ "'", str1.equals("1101000010100100000000"));

  }

  @Test
  public void test328() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test328"); }


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
    boolean b27 = strictlySortedSinglyLinkedList13.isEmpty();
    tp2.IP iP32 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP32.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan36 = new tp2.IPBan(iP32, (java.lang.Long)100L);
    tp2.IP iP37 = iPBan36.ip;
    tp2.IP iP42 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP42.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan46 = new tp2.IPBan(iP42, (java.lang.Long)100L);
    iPBan36.setIp(iP42);
    tp2.IP iP52 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP52.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan56 = new tp2.IPBan(iP52, (java.lang.Long)100L);
    java.lang.Integer i57 = iP52.getFirst();
    java.lang.Integer i58 = iP52.getFourth();
    iPBan36.setIp(iP52);
    tp2.IP iP60 = iPBan36.getIp();
    tp2.SinglyLinkedList singlyLinkedList61 = new tp2.SinglyLinkedList();
    int i62 = singlyLinkedList61.getSize();
    tp2.IP iP67 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i68 = iP67.getSecond();
    java.lang.Integer i69 = iP67.getFourth();
    singlyLinkedList61.add(iP67);
    tp2.IPBan iPBan72 = new tp2.IPBan(iP67, (java.lang.Long)100L);
    iP67.setThird((java.lang.Integer)(-2147483641));
    java.lang.Integer i75 = iP67.getSecond();
    iPBan36.ip = iP67;
    java.lang.Long long77 = iPBan36.getExpires();
    java.lang.Long long78 = iPBan36.expires;
    boolean b79 = strictlySortedSinglyLinkedList13.add(iPBan36);
    iPBan36.expires = 2L;
    
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
    org.junit.Assert.assertTrue(b27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i57 + "' != '" + 200+ "'", i57.equals(200));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i58 + "' != '" + 100+ "'", i58.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP60);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i62 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i68 + "' != '" + (-1)+ "'", i68.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i69 + "' != '" + 100+ "'", i69.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i75 + "' != '" + (-1)+ "'", i75.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long77 + "' != '" + 100L+ "'", long77.equals(100L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long78 + "' != '" + 100L+ "'", long78.equals(100L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b79 == true);

  }

  @Test
  public void test329() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test329"); }


    java.lang.Integer i1 = java.lang.Integer.getInteger("6000467402");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);

  }

  @Test
  public void test330() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test330"); }


    java.lang.Integer i1 = new java.lang.Integer(805371993);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 805371993+ "'", i1.equals(805371993));

  }

  @Test
  public void test331() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test331"); }


    // The following exception was thrown during execution in test generation
    try {
      java.lang.Integer i1 = java.lang.Integer.valueOf("10000000000001011100001");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test332() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test332"); }


    int i1 = java.lang.Integer.numberOfLeadingZeros((-1908302125));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);

  }

  @Test
  public void test333() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test333"); }


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
    int i17 = singlyLinkedList0.getSize();
    tp2.IP iP19 = singlyLinkedList0.get((-1342177280));
    tp2.SinglyLinkedList singlyLinkedList20 = new tp2.SinglyLinkedList();
    int i21 = singlyLinkedList20.getSize();
    tp2.IP iP26 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i27 = iP26.getSecond();
    java.lang.Integer i28 = iP26.getFourth();
    singlyLinkedList20.add(iP26);
    iP26.setFourth((java.lang.Integer)167772160);
    iP26.setSecond((java.lang.Integer)0);
    java.lang.Integer i34 = null;
    iP26.setFourth(i34);
    iP26.setFirst((java.lang.Integer)356246784);
    java.lang.Integer i38 = iP26.getFirst();
    boolean b39 = singlyLinkedList0.remove(iP26);
    
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
    org.junit.Assert.assertTrue(i17 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i27 + "' != '" + (-1)+ "'", i27.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i28 + "' != '" + 100+ "'", i28.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i38 + "' != '" + 356246784+ "'", i38.equals(356246784));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == false);

  }

  @Test
  public void test334() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test334"); }


    // The following exception was thrown during execution in test generation
    try {
      int i2 = java.lang.Integer.parseInt("101010010101111101100000", 335561671);
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test335() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test335"); }


    java.lang.Integer i1 = new java.lang.Integer(62079);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 62079+ "'", i1.equals(62079));

  }

  @Test
  public void test336() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test336"); }


    tp2.SinglyLinkedList singlyLinkedList0 = new tp2.SinglyLinkedList();
    boolean b1 = singlyLinkedList0.repOK();
    tp2.IP iP3 = singlyLinkedList0.get(200);
    boolean b4 = singlyLinkedList0.repOK();
    boolean b5 = singlyLinkedList0.isEmpty();
    tp2.IP iP10 = new tp2.IP((java.lang.Integer)(-939524096), (java.lang.Integer)30, (java.lang.Integer)27, (java.lang.Integer)32);
    boolean b11 = singlyLinkedList0.contains(iP10);
    tp2.IP iP13 = singlyLinkedList0.get(868364359);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP13);

  }

  @Test
  public void test337() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test337"); }


    int i2 = java.lang.Integer.compare(0, 1459056708);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == (-1));

  }

  @Test
  public void test338() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test338"); }


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
    tp2.IP iP20 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP20.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan24 = new tp2.IPBan(iP20, (java.lang.Long)100L);
    tp2.IP iP25 = iPBan24.ip;
    tp2.IP iP26 = iPBan24.ip;
    tp2.IP iP27 = iPBan24.getIp();
    iP27.setFourth((java.lang.Integer)51756250);
    tp2.IP iP34 = new tp2.IP((java.lang.Integer)15204352, (java.lang.Integer)1, (java.lang.Integer)15204352, (java.lang.Integer)356246787);
    tp2.SinglyLinkedList singlyLinkedList35 = new tp2.SinglyLinkedList();
    int i36 = singlyLinkedList35.getSize();
    int i37 = singlyLinkedList35.getSize();
    boolean b38 = iP34.equals((java.lang.Object)singlyLinkedList35);
    int i39 = singlyLinkedList35.getSize();
    boolean b40 = iP27.equals((java.lang.Object)singlyLinkedList35);
    boolean b41 = singlyLinkedList35.isEmpty();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList42 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b43 = strictlySortedSinglyLinkedList42.repOK();
    boolean b44 = strictlySortedSinglyLinkedList42.repOK();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList45 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b46 = strictlySortedSinglyLinkedList45.repOK();
    strictlySortedSinglyLinkedList45.size = 1;
    strictlySortedSinglyLinkedList45.size = 0;
    tp2.IP iP55 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP55.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan59 = new tp2.IPBan(iP55, (java.lang.Long)100L);
    tp2.IP iP60 = iPBan59.ip;
    boolean b61 = strictlySortedSinglyLinkedList45.contains(iPBan59);
    boolean b62 = strictlySortedSinglyLinkedList45.repOK();
    tp2.SinglyLinkedList singlyLinkedList63 = new tp2.SinglyLinkedList();
    int i64 = singlyLinkedList63.getSize();
    tp2.IP iP69 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i70 = iP69.getSecond();
    java.lang.Integer i71 = iP69.getFourth();
    singlyLinkedList63.add(iP69);
    boolean b74 = iP69.equals((java.lang.Object)2147483647);
    tp2.IPBan iPBan76 = new tp2.IPBan(iP69, (java.lang.Long)(-1L));
    boolean b77 = strictlySortedSinglyLinkedList45.add(iPBan76);
    tp2.Node node78 = strictlySortedSinglyLinkedList45.header;
    strictlySortedSinglyLinkedList42.header = node78;
    tp2.SinglyLinkedList singlyLinkedList80 = new tp2.SinglyLinkedList();
    int i81 = singlyLinkedList80.getSize();
    tp2.IP iP86 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i87 = iP86.getSecond();
    java.lang.Integer i88 = iP86.getFourth();
    singlyLinkedList80.add(iP86);
    tp2.IPBan iPBan91 = new tp2.IPBan(iP86, (java.lang.Long)100L);
    java.lang.Long long92 = null;
    tp2.IPBan iPBan93 = new tp2.IPBan(iP86, long92);
    boolean b94 = strictlySortedSinglyLinkedList42.containsIP(iP86);
    boolean b95 = singlyLinkedList35.remove(iP86);
    boolean b96 = singlyLinkedList0.remove(iP86);
    boolean b97 = singlyLinkedList0.repOK();
    
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
    org.junit.Assert.assertNotNull(iP25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i37 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i39 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b43 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b46 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP60);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b61 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b62 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i64 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i70 + "' != '" + (-1)+ "'", i70.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i71 + "' != '" + 100+ "'", i71.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b74 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b77 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node78);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i81 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i87 + "' != '" + (-1)+ "'", i87.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i88 + "' != '" + 100+ "'", i88.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b94 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b95 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b96 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b97 == true);

  }

  @Test
  public void test339() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test339"); }


    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList0 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b1 = strictlySortedSinglyLinkedList0.repOK();
    tp2.IP iP6 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i7 = iP6.getSecond();
    iP6.setFirst((java.lang.Integer)11001000);
    iP6.setFirst((java.lang.Integer)(-2147483648));
    boolean b12 = strictlySortedSinglyLinkedList0.removeFromIP(iP6);
    tp2.IPBan iPBan14 = strictlySortedSinglyLinkedList0.get((-1));
    tp2.IPBan iPBan16 = strictlySortedSinglyLinkedList0.get(16);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList17 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b18 = strictlySortedSinglyLinkedList17.isEmpty();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList19 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b20 = strictlySortedSinglyLinkedList19.repOK();
    tp2.IP iP25 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    boolean b26 = strictlySortedSinglyLinkedList19.containsIP(iP25);
    tp2.Node node27 = strictlySortedSinglyLinkedList19.header;
    strictlySortedSinglyLinkedList17.header = node27;
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList29 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b30 = strictlySortedSinglyLinkedList29.repOK();
    strictlySortedSinglyLinkedList29.size = 1;
    strictlySortedSinglyLinkedList29.size = 0;
    tp2.IP iP39 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP39.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan43 = new tp2.IPBan(iP39, (java.lang.Long)100L);
    tp2.IP iP48 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP48.setFirst((java.lang.Integer)200);
    java.lang.Integer i51 = iP48.getFourth();
    iPBan43.setIp(iP48);
    boolean b53 = strictlySortedSinglyLinkedList29.contains(iPBan43);
    boolean b54 = strictlySortedSinglyLinkedList17.contains(iPBan43);
    tp2.SinglyLinkedList singlyLinkedList55 = new tp2.SinglyLinkedList();
    int i56 = singlyLinkedList55.getSize();
    int i57 = singlyLinkedList55.getSize();
    tp2.IP iP58 = null;
    boolean b59 = singlyLinkedList55.contains(iP58);
    tp2.IP iP61 = singlyLinkedList55.get(27);
    tp2.IP iP66 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP66.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan70 = new tp2.IPBan(iP66, (java.lang.Long)100L);
    tp2.IP iP71 = iPBan70.ip;
    tp2.IP iP76 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP76.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan80 = new tp2.IPBan(iP76, (java.lang.Long)100L);
    iPBan70.setIp(iP76);
    boolean b82 = singlyLinkedList55.remove(iP76);
    iPBan43.ip = iP76;
    boolean b84 = strictlySortedSinglyLinkedList0.add(iPBan43);
    tp2.IP iP85 = iPBan43.ip;
    tp2.IP iP90 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i91 = iP90.getThird();
    java.lang.Integer i92 = iP90.getFourth();
    java.lang.Integer i93 = iP90.getFirst();
    iPBan43.setIp(iP90);
    tp2.IP iP95 = iPBan43.ip;
    tp2.IP iP96 = iPBan43.getIp();
    java.lang.Long long97 = iPBan43.getExpires();
    
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
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i51 + "' != '" + 100+ "'", i51.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b53 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b54 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i56 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i57 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b59 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP61);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP71);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b82 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b84 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP85);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i91 + "' != '" + (-1)+ "'", i91.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i92 + "' != '" + 100+ "'", i92.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i93 + "' != '" + (-1)+ "'", i93.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP95);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP96);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long97 + "' != '" + 100L+ "'", long97.equals(100L));

  }

  @Test
  public void test340() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test340"); }


    java.lang.Integer i1 = new java.lang.Integer("647740");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 647740+ "'", i1.equals(647740));

  }

  @Test
  public void test341() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test341"); }


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
    tp2.IP iP48 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP48.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan52 = new tp2.IPBan(iP48, (java.lang.Long)100L);
    tp2.IP iP53 = iPBan52.ip;
    tp2.IP iP58 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP58.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan62 = new tp2.IPBan(iP58, (java.lang.Long)100L);
    iPBan52.setIp(iP58);
    tp2.IPBan iPBan65 = new tp2.IPBan(iP58, (java.lang.Long)(-1L));
    tp2.IP iP66 = iPBan65.ip;
    boolean b67 = singlyLinkedList0.contains(iP66);
    boolean b68 = singlyLinkedList0.isEmpty();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList69 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b70 = strictlySortedSinglyLinkedList69.repOK();
    strictlySortedSinglyLinkedList69.size = 1;
    boolean b73 = strictlySortedSinglyLinkedList69.isEmpty();
    tp2.SinglyLinkedList singlyLinkedList74 = new tp2.SinglyLinkedList();
    int i75 = singlyLinkedList74.getSize();
    tp2.IP iP80 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i81 = iP80.getSecond();
    java.lang.Integer i82 = iP80.getFourth();
    singlyLinkedList74.add(iP80);
    boolean b85 = iP80.equals((java.lang.Object)2147483647);
    tp2.IPBan iPBan87 = new tp2.IPBan(iP80, (java.lang.Long)(-1L));
    java.lang.Long long88 = iPBan87.expires;
    boolean b89 = strictlySortedSinglyLinkedList69.contains(iPBan87);
    tp2.IP iP90 = iPBan87.ip;
    iP90.setFirst((java.lang.Integer)356246787);
    tp2.IPBan iPBan94 = new tp2.IPBan(iP90, (java.lang.Long)8L);
    tp2.IP iP95 = iPBan94.getIp();
    boolean b96 = singlyLinkedList0.remove(iP95);
    boolean b97 = singlyLinkedList0.isEmpty();
    int i98 = singlyLinkedList0.getSize();
    
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
    org.junit.Assert.assertNotNull(iP53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP66);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b67 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b68 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b70 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b73 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i75 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i81 + "' != '" + (-1)+ "'", i81.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i82 + "' != '" + 100+ "'", i82.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b85 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long88 + "' != '" + (-1L)+ "'", long88.equals((-1L)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b89 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP90);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP95);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b96 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b97 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i98 == 1);

  }

  @Test
  public void test342() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test342"); }


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
    int i62 = singlyLinkedList61.getSize();
    tp2.IP iP67 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i68 = iP67.getSecond();
    java.lang.Integer i69 = iP67.getFourth();
    singlyLinkedList61.add(iP67);
    tp2.IP iP72 = singlyLinkedList61.get(5);
    boolean b73 = singlyLinkedList61.repOK();
    tp2.IP iP75 = singlyLinkedList61.get(2013265920);
    tp2.SinglyLinkedList singlyLinkedList76 = new tp2.SinglyLinkedList();
    int i77 = singlyLinkedList76.getSize();
    tp2.IP iP82 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i83 = iP82.getSecond();
    java.lang.Integer i84 = iP82.getFourth();
    singlyLinkedList76.add(iP82);
    iP82.setFourth((java.lang.Integer)167772160);
    singlyLinkedList61.add(iP82);
    java.lang.Object obj89 = null;
    boolean b90 = iP82.equals(obj89);
    boolean b91 = singlyLinkedList0.contains(iP82);
    java.lang.Integer i92 = iP82.getFourth();
    tp2.IPBan iPBan94 = new tp2.IPBan(iP82, (java.lang.Long)54378824L);
    
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
    org.junit.Assert.assertTrue(i62 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i68 + "' != '" + (-1)+ "'", i68.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i69 + "' != '" + 100+ "'", i69.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP72);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b73 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP75);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i77 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i83 + "' != '" + (-1)+ "'", i83.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i84 + "' != '" + 100+ "'", i84.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b90 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b91 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i92 + "' != '" + 167772160+ "'", i92.equals(167772160));

  }

  @Test
  public void test343() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test343"); }


    // The following exception was thrown during execution in test generation
    try {
      java.lang.Integer i1 = java.lang.Integer.valueOf("21400000565");
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

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test344"); }


    java.lang.String str2 = java.lang.Integer.toUnsignedString(5259, (-473812921));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "5259"+ "'", str2.equals("5259"));

  }

  @Test
  public void test345() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test345"); }


    java.lang.String str1 = java.lang.Integer.toBinaryString(671102468);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "101000000000000011011000000100"+ "'", str1.equals("101000000000000011011000000100"));

  }

  @Test
  public void test346() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test346"); }


    int i1 = java.lang.Integer.reverseBytes(6327);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == (-1223163904));

  }

  @Test
  public void test347() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test347"); }


    int i2 = java.lang.Integer.rotateRight(208, 671079424);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 208);

  }

  @Test
  public void test348() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test348"); }


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
    iP83.setSecond((java.lang.Integer)(-1645579002));
    iP83.setFirst((java.lang.Integer)(-1500674585));
    
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
  public void test349() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test349"); }


    java.lang.Integer i1 = new java.lang.Integer(966847017);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 966847017+ "'", i1.equals(966847017));

  }

  @Test
  public void test350() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test350"); }


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
    boolean b32 = singlyLinkedList0.repOK();
    tp2.SinglyLinkedList singlyLinkedList33 = new tp2.SinglyLinkedList();
    boolean b34 = singlyLinkedList33.repOK();
    tp2.IP iP36 = singlyLinkedList33.get(200);
    boolean b37 = singlyLinkedList33.isEmpty();
    boolean b38 = singlyLinkedList33.repOK();
    boolean b39 = singlyLinkedList33.repOK();
    int i40 = singlyLinkedList33.getSize();
    boolean b41 = singlyLinkedList33.isEmpty();
    int i42 = singlyLinkedList33.getSize();
    boolean b43 = singlyLinkedList33.repOK();
    boolean b44 = singlyLinkedList33.isEmpty();
    tp2.IP iP49 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i50 = iP49.getFourth();
    java.lang.Integer i51 = iP49.getFourth();
    iP49.setThird((java.lang.Integer)200);
    boolean b54 = singlyLinkedList33.remove(iP49);
    boolean b55 = singlyLinkedList0.contains(iP49);
    tp2.IP iP60 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i61 = iP60.getSecond();
    iP60.setFirst((java.lang.Integer)11001000);
    iP60.setFirst((java.lang.Integer)32);
    java.lang.Integer i66 = iP60.getFirst();
    iP60.setThird((java.lang.Integer)(-402653158));
    boolean b69 = singlyLinkedList0.contains(iP60);
    tp2.IP iP74 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i75 = iP74.getSecond();
    iP74.setFirst((java.lang.Integer)11001000);
    java.lang.Integer i78 = iP74.getSecond();
    tp2.IPBan iPBan80 = new tp2.IPBan(iP74, (java.lang.Long)51756492L);
    java.lang.Integer i81 = iP74.getFourth();
    java.lang.Integer i82 = iP74.getThird();
    boolean b83 = singlyLinkedList0.contains(iP74);
    
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
    org.junit.Assert.assertTrue(b32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i40 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i42 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b43 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i50 + "' != '" + 100+ "'", i50.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i51 + "' != '" + 100+ "'", i51.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b54 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b55 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i61 + "' != '" + (-1)+ "'", i61.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i66 + "' != '" + 32+ "'", i66.equals(32));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b69 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i75 + "' != '" + (-1)+ "'", i75.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i78 + "' != '" + (-1)+ "'", i78.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i81 + "' != '" + 100+ "'", i81.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i82 + "' != '" + (-1)+ "'", i82.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b83 == false);

  }

  @Test
  public void test351() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test351"); }


    int i1 = java.lang.Integer.highestOneBit(555);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 512);

  }

  @Test
  public void test352() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test352"); }


    java.lang.String str1 = java.lang.Integer.toOctalString(1555933376);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "13457324300"+ "'", str1.equals("13457324300"));

  }

  @Test
  public void test353() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test353"); }


    int i2 = java.lang.Integer.min(114557954, (-2147483635));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == (-2147483635));

  }

  @Test
  public void test354() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test354"); }


    tp2.IP iP4 = new tp2.IP((java.lang.Integer)700000233, (java.lang.Integer)572981248, (java.lang.Integer)10368, (java.lang.Integer)211);

  }

  @Test
  public void test355() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test355"); }


    int i2 = java.lang.Integer.divideUnsigned((-1734319108), 129106176);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 19);

  }

  @Test
  public void test356() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test356"); }


    java.lang.Integer i1 = java.lang.Integer.decode("2710");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 2710+ "'", i1.equals(2710));

  }

  @Test
  public void test357() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test357"); }


    java.lang.String str2 = java.lang.Integer.toUnsignedString(1515430612, 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1515430612"+ "'", str2.equals("1515430612"));

  }

  @Test
  public void test358() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test358"); }


    // The following exception was thrown during execution in test generation
    try {
      int i2 = java.lang.Integer.parseUnsignedInt("128628", (-424160005));
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

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test359"); }


    int i2 = java.lang.Integer.max(310378496, 167773);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 310378496);

  }

  @Test
  public void test360() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test360"); }


    java.lang.String str1 = java.lang.Integer.toHexString(1287651328);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "4cc00000"+ "'", str1.equals("4cc00000"));

  }

  @Test
  public void test361() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test361"); }


    int i2 = java.lang.Integer.rotateLeft(110000001, 70187621);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == (-774967264));

  }

  @Test
  public void test362() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test362"); }


    int i1 = java.lang.Integer.highestOneBit((-1610612736));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == (-2147483648));

  }

  @Test
  public void test363() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test363"); }


    int i2 = java.lang.Integer.min(1140850688, 112001);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 112001);

  }

  @Test
  public void test364() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test364"); }


    int i1 = java.lang.Integer.lowestOneBit(58000026);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 2);

  }

  @Test
  public void test365() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test365"); }


    java.lang.Integer i1 = java.lang.Integer.getInteger("34516612545");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);

  }

  @Test
  public void test366() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test366"); }


    int i2 = java.lang.Integer.max(308439517, 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 308439517);

  }

  @Test
  public void test367() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test367"); }


    // The following exception was thrown during execution in test generation
    try {
      int i1 = java.lang.Integer.parseInt("3a000");
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

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test368"); }


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
    tp2.IP iP12 = singlyLinkedList0.get(0);
    boolean b13 = singlyLinkedList0.isEmpty();
    tp2.IP iP15 = singlyLinkedList0.get((-620691451));
    tp2.IP iP17 = singlyLinkedList0.get((-1678592000));
    
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
    org.junit.Assert.assertNull(iP12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP17);

  }

  @Test
  public void test369() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test369"); }


    java.lang.Integer i1 = java.lang.Integer.valueOf((-1678592000));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + (-1678592000)+ "'", i1.equals((-1678592000)));

  }

  @Test
  public void test370() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test370"); }


    java.lang.String str1 = java.lang.Integer.toHexString(1946550608);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "74060150"+ "'", str1.equals("74060150"));

  }

  @Test
  public void test371() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test371"); }


    int i1 = java.lang.Integer.numberOfTrailingZeros(443906176);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 7);

  }

  @Test
  public void test372() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test372"); }


    java.lang.Integer i1 = java.lang.Integer.decode("1335431");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 1335431+ "'", i1.equals(1335431));

  }

  @Test
  public void test373() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test373"); }


    // The following exception was thrown during execution in test generation
    try {
      java.lang.Integer i1 = new java.lang.Integer("13f6d2");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test374() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test374"); }


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
    java.lang.Integer i53 = iP52.getFourth();
    
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
    org.junit.Assert.assertTrue("'" + i53 + "' != '" + 100+ "'", i53.equals(100));

  }

  @Test
  public void test375() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test375"); }


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
    java.lang.Long long45 = iPBan15.expires;
    
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
    org.junit.Assert.assertTrue("'" + long45 + "' != '" + 1L+ "'", long45.equals(1L));

  }

  @Test
  public void test376() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test376"); }


    int i2 = java.lang.Integer.rotateLeft(62829, 54175744);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 62829);

  }

  @Test
  public void test377() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test377"); }


    // The following exception was thrown during execution in test generation
    try {
      java.lang.Integer i2 = java.lang.Integer.valueOf("30400001274", 0);
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test378() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test378"); }


    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList0 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b1 = strictlySortedSinglyLinkedList0.repOK();
    tp2.IP iP6 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    boolean b7 = strictlySortedSinglyLinkedList0.containsIP(iP6);
    tp2.Node node8 = strictlySortedSinglyLinkedList0.header;
    boolean b9 = strictlySortedSinglyLinkedList0.isEmpty();
    int i10 = strictlySortedSinglyLinkedList0.getSize();
    int i11 = strictlySortedSinglyLinkedList0.size;
    strictlySortedSinglyLinkedList0.size = (-2);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList14 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b15 = strictlySortedSinglyLinkedList14.repOK();
    strictlySortedSinglyLinkedList14.size = 1;
    strictlySortedSinglyLinkedList14.size = 0;
    tp2.IP iP24 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i25 = iP24.getFourth();
    java.lang.Integer i26 = iP24.getFourth();
    iP24.setThird((java.lang.Integer)200);
    iP24.setThird((java.lang.Integer)356246787);
    boolean b31 = strictlySortedSinglyLinkedList14.containsIP(iP24);
    tp2.IPBan iPBan33 = strictlySortedSinglyLinkedList14.get((-2147483598));
    tp2.IP iP38 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP38.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan42 = new tp2.IPBan(iP38, (java.lang.Long)100L);
    tp2.IP iP43 = iPBan42.ip;
    tp2.IP iP44 = iPBan42.ip;
    tp2.IP iP45 = iPBan42.getIp();
    iP45.setFourth((java.lang.Integer)51756250);
    tp2.IP iP52 = new tp2.IP((java.lang.Integer)15204352, (java.lang.Integer)1, (java.lang.Integer)15204352, (java.lang.Integer)356246787);
    tp2.SinglyLinkedList singlyLinkedList53 = new tp2.SinglyLinkedList();
    int i54 = singlyLinkedList53.getSize();
    int i55 = singlyLinkedList53.getSize();
    boolean b56 = iP52.equals((java.lang.Object)singlyLinkedList53);
    int i57 = singlyLinkedList53.getSize();
    boolean b58 = iP45.equals((java.lang.Object)singlyLinkedList53);
    boolean b59 = strictlySortedSinglyLinkedList14.containsIP(iP45);
    boolean b60 = strictlySortedSinglyLinkedList0.removeFromIP(iP45);
    iP45.setFirst((java.lang.Integer)91);
    
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
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i25 + "' != '" + 100+ "'", i25.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i26 + "' != '" + 100+ "'", i26.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iPBan33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i54 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i55 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b56 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i57 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b58 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b59 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b60 == false);

  }

  @Test
  public void test379() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test379"); }


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
    tp2.IP iP65 = new tp2.IP((java.lang.Integer)3925251, (java.lang.Integer)31, (java.lang.Integer)29, (java.lang.Integer)163840);
    java.lang.Integer i66 = iP65.getThird();
    iP65.setFourth((java.lang.Integer)10485760);
    singlyLinkedList0.add(iP65);
    boolean b70 = singlyLinkedList0.repOK();
    tp2.IP iP75 = new tp2.IP((java.lang.Integer)818, (java.lang.Integer)(-1352350038), (java.lang.Integer)(-1478638592), (java.lang.Integer)1242756);
    boolean b76 = singlyLinkedList0.contains(iP75);
    tp2.IP iP78 = singlyLinkedList0.get((-1962393600));
    
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
    org.junit.Assert.assertTrue("'" + i66 + "' != '" + 29+ "'", i66.equals(29));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b70 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b76 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP78);

  }

  @Test
  public void test380() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test380"); }


    int i2 = java.lang.Integer.rotateLeft(46000, 1000000);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 46000);

  }

  @Test
  public void test381() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test381"); }


    java.lang.String str1 = java.lang.Integer.toHexString((-109901748));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "f973084c"+ "'", str1.equals("f973084c"));

  }

  @Test
  public void test382() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test382"); }


    long long1 = java.lang.Integer.toUnsignedLong(33554794);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == 33554794L);

  }

  @Test
  public void test383() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test383"); }


    long long1 = java.lang.Integer.toUnsignedLong(4017);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == 4017L);

  }

  @Test
  public void test384() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test384"); }


    // The following exception was thrown during execution in test generation
    try {
      int i2 = java.lang.Integer.parseInt("802ef4b5", 327155959);
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

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test385"); }


    int i1 = java.lang.Integer.lowestOneBit((-1576765570));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 2);

  }

  @Test
  public void test386() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test386"); }


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
    java.lang.Long long25 = iPBan8.expires;
    tp2.IP iP26 = iPBan8.getIp();
    iP26.setFourth((java.lang.Integer)60);
    
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
    org.junit.Assert.assertTrue("'" + long25 + "' != '" + 100L+ "'", long25.equals(100L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP26);

  }

  @Test
  public void test387() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test387"); }


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
    iPBan8.expires = 1L;
    java.lang.Long long52 = iPBan8.expires;
    tp2.IP iP53 = iPBan8.getIp();
    java.lang.Integer i54 = null;
    iP53.setFirst(i54);
    
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
    org.junit.Assert.assertTrue("'" + long52 + "' != '" + 1L+ "'", long52.equals(1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP53);

  }

  @Test
  public void test388() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test388"); }


    tp2.IP iP4 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP4.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan8 = new tp2.IPBan(iP4, (java.lang.Long)100L);
    tp2.IP iP13 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP13.setFirst((java.lang.Integer)200);
    java.lang.Integer i16 = iP13.getFourth();
    iPBan8.setIp(iP13);
    java.lang.Long long18 = iPBan8.expires;
    iPBan8.expires = (-1L);
    java.lang.Long long21 = iPBan8.expires;
    tp2.IP iP22 = iPBan8.getIp();
    java.lang.Long long23 = iPBan8.getExpires();
    iPBan8.setExpires((java.lang.Long)2273280L);
    java.lang.Long long26 = iPBan8.expires;
    tp2.IP iP27 = iPBan8.ip;
    iP27.setFourth((java.lang.Integer)62079);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i16 + "' != '" + 100+ "'", i16.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long18 + "' != '" + 100L+ "'", long18.equals(100L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-1L)+ "'", long21.equals((-1L)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long23 + "' != '" + (-1L)+ "'", long23.equals((-1L)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long26 + "' != '" + 2273280L+ "'", long26.equals(2273280L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP27);

  }

  @Test
  public void test389() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test389"); }


    int i2 = java.lang.Integer.min((-132129932), 509066);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == (-132129932));

  }

  @Test
  public void test390() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test390"); }


    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList0 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b1 = strictlySortedSinglyLinkedList0.repOK();
    tp2.IP iP6 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i7 = iP6.getSecond();
    iP6.setFirst((java.lang.Integer)11001000);
    iP6.setFirst((java.lang.Integer)(-2147483648));
    boolean b12 = strictlySortedSinglyLinkedList0.removeFromIP(iP6);
    tp2.IPBan iPBan14 = new tp2.IPBan(iP6, (java.lang.Long)0L);
    tp2.IP iP15 = iPBan14.getIp();
    tp2.SinglyLinkedList singlyLinkedList16 = new tp2.SinglyLinkedList();
    int i17 = singlyLinkedList16.getSize();
    tp2.IP iP22 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i23 = iP22.getSecond();
    java.lang.Integer i24 = iP22.getFourth();
    singlyLinkedList16.add(iP22);
    tp2.IP iP27 = singlyLinkedList16.get(5);
    boolean b28 = singlyLinkedList16.repOK();
    tp2.IP iP30 = singlyLinkedList16.get(2013265920);
    tp2.SinglyLinkedList singlyLinkedList31 = new tp2.SinglyLinkedList();
    int i32 = singlyLinkedList31.getSize();
    tp2.IP iP37 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i38 = iP37.getSecond();
    java.lang.Integer i39 = iP37.getFourth();
    singlyLinkedList31.add(iP37);
    iP37.setFourth((java.lang.Integer)167772160);
    singlyLinkedList16.add(iP37);
    java.lang.Object obj44 = null;
    boolean b45 = iP37.equals(obj44);
    iP37.setSecond((java.lang.Integer)20);
    tp2.IPBan iPBan49 = new tp2.IPBan(iP37, (java.lang.Long)20L);
    java.lang.Integer i50 = iP37.getFirst();
    iP37.setThird((java.lang.Integer)4);
    iP37.setFirst((java.lang.Integer)29);
    iPBan14.setIp(iP37);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList56 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b57 = strictlySortedSinglyLinkedList56.repOK();
    tp2.IP iP62 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    boolean b63 = strictlySortedSinglyLinkedList56.containsIP(iP62);
    java.lang.Integer i64 = iP62.getFirst();
    java.lang.Integer i65 = iP62.getFirst();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList66 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b67 = strictlySortedSinglyLinkedList66.repOK();
    tp2.IP iP72 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    boolean b73 = strictlySortedSinglyLinkedList66.containsIP(iP72);
    tp2.Node node74 = strictlySortedSinglyLinkedList66.header;
    boolean b75 = strictlySortedSinglyLinkedList66.isEmpty();
    int i76 = strictlySortedSinglyLinkedList66.getSize();
    int i77 = strictlySortedSinglyLinkedList66.size;
    boolean b78 = iP62.equals((java.lang.Object)i77);
    java.lang.Integer i79 = iP62.getFourth();
    java.lang.Integer i80 = iP62.getFourth();
    iPBan14.ip = iP62;
    java.lang.Integer i82 = iP62.getFirst();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i7 + "' != '" + (-1)+ "'", i7.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP15);
    
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
    org.junit.Assert.assertTrue(i32 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i38 + "' != '" + (-1)+ "'", i38.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i39 + "' != '" + 100+ "'", i39.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i50 + "' != '" + (-1)+ "'", i50.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b57 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b63 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i64 + "' != '" + (-1)+ "'", i64.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i65 + "' != '" + (-1)+ "'", i65.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b67 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b73 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node74);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b75 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i76 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i77 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b78 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i79 + "' != '" + 100+ "'", i79.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i80 + "' != '" + 100+ "'", i80.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i82 + "' != '" + (-1)+ "'", i82.equals((-1)));

  }

  @Test
  public void test391() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test391"); }


    int i1 = java.lang.Integer.reverse(628969542);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 1644871332);

  }

  @Test
  public void test392() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test392"); }


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
    iPBan18.setExpires((java.lang.Long)204L);
    
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

  }

  @Test
  public void test393() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test393"); }


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
    strictlySortedSinglyLinkedList0.size = 26476544;
    tp2.SinglyLinkedList singlyLinkedList46 = new tp2.SinglyLinkedList();
    int i47 = singlyLinkedList46.getSize();
    int i48 = singlyLinkedList46.getSize();
    tp2.IP iP49 = null;
    boolean b50 = singlyLinkedList46.contains(iP49);
    tp2.IP iP52 = singlyLinkedList46.get(27);
    tp2.IP iP57 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i58 = iP57.getSecond();
    iP57.setFirst((java.lang.Integer)11001000);
    java.lang.Long long61 = null;
    tp2.IPBan iPBan62 = new tp2.IPBan(iP57, long61);
    tp2.IP iP63 = iPBan62.ip;
    tp2.IP iP64 = iPBan62.ip;
    java.lang.Integer i65 = iP64.getFourth();
    boolean b66 = singlyLinkedList46.remove(iP64);
    tp2.IP iP68 = singlyLinkedList46.get(0);
    tp2.IP iP73 = new tp2.IP((java.lang.Integer)15204352, (java.lang.Integer)1, (java.lang.Integer)15204352, (java.lang.Integer)356246787);
    tp2.SinglyLinkedList singlyLinkedList74 = new tp2.SinglyLinkedList();
    int i75 = singlyLinkedList74.getSize();
    int i76 = singlyLinkedList74.getSize();
    boolean b77 = iP73.equals((java.lang.Object)singlyLinkedList74);
    boolean b78 = singlyLinkedList46.remove(iP73);
    java.lang.Integer i79 = iP73.getSecond();
    iP73.setFirst((java.lang.Integer)100);
    java.lang.Integer i82 = iP73.getSecond();
    tp2.IPBan iPBan84 = new tp2.IPBan(iP73, (java.lang.Long)14L);
    boolean b85 = strictlySortedSinglyLinkedList0.contains(iPBan84);
    tp2.Node node86 = strictlySortedSinglyLinkedList0.header;
    
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
    org.junit.Assert.assertTrue(i47 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i48 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b50 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i58 + "' != '" + (-1)+ "'", i58.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP63);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP64);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i65 + "' != '" + 100+ "'", i65.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b66 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP68);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i75 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i76 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b77 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b78 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i79 + "' != '" + 1+ "'", i79.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i82 + "' != '" + 1+ "'", i82.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b85 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node86);

  }

  @Test
  public void test394() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test394"); }


    int i2 = java.lang.Integer.compareUnsigned(111, (-936770652));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == (-1));

  }

  @Test
  public void test395() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test395"); }


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
    tp2.IP iP35 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i36 = iP35.getSecond();
    iP35.setFirst((java.lang.Integer)11001000);
    iP35.setFirst((java.lang.Integer)(-2147483648));
    boolean b41 = strictlySortedSinglyLinkedList29.removeFromIP(iP35);
    tp2.IPBan iPBan42 = null;
    boolean b43 = strictlySortedSinglyLinkedList29.add(iPBan42);
    tp2.Node node44 = strictlySortedSinglyLinkedList29.header;
    tp2.Node node45 = strictlySortedSinglyLinkedList29.header;
    boolean b46 = strictlySortedSinglyLinkedList29.isEmpty();
    tp2.Node node47 = strictlySortedSinglyLinkedList29.header;
    strictlySortedSinglyLinkedList0.header = node47;
    boolean b49 = strictlySortedSinglyLinkedList0.repOK();
    int i50 = strictlySortedSinglyLinkedList0.getSize();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList51 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b52 = strictlySortedSinglyLinkedList51.repOK();
    strictlySortedSinglyLinkedList51.size = 1;
    boolean b55 = strictlySortedSinglyLinkedList51.isEmpty();
    tp2.SinglyLinkedList singlyLinkedList56 = new tp2.SinglyLinkedList();
    int i57 = singlyLinkedList56.getSize();
    tp2.IP iP62 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i63 = iP62.getSecond();
    java.lang.Integer i64 = iP62.getFourth();
    singlyLinkedList56.add(iP62);
    boolean b67 = iP62.equals((java.lang.Object)2147483647);
    tp2.IPBan iPBan69 = new tp2.IPBan(iP62, (java.lang.Long)(-1L));
    java.lang.Long long70 = iPBan69.expires;
    boolean b71 = strictlySortedSinglyLinkedList51.contains(iPBan69);
    tp2.IP iP72 = iPBan69.ip;
    iP72.setFirst((java.lang.Integer)356246787);
    tp2.IPBan iPBan76 = new tp2.IPBan(iP72, (java.lang.Long)8L);
    tp2.IP iP77 = iPBan76.getIp();
    tp2.IP iP78 = iPBan76.getIp();
    java.lang.Long long79 = iPBan76.getExpires();
    java.lang.Long long80 = iPBan76.expires;
    // The following exception was thrown during execution in test generation
    try {
      boolean b81 = strictlySortedSinglyLinkedList0.add(iPBan76);
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
    org.junit.Assert.assertTrue("'" + i36 + "' != '" + (-1)+ "'", i36.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b43 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b46 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b49 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i50 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b52 == true);
    
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
    org.junit.Assert.assertTrue("'" + long70 + "' != '" + (-1L)+ "'", long70.equals((-1L)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b71 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP72);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP77);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP78);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long79 + "' != '" + 8L+ "'", long79.equals(8L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long80 + "' != '" + 8L+ "'", long80.equals(8L));

  }

  @Test
  public void test396() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test396"); }


    int i2 = java.lang.Integer.remainderUnsigned(0, 1758773427);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);

  }

  @Test
  public void test397() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test397"); }


    tp2.IP iP4 = new tp2.IP((java.lang.Integer)41473408, (java.lang.Integer)1426986255, (java.lang.Integer)2980, (java.lang.Integer)(-1291354269));

  }

  @Test
  public void test398() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test398"); }


    int i2 = java.lang.Integer.divideUnsigned(576, 478150657);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);

  }

  @Test
  public void test399() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test399"); }


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
    tp2.SinglyLinkedList singlyLinkedList40 = new tp2.SinglyLinkedList();
    int i41 = singlyLinkedList40.getSize();
    tp2.IP iP46 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i47 = iP46.getSecond();
    java.lang.Integer i48 = iP46.getFourth();
    singlyLinkedList40.add(iP46);
    tp2.IPBan iPBan51 = new tp2.IPBan(iP46, (java.lang.Long)1L);
    tp2.IPBan iPBan53 = new tp2.IPBan(iP46, (java.lang.Long)100L);
    java.lang.Long long54 = iPBan53.expires;
    tp2.SinglyLinkedList singlyLinkedList55 = new tp2.SinglyLinkedList();
    int i56 = singlyLinkedList55.getSize();
    int i57 = singlyLinkedList55.getSize();
    tp2.IP iP58 = null;
    boolean b59 = singlyLinkedList55.contains(iP58);
    boolean b60 = singlyLinkedList55.repOK();
    boolean b61 = singlyLinkedList55.isEmpty();
    tp2.IP iP66 = new tp2.IP((java.lang.Integer)5, (java.lang.Integer)10, (java.lang.Integer)31, (java.lang.Integer)32);
    java.lang.Object obj67 = null;
    boolean b68 = iP66.equals(obj67);
    iP66.setFirst((java.lang.Integer)100);
    boolean b71 = singlyLinkedList55.contains(iP66);
    iP66.setFirst((java.lang.Integer)32768);
    iPBan53.setIp(iP66);
    tp2.IP iP75 = iPBan53.getIp();
    boolean b76 = iP37.equals((java.lang.Object)iP75);
    iP37.setSecond((java.lang.Integer)8);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i41 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i47 + "' != '" + (-1)+ "'", i47.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i48 + "' != '" + 100+ "'", i48.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long54 + "' != '" + 100L+ "'", long54.equals(100L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i56 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i57 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b59 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b60 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b61 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b68 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b71 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP75);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b76 == false);

  }

  @Test
  public void test400() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test400"); }


    tp2.SinglyLinkedList singlyLinkedList0 = new tp2.SinglyLinkedList();
    int i1 = singlyLinkedList0.getSize();
    tp2.IP iP6 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i7 = iP6.getSecond();
    iP6.setFirst((java.lang.Integer)11001000);
    iP6.setFirst((java.lang.Integer)32);
    boolean b12 = singlyLinkedList0.remove(iP6);
    tp2.IP iP14 = singlyLinkedList0.get((-671088640));
    tp2.SinglyLinkedList singlyLinkedList15 = new tp2.SinglyLinkedList();
    boolean b16 = singlyLinkedList15.repOK();
    tp2.IP iP18 = singlyLinkedList15.get(200);
    boolean b19 = singlyLinkedList15.isEmpty();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList20 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b21 = strictlySortedSinglyLinkedList20.repOK();
    tp2.IP iP26 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i27 = iP26.getSecond();
    iP26.setFirst((java.lang.Integer)11001000);
    iP26.setFirst((java.lang.Integer)(-2147483648));
    boolean b32 = strictlySortedSinglyLinkedList20.removeFromIP(iP26);
    boolean b33 = singlyLinkedList15.remove(iP26);
    iP26.setThird((java.lang.Integer)8);
    boolean b36 = singlyLinkedList0.contains(iP26);
    tp2.IP iP38 = singlyLinkedList0.get((-671088640));
    int i39 = singlyLinkedList0.getSize();
    tp2.IP iP44 = new tp2.IP((java.lang.Integer)160, (java.lang.Integer)1, (java.lang.Integer)27, (java.lang.Integer)(-2));
    java.lang.Integer i45 = iP44.getFourth();
    java.lang.Integer i46 = iP44.getFourth();
    singlyLinkedList0.add(iP44);
    tp2.IP iP52 = new tp2.IP((java.lang.Integer)1027604483, (java.lang.Integer)117440512, (java.lang.Integer)51920186, (java.lang.Integer)(-536870175));
    boolean b53 = singlyLinkedList0.contains(iP52);
    int i54 = singlyLinkedList0.getSize();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i7 + "' != '" + (-1)+ "'", i7.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i27 + "' != '" + (-1)+ "'", i27.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i39 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i45 + "' != '" + (-2)+ "'", i45.equals((-2)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i46 + "' != '" + (-2)+ "'", i46.equals((-2)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b53 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i54 == 1);

  }

  @Test
  public void test401() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test401"); }


    java.lang.String str2 = java.lang.Integer.toUnsignedString((-1337717456), (-2120392704));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "2957249840"+ "'", str2.equals("2957249840"));

  }

  @Test
  public void test402() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test402"); }


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
    tp2.Node node29 = null;
    strictlySortedSinglyLinkedList0.header = node29;
    
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

  }

  @Test
  public void test403() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test403"); }


    int i1 = java.lang.Integer.bitCount((-591588079));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 16);

  }

  @Test
  public void test404() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test404"); }


    // The following exception was thrown during execution in test generation
    try {
      java.lang.Integer i2 = java.lang.Integer.valueOf("", 353632304);
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

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test405"); }


    int i2 = java.lang.Integer.compare((-2130704455), 56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == (-1));

  }

  @Test
  public void test406() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test406"); }


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
    int i55 = strictlySortedSinglyLinkedList0.getSize();
    boolean b56 = strictlySortedSinglyLinkedList0.repOK();
    tp2.SinglyLinkedList singlyLinkedList57 = new tp2.SinglyLinkedList();
    int i58 = singlyLinkedList57.getSize();
    tp2.IP iP63 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i64 = iP63.getSecond();
    java.lang.Integer i65 = iP63.getFourth();
    singlyLinkedList57.add(iP63);
    boolean b68 = iP63.equals((java.lang.Object)2147483647);
    tp2.IPBan iPBan70 = new tp2.IPBan(iP63, (java.lang.Long)(-1L));
    iP63.setThird((java.lang.Integer)(-2));
    tp2.IPBan iPBan74 = new tp2.IPBan(iP63, (java.lang.Long)175L);
    boolean b75 = strictlySortedSinglyLinkedList0.contains(iPBan74);
    boolean b76 = strictlySortedSinglyLinkedList0.isEmpty();
    
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
    org.junit.Assert.assertTrue(i55 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b56 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i58 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i64 + "' != '" + (-1)+ "'", i64.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i65 + "' != '" + 100+ "'", i65.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b68 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b75 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b76 == false);

  }

  @Test
  public void test407() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test407"); }


    int i2 = java.lang.Integer.compare(0, 121632453);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == (-1));

  }

  @Test
  public void test408() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test408"); }


    java.lang.Integer i1 = java.lang.Integer.decode("507571");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 507571+ "'", i1.equals(507571));

  }

  @Test
  public void test409() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test409"); }


    int i2 = java.lang.Integer.compareUnsigned(673775616, 369824512);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);

  }

  @Test
  public void test410() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test410"); }


    int i1 = java.lang.Integer.numberOfTrailingZeros(560);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 4);

  }

  @Test
  public void test411() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test411"); }


    java.lang.Integer i1 = java.lang.Integer.decode("645020");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 645020+ "'", i1.equals(645020));

  }

  @Test
  public void test412() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test412"); }


    java.lang.String str1 = java.lang.Integer.toBinaryString((-1762163462));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "10010110111101111000010011111010"+ "'", str1.equals("10010110111101111000010011111010"));

  }

  @Test
  public void test413() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test413"); }


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
    strictlySortedSinglyLinkedList21.size = (-536870909);
    int i36 = strictlySortedSinglyLinkedList21.size;
    int i37 = strictlySortedSinglyLinkedList21.size;
    
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
    org.junit.Assert.assertTrue(i36 == (-536870909));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i37 == (-536870909));

  }

  @Test
  public void test414() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test414"); }


    int i2 = java.lang.Integer.remainderUnsigned(9703552, 536892574);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 9703552);

  }

  @Test
  public void test415() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test415"); }


    int i2 = java.lang.Integer.divideUnsigned(37612, 201326592);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);

  }

  @Test
  public void test416() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test416"); }


    tp2.IP iP4 = new tp2.IP((java.lang.Integer)242, (java.lang.Integer)242, (java.lang.Integer)30, (java.lang.Integer)(-1));
    iP4.setSecond((java.lang.Integer)16);
    tp2.IPBan iPBan8 = new tp2.IPBan(iP4, (java.lang.Long)1027604515L);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList9 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b10 = strictlySortedSinglyLinkedList9.isEmpty();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList11 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b12 = strictlySortedSinglyLinkedList11.repOK();
    tp2.IP iP17 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    boolean b18 = strictlySortedSinglyLinkedList11.containsIP(iP17);
    tp2.Node node19 = strictlySortedSinglyLinkedList11.header;
    strictlySortedSinglyLinkedList9.header = node19;
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList21 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b22 = strictlySortedSinglyLinkedList21.repOK();
    strictlySortedSinglyLinkedList21.size = 1;
    strictlySortedSinglyLinkedList21.size = 0;
    tp2.IP iP31 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP31.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan35 = new tp2.IPBan(iP31, (java.lang.Long)100L);
    tp2.IP iP40 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP40.setFirst((java.lang.Integer)200);
    java.lang.Integer i43 = iP40.getFourth();
    iPBan35.setIp(iP40);
    boolean b45 = strictlySortedSinglyLinkedList21.contains(iPBan35);
    boolean b46 = strictlySortedSinglyLinkedList9.contains(iPBan35);
    tp2.IP iP47 = iPBan35.ip;
    tp2.IP iP48 = iPBan35.ip;
    tp2.IP iP53 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i54 = iP53.getSecond();
    java.lang.Integer i55 = iP53.getFourth();
    iP53.setFirst((java.lang.Integer)5);
    tp2.IPBan iPBan59 = new tp2.IPBan(iP53, (java.lang.Long)0L);
    iPBan59.expires = 2147483648L;
    iPBan59.expires = 2013265920L;
    boolean b64 = iP48.equals((java.lang.Object)iPBan59);
    iPBan59.setExpires((java.lang.Long)10L);
    tp2.IP iP71 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP71.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan75 = new tp2.IPBan(iP71, (java.lang.Long)100L);
    tp2.IP iP76 = iPBan75.ip;
    tp2.IP iP77 = iPBan75.getIp();
    tp2.IP iP82 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP82.setFirst((java.lang.Integer)200);
    iPBan75.ip = iP82;
    iP82.setFourth((java.lang.Integer)242);
    java.lang.Integer i88 = iP82.getSecond();
    iPBan59.ip = iP82;
    iP82.setThird((java.lang.Integer)36);
    iPBan8.ip = iP82;
    tp2.IP iP93 = iPBan8.getIp();
    iPBan8.expires = 3875799040L;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i43 + "' != '" + 100+ "'", i43.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b46 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i54 + "' != '" + (-1)+ "'", i54.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i55 + "' != '" + 100+ "'", i55.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b64 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP76);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP77);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i88 + "' != '" + (-1)+ "'", i88.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP93);

  }

  @Test
  public void test417() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test417"); }


    int i1 = java.lang.Integer.lowestOneBit((-1461934336));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 256);

  }

  @Test
  public void test418() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test418"); }


    int i2 = java.lang.Integer.compareUnsigned(3216320, (-1444993024));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == (-1));

  }

  @Test
  public void test419() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test419"); }


    int i2 = java.lang.Integer.max(484, 2146566144);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 2146566144);

  }

  @Test
  public void test420() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test420"); }


    int i1 = java.lang.Integer.signum(93754428);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 1);

  }

  @Test
  public void test421() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test421"); }


    java.lang.String str2 = java.lang.Integer.toUnsignedString(452984933, 46032486);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "452984933"+ "'", str2.equals("452984933"));

  }

  @Test
  public void test422() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test422"); }


    int i2 = java.lang.Integer.compareUnsigned(2302604, 536870912);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == (-1));

  }

  @Test
  public void test423() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test423"); }


    tp2.IP iP4 = new tp2.IP((java.lang.Integer)1594950735, (java.lang.Integer)23552, (java.lang.Integer)556269824, (java.lang.Integer)1011010);
    iP4.setThird((java.lang.Integer)5221550);
    iP4.setThird((java.lang.Integer)1113064448);

  }

  @Test
  public void test424() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test424"); }


    int i1 = java.lang.Integer.reverseBytes((-402653184));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 232);

  }

  @Test
  public void test425() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test425"); }


    java.lang.String str1 = java.lang.Integer.toOctalString(765446662);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "5547745006"+ "'", str1.equals("5547745006"));

  }

  @Test
  public void test426() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test426"); }


    java.lang.String str1 = java.lang.Integer.toOctalString(4000);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "7640"+ "'", str1.equals("7640"));

  }

  @Test
  public void test427() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test427"); }


    tp2.IP iP4 = new tp2.IP((java.lang.Integer)(-867088896), (java.lang.Integer)174231553, (java.lang.Integer)383976, (java.lang.Integer)13);

  }

  @Test
  public void test428() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test428"); }


    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList0 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b1 = strictlySortedSinglyLinkedList0.repOK();
    strictlySortedSinglyLinkedList0.size = 1;
    boolean b4 = strictlySortedSinglyLinkedList0.isEmpty();
    int i5 = strictlySortedSinglyLinkedList0.getSize();
    int i6 = strictlySortedSinglyLinkedList0.getSize();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList7 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b8 = strictlySortedSinglyLinkedList7.repOK();
    tp2.IP iP13 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i14 = iP13.getSecond();
    iP13.setFirst((java.lang.Integer)11001000);
    iP13.setFirst((java.lang.Integer)(-2147483648));
    boolean b19 = strictlySortedSinglyLinkedList7.removeFromIP(iP13);
    tp2.IPBan iPBan21 = new tp2.IPBan(iP13, (java.lang.Long)0L);
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
    iPBan21.setIp(iP53);
    iPBan21.setExpires((java.lang.Long)5L);
    boolean b63 = strictlySortedSinglyLinkedList0.contains(iPBan21);
    java.lang.Long long64 = iPBan21.expires;
    tp2.IP iP65 = iPBan21.ip;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i14 + "' != '" + (-1)+ "'", i14.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
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
    org.junit.Assert.assertTrue(b63 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long64 + "' != '" + 5L+ "'", long64.equals(5L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP65);

  }

  @Test
  public void test429() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test429"); }


    int i1 = java.lang.Integer.parseInt("294890");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 294890);

  }

  @Test
  public void test430() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test430"); }


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
    int i24 = strictlySortedSinglyLinkedList0.getSize();
    int i25 = strictlySortedSinglyLinkedList0.getSize();
    tp2.Node node26 = strictlySortedSinglyLinkedList0.header;
    
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
    org.junit.Assert.assertTrue(i24 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node26);

  }

  @Test
  public void test431() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test431"); }


    int i2 = java.lang.Integer.rotateLeft(1530269639, 20485);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1723988203);

  }

  @Test
  public void test432() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test432"); }


    int i2 = java.lang.Integer.max(56594139, 10067);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 56594139);

  }

  @Test
  public void test433() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test433"); }


    java.lang.Integer i2 = java.lang.Integer.getInteger("311", (java.lang.Integer)10880);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i2 + "' != '" + 10880+ "'", i2.equals(10880));

  }

  @Test
  public void test434() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test434"); }


    java.lang.Integer i2 = java.lang.Integer.getInteger("", 216);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i2 + "' != '" + 216+ "'", i2.equals(216));

  }

  @Test
  public void test435() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test435"); }


    java.lang.Integer i1 = java.lang.Integer.valueOf(738230345);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 738230345+ "'", i1.equals(738230345));

  }

  @Test
  public void test436() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test436"); }


    int i1 = java.lang.Integer.numberOfTrailingZeros(1530269639);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);

  }

  @Test
  public void test437() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test437"); }


    int i1 = java.lang.Integer.reverseBytes((-173754698));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == (-1229544203));

  }

  @Test
  public void test438() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test438"); }


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
    java.lang.Integer i60 = iP52.getFourth();
    iP52.setFirst((java.lang.Integer)1700);
    iP52.setSecond((java.lang.Integer)17);
    java.lang.Integer i65 = iP52.getFourth();
    java.lang.Integer i66 = iP52.getFourth();
    java.lang.Integer i67 = null;
    iP52.setThird(i67);
    
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
    org.junit.Assert.assertTrue("'" + i60 + "' != '" + 100+ "'", i60.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i65 + "' != '" + 100+ "'", i65.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i66 + "' != '" + 100+ "'", i66.equals(100));

  }

  @Test
  public void test439() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test439"); }


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
    int i37 = strictlySortedSinglyLinkedList0.size;
    tp2.IP iP42 = new tp2.IP((java.lang.Integer)1100, (java.lang.Integer)23, (java.lang.Integer)5020, (java.lang.Integer)34);
    boolean b43 = strictlySortedSinglyLinkedList0.containsIP(iP42);
    java.lang.Integer i44 = iP42.getThird();
    tp2.SinglyLinkedList singlyLinkedList45 = new tp2.SinglyLinkedList();
    int i46 = singlyLinkedList45.getSize();
    tp2.IP iP51 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i52 = iP51.getSecond();
    java.lang.Integer i53 = iP51.getFourth();
    singlyLinkedList45.add(iP51);
    boolean b56 = iP51.equals((java.lang.Object)2147483647);
    tp2.IPBan iPBan58 = new tp2.IPBan(iP51, (java.lang.Long)(-1L));
    iP51.setSecond((java.lang.Integer)100);
    tp2.IPBan iPBan62 = new tp2.IPBan(iP51, (java.lang.Long)7L);
    boolean b63 = iP42.equals((java.lang.Object)iP51);
    
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
    org.junit.Assert.assertTrue(i37 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b43 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i44 + "' != '" + 5020+ "'", i44.equals(5020));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i46 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i52 + "' != '" + (-1)+ "'", i52.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i53 + "' != '" + 100+ "'", i53.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b56 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b63 == false);

  }

  @Test
  public void test440() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test440"); }


    tp2.IP iP4 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i5 = iP4.getSecond();
    iP4.setFirst((java.lang.Integer)11001000);
    java.lang.Long long8 = null;
    tp2.IPBan iPBan9 = new tp2.IPBan(iP4, long8);
    java.lang.Long long10 = iPBan9.getExpires();
    iPBan9.expires = 1L;
    tp2.IP iP17 = new tp2.IP((java.lang.Integer)67108864, (java.lang.Integer)(-2147483648), (java.lang.Integer)356246784, (java.lang.Integer)176016000);
    iPBan9.ip = iP17;
    tp2.IPBan iPBan20 = new tp2.IPBan(iP17, (java.lang.Long)29L);
    tp2.SinglyLinkedList singlyLinkedList21 = new tp2.SinglyLinkedList();
    int i22 = singlyLinkedList21.getSize();
    int i23 = singlyLinkedList21.getSize();
    tp2.IP iP24 = null;
    boolean b25 = singlyLinkedList21.contains(iP24);
    tp2.IP iP27 = singlyLinkedList21.get(27);
    tp2.IP iP32 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i33 = iP32.getSecond();
    iP32.setFirst((java.lang.Integer)11001000);
    java.lang.Long long36 = null;
    tp2.IPBan iPBan37 = new tp2.IPBan(iP32, long36);
    tp2.IP iP38 = iPBan37.ip;
    tp2.IP iP39 = iPBan37.ip;
    java.lang.Integer i40 = iP39.getFourth();
    boolean b41 = singlyLinkedList21.remove(iP39);
    tp2.IP iP46 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i47 = iP46.getSecond();
    iP46.setFirst((java.lang.Integer)11001000);
    java.lang.Long long50 = null;
    tp2.IPBan iPBan51 = new tp2.IPBan(iP46, long50);
    tp2.IP iP52 = iPBan51.ip;
    tp2.IP iP53 = iPBan51.ip;
    tp2.IPBan iPBan55 = new tp2.IPBan(iP53, (java.lang.Long)10L);
    singlyLinkedList21.add(iP53);
    tp2.IP iP58 = singlyLinkedList21.get(0);
    iPBan20.ip = iP58;
    java.lang.Integer i60 = iP58.getThird();
    tp2.IPBan iPBan62 = new tp2.IPBan(iP58, (java.lang.Long)16777440L);
    java.lang.Long long63 = null;
    iPBan62.expires = long63;
    java.lang.Long long65 = iPBan62.getExpires();
    java.lang.Long long66 = iPBan62.getExpires();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i5 + "' != '" + (-1)+ "'", i5.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(long10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i33 + "' != '" + (-1)+ "'", i33.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i40 + "' != '" + 100+ "'", i40.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i47 + "' != '" + (-1)+ "'", i47.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP58);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i60 + "' != '" + (-1)+ "'", i60.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(long65);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(long66);

  }

  @Test
  public void test441() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test441"); }


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
    tp2.SinglyLinkedList singlyLinkedList24 = new tp2.SinglyLinkedList();
    int i25 = singlyLinkedList24.getSize();
    tp2.IP iP30 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i31 = iP30.getSecond();
    java.lang.Integer i32 = iP30.getFourth();
    singlyLinkedList24.add(iP30);
    tp2.IPBan iPBan35 = new tp2.IPBan(iP30, (java.lang.Long)100L);
    iPBan35.expires = 10L;
    tp2.IP iP38 = iPBan35.getIp();
    iPBan35.expires = 0L;
    tp2.IP iP41 = null;
    iPBan35.ip = iP41;
    tp2.IP iP43 = iPBan35.ip;
    tp2.IP iP44 = iPBan35.ip;
    tp2.IP iP45 = iPBan35.getIp();
    // The following exception was thrown during execution in test generation
    try {
      boolean b46 = strictlySortedSinglyLinkedList0.add(iPBan35);
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
    org.junit.Assert.assertTrue(i25 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i31 + "' != '" + (-1)+ "'", i31.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i32 + "' != '" + 100+ "'", i32.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP45);

  }

  @Test
  public void test442() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test442"); }


    java.lang.String str1 = java.lang.Integer.toOctalString(57348);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "160004"+ "'", str1.equals("160004"));

  }

  @Test
  public void test443() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test443"); }


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
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList19 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b20 = strictlySortedSinglyLinkedList19.isEmpty();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList21 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b22 = strictlySortedSinglyLinkedList21.repOK();
    tp2.IP iP27 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    boolean b28 = strictlySortedSinglyLinkedList21.containsIP(iP27);
    tp2.Node node29 = strictlySortedSinglyLinkedList21.header;
    strictlySortedSinglyLinkedList19.header = node29;
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList31 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b32 = strictlySortedSinglyLinkedList31.repOK();
    strictlySortedSinglyLinkedList31.size = 1;
    strictlySortedSinglyLinkedList31.size = 0;
    tp2.IP iP41 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP41.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan45 = new tp2.IPBan(iP41, (java.lang.Long)100L);
    tp2.IP iP50 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP50.setFirst((java.lang.Integer)200);
    java.lang.Integer i53 = iP50.getFourth();
    iPBan45.setIp(iP50);
    boolean b55 = strictlySortedSinglyLinkedList31.contains(iPBan45);
    boolean b56 = strictlySortedSinglyLinkedList19.contains(iPBan45);
    tp2.IP iP57 = iPBan45.ip;
    tp2.IP iP58 = iPBan45.getIp();
    boolean b59 = strictlySortedSinglyLinkedList0.add(iPBan45);
    tp2.IP iP60 = iPBan45.getIp();
    iPBan45.expires = 128514L;
    tp2.IP iP63 = iPBan45.ip;
    iPBan45.expires = 3234818560L;
    
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
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i53 + "' != '" + 100+ "'", i53.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b55 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b56 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP58);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b59 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP60);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP63);

  }

  @Test
  public void test444() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test444"); }


    tp2.SinglyLinkedList singlyLinkedList0 = new tp2.SinglyLinkedList();
    int i1 = singlyLinkedList0.getSize();
    tp2.IP iP6 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i7 = iP6.getSecond();
    java.lang.Integer i8 = iP6.getFourth();
    singlyLinkedList0.add(iP6);
    tp2.IP iP11 = singlyLinkedList0.get(5);
    boolean b12 = singlyLinkedList0.isEmpty();
    int i13 = singlyLinkedList0.getSize();
    tp2.SinglyLinkedList singlyLinkedList14 = new tp2.SinglyLinkedList();
    int i15 = singlyLinkedList14.getSize();
    tp2.IP iP20 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i21 = iP20.getSecond();
    java.lang.Integer i22 = iP20.getFourth();
    singlyLinkedList14.add(iP20);
    tp2.IPBan iPBan25 = new tp2.IPBan(iP20, (java.lang.Long)100L);
    iP20.setThird((java.lang.Integer)(-2147483641));
    java.lang.Integer i28 = iP20.getFirst();
    singlyLinkedList0.add(iP20);
    tp2.IP iP31 = singlyLinkedList0.get(11001001);
    tp2.IP iP36 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP36.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan40 = new tp2.IPBan(iP36, (java.lang.Long)100L);
    tp2.IP iP41 = iPBan40.ip;
    tp2.IP iP46 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP46.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan50 = new tp2.IPBan(iP46, (java.lang.Long)100L);
    iPBan40.setIp(iP46);
    iPBan40.expires = 2013265920L;
    tp2.SinglyLinkedList singlyLinkedList54 = new tp2.SinglyLinkedList();
    int i55 = singlyLinkedList54.getSize();
    tp2.IP iP60 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i61 = iP60.getSecond();
    java.lang.Integer i62 = iP60.getFourth();
    singlyLinkedList54.add(iP60);
    tp2.IPBan iPBan65 = new tp2.IPBan(iP60, (java.lang.Long)100L);
    iPBan40.setIp(iP60);
    tp2.IPBan iPBan68 = new tp2.IPBan(iP60, (java.lang.Long)2147483648L);
    boolean b69 = singlyLinkedList0.contains(iP60);
    
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
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i21 + "' != '" + (-1)+ "'", i21.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i22 + "' != '" + 100+ "'", i22.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i28 + "' != '" + (-1)+ "'", i28.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i55 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i61 + "' != '" + (-1)+ "'", i61.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i62 + "' != '" + 100+ "'", i62.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b69 == true);

  }

  @Test
  public void test445() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test445"); }


    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList0 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b1 = strictlySortedSinglyLinkedList0.isEmpty();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList2 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b3 = strictlySortedSinglyLinkedList2.repOK();
    tp2.IP iP8 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    boolean b9 = strictlySortedSinglyLinkedList2.containsIP(iP8);
    tp2.Node node10 = strictlySortedSinglyLinkedList2.header;
    strictlySortedSinglyLinkedList0.header = node10;
    tp2.Node node12 = strictlySortedSinglyLinkedList0.header;
    tp2.IP iP17 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i18 = iP17.getSecond();
    java.lang.Integer i19 = iP17.getFourth();
    iP17.setFirst((java.lang.Integer)5);
    iP17.setSecond((java.lang.Integer)11001000);
    tp2.IPBan iPBan25 = new tp2.IPBan(iP17, (java.lang.Long)100L);
    java.lang.Long long26 = iPBan25.getExpires();
    boolean b27 = strictlySortedSinglyLinkedList0.add(iPBan25);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList28 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b29 = strictlySortedSinglyLinkedList28.repOK();
    strictlySortedSinglyLinkedList28.size = 1;
    boolean b32 = strictlySortedSinglyLinkedList28.isEmpty();
    tp2.SinglyLinkedList singlyLinkedList33 = new tp2.SinglyLinkedList();
    int i34 = singlyLinkedList33.getSize();
    tp2.IP iP39 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i40 = iP39.getSecond();
    java.lang.Integer i41 = iP39.getFourth();
    singlyLinkedList33.add(iP39);
    boolean b44 = iP39.equals((java.lang.Object)2147483647);
    tp2.IPBan iPBan46 = new tp2.IPBan(iP39, (java.lang.Long)(-1L));
    java.lang.Long long47 = iPBan46.expires;
    boolean b48 = strictlySortedSinglyLinkedList28.contains(iPBan46);
    tp2.IP iP49 = iPBan46.ip;
    java.lang.Object obj50 = null;
    boolean b51 = iP49.equals(obj50);
    iPBan25.setIp(iP49);
    iP49.setFirst((java.lang.Integer)154);
    iP49.setSecond((java.lang.Integer)1327300766);
    java.lang.Integer i57 = iP49.getSecond();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i18 + "' != '" + (-1)+ "'", i18.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i19 + "' != '" + 100+ "'", i19.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long26 + "' != '" + 100L+ "'", long26.equals(100L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == true);
    
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
    org.junit.Assert.assertTrue("'" + long47 + "' != '" + (-1L)+ "'", long47.equals((-1L)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b48 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b51 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i57 + "' != '" + 1327300766+ "'", i57.equals(1327300766));

  }

  @Test
  public void test446() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test446"); }


    tp2.IP iP4 = new tp2.IP((java.lang.Integer)518833, (java.lang.Integer)7175245, (java.lang.Integer)1879048192, (java.lang.Integer)1142947850);

  }

  @Test
  public void test447() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test447"); }


    java.lang.String str1 = java.lang.Integer.toUnsignedString(356302787);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "356302787"+ "'", str1.equals("356302787"));

  }

  @Test
  public void test448() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test448"); }


    // The following exception was thrown during execution in test generation
    try {
      java.lang.Integer i1 = java.lang.Integer.decode("6000467402");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test449() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test449"); }


    int i2 = java.lang.Integer.rotateRight(305005, 133);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1744839995);

  }

  @Test
  public void test450() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test450"); }


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
    tp2.IP iP25 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP25.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan29 = new tp2.IPBan(iP25, (java.lang.Long)100L);
    tp2.IP iP34 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iPBan29.setIp(iP34);
    singlyLinkedList0.add(iP34);
    tp2.IP iP38 = singlyLinkedList0.get(184549395);
    int i39 = singlyLinkedList0.getSize();
    boolean b40 = singlyLinkedList0.repOK();
    tp2.SinglyLinkedList singlyLinkedList41 = new tp2.SinglyLinkedList();
    int i42 = singlyLinkedList41.getSize();
    int i43 = singlyLinkedList41.getSize();
    tp2.IP iP44 = null;
    boolean b45 = singlyLinkedList41.contains(iP44);
    tp2.IP iP47 = singlyLinkedList41.get(27);
    tp2.IP iP52 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i53 = iP52.getSecond();
    iP52.setFirst((java.lang.Integer)11001000);
    java.lang.Long long56 = null;
    tp2.IPBan iPBan57 = new tp2.IPBan(iP52, long56);
    tp2.IP iP58 = iPBan57.ip;
    tp2.IP iP59 = iPBan57.ip;
    java.lang.Integer i60 = iP59.getFourth();
    boolean b61 = singlyLinkedList41.remove(iP59);
    boolean b62 = singlyLinkedList0.remove(iP59);
    boolean b63 = singlyLinkedList0.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i18 + "' != '" + 100+ "'", i18.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i39 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i42 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i43 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i53 + "' != '" + (-1)+ "'", i53.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP58);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP59);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i60 + "' != '" + 100+ "'", i60.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b61 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b62 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b63 == false);

  }

  @Test
  public void test451() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test451"); }


    int i1 = java.lang.Integer.signum(12180578);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 1);

  }

  @Test
  public void test452() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test452"); }


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
    tp2.Node node29 = strictlySortedSinglyLinkedList0.header;
    tp2.IP iP34 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP34.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan38 = new tp2.IPBan(iP34, (java.lang.Long)100L);
    tp2.IP iP43 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i44 = iP43.getSecond();
    java.lang.Integer i45 = iP43.getFourth();
    iP43.setFirst((java.lang.Integer)5);
    iPBan38.ip = iP43;
    java.lang.Long long49 = iPBan38.getExpires();
    iPBan38.setExpires((java.lang.Long)(-1L));
    iPBan38.expires = 100L;
    tp2.IP iP58 = new tp2.IP((java.lang.Integer)242, (java.lang.Integer)242, (java.lang.Integer)30, (java.lang.Integer)(-1));
    iP58.setSecond((java.lang.Integer)33554432);
    iPBan38.setIp(iP58);
    java.lang.Long long62 = iPBan38.expires;
    java.lang.Long long63 = iPBan38.expires;
    boolean b64 = strictlySortedSinglyLinkedList0.add(iPBan38);
    tp2.Node node65 = strictlySortedSinglyLinkedList0.header;
    
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
    org.junit.Assert.assertNotNull(node29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i44 + "' != '" + (-1)+ "'", i44.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i45 + "' != '" + 100+ "'", i45.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long49 + "' != '" + 100L+ "'", long49.equals(100L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long62 + "' != '" + 100L+ "'", long62.equals(100L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long63 + "' != '" + 100L+ "'", long63.equals(100L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b64 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node65);

  }

  @Test
  public void test453() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test453"); }


    tp2.IP iP4 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i5 = iP4.getSecond();
    iP4.setFirst((java.lang.Integer)11001000);
    java.lang.Long long8 = null;
    tp2.IPBan iPBan9 = new tp2.IPBan(iP4, long8);
    tp2.IP iP10 = iPBan9.ip;
    tp2.IP iP11 = iPBan9.ip;
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList12 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b13 = strictlySortedSinglyLinkedList12.isEmpty();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList14 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b15 = strictlySortedSinglyLinkedList14.repOK();
    tp2.IP iP20 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    boolean b21 = strictlySortedSinglyLinkedList14.containsIP(iP20);
    tp2.Node node22 = strictlySortedSinglyLinkedList14.header;
    strictlySortedSinglyLinkedList12.header = node22;
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList24 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b25 = strictlySortedSinglyLinkedList24.repOK();
    strictlySortedSinglyLinkedList24.size = 1;
    strictlySortedSinglyLinkedList24.size = 0;
    tp2.IP iP34 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP34.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan38 = new tp2.IPBan(iP34, (java.lang.Long)100L);
    tp2.IP iP43 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP43.setFirst((java.lang.Integer)200);
    java.lang.Integer i46 = iP43.getFourth();
    iPBan38.setIp(iP43);
    boolean b48 = strictlySortedSinglyLinkedList24.contains(iPBan38);
    boolean b49 = strictlySortedSinglyLinkedList12.contains(iPBan38);
    tp2.IP iP50 = iPBan38.ip;
    boolean b52 = iP50.equals((java.lang.Object)117440640);
    iPBan9.setIp(iP50);
    java.lang.Integer i54 = iP50.getThird();
    iP50.setFourth((java.lang.Integer)5061573);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i5 + "' != '" + (-1)+ "'", i5.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i46 + "' != '" + 100+ "'", i46.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b48 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b49 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b52 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i54 + "' != '" + (-1)+ "'", i54.equals((-1)));

  }

  @Test
  public void test454() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test454"); }


    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList0 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b1 = strictlySortedSinglyLinkedList0.isEmpty();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList2 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b3 = strictlySortedSinglyLinkedList2.repOK();
    tp2.IP iP8 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    boolean b9 = strictlySortedSinglyLinkedList2.containsIP(iP8);
    tp2.Node node10 = strictlySortedSinglyLinkedList2.header;
    strictlySortedSinglyLinkedList0.header = node10;
    boolean b12 = strictlySortedSinglyLinkedList0.isEmpty();
    strictlySortedSinglyLinkedList0.size = 6;
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList15 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b16 = strictlySortedSinglyLinkedList15.isEmpty();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList17 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b18 = strictlySortedSinglyLinkedList17.repOK();
    tp2.IP iP23 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    boolean b24 = strictlySortedSinglyLinkedList17.containsIP(iP23);
    tp2.Node node25 = strictlySortedSinglyLinkedList17.header;
    strictlySortedSinglyLinkedList15.header = node25;
    int i27 = strictlySortedSinglyLinkedList15.getSize();
    tp2.SinglyLinkedList singlyLinkedList28 = new tp2.SinglyLinkedList();
    boolean b29 = singlyLinkedList28.repOK();
    tp2.IP iP31 = singlyLinkedList28.get(200);
    boolean b32 = singlyLinkedList28.isEmpty();
    boolean b33 = singlyLinkedList28.repOK();
    boolean b34 = singlyLinkedList28.repOK();
    tp2.IP iP39 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i40 = iP39.getThird();
    singlyLinkedList28.add(iP39);
    int i42 = singlyLinkedList28.getSize();
    tp2.IP iP47 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i48 = iP47.getSecond();
    iP47.setFirst((java.lang.Integer)11001000);
    java.lang.Long long51 = null;
    tp2.IPBan iPBan52 = new tp2.IPBan(iP47, long51);
    java.lang.Long long53 = iPBan52.getExpires();
    iPBan52.expires = 1L;
    tp2.IP iP60 = new tp2.IP((java.lang.Integer)67108864, (java.lang.Integer)(-2147483648), (java.lang.Integer)356246784, (java.lang.Integer)176016000);
    iPBan52.ip = iP60;
    boolean b62 = singlyLinkedList28.contains(iP60);
    tp2.IPBan iPBan64 = new tp2.IPBan(iP60, (java.lang.Long)3925251L);
    boolean b65 = strictlySortedSinglyLinkedList15.containsIP(iP60);
    boolean b66 = strictlySortedSinglyLinkedList0.containsIP(iP60);
    boolean b67 = strictlySortedSinglyLinkedList0.isEmpty();
    strictlySortedSinglyLinkedList0.size = 57406;
    
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
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i40 + "' != '" + (-1)+ "'", i40.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i42 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i48 + "' != '" + (-1)+ "'", i48.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(long53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b62 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b65 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b66 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b67 == true);

  }

  @Test
  public void test455() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test455"); }


    java.lang.String str1 = java.lang.Integer.toUnsignedString(837);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "837"+ "'", str1.equals("837"));

  }

  @Test
  public void test456() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test456"); }


    int i2 = java.lang.Integer.remainderUnsigned(33554870, 8433919);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 8253113);

  }

  @Test
  public void test457() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test457"); }


    java.lang.String str2 = java.lang.Integer.toUnsignedString(2302604, 2088174752);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "2302604"+ "'", str2.equals("2302604"));

  }

  @Test
  public void test458() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test458"); }


    java.lang.Integer i1 = new java.lang.Integer(1040000);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 1040000+ "'", i1.equals(1040000));

  }

  @Test
  public void test459() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test459"); }


    tp2.SinglyLinkedList singlyLinkedList0 = new tp2.SinglyLinkedList();
    int i1 = singlyLinkedList0.getSize();
    tp2.IP iP6 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i7 = iP6.getSecond();
    java.lang.Integer i8 = iP6.getFourth();
    singlyLinkedList0.add(iP6);
    tp2.IPBan iPBan11 = new tp2.IPBan(iP6, (java.lang.Long)100L);
    iP6.setFourth((java.lang.Integer)1);
    iP6.setFirst((java.lang.Integer)(-671088640));
    java.lang.Integer i16 = iP6.getFirst();
    java.lang.Integer i17 = iP6.getThird();
    java.lang.Integer i18 = iP6.getSecond();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i7 + "' != '" + (-1)+ "'", i7.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i8 + "' != '" + 100+ "'", i8.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i16 + "' != '" + (-671088640)+ "'", i16.equals((-671088640)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i17 + "' != '" + (-1)+ "'", i17.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i18 + "' != '" + (-1)+ "'", i18.equals((-1)));

  }

  @Test
  public void test460() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test460"); }


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
    int i20 = strictlySortedSinglyLinkedList0.getSize();
    tp2.IPBan iPBan22 = strictlySortedSinglyLinkedList0.get((-1471371072));
    boolean b23 = strictlySortedSinglyLinkedList0.isEmpty();
    
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
    org.junit.Assert.assertTrue(i20 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iPBan22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);

  }

  @Test
  public void test461() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test461"); }


    long long1 = java.lang.Integer.toUnsignedLong(169091127);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == 169091127L);

  }

  @Test
  public void test462() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test462"); }


    int i2 = java.lang.Integer.max((-383271559), 1803026688);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1803026688);

  }

  @Test
  public void test463() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test463"); }


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
    strictlySortedSinglyLinkedList0.size = (-1073741824);
    boolean b43 = strictlySortedSinglyLinkedList0.isEmpty();
    boolean b44 = strictlySortedSinglyLinkedList0.repOK();
    tp2.IPBan iPBan46 = strictlySortedSinglyLinkedList0.get((-744603250));
    
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
    org.junit.Assert.assertTrue(b43 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iPBan46);

  }

  @Test
  public void test464() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test464"); }


    // The following exception was thrown during execution in test generation
    try {
      int i2 = java.lang.Integer.parseUnsignedInt("93754428", 37612);
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test465() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test465"); }


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
    tp2.IP iP79 = null;
    boolean b80 = strictlySortedSinglyLinkedList0.removeFromIP(iP79);
    int i81 = strictlySortedSinglyLinkedList0.getSize();
    
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
    org.junit.Assert.assertTrue(b80 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i81 == 1);

  }

  @Test
  public void test466() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test466"); }


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
    java.lang.Integer i15 = iP6.getFourth();
    iP6.setThird((java.lang.Integer)(-2146933598));
    java.lang.Integer i18 = iP6.getThird();
    iP6.setSecond((java.lang.Integer)10880);
    
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
    org.junit.Assert.assertTrue("'" + i15 + "' != '" + 100+ "'", i15.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i18 + "' != '" + (-2146933598)+ "'", i18.equals((-2146933598)));

  }

  @Test
  public void test467() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test467"); }


    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList0 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b1 = strictlySortedSinglyLinkedList0.repOK();
    boolean b2 = strictlySortedSinglyLinkedList0.repOK();
    tp2.IPBan iPBan3 = null;
    boolean b4 = strictlySortedSinglyLinkedList0.add(iPBan3);
    strictlySortedSinglyLinkedList0.size = (-1275068414);
    int i7 = strictlySortedSinglyLinkedList0.getSize();
    int i8 = strictlySortedSinglyLinkedList0.size;
    strictlySortedSinglyLinkedList0.size = 10000;
    tp2.IPBan iPBan12 = strictlySortedSinglyLinkedList0.get(503301837);
    tp2.IPBan iPBan13 = null;
    // The following exception was thrown during execution in test generation
    try {
      boolean b14 = strictlySortedSinglyLinkedList0.add(iPBan13);
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
    org.junit.Assert.assertTrue(i7 == (-1275068414));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == (-1275068414));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iPBan12);

  }

  @Test
  public void test468() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test468"); }


    int i1 = java.lang.Integer.lowestOneBit(8389282);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 2);

  }

  @Test
  public void test469() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test469"); }


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
    tp2.IP iP49 = iPBan8.ip;
    iP49.setThird((java.lang.Integer)(-2025848320));
    
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

  }

  @Test
  public void test470() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test470"); }


    int i2 = java.lang.Integer.compare((-419168256), 1123418368);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == (-1));

  }

  @Test
  public void test471() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test471"); }


    int i2 = java.lang.Integer.min((-2023746560), 21836);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == (-2023746560));

  }

  @Test
  public void test472() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test472"); }


    int i2 = java.lang.Integer.rotateLeft(738562873, 1657386735);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == (-912484862));

  }

  @Test
  public void test473() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test473"); }


    int i1 = java.lang.Integer.bitCount((-855538153));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 13);

  }

  @Test
  public void test474() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test474"); }


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
    tp2.Node node28 = strictlySortedSinglyLinkedList0.header;
    tp2.IPBan iPBan30 = strictlySortedSinglyLinkedList0.get(0);
    tp2.IP iP35 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP35.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan39 = new tp2.IPBan(iP35, (java.lang.Long)100L);
    tp2.IP iP44 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i45 = iP44.getSecond();
    java.lang.Integer i46 = iP44.getFourth();
    iP44.setFirst((java.lang.Integer)5);
    iPBan39.ip = iP44;
    java.lang.Long long50 = iPBan39.getExpires();
    iPBan39.expires = 2147483648L;
    tp2.IP iP53 = iPBan39.getIp();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList54 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b55 = strictlySortedSinglyLinkedList54.repOK();
    tp2.IP iP60 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i61 = iP60.getSecond();
    iP60.setFirst((java.lang.Integer)11001000);
    iP60.setFirst((java.lang.Integer)(-2147483648));
    boolean b66 = strictlySortedSinglyLinkedList54.removeFromIP(iP60);
    java.lang.Integer i67 = iP60.getSecond();
    java.lang.Integer i68 = iP60.getFourth();
    iP60.setFourth((java.lang.Integer)64);
    iP60.setFirst((java.lang.Integer)(-671088640));
    tp2.IPBan iPBan74 = new tp2.IPBan(iP60, (java.lang.Long)29L);
    java.lang.Integer i75 = iP60.getFirst();
    iPBan39.ip = iP60;
    boolean b77 = strictlySortedSinglyLinkedList0.contains(iPBan39);
    tp2.IP iP78 = iPBan39.getIp();
    iPBan39.expires = 55681743L;
    
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
    org.junit.Assert.assertNotNull(node28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iPBan30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i45 + "' != '" + (-1)+ "'", i45.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i46 + "' != '" + 100+ "'", i46.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long50 + "' != '" + 100L+ "'", long50.equals(100L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b55 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i61 + "' != '" + (-1)+ "'", i61.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b66 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i67 + "' != '" + (-1)+ "'", i67.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i68 + "' != '" + 100+ "'", i68.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i75 + "' != '" + (-671088640)+ "'", i75.equals((-671088640)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b77 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP78);

  }

  @Test
  public void test475() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test475"); }


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
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList16 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b17 = strictlySortedSinglyLinkedList16.repOK();
    strictlySortedSinglyLinkedList16.size = 1;
    strictlySortedSinglyLinkedList16.size = 0;
    tp2.IP iP26 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP26.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan30 = new tp2.IPBan(iP26, (java.lang.Long)100L);
    tp2.IP iP31 = iPBan30.ip;
    boolean b32 = strictlySortedSinglyLinkedList16.contains(iPBan30);
    boolean b33 = strictlySortedSinglyLinkedList16.repOK();
    tp2.SinglyLinkedList singlyLinkedList34 = new tp2.SinglyLinkedList();
    int i35 = singlyLinkedList34.getSize();
    tp2.IP iP40 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i41 = iP40.getSecond();
    java.lang.Integer i42 = iP40.getFourth();
    singlyLinkedList34.add(iP40);
    boolean b45 = iP40.equals((java.lang.Object)2147483647);
    tp2.IPBan iPBan47 = new tp2.IPBan(iP40, (java.lang.Long)(-1L));
    boolean b48 = strictlySortedSinglyLinkedList16.add(iPBan47);
    iPBan47.setExpires((java.lang.Long)0L);
    java.lang.Long long51 = iPBan47.getExpires();
    boolean b52 = strictlySortedSinglyLinkedList0.contains(iPBan47);
    java.lang.Long long53 = iPBan47.getExpires();
    java.lang.Long long54 = iPBan47.expires;
    
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
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i35 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i41 + "' != '" + (-1)+ "'", i41.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i42 + "' != '" + 100+ "'", i42.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b48 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long51 + "' != '" + 0L+ "'", long51.equals(0L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b52 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long53 + "' != '" + 0L+ "'", long53.equals(0L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long54 + "' != '" + 0L+ "'", long54.equals(0L));

  }

  @Test
  public void test476() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test476"); }


    // The following exception was thrown during execution in test generation
    try {
      int i2 = java.lang.Integer.parseInt("10010001001000011010111101100000", 995945268);
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test477() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test477"); }


    java.lang.Integer i1 = new java.lang.Integer(594);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 594+ "'", i1.equals(594));

  }

  @Test
  public void test478() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test478"); }


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
    iP24.setFirst((java.lang.Integer)335544320);
    iP24.setFirst((java.lang.Integer)(-1073741606));
    
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

  }

  @Test
  public void test479() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test479"); }


    int i1 = java.lang.Integer.reverse(371235425);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == (-2040986520));

  }

  @Test
  public void test480() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test480"); }


    // The following exception was thrown during execution in test generation
    try {
      java.lang.Integer i2 = java.lang.Integer.valueOf("16777216", (-83796308));
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test481() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test481"); }


    int i1 = java.lang.Integer.lowestOneBit(1837105184);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 32);

  }

  @Test
  public void test482() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test482"); }


    java.lang.String str1 = java.lang.Integer.toOctalString(727732918);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "5330051266"+ "'", str1.equals("5330051266"));

  }

  @Test
  public void test483() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test483"); }


    tp2.IP iP4 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i5 = iP4.getSecond();
    tp2.SinglyLinkedList singlyLinkedList6 = new tp2.SinglyLinkedList();
    boolean b7 = singlyLinkedList6.repOK();
    boolean b8 = iP4.equals((java.lang.Object)b7);
    tp2.IPBan iPBan10 = new tp2.IPBan(iP4, (java.lang.Long)100L);
    tp2.IP iP11 = iPBan10.getIp();
    tp2.IPBan iPBan13 = new tp2.IPBan(iP11, (java.lang.Long)13L);
    iPBan13.setExpires((java.lang.Long)6029312L);
    tp2.IP iP20 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP20.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan24 = new tp2.IPBan(iP20, (java.lang.Long)100L);
    tp2.IP iP25 = iPBan24.ip;
    tp2.IP iP30 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP30.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan34 = new tp2.IPBan(iP30, (java.lang.Long)100L);
    iPBan24.setIp(iP30);
    tp2.IP iP40 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP40.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan44 = new tp2.IPBan(iP40, (java.lang.Long)100L);
    java.lang.Integer i45 = iP40.getFirst();
    java.lang.Integer i46 = iP40.getFourth();
    iPBan24.setIp(iP40);
    tp2.IP iP48 = iPBan24.getIp();
    tp2.SinglyLinkedList singlyLinkedList49 = new tp2.SinglyLinkedList();
    int i50 = singlyLinkedList49.getSize();
    tp2.IP iP55 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i56 = iP55.getSecond();
    java.lang.Integer i57 = iP55.getFourth();
    singlyLinkedList49.add(iP55);
    tp2.IPBan iPBan60 = new tp2.IPBan(iP55, (java.lang.Long)100L);
    iP55.setThird((java.lang.Integer)(-2147483641));
    java.lang.Integer i63 = iP55.getSecond();
    iPBan24.ip = iP55;
    tp2.IP iP65 = iPBan24.ip;
    java.lang.Integer i66 = iP65.getFourth();
    iPBan13.setIp(iP65);
    iP65.setFourth((java.lang.Integer)4195041);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i5 + "' != '" + (-1)+ "'", i5.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i45 + "' != '" + 200+ "'", i45.equals(200));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i46 + "' != '" + 100+ "'", i46.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i50 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i56 + "' != '" + (-1)+ "'", i56.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i57 + "' != '" + 100+ "'", i57.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i63 + "' != '" + (-1)+ "'", i63.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP65);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i66 + "' != '" + 100+ "'", i66.equals(100));

  }

  @Test
  public void test484() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test484"); }


    // The following exception was thrown during execution in test generation
    try {
      int i1 = java.lang.Integer.parseInt("362b300");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test485() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test485"); }


    java.lang.String str1 = java.lang.Integer.toBinaryString(1434634);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "101011110010000001010"+ "'", str1.equals("101011110010000001010"));

  }

  @Test
  public void test486() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test486"); }


    java.lang.Integer i1 = new java.lang.Integer((-1878982656));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + (-1878982656)+ "'", i1.equals((-1878982656)));

  }

  @Test
  public void test487() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test487"); }


    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList0 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b1 = strictlySortedSinglyLinkedList0.repOK();
    tp2.IP iP6 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i7 = iP6.getSecond();
    iP6.setFirst((java.lang.Integer)11001000);
    iP6.setFirst((java.lang.Integer)(-2147483648));
    boolean b12 = strictlySortedSinglyLinkedList0.removeFromIP(iP6);
    tp2.IPBan iPBan14 = strictlySortedSinglyLinkedList0.get((-1));
    boolean b15 = strictlySortedSinglyLinkedList0.repOK();
    boolean b16 = strictlySortedSinglyLinkedList0.isEmpty();
    tp2.SinglyLinkedList singlyLinkedList17 = new tp2.SinglyLinkedList();
    int i18 = singlyLinkedList17.getSize();
    tp2.IP iP23 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i24 = iP23.getSecond();
    iP23.setFirst((java.lang.Integer)11001000);
    iP23.setFirst((java.lang.Integer)32);
    boolean b29 = singlyLinkedList17.remove(iP23);
    int i30 = singlyLinkedList17.getSize();
    tp2.SinglyLinkedList singlyLinkedList31 = new tp2.SinglyLinkedList();
    int i32 = singlyLinkedList31.getSize();
    tp2.IP iP37 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i38 = iP37.getSecond();
    java.lang.Integer i39 = iP37.getFourth();
    singlyLinkedList31.add(iP37);
    boolean b42 = iP37.equals((java.lang.Object)2147483647);
    tp2.IPBan iPBan44 = new tp2.IPBan(iP37, (java.lang.Long)(-1L));
    java.lang.Long long45 = iPBan44.expires;
    tp2.IP iP50 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP50.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan54 = new tp2.IPBan(iP50, (java.lang.Long)100L);
    tp2.IP iP55 = iPBan54.ip;
    iP55.setThird((java.lang.Integer)356246784);
    iPBan44.ip = iP55;
    iP55.setFourth((java.lang.Integer)0);
    boolean b61 = singlyLinkedList17.contains(iP55);
    java.lang.Integer i62 = iP55.getSecond();
    boolean b63 = strictlySortedSinglyLinkedList0.removeFromIP(iP55);
    tp2.IPBan iPBan65 = new tp2.IPBan(iP55, (java.lang.Long)181654858L);
    
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
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i24 + "' != '" + (-1)+ "'", i24.equals((-1)));
    
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
    org.junit.Assert.assertTrue(b42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long45 + "' != '" + (-1L)+ "'", long45.equals((-1L)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP55);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b61 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i62 + "' != '" + (-1)+ "'", i62.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b63 == false);

  }

  @Test
  public void test488() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test488"); }


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
    boolean b35 = strictlySortedSinglyLinkedList0.isEmpty();
    boolean b36 = strictlySortedSinglyLinkedList0.repOK();
    tp2.IPBan iPBan38 = strictlySortedSinglyLinkedList0.get(1011134);
    boolean b39 = strictlySortedSinglyLinkedList0.repOK();
    
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
    org.junit.Assert.assertTrue(b35 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iPBan38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == false);

  }

  @Test
  public void test489() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test489"); }


    long long1 = java.lang.Integer.toUnsignedLong(10175748);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == 10175748L);

  }

  @Test
  public void test490() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test490"); }


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
    boolean b54 = strictlySortedSinglyLinkedList0.isEmpty();
    strictlySortedSinglyLinkedList0.size = 623247555;
    tp2.Node node57 = strictlySortedSinglyLinkedList0.header;
    
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
    org.junit.Assert.assertTrue(b54 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node57);

  }

  @Test
  public void test491() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test491"); }


    java.lang.Integer i1 = java.lang.Integer.getInteger("2921473880");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);

  }

  @Test
  public void test492() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test492"); }


    int i1 = java.lang.Integer.bitCount(3925493);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 16);

  }

  @Test
  public void test493() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test493"); }


    int i1 = java.lang.Integer.parseInt("1308183544");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 1308183544);

  }

  @Test
  public void test494() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test494"); }


    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList0 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b1 = strictlySortedSinglyLinkedList0.repOK();
    strictlySortedSinglyLinkedList0.size = 1;
    strictlySortedSinglyLinkedList0.size = 0;
    int i6 = strictlySortedSinglyLinkedList0.size;
    tp2.Node node7 = strictlySortedSinglyLinkedList0.header;
    tp2.IPBan iPBan9 = strictlySortedSinglyLinkedList0.get(3801088);
    tp2.Node node10 = strictlySortedSinglyLinkedList0.header;
    tp2.IP iP15 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP15.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan19 = new tp2.IPBan(iP15, (java.lang.Long)100L);
    tp2.IP iP20 = iPBan19.ip;
    tp2.IP iP25 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i26 = iP25.getFourth();
    java.lang.Integer i27 = iP25.getFourth();
    iP25.setThird((java.lang.Integer)200);
    iPBan19.ip = iP25;
    tp2.IP iP35 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP35.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan39 = new tp2.IPBan(iP35, (java.lang.Long)100L);
    tp2.IP iP40 = iPBan39.ip;
    tp2.IP iP45 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP45.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan49 = new tp2.IPBan(iP45, (java.lang.Long)100L);
    iPBan39.setIp(iP45);
    java.lang.Long long51 = iPBan39.getExpires();
    tp2.IP iP52 = iPBan39.ip;
    iP52.setThird((java.lang.Integer)0);
    iPBan19.ip = iP52;
    tp2.IP iP56 = iPBan19.ip;
    boolean b57 = strictlySortedSinglyLinkedList0.add(iPBan19);
    boolean b58 = strictlySortedSinglyLinkedList0.repOK();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iPBan9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i26 + "' != '" + 100+ "'", i26.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i27 + "' != '" + 100+ "'", i27.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long51 + "' != '" + 100L+ "'", long51.equals(100L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b57 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b58 == true);

  }

  @Test
  public void test495() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test495"); }


    int i2 = java.lang.Integer.divideUnsigned((-1262912672), 565615239);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 5);

  }

  @Test
  public void test496() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test496"); }


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
    tp2.IP iP36 = null;
    boolean b37 = strictlySortedSinglyLinkedList0.containsIP(iP36);
    int i38 = strictlySortedSinglyLinkedList0.size;
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList39 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b40 = strictlySortedSinglyLinkedList39.repOK();
    tp2.IP iP45 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    boolean b46 = strictlySortedSinglyLinkedList39.containsIP(iP45);
    int i47 = strictlySortedSinglyLinkedList39.getSize();
    tp2.SinglyLinkedList singlyLinkedList48 = new tp2.SinglyLinkedList();
    int i49 = singlyLinkedList48.getSize();
    tp2.IP iP54 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i55 = iP54.getSecond();
    java.lang.Integer i56 = iP54.getFourth();
    singlyLinkedList48.add(iP54);
    tp2.IPBan iPBan59 = new tp2.IPBan(iP54, (java.lang.Long)100L);
    iPBan59.expires = 10L;
    tp2.IP iP62 = iPBan59.getIp();
    iPBan59.expires = 0L;
    java.lang.Long long65 = iPBan59.expires;
    boolean b66 = strictlySortedSinglyLinkedList39.add(iPBan59);
    int i67 = strictlySortedSinglyLinkedList39.getSize();
    tp2.Node node68 = strictlySortedSinglyLinkedList39.header;
    strictlySortedSinglyLinkedList0.header = node68;
    tp2.SinglyLinkedList singlyLinkedList70 = new tp2.SinglyLinkedList();
    int i71 = singlyLinkedList70.getSize();
    tp2.IP iP76 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i77 = iP76.getSecond();
    java.lang.Integer i78 = iP76.getFourth();
    singlyLinkedList70.add(iP76);
    tp2.IP iP81 = singlyLinkedList70.get(5);
    boolean b82 = singlyLinkedList70.repOK();
    tp2.IP iP84 = singlyLinkedList70.get(2013265920);
    boolean b85 = singlyLinkedList70.isEmpty();
    boolean b86 = singlyLinkedList70.isEmpty();
    int i87 = singlyLinkedList70.getSize();
    int i88 = singlyLinkedList70.getSize();
    boolean b89 = singlyLinkedList70.repOK();
    int i90 = singlyLinkedList70.getSize();
    tp2.IP iP92 = singlyLinkedList70.get(0);
    iP92.setThird((java.lang.Integer)(-2));
    iP92.setFourth((java.lang.Integer)4980736);
    boolean b97 = strictlySortedSinglyLinkedList0.containsIP(iP92);
    tp2.Node node98 = strictlySortedSinglyLinkedList0.header;
    
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
    org.junit.Assert.assertTrue(b37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i38 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b46 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i47 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i49 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i55 + "' != '" + (-1)+ "'", i55.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i56 + "' != '" + 100+ "'", i56.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP62);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long65 + "' != '" + 0L+ "'", long65.equals(0L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b66 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i67 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node68);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i71 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i77 + "' != '" + (-1)+ "'", i77.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i78 + "' != '" + 100+ "'", i78.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP81);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b82 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP84);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b85 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b86 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i87 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i88 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b89 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i90 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP92);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b97 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node98);

  }

  @Test
  public void test497() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test497"); }


    int i2 = java.lang.Integer.min(1879048192, 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 12);

  }

  @Test
  public void test498() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test498"); }


    int i1 = java.lang.Integer.reverseBytes(536903789);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 1837105184);

  }

  @Test
  public void test499() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test499"); }


    int i1 = java.lang.Integer.numberOfLeadingZeros(314);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 23);

  }

  @Test
  public void test500() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test500"); }


    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList0 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b1 = strictlySortedSinglyLinkedList0.isEmpty();
    tp2.IP iP6 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP6.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan10 = new tp2.IPBan(iP6, (java.lang.Long)100L);
    tp2.IP iP11 = iPBan10.ip;
    tp2.IP iP16 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP16.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan20 = new tp2.IPBan(iP16, (java.lang.Long)100L);
    iPBan10.setIp(iP16);
    tp2.IP iP26 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP26.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan30 = new tp2.IPBan(iP26, (java.lang.Long)100L);
    java.lang.Integer i31 = iP26.getFirst();
    java.lang.Integer i32 = iP26.getFourth();
    iPBan10.setIp(iP26);
    tp2.IP iP34 = iPBan10.getIp();
    tp2.IP iP35 = iPBan10.getIp();
    iPBan10.setExpires((java.lang.Long)1L);
    boolean b38 = strictlySortedSinglyLinkedList0.contains(iPBan10);
    tp2.IP iP43 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i44 = iP43.getSecond();
    iP43.setFirst((java.lang.Integer)11001000);
    java.lang.Long long47 = null;
    tp2.IPBan iPBan48 = new tp2.IPBan(iP43, long47);
    java.lang.Long long49 = iPBan48.getExpires();
    tp2.SinglyLinkedList singlyLinkedList50 = new tp2.SinglyLinkedList();
    boolean b51 = singlyLinkedList50.repOK();
    tp2.IP iP56 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP56.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan60 = new tp2.IPBan(iP56, (java.lang.Long)100L);
    tp2.IP iP65 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP65.setFirst((java.lang.Integer)200);
    java.lang.Integer i68 = iP65.getFourth();
    iPBan60.setIp(iP65);
    singlyLinkedList50.add(iP65);
    iPBan48.setIp(iP65);
    boolean b72 = strictlySortedSinglyLinkedList0.add(iPBan48);
    tp2.IP iP73 = iPBan48.getIp();
    java.lang.Integer i74 = null;
    iP73.setFirst(i74);
    iP73.setThird((java.lang.Integer)117440640);
    java.lang.Integer i78 = iP73.getSecond();
    iP73.setThird((java.lang.Integer)16777264);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i31 + "' != '" + 200+ "'", i31.equals(200));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i32 + "' != '" + 100+ "'", i32.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i44 + "' != '" + (-1)+ "'", i44.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(long49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b51 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i68 + "' != '" + 100+ "'", i68.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b72 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP73);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i78 + "' != '" + (-1)+ "'", i78.equals((-1)));

  }

}
