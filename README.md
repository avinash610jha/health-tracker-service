## Health tracker service

It has three important branch 
main - final code 
basDeployment - the things i am trying on Bas, also has the progress detail on it
localDeployment - the things that i am trying locally

Idea of these two extra branch is to safe guard the code, as i am still learning bas-git and in case if i delete a code by mistake and also merge it to main, i should still have it in local deployment branch.

these two branch do not have much difference and has mainly impact on application yaml, so later on we will get rid of these two separate branch. maybe we can rename these branch as backup 1, backup 2 - local 

Current Status
1. I am stuck at connecting my front end code to backend code due to authorization issue.
- tried bas local to local connection, using ui5 tooliing, however it is failing at authorisation. Bas cap template backend service enables spring security because of which it requires an authentication. infact calling any rest endoint non-odata, it requires basic authentication. This is causing issue in connecting  app locally, as can be seen below a basic authentication is passed.
- i have overwritten the security by providing my user and password but unable to set this up when being called from ui project.

   <img width="999" alt="image" src="https://user-images.githubusercontent.com/48620270/235640961-a1114111-49e0-4a80-864b-b0494199d802.png">
   
 - also tried deploying backend service to btp-trial account. here i am stuck at creating hana-db instance.
 - third option i have is not use bas, but locally in my machine, i run both my backend and front end project and see if that works
 
 
 2. Other plan is ui5 project - i can work on o-data v4 changes by integrating northwind services and for backend services - i can work separately on health tracker-service
 


