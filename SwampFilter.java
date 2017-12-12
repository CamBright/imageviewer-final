import java.awt.Color;

import java.util.List;
import java.util.ArrayList;
/**
 * Write a description of class BlueFilter here.
 *
 * @author Cameron Brightwell
 * @version 12/6/17
 */
public class SwampFilter extends Filter
{
    /**
     * Constructor for objects of class EdgeFilter.
     * @param name The name of the filter.
     */
    public SwampFilter(String name)
    {
        super(name);
    }

    /**
     * Apply the Swamp filter to any image.
     * 
     * @param  image  The image that this filter will alter.
     */
    public void apply(OFImage image)
    {        
        int height = image.getHeight();
        int width = image.getWidth();
        for(int y = 0; y < height; y++) {
            for(int x = 0; x < width; x++) {
                Color pix = image.getPixel(x, y);
                int red = pix.getRed()/2;
                int blue = pix.getBlue()/3;
                image.setPixel(x, y, new Color(red, pix.getGreen(), blue));
            }
        }
    }
}
