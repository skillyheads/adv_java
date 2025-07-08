-- Create Address table first (referenced by Employee)
CREATE TABLE address (
    address_id INT PRIMARY KEY,
    alias VARCHAR(50),
    house_no VARCHAR(20),
    street_name VARCHAR(100),
    pincode VARCHAR(10)
);

-- Create Employee table with foreign key reference to Address
CREATE TABLE employee (
    emp_id INT PRIMARY KEY,
    emp_name VARCHAR(100) NOT NULL,
    address_id INT,
    CONSTRAINT fk_employee_address
        FOREIGN KEY (address_id) REFERENCES address(address_id)
);

-- Create indexes for better performance
CREATE INDEX idx_employee_address_id ON employee(address_id);
CREATE INDEX idx_address_pincode ON address(pincode);
CREATE INDEX idx_employee_name ON employee(emp_name);