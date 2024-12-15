import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import java.awt.Cursor;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.awt.Color;
import java.awt.RenderingHints;

public class SpiderCursorExample extends JFrame {

    public SpiderCursorExample() {
        // Create the spider cursor and apply it to this JFrame
        Cursor spiderCursor = createSpiderCursor();
        this.setCursor(spiderCursor);

        // Basic frame setup
        setTitle("Spider Cursor Example");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Center the frame
    }

    private Cursor createSpiderCursor() {
        // Create a 32x32 pixel transparent image for the cursor
        BufferedImage cursorImage = new BufferedImage(32, 32, BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2d = cursorImage.createGraphics();

        // Set antialiasing for smoother edges
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        // Draw spider legs (simple lines for illustration)
        g2d.setColor(Color.BLACK);
        g2d.drawLine(16, 8, 12, 4);  // Top-left leg
        g2d.drawLine(16, 8, 20, 4);  // Top-right leg
        g2d.drawLine(16, 16, 12, 28); // Bottom-left leg
        g2d.drawLine(16, 16, 20, 28); // Bottom-right leg

        // Draw spider body (simple circle for illustration)
        g2d.fillOval(12, 10, 8, 8); // Main body

        // Dispose graphics context to apply changes to the image
        g2d.dispose();

        // Create a custom cursor with the spider image and set its "hotspot" to the center
        return Toolkit.getDefaultToolkit().createCustomCursor(cursorImage, new Point(16, 16), "Spider Cursor");
    }

    public static void main(String[] args) {
        // Run the UI in the Event Dispatch Thread for thread safety
        SwingUtilities.invokeLater(() -> {
            SpiderCursorExample frame = new SpiderCursorExample();
            frame.setVisible(true);
        });
    }
}
