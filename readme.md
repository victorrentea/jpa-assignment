# JPA Training 
http://victorrrentea.ro

### Assignment
First, start up the in-memory database by running `StartDatabase.java`.
Everytime you run this program, the old database contents is destroyed (data, tables, FKs...)

Then launch `JpaApplication.java`: this will try to create the necessary tables according to the JPA model you have. If the JPA model is invalid, it will crash.
After the program runs, you can inspect the contents of the database by connecting
to it from your favourite DB manager (including IntelliJ Database view)
, using:
- connection string `jdbc:h2:tcp://localhost:9092/~/test`
- user `sa`
- password `sa`
- driver H2

Then, try to add all necessary JPA annotations to make the java model persist, 
inspecting the contents of the database regularly to check the tables + links are ok

**Note**: you might sometimes re-run StartDatabase again in order to delete any stray tables that are left in the schema.

To get a picture of the model, this is the conceptual model: 
![](conceptual-model.jpg)

Also, if you prefer solving the exercise on a paper,
you can print [this pdf](printable.pdf)

## Hints
Stuff to use
- @Embeddable
- @Id
- @GeneratedValue
- @ElementCollection
- @Inheritance
- @OneToMany
- @JoinColumn
- ...

Start small, with the least connected Entity (for example Error Lor or TeacherDetails).
Also, comment out inconvenient collections until the entity starts to be generated, then uncomment the children collections progressively.  

In order to test how entities are inserted, try to insert several entities of each type in `JpaApplication#insertHere`

If you really block, there is a COMMIT in the git history called 'SOLVED'. I wonder what that contains ... :P

## Tradeoffs and Debates
What are the design alternatives you see?

What are the tradeoffs of each ?

