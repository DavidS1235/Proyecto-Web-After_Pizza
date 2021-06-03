/*
 * Utilizamos la función o evento "Loader" del Windows
 */

window.addEventListener('load', () => {
    const contenedorPantallaCarga = document.querySelector(".contenedorCargaPantalla");
    contenedorPantallaCarga.style.opacity = 0;
    contenedorPantallaCarga.style.visibility = 'hidden';
});



