package home

class Document {

    static constraints = {
    }

    static belongsTo=[tag:DocumentTag,type:DocumentType]

    static hasMany=[comments:Comment]

    String title
    String content
    String viewsNum
    Date dateCreated
    Date lastUpdated
}
