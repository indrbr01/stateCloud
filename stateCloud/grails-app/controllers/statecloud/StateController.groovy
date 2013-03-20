package statecloud

class StateController {

    def getZipCodes(){
        def zips = ZipCode.findAll()
        render view: 'stateCloud', model: zips
    }
}
