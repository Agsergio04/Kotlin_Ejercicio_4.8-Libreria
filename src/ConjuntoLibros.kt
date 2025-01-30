class ConjuntoLibros(var loteLibros: Array<Libro?> = arrayOfNulls<Libro>(5)) {

    fun aniadirLibro(libroAniadir : Libro){
        var contador = 0
        var condicion = true

        for (libro in loteLibros){
            if (libro == null && condicion){
                loteLibros[contador] = libroAniadir
                condicion = false
            }
            contador++
        }
    }

    fun quitarLibro(libroQuitar : Libro){
        var contador = 0
        var condicion = true

        for (libro in loteLibros ){
            if ((libro?.autor == libroQuitar.autor || libro?.titulo == libroQuitar.titulo )&& condicion){
                loteLibros[contador] = null
                condicion = false
            }
            contador++
        }
    }

    fun mostrarLibroMayorMenor(){
        var contador = 0
        var mayorPuntacion = 0
        var menorPuntuacion = 10
        var libroMayorPuntuacion: Libro? = null
        var libroMenorPuntuacion: Libro? = null

        for(libro in loteLibros){
            if (libro?.calificacion!! > mayorPuntacion){
                mayorPuntacion = libro.calificacion
                libroMayorPuntuacion = loteLibros[contador]
            }
            if (libro?.calificacion!! < menorPuntuacion){
                mayorPuntacion = libro.calificacion
                libroMenorPuntuacion = loteLibros[contador]
            }
            contador++
        }

        println("El libro con mayor puntuacion es $libroMayorPuntuacion")
        println("El libro con menor puntuacion es $libroMenorPuntuacion")
    }

    fun mostrarLibros(){
        for (libro in loteLibros){
            println(libro)
        }
    }
}