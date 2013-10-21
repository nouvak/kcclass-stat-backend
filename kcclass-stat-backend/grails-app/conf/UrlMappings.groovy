class UrlMappings {

	static mappings = {
//		"/$controller/$action?/$id?"{
//			constraints {
//				// apply constraints here
//			}
//		}
		
		"/mobile/incidents/$action"(controller: "incidents")
		
		"/mobile/incident/$id/alarms"(controller: "alarms", action: "getAllAlarms")

		"/"(view:"/index")
		"500"(view:'/error')
	}
}
