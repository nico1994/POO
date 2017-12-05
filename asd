consultas.

1.
SELECT `numero`, `pnombre`, `precio`, `tamaño` FROM `productos` WHERE 

order by pnombre ASC

2.

SELECT `numero`, `nombre`, `domicilio`, `localidad` FROM `proveedores` WHERE localidad="Quilmes"

3.

SELECT `numero`, `pnumero`, `cantidad` FROM `envios` WHERE cantidad BETWEEN 200 and 300

4.

SELECT SUM(envios.cantidad)
FROM envios
WHERE 1;

5.

ELECT  `pnumero` FROM `envios` order by envios.numero DESC limit 3

SELECT p.pnombre FROM `envios` as e, productos as p where e.pnumero + p.numero limit 3






