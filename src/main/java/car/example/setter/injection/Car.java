package car.example.setter.injection;

public class Car {
    private Specification specification;

    public Specification getSpecification() {
        return specification;
    }

    public void setSpecification(Specification specification) {
        this.specification = specification;
    }

    public String carDetails(){
        return specification.toString();
    }

}
