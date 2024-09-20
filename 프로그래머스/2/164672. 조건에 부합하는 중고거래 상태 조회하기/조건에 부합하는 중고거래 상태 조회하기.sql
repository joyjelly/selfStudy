-- 코드를 입력하세요
SELECT BOARD_ID,WRITER_ID,TITLE,PRICE,
case
when STATUS ='DONE' then '거래완료'
when STATUS ='SALE' then '판매중'
when STATUS ='RESERVED' then '예약중'
end as  STATUS
from USED_GOODS_BOARD 
where trunc(CREATED_DATE) = to_date('2022-10-05','YYYY-MM-DD')
order by BOARD_ID desc