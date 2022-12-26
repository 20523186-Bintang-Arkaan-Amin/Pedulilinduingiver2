package com.bintang.pedulilinduingiver2;



import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.bintang.pedulilinduingiver2.adapter.AdapterHorizontal;
import com.bintang.pedulilinduingiver2.adapter.AdapterHorizontalNoScroll;
import com.bintang.pedulilinduingiver2.data.DataHorizontal;
import com.bintang.pedulilinduingiver2.data.DataVertical;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rv_horizontal, rv_vertical, rv_horizontal_no_scroll;

    private AdapterHorizontal adapterHorizontal;
    private AdapterHorizontalNoScroll adapterHorizontalNoScroll;

    private ArrayList<DataHorizontal> dataHorizontals = new ArrayList<>();
    private ArrayList<DataVertical> dataVerticals = new ArrayList<>();

    private ImageView img, notifikasi;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_main);

        rv_horizontal = (RecyclerView) findViewById(R.id.rv_horizontal);
        rv_horizontal_no_scroll = (RecyclerView) findViewById(R.id.rv_horizontal_no_scroll);

        adapterHorizontal = new AdapterHorizontal(dataVerticals, this);
        adapterHorizontalNoScroll = new AdapterHorizontalNoScroll(dataHorizontals, this);

        rv_horizontal_no_scroll.setLayoutManager(new GridLayoutManager(this, 3));
        rv_horizontal_no_scroll.setAdapter(adapterHorizontalNoScroll);

        rv_horizontal.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
        rv_horizontal.setAdapter(adapterHorizontal);

        img = (ImageView) findViewById(R.id.img);
        notifikasi = (ImageView) findViewById(R.id.notifikasi);

        img.setOnClickListener(view -> {

        });

        notifikasi.setOnClickListener(view -> {

        });


        setData();
    }

    private void setData() {
        dataHorizontals.add(new DataHorizontal("Vaccine Certificate", R.drawable.vc));
        dataHorizontals.add(new DataHorizontal("Covid-19 Test Result", R.drawable.testresult));
        dataHorizontals.add(new DataHorizontal("EHAC", R.drawable.ehac));
        dataHorizontals.add(new DataHorizontal("Travel Regulations", R.drawable.travel));
        dataHorizontals.add(new DataHorizontal("Telemedicine", R.drawable.telemedic));
        dataHorizontals.add(new DataHorizontal("Healthcare Facilty", R.drawable.hf));
        dataHorizontals.add(new DataHorizontal("Covid-19 Statistic", R.drawable.statis));
        dataHorizontals.add(new DataHorizontal("Get Vaccine", R.drawable.getva));
        dataHorizontals.add(new DataHorizontal("Find Hospital Bed", R.drawable.bed));

        dataVerticals.add(new DataVertical("Seandainya Para Pebalap MotoGP Tahu Derita dan Keadaan Kami...", "Foto Sibawaeh (53), warga di sekitar kawasan Sirkuit Mandalika, Lombok Tengah, sedang di luar lintasan MotoGP menjadi viral di media sosial. Di dalam foto itu, Sibawaeh duduk berjongkok dengan menggunakan sarung. Lalu ada dua orang di sampingnya yaitu Medan (47) yang merupakan adik ipar Sibawaeh dan Amaq Manim (57). Sibawaeh mengatakan, dirinya tak tahu jika difoto. Sebagai informasi, foto itu pertama kali diunggah oleh akun @hrc_motogp milik Tim Repsol Honda. Dirinya pun berharap lahannya seluas 3,5 hektar itu segera dibayar Indonesia Tourism Development Courporation (ITDC).", R.drawable.beritasatu));
        dataVerticals.add(new DataVertical("Perang Mulai Rabu? Ramai Negara Minta WN Tinggalkan Ukraina", "Ramai-ramai negara kini mendesak warganya untuk pergi dari Ukraina. Bahkan beberapa telah mengurangi staf diplomatik di sana.Ini terjadi di tengah makin memanasnya situasi konflik dengan Rusia. Negeri Vladimir Putin diyakini akan melakukan serangan ke bekas sesama Uni Soviet itu, dan menimbulkan ketegangan dengan NATO. Permintaan meninggalkan Kyiv dilakukan 19 negara. Yakni Amerika Serikat (AS), Jerman, Italia, Inggris, Irlandia, Belgia, Luksemburg, Belanda, Kanada, Norwegia, Estonia, Lithuania, Bulgaria, Slovenia, Australia, Jepang, Israel, Arab Saudi dan Uni Emirat Arab.", R.drawable.beritadua));
        dataVerticals.add(new DataVertical("Kasus Covid-19 di Kota Bekasi Meroket, Dinkes: Rata-rata 2 Ribu Kasus Baru Per Hari", "kasus Covid-19 di Kota Bekasi meroket. Dinas Kesehatan Kota Bekasi mencatat rata-rata 2000 kasus baru per hari. Berdasarkan data terbaru Dinkes Kota Bekasi, kasus kumulatif Covid-19 di wilayah setempat tercatat sebanyak 114.191 kasus per 11 Februari 2022. Jumlah tersebut naik sebanyak 2.227 kasus dalam satu hari dibandingkan pada 10 Februari 2022 sebanyak 111.964 kasus kumulatif.Dari total kasus secara kumulatif tersebut, pasien sembuh sebanyak 98.924 orang, sedangkan angka kematian hingga data terbaru mencapai 1.146 jiwa. Kepala Dinkes Kota Bekasi Tanti Rohilawati mengatakan, kasus Covid-19 di wilayahnya meningkat cukup drastis dalam beberapa pekan terakhir.", R.drawable.beritatiga));
        dataVerticals.add(new DataVertical("Kasus Covid-19 di Bekasi: Kecamatan Bekasi Utara Terbanyak, BOR Capai 58 Persen", "Kasus Covid-19 di Kota Bekasi terus menunjukkan tren kenaikan. Total Kasus terkonfirmasi baru pada laporan data Dinas kesehatan Kota Bekasi pada tanggal 10 Februari 2022 yakni 111.964 kasus.Sedangkan penambahan pada tanggal 11 Februari 2022 naik menjadi 114.191 kasus dengan kenaikan sekitar 2.227 kasus. Sedangkan untuk pasien sembuh berjumlah 98.924 kasus dan kasus kematian berjumlah 1.146 jiwa.Sementara itu, keterisian Bed Occupancy Rate (BOR) Tempat Tidur Rumah Sakit di Kota Bekasi tertanggal 11 Februari 2022 tren meningkat dilaporkan BOR Tempat Tidur (TT) isolasi 58,04% dari 57,17% sedangkan BOR TT ICU menurun dari 32,85% dari 33,85%. Tren Positivity Rate meningkat 19,70 % yang semula 15,2Sedangkan untuk kasus paling aktif di kelurahan kota Bekasi per data tanggal 11 Februari 2022 tercatat di Kelurahan Pejuang (536 kasus), Kelurahan Bojong Rawalumbu (528 kasus) dan Kelurahan Pekayon Jaya (486 kasus) sedangkan untuk kasus terendah berada di Kelurahan Cikiwul dan Kelurahan Bantargebang (30 kasus).", R.drawable.beritaempat));
        dataVerticals.add(new DataVertical("5 Tertinggi Kasus Covid Indonesia 13 Februari: Jawa Barat, Jakarta, Banten, Bali dan Jawa Timur", " Update kasus covid Indonesia di 34 provinsi, Minggu (13/2/2022).Kasus covid terbanyak ada di Jawa Barat, lalu disusul Jakarta dan Banten.Diketahui hari ini terdapat penambahan kasus virus corona sebanyak 44.526 kasus.Sebelumnya, Sabtu (12/2/2022), kasus positif Covid-19 bertambah 55.209 kasus.", R.drawable.beritalima));
        adapterHorizontal.notifyDataSetChanged();
        adapterHorizontalNoScroll.notifyDataSetChanged();
    }
}