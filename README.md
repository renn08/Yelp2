# Yelp2 API

## GET /searchRerank

Search all businesses that is in a location with a specified term. Rerank them in a descending order using a new ranking such that $new\_rating = rating \times review\_count$.

### Example request and response

#### Request

```bash
curl "http://localhost:8080/searchRerank?location=Lansing&term=hotpot"
```

#### Response

```Json
{
    "total": 16,
    "region":
    {
        "center":
        {
            "latitude": 42.72830621179706,
            "longitude": -84.56863403320312
        }
    },
    "searchLocation": "Lansing",
    "searchTerm": "hotpot",
    "businesses":
    [
        {
            "closed": false,
            "id": "ywmLl1CiBB2zQBTY9bnFMA",
            "alias": "golden-harvest-lansing",
            "name": "Golden Harvest",
            "image_url": "https://s3-media3.fl.yelpcdn.com/bphoto/Cy1Xf7H6rt7etstEAcfE_g/o.jpg",
            "is_closed": false,
            "url": "https://www.yelp.com/biz/golden-harvest-lansing?adjust_creative=J_BflFlLyenw_jW6Q_Wrgg&utm_campaign=yelp_api_v3&utm_medium=api_v3_business_search&utm_source=J_BflFlLyenw_jW6Q_Wrgg",
            "review_count": 674,
            "categories":
            [
                {
                    "alias": "breakfast_brunch",
                    "title": "Breakfast & Brunch"
                },
                {
                    "alias": "diners",
                    "title": "Diners"
                }
            ],
            "rating": 4.0,
            "coordinates":
            {
                "latitude": 42.7524188,
                "longitude": -84.54978497316395
            },
            "transactions":
            [],
            "price": "$$",
            "location":
            {
                "address1": "1625 Turner St",
                "address2": "",
                "address3": "",
                "city": "Lansing",
                "zip_code": "48906",
                "country": "US",
                "state": "MI",
                "display_address":
                [
                    "1625 Turner St",
                    "Lansing, MI 48906"
                ]
            },
            "phone": "",
            "display_phone": "",
            "distance": 3091.6509981289782
        },
        {
            "closed": false,
            "id": "nftEH2F-HCUxrmds2LglbA",
            "alias": "omi-sushi-east-lansing",
            "name": "Omi Sushi",
            "image_url": "https://s3-media3.fl.yelpcdn.com/bphoto/wn2z3Nxr1LmXLbPq9-hLaQ/o.jpg",
            "is_closed": false,
            "url": "https://www.yelp.com/biz/omi-sushi-east-lansing?adjust_creative=J_BflFlLyenw_jW6Q_Wrgg&utm_campaign=yelp_api_v3&utm_medium=api_v3_business_search&utm_source=J_BflFlLyenw_jW6Q_Wrgg",
            "review_count": 154,
            "categories":
            [
                {
                    "alias": "sushi",
                    "title": "Sushi Bars"
                },
                {
                    "alias": "japanese",
                    "title": "Japanese"
                }
            ],
            "rating": 4.0,
            "coordinates":
            {
                "latitude": 42.73497802798235,
                "longitude": -84.48113054110442
            },
            "transactions":
            [
                "delivery"
            ],
            "price": "$$",
            "location":
            {
                "address1": "210 Mac Ave",
                "address2": "",
                "address3": "",
                "city": "East Lansing",
                "zip_code": "48823",
                "country": "US",
                "state": "MI",
                "display_address":
                [
                    "210 Mac Ave",
                    "East Lansing, MI 48823"
                ]
            },
            "phone": "+15173372222",
            "display_phone": "(517) 337-2222",
            "distance": 7185.42521313561
        },
        {
            "closed": false,
            "id": "q9G391qh1ywNdrjxe4b4CA",
            "alias": "korea-house-east-lansing",
            "name": "Korea House",
            "image_url": "https://s3-media1.fl.yelpcdn.com/bphoto/q6SQbuzo-aNc3gD7neHV7A/o.jpg",
            "is_closed": false,
            "url": "https://www.yelp.com/biz/korea-house-east-lansing?adjust_creative=J_BflFlLyenw_jW6Q_Wrgg&utm_campaign=yelp_api_v3&utm_medium=api_v3_business_search&utm_source=J_BflFlLyenw_jW6Q_Wrgg",
            "review_count": 115,
            "categories":
            [
                {
                    "alias": "korean",
                    "title": "Korean"
                },
                {
                    "alias": "japanese",
                    "title": "Japanese"
                }
            ],
            "rating": 3.5,
            "coordinates":
            {
                "latitude": 42.7208357773238,
                "longitude": -84.496027545428
            },
            "transactions":
            [
                "delivery"
            ],
            "price": "$$",
            "location":
            {
                "address1": "978 Trowbridge Rd",
                "address2": "",
                "address3": "",
                "city": "East Lansing",
                "zip_code": "48823",
                "country": "US",
                "state": "MI",
                "display_address":
                [
                    "978 Trowbridge Rd",
                    "East Lansing, MI 48823"
                ]
            },
            "phone": "+15173320608",
            "display_phone": "(517) 332-0608",
            "distance": 5988.846315450095
        },
        {
            "closed": false,
            "id": "w5r3JbhDgn-bjL0Fg37wVg",
            "alias": "udon-sushi-restaurant-east-lansing",
            "name": "Udon Sushi Restaurant",
            "image_url": "https://s3-media2.fl.yelpcdn.com/bphoto/58iQ34NRMelkCTFfIVp8oA/o.jpg",
            "is_closed": false,
            "url": "https://www.yelp.com/biz/udon-sushi-restaurant-east-lansing?adjust_creative=J_BflFlLyenw_jW6Q_Wrgg&utm_campaign=yelp_api_v3&utm_medium=api_v3_business_search&utm_source=J_BflFlLyenw_jW6Q_Wrgg",
            "review_count": 100,
            "categories":
            [
                {
                    "alias": "sushi",
                    "title": "Sushi Bars"
                },
                {
                    "alias": "japanese",
                    "title": "Japanese"
                },
                {
                    "alias": "asianfusion",
                    "title": "Asian Fusion"
                }
            ],
            "rating": 4.0,
            "coordinates":
            {
                "latitude": 42.73458,
                "longitude": -84.49319
            },
            "transactions":
            [
                "delivery"
            ],
            "price": "$",
            "location":
            {
                "address1": "134 N Harrison Rd",
                "address2": "Ste A",
                "address3": "",
                "city": "East Lansing",
                "zip_code": "48823",
                "country": "US",
                "state": "MI",
                "display_address":
                [
                    "134 N Harrison Rd",
                    "Ste A",
                    "East Lansing, MI 48823"
                ]
            },
            "phone": "+15173325995",
            "display_phone": "(517) 332-5995",
            "distance": 6200.690750299739
        },
        {
            "closed": false,
            "id": "wp9bxsI03sHLMRozOytZ-Q",
            "alias": "everyday-authentic-chinese-cuisine-east-lansing",
            "name": "Everyday Authentic Chinese Cuisine",
            "image_url": "https://s3-media3.fl.yelpcdn.com/bphoto/Z_KGNT1Q80P7cnTVDa9tfw/o.jpg",
            "is_closed": false,
            "url": "https://www.yelp.com/biz/everyday-authentic-chinese-cuisine-east-lansing?adjust_creative=J_BflFlLyenw_jW6Q_Wrgg&utm_campaign=yelp_api_v3&utm_medium=api_v3_business_search&utm_source=J_BflFlLyenw_jW6Q_Wrgg",
            "review_count": 93,
            "categories":
            [
                {
                    "alias": "chinese",
                    "title": "Chinese"
                }
            ],
            "rating": 4.0,
            "coordinates":
            {
                "latitude": 42.730334304168,
                "longitude": -84.4634694121178
            },
            "transactions":
            [
                "delivery"
            ],
            "price": "$$",
            "location":
            {
                "address1": "1375 E Grand River",
                "address2": "",
                "address3": "",
                "city": "East Lansing",
                "zip_code": "48823",
                "country": "US",
                "state": "MI",
                "display_address":
                [
                    "1375 E Grand River",
                    "East Lansing, MI 48823"
                ]
            },
            "phone": "+15173371882",
            "display_phone": "(517) 337-1882",
            "distance": 8592.814304416248
        },
        {
            "closed": false,
            "id": "vBNWEG1sct6mmFc3mllwPA",
            "alias": "boiling-pots-east-lansing",
            "name": "Boiling Pots",
            "image_url": "https://s3-media3.fl.yelpcdn.com/bphoto/1d8zZNwLgYfL1zjpyYcoBQ/o.jpg",
            "is_closed": false,
            "url": "https://www.yelp.com/biz/boiling-pots-east-lansing?adjust_creative=J_BflFlLyenw_jW6Q_Wrgg&utm_campaign=yelp_api_v3&utm_medium=api_v3_business_search&utm_source=J_BflFlLyenw_jW6Q_Wrgg",
            "review_count": 92,
            "categories":
            [
                {
                    "alias": "chinese",
                    "title": "Chinese"
                },
                {
                    "alias": "hotpot",
                    "title": "Hot Pot"
                },
                {
                    "alias": "taiwanese",
                    "title": "Taiwanese"
                }
            ],
            "rating": 4.0,
            "coordinates":
            {
                "latitude": 42.72623,
                "longitude": -84.44801
            },
            "transactions":
            [
                "delivery",
                "pickup"
            ],
            "price": "$$",
            "location":
            {
                "address1": "2650 E Grand River Ave",
                "address2": "",
                "address3": "",
                "city": "East Lansing",
                "zip_code": "48823",
                "country": "US",
                "state": "MI",
                "display_address":
                [
                    "2650 E Grand River Ave",
                    "East Lansing, MI 48823"
                ]
            },
            "phone": "+15178891799",
            "display_phone": "(517) 889-1799",
            "distance": 9854.161659461644
        },
        {
            "closed": false,
            "id": "jDO7O7dGf1oLQD_CqWTxUA",
            "alias": "royal-pot-east-lansing-2",
            "name": "Royal Pot",
            "image_url": "https://s3-media4.fl.yelpcdn.com/bphoto/mjPFo16pbY8kmC4MscLMNg/o.jpg",
            "is_closed": false,
            "url": "https://www.yelp.com/biz/royal-pot-east-lansing-2?adjust_creative=J_BflFlLyenw_jW6Q_Wrgg&utm_campaign=yelp_api_v3&utm_medium=api_v3_business_search&utm_source=J_BflFlLyenw_jW6Q_Wrgg",
            "review_count": 79,
            "categories":
            [
                {
                    "alias": "hotpot",
                    "title": "Hot Pot"
                }
            ],
            "rating": 4.0,
            "coordinates":
            {
                "latitude": 42.719489,
                "longitude": -84.461112
            },
            "transactions":
            [
                "delivery",
                "pickup"
            ],
            "price": "$$",
            "location":
            {
                "address1": "4750 S Hagadorn Rd",
                "address2": "Ste 40",
                "address3": null,
                "city": "East Lansing",
                "zip_code": "48823",
                "country": "US",
                "state": "MI",
                "display_address":
                [
                    "4750 S Hagadorn Rd",
                    "Ste 40",
                    "East Lansing, MI 48823"
                ]
            },
            "phone": "+15174832780",
            "display_phone": "(517) 483-2780",
            "distance": 8833.59445677508
        },
        {
            "closed": false,
            "id": "2gOH7HGzPopH8mSx1lrDlQ",
            "alias": "east-cafe-east-lansing-2",
            "name": "East Cafe",
            "image_url": "https://s3-media2.fl.yelpcdn.com/bphoto/BeMHtswl_dYJFn90tFc_HQ/o.jpg",
            "is_closed": false,
            "url": "https://www.yelp.com/biz/east-cafe-east-lansing-2?adjust_creative=J_BflFlLyenw_jW6Q_Wrgg&utm_campaign=yelp_api_v3&utm_medium=api_v3_business_search&utm_source=J_BflFlLyenw_jW6Q_Wrgg",
            "review_count": 66,
            "categories":
            [
                {
                    "alias": "chinese",
                    "title": "Chinese"
                }
            ],
            "rating": 4.0,
            "coordinates":
            {
                "latitude": 42.732032,
                "longitude": -84.470771
            },
            "transactions":
            [
                "delivery",
                "pickup"
            ],
            "price": "$$",
            "location":
            {
                "address1": "1001 E Grand River Ave",
                "address2": "",
                "address3": "",
                "city": "East Lansing",
                "zip_code": "48823",
                "country": "US",
                "state": "MI",
                "display_address":
                [
                    "1001 E Grand River Ave",
                    "East Lansing, MI 48823"
                ]
            },
            "phone": "+15178536828",
            "display_phone": "(517) 853-6828",
            "distance": 8000.174537925075
        },
        {
            "closed": false,
            "id": "2HgDE-nZHegKxEASEMMZ9g",
            "alias": "baps-east-lansing-10",
            "name": "Baps",
            "image_url": "https://s3-media2.fl.yelpcdn.com/bphoto/BCLaOthoNpisEaZNyY_mwg/o.jpg",
            "is_closed": false,
            "url": "https://www.yelp.com/biz/baps-east-lansing-10?adjust_creative=J_BflFlLyenw_jW6Q_Wrgg&utm_campaign=yelp_api_v3&utm_medium=api_v3_business_search&utm_source=J_BflFlLyenw_jW6Q_Wrgg",
            "review_count": 51,
            "categories":
            [
                {
                    "alias": "korean",
                    "title": "Korean"
                },
                {
                    "alias": "bbq",
                    "title": "Barbeque"
                }
            ],
            "rating": 4.5,
            "coordinates":
            {
                "latitude": 42.7351798,
                "longitude": -84.4802734
            },
            "transactions":
            [
                "delivery"
            ],
            "price": null,
            "location":
            {
                "address1": "340 Albert Ave",
                "address2": null,
                "address3": "",
                "city": "East Lansing",
                "zip_code": "48823",
                "country": "US",
                "state": "MI",
                "display_address":
                [
                    "340 Albert Ave",
                    "East Lansing, MI 48823"
                ]
            },
            "phone": "+15175745587",
            "display_phone": "(517) 574-5587",
            "distance": 7257.291795213586
        },
        {
            "closed": false,
            "id": "wR66dolc4UxgDgaAh-botg",
            "alias": "china-flavor-lansing",
            "name": "China Flavor",
            "image_url": "https://s3-media4.fl.yelpcdn.com/bphoto/UCKUPMHeb3YV2gaTSQklkg/o.jpg",
            "is_closed": false,
            "url": "https://www.yelp.com/biz/china-flavor-lansing?adjust_creative=J_BflFlLyenw_jW6Q_Wrgg&utm_campaign=yelp_api_v3&utm_medium=api_v3_business_search&utm_source=J_BflFlLyenw_jW6Q_Wrgg",
            "review_count": 74,
            "categories":
            [
                {
                    "alias": "chinese",
                    "title": "Chinese"
                },
                {
                    "alias": "soup",
                    "title": "Soup"
                }
            ],
            "rating": 3.0,
            "coordinates":
            {
                "latitude": 42.7336332564919,
                "longitude": -84.521395303309
            },
            "transactions":
            [
                "delivery",
                "pickup"
            ],
            "price": "$",
            "location":
            {
                "address1": "2033 East Michigan Ave",
                "address2": "",
                "address3": "",
                "city": "Lansing",
                "zip_code": "48912",
                "country": "US",
                "state": "MI",
                "display_address":
                [
                    "2033 East Michigan Ave",
                    "Lansing, MI 48912"
                ]
            },
            "phone": "+15177211083",
            "display_phone": "(517) 721-1083",
            "distance": 3903.5642934757484
        },
        {
            "closed": false,
            "id": "z6utdG2eRy9BZJKwJEKaTg",
            "alias": "the-kung-fu-lansing",
            "name": "The Kung Fu",
            "image_url": "https://s3-media2.fl.yelpcdn.com/bphoto/aLACQMjd8D6qoOaDa1-hSQ/o.jpg",
            "is_closed": false,
            "url": "https://www.yelp.com/biz/the-kung-fu-lansing?adjust_creative=J_BflFlLyenw_jW6Q_Wrgg&utm_campaign=yelp_api_v3&utm_medium=api_v3_business_search&utm_source=J_BflFlLyenw_jW6Q_Wrgg",
            "review_count": 56,
            "categories":
            [
                {
                    "alias": "chinese",
                    "title": "Chinese"
                },
                {
                    "alias": "seafood",
                    "title": "Seafood"
                },
                {
                    "alias": "chickenshop",
                    "title": "Chicken Shop"
                }
            ],
            "rating": 3.5,
            "coordinates":
            {
                "latitude": 42.7413016,
                "longitude": -84.508319
            },
            "transactions":
            [
                "delivery",
                "pickup"
            ],
            "price": "$",
            "location":
            {
                "address1": "730 N Clippert",
                "address2": "",
                "address3": "",
                "city": "Lansing",
                "zip_code": "48912",
                "country": "US",
                "state": "MI",
                "display_address":
                [
                    "730 N Clippert",
                    "Lansing, MI 48912"
                ]
            },
            "phone": "+15173339993",
            "display_phone": "(517) 333-9993",
            "distance": 5133.668833046616
        },
        {
            "closed": false,
            "id": "z7xOKslUVDiflpe_duf17Q",
            "alias": "chef-gong-lansing-3",
            "name": "Chef Gong",
            "image_url": "https://s3-media3.fl.yelpcdn.com/bphoto/IerdlStpX2Y99ArDZV26Sg/o.jpg",
            "is_closed": false,
            "url": "https://www.yelp.com/biz/chef-gong-lansing-3?adjust_creative=J_BflFlLyenw_jW6Q_Wrgg&utm_campaign=yelp_api_v3&utm_medium=api_v3_business_search&utm_source=J_BflFlLyenw_jW6Q_Wrgg",
            "review_count": 24,
            "categories":
            [
                {
                    "alias": "chinese",
                    "title": "Chinese"
                }
            ],
            "rating": 4.0,
            "coordinates":
            {
                "latitude": 42.73896,
                "longitude": -84.50887
            },
            "transactions":
            [
                "delivery",
                "pickup"
            ],
            "price": null,
            "location":
            {
                "address1": "521 N Clippert St",
                "address2": "",
                "address3": null,
                "city": "Lansing",
                "zip_code": "48912",
                "country": "US",
                "state": "MI",
                "display_address":
                [
                    "521 N Clippert St",
                    "Lansing, MI 48912"
                ]
            },
            "phone": "+15177080616",
            "display_phone": "(517) 708-0616",
            "distance": 5032.70105626027
        },
        {
            "closed": false,
            "id": "aQr-rYsV1dkB0wB2OHC9YA",
            "alias": "hongs-cafe-east-lansing",
            "name": "Hong's Cafe",
            "image_url": "https://s3-media3.fl.yelpcdn.com/bphoto/8gY6PY_um-4MK5yBonKgnQ/o.jpg",
            "is_closed": false,
            "url": "https://www.yelp.com/biz/hongs-cafe-east-lansing?adjust_creative=J_BflFlLyenw_jW6Q_Wrgg&utm_campaign=yelp_api_v3&utm_medium=api_v3_business_search&utm_source=J_BflFlLyenw_jW6Q_Wrgg",
            "review_count": 18,
            "categories":
            [
                {
                    "alias": "bubbletea",
                    "title": "Bubble Tea"
                },
                {
                    "alias": "chinese",
                    "title": "Chinese"
                }
            ],
            "rating": 4.0,
            "coordinates":
            {
                "latitude": 42.757143,
                "longitude": -84.4640809
            },
            "transactions":
            [
                "delivery"
            ],
            "price": "$$",
            "location":
            {
                "address1": "3030 E Lake Lansing Rd",
                "address2": "",
                "address3": "",
                "city": "East Lansing",
                "zip_code": "48823",
                "country": "US",
                "state": "MI",
                "display_address":
                [
                    "3030 E Lake Lansing Rd",
                    "East Lansing, MI 48823"
                ]
            },
            "phone": "+15173326688",
            "display_phone": "(517) 332-6688",
            "distance": 9120.31542435394
        },
        {
            "closed": false,
            "id": "b1JCgQPrg6YjKOsMbBLYNg",
            "alias": "limit-kitchen-and-bar-east-lansing",
            "name": "Limit Kitchen & Bar",
            "image_url": "https://s3-media4.fl.yelpcdn.com/bphoto/BmwZMI864MdSwEEKyP-wsA/o.jpg",
            "is_closed": false,
            "url": "https://www.yelp.com/biz/limit-kitchen-and-bar-east-lansing?adjust_creative=J_BflFlLyenw_jW6Q_Wrgg&utm_campaign=yelp_api_v3&utm_medium=api_v3_business_search&utm_source=J_BflFlLyenw_jW6Q_Wrgg",
            "review_count": 7,
            "categories":
            [
                {
                    "alias": "karaoke",
                    "title": "Karaoke"
                },
                {
                    "alias": "chinese",
                    "title": "Chinese"
                }
            ],
            "rating": 4.5,
            "coordinates":
            {
                "latitude": 42.72826,
                "longitude": -84.454461
            },
            "transactions":
            [
                "delivery",
                "pickup"
            ],
            "price": null,
            "location":
            {
                "address1": "2800 E Grand River Ave",
                "address2": "Ste D",
                "address3": null,
                "city": "East Lansing",
                "zip_code": "48823",
                "country": "US",
                "state": "MI",
                "display_address":
                [
                    "2800 E Grand River Ave",
                    "Ste D",
                    "East Lansing, MI 48823"
                ]
            },
            "phone": "+15176642565",
            "display_phone": "(517) 664-2565",
            "distance": 9314.852732938543
        },
        {
            "closed": false,
            "id": "U0Rb6g6IB848SwNJkVcuAg",
            "alias": "jimy-s-asian-cuisine-east-lansing",
            "name": "Jimy’s Asian Cuisine",
            "image_url": "https://s3-media3.fl.yelpcdn.com/bphoto/24pEmUEjHqEJxCUe5hi5Hw/o.jpg",
            "is_closed": false,
            "url": "https://www.yelp.com/biz/jimy-s-asian-cuisine-east-lansing?adjust_creative=J_BflFlLyenw_jW6Q_Wrgg&utm_campaign=yelp_api_v3&utm_medium=api_v3_business_search&utm_source=J_BflFlLyenw_jW6Q_Wrgg",
            "review_count": 2,
            "categories":
            [
                {
                    "alias": "chinese",
                    "title": "Chinese"
                },
                {
                    "alias": "asianfusion",
                    "title": "Asian Fusion"
                }
            ],
            "rating": 5.0,
            "coordinates":
            {
                "latitude": 42.73344,
                "longitude": -84.47593
            },
            "transactions":
            [
                "delivery",
                "pickup"
            ],
            "price": null,
            "location":
            {
                "address1": "611 E Grand River Ave",
                "address2": "Ste 100",
                "address3": "",
                "city": "East Lansing",
                "zip_code": "48823",
                "country": "US",
                "state": "MI",
                "display_address":
                [
                    "611 E Grand River Ave",
                    "Ste 100",
                    "East Lansing, MI 48823"
                ]
            },
            "phone": "+15173883539",
            "display_phone": "(517) 388-3539",
            "distance": 7594.786201727431
        }
    ]
}
```

