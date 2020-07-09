package thiengo.com.br.vectortests.samples

import android.graphics.Color
import android.graphics.PorterDuff
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_carrgamento_via_kotlin_api.*
import thiengo.com.br.vectortests.R

class CarregamentoViaKotlinApiActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_carrgamento_via_kotlin_api)

        /*
         * A seguir estamos carregando, via Kotlin API, uma imagem
         * vetorial em um ImageView.
         *
         * Carregando utilizando a API de suporte, pois neste
         * projeto de exemplo estamos dando suporte a partir do
         * Android API 16 (Jelly Bean).
         *
         * Caso contrário poderiamos utilizar direto o
         * resource.getDrawable().
         *
         * Lembrando que tanto Bitmap quanto Vector são Drawables.
         *
         * Drawable, de forma geral, é qualquer recurso que pode
         * ser desenhado em tela.
         * */
        iv_vector_sample.setImageDrawable(
            resources.getDrawable(
                R.drawable.ic_baseline_sports_esports,
                null
            )
        )

        iv_vector_sample.setColorFilter(
            Color.BLUE,
            PorterDuff.Mode.SRC_IN
        )
    }
}