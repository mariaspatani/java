/*   Design  a  class  that  can  be  used  by  a  healthcare patient's vital statistics. The following are the details.
 Name of the class -Patient  professional  to  keep  track  of a   Member Variables - patientName(String),height(double),width(double)
 Member Function -double computeBMIO  The  above  method  should  compute the  BMI  and return the  resirlt.  The  formula for
 computation of BMI is weight(in kg) + height*height(in metres). Create an object of the Patient class and check the results.*/
class Patient {
    String patientName;
    double height; // in meters
    double weight; // in kg

    double computeBMI() {
        return weight / (height * height);
    }

    public static void main(String[] args) {
        Patient p = new Patient();
        p.patientName = "Arun";
        p.height = 1.75;
        p.weight = 70;

        System.out.println("BMI of " + p.patientName + " = " + p.computeBMI());
    }
}
