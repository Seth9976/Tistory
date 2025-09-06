package e;

import android.database.Cursor;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import java.util.concurrent.Callable;

public final class n implements Callable {
    public final RoomSQLiteQuery a;
    public final p b;

    public n(p p0, RoomSQLiteQuery roomSQLiteQuery0) {
        this.b = p0;
        this.a = roomSQLiteQuery0;
        super();
    }

    @Override
    public final Object call() {
        q q0 = null;
        Cursor cursor0 = DBUtil.query(this.b.a, this.a, false, null);
        try {
            int v1 = CursorUtil.getColumnIndexOrThrow(cursor0, "id");
            int v2 = CursorUtil.getColumnIndexOrThrow(cursor0, "uri");
            int v3 = CursorUtil.getColumnIndexOrThrow(cursor0, "step");
            int v4 = CursorUtil.getColumnIndexOrThrow(cursor0, "lastUpdatedTime");
            int v5 = CursorUtil.getColumnIndexOrThrow(cursor0, "json");
            if(cursor0.moveToFirst()) {
                q0 = new q(cursor0.getLong(v1), cursor0.getString(v2), cursor0.getInt(v3), cursor0.getLong(v4), cursor0.getString(v5));
            }
            return q0;
        }
        finally {
            cursor0.close();
            this.a.release();
        }
    }
}

