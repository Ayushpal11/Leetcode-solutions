# Write your MySQL query statement below
-- SELECT SalesPerson.name FROM SalesPerson WHERE SalesPerson.sales_id not in 
-- (SELECT Orders.sales_id FROM Orders LEFT JOIN Company ON Orders.com_id WHERE Company.name = 'RED')
SELECT SalesPerson.name from SalesPerson where SalesPerson.sales_id not in (SELECT DISTINCT Orders.sales_id from Company, Orders where Company.com_id = Orders.com_id and Company.name = 'RED');