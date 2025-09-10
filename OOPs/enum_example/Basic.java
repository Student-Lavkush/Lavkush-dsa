package OOPs.enum_example;
//1- all the enums explicity extends the java.lang.enum class.
//2 - you cannot extends anything because multiple inheritence is not allowed in java
public class Basic {
    enum Week implements A{
        Monday,Tuesday,Wednesday,Thrusday,Friday,Saturday,Sunday;
    
        //these are known as enum constants
        // default is public ,static,final
        //since its final you cannot create child enums
        //type of these things is Week
        Week(){
            System.out.println("constructor are"+ this);
        }
        //this is not public or protected,only private or default
        //why? we don't wants to create a new object.
        //this is a enum concept,that's why because enum has constant object.
        //internally: public static final Week Monday = new Week();

        @Override
        public void hello() {
          System.out.println("hey how are you");
            
        }
        
}
    public static void main(String[] args) {
        Week week;
        week = Week.Monday;
        // for(Week day : Week.values()){
        //     System.out.println(day);

        // }
        week.hello();
        System.out.println(week.ordinal());//ordinal show place of week in the enum;
    }
}
