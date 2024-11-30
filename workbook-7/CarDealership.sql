CREATE TABLE dealerships (
    dealership_id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(50),
    address VARCHAR(50),
    phone VARCHAR(12)
);
CREATE TABLE vehicles (
    VIN VARCHAR(17) PRIMARY KEY, 
    make VARCHAR(30),
    model VARCHAR(30),
    year INT,
    price DECIMAL(10, 2),
    SOLD BOOLEAN DEFAULT FALSE
);
CREATE TABLE inventory (
    dealership_id INT,
    VIN VARCHAR(17),
    FOREIGN KEY (dealership_id) REFERENCES dealerships(dealership_id),
    FOREIGN KEY (VIN) REFERENCES vehicles(VIN)
);
CREATE TABLE sales_contracts (
    id INT AUTO_INCREMENT PRIMARY KEY,
    VIN VARCHAR(17),
    customer_name VARCHAR(50),
    sale_date DATE,
    sale_price DECIMAL(10, 2),
    FOREIGN KEY (VIN) REFERENCES vehicles(VIN)
);
CREATE TABLE lease_contracts (
    id INT AUTO_INCREMENT PRIMARY KEY,
    VIN VARCHAR(17),
    customer_name VARCHAR(50),
    lease_start DATE,
    lease_end DATE,
    monthly_payment DECIMAL(10, 2),
    FOREIGN KEY (VIN) REFERENCES vehicles(VIN)
);
INSERT INTO dealerships (name, address, phone) VALUES
('Prime Auto', '123 Main St, Springfield', '555-123-4567'),
('Auto Hub', '456 Elm St, Shelbyville', '555-987-6543');
INSERT INTO vehicles (VIN, make, model, year, price, SOLD) VALUES
('1HGCM82633A123456', 'Toyota', 'Corolla', 2022, 20000.00, FALSE),
('2HGFA16507H123457', 'Honda', 'Civic', 2023, 22000.00, FALSE),
('3N1AB7AP7HY123458', 'Nissan', 'Altima', 2021, 18000.00, FALSE),
('1C4RJFBG9KC123459', 'Jeep', 'Grand Cherokee', 2020, 35000.00, TRUE);
INSERT INTO inventory (dealership_id, VIN) VALUES
(1, '1HGCM82633A123456'),
(1, '2HGFA16507H123457'),
(2, '3N1AB7AP7HY123458'),
(2, '1C4RJFBG9KC123459');
INSERT INTO sales_contracts (VIN, customer_name, sale_date, sale_price) VALUES
('1C4RJFBG9KC123459', 'John Doe', '2024-11-28', 34000.00);
