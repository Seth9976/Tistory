package androidx.core.app;

import android.app.RemoteInput.Builder;
import android.content.Intent;
import androidx.annotation.DoNotInline;
import java.util.Map;
import java.util.Set;

public abstract class z2 {
    @DoNotInline
    public static void a(RemoteInput remoteInput0, Intent intent0, Map map0) {
        android.app.RemoteInput.addDataResultToIntent(RemoteInput.a(remoteInput0), intent0, map0);
    }

    @DoNotInline
    public static Set b(Object object0) {
        return ((android.app.RemoteInput)object0).getAllowedDataTypes();
    }

    @DoNotInline
    public static Map c(Intent intent0, String s) {
        return android.app.RemoteInput.getDataResultsFromIntent(intent0, s);
    }

    @DoNotInline
    public static RemoteInput.Builder d(RemoteInput.Builder remoteInput$Builder0, String s, boolean z) {
        return remoteInput$Builder0.setAllowDataType(s, z);
    }
}

