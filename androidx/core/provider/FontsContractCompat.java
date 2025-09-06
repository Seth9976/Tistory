package androidx.core.provider;

import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.Handler;
import android.provider.BaseColumns;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.core.content.res.ResourcesCompat.FontCallback;
import androidx.core.graphics.TypefaceCompat.ResourcesCallbackAdapter;
import androidx.core.graphics.TypefaceCompat;
import androidx.core.graphics.TypefaceCompatUtil;
import androidx.core.util.Preconditions;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class FontsContractCompat {
    public static final class Columns implements BaseColumns {
        public static final String FILE_ID = "file_id";
        public static final String ITALIC = "font_italic";
        public static final String RESULT_CODE = "result_code";
        public static final int RESULT_CODE_FONT_NOT_FOUND = 1;
        public static final int RESULT_CODE_FONT_UNAVAILABLE = 2;
        public static final int RESULT_CODE_MALFORMED_QUERY = 3;
        public static final int RESULT_CODE_OK = 0;
        public static final String TTC_INDEX = "font_ttc_index";
        public static final String VARIATION_SETTINGS = "font_variation_settings";
        public static final String WEIGHT = "font_weight";

    }

    public static class FontFamilyResult {
        public static final int STATUS_OK = 0;
        public static final int STATUS_UNEXPECTED_DATA_PROVIDED = 2;
        public static final int STATUS_WRONG_CERTIFICATES = 1;
        public final int a;
        public final FontInfo[] b;

        @RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
        @Deprecated
        public FontFamilyResult(int v, @Nullable FontInfo[] arr_fontsContractCompat$FontInfo) {
            this.a = v;
            this.b = arr_fontsContractCompat$FontInfo;
        }

        public FontInfo[] getFonts() {
            return this.b;
        }

        public int getStatusCode() {
            return this.a;
        }
    }

    public static class FontInfo {
        public final Uri a;
        public final int b;
        public final int c;
        public final boolean d;
        public final int e;

        @RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
        @Deprecated
        public FontInfo(@NonNull Uri uri0, @IntRange(from = 0L) int v, @IntRange(from = 1L, to = 1000L) int v1, boolean z, int v2) {
            this.a = (Uri)Preconditions.checkNotNull(uri0);
            this.b = v;
            this.c = v1;
            this.d = z;
            this.e = v2;
        }

        public int getResultCode() {
            return this.e;
        }

        @IntRange(from = 0L)
        public int getTtcIndex() {
            return this.b;
        }

        @NonNull
        public Uri getUri() {
            return this.a;
        }

        @IntRange(from = 1L, to = 1000L)
        public int getWeight() {
            return this.c;
        }

        public boolean isItalic() {
            return this.d;
        }
    }

    public static class FontRequestCallback {
        @RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
        @Retention(RetentionPolicy.SOURCE)
        public @interface FontRequestFailReason {
        }

        public static final int FAIL_REASON_FONT_LOAD_ERROR = -3;
        public static final int FAIL_REASON_FONT_NOT_FOUND = 1;
        public static final int FAIL_REASON_FONT_UNAVAILABLE = 2;
        public static final int FAIL_REASON_MALFORMED_QUERY = 3;
        public static final int FAIL_REASON_PROVIDER_NOT_FOUND = -1;
        public static final int FAIL_REASON_SECURITY_VIOLATION = -4;
        public static final int FAIL_REASON_WRONG_CERTIFICATES = -2;
        @RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
        @Deprecated
        public static final int RESULT_OK;

        public void onTypefaceRequestFailed(int v) {
        }

        public void onTypefaceRetrieved(Typeface typeface0) {
        }
    }

    @RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
    @Deprecated
    public static final String PARCEL_FONT_RESULTS = "font_results";

    @Nullable
    public static Typeface buildTypeface(@NonNull Context context0, @Nullable CancellationSignal cancellationSignal0, @NonNull FontInfo[] arr_fontsContractCompat$FontInfo) {
        return TypefaceCompat.createFromFontInfo(context0, cancellationSignal0, arr_fontsContractCompat$FontInfo, 0);
    }

    @NonNull
    public static FontFamilyResult fetchFonts(@NonNull Context context0, @Nullable CancellationSignal cancellationSignal0, @NonNull FontRequest fontRequest0) throws PackageManager.NameNotFoundException {
        return g.a(context0, cancellationSignal0, fontRequest0);
    }

    @RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
    @Deprecated
    public static Typeface getFontSync(Context context0, FontRequest fontRequest0, @Nullable FontCallback resourcesCompat$FontCallback0, @Nullable Handler handler0, boolean z, int v, int v1) {
        ResourcesCallbackAdapter typefaceCompat$ResourcesCallbackAdapter0 = new ResourcesCallbackAdapter(resourcesCompat$FontCallback0);
        return FontsContractCompat.requestFont(context0, fontRequest0, v1, z, v, FontCallback.getHandler(handler0), typefaceCompat$ResourcesCallbackAdapter0);
    }

    @Nullable
    @RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
    @VisibleForTesting
    @Deprecated
    public static ProviderInfo getProvider(@NonNull PackageManager packageManager0, @NonNull FontRequest fontRequest0, @Nullable Resources resources0) throws PackageManager.NameNotFoundException {
        return g.b(packageManager0, fontRequest0, resources0);
    }

    @RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
    @Deprecated
    public static Map prepareFontData(Context context0, FontInfo[] arr_fontsContractCompat$FontInfo, CancellationSignal cancellationSignal0) {
        return TypefaceCompatUtil.readFontInfoIntoByteBuffer(context0, arr_fontsContractCompat$FontInfo, cancellationSignal0);
    }

    @Nullable
    @RestrictTo({Scope.LIBRARY})
    public static Typeface requestFont(@NonNull Context context0, @NonNull FontRequest fontRequest0, int v, boolean z, @IntRange(from = 0L) int v1, @NonNull Handler handler0, @NonNull FontRequestCallback fontsContractCompat$FontRequestCallback0) {
        Object object0;
        Future future0;
        c c0 = new c(fontsContractCompat$FontRequestCallback0, handler0);
        if(z) {
            String s = fontRequest0.f + "-" + v;
            Typeface typeface0 = (Typeface)m.a.get(s);
            if(typeface0 != null) {
                handler0.post(new a(fontsContractCompat$FontRequestCallback0, typeface0));
                return typeface0;
            }
            if(v1 == -1) {
                l l0 = m.a(s, context0, fontRequest0, v);
                c0.a(l0);
                return l0.a;
            }
            h h0 = new h(s, context0, fontRequest0, v);
            try {
                future0 = m.b.submit(h0);
            }
            catch(InterruptedException unused_ex) {
                goto label_21;
            }
            try {
                object0 = future0.get(((long)v1), TimeUnit.MILLISECONDS);
                goto label_19;
            }
            catch(ExecutionException executionException0) {
            }
            catch(InterruptedException interruptedException0) {
                throw interruptedException0;
            }
            catch(TimeoutException unused_ex) {
                goto label_21;
            }
            try {
                throw new RuntimeException(executionException0);
            label_19:
                c0.a(((l)object0));
                return ((l)object0).a;
            }
            catch(InterruptedException unused_ex) {
            label_21:
                b b0 = new b(c0.a, -3);
                c0.b.post(b0);
                return null;
            }
        }
        return m.b(context0, fontRequest0, v, null, c0);
    }

    public static void requestFont(@NonNull Context context0, @NonNull FontRequest fontRequest0, @NonNull FontRequestCallback fontsContractCompat$FontRequestCallback0, @NonNull Handler handler0) {
        c c0 = new c(fontsContractCompat$FontRequestCallback0);
        p p0 = new p(handler0);
        m.b(context0.getApplicationContext(), fontRequest0, 0, p0, c0);
    }

    @RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
    @Deprecated
    public static void resetCache() {
        m.a.evictAll();
    }

    @RestrictTo({Scope.LIBRARY})
    @VisibleForTesting
    public static void resetTypefaceCache() {
        m.a.evictAll();
    }
}

