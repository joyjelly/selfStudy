SELECT      A.REST_ID
        ,   A.REST_NAME
        ,   A.FOOD_TYPE
        ,   A.FAVORITES
        ,   A.ADDRESS
        ,   ROUND(avg(b.REVIEW_SCORE),2) SCORE
FROM        REST_INFO   A
        ,   REST_REVIEW B
WHERE       1=1
            AND A.REST_ID = B.REST_ID
            AND A.ADDRESS LIKE '서울%'
GROUP BY    A.REST_ID
        ,   A.REST_NAME
        ,   A.FOOD_TYPE
        ,   A.FAVORITES
        ,   A.ADDRESS
ORDER BY    6 DESC, 4 DESC