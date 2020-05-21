import java.awt.*;
import java.awt.font.*;
import java.awt.geom.*;
import java.awt.image.BufferedImage;
import java.text.*;
import java.util.*;
import java.util.List; // resolves problem with java.awt.List and java.util.List

/**
 * A class that represents a picture.  This class inherits from 
 * SimplePicture and allows the student to add functionality to
 * the Picture class.  
 * 
 * @author Barbara Ericson ericson@cc.gatech.edu
 */
public class Picture extends SimplePicture 
{
  ///////////////////// constructors //////////////////////////////////
  
  /**
   * Constructor that takes no arguments 
   */
  public Picture ()
  {
    /* not needed but use it to show students the implicit call to super()
     * child constructors always call a parent constructor 
     */
    super();  
  }
  
  /**
   * Constructor that takes a file name and creates the picture 
   * @param fileName the name of the file to create the picture from
   */
  public Picture(String fileName)
  {
    // let the parent class handle this fileName
    super(fileName);
  }
  
  /**
   * Constructor that takes the width and height
   * @param height the height of the desired picture
   * @param width the width of the desired picture
   */
  public Picture(int height, int width)
  {
    // let the parent class handle this width and height
    super(width,height);
  }
  
  /**
   * Constructor that takes a picture and creates a 
   * copy of that picture
   * @param copyPicture the picture to copy
   */
  public Picture(Picture copyPicture)
  {
    // let the parent class do the copy
    super(copyPicture);
  }
  
  /**
   * Constructor that takes a buffered image
   * @param image the buffered image to use
   */
  public Picture(BufferedImage image)
  {
    super(image);
  }
  
  ////////////////////// methods ///////////////////////////////////////
  
  /**
   * Method to return a string with information about this picture.
   * @return a string with information about the picture such as fileName,
   * height and width.
   */
  public String toString()
  {
    String output = "Picture, filename " + getFileName() + 
      " height " + getHeight() 
      + " width " + getWidth();
    return output;
    
  }
  
  /** Method to set the blue to 0 */
  public void zeroBlue()
  {
    Pixel[][] pixels = this.getPixels2D();
    for (Pixel[] rowArray : pixels)
    {
      for (Pixel pixelObj : rowArray)
      {
        pixelObj.setBlue(0);
      }
    }
  }
  
  /** Method to set red to 0 */
  public void zeroRed()
  {
	  Pixel[][] pixels = this.getPixels2D();
	  for (Pixel[] rowArray : pixels)
	  {
	    for (Pixel pixelObj : rowArray)
	    {
	    	pixelObj.setRed(0);
	    }	
	  }
  }
  
  /** Method to set green to 0 */
  public void zeroGreen()
  {
	  Pixel[][] pixels = this.getPixels2D();
	  for(Pixel[] row : pixels)
	  {
		  for(Pixel pixelObj : row)
		  {
			  pixelObj.setGreen(0);
		  }
	  }
  }
  
  /** Method to set red and green pixels to 0 */
  public void keepOnlyBlue()
  {
	  zeroRed();
	  zeroGreen();
  }
  
  /** Method to set blue and green pixels to 0 */
  public void keepOnlyRed()
  {
	  zeroBlue();
	  zeroGreen();
  }
  
  /** Method to set red and blue pixels to 0 */
  public void keepOnlyGreen()
  {
	  zeroRed();
	  zeroBlue();
  }
  
  /** Method to negate colors of pixels */
  public void negate() 
  {
	  Pixel[][] pixels = this.getPixels2D();
	  for(Pixel[] row : pixels)
	  {
		  for(Pixel pixelObj : row)
		  {
			  pixelObj.setBlue(255 - pixelObj.getBlue());
			  pixelObj.setRed(255 - pixelObj.getRed());
			  pixelObj.setGreen(255 - pixelObj.getGreen());
		  }
	  }
  }
  
  /** Method to convert pixels to grayscale */
  public void grayscale() 
  {
	  Pixel[][] pixels = this.getPixels2D();
	  for(Pixel[] row : pixels)
	  {
		  for(Pixel pixelObj : row)
		  {
			  pixelObj.makeGrayscale();
		  }
	  }
  }
  
  /** Method to make fish more visible under water */
  public void fixUnderwater()
  {
	  Pixel[][] pixels = this.getPixels2D();
	  for(Pixel[] row : pixels)
	  {
		  for(Pixel pixelObj : row)
		  {
			int red = Math.abs(pixelObj.getRed() - 21);
			int blue = Math.abs(pixelObj.getBlue() - 173);
			int green = Math.abs(pixelObj.getGreen() - 163);
			
			if((red + green + blue) > 21)
			{
				pixelObj.makeBlack();
			}
		  }
	  }
  }
  
