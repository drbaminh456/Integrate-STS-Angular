DROP TABLE IF EXISTS PUBLIC."table1";
CREATE TABLE "table1"
(
	"id"										SERIAL PRIMARY KEY,
	"first_name"								VARCHAR(64),
	"last_name"									VARCHAR(64)
);