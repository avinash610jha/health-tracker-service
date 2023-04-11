using com.ajha.ht as ht from '../db/health-tracker-data-model';


service HealthTrackerService {
   entity users as projection on ht.Users; 
   entity symptoms as projection on ht.Symptoms;
   entity consultation as projection on ht.Consultation;
   entity displayUsers @readonly as projection on ht.Users{
       name, email,phone
   }
   entity viewSymptoms @readonly as projection on ht.Symptoms{
       name, stat, since
   };
   entity tasks @readonly as projection on ht.Tasks { title, category}; 

}