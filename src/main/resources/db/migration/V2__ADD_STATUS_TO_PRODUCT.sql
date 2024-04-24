CREATE TYPE product_status AS ENUM ('ACTIVE', 'INACTIVE');

ALTER TABLE products
ADD COLUMN status product_status;