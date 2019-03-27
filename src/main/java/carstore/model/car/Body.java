package carstore.model.car;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.util.Objects;

/**
 * TCar body bean.
 *
 * @author Aleksei Sapozhnikov (vermucht@gmail.com)
 * @version 0.1
 * @since 0.1
 */
@Embeddable
public class Body {
    /**
     * Logger.
     */
    @SuppressWarnings("unused")
    private static final Logger LOG = LogManager.getLogger(Body.class);
    /**
     * Body type (sedan, track, SUV)
     */
    @Column(name = "body_type")
    private String type;
    /**
     * Body color (black, white, red)
     */
    @Column(name = "body_color")
    private String color;

    /**
     * Creates new Body object.
     *
     * @param type  Body type.
     * @param color Body color.
     * @return New Body object with given parameters.
     */
    public static Body of(String type, String color) {
        return new Body()
                .setType(type)
                .setColor(color);
    }

    /* * * * * * * * * * * * * * * * * *
     * equals(), hashCode(), toString()
     * * * * * * * * * * * * * * * * * */

    /**
     * Object.equals() method override.
     *
     * @param o Other object.
     * @return <tt>true</tt> if this and given objects are equal, <tt>false</tt> if not.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Body body = (Body) o;
        return Objects.equals(type, body.type)
                && Objects.equals(color, body.color);
    }

    /**
     * Returns this object's hashcode.
     *
     * @return Object's hashcode.
     */
    @Override
    public int hashCode() {
        return Objects.hash(type, color);
    }

    /**
     * Returns current object state as String object.
     *
     * @return Current object state as String object.
     */
    @Override
    public String toString() {
        return String.format(
                "Body{type='%s', color='%s'}",
                this.type, this.color);
    }

    /* * * * * * * * * * * *
     * getters and setters
     * * * * * * * * * * * */

    /**
     * Returns type.
     *
     * @return Value of type field.
     */
    public String getType() {
        return this.type;
    }

    /**
     * Sets type value.
     *
     * @param type Value to set.
     */
    public Body setType(String type) {
        this.type = type;
        return this;
    }

    /**
     * Returns color.
     *
     * @return Value of color field.
     */
    public String getColor() {
        return this.color;
    }

    /**
     * Sets color value.
     *
     * @param color Value to set.
     */
    public Body setColor(String color) {
        this.color = color;
        return this;
    }
}