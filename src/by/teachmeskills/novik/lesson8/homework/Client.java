package by.teachmeskills.novik.lesson8.homework;

public class Client {
    private MedicalPlan medicalPlan;
    private String name;

    public MedicalPlan getMedicalPlan() {
        return medicalPlan;
    }

    public void setMedicalPlan(MedicalPlan medicalPlan) {
        this.medicalPlan = medicalPlan;
    }

    public Client(String name) {//жмем геттер сеттер
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
}
