package androidx.emoji2.text;

import android.graphics.Typeface;
import androidx.core.graphics.TypefaceCompatUtil;
import androidx.core.os.TraceCompat;
import androidx.core.provider.FontsContractCompat.FontInfo;
import java.nio.ByteBuffer;

public final class u implements Runnable {
    public final int a;
    public final w b;

    public u(w w0, int v) {
        this.a = v;
        this.b = w0;
        super();
    }

    @Override
    public final void run() {
        if(this.a != 0) {
            this.b.b();
            return;
        }
        w w0 = this.b;
        synchronized(w0.d) {
            if(w0.i == null) {
                return;
            }
        }
        try {
            FontInfo fontsContractCompat$FontInfo0 = w0.c();
            int v = fontsContractCompat$FontInfo0.getResultCode();
            if(v == 2) {
                synchronized(w0.d) {
                    RetryPolicy fontRequestEmojiCompatConfig$RetryPolicy0 = w0.h;
                    if(fontRequestEmojiCompatConfig$RetryPolicy0 != null) {
                        long v2 = fontRequestEmojiCompatConfig$RetryPolicy0.getRetryDelay();
                        if(v2 >= 0L) {
                            w0.d(fontsContractCompat$FontInfo0.getUri(), v2);
                            return;
                        }
                    }
                }
            }
            if(v != 0) {
                throw new RuntimeException("fetchFonts result is not OK. (" + v + ")");
            }
            try {
                TraceCompat.beginSection("EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface");
                Typeface typeface0 = w0.c.buildTypeface(w0.a, fontsContractCompat$FontInfo0);
                ByteBuffer byteBuffer0 = TypefaceCompatUtil.mmap(w0.a, null, fontsContractCompat$FontInfo0.getUri());
                if(byteBuffer0 != null && typeface0 != null) {
                    MetadataRepo metadataRepo0 = MetadataRepo.create(typeface0, byteBuffer0);
                    synchronized(w0.d) {
                        MetadataRepoLoaderCallback emojiCompat$MetadataRepoLoaderCallback0 = w0.i;
                        if(emojiCompat$MetadataRepoLoaderCallback0 != null) {
                            emojiCompat$MetadataRepoLoaderCallback0.onLoaded(metadataRepo0);
                        }
                    }
                    w0.a();
                    return;
                }
            }
            finally {
                TraceCompat.endSection();
            }
            throw new RuntimeException("Unable to open file.");
        }
        catch(Throwable throwable0) {
            synchronized(w0.d) {
                MetadataRepoLoaderCallback emojiCompat$MetadataRepoLoaderCallback1 = w0.i;
                if(emojiCompat$MetadataRepoLoaderCallback1 != null) {
                    emojiCompat$MetadataRepoLoaderCallback1.onFailed(throwable0);
                }
            }
            w0.a();
        }
    }
}

