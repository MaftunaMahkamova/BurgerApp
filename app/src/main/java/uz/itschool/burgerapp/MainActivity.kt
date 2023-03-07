package uz.itschool.burgerapp

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView.Adapter
import uz.itschool.burgerapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var burger_Ingredient: MutableList<Ingredient> = mutableListOf()
        burger_Ingredient.add(Ingredient("Pishloq", R.drawable.img_3))
        burger_Ingredient.add(Ingredient("Pomidor", R.drawable.img_4))
        burger_Ingredient.add(Ingredient("Kotlet", R.drawable.kotlet))

        var donut_Ingredient: MutableList<Ingredient> = mutableListOf()
        burger_Ingredient.add(Ingredient("Tuxum", R.drawable.tuxum))
        burger_Ingredient.add(Ingredient("Bezaklar", R.drawable.bezaklar))
        burger_Ingredient.add(Ingredient("Krem", R.drawable.cream))

        var lavash_Ingredient: MutableList<Ingredient> = mutableListOf()
        burger_Ingredient.add(Ingredient("Go'sht", R.drawable.meat))
        burger_Ingredient.add(Ingredient("Chips", R.drawable.chips))
        burger_Ingredient.add(Ingredient("Bodring", R.drawable.cucumber))

        var food: MutableList<Food> = mutableListOf()
        food.add(
            Food(
                "Mr.Cheezy!",
                "Get for only $3",
                burger_Ingredient,
                R.drawable.img,
                Color.parseColor("#84A59D")
            )
        )
        food.add(
            Food(
                "Free fries",
                "For orders over $5",
                burger_Ingredient,
                R.drawable.img_1,
                Color.parseColor("#F6BD60")
            )
        )
        food.add(
            Food(
                "Yummy donut!",
                "Buy for $4",
                burger_Ingredient,
                R.drawable.donut,
                Color.parseColor("#F28482")
            )
        )

        val adapter = MenuAdapter(food)
        val manager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        binding.rv1.adapter = adapter
        binding.rv1.layoutManager = manager

    }
}