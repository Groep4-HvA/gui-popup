package guipopup;


public class GuiPopup {

    public static void main(String[] args) {
        addLuggage gui = new addLuggage();
        addMedewerker gui2 = new addMedewerker();
        addPassenger gui3 = new addPassenger();
        
        gui.setVisible(true);
        gui2.setVisible(true); 
        gui3.setVisible(true);
   }
}
