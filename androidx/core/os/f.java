package androidx.core.os;

import android.os.Environment;
import androidx.annotation.DoNotInline;
import java.io.File;

public abstract class f {
    @DoNotInline
    public static String a(File file0) {
        return Environment.getExternalStorageState(file0);
    }
}

