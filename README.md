# Proyecto Tecnostore

Este repositorio contiene la aplicación Java de Tecnostore.

## Configuración de la base de datos

La aplicación lee la configuración de conexión desde variables de entorno:

- `DB_URL`
- `DB_USER`
- `DB_PASSWORD`

Por ejemplo, para usar PowerShell:

```powershell
$env:DB_URL = "jdbc:mysql://mysql-<host>:<port>/<database>?ssl-mode=REQUIRED"
$env:DB_USER = "avnadmin"
$env:DB_PASSWORD = "tu_contraseña"
```

Para usar CMD:

```cmd
set DB_URL=jdbc:mysql://mysql-<host>:<port>/<database>?ssl-mode=REQUIRED
set DB_USER=avnadmin
set DB_PASSWORD=tu_contraseña
```

> No guardes credenciales reales en el código fuente.

## Archivo de ejemplo

Puedes copiar `.env.example` a `.env` para uso local si tu editor o entorno lo soporta.

```powershell
Copy-Item .env.example .env
```

## Ignorados por Git

Se ignoran los archivos compilados y de build, además del archivo `.env` local.

```gitignore
build/
nbproject/private/
*.class
.env
```

## Ejecución

Construye y ejecuta el proyecto desde NetBeans o usando Ant, según tu flujo de trabajo.

Asegúrate de tener las variables de entorno definidas antes de iniciar la aplicación.
