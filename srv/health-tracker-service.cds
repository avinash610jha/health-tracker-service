using com.ajha.ht as ht from '../db/health-tracker-data-model';


service HealthTrackerService {
    @readonly entity symptoms as projection on ht.Symptoms;
}