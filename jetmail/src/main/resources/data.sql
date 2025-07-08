-- =================================================================
-- DATA.SQL - Sample Data for Employee and Address Tables
-- =================================================================

-- Insert Address records first
INSERT INTO address (address_id, alias, house_no, street_name, pincode) VALUES
(1, 'Home', '123', 'Main Street', '10001'),
(2, 'Office', '456', 'Business Avenue', '10002'),
(3, 'Apartment', '789', 'Residential Lane', '10003'),
(4, 'Villa', '321', 'Garden Road', '10004'),
(5, 'Condo', '654', 'Park View Drive', '10005'),
(6, 'House', '987', 'Oak Street', '10006'),
(7, 'Flat', '147', 'Pine Avenue', '10007'),
(8, 'Bungalow', '258', 'Maple Lane', '10008'),
(9, 'Penthouse', '369', 'Sky Tower Street', '10009'),
(10, 'Studio', '741', 'Urban Plaza', '10010'),
(11, 'Townhouse', '852', 'Heritage Street', '10011'),
(12, 'Cottage', '963', 'Country Lane', '10012'),
(13, 'Loft', '159', 'Industrial Avenue', '10013'),
(14, 'Duplex', '357', 'Family Street', '10014'),
(15, 'Mansion', '468', 'Elite Boulevard', '10015');

-- Insert Employee records with address references
INSERT INTO employee (emp_id, emp_name, address_id) VALUES
(101, 'John Smith', 1),
(102, 'Sarah Johnson', 2),
(103, 'Michael Brown', 3),
(104, 'Emily Davis', 4),
(105, 'David Wilson', 5),
(106, 'Jessica Miller', 6),
(107, 'Christopher Garcia', 7),
(108, 'Amanda Rodriguez', 8),
(109, 'Matthew Martinez', 9),
(110, 'Ashley Anderson', 10),
(111, 'Joshua Taylor', 11),
(112, 'Samantha Thomas', 12),
(113, 'Andrew Jackson', 13),
(114, 'Elizabeth White', 14),
(115, 'Daniel Harris', 15),
(116, 'Megan Martin', 1),  -- Multiple employees can share same address
(117, 'Ryan Thompson', 2),
(118, 'Lauren Garcia', 3),
(119, 'Kevin Lee', 4),
(120, 'Nicole Walker', 5);

-- Insert some employees without address (NULL address_id)
INSERT INTO employee (emp_id, emp_name, address_id) VALUES
(121, 'Alex Chen', NULL),
(122, 'Maria Rodriguez', NULL),
(123, 'James Kim', NULL);