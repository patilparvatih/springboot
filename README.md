# This is simple Spring Boot java code to access data from mysql database
****
### **[application.properties file](https://github.com/patilparvatih/springboot/blob/main/application.properties)**

### `spring.datasource.url`=jdbc:mysql://localhost:3306/mydb

#### in this replace `mydb` with your database name

### `spring.datasource.password`=tiger
### in this replace `tiger` with yout mysql password


****


### **[Course.java file](https://github.com/patilparvatih/springboot/blob/main/course.java)**

### `@Table(name = "course_table")` 
### In at 6 line replace `course_table` with you created table name 
### and set variableas name same as table column name with same data type
