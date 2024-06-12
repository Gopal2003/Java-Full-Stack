// package Priority Queue;

import java.util.Comparator;
import java.util.PriorityQueue;

public class EmergencyRoom {
    public static void main(String[] args) {
        PriorityQueue<Patient> patientQueue = new PriorityQueue<>(Comparator.comparing(Patient::getPriorty).reversed());

        //Adding Patient to the Queue

        patientQueue.add(new Patient("Aman","Headache",2));
        patientQueue.add(new Patient("Sajeev","Didn't Took Bath",5));
        patientQueue.add(new Patient("Rajeev","Heart Attack",3));
        patientQueue.add(new Patient("Kumar","Broken Arm",1));

        //Displaying All Patients in the Emergency Room
        for(Patient patient : patientQueue)
        {
            System.out.println(patient);
        }

        //Treating Patients in the Order of Priority
        System.out.println("Treating Patients: ");
        while (!patientQueue.isEmpty()) {
            Patient patient = patientQueue.poll(); // Pop as well as Display the top element.
            System.out.println("Treating : " + patient);
        }
    }
}
