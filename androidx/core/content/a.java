package androidx.core.content;

import android.content.Context;
import android.graphics.drawable.Drawable;
import androidx.annotation.DoNotInline;
import java.io.File;

public abstract class a {
    @DoNotInline
    public static File a(Context context0) {
        return context0.getCodeCacheDir();
    }

    @DoNotInline
    public static Drawable b(Context context0, int v) {
        return context0.getDrawable(v);
    }

    @DoNotInline
    public static File c(Context context0) {
        return context0.getNoBackupFilesDir();
    }
}

