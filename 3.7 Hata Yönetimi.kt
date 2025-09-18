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

        // "furkan" sayıya çevrilemez -> hata (NumberFormatException)
        // try-catch ile hata yakalanır, uygulama çökmez
        try {
            val ornek = "furkan"
            val ornek2 = ornek.toInt()
        } catch (e: Exception) {
            e.printStackTrace() // hata logcat’e basılır
        }
    }

    fun intornull(str: String) : Int? {
        // Sayıya çevrilemiyorsa null döner
        return try {
            str.toInt()
        } catch (e: Exception) {
            null
        }
    }
}
