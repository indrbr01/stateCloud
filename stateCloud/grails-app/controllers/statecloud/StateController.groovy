package statecloud

class StateController {
    
    def stateCloudService

    def findZipCodes(){
        stateCloudService.getZips()
        def states = State.findAll()
        println states
        /**if (zips.size < 1){
        
            println 'here'
            String url = "http://api.geonames.org/postalCodeSearch?placename=MN&username=demo"
            def callUrl = new URL(url)
        
            def response = callUrl.getText()
            
            render view: 'stateCloud', model: zips
            return
        }

        else{*/
            render view: 'stateCloud', model: [zips: states]
        /*}*/
    }
}
