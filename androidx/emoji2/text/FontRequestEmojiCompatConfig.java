package androidx.emoji2.text;

import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import android.database.ContentObserver;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Handler;
import android.os.SystemClock;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.core.provider.FontRequest;
import androidx.core.provider.FontsContractCompat.FontFamilyResult;
import androidx.core.provider.FontsContractCompat.FontInfo;
import androidx.core.provider.FontsContractCompat;
import java.util.concurrent.Executor;

public class FontRequestEmojiCompatConfig extends Config {
    public static class ExponentialBackoffRetryPolicy extends RetryPolicy {
        public final long a;
        public long b;

        public ExponentialBackoffRetryPolicy(long v) {
            this.a = v;
        }

        @Override  // androidx.emoji2.text.FontRequestEmojiCompatConfig$RetryPolicy
        public long getRetryDelay() {
            if(this.b == 0L) {
                this.b = SystemClock.uptimeMillis();
                return 0L;
            }
            long v = SystemClock.uptimeMillis() - this.b;
            return v <= this.a ? Math.min(Math.max(v, 1000L), this.a - v) : -1L;
        }
    }

    @RestrictTo({Scope.LIBRARY})
    public static class FontProviderHelper {
        @Nullable
        public Typeface buildTypeface(@NonNull Context context0, @NonNull FontInfo fontsContractCompat$FontInfo0) throws PackageManager.NameNotFoundException {
            return FontsContractCompat.buildTypeface(context0, null, new FontInfo[]{fontsContractCompat$FontInfo0});
        }

        @NonNull
        public FontFamilyResult fetchFonts(@NonNull Context context0, @NonNull FontRequest fontRequest0) throws PackageManager.NameNotFoundException {
            return FontsContractCompat.fetchFonts(context0, null, fontRequest0);
        }

        public void registerObserver(@NonNull Context context0, @NonNull Uri uri0, @NonNull ContentObserver contentObserver0) {
            context0.getContentResolver().registerContentObserver(uri0, false, contentObserver0);
        }

        public void unregisterObserver(@NonNull Context context0, @NonNull ContentObserver contentObserver0) {
            context0.getContentResolver().unregisterContentObserver(contentObserver0);
        }
    }

    public static abstract class RetryPolicy {
        public abstract long getRetryDelay();
    }

    public static final FontProviderHelper k;

    static {
        FontRequestEmojiCompatConfig.k = new FontProviderHelper();
    }

    public FontRequestEmojiCompatConfig(@NonNull Context context0, @NonNull FontRequest fontRequest0) {
        super(new w(context0, fontRequest0, FontRequestEmojiCompatConfig.k));
    }

    @RestrictTo({Scope.LIBRARY})
    public FontRequestEmojiCompatConfig(@NonNull Context context0, @NonNull FontRequest fontRequest0, @NonNull FontProviderHelper fontRequestEmojiCompatConfig$FontProviderHelper0) {
        super(new w(context0, fontRequest0, fontRequestEmojiCompatConfig$FontProviderHelper0));
    }

    @NonNull
    @Deprecated
    public FontRequestEmojiCompatConfig setHandler(@Nullable Handler handler0) {
        if(handler0 == null) {
            return this;
        }
        this.setLoadingExecutor(new a(handler0, 0));
        return this;
    }

    @NonNull
    public FontRequestEmojiCompatConfig setLoadingExecutor(@NonNull Executor executor0) {
        w w0 = (w)this.getMetadataRepoLoader();
        synchronized(w0.d) {
            w0.f = executor0;
        }
        return this;
    }

    @NonNull
    public FontRequestEmojiCompatConfig setRetryPolicy(@Nullable RetryPolicy fontRequestEmojiCompatConfig$RetryPolicy0) {
        w w0 = (w)this.getMetadataRepoLoader();
        synchronized(w0.d) {
            w0.h = fontRequestEmojiCompatConfig$RetryPolicy0;
        }
        return this;
    }
}

