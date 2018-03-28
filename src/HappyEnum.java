public enum HappyEnum {
    Moscow("московское счастье"),
    Piter("питерское счастье"),
    Something("хоть какое-то счастье"),
    Also("какое-нибудь счастье");

    private String translation;

    HappyEnum(String string) {
        this.translation = string;
    }
    public String getTranslation() {
        return this.translation;
    }
}


