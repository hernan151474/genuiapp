package com.example.genuiapp;

public class Constants {
    // nombre base de datos
    public static final String DB_NAME = "My_RECORDS_DB";
    //version de base de datos
<<<<<<< HEAD
    public static final int DB_VERSION = 2;
=======
    public static final int DB_VERSION = 1;
>>>>>>> 3ed99b4e26ec53417f60b02b54a1aa1f73f5026e
    //nombre de la tabla
    public static final String TABLE_NAME = "MY_RECORDS_TABLE";
    public static final String TABLE_USER = "USER";
    //columnas/campos de la tabla
    public static final String C_USER = "USER";
    public static final String C_PASSWORD = "PASSWORD";
    public static final String C_ID = "ID";
    public static final String C_NAME = "NOMBRE";
    public static final String C_CATE= "CATEGORIA";
    public static final String C_MODA = "MODALIDAD_DE_SERVICIO";
    public static final String C_MODA_ATE = "MODALIDAD_DE_ATENCION";
    public static final String C_DELI= "DELIVERY";
    public static final String C_PRODUC ="PRODUCTO";
    public static final String C_DIRE = "DIRECCION";
    public static final String C_LOCA = "LOCALIDAD";
    public static final String C_ZONA = "ZONA_DE_LA_LOCALIDAD";
    public static final String C_PHONE = "PHONE";
    public static final String C_FACE = "FACEBOOK";
    public static final String C_INSTA = "INSTAGRAM";
    public static final String C_LINKE = "LINKEDLN";
    public static final String C_DESCRI = "DESCRIPCION";
    public static  final String C_IMAGE = "IMAGE";
    public static final String C_ADDED_TIMESTAMP = "ADDED_TIME_STAMP";
    public static final String C_UPDATED_TIMESTAMP = "UPDATED_TIME_STAMP";


    //Crea la tabla Query
    public static  final String CREATE_TABLE = "CREATE TABLE " + TABLE_NAME +"("
            + C_ID+ " INTEGER PRIMARY KEY,"
            + C_NAME+ " TEXT,"
            + C_CATE+ " TEXT,"
            + C_MODA+ " TEXT,"
            + C_MODA_ATE+ " TEXT,"
<<<<<<< HEAD
            + C_DELI+ " TEXT,"
            + C_PRODUC+ " TEXT,"
=======
            +C_DELI+ "BOOLEAN,"
            +C_PRODUC+ "TEXT,"
>>>>>>> 3ed99b4e26ec53417f60b02b54a1aa1f73f5026e
            + C_DIRE+ " TEXT,"
            + C_LOCA+ " TEXT,"
            + C_ZONA+ " TEXT,"
            + C_PHONE+ " TEXT,"
            + C_FACE+ " TEXT,"
            + C_INSTA+ " TEXT,"
            + C_LINKE+ " TEXT,"
            + C_DESCRI+ " TEXT,"
            + C_IMAGE+ " TEXT,"
            + C_ADDED_TIMESTAMP+ " TEXT,"
            + C_UPDATED_TIMESTAMP+ " TEXT"
            + ")";

<<<<<<< HEAD
    public static final String CREATE_TABLE1 = "CREATE TABLE" + TABLE_USER +"("
            + C_ID+ " INTEGER PRIMARY KEY,"
            + C_USER+ " TEXT,"
            + C_PASSWORD+ " TEXT"
            + ")";
=======
    public static final String CREATE_USER = "CREATE TABLE" + TABLE_USER +"("
            +C_ID + "INTEGER PRIMARY KEY,"
            +C_USER + "TEXT,"
            +C_PASSWORD+ "TEXT"
            +")";
>>>>>>> 3ed99b4e26ec53417f60b02b54a1aa1f73f5026e
}


