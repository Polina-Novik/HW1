package by.teachmeskills.novik.lesson8.homework;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Client[] clients = getClients();
        for (Client client : clients) {
            Doctor doctor = DoctorFactory.getDoctorByMedicalPlan(client.getMedicalPlan());
            doctor.heal(client);
        }
    }

    private static Client[] getClients() { //это вынесли с ctrl alt M
        Scanner scanner = new Scanner(System.in);
        System.out.println("Set clients size");
        int size = scanner.nextInt();
        Client[] clients = new Client[size];
        for (int i = 0; i < size; i++) {
            clients[i] = getClient();
        }
        return clients;
    }

    private static Client getClient() {
       /* Random r=new Random();
        int nextValue=r.nextInt(4);*/
        System.out.println("Enter clients name");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        Client client = new Client(name);
        System.out.println("Choose your problem:\n1.I need a Surgeon\n2.I need a Dantist\n3.I need a Therapist");
        int nextValue = scanner.nextInt();
        client.setMedicalPlan(new MedicalPlan(nextValue));
        return client;
    }
}