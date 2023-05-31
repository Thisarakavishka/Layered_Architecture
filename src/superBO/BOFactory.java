package superBO.BO;

import superBO.BO.BOImpl.CustomerBOImpl;
import superBO.BO.BOImpl.ItemBOImpl;
import superBO.BO.BOImpl.PurchaseOrderBOImpl;
import superBO.SuperBO;

public class BOFactory {

    private static BOFactory boFactory;

    private BOFactory() {
    }

    public static BOFactory getBoFactory() {
        return (boFactory == null) ? new BOFactory() : boFactory;
    }

    public enum BOTypes {CUSTOMER, ITEM, PURCHASE}

    public SuperBO getBO(BOTypes boTypes){
        switch (boTypes){
            case CUSTOMER :
                return new CustomerBOImpl();
            case ITEM:
                return new ItemBOImpl();
            case PURCHASE:
                return new PurchaseOrderBOImpl();
            default:
                return null;
        }
    }
}
