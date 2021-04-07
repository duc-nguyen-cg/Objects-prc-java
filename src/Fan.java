public class Fan {
    static final int SLOW = 1, MEDIUM = 2, FAST = 3;
    int speed = SLOW;
    private boolean on = false;
    private double radius = 5;
    private String color = "blue";

    public int getSpeed(){
        return this.speed;
    }

    public boolean getStatus(){
        return this.on;
    }

    public double getRadius(){
        return this.radius;
    }

    public String getColor(){
        return this.color;
    }

    public void setSpeed(int newSpeed){
        this.speed = newSpeed;
    }

    public void setStatus(boolean newStatus){
        this.on = newStatus;
    }

    public void setRadius(double newRad){
        this.radius = newRad;
    }

    public void setColor(String newColor){
        this.color = newColor;
    }

    Fan(){
    }

    @Override
    public String toString(){
        String text = "";
        if (this.on == true){
            text += "Fan is on\n";
            text += "speed: "+this.speed+", radius: "+this.radius+", color: "+this.color;
        } else {
            text += "Fan is off\n";
            text += "radius: "+this.radius+", color: "+this.color;
        }
        return text;
    }
}

class FanInit{
    public static void main(String[] args){
        //init and display fan1
        Fan fan1 = new Fan();
        fan1.setSpeed(10);
        fan1.setRadius(10);
        fan1.setColor("yellow");
        fan1.setStatus(true);

        System.out.println(fan1.toString());

        //init and display fan2
        Fan fan2 = new Fan();
        fan2.setSpeed(5);
        fan2.setRadius(5);
        fan2.setColor("blue");
        fan2.setStatus(false);

        System.out.println(fan2.toString());
    }
}
