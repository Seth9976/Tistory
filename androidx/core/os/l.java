package androidx.core.os;

import android.os.Message;
import androidx.annotation.DoNotInline;

public abstract class l {
    @DoNotInline
    public static boolean a(Message message0) {
        return message0.isAsynchronous();
    }

    @DoNotInline
    public static void b(Message message0, boolean z) {
        message0.setAsynchronous(z);
    }
}

