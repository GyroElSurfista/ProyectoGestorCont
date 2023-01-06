# Gestor de contraseñas
El presente proyecto es un gestor de contraseñas local realizado en java.

## ¿Qué es un gestor de contraseñas?
Es un software que se encarga de almacenar la información de inicio de sesión que un usuario emplea 
para acceder a aquellos servicios en los que se encuentra registrado. Este tipo de software tiene el 
objetivo de que sus usuarios no tengan que preocuparse de memorizar todas las contraseñas de todas las 
cuentas que poseen y además incentiva a que empleen contraseñas fuertes pues no tienen que preocuparse 
por recordarlas todas. Los gestores de contraseñas además de guardar información de inicio de sesión 
pueden almacenar datos de tarjetas de crédito o notas generales que sus usuarios quieren mantener seguras 
y además no desean olvidar.

## ¿Cómo funciona un gestor de contraseñas?
Para proteger la información de sus usuarios, un gestor de contraseñas requiere que se registren 
haciendo uso de un nombre de usuario y una contraseña que se denomina por lo general “clave maestra” o “contraseña maestra”. 
Esta información será lo único que los clientes de un gestor de contraseñas deberán recordar, por lo tanto, se recomienda que 
la clave maestra sea una passphrase o una contraseña fuerte. En el momento que un usuario desea acceder a sus contraseñas debe 
proveer su usuario y su clave maestra.

Los gestores de contraseñas hacen uso de funciones hash y algoritmos de encriptación para mantener la información de sus usuarios 
segura.

## Almacenamiento de contraseñas
Para el almacenamiento de las contraseñas de los usuarios se siguieron las recomendaciones de los siguientes sitios:
-https://cheatsheetseries.owasp.org/cheatsheets/Password_Storage_Cheat_Sheet.html
-https://crackstation.net/hashing-security.htm
### Funcion(es) hash criptográficas empleadas

Se empleó la función hash [bcrypt](https://auth0.com/blog/hashing-in-action-understanding-bcrypt/) recomendada por owasp en su cheat sheet para 
el almacenamiento de contraseñas.

## Cifrado de datos
Para el cifrado de la información de los usuarios se empleó el estándar de encriptación avanzado AES con una llave de 256 bits.
Por otro lado, se empleó el esquema base64 para facilitar el almacenamiento del texto cifrado en la base de datos.
