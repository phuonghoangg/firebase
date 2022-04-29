package com.example.firebasebasic;

import com.google.android.gms.tasks.Task;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class EmployeeDAO {
    private DatabaseReference dbReference;
    public EmployeeDAO(){
        FirebaseDatabase db = FirebaseDatabase.getInstance();
        dbReference = db.getReference(com.example.firebase_1.Employee.class.getSimpleName());
    }
    public Task<Void> add(com.example.firebase_1.Employee emp){
//        if(emp == null){
            return dbReference.push().setValue(emp);
    }
}
