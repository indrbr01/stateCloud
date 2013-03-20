package statecloud

/* Domain object representing a state*/

class State {
    
    String name
    
    static hasMany = [zipCodes: ZipCode]

    static constraints = {
        name blank: false
    }
    
    
}
