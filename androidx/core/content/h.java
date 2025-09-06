package androidx.core.content;

import android.content.Context;
import androidx.annotation.DoNotInline;
import java.io.File;

public abstract class h {
    @DoNotInline
    public static File[] a(Context context0) {
        return context0.getExternalMediaDirs();
    }
}

