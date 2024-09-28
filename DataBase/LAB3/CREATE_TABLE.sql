CREATE TABLE IF NOT EXISTS person(
	id SERIAL PRIMARY KEY,
	name TEXT NOT NULL,
	second_name TEXT NOT NULL
);

CREATE TABLE IF NOT EXISTS place(
	id SERIAL PRIMARY KEY,
	name TEXT NOT NULL,
	coordinate varchar(100) NOT NULL,
	open_date DATE NOT NULL
);

CREATE TABLE IF NOT EXISTS person_place(
	id SERIAL PRIMARY KEY,
	place_id BIGINT NOT NULL, 
	person_id BIGINT NOT NULL, 
	visit_data TIMESTAMP NOT NULL,
	FOREIGN KEY (place_id) REFERENCES place(id),
	FOREIGN KEY (person_id) REFERENCES person(id)
);

CREATE TABLE IF NOT EXISTS object(
	id SERIAL PRIMARY KEY,
	name TEXT NOT NULL,
	description varchar(255) NOT NULL
);

CREATE TABLE IF NOT EXISTS place_object(
	id SERIAL PRIMARY KEY, 
	place_id BIGINT NOT NULL,
	object_id BIGINT NOT NULL,
	FOREIGN KEY (place_id) REFERENCES place(id),
	FOREIGN KEY (object_id) REFERENCES object(id)
);

CREATE TABLE IF NOT EXISTS image(
	id SERIAL PRIMARY KEY,
	name TEXT NOT NULL,
	content varchar(255) NOT NULL,
	object_id BIGINT NOT NULL,
	FOREIGN KEY (object_id) REFERENCES object(id)
);

CREATE TABLE IF NOT EXISTS type(
	id SERIAL PRIMARY KEY, 
	name TEXT NOT NULL,
	object_id BIGINT NOT NULL, 
	FOREIGN KEY (object_id) REFERENCES object(id)
);

CREATE OR REPLACE FUNCTION check_open_date()
RETURNS TRIGGER AS $$
BEGIN
    IF NEW.open_date > CURRENT_DATE THEN
        NEW.open_date = CURRENT_DATE;
    END IF;
    RETURN NEW;
END;
$$ LANGUAGE plpgsql;

CREATE TRIGGER check_open_date_trigger
BEFORE INSERT OR UPDATE ON place
FOR EACH ROW
EXECUTE FUNCTION check_open_date();