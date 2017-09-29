# Spring Boot Demo

My playground of Spring boot

## Database schema

I am using a local Postgres db as the data repository and schema is listed below: 

**Table "public.users"**

| Column |         Type          |                     Modifiers                      |
|--------|-----------------------|----------------------------------------------------|
| name   | character varying(40) |                                                    |
| sex    | character varying(10) |                                                    | 
| age    | integer               | not null                                           |
| id     | bigint                | not null default nextval('users_id_seq'::regclass) | 

Indexes:
    "users_pkey" PRIMARY KEY, btree (id)

I use this command in psql to `id` as primary key and auto increased.

```
ALTER TABLE users ADD COLUMN id BIGSERIAL PRIMARY KEY;

```

## How to run the demo

This is a Spring boot project, so you can directly run the jar file by following these simple steps:

* `mvn clean install`

* `java -jar target/demo-0.0.1-SNAPSHOT.jar`

## Logging

This project uses `log4j2` as logging framework. Logging configuration file is `/src/main/resources/log4j2.xml` 
and logs are stored under `logs` folder