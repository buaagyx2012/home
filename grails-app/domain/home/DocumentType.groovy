package home

class DocumentType {

    static constraints = {
    }
    static hasMany=[documents:Document]

    String name
}
