#iTunes Search

[![Maven Central badge](https://maven-badges.herokuapp.com/maven-central/be.ceau/itunes-search/badge.svg)](https://mvnrepository.com/artifact/be.ceau/itunes-search)  [![Javadocs](https://javadoc.io/badge/be.ceau/itunes-search.svg)](https://javadoc.io/doc/be.ceau/itunes-search)  [![License](https://img.shields.io/badge/License-Apache%202.0-blue.svg)](https://www.apache.org/licenses/LICENSE-2.0.txt)

Java client for the [iTunes Search API](https://affiliate.itunes.apple.com/resources/documentation/itunes-store-web-service-search-api/).


### Usage

```Java
Response response = new Search("ceau").execute();
```

iTunes Search allows specifying your own logic to perform HTTP requests. To do so, simply implement the `be.ceau.itunessearch.Connector` interface and pass an instance to the execute method of a `be.ceau.itunessearch.Search` or `be.ceau.itunessearch.Lookup`.

```Java
Response response = new Search("ceau").execute(new YourConnectorImpl());
```

To search directly using an iTunes id, All Music id, UPC or ISBN, the Lookup API is also available:

```Java
Response response = new Lookup();
	.addAmgArtistId("5505");
	.execute();
```

### Maven Central
Include this project directly from Maven Central
```XML
<groupId>be.ceau</groupId>
<artifactId>itunes-search</artifactId>
<version>${project.version}</version>
```

### GnuPG public key
Verify signature files with my [GnuPG public key](https://www.ceau.be/pubkey.gpg).

### Javadoc
View javadoc for current release at [javadoc.io](https://javadoc.io/doc/be.ceau/itunes-search).

### License
Licensed under [the Apache 2.0 license](https://www.apache.org/licenses/LICENSE-2.0.txt).

### Disclaimer
iTunes is a trademark of Apple Inc., registered in the U.S. and other countries.

This library has not been authorized, sponsored, or otherwise approved by Apple Inc.