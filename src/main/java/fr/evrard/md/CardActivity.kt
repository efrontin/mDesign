package fr.evrard.md

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.card_layout.*

class CardActivity : AppCompatActivity() {

    private var favBool = true

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.card_layout)


        ui_title_card.text = resources.getStringArray(R.array.myPlant)[2]

        ui_image_button1.setOnClickListener {
            if (favBool){
                    ui_image_button1.setBackgroundResource(R.drawable.iconfinder_heart_black)
                }
            else
                ui_image_button1.setBackgroundResource(R.drawable.iconfinder_heart_red)
            favBool= !favBool

        }
    }

}
