package com.example.loancalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import kotlinx.android.synthetic.*
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    @Override
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonCalculate.setOnClickListener(){
                makeCalculation()


        }









        //buttonCalculate.setOnClickListener(){
            //val value: Double = editTextCarPrice.text.toString().toDouble()
            //val price: Double = value + 10.123456
           // buttonCalculate.text = "%.2f".format(price)
        //}

    }

    private fun makeCalculation(){
        val carPrice = findViewById<EditText>(R.id.editTextCarPrice)
        val downPayment = findViewById<EditText>(R.id.editTextDownPayment)
        val loanPeriod = findViewById<EditText>(R.id.editTextLoanPeriod)
        val interestRate = findViewById<EditText>(R.id.editTextInterestRate)

        val input1 = carPrice.text.toString().toDouble()
        val input2 = downPayment.text.toString().toDouble()
        val input3 = loanPeriod.text.toString().toDouble()
        val input4 = interestRate.text.toString().toDouble()

        val carLoan: Double   = input1 - input2
        val interest: Double = (carLoan * input4 * input3)/100
        val monthlyRepay: Double = (carLoan+interest)/input3/12

        textViewLoan.text = "%.2f".format(carLoan)
        textViewInterest.text = "%.2f".format(interest)
        textViewMonthlyRepayment.text = "%.2f".format(monthlyRepay)





    }
}
