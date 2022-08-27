package by.teachmeskills.novik.lesson8.homework;

public class DoctorFactory { //паттерн фабрика
    public static Doctor getDoctorByMedicalPlan(MedicalPlan medicalPlan) {
        if (medicalPlan.getCode() > 2) {
            return new Therapist();
        }
        if (medicalPlan.getCode() == 2) {
            return new Dantist();
        }
        return new Surgeon();
    }

}
