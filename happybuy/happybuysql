INSERT INTO USERS (id, username, password, first_name, last_name, email, phone_number, enabled) VALUES (1, 'user', '$2a$04$Vbug2lwwJGrvUXTj6z7ff.97IzVBkrJ1XfApfGNl.Z695zqcnPYra', 'Fan', 'Jin', 'user@example.com', '+1234567890', true);
INSERT INTO USERS (id, username, password, first_name, last_name, email, phone_number, enabled) VALUES (2, 'admin', '$2a$04$Vbug2lwwJGrvUXTj6z7ff.97IzVBkrJ1XfApfGNl.Z695zqcnPYra', 'Jing', 'Xiao', 'admin@example.com', '+0987654321', true);
INSERT INTO USERS (id, username, password, first_name, last_name, email, phone_number, enabled) VALUES (3, 'user', '$2a$04$Vbug2lwwJGrvUXTj6z7ff.97IzVBkrJ1XfApfGNl.Z695zqcnPYra', 'Liang', 'Yan', 'admin@example.com', '+0987654321', true);

INSERT INTO ROLE (id, name) VALUES (1, 'ROLE_USER');
INSERT INTO ROLE (id, name) VALUES (2, 'ROLE_ADMIN');
INSERT INTO ROLE (id, name) VALUES (3, 'ROLE_STAFF');

INSERT INTO USER_ROLE (user_id, role_id) VALUES (1, 1);
INSERT INTO USER_ROLE (user_id, role_id) VALUES (1, 3);
INSERT INTO USER_ROLE (user_id, role_id) VALUES (2, 1);
INSERT INTO USER_ROLE (user_id, role_id) VALUES (2, 2);

INSERT INTO CATEGORY (id, name) VALUES (1, 'women');
INSERT INTO CATEGORY (id, name) VALUES (2, 'men');
INSERT INTO CATEGORY (id, name) VALUES (3, 'kids');
INSERT INTO CATEGORY (id, name) VALUES (4, 'shoes');
INSERT INTO CATEGORY (id, name) VALUES (5, 'accessories');
INSERT INTO CATEGORY (id, name) VALUES (6, 'beauty');
INSERT INTO CATEGORY (id, name) VALUES (7, 'furniture');
INSERT INTO CATEGORY (id, name) VALUES (8, 'clearance');

INSERT INTO SHIPMENT (id, city, state, street_address, zipcode) 
VALUES (1, 'Seattle', 'WA', '5050 34th Ave SW', '98106');

INSERT INTO SHIPMENT (id, city, state, street_address, zipcode) 
VALUES (2, 'Burien', 'WA', '2903 50th Ave S', '98108');

INSERT INTO SHIPMENT (id, city, state, street_address, zipcode) 
VALUES (3, 'Kent', 'WA', '4443 8th Ave NE', '98453');

INSERT INTO USER_SHIPMENT (user_id, shipment_id) VALUES (1, 2);
INSERT INTO USER_SHIPMENT (user_id, shipment_id) VALUES (2, 3);
INSERT INTO USER_SHIPMENT (user_id, shipment_id) VALUES (3, 1);

INSERT INTO PRODUCT (id, brand, color, name, quantity, regular_price, sale_price, size, category_id) 
VALUES (1, 'Luaren', 'White', 'Lellished Mock-Neck Midi Dress', 4 , 17.00, 25.99, 'M', 1);

INSERT INTO PRODUCT (id, brand, color, name, quantity, regular_price, sale_price, size, category_id) 
VALUES (2, 'MK', 'Pink', 'Satin-Trim Midi Fit & Flare Dress', 5 , 56.00, 49.99, 'L', 1);

INSERT INTO PRODUCT (id, brand, color, name, quantity, regular_price, sale_price, size, category_id) 
VALUES (3, 'CK', 'Red', 'Floral Brocade High-Low Dress', 2 , 27.00, 15.99, 'M', 1);

INSERT INTO PRODUCT (id, brand, color, name, quantity, regular_price, sale_price, size, category_id) 
VALUES (4, 'INC', 'White', 'Off-The-Shoulder Dress', 5 , 56.00, 49.99, 'XL', 1);

INSERT INTO PRODUCT (id, brand, color, name, quantity, regular_price, sale_price, size, category_id) 
VALUES (5, 'Julia', 'Black', 'Mesh & Jacquard A-Line Dress', 3 , 56.00, 56.99, 'S', 1);

INSERT INTO PRODUCT (id, brand, color, name, quantity, regular_price, sale_price, size, category_id) 
VALUES (6, 'Nike', 'White', 'Men Down Packable Puffer Jacket', 4 , 17.00, 25.99, 'M', 2);

INSERT INTO PRODUCT (id, brand, color, name, quantity, regular_price, sale_price, size, category_id) 
VALUES (7, 'MK', 'Navy', 'Men Packable Down Jacket', 5 , 56.00, 49.99, 'L', 2);

INSERT INTO PRODUCT (id, brand, color, name, quantity, regular_price, sale_price, size, category_id) 
VALUES (8, 'Polo', 'Grey', 'Men Polo Cotton Shirt', 2 , 27.00, 15.99, 'M', 2);

INSERT INTO PRODUCT (id, brand, color, name, quantity, regular_price, sale_price, size, category_id) 
VALUES (9, 'INC', 'Black', 'Men Thermal Shirt', 5 , 56.00, 49.99, 'XL', 2);

INSERT INTO PRODUCT (id, brand, color, name, quantity, regular_price, sale_price, size, category_id) 
VALUES (10, 'Tommy', 'White', 'Men Waffle-Knit Jogger Pants', 3 , 56.00, 56.99, 'S', 2);


INSERT INTO PRODUCT (id, brand, color, name, quantity, regular_price, sale_price, size, category_id) 
VALUES (11, 'Bonnie', 'White', 'Girls Metallic Plaid Dress', 4 , 17.00, 25.99, 'M', 3);

INSERT INTO PRODUCT (id, brand, color, name, quantity, regular_price, sale_price, size, category_id) 
VALUES (12, 'MK', 'Pink', 'Girls Velvet & Embroidered-Mesh Dress', 5 , 56.00, 49.99, 'L', 3);

INSERT INTO PRODUCT (id, brand, color, name, quantity, regular_price, sale_price, size, category_id) 
VALUES (13, 'Polo', 'Black', 'Boy Cotton Shirt', 2 , 27.00, 15.99, 'M', 3);

INSERT INTO PRODUCT (id, brand, color, name, quantity, regular_price, sale_price, size, category_id) 
VALUES (14, 'INC', 'Navy', 'Boy Thermal Shirt', 5 , 56.00, 49.99, 'XL', 3);

INSERT INTO PRODUCT (id, brand, color, name, quantity, regular_price, sale_price, size, category_id) 
VALUES (15, 'Rare', 'White', 'Boy Waffle-Knit Jogger Pants', 3 , 56.00, 56.99, 'S', 3);







