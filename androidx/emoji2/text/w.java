package androidx.emoji2.text;

import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Looper;
import androidx.core.provider.FontRequest;
import androidx.core.provider.FontsContractCompat.FontFamilyResult;
import androidx.core.provider.FontsContractCompat.FontInfo;
import androidx.core.util.Preconditions;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public final class w implements MetadataRepoLoader {
    public final Context a;
    public final FontRequest b;
    public final FontProviderHelper c;
    public final Object d;
    public Handler e;
    public Executor f;
    public ThreadPoolExecutor g;
    public RetryPolicy h;
    public MetadataRepoLoaderCallback i;
    public v j;
    public u k;

    public w(Context context0, FontRequest fontRequest0, FontProviderHelper fontRequestEmojiCompatConfig$FontProviderHelper0) {
        this.d = new Object();
        Preconditions.checkNotNull(context0, "Context cannot be null");
        Preconditions.checkNotNull(fontRequest0, "FontRequest cannot be null");
        this.a = context0.getApplicationContext();
        this.b = fontRequest0;
        this.c = fontRequestEmojiCompatConfig$FontProviderHelper0;
    }

    public final void a() {
        synchronized(this.d) {
            this.i = null;
            v v1 = this.j;
            if(v1 != null) {
                this.c.unregisterObserver(this.a, v1);
                this.j = null;
            }
            Handler handler0 = this.e;
            if(handler0 != null) {
                handler0.removeCallbacks(this.k);
            }
            this.e = null;
            ThreadPoolExecutor threadPoolExecutor0 = this.g;
            if(threadPoolExecutor0 != null) {
                threadPoolExecutor0.shutdown();
            }
            this.f = null;
            this.g = null;
        }
    }

    public final void b() {
        synchronized(this.d) {
            if(this.i == null) {
                return;
            }
            if(this.f == null) {
                b b0 = new b("emojiCompat");
                ThreadPoolExecutor threadPoolExecutor0 = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), b0);
                threadPoolExecutor0.allowCoreThreadTimeOut(true);
                this.g = threadPoolExecutor0;
                this.f = threadPoolExecutor0;
            }
            this.f.execute(new u(this, 0));
        }
    }

    public final FontInfo c() {
        FontFamilyResult fontsContractCompat$FontFamilyResult0;
        try {
            fontsContractCompat$FontFamilyResult0 = this.c.fetchFonts(this.a, this.b);
        }
        catch(PackageManager.NameNotFoundException packageManager$NameNotFoundException0) {
            throw new RuntimeException("provider not found", packageManager$NameNotFoundException0);
        }
        if(fontsContractCompat$FontFamilyResult0.getStatusCode() != 0) {
            throw new RuntimeException("fetchFonts failed (" + fontsContractCompat$FontFamilyResult0.getStatusCode() + ")");
        }
        FontInfo[] arr_fontsContractCompat$FontInfo = fontsContractCompat$FontFamilyResult0.getFonts();
        if(arr_fontsContractCompat$FontInfo == null || arr_fontsContractCompat$FontInfo.length == 0) {
            throw new RuntimeException("fetchFonts failed (empty result)");
        }
        return arr_fontsContractCompat$FontInfo[0];
    }

    public final void d(Uri uri0, long v) {
        synchronized(this.d) {
            Handler handler0 = this.e;
            if(handler0 == null) {
                handler0 = Build.VERSION.SDK_INT < 28 ? new Handler(Looper.getMainLooper()) : c.a(Looper.getMainLooper());
                this.e = handler0;
            }
            if(this.j == null) {
                v v2 = new v(this, handler0);
                this.j = v2;
                this.c.registerObserver(this.a, uri0, v2);
            }
            if(this.k == null) {
                this.k = new u(this, 1);
            }
            handler0.postDelayed(this.k, v);
        }
    }

    @Override  // androidx.emoji2.text.EmojiCompat$MetadataRepoLoader
    public final void load(MetadataRepoLoaderCallback emojiCompat$MetadataRepoLoaderCallback0) {
        Preconditions.checkNotNull(emojiCompat$MetadataRepoLoaderCallback0, "LoaderCallback cannot be null");
        synchronized(this.d) {
            this.i = emojiCompat$MetadataRepoLoaderCallback0;
        }
        this.b();
    }
}

