//Ödev Koşulları
//Çalışanlar sınıfı oluşturulacak
//Çalışan isim, maaş, departmant, yaş bilgileri olacak
//10 örnek çalışan olacak bir listede tutulacak
//Okunabilir çalışan ismi olacak
//maas bilgileri okunamayacak yalnızca fonksiyon ile gösterilecek
//Main activity içerisinde  -> 30 yaşından büyük olanların departmanlarını listele
//Aynı şekilde 25'ten küçüklerin ise sadece ismi tutulan liste olacak

package com.furkhangul.furoftheweak

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // 10 örnek çalışan oluştur
        val workers = arrayListOf(
            Worker("Furkan", 3000, "Software Engineer", 20),
            Worker("Kenan", 3021, "Teacher", 21),
            Worker("Ali", 4500, "Doctor", 35),
            Worker("Veli", 2800, "Nurse", 40),
            Worker("Ayşe", 3200, "Designer", 24),
            Worker("Fatma", 5000, "Manager", 45),
            Worker("Mehmet", 2700, "Technician", 19),
            Worker("Elif", 3800, "HR", 31),
            Worker("Osman", 2900, "Engineer", 22),
            Worker("Zeynep", 4100, "Lawyer", 29)
        )

        // 30 yaşından büyüklerin departman listesi
        val deptOver30 = workers.filter { it.age > 30 }.map { it.departmant }
        println("30 yaşından büyüklerin departmanları: $deptOver30")

        // 25 yaşından küçüklerin isim listesi
        val namesUnder25 = workers.filter { it.age < 25 }.map { it.name }
        println("25 yaşından küçüklerin isimleri: $namesUnder25")
    }
}

// Çalışan sınıfı
class Worker(val name: String, private val wage: Int, val departmant: String, val age: Int) {
    fun getWage(): Int {
        return wage
    }
}
