Test for swagger-webapp fraction
====

To reproduce issue:

	% mvn clean wildfly-swarm:run

Browse to `http://localhost:8080/swagger-ui/` - works! (you get the Swagger UI)

To reproduce failure:

	% mvn clean wildfly-swarm:run -Dversion.wildfly.swarm=2017.7.0

Browse to `http://localhost:8080/swagger-ui/` - fails! (`HTTP/1.1 404 Not Found`)

Also fails:

	% mvn clean wildfly-swarm:run -Dversion.wildfly.swarm=2017.6.1
	
Conclusion
====	
2017.6.0 works, 2017.6.1 and 2017.7.0 fails
