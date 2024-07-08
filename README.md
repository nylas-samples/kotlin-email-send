# kotlin-email-send

This sample will show you to easily send your email with the Nylas Kotlin SDK.

## Setup

### System dependencies

- Java 18.0.2
- Maven 3.8.6

### Gather environment variables

You'll need the following values:

```text
V3_TOKEN_API = <API_KEY>
GRANT_ID = <GRANT_ID>
```

Add the above values to a new `.env` file:

```bash
$ touch .env # Then add your env variables
```

### Install dependencies

```bash
org.slf4j / slf4j-simple / 2.0.9
com.nylas.sdk / nylas / 2.4.0
io.github.cdimascio / dotenv-java / 6.4.1
```

# Compilation

To compile the application we need to use this `maven` commands:

```bash
mvn clean compile
mvn package
```

## Usage

Run the following `maven` command:

```bash
$ java -cp $KOTLIN_LIB/kotlin-stdlib.jar -jar target/kotlin-send-email-1.0-SNAPSHOT-jar-with-dependencies.jar
```

When your message is successfully sent, you'll get the following output in your terminal:

```bash
Message "With Love, from Nylas" was sent with ID 111111111111111111
```

## Learn more

Visit our [Nylas Java SDK documentation](https://developer.nylas.com/docs/developer-tools/sdk/java-sdk/) to learn more.

