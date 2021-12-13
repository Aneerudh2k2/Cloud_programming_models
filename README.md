# Cloud Assignment 3 
## Team members
- 19C005 Aneerudh M
- 19C007 Arun M
- 19C008 Arvin Danny C S
- 19C026 Gurusaran M
## Cloud_programming_models

## Concurrency programming

- Clone the repository

```
$ git clone https://github.com/Aneerudh2k2/Cloud_programming_models.git
```

- Move to Concurrency directory

```
$ cd ./Concurrency
```

- Compile and run the java program

```
$ javac Concurrency.java
$ java Concurrency
```

- Screenshot for concurrency
  ![This is an image](https://s3.amazonaws.com/coffee-cloud.static/Assignment3_screenshots/Concurrency.jpeg)

## Reactive Programming

- Clone the repository

```
$ git clone https://github.com/Aneerudh2k2/Cloud_programming_models.git
```

- Move to reactive directory

```
$ cd ./reactive
```

- Install dependencies (Make sure you have installed typescript and nodejs)

```
$ npm install
```

- Run the program

```
$ npm start
```

- Screenshot for rxjs
  ![This is an image](https://s3.amazonaws.com/coffee-cloud.static/Assignment3_screenshots/rxjs.jpeg)

## Rest API (Using Javascript)

- Clone the repository

```
$ git clone https://github.com/Aneerudh2k2/Cloud_programming_models.git
```

- Move to Restapi directory

```
$ cd ./Restapi
```

- Install dependencies (Make sure you have installed nodejs)

```
$ npm install
```

- Run the program (Make sure you have mongodb installed in your local machine and its server running behind)

```
$ npm start
```

- Test the api

```
//Post the data in DB
curl -X POST \
  'http://localhost:9000/aliens/' \
  -H 'Content-Type: application/json' \
  -d '{
    "name" : "XYZ",
    "tech" : "AI/ML"
}'

// Output
{
    "_id": "61b633591b75c83841acce27",
    "name": "XYZ",
    "tech": "AI/ML",
    "__v": 0
}
```

```
// Check the you have added
curl -X GET \
  'http://localhost:9000/aliens/'

// Output
[
  {
    "_id": "61b62df0d07f412b1cf33d00",
    "name": "Anee",
    "tech": "Blockchain",
    "__v": 0
  },
  {
    "_id": "61b62e18d07f412b1cf33d01",
    "name": "Arun",
    "tech": "Web development",
    "__v": 0
  },
  {
    "_id": "61b62e8dd07f412b1cf33d02",
    "name": "Guru",
    "tech": "Problem solving",
    "__v": 0
  },
  {
    "_id": "61b62eacd07f412b1cf33d03",
    "name": "Arvin Danny",
    "tech": "Web development",
    "__v": 0
  },
  {
    "_id": "61b633591b75c83841acce27",
    "name": "XYZ",
    "tech": "AI/ML",
    "__v": 0
  }
]
```

---
