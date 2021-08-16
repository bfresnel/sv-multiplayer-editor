package fr.bfr;

public enum SeasonEnum {
    WINTER("winter"),
    SPRING("spring"),
    SUMMER("summer"),
    FALL("fall");

    private String enumKey;

    SeasonEnum(String enumKey) {
        this.enumKey = enumKey;
    }

    public String getKey() {
        return enumKey;
    }
}
