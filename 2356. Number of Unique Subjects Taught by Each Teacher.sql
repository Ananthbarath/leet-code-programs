select t.teacher_id, count(*) as cnt
from (select distinct teacher_id,subject_id,dept_id from teacher group by teacher_id,subject_id) as t
group by t.teacher_id;
