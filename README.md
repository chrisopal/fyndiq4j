fyndiq4j
===========

fyndiq4j is a fluent Java client for [Fyndiq](https://merchantapi.fyndiq.com/).

Maven
-----

**Using Fyndiq4j with the OkHttp Connector**

```xml
<dependency>
    <groupId>com.salesmore.yak</groupId>
    <artifactId>fyndiq4j-core</artifactId>
    <version>1.0.0-SNAPSHOT</version>
</dependency>
```
```xml
<dependency>
    <groupId>com.salesmore.yak</groupId>
    <artifactId>okhttp</artifactId>
    <version>1.0.0-SNAPSHOT</version>
</dependency>
```

Quick Usage Guide
-----------------

Below are some examples of the API usage.

#### Using Client:
```java
//Client Example
private static final String MERCHANT_ID = "3eb1d426-0b6e-4dcd-90d0-3c1547016ff1";
private static final String TOKEN_ID = "6a43767e-0f13-47f7-831f-264bfb5589e3";
private static final String SERVER_ENDPOINT = "https://merchants-api-sandbox.fyndiq.com/api/v1";

FQClient fqClient = FQClientFactory.builder()
                .endpoint(SERVER_ENDPOINT)
                .merchantId(MERCHANT_ID)
                .token(TOKEN_ID)
                .withConfig(config())
                .authenticate();
```

