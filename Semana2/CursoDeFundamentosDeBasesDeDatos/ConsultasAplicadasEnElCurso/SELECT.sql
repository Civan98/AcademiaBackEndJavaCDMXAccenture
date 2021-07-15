-- Ejemplos select
SELECT	*
FROM		posts;

// se filtran los campos especidicados
SELECT	titulo, fecha_publicacion, estatus
FROM		posts;

//se pueden renombrar las cabeceras
SELECT	titulo AS encabezado, fecha_publicacion AS publicado, estatus AS estado
FROM		posts;

//para contabilizar
-- SELECT	posts.titulo, categorias.nombre_categoria;
SELECT	count(*)
FROM		posts;

SELECT	count(*) numero_posts
FROM		posts;