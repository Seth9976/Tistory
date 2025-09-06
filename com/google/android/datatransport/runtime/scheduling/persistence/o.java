package com.google.android.datatransport.runtime.scheduling.persistence;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import java.util.Arrays;
import java.util.List;
import kotlin.text.q;

public final class o extends SQLiteOpenHelper {
    public final int a;
    public boolean b;
    public static final String c;
    public static final int d;
    public static final List e;

    static {
        o.c = "INSERT INTO global_log_event_state VALUES (" + System.currentTimeMillis() + ")";
        o.d = 5;
        o.e = Arrays.asList(new SchemaManager.Migration[]{new n(0), new n(1), new n(2), new n(3), new n(4)});
    }

    public o(Context context0, String s, int v) {
        super(context0, s, null, v);
        this.b = false;
        this.a = v;
    }

    public static void a(SQLiteDatabase sQLiteDatabase0, int v, int v1) {
        List list0 = o.e;
        if(v1 <= list0.size()) {
            while(v < v1) {
                ((SchemaManager.Migration)list0.get(v)).upgrade(sQLiteDatabase0);
                ++v;
            }
            return;
        }
        StringBuilder stringBuilder0 = q.u("Migration from ", v, " to ", v1, " was requested, but cannot be performed. Only ");
        stringBuilder0.append(list0.size());
        stringBuilder0.append(" migrations are provided");
        throw new IllegalArgumentException(stringBuilder0.toString());
    }

    @Override  // android.database.sqlite.SQLiteOpenHelper
    public final void onConfigure(SQLiteDatabase sQLiteDatabase0) {
        this.b = true;
        sQLiteDatabase0.rawQuery("PRAGMA busy_timeout=0;", new String[0]).close();
        sQLiteDatabase0.setForeignKeyConstraintsEnabled(true);
    }

    @Override  // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase0) {
        if(!this.b) {
            this.onConfigure(sQLiteDatabase0);
        }
        o.a(sQLiteDatabase0, 0, this.a);
    }

    @Override  // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase0, int v, int v1) {
        sQLiteDatabase0.execSQL("DROP TABLE events");
        sQLiteDatabase0.execSQL("DROP TABLE event_metadata");
        sQLiteDatabase0.execSQL("DROP TABLE transport_contexts");
        sQLiteDatabase0.execSQL("DROP TABLE IF EXISTS event_payloads");
        sQLiteDatabase0.execSQL("DROP TABLE IF EXISTS log_event_dropped");
        sQLiteDatabase0.execSQL("DROP TABLE IF EXISTS global_log_event_state");
        if(!this.b) {
            this.onConfigure(sQLiteDatabase0);
        }
        o.a(sQLiteDatabase0, 0, v1);
    }

    @Override  // android.database.sqlite.SQLiteOpenHelper
    public final void onOpen(SQLiteDatabase sQLiteDatabase0) {
        if(!this.b) {
            this.onConfigure(sQLiteDatabase0);
        }
    }

    @Override  // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase0, int v, int v1) {
        if(!this.b) {
            this.onConfigure(sQLiteDatabase0);
        }
        o.a(sQLiteDatabase0, v, v1);
    }
}

