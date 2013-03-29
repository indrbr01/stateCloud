package statecloud

class StateController {
    
    def stateCloudService
    
    static defaultAction = "displayCloud"

    def displayCloud(){ //get map of states and # of zip codes and pass them into stateCloud view
        
        def stateMap = stateCloudService.getStateMap()
        
        render view: 'stateCloud', model: [stateMap: stateMap]
    }
    
    def getTags(){ //delete entries from State then generate new entries
        
        State.executeUpdate("delete from State")
        
        stateCloudService.getStates()
        
        displayCloud()      
    }
    
    def deleteTags(){ //delete entries from State table
        
        State.executeUpdate("delete from State")
        
        displayCloud()
    }
}
