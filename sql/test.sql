SELECT	dt.ID AS date_id,
        s.NAME AS services_name,
        hsa.ACCOUNT AS account,
        p.INVOICE AS inv,
        p.TARIFF AS tariff,
        p.DATE_PAID
FROM	PAYMENTS p
        JOIN DATE dt ON p.DATE_ID = dt.id
        JOIN HOME_SERVICES_ACCOUNTS hsa ON p.HOME_SERVICES_ACCOUNTS_ID = hsa.id
        JOIN HOME_SERVICES hs ON hsa.HOME_SERVICES_ID = hs.id
        JOIN HOME h ON hs.HOME_ID = h.id
        JOIN SERVICES s ON hs.SERVICE_ID = s.id
        JOIN USERS u ON h.USER_ID = u.id