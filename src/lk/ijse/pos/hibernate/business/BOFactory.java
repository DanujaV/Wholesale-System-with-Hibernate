package lk.ijse.pos.hibernate.business;

import lk.ijse.pos.hibernate.business.custom.impl.CustomerBOImpl;

public class BOFactory {
    private static BOFactory boFactory;

    private BOFactory(){}

    public static BOFactory getInstance(){
        return (null == boFactory) ? boFactory = new BOFactory() : boFactory;
    }

    public <T extends SuperBO> T getBO(BOType boType){
        switch (boType){
            case CUSTOMER:
                return (T) new CustomerBOImpl();
            default:
                return null;
        }
    }
}
