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

INSERT INTO IMAGE (id, image, product_id) VALUES (1, 'assets/women2.jpg', 1);

INSERT INTO IMAGE (id, image, product_id) VALUES (2, 'assets/girlcoatdress.jpg', 12);

INSERT INTO IMAGE (id, image, product_id) VALUES (3, 'assets/girlcoatdress2.jpg', 12);

INSERT INTO IMAGE (id, image, product_id) VALUES (4, 'assets/girlcoatdress3.jpg', 12);

INSERT INTO IMAGE (id, image, product_id) VALUES (5, 'assets/girlcoatdress4.jpg', 12);

INSERT INTO review (id, user_id, product_id, title, rating, comment, create_date, status) values (1, 2, 12, 'cute', 5,
 'I got this jacket for my daughter, she is very picky about the fit and she loves it. 
 She can wear her sweater underneath easily to layer up on freezing day.', '2019-01-26', 'ready'); 


INSERT INTO review (id, user_id, product_id, title, rating, comment, create_date, status) values (2, 1, 2, 'not recommended', 1,
 'I just received this coat and I was shocked it’s already falling apart I don’t think this coat will last more than a couple of weeks you get what you pay for I guess, 
 I bought another coat ck and the difference is really worth the 20 dollars extra', '2019-01-25', 'deleted');
 
 

INSERT INTO review (id, user_id, product_id, title, rating, comment, create_date, status) values (3, 3, 12, 'nice but runs small', 3,
 'Bought the Medium for my 10 year old. Runs too small. Returned and got a different jacket', '2019-01-27', 'pending');
 
 

INSERT INTO review (id, user_id, product_id, title, rating, comment, create_date, status) values (4, 1, 12, 'great product', 5,
 'It was a Christmas present and she loved it. She really loved the scarf and it was a perfect fit', '2019-01-20', 'ready');
 
 

INSERT INTO review (id, user_id, product_id, title, rating, comment, create_date, status) values (5, 4, 12, 'poor zipper', 1,
 'Within 2 months, Wouldn’t stay zipped. Came unzipped from the bottom', '2019-01-23', 'deleled');







