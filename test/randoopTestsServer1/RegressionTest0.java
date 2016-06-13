package randoopTestsServer1;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

  public static boolean debug = false;

  @Test
  public void test001() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test001"); }


    java.lang.String str1 = java.lang.Integer.toBinaryString((-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "11111111111111111111111111111111"+ "'", str1.equals("11111111111111111111111111111111"));

  }

  @Test
  public void test002() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test002"); }


    // The following exception was thrown during execution in test generation
    try {
      java.lang.Integer i1 = java.lang.Integer.valueOf("11111111111111111111111111111111");
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

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test003"); }


    java.lang.String str2 = java.lang.Integer.toUnsignedString(100, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "100"+ "'", str2.equals("100"));

  }

  @Test
  public void test004() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test004"); }


    int i2 = java.lang.Integer.compare(0, 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == (-1));

  }

  @Test
  public void test005() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test005"); }


    java.lang.String str2 = java.lang.Integer.toUnsignedString((-1), 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4294967295"+ "'", str2.equals("4294967295"));

  }

  @Test
  public void test006() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test006"); }


    int i2 = java.lang.Integer.rotateRight(1, 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);

  }

  @Test
  public void test007() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test007"); }


    int i1 = java.lang.Integer.reverseBytes(10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 167772160);

  }

  @Test
  public void test008() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test008"); }


    // The following exception was thrown during execution in test generation
    try {
      korat.finitization.IFinitization iFinitization1 = tp2.Server.finServer(100);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test009() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test009"); }


    java.lang.Integer i1 = java.lang.Integer.getInteger("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);

  }

  @Test
  public void test010() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test010"); }


    java.lang.Integer i2 = java.lang.Integer.getInteger("4294967295", 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i2 + "' != '" + 0+ "'", i2.equals(0));

  }

  @Test
  public void test011() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test011"); }


    java.lang.Integer i1 = java.lang.Integer.valueOf("100");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 100+ "'", i1.equals(100));

  }

  @Test
  public void test012() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test012"); }


    long long1 = java.lang.Integer.toUnsignedLong(0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == 0L);

  }

  @Test
  public void test013() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test013"); }


    // The following exception was thrown during execution in test generation
    try {
      int i2 = java.lang.Integer.parseInt("", 0);
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test014() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test014"); }


    int i1 = java.lang.Integer.numberOfLeadingZeros(10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 28);

  }

  @Test
  public void test015() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test015"); }


    int i1 = java.lang.Integer.reverseBytes((-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == (-1));

  }

  @Test
  public void test016() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test016"); }


    java.lang.Integer i1 = null;
    // The following exception was thrown during execution in test generation
    try {
      tp2.IP iP4 = new tp2.IP((java.lang.Integer)28, i1, (java.lang.Integer)100, (java.lang.Integer)1);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test017() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test017"); }


    int i1 = java.lang.Integer.bitCount(100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 3);

  }

  @Test
  public void test018() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test018"); }


    int i2 = java.lang.Integer.min(100, 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);

  }

  @Test
  public void test019() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test019"); }


    // The following exception was thrown during execution in test generation
    try {
      int i1 = java.lang.Integer.parseInt("11111111111111111111111111111111");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test020() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test020"); }


    int i0 = java.lang.Integer.MIN_VALUE;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i0 == (-2147483648));

  }

  @Test
  public void test021() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test021"); }


    int i2 = java.lang.Integer.rotateLeft(28, 167772160);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 28);

  }

  @Test
  public void test022() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test022"); }


    long long0 = tp2.StrictlySortedSinglyLinkedList.serialVersionUID;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long0 == 1L);

  }

  @Test
  public void test023() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test023"); }


    int i1 = java.lang.Integer.signum(10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 1);

  }

  @Test
  public void test024() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test024"); }


    int i1 = java.lang.Integer.highestOneBit(167772160);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 134217728);

  }

  @Test
  public void test025() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test025"); }


    java.lang.String str1 = java.lang.Integer.toUnsignedString(1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "1"+ "'", str1.equals("1"));

  }

  @Test
  public void test026() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test026"); }


    int i1 = java.lang.Integer.parseInt("1");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 1);

  }

  @Test
  public void test027() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test027"); }


    int i2 = java.lang.Integer.divideUnsigned(100, 134217728);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);

  }

  @Test
  public void test028() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test028"); }


    int i2 = java.lang.Integer.remainderUnsigned(28, 134217728);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 28);

  }

  @Test
  public void test029() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test029"); }


    int i1 = java.lang.Integer.lowestOneBit(28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 4);

  }

  @Test
  public void test030() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test030"); }


    int i2 = java.lang.Integer.parseInt("100", 28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 784);

  }

  @Test
  public void test031() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test031"); }


    java.lang.String str2 = java.lang.Integer.toUnsignedString(4, 167772160);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4"+ "'", str2.equals("4"));

  }

  @Test
  public void test032() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test032"); }


    // The following exception was thrown during execution in test generation
    try {
      java.lang.Integer i2 = java.lang.Integer.valueOf("100", 784);
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

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test033"); }


    int i2 = java.lang.Integer.divideUnsigned(1, 28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);

  }

  @Test
  public void test034() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test034"); }


    int i2 = java.lang.Integer.remainderUnsigned((-2147483648), 4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);

  }

  @Test
  public void test035() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test035"); }


    java.lang.Integer i1 = java.lang.Integer.decode("1");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 1+ "'", i1.equals(1));

  }

  @Test
  public void test036() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test036"); }


    int i2 = java.lang.Integer.remainderUnsigned(100, 28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 16);

  }

  @Test
  public void test037() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test037"); }


    java.lang.String str1 = java.lang.Integer.toBinaryString((-2147483648));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "10000000000000000000000000000000"+ "'", str1.equals("10000000000000000000000000000000"));

  }

  @Test
  public void test038() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test038"); }


    int i1 = java.lang.Integer.signum(16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 1);

  }

  @Test
  public void test039() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test039"); }


    int i0 = java.lang.Integer.MAX_VALUE;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i0 == 2147483647);

  }

  @Test
  public void test040() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test040"); }


    int i0 = java.lang.Integer.BYTES;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i0 == 4);

  }

  @Test
  public void test041() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test041"); }


    int i1 = java.lang.Integer.signum((-2147483648));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == (-1));

  }

  @Test
  public void test042() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test042"); }


    java.lang.String str1 = java.lang.Integer.toOctalString(10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "12"+ "'", str1.equals("12"));

  }

  @Test
  public void test043() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test043"); }


    int i2 = java.lang.Integer.rotateRight(4, 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == (-2147483648));

  }

  @Test
  public void test044() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test044"); }


    int i2 = java.lang.Integer.parseUnsignedInt("100", 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 9);

  }

  @Test
  public void test045() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test045"); }


    // The following exception was thrown during execution in test generation
    try {
      int i2 = java.lang.Integer.parseInt("", 784);
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test046() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test046"); }


    long long0 = tp2.IP.serialVersionUID;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long0 == 1L);

  }

  @Test
  public void test047() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test047"); }


    // The following exception was thrown during execution in test generation
    try {
      java.lang.Integer i1 = java.lang.Integer.decode("");
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

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test048"); }


    int i1 = java.lang.Integer.lowestOneBit(4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 4);

  }

  @Test
  public void test049() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test049"); }


    java.lang.Integer i1 = java.lang.Integer.getInteger("1");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);

  }

  @Test
  public void test050() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test050"); }


    java.lang.String str1 = java.lang.Integer.toHexString(2147483647);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "7fffffff"+ "'", str1.equals("7fffffff"));

  }

  @Test
  public void test051() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test051"); }


    int i1 = java.lang.Integer.lowestOneBit(1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 1);

  }

  @Test
  public void test052() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test052"); }


    java.lang.Integer i2 = java.lang.Integer.getInteger("4294967295", 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i2 + "' != '" + 3+ "'", i2.equals(3));

  }

  @Test
  public void test053() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test053"); }


    int i1 = java.lang.Integer.parseInt("100");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 100);

  }

  @Test
  public void test054() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test054"); }


    int i2 = java.lang.Integer.compare((-1), 16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == (-1));

  }

  @Test
  public void test055() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test055"); }


    java.lang.String str1 = java.lang.Integer.toHexString(167772160);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "a000000"+ "'", str1.equals("a000000"));

  }

  @Test
  public void test056() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test056"); }


    int i2 = java.lang.Integer.compareUnsigned(100, (-2147483648));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == (-1));

  }

  @Test
  public void test057() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test057"); }


    // The following exception was thrown during execution in test generation
    try {
      java.lang.Integer i2 = java.lang.Integer.valueOf("hi!", 0);
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

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test058"); }


    long long0 = tp2.SinglyLinkedList.serialVersionUID;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long0 == 1L);

  }

  @Test
  public void test059() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test059"); }


    int i2 = java.lang.Integer.compare(28, 2147483647);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == (-1));

  }

  @Test
  public void test060() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test060"); }


    java.lang.Integer i2 = java.lang.Integer.getInteger("4294967295", (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i2 + "' != '" + (-1)+ "'", i2.equals((-1)));

  }

  @Test
  public void test061() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test061"); }


    java.lang.String str1 = java.lang.Integer.toUnsignedString(2147483647);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "2147483647"+ "'", str1.equals("2147483647"));

  }

  @Test
  public void test062() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test062"); }


    java.lang.String str1 = java.lang.Integer.toBinaryString(100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "1100100"+ "'", str1.equals("1100100"));

  }

  @Test
  public void test063() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test063"); }


    java.lang.Integer i1 = java.lang.Integer.valueOf(0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 0+ "'", i1.equals(0));

  }

  @Test
  public void test064() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test064"); }


    int i1 = java.lang.Integer.reverseBytes(9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 150994944);

  }

  @Test
  public void test065() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test065"); }


    int i2 = java.lang.Integer.compareUnsigned(9, 16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == (-1));

  }

  @Test
  public void test066() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test066"); }


    // The following exception was thrown during execution in test generation
    try {
      java.lang.Integer i2 = java.lang.Integer.valueOf("a000000", (-1));
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

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test067"); }


    // The following exception was thrown during execution in test generation
    try {
      int i2 = java.lang.Integer.parseInt("11111111111111111111111111111111", 16);
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

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test068"); }


    java.lang.Integer i1 = new java.lang.Integer(0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 0+ "'", i1.equals(0));

  }

  @Test
  public void test069() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test069"); }


    java.lang.String str1 = java.lang.Integer.toUnsignedString(28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "28"+ "'", str1.equals("28"));

  }

  @Test
  public void test070() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test070"); }


    int i1 = java.lang.Integer.reverse(3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == (-1073741824));

  }

  @Test
  public void test071() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test071"); }


    java.lang.Class clazz0 = java.lang.Integer.TYPE;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(clazz0);

  }

  @Test
  public void test072() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test072"); }


    java.lang.Integer i1 = java.lang.Integer.valueOf("2147483647");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 2147483647+ "'", i1.equals(2147483647));

  }

  @Test
  public void test073() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test073"); }


    java.lang.Integer i1 = new java.lang.Integer("100");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 100+ "'", i1.equals(100));

  }

  @Test
  public void test074() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test074"); }


    int i2 = java.lang.Integer.max(16, (-2147483648));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 16);

  }

  @Test
  public void test075() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test075"); }


    long long1 = java.lang.Integer.toUnsignedLong(4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == 4L);

  }

  @Test
  public void test076() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test076"); }


    int i1 = java.lang.Integer.reverse(1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == (-2147483648));

  }

  @Test
  public void test077() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test077"); }


    int i2 = java.lang.Integer.min(10, 16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 10);

  }

  @Test
  public void test078() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test078"); }


    // The following exception was thrown during execution in test generation
    try {
      java.lang.Integer i1 = java.lang.Integer.decode("11111111111111111111111111111111");
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

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test079"); }


    java.lang.String str1 = java.lang.Integer.toHexString(9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "9"+ "'", str1.equals("9"));

  }

  @Test
  public void test080() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test080"); }


    int i2 = java.lang.Integer.remainderUnsigned((-2147483648), 9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 2);

  }

  @Test
  public void test081() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test081"); }


    java.lang.String str1 = java.lang.Integer.toHexString(10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "a"+ "'", str1.equals("a"));

  }

  @Test
  public void test082() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test082"); }


    int i2 = java.lang.Integer.max((-2147483648), 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 3);

  }

  @Test
  public void test083() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test083"); }


    int i1 = java.lang.Integer.signum(134217728);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 1);

  }

  @Test
  public void test084() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test084"); }


    int i1 = java.lang.Integer.parseUnsignedInt("12");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 12);

  }

  @Test
  public void test085() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test085"); }


    long long0 = tp2.IPBan.serialVersionUID;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long0 == 1L);

  }

  @Test
  public void test086() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test086"); }


    java.lang.Integer i1 = java.lang.Integer.getInteger("1100100");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);

  }

  @Test
  public void test087() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test087"); }


    // The following exception was thrown during execution in test generation
    try {
      java.lang.Integer i1 = new java.lang.Integer("10000000000000000000000000000000");
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

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test088"); }


    int i2 = java.lang.Integer.sum(167772160, 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 167772260);

  }

  @Test
  public void test089() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test089"); }


    int i0 = java.lang.Integer.SIZE;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i0 == 32);

  }

  @Test
  public void test090() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test090"); }


    java.lang.Integer i2 = java.lang.Integer.getInteger("11111111111111111111111111111111", (-2147483648));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i2 + "' != '" + (-2147483648)+ "'", i2.equals((-2147483648)));

  }

  @Test
  public void test091() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test091"); }


    int i1 = java.lang.Integer.reverseBytes(28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 469762048);

  }

  @Test
  public void test092() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test092"); }


    int i1 = java.lang.Integer.bitCount(469762048);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 3);

  }

  @Test
  public void test093() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test093"); }


    // The following exception was thrown during execution in test generation
    try {
      int i1 = java.lang.Integer.parseUnsignedInt("10000000000000000000000000000000");
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

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test094"); }


    int i2 = java.lang.Integer.rotateLeft(4, 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 8);

  }

  @Test
  public void test095() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test095"); }


    java.lang.String str2 = java.lang.Integer.toUnsignedString(10, (-2147483648));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "10"+ "'", str2.equals("10"));

  }

  @Test
  public void test096() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test096"); }


    int i1 = java.lang.Integer.bitCount(167772260);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 5);

  }

  @Test
  public void test097() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test097"); }


    int i2 = java.lang.Integer.divideUnsigned(32, 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 2);

  }

  @Test
  public void test098() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test098"); }


    java.lang.String str1 = java.lang.Integer.toUnsignedString(0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "0"+ "'", str1.equals("0"));

  }

  @Test
  public void test099() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test099"); }


    int i1 = java.lang.Integer.reverseBytes(12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 201326592);

  }

  @Test
  public void test100() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test100"); }


    // The following exception was thrown during execution in test generation
    try {
      java.lang.Integer i1 = java.lang.Integer.decode("10000000000000000000000000000000");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test101() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test101"); }


    java.lang.Integer i2 = java.lang.Integer.getInteger("9", (java.lang.Integer)167772160);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i2 + "' != '" + 167772160+ "'", i2.equals(167772160));

  }

  @Test
  public void test102() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test102"); }


    int i2 = java.lang.Integer.min(32, 150994944);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 32);

  }

  @Test
  public void test103() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test103"); }


    int i2 = java.lang.Integer.sum(100, 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 100);

  }

  @Test
  public void test104() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test104"); }


    java.lang.Integer i1 = java.lang.Integer.getInteger("a000000");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);

  }

  @Test
  public void test105() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test105"); }


    int i1 = java.lang.Integer.bitCount(5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 2);

  }

  @Test
  public void test106() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test106"); }


    int i1 = java.lang.Integer.highestOneBit(28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 16);

  }

  @Test
  public void test107() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test107"); }


    korat.finitization.IFinitization iFinitization1 = tp2.Server.finServer(0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iFinitization1);

  }

  @Test
  public void test108() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test108"); }


    java.lang.Integer i1 = new java.lang.Integer(10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 10+ "'", i1.equals(10));

  }

  @Test
  public void test109() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test109"); }


    korat.finitization.IFinitization iFinitization1 = tp2.Server.finServer(9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iFinitization1);

  }

  @Test
  public void test110() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test110"); }


    java.lang.Integer i1 = java.lang.Integer.valueOf(1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 1+ "'", i1.equals(1));

  }

  @Test
  public void test111() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test111"); }


    java.lang.String str1 = java.lang.Integer.toBinaryString(28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "11100"+ "'", str1.equals("11100"));

  }

  @Test
  public void test112() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test112"); }


    // The following exception was thrown during execution in test generation
    try {
      java.lang.Integer i2 = java.lang.Integer.valueOf("11100", 0);
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

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test113"); }


    // The following exception was thrown during execution in test generation
    try {
      java.lang.Integer i1 = java.lang.Integer.valueOf("10000000000000000000000000000000");
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

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test114"); }


    int i2 = java.lang.Integer.min(784, 4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 4);

  }

  @Test
  public void test115() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test115"); }


    java.lang.String str1 = java.lang.Integer.toBinaryString(2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "10"+ "'", str1.equals("10"));

  }

  @Test
  public void test116() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test116"); }


    int i1 = java.lang.Integer.reverse(0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);

  }

  @Test
  public void test117() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test117"); }


    int i1 = java.lang.Integer.highestOneBit((-1073741824));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == (-2147483648));

  }

  @Test
  public void test118() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test118"); }


    java.lang.Integer i1 = new java.lang.Integer(134217728);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 134217728+ "'", i1.equals(134217728));

  }

  @Test
  public void test119() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test119"); }


    java.lang.Integer i2 = java.lang.Integer.getInteger("11100", 2147483647);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i2 + "' != '" + 2147483647+ "'", i2.equals(2147483647));

  }

  @Test
  public void test120() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test120"); }


    java.lang.String str2 = java.lang.Integer.toUnsignedString(0, 5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "0"+ "'", str2.equals("0"));

  }

  @Test
  public void test121() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test121"); }


    int i2 = java.lang.Integer.remainderUnsigned((-2147483648), (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == (-2147483648));

  }

  @Test
  public void test122() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test122"); }


    int i1 = java.lang.Integer.bitCount(3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 2);

  }

  @Test
  public void test123() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test123"); }


    int i1 = java.lang.Integer.highestOneBit(150994944);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 134217728);

  }

  @Test
  public void test124() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test124"); }


    java.lang.Integer i1 = java.lang.Integer.decode("11100");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 11100+ "'", i1.equals(11100));

  }

  @Test
  public void test125() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test125"); }


    int i2 = java.lang.Integer.compare(201326592, 167772260);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);

  }

  @Test
  public void test126() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test126"); }


    java.lang.Integer i1 = java.lang.Integer.getInteger("0");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);

  }

  @Test
  public void test127() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test127"); }


    java.lang.String str1 = java.lang.Integer.toBinaryString(4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "100"+ "'", str1.equals("100"));

  }

  @Test
  public void test128() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test128"); }


    int i2 = java.lang.Integer.rotateLeft(11100, 784);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 727449600);

  }

  @Test
  public void test129() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test129"); }


    int i1 = java.lang.Integer.numberOfLeadingZeros((-1073741824));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);

  }

  @Test
  public void test130() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test130"); }


    int i1 = java.lang.Integer.lowestOneBit(0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);

  }

  @Test
  public void test131() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test131"); }


    int i1 = java.lang.Integer.bitCount(150994944);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 2);

  }

  @Test
  public void test132() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test132"); }


    // The following exception was thrown during execution in test generation
    try {
      java.lang.Integer i2 = java.lang.Integer.valueOf("10000000000000000000000000000000", 9);
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

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test133"); }


    long long1 = java.lang.Integer.toUnsignedLong(5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == 5L);

  }

  @Test
  public void test134() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test134"); }


    java.lang.Integer i1 = new java.lang.Integer(3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 3+ "'", i1.equals(3));

  }

  @Test
  public void test135() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test135"); }


    java.lang.Integer i2 = java.lang.Integer.getInteger("12", 2147483647);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i2 + "' != '" + 2147483647+ "'", i2.equals(2147483647));

  }

  @Test
  public void test136() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test136"); }


    java.lang.Integer i1 = java.lang.Integer.getInteger("10");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);

  }

  @Test
  public void test137() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test137"); }


    int i2 = java.lang.Integer.parseUnsignedInt("28", 16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 40);

  }

  @Test
  public void test138() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test138"); }


    tp2.SinglyLinkedList singlyLinkedList0 = new tp2.SinglyLinkedList();
    tp2.IP iP2 = singlyLinkedList0.get(784);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(iP2);

  }

  @Test
  public void test139() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test139"); }


    java.lang.Integer i2 = java.lang.Integer.getInteger("", (java.lang.Integer)(-1073741824));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i2 + "' != '" + (-1073741824)+ "'", i2.equals((-1073741824)));

  }

  @Test
  public void test140() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test140"); }


    int i1 = java.lang.Integer.reverseBytes(2147483647);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == (-129));

  }

  @Test
  public void test141() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test141"); }


    int i1 = java.lang.Integer.numberOfTrailingZeros(0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 32);

  }

  @Test
  public void test142() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test142"); }


    // The following exception was thrown during execution in test generation
    try {
      java.lang.Integer i1 = java.lang.Integer.valueOf("");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test143() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test143"); }


    int i1 = java.lang.Integer.reverse(150994944);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 144);

  }

  @Test
  public void test144() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test144"); }


    int i1 = java.lang.Integer.signum(167772260);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 1);

  }

  @Test
  public void test145() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test145"); }


    int i1 = java.lang.Integer.numberOfLeadingZeros(167772260);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 4);

  }

  @Test
  public void test146() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test146"); }


    java.lang.Integer i1 = java.lang.Integer.valueOf((-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + (-1)+ "'", i1.equals((-1)));

  }

  @Test
  public void test147() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test147"); }


    int i1 = java.lang.Integer.numberOfTrailingZeros(32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 5);

  }

  @Test
  public void test148() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test148"); }


    java.lang.String str1 = java.lang.Integer.toOctalString(5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "5"+ "'", str1.equals("5"));

  }

  @Test
  public void test149() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test149"); }


    java.lang.String str2 = java.lang.Integer.toUnsignedString(0, 11100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "0"+ "'", str2.equals("0"));

  }

  @Test
  public void test150() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test150"); }


    java.lang.String str1 = java.lang.Integer.toBinaryString(32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "100000"+ "'", str1.equals("100000"));

  }

  @Test
  public void test151() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test151"); }


    java.lang.String str1 = java.lang.Integer.toUnsignedString(469762048);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "469762048"+ "'", str1.equals("469762048"));

  }

  @Test
  public void test152() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test152"); }


    int i1 = java.lang.Integer.reverse((-1073741824));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 3);

  }

  @Test
  public void test153() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test153"); }


    int i1 = java.lang.Integer.highestOneBit(100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 64);

  }

  @Test
  public void test154() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test154"); }


    // The following exception was thrown during execution in test generation
    try {
      int i2 = java.lang.Integer.parseInt("11100", (-2147483648));
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test155() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test155"); }


    java.lang.Integer i1 = new java.lang.Integer("2147483647");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 2147483647+ "'", i1.equals(2147483647));

  }

  @Test
  public void test156() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test156"); }


    // The following exception was thrown during execution in test generation
    try {
      int i2 = java.lang.Integer.parseUnsignedInt("1100100", 469762048);
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

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test157"); }


    long long1 = java.lang.Integer.toUnsignedLong(144);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == 144L);

  }

  @Test
  public void test158() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test158"); }


    tp2.SinglyLinkedList singlyLinkedList0 = new tp2.SinglyLinkedList();
    tp2.IP iP5 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i6 = iP5.getThird();
    boolean b7 = singlyLinkedList0.remove(iP5);
    tp2.Server server8 = new tp2.Server();
    tp2.IP iP13 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    boolean b14 = server8.removeBan(iP13);
    boolean b15 = singlyLinkedList0.contains(iP13);
    java.lang.Integer i16 = iP13.getFourth();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i6 + "' != '" + (-1)+ "'", i6.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i16 + "' != '" + 100+ "'", i16.equals(100));

  }

  @Test
  public void test159() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test159"); }


    java.lang.Integer i2 = java.lang.Integer.getInteger("12", (java.lang.Integer)32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i2 + "' != '" + 32+ "'", i2.equals(32));

  }

  @Test
  public void test160() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test160"); }


    // The following exception was thrown during execution in test generation
    try {
      java.lang.Integer i1 = java.lang.Integer.decode("4294967295");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test161() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test161"); }


    int i2 = java.lang.Integer.max(4, 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 4);

  }

  @Test
  public void test162() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test162"); }


    int i2 = java.lang.Integer.min(5, 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);

  }

  @Test
  public void test163() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test163"); }


    // The following exception was thrown during execution in test generation
    try {
      java.lang.Integer i1 = new java.lang.Integer("hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test164() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test164"); }


    tp2.Server server0 = new tp2.Server();
    boolean b1 = server0.exceptionsNotRepeated();
    boolean b2 = server0.bansNotRepeatedExpirationOrIP();
    tp2.Server server3 = new tp2.Server();
    tp2.IP iP8 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    boolean b9 = server3.removeBan(iP8);
    java.lang.Integer i10 = iP8.getFirst();
    boolean b11 = server0.addException(iP8);
    boolean b12 = server0.bansNotRepeatedExpirationOrIP();
    
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
  public void test165() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test165"); }


    java.lang.Integer i1 = new java.lang.Integer(167772260);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 167772260+ "'", i1.equals(167772260));

  }

  @Test
  public void test166() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test166"); }


    int i1 = java.lang.Integer.reverseBytes(201326592);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 12);

  }

  @Test
  public void test167() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test167"); }


    int i2 = java.lang.Integer.remainderUnsigned(12, 11100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 12);

  }

  @Test
  public void test168() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test168"); }


    int i1 = java.lang.Integer.reverseBytes(2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 33554432);

  }

  @Test
  public void test169() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test169"); }


    int i2 = java.lang.Integer.remainderUnsigned((-129), 134217728);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 134217599);

  }

  @Test
  public void test170() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test170"); }


    java.lang.Integer i1 = null;
    java.lang.Integer i2 = java.lang.Integer.getInteger("5", i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i2);

  }

  @Test
  public void test171() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test171"); }


    int i2 = java.lang.Integer.compare(0, 784);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == (-1));

  }

  @Test
  public void test172() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test172"); }


    tp2.Server server0 = new tp2.Server();
    boolean b1 = server0.exceptionsNotRepeated();
    tp2.IP iP6 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i7 = iP6.getThird();
    iP6.setSecond((java.lang.Integer)10);
    boolean b10 = server0.removeBan(iP6);
    iP6.setThird((java.lang.Integer)167772260);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i7 + "' != '" + (-1)+ "'", i7.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);

  }

  @Test
  public void test173() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test173"); }


    int i1 = java.lang.Integer.highestOneBit(2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 2);

  }

  @Test
  public void test174() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test174"); }


    // The following exception was thrown during execution in test generation
    try {
      int i2 = java.lang.Integer.parseUnsignedInt("11111111111111111111111111111111", 134217728);
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test175() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test175"); }


    int i1 = java.lang.Integer.numberOfTrailingZeros(2147483647);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);

  }

  @Test
  public void test176() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test176"); }


    java.lang.Integer i2 = java.lang.Integer.getInteger("a000000", (-2147483648));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i2 + "' != '" + (-2147483648)+ "'", i2.equals((-2147483648)));

  }

  @Test
  public void test177() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test177"); }


    int i2 = java.lang.Integer.remainderUnsigned(144, 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 16);

  }

  @Test
  public void test178() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test178"); }


    int i2 = java.lang.Integer.parseUnsignedInt("a", 16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 10);

  }

  @Test
  public void test179() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test179"); }


    int i2 = java.lang.Integer.max(167772160, 201326592);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 201326592);

  }

  @Test
  public void test180() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test180"); }


    java.lang.Integer i2 = java.lang.Integer.getInteger("4294967295", 167772160);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i2 + "' != '" + 167772160+ "'", i2.equals(167772160));

  }

  @Test
  public void test181() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test181"); }


    java.lang.Integer i1 = java.lang.Integer.valueOf(33554432);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 33554432+ "'", i1.equals(33554432));

  }

  @Test
  public void test182() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test182"); }


    int i1 = java.lang.Integer.reverseBytes(0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);

  }

  @Test
  public void test183() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test183"); }


    int i2 = java.lang.Integer.compareUnsigned(33554432, (-2147483648));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == (-1));

  }

  @Test
  public void test184() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test184"); }


    int i2 = java.lang.Integer.rotateLeft(784, 201326592);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 784);

  }

  @Test
  public void test185() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test185"); }


    java.lang.String str1 = java.lang.Integer.toUnsignedString(10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "10"+ "'", str1.equals("10"));

  }

  @Test
  public void test186() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test186"); }


    long long1 = java.lang.Integer.toUnsignedLong(727449600);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == 727449600L);

  }

  @Test
  public void test187() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test187"); }


    int i2 = java.lang.Integer.compareUnsigned(2, 201326592);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == (-1));

  }

  @Test
  public void test188() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test188"); }


    java.lang.Integer i1 = java.lang.Integer.valueOf("28");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 28+ "'", i1.equals(28));

  }

  @Test
  public void test189() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test189"); }


    int i2 = java.lang.Integer.sum(5, 201326592);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 201326597);

  }

  @Test
  public void test190() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test190"); }


    // The following exception was thrown during execution in test generation
    try {
      int i2 = java.lang.Integer.parseInt("5", 150994944);
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test191() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test191"); }


    tp2.IP iP4 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)10, (java.lang.Integer)1, (java.lang.Integer)12);

  }

  @Test
  public void test192() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test192"); }


    int i1 = java.lang.Integer.reverseBytes(4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 67108864);

  }

  @Test
  public void test193() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test193"); }


    int i2 = java.lang.Integer.min((-129), 727449600);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == (-129));

  }

  @Test
  public void test194() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test194"); }


    java.lang.String str1 = java.lang.Integer.toUnsignedString(11100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "11100"+ "'", str1.equals("11100"));

  }

  @Test
  public void test195() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test195"); }


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
    java.lang.Integer i30 = iP26.getFirst();
    
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
    org.junit.Assert.assertTrue("'" + i30 + "' != '" + (-1)+ "'", i30.equals((-1)));

  }

  @Test
  public void test196() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test196"); }


    int i1 = java.lang.Integer.bitCount(33554432);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 1);

  }

  @Test
  public void test197() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test197"); }


    java.lang.String str2 = java.lang.Integer.toUnsignedString(33554432, 167772160);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "33554432"+ "'", str2.equals("33554432"));

  }

  @Test
  public void test198() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test198"); }


    long long1 = java.lang.Integer.toUnsignedLong(784);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == 784L);

  }

  @Test
  public void test199() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test199"); }


    int i1 = java.lang.Integer.parseInt("5");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 5);

  }

  @Test
  public void test200() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test200"); }


    int i1 = java.lang.Integer.numberOfTrailingZeros(11100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 2);

  }

  @Test
  public void test201() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test201"); }


    int i1 = java.lang.Integer.parseUnsignedInt("1100100");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 1100100);

  }

  @Test
  public void test202() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test202"); }


    int i2 = java.lang.Integer.rotateRight(784, 201326592);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 784);

  }

  @Test
  public void test203() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test203"); }


    java.lang.String str1 = java.lang.Integer.toHexString(12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "c"+ "'", str1.equals("c"));

  }

  @Test
  public void test204() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test204"); }


    // The following exception was thrown during execution in test generation
    try {
      java.lang.Integer i1 = new java.lang.Integer("7fffffff");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test205() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test205"); }


    int i2 = java.lang.Integer.max(40, 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 100);

  }

  @Test
  public void test206() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test206"); }


    int i1 = java.lang.Integer.signum(0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);

  }

  @Test
  public void test207() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test207"); }


    int i2 = java.lang.Integer.sum((-1073741824), 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == (-1073741812));

  }

  @Test
  public void test208() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test208"); }


    int i2 = java.lang.Integer.min(16, 11100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 16);

  }

  @Test
  public void test209() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test209"); }


    int i1 = java.lang.Integer.lowestOneBit(8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 8);

  }

  @Test
  public void test210() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test210"); }


    java.lang.String str1 = java.lang.Integer.toBinaryString(167772160);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "1010000000000000000000000000"+ "'", str1.equals("1010000000000000000000000000"));

  }

  @Test
  public void test211() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test211"); }


    java.lang.Integer i1 = java.lang.Integer.valueOf(727449600);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 727449600+ "'", i1.equals(727449600));

  }

  @Test
  public void test212() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test212"); }


    int i2 = java.lang.Integer.compare((-1073741824), 144);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == (-1));

  }

  @Test
  public void test213() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test213"); }


    java.lang.Integer i2 = java.lang.Integer.getInteger("9", 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i2 + "' != '" + 2+ "'", i2.equals(2));

  }

  @Test
  public void test214() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test214"); }


    tp2.IP iP4 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i5 = iP4.getFirst();
    java.lang.Integer i6 = iP4.getSecond();
    tp2.IPBan iPBan8 = new tp2.IPBan(iP4, (java.lang.Long)1L);
    java.lang.Long long9 = iPBan8.getExpires();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i5 + "' != '" + (-1)+ "'", i5.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i6 + "' != '" + (-1)+ "'", i6.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L+ "'", long9.equals(1L));

  }

  @Test
  public void test215() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test215"); }


    tp2.IP iP4 = new tp2.IP((java.lang.Integer)64, (java.lang.Integer)144, (java.lang.Integer)134217599, (java.lang.Integer)469762048);

  }

  @Test
  public void test216() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test216"); }


    int i1 = java.lang.Integer.numberOfTrailingZeros(100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 2);

  }

  @Test
  public void test217() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test217"); }


    java.lang.Integer i2 = java.lang.Integer.getInteger("7fffffff", 4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i2 + "' != '" + 4+ "'", i2.equals(4));

  }

  @Test
  public void test218() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test218"); }


    java.lang.Integer i2 = java.lang.Integer.getInteger("4", 4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i2 + "' != '" + 4+ "'", i2.equals(4));

  }

  @Test
  public void test219() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test219"); }


    int i1 = java.lang.Integer.numberOfLeadingZeros(134217599);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 5);

  }

  @Test
  public void test220() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test220"); }


    int i1 = java.lang.Integer.parseUnsignedInt("28");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 28);

  }

  @Test
  public void test221() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test221"); }


    // The following exception was thrown during execution in test generation
    try {
      int i2 = java.lang.Integer.parseInt("a", 8);
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

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test222"); }


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
    boolean b21 = server0.notSharedElements();
    
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
    org.junit.Assert.assertTrue(b21 == true);

  }

  @Test
  public void test223() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test223"); }


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
    java.lang.Integer i28 = iP24.getSecond();
    
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
    org.junit.Assert.assertTrue("'" + i28 + "' != '" + (-1)+ "'", i28.equals((-1)));

  }

  @Test
  public void test224() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test224"); }


    java.lang.Integer i2 = java.lang.Integer.getInteger("1", (java.lang.Integer)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i2 + "' != '" + 0+ "'", i2.equals(0));

  }

  @Test
  public void test225() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test225"); }


    java.lang.Integer i2 = java.lang.Integer.getInteger("a", 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i2 + "' != '" + 32+ "'", i2.equals(32));

  }

  @Test
  public void test226() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test226"); }


    int i1 = java.lang.Integer.highestOneBit(727449600);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 536870912);

  }

  @Test
  public void test227() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test227"); }


    int i1 = java.lang.Integer.parseUnsignedInt("2147483647");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 2147483647);

  }

  @Test
  public void test228() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test228"); }


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
    boolean b24 = singlyLinkedList0.isEmpty();
    
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
    org.junit.Assert.assertTrue(b24 == true);

  }

  @Test
  public void test229() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test229"); }


    java.lang.Integer i2 = java.lang.Integer.getInteger("a000000", (java.lang.Integer)32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i2 + "' != '" + 32+ "'", i2.equals(32));

  }

  @Test
  public void test230() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test230"); }


    java.lang.Integer i1 = new java.lang.Integer("0");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 0+ "'", i1.equals(0));

  }

  @Test
  public void test231() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test231"); }


    int i1 = java.lang.Integer.highestOneBit((-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == (-2147483648));

  }

  @Test
  public void test232() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test232"); }


    int i2 = java.lang.Integer.compare((-2147483648), 16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == (-1));

  }

  @Test
  public void test233() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test233"); }


    // The following exception was thrown during execution in test generation
    try {
      int i1 = java.lang.Integer.parseInt("");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test234() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test234"); }


    java.lang.Integer i2 = java.lang.Integer.getInteger("5", (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i2 + "' != '" + (-1)+ "'", i2.equals((-1)));

  }

  @Test
  public void test235() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test235"); }


    tp2.SinglyLinkedList singlyLinkedList0 = new tp2.SinglyLinkedList();
    tp2.IP iP5 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i6 = iP5.getThird();
    boolean b7 = singlyLinkedList0.remove(iP5);
    tp2.IPBan iPBan9 = new tp2.IPBan(iP5, (java.lang.Long)10L);
    java.lang.Integer i10 = iP5.getSecond();
    java.lang.Integer i11 = iP5.getFourth();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i6 + "' != '" + (-1)+ "'", i6.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i10 + "' != '" + (-1)+ "'", i10.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i11 + "' != '" + 100+ "'", i11.equals(100));

  }

  @Test
  public void test236() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test236"); }


    int i1 = java.lang.Integer.numberOfLeadingZeros(1100100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 11);

  }

  @Test
  public void test237() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test237"); }


    java.lang.Integer i1 = java.lang.Integer.getInteger("100");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);

  }

  @Test
  public void test238() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test238"); }


    int i1 = java.lang.Integer.signum(1100100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 1);

  }

  @Test
  public void test239() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test239"); }


    int i2 = java.lang.Integer.rotateLeft(32, 150994944);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 32);

  }

  @Test
  public void test240() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test240"); }


    int i1 = java.lang.Integer.highestOneBit(1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 1);

  }

  @Test
  public void test241() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test241"); }


    int i2 = java.lang.Integer.sum(3, 16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 19);

  }

  @Test
  public void test242() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test242"); }


    int i2 = java.lang.Integer.divideUnsigned(144, 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 48);

  }

  @Test
  public void test243() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test243"); }


    java.lang.String str1 = java.lang.Integer.toHexString(32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "20"+ "'", str1.equals("20"));

  }

  @Test
  public void test244() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test244"); }


    int i1 = java.lang.Integer.numberOfTrailingZeros(167772260);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 2);

  }

  @Test
  public void test245() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test245"); }


    java.lang.String str2 = java.lang.Integer.toUnsignedString(167772260, 784);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "167772260"+ "'", str2.equals("167772260"));

  }

  @Test
  public void test246() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test246"); }


    int i1 = java.lang.Integer.lowestOneBit(33554432);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 33554432);

  }

  @Test
  public void test247() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test247"); }


    int i2 = java.lang.Integer.sum(67108864, 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 67108864);

  }

  @Test
  public void test248() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test248"); }


    int i1 = java.lang.Integer.signum((-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == (-1));

  }

  @Test
  public void test249() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test249"); }


    int i2 = java.lang.Integer.remainderUnsigned(134217599, 19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 3);

  }

  @Test
  public void test250() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test250"); }


    java.lang.String str1 = java.lang.Integer.toBinaryString(150994944);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "1001000000000000000000000000"+ "'", str1.equals("1001000000000000000000000000"));

  }

  @Test
  public void test251() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test251"); }


    java.lang.Integer i1 = java.lang.Integer.getInteger("4294967295");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);

  }

  @Test
  public void test252() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test252"); }


    tp2.IP iP4 = new tp2.IP((java.lang.Integer)0, (java.lang.Integer)144, (java.lang.Integer)167772260, (java.lang.Integer)4);

  }

  @Test
  public void test253() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test253"); }


    int i2 = java.lang.Integer.min(100, 48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 48);

  }

  @Test
  public void test254() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test254"); }


    java.lang.Integer i2 = java.lang.Integer.getInteger("9", (java.lang.Integer)167772260);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i2 + "' != '" + 167772260+ "'", i2.equals(167772260));

  }

  @Test
  public void test255() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test255"); }


    int i2 = java.lang.Integer.sum(11100, 784);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 11884);

  }

  @Test
  public void test256() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test256"); }


    int i2 = java.lang.Integer.min(32, 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);

  }

  @Test
  public void test257() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test257"); }


    java.lang.Integer i2 = java.lang.Integer.getInteger("10", (java.lang.Integer)11100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i2 + "' != '" + 11100+ "'", i2.equals(11100));

  }

  @Test
  public void test258() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test258"); }


    java.lang.String str1 = java.lang.Integer.toOctalString(1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "1"+ "'", str1.equals("1"));

  }

  @Test
  public void test259() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test259"); }


    java.lang.String str2 = java.lang.Integer.toUnsignedString(4, 784);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4"+ "'", str2.equals("4"));

  }

  @Test
  public void test260() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test260"); }


    int i1 = java.lang.Integer.reverse(2147483647);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == (-2));

  }

  @Test
  public void test261() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test261"); }


    int i1 = java.lang.Integer.numberOfLeadingZeros(9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 28);

  }

  @Test
  public void test262() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test262"); }


    int i1 = java.lang.Integer.signum(19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 1);

  }

  @Test
  public void test263() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test263"); }


    int i1 = java.lang.Integer.lowestOneBit((-2));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 2);

  }

  @Test
  public void test264() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test264"); }


    int i2 = java.lang.Integer.remainderUnsigned(2, 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 2);

  }

  @Test
  public void test265() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test265"); }


    int i1 = java.lang.Integer.numberOfTrailingZeros(469762048);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 26);

  }

  @Test
  public void test266() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test266"); }


    // The following exception was thrown during execution in test generation
    try {
      int i2 = java.lang.Integer.parseInt("5", 144);
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test267() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test267"); }


    tp2.Server server0 = new tp2.Server();
    tp2.ITime iTime1 = null;
    server0.setTime(iTime1);
    tp2.ITime iTime3 = null;
    server0.setTime(iTime3);
    boolean b5 = server0.exceptionsNotRepeated();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);

  }

  @Test
  public void test268() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test268"); }


    tp2.SinglyLinkedList singlyLinkedList0 = new tp2.SinglyLinkedList();
    tp2.IP iP5 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i6 = iP5.getThird();
    boolean b7 = singlyLinkedList0.remove(iP5);
    iP5.setSecond((java.lang.Integer)150994944);
    java.lang.Integer i10 = iP5.getFourth();
    java.lang.Integer i11 = iP5.getThird();
    java.lang.Integer i12 = iP5.getFirst();
    java.lang.Integer i13 = iP5.getThird();
    
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
    org.junit.Assert.assertTrue("'" + i13 + "' != '" + (-1)+ "'", i13.equals((-1)));

  }

  @Test
  public void test269() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test269"); }


    java.lang.String str1 = java.lang.Integer.toUnsignedString(201326597);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "201326597"+ "'", str1.equals("201326597"));

  }

  @Test
  public void test270() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test270"); }


    int i2 = java.lang.Integer.compare(727449600, 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);

  }

  @Test
  public void test271() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test271"); }


    java.lang.String str1 = java.lang.Integer.toHexString(11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "b"+ "'", str1.equals("b"));

  }

  @Test
  public void test272() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test272"); }


    java.lang.Integer i1 = new java.lang.Integer("20");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 20+ "'", i1.equals(20));

  }

  @Test
  public void test273() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test273"); }


    int i1 = java.lang.Integer.highestOneBit(2147483647);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 1073741824);

  }

  @Test
  public void test274() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test274"); }


    java.lang.Integer i2 = java.lang.Integer.getInteger("201326597", (java.lang.Integer)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i2 + "' != '" + 10+ "'", i2.equals(10));

  }

  @Test
  public void test275() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test275"); }


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
    java.lang.Long long39 = iPBan9.getExpires();
    iPBan9.setExpires((java.lang.Long)144L);
    
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
    org.junit.Assert.assertTrue("'" + long39 + "' != '" + 10L+ "'", long39.equals(10L));

  }

  @Test
  public void test276() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test276"); }


    java.lang.String str1 = java.lang.Integer.toBinaryString((-1073741812));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "11000000000000000000000000001100"+ "'", str1.equals("11000000000000000000000000001100"));

  }

  @Test
  public void test277() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test277"); }


    int i2 = java.lang.Integer.rotateRight(40, 784);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 2621440);

  }

  @Test
  public void test278() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test278"); }


    int i2 = java.lang.Integer.rotateRight(8, 1073741824);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 8);

  }

  @Test
  public void test279() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test279"); }


    java.lang.Integer i2 = java.lang.Integer.getInteger("10", (java.lang.Integer)40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i2 + "' != '" + 40+ "'", i2.equals(40));

  }

  @Test
  public void test280() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test280"); }


    java.lang.String str1 = java.lang.Integer.toHexString(0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "0"+ "'", str1.equals("0"));

  }

  @Test
  public void test281() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test281"); }


    java.lang.Integer i2 = java.lang.Integer.getInteger("20", 167772260);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i2 + "' != '" + 167772260+ "'", i2.equals(167772260));

  }

  @Test
  public void test282() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test282"); }


    int i2 = java.lang.Integer.rotateRight(167772260, 150994944);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 167772260);

  }

  @Test
  public void test283() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test283"); }


    int i2 = java.lang.Integer.min((-1073741812), (-1073741824));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == (-1073741824));

  }

  @Test
  public void test284() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test284"); }


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
    boolean b56 = server0.bansOkTime();
    
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
    org.junit.Assert.assertTrue(b56 == true);

  }

  @Test
  public void test285() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test285"); }


    // The following exception was thrown during execution in test generation
    try {
      korat.finitization.IFinitization iFinitization1 = tp2.Server.finServer(40);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test286() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test286"); }


    tp2.Server server0 = new tp2.Server();
    boolean b1 = server0.notSharedElements();
    boolean b2 = server0.notSharedElements();
    boolean b3 = server0.bansSorted();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);

  }

  @Test
  public void test287() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test287"); }


    long long1 = java.lang.Integer.toUnsignedLong(26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == 26L);

  }

  @Test
  public void test288() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test288"); }


    tp2.SinglyLinkedList singlyLinkedList0 = new tp2.SinglyLinkedList();
    tp2.IP iP1 = null;
    boolean b2 = singlyLinkedList0.remove(iP1);
    boolean b3 = singlyLinkedList0.isEmpty();
    tp2.SinglyLinkedList singlyLinkedList4 = new tp2.SinglyLinkedList();
    tp2.IP iP9 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i10 = iP9.getThird();
    boolean b11 = singlyLinkedList4.remove(iP9);
    tp2.IPBan iPBan13 = new tp2.IPBan(iP9, (java.lang.Long)10L);
    java.lang.Long long14 = iPBan13.getExpires();
    java.lang.Long long15 = iPBan13.getExpires();
    tp2.SinglyLinkedList singlyLinkedList16 = new tp2.SinglyLinkedList();
    tp2.IP iP21 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i22 = iP21.getThird();
    boolean b23 = singlyLinkedList16.remove(iP21);
    tp2.IPBan iPBan25 = new tp2.IPBan(iP21, (java.lang.Long)10L);
    tp2.IP iP30 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i31 = iP30.getFourth();
    iPBan25.setIp(iP30);
    iPBan13.setIp(iP30);
    boolean b34 = singlyLinkedList0.contains(iP30);
    java.lang.Integer i35 = iP30.getThird();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i10 + "' != '" + (-1)+ "'", i10.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long14 + "' != '" + 10L+ "'", long14.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long15 + "' != '" + 10L+ "'", long15.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i22 + "' != '" + (-1)+ "'", i22.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i31 + "' != '" + 100+ "'", i31.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i35 + "' != '" + (-1)+ "'", i35.equals((-1)));

  }

  @Test
  public void test289() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test289"); }


    // The following exception was thrown during execution in test generation
    try {
      int i2 = java.lang.Integer.parseInt("c", 67108864);
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

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test290"); }


    int i2 = java.lang.Integer.min(2147483647, 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 10);

  }

  @Test
  public void test291() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test291"); }


    tp2.Server server0 = new tp2.Server();
    boolean b1 = server0.bansSorted();
    tp2.IP iP2 = null;
    boolean b3 = server0.addBan(iP2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);

  }

  @Test
  public void test292() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test292"); }


    java.lang.Integer i0 = null;
    // The following exception was thrown during execution in test generation
    try {
      tp2.IP iP4 = new tp2.IP(i0, (java.lang.Integer)11884, (java.lang.Integer)536870912, (java.lang.Integer)2);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test293() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test293"); }


    int i2 = java.lang.Integer.compare(134217728, 1073741824);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == (-1));

  }

  @Test
  public void test294() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test294"); }


    int i1 = java.lang.Integer.reverse(2621440);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 5120);

  }

  @Test
  public void test295() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test295"); }


    java.lang.Integer i2 = java.lang.Integer.getInteger("167772260", (java.lang.Integer)201326597);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i2 + "' != '" + 201326597+ "'", i2.equals(201326597));

  }

  @Test
  public void test296() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test296"); }


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
    tp2.Server server33 = new tp2.Server();
    boolean b34 = server33.notSharedElements();
    tp2.SinglyLinkedList singlyLinkedList35 = new tp2.SinglyLinkedList();
    tp2.IP iP40 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i41 = iP40.getThird();
    boolean b42 = singlyLinkedList35.remove(iP40);
    boolean b43 = server33.addException(iP40);
    tp2.SinglyLinkedList singlyLinkedList44 = new tp2.SinglyLinkedList();
    tp2.IP iP49 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i50 = iP49.getFourth();
    singlyLinkedList44.add(iP49);
    java.lang.Integer i52 = iP49.getFirst();
    boolean b53 = server33.removeBan(iP49);
    tp2.ITime iTime54 = null;
    server33.setTime(iTime54);
    boolean b56 = server33.notSharedElements();
    tp2.IP iP61 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i62 = iP61.getThird();
    iP61.setFourth((java.lang.Integer)0);
    iP61.setSecond((java.lang.Integer)3);
    boolean b67 = server33.addBan(iP61);
    iP61.setFirst((java.lang.Integer)26);
    iPBan32.setIp(iP61);
    
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
    org.junit.Assert.assertTrue(b34 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i41 + "' != '" + (-1)+ "'", i41.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b43 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i50 + "' != '" + 100+ "'", i50.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i52 + "' != '" + (-1)+ "'", i52.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b53 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b56 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i62 + "' != '" + (-1)+ "'", i62.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b67 == true);

  }

  @Test
  public void test297() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test297"); }


    java.lang.Integer i1 = java.lang.Integer.valueOf(1100100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 1100100+ "'", i1.equals(1100100));

  }

  @Test
  public void test298() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test298"); }


    java.lang.Integer i2 = java.lang.Integer.getInteger("", (java.lang.Integer)1100100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i2 + "' != '" + 1100100+ "'", i2.equals(1100100));

  }

  @Test
  public void test299() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test299"); }


    int i2 = java.lang.Integer.rotateLeft((-1073741812), 2147483647);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1610612742);

  }

  @Test
  public void test300() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test300"); }


    java.lang.Integer i2 = java.lang.Integer.getInteger("4", 167772260);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i2 + "' != '" + 167772260+ "'", i2.equals(167772260));

  }

  @Test
  public void test301() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test301"); }


    java.lang.Integer i2 = java.lang.Integer.valueOf("100", 8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i2 + "' != '" + 64+ "'", i2.equals(64));

  }

  @Test
  public void test302() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test302"); }


    java.lang.String str1 = java.lang.Integer.toBinaryString(201326592);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "1100000000000000000000000000"+ "'", str1.equals("1100000000000000000000000000"));

  }

  @Test
  public void test303() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test303"); }


    // The following exception was thrown during execution in test generation
    try {
      java.lang.Integer i2 = java.lang.Integer.valueOf("a", 4);
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

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test304"); }


    int i2 = java.lang.Integer.remainderUnsigned(100, 20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);

  }

  @Test
  public void test305() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test305"); }


    int i1 = java.lang.Integer.highestOneBit(134217728);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 134217728);

  }

  @Test
  public void test306() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test306"); }


    int i2 = java.lang.Integer.compareUnsigned((-2147483648), 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);

  }

  @Test
  public void test307() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test307"); }


    java.lang.Integer i1 = java.lang.Integer.decode("201326597");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 201326597+ "'", i1.equals(201326597));

  }

  @Test
  public void test308() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test308"); }


    int i1 = java.lang.Integer.highestOneBit(0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);

  }

  @Test
  public void test309() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test309"); }


    tp2.Server server0 = new tp2.Server();
    boolean b1 = server0.exceptionsNotRepeated();
    tp2.ITime iTime2 = null;
    server0.setTime(iTime2);
    tp2.ITime iTime4 = null;
    server0.setTime(iTime4);
    tp2.SinglyLinkedList singlyLinkedList6 = new tp2.SinglyLinkedList();
    tp2.Server server7 = new tp2.Server();
    boolean b8 = server7.exceptionsNotRepeated();
    tp2.IP iP13 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i14 = iP13.getThird();
    iP13.setSecond((java.lang.Integer)10);
    boolean b17 = server7.removeBan(iP13);
    boolean b18 = singlyLinkedList6.remove(iP13);
    boolean b19 = server0.connect(iP13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i14 + "' != '" + (-1)+ "'", i14.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);

  }

  @Test
  public void test310() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test310"); }


    java.lang.Integer i1 = new java.lang.Integer((-1073741812));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + (-1073741812)+ "'", i1.equals((-1073741812)));

  }

  @Test
  public void test311() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test311"); }


    int i1 = java.lang.Integer.numberOfLeadingZeros(100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 25);

  }

  @Test
  public void test312() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test312"); }


    int i1 = java.lang.Integer.reverse(12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 805306368);

  }

  @Test
  public void test313() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test313"); }


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
    int i24 = singlyLinkedList0.getSize();
    
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
    org.junit.Assert.assertTrue(i24 == 0);

  }

  @Test
  public void test314() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test314"); }


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
    java.lang.Long long39 = iPBan9.getExpires();
    java.lang.Long long40 = iPBan9.getExpires();
    
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
    org.junit.Assert.assertTrue("'" + long39 + "' != '" + 10L+ "'", long39.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long40 + "' != '" + 10L+ "'", long40.equals(10L));

  }

  @Test
  public void test315() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test315"); }


    int i1 = java.lang.Integer.parseInt("100000");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 100000);

  }

  @Test
  public void test316() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test316"); }


    java.lang.String str2 = java.lang.Integer.toUnsignedString(0, 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "0"+ "'", str2.equals("0"));

  }

  @Test
  public void test317() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test317"); }


    java.lang.String str1 = java.lang.Integer.toOctalString(19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "23"+ "'", str1.equals("23"));

  }

  @Test
  public void test318() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test318"); }


    long long1 = java.lang.Integer.toUnsignedLong(1100100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == 1100100L);

  }

  @Test
  public void test319() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test319"); }


    // The following exception was thrown during execution in test generation
    try {
      korat.finitization.IFinitization iFinitization1 = tp2.Server.finServer(28);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test320() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test320"); }


    int i1 = java.lang.Integer.numberOfLeadingZeros(1610612742);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 1);

  }

  @Test
  public void test321() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test321"); }


    int i2 = java.lang.Integer.rotateLeft(727449600, 201326592);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 727449600);

  }

  @Test
  public void test322() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test322"); }


    int i1 = java.lang.Integer.numberOfTrailingZeros((-129));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);

  }

  @Test
  public void test323() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test323"); }


    int i2 = java.lang.Integer.compareUnsigned(0, 5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == (-1));

  }

  @Test
  public void test324() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test324"); }


    int i2 = java.lang.Integer.compare(20, 1100100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == (-1));

  }

  @Test
  public void test325() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test325"); }


    int i1 = java.lang.Integer.signum(3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 1);

  }

  @Test
  public void test326() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test326"); }


    int i1 = java.lang.Integer.highestOneBit(11100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 8192);

  }

  @Test
  public void test327() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test327"); }


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
    tp2.Server server63 = new tp2.Server();
    boolean b64 = server63.exceptionsNotRepeated();
    tp2.IP iP69 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i70 = iP69.getThird();
    iP69.setSecond((java.lang.Integer)10);
    boolean b73 = server63.removeBan(iP69);
    java.lang.Integer i74 = iP69.getSecond();
    singlyLinkedList0.add(iP69);
    
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
    org.junit.Assert.assertTrue(b64 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i70 + "' != '" + (-1)+ "'", i70.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b73 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i74 + "' != '" + 10+ "'", i74.equals(10));

  }

  @Test
  public void test328() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test328"); }


    int i1 = java.lang.Integer.bitCount(134217599);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 26);

  }

  @Test
  public void test329() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test329"); }


    int i2 = java.lang.Integer.rotateLeft(32, 9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 16384);

  }

  @Test
  public void test330() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test330"); }


    tp2.Server server0 = new tp2.Server();
    tp2.IP iP5 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    boolean b6 = server0.removeBan(iP5);
    iP5.setFirst((java.lang.Integer)805306368);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);

  }

  @Test
  public void test331() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test331"); }


    int i2 = java.lang.Integer.min(64, 11884);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 64);

  }

  @Test
  public void test332() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test332"); }


    // The following exception was thrown during execution in test generation
    try {
      java.lang.Integer i1 = java.lang.Integer.decode("a000000");
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

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test333"); }


    int i1 = java.lang.Integer.signum(144);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 1);

  }

  @Test
  public void test334() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test334"); }


    java.lang.String str1 = java.lang.Integer.toHexString(5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "5"+ "'", str1.equals("5"));

  }

  @Test
  public void test335() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test335"); }


    java.lang.String str2 = java.lang.Integer.toUnsignedString(2621440, 144);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "2621440"+ "'", str2.equals("2621440"));

  }

  @Test
  public void test336() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test336"); }


    int i1 = java.lang.Integer.numberOfLeadingZeros(805306368);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 2);

  }

  @Test
  public void test337() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test337"); }


    int i2 = java.lang.Integer.rotateRight((-1073741812), (-2));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 51);

  }

  @Test
  public void test338() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test338"); }


    int i2 = java.lang.Integer.sum(134217728, 33554432);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 167772160);

  }

  @Test
  public void test339() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test339"); }


    int i1 = java.lang.Integer.lowestOneBit((-129));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 1);

  }

  @Test
  public void test340() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test340"); }


    int i2 = java.lang.Integer.parseUnsignedInt("2621440", 8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 729888);

  }

  @Test
  public void test341() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test341"); }


    // The following exception was thrown during execution in test generation
    try {
      int i2 = java.lang.Integer.parseUnsignedInt("hi!", 167772160);
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

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test342"); }


    int i1 = java.lang.Integer.reverse(469762048);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 56);

  }

  @Test
  public void test343() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test343"); }


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
    boolean b61 = server0.bansSorted();
    
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
    org.junit.Assert.assertTrue(b61 == true);

  }

  @Test
  public void test344() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test344"); }


    int i2 = java.lang.Integer.rotateRight(805306368, 26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 12);

  }

  @Test
  public void test345() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test345"); }


    tp2.Server server0 = new tp2.Server();
    boolean b1 = server0.exceptionsNotRepeated();
    boolean b2 = server0.bansSorted();
    boolean b3 = server0.notSharedElements();
    boolean b4 = server0.bansSorted();
    server0.update();
    tp2.IP iP10 = new tp2.IP((java.lang.Integer)11100, (java.lang.Integer)40, (java.lang.Integer)28, (java.lang.Integer)727449600);
    boolean b11 = server0.addException(iP10);
    tp2.Server server12 = new tp2.Server();
    boolean b13 = server12.exceptionsNotRepeated();
    boolean b14 = server12.bansSorted();
    boolean b15 = server12.notSharedElements();
    tp2.SinglyLinkedList singlyLinkedList16 = new tp2.SinglyLinkedList();
    tp2.IP iP21 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i22 = iP21.getFourth();
    singlyLinkedList16.add(iP21);
    boolean b24 = server12.addException(iP21);
    tp2.Server server25 = new tp2.Server();
    boolean b26 = server25.notSharedElements();
    tp2.SinglyLinkedList singlyLinkedList27 = new tp2.SinglyLinkedList();
    tp2.IP iP32 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i33 = iP32.getThird();
    boolean b34 = singlyLinkedList27.remove(iP32);
    boolean b35 = server25.addException(iP32);
    tp2.SinglyLinkedList singlyLinkedList36 = new tp2.SinglyLinkedList();
    tp2.IP iP41 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i42 = iP41.getFourth();
    singlyLinkedList36.add(iP41);
    java.lang.Integer i44 = iP41.getFirst();
    boolean b45 = server25.removeBan(iP41);
    tp2.ITime iTime46 = null;
    server25.setTime(iTime46);
    boolean b48 = server25.notSharedElements();
    tp2.IP iP53 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i54 = iP53.getThird();
    iP53.setFourth((java.lang.Integer)0);
    iP53.setSecond((java.lang.Integer)3);
    boolean b59 = server25.addBan(iP53);
    tp2.SinglyLinkedList singlyLinkedList60 = new tp2.SinglyLinkedList();
    tp2.IP iP65 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i66 = iP65.getThird();
    boolean b67 = singlyLinkedList60.remove(iP65);
    java.lang.Integer i68 = iP65.getThird();
    iP65.setFirst((java.lang.Integer)11100);
    boolean b71 = server25.addBan(iP65);
    boolean b72 = server12.removeBan(iP65);
    boolean b73 = server0.connect(iP65);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i22 + "' != '" + 100+ "'", i22.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i33 + "' != '" + (-1)+ "'", i33.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i42 + "' != '" + 100+ "'", i42.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i44 + "' != '" + (-1)+ "'", i44.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b48 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i54 + "' != '" + (-1)+ "'", i54.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b59 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i66 + "' != '" + (-1)+ "'", i66.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b67 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i68 + "' != '" + (-1)+ "'", i68.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b71 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b72 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b73 == true);

  }

  @Test
  public void test346() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test346"); }


    int i2 = java.lang.Integer.rotateLeft(20, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 10);

  }

  @Test
  public void test347() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test347"); }


    java.lang.Integer i2 = java.lang.Integer.valueOf("12", 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i2 + "' != '" + 13+ "'", i2.equals(13));

  }

  @Test
  public void test348() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test348"); }


    int i1 = java.lang.Integer.numberOfLeadingZeros(11100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 18);

  }

  @Test
  public void test349() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test349"); }


    // The following exception was thrown during execution in test generation
    try {
      int i2 = java.lang.Integer.parseInt("167772260", 100000);
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test350() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test350"); }


    tp2.IP iP4 = new tp2.IP((java.lang.Integer)150994944, (java.lang.Integer)11100, (java.lang.Integer)784, (java.lang.Integer)0);
    java.lang.Integer i5 = iP4.getSecond();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i5 + "' != '" + 11100+ "'", i5.equals(11100));

  }

  @Test
  public void test351() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test351"); }


    java.lang.Integer i1 = java.lang.Integer.valueOf("1100100");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 1100100+ "'", i1.equals(1100100));

  }

  @Test
  public void test352() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test352"); }


    int i1 = java.lang.Integer.reverseBytes(40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 671088640);

  }

  @Test
  public void test353() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test353"); }


    int i1 = java.lang.Integer.reverseBytes(11100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 1546321920);

  }

  @Test
  public void test354() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test354"); }


    int i2 = java.lang.Integer.compare(805306368, 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);

  }

  @Test
  public void test355() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test355"); }


    int i1 = java.lang.Integer.parseInt("201326597");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 201326597);

  }

  @Test
  public void test356() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test356"); }


    int i2 = java.lang.Integer.sum(32, 201326592);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 201326624);

  }

  @Test
  public void test357() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test357"); }


    int i1 = java.lang.Integer.signum(727449600);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 1);

  }

  @Test
  public void test358() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test358"); }


    java.lang.String str2 = java.lang.Integer.toUnsignedString(167772160, 16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "a000000"+ "'", str2.equals("a000000"));

  }

  @Test
  public void test359() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test359"); }


    int i1 = java.lang.Integer.lowestOneBit(5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 1);

  }

  @Test
  public void test360() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test360"); }


    int i2 = java.lang.Integer.min(100, 13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 13);

  }

  @Test
  public void test361() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test361"); }


    java.lang.Integer i1 = java.lang.Integer.getInteger("b");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);

  }

  @Test
  public void test362() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test362"); }


    // The following exception was thrown during execution in test generation
    try {
      korat.finitization.IFinitization iFinitization1 = tp2.Server.finServer(2621440);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test363() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test363"); }


    java.lang.Integer i1 = java.lang.Integer.valueOf(56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 56+ "'", i1.equals(56));

  }

  @Test
  public void test364() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test364"); }


    int i2 = java.lang.Integer.compareUnsigned(2621440, (-2));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == (-1));

  }

  @Test
  public void test365() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test365"); }


    int i2 = java.lang.Integer.remainderUnsigned(100, 56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 44);

  }

  @Test
  public void test366() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test366"); }


    java.lang.Integer i2 = java.lang.Integer.getInteger("9", (java.lang.Integer)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i2 + "' != '" + 100+ "'", i2.equals(100));

  }

  @Test
  public void test367() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test367"); }


    int i1 = java.lang.Integer.reverse(26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 1476395008);

  }

  @Test
  public void test368() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test368"); }


    int i1 = java.lang.Integer.signum(1073741824);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 1);

  }

  @Test
  public void test369() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test369"); }


    int i2 = java.lang.Integer.max(51, 20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 51);

  }

  @Test
  public void test370() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test370"); }


    int i2 = java.lang.Integer.sum(44, 1610612742);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1610612786);

  }

  @Test
  public void test371() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test371"); }


    int i2 = java.lang.Integer.rotateRight(64, 67108864);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 64);

  }

  @Test
  public void test372() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test372"); }


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
    tp2.IP iP60 = iPBan9.getIp();
    
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
    org.junit.Assert.assertNotNull(iP60);

  }

  @Test
  public void test373() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test373"); }


    java.lang.String str1 = java.lang.Integer.toBinaryString(469762048);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "11100000000000000000000000000"+ "'", str1.equals("11100000000000000000000000000"));

  }

  @Test
  public void test374() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test374"); }


    int i2 = java.lang.Integer.rotateLeft(0, 25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);

  }

  @Test
  public void test375() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test375"); }


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
    boolean b23 = server0.bansOkTime();
    
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

  }

  @Test
  public void test376() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test376"); }


    tp2.SinglyLinkedList singlyLinkedList0 = new tp2.SinglyLinkedList();
    tp2.IP iP5 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i6 = iP5.getThird();
    boolean b7 = singlyLinkedList0.remove(iP5);
    iP5.setSecond((java.lang.Integer)150994944);
    java.lang.Integer i10 = iP5.getFourth();
    java.lang.Integer i11 = iP5.getThird();
    iP5.setSecond((java.lang.Integer)1610612786);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i6 + "' != '" + (-1)+ "'", i6.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i10 + "' != '" + 100+ "'", i10.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i11 + "' != '" + (-1)+ "'", i11.equals((-1)));

  }

  @Test
  public void test377() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test377"); }


    java.lang.Integer i2 = java.lang.Integer.getInteger("b", 201326597);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i2 + "' != '" + 201326597+ "'", i2.equals(201326597));

  }

  @Test
  public void test378() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test378"); }


    tp2.SinglyLinkedList singlyLinkedList0 = new tp2.SinglyLinkedList();
    tp2.Server server1 = new tp2.Server();
    boolean b2 = server1.exceptionsNotRepeated();
    tp2.IP iP7 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i8 = iP7.getThird();
    iP7.setSecond((java.lang.Integer)10);
    boolean b11 = server1.removeBan(iP7);
    boolean b12 = singlyLinkedList0.remove(iP7);
    int i13 = singlyLinkedList0.getSize();
    tp2.IP iP14 = null;
    boolean b15 = singlyLinkedList0.contains(iP14);
    
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
    org.junit.Assert.assertTrue(b15 == false);

  }

  @Test
  public void test379() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test379"); }


    tp2.Server server0 = new tp2.Server();
    boolean b1 = server0.notSharedElements();
    boolean b2 = server0.bansOkTime();
    tp2.ITime iTime3 = null;
    server0.setTime(iTime3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);

  }

  @Test
  public void test380() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test380"); }


    // The following exception was thrown during execution in test generation
    try {
      int i2 = java.lang.Integer.parseUnsignedInt("11111111111111111111111111111111", 26);
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

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test381"); }


    // The following exception was thrown during execution in test generation
    try {
      korat.finitization.IFinitization iFinitization1 = tp2.Server.finServer(51);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test382() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test382"); }


    java.lang.Integer i2 = java.lang.Integer.getInteger("100", (java.lang.Integer)11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i2 + "' != '" + 11+ "'", i2.equals(11));

  }

  @Test
  public void test383() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test383"); }


    int i2 = java.lang.Integer.compare(8192, 16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);

  }

  @Test
  public void test384() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test384"); }


    java.lang.Integer i1 = new java.lang.Integer(201326592);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 201326592+ "'", i1.equals(201326592));

  }

  @Test
  public void test385() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test385"); }


    int i1 = java.lang.Integer.bitCount(32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 1);

  }

  @Test
  public void test386() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test386"); }


    // The following exception was thrown during execution in test generation
    try {
      int i2 = java.lang.Integer.parseUnsignedInt("469762048", 167772160);
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test387() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test387"); }


    int i2 = java.lang.Integer.rotateLeft(2621440, (-2147483648));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 2621440);

  }

  @Test
  public void test388() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test388"); }


    int i1 = java.lang.Integer.signum(5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 1);

  }

  @Test
  public void test389() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test389"); }


    java.lang.Integer i1 = new java.lang.Integer("1");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 1+ "'", i1.equals(1));

  }

  @Test
  public void test390() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test390"); }


    java.lang.Integer i1 = java.lang.Integer.getInteger("9");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);

  }

  @Test
  public void test391() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test391"); }


    java.lang.Integer i2 = java.lang.Integer.getInteger("hi!", 16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i2 + "' != '" + 16+ "'", i2.equals(16));

  }

  @Test
  public void test392() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test392"); }


    java.lang.Integer i1 = new java.lang.Integer(727449600);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 727449600+ "'", i1.equals(727449600));

  }

  @Test
  public void test393() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test393"); }


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
    java.lang.Integer i35 = iP32.getSecond();
    boolean b36 = strictlySortedSinglyLinkedList0.removeFromIP(iP32);
    boolean b37 = strictlySortedSinglyLinkedList0.isEmpty();
    
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
    org.junit.Assert.assertTrue("'" + i35 + "' != '" + (-1)+ "'", i35.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == true);

  }

  @Test
  public void test394() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test394"); }


    java.lang.String str1 = java.lang.Integer.toHexString(3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "3"+ "'", str1.equals("3"));

  }

  @Test
  public void test395() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test395"); }


    int i1 = java.lang.Integer.parseUnsignedInt("20");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 20);

  }

  @Test
  public void test396() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test396"); }


    int i1 = java.lang.Integer.highestOneBit(8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 8);

  }

  @Test
  public void test397() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test397"); }


    tp2.IP iP4 = new tp2.IP((java.lang.Integer)4, (java.lang.Integer)26, (java.lang.Integer)201326597, (java.lang.Integer)8192);

  }

  @Test
  public void test398() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test398"); }


    int i2 = java.lang.Integer.remainderUnsigned(0, 8192);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);

  }

  @Test
  public void test399() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test399"); }


    java.lang.String str1 = java.lang.Integer.toHexString(19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "13"+ "'", str1.equals("13"));

  }

  @Test
  public void test400() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test400"); }


    java.lang.String str2 = java.lang.Integer.toUnsignedString(1100100, 19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "88770"+ "'", str2.equals("88770"));

  }

  @Test
  public void test401() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test401"); }


    // The following exception was thrown during execution in test generation
    try {
      int i2 = java.lang.Integer.parseInt("201326597", 2147483647);
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

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test402"); }


    int i1 = java.lang.Integer.lowestOneBit(3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 1);

  }

  @Test
  public void test403() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test403"); }


    java.lang.Integer i2 = java.lang.Integer.getInteger("4", (java.lang.Integer)(-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i2 + "' != '" + (-1)+ "'", i2.equals((-1)));

  }

  @Test
  public void test404() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test404"); }


    // The following exception was thrown during execution in test generation
    try {
      java.lang.Integer i2 = java.lang.Integer.valueOf("2147483647", 134217728);
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

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test405"); }


    long long1 = java.lang.Integer.toUnsignedLong(10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == 10L);

  }

  @Test
  public void test406() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test406"); }


    // The following exception was thrown during execution in test generation
    try {
      int i2 = java.lang.Integer.parseUnsignedInt("469762048", 11100);
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test407() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test407"); }


    int i2 = java.lang.Integer.compareUnsigned((-2147483648), 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);

  }

  @Test
  public void test408() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test408"); }


    java.lang.Integer i2 = java.lang.Integer.getInteger("", (java.lang.Integer)167772260);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i2 + "' != '" + 167772260+ "'", i2.equals(167772260));

  }

  @Test
  public void test409() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test409"); }


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
    tp2.IP iP37 = singlyLinkedList0.get(13);
    
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
    org.junit.Assert.assertNull(iP37);

  }

  @Test
  public void test410() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test410"); }


    java.lang.String str1 = java.lang.Integer.toBinaryString(536870912);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "100000000000000000000000000000"+ "'", str1.equals("100000000000000000000000000000"));

  }

  @Test
  public void test411() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test411"); }


    int i1 = java.lang.Integer.bitCount((-2147483648));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 1);

  }

  @Test
  public void test412() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test412"); }


    int i1 = java.lang.Integer.numberOfLeadingZeros(729888);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 12);

  }

  @Test
  public void test413() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test413"); }


    // The following exception was thrown during execution in test generation
    try {
      java.lang.Integer i2 = java.lang.Integer.valueOf("100000000000000000000000000000", 100);
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test414() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test414"); }


    tp2.IP iP4 = new tp2.IP((java.lang.Integer)67108864, (java.lang.Integer)0, (java.lang.Integer)729888, (java.lang.Integer)5);

  }

  @Test
  public void test415() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test415"); }


    int i1 = java.lang.Integer.reverse(134217728);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 16);

  }

  @Test
  public void test416() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test416"); }


    // The following exception was thrown during execution in test generation
    try {
      int i2 = java.lang.Integer.parseUnsignedInt("1001000000000000000000000000", 5);
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test417() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test417"); }


    int i1 = java.lang.Integer.numberOfTrailingZeros(3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);

  }

  @Test
  public void test418() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test418"); }


    int i2 = java.lang.Integer.compare(1610612742, 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);

  }

  @Test
  public void test419() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test419"); }


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
    java.lang.Integer i31 = iP25.getFourth();
    
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
    org.junit.Assert.assertTrue("'" + i31 + "' != '" + 100+ "'", i31.equals(100));

  }

  @Test
  public void test420() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test420"); }


    int i2 = java.lang.Integer.compareUnsigned(5, 201326624);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == (-1));

  }

  @Test
  public void test421() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test421"); }


    long long1 = java.lang.Integer.toUnsignedLong(16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == 16L);

  }

  @Test
  public void test422() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test422"); }


    int i2 = java.lang.Integer.min(0, 16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);

  }

  @Test
  public void test423() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test423"); }


    java.lang.String str1 = java.lang.Integer.toHexString(51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "33"+ "'", str1.equals("33"));

  }

  @Test
  public void test424() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test424"); }


    int i1 = java.lang.Integer.reverseBytes(536870912);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 32);

  }

  @Test
  public void test425() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test425"); }


    java.lang.Integer i2 = java.lang.Integer.getInteger("12", 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i2 + "' != '" + 0+ "'", i2.equals(0));

  }

  @Test
  public void test426() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test426"); }


    int i1 = java.lang.Integer.bitCount(134217728);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 1);

  }

  @Test
  public void test427() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test427"); }


    int i2 = java.lang.Integer.max(167772160, 28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 167772160);

  }

  @Test
  public void test428() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test428"); }


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
    tp2.IP iP44 = singlyLinkedList0.get(5120);
    
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
    org.junit.Assert.assertNull(iP44);

  }

  @Test
  public void test429() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test429"); }


    int i2 = java.lang.Integer.divideUnsigned(784, 727449600);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);

  }

  @Test
  public void test430() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test430"); }


    // The following exception was thrown during execution in test generation
    try {
      java.lang.Integer i1 = java.lang.Integer.decode("c");
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

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test431"); }


    int i2 = java.lang.Integer.rotateRight(1100100, 2621440);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1100100);

  }

  @Test
  public void test432() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test432"); }


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
    java.lang.Integer i65 = iP58.getSecond();
    
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
    org.junit.Assert.assertTrue("'" + i65 + "' != '" + (-1)+ "'", i65.equals((-1)));

  }

  @Test
  public void test433() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test433"); }


    java.lang.String str2 = java.lang.Integer.toUnsignedString(536870912, 201326592);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "536870912"+ "'", str2.equals("536870912"));

  }

  @Test
  public void test434() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test434"); }


    tp2.SinglyLinkedList singlyLinkedList0 = new tp2.SinglyLinkedList();
    tp2.Server server1 = new tp2.Server();
    boolean b2 = server1.exceptionsNotRepeated();
    tp2.IP iP7 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i8 = iP7.getThird();
    iP7.setSecond((java.lang.Integer)10);
    boolean b11 = server1.removeBan(iP7);
    boolean b12 = singlyLinkedList0.remove(iP7);
    java.lang.Integer i13 = iP7.getFirst();
    
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
  public void test435() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test435"); }


    tp2.SinglyLinkedList singlyLinkedList0 = new tp2.SinglyLinkedList();
    tp2.IP iP5 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i6 = iP5.getThird();
    boolean b7 = singlyLinkedList0.remove(iP5);
    tp2.IPBan iPBan9 = new tp2.IPBan(iP5, (java.lang.Long)10L);
    tp2.IP iP10 = iPBan9.getIp();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i6 + "' != '" + (-1)+ "'", i6.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iP10);

  }

  @Test
  public void test436() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test436"); }


    int i1 = java.lang.Integer.parseInt("10");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 10);

  }

  @Test
  public void test437() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test437"); }


    int i1 = java.lang.Integer.signum(671088640);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 1);

  }

  @Test
  public void test438() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test438"); }


    // The following exception was thrown during execution in test generation
    try {
      int i2 = java.lang.Integer.parseUnsignedInt("1001000000000000000000000000", 671088640);
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test439() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test439"); }


    int i2 = java.lang.Integer.compareUnsigned(8192, 201326597);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == (-1));

  }

  @Test
  public void test440() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test440"); }


    java.lang.Integer i2 = java.lang.Integer.getInteger("88770", 16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i2 + "' != '" + 16+ "'", i2.equals(16));

  }

  @Test
  public void test441() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test441"); }


    java.lang.String str1 = java.lang.Integer.toBinaryString(25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "11001"+ "'", str1.equals("11001"));

  }

  @Test
  public void test442() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test442"); }


    int i1 = java.lang.Integer.reverse(784);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 146800640);

  }

  @Test
  public void test443() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test443"); }


    java.lang.String str2 = java.lang.Integer.toUnsignedString((-2147483648), 144);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "2147483648"+ "'", str2.equals("2147483648"));

  }

  @Test
  public void test444() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test444"); }


    tp2.SinglyLinkedList singlyLinkedList0 = new tp2.SinglyLinkedList();
    tp2.IP iP5 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i6 = iP5.getFourth();
    singlyLinkedList0.add(iP5);
    boolean b8 = singlyLinkedList0.isEmpty();
    int i9 = singlyLinkedList0.getSize();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i6 + "' != '" + 100+ "'", i6.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 1);

  }

  @Test
  public void test445() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test445"); }


    int i2 = java.lang.Integer.rotateRight(2, 56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 512);

  }

  @Test
  public void test446() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test446"); }


    // The following exception was thrown during execution in test generation
    try {
      korat.finitization.IFinitization iFinitization1 = tp2.Server.finServer(44);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test447() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test447"); }


    int i1 = java.lang.Integer.parseUnsignedInt("100");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 100);

  }

  @Test
  public void test448() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test448"); }


    int i1 = java.lang.Integer.reverseBytes(13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 218103808);

  }

  @Test
  public void test449() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test449"); }


    int i1 = java.lang.Integer.reverseBytes(26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 436207616);

  }

  @Test
  public void test450() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test450"); }


    java.lang.Integer i2 = java.lang.Integer.getInteger("100000", 1610612786);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i2 + "' != '" + 1610612786+ "'", i2.equals(1610612786));

  }

  @Test
  public void test451() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test451"); }


    int i1 = java.lang.Integer.highestOneBit(729888);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 524288);

  }

  @Test
  public void test452() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test452"); }


    int i2 = java.lang.Integer.compare(0, 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);

  }

  @Test
  public void test453() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test453"); }


    java.lang.Integer i2 = java.lang.Integer.getInteger("28", (java.lang.Integer)1100100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i2 + "' != '" + 1100100+ "'", i2.equals(1100100));

  }

  @Test
  public void test454() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test454"); }


    int i2 = java.lang.Integer.rotateRight(1610612742, 5120);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1610612742);

  }

  @Test
  public void test455() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test455"); }


    // The following exception was thrown during execution in test generation
    try {
      java.lang.Integer i2 = java.lang.Integer.valueOf("536870912", 167772260);
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

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test456"); }


    tp2.IP iP4 = new tp2.IP((java.lang.Integer)1476395008, (java.lang.Integer)167772260, (java.lang.Integer)(-2), (java.lang.Integer)51);

  }

  @Test
  public void test457() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test457"); }


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
    org.junit.Assert.assertTrue(b27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i33 + "' != '" + (-1)+ "'", i33.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == false);

  }

  @Test
  public void test458() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test458"); }


    long long1 = java.lang.Integer.toUnsignedLong(32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == 32L);

  }

  @Test
  public void test459() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test459"); }


    int i2 = java.lang.Integer.min(100, 134217599);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 100);

  }

  @Test
  public void test460() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test460"); }


    int i2 = java.lang.Integer.sum(11, 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 11);

  }

  @Test
  public void test461() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test461"); }


    int i1 = java.lang.Integer.numberOfTrailingZeros(16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 4);

  }

  @Test
  public void test462() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test462"); }


    // The following exception was thrown during execution in test generation
    try {
      java.lang.Integer i1 = new java.lang.Integer("1001000000000000000000000000");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test463() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test463"); }


    java.lang.String str2 = java.lang.Integer.toUnsignedString(144, 1610612786);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "144"+ "'", str2.equals("144"));

  }

  @Test
  public void test464() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test464"); }


    int i2 = java.lang.Integer.compareUnsigned(8, 11884);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == (-1));

  }

  @Test
  public void test465() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test465"); }


    tp2.SinglyLinkedList singlyLinkedList0 = new tp2.SinglyLinkedList();
    tp2.IP iP5 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i6 = iP5.getThird();
    boolean b7 = singlyLinkedList0.remove(iP5);
    tp2.IPBan iPBan9 = new tp2.IPBan(iP5, (java.lang.Long)10L);
    java.lang.Integer i10 = iP5.getThird();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i6 + "' != '" + (-1)+ "'", i6.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i10 + "' != '" + (-1)+ "'", i10.equals((-1)));

  }

  @Test
  public void test466() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test466"); }


    int i2 = java.lang.Integer.compare(9, 201326592);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == (-1));

  }

  @Test
  public void test467() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test467"); }


    int i1 = java.lang.Integer.signum(13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 1);

  }

  @Test
  public void test468() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test468"); }


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
    java.lang.Integer i35 = iP30.getFourth();
    
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
    org.junit.Assert.assertTrue("'" + i35 + "' != '" + 0+ "'", i35.equals(0));

  }

  @Test
  public void test469() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test469"); }


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
    tp2.ITime iTime23 = null;
    server0.setTime(iTime23);
    
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
  public void test470() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test470"); }


    // The following exception was thrown during execution in test generation
    try {
      java.lang.Integer i2 = java.lang.Integer.valueOf("88770", 33554432);
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test471() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test471"); }


    java.lang.Integer i1 = new java.lang.Integer("5");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 5+ "'", i1.equals(5));

  }

  @Test
  public void test472() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test472"); }


    // The following exception was thrown during execution in test generation
    try {
      java.lang.Integer i2 = java.lang.Integer.valueOf("13", (-1));
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test473() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test473"); }


    korat.finitization.IFinitization iFinitization1 = tp2.Server.finServer(18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iFinitization1);

  }

  @Test
  public void test474() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test474"); }


    java.lang.Integer i1 = java.lang.Integer.decode("88770");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 88770+ "'", i1.equals(88770));

  }

  @Test
  public void test475() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test475"); }


    tp2.Server server0 = new tp2.Server();
    tp2.IP iP5 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    boolean b6 = server0.removeBan(iP5);
    boolean b7 = server0.bansSorted();
    boolean b8 = server0.exceptionsNotRepeated();
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
  public void test476() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test476"); }


    java.lang.Integer i2 = java.lang.Integer.getInteger("5", (java.lang.Integer)201326597);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i2 + "' != '" + 201326597+ "'", i2.equals(201326597));

  }

  @Test
  public void test477() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test477"); }


    int i1 = java.lang.Integer.numberOfLeadingZeros(88770);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 15);

  }

  @Test
  public void test478() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test478"); }


    java.lang.Integer i1 = null;
    // The following exception was thrown during execution in test generation
    try {
      tp2.IP iP4 = new tp2.IP((java.lang.Integer)134217599, i1, (java.lang.Integer)20, (java.lang.Integer)1476395008);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test479() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test479"); }


    int i1 = java.lang.Integer.bitCount((-1073741824));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 2);

  }

  @Test
  public void test480() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test480"); }


    int i2 = java.lang.Integer.divideUnsigned(5120, 16384);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);

  }

  @Test
  public void test481() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test481"); }


    int i2 = java.lang.Integer.remainderUnsigned(0, (-1073741824));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);

  }

  @Test
  public void test482() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test482"); }


    int i1 = java.lang.Integer.highestOneBit(19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 16);

  }

  @Test
  public void test483() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test483"); }


    int i1 = java.lang.Integer.parseInt("13");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 13);

  }

  @Test
  public void test484() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test484"); }


    int i1 = java.lang.Integer.reverseBytes((-1073741812));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 201326784);

  }

  @Test
  public void test485() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test485"); }


    // The following exception was thrown during execution in test generation
    try {
      int i2 = java.lang.Integer.parseInt("536870912", 44);
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test486() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test486"); }


    tp2.IP iP4 = new tp2.IP((java.lang.Integer)150994944, (java.lang.Integer)784, (java.lang.Integer)784, (java.lang.Integer)2);
    tp2.Server server5 = new tp2.Server();
    boolean b6 = server5.exceptionsNotRepeated();
    boolean b7 = server5.bansSorted();
    boolean b8 = server5.notSharedElements();
    tp2.SinglyLinkedList singlyLinkedList9 = new tp2.SinglyLinkedList();
    tp2.IP iP14 = new tp2.IP((java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)(-1), (java.lang.Integer)100);
    java.lang.Integer i15 = iP14.getFourth();
    singlyLinkedList9.add(iP14);
    boolean b17 = server5.addException(iP14);
    boolean b18 = server5.bansSorted();
    boolean b19 = iP4.equals((java.lang.Object)b18);
    java.lang.Integer i20 = iP4.getFourth();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i15 + "' != '" + 100+ "'", i15.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i20 + "' != '" + 2+ "'", i20.equals(2));

  }

  @Test
  public void test487() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test487"); }


    java.lang.Integer i1 = java.lang.Integer.valueOf(524288);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 524288+ "'", i1.equals(524288));

  }

  @Test
  public void test488() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test488"); }


    int i2 = java.lang.Integer.min(33554432, 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);

  }

  @Test
  public void test489() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test489"); }


    tp2.IP iP4 = new tp2.IP((java.lang.Integer)1073741824, (java.lang.Integer)100000, (java.lang.Integer)(-1), (java.lang.Integer)1476395008);

  }

  @Test
  public void test490() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test490"); }


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
    boolean b29 = iP24.equals((java.lang.Object)3);
    
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
    org.junit.Assert.assertTrue(b29 == false);

  }

  @Test
  public void test491() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test491"); }


    java.lang.String str1 = java.lang.Integer.toUnsignedString((-1073741812));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "3221225484"+ "'", str1.equals("3221225484"));

  }

  @Test
  public void test492() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test492"); }


    tp2.IP iP4 = new tp2.IP((java.lang.Integer)1610612742, (java.lang.Integer)51, (java.lang.Integer)805306368, (java.lang.Integer)26);

  }

  @Test
  public void test493() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test493"); }


    int i2 = java.lang.Integer.max(5120, 44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 5120);

  }

  @Test
  public void test494() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test494"); }


    // The following exception was thrown during execution in test generation
    try {
      java.lang.Integer i1 = new java.lang.Integer("1100000000000000000000000000");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test495() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test495"); }


    tp2.Server server0 = new tp2.Server();
    boolean b1 = server0.exceptionsNotRepeated();
    tp2.ITime iTime2 = null;
    server0.setTime(iTime2);
    server0.update();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);

  }

  @Test
  public void test496() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test496"); }


    java.lang.Integer i1 = new java.lang.Integer(167772160);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i1 + "' != '" + 167772160+ "'", i1.equals(167772160));

  }

  @Test
  public void test497() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test497"); }


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
    org.junit.Assert.assertTrue(i20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);

  }

  @Test
  public void test498() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test498"); }


    long long1 = java.lang.Integer.toUnsignedLong((-1073741824));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == 3221225472L);

  }

  @Test
  public void test499() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test499"); }


    int i1 = java.lang.Integer.signum((-1073741812));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == (-1));

  }

  @Test
  public void test500() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test500"); }


    java.lang.String str1 = java.lang.Integer.toOctalString(201326592);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "1400000000"+ "'", str1.equals("1400000000"));

  }

}
