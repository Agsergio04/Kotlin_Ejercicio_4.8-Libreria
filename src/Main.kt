//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val libro1 = Libro("Vampiro la mascarada","Mark Rein-Hagen",150,7)
    val libro2 = Libro("The Horus Heresy nº 47/54 Vieja Tierra"," Nick Kyme",499,9)

    val libreria = ConjuntoLibros()

    libreria.aniadirLibro(libro1)
    libreria.aniadirLibro(libro2)

    libreria.mostrarLibros()

    libreria.quitarLibro(libro1)
    libreria.quitarLibro(libro2)

    val libro3 = Libro("Monstruos del mundo","Geòrgia Costa",160,8)

    libreria.aniadirLibro(libro3)
    libreria.mostrarLibros()
}