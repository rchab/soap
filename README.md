# soap
Soap sandbox

#JAX-WS example

1. Build project with maven to generate jax-ws plugin files.
2. Run Publisher.java main method to publish endpoint.
3. Check web service by sending requests:

URL: http://localhost:9999/ws/hello?wsdl

Request Headers:
SOAPAction: ""
Accept: text/xml, multipart/related, text/html, image/gif, image/jpeg, *; q=.2, */*; q=.2
Content-Type: text/xml; charset=utf-8
User-Agent: Java/1.6.0_13
Host: localhost:9999
Connection: keep-alive
Content-Length: 224


Request Body:
<?xml version="1.0" ?>
	<S:Envelope xmlns:S="http://schemas.xmlsoap.org/soap/envelope/">
		<S:Body>
			<ns2:getHelloWorldAsString xmlns:ns2="http://ws.jaxws.rchab.com/">
				<arg0>rchabanych</arg0>
			</ns2:getHelloWorldAsString> s
		</S:Body>
	</S:Envelope>
</xml>

Response status: 200 OK

Response headers:
Date: Sat, 05 Sep 2015 19:21:56 GMT
Transfer-encoding: chunked
Content-type: text/xml; charset=utf-8

Response body:
<?xml version='1.0' encoding='UTF-8' ?>
<S:Envelope>
    <S:Body>
        <ns2:getHelloWorldAsStringResponse>
            <return>Hello world JAX-WS for rchabanych</return>
        </ns2:getHelloWorldAsStringResponse>
    </S:Body>
</S:Envelope>
