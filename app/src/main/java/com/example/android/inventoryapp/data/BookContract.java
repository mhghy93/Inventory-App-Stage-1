package com.example.android.inventoryapp.data;

import android.provider.BaseColumns;

/**
 * API Contract for the Book Store App.
 */
public final class BookContract {

    // To prevent someone from accidentally instantiating the contract class,
    // give it an empty constructor.
    private BookContract() {

    }

    /**
     * Inner class that defines constant values for the books database table.
     * Each entry in the table represents a single book.
     */
    public static final class BookEntry implements BaseColumns {

        /**
         * Name of database table for books
         */
        public final static String TABLE_NAME = "books";

        /**
         * Unique ID number for the pet (only for use in the database table).
         * <p>
         * Type: INTEGER
         */
        public final static String _ID = BaseColumns._ID;

        /**
         * Name of the product.
         * <p>
         * Type: TEXT
         */
        public final static String COLUMN_PRODUCT_NAME = "product_name";

        /**
         * Price of the product.
         * <p>
         * Type: REAL
         */
        public final static String COLUMN_PRODUCT_PRICE = "price";

        /**
         * Quantity of the product.
         * <p>
         * Type: INTEGER
         */
        public final static String COLUMN_PRODUCT_QUANTITY = "quantity";

        /**
         * Supplier Name of the product.
         * <p>
         * Type: TEXT
         */
        public final static String COLUMN_SUPPLIER_NAME = "supplier_name";

        /**
         * Supplier Phone Number of the product.
         * <p>
         * Type: TEXT
         */
        public final static String COLUMN_SUPPLER_PHONE_NUMBER = "supplier_phone_number";
    }
}
