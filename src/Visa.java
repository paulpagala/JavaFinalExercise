public class Visa {
    private int balance;
    private Boolean taxStatements;
    private Boolean roundTripFlightTickets;
    private Boolean hotelReservation;
    private Boolean employeeProof;
    private Boolean pensionProof;

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public Boolean getTaxStatements() {
        return taxStatements;
    }

    public void setTaxStatements(Boolean taxStatements) {
        this.taxStatements = taxStatements;
    }

    public Boolean getRoundTripFlightTickets() {
        return roundTripFlightTickets;
    }

    public void setRoundTripFlightTickets(Boolean roundTripFlightTickets) {
        this.roundTripFlightTickets = roundTripFlightTickets;
    }

    public Boolean getHotelReservation() {
        return hotelReservation;
    }

    public void setHotelReservation(Boolean hotelReservation) {
        this.hotelReservation = hotelReservation;
    }

    public Boolean getEmployeeProof() {
        return employeeProof;
    }

    public void setEmployeeProof(Boolean employeeProof) {
        this.employeeProof = employeeProof;
    }

    public Boolean getPensionProof() {
        return pensionProof;
    }

    public void setPensionProof(Boolean pensionProof) {
        this.pensionProof = pensionProof;
    }
}
