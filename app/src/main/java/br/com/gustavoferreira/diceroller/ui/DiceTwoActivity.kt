package br.com.gustavoferreira.diceroller.ui

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import br.com.gustavoferreira.diceroller.data.Dice
import br.com.gustavoferreira.diceroller.databinding.ActivityDiceTwoBinding

class DiceTwoActivity : AppCompatActivity() {
    private val binding by lazy { ActivityDiceTwoBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        //fechar tela dado d20
        binding.closeBtn.setOnClickListener {
            finish()
        }
        //rolar o dado d20
        binding.rollBtn.setOnClickListener {
            rollD20()
        }
    }

    private fun rollD20() {
        // Create new Dice object with 6 sides and roll the dice
        val dice = Dice(20)
        val diceRoll = dice.roll()

        // Find the TextView in the layout
        val diceTextView: TextView = binding.tvD20

        val resultD20side = when (diceRoll){
            1 -> "[1]"
            2 -> "[2]"
            3 -> "[3]"
            4 -> "[4]"
            5 -> "[5]"
            6 -> "[6]"
            7 -> "[7]"
            8 -> "[8]"
            9 -> "[9]"
            10 -> "[10]"
            11 -> "[11]"
            12 -> "[12]"
            13 -> "[13]"
            14 -> "[14]"
            15 -> "[15]"
            16 -> "[16]"
            17 -> "[17]"
            18 -> "[18]"
            19 -> "[19]"
            else -> "[20]"

        }

        val  resultD20: TextView = binding.tvD20
        resultD20.text = diceRoll.toString()
    }
}