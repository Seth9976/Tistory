package androidx.core.content;

import android.content.Context;
import androidx.annotation.DoNotInline;
import java.util.concurrent.Executor;

public abstract class e {
    @DoNotInline
    public static Executor a(Context context0) {
        return context0.getMainExecutor();
    }
}

