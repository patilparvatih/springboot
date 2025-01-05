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

## Command to create course_table
```
create table course_table(
    cid int not null auto_increment,
    name text,
    price double
);
```

### course_table Table


| cid  | name | price  |
| ------------- |:-------------:| ---------:|
| 1      | Java Basic     |  4000  |
| 2      | Java Spring Boot     |   15000   |
| 3      | Python     |    5000  |
