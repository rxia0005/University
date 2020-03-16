public class University {
    public Unit[] UnitsArray;

    public void printStatus() {
        System.out.println("Welcome to Java University");
        System.out.println();
        createUnits();
        displayUnits();
        System.out.println();
        System.out.println("Thank you for using Java University");
    }


    public void createUnits() {
        Unit U1 = new Unit("FIT1234 Advanced Bogosorts");
        Unit U2 = new Unit("FIT2099 Object oriented design and implementation");
        Unit U3 = new Unit("MGW1010 - Introduction to management");

        UnitsArray = new Unit[] {U1,U2,U3};
    }

    public void displayUnits() {
        for(int i = 0; i < 3; i++) {
            System.out.println(UnitsArray[i].getUnitDescription());
        }

    }

}