## GET /searchGroupByCategory

Search all businesses that is in a location with a specified term. Group them by category and then sort in a descending order using total number of businesses for each category.

### Example request and response

#### Request

```bash
curl "localhost:8080/searchGroupByCategory?location=Lansing&term=hotpot" 
```

#### Response

```json
{
    "searchTerm": "hotpot",
    "searchLocation": "Lansing",
    "bizAndTotalGroupByCat":
    [
        {
            "chinese":
            {
                "total": 9,
                "businesses":
                [
                    {
                        "closed": false,
                        "id": "vBNWEG1sct6mmFc3mllwPA",
                        "alias": "boiling-pots-east-lansing",
                        "name": "Boiling Pots",
                        "image_url": "https://s3-media3.fl.yelpcdn.com/bphoto/1d8zZNwLgYfL1zjpyYcoBQ/o.jpg",
                        "is_closed": false,
                        "url": "https://www.yelp.com/biz/boiling-pots-east-lansing?adjust_creative=J_BflFlLyenw_jW6Q_Wrgg&utm_campaign=yelp_api_v3&utm_medium=api_v3_business_search&utm_source=J_BflFlLyenw_jW6Q_Wrgg",
                        "review_count": 92,
                        "categories":
                        [
                            {
                                "alias": "chinese",
                                "title": "Chinese"
                            },
                            {
                                "alias": "hotpot",
                                "title": "Hot Pot"
                            },
                            {
                                "alias": "taiwanese",
                                "title": "Taiwanese"
                            }
                        ],
                        "rating": 4.0,
                        "coordinates":
                        {
                            "latitude": 42.72623,
                            "longitude": -84.44801
                        },
                        "transactions":
                        [
                            "pickup",
                            "delivery"
                        ],
                        "price": "$$",
                        "location":
                        {
                            "address1": "2650 E Grand River Ave",
                            "address2": "",
                            "address3": "",
                            "city": "East Lansing",
                            "zip_code": "48823",
                            "country": "US",
                            "state": "MI",
                            "display_address":
                            [
                                "2650 E Grand River Ave",
                                "East Lansing, MI 48823"
                            ]
                        },
                        "phone": "+15178891799",
                        "display_phone": "(517) 889-1799",
                        "distance": 9854.161659461644
                    },
                    {
                        "closed": false,
                        "id": "z7xOKslUVDiflpe_duf17Q",
                        "alias": "chef-gong-lansing-3",
                        "name": "Chef Gong",
                        "image_url": "https://s3-media3.fl.yelpcdn.com/bphoto/IerdlStpX2Y99ArDZV26Sg/o.jpg",
                        "is_closed": false,
                        "url": "https://www.yelp.com/biz/chef-gong-lansing-3?adjust_creative=J_BflFlLyenw_jW6Q_Wrgg&utm_campaign=yelp_api_v3&utm_medium=api_v3_business_search&utm_source=J_BflFlLyenw_jW6Q_Wrgg",
                        "review_count": 24,
                        "categories":
                        [
                            {
                                "alias": "chinese",
                                "title": "Chinese"
                            }
                        ],
                        "rating": 4.0,
                        "coordinates":
                        {
                            "latitude": 42.73896,
                            "longitude": -84.50887
                        },
                        "transactions":
                        [
                            "pickup",
                            "delivery"
                        ],
                        "price": null,
                        "location":
                        {
                            "address1": "521 N Clippert St",
                            "address2": "",
                            "address3": null,
                            "city": "Lansing",
                            "zip_code": "48912",
                            "country": "US",
                            "state": "MI",
                            "display_address":
                            [
                                "521 N Clippert St",
                                "Lansing, MI 48912"
                            ]
                        },
                        "phone": "+15177080616",
                        "display_phone": "(517) 708-0616",
                        "distance": 5032.70105626027
                    },
                    {
                        "closed": false,
                        "id": "z6utdG2eRy9BZJKwJEKaTg",
                        "alias": "the-kung-fu-lansing",
                        "name": "The Kung Fu",
                        "image_url": "https://s3-media2.fl.yelpcdn.com/bphoto/aLACQMjd8D6qoOaDa1-hSQ/o.jpg",
                        "is_closed": false,
                        "url": "https://www.yelp.com/biz/the-kung-fu-lansing?adjust_creative=J_BflFlLyenw_jW6Q_Wrgg&utm_campaign=yelp_api_v3&utm_medium=api_v3_business_search&utm_source=J_BflFlLyenw_jW6Q_Wrgg",
                        "review_count": 56,
                        "categories":
                        [
                            {
                                "alias": "chinese",
                                "title": "Chinese"
                            },
                            {
                                "alias": "seafood",
                                "title": "Seafood"
                            },
                            {
                                "alias": "chickenshop",
                                "title": "Chicken Shop"
                            }
                        ],
                        "rating": 3.5,
                        "coordinates":
                        {
                            "latitude": 42.7413016,
                            "longitude": -84.508319
                        },
                        "transactions":
                        [
                            "pickup",
                            "delivery"
                        ],
                        "price": "$",
                        "location":
                        {
                            "address1": "730 N Clippert",
                            "address2": "",
                            "address3": "",
                            "city": "Lansing",
                            "zip_code": "48912",
                            "country": "US",
                            "state": "MI",
                            "display_address":
                            [
                                "730 N Clippert",
                                "Lansing, MI 48912"
                            ]
                        },
                        "phone": "+15173339993",
                        "display_phone": "(517) 333-9993",
                        "distance": 5133.668833046616
                    },
                    {
                        "closed": false,
                        "id": "wp9bxsI03sHLMRozOytZ-Q",
                        "alias": "everyday-authentic-chinese-cuisine-east-lansing",
                        "name": "Everyday Authentic Chinese Cuisine",
                        "image_url": "https://s3-media3.fl.yelpcdn.com/bphoto/Z_KGNT1Q80P7cnTVDa9tfw/o.jpg",
                        "is_closed": false,
                        "url": "https://www.yelp.com/biz/everyday-authentic-chinese-cuisine-east-lansing?adjust_creative=J_BflFlLyenw_jW6Q_Wrgg&utm_campaign=yelp_api_v3&utm_medium=api_v3_business_search&utm_source=J_BflFlLyenw_jW6Q_Wrgg",
                        "review_count": 93,
                        "categories":
                        [
                            {
                                "alias": "chinese",
                                "title": "Chinese"
                            }
                        ],
                        "rating": 4.0,
                        "coordinates":
                        {
                            "latitude": 42.730334304168,
                            "longitude": -84.4634694121178
                        },
                        "transactions":
                        [
                            "delivery"
                        ],
                        "price": "$$",
                        "location":
                        {
                            "address1": "1375 E Grand River",
                            "address2": "",
                            "address3": "",
                            "city": "East Lansing",
                            "zip_code": "48823",
                            "country": "US",
                            "state": "MI",
                            "display_address":
                            [
                                "1375 E Grand River",
                                "East Lansing, MI 48823"
                            ]
                        },
                        "phone": "+15173371882",
                        "display_phone": "(517) 337-1882",
                        "distance": 8592.814304416248
                    },
                    {
                        "closed": false,
                        "id": "2gOH7HGzPopH8mSx1lrDlQ",
                        "alias": "east-cafe-east-lansing-2",
                        "name": "East Cafe",
                        "image_url": "https://s3-media2.fl.yelpcdn.com/bphoto/BeMHtswl_dYJFn90tFc_HQ/o.jpg",
                        "is_closed": false,
                        "url": "https://www.yelp.com/biz/east-cafe-east-lansing-2?adjust_creative=J_BflFlLyenw_jW6Q_Wrgg&utm_campaign=yelp_api_v3&utm_medium=api_v3_business_search&utm_source=J_BflFlLyenw_jW6Q_Wrgg",
                        "review_count": 66,
                        "categories":
                        [
                            {
                                "alias": "chinese",
                                "title": "Chinese"
                            }
                        ],
                        "rating": 4.0,
                        "coordinates":
                        {
                            "latitude": 42.732032,
                            "longitude": -84.470771
                        },
                        "transactions":
                        [
                            "pickup",
                            "delivery"
                        ],
                        "price": "$$",
                        "location":
                        {
                            "address1": "1001 E Grand River Ave",
                            "address2": "",
                            "address3": "",
                            "city": "East Lansing",
                            "zip_code": "48823",
                            "country": "US",
                            "state": "MI",
                            "display_address":
                            [
                                "1001 E Grand River Ave",
                                "East Lansing, MI 48823"
                            ]
                        },
                        "phone": "+15178536828",
                        "display_phone": "(517) 853-6828",
                        "distance": 8000.174537925075
                    },
                    {
                        "closed": false,
                        "id": "b1JCgQPrg6YjKOsMbBLYNg",
                        "alias": "limit-kitchen-and-bar-east-lansing",
                        "name": "Limit Kitchen & Bar",
                        "image_url": "https://s3-media4.fl.yelpcdn.com/bphoto/BmwZMI864MdSwEEKyP-wsA/o.jpg",
                        "is_closed": false,
                        "url": "https://www.yelp.com/biz/limit-kitchen-and-bar-east-lansing?adjust_creative=J_BflFlLyenw_jW6Q_Wrgg&utm_campaign=yelp_api_v3&utm_medium=api_v3_business_search&utm_source=J_BflFlLyenw_jW6Q_Wrgg",
                        "review_count": 7,
                        "categories":
                        [
                            {
                                "alias": "karaoke",
                                "title": "Karaoke"
                            },
                            {
                                "alias": "chinese",
                                "title": "Chinese"
                            }
                        ],
                        "rating": 4.5,
                        "coordinates":
                        {
                            "latitude": 42.72826,
                            "longitude": -84.454461
                        },
                        "transactions":
                        [
                            "pickup",
                            "delivery"
                        ],
                        "price": null,
                        "location":
                        {
                            "address1": "2800 E Grand River Ave",
                            "address2": "Ste D",
                            "address3": null,
                            "city": "East Lansing",
                            "zip_code": "48823",
                            "country": "US",
                            "state": "MI",
                            "display_address":
                            [
                                "2800 E Grand River Ave",
                                "Ste D",
                                "East Lansing, MI 48823"
                            ]
                        },
                        "phone": "+15176642565",
                        "display_phone": "(517) 664-2565",
                        "distance": 9314.852732938543
                    },
                    {
                        "closed": false,
                        "id": "aQr-rYsV1dkB0wB2OHC9YA",
                        "alias": "hongs-cafe-east-lansing",
                        "name": "Hong's Cafe",
                        "image_url": "https://s3-media3.fl.yelpcdn.com/bphoto/8gY6PY_um-4MK5yBonKgnQ/o.jpg",
                        "is_closed": false,
                        "url": "https://www.yelp.com/biz/hongs-cafe-east-lansing?adjust_creative=J_BflFlLyenw_jW6Q_Wrgg&utm_campaign=yelp_api_v3&utm_medium=api_v3_business_search&utm_source=J_BflFlLyenw_jW6Q_Wrgg",
                        "review_count": 18,
                        "categories":
                        [
                            {
                                "alias": "bubbletea",
                                "title": "Bubble Tea"
                            },
                            {
                                "alias": "chinese",
                                "title": "Chinese"
                            }
                        ],
                        "rating": 4.0,
                        "coordinates":
                        {
                            "latitude": 42.757143,
                            "longitude": -84.4640809
                        },
                        "transactions":
                        [
                            "delivery"
                        ],
                        "price": "$$",
                        "location":
                        {
                            "address1": "3030 E Lake Lansing Rd",
                            "address2": "",
                            "address3": "",
                            "city": "East Lansing",
                            "zip_code": "48823",
                            "country": "US",
                            "state": "MI",
                            "display_address":
                            [
                                "3030 E Lake Lansing Rd",
                                "East Lansing, MI 48823"
                            ]
                        },
                        "phone": "+15173326688",
                        "display_phone": "(517) 332-6688",
                        "distance": 9120.31542435394
                    },
                    {
                        "closed": false,
                        "id": "U0Rb6g6IB848SwNJkVcuAg",
                        "alias": "jimy-s-asian-cuisine-east-lansing",
                        "name": "Jimy’s Asian Cuisine",
                        "image_url": "https://s3-media3.fl.yelpcdn.com/bphoto/24pEmUEjHqEJxCUe5hi5Hw/o.jpg",
                        "is_closed": false,
                        "url": "https://www.yelp.com/biz/jimy-s-asian-cuisine-east-lansing?adjust_creative=J_BflFlLyenw_jW6Q_Wrgg&utm_campaign=yelp_api_v3&utm_medium=api_v3_business_search&utm_source=J_BflFlLyenw_jW6Q_Wrgg",
                        "review_count": 2,
                        "categories":
                        [
                            {
                                "alias": "chinese",
                                "title": "Chinese"
                            },
                            {
                                "alias": "asianfusion",
                                "title": "Asian Fusion"
                            }
                        ],
                        "rating": 5.0,
                        "coordinates":
                        {
                            "latitude": 42.73344,
                            "longitude": -84.47593
                        },
                        "transactions":
                        [
                            "pickup",
                            "delivery"
                        ],
                        "price": null,
                        "location":
                        {
                            "address1": "611 E Grand River Ave",
                            "address2": "Ste 100",
                            "address3": "",
                            "city": "East Lansing",
                            "zip_code": "48823",
                            "country": "US",
                            "state": "MI",
                            "display_address":
                            [
                                "611 E Grand River Ave",
                                "Ste 100",
                                "East Lansing, MI 48823"
                            ]
                        },
                        "phone": "+15173883539",
                        "display_phone": "(517) 388-3539",
                        "distance": 7594.786201727431
                    },
                    {
                        "closed": false,
                        "id": "wR66dolc4UxgDgaAh-botg",
                        "alias": "china-flavor-lansing",
                        "name": "China Flavor",
                        "image_url": "https://s3-media4.fl.yelpcdn.com/bphoto/UCKUPMHeb3YV2gaTSQklkg/o.jpg",
                        "is_closed": false,
                        "url": "https://www.yelp.com/biz/china-flavor-lansing?adjust_creative=J_BflFlLyenw_jW6Q_Wrgg&utm_campaign=yelp_api_v3&utm_medium=api_v3_business_search&utm_source=J_BflFlLyenw_jW6Q_Wrgg",
                        "review_count": 74,
                        "categories":
                        [
                            {
                                "alias": "chinese",
                                "title": "Chinese"
                            },
                            {
                                "alias": "soup",
                                "title": "Soup"
                            }
                        ],
                        "rating": 3.0,
                        "coordinates":
                        {
                            "latitude": 42.7336332564919,
                            "longitude": -84.521395303309
                        },
                        "transactions":
                        [
                            "pickup",
                            "delivery"
                        ],
                        "price": "$",
                        "location":
                        {
                            "address1": "2033 East Michigan Ave",
                            "address2": "",
                            "address3": "",
                            "city": "Lansing",
                            "zip_code": "48912",
                            "country": "US",
                            "state": "MI",
                            "display_address":
                            [
                                "2033 East Michigan Ave",
                                "Lansing, MI 48912"
                            ]
                        },
                        "phone": "+15177211083",
                        "display_phone": "(517) 721-1083",
                        "distance": 3903.5642934757484
                    }
                ]
            }
        },
        {
            "japanese":
            {
                "total": 3,
                "businesses":
                [
                    {
                        "closed": false,
                        "id": "q9G391qh1ywNdrjxe4b4CA",
                        "alias": "korea-house-east-lansing",
                        "name": "Korea House",
                        "image_url": "https://s3-media1.fl.yelpcdn.com/bphoto/q6SQbuzo-aNc3gD7neHV7A/o.jpg",
                        "is_closed": false,
                        "url": "https://www.yelp.com/biz/korea-house-east-lansing?adjust_creative=J_BflFlLyenw_jW6Q_Wrgg&utm_campaign=yelp_api_v3&utm_medium=api_v3_business_search&utm_source=J_BflFlLyenw_jW6Q_Wrgg",
                        "review_count": 115,
                        "categories":
                        [
                            {
                                "alias": "korean",
                                "title": "Korean"
                            },
                            {
                                "alias": "japanese",
                                "title": "Japanese"
                            }
                        ],
                        "rating": 3.5,
                        "coordinates":
                        {
                            "latitude": 42.7208357773238,
                            "longitude": -84.496027545428
                        },
                        "transactions":
                        [
                            "delivery"
                        ],
                        "price": "$$",
                        "location":
                        {
                            "address1": "978 Trowbridge Rd",
                            "address2": "",
                            "address3": "",
                            "city": "East Lansing",
                            "zip_code": "48823",
                            "country": "US",
                            "state": "MI",
                            "display_address":
                            [
                                "978 Trowbridge Rd",
                                "East Lansing, MI 48823"
                            ]
                        },
                        "phone": "+15173320608",
                        "display_phone": "(517) 332-0608",
                        "distance": 5988.846315450095
                    },
                    {
                        "closed": false,
                        "id": "nftEH2F-HCUxrmds2LglbA",
                        "alias": "omi-sushi-east-lansing",
                        "name": "Omi Sushi",
                        "image_url": "https://s3-media3.fl.yelpcdn.com/bphoto/wn2z3Nxr1LmXLbPq9-hLaQ/o.jpg",
                        "is_closed": false,
                        "url": "https://www.yelp.com/biz/omi-sushi-east-lansing?adjust_creative=J_BflFlLyenw_jW6Q_Wrgg&utm_campaign=yelp_api_v3&utm_medium=api_v3_business_search&utm_source=J_BflFlLyenw_jW6Q_Wrgg",
                        "review_count": 154,
                        "categories":
                        [
                            {
                                "alias": "sushi",
                                "title": "Sushi Bars"
                            },
                            {
                                "alias": "japanese",
                                "title": "Japanese"
                            }
                        ],
                        "rating": 4.0,
                        "coordinates":
                        {
                            "latitude": 42.73497802798235,
                            "longitude": -84.48113054110442
                        },
                        "transactions":
                        [
                            "delivery"
                        ],
                        "price": "$$",
                        "location":
                        {
                            "address1": "210 Mac Ave",
                            "address2": "",
                            "address3": "",
                            "city": "East Lansing",
                            "zip_code": "48823",
                            "country": "US",
                            "state": "MI",
                            "display_address":
                            [
                                "210 Mac Ave",
                                "East Lansing, MI 48823"
                            ]
                        },
                        "phone": "+15173372222",
                        "display_phone": "(517) 337-2222",
                        "distance": 7185.42521313561
                    },
                    {
                        "closed": false,
                        "id": "w5r3JbhDgn-bjL0Fg37wVg",
                        "alias": "udon-sushi-restaurant-east-lansing",
                        "name": "Udon Sushi Restaurant",
                        "image_url": "https://s3-media2.fl.yelpcdn.com/bphoto/58iQ34NRMelkCTFfIVp8oA/o.jpg",
                        "is_closed": false,
                        "url": "https://www.yelp.com/biz/udon-sushi-restaurant-east-lansing?adjust_creative=J_BflFlLyenw_jW6Q_Wrgg&utm_campaign=yelp_api_v3&utm_medium=api_v3_business_search&utm_source=J_BflFlLyenw_jW6Q_Wrgg",
                        "review_count": 100,
                        "categories":
                        [
                            {
                                "alias": "sushi",
                                "title": "Sushi Bars"
                            },
                            {
                                "alias": "japanese",
                                "title": "Japanese"
                            },
                            {
                                "alias": "asianfusion",
                                "title": "Asian Fusion"
                            }
                        ],
                        "rating": 4.0,
                        "coordinates":
                        {
                            "latitude": 42.73458,
                            "longitude": -84.49319
                        },
                        "transactions":
                        [
                            "delivery"
                        ],
                        "price": "$",
                        "location":
                        {
                            "address1": "134 N Harrison Rd",
                            "address2": "Ste A",
                            "address3": "",
                            "city": "East Lansing",
                            "zip_code": "48823",
                            "country": "US",
                            "state": "MI",
                            "display_address":
                            [
                                "134 N Harrison Rd",
                                "Ste A",
                                "East Lansing, MI 48823"
                            ]
                        },
                        "phone": "+15173325995",
                        "display_phone": "(517) 332-5995",
                        "distance": 6200.690750299739
                    }
                ]
            }
        },
        {
            "korean":
            {
                "total": 2,
                "businesses":
                [
                    {
                        "closed": false,
                        "id": "2HgDE-nZHegKxEASEMMZ9g",
                        "alias": "baps-east-lansing-10",
                        "name": "Baps",
                        "image_url": "https://s3-media2.fl.yelpcdn.com/bphoto/BCLaOthoNpisEaZNyY_mwg/o.jpg",
                        "is_closed": false,
                        "url": "https://www.yelp.com/biz/baps-east-lansing-10?adjust_creative=J_BflFlLyenw_jW6Q_Wrgg&utm_campaign=yelp_api_v3&utm_medium=api_v3_business_search&utm_source=J_BflFlLyenw_jW6Q_Wrgg",
                        "review_count": 51,
                        "categories":
                        [
                            {
                                "alias": "korean",
                                "title": "Korean"
                            },
                            {
                                "alias": "bbq",
                                "title": "Barbeque"
                            }
                        ],
                        "rating": 4.5,
                        "coordinates":
                        {
                            "latitude": 42.7351798,
                            "longitude": -84.4802734
                        },
                        "transactions":
                        [
                            "delivery"
                        ],
                        "price": null,
                        "location":
                        {
                            "address1": "340 Albert Ave",
                            "address2": null,
                            "address3": "",
                            "city": "East Lansing",
                            "zip_code": "48823",
                            "country": "US",
                            "state": "MI",
                            "display_address":
                            [
                                "340 Albert Ave",
                                "East Lansing, MI 48823"
                            ]
                        },
                        "phone": "+15175745587",
                        "display_phone": "(517) 574-5587",
                        "distance": 7257.291795213586
                    },
                    {
                        "closed": false,
                        "id": "q9G391qh1ywNdrjxe4b4CA",
                        "alias": "korea-house-east-lansing",
                        "name": "Korea House",
                        "image_url": "https://s3-media1.fl.yelpcdn.com/bphoto/q6SQbuzo-aNc3gD7neHV7A/o.jpg",
                        "is_closed": false,
                        "url": "https://www.yelp.com/biz/korea-house-east-lansing?adjust_creative=J_BflFlLyenw_jW6Q_Wrgg&utm_campaign=yelp_api_v3&utm_medium=api_v3_business_search&utm_source=J_BflFlLyenw_jW6Q_Wrgg",
                        "review_count": 115,
                        "categories":
                        [
                            {
                                "alias": "korean",
                                "title": "Korean"
                            },
                            {
                                "alias": "japanese",
                                "title": "Japanese"
                            }
                        ],
                        "rating": 3.5,
                        "coordinates":
                        {
                            "latitude": 42.7208357773238,
                            "longitude": -84.496027545428
                        },
                        "transactions":
                        [
                            "delivery"
                        ],
                        "price": "$$",
                        "location":
                        {
                            "address1": "978 Trowbridge Rd",
                            "address2": "",
                            "address3": "",
                            "city": "East Lansing",
                            "zip_code": "48823",
                            "country": "US",
                            "state": "MI",
                            "display_address":
                            [
                                "978 Trowbridge Rd",
                                "East Lansing, MI 48823"
                            ]
                        },
                        "phone": "+15173320608",
                        "display_phone": "(517) 332-0608",
                        "distance": 5988.846315450095
                    }
                ]
            }
        },
        {
            "asianfusion":
            {
                "total": 2,
                "businesses":
                [
                    {
                        "closed": false,
                        "id": "w5r3JbhDgn-bjL0Fg37wVg",
                        "alias": "udon-sushi-restaurant-east-lansing",
                        "name": "Udon Sushi Restaurant",
                        "image_url": "https://s3-media2.fl.yelpcdn.com/bphoto/58iQ34NRMelkCTFfIVp8oA/o.jpg",
                        "is_closed": false,
                        "url": "https://www.yelp.com/biz/udon-sushi-restaurant-east-lansing?adjust_creative=J_BflFlLyenw_jW6Q_Wrgg&utm_campaign=yelp_api_v3&utm_medium=api_v3_business_search&utm_source=J_BflFlLyenw_jW6Q_Wrgg",
                        "review_count": 100,
                        "categories":
                        [
                            {
                                "alias": "sushi",
                                "title": "Sushi Bars"
                            },
                            {
                                "alias": "japanese",
                                "title": "Japanese"
                            },
                            {
                                "alias": "asianfusion",
                                "title": "Asian Fusion"
                            }
                        ],
                        "rating": 4.0,
                        "coordinates":
                        {
                            "latitude": 42.73458,
                            "longitude": -84.49319
                        },
                        "transactions":
                        [
                            "delivery"
                        ],
                        "price": "$",
                        "location":
                        {
                            "address1": "134 N Harrison Rd",
                            "address2": "Ste A",
                            "address3": "",
                            "city": "East Lansing",
                            "zip_code": "48823",
                            "country": "US",
                            "state": "MI",
                            "display_address":
                            [
                                "134 N Harrison Rd",
                                "Ste A",
                                "East Lansing, MI 48823"
                            ]
                        },
                        "phone": "+15173325995",
                        "display_phone": "(517) 332-5995",
                        "distance": 6200.690750299739
                    },
                    {
                        "closed": false,
                        "id": "U0Rb6g6IB848SwNJkVcuAg",
                        "alias": "jimy-s-asian-cuisine-east-lansing",
                        "name": "Jimy’s Asian Cuisine",
                        "image_url": "https://s3-media3.fl.yelpcdn.com/bphoto/24pEmUEjHqEJxCUe5hi5Hw/o.jpg",
                        "is_closed": false,
                        "url": "https://www.yelp.com/biz/jimy-s-asian-cuisine-east-lansing?adjust_creative=J_BflFlLyenw_jW6Q_Wrgg&utm_campaign=yelp_api_v3&utm_medium=api_v3_business_search&utm_source=J_BflFlLyenw_jW6Q_Wrgg",
                        "review_count": 2,
                        "categories":
                        [
                            {
                                "alias": "chinese",
                                "title": "Chinese"
                            },
                            {
                                "alias": "asianfusion",
                                "title": "Asian Fusion"
                            }
                        ],
                        "rating": 5.0,
                        "coordinates":
                        {
                            "latitude": 42.73344,
                            "longitude": -84.47593
                        },
                        "transactions":
                        [
                            "pickup",
                            "delivery"
                        ],
                        "price": null,
                        "location":
                        {
                            "address1": "611 E Grand River Ave",
                            "address2": "Ste 100",
                            "address3": "",
                            "city": "East Lansing",
                            "zip_code": "48823",
                            "country": "US",
                            "state": "MI",
                            "display_address":
                            [
                                "611 E Grand River Ave",
                                "Ste 100",
                                "East Lansing, MI 48823"
                            ]
                        },
                        "phone": "+15173883539",
                        "display_phone": "(517) 388-3539",
                        "distance": 7594.786201727431
                    }
                ]
            }
        },
        {
            "hotpot":
            {
                "total": 2,
                "businesses":
                [
                    {
                        "closed": false,
                        "id": "jDO7O7dGf1oLQD_CqWTxUA",
                        "alias": "royal-pot-east-lansing-2",
                        "name": "Royal Pot",
                        "image_url": "https://s3-media4.fl.yelpcdn.com/bphoto/mjPFo16pbY8kmC4MscLMNg/o.jpg",
                        "is_closed": false,
                        "url": "https://www.yelp.com/biz/royal-pot-east-lansing-2?adjust_creative=J_BflFlLyenw_jW6Q_Wrgg&utm_campaign=yelp_api_v3&utm_medium=api_v3_business_search&utm_source=J_BflFlLyenw_jW6Q_Wrgg",
                        "review_count": 79,
                        "categories":
                        [
                            {
                                "alias": "hotpot",
                                "title": "Hot Pot"
                            }
                        ],
                        "rating": 4.0,
                        "coordinates":
                        {
                            "latitude": 42.719489,
                            "longitude": -84.461112
                        },
                        "transactions":
                        [
                            "pickup",
                            "delivery"
                        ],
                        "price": "$$",
                        "location":
                        {
                            "address1": "4750 S Hagadorn Rd",
                            "address2": "Ste 40",
                            "address3": null,
                            "city": "East Lansing",
                            "zip_code": "48823",
                            "country": "US",
                            "state": "MI",
                            "display_address":
                            [
                                "4750 S Hagadorn Rd",
                                "Ste 40",
                                "East Lansing, MI 48823"
                            ]
                        },
                        "phone": "+15174832780",
                        "display_phone": "(517) 483-2780",
                        "distance": 8833.59445677508
                    },
                    {
                        "closed": false,
                        "id": "vBNWEG1sct6mmFc3mllwPA",
                        "alias": "boiling-pots-east-lansing",
                        "name": "Boiling Pots",
                        "image_url": "https://s3-media3.fl.yelpcdn.com/bphoto/1d8zZNwLgYfL1zjpyYcoBQ/o.jpg",
                        "is_closed": false,
                        "url": "https://www.yelp.com/biz/boiling-pots-east-lansing?adjust_creative=J_BflFlLyenw_jW6Q_Wrgg&utm_campaign=yelp_api_v3&utm_medium=api_v3_business_search&utm_source=J_BflFlLyenw_jW6Q_Wrgg",
                        "review_count": 92,
                        "categories":
                        [
                            {
                                "alias": "chinese",
                                "title": "Chinese"
                            },
                            {
                                "alias": "hotpot",
                                "title": "Hot Pot"
                            },
                            {
                                "alias": "taiwanese",
                                "title": "Taiwanese"
                            }
                        ],
                        "rating": 4.0,
                        "coordinates":
                        {
                            "latitude": 42.72623,
                            "longitude": -84.44801
                        },
                        "transactions":
                        [
                            "pickup",
                            "delivery"
                        ],
                        "price": "$$",
                        "location":
                        {
                            "address1": "2650 E Grand River Ave",
                            "address2": "",
                            "address3": "",
                            "city": "East Lansing",
                            "zip_code": "48823",
                            "country": "US",
                            "state": "MI",
                            "display_address":
                            [
                                "2650 E Grand River Ave",
                                "East Lansing, MI 48823"
                            ]
                        },
                        "phone": "+15178891799",
                        "display_phone": "(517) 889-1799",
                        "distance": 9854.161659461644
                    }
                ]
            }
        },
        {
            "sushi":
            {
                "total": 2,
                "businesses":
                [
                    {
                        "closed": false,
                        "id": "nftEH2F-HCUxrmds2LglbA",
                        "alias": "omi-sushi-east-lansing",
                        "name": "Omi Sushi",
                        "image_url": "https://s3-media3.fl.yelpcdn.com/bphoto/wn2z3Nxr1LmXLbPq9-hLaQ/o.jpg",
                        "is_closed": false,
                        "url": "https://www.yelp.com/biz/omi-sushi-east-lansing?adjust_creative=J_BflFlLyenw_jW6Q_Wrgg&utm_campaign=yelp_api_v3&utm_medium=api_v3_business_search&utm_source=J_BflFlLyenw_jW6Q_Wrgg",
                        "review_count": 154,
                        "categories":
                        [
                            {
                                "alias": "sushi",
                                "title": "Sushi Bars"
                            },
                            {
                                "alias": "japanese",
                                "title": "Japanese"
                            }
                        ],
                        "rating": 4.0,
                        "coordinates":
                        {
                            "latitude": 42.73497802798235,
                            "longitude": -84.48113054110442
                        },
                        "transactions":
                        [
                            "delivery"
                        ],
                        "price": "$$",
                        "location":
                        {
                            "address1": "210 Mac Ave",
                            "address2": "",
                            "address3": "",
                            "city": "East Lansing",
                            "zip_code": "48823",
                            "country": "US",
                            "state": "MI",
                            "display_address":
                            [
                                "210 Mac Ave",
                                "East Lansing, MI 48823"
                            ]
                        },
                        "phone": "+15173372222",
                        "display_phone": "(517) 337-2222",
                        "distance": 7185.42521313561
                    },
                    {
                        "closed": false,
                        "id": "w5r3JbhDgn-bjL0Fg37wVg",
                        "alias": "udon-sushi-restaurant-east-lansing",
                        "name": "Udon Sushi Restaurant",
                        "image_url": "https://s3-media2.fl.yelpcdn.com/bphoto/58iQ34NRMelkCTFfIVp8oA/o.jpg",
                        "is_closed": false,
                        "url": "https://www.yelp.com/biz/udon-sushi-restaurant-east-lansing?adjust_creative=J_BflFlLyenw_jW6Q_Wrgg&utm_campaign=yelp_api_v3&utm_medium=api_v3_business_search&utm_source=J_BflFlLyenw_jW6Q_Wrgg",
                        "review_count": 100,
                        "categories":
                        [
                            {
                                "alias": "sushi",
                                "title": "Sushi Bars"
                            },
                            {
                                "alias": "japanese",
                                "title": "Japanese"
                            },
                            {
                                "alias": "asianfusion",
                                "title": "Asian Fusion"
                            }
                        ],
                        "rating": 4.0,
                        "coordinates":
                        {
                            "latitude": 42.73458,
                            "longitude": -84.49319
                        },
                        "transactions":
                        [
                            "delivery"
                        ],
                        "price": "$",
                        "location":
                        {
                            "address1": "134 N Harrison Rd",
                            "address2": "Ste A",
                            "address3": "",
                            "city": "East Lansing",
                            "zip_code": "48823",
                            "country": "US",
                            "state": "MI",
                            "display_address":
                            [
                                "134 N Harrison Rd",
                                "Ste A",
                                "East Lansing, MI 48823"
                            ]
                        },
                        "phone": "+15173325995",
                        "display_phone": "(517) 332-5995",
                        "distance": 6200.690750299739
                    }
                ]
            }
        },
        {
            "seafood":
            {
                "total": 1,
                "businesses":
                [
                    {
                        "closed": false,
                        "id": "z6utdG2eRy9BZJKwJEKaTg",
                        "alias": "the-kung-fu-lansing",
                        "name": "The Kung Fu",
                        "image_url": "https://s3-media2.fl.yelpcdn.com/bphoto/aLACQMjd8D6qoOaDa1-hSQ/o.jpg",
                        "is_closed": false,
                        "url": "https://www.yelp.com/biz/the-kung-fu-lansing?adjust_creative=J_BflFlLyenw_jW6Q_Wrgg&utm_campaign=yelp_api_v3&utm_medium=api_v3_business_search&utm_source=J_BflFlLyenw_jW6Q_Wrgg",
                        "review_count": 56,
                        "categories":
                        [
                            {
                                "alias": "chinese",
                                "title": "Chinese"
                            },
                            {
                                "alias": "seafood",
                                "title": "Seafood"
                            },
                            {
                                "alias": "chickenshop",
                                "title": "Chicken Shop"
                            }
                        ],
                        "rating": 3.5,
                        "coordinates":
                        {
                            "latitude": 42.7413016,
                            "longitude": -84.508319
                        },
                        "transactions":
                        [
                            "pickup",
                            "delivery"
                        ],
                        "price": "$",
                        "location":
                        {
                            "address1": "730 N Clippert",
                            "address2": "",
                            "address3": "",
                            "city": "Lansing",
                            "zip_code": "48912",
                            "country": "US",
                            "state": "MI",
                            "display_address":
                            [
                                "730 N Clippert",
                                "Lansing, MI 48912"
                            ]
                        },
                        "phone": "+15173339993",
                        "display_phone": "(517) 333-9993",
                        "distance": 5133.668833046616
                    }
                ]
            }
        },
        {
            "breakfast_brunch":
            {
                "total": 1,
                "businesses":
                [
                    {
                        "closed": false,
                        "id": "ywmLl1CiBB2zQBTY9bnFMA",
                        "alias": "golden-harvest-lansing",
                        "name": "Golden Harvest",
                        "image_url": "https://s3-media3.fl.yelpcdn.com/bphoto/Cy1Xf7H6rt7etstEAcfE_g/o.jpg",
                        "is_closed": false,
                        "url": "https://www.yelp.com/biz/golden-harvest-lansing?adjust_creative=J_BflFlLyenw_jW6Q_Wrgg&utm_campaign=yelp_api_v3&utm_medium=api_v3_business_search&utm_source=J_BflFlLyenw_jW6Q_Wrgg",
                        "review_count": 674,
                        "categories":
                        [
                            {
                                "alias": "breakfast_brunch",
                                "title": "Breakfast & Brunch"
                            },
                            {
                                "alias": "diners",
                                "title": "Diners"
                            }
                        ],
                        "rating": 4.0,
                        "coordinates":
                        {
                            "latitude": 42.7524188,
                            "longitude": -84.54978497316395
                        },
                        "transactions":
                        [],
                        "price": "$$",
                        "location":
                        {
                            "address1": "1625 Turner St",
                            "address2": "",
                            "address3": "",
                            "city": "Lansing",
                            "zip_code": "48906",
                            "country": "US",
                            "state": "MI",
                            "display_address":
                            [
                                "1625 Turner St",
                                "Lansing, MI 48906"
                            ]
                        },
                        "phone": "",
                        "display_phone": "",
                        "distance": 3091.6509981289782
                    }
                ]
            }
        },
        {
            "soup":
            {
                "total": 1,
                "businesses":
                [
                    {
                        "closed": false,
                        "id": "wR66dolc4UxgDgaAh-botg",
                        "alias": "china-flavor-lansing",
                        "name": "China Flavor",
                        "image_url": "https://s3-media4.fl.yelpcdn.com/bphoto/UCKUPMHeb3YV2gaTSQklkg/o.jpg",
                        "is_closed": false,
                        "url": "https://www.yelp.com/biz/china-flavor-lansing?adjust_creative=J_BflFlLyenw_jW6Q_Wrgg&utm_campaign=yelp_api_v3&utm_medium=api_v3_business_search&utm_source=J_BflFlLyenw_jW6Q_Wrgg",
                        "review_count": 74,
                        "categories":
                        [
                            {
                                "alias": "chinese",
                                "title": "Chinese"
                            },
                            {
                                "alias": "soup",
                                "title": "Soup"
                            }
                        ],
                        "rating": 3.0,
                        "coordinates":
                        {
                            "latitude": 42.7336332564919,
                            "longitude": -84.521395303309
                        },
                        "transactions":
                        [
                            "pickup",
                            "delivery"
                        ],
                        "price": "$",
                        "location":
                        {
                            "address1": "2033 East Michigan Ave",
                            "address2": "",
                            "address3": "",
                            "city": "Lansing",
                            "zip_code": "48912",
                            "country": "US",
                            "state": "MI",
                            "display_address":
                            [
                                "2033 East Michigan Ave",
                                "Lansing, MI 48912"
                            ]
                        },
                        "phone": "+15177211083",
                        "display_phone": "(517) 721-1083",
                        "distance": 3903.5642934757484
                    }
                ]
            }
        },
        {
            "diners":
            {
                "total": 1,
                "businesses":
                [
                    {
                        "closed": false,
                        "id": "ywmLl1CiBB2zQBTY9bnFMA",
                        "alias": "golden-harvest-lansing",
                        "name": "Golden Harvest",
                        "image_url": "https://s3-media3.fl.yelpcdn.com/bphoto/Cy1Xf7H6rt7etstEAcfE_g/o.jpg",
                        "is_closed": false,
                        "url": "https://www.yelp.com/biz/golden-harvest-lansing?adjust_creative=J_BflFlLyenw_jW6Q_Wrgg&utm_campaign=yelp_api_v3&utm_medium=api_v3_business_search&utm_source=J_BflFlLyenw_jW6Q_Wrgg",
                        "review_count": 674,
                        "categories":
                        [
                            {
                                "alias": "breakfast_brunch",
                                "title": "Breakfast & Brunch"
                            },
                            {
                                "alias": "diners",
                                "title": "Diners"
                            }
                        ],
                        "rating": 4.0,
                        "coordinates":
                        {
                            "latitude": 42.7524188,
                            "longitude": -84.54978497316395
                        },
                        "transactions":
                        [],
                        "price": "$$",
                        "location":
                        {
                            "address1": "1625 Turner St",
                            "address2": "",
                            "address3": "",
                            "city": "Lansing",
                            "zip_code": "48906",
                            "country": "US",
                            "state": "MI",
                            "display_address":
                            [
                                "1625 Turner St",
                                "Lansing, MI 48906"
                            ]
                        },
                        "phone": "",
                        "display_phone": "",
                        "distance": 3091.6509981289782
                    }
                ]
            }
        },
        {
            "chickenshop":
            {
                "total": 1,
                "businesses":
                [
                    {
                        "closed": false,
                        "id": "z6utdG2eRy9BZJKwJEKaTg",
                        "alias": "the-kung-fu-lansing",
                        "name": "The Kung Fu",
                        "image_url": "https://s3-media2.fl.yelpcdn.com/bphoto/aLACQMjd8D6qoOaDa1-hSQ/o.jpg",
                        "is_closed": false,
                        "url": "https://www.yelp.com/biz/the-kung-fu-lansing?adjust_creative=J_BflFlLyenw_jW6Q_Wrgg&utm_campaign=yelp_api_v3&utm_medium=api_v3_business_search&utm_source=J_BflFlLyenw_jW6Q_Wrgg",
                        "review_count": 56,
                        "categories":
                        [
                            {
                                "alias": "chinese",
                                "title": "Chinese"
                            },
                            {
                                "alias": "seafood",
                                "title": "Seafood"
                            },
                            {
                                "alias": "chickenshop",
                                "title": "Chicken Shop"
                            }
                        ],
                        "rating": 3.5,
                        "coordinates":
                        {
                            "latitude": 42.7413016,
                            "longitude": -84.508319
                        },
                        "transactions":
                        [
                            "pickup",
                            "delivery"
                        ],
                        "price": "$",
                        "location":
                        {
                            "address1": "730 N Clippert",
                            "address2": "",
                            "address3": "",
                            "city": "Lansing",
                            "zip_code": "48912",
                            "country": "US",
                            "state": "MI",
                            "display_address":
                            [
                                "730 N Clippert",
                                "Lansing, MI 48912"
                            ]
                        },
                        "phone": "+15173339993",
                        "display_phone": "(517) 333-9993",
                        "distance": 5133.668833046616
                    }
                ]
            }
        },
        {
            "bbq":
            {
                "total": 1,
                "businesses":
                [
                    {
                        "closed": false,
                        "id": "2HgDE-nZHegKxEASEMMZ9g",
                        "alias": "baps-east-lansing-10",
                        "name": "Baps",
                        "image_url": "https://s3-media2.fl.yelpcdn.com/bphoto/BCLaOthoNpisEaZNyY_mwg/o.jpg",
                        "is_closed": false,
                        "url": "https://www.yelp.com/biz/baps-east-lansing-10?adjust_creative=J_BflFlLyenw_jW6Q_Wrgg&utm_campaign=yelp_api_v3&utm_medium=api_v3_business_search&utm_source=J_BflFlLyenw_jW6Q_Wrgg",
                        "review_count": 51,
                        "categories":
                        [
                            {
                                "alias": "korean",
                                "title": "Korean"
                            },
                            {
                                "alias": "bbq",
                                "title": "Barbeque"
                            }
                        ],
                        "rating": 4.5,
                        "coordinates":
                        {
                            "latitude": 42.7351798,
                            "longitude": -84.4802734
                        },
                        "transactions":
                        [
                            "delivery"
                        ],
                        "price": null,
                        "location":
                        {
                            "address1": "340 Albert Ave",
                            "address2": null,
                            "address3": "",
                            "city": "East Lansing",
                            "zip_code": "48823",
                            "country": "US",
                            "state": "MI",
                            "display_address":
                            [
                                "340 Albert Ave",
                                "East Lansing, MI 48823"
                            ]
                        },
                        "phone": "+15175745587",
                        "display_phone": "(517) 574-5587",
                        "distance": 7257.291795213586
                    }
                ]
            }
        },
        {
            "taiwanese":
            {
                "total": 1,
                "businesses":
                [
                    {
                        "closed": false,
                        "id": "vBNWEG1sct6mmFc3mllwPA",
                        "alias": "boiling-pots-east-lansing",
                        "name": "Boiling Pots",
                        "image_url": "https://s3-media3.fl.yelpcdn.com/bphoto/1d8zZNwLgYfL1zjpyYcoBQ/o.jpg",
                        "is_closed": false,
                        "url": "https://www.yelp.com/biz/boiling-pots-east-lansing?adjust_creative=J_BflFlLyenw_jW6Q_Wrgg&utm_campaign=yelp_api_v3&utm_medium=api_v3_business_search&utm_source=J_BflFlLyenw_jW6Q_Wrgg",
                        "review_count": 92,
                        "categories":
                        [
                            {
                                "alias": "chinese",
                                "title": "Chinese"
                            },
                            {
                                "alias": "hotpot",
                                "title": "Hot Pot"
                            },
                            {
                                "alias": "taiwanese",
                                "title": "Taiwanese"
                            }
                        ],
                        "rating": 4.0,
                        "coordinates":
                        {
                            "latitude": 42.72623,
                            "longitude": -84.44801
                        },
                        "transactions":
                        [
                            "pickup",
                            "delivery"
                        ],
                        "price": "$$",
                        "location":
                        {
                            "address1": "2650 E Grand River Ave",
                            "address2": "",
                            "address3": "",
                            "city": "East Lansing",
                            "zip_code": "48823",
                            "country": "US",
                            "state": "MI",
                            "display_address":
                            [
                                "2650 E Grand River Ave",
                                "East Lansing, MI 48823"
                            ]
                        },
                        "phone": "+15178891799",
                        "display_phone": "(517) 889-1799",
                        "distance": 9854.161659461644
                    }
                ]
            }
        },
        {
            "karaoke":
            {
                "total": 1,
                "businesses":
                [
                    {
                        "closed": false,
                        "id": "b1JCgQPrg6YjKOsMbBLYNg",
                        "alias": "limit-kitchen-and-bar-east-lansing",
                        "name": "Limit Kitchen & Bar",
                        "image_url": "https://s3-media4.fl.yelpcdn.com/bphoto/BmwZMI864MdSwEEKyP-wsA/o.jpg",
                        "is_closed": false,
                        "url": "https://www.yelp.com/biz/limit-kitchen-and-bar-east-lansing?adjust_creative=J_BflFlLyenw_jW6Q_Wrgg&utm_campaign=yelp_api_v3&utm_medium=api_v3_business_search&utm_source=J_BflFlLyenw_jW6Q_Wrgg",
                        "review_count": 7,
                        "categories":
                        [
                            {
                                "alias": "karaoke",
                                "title": "Karaoke"
                            },
                            {
                                "alias": "chinese",
                                "title": "Chinese"
                            }
                        ],
                        "rating": 4.5,
                        "coordinates":
                        {
                            "latitude": 42.72826,
                            "longitude": -84.454461
                        },
                        "transactions":
                        [
                            "pickup",
                            "delivery"
                        ],
                        "price": null,
                        "location":
                        {
                            "address1": "2800 E Grand River Ave",
                            "address2": "Ste D",
                            "address3": null,
                            "city": "East Lansing",
                            "zip_code": "48823",
                            "country": "US",
                            "state": "MI",
                            "display_address":
                            [
                                "2800 E Grand River Ave",
                                "Ste D",
                                "East Lansing, MI 48823"
                            ]
                        },
                        "phone": "+15176642565",
                        "display_phone": "(517) 664-2565",
                        "distance": 9314.852732938543
                    }
                ]
            }
        },
        {
            "bubbletea":
            {
                "total": 1,
                "businesses":
                [
                    {
                        "closed": false,
                        "id": "aQr-rYsV1dkB0wB2OHC9YA",
                        "alias": "hongs-cafe-east-lansing",
                        "name": "Hong's Cafe",
                        "image_url": "https://s3-media3.fl.yelpcdn.com/bphoto/8gY6PY_um-4MK5yBonKgnQ/o.jpg",
                        "is_closed": false,
                        "url": "https://www.yelp.com/biz/hongs-cafe-east-lansing?adjust_creative=J_BflFlLyenw_jW6Q_Wrgg&utm_campaign=yelp_api_v3&utm_medium=api_v3_business_search&utm_source=J_BflFlLyenw_jW6Q_Wrgg",
                        "review_count": 18,
                        "categories":
                        [
                            {
                                "alias": "bubbletea",
                                "title": "Bubble Tea"
                            },
                            {
                                "alias": "chinese",
                                "title": "Chinese"
                            }
                        ],
                        "rating": 4.0,
                        "coordinates":
                        {
                            "latitude": 42.757143,
                            "longitude": -84.4640809
                        },
                        "transactions":
                        [
                            "delivery"
                        ],
                        "price": "$$",
                        "location":
                        {
                            "address1": "3030 E Lake Lansing Rd",
                            "address2": "",
                            "address3": "",
                            "city": "East Lansing",
                            "zip_code": "48823",
                            "country": "US",
                            "state": "MI",
                            "display_address":
                            [
                                "3030 E Lake Lansing Rd",
                                "East Lansing, MI 48823"
                            ]
                        },
                        "phone": "+15173326688",
                        "display_phone": "(517) 332-6688",
                        "distance": 9120.31542435394
                    }
                ]
            }
        }
    ]
}
```

