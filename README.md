# Java Dominoes Application

This application takes valid sets of dominoes and returns the highest possible sum from all valid permutations, starting with the same initial domino. A valid domino would:

- have values between 1 and 10
- not have the same values on both sides, so (5, 5) would not be valid.

Dominoes are chained by mutual values, so:

- (1, 3), (3, 4) would match
- (7, 8), (5, 6) would not match

The application is divided into two modules:

- **_domino-core_** -- core logic
- **_domino-api_** -- a Dropwizard REST API exposing the core logic

## Requirements

- Java 11+
- Maven 3.8+

## Running the application

1. Clone the repository:

```bash
git clone https://github.com/campbellm92/dominoes-best-sum-app
```

2. Build the core module and API:

```bash
cd domino-core
mvn clean install
cd ../domino-api
mvn clean package
```

3. Run the application:

```bash
java -jar target/domino-api-1.0-SNAPSHOT.jar server config.yml
```

## API Endpoint

POST /best-chain
Content-Type: application/json

Request body:

```json
{
  "tiles": [
    { "left": 1, "right": 3 },
    { "left": 3, "right": 4 },
    { "left": 4, "right": 6 }
  ]
}
```

Response:

```json
{
  "bestSum": 13
}
```

## Example curl request:

```bash
curl -X POST http://localhost:8080/best-chain \
  -H "Content-Type: application/json" \
  -d '{
        "tiles": [
          { "left": 1, "right": 3 },
          { "left": 3, "right": 4 },
          { "left": 4, "right": 6 }
        ]
      }'
```

Feel free to check out **_curl-examples.txt_** for more examples.

## Approach / Core Logic

The core logic lives in the **_domino-core_** module. It recursively explores all valid permutations of the domino list, starting from the first domino. Each time a matching tile is found, the program:

1. Adds the matched value to the running sum
2. Creates a new tile from the unmatched values
3. Computes the best possible sum from the remaining tiles

The algorithm returns the highest sum found among all valid permutations.
