package com.user.demoproject

import android.graphics.Bitmap
import android.graphics.BitmapFactory
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Data
        var hospitalNames = ArrayList<String>()
        hospitalNames.add("Beyşehir Devlet Hastanesi")
        hospitalNames.add("Çumra Devlet Hastanesi")
        hospitalNames.add("Dr. Ali Kemal Belviranlı Hastanesi")
        hospitalNames.add("Ereğli Devlet Hastanesi")
        hospitalNames.add("Kulu Devlet Hastanesi")
        hospitalNames.add("Meram Devlet Hastanesi")
        hospitalNames.add("Konya Numune Hastanesi")
        hospitalNames.add("Konya Şehir Hastanesi")

        // Addresses
        var hospitalAddresses = ArrayList<String>()
        hospitalAddresses.add("\nBeyşehir İlçe Devlet Hastanesi Esentepe Mahallesi 40525.Sokak No:1 Beyşehir / Konya")
        hospitalAddresses.add("\nMeydan Mahallesi Hastane Cad. NO:6 ULAŞIM:Çumra Genelinden Kalkan Hastane Dolmuşları İle Hastanemize Ulaşım Sağlayabilirsiniz")
        hospitalAddresses.add("\nFatih Mahallesi, Yeni İstanbul Cd. No:30, 42285 (Şehitler Cami Tramvay Durağı Karşısı) Selçuklu/Konya")
        hospitalAddresses.add("\nToros Mah. Şehit Metin Düzgün Cad. No:1/A Ereğli/KONYA")
        hospitalAddresses.add("\nYeni Mahalle Ahmet Baran Caddesi Kozanlı Yolu Kulu / Konya")
        hospitalAddresses.add("\nAyanbey Mah.Yeni Meram Cad.No:97 Meram/Konya")
        hospitalAddresses.add("\nFerhuniye Mah. Hastane Cd. No:22, 42060 Selçuklu / KONYA")
        hospitalAddresses.add("\nAkabe Mah. Adana Çevre Yolu Cad. No:135 42020 Karatay / KONYA")

        //Bitmaps
        val beysehirBitmap = BitmapFactory.decodeResource(applicationContext.resources, R.drawable.beysehir)
        val cumraBitmap = BitmapFactory.decodeResource(applicationContext.resources, R.drawable.cumra)
        val drAliBitmap = BitmapFactory.decodeResource(applicationContext.resources, R.drawable.dr_ali_kemal_kadin_dogum)
        val eregliBitmap = BitmapFactory.decodeResource(applicationContext.resources, R.drawable.eregli)
        val kuluBitmap = BitmapFactory.decodeResource(applicationContext.resources, R.drawable.kulu)
        val meramBitmap = BitmapFactory.decodeResource(applicationContext.resources, R.drawable.meram)
        val numuneBitmap = BitmapFactory.decodeResource(applicationContext.resources, R.drawable.numune)
        val sehirBitmap = BitmapFactory.decodeResource(applicationContext.resources, R.drawable.sehir_hastanesi)

        var hospitalImages = ArrayList<Bitmap>()
        hospitalImages.add(beysehirBitmap)
        hospitalImages.add(cumraBitmap)
        hospitalImages.add(drAliBitmap)
        hospitalImages.add(eregliBitmap)
        hospitalImages.add(kuluBitmap)
        hospitalImages.add(meramBitmap)
        hospitalImages.add(numuneBitmap)
        hospitalImages.add(sehirBitmap)

        //Adapter
        val layoutManager = LinearLayoutManager(this)
        recyclerView.layoutManager = layoutManager

        val adapter =RecyclerAdapter(hospitalNames, hospitalAddresses, hospitalImages)
        recyclerView.adapter= adapter
    }
}