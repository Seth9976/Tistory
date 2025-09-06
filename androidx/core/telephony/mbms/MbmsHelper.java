package androidx.core.telephony.mbms;

import android.content.Context;
import android.os.Build.VERSION;
import android.telephony.mbms.ServiceInfo;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.os.h;

public final class MbmsHelper {
    @Nullable
    public static CharSequence getBestNameForService(@NonNull Context context0, @NonNull ServiceInfo serviceInfo0) {
        return Build.VERSION.SDK_INT < 28 ? null : h.d(context0, serviceInfo0);
    }
}

