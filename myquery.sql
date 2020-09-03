Select inst.name as "INSTITUTION NAME"
       course.name as "COURSE NAME"
       count(stu.student) as "NUMBER OF STUDENTS"
       
from   education_institution  inst
join course
on inst.institionid = course.institution
join student
on student.course = course.courseid
    
group by "NUMBER OF STUDENTS", "COURSE NAME"
order by "NUMBER OF STUDENTS" desc;
