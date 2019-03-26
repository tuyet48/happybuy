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

INSERT INTO PRODUCT (id, brand, color, image, name, quantity, regular_price, sale_price, size, category_id) 
VALUES (1, 'Luaren', 'White', 'Lellished Mock-Neck Midi Dress', 4 , 17.00, 25.99, 'M', 1);

INSERT INTO PRODUCT (id, brand, color, image, name, quantity, regular_price, sale_price, size, category_id) 
VALUES (2, 'MK', 'Pink', 'Satin-Trim Midi Fit & Flare Dress', 5 , 56.00, 49.99, 'L', 1);

INSERT INTO PRODUCT (id, brand, color, image,name, quantity, regular_price, sale_price, size, category_id) 
VALUES (3, 'CK', 'Red', 'Floral Brocade High-Low Dress', 2 , 27.00, 15.99, 'M', 1);

INSERT INTO PRODUCT (id, brand, color, image, name, quantity, regular_price, sale_price, size, category_id) 
VALUES (4, 'INC', 'White', 'Off-The-Shoulder Dress', 5 , 56.00, 49.99, 'XL', 1);

INSERT INTO PRODUCT (id, brand, color, image, name, quantity, regular_price, sale_price, size, category_id) 
VALUES (5, 'Julia', 'Black', 'Mesh & Jacquard A-Line Dress', 3 , 56.00, 56.99, 'S', 1);

INSERT INTO PRODUCT (id, brand, color,  image, name, quantity, regular_price, sale_price, size, category_id) 
VALUES (6, 'Nike', 'White', 'Men Down Packable Puffer Jacket', 4 , 17.00, 25.99, 'M', 2);

INSERT INTO PRODUCT (id, brand, color, image, name, quantity, regular_price, sale_price, size, category_id) 
VALUES (7, 'MK', 'Navy', 'Men Packable Down Jacket', 5 , 56.00, 49.99, 'L', 2);

INSERT INTO PRODUCT (id, brand, color, image, name, quantity, regular_price, sale_price, size, category_id) 
VALUES (8, 'Polo', 'Grey', 'Men Polo Cotton Shirt', 2 , 27.00, 15.99, 'M', 2);

INSERT INTO PRODUCT (id, brand, color, image, name, quantity, regular_price, sale_price, size, category_id) 
VALUES (9, 'INC', 'Black', 'Men Thermal Shirt', 5 , 56.00, 49.99, 'XL', 2);

INSERT INTO PRODUCT (id, brand, color, image, name, quantity, regular_price, sale_price, size, category_id) 
VALUES (10, 'Tommy', 'White', 'Men Waffle-Knit Jogger Pants', 3 , 56.00, 56.99, 'S', 2);

INSERT INTO PRODUCT (id, brand, color, image, name, quantity, regular_price, sale_price, size, category_id) 
VALUES (11, 'Bonnie', 'White', 'Girls Metallic Plaid Dress', 4 , 17.00, 25.99, 'M', 3);

INSERT INTO PRODUCT (id, brand, color, image, name, quantity, regular_price, sale_price, size, category_id) 
VALUES (12, 'MK', 'Pink', 'Girls Velvet & Embroidered-Mesh Dress', 5 , 56.00, 49.99, 'L', 3);

INSERT INTO PRODUCT (id, brand, color, image, name, quantity, regular_price, sale_price, size, category_id) 
VALUES (13, 'Polo', 'Black', 'Boy Cotton Shirt', 2 , 27.00, 15.99, 'M', 3);

INSERT INTO PRODUCT (id, brand, color, image,name, quantity, regular_price, sale_price, size, category_id) 
VALUES (14, 'INC', 'Navy', 'Boy Thermal Shirt', 5 , 56.00, 49.99, 'XL', 3);

INSERT INTO PRODUCT (id, brand, color, image, name, quantity, regular_price, sale_price, size, category_id) 
VALUES (15, 'Rare', 'White', 'Boy Waffle-Knit Jogger Pants', 3 , 56.00, 56.99, 'S', 3);

