public class ClassesJava{

    interface Bycicle{
        void changeCadence(int newValue);
        void changeGear(int newValue);
        void speedUp(int increment);
        void applyBrakes(int descrement);
    }

    class ACMEBicycle implements Bycicle{
        int cadence = 0;
        int speed = 0;
        int gear = 1;

        public void changeCadence(int newValue){
            cadence = cadence + newValue;
        }

        public void changeGear(int newValue){
            gear = gear + newValue;
        }

        public void speedUp(int increment){
            speed = speed + increment;
        }

        public void applyBrakes(int descrement){
            speed = speed - descrement;
        }
    }
}