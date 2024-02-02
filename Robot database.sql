-- Database: robots

CREATE TABLE survivor (
    "id" UUID PRIMARY KEY,
    "name" text NOT NULL UNIQUE,
    "age" int NOT NULL,
    "gender" text NOT NULL,
    "longitude" double precision NOT NULL,
    "latitude" double precision NOT NULL,
    "infected" boolean NOT NULL,
    "nonInfected" boolean NOT NULL,
    "num_reports" int
);

CREATE TABLE resource (
    "id" UUID PRIMARY KEY,
    "water" boolean NOT NULL,
    "food" boolean NOT NULL,
    "medication" boolean NOT NULL,
    "ammunition" boolean NOT NULL,
    "survivor_id" int REFERENCES survivor("id")
);

CREATE TABLE robots (
    "id" UUID PRIMARY KEY,
    "model" text NOT NULL,
    "serial_number" text NOT NULL,
    "manufactured_date" date NOT NULL
);



-- survivor table
INSERT INTO survivor ("id", "name", "age", "gender", "longitude", "latitude", "status", "num_reports")
VALUES
  (1, 'Ruth Hlongwane', 30, 'Male', -73.935242, 40.730610, true, 2),
  (2, 'Nkhenso Baloyi', 25, 'Female', -74.005941, 40.712776, true, 1),
  (3, 'Cove Jam', 40, 'Male', -77.036871, 38.907192, false, 0);


--  resource table
INSERT INTO resource ("id", "water", "food", "medication", "ammunition", "survivor_id")
VALUES
  (1, true, false, true, false, 1),
  (2, true, true, false, true, 2),
  (3, false, true, true, false, 3);

--  robots table
INSERT INTO robots ("id", "model", "serial_number", "manufactured_date")
VALUES
  (1, 'R2-D2', 'RD2001', '2022-01-15'),
  (2, 'C-3PO', 'CP1234', '2022-02-20'),
  (3, 'BB-8', 'BB8001', '2022-03-10');


