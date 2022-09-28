package com.example.mine

import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn = findViewById<Button>(R.id.button)
        val btn2 = findViewById<Button>(R.id.button2)
        val biodata = arrayOf("Nasywa Sukria Hanifa", "XI PPLG 1", "3018")

        btn.setOnClickListener {
            AlertDialog.Builder(this)
                .setTitle("Biodata")
                .setItems(biodata,  DialogInterface.OnClickListener { dialog, which ->
                })
                .setPositiveButton("Yes", DialogInterface.OnClickListener { DialogInterface, i ->
                })
                .setNegativeButton("No", DialogInterface.OnClickListener { DialogInterface, i ->
                })
                .show()
        }
        btn2.setOnClickListener {
            val inflater = layoutInflater
            val dialoglayout = inflater.inflate(R.layout.activity_dialog, null)
            val editText = dialoglayout.findViewById<EditText>(R.id.editText)
            AlertDialog.Builder(this)
                .setTitle("Masukkan Nama Lengkap")
                .setView(dialoglayout)
                // Add action buttons
                .setPositiveButton("Benar",
                    DialogInterface.OnClickListener { dialogInterface, i ->
                        Toast.makeText(this,"Nama kamu adalah " + editText.getText().toString(), Toast.LENGTH_SHORT).show()
                    })
                .setNegativeButton("Batal",
                    DialogInterface.OnClickListener { dialogInterface, i ->
                    })
                .show()
        }
}
}