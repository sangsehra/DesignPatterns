package DesignPatterns.BehaviouralDesignPatterns.MementoDesignPattern;

public class Main {
    public static void main(String[] args) {
        /*
        it's made of three classes Originator, Memento and CareTaker.
        Where Memento is copy of Originator that is managed by Originator
         */
        ConfigurationOriginator configurationOriginator = new ConfigurationOriginator(5,10);
        ConfigurationCareTaker configurationCareTaker = new ConfigurationCareTaker();

        ConfigurationMemento snapshot1 = configurationOriginator.createSnapShot();
        configurationCareTaker.storeSnapShot(snapshot1);

        System.out.println("-----------first Snap ------------");
        System.out.println("height :"+configurationOriginator.getHeight() + ", width :"+configurationOriginator.getWidth());

        configurationOriginator.setHeight(12);
        configurationOriginator.setWidth(9);

        ConfigurationMemento snapShot2 = configurationOriginator.createSnapShot();
        configurationCareTaker.storeSnapShot(snapShot2);

        System.out.println("-----------Second Snap ------------");
        System.out.println("height :"+configurationOriginator.getHeight() + ", width :"+configurationOriginator.getWidth());


        configurationOriginator.setHeight(88);
        configurationOriginator.setWidth(67);

        System.out.println("-----------Nooooo Snap ------------");
        System.out.println("height :"+configurationOriginator.getHeight() + ", width :"+configurationOriginator.getWidth());


        ConfigurationMemento restoreSnap = configurationCareTaker.undo();
        configurationOriginator.restoreSnapShot(restoreSnap);

        System.out.println("-----------after first Restore ------------");
        System.out.println("height :"+configurationOriginator.getHeight() + ", width :"+configurationOriginator.getWidth());

        ConfigurationMemento restoreSnap2 = configurationCareTaker.undo();
        configurationOriginator.restoreSnapShot(restoreSnap2);

        System.out.println("-----------after second Restore ------------");
        System.out.println("height :"+configurationOriginator.getHeight() + ", width :"+configurationOriginator.getWidth());

    }
}
