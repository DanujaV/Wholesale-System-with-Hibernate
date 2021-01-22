package lk.ijse.pos.hibernate.controller;

import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.TableView;
import lk.ijse.pos.hibernate.business.BOFactory;
import lk.ijse.pos.hibernate.business.BOType;
import lk.ijse.pos.hibernate.business.custom.impl.CustomerBOImpl;
import lk.ijse.pos.hibernate.dto.CustomerDTO;

public class CustomerFormController {
    public JFXTextField txtId;
    public JFXTextField txtName;
    public JFXTextField txtAddress;
    public JFXTextField txtSalary;
    public TableView tblCustomer;

    CustomerBOImpl customerBOImpl = BOFactory.getInstance().getBO(BOType.CUSTOMER);

    public void btnSaveOnAction(ActionEvent actionEvent) {
        String id = txtId.getText();
        String name = txtName.getText();
        String address = txtAddress.getText();
        double salary = Double.parseDouble(txtSalary.getText());

        try {
            if (customerBOImpl.add(new CustomerDTO(
                    id,
                    name,
                    address,
                    salary
            )));{
                new Alert(Alert.AlertType.CONFIRMATION, "Ok").showAndWait();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
