package com.Arbin;

public class DinosaurSupervisor {

    public static void main(String[] args) {
        Dinosaur t_rex = new Dinosaur();
        Dinosaur velociraptor = new Dinosaur();
        Dinosaur diplodocus=new Dinosaur();
        t_rex.roar();
        t_rex.color="red";
        t_rex.name="tyrannosaurus Rex";
        System.out.println("The name of this dinosaur is "+t_rex.name);
        System.out.println("It's color is "+t_rex.color);
        velociraptor.roar();
        velociraptor.color="blue";
        velociraptor.name="Velociraptor";
        System.out.println("The name of this dinosaur is "+velociraptor.name);
        System.out.println("It's color is "+velociraptor.color);
        diplodocus.roar();
        diplodocus.color="green";
        diplodocus.name="Diplodocus";
        System.out.println("The name of this dinosaur is "+diplodocus.name);
        System.out.println("It's color is "+diplodocus.color);
    }
}
