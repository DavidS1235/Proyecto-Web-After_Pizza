function validarImagen(){

    var nombreArchivo = document.getElementById('img');
    var rutaArchivo = nombreArchivo.value.toLowerCase();
    var extPermitida = /(.png|.ico|.jpg|.gif|.jpeg)$/i;

    //Si extensiones permitidas no se encuentra en el archivo ruta
    if(!extPermitida.exec(rutaArchivo)){
        alert('Asegurate de haber seleccionado un archivo .png, .ico, .jpg, .gif o .jpeg');
        nombreArchivo.value = '';
        return false;
    } else {
        return true;
    }
}
