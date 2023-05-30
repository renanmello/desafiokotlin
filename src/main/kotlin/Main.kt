class Main {

    fun main(){
        val conteudo1 = ConteudoEducacional("Introdução à Programação", 90)
        val conteudo2 = ConteudoEducacional("Algoritmos Avançados", 120)
        val conteudos = listOf(conteudo1, conteudo2)

        val formacao = Formacao("Formação em Programação", conteudos)

        val usuario1 = Usuario()
        val usuario2 = Usuario()

        formacao.matricular(usuario1)
        formacao.matricular(usuario2)

        println(formacao.inscritos)
    }
}