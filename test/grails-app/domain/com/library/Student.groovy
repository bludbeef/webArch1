package com.library

class Student {

String name

String email

String studentId

String course

static hasMany = [book:Book]

String toString(){

}
    static constraints = {
    
    name()
    
    email()
    
    studentId()
    
    course()
}

}
