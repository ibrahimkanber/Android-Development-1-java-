package com.ibrahim.sqliteproject;

import androidx.appcompat.app.AppCompatActivity;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        try {
            SQLiteDatabase database=this.openOrCreateDatabase("Musicians",MODE_PRIVATE,null);
            database.execSQL("CREATE TABLE IF NOT EXISTS musicians (id INTEGER PRIMARY KEY,  name VARCHAR,age INT)");
            //database.execSQL("INSERT INTO musicians (name,age) VALUES('James',60)");
            //database.execSQL("INSERT INTO musicians (name,age) VALUES('Lars',60)");
            //database.execSQL("INSERT INTO musicians (name,age) VALUES('Kirk',55)");
            //Cursor cursor =database.rawQuery("SELECT * FROM musicians WHERE name='James'",null);
            //database.execSQL("UPDATE musicians SET age=61 WHERE name='James'");
            //database.execSQL("DELETE FROM musicians WHERE id=2");
            //Cursor cursor =database.rawQuery("SELECT * FROM musicians WHERE name LIKE '%s'",null);
            //Cursor cursor =database.rawQuery("SELECT * FROM musicians WHERE name LIKE 'k%'",null);
            Cursor cursor =database.rawQuery("SELECT * FROM musicians",null);
            int nameIndex=cursor.getColumnIndex("name");
            int ageIndex=cursor.getColumnIndex("age");
            int idIndex=cursor.getColumnIndex("id");
            while (cursor.moveToNext()){
                System.out.println("Name  "+cursor.getString(nameIndex));
                System.out.println("age  "+cursor.getInt(ageIndex));
                System.out.println("id  "+cursor.getInt(idIndex));

            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}