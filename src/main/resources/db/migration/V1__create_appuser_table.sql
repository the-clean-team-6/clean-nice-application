CREATE TABLE appuser
(
    id        BIGSERIAL PRIMARY KEY,
    firstname VARCHAR(100),
    lastname  VARCHAR(100),
    email     VARCHAR(250) UNIQUE NOT NULL,
    password  VARCHAR(500)        NOT NULL,
    role      VARCHAR(20)
)