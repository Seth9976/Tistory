package d3;

import android.database.CursorWindow;
import androidx.annotation.DoNotInline;

public abstract class a {
    @DoNotInline
    public static CursorWindow a(String s, long v) {
        return new CursorWindow(s, v);
    }
}

