# Play / ZIO integration 

This project shows ZIO integration in a playframework application. 

## Run the project 

``` 
sbt ~run
```

## Apis 

### List users

``` 
curl localhost:9000/users | jq
```

### Create a user 

``` 
curl localhost:9000/users -H 'Content-Type: application/json' -d '
    {
        "email": "ragnar.lodbrock@gmail.com", 
        "name": "Ragnar Lodbrock",
        "birthDate": "1981-04-01"
    }' | jq
```

#### Validation error : 

``` 
curl http://localhost:9000/users -H 'Content-Type: application/json' -d '
    {
        "email": "ragnar.lodbrock@gmail.com", 
        "name": "Ragnar Lodbrock",
        "birthDate": "1981-04-01", 
        "drivingLicenceDate": "1995-04-01"
    }' | jq
```


### Update a user 

``` 
curl -XPUT http://localhost:9000/users/ragnar.lodbrock@gmail.com -H 'Content-Type: application/json' -d '
    {
        "email": "ragnar.lodbrock@gmail.com", 
        "name": "Ragnar Lodbrock",
        "birthDate": "1981-04-01"
    }' | jq
```

### Delete a user 

``` 
curl -XDELETE http://localhost:9000/users/ragnar.lodbrock@gmail.com --include
```

### get a user 

``` 
curl http://localhost:9000/users/ragnar.lodbrock@gmail.com
```


