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
![report](https://github.com/Joy097/SQA/assets/69787432/d0a913a9-2a8b-4f3c-9686-34303074ba6a)

![report1](https://github.com/Joy097/SQA/assets/69787432/f4b9ee05-611c-4dab-b4d5-88929e4e27ae)