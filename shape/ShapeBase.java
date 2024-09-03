package shape;

public abstract class ShapeBase implements ShapeInterface
{
    private int offset; 
    
    public ShapeBase( )
    {
        setOffset(0);
    }

    public ShapeBase(int offset)
    {
        setOffset(offset);
    }

    public abstract void drawHere( );

    public void drawAt(int lineNumber)
    {
        for (int count = 0; count < lineNumber; count++)
            System.out.println( ); 
        drawHere( );
    } 
    
    public void setOffset(int offset)
    {
        this.offset = offset;
    }

    public int getOffset( )
    {
        return offset;
    }
}
