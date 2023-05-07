package com.example.diploma

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView

class DishListsAdapter(private val context: Context, private val arrayList: ArrayList<Dish>): BaseAdapter() {
    private lateinit var dishName: TextView
    private lateinit var dishCal: TextView
    private lateinit var dishProt: TextView
    private lateinit var dishFat: TextView
    private lateinit var dishCarbo: TextView

    override fun getCount(): Int {
        return arrayList.size
    }

    override fun getItem(position: Int): Any {
        return position
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        var convert = convertView
        convert = LayoutInflater.from(context).inflate(R.layout.dish_list_item, parent, false)
        dishName = convert.findViewById(R.id.dishNameTextView)
        dishCal = convert.findViewById(R.id.caloriesTextView)
        dishProt = convert.findViewById(R.id.proteinTextView)
        dishFat = convert.findViewById(R.id.fatTextView)
        dishCarbo = convert.findViewById(R.id.carboTextView)

        dishName.text = arrayList[position].name + " " + arrayList[position].gram.toString() + " " + context.getString(R.string.gram_textView_end)
        dishCal.text = arrayList[position].calorie.toString() + " "+ context.getString(R.string.calories_textView_end)
        dishProt.text = context.getString(R.string.protein_textView_st) + " " + arrayList[position].prot.toString() + context.getString(R.string.gram_textView_end)
        dishFat.text = context.getString(R.string.fat_textView_st) + " " + arrayList[position].fat.toString() + context.getString(R.string.gram_textView_end)
        dishCarbo.text = context.getString(R.string.carbohydrate_textView_st) + " " + arrayList[position].carbo.toString() + context.getString(R.string.gram_textView_end)



        return convert
    }

}