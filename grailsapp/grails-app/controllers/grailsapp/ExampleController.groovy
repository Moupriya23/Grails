package grailsapp


import grails.rest.*
import grails.converters.*

class ExampleController  extends RestfulController {
	static responseFormats = ['json', 'xml']
    ExampleController() {
        super(Example)
    }

	

    def index() { 
        render "Hello.."
    }
}
