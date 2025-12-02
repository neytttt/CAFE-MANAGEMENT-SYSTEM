package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AdminSean {

    private final Connection con = MyConnection.getConnection();

    // COUNT how many admins exist
    public int getMaxRowAdminTable() {
        int count = 0;

        String sql = "SELECT COUNT(*) FROM admin";

        try (PreparedStatement ps = con.prepareStatement(sql); ResultSet rs = ps.executeQuery()) {

            if (rs.next()) {
                count = rs.getInt(1);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return count;
    }

    // LOGIN method
    public boolean login(String username, String password) {
        String sql = "SELECT * FROM admin WHERE username = ? AND password = ?";

        try (PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, username);
            ps.setString(2, password);

            ResultSet rs = ps.executeQuery();

            return rs.next();  // TRUE = found user

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return false;
    }

    // INSERT / SIGN-UP method  ✅ FIXED
    public boolean insert(String username, String password, String sQues, String answer) {

        // Your REAL column names in MySQL:
        // username | password | s_ques | ans
        String sql = "INSERT INTO admin(username, password, s_ques, ans) VALUES (?,?,?,?)";

        try (PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, username);
            ps.setString(2, password);
            ps.setString(3, sQues);
            ps.setString(4, answer);

            return ps.executeUpdate() > 0;

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return false;
    }
}
