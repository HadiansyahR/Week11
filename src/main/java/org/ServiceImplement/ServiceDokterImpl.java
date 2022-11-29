package org.ServiceImplement;

import org.Services.DokterService;
import org.Utilities.ConnectionManager;
import org.pojo.Dokter;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ServiceDokterImpl implements DokterService {

    private ConnectionManager conMan;
    private Connection conn;
    Statement stmt;
    ResultSet rs;

    @Override
    public List<Dokter> findAll() {
        List<Dokter> listDokter = new ArrayList<>();
        String sql = "SELECT * FROM dokter";

        conMan = new ConnectionManager();
        conn = conMan.connect();

        try {
            stmt = conn.createStatement();
            rs = stmt.executeQuery(sql);

            while (rs.next()){
                Dokter dokter = new Dokter();
                dokter.setId(rs.getInt("id"));
                dokter.setNama(rs.getString("nama"));
                dokter.setUmur(rs.getInt("umur"));
                dokter.setJenisKelamin(rs.getString("jenis_kelamin"));
                dokter.setDepartemen(rs.getString("departemen"));
                dokter.setNomorTelepon(rs.getString("nomor_telepon"));
                dokter.setAlamat(rs.getString("alamat"));

                listDokter.add(dokter);
            }

            conMan.disconnect();
        }catch (SQLException ex){
            Logger.getLogger(ServiceDokterImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listDokter;
    }

    @Override
    public Integer create(Dokter object) {
        return null;
    }

    @Override
    public Integer update(Dokter object) {
        return null;
    }

    @Override
    public Dokter findById(int id) {
        return null;
    }

    @Override
    public Integer delete(Dokter object) {
        return null;
    }
}
