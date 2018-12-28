DROP SCHEMA IF EXISTS bank;
CREATE SCHEMA bank;
DROP USER 'teller'@'localhost';
CREATE USER 'teller'@'localhost' IDENTIFIED BY 'password';
GRANT ALL ON bank.* TO 'teller'@'localhost';