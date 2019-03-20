package carstore.constants;

public enum ServletContextAttributes {
    SESSION_FACTORY("sessionFactory");

    private final String value;

    ServletContextAttributes(String value) {
        this.value = value;
    }

    /**
     * Returns value.
     *
     * @return Value of value field.
     */
    public String v() {
        return this.value;
    }
}