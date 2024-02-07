import java.util.ArrayList;

public class ShoppingTrolley {
    private ArrayList <String> itemsList = new ArrayList<>();

    public void addItem(String inputItem)
    {
        itemsList.add(inputItem);
    }

    public int getItemCount(){
        return itemsList.size();
    }

    public boolean itemInTrolley (String inputItem)
    {
        boolean isIn = false;
        for (int i = 0; i<itemsList.size(); i++)
        {
            if (itemsList.get(i) == inputItem) {
                isIn = true;
            }
            else {
                isIn = false;
            }
        }
        return isIn;

    }
}
