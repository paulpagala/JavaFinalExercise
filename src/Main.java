import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        ApplicationService applicationService = new ApplicationService();
        Applicant applicant1 = new Applicant();
        applicant1.setFullName("Pj");
        applicant1.setDateOfBirth(LocalDate.of(1998,1,10));
        applicant1.setHasChildren(false);
        applicant1.setMaritalStatus(MaritalStatus.SINGLE);
        applicant1.setPassportExpiryDate(LocalDate.of(2025,1,10));
        applicant1.setPassportIssueDate(LocalDate.of(2021,1,10));

        Applicant applicant2 = new Applicant();
        applicant2.setFullName("Nica");
        applicant2.setDateOfBirth(LocalDate.of(1994,1,10));
        applicant2.setHasChildren(false);
        applicant2.setMaritalStatus(MaritalStatus.MARRIED);
        applicant2.setPassportExpiryDate(LocalDate.of(2025,1,10));
        applicant2.setPassportIssueDate(LocalDate.of(2021,1,10));

        Applicant applicant3 = new Applicant();
        applicant3.setFullName("Migz");
        applicant3.setDateOfBirth(LocalDate.of(1998,1,10));
        applicant3.setHasChildren(false);
        applicant3.setMaritalStatus(MaritalStatus.SINGLE);
        applicant3.setPassportExpiryDate(LocalDate.of(2025,1,10));
        applicant3.setPassportIssueDate(LocalDate.of(2021,1,10));

        Applicant applicant4 = new Applicant();
        applicant4.setFullName("Dhobhie");
        applicant4.setDateOfBirth(LocalDate.of(1998,1,10));
        applicant4.setHasChildren(false);
        applicant4.setMaritalStatus(MaritalStatus.SINGLE);
        applicant4.setPassportExpiryDate(LocalDate.of(2025,1,10));
        applicant4.setPassportIssueDate(LocalDate.of(2021,1,10));

        Applicant applicant5 = new Applicant();
        applicant5.setFullName("Bea");
        applicant5.setDateOfBirth(LocalDate.of(1998,1,10));
        applicant5.setHasChildren(false);
        applicant5.setMaritalStatus(MaritalStatus.SINGLE);
        applicant5.setPassportExpiryDate(LocalDate.of(2025,1,10));
        applicant5.setPassportIssueDate(LocalDate.of(2021,1,10));


        Visa visa1 = new Visa();
        visa1.setBalance(5000);
        visa1.setEmployeeProof(true);
        visa1.setHotelReservation(true);
        visa1.setPensionProof(true);
        visa1.setTaxStatements(true);
        visa1.setRoundTripFlightTickets(true);

        Visa visa2 = new Visa();
        visa2.setBalance(5000);
        visa2.setEmployeeProof(true);
        visa2.setHotelReservation(true);
        visa2.setPensionProof(true);
        visa2.setTaxStatements(true);
        visa2.setRoundTripFlightTickets(true);

        Visa visa3 = new Visa();
        visa3.setBalance(5000);
        visa3.setEmployeeProof(true);
        visa3.setHotelReservation(true);
        visa3.setPensionProof(true);
        visa3.setTaxStatements(true);
        visa3.setRoundTripFlightTickets(true);

        Visa visa4 = new Visa();
        visa4.setBalance(5000);
        visa4.setEmployeeProof(true);
        visa4.setHotelReservation(true);
        visa4.setPensionProof(true);
        visa4.setTaxStatements(true);
        visa4.setRoundTripFlightTickets(true);

        Visa visa5 = new Visa();
        visa5.setBalance(5000);
        visa5.setEmployeeProof(true);
        visa5.setHotelReservation(true);
        visa5.setPensionProof(true);
        visa5.setTaxStatements(true);
        visa5.setRoundTripFlightTickets(true);

        Applicant[] applicants = new Applicant[]{applicant1, applicant2, applicant3, applicant4, applicant5};
        Visa[] visas = new Visa[]{visa1, visa2, visa3, visa4, visa5};

        try {
            for (int i = 0; i < applicants.length; i++) {
                Applicant applicant = applicants[i];
                Visa visa = visas[i];
                applicationService.validateApplicantDetails(applicant, visa);
            }
        } catch (Exception e) {
            System.out.println("Error during validation: " + e.getMessage());
        }
    }
}