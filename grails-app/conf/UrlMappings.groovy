class UrlMappings {

	static mappings = {
        "/"(controller: 'main', action:'index')
		"/$controller/$action?/$id?"{
			constraints {
				// apply constraints here
			}
		}

		"500"(view:'/error')
	}
}
