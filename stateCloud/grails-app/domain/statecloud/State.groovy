package statecloud

/* Domain object representing a state*/

class State {
    
    String name
    
    int numberOfZips = 0

    static constraints = {
        name blank: false
    }
    
    
}
