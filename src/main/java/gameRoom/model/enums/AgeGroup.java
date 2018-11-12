package gameRoom.model.enums;


public enum AgeGroup {
    BABY("1-12 month"),
    CHILD("1-6 years"),
    KID("7-14"),
    TEENAGER("more than 14"),
    ANY("any age");

    private String ageRange;

    AgeGroup(String ageRange) {
        this.ageRange= ageRange;
    }

    public String getAgeRange() {
        return ageRange;
    }

}