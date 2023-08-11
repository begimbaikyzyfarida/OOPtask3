public class Main {
    public static void main(String[] args) {
        Phone iPhone = new Phone("Apple"," iPhone 11 Pro ","84.4 cm2, 19.5:9 aspect ratio");
        iPhone.setMemory("512 GB");
        iPhone.setPrice("$ 321.36");
        Phone Samsung = new Phone("Samsung","Galaxy S22 Ultra","Dynamic AMOLED 2X");
        Samsung.setMemory("256GB");
        Samsung.setPrice("$ 839.99");
        System.out.println("------------------------------------");
        System.out.println("First phone ->");
        System.out.println("Brand: " + iPhone.getBrand());
        System.out.println("Version: " +iPhone.getVersion());
        System.out.println("Screen: "+ iPhone.getScreen());
        System.out.println("Memory: "+ iPhone.getMemory());
        System.out.println("Price: " + iPhone.getPrice());
        System.out.println("------------------------------------");
        System.out.println("Second phone ->");
        System.out.println("Brand: " + Samsung.getBrand());
        System.out.println("Version: " + Samsung.getVersion());
        System.out.println("Screen: "+ Samsung.getScreen());
        System.out.println("Memory: "+ Samsung.getMemory());
        System.out.println("Price: " + Samsung.getPrice());
        System.out.println("------------------------------------");
    }
}
