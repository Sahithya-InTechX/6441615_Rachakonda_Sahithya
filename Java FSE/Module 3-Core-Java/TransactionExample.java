import java.sql.*;

public class TransactionExample {
    private final Connection con;

    public TransactionExample() throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/yourDB", "root", "password");
        con.setAutoCommit(false);
    }

    public void transfer(int fromAcc, int toAcc, double amount) throws SQLException {
        try {
            PreparedStatement debit = con.prepareStatement("UPDATE accounts SET balance = balance - ? WHERE id = ?");
            debit.setDouble(1, amount);
            debit.setInt(2, fromAcc);
            debit.executeUpdate();

            PreparedStatement credit = con.prepareStatement("UPDATE accounts SET balance = balance + ? WHERE id = ?");
            credit.setDouble(1, amount);
            credit.setInt(2, toAcc);
            credit.executeUpdate();

            con.commit();
            System.out.println("Transfer successful.");
        } catch (SQLException e) {
            con.rollback();
            System.out.println("Transfer failed, rolled back.");
        }
    }

    public void close() throws SQLException {
        con.close();
    }

    public static void main(String[] args) {
        try {
            TransactionExample te = new TransactionExample();
            te.transfer(101, 102, 500.00);
            te.close();
        } catch (Exception e) {
        }
    }
}
