package superDAO.DAO.DAOImpl;

import db.DBConnection;
import model.OrderDetailDTO;
import superDAO.DAO.OrderDetailsDAO;
import superDAO.SQLUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class OrderDetailsDAOImpl implements OrderDetailsDAO {

    @Override
    public boolean saveOrderDetails(OrderDetailDTO dto) throws SQLException, ClassNotFoundException {
        return SQLUtil.execute("INSERT INTO OrderDetails (oid, itemCode, unitPrice, qty) VALUES (?,?,?,?)", dto.getOid(), dto.getItemCode(), dto.getUnitPrice(), dto.getQty());
    }
}
