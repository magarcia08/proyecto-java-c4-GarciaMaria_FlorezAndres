# Proyecto Tecnostore

Este repositorio contiene la aplicación Java de Tecnostore.

## Qué hace este proyecto

La aplicación administra clientes, celulares y ventas, y se conecta a una base de datos MySQL a través de `src/tecnostore/db/ConexionDB.java`.

## Configuración de la base de datos

La conexión se configura mediante variables de entorno. No se deben guardar credenciales en el código.

Variables necesarias:

- `DB_URL`
- `DB_USER`
- `DB_PASSWORD`

Ejemplo para PowerShell:

```powershell
$env:DB_URL = "jdbc:mysql://mysql-<host>:<port>/<database>?ssl-mode=REQUIRED"
$env:DB_USER = "avnadmin"
$env:DB_PASSWORD = "tu_contraseña"
```

Ejemplo para CMD:

```cmd
set DB_URL=jdbc:mysql://mysql-<host>:<port>/<database>?ssl-mode=REQUIRED
set DB_USER=avnadmin
set DB_PASSWORD=tu_contraseña
```

## Uso local con `.env`

Si usas un entorno que soporta archivos `.env`, puedes copiar el archivo de ejemplo y ajustar tus datos localmente:

```powershell
Copy-Item .env.example .env
```

No subas el archivo `.env` al repositorio.

## Qué se ignora en Git

Se excluyen los archivos de compilación, los settings privados de NetBeans y el archivo `.env`:

```gitignore
build/
nbproject/private/
*.class
.env
```

## Cómo ejecutar

Abre el proyecto en NetBeans o usa Ant según tu flujo de trabajo. Antes de iniciar la aplicación, asegúrate de haber configurado las variables de entorno.

## Nota

Si necesitas ayuda para configurar las variables de entorno o para ejecutar el proyecto, dime y te apoyo con los pasos concretos.
