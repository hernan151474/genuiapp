package com.example.genuiapp;

import android.annotation.SuppressLint;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

import java.util.ArrayList;

// Clase DataBase Helper que contiene todos los métodos crud
public class MyDbHelper extends SQLiteOpenHelper {

    public MyDbHelper(@Nullable Context context) {
        super(context, Constants.DB_NAME, null, Constants.DB_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db){
        //Crea la tabla de la base de datos
        db.execSQL(Constants.CREATE_TABLE);
        db.execSQL(Constants.CREATE_USER);

    }
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion){


        // actualizar la base de datos (si hay alguna estructura, cambie la versión de db)

        //descartar la tabla anterior si existe
        db.execSQL("DROP TABLE IF EXISTS "+ Constants.TABLE_NAME);


        //crear tabla de nuevo
        onCreate(db);
    }

    public long insertUser(String user, String password) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();

        values.put(Constants.C_USER, user);
        values.put(Constants.C_PASSWORD, password);

        long id=db.insert(Constants.TABLE_USER,null, values);
        db.close();

        return id;
    }

    //Inserta datos a la base de datos
    public long insertRecord(String name, String cate, String moda, String moda_ate, String deli, String produc, String dire, String loca,
                             String zona, String phone, String face, String insta, String linke, String descri, String image, String addedTime, String updatedTime){

        //get databse grabable porque queremos escribir datos

        SQLiteDatabase db =this.getWritableDatabase();

        ContentValues values = new ContentValues();


        // la identificación se insertará automáticamente cuando configuremos AUTOINCREMENTO en la consulta

        // inserta datos
        values.put(Constants.C_NAME, name);
        values.put(Constants.C_CATE, cate);
        values.put(Constants.C_MODA, moda);
        values.put(Constants.C_MODA_ATE, moda_ate);
        values.put(Constants.C_DELI, deli);
        values.put(Constants.C_PRODUC, produc);
        values.put(Constants.C_DIRE, dire);
        values.put(Constants.C_LOCA, loca);
        values.put(Constants.C_ZONA, zona);
        values.put(Constants.C_PHONE, phone);
        values.put(Constants.C_FACE, face);
        values.put(Constants.C_INSTA, insta);
        values.put(Constants.C_LINKE, linke);
        values.put(Constants.C_DESCRI, descri);
        values.put(Constants.C_IMAGE, image);
        values.put(Constants.C_ADDED_TIMESTAMP, addedTime);
        values.put(Constants.C_UPDATED_TIMESTAMP, updatedTime);

        // insertar fila, devolverá la identificación del registro guardado
        long id = db.insert(Constants.TABLE_NAME, null, values);


        // cerrar db Connection
        db.close();



        // devuelve la identificación del registro insertado

        // devuelve la identificación del registro insertado

        return id;

    }

    //Obtener todos datos
    public ArrayList<ModelRecord> getAllRecords(String orderBy){
        // la orden de consulta permitirá ordenar los datos más nuevo / más antiguo primero, nombre ascendente / descendente
        // devolverá la lista o registros ya que hemos utilizado return tipo ArrayList <ModelRecord>

        ArrayList<ModelRecord> recordsList = new ArrayList<>();
        // consulta para seleccionar registros
        String selectQuery = " SELECT * FROM " + Constants.TABLE_NAME + " ORDER BY " + orderBy;

        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cursor = db.rawQuery(selectQuery, null);

        // recorrer todos los registros y agregarlos a la lista
        if ( cursor.moveToFirst()){
            do {

                @SuppressLint("Range") ModelRecord modelRecord = new ModelRecord(
                        ""+cursor.getInt(cursor.getColumnIndex(Constants.C_ID)),
                        ""+cursor.getString(cursor.getColumnIndex(Constants.C_NAME)),
                        ""+cursor.getString(cursor.getColumnIndex(Constants.C_CATE)),
                        ""+cursor.getString(cursor.getColumnIndex(Constants.C_MODA)),
                        ""+cursor.getString(cursor.getColumnIndex(Constants.C_MODA_ATE)),
                        ""+cursor.getString(cursor.getColumnIndex(Constants.C_DELI)),
                        ""+cursor.getString(cursor.getColumnIndex(Constants.C_PRODUC)),
                        ""+cursor.getString(cursor.getColumnIndex(Constants.C_DIRE)),
                        ""+cursor.getString(cursor.getColumnIndex(Constants.C_LOCA)),
                        ""+cursor.getString(cursor.getColumnIndex(Constants.C_ZONA)),
                        ""+cursor.getString(cursor.getColumnIndex(Constants.C_PHONE)),
                        ""+cursor.getString(cursor.getColumnIndex(Constants.C_FACE)),
                        ""+cursor.getString(cursor.getColumnIndex(Constants.C_INSTA)),
                        ""+cursor.getString(cursor.getColumnIndex(Constants.C_LINKE)),
                        ""+cursor.getString(cursor.getColumnIndex(Constants.C_DESCRI)),
                        ""+cursor.getString(cursor.getColumnIndex(Constants.C_IMAGE)),
                        ""+cursor.getString(cursor.getColumnIndex(Constants.C_ADDED_TIMESTAMP)),
                        ""+cursor.getString(cursor.getColumnIndex(Constants.C_UPDATED_TIMESTAMP)));

                // Añadir registro a la list
                recordsList.add(modelRecord);
            }while (cursor.moveToNext());
        }

        //cierre de conexión db

        db.close();

        //retorna la lista
        return recordsList;
    }

    //Buscar todos datos
    public ArrayList<ModelRecord> searchRecords(String query){
        // la orden de consulta permitirá ordenar los datos más nuevo / más antiguo primero, nombre ascendente / descendente
        // devolverá la lista o registros ya que hemos utilizado return tipo ArrayList <ModelRecord>

        ArrayList<ModelRecord> recordsList = new ArrayList<>();
        // consulta para seleccionar registros
        String selectQuery = " SELECT * FROM " + Constants.TABLE_NAME + " WHERE " + Constants.C_NAME + " LIKE '%" + query +"%'";

        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cursor = db.rawQuery(selectQuery, null);

        // recorrer todos los registros y agregarlos a la lista
        if ( cursor.moveToFirst()){
            do {

                @SuppressLint("Range") ModelRecord modelRecord = new ModelRecord(
                        ""+cursor.getInt(cursor.getColumnIndex(Constants.C_ID)),
                        ""+cursor.getString(cursor.getColumnIndex(Constants.C_NAME)),
                        ""+cursor.getString(cursor.getColumnIndex(Constants.C_CATE)),
                        ""+cursor.getString(cursor.getColumnIndex(Constants.C_MODA)),
                        ""+cursor.getString(cursor.getColumnIndex(Constants.C_MODA_ATE)),
                        ""+cursor.getString(cursor.getColumnIndex(Constants.C_DELI)),
                        ""+cursor.getString(cursor.getColumnIndex(Constants.C_PRODUC)),
                        ""+cursor.getString(cursor.getColumnIndex(Constants.C_DIRE)),
                        ""+cursor.getString(cursor.getColumnIndex(Constants.C_LOCA)),
                        ""+cursor.getString(cursor.getColumnIndex(Constants.C_ZONA)),
                        ""+cursor.getString(cursor.getColumnIndex(Constants.C_PHONE)),
                        ""+cursor.getString(cursor.getColumnIndex(Constants.C_FACE)),
                        ""+cursor.getString(cursor.getColumnIndex(Constants.C_INSTA)),
                        ""+cursor.getString(cursor.getColumnIndex(Constants.C_LINKE)),
                        ""+cursor.getString(cursor.getColumnIndex(Constants.C_DESCRI)),
                        ""+cursor.getString(cursor.getColumnIndex(Constants.C_IMAGE)),
                        ""+cursor.getString(cursor.getColumnIndex(Constants.C_ADDED_TIMESTAMP)),
                        ""+cursor.getString(cursor.getColumnIndex(Constants.C_UPDATED_TIMESTAMP)));

                // Añadir registro a la list
                recordsList.add(modelRecord);
            }while (cursor.moveToNext());
        }

        //cierre de conexión db

        db.close();

        //retorna la lista
        return recordsList;
    }

    //Obtener el numero de registros
    public int getRecordsCount(){
        String countQuery = " SELECT * FROM " + Constants.TABLE_NAME;
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.rawQuery(countQuery, null);

        int count = cursor.getCount();

        cursor.close();

        return count;
    }



}
