
package cs1302.shapes;

/**
 * This class represents an abstract shape.
 */
public abstract class Shape {

    /** The name of the shape. */
    private String name;

    /**
     * Sets the name of the shape. 
     *
     * @param name the name of the shape
     * @throws NullPointerException if {@code name} is {@code null}
     * @throws IllegalArgumentException if {@code name} is an empty string
     */
    public Shape(String name) {
        setName(name);    
    } // Shape
    
    /**
     * Sets the name of the shape. This method imposes certain preconditions on the value of
     * {@code name}. If a precondition is violated, then an unchecked exception is thrown.
     *
     * @param name the name of the shape
     * @throws NullPointerException if {@code name} is {@code null}
     * @throws IllegalArgumentException if {@code name} is an empty string
     */
    public void setName(String name) {
        if (name == null) {
            throw new NullPointerException("name cannot be null");
        } else if (name.isEmpty()) {
            throw new IllegalArgumentException("name cannot be an empty string");
        } else {
            this.name = name;
        } // if
    } // setName

    /**
     * Returns the name of this shape.
     *
     * @return the name of this shape
     */
    public String getName() {
        return name;
    } // getName

    /**
     * Returns the area of this shape.
     *
     * @return the area of this shape
     */
    public abstract double getArea();

    /**
     * Returns the perimeter of this shape. Formally, this method returns the length of the
     * continuous line forming the boundary of this shape.
     *
     * @return the perimeter of this shape
     */
    public abstract double getPerimeter();

} // Shape
