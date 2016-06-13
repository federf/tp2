package randoopTestsServer1;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest3 {

  public static boolean debug = false;

  @Test
  public void test01() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test01"); }


    java.lang.Integer i1 = java.lang.Integer.getInteger("1400000300");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);

  }

  @Test
  public void test02() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test02"); }


    tp2.SinglyLinkedList singlyLinkedList0 = new tp2.SinglyLinkedList();
    tp2.Server server1 = new tp2.Server();
    boolean b2 = server1.exceptionsNotRepeated();
    tp2.IP iP7 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i8 = iP7.getThird();
    iP7.setSecond((java.lang.Integer)10);
    boolean b11 = server1.removeBan(iP7);
    boolean b12 = singlyLinkedList0.remove(iP7);
    java.lang.Integer i13 = iP7.getThird();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i8 + "' != '" + (-1)+ "'", i8.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i13 + "' != '" + (-1)+ "'", i13.equals((-1)));

  }

  @Test
  public void test03() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test03"); }


    tp2.SinglyLinkedList singlyLinkedList0 = new tp2.SinglyLinkedList();
    tp2.IP iP5 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i6 = iP5.getThird();
    boolean b7 = singlyLinkedList0.remove(iP5);
    boolean b8 = singlyLinkedList0.isEmpty();
    int i9 = singlyLinkedList0.getSize();
    tp2.SinglyLinkedList singlyLinkedList10 = new tp2.SinglyLinkedList();
    tp2.IP iP15 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i16 = iP15.getThird();
    boolean b17 = singlyLinkedList10.remove(iP15);
    boolean b18 = singlyLinkedList10.isEmpty();
    int i19 = singlyLinkedList10.getSize();
    tp2.IP iP24 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i25 = iP24.getThird();
    iP24.setFourth((java.lang.Integer)0);
    boolean b28 = singlyLinkedList10.contains(iP24);
    boolean b29 = singlyLinkedList10.isEmpty();
    tp2.SinglyLinkedList singlyLinkedList30 = new tp2.SinglyLinkedList();
    tp2.IP iP35 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i36 = iP35.getThird();
    boolean b37 = singlyLinkedList30.remove(iP35);
    tp2.IPBan iPBan39 = new tp2.IPBan(iP35, (java.lang.Long)10L);
    singlyLinkedList10.add(iP35);
    boolean b41 = singlyLinkedList0.contains(iP35);
    boolean b43 = iP35.equals((java.lang.Object)134217599);
    iP35.setFirst((java.lang.Integer)100000);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i6 + "' != '" + (-1)+ "'", i6.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i16 + "' != '" + (-1)+ "'", i16.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i25 + "' != '" + (-1)+ "'", i25.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i36 + "' != '" + (-1)+ "'", i36.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b43 == false);

  }

  @Test
  public void test04() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test04"); }


    java.lang.Integer i2 = java.lang.Integer.getInteger("10000", 1073741824);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i2 + "' != '" + 1073741824+ "'", i2.equals(1073741824));

  }

  @Test
  public void test05() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test05"); }


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
    tp2.Server server22 = new tp2.Server();
    boolean b23 = server22.notSharedElements();
    tp2.SinglyLinkedList singlyLinkedList24 = new tp2.SinglyLinkedList();
    tp2.IP iP29 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i30 = iP29.getThird();
    boolean b31 = singlyLinkedList24.remove(iP29);
    boolean b32 = server22.addException(iP29);
    java.lang.Integer i33 = iP29.getFirst();
    tp2.IPBan iPBan35 = new tp2.IPBan(iP29, (java.lang.Long)5L);
    tp2.IP iP36 = iPBan35.getIp();
    boolean b37 = strictlySortedSinglyLinkedList0.contains(iPBan35);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList38 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP43 = new tp2.IP((java.lang.Integer)150994944, (java.lang.Integer)11100, (java.lang.Integer)784, (java.lang.Integer)0);
    boolean b44 = strictlySortedSinglyLinkedList38.removeFromIP(iP43);
    tp2.IPBan iPBan46 = strictlySortedSinglyLinkedList38.get(637534208);
    tp2.IPBan iPBan48 = strictlySortedSinglyLinkedList38.get(1100100);
    tp2.IP iP53 = new tp2.IP((java.lang.Integer)11100, (java.lang.Integer)40, (java.lang.Integer)28, (java.lang.Integer)727449600);
    java.lang.Integer i54 = iP53.getFourth();
    tp2.IPBan iPBan56 = new tp2.IPBan(iP53, (java.lang.Long)784L);
    tp2.IP iP61 = new tp2.IP((java.lang.Integer)150994944, (java.lang.Integer)784, (java.lang.Integer)784, (java.lang.Integer)2);
    java.lang.Integer i62 = iP61.getFourth();
    iP61.setSecond((java.lang.Integer)805306368);
    boolean b65 = iP53.equals((java.lang.Object)iP61);
    boolean b66 = strictlySortedSinglyLinkedList38.containsIP(iP61);
    boolean b67 = strictlySortedSinglyLinkedList0.removeFromIP(iP61);
    
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
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i30 + "' != '" + (-1)+ "'", i30.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i33 + "' != '" + (-1)+ "'", i33.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iPBan46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iPBan48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i54 + "' != '" + 727449600+ "'", i54.equals(727449600));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i62 + "' != '" + 2+ "'", i62.equals(2));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b65 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b66 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b67 == false);

  }

  @Test
  public void test06() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test06"); }


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
    server0.update();
    boolean b23 = server0.exceptionsNotRepeated();
    tp2.IP iP28 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i29 = iP28.getFirst();
    java.lang.Integer i30 = iP28.getSecond();
    iP28.setFirst((java.lang.Integer)201326592);
    boolean b33 = server0.connect(iP28);
    
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
    org.junit.Assert.assertTrue("'" + i29 + "' != '" + (-1)+ "'", i29.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i30 + "' != '" + (-1)+ "'", i30.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == true);

  }

  @Test
  public void test07() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test07"); }


    int i2 = java.lang.Integer.rotateLeft(11001, 2107812096);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 11001);

  }

  @Test
  public void test08() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test08"); }


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
    boolean b62 = singlyLinkedList0.isEmpty();
    boolean b63 = singlyLinkedList0.isEmpty();
    boolean b64 = singlyLinkedList0.isEmpty();
    
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
    org.junit.Assert.assertTrue(b62 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b63 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b64 == false);

  }

  @Test
  public void test09() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test09"); }


    tp2.Server server0 = new tp2.Server();
    boolean b1 = server0.exceptionsNotRepeated();
    tp2.ITime iTime2 = null;
    server0.setTime(iTime2);
    tp2.SinglyLinkedList singlyLinkedList4 = new tp2.SinglyLinkedList();
    tp2.Server server5 = new tp2.Server();
    boolean b6 = server5.exceptionsNotRepeated();
    tp2.IP iP11 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i12 = iP11.getThird();
    iP11.setSecond((java.lang.Integer)10);
    boolean b15 = server5.removeBan(iP11);
    boolean b16 = singlyLinkedList4.remove(iP11);
    tp2.SinglyLinkedList singlyLinkedList17 = new tp2.SinglyLinkedList();
    tp2.IP iP22 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i23 = iP22.getThird();
    boolean b24 = singlyLinkedList17.remove(iP22);
    tp2.Server server25 = new tp2.Server();
    tp2.IP iP30 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    boolean b31 = server25.removeBan(iP30);
    boolean b32 = singlyLinkedList17.contains(iP30);
    singlyLinkedList4.add(iP30);
    boolean b34 = server0.addBan(iP30);
    tp2.ITime iTime35 = null;
    server0.setTime(iTime35);
    boolean b37 = server0.bansSorted();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i12 + "' != '" + (-1)+ "'", i12.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i23 + "' != '" + (-1)+ "'", i23.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == true);

  }

  @Test
  public void test10() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test10"); }


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
    boolean b17 = server0.bansSorted();
    boolean b18 = server0.bansOkTime();
    tp2.SinglyLinkedList singlyLinkedList19 = new tp2.SinglyLinkedList();
    tp2.IP iP24 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i25 = iP24.getThird();
    boolean b26 = singlyLinkedList19.remove(iP24);
    tp2.IPBan iPBan28 = new tp2.IPBan(iP24, (java.lang.Long)10L);
    tp2.IP iP33 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i34 = iP33.getFourth();
    iPBan28.setIp(iP33);
    java.lang.Long long36 = iPBan28.getExpires();
    java.lang.Long long37 = iPBan28.getExpires();
    tp2.SinglyLinkedList singlyLinkedList38 = new tp2.SinglyLinkedList();
    tp2.IP iP43 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i44 = iP43.getThird();
    boolean b45 = singlyLinkedList38.remove(iP43);
    tp2.IPBan iPBan47 = new tp2.IPBan(iP43, (java.lang.Long)10L);
    tp2.IP iP52 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i53 = iP52.getFourth();
    iPBan47.setIp(iP52);
    iP52.setSecond((java.lang.Integer)469762048);
    iPBan28.setIp(iP52);
    boolean b58 = server0.addException(iP52);
    boolean b59 = server0.notSharedElements();
    
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
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i25 + "' != '" + (-1)+ "'", i25.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i34 + "' != '" + 100+ "'", i34.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long36 + "' != '" + 10L+ "'", long36.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long37 + "' != '" + 10L+ "'", long37.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i44 + "' != '" + (-1)+ "'", i44.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i53 + "' != '" + 100+ "'", i53.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b58 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b59 == true);

  }

  @Test
  public void test11() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test11"); }


    int i1 = java.lang.Integer.reverse(1107296276);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 671088706);

  }

  @Test
  public void test12() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test12"); }


    java.lang.Integer i1 = java.lang.Integer.valueOf("51");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 51+ "'", i1.equals(51));

  }

  @Test
  public void test13() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test13"); }


    java.lang.String str2 = java.lang.Integer.toUnsignedString(0, 967835608);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "0"+ "'", str2.equals("0"));

  }

  @Test
  public void test14() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test14"); }


    java.lang.Integer i1 = java.lang.Integer.getInteger("1400000000");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);

  }

  @Test
  public void test15() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test15"); }


    tp2.SinglyLinkedList singlyLinkedList0 = new tp2.SinglyLinkedList();
    tp2.IP iP5 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i6 = iP5.getThird();
    boolean b7 = singlyLinkedList0.remove(iP5);
    tp2.Server server8 = new tp2.Server();
    tp2.IP iP13 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    boolean b14 = server8.removeBan(iP13);
    boolean b15 = singlyLinkedList0.contains(iP13);
    tp2.IP iP17 = singlyLinkedList0.get(4);
    int i18 = singlyLinkedList0.getSize();
    tp2.IP iP23 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i24 = iP23.getFirst();
    java.lang.Integer i25 = iP23.getSecond();
    iP23.setFirst((java.lang.Integer)201326592);
    tp2.IPBan iPBan29 = new tp2.IPBan(iP23, (java.lang.Long)727449600L);
    tp2.IP iP30 = iPBan29.getIp();
    singlyLinkedList0.add(iP30);
    tp2.Server server32 = new tp2.Server();
    tp2.ITime iTime33 = null;
    server32.setTime(iTime33);
    tp2.ITime iTime35 = null;
    server32.setTime(iTime35);
    tp2.Server server37 = new tp2.Server();
    tp2.IP iP42 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    boolean b43 = server37.removeBan(iP42);
    java.lang.Integer i44 = iP42.getFirst();
    boolean b45 = server32.addException(iP42);
    singlyLinkedList0.add(iP42);
    java.lang.Integer i47 = iP42.getFirst();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i6 + "' != '" + (-1)+ "'", i6.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i24 + "' != '" + (-1)+ "'", i24.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i25 + "' != '" + (-1)+ "'", i25.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b43 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i44 + "' != '" + (-1)+ "'", i44.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i47 + "' != '" + (-1)+ "'", i47.equals((-1)));

  }

  @Test
  public void test16() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test16"); }


    tp2.IP iP4 = new tp2.IP((java.lang.Integer)150994944, (java.lang.Integer)11100, (java.lang.Integer)784, (java.lang.Integer)0);
    java.lang.Integer i5 = iP4.getFourth();
    iP4.setSecond((java.lang.Integer)(-1073741824));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i5 + "' != '" + 0+ "'", i5.equals(0));

  }

  @Test
  public void test17() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test17"); }


    java.lang.Integer i1 = java.lang.Integer.valueOf(784);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 784+ "'", i1.equals(784));

  }

  @Test
  public void test18() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test18"); }


    java.lang.String str1 = java.lang.Integer.toOctalString(200000000);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "1372741000"+ "'", str1.equals("1372741000"));

  }

  @Test
  public void test19() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test19"); }


    java.lang.Integer i1 = new java.lang.Integer(201326784);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 201326784+ "'", i1.equals(201326784));

  }

  @Test
  public void test20() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test20"); }


    int i2 = java.lang.Integer.divideUnsigned(201326692, 1476395008);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);

  }

  @Test
  public void test21() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test21"); }


    int i1 = java.lang.Integer.lowestOneBit(806092800);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 262144);

  }

  @Test
  public void test22() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test22"); }


    java.lang.String str1 = java.lang.Integer.toBinaryString(311531929);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "10010100100011001100110011001"+ "'", str1.equals("10010100100011001100110011001"));

  }

  @Test
  public void test23() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test23"); }


    int i2 = java.lang.Integer.compare(134217728, 80007168);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);

  }

}