INSERT INTO PRODUCT (id, brand, color, image, name, quantity, regular_price, sale_price, size, category_id) 
VALUES (16, 'Luaren', 'Gray', 'assets/women6.jpg','Lellished Mock-Neck Midi Dress', 4 , 17.00, 25.99, 'M', 1);

INSERT INTO PRODUCT (id, brand, color, image, name, quantity, regular_price, sale_price, size, category_id) 
VALUES (17, 'Luaren', 'White', 'assets/women3.jpg','Lellished Mock-Neck Midi Dress', 4 , 17.00, 25.99, 'M', 1);

INSERT INTO PRODUCT (id, brand, color, image, name, quantity, regular_price, sale_price, size, category_id) 
VALUES (18, 'Nike', 'Black', 'assets/women13.jpg','Lellished Mock-Neck Midi Dress', 4 , 17.00, 25.99, 'S', 1);

INSERT INTO PRODUCT (id, brand, color, image, name, quantity, regular_price, sale_price, size, category_id) 
VALUES (19, 'MK', 'Pink', 'assets/women10.jpg', 'Satin-Trim Midi Fit & Flare Dress', 5 , 56.00, 49.99, 'L', 1);

INSERT INTO PRODUCT (id, brand, color, image, name, quantity, regular_price, sale_price, size, category_id) 
VALUES (20, 'CK', 'Red', 'assets/women14.jpg', 'Floral Brocade High-Low Dress', 2 , 27.00, 15.99, 'M', 1);

INSERT INTO PRODUCT (id, brand, color, image, name, quantity, regular_price, sale_price, size, category_id) 
VALUES (21, 'INC', 'White', 'assets/women3.jpg', 'Off-The-Shoulder Dress', 5 , 56.00, 49.99, 'XL', 1);

INSERT INTO PRODUCT (id, brand, color, image, name, quantity, regular_price, sale_price, size, category_id) 
VALUES (22, 'Julia', 'Black','assets/women4.jpg', 'Mesh & Jacquard A-Line Dress', 3 , 56.00, 56.99, 'S', 1);

INSERT INTO PRODUCT (id, brand, color, image, name, quantity, regular_price, sale_price, size, category_id) 
VALUES (23, 'Nike', 'White', 'assets/women6.jpg', 'Men Down Packable Puffer Jacket', 4 , 17.00, 25.99, 'M', 1);

INSERT INTO PRODUCT (id, brand, color, image,name, quantity, regular_price, sale_price, size, category_id) 
VALUES (24, 'MK', 'Navy', 'assets/women7.jpg', 'Men Packable Down Jacket', 5 , 56.00, 49.99, 'L', 1);

INSERT INTO PRODUCT (id, brand, color, image,name, quantity, regular_price, sale_price, size, category_id) 
VALUES (25, 'Polo', 'Grey', 'assets/women8.jpg', 'Men Polo Cotton Shirt', 2 , 27.00, 15.99, 'M', 1);

INSERT INTO PRODUCT (id, brand, color, image, name, quantity, regular_price, sale_price, size, category_id) 
VALUES (27, 'Tommy', 'White', 'assets/women11.jpg', 'Men Waffle-Knit Jogger Pants', 3 , 56.00, 56.99, 'S', 1);

INSERT INTO PRODUCT (id, brand, color, image, name, quantity, regular_price, sale_price, size, category_id) 
VALUES (28, 'Bonnie', 'White', 'assets/women12.jpg', 'Girls Metallic Plaid Dress', 4 , 17.00, 25.99, 'M', 1);

INSERT INTO PRODUCT (id, brand, color, image, name, quantity, regular_price, sale_price, size, category_id) 
VALUES (29, 'MK', 'Pink', 'assets/women13.jpg', 'Girls Velvet & Embroidered-Mesh Dress', 5 , 56.00, 49.99, 'L', 1);

