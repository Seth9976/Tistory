package androidx.webkit.internal;

import android.content.Context;
import android.net.Uri;
import android.webkit.SafeBrowsingResponse;
import android.webkit.ValueCallback;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import java.util.List;

@RequiresApi(27)
public class ApiHelperForOMR1 {
    @DoNotInline
    public static void backToSafety(@NonNull SafeBrowsingResponse safeBrowsingResponse0, boolean z) {
        e.g(safeBrowsingResponse0, z);
    }

    @DoNotInline
    @NonNull
    public static Uri getSafeBrowsingPrivacyPolicyUrl() {
        return e.b();
    }

    @DoNotInline
    public static void proceed(@NonNull SafeBrowsingResponse safeBrowsingResponse0, boolean z) {
        e.j(safeBrowsingResponse0, z);
    }

    @DoNotInline
    public static void setSafeBrowsingWhitelist(@NonNull List list0, @Nullable ValueCallback valueCallback0) {
        e.h(list0, valueCallback0);
    }

    @DoNotInline
    public static void showInterstitial(@NonNull SafeBrowsingResponse safeBrowsingResponse0, boolean z) {
        e.i(safeBrowsingResponse0, z);
    }

    @DoNotInline
    public static void startSafeBrowsing(@NonNull Context context0, @Nullable ValueCallback valueCallback0) {
        e.f(context0, valueCallback0);
    }
}

