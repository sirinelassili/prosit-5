public class Dauphin extends Aquatic{

    private float swimmingSpeed;
    //public Dauphin(){}

    public Dauphin(String family, String name, int age, boolean isMammal, String habitat, float swimmingSpeed) {
        super(family, name, age, isMammal, habitat);
        this.swimmingSpeed = swimmingSpeed;
    }

    public float getSwimmingSpeed() {
        return swimmingSpeed;
    }

    public void setSwimmingSpeed(float swimmingSpeed) {
        this.swimmingSpeed = swimmingSpeed;
    }

    @Override
    public String toString() {
        return "Dauphin{" +
                "swimmingSpeed=" + swimmingSpeed +
                '}';
    }
    @Override
    public void swim(){
        System.out.println("This dolphin  is swimming. ");
    }
}
