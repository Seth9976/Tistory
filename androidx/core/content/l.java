package androidx.core.content;

import android.content.Intent;
import androidx.annotation.DoNotInline;

public abstract class l {
    @DoNotInline
    public static String a(Intent intent0) {
        return intent0.getIdentifier();
    }

    @DoNotInline
    public static Intent b(Intent intent0, String s) {
        return intent0.setIdentifier(s);
    }
}

