public class Main {
    public static void main(String[] args) {
        //Below we've defined the computer case. When we create the personal computer, we will need this reference.
        //PCs generally cant be put together without a case.

        ComputerCase theCase = new ComputerCase("2208", "Dell", "240");
        Monitor theMonitor = new Monitor("27inch Beast", "Acer", 27, "2540 x 1440");
        Motherboard theMotherboard = new Motherboard("BJ-200", "Asus", 4, 6, "V2.44");

        //Now that we've created the objects above, we can reference them when we make our Personal Computer. This is composition.

        PersonalComputer thePC = new PersonalComputer("2208", "Dell", theCase, theMonitor, theMotherboard);

        //If we want to access a method to do something with one of the objects passed to thePC, such as drawing pixels
        //on the screen with the drawPixelAt method, you can observe the example below:

        //We are using the getter method from personal computer to get the instance of the monitor class, that personal
        //computer contains.

                //thePC.getMonitor().drawPixelAt(10,10,"red");

        //We do the same thing here by getting the Motherboard object that's been created, and that PersonalComputer has
        //a reference to, with the variable motherboard.
        //We use a getter method to get that reference, then execute a method on that.

                //thePC.getMotherboard().loadProgram("Windows OS");

                //thePC.getComputerCase().pressPowerButton();

        //In all three cases above, we're accessing the functions in other classes (theCase, theMotherboard, and
        //theMonitor), but we're accessing them through thePC object. This is how composition differs from inheritance.

        //Composition is creating a whole from different parts.
        //We built this personal computer, by passing objects, to the constructor, like assembling the computer.

        //We don't really want the Main class, or any class except the PersonalComputer class to make calls on its parts.
        //So instead, we have created a private method in PersonalComputer class(drawLogo), which calls Monitor's method drawPixelAt,
        //the create a public method, which calls on computerCase's method pressPowerButton, and also calls the private
        //method drawLogo. From the calling code's perspective (Here), this code in Main didn't have to know anything
        //about PersonalComputer's parts to get the PC to do something.

        //Composition is actually about creating objects within objects.

        thePC.powerUp();
    }
}


//Use composition or inheritance or both?

//As a general rule, when you're designing your programs in Java, you probably want to look at composition first.
//Most experts will tell you that, as a rule, look at using composition before implementing inheritance.

//The reasons why composition is preferred over inheritance:

//Composition is more flexible. YOu can add parts in, or remove them, and these changes are less likely to have a
//downstream effect.

//Composition provides functional reuse outside the class hierarchy, meaning classes can share attributes and behavior
//, by having similar components, instead of inheriting functionality from a parent or base class.

//Java's inheritance breaks encapsulation, because subclasses may need direct access to a parent's state or behavior.

//Inheritance is less flexible.

//Adding a class to, or removing a class from, a class hierarchy, may impact all subclasses from that point.

//In addition, a new subclass may not need all the functionality or attributes of its parent class, which would muddy
//the water, meaning the model no longer represents the reality in the code.

//In the Product example, if we consider a Digital Product, we wouldn't really want to inherit attributes like width,
//height, and depth into Digital Product.

//It would be better if we didn't have those three attributes on Product, but instead used composition to include them
//on certain products, but not all products.