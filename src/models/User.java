package models;

public class User {
    int score;
    String name;
    String country;

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public User(int score, String name, String country) {
        this.score = score;
        this.name = name;
        this.country = country;
    }

    @Override
    public String toString() {
        return "User{" +
                "score=" + score +
                ", name='" + name + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}
