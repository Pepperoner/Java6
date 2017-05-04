package module6.homework;

public class CitizenFactory {

    private class Englishman implements Citizen{
        @Override
        public void sayHello() {
            System.out.println("Hi");
        }
    }

    private class Chinese implements Citizen{
        @Override
        public void sayHello() {
            System.out.println("Ni hao");
        }
    }

    private class Russian implements Citizen{
        @Override
        public void sayHello() {
            System.out.println("Привет");
        }
    }

    private class Italian implements Citizen{
        @Override
        public void sayHello() {
            System.out.println("Ciao");
        }
    }

    public Citizen getCitizen(String nationality){
        switch (nationality){
            case "england":
                return new Englishman();
            case "china":
                return new Chinese();
            case "russia":
                return new Russian();
            case "italy":
                return new Italian();
            default:
                return null;
        }

    }
}
