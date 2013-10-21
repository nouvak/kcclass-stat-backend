package si.kcclass.statbackend

import grails.converters.JSON;

class IncidentsController {

	def pending() {
		log.debug("Returning the list of pending incidents.")
		def pendingIncidents = [
			"incidents": [
				[
					"id": "123457890abcdef ",
					"name": "192.168.1.12 unreacheable (ping)",
					"current_status": "crit",
					"date_from": 1371817965000,
					"last_change": 1371818328000
				],
				[
					"id": "123457890abcde0",
					"name": "10.10.2.112 high latency (ping)",
					"current_status": "warn",
					"date_from": 1371818203000,
					"last_change": 1371818203000
				]
			]
		]
		render pendingIncidents as JSON
	}

	def closed() {
		log.debug("Returning the list of closed incidents.")
		def closedIncidents = [
			"incidents": [
				[
					"id": "123457890abcdef ",
					"name": "192.168.1.12 unreacheable (ping)",
					"current_status": "crit",
					"date_from": 1371817965000,
					"last_change": 1371818328000
				],
				[
					"id": "123457890abcde0",
					"name": "10.10.2.112 high latency (ping)",
					"current_status": "warn",
					"date_from": 1371818203000,
					"last_change": 1371818203000
				]
			]
		]
		render closedIncidents as JSON
	}
}
