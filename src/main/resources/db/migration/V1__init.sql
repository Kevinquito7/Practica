CREATE TABLE IF NOT EXISTS conference (
    id SERIAL PRIMARY KEY,
    title VARCHAR(100) NOT NULL,
    description VARCHAR(100) Not NULL,
    city Varchar(100) NOT NULL,
    total_assistants INT NOT NULL
    );


CREATE TABLE IF NOT EXISTS assistant (
    id SERIAL PRIMARY KEY,
    full_name VARCHAR(50) NOT NULL,
    role_assistant VARCHAR (20) NOT NULL,
    age INT NOT NULL,
    conference_id INT NOT NULL,
    FOREIGN KEY (conference_id) REFERENCES conference(id)
    );