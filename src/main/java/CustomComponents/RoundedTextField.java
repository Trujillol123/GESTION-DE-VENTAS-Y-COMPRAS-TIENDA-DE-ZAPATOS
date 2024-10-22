package CustomComponents;

/* @author David Grijalba */

import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.geom.RoundRectangle2D;
import java.beans.PropertyChangeSupport;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

public class RoundedTextField extends JTextField {

    private PropertyChangeSupport pcs;
    private int topLeftRadius;
    private int topRightRadius;
    private int bottomLeftRadius;
    private int bottomRightRadius;
    
    // Border color properties
    private Color borderColor = Color.BLACK; // Default border color
    private Color focusedBorderColor = Color.BLUE; // Default focused border color
    private boolean isFocused = false; // Track focus state

    // Default constructor
    public RoundedTextField() {
        super();  // Always call the superclass constructor
        init();   // Initialize the component
    }

    // Constructor with text
    public RoundedTextField(String text) {
        super(text); // Call superclass constructor with text
        init();   // Initialize the component
    }

    // Constructor with text and columns
    public RoundedTextField(String text, int columns) {
        super(text, columns); // Call superclass constructor with text and columns
        init();   // Initialize the component
    }

    // Initialize method to set up PropertyChangeSupport and default values
    private void init() {
        pcs = new PropertyChangeSupport(this);  // Initialize pcs here
        setBorder(new EmptyBorder(5, 10, 5, 10));
        setOpaque(false); // Make background transparent
        topLeftRadius = 20;
        topRightRadius = 20;
        bottomLeftRadius = 20;
        bottomRightRadius = 20;

        // Add focus listener to handle border color on focus
        addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                isFocused = true;
                repaint();
            }

            @Override
            public void focusLost(FocusEvent e) {
                isFocused = false;
                repaint();
            }
        });
    }

    @Override
    protected void paintComponent(Graphics g) {
        // Create a Graphics2D object for smoother rendering
        Graphics2D g2d = (Graphics2D) g.create();
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        // Fill the background with a rounded shape
        g2d.setColor(getBackground());
        g2d.fill(createRoundedShape()); // Fill with rounded shape

        // Call to super to handle text painting
        super.paintComponent(g2d);

        // Draw the border
        g2d.setColor(isFocused ? focusedBorderColor : borderColor);
        g2d.draw(createRoundedShape());
        g2d.dispose(); // Dispose of the graphics object
    }

    private RoundRectangle2D createRoundedShape() {
        return new RoundRectangle2D.Double(0, 0, getWidth() - 1, getHeight() - 1,
                Math.max(topLeftRadius, topRightRadius),
                Math.max(bottomLeftRadius, bottomRightRadius));
    }

    // Getters and setters for border colors
    public Color getBorderColor() {
        return borderColor;
    }

    public void setBorderColor(Color borderColor) {
        Color oldValue = this.borderColor;
        this.borderColor = borderColor;
        pcs.firePropertyChange("borderColor", oldValue, borderColor);
        repaint();
    }

    public Color getFocusedBorderColor() {
        return focusedBorderColor;
    }

    public void setFocusedBorderColor(Color focusedBorderColor) {
        Color oldValue = this.focusedBorderColor;
        this.focusedBorderColor = focusedBorderColor;
        pcs.firePropertyChange("focusedBorderColor", oldValue, focusedBorderColor);
        repaint();
    }

    // Setters and getters for corner radius with PropertyChangeSupport
    public void setTopLeftRadius(int radius) {
        int oldValue = this.topLeftRadius;
        this.topLeftRadius = radius;
        pcs.firePropertyChange("topLeftRadius", oldValue, radius);
        repaint();
    }

    public void setTopRightRadius(int radius) {
        int oldValue = this.topRightRadius;
        this.topRightRadius = radius;
        pcs.firePropertyChange("topRightRadius", oldValue, radius);
        repaint();
    }

    public void setBottomLeftRadius(int radius) {
        int oldValue = this.bottomLeftRadius;
        this.bottomLeftRadius = radius;
        pcs.firePropertyChange("bottomLeftRadius", oldValue, radius);
        repaint();
    }

    public void setBottomRightRadius(int radius) {
        int oldValue = this.bottomRightRadius;
        this.bottomRightRadius = radius;
        pcs.firePropertyChange("bottomRightRadius", oldValue, radius);
        repaint();
    }
}
