SELECT A.ANIMAL_ID
     , A.NAME
  FROM (SELECT A.ANIMAL_ID
             , A.NAME
             , TRUNC(B.DATETIME) - TRUNC(A.DATETIME) AS DATETIME
          FROM ANIMAL_INS A
               INNER JOIN ANIMAL_OUTS B
            ON A.ANIMAL_ID = B.ANIMAL_ID
         ORDER BY DATETIME DESC) A
         fetch first 2 rows only