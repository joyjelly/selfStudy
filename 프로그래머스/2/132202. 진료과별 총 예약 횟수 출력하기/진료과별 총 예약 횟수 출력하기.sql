-- 코드를 입력하세요
SELECT MCDP_CD 진료과코드, count (APNT_NO) "5월예약건수"
FROM  APPOINTMENT  
where to_char(APNT_YMD,'YYYY-MM') = '2022-05'
group by MCDP_CD
order by "5월예약건수" , MCDP_CD