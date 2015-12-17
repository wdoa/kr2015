import javax.swing.*;

/**
 * Created by forwi on 17.12.2015.
 */
class MyCBM extends AbstractListModel implements ComboBoxModel {
    String[] ComputerComps = Recipe.types;
    String selection = null;

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

class MyCBMDry extends AbstractListModel implements ComboBoxModel {
    String[] ComputerComps = Dry.dryDimensions;
    String selection = null;

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

class MyCBMLiquid extends AbstractListModel implements ComboBoxModel {
    String[] ComputerComps = Liquid.dryDimensions;
    String selection = null;

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