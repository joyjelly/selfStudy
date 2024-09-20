-- 코드를 입력하세요
select CATEGORY, count(CATEGORY) PRODUCTS
from
(
select substr(PRODUCT_CODE,1,2) CATEGORY
    from PRODUCT 
)
group by CATEGORY
order by CATEGORY