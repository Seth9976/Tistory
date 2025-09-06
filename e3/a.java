package e3;

import android.database.sqlite.SQLiteCursor;
import androidx.annotation.DoNotInline;

public abstract class a {
    @DoNotInline
    public static void a(SQLiteCursor sQLiteCursor0, boolean z) {
        sQLiteCursor0.setFillWindowForwardOnly(z);
    }
}

