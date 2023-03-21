/*
 * Copyright (C) 2020 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.example.affirmations

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.recyclerview.widget.RecyclerView
import com.example.affirmations.adapter.CatAdapter
import com.example.affirmations.data.Cat


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Initialize data.
        val myDataset = Cat("John", 30).loadAffirmations()

        val recyclerView = findViewById<RecyclerView>(R.id.recycler_view)
        recyclerView.adapter = CatAdapter(this, myDataset)

        // Use this setting to improve performance if you know that changes
        // in content do not change the layout size of the RecyclerView
        recyclerView.setHasFixedSize(true)
    }
}










/*class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Отримуємо доступ до кнопки
        val button = findViewById<Button>(R.id.button)

        // Встановлюємо слухача натискань на кнопку
        button.setOnClickListener {
            // Створюємо екземпляр дата-класу зі значенням "12345"
            val myData = MyDataClass("12345")

            // Створюємо інтент для переходу на SecondActivity
            val intent = Intent(this, SecondActivity::class.java)

            // Додаємо наші дані до інтента
            intent.putExtra("myData", myData)

            // Запускаємо SecondActivity
            startActivity(intent)
        }
    }
}

private fun Intent.putExtra(s: String, myData: MyDataClass) {

}

class SecondActivity {

}

class MyDataClass(s: String) {

}
*/

