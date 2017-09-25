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