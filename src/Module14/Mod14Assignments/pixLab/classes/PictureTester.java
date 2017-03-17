package Module14.Mod14Assignments.pixLab.classes;
/**
 * This class contains class (static) methods
 * that will help you test the Picture class 
 * methods.  Uncomment the methods and the code
 * in the main to test.
 * 
 * @author Barbara Ericson 
 */
public class PictureTester
{
  /** Method to test zeroBlue */
  public static void testZeroBlue()
  {
    Picture beach = new Picture("D:\\Repositories\\APCS_Course_Files\\src\\Module14\\Mod14Assignments\\pixLab\\images\\beach.jpg");
    beach.explore();
    beach.zeroBlue();
    beach.explore();
  }
  
  /** Method to test mirrorVertical */
  public static void testMirrorVertical()
  {
    Picture caterpillar = new Picture("D:\\Repositories\\APCS_Course_Files\\src\\Module14\\Mod14Assignments\\pixLab\\images\\caterpillar.jpg");
    caterpillar.explore();
    caterpillar.mirrorVertical();
    caterpillar.explore();
  }
  
  /** Method to test mirrorTemple */
  public static void testMirrorTemple()
  {
    Picture temple = new Picture("D:\\Repositories\\APCS_Course_Files\\src\\Module14\\Mod14Assignments\\pixLab\\images\\temple.jpg");
    temple.explore();
    temple.mirrorTemple();
    temple.explore();
  }
  
  /** Method to test the collage method */
  public static void testCollage()
  {
    Picture canvas = new Picture("D:\\Repositories\\APCS_Course_Files\\src\\Module14\\Mod14Assignments\\pixLab\\images\\640x480.jpg");
    canvas.createCollage();
    canvas.explore();
  }
  
  /** Method to test edgeDetection */
  public static void testEdgeDetection()
  {
    Picture swan = new Picture("D:\\Repositories\\APCS_Course_Files\\src\\Module14\\Mod14Assignments\\pixLab\\images\\swan.jpg");
    swan.edgeDetection(10);
    swan.explore();
  }

  public static void testBlueOnly()
    {
      Picture beack = new Picture("D:\\Repositories\\APCS_Course_Files\\src\\Module14\\Mod14Assignments\\pixLab\\images\\beach.jpg");
      beack.explore();
      beack.keepONlyBlue();
      beack.explore();
    }

  public static void testNegate()
    {
      Picture beach = new Picture("D:\\Repositories\\APCS_Course_Files\\src\\Module14\\Mod14Assignments\\pixLab\\images\\beach.jpg");
      beach.explore();
      beach.negate();
      beach.explore();
    }

  public static void testGrayScale()
    {
      Picture beach = new Picture("D:\\Repositories\\APCS_Course_Files\\src\\Module14\\Mod14Assignments\\pixLab\\images\\beach.jpg");
      beach.explore();
      beach.grayScale();
      beach.explore();
    }

  public static void testMirrorRightToLeft()
    {
      Picture beach = new Picture("D:\\Repositories\\APCS_Course_Files\\src\\Module14\\Mod14Assignments\\pixLab\\images\\beach.jpg");
      beach.explore();
      beach.mirrorVerticalRightToLeft();
      beach.explore();
    }

  public static void testMirrorArms()
    {
      Picture snowman = new Picture("D:\\Repositories\\APCS_Course_Files\\src\\Module14\\Mod14Assignments\\pixLab\\images\\snowman.jpg");
      snowman.explore();
      snowman.mirrorArms();
    }

  public static void testMirrorGulls()
    {
      Picture seagulls = new Picture("D:\\Repositories\\APCS_Course_Files\\src\\Module14\\Mod14Assignments\\pixLab\\images\\seagull.jpg");
      seagulls.explore();
      seagulls.mirrorGulls();
      seagulls.explore();
    }

  /** Main method for testing.  Every class can have a main
    * method in Java */
  public static void main(String[] args)
  {
    // uncomment a call here to run a test
    // and comment out the ones you don't want
    // to run
    //testZeroBlue();
    //testBlueOnly();
    //testNegate();
    //testGrayScale();
    //testMirrorRightToLeft();
    //testMirrorArms();
    //testMirrorGulls();
    //testKeepOnlyBlue();
    //testKeepOnlyRed();
    //testKeepOnlyGreen();
    //testNegate();
    //testGrayscale();
    //testFixUnderwater();
    //testMirrorVertical();
    testMirrorTemple();
    //testMirrorArms();
    //testMirrorGull();
    //testMirrorDiagonal();
    //testCollage();
    //testCopy();
    //testEdgeDetection();
    //testEdgeDetection2();
    //testChromakey();
    //testEncodeAndDecode();
    //testGetCountRedOverValue(250);
    //testSetRedToHalfValueInTopHalf();
    //testClearBlueOverValue(200);
    //testGetAverageForColumn(0);
  }
}