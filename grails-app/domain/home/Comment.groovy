package home

class Comment {

    static constraints = {
    }

    static belongsTo=[document:Document,user:User]

    String content
    Date dateCreated
    Date lastUpdated
}
