select CARRERAID "IDENTIFICACION DE LA CARRERA", count (*) "TOTAL ALUMNOS MATRICULADOS",
'Le corresponde' || to_char(count(*) * 30200, '$999G999') || ' del presupuesto total asignado para publicidad' monto_por_publicidad  
from ALUMNO
group by CARRERAID
order by count(*) DESC;