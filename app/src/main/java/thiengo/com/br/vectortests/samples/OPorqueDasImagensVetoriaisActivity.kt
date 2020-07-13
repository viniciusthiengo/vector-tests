package thiengo.com.br.vectortests.samples

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import thiengo.com.br.vectortests.MainActivity

class OPorqueDasImagensVetoriaisActivity : AppCompatActivity() {

    override fun onCreate( savedInstanceState: Bundle? ) {
        super.onCreate( savedInstanceState )

        setContentView(
            intent.getIntExtra(
                MainActivity.LAYOUT_ID,
                0
            )
        )
    }
}