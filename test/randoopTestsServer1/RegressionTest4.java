package randoopTestsServer1;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest4 {

  public static boolean debug = false;

  @Test
  public void test01() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test01"); }


    int i2 = java.lang.Integer.sum(118047616, (-1118568448));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == (-1000520832));

  }

  @Test
  public void test02() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test02"); }


    tp2.IP iP4 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList5 = new tp2.SinglyLinkedList();
    boolean b6 = iP4.equals((java.lang.Object)singlyLinkedList5);
    tp2.Server server7 = new tp2.Server();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList8 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP13 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b14 = strictlySortedSinglyLinkedList8.containsIP(iP13);
    java.lang.Integer i15 = iP13.getFourth();
    boolean b16 = server7.addException(iP13);
    tp2.ITime iTime17 = null;
    server7.setTime(iTime17);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList19 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP24 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b25 = strictlySortedSinglyLinkedList19.containsIP(iP24);
    boolean b26 = server7.removeException(iP24);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList27 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP32 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b33 = strictlySortedSinglyLinkedList27.containsIP(iP32);
    iP32.setFirst((java.lang.Integer)0);
    java.lang.Integer i36 = iP32.getSecond();
    iP32.setFourth((java.lang.Integer)83886146);
    iP32.setFourth((java.lang.Integer)83886146);
    java.lang.Integer i41 = iP32.getFirst();
    boolean b42 = server7.removeBan(iP32);
    tp2.Server server43 = new tp2.Server();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList44 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP49 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b50 = strictlySortedSinglyLinkedList44.containsIP(iP49);
    tp2.IP iP55 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList56 = new tp2.SinglyLinkedList();
    boolean b57 = iP55.equals((java.lang.Object)singlyLinkedList56);
    java.lang.Integer i58 = iP55.getThird();
    boolean b59 = strictlySortedSinglyLinkedList44.removeFromIP(iP55);
    boolean b60 = server43.removeException(iP55);
    server43.update();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList62 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP67 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b68 = strictlySortedSinglyLinkedList62.containsIP(iP67);
    iP67.setSecond((java.lang.Integer)(-2147483638));
    java.lang.Integer i71 = iP67.getFourth();
    java.lang.Integer i72 = iP67.getFirst();
    iP67.setFirst((java.lang.Integer)20971536);
    boolean b75 = server43.addException(iP67);
    tp2.IPBan iPBan77 = new tp2.IPBan(iP67, (java.lang.Long)0L);
    iP67.setSecond((java.lang.Integer)(-1674030564));
    boolean b80 = server7.connect(iP67);
    singlyLinkedList5.add(iP67);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i15 + "' != '" + 10+ "'", i15.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i36 + "' != '" + 100+ "'", i36.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i41 + "' != '" + 0+ "'", i41.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b50 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b57 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i58 + "' != '" + 167772288+ "'", i58.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b59 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b60 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b68 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i71 + "' != '" + 10+ "'", i71.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i72 + "' != '" + (-2147483638)+ "'", i72.equals((-2147483638)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b75 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b80 == true);

  }

  @Test
  public void test03() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test03"); }


    int i1 = java.lang.Integer.signum(153466587);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 1);

  }

  @Test
  public void test04() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test04"); }


    tp2.IP iP4 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList5 = new tp2.SinglyLinkedList();
    boolean b6 = iP4.equals((java.lang.Object)singlyLinkedList5);
    tp2.IP iP8 = singlyLinkedList5.get(4);
    tp2.SinglyLinkedList singlyLinkedList9 = new tp2.SinglyLinkedList();
    int i10 = singlyLinkedList9.getSize();
    tp2.IP iP11 = null;
    singlyLinkedList9.add(iP11);
    tp2.IP iP17 = new tp2.IP((java.lang.Integer)10, (java.lang.Integer)10, (java.lang.Integer)1, (java.lang.Integer)10);
    singlyLinkedList9.add(iP17);
    boolean b19 = singlyLinkedList5.contains(iP17);
    tp2.SinglyLinkedList singlyLinkedList20 = new tp2.SinglyLinkedList();
    boolean b21 = singlyLinkedList20.isEmpty();
    tp2.IP iP23 = singlyLinkedList20.get(0);
    int i24 = singlyLinkedList20.getSize();
    tp2.Server server25 = new tp2.Server();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList26 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP31 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b32 = strictlySortedSinglyLinkedList26.containsIP(iP31);
    tp2.IP iP37 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList38 = new tp2.SinglyLinkedList();
    boolean b39 = iP37.equals((java.lang.Object)singlyLinkedList38);
    java.lang.Integer i40 = iP37.getThird();
    boolean b41 = strictlySortedSinglyLinkedList26.removeFromIP(iP37);
    boolean b42 = server25.removeException(iP37);
    server25.update();
    tp2.ITime iTime44 = null;
    server25.setTime(iTime44);
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
    tp2.IPBan iPBan72 = strictlySortedSinglyLinkedList64.get((-1));
    tp2.IP iP77 = new tp2.IP((java.lang.Integer)10, (java.lang.Integer)10, (java.lang.Integer)1, (java.lang.Integer)10);
    tp2.IPBan iPBan79 = new tp2.IPBan(iP77, (java.lang.Long)100L);
    boolean b80 = strictlySortedSinglyLinkedList64.removeFromIP(iP77);
    boolean b81 = server46.removeBan(iP77);
    boolean b82 = server25.addException(iP77);
    boolean b83 = singlyLinkedList20.remove(iP77);
    singlyLinkedList5.add(iP77);
    tp2.SinglyLinkedList singlyLinkedList85 = new tp2.SinglyLinkedList();
    boolean b86 = singlyLinkedList85.isEmpty();
    boolean b87 = singlyLinkedList85.isEmpty();
    int i88 = singlyLinkedList85.getSize();
    tp2.IP iP90 = singlyLinkedList85.get(100);
    tp2.IP iP95 = new tp2.IP((java.lang.Integer)67109184, (java.lang.Integer)120000020, (java.lang.Integer)67109184, (java.lang.Integer)20971536);
    java.lang.Integer i96 = iP95.getFirst();
    singlyLinkedList85.add(iP95);
    boolean b98 = singlyLinkedList5.remove(iP95);
    java.lang.Integer i99 = iP95.getSecond();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i40 + "' != '" + 167772288+ "'", i40.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == false);
    
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
    org.junit.Assert.assertNull(iPBan72);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b80 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b81 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b82 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b83 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b86 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b87 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i88 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP90);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i96 + "' != '" + 67109184+ "'", i96.equals(67109184));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b98 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i99 + "' != '" + 120000020+ "'", i99.equals(120000020));

  }

  @Test
  public void test05() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test05"); }


    // The following exception was thrown during execution in test generation
    try {
      int i2 = java.lang.Integer.remainderUnsigned(238702, 0);
      org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException");
    } catch (java.lang.ArithmeticException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArithmeticException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test06() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test06"); }


    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList0 = new tp2.StrictlySortedSinglyLinkedList();
    int i1 = strictlySortedSinglyLinkedList0.getSize();
    boolean b2 = strictlySortedSinglyLinkedList0.isEmpty();
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
    tp2.IPBan iPBan24 = strictlySortedSinglyLinkedList3.get((-2147483648));
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList25 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b26 = strictlySortedSinglyLinkedList25.isEmpty();
    tp2.IP iP31 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b32 = strictlySortedSinglyLinkedList25.removeFromIP(iP31);
    tp2.IP iP37 = new tp2.IP((java.lang.Integer)10, (java.lang.Integer)10, (java.lang.Integer)1, (java.lang.Integer)10);
    tp2.IPBan iPBan39 = new tp2.IPBan(iP37, (java.lang.Long)100L);
    boolean b40 = strictlySortedSinglyLinkedList25.contains(iPBan39);
    boolean b41 = strictlySortedSinglyLinkedList3.add(iPBan39);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList42 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP43 = null;
    tp2.IPBan iPBan45 = new tp2.IPBan(iP43, (java.lang.Long)0L);
    boolean b46 = strictlySortedSinglyLinkedList42.contains(iPBan45);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList47 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP52 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b53 = strictlySortedSinglyLinkedList47.containsIP(iP52);
    iP52.setFirst((java.lang.Integer)0);
    java.lang.Integer i56 = iP52.getSecond();
    iPBan45.setIp(iP52);
    tp2.Server server58 = new tp2.Server();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList59 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP64 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b65 = strictlySortedSinglyLinkedList59.containsIP(iP64);
    tp2.IP iP70 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList71 = new tp2.SinglyLinkedList();
    boolean b72 = iP70.equals((java.lang.Object)singlyLinkedList71);
    java.lang.Integer i73 = iP70.getThird();
    boolean b74 = strictlySortedSinglyLinkedList59.removeFromIP(iP70);
    boolean b75 = server58.removeException(iP70);
    iPBan45.setIp(iP70);
    tp2.IP iP77 = iPBan45.getIp();
    java.lang.Long long78 = iPBan45.getExpires();
    boolean b79 = strictlySortedSinglyLinkedList3.add(iPBan45);
    iPBan45.setExpires((java.lang.Long)25L);
    iPBan45.setExpires((java.lang.Long)8L);
    boolean b84 = strictlySortedSinglyLinkedList0.add(iPBan45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
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
    org.junit.Assert.assertTrue(b26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b46 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b53 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i56 + "' != '" + 100+ "'", i56.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b65 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b72 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i73 + "' != '" + 167772288+ "'", i73.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b74 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b75 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP77);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long78 + "' != '" + 0L+ "'", long78.equals(0L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b79 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b84 == true);

  }

  @Test
  public void test07() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test07"); }


    java.lang.String str1 = java.lang.Integer.toHexString(536870912);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "20000000"+ "'", str1.equals("20000000"));

  }

  @Test
  public void test08() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test08"); }


    tp2.IP iP0 = null;
    tp2.IPBan iPBan2 = new tp2.IPBan(iP0, (java.lang.Long)0L);
    tp2.IP iP3 = iPBan2.getIp();
    java.lang.Integer i4 = iP3.getThird();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i4 + "' != '" + 0+ "'", i4.equals(0));

  }

  @Test
  public void test09() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test09"); }


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
    boolean b50 = server0.bansOkTime();
    
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
    org.junit.Assert.assertTrue(b50 == true);

  }

  @Test
  public void test10() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test10"); }


    tp2.IP iP4 = new tp2.IP((java.lang.Integer)67112960, (java.lang.Integer)81400010, (java.lang.Integer)11534592, (java.lang.Integer)18875478);

  }

  @Test
  public void test11() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test11"); }


    tp2.Server server0 = new tp2.Server();
    server0.update();
    boolean b2 = server0.bansOkTime();
    server0.update();
    boolean b4 = server0.notSharedElements();
    tp2.IP iP9 = new tp2.IP((java.lang.Integer)10941, (java.lang.Integer)953355, (java.lang.Integer)2147483647, (java.lang.Integer)83886146);
    boolean b10 = server0.removeException(iP9);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList11 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP16 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b17 = strictlySortedSinglyLinkedList11.containsIP(iP16);
    tp2.IP iP18 = null;
    tp2.IPBan iPBan20 = new tp2.IPBan(iP18, (java.lang.Long)(-1L));
    boolean b21 = strictlySortedSinglyLinkedList11.contains(iPBan20);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList22 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP27 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b28 = strictlySortedSinglyLinkedList22.containsIP(iP27);
    tp2.IPBan iPBan30 = strictlySortedSinglyLinkedList22.get((-1));
    boolean b31 = strictlySortedSinglyLinkedList22.isEmpty();
    tp2.IP iP32 = null;
    tp2.IPBan iPBan34 = new tp2.IPBan(iP32, (java.lang.Long)(-1L));
    boolean b35 = strictlySortedSinglyLinkedList22.contains(iPBan34);
    boolean b36 = strictlySortedSinglyLinkedList11.add(iPBan34);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList37 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b38 = strictlySortedSinglyLinkedList37.isEmpty();
    tp2.IP iP43 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b44 = strictlySortedSinglyLinkedList37.removeFromIP(iP43);
    boolean b45 = strictlySortedSinglyLinkedList11.removeFromIP(iP43);
    boolean b46 = server0.addException(iP43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iPBan30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b46 == true);

  }

  @Test
  public void test12() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test12"); }


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
    tp2.SinglyLinkedList singlyLinkedList38 = new tp2.SinglyLinkedList();
    int i39 = singlyLinkedList38.getSize();
    tp2.IP iP40 = null;
    singlyLinkedList38.add(iP40);
    tp2.IP iP46 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b47 = singlyLinkedList38.contains(iP46);
    iP46.setFirst((java.lang.Integer)(-2147483638));
    boolean b50 = strictlySortedSinglyLinkedList0.removeFromIP(iP46);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList51 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP56 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b57 = strictlySortedSinglyLinkedList51.containsIP(iP56);
    tp2.IPBan iPBan59 = strictlySortedSinglyLinkedList51.get((-1));
    tp2.IP iP64 = new tp2.IP((java.lang.Integer)10, (java.lang.Integer)10, (java.lang.Integer)1, (java.lang.Integer)10);
    tp2.IPBan iPBan66 = new tp2.IPBan(iP64, (java.lang.Long)100L);
    boolean b67 = strictlySortedSinglyLinkedList51.removeFromIP(iP64);
    boolean b68 = strictlySortedSinglyLinkedList0.removeFromIP(iP64);
    
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
    org.junit.Assert.assertTrue(i39 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b47 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b50 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b57 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iPBan59);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b67 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b68 == false);

  }

  @Test
  public void test13() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test13"); }


    int i2 = java.lang.Integer.rotateRight(536870912, 117440512);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 536870912);

  }

  @Test
  public void test14() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test14"); }


    int i1 = java.lang.Integer.parseInt("1");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 1);

  }

  @Test
  public void test15() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test15"); }


    tp2.SinglyLinkedList singlyLinkedList0 = new tp2.SinglyLinkedList();
    int i1 = singlyLinkedList0.getSize();
    boolean b2 = singlyLinkedList0.isEmpty();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList3 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP8 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b9 = strictlySortedSinglyLinkedList3.containsIP(iP8);
    iP8.setSecond((java.lang.Integer)(-2147483638));
    tp2.IPBan iPBan13 = new tp2.IPBan(iP8, (java.lang.Long)0L);
    iP8.setFourth((java.lang.Integer)(-2147483638));
    boolean b16 = singlyLinkedList0.remove(iP8);
    int i17 = singlyLinkedList0.getSize();
    int i18 = singlyLinkedList0.getSize();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);

  }

  @Test
  public void test16() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test16"); }


    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList0 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP1 = null;
    tp2.IPBan iPBan3 = new tp2.IPBan(iP1, (java.lang.Long)0L);
    boolean b4 = strictlySortedSinglyLinkedList0.contains(iPBan3);
    tp2.IP iP9 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    java.lang.Integer i10 = iP9.getFourth();
    boolean b11 = strictlySortedSinglyLinkedList0.removeFromIP(iP9);
    boolean b12 = strictlySortedSinglyLinkedList0.isEmpty();
    int i13 = strictlySortedSinglyLinkedList0.getSize();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i10 + "' != '" + 10+ "'", i10.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);

  }

  @Test
  public void test17() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test17"); }


    int i1 = java.lang.Integer.lowestOneBit(1051328512);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 131072);

  }

  @Test
  public void test18() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test18"); }


    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList0 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b1 = strictlySortedSinglyLinkedList0.isEmpty();
    tp2.IPBan iPBan3 = strictlySortedSinglyLinkedList0.get((-2147483648));
    boolean b4 = strictlySortedSinglyLinkedList0.isEmpty();
    tp2.IP iP5 = null;
    tp2.IPBan iPBan7 = new tp2.IPBan(iP5, (java.lang.Long)(-1L));
    boolean b8 = strictlySortedSinglyLinkedList0.contains(iPBan7);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList9 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP10 = null;
    tp2.IPBan iPBan12 = new tp2.IPBan(iP10, (java.lang.Long)0L);
    boolean b13 = strictlySortedSinglyLinkedList9.contains(iPBan12);
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
    boolean b30 = strictlySortedSinglyLinkedList9.contains(iPBan17);
    iPBan17.setExpires((java.lang.Long)0L);
    boolean b33 = strictlySortedSinglyLinkedList0.add(iPBan17);
    tp2.IP iP34 = iPBan17.getIp();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iPBan3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i28 + "' != '" + 100+ "'", i28.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP34);

  }

  @Test
  public void test19() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test19"); }


    java.lang.Integer i1 = java.lang.Integer.getInteger("111001001110000111000010100");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);

  }

  @Test
  public void test20() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test20"); }


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
    tp2.IP iP51 = new tp2.IP((java.lang.Integer)10, (java.lang.Integer)10, (java.lang.Integer)1, (java.lang.Integer)10);
    tp2.IPBan iPBan53 = new tp2.IPBan(iP51, (java.lang.Long)100L);
    boolean b54 = server0.removeException(iP51);
    iP51.setFirst((java.lang.Integer)41943076);
    java.lang.Integer i57 = iP51.getSecond();
    
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
    org.junit.Assert.assertTrue(b54 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i57 + "' != '" + 10+ "'", i57.equals(10));

  }

  @Test
  public void test21() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test21"); }


    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList0 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b1 = strictlySortedSinglyLinkedList0.isEmpty();
    int i2 = strictlySortedSinglyLinkedList0.getSize();
    int i3 = strictlySortedSinglyLinkedList0.getSize();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);

  }

  @Test
  public void test22() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test22"); }


    int i2 = java.lang.Integer.remainderUnsigned(41943076, 1572956);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1046220);

  }

  @Test
  public void test23() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test23"); }


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
    tp2.IP iP39 = iPBan36.getIp();
    java.lang.Long long40 = iPBan36.getExpires();
    java.lang.Long long41 = iPBan36.getExpires();
    tp2.IP iP42 = iPBan36.getIp();
    tp2.IP iP43 = iPBan36.getIp();
    
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
    org.junit.Assert.assertNotNull(iP39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long40 + "' != '" + 100L+ "'", long40.equals(100L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long41 + "' != '" + 100L+ "'", long41.equals(100L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP43);

  }

  @Test
  public void test24() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test24"); }


    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList0 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b1 = strictlySortedSinglyLinkedList0.isEmpty();
    tp2.IPBan iPBan3 = strictlySortedSinglyLinkedList0.get((-2147483648));
    boolean b4 = strictlySortedSinglyLinkedList0.isEmpty();
    tp2.IP iP5 = null;
    tp2.IPBan iPBan7 = new tp2.IPBan(iP5, (java.lang.Long)(-1L));
    boolean b8 = strictlySortedSinglyLinkedList0.contains(iPBan7);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList9 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP10 = null;
    tp2.IPBan iPBan12 = new tp2.IPBan(iP10, (java.lang.Long)0L);
    boolean b13 = strictlySortedSinglyLinkedList9.contains(iPBan12);
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
    boolean b30 = strictlySortedSinglyLinkedList9.contains(iPBan17);
    iPBan17.setExpires((java.lang.Long)0L);
    boolean b33 = strictlySortedSinglyLinkedList0.add(iPBan17);
    int i34 = strictlySortedSinglyLinkedList0.getSize();
    boolean b35 = strictlySortedSinglyLinkedList0.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iPBan3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i28 + "' != '" + 100+ "'", i28.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i34 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == false);

  }

  @Test
  public void test25() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test25"); }


    int i2 = java.lang.Integer.compare(12, 37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == (-1));

  }

  @Test
  public void test26() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test26"); }


    tp2.SinglyLinkedList singlyLinkedList0 = new tp2.SinglyLinkedList();
    int i1 = singlyLinkedList0.getSize();
    tp2.SinglyLinkedList singlyLinkedList2 = new tp2.SinglyLinkedList();
    int i3 = singlyLinkedList2.getSize();
    tp2.IP iP5 = singlyLinkedList2.get(10);
    tp2.IP iP10 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    singlyLinkedList2.add(iP10);
    iP10.setThird((java.lang.Integer)120000020);
    singlyLinkedList0.add(iP10);
    java.lang.Object obj15 = null;
    boolean b16 = iP10.equals(obj15);
    iP10.setSecond((java.lang.Integer)(-2147483636));
    iP10.setSecond((java.lang.Integer)6291456);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);

  }

  @Test
  public void test27() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test27"); }


    // The following exception was thrown during execution in test generation
    try {
      java.lang.Integer i2 = java.lang.Integer.valueOf("11011", 1107296261);
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test28() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test28"); }


    tp2.SinglyLinkedList singlyLinkedList0 = new tp2.SinglyLinkedList();
    boolean b1 = singlyLinkedList0.isEmpty();
    tp2.IP iP3 = singlyLinkedList0.get(0);
    boolean b4 = singlyLinkedList0.isEmpty();
    int i5 = singlyLinkedList0.getSize();
    tp2.IP iP10 = new tp2.IP((java.lang.Integer)2098176, (java.lang.Integer)6, (java.lang.Integer)2, (java.lang.Integer)2147483647);
    boolean b11 = singlyLinkedList0.contains(iP10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);

  }

  @Test
  public void test29() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test29"); }


    int i2 = java.lang.Integer.remainderUnsigned(167772288, 1045032);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 567168);

  }

  @Test
  public void test30() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test30"); }


    // The following exception was thrown during execution in test generation
    try {
      int i1 = java.lang.Integer.parseInt("2765702000");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test31() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test31"); }


    tp2.IP iP4 = new tp2.IP((java.lang.Integer)(-1979711360), (java.lang.Integer)22, (java.lang.Integer)50, (java.lang.Integer)64);

  }

  @Test
  public void test32() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test32"); }


    tp2.SinglyLinkedList singlyLinkedList0 = new tp2.SinglyLinkedList();
    boolean b1 = singlyLinkedList0.isEmpty();
    boolean b2 = singlyLinkedList0.isEmpty();
    int i3 = singlyLinkedList0.getSize();
    tp2.IP iP5 = singlyLinkedList0.get(100);
    int i6 = singlyLinkedList0.getSize();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);

  }

  @Test
  public void test33() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test33"); }


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
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList45 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP50 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b51 = strictlySortedSinglyLinkedList45.containsIP(iP50);
    iP50.setFirst((java.lang.Integer)0);
    java.lang.Integer i54 = iP50.getSecond();
    boolean b55 = server0.addException(iP50);
    tp2.Server server56 = new tp2.Server();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList57 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP62 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b63 = strictlySortedSinglyLinkedList57.containsIP(iP62);
    iP62.setSecond((java.lang.Integer)(-2147483638));
    java.lang.Integer i66 = iP62.getFourth();
    java.lang.Integer i67 = iP62.getFirst();
    boolean b68 = server56.connect(iP62);
    tp2.IP iP73 = new tp2.IP((java.lang.Integer)134217728, (java.lang.Integer)7, (java.lang.Integer)3, (java.lang.Integer)262144);
    boolean b74 = iP62.equals((java.lang.Object)3);
    iP62.setSecond((java.lang.Integer)6291456);
    boolean b77 = server0.removeBan(iP62);
    
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
    org.junit.Assert.assertTrue(b51 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i54 + "' != '" + 100+ "'", i54.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b55 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b63 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i66 + "' != '" + 10+ "'", i66.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i67 + "' != '" + (-2147483638)+ "'", i67.equals((-2147483638)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b68 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b74 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b77 == false);

  }

  @Test
  public void test34() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test34"); }


    // The following exception was thrown during execution in test generation
    try {
      java.lang.Integer i2 = java.lang.Integer.valueOf("2765702000", 41943072);
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test35() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test35"); }


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
    tp2.IP iP65 = singlyLinkedList0.get(512);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList66 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP71 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b72 = strictlySortedSinglyLinkedList66.containsIP(iP71);
    tp2.IPBan iPBan74 = strictlySortedSinglyLinkedList66.get((-1));
    boolean b75 = strictlySortedSinglyLinkedList66.isEmpty();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList76 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP81 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b82 = strictlySortedSinglyLinkedList76.containsIP(iP81);
    tp2.IP iP87 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList88 = new tp2.SinglyLinkedList();
    boolean b89 = iP87.equals((java.lang.Object)singlyLinkedList88);
    java.lang.Integer i90 = iP87.getThird();
    boolean b91 = strictlySortedSinglyLinkedList76.removeFromIP(iP87);
    boolean b92 = strictlySortedSinglyLinkedList66.removeFromIP(iP87);
    iP87.setFirst((java.lang.Integer)(-2147483638));
    iP87.setSecond((java.lang.Integer)1);
    boolean b97 = singlyLinkedList0.contains(iP87);
    java.lang.Integer i98 = iP87.getFourth();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b72 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iPBan74);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b75 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b82 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b89 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i90 + "' != '" + 167772288+ "'", i90.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b91 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b92 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b97 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i98 + "' != '" + 10+ "'", i98.equals(10));

  }

  @Test
  public void test36() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test36"); }


    int i2 = java.lang.Integer.sum(1126502400, 21884);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1126524284);

  }

  @Test
  public void test37() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test37"); }


    java.lang.String str1 = java.lang.Integer.toHexString(21884);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "557c"+ "'", str1.equals("557c"));

  }

  @Test
  public void test38() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test38"); }


    int i2 = java.lang.Integer.remainderUnsigned((-2147483636), 31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 14);

  }

  @Test
  public void test39() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test39"); }


    tp2.SinglyLinkedList singlyLinkedList0 = new tp2.SinglyLinkedList();
    int i1 = singlyLinkedList0.getSize();
    tp2.IP iP3 = singlyLinkedList0.get(10);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList4 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP9 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b10 = strictlySortedSinglyLinkedList4.containsIP(iP9);
    tp2.IP iP15 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList16 = new tp2.SinglyLinkedList();
    boolean b17 = iP15.equals((java.lang.Object)singlyLinkedList16);
    java.lang.Integer i18 = iP15.getThird();
    boolean b19 = strictlySortedSinglyLinkedList4.removeFromIP(iP15);
    tp2.SinglyLinkedList singlyLinkedList20 = new tp2.SinglyLinkedList();
    int i21 = singlyLinkedList20.getSize();
    tp2.IP iP22 = null;
    singlyLinkedList20.add(iP22);
    tp2.IP iP28 = new tp2.IP((java.lang.Integer)10, (java.lang.Integer)10, (java.lang.Integer)1, (java.lang.Integer)10);
    singlyLinkedList20.add(iP28);
    tp2.SinglyLinkedList singlyLinkedList30 = new tp2.SinglyLinkedList();
    int i31 = singlyLinkedList30.getSize();
    tp2.IP iP32 = null;
    singlyLinkedList30.add(iP32);
    tp2.IP iP38 = new tp2.IP((java.lang.Integer)10, (java.lang.Integer)10, (java.lang.Integer)1, (java.lang.Integer)10);
    singlyLinkedList30.add(iP38);
    singlyLinkedList20.add(iP38);
    boolean b41 = strictlySortedSinglyLinkedList4.containsIP(iP38);
    singlyLinkedList0.add(iP38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i18 + "' != '" + 167772288+ "'", i18.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i31 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == false);

  }

  @Test
  public void test40() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test40"); }


    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList0 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP5 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b6 = strictlySortedSinglyLinkedList0.containsIP(iP5);
    tp2.IPBan iPBan8 = strictlySortedSinglyLinkedList0.get((-1));
    boolean b9 = strictlySortedSinglyLinkedList0.isEmpty();
    tp2.IP iP10 = null;
    tp2.IPBan iPBan12 = new tp2.IPBan(iP10, (java.lang.Long)(-1L));
    boolean b13 = strictlySortedSinglyLinkedList0.contains(iPBan12);
    tp2.IPBan iPBan15 = strictlySortedSinglyLinkedList0.get(31);
    tp2.SinglyLinkedList singlyLinkedList16 = new tp2.SinglyLinkedList();
    int i17 = singlyLinkedList16.getSize();
    tp2.IP iP18 = null;
    singlyLinkedList16.add(iP18);
    tp2.IP iP24 = new tp2.IP((java.lang.Integer)10, (java.lang.Integer)10, (java.lang.Integer)1, (java.lang.Integer)10);
    singlyLinkedList16.add(iP24);
    tp2.SinglyLinkedList singlyLinkedList26 = new tp2.SinglyLinkedList();
    int i27 = singlyLinkedList26.getSize();
    tp2.IP iP28 = null;
    singlyLinkedList26.add(iP28);
    tp2.IP iP34 = new tp2.IP((java.lang.Integer)10, (java.lang.Integer)10, (java.lang.Integer)1, (java.lang.Integer)10);
    singlyLinkedList26.add(iP34);
    singlyLinkedList16.add(iP34);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList37 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP42 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b43 = strictlySortedSinglyLinkedList37.containsIP(iP42);
    iP42.setFirst((java.lang.Integer)0);
    java.lang.Integer i46 = iP42.getSecond();
    singlyLinkedList16.add(iP42);
    boolean b48 = strictlySortedSinglyLinkedList0.removeFromIP(iP42);
    boolean b49 = strictlySortedSinglyLinkedList0.isEmpty();
    int i50 = strictlySortedSinglyLinkedList0.getSize();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iPBan8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iPBan15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b43 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i46 + "' != '" + 100+ "'", i46.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b48 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b49 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i50 == 0);

  }

  @Test
  public void test41() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test41"); }


    int i1 = java.lang.Integer.numberOfTrailingZeros(1126524284);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 2);

  }

  @Test
  public void test42() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test42"); }


    // The following exception was thrown during execution in test generation
    try {
      java.lang.Integer i1 = java.lang.Integer.decode("20000000012");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test43() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test43"); }


    int i1 = java.lang.Integer.signum(22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 1);

  }

  @Test
  public void test44() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test44"); }


    tp2.SinglyLinkedList singlyLinkedList0 = new tp2.SinglyLinkedList();
    int i1 = singlyLinkedList0.getSize();
    tp2.IP iP2 = null;
    singlyLinkedList0.add(iP2);
    tp2.IP iP8 = new tp2.IP((java.lang.Integer)10, (java.lang.Integer)10, (java.lang.Integer)1, (java.lang.Integer)10);
    singlyLinkedList0.add(iP8);
    tp2.IP iP11 = singlyLinkedList0.get(1610612736);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList12 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP13 = null;
    tp2.IPBan iPBan15 = new tp2.IPBan(iP13, (java.lang.Long)0L);
    boolean b16 = strictlySortedSinglyLinkedList12.contains(iPBan15);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList17 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP22 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b23 = strictlySortedSinglyLinkedList17.containsIP(iP22);
    iP22.setFirst((java.lang.Integer)0);
    java.lang.Integer i26 = iP22.getSecond();
    iPBan15.setIp(iP22);
    tp2.Server server28 = new tp2.Server();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList29 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP34 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b35 = strictlySortedSinglyLinkedList29.containsIP(iP34);
    tp2.IP iP40 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList41 = new tp2.SinglyLinkedList();
    boolean b42 = iP40.equals((java.lang.Object)singlyLinkedList41);
    java.lang.Integer i43 = iP40.getThird();
    boolean b44 = strictlySortedSinglyLinkedList29.removeFromIP(iP40);
    boolean b45 = server28.removeException(iP40);
    iPBan15.setIp(iP40);
    tp2.IP iP47 = iPBan15.getIp();
    java.lang.Integer i48 = iP47.getSecond();
    boolean b49 = singlyLinkedList0.remove(iP47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i26 + "' != '" + 100+ "'", i26.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i43 + "' != '" + 167772288+ "'", i43.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i48 + "' != '" + 100+ "'", i48.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b49 == false);

  }

  @Test
  public void test45() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test45"); }


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
    int i21 = strictlySortedSinglyLinkedList0.getSize();
    tp2.IP iP22 = null;
    boolean b23 = strictlySortedSinglyLinkedList0.removeFromIP(iP22);
    
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
    org.junit.Assert.assertTrue(i21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);

  }

  @Test
  public void test46() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test46"); }


    tp2.SinglyLinkedList singlyLinkedList0 = new tp2.SinglyLinkedList();
    boolean b1 = singlyLinkedList0.isEmpty();
    boolean b2 = singlyLinkedList0.isEmpty();
    boolean b3 = singlyLinkedList0.isEmpty();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList4 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP9 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b10 = strictlySortedSinglyLinkedList4.containsIP(iP9);
    tp2.IPBan iPBan12 = strictlySortedSinglyLinkedList4.get((-1));
    tp2.IP iP17 = new tp2.IP((java.lang.Integer)10, (java.lang.Integer)10, (java.lang.Integer)1, (java.lang.Integer)10);
    tp2.IPBan iPBan19 = new tp2.IPBan(iP17, (java.lang.Long)100L);
    boolean b20 = strictlySortedSinglyLinkedList4.removeFromIP(iP17);
    tp2.IP iP25 = new tp2.IP((java.lang.Integer)10, (java.lang.Integer)10, (java.lang.Integer)1, (java.lang.Integer)10);
    tp2.IPBan iPBan27 = new tp2.IPBan(iP25, (java.lang.Long)100L);
    boolean b28 = strictlySortedSinglyLinkedList4.removeFromIP(iP25);
    singlyLinkedList0.add(iP25);
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
    server30.update();
    tp2.ITime iTime49 = null;
    server30.setTime(iTime49);
    tp2.IP iP55 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList56 = new tp2.SinglyLinkedList();
    boolean b57 = iP55.equals((java.lang.Object)singlyLinkedList56);
    iP55.setSecond((java.lang.Integer)2);
    boolean b60 = server30.removeBan(iP55);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList61 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b62 = strictlySortedSinglyLinkedList61.isEmpty();
    tp2.IP iP67 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b68 = strictlySortedSinglyLinkedList61.removeFromIP(iP67);
    iP67.setThird((java.lang.Integer)41943073);
    boolean b71 = server30.removeException(iP67);
    java.lang.Integer i72 = iP67.getSecond();
    iP67.setThird((java.lang.Integer)28);
    java.lang.Integer i75 = iP67.getFourth();
    boolean b76 = singlyLinkedList0.contains(iP67);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iPBan12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);
    
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
    org.junit.Assert.assertTrue(b57 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b60 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b62 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b68 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b71 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i72 + "' != '" + 100+ "'", i72.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i75 + "' != '" + 10+ "'", i75.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b76 == false);

  }

  @Test
  public void test47() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test47"); }


    int i2 = java.lang.Integer.rotateRight(512, 268);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 536870912);

  }

  @Test
  public void test48() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test48"); }


    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList0 = new tp2.StrictlySortedSinglyLinkedList();
    int i1 = strictlySortedSinglyLinkedList0.getSize();
    boolean b2 = strictlySortedSinglyLinkedList0.isEmpty();
    tp2.SinglyLinkedList singlyLinkedList3 = new tp2.SinglyLinkedList();
    int i4 = singlyLinkedList3.getSize();
    tp2.IP iP6 = singlyLinkedList3.get(10);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList7 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP12 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b13 = strictlySortedSinglyLinkedList7.containsIP(iP12);
    iP12.setFirst((java.lang.Integer)0);
    boolean b16 = singlyLinkedList3.remove(iP12);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList17 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP22 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b23 = strictlySortedSinglyLinkedList17.containsIP(iP22);
    tp2.IPBan iPBan25 = strictlySortedSinglyLinkedList17.get((-1));
    tp2.IP iP30 = new tp2.IP((java.lang.Integer)10, (java.lang.Integer)10, (java.lang.Integer)1, (java.lang.Integer)10);
    tp2.IPBan iPBan32 = new tp2.IPBan(iP30, (java.lang.Long)100L);
    boolean b33 = strictlySortedSinglyLinkedList17.removeFromIP(iP30);
    tp2.IP iP38 = new tp2.IP((java.lang.Integer)10, (java.lang.Integer)10, (java.lang.Integer)1, (java.lang.Integer)10);
    tp2.IPBan iPBan40 = new tp2.IPBan(iP38, (java.lang.Long)100L);
    boolean b41 = strictlySortedSinglyLinkedList17.removeFromIP(iP38);
    singlyLinkedList3.add(iP38);
    tp2.IP iP47 = new tp2.IP((java.lang.Integer)134217728, (java.lang.Integer)7, (java.lang.Integer)3, (java.lang.Integer)262144);
    boolean b48 = singlyLinkedList3.contains(iP47);
    boolean b49 = strictlySortedSinglyLinkedList0.removeFromIP(iP47);
    iP47.setFirst((java.lang.Integer)3691036);
    iP47.setSecond((java.lang.Integer)1051328512);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iPBan25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b48 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b49 == false);

  }

  @Test
  public void test49() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test49"); }


    java.lang.Integer i1 = new java.lang.Integer(40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 40+ "'", i1.equals(40));

  }

  @Test
  public void test50() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test50"); }


    int i1 = java.lang.Integer.lowestOneBit(40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 8);

  }

  @Test
  public void test51() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test51"); }


    // The following exception was thrown during execution in test generation
    try {
      int i2 = java.lang.Integer.parseUnsignedInt("a", 1107296325);
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test52() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test52"); }


    tp2.SinglyLinkedList singlyLinkedList0 = new tp2.SinglyLinkedList();
    int i1 = singlyLinkedList0.getSize();
    tp2.IP iP3 = singlyLinkedList0.get(10);
    boolean b4 = singlyLinkedList0.isEmpty();
    int i5 = singlyLinkedList0.getSize();
    boolean b6 = singlyLinkedList0.isEmpty();
    tp2.IP iP8 = singlyLinkedList0.get((-1879048192));
    int i9 = singlyLinkedList0.getSize();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);

  }

  @Test
  public void test53() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test53"); }


    int i1 = java.lang.Integer.numberOfTrailingZeros(173504);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 6);

  }

  @Test
  public void test54() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test54"); }


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
    iP25.setThird((java.lang.Integer)60000010);
    iP25.setSecond((java.lang.Integer)281);
    iP25.setFirst((java.lang.Integer)1051328512);
    
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

  }

  @Test
  public void test55() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test55"); }


    int i1 = java.lang.Integer.numberOfTrailingZeros((-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);

  }

  @Test
  public void test56() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test56"); }


    // The following exception was thrown during execution in test generation
    try {
      int i1 = java.lang.Integer.parseInt("101000000000000000001000000");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test57() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test57"); }


    java.lang.String str1 = java.lang.Integer.toHexString(41943107);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "2800043"+ "'", str1.equals("2800043"));

  }

  @Test
  public void test58() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test58"); }


    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList0 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b1 = strictlySortedSinglyLinkedList0.isEmpty();
    tp2.IPBan iPBan3 = strictlySortedSinglyLinkedList0.get((-2147483648));
    boolean b4 = strictlySortedSinglyLinkedList0.isEmpty();
    tp2.IP iP5 = null;
    tp2.IPBan iPBan7 = new tp2.IPBan(iP5, (java.lang.Long)(-1L));
    boolean b8 = strictlySortedSinglyLinkedList0.contains(iPBan7);
    tp2.SinglyLinkedList singlyLinkedList9 = new tp2.SinglyLinkedList();
    int i10 = singlyLinkedList9.getSize();
    tp2.IP iP12 = singlyLinkedList9.get(10);
    tp2.IP iP17 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    singlyLinkedList9.add(iP17);
    iP17.setThird((java.lang.Integer)120000020);
    iP17.setThird((java.lang.Integer)1000);
    iP17.setThird((java.lang.Integer)(-2147483648));
    iP17.setThird((java.lang.Integer)8388608);
    java.lang.Integer i27 = iP17.getThird();
    boolean b28 = strictlySortedSinglyLinkedList0.removeFromIP(iP17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iPBan3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i27 + "' != '" + 8388608+ "'", i27.equals(8388608));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);

  }

  @Test
  public void test59() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test59"); }


    int i2 = java.lang.Integer.rotateRight(64, 18875478);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 65536);

  }

  @Test
  public void test60() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test60"); }


    java.lang.Integer i0 = null;
    // The following exception was thrown during execution in test generation
    try {
      tp2.IP iP4 = new tp2.IP(i0, (java.lang.Integer)60000010, (java.lang.Integer)124, (java.lang.Integer)118047616);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test61() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test61"); }


    java.lang.String str2 = java.lang.Integer.toUnsignedString(2098176, 26214);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "2098176"+ "'", str2.equals("2098176"));

  }

  @Test
  public void test62() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test62"); }


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
    java.lang.Long long27 = iPBan3.getExpires();
    iPBan3.setExpires((java.lang.Long)2147483658L);
    tp2.IP iP30 = iPBan3.getIp();
    
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
    org.junit.Assert.assertTrue("'" + long27 + "' != '" + 100L+ "'", long27.equals(100L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP30);

  }

  @Test
  public void test63() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test63"); }


    int i1 = java.lang.Integer.parseUnsignedInt("2147546210");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == (-2147421086));

  }

  @Test
  public void test64() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test64"); }


    int i1 = java.lang.Integer.parseUnsignedInt("200410");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 200410);

  }

  @Test
  public void test65() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test65"); }


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
    tp2.IPBan iPBan48 = strictlySortedSinglyLinkedList0.get(953344);
    tp2.IPBan iPBan49 = null;
    // The following exception was thrown during execution in test generation
    try {
      boolean b50 = strictlySortedSinglyLinkedList0.contains(iPBan49);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
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
    org.junit.Assert.assertNull(iPBan48);

  }

  @Test
  public void test66() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test66"); }


    tp2.SinglyLinkedList singlyLinkedList0 = new tp2.SinglyLinkedList();
    int i1 = singlyLinkedList0.getSize();
    tp2.IP iP3 = singlyLinkedList0.get(10);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList4 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP9 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b10 = strictlySortedSinglyLinkedList4.containsIP(iP9);
    iP9.setFirst((java.lang.Integer)0);
    boolean b13 = singlyLinkedList0.remove(iP9);
    tp2.IP iP18 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList19 = new tp2.SinglyLinkedList();
    boolean b20 = iP18.equals((java.lang.Object)singlyLinkedList19);
    boolean b21 = singlyLinkedList0.remove(iP18);
    tp2.Server server22 = new tp2.Server();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList23 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP28 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b29 = strictlySortedSinglyLinkedList23.containsIP(iP28);
    tp2.IP iP34 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList35 = new tp2.SinglyLinkedList();
    boolean b36 = iP34.equals((java.lang.Object)singlyLinkedList35);
    java.lang.Integer i37 = iP34.getThird();
    boolean b38 = strictlySortedSinglyLinkedList23.removeFromIP(iP34);
    boolean b39 = server22.removeException(iP34);
    server22.update();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList41 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP46 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b47 = strictlySortedSinglyLinkedList41.containsIP(iP46);
    tp2.IP iP52 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList53 = new tp2.SinglyLinkedList();
    boolean b54 = iP52.equals((java.lang.Object)singlyLinkedList53);
    java.lang.Integer i55 = iP52.getThird();
    boolean b56 = strictlySortedSinglyLinkedList41.removeFromIP(iP52);
    boolean b58 = iP52.equals((java.lang.Object)0);
    java.lang.Integer i59 = iP52.getThird();
    java.lang.Integer i60 = iP52.getFirst();
    iP52.setFourth((java.lang.Integer)20971536);
    tp2.Server server63 = new tp2.Server();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList64 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP69 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b70 = strictlySortedSinglyLinkedList64.containsIP(iP69);
    java.lang.Integer i71 = iP69.getFourth();
    boolean b72 = server63.addException(iP69);
    boolean b73 = iP52.equals((java.lang.Object)iP69);
    boolean b74 = server22.connect(iP69);
    java.lang.Integer i75 = iP69.getFourth();
    iP69.setFirst((java.lang.Integer)2098192);
    boolean b78 = singlyLinkedList0.contains(iP69);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList79 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP84 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b85 = strictlySortedSinglyLinkedList79.containsIP(iP84);
    iP84.setSecond((java.lang.Integer)(-2147483638));
    iP84.setSecond((java.lang.Integer)167772288);
    boolean b90 = singlyLinkedList0.remove(iP84);
    
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
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i37 + "' != '" + 167772288+ "'", i37.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b47 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b54 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i55 + "' != '" + 167772288+ "'", i55.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b56 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b58 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i59 + "' != '" + 167772288+ "'", i59.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i60 + "' != '" + (-2147483638)+ "'", i60.equals((-2147483638)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b70 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i71 + "' != '" + 10+ "'", i71.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b72 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b73 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b74 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i75 + "' != '" + 10+ "'", i75.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b78 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b85 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b90 == false);

  }

  @Test
  public void test67() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test67"); }


    int i1 = java.lang.Integer.bitCount(3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 2);

  }

  @Test
  public void test68() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test68"); }


    int i1 = java.lang.Integer.bitCount((-1073741819));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 4);

  }

  @Test
  public void test69() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test69"); }


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
    boolean b48 = server0.bansOkTime();
    server0.update();
    tp2.Server server50 = new tp2.Server();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList51 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP56 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b57 = strictlySortedSinglyLinkedList51.containsIP(iP56);
    java.lang.Integer i58 = iP56.getFourth();
    boolean b59 = server50.addException(iP56);
    tp2.ITime iTime60 = null;
    server50.setTime(iTime60);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList62 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP67 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b68 = strictlySortedSinglyLinkedList62.containsIP(iP67);
    boolean b69 = server50.removeException(iP67);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList70 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP75 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b76 = strictlySortedSinglyLinkedList70.containsIP(iP75);
    iP75.setFirst((java.lang.Integer)0);
    java.lang.Integer i79 = iP75.getSecond();
    iP75.setFourth((java.lang.Integer)83886146);
    iP75.setFourth((java.lang.Integer)83886146);
    java.lang.Integer i84 = iP75.getFirst();
    boolean b85 = server50.removeBan(iP75);
    iP75.setSecond((java.lang.Integer)67108864);
    boolean b88 = server0.removeBan(iP75);
    tp2.ITime iTime89 = null;
    server0.setTime(iTime89);
    
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
    org.junit.Assert.assertTrue(b57 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i58 + "' != '" + 10+ "'", i58.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b59 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b68 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b69 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b76 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i79 + "' != '" + 100+ "'", i79.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i84 + "' != '" + 0+ "'", i84.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b85 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b88 == false);

  }

  @Test
  public void test70() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test70"); }


    int i2 = java.lang.Integer.compareUnsigned(128, (-1118568448));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == (-1));

  }

  @Test
  public void test71() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test71"); }


    java.lang.String str1 = java.lang.Integer.toOctalString(1717947677);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "14631346435"+ "'", str1.equals("14631346435"));

  }

  @Test
  public void test72() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test72"); }


    java.lang.Integer i1 = java.lang.Integer.valueOf("2000000000");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 2000000000+ "'", i1.equals(2000000000));

  }

  @Test
  public void test73() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test73"); }


    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList0 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP1 = null;
    tp2.IPBan iPBan3 = new tp2.IPBan(iP1, (java.lang.Long)0L);
    boolean b4 = strictlySortedSinglyLinkedList0.contains(iPBan3);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList5 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP6 = null;
    tp2.IPBan iPBan8 = new tp2.IPBan(iP6, (java.lang.Long)0L);
    boolean b9 = strictlySortedSinglyLinkedList5.contains(iPBan8);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList10 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP15 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b16 = strictlySortedSinglyLinkedList10.containsIP(iP15);
    iP15.setFirst((java.lang.Integer)0);
    java.lang.Integer i19 = iP15.getSecond();
    iPBan8.setIp(iP15);
    boolean b21 = strictlySortedSinglyLinkedList0.contains(iPBan8);
    tp2.IP iP26 = new tp2.IP((java.lang.Integer)64, (java.lang.Integer)4, (java.lang.Integer)262144, (java.lang.Integer)167772288);
    iP26.setFourth((java.lang.Integer)10942);
    boolean b29 = strictlySortedSinglyLinkedList0.removeFromIP(iP26);
    tp2.IPBan iPBan31 = strictlySortedSinglyLinkedList0.get(17);
    tp2.IP iP36 = new tp2.IP((java.lang.Integer)10941, (java.lang.Integer)25275, (java.lang.Integer)240000041, (java.lang.Integer)56);
    iP36.setFourth((java.lang.Integer)134217728);
    boolean b39 = strictlySortedSinglyLinkedList0.removeFromIP(iP36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i19 + "' != '" + 100+ "'", i19.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iPBan31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == false);

  }

  @Test
  public void test74() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test74"); }


    int i2 = java.lang.Integer.compareUnsigned(45413, 2711);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);

  }

  @Test
  public void test75() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test75"); }


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
    int i50 = singlyLinkedList0.getSize();
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
    tp2.IP iP67 = iPBan54.getIp();
    boolean b68 = singlyLinkedList0.remove(iP67);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList69 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP70 = null;
    tp2.IPBan iPBan72 = new tp2.IPBan(iP70, (java.lang.Long)0L);
    boolean b73 = strictlySortedSinglyLinkedList69.contains(iPBan72);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList74 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP79 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b80 = strictlySortedSinglyLinkedList74.containsIP(iP79);
    iP79.setFirst((java.lang.Integer)0);
    java.lang.Integer i83 = iP79.getSecond();
    iPBan72.setIp(iP79);
    tp2.IP iP85 = iPBan72.getIp();
    iP85.setFourth((java.lang.Integer)1074266112);
    singlyLinkedList0.add(iP85);
    
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
    org.junit.Assert.assertTrue(i50 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b55 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b62 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i65 + "' != '" + 100+ "'", i65.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP67);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b68 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b73 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b80 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i83 + "' != '" + 100+ "'", i83.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP85);

  }

  @Test
  public void test76() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test76"); }


    tp2.SinglyLinkedList singlyLinkedList0 = new tp2.SinglyLinkedList();
    boolean b1 = singlyLinkedList0.isEmpty();
    tp2.IP iP3 = singlyLinkedList0.get(0);
    tp2.IP iP8 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    java.lang.Integer i9 = iP8.getFourth();
    java.lang.Integer i10 = iP8.getThird();
    boolean b11 = singlyLinkedList0.contains(iP8);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList12 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP17 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b18 = strictlySortedSinglyLinkedList12.containsIP(iP17);
    java.lang.Integer i19 = iP17.getFourth();
    iP17.setFourth((java.lang.Integer)(-805306368));
    iP17.setSecond((java.lang.Integer)67108864);
    java.lang.Integer i24 = null;
    iP17.setThird(i24);
    boolean b26 = singlyLinkedList0.remove(iP17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 10+ "'", i9.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i10 + "' != '" + 167772288+ "'", i10.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i19 + "' != '" + 10+ "'", i19.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);

  }

  @Test
  public void test77() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test77"); }


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
    tp2.Server server61 = new tp2.Server();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList62 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP67 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b68 = strictlySortedSinglyLinkedList62.containsIP(iP67);
    tp2.IP iP73 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    tp2.SinglyLinkedList singlyLinkedList74 = new tp2.SinglyLinkedList();
    boolean b75 = iP73.equals((java.lang.Object)singlyLinkedList74);
    java.lang.Integer i76 = iP73.getThird();
    boolean b77 = strictlySortedSinglyLinkedList62.removeFromIP(iP73);
    boolean b78 = server61.removeException(iP73);
    iPBan48.setIp(iP73);
    boolean b80 = server0.removeException(iP73);
    tp2.ITime iTime81 = null;
    server0.setTime(iTime81);
    tp2.ITime iTime83 = null;
    server0.setTime(iTime83);
    
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
    org.junit.Assert.assertTrue(b49 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b56 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i59 + "' != '" + 100+ "'", i59.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b68 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b75 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i76 + "' != '" + 167772288+ "'", i76.equals(167772288));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b77 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b78 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b80 == false);

  }

  @Test
  public void test78() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test78"); }


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
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList51 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP56 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b57 = strictlySortedSinglyLinkedList51.containsIP(iP56);
    iP56.setFirst((java.lang.Integer)0);
    java.lang.Integer i60 = iP56.getSecond();
    iP56.setFourth((java.lang.Integer)83886146);
    iP56.setFourth((java.lang.Integer)83886146);
    java.lang.Integer i65 = iP56.getFirst();
    boolean b66 = server0.addBan(iP56);
    tp2.ITime iTime67 = null;
    server0.setTime(iTime67);
    
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
    org.junit.Assert.assertTrue(b57 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i60 + "' != '" + 100+ "'", i60.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i65 + "' != '" + 0+ "'", i65.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b66 == true);

  }

  @Test
  public void test79() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test79"); }


    java.lang.String str1 = java.lang.Integer.toHexString(24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "18"+ "'", str1.equals("18"));

  }

  @Test
  public void test80() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test80"); }


    int i2 = java.lang.Integer.rotateLeft(524288, 268);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == (-2147483648));

  }

  @Test
  public void test81() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test81"); }


    tp2.Server server0 = new tp2.Server();
    server0.update();
    tp2.SinglyLinkedList singlyLinkedList2 = new tp2.SinglyLinkedList();
    int i3 = singlyLinkedList2.getSize();
    tp2.IP iP5 = singlyLinkedList2.get(10);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList6 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP11 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b12 = strictlySortedSinglyLinkedList6.containsIP(iP11);
    iP11.setFirst((java.lang.Integer)0);
    boolean b15 = singlyLinkedList2.remove(iP11);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList16 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP21 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    boolean b22 = strictlySortedSinglyLinkedList16.containsIP(iP21);
    tp2.IPBan iPBan24 = strictlySortedSinglyLinkedList16.get((-1));
    tp2.IP iP29 = new tp2.IP((java.lang.Integer)10, (java.lang.Integer)10, (java.lang.Integer)1, (java.lang.Integer)10);
    tp2.IPBan iPBan31 = new tp2.IPBan(iP29, (java.lang.Long)100L);
    boolean b32 = strictlySortedSinglyLinkedList16.removeFromIP(iP29);
    tp2.IP iP37 = new tp2.IP((java.lang.Integer)10, (java.lang.Integer)10, (java.lang.Integer)1, (java.lang.Integer)10);
    tp2.IPBan iPBan39 = new tp2.IPBan(iP37, (java.lang.Long)100L);
    boolean b40 = strictlySortedSinglyLinkedList16.removeFromIP(iP37);
    singlyLinkedList2.add(iP37);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList42 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP43 = null;
    tp2.IPBan iPBan45 = new tp2.IPBan(iP43, (java.lang.Long)0L);
    boolean b46 = strictlySortedSinglyLinkedList42.contains(iPBan45);
    tp2.IP iP51 = new tp2.IP((java.lang.Integer)(-2147483638), (java.lang.Integer)100, (java.lang.Integer)167772288, (java.lang.Integer)10);
    java.lang.Integer i52 = iP51.getFourth();
    boolean b53 = strictlySortedSinglyLinkedList42.removeFromIP(iP51);
    boolean b54 = singlyLinkedList2.remove(iP51);
    boolean b55 = server0.addBan(iP51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iPBan24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b46 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i52 + "' != '" + 10+ "'", i52.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b53 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b54 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b55 == true);

  }

  @Test
  public void test82() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test82"); }


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
    tp2.IP iP44 = new tp2.IP((java.lang.Integer)67109184, (java.lang.Integer)120000020, (java.lang.Integer)67109184, (java.lang.Integer)20971536);
    boolean b45 = singlyLinkedList0.contains(iP44);
    tp2.IP iP46 = null;
    singlyLinkedList0.add(iP46);
    tp2.IP iP49 = singlyLinkedList0.get(2097152);
    
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
    org.junit.Assert.assertTrue(b45 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP49);

  }

  @Test
  public void test83() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test83"); }


    int i1 = java.lang.Integer.bitCount(111010);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 8);

  }

}
