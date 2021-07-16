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

## How to Build

1. clone and checkout branch : [https://github.com/vjuge/rosetta-code-generators/tree/kotlin-generator-dsl/kotlin](https://github.com/vjuge/rosetta-code-generators/tree/kotlin-generator-dsl/kotlin)
2. copy and paste the latests rosetta files (*.rosetta) from the distribution
3. run the test, [KotlinModelObjectGeneratorTest.xtend](https://github.com/vjuge/rosetta-code-generators/blob/a5e1f739f5d96decab6e5951c2cd702361baed78/kotlin/src/test/java/com/regnosys/rosetta/generator/kotlin/KotlinModelObjectGeneratorTest.xtend#L33), modifying the paths where to find the rosetta files
4. copy and paste resulting DSL kotlin files `Metatypes-Dsl.kt` & `Types-Dsl.kt` into this project's src folder
5. build

