package androidx.emoji2.text;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.DoNotInline;

public abstract class c {
    @DoNotInline
    public static Handler a(Looper looper0) {
        return Handler.createAsync(looper0);
    }
}

