public class Rectangle {
    private point topleft ;
    private int sideA, sideB;

    public Rectangle(point topleft,int sideA, int sideB ) {

        this.topleft = topleft;

        this.sideA = sideA;
        this.sideB = sideB;


    }

    public Rectangle(point topleft, int sideA) {
        this.topleft = topleft;

        this.sideA = sideA;
        this.sideB = sideA;
    }

    public point getTopleft() {
        return topleft;
    }

    public void setTopleft(point topleft) {
        this.topleft = topleft;
    }

    public int getSideA() {
        return sideA;
    }

    public void setSideA(int sideA) {
        this.sideA = sideA;
    }

    public int getSideB() {
        return sideB;
    }

    public void setSideB(int sideB) {

            if (sideB < 0 ){
                this.sideB = 0 ;
                System.out.println("side cant be negative");
            }
            else{
                this.sideB=sideB;

        }
    }
    public int perimeter(){
        return (2*sideA) + (2*sideB);
    }
    public int area (){
        return sideA*sideB;
    }
}
