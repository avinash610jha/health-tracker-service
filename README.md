## Health Tracker Service (deployed on BTP)

### Functional Background
To create a service which helps track my personal health reports

### Technical Background
Using this service: 
1) Achieve CAP based multi-tenant BTP Application
2) create non-cap APIs
3) deployment on BTP
4) Integration with static UI projects

### Working Model
It has three important branch:
1. main - productive code 
2. backup/basDeployment - branch for trying out things on BAS, also has the progress detail on it
3. backup/localDeployment - branch for trying out things locally

_idea here is not to lose back-ups, and understand working model with different branches_

On a regular interval, these two branches are pushed/merged/synced with main, 
and hence do not have much difference.

This is also used to create small PoC
1. how to use API versioning using CAP [link](https://sap-my.sharepoint.com/:v:/p/avinash_jha/EYPD7N2wenhEqNfjWfPcrBsBegc_1WN3xMS_uvrOH9ajtw?e=eKvtIb)
2. how to set up configuration db, that is non transacional db where the db data is added as csv file

### In-Progress

1. Adding a Database connection

- Create a db hdi container in BTP. 
- Add the instance manager to above service in manifest or mta.yaml
- deploy the service to BTP provider account

2. Fix below authorization issue for local connection ui to backend app.

   <img width="999" alt="image" src="https://user-images.githubusercontent.com/48620270/235640961-a1114111-49e0-4a80-864b-b0494199d802.png">

 ### Related UI5 project

Sample [UI5 project](https://github.com/avinash610jha/health-tracker-ui) using northwind service as backend service.



