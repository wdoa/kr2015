import javax.swing.*;

/**
 * Created by forwi on 17.12.2015.
 */

class MyCBMDry extends AbstractListModel implements ComboBoxModel {
    String[] ComputerComps;
    String selection = null;
    public MyCBMDry(){
        ComputerComps = Dry.dryDimensions;
    }

    public  MyCBMDry(String[] s){
        ComputerComps = s;
    }

    public Object getElementAt(int index) {
        return ComputerComps[index];
    }

    public int getSize() {
        return ComputerComps.length;
    }

    public void setSelectedItem(Object anItem) {
        selection = (String) anItem; // to select and register an
    } // item from the pull-down list


    // Methods implemented from the interface ComboBoxModel
    public Object getSelectedItem() {
        return selection; // to add the selection to the combo box
    }
}

