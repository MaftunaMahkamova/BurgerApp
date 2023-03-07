package uz.itschool.burgerapp

import android.view.LayoutInflater
import android.view.TextureView
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.RecyclerView

class MenuAdapter(var foods:MutableList<Food>): RecyclerView.Adapter<MenuAdapter.MyHolder>() {
    class MyHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val name = itemView.findViewById<TextView>(R.id.name)
        val price = itemView.findViewById<TextView>(R.id.price)
        val fon = itemView.findViewById<CardView>(R.id.cardView)
        val img_food = itemView.findViewById<ImageView>(R.id.img_food)
        val cl = itemView.findViewById<ConstraintLayout>(R.id.cl)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyHolder {
        return MyHolder(LayoutInflater.from(parent.context).inflate(R.layout.menu, parent, false))
    }

    override fun onBindViewHolder(holder: MyHolder, position: Int) {
        var food = foods.get(position)
        holder.name.text = food.name
        holder.price.text = food.food_price
        holder.fon.setCardBackgroundColor(food.fon)
        holder.img_food.setImageResource(food.img)
    }

    override fun getItemCount(): Int {
        return foods.size
    }

//    interface myFoodInterface {
//        fun onClick(food: Food, position: Int)
//}
}