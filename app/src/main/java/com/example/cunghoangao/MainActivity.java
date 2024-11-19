package com.example.cunghoangao;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.cunghoangao.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    private String hoangDao = "boCap";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.btnBoCap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.txtPreView.setText(getString(R.string.bo_cap_text));
                binding.txtTitle2.setText(getString(R.string.bo_cap_title2));
                binding.srcPreView.setImageResource(R.drawable.bocap);
                hoangDao = "boCap";
            }
        });

        binding.btnSongNgu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.txtPreView.setText(getString(R.string.song_ngu_text));
                binding.txtTitle2.setText(getString(R.string.song_ngu_title2));
                binding.srcPreView.setImageResource(R.drawable.songngu1);
                hoangDao = "songNgu";
            }
        });

        binding.btnBachDuong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.txtPreView.setText(getString(R.string.bach_duong_text));
                binding.txtTitle2.setText(getString(R.string.bach_duong_title2));
                binding.srcPreView.setImageResource(R.drawable.bachduong);
                hoangDao = "bachDuong";
            }
        });

        binding.btnKimNguu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.txtPreView.setText(getString(R.string.kim_nguu_text));
                binding.txtTitle2.setText(getString(R.string.kim_nguu_title2));
                binding.srcPreView.setImageResource(R.drawable.kimnguu);
                hoangDao = "kimNguu";
            }
        });

        binding.btnSongTu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.txtPreView.setText(getString(R.string.song_tu_text));
                binding.txtTitle2.setText(getString(R.string.song_ngu_title2));
                binding.srcPreView.setImageResource(R.drawable.songtu);
                hoangDao = "songTu";
            }
        });

        binding.btnCuGiai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.txtPreView.setText(getString(R.string.cu_giai_text));
                binding.txtTitle2.setText(getString(R.string.cu_giai_title2));
                binding.srcPreView.setImageResource(R.drawable.cugiai);
                hoangDao = "cuGiai";
            }
        });

        binding.btnSuTu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.txtPreView.setText(getString(R.string.su_tu_text));
                binding.txtTitle2.setText(getString(R.string.su_tu_title2));
                binding.srcPreView.setImageResource(R.drawable.sutu);
                hoangDao = "suTu";
            }
        });

        binding.btnXuNu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.txtPreView.setText(getString(R.string.xu_nu_text));
                binding.txtTitle2.setText(getString(R.string.xu_nu_title2));
                binding.srcPreView.setImageResource(R.drawable.xunu);
                hoangDao = "xuNu";
            }
        });

        binding.btnThienBinh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.txtPreView.setText(getString(R.string.thien_binh_text));
                binding.txtTitle2.setText(getString(R.string.thien_binh_title2));
                binding.srcPreView.setImageResource(R.drawable.thienbinh);
                hoangDao = "thienBinh";
            }
        });

        binding.btnBaoBinh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.txtPreView.setText(getString(R.string.bao_binh_text));
                binding.txtTitle2.setText(getString(R.string.bao_binh_title2));
                binding.srcPreView.setImageResource(R.drawable.baobinh);
                hoangDao = "baoBinh";
            }
        });
        binding.btnNhanMa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.txtPreView.setText(getString(R.string.nhan_ma_text));
                binding.txtTitle2.setText(getString(R.string.nhan_ma_title2));
                binding.srcPreView.setImageResource(R.drawable.nhanma);
                hoangDao = "nhanMa";
            }
        });

        binding.btnMaKet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.txtPreView.setText(getString(R.string.ma_ket_text));
                binding.txtTitle2.setText(getString(R.string.ma_ket_title2));
                binding.srcPreView.setImageResource(R.drawable.maket);
                hoangDao = "maKet";
            }
        });
        binding.btnXemThem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(MainActivity.this, DetailActivity.class);

                intent1.putExtra("hoangDao", hoangDao);
                startActivity(intent1);
            }
        });
    }


}
