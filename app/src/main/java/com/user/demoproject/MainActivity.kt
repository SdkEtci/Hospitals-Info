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
        hospitalNames.add("Beysehir")
        hospitalNames.add("Cumra")
        hospitalNames.add("Dr_Ali_Kemal_Kadin_Dogum")
        hospitalNames.add("Eregli")
        hospitalNames.add("Kulu")
        hospitalNames.add("Meram")
        hospitalNames.add("Numune")
        hospitalNames.add("Sehir_hastanesi")

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

        val adapter =RecyclerAdapter(hospitalNames, hospitalImages)
        recyclerView.adapter= adapter
    }
}