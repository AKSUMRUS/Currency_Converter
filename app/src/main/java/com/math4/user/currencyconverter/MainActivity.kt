package com.math4.user.currencyconverter

import android.os.Bundle
import android.view.KeyEvent
import android.view.View
import android.view.View.GONE
import android.view.View.VISIBLE
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    var entered = 0


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val editTextUSD = findViewById<EditText>(R.id.editTextUSD)
        val editTextRUB = findViewById<EditText>(R.id.editTextRUB)
        editTextRUB.visibility = GONE
        val editTextEUR = findViewById<EditText>(R.id.editTextEUR)
        editTextEUR.visibility = GONE
        val editTextGBR = findViewById<EditText>(R.id.editTextGBR)
        editTextGBR.visibility = GONE
        val editTextUAH = findViewById<EditText>(R.id.editTextUAH)
        editTextUAH.visibility = GONE


        val textViewUSD = findViewById<TextView>(R.id.textView)
        textViewUSD.visibility = GONE
        val textViewRUB = findViewById<TextView>(R.id.textView1)
        val textViewEUR = findViewById<TextView>(R.id.textView2)
        val textViewGBR = findViewById<TextView>(R.id.textView3)
        val textViewUAH = findViewById<TextView>(R.id.textView4)


        editTextUSD.setOnKeyListener(object : View.OnKeyListener {
            override fun onKey(v: View?, keyCode: Int, event: KeyEvent): Boolean {
                if (editTextUSD.text.toString() != "") {
                    // сохраняем текст, введенный до нажатия Enter в переменную
                    entered = editTextUSD.text.toString().toInt()
                    val rub = entered*74
                    val eur = entered*0.9
                    val gbr = entered*0.81
                    val uah = entered*26.84
                    textViewRUB.text = rub.toString()
                    textViewEUR.text = eur.toString()
                    textViewGBR.text = gbr.toString()
                    textViewUAH.text = uah.toString()
                }
                else clear(textViewUSD,textViewRUB,textViewEUR,textViewGBR,textViewUAH)
                return false
            }
        }
        )
        editTextRUB.setOnKeyListener(object : View.OnKeyListener {
            override fun onKey(v: View?, keyCode: Int, event: KeyEvent): Boolean {
                if (editTextRUB.text.toString() != "") {
                    // сохраняем текст, введенный до нажатия Enter в переменную
                    entered = editTextRUB.text.toString().toInt()
                    val usd = entered*0.014
                    val eur = entered*0.013
                    val gbr = entered*0.012
                    val uah = entered*0.38
                    textViewUSD.text = usd.toString()
                    textViewEUR.text = eur.toString()
                    textViewGBR.text = gbr.toString()
                    textViewUAH.text = uah.toString()
                }
                else clear(textViewUSD,textViewRUB,textViewEUR,textViewGBR,textViewUAH)
                return false
            }
        }
        )
        editTextEUR.setOnKeyListener(object : View.OnKeyListener {
            override fun onKey(v: View?, keyCode: Int, event: KeyEvent): Boolean {
                if (editTextEUR.text.toString() != "") {
                    // сохраняем текст, введенный до нажатия Enter в переменную
                    entered = editTextEUR.text.toString().toInt()
                    val usd = entered*1.11
                    val rub = entered*77.89
                    val gbr = entered*0.9
                    val uah = entered*29.81
                    textViewUSD.text = usd.toString()
                    textViewRUB.text = rub.toString()
                    textViewGBR.text = gbr.toString()
                    textViewUAH.text = uah.toString()
                }
                else clear(textViewUSD,textViewRUB,textViewEUR,textViewGBR,textViewUAH)
                return false
            }
        }
        )
        editTextGBR.setOnKeyListener(object : View.OnKeyListener {
            override fun onKey(v: View?, keyCode: Int, event: KeyEvent): Boolean {
                if (editTextGBR.text.toString() != "") {
                    // сохраняем текст, введенный до нажатия Enter в переменную
                    entered = editTextGBR.text.toString().toInt()
                    val usd = entered*1.23
                    val rub = entered*86.58
                    val eur = entered*1.11
                    val uah = entered*33.13
                    textViewUSD.text = usd.toString()
                    textViewRUB.text = rub.toString()
                    textViewEUR.text = eur.toString()
                    textViewUAH.text = uah.toString()
                }
                else clear(textViewUSD,textViewRUB,textViewEUR,textViewGBR,textViewUAH)
                return false
            }
        }
        )
        editTextUAH.setOnKeyListener(object : View.OnKeyListener {
            override fun onKey(v: View?, keyCode: Int, event: KeyEvent): Boolean {
                if (editTextUAH.text.toString() != "") {
                    // сохраняем текст, введенный до нажатия Enter в переменную
                    entered = editTextUAH.text.toString().toInt()
                    val usd = entered*0.037
                    val rub = entered*2.61
                    val eur = entered*0.34
                    val gbr = entered*0.3
                    textViewUSD.text = usd.toString()
                    textViewRUB.text = rub.toString()
                    textViewEUR.text = eur.toString()
                    textViewGBR.text = gbr.toString()
                }
                else clear(textViewUSD,textViewRUB,textViewEUR,textViewGBR,textViewUAH)
                return false
            }
        }
        )


        textViewUSD.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {
                editTextUSD.text.clear()
                editTextUSD.visibility = VISIBLE
                textViewUSD.visibility = GONE
                editTextEUR.visibility = GONE
                textViewEUR.visibility = VISIBLE
                editTextGBR.visibility = GONE
                textViewGBR.visibility = VISIBLE
                editTextRUB.visibility = GONE
                textViewRUB.visibility = VISIBLE
                editTextUAH.visibility = GONE
                textViewUAH.visibility = VISIBLE
                clear(textViewUSD,textViewRUB,textViewEUR,textViewGBR,textViewUAH)
            }
        })
        textViewRUB.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {
                editTextRUB.text.clear()
                editTextUSD.visibility = GONE
                textViewUSD.visibility = VISIBLE
                editTextEUR.visibility = GONE
                textViewEUR.visibility = VISIBLE
                editTextGBR.visibility = GONE
                textViewGBR.visibility = VISIBLE
                editTextRUB.visibility = VISIBLE
                textViewRUB.visibility = GONE
                editTextUAH.visibility = GONE
                textViewUAH.visibility = VISIBLE
                clear(textViewUSD,textViewRUB,textViewEUR,textViewGBR,textViewUAH)
            }
        })
        textViewEUR.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {
                editTextEUR.text.clear()
                editTextUSD.visibility = GONE
                textViewUSD.visibility = VISIBLE
                editTextEUR.visibility = VISIBLE
                textViewEUR.visibility = GONE
                editTextGBR.visibility = GONE
                textViewGBR.visibility = VISIBLE
                editTextRUB.visibility = GONE
                textViewRUB.visibility = VISIBLE
                editTextUAH.visibility = GONE
                textViewUAH.visibility = VISIBLE
                clear(textViewUSD,textViewRUB,textViewEUR,textViewGBR,textViewUAH)
            }
        })
        textViewGBR.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {
                editTextGBR.text.clear()
                editTextUSD.visibility = GONE
                textViewUSD.visibility = VISIBLE
                editTextEUR.visibility = GONE
                textViewEUR.visibility = VISIBLE
                editTextGBR.visibility = VISIBLE
                textViewGBR.visibility = GONE
                editTextRUB.visibility = GONE
                textViewRUB.visibility = VISIBLE
                editTextUAH.visibility = GONE
                textViewUAH.visibility = VISIBLE
                clear(textViewUSD,textViewRUB,textViewEUR,textViewGBR,textViewUAH)
            }
        })
        textViewUAH.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {
                editTextUAH.text.clear()
                editTextUSD.visibility = GONE
                textViewUSD.visibility = VISIBLE
                editTextEUR.visibility = GONE
                textViewEUR.visibility = VISIBLE
                editTextGBR.visibility = GONE
                textViewGBR.visibility = VISIBLE
                editTextRUB.visibility = GONE
                textViewRUB.visibility = VISIBLE
                editTextUAH.visibility = VISIBLE
                textViewUAH.visibility = GONE
                clear(textViewUSD,textViewRUB,textViewEUR,textViewGBR,textViewUAH)
            }
        })
    }

    fun clear(usd: TextView,rub: TextView, eur: TextView, gbr: TextView, uah: TextView){
        usd.text = "0"
        rub.text = "0"
        eur.text = "0"
        gbr.text = "0"
        uah.text = "0"
    }

}

