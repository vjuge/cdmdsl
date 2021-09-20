# cdmdsl

This project comes from the observation that writing 'manually' CDM trades is a cumbersome process, 
and difficult to understand for non-technical people, this is why I created this DSL. 

## Dedicated DSL (experimental)

The purpose of this DSL is to provide a kind of json syntax, with **syntax highlighting**, **code completion**, **formatting** and **type safety**.

This DSL comes from an extension of rosetta-code-generators, which is under way to be open sourced, and is written in Kotlin.

comparison:

json:
```json
{
  "contractIdentifier" : [ {
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
  } ],
  "tradableProduct" : {
```

dsl equivalent:

```kotlin

val trade = Contract.builder().apply {
    tradeDate {
        value = DateImpl(24, 9, 2001)
    }
    contractIdentifier {
        assignedIdentifier {
            identifier {
                value = "6234"
            }
        }
        issuerReference {
            externalReference = "party1"
        }
    }
    contractIdentifier {
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
        //...
    }
}.build()

```

## How it works

Cdmdsl uses java reflection to checkout the properties of cdm objects, and create extension functions accordingly.

Sources files are generated thanks to custom task `genSources`

## How to Build

1. change the cdm version from `gradle.properties`
2. execute `./gradlew clean build publish`

> **WARNING**: This tool is compatible with cdm version > 2.118.0