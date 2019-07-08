public enum InfoEnum {
    ON_TIME ("On time"),
    DELAYED ("Delayed"),
    CANCELED ("Canceled");

    private String displayName;

    InfoEnum(String displayName) {
        this.displayName = displayName;
    }

    public String displayName() { return displayName; }

    @Override
    public String toString() { return displayName; }
}
