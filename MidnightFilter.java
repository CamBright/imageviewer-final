import java.awt.Color;

import java.util.List;
import java.util.ArrayList;
/**
 * This filter will take each pixel of an image and enhance the color blue value, and decrease the red and green value.
 *
 * @author Cameron Brightwell
 * @version 12/6/17
 */
public class MidnightFilter extends Filter
{
    /**
     * Constructor for objects of class EdgeFilter.
     * @param name The name of the filter.
     */
    public MidnightFilter(String name)
    {
        super(name);
    }

    /**
     * Apply the Midnight filter to any image.
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
                int green = pix.getGreen()/2;
                image.setPixel(x, y, new Color(red, green, pix.getBlue()));
            }
        }
    }
}
