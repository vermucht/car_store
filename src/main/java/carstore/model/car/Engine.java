package carstore.model.car;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.persistence.*;
import java.util.Objects;

/**
 * Item engine bean.
 *
 * @author Aleksei Sapozhnikov (vermucht@gmail.com)
 * @version 0.1
 * @since 0.1
 */
@Entity
@Table(name = "engine")
public class Engine {
    /**
     * Logger.
     */
    @SuppressWarnings("unused")
    private static final Logger LOG = LogManager.getLogger(Engine.class);

    /**
     * Unique id.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "engine_id")
    private long id;

    /**
     * Engine type (gasoline, kerosene, gas)
     */
    @Column(name = "engine_type")
    private String engineType;
    /**
     * Engine volume, liters (1.2)
     */
    @Column(name = "engine_volume")
    private int engineVolume;

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
        Engine engine = (Engine) o;
        return id == engine.id
                && engineVolume == engine.engineVolume
                && Objects.equals(engineType, engine.engineType);
    }

    /**
     * Returns this object's hashcode.
     *
     * @return Object's hashcode.
     */
    @Override
    public int hashCode() {
        return Objects.hash(id, engineType, engineVolume);
    }

    /**
     * Returns current object state as String object.
     *
     * @return Current object state as String object.
     */
    @Override
    public String toString() {
        return String.format(
                "Engine{id=%d, engineType='%s', engineVolume=%d}",
                this.id, this.engineType, this.engineVolume);
    }

    /* * * * * * * * * * * *
     * getters and setters
     * * * * * * * * * * * */

    /**
     * Returns id.
     *
     * @return Value of id field.
     */
    public long getId() {
        return this.id;
    }

    /**
     * Sets id value.
     *
     * @param id Value to set.
     */
    public Engine setId(long id) {
        this.id = id;
        return this;
    }

    /**
     * Returns engineType.
     *
     * @return Value of engineType field.
     */
    public String getEngineType() {
        return this.engineType;
    }

    /**
     * Sets engineType value.
     *
     * @param engineType Value to set.
     */
    public Engine setEngineType(String engineType) {
        this.engineType = engineType;
        return this;
    }

    /**
     * Returns engineVolume.
     *
     * @return Value of engineVolume field.
     */
    public int getEngineVolume() {
        return this.engineVolume;
    }

    /**
     * Sets engineVolume value.
     *
     * @param engineVolume Value to set.
     */
    public Engine setEngineVolume(int engineVolume) {
        this.engineVolume = engineVolume;
        return this;
    }
}