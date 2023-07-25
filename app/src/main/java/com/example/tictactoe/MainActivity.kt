package com.example.tictactoe

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
      private lateinit var btn1:Button
      private lateinit var btn2:Button
      private lateinit var btn3:Button
      private lateinit var btn4:Button
      private lateinit var btn5:Button
      private lateinit var btn6:Button
      private lateinit var btn7:Button
      private lateinit var btn8:Button
      private lateinit var btn9:Button
      private var flag:Int = 0
      private var count:Int = 0
     private lateinit var b1:String
     private lateinit var b2:String
     private lateinit var b3:String
     private lateinit var b4:String
     private lateinit var b5:String
     private lateinit var b6:String
     private lateinit var b7:String
     private lateinit var b8:String
     private lateinit var b9:String
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        init()


    }

    private fun  init(){


        btn1 = findViewById(R.id.btn1)
        btn2 = findViewById(R.id.btn2)
        btn3 = findViewById(R.id.btn3)
        btn4 = findViewById(R.id.btn4)
        btn5 = findViewById(R.id.btn5)
        btn6 = findViewById(R.id.btn6)
        btn7 = findViewById(R.id.btn7)
        btn8 = findViewById(R.id.btn8)
        btn9 = findViewById(R.id.btn9)
    }

    fun check(v:View){

         val btnCurrent: Button = v as Button


        if(btnCurrent.text.toString() == "") {
            count++

            if (flag == 0) {
                btnCurrent.text = "X"
                flag = 1
            } else {
                btnCurrent.text = "O"
                flag = 0
            }
            if (count > 4) {
                b1 = btn1.text.toString()
                b2 = btn1.text.toString()
                b3 = btn1.text.toString()
                b4 = btn1.text.toString()
                b5 = btn1.text.toString()
                b6 = btn1.text.toString()
                b7 = btn1.text.toString()
                b8 = btn1.text.toString()
                b9 = btn1.text.toString()

                if (b1 == b5 && b5 == b9 && b1!="") {
                    //1
                    Toast.makeText(this, "Winner is: ${this.b5}", Toast.LENGTH_SHORT).show()
                    gameOver()
                }
                 else if (b3 == b5 && b5 == b7 && b3 != "") {
                    //2
                    Toast.makeText(this, "Winner is: ${this.b5}", Toast.LENGTH_SHORT).show()
                    gameOver()
                } else if (b1 == b2 && b2 == b3 && b2 != "") {
                    //3
                    Toast.makeText(this, "Winner is: ${this.b2}", Toast.LENGTH_SHORT).show()
                    gameOver()
                } else if (b4 == b5 && b5 == b6 && b4 != "") {
                    //4
                    Toast.makeText(this, "Winner is: ${this.b4}", Toast.LENGTH_SHORT).show()
                    gameOver()
                } else if (b7 == b8 && b8 == b9 && b7 !="") {
                    //5
                    Toast.makeText(this, "Winner is: ${this.b7}", Toast.LENGTH_SHORT).show()
                    gameOver()
                } else if (b3 == b6 && b6 == b9 && b3 != "") {
                    //6
                    Toast.makeText(this, "Winner is: ${this.b3}", Toast.LENGTH_SHORT).show()
                    gameOver()
                } else if (b2 == b5 && b5 == b8 && b2 != "") {
                    //7
                    Toast.makeText(this, "Winner is: ${this.b2}", Toast.LENGTH_SHORT).show()
                    gameOver()
                } else if (b1 == b4 && b4 == b7 && b1 != "") {
                    //8
                    Toast.makeText(this, "Winner is: ${this.b1}", Toast.LENGTH_SHORT).show()
                    gameOver()
                }
                else if(b1!="" && b2!="" && b3!=""
                        && b4!="" && b5!="" && b6!=""
                        &&b7!="" && b8!="" && b9!="") {

                        Toast.makeText(this, "Game is Drawn", Toast.LENGTH_SHORT).show()
                        gameOver()
                    }
                }
            }



        }

        private fun gameOver(){
            btn1.text = ""
            btn2.text = ""
            btn3.text = ""
            btn4.text = ""
            btn5.text = ""
            btn6.text = ""
            btn7.text = ""
            btn8.text = ""
            btn9.text = ""
            count = 0
            flag = 0
        }

    }




























