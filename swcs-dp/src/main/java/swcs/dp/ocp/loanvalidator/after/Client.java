package swcs.dp.ocp.loanvalidator.after;

class Client {

    public static void main(String[] args) {
        LoanRequestHandler loanRequestHandler = new LoanRequestHandler(1001, 1);

        loanRequestHandler.approveLoan(new PersonalLoanValidator());
        loanRequestHandler.approveLoan(new BusinessLoanValidator());
    }
}
