FROM mysql:8.0 AS db

COPY ./init.sql /docker-entrypoint-initdb.d