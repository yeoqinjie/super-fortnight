package shape;

public class Rectangle extends ShapeBase implements RectangleInterface
{
    private int height;
    private int width;
    
    public Rectangle( )
    {
        super();
        setHeight(0);
        setWidth(0);
    }
    
    public Rectangle(int offset, int height, int width)
    {
        super(offset);
        setHeight(height);
        setWidth(width);
    }
    
    public void set(int height, int width)
    {
        setHeight(height);
        setWidth(width);
    }
    
    /**
     Draws the figure at the current line.
    */
    public void drawHere( )
    {
        drawHorizontalLine( );
        drawSides( );
        drawHorizontalLine( );
    }

    private void drawHorizontalLine( )
    {
        skipSpaces(getOffset( )); 
        for (int count = 0; count < width; count++)
            System.out.print('-');
        System.out.println( );        
    }
    
    private void drawSides( )
    {
        for (int count = 0; count < (height - 2); count++)
            drawOneLineOfSides( );
    }
    
    private void drawOneLineOfSides( )
    {
        skipSpaces(getOffset( )); 
        System.out.print('|');
        skipSpaces(width - 2);        
        System.out.println('|');
    }
    
    //Writes the indicated number of spaces.
    private static void skipSpaces(int number)
    {
        for (int count = 0; count < number; count++)
            System.out.print(' ');
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }
}