## GET /searchRerankFilterLocationCategory

Search all businesses that is in a location with a specified category. Rerank them in a descending order using a new ranking such that $new\_rating = rating \times review\_count$.

### Example request and response

#### Request

```bash
curl "localhost:8080/searchRerankFilterLocationCategory?location=Lansing&categories=hotpot"
```

#### Response

```json
{
    "searchCategory": "hotpot",
    "total": 3,
    "region":
    {
        "center":
        {
            "latitude": 42.72830621179706,
            "longitude": -84.56863403320312
        }
    },
    "searchLocation": "Lansing",
    "businesses":
    [
        {
            "closed": false,
            "id": "vBNWEG1sct6mmFc3mllwPA",
            "alias": "boiling-pots-east-lansing",
            "name": "Boiling Pots",
            "image_url": "https://s3-media3.fl.yelpcdn.com/bphoto/1d8zZNwLgYfL1zjpyYcoBQ/o.jpg",
            "is_closed": false,
            "url": "https://www.yelp.com/biz/boiling-pots-east-lansing?adjust_creative=J_BflFlLyenw_jW6Q_Wrgg&utm_campaign=yelp_api_v3&utm_medium=api_v3_business_search&utm_source=J_BflFlLyenw_jW6Q_Wrgg",
            "review_count": 92,
            "categories":
            [
                {
                    "alias": "chinese",
                    "title": "Chinese"
                },
                {
                    "alias": "hotpot",
                    "title": "Hot Pot"
                },
                {
                    "alias": "taiwanese",
                    "title": "Taiwanese"
                }
            ],
            "rating": 4.0,
            "coordinates":
            {
                "latitude": 42.72623,
                "longitude": -84.44801
            },
            "transactions":
            [
                "pickup",
                "delivery"
            ],
            "price": "$$",
            "location":
            {
                "address1": "2650 E Grand River Ave",
                "address2": "",
                "address3": "",
                "city": "East Lansing",
                "zip_code": "48823",
                "country": "US",
                "state": "MI",
                "display_address":
                [
                    "2650 E Grand River Ave",
                    "East Lansing, MI 48823"
                ]
            },
            "phone": "+15178891799",
            "display_phone": "(517) 889-1799",
            "distance": 9854.161659461644
        },
        {
            "closed": false,
            "id": "jDO7O7dGf1oLQD_CqWTxUA",
            "alias": "royal-pot-east-lansing-2",
            "name": "Royal Pot",
            "image_url": "https://s3-media4.fl.yelpcdn.com/bphoto/mjPFo16pbY8kmC4MscLMNg/o.jpg",
            "is_closed": false,
            "url": "https://www.yelp.com/biz/royal-pot-east-lansing-2?adjust_creative=J_BflFlLyenw_jW6Q_Wrgg&utm_campaign=yelp_api_v3&utm_medium=api_v3_business_search&utm_source=J_BflFlLyenw_jW6Q_Wrgg",
            "review_count": 79,
            "categories":
            [
                {
                    "alias": "hotpot",
                    "title": "Hot Pot"
                }
            ],
            "rating": 4.0,
            "coordinates":
            {
                "latitude": 42.719489,
                "longitude": -84.461112
            },
            "transactions":
            [
                "pickup",
                "delivery"
            ],
            "price": "$$",
            "location":
            {
                "address1": "4750 S Hagadorn Rd",
                "address2": "Ste 40",
                "address3": null,
                "city": "East Lansing",
                "zip_code": "48823",
                "country": "US",
                "state": "MI",
                "display_address":
                [
                    "4750 S Hagadorn Rd",
                    "Ste 40",
                    "East Lansing, MI 48823"
                ]
            },
            "phone": "+15174832780",
            "display_phone": "(517) 483-2780",
            "distance": 8833.59445677508
        },
        {
            "closed": false,
            "id": "XtXYQ5ZcMx4DP8zvFvCE1A",
            "alias": "hot-pot-chen-ann-arbor",
            "name": "Hot Pot Chen",
            "image_url": "https://s3-media3.fl.yelpcdn.com/bphoto/8nDjbuSEVfYYoSeRZc9p6A/o.jpg",
            "is_closed": false,
            "url": "https://www.yelp.com/biz/hot-pot-chen-ann-arbor?adjust_creative=J_BflFlLyenw_jW6Q_Wrgg&utm_campaign=yelp_api_v3&utm_medium=api_v3_business_search&utm_source=J_BflFlLyenw_jW6Q_Wrgg",
            "review_count": 46,
            "categories":
            [
                {
                    "alias": "chinese",
                    "title": "Chinese"
                },
                {
                    "alias": "hotpot",
                    "title": "Hot Pot"
                }
            ],
            "rating": 2.5,
            "coordinates":
            {
                "latitude": 42.2751,
                "longitude": -83.7784
            },
            "transactions":
            [
                "delivery"
            ],
            "price": "$",
            "location":
            {
                "address1": "2255 W Stadium Blvd",
                "address2": "",
                "address3": null,
                "city": "Ann Arbor",
                "zip_code": "48103",
                "country": "US",
                "state": "MI",
                "display_address":
                [
                    "2255 W Stadium Blvd",
                    "Ann Arbor, MI 48103"
                ]
            },
            "phone": "+17346688389",
            "display_phone": "(734) 668-8389",
            "distance": 82119.49160797766
        }
    ]
}
```

