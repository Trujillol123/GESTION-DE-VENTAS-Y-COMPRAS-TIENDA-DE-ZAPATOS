package TiendaZapatos;


import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GradientPaint;
import javax.swing.JPanel;

public class GradientPanel extends JPanel {
    
    private Color color1;
    private Color color2;

    // Default constructor (simplified)
    public GradientPanel() {
        try {
            this.color1 = Color.BLUE;
            this.color2 = Color.CYAN;
        } catch (Exception ex) {
            ex.printStackTrace(); // Log any exceptions
        }
    }

    // Paint method to apply the gradient
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        
        Graphics2D g2d = (Graphics2D) g;
        int width = getWidth();
        int height = getHeight();
        GradientPaint gp = new GradientPaint(0, 0, color1, width, height, color2);
        
        g2d.setPaint(gp);
        g2d.fillRect(0, 0, width, height);
    }
    
    // Basic getters and setters for colors
    public Color getColor1() {
        return color1;
    }

    public void setColor1(Color color1) {
        this.color1 = color1;
        repaint();
    }

    public Color getColor2() {
        return color2;
    }

    public void setColor2(Color color2) {
        this.color2 = color2;
        repaint();
    }
}
