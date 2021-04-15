package ru.job4j.stream;

public class Engineer {
    private String name;

    private String surname;

    private byte age;

    private boolean experience;

    private String address;

    private int telephone;

    static class Builder {
        private String name;
        private String surname;
        private byte age;
        private boolean experience;

        Engineer.Builder buildName(String name) {
            this.name = name;
            return this;
        }

        Engineer.Builder buildSurname(String surname) {
            this.surname = surname;
            return this;
        }

        Engineer.Builder buildAge(byte age) {
            this.age = age;
            return this;
        }

        Engineer.Builder buildExperience(boolean activated) {
            this.experience = activated;
            return this;
        }

        Engineer build() {
            Engineer engineer = new Engineer();
            engineer.name = name;
            engineer.surname = surname;
            engineer.age = age;
            engineer.experience = experience;
            return engineer;
        }
    }

    public static void main(String[] args) {
        Engineer engineer = new Engineer.Builder().buildName("Andrey")
                .buildSurname("Batalov")
                .buildAge((byte) 37)
                .buildExperience(true)
                .build();
        System.out.println(engineer);
    }

    @Override
    public String toString() {
        return "Engineer{"
                + "name='" + name + '\''
                + ", surname='" + surname + '\''
                + ", age='" + age + '\''
                + ", experience=" + experience
                + '}';
    }
}
