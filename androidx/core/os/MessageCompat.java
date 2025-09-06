package androidx.core.os;

import android.annotation.SuppressLint;
import android.os.Message;
import androidx.annotation.NonNull;

public final class MessageCompat {
    @SuppressLint({"NewApi"})
    public static boolean isAsynchronous(@NonNull Message message0) {
        return l.a(message0);
    }

    @SuppressLint({"NewApi"})
    public static void setAsynchronous(@NonNull Message message0, boolean z) {
        l.b(message0, z);
    }
}

