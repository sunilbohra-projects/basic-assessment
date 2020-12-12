# basic-assessment

This MicrroService exposes  operations forr getting countries, leagues, teams, standings.

To start the service as a docker, please follow the below steps:

1. Download the assessment.tar from https://github.com/sunilbohra-projects/basic-assessment
2. Login to docker using `docker login --username=<username>`
3. Run the command to extract the image `docker load < assessment.tar`
4. Run the command `docker images` to ensure the image is extracted with the name sunilbohra123/basic-assessment
5. Start the container using `docker run -p 9090:9090 sunilbohra123/basic-assessment`
6. On the browser/postman, hit the URL http://localhost:9090/football-service/get_teams to acess the endpoint