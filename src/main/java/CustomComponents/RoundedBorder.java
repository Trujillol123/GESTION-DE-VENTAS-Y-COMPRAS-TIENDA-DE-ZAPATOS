package CustomComponents;

import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Insets;
import java.awt.RenderingHints;
import java.awt.Shape;
import java.awt.geom.RoundRectangle2D;
import javax.swing.border.LineBorder;

/* @author David Grijalba */

public class RoundedBorder extends LineBorder {

    private final int radius;

    public RoundedBorder(int radius) {
        super(Color.LIGHT_GRAY, 1);  // Borde de color gris claro y 1px de grosor
        this.radius = radius;
    }

    @Override
    public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {
        Graphics2D g2 = (Graphics2D) g.create();

         // Habilitar antialiasing para bordes y fondo suaves
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        // Crear el rectángulo redondeado para el fondo y el borde
        Shape round = new RoundRectangle2D.Float(x, y, width - 1, height - 1, radius, radius);

        // Clipping para que todo lo que se dibuje esté dentro del área redondeada
        g2.setClip(round);

        // Pintar el fondo redondeado
        g2.setColor(c.getBackground());
        g2.fill(round);

        // Deshabilitar el clip para pintar el borde por encima
        g2.setClip(null);

        // Pintar el borde redondeado
        g2.setColor(lineColor);
        g2.draw(round);

        g2.dispose();  // Liberar recursos gráficos
    }

    @Override
    public Insets getBorderInsets(Component c) {
        return new Insets(this.radius + 1, this.radius + 1, this.radius + 1, this.radius + 1);
    }

    @Override
    public boolean isBorderOpaque() {
        return false;
    }
}

