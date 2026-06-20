@echo off
echo Iniciando microservicios de RideApp...

start "api-gateway" cmd /k "cd /d C:\Users\HP\Desktop\ride_app\microservicios\api-gateway && mvnw.cmd spring-boot:run"

start "usuario-service" cmd /k "cd /d C:\Users\HP\Desktop\ride_app\microservicios\usuario-service && mvnw.cmd spring-boot:run"

start "conductor-service" cmd /k "cd /d C:\Users\HP\Desktop\ride_app\microservicios\conductor-service && mvnw.cmd spring-boot:run"

start "viaje-service" cmd /k "cd /d C:\Users\HP\Desktop\ride_app\microservicios\viaje-service && mvnw.cmd spring-boot:run"

start "vehiculo-service" cmd /k "cd /d C:\Users\HP\Desktop\ride_app\microservicios\vehiculo-service && mvnw.cmd spring-boot:run"

start "pago-service" cmd /k "cd /d C:\Users\HP\Desktop\ride_app\microservicios\pago-service && mvnw.cmd spring-boot:run"

start "ms-auth" cmd /k "cd /d C:\Users\HP\Desktop\ride_app\microservicios\auth-vehiculo\ride_app\ms-auth && mvnw.cmd spring-boot:run"

echo Todos los microservicios iniciados!