INSERT INTO PRODUCT (id, brand, color, image, name, quantity, regular_price, sale_price, size, category_id) 
VALUES (30, 'Polo', 'Black', 'assets/women15.jpg', 'Boy Cotton Shirt', 2 , 27.00, 15.99, 'M', 1);

INSERT INTO PRODUCT (id, brand, color, image, name, quantity, regular_price, sale_price, size, category_id) 
VALUES (31, 'Luaren', 'White', 'assets/men3.jpg','Lellished Mock-Neck Midi Dress', 4 , 17.00, 25.99, 'M', 2);

INSERT INTO PRODUCT (id, brand, color, image, name, quantity, regular_price, sale_price, size, category_id) 
VALUES (32, 'Nike', 'Black', 'assets/men1.jpg','Lellished Mock-Neck Midi Dress', 4 , 17.00, 25.99, 'S', 2);

INSERT INTO PRODUCT (id, brand, color, image, name, quantity, regular_price, sale_price, size, category_id) 
VALUES (33, 'CK', 'Red', 'assets/men4.jpg', 'Floral Brocade High-Low Dress', 2 , 27.00, 15.99, 'M', 2);

INSERT INTO PRODUCT (id, brand, color, image, name, quantity, regular_price, sale_price, size, category_id) 
VALUES (34, 'INC', 'White', 'assets/men5.jpg', 'Off-The-Shoulder Dress', 5 , 56.00, 49.99, 'XL', 2);

INSERT INTO PRODUCT (id, brand, color, image, name, quantity, regular_price, sale_price, size, category_id) 
VALUES (35, 'Julia', 'Black','assets/men6.jpg', 'Mesh & Jacquard A-Line Dress', 3 , 56.00, 56.99, 'S', 2);

INSERT INTO PRODUCT (id, brand, color, image, name, quantity, regular_price, sale_price, size, category_id) 
VALUES (36, 'Nike', 'White', 'assets/men7.jpg', 'Men Down Packable Puffer Jacket', 4 , 17.00, 25.99, 'M', 2);

INSERT INTO PRODUCT (id, brand, color, image,name, quantity, regular_price, sale_price, size, category_id) 
VALUES (37, 'MK', 'Navy', 'assets/men8.jpg', 'Men Packable Down Jacket', 5 , 56.00, 49.99, 'L', 2);

INSERT INTO PRODUCT (id, brand, color, image,name, quantity, regular_price, sale_price, size, category_id) 
VALUES (38, 'Polo', 'Grey', 'assets/men3.jpg', 'Men Polo Cotton Shirt', 2 , 27.00, 15.99, 'M', 2);

INSERT INTO PRODUCT (id, brand, color, image,name, quantity, regular_price, sale_price, size, category_id) 
VALUES (39, 'INC', 'Black', 'assets/men1.jpg', 'Men Thermal Shirt', 5 , 56.00, 49.99, 'XL', 2);

INSERT INTO PRODUCT (id, brand, color, image, name, quantity, regular_price, sale_price, size, category_id) 
VALUES (40, 'Tommy', 'White', 'assets/men2.jpg', 'Men Waffle-Knit Jogger Pants', 3 , 56.00, 56.99, 'S', 2);

INSERT INTO PRODUCT (id, brand, color, image, name, quantity, regular_price, sale_price, size, category_id) 
VALUES (41, 'Bonnie', 'White', 'assets/men7.jpg', 'Girls Metallic Plaid Dress', 4 , 17.00, 25.99, 'M', 2);

INSERT INTO PRODUCT (id, brand, color, image, name, quantity, regular_price, sale_price, size, category_id) 
VALUES (42, 'MK', 'Pink', 'assets/men8.jpg', 'Girls Velvet & Embroidered-Mesh Dress', 5 , 56.00, 49.99, 'L', 2);

