package water.android.io.pattern_builder.example_2;

/**
 * https://github.com/iluwatar/java-design-patterns
 */
public final class Hero {
    private final String profession;
    private final String name;
    private final String hairType;
    private final String hairColor;
    private final String armor;
    private final String weapon;

    public Hero(Builder builder) {
        this.profession = builder.profession;
        this.name = builder.name;
        this.hairColor = builder.hairColor;
        this.armor = builder.armor;
        this.weapon = builder.weapon;
        this.hairType = builder.hairType;
    }

    public String getProfession() {
        return profession;
    }

    public String getName() {
        return name;
    }

    public String getHairType() {
        return hairType;
    }

    public String getHairColor() {
        return hairColor;
    }

    public String getArmor() {
        return armor;
    }

    public String getWeapon() {
        return weapon;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("This is a")
                .append(profession)
                .append(" named ")
                .append(name);
        if (hairColor != null || hairType != null) {
            sb.append(" with ");
            if (hairColor != null) {
                sb.append(hairColor).append(' ');
            }
            if (hairType != null) {
                sb.append(hairType).append(' ');
            }
        }
        if (armor != null) {
            sb.append(" wearing ").append(armor);
        }
        if (weapon != null) {
            sb.append(" and wielding a ").append(weapon);
        }
        sb.append('.');
        return sb.toString();
    }

    public static class Builder {
        private final String profession;
        private final String name;
        private String hairType;
        private String hairColor;
        private String armor;
        private String weapon;

        public Builder(String profession, String name) {
            this.profession = profession;
            this.name = name;
        }

        public Hero build() {
            return new Hero(this);
        }

        public Builder setHairType(String hairType) {
            this.hairType = hairType;
            return this;
        }

        public Builder setHairColor(String hairColor) {
            this.hairColor = hairColor;
            return this;
        }

        public Builder setArmor(String armor) {
            this.armor = armor;
            return this;
        }

        public Builder setWeapon(String weapon) {
            this.weapon = weapon;
            return this;
        }
    }
}
