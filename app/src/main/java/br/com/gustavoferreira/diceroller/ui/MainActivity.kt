package br.com.gustavoferreira.diceroller.ui

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import br.com.gustavoferreira.diceroller.data.Dice
import br.com.gustavoferreira.diceroller.databinding.ActivityMainBinding

/**
 * This activity allows the user to roll a dice and view the result
 * on the screen.
 */

 class MainActivity : AppCompatActivity() {
    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater)}
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)


        binding.rollBtn.setOnClickListener {
            rollDice()

        }
    }
    /**
     * Roll the dice and update the screen with the result.
     */
    private fun rollDice() {
        // Create new Dice object with 6 sides and roll it
        val diceSixSides = Dice (6)
        val diceRollSix = diceSixSides.roll()

        val diceTwentySides = Dice (20)
        val diceRollTwenty = diceTwentySides.roll()

        // Update the screen with the dice roll six sides
        val resultDiceSixSides: TextView = binding.diceSixSides
        resultDiceSixSides.text = diceRollSix.toString()

        // Update the screen with the dice roll twenty sides
        val resultDiceTwentySides: TextView = binding.diceTwentySides
        resultDiceTwentySides.text = diceRollTwenty.toString()

    }


}