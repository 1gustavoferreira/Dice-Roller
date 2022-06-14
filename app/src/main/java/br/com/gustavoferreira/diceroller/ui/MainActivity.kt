package br.com.gustavoferreira.diceroller.ui

import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import br.com.gustavoferreira.diceroller.R
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

    private fun rollDice()  {
        // Create new Dice object with 6 sides and roll the dice
        val dice = Dice(6)
        val diceRoll = dice.roll()

        // Find the ImageView in the layout
        val diceImage: ImageView = binding.ivDice

        // Determine which drawable resource ID to use based on the dice roll
        val drawableResource = when (diceRoll) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        // Update the ImageView with the correct drawable resource ID
        diceImage.setImageResource(drawableResource)

        // Update the content description
        diceImage.contentDescription = diceRoll.toString()

        //val diceTwentySides = Dice (20)
        //val diceRollTwenty = diceTwentySides.roll()

        // Update the screen with the dice roll six sides


// Update the screen with the dice roll 20 sides
        //val resultDiceTwentySides: TextView = binding.diceTwentySides
        //resultDiceTwentySides.text = diceRollTwenty.toString()
    }

}