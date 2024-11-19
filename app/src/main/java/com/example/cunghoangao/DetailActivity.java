package com.example.cunghoangao;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.cunghoangao.databinding.ActivityDetailBinding;

public class DetailActivity extends AppCompatActivity {
    private ActivityDetailBinding binding;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityDetailBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        Intent intent = getIntent();
        String hoangDao = intent.getStringExtra("hoangDao");

        String title, text;
        int src;

        switch (hoangDao) {
            case "boCap":
                 text =  getString(R.string.bo_cap_text);
                 title = getString(R.string.bo_cap_title1);
                 src = R.drawable.bocap;
                break;

            case "songNgu":
                text =  getString(R.string.song_ngu_text);
                title = getString(R.string.song_ngu_title1);
                src = R.drawable.songngu1;
                break;

            case "thienBinh":
                text = getString(R.string.thien_binh_text);
                title = getString(R.string.thien_binh_title1);
                src = R.drawable.thienbinh;
                break;
            case "bachDuong":
                text = getString(R.string.bach_duong_text);
                title = getString(R.string.bach_duong_title1);
                src = R.drawable.bachduong;
                break;
            case "kimNguu":
                text = getString(R.string.kim_nguu_text);
                title = getString(R.string.kim_nguu_title1);
                src = R.drawable.kimnguu;
                break;
            case "songTu":
                text = getString(R.string.song_tu_text);
                title = getString(R.string.song_ngu_title1);
                src = R.drawable.songtu;
                break;
            case "cuGiai":
                text = getString(R.string.cu_giai_text);
                title =  getString(R.string.cu_giai_title1);
                src = R.drawable.cugiai;
                break;
            case "suTu":
                text = getString(R.string.su_tu_text);
                title = getString(R.string.su_tu_title1);
                src = R.drawable.sutu;
                break;
            case "xuNu":
                text = getString(R.string.xu_nu_text);
                title = getString(R.string.xu_nu_title1);
                src = R.drawable.xunu;
            case "baoBinh":
                text = getString(R.string.bao_binh_text);
                title = getString(R.string.bao_binh_title1);
                src = R.drawable.baobinh;
            case "nhanMa":
                text = getString(R.string.bao_binh_text);
                title = getString(R.string.bao_binh_title1);
                src = R.drawable.nhanma;
                break;
            case "maKet":
                text = getString(R.string.ma_ket_text);
                title = getString(R.string.ma_ket_title1);
                src = R.drawable.maket;
                break;
            default:
                text = getString(R.string.thien_binh_text);
                title = getString(R.string.thien_binh_title1);
                src = R.drawable.thienbinh;
        }
        binding.txtTitle1.setText(title);
        binding.imgSrc.setImageResource(src);
        binding.txtPreView2.setText(text);

        binding.btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}
