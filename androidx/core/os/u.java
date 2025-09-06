package androidx.core.os;

import android.content.Context;
import android.os.UserManager;
import androidx.annotation.DoNotInline;

public abstract class u {
    @DoNotInline
    public static boolean a(Context context0) {
        return ((UserManager)context0.getSystemService(UserManager.class)).isUserUnlocked();
    }
}

