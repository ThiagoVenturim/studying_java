// Superclasse

 class Doctor {
    boolean worksAtHospital; // Corrigido: "wokrkAtHospital" -> "worksAtHospital"

    void treatPatient() {
        System.out.println("Médico está em atendimento.");
    }
}

// Subclasse
class FamilyDoctor extends Doctor {
    boolean makesHouseCalls;

    void giveAdvice() { // Corrigido: "giceAdice" -> "giveAdvice"
        System.out.println("Médico da família dando conselhos.");
    }
}

// Subclasse
class Surgeon extends Doctor {
    boolean performsSurgery;

    void performSurgery() {
        System.out.println("Cirurgião realizando cirurgia.");
    }
}

// Classe principal para teste
public class HerancaDoctor {
    public static void main(String[] args) {
        FamilyDoctor familyDoctor = new FamilyDoctor();
        familyDoctor.worksAtHospital = true;
        familyDoctor.makesHouseCalls = true;
        familyDoctor.treatPatient();
        familyDoctor.giveAdvice();

        Surgeon surgeon = new Surgeon();
        surgeon.worksAtHospital = true;
        surgeon.performsSurgery = true;
        surgeon.treatPatient();
        surgeon.performSurgery();
    }
}
