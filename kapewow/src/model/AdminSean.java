package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AdminSean {

    private final Connection con = MyConnection.getConnection();

    // GET MAX ID
    public int getMaxRowAdminTable() {
        int row = 0;
        String sql = "SELECT MAX(id) FROM admin";

        try (PreparedStatement ps = con.prepareStatement(sql); ResultSet rs = ps.executeQuery()) {

            if (rs.next()) {
                row = rs.getInt(1);
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return row + 1;
    }

    // CHECK IF USERNAME EXISTS
    public boolean isAdminNameExist(String username) {

        String sql = "SELECT 1 FROM admin WHERE username = ?";

        try (PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, username);

            try (ResultSet rs = ps.executeQuery()) {
                return rs.next();
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return false;
    }

    // GET SECURITY QUESTION (column: s_ques)
    public String getSecurityQuestion(String username) {

        String sql = "SELECT s_ques FROM admin WHERE username = ?";

        try (PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, username);

            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    return rs.getString("s_ques");
                }
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return null;
    }

    // CHECK SECURITY ANSWER (column: ans)
    public boolean isAnswerCorrect(String username, String inputAns) {

        String sql = "SELECT ans FROM admin WHERE username = ?";

        try (PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, username);

            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    return inputAns.equals(rs.getString("ans"));
                }
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return false;
    }

    // UPDATE PASSWORD
    public boolean setPassword(String username, String newPassword) {

        String sql = "UPDATE admin SET password = ? WHERE username = ?";

        try (PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, newPassword);
            ps.setString(2, username);

            return ps.executeUpdate() > 0;

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return false;
    }

    // INSERT NEW ADMIN  
    // Note: fields = username, password, s_ques, ans
    public boolean insert(Admin admin) {

        String sql = "INSERT INTO admin (username, password, s_ques, ans) VALUES (?, ?, ?, ?)";

        try (PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, admin.getUsername());
            ps.setString(2, admin.getPassword());
            ps.setString(3, admin.getQues());    // maps to s_ques
            ps.setString(4, admin.getAns());

            return ps.executeUpdate() > 0;

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return false;
    }

    // LOGIN
    public boolean login(String username, String password) {

        String sql = "SELECT 1 FROM admin WHERE username = ? AND password = ?";

        try (PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, username);
            ps.setString(2, password);

            try (ResultSet rs = ps.executeQuery()) {
                return rs.next();
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return false;
    }
}
