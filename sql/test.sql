SELECT  h.ADDRESS AS home_address,
        b.DATE AS date,
        s.NAME AS service,
        i.NUMBER AS number,
        pmt.VALUE AS val,
        pmt.TARIFF AS tariff
FROM    PAYMENT pmt
  JOIN SERVICE_BY_INVOICE sbi ON pmt.SERVICE_BY_INVOICE_ID = sbi.ID
  JOIN BILL b ON sbi.BILL_ID = b.ID
  JOIN SERVICE s ON sbi.SERVICE_ID = s.ID
  JOIN INVOICE i ON sbi.INVOICE_ID = i.ID
  JOIN HOME h ON b.HOME_ID = h.ID
  JOIN USERS u ON h.USER_ID = u.ID
WHERE b.DATE = 201903
-- GROUP BY h.ADDRESS,
--         s.NAME,
--         i.NUMBER
ORDER BY s.NAME, i.NUMBER