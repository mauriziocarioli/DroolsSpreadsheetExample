Drools Spreadsheet Example
==========================

You can run it by the REST API (POST):

http://localhost:8080/kie-server/services/rest/server/containers/instances/DroolsSpreadsheetExample_1.0.0

with Header

Content-Type: application/json

and for example the following body

{
    "lookup": "default-stateless-ksession",
    "commands": [
        {
            "insert": {
                "object": {
                    "com.myexample.Customer": {
                        "coupon": "",
                        "newCustomer": true
                    }
                },
                "out-identifier": "customer",
                "return-object": false
            }
        },
        {
            "set-global": {
                "object": {
                    "com.myexample.Cart": {
                        "cartItems": [
                            {
                                "product": {
                                    "desc": "Lenovo laptop",
                                    "price": 100
                                },
                                "qty": 1
                            }
                        ],
                        "discount": 0
                    }
                },
                "identifier": "$cart",
                "out-identifier": "cart",
                "return-object": true
            }
        },
        {
            "fire-all-rules": {}
        },
        {
            "dispose": {}
        }
    ]
}

