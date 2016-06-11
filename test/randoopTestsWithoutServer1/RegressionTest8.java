package randoopTestsWithoutServer1;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest8 {

  public static boolean debug = false;

  @Test
  public void test001() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test001"); }


    int i1 = java.lang.Integer.bitCount(1451229184);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 5);

  }

  @Test
  public void test002() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test002"); }


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
    boolean b96 = strictlySortedSinglyLinkedList0.isEmpty();
    
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
    org.junit.Assert.assertTrue(b96 == false);

  }

  @Test
  public void test003() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test003"); }


    int i2 = java.lang.Integer.min(469779399, 27962026);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 27962026);

  }

  @Test
  public void test004() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test004"); }


    int i1 = java.lang.Integer.signum(26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 1);

  }

  @Test
  public void test005() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test005"); }


    int i2 = java.lang.Integer.min(11001000, 5020);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 5020);

  }

  @Test
  public void test006() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test006"); }


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
    int i15 = singlyLinkedList0.getSize();
    tp2.IP iP20 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP20.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan24 = new tp2.IPBan(iP20, (java.lang.Long)100L);
    tp2.IP iP29 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iPBan24.setIp(iP29);
    iPBan24.setExpires((java.lang.Long)1L);
    tp2.IP iP33 = iPBan24.getIp();
    java.lang.Integer i34 = iP33.getThird();
    boolean b35 = singlyLinkedList0.remove(iP33);
    tp2.IP iP37 = singlyLinkedList0.get(0);
    int i38 = singlyLinkedList0.getSize();
    
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
    org.junit.Assert.assertTrue(i15 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i34 + "' != '" + (-1)+ "'", i34.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i38 == 1);

  }

  @Test
  public void test007() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test007"); }


    java.lang.Integer i1 = java.lang.Integer.valueOf(91);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 91+ "'", i1.equals(91));

  }

  @Test
  public void test008() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test008"); }


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
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList37 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b38 = strictlySortedSinglyLinkedList37.repOK();
    tp2.IP iP43 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i44 = iP43.getSecond();
    iP43.setFirst((java.lang.Integer)11001000);
    iP43.setFirst((java.lang.Integer)(-2147483648));
    boolean b49 = strictlySortedSinglyLinkedList37.removeFromIP(iP43);
    tp2.IPBan iPBan51 = strictlySortedSinglyLinkedList37.get((-1));
    boolean b52 = strictlySortedSinglyLinkedList37.repOK();
    tp2.IP iP57 = new tp2.IP((java.lang.Integer)242, (java.lang.Integer)242, (java.lang.Integer)30, (java.lang.Integer)(-1));
    iP57.setSecond((java.lang.Integer)16);
    java.lang.Integer i60 = iP57.getFourth();
    boolean b61 = strictlySortedSinglyLinkedList37.removeFromIP(iP57);
    tp2.IPBan iPBan63 = new tp2.IPBan(iP57, (java.lang.Long)5L);
    boolean b64 = singlyLinkedList0.contains(iP57);
    iP57.setThird((java.lang.Integer)89061696);
    java.lang.Integer i67 = iP57.getSecond();
    
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
    org.junit.Assert.assertTrue(b38 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i44 + "' != '" + (-1)+ "'", i44.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b49 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iPBan51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b52 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i60 + "' != '" + (-1)+ "'", i60.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b61 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b64 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i67 + "' != '" + 16+ "'", i67.equals(16));

  }

  @Test
  public void test009() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test009"); }


    int i2 = java.lang.Integer.divideUnsigned(59, (-1665138688));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);

  }

  @Test
  public void test010() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test010"); }


    int i2 = java.lang.Integer.compareUnsigned(56, 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);

  }

  @Test
  public void test011() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test011"); }


    int i1 = java.lang.Integer.reverse(1251865216);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 22002002);

  }

  @Test
  public void test012() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test012"); }


    int i2 = java.lang.Integer.remainderUnsigned(32987, (-1429838673));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 32987);

  }

  @Test
  public void test013() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test013"); }


    int i2 = java.lang.Integer.compare(1391589, 42382);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);

  }

  @Test
  public void test014() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test014"); }


    tp2.SinglyLinkedList singlyLinkedList0 = new tp2.SinglyLinkedList();
    boolean b1 = singlyLinkedList0.repOK();
    int i2 = singlyLinkedList0.getSize();
    boolean b3 = singlyLinkedList0.isEmpty();
    int i4 = singlyLinkedList0.getSize();
    tp2.SinglyLinkedList singlyLinkedList5 = new tp2.SinglyLinkedList();
    boolean b6 = singlyLinkedList5.repOK();
    tp2.IP iP8 = singlyLinkedList5.get(200);
    boolean b9 = singlyLinkedList5.isEmpty();
    tp2.IP iP14 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i15 = iP14.getThird();
    boolean b16 = singlyLinkedList5.remove(iP14);
    tp2.IP iP21 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP21.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan25 = new tp2.IPBan(iP21, (java.lang.Long)100L);
    tp2.IP iP26 = iPBan25.ip;
    tp2.IP iP27 = iPBan25.getIp();
    java.lang.Integer i28 = null;
    iP27.setFirst(i28);
    boolean b30 = singlyLinkedList5.contains(iP27);
    boolean b31 = singlyLinkedList0.remove(iP27);
    boolean b32 = singlyLinkedList0.repOK();
    tp2.SinglyLinkedList singlyLinkedList33 = new tp2.SinglyLinkedList();
    int i34 = singlyLinkedList33.getSize();
    int i35 = singlyLinkedList33.getSize();
    tp2.IP iP36 = null;
    boolean b37 = singlyLinkedList33.contains(iP36);
    tp2.IP iP39 = singlyLinkedList33.get(27);
    tp2.IP iP44 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP44.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan48 = new tp2.IPBan(iP44, (java.lang.Long)100L);
    tp2.IP iP49 = iPBan48.ip;
    tp2.IP iP54 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP54.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan58 = new tp2.IPBan(iP54, (java.lang.Long)100L);
    iPBan48.setIp(iP54);
    boolean b60 = singlyLinkedList33.remove(iP54);
    tp2.IP iP65 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP65.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan69 = new tp2.IPBan(iP65, (java.lang.Long)100L);
    tp2.IP iP70 = iPBan69.ip;
    tp2.SinglyLinkedList singlyLinkedList71 = new tp2.SinglyLinkedList();
    int i72 = singlyLinkedList71.getSize();
    tp2.IP iP77 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i78 = iP77.getSecond();
    java.lang.Integer i79 = iP77.getFourth();
    singlyLinkedList71.add(iP77);
    boolean b81 = iP70.equals((java.lang.Object)iP77);
    tp2.IPBan iPBan83 = new tp2.IPBan(iP77, (java.lang.Long)10L);
    boolean b84 = singlyLinkedList33.contains(iP77);
    java.lang.Integer i85 = iP77.getSecond();
    boolean b86 = singlyLinkedList0.contains(iP77);
    java.lang.Integer i87 = iP77.getFirst();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i15 + "' != '" + (-1)+ "'", i15.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i34 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i35 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b60 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP70);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i72 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i78 + "' != '" + (-1)+ "'", i78.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i79 + "' != '" + 100+ "'", i79.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b81 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b84 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i85 + "' != '" + (-1)+ "'", i85.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b86 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i87 + "' != '" + (-1)+ "'", i87.equals((-1)));

  }

  @Test
  public void test015() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test015"); }


    java.lang.String str1 = java.lang.Integer.toBinaryString(20971520);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "1010000000000000000000000"+ "'", str1.equals("1010000000000000000000000"));

  }

  @Test
  public void test016() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test016"); }


    java.lang.Integer i1 = java.lang.Integer.getInteger("207025415");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);

  }

  @Test
  public void test017() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test017"); }


    // The following exception was thrown during execution in test generation
    try {
      java.lang.Integer i2 = java.lang.Integer.valueOf("1", 744529281);
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

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test018"); }


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
    tp2.IP iP52 = singlyLinkedList0.get(14);
    tp2.IP iP57 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP57.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan61 = new tp2.IPBan(iP57, (java.lang.Long)100L);
    tp2.IP iP62 = iPBan61.ip;
    tp2.IP iP67 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP67.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan71 = new tp2.IPBan(iP67, (java.lang.Long)100L);
    iPBan61.setIp(iP67);
    tp2.IPBan iPBan74 = new tp2.IPBan(iP67, (java.lang.Long)(-1L));
    iP67.setFirst((java.lang.Integer)242);
    java.lang.Integer i77 = iP67.getSecond();
    tp2.IPBan iPBan79 = new tp2.IPBan(iP67, (java.lang.Long)100L);
    tp2.IP iP80 = iPBan79.ip;
    boolean b81 = singlyLinkedList0.contains(iP80);
    tp2.IP iP86 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i87 = iP86.getSecond();
    iP86.setFirst((java.lang.Integer)11001000);
    java.lang.Long long90 = null;
    tp2.IPBan iPBan91 = new tp2.IPBan(iP86, long90);
    tp2.IP iP92 = iPBan91.ip;
    tp2.IP iP93 = iPBan91.ip;
    tp2.IP iP94 = iPBan91.getIp();
    iP94.setThird((java.lang.Integer)2013265920);
    boolean b97 = singlyLinkedList0.remove(iP94);
    iP94.setFirst((java.lang.Integer)17);
    
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
    org.junit.Assert.assertNull(iP52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP62);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i77 + "' != '" + (-1)+ "'", i77.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP80);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b81 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i87 + "' != '" + (-1)+ "'", i87.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP92);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP93);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP94);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b97 == false);

  }

  @Test
  public void test019() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test019"); }


    int i1 = java.lang.Integer.lowestOneBit(184828115);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 1);

  }

  @Test
  public void test020() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test020"); }


    java.lang.Integer i1 = java.lang.Integer.getInteger("6670760000");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);

  }

  @Test
  public void test021() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test021"); }


    int i2 = java.lang.Integer.rotateLeft(3145730, 1594950735);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 65560);

  }

  @Test
  public void test022() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test022"); }


    tp2.IP iP4 = new tp2.IP((java.lang.Integer)16777440, (java.lang.Integer)2013265928, (java.lang.Integer)(-536870175), (java.lang.Integer)2060546218);

  }

  @Test
  public void test023() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test023"); }


    java.lang.String str1 = java.lang.Integer.toUnsignedString(170);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "170"+ "'", str1.equals("170"));

  }

  @Test
  public void test024() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test024"); }


    java.lang.String str2 = java.lang.Integer.toUnsignedString(3145730, 30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "3qf7k"+ "'", str2.equals("3qf7k"));

  }

  @Test
  public void test025() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test025"); }


    int i1 = java.lang.Integer.highestOneBit(206848);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 131072);

  }

  @Test
  public void test026() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test026"); }


    // The following exception was thrown during execution in test generation
    try {
      int i2 = java.lang.Integer.parseInt("", 100);
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test027() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test027"); }


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
    iP49.setThird((java.lang.Integer)1342181290);
    
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

  }

  @Test
  public void test028() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test028"); }


    int i2 = java.lang.Integer.min(29, 5020);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 29);

  }

  @Test
  public void test029() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test029"); }


    int i1 = java.lang.Integer.reverse(26476544);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 10624);

  }

  @Test
  public void test030() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test030"); }


    int i1 = java.lang.Integer.bitCount(224002);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 8);

  }

  @Test
  public void test031() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test031"); }


    java.lang.Integer i1 = java.lang.Integer.decode("212600");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 212600+ "'", i1.equals(212600));

  }

  @Test
  public void test032() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test032"); }


    // The following exception was thrown during execution in test generation
    try {
      java.lang.Integer i1 = java.lang.Integer.decode("11111000000000000000000000000000");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test033() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test033"); }


    int i2 = java.lang.Integer.rotateLeft(167755776, 88);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 655296);

  }

  @Test
  public void test034() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test034"); }


    int i1 = java.lang.Integer.lowestOneBit(570425344);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 33554432);

  }

  @Test
  public void test035() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test035"); }


    int i1 = java.lang.Integer.numberOfLeadingZeros(825);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 22);

  }

  @Test
  public void test036() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test036"); }


    int i2 = java.lang.Integer.compare((-939524096), 928);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == (-1));

  }

  @Test
  public void test037() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test037"); }


    tp2.SinglyLinkedList singlyLinkedList0 = new tp2.SinglyLinkedList();
    boolean b1 = singlyLinkedList0.repOK();
    tp2.IP iP3 = singlyLinkedList0.get(200);
    boolean b4 = singlyLinkedList0.isEmpty();
    boolean b5 = singlyLinkedList0.repOK();
    int i6 = singlyLinkedList0.getSize();
    tp2.SinglyLinkedList singlyLinkedList7 = new tp2.SinglyLinkedList();
    boolean b8 = singlyLinkedList7.repOK();
    tp2.IP iP10 = singlyLinkedList7.get(200);
    boolean b11 = singlyLinkedList7.isEmpty();
    boolean b12 = singlyLinkedList7.repOK();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList13 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b14 = strictlySortedSinglyLinkedList13.repOK();
    tp2.IP iP19 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i20 = iP19.getSecond();
    iP19.setFirst((java.lang.Integer)11001000);
    iP19.setFirst((java.lang.Integer)(-2147483648));
    boolean b25 = strictlySortedSinglyLinkedList13.removeFromIP(iP19);
    tp2.IPBan iPBan27 = new tp2.IPBan(iP19, (java.lang.Long)0L);
    tp2.IP iP32 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP32.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan36 = new tp2.IPBan(iP32, (java.lang.Long)100L);
    tp2.IP iP37 = iPBan36.ip;
    tp2.IP iP38 = iPBan36.getIp();
    java.lang.Integer i39 = null;
    iP38.setFirst(i39);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList41 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b42 = strictlySortedSinglyLinkedList41.repOK();
    tp2.IP iP47 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i48 = iP47.getSecond();
    iP47.setFirst((java.lang.Integer)11001000);
    iP47.setFirst((java.lang.Integer)(-2147483648));
    boolean b53 = strictlySortedSinglyLinkedList41.removeFromIP(iP47);
    boolean b54 = iP38.equals((java.lang.Object)strictlySortedSinglyLinkedList41);
    tp2.IP iP59 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP59.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan63 = new tp2.IPBan(iP59, (java.lang.Long)100L);
    boolean b64 = strictlySortedSinglyLinkedList41.removeFromIP(iP59);
    java.lang.Integer i65 = iP59.getFirst();
    iPBan27.setIp(iP59);
    singlyLinkedList7.add(iP59);
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
    boolean b89 = singlyLinkedList7.contains(iP83);
    singlyLinkedList0.add(iP83);
    tp2.IP iP92 = singlyLinkedList0.get((-402653184));
    tp2.IP iP94 = singlyLinkedList0.get(1610612738);
    
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
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i20 + "' != '" + (-1)+ "'", i20.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i48 + "' != '" + (-1)+ "'", i48.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b53 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b54 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b64 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i65 + "' != '" + 200+ "'", i65.equals(200));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b69 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i86 + "' != '" + 100+ "'", i86.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b89 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP92);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP94);

  }

  @Test
  public void test038() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test038"); }


    long long1 = java.lang.Integer.toUnsignedLong(83886555);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == 83886555L);

  }

  @Test
  public void test039() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test039"); }


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
    tp2.IP iP35 = iPBan8.getIp();
    tp2.SinglyLinkedList singlyLinkedList36 = new tp2.SinglyLinkedList();
    boolean b37 = singlyLinkedList36.repOK();
    tp2.IP iP42 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP42.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan46 = new tp2.IPBan(iP42, (java.lang.Long)100L);
    iP42.setFourth((java.lang.Integer)32);
    singlyLinkedList36.add(iP42);
    iPBan8.ip = iP42;
    iP42.setThird((java.lang.Integer)5244416);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i14 + "' != '" + (-1)+ "'", i14.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i15 + "' != '" + 100+ "'", i15.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long19 + "' != '" + 100L+ "'", long19.equals(100L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == true);

  }

  @Test
  public void test040() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test040"); }


    java.lang.Integer i1 = java.lang.Integer.getInteger("3758096387");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);

  }

  @Test
  public void test041() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test041"); }


    int i2 = java.lang.Integer.rotateLeft(7000000, (-1062740994));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1750000);

  }

  @Test
  public void test042() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test042"); }


    int i2 = java.lang.Integer.rotateLeft(805306369, 14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 19456);

  }

  @Test
  public void test043() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test043"); }


    java.lang.String str1 = java.lang.Integer.toBinaryString((-699399716));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "11010110010100000000000111011100"+ "'", str1.equals("11010110010100000000000111011100"));

  }

  @Test
  public void test044() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test044"); }


    int i2 = java.lang.Integer.max(0, 224002);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 224002);

  }

  @Test
  public void test045() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test045"); }


    java.lang.String str1 = java.lang.Integer.toHexString(26000010);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "18cba8a"+ "'", str1.equals("18cba8a"));

  }

  @Test
  public void test046() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test046"); }


    // The following exception was thrown during execution in test generation
    try {
      java.lang.Integer i1 = java.lang.Integer.decode("a58e");
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

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test047"); }


    int i2 = java.lang.Integer.compareUnsigned(289448, 262144);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);

  }

  @Test
  public void test048() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test048"); }


    tp2.IP iP4 = new tp2.IP((java.lang.Integer)533897138, (java.lang.Integer)541518507, (java.lang.Integer)(-1241513727), (java.lang.Integer)346729152);

  }

  @Test
  public void test049() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test049"); }


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
    tp2.IPBan iPBan41 = new tp2.IPBan(iP36, (java.lang.Long)100L);
    boolean b42 = singlyLinkedList0.remove(iP36);
    java.lang.Integer i43 = iP36.getFourth();
    iP36.setThird((java.lang.Integer)8388919);
    
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
    org.junit.Assert.assertTrue(b42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i43 + "' != '" + 100+ "'", i43.equals(100));

  }

  @Test
  public void test050() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test050"); }


    int i2 = java.lang.Integer.remainderUnsigned(89061696, 624000);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 453696);

  }

  @Test
  public void test051() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test051"); }


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
    boolean b43 = singlyLinkedList0.isEmpty();
    int i44 = singlyLinkedList0.getSize();
    
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
    org.junit.Assert.assertTrue(b43 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i44 == 0);

  }

  @Test
  public void test052() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test052"); }


    java.lang.String str1 = java.lang.Integer.toOctalString((-1610606592));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "24000014000"+ "'", str1.equals("24000014000"));

  }

  @Test
  public void test053() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test053"); }


    int i2 = java.lang.Integer.remainderUnsigned(3054, 5888);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 3054);

  }

  @Test
  public void test054() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test054"); }


    // The following exception was thrown during execution in test generation
    try {
      java.lang.Integer i1 = java.lang.Integer.valueOf("10101001110111110010100000011");
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

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test055"); }


    java.lang.Integer i1 = new java.lang.Integer((-1808013914));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + (-1808013914)+ "'", i1.equals((-1808013914)));

  }

  @Test
  public void test056() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test056"); }


    int i1 = java.lang.Integer.highestOneBit(6029312);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 4194304);

  }

  @Test
  public void test057() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test057"); }


    java.lang.Integer i2 = java.lang.Integer.getInteger("2600468487", (java.lang.Integer)920903680);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i2 + "' != '" + 920903680+ "'", i2.equals(920903680));

  }

  @Test
  public void test058() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test058"); }


    int i2 = java.lang.Integer.divideUnsigned(11, 358400000);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);

  }

  @Test
  public void test059() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test059"); }


    int i1 = java.lang.Integer.lowestOneBit(1677721600);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 67108864);

  }

  @Test
  public void test060() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test060"); }


    int i2 = java.lang.Integer.compareUnsigned(1073741869, 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);

  }

  @Test
  public void test061() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test061"); }


    int i2 = java.lang.Integer.min(45156032, 3801088);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 3801088);

  }

  @Test
  public void test062() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test062"); }


    java.lang.Integer i1 = java.lang.Integer.valueOf("20283569");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 20283569+ "'", i1.equals(20283569));

  }

  @Test
  public void test063() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test063"); }


    // The following exception was thrown during execution in test generation
    try {
      int i1 = java.lang.Integer.parseUnsignedInt("111000000000000000010000000");
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

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test064"); }


    // The following exception was thrown during execution in test generation
    try {
      int i2 = java.lang.Integer.parseUnsignedInt("101000111101011101", 65588);
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test065() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test065"); }


    int i1 = java.lang.Integer.parseUnsignedInt("32547700");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 32547700);

  }

  @Test
  public void test066() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test066"); }


    // The following exception was thrown during execution in test generation
    try {
      java.lang.Integer i2 = java.lang.Integer.valueOf("541065219", 20283569);
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test067() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test067"); }


    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList0 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b1 = strictlySortedSinglyLinkedList0.repOK();
    tp2.IP iP6 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    boolean b7 = strictlySortedSinglyLinkedList0.containsIP(iP6);
    tp2.IPBan iPBan9 = strictlySortedSinglyLinkedList0.get(160);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList10 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b11 = strictlySortedSinglyLinkedList10.repOK();
    strictlySortedSinglyLinkedList10.size = 1;
    boolean b14 = strictlySortedSinglyLinkedList10.isEmpty();
    int i15 = strictlySortedSinglyLinkedList10.getSize();
    int i16 = strictlySortedSinglyLinkedList10.getSize();
    tp2.IP iP21 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP21.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan25 = new tp2.IPBan(iP21, (java.lang.Long)100L);
    tp2.IP iP30 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP30.setFirst((java.lang.Integer)200);
    java.lang.Integer i33 = iP30.getFourth();
    iPBan25.setIp(iP30);
    java.lang.Long long35 = iPBan25.expires;
    tp2.IP iP40 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i41 = iP40.getSecond();
    iP40.setFirst((java.lang.Integer)11001000);
    iP40.setFirst((java.lang.Integer)32);
    iPBan25.setIp(iP40);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList47 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b48 = strictlySortedSinglyLinkedList47.repOK();
    tp2.IP iP53 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i54 = iP53.getSecond();
    iP53.setFirst((java.lang.Integer)11001000);
    iP53.setFirst((java.lang.Integer)(-2147483648));
    boolean b59 = strictlySortedSinglyLinkedList47.removeFromIP(iP53);
    tp2.IPBan iPBan61 = new tp2.IPBan(iP53, (java.lang.Long)0L);
    tp2.IP iP62 = iPBan61.getIp();
    iPBan25.ip = iP62;
    boolean b64 = strictlySortedSinglyLinkedList10.add(iPBan25);
    boolean b65 = strictlySortedSinglyLinkedList0.contains(iPBan25);
    tp2.IP iP66 = iPBan25.getIp();
    tp2.SinglyLinkedList singlyLinkedList67 = new tp2.SinglyLinkedList();
    boolean b68 = singlyLinkedList67.repOK();
    tp2.IP iP70 = singlyLinkedList67.get(200);
    boolean b71 = singlyLinkedList67.isEmpty();
    boolean b72 = singlyLinkedList67.repOK();
    boolean b73 = singlyLinkedList67.repOK();
    tp2.SinglyLinkedList singlyLinkedList74 = new tp2.SinglyLinkedList();
    int i75 = singlyLinkedList74.getSize();
    tp2.IP iP80 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i81 = iP80.getSecond();
    iP80.setFirst((java.lang.Integer)11001000);
    iP80.setFirst((java.lang.Integer)32);
    boolean b86 = singlyLinkedList74.remove(iP80);
    boolean b87 = singlyLinkedList67.remove(iP80);
    iPBan25.ip = iP80;
    iP80.setFourth((java.lang.Integer)12);
    java.lang.Integer i91 = iP80.getThird();
    java.lang.Integer i92 = iP80.getSecond();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iPBan9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i33 + "' != '" + 100+ "'", i33.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long35 + "' != '" + 100L+ "'", long35.equals(100L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i41 + "' != '" + (-1)+ "'", i41.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b48 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i54 + "' != '" + (-1)+ "'", i54.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b59 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP62);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b64 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b65 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP66);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b68 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP70);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b71 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b72 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b73 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i75 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i81 + "' != '" + (-1)+ "'", i81.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b86 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b87 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i91 + "' != '" + (-1)+ "'", i91.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i92 + "' != '" + (-1)+ "'", i92.equals((-1)));

  }

  @Test
  public void test068() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test068"); }


    int i2 = java.lang.Integer.compareUnsigned(3276800, 1010000);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);

  }

  @Test
  public void test069() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test069"); }


    int i2 = java.lang.Integer.rotateRight(536870941, 7000000);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 536870941);

  }

  @Test
  public void test070() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test070"); }


    // The following exception was thrown during execution in test generation
    try {
      java.lang.Integer i2 = java.lang.Integer.valueOf("1140850691", 486539264);
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test071() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test071"); }


    int i2 = java.lang.Integer.divideUnsigned(11, 217056);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);

  }

  @Test
  public void test072() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test072"); }


    java.lang.Integer i2 = java.lang.Integer.getInteger("55681743", 13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i2 + "' != '" + 13+ "'", i2.equals(13));

  }

  @Test
  public void test073() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test073"); }


    // The following exception was thrown during execution in test generation
    try {
      java.lang.Integer i1 = new java.lang.Integer("100000000000000000");
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

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test074"); }


    // The following exception was thrown during execution in test generation
    try {
      int i1 = java.lang.Integer.parseInt("10011011000000000000000000000111");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test075() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test075"); }


    int i2 = java.lang.Integer.remainderUnsigned(54086648, 1677721600);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 54086648);

  }

  @Test
  public void test076() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test076"); }


    java.lang.Integer i2 = java.lang.Integer.getInteger("5000000000", (-1610320004));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i2 + "' != '" + (-1610320004)+ "'", i2.equals((-1610320004)));

  }

  @Test
  public void test077() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test077"); }


    java.lang.Integer i1 = java.lang.Integer.getInteger("100101001001100000000010100000");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);

  }

  @Test
  public void test078() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test078"); }


    java.lang.Integer i1 = java.lang.Integer.decode("3925251");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 3925251+ "'", i1.equals(3925251));

  }

  @Test
  public void test079() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test079"); }


    // The following exception was thrown during execution in test generation
    try {
      int i2 = java.lang.Integer.parseInt("825", 0);
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

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test080"); }


    java.lang.Integer i2 = java.lang.Integer.getInteger("1140850688", (-1879048124));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i2 + "' != '" + (-1879048124)+ "'", i2.equals((-1879048124)));

  }

  @Test
  public void test081() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test081"); }


    java.lang.String str2 = java.lang.Integer.toUnsignedString(200, 46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "200"+ "'", str2.equals("200"));

  }

  @Test
  public void test082() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test082"); }


    // The following exception was thrown during execution in test generation
    try {
      int i2 = java.lang.Integer.parseInt("", 2013265928);
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

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test083"); }


    java.lang.Integer i1 = java.lang.Integer.valueOf(1308183544);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 1308183544+ "'", i1.equals(1308183544));

  }

  @Test
  public void test084() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test084"); }


    int i2 = java.lang.Integer.divideUnsigned(117440667, 286637532);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);

  }

  @Test
  public void test085() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test085"); }


    int i1 = java.lang.Integer.lowestOneBit(920903680);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 8192);

  }

  @Test
  public void test086() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test086"); }


    int i2 = java.lang.Integer.min(262144, 512);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 512);

  }

  @Test
  public void test087() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test087"); }


    java.lang.String str1 = java.lang.Integer.toUnsignedString(65000000);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "65000000"+ "'", str1.equals("65000000"));

  }

  @Test
  public void test088() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test088"); }


    // The following exception was thrown during execution in test generation
    try {
      int i2 = java.lang.Integer.parseInt("5e", (-811446013));
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

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test089"); }


    // The following exception was thrown during execution in test generation
    try {
      int i2 = java.lang.Integer.parseUnsignedInt("2420e50", 524420645);
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test090() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test090"); }


    int i2 = java.lang.Integer.divideUnsigned(805306496, 1110);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 725501);

  }

  @Test
  public void test091() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test091"); }


    int i2 = java.lang.Integer.sum(21443883, 72310545);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 93754428);

  }

  @Test
  public void test092() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test092"); }


    java.lang.String str1 = java.lang.Integer.toHexString(217056);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "34fe0"+ "'", str1.equals("34fe0"));

  }

  @Test
  public void test093() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test093"); }


    java.lang.String str1 = java.lang.Integer.toBinaryString(662700032);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "100111100000000000000000000000"+ "'", str1.equals("100111100000000000000000000000"));

  }

  @Test
  public void test094() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test094"); }


    java.lang.String str2 = java.lang.Integer.toUnsignedString(524420645, 5382);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "524420645"+ "'", str2.equals("524420645"));

  }

  @Test
  public void test095() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test095"); }


    int i1 = java.lang.Integer.numberOfLeadingZeros((-1062740992));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);

  }

  @Test
  public void test096() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test096"); }


    // The following exception was thrown during execution in test generation
    try {
      int i2 = java.lang.Integer.parseInt("111001000000110000000000000000", (-1073741817));
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

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test097"); }


    java.lang.Integer i2 = java.lang.Integer.getInteger("200", 44004000);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i2 + "' != '" + 44004000+ "'", i2.equals(44004000));

  }

  @Test
  public void test098() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test098"); }


    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList0 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IPBan iPBan1 = null;
    boolean b2 = strictlySortedSinglyLinkedList0.add(iPBan1);
    int i3 = strictlySortedSinglyLinkedList0.getSize();
    tp2.Node node4 = strictlySortedSinglyLinkedList0.header;
    strictlySortedSinglyLinkedList0.size = (-2147483648);
    boolean b7 = strictlySortedSinglyLinkedList0.repOK();
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
    tp2.IPBan iPBan36 = strictlySortedSinglyLinkedList9.get(51756250);
    tp2.IP iP41 = new tp2.IP((java.lang.Integer)160, (java.lang.Integer)1, (java.lang.Integer)27, (java.lang.Integer)(-2));
    java.lang.Integer i42 = iP41.getFourth();
    tp2.IPBan iPBan44 = new tp2.IPBan(iP41, (java.lang.Long)0L);
    boolean b45 = strictlySortedSinglyLinkedList9.add(iPBan44);
    // The following exception was thrown during execution in test generation
    try {
      boolean b46 = strictlySortedSinglyLinkedList0.contains(iPBan44);
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
    org.junit.Assert.assertNull(iPBan36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i42 + "' != '" + (-2)+ "'", i42.equals((-2)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == true);

  }

  @Test
  public void test099() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test099"); }


    int i2 = java.lang.Integer.sum(2127069002, 30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 2127069032);

  }

  @Test
  public void test100() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test100"); }


    int i1 = java.lang.Integer.highestOneBit(1010);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 512);

  }

  @Test
  public void test101() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test101"); }


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
    tp2.SinglyLinkedList singlyLinkedList29 = new tp2.SinglyLinkedList();
    int i30 = singlyLinkedList29.getSize();
    tp2.IP iP35 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i36 = iP35.getSecond();
    java.lang.Integer i37 = iP35.getFourth();
    singlyLinkedList29.add(iP35);
    tp2.IPBan iPBan40 = new tp2.IPBan(iP35, (java.lang.Long)1L);
    java.lang.Integer i41 = iP35.getThird();
    iP35.setFourth((java.lang.Integer)160);
    java.lang.Integer i44 = iP35.getSecond();
    singlyLinkedList0.add(iP35);
    java.lang.Integer i46 = null;
    iP35.setFirst(i46);
    java.lang.Integer i48 = iP35.getSecond();
    
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
    org.junit.Assert.assertTrue(i30 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i36 + "' != '" + (-1)+ "'", i36.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i37 + "' != '" + 100+ "'", i37.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i41 + "' != '" + (-1)+ "'", i41.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i44 + "' != '" + (-1)+ "'", i44.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i48 + "' != '" + (-1)+ "'", i48.equals((-1)));

  }

  @Test
  public void test102() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test102"); }


    int i1 = java.lang.Integer.numberOfLeadingZeros(16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 27);

  }

  @Test
  public void test103() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test103"); }


    int i2 = java.lang.Integer.min(65536, 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);

  }

  @Test
  public void test104() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test104"); }


    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList0 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b1 = strictlySortedSinglyLinkedList0.repOK();
    tp2.IP iP6 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i7 = iP6.getSecond();
    iP6.setFirst((java.lang.Integer)11001000);
    iP6.setFirst((java.lang.Integer)(-2147483648));
    boolean b12 = strictlySortedSinglyLinkedList0.removeFromIP(iP6);
    tp2.IPBan iPBan13 = null;
    boolean b14 = strictlySortedSinglyLinkedList0.add(iPBan13);
    int i15 = strictlySortedSinglyLinkedList0.getSize();
    tp2.Node node16 = strictlySortedSinglyLinkedList0.header;
    tp2.IP iP21 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP21.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan25 = new tp2.IPBan(iP21, (java.lang.Long)100L);
    tp2.IP iP26 = iPBan25.ip;
    tp2.IP iP27 = iPBan25.ip;
    tp2.IP iP28 = iPBan25.getIp();
    tp2.IP iP29 = iPBan25.ip;
    // The following exception was thrown during execution in test generation
    try {
      boolean b30 = strictlySortedSinglyLinkedList0.add(iPBan25);
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
    org.junit.Assert.assertTrue(i15 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP29);

  }

  @Test
  public void test105() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test105"); }


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
    iPBan13.expires = 167772160L;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i7 + "' != '" + (-1)+ "'", i7.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i8 + "' != '" + 100+ "'", i8.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP20);

  }

  @Test
  public void test106() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test106"); }


    int i1 = java.lang.Integer.numberOfLeadingZeros(1048576);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 11);

  }

  @Test
  public void test107() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test107"); }


    int i2 = java.lang.Integer.min(65000000, 2060546218);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 65000000);

  }

  @Test
  public void test108() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test108"); }


    tp2.IP iP4 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i5 = iP4.getSecond();
    iP4.setFirst((java.lang.Integer)11001000);
    java.lang.Integer i8 = iP4.getFourth();
    java.lang.Integer i9 = iP4.getThird();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i5 + "' != '" + (-1)+ "'", i5.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i8 + "' != '" + 100+ "'", i8.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + (-1)+ "'", i9.equals((-1)));

  }

  @Test
  public void test109() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test109"); }


    // The following exception was thrown during execution in test generation
    try {
      java.lang.Integer i2 = java.lang.Integer.valueOf("", 8389282);
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test110() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test110"); }


    java.lang.Integer i2 = java.lang.Integer.getInteger("110100111111100000", 318767115);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i2 + "' != '" + 318767115+ "'", i2.equals(318767115));

  }

  @Test
  public void test111() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test111"); }


    int i2 = java.lang.Integer.rotateRight(6, 57347);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == (-1073741824));

  }

  @Test
  public void test112() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test112"); }


    java.lang.Integer i2 = java.lang.Integer.getInteger("65536", 167801);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i2 + "' != '" + 167801+ "'", i2.equals(167801));

  }

  @Test
  public void test113() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test113"); }


    tp2.SinglyLinkedList singlyLinkedList0 = new tp2.SinglyLinkedList();
    boolean b1 = singlyLinkedList0.repOK();
    tp2.IP iP3 = singlyLinkedList0.get(200);
    boolean b4 = singlyLinkedList0.isEmpty();
    boolean b5 = singlyLinkedList0.repOK();
    tp2.IP iP7 = singlyLinkedList0.get(2013265928);
    boolean b8 = singlyLinkedList0.isEmpty();
    tp2.IP iP9 = null;
    // The following exception was thrown during execution in test generation
    try {
      singlyLinkedList0.add(iP9);
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
    org.junit.Assert.assertNull(iP3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);

  }

  @Test
  public void test114() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test114"); }


    // The following exception was thrown during execution in test generation
    try {
      int i2 = java.lang.Integer.parseInt("80290000", 101);
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

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test115"); }


    java.lang.String str1 = java.lang.Integer.toHexString((-2013265920));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "88000000"+ "'", str1.equals("88000000"));

  }

  @Test
  public void test116() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test116"); }


    java.lang.String str1 = java.lang.Integer.toHexString(13416038);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "ccb666"+ "'", str1.equals("ccb666"));

  }

  @Test
  public void test117() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test117"); }


    // The following exception was thrown during execution in test generation
    try {
      java.lang.Integer i1 = java.lang.Integer.decode("101010101110011000000");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test118() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test118"); }


    java.lang.String str1 = java.lang.Integer.toBinaryString(1024);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "10000000000"+ "'", str1.equals("10000000000"));

  }

  @Test
  public void test119() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test119"); }


    java.lang.String str2 = java.lang.Integer.toUnsignedString(1392382846, 1251865216);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1392382846"+ "'", str2.equals("1392382846"));

  }

  @Test
  public void test120() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test120"); }


    int i2 = java.lang.Integer.rotateLeft(32987, 167801);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == (-1241513727));

  }

  @Test
  public void test121() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test121"); }


    int i2 = java.lang.Integer.max(8, 524420645);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 524420645);

  }

  @Test
  public void test122() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test122"); }


    java.lang.Integer i1 = new java.lang.Integer("6331777");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 6331777+ "'", i1.equals(6331777));

  }

  @Test
  public void test123() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test123"); }


    int i1 = java.lang.Integer.reverse(335561509);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == (-1530789848));

  }

  @Test
  public void test124() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test124"); }


    java.lang.String str2 = java.lang.Integer.toUnsignedString(8389282, 289448);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "8389282"+ "'", str2.equals("8389282"));

  }

  @Test
  public void test125() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test125"); }


    int i1 = java.lang.Integer.reverseBytes(130);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == (-2113929216));

  }

  @Test
  public void test126() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test126"); }


    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList0 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b1 = strictlySortedSinglyLinkedList0.repOK();
    strictlySortedSinglyLinkedList0.size = 1;
    strictlySortedSinglyLinkedList0.size = 0;
    int i6 = strictlySortedSinglyLinkedList0.size;
    tp2.IP iP11 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP11.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan15 = new tp2.IPBan(iP11, (java.lang.Long)100L);
    tp2.IP iP20 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP20.setFirst((java.lang.Integer)200);
    java.lang.Integer i23 = iP20.getFourth();
    iPBan15.setIp(iP20);
    iPBan15.setExpires((java.lang.Long)2147483648L);
    tp2.IP iP31 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP31.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan35 = new tp2.IPBan(iP31, (java.lang.Long)100L);
    tp2.IP iP36 = iPBan35.ip;
    tp2.IP iP41 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP41.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan45 = new tp2.IPBan(iP41, (java.lang.Long)100L);
    iPBan35.setIp(iP41);
    java.lang.Long long47 = iPBan35.getExpires();
    tp2.IP iP48 = iPBan35.ip;
    iP48.setThird((java.lang.Integer)0);
    iPBan15.ip = iP48;
    java.lang.Long long52 = iPBan15.expires;
    boolean b53 = strictlySortedSinglyLinkedList0.contains(iPBan15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i23 + "' != '" + 100+ "'", i23.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long47 + "' != '" + 100L+ "'", long47.equals(100L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long52 + "' != '" + 2147483648L+ "'", long52.equals(2147483648L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b53 == false);

  }

  @Test
  public void test127() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test127"); }


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
    iP11.setSecond((java.lang.Integer)34);
    
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

  }

  @Test
  public void test128() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test128"); }


    long long1 = java.lang.Integer.toUnsignedLong((-1073741790));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == 3221225506L);

  }

  @Test
  public void test129() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test129"); }


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
  public void test130() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test130"); }


    int i1 = java.lang.Integer.bitCount(2060546218);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 16);

  }

  @Test
  public void test131() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test131"); }


    int i2 = java.lang.Integer.min((-402653184), 2088174752);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == (-402653184));

  }

  @Test
  public void test132() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test132"); }


    int i1 = java.lang.Integer.highestOneBit(731651);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 524288);

  }

  @Test
  public void test133() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test133"); }


    java.lang.Integer i1 = new java.lang.Integer(45156032);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 45156032+ "'", i1.equals(45156032));

  }

  @Test
  public void test134() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test134"); }


    int i2 = java.lang.Integer.compareUnsigned(100663296, 75809);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);

  }

  @Test
  public void test135() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test135"); }


    int i2 = java.lang.Integer.rotateRight(4096, 184828115);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 33554432);

  }

  @Test
  public void test136() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test136"); }


    int i2 = java.lang.Integer.compare(553648146, 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);

  }

  @Test
  public void test137() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test137"); }


    int i2 = java.lang.Integer.compare(624000, 536870912);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == (-1));

  }

  @Test
  public void test138() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test138"); }


    int i2 = java.lang.Integer.max(1270177888, 51756279);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1270177888);

  }

  @Test
  public void test139() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test139"); }


    tp2.SinglyLinkedList singlyLinkedList0 = new tp2.SinglyLinkedList();
    boolean b1 = singlyLinkedList0.repOK();
    int i2 = singlyLinkedList0.getSize();
    boolean b3 = singlyLinkedList0.isEmpty();
    tp2.IP iP5 = singlyLinkedList0.get(2088174752);
    boolean b6 = singlyLinkedList0.isEmpty();
    tp2.SinglyLinkedList singlyLinkedList7 = new tp2.SinglyLinkedList();
    boolean b8 = singlyLinkedList7.repOK();
    tp2.IP iP10 = singlyLinkedList7.get(200);
    boolean b11 = singlyLinkedList7.isEmpty();
    boolean b12 = singlyLinkedList7.repOK();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList13 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b14 = strictlySortedSinglyLinkedList13.repOK();
    tp2.IP iP19 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i20 = iP19.getSecond();
    iP19.setFirst((java.lang.Integer)11001000);
    iP19.setFirst((java.lang.Integer)(-2147483648));
    boolean b25 = strictlySortedSinglyLinkedList13.removeFromIP(iP19);
    tp2.IPBan iPBan27 = new tp2.IPBan(iP19, (java.lang.Long)0L);
    tp2.IP iP32 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP32.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan36 = new tp2.IPBan(iP32, (java.lang.Long)100L);
    tp2.IP iP37 = iPBan36.ip;
    tp2.IP iP38 = iPBan36.getIp();
    java.lang.Integer i39 = null;
    iP38.setFirst(i39);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList41 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b42 = strictlySortedSinglyLinkedList41.repOK();
    tp2.IP iP47 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i48 = iP47.getSecond();
    iP47.setFirst((java.lang.Integer)11001000);
    iP47.setFirst((java.lang.Integer)(-2147483648));
    boolean b53 = strictlySortedSinglyLinkedList41.removeFromIP(iP47);
    boolean b54 = iP38.equals((java.lang.Object)strictlySortedSinglyLinkedList41);
    tp2.IP iP59 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP59.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan63 = new tp2.IPBan(iP59, (java.lang.Long)100L);
    boolean b64 = strictlySortedSinglyLinkedList41.removeFromIP(iP59);
    java.lang.Integer i65 = iP59.getFirst();
    iPBan27.setIp(iP59);
    singlyLinkedList7.add(iP59);
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
    java.lang.Object obj96 = null;
    boolean b97 = iP89.equals(obj96);
    boolean b98 = singlyLinkedList7.contains(iP89);
    singlyLinkedList0.add(iP89);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i20 + "' != '" + (-1)+ "'", i20.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i48 + "' != '" + (-1)+ "'", i48.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b53 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b54 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b64 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i65 + "' != '" + 200+ "'", i65.equals(200));
    
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
    org.junit.Assert.assertTrue(b97 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b98 == false);

  }

  @Test
  public void test140() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test140"); }


    int i2 = java.lang.Integer.sum(35, 623247520);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 623247555);

  }

  @Test
  public void test141() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test141"); }


    java.lang.String str1 = java.lang.Integer.toUnsignedString((-1000079616));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "3294887680"+ "'", str1.equals("3294887680"));

  }

  @Test
  public void test142() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test142"); }


    int i2 = java.lang.Integer.compare(1010000, 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);

  }

  @Test
  public void test143() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test143"); }


    tp2.IP iP4 = new tp2.IP((java.lang.Integer)15204352, (java.lang.Integer)1, (java.lang.Integer)15204352, (java.lang.Integer)356246787);
    tp2.SinglyLinkedList singlyLinkedList5 = new tp2.SinglyLinkedList();
    int i6 = singlyLinkedList5.getSize();
    int i7 = singlyLinkedList5.getSize();
    boolean b8 = iP4.equals((java.lang.Object)singlyLinkedList5);
    tp2.IP iP13 = new tp2.IP((java.lang.Integer)5, (java.lang.Integer)10, (java.lang.Integer)31, (java.lang.Integer)32);
    java.lang.Object obj14 = null;
    boolean b15 = iP13.equals(obj14);
    tp2.IP iP20 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP20.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan24 = new tp2.IPBan(iP20, (java.lang.Long)100L);
    tp2.IP iP25 = iPBan24.ip;
    tp2.SinglyLinkedList singlyLinkedList26 = new tp2.SinglyLinkedList();
    int i27 = singlyLinkedList26.getSize();
    tp2.IP iP32 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i33 = iP32.getSecond();
    java.lang.Integer i34 = iP32.getFourth();
    singlyLinkedList26.add(iP32);
    boolean b36 = iP25.equals((java.lang.Object)iP32);
    boolean b37 = iP13.equals((java.lang.Object)iP32);
    singlyLinkedList5.add(iP32);
    java.lang.Integer i39 = iP32.getThird();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i33 + "' != '" + (-1)+ "'", i33.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i34 + "' != '" + 100+ "'", i34.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i39 + "' != '" + (-1)+ "'", i39.equals((-1)));

  }

  @Test
  public void test144() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test144"); }


    int i2 = java.lang.Integer.compare(13631488, 167772160);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == (-1));

  }

  @Test
  public void test145() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test145"); }


    int i1 = java.lang.Integer.numberOfLeadingZeros((-134217728));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);

  }

  @Test
  public void test146() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test146"); }


    java.lang.String str2 = java.lang.Integer.toUnsignedString(51756279, 402653440);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "51756279"+ "'", str2.equals("51756279"));

  }

  @Test
  public void test147() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test147"); }


    java.lang.String str2 = java.lang.Integer.toUnsignedString(278528, 90);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "278528"+ "'", str2.equals("278528"));

  }

  @Test
  public void test148() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test148"); }


    // The following exception was thrown during execution in test generation
    try {
      int i2 = java.lang.Integer.parseInt("100000000000000000", 475);
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

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test149"); }


    int i2 = java.lang.Integer.remainderUnsigned(1308183544, (-1006632260));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1308183544);

  }

  @Test
  public void test150() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test150"); }


    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList0 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IPBan iPBan1 = null;
    boolean b2 = strictlySortedSinglyLinkedList0.add(iPBan1);
    int i3 = strictlySortedSinglyLinkedList0.getSize();
    int i4 = strictlySortedSinglyLinkedList0.size;
    tp2.Node node5 = strictlySortedSinglyLinkedList0.header;
    tp2.IP iP10 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP10.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan14 = new tp2.IPBan(iP10, (java.lang.Long)100L);
    tp2.IP iP19 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP19.setFirst((java.lang.Integer)200);
    java.lang.Integer i22 = iP19.getFourth();
    iPBan14.setIp(iP19);
    iPBan14.setExpires((java.lang.Long)2147483648L);
    tp2.IP iP26 = iPBan14.getIp();
    // The following exception was thrown during execution in test generation
    try {
      boolean b27 = strictlySortedSinglyLinkedList0.removeFromIP(iP26);
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
    org.junit.Assert.assertNotNull(node5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i22 + "' != '" + 100+ "'", i22.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP26);

  }

  @Test
  public void test151() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test151"); }


    int i1 = java.lang.Integer.signum(805344258);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 1);

  }

  @Test
  public void test152() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test152"); }


    int i1 = java.lang.Integer.bitCount(640);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 2);

  }

  @Test
  public void test153() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test153"); }


    // The following exception was thrown during execution in test generation
    try {
      java.lang.Integer i1 = java.lang.Integer.valueOf("3294887680");
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

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test154"); }


    java.lang.Integer i1 = java.lang.Integer.getInteger("2174574636");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);

  }

  @Test
  public void test155() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test155"); }


    java.lang.String str1 = java.lang.Integer.toBinaryString(109052946);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "110100000000000010000010010"+ "'", str1.equals("110100000000000010000010010"));

  }

  @Test
  public void test156() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test156"); }


    // The following exception was thrown during execution in test generation
    try {
      int i2 = java.lang.Integer.parseUnsignedInt("10010", (-1665138688));
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test157() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test157"); }


    java.lang.String str1 = java.lang.Integer.toBinaryString(96468992);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "101110000000000000000000000"+ "'", str1.equals("101110000000000000000000000"));

  }

  @Test
  public void test158() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test158"); }


    java.lang.Integer i1 = java.lang.Integer.getInteger("5220000");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);

  }

  @Test
  public void test159() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test159"); }


    // The following exception was thrown during execution in test generation
    try {
      java.lang.Integer i2 = java.lang.Integer.valueOf("371235425", 2127069002);
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test160() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test160"); }


    tp2.IP iP4 = new tp2.IP((java.lang.Integer)3925251, (java.lang.Integer)31, (java.lang.Integer)29, (java.lang.Integer)163840);
    java.lang.Integer i5 = iP4.getThird();
    iP4.setFourth((java.lang.Integer)10485760);
    iP4.setSecond((java.lang.Integer)805344258);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i5 + "' != '" + 29+ "'", i5.equals(29));

  }

  @Test
  public void test161() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test161"); }


    int i1 = java.lang.Integer.reverseBytes(3276800);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 12800);

  }

  @Test
  public void test162() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test162"); }


    int i1 = java.lang.Integer.numberOfLeadingZeros(4194356);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 9);

  }

  @Test
  public void test163() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test163"); }


    java.lang.Integer i2 = java.lang.Integer.getInteger("110000001", 2060546218);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i2 + "' != '" + 2060546218+ "'", i2.equals(2060546218));

  }

  @Test
  public void test164() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test164"); }


    // The following exception was thrown during execution in test generation
    try {
      java.lang.Integer i2 = java.lang.Integer.valueOf("81", 144);
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test165() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test165"); }


    java.lang.Integer i2 = java.lang.Integer.getInteger("1010101010101010011010100000001", 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i2 + "' != '" + 0+ "'", i2.equals(0));

  }

  @Test
  public void test166() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test166"); }


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
    tp2.SinglyLinkedList singlyLinkedList14 = new tp2.SinglyLinkedList();
    int i15 = singlyLinkedList14.getSize();
    tp2.IP iP20 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i21 = iP20.getSecond();
    java.lang.Integer i22 = iP20.getFourth();
    singlyLinkedList14.add(iP20);
    tp2.IPBan iPBan25 = new tp2.IPBan(iP20, (java.lang.Long)100L);
    java.lang.Long long26 = null;
    tp2.IPBan iPBan27 = new tp2.IPBan(iP20, long26);
    iP20.setFourth((java.lang.Integer)10);
    java.lang.Integer i30 = null;
    iP20.setThird(i30);
    boolean b32 = singlyLinkedList0.contains(iP20);
    
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
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i21 + "' != '" + (-1)+ "'", i21.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i22 + "' != '" + 100+ "'", i22.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);

  }

  @Test
  public void test167() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test167"); }


    java.lang.String str1 = java.lang.Integer.toBinaryString(469779399);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "11100000000000100001111000111"+ "'", str1.equals("11100000000000100001111000111"));

  }

  @Test
  public void test168() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test168"); }


    int i1 = java.lang.Integer.numberOfLeadingZeros(21443883);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 7);

  }

  @Test
  public void test169() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test169"); }


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
    boolean b12 = strictlySortedSinglyLinkedList10.repOK();
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
    boolean b51 = strictlySortedSinglyLinkedList10.add(iPBan39);
    tp2.SinglyLinkedList singlyLinkedList52 = new tp2.SinglyLinkedList();
    int i53 = singlyLinkedList52.getSize();
    tp2.IP iP58 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i59 = iP58.getSecond();
    java.lang.Integer i60 = iP58.getFourth();
    singlyLinkedList52.add(iP58);
    tp2.IPBan iPBan63 = new tp2.IPBan(iP58, (java.lang.Long)1L);
    tp2.IPBan iPBan65 = new tp2.IPBan(iP58, (java.lang.Long)100L);
    java.lang.Long long66 = iPBan65.getExpires();
    boolean b67 = strictlySortedSinglyLinkedList10.add(iPBan65);
    iPBan65.expires = 5L;
    boolean b70 = strictlySortedSinglyLinkedList0.contains(iPBan65);
    
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
    org.junit.Assert.assertTrue(b12 == true);
    
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
    org.junit.Assert.assertTrue(b51 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i53 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i59 + "' != '" + (-1)+ "'", i59.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i60 + "' != '" + 100+ "'", i60.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long66 + "' != '" + 100L+ "'", long66.equals(100L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b67 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b70 == false);

  }

  @Test
  public void test170() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test170"); }


    tp2.IP iP4 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP4.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan8 = new tp2.IPBan(iP4, (java.lang.Long)100L);
    tp2.IP iP13 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iPBan8.setIp(iP13);
    iPBan8.setExpires((java.lang.Long)1L);
    tp2.IP iP17 = iPBan8.getIp();
    iPBan8.setExpires((java.lang.Long)2147483655L);
    iPBan8.expires = 7L;
    tp2.IP iP22 = iPBan8.getIp();
    iPBan8.setExpires((java.lang.Long)27L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP22);

  }

  @Test
  public void test171() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test171"); }


    int i2 = java.lang.Integer.compareUnsigned(163840, 111);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);

  }

  @Test
  public void test172() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test172"); }


    java.lang.Integer i1 = java.lang.Integer.getInteger("4600000000");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);

  }

  @Test
  public void test173() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test173"); }


    // The following exception was thrown during execution in test generation
    try {
      int i2 = java.lang.Integer.parseUnsignedInt("40001242", 1572869);
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test174() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test174"); }


    int i1 = java.lang.Integer.bitCount((-1879048124));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 4);

  }

  @Test
  public void test175() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test175"); }


    java.lang.Integer i2 = java.lang.Integer.getInteger("541065219", 160);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i2 + "' != '" + 160+ "'", i2.equals(160));

  }

  @Test
  public void test176() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test176"); }


    int i1 = java.lang.Integer.highestOneBit(112130);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 65536);

  }

  @Test
  public void test177() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test177"); }


    int i1 = java.lang.Integer.bitCount(16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 1);

  }

  @Test
  public void test178() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test178"); }


    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList0 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b1 = strictlySortedSinglyLinkedList0.repOK();
    tp2.IP iP6 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    boolean b7 = strictlySortedSinglyLinkedList0.containsIP(iP6);
    int i8 = strictlySortedSinglyLinkedList0.getSize();
    int i9 = strictlySortedSinglyLinkedList0.size;
    strictlySortedSinglyLinkedList0.size = (-2120392660);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);

  }

  @Test
  public void test179() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test179"); }


    int i1 = java.lang.Integer.reverse(6047546);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 1558329856);

  }

  @Test
  public void test180() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test180"); }


    int i2 = java.lang.Integer.remainderUnsigned(96468992, 207025415);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 96468992);

  }

  @Test
  public void test181() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test181"); }


    int i2 = java.lang.Integer.min(200, 200000);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 200);

  }

  @Test
  public void test182() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test182"); }


    int i1 = java.lang.Integer.highestOneBit(1908126);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 1048576);

  }

  @Test
  public void test183() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test183"); }


    java.lang.String str1 = java.lang.Integer.toHexString(655296);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "9ffc0"+ "'", str1.equals("9ffc0"));

  }

  @Test
  public void test184() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test184"); }


    // The following exception was thrown during execution in test generation
    try {
      int i2 = java.lang.Integer.parseInt("4600000020", 33566720);
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

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test185"); }


    java.lang.Integer i1 = java.lang.Integer.getInteger("19");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);

  }

  @Test
  public void test186() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test186"); }


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
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList19 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b20 = strictlySortedSinglyLinkedList19.repOK();
    tp2.IP iP25 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    boolean b26 = strictlySortedSinglyLinkedList19.containsIP(iP25);
    tp2.IPBan iPBan28 = strictlySortedSinglyLinkedList19.get(160);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList29 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b30 = strictlySortedSinglyLinkedList29.repOK();
    strictlySortedSinglyLinkedList29.size = 1;
    boolean b33 = strictlySortedSinglyLinkedList29.isEmpty();
    int i34 = strictlySortedSinglyLinkedList29.getSize();
    int i35 = strictlySortedSinglyLinkedList29.getSize();
    tp2.IP iP40 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP40.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan44 = new tp2.IPBan(iP40, (java.lang.Long)100L);
    tp2.IP iP49 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP49.setFirst((java.lang.Integer)200);
    java.lang.Integer i52 = iP49.getFourth();
    iPBan44.setIp(iP49);
    java.lang.Long long54 = iPBan44.expires;
    tp2.IP iP59 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i60 = iP59.getSecond();
    iP59.setFirst((java.lang.Integer)11001000);
    iP59.setFirst((java.lang.Integer)32);
    iPBan44.setIp(iP59);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList66 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b67 = strictlySortedSinglyLinkedList66.repOK();
    tp2.IP iP72 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i73 = iP72.getSecond();
    iP72.setFirst((java.lang.Integer)11001000);
    iP72.setFirst((java.lang.Integer)(-2147483648));
    boolean b78 = strictlySortedSinglyLinkedList66.removeFromIP(iP72);
    tp2.IPBan iPBan80 = new tp2.IPBan(iP72, (java.lang.Long)0L);
    tp2.IP iP81 = iPBan80.getIp();
    iPBan44.ip = iP81;
    boolean b83 = strictlySortedSinglyLinkedList29.add(iPBan44);
    boolean b84 = strictlySortedSinglyLinkedList19.contains(iPBan44);
    tp2.IP iP85 = iPBan44.getIp();
    iPBan15.setIp(iP85);
    java.lang.Integer i87 = iP85.getThird();
    iP85.setFourth((java.lang.Integer)131072);
    iP85.setFirst((java.lang.Integer)(-1770491665));
    
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iPBan28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i34 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i35 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i52 + "' != '" + 100+ "'", i52.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long54 + "' != '" + 100L+ "'", long54.equals(100L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i60 + "' != '" + (-1)+ "'", i60.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b67 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i73 + "' != '" + (-1)+ "'", i73.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b78 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP81);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b83 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b84 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP85);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i87 + "' != '" + (-1)+ "'", i87.equals((-1)));

  }

  @Test
  public void test187() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test187"); }


    java.lang.Integer i1 = java.lang.Integer.getInteger("91");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);

  }

  @Test
  public void test188() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test188"); }


    java.lang.Integer i1 = java.lang.Integer.getInteger("28");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);

  }

  @Test
  public void test189() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test189"); }


    java.lang.Integer i1 = java.lang.Integer.valueOf(117440968);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 117440968+ "'", i1.equals(117440968));

  }

  @Test
  public void test190() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test190"); }


    java.lang.Integer i2 = java.lang.Integer.getInteger("2000000054", 1242756);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i2 + "' != '" + 1242756+ "'", i2.equals(1242756));

  }

  @Test
  public void test191() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test191"); }


    int i2 = java.lang.Integer.sum(46, 20283569);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 20283615);

  }

  @Test
  public void test192() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test192"); }


    // The following exception was thrown during execution in test generation
    try {
      java.lang.Integer i2 = java.lang.Integer.valueOf("e8000000", 3054);
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

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test193"); }


    int i1 = java.lang.Integer.numberOfTrailingZeros((-2134213366));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 1);

  }

  @Test
  public void test194() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test194"); }


    tp2.IP iP4 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP4.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan8 = new tp2.IPBan(iP4, (java.lang.Long)100L);
    java.lang.Integer i9 = iP4.getFirst();
    iP4.setFirst((java.lang.Integer)24576);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 200+ "'", i9.equals(200));

  }

  @Test
  public void test195() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test195"); }


    // The following exception was thrown during execution in test generation
    try {
      int i1 = java.lang.Integer.parseUnsignedInt("ccb666");
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

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test196"); }


    // The following exception was thrown during execution in test generation
    try {
      int i2 = java.lang.Integer.parseUnsignedInt("1110111110010100000011", 4096);
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test197() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test197"); }


    int i1 = java.lang.Integer.reverseBytes(4194356);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 872431616);

  }

  @Test
  public void test198() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test198"); }


    java.lang.Integer i1 = java.lang.Integer.valueOf(1174749797);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 1174749797+ "'", i1.equals(1174749797));

  }

  @Test
  public void test199() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test199"); }


    java.lang.String str1 = java.lang.Integer.toOctalString((-1901789184));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "21651200000"+ "'", str1.equals("21651200000"));

  }

  @Test
  public void test200() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test200"); }


    // The following exception was thrown during execution in test generation
    try {
      int i2 = java.lang.Integer.parseInt("3qf7k", 16777440);
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test201() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test201"); }


    java.lang.Integer i2 = java.lang.Integer.getInteger("89268645", (-1665138688));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i2 + "' != '" + (-1665138688)+ "'", i2.equals((-1665138688)));

  }

  @Test
  public void test202() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test202"); }


    int i1 = java.lang.Integer.reverseBytes(285409280);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 785);

  }

  @Test
  public void test203() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test203"); }


    // The following exception was thrown during execution in test generation
    try {
      int i1 = java.lang.Integer.parseInt("3355443200");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test204() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test204"); }


    int i2 = java.lang.Integer.divideUnsigned(11100, 9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1233);

  }

  @Test
  public void test205() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test205"); }


    java.lang.String str1 = java.lang.Integer.toBinaryString(1476395008);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "1011000000000000000000000000000"+ "'", str1.equals("1011000000000000000000000000000"));

  }

  @Test
  public void test206() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test206"); }


    java.lang.String str2 = java.lang.Integer.toUnsignedString(1392382846, 83886645);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1392382846"+ "'", str2.equals("1392382846"));

  }

  @Test
  public void test207() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test207"); }


    java.lang.String str1 = java.lang.Integer.toHexString((-2147480697));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "80000b87"+ "'", str1.equals("80000b87"));

  }

  @Test
  public void test208() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test208"); }


    int i1 = java.lang.Integer.bitCount(58);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 4);

  }

  @Test
  public void test209() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test209"); }


    int i1 = java.lang.Integer.reverseBytes(1392382846);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 2115239506);

  }

  @Test
  public void test210() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test210"); }


    int i2 = java.lang.Integer.divideUnsigned(1073741824, (-1062740992));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);

  }

  @Test
  public void test211() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test211"); }


    int i1 = java.lang.Integer.highestOneBit(134217728);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 134217728);

  }

  @Test
  public void test212() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test212"); }


    // The following exception was thrown during execution in test generation
    try {
      int i2 = java.lang.Integer.parseInt("18cba8a", 1558329856);
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

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test213"); }


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
    tp2.SinglyLinkedList singlyLinkedList43 = new tp2.SinglyLinkedList();
    int i44 = singlyLinkedList43.getSize();
    tp2.IP iP49 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i50 = iP49.getSecond();
    java.lang.Integer i51 = iP49.getFourth();
    singlyLinkedList43.add(iP49);
    boolean b54 = iP49.equals((java.lang.Object)2147483647);
    tp2.IPBan iPBan56 = new tp2.IPBan(iP49, (java.lang.Long)(-1L));
    java.lang.Long long57 = iPBan56.expires;
    tp2.IP iP62 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP62.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan66 = new tp2.IPBan(iP62, (java.lang.Long)100L);
    tp2.IP iP67 = iPBan66.ip;
    iP67.setThird((java.lang.Integer)356246784);
    iPBan56.ip = iP67;
    tp2.IPBan iPBan72 = new tp2.IPBan(iP67, (java.lang.Long)1L);
    boolean b73 = strictlySortedSinglyLinkedList0.contains(iPBan72);
    tp2.IP iP74 = iPBan72.getIp();
    java.lang.Long long75 = iPBan72.expires;
    
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
    org.junit.Assert.assertTrue(i44 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i50 + "' != '" + (-1)+ "'", i50.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i51 + "' != '" + 100+ "'", i51.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b54 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long57 + "' != '" + (-1L)+ "'", long57.equals((-1L)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP67);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b73 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP74);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long75 + "' != '" + 1L+ "'", long75.equals(1L));

  }

  @Test
  public void test214() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test214"); }


    int i2 = java.lang.Integer.remainderUnsigned(2097152, 37883472);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 2097152);

  }

  @Test
  public void test215() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test215"); }


    int i1 = java.lang.Integer.bitCount(1233);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 5);

  }

  @Test
  public void test216() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test216"); }


    long long1 = java.lang.Integer.toUnsignedLong(35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == 35L);

  }

  @Test
  public void test217() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test217"); }


    int i2 = java.lang.Integer.rotateLeft(286637532, (-257396566));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1459056708);

  }

  @Test
  public void test218() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test218"); }


    int i1 = java.lang.Integer.bitCount(43253808);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 6);

  }

  @Test
  public void test219() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test219"); }


    int i1 = java.lang.Integer.numberOfLeadingZeros(6331777);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 9);

  }

  @Test
  public void test220() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test220"); }


    // The following exception was thrown during execution in test generation
    try {
      java.lang.Integer i2 = java.lang.Integer.valueOf("33554794", 637534224);
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test221() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test221"); }


    java.lang.String str1 = java.lang.Integer.toOctalString(217056);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "647740"+ "'", str1.equals("647740"));

  }

  @Test
  public void test222() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test222"); }


    java.lang.Integer i1 = new java.lang.Integer(20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 20+ "'", i1.equals(20));

  }

  @Test
  public void test223() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test223"); }


    int i2 = java.lang.Integer.rotateLeft(50331872, 20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 234893312);

  }

  @Test
  public void test224() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test224"); }


    java.lang.Integer i2 = java.lang.Integer.getInteger("1694498816", (java.lang.Integer)560);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i2 + "' != '" + 560+ "'", i2.equals(560));

  }

  @Test
  public void test225() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test225"); }


    java.lang.Integer i1 = new java.lang.Integer(51756492);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 51756492+ "'", i1.equals(51756492));

  }

  @Test
  public void test226() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test226"); }


    int i2 = java.lang.Integer.max(9703552, 5000);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 9703552);

  }

  @Test
  public void test227() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test227"); }


    int i2 = java.lang.Integer.remainderUnsigned(1594950735, (-699399716));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1594950735);

  }

  @Test
  public void test228() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test228"); }


    int i1 = java.lang.Integer.numberOfLeadingZeros(956497920);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 2);

  }

  @Test
  public void test229() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test229"); }


    int i2 = java.lang.Integer.compareUnsigned(1073744896, 356246784);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);

  }

  @Test
  public void test230() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test230"); }


    java.lang.Integer i1 = null;
    // The following exception was thrown during execution in test generation
    try {
      tp2.IP iP4 = new tp2.IP((java.lang.Integer)513015808, i1, (java.lang.Integer)6034312, (java.lang.Integer)93754428);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test231() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test231"); }


    // The following exception was thrown during execution in test generation
    try {
      int i1 = java.lang.Integer.parseUnsignedInt("100000000000001000000000");
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

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test232"); }


    int i1 = java.lang.Integer.lowestOneBit(90);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 2);

  }

  @Test
  public void test233() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test233"); }


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
    strictlySortedSinglyLinkedList0.size = 162;
    tp2.IP iP48 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i49 = iP48.getSecond();
    iP48.setFirst((java.lang.Integer)11001000);
    java.lang.Long long52 = null;
    tp2.IPBan iPBan53 = new tp2.IPBan(iP48, long52);
    java.lang.Long long54 = iPBan53.getExpires();
    iPBan53.expires = 1L;
    tp2.IP iP61 = new tp2.IP((java.lang.Integer)67108864, (java.lang.Integer)(-2147483648), (java.lang.Integer)356246784, (java.lang.Integer)176016000);
    iPBan53.ip = iP61;
    boolean b63 = strictlySortedSinglyLinkedList0.contains(iPBan53);
    boolean b64 = strictlySortedSinglyLinkedList0.isEmpty();
    boolean b65 = strictlySortedSinglyLinkedList0.repOK();
    
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
    org.junit.Assert.assertTrue("'" + i49 + "' != '" + (-1)+ "'", i49.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(long54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b63 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b64 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b65 == false);

  }

  @Test
  public void test234() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test234"); }


    int i1 = java.lang.Integer.lowestOneBit(32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 32);

  }

  @Test
  public void test235() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test235"); }


    java.lang.Integer i2 = java.lang.Integer.getInteger("40001242", (java.lang.Integer)1010000);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i2 + "' != '" + 1010000+ "'", i2.equals(1010000));

  }

  @Test
  public void test236() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test236"); }


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
    strictlySortedSinglyLinkedList13.size = 831941;
    
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

  }

  @Test
  public void test237() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test237"); }


    java.lang.Integer i1 = new java.lang.Integer(29413279);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 29413279+ "'", i1.equals(29413279));

  }

  @Test
  public void test238() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test238"); }


    int i2 = java.lang.Integer.rotateLeft((-2139094931), (-1073741790));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 33554870);

  }

  @Test
  public void test239() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test239"); }


    tp2.SinglyLinkedList singlyLinkedList0 = new tp2.SinglyLinkedList();
    int i1 = singlyLinkedList0.getSize();
    tp2.IP iP6 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i7 = iP6.getSecond();
    java.lang.Integer i8 = iP6.getFourth();
    singlyLinkedList0.add(iP6);
    boolean b10 = singlyLinkedList0.repOK();
    int i11 = singlyLinkedList0.getSize();
    tp2.IP iP13 = singlyLinkedList0.get(13);
    tp2.SinglyLinkedList singlyLinkedList14 = new tp2.SinglyLinkedList();
    boolean b15 = singlyLinkedList14.repOK();
    tp2.IP iP17 = singlyLinkedList14.get(200);
    boolean b18 = singlyLinkedList14.isEmpty();
    boolean b19 = singlyLinkedList14.repOK();
    boolean b20 = singlyLinkedList14.repOK();
    tp2.SinglyLinkedList singlyLinkedList21 = new tp2.SinglyLinkedList();
    int i22 = singlyLinkedList21.getSize();
    tp2.IP iP27 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i28 = iP27.getSecond();
    iP27.setFirst((java.lang.Integer)11001000);
    iP27.setFirst((java.lang.Integer)32);
    boolean b33 = singlyLinkedList21.remove(iP27);
    boolean b34 = singlyLinkedList14.remove(iP27);
    java.lang.Integer i35 = iP27.getFirst();
    iP27.setThird((java.lang.Integer)40000000);
    singlyLinkedList0.add(iP27);
    tp2.IP iP43 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP43.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan47 = new tp2.IPBan(iP43, (java.lang.Long)100L);
    tp2.IP iP48 = iPBan47.ip;
    tp2.SinglyLinkedList singlyLinkedList49 = new tp2.SinglyLinkedList();
    int i50 = singlyLinkedList49.getSize();
    tp2.IP iP55 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i56 = iP55.getSecond();
    java.lang.Integer i57 = iP55.getFourth();
    singlyLinkedList49.add(iP55);
    boolean b59 = iP48.equals((java.lang.Object)iP55);
    java.lang.Class clazz60 = java.lang.Integer.TYPE;
    boolean b61 = iP55.equals((java.lang.Object)clazz60);
    boolean b62 = singlyLinkedList0.remove(iP55);
    iP55.setThird((java.lang.Integer)3014656);
    
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
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i28 + "' != '" + (-1)+ "'", i28.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i35 + "' != '" + 32+ "'", i35.equals(32));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i50 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i56 + "' != '" + (-1)+ "'", i56.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i57 + "' != '" + 100+ "'", i57.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b59 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(clazz60);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b61 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b62 == true);

  }

  @Test
  public void test240() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test240"); }


    int i2 = java.lang.Integer.rotateLeft(1024, 3276800);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1024);

  }

  @Test
  public void test241() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test241"); }


    int i1 = java.lang.Integer.numberOfTrailingZeros(509804);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 2);

  }

  @Test
  public void test242() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test242"); }


    int i1 = java.lang.Integer.reverse(69119);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == (-5210112));

  }

  @Test
  public void test243() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test243"); }


    int i1 = java.lang.Integer.reverse(541065219);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == (-1073741308));

  }

  @Test
  public void test244() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test244"); }


    int i2 = java.lang.Integer.compareUnsigned(3925251, 20283615);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == (-1));

  }

  @Test
  public void test245() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test245"); }


    int i1 = java.lang.Integer.parseUnsignedInt("560");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 560);

  }

  @Test
  public void test246() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test246"); }


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
    tp2.SinglyLinkedList singlyLinkedList45 = new tp2.SinglyLinkedList();
    int i46 = singlyLinkedList45.getSize();
    int i47 = singlyLinkedList45.getSize();
    tp2.IP iP48 = null;
    boolean b49 = singlyLinkedList45.contains(iP48);
    tp2.IP iP51 = singlyLinkedList45.get(27);
    tp2.IP iP56 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i57 = iP56.getSecond();
    iP56.setFirst((java.lang.Integer)11001000);
    java.lang.Long long60 = null;
    tp2.IPBan iPBan61 = new tp2.IPBan(iP56, long60);
    tp2.IP iP62 = iPBan61.ip;
    tp2.IP iP63 = iPBan61.ip;
    java.lang.Integer i64 = iP63.getFourth();
    boolean b65 = singlyLinkedList45.remove(iP63);
    tp2.IP iP70 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i71 = iP70.getSecond();
    iP70.setFirst((java.lang.Integer)11001000);
    java.lang.Long long74 = null;
    tp2.IPBan iPBan75 = new tp2.IPBan(iP70, long74);
    tp2.IP iP76 = iPBan75.ip;
    tp2.IP iP77 = iPBan75.ip;
    tp2.IPBan iPBan79 = new tp2.IPBan(iP77, (java.lang.Long)10L);
    singlyLinkedList45.add(iP77);
    boolean b81 = singlyLinkedList45.repOK();
    int i82 = singlyLinkedList45.getSize();
    tp2.IP iP87 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP87.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan91 = new tp2.IPBan(iP87, (java.lang.Long)100L);
    tp2.IP iP92 = iPBan91.ip;
    tp2.IP iP93 = iPBan91.getIp();
    java.lang.Integer i94 = iP93.getSecond();
    tp2.IPBan iPBan96 = new tp2.IPBan(iP93, (java.lang.Long)20971520L);
    boolean b97 = singlyLinkedList45.contains(iP93);
    boolean b98 = singlyLinkedList0.contains(iP93);
    boolean b99 = singlyLinkedList0.isEmpty();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i46 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i47 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b49 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i57 + "' != '" + (-1)+ "'", i57.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP62);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP63);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i64 + "' != '" + 100+ "'", i64.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b65 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i71 + "' != '" + (-1)+ "'", i71.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP76);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP77);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b81 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i82 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP92);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP93);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i94 + "' != '" + (-1)+ "'", i94.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b97 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b98 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b99 == false);

  }

  @Test
  public void test247() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test247"); }


    long long1 = java.lang.Integer.toUnsignedLong(212600);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == 212600L);

  }

  @Test
  public void test248() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test248"); }


    int i1 = java.lang.Integer.reverse(7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == (-536870912));

  }

  @Test
  public void test249() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test249"); }


    java.lang.Integer i2 = java.lang.Integer.getInteger("1100101000000000000000000000000", 1594950735);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i2 + "' != '" + 1594950735+ "'", i2.equals(1594950735));

  }

  @Test
  public void test250() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test250"); }


    int i1 = java.lang.Integer.signum(623247520);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 1);

  }

  @Test
  public void test251() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test251"); }


    int i2 = java.lang.Integer.max(725501, 80000);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 725501);

  }

  @Test
  public void test252() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test252"); }


    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList0 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IPBan iPBan1 = null;
    boolean b2 = strictlySortedSinglyLinkedList0.add(iPBan1);
    int i3 = strictlySortedSinglyLinkedList0.getSize();
    tp2.Node node4 = strictlySortedSinglyLinkedList0.header;
    strictlySortedSinglyLinkedList0.size = (-2147483648);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList7 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b8 = strictlySortedSinglyLinkedList7.repOK();
    boolean b9 = strictlySortedSinglyLinkedList7.repOK();
    tp2.IPBan iPBan10 = null;
    boolean b11 = strictlySortedSinglyLinkedList7.contains(iPBan10);
    tp2.IP iP16 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP16.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan20 = new tp2.IPBan(iP16, (java.lang.Long)100L);
    tp2.IP iP21 = iPBan20.ip;
    tp2.IP iP26 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP26.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan30 = new tp2.IPBan(iP26, (java.lang.Long)100L);
    iPBan20.setIp(iP26);
    java.lang.Long long32 = iPBan20.getExpires();
    tp2.IP iP33 = iPBan20.ip;
    iP33.setSecond((java.lang.Integer)11001000);
    boolean b36 = strictlySortedSinglyLinkedList7.containsIP(iP33);
    java.lang.Integer i37 = iP33.getFourth();
    iP33.setThird((java.lang.Integer)23);
    // The following exception was thrown during execution in test generation
    try {
      boolean b40 = strictlySortedSinglyLinkedList0.containsIP(iP33);
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
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long32 + "' != '" + 100L+ "'", long32.equals(100L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i37 + "' != '" + 100+ "'", i37.equals(100));

  }

  @Test
  public void test253() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test253"); }


    java.lang.Integer i1 = java.lang.Integer.decode("1392382846");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 1392382846+ "'", i1.equals(1392382846));

  }

  @Test
  public void test254() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test254"); }


    int i1 = java.lang.Integer.numberOfLeadingZeros(24117248);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 7);

  }

  @Test
  public void test255() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test255"); }


    java.lang.Integer i1 = java.lang.Integer.valueOf(33096);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 33096+ "'", i1.equals(33096));

  }

  @Test
  public void test256() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test256"); }


    int i2 = java.lang.Integer.compare(128628, 1610612738);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == (-1));

  }

  @Test
  public void test257() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test257"); }


    java.lang.Integer i1 = java.lang.Integer.valueOf((-1062740824));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + (-1062740824)+ "'", i1.equals((-1062740824)));

  }

  @Test
  public void test258() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test258"); }


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
    tp2.IP iP17 = iPBan14.getIp();
    iPBan14.setExpires((java.lang.Long)3221225472L);
    
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
    org.junit.Assert.assertNotNull(iP17);

  }

  @Test
  public void test259() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test259"); }


    java.lang.Integer i1 = java.lang.Integer.getInteger("744529281");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);

  }

  @Test
  public void test260() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test260"); }


    java.lang.String str1 = java.lang.Integer.toHexString((-671088639));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "d8000001"+ "'", str1.equals("d8000001"));

  }

  @Test
  public void test261() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test261"); }


    int i1 = java.lang.Integer.reverse(1100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 840957952);

  }

  @Test
  public void test262() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test262"); }


    int i2 = java.lang.Integer.rotateLeft(14, 2088174752);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 14);

  }

  @Test
  public void test263() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test263"); }


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
    int i58 = strictlySortedSinglyLinkedList0.size;
    tp2.IPBan iPBan60 = strictlySortedSinglyLinkedList0.get(4);
    boolean b61 = strictlySortedSinglyLinkedList0.repOK();
    
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
    org.junit.Assert.assertTrue(i58 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iPBan60);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b61 == true);

  }

  @Test
  public void test264() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test264"); }


    int i2 = java.lang.Integer.divideUnsigned(216, 805465858);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);

  }

  @Test
  public void test265() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test265"); }


    java.lang.Integer i1 = new java.lang.Integer("20971520");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 20971520+ "'", i1.equals(20971520));

  }

  @Test
  public void test266() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test266"); }


    int i2 = java.lang.Integer.min((-1610320004), 121600);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == (-1610320004));

  }

  @Test
  public void test267() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test267"); }


    java.lang.Integer i2 = java.lang.Integer.getInteger("6029312", (java.lang.Integer)30009402);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i2 + "' != '" + 30009402+ "'", i2.equals(30009402));

  }

  @Test
  public void test268() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test268"); }


    // The following exception was thrown during execution in test generation
    try {
      java.lang.Integer i1 = java.lang.Integer.decode("34fe0");
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

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test269"); }


    int i2 = java.lang.Integer.rotateRight(1572869, (-1275068414));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1074135041);

  }

  @Test
  public void test270() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test270"); }


    int i1 = java.lang.Integer.bitCount(1431647489);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 13);

  }

  @Test
  public void test271() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test271"); }


    java.lang.String str1 = java.lang.Integer.toBinaryString(1506);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "10111100010"+ "'", str1.equals("10111100010"));

  }

  @Test
  public void test272() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test272"); }


    java.lang.String str1 = java.lang.Integer.toUnsignedString(335561509);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "335561509"+ "'", str1.equals("335561509"));

  }

  @Test
  public void test273() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test273"); }


    java.lang.Integer i2 = java.lang.Integer.getInteger("11100000", 176016000);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i2 + "' != '" + 176016000+ "'", i2.equals(176016000));

  }

  @Test
  public void test274() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test274"); }


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
    tp2.IPBan iPBan17 = strictlySortedSinglyLinkedList0.get(81);
    int i18 = strictlySortedSinglyLinkedList0.size;
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList19 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b20 = strictlySortedSinglyLinkedList19.repOK();
    tp2.IP iP25 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    boolean b26 = strictlySortedSinglyLinkedList19.containsIP(iP25);
    tp2.Node node27 = strictlySortedSinglyLinkedList19.header;
    boolean b28 = strictlySortedSinglyLinkedList19.isEmpty();
    int i29 = strictlySortedSinglyLinkedList19.getSize();
    tp2.SinglyLinkedList singlyLinkedList30 = new tp2.SinglyLinkedList();
    int i31 = singlyLinkedList30.getSize();
    tp2.IP iP36 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i37 = iP36.getSecond();
    java.lang.Integer i38 = iP36.getFourth();
    singlyLinkedList30.add(iP36);
    tp2.IPBan iPBan41 = new tp2.IPBan(iP36, (java.lang.Long)1L);
    boolean b42 = strictlySortedSinglyLinkedList19.contains(iPBan41);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList43 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b44 = strictlySortedSinglyLinkedList43.repOK();
    strictlySortedSinglyLinkedList43.size = 1;
    strictlySortedSinglyLinkedList43.size = 0;
    tp2.IPBan iPBan49 = null;
    boolean b50 = strictlySortedSinglyLinkedList43.add(iPBan49);
    tp2.Node node51 = strictlySortedSinglyLinkedList43.header;
    strictlySortedSinglyLinkedList19.header = node51;
    strictlySortedSinglyLinkedList0.header = node51;
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList54 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b55 = strictlySortedSinglyLinkedList54.repOK();
    tp2.IP iP60 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i61 = iP60.getSecond();
    iP60.setFirst((java.lang.Integer)11001000);
    iP60.setFirst((java.lang.Integer)(-2147483648));
    boolean b66 = strictlySortedSinglyLinkedList54.removeFromIP(iP60);
    java.lang.Integer i67 = iP60.getThird();
    iP60.setFourth((java.lang.Integer)15204352);
    // The following exception was thrown during execution in test generation
    try {
      boolean b70 = strictlySortedSinglyLinkedList0.containsIP(iP60);
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
    org.junit.Assert.assertNull(iPBan17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i29 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i31 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i37 + "' != '" + (-1)+ "'", i37.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i38 + "' != '" + 100+ "'", i38.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b50 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b55 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i61 + "' != '" + (-1)+ "'", i61.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b66 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i67 + "' != '" + (-1)+ "'", i67.equals((-1)));

  }

  @Test
  public void test275() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test275"); }


    int i2 = java.lang.Integer.rotateLeft(201326592, 1048576);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 201326592);

  }

  @Test
  public void test276() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test276"); }


    java.lang.Integer i1 = java.lang.Integer.valueOf(541229059);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 541229059+ "'", i1.equals(541229059));

  }

  @Test
  public void test277() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test277"); }


    int i2 = java.lang.Integer.rotateRight(20, 132);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1073741825);

  }

  @Test
  public void test278() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test278"); }


    java.lang.Integer i1 = java.lang.Integer.valueOf("67108864");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 67108864+ "'", i1.equals(67108864));

  }

  @Test
  public void test279() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test279"); }


    // The following exception was thrown during execution in test generation
    try {
      int i2 = java.lang.Integer.parseUnsignedInt("", 671088640);
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test280() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test280"); }


    int i1 = java.lang.Integer.parseUnsignedInt("1000000144");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 1000000144);

  }

  @Test
  public void test281() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test281"); }


    java.lang.Integer i1 = new java.lang.Integer("12319");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 12319+ "'", i1.equals(12319));

  }

  @Test
  public void test282() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test282"); }


    int i1 = java.lang.Integer.reverse(167773);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == (-1158594560));

  }

  @Test
  public void test283() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test283"); }


    int i2 = java.lang.Integer.rotateRight(184828115, 5020);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == (-1337717456));

  }

  @Test
  public void test284() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test284"); }


    int i2 = java.lang.Integer.rotateLeft(1476395008, 16762403);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == (-1073741822));

  }

  @Test
  public void test285() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test285"); }


    java.lang.String str1 = java.lang.Integer.toHexString(72310545);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "44f5f11"+ "'", str1.equals("44f5f11"));

  }

  @Test
  public void test286() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test286"); }


    java.lang.Integer i2 = java.lang.Integer.getInteger("624000", (java.lang.Integer)138);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i2 + "' != '" + 138+ "'", i2.equals(138));

  }

  @Test
  public void test287() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test287"); }


    java.lang.String str1 = java.lang.Integer.toOctalString((-1006632260));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "30400001274"+ "'", str1.equals("30400001274"));

  }

  @Test
  public void test288() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test288"); }


    // The following exception was thrown during execution in test generation
    try {
      int i2 = java.lang.Integer.parseUnsignedInt("20971520", 560);
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test289() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test289"); }


    int i1 = java.lang.Integer.lowestOneBit(4195041);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 1);

  }

  @Test
  public void test290() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test290"); }


    int i2 = java.lang.Integer.rotateLeft((-2144796578), 121600);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == (-2144796578));

  }

  @Test
  public void test291() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test291"); }


    java.lang.String str1 = java.lang.Integer.toUnsignedString(536870912);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "536870912"+ "'", str1.equals("536870912"));

  }

  @Test
  public void test292() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test292"); }


    java.lang.String str1 = java.lang.Integer.toBinaryString(128628);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "11111011001110100"+ "'", str1.equals("11111011001110100"));

  }

  @Test
  public void test293() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test293"); }


    java.lang.Integer i2 = java.lang.Integer.getInteger("11110010", 1335351);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i2 + "' != '" + 1335351+ "'", i2.equals(1335351));

  }

  @Test
  public void test294() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test294"); }


    int i1 = java.lang.Integer.highestOneBit(26000010);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 16777216);

  }

  @Test
  public void test295() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test295"); }


    int i2 = java.lang.Integer.sum(1011110, 164495360);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 165506470);

  }

  @Test
  public void test296() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test296"); }


    // The following exception was thrown during execution in test generation
    try {
      int i1 = java.lang.Integer.parseInt("100000000000001000000000");
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

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test297"); }


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
    iP36.setThird((java.lang.Integer)92);
    
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

  }

  @Test
  public void test298() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test298"); }


    // The following exception was thrown during execution in test generation
    try {
      int i2 = java.lang.Integer.divideUnsigned((-536870911), 0);
      org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException");
    } catch (java.lang.ArithmeticException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArithmeticException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test299() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test299"); }


    int i2 = java.lang.Integer.min((-2147483600), (-285212216));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == (-2147483600));

  }

  @Test
  public void test300() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test300"); }


    int i2 = java.lang.Integer.sum(805344258, 164495360);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 969839618);

  }

  @Test
  public void test301() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test301"); }


    int i2 = java.lang.Integer.min(623247555, 50331872);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 50331872);

  }

  @Test
  public void test302() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test302"); }


    java.lang.Integer i2 = java.lang.Integer.getInteger("110000001", (java.lang.Integer)346729130);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i2 + "' != '" + 346729130+ "'", i2.equals(346729130));

  }

  @Test
  public void test303() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test303"); }


    // The following exception was thrown during execution in test generation
    try {
      int i2 = java.lang.Integer.parseInt("3qf7k", 655360);
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test304() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test304"); }


    // The following exception was thrown during execution in test generation
    try {
      int i1 = java.lang.Integer.parseUnsignedInt("9ffc0");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test305() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test305"); }


    java.lang.Integer i1 = new java.lang.Integer(65536);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 65536+ "'", i1.equals(65536));

  }

  @Test
  public void test306() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test306"); }


    java.lang.String str1 = java.lang.Integer.toUnsignedString(184549395);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "184549395"+ "'", str1.equals("184549395"));

  }

  @Test
  public void test307() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test307"); }


    java.lang.Integer i2 = java.lang.Integer.getInteger("80000b87", (java.lang.Integer)13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i2 + "' != '" + 13+ "'", i2.equals(13));

  }

  @Test
  public void test308() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test308"); }


    // The following exception was thrown during execution in test generation
    try {
      java.lang.Integer i1 = new java.lang.Integer("2264924159");
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

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test309"); }


    int i2 = java.lang.Integer.remainderUnsigned(117440667, 101);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 89);

  }

  @Test
  public void test310() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test310"); }


    int i1 = java.lang.Integer.reverseBytes(51756250);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == (-625208061));

  }

  @Test
  public void test311() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test311"); }


    java.lang.Integer i2 = java.lang.Integer.getInteger("541065219", 69119);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i2 + "' != '" + 69119+ "'", i2.equals(69119));

  }

  @Test
  public void test312() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test312"); }


    int i2 = java.lang.Integer.min((-285212216), 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == (-285212216));

  }

  @Test
  public void test313() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test313"); }


    tp2.IP iP4 = new tp2.IP((java.lang.Integer)67108864, (java.lang.Integer)(-2147483648), (java.lang.Integer)356246784, (java.lang.Integer)176016000);
    java.lang.Integer i5 = iP4.getThird();
    java.lang.Integer i6 = iP4.getFourth();
    tp2.IPBan iPBan8 = new tp2.IPBan(iP4, (java.lang.Long)167772160L);
    java.lang.Long long9 = iPBan8.expires;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i5 + "' != '" + 356246784+ "'", i5.equals(356246784));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i6 + "' != '" + 176016000+ "'", i6.equals(176016000));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long9 + "' != '" + 167772160L+ "'", long9.equals(167772160L));

  }

  @Test
  public void test314() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test314"); }


    java.lang.String str1 = java.lang.Integer.toBinaryString(62079);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "1111001001111111"+ "'", str1.equals("1111001001111111"));

  }

  @Test
  public void test315() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test315"); }


    java.lang.Integer i1 = java.lang.Integer.valueOf(117440640);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 117440640+ "'", i1.equals(117440640));

  }

  @Test
  public void test316() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test316"); }


    java.lang.Integer i1 = java.lang.Integer.valueOf("40001242");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 40001242+ "'", i1.equals(40001242));

  }

  @Test
  public void test317() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test317"); }


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
    tp2.IPBan iPBan40 = new tp2.IPBan(iP38, (java.lang.Long)32L);
    iP38.setFourth((java.lang.Integer)(-129238707));
    
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
  public void test318() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test318"); }


    int i1 = java.lang.Integer.numberOfTrailingZeros(57347);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);

  }

  @Test
  public void test319() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test319"); }


    int i2 = java.lang.Integer.remainderUnsigned(33554794, (-536870912));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 33554794);

  }

  @Test
  public void test320() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test320"); }


    int i2 = java.lang.Integer.divideUnsigned(33566720, 90);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 372963);

  }

  @Test
  public void test321() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test321"); }


    java.lang.String str1 = java.lang.Integer.toBinaryString((-1021985471));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "11000011000101011011110101000001"+ "'", str1.equals("11000011000101011011110101000001"));

  }

  @Test
  public void test322() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test322"); }


    int i1 = java.lang.Integer.reverseBytes(700000233);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == (-383272663));

  }

  @Test
  public void test323() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test323"); }


    int i1 = java.lang.Integer.parseUnsignedInt("5060067");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 5060067);

  }

  @Test
  public void test324() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test324"); }


    int i2 = java.lang.Integer.max(6331777, 26000010);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 26000010);

  }

  @Test
  public void test325() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test325"); }


    java.lang.String str1 = java.lang.Integer.toBinaryString(149241072);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "1000111001010011110011110000"+ "'", str1.equals("1000111001010011110011110000"));

  }

  @Test
  public void test326() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test326"); }


    long long1 = java.lang.Integer.toUnsignedLong((-2147480697));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == 2147486599L);

  }

  @Test
  public void test327() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test327"); }


    // The following exception was thrown during execution in test generation
    try {
      int i2 = java.lang.Integer.parseInt("a", 266);
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

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test328"); }


    // The following exception was thrown during execution in test generation
    try {
      java.lang.Integer i1 = java.lang.Integer.decode("16b84b14");
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

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test329"); }


    // The following exception was thrown during execution in test generation
    try {
      int i1 = java.lang.Integer.parseUnsignedInt("e80000");
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

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test330"); }


    int i2 = java.lang.Integer.max(17, (-1062712152));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 17);

  }

  @Test
  public void test331() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test331"); }


    java.lang.Integer i2 = java.lang.Integer.getInteger("49656", 340);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i2 + "' != '" + 340+ "'", i2.equals(340));

  }

  @Test
  public void test332() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test332"); }


    int i1 = java.lang.Integer.numberOfTrailingZeros(26000010);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 1);

  }

  @Test
  public void test333() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test333"); }


    java.lang.Integer i1 = java.lang.Integer.valueOf(1024);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 1024+ "'", i1.equals(1024));

  }

  @Test
  public void test334() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test334"); }


    int i2 = java.lang.Integer.min(2127069032, 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 35);

  }

  @Test
  public void test335() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test335"); }


    int i2 = java.lang.Integer.rotateRight(29824259, 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1901080604);

  }

  @Test
  public void test336() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test336"); }


    int i1 = java.lang.Integer.numberOfTrailingZeros(26476544);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 18);

  }

  @Test
  public void test337() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test337"); }


    // The following exception was thrown during execution in test generation
    try {
      int i1 = java.lang.Integer.parseUnsignedInt("c05c1500");
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

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test338"); }


    int i2 = java.lang.Integer.max(13631488, 700000233);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 700000233);

  }

  @Test
  public void test339() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test339"); }


    int i2 = java.lang.Integer.sum(83886645, (-811446013));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == (-727559368));

  }

  @Test
  public void test340() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test340"); }


    // The following exception was thrown during execution in test generation
    try {
      int i2 = java.lang.Integer.parseUnsignedInt("2000000054", 404);
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test341() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test341"); }


    java.lang.String str1 = java.lang.Integer.toBinaryString((-811446013));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "11001111101000100101000100000011"+ "'", str1.equals("11001111101000100101000100000011"));

  }

  @Test
  public void test342() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test342"); }


    // The following exception was thrown during execution in test generation
    try {
      int i2 = java.lang.Integer.parseUnsignedInt("14000000000", 23);
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

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test343"); }


    int i2 = java.lang.Integer.rotateLeft(9703552, 4103436);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1091043337);

  }

  @Test
  public void test344() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test344"); }


    long long1 = java.lang.Integer.toUnsignedLong(121600);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == 121600L);

  }

  @Test
  public void test345() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test345"); }


    int i2 = java.lang.Integer.remainderUnsigned(310, 6047546);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 310);

  }

  @Test
  public void test346() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test346"); }


    tp2.IP iP4 = new tp2.IP((java.lang.Integer)340, (java.lang.Integer)8387072, (java.lang.Integer)10175748, (java.lang.Integer)8169312);

  }

  @Test
  public void test347() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test347"); }


    int i1 = java.lang.Integer.bitCount(12319);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 7);

  }

  @Test
  public void test348() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test348"); }


    java.lang.String str1 = java.lang.Integer.toOctalString(112001);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "332601"+ "'", str1.equals("332601"));

  }

  @Test
  public void test349() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test349"); }


    int i2 = java.lang.Integer.rotateRight(8389120, 22265424);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 33554560);

  }

  @Test
  public void test350() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test350"); }


    java.lang.String str2 = java.lang.Integer.toUnsignedString(327155936, 13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "52a183c3"+ "'", str2.equals("52a183c3"));

  }

  @Test
  public void test351() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test351"); }


    java.lang.Integer i1 = java.lang.Integer.valueOf(49656);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 49656+ "'", i1.equals(49656));

  }

  @Test
  public void test352() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test352"); }


    int i2 = java.lang.Integer.compareUnsigned(533897138, (-1461934336));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == (-1));

  }

  @Test
  public void test353() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test353"); }


    java.lang.String str1 = java.lang.Integer.toBinaryString(43253808);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "10100101000000000000110000"+ "'", str1.equals("10100101000000000000110000"));

  }

  @Test
  public void test354() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test354"); }


    java.lang.Integer i1 = java.lang.Integer.decode("247671240");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 247671240+ "'", i1.equals(247671240));

  }

  @Test
  public void test355() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test355"); }


    java.lang.Integer i1 = java.lang.Integer.valueOf("5220000");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 5220000+ "'", i1.equals(5220000));

  }

  @Test
  public void test356() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test356"); }


    int i2 = java.lang.Integer.sum((-1073741817), (-1067707136));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == (-2141448953));

  }

  @Test
  public void test357() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test357"); }


    // The following exception was thrown during execution in test generation
    try {
      int i2 = java.lang.Integer.parseUnsignedInt("7520000043", 19456);
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

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test358"); }


    // The following exception was thrown during execution in test generation
    try {
      int i1 = java.lang.Integer.parseInt("10011100110000000000000000000000");
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

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test359"); }


    int i2 = java.lang.Integer.compareUnsigned(56, 327045886);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == (-1));

  }

  @Test
  public void test360() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test360"); }


    int i2 = java.lang.Integer.rotateLeft(117440968, 56000);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 117440968);

  }

  @Test
  public void test361() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test361"); }


    int i2 = java.lang.Integer.max(1110, 92);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1110);

  }

  @Test
  public void test362() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test362"); }


    int i2 = java.lang.Integer.compareUnsigned(440705, 57347);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);

  }

  @Test
  public void test363() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test363"); }


    int i1 = java.lang.Integer.numberOfTrailingZeros(19531250);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 1);

  }

  @Test
  public void test364() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test364"); }


    tp2.SinglyLinkedList singlyLinkedList0 = new tp2.SinglyLinkedList();
    int i1 = singlyLinkedList0.getSize();
    tp2.IP iP6 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i7 = iP6.getSecond();
    java.lang.Integer i8 = iP6.getFourth();
    singlyLinkedList0.add(iP6);
    boolean b10 = singlyLinkedList0.repOK();
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
    boolean b32 = singlyLinkedList11.isEmpty();
    tp2.SinglyLinkedList singlyLinkedList33 = new tp2.SinglyLinkedList();
    int i34 = singlyLinkedList33.getSize();
    tp2.IP iP39 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i40 = iP39.getSecond();
    java.lang.Integer i41 = iP39.getFourth();
    singlyLinkedList33.add(iP39);
    tp2.IPBan iPBan44 = new tp2.IPBan(iP39, (java.lang.Long)100L);
    iP39.setFourth((java.lang.Integer)1);
    boolean b47 = singlyLinkedList11.remove(iP39);
    java.lang.Integer i48 = iP39.getFourth();
    boolean b49 = singlyLinkedList0.contains(iP39);
    iP39.setFirst((java.lang.Integer)(-1461934336));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i7 + "' != '" + (-1)+ "'", i7.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i8 + "' != '" + 100+ "'", i8.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i29 + "' != '" + 100+ "'", i29.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i34 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i40 + "' != '" + (-1)+ "'", i40.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i41 + "' != '" + 100+ "'", i41.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b47 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i48 + "' != '" + 1+ "'", i48.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b49 == false);

  }

  @Test
  public void test365() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test365"); }


    java.lang.String str1 = java.lang.Integer.toUnsignedString((-2120392704));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "2174574592"+ "'", str1.equals("2174574592"));

  }

  @Test
  public void test366() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test366"); }


    java.lang.String str1 = java.lang.Integer.toBinaryString(346729152);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "10100101010101010101011000000"+ "'", str1.equals("10100101010101010101011000000"));

  }

  @Test
  public void test367() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test367"); }


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
    tp2.IP iP25 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i26 = iP25.getSecond();
    iP25.setFirst((java.lang.Integer)11001000);
    iP25.setFirst((java.lang.Integer)32);
    singlyLinkedList0.add(iP25);
    java.lang.Object obj32 = null;
    boolean b33 = iP25.equals(obj32);
    
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
    org.junit.Assert.assertTrue("'" + i26 + "' != '" + (-1)+ "'", i26.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == false);

  }

  @Test
  public void test368() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test368"); }


    int i1 = java.lang.Integer.bitCount(513015808);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 7);

  }

  @Test
  public void test369() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test369"); }


    java.lang.String str2 = java.lang.Integer.toUnsignedString(1476395008, 71040);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1476395008"+ "'", str2.equals("1476395008"));

  }

  @Test
  public void test370() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test370"); }


    long long1 = java.lang.Integer.toUnsignedLong(224);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == 224L);

  }

  @Test
  public void test371() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test371"); }


    int i2 = java.lang.Integer.min(33554560, 1011110);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1011110);

  }

  @Test
  public void test372() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test372"); }


    // The following exception was thrown during execution in test generation
    try {
      java.lang.Integer i1 = new java.lang.Integer("3758096387");
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

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test373"); }


    int i1 = java.lang.Integer.highestOneBit(13631488);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 8388608);

  }

  @Test
  public void test374() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test374"); }


    // The following exception was thrown during execution in test generation
    try {
      int i2 = java.lang.Integer.parseUnsignedInt("1140850688", 0);
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test375() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test375"); }


    int i1 = java.lang.Integer.highestOneBit(1342264254);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 1073741824);

  }

  @Test
  public void test376() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test376"); }


    // The following exception was thrown during execution in test generation
    try {
      java.lang.Integer i2 = java.lang.Integer.valueOf("11010100011010001011001111", 11001000);
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

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test377"); }


    long long1 = java.lang.Integer.toUnsignedLong(785);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == 785L);

  }

  @Test
  public void test378() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test378"); }


    java.lang.Integer i2 = java.lang.Integer.getInteger("1027604515", (java.lang.Integer)24576);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i2 + "' != '" + 24576+ "'", i2.equals(24576));

  }

  @Test
  public void test379() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test379"); }


    tp2.IP iP4 = new tp2.IP((java.lang.Integer)1610612736, (java.lang.Integer)1152, (java.lang.Integer)12, (java.lang.Integer)48);

  }

  @Test
  public void test380() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test380"); }


    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList0 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b1 = strictlySortedSinglyLinkedList0.repOK();
    strictlySortedSinglyLinkedList0.size = 1;
    strictlySortedSinglyLinkedList0.size = 0;
    tp2.IPBan iPBan6 = null;
    boolean b7 = strictlySortedSinglyLinkedList0.add(iPBan6);
    tp2.Node node8 = strictlySortedSinglyLinkedList0.header;
    int i9 = strictlySortedSinglyLinkedList0.size;
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList10 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b11 = strictlySortedSinglyLinkedList10.repOK();
    tp2.IP iP16 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i17 = iP16.getSecond();
    iP16.setFirst((java.lang.Integer)11001000);
    iP16.setFirst((java.lang.Integer)(-2147483648));
    boolean b22 = strictlySortedSinglyLinkedList10.removeFromIP(iP16);
    tp2.IPBan iPBan24 = new tp2.IPBan(iP16, (java.lang.Long)0L);
    tp2.IP iP25 = iPBan24.getIp();
    java.lang.Long long26 = iPBan24.getExpires();
    java.lang.Long long27 = iPBan24.expires;
    tp2.IP iP28 = iPBan24.ip;
    java.lang.Long long29 = iPBan24.getExpires();
    tp2.SinglyLinkedList singlyLinkedList30 = new tp2.SinglyLinkedList();
    boolean b31 = singlyLinkedList30.repOK();
    tp2.IP iP33 = singlyLinkedList30.get(200);
    boolean b34 = singlyLinkedList30.isEmpty();
    boolean b35 = singlyLinkedList30.repOK();
    boolean b36 = singlyLinkedList30.repOK();
    tp2.IP iP41 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i42 = iP41.getThird();
    singlyLinkedList30.add(iP41);
    boolean b44 = singlyLinkedList30.isEmpty();
    boolean b45 = singlyLinkedList30.repOK();
    tp2.SinglyLinkedList singlyLinkedList46 = new tp2.SinglyLinkedList();
    int i47 = singlyLinkedList46.getSize();
    boolean b48 = singlyLinkedList46.isEmpty();
    tp2.IP iP53 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP53.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan57 = new tp2.IPBan(iP53, (java.lang.Long)100L);
    tp2.IP iP58 = iPBan57.ip;
    tp2.IP iP59 = iPBan57.getIp();
    tp2.IP iP64 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP64.setFirst((java.lang.Integer)200);
    iPBan57.ip = iP64;
    iP64.setFourth((java.lang.Integer)242);
    singlyLinkedList46.add(iP64);
    boolean b71 = singlyLinkedList30.contains(iP64);
    iPBan24.setIp(iP64);
    iP64.setFourth((java.lang.Integer)8);
    // The following exception was thrown during execution in test generation
    try {
      boolean b75 = strictlySortedSinglyLinkedList0.containsIP(iP64);
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
    org.junit.Assert.assertNotNull(node8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i17 + "' != '" + (-1)+ "'", i17.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L+ "'", long26.equals(0L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L+ "'", long27.equals(0L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L+ "'", long29.equals(0L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i42 + "' != '" + (-1)+ "'", i42.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i47 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b48 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP58);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP59);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b71 == false);

  }

  @Test
  public void test381() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test381"); }


    int i2 = java.lang.Integer.compareUnsigned(310378496, 207025415);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);

  }

  @Test
  public void test382() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test382"); }


    int i2 = java.lang.Integer.rotateLeft(346729130, 88);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == (-1441486166));

  }

  @Test
  public void test383() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test383"); }


    // The following exception was thrown during execution in test generation
    try {
      int i2 = java.lang.Integer.parseUnsignedInt("110000000000000", 1308183544);
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

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test384"); }


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
    tp2.IP iP23 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP23.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan27 = new tp2.IPBan(iP23, (java.lang.Long)100L);
    tp2.IP iP28 = iPBan27.ip;
    tp2.IP iP33 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP33.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan37 = new tp2.IPBan(iP33, (java.lang.Long)100L);
    iPBan27.setIp(iP33);
    java.lang.Long long39 = iPBan27.getExpires();
    tp2.IP iP40 = iPBan27.ip;
    iP40.setThird((java.lang.Integer)0);
    // The following exception was thrown during execution in test generation
    try {
      boolean b43 = strictlySortedSinglyLinkedList0.removeFromIP(iP40);
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
    org.junit.Assert.assertNotNull(iP28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long39 + "' != '" + 100L+ "'", long39.equals(100L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP40);

  }

  @Test
  public void test385() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test385"); }


    int i2 = java.lang.Integer.compareUnsigned(356246784, (-2141448953));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == (-1));

  }

  @Test
  public void test386() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test386"); }


    int i2 = java.lang.Integer.compareUnsigned(5060067, 42387);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);

  }

  @Test
  public void test387() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test387"); }


    java.lang.String str1 = java.lang.Integer.toOctalString((-2147483598));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "20000000062"+ "'", str1.equals("20000000062"));

  }

  @Test
  public void test388() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test388"); }


    int i2 = java.lang.Integer.compareUnsigned(5382, 513015808);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == (-1));

  }

  @Test
  public void test389() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test389"); }


    tp2.SinglyLinkedList singlyLinkedList0 = new tp2.SinglyLinkedList();
    int i1 = singlyLinkedList0.getSize();
    tp2.IP iP6 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i7 = iP6.getSecond();
    java.lang.Integer i8 = iP6.getFourth();
    singlyLinkedList0.add(iP6);
    tp2.IPBan iPBan11 = new tp2.IPBan(iP6, (java.lang.Long)1L);
    tp2.IPBan iPBan13 = new tp2.IPBan(iP6, (java.lang.Long)100L);
    java.lang.Long long14 = iPBan13.expires;
    tp2.SinglyLinkedList singlyLinkedList15 = new tp2.SinglyLinkedList();
    int i16 = singlyLinkedList15.getSize();
    int i17 = singlyLinkedList15.getSize();
    tp2.IP iP18 = null;
    boolean b19 = singlyLinkedList15.contains(iP18);
    boolean b20 = singlyLinkedList15.repOK();
    boolean b21 = singlyLinkedList15.isEmpty();
    tp2.IP iP26 = new tp2.IP((java.lang.Integer)5, (java.lang.Integer)10, (java.lang.Integer)31, (java.lang.Integer)32);
    java.lang.Object obj27 = null;
    boolean b28 = iP26.equals(obj27);
    iP26.setFirst((java.lang.Integer)100);
    boolean b31 = singlyLinkedList15.contains(iP26);
    iP26.setFirst((java.lang.Integer)32768);
    iPBan13.setIp(iP26);
    iPBan13.setExpires((java.lang.Long)71040L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i7 + "' != '" + (-1)+ "'", i7.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i8 + "' != '" + 100+ "'", i8.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long14 + "' != '" + 100L+ "'", long14.equals(100L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == false);

  }

  @Test
  public void test390() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test390"); }


    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList0 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b1 = strictlySortedSinglyLinkedList0.repOK();
    strictlySortedSinglyLinkedList0.size = 1;
    strictlySortedSinglyLinkedList0.size = 0;
    tp2.IPBan iPBan6 = null;
    boolean b7 = strictlySortedSinglyLinkedList0.add(iPBan6);
    tp2.Node node8 = strictlySortedSinglyLinkedList0.header;
    int i9 = strictlySortedSinglyLinkedList0.getSize();
    boolean b10 = strictlySortedSinglyLinkedList0.isEmpty();
    tp2.SinglyLinkedList singlyLinkedList11 = new tp2.SinglyLinkedList();
    int i12 = singlyLinkedList11.getSize();
    tp2.IP iP17 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i18 = iP17.getSecond();
    java.lang.Integer i19 = iP17.getFourth();
    singlyLinkedList11.add(iP17);
    tp2.IP iP22 = singlyLinkedList11.get(5);
    tp2.IP iP27 = new tp2.IP((java.lang.Integer)138, (java.lang.Integer)(-2147483648), (java.lang.Integer)160, (java.lang.Integer)15);
    tp2.IPBan iPBan29 = new tp2.IPBan(iP27, (java.lang.Long)0L);
    singlyLinkedList11.add(iP27);
    // The following exception was thrown during execution in test generation
    try {
      boolean b31 = strictlySortedSinglyLinkedList0.containsIP(iP27);
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
    org.junit.Assert.assertNotNull(node8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i18 + "' != '" + (-1)+ "'", i18.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i19 + "' != '" + 100+ "'", i19.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP22);

  }

  @Test
  public void test391() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test391"); }


    int i1 = java.lang.Integer.highestOneBit((-473812921));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == (-2147483648));

  }

  @Test
  public void test392() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test392"); }


    int i2 = java.lang.Integer.min(1392382846, 243269647);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 243269647);

  }

  @Test
  public void test393() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test393"); }


    int i2 = java.lang.Integer.max(58, 353632304);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 353632304);

  }

  @Test
  public void test394() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test394"); }


    int i2 = java.lang.Integer.max(10175748, (-2030043137));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 10175748);

  }

  @Test
  public void test395() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test395"); }


    java.lang.Integer i1 = java.lang.Integer.getInteger("1000000000000000000000000000");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);

  }

  @Test
  public void test396() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test396"); }


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
    tp2.IP iP36 = null;
    boolean b37 = singlyLinkedList0.contains(iP36);
    boolean b38 = singlyLinkedList0.isEmpty();
    
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
    org.junit.Assert.assertTrue(b37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == false);

  }

  @Test
  public void test397() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test397"); }


    int i2 = java.lang.Integer.max(88, (-727559368));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 88);

  }

  @Test
  public void test398() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test398"); }


    java.lang.String str1 = java.lang.Integer.toHexString(805306369);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "30000001"+ "'", str1.equals("30000001"));

  }

  @Test
  public void test399() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test399"); }


    // The following exception was thrown during execution in test generation
    try {
      java.lang.Integer i1 = java.lang.Integer.decode("1111100011101101100");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test400() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test400"); }


    java.lang.Integer i1 = new java.lang.Integer((-1817903104));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + (-1817903104)+ "'", i1.equals((-1817903104)));

  }

  @Test
  public void test401() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test401"); }


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
    boolean b43 = singlyLinkedList0.repOK();
    int i44 = singlyLinkedList0.getSize();
    tp2.IP iP49 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP49.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan53 = new tp2.IPBan(iP49, (java.lang.Long)100L);
    tp2.IP iP54 = iPBan53.ip;
    iP54.setThird((java.lang.Integer)356246784);
    iP54.setFirst((java.lang.Integer)20);
    tp2.IP iP63 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP63.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan67 = new tp2.IPBan(iP63, (java.lang.Long)100L);
    tp2.IP iP72 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iPBan67.setIp(iP72);
    iP72.setSecond((java.lang.Integer)8);
    iP72.setThird((java.lang.Integer)1694498843);
    boolean b78 = iP54.equals((java.lang.Object)iP72);
    boolean b79 = singlyLinkedList0.contains(iP54);
    int i80 = singlyLinkedList0.getSize();
    
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
    org.junit.Assert.assertTrue(b43 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i44 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b78 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b79 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i80 == 0);

  }

  @Test
  public void test402() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test402"); }


    int i2 = java.lang.Integer.remainderUnsigned(920903680, 1242756);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 21484);

  }

  @Test
  public void test403() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test403"); }


    java.lang.String str2 = java.lang.Integer.toUnsignedString(8388919, 34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "69esv"+ "'", str2.equals("69esv"));

  }

  @Test
  public void test404() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test404"); }


    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList0 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b1 = strictlySortedSinglyLinkedList0.repOK();
    tp2.IP iP6 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    boolean b7 = strictlySortedSinglyLinkedList0.containsIP(iP6);
    tp2.Node node8 = strictlySortedSinglyLinkedList0.header;
    strictlySortedSinglyLinkedList0.size = 37469776;
    int i11 = strictlySortedSinglyLinkedList0.size;
    tp2.IPBan iPBan13 = strictlySortedSinglyLinkedList0.get(40000000);
    strictlySortedSinglyLinkedList0.size = 234881024;
    
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

  }

  @Test
  public void test405() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test405"); }


    int i1 = java.lang.Integer.highestOneBit(29824259);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 16777216);

  }

  @Test
  public void test406() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test406"); }


    int i2 = java.lang.Integer.max(749199016, 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 749199016);

  }

  @Test
  public void test407() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test407"); }


    int i1 = java.lang.Integer.reverseBytes((-1770491665));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == (-277841770));

  }

  @Test
  public void test408() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test408"); }


    int i2 = java.lang.Integer.divideUnsigned(46, 48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);

  }

  @Test
  public void test409() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test409"); }


    java.lang.String str1 = java.lang.Integer.toUnsignedString((-2147483600));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "2147483696"+ "'", str1.equals("2147483696"));

  }

  @Test
  public void test410() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test410"); }


    int i1 = java.lang.Integer.signum((-1429838673));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == (-1));

  }

  @Test
  public void test411() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test411"); }


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
    iP48.setFourth((java.lang.Integer)30);
    
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

  }

  @Test
  public void test412() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test412"); }


    int i2 = java.lang.Integer.min((-473825240), 624004);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == (-473825240));

  }

  @Test
  public void test413() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test413"); }


    int i1 = java.lang.Integer.parseUnsignedInt("10000");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 10000);

  }

  @Test
  public void test414() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test414"); }


    java.lang.String str1 = java.lang.Integer.toOctalString(65588);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "200064"+ "'", str1.equals("200064"));

  }

  @Test
  public void test415() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test415"); }


    int i2 = java.lang.Integer.compareUnsigned(16, 247671240);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == (-1));

  }

  @Test
  public void test416() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test416"); }


    int i1 = java.lang.Integer.numberOfTrailingZeros(12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 2);

  }

  @Test
  public void test417() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test417"); }


    java.lang.String str1 = java.lang.Integer.toOctalString(1700);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "3244"+ "'", str1.equals("3244"));

  }

  @Test
  public void test418() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test418"); }


    long long1 = java.lang.Integer.toUnsignedLong(6029312);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == 6029312L);

  }

  @Test
  public void test419() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test419"); }


    // The following exception was thrown during execution in test generation
    try {
      int i2 = java.lang.Integer.parseUnsignedInt("b000013", (-402653158));
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

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test420"); }


    int i1 = java.lang.Integer.numberOfLeadingZeros(3145730);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 10);

  }

  @Test
  public void test421() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test421"); }


    // The following exception was thrown during execution in test generation
    try {
      int i2 = java.lang.Integer.parseInt("1000000144", 35);
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

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test422"); }


    java.lang.Integer i2 = java.lang.Integer.getInteger("a0", 24576);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i2 + "' != '" + 24576+ "'", i2.equals(24576));

  }

  @Test
  public void test423() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test423"); }


    // The following exception was thrown during execution in test generation
    try {
      int i2 = java.lang.Integer.parseInt("289448", (-536870909));
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

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test424"); }


    tp2.IP iP4 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP4.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan8 = new tp2.IPBan(iP4, (java.lang.Long)100L);
    tp2.IP iP13 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP13.setFirst((java.lang.Integer)200);
    java.lang.Integer i16 = iP13.getFourth();
    iPBan8.setIp(iP13);
    tp2.SinglyLinkedList singlyLinkedList18 = new tp2.SinglyLinkedList();
    boolean b19 = singlyLinkedList18.repOK();
    tp2.IP iP21 = singlyLinkedList18.get(200);
    boolean b22 = singlyLinkedList18.repOK();
    int i23 = singlyLinkedList18.getSize();
    tp2.IP iP25 = singlyLinkedList18.get(2);
    tp2.IP iP30 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP30.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan34 = new tp2.IPBan(iP30, (java.lang.Long)100L);
    tp2.IP iP35 = iPBan34.ip;
    iP35.setThird((java.lang.Integer)356246784);
    singlyLinkedList18.add(iP35);
    iPBan8.setIp(iP35);
    java.lang.Long long40 = iPBan8.expires;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i16 + "' != '" + 100+ "'", i16.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long40 + "' != '" + 100L+ "'", long40.equals(100L));

  }

  @Test
  public void test425() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test425"); }


    int i2 = java.lang.Integer.max(5, 88);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 88);

  }

  @Test
  public void test426() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test426"); }


    int i1 = java.lang.Integer.numberOfLeadingZeros(32768);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 16);

  }

  @Test
  public void test427() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test427"); }


    int i2 = java.lang.Integer.compare(1251865216, 65588);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);

  }

  @Test
  public void test428() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test428"); }


    int i2 = java.lang.Integer.compare(15, 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);

  }

  @Test
  public void test429() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test429"); }


    int i1 = java.lang.Integer.lowestOneBit((-536870175));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 1);

  }

  @Test
  public void test430() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test430"); }


    // The following exception was thrown during execution in test generation
    try {
      int i2 = java.lang.Integer.parseInt("10000100", 749199016);
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

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test431"); }


    int i2 = java.lang.Integer.compareUnsigned(83886645, 217056);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);

  }

  @Test
  public void test432() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test432"); }


    long long1 = java.lang.Integer.toUnsignedLong(49308);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == 49308L);

  }

  @Test
  public void test433() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test433"); }


    java.lang.Integer i2 = java.lang.Integer.getInteger("16777216", 402653440);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i2 + "' != '" + 402653440+ "'", i2.equals(402653440));

  }

  @Test
  public void test434() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test434"); }


    int i2 = java.lang.Integer.divideUnsigned(170, 475);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);

  }

  @Test
  public void test435() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test435"); }


    int i2 = java.lang.Integer.max(0, 738197504);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 738197504);

  }

  @Test
  public void test436() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test436"); }


    java.lang.String str2 = java.lang.Integer.toUnsignedString(0, (-2113929216));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "0"+ "'", str2.equals("0"));

  }

  @Test
  public void test437() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test437"); }


    int i2 = java.lang.Integer.compare((-2147483641), 111);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == (-1));

  }

  @Test
  public void test438() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test438"); }


    int i2 = java.lang.Integer.max(2013265928, 176016000);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 2013265928);

  }

  @Test
  public void test439() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test439"); }


    java.lang.Integer i1 = java.lang.Integer.getInteger("44000000");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);

  }

  @Test
  public void test440() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test440"); }


    // The following exception was thrown during execution in test generation
    try {
      int i2 = java.lang.Integer.parseInt("f2", 64314);
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

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test441"); }


    int i1 = java.lang.Integer.numberOfLeadingZeros(42382);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 16);

  }

  @Test
  public void test442() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test442"); }


    int i1 = java.lang.Integer.reverseBytes(37883472);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 1343111682);

  }

  @Test
  public void test443() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test443"); }


    // The following exception was thrown during execution in test generation
    try {
      java.lang.Integer i2 = java.lang.Integer.valueOf("1743554", 1694498816);
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test444() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test444"); }


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
    iPBan9.setExpires((java.lang.Long)12L);
    java.lang.Long long38 = iPBan9.getExpires();
    
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
    org.junit.Assert.assertTrue("'" + long38 + "' != '" + 12L+ "'", long38.equals(12L));

  }

  @Test
  public void test445() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test445"); }


    int i1 = java.lang.Integer.reverseBytes(4103436);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 211631616);

  }

  @Test
  public void test446() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test446"); }


    int i2 = java.lang.Integer.compare(6695043, 20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);

  }

  @Test
  public void test447() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test447"); }


    // The following exception was thrown during execution in test generation
    try {
      java.lang.Integer i2 = java.lang.Integer.valueOf("", 624004);
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test448() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test448"); }


    int i1 = java.lang.Integer.numberOfLeadingZeros(62079);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 16);

  }

  @Test
  public void test449() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test449"); }


    int i1 = java.lang.Integer.numberOfTrailingZeros(2127069002);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 1);

  }

  @Test
  public void test450() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test450"); }


    int i2 = java.lang.Integer.max(51756492, 5020);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 51756492);

  }

  @Test
  public void test451() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test451"); }


    int i1 = java.lang.Integer.highestOneBit(118840512);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 67108864);

  }

  @Test
  public void test452() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test452"); }


    int i2 = java.lang.Integer.compareUnsigned(1140850688, 1392382846);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == (-1));

  }

  @Test
  public void test453() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test453"); }


    java.lang.String str1 = java.lang.Integer.toOctalString(8192);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "20000"+ "'", str1.equals("20000"));

  }

  @Test
  public void test454() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test454"); }


    int i1 = java.lang.Integer.highestOneBit((-402653184));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == (-2147483648));

  }

  @Test
  public void test455() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test455"); }


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
    tp2.IP iP20 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP20.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan24 = new tp2.IPBan(iP20, (java.lang.Long)100L);
    tp2.IP iP25 = iPBan24.ip;
    tp2.IP iP26 = iPBan24.getIp();
    java.lang.Integer i27 = null;
    iP26.setFirst(i27);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList29 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b30 = strictlySortedSinglyLinkedList29.repOK();
    tp2.IP iP35 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i36 = iP35.getSecond();
    iP35.setFirst((java.lang.Integer)11001000);
    iP35.setFirst((java.lang.Integer)(-2147483648));
    boolean b41 = strictlySortedSinglyLinkedList29.removeFromIP(iP35);
    boolean b42 = iP26.equals((java.lang.Object)strictlySortedSinglyLinkedList29);
    tp2.IP iP47 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    iP47.setFirst((java.lang.Integer)200);
    tp2.IPBan iPBan51 = new tp2.IPBan(iP47, (java.lang.Long)100L);
    boolean b52 = strictlySortedSinglyLinkedList29.removeFromIP(iP47);
    java.lang.Integer i53 = iP47.getFirst();
    iP47.setFirst((java.lang.Integer)0);
    iP47.setFourth((java.lang.Integer)541065219);
    singlyLinkedList0.add(iP47);
    java.lang.Integer i59 = iP47.getThird();
    
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
    org.junit.Assert.assertNotNull(iP25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i36 + "' != '" + (-1)+ "'", i36.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b52 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i53 + "' != '" + 200+ "'", i53.equals(200));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i59 + "' != '" + (-1)+ "'", i59.equals((-1)));

  }

  @Test
  public void test456() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test456"); }


    int i1 = java.lang.Integer.lowestOneBit(8650752);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 262144);

  }

  @Test
  public void test457() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test457"); }


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
    tp2.IP iP20 = iPBan14.getIp();
    iP20.setFourth((java.lang.Integer)3801088);
    
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
    org.junit.Assert.assertNotNull(iP20);

  }

  @Test
  public void test458() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test458"); }


    int i2 = java.lang.Integer.divideUnsigned((-1062740994), 40004017);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 80);

  }

  @Test
  public void test459() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test459"); }


    int i2 = java.lang.Integer.compareUnsigned((-1567422464), 8389120);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);

  }

  @Test
  public void test460() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test460"); }


    int i1 = java.lang.Integer.lowestOneBit(51756250);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 2);

  }

  @Test
  public void test461() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test461"); }


    int i2 = java.lang.Integer.rotateLeft((-1060148736), (-1063633290));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == (-2144324646));

  }

  @Test
  public void test462() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test462"); }


    java.lang.String str1 = java.lang.Integer.toOctalString(3014656);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "13400000"+ "'", str1.equals("13400000"));

  }

  @Test
  public void test463() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test463"); }


    int i1 = java.lang.Integer.reverse((-1610606592));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 1572869);

  }

  @Test
  public void test464() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test464"); }


    java.lang.Integer i2 = java.lang.Integer.getInteger("e80000", (java.lang.Integer)920903680);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i2 + "' != '" + 920903680+ "'", i2.equals(920903680));

  }

  @Test
  public void test465() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test465"); }


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
    iPBan33.setExpires((java.lang.Long)(-1L));
    
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

  }

  @Test
  public void test466() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test466"); }


    // The following exception was thrown during execution in test generation
    try {
      int i1 = java.lang.Integer.parseUnsignedInt("11010110010100000000000111011100");
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

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test467"); }


    int i1 = java.lang.Integer.highestOneBit(671088640);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 536870912);

  }

  @Test
  public void test468() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test468"); }


    java.lang.String str1 = java.lang.Integer.toUnsignedString(32768);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "32768"+ "'", str1.equals("32768"));

  }

  @Test
  public void test469() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test469"); }


    tp2.SinglyLinkedList singlyLinkedList0 = new tp2.SinglyLinkedList();
    boolean b1 = singlyLinkedList0.repOK();
    tp2.IP iP3 = singlyLinkedList0.get(200);
    boolean b4 = singlyLinkedList0.isEmpty();
    boolean b5 = singlyLinkedList0.repOK();
    boolean b6 = singlyLinkedList0.repOK();
    int i7 = singlyLinkedList0.getSize();
    boolean b8 = singlyLinkedList0.isEmpty();
    int i9 = singlyLinkedList0.getSize();
    int i10 = singlyLinkedList0.getSize();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList11 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b12 = strictlySortedSinglyLinkedList11.repOK();
    tp2.IP iP17 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    boolean b18 = strictlySortedSinglyLinkedList11.containsIP(iP17);
    int i19 = strictlySortedSinglyLinkedList11.getSize();
    int i20 = strictlySortedSinglyLinkedList11.size;
    tp2.IP iP25 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i26 = iP25.getSecond();
    tp2.SinglyLinkedList singlyLinkedList27 = new tp2.SinglyLinkedList();
    boolean b28 = singlyLinkedList27.repOK();
    boolean b29 = iP25.equals((java.lang.Object)b28);
    boolean b30 = strictlySortedSinglyLinkedList11.removeFromIP(iP25);
    int i31 = strictlySortedSinglyLinkedList11.getSize();
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
    iP46.setThird((java.lang.Integer)(-2));
    iP46.setSecond((java.lang.Integer)96);
    boolean b58 = strictlySortedSinglyLinkedList11.removeFromIP(iP46);
    boolean b59 = singlyLinkedList0.remove(iP46);
    boolean b60 = singlyLinkedList0.repOK();
    
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
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i26 + "' != '" + (-1)+ "'", i26.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i31 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i47 + "' != '" + 100+ "'", i47.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i48 + "' != '" + 100+ "'", i48.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b58 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b59 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b60 == true);

  }

  @Test
  public void test470() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test470"); }


    java.lang.Integer i2 = java.lang.Integer.getInteger("1000000000", (java.lang.Integer)662700032);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i2 + "' != '" + 662700032+ "'", i2.equals(662700032));

  }

  @Test
  public void test471() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test471"); }


    java.lang.Integer i2 = java.lang.Integer.getInteger("5020", (java.lang.Integer)83886645);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i2 + "' != '" + 83886645+ "'", i2.equals(83886645));

  }

  @Test
  public void test472() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test472"); }


    int i1 = java.lang.Integer.reverse(19531250);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 1335907456);

  }

  @Test
  public void test473() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test473"); }


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
    int i30 = singlyLinkedList0.getSize();
    
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
    org.junit.Assert.assertTrue(i30 == 0);

  }

  @Test
  public void test474() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test474"); }


    int i2 = java.lang.Integer.compareUnsigned(0, (-1879048192));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == (-1));

  }

  @Test
  public void test475() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test475"); }


    int i2 = java.lang.Integer.min(5888, 6034312);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 5888);

  }

  @Test
  public void test476() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test476"); }


    java.lang.Integer i1 = java.lang.Integer.valueOf(1073741825);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 1073741825+ "'", i1.equals(1073741825));

  }

  @Test
  public void test477() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test477"); }


    java.lang.Integer i2 = java.lang.Integer.getInteger("2939328", (java.lang.Integer)(-2144796672));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i2 + "' != '" + (-2144796672)+ "'", i2.equals((-2144796672)));

  }

  @Test
  public void test478() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test478"); }


    java.lang.String str1 = java.lang.Integer.toOctalString(45156032);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "254203300"+ "'", str1.equals("254203300"));

  }

  @Test
  public void test479() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test479"); }


    int i1 = java.lang.Integer.reverse(234893312);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 786544);

  }

  @Test
  public void test480() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test480"); }


    int i2 = java.lang.Integer.remainderUnsigned(356246784, 57347);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 7220);

  }

  @Test
  public void test481() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test481"); }


    java.lang.String str1 = java.lang.Integer.toUnsignedString(1391589);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "1391589"+ "'", str1.equals("1391589"));

  }

  @Test
  public void test482() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test482"); }


    int i2 = java.lang.Integer.compareUnsigned(2146566144, 311647600);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);

  }

  @Test
  public void test483() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test483"); }


    int i2 = java.lang.Integer.rotateRight((-1062740992), 99614720);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == (-1062740992));

  }

  @Test
  public void test484() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test484"); }


    int i2 = java.lang.Integer.sum(2273280, (-1817903104));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == (-1815629824));

  }

  @Test
  public void test485() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test485"); }


    java.lang.Integer i1 = java.lang.Integer.getInteger("65560");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);

  }

  @Test
  public void test486() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test486"); }


    int i1 = java.lang.Integer.signum((-1063633290));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == (-1));

  }

  @Test
  public void test487() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test487"); }


    int i2 = java.lang.Integer.compareUnsigned((-1073741817), (-277841770));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == (-1));

  }

  @Test
  public void test488() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test488"); }


    // The following exception was thrown during execution in test generation
    try {
      int i2 = java.lang.Integer.parseInt("d80000a2", 36);
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

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test489"); }


    java.lang.Integer i1 = java.lang.Integer.valueOf(5244416);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 5244416+ "'", i1.equals(5244416));

  }

  @Test
  public void test490() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test490"); }


    // The following exception was thrown during execution in test generation
    try {
      java.lang.Integer i1 = java.lang.Integer.valueOf("110100000000000010000010010");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test491() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test491"); }


    // The following exception was thrown during execution in test generation
    try {
      int i2 = java.lang.Integer.parseInt("13", 1074135041);
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

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test492"); }


    // The following exception was thrown during execution in test generation
    try {
      java.lang.Integer i2 = java.lang.Integer.valueOf("11100000000000000000000000000011", 31);
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test493() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test493"); }


    int i2 = java.lang.Integer.rotateRight(1308183544, 8388919);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == (-224923493));

  }

  @Test
  public void test494() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test494"); }


    int i1 = java.lang.Integer.reverse(88);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 436207616);

  }

  @Test
  public void test495() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test495"); }


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
    strictlySortedSinglyLinkedList0.size = 1700;
    int i66 = strictlySortedSinglyLinkedList0.getSize();
    
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
    org.junit.Assert.assertTrue(i66 == 1700);

  }

  @Test
  public void test496() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test496"); }


    int i2 = java.lang.Integer.divideUnsigned(20481, 11001001);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);

  }

  @Test
  public void test497() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test497"); }


    java.lang.Integer i2 = java.lang.Integer.getInteger("10010", 109051936);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i2 + "' != '" + 109051936+ "'", i2.equals(109051936));

  }

  @Test
  public void test498() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test498"); }


    java.lang.Integer i1 = new java.lang.Integer("10");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 10+ "'", i1.equals(10));

  }

  @Test
  public void test499() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test499"); }


    java.lang.String str1 = java.lang.Integer.toUnsignedString(217056);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "217056"+ "'", str1.equals("217056"));

  }

  @Test
  public void test500() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test500"); }


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
    strictlySortedSinglyLinkedList0.size = 6034312;
    
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

  }

}
