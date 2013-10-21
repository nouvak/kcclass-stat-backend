package si.kcclass.statbackend

import grails.converters.JSON;

class AlarmsController {

	def getAllAlarms() {
		log.debug("Returning the list of alarms for the incident: " + params.id)
		def alarmsForIncident = [
			"alarms": [
				[
					"id": "1234567890aaaaaa",
					"name": "192.168.1.12 unreacheable (ping)",
					"status": "crit",
					"date": 1371818328000
				],
				[
					"id": "1234567890bbbbbb",
					"name": "192.168.1.12 reacheable (ping)",
					"status": "ok",
					"date": 1371818022000
				],
				[
					"id": "1234567890cccccc",
					"name": "192.168.1.12 high latency (ping)",
					"status": "warn",
					"date": 1371817965000
				]
			]
		]
		render alarmsForIncident as JSON
	}
}
