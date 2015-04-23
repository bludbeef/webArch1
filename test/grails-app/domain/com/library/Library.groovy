package com.library

class Library {

String location

String openingHours

String book

String student

String librarian

static hasMany = [librarian:Librarian,book:Book,student:Student]

String toString(){

}

    static constraints = {
    
    location()
    
    openingHours()
    
    book()
    
    student()
    
    librarian()
    
}

}
