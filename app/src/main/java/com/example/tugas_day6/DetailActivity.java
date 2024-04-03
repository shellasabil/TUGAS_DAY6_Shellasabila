package com.example.tugas_day6;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        // Mendapatkan data dari Intent
        int itemId = getIntent().getIntExtra("itemId", 0);
        Item item = getItemById(itemId);

        // Menampilkan detail item
        TextView tv_name = findViewById(R.id.tv_namedetail);
        TextView tv_deskripsi = findViewById(R.id.tvdescription_detail);
        TextView tv_harga = findViewById(R.id.tvPrice_detail);
        ImageView ImageItem = findViewById(R.id.Imageview_detail);
        Button buttonshare = findViewById(R.id.btn_Share);

        if (item != null) {
            tv_name.setText(item.getName());
            tv_deskripsi.setText(item.getDescription());
            tv_harga.setText(item.getPrice());
            ImageItem.setImageResource(item.getImageItem());

            // Mengatur onClickListener untuk tombol share
            buttonshare.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    shareItem(item, ImageItem);
                }
            });
        }
    }

    // Metode untuk mendapatkan item berdasarkan ID
    private Item getItemById(int itemId) {
        for (Item item : MainActivity.namaItem) {
            if (item.getId() == itemId) {
                return item;
            }
        }
        return null; // Kembalikan null jika tidak menemukan item
    }

    // Metode untuk berbagi item
    private void shareItem(Item item, ImageView imageView) {
        String shareText = "Nama: " + item.getName() +
                "\nDeskripsi: " + item.getDescription() +
                "\nHarga: " + item.getPrice();

        // Simpan gambar ke penyimpanan sementara
        BitmapDrawable drawable = (BitmapDrawable) imageView.getDrawable();
        Bitmap bitmap = drawable.getBitmap();
        String imagePath = MediaStore.Images.Media.insertImage(getContentResolver(), bitmap, "Item Image", null);
        Uri imageUri = Uri.parse(imagePath);

        Intent sendIntent = new Intent();
        sendIntent.setAction(Intent.ACTION_SEND);
        sendIntent.putExtra(Intent.EXTRA_TEXT, shareText);
        sendIntent.putExtra(Intent.EXTRA_STREAM, imageUri); // Sisipkan URI gambar
        sendIntent.setType("image/jpeg");

        Intent shareIntent = Intent.createChooser(sendIntent, null);
        startActivity(shareIntent);
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
