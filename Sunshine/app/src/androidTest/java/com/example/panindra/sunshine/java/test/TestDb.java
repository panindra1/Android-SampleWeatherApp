package com.example.panindra.sunshine.java.test;

import android.database.sqlite.SQLiteDatabase;
import android.test.AndroidTestCase;
import com.example.panindra.sunshine.data.WeatherContract.LocationEntry;
import com.example.panindra.sunshine.data.WeatherContract.WeatherEntry;
import com.example.panindra.sunshine.data.WeatherDbHelper;

/**
 * Created by panindra on 1/11/15.
 */
public class TestDb extends AndroidTestCase {

    public static final String LOG_TAG = TestDb.class.getSimpleName();

    public void testCreateDb() throws Throwable {
        mContext.deleteDatabase(WeatherDbHelper.DATABASE_NAME);
        SQLiteDatabase db = new WeatherDbHelper(
                this.mContext).getWritableDatabase();
        assertEquals(true, db.isOpen());
        db.close();
    }
}
