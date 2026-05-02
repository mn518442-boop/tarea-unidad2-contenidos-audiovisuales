# Proyecto: Sistema de Contenidos Audiovisuales - Etapa 3

Este repositorio contiene la implementación en Java de un sistema de gestión de contenidos audiovisuales, desarrollado como parte de la asignatura de Programación. En esta etapa, se ha aplicado el concepto de **Herencia y Polimorfismo**.

## 📊 Diagrama de Clases UML
![Diagrama UML](Subiendo diagrama UML Etapa 3)

## 📝 Descripción de las Relaciones
En este diseño se han implementado los siguientes conceptos de Programación Orientada a Objetos:

* **Herencia (Generalización):** Las clases `Pelicula`, `SerieDeTV`, `Documental`, `Cortometraje` y `VideoYouTube` heredan de la superclase `ContenidoAudiovisual`, compartiendo atributos como título y duración.
* **Agregación:** La clase `Pelicula` tiene una relación de agregación con `Actor`, lo que significa que los actores pueden existir independientemente de la película.
* **Composición:** La clase `SerieDeTV` tiene una relación de composición con `Temporada`. Si la serie se elimina, las temporadas también desaparecen.
* **Asociación:** Una relación simple entre `Documental` e `Investigador` para representar la colaboración en el contenido.

## 🚀 Tecnologías Utilizadas
* **Lenguaje:** Java 
* **IDE:** Eclipse
* **Modelado:** UML (draw.io)
