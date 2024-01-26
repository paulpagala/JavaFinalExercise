import java.time.LocalDate;

public class ApplicationService {
    public Boolean validateApplicantDetails(Applicant applicant, Visa visa){
        boolean approved = true;
        String rejectionReason = "";
        if(applicant.getDateOfBirth().plusYears(30).isAfter(LocalDate.now())
                && ((applicant.getMaritalStatus().equals(MaritalStatus.SINGLE)||applicant.getMaritalStatus().equals(MaritalStatus.DIVORCED))
                && !applicant.getHasChildren())
                && visa.getEmployeeProof()){
            rejectionReason = "Unmarried/divorced applicant under 30 without children and unemployed";
            approved = false;
        }

        if (applicant.getPassportExpiryDate().minusMonths(6).isBefore(LocalDate.now())){
            rejectionReason = "Passport not valid for 6 months";
            approved=false;
        }

        if (approved) {
            System.out.println("Visa application for " + applicant.getFullName() + " approved!");
        } else {
            System.out.println("Visa application for " + applicant.getFullName() + " rejected. Reason: " + rejectionReason);
        }
    return approved;
    }
}