INSERT INTO PRODUCT (id, brand, color, image, name, quantity, regular_price, sale_price, size, category_id) 
VALUES (43, 'Polo', 'Black', 'assets/men1.jpg', 'Boy Cotton Shirt', 2 , 27.00, 15.99, 'M', 2);

INSERT INTO PRODUCT (id, brand, color, image, name, quantity, regular_price, sale_price, size, category_id) 
VALUES (44, 'Luaren', 'White', 'assets/girl3.jpg','Lellished Mock-Neck Midi Dress', 4 , 17.00, 25.99, 'M', 3);

INSERT INTO PRODUCT (id, brand, color, image, name, quantity, regular_price, sale_price, size, category_id) 
VALUES (45, 'Nike', 'Black', 'assets/girl2.jpg','Lellished Mock-Neck Midi Dress', 4 , 17.00, 25.99, 'S', 3);

INSERT INTO PRODUCT (id, brand, color, image, name, quantity, regular_price, sale_price, size, category_id) 
VALUES (46, 'CK', 'Red', 'assets/girl1.jpg', 'Floral Brocade High-Low Dress', 2 , 27.00, 15.99, 'M', 3);

INSERT INTO PRODUCT (id, brand, color, image, name, quantity, regular_price, sale_price, size, category_id) 
VALUES (47, 'INC', 'White', 'assets/girl2.jpg', 'Off-The-Shoulder Dress', 5 , 56.00, 49.99, 'XL', 3);

INSERT INTO PRODUCT (id, brand, color, image, name, quantity, regular_price, sale_price, size, category_id) 
VALUES (48, 'Julia', 'Black','assets/girl5.jpg', 'Mesh & Jacquard A-Line Dress', 3 , 56.00, 56.99, 'S', 3);

INSERT INTO PRODUCT (id, brand, color, image, name, quantity, regular_price, sale_price, size, category_id) 
VALUES (49, 'Nike', 'White', 'assets/girl4.jpg', 'Men Down Packable Puffer Jacket', 4 , 17.00, 25.99, 'M', 3);

INSERT INTO PRODUCT (id, brand, color, image,name, quantity, regular_price, sale_price, size, category_id) 
VALUES (50, 'MK', 'Navy', 'assets/boy1.jpg', 'Men Packable Down Jacket', 5 , 56.00, 49.99, 'L', 3);

INSERT INTO PRODUCT (id, brand, color, image,name, quantity, regular_price, sale_price, size, category_id) 
VALUES (51, 'Polo', 'Grey', 'assets/boy2.jpg', 'Men Polo Cotton Shirt', 2 , 27.00, 15.99, 'M', 3);

INSERT INTO PRODUCT (id, brand, color, image,name, quantity, regular_price, sale_price, size, category_id) 
VALUES (52, 'INC', 'Black', 'assets/boy3.jpg', 'Men Thermal Shirt', 5 , 56.00, 49.99, 'XL', 3);

INSERT INTO PRODUCT (id, brand, color, image, name, quantity, regular_price, sale_price, size, category_id) 
VALUES (53, 'Tommy', 'White', 'assets/boy4.jpg', 'Men Waffle-Knit Jogger Pants', 3 , 56.00, 56.99, 'S', 3);

INSERT INTO PRODUCT (id, brand, color, image, name, quantity, regular_price, sale_price, size, category_id) 
VALUES (54, 'Bonnie', 'White', 'assets/boy5.jpg', 'Girls Metallic Plaid Dress', 4 , 17.00, 25.99, 'M', 3);

INSERT INTO PRODUCT (id, brand, color, image, name, quantity, regular_price, sale_price, size, category_id) 
VALUES (55, 'MK', 'Pink', 'assets/girl2.jpg', 'Girls Velvet & Embroidered-Mesh Dress', 5 , 56.00, 49.99, 'L', 3);

INSERT INTO PRODUCT (id, brand, color, image, name, quantity, regular_price, sale_price, size, category_id) 
VALUES (56, 'Polo', 'Black', 'assets/girl3.jpg', 'Boy Cotton Shirt', 2 , 27.00, 15.99, 'M', 3);

