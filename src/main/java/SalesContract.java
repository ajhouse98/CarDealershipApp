public class SalesContract extends Contract {

    private double saleTaxAmount;
    private double recordingFee;
    private double processingFee;
    private boolean finance;
    private double monthlyPayments;

    public SalesContract(String dateOfContract, String customerName, String customerEmail, boolean vehicleSold, double saleTaxAmount, int recordingFee, double processingFee, boolean finance) {
        super(dateOfContract, customerName, customerEmail, vehicleSold);
        this.saleTaxAmount = 0.05;
        this.recordingFee = 100.00;
        this.processingFee = processingFee;
        processingFee = 295.00;
//      use if statement here, $295 for vehicles under $10,000 and $495 for all else.
        if (getTotalPrice() < 10000) {
            processingFee = 295.00;
        } else {
            processingFee = 495.00;
        }

        this.finance = finance;
        
    }

    public double getSaleTaxAmount() {
        return saleTaxAmount;
    }

    public void setSaleTaxAmount(double saleTaxAmount) {
        this.saleTaxAmount = saleTaxAmount;
    }

    public double getRecordingFee() {
        return recordingFee;
    }

    public void setRecordingFee(int recordingFee) {
        this.recordingFee = recordingFee;
    }

    public double getProcessingFee() {
        return processingFee;
    }

    public void setProcessingFee(double processingFee) {
        this.processingFee = processingFee;
    }

    public boolean isFinance() {
        return finance;
    }

    public void setFinance(boolean finance) {
        this.finance = finance;
    }

    @Override
    public double getTotalPrice() {
        return 0;
    }

    @Override
    public double getMonthlyPayment() {
        double loan = 0.0425;
        // use if statement here to change loan conditions
        return 0;
    }
}
