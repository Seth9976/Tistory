package androidx.core.os;

import android.os.UserHandle;
import androidx.annotation.NonNull;

public abstract class t {
    @NonNull
    public static UserHandle a(int v) {
        return UserHandle.getUserHandleForUid(v);
    }
}

