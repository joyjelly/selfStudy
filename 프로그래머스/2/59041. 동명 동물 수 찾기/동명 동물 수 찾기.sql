-- 코드를 입력하세요
SELECT NAME, count(NAME) count
from ANIMAL_INS 
where NAME  is not null
group by NAME
having count(NAME)>1
order by NAME