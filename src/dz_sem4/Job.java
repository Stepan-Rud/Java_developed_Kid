package dz_sem4;

public class Job {
    private String name;
    private Integer tabelNumber;
    private Integer phoneNumber;
    private Integer experience;

    public Job(String name, Integer tabelNumber, Integer phoneNumber, Integer experience) {
        this.name = name;
        this.tabelNumber = tabelNumber;
        this.phoneNumber = phoneNumber;
        this.experience = experience;
    }

    @Override
    public String toString() {
        return "Job{" +
                "name='" + name + '\'' +
                ", tabelNumber=" + tabelNumber +
                ", phoneNumber=" + phoneNumber +
                ", experience=" + experience +
                '}';
    }

    public String getName() {
        return name;
    }

    public Integer getTabelNumber() {
        return tabelNumber;
    }

    public Integer getPhoneNumber() {
        return phoneNumber;
    }

    public Integer getExperience() {
        return experience;
    }
}
