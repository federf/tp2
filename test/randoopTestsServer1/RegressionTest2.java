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


    // The following exception was thrown during execution in test generation
    try {
      int i2 = java.lang.Integer.parseUnsignedInt("1010000000000", 218103808);
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test002() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test002"); }


    tp2.Server server0 = new tp2.Server();
    tp2.IP iP5 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    boolean b6 = server0.removeBan(iP5);
    boolean b7 = server0.bansNotRepeatedExpirationOrIP();
    boolean b8 = server0.bansSorted();
    boolean b9 = server0.exceptionsNotRepeated();
    
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
  public void test003() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test003"); }


    int i1 = java.lang.Integer.numberOfTrailingZeros(807927808);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 19);

  }

  @Test
  public void test004() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test004"); }


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
    boolean b61 = server0.bansSorted();
    
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
  public void test005() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test005"); }


    tp2.Server server0 = new tp2.Server();
    boolean b1 = server0.exceptionsNotRepeated();
    boolean b2 = server0.bansNotRepeatedExpirationOrIP();
    tp2.IP iP7 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i8 = iP7.getFirst();
    java.lang.Integer i9 = iP7.getFirst();
    boolean b10 = server0.connect(iP7);
    boolean b11 = server0.bansSorted();
    boolean b12 = server0.bansOkTime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i8 + "' != '" + (-1)+ "'", i8.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + (-1)+ "'", i9.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);

  }

  @Test
  public void test006() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test006"); }


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
    tp2.ITime iTime35 = null;
    server0.setTime(iTime35);
    
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

  }

  @Test
  public void test007() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test007"); }


    int i2 = java.lang.Integer.remainderUnsigned(729888, 31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 24);

  }

  @Test
  public void test008() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test008"); }


    tp2.Server server0 = new tp2.Server();
    tp2.IP iP5 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    boolean b6 = server0.removeBan(iP5);
    boolean b7 = server0.bansSorted();
    tp2.Server server8 = new tp2.Server();
    boolean b9 = server8.exceptionsNotRepeated();
    tp2.IP iP14 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i15 = iP14.getThird();
    iP14.setSecond((java.lang.Integer)10);
    boolean b18 = server8.removeBan(iP14);
    java.lang.Integer i19 = iP14.getSecond();
    boolean b20 = server0.addException(iP14);
    java.lang.Integer i21 = iP14.getSecond();
    boolean b23 = iP14.equals((java.lang.Object)"0");
    iP14.setSecond((java.lang.Integer)33554432);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i15 + "' != '" + (-1)+ "'", i15.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i19 + "' != '" + 10+ "'", i19.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i21 + "' != '" + 10+ "'", i21.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);

  }

  @Test
  public void test009() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test009"); }


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
    tp2.IP iP38 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i39 = iP38.getThird();
    iP38.setFourth((java.lang.Integer)0);
    iP38.setSecond((java.lang.Integer)3);
    iPBan9.setIp(iP38);
    java.lang.Long long45 = iPBan9.getExpires();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i39 + "' != '" + (-1)+ "'", i39.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long45 + "' != '" + 4L+ "'", long45.equals(4L));

  }

  @Test
  public void test010() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test010"); }


    // The following exception was thrown during execution in test generation
    try {
      korat.finitization.IFinitization iFinitization1 = tp2.Server.finServer(5120);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test011() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test011"); }


    java.lang.Integer i1 = new java.lang.Integer("201326597");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 201326597+ "'", i1.equals(201326597));

  }

  @Test
  public void test012() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test012"); }


    tp2.Server server0 = new tp2.Server();
    tp2.IP iP5 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    boolean b6 = server0.removeBan(iP5);
    boolean b7 = server0.bansSorted();
    boolean b8 = server0.exceptionsNotRepeated();
    tp2.SinglyLinkedList singlyLinkedList9 = new tp2.SinglyLinkedList();
    tp2.IP iP10 = null;
    boolean b11 = singlyLinkedList9.remove(iP10);
    boolean b12 = singlyLinkedList9.isEmpty();
    tp2.IP iP17 = new tp2.IP((java.lang.Integer)5, (java.lang.Integer)1, (java.lang.Integer)0, (java.lang.Integer)12);
    boolean b18 = singlyLinkedList9.contains(iP17);
    tp2.SinglyLinkedList singlyLinkedList19 = new tp2.SinglyLinkedList();
    tp2.IP iP24 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i25 = iP24.getThird();
    boolean b26 = singlyLinkedList19.remove(iP24);
    iP24.setSecond((java.lang.Integer)150994944);
    java.lang.Integer i29 = iP24.getFourth();
    java.lang.Integer i30 = iP24.getThird();
    java.lang.Integer i31 = iP24.getFirst();
    boolean b32 = singlyLinkedList9.contains(iP24);
    tp2.SinglyLinkedList singlyLinkedList33 = new tp2.SinglyLinkedList();
    tp2.IP iP38 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i39 = iP38.getFourth();
    singlyLinkedList33.add(iP38);
    java.lang.Integer i41 = iP38.getFirst();
    boolean b42 = singlyLinkedList9.remove(iP38);
    boolean b43 = server0.removeException(iP38);
    tp2.Server server44 = new tp2.Server();
    boolean b45 = server44.exceptionsNotRepeated();
    tp2.IP iP50 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i51 = iP50.getThird();
    iP50.setSecond((java.lang.Integer)10);
    boolean b54 = server44.removeBan(iP50);
    iP50.setFourth((java.lang.Integer)9);
    iP50.setThird((java.lang.Integer)64);
    java.lang.Integer i59 = iP50.getFirst();
    boolean b60 = server0.addException(iP50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i25 + "' != '" + (-1)+ "'", i25.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i29 + "' != '" + 100+ "'", i29.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i30 + "' != '" + (-1)+ "'", i30.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i31 + "' != '" + (-1)+ "'", i31.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i39 + "' != '" + 100+ "'", i39.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i41 + "' != '" + (-1)+ "'", i41.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b43 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i51 + "' != '" + (-1)+ "'", i51.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b54 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i59 + "' != '" + (-1)+ "'", i59.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b60 == true);

  }

  @Test
  public void test013() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test013"); }


    int i1 = java.lang.Integer.reverseBytes(6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 100663296);

  }

  @Test
  public void test014() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test014"); }


    java.lang.String str1 = java.lang.Integer.toOctalString(33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "41"+ "'", str1.equals("41"));

  }

  @Test
  public void test015() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test015"); }


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
    boolean b71 = strictlySortedSinglyLinkedList0.isEmpty();
    
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
    org.junit.Assert.assertTrue(b71 == true);

  }

  @Test
  public void test016() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test016"); }


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
    java.lang.Integer i28 = iP25.getThird();
    java.lang.Integer i29 = iP25.getSecond();
    singlyLinkedList0.add(iP25);
    int i31 = singlyLinkedList0.getSize();
    boolean b32 = singlyLinkedList0.isEmpty();
    
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
    org.junit.Assert.assertTrue("'" + i28 + "' != '" + (-1)+ "'", i28.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i29 + "' != '" + (-1)+ "'", i29.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i31 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);

  }

  @Test
  public void test017() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test017"); }


    int i2 = java.lang.Integer.min(14, 80007168);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 14);

  }

  @Test
  public void test018() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test018"); }


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
    tp2.IP iP38 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i39 = iP38.getThird();
    iP38.setFourth((java.lang.Integer)0);
    iP38.setSecond((java.lang.Integer)3);
    iPBan9.setIp(iP38);
    iPBan9.setExpires((java.lang.Long)3221225472L);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i39 + "' != '" + (-1)+ "'", i39.equals((-1)));

  }

  @Test
  public void test019() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test019"); }


    java.lang.Integer i1 = new java.lang.Integer("14");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 14+ "'", i1.equals(14));

  }

  @Test
  public void test020() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test020"); }


    int i2 = java.lang.Integer.max(33, 201326624);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 201326624);

  }

  @Test
  public void test021() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test021"); }


    java.lang.String str1 = java.lang.Integer.toOctalString(44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "54"+ "'", str1.equals("54"));

  }

  @Test
  public void test022() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test022"); }


    java.lang.String str1 = java.lang.Integer.toUnsignedString(26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "26"+ "'", str1.equals("26"));

  }

  @Test
  public void test023() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test023"); }


    java.lang.Integer i2 = java.lang.Integer.getInteger("3221225484", (java.lang.Integer)33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i2 + "' != '" + 33+ "'", i2.equals(33));

  }

  @Test
  public void test024() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test024"); }


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
    tp2.Server server34 = new tp2.Server();
    boolean b35 = server34.exceptionsNotRepeated();
    boolean b36 = server34.bansNotRepeatedExpirationOrIP();
    tp2.SinglyLinkedList singlyLinkedList37 = new tp2.SinglyLinkedList();
    tp2.IP iP42 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i43 = iP42.getThird();
    boolean b44 = singlyLinkedList37.remove(iP42);
    tp2.IP iP49 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i50 = iP49.getFirst();
    boolean b51 = singlyLinkedList37.remove(iP49);
    java.lang.Integer i52 = iP49.getSecond();
    boolean b53 = server34.removeException(iP49);
    java.lang.Integer i54 = iP49.getFirst();
    boolean b55 = singlyLinkedList0.contains(iP49);
    
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
    org.junit.Assert.assertTrue(b35 == true);
    
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
    org.junit.Assert.assertTrue("'" + i52 + "' != '" + (-1)+ "'", i52.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b53 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i54 + "' != '" + (-1)+ "'", i54.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b55 == false);

  }

  @Test
  public void test025() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test025"); }


    int i1 = java.lang.Integer.signum(34603041);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 1);

  }

  @Test
  public void test026() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test026"); }


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
    tp2.IP iP53 = new tp2.IP((java.lang.Integer)110011, (java.lang.Integer)27, (java.lang.Integer)729888, (java.lang.Integer)48);
    boolean b54 = server0.connect(iP53);
    
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
    org.junit.Assert.assertTrue(b54 == true);

  }

  @Test
  public void test027() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test027"); }


    java.lang.Integer i1 = new java.lang.Integer(805306371);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 805306371+ "'", i1.equals(805306371));

  }

  @Test
  public void test028() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test028"); }


    java.lang.String str1 = java.lang.Integer.toHexString((-2147483648));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "80000000"+ "'", str1.equals("80000000"));

  }

  @Test
  public void test029() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test029"); }


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
    server0.update();
    boolean b22 = server0.bansSorted();
    
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
    org.junit.Assert.assertTrue(b22 == true);

  }

  @Test
  public void test030() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test030"); }


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
    tp2.SinglyLinkedList singlyLinkedList31 = new tp2.SinglyLinkedList();
    tp2.IP iP32 = null;
    boolean b33 = singlyLinkedList31.remove(iP32);
    boolean b34 = singlyLinkedList31.isEmpty();
    tp2.IP iP39 = new tp2.IP((java.lang.Integer)5, (java.lang.Integer)1, (java.lang.Integer)0, (java.lang.Integer)12);
    boolean b40 = singlyLinkedList31.contains(iP39);
    tp2.SinglyLinkedList singlyLinkedList41 = new tp2.SinglyLinkedList();
    tp2.IP iP46 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i47 = iP46.getThird();
    boolean b48 = singlyLinkedList41.remove(iP46);
    iP46.setSecond((java.lang.Integer)150994944);
    java.lang.Integer i51 = iP46.getFourth();
    java.lang.Integer i52 = iP46.getThird();
    java.lang.Integer i53 = iP46.getFirst();
    boolean b54 = singlyLinkedList31.contains(iP46);
    tp2.SinglyLinkedList singlyLinkedList55 = new tp2.SinglyLinkedList();
    tp2.IP iP60 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i61 = iP60.getFourth();
    singlyLinkedList55.add(iP60);
    java.lang.Integer i63 = iP60.getFirst();
    boolean b64 = singlyLinkedList31.remove(iP60);
    boolean b65 = server0.addBan(iP60);
    
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
    org.junit.Assert.assertTrue(b33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i47 + "' != '" + (-1)+ "'", i47.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b48 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i51 + "' != '" + 100+ "'", i51.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i52 + "' != '" + (-1)+ "'", i52.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i53 + "' != '" + (-1)+ "'", i53.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b54 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i61 + "' != '" + 100+ "'", i61.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i63 + "' != '" + (-1)+ "'", i63.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b64 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b65 == false);

  }

  @Test
  public void test031() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test031"); }


    tp2.SinglyLinkedList singlyLinkedList0 = new tp2.SinglyLinkedList();
    tp2.IP iP5 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i6 = iP5.getThird();
    boolean b7 = singlyLinkedList0.remove(iP5);
    tp2.IPBan iPBan9 = new tp2.IPBan(iP5, (java.lang.Long)10L);
    java.lang.Long long10 = iPBan9.getExpires();
    tp2.Server server11 = new tp2.Server();
    tp2.IP iP16 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    boolean b17 = server11.removeBan(iP16);
    iP16.setThird((java.lang.Integer)167772260);
    iPBan9.setIp(iP16);
    java.lang.Long long21 = iPBan9.getExpires();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i6 + "' != '" + (-1)+ "'", i6.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long10 + "' != '" + 10L+ "'", long10.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long21 + "' != '" + 10L+ "'", long21.equals(10L));

  }

  @Test
  public void test032() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test032"); }


    // The following exception was thrown during execution in test generation
    try {
      int i2 = java.lang.Integer.parseUnsignedInt("4000", 167772260);
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

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test033"); }


    int i1 = java.lang.Integer.numberOfTrailingZeros(1275068422);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 1);

  }

  @Test
  public void test034() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test034"); }


    java.lang.Integer i2 = java.lang.Integer.getInteger("100", 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i2 + "' != '" + 0+ "'", i2.equals(0));

  }

  @Test
  public void test035() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test035"); }


    int i1 = java.lang.Integer.numberOfLeadingZeros(512);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 22);

  }

  @Test
  public void test036() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test036"); }


    tp2.IP iP4 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i5 = iP4.getSecond();
    iP4.setFirst((java.lang.Integer)2);
    java.lang.Integer i8 = iP4.getFirst();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i5 + "' != '" + (-1)+ "'", i5.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i8 + "' != '" + 2+ "'", i8.equals(2));

  }

  @Test
  public void test037() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test037"); }


    // The following exception was thrown during execution in test generation
    try {
      java.lang.Integer i1 = new java.lang.Integer("2147483648");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test038() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test038"); }


    int i2 = java.lang.Integer.compare(11001, 48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);

  }

  @Test
  public void test039() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test039"); }


    // The following exception was thrown during execution in test generation
    try {
      int i2 = java.lang.Integer.parseInt("34672726332", 1073741826);
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test040() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test040"); }


    java.lang.Integer i1 = java.lang.Integer.getInteger("110011");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);

  }

  @Test
  public void test041() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test041"); }


    tp2.SinglyLinkedList singlyLinkedList0 = new tp2.SinglyLinkedList();
    tp2.IP iP5 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i6 = iP5.getFourth();
    singlyLinkedList0.add(iP5);
    korat.finitization.IFinitization iFinitization9 = tp2.Server.finServer((-1073741824));
    boolean b10 = iP5.equals((java.lang.Object)iFinitization9);
    tp2.IPBan iPBan12 = new tp2.IPBan(iP5, (java.lang.Long)536870912L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i6 + "' != '" + 100+ "'", i6.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iFinitization9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);

  }

  @Test
  public void test042() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test042"); }


    int i2 = java.lang.Integer.rotateLeft(11100, 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 177600);

  }

  @Test
  public void test043() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test043"); }


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
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList17 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP22 = new tp2.IP((java.lang.Integer)150994944, (java.lang.Integer)11100, (java.lang.Integer)784, (java.lang.Integer)0);
    boolean b23 = strictlySortedSinglyLinkedList17.removeFromIP(iP22);
    boolean b24 = singlyLinkedList0.contains(iP22);
    tp2.IP iP26 = singlyLinkedList0.get(0);
    
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
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP26);

  }

  @Test
  public void test044() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test044"); }


    // The following exception was thrown during execution in test generation
    try {
      java.lang.Integer i2 = java.lang.Integer.valueOf("58000000", 0);
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test045() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test045"); }


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
    iP21.setFourth((java.lang.Integer)10);
    
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

  }

  @Test
  public void test046() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test046"); }


    int i2 = java.lang.Integer.compare(4096, 88770);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == (-1));

  }

  @Test
  public void test047() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test047"); }


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
    tp2.IPBan iPBan21 = strictlySortedSinglyLinkedList0.get(8);
    boolean b22 = strictlySortedSinglyLinkedList0.isEmpty();
    
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
    org.junit.Assert.assertTrue(b22 == true);

  }

  @Test
  public void test048() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test048"); }


    java.lang.String str1 = java.lang.Integer.toBinaryString(436207642);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "11010000000000000000000011010"+ "'", str1.equals("11010000000000000000000011010"));

  }

  @Test
  public void test049() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test049"); }


    java.lang.Integer i1 = new java.lang.Integer("9");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 9+ "'", i1.equals(9));

  }

  @Test
  public void test050() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test050"); }


    java.lang.String str1 = java.lang.Integer.toBinaryString(134217599);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "111111111111111111101111111"+ "'", str1.equals("111111111111111111101111111"));

  }

  @Test
  public void test051() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test051"); }


    int i2 = java.lang.Integer.parseInt("144", 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 196);

  }

  @Test
  public void test052() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test052"); }


    long long1 = java.lang.Integer.toUnsignedLong((-1305346048));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == 2989621248L);

  }

  @Test
  public void test053() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test053"); }


    tp2.Server server0 = new tp2.Server();
    boolean b1 = server0.notSharedElements();
    tp2.SinglyLinkedList singlyLinkedList2 = new tp2.SinglyLinkedList();
    tp2.IP iP7 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i8 = iP7.getThird();
    boolean b9 = singlyLinkedList2.remove(iP7);
    boolean b10 = server0.addException(iP7);
    java.lang.Integer i11 = iP7.getFirst();
    tp2.IPBan iPBan13 = new tp2.IPBan(iP7, (java.lang.Long)5L);
    tp2.IP iP14 = iPBan13.getIp();
    java.lang.Long long15 = iPBan13.getExpires();
    
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
    org.junit.Assert.assertNotNull(iP14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long15 + "' != '" + 5L+ "'", long15.equals(5L));

  }

  @Test
  public void test054() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test054"); }


    int i2 = java.lang.Integer.parseUnsignedInt("167772260", 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == (-621508756));

  }

  @Test
  public void test055() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test055"); }


    int i2 = java.lang.Integer.rotateRight((-1073741824), 218103808);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == (-1073741824));

  }

  @Test
  public void test056() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test056"); }


    java.lang.Integer i1 = java.lang.Integer.getInteger("11111111111111111111111111111111");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);

  }

  @Test
  public void test057() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test057"); }


    tp2.Server server0 = new tp2.Server();
    boolean b1 = server0.notSharedElements();
    tp2.SinglyLinkedList singlyLinkedList2 = new tp2.SinglyLinkedList();
    tp2.IP iP7 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i8 = iP7.getThird();
    boolean b9 = singlyLinkedList2.remove(iP7);
    boolean b10 = server0.addException(iP7);
    java.lang.Integer i11 = iP7.getFourth();
    java.lang.Integer i12 = iP7.getThird();
    
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
  public void test058() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test058"); }


    int i2 = java.lang.Integer.compareUnsigned(44, 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == (-1));

  }

  @Test
  public void test059() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test059"); }


    java.lang.Integer i1 = new java.lang.Integer(637534288);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 637534288+ "'", i1.equals(637534288));

  }

  @Test
  public void test060() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test060"); }


    int i2 = java.lang.Integer.rotateRight(11001, 1546321920);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 11001);

  }

  @Test
  public void test061() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test061"); }


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
    boolean b62 = singlyLinkedList0.isEmpty();
    
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
    org.junit.Assert.assertTrue(b62 == true);

  }

  @Test
  public void test062() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test062"); }


    tp2.IP iP4 = new tp2.IP((java.lang.Integer)11100, (java.lang.Integer)40, (java.lang.Integer)28, (java.lang.Integer)727449600);
    java.lang.Integer i5 = iP4.getFourth();
    tp2.IPBan iPBan7 = new tp2.IPBan(iP4, (java.lang.Long)3221225472L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i5 + "' != '" + 727449600+ "'", i5.equals(727449600));

  }

  @Test
  public void test063() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test063"); }


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
    tp2.SinglyLinkedList singlyLinkedList58 = new tp2.SinglyLinkedList();
    tp2.IP iP63 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i64 = iP63.getThird();
    boolean b65 = singlyLinkedList58.remove(iP63);
    tp2.IPBan iPBan67 = new tp2.IPBan(iP63, (java.lang.Long)10L);
    java.lang.Long long68 = iPBan67.getExpires();
    iPBan67.setExpires((java.lang.Long)(-1L));
    java.lang.Long long71 = iPBan67.getExpires();
    java.lang.Long long72 = iPBan67.getExpires();
    boolean b73 = strictlySortedSinglyLinkedList0.contains(iPBan67);
    java.lang.Long long74 = iPBan67.getExpires();
    
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
    org.junit.Assert.assertTrue("'" + i64 + "' != '" + (-1)+ "'", i64.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b65 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long68 + "' != '" + 10L+ "'", long68.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long71 + "' != '" + (-1L)+ "'", long71.equals((-1L)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long72 + "' != '" + (-1L)+ "'", long72.equals((-1L)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b73 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long74 + "' != '" + (-1L)+ "'", long74.equals((-1L)));

  }

  @Test
  public void test064() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test064"); }


    int i2 = java.lang.Integer.remainderUnsigned(14, 6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 2);

  }

  @Test
  public void test065() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test065"); }


    long long1 = java.lang.Integer.toUnsignedLong(56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == 56L);

  }

  @Test
  public void test066() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test066"); }


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
    iPBan9.setExpires((java.lang.Long)3221225472L);
    java.lang.Long long32 = iPBan9.getExpires();
    
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
    org.junit.Assert.assertTrue("'" + long32 + "' != '" + 3221225472L+ "'", long32.equals(3221225472L));

  }

  @Test
  public void test067() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test067"); }


    int i2 = java.lang.Integer.min(70, 33554432);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 70);

  }

  @Test
  public void test068() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test068"); }


    int i2 = java.lang.Integer.remainderUnsigned((-1179648000), 1073741844);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 967835608);

  }

  @Test
  public void test069() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test069"); }


    java.lang.String str2 = java.lang.Integer.toUnsignedString(939524096, 1073741824);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "939524096"+ "'", str2.equals("939524096"));

  }

  @Test
  public void test070() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test070"); }


    java.lang.String str1 = java.lang.Integer.toBinaryString(146800640);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "1000110000000000000000000000"+ "'", str1.equals("1000110000000000000000000000"));

  }

  @Test
  public void test071() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test071"); }


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
    tp2.IPBan iPBan38 = null;
    boolean b39 = strictlySortedSinglyLinkedList0.add(iPBan38);
    
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
    org.junit.Assert.assertTrue(b39 == false);

  }

  @Test
  public void test072() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test072"); }


    tp2.IP iP4 = new tp2.IP((java.lang.Integer)637534208, (java.lang.Integer)110011, (java.lang.Integer)11001, (java.lang.Integer)23);

  }

  @Test
  public void test073() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test073"); }


    // The following exception was thrown during execution in test generation
    try {
      int i2 = java.lang.Integer.parseInt("34672726332", 32);
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

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test074"); }


    java.lang.String str2 = java.lang.Integer.toUnsignedString((-2147483648), 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "2147483648"+ "'", str2.equals("2147483648"));

  }

  @Test
  public void test075() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test075"); }


    java.lang.String str1 = java.lang.Integer.toOctalString(201326784);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "1400000300"+ "'", str1.equals("1400000300"));

  }

  @Test
  public void test076() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test076"); }


    tp2.Server server0 = new tp2.Server();
    boolean b1 = server0.notSharedElements();
    boolean b2 = server0.exceptionsNotRepeated();
    tp2.ITime iTime3 = null;
    server0.setTime(iTime3);
    boolean b5 = server0.bansSorted();
    tp2.IP iP10 = new tp2.IP((java.lang.Integer)784, (java.lang.Integer)12, (java.lang.Integer)2, (java.lang.Integer)167772260);
    boolean b11 = server0.removeException(iP10);
    tp2.SinglyLinkedList singlyLinkedList12 = new tp2.SinglyLinkedList();
    tp2.IP iP17 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i18 = iP17.getThird();
    boolean b19 = singlyLinkedList12.remove(iP17);
    tp2.IPBan iPBan21 = new tp2.IPBan(iP17, (java.lang.Long)10L);
    tp2.IP iP26 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i27 = iP26.getFourth();
    iPBan21.setIp(iP26);
    tp2.IPBan iPBan30 = new tp2.IPBan(iP26, (java.lang.Long)10L);
    iP26.setThird((java.lang.Integer)(-129));
    iP26.setFourth((java.lang.Integer)5120);
    boolean b35 = server0.addException(iP26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i18 + "' != '" + (-1)+ "'", i18.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i27 + "' != '" + 100+ "'", i27.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == true);

  }

  @Test
  public void test077() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test077"); }


    java.lang.Integer i2 = java.lang.Integer.getInteger("110011", 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i2 + "' != '" + 10+ "'", i2.equals(10));

  }

  @Test
  public void test078() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test078"); }


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
    tp2.IPBan iPBan54 = new tp2.IPBan(iP50, (java.lang.Long)10L);
    java.lang.Long long55 = iPBan54.getExpires();
    java.lang.Long long56 = iPBan54.getExpires();
    tp2.SinglyLinkedList singlyLinkedList57 = new tp2.SinglyLinkedList();
    tp2.IP iP62 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i63 = iP62.getThird();
    boolean b64 = singlyLinkedList57.remove(iP62);
    tp2.IPBan iPBan66 = new tp2.IPBan(iP62, (java.lang.Long)10L);
    tp2.IP iP71 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i72 = iP71.getFourth();
    iPBan66.setIp(iP71);
    iPBan54.setIp(iP71);
    singlyLinkedList0.add(iP71);
    iP71.setThird((java.lang.Integer)1546321920);
    iP71.setFourth((java.lang.Integer)100);
    
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
    org.junit.Assert.assertTrue("'" + long55 + "' != '" + 10L+ "'", long55.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long56 + "' != '" + 10L+ "'", long56.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i63 + "' != '" + (-1)+ "'", i63.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b64 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i72 + "' != '" + 100+ "'", i72.equals(100));

  }

  @Test
  public void test079() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test079"); }


    tp2.Server server0 = new tp2.Server();
    tp2.IP iP5 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    boolean b6 = server0.removeBan(iP5);
    tp2.IP iP11 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i12 = iP11.getThird();
    iP11.setFourth((java.lang.Integer)0);
    iP11.setSecond((java.lang.Integer)3);
    iP11.setFourth((java.lang.Integer)12);
    boolean b19 = server0.addBan(iP11);
    boolean b20 = server0.bansOkTime();
    server0.update();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i12 + "' != '" + (-1)+ "'", i12.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);

  }

  @Test
  public void test080() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test080"); }


    int i2 = java.lang.Integer.compareUnsigned((-2), 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);

  }

  @Test
  public void test081() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test081"); }


    int i1 = java.lang.Integer.numberOfTrailingZeros(201326597);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);

  }

  @Test
  public void test082() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test082"); }


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
    boolean b42 = server0.bansSorted();
    
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
    org.junit.Assert.assertTrue(b42 == true);

  }

  @Test
  public void test083() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test083"); }


    tp2.IP iP4 = new tp2.IP((java.lang.Integer)5, (java.lang.Integer)1, (java.lang.Integer)0, (java.lang.Integer)12);
    java.lang.Integer i5 = iP4.getFirst();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i5 + "' != '" + 5+ "'", i5.equals(5));

  }

  @Test
  public void test084() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test084"); }


    tp2.Server server0 = new tp2.Server();
    tp2.IP iP5 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    boolean b6 = server0.removeBan(iP5);
    boolean b7 = server0.bansSorted();
    tp2.Server server8 = new tp2.Server();
    boolean b9 = server8.exceptionsNotRepeated();
    tp2.IP iP14 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i15 = iP14.getThird();
    iP14.setSecond((java.lang.Integer)10);
    boolean b18 = server8.removeBan(iP14);
    java.lang.Integer i19 = iP14.getSecond();
    boolean b20 = server0.addException(iP14);
    tp2.Server server21 = new tp2.Server();
    boolean b22 = server21.exceptionsNotRepeated();
    tp2.IP iP27 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i28 = iP27.getThird();
    iP27.setSecond((java.lang.Integer)10);
    boolean b31 = server21.removeBan(iP27);
    boolean b32 = server0.addException(iP27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i15 + "' != '" + (-1)+ "'", i15.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i19 + "' != '" + 10+ "'", i19.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i28 + "' != '" + (-1)+ "'", i28.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);

  }

  @Test
  public void test085() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test085"); }


    int i2 = java.lang.Integer.rotateRight(0, 64);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);

  }

  @Test
  public void test086() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test086"); }


    int i2 = java.lang.Integer.rotateRight(536870912, (-1073741824));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 536870912);

  }

  @Test
  public void test087() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test087"); }


    int i2 = java.lang.Integer.compare(25, 11001);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == (-1));

  }

  @Test
  public void test088() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test088"); }


    java.lang.Integer i1 = java.lang.Integer.valueOf(1400000000);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 1400000000+ "'", i1.equals(1400000000));

  }

  @Test
  public void test089() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test089"); }


    tp2.IP iP4 = new tp2.IP((java.lang.Integer)8, (java.lang.Integer)15, (java.lang.Integer)6, (java.lang.Integer)196);

  }

  @Test
  public void test090() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test090"); }


    int i2 = java.lang.Integer.compareUnsigned(177600, 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);

  }

  @Test
  public void test091() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test091"); }


    int i2 = java.lang.Integer.min(1107296276, 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);

  }

  @Test
  public void test092() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test092"); }


    tp2.Server server0 = new tp2.Server();
    tp2.IP iP5 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    boolean b6 = server0.removeBan(iP5);
    boolean b7 = server0.bansSorted();
    boolean b8 = server0.exceptionsNotRepeated();
    tp2.SinglyLinkedList singlyLinkedList9 = new tp2.SinglyLinkedList();
    tp2.IP iP10 = null;
    boolean b11 = singlyLinkedList9.remove(iP10);
    boolean b12 = singlyLinkedList9.isEmpty();
    tp2.IP iP17 = new tp2.IP((java.lang.Integer)5, (java.lang.Integer)1, (java.lang.Integer)0, (java.lang.Integer)12);
    boolean b18 = singlyLinkedList9.contains(iP17);
    tp2.SinglyLinkedList singlyLinkedList19 = new tp2.SinglyLinkedList();
    tp2.IP iP24 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i25 = iP24.getThird();
    boolean b26 = singlyLinkedList19.remove(iP24);
    iP24.setSecond((java.lang.Integer)150994944);
    java.lang.Integer i29 = iP24.getFourth();
    java.lang.Integer i30 = iP24.getThird();
    java.lang.Integer i31 = iP24.getFirst();
    boolean b32 = singlyLinkedList9.contains(iP24);
    tp2.SinglyLinkedList singlyLinkedList33 = new tp2.SinglyLinkedList();
    tp2.IP iP38 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i39 = iP38.getFourth();
    singlyLinkedList33.add(iP38);
    java.lang.Integer i41 = iP38.getFirst();
    boolean b42 = singlyLinkedList9.remove(iP38);
    boolean b43 = server0.removeException(iP38);
    boolean b44 = server0.notSharedElements();
    boolean b45 = server0.bansSorted();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i25 + "' != '" + (-1)+ "'", i25.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i29 + "' != '" + 100+ "'", i29.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i30 + "' != '" + (-1)+ "'", i30.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i31 + "' != '" + (-1)+ "'", i31.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i39 + "' != '" + 100+ "'", i39.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i41 + "' != '" + (-1)+ "'", i41.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b43 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == true);

  }

  @Test
  public void test093() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test093"); }


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
    tp2.IPBan iPBan71 = new tp2.IPBan(iP65, (java.lang.Long)1L);
    
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

  }

  @Test
  public void test094() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test094"); }


    java.lang.Integer i1 = java.lang.Integer.valueOf("8192");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 8192+ "'", i1.equals(8192));

  }

  @Test
  public void test095() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test095"); }


    int i1 = java.lang.Integer.lowestOneBit((-420762406));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 2);

  }

  @Test
  public void test096() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test096"); }


    tp2.SinglyLinkedList singlyLinkedList0 = new tp2.SinglyLinkedList();
    tp2.Server server1 = new tp2.Server();
    boolean b2 = server1.exceptionsNotRepeated();
    tp2.IP iP7 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i8 = iP7.getThird();
    iP7.setSecond((java.lang.Integer)10);
    boolean b11 = server1.removeBan(iP7);
    boolean b12 = singlyLinkedList0.remove(iP7);
    tp2.SinglyLinkedList singlyLinkedList13 = new tp2.SinglyLinkedList();
    tp2.IP iP18 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i19 = iP18.getThird();
    boolean b20 = singlyLinkedList13.remove(iP18);
    tp2.Server server21 = new tp2.Server();
    tp2.IP iP26 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    boolean b27 = server21.removeBan(iP26);
    boolean b28 = singlyLinkedList13.contains(iP26);
    singlyLinkedList0.add(iP26);
    boolean b30 = singlyLinkedList0.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i8 + "' != '" + (-1)+ "'", i8.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i19 + "' != '" + (-1)+ "'", i19.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);

  }

  @Test
  public void test097() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test097"); }


    int i2 = java.lang.Integer.compareUnsigned(134217599, 167772178);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == (-1));

  }

  @Test
  public void test098() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test098"); }


    tp2.IP iP4 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i5 = iP4.getThird();
    iP4.setFourth((java.lang.Integer)0);
    iP4.setSecond((java.lang.Integer)167772160);
    tp2.IPBan iPBan11 = new tp2.IPBan(iP4, (java.lang.Long)26L);
    java.lang.Integer i12 = iP4.getSecond();
    iP4.setFourth((java.lang.Integer)201326784);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i5 + "' != '" + (-1)+ "'", i5.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i12 + "' != '" + 167772160+ "'", i12.equals(167772160));

  }

  @Test
  public void test099() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test099"); }


    int i1 = java.lang.Integer.signum(218103808);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 1);

  }

  @Test
  public void test100() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test100"); }


    tp2.SinglyLinkedList singlyLinkedList0 = new tp2.SinglyLinkedList();
    tp2.Server server1 = new tp2.Server();
    boolean b2 = server1.exceptionsNotRepeated();
    tp2.IP iP7 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i8 = iP7.getThird();
    iP7.setSecond((java.lang.Integer)10);
    boolean b11 = server1.removeBan(iP7);
    boolean b12 = singlyLinkedList0.remove(iP7);
    java.lang.Integer i13 = iP7.getSecond();
    java.lang.Integer i14 = iP7.getSecond();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i8 + "' != '" + (-1)+ "'", i8.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i13 + "' != '" + 10+ "'", i13.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i14 + "' != '" + 10+ "'", i14.equals(10));

  }

  @Test
  public void test101() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test101"); }


    java.lang.String str1 = java.lang.Integer.toHexString(14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "e"+ "'", str1.equals("e"));

  }

  @Test
  public void test102() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test102"); }


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
    tp2.Server server24 = new tp2.Server();
    tp2.IP iP29 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    boolean b30 = server24.removeBan(iP29);
    boolean b31 = server24.bansSorted();
    tp2.Server server32 = new tp2.Server();
    boolean b33 = server32.exceptionsNotRepeated();
    tp2.IP iP38 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i39 = iP38.getThird();
    iP38.setSecond((java.lang.Integer)10);
    boolean b42 = server32.removeBan(iP38);
    java.lang.Integer i43 = iP38.getSecond();
    boolean b44 = server24.addException(iP38);
    java.lang.Integer i45 = iP38.getSecond();
    boolean b47 = iP38.equals((java.lang.Object)"0");
    boolean b48 = server0.addException(iP38);
    
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
    org.junit.Assert.assertTrue(b30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i39 + "' != '" + (-1)+ "'", i39.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i43 + "' != '" + 10+ "'", i43.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i45 + "' != '" + 10+ "'", i45.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b47 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b48 == true);

  }

  @Test
  public void test103() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test103"); }


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
    int i19 = singlyLinkedList0.getSize();
    int i20 = singlyLinkedList0.getSize();
    
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
    org.junit.Assert.assertTrue(i19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 0);

  }

  @Test
  public void test104() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test104"); }


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
    java.lang.Integer i18 = iP9.getFourth();
    
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
    org.junit.Assert.assertTrue("'" + i18 + "' != '" + 100+ "'", i18.equals(100));

  }

  @Test
  public void test105() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test105"); }


    tp2.SinglyLinkedList singlyLinkedList0 = new tp2.SinglyLinkedList();
    tp2.IP iP5 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i6 = iP5.getThird();
    boolean b7 = singlyLinkedList0.remove(iP5);
    tp2.IP iP12 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i13 = iP12.getFourth();
    singlyLinkedList0.add(iP12);
    int i15 = singlyLinkedList0.getSize();
    boolean b16 = singlyLinkedList0.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i6 + "' != '" + (-1)+ "'", i6.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i13 + "' != '" + 100+ "'", i13.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);

  }

  @Test
  public void test106() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test106"); }


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
    boolean b15 = server0.notSharedElements();
    tp2.Server server16 = new tp2.Server();
    boolean b17 = server16.exceptionsNotRepeated();
    boolean b18 = server16.bansSorted();
    tp2.SinglyLinkedList singlyLinkedList19 = new tp2.SinglyLinkedList();
    tp2.IP iP24 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i25 = iP24.getThird();
    boolean b26 = singlyLinkedList19.remove(iP24);
    iP24.setSecond((java.lang.Integer)150994944);
    java.lang.Integer i29 = iP24.getFourth();
    java.lang.Integer i30 = iP24.getThird();
    java.lang.Integer i31 = iP24.getFirst();
    boolean b32 = server16.connect(iP24);
    boolean b33 = server0.connect(iP24);
    tp2.IP iP38 = new tp2.IP((java.lang.Integer)671088644, (java.lang.Integer)512, (java.lang.Integer)1610612786, (java.lang.Integer)256);
    boolean b39 = server0.connect(iP38);
    tp2.Server server40 = new tp2.Server();
    boolean b41 = server40.exceptionsNotRepeated();
    boolean b42 = server40.bansSorted();
    boolean b43 = server40.notSharedElements();
    tp2.SinglyLinkedList singlyLinkedList44 = new tp2.SinglyLinkedList();
    tp2.IP iP49 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i50 = iP49.getFourth();
    singlyLinkedList44.add(iP49);
    boolean b52 = server40.addException(iP49);
    tp2.IPBan iPBan54 = new tp2.IPBan(iP49, (java.lang.Long)727449600L);
    iP49.setSecond((java.lang.Integer)201326624);
    iP49.setFirst((java.lang.Integer)51);
    boolean b59 = server0.addException(iP49);
    boolean b60 = server0.exceptionsNotRepeated();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i25 + "' != '" + (-1)+ "'", i25.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i29 + "' != '" + 100+ "'", i29.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i30 + "' != '" + (-1)+ "'", i30.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i31 + "' != '" + (-1)+ "'", i31.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b43 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i50 + "' != '" + 100+ "'", i50.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b52 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b59 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b60 == true);

  }

  @Test
  public void test107() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test107"); }


    int i2 = java.lang.Integer.compareUnsigned(34603041, 967835608);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == (-1));

  }

  @Test
  public void test108() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test108"); }


    java.lang.Integer i1 = java.lang.Integer.valueOf(24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 24+ "'", i1.equals(24));

  }

  @Test
  public void test109() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test109"); }


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
    tp2.SinglyLinkedList singlyLinkedList65 = new tp2.SinglyLinkedList();
    tp2.IP iP70 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i71 = iP70.getThird();
    boolean b72 = singlyLinkedList65.remove(iP70);
    tp2.IPBan iPBan74 = new tp2.IPBan(iP70, (java.lang.Long)10L);
    java.lang.Long long75 = iPBan74.getExpires();
    iPBan74.setExpires((java.lang.Long)(-1L));
    java.lang.Long long78 = iPBan74.getExpires();
    boolean b79 = strictlySortedSinglyLinkedList0.add(iPBan74);
    boolean b80 = strictlySortedSinglyLinkedList0.isEmpty();
    
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
    org.junit.Assert.assertTrue("'" + i71 + "' != '" + (-1)+ "'", i71.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b72 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long75 + "' != '" + 10L+ "'", long75.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long78 + "' != '" + (-1L)+ "'", long78.equals((-1L)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b79 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b80 == false);

  }

  @Test
  public void test110() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test110"); }


    int i2 = java.lang.Integer.divideUnsigned(177600, (-1610612688));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);

  }

  @Test
  public void test111() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test111"); }


    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList0 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b1 = strictlySortedSinglyLinkedList0.isEmpty();
    tp2.SinglyLinkedList singlyLinkedList2 = new tp2.SinglyLinkedList();
    tp2.IP iP7 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i8 = iP7.getThird();
    boolean b9 = singlyLinkedList2.remove(iP7);
    tp2.IPBan iPBan11 = new tp2.IPBan(iP7, (java.lang.Long)10L);
    tp2.IP iP16 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i17 = iP16.getFourth();
    iPBan11.setIp(iP16);
    java.lang.Long long19 = iPBan11.getExpires();
    java.lang.Long long20 = iPBan11.getExpires();
    tp2.IP iP25 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i26 = iP25.getFirst();
    java.lang.Integer i27 = iP25.getSecond();
    iP25.setFirst((java.lang.Integer)201326592);
    iPBan11.setIp(iP25);
    boolean b31 = strictlySortedSinglyLinkedList0.contains(iPBan11);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList32 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP37 = new tp2.IP((java.lang.Integer)150994944, (java.lang.Integer)784, (java.lang.Integer)784, (java.lang.Integer)2);
    java.lang.Integer i38 = iP37.getFourth();
    boolean b39 = strictlySortedSinglyLinkedList32.removeFromIP(iP37);
    tp2.SinglyLinkedList singlyLinkedList40 = new tp2.SinglyLinkedList();
    tp2.IP iP45 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i46 = iP45.getThird();
    boolean b47 = singlyLinkedList40.remove(iP45);
    java.lang.Integer i48 = iP45.getThird();
    boolean b49 = strictlySortedSinglyLinkedList32.removeFromIP(iP45);
    tp2.IPBan iPBan51 = strictlySortedSinglyLinkedList32.get(469762048);
    tp2.SinglyLinkedList singlyLinkedList52 = new tp2.SinglyLinkedList();
    tp2.IP iP57 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i58 = iP57.getThird();
    boolean b59 = singlyLinkedList52.remove(iP57);
    tp2.IP iP64 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i65 = iP64.getFirst();
    boolean b66 = singlyLinkedList52.remove(iP64);
    boolean b67 = strictlySortedSinglyLinkedList32.containsIP(iP64);
    tp2.IP iP72 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i73 = iP72.getSecond();
    boolean b74 = strictlySortedSinglyLinkedList32.containsIP(iP72);
    tp2.Server server75 = new tp2.Server();
    boolean b76 = server75.notSharedElements();
    tp2.SinglyLinkedList singlyLinkedList77 = new tp2.SinglyLinkedList();
    tp2.IP iP82 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i83 = iP82.getThird();
    boolean b84 = singlyLinkedList77.remove(iP82);
    boolean b85 = server75.addException(iP82);
    java.lang.Integer i86 = iP82.getFirst();
    tp2.IPBan iPBan88 = new tp2.IPBan(iP82, (java.lang.Long)5L);
    tp2.IP iP89 = iPBan88.getIp();
    tp2.IP iP90 = iPBan88.getIp();
    boolean b91 = strictlySortedSinglyLinkedList32.contains(iPBan88);
    boolean b92 = strictlySortedSinglyLinkedList0.contains(iPBan88);
    boolean b93 = strictlySortedSinglyLinkedList0.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i8 + "' != '" + (-1)+ "'", i8.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i17 + "' != '" + 100+ "'", i17.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long19 + "' != '" + 10L+ "'", long19.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long20 + "' != '" + 10L+ "'", long20.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i26 + "' != '" + (-1)+ "'", i26.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i27 + "' != '" + (-1)+ "'", i27.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i38 + "' != '" + 2+ "'", i38.equals(2));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i46 + "' != '" + (-1)+ "'", i46.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b47 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i48 + "' != '" + (-1)+ "'", i48.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b49 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iPBan51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i58 + "' != '" + (-1)+ "'", i58.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b59 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i65 + "' != '" + (-1)+ "'", i65.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b66 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b67 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i73 + "' != '" + (-1)+ "'", i73.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b74 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b76 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i83 + "' != '" + (-1)+ "'", i83.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b84 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b85 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i86 + "' != '" + (-1)+ "'", i86.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP89);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP90);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b91 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b92 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b93 == true);

  }

  @Test
  public void test112() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test112"); }


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
    tp2.IP iP39 = iPBan9.getIp();
    
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
    org.junit.Assert.assertNotNull(iP39);

  }

  @Test
  public void test113() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test113"); }


    tp2.SinglyLinkedList singlyLinkedList0 = new tp2.SinglyLinkedList();
    tp2.IP iP5 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i6 = iP5.getThird();
    boolean b7 = singlyLinkedList0.remove(iP5);
    tp2.IP iP12 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i13 = iP12.getFourth();
    singlyLinkedList0.add(iP12);
    int i15 = singlyLinkedList0.getSize();
    tp2.IP iP20 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i21 = iP20.getThird();
    iP20.setFourth((java.lang.Integer)0);
    boolean b24 = singlyLinkedList0.contains(iP20);
    int i25 = singlyLinkedList0.getSize();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i6 + "' != '" + (-1)+ "'", i6.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i13 + "' != '" + 100+ "'", i13.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i21 + "' != '" + (-1)+ "'", i21.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 1);

  }

  @Test
  public void test114() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test114"); }


    int i1 = java.lang.Integer.lowestOneBit((-1610612688));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 16);

  }

  @Test
  public void test115() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test115"); }


    java.lang.String str1 = java.lang.Integer.toUnsignedString(536870912);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "536870912"+ "'", str1.equals("536870912"));

  }

  @Test
  public void test116() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test116"); }


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
    tp2.IPBan iPBan32 = new tp2.IPBan(iP28, (java.lang.Long)10L);
    tp2.IP iP33 = iPBan32.getIp();
    iPBan32.setExpires((java.lang.Long)11L);
    
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
    org.junit.Assert.assertNotNull(iP33);

  }

  @Test
  public void test117() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test117"); }


    int i2 = java.lang.Integer.compareUnsigned(448, 4096);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == (-1));

  }

  @Test
  public void test118() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test118"); }


    tp2.IP iP4 = new tp2.IP((java.lang.Integer)1610612742, (java.lang.Integer)150994944, (java.lang.Integer)4, (java.lang.Integer)3);
    tp2.IPBan iPBan6 = new tp2.IPBan(iP4, (java.lang.Long)3221225472L);
    java.lang.Integer i7 = iP4.getSecond();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i7 + "' != '" + 150994944+ "'", i7.equals(150994944));

  }

  @Test
  public void test119() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test119"); }


    tp2.Server server0 = new tp2.Server();
    boolean b1 = server0.bansSorted();
    tp2.IP iP6 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i7 = iP6.getFourth();
    boolean b8 = server0.removeException(iP6);
    tp2.ITime iTime9 = null;
    server0.setTime(iTime9);
    boolean b11 = server0.notSharedElements();
    server0.update();
    tp2.SinglyLinkedList singlyLinkedList13 = new tp2.SinglyLinkedList();
    tp2.IP iP18 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i19 = iP18.getThird();
    boolean b20 = singlyLinkedList13.remove(iP18);
    iP18.setSecond((java.lang.Integer)150994944);
    java.lang.Integer i23 = iP18.getFourth();
    java.lang.Integer i24 = iP18.getThird();
    java.lang.Integer i25 = iP18.getFirst();
    tp2.SinglyLinkedList singlyLinkedList26 = new tp2.SinglyLinkedList();
    tp2.IP iP31 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i32 = iP31.getThird();
    boolean b33 = singlyLinkedList26.remove(iP31);
    tp2.IPBan iPBan35 = new tp2.IPBan(iP31, (java.lang.Long)10L);
    java.lang.Long long36 = iPBan35.getExpires();
    java.lang.Long long37 = iPBan35.getExpires();
    tp2.SinglyLinkedList singlyLinkedList38 = new tp2.SinglyLinkedList();
    tp2.IP iP43 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i44 = iP43.getThird();
    boolean b45 = singlyLinkedList38.remove(iP43);
    tp2.IPBan iPBan47 = new tp2.IPBan(iP43, (java.lang.Long)10L);
    tp2.IP iP52 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i53 = iP52.getFourth();
    iPBan47.setIp(iP52);
    iPBan35.setIp(iP52);
    boolean b56 = iP18.equals((java.lang.Object)iP52);
    boolean b57 = server0.addBan(iP52);
    boolean b58 = server0.bansOkTime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i7 + "' != '" + 100+ "'", i7.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i19 + "' != '" + (-1)+ "'", i19.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i23 + "' != '" + 100+ "'", i23.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i24 + "' != '" + (-1)+ "'", i24.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i25 + "' != '" + (-1)+ "'", i25.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i32 + "' != '" + (-1)+ "'", i32.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == false);
    
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
    org.junit.Assert.assertTrue(b56 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b57 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b58 == true);

  }

  @Test
  public void test120() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test120"); }


    java.lang.Integer i2 = java.lang.Integer.getInteger("100", 6291456);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i2 + "' != '" + 6291456+ "'", i2.equals(6291456));

  }

  @Test
  public void test121() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test121"); }


    tp2.Server server0 = new tp2.Server();
    boolean b1 = server0.exceptionsNotRepeated();
    boolean b2 = server0.bansNotRepeatedExpirationOrIP();
    tp2.IP iP7 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i8 = iP7.getFirst();
    java.lang.Integer i9 = iP7.getFirst();
    boolean b10 = server0.connect(iP7);
    boolean b11 = server0.bansNotRepeatedExpirationOrIP();
    boolean b12 = server0.bansOkTime();
    tp2.Server server13 = new tp2.Server();
    boolean b14 = server13.exceptionsNotRepeated();
    tp2.IP iP19 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i20 = iP19.getThird();
    iP19.setSecond((java.lang.Integer)10);
    boolean b23 = server13.removeBan(iP19);
    java.lang.Integer i24 = iP19.getFirst();
    iP19.setFourth((java.lang.Integer)44);
    java.lang.Integer i27 = iP19.getFirst();
    boolean b28 = server0.connect(iP19);
    boolean b29 = server0.bansOkTime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i8 + "' != '" + (-1)+ "'", i8.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + (-1)+ "'", i9.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i20 + "' != '" + (-1)+ "'", i20.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i24 + "' != '" + (-1)+ "'", i24.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i27 + "' != '" + (-1)+ "'", i27.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == true);

  }

  @Test
  public void test122() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test122"); }


    // The following exception was thrown during execution in test generation
    try {
      int i2 = java.lang.Integer.parseInt("11000000000000000000000000001100", 26);
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


    java.lang.String str1 = java.lang.Integer.toHexString(26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "1a"+ "'", str1.equals("1a"));

  }

  @Test
  public void test124() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test124"); }


    int i1 = java.lang.Integer.reverseBytes(1100100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 1154027520);

  }

  @Test
  public void test125() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test125"); }


    int i1 = java.lang.Integer.reverse((-872415232));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 51);

  }

  @Test
  public void test126() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test126"); }


    java.lang.String str1 = java.lang.Integer.toUnsignedString((-621508756));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "3673458540"+ "'", str1.equals("3673458540"));

  }

  @Test
  public void test127() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test127"); }


    tp2.SinglyLinkedList singlyLinkedList0 = new tp2.SinglyLinkedList();
    tp2.IP iP5 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i6 = iP5.getThird();
    boolean b7 = singlyLinkedList0.remove(iP5);
    tp2.IPBan iPBan9 = new tp2.IPBan(iP5, (java.lang.Long)10L);
    java.lang.Long long10 = iPBan9.getExpires();
    iPBan9.setExpires((java.lang.Long)(-1L));
    tp2.IP iP13 = iPBan9.getIp();
    tp2.IP iP14 = iPBan9.getIp();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i6 + "' != '" + (-1)+ "'", i6.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long10 + "' != '" + 10L+ "'", long10.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP14);

  }

  @Test
  public void test128() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test128"); }


    int i1 = java.lang.Integer.lowestOneBit(268451840);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 16384);

  }

  @Test
  public void test129() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test129"); }


    tp2.Server server0 = new tp2.Server();
    boolean b1 = server0.exceptionsNotRepeated();
    boolean b2 = server0.bansSorted();
    boolean b3 = server0.notSharedElements();
    boolean b4 = server0.bansSorted();
    server0.update();
    tp2.IP iP10 = new tp2.IP((java.lang.Integer)11100, (java.lang.Integer)40, (java.lang.Integer)28, (java.lang.Integer)727449600);
    boolean b11 = server0.addException(iP10);
    boolean b12 = server0.notSharedElements();
    
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
    org.junit.Assert.assertTrue(b12 == true);

  }

  @Test
  public void test130() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test130"); }


    tp2.Server server0 = new tp2.Server();
    boolean b1 = server0.bansSorted();
    tp2.IP iP6 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i7 = iP6.getFourth();
    boolean b8 = server0.removeException(iP6);
    boolean b9 = server0.bansOkTime();
    tp2.IP iP14 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i15 = iP14.getThird();
    iP14.setSecond((java.lang.Integer)10);
    java.lang.Integer i18 = null;
    iP14.setSecond(i18);
    boolean b20 = server0.connect(iP14);
    tp2.SinglyLinkedList singlyLinkedList21 = new tp2.SinglyLinkedList();
    tp2.IP iP22 = null;
    boolean b23 = singlyLinkedList21.remove(iP22);
    boolean b24 = singlyLinkedList21.isEmpty();
    tp2.IP iP29 = new tp2.IP((java.lang.Integer)5, (java.lang.Integer)1, (java.lang.Integer)0, (java.lang.Integer)12);
    boolean b30 = singlyLinkedList21.contains(iP29);
    tp2.SinglyLinkedList singlyLinkedList31 = new tp2.SinglyLinkedList();
    tp2.IP iP36 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i37 = iP36.getThird();
    boolean b38 = singlyLinkedList31.remove(iP36);
    iP36.setSecond((java.lang.Integer)150994944);
    java.lang.Integer i41 = iP36.getFourth();
    java.lang.Integer i42 = iP36.getThird();
    java.lang.Integer i43 = iP36.getFirst();
    boolean b44 = singlyLinkedList21.contains(iP36);
    tp2.SinglyLinkedList singlyLinkedList45 = new tp2.SinglyLinkedList();
    tp2.IP iP50 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i51 = iP50.getThird();
    boolean b52 = singlyLinkedList45.remove(iP50);
    java.lang.Integer i53 = iP50.getThird();
    java.lang.Integer i54 = iP50.getSecond();
    boolean b55 = singlyLinkedList21.contains(iP50);
    int i56 = singlyLinkedList21.getSize();
    tp2.Server server57 = new tp2.Server();
    boolean b58 = server57.exceptionsNotRepeated();
    boolean b59 = server57.bansNotRepeatedExpirationOrIP();
    tp2.IP iP64 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i65 = iP64.getFirst();
    java.lang.Integer i66 = iP64.getFirst();
    boolean b67 = server57.connect(iP64);
    boolean b68 = singlyLinkedList21.remove(iP64);
    boolean b69 = server0.connect(iP64);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i7 + "' != '" + 100+ "'", i7.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i15 + "' != '" + (-1)+ "'", i15.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i37 + "' != '" + (-1)+ "'", i37.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i41 + "' != '" + 100+ "'", i41.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i42 + "' != '" + (-1)+ "'", i42.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i43 + "' != '" + (-1)+ "'", i43.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i51 + "' != '" + (-1)+ "'", i51.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b52 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i53 + "' != '" + (-1)+ "'", i53.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i54 + "' != '" + (-1)+ "'", i54.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b55 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i56 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b58 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b59 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i65 + "' != '" + (-1)+ "'", i65.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i66 + "' != '" + (-1)+ "'", i66.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b67 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b68 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b69 == true);

  }

  @Test
  public void test131() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test131"); }


    int i1 = java.lang.Integer.reverse(167772160);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 80);

  }

  @Test
  public void test132() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test132"); }


    int i2 = java.lang.Integer.divideUnsigned(24, 27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);

  }

  @Test
  public void test133() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test133"); }


    java.lang.String str2 = java.lang.Integer.toUnsignedString(26, 2809);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "26"+ "'", str2.equals("26"));

  }

  @Test
  public void test134() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test134"); }


    tp2.IP iP4 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i5 = iP4.getFirst();
    java.lang.Integer i6 = iP4.getFirst();
    java.lang.Integer i7 = iP4.getFirst();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i5 + "' != '" + (-1)+ "'", i5.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i6 + "' != '" + (-1)+ "'", i6.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i7 + "' != '" + (-1)+ "'", i7.equals((-1)));

  }

  @Test
  public void test135() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test135"); }


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
    iPBan83.setExpires((java.lang.Long)2989621248L);
    
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

  }

  @Test
  public void test136() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test136"); }


    tp2.IP iP4 = new tp2.IP((java.lang.Integer)11100, (java.lang.Integer)40, (java.lang.Integer)28, (java.lang.Integer)727449600);
    java.lang.Integer i5 = iP4.getFourth();
    tp2.IPBan iPBan7 = new tp2.IPBan(iP4, (java.lang.Long)784L);
    tp2.IP iP12 = new tp2.IP((java.lang.Integer)150994944, (java.lang.Integer)784, (java.lang.Integer)784, (java.lang.Integer)2);
    java.lang.Integer i13 = iP12.getFourth();
    iP12.setSecond((java.lang.Integer)805306368);
    boolean b16 = iP4.equals((java.lang.Object)iP12);
    java.lang.Integer i17 = null;
    iP12.setSecond(i17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i5 + "' != '" + 727449600+ "'", i5.equals(727449600));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i13 + "' != '" + 2+ "'", i13.equals(2));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);

  }

  @Test
  public void test137() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test137"); }


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
    boolean b24 = server0.bansNotRepeatedExpirationOrIP();
    
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
  public void test138() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test138"); }


    tp2.IP iP4 = new tp2.IP((java.lang.Integer)11100, (java.lang.Integer)40, (java.lang.Integer)28, (java.lang.Integer)727449600);
    java.lang.Integer i5 = iP4.getFourth();
    iP4.setThird((java.lang.Integer)(-2147483648));
    java.lang.Integer i8 = iP4.getSecond();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i5 + "' != '" + 727449600+ "'", i5.equals(727449600));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i8 + "' != '" + 40+ "'", i8.equals(40));

  }

  @Test
  public void test139() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test139"); }


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
    boolean b34 = singlyLinkedList0.isEmpty();
    
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
    org.junit.Assert.assertTrue(b34 == true);

  }

  @Test
  public void test140() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test140"); }


    // The following exception was thrown during execution in test generation
    try {
      int i1 = java.lang.Integer.parseInt("c000020");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test141() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test141"); }


    int i2 = java.lang.Integer.divideUnsigned(4096, 256);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 16);

  }

  @Test
  public void test142() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test142"); }


    java.lang.String str1 = java.lang.Integer.toOctalString(2500);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "4704"+ "'", str1.equals("4704"));

  }

  @Test
  public void test143() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test143"); }


    // The following exception was thrown during execution in test generation
    try {
      int i2 = java.lang.Integer.parseInt("17777777777", 268451840);
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test144() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test144"); }


    tp2.IP iP4 = new tp2.IP((java.lang.Integer)1441923072, (java.lang.Integer)11, (java.lang.Integer)6291456, (java.lang.Integer)637534288);

  }

  @Test
  public void test145() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test145"); }


    java.lang.Integer i1 = java.lang.Integer.valueOf("11001");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 11001+ "'", i1.equals(11001));

  }

  @Test
  public void test146() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test146"); }


    int i1 = java.lang.Integer.reverseBytes(4194304);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 16384);

  }

  @Test
  public void test147() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test147"); }


    tp2.Server server0 = new tp2.Server();
    tp2.IP iP5 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    boolean b6 = server0.removeBan(iP5);
    boolean b7 = server0.bansSorted();
    boolean b8 = server0.exceptionsNotRepeated();
    tp2.IP iP13 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i14 = iP13.getThird();
    iP13.setFourth((java.lang.Integer)0);
    boolean b17 = server0.connect(iP13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i14 + "' != '" + (-1)+ "'", i14.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);

  }

  @Test
  public void test148() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test148"); }


    tp2.Server server0 = new tp2.Server();
    boolean b1 = server0.exceptionsNotRepeated();
    tp2.IP iP6 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i7 = iP6.getThird();
    iP6.setSecond((java.lang.Integer)10);
    boolean b10 = server0.removeBan(iP6);
    boolean b11 = server0.bansNotRepeatedExpirationOrIP();
    tp2.IP iP16 = new tp2.IP((java.lang.Integer)4, (java.lang.Integer)12, (java.lang.Integer)11100, (java.lang.Integer)134217728);
    tp2.IPBan iPBan18 = new tp2.IPBan(iP16, (java.lang.Long)144L);
    iP16.setThird((java.lang.Integer)(-621508756));
    boolean b21 = server0.removeException(iP16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i7 + "' != '" + (-1)+ "'", i7.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);

  }

  @Test
  public void test149() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test149"); }


    // The following exception was thrown during execution in test generation
    try {
      int i2 = java.lang.Integer.divideUnsigned(2809, 0);
      org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException");
    } catch (java.lang.ArithmeticException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArithmeticException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test150() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test150"); }


    java.lang.String str1 = java.lang.Integer.toOctalString(16384);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "40000"+ "'", str1.equals("40000"));

  }

  @Test
  public void test151() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test151"); }


    tp2.Server server0 = new tp2.Server();
    boolean b1 = server0.bansSorted();
    tp2.IP iP6 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i7 = iP6.getFourth();
    boolean b8 = server0.removeException(iP6);
    tp2.ITime iTime9 = null;
    server0.setTime(iTime9);
    boolean b11 = server0.notSharedElements();
    server0.update();
    tp2.SinglyLinkedList singlyLinkedList13 = new tp2.SinglyLinkedList();
    tp2.IP iP14 = null;
    boolean b15 = singlyLinkedList13.remove(iP14);
    boolean b16 = singlyLinkedList13.isEmpty();
    tp2.IP iP21 = new tp2.IP((java.lang.Integer)5, (java.lang.Integer)1, (java.lang.Integer)0, (java.lang.Integer)12);
    boolean b22 = singlyLinkedList13.contains(iP21);
    tp2.SinglyLinkedList singlyLinkedList23 = new tp2.SinglyLinkedList();
    tp2.IP iP28 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i29 = iP28.getThird();
    boolean b30 = singlyLinkedList23.remove(iP28);
    iP28.setSecond((java.lang.Integer)150994944);
    java.lang.Integer i33 = iP28.getFourth();
    java.lang.Integer i34 = iP28.getThird();
    java.lang.Integer i35 = iP28.getFirst();
    boolean b36 = singlyLinkedList13.contains(iP28);
    tp2.SinglyLinkedList singlyLinkedList37 = new tp2.SinglyLinkedList();
    tp2.IP iP42 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i43 = iP42.getThird();
    boolean b44 = singlyLinkedList37.remove(iP42);
    java.lang.Integer i45 = iP42.getThird();
    java.lang.Integer i46 = iP42.getSecond();
    boolean b47 = singlyLinkedList13.contains(iP42);
    boolean b48 = server0.removeException(iP42);
    java.lang.Integer i49 = iP42.getThird();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i7 + "' != '" + 100+ "'", i7.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i29 + "' != '" + (-1)+ "'", i29.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i33 + "' != '" + 100+ "'", i33.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i34 + "' != '" + (-1)+ "'", i34.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i35 + "' != '" + (-1)+ "'", i35.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i43 + "' != '" + (-1)+ "'", i43.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i45 + "' != '" + (-1)+ "'", i45.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i46 + "' != '" + (-1)+ "'", i46.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b47 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b48 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i49 + "' != '" + (-1)+ "'", i49.equals((-1)));

  }

  @Test
  public void test152() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test152"); }


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
    tp2.IP iP70 = singlyLinkedList0.get(24);
    
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
  public void test153() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test153"); }


    int i1 = java.lang.Integer.lowestOneBit(31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 1);

  }

  @Test
  public void test154() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test154"); }


    int i2 = java.lang.Integer.compare(11100, 22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);

  }

  @Test
  public void test155() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test155"); }


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
    boolean b23 = server0.exceptionsNotRepeated();
    boolean b24 = server0.bansSorted();
    boolean b25 = server0.notSharedElements();
    server0.update();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);

  }

  @Test
  public void test156() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test156"); }


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
    boolean b65 = strictlySortedSinglyLinkedList0.isEmpty();
    int i66 = strictlySortedSinglyLinkedList0.getSize();
    
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
    org.junit.Assert.assertTrue(b65 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i66 == 0);

  }

  @Test
  public void test157() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test157"); }


    java.lang.Integer i1 = java.lang.Integer.valueOf(436207616);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 436207616+ "'", i1.equals(436207616));

  }

  @Test
  public void test158() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test158"); }


    int i2 = java.lang.Integer.divideUnsigned(23, 80);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);

  }

  @Test
  public void test159() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test159"); }


    int i2 = java.lang.Integer.compareUnsigned(33554432, (-1305346048));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == (-1));

  }

  @Test
  public void test160() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test160"); }


    int i1 = java.lang.Integer.numberOfLeadingZeros(436219526);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 3);

  }

  @Test
  public void test161() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test161"); }


    tp2.Server server0 = new tp2.Server();
    boolean b1 = server0.notSharedElements();
    tp2.SinglyLinkedList singlyLinkedList2 = new tp2.SinglyLinkedList();
    tp2.IP iP7 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i8 = iP7.getThird();
    boolean b9 = singlyLinkedList2.remove(iP7);
    boolean b10 = server0.addException(iP7);
    java.lang.Integer i11 = iP7.getFirst();
    tp2.IPBan iPBan13 = new tp2.IPBan(iP7, (java.lang.Long)5L);
    tp2.IP iP14 = iPBan13.getIp();
    tp2.IP iP15 = iPBan13.getIp();
    java.lang.Integer i16 = null;
    iP15.setFourth(i16);
    java.lang.Integer i18 = iP15.getSecond();
    
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
    org.junit.Assert.assertNotNull(iP14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i18 + "' != '" + (-1)+ "'", i18.equals((-1)));

  }

  @Test
  public void test162() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test162"); }


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
    tp2.IPBan iPBan21 = strictlySortedSinglyLinkedList0.get(8);
    tp2.IPBan iPBan23 = strictlySortedSinglyLinkedList0.get(10);
    tp2.IPBan iPBan25 = strictlySortedSinglyLinkedList0.get(655360);
    
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
    org.junit.Assert.assertNull(iPBan23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iPBan25);

  }

  @Test
  public void test163() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test163"); }


    int i1 = java.lang.Integer.bitCount(448);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 3);

  }

  @Test
  public void test164() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test164"); }


    tp2.Server server0 = new tp2.Server();
    boolean b1 = server0.exceptionsNotRepeated();
    boolean b2 = server0.bansNotRepeatedExpirationOrIP();
    tp2.IP iP7 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i8 = iP7.getFirst();
    java.lang.Integer i9 = iP7.getFirst();
    boolean b10 = server0.connect(iP7);
    boolean b11 = server0.bansNotRepeatedExpirationOrIP();
    boolean b12 = server0.bansOkTime();
    server0.update();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i8 + "' != '" + (-1)+ "'", i8.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + (-1)+ "'", i9.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);

  }

  @Test
  public void test165() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test165"); }


    java.lang.Integer i2 = java.lang.Integer.getInteger("33554432", (java.lang.Integer)100000);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i2 + "' != '" + 100000+ "'", i2.equals(100000));

  }

  @Test
  public void test166() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test166"); }


    java.lang.String str1 = java.lang.Integer.toOctalString(167772160);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "1200000000"+ "'", str1.equals("1200000000"));

  }

  @Test
  public void test167() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test167"); }


    // The following exception was thrown during execution in test generation
    try {
      int i1 = java.lang.Integer.parseInt("11010000000000000000000011010");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test168() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test168"); }


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
    iP39.setThird((java.lang.Integer)32);
    
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
  public void test169() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test169"); }


    // The following exception was thrown during execution in test generation
    try {
      java.lang.Integer i2 = java.lang.Integer.valueOf("4000", 146800640);
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

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test170"); }


    int i2 = java.lang.Integer.min(44, 805306368);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 44);

  }

  @Test
  public void test171() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test171"); }


    int i2 = java.lang.Integer.sum(201326784, 14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 201326798);

  }

  @Test
  public void test172() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test172"); }


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
    tp2.Server server21 = new tp2.Server();
    boolean b22 = server21.exceptionsNotRepeated();
    boolean b23 = server21.bansSorted();
    boolean b24 = server21.notSharedElements();
    tp2.SinglyLinkedList singlyLinkedList25 = new tp2.SinglyLinkedList();
    tp2.IP iP30 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i31 = iP30.getFourth();
    singlyLinkedList25.add(iP30);
    boolean b33 = server21.addException(iP30);
    java.lang.Integer i34 = iP30.getFourth();
    boolean b35 = strictlySortedSinglyLinkedList0.removeFromIP(iP30);
    
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
    org.junit.Assert.assertTrue(b22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i31 + "' != '" + 100+ "'", i31.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i34 + "' != '" + 100+ "'", i34.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == false);

  }

  @Test
  public void test173() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test173"); }


    java.lang.Integer i1 = new java.lang.Integer("4704");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 4704+ "'", i1.equals(4704));

  }

  @Test
  public void test174() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test174"); }


    tp2.Server server0 = new tp2.Server();
    boolean b1 = server0.exceptionsNotRepeated();
    tp2.IP iP6 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i7 = iP6.getThird();
    iP6.setSecond((java.lang.Integer)10);
    boolean b10 = server0.removeBan(iP6);
    boolean b11 = server0.exceptionsNotRepeated();
    tp2.IP iP12 = null;
    boolean b13 = server0.addBan(iP12);
    boolean b14 = server0.notSharedElements();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i7 + "' != '" + (-1)+ "'", i7.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);

  }

  @Test
  public void test175() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test175"); }


    // The following exception was thrown during execution in test generation
    try {
      java.lang.Integer i1 = java.lang.Integer.decode("11010000000000000000000011010");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test176() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test176"); }


    int i2 = java.lang.Integer.compareUnsigned(1546321920, 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);

  }

  @Test
  public void test177() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test177"); }


    int i1 = java.lang.Integer.numberOfLeadingZeros(436207642);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 3);

  }

  @Test
  public void test178() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test178"); }


    int i1 = java.lang.Integer.reverse(805306368);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 12);

  }

  @Test
  public void test179() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test179"); }


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
    boolean b18 = singlyLinkedList10.isEmpty();
    int i19 = singlyLinkedList10.getSize();
    tp2.IP iP24 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i25 = iP24.getThird();
    iP24.setFourth((java.lang.Integer)0);
    boolean b28 = singlyLinkedList10.contains(iP24);
    boolean b29 = singlyLinkedList10.isEmpty();
    tp2.IP iP34 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i35 = iP34.getFirst();
    java.lang.Integer i36 = iP34.getFirst();
    singlyLinkedList10.add(iP34);
    tp2.SinglyLinkedList singlyLinkedList38 = new tp2.SinglyLinkedList();
    tp2.IP iP43 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i44 = iP43.getThird();
    boolean b45 = singlyLinkedList38.remove(iP43);
    tp2.Server server46 = new tp2.Server();
    tp2.IP iP51 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    boolean b52 = server46.removeBan(iP51);
    boolean b53 = singlyLinkedList38.contains(iP51);
    singlyLinkedList10.add(iP51);
    tp2.SinglyLinkedList singlyLinkedList55 = new tp2.SinglyLinkedList();
    tp2.IP iP60 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i61 = iP60.getThird();
    boolean b62 = singlyLinkedList55.remove(iP60);
    tp2.Server server63 = new tp2.Server();
    tp2.IP iP68 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    boolean b69 = server63.removeBan(iP68);
    boolean b70 = singlyLinkedList55.contains(iP68);
    singlyLinkedList10.add(iP68);
    java.lang.Integer i72 = iP68.getFirst();
    boolean b73 = singlyLinkedList0.remove(iP68);
    tp2.IP iP75 = singlyLinkedList0.get(201326597);
    int i76 = singlyLinkedList0.getSize();
    
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
    org.junit.Assert.assertTrue("'" + i35 + "' != '" + (-1)+ "'", i35.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i36 + "' != '" + (-1)+ "'", i36.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i44 + "' != '" + (-1)+ "'", i44.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b52 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b53 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i61 + "' != '" + (-1)+ "'", i61.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b62 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b69 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b70 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i72 + "' != '" + (-1)+ "'", i72.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b73 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP75);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i76 == 0);

  }

  @Test
  public void test180() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test180"); }


    // The following exception was thrown during execution in test generation
    try {
      java.lang.Integer i1 = java.lang.Integer.valueOf("1101000000000000000000000000");
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


    tp2.Server server0 = new tp2.Server();
    tp2.IP iP5 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    boolean b6 = server0.removeBan(iP5);
    boolean b7 = server0.bansNotRepeatedExpirationOrIP();
    tp2.SinglyLinkedList singlyLinkedList8 = new tp2.SinglyLinkedList();
    tp2.Server server9 = new tp2.Server();
    boolean b10 = server9.exceptionsNotRepeated();
    tp2.IP iP15 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i16 = iP15.getThird();
    iP15.setSecond((java.lang.Integer)10);
    boolean b19 = server9.removeBan(iP15);
    boolean b20 = singlyLinkedList8.remove(iP15);
    tp2.IP iP21 = null;
    singlyLinkedList8.add(iP21);
    tp2.IP iP24 = singlyLinkedList8.get(469762048);
    tp2.SinglyLinkedList singlyLinkedList25 = new tp2.SinglyLinkedList();
    tp2.IP iP30 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i31 = iP30.getThird();
    boolean b32 = singlyLinkedList25.remove(iP30);
    tp2.IPBan iPBan34 = new tp2.IPBan(iP30, (java.lang.Long)10L);
    tp2.IP iP39 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i40 = iP39.getFourth();
    iPBan34.setIp(iP39);
    java.lang.Long long42 = iPBan34.getExpires();
    java.lang.Long long43 = iPBan34.getExpires();
    tp2.IP iP48 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i49 = iP48.getFirst();
    java.lang.Integer i50 = iP48.getSecond();
    iP48.setFirst((java.lang.Integer)201326592);
    iPBan34.setIp(iP48);
    tp2.SinglyLinkedList singlyLinkedList54 = new tp2.SinglyLinkedList();
    tp2.Server server55 = new tp2.Server();
    boolean b56 = server55.exceptionsNotRepeated();
    tp2.IP iP61 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i62 = iP61.getThird();
    iP61.setSecond((java.lang.Integer)10);
    boolean b65 = server55.removeBan(iP61);
    boolean b66 = singlyLinkedList54.remove(iP61);
    tp2.SinglyLinkedList singlyLinkedList67 = new tp2.SinglyLinkedList();
    tp2.IP iP72 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i73 = iP72.getThird();
    boolean b74 = singlyLinkedList67.remove(iP72);
    tp2.Server server75 = new tp2.Server();
    tp2.IP iP80 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    boolean b81 = server75.removeBan(iP80);
    boolean b82 = singlyLinkedList67.contains(iP80);
    singlyLinkedList54.add(iP80);
    iPBan34.setIp(iP80);
    boolean b85 = singlyLinkedList8.remove(iP80);
    boolean b86 = server0.addException(iP80);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i16 + "' != '" + (-1)+ "'", i16.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i31 + "' != '" + (-1)+ "'", i31.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i40 + "' != '" + 100+ "'", i40.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long42 + "' != '" + 10L+ "'", long42.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long43 + "' != '" + 10L+ "'", long43.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i49 + "' != '" + (-1)+ "'", i49.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i50 + "' != '" + (-1)+ "'", i50.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b56 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i62 + "' != '" + (-1)+ "'", i62.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b65 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b66 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i73 + "' != '" + (-1)+ "'", i73.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b74 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b81 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b82 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b85 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b86 == true);

  }

  @Test
  public void test182() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test182"); }


    long long1 = java.lang.Integer.toUnsignedLong(12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == 12L);

  }

  @Test
  public void test183() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test183"); }


    java.lang.String str1 = java.lang.Integer.toBinaryString(11001);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "10101011111001"+ "'", str1.equals("10101011111001"));

  }

  @Test
  public void test184() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test184"); }


    int i2 = java.lang.Integer.remainderUnsigned(51, 201326624);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 51);

  }

  @Test
  public void test185() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test185"); }


    int i1 = java.lang.Integer.numberOfLeadingZeros(201326798);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 4);

  }

  @Test
  public void test186() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test186"); }


    int i2 = java.lang.Integer.rotateLeft(4096, 26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 64);

  }

  @Test
  public void test187() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test187"); }


    tp2.SinglyLinkedList singlyLinkedList0 = new tp2.SinglyLinkedList();
    tp2.IP iP5 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i6 = iP5.getThird();
    boolean b7 = singlyLinkedList0.remove(iP5);
    tp2.IP iP12 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i13 = iP12.getFirst();
    boolean b14 = singlyLinkedList0.remove(iP12);
    java.lang.Integer i15 = iP12.getSecond();
    tp2.IPBan iPBan17 = new tp2.IPBan(iP12, (java.lang.Long)(-1L));
    java.lang.Object obj18 = null;
    boolean b19 = iP12.equals(obj18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i6 + "' != '" + (-1)+ "'", i6.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i13 + "' != '" + (-1)+ "'", i13.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i15 + "' != '" + (-1)+ "'", i15.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);

  }

  @Test
  public void test188() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test188"); }


    java.lang.String str1 = java.lang.Integer.toHexString(56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "38"+ "'", str1.equals("38"));

  }

  @Test
  public void test189() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test189"); }


    java.lang.Integer i1 = new java.lang.Integer(14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 14+ "'", i1.equals(14));

  }

  @Test
  public void test190() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test190"); }


    int i2 = java.lang.Integer.rotateLeft(88770, (-1601830656));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 88770);

  }

  @Test
  public void test191() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test191"); }


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
    tp2.Server server44 = new tp2.Server();
    boolean b45 = server44.exceptionsNotRepeated();
    boolean b46 = server44.bansSorted();
    boolean b47 = server44.notSharedElements();
    boolean b48 = server44.bansSorted();
    server44.update();
    tp2.IP iP54 = new tp2.IP((java.lang.Integer)11100, (java.lang.Integer)40, (java.lang.Integer)28, (java.lang.Integer)727449600);
    boolean b55 = server44.addException(iP54);
    server44.update();
    server44.update();
    tp2.SinglyLinkedList singlyLinkedList58 = new tp2.SinglyLinkedList();
    tp2.IP iP63 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i64 = iP63.getThird();
    boolean b65 = singlyLinkedList58.remove(iP63);
    tp2.IPBan iPBan67 = new tp2.IPBan(iP63, (java.lang.Long)10L);
    tp2.IP iP72 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i73 = iP72.getFourth();
    iPBan67.setIp(iP72);
    java.lang.Long long75 = iPBan67.getExpires();
    java.lang.Long long76 = iPBan67.getExpires();
    tp2.Server server77 = new tp2.Server();
    boolean b78 = server77.exceptionsNotRepeated();
    tp2.IP iP83 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i84 = iP83.getThird();
    iP83.setSecond((java.lang.Integer)10);
    boolean b87 = server77.removeBan(iP83);
    java.lang.Integer i88 = iP83.getFirst();
    iPBan67.setIp(iP83);
    iP83.setFourth((java.lang.Integer)11884);
    boolean b92 = server44.removeBan(iP83);
    boolean b93 = server0.addBan(iP83);
    iP83.setFirst((java.lang.Integer)31);
    
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
    org.junit.Assert.assertTrue(b45 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b46 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b47 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b48 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b55 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i64 + "' != '" + (-1)+ "'", i64.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b65 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i73 + "' != '" + 100+ "'", i73.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long75 + "' != '" + 10L+ "'", long75.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long76 + "' != '" + 10L+ "'", long76.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b78 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i84 + "' != '" + (-1)+ "'", i84.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b87 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i88 + "' != '" + (-1)+ "'", i88.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b92 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b93 == true);

  }

  @Test
  public void test192() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test192"); }


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
    tp2.ITime iTime21 = null;
    server0.setTime(iTime21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i12 + "' != '" + (-1)+ "'", i12.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);

  }

  @Test
  public void test193() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test193"); }


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
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList58 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP63 = new tp2.IP((java.lang.Integer)150994944, (java.lang.Integer)11100, (java.lang.Integer)784, (java.lang.Integer)0);
    boolean b64 = strictlySortedSinglyLinkedList58.removeFromIP(iP63);
    int i65 = strictlySortedSinglyLinkedList58.getSize();
    tp2.Server server66 = new tp2.Server();
    boolean b67 = server66.notSharedElements();
    tp2.SinglyLinkedList singlyLinkedList68 = new tp2.SinglyLinkedList();
    tp2.IP iP73 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i74 = iP73.getThird();
    boolean b75 = singlyLinkedList68.remove(iP73);
    boolean b76 = server66.addException(iP73);
    java.lang.Integer i77 = iP73.getFourth();
    boolean b78 = strictlySortedSinglyLinkedList58.containsIP(iP73);
    int i79 = strictlySortedSinglyLinkedList58.getSize();
    tp2.IPBan iPBan80 = null;
    boolean b81 = strictlySortedSinglyLinkedList58.add(iPBan80);
    tp2.IP iP86 = new tp2.IP((java.lang.Integer)11100, (java.lang.Integer)40, (java.lang.Integer)28, (java.lang.Integer)727449600);
    java.lang.Integer i87 = iP86.getFourth();
    tp2.IPBan iPBan89 = new tp2.IPBan(iP86, (java.lang.Long)784L);
    boolean b90 = strictlySortedSinglyLinkedList58.contains(iPBan89);
    tp2.IP iP95 = new tp2.IP((java.lang.Integer)5, (java.lang.Integer)1, (java.lang.Integer)0, (java.lang.Integer)12);
    iPBan89.setIp(iP95);
    boolean b97 = strictlySortedSinglyLinkedList0.contains(iPBan89);
    
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
    org.junit.Assert.assertTrue(b64 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i65 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b67 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i74 + "' != '" + (-1)+ "'", i74.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b75 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b76 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i77 + "' != '" + 100+ "'", i77.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b78 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i79 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b81 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i87 + "' != '" + 727449600+ "'", i87.equals(727449600));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b90 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b97 == false);

  }

  @Test
  public void test194() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test194"); }


    int i2 = java.lang.Integer.sum(637534288, 24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 637534312);

  }

  @Test
  public void test195() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test195"); }


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
    tp2.IPBan iPBan32 = new tp2.IPBan(iP28, (java.lang.Long)10L);
    tp2.IP iP33 = iPBan32.getIp();
    tp2.IP iP34 = iPBan32.getIp();
    
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
    org.junit.Assert.assertNotNull(iP33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP34);

  }

  @Test
  public void test196() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test196"); }


    // The following exception was thrown during execution in test generation
    try {
      int i2 = java.lang.Integer.parseInt("536870912", 671088644);
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

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test197"); }


    int i2 = java.lang.Integer.max(637534288, 80007168);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 637534288);

  }

  @Test
  public void test198() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test198"); }


    tp2.Server server0 = new tp2.Server();
    boolean b1 = server0.exceptionsNotRepeated();
    tp2.IP iP6 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i7 = iP6.getThird();
    iP6.setSecond((java.lang.Integer)10);
    boolean b10 = server0.removeBan(iP6);
    boolean b11 = server0.exceptionsNotRepeated();
    boolean b12 = server0.bansOkTime();
    boolean b13 = server0.exceptionsNotRepeated();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i7 + "' != '" + (-1)+ "'", i7.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);

  }

  @Test
  public void test199() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test199"); }


    // The following exception was thrown during execution in test generation
    try {
      java.lang.Integer i1 = java.lang.Integer.decode("3673458540");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test200() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test200"); }


    int i2 = java.lang.Integer.rotateRight(26, 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 26);

  }

  @Test
  public void test201() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test201"); }


    tp2.Server server0 = new tp2.Server();
    boolean b1 = server0.notSharedElements();
    boolean b2 = server0.bansOkTime();
    server0.update();
    boolean b4 = server0.bansNotRepeatedExpirationOrIP();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);

  }

  @Test
  public void test202() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test202"); }


    java.lang.Integer i2 = java.lang.Integer.getInteger("2147483647", 56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i2 + "' != '" + 56+ "'", i2.equals(56));

  }

  @Test
  public void test203() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test203"); }


    long long1 = java.lang.Integer.toUnsignedLong(150994944);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == 150994944L);

  }

  @Test
  public void test204() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test204"); }


    int i1 = java.lang.Integer.reverse(27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == (-671088640));

  }

  @Test
  public void test205() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test205"); }


    tp2.IP iP4 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i5 = iP4.getFirst();
    java.lang.Integer i6 = iP4.getFourth();
    tp2.IPBan iPBan8 = new tp2.IPBan(iP4, (java.lang.Long)100L);
    iPBan8.setExpires((java.lang.Long)0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i5 + "' != '" + (-1)+ "'", i5.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i6 + "' != '" + 100+ "'", i6.equals(100));

  }

  @Test
  public void test206() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test206"); }


    long long1 = java.lang.Integer.toUnsignedLong(64);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == 64L);

  }

  @Test
  public void test207() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test207"); }


    java.lang.Integer i2 = null;
    // The following exception was thrown during execution in test generation
    try {
      tp2.IP iP4 = new tp2.IP((java.lang.Integer)807927808, (java.lang.Integer)144, i2, (java.lang.Integer)1610612742);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test208() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test208"); }


    int i1 = java.lang.Integer.signum(4194304);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 1);

  }

  @Test
  public void test209() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test209"); }


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
    boolean b74 = strictlySortedSinglyLinkedList0.isEmpty();
    
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
    org.junit.Assert.assertTrue(b74 == false);

  }

  @Test
  public void test210() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test210"); }


    tp2.Server server0 = new tp2.Server();
    tp2.IP iP5 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    boolean b6 = server0.removeBan(iP5);
    iP5.setThird((java.lang.Integer)167772260);
    tp2.IPBan iPBan10 = new tp2.IPBan(iP5, (java.lang.Long)784L);
    tp2.SinglyLinkedList singlyLinkedList11 = new tp2.SinglyLinkedList();
    tp2.IP iP16 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i17 = iP16.getThird();
    boolean b18 = singlyLinkedList11.remove(iP16);
    tp2.IPBan iPBan20 = new tp2.IPBan(iP16, (java.lang.Long)10L);
    java.lang.Integer i21 = iP16.getSecond();
    iPBan10.setIp(iP16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i17 + "' != '" + (-1)+ "'", i17.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i21 + "' != '" + (-1)+ "'", i21.equals((-1)));

  }

  @Test
  public void test211() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test211"); }


    int i2 = java.lang.Integer.divideUnsigned(146800640, 28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 5242880);

  }

  @Test
  public void test212() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test212"); }


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
    tp2.IP iP29 = singlyLinkedList0.get(727449600);
    tp2.IP iP31 = singlyLinkedList0.get((-1073741812));
    int i32 = singlyLinkedList0.getSize();
    boolean b33 = singlyLinkedList0.isEmpty();
    
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
    org.junit.Assert.assertNull(iP29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i32 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == false);

  }

  @Test
  public void test213() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test213"); }


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
    int i38 = strictlySortedSinglyLinkedList0.getSize();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList39 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP44 = new tp2.IP((java.lang.Integer)150994944, (java.lang.Integer)784, (java.lang.Integer)784, (java.lang.Integer)2);
    java.lang.Integer i45 = iP44.getFourth();
    boolean b46 = strictlySortedSinglyLinkedList39.removeFromIP(iP44);
    tp2.SinglyLinkedList singlyLinkedList47 = new tp2.SinglyLinkedList();
    tp2.IP iP52 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i53 = iP52.getThird();
    boolean b54 = singlyLinkedList47.remove(iP52);
    java.lang.Integer i55 = iP52.getThird();
    boolean b56 = strictlySortedSinglyLinkedList39.removeFromIP(iP52);
    tp2.IPBan iPBan58 = strictlySortedSinglyLinkedList39.get(469762048);
    tp2.IPBan iPBan60 = strictlySortedSinglyLinkedList39.get(1100100);
    tp2.Server server61 = new tp2.Server();
    tp2.ITime iTime62 = null;
    server61.setTime(iTime62);
    tp2.Server server64 = new tp2.Server();
    boolean b65 = server64.notSharedElements();
    tp2.SinglyLinkedList singlyLinkedList66 = new tp2.SinglyLinkedList();
    tp2.IP iP71 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i72 = iP71.getThird();
    boolean b73 = singlyLinkedList66.remove(iP71);
    boolean b74 = server64.addException(iP71);
    java.lang.Integer i75 = iP71.getFirst();
    tp2.IPBan iPBan77 = new tp2.IPBan(iP71, (java.lang.Long)5L);
    boolean b78 = server61.connect(iP71);
    boolean b79 = strictlySortedSinglyLinkedList39.containsIP(iP71);
    boolean b80 = strictlySortedSinglyLinkedList0.containsIP(iP71);
    
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
    org.junit.Assert.assertTrue(i38 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i45 + "' != '" + 2+ "'", i45.equals(2));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b46 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i53 + "' != '" + (-1)+ "'", i53.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b54 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i55 + "' != '" + (-1)+ "'", i55.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b56 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iPBan58);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iPBan60);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b65 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i72 + "' != '" + (-1)+ "'", i72.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b73 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b74 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i75 + "' != '" + (-1)+ "'", i75.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b78 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b79 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b80 == false);

  }

  @Test
  public void test214() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test214"); }


    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList0 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP5 = new tp2.IP((java.lang.Integer)150994944, (java.lang.Integer)784, (java.lang.Integer)784, (java.lang.Integer)2);
    java.lang.Integer i6 = iP5.getFourth();
    boolean b7 = strictlySortedSinglyLinkedList0.removeFromIP(iP5);
    boolean b8 = strictlySortedSinglyLinkedList0.isEmpty();
    int i9 = strictlySortedSinglyLinkedList0.getSize();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i6 + "' != '" + 2+ "'", i6.equals(2));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);

  }

  @Test
  public void test215() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test215"); }


    tp2.SinglyLinkedList singlyLinkedList0 = new tp2.SinglyLinkedList();
    tp2.IP iP1 = null;
    boolean b2 = singlyLinkedList0.remove(iP1);
    boolean b3 = singlyLinkedList0.isEmpty();
    tp2.IP iP8 = new tp2.IP((java.lang.Integer)5, (java.lang.Integer)1, (java.lang.Integer)0, (java.lang.Integer)12);
    boolean b9 = singlyLinkedList0.contains(iP8);
    tp2.IP iP11 = singlyLinkedList0.get(2621440);
    tp2.SinglyLinkedList singlyLinkedList12 = new tp2.SinglyLinkedList();
    tp2.IP iP17 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i18 = iP17.getThird();
    boolean b19 = singlyLinkedList12.remove(iP17);
    tp2.IPBan iPBan21 = new tp2.IPBan(iP17, (java.lang.Long)10L);
    tp2.IP iP26 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i27 = iP26.getFourth();
    iPBan21.setIp(iP26);
    java.lang.Long long29 = iPBan21.getExpires();
    java.lang.Long long30 = iPBan21.getExpires();
    tp2.IP iP35 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i36 = iP35.getFirst();
    java.lang.Integer i37 = iP35.getSecond();
    iP35.setFirst((java.lang.Integer)201326592);
    iPBan21.setIp(iP35);
    boolean b41 = singlyLinkedList0.contains(iP35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i18 + "' != '" + (-1)+ "'", i18.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i27 + "' != '" + 100+ "'", i27.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long29 + "' != '" + 10L+ "'", long29.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long30 + "' != '" + 10L+ "'", long30.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i36 + "' != '" + (-1)+ "'", i36.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i37 + "' != '" + (-1)+ "'", i37.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == false);

  }

  @Test
  public void test216() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test216"); }


    int i2 = java.lang.Integer.max(436207642, 4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 436207642);

  }

  @Test
  public void test217() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test217"); }


    int i2 = java.lang.Integer.compareUnsigned((-420762406), (-872415232));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);

  }

  @Test
  public void test218() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test218"); }


    int i1 = java.lang.Integer.signum(2621440);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 1);

  }

  @Test
  public void test219() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test219"); }


    // The following exception was thrown during execution in test generation
    try {
      int i2 = java.lang.Integer.parseUnsignedInt("11000000000000000000000000001100", 1073741826);
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test220() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test220"); }


    int i2 = java.lang.Integer.compare(1275068422, 1107296276);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);

  }

  @Test
  public void test221() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test221"); }


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
    tp2.SinglyLinkedList singlyLinkedList34 = new tp2.SinglyLinkedList();
    tp2.IP iP35 = null;
    boolean b36 = singlyLinkedList34.remove(iP35);
    boolean b37 = singlyLinkedList34.isEmpty();
    tp2.IP iP42 = new tp2.IP((java.lang.Integer)5, (java.lang.Integer)1, (java.lang.Integer)0, (java.lang.Integer)12);
    boolean b43 = singlyLinkedList34.contains(iP42);
    tp2.SinglyLinkedList singlyLinkedList44 = new tp2.SinglyLinkedList();
    tp2.IP iP49 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i50 = iP49.getThird();
    boolean b51 = singlyLinkedList44.remove(iP49);
    iP49.setSecond((java.lang.Integer)150994944);
    java.lang.Integer i54 = iP49.getFourth();
    java.lang.Integer i55 = iP49.getThird();
    java.lang.Integer i56 = iP49.getFirst();
    boolean b57 = singlyLinkedList34.contains(iP49);
    tp2.SinglyLinkedList singlyLinkedList58 = new tp2.SinglyLinkedList();
    tp2.IP iP63 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i64 = iP63.getFourth();
    singlyLinkedList58.add(iP63);
    java.lang.Integer i66 = iP63.getFirst();
    boolean b67 = singlyLinkedList34.contains(iP63);
    boolean b68 = server0.connect(iP63);
    server0.update();
    boolean b70 = server0.bansOkTime();
    
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
    org.junit.Assert.assertTrue(b36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b43 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i50 + "' != '" + (-1)+ "'", i50.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b51 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i54 + "' != '" + 100+ "'", i54.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i55 + "' != '" + (-1)+ "'", i55.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i56 + "' != '" + (-1)+ "'", i56.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b57 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i64 + "' != '" + 100+ "'", i64.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i66 + "' != '" + (-1)+ "'", i66.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b67 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b68 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b70 == true);

  }

  @Test
  public void test222() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test222"); }


    java.lang.Integer i2 = java.lang.Integer.getInteger("4294967167", (java.lang.Integer)25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i2 + "' != '" + 25+ "'", i2.equals(25));

  }

  @Test
  public void test223() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test223"); }


    int i1 = java.lang.Integer.bitCount(2500);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 5);

  }

  @Test
  public void test224() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test224"); }


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
    boolean b23 = server0.exceptionsNotRepeated();
    boolean b24 = server0.bansSorted();
    boolean b25 = server0.bansSorted();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);

  }

  @Test
  public void test225() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test225"); }


    int i2 = java.lang.Integer.min(70, 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);

  }

  @Test
  public void test226() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test226"); }


    java.lang.Integer i2 = java.lang.Integer.valueOf("88770", 33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i2 + "' != '" + 9782718+ "'", i2.equals(9782718));

  }

  @Test
  public void test227() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test227"); }


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
    tp2.SinglyLinkedList singlyLinkedList56 = new tp2.SinglyLinkedList();
    tp2.IP iP61 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i62 = iP61.getThird();
    boolean b63 = singlyLinkedList56.remove(iP61);
    iP61.setSecond((java.lang.Integer)150994944);
    java.lang.Integer i66 = iP61.getFourth();
    boolean b67 = server0.removeBan(iP61);
    
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
    org.junit.Assert.assertTrue("'" + i62 + "' != '" + (-1)+ "'", i62.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b63 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i66 + "' != '" + 100+ "'", i66.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b67 == false);

  }

  @Test
  public void test228() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test228"); }


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
    boolean b28 = singlyLinkedList0.isEmpty();
    tp2.IP iP33 = new tp2.IP((java.lang.Integer)11100, (java.lang.Integer)40, (java.lang.Integer)28, (java.lang.Integer)727449600);
    iP33.setFourth((java.lang.Integer)(-1073741824));
    boolean b36 = singlyLinkedList0.contains(iP33);
    
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
    org.junit.Assert.assertTrue(b28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == false);

  }

  @Test
  public void test229() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test229"); }


    tp2.Server server0 = new tp2.Server();
    tp2.IP iP5 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    boolean b6 = server0.removeBan(iP5);
    boolean b7 = server0.bansSorted();
    boolean b8 = server0.exceptionsNotRepeated();
    tp2.SinglyLinkedList singlyLinkedList9 = new tp2.SinglyLinkedList();
    tp2.IP iP10 = null;
    boolean b11 = singlyLinkedList9.remove(iP10);
    boolean b12 = singlyLinkedList9.isEmpty();
    tp2.IP iP17 = new tp2.IP((java.lang.Integer)5, (java.lang.Integer)1, (java.lang.Integer)0, (java.lang.Integer)12);
    boolean b18 = singlyLinkedList9.contains(iP17);
    tp2.SinglyLinkedList singlyLinkedList19 = new tp2.SinglyLinkedList();
    tp2.IP iP24 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i25 = iP24.getThird();
    boolean b26 = singlyLinkedList19.remove(iP24);
    iP24.setSecond((java.lang.Integer)150994944);
    java.lang.Integer i29 = iP24.getFourth();
    java.lang.Integer i30 = iP24.getThird();
    java.lang.Integer i31 = iP24.getFirst();
    boolean b32 = singlyLinkedList9.contains(iP24);
    tp2.SinglyLinkedList singlyLinkedList33 = new tp2.SinglyLinkedList();
    tp2.IP iP38 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i39 = iP38.getFourth();
    singlyLinkedList33.add(iP38);
    java.lang.Integer i41 = iP38.getFirst();
    boolean b42 = singlyLinkedList9.remove(iP38);
    boolean b43 = server0.removeException(iP38);
    boolean b44 = server0.notSharedElements();
    server0.update();
    boolean b46 = server0.notSharedElements();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i25 + "' != '" + (-1)+ "'", i25.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i29 + "' != '" + 100+ "'", i29.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i30 + "' != '" + (-1)+ "'", i30.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i31 + "' != '" + (-1)+ "'", i31.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i39 + "' != '" + 100+ "'", i39.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i41 + "' != '" + (-1)+ "'", i41.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b43 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b46 == true);

  }

  @Test
  public void test230() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test230"); }


    java.lang.Integer i1 = java.lang.Integer.valueOf(146800640);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 146800640+ "'", i1.equals(146800640));

  }

  @Test
  public void test231() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test231"); }


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
    tp2.IPBan iPBan70 = new tp2.IPBan(iP66, (java.lang.Long)5L);
    
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

  }

  @Test
  public void test232() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test232"); }


    int i2 = java.lang.Integer.remainderUnsigned(25, 524288);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 25);

  }

  @Test
  public void test233() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test233"); }


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
    tp2.Server server72 = new tp2.Server();
    boolean b73 = server72.exceptionsNotRepeated();
    boolean b74 = server72.bansSorted();
    boolean b75 = server72.notSharedElements();
    tp2.SinglyLinkedList singlyLinkedList76 = new tp2.SinglyLinkedList();
    tp2.IP iP81 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i82 = iP81.getFourth();
    singlyLinkedList76.add(iP81);
    boolean b84 = server72.addException(iP81);
    java.lang.Integer i85 = iP81.getFourth();
    iP81.setFourth((java.lang.Integer)16);
    boolean b88 = strictlySortedSinglyLinkedList0.containsIP(iP81);
    boolean b89 = strictlySortedSinglyLinkedList0.isEmpty();
    
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
    org.junit.Assert.assertTrue(b73 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b74 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b75 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i82 + "' != '" + 100+ "'", i82.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b84 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i85 + "' != '" + 100+ "'", i85.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b88 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b89 == true);

  }

  @Test
  public void test234() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test234"); }


    int i1 = java.lang.Integer.parseUnsignedInt("11");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 11);

  }

  @Test
  public void test235() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test235"); }


    int i2 = java.lang.Integer.rotateLeft(12, 48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 786432);

  }

  @Test
  public void test236() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test236"); }


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
    boolean b27 = server0.notSharedElements();
    boolean b28 = server0.exceptionsNotRepeated();
    tp2.SinglyLinkedList singlyLinkedList29 = new tp2.SinglyLinkedList();
    tp2.IP iP34 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i35 = iP34.getFourth();
    singlyLinkedList29.add(iP34);
    tp2.IPBan iPBan38 = new tp2.IPBan(iP34, (java.lang.Long)(-1L));
    boolean b39 = server0.addException(iP34);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i35 + "' != '" + 100+ "'", i35.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == false);

  }

  @Test
  public void test237() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test237"); }


    java.lang.String str1 = java.lang.Integer.toUnsignedString(32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "32"+ "'", str1.equals("32"));

  }

  @Test
  public void test238() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test238"); }


    tp2.Server server0 = new tp2.Server();
    boolean b1 = server0.notSharedElements();
    boolean b2 = server0.exceptionsNotRepeated();
    tp2.Server server3 = new tp2.Server();
    boolean b4 = server3.exceptionsNotRepeated();
    boolean b5 = server3.bansSorted();
    boolean b6 = server3.notSharedElements();
    tp2.SinglyLinkedList singlyLinkedList7 = new tp2.SinglyLinkedList();
    tp2.IP iP12 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i13 = iP12.getFourth();
    singlyLinkedList7.add(iP12);
    boolean b15 = server3.addException(iP12);
    java.lang.Integer i16 = iP12.getSecond();
    iP12.setSecond((java.lang.Integer)(-1));
    tp2.IPBan iPBan20 = new tp2.IPBan(iP12, (java.lang.Long)25L);
    boolean b21 = server0.connect(iP12);
    tp2.ITime iTime22 = null;
    server0.setTime(iTime22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i13 + "' != '" + 100+ "'", i13.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i16 + "' != '" + (-1)+ "'", i16.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);

  }

  @Test
  public void test239() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test239"); }


    // The following exception was thrown during execution in test generation
    try {
      java.lang.Integer i2 = java.lang.Integer.valueOf("11000000000000000000000000001100", 13);
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


    // The following exception was thrown during execution in test generation
    try {
      int i2 = java.lang.Integer.parseUnsignedInt("23", 196);
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

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test241"); }


    // The following exception was thrown during execution in test generation
    try {
      java.lang.Integer i2 = java.lang.Integer.valueOf("637534208", 80);
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


    tp2.IP iP4 = new tp2.IP((java.lang.Integer)2560, (java.lang.Integer)218103808, (java.lang.Integer)8192, (java.lang.Integer)19);

  }

  @Test
  public void test243() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test243"); }


    // The following exception was thrown during execution in test generation
    try {
      java.lang.Integer i1 = new java.lang.Integer("a");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test244() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test244"); }


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
    iP28.setFourth((java.lang.Integer)2560);
    
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

  }

  @Test
  public void test245() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test245"); }


    tp2.SinglyLinkedList singlyLinkedList0 = new tp2.SinglyLinkedList();
    tp2.Server server1 = new tp2.Server();
    boolean b2 = server1.exceptionsNotRepeated();
    tp2.IP iP7 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i8 = iP7.getThird();
    iP7.setSecond((java.lang.Integer)10);
    boolean b11 = server1.removeBan(iP7);
    boolean b12 = singlyLinkedList0.remove(iP7);
    boolean b13 = singlyLinkedList0.isEmpty();
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
    tp2.IP iP42 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i43 = iP42.getFourth();
    boolean b44 = server14.removeBan(iP42);
    boolean b45 = singlyLinkedList0.remove(iP42);
    tp2.IP iP46 = null;
    boolean b47 = singlyLinkedList0.remove(iP46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i8 + "' != '" + (-1)+ "'", i8.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
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
    org.junit.Assert.assertTrue("'" + i43 + "' != '" + 100+ "'", i43.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b47 == false);

  }

  @Test
  public void test246() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test246"); }


    tp2.SinglyLinkedList singlyLinkedList0 = new tp2.SinglyLinkedList();
    tp2.Server server1 = new tp2.Server();
    boolean b2 = server1.exceptionsNotRepeated();
    tp2.IP iP7 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i8 = iP7.getThird();
    iP7.setSecond((java.lang.Integer)10);
    boolean b11 = server1.removeBan(iP7);
    boolean b12 = singlyLinkedList0.remove(iP7);
    boolean b13 = singlyLinkedList0.isEmpty();
    tp2.SinglyLinkedList singlyLinkedList14 = new tp2.SinglyLinkedList();
    tp2.IP iP19 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i20 = iP19.getThird();
    boolean b21 = singlyLinkedList14.remove(iP19);
    tp2.IP iP26 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i27 = iP26.getFirst();
    boolean b28 = singlyLinkedList14.remove(iP26);
    iP26.setSecond((java.lang.Integer)40);
    java.lang.Integer i31 = iP26.getSecond();
    boolean b32 = singlyLinkedList0.remove(iP26);
    tp2.SinglyLinkedList singlyLinkedList33 = new tp2.SinglyLinkedList();
    boolean b34 = singlyLinkedList33.isEmpty();
    tp2.SinglyLinkedList singlyLinkedList35 = new tp2.SinglyLinkedList();
    tp2.IP iP36 = null;
    boolean b37 = singlyLinkedList35.remove(iP36);
    boolean b38 = singlyLinkedList35.isEmpty();
    tp2.IP iP43 = new tp2.IP((java.lang.Integer)5, (java.lang.Integer)1, (java.lang.Integer)0, (java.lang.Integer)12);
    boolean b44 = singlyLinkedList35.contains(iP43);
    tp2.SinglyLinkedList singlyLinkedList45 = new tp2.SinglyLinkedList();
    tp2.IP iP50 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i51 = iP50.getThird();
    boolean b52 = singlyLinkedList45.remove(iP50);
    iP50.setSecond((java.lang.Integer)150994944);
    java.lang.Integer i55 = iP50.getFourth();
    java.lang.Integer i56 = iP50.getThird();
    java.lang.Integer i57 = iP50.getFirst();
    boolean b58 = singlyLinkedList35.contains(iP50);
    singlyLinkedList33.add(iP50);
    iP50.setThird((java.lang.Integer)10);
    boolean b62 = singlyLinkedList0.remove(iP50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i8 + "' != '" + (-1)+ "'", i8.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i20 + "' != '" + (-1)+ "'", i20.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i27 + "' != '" + (-1)+ "'", i27.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i31 + "' != '" + 40+ "'", i31.equals(40));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i51 + "' != '" + (-1)+ "'", i51.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b52 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i55 + "' != '" + 100+ "'", i55.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i56 + "' != '" + (-1)+ "'", i56.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i57 + "' != '" + (-1)+ "'", i57.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b58 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b62 == false);

  }

  @Test
  public void test247() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test247"); }


    int i1 = java.lang.Integer.reverseBytes((-872415232));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 204);

  }

  @Test
  public void test248() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test248"); }


    int i2 = java.lang.Integer.rotateRight(14, 26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 896);

  }

  @Test
  public void test249() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test249"); }


    tp2.Server server0 = new tp2.Server();
    boolean b1 = server0.exceptionsNotRepeated();
    boolean b2 = server0.bansNotRepeatedExpirationOrIP();
    tp2.IP iP7 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i8 = iP7.getFirst();
    java.lang.Integer i9 = iP7.getFirst();
    boolean b10 = server0.connect(iP7);
    java.lang.Integer i11 = iP7.getSecond();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i8 + "' != '" + (-1)+ "'", i8.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + (-1)+ "'", i9.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i11 + "' != '" + (-1)+ "'", i11.equals((-1)));

  }

  @Test
  public void test250() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test250"); }


    java.lang.String str1 = java.lang.Integer.toUnsignedString((-2147483648));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "2147483648"+ "'", str1.equals("2147483648"));

  }

  @Test
  public void test251() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test251"); }


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
    tp2.IP iP25 = singlyLinkedList0.get(637534312);
    
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
    org.junit.Assert.assertNull(iP25);

  }

  @Test
  public void test252() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test252"); }


    int i1 = java.lang.Integer.highestOneBit(10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 8);

  }

  @Test
  public void test253() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test253"); }


    java.lang.String str1 = java.lang.Integer.toBinaryString(16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "10000"+ "'", str1.equals("10000"));

  }

  @Test
  public void test254() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test254"); }


    tp2.SinglyLinkedList singlyLinkedList0 = new tp2.SinglyLinkedList();
    tp2.IP iP5 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i6 = iP5.getThird();
    boolean b7 = singlyLinkedList0.remove(iP5);
    iP5.setSecond((java.lang.Integer)150994944);
    iP5.setSecond((java.lang.Integer)(-2));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i6 + "' != '" + (-1)+ "'", i6.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);

  }

  @Test
  public void test255() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test255"); }


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
    java.lang.Integer i63 = iP58.getFourth();
    
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
    org.junit.Assert.assertTrue("'" + i63 + "' != '" + 100+ "'", i63.equals(100));

  }

  @Test
  public void test256() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test256"); }


    korat.finitization.IFinitization iFinitization1 = tp2.Server.finServer(15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iFinitization1);

  }

  @Test
  public void test257() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test257"); }


    tp2.Server server0 = new tp2.Server();
    boolean b1 = server0.notSharedElements();
    boolean b2 = server0.exceptionsNotRepeated();
    tp2.SinglyLinkedList singlyLinkedList3 = new tp2.SinglyLinkedList();
    tp2.IP iP8 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i9 = iP8.getThird();
    boolean b10 = singlyLinkedList3.remove(iP8);
    tp2.IPBan iPBan12 = new tp2.IPBan(iP8, (java.lang.Long)10L);
    java.lang.Long long13 = iPBan12.getExpires();
    java.lang.Long long14 = iPBan12.getExpires();
    tp2.SinglyLinkedList singlyLinkedList15 = new tp2.SinglyLinkedList();
    tp2.IP iP20 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i21 = iP20.getThird();
    boolean b22 = singlyLinkedList15.remove(iP20);
    tp2.IPBan iPBan24 = new tp2.IPBan(iP20, (java.lang.Long)10L);
    tp2.IP iP29 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i30 = iP29.getFourth();
    iPBan24.setIp(iP29);
    iPBan12.setIp(iP29);
    iP29.setSecond((java.lang.Integer)727449600);
    java.lang.Integer i35 = iP29.getFirst();
    boolean b36 = server0.connect(iP29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + (-1)+ "'", i9.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long13 + "' != '" + 10L+ "'", long13.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long14 + "' != '" + 10L+ "'", long14.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i21 + "' != '" + (-1)+ "'", i21.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i30 + "' != '" + 100+ "'", i30.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i35 + "' != '" + (-1)+ "'", i35.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == true);

  }

  @Test
  public void test258() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test258"); }


    tp2.Server server0 = new tp2.Server();
    boolean b1 = server0.notSharedElements();
    boolean b2 = server0.bansOkTime();
    tp2.Server server3 = new tp2.Server();
    boolean b4 = server3.exceptionsNotRepeated();
    boolean b5 = server3.bansNotRepeatedExpirationOrIP();
    tp2.Server server6 = new tp2.Server();
    tp2.IP iP11 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    boolean b12 = server6.removeBan(iP11);
    java.lang.Integer i13 = iP11.getFirst();
    boolean b14 = server3.addException(iP11);
    boolean b15 = server0.addException(iP11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i13 + "' != '" + (-1)+ "'", i13.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);

  }

  @Test
  public void test259() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test259"); }


    int i2 = java.lang.Integer.max(2560, 88770);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 88770);

  }

  @Test
  public void test260() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test260"); }


    int i1 = java.lang.Integer.numberOfLeadingZeros(640);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 22);

  }

  @Test
  public void test261() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test261"); }


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
    boolean b20 = strictlySortedSinglyLinkedList0.isEmpty();
    tp2.IPBan iPBan22 = strictlySortedSinglyLinkedList0.get(4096);
    
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
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iPBan22);

  }

  @Test
  public void test262() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test262"); }


    int i2 = java.lang.Integer.rotateRight(5120, 5120);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 5120);

  }

  @Test
  public void test263() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test263"); }


    tp2.IP iP4 = new tp2.IP((java.lang.Integer)1073741824, (java.lang.Integer)(-1), (java.lang.Integer)16, (java.lang.Integer)1);
    tp2.IPBan iPBan6 = new tp2.IPBan(iP4, (java.lang.Long)1L);
    tp2.IP iP7 = iPBan6.getIp();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP7);

  }

  @Test
  public void test264() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test264"); }


    tp2.Server server0 = new tp2.Server();
    boolean b1 = server0.exceptionsNotRepeated();
    boolean b2 = server0.bansNotRepeatedExpirationOrIP();
    tp2.IP iP7 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i8 = iP7.getFirst();
    java.lang.Integer i9 = iP7.getFirst();
    boolean b10 = server0.connect(iP7);
    boolean b11 = server0.bansNotRepeatedExpirationOrIP();
    tp2.IP iP16 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i17 = iP16.getFirst();
    java.lang.Integer i18 = iP16.getSecond();
    iP16.setFirst((java.lang.Integer)201326592);
    tp2.IPBan iPBan22 = new tp2.IPBan(iP16, (java.lang.Long)727449600L);
    tp2.IP iP23 = iPBan22.getIp();
    boolean b24 = server0.connect(iP23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i8 + "' != '" + (-1)+ "'", i8.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + (-1)+ "'", i9.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i17 + "' != '" + (-1)+ "'", i17.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i18 + "' != '" + (-1)+ "'", i18.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == true);

  }

  @Test
  public void test265() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test265"); }


    int i1 = java.lang.Integer.reverse(9782718);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 2107812096);

  }

  @Test
  public void test266() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test266"); }


    java.lang.Integer i1 = java.lang.Integer.valueOf(201326798);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 201326798+ "'", i1.equals(201326798));

  }

  @Test
  public void test267() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test267"); }


    int i1 = java.lang.Integer.signum(88770);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 1);

  }

  @Test
  public void test268() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test268"); }


    java.lang.String str1 = java.lang.Integer.toBinaryString(201326624);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "1100000000000000000000100000"+ "'", str1.equals("1100000000000000000000100000"));

  }

  @Test
  public void test269() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test269"); }


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
    tp2.Server server44 = new tp2.Server();
    boolean b45 = server44.exceptionsNotRepeated();
    tp2.IP iP50 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i51 = iP50.getThird();
    iP50.setSecond((java.lang.Integer)10);
    boolean b54 = server44.removeBan(iP50);
    iP50.setFourth((java.lang.Integer)9);
    boolean b57 = server0.removeBan(iP50);
    tp2.Server server58 = new tp2.Server();
    tp2.ITime iTime59 = null;
    server58.setTime(iTime59);
    tp2.ITime iTime61 = null;
    server58.setTime(iTime61);
    tp2.Server server63 = new tp2.Server();
    tp2.IP iP68 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    boolean b69 = server63.removeBan(iP68);
    java.lang.Integer i70 = iP68.getFirst();
    boolean b71 = server58.addException(iP68);
    boolean b72 = server58.bansSorted();
    boolean b73 = server58.notSharedElements();
    tp2.Server server74 = new tp2.Server();
    boolean b75 = server74.exceptionsNotRepeated();
    boolean b76 = server74.bansSorted();
    tp2.SinglyLinkedList singlyLinkedList77 = new tp2.SinglyLinkedList();
    tp2.IP iP82 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i83 = iP82.getThird();
    boolean b84 = singlyLinkedList77.remove(iP82);
    iP82.setSecond((java.lang.Integer)150994944);
    java.lang.Integer i87 = iP82.getFourth();
    java.lang.Integer i88 = iP82.getThird();
    java.lang.Integer i89 = iP82.getFirst();
    boolean b90 = server74.connect(iP82);
    boolean b91 = server58.connect(iP82);
    boolean b92 = server0.addException(iP82);
    
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
    org.junit.Assert.assertTrue(b45 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i51 + "' != '" + (-1)+ "'", i51.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b54 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b57 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b69 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i70 + "' != '" + (-1)+ "'", i70.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b71 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b72 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b73 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b75 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b76 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i83 + "' != '" + (-1)+ "'", i83.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b84 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i87 + "' != '" + 100+ "'", i87.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i88 + "' != '" + (-1)+ "'", i88.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i89 + "' != '" + (-1)+ "'", i89.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b90 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b91 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b92 == true);

  }

  @Test
  public void test270() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test270"); }


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
    tp2.Server server24 = new tp2.Server();
    boolean b25 = server24.notSharedElements();
    tp2.SinglyLinkedList singlyLinkedList26 = new tp2.SinglyLinkedList();
    tp2.IP iP31 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i32 = iP31.getThird();
    boolean b33 = singlyLinkedList26.remove(iP31);
    boolean b34 = server24.addException(iP31);
    tp2.SinglyLinkedList singlyLinkedList35 = new tp2.SinglyLinkedList();
    tp2.IP iP40 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i41 = iP40.getFourth();
    singlyLinkedList35.add(iP40);
    java.lang.Integer i43 = iP40.getFirst();
    boolean b44 = server24.removeBan(iP40);
    tp2.ITime iTime45 = null;
    server24.setTime(iTime45);
    boolean b47 = server24.bansSorted();
    tp2.IP iP52 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i53 = iP52.getFourth();
    boolean b54 = server24.removeBan(iP52);
    tp2.IPBan iPBan56 = new tp2.IPBan(iP52, (java.lang.Long)10L);
    boolean b57 = server0.removeException(iP52);
    
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
    org.junit.Assert.assertTrue(b25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i32 + "' != '" + (-1)+ "'", i32.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i41 + "' != '" + 100+ "'", i41.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i43 + "' != '" + (-1)+ "'", i43.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b47 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i53 + "' != '" + 100+ "'", i53.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b54 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b57 == true);

  }

  @Test
  public void test271() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test271"); }


    tp2.IP iP4 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i5 = iP4.getFourth();
    iP4.setFirst((java.lang.Integer)16);
    boolean b9 = iP4.equals((java.lang.Object)(-1601830656));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i5 + "' != '" + 100+ "'", i5.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);

  }

  @Test
  public void test272() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test272"); }


    int i2 = java.lang.Integer.sum(44, 11884);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 11928);

  }

  @Test
  public void test273() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test273"); }


    java.lang.String str1 = java.lang.Integer.toBinaryString(26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "11010"+ "'", str1.equals("11010"));

  }

  @Test
  public void test274() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test274"); }


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
    tp2.IP iP44 = singlyLinkedList0.get((-1073741812));
    tp2.SinglyLinkedList singlyLinkedList45 = new tp2.SinglyLinkedList();
    tp2.IP iP50 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i51 = iP50.getThird();
    boolean b52 = singlyLinkedList45.remove(iP50);
    tp2.IPBan iPBan54 = new tp2.IPBan(iP50, (java.lang.Long)10L);
    java.lang.Long long55 = iPBan54.getExpires();
    iPBan54.setExpires((java.lang.Long)(-1L));
    tp2.IP iP58 = iPBan54.getIp();
    singlyLinkedList0.add(iP58);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i51 + "' != '" + (-1)+ "'", i51.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b52 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long55 + "' != '" + 10L+ "'", long55.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP58);

  }

  @Test
  public void test275() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test275"); }


    java.lang.Integer i1 = java.lang.Integer.valueOf(469762048);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 469762048+ "'", i1.equals(469762048));

  }

  @Test
  public void test276() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test276"); }


    int i1 = java.lang.Integer.bitCount(218103808);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 3);

  }

  @Test
  public void test277() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test277"); }


    tp2.Server server0 = new tp2.Server();
    boolean b1 = server0.notSharedElements();
    tp2.SinglyLinkedList singlyLinkedList2 = new tp2.SinglyLinkedList();
    tp2.IP iP7 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i8 = iP7.getThird();
    boolean b9 = singlyLinkedList2.remove(iP7);
    boolean b10 = server0.addException(iP7);
    java.lang.Integer i11 = iP7.getFirst();
    tp2.IPBan iPBan13 = new tp2.IPBan(iP7, (java.lang.Long)5L);
    tp2.IP iP14 = iPBan13.getIp();
    iPBan13.setExpires((java.lang.Long)(-1L));
    java.lang.Long long17 = iPBan13.getExpires();
    iPBan13.setExpires((java.lang.Long)25L);
    
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
    org.junit.Assert.assertNotNull(iP14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-1L)+ "'", long17.equals((-1L)));

  }

  @Test
  public void test278() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test278"); }


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
    boolean b28 = singlyLinkedList0.isEmpty();
    tp2.Server server29 = new tp2.Server();
    boolean b30 = server29.exceptionsNotRepeated();
    tp2.IP iP35 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i36 = iP35.getThird();
    iP35.setSecond((java.lang.Integer)10);
    boolean b39 = server29.removeBan(iP35);
    boolean b40 = singlyLinkedList0.remove(iP35);
    
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
    org.junit.Assert.assertTrue(b28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i36 + "' != '" + (-1)+ "'", i36.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == false);

  }

  @Test
  public void test279() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test279"); }


    tp2.SinglyLinkedList singlyLinkedList0 = new tp2.SinglyLinkedList();
    tp2.IP iP5 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i6 = iP5.getFourth();
    singlyLinkedList0.add(iP5);
    tp2.Server server8 = new tp2.Server();
    boolean b9 = server8.exceptionsNotRepeated();
    tp2.IP iP14 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i15 = iP14.getThird();
    iP14.setSecond((java.lang.Integer)10);
    boolean b18 = server8.removeBan(iP14);
    iP14.setFourth((java.lang.Integer)9);
    iP14.setThird((java.lang.Integer)64);
    boolean b23 = singlyLinkedList0.contains(iP14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i6 + "' != '" + 100+ "'", i6.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i15 + "' != '" + (-1)+ "'", i15.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);

  }

  @Test
  public void test280() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test280"); }


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
    tp2.Server server59 = new tp2.Server();
    tp2.ITime iTime60 = null;
    server59.setTime(iTime60);
    boolean b62 = server59.bansNotRepeatedExpirationOrIP();
    tp2.SinglyLinkedList singlyLinkedList63 = new tp2.SinglyLinkedList();
    tp2.IP iP68 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i69 = iP68.getThird();
    boolean b70 = singlyLinkedList63.remove(iP68);
    iP68.setSecond((java.lang.Integer)150994944);
    java.lang.Integer i73 = iP68.getFourth();
    java.lang.Integer i74 = iP68.getThird();
    java.lang.Integer i75 = iP68.getFirst();
    boolean b76 = server59.addException(iP68);
    boolean b77 = server0.connect(iP68);
    java.lang.Integer i78 = iP68.getFourth();
    
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
    org.junit.Assert.assertTrue(b62 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i69 + "' != '" + (-1)+ "'", i69.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b70 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i73 + "' != '" + 100+ "'", i73.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i74 + "' != '" + (-1)+ "'", i74.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i75 + "' != '" + (-1)+ "'", i75.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b76 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b77 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i78 + "' != '" + 100+ "'", i78.equals(100));

  }

  @Test
  public void test281() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test281"); }


    java.lang.String str1 = java.lang.Integer.toBinaryString(201326597);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "1100000000000000000000000101"+ "'", str1.equals("1100000000000000000000000101"));

  }

  @Test
  public void test282() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test282"); }


    // The following exception was thrown during execution in test generation
    try {
      java.lang.Integer i1 = new java.lang.Integer("37777777776");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test283() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test283"); }


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
    boolean b14 = server0.bansNotRepeatedExpirationOrIP();
    boolean b15 = server0.bansOkTime();
    
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
  public void test284() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test284"); }


    tp2.Server server0 = new tp2.Server();
    boolean b1 = server0.bansSorted();
    tp2.IP iP6 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i7 = iP6.getFourth();
    boolean b8 = server0.removeException(iP6);
    boolean b9 = server0.exceptionsNotRepeated();
    tp2.Server server10 = new tp2.Server();
    tp2.IP iP15 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    boolean b16 = server10.removeBan(iP15);
    tp2.IP iP21 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i22 = iP21.getThird();
    iP21.setFourth((java.lang.Integer)0);
    iP21.setSecond((java.lang.Integer)3);
    iP21.setFourth((java.lang.Integer)12);
    boolean b29 = server10.addBan(iP21);
    java.lang.Integer i30 = iP21.getThird();
    boolean b31 = server0.connect(iP21);
    java.lang.Integer i32 = iP21.getFirst();
    iP21.setFourth((java.lang.Integer)(-621508756));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i7 + "' != '" + 100+ "'", i7.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i22 + "' != '" + (-1)+ "'", i22.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i30 + "' != '" + (-1)+ "'", i30.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i32 + "' != '" + (-1)+ "'", i32.equals((-1)));

  }

  @Test
  public void test285() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test285"); }


    tp2.SinglyLinkedList singlyLinkedList0 = new tp2.SinglyLinkedList();
    tp2.IP iP5 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i6 = iP5.getThird();
    boolean b7 = singlyLinkedList0.remove(iP5);
    tp2.IP iP12 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i13 = iP12.getFirst();
    boolean b14 = singlyLinkedList0.remove(iP12);
    iP12.setSecond((java.lang.Integer)16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i6 + "' != '" + (-1)+ "'", i6.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i13 + "' != '" + (-1)+ "'", i13.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);

  }

  @Test
  public void test286() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test286"); }


    int i1 = java.lang.Integer.numberOfTrailingZeros(436207642);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 1);

  }

  @Test
  public void test287() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test287"); }


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
    tp2.IP iP41 = new tp2.IP((java.lang.Integer)1610612742, (java.lang.Integer)150994944, (java.lang.Integer)4, (java.lang.Integer)3);
    boolean b42 = server0.removeBan(iP41);
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
    org.junit.Assert.assertTrue(b42 == false);

  }

  @Test
  public void test288() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test288"); }


    korat.finitization.IFinitization iFinitization1 = tp2.Server.finServer(12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iFinitization1);

  }

  @Test
  public void test289() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test289"); }


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
    tp2.IPBan iPBan44 = strictlySortedSinglyLinkedList0.get(16);
    
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
    org.junit.Assert.assertNull(iPBan44);

  }

  @Test
  public void test290() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test290"); }


    java.lang.Integer i1 = java.lang.Integer.decode("144");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 144+ "'", i1.equals(144));

  }

  @Test
  public void test291() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test291"); }


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
    tp2.IP iP25 = new tp2.IP((java.lang.Integer)150994944, (java.lang.Integer)784, (java.lang.Integer)784, (java.lang.Integer)2);
    java.lang.Integer i26 = iP25.getFourth();
    boolean b27 = strictlySortedSinglyLinkedList0.containsIP(iP25);
    
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
    org.junit.Assert.assertTrue("'" + i26 + "' != '" + 2+ "'", i26.equals(2));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);

  }

  @Test
  public void test292() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test292"); }


    tp2.IP iP4 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i5 = iP4.getFirst();
    java.lang.Integer i6 = iP4.getSecond();
    tp2.IPBan iPBan8 = new tp2.IPBan(iP4, (java.lang.Long)1L);
    tp2.IP iP13 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i14 = iP13.getFirst();
    java.lang.Integer i15 = iP13.getSecond();
    iP13.setFirst((java.lang.Integer)201326592);
    tp2.IPBan iPBan19 = new tp2.IPBan(iP13, (java.lang.Long)727449600L);
    tp2.IP iP20 = iPBan19.getIp();
    java.lang.Integer i21 = iP20.getFirst();
    boolean b22 = iP4.equals((java.lang.Object)i21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i5 + "' != '" + (-1)+ "'", i5.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i6 + "' != '" + (-1)+ "'", i6.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i14 + "' != '" + (-1)+ "'", i14.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i15 + "' != '" + (-1)+ "'", i15.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i21 + "' != '" + 201326592+ "'", i21.equals(201326592));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);

  }

  @Test
  public void test293() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test293"); }


    int i2 = java.lang.Integer.rotateLeft(134217599, 1400000000);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 134217599);

  }

  @Test
  public void test294() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test294"); }


    java.lang.Integer i1 = new java.lang.Integer(2621440);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 2621440+ "'", i1.equals(2621440));

  }

  @Test
  public void test295() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test295"); }


    int i1 = java.lang.Integer.signum(671088644);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 1);

  }

  @Test
  public void test296() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test296"); }


    java.lang.String str1 = java.lang.Integer.toHexString(16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "10"+ "'", str1.equals("10"));

  }

  @Test
  public void test297() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test297"); }


    int i2 = java.lang.Integer.max(0, 28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 28);

  }

  @Test
  public void test298() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test298"); }


    tp2.IP iP4 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i5 = iP4.getThird();
    iP4.setFourth((java.lang.Integer)0);
    iP4.setSecond((java.lang.Integer)3);
    iP4.setFourth((java.lang.Integer)12);
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
    tp2.IPBan iPBan31 = strictlySortedSinglyLinkedList12.get(167772160);
    int i32 = strictlySortedSinglyLinkedList12.getSize();
    boolean b33 = strictlySortedSinglyLinkedList12.isEmpty();
    tp2.SinglyLinkedList singlyLinkedList34 = new tp2.SinglyLinkedList();
    tp2.IP iP35 = null;
    boolean b36 = singlyLinkedList34.remove(iP35);
    boolean b37 = singlyLinkedList34.isEmpty();
    tp2.IP iP42 = new tp2.IP((java.lang.Integer)5, (java.lang.Integer)1, (java.lang.Integer)0, (java.lang.Integer)12);
    boolean b43 = singlyLinkedList34.contains(iP42);
    tp2.SinglyLinkedList singlyLinkedList44 = new tp2.SinglyLinkedList();
    tp2.IP iP49 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i50 = iP49.getThird();
    boolean b51 = singlyLinkedList44.remove(iP49);
    iP49.setSecond((java.lang.Integer)150994944);
    java.lang.Integer i54 = iP49.getFourth();
    java.lang.Integer i55 = iP49.getThird();
    java.lang.Integer i56 = iP49.getFirst();
    boolean b57 = singlyLinkedList34.contains(iP49);
    boolean b58 = strictlySortedSinglyLinkedList12.removeFromIP(iP49);
    boolean b59 = iP4.equals((java.lang.Object)strictlySortedSinglyLinkedList12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i5 + "' != '" + (-1)+ "'", i5.equals((-1)));
    
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
    org.junit.Assert.assertTrue(i32 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b43 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i50 + "' != '" + (-1)+ "'", i50.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b51 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i54 + "' != '" + 100+ "'", i54.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i55 + "' != '" + (-1)+ "'", i55.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i56 + "' != '" + (-1)+ "'", i56.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b57 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b58 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b59 == false);

  }

  @Test
  public void test299() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test299"); }


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
    boolean b63 = server0.bansOkTime();
    
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
  public void test300() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test300"); }


    // The following exception was thrown during execution in test generation
    try {
      int i2 = java.lang.Integer.parseUnsignedInt("", 805306368);
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

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test301"); }


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
    iPBan9.setExpires((java.lang.Long)3221225472L);
    tp2.IP iP32 = null;
    iPBan9.setIp(iP32);
    
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
  public void test302() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test302"); }


    // The following exception was thrown during execution in test generation
    try {
      int i2 = java.lang.Integer.parseInt("469762048", (-1073741824));
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


    tp2.IP iP4 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i5 = iP4.getThird();
    iP4.setFourth((java.lang.Integer)22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i5 + "' != '" + (-1)+ "'", i5.equals((-1)));

  }

  @Test
  public void test304() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test304"); }


    tp2.SinglyLinkedList singlyLinkedList0 = new tp2.SinglyLinkedList();
    tp2.IP iP5 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i6 = iP5.getThird();
    boolean b7 = singlyLinkedList0.remove(iP5);
    java.lang.Integer i8 = iP5.getThird();
    java.lang.Integer i9 = iP5.getSecond();
    tp2.IPBan iPBan11 = new tp2.IPBan(iP5, (java.lang.Long)727449600L);
    tp2.IP iP12 = iPBan11.getIp();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i6 + "' != '" + (-1)+ "'", i6.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i8 + "' != '" + (-1)+ "'", i8.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + (-1)+ "'", i9.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP12);

  }

  @Test
  public void test305() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test305"); }


    // The following exception was thrown during execution in test generation
    try {
      java.lang.Integer i2 = java.lang.Integer.valueOf("80000000", 70);
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test306() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test306"); }


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
    tp2.IP iP29 = singlyLinkedList0.get(727449600);
    tp2.Server server30 = new tp2.Server();
    boolean b31 = server30.exceptionsNotRepeated();
    boolean b32 = server30.bansSorted();
    boolean b33 = server30.notSharedElements();
    tp2.SinglyLinkedList singlyLinkedList34 = new tp2.SinglyLinkedList();
    tp2.IP iP39 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i40 = iP39.getFourth();
    singlyLinkedList34.add(iP39);
    boolean b42 = server30.addException(iP39);
    tp2.Server server43 = new tp2.Server();
    boolean b44 = server43.notSharedElements();
    tp2.SinglyLinkedList singlyLinkedList45 = new tp2.SinglyLinkedList();
    tp2.IP iP50 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i51 = iP50.getThird();
    boolean b52 = singlyLinkedList45.remove(iP50);
    boolean b53 = server43.addException(iP50);
    tp2.SinglyLinkedList singlyLinkedList54 = new tp2.SinglyLinkedList();
    tp2.IP iP59 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i60 = iP59.getFourth();
    singlyLinkedList54.add(iP59);
    java.lang.Integer i62 = iP59.getFirst();
    boolean b63 = server43.removeBan(iP59);
    tp2.ITime iTime64 = null;
    server43.setTime(iTime64);
    boolean b66 = server43.notSharedElements();
    tp2.IP iP71 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i72 = iP71.getThird();
    iP71.setFourth((java.lang.Integer)0);
    iP71.setSecond((java.lang.Integer)3);
    boolean b77 = server43.addBan(iP71);
    tp2.SinglyLinkedList singlyLinkedList78 = new tp2.SinglyLinkedList();
    tp2.IP iP83 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i84 = iP83.getThird();
    boolean b85 = singlyLinkedList78.remove(iP83);
    java.lang.Integer i86 = iP83.getThird();
    iP83.setFirst((java.lang.Integer)11100);
    boolean b89 = server43.addBan(iP83);
    boolean b90 = server30.removeBan(iP83);
    java.lang.Integer i91 = iP83.getSecond();
    boolean b92 = singlyLinkedList0.contains(iP83);
    tp2.IP iP94 = singlyLinkedList0.get(5);
    tp2.IP iP96 = singlyLinkedList0.get(1);
    int i97 = singlyLinkedList0.getSize();
    
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
    org.junit.Assert.assertNull(iP29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i40 + "' != '" + 100+ "'", i40.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i51 + "' != '" + (-1)+ "'", i51.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b52 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b53 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i60 + "' != '" + 100+ "'", i60.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i62 + "' != '" + (-1)+ "'", i62.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b63 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b66 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i72 + "' != '" + (-1)+ "'", i72.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b77 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i84 + "' != '" + (-1)+ "'", i84.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b85 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i86 + "' != '" + (-1)+ "'", i86.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b89 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b90 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i91 + "' != '" + (-1)+ "'", i91.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b92 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP94);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP96);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i97 == 1);

  }

  @Test
  public void test307() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test307"); }


    int i1 = java.lang.Integer.numberOfTrailingZeros(14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 1);

  }

  @Test
  public void test308() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test308"); }


    tp2.Server server0 = new tp2.Server();
    boolean b1 = server0.exceptionsNotRepeated();
    boolean b2 = server0.bansNotRepeatedExpirationOrIP();
    tp2.SinglyLinkedList singlyLinkedList3 = new tp2.SinglyLinkedList();
    tp2.IP iP8 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i9 = iP8.getThird();
    boolean b10 = singlyLinkedList3.remove(iP8);
    tp2.IP iP15 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i16 = iP15.getFirst();
    boolean b17 = singlyLinkedList3.remove(iP15);
    java.lang.Integer i18 = iP15.getSecond();
    boolean b19 = server0.removeException(iP15);
    tp2.IP iP24 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i25 = iP24.getFirst();
    java.lang.Integer i26 = iP24.getSecond();
    java.lang.Integer i27 = null;
    iP24.setSecond(i27);
    boolean b29 = server0.removeException(iP24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + (-1)+ "'", i9.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i16 + "' != '" + (-1)+ "'", i16.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i18 + "' != '" + (-1)+ "'", i18.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i25 + "' != '" + (-1)+ "'", i25.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i26 + "' != '" + (-1)+ "'", i26.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == false);

  }

  @Test
  public void test309() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test309"); }


    java.lang.String str1 = java.lang.Integer.toOctalString(70);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "106"+ "'", str1.equals("106"));

  }

  @Test
  public void test310() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test310"); }


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
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList40 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP45 = new tp2.IP((java.lang.Integer)150994944, (java.lang.Integer)784, (java.lang.Integer)784, (java.lang.Integer)2);
    java.lang.Integer i46 = iP45.getFourth();
    boolean b47 = strictlySortedSinglyLinkedList40.removeFromIP(iP45);
    tp2.SinglyLinkedList singlyLinkedList48 = new tp2.SinglyLinkedList();
    tp2.IP iP53 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i54 = iP53.getThird();
    boolean b55 = singlyLinkedList48.remove(iP53);
    java.lang.Integer i56 = iP53.getThird();
    boolean b57 = strictlySortedSinglyLinkedList40.removeFromIP(iP53);
    tp2.IPBan iPBan59 = strictlySortedSinglyLinkedList40.get(167772160);
    int i60 = strictlySortedSinglyLinkedList40.getSize();
    tp2.SinglyLinkedList singlyLinkedList61 = new tp2.SinglyLinkedList();
    tp2.IP iP66 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i67 = iP66.getThird();
    boolean b68 = singlyLinkedList61.remove(iP66);
    tp2.IPBan iPBan70 = new tp2.IPBan(iP66, (java.lang.Long)10L);
    java.lang.Long long71 = iPBan70.getExpires();
    java.lang.Long long72 = iPBan70.getExpires();
    iPBan70.setExpires((java.lang.Long)10L);
    boolean b75 = strictlySortedSinglyLinkedList40.add(iPBan70);
    boolean b76 = strictlySortedSinglyLinkedList0.contains(iPBan70);
    tp2.SinglyLinkedList singlyLinkedList77 = new tp2.SinglyLinkedList();
    tp2.IP iP82 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i83 = iP82.getThird();
    boolean b84 = singlyLinkedList77.remove(iP82);
    iP82.setSecond((java.lang.Integer)150994944);
    java.lang.Integer i87 = iP82.getFourth();
    java.lang.Integer i88 = iP82.getThird();
    java.lang.Integer i89 = iP82.getFirst();
    tp2.IPBan iPBan91 = new tp2.IPBan(iP82, (java.lang.Long)23L);
    boolean b92 = strictlySortedSinglyLinkedList0.contains(iPBan91);
    
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
    org.junit.Assert.assertTrue("'" + i46 + "' != '" + 2+ "'", i46.equals(2));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b47 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i54 + "' != '" + (-1)+ "'", i54.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b55 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i56 + "' != '" + (-1)+ "'", i56.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b57 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iPBan59);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i60 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i67 + "' != '" + (-1)+ "'", i67.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b68 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long71 + "' != '" + 10L+ "'", long71.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long72 + "' != '" + 10L+ "'", long72.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b75 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b76 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i83 + "' != '" + (-1)+ "'", i83.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b84 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i87 + "' != '" + 100+ "'", i87.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i88 + "' != '" + (-1)+ "'", i88.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i89 + "' != '" + (-1)+ "'", i89.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b92 == false);

  }

  @Test
  public void test311() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test311"); }


    tp2.Server server0 = new tp2.Server();
    boolean b1 = server0.exceptionsNotRepeated();
    boolean b2 = server0.bansSorted();
    tp2.Server server3 = new tp2.Server();
    tp2.IP iP8 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    boolean b9 = server3.removeBan(iP8);
    java.lang.Integer i10 = iP8.getFirst();
    boolean b11 = server0.addBan(iP8);
    tp2.SinglyLinkedList singlyLinkedList12 = new tp2.SinglyLinkedList();
    tp2.IP iP17 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i18 = iP17.getThird();
    boolean b19 = singlyLinkedList12.remove(iP17);
    tp2.IP iP24 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i25 = iP24.getFirst();
    boolean b26 = singlyLinkedList12.remove(iP24);
    iP24.setSecond((java.lang.Integer)40);
    tp2.Server server29 = new tp2.Server();
    tp2.IP iP34 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    boolean b35 = server29.removeBan(iP34);
    boolean b36 = server29.bansSorted();
    tp2.Server server37 = new tp2.Server();
    boolean b38 = server37.exceptionsNotRepeated();
    tp2.IP iP43 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i44 = iP43.getThird();
    iP43.setSecond((java.lang.Integer)10);
    boolean b47 = server37.removeBan(iP43);
    java.lang.Integer i48 = iP43.getSecond();
    boolean b49 = server29.addException(iP43);
    tp2.Server server50 = new tp2.Server();
    boolean b51 = server50.exceptionsNotRepeated();
    boolean b52 = server50.bansSorted();
    boolean b53 = server50.notSharedElements();
    tp2.SinglyLinkedList singlyLinkedList54 = new tp2.SinglyLinkedList();
    tp2.IP iP59 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i60 = iP59.getFourth();
    singlyLinkedList54.add(iP59);
    boolean b62 = server50.addException(iP59);
    boolean b63 = server29.addBan(iP59);
    boolean b64 = iP24.equals((java.lang.Object)iP59);
    boolean b65 = server0.addBan(iP59);
    boolean b66 = server0.bansOkTime();
    
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
    org.junit.Assert.assertTrue("'" + i18 + "' != '" + (-1)+ "'", i18.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i25 + "' != '" + (-1)+ "'", i25.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i44 + "' != '" + (-1)+ "'", i44.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b47 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i48 + "' != '" + 10+ "'", i48.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b49 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b51 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b52 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b53 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i60 + "' != '" + 100+ "'", i60.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b62 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b63 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b64 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b65 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b66 == true);

  }

  @Test
  public void test312() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test312"); }


    int i2 = java.lang.Integer.max(10, 4194304);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 4194304);

  }

  @Test
  public void test313() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test313"); }


    java.lang.String str1 = java.lang.Integer.toHexString((-1610612688));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "a0000030"+ "'", str1.equals("a0000030"));

  }

  @Test
  public void test314() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test314"); }


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
    java.lang.Integer i21 = iP15.getSecond();
    iP15.setSecond((java.lang.Integer)(-1601830656));
    iP15.setSecond((java.lang.Integer)40);
    
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
  public void test315() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test315"); }


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
    tp2.IP iP43 = new tp2.IP((java.lang.Integer)4, (java.lang.Integer)12, (java.lang.Integer)11100, (java.lang.Integer)134217728);
    tp2.IPBan iPBan45 = new tp2.IPBan(iP43, (java.lang.Long)144L);
    iP43.setThird((java.lang.Integer)(-621508756));
    iPBan9.setIp(iP43);
    
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

  }

  @Test
  public void test316() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test316"); }


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
    tp2.Server server60 = new tp2.Server();
    tp2.IP iP65 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    boolean b66 = server60.removeBan(iP65);
    tp2.IP iP71 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i72 = iP71.getThird();
    iP71.setFourth((java.lang.Integer)0);
    iP71.setSecond((java.lang.Integer)3);
    iP71.setFourth((java.lang.Integer)12);
    boolean b79 = server60.addBan(iP71);
    boolean b80 = singlyLinkedList0.contains(iP71);
    tp2.Server server81 = new tp2.Server();
    boolean b82 = server81.notSharedElements();
    tp2.SinglyLinkedList singlyLinkedList83 = new tp2.SinglyLinkedList();
    tp2.IP iP88 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i89 = iP88.getThird();
    boolean b90 = singlyLinkedList83.remove(iP88);
    boolean b91 = server81.addException(iP88);
    iP88.setFirst((java.lang.Integer)1476395008);
    boolean b94 = singlyLinkedList0.contains(iP88);
    java.lang.Integer i95 = iP88.getThird();
    
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
    org.junit.Assert.assertTrue(b66 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i72 + "' != '" + (-1)+ "'", i72.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b79 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b80 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b82 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i89 + "' != '" + (-1)+ "'", i89.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b90 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b91 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b94 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i95 + "' != '" + (-1)+ "'", i95.equals((-1)));

  }

  @Test
  public void test317() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test317"); }


    int i2 = java.lang.Integer.divideUnsigned(4194304, 727449600);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);

  }

  @Test
  public void test318() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test318"); }


    int i2 = java.lang.Integer.min(0, 80007168);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);

  }

  @Test
  public void test319() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test319"); }


    // The following exception was thrown during execution in test generation
    try {
      java.lang.Integer i2 = java.lang.Integer.valueOf("640", 268435456);
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test320() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test320"); }


    tp2.IP iP4 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i5 = iP4.getFirst();
    java.lang.Integer i6 = iP4.getSecond();
    iP4.setFirst((java.lang.Integer)201326592);
    tp2.IPBan iPBan10 = new tp2.IPBan(iP4, (java.lang.Long)727449600L);
    tp2.IP iP11 = iPBan10.getIp();
    tp2.IP iP12 = iPBan10.getIp();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i5 + "' != '" + (-1)+ "'", i5.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i6 + "' != '" + (-1)+ "'", i6.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP12);

  }

  @Test
  public void test321() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test321"); }


    int i1 = java.lang.Integer.reverse(6291456);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 1536);

  }

  @Test
  public void test322() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test322"); }


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
    java.lang.Integer i27 = iP26.getFourth();
    singlyLinkedList21.add(iP26);
    java.lang.Integer i29 = iP26.getFirst();
    tp2.SinglyLinkedList singlyLinkedList30 = new tp2.SinglyLinkedList();
    tp2.IP iP35 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i36 = iP35.getThird();
    boolean b37 = singlyLinkedList30.remove(iP35);
    boolean b38 = singlyLinkedList30.isEmpty();
    int i39 = singlyLinkedList30.getSize();
    tp2.IP iP44 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i45 = iP44.getThird();
    iP44.setFourth((java.lang.Integer)0);
    boolean b48 = singlyLinkedList30.contains(iP44);
    boolean b49 = singlyLinkedList30.isEmpty();
    tp2.IP iP54 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i55 = iP54.getFirst();
    java.lang.Integer i56 = iP54.getFirst();
    singlyLinkedList30.add(iP54);
    boolean b58 = iP26.equals((java.lang.Object)iP54);
    java.lang.Integer i59 = iP54.getFirst();
    boolean b60 = strictlySortedSinglyLinkedList0.containsIP(iP54);
    
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
    org.junit.Assert.assertTrue("'" + i27 + "' != '" + 100+ "'", i27.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i29 + "' != '" + (-1)+ "'", i29.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i36 + "' != '" + (-1)+ "'", i36.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i39 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i45 + "' != '" + (-1)+ "'", i45.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b48 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b49 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i55 + "' != '" + (-1)+ "'", i55.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i56 + "' != '" + (-1)+ "'", i56.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b58 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i59 + "' != '" + (-1)+ "'", i59.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b60 == false);

  }

  @Test
  public void test323() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test323"); }


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
    java.lang.Integer i82 = iP72.getSecond();
    
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
    org.junit.Assert.assertTrue("'" + i82 + "' != '" + (-1)+ "'", i82.equals((-1)));

  }

  @Test
  public void test324() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test324"); }


    java.lang.Integer i1 = java.lang.Integer.valueOf("4704");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 4704+ "'", i1.equals(4704));

  }

  @Test
  public void test325() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test325"); }


    int i2 = java.lang.Integer.divideUnsigned((-420762406), 201326784);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 19);

  }

  @Test
  public void test326() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test326"); }


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
    int i59 = strictlySortedSinglyLinkedList0.getSize();
    tp2.IPBan iPBan61 = strictlySortedSinglyLinkedList0.get(5);
    tp2.SinglyLinkedList singlyLinkedList62 = new tp2.SinglyLinkedList();
    tp2.IP iP67 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i68 = iP67.getThird();
    boolean b69 = singlyLinkedList62.remove(iP67);
    tp2.IPBan iPBan71 = new tp2.IPBan(iP67, (java.lang.Long)10L);
    tp2.IP iP76 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i77 = iP76.getFourth();
    iPBan71.setIp(iP76);
    boolean b79 = strictlySortedSinglyLinkedList0.removeFromIP(iP76);
    
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
    org.junit.Assert.assertTrue(i59 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iPBan61);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i68 + "' != '" + (-1)+ "'", i68.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b69 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i77 + "' != '" + 100+ "'", i77.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b79 == true);

  }

  @Test
  public void test327() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test327"); }


    java.lang.Integer i1 = java.lang.Integer.valueOf(6291456);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 6291456+ "'", i1.equals(6291456));

  }

  @Test
  public void test328() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test328"); }


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
    tp2.IP iP29 = singlyLinkedList0.get(727449600);
    tp2.IP iP34 = new tp2.IP((java.lang.Integer)671088644, (java.lang.Integer)512, (java.lang.Integer)1610612786, (java.lang.Integer)256);
    boolean b35 = singlyLinkedList0.contains(iP34);
    
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
    org.junit.Assert.assertNull(iP29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == false);

  }

  @Test
  public void test329() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test329"); }


    java.lang.String str2 = java.lang.Integer.toUnsignedString(0, 201326784);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "0"+ "'", str2.equals("0"));

  }

  @Test
  public void test330() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test330"); }


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
    tp2.IP iP89 = new tp2.IP((java.lang.Integer)1610612742, (java.lang.Integer)150994944, (java.lang.Integer)4, (java.lang.Integer)3);
    tp2.IPBan iPBan91 = new tp2.IPBan(iP89, (java.lang.Long)3221225472L);
    boolean b92 = strictlySortedSinglyLinkedList0.contains(iPBan91);
    
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
    org.junit.Assert.assertTrue(b92 == false);

  }

  @Test
  public void test331() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test331"); }


    tp2.SinglyLinkedList singlyLinkedList0 = new tp2.SinglyLinkedList();
    tp2.Server server1 = new tp2.Server();
    boolean b2 = server1.exceptionsNotRepeated();
    tp2.IP iP7 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i8 = iP7.getThird();
    iP7.setSecond((java.lang.Integer)10);
    boolean b11 = server1.removeBan(iP7);
    boolean b12 = singlyLinkedList0.remove(iP7);
    int i13 = singlyLinkedList0.getSize();
    tp2.IP iP15 = singlyLinkedList0.get((-1179648000));
    int i16 = singlyLinkedList0.getSize();
    tp2.IP iP18 = singlyLinkedList0.get(201326784);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP18);

  }

  @Test
  public void test332() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test332"); }


    // The following exception was thrown during execution in test generation
    try {
      int i2 = java.lang.Integer.parseInt("100000000000000000000000000", 5242880);
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


    // The following exception was thrown during execution in test generation
    try {
      int i1 = java.lang.Integer.parseUnsignedInt("111111111111111111101111111");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test334() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test334"); }


    tp2.IP iP4 = new tp2.IP((java.lang.Integer)34603041, (java.lang.Integer)(-1073741812), (java.lang.Integer)100000, (java.lang.Integer)2560);

  }

  @Test
  public void test335() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test335"); }


    int i1 = java.lang.Integer.reverse(2107812096);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 9782718);

  }

  @Test
  public void test336() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test336"); }


    tp2.Server server0 = new tp2.Server();
    boolean b1 = server0.exceptionsNotRepeated();
    boolean b2 = server0.bansSorted();
    boolean b3 = server0.notSharedElements();
    tp2.Server server4 = new tp2.Server();
    boolean b5 = server4.notSharedElements();
    tp2.SinglyLinkedList singlyLinkedList6 = new tp2.SinglyLinkedList();
    tp2.IP iP11 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i12 = iP11.getThird();
    boolean b13 = singlyLinkedList6.remove(iP11);
    boolean b14 = server4.addException(iP11);
    tp2.SinglyLinkedList singlyLinkedList15 = new tp2.SinglyLinkedList();
    tp2.IP iP20 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i21 = iP20.getFourth();
    singlyLinkedList15.add(iP20);
    java.lang.Integer i23 = iP20.getFirst();
    boolean b24 = server4.removeBan(iP20);
    tp2.ITime iTime25 = null;
    server4.setTime(iTime25);
    boolean b27 = server4.notSharedElements();
    tp2.IP iP32 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i33 = iP32.getThird();
    iP32.setFourth((java.lang.Integer)0);
    iP32.setSecond((java.lang.Integer)3);
    boolean b38 = server4.addBan(iP32);
    tp2.SinglyLinkedList singlyLinkedList39 = new tp2.SinglyLinkedList();
    tp2.IP iP44 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i45 = iP44.getThird();
    boolean b46 = singlyLinkedList39.remove(iP44);
    java.lang.Integer i47 = iP44.getThird();
    iP44.setFirst((java.lang.Integer)11100);
    boolean b50 = server4.addBan(iP44);
    boolean b51 = server0.removeException(iP44);
    boolean b52 = server0.bansNotRepeatedExpirationOrIP();
    tp2.Server server53 = new tp2.Server();
    tp2.ITime iTime54 = null;
    server53.setTime(iTime54);
    tp2.ITime iTime56 = null;
    server53.setTime(iTime56);
    tp2.Server server58 = new tp2.Server();
    tp2.IP iP63 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    boolean b64 = server58.removeBan(iP63);
    java.lang.Integer i65 = iP63.getFirst();
    boolean b66 = server53.addException(iP63);
    java.lang.Object obj67 = null;
    boolean b68 = iP63.equals(obj67);
    boolean b69 = server0.connect(iP63);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i12 + "' != '" + (-1)+ "'", i12.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i21 + "' != '" + 100+ "'", i21.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i23 + "' != '" + (-1)+ "'", i23.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i33 + "' != '" + (-1)+ "'", i33.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i45 + "' != '" + (-1)+ "'", i45.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b46 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i47 + "' != '" + (-1)+ "'", i47.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b50 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b51 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b52 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b64 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i65 + "' != '" + (-1)+ "'", i65.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b66 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b68 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b69 == true);

  }

  @Test
  public void test337() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test337"); }


    java.lang.String str1 = java.lang.Integer.toHexString(1610612786);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "60000032"+ "'", str1.equals("60000032"));

  }

  @Test
  public void test338() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test338"); }


    java.lang.String str2 = java.lang.Integer.toUnsignedString(512, 805306371);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "512"+ "'", str2.equals("512"));

  }

  @Test
  public void test339() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test339"); }


    int i1 = java.lang.Integer.highestOneBit(1073741826);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 1073741824);

  }

  @Test
  public void test340() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test340"); }


    java.lang.Integer i1 = java.lang.Integer.valueOf("2621440");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 2621440+ "'", i1.equals(2621440));

  }

  @Test
  public void test341() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test341"); }


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
    tp2.IPBan iPBan47 = strictlySortedSinglyLinkedList0.get(436207642);
    
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
    org.junit.Assert.assertNull(iPBan47);

  }

  @Test
  public void test342() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test342"); }


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
    tp2.IPBan iPBan15 = new tp2.IPBan(iP9, (java.lang.Long)23L);
    java.lang.Long long16 = iPBan15.getExpires();
    
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
    org.junit.Assert.assertTrue("'" + long16 + "' != '" + 23L+ "'", long16.equals(23L));

  }

  @Test
  public void test343() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test343"); }


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
    tp2.IP iP51 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    boolean b52 = server46.removeBan(iP51);
    boolean b53 = server46.bansSorted();
    tp2.Server server54 = new tp2.Server();
    boolean b55 = server54.exceptionsNotRepeated();
    tp2.IP iP60 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i61 = iP60.getThird();
    iP60.setSecond((java.lang.Integer)10);
    boolean b64 = server54.removeBan(iP60);
    java.lang.Integer i65 = iP60.getSecond();
    boolean b66 = server46.addException(iP60);
    java.lang.Integer i67 = iP60.getSecond();
    iP60.setSecond((java.lang.Integer)64);
    singlyLinkedList0.add(iP60);
    java.lang.Integer i71 = iP60.getSecond();
    
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
    org.junit.Assert.assertTrue(b52 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b53 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b55 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i61 + "' != '" + (-1)+ "'", i61.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b64 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i65 + "' != '" + 10+ "'", i65.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b66 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i67 + "' != '" + 10+ "'", i67.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i71 + "' != '" + 64+ "'", i71.equals(64));

  }

  @Test
  public void test344() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test344"); }


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
    tp2.IPBan iPBan22 = null;
    boolean b23 = strictlySortedSinglyLinkedList0.add(iPBan22);
    int i24 = strictlySortedSinglyLinkedList0.getSize();
    int i25 = strictlySortedSinglyLinkedList0.getSize();
    
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
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 0);

  }

  @Test
  public void test345() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test345"); }


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
    tp2.Server server63 = new tp2.Server();
    boolean b64 = server63.exceptionsNotRepeated();
    boolean b65 = server63.bansSorted();
    tp2.SinglyLinkedList singlyLinkedList66 = new tp2.SinglyLinkedList();
    tp2.IP iP71 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i72 = iP71.getThird();
    boolean b73 = singlyLinkedList66.remove(iP71);
    iP71.setSecond((java.lang.Integer)150994944);
    java.lang.Integer i76 = iP71.getFourth();
    java.lang.Integer i77 = iP71.getThird();
    java.lang.Integer i78 = iP71.getFirst();
    boolean b79 = server63.connect(iP71);
    boolean b80 = server0.removeBan(iP71);
    boolean b81 = server0.bansNotRepeatedExpirationOrIP();
    boolean b82 = server0.bansOkTime();
    server0.update();
    
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
    org.junit.Assert.assertTrue(b64 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b65 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i72 + "' != '" + (-1)+ "'", i72.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b73 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i76 + "' != '" + 100+ "'", i76.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i77 + "' != '" + (-1)+ "'", i77.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i78 + "' != '" + (-1)+ "'", i78.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b79 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b80 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b81 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b82 == true);

  }

  @Test
  public void test346() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test346"); }


    tp2.IP iP4 = new tp2.IP((java.lang.Integer)(-1601830656), (java.lang.Integer)80007168, (java.lang.Integer)1154027520, (java.lang.Integer)11884);

  }

  @Test
  public void test347() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test347"); }


    int i2 = java.lang.Integer.rotateLeft(20, 58000000);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 20);

  }

  @Test
  public void test348() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test348"); }


    // The following exception was thrown during execution in test generation
    try {
      int i2 = java.lang.Integer.parseInt("1100000000000000000000000000", 448);
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test349() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test349"); }


    tp2.Server server0 = new tp2.Server();
    tp2.IP iP5 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    boolean b6 = server0.removeBan(iP5);
    boolean b7 = server0.bansNotRepeatedExpirationOrIP();
    tp2.IP iP8 = null;
    boolean b9 = server0.connect(iP8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);

  }

  @Test
  public void test350() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test350"); }


    int i2 = java.lang.Integer.rotateRight(6291456, 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 786432);

  }

  @Test
  public void test351() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test351"); }


    tp2.Server server0 = new tp2.Server();
    boolean b1 = server0.notSharedElements();
    tp2.SinglyLinkedList singlyLinkedList2 = new tp2.SinglyLinkedList();
    tp2.IP iP7 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i8 = iP7.getThird();
    boolean b9 = singlyLinkedList2.remove(iP7);
    boolean b10 = server0.addException(iP7);
    java.lang.Integer i11 = iP7.getFirst();
    tp2.IPBan iPBan13 = new tp2.IPBan(iP7, (java.lang.Long)5L);
    tp2.IP iP14 = iPBan13.getIp();
    tp2.IP iP15 = iPBan13.getIp();
    iPBan13.setExpires((java.lang.Long)536870912L);
    iPBan13.setExpires((java.lang.Long)0L);
    
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
    org.junit.Assert.assertNotNull(iP14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP15);

  }

  @Test
  public void test352() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test352"); }


    java.lang.String str1 = java.lang.Integer.toHexString(967835608);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "39afffd8"+ "'", str1.equals("39afffd8"));

  }

  @Test
  public void test353() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test353"); }


    int i2 = java.lang.Integer.remainderUnsigned(1, 6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);

  }

  @Test
  public void test354() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test354"); }


    int i2 = java.lang.Integer.compare((-872415232), 1400000000);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == (-1));

  }

  @Test
  public void test355() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test355"); }


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
    java.lang.Integer i28 = iP26.getFirst();
    iP26.setThird((java.lang.Integer)134217599);
    boolean b31 = server0.removeBan(iP26);
    tp2.ITime iTime32 = null;
    server0.setTime(iTime32);
    
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
    org.junit.Assert.assertTrue("'" + i28 + "' != '" + (-1)+ "'", i28.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == false);

  }

  @Test
  public void test356() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test356"); }


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
    tp2.IPBan iPBan39 = strictlySortedSinglyLinkedList0.get(637534208);
    tp2.IP iP44 = new tp2.IP((java.lang.Integer)4, (java.lang.Integer)12, (java.lang.Integer)11100, (java.lang.Integer)134217728);
    java.lang.Integer i45 = null;
    iP44.setFirst(i45);
    boolean b47 = strictlySortedSinglyLinkedList0.containsIP(iP44);
    
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
    org.junit.Assert.assertTrue(b47 == false);

  }

  @Test
  public void test357() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test357"); }


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
    tp2.IPBan iPBan23 = strictlySortedSinglyLinkedList0.get(16);
    int i24 = strictlySortedSinglyLinkedList0.getSize();
    tp2.IPBan iPBan26 = strictlySortedSinglyLinkedList0.get(200000000);
    
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
    org.junit.Assert.assertTrue(i24 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iPBan26);

  }

  @Test
  public void test358() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test358"); }


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
    iP65.setSecond((java.lang.Integer)(-2));
    java.lang.Integer i72 = iP65.getFirst();
    
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
    org.junit.Assert.assertTrue("'" + i72 + "' != '" + (-1)+ "'", i72.equals((-1)));

  }

  @Test
  public void test359() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test359"); }


    // The following exception was thrown during execution in test generation
    try {
      java.lang.Integer i2 = java.lang.Integer.valueOf("101011111001", 637534312);
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test360() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test360"); }


    tp2.IP iP4 = new tp2.IP((java.lang.Integer)1610612742, (java.lang.Integer)150994944, (java.lang.Integer)4, (java.lang.Integer)3);
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
    tp2.IPBan iPBan24 = strictlySortedSinglyLinkedList5.get(167772160);
    boolean b25 = iP4.equals((java.lang.Object)167772160);
    tp2.IPBan iPBan27 = new tp2.IPBan(iP4, (java.lang.Long)64L);
    iPBan27.setExpires((java.lang.Long)25L);
    
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
    org.junit.Assert.assertTrue(b25 == false);

  }

  @Test
  public void test361() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test361"); }


    int i1 = java.lang.Integer.numberOfTrailingZeros((-872415232));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 26);

  }

  @Test
  public void test362() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test362"); }


    tp2.SinglyLinkedList singlyLinkedList0 = new tp2.SinglyLinkedList();
    tp2.IP iP5 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i6 = iP5.getThird();
    boolean b7 = singlyLinkedList0.remove(iP5);
    tp2.IPBan iPBan9 = new tp2.IPBan(iP5, (java.lang.Long)10L);
    java.lang.Long long10 = iPBan9.getExpires();
    tp2.Server server11 = new tp2.Server();
    tp2.IP iP16 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    boolean b17 = server11.removeBan(iP16);
    iP16.setThird((java.lang.Integer)167772260);
    iPBan9.setIp(iP16);
    tp2.IP iP25 = new tp2.IP((java.lang.Integer)150994944, (java.lang.Integer)784, (java.lang.Integer)784, (java.lang.Integer)2);
    java.lang.Integer i26 = iP25.getFourth();
    iP25.setSecond((java.lang.Integer)805306368);
    iPBan9.setIp(iP25);
    tp2.Server server30 = new tp2.Server();
    tp2.ITime iTime31 = null;
    server30.setTime(iTime31);
    tp2.ITime iTime33 = null;
    server30.setTime(iTime33);
    tp2.Server server35 = new tp2.Server();
    tp2.IP iP40 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    boolean b41 = server35.removeBan(iP40);
    java.lang.Integer i42 = iP40.getFirst();
    boolean b43 = server30.addException(iP40);
    boolean b44 = server30.bansSorted();
    boolean b45 = server30.notSharedElements();
    tp2.Server server46 = new tp2.Server();
    boolean b47 = server46.exceptionsNotRepeated();
    boolean b48 = server46.bansSorted();
    tp2.SinglyLinkedList singlyLinkedList49 = new tp2.SinglyLinkedList();
    tp2.IP iP54 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i55 = iP54.getThird();
    boolean b56 = singlyLinkedList49.remove(iP54);
    iP54.setSecond((java.lang.Integer)150994944);
    java.lang.Integer i59 = iP54.getFourth();
    java.lang.Integer i60 = iP54.getThird();
    java.lang.Integer i61 = iP54.getFirst();
    boolean b62 = server46.connect(iP54);
    boolean b63 = server30.connect(iP54);
    boolean b64 = server30.bansOkTime();
    boolean b65 = iP25.equals((java.lang.Object)b64);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i6 + "' != '" + (-1)+ "'", i6.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long10 + "' != '" + 10L+ "'", long10.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i26 + "' != '" + 2+ "'", i26.equals(2));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i42 + "' != '" + (-1)+ "'", i42.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b43 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b47 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b48 == true);
    
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
    org.junit.Assert.assertTrue(b62 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b63 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b64 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b65 == false);

  }

  @Test
  public void test363() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test363"); }


    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList0 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP5 = new tp2.IP((java.lang.Integer)150994944, (java.lang.Integer)11100, (java.lang.Integer)784, (java.lang.Integer)0);
    boolean b6 = strictlySortedSinglyLinkedList0.removeFromIP(iP5);
    tp2.IP iP11 = new tp2.IP((java.lang.Integer)150994944, (java.lang.Integer)11100, (java.lang.Integer)784, (java.lang.Integer)0);
    boolean b12 = strictlySortedSinglyLinkedList0.removeFromIP(iP11);
    tp2.IP iP17 = new tp2.IP((java.lang.Integer)1073741824, (java.lang.Integer)(-1), (java.lang.Integer)16, (java.lang.Integer)1);
    tp2.IPBan iPBan19 = new tp2.IPBan(iP17, (java.lang.Long)1L);
    boolean b20 = strictlySortedSinglyLinkedList0.contains(iPBan19);
    tp2.IP iP21 = null;
    boolean b22 = strictlySortedSinglyLinkedList0.removeFromIP(iP21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);

  }

  @Test
  public void test364() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test364"); }


    tp2.IP iP4 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i5 = iP4.getFirst();
    java.lang.Integer i6 = iP4.getSecond();
    iP4.setFirst((java.lang.Integer)1);
    java.lang.Integer i9 = iP4.getSecond();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i5 + "' != '" + (-1)+ "'", i5.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i6 + "' != '" + (-1)+ "'", i6.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + (-1)+ "'", i9.equals((-1)));

  }

  @Test
  public void test365() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test365"); }


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
    boolean b24 = server0.bansSorted();
    boolean b25 = server0.exceptionsNotRepeated();
    
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
  public void test366() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test366"); }


    tp2.Server server0 = new tp2.Server();
    boolean b1 = server0.exceptionsNotRepeated();
    boolean b2 = server0.bansSorted();
    boolean b3 = server0.notSharedElements();
    tp2.SinglyLinkedList singlyLinkedList4 = new tp2.SinglyLinkedList();
    tp2.IP iP9 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i10 = iP9.getFourth();
    singlyLinkedList4.add(iP9);
    boolean b12 = server0.addException(iP9);
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
    iP39.setThird((java.lang.Integer)144);
    java.lang.Integer i45 = iP39.getSecond();
    boolean b46 = server0.connect(iP39);
    
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
    org.junit.Assert.assertTrue("'" + i45 + "' != '" + (-1)+ "'", i45.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b46 == true);

  }

  @Test
  public void test367() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test367"); }


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
    boolean b23 = server0.exceptionsNotRepeated();
    tp2.Server server24 = new tp2.Server();
    tp2.ITime iTime25 = null;
    server24.setTime(iTime25);
    tp2.ITime iTime27 = null;
    server24.setTime(iTime27);
    tp2.Server server29 = new tp2.Server();
    tp2.IP iP34 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    boolean b35 = server29.removeBan(iP34);
    java.lang.Integer i36 = iP34.getFirst();
    boolean b37 = server24.addException(iP34);
    boolean b38 = server0.removeBan(iP34);
    
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
    org.junit.Assert.assertTrue(b35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i36 + "' != '" + (-1)+ "'", i36.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == false);

  }

  @Test
  public void test368() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test368"); }


    int i2 = java.lang.Integer.remainderUnsigned(177600, 40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);

  }

  @Test
  public void test369() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test369"); }


    int i1 = java.lang.Integer.parseInt("469762048");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 469762048);

  }

  @Test
  public void test370() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test370"); }


    int i1 = java.lang.Integer.numberOfTrailingZeros(34603041);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);

  }

  @Test
  public void test371() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test371"); }


    int i2 = java.lang.Integer.max(671088640, (-1073741824));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 671088640);

  }

  @Test
  public void test372() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test372"); }


    java.lang.Integer i1 = java.lang.Integer.valueOf(1546321948);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 1546321948+ "'", i1.equals(1546321948));

  }

  @Test
  public void test373() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test373"); }


    int i2 = java.lang.Integer.max(1400000000, 16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1400000000);

  }

  @Test
  public void test374() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test374"); }


    int i2 = java.lang.Integer.rotateRight(67108864, 4194304);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 67108864);

  }

  @Test
  public void test375() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test375"); }


    java.lang.String str1 = java.lang.Integer.toBinaryString((-1601830656));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "10100000100001100000000100000000"+ "'", str1.equals("10100000100001100000000100000000"));

  }

  @Test
  public void test376() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test376"); }


    int i2 = java.lang.Integer.sum(1275068422, 64);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1275068486);

  }

  @Test
  public void test377() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test377"); }


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
    tp2.ITime iTime23 = null;
    server0.setTime(iTime23);
    tp2.Server server25 = new tp2.Server();
    boolean b26 = server25.bansSorted();
    tp2.IP iP31 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i32 = iP31.getFourth();
    boolean b33 = server25.removeException(iP31);
    boolean b34 = server25.exceptionsNotRepeated();
    tp2.Server server35 = new tp2.Server();
    tp2.IP iP40 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    boolean b41 = server35.removeBan(iP40);
    tp2.IP iP46 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i47 = iP46.getThird();
    iP46.setFourth((java.lang.Integer)0);
    iP46.setSecond((java.lang.Integer)3);
    iP46.setFourth((java.lang.Integer)12);
    boolean b54 = server35.addBan(iP46);
    java.lang.Integer i55 = iP46.getThird();
    boolean b56 = server25.connect(iP46);
    boolean b57 = server0.removeException(iP46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i12 + "' != '" + (-1)+ "'", i12.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i32 + "' != '" + 100+ "'", i32.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i47 + "' != '" + (-1)+ "'", i47.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b54 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i55 + "' != '" + (-1)+ "'", i55.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b56 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b57 == false);

  }

  @Test
  public void test378() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test378"); }


    java.lang.Integer i1 = new java.lang.Integer(4194304);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 4194304+ "'", i1.equals(4194304));

  }

  @Test
  public void test379() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test379"); }


    int i1 = java.lang.Integer.bitCount(1073741844);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 3);

  }

  @Test
  public void test380() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test380"); }


    // The following exception was thrown during execution in test generation
    try {
      java.lang.Integer i2 = java.lang.Integer.valueOf("1010000000", 44);
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

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test381"); }


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
    tp2.IPBan iPBan22 = null;
    boolean b23 = strictlySortedSinglyLinkedList0.add(iPBan22);
    tp2.IP iP28 = new tp2.IP((java.lang.Integer)11100, (java.lang.Integer)40, (java.lang.Integer)28, (java.lang.Integer)727449600);
    java.lang.Integer i29 = iP28.getFourth();
    tp2.IPBan iPBan31 = new tp2.IPBan(iP28, (java.lang.Long)784L);
    boolean b32 = strictlySortedSinglyLinkedList0.contains(iPBan31);
    tp2.IP iP37 = new tp2.IP((java.lang.Integer)5120, (java.lang.Integer)1073741824, (java.lang.Integer)51, (java.lang.Integer)671088640);
    iP37.setSecond((java.lang.Integer)201326624);
    iP37.setSecond((java.lang.Integer)1);
    java.lang.Integer i42 = iP37.getFourth();
    tp2.IPBan iPBan44 = new tp2.IPBan(iP37, (java.lang.Long)10L);
    boolean b45 = strictlySortedSinglyLinkedList0.removeFromIP(iP37);
    
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
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i29 + "' != '" + 727449600+ "'", i29.equals(727449600));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i42 + "' != '" + 671088640+ "'", i42.equals(671088640));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == false);

  }

  @Test
  public void test382() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test382"); }


    java.lang.String str1 = java.lang.Integer.toHexString(448);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "1c0"+ "'", str1.equals("1c0"));

  }

  @Test
  public void test383() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test383"); }


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
    int i27 = singlyLinkedList0.getSize();
    
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
    org.junit.Assert.assertTrue(i27 == 1);

  }

  @Test
  public void test384() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test384"); }


    tp2.SinglyLinkedList singlyLinkedList0 = new tp2.SinglyLinkedList();
    tp2.IP iP5 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i6 = iP5.getFourth();
    singlyLinkedList0.add(iP5);
    java.lang.Integer i8 = iP5.getFirst();
    tp2.IPBan iPBan10 = new tp2.IPBan(iP5, (java.lang.Long)4L);
    tp2.IP iP11 = iPBan10.getIp();
    tp2.IPBan iPBan13 = new tp2.IPBan(iP11, (java.lang.Long)144L);
    java.lang.Integer i14 = iP11.getThird();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i6 + "' != '" + 100+ "'", i6.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i8 + "' != '" + (-1)+ "'", i8.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i14 + "' != '" + (-1)+ "'", i14.equals((-1)));

  }

  @Test
  public void test385() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test385"); }


    int i1 = java.lang.Integer.lowestOneBit(100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 4);

  }

  @Test
  public void test386() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test386"); }


    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList0 = new tp2.StrictlySortedSinglyLinkedList();
    boolean b1 = strictlySortedSinglyLinkedList0.isEmpty();
    tp2.SinglyLinkedList singlyLinkedList2 = new tp2.SinglyLinkedList();
    tp2.IP iP7 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i8 = iP7.getThird();
    boolean b9 = singlyLinkedList2.remove(iP7);
    tp2.IPBan iPBan11 = new tp2.IPBan(iP7, (java.lang.Long)10L);
    tp2.IP iP16 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i17 = iP16.getFourth();
    iPBan11.setIp(iP16);
    java.lang.Long long19 = iPBan11.getExpires();
    java.lang.Long long20 = iPBan11.getExpires();
    tp2.IP iP25 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i26 = iP25.getFirst();
    java.lang.Integer i27 = iP25.getSecond();
    iP25.setFirst((java.lang.Integer)201326592);
    iPBan11.setIp(iP25);
    boolean b31 = strictlySortedSinglyLinkedList0.contains(iPBan11);
    tp2.SinglyLinkedList singlyLinkedList32 = new tp2.SinglyLinkedList();
    tp2.IP iP37 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i38 = iP37.getThird();
    boolean b39 = singlyLinkedList32.remove(iP37);
    tp2.IPBan iPBan41 = new tp2.IPBan(iP37, (java.lang.Long)10L);
    iPBan41.setExpires((java.lang.Long)4L);
    tp2.Server server44 = new tp2.Server();
    boolean b45 = server44.notSharedElements();
    tp2.SinglyLinkedList singlyLinkedList46 = new tp2.SinglyLinkedList();
    tp2.IP iP51 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i52 = iP51.getThird();
    boolean b53 = singlyLinkedList46.remove(iP51);
    boolean b54 = server44.addException(iP51);
    tp2.SinglyLinkedList singlyLinkedList55 = new tp2.SinglyLinkedList();
    tp2.IP iP60 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i61 = iP60.getFourth();
    singlyLinkedList55.add(iP60);
    java.lang.Integer i63 = iP60.getFirst();
    boolean b64 = server44.removeBan(iP60);
    iPBan41.setIp(iP60);
    tp2.IP iP70 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i71 = iP70.getThird();
    iP70.setFourth((java.lang.Integer)0);
    iP70.setSecond((java.lang.Integer)3);
    iPBan41.setIp(iP70);
    boolean b77 = strictlySortedSinglyLinkedList0.add(iPBan41);
    tp2.SinglyLinkedList singlyLinkedList78 = new tp2.SinglyLinkedList();
    tp2.IP iP83 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i84 = iP83.getThird();
    boolean b85 = singlyLinkedList78.remove(iP83);
    iP83.setSecond((java.lang.Integer)150994944);
    java.lang.Integer i88 = iP83.getFourth();
    java.lang.Integer i89 = iP83.getThird();
    java.lang.Integer i90 = iP83.getFirst();
    tp2.IPBan iPBan92 = new tp2.IPBan(iP83, (java.lang.Long)23L);
    boolean b93 = strictlySortedSinglyLinkedList0.add(iPBan92);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i8 + "' != '" + (-1)+ "'", i8.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i17 + "' != '" + 100+ "'", i17.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long19 + "' != '" + 10L+ "'", long19.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long20 + "' != '" + 10L+ "'", long20.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i26 + "' != '" + (-1)+ "'", i26.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i27 + "' != '" + (-1)+ "'", i27.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i38 + "' != '" + (-1)+ "'", i38.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i52 + "' != '" + (-1)+ "'", i52.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b53 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b54 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i61 + "' != '" + 100+ "'", i61.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i63 + "' != '" + (-1)+ "'", i63.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b64 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i71 + "' != '" + (-1)+ "'", i71.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b77 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i84 + "' != '" + (-1)+ "'", i84.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b85 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i88 + "' != '" + 100+ "'", i88.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i89 + "' != '" + (-1)+ "'", i89.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i90 + "' != '" + (-1)+ "'", i90.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b93 == true);

  }

  @Test
  public void test387() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test387"); }


    int i1 = java.lang.Integer.highestOneBit(786432);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 524288);

  }

  @Test
  public void test388() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test388"); }


    tp2.SinglyLinkedList singlyLinkedList0 = new tp2.SinglyLinkedList();
    tp2.Server server1 = new tp2.Server();
    boolean b2 = server1.exceptionsNotRepeated();
    tp2.IP iP7 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i8 = iP7.getThird();
    iP7.setSecond((java.lang.Integer)10);
    boolean b11 = server1.removeBan(iP7);
    boolean b12 = singlyLinkedList0.remove(iP7);
    java.lang.Integer i13 = iP7.getFourth();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i8 + "' != '" + (-1)+ "'", i8.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i13 + "' != '" + 100+ "'", i13.equals(100));

  }

  @Test
  public void test389() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test389"); }


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
  public void test390() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test390"); }


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
    boolean b38 = strictlySortedSinglyLinkedList0.isEmpty();
    tp2.IP iP43 = new tp2.IP((java.lang.Integer)5, (java.lang.Integer)1, (java.lang.Integer)0, (java.lang.Integer)12);
    iP43.setThird((java.lang.Integer)8);
    tp2.IPBan iPBan47 = new tp2.IPBan(iP43, (java.lang.Long)0L);
    boolean b48 = strictlySortedSinglyLinkedList0.removeFromIP(iP43);
    
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
    org.junit.Assert.assertTrue(b38 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b48 == false);

  }

  @Test
  public void test391() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test391"); }


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
    boolean b14 = server0.exceptionsNotRepeated();
    
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
  public void test392() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test392"); }


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
    tp2.IP iP22 = new tp2.IP((java.lang.Integer)51, (java.lang.Integer)5, (java.lang.Integer)31, (java.lang.Integer)2);
    boolean b23 = server0.connect(iP22);
    tp2.IP iP28 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i29 = iP28.getThird();
    boolean b30 = server0.removeBan(iP28);
    
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
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i29 + "' != '" + (-1)+ "'", i29.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);

  }

  @Test
  public void test393() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test393"); }


    tp2.Server server0 = new tp2.Server();
    boolean b1 = server0.bansSorted();
    tp2.IP iP6 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i7 = iP6.getFourth();
    boolean b8 = server0.removeException(iP6);
    boolean b9 = server0.exceptionsNotRepeated();
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
    tp2.IP iP34 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i35 = iP34.getFirst();
    java.lang.Integer i36 = iP34.getFirst();
    singlyLinkedList10.add(iP34);
    tp2.SinglyLinkedList singlyLinkedList38 = new tp2.SinglyLinkedList();
    tp2.IP iP43 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i44 = iP43.getThird();
    boolean b45 = singlyLinkedList38.remove(iP43);
    tp2.Server server46 = new tp2.Server();
    tp2.IP iP51 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    boolean b52 = server46.removeBan(iP51);
    boolean b53 = singlyLinkedList38.contains(iP51);
    singlyLinkedList10.add(iP51);
    tp2.SinglyLinkedList singlyLinkedList55 = new tp2.SinglyLinkedList();
    tp2.IP iP60 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i61 = iP60.getThird();
    boolean b62 = singlyLinkedList55.remove(iP60);
    tp2.Server server63 = new tp2.Server();
    tp2.IP iP68 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    boolean b69 = server63.removeBan(iP68);
    boolean b70 = singlyLinkedList55.contains(iP68);
    singlyLinkedList10.add(iP68);
    boolean b72 = server0.addException(iP68);
    boolean b73 = server0.bansSorted();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i7 + "' != '" + 100+ "'", i7.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
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
    org.junit.Assert.assertTrue("'" + i35 + "' != '" + (-1)+ "'", i35.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i36 + "' != '" + (-1)+ "'", i36.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i44 + "' != '" + (-1)+ "'", i44.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b52 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b53 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i61 + "' != '" + (-1)+ "'", i61.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b62 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b69 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b70 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b72 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b73 == true);

  }

  @Test
  public void test394() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test394"); }


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
    tp2.SinglyLinkedList singlyLinkedList36 = new tp2.SinglyLinkedList();
    tp2.IP iP37 = null;
    boolean b38 = singlyLinkedList36.remove(iP37);
    boolean b39 = singlyLinkedList36.isEmpty();
    tp2.IP iP44 = new tp2.IP((java.lang.Integer)5, (java.lang.Integer)1, (java.lang.Integer)0, (java.lang.Integer)12);
    boolean b45 = singlyLinkedList36.contains(iP44);
    tp2.SinglyLinkedList singlyLinkedList46 = new tp2.SinglyLinkedList();
    tp2.IP iP51 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i52 = iP51.getThird();
    boolean b53 = singlyLinkedList46.remove(iP51);
    iP51.setSecond((java.lang.Integer)150994944);
    java.lang.Integer i56 = iP51.getFourth();
    java.lang.Integer i57 = iP51.getThird();
    java.lang.Integer i58 = iP51.getFirst();
    boolean b59 = singlyLinkedList36.contains(iP51);
    tp2.SinglyLinkedList singlyLinkedList60 = new tp2.SinglyLinkedList();
    tp2.IP iP65 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i66 = iP65.getFourth();
    singlyLinkedList60.add(iP65);
    java.lang.Integer i68 = iP65.getFirst();
    boolean b69 = singlyLinkedList36.remove(iP65);
    boolean b70 = singlyLinkedList0.remove(iP65);
    java.lang.Integer i71 = iP65.getThird();
    
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
    org.junit.Assert.assertTrue(b38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i52 + "' != '" + (-1)+ "'", i52.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b53 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i56 + "' != '" + 100+ "'", i56.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i57 + "' != '" + (-1)+ "'", i57.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i58 + "' != '" + (-1)+ "'", i58.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b59 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i66 + "' != '" + 100+ "'", i66.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i68 + "' != '" + (-1)+ "'", i68.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b69 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b70 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i71 + "' != '" + (-1)+ "'", i71.equals((-1)));

  }

  @Test
  public void test395() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test395"); }


    tp2.Server server0 = new tp2.Server();
    boolean b1 = server0.exceptionsNotRepeated();
    boolean b2 = server0.bansSorted();
    boolean b3 = server0.notSharedElements();
    boolean b4 = server0.bansSorted();
    server0.update();
    tp2.IP iP10 = new tp2.IP((java.lang.Integer)11100, (java.lang.Integer)40, (java.lang.Integer)28, (java.lang.Integer)727449600);
    boolean b11 = server0.addException(iP10);
    server0.update();
    tp2.IP iP13 = null;
    boolean b14 = server0.connect(iP13);
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
    org.junit.Assert.assertTrue(b14 == true);

  }

  @Test
  public void test396() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test396"); }


    java.lang.Integer i2 = java.lang.Integer.getInteger("13", 805306368);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i2 + "' != '" + 805306368+ "'", i2.equals(805306368));

  }

  @Test
  public void test397() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test397"); }


    int i2 = java.lang.Integer.rotateLeft((-1073741824), 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == (-1073741824));

  }

  @Test
  public void test398() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test398"); }


    tp2.Server server0 = new tp2.Server();
    boolean b1 = server0.exceptionsNotRepeated();
    boolean b2 = server0.bansSorted();
    boolean b3 = server0.notSharedElements();
    boolean b4 = server0.bansSorted();
    server0.update();
    tp2.IP iP10 = new tp2.IP((java.lang.Integer)11100, (java.lang.Integer)40, (java.lang.Integer)28, (java.lang.Integer)727449600);
    boolean b11 = server0.addException(iP10);
    java.lang.Integer i12 = iP10.getFourth();
    
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
    org.junit.Assert.assertTrue("'" + i12 + "' != '" + 727449600+ "'", i12.equals(727449600));

  }

  @Test
  public void test399() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test399"); }


    int i1 = java.lang.Integer.reverse(256);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 8388608);

  }

  @Test
  public void test400() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test400"); }


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
    tp2.Server server21 = new tp2.Server();
    boolean b22 = server21.notSharedElements();
    tp2.SinglyLinkedList singlyLinkedList23 = new tp2.SinglyLinkedList();
    tp2.IP iP28 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i29 = iP28.getThird();
    boolean b30 = singlyLinkedList23.remove(iP28);
    boolean b31 = server21.addException(iP28);
    tp2.SinglyLinkedList singlyLinkedList32 = new tp2.SinglyLinkedList();
    tp2.IP iP37 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i38 = iP37.getFourth();
    singlyLinkedList32.add(iP37);
    java.lang.Integer i40 = iP37.getFirst();
    boolean b41 = server21.removeBan(iP37);
    tp2.ITime iTime42 = null;
    server21.setTime(iTime42);
    boolean b44 = server21.bansSorted();
    tp2.IP iP49 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i50 = iP49.getFourth();
    iP49.setFirst((java.lang.Integer)16);
    boolean b53 = server21.addBan(iP49);
    boolean b54 = server0.addException(iP49);
    
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
    org.junit.Assert.assertTrue(b22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i29 + "' != '" + (-1)+ "'", i29.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i38 + "' != '" + 100+ "'", i38.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i40 + "' != '" + (-1)+ "'", i40.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i50 + "' != '" + 100+ "'", i50.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b53 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b54 == true);

  }

  @Test
  public void test401() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test401"); }


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
    tp2.Server server20 = new tp2.Server();
    boolean b21 = server20.notSharedElements();
    boolean b22 = server20.exceptionsNotRepeated();
    tp2.Server server23 = new tp2.Server();
    tp2.ITime iTime24 = null;
    server23.setTime(iTime24);
    tp2.ITime iTime26 = null;
    server23.setTime(iTime26);
    tp2.Server server28 = new tp2.Server();
    tp2.IP iP33 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    boolean b34 = server28.removeBan(iP33);
    java.lang.Integer i35 = iP33.getFirst();
    boolean b36 = server23.addException(iP33);
    boolean b37 = server20.removeBan(iP33);
    boolean b38 = strictlySortedSinglyLinkedList0.removeFromIP(iP33);
    
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
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i35 + "' != '" + (-1)+ "'", i35.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == false);

  }

  @Test
  public void test402() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test402"); }


    int i1 = java.lang.Integer.numberOfLeadingZeros(2809);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 20);

  }

  @Test
  public void test403() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test403"); }


    int i2 = java.lang.Integer.max(4194304, 28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 4194304);

  }

  @Test
  public void test404() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test404"); }


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
    boolean b24 = server0.bansSorted();
    
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
  public void test405() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test405"); }


    tp2.Server server0 = new tp2.Server();
    boolean b1 = server0.exceptionsNotRepeated();
    boolean b2 = server0.bansSorted();
    boolean b3 = server0.notSharedElements();
    boolean b4 = server0.bansSorted();
    tp2.Server server5 = new tp2.Server();
    boolean b6 = server5.notSharedElements();
    tp2.SinglyLinkedList singlyLinkedList7 = new tp2.SinglyLinkedList();
    tp2.IP iP12 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i13 = iP12.getThird();
    boolean b14 = singlyLinkedList7.remove(iP12);
    boolean b15 = server5.addException(iP12);
    tp2.SinglyLinkedList singlyLinkedList16 = new tp2.SinglyLinkedList();
    tp2.IP iP21 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i22 = iP21.getFourth();
    singlyLinkedList16.add(iP21);
    java.lang.Integer i24 = iP21.getFirst();
    boolean b25 = server5.removeBan(iP21);
    tp2.ITime iTime26 = null;
    server5.setTime(iTime26);
    boolean b28 = server5.bansSorted();
    tp2.IP iP33 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i34 = iP33.getFourth();
    iP33.setFirst((java.lang.Integer)16);
    boolean b37 = server5.addBan(iP33);
    boolean b38 = server5.exceptionsNotRepeated();
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
    java.lang.Integer i69 = iP68.getFourth();
    singlyLinkedList63.add(iP68);
    java.lang.Integer i71 = iP68.getFirst();
    boolean b72 = singlyLinkedList39.contains(iP68);
    boolean b73 = server5.connect(iP68);
    boolean b74 = server0.removeException(iP68);
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
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i13 + "' != '" + (-1)+ "'", i13.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i22 + "' != '" + 100+ "'", i22.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i24 + "' != '" + (-1)+ "'", i24.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i34 + "' != '" + 100+ "'", i34.equals(100));
    
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
    org.junit.Assert.assertTrue("'" + i69 + "' != '" + 100+ "'", i69.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i71 + "' != '" + (-1)+ "'", i71.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b72 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b73 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b74 == false);

  }

  @Test
  public void test406() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test406"); }


    int i2 = java.lang.Integer.remainderUnsigned(201326624, 524288);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 32);

  }

  @Test
  public void test407() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test407"); }


    java.lang.String str1 = java.lang.Integer.toOctalString(201326624);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "1400000040"+ "'", str1.equals("1400000040"));

  }

  @Test
  public void test408() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test408"); }


    int i2 = java.lang.Integer.rotateLeft(48, 44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 196608);

  }

  @Test
  public void test409() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test409"); }


    tp2.SinglyLinkedList singlyLinkedList0 = new tp2.SinglyLinkedList();
    tp2.IP iP5 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i6 = iP5.getThird();
    boolean b7 = singlyLinkedList0.remove(iP5);
    iP5.setSecond((java.lang.Integer)150994944);
    java.lang.Integer i10 = iP5.getFourth();
    iP5.setThird((java.lang.Integer)80);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i6 + "' != '" + (-1)+ "'", i6.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i10 + "' != '" + 100+ "'", i10.equals(100));

  }

  @Test
  public void test410() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test410"); }


    int i1 = java.lang.Integer.reverseBytes(3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 50331648);

  }

  @Test
  public void test411() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test411"); }


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
    iP16.setFirst((java.lang.Integer)939524096);
    
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
  public void test412() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test412"); }


    java.lang.String str1 = java.lang.Integer.toBinaryString(967835608);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "111001101011111111111111011000"+ "'", str1.equals("111001101011111111111111011000"));

  }

  @Test
  public void test413() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test413"); }


    java.lang.Integer i1 = new java.lang.Integer((-2));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + (-2)+ "'", i1.equals((-2)));

  }

  @Test
  public void test414() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test414"); }


    java.lang.Integer i1 = java.lang.Integer.valueOf(512);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 512+ "'", i1.equals(512));

  }

  @Test
  public void test415() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test415"); }


    tp2.Server server0 = new tp2.Server();
    boolean b1 = server0.exceptionsNotRepeated();
    boolean b2 = server0.bansSorted();
    boolean b3 = server0.notSharedElements();
    boolean b4 = server0.bansSorted();
    tp2.Server server5 = new tp2.Server();
    boolean b6 = server5.notSharedElements();
    tp2.SinglyLinkedList singlyLinkedList7 = new tp2.SinglyLinkedList();
    tp2.IP iP12 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i13 = iP12.getThird();
    boolean b14 = singlyLinkedList7.remove(iP12);
    boolean b15 = server5.addException(iP12);
    tp2.SinglyLinkedList singlyLinkedList16 = new tp2.SinglyLinkedList();
    tp2.IP iP21 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i22 = iP21.getFourth();
    singlyLinkedList16.add(iP21);
    java.lang.Integer i24 = iP21.getFirst();
    boolean b25 = server5.removeBan(iP21);
    tp2.ITime iTime26 = null;
    server5.setTime(iTime26);
    boolean b28 = server5.bansSorted();
    tp2.IP iP33 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i34 = iP33.getFourth();
    iP33.setFirst((java.lang.Integer)16);
    boolean b37 = server5.addBan(iP33);
    boolean b38 = server5.exceptionsNotRepeated();
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
    java.lang.Integer i69 = iP68.getFourth();
    singlyLinkedList63.add(iP68);
    java.lang.Integer i71 = iP68.getFirst();
    boolean b72 = singlyLinkedList39.contains(iP68);
    boolean b73 = server5.connect(iP68);
    boolean b74 = server0.removeException(iP68);
    iP68.setThird((java.lang.Integer)5120);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i13 + "' != '" + (-1)+ "'", i13.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i22 + "' != '" + 100+ "'", i22.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i24 + "' != '" + (-1)+ "'", i24.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i34 + "' != '" + 100+ "'", i34.equals(100));
    
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
    org.junit.Assert.assertTrue("'" + i69 + "' != '" + 100+ "'", i69.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i71 + "' != '" + (-1)+ "'", i71.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b72 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b73 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b74 == false);

  }

  @Test
  public void test416() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test416"); }


    java.lang.Integer i1 = java.lang.Integer.valueOf(536870912);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 536870912+ "'", i1.equals(536870912));

  }

  @Test
  public void test417() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test417"); }


    tp2.Server server0 = new tp2.Server();
    boolean b1 = server0.bansSorted();
    tp2.IP iP6 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i7 = iP6.getFourth();
    boolean b8 = server0.removeException(iP6);
    boolean b9 = server0.bansOkTime();
    tp2.IP iP14 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i15 = iP14.getThird();
    iP14.setSecond((java.lang.Integer)10);
    java.lang.Integer i18 = null;
    iP14.setSecond(i18);
    boolean b20 = server0.connect(iP14);
    boolean b21 = server0.notSharedElements();
    tp2.IP iP22 = null;
    boolean b23 = server0.removeException(iP22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i7 + "' != '" + 100+ "'", i7.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i15 + "' != '" + (-1)+ "'", i15.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);

  }

  @Test
  public void test418() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test418"); }


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
    tp2.IP iP23 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i24 = iP23.getFirst();
    java.lang.Integer i25 = iP23.getSecond();
    tp2.IPBan iPBan27 = new tp2.IPBan(iP23, (java.lang.Long)1L);
    iP23.setThird((java.lang.Integer)784);
    java.lang.Integer i30 = iP23.getFourth();
    boolean b31 = singlyLinkedList0.contains(iP23);
    tp2.SinglyLinkedList singlyLinkedList32 = new tp2.SinglyLinkedList();
    tp2.IP iP37 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i38 = iP37.getThird();
    boolean b39 = singlyLinkedList32.remove(iP37);
    tp2.IP iP44 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i45 = iP44.getFourth();
    singlyLinkedList32.add(iP44);
    int i47 = singlyLinkedList32.getSize();
    tp2.Server server48 = new tp2.Server();
    boolean b49 = server48.exceptionsNotRepeated();
    boolean b50 = server48.bansSorted();
    boolean b51 = server48.notSharedElements();
    tp2.SinglyLinkedList singlyLinkedList52 = new tp2.SinglyLinkedList();
    tp2.IP iP57 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i58 = iP57.getFourth();
    singlyLinkedList52.add(iP57);
    boolean b60 = server48.addException(iP57);
    tp2.IPBan iPBan62 = new tp2.IPBan(iP57, (java.lang.Long)727449600L);
    boolean b63 = singlyLinkedList32.contains(iP57);
    boolean b64 = singlyLinkedList0.contains(iP57);
    
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
    org.junit.Assert.assertTrue("'" + i24 + "' != '" + (-1)+ "'", i24.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i25 + "' != '" + (-1)+ "'", i25.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i30 + "' != '" + 100+ "'", i30.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i38 + "' != '" + (-1)+ "'", i38.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i45 + "' != '" + 100+ "'", i45.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i47 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b49 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b50 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b51 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i58 + "' != '" + 100+ "'", i58.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b60 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b63 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b64 == false);

  }

  @Test
  public void test419() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test419"); }


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
    server0.update();
    
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
  public void test420() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test420"); }


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
    tp2.SinglyLinkedList singlyLinkedList54 = new tp2.SinglyLinkedList();
    tp2.IP iP59 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i60 = iP59.getThird();
    boolean b61 = singlyLinkedList54.remove(iP59);
    tp2.IPBan iPBan63 = new tp2.IPBan(iP59, (java.lang.Long)10L);
    tp2.IP iP68 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i69 = iP68.getFourth();
    iPBan63.setIp(iP68);
    java.lang.Long long71 = iPBan63.getExpires();
    java.lang.Long long72 = iPBan63.getExpires();
    tp2.Server server73 = new tp2.Server();
    boolean b74 = server73.exceptionsNotRepeated();
    tp2.IP iP79 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i80 = iP79.getThird();
    iP79.setSecond((java.lang.Integer)10);
    boolean b83 = server73.removeBan(iP79);
    java.lang.Integer i84 = iP79.getFirst();
    iPBan63.setIp(iP79);
    boolean b86 = strictlySortedSinglyLinkedList0.contains(iPBan63);
    tp2.IP iP87 = iPBan63.getIp();
    
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
    org.junit.Assert.assertTrue("'" + i60 + "' != '" + (-1)+ "'", i60.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b61 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i69 + "' != '" + 100+ "'", i69.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long71 + "' != '" + 10L+ "'", long71.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long72 + "' != '" + 10L+ "'", long72.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b74 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i80 + "' != '" + (-1)+ "'", i80.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b83 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i84 + "' != '" + (-1)+ "'", i84.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b86 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP87);

  }

  @Test
  public void test421() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test421"); }


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
    tp2.IPBan iPBan23 = strictlySortedSinglyLinkedList0.get(16);
    int i24 = strictlySortedSinglyLinkedList0.getSize();
    int i25 = strictlySortedSinglyLinkedList0.getSize();
    
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
    org.junit.Assert.assertTrue(i24 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 0);

  }

  @Test
  public void test422() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test422"); }


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
    iP60.setFourth((java.lang.Integer)805306371);
    iP60.setThird((java.lang.Integer)15);
    
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

  }

  @Test
  public void test423() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test423"); }


    // The following exception was thrown during execution in test generation
    try {
      java.lang.Integer i1 = java.lang.Integer.valueOf("1100000000000000000000000101");
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

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test424"); }


    int i2 = java.lang.Integer.compareUnsigned(1610612786, (-2147390782));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == (-1));

  }

  @Test
  public void test425() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test425"); }


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
    boolean b28 = singlyLinkedList20.isEmpty();
    int i29 = singlyLinkedList20.getSize();
    tp2.IP iP34 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i35 = iP34.getThird();
    iP34.setFourth((java.lang.Integer)0);
    boolean b38 = singlyLinkedList20.contains(iP34);
    boolean b39 = singlyLinkedList20.isEmpty();
    tp2.IP iP44 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i45 = iP44.getFirst();
    java.lang.Integer i46 = iP44.getFirst();
    singlyLinkedList20.add(iP44);
    tp2.Server server48 = new tp2.Server();
    boolean b49 = server48.exceptionsNotRepeated();
    boolean b50 = server48.bansSorted();
    boolean b51 = server48.notSharedElements();
    tp2.SinglyLinkedList singlyLinkedList52 = new tp2.SinglyLinkedList();
    tp2.IP iP57 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i58 = iP57.getFourth();
    singlyLinkedList52.add(iP57);
    boolean b60 = server48.addException(iP57);
    java.lang.Integer i61 = iP57.getFourth();
    boolean b62 = singlyLinkedList20.contains(iP57);
    tp2.IP iP64 = singlyLinkedList20.get((-1073741812));
    singlyLinkedList0.add(iP64);
    iP64.setThird((java.lang.Integer)(-1179648000));
    
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
    org.junit.Assert.assertTrue(b28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i29 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i35 + "' != '" + (-1)+ "'", i35.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i45 + "' != '" + (-1)+ "'", i45.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i46 + "' != '" + (-1)+ "'", i46.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b49 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b50 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b51 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i58 + "' != '" + 100+ "'", i58.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b60 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i61 + "' != '" + 100+ "'", i61.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b62 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP64);

  }

  @Test
  public void test426() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test426"); }


    tp2.Server server0 = new tp2.Server();
    boolean b1 = server0.notSharedElements();
    boolean b2 = server0.exceptionsNotRepeated();
    tp2.ITime iTime3 = null;
    server0.setTime(iTime3);
    boolean b5 = server0.bansSorted();
    tp2.IP iP10 = new tp2.IP((java.lang.Integer)784, (java.lang.Integer)12, (java.lang.Integer)2, (java.lang.Integer)167772260);
    boolean b11 = server0.removeException(iP10);
    tp2.Server server12 = new tp2.Server();
    boolean b13 = server12.notSharedElements();
    boolean b14 = server12.exceptionsNotRepeated();
    tp2.Server server15 = new tp2.Server();
    boolean b16 = server15.exceptionsNotRepeated();
    boolean b17 = server15.bansSorted();
    boolean b18 = server15.notSharedElements();
    tp2.SinglyLinkedList singlyLinkedList19 = new tp2.SinglyLinkedList();
    tp2.IP iP24 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i25 = iP24.getFourth();
    singlyLinkedList19.add(iP24);
    boolean b27 = server15.addException(iP24);
    java.lang.Integer i28 = iP24.getSecond();
    iP24.setSecond((java.lang.Integer)(-1));
    tp2.IPBan iPBan32 = new tp2.IPBan(iP24, (java.lang.Long)25L);
    boolean b33 = server12.connect(iP24);
    boolean b34 = server0.removeException(iP24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i25 + "' != '" + 100+ "'", i25.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i28 + "' != '" + (-1)+ "'", i28.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);

  }

  @Test
  public void test427() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test427"); }


    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList0 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP5 = new tp2.IP((java.lang.Integer)150994944, (java.lang.Integer)11100, (java.lang.Integer)784, (java.lang.Integer)0);
    boolean b6 = strictlySortedSinglyLinkedList0.removeFromIP(iP5);
    boolean b7 = strictlySortedSinglyLinkedList0.isEmpty();
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList8 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IP iP13 = new tp2.IP((java.lang.Integer)150994944, (java.lang.Integer)784, (java.lang.Integer)784, (java.lang.Integer)2);
    java.lang.Integer i14 = iP13.getFourth();
    boolean b15 = strictlySortedSinglyLinkedList8.removeFromIP(iP13);
    tp2.SinglyLinkedList singlyLinkedList16 = new tp2.SinglyLinkedList();
    tp2.IP iP21 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i22 = iP21.getThird();
    boolean b23 = singlyLinkedList16.remove(iP21);
    java.lang.Integer i24 = iP21.getThird();
    boolean b25 = strictlySortedSinglyLinkedList8.removeFromIP(iP21);
    tp2.IPBan iPBan27 = strictlySortedSinglyLinkedList8.get(167772160);
    tp2.IPBan iPBan29 = strictlySortedSinglyLinkedList8.get(32);
    tp2.SinglyLinkedList singlyLinkedList30 = new tp2.SinglyLinkedList();
    tp2.IP iP35 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i36 = iP35.getThird();
    boolean b37 = singlyLinkedList30.remove(iP35);
    tp2.IPBan iPBan39 = new tp2.IPBan(iP35, (java.lang.Long)10L);
    java.lang.Long long40 = iPBan39.getExpires();
    tp2.Server server41 = new tp2.Server();
    tp2.IP iP46 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    boolean b47 = server41.removeBan(iP46);
    iP46.setThird((java.lang.Integer)167772260);
    iPBan39.setIp(iP46);
    boolean b51 = strictlySortedSinglyLinkedList8.contains(iPBan39);
    boolean b52 = strictlySortedSinglyLinkedList0.contains(iPBan39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i14 + "' != '" + 2+ "'", i14.equals(2));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i22 + "' != '" + (-1)+ "'", i22.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i24 + "' != '" + (-1)+ "'", i24.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iPBan27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iPBan29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i36 + "' != '" + (-1)+ "'", i36.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long40 + "' != '" + 10L+ "'", long40.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b47 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b51 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b52 == false);

  }

  @Test
  public void test428() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test428"); }


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
    tp2.IP iP44 = null;
    boolean b45 = strictlySortedSinglyLinkedList0.removeFromIP(iP44);
    tp2.IPBan iPBan47 = strictlySortedSinglyLinkedList0.get(31);
    
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
    org.junit.Assert.assertTrue(b45 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iPBan47);

  }

  @Test
  public void test429() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test429"); }


    long long1 = java.lang.Integer.toUnsignedLong(8192);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == 8192L);

  }

  @Test
  public void test430() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test430"); }


    java.lang.String str1 = java.lang.Integer.toBinaryString(5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "101"+ "'", str1.equals("101"));

  }

  @Test
  public void test431() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test431"); }


    int i2 = java.lang.Integer.sum(805306368, 786432);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 806092800);

  }

  @Test
  public void test432() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test432"); }


    // The following exception was thrown during execution in test generation
    try {
      java.lang.Integer i1 = java.lang.Integer.decode("c0000c0");
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

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test433"); }


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
    tp2.SinglyLinkedList singlyLinkedList58 = new tp2.SinglyLinkedList();
    tp2.IP iP63 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i64 = iP63.getThird();
    boolean b65 = singlyLinkedList58.remove(iP63);
    tp2.IPBan iPBan67 = new tp2.IPBan(iP63, (java.lang.Long)10L);
    java.lang.Long long68 = iPBan67.getExpires();
    iPBan67.setExpires((java.lang.Long)(-1L));
    java.lang.Long long71 = iPBan67.getExpires();
    java.lang.Long long72 = iPBan67.getExpires();
    boolean b73 = strictlySortedSinglyLinkedList0.contains(iPBan67);
    int i74 = strictlySortedSinglyLinkedList0.getSize();
    boolean b75 = strictlySortedSinglyLinkedList0.isEmpty();
    tp2.Server server76 = new tp2.Server();
    boolean b77 = server76.notSharedElements();
    tp2.SinglyLinkedList singlyLinkedList78 = new tp2.SinglyLinkedList();
    tp2.IP iP83 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i84 = iP83.getThird();
    boolean b85 = singlyLinkedList78.remove(iP83);
    boolean b86 = server76.addException(iP83);
    java.lang.Integer i87 = iP83.getFirst();
    tp2.IPBan iPBan89 = new tp2.IPBan(iP83, (java.lang.Long)5L);
    tp2.IP iP90 = iPBan89.getIp();
    boolean b91 = strictlySortedSinglyLinkedList0.add(iPBan89);
    iPBan89.setExpires((java.lang.Long)67108864L);
    
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
    org.junit.Assert.assertTrue("'" + i64 + "' != '" + (-1)+ "'", i64.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b65 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long68 + "' != '" + 10L+ "'", long68.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long71 + "' != '" + (-1L)+ "'", long71.equals((-1L)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long72 + "' != '" + (-1L)+ "'", long72.equals((-1L)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b73 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i74 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b75 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b77 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i84 + "' != '" + (-1)+ "'", i84.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b85 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b86 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i87 + "' != '" + (-1)+ "'", i87.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP90);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b91 == true);

  }

  @Test
  public void test434() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test434"); }


    java.lang.String str2 = java.lang.Integer.toUnsignedString((-1610612688), (-2147483648));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "2684354608"+ "'", str2.equals("2684354608"));

  }

  @Test
  public void test435() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test435"); }


    int i2 = java.lang.Integer.rotateRight(167772260, (-872415232));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 167772260);

  }

  @Test
  public void test436() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test436"); }


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
    tp2.SinglyLinkedList singlyLinkedList19 = new tp2.SinglyLinkedList();
    tp2.IP iP24 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i25 = iP24.getFourth();
    singlyLinkedList19.add(iP24);
    java.lang.Integer i27 = iP24.getFirst();
    boolean b28 = server8.removeBan(iP24);
    tp2.ITime iTime29 = null;
    server8.setTime(iTime29);
    boolean b31 = server8.bansSorted();
    boolean b32 = server8.bansNotRepeatedExpirationOrIP();
    tp2.SinglyLinkedList singlyLinkedList33 = new tp2.SinglyLinkedList();
    tp2.IP iP38 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i39 = iP38.getThird();
    boolean b40 = singlyLinkedList33.remove(iP38);
    tp2.IPBan iPBan42 = new tp2.IPBan(iP38, (java.lang.Long)10L);
    java.lang.Long long43 = iPBan42.getExpires();
    java.lang.Long long44 = iPBan42.getExpires();
    tp2.SinglyLinkedList singlyLinkedList45 = new tp2.SinglyLinkedList();
    tp2.IP iP50 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i51 = iP50.getThird();
    boolean b52 = singlyLinkedList45.remove(iP50);
    tp2.IPBan iPBan54 = new tp2.IPBan(iP50, (java.lang.Long)10L);
    tp2.IP iP59 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i60 = iP59.getFourth();
    iPBan54.setIp(iP59);
    iPBan42.setIp(iP59);
    boolean b63 = server8.addException(iP59);
    tp2.IP iP68 = new tp2.IP((java.lang.Integer)150994944, (java.lang.Integer)784, (java.lang.Integer)784, (java.lang.Integer)2);
    java.lang.Integer i69 = iP68.getFourth();
    boolean b70 = server8.addException(iP68);
    boolean b71 = strictlySortedSinglyLinkedList0.removeFromIP(iP68);
    tp2.IPBan iPBan73 = strictlySortedSinglyLinkedList0.get(51);
    
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
    org.junit.Assert.assertTrue("'" + i25 + "' != '" + 100+ "'", i25.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i27 + "' != '" + (-1)+ "'", i27.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i39 + "' != '" + (-1)+ "'", i39.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long43 + "' != '" + 10L+ "'", long43.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long44 + "' != '" + 10L+ "'", long44.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i51 + "' != '" + (-1)+ "'", i51.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b52 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i60 + "' != '" + 100+ "'", i60.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b63 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i69 + "' != '" + 2+ "'", i69.equals(2));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b70 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b71 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iPBan73);

  }

  @Test
  public void test437() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test437"); }


    int i1 = java.lang.Integer.signum(70);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 1);

  }

  @Test
  public void test438() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test438"); }


    tp2.SinglyLinkedList singlyLinkedList0 = new tp2.SinglyLinkedList();
    tp2.IP iP1 = null;
    boolean b2 = singlyLinkedList0.remove(iP1);
    boolean b3 = singlyLinkedList0.isEmpty();
    tp2.IP iP8 = new tp2.IP((java.lang.Integer)5, (java.lang.Integer)1, (java.lang.Integer)0, (java.lang.Integer)12);
    boolean b9 = singlyLinkedList0.contains(iP8);
    tp2.SinglyLinkedList singlyLinkedList10 = new tp2.SinglyLinkedList();
    tp2.IP iP11 = null;
    boolean b12 = singlyLinkedList10.remove(iP11);
    boolean b13 = singlyLinkedList10.isEmpty();
    tp2.IP iP18 = new tp2.IP((java.lang.Integer)5, (java.lang.Integer)1, (java.lang.Integer)0, (java.lang.Integer)12);
    boolean b19 = singlyLinkedList10.contains(iP18);
    boolean b20 = singlyLinkedList0.contains(iP18);
    tp2.IP iP25 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i26 = iP25.getSecond();
    boolean b27 = singlyLinkedList0.contains(iP25);
    tp2.IP iP32 = new tp2.IP((java.lang.Integer)11100, (java.lang.Integer)40, (java.lang.Integer)28, (java.lang.Integer)727449600);
    java.lang.Integer i33 = iP32.getFourth();
    boolean b34 = singlyLinkedList0.contains(iP32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i26 + "' != '" + (-1)+ "'", i26.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i33 + "' != '" + 727449600+ "'", i33.equals(727449600));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);

  }

  @Test
  public void test439() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test439"); }


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
    boolean b15 = server0.bansOkTime();
    
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
  public void test440() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test440"); }


    tp2.IP iP4 = new tp2.IP((java.lang.Integer)50331648, (java.lang.Integer)1476395008, (java.lang.Integer)(-2147479552), (java.lang.Integer)896);

  }

  @Test
  public void test441() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test441"); }


    tp2.Server server0 = new tp2.Server();
    boolean b1 = server0.exceptionsNotRepeated();
    boolean b2 = server0.bansSorted();
    boolean b3 = server0.notSharedElements();
    boolean b4 = server0.bansSorted();
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
    tp2.IPBan iPBan24 = strictlySortedSinglyLinkedList5.get(167772160);
    int i25 = strictlySortedSinglyLinkedList5.getSize();
    boolean b26 = strictlySortedSinglyLinkedList5.isEmpty();
    tp2.SinglyLinkedList singlyLinkedList27 = new tp2.SinglyLinkedList();
    tp2.IP iP32 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i33 = iP32.getThird();
    boolean b34 = singlyLinkedList27.remove(iP32);
    iP32.setSecond((java.lang.Integer)44);
    boolean b37 = strictlySortedSinglyLinkedList5.removeFromIP(iP32);
    boolean b38 = server0.connect(iP32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
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
    org.junit.Assert.assertTrue(i25 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i33 + "' != '" + (-1)+ "'", i33.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == true);

  }

  @Test
  public void test442() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test442"); }


    int i2 = java.lang.Integer.divideUnsigned(134217728, 167772178);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);

  }

  @Test
  public void test443() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test443"); }


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
    int i59 = strictlySortedSinglyLinkedList0.getSize();
    tp2.IPBan iPBan61 = strictlySortedSinglyLinkedList0.get(5);
    tp2.IP iP66 = new tp2.IP((java.lang.Integer)671088644, (java.lang.Integer)512, (java.lang.Integer)1610612786, (java.lang.Integer)256);
    boolean b67 = strictlySortedSinglyLinkedList0.containsIP(iP66);
    
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
    org.junit.Assert.assertTrue(i59 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iPBan61);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b67 == false);

  }

  @Test
  public void test444() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test444"); }


    tp2.IP iP4 = new tp2.IP((java.lang.Integer)134217599, (java.lang.Integer)88770, (java.lang.Integer)3, (java.lang.Integer)729888);
    tp2.IPBan iPBan6 = new tp2.IPBan(iP4, (java.lang.Long)5L);

  }

  @Test
  public void test445() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test445"); }


    java.lang.Integer i2 = java.lang.Integer.getInteger("1100000000000000000000100000", (java.lang.Integer)637534312);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i2 + "' != '" + 637534312+ "'", i2.equals(637534312));

  }

  @Test
  public void test446() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test446"); }


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
    tp2.IP iP42 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i43 = iP42.getFirst();
    java.lang.Integer i44 = iP42.getSecond();
    iP42.setFirst((java.lang.Integer)201326592);
    tp2.IPBan iPBan48 = new tp2.IPBan(iP42, (java.lang.Long)727449600L);
    iPBan48.setExpires((java.lang.Long)16L);
    boolean b51 = strictlySortedSinglyLinkedList0.contains(iPBan48);
    tp2.IP iP56 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i57 = iP56.getFirst();
    java.lang.Integer i58 = iP56.getSecond();
    iP56.setFirst((java.lang.Integer)201326592);
    tp2.IPBan iPBan62 = new tp2.IPBan(iP56, (java.lang.Long)727449600L);
    iPBan62.setExpires((java.lang.Long)16L);
    iPBan62.setExpires((java.lang.Long)1L);
    boolean b67 = strictlySortedSinglyLinkedList0.add(iPBan62);
    
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
    org.junit.Assert.assertTrue("'" + i43 + "' != '" + (-1)+ "'", i43.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i44 + "' != '" + (-1)+ "'", i44.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b51 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i57 + "' != '" + (-1)+ "'", i57.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i58 + "' != '" + (-1)+ "'", i58.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b67 == true);

  }

  @Test
  public void test447() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test447"); }


    int i2 = java.lang.Integer.sum(13, 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 113);

  }

  @Test
  public void test448() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test448"); }


    tp2.Server server0 = new tp2.Server();
    boolean b1 = server0.exceptionsNotRepeated();
    tp2.ITime iTime2 = null;
    server0.setTime(iTime2);
    boolean b4 = server0.bansNotRepeatedExpirationOrIP();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);

  }

  @Test
  public void test449() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test449"); }


    tp2.Server server0 = new tp2.Server();
    boolean b1 = server0.notSharedElements();
    boolean b2 = server0.exceptionsNotRepeated();
    tp2.ITime iTime3 = null;
    server0.setTime(iTime3);
    tp2.ITime iTime5 = null;
    server0.setTime(iTime5);
    tp2.Server server7 = new tp2.Server();
    boolean b8 = server7.notSharedElements();
    tp2.SinglyLinkedList singlyLinkedList9 = new tp2.SinglyLinkedList();
    tp2.IP iP14 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i15 = iP14.getThird();
    boolean b16 = singlyLinkedList9.remove(iP14);
    boolean b17 = server7.addException(iP14);
    tp2.SinglyLinkedList singlyLinkedList18 = new tp2.SinglyLinkedList();
    tp2.IP iP23 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i24 = iP23.getFourth();
    singlyLinkedList18.add(iP23);
    java.lang.Integer i26 = iP23.getFirst();
    boolean b27 = server7.removeBan(iP23);
    tp2.Server server28 = new tp2.Server();
    tp2.IP iP33 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    boolean b34 = server28.removeBan(iP33);
    tp2.IP iP39 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i40 = iP39.getThird();
    iP39.setFourth((java.lang.Integer)0);
    iP39.setSecond((java.lang.Integer)3);
    iP39.setFourth((java.lang.Integer)12);
    boolean b47 = server28.addBan(iP39);
    boolean b48 = server7.removeException(iP39);
    tp2.ITime iTime49 = null;
    server7.setTime(iTime49);
    tp2.SinglyLinkedList singlyLinkedList51 = new tp2.SinglyLinkedList();
    tp2.IP iP56 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i57 = iP56.getThird();
    boolean b58 = singlyLinkedList51.remove(iP56);
    java.lang.Integer i59 = iP56.getThird();
    java.lang.Integer i60 = iP56.getSecond();
    boolean b61 = server7.addException(iP56);
    tp2.SinglyLinkedList singlyLinkedList62 = new tp2.SinglyLinkedList();
    tp2.IP iP67 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i68 = iP67.getThird();
    boolean b69 = singlyLinkedList62.remove(iP67);
    tp2.IPBan iPBan71 = new tp2.IPBan(iP67, (java.lang.Long)10L);
    iPBan71.setExpires((java.lang.Long)4L);
    tp2.Server server74 = new tp2.Server();
    boolean b75 = server74.notSharedElements();
    tp2.SinglyLinkedList singlyLinkedList76 = new tp2.SinglyLinkedList();
    tp2.IP iP81 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i82 = iP81.getThird();
    boolean b83 = singlyLinkedList76.remove(iP81);
    boolean b84 = server74.addException(iP81);
    tp2.SinglyLinkedList singlyLinkedList85 = new tp2.SinglyLinkedList();
    tp2.IP iP90 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i91 = iP90.getFourth();
    singlyLinkedList85.add(iP90);
    java.lang.Integer i93 = iP90.getFirst();
    boolean b94 = server74.removeBan(iP90);
    iPBan71.setIp(iP90);
    iP90.setThird((java.lang.Integer)146800640);
    boolean b98 = server7.addBan(iP90);
    boolean b99 = server0.removeException(iP90);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i15 + "' != '" + (-1)+ "'", i15.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i24 + "' != '" + 100+ "'", i24.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i26 + "' != '" + (-1)+ "'", i26.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i40 + "' != '" + (-1)+ "'", i40.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b47 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b48 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i57 + "' != '" + (-1)+ "'", i57.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b58 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i59 + "' != '" + (-1)+ "'", i59.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i60 + "' != '" + (-1)+ "'", i60.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b61 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i68 + "' != '" + (-1)+ "'", i68.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b69 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b75 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i82 + "' != '" + (-1)+ "'", i82.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b83 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b84 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i91 + "' != '" + 100+ "'", i91.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i93 + "' != '" + (-1)+ "'", i93.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b94 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b98 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b99 == false);

  }

  @Test
  public void test450() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test450"); }


    tp2.Server server0 = new tp2.Server();
    boolean b1 = server0.exceptionsNotRepeated();
    tp2.IP iP6 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i7 = iP6.getThird();
    iP6.setSecond((java.lang.Integer)10);
    boolean b10 = server0.removeBan(iP6);
    boolean b11 = server0.exceptionsNotRepeated();
    tp2.IP iP12 = null;
    boolean b13 = server0.addBan(iP12);
    tp2.SinglyLinkedList singlyLinkedList14 = new tp2.SinglyLinkedList();
    tp2.IP iP19 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i20 = iP19.getThird();
    boolean b21 = singlyLinkedList14.remove(iP19);
    tp2.IPBan iPBan23 = new tp2.IPBan(iP19, (java.lang.Long)10L);
    java.lang.Long long24 = iPBan23.getExpires();
    java.lang.Long long25 = iPBan23.getExpires();
    tp2.SinglyLinkedList singlyLinkedList26 = new tp2.SinglyLinkedList();
    tp2.IP iP31 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i32 = iP31.getThird();
    boolean b33 = singlyLinkedList26.remove(iP31);
    tp2.IPBan iPBan35 = new tp2.IPBan(iP31, (java.lang.Long)10L);
    tp2.IP iP40 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i41 = iP40.getFourth();
    iPBan35.setIp(iP40);
    iPBan23.setIp(iP40);
    iP40.setThird((java.lang.Integer)144);
    boolean b46 = server0.addBan(iP40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i7 + "' != '" + (-1)+ "'", i7.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i20 + "' != '" + (-1)+ "'", i20.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long24 + "' != '" + 10L+ "'", long24.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long25 + "' != '" + 10L+ "'", long25.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i32 + "' != '" + (-1)+ "'", i32.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i41 + "' != '" + 100+ "'", i41.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b46 == true);

  }

  @Test
  public void test451() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test451"); }


    java.lang.String str1 = java.lang.Integer.toUnsignedString(1546321920);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "1546321920"+ "'", str1.equals("1546321920"));

  }

  @Test
  public void test452() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test452"); }


    java.lang.Integer i1 = java.lang.Integer.valueOf(80007168);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 80007168+ "'", i1.equals(80007168));

  }

  @Test
  public void test453() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test453"); }


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
    int i21 = strictlySortedSinglyLinkedList0.getSize();
    
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
    org.junit.Assert.assertTrue(i21 == 0);

  }

  @Test
  public void test454() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test454"); }


    java.lang.Integer i1 = null;
    java.lang.Integer i2 = java.lang.Integer.getInteger("1546321920", i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i2);

  }

  @Test
  public void test455() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test455"); }


    tp2.Server server0 = new tp2.Server();
    boolean b1 = server0.bansSorted();
    tp2.IP iP6 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i7 = iP6.getFourth();
    boolean b8 = server0.removeException(iP6);
    tp2.ITime iTime9 = null;
    server0.setTime(iTime9);
    boolean b11 = server0.notSharedElements();
    server0.update();
    tp2.ITime iTime13 = null;
    server0.setTime(iTime13);
    tp2.SinglyLinkedList singlyLinkedList15 = new tp2.SinglyLinkedList();
    tp2.IP iP20 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i21 = iP20.getThird();
    boolean b22 = singlyLinkedList15.remove(iP20);
    boolean b23 = singlyLinkedList15.isEmpty();
    int i24 = singlyLinkedList15.getSize();
    tp2.IP iP29 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i30 = iP29.getThird();
    iP29.setFourth((java.lang.Integer)0);
    boolean b33 = singlyLinkedList15.contains(iP29);
    boolean b34 = singlyLinkedList15.isEmpty();
    tp2.IP iP39 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i40 = iP39.getFirst();
    java.lang.Integer i41 = iP39.getFirst();
    singlyLinkedList15.add(iP39);
    tp2.SinglyLinkedList singlyLinkedList43 = new tp2.SinglyLinkedList();
    tp2.IP iP48 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i49 = iP48.getThird();
    boolean b50 = singlyLinkedList43.remove(iP48);
    tp2.Server server51 = new tp2.Server();
    tp2.IP iP56 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    boolean b57 = server51.removeBan(iP56);
    boolean b58 = singlyLinkedList43.contains(iP56);
    singlyLinkedList15.add(iP56);
    tp2.SinglyLinkedList singlyLinkedList60 = new tp2.SinglyLinkedList();
    tp2.IP iP65 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i66 = iP65.getThird();
    boolean b67 = singlyLinkedList60.remove(iP65);
    tp2.IPBan iPBan69 = new tp2.IPBan(iP65, (java.lang.Long)10L);
    java.lang.Long long70 = iPBan69.getExpires();
    java.lang.Long long71 = iPBan69.getExpires();
    tp2.SinglyLinkedList singlyLinkedList72 = new tp2.SinglyLinkedList();
    tp2.IP iP77 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i78 = iP77.getThird();
    boolean b79 = singlyLinkedList72.remove(iP77);
    tp2.IPBan iPBan81 = new tp2.IPBan(iP77, (java.lang.Long)10L);
    tp2.IP iP86 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i87 = iP86.getFourth();
    iPBan81.setIp(iP86);
    iPBan69.setIp(iP86);
    singlyLinkedList15.add(iP86);
    iP86.setThird((java.lang.Integer)1546321920);
    boolean b93 = server0.addBan(iP86);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i7 + "' != '" + 100+ "'", i7.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i21 + "' != '" + (-1)+ "'", i21.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i30 + "' != '" + (-1)+ "'", i30.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i40 + "' != '" + (-1)+ "'", i40.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i41 + "' != '" + (-1)+ "'", i41.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i49 + "' != '" + (-1)+ "'", i49.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b50 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b57 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b58 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i66 + "' != '" + (-1)+ "'", i66.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b67 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long70 + "' != '" + 10L+ "'", long70.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long71 + "' != '" + 10L+ "'", long71.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i78 + "' != '" + (-1)+ "'", i78.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b79 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i87 + "' != '" + 100+ "'", i87.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b93 == true);

  }

  @Test
  public void test456() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test456"); }


    int i2 = java.lang.Integer.compareUnsigned((-2147483648), 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);

  }

  @Test
  public void test457() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test457"); }


    tp2.Server server0 = new tp2.Server();
    tp2.IP iP5 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    boolean b6 = server0.removeBan(iP5);
    boolean b7 = server0.bansNotRepeatedExpirationOrIP();
    boolean b8 = server0.exceptionsNotRepeated();
    server0.update();
    server0.update();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);

  }

  @Test
  public void test458() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test458"); }


    tp2.Server server0 = new tp2.Server();
    boolean b1 = server0.exceptionsNotRepeated();
    boolean b2 = server0.bansSorted();
    server0.update();
    tp2.SinglyLinkedList singlyLinkedList4 = new tp2.SinglyLinkedList();
    tp2.IP iP9 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i10 = iP9.getThird();
    boolean b11 = singlyLinkedList4.remove(iP9);
    tp2.IPBan iPBan13 = new tp2.IPBan(iP9, (java.lang.Long)10L);
    tp2.IP iP18 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i19 = iP18.getFourth();
    iPBan13.setIp(iP18);
    java.lang.Long long21 = iPBan13.getExpires();
    java.lang.Long long22 = iPBan13.getExpires();
    tp2.IP iP27 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i28 = iP27.getFirst();
    java.lang.Integer i29 = iP27.getSecond();
    iP27.setFirst((java.lang.Integer)201326592);
    iPBan13.setIp(iP27);
    tp2.SinglyLinkedList singlyLinkedList33 = new tp2.SinglyLinkedList();
    tp2.Server server34 = new tp2.Server();
    boolean b35 = server34.exceptionsNotRepeated();
    tp2.IP iP40 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i41 = iP40.getThird();
    iP40.setSecond((java.lang.Integer)10);
    boolean b44 = server34.removeBan(iP40);
    boolean b45 = singlyLinkedList33.remove(iP40);
    tp2.SinglyLinkedList singlyLinkedList46 = new tp2.SinglyLinkedList();
    tp2.IP iP51 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i52 = iP51.getThird();
    boolean b53 = singlyLinkedList46.remove(iP51);
    tp2.Server server54 = new tp2.Server();
    tp2.IP iP59 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    boolean b60 = server54.removeBan(iP59);
    boolean b61 = singlyLinkedList46.contains(iP59);
    singlyLinkedList33.add(iP59);
    iPBan13.setIp(iP59);
    iP59.setSecond((java.lang.Integer)11100);
    java.lang.Integer i66 = iP59.getFourth();
    boolean b67 = server0.connect(iP59);
    iP59.setFourth((java.lang.Integer)786432);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i10 + "' != '" + (-1)+ "'", i10.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i19 + "' != '" + 100+ "'", i19.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long21 + "' != '" + 10L+ "'", long21.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long22 + "' != '" + 10L+ "'", long22.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i28 + "' != '" + (-1)+ "'", i28.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i29 + "' != '" + (-1)+ "'", i29.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i41 + "' != '" + (-1)+ "'", i41.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i52 + "' != '" + (-1)+ "'", i52.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b53 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b60 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b61 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i66 + "' != '" + 100+ "'", i66.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b67 == true);

  }

  @Test
  public void test459() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test459"); }


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
    tp2.IP iP44 = null;
    boolean b45 = strictlySortedSinglyLinkedList0.removeFromIP(iP44);
    boolean b46 = strictlySortedSinglyLinkedList0.isEmpty();
    int i47 = strictlySortedSinglyLinkedList0.getSize();
    boolean b48 = strictlySortedSinglyLinkedList0.isEmpty();
    
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
    org.junit.Assert.assertTrue(b45 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b46 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i47 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b48 == true);

  }

  @Test
  public void test460() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test460"); }


    tp2.SinglyLinkedList singlyLinkedList0 = new tp2.SinglyLinkedList();
    tp2.IP iP5 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i6 = iP5.getThird();
    boolean b7 = singlyLinkedList0.remove(iP5);
    tp2.IP iP12 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i13 = iP12.getFirst();
    boolean b14 = singlyLinkedList0.remove(iP12);
    iP12.setFirst((java.lang.Integer)(-2147483648));
    iP12.setSecond((java.lang.Integer)3);
    iP12.setThird((java.lang.Integer)1100100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i6 + "' != '" + (-1)+ "'", i6.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i13 + "' != '" + (-1)+ "'", i13.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);

  }

  @Test
  public void test461() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test461"); }


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
    tp2.SinglyLinkedList singlyLinkedList35 = new tp2.SinglyLinkedList();
    tp2.IP iP40 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i41 = iP40.getThird();
    boolean b42 = singlyLinkedList35.remove(iP40);
    java.lang.Integer i43 = iP40.getThird();
    iP40.setFirst((java.lang.Integer)11100);
    boolean b46 = server0.addBan(iP40);
    java.lang.Integer i47 = iP40.getFirst();
    
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
    org.junit.Assert.assertTrue("'" + i41 + "' != '" + (-1)+ "'", i41.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i43 + "' != '" + (-1)+ "'", i43.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b46 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i47 + "' != '" + 11100+ "'", i47.equals(11100));

  }

  @Test
  public void test462() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test462"); }


    java.lang.String str2 = java.lang.Integer.toUnsignedString(2147483647, 637534208);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "2147483647"+ "'", str2.equals("2147483647"));

  }

  @Test
  public void test463() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test463"); }


    // The following exception was thrown during execution in test generation
    try {
      java.lang.Integer i1 = new java.lang.Integer("39afffd8");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test464() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test464"); }


    tp2.Server server0 = new tp2.Server();
    tp2.IP iP5 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    boolean b6 = server0.removeBan(iP5);
    boolean b7 = server0.bansSorted();
    boolean b8 = server0.notSharedElements();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);

  }

  @Test
  public void test465() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test465"); }


    java.lang.Integer i1 = java.lang.Integer.valueOf((-2147481978));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + (-2147481978)+ "'", i1.equals((-2147481978)));

  }

  @Test
  public void test466() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test466"); }


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
    int i43 = singlyLinkedList0.getSize();
    int i44 = singlyLinkedList0.getSize();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i43 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i44 == 1);

  }

  @Test
  public void test467() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test467"); }


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
    tp2.IPBan iPBan32 = new tp2.IPBan(iP28, (java.lang.Long)10L);
    tp2.IP iP33 = iPBan32.getIp();
    java.lang.Integer i34 = iP33.getFirst();
    
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
    org.junit.Assert.assertNotNull(iP33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i34 + "' != '" + (-1)+ "'", i34.equals((-1)));

  }

  @Test
  public void test468() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test468"); }


    // The following exception was thrown during execution in test generation
    try {
      int i2 = java.lang.Integer.parseInt("637534208", 4096);
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test469() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test469"); }


    tp2.Server server0 = new tp2.Server();
    tp2.IP iP5 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    boolean b6 = server0.removeBan(iP5);
    boolean b7 = server0.bansSorted();
    boolean b8 = server0.exceptionsNotRepeated();
    tp2.SinglyLinkedList singlyLinkedList9 = new tp2.SinglyLinkedList();
    tp2.IP iP10 = null;
    boolean b11 = singlyLinkedList9.remove(iP10);
    boolean b12 = singlyLinkedList9.isEmpty();
    tp2.IP iP17 = new tp2.IP((java.lang.Integer)5, (java.lang.Integer)1, (java.lang.Integer)0, (java.lang.Integer)12);
    boolean b18 = singlyLinkedList9.contains(iP17);
    tp2.SinglyLinkedList singlyLinkedList19 = new tp2.SinglyLinkedList();
    tp2.IP iP24 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i25 = iP24.getThird();
    boolean b26 = singlyLinkedList19.remove(iP24);
    iP24.setSecond((java.lang.Integer)150994944);
    java.lang.Integer i29 = iP24.getFourth();
    java.lang.Integer i30 = iP24.getThird();
    java.lang.Integer i31 = iP24.getFirst();
    boolean b32 = singlyLinkedList9.contains(iP24);
    tp2.SinglyLinkedList singlyLinkedList33 = new tp2.SinglyLinkedList();
    tp2.IP iP38 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i39 = iP38.getFourth();
    singlyLinkedList33.add(iP38);
    java.lang.Integer i41 = iP38.getFirst();
    boolean b42 = singlyLinkedList9.remove(iP38);
    boolean b43 = server0.removeException(iP38);
    boolean b44 = server0.notSharedElements();
    server0.update();
    tp2.IP iP46 = null;
    boolean b47 = server0.removeBan(iP46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i25 + "' != '" + (-1)+ "'", i25.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i29 + "' != '" + 100+ "'", i29.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i30 + "' != '" + (-1)+ "'", i30.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i31 + "' != '" + (-1)+ "'", i31.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i39 + "' != '" + 100+ "'", i39.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i41 + "' != '" + (-1)+ "'", i41.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b43 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b47 == false);

  }

  @Test
  public void test470() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test470"); }


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
    tp2.IP iP36 = new tp2.IP((java.lang.Integer)11100, (java.lang.Integer)40, (java.lang.Integer)28, (java.lang.Integer)727449600);
    java.lang.Integer i37 = iP36.getFourth();
    tp2.IPBan iPBan39 = new tp2.IPBan(iP36, (java.lang.Long)784L);
    tp2.IP iP44 = new tp2.IP((java.lang.Integer)150994944, (java.lang.Integer)784, (java.lang.Integer)784, (java.lang.Integer)2);
    java.lang.Integer i45 = iP44.getFourth();
    iP44.setSecond((java.lang.Integer)805306368);
    boolean b48 = iP36.equals((java.lang.Object)iP44);
    iPBan9.setIp(iP44);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i37 + "' != '" + 727449600+ "'", i37.equals(727449600));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i45 + "' != '" + 2+ "'", i45.equals(2));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b48 == false);

  }

  @Test
  public void test471() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test471"); }


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
    iP65.setSecond((java.lang.Integer)(-2));
    iP65.setFourth((java.lang.Integer)268451840);
    
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

  }

  @Test
  public void test472() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test472"); }


    java.lang.Integer i1 = java.lang.Integer.valueOf(637534288);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 637534288+ "'", i1.equals(637534288));

  }

  @Test
  public void test473() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test473"); }


    int i1 = java.lang.Integer.bitCount(436207616);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 3);

  }

  @Test
  public void test474() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test474"); }


    int i2 = java.lang.Integer.rotateLeft(24, 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 24);

  }

  @Test
  public void test475() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test475"); }


    java.lang.String str1 = java.lang.Integer.toHexString((-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "ffffffff"+ "'", str1.equals("ffffffff"));

  }

  @Test
  public void test476() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test476"); }


    java.lang.Integer i1 = java.lang.Integer.valueOf("536870912");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 536870912+ "'", i1.equals(536870912));

  }

  @Test
  public void test477() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test477"); }


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
    boolean b23 = server0.exceptionsNotRepeated();
    boolean b24 = server0.bansOkTime();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == true);

  }

  @Test
  public void test478() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test478"); }


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
    tp2.IP iP36 = iPBan30.getIp();
    tp2.IPBan iPBan38 = new tp2.IPBan(iP36, (java.lang.Long)67108864L);
    
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
    org.junit.Assert.assertNotNull(iP36);

  }

  @Test
  public void test479() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test479"); }


    tp2.SinglyLinkedList singlyLinkedList0 = new tp2.SinglyLinkedList();
    tp2.IP iP5 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i6 = iP5.getThird();
    boolean b7 = singlyLinkedList0.remove(iP5);
    tp2.IPBan iPBan9 = new tp2.IPBan(iP5, (java.lang.Long)10L);
    java.lang.Long long10 = iPBan9.getExpires();
    java.lang.Long long11 = iPBan9.getExpires();
    tp2.IP iP12 = iPBan9.getIp();
    tp2.IP iP13 = iPBan9.getIp();
    java.lang.Integer i14 = iP13.getSecond();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i6 + "' != '" + (-1)+ "'", i6.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long10 + "' != '" + 10L+ "'", long10.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long11 + "' != '" + 10L+ "'", long11.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i14 + "' != '" + (-1)+ "'", i14.equals((-1)));

  }

  @Test
  public void test480() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test480"); }


    int i2 = java.lang.Integer.rotateRight(729888, 268451840);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 729888);

  }

  @Test
  public void test481() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test481"); }


    int i2 = java.lang.Integer.remainderUnsigned(524288, (-2147483648));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 524288);

  }

  @Test
  public void test482() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test482"); }


    tp2.Server server0 = new tp2.Server();
    tp2.IP iP5 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    boolean b6 = server0.removeBan(iP5);
    boolean b7 = server0.bansNotRepeatedExpirationOrIP();
    boolean b8 = server0.bansSorted();
    tp2.Server server9 = new tp2.Server();
    boolean b10 = server9.exceptionsNotRepeated();
    boolean b11 = server9.bansSorted();
    boolean b12 = server9.exceptionsNotRepeated();
    tp2.Server server13 = new tp2.Server();
    boolean b14 = server13.notSharedElements();
    tp2.SinglyLinkedList singlyLinkedList15 = new tp2.SinglyLinkedList();
    tp2.IP iP20 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i21 = iP20.getThird();
    boolean b22 = singlyLinkedList15.remove(iP20);
    boolean b23 = server13.addException(iP20);
    java.lang.Integer i24 = iP20.getFourth();
    java.lang.Integer i25 = iP20.getFirst();
    boolean b26 = server9.connect(iP20);
    boolean b27 = server0.removeBan(iP20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
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
    org.junit.Assert.assertTrue("'" + i24 + "' != '" + 100+ "'", i24.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i25 + "' != '" + (-1)+ "'", i25.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);

  }

  @Test
  public void test483() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test483"); }


    int i2 = java.lang.Integer.sum(33554432, 167772260);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 201326692);

  }

  @Test
  public void test484() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test484"); }


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
    boolean b15 = server0.notSharedElements();
    tp2.Server server16 = new tp2.Server();
    boolean b17 = server16.exceptionsNotRepeated();
    boolean b18 = server16.bansSorted();
    tp2.SinglyLinkedList singlyLinkedList19 = new tp2.SinglyLinkedList();
    tp2.IP iP24 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i25 = iP24.getThird();
    boolean b26 = singlyLinkedList19.remove(iP24);
    iP24.setSecond((java.lang.Integer)150994944);
    java.lang.Integer i29 = iP24.getFourth();
    java.lang.Integer i30 = iP24.getThird();
    java.lang.Integer i31 = iP24.getFirst();
    boolean b32 = server16.connect(iP24);
    boolean b33 = server0.connect(iP24);
    tp2.IP iP38 = new tp2.IP((java.lang.Integer)671088644, (java.lang.Integer)512, (java.lang.Integer)1610612786, (java.lang.Integer)256);
    boolean b39 = server0.connect(iP38);
    tp2.Server server40 = new tp2.Server();
    boolean b41 = server40.exceptionsNotRepeated();
    boolean b42 = server40.bansSorted();
    boolean b43 = server40.notSharedElements();
    tp2.SinglyLinkedList singlyLinkedList44 = new tp2.SinglyLinkedList();
    tp2.IP iP49 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i50 = iP49.getFourth();
    singlyLinkedList44.add(iP49);
    boolean b52 = server40.addException(iP49);
    tp2.IPBan iPBan54 = new tp2.IPBan(iP49, (java.lang.Long)727449600L);
    iP49.setSecond((java.lang.Integer)201326624);
    iP49.setFirst((java.lang.Integer)51);
    boolean b59 = server0.addException(iP49);
    boolean b60 = server0.bansOkTime();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i25 + "' != '" + (-1)+ "'", i25.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i29 + "' != '" + 100+ "'", i29.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i30 + "' != '" + (-1)+ "'", i30.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i31 + "' != '" + (-1)+ "'", i31.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b43 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i50 + "' != '" + 100+ "'", i50.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b52 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b59 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b60 == true);

  }

  @Test
  public void test485() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test485"); }


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
    tp2.IPBan iPBan22 = null;
    boolean b23 = strictlySortedSinglyLinkedList0.add(iPBan22);
    int i24 = strictlySortedSinglyLinkedList0.getSize();
    tp2.IP iP29 = new tp2.IP((java.lang.Integer)4, (java.lang.Integer)12, (java.lang.Integer)11100, (java.lang.Integer)134217728);
    java.lang.Integer i30 = iP29.getSecond();
    boolean b31 = strictlySortedSinglyLinkedList0.containsIP(iP29);
    
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
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i30 + "' != '" + 12+ "'", i30.equals(12));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == false);

  }

  @Test
  public void test486() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test486"); }


    tp2.Server server0 = new tp2.Server();
    boolean b1 = server0.exceptionsNotRepeated();
    tp2.IP iP6 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i7 = iP6.getThird();
    iP6.setSecond((java.lang.Integer)10);
    boolean b10 = server0.removeBan(iP6);
    boolean b11 = server0.exceptionsNotRepeated();
    boolean b12 = server0.bansOkTime();
    tp2.SinglyLinkedList singlyLinkedList13 = new tp2.SinglyLinkedList();
    tp2.Server server14 = new tp2.Server();
    boolean b15 = server14.exceptionsNotRepeated();
    tp2.IP iP20 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i21 = iP20.getThird();
    iP20.setSecond((java.lang.Integer)10);
    boolean b24 = server14.removeBan(iP20);
    boolean b25 = singlyLinkedList13.remove(iP20);
    tp2.SinglyLinkedList singlyLinkedList26 = new tp2.SinglyLinkedList();
    tp2.IP iP31 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i32 = iP31.getThird();
    boolean b33 = singlyLinkedList26.remove(iP31);
    tp2.Server server34 = new tp2.Server();
    tp2.IP iP39 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    boolean b40 = server34.removeBan(iP39);
    boolean b41 = singlyLinkedList26.contains(iP39);
    singlyLinkedList13.add(iP39);
    boolean b43 = server0.removeException(iP39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i7 + "' != '" + (-1)+ "'", i7.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i21 + "' != '" + (-1)+ "'", i21.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i32 + "' != '" + (-1)+ "'", i32.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b43 == false);

  }

  @Test
  public void test487() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test487"); }


    long long1 = java.lang.Integer.toUnsignedLong(2500);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == 2500L);

  }

  @Test
  public void test488() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test488"); }


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
    tp2.IPBan iPBan23 = strictlySortedSinglyLinkedList0.get(27);
    
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
    org.junit.Assert.assertNull(iPBan23);

  }

  @Test
  public void test489() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test489"); }


    tp2.Server server0 = new tp2.Server();
    tp2.IP iP5 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    boolean b6 = server0.removeBan(iP5);
    boolean b7 = server0.bansNotRepeatedExpirationOrIP();
    boolean b8 = server0.exceptionsNotRepeated();
    tp2.SinglyLinkedList singlyLinkedList9 = new tp2.SinglyLinkedList();
    tp2.IP iP14 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i15 = iP14.getThird();
    boolean b16 = singlyLinkedList9.remove(iP14);
    tp2.IP iP21 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i22 = iP21.getFirst();
    boolean b23 = singlyLinkedList9.remove(iP21);
    iP21.setSecond((java.lang.Integer)40);
    tp2.Server server26 = new tp2.Server();
    tp2.IP iP31 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    boolean b32 = server26.removeBan(iP31);
    boolean b33 = server26.bansSorted();
    tp2.Server server34 = new tp2.Server();
    boolean b35 = server34.exceptionsNotRepeated();
    tp2.IP iP40 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i41 = iP40.getThird();
    iP40.setSecond((java.lang.Integer)10);
    boolean b44 = server34.removeBan(iP40);
    java.lang.Integer i45 = iP40.getSecond();
    boolean b46 = server26.addException(iP40);
    tp2.Server server47 = new tp2.Server();
    boolean b48 = server47.exceptionsNotRepeated();
    boolean b49 = server47.bansSorted();
    boolean b50 = server47.notSharedElements();
    tp2.SinglyLinkedList singlyLinkedList51 = new tp2.SinglyLinkedList();
    tp2.IP iP56 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i57 = iP56.getFourth();
    singlyLinkedList51.add(iP56);
    boolean b59 = server47.addException(iP56);
    boolean b60 = server26.addBan(iP56);
    boolean b61 = iP21.equals((java.lang.Object)iP56);
    boolean b62 = server0.removeBan(iP56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i15 + "' != '" + (-1)+ "'", i15.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i22 + "' != '" + (-1)+ "'", i22.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i41 + "' != '" + (-1)+ "'", i41.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i45 + "' != '" + 10+ "'", i45.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b46 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b48 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b49 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b50 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i57 + "' != '" + 100+ "'", i57.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b59 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b60 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b61 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b62 == false);

  }

  @Test
  public void test490() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test490"); }


    int i2 = java.lang.Integer.divideUnsigned((-1179648000), 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 311531929);

  }

  @Test
  public void test491() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test491"); }


    tp2.SinglyLinkedList singlyLinkedList0 = new tp2.SinglyLinkedList();
    tp2.IP iP5 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i6 = iP5.getThird();
    boolean b7 = singlyLinkedList0.remove(iP5);
    tp2.IPBan iPBan9 = new tp2.IPBan(iP5, (java.lang.Long)10L);
    java.lang.Long long10 = iPBan9.getExpires();
    java.lang.Long long11 = iPBan9.getExpires();
    tp2.IP iP12 = iPBan9.getIp();
    tp2.IP iP13 = iPBan9.getIp();
    java.lang.Long long14 = null;
    iPBan9.setExpires(long14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i6 + "' != '" + (-1)+ "'", i6.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long10 + "' != '" + 10L+ "'", long10.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long11 + "' != '" + 10L+ "'", long11.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP13);

  }

  @Test
  public void test492() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test492"); }


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
    tp2.IP iP22 = null;
    boolean b23 = server0.addException(iP22);
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
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == true);

  }

  @Test
  public void test493() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test493"); }


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
    tp2.Server server23 = new tp2.Server();
    boolean b24 = server23.exceptionsNotRepeated();
    tp2.ITime iTime25 = null;
    server23.setTime(iTime25);
    tp2.SinglyLinkedList singlyLinkedList27 = new tp2.SinglyLinkedList();
    tp2.Server server28 = new tp2.Server();
    boolean b29 = server28.exceptionsNotRepeated();
    tp2.IP iP34 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i35 = iP34.getThird();
    iP34.setSecond((java.lang.Integer)10);
    boolean b38 = server28.removeBan(iP34);
    boolean b39 = singlyLinkedList27.remove(iP34);
    tp2.SinglyLinkedList singlyLinkedList40 = new tp2.SinglyLinkedList();
    tp2.IP iP45 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i46 = iP45.getThird();
    boolean b47 = singlyLinkedList40.remove(iP45);
    tp2.Server server48 = new tp2.Server();
    tp2.IP iP53 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    boolean b54 = server48.removeBan(iP53);
    boolean b55 = singlyLinkedList40.contains(iP53);
    singlyLinkedList27.add(iP53);
    boolean b57 = server23.addBan(iP53);
    boolean b58 = server0.removeException(iP53);
    boolean b59 = server0.exceptionsNotRepeated();
    
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
    org.junit.Assert.assertTrue(b24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i35 + "' != '" + (-1)+ "'", i35.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i46 + "' != '" + (-1)+ "'", i46.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b47 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b54 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b55 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b57 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b58 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b59 == true);

  }

  @Test
  public void test494() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test494"); }


    tp2.Server server0 = new tp2.Server();
    tp2.IP iP5 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    boolean b6 = server0.removeBan(iP5);
    tp2.IP iP11 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i12 = iP11.getThird();
    iP11.setFourth((java.lang.Integer)0);
    iP11.setSecond((java.lang.Integer)3);
    iP11.setFourth((java.lang.Integer)12);
    boolean b19 = server0.addBan(iP11);
    boolean b20 = server0.bansOkTime();
    boolean b21 = server0.bansNotRepeatedExpirationOrIP();
    
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
  public void test495() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test495"); }


    tp2.SinglyLinkedList singlyLinkedList0 = new tp2.SinglyLinkedList();
    tp2.IP iP5 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i6 = iP5.getThird();
    boolean b7 = singlyLinkedList0.remove(iP5);
    tp2.IP iP12 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i13 = iP12.getFourth();
    singlyLinkedList0.add(iP12);
    tp2.Server server15 = new tp2.Server();
    tp2.IP iP20 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    boolean b21 = server15.removeBan(iP20);
    tp2.IP iP26 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i27 = iP26.getThird();
    iP26.setFourth((java.lang.Integer)0);
    iP26.setSecond((java.lang.Integer)3);
    iP26.setFourth((java.lang.Integer)12);
    boolean b34 = server15.addBan(iP26);
    server15.update();
    boolean b36 = server15.bansOkTime();
    boolean b37 = server15.notSharedElements();
    tp2.SinglyLinkedList singlyLinkedList38 = new tp2.SinglyLinkedList();
    tp2.IP iP39 = null;
    boolean b40 = singlyLinkedList38.remove(iP39);
    boolean b41 = singlyLinkedList38.isEmpty();
    tp2.IP iP46 = new tp2.IP((java.lang.Integer)5, (java.lang.Integer)1, (java.lang.Integer)0, (java.lang.Integer)12);
    boolean b47 = singlyLinkedList38.contains(iP46);
    tp2.SinglyLinkedList singlyLinkedList48 = new tp2.SinglyLinkedList();
    tp2.IP iP53 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i54 = iP53.getThird();
    boolean b55 = singlyLinkedList48.remove(iP53);
    iP53.setSecond((java.lang.Integer)150994944);
    java.lang.Integer i58 = iP53.getFourth();
    java.lang.Integer i59 = iP53.getThird();
    java.lang.Integer i60 = iP53.getFirst();
    boolean b61 = singlyLinkedList38.contains(iP53);
    tp2.SinglyLinkedList singlyLinkedList62 = new tp2.SinglyLinkedList();
    tp2.IP iP67 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i68 = iP67.getThird();
    boolean b69 = singlyLinkedList62.remove(iP67);
    java.lang.Integer i70 = iP67.getThird();
    java.lang.Integer i71 = iP67.getSecond();
    boolean b72 = singlyLinkedList38.contains(iP67);
    boolean b73 = server15.addBan(iP67);
    boolean b74 = iP12.equals((java.lang.Object)server15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i6 + "' != '" + (-1)+ "'", i6.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i13 + "' != '" + 100+ "'", i13.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i27 + "' != '" + (-1)+ "'", i27.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b47 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i54 + "' != '" + (-1)+ "'", i54.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b55 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i58 + "' != '" + 100+ "'", i58.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i59 + "' != '" + (-1)+ "'", i59.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i60 + "' != '" + (-1)+ "'", i60.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b61 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i68 + "' != '" + (-1)+ "'", i68.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b69 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i70 + "' != '" + (-1)+ "'", i70.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i71 + "' != '" + (-1)+ "'", i71.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b72 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b73 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b74 == false);

  }

  @Test
  public void test496() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test496"); }


    int i2 = java.lang.Integer.min(5242880, 807927808);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 5242880);

  }

  @Test
  public void test497() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test497"); }


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
    boolean b24 = strictlySortedSinglyLinkedList0.isEmpty();
    
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
    org.junit.Assert.assertTrue(b24 == true);

  }

  @Test
  public void test498() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test498"); }


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
    tp2.IPBan iPBan22 = null;
    boolean b23 = strictlySortedSinglyLinkedList0.add(iPBan22);
    tp2.IP iP28 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i29 = iP28.getThird();
    iP28.setSecond((java.lang.Integer)10);
    boolean b32 = strictlySortedSinglyLinkedList0.removeFromIP(iP28);
    int i33 = strictlySortedSinglyLinkedList0.getSize();
    
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
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i29 + "' != '" + (-1)+ "'", i29.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 0);

  }

  @Test
  public void test499() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test499"); }


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
    tp2.Server server36 = new tp2.Server();
    boolean b37 = server36.exceptionsNotRepeated();
    boolean b38 = server36.bansNotRepeatedExpirationOrIP();
    tp2.IP iP43 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i44 = iP43.getFirst();
    java.lang.Integer i45 = iP43.getFirst();
    boolean b46 = server36.connect(iP43);
    boolean b47 = singlyLinkedList0.remove(iP43);
    tp2.Server server48 = new tp2.Server();
    tp2.ITime iTime49 = null;
    server48.setTime(iTime49);
    boolean b51 = server48.bansNotRepeatedExpirationOrIP();
    tp2.SinglyLinkedList singlyLinkedList52 = new tp2.SinglyLinkedList();
    tp2.IP iP57 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i58 = iP57.getThird();
    boolean b59 = singlyLinkedList52.remove(iP57);
    iP57.setSecond((java.lang.Integer)150994944);
    java.lang.Integer i62 = iP57.getFourth();
    java.lang.Integer i63 = iP57.getThird();
    java.lang.Integer i64 = iP57.getFirst();
    boolean b65 = server48.addException(iP57);
    tp2.IP iP70 = new tp2.IP((java.lang.Integer)51, (java.lang.Integer)5, (java.lang.Integer)31, (java.lang.Integer)2);
    boolean b71 = server48.connect(iP70);
    boolean b72 = singlyLinkedList0.remove(iP70);
    
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
    org.junit.Assert.assertTrue(b37 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i44 + "' != '" + (-1)+ "'", i44.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i45 + "' != '" + (-1)+ "'", i45.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b46 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b47 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b51 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i58 + "' != '" + (-1)+ "'", i58.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b59 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i62 + "' != '" + 100+ "'", i62.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i63 + "' != '" + (-1)+ "'", i63.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i64 + "' != '" + (-1)+ "'", i64.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b65 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b71 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b72 == false);

  }

  @Test
  public void test500() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test500"); }


    tp2.Server server0 = new tp2.Server();
    boolean b1 = server0.notSharedElements();
    boolean b2 = server0.bansOkTime();
    tp2.SinglyLinkedList singlyLinkedList3 = new tp2.SinglyLinkedList();
    tp2.IP iP8 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i9 = iP8.getThird();
    boolean b10 = singlyLinkedList3.remove(iP8);
    tp2.IP iP15 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i16 = iP15.getFirst();
    boolean b17 = singlyLinkedList3.remove(iP15);
    iP15.setFirst((java.lang.Integer)(-2147483648));
    iP15.setSecond((java.lang.Integer)3);
    boolean b22 = server0.addException(iP15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + (-1)+ "'", i9.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i16 + "' != '" + (-1)+ "'", i16.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);

  }

}
