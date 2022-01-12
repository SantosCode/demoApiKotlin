open class Pessoa(private val nome: String) {
    val nomeUp = this.nome.uppercase()
}

class Fisica(
    val cpf: String,
    val nomePessoa: String
) : Pessoa(nomePessoa) {
    var apelido: String? = null
        get() {
            return if (field.isNullOrEmpty()) "Nenhum" else field?.uppercase()
        }
        set(value) {
            field = if (value.isNullOrEmpty()) "Nenhum" else value.uppercase()
        }

    constructor(
        cpf: String,
        nomePessoa: String,
        apelido: String?
    ) : this(cpf, nomePessoa) {
        this.apelido = apelido
    }
}

class Juridica(
    val cnpj: String,
    val nomeEmpresa: String
) : Pessoa(nomeEmpresa)

fun verificaPessa(pessoa: Pessoa): String {
    return when (pessoa) {
        is Fisica -> "Pessoa Fisica: ${pessoa.nomeUp} Apelido: ${pessoa.apelido} CPF: ${pessoa.cpf}"
        is Juridica -> "Pessoa Juridica: ${pessoa.nomeEmpresa} CNPJ: ${pessoa.cnpj}"
        else -> "Pessoa Desconhecida"
    }
}

val pessoa = Fisica("23000078700", "João")
val empresa = Juridica("0988000109", "empresa")

println(verificaPessa(pessoa))
println(verificaPessa(empresa))