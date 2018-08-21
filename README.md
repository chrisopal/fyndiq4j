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

#### Using Client Builder:
```java
//Client Example
FQClient fqClient = FQClientFactory.builder()
                .endpoint("https://merchants-api-sandbox.fyndiq.com/api/v1")
                .merchantId("3eb1d426-0b6e-4dcd-90d0-3c1547016ff1")
                .token("6a43767e-0f13-47f7-831f-264bfb5589e3")
                .withConfig(config())
                .authenticate();
```

#### New Client
```java
FQClient fqClient = FQClientFactory.newClient("3eb1d426-0b6e-4dcd-90d0-3c1547016ff1", "6a43767e-0f13-47f7-831f-264bfb5589e3", "https://merchants-api-sandbox.fyndiq.com/api/v1");
```

#### Get Orders
```java
fqClient().orders().list()
```


