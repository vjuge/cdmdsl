# Isda CDM DSL language

<a href="https://portal.cdm.rosetta-technology.io/"><img src="doc/assets/CDM-hoz-logo-print.png" alt="cdm" width="500"/></a>

[ISDA](https://www.isda.org/) Common Domain Language 101 : <https://www.isda.org/2019/10/14/isda-common-domain-model/>

This project comes after the observation that writing 'manually' CDM files / objects is a cumbersome process, 
and difficult to understand for non-technical people, this is why I created this DSL. 

This DSL is especially useful to ease communication and knowledge sharing between IT people and Business Analysts.

## Dedicated DSL

The purpose of this DSL is to provide several advantages like :

* close to **json syntax**
* **syntax highlighting**
* **code completion**
* **formatting** 
* **type safety**
* **support comments**


### Comparison: With & Without

1. getting the following json representation of a cdm Trade, can be done manually...

`myTrade.json`
```json
{
  "tradableProduct" : { },
  "tradeDate" : {
    "value" : "2001-01-01"
  },
  "tradeIdentifier" : [ {
    "assignedIdentifier" : [ {
      "identifier" : {
        "value" : "6234"
      }
    } ],
    "issuerReference" : {
      "externalReference" : "party1"
    }
  }, {
    "assignedIdentifier" : [ {
      "identifier" : {
        "value" : "6569"
      }
    } ],
    "issuerReference" : {
      "externalReference" : "party2"
    }
  } ]
}

```

2. ... or would require the following java code.

```java
public class MyTrade {
    void generate() throws JsonProcessingException {
        Trade trade = Trade.builder()
                .setTradableProduct(null)
                .setTradeDate(FieldWithMetaDate.builder()
                        .setValue(Date.of(2001,1,1)))
                .addTradeIdentifier(Identifier.builder()
                        .setAssignedIdentifier(
                                Arrays.asList(AssignedIdentifier.builder()
                                        .setIdentifier(FieldWithMetaString.builder()
                                                .setValue("6234"))))
                        .setIssuerReference(ReferenceWithMetaParty.builder()
                                .setExternalReference("party1"))
                )
                .addTradeIdentifier(Identifier.builder()
                        .setAssignedIdentifier(
                                Arrays.asList(AssignedIdentifier.builder()
                                        .setIdentifier(FieldWithMetaString.builder()
                                                .setValue("6569"))))
                        .setIssuerReference(ReferenceWithMetaParty.builder()
                                .setExternalReference("party2"))
                )
                .build();

        System.out.println(RosettaObjectMapper.getNewRosettaObjectMapper().writerWithDefaultPrettyPrinter().writeValueAsString(trade));
    }
}
```

3. Instead, the same is achieved thanks to this dsl. It's simpler, safer and easier to read: 

```kotlin
val trade = Trade.builder().apply {
    tradeDate {
        value = Date.of(2001,1,1)
    }
    tradeIdentifier { //    will add a trade identifier in the list
        assignedIdentifier {
            identifier {
                value = "6234"
            }
        }
        issuerReference {
            externalReference = "party1"
        }
    }
    tradeIdentifier(1) { //    will add a trade identifier in the list in the second position
        assignedIdentifier {
            identifier {
                value = "6569"
            }
        }
        issuerReference {
            externalReference = "party2"
        }
    }
    tradableProduct {
        // empty
    }
}.build()

```

## How it works

DSL provides function that will either get an existing mutable value and modify its content, or creates a new one if it doesn't exist already.

DSL covers any kind of properties, even list of properties. For the later, you can use a function indexed or not (in that case, the property will be added in the list as last element)

Cdmdsl uses java reflection to checkout the properties of cdm objects, and create extension functions accordingly.

Sources files are generated thanks to custom task `genSources`

## How to use

This DSL uses Kotlin's features, so you need to add this dependency in your existing java application, see: https://kotlinlang.org/docs/gradle.html and https://kotlinlang.org/docs/mixing-java-kotlin-intellij.html

add gradle dependency: 

`build.gradle`:
```groovy
dependencies {
    implementation("com.isda:cdm:$cdm_version") // required of course !
    implementation("com.github.vjuge:cdmdsl:$dslVersion")
}
```

or `build.gradle.kts`:
```kotlin
dependencies {
    implementation("com.isda:cdm:${project.property("cdmVersion")}") // required of course !
    implementation("com.github.vjuge:cdmdsl:${project.property("dslVersion")}")
}
```


### Samples

Samples are available in [test source code](src/test/kotlin/com/github/vjuge/cdmdsl/gradle/CdmDslTest.kt)


## How to Build

This dsl is deployed in maven central, pre-built with chosen cdm versions (build with Java 8).
But, if you need to have your own build following another cdm version, you'll have to:

1. checkout this repository
2. change the cdm version in `versions.gradle.kts`
3. execute `./gradlew clean build`

> **WARNING**: This tool is compatible with cdm version > 2.118.0

Note: you'll need to access ISDA's CDM repository: <https://regnosys.jfrog.io/artifactory/libs-snapshot>, which is protected by credentials.

See: <https://portal.cdm.rosetta-technology.io> for more information or access request