  /** Method that mirrors the picture around a 
    * vertical mirror in the center of the picture
    * from left to right */
  public void mirrorVertical()
  {
    Pixel[][] pixels = this.getPixels2D();
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    int width = pixels[0].length;
    for (int row = 0; row < pixels.length; row++)
    {
      for (int col = 0; col < width / 2; col++)
      {
        leftPixel = pixels[row][col];
        rightPixel = pixels[row][width - 1 - col];
        rightPixel.setColor(leftPixel.getColor());
      }
    } 
  }
  
  /** Method that mirrors the picture around a 
   * vertical mirror in the center of the picture
   * from right to left */
 public void mirrorVerticalRightToLeft()
 {
   Pixel[][] pixels = this.getPixels2D();
   Pixel leftPixel = null;
   Pixel rightPixel = null;
   int width = pixels[0].length;
   for(int row = 0; row < pixels.length; row++)
   {
     for(int col = width - 1; col >= width / 2; col--)
     {
       rightPixel = pixels[row][col];
       leftPixel = pixels[row][width - col - 1];
       leftPixel.setColor(rightPixel.getColor());
     }
   } 
 }
  
  /** Method that mirrors the picture around a 
   * horizontal mirror in the center of the picture
   * from top to bottom */
 public void mirrorHorizontal()
 {
   Pixel[][] pixels = this.getPixels2D();
   Pixel topPixel = null;
   Pixel bottomPixel = null;
   int width = pixels[0].length;
   for (int col = 0; col < width; col++)
   {
     for (int row = 0; row < pixels.length / 2; row++)
     {
       topPixel = pixels[row][col];
       bottomPixel = pixels[pixels.length - 1 - row][col];
       bottomPixel.setColor(topPixel.getColor());
     }
   } 
 }
  
 /** Method that mirrors a picture around a 
  * diagonal mirror. Like folding piece of paper
  * from bottom left to top right corner. */
 public void mirrorDiagonal()
 {
	 Pixel[][] pixels = this.getPixels2D();
	 Pixel leftPixel, rightPixel;
	 for(int row = 0; row < pixels.length; row++)
	 {
		 for(int col = 0; col < row; col++)
		 {
			 leftPixel = pixels[row][col];
			 rightPixel = pixels[col][row];
			 rightPixel.setColor(leftPixel.getColor());
		 }
	 }
 }
 
  /** Mirror just part of a picture of a temple */
  public void mirrorTemple()
  {
    int mirrorPoint = 276;
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    int count = 0;
    Pixel[][] pixels = this.getPixels2D();
    
    // loop through the rows
    for (int row = 27; row < 97; row++)
    {
      // loop from 13 to just before the mirror point
      for (int col = 13; col < mirrorPoint; col++)
      {
        
        leftPixel = pixels[row][col];      
        rightPixel = pixels[row]                       
                         [mirrorPoint - col + mirrorPoint];
        rightPixel.setColor(leftPixel.getColor());
      }
    }
  }
  
  /** Mirror arm of snowman to make him have 4 arms */
  public void mirrorArms()
  {
	  int horMirrorPoint = 192;
	  int vertMirrorPoint = 169;
	  Pixel topPixel, bottomPixel;
	  Pixel[][] pixels = this.getPixels2D();
	  //loop for left arm
	  for(int row = 157; row < horMirrorPoint; row++)
	  {
		  for(int col = 103; col < vertMirrorPoint; col++)
		  {
			  topPixel = pixels[row][col];
			  bottomPixel = pixels[horMirrorPoint - row + horMirrorPoint][col];
			  bottomPixel.setColor(topPixel.getColor());
		  }
	  }
	  //loop for right arm
	  horMirrorPoint = 197;
	  vertMirrorPoint = 292;
	  for(int row = 172; row < horMirrorPoint; row++)
	  {
		  for(int col = 238; col < vertMirrorPoint; col++)
		  {
			  topPixel = pixels[row][col];
			  bottomPixel = pixels[horMirrorPoint - row + horMirrorPoint][col];
			  bottomPixel.setColor(topPixel.getColor());
		  }
	  }
  }
  
  /** Reflects Seagull to have 2 gulls on the beach */
  public void mirrorGull()
  {
	  int vertMirrorPoint = 345;
	  Pixel leftPixel, rightPixel;
	  Pixel[][] pixels = this.getPixels2D();
	  for(int row = 236; row < 322; row++)
	  {
		  for(int col = 236; col < vertMirrorPoint; col++)
		  {
			  leftPixel = pixels[row][col];
			  rightPixel = pixels[row][vertMirrorPoint - col + vertMirrorPoint];
			  rightPixel.setColor(leftPixel.getColor());
		  }
	  }
  }
  
