namespace com.ajha.ht;

using {
  cuid,
  managed
} from '@sap/cds/common';

entity Users : cuid {
    name : String(255);
    email: String(255);
    phone: String(255);
}

entity Symptoms : cuid {
  userID : UUID;
  name  : String;
  since  : String;
  stat: String;
}

entity Consultation: cuid {
    symptomID: UUID;
    consultationDate: String;
    diagnosis: String;
    doctor: String;
    stat: String;
    followUp: String;
    comment: String;
}

entity Tasks: cuid {
    symptomID: UUID;
    consultationId: UUID;
    category: String;
    title: String;
    detail: String;
    dueDate: String;
    isReminder: Boolean;
    stat: String
}