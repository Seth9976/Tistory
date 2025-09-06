package com.google.android.datatransport.runtime.scheduling.persistence;

import android.database.sqlite.SQLiteDatabase;

public final class n implements SchemaManager.Migration {
    public final int a;

    public n(int v) {
        this.a = v;
        super();
    }

    @Override  // com.google.android.datatransport.runtime.scheduling.persistence.SchemaManager$Migration
    public final void upgrade(SQLiteDatabase sQLiteDatabase0) {
        switch(this.a) {
            case 0: {
                sQLiteDatabase0.execSQL("CREATE TABLE events (_id INTEGER PRIMARY KEY, context_id INTEGER NOT NULL, transport_name TEXT NOT NULL, timestamp_ms INTEGER NOT NULL, uptime_ms INTEGER NOT NULL, payload BLOB NOT NULL, code INTEGER, num_attempts INTEGER NOT NULL,FOREIGN KEY (context_id) REFERENCES transport_contexts(_id) ON DELETE CASCADE)");
                sQLiteDatabase0.execSQL("CREATE TABLE event_metadata (_id INTEGER PRIMARY KEY, event_id INTEGER NOT NULL, name TEXT NOT NULL, value TEXT NOT NULL,FOREIGN KEY (event_id) REFERENCES events(_id) ON DELETE CASCADE)");
                sQLiteDatabase0.execSQL("CREATE TABLE transport_contexts (_id INTEGER PRIMARY KEY, backend_name TEXT NOT NULL, priority INTEGER NOT NULL, next_request_ms INTEGER NOT NULL)");
                sQLiteDatabase0.execSQL("CREATE INDEX events_backend_id on events(context_id)");
                sQLiteDatabase0.execSQL("CREATE UNIQUE INDEX contexts_backend_priority on transport_contexts(backend_name, priority)");
                return;
            }
            case 1: {
                sQLiteDatabase0.execSQL("ALTER TABLE transport_contexts ADD COLUMN extras BLOB");
                sQLiteDatabase0.execSQL("CREATE UNIQUE INDEX contexts_backend_priority_extras on transport_contexts(backend_name, priority, extras)");
                sQLiteDatabase0.execSQL("DROP INDEX contexts_backend_priority");
                return;
            }
            case 2: {
                sQLiteDatabase0.execSQL("ALTER TABLE events ADD COLUMN payload_encoding TEXT");
                return;
            }
            case 3: {
                sQLiteDatabase0.execSQL("ALTER TABLE events ADD COLUMN inline BOOLEAN NOT NULL DEFAULT 1");
                sQLiteDatabase0.execSQL("DROP TABLE IF EXISTS event_payloads");
                sQLiteDatabase0.execSQL("CREATE TABLE event_payloads (sequence_num INTEGER NOT NULL, event_id INTEGER NOT NULL, bytes BLOB NOT NULL,FOREIGN KEY (event_id) REFERENCES events(_id) ON DELETE CASCADE,PRIMARY KEY (sequence_num, event_id))");
                return;
            }
            default: {
                sQLiteDatabase0.execSQL("DROP TABLE IF EXISTS log_event_dropped");
                sQLiteDatabase0.execSQL("DROP TABLE IF EXISTS global_log_event_state");
                sQLiteDatabase0.execSQL("CREATE TABLE log_event_dropped (log_source VARCHAR(45) NOT NULL,reason INTEGER NOT NULL,events_dropped_count BIGINT NOT NULL,PRIMARY KEY(log_source, reason))");
                sQLiteDatabase0.execSQL("CREATE TABLE global_log_event_state (last_metrics_upload_ms BIGINT PRIMARY KEY)");
                sQLiteDatabase0.execSQL("INSERT INTO global_log_event_state VALUES (1757117296998)");
            }
        }
    }
}