  /** copy from the passed fromPic to the
    * specified startRow and startCol in the
    * current picture
    * @param fromPic the picture to copy from
    * @param startRow the start row to copy to
    * @param startCol the start col to copy to
    */
  public void copy(Picture fromPic, 
                 int startRow, int startCol)
  {
    Pixel fromPixel = null;
    Pixel toPixel = null;
    Pixel[][] toPixels = this.getPixels2D();
    Pixel[][] fromPixels = fromPic.getPixels2D();
    for (int fromRow = 0, toRow = startRow; 
         fromRow < fromPixels.length &&
         toRow < toPixels.length; 
         fromRow++, toRow++)
    {
      for (int fromCol = 0, toCol = startCol; 
           fromCol < fromPixels[0].length &&
           toCol < toPixels[0].length;  
           fromCol++, toCol++)
      {
        fromPixel = fromPixels[fromRow][fromCol];
        toPixel = toPixels[toRow][toCol];
        toPixel.setColor(fromPixel.getColor());
      }
    }   
  }
  
  /** copy method that has parameters
   * to choose what part of original image to copy
   * @param toStartRow row to start copying to in output picture
   * @param toStartCol col to start copying to in output picture
   * @param fromStartRow row to start copying from in input picture
   * @param fromStartCol col to start copying from in input picture
   * @param fromEndRow row to copy up to (not inclusive) from input picture
   * @param fromEndCol col to copy up to (not inclusive) from input picture
   */

  public void copy(Picture fromPic, 
		  int toStartRow, int toStartCol, int fromStartRow, int fromStartCol,
		  int fromEndRow, int fromEndCol)
  {
	  Pixel fromPixel = null;
	  Pixel toPixel = null;
	  Pixel[][] toPixels = this.getPixels2D();
	  Pixel[][] fromPixels = fromPic.getPixels2D();
	  for (int fromRow = fromStartRow, toRow = toStartRow; 
	       fromRow < fromEndRow &&
	       toRow < toPixels.length; 
			  fromRow++, toRow++)
	  {
	    for (int fromCol = fromStartCol, toCol = toStartCol; 
	    		fromCol < fromEndCol &&
	    		toCol < toPixels[0].length;  
	    		fromCol++, toCol++)
	    {
	    	fromPixel = fromPixels[fromRow][fromCol];
	    	toPixel = toPixels[toRow][toCol];
	    	toPixel.setColor(fromPixel.getColor());
	    }
	  } 
  }
  
  /** Method to create a collage of several pictures */
  public void createCollage()
  {
    Picture flower1 = new Picture("/Users/shayanazmoodeh/Documents/CS/apcsa/Unit16_PixLab/src/images/flower1.jpg");
    Picture flower2 = new Picture("/Users/shayanazmoodeh/Documents/CS/apcsa/Unit16_PixLab/src/images/flower2.jpg");
    this.copy(flower1,0,0);
    this.copy(flower2,100,0);
    this.copy(flower1,200,0);
    Picture flowerNoBlue = new Picture(flower2);
    flowerNoBlue.zeroBlue();
    this.copy(flowerNoBlue,300,0);
    this.copy(flower1,400,0);
    this.copy(flower2,500,0);
    this.mirrorVertical();
    this.write("collage.jpg");
  }
  
  
  /** Method to show large changes in color 
    * @param edgeDist the distance for finding edges
    */
  public void edgeDetection(int edgeDist)
  {
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    Pixel[][] pixels = this.getPixels2D();
    Color rightColor = null;
    for (int row = 0; row < pixels.length; row++)
    {
      for (int col = 0; 
           col < pixels[0].length-1; col++)
      {
        leftPixel = pixels[row][col];
        rightPixel = pixels[row][col+1];
        rightColor = rightPixel.getColor();
        if (leftPixel.colorDistance(rightColor) > 
            edgeDist)
          leftPixel.makeBlack();
        else
          leftPixel.makeWhite();
      }
    }
    Pixel topPixel, bottomPixel;
    Color bottomColor;
    for(int row = 0; row < pixels.length - 1; row++)
    {
    	for(int col = 0; col < pixels[0].length; col++)
    	{
    		topPixel = pixels[row][col];
    		bottomPixel = pixels[row+1][col];
    		bottomColor = bottomPixel.getColor();
    		if(topPixel.colorDistance(bottomColor) > edgeDist)
    			topPixel.makeBlack();
    		else
    			leftPixel.makeWhite();
    	}
    }
  }
  
  
  /* Main method for testing - each class in Java can have a main 
   * method 
   */
  public static void main(String[] args) 
  {
    Picture beach = new Picture("/Users/shayanazmoodeh/Documents/CS/apcsa/Unit16_PixLab/src/images/beach.jpg");
    beach.explore();
    beach.zeroBlue();
    beach.explore();
  }
  
} // this } is the end of class Picture, put all new methods before this
