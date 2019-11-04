/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package stocktracker;

import stocktracker.stockdatamodel.PhysicalStockItem;
import stocktracker.stockdatamodel.ServiceStockItem;

/**
 *
 * @author rtucker
 */
public class StockTracker {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        StockItem objTestItem1 = new PhysicalStockItem("Starcraft Manual");
        StockItem objTestItem2 = new PhysicalStockItem("Halo 3", 100);
        StockItem objTestItem3 = new ServiceStockItem("Delivery");
        
        if(objTestItem1.getItemType() == StockType.PHYSICALITEM){
            System.out.println("Item 1 is a PHYSICAL stock item");
        } else {
            System.out.println("Item 1 is a SERVICE stock item");
        }
        if(objTestItem2.getItemType() == StockType.PHYSICALITEM){
            System.out.println("Item 2 is a PHYSICAL stock item");
        } else {
            System.out.println("Item 2 is a SERVICE stock item");
        }
        if(objTestItem3.getItemType() == StockType.PHYSICALITEM){
            System.out.println("Item 3 is a PHYSICAL stock item");
        } else {
            System.out.println("Item 3 is a SERVICE stock item");
        }
    }
}
