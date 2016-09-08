package home

class User {

    static constraints = {
    }

    static hasMany=[comments:Comments]
    
    String username

}
