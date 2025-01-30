class Libro(val titulo: String,
    val autor: String,
    val paginas: Int,
    val calificacion: Int) {

    init {
        require(calificacion > 0 ||  calificacion < 10) {"La calificacion debe de estar en un rango de 0-10. "}
    }
    override fun toString(): String {
        return "Titulo: $titulo, Autor: $autor, Paginas: $paginas, Calificacion: $calificacion"
    }

    override fun hashCode(): Int {
        return super.hashCode()
    }

    override fun equals(other: Any?): Boolean {
        return super.equals(other)
    }
}