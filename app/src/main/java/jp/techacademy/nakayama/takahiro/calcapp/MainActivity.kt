package jp.techacademy.nakayama.takahiro.calcapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.util.Log

import kotlinx.android.synthetic.main.activity_main.*
import android.view.Menu
import android.view.MenuItem
import android.content.Intent


class MainActivity : AppCompatActivity(),View.OnClickListener{

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        button1.setOnClickListener(this)
        button2.setOnClickListener(this)
        button3.setOnClickListener(this)
        button4.setOnClickListener(this)

    }

    override fun onClick(v: View) {


        var num1 = editText1.text.toString()
        var num2 = editText2.text.toString()


        if (num1 == ""  || num2 == "") {


            Log.d("kotlintest", "nullnullnull")

        } else{

            var num3 = num1.toDouble()
            var num4 = num2.toDouble()


            var num = 0.00


            try {


                if (v.id == R.id.button1) {

                    num = num3 + num4
                    Log.d("kotlintest", "+計算しました")


                } else if (v.id == R.id.button2) {

                    num = num3 - num4
                    Log.d("kotlintest", "-計算しました")

                } else if (v.id == R.id.button3) {

                    num = num3 * num4
                    Log.d("kotlintest", "*計算しました")

                }

                else {

                    num = num3 / num4
                    Log.d("kotlintest", "/計算しました")
                }
            }catch (e: Exception){

                Log.d("kotlintest", "0で割ろうとしました")


            }  finally{

                val intent = Intent(this, SecondActivity::class.java)
                intent.putExtra("VALUE1", num)

                startActivity(intent)

            }


        }

    }



}

