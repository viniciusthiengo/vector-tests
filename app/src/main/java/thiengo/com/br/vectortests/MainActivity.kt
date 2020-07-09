package thiengo.com.br.vectortests

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import thiengo.com.br.vectortests.samples.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

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
        /*iv_ic_boat.setImageDrawable(
            //resources.getDrawable( R.drawable.ic_outline_directions_boat, null )
            ResourcesCompat.getDrawable( resources, R.drawable.ic_outline_directions_boat, null )
        )*/
    }

    fun runAnimation( v: View ){
        /*
         * Para que a animação aconteça em tela, é preciso invocar
         * animatedVectorDrawable.start() no código dinâmico.
         * */
        //(v.background as AnimatedVectorDrawable).start()

        //((v as ImageView).drawable as AnimatedVectorDrawable).start()
    }

    fun oPorqueDasImagensVetoriais( view: View ){
        val intent = Intent(
            this,
            OPorqueDasImagensVetoriaisActivity::class.java
        )
        startActivity( intent )
    }
    fun oComumCarregamentoDiretoNoXmlDeLayout(view: View ){
        val intent = Intent(
            this,
            OComumCarregamentoDiretoNoXmlDeLayoutActivity::class.java
        )
        startActivity( intent )
    }
    fun carregamentoViaKotlinApi(view: View ){
        val intent = Intent(
            this,
            CarregamentoViaKotlinApiActivity::class.java
        )
        startActivity( intent )
    }
    fun carregamentoDiretoNoXmlDeLayout(view: View ){
        val intent = Intent(
            this,
            CarregamentoDiretoNoXmlDeLayoutActivity::class.java
        )
        startActivity( intent )
    }
    fun vetorViaSuporteKotlinApi(view: View ){
        val intent = Intent(
            this,
            VetorViaSuporteKotlinApiActivity::class.java
        )
        startActivity( intent )
    }
    fun iconesInternosDeSistema(view: View ){
        val intent = Intent(
            this,
            IconesInternosDeSistemaActivity::class.java
        )
        startActivity( intent )
    }
    fun importacaoDeArquivosExternosSvgEPsd(view: View ){
        val intent = Intent(
            this,
            ImportacaoDeArquivosExternosSvgEPsdActivity::class.java
        )
        startActivity( intent )
    }
}