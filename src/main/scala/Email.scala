import scala.util.Random
class Email (nomb: String, apell: String){

  private var nombre: String = nomb
  private var apellido: String = apell
  println(s"EMAIL CREADO: $nombre $apellido")
  private var contrasena: String = generarContrasena()
  private var categoria: String = setCategoria()
  println(s"CATEGORIA: $categoria")
  println(s"CONTRASEÑA: $contrasena")

  private var capacidad_buzon: Int = _
  private var correo_alternativo: String = _


  def setCategoria(): String = {
    println("1. Ventas " +
      "\n2. Contabilidad " +
      "\n3. Sistemas " +
      "\n4. Soporte")
    val cat = scala.io.StdIn.readLine("Ingrese la categoria a la que pertenece(1-4): ").toInt
    if (cat == 1) {return "Ventas"}
    else if (cat == 2) {return "Contabilidad"}
    else if (cat == 3) {return "Sistemas"}
    else if (cat == 4) {return "Soporte"}
    else {return ""}
  }

  def generarContrasena(): String = {
    val caracteres = "ABCDEFGHIJKLMNÑOPQRSTUVWXYZ0123456789!@#$%"
    val random = new Random()
    var contrasena = ""
    for (i <- 1 to 9){

      val na = random.nextInt(caracteres.length)
      contrasena += caracteres(na)
    }
    return contrasena

  }


}
