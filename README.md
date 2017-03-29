# todoobie

todoobie is a simple todo application implemented using doobie & the
Play Framework

## Installing

To install, create the user & database in Postgres then run the flyway migrations:

    psql -c 'create user todoobie createdb'
    psql -c 'create database todoobie;' -U postgres
    sbt flywayMigrate

## Running

Start the app with `sbt`:

    sbt run

