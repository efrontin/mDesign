package fr.evrard.md

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_grid.*
import org.jetbrains.anko.*

class GridActivity : AppCompatActivity(), AnkoLogger {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_grid)

        email.setOnClickListener {
            email("hello@chillcoding.com", "Hello World")
        }

        on_share.setOnClickListener {
            share("https://stackoverflow.com/")
        }

        on_toast.setOnClickListener {
            toast("Battle Royale")
        }

        gridStartView.setOnClickListener {
            startActivity<CardActivity>()
        }

        on_alert.setOnClickListener {
            alert("Vous avez reçu une notification") {
                yesButton { toast("cette notification s'est auto-détruite") }
                noButton { }
            }.show()
        }

    }



}
