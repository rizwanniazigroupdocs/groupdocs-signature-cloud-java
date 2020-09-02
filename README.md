# GroupDocs.Signature Cloud SDK for Java
This repository contains GroupDocs.Signature Cloud SDK for Java source code. This SDK allows you to work with GroupDocs.Signature Cloud REST APIs in your Java applications.

## Requirements

Building the API client library requires [Maven](https://maven.apache.org/) to be installed.

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn deploy
```

Refer to the [official documentation](https://maven.apache.org/plugins/maven-deploy-plugin/usage.html) for more information.

### Maven users

Add following repository and dependency to your project's POM

```xml
<repository>
    <id>groupdocs-artifact-repository</id>
    <name>GroupDocs Artifact Repository</name>
    <url>https://repository.groupdocs.cloud/repo</url>
</repository>
```

```xml
<dependency>
    <groupId>com.groupdocs</groupId>
    <artifactId>groupdocs-signature-cloud</artifactId>
    <version>20.7</version>
    <scope>compile</scope>
</dependency>
```

### Others

At first generate the JAR by executing:

    mvn package

Then manually install the following JARs:

* target/groupdocs-signature-cloud-20.7.jar
* target/lib/*.jar

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java
import com.groupdocs.cloud.signature.client.*;
import com.groupdocs.cloud.signature.model.*;
import com.groupdocs.cloud.signature.api.InfoApi;

import java.util.*;

public class ApiExample {

    public static void main(String[] args) {
        //TODO: Get your AppSID and AppKey at https://dashboard.groupdocs.cloud (free registration is required).
        String appSid = "XXXXXXXX-XXXX-XXXX-XXXX-XXXXXXXXXXXX";
        String appKey = "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX";

        Configuration configuration = new Configuration(appSid, appKey);
        
        InfoApi infoApi = new InfoApi(configuration);

        try {            
            FormatsResult response = infoApi.getSupportedFileFormats();
            
            for (Format format : response.getFormats()) {
                System.out.println(format.getFileFormat());
            }
        } catch (ApiException e) {
            System.err.println("Exception");
            e.printStackTrace();
        }
    }
}
```

## Licensing
All GroupDocs.Signature Cloud SDKs are licensed under [MIT License](LICENSE).

[Home](https://www.groupdocs.cloud/) | [Product Page](https://products.groupdocs.cloud/signature/java) | [Docs](https://docs.groupdocs.cloud/signature/) | [Demos](https://products.groupdocs.app/signature/family) | [API Reference](https://apireference.groupdocs.cloud/signature/) | [Examples](https://github.com/groupdocs-signature-cloud/groupdocs-signature-cloud-java-samples) | [Blog](https://blog.groupdocs.cloud/category/signature/) | [Free Support](https://forum.groupdocs.cloud/c/signature) | [Free Trial](https://purchase.groupdocs.cloud/trial)
