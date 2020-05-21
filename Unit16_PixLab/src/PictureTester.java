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
    Picture beach = new Picture("/Users/shayanazmoodeh/Documents/CS/apcsa/Unit16_PixLab/src/images/beach.jpg");
    beach.explore();
    beach.zeroBlue();
    beach.explore();
  }
  
  /** Method to test mirrorVertical */
  public static void testMirrorVertical()
  {
    Picture caterpillar = new Picture("/Users/shayanazmoodeh/Documents/CS/apcsa/Unit16_PixLab/src/images/caterpillar.jpg");
    caterpillar.explore();
    caterpillar.mirrorVertical();
    caterpillar.explore();
  }
  
  /** Method to test mirrorVerticalRightToLeft */
  public static void testMirrorVerticalRightToLeft()
  {
    Picture koala = new Picture("/Users/shayanazmoodeh/Documents/CS/apcsa/Unit16_PixLab/src/images/koala.jpg");
    koala.explore();
    koala.mirrorVerticalRightToLeft();
    koala.explore();
  }
  
  /** Method to test mirrorHorizontal */
  public static void testMirrorHorizontal()
  {
    Picture barbara = new Picture("/Users/shayanazmoodeh/Documents/CS/apcsa/Unit16_PixLab/src/images/barbaraS.jpg");
    barbara.explore();
    barbara.mirrorHorizontal();
    barbara.explore();
  }
  
  /** Method to test mirrorTemple */
  public static void testMirrorTemple()
  {
    Picture temple = new Picture("/Users/shayanazmoodeh/Documents/CS/apcsa/Unit16_PixLab/src/images/temple.jpg");
    temple.explore();
    temple.mirrorTemple();
    temple.explore();
  }

  /** Method to test MirrorDiagonal*/
  public static void testMirrorDiagonal()
  {
	  Picture beach = new Picture("/Users/shayanazmoodeh/Documents/CS/apcsa/Unit16_PixLab/src/images/beach.jpg");
	  beach.explore();
	  beach.mirrorDiagonal();
	  beach.explore();
  }
  
  /** Method to test the collage method */
  public static void testCollage()
  {
    Picture canvas = new Picture("/Users/shayanazmoodeh/Documents/CS/apcsa/Unit16_PixLab/src/images/640x480.jpg");
    canvas.createCollage();
    canvas.explore();
  }
  
  /** Method to test edgeDetection */
  public static void testEdgeDetection()
  {
    Picture swan = new Picture("/Users/shayanazmoodeh/Documents/CS/apcsa/Unit16_PixLab/src/images/swan.jpg");
    swan.explore();
    swan.edgeDetection(10);
    swan.explore();
  }
  
  /** Method to test keepOnlyBlue */
  public static void testKeepOnlyBlue()
  {
	Picture beach =  new Picture("/Users/shayanazmoodeh/Documents/CS/apcsa/Unit16_PixLab/src/images/beach.jpg"); 
	beach.explore();
	beach.keepOnlyBlue();
	beach.explore();
  }
  
  /** Method to test keepOnlyRed */
  public static void testKeepOnlyRed()
  {
	Picture beach =  new Picture("/Users/shayanazmoodeh/Documents/CS/apcsa/Unit16_PixLab/src/images/beach.jpg"); 
	beach.explore();
	beach.keepOnlyRed();
	beach.explore();
  }
  
  /** Method to test keepOnlyGreen */
  public static void testKeepOnlyGreen()
  {
	Picture beach =  new Picture("/Users/shayanazmoodeh/Documents/CS/apcsa/Unit16_PixLab/src/images/beach.jpg"); 
	beach.explore();
	beach.keepOnlyGreen();
	beach.explore();
  }
  
  public static void testOnlyRed()
  {
	  
  }
  
  /** Method to test Negate */
  public static void testNegate()
  {
	  Picture arch = new Picture("/Users/shayanazmoodeh/Documents/CS/apcsa/Unit16_PixLab/src/images/arch.jpg");
	  arch.explore();
	  arch.negate();
	  arch.explore();
  }
  
  /** Method to test Grayscale */
  public static void testGrayscale()
  {
	  Picture arch = new Picture("/Users/shayanazmoodeh/Documents/CS/apcsa/Unit16_PixLab/src/images/arch.jpg");
	  arch.explore();
	  arch.grayscale();
	  arch.explore();
  }
  
  /** Method to test fixUnderwater */
  public static void testFixUnderwater()
  {
	  Picture water = new Picture("/Users/shayanazmoodeh/Documents/CS/apcsa/Unit16_PixLab/src/images/water.jpg");
	  water.explore();
	  water.fixUnderwater();
	  water.explore();
  }
  
  /** Method to test mirrorArms */
  public static void testMirrorArms()
  {
	  Picture snowman = new Picture("/Users/shayanazmoodeh/Documents/CS/apcsa/Unit16_PixLab/src/images/snowman.jpg");  
	  snowman.explore();
	  snowman.mirrorArms();
	  snowman.explore();
  }
  
  /** Method to test mirrorGull */
  public static void testMirrorGull()
  {
	  Picture gull = new Picture("/Users/shayanazmoodeh/Documents/CS/apcsa/Unit16_PixLab/src/images/seagull.jpg");
	  gull.explore();
	  gull.mirrorGull();
	  gull.explore();
  }
  
  /** Method to test copy */
  public static void testCopy()
  {
	  Picture canvas = new Picture("/Users/shayanazmoodeh/Documents/CS/apcsa/Unit16_PixLab/src/images/640x480.jpg");
	  Picture beach =  new Picture("/Users/shayanazmoodeh/Documents/CS/apcsa/Unit16_PixLab/src/images/beach.jpg");
	  canvas.copy(beach, 0, 0, 0, 0, 200, 200);
	  beach.explore();
	  canvas.explore();
  }
  
  /** Main method for testing.  Every class can have a main
    * method in Java */
  public static void main(String[] args)
  {
    /* uncomment a call here to run a test
     and comment out the ones you don't want
     to run*/
    //testZeroBlue();
    //testKeepOnlyBlue();
    //testKeepOnlyRed();
    //testKeepOnlyGreen();
    //testNegate();
    //testGrayscale();
    //testFixUnderwater();
    //testMirrorVertical();
	//testMirrorVerticalRightToLeft();
	//testMirrorHorizontal();
    //testMirrorTemple();
    //testMirrorArms();
    //testMirrorGull();
    //testMirrorDiagonal();
    //testCollage();
    //testCopy();
    testEdgeDetection();
    //testEdgeDetection2();
    //testChromakey();
    //testEncodeAndDecode();
    //testGetCountRedOverValue(250);
    //testSetRedToHalfValueInTopHalf();
    //testClearBlueOverValue(200);
    //testGetAverageForColumn(0);
  }
}