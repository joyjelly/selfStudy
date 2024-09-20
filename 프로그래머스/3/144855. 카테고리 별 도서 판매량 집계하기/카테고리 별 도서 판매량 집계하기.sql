-- 코드를 입력하세요
SELECT b.CATEGORY, sum(s.SALES) TOTAL_SALES
from BOOK b,BOOK_SALES s
where s.BOOK_ID=b.BOOK_ID and to_char(s.SALES_DATE,'YYYY-MM') = '2022-01'
group by CATEGORY
order by 1