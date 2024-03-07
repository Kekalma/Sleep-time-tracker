CREATE TABLE IF NOT EXISTS "user"
(
    user_id SERIAL PRIMARY KEY,
    name VARCHAR(20) NOT NULL UNIQUE,
    password VARCHAR(255) NOT NULL,
    e_mail VARCHAR(255) NOT NULL
    );
CREATE TABLE IF NOT EXISTS "sleepTable"(
    date DATE,
    sleep_time VARCHAR(20),
    mood VARCHAR(20),
    user_id INTEGER,
    foreign key (user_id) References "user" (user_id)
)