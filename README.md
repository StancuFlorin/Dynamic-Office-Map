# Dynamic-Office-Map

## fsociety Team ##

- Florin Stancu
- Cosmin Aldea
- Adrian Tundrea

## Manually Deployment ##

- install MongoDB, Tomcat and Maven
- manually create the MongoDB collection nammed "dynamicofficemap"
- build the applications with maven
- deploy web-portal application to /
- deploy server-api application to /api
- create a host nammed "MongoDB" that should point to your MongoDB host (or change the host on application.properties)

## Docker Deployment ##
- create a container with MongoDB called "MongoDB"
- manually create the MongoDB collection nammed "dynamicofficemap"
- build the applications
- run docker-compose up -d
- add MongoDB container on dynamicofficemap_default network

## Jenkins Build ##
- create a container with MongoDB called "MongoDB"
- manually create the MongoDB collection nammed "dynamicofficemap"
- run the Jenkins file

### Asset Type Images ###
- resources/image/asset.png
- resources/image/coffee.png
- resources/image/pc.png
- resources/image/printer.png

### Create User ###
- users are created manually for now directly on the database

```
{
    "firstName" : "Florin",
    "lastName" : "Stancu",
    "email" : "florin@email.com",
    "username" : "florin",
    "mac" : "MAC-FLORIN"
}
```