INSERT INTO PRODUCT (id, brand, color, image, name, quantity, regular_price, sale_price, size, category_id) 
VALUES (70, 'Luaren', 'White', 'assets/beauty1.jpg','Lellished Mock-Neck Midi Dress', 4 , 17.00, 25.99, 'M', 5);

INSERT INTO PRODUCT (id, brand, color, image, name, quantity, regular_price, sale_price, size, category_id) 
VALUES (71, 'Nike', 'Black', 'assets/beauty2.jpg','Lellished Mock-Neck Midi Dress', 4 , 17.00, 25.99, 'S', 5);

INSERT INTO PRODUCT (id, brand, color, image, name, quantity, regular_price, sale_price, size, category_id) 
VALUES (72, 'CK', 'Red', 'assets/beauty3.jpg', 'Floral Brocade High-Low Dress', 2 , 27.00, 15.99, 'M', 5);

INSERT INTO PRODUCT (id, brand, color, image, name, quantity, regular_price, sale_price, size, category_id) 
VALUES (73, 'INC', 'White', 'assets/beauty4.jpg', 'Off-The-Shoulder Dress', 5 , 56.00, 49.99, 'XL', 5);

INSERT INTO PRODUCT (id, brand, color, image, name, quantity, regular_price, sale_price, size, category_id) 
VALUES (74, 'Julia', 'Black','assets/beauty5.jpg', 'Mesh & Jacquard A-Line Dress', 3 , 56.00, 56.99, 'S', 5);

INSERT INTO PRODUCT (id, brand, color, image, name, quantity, regular_price, sale_price, size, category_id) 
VALUES (75, 'Nike', 'White', 'assets/beauty6.jpg', 'Men Down Packable Puffer Jacket', 4 , 17.00, 25.99, 'M', 5);

INSERT INTO PRODUCT (id, brand, color, image,name, quantity, regular_price, sale_price, size, category_id) 
VALUES (76, 'MK', 'Navy', 'assets/beauty7.jpg', 'Men Packable Down Jacket', 5 , 56.00, 49.99, 'L', 5);

INSERT INTO PRODUCT (id, brand, color, image,name, quantity, regular_price, sale_price, size, category_id) 
VALUES (77, 'Polo', 'Grey', 'assets/furniture1.jpg', 'Men Polo Cotton Shirt', 2 , 27.00, 15.99, 'M', 6);

INSERT INTO PRODUCT (id, brand, color, image,name, quantity, regular_price, sale_price, size, category_id) 
VALUES (78, 'INC', 'Black', 'assets/furniture2.jpg', 'Men Thermal Shirt', 5 , 56.00, 49.99, 'XL', 6);

INSERT INTO PRODUCT (id, brand, color, image, name, quantity, regular_price, sale_price, size, category_id) 
VALUES (79, 'Tommy', 'White', 'assets/furniture3.jpg', 'Men Waffle-Knit Jogger Pants', 3 , 56.00, 56.99, 'S', 6);

INSERT INTO PRODUCT (id, brand, color, image, name, quantity, regular_price, sale_price, size, category_id) 
VALUES (80, 'Bonnie', 'White', 'assets/furniture4.jpg', 'Girls Metallic Plaid Dress', 4 , 17.00, 25.99, 'M', 6);

INSERT INTO PRODUCT (id, brand, color, image, name, quantity, regular_price, sale_price, size, category_id) 
VALUES (81, 'MK', 'Pink', 'assets/furniture5.jpg', 'Girls Velvet & Embroidered-Mesh Dress', 5 , 56.00, 49.99, 'L', 6);

INSERT INTO PRODUCT (id, brand, color, image, name, quantity, regular_price, sale_price, size, category_id) 
VALUES (82, 'Polo', 'Black', 'assets/furniture1.jpg', 'Boy Cotton Shirt', 2 , 27.00, 15.99, 'M', 6);

