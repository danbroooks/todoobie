CREATE TABLE todos (
  id SERIAL,
  content VARCHAR(100) NOT NULL,
  completed BOOLEAN NOT NULL,
  PRIMARY KEY(id)
);
