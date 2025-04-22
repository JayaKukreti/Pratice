CREATE VIEW customer_info AS
SELECT first_name,last_name,address FROM customer
INNER JOIN address
ON customer.address_id=address.address_id

SELECT * FROM customer_info

CREATE OR  REPLACE VIEW customer_info AS
SELECT first_name,last_name,address,district FROM customer
INNER JOIN address
ON customer.address_id=address.address_id

CREATE VIEW c_info AS
SELECT first_name,last_name,address FROM customer
INNER JOIN address
ON customer.address_id=address.address_id

ALTER VIEW c_info RENAME TO customer_info

SELECT * FROM customer_info




DROP VIEW IF EXISTS customer_info

SELECT * FROM customer_info