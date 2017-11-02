package com.example.unitec.quanlynhanvien;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

import com.example.unitec.quanlynhanvien.Adapter.Custom_Spiner_ThemNhanVien;
import com.example.unitec.quanlynhanvien.DAO.PhongBanDAO;
import com.example.unitec.quanlynhanvien.DTO.PhongBanDTO;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by QuyenHT on 11/2/2017.
 */

public class ThemNhanVien extends AppCompatActivity {
    Spinner spinnerPhongBan;
    EditText txtTenNV,txtDiaChi,txtEmail,txtSDT,txtNgaySinh,txtLuong;
    Button bntThem,btnThoat;
    List<PhongBanDTO> listPhongBan;
    PhongBanDAO phongBanDAO;

    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_themnhanvien);
        phongBanDAO = new PhongBanDAO(this);
        spinnerPhongBan = (Spinner)findViewById(R.id.spinner);
        listPhongBan = phongBanDAO.AllPhongBan();
        Custom_Spiner_ThemNhanVien adapter = new Custom_Spiner_ThemNhanVien(this,R.layout.custom_layout_spiner,listPhongBan);
        spinnerPhongBan.setAdapter(adapter);
    }
}
