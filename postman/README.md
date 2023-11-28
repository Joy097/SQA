# Api Testing Project

## Prerequisite
- Node JS

## Functionalities
1. Admin creates an agent and random 2 customers.
2. Deposit some money from SYSTEM account to the agent. System account: SYSTEM (range 10 tk to 10000 tk)
3. Agent deposit to any of 1 customer
4. Check agent balance
5. Then withdraw any amount by the customer from the agent (range 10 tk to 10000 tk)
6. Then the customer checks balance
7. Then send money to the other customer
8. Then from the another customer payment to this merchant: 01686606905
9. Then the second customer will check both balance and statement
10. Then the merchant will check his own balance

## About
This is a postman collection project with different test cases using dummy fintech apis. My main mototive is to execute the above functionalities and testing the apis behind these operations. Basically I chained multiple APIs in postman and generated a report using newman.

## How to run this project ?
1. Create a clone of this project:
    ```https://github.com/Joy097/SQA/tree/master/postman```
2. Give following command in the source root project:   
    ```npm i```
3. Start the project by writing:   
```npm start```

## Report
![11](https://github.com/Joy097/SQA/assets/69787432/bd28d1da-6fa4-4505-9e10-96a8eb80d9a5)

![screencapture-127-0-0-1-5500-postman-Reports-report-html-2023-11-29-01_07_55](https://github.com/Joy097/SQA/assets/69787432/49a3fdaa-5191-4e81-a848-4711034f7227)