INSERT INTO PRODUCT (id, brand, color, image, name, quantity, regular_price, sale_price, size, category_id) 
VALUES (83, 'Luaren', 'White', 'assets/accessories1.jpg','Lellished Mock-Neck Midi Dress', 4 , 17.00, 25.99, 'M', 7);

INSERT INTO PRODUCT (id, brand, color, image, name, quantity, regular_price, sale_price, size, category_id) 
VALUES (84, 'Nike', 'Black', 'assets/accessories2.jpg','Lellished Mock-Neck Midi Dress', 4 , 17.00, 25.99, 'S', 7);

INSERT INTO PRODUCT (id, brand, color, image, name, quantity, regular_price, sale_price, size, category_id) 
VALUES (85, 'CK', 'Red', 'assets/accessories3.jpg', 'Floral Brocade High-Low Dress', 2 , 27.00, 15.99, 'M', 7);

INSERT INTO PRODUCT (id, brand, color, image, name, quantity, regular_price, sale_price, size, category_id) 
VALUES (86, 'INC', 'White', 'assets/accessories4.jpg', 'Off-The-Shoulder Dress', 5 , 56.00, 49.99, 'XL', 7);

INSERT INTO PRODUCT (id, brand, color, image, name, quantity, regular_price, sale_price, size, category_id) 
VALUES (87, 'Julia', 'Black','assets/accessories5.jpg', 'Mesh & Jacquard A-Line Dress', 3 , 56.00, 56.99, 'S', 7);

INSERT INTO PRODUCT (id, brand, color, image, name, quantity, regular_price, sale_price, size, category_id) 
VALUES (88, 'Nike', 'White', 'assets/accessories6.jpg', 'Men Down Packable Puffer Jacket', 4 , 17.00, 25.99, 'M', 7);

INSERT INTO PRODUCT (id, brand, color, image,name, quantity, regular_price, sale_price, size, category_id) 
VALUES (89, 'MK', 'Navy', 'assets/accessories7.jpg', 'Men Packable Down Jacket', 5 , 56.00, 49.99, 'L', 7);

INSERT INTO PRODUCT (id, brand, color, image,name, quantity, regular_price, sale_price, size, category_id) 
VALUES (90, 'Polo', 'Grey', 'assets/accessories1.jpg', 'Men Polo Cotton Shirt', 2 , 27.00, 15.99, 'M', 7);

INSERT INTO PRODUCT (id, brand, color, image,name, quantity, regular_price, sale_price, size, category_id) 
VALUES (91, 'INC', 'Black', 'assets/accessories2.jpg', 'Men Thermal Shirt', 5 , 56.00, 49.99, 'XL', 7);

INSERT INTO PRODUCT (id, brand, color, image, name, quantity, regular_price, sale_price, size, category_id) 
VALUES (92, 'Tommy', 'White', 'assets/shoes2.jpg', 'Men Waffle-Knit Jogger Pants', 3 , 56.00, 56.99, 'S', 8);

INSERT INTO PRODUCT (id, brand, color, image, name, quantity, regular_price, sale_price, size, category_id) 
VALUES (93, 'Bonnie', 'White', 'assets/women4.jpg', 'Girls Metallic Plaid Dress', 4 , 17.00, 25.99, 'M', 8);

INSERT INTO PRODUCT (id, brand, color, image, name, quantity, regular_price, sale_price, size, category_id) 
VALUES (94, 'MK', 'Pink', 'assets/boy5.jpg', 'Girls Velvet & Embroidered-Mesh Dress', 5 , 56.00, 49.99, 'L', 8);

INSERT INTO PRODUCT (id, brand, color, image, name, quantity, regular_price, sale_price, size, category_id) 
VALUES (95, 'Polo', 'Black', 'assets/men1.jpg', 'Boy Cotton Shirt', 2 , 27.00, 15.99, 'M', 8);

