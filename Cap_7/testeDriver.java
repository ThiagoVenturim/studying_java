abstract class Report{
     void runReport() {
         System.out.println("Running report...");
     }
        void printReport() {
            System.out.println("Saving report...");
        }
}

class BuzzWordReport extends Report {
    void runReport() {
        super.runReport();
        BuzzWordCompliance();
        printReport();
    }

    void BuzzWordCompliance() {
        System.out.println("Checking buzzword compliance...");
    }
}

public class testeDriver {
    public static void main(String[] args) {
        BuzzWordReport buzzWordReport = new BuzzWordReport();
        buzzWordReport.runReport();
    }
}