-- 코드를 입력하세요
SELECT count (age) users
from 
(select age
from USER_INFO 
 where age>=20 and age<=29 and to_char(JOINED,'YYYY') = '2021'
)

