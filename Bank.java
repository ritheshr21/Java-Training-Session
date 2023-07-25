class RBIBank{
    int getRateOfInterest_FD(){
        return 6;
    }
}
class SBI extends RBIBank{
    int getRateOfInterest_FD(){
        return 8;
    }
}
class ICICI extends RBIBank{
    int getRateOfInterest_FD(){
        return 9;
    }
}
class AXIS extends RBIBank{
    int getRateOfInterest_FD(){
        return 10;
    }
}
public class Bank {
    public static void main(String args[]){
        SBI s = new SBI();
        ICICI i = new ICICI();
        AXIS a = new AXIS();
        System.out.println("SBI Bank rate of interest: "+s.getRateOfInterest_FD());
        System.out.println("ICICI Bank rate of interest: "+i.getRateOfInterest_FD());
        System.out.println("AXIS Bank rate of interest: "+a.getRateOfInterest_FD());
    }
}
