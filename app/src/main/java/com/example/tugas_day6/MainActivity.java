package com.example.tugas_day6;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private ItemAdapter itemAdapter;
    public static ArrayList<Item> namaItem;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);


        recyclerView = findViewById(R.id.recyclerView);
        namaItem = new ArrayList<>();
        getData();
        itemAdapter = new ItemAdapter(namaItem, this);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(itemAdapter);
    }

        private void getData() {
            namaItem = new ArrayList<>();
        namaItem.add(new Item(1, "Vivobook 14 A1404 - A1404VA-IPS552", "Intel® Core™ i5-1335U Processor 1.3 GHz (12MB Cache, up to 4.6 GHz, 10 cores, 12 Threads)", "Rp. 10,499,000", R.drawable.asus));
        namaItem.add(new Item(2, "Swift 3X SF314-510G-50CC Notebook1", "Intel® Iris® Xe MAX discrete graphics and 11th Gen Intel", "Rp. 11.099.000", R.drawable.acer));
        namaItem.add(new Item(3, "Lenovo Ideapad slim 3", "3 Ryzen 5 7530U 512GB SSD 8GB IPS Win11+OHS", "Rp. 8,000,000", R.drawable.lenovo));
        namaItem.add(new Item(4, "MSI GF63 THIN 11SC I5 ", "1400H 8GB 512GB SSD GTX1650 4GB 15.6″ FHD IPS 144HZ W10", "Rp.  13,499,000", R.drawable.msi));
        namaItem.add(new Item(5, "Macbook Pro M2", "Layar 13,3 inci (diagonal) dengan lampu latar LED dan teknologi IPS; resolusi 2560 x 1600 pada 227 piksel per inci dengan dukungan untuk jutaan warna", "Rp. 20,999,000", R.drawable.macbook));
        namaItem.add(new Item(6, "Alexandre Christie", "Chronograph White Dial Silver Stainless Steel, Case Silver-Black", "Rp. 1,265,000", R.drawable.jamac));
        namaItem.add(new Item(7, "Jam Tangan Wanita Seiko SXDC49 Stainless Quartz ", "Analog watch\n" +
                "Warna silver\n" +
                "Material all stainless steel\n" +
                "Hardlex c rystal\n" +
                "Silver bezel\n" +
                "Pink dial", "Rp. 1,039,900", R.drawable.seiko));
        namaItem.add(new Item(8, "Jam Aigner", "Jam Tangan Aigner Perugina ARWLG2151304", "Rp. 7,000,000", R.drawable.aigner));
        namaItem.add(new Item(9, "Jam  Daniel Wellington", "Dial : Black\n" +
                "• Case Size : 28mm/32mm/36mm\n" +
                "• Case Material : Stainless Steel\n" +
                "• Glass Material : Mineral Crystal", "Rp. 1,130,000", R.drawable.dw));
        namaItem.add(new Item(10, "Jam Casio", "Jam Tangan pria Casio original Mtp-1239d-7 Stainless", "Rp. 425,000", R.drawable.casio));
        namaItem.add(new Item(11, "sepatu nike", "Nike Air Force 1 07 Women's", "Rp. 1,909,000", R.drawable.nike));
        namaItem.add(new Item(12, "sepatu puma", "Sepatu Club Zone Trainers", "Rp. 769,000", R.drawable.puma));
        namaItem.add(new Item(13, "sepatu new balance", "SEPATU NB NEW BALANCE 1300TH OLIVE GREEN", "Rp. 649,000", R.drawable.nb));
        namaItem.add(new Item(14, "sepatu converse", "Converse Chuck Taylor All Star HI Unisex Sneakers - Black", "Rp. 799,000", R.drawable.converse));
        namaItem.add(new Item(15, "sepatu adidas", "SEPATU ADIDAS RUNFALCON 3.0 HP7553 / 20231", "Rp. 725,000", R.drawable.adidas));
        namaItem.add(new Item(15, "Michael Kors", "MICHAEL KORS MONOGRAM BEIGE WHITE CLUTCH WITH CARD HOLDER", "Rp. 1,800,000", R.drawable.mk));
        namaItem.add(new Item(15, "Charles and Keith", "Tas Selempang Croc-Effect Chain Strap - Blue", "Rp. 1,149,000", R.drawable.cnk));
        namaItem.add(new Item(15, "Coach", "COACH CC KATY BROWN TOP HANDLE SHOULDER BAG", "Rp. 3,500,000", R.drawable.coach));
        namaItem.add(new Item(15, "Tory Burch", "TORY BURCH FLEMING ALL BLACK MATTE SHOULDER BAG MEDIUM", "Rp. 7,250,000", R.drawable.tory));
        namaItem.add(new Item(15, "Dior", "Medium Lady D-Lite Bag", "Rp. 93,000,000,000.", R.drawable.dior));
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
        }
    }
