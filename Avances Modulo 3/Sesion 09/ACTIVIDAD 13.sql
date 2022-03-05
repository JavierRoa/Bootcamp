select to_char (A.NUMRUN, '99g999g999') || '-' || DVRUN "RUN CLIENTE", 
INITCAP (PNOMBRE) || ' ' || INITCAP (SNOMBRE) || ' ' || INITCAP (APPATERNO) || ' ' || INITCAP (APMATERNO) "NOMBRE CLIENTE", 
to_char (FECHA_NACIMIENTO, 'DD "de" Month') "DIA DE CUMPLEA�OS", 
G.DIRECCION || '/' || UPPER (D.NOMBRE_REGION) "Direcci�n/REGION SUCURSAL"
  from CLIENTE A 
    inner join COMUNA B on (A.COD_REGION = B.COD_REGION 
    and A.COD_COMUNA = B.COD_COMUNA 
    and A.COD_PROVINCIA = B.COD_PROVINCIA)
    inner join REGION D on (A.COD_REGION = D.COD_REGION)
    inner join SUCURSAL_RETAIL G on (A.COD_REGION = G.COD_REGION 
    and A.COD_COMUNA = G.COD_COMUNA 
    and A.COD_PROVINCIA = G.COD_PROVINCIA)
      where FECHA_NACIMIENTO like ('%09%') and A.COD_REGION like ('&REGION')
        order by TO_CHAR (A.FECHA_NACIMIENTO, 'DD/MM'), APPATERNO;
      